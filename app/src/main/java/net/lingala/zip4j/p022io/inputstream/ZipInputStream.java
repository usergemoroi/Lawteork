package net.lingala.zip4j.p022io.inputstream;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.zip.CRC32;
import kotlin.UByte;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderReader;
import net.lingala.zip4j.headers.HeaderSignature;
import net.lingala.zip4j.model.DataDescriptor;
import net.lingala.zip4j.model.ExtraDataRecord;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.LocalFileHeader;
import net.lingala.zip4j.model.Zip4jConfig;
import net.lingala.zip4j.model.enums.AesVersion;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.model.enums.EncryptionMethod;
import net.lingala.zip4j.util.InternalZipConstants;
import net.lingala.zip4j.util.Zip4jUtil;
/* renamed from: net.lingala.zip4j.io.inputstream.ZipInputStream */
/* loaded from: classes.dex */
public class ZipInputStream extends InputStream {
    private boolean canSkipExtendedLocalFileHeader;
    private CRC32 crc32;
    private DecompressedInputStream decompressedInputStream;
    private byte[] endOfEntryBuffer;
    private boolean entryEOFReached;
    private HeaderReader headerReader;
    private PushbackInputStream inputStream;
    private LocalFileHeader localFileHeader;
    private char[] password;
    private boolean streamClosed;
    private Zip4jConfig zip4jConfig;

    public ZipInputStream(InputStream inputStream) {
        this(inputStream, (char[]) null, (Charset) null);
    }

    public ZipInputStream(InputStream inputStream, Charset charset) {
        this(inputStream, (char[]) null, charset);
    }

    public ZipInputStream(InputStream inputStream, char[] password) {
        this(inputStream, password, (Charset) null);
    }

    public ZipInputStream(InputStream inputStream, char[] password, Charset charset) {
        this(inputStream, password, new Zip4jConfig(charset, 4096));
    }

    public ZipInputStream(InputStream inputStream, char[] password, Zip4jConfig zip4jConfig) {
        this.headerReader = new HeaderReader();
        this.crc32 = new CRC32();
        this.canSkipExtendedLocalFileHeader = false;
        this.streamClosed = false;
        this.entryEOFReached = false;
        if (zip4jConfig.getBufferSize() < 512) {
            throw new IllegalArgumentException("Buffer size cannot be less than 512 bytes");
        }
        this.inputStream = new PushbackInputStream(inputStream, zip4jConfig.getBufferSize());
        this.password = password;
        this.zip4jConfig = zip4jConfig;
    }

    public LocalFileHeader getNextEntry() throws IOException {
        return getNextEntry(null);
    }

    public LocalFileHeader getNextEntry(FileHeader fileHeader) throws IOException {
        if (this.localFileHeader != null) {
            readUntilEndOfEntry();
        }
        LocalFileHeader readLocalFileHeader = this.headerReader.readLocalFileHeader(this.inputStream, this.zip4jConfig.getCharset());
        this.localFileHeader = readLocalFileHeader;
        if (readLocalFileHeader == null) {
            return null;
        }
        verifyLocalFileHeader(readLocalFileHeader);
        this.crc32.reset();
        if (fileHeader != null) {
            this.localFileHeader.setCrc(fileHeader.getCrc());
            this.localFileHeader.setCompressedSize(fileHeader.getCompressedSize());
            this.localFileHeader.setUncompressedSize(fileHeader.getUncompressedSize());
            this.localFileHeader.setDirectory(fileHeader.isDirectory());
            this.canSkipExtendedLocalFileHeader = true;
        } else {
            this.canSkipExtendedLocalFileHeader = false;
        }
        this.decompressedInputStream = initializeEntryInputStream(this.localFileHeader);
        this.entryEOFReached = false;
        return this.localFileHeader;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] b = new byte[1];
        int readLen = read(b);
        if (readLen == -1) {
            return -1;
        }
        return b[0] & UByte.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public int read(byte[] b) throws IOException {
        return read(b, 0, b.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] b, int off, int len) throws IOException {
        if (this.streamClosed) {
            throw new IOException("Stream closed");
        }
        if (len < 0) {
            throw new IllegalArgumentException("Negative read length");
        }
        if (len == 0) {
            return 0;
        }
        LocalFileHeader localFileHeader = this.localFileHeader;
        if (localFileHeader == null || localFileHeader.isDirectory()) {
            return -1;
        }
        try {
            int readLen = this.decompressedInputStream.read(b, off, len);
            if (readLen == -1) {
                endOfCompressedDataReached();
            } else {
                this.crc32.update(b, off, readLen);
            }
            return readLen;
        } catch (IOException e) {
            if (isEncryptionMethodZipStandard(this.localFileHeader)) {
                throw new ZipException(e.getMessage(), e.getCause(), ZipException.Type.WRONG_PASSWORD);
            }
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.streamClosed) {
            return;
        }
        DecompressedInputStream decompressedInputStream = this.decompressedInputStream;
        if (decompressedInputStream != null) {
            decompressedInputStream.close();
        }
        this.streamClosed = true;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        assertStreamOpen();
        return !this.entryEOFReached ? 1 : 0;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    private void endOfCompressedDataReached() throws IOException {
        this.decompressedInputStream.pushBackInputStreamIfNecessary(this.inputStream);
        this.decompressedInputStream.endOfEntryReached(this.inputStream);
        readExtendedLocalFileHeaderIfPresent();
        verifyCrc();
        resetFields();
        this.entryEOFReached = true;
    }

    private DecompressedInputStream initializeEntryInputStream(LocalFileHeader localFileHeader) throws IOException {
        ZipEntryInputStream zipEntryInputStream = new ZipEntryInputStream(this.inputStream, getCompressedSize(localFileHeader));
        CipherInputStream cipherInputStream = initializeCipherInputStream(zipEntryInputStream, localFileHeader);
        return initializeDecompressorForThisEntry(cipherInputStream, localFileHeader);
    }

    private CipherInputStream initializeCipherInputStream(ZipEntryInputStream zipEntryInputStream, LocalFileHeader localFileHeader) throws IOException {
        if (!localFileHeader.isEncrypted()) {
            return new NoCipherInputStream(zipEntryInputStream, localFileHeader, this.password, this.zip4jConfig.getBufferSize());
        }
        if (localFileHeader.getEncryptionMethod() == EncryptionMethod.AES) {
            return new AesCipherInputStream(zipEntryInputStream, localFileHeader, this.password, this.zip4jConfig.getBufferSize());
        }
        if (localFileHeader.getEncryptionMethod() == EncryptionMethod.ZIP_STANDARD) {
            return new ZipStandardCipherInputStream(zipEntryInputStream, localFileHeader, this.password, this.zip4jConfig.getBufferSize());
        }
        String message = String.format("Entry [%s] Strong Encryption not supported", localFileHeader.getFileName());
        throw new ZipException(message, ZipException.Type.UNSUPPORTED_ENCRYPTION);
    }

    private DecompressedInputStream initializeDecompressorForThisEntry(CipherInputStream cipherInputStream, LocalFileHeader localFileHeader) {
        CompressionMethod compressionMethod = Zip4jUtil.getCompressionMethod(localFileHeader);
        if (compressionMethod == CompressionMethod.DEFLATE) {
            return new InflaterInputStream(cipherInputStream, this.zip4jConfig.getBufferSize());
        }
        return new StoreInputStream(cipherInputStream);
    }

    private void readExtendedLocalFileHeaderIfPresent() throws IOException {
        if (!this.localFileHeader.isDataDescriptorExists() || this.canSkipExtendedLocalFileHeader) {
            return;
        }
        DataDescriptor dataDescriptor = this.headerReader.readDataDescriptor(this.inputStream, checkIfZip64ExtraDataRecordPresentInLFH(this.localFileHeader.getExtraDataRecords()));
        this.localFileHeader.setCompressedSize(dataDescriptor.getCompressedSize());
        this.localFileHeader.setUncompressedSize(dataDescriptor.getUncompressedSize());
        this.localFileHeader.setCrc(dataDescriptor.getCrc());
    }

    private void verifyLocalFileHeader(LocalFileHeader localFileHeader) throws IOException {
        if (!isEntryDirectory(localFileHeader.getFileName()) && localFileHeader.getCompressionMethod() == CompressionMethod.STORE && localFileHeader.getUncompressedSize() < 0) {
            throw new IOException("Invalid local file header for: " + localFileHeader.getFileName() + ". Uncompressed size has to be set for entry of compression type store which is not a directory");
        }
    }

    private boolean checkIfZip64ExtraDataRecordPresentInLFH(List<ExtraDataRecord> extraDataRecords) {
        if (extraDataRecords == null) {
            return false;
        }
        for (ExtraDataRecord extraDataRecord : extraDataRecords) {
            if (extraDataRecord.getHeader() == HeaderSignature.ZIP64_EXTRA_FIELD_SIGNATURE.getValue()) {
                return true;
            }
        }
        return false;
    }

    private void verifyCrc() throws IOException {
        if ((this.localFileHeader.getEncryptionMethod() != EncryptionMethod.AES || !this.localFileHeader.getAesExtraDataRecord().getAesVersion().equals(AesVersion.TWO)) && this.localFileHeader.getCrc() != this.crc32.getValue()) {
            ZipException.Type exceptionType = ZipException.Type.CHECKSUM_MISMATCH;
            if (isEncryptionMethodZipStandard(this.localFileHeader)) {
                exceptionType = ZipException.Type.WRONG_PASSWORD;
            }
            throw new ZipException("Reached end of entry, but crc verification failed for " + this.localFileHeader.getFileName(), exceptionType);
        }
    }

    private void resetFields() {
        this.localFileHeader = null;
        this.crc32.reset();
    }

    private boolean isEntryDirectory(String entryName) {
        return entryName.endsWith(InternalZipConstants.ZIP_FILE_SEPARATOR) || entryName.endsWith("\\");
    }

    private long getCompressedSize(LocalFileHeader localFileHeader) {
        if (Zip4jUtil.getCompressionMethod(localFileHeader).equals(CompressionMethod.STORE)) {
            return localFileHeader.getUncompressedSize();
        }
        if (localFileHeader.isDataDescriptorExists() && !this.canSkipExtendedLocalFileHeader) {
            return -1L;
        }
        return localFileHeader.getCompressedSize() - getEncryptionHeaderSize(localFileHeader);
    }

    private int getEncryptionHeaderSize(LocalFileHeader localFileHeader) {
        if (localFileHeader.isEncrypted()) {
            if (localFileHeader.getEncryptionMethod().equals(EncryptionMethod.AES)) {
                return localFileHeader.getAesExtraDataRecord().getAesKeyStrength().getSaltLength() + 12;
            }
            return localFileHeader.getEncryptionMethod().equals(EncryptionMethod.ZIP_STANDARD) ? 12 : 0;
        }
        return 0;
    }

    private void readUntilEndOfEntry() throws IOException {
        if ((this.localFileHeader.isDirectory() || this.localFileHeader.getCompressedSize() == 0) && !this.localFileHeader.isDataDescriptorExists()) {
            return;
        }
        if (this.endOfEntryBuffer == null) {
            this.endOfEntryBuffer = new byte[512];
        }
        do {
        } while (read(this.endOfEntryBuffer) != -1);
        this.entryEOFReached = true;
    }

    private boolean isEncryptionMethodZipStandard(LocalFileHeader localFileHeader) {
        return localFileHeader.isEncrypted() && EncryptionMethod.ZIP_STANDARD.equals(localFileHeader.getEncryptionMethod());
    }

    private void assertStreamOpen() throws IOException {
        if (this.streamClosed) {
            throw new IOException("Stream closed");
        }
    }
}

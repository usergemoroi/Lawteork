package net.lingala.zip4j.p022io.inputstream;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import net.lingala.zip4j.crypto.AESDecrypter;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.AESExtraDataRecord;
import net.lingala.zip4j.model.LocalFileHeader;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.util.Zip4jUtil;
/* renamed from: net.lingala.zip4j.io.inputstream.AesCipherInputStream */
/* loaded from: classes.dex */
class AesCipherInputStream extends CipherInputStream<AESDecrypter> {
    private byte[] aes16ByteBlock;
    private int aes16ByteBlockPointer;
    private int aes16ByteBlockReadLength;
    private int bytesCopiedInThisIteration;
    private int lengthToCopyInThisIteration;
    private int lengthToRead;
    private int offsetWithAesBlock;
    private int remainingAes16ByteBlockLength;
    private byte[] singleByteBuffer;

    public AesCipherInputStream(ZipEntryInputStream zipEntryInputStream, LocalFileHeader localFileHeader, char[] password, int bufferSize) throws IOException {
        super(zipEntryInputStream, localFileHeader, password, bufferSize);
        this.singleByteBuffer = new byte[1];
        this.aes16ByteBlock = new byte[16];
        this.aes16ByteBlockPointer = 0;
        this.remainingAes16ByteBlockLength = 0;
        this.lengthToRead = 0;
        this.offsetWithAesBlock = 0;
        this.bytesCopiedInThisIteration = 0;
        this.lengthToCopyInThisIteration = 0;
        this.aes16ByteBlockReadLength = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // net.lingala.zip4j.p022io.inputstream.CipherInputStream
    public AESDecrypter initializeDecrypter(LocalFileHeader localFileHeader, char[] password) throws IOException {
        return new AESDecrypter(localFileHeader.getAesExtraDataRecord(), password, getSalt(localFileHeader), getPasswordVerifier());
    }

    @Override // net.lingala.zip4j.p022io.inputstream.CipherInputStream, java.io.InputStream
    public int read() throws IOException {
        int readLen = read(this.singleByteBuffer);
        if (readLen == -1) {
            return -1;
        }
        return this.singleByteBuffer[0];
    }

    @Override // net.lingala.zip4j.p022io.inputstream.CipherInputStream, java.io.InputStream
    public int read(byte[] b) throws IOException {
        return read(b, 0, b.length);
    }

    @Override // net.lingala.zip4j.p022io.inputstream.CipherInputStream, java.io.InputStream
    public int read(byte[] b, int off, int len) throws IOException {
        this.lengthToRead = len;
        this.offsetWithAesBlock = off;
        this.bytesCopiedInThisIteration = 0;
        if (this.remainingAes16ByteBlockLength != 0) {
            copyBytesFromBuffer(b, off);
            int i = this.bytesCopiedInThisIteration;
            if (i == len) {
                return i;
            }
        }
        if (this.lengthToRead < 16) {
            byte[] bArr = this.aes16ByteBlock;
            int read = super.read(bArr, 0, bArr.length);
            this.aes16ByteBlockReadLength = read;
            this.aes16ByteBlockPointer = 0;
            if (read == -1) {
                this.remainingAes16ByteBlockLength = 0;
                int i2 = this.bytesCopiedInThisIteration;
                if (i2 > 0) {
                    return i2;
                }
                return -1;
            }
            this.remainingAes16ByteBlockLength = read;
            copyBytesFromBuffer(b, this.offsetWithAesBlock);
            int i3 = this.bytesCopiedInThisIteration;
            if (i3 == len) {
                return i3;
            }
        }
        int i4 = this.offsetWithAesBlock;
        int i5 = this.lengthToRead;
        int readLen = super.read(b, i4, i5 - (i5 % 16));
        if (readLen == -1) {
            int i6 = this.bytesCopiedInThisIteration;
            if (i6 > 0) {
                return i6;
            }
            return -1;
        }
        return this.bytesCopiedInThisIteration + readLen;
    }

    private void copyBytesFromBuffer(byte[] b, int off) {
        int i = this.lengthToRead;
        int i2 = this.remainingAes16ByteBlockLength;
        if (i >= i2) {
            i = i2;
        }
        this.lengthToCopyInThisIteration = i;
        System.arraycopy(this.aes16ByteBlock, this.aes16ByteBlockPointer, b, off, i);
        incrementAesByteBlockPointer(this.lengthToCopyInThisIteration);
        decrementRemainingAesBytesLength(this.lengthToCopyInThisIteration);
        int i3 = this.bytesCopiedInThisIteration;
        int i4 = this.lengthToCopyInThisIteration;
        this.bytesCopiedInThisIteration = i3 + i4;
        this.lengthToRead -= i4;
        this.offsetWithAesBlock += i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.p022io.inputstream.CipherInputStream
    public void endOfEntryReached(InputStream inputStream) throws IOException {
        verifyContent(readStoredMac(inputStream));
    }

    private void verifyContent(byte[] storedMac) throws IOException {
        if (getLocalFileHeader().isDataDescriptorExists() && CompressionMethod.DEFLATE.equals(Zip4jUtil.getCompressionMethod(getLocalFileHeader()))) {
            return;
        }
        byte[] calculatedMac = getDecrypter().getCalculatedAuthenticationBytes();
        byte[] first10BytesOfCalculatedMac = new byte[10];
        System.arraycopy(calculatedMac, 0, first10BytesOfCalculatedMac, 0, 10);
        if (!Arrays.equals(storedMac, first10BytesOfCalculatedMac)) {
            throw new IOException("Reached end of data for this entry, but aes verification failed");
        }
    }

    protected byte[] readStoredMac(InputStream inputStream) throws IOException {
        byte[] storedMac = new byte[10];
        int readLen = Zip4jUtil.readFully(inputStream, storedMac);
        if (readLen != 10) {
            throw new ZipException("Invalid AES Mac bytes. Could not read sufficient data");
        }
        return storedMac;
    }

    private byte[] getSalt(LocalFileHeader localFileHeader) throws IOException {
        if (localFileHeader.getAesExtraDataRecord() == null) {
            throw new IOException("invalid aes extra data record");
        }
        AESExtraDataRecord aesExtraDataRecord = localFileHeader.getAesExtraDataRecord();
        byte[] saltBytes = new byte[aesExtraDataRecord.getAesKeyStrength().getSaltLength()];
        readRaw(saltBytes);
        return saltBytes;
    }

    private byte[] getPasswordVerifier() throws IOException {
        byte[] pvBytes = new byte[2];
        readRaw(pvBytes);
        return pvBytes;
    }

    private void incrementAesByteBlockPointer(int incrementBy) {
        int i = this.aes16ByteBlockPointer + incrementBy;
        this.aes16ByteBlockPointer = i;
        if (i >= 15) {
            this.aes16ByteBlockPointer = 15;
        }
    }

    private void decrementRemainingAesBytesLength(int decrementBy) {
        int i = this.remainingAes16ByteBlockLength - decrementBy;
        this.remainingAes16ByteBlockLength = i;
        if (i <= 0) {
            this.remainingAes16ByteBlockLength = 0;
        }
    }
}

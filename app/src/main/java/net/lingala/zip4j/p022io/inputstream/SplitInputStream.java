package net.lingala.zip4j.p022io.inputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.enums.RandomAccessFileMode;
/* renamed from: net.lingala.zip4j.io.inputstream.SplitInputStream */
/* loaded from: classes.dex */
public abstract class SplitInputStream extends InputStream {
    private int currentSplitFileCounter;
    private boolean isSplitZipArchive;
    protected RandomAccessFile randomAccessFile;
    private byte[] singleByteArray = new byte[1];
    protected File zipFile;

    protected abstract File getNextSplitFile(int i) throws IOException;

    public SplitInputStream(File zipFile, boolean isSplitZipArchive, int lastSplitZipFileNumber) throws FileNotFoundException {
        this.currentSplitFileCounter = 0;
        this.randomAccessFile = new RandomAccessFile(zipFile, RandomAccessFileMode.READ.getValue());
        this.zipFile = zipFile;
        this.isSplitZipArchive = isSplitZipArchive;
        if (isSplitZipArchive) {
            this.currentSplitFileCounter = lastSplitZipFileNumber;
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int readLen = read(this.singleByteArray);
        if (readLen == -1) {
            return -1;
        }
        return this.singleByteArray[0];
    }

    @Override // java.io.InputStream
    public int read(byte[] b) throws IOException {
        return read(b, 0, b.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] b, int off, int len) throws IOException {
        int readLen = this.randomAccessFile.read(b, off, len);
        if ((readLen != len || readLen == -1) && this.isSplitZipArchive) {
            openRandomAccessFileForIndex(this.currentSplitFileCounter + 1);
            this.currentSplitFileCounter++;
            if (readLen < 0) {
                readLen = 0;
            }
            int newlyRead = this.randomAccessFile.read(b, readLen, len - readLen);
            return newlyRead > 0 ? readLen + newlyRead : readLen;
        }
        return readLen;
    }

    public void prepareExtractionForFileHeader(FileHeader fileHeader) throws IOException {
        if (this.isSplitZipArchive && this.currentSplitFileCounter != fileHeader.getDiskNumberStart()) {
            openRandomAccessFileForIndex(fileHeader.getDiskNumberStart());
            this.currentSplitFileCounter = fileHeader.getDiskNumberStart();
        }
        this.randomAccessFile.seek(fileHeader.getOffsetLocalHeader());
    }

    protected void openRandomAccessFileForIndex(int zipFileIndex) throws IOException {
        File nextSplitFile = getNextSplitFile(zipFileIndex);
        if (!nextSplitFile.exists()) {
            throw new FileNotFoundException("zip split file does not exist: " + nextSplitFile);
        }
        this.randomAccessFile.close();
        this.randomAccessFile = new RandomAccessFile(nextSplitFile, RandomAccessFileMode.READ.getValue());
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        RandomAccessFile randomAccessFile = this.randomAccessFile;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
    }
}

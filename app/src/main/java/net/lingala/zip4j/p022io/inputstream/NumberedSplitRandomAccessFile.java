package net.lingala.zip4j.p022io.inputstream;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import kotlin.UByte;
import net.lingala.zip4j.model.enums.RandomAccessFileMode;
import net.lingala.zip4j.util.FileUtils;
/* renamed from: net.lingala.zip4j.io.inputstream.NumberedSplitRandomAccessFile */
/* loaded from: classes.dex */
public class NumberedSplitRandomAccessFile extends RandomAccessFile {
    private File[] allSortedSplitFiles;
    private int currentOpenSplitFileCounter;
    private RandomAccessFile randomAccessFile;
    private String rwMode;
    private byte[] singleByteBuffer;
    private long splitLength;

    public NumberedSplitRandomAccessFile(String name, String mode) throws IOException {
        this(new File(name), mode);
    }

    public NumberedSplitRandomAccessFile(File file, String mode) throws IOException {
        this(file, mode, FileUtils.getAllSortedNumberedSplitFiles(file));
    }

    public NumberedSplitRandomAccessFile(File file, String mode, File[] allSortedSplitFiles) throws IOException {
        super(file, mode);
        this.singleByteBuffer = new byte[1];
        this.currentOpenSplitFileCounter = 0;
        super.close();
        if (RandomAccessFileMode.WRITE.getValue().equals(mode)) {
            throw new IllegalArgumentException("write mode is not allowed for NumberedSplitRandomAccessFile");
        }
        assertAllSplitFilesExist(allSortedSplitFiles);
        this.randomAccessFile = new RandomAccessFile(file, mode);
        this.allSortedSplitFiles = allSortedSplitFiles;
        this.splitLength = file.length();
        this.rwMode = mode;
    }

    @Override // java.io.RandomAccessFile
    public int read() throws IOException {
        int readLen = read(this.singleByteBuffer);
        if (readLen == -1) {
            return -1;
        }
        return this.singleByteBuffer[0] & UByte.MAX_VALUE;
    }

    @Override // java.io.RandomAccessFile
    public int read(byte[] b) throws IOException {
        return read(b, 0, b.length);
    }

    @Override // java.io.RandomAccessFile
    public int read(byte[] b, int off, int len) throws IOException {
        int readLen = this.randomAccessFile.read(b, off, len);
        if (readLen == -1) {
            int i = this.currentOpenSplitFileCounter;
            if (i == this.allSortedSplitFiles.length - 1) {
                return -1;
            }
            openRandomAccessFileForIndex(i + 1);
            return read(b, off, len);
        }
        return readLen;
    }

    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public void write(int b) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public void write(byte[] b) throws IOException {
        write(b, 0, b.length);
    }

    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public void write(byte[] b, int off, int len) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.RandomAccessFile
    public void seek(long pos) throws IOException {
        int splitPartOfPosition = (int) (pos / this.splitLength);
        if (splitPartOfPosition != this.currentOpenSplitFileCounter) {
            openRandomAccessFileForIndex(splitPartOfPosition);
        }
        this.randomAccessFile.seek(pos - (splitPartOfPosition * this.splitLength));
    }

    @Override // java.io.RandomAccessFile
    public long getFilePointer() throws IOException {
        return this.randomAccessFile.getFilePointer();
    }

    @Override // java.io.RandomAccessFile
    public long length() throws IOException {
        return this.randomAccessFile.length();
    }

    public void seekInCurrentPart(long pos) throws IOException {
        this.randomAccessFile.seek(pos);
    }

    public void openLastSplitFileForReading() throws IOException {
        openRandomAccessFileForIndex(this.allSortedSplitFiles.length - 1);
    }

    private void openRandomAccessFileForIndex(int splitCounter) throws IOException {
        if (this.currentOpenSplitFileCounter == splitCounter) {
            return;
        }
        if (splitCounter > this.allSortedSplitFiles.length - 1) {
            throw new IOException("split counter greater than number of split files");
        }
        RandomAccessFile randomAccessFile = this.randomAccessFile;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
        this.randomAccessFile = new RandomAccessFile(this.allSortedSplitFiles[splitCounter], this.rwMode);
        this.currentOpenSplitFileCounter = splitCounter;
    }

    private void assertAllSplitFilesExist(File[] allSortedSplitFiles) throws IOException {
        int splitCounter = 1;
        for (File splitFile : allSortedSplitFiles) {
            String fileExtension = FileUtils.getFileExtension(splitFile);
            try {
                if (splitCounter != Integer.parseInt(fileExtension)) {
                    throw new IOException("Split file number " + splitCounter + " does not exist");
                }
                splitCounter++;
            } catch (NumberFormatException e) {
                throw new IOException("Split file extension not in expected format. Found: " + fileExtension + " expected of format: .001, .002, etc");
            }
        }
    }
}

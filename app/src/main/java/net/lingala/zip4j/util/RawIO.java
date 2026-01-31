package net.lingala.zip4j.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import kotlin.UByte;
import net.lingala.zip4j.exception.ZipException;
/* loaded from: classes.dex */
public class RawIO {
    private final byte[] shortBuff = new byte[2];
    private final byte[] intBuff = new byte[4];
    private final byte[] longBuff = new byte[8];

    public long readLongLittleEndian(RandomAccessFile randomAccessFile) throws IOException {
        randomAccessFile.readFully(this.longBuff);
        return readLongLittleEndian(this.longBuff, 0);
    }

    public long readLongLittleEndian(RandomAccessFile randomAccessFile, int readLen) throws IOException {
        resetBytes(this.longBuff);
        randomAccessFile.readFully(this.longBuff, 0, readLen);
        return readLongLittleEndian(this.longBuff, 0);
    }

    public long readLongLittleEndian(InputStream inputStream) throws IOException {
        byte[] bArr = this.longBuff;
        readFully(inputStream, bArr, bArr.length);
        return readLongLittleEndian(this.longBuff, 0);
    }

    public long readLongLittleEndian(InputStream inputStream, int readLen) throws IOException {
        resetBytes(this.longBuff);
        readFully(inputStream, this.longBuff, readLen);
        return readLongLittleEndian(this.longBuff, 0);
    }

    public long readLongLittleEndian(byte[] array, int pos) {
        if (array.length - pos < 8) {
            resetBytes(this.longBuff);
        }
        System.arraycopy(array, pos, this.longBuff, 0, array.length < 8 ? array.length - pos : 8);
        byte[] bArr = this.longBuff;
        long temp = 0 | (bArr[7] & UByte.MAX_VALUE);
        return (((((((((((((temp << 8) | (bArr[6] & UByte.MAX_VALUE)) << 8) | (bArr[5] & UByte.MAX_VALUE)) << 8) | (bArr[4] & UByte.MAX_VALUE)) << 8) | (bArr[3] & UByte.MAX_VALUE)) << 8) | (bArr[2] & UByte.MAX_VALUE)) << 8) | (bArr[1] & UByte.MAX_VALUE)) << 8) | (bArr[0] & UByte.MAX_VALUE);
    }

    public int readIntLittleEndian(RandomAccessFile randomAccessFile) throws IOException {
        randomAccessFile.readFully(this.intBuff);
        return readIntLittleEndian(this.intBuff);
    }

    public int readIntLittleEndian(InputStream inputStream) throws IOException {
        readFully(inputStream, this.intBuff, 4);
        return readIntLittleEndian(this.intBuff);
    }

    public int readIntLittleEndian(byte[] b) {
        return readIntLittleEndian(b, 0);
    }

    public int readIntLittleEndian(byte[] b, int pos) {
        return (b[pos] & UByte.MAX_VALUE) | ((b[pos + 1] & UByte.MAX_VALUE) << 8) | (((b[pos + 2] & UByte.MAX_VALUE) | ((b[pos + 3] & UByte.MAX_VALUE) << 8)) << 16);
    }

    public int readShortLittleEndian(RandomAccessFile randomAccessFile) throws IOException {
        randomAccessFile.readFully(this.shortBuff);
        return readShortLittleEndian(this.shortBuff, 0);
    }

    public int readShortLittleEndian(InputStream inputStream) throws IOException {
        byte[] bArr = this.shortBuff;
        readFully(inputStream, bArr, bArr.length);
        return readShortLittleEndian(this.shortBuff, 0);
    }

    public int readShortLittleEndian(byte[] buff, int position) {
        return (buff[position] & UByte.MAX_VALUE) | ((buff[position + 1] & UByte.MAX_VALUE) << 8);
    }

    public void writeShortLittleEndian(OutputStream outputStream, int value) throws IOException {
        writeShortLittleEndian(this.shortBuff, 0, value);
        outputStream.write(this.shortBuff);
    }

    public void writeShortLittleEndian(byte[] array, int pos, int value) {
        array[pos + 1] = (byte) (value >>> 8);
        array[pos] = (byte) (value & 255);
    }

    public void writeIntLittleEndian(OutputStream outputStream, int value) throws IOException {
        writeIntLittleEndian(this.intBuff, 0, value);
        outputStream.write(this.intBuff);
    }

    public void writeIntLittleEndian(byte[] array, int pos, int value) {
        array[pos + 3] = (byte) (value >>> 24);
        array[pos + 2] = (byte) (value >>> 16);
        array[pos + 1] = (byte) (value >>> 8);
        array[pos] = (byte) (value & 255);
    }

    public void writeLongLittleEndian(OutputStream outputStream, long value) throws IOException {
        writeLongLittleEndian(this.longBuff, 0, value);
        outputStream.write(this.longBuff);
    }

    public void writeLongLittleEndian(byte[] array, int pos, long value) {
        array[pos + 7] = (byte) (value >>> 56);
        array[pos + 6] = (byte) (value >>> 48);
        array[pos + 5] = (byte) (value >>> 40);
        array[pos + 4] = (byte) (value >>> 32);
        array[pos + 3] = (byte) (value >>> 24);
        array[pos + 2] = (byte) (value >>> 16);
        array[pos + 1] = (byte) (value >>> 8);
        array[pos] = (byte) (255 & value);
    }

    private void readFully(InputStream inputStream, byte[] buff, int readLen) throws IOException {
        int actualReadLength = Zip4jUtil.readFully(inputStream, buff, 0, readLen);
        if (actualReadLength != readLen) {
            throw new ZipException("Could not fill buffer");
        }
    }

    private void resetBytes(byte[] b) {
        Arrays.fill(b, (byte) 0);
    }
}

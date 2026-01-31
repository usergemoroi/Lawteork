package net.lingala.zip4j.p022io.outputstream;

import java.io.IOException;
import java.util.zip.Deflater;
import net.lingala.zip4j.model.enums.CompressionLevel;
/* renamed from: net.lingala.zip4j.io.outputstream.DeflaterOutputStream */
/* loaded from: classes.dex */
class DeflaterOutputStream extends CompressedOutputStream {
    private byte[] buff;
    protected Deflater deflater;

    public DeflaterOutputStream(CipherOutputStream cipherOutputStream, CompressionLevel compressionLevel, int bufferSize) {
        super(cipherOutputStream);
        this.deflater = new Deflater(compressionLevel.getLevel(), true);
        this.buff = new byte[bufferSize];
    }

    @Override // net.lingala.zip4j.p022io.outputstream.CompressedOutputStream, java.io.OutputStream
    public void write(byte[] b) throws IOException {
        write(b, 0, b.length);
    }

    @Override // net.lingala.zip4j.p022io.outputstream.CompressedOutputStream, java.io.OutputStream
    public void write(int bval) throws IOException {
        byte[] b = {(byte) bval};
        write(b, 0, 1);
    }

    @Override // net.lingala.zip4j.p022io.outputstream.CompressedOutputStream, java.io.OutputStream
    public void write(byte[] buf, int off, int len) throws IOException {
        this.deflater.setInput(buf, off, len);
        while (!this.deflater.needsInput()) {
            deflate();
        }
    }

    private void deflate() throws IOException {
        Deflater deflater = this.deflater;
        byte[] bArr = this.buff;
        int len = deflater.deflate(bArr, 0, bArr.length);
        if (len > 0) {
            super.write(this.buff, 0, len);
        }
    }

    @Override // net.lingala.zip4j.p022io.outputstream.CompressedOutputStream
    public void closeEntry() throws IOException {
        if (!this.deflater.finished()) {
            this.deflater.finish();
            while (!this.deflater.finished()) {
                deflate();
            }
        }
        this.deflater.end();
        super.closeEntry();
    }
}

package net.lingala.zip4j.model;
/* loaded from: classes.dex */
public class DigitalSignature extends ZipHeader {
    private String signatureData;
    private int sizeOfData;

    public int getSizeOfData() {
        return this.sizeOfData;
    }

    public void setSizeOfData(int sizeOfData) {
        this.sizeOfData = sizeOfData;
    }

    public String getSignatureData() {
        return this.signatureData;
    }

    public void setSignatureData(String signatureData) {
        this.signatureData = signatureData;
    }
}

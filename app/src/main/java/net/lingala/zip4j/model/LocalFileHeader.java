package net.lingala.zip4j.model;

import net.lingala.zip4j.headers.HeaderSignature;
/* loaded from: classes.dex */
public class LocalFileHeader extends AbstractFileHeader {
    private byte[] extraField;
    private long offsetStartOfData;
    private boolean writeCompressedSizeInZip64ExtraRecord;

    public LocalFileHeader() {
        setSignature(HeaderSignature.LOCAL_FILE_HEADER);
    }

    public byte[] getExtraField() {
        return this.extraField;
    }

    public void setExtraField(byte[] extraField) {
        this.extraField = extraField;
    }

    public long getOffsetStartOfData() {
        return this.offsetStartOfData;
    }

    public void setOffsetStartOfData(long offsetStartOfData) {
        this.offsetStartOfData = offsetStartOfData;
    }

    public boolean isWriteCompressedSizeInZip64ExtraRecord() {
        return this.writeCompressedSizeInZip64ExtraRecord;
    }

    public void setWriteCompressedSizeInZip64ExtraRecord(boolean writeCompressedSizeInZip64ExtraRecord) {
        this.writeCompressedSizeInZip64ExtraRecord = writeCompressedSizeInZip64ExtraRecord;
    }
}

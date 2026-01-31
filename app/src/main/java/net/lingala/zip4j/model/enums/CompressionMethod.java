package net.lingala.zip4j.model.enums;

import net.lingala.zip4j.exception.ZipException;
/* loaded from: classes.dex */
public enum CompressionMethod {
    STORE(0),
    DEFLATE(8),
    AES_INTERNAL_ONLY(99);
    
    private int code;

    CompressionMethod(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public static CompressionMethod getCompressionMethodFromCode(int code) throws ZipException {
        CompressionMethod[] values;
        for (CompressionMethod compressionMethod : values()) {
            if (compressionMethod.getCode() == code) {
                return compressionMethod;
            }
        }
        throw new ZipException("Unknown compression method", ZipException.Type.UNKNOWN_COMPRESSION_METHOD);
    }
}

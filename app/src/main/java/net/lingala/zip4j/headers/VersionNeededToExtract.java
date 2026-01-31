package net.lingala.zip4j.headers;
/* loaded from: classes.dex */
public enum VersionNeededToExtract {
    DEFAULT(10),
    DEFLATE_COMPRESSED(20),
    ZIP_64_FORMAT(45),
    AES_ENCRYPTED(51);
    
    private final int code;

    VersionNeededToExtract(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }
}

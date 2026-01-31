package net.lingala.zip4j.exception;

import java.io.IOException;
/* loaded from: classes.dex */
public class ZipException extends IOException {
    private static final long serialVersionUID = 1;
    private Type type;

    /* loaded from: classes.dex */
    public enum Type {
        WRONG_PASSWORD,
        TASK_CANCELLED_EXCEPTION,
        CHECKSUM_MISMATCH,
        UNKNOWN_COMPRESSION_METHOD,
        FILE_NOT_FOUND,
        UNSUPPORTED_ENCRYPTION,
        UNKNOWN
    }

    public ZipException(String message) {
        super(message);
        this.type = Type.UNKNOWN;
    }

    public ZipException(Exception rootException) {
        super(rootException);
        this.type = Type.UNKNOWN;
    }

    public ZipException(String message, Exception rootException) {
        super(message, rootException);
        this.type = Type.UNKNOWN;
    }

    public ZipException(String message, Type type) {
        super(message);
        this.type = Type.UNKNOWN;
        this.type = type;
    }

    public ZipException(String message, Throwable throwable, Type type) {
        super(message, throwable);
        this.type = Type.UNKNOWN;
        this.type = type;
    }

    public Type getType() {
        return this.type;
    }
}

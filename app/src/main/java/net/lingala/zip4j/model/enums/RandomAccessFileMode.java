package net.lingala.zip4j.model.enums;
/* loaded from: classes.dex */
public enum RandomAccessFileMode {
    READ("r"),
    WRITE("rw");
    
    private String value;

    RandomAccessFileMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}

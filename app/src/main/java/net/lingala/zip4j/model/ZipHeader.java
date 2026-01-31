package net.lingala.zip4j.model;

import net.lingala.zip4j.headers.HeaderSignature;
/* loaded from: classes.dex */
public abstract class ZipHeader {
    private HeaderSignature signature;

    public HeaderSignature getSignature() {
        return this.signature;
    }

    public void setSignature(HeaderSignature signature) {
        this.signature = signature;
    }
}

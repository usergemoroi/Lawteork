package net.lingala.zip4j.model;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class CentralDirectory {
    private List<FileHeader> fileHeaders = new ArrayList();
    private DigitalSignature digitalSignature = new DigitalSignature();

    public List<FileHeader> getFileHeaders() {
        return this.fileHeaders;
    }

    public void setFileHeaders(List<FileHeader> fileHeaders) {
        this.fileHeaders = fileHeaders;
    }

    public DigitalSignature getDigitalSignature() {
        return this.digitalSignature;
    }

    public void setDigitalSignature(DigitalSignature digitalSignature) {
        this.digitalSignature = digitalSignature;
    }
}

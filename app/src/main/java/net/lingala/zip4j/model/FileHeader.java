package net.lingala.zip4j.model;

import net.lingala.zip4j.headers.HeaderSignature;
/* loaded from: classes.dex */
public class FileHeader extends AbstractFileHeader {
    private int diskNumberStart;
    private byte[] externalFileAttributes;
    private String fileComment;
    private int fileCommentLength = 0;
    private byte[] internalFileAttributes;
    private long offsetLocalHeader;
    private int versionMadeBy;

    public FileHeader() {
        setSignature(HeaderSignature.CENTRAL_DIRECTORY);
    }

    public int getVersionMadeBy() {
        return this.versionMadeBy;
    }

    public void setVersionMadeBy(int versionMadeBy) {
        this.versionMadeBy = versionMadeBy;
    }

    public int getFileCommentLength() {
        return this.fileCommentLength;
    }

    public void setFileCommentLength(int fileCommentLength) {
        this.fileCommentLength = fileCommentLength;
    }

    public int getDiskNumberStart() {
        return this.diskNumberStart;
    }

    public void setDiskNumberStart(int diskNumberStart) {
        this.diskNumberStart = diskNumberStart;
    }

    public byte[] getInternalFileAttributes() {
        return this.internalFileAttributes;
    }

    public void setInternalFileAttributes(byte[] internalFileAttributes) {
        this.internalFileAttributes = internalFileAttributes;
    }

    public byte[] getExternalFileAttributes() {
        return this.externalFileAttributes;
    }

    public void setExternalFileAttributes(byte[] externalFileAttributes) {
        this.externalFileAttributes = externalFileAttributes;
    }

    public long getOffsetLocalHeader() {
        return this.offsetLocalHeader;
    }

    public void setOffsetLocalHeader(long offsetLocalHeader) {
        this.offsetLocalHeader = offsetLocalHeader;
    }

    public String getFileComment() {
        return this.fileComment;
    }

    public void setFileComment(String fileComment) {
        this.fileComment = fileComment;
    }

    public String toString() {
        return getFileName();
    }
}

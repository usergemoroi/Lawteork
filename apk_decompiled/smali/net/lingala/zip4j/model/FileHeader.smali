.class public Lnet/lingala/zip4j/model/FileHeader;
.super Lnet/lingala/zip4j/model/AbstractFileHeader;
.source "FileHeader.java"


# instance fields
.field private diskNumberStart:I

.field private externalFileAttributes:[B

.field private fileComment:Ljava/lang/String;

.field private fileCommentLength:I

.field private internalFileAttributes:[B

.field private offsetLocalHeader:J

.field private versionMadeBy:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Lnet/lingala/zip4j/model/AbstractFileHeader;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Lnet/lingala/zip4j/model/FileHeader;->fileCommentLength:I

    .line 32
    sget-object v0, Lnet/lingala/zip4j/headers/HeaderSignature;->CENTRAL_DIRECTORY:Lnet/lingala/zip4j/headers/HeaderSignature;

    invoke-virtual {p0, v0}, Lnet/lingala/zip4j/model/FileHeader;->setSignature(Lnet/lingala/zip4j/headers/HeaderSignature;)V

    .line 33
    return-void
.end method


# virtual methods
.method public getDiskNumberStart()I
    .locals 1

    .line 52
    iget v0, p0, Lnet/lingala/zip4j/model/FileHeader;->diskNumberStart:I

    return v0
.end method

.method public getExternalFileAttributes()[B
    .locals 1

    .line 68
    iget-object v0, p0, Lnet/lingala/zip4j/model/FileHeader;->externalFileAttributes:[B

    return-object v0
.end method

.method public getFileComment()Ljava/lang/String;
    .locals 1

    .line 84
    iget-object v0, p0, Lnet/lingala/zip4j/model/FileHeader;->fileComment:Ljava/lang/String;

    return-object v0
.end method

.method public getFileCommentLength()I
    .locals 1

    .line 44
    iget v0, p0, Lnet/lingala/zip4j/model/FileHeader;->fileCommentLength:I

    return v0
.end method

.method public getInternalFileAttributes()[B
    .locals 1

    .line 60
    iget-object v0, p0, Lnet/lingala/zip4j/model/FileHeader;->internalFileAttributes:[B

    return-object v0
.end method

.method public getOffsetLocalHeader()J
    .locals 2

    .line 76
    iget-wide v0, p0, Lnet/lingala/zip4j/model/FileHeader;->offsetLocalHeader:J

    return-wide v0
.end method

.method public getVersionMadeBy()I
    .locals 1

    .line 36
    iget v0, p0, Lnet/lingala/zip4j/model/FileHeader;->versionMadeBy:I

    return v0
.end method

.method public setDiskNumberStart(I)V
    .locals 0
    .param p1, "diskNumberStart"    # I

    .line 56
    iput p1, p0, Lnet/lingala/zip4j/model/FileHeader;->diskNumberStart:I

    .line 57
    return-void
.end method

.method public setExternalFileAttributes([B)V
    .locals 0
    .param p1, "externalFileAttributes"    # [B

    .line 72
    iput-object p1, p0, Lnet/lingala/zip4j/model/FileHeader;->externalFileAttributes:[B

    .line 73
    return-void
.end method

.method public setFileComment(Ljava/lang/String;)V
    .locals 0
    .param p1, "fileComment"    # Ljava/lang/String;

    .line 88
    iput-object p1, p0, Lnet/lingala/zip4j/model/FileHeader;->fileComment:Ljava/lang/String;

    .line 89
    return-void
.end method

.method public setFileCommentLength(I)V
    .locals 0
    .param p1, "fileCommentLength"    # I

    .line 48
    iput p1, p0, Lnet/lingala/zip4j/model/FileHeader;->fileCommentLength:I

    .line 49
    return-void
.end method

.method public setInternalFileAttributes([B)V
    .locals 0
    .param p1, "internalFileAttributes"    # [B

    .line 64
    iput-object p1, p0, Lnet/lingala/zip4j/model/FileHeader;->internalFileAttributes:[B

    .line 65
    return-void
.end method

.method public setOffsetLocalHeader(J)V
    .locals 0
    .param p1, "offsetLocalHeader"    # J

    .line 80
    iput-wide p1, p0, Lnet/lingala/zip4j/model/FileHeader;->offsetLocalHeader:J

    .line 81
    return-void
.end method

.method public setVersionMadeBy(I)V
    .locals 0
    .param p1, "versionMadeBy"    # I

    .line 40
    iput p1, p0, Lnet/lingala/zip4j/model/FileHeader;->versionMadeBy:I

    .line 41
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 93
    invoke-virtual {p0}, Lnet/lingala/zip4j/model/FileHeader;->getFileName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

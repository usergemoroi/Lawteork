.class public Lnet/lingala/zip4j/io/inputstream/ZipStandardSplitInputStream;
.super Lnet/lingala/zip4j/io/inputstream/SplitInputStream;
.source "ZipStandardSplitInputStream.java"


# instance fields
.field private lastSplitZipFileNumber:I


# direct methods
.method public constructor <init>(Ljava/io/File;ZI)V
    .locals 0
    .param p1, "zipFile"    # Ljava/io/File;
    .param p2, "isSplitZipArchive"    # Z
    .param p3, "lastSplitZipFileNumber"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 15
    invoke-direct {p0, p1, p2, p3}, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;-><init>(Ljava/io/File;ZI)V

    .line 16
    iput p3, p0, Lnet/lingala/zip4j/io/inputstream/ZipStandardSplitInputStream;->lastSplitZipFileNumber:I

    .line 17
    return-void
.end method


# virtual methods
.method protected getNextSplitFile(I)Ljava/io/File;
    .locals 6
    .param p1, "zipFileIndex"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 21
    iget v0, p0, Lnet/lingala/zip4j/io/inputstream/ZipStandardSplitInputStream;->lastSplitZipFileNumber:I

    if-ne p1, v0, :cond_0

    .line 22
    iget-object v0, p0, Lnet/lingala/zip4j/io/inputstream/ZipStandardSplitInputStream;->zipFile:Ljava/io/File;

    return-object v0

    .line 25
    :cond_0
    iget-object v0, p0, Lnet/lingala/zip4j/io/inputstream/ZipStandardSplitInputStream;->zipFile:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v0

    .line 26
    .local v0, "currZipFileNameWithPath":Ljava/lang/String;
    const-string v1, ".z0"

    .line 27
    .local v1, "extensionSubString":Ljava/lang/String;
    const/16 v2, 0x9

    if-lt p1, v2, :cond_1

    .line 28
    const-string v1, ".z"

    .line 31
    :cond_1
    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    const-string v4, "."

    invoke-virtual {v0, v4}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v4

    .line 31
    const/4 v5, 0x0

    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    add-int/lit8 v4, p1, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    return-object v2
.end method

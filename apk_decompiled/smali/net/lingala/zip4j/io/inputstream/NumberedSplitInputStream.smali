.class public Lnet/lingala/zip4j/io/inputstream/NumberedSplitInputStream;
.super Lnet/lingala/zip4j/io/inputstream/SplitInputStream;
.source "NumberedSplitInputStream.java"


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

    .line 16
    invoke-direct {p0, p1, p2, p3}, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;-><init>(Ljava/io/File;ZI)V

    .line 17
    return-void
.end method


# virtual methods
.method protected getNextSplitFile(I)Ljava/io/File;
    .locals 5
    .param p1, "zipFileIndex"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 21
    iget-object v0, p0, Lnet/lingala/zip4j/io/inputstream/NumberedSplitInputStream;->zipFile:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v0

    .line 22
    .local v0, "currZipFileNameWithPath":Ljava/lang/String;
    nop

    .line 23
    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    .line 22
    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 24
    .local v1, "fileNameWithPathAndWithoutExtension":Ljava/lang/String;
    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {p1}, Lnet/lingala/zip4j/util/FileUtils;->getNextNumberedSplitFileCounterAsExtension(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    return-object v2
.end method

.class public abstract Lnet/lingala/zip4j/io/inputstream/SplitInputStream;
.super Ljava/io/InputStream;
.source "SplitInputStream.java"


# instance fields
.field private currentSplitFileCounter:I

.field private isSplitZipArchive:Z

.field protected randomAccessFile:Ljava/io/RandomAccessFile;

.field private singleByteArray:[B

.field protected zipFile:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;ZI)V
    .locals 2
    .param p1, "zipFile"    # Ljava/io/File;
    .param p2, "isSplitZipArchive"    # Z
    .param p3, "lastSplitZipFileNumber"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->currentSplitFileCounter:I

    .line 19
    const/4 v0, 0x1

    new-array v0, v0, [B

    iput-object v0, p0, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->singleByteArray:[B

    .line 22
    new-instance v0, Ljava/io/RandomAccessFile;

    sget-object v1, Lnet/lingala/zip4j/model/enums/RandomAccessFileMode;->READ:Lnet/lingala/zip4j/model/enums/RandomAccessFileMode;

    invoke-virtual {v1}, Lnet/lingala/zip4j/model/enums/RandomAccessFileMode;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->randomAccessFile:Ljava/io/RandomAccessFile;

    .line 23
    iput-object p1, p0, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->zipFile:Ljava/io/File;

    .line 24
    iput-boolean p2, p0, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->isSplitZipArchive:Z

    .line 27
    if-eqz p2, :cond_0

    .line 28
    iput p3, p0, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->currentSplitFileCounter:I

    .line 30
    :cond_0
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 86
    iget-object v0, p0, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->randomAccessFile:Ljava/io/RandomAccessFile;

    if-eqz v0, :cond_0

    .line 87
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    .line 89
    :cond_0
    return-void
.end method

.method protected abstract getNextSplitFile(I)Ljava/io/File;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method protected openRandomAccessFileForIndex(I)V
    .locals 4
    .param p1, "zipFileIndex"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 74
    invoke-virtual {p0, p1}, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->getNextSplitFile(I)Ljava/io/File;

    move-result-object v0

    .line 75
    .local v0, "nextSplitFile":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 78
    iget-object v1, p0, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->randomAccessFile:Ljava/io/RandomAccessFile;

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V

    .line 79
    new-instance v1, Ljava/io/RandomAccessFile;

    sget-object v2, Lnet/lingala/zip4j/model/enums/RandomAccessFileMode;->READ:Lnet/lingala/zip4j/model/enums/RandomAccessFileMode;

    invoke-virtual {v2}, Lnet/lingala/zip4j/model/enums/RandomAccessFileMode;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v1, p0, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->randomAccessFile:Ljava/io/RandomAccessFile;

    .line 80
    return-void

    .line 76
    :cond_0
    new-instance v1, Ljava/io/FileNotFoundException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "zip split file does not exist: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public prepareExtractionForFileHeader(Lnet/lingala/zip4j/model/FileHeader;)V
    .locals 3
    .param p1, "fileHeader"    # Lnet/lingala/zip4j/model/FileHeader;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 65
    iget-boolean v0, p0, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->isSplitZipArchive:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->currentSplitFileCounter:I

    invoke-virtual {p1}, Lnet/lingala/zip4j/model/FileHeader;->getDiskNumberStart()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 66
    invoke-virtual {p1}, Lnet/lingala/zip4j/model/FileHeader;->getDiskNumberStart()I

    move-result v0

    invoke-virtual {p0, v0}, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->openRandomAccessFileForIndex(I)V

    .line 67
    invoke-virtual {p1}, Lnet/lingala/zip4j/model/FileHeader;->getDiskNumberStart()I

    move-result v0

    iput v0, p0, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->currentSplitFileCounter:I

    .line 70
    :cond_0
    iget-object v0, p0, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->randomAccessFile:Ljava/io/RandomAccessFile;

    invoke-virtual {p1}, Lnet/lingala/zip4j/model/FileHeader;->getOffsetLocalHeader()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 71
    return-void
.end method

.method public read()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 34
    iget-object v0, p0, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->singleByteArray:[B

    invoke-virtual {p0, v0}, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->read([B)I

    move-result v0

    .line 35
    .local v0, "readLen":I
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 36
    return v1

    .line 39
    :cond_0
    iget-object v1, p0, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->singleByteArray:[B

    const/4 v2, 0x0

    aget-byte v1, v1, v2

    return v1
.end method

.method public read([B)I
    .locals 2
    .param p1, "b"    # [B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 44
    const/4 v0, 0x0

    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->read([BII)I

    move-result v0

    return v0
.end method

.method public read([BII)I
    .locals 3
    .param p1, "b"    # [B
    .param p2, "off"    # I
    .param p3, "len"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 49
    iget-object v0, p0, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->randomAccessFile:Ljava/io/RandomAccessFile;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/RandomAccessFile;->read([BII)I

    move-result v0

    .line 51
    .local v0, "readLen":I
    if-ne v0, p3, :cond_0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    :cond_0
    iget-boolean v1, p0, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->isSplitZipArchive:Z

    if-eqz v1, :cond_2

    .line 52
    iget v1, p0, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->currentSplitFileCounter:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p0, v1}, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->openRandomAccessFileForIndex(I)V

    .line 53
    iget v1, p0, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->currentSplitFileCounter:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->currentSplitFileCounter:I

    .line 55
    if-gez v0, :cond_1

    const/4 v0, 0x0

    .line 56
    :cond_1
    iget-object v1, p0, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->randomAccessFile:Ljava/io/RandomAccessFile;

    sub-int v2, p3, v0

    invoke-virtual {v1, p1, v0, v2}, Ljava/io/RandomAccessFile;->read([BII)I

    move-result v1

    .line 57
    .local v1, "newlyRead":I
    if-lez v1, :cond_2

    add-int/2addr v0, v1

    .line 60
    .end local v1    # "newlyRead":I
    :cond_2
    return v0
.end method

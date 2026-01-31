.class public Lnet/lingala/zip4j/tasks/ExtractFileTask;
.super Lnet/lingala/zip4j/tasks/AbstractExtractFileTask;
.source "ExtractFileTask.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/lingala/zip4j/tasks/AbstractExtractFileTask<",
        "Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;",
        ">;"
    }
.end annotation


# instance fields
.field private password:[C

.field private splitInputStream:Lnet/lingala/zip4j/io/inputstream/SplitInputStream;


# direct methods
.method public constructor <init>(Lnet/lingala/zip4j/model/ZipModel;[CLnet/lingala/zip4j/model/UnzipParameters;Lnet/lingala/zip4j/tasks/AsyncZipTask$AsyncTaskParameters;)V
    .locals 0
    .param p1, "zipModel"    # Lnet/lingala/zip4j/model/ZipModel;
    .param p2, "password"    # [C
    .param p3, "unzipParameters"    # Lnet/lingala/zip4j/model/UnzipParameters;
    .param p4, "asyncTaskParameters"    # Lnet/lingala/zip4j/tasks/AsyncZipTask$AsyncTaskParameters;

    .line 29
    invoke-direct {p0, p1, p3, p4}, Lnet/lingala/zip4j/tasks/AbstractExtractFileTask;-><init>(Lnet/lingala/zip4j/model/ZipModel;Lnet/lingala/zip4j/model/UnzipParameters;Lnet/lingala/zip4j/tasks/AsyncZipTask$AsyncTaskParameters;)V

    .line 30
    iput-object p2, p0, Lnet/lingala/zip4j/tasks/ExtractFileTask;->password:[C

    .line 31
    return-void
.end method

.method private createZipInputStream(Lnet/lingala/zip4j/model/FileHeader;Lnet/lingala/zip4j/model/Zip4jConfig;)Lnet/lingala/zip4j/io/inputstream/ZipInputStream;
    .locals 3
    .param p1, "fileHeader"    # Lnet/lingala/zip4j/model/FileHeader;
    .param p2, "zip4jConfig"    # Lnet/lingala/zip4j/model/Zip4jConfig;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 68
    invoke-virtual {p0}, Lnet/lingala/zip4j/tasks/ExtractFileTask;->getZipModel()Lnet/lingala/zip4j/model/ZipModel;

    move-result-object v0

    invoke-static {v0}, Lnet/lingala/zip4j/util/UnzipUtil;->createSplitInputStream(Lnet/lingala/zip4j/model/ZipModel;)Lnet/lingala/zip4j/io/inputstream/SplitInputStream;

    move-result-object v0

    iput-object v0, p0, Lnet/lingala/zip4j/tasks/ExtractFileTask;->splitInputStream:Lnet/lingala/zip4j/io/inputstream/SplitInputStream;

    .line 69
    invoke-virtual {v0, p1}, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->prepareExtractionForFileHeader(Lnet/lingala/zip4j/model/FileHeader;)V

    .line 70
    new-instance v0, Lnet/lingala/zip4j/io/inputstream/ZipInputStream;

    iget-object v1, p0, Lnet/lingala/zip4j/tasks/ExtractFileTask;->splitInputStream:Lnet/lingala/zip4j/io/inputstream/SplitInputStream;

    iget-object v2, p0, Lnet/lingala/zip4j/tasks/ExtractFileTask;->password:[C

    invoke-direct {v0, v1, v2, p2}, Lnet/lingala/zip4j/io/inputstream/ZipInputStream;-><init>(Ljava/io/InputStream;[CLnet/lingala/zip4j/model/Zip4jConfig;)V

    return-object v0
.end method

.method private determineNewFileName(Ljava/lang/String;Lnet/lingala/zip4j/model/FileHeader;Lnet/lingala/zip4j/model/FileHeader;)Ljava/lang/String;
    .locals 4
    .param p1, "newFileName"    # Ljava/lang/String;
    .param p2, "fileHeaderToExtract"    # Lnet/lingala/zip4j/model/FileHeader;
    .param p3, "fileHeaderBeingExtracted"    # Lnet/lingala/zip4j/model/FileHeader;

    .line 75
    invoke-static {p1}, Lnet/lingala/zip4j/util/Zip4jUtil;->isStringNotNullAndNotEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 76
    return-object p1

    .line 79
    :cond_0
    invoke-virtual {p2}, Lnet/lingala/zip4j/model/FileHeader;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_1

    .line 80
    return-object p1

    .line 83
    :cond_1
    const-string v0, "/"

    .line 84
    .local v0, "fileSeparator":Ljava/lang/String;
    const-string v1, "/"

    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 85
    const-string v0, ""

    .line 88
    :cond_2
    invoke-virtual {p3}, Lnet/lingala/zip4j/model/FileHeader;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lnet/lingala/zip4j/model/FileHeader;->getFileName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method private getFileHeadersToExtract(Lnet/lingala/zip4j/model/FileHeader;)Ljava/util/List;
    .locals 1
    .param p1, "rootFileHeader"    # Lnet/lingala/zip4j/model/FileHeader;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/lingala/zip4j/model/FileHeader;",
            ")",
            "Ljava/util/List<",
            "Lnet/lingala/zip4j/model/FileHeader;",
            ">;"
        }
    .end annotation

    .line 59
    invoke-virtual {p1}, Lnet/lingala/zip4j/model/FileHeader;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_0

    .line 60
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 63
    :cond_0
    nop

    .line 64
    invoke-virtual {p0}, Lnet/lingala/zip4j/tasks/ExtractFileTask;->getZipModel()Lnet/lingala/zip4j/model/ZipModel;

    move-result-object v0

    invoke-virtual {v0}, Lnet/lingala/zip4j/model/ZipModel;->getCentralDirectory()Lnet/lingala/zip4j/model/CentralDirectory;

    move-result-object v0

    invoke-virtual {v0}, Lnet/lingala/zip4j/model/CentralDirectory;->getFileHeaders()Ljava/util/List;

    move-result-object v0

    .line 63
    invoke-static {v0, p1}, Lnet/lingala/zip4j/headers/HeaderUtil;->getFileHeadersUnderDirectory(Ljava/util/List;Lnet/lingala/zip4j/model/FileHeader;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected bridge synthetic calculateTotalWork(Ljava/lang/Object;)J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/lingala/zip4j/exception/ZipException;
        }
    .end annotation

    .line 22
    check-cast p1, Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;

    invoke-virtual {p0, p1}, Lnet/lingala/zip4j/tasks/ExtractFileTask;->calculateTotalWork(Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;)J

    move-result-wide v0

    return-wide v0
.end method

.method protected calculateTotalWork(Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;)J
    .locals 3
    .param p1, "taskParameters"    # Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;

    .line 54
    invoke-static {p1}, Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;->access$000(Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;)Lnet/lingala/zip4j/model/FileHeader;

    move-result-object v0

    invoke-direct {p0, v0}, Lnet/lingala/zip4j/tasks/ExtractFileTask;->getFileHeadersToExtract(Lnet/lingala/zip4j/model/FileHeader;)Ljava/util/List;

    move-result-object v0

    .line 55
    .local v0, "fileHeadersUnderDirectory":Ljava/util/List;, "Ljava/util/List<Lnet/lingala/zip4j/model/FileHeader;>;"
    invoke-static {v0}, Lnet/lingala/zip4j/headers/HeaderUtil;->getTotalUncompressedSizeOfAllFileHeaders(Ljava/util/List;)J

    move-result-wide v1

    return-wide v1
.end method

.method protected bridge synthetic executeTask(Ljava/lang/Object;Lnet/lingala/zip4j/progress/ProgressMonitor;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 22
    check-cast p1, Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;

    invoke-virtual {p0, p1, p2}, Lnet/lingala/zip4j/tasks/ExtractFileTask;->executeTask(Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;Lnet/lingala/zip4j/progress/ProgressMonitor;)V

    return-void
.end method

.method protected executeTask(Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;Lnet/lingala/zip4j/progress/ProgressMonitor;)V
    .locals 11
    .param p1, "taskParameters"    # Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;
    .param p2, "progressMonitor"    # Lnet/lingala/zip4j/progress/ProgressMonitor;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 37
    nop

    .line 38
    :try_start_0
    invoke-static {p1}, Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;->access$000(Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;)Lnet/lingala/zip4j/model/FileHeader;

    move-result-object v0

    iget-object v1, p1, Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;->zip4jConfig:Lnet/lingala/zip4j/model/Zip4jConfig;

    invoke-direct {p0, v0, v1}, Lnet/lingala/zip4j/tasks/ExtractFileTask;->createZipInputStream(Lnet/lingala/zip4j/model/FileHeader;Lnet/lingala/zip4j/model/Zip4jConfig;)Lnet/lingala/zip4j/io/inputstream/ZipInputStream;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 37
    .local v0, "zipInputStream":Lnet/lingala/zip4j/io/inputstream/ZipInputStream;
    nop

    .line 39
    :try_start_1
    invoke-static {p1}, Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;->access$000(Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;)Lnet/lingala/zip4j/model/FileHeader;

    move-result-object v1

    invoke-direct {p0, v1}, Lnet/lingala/zip4j/tasks/ExtractFileTask;->getFileHeadersToExtract(Lnet/lingala/zip4j/model/FileHeader;)Ljava/util/List;

    move-result-object v1

    move-object v8, v1

    .line 40
    .local v8, "fileHeadersUnderDirectory":Ljava/util/List;, "Ljava/util/List<Lnet/lingala/zip4j/model/FileHeader;>;"
    iget-object v1, p1, Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;->zip4jConfig:Lnet/lingala/zip4j/model/Zip4jConfig;

    invoke-virtual {v1}, Lnet/lingala/zip4j/model/Zip4jConfig;->getBufferSize()I

    move-result v1

    new-array v7, v1, [B

    .line 41
    .local v7, "readBuff":[B
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/lingala/zip4j/model/FileHeader;

    move-object v10, v1

    .line 42
    .local v10, "fileHeader":Lnet/lingala/zip4j/model/FileHeader;
    invoke-static {p1}, Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;->access$100(Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;->access$000(Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;)Lnet/lingala/zip4j/model/FileHeader;

    move-result-object v2

    invoke-direct {p0, v1, v2, v10}, Lnet/lingala/zip4j/tasks/ExtractFileTask;->determineNewFileName(Ljava/lang/String;Lnet/lingala/zip4j/model/FileHeader;Lnet/lingala/zip4j/model/FileHeader;)Ljava/lang/String;

    move-result-object v5

    .line 43
    .local v5, "newFileName":Ljava/lang/String;
    invoke-static {p1}, Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;->access$200(Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;)Ljava/lang/String;

    move-result-object v4

    move-object v1, p0

    move-object v2, v0

    move-object v3, v10

    move-object v6, p2

    invoke-virtual/range {v1 .. v7}, Lnet/lingala/zip4j/tasks/ExtractFileTask;->extractFile(Lnet/lingala/zip4j/io/inputstream/ZipInputStream;Lnet/lingala/zip4j/model/FileHeader;Ljava/lang/String;Ljava/lang/String;Lnet/lingala/zip4j/progress/ProgressMonitor;[B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    .end local v5    # "newFileName":Ljava/lang/String;
    .end local v10    # "fileHeader":Lnet/lingala/zip4j/model/FileHeader;
    goto :goto_0

    .line 45
    .end local v7    # "readBuff":[B
    .end local v8    # "fileHeadersUnderDirectory":Ljava/util/List;, "Ljava/util/List<Lnet/lingala/zip4j/model/FileHeader;>;"
    :cond_0
    if-eqz v0, :cond_1

    :try_start_2
    invoke-virtual {v0}, Lnet/lingala/zip4j/io/inputstream/ZipInputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 46
    .end local v0    # "zipInputStream":Lnet/lingala/zip4j/io/inputstream/ZipInputStream;
    :cond_1
    iget-object v0, p0, Lnet/lingala/zip4j/tasks/ExtractFileTask;->splitInputStream:Lnet/lingala/zip4j/io/inputstream/SplitInputStream;

    if-eqz v0, :cond_2

    .line 47
    invoke-virtual {v0}, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->close()V

    .line 50
    :cond_2
    return-void

    .line 37
    .restart local v0    # "zipInputStream":Lnet/lingala/zip4j/io/inputstream/ZipInputStream;
    :catchall_0
    move-exception v1

    .end local v0    # "zipInputStream":Lnet/lingala/zip4j/io/inputstream/ZipInputStream;
    .end local p1    # "taskParameters":Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;
    .end local p2    # "progressMonitor":Lnet/lingala/zip4j/progress/ProgressMonitor;
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 45
    .restart local v0    # "zipInputStream":Lnet/lingala/zip4j/io/inputstream/ZipInputStream;
    .restart local p1    # "taskParameters":Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;
    .restart local p2    # "progressMonitor":Lnet/lingala/zip4j/progress/ProgressMonitor;
    :catchall_1
    move-exception v2

    if-eqz v0, :cond_3

    :try_start_4
    invoke-virtual {v0}, Lnet/lingala/zip4j/io/inputstream/ZipInputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception v3

    :try_start_5
    invoke-virtual {v1, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .end local p1    # "taskParameters":Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;
    .end local p2    # "progressMonitor":Lnet/lingala/zip4j/progress/ProgressMonitor;
    :cond_3
    :goto_1
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 46
    .end local v0    # "zipInputStream":Lnet/lingala/zip4j/io/inputstream/ZipInputStream;
    .restart local p1    # "taskParameters":Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;
    .restart local p2    # "progressMonitor":Lnet/lingala/zip4j/progress/ProgressMonitor;
    :catchall_3
    move-exception v0

    iget-object v1, p0, Lnet/lingala/zip4j/tasks/ExtractFileTask;->splitInputStream:Lnet/lingala/zip4j/io/inputstream/SplitInputStream;

    if-eqz v1, :cond_4

    .line 47
    invoke-virtual {v1}, Lnet/lingala/zip4j/io/inputstream/SplitInputStream;->close()V

    .line 49
    :cond_4
    throw v0
.end method

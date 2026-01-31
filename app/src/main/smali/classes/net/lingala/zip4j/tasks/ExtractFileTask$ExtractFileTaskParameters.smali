.class public Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;
.super Lnet/lingala/zip4j/tasks/AbstractZipTaskParameters;
.source "ExtractFileTask.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/lingala/zip4j/tasks/ExtractFileTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ExtractFileTaskParameters"
.end annotation


# instance fields
.field private fileHeader:Lnet/lingala/zip4j/model/FileHeader;

.field private newFileName:Ljava/lang/String;

.field private outputPath:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lnet/lingala/zip4j/model/FileHeader;Ljava/lang/String;Lnet/lingala/zip4j/model/Zip4jConfig;)V
    .locals 0
    .param p1, "outputPath"    # Ljava/lang/String;
    .param p2, "fileHeader"    # Lnet/lingala/zip4j/model/FileHeader;
    .param p3, "newFileName"    # Ljava/lang/String;
    .param p4, "zip4jConfig"    # Lnet/lingala/zip4j/model/Zip4jConfig;

    .line 99
    invoke-direct {p0, p4}, Lnet/lingala/zip4j/tasks/AbstractZipTaskParameters;-><init>(Lnet/lingala/zip4j/model/Zip4jConfig;)V

    .line 100
    iput-object p1, p0, Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;->outputPath:Ljava/lang/String;

    .line 101
    iput-object p2, p0, Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;->fileHeader:Lnet/lingala/zip4j/model/FileHeader;

    .line 102
    iput-object p3, p0, Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;->newFileName:Ljava/lang/String;

    .line 103
    return-void
.end method

.method static synthetic access$000(Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;)Lnet/lingala/zip4j/model/FileHeader;
    .locals 1
    .param p0, "x0"    # Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;

    .line 92
    iget-object v0, p0, Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;->fileHeader:Lnet/lingala/zip4j/model/FileHeader;

    return-object v0
.end method

.method static synthetic access$100(Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;

    .line 92
    iget-object v0, p0, Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;->newFileName:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$200(Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;

    .line 92
    iget-object v0, p0, Lnet/lingala/zip4j/tasks/ExtractFileTask$ExtractFileTaskParameters;->outputPath:Ljava/lang/String;

    return-object v0
.end method

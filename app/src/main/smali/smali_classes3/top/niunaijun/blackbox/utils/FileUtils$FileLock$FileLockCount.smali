.class Ltop/niunaijun/blackbox/utils/FileUtils$FileLock$FileLockCount;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/niunaijun/blackbox/utils/FileUtils$FileLock;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "FileLockCount"
.end annotation


# instance fields
.field fChannel:Ljava/nio/channels/FileChannel;

.field fOs:Ljava/io/RandomAccessFile;

.field mFileLock:Ljava/nio/channels/FileLock;

.field mRefCount:I

.field final synthetic this$0:Ltop/niunaijun/blackbox/utils/FileUtils$FileLock;


# direct methods
.method public constructor <init>(Ltop/niunaijun/blackbox/utils/FileUtils$FileLock;Ljava/nio/channels/FileLock;ILjava/io/RandomAccessFile;Ljava/nio/channels/FileChannel;)V
    .locals 0

    iput-object p1, p0, Ltop/niunaijun/blackbox/utils/FileUtils$FileLock$FileLockCount;->this$0:Ltop/niunaijun/blackbox/utils/FileUtils$FileLock;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ltop/niunaijun/blackbox/utils/FileUtils$FileLock$FileLockCount;->mFileLock:Ljava/nio/channels/FileLock;

    iput p3, p0, Ltop/niunaijun/blackbox/utils/FileUtils$FileLock$FileLockCount;->mRefCount:I

    iput-object p4, p0, Ltop/niunaijun/blackbox/utils/FileUtils$FileLock$FileLockCount;->fOs:Ljava/io/RandomAccessFile;

    iput-object p5, p0, Ltop/niunaijun/blackbox/utils/FileUtils$FileLock$FileLockCount;->fChannel:Ljava/nio/channels/FileChannel;

    return-void
.end method

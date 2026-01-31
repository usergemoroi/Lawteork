.class public Lcom/itsaky/androidide/logsender/utils/LogReader;
.super Ljava/lang/Thread;
.source "LogReader.java"


# instance fields
.field private final isInterrupted:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final packageName:Ljava/lang/String;

.field private final port:I

.field private final processBuilder:Ljava/lang/ProcessBuilder;

.field private final senderId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1
    .param p1, "senderId"    # Ljava/lang/String;
    .param p2, "packageName"    # Ljava/lang/String;
    .param p3, "port"    # I

    .line 44
    invoke-static {}, Lcom/itsaky/androidide/logsender/utils/LogReader;->defaultCmd()[Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/itsaky/androidide/logsender/utils/LogReader;-><init>(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/String;)V

    .line 45
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/String;)V
    .locals 2
    .param p1, "senderId"    # Ljava/lang/String;
    .param p2, "packageName"    # Ljava/lang/String;
    .param p3, "port"    # I
    .param p4, "cmd"    # [Ljava/lang/String;

    .line 48
    const-string v0, "AndroidIDE-LogReader"

    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 41
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/itsaky/androidide/logsender/utils/LogReader;->isInterrupted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 49
    iput-object p1, p0, Lcom/itsaky/androidide/logsender/utils/LogReader;->senderId:Ljava/lang/String;

    .line 50
    iput-object p2, p0, Lcom/itsaky/androidide/logsender/utils/LogReader;->packageName:Ljava/lang/String;

    .line 51
    iput p3, p0, Lcom/itsaky/androidide/logsender/utils/LogReader;->port:I

    .line 53
    new-instance v0, Ljava/lang/ProcessBuilder;

    invoke-direct {v0, p4}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V

    iput-object v0, p0, Lcom/itsaky/androidide/logsender/utils/LogReader;->processBuilder:Ljava/lang/ProcessBuilder;

    .line 54
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/ProcessBuilder;->redirectErrorStream(Z)Ljava/lang/ProcessBuilder;

    .line 55
    return-void
.end method

.method private static defaultCmd()[Ljava/lang/String;
    .locals 3

    .line 58
    const-string v0, "-v"

    const-string/jumbo v1, "threadtime"

    const-string v2, "logcat"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private writeCommand(Lcom/itsaky/androidide/logsender/socket/ISocketCommand;Ljava/io/OutputStream;)V
    .locals 1
    .param p1, "command"    # Lcom/itsaky/androidide/logsender/socket/ISocketCommand;
    .param p2, "outputStream"    # Ljava/io/OutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/OutputStream;->write([B)V

    .line 93
    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 2

    .line 96
    iget-object v0, p0, Lcom/itsaky/androidide/logsender/utils/LogReader;->isInterrupted:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 97
    invoke-virtual {p0}, Lcom/itsaky/androidide/logsender/utils/LogReader;->interrupt()V

    .line 98
    return-void
.end method

.method public run()V
    .locals 7

    .line 63
    const-string v0, "Starting to read logs..."

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/itsaky/androidide/logsender/utils/Logger;->info([Ljava/lang/Object;)V

    .line 64
    :try_start_0
    new-instance v0, Ljava/net/Socket;

    invoke-static {}, Ljava/net/InetAddress;->getLocalHost()Ljava/net/InetAddress;

    move-result-object v1

    iget v2, p0, Lcom/itsaky/androidide/logsender/utils/LogReader;->port:I

    invoke-direct {v0, v1, v2}, Ljava/net/Socket;-><init>(Ljava/net/InetAddress;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 65
    .local v0, "socket":Ljava/net/Socket;
    :try_start_1
    iget-object v1, p0, Lcom/itsaky/androidide/logsender/utils/LogReader;->processBuilder:Ljava/lang/ProcessBuilder;

    invoke-virtual {v1}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 67
    .local v1, "process":Ljava/lang/Process;
    :try_start_2
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    .line 68
    invoke-virtual {v1}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 70
    .local v2, "reader":Ljava/io/BufferedReader;
    :try_start_3
    invoke-virtual {v0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v3

    .line 73
    .local v3, "outputStream":Ljava/io/OutputStream;
    new-instance v4, Lcom/itsaky/androidide/logsender/socket/SenderInfoCommand;

    iget-object v5, p0, Lcom/itsaky/androidide/logsender/utils/LogReader;->senderId:Ljava/lang/String;

    iget-object v6, p0, Lcom/itsaky/androidide/logsender/utils/LogReader;->packageName:Ljava/lang/String;

    invoke-direct {v4, v5, v6}, Lcom/itsaky/androidide/logsender/socket/SenderInfoCommand;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v4, v3}, Lcom/itsaky/androidide/logsender/utils/LogReader;->writeCommand(Lcom/itsaky/androidide/logsender/socket/ISocketCommand;Ljava/io/OutputStream;)V

    .line 76
    :goto_0
    iget-object v4, p0, Lcom/itsaky/androidide/logsender/utils/LogReader;->isInterrupted:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v4

    move-object v5, v4

    .local v5, "line":Ljava/lang/String;
    if-eqz v4, :cond_0

    .line 77
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v6, "\n"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 78
    .end local v5    # "line":Ljava/lang/String;
    .local v4, "line":Ljava/lang/String;
    invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/io/OutputStream;->write([B)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 81
    .end local v3    # "outputStream":Ljava/io/OutputStream;
    .end local v4    # "line":Ljava/lang/String;
    :cond_0
    :try_start_4
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 84
    .end local v2    # "reader":Ljava/io/BufferedReader;
    :try_start_5
    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_2

    .line 67
    .restart local v2    # "reader":Ljava/io/BufferedReader;
    :catchall_0
    move-exception v3

    :try_start_6
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v4

    :try_start_7
    invoke-virtual {v3, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .end local v0    # "socket":Ljava/net/Socket;
    .end local v1    # "process":Ljava/lang/Process;
    :goto_1
    throw v3
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 84
    .end local v2    # "reader":Ljava/io/BufferedReader;
    .restart local v0    # "socket":Ljava/net/Socket;
    .restart local v1    # "process":Ljava/lang/Process;
    :catchall_2
    move-exception v2

    goto :goto_3

    .line 81
    :catch_0
    move-exception v2

    .line 82
    .local v2, "ioError":Ljava/io/IOException;
    const/4 v3, 0x2

    :try_start_8
    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "Error reading from the logcat process or writing to the socket"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    aput-object v2, v3, v4

    invoke-static {v3}, Lcom/itsaky/androidide/logsender/utils/Logger;->error([Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 84
    .end local v2    # "ioError":Ljava/io/IOException;
    :try_start_9
    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 85
    :goto_2
    nop

    .line 86
    .end local v1    # "process":Ljava/lang/Process;
    :try_start_a
    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_1

    .line 88
    .end local v0    # "socket":Ljava/net/Socket;
    goto :goto_5

    .line 84
    .restart local v0    # "socket":Ljava/net/Socket;
    .restart local v1    # "process":Ljava/lang/Process;
    :goto_3
    :try_start_b
    invoke-virtual {v0}, Ljava/net/Socket;->close()V

    .line 85
    nop

    .end local v0    # "socket":Ljava/net/Socket;
    throw v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 64
    .end local v1    # "process":Ljava/lang/Process;
    .restart local v0    # "socket":Ljava/net/Socket;
    :catchall_3
    move-exception v1

    :try_start_c
    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    goto :goto_4

    :catchall_4
    move-exception v2

    :try_start_d
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v1
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_1

    .line 86
    .end local v0    # "socket":Ljava/net/Socket;
    :catch_1
    move-exception v0

    .line 87
    .local v0, "ioError":Ljava/io/IOException;
    const-string v1, "Error creating the socket or starting the process"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/itsaky/androidide/logsender/utils/Logger;->error([Ljava/lang/Object;)V

    .line 89
    .end local v0    # "ioError":Ljava/io/IOException;
    :goto_5
    return-void
.end method

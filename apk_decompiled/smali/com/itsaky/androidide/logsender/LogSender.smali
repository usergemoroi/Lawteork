.class public final Lcom/itsaky/androidide/logsender/LogSender;
.super Lcom/itsaky/androidide/logsender/ILogSender$Stub;
.source "LogSender.java"

# interfaces
.implements Landroid/content/ServiceConnection;


# static fields
.field public static final PACKAGE_ANDROIDIDE:Ljava/lang/String; = "com.itsaky.androidide"

.field public static final PACKAGE_UNKNOWN:Ljava/lang/String; = "<unknown-package-name>"

.field public static final SERVICE_ACTION:Ljava/lang/String; = "com.itsaky.androidide.LOG_SERVICE_ACTION"


# instance fields
.field private context:Landroid/content/Context;

.field private final isBinding:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final isConnected:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private packageName:Ljava/lang/String;

.field private reader:Lcom/itsaky/androidide/logsender/utils/LogReader;

.field private receiver:Lcom/itsaky/androidide/logsender/ILogReceiver;

.field private final senderId:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 2

    .line 68
    invoke-direct {p0}, Lcom/itsaky/androidide/logsender/ILogSender$Stub;-><init>()V

    .line 40
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/itsaky/androidide/logsender/LogSender;->isBinding:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 41
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/itsaky/androidide/logsender/LogSender;->isConnected:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 69
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/itsaky/androidide/logsender/LogSender;->senderId:Ljava/lang/String;

    .line 70
    return-void
.end method

.method private isReceiverAlive(Lcom/itsaky/androidide/logsender/ILogReceiver;)Z
    .locals 2
    .param p1, "receiver"    # Lcom/itsaky/androidide/logsender/ILogReceiver;

    .line 238
    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 239
    return v0

    .line 243
    :cond_0
    :try_start_0
    invoke-interface {p1}, Lcom/itsaky/androidide/logsender/ILogReceiver;->ping()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 244
    const/4 v0, 0x1

    return v0

    .line 245
    :catch_0
    move-exception v1

    .line 246
    .local v1, "err":Landroid/os/RemoteException;
    return v0
.end method

.method private tryDisconnect(Z)V
    .locals 3
    .param p1, "notifyRecevier"    # Z

    .line 210
    const-string v0, "Disconnecting from log receiver..."

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/itsaky/androidide/logsender/utils/Logger;->info([Ljava/lang/Object;)V

    .line 211
    iget-object v0, p0, Lcom/itsaky/androidide/logsender/LogSender;->reader:Lcom/itsaky/androidide/logsender/utils/LogReader;

    if-eqz v0, :cond_0

    .line 212
    invoke-virtual {v0}, Lcom/itsaky/androidide/logsender/utils/LogReader;->cancel()V

    .line 215
    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/itsaky/androidide/logsender/LogSender;->receiver:Lcom/itsaky/androidide/logsender/ILogReceiver;

    invoke-direct {p0, v0}, Lcom/itsaky/androidide/logsender/LogSender;->isReceiverAlive(Lcom/itsaky/androidide/logsender/ILogReceiver;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 217
    :try_start_0
    iget-object v0, p0, Lcom/itsaky/androidide/logsender/LogSender;->receiver:Lcom/itsaky/androidide/logsender/ILogReceiver;

    invoke-virtual {p0}, Lcom/itsaky/androidide/logsender/LogSender;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/itsaky/androidide/logsender/LogSender;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/itsaky/androidide/logsender/ILogReceiver;->disconnect(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 220
    goto :goto_0

    .line 218
    :catch_0
    move-exception v0

    .line 219
    .local v0, "err":Ljava/lang/Exception;
    const-string v1, "Failed to disconnect from log receiver service"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/itsaky/androidide/logsender/utils/Logger;->error([Ljava/lang/Object;)V

    .line 223
    .end local v0    # "err":Ljava/lang/Exception;
    :cond_1
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/itsaky/androidide/logsender/LogSender;->receiver:Lcom/itsaky/androidide/logsender/ILogReceiver;

    .line 224
    iput-object v0, p0, Lcom/itsaky/androidide/logsender/LogSender;->reader:Lcom/itsaky/androidide/logsender/utils/LogReader;

    .line 225
    iget-object v0, p0, Lcom/itsaky/androidide/logsender/LogSender;->isBinding:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 226
    iget-object v0, p0, Lcom/itsaky/androidide/logsender/LogSender;->isConnected:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 227
    return-void
.end method

.method private tryUnbind(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .line 231
    :try_start_0
    invoke-virtual {p1, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 234
    goto :goto_0

    .line 232
    :catch_0
    move-exception v0

    .line 233
    .local v0, "err":Ljava/lang/Exception;
    const-string v1, "Failed to unbind from the the log receiver service"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/itsaky/androidide/logsender/utils/Logger;->error([Ljava/lang/Object;)V

    .line 235
    .end local v0    # "err":Ljava/lang/Exception;
    :goto_0
    return-void
.end method


# virtual methods
.method bind(Landroid/content/Context;)Z
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    .line 168
    invoke-virtual {p0}, Lcom/itsaky/androidide/logsender/LogSender;->isConnected()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 169
    const-string v0, "LogSender is already installed"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/itsaky/androidide/logsender/utils/Logger;->warn([Ljava/lang/Object;)V

    .line 170
    return v1

    .line 173
    :cond_0
    invoke-virtual {p0}, Lcom/itsaky/androidide/logsender/LogSender;->isBinding()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 174
    const-string v0, "LogSender is already being installed"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/itsaky/androidide/logsender/utils/Logger;->warn([Ljava/lang/Object;)V

    .line 175
    return v1

    .line 178
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/itsaky/androidide/logsender/LogSender;->packageName:Ljava/lang/String;

    .line 179
    const-string v1, "com.itsaky.androidide"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 180
    const/4 v0, 0x0

    return v0

    .line 183
    :cond_2
    iput-object p1, p0, Lcom/itsaky/androidide/logsender/LogSender;->context:Landroid/content/Context;

    .line 185
    new-instance v0, Landroid/content/Intent;

    const-string v2, "com.itsaky.androidide.LOG_SERVICE_ACTION"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 186
    .local v0, "intent":Landroid/content/Intent;
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 187
    iget-object v1, p0, Lcom/itsaky/androidide/logsender/LogSender;->isBinding:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/16 v2, 0x41

    invoke-virtual {p1, v0, p0, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 189
    invoke-virtual {p0}, Lcom/itsaky/androidide/logsender/LogSender;->isBinding()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 190
    const-string v1, "Binding to log receiver"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/itsaky/androidide/logsender/utils/Logger;->info([Ljava/lang/Object;)V

    goto :goto_0

    .line 192
    :cond_3
    const-string v1, "Failed to bind to log receiver"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/itsaky/androidide/logsender/utils/Logger;->error([Ljava/lang/Object;)V

    .line 195
    :goto_0
    invoke-virtual {p0}, Lcom/itsaky/androidide/logsender/LogSender;->isBinding()Z

    move-result v1

    return v1
.end method

.method destroy(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .line 204
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/itsaky/androidide/logsender/LogSender;->tryDisconnect(Z)V

    .line 205
    invoke-direct {p0, p1}, Lcom/itsaky/androidide/logsender/LogSender;->tryUnbind(Landroid/content/Context;)V

    .line 206
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/itsaky/androidide/logsender/LogSender;->context:Landroid/content/Context;

    .line 207
    return-void
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/itsaky/androidide/logsender/LogSender;->senderId:Ljava/lang/String;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/itsaky/androidide/logsender/LogSender;->packageName:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 122
    const-string v0, "<unknown-package-name>"

    return-object v0

    .line 125
    :cond_0
    return-object v0
.end method

.method public getPid()I
    .locals 1

    .line 116
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    return v0
.end method

.method isBinding()Z
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/itsaky/androidide/logsender/LogSender;->isBinding:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method isConnected()Z
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/itsaky/androidide/logsender/LogSender;->isConnected:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public onDisconnect()V
    .locals 4

    .line 135
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/itsaky/androidide/logsender/LogSender;->tryDisconnect(Z)V

    .line 136
    iget-object v0, p0, Lcom/itsaky/androidide/logsender/LogSender;->context:Landroid/content/Context;

    invoke-direct {p0, v0}, Lcom/itsaky/androidide/logsender/LogSender;->tryUnbind(Landroid/content/Context;)V

    .line 138
    :try_start_0
    iget-object v0, p0, Lcom/itsaky/androidide/logsender/LogSender;->context:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/itsaky/androidide/logsender/LogSender;->context:Landroid/content/Context;

    const-class v3, Lcom/itsaky/androidide/logsender/LogSenderService;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 141
    goto :goto_0

    .line 139
    :catch_0
    move-exception v0

    .line 140
    .local v0, "err":Ljava/lang/Exception;
    const-string v1, "Failed to stop LogSenderService"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/itsaky/androidide/logsender/utils/Logger;->error([Ljava/lang/Object;)V

    .line 142
    .end local v0    # "err":Ljava/lang/Exception;
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/itsaky/androidide/logsender/LogSender;->context:Landroid/content/Context;

    .line 143
    return-void
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 4
    .param p1, "name"    # Landroid/content/ComponentName;
    .param p2, "service"    # Landroid/os/IBinder;

    .line 74
    invoke-static {p2}, Lcom/itsaky/androidide/logsender/ILogReceiver$Stub;->asInterface(Landroid/os/IBinder;)Lcom/itsaky/androidide/logsender/ILogReceiver;

    move-result-object v0

    iput-object v0, p0, Lcom/itsaky/androidide/logsender/LogSender;->receiver:Lcom/itsaky/androidide/logsender/ILogReceiver;

    .line 75
    if-eqz v0, :cond_0

    .line 80
    :try_start_0
    invoke-interface {v0, p0}, Lcom/itsaky/androidide/logsender/ILogReceiver;->connect(Lcom/itsaky/androidide/logsender/ILogSender;)V

    .line 81
    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "Connecting to log receiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v1}, Lcom/itsaky/androidide/logsender/utils/Logger;->info([Ljava/lang/Object;)V

    .line 82
    iget-object v1, p0, Lcom/itsaky/androidide/logsender/LogSender;->isConnected:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    nop

    .line 87
    return-void

    .line 83
    :catch_0
    move-exception v0

    .line 84
    .local v0, "e":Landroid/os/RemoteException;
    const-string v1, "Failed to connect to log receiver"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/itsaky/androidide/logsender/utils/Logger;->error([Ljava/lang/Object;)V

    .line 85
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 76
    .end local v0    # "e":Landroid/os/RemoteException;
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Failed to get log receiver instance"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1
    .param p1, "name"    # Landroid/content/ComponentName;

    .line 91
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/itsaky/androidide/logsender/LogSender;->tryDisconnect(Z)V

    .line 92
    iget-object v0, p0, Lcom/itsaky/androidide/logsender/LogSender;->context:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 93
    invoke-direct {p0, v0}, Lcom/itsaky/androidide/logsender/LogSender;->tryUnbind(Landroid/content/Context;)V

    .line 94
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/itsaky/androidide/logsender/LogSender;->context:Landroid/content/Context;

    .line 96
    :cond_0
    return-void
.end method

.method public ping()V
    .locals 2

    .line 100
    const-string v0, "LogSender"

    const-string v1, "ping: Received a ping request"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    return-void
.end method

.method public startReader(I)V
    .locals 3
    .param p1, "port"    # I

    .line 105
    iget-object v0, p0, Lcom/itsaky/androidide/logsender/LogSender;->reader:Lcom/itsaky/androidide/logsender/utils/LogReader;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/itsaky/androidide/logsender/utils/LogReader;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 106
    const-string v0, "LogReader has already been started"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/itsaky/androidide/logsender/utils/Logger;->warn([Ljava/lang/Object;)V

    .line 107
    return-void

    .line 110
    :cond_0
    new-instance v0, Lcom/itsaky/androidide/logsender/utils/LogReader;

    invoke-virtual {p0}, Lcom/itsaky/androidide/logsender/LogSender;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/itsaky/androidide/logsender/LogSender;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2, p1}, Lcom/itsaky/androidide/logsender/utils/LogReader;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    iput-object v0, p0, Lcom/itsaky/androidide/logsender/LogSender;->reader:Lcom/itsaky/androidide/logsender/utils/LogReader;

    .line 111
    invoke-virtual {v0}, Lcom/itsaky/androidide/logsender/utils/LogReader;->start()V

    .line 112
    return-void
.end method

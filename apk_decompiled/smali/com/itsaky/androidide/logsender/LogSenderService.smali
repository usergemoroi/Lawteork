.class public Lcom/itsaky/androidide/logsender/LogSenderService;
.super Landroid/app/Service;
.source "LogSenderService.java"


# static fields
.field public static final ACTION_START_SERVICE:Ljava/lang/String; = "ide.logsender.service.start"

.field public static final ACTION_STOP_SERVICE:Ljava/lang/String; = "ide.logsender.service.stop"

.field private static final NOTIFICATION_CHANNEL_ID:Ljava/lang/String; = "ide.logsender.service"

.field private static final NOTIFICATION_CHANNEL_NAME:Ljava/lang/String; = "LogSender Service"

.field private static final NOTIFICATION_ID:I = 0x284

.field private static final NOTIFICATION_TEXT:Ljava/lang/String; = "Connected to AndroidIDE"

.field private static final NOTIFICATION_TITLE:Ljava/lang/String; = "LogSender Service"


# instance fields
.field private final logSender:Lcom/itsaky/androidide/logsender/LogSender;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 41
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 43
    new-instance v0, Lcom/itsaky/androidide/logsender/LogSender;

    invoke-direct {v0}, Lcom/itsaky/androidide/logsender/LogSender;-><init>()V

    iput-object v0, p0, Lcom/itsaky/androidide/logsender/LogSenderService;->logSender:Lcom/itsaky/androidide/logsender/LogSender;

    return-void
.end method

.method private actionStartService()V
    .locals 5

    .line 86
    const-string v0, "Starting log sender service..."

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/itsaky/androidide/logsender/utils/Logger;->info([Ljava/lang/Object;)V

    .line 88
    const/4 v0, 0x0

    .line 90
    .local v0, "result":Z
    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/itsaky/androidide/logsender/LogSenderService;->logSender:Lcom/itsaky/androidide/logsender/LogSender;

    invoke-virtual {p0}, Lcom/itsaky/androidide/logsender/LogSenderService;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/itsaky/androidide/logsender/LogSender;->bind(Landroid/content/Context;)Z

    move-result v2

    move v0, v2

    .line 91
    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Bind to AndroidIDE:"

    aput-object v3, v2, v1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v2}, Lcom/itsaky/androidide/logsender/utils/Logger;->debug([Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    goto :goto_0

    .line 92
    :catch_0
    move-exception v2

    .line 93
    .local v2, "err":Ljava/lang/Exception;
    sget v3, Lcom/itsaky/androidide/logsender/R$string;->msg_bind_service_failed:I

    invoke-virtual {p0, v3}, Lcom/itsaky/androidide/logsender/LogSenderService;->getString(I)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3, v2}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lcom/itsaky/androidide/logsender/utils/Logger;->error([Ljava/lang/Object;)V

    .line 96
    .end local v2    # "err":Ljava/lang/Exception;
    :goto_0
    if-nez v0, :cond_0

    .line 97
    sget v2, Lcom/itsaky/androidide/logsender/R$string;->msg_bind_service_failed:I

    invoke-virtual {p0, v2}, Lcom/itsaky/androidide/logsender/LogSenderService;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 98
    invoke-direct {p0}, Lcom/itsaky/androidide/logsender/LogSenderService;->actionStopService()V

    .line 100
    :cond_0
    return-void
.end method

.method private actionStopService()V
    .locals 1

    .line 103
    const-string v0, "Stopping log sender service..."

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/itsaky/androidide/logsender/utils/Logger;->info([Ljava/lang/Object;)V

    .line 104
    invoke-virtual {p0}, Lcom/itsaky/androidide/logsender/LogSenderService;->stopSelf()V

    .line 105
    return-void
.end method

.method private buildNotification()Landroid/app/Notification;
    .locals 7

    .line 152
    invoke-virtual {p0}, Lcom/itsaky/androidide/logsender/LogSenderService;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 157
    .local v0, "res":Landroid/content/res/Resources;
    const/4 v1, -0x1

    .line 160
    .local v1, "priority":I
    new-instance v2, Landroid/app/Notification$Builder;

    invoke-direct {v2, p0}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    .line 161
    .local v2, "builder":Landroid/app/Notification$Builder;
    const-string v3, "LogSender Service"

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 162
    const-string v3, "Connected to AndroidIDE"

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 163
    new-instance v4, Landroid/app/Notification$BigTextStyle;

    invoke-direct {v4}, Landroid/app/Notification$BigTextStyle;-><init>()V

    invoke-virtual {v4, v3}, Landroid/app/Notification$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setStyle(Landroid/app/Notification$Style;)Landroid/app/Notification$Builder;

    .line 164
    invoke-virtual {v2, v1}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 166
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1a

    if-lt v3, v4, :cond_0

    .line 167
    const-string v3, "ide.logsender.service"

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setChannelId(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 170
    :cond_0
    nop

    .line 171
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 174
    sget v4, Lcom/itsaky/androidide/logsender/R$drawable;->ic_androidide_log:I

    invoke-virtual {v2, v4}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    .line 176
    nop

    .line 177
    const v4, -0x9f8275

    invoke-virtual {v2, v4}, Landroid/app/Notification$Builder;->setColor(I)Landroid/app/Notification$Builder;

    .line 180
    const/4 v4, 0x1

    invoke-virtual {v2, v4}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    .line 183
    new-instance v4, Landroid/content/Intent;

    const-class v5, Lcom/itsaky/androidide/logsender/LogSenderService;

    invoke-direct {v4, p0, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v5, "ide.logsender.service.stop"

    invoke-virtual {v4, v5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v4

    .line 184
    .local v4, "exitIntent":Landroid/content/Intent;
    sget v5, Lcom/itsaky/androidide/logsender/R$string;->notification_action_exit:I

    .line 185
    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 186
    const/high16 v6, 0x4000000

    invoke-static {p0, v3, v4, v6}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v3

    .line 184
    const v6, 0x108001d

    invoke-virtual {v2, v6, v5, v3}, Landroid/app/Notification$Builder;->addAction(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 188
    invoke-virtual {v2}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v3

    return-object v3
.end method

.method private setupNotificationChannel()V
    .locals 4

    .line 135
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_0

    .line 136
    return-void

    .line 139
    :cond_0
    new-instance v0, Landroid/app/NotificationChannel;

    const-string v1, "LogSender Service"

    const/4 v2, 0x2

    const-string v3, "ide.logsender.service"

    invoke-direct {v0, v3, v1, v2}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 145
    .local v0, "channel":Landroid/app/NotificationChannel;
    const-class v1, Landroid/app/NotificationManager;

    invoke-virtual {p0, v1}, Lcom/itsaky/androidide/logsender/LogSenderService;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/NotificationManager;

    .line 146
    .local v1, "notificationManager":Landroid/app/NotificationManager;
    if-eqz v1, :cond_1

    .line 147
    invoke-virtual {v1, v0}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 149
    :cond_1
    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1
    .param p1, "intent"    # Landroid/content/Intent;

    .line 62
    const-string v0, "Unexpected request to bind."

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/itsaky/androidide/logsender/utils/Logger;->debug([Ljava/lang/Object;)V

    .line 63
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 2

    .line 54
    sget-object v0, Lcom/itsaky/androidide/logsender/utils/Logger;->LOG:Lcom/itsaky/androidide/utils/ILogger;

    invoke-virtual {v0}, Lcom/itsaky/androidide/utils/ILogger;->logThis()V

    .line 55
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 56
    invoke-direct {p0}, Lcom/itsaky/androidide/logsender/LogSenderService;->setupNotificationChannel()V

    .line 57
    const/16 v0, 0x284

    invoke-direct {p0}, Lcom/itsaky/androidide/logsender/LogSenderService;->buildNotification()Landroid/app/Notification;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/itsaky/androidide/logsender/LogSenderService;->startForeground(ILandroid/app/Notification;)V

    .line 58
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 123
    sget-object v0, Lcom/itsaky/androidide/logsender/utils/Logger;->LOG:Lcom/itsaky/androidide/utils/ILogger;

    invoke-virtual {v0}, Lcom/itsaky/androidide/utils/ILogger;->logThis()V

    .line 124
    iget-object v0, p0, Lcom/itsaky/androidide/logsender/LogSenderService;->logSender:Lcom/itsaky/androidide/logsender/LogSender;

    invoke-virtual {v0}, Lcom/itsaky/androidide/logsender/LogSender;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/itsaky/androidide/logsender/LogSenderService;->logSender:Lcom/itsaky/androidide/logsender/LogSender;

    invoke-virtual {v0}, Lcom/itsaky/androidide/logsender/LogSender;->isBinding()Z

    move-result v0

    if-nez v0, :cond_0

    .line 125
    const-string v0, "Not bound to AndroidIDE. Ignored."

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/itsaky/androidide/logsender/utils/Logger;->debug([Ljava/lang/Object;)V

    .line 126
    return-void

    .line 129
    :cond_0
    const-string v0, "Service is being destroyed. Destroying log sender..."

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/itsaky/androidide/logsender/utils/Logger;->warn([Ljava/lang/Object;)V

    .line 130
    iget-object v0, p0, Lcom/itsaky/androidide/logsender/LogSenderService;->logSender:Lcom/itsaky/androidide/logsender/LogSender;

    invoke-virtual {p0}, Lcom/itsaky/androidide/logsender/LogSenderService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/itsaky/androidide/logsender/LogSender;->destroy(Landroid/content/Context;)V

    .line 131
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 132
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 3
    .param p1, "intent"    # Landroid/content/Intent;
    .param p2, "flags"    # I
    .param p3, "startId"    # I

    .line 68
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "onStartCommand"

    filled-new-array {v2, p1, v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/itsaky/androidide/logsender/utils/Logger;->debug([Ljava/lang/Object;)V

    .line 70
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    :cond_0
    goto :goto_0

    :sswitch_0
    const-string v1, "ide.logsender.service.start"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :sswitch_1
    const-string v1, "ide.logsender.service.stop"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :goto_0
    const/4 v0, -0x1

    :goto_1
    packed-switch v0, :pswitch_data_0

    .line 78
    const-string v0, "Unknown service action:"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/itsaky/androidide/logsender/utils/Logger;->error([Ljava/lang/Object;)V

    goto :goto_2

    .line 75
    :pswitch_0
    invoke-direct {p0}, Lcom/itsaky/androidide/logsender/LogSenderService;->actionStopService()V

    .line 76
    goto :goto_2

    .line 72
    :pswitch_1
    invoke-direct {p0}, Lcom/itsaky/androidide/logsender/LogSenderService;->actionStartService()V

    .line 73
    nop

    .line 82
    :goto_2
    const/4 v0, 0x2

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x3d15f4b4 -> :sswitch_1
        0x65a86df0 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onTaskRemoved(Landroid/content/Intent;)V
    .locals 2
    .param p1, "rootIntent"    # Landroid/content/Intent;

    .line 109
    sget-object v0, Lcom/itsaky/androidide/logsender/utils/Logger;->LOG:Lcom/itsaky/androidide/utils/ILogger;

    invoke-virtual {v0}, Lcom/itsaky/androidide/utils/ILogger;->logThis()V

    .line 111
    iget-object v0, p0, Lcom/itsaky/androidide/logsender/LogSenderService;->logSender:Lcom/itsaky/androidide/logsender/LogSender;

    invoke-virtual {v0}, Lcom/itsaky/androidide/logsender/LogSender;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/itsaky/androidide/logsender/LogSenderService;->logSender:Lcom/itsaky/androidide/logsender/LogSender;

    invoke-virtual {v0}, Lcom/itsaky/androidide/logsender/LogSender;->isBinding()Z

    move-result v0

    if-nez v0, :cond_0

    .line 112
    const-string v0, "Not bound to AndroidIDE. Ignored."

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/itsaky/androidide/logsender/utils/Logger;->debug([Ljava/lang/Object;)V

    .line 113
    return-void

    .line 116
    :cond_0
    const-string v0, "Task removed. Destroying log sender..."

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/itsaky/androidide/logsender/utils/Logger;->warn([Ljava/lang/Object;)V

    .line 117
    iget-object v0, p0, Lcom/itsaky/androidide/logsender/LogSenderService;->logSender:Lcom/itsaky/androidide/logsender/LogSender;

    invoke-virtual {p0}, Lcom/itsaky/androidide/logsender/LogSenderService;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/itsaky/androidide/logsender/LogSender;->destroy(Landroid/content/Context;)V

    .line 118
    invoke-virtual {p0}, Lcom/itsaky/androidide/logsender/LogSenderService;->stopSelf()V

    .line 119
    return-void
.end method

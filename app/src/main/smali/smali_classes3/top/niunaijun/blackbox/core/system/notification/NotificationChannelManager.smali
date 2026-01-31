.class public Ltop/niunaijun/blackbox/core/system/notification/NotificationChannelManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static APP_CHANNEL:Landroid/app/NotificationChannel;

.field private static final sManager:Ltop/niunaijun/blackbox/core/system/notification/NotificationChannelManager;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltop/niunaijun/blackbox/core/system/notification/NotificationChannelManager;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/core/system/notification/NotificationChannelManager;-><init>()V

    sput-object v0, Ltop/niunaijun/blackbox/core/system/notification/NotificationChannelManager;->sManager:Ltop/niunaijun/blackbox/core/system/notification/NotificationChannelManager;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    invoke-direct {p0}, Ltop/niunaijun/blackbox/core/system/notification/NotificationChannelManager;->registerAppChannel()V

    :cond_0
    return-void
.end method

.method public static get()Ltop/niunaijun/blackbox/core/system/notification/NotificationChannelManager;
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/core/system/notification/NotificationChannelManager;->sManager:Ltop/niunaijun/blackbox/core/system/notification/NotificationChannelManager;

    return-object v0
.end method

.method private registerAppChannel()V
    .locals 5

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "notification"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Landroid/app/NotificationChannel;

    const-string v3, "black-box-app"

    const/4 v4, 0x4

    invoke-direct {v2, v1, v3, v4}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    sput-object v2, Ltop/niunaijun/blackbox/core/system/notification/NotificationChannelManager;->APP_CHANNEL:Landroid/app/NotificationChannel;

    const/4 v1, 0x1

    invoke-virtual {v2, v1}, Landroid/app/NotificationChannel;->enableLights(Z)V

    sget-object v2, Ltop/niunaijun/blackbox/core/system/notification/NotificationChannelManager;->APP_CHANNEL:Landroid/app/NotificationChannel;

    const/high16 v3, -0x10000

    invoke-virtual {v2, v3}, Landroid/app/NotificationChannel;->setLightColor(I)V

    sget-object v2, Ltop/niunaijun/blackbox/core/system/notification/NotificationChannelManager;->APP_CHANNEL:Landroid/app/NotificationChannel;

    invoke-virtual {v2, v1}, Landroid/app/NotificationChannel;->setShowBadge(Z)V

    sget-object v2, Ltop/niunaijun/blackbox/core/system/notification/NotificationChannelManager;->APP_CHANNEL:Landroid/app/NotificationChannel;

    invoke-virtual {v2, v1}, Landroid/app/NotificationChannel;->setLockscreenVisibility(I)V

    sget-object v1, Ltop/niunaijun/blackbox/core/system/notification/NotificationChannelManager;->APP_CHANNEL:Landroid/app/NotificationChannel;

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    return-void
.end method

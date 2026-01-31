.class public Lcom/itsaky/androidide/utils/AndroidLogger;
.super Lcom/itsaky/androidide/utils/ILogger;
.source "AndroidLogger.java"


# direct methods
.method protected constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "tag"    # Ljava/lang/String;

    .line 30
    invoke-direct {p0, p1}, Lcom/itsaky/androidide/utils/ILogger;-><init>(Ljava/lang/String;)V

    .line 31
    return-void
.end method


# virtual methods
.method protected doLog(Lcom/itsaky/androidide/utils/ILogger$Level;Ljava/lang/String;)V
    .locals 2
    .param p1, "level"    # Lcom/itsaky/androidide/utils/ILogger$Level;
    .param p2, "message"    # Ljava/lang/String;

    .line 35
    sget-object v0, Lcom/itsaky/androidide/utils/AndroidLogger$1;->$SwitchMap$com$itsaky$androidide$utils$ILogger$Level:[I

    invoke-virtual {p1}, Lcom/itsaky/androidide/utils/ILogger$Level;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 50
    iget-object v0, p0, Lcom/itsaky/androidide/utils/AndroidLogger;->TAG:Ljava/lang/String;

    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 46
    :pswitch_0
    iget-object v0, p0, Lcom/itsaky/androidide/utils/AndroidLogger;->TAG:Ljava/lang/String;

    invoke-static {v0, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    goto :goto_0

    .line 43
    :pswitch_1
    iget-object v0, p0, Lcom/itsaky/androidide/utils/AndroidLogger;->TAG:Ljava/lang/String;

    invoke-static {v0, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    goto :goto_0

    .line 40
    :pswitch_2
    iget-object v0, p0, Lcom/itsaky/androidide/utils/AndroidLogger;->TAG:Ljava/lang/String;

    invoke-static {v0, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    goto :goto_0

    .line 37
    :pswitch_3
    iget-object v0, p0, Lcom/itsaky/androidide/utils/AndroidLogger;->TAG:Ljava/lang/String;

    invoke-static {v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    nop

    .line 53
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

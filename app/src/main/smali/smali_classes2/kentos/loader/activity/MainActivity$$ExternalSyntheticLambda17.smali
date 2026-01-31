.class public final synthetic Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda17;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkentos/loader/activity/MainActivity;

.field public final f$1:Ljava/lang/String;

.field public final f$2:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lkentos/loader/activity/MainActivity;Ljava/lang/String;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda17;->f$0:Lkentos/loader/activity/MainActivity;

    iput-object p2, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda17;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda17;->f$2:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    const-string v0, "\u06db\u06e8\u06dc\u06d8\u06e2\u06db\u06e0\u06e8\u06e2\u06d8\u06da\u06e8\u06e1\u06e7\u06d6\u06da\u06e7\u06db\u06eb\u06dc\u06dc\u06df\u06d6\u06e6\u06e2\u06e8\u06d8\u06e6\u06e5\u06e1\u06e2\u06e1\u06e7\u06e5\u06d6\u06d8\u06d8\u06d6\u06dc\u06d8\u06db\u06e8\u06da\u06e8\u06dc\u06d9\u06e4\u06e5\u06e7\u06e5\u06eb\u06e2\u06e4\u06e5\u06dc\u06e2\u06db\u06e8\u06e4\u06d7\u06e5\u06d9\u06e7\u06e1\u06e5\u06db\u06dc\u06d8\u06eb\u06e5\u06d9\u06eb\u06e5\u06e1\u06e1\u06e7\u06e6\u06e2\u06df\u06e8\u06e4\u06ec\u06db\u06eb\u06e8\u06e7\u06e7\u06d6\u06d8\u06d8\u06db\u06ec\u06e0\u06e1\u06db\u06d9\u06eb\u06da\u06db\u06db\u06dc\u06d8\u06d6\u06d8\u06e7\u06d8\u06e2\u06df\u06dc\u06d8"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x3b0

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1f1

    const/16 v2, 0x1ad

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xfa

    const/16 v2, 0x324

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x95

    const/16 v2, 0x38

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2e3

    const/16 v2, 0x2f5

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1ab

    const/16 v2, 0x265

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xaa

    const/16 v2, 0x22c

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2d1

    const/16 v2, 0xf

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x70

    const/16 v2, 0x2a9

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x36f

    const/16 v2, 0x30e

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x220

    const/4 v2, 0x0

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xfe

    const/16 v2, 0x18b

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x23a

    const/16 v2, 0x2fc

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2a6

    const/16 v2, 0x272

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x5e

    const/16 v2, 0x3e2

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x172

    const/16 v2, 0x310

    const v3, -0xd425ab1

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06e7\u06da\u06e6\u06d9\u06d6\u06ec\u06db\u06dc\u06e7\u06d8\u06d6\u06d8\u06e2\u06e8\u06e8\u06d8\u06da\u06da\u06e7\u06da\u06d6\u06e8\u06d7\u06e5\u06d8\u06e2\u06ec\u06e4\u06d9\u06e2\u06e8\u06df\u06e2\u06e1\u06e1\u06dc\u06eb\u06df\u06d7\u06dc\u06df\u06e6\u06d8\u06db\u06d9\u06df\u06e2\u06d6\u06d6\u06dc\u06dc\u06d6\u06d8\u06e6\u06e5\u06e1\u06d8\u06e0\u06d6\u06e6\u06d8\u06e2\u06e5\u06d8\u06e4\u06d7\u06d7\u06e8\u06df\u06e0\u06e5\u06e7\u06e8\u06d8\u06e4\u06e8\u06e2\u06eb\u06e7\u06e6\u06d8\u06d9\u06e2\u06da\u06e7\u06da\u06db\u06dc\u06ec\u06e0\u06e1\u06dc\u06d8\u06d8\u06d8\u06df\u06dc\u06e7\u06db\u06e5\u06e1\u06e5\u06d8\u06ec\u06d9\u06ec\u06e5\u06e5\u06e1\u06d8\u06df\u06eb\u06dc\u06e5\u06eb\u06e1\u06d8\u06ec\u06d8\u06df\u06e8\u06e6\u06e1\u06ec\u06e2\u06e4\u06e7\u06e4\u06e8\u06d8\u06dc\u06e8\u06d6\u06d8\u06da\u06e6\u06dc\u06e8\u06db\u06eb\u06e5\u06e1\u06e8\u06d8\u06dc\u06d7\u06e8"

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda17;->f$0:Lkentos/loader/activity/MainActivity;

    iget-object v1, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda17;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda17;->f$2:Ljava/lang/Runnable;

    invoke-virtual {v0, v1, v2}, Lkentos/loader/activity/MainActivity;->lambda$setupGameButton$5$kentos-loader-activity-MainActivity(Ljava/lang/String;Ljava/lang/Runnable;)V

    const-string v0, "\u06ec\u06ec\u06d8\u06d6\u06e4\u06e6\u06dc\u06e4\u06d6\u06df\u06d6\u06da\u06e4\u06e0\u06e6\u06ec\u06e8\u06e6\u06e2\u06dc\u06e6\u06da\u06da\u06e6\u06d6\u06e2\u06e8\u06e6\u06e1\u06e1\u06db\u06e1\u06e4\u06d9\u06e7\u06eb\u06dc\u06e5\u06da\u06d7\u06e5\u06d8\u06d8\u06e5\u06e5\u06e8\u06d6\u06e7\u06e6\u06e8\u06eb\u06e6\u06da\u06d6\u06e2\u06df\u06e5\u06d8\u06d8\u06db\u06eb\u06df\u06d7\u06da\u06dc\u06e1\u06e5\u06ec\u06e0\u06d7\u06e7\u06e4\u06e4\u06e1\u06d8\u06eb\u06e0\u06e7"

    goto :goto_0

    :sswitch_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79610461 -> :sswitch_0
        0x3eecc97d -> :sswitch_2
        0x4b03418e -> :sswitch_1
    .end sparse-switch
.end method

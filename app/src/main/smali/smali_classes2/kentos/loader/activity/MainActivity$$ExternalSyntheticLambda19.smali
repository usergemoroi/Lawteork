.class public final synthetic Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda19;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkentos/loader/activity/MainActivity;

.field public final f$1:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lkentos/loader/activity/MainActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda19;->f$0:Lkentos/loader/activity/MainActivity;

    iput-object p2, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda19;->f$1:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    const-string v0, "\u06e1\u06d9\u06e4\u06d7\u06e8\u06e1\u06d6\u06d9\u06d6\u06e2\u06d9\u06eb\u06e4\u06da\u06e6\u06e1\u06ec\u06d7\u06eb\u06e4\u06d9\u06e1\u06d9\u06e8\u06e4\u06df\u06e2\u06d7\u06df\u06db\u06db\u06d9\u06da\u06da\u06e7\u06df\u06e8\u06d9\u06e0\u06d9\u06dc\u06e7\u06d8\u06e2\u06ec\u06e8\u06d6\u06d7\u06e0\u06da\u06e7\u06e7\u06e4\u06e2\u06e1\u06d8\u06da\u06e8\u06d7\u06df\u06e5\u06e1\u06d8\u06d9\u06e1\u06e0\u06d8\u06e1\u06db\u06e8\u06da\u06d8\u06e0\u06e0\u06e7\u06d6\u06d8\u06d8\u06e4\u06dc\u06d8\u06d8\u06ec\u06d9\u06e8\u06e2\u06d9\u06d9\u06d6\u06e0\u06d6\u06d9\u06e7\u06ec\u06e5\u06db\u06e6\u06d8\u06d9\u06da\u06e7\u06d8\u06e7\u06d8\u06e1\u06e6\u06e7\u06ec\u06e4\u06e8\u06d8"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x162

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1a1

    const/16 v2, 0x6e

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xa8

    const/16 v2, 0x383

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x323

    const/16 v2, 0xc7

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x124

    const/16 v2, 0x338

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x9c

    const/16 v2, 0x23f

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xe2

    const/16 v2, 0x34a

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xcc

    const/16 v2, 0x144

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x4d

    const/16 v2, 0x252

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1c0

    const/16 v2, 0x3d

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2ed

    const/16 v2, 0x34e

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x35

    const/16 v2, 0x2cd

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x33

    const/16 v2, 0x3d2

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x30e

    const/16 v2, 0x2e2

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3e7

    const/16 v2, 0x14c

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x9d

    const/16 v2, 0x2a6

    const v3, 0x4d082261    # 1.4274715E8f

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06e0\u06df\u06d6\u06d8\u06e8\u06e0\u06d8\u06df\u06dc\u06dc\u06d8\u06e6\u06d7\u06e6\u06db\u06d9\u06e8\u06d7\u06e4\u06e5\u06e4\u06e1\u06e4\u06e4\u06da\u06e6\u06d8\u06d8\u06d8\u06e4\u06d8\u06e7\u06d8\u06e1\u06e8\u06ec\u06e5\u06e4\u06eb\u06d9\u06df\u06e2\u06e0\u06e1\u06ec\u06e6\u06e4\u06e0\u06ec\u06d6\u06d7\u06d7\u06d6\u06e0\u06e0\u06e1\u06df\u06e6\u06df\u06df\u06e0\u06e2\u06d9\u06e0\u06d8\u06d7\u06e2\u06d9\u06d9\u06d8\u06e8\u06e7\u06d8\u06d9\u06e0\u06ec\u06d6\u06e5\u06d8\u06d8\u06e2\u06e1\u06db\u06e2\u06da\u06d8\u06e1\u06d6\u06e8\u06db\u06e8\u06e0\u06db\u06d9\u06d6\u06e1\u06e1\u06dc\u06d8\u06df\u06e6\u06e7\u06e6\u06d8\u06e1\u06dc\u06d8\u06e6\u06ec\u06d6\u06d9\u06d7\u06eb\u06eb\u06da\u06d8\u06d8\u06ec\u06e1\u06d6\u06e2\u06ec\u06ec\u06e7\u06e2\u06e8\u06dc\u06df\u06e4\u06d9\u06d7\u06e7\u06e4\u06da\u06e1\u06d8\u06df\u06df\u06e1\u06ec\u06e0\u06dc"

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda19;->f$0:Lkentos/loader/activity/MainActivity;

    iget-object v1, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda19;->f$1:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lkentos/loader/activity/MainActivity;->lambda$showErrorDialog$18$kentos-loader-activity-MainActivity(Ljava/lang/String;)V

    const-string v0, "\u06e0\u06e4\u06e0\u06e1\u06d6\u06e7\u06d8\u06e8\u06df\u06d6\u06d8\u06ec\u06d9\u06e4\u06df\u06dc\u06e2\u06e2\u06df\u06e1\u06df\u06df\u06d6\u06e1\u06d6\u06d6\u06e2\u06e8\u06e7\u06d6\u06da\u06e2\u06e0\u06ec\u06e8\u06df\u06e5\u06e1\u06d8\u06e6\u06dc\u06e7\u06d8\u06e6\u06e8\u06dc\u06d8\u06df\u06e6\u06e6\u06e2\u06db\u06e4\u06d7\u06d7\u06d6\u06e8\u06d7\u06dc\u06dc\u06db\u06da\u06d9\u06e8\u06d8\u06e5\u06e8\u06db\u06e8\u06e2\u06e4\u06df\u06dc\u06e4\u06e1\u06db\u06e7\u06e2\u06db\u06e5\u06d8\u06ec\u06e6\u06e7\u06ec\u06ec\u06e5\u06d8\u06da\u06e7\u06eb\u06e8\u06e4\u06e1\u06e1\u06e8\u06eb\u06d9\u06dc\u06d8\u06e7\u06e5\u06e7\u06ec\u06d6\u06d8\u06d6\u06d6\u06d8\u06e8\u06e6\u06e6\u06d8"

    goto :goto_0

    :sswitch_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7961049f -> :sswitch_1
        -0x2c16dbbd -> :sswitch_0
        0xc755683 -> :sswitch_2
    .end sparse-switch
.end method

.class public final synthetic Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda16;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkentos/loader/activity/MainActivity;

.field public final f$1:Lkentos/loader/activity/MainActivity;

.field public final f$2:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lkentos/loader/activity/MainActivity;Lkentos/loader/activity/MainActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda16;->f$0:Lkentos/loader/activity/MainActivity;

    iput-object p2, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda16;->f$1:Lkentos/loader/activity/MainActivity;

    iput-object p3, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda16;->f$2:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    const/16 v4, 0x28c

    const-string v0, "\u06d7\u06db\u06d8\u06db\u06e4\u06e8\u06d7\u06e1\u06d9\u06e5\u06e4\u06d8\u06e5\u06df\u06df\u06e8\u06e6\u06d7\u06df\u06eb\u06eb\u06e8\u06dc\u06d8\u06e6\u06e0\u06d6\u06e2\u06df\u06eb\u06ec\u06da\u06d7\u06eb\u06e6\u06d7\u06db\u06e1\u06d8\u06eb\u06e7\u06e5\u06e8\u06db\u06e6\u06e5\u06d7\u06db\u06e1\u06e5\u06e2\u06d6\u06e8\u06d6\u06d8\u06eb\u06eb\u06e5\u06d8\u06d6\u06ec\u06df\u06d8\u06e7\u06df\u06e2\u06d7\u06e5\u06d8\u06e5\u06ec\u06e8\u06d8\u06e2\u06e6\u06dc\u06dc\u06dc\u06d8\u06d7\u06e2\u06dc\u06d8\u06eb\u06d9\u06dc\u06d8\u06e6\u06eb\u06e2\u06df\u06d6\u06dc\u06d8\u06dc\u06da\u06ec\u06da\u06dc\u06e1\u06d8\u06e2\u06e0\u06df\u06d8\u06df\u06da\u06e2\u06d8\u06eb\u06d9\u06e6\u06e7"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x137

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x37b

    xor-int/2addr v1, v4

    xor-int/lit16 v1, v1, 0x303

    const/16 v2, 0x58

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3c5

    const/16 v2, 0x6c

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x277

    const/16 v2, 0x145

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x25b

    const/16 v2, 0x266

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3b2

    const/16 v2, 0x346

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x31

    const/16 v2, 0x173

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x23c

    const/16 v2, 0x3d2

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x326

    const/16 v2, 0x354

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2c3

    const/16 v2, 0x94

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x346

    const/16 v2, 0x1a6

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3ee

    xor-int/2addr v1, v4

    xor-int/lit16 v1, v1, 0x307

    const/16 v2, 0x12a

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x51

    const/16 v2, 0x3d1

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x225

    const/16 v2, 0x258

    const v3, 0x7201e878

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06d8\u06e7\u06e8\u06d8\u06e4\u06d7\u06d6\u06d6\u06eb\u06eb\u06e5\u06ec\u06df\u06d9\u06df\u06e6\u06d8\u06df\u06e4\u06e4\u06ec\u06db\u06ec\u06e5\u06d8\u06e8\u06d8\u06df\u06e6\u06da\u06e1\u06d6\u06ec\u06ec\u06ec\u06eb\u06e7\u06da\u06dc\u06d8\u06e5\u06e0\u06d6\u06d6\u06e7\u06db\u06e5\u06e8\u06d6\u06d6\u06e1\u06d7\u06e2\u06df\u06d7\u06eb\u06db\u06e0\u06e5\u06d8\u06ec\u06d7\u06d8\u06d6\u06e2\u06e5\u06d8\u06ec\u06e8\u06e8\u06d8\u06df\u06d8\u06e8\u06d8\u06da\u06e0\u06e5\u06d8\u06e1\u06da\u06e1\u06d8"

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda16;->f$0:Lkentos/loader/activity/MainActivity;

    iget-object v1, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda16;->f$1:Lkentos/loader/activity/MainActivity;

    iget-object v2, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda16;->f$2:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lkentos/loader/activity/MainActivity;->lambda$installGameWithObb$14$kentos-loader-activity-MainActivity(Lkentos/loader/activity/MainActivity;Ljava/lang/String;)V

    const-string v0, "\u06e4\u06e0\u06eb\u06db\u06d8\u06d8\u06e0\u06ec\u06dc\u06e4\u06e5\u06d6\u06ec\u06e1\u06df\u06df\u06db\u06e0\u06e5\u06e5\u06e6\u06d8\u06d7\u06e0\u06e2\u06e6\u06e1\u06e8\u06df\u06d7\u06e1\u06d8\u06e4\u06dc\u06df\u06d6\u06eb\u06d9\u06e5\u06e8\u06e6\u06d8\u06e1\u06eb\u06d9\u06e0\u06e0\u06e0\u06e0\u06e7\u06eb\u06db\u06e6\u06df\u06df\u06db\u06e5\u06e7\u06e0\u06e8\u06e4\u06e8\u06da\u06db\u06d9\u06d9\u06e0\u06e0\u06e6\u06d8\u06dc\u06e1\u06e4\u06db\u06e4\u06db\u06ec\u06e0\u06ec\u06ec\u06ec\u06e7\u06dc\u06d8\u06e4\u06e4\u06d6\u06e6\u06e5\u06e4\u06da\u06e0\u06df\u06db\u06db\u06e0\u06e1\u06d8\u06e1\u06d8\u06e5\u06d8\u06d8\u06d6\u06e8\u06d8\u06e0\u06df\u06d8\u06e5\u06ec"

    goto :goto_0

    :sswitch_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x68bbdc18 -> :sswitch_1
        -0xa7abec0 -> :sswitch_0
        0x22f816e7 -> :sswitch_2
    .end sparse-switch
.end method

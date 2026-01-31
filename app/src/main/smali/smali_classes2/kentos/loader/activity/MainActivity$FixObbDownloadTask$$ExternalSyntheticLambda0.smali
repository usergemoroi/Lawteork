.class public final synthetic Lkentos/loader/activity/MainActivity$FixObbDownloadTask$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Lkentos/loader/activity/MainActivity$FixObbDownloadTask;


# direct methods
.method public synthetic constructor <init>(Lkentos/loader/activity/MainActivity$FixObbDownloadTask;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkentos/loader/activity/MainActivity$FixObbDownloadTask$$ExternalSyntheticLambda0;->f$0:Lkentos/loader/activity/MainActivity$FixObbDownloadTask;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    const-string v0, "\u06e2\u06d7\u06e1\u06d6\u06df\u06d8\u06ec\u06da\u06d9\u06eb\u06e4\u06e7\u06eb\u06d7\u06e0\u06e2\u06db\u06e4\u06eb\u06e1\u06e7\u06d8\u06d7\u06e8\u06df\u06e5\u06d8\u06d8\u06e2\u06e2\u06d8\u06d8\u06e6\u06d6\u06d8\u06d8\u06eb\u06e0\u06dc\u06d8\u06e0\u06dc\u06e2\u06da\u06d7\u06e8\u06e7\u06e4\u06d6\u06e1\u06eb\u06e0\u06e8\u06da\u06da\u06eb\u06db\u06e6\u06d8\u06e8\u06ec\u06e6\u06e7\u06e7\u06dc\u06d7\u06e4\u06e1\u06eb\u06d7\u06ec\u06d7\u06e1\u06d8\u06e5\u06e7\u06d8\u06d8\u06e6\u06e1\u06e7"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x1b9

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x8

    const/16 v2, 0x246

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x80

    const/16 v2, 0x218

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3ea

    const/16 v2, 0x3c6

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2fd

    const/16 v2, 0x330

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x36d

    const/16 v2, 0x94

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x138

    const/16 v2, 0x1c6

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xb1

    const/16 v2, 0x1a6

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2ad

    const/16 v2, 0x283

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x29

    const/16 v2, 0x92

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3f5

    const/16 v2, 0x39a

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x178

    const/16 v2, 0x394

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3a2

    const/16 v2, 0x337

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x285

    const/16 v2, 0x24d

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xf4

    const/16 v2, 0x1dc

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1dc

    const/16 v2, 0x1bc

    const v3, -0x4a59a587

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06e2\u06d9\u06e2\u06db\u06e8\u06eb\u06e6\u06e5\u06d9\u06d9\u06e4\u06e1\u06d8\u06dc\u06df\u06d8\u06d6\u06e8\u06df\u06db\u06e4\u06eb\u06e6\u06e5\u06eb\u06e0\u06da\u06e8\u06d8\u06e2\u06dc\u06d6\u06d8\u06e7\u06e1\u06d8\u06d8\u06d7\u06e6\u06e1\u06e0\u06df\u06dc\u06d8\u06eb\u06e5\u06d9\u06df\u06e0\u06d8\u06e8\u06e5\u06e5\u06d6\u06d6\u06e2\u06e0\u06da\u06e6\u06d8\u06e6\u06e1\u06e7\u06d8\u06e7\u06dc\u06d6\u06da\u06e4\u06e2\u06e1\u06d6\u06d8\u06d8\u06e8\u06d9\u06e7\u06db\u06e1\u06e5\u06d8\u06e4\u06d8\u06d6\u06e8\u06e2\u06e0\u06db\u06e6\u06df\u06e8\u06e4\u06da\u06e1\u06e0\u06d8\u06e1\u06e1\u06e6\u06e4\u06d9\u06d7\u06ec\u06d6\u06d8\u06d8\u06e2\u06d6\u06e8\u06e6\u06d7\u06da\u06e8\u06d8\u06e5\u06e2\u06e6\u06e0\u06e6\u06e5\u06da\u06d9\u06e2\u06e0\u06da\u06e5\u06e1\u06d9\u06e5"

    goto :goto_0

    :sswitch_1
    const-string v0, "\u06e1\u06eb\u06e2\u06e5\u06e7\u06eb\u06e6\u06db\u06e2\u06eb\u06db\u06d6\u06e0\u06ec\u06ec\u06e0\u06e0\u06dc\u06dc\u06e4\u06e1\u06d8\u06e8\u06e5\u06ec\u06e1\u06e1\u06e7\u06d8\u06e6\u06df\u06ec\u06dc\u06eb\u06e0\u06e4\u06e0\u06d8\u06d8\u06eb\u06db\u06e6\u06e4\u06e1\u06e1\u06da\u06d6\u06d8\u06e0\u06e2\u06dc\u06d8\u06d7\u06d9\u06da\u06e5\u06d9\u06d9\u06e8\u06d8\u06eb\u06e0\u06eb\u06da\u06d6\u06e1\u06e1\u06da\u06e7\u06df\u06eb\u06e7\u06e5\u06d8\u06e6\u06e1\u06db\u06d9\u06d8\u06e5\u06d8\u06ec\u06da\u06e8\u06d8\u06d9\u06e1\u06e7\u06d8\u06e2\u06ec\u06d6\u06d8\u06d7\u06d6\u06e6\u06d8\u06e2\u06d7\u06e5\u06d8\u06d7\u06eb\u06df\u06ec\u06e4\u06dc\u06d9\u06d6\u06e5\u06d8\u06e7\u06d8\u06d7\u06da\u06e8"

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lkentos/loader/activity/MainActivity$FixObbDownloadTask$$ExternalSyntheticLambda0;->f$0:Lkentos/loader/activity/MainActivity$FixObbDownloadTask;

    invoke-virtual {v0, p1}, Lkentos/loader/activity/MainActivity$FixObbDownloadTask;->lambda$onPreExecute$0$kentos-loader-activity-MainActivity$FixObbDownloadTask(Landroid/view/View;)V

    const-string v0, "\u06ec\u06e2\u06e2\u06d7\u06d9\u06e4\u06d9\u06db\u06e8\u06d8\u06e4\u06e2\u06dc\u06e6\u06e7\u06d8\u06ec\u06da\u06e4\u06e8\u06eb\u06df\u06d7\u06ec\u06df\u06df\u06db\u06e5\u06e4\u06d6\u06ec\u06e4\u06e5\u06e7\u06d9\u06da\u06d8\u06d8\u06e8\u06dc\u06e8\u06ec\u06e8\u06d6\u06d8\u06e0\u06e8\u06e5\u06d8\u06ec\u06d8\u06eb\u06e5\u06e0\u06eb\u06d8\u06d6\u06e8\u06d8\u06e4\u06e4\u06e8\u06e0\u06e6\u06ec\u06d8\u06d7\u06e8\u06d8\u06e1\u06e1\u06e6\u06e0\u06e7\u06e7\u06d9\u06d9\u06e4\u06d8\u06e0\u06e8\u06e5\u06e4\u06e4\u06dc\u06da\u06d8\u06d8\u06d8\u06d9\u06ec\u06e4\u06e0\u06dc\u06e5\u06d7\u06e8\u06d8"

    goto :goto_0

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x16dfea6c -> :sswitch_1
        0x2254038a -> :sswitch_0
        0x3bc2967a -> :sswitch_3
        0x6273bec4 -> :sswitch_2
    .end sparse-switch
.end method

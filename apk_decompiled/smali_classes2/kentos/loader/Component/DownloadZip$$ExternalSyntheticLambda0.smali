.class public final synthetic Lkentos/loader/Component/DownloadZip$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkentos/loader/Component/DownloadZip;


# direct methods
.method public synthetic constructor <init>(Lkentos/loader/Component/DownloadZip;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkentos/loader/Component/DownloadZip$$ExternalSyntheticLambda0;->f$0:Lkentos/loader/Component/DownloadZip;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    const-string v0, "\u06e4\u06e8\u06eb\u06d9\u06df\u06dc\u06db\u06d8\u06ec\u06d8\u06d7\u06e5\u06d8\u06df\u06d8\u06e6\u06da\u06db\u06e5\u06d8\u06d6\u06e1\u06e6\u06d8\u06da\u06d7\u06d9\u06d6\u06e0\u06ec\u06db\u06e2\u06d6\u06d8\u06e2\u06e6\u06e8\u06d8\u06d7\u06ec\u06d6\u06e7\u06d7\u06dc\u06df\u06d8\u06e0\u06e6\u06e7\u06e6\u06d9\u06e4\u06d9\u06df\u06e1\u06d7\u06e8\u06e7\u06da\u06d9\u06e4\u06e5\u06d8\u06e1\u06e6\u06e2\u06db\u06e8\u06e5\u06d8\u06d9\u06dc\u06e8\u06d8\u06ec\u06db\u06d6\u06ec\u06d9\u06eb\u06d8\u06e5\u06dc\u06d8"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x45

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1fe

    const/16 v2, 0xfc

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2c1

    const/16 v2, 0x20e

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x29b

    const/16 v2, 0x26a

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x256

    const/16 v2, 0x1ae

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1ed

    const/16 v2, 0x398

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x12f

    const/16 v2, 0x321

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x66

    const/16 v2, 0x25e

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x15

    const/16 v2, 0x78

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xf4

    const/16 v2, 0x21d

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3a4

    const/16 v2, 0x124

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x352

    const/16 v2, 0x243

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x1e

    const/16 v2, 0x1cb

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x392

    const/16 v2, 0x105

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x43

    const/16 v2, 0x383

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xfb

    const/16 v2, 0x23e

    const v3, -0x6ace05c9

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06dc\u06e8\u06e8\u06d8\u06db\u06db\u06d8\u06e1\u06e6\u06e6\u06d8\u06e1\u06d7\u06dc\u06d8\u06da\u06d8\u06e6\u06e5\u06d7\u06e4\u06d8\u06d8\u06e8\u06d9\u06da\u06e5\u06d8\u06e7\u06eb\u06dc\u06e6\u06ec\u06e6\u06d8\u06ec\u06db\u06d8\u06d8\u06e5\u06d7\u06ec\u06e1\u06d8\u06d8\u06d7\u06e1\u06e1\u06d8\u06eb\u06e7\u06e8\u06e5\u06d7\u06e8\u06d8\u06dc\u06d6\u06e8\u06e7\u06df\u06e6\u06d8\u06d6\u06e1\u06eb\u06e7\u06dc\u06dc\u06d8\u06df\u06e7\u06d6\u06e1\u06d8\u06e6\u06e8\u06da\u06e2\u06dc\u06e0\u06e1\u06d8\u06df\u06e5\u06e6\u06d8\u06e1\u06d7\u06d7\u06da\u06e6\u06d8\u06d8\u06e4\u06d8\u06df\u06d6\u06d9\u06da\u06e5\u06d6"

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lkentos/loader/Component/DownloadZip$$ExternalSyntheticLambda0;->f$0:Lkentos/loader/Component/DownloadZip;

    invoke-virtual {v0}, Lkentos/loader/Component/DownloadZip;->lambda$onPostExecute$1$kentos-loader-Component-DownloadZip()V

    const-string v0, "\u06d7\u06e1\u06d8\u06d8\u06e8\u06da\u06d6\u06df\u06e1\u06e5\u06d8\u06da\u06df\u06db\u06db\u06d8\u06d8\u06d7\u06df\u06e2\u06d6\u06dc\u06e4\u06db\u06e7\u06d7\u06e5\u06e0\u06db\u06e6\u06d6\u06e5\u06e2\u06d9\u06e0\u06eb\u06d8\u06ec\u06db\u06d6\u06d9\u06e4\u06e7\u06dc\u06e1\u06d8\u06e7\u06df\u06db\u06d7\u06d6\u06e7\u06e7\u06da\u06df\u06d9\u06e1\u06e8\u06e4\u06e1\u06e1\u06d8\u06e8\u06d8\u06e5\u06e6\u06e1\u06d7\u06eb\u06e0\u06e2\u06d9\u06db\u06e5\u06d7\u06e8\u06ec"

    goto :goto_0

    :sswitch_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x5417549a -> :sswitch_2
        -0x37e8308e -> :sswitch_1
        0x428294d1 -> :sswitch_0
    .end sparse-switch
.end method

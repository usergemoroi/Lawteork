.class public final synthetic Lkentos/loader/Component/DownloadZip$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkentos/loader/Component/DownloadZip;

.field public final f$1:Z


# direct methods
.method public synthetic constructor <init>(Lkentos/loader/Component/DownloadZip;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkentos/loader/Component/DownloadZip$$ExternalSyntheticLambda1;->f$0:Lkentos/loader/Component/DownloadZip;

    iput-boolean p2, p0, Lkentos/loader/Component/DownloadZip$$ExternalSyntheticLambda1;->f$1:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    const-string v0, "\u06da\u06d8\u06dc\u06e6\u06db\u06d8\u06e1\u06e8\u06da\u06d6\u06d9\u06d7\u06db\u06e5\u06e2\u06df\u06d6\u06dc\u06ec\u06e6\u06d9\u06e6\u06da\u06d6\u06df\u06e6\u06e7\u06d8\u06e1\u06db\u06e1\u06e0\u06e8\u06d8\u06e6\u06ec\u06eb\u06e5\u06dc\u06d8\u06d8\u06dc\u06d6\u06d8\u06d8\u06df\u06e7\u06e2\u06da\u06d9\u06d9\u06e1\u06db\u06e2\u06d7\u06ec\u06d9\u06e4\u06d7\u06e2\u06d6\u06eb\u06e1\u06e4\u06e1\u06d8\u06da\u06da\u06d8\u06d8\u06db\u06d9\u06e2\u06df\u06e4\u06d6\u06d8\u06da\u06e8\u06d7\u06e1\u06e8\u06e4\u06e2\u06e0\u06dc\u06d8\u06e0\u06e1\u06e4\u06d9\u06db\u06df\u06e6\u06df\u06e0"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x235

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x363

    const/16 v2, 0x20

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x158

    const/16 v2, 0x117

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3d5

    const/16 v2, 0x2d3

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x312

    const/16 v2, 0x28c

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1de

    const/16 v2, 0x3cd

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1fd

    const/16 v2, 0x385

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x23e

    const/16 v2, 0x219

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x9a

    const/16 v2, 0x2ec

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xc4

    const/16 v2, 0x2fd

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2c3

    const/16 v2, 0x2ce

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x128

    const/16 v2, 0x349

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x343

    const/16 v2, 0x292

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x213

    const/16 v2, 0x317

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3e6

    const/16 v2, 0x88

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3c0

    const/16 v2, 0x34f

    const v3, -0x7f7b7db1

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06e1\u06d6\u06da\u06e1\u06e4\u06e5\u06d6\u06e5\u06eb\u06d8\u06db\u06e5\u06d7\u06ec\u06e4\u06da\u06e2\u06e8\u06d9\u06ec\u06e5\u06d8\u06db\u06eb\u06df\u06e4\u06ec\u06e7\u06ec\u06ec\u06e4\u06d6\u06e8\u06e7\u06d6\u06e4\u06df\u06e1\u06e6\u06d7\u06d8\u06ec\u06ec\u06e4\u06e8\u06e1\u06d8\u06d8\u06d9\u06e7\u06e6\u06e1\u06e4\u06dc\u06da\u06df\u06db\u06e6\u06dc\u06ec\u06da\u06e7\u06df\u06e0\u06d6\u06d8\u06e4\u06da\u06df\u06e7\u06e5\u06e8\u06db\u06e7\u06d6\u06ec\u06d9\u06d8\u06db\u06ec\u06df\u06d7\u06d9\u06d8\u06d6\u06e1\u06e5\u06d8\u06d9\u06db\u06e6\u06e5\u06dc\u06d8\u06d8\u06e0\u06d8\u06e5\u06d8\u06e1\u06e7\u06da\u06d6\u06e6\u06e5\u06e2\u06db\u06db\u06e8\u06df\u06e7"

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lkentos/loader/Component/DownloadZip$$ExternalSyntheticLambda1;->f$0:Lkentos/loader/Component/DownloadZip;

    iget-boolean v1, p0, Lkentos/loader/Component/DownloadZip$$ExternalSyntheticLambda1;->f$1:Z

    invoke-virtual {v0, v1}, Lkentos/loader/Component/DownloadZip;->lambda$onPostExecute$0$kentos-loader-Component-DownloadZip(Z)V

    const-string v0, "\u06ec\u06db\u06e7\u06e0\u06d6\u06d8\u06e1\u06e0\u06d7\u06db\u06e1\u06d8\u06da\u06eb\u06d6\u06d8\u06dc\u06d9\u06eb\u06e1\u06e1\u06d8\u06db\u06e5\u06eb\u06e6\u06d7\u06db\u06dc\u06d8\u06e6\u06d8\u06e1\u06db\u06e8\u06ec\u06da\u06d6\u06d8\u06d6\u06e5\u06d8\u06ec\u06e8\u06e6\u06eb\u06d7\u06e8\u06d8\u06e2\u06db\u06db\u06e4\u06e7\u06d9\u06d7\u06d9\u06d6\u06d8\u06d8\u06d7\u06e5\u06d8\u06e1\u06e0\u06db\u06d6\u06e8\u06e1\u06e8\u06e2\u06d9\u06e1\u06e8\u06d7\u06eb\u06d7\u06eb\u06ec\u06eb\u06db\u06e8\u06db\u06e5\u06eb\u06db\u06e7\u06e6\u06e2\u06d7\u06e2\u06e7\u06d9\u06da\u06e2\u06e1\u06ec\u06d9\u06d7\u06eb\u06e5\u06d9\u06d9\u06ec\u06ec\u06d6\u06e1\u06e7\u06da\u06e0\u06e6\u06d8\u06e2\u06db\u06dc\u06d8\u06d6\u06d9\u06d8\u06e2\u06e6\u06ec\u06e1\u06e0\u06d6\u06e0\u06df\u06d7\u06e0\u06e4\u06e5\u06e0\u06e0\u06e2\u06db\u06e4\u06e0\u06e7\u06dc\u06e5\u06d8\u06da\u06df\u06d6"

    goto :goto_0

    :sswitch_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x1a4143fe -> :sswitch_0
        -0xe780474 -> :sswitch_2
        0x3914faae -> :sswitch_1
    .end sparse-switch
.end method

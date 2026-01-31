.class public final synthetic Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda23;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkentos/loader/activity/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lkentos/loader/activity/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda23;->f$0:Lkentos/loader/activity/MainActivity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    const-string v0, "\u06d6\u06e4\u06e8\u06d8\u06db\u06e6\u06df\u06e2\u06d6\u06e1\u06d8\u06e6\u06ec\u06e1\u06d9\u06ec\u06da\u06e4\u06e4\u06d7\u06da\u06e0\u06db\u06ec\u06ec\u06da\u06d6\u06d9\u06e4\u06e5\u06dc\u06e4\u06e6\u06e6\u06d7\u06e0\u06e8\u06e6\u06d7\u06e5\u06db\u06d9\u06e1\u06d8\u06e4\u06d6\u06e2\u06da\u06d8\u06ec\u06e1\u06d9\u06e5\u06eb\u06e5\u06d8\u06dc\u06e6\u06e2\u06e1\u06e2\u06e2\u06e1\u06d6\u06d8\u06d7\u06d8\u06dc\u06d8\u06e1\u06e0\u06e1\u06d8\u06ec\u06e2\u06e1\u06e6\u06eb\u06da\u06d8\u06dc\u06d6\u06d8\u06dc\u06da\u06eb\u06e6\u06e0\u06d9\u06e0\u06e6\u06eb\u06e8\u06dc\u06df"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x1bc

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x1a

    const/16 v2, 0xdf

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x114

    const/16 v2, 0x1c0

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x18c

    const/16 v2, 0xe8

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x18a

    const/16 v2, 0x9e

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2c3

    const/16 v2, 0x182

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x11c

    const/16 v2, 0x2fc

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x317

    const/16 v2, 0x3d3

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2f0

    const/16 v2, 0x1e1

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x28d

    const/16 v2, 0x81

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x5c

    const/16 v2, 0x2c9

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1b9

    const/16 v2, 0x37d

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x207

    const/16 v2, 0x3c0

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x105

    const/16 v2, 0x172

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x88

    const/16 v2, 0x1a3

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1ce

    const/16 v2, 0x279

    const v3, -0x545d2ae8

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06d9\u06d8\u06e0\u06d8\u06e1\u06db\u06e2\u06e6\u06dc\u06d6\u06e2\u06e6\u06e7\u06e0\u06d8\u06d8\u06e0\u06db\u06e5\u06d8\u06e7\u06e7\u06db\u06d7\u06d8\u06d8\u06e4\u06e8\u06db\u06e2\u06d8\u06df\u06e1\u06d9\u06d7\u06e6\u06d8\u06db\u06e4\u06ec\u06ec\u06e0\u06e7\u06e1\u06d8\u06e5\u06e5\u06e7\u06db\u06e6\u06d8\u06d8\u06ec\u06e6\u06e6\u06d8\u06e4\u06ec\u06dc\u06d8\u06e5\u06e7\u06e8\u06d8\u06e1\u06d6\u06e2\u06d7\u06e6\u06e8\u06d8\u06d7\u06e5\u06d7\u06e7\u06d8\u06e1\u06d8\u06d7\u06d8\u06e8\u06d8\u06e0\u06dc\u06d9"

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda23;->f$0:Lkentos/loader/activity/MainActivity;

    invoke-virtual {v0}, Lkentos/loader/activity/MainActivity;->launchbypassNoRootgl()V

    const-string v0, "\u06df\u06d6\u06e5\u06df\u06e1\u06d8\u06d8\u06ec\u06dc\u06e7\u06eb\u06e0\u06e8\u06dc\u06ec\u06e8\u06d8\u06e0\u06d8\u06e1\u06e6\u06d6\u06dc\u06d8\u06e2\u06df\u06e6\u06d6\u06d7\u06e1\u06d9\u06eb\u06da\u06e4\u06df\u06da\u06e8\u06d7\u06e1\u06d8\u06e2\u06e7\u06e5\u06e1\u06ec\u06e7\u06e5\u06d7\u06e5\u06d8\u06eb\u06d9\u06da\u06e6\u06e6\u06e1\u06d8\u06d7\u06da\u06d8\u06e4\u06e2\u06d6\u06d8\u06d8\u06e8\u06e0\u06d7\u06ec\u06e1\u06d8\u06e8\u06ec\u06e1\u06eb\u06e5\u06d8\u06e2\u06e4\u06e4\u06d8\u06df\u06e8\u06e6\u06e7\u06da\u06d8\u06db\u06dc\u06e0\u06eb\u06e6\u06e8\u06e2\u06eb\u06da\u06d8"

    goto :goto_0

    :sswitch_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1cf7bec3 -> :sswitch_1
        0x53ba6de1 -> :sswitch_0
        0x7193b5c0 -> :sswitch_2
    .end sparse-switch
.end method

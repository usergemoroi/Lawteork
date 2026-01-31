.class public final synthetic Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda14;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkentos/loader/activity/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lkentos/loader/activity/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda14;->f$0:Lkentos/loader/activity/MainActivity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    const-string v0, "\u06e0\u06d7\u06e8\u06e1\u06ec\u06dc\u06e7\u06da\u06da\u06e1\u06e4\u06d7\u06da\u06e0\u06e6\u06d9\u06da\u06d7\u06e6\u06d7\u06e6\u06dc\u06e5\u06d8\u06d7\u06e0\u06eb\u06ec\u06d7\u06e8\u06d8\u06e2\u06d8\u06d9\u06dc\u06e6\u06df\u06e0\u06e2\u06d8\u06dc\u06dc\u06d8\u06e6\u06d6\u06e5\u06d8\u06e4\u06e7\u06e2\u06d8\u06e8\u06e7\u06e6\u06e0\u06db\u06e8\u06ec\u06e5\u06e7\u06e8\u06e4\u06eb\u06e0\u06e8\u06ec\u06db\u06d8\u06da\u06d7\u06e8\u06d8\u06ec\u06db\u06ec\u06dc\u06df\u06e6\u06d8\u06ec\u06d8\u06d9\u06e1\u06d7\u06ec\u06da\u06e7\u06dc\u06d8\u06e7\u06e5\u06e7\u06d8\u06e4\u06e5\u06e5\u06d8\u06db\u06e8\u06d8\u06d8\u06e2\u06dc\u06e5\u06d8\u06df\u06e5\u06dc\u06d8\u06db\u06e6\u06df\u06d9\u06e7\u06e4\u06db\u06d7\u06eb\u06d8\u06eb\u06e5\u06d8\u06d6\u06e4\u06e7\u06da\u06e7\u06e6\u06ec\u06e8\u06d8\u06d8"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x2ea

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3f0

    const/16 v2, 0xb2

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3f3

    const/16 v2, 0x23b

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0xd

    const/16 v2, 0x2d9

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x101

    const/16 v2, 0x221

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x12c

    const/16 v2, 0x4b

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x3c

    const/16 v2, 0x29a

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3d5

    const/16 v2, 0x17f

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x28

    const/16 v2, 0x107

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x9

    const/16 v2, 0x1ec

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x146

    const/16 v2, 0x220

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x141

    const/16 v2, 0x256

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x66

    const/16 v2, 0x384

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x28f

    const/16 v2, 0x1d0

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x9d

    const/16 v2, 0x12d

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x141

    const/16 v2, 0x324

    const v3, 0x67797abe

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06dc\u06d9\u06e7\u06d8\u06db\u06e1\u06df\u06d8\u06df\u06e8\u06ec\u06e5\u06d8\u06db\u06d8\u06d8\u06e0\u06df\u06e8\u06e7\u06d8\u06d6\u06d8\u06e2\u06db\u06d7\u06e8\u06db\u06e5\u06d8\u06e1\u06e1\u06df\u06e0\u06df\u06dc\u06d8\u06e5\u06dc\u06e5\u06d8\u06d9\u06e7\u06e5\u06d8\u06e6\u06da\u06e1\u06e2\u06eb\u06e2\u06e2\u06eb\u06e2\u06da\u06da\u06d6\u06d6\u06e7\u06e2\u06d9\u06d9\u06e5\u06da\u06e5\u06e6\u06e4\u06e2\u06e8\u06d8\u06d8\u06eb\u06d9\u06e6\u06e7\u06eb\u06dc\u06d7\u06d8\u06da\u06d6\u06db\u06e0\u06e2\u06db\u06ec\u06da\u06e1\u06d8\u06e1\u06d8\u06da\u06d9\u06e2\u06e6\u06d8\u06db\u06da\u06df"

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda14;->f$0:Lkentos/loader/activity/MainActivity;

    invoke-static {v0}, Lkentos/loader/activity/MainActivity;->lambda$installGameWithObb$12(Lkentos/loader/activity/MainActivity;)V

    const-string v0, "\u06d6\u06e2\u06e8\u06d7\u06d7\u06e2\u06e4\u06df\u06e2\u06ec\u06e4\u06d6\u06d8\u06da\u06d6\u06e7\u06db\u06e8\u06e6\u06d8\u06e4\u06db\u06ec\u06e4\u06e8\u06e8\u06d8\u06eb\u06ec\u06df\u06df\u06e7\u06e5\u06d8\u06da\u06e4\u06e7\u06e2\u06e5\u06eb\u06d9\u06df\u06e2\u06ec\u06e0\u06da\u06e1\u06e8\u06e7\u06e8\u06e8\u06e5\u06dc\u06e4\u06d6\u06e8\u06d8\u06e5\u06d8\u06e6\u06e6\u06e1\u06db\u06eb\u06e2\u06e6\u06d8\u06da\u06d6\u06d7\u06e6\u06e5\u06df\u06eb\u06ec\u06d6\u06db\u06e5\u06ec"

    goto :goto_0

    :sswitch_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x2e300cab -> :sswitch_1
        0x38ee61ff -> :sswitch_2
        0x3ff777f1 -> :sswitch_0
    .end sparse-switch
.end method

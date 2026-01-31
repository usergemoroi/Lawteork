.class public final synthetic Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda12;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkentos/loader/activity/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lkentos/loader/activity/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda12;->f$0:Lkentos/loader/activity/MainActivity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    const/16 v4, 0x83

    const-string v0, "\u06eb\u06e8\u06d9\u06df\u06ec\u06d6\u06d8\u06d8\u06d9\u06e1\u06d8\u06dc\u06e1\u06e5\u06d7\u06dc\u06d9\u06e6\u06df\u06d6\u06da\u06e7\u06e6\u06d8\u06e7\u06df\u06e0\u06db\u06e7\u06e8\u06ec\u06d7\u06eb\u06eb\u06db\u06ec\u06e7\u06e7\u06e1\u06d8\u06df\u06da\u06e7\u06d8\u06d7\u06eb\u06d7\u06d9\u06e6\u06e8\u06ec\u06da\u06e2\u06dc\u06dc\u06df\u06df\u06d8\u06e4\u06d6\u06df\u06eb\u06e2\u06dc\u06e6\u06e8\u06d6\u06db\u06eb\u06e8\u06dc\u06ec\u06dc\u06e8\u06e2\u06e6\u06e5\u06e0\u06e8\u06e5\u06e2\u06e1\u06e2\u06e6\u06df\u06db\u06e1\u06e8\u06e1\u06e2\u06da\u06e8\u06ec\u06df\u06d6\u06e5\u06dc\u06d6\u06e1\u06d8\u06df\u06e5\u06e6\u06db\u06e5\u06e5\u06da\u06e7\u06dc\u06d8\u06e4\u06dc\u06df\u06e5\u06dc\u06db\u06dc\u06dc\u06d6\u06d8\u06d6\u06e4\u06da\u06e0\u06d8\u06d6"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x4f

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x50

    const/16 v2, 0x275

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xbb

    const/16 v2, 0x16d

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xe2

    const/16 v2, 0x329

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x98

    const/16 v2, 0x1a4

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x234

    const/16 v2, 0x136

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3af

    const/16 v2, 0x2c

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2bb

    const/16 v2, 0xf6

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x98

    xor-int/2addr v1, v4

    xor-int/lit16 v1, v1, 0x1f7

    const/16 v2, 0x1ec

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2bc

    const/16 v2, 0x91

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2c5

    const/16 v2, 0x45

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2b4

    const/16 v2, 0x219

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x5a

    const/16 v2, 0x6a

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1eb

    xor-int/2addr v1, v4

    xor-int/lit16 v1, v1, 0x2da

    const/16 v2, 0x186

    const v3, -0x5faf6009

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06dc\u06e2\u06e5\u06db\u06e7\u06e5\u06d8\u06d6\u06db\u06e4\u06d6\u06d6\u06e8\u06d9\u06e1\u06da\u06e4\u06ec\u06d8\u06dc\u06e6\u06d8\u06e6\u06dc\u06eb\u06e2\u06e4\u06d6\u06dc\u06d9\u06e2\u06e4\u06e6\u06d8\u06d7\u06e8\u06e1\u06e8\u06e2\u06df\u06dc\u06e1\u06e6\u06d8\u06e6\u06e2\u06e6\u06d8\u06d7\u06e6\u06e7\u06d8\u06dc\u06da\u06e6\u06d8\u06d9\u06e4\u06d6\u06db\u06e7\u06d7\u06d6\u06da\u06e1\u06e2\u06e0\u06e6\u06eb\u06e7\u06ec\u06e1\u06e7\u06e5\u06d8\u06d9\u06eb\u06ec\u06e6\u06df\u06e7\u06d7\u06ec\u06e4\u06d9\u06e7\u06eb\u06eb\u06e7\u06d9\u06dc\u06ec\u06e6\u06d9\u06e8\u06e7\u06e8\u06e7\u06e2\u06e7\u06e1\u06d8\u06e6\u06ec\u06dc\u06e0\u06d7\u06d9\u06da\u06d7\u06e4"

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda12;->f$0:Lkentos/loader/activity/MainActivity;

    invoke-static {v0}, Lkentos/loader/activity/MainActivity;->lambda$installGameWithObb$10(Lkentos/loader/activity/MainActivity;)V

    const-string v0, "\u06e8\u06e8\u06e1\u06da\u06e2\u06da\u06da\u06e6\u06d8\u06d8\u06da\u06e6\u06d6\u06d8\u06d8\u06e6\u06e8\u06d8\u06e8\u06db\u06d8\u06d8\u06db\u06e1\u06e4\u06da\u06da\u06d6\u06e1\u06e8\u06e8\u06d8\u06d6\u06ec\u06e4\u06e5\u06d6\u06d7\u06e2\u06da\u06dc\u06d8\u06db\u06e7\u06e7\u06df\u06e6\u06e7\u06d8\u06e5\u06d8\u06dc\u06d8\u06e7\u06e0\u06e1\u06e6\u06e8\u06db\u06e4\u06df\u06dc\u06d8\u06d6\u06d8\u06dc\u06e6\u06db\u06d9\u06e7\u06e4\u06e8\u06d8\u06dc\u06d7\u06e8\u06d8\u06d9\u06e5\u06e7\u06d8\u06d9\u06e0\u06e7\u06d7\u06d9\u06e1\u06d8\u06db\u06eb\u06d6\u06d8\u06da\u06ec\u06e0\u06da\u06e2\u06e6\u06e0\u06e2\u06e8\u06e6\u06d9"

    goto :goto_0

    :sswitch_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x604e0836 -> :sswitch_1
        -0x51aaee4f -> :sswitch_0
        0x6b6f2304 -> :sswitch_2
    .end sparse-switch
.end method

.class public final synthetic Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda24;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkentos/loader/activity/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lkentos/loader/activity/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda24;->f$0:Lkentos/loader/activity/MainActivity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    const-string v0, "\u06da\u06da\u06d9\u06d6\u06ec\u06e6\u06e6\u06e4\u06d7\u06df\u06d6\u06ec\u06e2\u06d7\u06ec\u06db\u06e8\u06ec\u06e4\u06eb\u06e5\u06d7\u06e8\u06ec\u06e5\u06e1\u06e6\u06ec\u06d6\u06e6\u06d8\u06d6\u06d9\u06d9\u06e6\u06e6\u06dc\u06d8\u06e7\u06e2\u06e8\u06e0\u06e8\u06e6\u06d8\u06d7\u06ec\u06dc\u06e2\u06d9\u06e1\u06d8\u06ec\u06dc\u06ec\u06db\u06db\u06e0\u06e1\u06e4\u06e6\u06dc\u06eb\u06df\u06e2\u06e8\u06e4\u06e4\u06e0\u06e5\u06da\u06e2\u06e8\u06e4\u06d6\u06d6\u06e7\u06dc\u06d8\u06d8\u06e4\u06e0\u06e1\u06dc\u06d9\u06e5\u06e8\u06e8\u06d6\u06e7\u06eb\u06d7\u06df\u06e4\u06e1"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x163

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x23c

    const/16 v2, 0x141

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3a9

    const/16 v2, 0x9c

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2c1

    const/16 v2, 0x2c8

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x321

    const/16 v2, 0xe2

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x5c

    const/16 v2, 0x34d

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1af

    const/16 v2, 0xee

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1c1

    const/16 v2, 0x3ac

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x44

    const/16 v2, 0x1ca

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xde

    const/16 v2, 0x33

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x83

    const/4 v2, 0x0

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1ff

    const/16 v2, 0x257

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0xe

    const/4 v2, 0x2

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2fb

    const/16 v2, 0xab

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x32c

    const/16 v2, 0x3c5

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x160

    const/16 v2, 0x209

    const v3, -0x2dbbdacf

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06dc\u06e7\u06ec\u06dc\u06d6\u06e5\u06d8\u06d7\u06d7\u06d9\u06d9\u06e1\u06e6\u06d8\u06e4\u06e5\u06e8\u06d8\u06eb\u06db\u06da\u06db\u06df\u06d9\u06e8\u06e1\u06e5\u06eb\u06da\u06dc\u06eb\u06eb\u06d6\u06db\u06e2\u06ec\u06e4\u06e2\u06df\u06e1\u06e1\u06e8\u06d9\u06db\u06eb\u06d6\u06d8\u06e8\u06db\u06e6\u06ec\u06da\u06dc\u06d8\u06e0\u06e1\u06e0\u06e0\u06da\u06d6\u06e5\u06e5\u06e0\u06ec\u06e5\u06e1\u06d8\u06d8\u06df\u06e6\u06e8\u06d6\u06da\u06da\u06e4\u06df\u06db\u06d7\u06e1\u06e5\u06eb\u06d8\u06d9\u06dc\u06d8\u06e2\u06d8\u06e1\u06e5\u06d6\u06e5\u06d7\u06df\u06eb\u06d8\u06d7\u06ec\u06e5\u06e2\u06e0\u06d9\u06e7\u06dc\u06d8\u06db\u06d8\u06e5\u06e1\u06e8\u06e5\u06eb\u06dc\u06e5\u06e7\u06e2\u06d6\u06e4\u06e7\u06d6\u06d7\u06ec\u06d8\u06e7\u06dc\u06d8"

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda24;->f$0:Lkentos/loader/activity/MainActivity;

    invoke-virtual {v0}, Lkentos/loader/activity/MainActivity;->launchbypassNoRootkr()V

    const-string v0, "\u06e7\u06e2\u06df\u06db\u06da\u06d6\u06db\u06e0\u06db\u06db\u06d8\u06ec\u06d9\u06e0\u06e5\u06df\u06d6\u06dc\u06d8\u06db\u06e5\u06e0\u06ec\u06e6\u06e7\u06e5\u06ec\u06ec\u06eb\u06dc\u06e1\u06d8\u06d6\u06d7\u06e4\u06e5\u06e7\u06e7\u06dc\u06e8\u06d8\u06df\u06eb\u06d6\u06d8\u06e8\u06d7\u06dc\u06e0\u06dc\u06db\u06d8\u06e8\u06d7\u06e0\u06e6\u06e7\u06e5\u06e8\u06e6\u06d8\u06d8\u06d9\u06e2\u06d8\u06d7\u06e7\u06e0\u06d6\u06d8\u06eb\u06d9\u06e5\u06e6\u06df\u06e4\u06e4\u06d9\u06e4"

    goto :goto_0

    :sswitch_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x5e713bd4 -> :sswitch_0
        -0x3c26728f -> :sswitch_2
        0x29465d3c -> :sswitch_1
    .end sparse-switch
.end method

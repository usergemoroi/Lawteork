.class public final synthetic Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda18;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkentos/loader/activity/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lkentos/loader/activity/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda18;->f$0:Lkentos/loader/activity/MainActivity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    const/16 v4, 0x3c7

    const/16 v3, 0x176

    const-string v0, "\u06e4\u06df\u06e7\u06e7\u06d9\u06d8\u06e8\u06d9\u06dc\u06e7\u06e6\u06d8\u06db\u06e4\u06e5\u06db\u06e0\u06d6\u06d8\u06e6\u06e1\u06d7\u06ec\u06ec\u06d6\u06e8\u06e7\u06e8\u06d8\u06e5\u06db\u06e5\u06ec\u06eb\u06e0\u06ec\u06e4\u06e5\u06e6\u06dc\u06dc\u06d8\u06dc\u06e7\u06e8\u06d8\u06d6\u06e1\u06e2\u06e5\u06db\u06eb\u06d9\u06e2\u06e6\u06d8\u06d7\u06eb\u06e4\u06db\u06ec\u06eb\u06d6\u06d7\u06e6\u06e2\u06dc\u06e7\u06d8\u06da\u06e7\u06d9\u06e1\u06d7\u06e6\u06e8\u06e2\u06df\u06d6\u06e2\u06e0\u06e2\u06da\u06e4\u06d8\u06e4\u06db\u06e8\u06e7\u06d7\u06e6\u06e7\u06e1\u06e5\u06da\u06db\u06e0\u06e5\u06d6\u06d6\u06e6\u06e5\u06db\u06e7\u06e8\u06e6\u06d8\u06d8\u06d9\u06d8\u06ec\u06dc\u06dc\u06d8\u06ec\u06da\u06eb\u06d6\u06d6\u06e1\u06db\u06e5\u06d8\u06e6\u06e7\u06e4\u06eb\u06da\u06dc\u06d8\u06e2\u06dc\u06da\u06dc\u06d8\u06d6\u06d9\u06d8\u06d8\u06e8\u06da\u06e7"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x286

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1b5

    xor-int/2addr v1, v4

    xor-int/lit16 v1, v1, 0x2e1

    const/16 v2, 0x296

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x28

    const/16 v2, 0x85

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x10e

    const/16 v2, 0x317

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x29a

    const/16 v2, 0x32f

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x39b

    const/16 v2, 0x31a

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x303

    const/16 v2, 0x368

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xa0

    xor-int/2addr v1, v3

    xor-int/lit16 v1, v1, 0x388

    const/16 v2, 0x3c0

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1f9

    const/16 v2, 0x280

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x324

    xor-int/2addr v1, v4

    xor-int/lit16 v1, v1, 0x102

    const/16 v2, 0x240

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x6a

    const/16 v2, 0x147

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x338

    const/16 v2, 0x90

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3b8

    const v2, 0x226445ce

    xor-int/2addr v1, v3

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06e6\u06d6\u06e6\u06d8\u06da\u06df\u06e7\u06eb\u06d6\u06dc\u06dc\u06d6\u06e2\u06df\u06d6\u06e4\u06e6\u06dc\u06db\u06e2\u06dc\u06d6\u06e6\u06e8\u06e1\u06e6\u06e2\u06df\u06d8\u06dc\u06e6\u06d6\u06e4\u06df\u06df\u06ec\u06e8\u06e2\u06e6\u06dc\u06d8\u06e6\u06e8\u06e0\u06e7\u06dc\u06e1\u06d8\u06dc\u06e6\u06d8\u06da\u06e8\u06d7\u06dc\u06dc\u06eb\u06e8\u06e0\u06ec\u06e1\u06e8\u06d7\u06dc\u06df\u06e7\u06e4\u06e6\u06ec\u06db\u06e7\u06d8\u06d8\u06dc\u06df\u06d6\u06e8\u06db"

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda18;->f$0:Lkentos/loader/activity/MainActivity;

    invoke-virtual {v0}, Lkentos/loader/activity/MainActivity;->lambda$runBypassCmd$9$kentos-loader-activity-MainActivity()V

    const-string v0, "\u06e1\u06e5\u06e6\u06d8\u06d6\u06d9\u06d8\u06df\u06e5\u06d6\u06e6\u06e1\u06e1\u06db\u06d7\u06dc\u06d6\u06e6\u06e7\u06d8\u06e1\u06e1\u06e0\u06da\u06da\u06e5\u06df\u06db\u06e4\u06e1\u06ec\u06df\u06d9\u06dc\u06dc\u06d9\u06da\u06e0\u06ec\u06db\u06e1\u06d8\u06e7\u06dc\u06db\u06d8\u06e7\u06d8\u06d8\u06d9\u06da\u06e0\u06e8\u06df\u06e2\u06dc\u06e2\u06d8\u06d7\u06e1\u06df\u06e4\u06df\u06e5\u06df\u06d9\u06df\u06e4\u06da\u06d6\u06d8\u06d9\u06e0\u06e6\u06e4\u06d7\u06dc\u06e8\u06e1\u06e7\u06d8"

    goto :goto_0

    :sswitch_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x49e375b7 -> :sswitch_2
        -0x2586b524 -> :sswitch_1
        0x544ff4d9 -> :sswitch_0
    .end sparse-switch
.end method

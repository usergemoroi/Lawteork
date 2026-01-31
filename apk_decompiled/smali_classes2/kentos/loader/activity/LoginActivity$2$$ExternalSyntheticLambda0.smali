.class public final synthetic Lkentos/loader/activity/LoginActivity$2$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkentos/loader/activity/LoginActivity$2;


# direct methods
.method public synthetic constructor <init>(Lkentos/loader/activity/LoginActivity$2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkentos/loader/activity/LoginActivity$2$$ExternalSyntheticLambda0;->f$0:Lkentos/loader/activity/LoginActivity$2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    const-string v0, "\u06d9\u06eb\u06e5\u06d8\u06df\u06e6\u06d8\u06da\u06e5\u06d8\u06d8\u06d8\u06df\u06e8\u06d8\u06dc\u06e5\u06db\u06dc\u06e5\u06ec\u06da\u06e6\u06e5\u06d8\u06d7\u06da\u06ec\u06df\u06da\u06e1\u06e8\u06e5\u06dc\u06d8\u06e7\u06d8\u06e5\u06e0\u06e2\u06df\u06ec\u06df\u06e6\u06d8\u06d7\u06db\u06e0\u06e4\u06df\u06d7\u06d9\u06db\u06e4\u06e4\u06df\u06ec\u06db\u06e8\u06d7\u06e8\u06d8\u06e5\u06e6\u06e1\u06d8\u06d7\u06eb\u06e5\u06d8\u06e1\u06d9\u06e5\u06d6\u06d8\u06e5\u06e2\u06d8\u06eb\u06e2\u06d7\u06d8\u06e6\u06d9\u06d6\u06dc\u06e6\u06db\u06d7\u06eb\u06dc\u06d8\u06d7\u06e5\u06db\u06e1\u06d9\u06da\u06df\u06d8\u06dc\u06e2\u06eb\u06e1\u06d8\u06e7\u06e8\u06d7\u06d7\u06e5\u06d8\u06da\u06e5\u06e5\u06d8\u06e2\u06dc\u06dc\u06d8\u06eb\u06d6\u06e1\u06e5\u06d8\u06eb\u06d6\u06ec\u06e4\u06df"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x1d2

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x63

    const/16 v2, 0x193

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x188

    const/16 v2, 0x182

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3c4

    const/16 v2, 0x85

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x363

    const/16 v2, 0x21d

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0xb

    const/16 v2, 0x163

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xa3

    const/16 v2, 0x18d

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3fb

    const/16 v2, 0x3e6

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x221

    const/16 v2, 0xce

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x183

    const/16 v2, 0x8a

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2d3

    const/16 v2, 0x297

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xef

    const/16 v2, 0x143

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x20

    const/16 v2, 0x289

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xa2

    const/16 v2, 0xe0

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x174

    const/16 v2, 0x255

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x33

    const/16 v2, 0x12b

    const v3, -0x43b03064

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06ec\u06e1\u06d8\u06e2\u06e0\u06e8\u06d8\u06dc\u06e8\u06d7\u06ec\u06da\u06d8\u06d8\u06e0\u06dc\u06d7\u06d9\u06d7\u06e5\u06df\u06e4\u06e8\u06e4\u06e0\u06dc\u06d6\u06e2\u06db\u06d6\u06da\u06d9\u06da\u06e2\u06db\u06da\u06df\u06df\u06e8\u06e5\u06e6\u06e0\u06d8\u06d8\u06da\u06e8\u06da\u06d6\u06e2\u06dc\u06da\u06da\u06ec\u06eb\u06df\u06e4\u06e7\u06e5\u06db\u06e0\u06d9\u06da\u06e2\u06e8\u06e1\u06d7\u06e6\u06d8\u06e2\u06e1\u06e4\u06e7\u06d6\u06dc\u06df\u06e2\u06e4"

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lkentos/loader/activity/LoginActivity$2$$ExternalSyntheticLambda0;->f$0:Lkentos/loader/activity/LoginActivity$2;

    invoke-virtual {v0}, Lkentos/loader/activity/LoginActivity$2;->lambda$onClick$0$kentos-loader-activity-LoginActivity$2()V

    const-string v0, "\u06db\u06da\u06e4\u06e5\u06e6\u06e2\u06df\u06d8\u06e8\u06d9\u06eb\u06e2\u06e5\u06d8\u06e1\u06d7\u06dc\u06e1\u06d8\u06e1\u06db\u06e2\u06d6\u06e0\u06e1\u06d8\u06d9\u06e7\u06dc\u06d8\u06da\u06eb\u06df\u06d7\u06df\u06d7\u06dc\u06d7\u06eb\u06e7\u06e5\u06e7\u06dc\u06e8\u06eb\u06e0\u06d9\u06d9\u06d7\u06d7\u06e7\u06e5\u06e0\u06e1\u06d8\u06d6\u06ec\u06e4\u06ec\u06e8\u06db\u06e0\u06e6\u06e1\u06e5\u06e6\u06d9\u06d9\u06dc\u06e1\u06eb\u06d7\u06d8\u06d8\u06e7\u06d9\u06e5\u06dc\u06e1\u06e0\u06dc\u06ec\u06e1\u06e0\u06d8\u06da\u06e0\u06d6\u06e0\u06e7\u06da\u06e5\u06d8\u06e2\u06e6\u06e0\u06e2\u06db\u06e8\u06d8\u06d8\u06e8\u06e6\u06e1\u06d6\u06e8\u06e4\u06e6\u06db\u06e2\u06ec\u06e6\u06db\u06da\u06e1\u06e0\u06e4\u06d8\u06d8\u06d6\u06eb\u06e8\u06d8\u06e7\u06d8\u06dc\u06eb\u06ec"

    goto :goto_0

    :sswitch_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x5058eb01 -> :sswitch_2
        -0x28d5909a -> :sswitch_1
        -0x1452a56d -> :sswitch_0
    .end sparse-switch
.end method

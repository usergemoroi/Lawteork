.class Lkentos/loader/floating/Overlay$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkentos/loader/floating/Overlay;->Start()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final this$0:Lkentos/loader/floating/Overlay;


# direct methods
.method constructor <init>(Lkentos/loader/floating/Overlay;)V
    .locals 0

    iput-object p1, p0, Lkentos/loader/floating/Overlay$1;->this$0:Lkentos/loader/floating/Overlay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    const-string v0, "\u06da\u06d6\u06e4\u06e0\u06d9\u06e6\u06d8\u06d7\u06ec\u06d6\u06d8\u06ec\u06ec\u06e6\u06d8\u06d9\u06e5\u06e1\u06d8\u06eb\u06d9\u06d8\u06d8\u06e2\u06e7\u06d6\u06e7\u06df\u06d9\u06e4\u06eb\u06eb\u06df\u06dc\u06e1\u06df\u06e6\u06df\u06d6\u06df\u06e6\u06d6\u06d6\u06eb\u06df\u06e0\u06e5\u06d8\u06ec\u06d7\u06ec\u06e2\u06db\u06d9\u06dc\u06e5\u06e6\u06d8\u06e1\u06e4\u06d6\u06d8\u06df\u06d7\u06da\u06e5\u06ec\u06d7\u06eb\u06dc\u06e1\u06df\u06d8\u06d6\u06d8\u06e8\u06e6\u06d7\u06d6\u06ec\u06d7\u06dc\u06e2\u06db\u06d6\u06e7\u06e4\u06e2\u06e7\u06e1\u06d8\u06e0\u06e2\u06df\u06eb\u06e4\u06e8\u06d8\u06e2\u06e8\u06e7\u06d8\u06e4\u06db\u06da\u06d6\u06e2\u06e8\u06e2\u06e5\u06e5\u06d8\u06da\u06eb\u06e6\u06da\u06e0\u06e5\u06e4\u06dc\u06e7\u06d8\u06db\u06e7\u06d7\u06e1\u06e7\u06df\u06e6\u06db\u06e8\u06e7\u06db\u06e1\u06e4\u06ec\u06eb\u06d9\u06df\u06e1\u06e0\u06ec\u06d9\u06e5\u06e1\u06d8\u06e6\u06e2"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x61

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3ad

    const/16 v2, 0x372

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3a5

    const/16 v2, 0x75

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x19b

    const/16 v2, 0x4c

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1e3

    const/16 v2, 0x198

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x161

    const/16 v2, 0x3b5

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3e2

    const/16 v2, 0xfc

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x10f

    const/16 v2, 0x3d8

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x18f

    const/16 v2, 0x251

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x28d

    const/16 v2, 0x3bf

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x129

    const/16 v2, 0x343

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xd7

    const/16 v2, 0xa7

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x340

    const/16 v2, 0x1ca

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3e7

    const/16 v2, 0x3ca

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x188

    const/16 v2, 0x107

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xa0

    const/16 v2, 0xe

    const v3, 0x620984ef

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06df\u06e5\u06e0\u06e1\u06dc\u06e2\u06eb\u06e2\u06d9\u06e6\u06d6\u06e5\u06d6\u06eb\u06db\u06e6\u06e8\u06e2\u06e1\u06dc\u06e8\u06da\u06d9\u06d8\u06d6\u06d6\u06e4\u06e2\u06ec\u06d9\u06e8\u06e1\u06e6\u06d8\u06d6\u06d8\u06db\u06d9\u06dc\u06e7\u06e5\u06dc\u06d8\u06d8\u06da\u06eb\u06d6\u06d9\u06eb\u06e0\u06e0\u06e4\u06e8\u06d8\u06d8\u06df\u06d9\u06e5\u06d8\u06d9\u06e5\u06eb\u06df\u06e5\u06e0\u06e4\u06e6\u06e7\u06e0\u06d9\u06d6\u06da\u06df\u06d8\u06e2\u06e5\u06e0\u06e2\u06d6\u06eb\u06dc\u06e7\u06ec\u06e5\u06d6\u06e8\u06d8\u06eb\u06d8\u06d8\u06d7\u06d9\u06d6\u06d8\u06e5\u06eb\u06e5\u06d8\u06df\u06ec\u06e8\u06dc\u06d7\u06df\u06e6\u06e4\u06e4\u06db\u06dc\u06e7\u06d8"

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lkentos/loader/floating/Overlay$1;->this$0:Lkentos/loader/floating/Overlay;

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->access$000(Lkentos/loader/floating/Overlay;)Z

    const-string v0, "\u06ec\u06e7\u06e6\u06da\u06e8\u06e2\u06d9\u06e4\u06dc\u06e4\u06d9\u06e4\u06dc\u06df\u06d9\u06dc\u06eb\u06e0\u06e8\u06d9\u06da\u06db\u06dc\u06e5\u06e0\u06e1\u06e5\u06da\u06e4\u06e8\u06ec\u06e6\u06e1\u06df\u06eb\u06db\u06d6\u06df\u06e8\u06e7\u06e1\u06e4\u06e1\u06d9\u06e5\u06db\u06dc\u06e1\u06e8\u06e2\u06d6\u06d8\u06ec\u06e4\u06e6\u06df\u06d6\u06d8\u06d8\u06e4\u06db\u06d8\u06dc\u06ec\u06d7\u06d6\u06e8\u06db\u06e1\u06e4\u06e4\u06e4\u06e6\u06d8\u06df\u06dc\u06e5"

    goto :goto_0

    :sswitch_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7f5d9b44 -> :sswitch_2
        -0x426a0719 -> :sswitch_0
        0x30570559 -> :sswitch_1
    .end sparse-switch
.end method

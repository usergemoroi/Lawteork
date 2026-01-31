.class Lkentos/loader/activity/LoginActivity$3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkentos/loader/activity/LoginActivity;->initDesign()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final this$0:Lkentos/loader/activity/LoginActivity;


# direct methods
.method constructor <init>(Lkentos/loader/activity/LoginActivity;)V
    .locals 0

    iput-object p1, p0, Lkentos/loader/activity/LoginActivity$3;->this$0:Lkentos/loader/activity/LoginActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    const/4 v1, 0x0

    const-string v0, "\u06d8\u06db\u06d9\u06db\u06e5\u06e6\u06e0\u06db\u06da\u06d9\u06e7\u06e6\u06d8\u06d8\u06e8\u06d8\u06e0\u06eb\u06e6\u06eb\u06dc\u06e7\u06eb\u06e0\u06eb\u06db\u06dc\u06d8\u06d8\u06e2\u06df\u06e1\u06db\u06dc\u06ec\u06e7\u06d7\u06ec\u06e7\u06e1\u06e1\u06d8\u06e6\u06eb\u06ec\u06d6\u06e5\u06d8\u06dc\u06d6\u06e6\u06db\u06e6\u06e4\u06e1\u06dc\u06d7\u06e4\u06dc\u06e8\u06da\u06e5\u06e8\u06d8\u06dc\u06e5\u06d7\u06ec\u06db\u06e6\u06d8\u06d7\u06dc\u06e6\u06d8\u06df\u06df\u06e4\u06e2\u06e2\u06e2\u06e5\u06e5\u06d8\u06e1\u06e6\u06e6\u06e8\u06da\u06d9\u06d9\u06e5\u06d6\u06d8\u06d9\u06d9\u06dc"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/16 v3, 0xf4

    xor-int/2addr v2, v3

    xor-int/lit16 v2, v2, 0x3b4

    const/16 v3, 0x24a

    xor-int/2addr v2, v3

    xor-int/lit16 v2, v2, 0xbf

    const/16 v3, 0x2dc

    xor-int/2addr v2, v3

    xor-int/lit16 v2, v2, 0x3b1

    const/16 v3, 0x210

    xor-int/2addr v2, v3

    xor-int/lit8 v2, v2, 0x27

    const/16 v3, 0xde

    xor-int/2addr v2, v3

    xor-int/lit16 v2, v2, 0x369

    const/16 v3, 0x23

    xor-int/2addr v2, v3

    xor-int/lit16 v2, v2, 0xe1

    const/16 v3, 0x44

    xor-int/2addr v2, v3

    xor-int/lit16 v2, v2, 0x195

    const/16 v3, 0x22c

    xor-int/2addr v2, v3

    xor-int/lit16 v2, v2, 0x28a

    const/16 v3, 0x31a

    xor-int/2addr v2, v3

    xor-int/lit8 v2, v2, 0x63

    const/16 v3, 0x26d

    xor-int/2addr v2, v3

    xor-int/lit16 v2, v2, 0x176

    const/16 v3, 0x287

    xor-int/2addr v2, v3

    xor-int/lit16 v2, v2, 0x3fe

    const/16 v3, 0x15d

    xor-int/2addr v2, v3

    xor-int/lit16 v2, v2, 0xa5

    const/16 v3, 0x36a

    xor-int/2addr v2, v3

    xor-int/lit16 v2, v2, 0x299

    const/16 v3, 0x58

    xor-int/2addr v2, v3

    xor-int/lit16 v2, v2, 0x16b

    const/16 v3, 0x8a

    xor-int/2addr v2, v3

    xor-int/lit16 v2, v2, 0x3ea

    const/16 v3, 0x33f

    const v4, -0x4eec1647

    xor-int/2addr v2, v3

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06e6\u06dc\u06e7\u06d8\u06dc\u06e1\u06e4\u06e7\u06e8\u06e7\u06d8\u06e2\u06da\u06e7\u06e4\u06d9\u06d9\u06d6\u06d7\u06e1\u06d6\u06e5\u06d9\u06e0\u06df\u06d8\u06d9\u06e6\u06e8\u06d9\u06e0\u06d6\u06d8\u06db\u06d8\u06e8\u06e4\u06d6\u06dc\u06d8\u06dc\u06e5\u06d6\u06d9\u06e0\u06db\u06e2\u06e8\u06d9\u06e5\u06e0\u06e1\u06dc\u06e6\u06d8\u06eb\u06d8\u06e1\u06d8\u06e4\u06e0\u06e1\u06d8\u06e2\u06e6\u06e8\u06d8\u06e0\u06dc\u06e4\u06e1\u06d8\u06e5\u06e4\u06d6\u06da\u06da\u06e2\u06db\u06e7\u06e1\u06ec\u06d9\u06eb\u06db\u06e0\u06e6\u06e5\u06d8\u06db\u06d6\u06dc\u06d8\u06d7\u06da\u06e0\u06e5\u06d7\u06df"

    goto :goto_0

    :sswitch_1
    const-string v0, "\u06df\u06e1\u06e5\u06d8\u06e5\u06e6\u06d8\u06d9\u06e0\u06d6\u06d8\u06d9\u06e1\u06e5\u06d8\u06e7\u06e7\u06eb\u06d6\u06e1\u06ec\u06d6\u06e7\u06eb\u06ec\u06e5\u06d8\u06db\u06e6\u06e6\u06d8\u06d8\u06da\u06e5\u06e0\u06e2\u06db\u06da\u06d9\u06e6\u06db\u06eb\u06dc\u06e6\u06d8\u06d8\u06e0\u06da\u06da\u06db\u06e6\u06d8\u06db\u06d9\u06d7\u06e0\u06eb\u06ec\u06e2\u06dc\u06e6\u06d6\u06dc\u06e6\u06d8\u06e4\u06eb\u06d8\u06e8\u06e8\u06e8\u06d8\u06da\u06e0\u06d7\u06e6\u06d7\u06da\u06dc\u06d8\u06d7"

    goto :goto_0

    :sswitch_2
    new-instance v1, Landroid/content/Intent;

    const-wide v2, -0x2fbfed6620ad5f49L    # -3.7221738559790904E78

    invoke-static {v2, v3}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "\u06d6\u06e2\u06eb\u06eb\u06dc\u06e1\u06e0\u06df\u06e0\u06ec\u06dc\u06e7\u06d6\u06db\u06e7\u06d9\u06e2\u06dc\u06dc\u06e7\u06e0\u06db\u06e2\u06e7\u06e1\u06e7\u06d8\u06db\u06e1\u06d7\u06d6\u06db\u06d7\u06e1\u06e8\u06e7\u06d8\u06db\u06ec\u06da\u06d7\u06e7\u06dc\u06d8\u06e0\u06da\u06e1\u06e0\u06e8\u06d7\u06ec\u06e6\u06dc\u06e2\u06e6\u06e7\u06d8\u06e1\u06d9\u06e7\u06d6\u06d9\u06d6\u06e2\u06ec\u06e1\u06e7\u06d9\u06e4\u06e6\u06eb\u06eb\u06e1\u06d8\u06ec\u06ec\u06d8\u06e0\u06d6\u06dc\u06e6\u06e7\u06e8\u06df\u06df\u06d9\u06db\u06db\u06e2\u06d7\u06e5\u06e7\u06ec\u06d9\u06e6\u06d8\u06e2\u06ec\u06dc\u06d8\u06e5\u06e4\u06d7\u06eb\u06eb\u06d8\u06d8\u06df\u06e4\u06e8\u06e0\u06ec\u06d8\u06da\u06e5\u06e2\u06e5\u06ec\u06df\u06e5\u06d6\u06d8\u06e5\u06e7\u06d6\u06d8\u06e8\u06e5\u06e8\u06d8\u06e0\u06d6\u06eb\u06e4\u06dc\u06e2\u06d6\u06d7\u06e4\u06ec\u06d7\u06d6\u06d8"

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lkentos/loader/server/ApiServer;->getOwner()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const-string v0, "\u06da\u06d8\u06e8\u06d7\u06ec\u06ec\u06e5\u06e1\u06e7\u06d7\u06d8\u06d8\u06e5\u06e6\u06e1\u06d8\u06d7\u06df\u06d7\u06dc\u06d8\u06e7\u06d8\u06d6\u06db\u06d9\u06d7\u06dc\u06da\u06d7\u06d7\u06d8\u06e2\u06e4\u06d6\u06e6\u06df\u06e4\u06d8\u06d8\u06da\u06db\u06e7\u06e7\u06d8\u06d8\u06d8\u06e2\u06e5\u06d9\u06df\u06e4\u06d8\u06e1\u06e7\u06dc\u06da\u06e7\u06d7\u06d7\u06e1\u06e4\u06d8\u06eb\u06d6\u06d8\u06d9\u06d8\u06eb\u06d9\u06e7\u06dc\u06d8\u06da\u06e5\u06e5\u06d8\u06e7\u06e5\u06e7\u06d8\u06e6\u06d6\u06db\u06e7\u06db\u06e6\u06d8\u06e8\u06df\u06e0\u06df\u06df\u06dc\u06d8\u06e2\u06e1"

    goto :goto_0

    :sswitch_4
    iget-object v0, p0, Lkentos/loader/activity/LoginActivity$3;->this$0:Lkentos/loader/activity/LoginActivity;

    invoke-virtual {v0, v1}, Lkentos/loader/activity/LoginActivity;->startActivity(Landroid/content/Intent;)V

    const-string v0, "\u06db\u06e1\u06e0\u06df\u06e0\u06db\u06eb\u06e1\u06d8\u06d8\u06e1\u06dc\u06e1\u06db\u06da\u06e8\u06d8\u06d9\u06e6\u06db\u06ec\u06dc\u06e8\u06d7\u06d9\u06dc\u06d8\u06e4\u06df\u06e0\u06dc\u06d6\u06d6\u06d8\u06e0\u06d6\u06e6\u06e1\u06e7\u06d7\u06e2\u06d6\u06e0\u06e2\u06e5\u06db\u06eb\u06e7\u06dc\u06e7\u06e7\u06e6\u06d8\u06d8\u06e8\u06e5\u06e2\u06d8\u06dc\u06d8\u06d8\u06e1\u06d7\u06db\u06e2\u06da\u06dc\u06dc\u06df\u06d7\u06e5\u06d8\u06d8\u06d6\u06e1\u06e8\u06e7\u06df\u06e6\u06d8\u06dc\u06e2\u06e1\u06d9\u06e2\u06e6\u06d8\u06d9\u06ec\u06d6\u06d8\u06dc\u06d9\u06da\u06e0\u06da\u06e0\u06e4\u06df\u06da\u06e6\u06e2\u06da\u06e1\u06da\u06ec\u06df\u06d6\u06e1\u06d8\u06e1\u06eb\u06ec\u06d8"

    goto/16 :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x77365514 -> :sswitch_2
        -0x3149f74b -> :sswitch_0
        0x9edab17 -> :sswitch_5
        0x559bfe65 -> :sswitch_3
        0x570a0d64 -> :sswitch_4
        0x73e9238a -> :sswitch_1
    .end sparse-switch
.end method

.class public final synthetic Lkentos/loader/activity/LoginActivity$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final f$0:Lkentos/loader/activity/LoginActivity;


# direct methods
.method public synthetic constructor <init>(Lkentos/loader/activity/LoginActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkentos/loader/activity/LoginActivity$$ExternalSyntheticLambda0;->f$0:Lkentos/loader/activity/LoginActivity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    const-string v0, "\u06da\u06d7\u06d6\u06e7\u06eb\u06e5\u06e1\u06ec\u06e2\u06d7\u06e6\u06eb\u06e8\u06d9\u06d9\u06e6\u06d9\u06e6\u06d8\u06e2\u06d7\u06d9\u06eb\u06e8\u06db\u06e6\u06db\u06e1\u06d8\u06e0\u06e4\u06e5\u06e7\u06d6\u06e1\u06d6\u06da\u06d8\u06d8\u06da\u06d7\u06e7\u06eb\u06e8\u06dc\u06d8\u06dc\u06d8\u06e7\u06d8\u06eb\u06da\u06eb\u06eb\u06d8\u06e2\u06e0\u06d8\u06d8\u06d8\u06e7\u06df\u06d6\u06da\u06e1\u06d9\u06e5\u06d8\u06db\u06ec\u06e7\u06e7\u06e1\u06d7\u06e1\u06d8\u06e0\u06e7\u06e4\u06e0\u06e0\u06da\u06d7\u06e6\u06da\u06d7\u06d8\u06e5\u06e2\u06d9\u06d7\u06e4\u06d8\u06d8\u06e4\u06db"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x17d

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x266

    const/16 v2, 0x33e

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x30b

    const/16 v2, 0x391

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x71

    const/16 v2, 0x1fa

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x214

    const/4 v2, 0x0

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2cd

    const/16 v2, 0xde

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2a2

    const/16 v2, 0x41

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2a1

    const/16 v2, 0x89

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1f1

    const/16 v2, 0x297

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x386

    const/16 v2, 0x1cc

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3c5

    const/16 v2, 0x26

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x222

    const/16 v2, 0x18f

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x225

    const/16 v2, 0x34f

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x90

    const/16 v2, 0x21c

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x14c

    const/16 v2, 0xa0

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x360

    const/16 v2, 0x93

    const v3, -0x7f607e89

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06d6\u06e4\u06e1\u06d6\u06e5\u06df\u06eb\u06e6\u06e8\u06e4\u06e6\u06df\u06eb\u06db\u06e5\u06d8\u06e1\u06e0\u06e8\u06e6\u06e8\u06d8\u06dc\u06e8\u06e0\u06e1\u06dc\u06ec\u06df\u06e1\u06d8\u06db\u06e2\u06e4\u06e5\u06db\u06e8\u06ec\u06e7\u06d7\u06e1\u06e4\u06e6\u06d8\u06e1\u06d9\u06e8\u06eb\u06d7\u06e1\u06e5\u06d7\u06e5\u06e0\u06e8\u06e0\u06e2\u06e7\u06e5\u06d8\u06ec\u06eb\u06e1\u06d7\u06d6\u06d7\u06e1\u06d7\u06d8\u06d8\u06e6\u06d6\u06df\u06df\u06e5\u06da\u06d6\u06e4\u06d9\u06e4\u06e5\u06e8\u06db\u06e8\u06d6\u06d6\u06e1\u06df\u06e4\u06e1\u06d6\u06d6\u06d8\u06d6\u06df\u06d8\u06ec\u06e8\u06dc\u06d7\u06db\u06e7\u06e1\u06d7\u06ec\u06ec\u06e0\u06e5\u06d8\u06e8\u06d7\u06e4\u06dc\u06e6\u06d7\u06eb\u06e6\u06dc\u06eb\u06e8\u06e4\u06e7\u06e1\u06d8\u06e4\u06df\u06e1\u06d8\u06db\u06e7\u06dc\u06d8\u06e5\u06e1\u06e7\u06d8\u06e1\u06df\u06d8\u06d8\u06d6\u06d8"

    goto :goto_0

    :sswitch_1
    const-string v0, "\u06e8\u06e0\u06d7\u06da\u06e4\u06e5\u06d8\u06e7\u06d6\u06e2\u06e5\u06ec\u06e5\u06eb\u06e8\u06df\u06e0\u06e7\u06e1\u06d8\u06db\u06e6\u06d6\u06df\u06da\u06e1\u06d8\u06d8\u06e1\u06dc\u06d8\u06da\u06da\u06dc\u06e2\u06db\u06d9\u06e1\u06e4\u06dc\u06d8\u06d8\u06db\u06e1\u06d8\u06e1\u06e1\u06e8\u06d8\u06ec\u06eb\u06e8\u06eb\u06d8\u06e2\u06d9\u06ec\u06e4\u06da\u06e2\u06d9\u06d7\u06e8\u06d8\u06d8\u06e7\u06d9\u06db\u06dc\u06d9\u06d8\u06d7\u06e6\u06e1\u06d8\u06db\u06e7\u06e7\u06e0\u06e5\u06e1\u06d6\u06e0\u06e6"

    goto :goto_0

    :sswitch_2
    const-string v0, "\u06d7\u06e8\u06e1\u06e4\u06e8\u06d6\u06eb\u06eb\u06e1\u06eb\u06da\u06e0\u06e7\u06eb\u06e2\u06da\u06d7\u06db\u06ec\u06df\u06e2\u06d7\u06e4\u06e6\u06e5\u06e1\u06e6\u06d8\u06e2\u06e8\u06e5\u06d8\u06d8\u06d7\u06eb\u06eb\u06e0\u06eb\u06ec\u06e2\u06e4\u06e8\u06db\u06eb\u06e0\u06e2\u06d8\u06d8\u06d9\u06df\u06d6\u06d8\u06e2\u06e8\u06da\u06dc\u06d7\u06d7\u06d8\u06e6\u06dc\u06d8\u06d9\u06e2\u06e5\u06d8\u06e1\u06e2\u06e2\u06d7\u06d7\u06d7\u06da\u06d9\u06e6\u06d8\u06e4\u06d7\u06e0\u06da\u06e0\u06e8\u06d8"

    goto :goto_0

    :sswitch_3
    iget-object v0, p0, Lkentos/loader/activity/LoginActivity$$ExternalSyntheticLambda0;->f$0:Lkentos/loader/activity/LoginActivity;

    invoke-virtual {v0, p1, p2}, Lkentos/loader/activity/LoginActivity;->lambda$showUpdateDialog$0$kentos-loader-activity-LoginActivity(Landroid/content/DialogInterface;I)V

    const-string v0, "\u06da\u06ec\u06dc\u06d8\u06e4\u06e0\u06e2\u06e2\u06d8\u06e5\u06d8\u06e1\u06d6\u06df\u06d8\u06db\u06dc\u06e7\u06d9\u06e0\u06dc\u06e1\u06d6\u06eb\u06e4\u06da\u06e6\u06d6\u06e7\u06dc\u06df\u06e5\u06d8\u06df\u06d9\u06d8\u06db\u06db\u06e8\u06d8\u06d7\u06e0\u06d8\u06d8\u06e5\u06eb\u06d8\u06d8\u06df\u06dc\u06e6\u06dc\u06e2\u06e1\u06d8\u06d8\u06df\u06da\u06e6\u06e1\u06e4\u06d9\u06e5\u06dc\u06d8\u06e0\u06dc\u06d7\u06ec\u06ec\u06db\u06d6\u06e8\u06e8\u06ec\u06e2\u06dc\u06df\u06e6\u06e8\u06d8\u06e2\u06e6\u06d8"

    goto :goto_0

    :sswitch_4
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x3784d0bc -> :sswitch_2
        0x731d3d9 -> :sswitch_3
        0x35911a33 -> :sswitch_4
        0x377b5228 -> :sswitch_0
        0x7857716f -> :sswitch_1
    .end sparse-switch
.end method

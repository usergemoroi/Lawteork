.class public final synthetic Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Lkentos/loader/activity/MainActivity;

.field public final f$1:Landroid/content/SharedPreferences;

.field public final f$2:Lcom/google/android/material/button/MaterialButton;


# direct methods
.method public synthetic constructor <init>(Lkentos/loader/activity/MainActivity;Landroid/content/SharedPreferences;Lcom/google/android/material/button/MaterialButton;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda3;->f$0:Lkentos/loader/activity/MainActivity;

    iput-object p2, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda3;->f$1:Landroid/content/SharedPreferences;

    iput-object p3, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda3;->f$2:Lcom/google/android/material/button/MaterialButton;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    const-string v0, "\u06d7\u06d9\u06d6\u06e0\u06df\u06e5\u06d8\u06dc\u06d9\u06db\u06e7\u06e5\u06eb\u06e2\u06dc\u06e1\u06db\u06e1\u06e6\u06d8\u06ec\u06ec\u06d6\u06e8\u06e6\u06d8\u06d8\u06db\u06db\u06dc\u06e0\u06dc\u06d8\u06d7\u06d7\u06dc\u06d8\u06d7\u06d8\u06df\u06d8\u06ec\u06e4\u06d6\u06e1\u06dc\u06d8\u06dc\u06da\u06e8\u06d8\u06e2\u06df\u06dc\u06d8\u06d7\u06db\u06e5\u06d8\u06da\u06d7\u06d7\u06e0\u06eb\u06ec\u06e0\u06d7\u06d7\u06dc\u06da\u06e6\u06d6\u06df\u06e5\u06d8\u06e7\u06d9\u06e5\u06d8\u06d6\u06d9\u06e8\u06d8\u06e8\u06e4\u06ec"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x1a9

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3ce

    const/16 v2, 0x3ba

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x102

    const/16 v2, 0x30

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x11e

    const/16 v2, 0x2ac

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x195

    const/16 v2, 0x382

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x365

    const/16 v2, 0x294

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xaf

    const/16 v2, 0x359

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xdc

    const/16 v2, 0x214

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1f1

    const/16 v2, 0x1d7

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2ab

    const/16 v2, 0xd7

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2d9

    const/16 v2, 0x207

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x31c

    const/16 v2, 0x24d

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1a3

    const/16 v2, 0x3e2

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2aa

    const/16 v2, 0x68

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x282

    const/16 v2, 0x139

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x221

    const/16 v2, 0x20a

    const v3, -0x13963d34

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06e7\u06e2\u06d6\u06df\u06da\u06e1\u06e4\u06eb\u06da\u06ec\u06d7\u06e5\u06d8\u06e7\u06dc\u06e5\u06e7\u06e7\u06da\u06e7\u06d8\u06d6\u06d8\u06e0\u06e8\u06e8\u06df\u06e8\u06da\u06d9\u06e7\u06e7\u06e2\u06e8\u06e8\u06e2\u06e5\u06e8\u06d6\u06e7\u06d8\u06e7\u06df\u06d8\u06df\u06d7\u06e6\u06e8\u06d8\u06ec\u06e8\u06df\u06da\u06e7\u06ec\u06dc\u06e1\u06e4\u06d8\u06d8\u06da\u06e0\u06da\u06eb\u06df\u06eb\u06dc\u06e6\u06e2\u06da\u06e6\u06e7\u06d8\u06e0\u06d9\u06d6\u06e7\u06e0\u06da"

    goto :goto_0

    :sswitch_1
    const-string v0, "\u06d9\u06d6\u06e7\u06d8\u06df\u06e6\u06e8\u06e1\u06e4\u06d7\u06e2\u06e6\u06db\u06dc\u06df\u06d7\u06d6\u06e8\u06e6\u06d8\u06e1\u06dc\u06d9\u06e5\u06da\u06d6\u06d8\u06db\u06e5\u06dc\u06d8\u06e0\u06e2\u06d6\u06d8\u06e7\u06d7\u06e0\u06d8\u06db\u06e2\u06e0\u06da\u06e1\u06dc\u06e6\u06d9\u06df\u06df\u06e6\u06d8\u06e2\u06e1\u06e7\u06e0\u06e6\u06db\u06e7\u06da\u06d6\u06d8\u06db\u06df\u06e6\u06d8\u06e4\u06e1\u06d6\u06e8\u06db\u06e5\u06d8\u06eb\u06e1\u06e8\u06d8\u06e0\u06e6\u06e6\u06d8\u06d7\u06e8\u06d9\u06d7\u06eb\u06e2\u06e8\u06ec\u06dc\u06d8\u06e5\u06db\u06e1\u06ec\u06ec\u06ec\u06e4\u06e0\u06d9\u06e0\u06dc\u06d6\u06ec\u06e5\u06d9\u06db\u06db\u06d6\u06d8\u06e4\u06e5\u06e8\u06e5\u06dc\u06e6\u06ec\u06e0\u06e1\u06dc\u06db\u06e8\u06d8\u06e8\u06e2\u06d7\u06d9\u06db\u06e5\u06d7\u06ec\u06d6\u06d8\u06e8\u06e7\u06e1\u06db\u06d9\u06eb\u06db\u06e2\u06e8\u06d8\u06e7\u06e2\u06e1\u06d8\u06d7\u06e0\u06d6\u06e0\u06db\u06e5\u06d8"

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda3;->f$0:Lkentos/loader/activity/MainActivity;

    iget-object v1, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda3;->f$1:Landroid/content/SharedPreferences;

    iget-object v2, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda3;->f$2:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v0, v1, v2, p1}, Lkentos/loader/activity/MainActivity;->lambda$initMenu1$0$kentos-loader-activity-MainActivity(Landroid/content/SharedPreferences;Lcom/google/android/material/button/MaterialButton;Landroid/view/View;)V

    const-string v0, "\u06eb\u06da\u06d9\u06e0\u06ec\u06e5\u06d8\u06e4\u06dc\u06d8\u06ec\u06e0\u06e1\u06d8\u06e5\u06e8\u06ec\u06e6\u06e6\u06e7\u06d8\u06e2\u06e6\u06d6\u06d9\u06e7\u06e0\u06df\u06e2\u06d6\u06d8\u06e7\u06e2\u06e1\u06d8\u06d6\u06e6\u06db\u06d8\u06db\u06e5\u06d9\u06e6\u06db\u06db\u06e4\u06df\u06d9\u06d8\u06e4\u06df\u06e7\u06d8\u06e8\u06ec\u06e7\u06eb\u06eb\u06d9\u06d6\u06dc\u06d8\u06d8\u06d8\u06e5\u06e2\u06e2\u06e5\u06e8\u06d8\u06e6\u06ec\u06d7\u06e5\u06dc\u06dc\u06ec\u06df\u06e0\u06dc\u06e8\u06e7\u06d8"

    goto :goto_0

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x30866dc6 -> :sswitch_2
        -0x8d64f41 -> :sswitch_1
        0x2b3671bf -> :sswitch_0
        0x63e6558c -> :sswitch_3
    .end sparse-switch
.end method

.class public final synthetic Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Lkentos/loader/activity/MainActivity;

.field public final f$1:Landroid/content/SharedPreferences$Editor;

.field public final f$2:Lcom/google/android/material/button/MaterialButton;


# direct methods
.method public synthetic constructor <init>(Lkentos/loader/activity/MainActivity;Landroid/content/SharedPreferences$Editor;Lcom/google/android/material/button/MaterialButton;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda1;->f$0:Lkentos/loader/activity/MainActivity;

    iput-object p2, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda1;->f$1:Landroid/content/SharedPreferences$Editor;

    iput-object p3, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda1;->f$2:Lcom/google/android/material/button/MaterialButton;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    const-string v0, "\u06e6\u06e4\u06da\u06e4\u06d8\u06dc\u06e5\u06e4\u06e2\u06d9\u06e1\u06d6\u06da\u06db\u06eb\u06e2\u06e2\u06da\u06da\u06e5\u06dc\u06d8\u06ec\u06ec\u06eb\u06ec\u06d9\u06e0\u06d7\u06e0\u06d7\u06d8\u06ec\u06e0\u06e5\u06d6\u06d6\u06ec\u06e5\u06da\u06d6\u06e1\u06d8\u06df\u06da\u06dc\u06e6\u06e5\u06d8\u06e1\u06e5\u06d8\u06e2\u06eb\u06d9\u06da\u06dc\u06df\u06e5\u06df\u06e1\u06e5\u06d9\u06da\u06df\u06e0\u06e6\u06d8\u06e5\u06eb\u06db\u06df\u06e0\u06e0\u06e1\u06d9\u06e0\u06db\u06e0\u06df\u06e4\u06eb\u06e2\u06e8\u06e8\u06ec\u06e0\u06eb\u06d6\u06da\u06e2\u06d9\u06d8\u06e7\u06df\u06d6\u06dc\u06df\u06e0\u06e7\u06d8\u06eb\u06d6\u06e2\u06d9\u06db"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x317

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x244

    const/16 v2, 0xdb

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xa0

    const/16 v2, 0x289

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x8f

    const/16 v2, 0x1b5

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1fa

    const/16 v2, 0x47

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x58

    const/16 v2, 0x233

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2b7

    const/16 v2, 0x153

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2f9

    const/16 v2, 0x98

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x2e

    const/16 v2, 0xd2

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2c0

    const/16 v2, 0x206

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1d1

    const/16 v2, 0x327

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3f4

    const/16 v2, 0x10

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x199

    const/16 v2, 0x70

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xf8

    const/16 v2, 0x180

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1f8

    const/16 v2, 0x17e

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x374

    const/16 v2, 0x103

    const v3, 0x64f2f0d1

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06d9\u06d9\u06e4\u06e7\u06e7\u06db\u06e0\u06e7\u06e6\u06d8\u06e0\u06e8\u06dc\u06d8\u06eb\u06e5\u06e4\u06e1\u06da\u06e8\u06ec\u06eb\u06eb\u06e2\u06e5\u06d9\u06d6\u06e2\u06e7\u06e8\u06da\u06e2\u06e1\u06e2\u06e1\u06db\u06eb\u06d9\u06dc\u06d7\u06e2\u06df\u06e1\u06e5\u06e1\u06dc\u06e5\u06dc\u06e6\u06d6\u06d8\u06ec\u06dc\u06e0\u06e2\u06d7\u06e6\u06d8\u06df\u06eb\u06d9\u06dc\u06e6\u06d8\u06d9\u06e1\u06e5\u06d8\u06d9\u06d9\u06d8\u06d8\u06e5\u06d6\u06d6\u06d8\u06e7\u06e6\u06e7\u06d7\u06e5\u06e4"

    goto :goto_0

    :sswitch_1
    const-string v0, "\u06e6\u06e8\u06e0\u06ec\u06d8\u06e2\u06e0\u06e2\u06dc\u06d8\u06eb\u06db\u06db\u06e2\u06db\u06eb\u06e7\u06df\u06d8\u06dc\u06db\u06e1\u06ec\u06dc\u06d8\u06dc\u06eb\u06e0\u06ec\u06e7\u06ec\u06e0\u06e7\u06d8\u06d9\u06dc\u06e1\u06d8\u06e7\u06e4\u06d8\u06d8\u06dc\u06e4\u06e4\u06d6\u06e5\u06e7\u06db\u06e6\u06e2\u06e0\u06dc\u06dc\u06d8\u06e1\u06d9\u06e4\u06e0\u06e4\u06e6\u06e1\u06db\u06df\u06ec\u06e6\u06e7\u06ec\u06da\u06e4\u06db\u06dc\u06e4\u06e6\u06e1\u06e0\u06e1\u06d9\u06d7\u06d9\u06db\u06e6\u06ec\u06eb\u06e8\u06d8\u06d6\u06e0\u06ec\u06dc\u06d8\u06d8\u06df\u06e1\u06d8\u06d8\u06d6\u06e5\u06e1\u06d8\u06e5\u06e2\u06da\u06d7\u06ec\u06e8\u06ec\u06e2\u06e5\u06e1\u06da\u06ec\u06e2\u06da\u06e0\u06dc\u06e7\u06e6\u06e5\u06d9\u06db\u06e1\u06e8\u06df\u06e5\u06d7\u06ec"

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda1;->f$0:Lkentos/loader/activity/MainActivity;

    iget-object v1, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda1;->f$1:Landroid/content/SharedPreferences$Editor;

    iget-object v2, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda1;->f$2:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v0, v1, v2, p1}, Lkentos/loader/activity/MainActivity;->lambda$initMenu2$1$kentos-loader-activity-MainActivity(Landroid/content/SharedPreferences$Editor;Lcom/google/android/material/button/MaterialButton;Landroid/view/View;)V

    const-string v0, "\u06e2\u06dc\u06d9\u06e8\u06ec\u06e4\u06e7\u06e4\u06db\u06e0\u06e0\u06da\u06da\u06d6\u06e4\u06df\u06eb\u06eb\u06e2\u06e8\u06e1\u06e8\u06dc\u06d6\u06d8\u06e1\u06da\u06ec\u06ec\u06eb\u06dc\u06e8\u06d7\u06e8\u06e7\u06df\u06e5\u06df\u06e8\u06d8\u06d6\u06e1\u06d6\u06d8\u06e1\u06e2\u06eb\u06e0\u06e4\u06dc\u06df\u06e0\u06d6\u06d8\u06e6\u06d7\u06e6\u06d7\u06e8\u06e2\u06da\u06df\u06d8\u06e7\u06e1\u06d7\u06d6\u06d8\u06d8\u06e5\u06e2\u06e4\u06e5\u06ec\u06da\u06d6\u06e5\u06d6\u06d7\u06e8\u06df\u06e8\u06df\u06e5\u06d8\u06dc\u06e1\u06e0\u06dc\u06d8\u06e4\u06e1\u06d8\u06df\u06e2\u06e8\u06e6\u06eb\u06ec\u06df\u06dc\u06e6\u06e8\u06d8\u06e0\u06e5\u06e6\u06d8\u06dc\u06eb\u06da\u06d7\u06e5\u06e7\u06df\u06db\u06e5\u06d6\u06d6\u06da\u06eb\u06db\u06dc\u06d8\u06e2\u06da"

    goto :goto_0

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6e500e56 -> :sswitch_1
        -0x2a8352cf -> :sswitch_2
        -0x2978ac5d -> :sswitch_3
        0x520201d3 -> :sswitch_0
    .end sparse-switch
.end method

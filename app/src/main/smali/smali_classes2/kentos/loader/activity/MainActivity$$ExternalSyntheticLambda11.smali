.class public final synthetic Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda11;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Landroidx/appcompat/app/AlertDialog;


# direct methods
.method public synthetic constructor <init>(Landroidx/appcompat/app/AlertDialog;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda11;->f$0:Landroidx/appcompat/app/AlertDialog;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    const-string v0, "\u06d7\u06da\u06e5\u06d8\u06e7\u06db\u06e0\u06e6\u06e4\u06e6\u06d8\u06db\u06e8\u06dc\u06e0\u06e2\u06eb\u06e1\u06d7\u06e8\u06df\u06e4\u06df\u06e1\u06e7\u06d9\u06eb\u06da\u06db\u06df\u06eb\u06d9\u06da\u06e2\u06d6\u06d8\u06e7\u06d6\u06e8\u06d8\u06d6\u06e1\u06e4\u06d7\u06e2\u06dc\u06d8\u06df\u06e7\u06df\u06e1\u06db\u06d8\u06d8\u06e8\u06d6\u06e0\u06d8\u06e4\u06e2\u06eb\u06da\u06d7\u06e8\u06e7\u06e5\u06d8\u06e2\u06db\u06e1\u06d8\u06e0\u06e7\u06d8\u06e1\u06dc\u06d8\u06d8\u06d9\u06d9\u06eb\u06d7\u06ec\u06df\u06e7\u06ec\u06e8\u06e7\u06e5\u06e8\u06e2\u06e5\u06d6\u06e5\u06e6\u06e0\u06dc\u06e0\u06e2"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x219

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2f0

    const/16 v2, 0x4c

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x15f

    const/16 v2, 0x185

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x117

    const/16 v2, 0x8e

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x12d

    const/16 v2, 0x1e2

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2a2

    const/16 v2, 0x170

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x272

    const/16 v2, 0x127

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3f1

    const/16 v2, 0x218

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2c0

    const/16 v2, 0x245

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1cb

    const/16 v2, 0x305

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x11d

    const/16 v2, 0x2b4

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x321

    const/16 v2, 0x2e0

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x205

    const/16 v2, 0x1cf

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3ca

    const/16 v2, 0x79

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x343

    const/16 v2, 0x2e7

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x221

    const/16 v2, 0x14

    const v3, -0x786c921c

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06e7\u06d9\u06ec\u06e5\u06df\u06e5\u06d8\u06d6\u06d8\u06ec\u06df\u06d9\u06d6\u06d8\u06e4\u06d6\u06e1\u06d8\u06d8\u06e6\u06e0\u06e4\u06e6\u06d8\u06d8\u06e6\u06df\u06e2\u06ec\u06dc\u06e7\u06d8\u06d6\u06df\u06e4\u06e6\u06e1\u06da\u06eb\u06e8\u06d8\u06d8\u06e2\u06ec\u06e1\u06d8\u06d6\u06d8\u06e4\u06e6\u06db\u06e6\u06d8\u06e0\u06dc\u06eb\u06e6\u06d7\u06dc\u06d8\u06e6\u06d8\u06dc\u06db\u06e7\u06e7\u06ec\u06e4\u06e1\u06e4\u06d9\u06db\u06e4\u06d9\u06e5\u06e5\u06ec\u06e5\u06d8\u06db\u06d8\u06e8\u06d8\u06d8\u06d8\u06e6\u06d8\u06e5\u06e6\u06e6\u06e5\u06d8\u06e8\u06d7\u06e6\u06df\u06db\u06e8\u06ec\u06d9\u06eb\u06d7\u06d9\u06e5\u06d7\u06df\u06d9\u06ec\u06d6\u06da\u06e7\u06dc\u06d9\u06e2\u06d6\u06da\u06dc\u06d8\u06d7\u06da\u06e4\u06ec\u06e0\u06df\u06e7\u06ec\u06d6\u06d8\u06e5\u06e5\u06d8\u06e5\u06d6\u06d6\u06d8"

    goto :goto_0

    :sswitch_1
    const-string v0, "\u06e0\u06d8\u06e0\u06e4\u06e4\u06e1\u06df\u06e4\u06eb\u06e4\u06ec\u06e8\u06d8\u06dc\u06e2\u06e2\u06e4\u06e8\u06d8\u06e7\u06d6\u06e8\u06db\u06e7\u06e7\u06e7\u06db\u06e6\u06d8\u06d9\u06ec\u06e0\u06d9\u06e0\u06e8\u06e8\u06e5\u06e6\u06e8\u06e8\u06eb\u06d6\u06e5\u06eb\u06d9\u06df\u06d6\u06d8\u06eb\u06d7\u06e2\u06e2\u06db\u06e7\u06e2\u06e0\u06e2\u06ec\u06d6\u06e8\u06d8\u06e7\u06e6\u06d8\u06eb\u06db\u06ec\u06eb\u06e8\u06e8\u06d8\u06e7\u06e2\u06ec\u06d8\u06e6\u06e2\u06e2\u06dc\u06da\u06d7\u06ec\u06ec\u06ec\u06d8\u06e5\u06e7\u06ec\u06e6\u06ec\u06eb\u06da\u06e4\u06d6\u06e1\u06d8\u06eb\u06d9\u06e6\u06eb\u06d6\u06e1\u06d7\u06e6\u06ec\u06da\u06ec\u06da\u06d8\u06e1\u06d6\u06d8"

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda11;->f$0:Landroidx/appcompat/app/AlertDialog;

    invoke-static {v0, p1}, Lkentos/loader/activity/MainActivity;->lambda$showDownloadCompleteDialog$17(Landroidx/appcompat/app/AlertDialog;Landroid/view/View;)V

    const-string v0, "\u06db\u06d8\u06da\u06e0\u06da\u06d8\u06dc\u06d6\u06d8\u06e8\u06e7\u06ec\u06da\u06dc\u06e0\u06e6\u06e8\u06d6\u06e6\u06e6\u06d8\u06e8\u06e6\u06e8\u06e0\u06e1\u06e7\u06e7\u06d6\u06e2\u06da\u06e4\u06db\u06eb\u06e5\u06d7\u06d7\u06e7\u06d6\u06db\u06df\u06dc\u06d7\u06e1\u06e5\u06d8\u06e7\u06d8\u06e6\u06d8\u06ec\u06db\u06e1\u06d8\u06e5\u06dc\u06e5\u06d8\u06df\u06ec\u06eb\u06e4\u06e0\u06d9\u06d8\u06e0\u06ec\u06d8\u06d7\u06e8\u06d8\u06e0\u06d7\u06eb\u06e0\u06e1\u06dc\u06d8\u06ec\u06e5\u06d6\u06d8\u06ec\u06d8\u06d6\u06e6\u06ec\u06e5\u06d8\u06e0\u06e6\u06df\u06e8\u06e6\u06d8\u06d9\u06da\u06e7\u06d9\u06e4\u06e1\u06d8\u06e8\u06d6\u06da\u06d8\u06e7\u06d9\u06e7\u06ec\u06e8\u06e4\u06e4"

    goto :goto_0

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x586e147f -> :sswitch_2
        -0x25c97742 -> :sswitch_3
        -0x23d180c5 -> :sswitch_1
        0x1cdf5308 -> :sswitch_0
    .end sparse-switch
.end method

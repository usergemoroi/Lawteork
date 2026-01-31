.class public final synthetic Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda9;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Lkentos/loader/activity/MainActivity;

.field public final f$1:Ljava/lang/String;

.field public final f$2:Ljava/lang/Runnable;

.field public final f$3:Landroidx/appcompat/app/AlertDialog;


# direct methods
.method public synthetic constructor <init>(Lkentos/loader/activity/MainActivity;Ljava/lang/String;Ljava/lang/Runnable;Landroidx/appcompat/app/AlertDialog;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda9;->f$0:Lkentos/loader/activity/MainActivity;

    iput-object p2, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda9;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda9;->f$2:Ljava/lang/Runnable;

    iput-object p4, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda9;->f$3:Landroidx/appcompat/app/AlertDialog;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    const-string v0, "\u06e6\u06d7\u06e5\u06d8\u06d7\u06eb\u06e5\u06d8\u06e5\u06da\u06e7\u06da\u06ec\u06e6\u06d8\u06e8\u06e5\u06d9\u06e2\u06d7\u06e8\u06e5\u06df\u06eb\u06d6\u06d7\u06e0\u06d6\u06da\u06e1\u06e1\u06d7\u06dc\u06e7\u06e6\u06e7\u06e4\u06e7\u06e7\u06da\u06e4\u06da\u06d7\u06dc\u06d8\u06e1\u06e4\u06df\u06df\u06d6\u06e5\u06d8\u06eb\u06d6\u06dc\u06d9\u06d9\u06ec\u06e6\u06e1\u06e1\u06d8\u06df\u06e1\u06e7\u06d7\u06e1\u06e1\u06e5\u06dc\u06e1\u06e6\u06da\u06db\u06d7\u06d7\u06ec\u06e8\u06e5\u06dc\u06d8"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x356

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x357

    const/16 v2, 0x31d

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x190

    const/16 v2, 0x1ef

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x235

    const/16 v2, 0x38b

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2d2

    const/16 v2, 0x3b

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1af

    const/16 v2, 0x17a

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xf2

    const/16 v2, 0x7f

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3f2

    const/16 v2, 0x2a5

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x6f

    const/16 v2, 0x110

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x3f

    const/16 v2, 0x353

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x22b

    const/16 v2, 0x79

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x29c

    const/16 v2, 0x37c

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x119

    const/16 v2, 0x354

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x173

    const/16 v2, 0x64

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x2a

    const/16 v2, 0xe8

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x11

    const/16 v2, 0x3c9

    const v3, 0x52c23b5f

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06dc\u06da\u06d7\u06e5\u06d7\u06db\u06d6\u06db\u06e6\u06da\u06e2\u06e1\u06eb\u06d8\u06dc\u06d8\u06e7\u06e4\u06d6\u06e7\u06ec\u06d6\u06dc\u06e8\u06e1\u06e8\u06e8\u06e1\u06d8\u06eb\u06d9\u06e0\u06e2\u06e7\u06d8\u06d8\u06d8\u06d9\u06d6\u06e2\u06e5\u06d8\u06e6\u06e6\u06e1\u06e4\u06d8\u06dc\u06db\u06dc\u06dc\u06d8\u06eb\u06df\u06e1\u06dc\u06ec\u06e1\u06d8\u06d8\u06d8\u06dc\u06dc\u06dc\u06e2\u06ec\u06d9\u06e6\u06df\u06d9\u06da\u06d9\u06e1\u06e8\u06d8\u06eb\u06db\u06e2\u06d9\u06e5\u06e6\u06d8"

    goto :goto_0

    :sswitch_1
    const-string v0, "\u06df\u06dc\u06e0\u06da\u06d8\u06da\u06e8\u06d8\u06dc\u06e6\u06e6\u06da\u06e1\u06ec\u06da\u06e0\u06d7\u06e4\u06dc\u06e1\u06e8\u06d6\u06e6\u06da\u06dc\u06db\u06ec\u06eb\u06e8\u06d8\u06da\u06e5\u06e7\u06e0\u06ec\u06dc\u06d8\u06df\u06e4\u06dc\u06d6\u06dc\u06d8\u06e5\u06d8\u06e5\u06df\u06d9\u06d9\u06d7\u06e7\u06e0\u06df\u06e4\u06e4\u06e8\u06e5\u06e5\u06da\u06e2\u06e1\u06d8\u06d6\u06d6\u06e4\u06e1\u06df\u06dc\u06d9\u06d9\u06d6\u06d8\u06ec\u06ec\u06da\u06dc\u06d6\u06e2\u06df\u06e5\u06e7\u06e8\u06d7\u06e2\u06e5\u06dc\u06d8\u06df\u06eb\u06d8\u06d6\u06d7\u06ec\u06e8\u06d8\u06e6\u06d8\u06dc\u06d6\u06e2\u06e2\u06dc\u06e5\u06dc\u06d8\u06e7\u06d9\u06e7\u06e4\u06df\u06e6\u06e1\u06dc\u06db\u06db\u06e2\u06da\u06d7\u06e4\u06ec\u06dc\u06dc"

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda9;->f$0:Lkentos/loader/activity/MainActivity;

    iget-object v1, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda9;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda9;->f$2:Ljava/lang/Runnable;

    iget-object v3, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda9;->f$3:Landroidx/appcompat/app/AlertDialog;

    invoke-virtual {v0, v1, v2, v3, p1}, Lkentos/loader/activity/MainActivity;->lambda$setupGameButton$6$kentos-loader-activity-MainActivity(Ljava/lang/String;Ljava/lang/Runnable;Landroidx/appcompat/app/AlertDialog;Landroid/view/View;)V

    const-string v0, "\u06d9\u06e7\u06df\u06eb\u06db\u06da\u06df\u06d7\u06e1\u06db\u06da\u06e7\u06d8\u06e2\u06eb\u06d6\u06d8\u06d9\u06e2\u06eb\u06eb\u06da\u06dc\u06d8\u06e0\u06ec\u06e4\u06db\u06e0\u06e2\u06eb\u06da\u06e6\u06e0\u06d8\u06d7\u06da\u06df\u06d6\u06d8\u06db\u06d6\u06da\u06e0\u06ec\u06d8\u06eb\u06e1\u06d6\u06df\u06e1\u06e8\u06d8\u06e7\u06e7\u06e8\u06d8\u06e6\u06d9\u06d6\u06dc\u06e8\u06e5\u06df\u06dc\u06dc\u06e8\u06da\u06e0\u06d8\u06e1\u06da\u06d7\u06d8\u06d8\u06d8\u06eb\u06e8\u06d8\u06d9\u06e6\u06e5\u06d8\u06e2\u06e5\u06e7\u06d8\u06e2\u06e5\u06dc\u06d8\u06e7\u06eb\u06e5\u06e1\u06e1\u06e0"

    goto :goto_0

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x51885fe6 -> :sswitch_3
        0x28f947e -> :sswitch_0
        0x3399fcea -> :sswitch_1
        0x7137c052 -> :sswitch_2
    .end sparse-switch
.end method

.class public final synthetic Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Lkentos/loader/activity/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lkentos/loader/activity/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda2;->f$0:Lkentos/loader/activity/MainActivity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    const-string v0, "\u06db\u06e8\u06d9\u06e1\u06e0\u06d9\u06d6\u06e5\u06d6\u06d8\u06e2\u06eb\u06e1\u06d7\u06d9\u06e6\u06da\u06d7\u06d8\u06d8\u06db\u06e4\u06e7\u06e5\u06e8\u06e1\u06d8\u06ec\u06d9\u06dc\u06e2\u06d9\u06e7\u06e2\u06ec\u06db\u06e2\u06e6\u06df\u06e7\u06e1\u06ec\u06ec\u06e8\u06e8\u06e6\u06d6\u06e0\u06d8\u06db\u06e1\u06e5\u06d8\u06d7\u06d6\u06e2\u06e7\u06e8\u06e1\u06dc\u06ec\u06db\u06d8\u06ec\u06d7\u06e7\u06e5\u06ec\u06e1\u06d9\u06e7\u06df\u06db\u06df\u06db\u06db\u06dc\u06e2\u06dc\u06da\u06e8\u06eb\u06d9\u06e6\u06eb\u06e2\u06d7\u06e5\u06d8\u06e6\u06d9\u06e5\u06dc\u06d7\u06d8\u06e4\u06d7\u06d7\u06da\u06eb\u06e5\u06d9\u06e7\u06e0\u06e5\u06db\u06d6\u06d6\u06d6\u06e4\u06dc\u06e5\u06eb\u06dc\u06d8\u06db\u06db\u06df\u06e4\u06e2\u06d9"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x277

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1cc

    const/16 v2, 0x10a

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1a7

    const/16 v2, 0x153

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x3f

    const/16 v2, 0x334

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x17c

    const/16 v2, 0x121

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x301

    const/16 v2, 0x49

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x245

    const/16 v2, 0x3e7

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xc1

    const/16 v2, 0x10e

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xd6

    const/16 v2, 0x358

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x39

    const/16 v2, 0xa0

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x143

    const/16 v2, 0x134

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x336

    const/16 v2, 0x2ae

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x5e

    const/16 v2, 0x361

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x30

    const/16 v2, 0xfd

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x6a

    const/16 v2, 0x12d

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x20b

    const/16 v2, 0x184

    const v3, 0x634ccb2a

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06e8\u06e2\u06e7\u06e4\u06e4\u06df\u06e1\u06e1\u06df\u06d7\u06eb\u06db\u06d8\u06df\u06e2\u06e5\u06d7\u06d7\u06dc\u06d7\u06d8\u06d8\u06e2\u06dc\u06ec\u06d7\u06d6\u06e5\u06d8\u06db\u06e6\u06e5\u06d8\u06df\u06df\u06da\u06d7\u06d9\u06db\u06e8\u06e8\u06e0\u06e2\u06df\u06e5\u06d9\u06df\u06e7\u06e4\u06d9\u06d6\u06d8\u06db\u06e8\u06ec\u06df\u06e2\u06e6\u06e7\u06ec\u06d8\u06e7\u06e8\u06d6\u06dc\u06eb\u06ec\u06e8\u06d6\u06d8\u06e1\u06e7\u06e8\u06d8\u06d9\u06d9\u06db\u06e5\u06e4\u06d7\u06da\u06e7\u06e8\u06e6\u06d8\u06e2\u06ec\u06e7\u06d6\u06d8\u06d7\u06e4\u06eb\u06e8\u06e4\u06df\u06e7\u06da\u06e1\u06d8\u06df\u06df\u06e2\u06d9\u06db\u06ec\u06e7\u06e5\u06db\u06db\u06df\u06df\u06d8\u06dc\u06d9\u06d7\u06e1\u06d8\u06e5\u06d8\u06e4\u06e8\u06d8\u06e5\u06d8\u06ec\u06da\u06e1\u06d8\u06e1\u06dc\u06dc\u06d8\u06e4\u06d8\u06da\u06da\u06e0\u06dc\u06d8\u06e0\u06d6\u06e6\u06eb\u06d6\u06eb"

    goto :goto_0

    :sswitch_1
    const-string v0, "\u06e7\u06eb\u06db\u06df\u06db\u06e4\u06e2\u06d6\u06dc\u06d8\u06e7\u06ec\u06e7\u06ec\u06db\u06e7\u06d6\u06db\u06db\u06db\u06d8\u06e1\u06d8\u06ec\u06e5\u06df\u06e5\u06df\u06d6\u06d8\u06e2\u06db\u06da\u06e6\u06e1\u06e6\u06e7\u06e2\u06e1\u06d8\u06e6\u06d7\u06d8\u06e7\u06e1\u06e4\u06db\u06e8\u06da\u06e2\u06e5\u06ec\u06db\u06e7\u06e8\u06d8\u06e8\u06d8\u06e6\u06d8\u06d6\u06dc\u06d7\u06df\u06db\u06db\u06db\u06e4\u06eb\u06e5\u06ec\u06e6\u06d8\u06dc\u06e5\u06dc\u06db\u06d7\u06e1\u06d6\u06db\u06d7\u06d6\u06e2\u06e5\u06db\u06db\u06d6\u06e6\u06e8\u06e4\u06e6\u06d8\u06df\u06ec\u06e2\u06e4\u06e8\u06da\u06da\u06eb\u06e5\u06eb\u06d9\u06e7\u06da\u06e6\u06e5\u06e8\u06df\u06eb"

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda2;->f$0:Lkentos/loader/activity/MainActivity;

    invoke-virtual {v0, p1}, Lkentos/loader/activity/MainActivity;->lambda$initMenu2$2$kentos-loader-activity-MainActivity(Landroid/view/View;)V

    const-string v0, "\u06df\u06e8\u06dc\u06db\u06d9\u06e8\u06d8\u06e2\u06d6\u06ec\u06e5\u06e1\u06e2\u06ec\u06d9\u06dc\u06d8\u06e4\u06e6\u06d8\u06eb\u06df\u06d9\u06d6\u06e1\u06db\u06d9\u06e2\u06e8\u06e2\u06d9\u06e4\u06d6\u06dc\u06e6\u06d9\u06d8\u06e7\u06e8\u06d6\u06e5\u06e1\u06dc\u06d8\u06d8\u06dc\u06e4\u06d7\u06df\u06dc\u06d8\u06e0\u06db\u06eb\u06ec\u06d7\u06da\u06e0\u06e0\u06dc\u06dc\u06e6\u06e5\u06d8\u06d9\u06df\u06e2\u06e1\u06d8\u06d9\u06d7\u06da\u06d8\u06d8\u06e1\u06e7\u06e5\u06d8\u06e7\u06d7\u06ec\u06e2\u06dc\u06dc\u06d8\u06d9\u06eb\u06d7\u06e8\u06df\u06d6\u06d8\u06df\u06db\u06da\u06d6\u06d7\u06e8"

    goto :goto_0

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x78111af4 -> :sswitch_3
        -0x1c5334fd -> :sswitch_2
        0x2a682ff9 -> :sswitch_0
        0x2d68b8a2 -> :sswitch_1
    .end sparse-switch
.end method

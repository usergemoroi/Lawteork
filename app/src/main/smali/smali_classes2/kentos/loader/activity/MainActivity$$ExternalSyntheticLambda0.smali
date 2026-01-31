.class public final synthetic Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Lkentos/loader/activity/MainActivity;

.field public final f$1:I

.field public final f$2:Ljava/lang/String;

.field public final f$3:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lkentos/loader/activity/MainActivity;ILjava/lang/String;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda0;->f$0:Lkentos/loader/activity/MainActivity;

    iput p2, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda0;->f$1:I

    iput-object p3, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda0;->f$2:Ljava/lang/String;

    iput-object p4, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda0;->f$3:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    const-string v0, "\u06d7\u06ec\u06e4\u06d9\u06e2\u06e7\u06d6\u06eb\u06e2\u06e7\u06d6\u06db\u06df\u06e2\u06d8\u06d8\u06e1\u06d7\u06e0\u06df\u06d8\u06dc\u06d7\u06da\u06e7\u06e0\u06e0\u06df\u06d9\u06e6\u06d6\u06d8\u06e5\u06df\u06d8\u06e5\u06db\u06e1\u06d8\u06d7\u06e4\u06d9\u06d7\u06e7\u06e5\u06e7\u06e6\u06d9\u06e6\u06e1\u06e5\u06d8\u06e8\u06df\u06e5\u06e8\u06d7\u06da\u06e4\u06e8\u06da\u06d9\u06db\u06e0\u06d6\u06e2\u06d9\u06ec\u06d6\u06e1\u06d8\u06e1\u06df\u06d8\u06d8\u06e6\u06d7\u06d8\u06e5\u06e8\u06d8\u06d8"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x305

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1f7

    const/16 v2, 0x380

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x32f

    const/16 v2, 0x329

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x37b

    const/16 v2, 0x395

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2ed

    const/16 v2, 0x31c

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1a3

    const/16 v2, 0x121

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x151

    const/16 v2, 0xb3

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2af

    const/16 v2, 0x269

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xa4

    const/16 v2, 0x33e

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3bf

    const/16 v2, 0x294

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x18e

    const/16 v2, 0x250

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xbc

    const/16 v2, 0xa1

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x233

    const/16 v2, 0x5b

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x9

    const/16 v2, 0x300

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1ab

    const/16 v2, 0x3cb

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x19e

    const/16 v2, 0x388

    const v3, -0xbb14532

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06e2\u06ec\u06e8\u06df\u06e4\u06e6\u06d6\u06e7\u06d8\u06d8\u06e4\u06e5\u06e7\u06e6\u06d8\u06da\u06eb\u06e7\u06db\u06db\u06d9\u06dc\u06e0\u06dc\u06e8\u06db\u06e4\u06eb\u06e0\u06e1\u06d8\u06ec\u06dc\u06da\u06e6\u06dc\u06d8\u06d9\u06e0\u06e6\u06d8\u06e7\u06ec\u06e0\u06e6\u06e8\u06e7\u06d9\u06d8\u06da\u06e2\u06d7\u06e5\u06d8\u06e8\u06da\u06dc\u06e8\u06e5\u06da\u06e1\u06ec\u06e6\u06d8\u06dc\u06d8\u06e8\u06d8\u06d7\u06eb\u06e0\u06e8\u06df\u06e4\u06e1\u06da\u06e0\u06da\u06ec\u06d6\u06d8"

    goto :goto_0

    :sswitch_1
    const-string v0, "\u06df\u06ec\u06d9\u06da\u06df\u06d6\u06d8\u06e6\u06d8\u06e1\u06d8\u06db\u06e8\u06e4\u06d8\u06e4\u06e4\u06ec\u06eb\u06ec\u06d6\u06e8\u06d8\u06d9\u06d6\u06df\u06e1\u06e7\u06d8\u06d8\u06eb\u06e8\u06e8\u06ec\u06e7\u06d6\u06df\u06eb\u06d8\u06d8\u06e1\u06e5\u06e4\u06e0\u06d8\u06d8\u06d6\u06e1\u06e6\u06d8\u06e6\u06e0\u06e5\u06d7\u06d6\u06db\u06ec\u06dc\u06d8\u06e2\u06e5\u06dc\u06d8\u06e2\u06e4\u06e2\u06d9\u06ec\u06e5\u06ec\u06ec\u06e6\u06df\u06e2\u06df\u06e6\u06d7\u06d6\u06e2\u06dc\u06ec\u06db\u06d6\u06d9\u06e0\u06db\u06e5\u06d8\u06d8\u06e4\u06e1\u06d9\u06e2\u06e1\u06db\u06d6\u06d8\u06e6\u06e4\u06db\u06d6\u06e2\u06e1\u06dc\u06dc\u06d8\u06e8\u06da\u06e7\u06da\u06e1\u06db\u06d6\u06eb\u06d9\u06e1\u06d6\u06e7\u06d8\u06e7\u06e5\u06d6\u06e2\u06e8\u06d8\u06db\u06e4\u06e1"

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda0;->f$0:Lkentos/loader/activity/MainActivity;

    iget v1, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda0;->f$1:I

    iget-object v2, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda0;->f$2:Ljava/lang/String;

    iget-object v3, p0, Lkentos/loader/activity/MainActivity$$ExternalSyntheticLambda0;->f$3:Ljava/lang/Runnable;

    invoke-virtual {v0, v1, v2, v3, p1}, Lkentos/loader/activity/MainActivity;->lambda$setupGameButton$8$kentos-loader-activity-MainActivity(ILjava/lang/String;Ljava/lang/Runnable;Landroid/view/View;)V

    const-string v0, "\u06e8\u06df\u06e5\u06d8\u06da\u06e1\u06e8\u06d8\u06e1\u06d8\u06e6\u06e6\u06e4\u06d6\u06d8\u06dc\u06d8\u06e1\u06eb\u06e1\u06d6\u06d8\u06eb\u06e7\u06e1\u06ec\u06d9\u06eb\u06e2\u06e7\u06dc\u06d7\u06dc\u06e2\u06db\u06df\u06db\u06e0\u06e0\u06d7\u06d6\u06d8\u06d8\u06e8\u06dc\u06e1\u06d8\u06da\u06eb\u06e2\u06e4\u06e4\u06d8\u06d6\u06e2\u06e8\u06d8\u06e4\u06eb\u06eb\u06e5\u06e8\u06e8\u06d8\u06e5\u06ec\u06d7\u06e8\u06db\u06e5\u06d8\u06dc\u06da\u06da\u06e8\u06dc\u06e4\u06d9\u06e5\u06d6\u06e6\u06e5\u06d8\u06dc\u06d9\u06dc\u06d8\u06e5\u06da\u06d6\u06d8\u06e2\u06d6\u06e0\u06d7\u06d7\u06d9\u06ec\u06e2\u06d6\u06d8\u06d6\u06da\u06e4\u06e0\u06e4\u06e6\u06d8\u06ec\u06db\u06d6\u06d8\u06eb\u06e5\u06d8\u06d9\u06d8\u06d8"

    goto :goto_0

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x71f2f9dd -> :sswitch_2
        -0x695902bc -> :sswitch_1
        0x552c7f8d -> :sswitch_0
        0x59b77c53 -> :sswitch_3
    .end sparse-switch
.end method

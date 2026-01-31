.class Ltop/niunaijun/blackbox/fake/service/IShortcutManagerProxy$1;
.super Ltop/niunaijun/blackbox/fake/service/base/PkgMethodProxy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltop/niunaijun/blackbox/fake/service/IShortcutManagerProxy;->onBindMethod()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Ltop/niunaijun/blackbox/fake/service/IShortcutManagerProxy;


# direct methods
.method public constructor <init>(Ltop/niunaijun/blackbox/fake/service/IShortcutManagerProxy;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ltop/niunaijun/blackbox/fake/service/IShortcutManagerProxy$1;->this$0:Ltop/niunaijun/blackbox/fake/service/IShortcutManagerProxy;

    invoke-direct {p0, p2}, Ltop/niunaijun/blackbox/fake/service/base/PkgMethodProxy;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public hook(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Ltop/niunaijun/blackbox/utils/compat/ParceledListSliceCompat;->create(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

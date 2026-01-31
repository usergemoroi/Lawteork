.class Ltop/niunaijun/blackbox/fake/service/BuildProxy$2;
.super Ltop/niunaijun/blackbox/fake/hook/MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltop/niunaijun/blackbox/fake/service/BuildProxy;->inject(Ljava/lang/Object;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Ltop/niunaijun/blackbox/fake/service/BuildProxy;

.field final synthetic val$idHolder:[Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;


# direct methods
.method public constructor <init>(Ltop/niunaijun/blackbox/fake/service/BuildProxy;[Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;)V
    .locals 0

    iput-object p1, p0, Ltop/niunaijun/blackbox/fake/service/BuildProxy$2;->this$0:Ltop/niunaijun/blackbox/fake/service/BuildProxy;

    iput-object p2, p0, Ltop/niunaijun/blackbox/fake/service/BuildProxy$2;->val$idHolder:[Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;

    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/hook/MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public hook(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    if-eqz p3, :cond_0

    array-length v0, p3

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    aget-object v0, p3, v1

    const-string v1, "android_id"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Ltop/niunaijun/blackbox/fake/service/BuildProxy$2;->val$idHolder:[Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;

    const/4 p2, 0x0

    aget-object p1, p1, p2

    iget-object p1, p1, Ltop/niunaijun/blackbox/fake/service/BuildProxy$GuestIdentity;->androidId:Ljava/lang/String;

    return-object p1

    :cond_0
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

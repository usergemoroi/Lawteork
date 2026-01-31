.class public Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;
.super Ltop/niunaijun/blackbox/fake/hook/MethodHook;
.source "SourceFile"


# instance fields
.field mName:Ljava/lang/String;

.field mValue:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/hook/MethodHook;-><init>()V

    iput-object p2, p0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;->mValue:Ljava/lang/Object;

    iput-object p1, p0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;->mName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getMethodName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public hook(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, Ltop/niunaijun/blackbox/fake/service/base/ValueMethodProxy;->mValue:Ljava/lang/Object;

    return-object p1
.end method

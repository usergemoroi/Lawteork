.class public Ltop/niunaijun/blackbox/fake/hook/ReplacePackageNameMethodHook;
.super Ltop/niunaijun/blackbox/fake/hook/MethodHook;
.source "SourceFile"


# instance fields
.field private packageNameIndex:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ltop/niunaijun/blackbox/fake/hook/MethodHook;-><init>()V

    iput p1, p0, Ltop/niunaijun/blackbox/fake/hook/ReplacePackageNameMethodHook;->packageNameIndex:I

    return-void
.end method


# virtual methods
.method public hook(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    if-eqz p3, :cond_2

    iget v0, p0, Ltop/niunaijun/blackbox/fake/hook/ReplacePackageNameMethodHook;->packageNameIndex:I

    if-gez v0, :cond_0

    array-length v1, p3

    add-int/2addr v0, v1

    iput v0, p0, Ltop/niunaijun/blackbox/fake/hook/ReplacePackageNameMethodHook;->packageNameIndex:I

    :cond_0
    iget v0, p0, Ltop/niunaijun/blackbox/fake/hook/ReplacePackageNameMethodHook;->packageNameIndex:I

    if-ltz v0, :cond_2

    array-length v1, p3

    if-ge v0, v1, :cond_2

    aget-object v1, p3, v0

    if-eqz v1, :cond_2

    instance-of v1, v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHostPkg()Ljava/lang/String;

    move-result-object v1

    aput-object v1, p3, v0

    goto :goto_0

    :cond_1
    invoke-static {}, Ltop/niunaijun/blackbox/utils/compat/BuildCompat;->isS()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1
    const-class v0, Lblack/android/content/AttributionSourceContext;

    invoke-static {v0}, Ltop/niunaijun/blackreflection/utils/ClassUtil;->classReady(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 2
    iget v1, p0, Ltop/niunaijun/blackbox/fake/hook/ReplacePackageNameMethodHook;->packageNameIndex:I

    aget-object v1, p3, v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Ltop/niunaijun/blackbox/fake/hook/ReplacePackageNameMethodHook;->packageNameIndex:I

    aget-object v0, p3, v0

    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->getHostUid()I

    move-result v1

    invoke-static {v0, v1}, Ltop/niunaijun/blackbox/utils/compat/ContextCompat;->fixAttributionSourceState(Ljava/lang/Object;I)V

    :cond_2
    :goto_0
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

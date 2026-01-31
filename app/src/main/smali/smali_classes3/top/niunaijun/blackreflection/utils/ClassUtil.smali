.class public Ltop/niunaijun/blackreflection/utils/ClassUtil;
.super Ljava/lang/Object;
.source "ClassUtil.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static classReady(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 17
    .local p0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-class v0, Ltop/niunaijun/blackreflection/annotation/BClassNameNotProcess;

    invoke-virtual {p0, v0}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackreflection/annotation/BClassNameNotProcess;

    .line 18
    .local v0, "bClassNameNotProcess":Ltop/niunaijun/blackreflection/annotation/BClassNameNotProcess;
    if-eqz v0, :cond_0

    .line 19
    invoke-interface {v0}, Ltop/niunaijun/blackreflection/annotation/BClassNameNotProcess;->value()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ltop/niunaijun/blackreflection/utils/ClassUtil;->classReady(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    return-object v1

    .line 21
    :cond_0
    const-class v1, Ltop/niunaijun/blackreflection/annotation/BClass;

    invoke-virtual {p0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    check-cast v1, Ltop/niunaijun/blackreflection/annotation/BClass;

    .line 22
    .local v1, "annotation":Ltop/niunaijun/blackreflection/annotation/BClass;
    if-eqz v1, :cond_1

    .line 23
    invoke-interface {v1}, Ltop/niunaijun/blackreflection/annotation/BClass;->value()Ljava/lang/Class;

    move-result-object v2

    return-object v2

    .line 25
    :cond_1
    const-class v2, Ltop/niunaijun/blackreflection/annotation/BClassName;

    invoke-virtual {p0, v2}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v2

    check-cast v2, Ltop/niunaijun/blackreflection/annotation/BClassName;

    .line 26
    .local v2, "bClassName":Ltop/niunaijun/blackreflection/annotation/BClassName;
    if-eqz v2, :cond_2

    .line 27
    invoke-interface {v2}, Ltop/niunaijun/blackreflection/annotation/BClassName;->value()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ltop/niunaijun/blackreflection/utils/ClassUtil;->classReady(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    return-object v3

    .line 29
    :cond_2
    const/4 v3, 0x0

    return-object v3
.end method

.method private static classReady(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1
    .param p0, "clazz"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 34
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 35
    :catch_0
    move-exception v0

    .line 37
    const/4 v0, 0x0

    return-object v0
.end method

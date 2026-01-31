.class public Ltop/niunaijun/blackreflection/BlackReflection;
.super Ljava/lang/Object;
.source "BlackReflection.java"


# static fields
.field public static CACHE:Z

.field public static DEBUG:Z

.field private static final sCallerProxyCache:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final sProxyCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final sProxyWithExceptionCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    const/4 v0, 0x0

    sput-boolean v0, Ltop/niunaijun/blackreflection/BlackReflection;->DEBUG:Z

    .line 37
    sput-boolean v0, Ltop/niunaijun/blackreflection/BlackReflection;->CACHE:Z

    .line 38
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ltop/niunaijun/blackreflection/BlackReflection;->sProxyCache:Ljava/util/Map;

    .line 39
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ltop/niunaijun/blackreflection/BlackReflection;->sProxyWithExceptionCache:Ljava/util/Map;

    .line 42
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Ltop/niunaijun/blackreflection/BlackReflection;->sCallerProxyCache:Ljava/util/WeakHashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .param p0, "x0"    # Ljava/lang/Class;

    .line 35
    invoke-static {p0}, Ltop/niunaijun/blackreflection/BlackReflection;->generateNullValue(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$100(Ljava/lang/reflect/Method;)[Ljava/lang/Class;
    .locals 1
    .param p0, "x0"    # Ljava/lang/reflect/Method;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 35
    invoke-static {p0}, Ltop/niunaijun/blackreflection/BlackReflection;->getParamClass(Ljava/lang/reflect/Method;)[Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public static create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 7
    .param p1, "caller"    # Ljava/lang/Object;
    .param p2, "withException"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/Object;",
            "Z)TT;"
        }
    .end annotation

    .line 50
    .local p0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    const/4 v0, 0x0

    :try_start_0
    invoke-static {p0, p1, p2}, Ltop/niunaijun/blackreflection/BlackReflection;->getProxy(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v1

    .line 51
    .local v1, "proxy":Ljava/lang/Object;, "TT;"
    if-eqz v1, :cond_0

    .line 52
    return-object v1

    .line 53
    :cond_0
    if-nez p1, :cond_1

    move-object v2, v0

    goto :goto_0

    :cond_1
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 55
    .local v2, "weakCaller":Ljava/lang/ref/WeakReference;, "Ljava/lang/ref/WeakReference<Ljava/lang/Object;>;"
    :goto_0
    invoke-static {p0}, Ltop/niunaijun/blackreflection/BlackReflection;->getClassNameByBlackClass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v3

    .line 56
    .local v3, "aClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Class;

    const/4 v6, 0x0

    aput-object p0, v5, v6

    new-instance v6, Ltop/niunaijun/blackreflection/BlackReflection$1;

    invoke-direct {v6, v2, v3, p2}, Ltop/niunaijun/blackreflection/BlackReflection$1;-><init>(Ljava/lang/ref/WeakReference;Ljava/lang/Class;Z)V

    invoke-static {v4, v5, v6}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v4

    .line 167
    .local v4, "o":Ljava/lang/Object;
    if-nez p1, :cond_3

    .line 168
    if-eqz p2, :cond_2

    .line 169
    sget-object v5, Ltop/niunaijun/blackreflection/BlackReflection;->sProxyWithExceptionCache:Ljava/util/Map;

    invoke-interface {v5, p0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 171
    :cond_2
    sget-object v5, Ltop/niunaijun/blackreflection/BlackReflection;->sProxyCache:Ljava/util/Map;

    invoke-interface {v5, p0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 174
    :cond_3
    :goto_1
    return-object v4

    .line 175
    .end local v1    # "proxy":Ljava/lang/Object;, "TT;"
    .end local v2    # "weakCaller":Ljava/lang/ref/WeakReference;, "Ljava/lang/ref/WeakReference<Ljava/lang/Object;>;"
    .end local v3    # "aClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v4    # "o":Ljava/lang/Object;
    :catch_0
    move-exception v1

    .line 176
    .local v1, "e":Ljava/lang/ClassNotFoundException;
    invoke-virtual {v1}, Ljava/lang/ClassNotFoundException;->printStackTrace()V

    .line 178
    .end local v1    # "e":Ljava/lang/ClassNotFoundException;
    return-object v0
.end method

.method private static generateNullValue(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 244
    .local p0, "returnType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_0

    .line 245
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 247
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-nez v0, :cond_1

    .line 250
    const/4 v0, 0x0

    return-object v0

    .line 248
    :cond_1
    new-instance v0, Ltop/niunaijun/blackreflection/BlackNullPointerException;

    const-string v1, "value is null!"

    invoke-direct {v0, v1}, Ltop/niunaijun/blackreflection/BlackNullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static getClassNameByBlackClass(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .line 227
    .local p0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-class v0, Ltop/niunaijun/blackreflection/annotation/BClass;

    invoke-virtual {p0, v0}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackreflection/annotation/BClass;

    .line 228
    .local v0, "bClass":Ltop/niunaijun/blackreflection/annotation/BClass;
    const-class v1, Ltop/niunaijun/blackreflection/annotation/BClassName;

    invoke-virtual {p0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    check-cast v1, Ltop/niunaijun/blackreflection/annotation/BClassName;

    .line 229
    .local v1, "bClassName":Ltop/niunaijun/blackreflection/annotation/BClassName;
    const-class v2, Ltop/niunaijun/blackreflection/annotation/BClassNameNotProcess;

    invoke-virtual {p0, v2}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v2

    check-cast v2, Ltop/niunaijun/blackreflection/annotation/BClassNameNotProcess;

    .line 230
    .local v2, "bClassNameNotProcess":Ltop/niunaijun/blackreflection/annotation/BClassNameNotProcess;
    if-nez v0, :cond_1

    if-nez v1, :cond_1

    if-eqz v2, :cond_0

    goto :goto_0

    .line 231
    :cond_0
    new-instance v3, Ljava/lang/RuntimeException;

    const-string v4, "Not found @BlackClass or @BlackStrClass"

    invoke-direct {v3, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 234
    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    .line 235
    invoke-interface {v0}, Ltop/niunaijun/blackreflection/annotation/BClass;->value()Ljava/lang/Class;

    move-result-object v3

    return-object v3

    .line 236
    :cond_2
    if-eqz v1, :cond_3

    .line 237
    invoke-interface {v1}, Ltop/niunaijun/blackreflection/annotation/BClassName;->value()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    return-object v3

    .line 239
    :cond_3
    invoke-interface {v2}, Ltop/niunaijun/blackreflection/annotation/BClassNameNotProcess;->value()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    return-object v3
.end method

.method private static getParamClass(Ljava/lang/reflect/Method;)[Ljava/lang/Class;
    .locals 10
    .param p0, "method"    # Ljava/lang/reflect/Method;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            ")[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 200
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v0

    .line 201
    .local v0, "parameterAnnotations":[[Ljava/lang/annotation/Annotation;
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    .line 202
    .local v1, "parameterTypes":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
    array-length v2, v1

    new-array v2, v2, [Ljava/lang/Class;

    .line 204
    .local v2, "param":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    array-length v4, v1

    if-ge v3, v4, :cond_4

    .line 205
    aget-object v4, v0, v3

    .line 206
    .local v4, "parameterAnnotation":[Ljava/lang/annotation/Annotation;
    const/4 v5, 0x0

    .line 207
    .local v5, "found":Z
    array-length v6, v4

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_2

    aget-object v8, v4, v7

    .line 208
    .local v8, "annotation":Ljava/lang/annotation/Annotation;
    instance-of v9, v8, Ltop/niunaijun/blackreflection/annotation/BParamClassName;

    if-eqz v9, :cond_0

    .line 209
    const/4 v5, 0x1

    .line 210
    move-object v6, v8

    check-cast v6, Ltop/niunaijun/blackreflection/annotation/BParamClassName;

    invoke-interface {v6}, Ltop/niunaijun/blackreflection/annotation/BParamClassName;->value()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    aput-object v6, v2, v3

    .line 211
    goto :goto_2

    .line 212
    :cond_0
    instance-of v9, v8, Ltop/niunaijun/blackreflection/annotation/BParamClass;

    if-eqz v9, :cond_1

    .line 213
    const/4 v5, 0x1

    .line 214
    move-object v6, v8

    check-cast v6, Ltop/niunaijun/blackreflection/annotation/BParamClass;

    invoke-interface {v6}, Ltop/niunaijun/blackreflection/annotation/BParamClass;->value()Ljava/lang/Class;

    move-result-object v6

    aput-object v6, v2, v3

    .line 215
    goto :goto_2

    .line 207
    .end local v8    # "annotation":Ljava/lang/annotation/Annotation;
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 219
    :cond_2
    :goto_2
    if-nez v5, :cond_3

    .line 220
    aget-object v6, v1, v3

    aput-object v6, v2, v3

    .line 204
    .end local v4    # "parameterAnnotation":[Ljava/lang/annotation/Annotation;
    .end local v5    # "found":Z
    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 223
    .end local v3    # "i":I
    :cond_4
    return-object v2
.end method

.method private static getProxy(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 1
    .param p1, "caller"    # Ljava/lang/Object;
    .param p2, "withException"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/Object;",
            "Z)TT;"
        }
    .end annotation

    .line 183
    .local p0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    if-nez p1, :cond_1

    .line 185
    if-eqz p2, :cond_0

    .line 186
    :try_start_0
    sget-object v0, Ltop/niunaijun/blackreflection/BlackReflection;->sProxyWithExceptionCache:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .local v0, "o":Ljava/lang/Object;
    goto :goto_0

    .line 188
    .end local v0    # "o":Ljava/lang/Object;
    :cond_0
    sget-object v0, Ltop/niunaijun/blackreflection/BlackReflection;->sProxyCache:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 190
    .restart local v0    # "o":Ljava/lang/Object;
    :goto_0
    if-eqz v0, :cond_1

    .line 191
    return-object v0

    .line 194
    .end local v0    # "o":Ljava/lang/Object;
    :catchall_0
    move-exception v0

    goto :goto_1

    .line 195
    :cond_1
    nop

    .line 196
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

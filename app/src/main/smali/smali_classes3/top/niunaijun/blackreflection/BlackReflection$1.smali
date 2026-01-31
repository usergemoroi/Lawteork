.class final Ltop/niunaijun/blackreflection/BlackReflection$1;
.super Ljava/lang/Object;
.source "BlackReflection.java"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$aClass:Ljava/lang/Class;

.field final synthetic val$weakCaller:Ljava/lang/ref/WeakReference;

.field final synthetic val$withException:Z


# direct methods
.method constructor <init>(Ljava/lang/ref/WeakReference;Ljava/lang/Class;Z)V
    .locals 0

    .line 56
    iput-object p1, p0, Ltop/niunaijun/blackreflection/BlackReflection$1;->val$weakCaller:Ljava/lang/ref/WeakReference;

    iput-object p2, p0, Ltop/niunaijun/blackreflection/BlackReflection$1;->val$aClass:Ljava/lang/Class;

    iput-boolean p3, p0, Ltop/niunaijun/blackreflection/BlackReflection$1;->val$withException:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17
    .param p1, "proxy"    # Ljava/lang/Object;
    .param p2, "method"    # Ljava/lang/reflect/Method;
    .param p3, "args"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 59
    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    .line 60
    .local v4, "name":Ljava/lang/String;
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v5

    .line 63
    .local v5, "returnType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :try_start_0
    iget-object v0, v1, Ltop/niunaijun/blackreflection/BlackReflection$1;->val$weakCaller:Ljava/lang/ref/WeakReference;

    const/4 v6, 0x0

    if-nez v0, :cond_0

    const/4 v7, 0x1

    goto :goto_0

    :cond_0
    move v7, v6

    .line 65
    .local v7, "isStatic":Z
    :goto_0
    const/4 v8, 0x0

    if-eqz v7, :cond_1

    move-object v0, v8

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    :goto_1
    move-object v9, v0

    .line 68
    .local v9, "callerByWeak":Ljava/lang/Object;
    const-class v0, Ltop/niunaijun/blackreflection/annotation/BField;

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackreflection/annotation/BField;

    move-object v10, v0

    .line 69
    .local v10, "bField":Ltop/niunaijun/blackreflection/annotation/BField;
    const-class v0, Ltop/niunaijun/blackreflection/annotation/BFieldNotProcess;

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackreflection/annotation/BFieldNotProcess;

    move-object v11, v0

    .line 70
    .local v11, "bFieldNotProcess":Ltop/niunaijun/blackreflection/annotation/BFieldNotProcess;
    if-nez v10, :cond_c

    if-eqz v11, :cond_2

    goto/16 :goto_5

    .line 85
    :cond_2
    const-class v0, Ltop/niunaijun/blackreflection/annotation/BFieldSetNotProcess;

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackreflection/annotation/BFieldSetNotProcess;

    move-object v12, v0

    .line 86
    .local v12, "bFieldSetNotProcess":Ltop/niunaijun/blackreflection/annotation/BFieldSetNotProcess;
    if-eqz v12, :cond_5

    .line 88
    const-string v0, "_set_"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    .line 89
    iget-object v0, v1, Ltop/niunaijun/blackreflection/BlackReflection$1;->val$aClass:Ljava/lang/Class;

    invoke-static {v0}, Ltop/niunaijun/blackreflection/utils/Reflector;->on(Ljava/lang/Class;)Ltop/niunaijun/blackreflection/utils/Reflector;

    move-result-object v0

    invoke-virtual {v0, v4}, Ltop/niunaijun/blackreflection/utils/Reflector;->field(Ljava/lang/String;)Ltop/niunaijun/blackreflection/utils/Reflector;

    move-result-object v0

    .line 90
    .local v0, "on":Ltop/niunaijun/blackreflection/utils/Reflector;
    if-eqz v7, :cond_3

    .line 91
    aget-object v8, v3, v6

    invoke-virtual {v0, v8}, Ltop/niunaijun/blackreflection/utils/Reflector;->set(Ljava/lang/Object;)Ltop/niunaijun/blackreflection/utils/Reflector;

    goto :goto_2

    .line 93
    :cond_3
    if-nez v9, :cond_4

    .line 94
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    return-object v6

    .line 96
    :cond_4
    aget-object v8, v3, v6

    invoke-virtual {v0, v9, v8}, Ltop/niunaijun/blackreflection/utils/Reflector;->set(Ljava/lang/Object;Ljava/lang/Object;)Ltop/niunaijun/blackreflection/utils/Reflector;

    .line 98
    :goto_2
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    return-object v6

    .line 102
    .end local v0    # "on":Ltop/niunaijun/blackreflection/utils/Reflector;
    :cond_5
    const-class v0, Ltop/niunaijun/blackreflection/annotation/BFieldCheckNotProcess;

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackreflection/annotation/BFieldCheckNotProcess;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    move-object v6, v0

    .line 103
    .local v6, "bFieldCheckNotProcess":Ltop/niunaijun/blackreflection/annotation/BFieldCheckNotProcess;
    const-string v0, "_check_"

    if-eqz v6, :cond_6

    .line 105
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-object v4, v0

    .line 107
    :try_start_2
    iget-object v0, v1, Ltop/niunaijun/blackreflection/BlackReflection$1;->val$aClass:Ljava/lang/Class;

    invoke-static {v0}, Ltop/niunaijun/blackreflection/utils/Reflector;->on(Ljava/lang/Class;)Ltop/niunaijun/blackreflection/utils/Reflector;

    move-result-object v0

    invoke-virtual {v0, v4}, Ltop/niunaijun/blackreflection/utils/Reflector;->field(Ljava/lang/String;)Ltop/niunaijun/blackreflection/utils/Reflector;

    move-result-object v0

    .line 108
    .restart local v0    # "on":Ltop/niunaijun/blackreflection/utils/Reflector;
    invoke-virtual {v0}, Ltop/niunaijun/blackreflection/utils/Reflector;->getField()Ljava/lang/reflect/Field;

    move-result-object v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object v8

    .line 109
    .end local v0    # "on":Ltop/niunaijun/blackreflection/utils/Reflector;
    :catchall_0
    move-exception v0

    .line 110
    .local v0, "ignored":Ljava/lang/Throwable;
    return-object v8

    .line 114
    .end local v0    # "ignored":Ljava/lang/Throwable;
    :cond_6
    :try_start_3
    invoke-static/range {p2 .. p2}, Ltop/niunaijun/blackreflection/BlackReflection;->access$100(Ljava/lang/reflect/Method;)[Ljava/lang/Class;

    move-result-object v13

    .line 117
    .local v13, "paramClass":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
    const-class v14, Ltop/niunaijun/blackreflection/annotation/BMethodCheckNotProcess;

    invoke-virtual {v2, v14}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v14

    check-cast v14, Ltop/niunaijun/blackreflection/annotation/BMethodCheckNotProcess;

    .line 118
    .local v14, "bMethodCheckNotProcess":Ltop/niunaijun/blackreflection/annotation/BMethodCheckNotProcess;
    if-eqz v14, :cond_7

    .line 120
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-object v4, v0

    .line 122
    :try_start_4
    iget-object v0, v1, Ltop/niunaijun/blackreflection/BlackReflection$1;->val$aClass:Ljava/lang/Class;

    invoke-static {v0}, Ltop/niunaijun/blackreflection/utils/Reflector;->on(Ljava/lang/Class;)Ltop/niunaijun/blackreflection/utils/Reflector;

    move-result-object v0

    invoke-virtual {v0, v4, v13}, Ltop/niunaijun/blackreflection/utils/Reflector;->method(Ljava/lang/String;[Ljava/lang/Class;)Ltop/niunaijun/blackreflection/utils/Reflector;

    move-result-object v0

    invoke-virtual {v0}, Ltop/niunaijun/blackreflection/utils/Reflector;->getMethod()Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    return-object v0

    .line 123
    :catchall_1
    move-exception v0

    .line 124
    .restart local v0    # "ignored":Ljava/lang/Throwable;
    return-object v8

    .line 129
    .end local v0    # "ignored":Ljava/lang/Throwable;
    :cond_7
    :try_start_5
    const-class v0, Ltop/niunaijun/blackreflection/annotation/BConstructor;

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Ltop/niunaijun/blackreflection/annotation/BConstructor;

    .line 130
    .local v0, "bConstructor":Ltop/niunaijun/blackreflection/annotation/BConstructor;
    const-class v8, Ltop/niunaijun/blackreflection/annotation/BConstructorNotProcess;

    invoke-virtual {v2, v8}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v8

    check-cast v8, Ltop/niunaijun/blackreflection/annotation/BConstructorNotProcess;

    .line 131
    .local v8, "bConstructorNotProcess":Ltop/niunaijun/blackreflection/annotation/BConstructorNotProcess;
    if-nez v0, :cond_b

    if-eqz v8, :cond_8

    goto :goto_4

    .line 137
    :cond_8
    iget-object v15, v1, Ltop/niunaijun/blackreflection/BlackReflection$1;->val$aClass:Ljava/lang/Class;

    invoke-static {v15}, Ltop/niunaijun/blackreflection/utils/Reflector;->on(Ljava/lang/Class;)Ltop/niunaijun/blackreflection/utils/Reflector;

    move-result-object v15

    invoke-virtual {v15, v4, v13}, Ltop/niunaijun/blackreflection/utils/Reflector;->method(Ljava/lang/String;[Ljava/lang/Class;)Ltop/niunaijun/blackreflection/utils/Reflector;

    move-result-object v15

    .line 138
    .local v15, "on":Ltop/niunaijun/blackreflection/utils/Reflector;
    if-eqz v7, :cond_9

    .line 139
    invoke-virtual {v15, v3}, Ltop/niunaijun/blackreflection/utils/Reflector;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    .local v16, "call":Ljava/lang/Object;
    goto :goto_3

    .line 141
    .end local v16    # "call":Ljava/lang/Object;
    :cond_9
    if-nez v9, :cond_a

    .line 142
    invoke-static {v5}, Ltop/niunaijun/blackreflection/BlackReflection;->access$000(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v16

    return-object v16

    .line 144
    :cond_a
    invoke-virtual {v15, v9, v3}, Ltop/niunaijun/blackreflection/utils/Reflector;->callByCaller(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    .line 146
    .restart local v16    # "call":Ljava/lang/Object;
    :goto_3
    return-object v16

    .line 132
    .end local v15    # "on":Ltop/niunaijun/blackreflection/utils/Reflector;
    .end local v16    # "call":Ljava/lang/Object;
    :cond_b
    :goto_4
    iget-object v15, v1, Ltop/niunaijun/blackreflection/BlackReflection$1;->val$aClass:Ljava/lang/Class;

    invoke-static {v15}, Ltop/niunaijun/blackreflection/utils/Reflector;->on(Ljava/lang/Class;)Ltop/niunaijun/blackreflection/utils/Reflector;

    move-result-object v15

    invoke-virtual {v15, v13}, Ltop/niunaijun/blackreflection/utils/Reflector;->constructor([Ljava/lang/Class;)Ltop/niunaijun/blackreflection/utils/Reflector;

    move-result-object v15

    .line 133
    .restart local v15    # "on":Ltop/niunaijun/blackreflection/utils/Reflector;
    invoke-virtual {v15, v3}, Ltop/niunaijun/blackreflection/utils/Reflector;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    return-object v16

    .line 72
    .end local v0    # "bConstructor":Ltop/niunaijun/blackreflection/annotation/BConstructor;
    .end local v6    # "bFieldCheckNotProcess":Ltop/niunaijun/blackreflection/annotation/BFieldCheckNotProcess;
    .end local v8    # "bConstructorNotProcess":Ltop/niunaijun/blackreflection/annotation/BConstructorNotProcess;
    .end local v12    # "bFieldSetNotProcess":Ltop/niunaijun/blackreflection/annotation/BFieldSetNotProcess;
    .end local v13    # "paramClass":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
    .end local v14    # "bMethodCheckNotProcess":Ltop/niunaijun/blackreflection/annotation/BMethodCheckNotProcess;
    .end local v15    # "on":Ltop/niunaijun/blackreflection/utils/Reflector;
    :cond_c
    :goto_5
    iget-object v0, v1, Ltop/niunaijun/blackreflection/BlackReflection$1;->val$aClass:Ljava/lang/Class;

    invoke-static {v0}, Ltop/niunaijun/blackreflection/utils/Reflector;->on(Ljava/lang/Class;)Ltop/niunaijun/blackreflection/utils/Reflector;

    move-result-object v0

    invoke-virtual {v0, v4}, Ltop/niunaijun/blackreflection/utils/Reflector;->field(Ljava/lang/String;)Ltop/niunaijun/blackreflection/utils/Reflector;

    move-result-object v0

    .line 73
    .local v0, "on":Ltop/niunaijun/blackreflection/utils/Reflector;
    if-eqz v7, :cond_d

    .line 74
    invoke-virtual {v0}, Ltop/niunaijun/blackreflection/utils/Reflector;->get()Ljava/lang/Object;

    move-result-object v6

    .local v6, "call":Ljava/lang/Object;
    goto :goto_6

    .line 76
    .end local v6    # "call":Ljava/lang/Object;
    :cond_d
    if-nez v9, :cond_e

    .line 77
    invoke-static {v5}, Ltop/niunaijun/blackreflection/BlackReflection;->access$000(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    return-object v6

    .line 79
    :cond_e
    invoke-virtual {v0, v9}, Ltop/niunaijun/blackreflection/utils/Reflector;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 81
    .restart local v6    # "call":Ljava/lang/Object;
    :goto_6
    return-object v6

    .line 147
    .end local v0    # "on":Ltop/niunaijun/blackreflection/utils/Reflector;
    .end local v6    # "call":Ljava/lang/Object;
    .end local v7    # "isStatic":Z
    .end local v9    # "callerByWeak":Ljava/lang/Object;
    .end local v10    # "bField":Ltop/niunaijun/blackreflection/annotation/BField;
    .end local v11    # "bFieldNotProcess":Ltop/niunaijun/blackreflection/annotation/BFieldNotProcess;
    :catchall_2
    move-exception v0

    .line 148
    .local v0, "throwable":Ljava/lang/Throwable;
    sget-boolean v6, Ltop/niunaijun/blackreflection/BlackReflection;->DEBUG:Z

    if-eqz v6, :cond_10

    .line 149
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v6

    if-eqz v6, :cond_f

    .line 150
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_7

    .line 152
    :cond_f
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 155
    :cond_10
    :goto_7
    instance-of v6, v0, Ltop/niunaijun/blackreflection/BlackNullPointerException;

    if-nez v6, :cond_12

    .line 158
    iget-boolean v6, v1, Ltop/niunaijun/blackreflection/BlackReflection$1;->val$withException:Z

    if-nez v6, :cond_11

    .line 163
    .end local v0    # "throwable":Ljava/lang/Throwable;
    invoke-static {v5}, Ltop/niunaijun/blackreflection/BlackReflection;->access$000(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 159
    .restart local v0    # "throwable":Ljava/lang/Throwable;
    :cond_11
    throw v0

    .line 156
    :cond_12
    new-instance v6, Ljava/lang/NullPointerException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v6
.end method

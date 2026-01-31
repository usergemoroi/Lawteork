.class public Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;
.super Ltop/niunaijun/blackreflection/utils/Reflector;
.source "Reflector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/niunaijun/blackreflection/utils/Reflector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "QuietReflector"
.end annotation


# instance fields
.field protected mIgnored:Ljava/lang/Throwable;


# direct methods
.method protected constructor <init>()V
    .locals 0

    .line 253
    invoke-direct {p0}, Ltop/niunaijun/blackreflection/utils/Reflector;-><init>()V

    .line 255
    return-void
.end method

.method public static on(Ljava/lang/Class;)Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;"
        }
    .end annotation

    .line 236
    .local p0, "type":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    if-nez p0, :cond_0

    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Type was null!"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p0, v0}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->on(Ljava/lang/Class;Ljava/lang/Throwable;)Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;

    move-result-object v0

    return-object v0
.end method

.method private static on(Ljava/lang/Class;Ljava/lang/Throwable;)Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;
    .locals 1
    .param p1, "ignored"    # Ljava/lang/Throwable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Throwable;",
            ")",
            "Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;"
        }
    .end annotation

    .line 240
    .local p0, "type":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    new-instance v0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;

    invoke-direct {v0}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;-><init>()V

    .line 241
    .local v0, "reflector":Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;
    iput-object p0, v0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->mType:Ljava/lang/Class;

    .line 242
    iput-object p1, v0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->mIgnored:Ljava/lang/Throwable;

    .line 243
    return-object v0
.end method

.method public static on(Ljava/lang/String;)Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;
    .locals 2
    .param p0, "name"    # Ljava/lang/String;

    .line 217
    const-class v0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {p0, v1, v0}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->on(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;

    move-result-object v0

    return-object v0
.end method

.method public static on(Ljava/lang/String;Z)Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;
    .param p1, "initialize"    # Z

    .line 221
    const-class v0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {p0, p1, v0}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->on(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;

    move-result-object v0

    return-object v0
.end method

.method public static on(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;
    .locals 3
    .param p0, "name"    # Ljava/lang/String;
    .param p1, "initialize"    # Z
    .param p2, "loader"    # Ljava/lang/ClassLoader;

    .line 225
    const/4 v0, 0x0

    .line 227
    .local v0, "cls":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :try_start_0
    invoke-static {p0, p1, p2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v1

    move-object v0, v1

    .line 228
    const/4 v1, 0x0

    invoke-static {v0, v1}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->on(Ljava/lang/Class;Ljava/lang/Throwable;)Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    .line 229
    :catchall_0
    move-exception v1

    .line 231
    .local v1, "e":Ljava/lang/Throwable;
    invoke-static {v0, v1}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->on(Ljava/lang/Class;Ljava/lang/Throwable;)Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;

    move-result-object v2

    return-object v2
.end method

.method public static with(Ljava/lang/Object;)Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;
    .locals 2
    .param p0, "caller"    # Ljava/lang/Object;

    .line 247
    if-nez p0, :cond_0

    .line 248
    const/4 v0, 0x0

    move-object v1, v0

    check-cast v1, Ljava/lang/Class;

    invoke-static {v0}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->on(Ljava/lang/Class;)Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;

    move-result-object v0

    return-object v0

    .line 250
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->on(Ljava/lang/Class;)Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;

    move-result-object v0

    invoke-virtual {v0, p0}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->bind(Ljava/lang/Object;)Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public bind(Ljava/lang/Object;)Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;
    .locals 1
    .param p1, "obj"    # Ljava/lang/Object;

    .line 301
    invoke-virtual {p0}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->skipAlways()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 302
    return-object p0

    .line 305
    :cond_0
    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->mIgnored:Ljava/lang/Throwable;

    .line 306
    invoke-super {p0, p1}, Ltop/niunaijun/blackreflection/utils/Reflector;->bind(Ljava/lang/Object;)Ltop/niunaijun/blackreflection/utils/Reflector;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 310
    goto :goto_0

    .line 307
    :catchall_0
    move-exception v0

    .line 308
    .local v0, "e":Ljava/lang/Throwable;
    iput-object v0, p0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->mIgnored:Ljava/lang/Throwable;

    .line 311
    .end local v0    # "e":Ljava/lang/Throwable;
    :goto_0
    return-object p0
.end method

.method public bridge synthetic bind(Ljava/lang/Object;)Ltop/niunaijun/blackreflection/utils/Reflector;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 212
    invoke-virtual {p0, p1}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->bind(Ljava/lang/Object;)Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;

    move-result-object p1

    return-object p1
.end method

.method public varargs call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1, "args"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            ")TR;"
        }
    .end annotation

    .line 412
    invoke-virtual {p0}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->skip()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 413
    return-object v1

    .line 416
    :cond_0
    :try_start_0
    iput-object v1, p0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->mIgnored:Ljava/lang/Throwable;

    .line 417
    invoke-super {p0, p1}, Ltop/niunaijun/blackreflection/utils/Reflector;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    .line 418
    :catchall_0
    move-exception v0

    .line 419
    .local v0, "e":Ljava/lang/Throwable;
    iput-object v0, p0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->mIgnored:Ljava/lang/Throwable;

    .line 422
    .end local v0    # "e":Ljava/lang/Throwable;
    return-object v1
.end method

.method public varargs callByCaller(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1, "caller"    # Ljava/lang/Object;
    .param p2, "args"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "[",
            "Ljava/lang/Object;",
            ")TR;"
        }
    .end annotation

    .line 427
    invoke-virtual {p0}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->skip()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 428
    return-object v1

    .line 431
    :cond_0
    :try_start_0
    iput-object v1, p0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->mIgnored:Ljava/lang/Throwable;

    .line 432
    invoke-super {p0, p1, p2}, Ltop/niunaijun/blackreflection/utils/Reflector;->callByCaller(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    .line 433
    :catchall_0
    move-exception v0

    .line 434
    .local v0, "e":Ljava/lang/Throwable;
    iput-object v0, p0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->mIgnored:Ljava/lang/Throwable;

    .line 437
    .end local v0    # "e":Ljava/lang/Throwable;
    return-object v1
.end method

.method public varargs constructor([Ljava/lang/Class;)Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)",
            "Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;"
        }
    .end annotation

    .line 271
    .local p1, "parameterTypes":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
    invoke-virtual {p0}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->skipAlways()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 272
    return-object p0

    .line 275
    :cond_0
    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->mIgnored:Ljava/lang/Throwable;

    .line 276
    invoke-super {p0, p1}, Ltop/niunaijun/blackreflection/utils/Reflector;->constructor([Ljava/lang/Class;)Ltop/niunaijun/blackreflection/utils/Reflector;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 280
    goto :goto_0

    .line 277
    :catchall_0
    move-exception v0

    .line 278
    .local v0, "e":Ljava/lang/Throwable;
    iput-object v0, p0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->mIgnored:Ljava/lang/Throwable;

    .line 281
    .end local v0    # "e":Ljava/lang/Throwable;
    :goto_0
    return-object p0
.end method

.method public bridge synthetic constructor([Ljava/lang/Class;)Ltop/niunaijun/blackreflection/utils/Reflector;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 212
    invoke-virtual {p0, p1}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->constructor([Ljava/lang/Class;)Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;

    move-result-object p1

    return-object p1
.end method

.method public field(Ljava/lang/String;)Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;

    .line 322
    invoke-virtual {p0}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->skipAlways()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 323
    return-object p0

    .line 326
    :cond_0
    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->mIgnored:Ljava/lang/Throwable;

    .line 327
    invoke-super {p0, p1}, Ltop/niunaijun/blackreflection/utils/Reflector;->field(Ljava/lang/String;)Ltop/niunaijun/blackreflection/utils/Reflector;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 331
    goto :goto_0

    .line 328
    :catchall_0
    move-exception v0

    .line 329
    .local v0, "e":Ljava/lang/Throwable;
    iput-object v0, p0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->mIgnored:Ljava/lang/Throwable;

    .line 332
    .end local v0    # "e":Ljava/lang/Throwable;
    :goto_0
    return-object p0
.end method

.method public bridge synthetic field(Ljava/lang/String;)Ltop/niunaijun/blackreflection/utils/Reflector;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 212
    invoke-virtual {p0, p1}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->field(Ljava/lang/String;)Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;

    move-result-object p1

    return-object p1
.end method

.method public get()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">()TR;"
        }
    .end annotation

    .line 337
    invoke-virtual {p0}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->skip()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 338
    return-object v1

    .line 341
    :cond_0
    :try_start_0
    iput-object v1, p0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->mIgnored:Ljava/lang/Throwable;

    .line 342
    invoke-super {p0}, Ltop/niunaijun/blackreflection/utils/Reflector;->get()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    .line 343
    :catchall_0
    move-exception v0

    .line 344
    .local v0, "e":Ljava/lang/Throwable;
    iput-object v0, p0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->mIgnored:Ljava/lang/Throwable;

    .line 347
    .end local v0    # "e":Ljava/lang/Throwable;
    return-object v1
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1, "caller"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")TR;"
        }
    .end annotation

    .line 352
    invoke-virtual {p0}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->skip()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 353
    return-object v1

    .line 356
    :cond_0
    :try_start_0
    iput-object v1, p0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->mIgnored:Ljava/lang/Throwable;

    .line 357
    invoke-super {p0, p1}, Ltop/niunaijun/blackreflection/utils/Reflector;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    .line 358
    :catchall_0
    move-exception v0

    .line 359
    .local v0, "e":Ljava/lang/Throwable;
    iput-object v0, p0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->mIgnored:Ljava/lang/Throwable;

    .line 362
    .end local v0    # "e":Ljava/lang/Throwable;
    return-object v1
.end method

.method public getIgnored()Ljava/lang/Throwable;
    .locals 1

    .line 258
    iget-object v0, p0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->mIgnored:Ljava/lang/Throwable;

    return-object v0
.end method

.method public varargs method(Ljava/lang/String;[Ljava/lang/Class;)Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;)",
            "Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;"
        }
    .end annotation

    .line 397
    .local p2, "parameterTypes":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
    invoke-virtual {p0}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->skipAlways()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 398
    return-object p0

    .line 401
    :cond_0
    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->mIgnored:Ljava/lang/Throwable;

    .line 402
    invoke-super {p0, p1, p2}, Ltop/niunaijun/blackreflection/utils/Reflector;->method(Ljava/lang/String;[Ljava/lang/Class;)Ltop/niunaijun/blackreflection/utils/Reflector;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 406
    goto :goto_0

    .line 403
    :catchall_0
    move-exception v0

    .line 404
    .local v0, "e":Ljava/lang/Throwable;
    iput-object v0, p0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->mIgnored:Ljava/lang/Throwable;

    .line 407
    .end local v0    # "e":Ljava/lang/Throwable;
    :goto_0
    return-object p0
.end method

.method public bridge synthetic method(Ljava/lang/String;[Ljava/lang/Class;)Ltop/niunaijun/blackreflection/utils/Reflector;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 212
    invoke-virtual {p0, p1, p2}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->method(Ljava/lang/String;[Ljava/lang/Class;)Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;

    move-result-object p1

    return-object p1
.end method

.method public varargs newInstance([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1, "initargs"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            ")TR;"
        }
    .end annotation

    .line 286
    invoke-virtual {p0}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->skip()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 287
    return-object v1

    .line 290
    :cond_0
    :try_start_0
    iput-object v1, p0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->mIgnored:Ljava/lang/Throwable;

    .line 291
    invoke-super {p0, p1}, Ltop/niunaijun/blackreflection/utils/Reflector;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    .line 292
    :catchall_0
    move-exception v0

    .line 293
    .local v0, "e":Ljava/lang/Throwable;
    iput-object v0, p0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->mIgnored:Ljava/lang/Throwable;

    .line 296
    .end local v0    # "e":Ljava/lang/Throwable;
    return-object v1
.end method

.method public set(Ljava/lang/Object;)Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;
    .locals 1
    .param p1, "value"    # Ljava/lang/Object;

    .line 367
    invoke-virtual {p0}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->skip()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 368
    return-object p0

    .line 371
    :cond_0
    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->mIgnored:Ljava/lang/Throwable;

    .line 372
    invoke-super {p0, p1}, Ltop/niunaijun/blackreflection/utils/Reflector;->set(Ljava/lang/Object;)Ltop/niunaijun/blackreflection/utils/Reflector;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 376
    goto :goto_0

    .line 373
    :catchall_0
    move-exception v0

    .line 374
    .local v0, "e":Ljava/lang/Throwable;
    iput-object v0, p0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->mIgnored:Ljava/lang/Throwable;

    .line 377
    .end local v0    # "e":Ljava/lang/Throwable;
    :goto_0
    return-object p0
.end method

.method public set(Ljava/lang/Object;Ljava/lang/Object;)Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;
    .locals 1
    .param p1, "caller"    # Ljava/lang/Object;
    .param p2, "value"    # Ljava/lang/Object;

    .line 382
    invoke-virtual {p0}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->skip()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 383
    return-object p0

    .line 386
    :cond_0
    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->mIgnored:Ljava/lang/Throwable;

    .line 387
    invoke-super {p0, p1, p2}, Ltop/niunaijun/blackreflection/utils/Reflector;->set(Ljava/lang/Object;Ljava/lang/Object;)Ltop/niunaijun/blackreflection/utils/Reflector;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 391
    goto :goto_0

    .line 388
    :catchall_0
    move-exception v0

    .line 389
    .local v0, "e":Ljava/lang/Throwable;
    iput-object v0, p0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->mIgnored:Ljava/lang/Throwable;

    .line 392
    .end local v0    # "e":Ljava/lang/Throwable;
    :goto_0
    return-object p0
.end method

.method public bridge synthetic set(Ljava/lang/Object;)Ltop/niunaijun/blackreflection/utils/Reflector;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 212
    invoke-virtual {p0, p1}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->set(Ljava/lang/Object;)Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic set(Ljava/lang/Object;Ljava/lang/Object;)Ltop/niunaijun/blackreflection/utils/Reflector;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 212
    invoke-virtual {p0, p1, p2}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->set(Ljava/lang/Object;Ljava/lang/Object;)Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;

    move-result-object p1

    return-object p1
.end method

.method protected skip()Z
    .locals 1

    .line 262
    invoke-virtual {p0}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->skipAlways()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->mIgnored:Ljava/lang/Throwable;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method protected skipAlways()Z
    .locals 1

    .line 266
    iget-object v0, p0, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->mType:Ljava/lang/Class;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public unbind()Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;
    .locals 0

    .line 316
    invoke-super {p0}, Ltop/niunaijun/blackreflection/utils/Reflector;->unbind()Ltop/niunaijun/blackreflection/utils/Reflector;

    .line 317
    return-object p0
.end method

.method public bridge synthetic unbind()Ltop/niunaijun/blackreflection/utils/Reflector;
    .locals 1

    .line 212
    invoke-virtual {p0}, Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;->unbind()Ltop/niunaijun/blackreflection/utils/Reflector$QuietReflector;

    move-result-object v0

    return-object v0
.end method

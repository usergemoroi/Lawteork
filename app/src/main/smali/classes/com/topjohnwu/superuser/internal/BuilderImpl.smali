.class public Lcom/topjohnwu/superuser/internal/BuilderImpl;
.super Lcom/topjohnwu/superuser/Shell$Builder;
.source "BuilderImpl.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/topjohnwu/superuser/Shell$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic build()Lcom/topjohnwu/superuser/Shell;
    .locals 1

    .line 35
    invoke-virtual {p0}, Lcom/topjohnwu/superuser/internal/BuilderImpl;->build()Lcom/topjohnwu/superuser/internal/ShellImpl;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build([Ljava/lang/String;)Lcom/topjohnwu/superuser/Shell;
    .locals 0

    .line 35
    invoke-virtual {p0, p1}, Lcom/topjohnwu/superuser/internal/BuilderImpl;->build([Ljava/lang/String;)Lcom/topjohnwu/superuser/internal/ShellImpl;

    move-result-object p1

    return-object p1
.end method

.method public build()Lcom/topjohnwu/superuser/internal/ShellImpl;
    .locals 7

    .line 45
    const/4 v0, 0x0

    .line 48
    .local v0, "shell":Lcom/topjohnwu/superuser/internal/ShellImpl;
    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lcom/topjohnwu/superuser/internal/BuilderImpl;->hasFlags(I)Z

    move-result v2

    const-string/jumbo v3, "su"

    const/4 v4, 0x0

    if-nez v2, :cond_1

    const/4 v2, 0x2

    invoke-virtual {p0, v2}, Lcom/topjohnwu/superuser/internal/BuilderImpl;->hasFlags(I)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 50
    :try_start_0
    new-array v5, v2, [Ljava/lang/String;

    aput-object v3, v5, v4

    const-string v6, "--mount-master"

    aput-object v6, v5, v1

    invoke-virtual {p0, v5}, Lcom/topjohnwu/superuser/internal/BuilderImpl;->build([Ljava/lang/String;)Lcom/topjohnwu/superuser/internal/ShellImpl;

    move-result-object v5

    move-object v0, v5

    .line 51
    invoke-virtual {v0}, Lcom/topjohnwu/superuser/internal/ShellImpl;->getStatus()I

    move-result v5
    :try_end_0
    .catch Lcom/topjohnwu/superuser/NoShellException; {:try_start_0 .. :try_end_0} :catch_0

    if-eq v5, v2, :cond_0

    .line 52
    const/4 v0, 0x0

    goto :goto_0

    .line 53
    :catch_0
    move-exception v2

    :cond_0
    :goto_0
    nop

    .line 57
    :cond_1
    if-nez v0, :cond_3

    invoke-virtual {p0, v1}, Lcom/topjohnwu/superuser/internal/BuilderImpl;->hasFlags(I)Z

    move-result v2

    if-nez v2, :cond_3

    .line 59
    :try_start_1
    new-array v2, v1, [Ljava/lang/String;

    aput-object v3, v2, v4

    invoke-virtual {p0, v2}, Lcom/topjohnwu/superuser/internal/BuilderImpl;->build([Ljava/lang/String;)Lcom/topjohnwu/superuser/internal/ShellImpl;

    move-result-object v2

    move-object v0, v2

    .line 60
    invoke-virtual {v0}, Lcom/topjohnwu/superuser/internal/ShellImpl;->getStatus()I

    move-result v2
    :try_end_1
    .catch Lcom/topjohnwu/superuser/NoShellException; {:try_start_1 .. :try_end_1} :catch_1

    if-eq v2, v1, :cond_2

    .line 61
    const/4 v0, 0x0

    goto :goto_1

    .line 62
    :catch_1
    move-exception v1

    :cond_2
    :goto_1
    nop

    .line 66
    :cond_3
    if-nez v0, :cond_4

    .line 67
    const-string/jumbo v1, "sh"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/topjohnwu/superuser/internal/BuilderImpl;->build([Ljava/lang/String;)Lcom/topjohnwu/superuser/internal/ShellImpl;

    move-result-object v0

    .line 69
    :cond_4
    return-object v0
.end method

.method public varargs build([Ljava/lang/String;)Lcom/topjohnwu/superuser/internal/ShellImpl;
    .locals 9
    .param p1, "commands"    # [Ljava/lang/String;

    .line 77
    :try_start_0
    new-instance v0, Lcom/topjohnwu/superuser/internal/ShellImpl;

    iget-wide v1, p0, Lcom/topjohnwu/superuser/internal/BuilderImpl;->timeout:J

    const/16 v3, 0x8

    invoke-virtual {p0, v3}, Lcom/topjohnwu/superuser/internal/BuilderImpl;->hasFlags(I)Z

    move-result v3

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/topjohnwu/superuser/internal/ShellImpl;-><init>(JZ[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 81
    .local v0, "shell":Lcom/topjohnwu/superuser/internal/ShellImpl;
    nop

    .line 82
    invoke-static {v0}, Lcom/topjohnwu/superuser/internal/MainShell;->set(Lcom/topjohnwu/superuser/internal/ShellImpl;)V

    .line 83
    iget-object v1, p0, Lcom/topjohnwu/superuser/internal/BuilderImpl;->initClasses:[Ljava/lang/Class;

    if-eqz v1, :cond_1

    .line 84
    invoke-static {}, Lcom/topjohnwu/superuser/internal/Utils;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 85
    .local v1, "ctx":Landroid/content/Context;
    iget-object v2, p0, Lcom/topjohnwu/superuser/internal/BuilderImpl;->initClasses:[Ljava/lang/Class;

    array-length v3, v2

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_1

    aget-object v6, v2, v5

    .line 88
    .local v6, "cls":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/topjohnwu/superuser/Shell$Initializer;>;"
    :try_start_1
    new-array v7, v4, [Ljava/lang/Class;

    invoke-virtual {v6, v7}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v7

    .line 89
    .local v7, "ic":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<+Lcom/topjohnwu/superuser/Shell$Initializer;>;"
    const/4 v8, 0x1

    invoke-virtual {v7, v8}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    .line 90
    new-array v8, v4, [Ljava/lang/Object;

    invoke-virtual {v7, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/topjohnwu/superuser/Shell$Initializer;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object v7, v8

    .line 94
    .local v7, "init":Lcom/topjohnwu/superuser/Shell$Initializer;
    nop

    .line 95
    invoke-virtual {v7, v1, v0}, Lcom/topjohnwu/superuser/Shell$Initializer;->onInit(Landroid/content/Context;Lcom/topjohnwu/superuser/Shell;)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_1

    .line 96
    :cond_0
    const/4 v2, 0x0

    invoke-static {v2}, Lcom/topjohnwu/superuser/internal/MainShell;->set(Lcom/topjohnwu/superuser/internal/ShellImpl;)V

    .line 97
    new-instance v2, Lcom/topjohnwu/superuser/NoShellException;

    const-string v3, "Unable to init shell"

    invoke-direct {v2, v3}, Lcom/topjohnwu/superuser/NoShellException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 91
    .end local v7    # "init":Lcom/topjohnwu/superuser/Shell$Initializer;
    :catch_0
    move-exception v7

    .line 92
    .local v7, "e":Ljava/lang/Exception;
    invoke-static {v7}, Lcom/topjohnwu/superuser/internal/Utils;->err(Ljava/lang/Throwable;)V

    .line 93
    nop

    .line 85
    .end local v6    # "cls":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/topjohnwu/superuser/Shell$Initializer;>;"
    .end local v7    # "e":Ljava/lang/Exception;
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 101
    .end local v1    # "ctx":Landroid/content/Context;
    :cond_1
    return-object v0

    .line 78
    .end local v0    # "shell":Lcom/topjohnwu/superuser/internal/ShellImpl;
    :catch_1
    move-exception v0

    .line 79
    .local v0, "e":Ljava/io/IOException;
    invoke-static {v0}, Lcom/topjohnwu/superuser/internal/Utils;->ex(Ljava/lang/Throwable;)V

    .line 80
    new-instance v1, Lcom/topjohnwu/superuser/NoShellException;

    const-string v2, "Unable to create a shell!"

    invoke-direct {v1, v2, v0}, Lcom/topjohnwu/superuser/NoShellException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method hasFlags(I)Z
    .locals 1
    .param p1, "flags"    # I

    .line 39
    iget v0, p0, Lcom/topjohnwu/superuser/internal/BuilderImpl;->flags:I

    and-int/2addr v0, p1

    if-ne v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

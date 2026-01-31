.class public Lkentos/loader/App;
.super Landroid/app/Application;
.source "App.java"


# instance fields
.field private final expectedSignatureSha256:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 28
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 33
    const-wide v0, -0x2fbffb2820ad5f49L    # -3.7097281852547915E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkentos/loader/App;->expectedSignatureSha256:Ljava/lang/String;

    return-void
.end method

.method private getApkSignatureSha256()Ljava/lang/String;
    .locals 12

    .line 112
    :try_start_0
    invoke-virtual {p0}, Lkentos/loader/App;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Lkentos/loader/App;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/high16 v2, 0x8000000

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 113
    .local v0, "pInfo":Landroid/content/pm/PackageInfo;
    iget-object v1, v0, Landroid/content/pm/PackageInfo;->signingInfo:Landroid/content/pm/SigningInfo;

    invoke-virtual {v1}, Landroid/content/pm/SigningInfo;->getApkContentsSigners()[Landroid/content/pm/Signature;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v1}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v1

    .line 114
    .local v1, "signer":[B
    const-wide v3, -0x2fbffa5920ad5f49L    # -3.71045965993961E78

    invoke-static {v3, v4}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v3

    .line 115
    .local v3, "md":Ljava/security/MessageDigest;
    invoke-virtual {v3, v1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v4

    .line 116
    .local v4, "digest":[B
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .local v5, "sb":Ljava/lang/StringBuilder;
    array-length v6, v4

    move v7, v2

    :goto_0
    if-ge v7, v6, :cond_0

    aget-byte v8, v4, v7

    .line 118
    .local v8, "b":B
    const-wide v9, -0x2fbffa5120ad5f49L    # -3.710487929492646E78

    invoke-static {v9, v10}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/Object;

    invoke-static {v8}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v11

    aput-object v11, v10, v2

    invoke-static {v9, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    nop

    .end local v8    # "b":B
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 120
    :cond_0
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    .line 121
    .end local v0    # "pInfo":Landroid/content/pm/PackageInfo;
    .end local v1    # "signer":[B
    .end local v3    # "md":Ljava/security/MessageDigest;
    .end local v4    # "digest":[B
    .end local v5    # "sb":Ljava/lang/StringBuilder;
    :catch_0
    move-exception v0

    .line 122
    .local v0, "e":Ljava/lang/Exception;
    const/4 v1, 0x0

    return-object v1
.end method

.method private hasUnexpectedMetaInf()Z
    .locals 11

    .line 128
    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p0}, Lkentos/loader/App;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageCodePath()Ljava/lang/String;

    move-result-object v1

    .line 129
    .local v1, "apkPath":Ljava/lang/String;
    new-instance v2, Ljava/util/zip/ZipFile;

    invoke-direct {v2, v1}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    .local v2, "zip":Ljava/util/zip/ZipFile;
    const/4 v3, 0x3

    :try_start_1
    new-array v3, v3, [Ljava/lang/String;

    const-wide v4, -0x2fbffa4c20ad5f49L    # -3.710505597963294E78

    invoke-static {v4, v5}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const-wide v6, -0x2fbffa7720ad5f49L    # -3.710353649115723E78

    invoke-static {v6, v7}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v0

    const-wide v6, -0x2fbffa6320ad5f49L    # -3.710424322998314E78

    invoke-static {v6, v7}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x2

    aput-object v4, v3, v6

    .line 138
    .local v3, "forbidden":[Ljava/lang/String;
    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    move-result-object v4

    .line 139
    .local v4, "entries":Ljava/util/Enumeration;, "Ljava/util/Enumeration<+Ljava/util/zip/ZipEntry;>;"
    :goto_0
    invoke-interface {v4}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 140
    invoke-interface {v4}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/zip/ZipEntry;

    .line 141
    .local v6, "entry":Ljava/util/zip/ZipEntry;
    array-length v7, v3

    move v8, v5

    :goto_1
    if-ge v8, v7, :cond_1

    aget-object v9, v3, v8

    .line 142
    .local v9, "forbiddenName":Ljava/lang/String;
    invoke-virtual {v6}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v10, :cond_0

    .line 143
    nop

    .line 149
    :try_start_2
    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->close()V

    .line 143
    return v0

    .line 141
    .end local v9    # "forbiddenName":Ljava/lang/String;
    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 146
    .end local v6    # "entry":Ljava/util/zip/ZipEntry;
    :cond_1
    goto :goto_0

    .line 147
    :cond_2
    nop

    .line 149
    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->close()V

    .line 147
    return v5

    .line 149
    .end local v3    # "forbidden":[Ljava/lang/String;
    .end local v4    # "entries":Ljava/util/Enumeration;, "Ljava/util/Enumeration<+Ljava/util/zip/ZipEntry;>;"
    :catchall_0
    move-exception v3

    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->close()V

    .line 150
    throw v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 151
    .end local v1    # "apkPath":Ljava/lang/String;
    .end local v2    # "zip":Ljava/util/zip/ZipFile;
    :catch_0
    move-exception v1

    .line 152
    .local v1, "e":Ljava/lang/Exception;
    return v0
.end method

.method private killApp()V
    .locals 3

    .line 157
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    .line 158
    const/16 v0, 0xa

    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    .line 159
    new-instance v0, Ljava/lang/RuntimeException;

    const-wide v1, -0x2fbffa0e20ad5f49L    # -3.7107246869993265E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private runAntiTamperChecks()V
    .locals 5

    .line 90
    const-wide v0, -0x2fbffb2720ad5f49L    # -3.709731718948921E78

    :try_start_0
    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 91
    invoke-direct {p0}, Lkentos/loader/App;->getApkSignatureSha256()Ljava/lang/String;

    move-result-object v0

    .line 92
    .local v0, "currentSig":Ljava/lang/String;
    if-eqz v0, :cond_0

    const-wide v1, -0x2fbffb2620ad5f49L    # -3.709735252643051E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 93
    :cond_0
    const-wide v1, -0x2fbffb2520ad5f49L    # -3.70973878633718E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x2fbffada20ad5f49L    # -3.710003813396897E78

    invoke-static {v2, v3}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 94
    invoke-direct {p0}, Lkentos/loader/App;->killApp()V

    .line 99
    .end local v0    # "currentSig":Ljava/lang/String;
    :cond_1
    invoke-direct {p0}, Lkentos/loader/App;->hasUnexpectedMetaInf()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 100
    const-wide v0, -0x2fbffaf920ad5f49L    # -3.709894268878881E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x2fbffaee20ad5f49L    # -3.709933139514306E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    invoke-direct {p0}, Lkentos/loader/App;->killApp()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    :cond_2
    goto :goto_0

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    .local v0, "t":Ljava/lang/Throwable;
    const-wide v1, -0x2fbffabc20ad5f49L    # -3.710109824220784E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v3, -0x2fbffab120ad5f49L    # -3.710148694856209E78

    invoke-static {v3, v4}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 106
    invoke-direct {p0}, Lkentos/loader/App;->killApp()V

    .line 108
    .end local v0    # "t":Ljava/lang/Throwable;
    :goto_0
    return-void
.end method


# virtual methods
.method protected attachBaseContext(Landroid/content/Context;)V
    .locals 2
    .param p1, "base"    # Landroid/content/Context;

    .line 37
    invoke-super {p0, p1}, Landroid/app/Application;->attachBaseContext(Landroid/content/Context;)V

    .line 40
    :try_start_0
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->get()Ltop/niunaijun/blackbox/BlackBoxCore;

    move-result-object v0

    new-instance v1, Lkentos/loader/App$1;

    invoke-direct {v1, p0, p1}, Lkentos/loader/App$1;-><init>(Lkentos/loader/App;Landroid/content/Context;)V

    invoke-virtual {v0, p1, v1}, Ltop/niunaijun/blackbox/BlackBoxCore;->doAttachBaseContext(Landroid/content/Context;Ltop/niunaijun/blackbox/app/configuration/ClientConfiguration;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    goto :goto_0

    .line 66
    :catch_0
    move-exception v0

    .line 67
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 69
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_0
    return-void
.end method

.method public checkRootAccess()Z
    .locals 3

    .line 166
    invoke-static {}, Lcom/topjohnwu/superuser/Shell;->rootAccess()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 167
    const-wide v0, -0x2fbffa2d20ad5f49L    # -3.71061514248131E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x2fbffa2920ad5f49L    # -3.7106292772578285E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 168
    const/4 v0, 0x1

    return v0

    .line 170
    :cond_0
    const-wide v0, -0x2fbff5dc20ad5f49L    # -3.7145198744944705E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x2fbff5d820ad5f49L    # -3.714534009270989E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 171
    const/4 v0, 0x0

    return v0
.end method

.method public doChmod(Ljava/lang/String;I)V
    .locals 3
    .param p1, "shell"    # Ljava/lang/String;
    .param p2, "mask"    # I

    .line 194
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x2fbff5f720ad5f49L    # -3.7144244647529725E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-wide v1, -0x2fbff5f020ad5f49L    # -3.714449200611879E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkentos/loader/App;->doExe(Ljava/lang/String;)V

    .line 195
    return-void
.end method

.method public doExe(Ljava/lang/String;)V
    .locals 4
    .param p1, "shell"    # Ljava/lang/String;

    .line 176
    invoke-virtual {p0}, Lkentos/loader/App;->checkRootAccess()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 177
    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/topjohnwu/superuser/Shell;->su([Ljava/lang/String;)Lcom/topjohnwu/superuser/Shell$Job;

    move-result-object v0

    invoke-virtual {v0}, Lcom/topjohnwu/superuser/Shell$Job;->exec()Lcom/topjohnwu/superuser/Shell$Result;

    goto :goto_0

    .line 180
    :cond_0
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    .line 181
    const-wide v0, -0x2fbff5c720ad5f49L    # -3.714594082071191E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x2fbff5c320ad5f49L    # -3.714608216847709E78

    invoke-static {v2, v3}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 184
    goto :goto_0

    .line 182
    :catch_0
    move-exception v0

    .line 183
    .local v0, "e":Ljava/io/IOException;
    const-wide v1, -0x2fbff5fb20ad5f49L    # -3.714410329976454E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 186
    .end local v0    # "e":Ljava/io/IOException;
    :goto_0
    return-void
.end method

.method public doExecute(Ljava/lang/String;)V
    .locals 1
    .param p1, "shell"    # Ljava/lang/String;

    .line 189
    const/16 v0, 0x309

    invoke-virtual {p0, p1, v0}, Lkentos/loader/App;->doChmod(Ljava/lang/String;I)V

    .line 190
    invoke-virtual {p0, p1}, Lkentos/loader/App;->doExe(Ljava/lang/String;)V

    .line 191
    return-void
.end method

.method public onCreate()V
    .locals 1

    .line 73
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 76
    invoke-static {}, Ltop/niunaijun/blackbox/BlackBoxCore;->get()Ltop/niunaijun/blackbox/BlackBoxCore;

    move-result-object v0

    invoke-virtual {v0}, Ltop/niunaijun/blackbox/BlackBoxCore;->doCreate()V

    .line 77
    invoke-static {p0}, Lcom/google/android/material/color/DynamicColors;->applyToActivitiesIfAvailable(Landroid/app/Application;)V

    .line 78
    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/appcompat/app/AppCompatDelegate;->setDefaultNightMode(I)V

    .line 81
    invoke-direct {p0}, Lkentos/loader/App;->runAntiTamperChecks()V

    .line 82
    return-void
.end method

.method public toast(Ljava/lang/CharSequence;)V
    .locals 1
    .param p1, "msg"    # Ljava/lang/CharSequence;

    .line 198
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 199
    return-void
.end method

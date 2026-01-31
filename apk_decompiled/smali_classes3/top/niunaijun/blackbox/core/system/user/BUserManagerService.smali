.class public Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;
.super Ltop/niunaijun/blackbox/core/system/user/IBUserManagerService$Stub;
.source "SourceFile"

# interfaces
.implements Ltop/niunaijun/blackbox/core/system/ISystemService;


# static fields
.field private static sService:Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;


# instance fields
.field public final mUserLock:Ljava/lang/Object;

.field public final mUsers:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ltop/niunaijun/blackbox/core/system/user/BUserInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;-><init>()V

    sput-object v0, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->sService:Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ltop/niunaijun/blackbox/core/system/user/IBUserManagerService$Stub;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->mUsers:Ljava/util/HashMap;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->mUserLock:Ljava/lang/Object;

    return-void
.end method

.method private createUserLocked(I)Ltop/niunaijun/blackbox/core/system/user/BUserInfo;
    .locals 2

    new-instance v0, Ltop/niunaijun/blackbox/core/system/user/BUserInfo;

    invoke-direct {v0}, Ltop/niunaijun/blackbox/core/system/user/BUserInfo;-><init>()V

    iput p1, v0, Ltop/niunaijun/blackbox/core/system/user/BUserInfo;->id:I

    sget-object v1, Ltop/niunaijun/blackbox/core/system/user/BUserStatus;->ENABLE:Ltop/niunaijun/blackbox/core/system/user/BUserStatus;

    iput-object v1, v0, Ltop/niunaijun/blackbox/core/system/user/BUserInfo;->status:Ltop/niunaijun/blackbox/core/system/user/BUserStatus;

    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->mUsers:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->mUsers:Ljava/util/HashMap;

    monitor-enter p1

    :try_start_0
    invoke-direct {p0}, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->saveUserInfoLocked()V

    monitor-exit p1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static get()Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;
    .locals 1

    sget-object v0, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->sService:Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;

    return-object v0
.end method

.method private saveUserInfoLocked()V
    .locals 6

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    new-instance v1, Landroidx/core/util/AtomicFile;

    invoke-static {}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getUserInfoConf()Ljava/io/File;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/core/util/AtomicFile;-><init>(Ljava/io/File;)V

    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->mUsers:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v2}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    :try_start_1
    invoke-virtual {v1}, Landroidx/core/util/AtomicFile;->startWrite()Ljava/io/FileOutputStream;

    move-result-object v4

    invoke-static {v0, v4}, Ltop/niunaijun/blackbox/utils/FileUtils;->writeParcelToOutput(Landroid/os/Parcel;Ljava/io/FileOutputStream;)V

    invoke-virtual {v1, v4}, Landroidx/core/util/AtomicFile;->finishWrite(Ljava/io/FileOutputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    new-array v1, v3, [Ljava/io/Closeable;

    aput-object v4, v1, v2

    invoke-static {v1}, Ltop/niunaijun/blackbox/utils/CloseUtils;->close([Ljava/io/Closeable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v5

    :try_start_3
    invoke-virtual {v5}, Ljava/lang/Throwable;->printStackTrace()V

    invoke-virtual {v1, v4}, Landroidx/core/util/AtomicFile;->failWrite(Ljava/io/FileOutputStream;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    new-array v1, v3, [Ljava/io/Closeable;

    aput-object v4, v1, v2

    invoke-static {v1}, Ltop/niunaijun/blackbox/utils/CloseUtils;->close([Ljava/io/Closeable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-void

    :goto_1
    :try_start_5
    new-array v3, v3, [Ljava/io/Closeable;

    aput-object v4, v3, v2

    invoke-static {v3}, Ltop/niunaijun/blackbox/utils/CloseUtils;->close([Ljava/io/Closeable;)V

    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v1

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    throw v1
.end method

.method private scanUserL()V
    .locals 11

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->mUserLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :try_start_1
    invoke-static {}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getUserInfoConf()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-nez v5, :cond_0

    :try_start_2
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    new-array v1, v2, [Ljava/io/Closeable;

    aput-object v4, v1, v3

    invoke-static {v1}, Ltop/niunaijun/blackbox/utils/CloseUtils;->close([Ljava/io/Closeable;)V

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    return-void

    :cond_0
    :try_start_3
    new-instance v5, Ljava/io/FileInputStream;

    invoke-static {}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getUserInfoConf()Ljava/io/File;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-static {v5}, Ltop/niunaijun/blackbox/utils/FileUtils;->toByteArray(Ljava/io/InputStream;)[B

    move-result-object v4

    array-length v6, v4

    invoke-virtual {v1, v4, v3, v6}, Landroid/os/Parcel;->unmarshall([BII)V

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    sget-object v4, Ltop/niunaijun/blackbox/core/system/user/BUserInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {v1, v4}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v4
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-nez v4, :cond_1

    :try_start_5
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    new-array v1, v2, [Ljava/io/Closeable;

    aput-object v5, v1, v3

    invoke-static {v1}, Ltop/niunaijun/blackbox/utils/CloseUtils;->close([Ljava/io/Closeable;)V

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    return-void

    :cond_1
    :try_start_6
    iget-object v6, p0, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->mUsers:Ljava/util/HashMap;

    monitor-enter v6
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :try_start_7
    iget-object v7, p0, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->mUsers:Ljava/util/HashMap;

    invoke-virtual {v7}, Ljava/util/HashMap;->clear()V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ltop/niunaijun/blackbox/core/system/user/BUserInfo;

    iget-object v8, p0, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->mUsers:Ljava/util/HashMap;

    iget v9, v7, Ltop/niunaijun/blackbox/core/system/user/BUserInfo;->id:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v8, v9, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    monitor-exit v6
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :try_start_8
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    new-array v1, v2, [Ljava/io/Closeable;

    aput-object v5, v1, v3

    invoke-static {v1}, Ltop/niunaijun/blackbox/utils/CloseUtils;->close([Ljava/io/Closeable;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    goto :goto_2

    :catchall_0
    move-exception v4

    :try_start_9
    monitor-exit v6
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :try_start_a
    throw v4
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :catchall_1
    move-exception v4

    goto :goto_3

    :catch_0
    move-exception v4

    goto :goto_1

    :catchall_2
    move-exception v5

    move-object v10, v5

    move-object v5, v4

    move-object v4, v10

    goto :goto_3

    :catch_1
    move-exception v5

    move-object v10, v5

    move-object v5, v4

    move-object v4, v10

    :goto_1
    :try_start_b
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    :try_start_c
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    new-array v1, v2, [Ljava/io/Closeable;

    aput-object v5, v1, v3

    invoke-static {v1}, Ltop/niunaijun/blackbox/utils/CloseUtils;->close([Ljava/io/Closeable;)V

    :goto_2
    monitor-exit v0

    return-void

    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    new-array v1, v2, [Ljava/io/Closeable;

    aput-object v5, v1, v3

    invoke-static {v1}, Ltop/niunaijun/blackbox/utils/CloseUtils;->close([Ljava/io/Closeable;)V

    throw v4

    :catchall_3
    move-exception v1

    monitor-exit v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    throw v1
.end method


# virtual methods
.method public createUser(I)Ltop/niunaijun/blackbox/core/system/user/BUserInfo;
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->mUserLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0, p1}, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->exists(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1}, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->getUserInfo(I)Ltop/niunaijun/blackbox/core/system/user/BUserInfo;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->createUserLocked(I)Ltop/niunaijun/blackbox/core/system/user/BUserInfo;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public deleteUser(I)V
    .locals 4

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->mUserLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->mUsers:Ljava/util/HashMap;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->get()Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;

    move-result-object v2

    invoke-virtual {v2, p1}, Ltop/niunaijun/blackbox/core/system/pm/BPackageManagerService;->deleteUser(I)V

    iget-object v2, p0, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->mUsers:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->saveUserInfoLocked()V

    invoke-static {p1}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getUserDir(I)Ljava/io/File;

    move-result-object v2

    invoke-static {v2}, Ltop/niunaijun/blackbox/utils/FileUtils;->deleteDir(Ljava/io/File;)I

    invoke-static {p1}, Ltop/niunaijun/blackbox/core/env/BEnvironment;->getExternalUserDir(I)Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Ltop/niunaijun/blackbox/utils/FileUtils;->deleteDir(Ljava/io/File;)I

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method public exists(I)Z
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->mUsers:Ljava/util/HashMap;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->mUsers:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public getAllUsers()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/core/system/user/BUserInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->mUsers:Ljava/util/HashMap;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->mUsers:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getUserInfo(I)Ltop/niunaijun/blackbox/core/system/user/BUserInfo;
    .locals 2

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->mUserLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->mUsers:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ltop/niunaijun/blackbox/core/system/user/BUserInfo;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public getUsers()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/core/system/user/BUserInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->mUsers:Ljava/util/HashMap;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->mUsers:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ltop/niunaijun/blackbox/core/system/user/BUserInfo;

    iget v4, v3, Ltop/niunaijun/blackbox/core/system/user/BUserInfo;->id:I

    if-ltz v4, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public systemReady()V
    .locals 0

    invoke-direct {p0}, Ltop/niunaijun/blackbox/core/system/user/BUserManagerService;->scanUserL()V

    return-void
.end method

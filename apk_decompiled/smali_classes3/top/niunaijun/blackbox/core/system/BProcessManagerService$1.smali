.class Ltop/niunaijun/blackbox/core/system/BProcessManagerService$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltop/niunaijun/blackbox/utils/PermissionUtils$CallBack;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltop/niunaijun/blackbox/core/system/BProcessManagerService;->startRequestPermission([Ljava/lang/String;Landroid/os/ConditionVariable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Ltop/niunaijun/blackbox/core/system/BProcessManagerService;

.field final synthetic val$permissionLock:Landroid/os/ConditionVariable;


# direct methods
.method public constructor <init>(Ltop/niunaijun/blackbox/core/system/BProcessManagerService;Landroid/os/ConditionVariable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService$1;->this$0:Ltop/niunaijun/blackbox/core/system/BProcessManagerService;

    iput-object p2, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService$1;->val$permissionLock:Landroid/os/ConditionVariable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(I[Ljava/lang/String;[I)Z
    .locals 0

    :try_start_0
    invoke-static {p3}, Ltop/niunaijun/blackbox/utils/PermissionUtils;->isRequestGranted([I)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p2, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService$1;->val$permissionLock:Landroid/os/ConditionVariable;

    invoke-virtual {p2}, Landroid/os/ConditionVariable;->open()V

    return p1

    :catchall_0
    move-exception p1

    iget-object p2, p0, Ltop/niunaijun/blackbox/core/system/BProcessManagerService$1;->val$permissionLock:Landroid/os/ConditionVariable;

    invoke-virtual {p2}, Landroid/os/ConditionVariable;->open()V

    throw p1
.end method

.class Ltop/niunaijun/blackbox/utils/PermissionUtils$2;
.super Ltop/niunaijun/blackbox/core/system/am/IRequestPermissionsResult$Stub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltop/niunaijun/blackbox/utils/PermissionUtils;->startRequestPermissions(Landroid/content/Context;[Ljava/lang/String;Ltop/niunaijun/blackbox/utils/PermissionUtils$CallBack;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$callBack:Ltop/niunaijun/blackbox/utils/PermissionUtils$CallBack;


# direct methods
.method public constructor <init>(Ltop/niunaijun/blackbox/utils/PermissionUtils$CallBack;)V
    .locals 0

    iput-object p1, p0, Ltop/niunaijun/blackbox/utils/PermissionUtils$2;->val$callBack:Ltop/niunaijun/blackbox/utils/PermissionUtils$CallBack;

    invoke-direct {p0}, Ltop/niunaijun/blackbox/core/system/am/IRequestPermissionsResult$Stub;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(I[Ljava/lang/String;[I)Z
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/utils/PermissionUtils$2;->val$callBack:Ltop/niunaijun/blackbox/utils/PermissionUtils$CallBack;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Ltop/niunaijun/blackbox/utils/PermissionUtils$CallBack;->onResult(I[Ljava/lang/String;[I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

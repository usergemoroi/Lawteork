.class public interface abstract Lblack/android/app/IApplicationThreadContext;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ltop/niunaijun/blackreflection/annotation/BClassNameNotProcess;
    value = "android.app.IApplicationThread"
.end annotation


# virtual methods
.method public abstract _check_scheduleBindService(Landroid/os/IBinder;Landroid/content/Intent;Z)Ljava/lang/reflect/Method;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BMethodCheckNotProcess;
    .end annotation
.end method

.method public abstract _check_scheduleCreateService(Landroid/os/IBinder;Landroid/content/pm/ServiceInfo;)Ljava/lang/reflect/Method;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BMethodCheckNotProcess;
    .end annotation
.end method

.method public abstract _check_scheduleNewIntent(Ljava/util/List;Landroid/os/IBinder;)Ljava/lang/reflect/Method;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BMethodCheckNotProcess;
    .end annotation
.end method

.method public abstract _check_scheduleServiceArgs(Landroid/os/IBinder;IILandroid/content/Intent;)Ljava/lang/reflect/Method;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BMethodCheckNotProcess;
    .end annotation
.end method

.method public abstract _check_scheduleStopService(Landroid/os/IBinder;)Ljava/lang/reflect/Method;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BMethodCheckNotProcess;
    .end annotation
.end method

.method public abstract _check_scheduleUnbindService(Landroid/os/IBinder;Landroid/content/Intent;)Ljava/lang/reflect/Method;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BMethodCheckNotProcess;
    .end annotation
.end method

.method public abstract scheduleBindService(Landroid/os/IBinder;Landroid/content/Intent;Z)Ljava/lang/Void;
.end method

.method public abstract scheduleCreateService(Landroid/os/IBinder;Landroid/content/pm/ServiceInfo;)Ljava/lang/Void;
.end method

.method public abstract scheduleNewIntent(Ljava/util/List;Landroid/os/IBinder;)Ljava/lang/Void;
.end method

.method public abstract scheduleServiceArgs(Landroid/os/IBinder;IILandroid/content/Intent;)Ljava/lang/Void;
.end method

.method public abstract scheduleStopService(Landroid/os/IBinder;)Ljava/lang/Void;
.end method

.method public abstract scheduleUnbindService(Landroid/os/IBinder;Landroid/content/Intent;)Ljava/lang/Void;
.end method

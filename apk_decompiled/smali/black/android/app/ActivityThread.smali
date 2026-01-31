.class public interface abstract Lblack/android/app/ActivityThread;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lblack/android/app/ActivityThread$ActivityClientRecord;,
        Lblack/android/app/ActivityThread$ProviderClientRecord;,
        Lblack/android/app/ActivityThread$ProviderClientRecordP;,
        Lblack/android/app/ActivityThread$ProviderClientRecordJB;,
        Lblack/android/app/ActivityThread$ProviderKeyJBMR1;,
        Lblack/android/app/ActivityThread$AppBindData;,
        Lblack/android/app/ActivityThread$H;,
        Lblack/android/app/ActivityThread$CreateServiceData;
    }
.end annotation

.annotation runtime Ltop/niunaijun/blackreflection/annotation/BClassName;
    value = "android.app.ActivityThread"
.end annotation


# virtual methods
.method public abstract currentActivityThread()Ljava/lang/Object;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BStaticMethod;
    .end annotation
.end method

.method public abstract currentApplication()Landroid/app/Application;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BStaticMethod;
    .end annotation
.end method

.method public abstract currentPackageName()Ljava/lang/String;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BStaticMethod;
    .end annotation
.end method

.method public abstract getActivityClient(Landroid/os/IBinder;)Ljava/lang/Object;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BMethod;
    .end annotation
.end method

.method public abstract getApplicationThread()Landroid/os/IBinder;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BMethod;
    .end annotation
.end method

.method public abstract getHandler()Landroid/os/Handler;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BMethod;
    .end annotation
.end method

.method public abstract getLaunchingActivity(Landroid/os/IBinder;)Ljava/lang/Object;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BMethod;
    .end annotation
.end method

.method public abstract getPackageInfo(Landroid/content/pm/ApplicationInfo;Ljava/lang/Object;I)Ljava/lang/Object;
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ltop/niunaijun/blackreflection/annotation/BParamClassName;
            value = "android.content.res.CompatibilityInfo"
        .end annotation
    .end param
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BMethod;
    .end annotation
.end method

.method public abstract getProcessName()Ljava/lang/String;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BMethod;
    .end annotation
.end method

.method public abstract getSystemContext()Ljava/lang/Object;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BMethod;
    .end annotation
.end method

.method public abstract mActivities()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Landroid/os/IBinder;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BField;
    .end annotation
.end method

.method public abstract mAppThread()Ljava/lang/Object;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BField;
    .end annotation
.end method

.method public abstract mBoundApplication()Ljava/lang/Object;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BField;
    .end annotation
.end method

.method public abstract mH()Landroid/os/Handler;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BField;
    .end annotation
.end method

.method public abstract mInitialApplication()Landroid/app/Application;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BField;
    .end annotation
.end method

.method public abstract mInstrumentation()Landroid/app/Instrumentation;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BField;
    .end annotation
.end method

.method public abstract mLocalProvidersByName()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "**>;"
        }
    .end annotation

    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BField;
    .end annotation
.end method

.method public abstract mPackages()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/WeakReference<",
            "*>;>;"
        }
    .end annotation

    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BField;
    .end annotation
.end method

.method public abstract mProviderMap()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "**>;"
        }
    .end annotation

    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BField;
    .end annotation
.end method

.method public abstract performNewIntents(Landroid/os/IBinder;Ljava/util/List;)V
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BMethod;
    .end annotation
.end method

.method public abstract sPackageManager()Landroid/os/IInterface;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BStaticField;
    .end annotation
.end method

.method public abstract sPermissionManager()Landroid/os/IInterface;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BStaticField;
    .end annotation
.end method

.method public abstract sendActivityResult(Landroid/os/IBinder;Ljava/lang/String;IILandroid/content/Intent;)V
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BMethod;
    .end annotation
.end method

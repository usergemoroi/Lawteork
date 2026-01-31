.class public abstract Lb/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/Object;)Lblack/android/app/ActivityThreadContext;
    .locals 2

    .line 1
    const-class v0, Lblack/android/app/ActivityThreadContext;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lblack/android/app/ActivityThreadContext;

    return-object p0
.end method

.method public static a()Lblack/android/app/ActivityThreadStatic;
    .locals 3

    .line 2
    const-class v0, Lblack/android/app/ActivityThreadStatic;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Ltop/niunaijun/blackreflection/BlackReflection;->create(Ljava/lang/Class;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lblack/android/app/ActivityThreadStatic;

    return-object v0
.end method

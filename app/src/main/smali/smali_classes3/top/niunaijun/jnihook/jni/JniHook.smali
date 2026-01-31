.class public final Ltop/niunaijun/jnihook/jni/JniHook;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final NATIVE_OFFSET:I

.field public static final NATIVE_OFFSET_2:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native nativeOffset()V
.end method

.method public static native nativeOffset2()V
.end method

.method public static native setAccessible(Ljava/lang/Class;Ljava/lang/reflect/Field;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Field;",
            ")V"
        }
    .end annotation
.end method

.method public static native setAccessible(Ljava/lang/Class;Ljava/lang/reflect/Method;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Method;",
            ")V"
        }
    .end annotation
.end method

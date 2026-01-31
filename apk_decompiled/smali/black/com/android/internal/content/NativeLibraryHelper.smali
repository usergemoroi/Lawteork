.class public interface abstract Lblack/com/android/internal/content/NativeLibraryHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lblack/com/android/internal/content/NativeLibraryHelper$Handle;
    }
.end annotation

.annotation runtime Ltop/niunaijun/blackreflection/annotation/BClassName;
    value = "com.android.internal.content.NativeLibraryHelper"
.end annotation


# virtual methods
.method public abstract copyNativeBinaries(Lblack/com/android/internal/content/NativeLibraryHelper$Handle;Ljava/io/File;Ljava/lang/String;)Ljava/lang/Integer;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BStaticMethod;
    .end annotation
.end method

.method public abstract findSupportedAbi(Lblack/com/android/internal/content/NativeLibraryHelper$Handle;[Ljava/lang/String;)Ljava/lang/Integer;
    .param p2    # [Ljava/lang/String;
        .annotation runtime Ltop/niunaijun/blackreflection/annotation/BParamClassName;
            value = "[Ljava.lang.String;"
        .end annotation
    .end param
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BStaticMethod;
    .end annotation
.end method

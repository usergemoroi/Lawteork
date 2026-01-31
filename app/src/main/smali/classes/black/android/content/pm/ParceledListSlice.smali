.class public interface abstract Lblack/android/content/pm/ParceledListSlice;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ltop/niunaijun/blackreflection/annotation/BClassName;
    value = "android.content.pm.ParceledListSlice"
.end annotation


# virtual methods
.method public abstract CREATOR()Landroid/os/Parcelable$Creator;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BStaticField;
    .end annotation
.end method

.method public abstract _new()Ljava/lang/Object;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BConstructor;
    .end annotation
.end method

.method public abstract _new(Ljava/util/List;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BConstructor;
    .end annotation
.end method

.method public abstract append(Ljava/lang/Object;)Ljava/lang/Boolean;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BMethod;
    .end annotation
.end method

.method public abstract getList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "*>;"
        }
    .end annotation

    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BMethod;
    .end annotation
.end method

.method public abstract isLastSlice()Ljava/lang/Boolean;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BMethod;
    .end annotation
.end method

.method public abstract populateList()Landroid/os/Parcelable;
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BMethod;
    .end annotation
.end method

.method public abstract setLastSlice(Z)V
    .annotation runtime Ltop/niunaijun/blackreflection/annotation/BMethod;
    .end annotation
.end method

.class public interface abstract Landroid/app/job/IJobService;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/app/job/IJobService$_Parcel;,
        Landroid/app/job/IJobService$Stub;,
        Landroid/app/job/IJobService$Default;
    }
.end annotation


# virtual methods
.method public abstract startJob(Landroid/app/job/JobParameters;)V
.end method

.method public abstract stopJob(Landroid/app/job/JobParameters;)V
.end method

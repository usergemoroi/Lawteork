.class public final synthetic Ltop/niunaijun/blackbox/utils/FileUtils$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Ljava/io/File;


# direct methods
.method public synthetic constructor <init>(Ljava/io/File;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltop/niunaijun/blackbox/utils/FileUtils$$ExternalSyntheticLambda0;->f$0:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ltop/niunaijun/blackbox/utils/FileUtils$$ExternalSyntheticLambda0;->f$0:Ljava/io/File;

    invoke-static {v0}, Ltop/niunaijun/blackbox/utils/FileUtils;->lambda$isCln$0(Ljava/io/File;)V

    return-void
.end method

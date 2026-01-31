.class public Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P49;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P48;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P47;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P46;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P45;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P44;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P43;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P42;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P41;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P40;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P39;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P38;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P37;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P36;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P35;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P34;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P33;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P32;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P31;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P30;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P29;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P28;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P27;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P26;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P25;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P24;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P23;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P22;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P21;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P20;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P19;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P18;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P17;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P16;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P15;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P14;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P13;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P12;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P11;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P10;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P9;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P8;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P7;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P6;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P5;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P4;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P3;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P2;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P1;,
        Ltop/niunaijun/blackbox/proxy/ProxyPendingActivity$P0;
    }
.end annotation


# static fields
.field public static final TAG:Ljava/lang/String; = "ProxyPendingActivity"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-static {p1}, Ltop/niunaijun/blackbox/proxy/record/ProxyPendingRecord;->create(Landroid/content/Intent;)Ltop/niunaijun/blackbox/proxy/record/ProxyPendingRecord;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ProxyPendingActivity: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ProxyPendingActivity"

    invoke-static {v1, v0}, Ltop/niunaijun/blackbox/utils/Slog;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p1, Ltop/niunaijun/blackbox/proxy/record/ProxyPendingRecord;->mTarget:Landroid/content/Intent;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iget-object v0, p1, Ltop/niunaijun/blackbox/proxy/record/ProxyPendingRecord;->mTarget:Landroid/content/Intent;

    invoke-static {}, Ltop/niunaijun/blackbox/app/BActivityThread;->getApplication()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    iget-object p1, p1, Ltop/niunaijun/blackbox/proxy/record/ProxyPendingRecord;->mTarget:Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

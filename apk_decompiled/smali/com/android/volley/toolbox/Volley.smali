.class public Lcom/android/volley/toolbox/Volley;
.super Ljava/lang/Object;
.source "Volley.java"


# static fields
.field private static final DEFAULT_CACHE_DIR:Ljava/lang/String; = "volley"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static newRequestQueue(Landroid/content/Context;)Lcom/android/volley/RequestQueue;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;

    .line 121
    const/4 v0, 0x0

    move-object v1, v0

    check-cast v1, Lcom/android/volley/toolbox/BaseHttpStack;

    invoke-static {p0, v0}, Lcom/android/volley/toolbox/Volley;->newRequestQueue(Landroid/content/Context;Lcom/android/volley/toolbox/BaseHttpStack;)Lcom/android/volley/RequestQueue;

    move-result-object v0

    return-object v0
.end method

.method private static newRequestQueue(Landroid/content/Context;Lcom/android/volley/Network;)Lcom/android/volley/RequestQueue;
    .locals 4
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "network"    # Lcom/android/volley/Network;

    .line 93
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 96
    .local v0, "appContext":Landroid/content/Context;
    new-instance v1, Lcom/android/volley/toolbox/Volley$1;

    invoke-direct {v1, v0}, Lcom/android/volley/toolbox/Volley$1;-><init>(Landroid/content/Context;)V

    .line 108
    .local v1, "cacheSupplier":Lcom/android/volley/toolbox/DiskBasedCache$FileSupplier;
    new-instance v2, Lcom/android/volley/RequestQueue;

    new-instance v3, Lcom/android/volley/toolbox/DiskBasedCache;

    invoke-direct {v3, v1}, Lcom/android/volley/toolbox/DiskBasedCache;-><init>(Lcom/android/volley/toolbox/DiskBasedCache$FileSupplier;)V

    invoke-direct {v2, v3, p1}, Lcom/android/volley/RequestQueue;-><init>(Lcom/android/volley/Cache;Lcom/android/volley/Network;)V

    .line 109
    .local v2, "queue":Lcom/android/volley/RequestQueue;
    invoke-virtual {v2}, Lcom/android/volley/RequestQueue;->start()V

    .line 110
    return-object v2
.end method

.method public static newRequestQueue(Landroid/content/Context;Lcom/android/volley/toolbox/BaseHttpStack;)Lcom/android/volley/RequestQueue;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "stack"    # Lcom/android/volley/toolbox/BaseHttpStack;

    .line 44
    if-nez p1, :cond_0

    .line 45
    nop

    .line 46
    new-instance v0, Lcom/android/volley/toolbox/BasicNetwork;

    new-instance v1, Lcom/android/volley/toolbox/HurlStack;

    invoke-direct {v1}, Lcom/android/volley/toolbox/HurlStack;-><init>()V

    invoke-direct {v0, v1}, Lcom/android/volley/toolbox/BasicNetwork;-><init>(Lcom/android/volley/toolbox/BaseHttpStack;)V

    .local v0, "network":Lcom/android/volley/toolbox/BasicNetwork;
    goto :goto_0

    .line 66
    .end local v0    # "network":Lcom/android/volley/toolbox/BasicNetwork;
    :cond_0
    new-instance v0, Lcom/android/volley/toolbox/BasicNetwork;

    invoke-direct {v0, p1}, Lcom/android/volley/toolbox/BasicNetwork;-><init>(Lcom/android/volley/toolbox/BaseHttpStack;)V

    .line 69
    .restart local v0    # "network":Lcom/android/volley/toolbox/BasicNetwork;
    :goto_0
    invoke-static {p0, v0}, Lcom/android/volley/toolbox/Volley;->newRequestQueue(Landroid/content/Context;Lcom/android/volley/Network;)Lcom/android/volley/RequestQueue;

    move-result-object v1

    return-object v1
.end method

.method public static newRequestQueue(Landroid/content/Context;Lcom/android/volley/toolbox/HttpStack;)Lcom/android/volley/RequestQueue;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "stack"    # Lcom/android/volley/toolbox/HttpStack;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 85
    if-nez p1, :cond_0

    .line 86
    const/4 v0, 0x0

    move-object v1, v0

    check-cast v1, Lcom/android/volley/toolbox/BaseHttpStack;

    invoke-static {p0, v0}, Lcom/android/volley/toolbox/Volley;->newRequestQueue(Landroid/content/Context;Lcom/android/volley/toolbox/BaseHttpStack;)Lcom/android/volley/RequestQueue;

    move-result-object v0

    return-object v0

    .line 88
    :cond_0
    new-instance v0, Lcom/android/volley/toolbox/BasicNetwork;

    invoke-direct {v0, p1}, Lcom/android/volley/toolbox/BasicNetwork;-><init>(Lcom/android/volley/toolbox/HttpStack;)V

    invoke-static {p0, v0}, Lcom/android/volley/toolbox/Volley;->newRequestQueue(Landroid/content/Context;Lcom/android/volley/Network;)Lcom/android/volley/RequestQueue;

    move-result-object v0

    return-object v0
.end method

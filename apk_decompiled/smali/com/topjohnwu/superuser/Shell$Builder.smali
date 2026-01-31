.class public abstract Lcom/topjohnwu/superuser/Shell$Builder;
.super Ljava/lang/Object;
.source "Shell.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/topjohnwu/superuser/Shell;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# instance fields
.field protected flags:I

.field protected initClasses:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "+",
            "Lcom/topjohnwu/superuser/Shell$Initializer;",
            ">;"
        }
    .end annotation
.end field

.field protected timeout:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 374
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 376
    const/4 v0, 0x0

    iput v0, p0, Lcom/topjohnwu/superuser/Shell$Builder;->flags:I

    .line 377
    const-wide/16 v0, 0x14

    iput-wide v0, p0, Lcom/topjohnwu/superuser/Shell$Builder;->timeout:J

    .line 378
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/topjohnwu/superuser/Shell$Builder;->initClasses:[Ljava/lang/Class;

    return-void
.end method

.method public static create()Lcom/topjohnwu/superuser/Shell$Builder;
    .locals 1

    .line 386
    new-instance v0, Lcom/topjohnwu/superuser/internal/BuilderImpl;

    invoke-direct {v0}, Lcom/topjohnwu/superuser/internal/BuilderImpl;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract build()Lcom/topjohnwu/superuser/Shell;
.end method

.method public varargs abstract build([Ljava/lang/String;)Lcom/topjohnwu/superuser/Shell;
.end method

.method public final setFlags(I)Lcom/topjohnwu/superuser/Shell$Builder;
    .locals 0
    .param p1, "flags"    # I

    .line 413
    iput p1, p0, Lcom/topjohnwu/superuser/Shell$Builder;->flags:I

    .line 414
    return-object p0
.end method

.method public final varargs setInitializers([Ljava/lang/Class;)Lcom/topjohnwu/superuser/Shell$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "+",
            "Lcom/topjohnwu/superuser/Shell$Initializer;",
            ">;)",
            "Lcom/topjohnwu/superuser/Shell$Builder;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    .line 398
    .local p1, "classes":[Ljava/lang/Class;, "[Ljava/lang/Class<+Lcom/topjohnwu/superuser/Shell$Initializer;>;"
    iput-object p1, p0, Lcom/topjohnwu/superuser/Shell$Builder;->initClasses:[Ljava/lang/Class;

    .line 399
    return-object p0
.end method

.method public final setTimeout(J)Lcom/topjohnwu/superuser/Shell$Builder;
    .locals 0
    .param p1, "timeout"    # J

    .line 428
    iput-wide p1, p0, Lcom/topjohnwu/superuser/Shell$Builder;->timeout:J

    .line 429
    return-object p0
.end method

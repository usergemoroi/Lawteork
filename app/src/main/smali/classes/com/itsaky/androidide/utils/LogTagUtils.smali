.class public Lcom/itsaky/androidide/utils/LogTagUtils;
.super Ljava/lang/Object;
.source "LogTagUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static trimTagIfNeeded(Ljava/lang/String;I)Ljava/lang/String;
    .locals 5
    .param p0, "tag"    # Ljava/lang/String;
    .param p1, "maxLength"    # I

    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .local v0, "sb":Ljava/lang/StringBuilder;
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    .line 29
    .local v1, "length":I
    if-le v1, p1, :cond_0

    .line 30
    sub-int v2, v1, p1

    .line 31
    .local v2, "start":I
    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 34
    const/16 v4, 0x2e

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    .line 35
    const/4 v3, 0x1

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    .line 38
    .end local v2    # "start":I
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

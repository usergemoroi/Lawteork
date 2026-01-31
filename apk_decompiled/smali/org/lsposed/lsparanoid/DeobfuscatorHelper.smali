.class public Lorg/lsposed/lsparanoid/DeobfuscatorHelper;
.super Ljava/lang/Object;
.source "DeobfuscatorHelper.java"


# static fields
.field public static final MAX_CHUNK_LENGTH:I = 0x1fff


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    return-void
.end method

.method private static getCharAt(I[Ljava/lang/String;J)J
    .locals 6
    .param p0, "charIndex"    # I
    .param p1, "chunks"    # [Ljava/lang/String;
    .param p2, "state"    # J

    .line 60
    invoke-static {p2, p3}, Lorg/lsposed/lsparanoid/RandomHelper;->next(J)J

    move-result-wide v0

    .line 61
    .local v0, "nextState":J
    div-int/lit16 v2, p0, 0x1fff

    aget-object v2, p1, v2

    .line 62
    .local v2, "chunk":Ljava/lang/String;
    rem-int/lit16 v3, p0, 0x1fff

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    int-to-long v3, v3

    const/16 v5, 0x20

    shl-long/2addr v3, v5

    xor-long/2addr v3, v0

    return-wide v3
.end method

.method public static getString(J[Ljava/lang/String;)Ljava/lang/String;
    .locals 16
    .param p0, "id"    # J
    .param p2, "chunks"    # [Ljava/lang/String;

    .line 41
    move-object/from16 v0, p2

    const-wide v1, 0xffffffffL

    and-long v1, p0, v1

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/RandomHelper;->seed(J)J

    move-result-wide v1

    .line 42
    .local v1, "state":J
    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/RandomHelper;->next(J)J

    move-result-wide v1

    .line 43
    const/16 v3, 0x20

    ushr-long v4, v1, v3

    const-wide/32 v6, 0xffff

    and-long/2addr v4, v6

    .line 44
    .local v4, "low":J
    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/RandomHelper;->next(J)J

    move-result-wide v1

    .line 45
    const/16 v8, 0x10

    ushr-long v8, v1, v8

    const-wide/32 v10, -0x10000

    and-long/2addr v8, v10

    .line 46
    .local v8, "high":J
    ushr-long v10, p0, v3

    xor-long/2addr v10, v4

    xor-long/2addr v10, v8

    long-to-int v10, v10

    .line 47
    .local v10, "index":I
    invoke-static {v10, v0, v1, v2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getCharAt(I[Ljava/lang/String;J)J

    move-result-wide v1

    .line 48
    ushr-long v11, v1, v3

    and-long/2addr v11, v6

    long-to-int v11, v11

    .line 49
    .local v11, "length":I
    new-array v12, v11, [C

    .line 51
    .local v12, "chars":[C
    const/4 v13, 0x0

    .local v13, "i":I
    :goto_0
    if-ge v13, v11, :cond_0

    .line 52
    add-int v14, v10, v13

    add-int/lit8 v14, v14, 0x1

    invoke-static {v14, v0, v1, v2}, Lorg/lsposed/lsparanoid/DeobfuscatorHelper;->getCharAt(I[Ljava/lang/String;J)J

    move-result-wide v1

    .line 53
    ushr-long v14, v1, v3

    and-long/2addr v14, v6

    long-to-int v14, v14

    int-to-char v14, v14

    aput-char v14, v12, v13

    .line 51
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    .line 56
    .end local v13    # "i":I
    :cond_0
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v12}, Ljava/lang/String;-><init>([C)V

    return-object v3
.end method

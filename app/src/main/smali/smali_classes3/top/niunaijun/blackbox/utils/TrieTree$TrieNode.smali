.class Ltop/niunaijun/blackbox/utils/TrieTree$TrieNode;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/niunaijun/blackbox/utils/TrieTree;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TrieNode"
.end annotation


# instance fields
.field children:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ltop/niunaijun/blackbox/utils/TrieTree$TrieNode;",
            ">;"
        }
    .end annotation
.end field

.field content:C

.field isEnd:Z

.field word:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ltop/niunaijun/blackbox/utils/TrieTree$TrieNode;->isEnd:Z

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/utils/TrieTree$TrieNode;->children:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(CLjava/lang/String;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ltop/niunaijun/blackbox/utils/TrieTree$TrieNode;->isEnd:Z

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Ltop/niunaijun/blackbox/utils/TrieTree$TrieNode;->children:Ljava/util/List;

    iput-char p1, p0, Ltop/niunaijun/blackbox/utils/TrieTree$TrieNode;->content:C

    iput-object p2, p0, Ltop/niunaijun/blackbox/utils/TrieTree$TrieNode;->word:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Ltop/niunaijun/blackbox/utils/TrieTree$TrieNode;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ltop/niunaijun/blackbox/utils/TrieTree$TrieNode;

    iget-char p1, p1, Ltop/niunaijun/blackbox/utils/TrieTree$TrieNode;->content:C

    iget-char v0, p0, Ltop/niunaijun/blackbox/utils/TrieTree$TrieNode;->content:C

    if-ne p1, v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public nextNode(C)Ltop/niunaijun/blackbox/utils/TrieTree$TrieNode;
    .locals 3

    iget-object v0, p0, Ltop/niunaijun/blackbox/utils/TrieTree$TrieNode;->children:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltop/niunaijun/blackbox/utils/TrieTree$TrieNode;

    iget-char v2, v1, Ltop/niunaijun/blackbox/utils/TrieTree$TrieNode;->content:C

    if-ne v2, p1, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

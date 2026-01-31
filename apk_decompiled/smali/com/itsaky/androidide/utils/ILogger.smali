.class public abstract Lcom/itsaky/androidide/utils/ILogger;
.super Ljava/lang/Object;
.source "ILogger.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/itsaky/androidide/utils/ILogger$LogListener;,
        Lcom/itsaky/androidide/utils/ILogger$Level;
    }
.end annotation


# static fields
.field public static final DEFAULT_TAG:Ljava/lang/String; = "AndroidIDE"

.field public static final MSG_SEPARATOR:Ljava/lang/String; = " "

.field private static final cachedLoggers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/itsaky/androidide/utils/ILogger;",
            ">;"
        }
    .end annotation
.end field

.field private static final logListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/itsaky/androidide/utils/ILogger$LogListener;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field protected final TAG:Ljava/lang/String;

.field protected isEnabled:Z


# direct methods
.method public static synthetic $r8$lambda$Jml_i1NQkWN2oKo8OUMzkQmVnrc(Ljava/lang/String;)Lcom/itsaky/androidide/utils/ILogger;
    .locals 0

    invoke-static {p0}, Lcom/itsaky/androidide/utils/ILogger;->newPlatformDependentLogger(Ljava/lang/String;)Lcom/itsaky/androidide/utils/ILogger;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$q_M1w2lIdqTHIkG_NHdGJGK4pTg(Ljava/lang/String;)Lcom/itsaky/androidide/utils/ILogger;
    .locals 0

    invoke-static {p0}, Lcom/itsaky/androidide/utils/ILogger;->createInstance(Ljava/lang/String;)Lcom/itsaky/androidide/utils/ILogger;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    .line 58
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/itsaky/androidide/utils/ILogger;->logListeners:Ljava/util/List;

    .line 59
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lcom/itsaky/androidide/utils/ILogger;->cachedLoggers:Ljava/util/Map;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "tag"    # Ljava/lang/String;

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/itsaky/androidide/utils/ILogger;->isEnabled:Z

    .line 66
    invoke-static {p1}, Lcom/itsaky/androidide/utils/LogUtils;->preProcessLogTag(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/itsaky/androidide/utils/ILogger;->TAG:Ljava/lang/String;

    .line 67
    return-void
.end method

.method public static addLogListener(Lcom/itsaky/androidide/utils/ILogger$LogListener;)V
    .locals 2
    .param p0, "listener"    # Lcom/itsaky/androidide/utils/ILogger$LogListener;

    .line 82
    sget-object v0, Lcom/itsaky/androidide/utils/ILogger;->logListeners:Ljava/util/List;

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/itsaky/androidide/utils/ILogger$LogListener;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    return-void
.end method

.method private static createInstance(Ljava/lang/String;)Lcom/itsaky/androidide/utils/ILogger;
    .locals 2
    .param p0, "tag"    # Ljava/lang/String;

    .line 74
    sget-object v0, Lcom/itsaky/androidide/utils/ILogger;->cachedLoggers:Ljava/util/Map;

    new-instance v1, Lcom/itsaky/androidide/utils/ILogger$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/itsaky/androidide/utils/ILogger$$ExternalSyntheticLambda0;-><init>()V

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/itsaky/androidide/utils/ILogger;

    return-object v0
.end method

.method public static instance()Lcom/itsaky/androidide/utils/ILogger;
    .locals 3

    .line 70
    sget-object v0, Lcom/itsaky/androidide/utils/ILogger;->cachedLoggers:Ljava/util/Map;

    new-instance v1, Lcom/itsaky/androidide/utils/ILogger$$ExternalSyntheticLambda1;

    invoke-direct {v1}, Lcom/itsaky/androidide/utils/ILogger$$ExternalSyntheticLambda1;-><init>()V

    const-string v2, "AndroidIDE"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/itsaky/androidide/utils/ILogger;

    return-object v0
.end method

.method private logAndNotify(Lcom/itsaky/androidide/utils/ILogger$Level;Ljava/lang/String;)V
    .locals 3
    .param p1, "level"    # Lcom/itsaky/androidide/utils/ILogger$Level;
    .param p2, "msg"    # Ljava/lang/String;

    .line 116
    invoke-virtual {p0}, Lcom/itsaky/androidide/utils/ILogger;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 118
    return-void

    .line 121
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/itsaky/androidide/utils/ILogger;->doLog(Lcom/itsaky/androidide/utils/ILogger$Level;Ljava/lang/String;)V

    .line 122
    sget-object v0, Lcom/itsaky/androidide/utils/ILogger;->logListeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/itsaky/androidide/utils/ILogger$LogListener;

    .line 123
    .local v1, "listener":Lcom/itsaky/androidide/utils/ILogger$LogListener;
    iget-object v2, p0, Lcom/itsaky/androidide/utils/ILogger;->TAG:Ljava/lang/String;

    invoke-interface {v1, p1, v2, p2}, Lcom/itsaky/androidide/utils/ILogger$LogListener;->log(Lcom/itsaky/androidide/utils/ILogger$Level;Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .end local v1    # "listener":Lcom/itsaky/androidide/utils/ILogger$LogListener;
    goto :goto_0

    .line 125
    :cond_1
    return-void
.end method

.method public static newInstance(Ljava/lang/String;)Lcom/itsaky/androidide/utils/ILogger;
    .locals 1
    .param p0, "tag"    # Ljava/lang/String;

    .line 90
    invoke-static {p0}, Lcom/itsaky/androidide/utils/ILogger;->createInstance(Ljava/lang/String;)Lcom/itsaky/androidide/utils/ILogger;

    move-result-object v0

    return-object v0
.end method

.method private static newPlatformDependentLogger(Ljava/lang/String;)Lcom/itsaky/androidide/utils/ILogger;
    .locals 1
    .param p0, "tag"    # Ljava/lang/String;

    .line 78
    invoke-static {}, Lcom/itsaky/androidide/utils/LogUtils;->isJvm()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/itsaky/androidide/utils/JvmLogger;

    invoke-direct {v0, p0}, Lcom/itsaky/androidide/utils/JvmLogger;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/itsaky/androidide/utils/AndroidLogger;

    invoke-direct {v0, p0}, Lcom/itsaky/androidide/utils/AndroidLogger;-><init>(Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method

.method public static removeLogListener(Lcom/itsaky/androidide/utils/ILogger$LogListener;)V
    .locals 2
    .param p0, "listener"    # Lcom/itsaky/androidide/utils/ILogger$LogListener;

    .line 86
    sget-object v0, Lcom/itsaky/androidide/utils/ILogger;->logListeners:Ljava/util/List;

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 87
    return-void
.end method


# virtual methods
.method public varargs debug([Ljava/lang/Object;)Lcom/itsaky/androidide/utils/ILogger;
    .locals 1
    .param p1, "messages"    # [Ljava/lang/Object;

    .line 199
    sget-object v0, Lcom/itsaky/androidide/utils/ILogger$Level;->DEBUG:Lcom/itsaky/androidide/utils/ILogger$Level;

    invoke-virtual {p0, v0, p1}, Lcom/itsaky/androidide/utils/ILogger;->log(Lcom/itsaky/androidide/utils/ILogger$Level;[Ljava/lang/Object;)Lcom/itsaky/androidide/utils/ILogger;

    move-result-object v0

    return-object v0
.end method

.method protected abstract doLog(Lcom/itsaky/androidide/utils/ILogger$Level;Ljava/lang/String;)V
.end method

.method public varargs error([Ljava/lang/Object;)Lcom/itsaky/androidide/utils/ILogger;
    .locals 1
    .param p1, "messages"    # [Ljava/lang/Object;

    .line 100
    sget-object v0, Lcom/itsaky/androidide/utils/ILogger$Level;->ERROR:Lcom/itsaky/androidide/utils/ILogger$Level;

    invoke-virtual {p0, v0, p1}, Lcom/itsaky/androidide/utils/ILogger;->log(Lcom/itsaky/androidide/utils/ILogger$Level;[Ljava/lang/Object;)Lcom/itsaky/androidide/utils/ILogger;

    move-result-object v0

    return-object v0
.end method

.method protected varargs generateMessage([Ljava/lang/Object;)Ljava/lang/String;
    .locals 7
    .param p1, "messages"    # [Ljava/lang/Object;

    .line 141
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .local v0, "sb":Ljava/lang/StringBuilder;
    if-nez p1, :cond_0

    .line 143
    const-string v1, "null"

    return-object v1

    .line 146
    :cond_0
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_4

    aget-object v3, p1, v2

    .line 147
    .local v3, "msg":Ljava/lang/Object;
    instance-of v4, v3, Ljava/lang/Throwable;

    const-string v5, "\n"

    const-string v6, " "

    if-eqz v4, :cond_1

    move-object v4, v5

    goto :goto_1

    :cond_1
    move-object v4, v6

    :goto_1
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    instance-of v4, v3, Ljava/lang/Throwable;

    if-eqz v4, :cond_2

    move-object v4, v3

    check-cast v4, Ljava/lang/Throwable;

    invoke-static {v4}, Lcom/itsaky/androidide/utils/LogUtils;->getFullStackTrace(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_2
    move-object v4, v3

    :goto_2
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 149
    instance-of v4, v3, Ljava/lang/Throwable;

    if-eqz v4, :cond_3

    goto :goto_3

    :cond_3
    move-object v5, v6

    :goto_3
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .end local v3    # "msg":Ljava/lang/Object;
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 152
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method protected getCallerClassDescription()Ljava/lang/String;
    .locals 8

    .line 221
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    .line 222
    .local v0, "elements":[Ljava/lang/StackTraceElement;
    const/4 v1, 0x1

    .local v1, "i":I
    array-length v2, v0

    .local v2, "elementsLength":I
    :goto_0
    if-ge v1, v2, :cond_2

    .line 223
    aget-object v3, v0, v1

    .line 224
    .local v3, "element":Ljava/lang/StackTraceElement;
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v4

    .line 225
    .local v4, "klass":Ljava/lang/String;
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v5

    .line 226
    .local v5, "method":Ljava/lang/String;
    const-class v6, Lcom/itsaky/androidide/utils/ILogger;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    const-string v6, "java.lang.Thread"

    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 227
    goto :goto_1

    .line 230
    :cond_0
    const-string v6, "%s [%s]"

    filled-new-array {v5, v4}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    return-object v6

    .line 222
    .end local v3    # "element":Ljava/lang/StackTraceElement;
    .end local v4    # "klass":Ljava/lang/String;
    .end local v5    # "method":Ljava/lang/String;
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 233
    .end local v1    # "i":I
    .end local v2    # "elementsLength":I
    :cond_2
    const-string v1, "<Logger> <Cannot get caller information>"

    return-object v1
.end method

.method public varargs info([Ljava/lang/Object;)Lcom/itsaky/androidide/utils/ILogger;
    .locals 1
    .param p1, "messages"    # [Ljava/lang/Object;

    .line 182
    sget-object v0, Lcom/itsaky/androidide/utils/ILogger$Level;->INFO:Lcom/itsaky/androidide/utils/ILogger$Level;

    invoke-virtual {p0, v0, p1}, Lcom/itsaky/androidide/utils/ILogger;->log(Lcom/itsaky/androidide/utils/ILogger$Level;[Ljava/lang/Object;)Lcom/itsaky/androidide/utils/ILogger;

    move-result-object v0

    return-object v0
.end method

.method public isEnabled()Z
    .locals 1

    .line 217
    iget-boolean v0, p0, Lcom/itsaky/androidide/utils/ILogger;->isEnabled:Z

    return v0
.end method

.method public varargs log(Lcom/itsaky/androidide/utils/ILogger$Level;[Ljava/lang/Object;)Lcom/itsaky/androidide/utils/ILogger;
    .locals 1
    .param p1, "level"    # Lcom/itsaky/androidide/utils/ILogger$Level;
    .param p2, "messages"    # [Ljava/lang/Object;

    .line 111
    invoke-virtual {p0, p2}, Lcom/itsaky/androidide/utils/ILogger;->generateMessage([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/itsaky/androidide/utils/ILogger;->logAndNotify(Lcom/itsaky/androidide/utils/ILogger$Level;Ljava/lang/String;)V

    .line 112
    return-object p0
.end method

.method public logThis()V
    .locals 1

    .line 189
    invoke-virtual {p0}, Lcom/itsaky/androidide/utils/ILogger;->getCallerClassDescription()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/itsaky/androidide/utils/ILogger;->debug([Ljava/lang/Object;)Lcom/itsaky/androidide/utils/ILogger;

    .line 190
    return-void
.end method

.method public setEnabled(Z)V
    .locals 0
    .param p1, "enabled"    # Z

    .line 209
    iput-boolean p1, p0, Lcom/itsaky/androidide/utils/ILogger;->isEnabled:Z

    .line 210
    return-void
.end method

.method public varargs verbose([Ljava/lang/Object;)Lcom/itsaky/androidide/utils/ILogger;
    .locals 1
    .param p1, "messages"    # [Ljava/lang/Object;

    .line 172
    sget-object v0, Lcom/itsaky/androidide/utils/ILogger$Level;->VERBOSE:Lcom/itsaky/androidide/utils/ILogger$Level;

    invoke-virtual {p0, v0, p1}, Lcom/itsaky/androidide/utils/ILogger;->log(Lcom/itsaky/androidide/utils/ILogger$Level;[Ljava/lang/Object;)Lcom/itsaky/androidide/utils/ILogger;

    move-result-object v0

    return-object v0
.end method

.method public varargs warn([Ljava/lang/Object;)Lcom/itsaky/androidide/utils/ILogger;
    .locals 1
    .param p1, "messages"    # [Ljava/lang/Object;

    .line 162
    sget-object v0, Lcom/itsaky/androidide/utils/ILogger$Level;->WARNING:Lcom/itsaky/androidide/utils/ILogger$Level;

    invoke-virtual {p0, v0, p1}, Lcom/itsaky/androidide/utils/ILogger;->log(Lcom/itsaky/androidide/utils/ILogger$Level;[Ljava/lang/Object;)Lcom/itsaky/androidide/utils/ILogger;

    move-result-object v0

    return-object v0
.end method

.class public Lkentos/loader/floating/HideRecorder;
.super Ljava/lang/Object;
.source "HideRecorder.java"


# static fields
.field private static final KEY_VERSION_BLACKSHARK:Ljava/lang/String;

.field private static final KEY_VERSION_EMUI:Ljava/lang/String;

.field private static final KEY_VERSION_HONOR:Ljava/lang/String;

.field private static final KEY_VERSION_HYPEROS:Ljava/lang/String;

.field private static final KEY_VERSION_MIUI:Ljava/lang/String;

.field private static final KEY_VERSION_NUBIA:Ljava/lang/String;

.field private static final KEY_VERSION_ONEPLUS:Ljava/lang/String;

.field private static final KEY_VERSION_OPPO:Ljava/lang/String;

.field private static final KEY_VERSION_REALME:Ljava/lang/String;

.field private static final KEY_VERSION_ROG:Ljava/lang/String;

.field private static final KEY_VERSION_SAMSUNG:Ljava/lang/String;

.field private static final KEY_VERSION_SMARTISAN:Ljava/lang/String;

.field private static final KEY_VERSION_VIVO:Ljava/lang/String;

.field public static final ROM_BLACKSHARK:Ljava/lang/String;

.field public static final ROM_EMUI:Ljava/lang/String;

.field public static final ROM_FLYME:Ljava/lang/String;

.field public static final ROM_GOOGLE:Ljava/lang/String;

.field public static final ROM_HONOR:Ljava/lang/String;

.field public static final ROM_HYPEROS:Ljava/lang/String;

.field public static final ROM_INFINIX:Ljava/lang/String;

.field public static final ROM_LENOVO:Ljava/lang/String;

.field public static final ROM_MIUI:Ljava/lang/String;

.field public static final ROM_NUBIAUI:Ljava/lang/String;

.field public static final ROM_ONEPLUS:Ljava/lang/String;

.field public static final ROM_OPPO:Ljava/lang/String;

.field public static final ROM_QIKU:Ljava/lang/String;

.field public static final ROM_REALME:Ljava/lang/String;

.field public static final ROM_ROG:Ljava/lang/String;

.field public static final ROM_SAMSUNG:Ljava/lang/String;

.field public static final ROM_SMARTISAN:Ljava/lang/String;

.field public static final ROM_UNKNOWN:Ljava/lang/String;

.field public static final ROM_VIVO:Ljava/lang/String;

.field private static sName:Ljava/lang/String;


# direct methods
.method private static constructor <clinit>()V
    .locals 2

    const-wide v0, -0x2fbff8ea20ad5f49L    # -3.711756525685157E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->ROM_MIUI:Ljava/lang/String;

    const-wide v0, -0x2fbff8e520ad5f49L    # -3.711774194155805E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->ROM_HYPEROS:Ljava/lang/String;

    const-wide v0, -0x2fbff89d20ad5f49L    # -3.712028620133133E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->ROM_EMUI:Ljava/lang/String;

    const-wide v0, -0x2fbff89820ad5f49L    # -3.712046288603781E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->ROM_HONOR:Ljava/lang/String;

    const-wide v0, -0x2fbff89220ad5f49L    # -3.712067490768558E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->ROM_FLYME:Ljava/lang/String;

    const-wide v0, -0x2fbff88c20ad5f49L    # -3.7120886929333354E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->ROM_OPPO:Ljava/lang/String;

    const-wide v0, -0x2fbff88720ad5f49L    # -3.712106361403983E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->ROM_REALME:Ljava/lang/String;

    const-wide v0, -0x2fbff88020ad5f49L    # -3.71213109726289E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->ROM_SMARTISAN:Ljava/lang/String;

    const-wide v0, -0x2fbff8b620ad5f49L    # -3.711940277779894E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->ROM_VIVO:Ljava/lang/String;

    const-wide v0, -0x2fbff8b120ad5f49L    # -3.711957946250542E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->ROM_QIKU:Ljava/lang/String;

    const-wide v0, -0x2fbff8ac20ad5f49L    # -3.71197561472119E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->ROM_NUBIAUI:Ljava/lang/String;

    const-wide v0, -0x2fbff8a420ad5f49L    # -3.712003884274226E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->ROM_ONEPLUS:Ljava/lang/String;

    const-wide v0, -0x2fbff85c20ad5f49L    # -3.712258310251554E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->ROM_SAMSUNG:Ljava/lang/String;

    const-wide v0, -0x2fbff85620ad5f49L    # -3.7122795124163315E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->ROM_BLACKSHARK:Ljava/lang/String;

    const-wide v0, -0x2fbff85020ad5f49L    # -3.712300714581109E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->ROM_ROG:Ljava/lang/String;

    const-wide v0, -0x2fbff84c20ad5f49L    # -3.712314849357627E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->ROM_LENOVO:Ljava/lang/String;

    const-wide v0, -0x2fbff84520ad5f49L    # -3.712339585216534E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->ROM_INFINIX:Ljava/lang/String;

    const-wide v0, -0x2fbff87d20ad5f49L    # -3.712141698345279E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->ROM_GOOGLE:Ljava/lang/String;

    const-wide v0, -0x2fbff87620ad5f49L    # -3.712166434204186E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->ROM_UNKNOWN:Ljava/lang/String;

    const-wide v0, -0x2fbff86e20ad5f49L    # -3.712194703757222E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->KEY_VERSION_MIUI:Ljava/lang/String;

    const-wide v0, -0x2fbff81620ad5f49L    # -3.712505668840623E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->KEY_VERSION_HYPEROS:Ljava/lang/String;

    const-wide v0, -0x2fbff80020ad5f49L    # -3.712583410111473E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->KEY_VERSION_EMUI:Ljava/lang/String;

    const-wide v0, -0x2fbff82a20ad5f49L    # -3.712434994958032E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->KEY_VERSION_HONOR:Ljava/lang/String;

    const-wide v0, -0x2fbffbd020ad5f49L    # -3.709134524641026E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->KEY_VERSION_OPPO:Ljava/lang/String;

    const-wide v0, -0x2fbffbf720ad5f49L    # -3.708996710569973E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->KEY_VERSION_REALME:Ljava/lang/String;

    const-wide v0, -0x2fbffb9d20ad5f49L    # -3.709314743041633E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->KEY_VERSION_SMARTISAN:Ljava/lang/String;

    const-wide v0, -0x2fbffb8820ad5f49L    # -3.709388950618354E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->KEY_VERSION_VIVO:Ljava/lang/String;

    const-wide v0, -0x2fbffbb520ad5f49L    # -3.709229934382524E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->KEY_VERSION_NUBIA:Ljava/lang/String;

    const-wide v0, -0x2fbffb5d20ad5f49L    # -3.709540899465925E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->KEY_VERSION_ONEPLUS:Ljava/lang/String;

    const-wide v0, -0x2fbffb4420ad5f49L    # -3.709629241819164E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->KEY_VERSION_SAMSUNG:Ljava/lang/String;

    const-wide v0, -0x2fbffb6c20ad5f49L    # -3.709487894053982E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->KEY_VERSION_BLACKSHARK:Ljava/lang/String;

    const-wide v0, -0x2fbffb1a20ad5f49L    # -3.709777656972605E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->KEY_VERSION_ROG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static check(Ljava/lang/String;)Z
    .locals 4
    .param p0, "rom"    # Ljava/lang/String;

    .line 240
    sget-object v0, Lkentos/loader/floating/HideRecorder;->sName:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 241
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 245
    :cond_0
    const-wide v0, -0x2fbffed520ad5f49L    # -3.706402979078879E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->getProp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 246
    const-wide v0, -0x2fbffefb20ad5f49L    # -3.7062686987019554E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->sName:Ljava/lang/String;

    goto/16 :goto_5

    .line 247
    :cond_1
    const-wide v0, -0x2fbffef420ad5f49L    # -3.706293434560862E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->getProp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_17

    const-wide v0, -0x2fbffe9e20ad5f49L    # -3.706597332256004E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->getProp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const-wide v0, -0x2fbffe8820ad5f49L    # -3.7066750735268545E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->getProp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x2fbffeb220ad5f49L    # -3.706526658373413E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto/16 :goto_4

    .line 249
    :cond_2
    const-wide v0, -0x2fbffea520ad5f49L    # -3.706572596397097E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->getProp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 250
    const-wide v0, -0x2fbffe5320ad5f49L    # -3.706862359315721E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->sName:Ljava/lang/String;

    goto/16 :goto_5

    .line 251
    :cond_3
    const-wide v0, -0x2fbffe4d20ad5f49L    # -3.706883561480498E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->getProp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 252
    const-wide v0, -0x2fbffe7520ad5f49L    # -3.706742213715316E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->sName:Ljava/lang/String;

    goto/16 :goto_5

    .line 253
    :cond_4
    const-wide v0, -0x2fbffe7020ad5f49L    # -3.706759882185964E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->getProp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 254
    const-wide v0, -0x2fbffe1a20ad5f49L    # -3.707063779881106E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->sName:Ljava/lang/String;

    goto/16 :goto_5

    .line 255
    :cond_5
    const-wide v0, -0x2fbffe1220ad5f49L    # -3.707092049434142E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->getProp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 256
    const-wide v0, -0x2fbffe3820ad5f49L    # -3.706957769057219E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->sName:Ljava/lang/String;

    goto/16 :goto_5

    .line 257
    :cond_6
    const-wide v0, -0x2fbffe3220ad5f49L    # -3.706978971221996E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->getProp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 258
    const-wide v0, -0x2fbff9dc20ad5f49L    # -3.710901371705804E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->sName:Ljava/lang/String;

    goto/16 :goto_5

    .line 259
    :cond_7
    const-wide v0, -0x2fbff9d720ad5f49L    # -3.710919040176452E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->getProp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 260
    const-wide v0, -0x2fbff9fe20ad5f49L    # -3.7107812261053994E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->sName:Ljava/lang/String;

    goto/16 :goto_5

    .line 261
    :cond_8
    const-wide v0, -0x2fbff9f920ad5f49L    # -3.710798894576047E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->getProp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 262
    const-wide v0, -0x2fbff9e620ad5f49L    # -3.710866034764509E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->sName:Ljava/lang/String;

    goto/16 :goto_5

    .line 263
    :cond_9
    const-wide v0, -0x2fbff9e120ad5f49L    # -3.7108837032351566E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->getProp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 264
    const-wide v0, -0x2fbff98c20ad5f49L    # -3.711184067236169E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->sName:Ljava/lang/String;

    goto/16 :goto_5

    .line 265
    :cond_a
    const-wide v0, -0x2fbff98220ad5f49L    # -3.7112194041774645E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->getProp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 266
    const-wide v0, -0x2fbff9aa20ad5f49L    # -3.711078056412282E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->sName:Ljava/lang/String;

    goto/16 :goto_5

    .line 267
    :cond_b
    const-wide v0, -0x2fbff9a220ad5f49L    # -3.711106325965319E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->getProp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_16

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-wide v1, -0x2fbff94920ad5f49L    # -3.711420824742849E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto/16 :goto_3

    .line 269
    :cond_c
    const-wide v0, -0x2fbff97920ad5f49L    # -3.7112512074246305E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->getProp(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_d

    .line 270
    const-wide v0, -0x2fbff96120ad5f49L    # -3.71133601608374E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->sName:Ljava/lang/String;

    goto/16 :goto_5

    .line 273
    :cond_d
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 274
    .local v0, "manufacturer":Ljava/lang/String;
    sget-object v1, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    .line 276
    .local v1, "display":Ljava/lang/String;
    const-wide v2, -0x2fbff91b20ad5f49L    # -3.711583374672809E78

    invoke-static {v2, v3}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_15

    const-wide v2, -0x2fbff91520ad5f49L    # -3.711604576837586E78

    invoke-static {v2, v3}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_e

    goto/16 :goto_2

    .line 278
    :cond_e
    const-wide v2, -0x2fbff90920ad5f49L    # -3.711646981167141E78

    invoke-static {v2, v3}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_14

    const-wide v2, -0x2fbff90220ad5f49L    # -3.711671717026048E78

    invoke-static {v2, v3}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_f

    goto/16 :goto_1

    .line 280
    :cond_f
    const-wide v2, -0x2fbff93220ad5f49L    # -3.711502099707829E78

    invoke-static {v2, v3}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_13

    const-wide v2, -0x2fbff92a20ad5f49L    # -3.7115303692608655E78

    invoke-static {v2, v3}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_13

    const-wide v2, -0x2fbff92420ad5f49L    # -3.711551571425643E78

    invoke-static {v2, v3}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_0

    .line 282
    :cond_10
    const-wide v2, -0x2fbff8d720ad5f49L    # -3.711823665873619E78

    invoke-static {v2, v3}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_11

    .line 283
    const-wide v2, -0x2fbff8d020ad5f49L    # -3.7118484017325256E78

    invoke-static {v2, v3}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lkentos/loader/floating/HideRecorder;->sName:Ljava/lang/String;

    goto :goto_5

    .line 284
    :cond_11
    const-wide v2, -0x2fbff8c920ad5f49L    # -3.7118731375914325E78

    invoke-static {v2, v3}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_12

    .line 285
    const-wide v2, -0x2fbff8c120ad5f49L    # -3.711901407144469E78

    invoke-static {v2, v3}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lkentos/loader/floating/HideRecorder;->sName:Ljava/lang/String;

    goto :goto_5

    .line 287
    :cond_12
    const-wide v2, -0x2fbff8fb20ad5f49L    # -3.711696452884955E78

    invoke-static {v2, v3}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lkentos/loader/floating/HideRecorder;->sName:Ljava/lang/String;

    goto :goto_5

    .line 281
    :cond_13
    :goto_0
    const-wide v2, -0x2fbff8df20ad5f49L    # -3.711795396320582E78

    invoke-static {v2, v3}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lkentos/loader/floating/HideRecorder;->sName:Ljava/lang/String;

    goto :goto_5

    .line 279
    :cond_14
    :goto_1
    const-wide v2, -0x2fbff93920ad5f49L    # -3.711477363848922E78

    invoke-static {v2, v3}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lkentos/loader/floating/HideRecorder;->sName:Ljava/lang/String;

    goto :goto_5

    .line 277
    :cond_15
    :goto_2
    const-wide v2, -0x2fbff90f20ad5f49L    # -3.7116257790023635E78

    invoke-static {v2, v3}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lkentos/loader/floating/HideRecorder;->sName:Ljava/lang/String;

    goto :goto_5

    .line 268
    .end local v0    # "manufacturer":Ljava/lang/String;
    .end local v1    # "display":Ljava/lang/String;
    :cond_16
    :goto_3
    const-wide v0, -0x2fbff94120ad5f49L    # -3.711449094295886E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->sName:Ljava/lang/String;

    goto :goto_5

    .line 248
    :cond_17
    :goto_4
    const-wide v0, -0x2fbffea920ad5f49L    # -3.706558461620579E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkentos/loader/floating/HideRecorder;->sName:Ljava/lang/String;

    .line 290
    :goto_5
    sget-object v0, Lkentos/loader/floating/HideRecorder;->sName:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private static getFakeRecordWindowTitle()Ljava/lang/String;
    .locals 3

    .line 201
    sget-object v0, Lkentos/loader/floating/HideRecorder;->sName:Ljava/lang/String;

    if-nez v0, :cond_0

    const-wide v0, -0x2fbffce120ad5f49L    # -3.708169826143657E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->check(Ljava/lang/String;)Z

    .line 203
    :cond_0
    sget-object v0, Lkentos/loader/floating/HideRecorder;->sName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    :cond_1
    goto/16 :goto_0

    :sswitch_0
    const-wide v1, -0x2fbffc4820ad5f49L    # -3.708710481345479E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0xe

    goto/16 :goto_1

    :sswitch_1
    const-wide v1, -0x2fbffc9b20ad5f49L    # -3.708417184732726E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto/16 :goto_1

    :sswitch_2
    const-wide v1, -0x2fbffca120ad5f49L    # -3.708395982567949E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0xa

    goto/16 :goto_1

    :sswitch_3
    const-wide v1, -0x2fbffc8e20ad5f49L    # -3.70846312275641E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x3

    goto/16 :goto_1

    :sswitch_4
    const-wide v1, -0x2fbffcaf20ad5f49L    # -3.708346510850135E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x8

    goto/16 :goto_1

    :sswitch_5
    const-wide v1, -0x2fbffcbc20ad5f49L    # -3.7083005728264506E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x6

    goto/16 :goto_1

    :sswitch_6
    const-wide v1, -0x2fbffc8820ad5f49L    # -3.7084843249211875E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto/16 :goto_1

    :sswitch_7
    const-wide v1, -0x2fbffce020ad5f49L    # -3.7081733598377865E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    goto/16 :goto_1

    :sswitch_8
    const-wide v1, -0x2fbffc9320ad5f49L    # -3.708445454285762E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    goto/16 :goto_1

    :sswitch_9
    const-wide v1, -0x2fbffc5b20ad5f49L    # -3.7086433411570176E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0xb

    goto :goto_1

    :sswitch_a
    const-wide v1, -0x2fbffcb720ad5f49L    # -3.708318241297098E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x7

    goto :goto_1

    :sswitch_b
    const-wide v1, -0x2fbffca920ad5f49L    # -3.708367713014912E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x9

    goto :goto_1

    :sswitch_c
    const-wide v1, -0x2fbffc5020ad5f49L    # -3.708682211792443E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0xd

    goto :goto_1

    :sswitch_d
    const-wide v1, -0x2fbffc8320ad5f49L    # -3.708501993391835E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x5

    goto :goto_1

    :sswitch_e
    const-wide v1, -0x2fbffc5720ad5f49L    # -3.708657475933536E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0xc

    goto :goto_1

    :goto_0
    const/4 v0, -0x1

    :goto_1
    packed-switch v0, :pswitch_data_0

    .line 234
    const-wide v0, -0x2fbffed620ad5f49L    # -3.706399445384749E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 232
    :pswitch_0
    const-wide v0, -0x2fbfff3820ad5f49L    # -3.7060531433600525E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 230
    :pswitch_1
    const-wide v0, -0x2fbfff1520ad5f49L    # -3.706176822654587E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 228
    :pswitch_2
    const-wide v0, -0x2fbfff6f20ad5f49L    # -3.705858790182927E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 226
    :pswitch_3
    const-wide v0, -0x2fbfffa120ad5f49L    # -3.705682105476449E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 224
    :pswitch_4
    const-wide v0, -0x2fbfffbf20ad5f49L    # -3.705576094652562E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 222
    :pswitch_5
    const-wide v0, -0x2fbfff9720ad5f49L    # -3.7057174424177446E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 220
    :pswitch_6
    const-wide v0, -0x2fbfffe920ad5f49L    # -3.705427679499121E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 218
    :pswitch_7
    const-wide v0, -0x2fbffff920ad5f49L    # -3.705371140393048E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 216
    :pswitch_8
    const-wide v0, -0x2fbfffcc20ad5f49L    # -3.705530156628878E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 214
    :pswitch_9
    const-wide v0, -0x2fbffc3120ad5f49L    # -3.708791756310459E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 211
    :pswitch_a
    const-wide v0, -0x2fbffc1620ad5f49L    # -3.708887166051957E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 209
    :pswitch_b
    const-wide v0, -0x2fbffc6920ad5f49L    # -3.708593869439204E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 206
    :pswitch_c
    const-wide v0, -0x2fbffc4120ad5f49L    # -3.708735217204386E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x7a5eb2cd -> :sswitch_e
        -0x7027944a -> :sswitch_d
        -0x61424fab -> :sswitch_c
        -0x4d09c879 -> :sswitch_b
        -0x23e7db20 -> :sswitch_a
        0x13daa -> :sswitch_9
        0x20893c -> :sswitch_8
        0x241d30 -> :sswitch_7
        0x251fa0 -> :sswitch_6
        0x2834ac -> :sswitch_5
        0x3fe512b -> :sswitch_4
        0x41bb44a -> :sswitch_3
        0x4380d48 -> :sswitch_2
        0x7d27ed30 -> :sswitch_1
        0x7da65239 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static getProp(Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p0, "name"    # Ljava/lang/String;

    .line 294
    const/4 v0, 0x0

    .line 295
    .local v0, "line":Ljava/lang/String;
    const/4 v1, 0x0

    .line 297
    .local v1, "input":Ljava/io/BufferedReader;
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, -0x2fbff8f320ad5f49L    # -3.711724722437991E78

    invoke-static {v4, v5}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v2

    .line 298
    .local v2, "p":Ljava/lang/Process;
    new-instance v3, Ljava/io/BufferedReader;

    new-instance v4, Ljava/io/InputStreamReader;

    invoke-virtual {v2}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    const/16 v5, 0x400

    invoke-direct {v3, v4, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    move-object v1, v3

    .line 299
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    move-object v0, v3

    .line 300
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 304
    .end local v2    # "p":Ljava/lang/Process;
    nop

    .line 306
    :try_start_1
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 309
    :goto_0
    goto :goto_1

    .line 307
    :catch_0
    move-exception v2

    .line 308
    .local v2, "e":Ljava/io/IOException;
    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    .end local v2    # "e":Ljava/io/IOException;
    goto :goto_0

    .line 312
    :goto_1
    return-object v0

    .line 304
    :catchall_0
    move-exception v2

    if-eqz v1, :cond_0

    .line 306
    :try_start_2
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 309
    goto :goto_2

    .line 307
    :catch_1
    move-exception v3

    .line 308
    .local v3, "e":Ljava/io/IOException;
    invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V

    .line 311
    .end local v3    # "e":Ljava/io/IOException;
    :cond_0
    :goto_2
    throw v2

    .line 301
    :catch_2
    move-exception v2

    .line 302
    .local v2, "ex":Ljava/io/IOException;
    nop

    .line 304
    if-eqz v1, :cond_1

    .line 306
    :try_start_3
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 309
    goto :goto_3

    .line 307
    :catch_3
    move-exception v3

    .line 308
    .restart local v3    # "e":Ljava/io/IOException;
    invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V

    .line 302
    .end local v3    # "e":Ljava/io/IOException;
    :cond_1
    :goto_3
    const/4 v3, 0x0

    return-object v3
.end method

.method public static isActivice()Z
    .locals 1

    .line 73
    const/4 v0, 0x0

    return v0
.end method

.method public static isBlackShark()Z
    .locals 2

    .line 68
    const-wide v0, -0x2fbffd8320ad5f49L    # -3.707597367694669E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->check(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isEmui()Z
    .locals 2

    .line 63
    const-wide v0, -0x2fbffdea20ad5f49L    # -3.7072333971993244E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->check(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-wide v0, -0x2fbffde520ad5f49L    # -3.707251065669972E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->check(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static isFlyme()Z
    .locals 2

    .line 64
    const-wide v0, -0x2fbffd9f20ad5f49L    # -3.707498424259041E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->check(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isGoogle()Z
    .locals 2

    .line 70
    const-wide v0, -0x2fbffdb920ad5f49L    # -3.707406548211673E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->check(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isMiui()Z
    .locals 2

    .line 62
    const-wide v0, -0x2fbffdf720ad5f49L    # -3.70718745917564E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->check(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-wide v0, -0x2fbffdf220ad5f49L    # -3.707205127646288E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->check(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static isNubia()Z
    .locals 2

    .line 65
    const-wide v0, -0x2fbffd9920ad5f49L    # -3.7075196264238185E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->check(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isOnePlus()Z
    .locals 2

    .line 66
    const-wide v0, -0x2fbffd9120ad5f49L    # -3.707547895976855E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->check(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isOppo()Z
    .locals 2

    .line 60
    const-wide v0, -0x2fbffdc120ad5f49L    # -3.707378278658636E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->check(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isRealme()Z
    .locals 2

    .line 59
    const-wide v0, -0x2fbffdc820ad5f49L    # -3.707353542799729E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->check(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isRog()Z
    .locals 2

    .line 69
    const-wide v0, -0x2fbffdbd20ad5f49L    # -3.7073924134351545E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->check(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isSamsung()Z
    .locals 2

    .line 67
    const-wide v0, -0x2fbffd8920ad5f49L    # -3.7075761655298914E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->check(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isVivo()Z
    .locals 2

    .line 61
    const-wide v0, -0x2fbffdfc20ad5f49L    # -3.707169790704992E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->check(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static setFakeRecorderWindowLayoutParams(Landroid/view/WindowManager$LayoutParams;)V
    .locals 4
    .param p0, "layoutParams"    # Landroid/view/WindowManager$LayoutParams;

    .line 82
    :try_start_0
    sget-object v0, Lkentos/loader/floating/HideRecorder;->sName:Ljava/lang/String;

    if-nez v0, :cond_0

    const-wide v0, -0x2fbffdb220ad5f49L    # -3.70743128407058E78

    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkentos/loader/floating/HideRecorder;->check(Ljava/lang/String;)Z

    .line 85
    :cond_0
    invoke-static {}, Lkentos/loader/floating/HideRecorder;->getFakeRecordWindowTitle()Ljava/lang/String;

    move-result-object v0

    .line 86
    .local v0, "fakeTitle":Ljava/lang/String;
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 87
    invoke-virtual {p0, v0}, Landroid/view/WindowManager$LayoutParams;->setTitle(Ljava/lang/CharSequence;)V

    .line 91
    :cond_1
    const-wide v1, -0x2fbffdb120ad5f49L    # -3.707434817764709E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkentos/loader/floating/HideRecorder;->check(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 93
    invoke-static {p0}, Lkentos/loader/floating/HideRecorder;->setMeizuParams(Landroid/view/WindowManager$LayoutParams;)Z

    move-result v1

    if-nez v1, :cond_9

    .line 94
    invoke-static {}, Lkentos/loader/floating/HideRecorder;->isActivice()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {p0}, Lkentos/loader/floating/HideRecorder;->setMeizuParams_new(Landroid/view/WindowManager$LayoutParams;)V

    goto/16 :goto_2

    .line 96
    :cond_2
    const-wide v1, -0x2fbffdab20ad5f49L    # -3.7074560199294865E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkentos/loader/floating/HideRecorder;->check(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_8

    const-wide v1, -0x2fbffda620ad5f49L    # -3.707473688400134E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkentos/loader/floating/HideRecorder;->check(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_8

    const-wide v1, -0x2fbffd5e20ad5f49L    # -3.707728114377462E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkentos/loader/floating/HideRecorder;->check(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto/16 :goto_1

    .line 99
    :cond_3
    const-wide v1, -0x2fbffd5820ad5f49L    # -3.70774931654224E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkentos/loader/floating/HideRecorder;->check(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 102
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const/16 v2, 0x1e

    if-lt v1, v2, :cond_9

    .line 105
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-wide v2, -0x2fbffd5020ad5f49L    # -3.707777586095276E78

    invoke-static {v2, v3}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 106
    .local v1, "privateFlagField":Ljava/lang/reflect/Field;
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 107
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {p0, v2}, Lkentos/loader/floating/HideRecorder;->setOnePlusParams(Landroid/view/WindowManager$LayoutParams;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .end local v1    # "privateFlagField":Ljava/lang/reflect/Field;
    goto :goto_0

    .line 108
    :catch_0
    move-exception v1

    .line 110
    .local v1, "e":Ljava/lang/Exception;
    :try_start_2
    iget v2, p0, Landroid/view/WindowManager$LayoutParams;->flags:I

    or-int/lit16 v2, v2, 0x2000

    iput v2, p0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 111
    .end local v1    # "e":Ljava/lang/Exception;
    :goto_0
    goto :goto_2

    .line 113
    :cond_4
    const-wide v1, -0x2fbffd6820ad5f49L    # -3.707692777436167E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkentos/loader/floating/HideRecorder;->check(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 115
    invoke-static {p0}, Lkentos/loader/floating/HideRecorder;->setSamsungFlags(Landroid/view/WindowManager$LayoutParams;)V

    goto :goto_2

    .line 116
    :cond_5
    const-wide v1, -0x2fbffd6220ad5f49L    # -3.707713979600944E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkentos/loader/floating/HideRecorder;->check(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 118
    iget v1, p0, Landroid/view/WindowManager$LayoutParams;->memoryType:I

    const/high16 v2, 0x10000000

    or-int/2addr v1, v2

    iput v1, p0, Landroid/view/WindowManager$LayoutParams;->memoryType:I

    goto :goto_2

    .line 119
    :cond_6
    const-wide v1, -0x2fbffd1e20ad5f49L    # -3.707954270801754E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkentos/loader/floating/HideRecorder;->check(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_9

    const-wide v1, -0x2fbffd1720ad5f49L    # -3.707979006660661E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkentos/loader/floating/HideRecorder;->check(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_2

    .line 128
    :cond_7
    iget v1, p0, Landroid/view/WindowManager$LayoutParams;->flags:I

    or-int/lit16 v1, v1, 0x2000

    iput v1, p0, Landroid/view/WindowManager$LayoutParams;->flags:I

    goto :goto_2

    .line 98
    :cond_8
    :goto_1
    invoke-static {p0}, Lkentos/loader/floating/HideRecorder;->setXiaomiParams(Landroid/view/WindowManager$LayoutParams;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 135
    .end local v0    # "fakeTitle":Ljava/lang/String;
    :cond_9
    :goto_2
    goto :goto_3

    .line 131
    :catch_1
    move-exception v0

    .line 133
    .local v0, "e":Ljava/lang/Exception;
    iget v1, p0, Landroid/view/WindowManager$LayoutParams;->flags:I

    or-int/lit16 v1, v1, 0x2000

    iput v1, p0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 134
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 136
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_3
    return-void
.end method

.method private static setMeizuParams(Landroid/view/WindowManager$LayoutParams;)Z
    .locals 7
    .param p0, "params"    # Landroid/view/WindowManager$LayoutParams;

    .line 152
    const-wide v0, -0x2fbffd1220ad5f49L    # -3.707996675131309E78

    :try_start_0
    invoke-static {v0, v1}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 153
    .local v0, "MeizuParamsClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-wide v1, -0x2fbffd3320ad5f49L    # -3.707880063225033E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 154
    .local v1, "flagField":Ljava/lang/reflect/Field;
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 155
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v3

    .line 156
    .local v3, "MeizuParams":Ljava/lang/Object;
    const/16 v4, 0x2000

    invoke-virtual {v1, v3, v4}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V

    .line 157
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-wide v5, -0x2fbffd2d20ad5f49L    # -3.707901265389811E78

    invoke-static {v5, v6}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    .line 158
    .local v4, "mzParamsField":Ljava/lang/reflect/Field;
    invoke-virtual {v4, p0, v3}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 159
    return v2

    .line 160
    .end local v0    # "MeizuParamsClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v1    # "flagField":Ljava/lang/reflect/Field;
    .end local v3    # "MeizuParams":Ljava/lang/Object;
    .end local v4    # "mzParamsField":Ljava/lang/reflect/Field;
    :catch_0
    move-exception v0

    .line 161
    .local v0, "e":Ljava/lang/Exception;
    const/4 v1, 0x0

    return v1
.end method

.method private static setMeizuParams_new(Landroid/view/WindowManager$LayoutParams;)V
    .locals 3
    .param p0, "params"    # Landroid/view/WindowManager$LayoutParams;

    .line 167
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-wide v1, -0x2fbffd2120ad5f49L    # -3.707943669719365E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 168
    .local v0, "mzParamsField":Ljava/lang/reflect/Field;
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 169
    const/16 v1, 0x400

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 171
    .end local v0    # "mzParamsField":Ljava/lang/reflect/Field;
    goto :goto_0

    .line 170
    :catch_0
    move-exception v0

    .line 172
    :goto_0
    return-void
.end method

.method private static setOnePlusParams(Landroid/view/WindowManager$LayoutParams;I)V
    .locals 3
    .param p0, "params"    # Landroid/view/WindowManager$LayoutParams;
    .param p1, "flagValue"    # I

    .line 176
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-wide v1, -0x2fbffcd620ad5f49L    # -3.708208696779082E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 177
    .local v0, "flagField":Ljava/lang/reflect/Field;
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 178
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 181
    .end local v0    # "flagField":Ljava/lang/reflect/Field;
    goto :goto_0

    .line 179
    :catch_0
    move-exception v0

    .line 180
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 182
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_0
    return-void
.end method

.method private static setSamsungFlags(Landroid/view/WindowManager$LayoutParams;)V
    .locals 7
    .param p0, "params"    # Landroid/view/WindowManager$LayoutParams;

    .line 186
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-wide v1, -0x2fbffcc920ad5f49L    # -3.708254634802766E78

    invoke-static {v1, v2}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Class;

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 187
    .local v0, "semAddExtensionFlags":Ljava/lang/reflect/Method;
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-wide v3, -0x2fbffcf420ad5f49L    # -3.708102685955195E78

    invoke-static {v3, v4}, Lorg/lsposed/lsparanoid/Deobfuscator$геймбластерНАХУЙ$app;->getString(J)Ljava/lang/String;

    move-result-object v3

    new-array v4, v2, [Ljava/lang/Class;

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v6, v4, v5

    invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 189
    .local v1, "semAddPrivateFlags":Ljava/lang/reflect/Method;
    new-array v3, v2, [Ljava/lang/Object;

    const/high16 v4, -0x7ffe0000

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {v0, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Landroid/view/WindowManager$LayoutParams;->flags:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 194
    nop

    .end local v0    # "semAddExtensionFlags":Ljava/lang/reflect/Method;
    .end local v1    # "semAddPrivateFlags":Ljava/lang/reflect/Method;
    goto :goto_0

    .line 191
    :catch_0
    move-exception v0

    .line 193
    .local v0, "e":Ljava/lang/Exception;
    iget v1, p0, Landroid/view/WindowManager$LayoutParams;->flags:I

    or-int/lit16 v1, v1, 0x2000

    iput v1, p0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 195
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_0
    return-void
.end method

.method private static setXiaomiParams(Landroid/view/WindowManager$LayoutParams;)V
    .locals 1
    .param p0, "params"    # Landroid/view/WindowManager$LayoutParams;

    .line 143
    :try_start_0
    iget v0, p0, Landroid/view/WindowManager$LayoutParams;->flags:I

    or-int/lit16 v0, v0, 0x1000

    iput v0, p0, Landroid/view/WindowManager$LayoutParams;->flags:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 146
    goto :goto_0

    .line 144
    :catch_0
    move-exception v0

    .line 145
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 147
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_0
    return-void
.end method

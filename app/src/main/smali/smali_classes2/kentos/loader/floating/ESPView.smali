.class public Lkentos/loader/floating/ESPView;
.super Landroid/view/View;
.source "ESPView.java"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final OTH_NAME:[I

.field private static bitmapCache:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<",
            "Ljava/lang/Integer;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private static itemPosition:I

.field private static itemSize:I

.field public static sleepTime:J


# instance fields
.field OTHER:[Landroid/graphics/Bitmap;

.field private PaintTextBold:Landroid/graphics/Paint;

.field airdropBitmap:Landroid/graphics/Bitmap;

.field airplaneBitmap:Landroid/graphics/Bitmap;

.field atvBitmap:Landroid/graphics/Bitmap;

.field bikeBitmap:Landroid/graphics/Bitmap;

.field bitmap:Landroid/graphics/Bitmap;

.field boatBitmap:Landroid/graphics/Bitmap;

.field botBitmap:Landroid/graphics/Bitmap;

.field brdmBitmap:Landroid/graphics/Bitmap;

.field buggyBitmap:Landroid/graphics/Bitmap;

.field busBitmap:Landroid/graphics/Bitmap;

.field coupeBitmap:Landroid/graphics/Bitmap;

.field daciaBitmap:Landroid/graphics/Bitmap;

.field gliderBitmap:Landroid/graphics/Bitmap;

.field jetBitmap:Landroid/graphics/Bitmap;

.field kudaBitmap:Landroid/graphics/Bitmap;

.field lootBitmap:Landroid/graphics/Bitmap;

.field private mFPS:F

.field private mFPSCounter:F

.field private mFPSText:Landroid/graphics/Paint;

.field private mFPSTime:J

.field private mFillPaint:Landroid/graphics/Paint;

.field private mFilledPaint:Landroid/graphics/Paint;

.field private mItemsPaint:Landroid/graphics/Paint;

.field private mLootBoxPaint:Landroid/graphics/Paint;

.field private mMDText:Landroid/graphics/Paint;

.field private mNamePaint:Landroid/graphics/Paint;

.field private mPaintBitmap:Landroid/graphics/Paint;

.field private mPaintBitmap1:Landroid/graphics/Paint;

.field private mScaleX:F

.field private mScaleY:F

.field private mStrokePaint:Landroid/graphics/Paint;

.field private mTextPaint:Landroid/graphics/Paint;

.field private mTextPainti:Landroid/graphics/Paint;

.field private mTexturePaint:Landroid/graphics/Paint;

.field private mThread:Ljava/lang/Thread;

.field private mVehiclesPaint:Landroid/graphics/Paint;

.field miradoBitmap:Landroid/graphics/Bitmap;

.field monsterBitmap:Landroid/graphics/Bitmap;

.field private nearFillPaint:Landroid/graphics/Paint;

.field private nearStrokePaint:Landroid/graphics/Paint;

.field out:Landroid/graphics/Bitmap;

.field p:Landroid/graphics/Paint;

.field p2:Landroid/graphics/Paint;

.field path:Landroid/graphics/Path;

.field ronyBitmap:Landroid/graphics/Bitmap;

.field scooterBitmap:Landroid/graphics/Bitmap;

.field snowbikeBitmap:Landroid/graphics/Bitmap;

.field snowmobileBitmap:Landroid/graphics/Bitmap;

.field tempoBitmap:Landroid/graphics/Bitmap;

.field trikeBitmap:Landroid/graphics/Bitmap;

.field truckBitmap:Landroid/graphics/Bitmap;

.field uazBitmap:Landroid/graphics/Bitmap;

.field utvBitmap:Landroid/graphics/Bitmap;

.field vehicleBitmap:Landroid/graphics/Bitmap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 58
    new-instance v0, Landroid/util/LruCache;

    const/high16 v1, 0xa00000

    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    sput-object v0, Lkentos/loader/floating/ESPView;->bitmapCache:Landroid/util/LruCache;

    .line 68
    const/4 v0, 0x7

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lkentos/loader/floating/ESPView;->OTH_NAME:[I

    return-void

    :array_0
    .array-data 4
        0x7f070098
        0x7f070098
        0x7f070098
        0x7f070098
        0x7f0700b5
        0x7f0700a4
        0x7f0700a1
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;

    .line 79
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 53
    const/4 v0, 0x0

    iput v0, p0, Lkentos/loader/floating/ESPView;->mFPS:F

    .line 54
    iput v0, p0, Lkentos/loader/floating/ESPView;->mFPSCounter:F

    .line 55
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lkentos/loader/floating/ESPView;->mFPSTime:J

    .line 56
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lkentos/loader/floating/ESPView;->mScaleX:F

    .line 57
    iput v0, p0, Lkentos/loader/floating/ESPView;->mScaleY:F

    .line 59
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lkentos/loader/floating/ESPView;->path:Landroid/graphics/Path;

    .line 66
    const/4 v0, 0x7

    new-array v0, v0, [Landroid/graphics/Bitmap;

    iput-object v0, p0, Lkentos/loader/floating/ESPView;->OTHER:[Landroid/graphics/Bitmap;

    .line 80
    invoke-virtual {p0}, Lkentos/loader/floating/ESPView;->InitializePaints()V

    .line 81
    invoke-virtual {p0, v1}, Lkentos/loader/floating/ESPView;->setFocusableInTouchMode(Z)V

    .line 82
    invoke-virtual {p0, v1}, Lkentos/loader/floating/ESPView;->setBackgroundColor(I)V

    .line 83
    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Lkentos/loader/floating/ESPView;->mThread:Ljava/lang/Thread;

    .line 84
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 85
    return-void
.end method

.method public static ChangeFps(I)V
    .locals 2
    .param p0, "fps"    # I

    .line 62
    const/16 v0, 0x3e8

    div-int/2addr v0, p0

    int-to-long v0, v0

    sput-wide v0, Lkentos/loader/floating/ESPView;->sleepTime:J

    .line 63
    return-void
.end method

.method private Nation(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p1, "code"    # Ljava/lang/String;

    .line 764
    const-string v0, "G1"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 766
    const-string p1, "\ud83c\udf0d\ufe0f"

    goto :goto_0

    .line 769
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {p1, v2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v2

    add-int/lit8 v2, v2, -0x41

    const v3, 0x1f1e6

    add-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Character;->toChars(I)[C

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {p1, v2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v2

    add-int/lit8 v2, v2, -0x41

    add-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Character;->toChars(I)[C

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 771
    :goto_0
    return-object p1
.end method

.method private VehicleName(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "s"    # Ljava/lang/String;

    .line 1678
    const-string v0, "Buggy"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1679
    return-object v0

    .line 1680
    :cond_0
    const-string v0, "UAZ"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1681
    return-object v0

    .line 1682
    :cond_1
    const-string v0, "MotorcycleC"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "Trike"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1683
    return-object v0

    .line 1684
    :cond_2
    const-string v0, "Motorcycle"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "Bike"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1685
    return-object v0

    .line 1686
    :cond_3
    const-string v0, "DAcia"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "Dacia"

    if-eqz v0, :cond_4

    invoke-static {v1}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1687
    return-object v1

    .line 1688
    :cond_4
    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v1}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1689
    return-object v1

    .line 1690
    :cond_5
    const-string v0, "AquaRail"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "Jet"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 1691
    return-object v0

    .line 1692
    :cond_6
    const-string v0, "PG117"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "Boat"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 1693
    return-object v0

    .line 1694
    :cond_7
    const-string v0, "MiniBus"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    const-string v0, "Bus"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 1695
    return-object v0

    .line 1696
    :cond_8
    const-string v0, "Mirado"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 1697
    return-object v0

    .line 1698
    :cond_9
    const-string v0, "Scooter"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 1699
    return-object v0

    .line 1700
    :cond_a
    const-string v0, "Rony"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 1701
    return-object v0

    .line 1702
    :cond_b
    const-string v0, "Snowbike"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 1703
    return-object v0

    .line 1704
    :cond_c
    const-string v0, "Snowmobile"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 1705
    return-object v0

    .line 1706
    :cond_d
    const-string v0, "Tuk"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_e

    const-string v0, "Tempo"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_e

    .line 1707
    return-object v0

    .line 1708
    :cond_e
    const-string v0, "PickUp"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_f

    const-string v0, "Truck"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 1709
    return-object v0

    .line 1710
    :cond_f
    const-string v0, "BRDM"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_10

    .line 1711
    return-object v0

    .line 1712
    :cond_10
    const-string v0, "LadaNiva"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 1713
    return-object v0

    .line 1714
    :cond_11
    const-string v0, "Bigfoot"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_12

    const-string v0, "Monster"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_12

    .line 1715
    return-object v0

    .line 1716
    :cond_12
    const-string v0, "CoupeRB"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_13

    .line 1717
    return-object v0

    .line 1718
    :cond_13
    const-string v0, "glider"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_14

    const-string v0, "Motor Glider"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 1719
    const-string v0, "Motor Glider"

    return-object v0

    .line 1720
    :cond_14
    const-string v0, "UTV"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_15

    .line 1721
    return-object v0

    .line 1722
    :cond_15
    const-string v0, "ATV1"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_16

    .line 1723
    return-object v0

    .line 1724
    :cond_16
    const-string v0, "Reindeer"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_17

    .line 1725
    return-object v0

    .line 1726
    :cond_17
    const-string v0, ""

    return-object v0
.end method

.method private getItemName(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "s"    # Ljava/lang/String;

    .line 1205
    const-string v0, "MZJ_8X"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "8x"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1206
    return-object v0

    .line 1208
    :cond_0
    const-string v0, "MZJ_2X"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "2x"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1209
    return-object v0

    .line 1211
    :cond_1
    const-string v0, "MZJ_HD"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "Red Dot"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1212
    return-object v0

    .line 1214
    :cond_2
    const-string v0, "MZJ_3X"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "3x"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1215
    const-string v0, "3X"

    return-object v0

    .line 1217
    :cond_3
    const-string v0, "MZJ_QX"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "Hollow"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1218
    const-string v0, "Hollow Sight"

    return-object v0

    .line 1220
    :cond_4
    const-string v0, "MZJ_6X"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "6x"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 1221
    return-object v0

    .line 1223
    :cond_5
    const-string v0, "MZJ_4X"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "4x"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 1224
    return-object v0

    .line 1226
    :cond_6
    const-string v0, "MZJ_SideRMR"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "Canted"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1227
    const-string v0, "Canted Sight"

    return-object v0

    .line 1231
    :cond_7
    const-string v0, "Rifle_AUG"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    const-string v0, "AUG"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 1232
    return-object v0

    .line 1234
    :cond_8
    const-string v0, "Rifle_M762"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    const-string v0, "M762"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 1235
    return-object v0

    .line 1237
    :cond_9
    const-string v0, "Rifle_SCAR"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_a

    const-string v0, "SCAR-L"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 1238
    return-object v0

    .line 1240
    :cond_a
    const-string v0, "Rifle_FAMAS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_b

    const-string v0, "FAMAS"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 1241
    const-string v0, "FAMAS"

    return-object v0

    .line 1243
    :cond_b
    const-string v0, "Rifle_M416"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_c

    const-string v0, "M416"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 1244
    const-string v0, "M416"

    return-object v0

    .line 1246
    :cond_c
    const-string v0, "Rifle_M16A4"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_d

    const-string v0, "M16A4"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 1247
    const-string v0, "M16A-4"

    return-object v0

    .line 1249
    :cond_d
    const-string v0, "Rifle_G36"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_e

    const-string v0, "G36C"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 1250
    const-string v0, "G36C"

    return-object v0

    .line 1252
    :cond_e
    const-string v0, "Rifle_QBZ"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_f

    const-string v0, "QBZ"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 1253
    const-string v0, "QBZ"

    return-object v0

    .line 1255
    :cond_f
    const-string v0, "Rifle_AKM"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_10

    const-string v0, "AKM"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 1256
    const-string v0, "AKM"

    return-object v0

    .line 1258
    :cond_10
    const-string v0, "Rifle_HoneyBadger"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_11

    const-string v0, "Honey Badger"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 1259
    const-string v0, "Honey Badger"

    return-object v0

    .line 1261
    :cond_11
    const-string v0, "Rifle_Groza"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_12

    const-string v0, "Groza"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 1262
    const-string v0, "Groza"

    return-object v0

    .line 1264
    :cond_12
    const-string v0, "Rifle_ACE32"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_13

    const-string v0, "ACE32"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 1265
    const-string v0, "ACE32"

    return-object v0

    .line 1270
    :cond_13
    const-string v0, "SubmachineGun_UMP45"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "UMP"

    if-eqz v0, :cond_14

    invoke-static {v1}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 1271
    return-object v1

    .line 1274
    :cond_14
    const-string v0, "MachineGun_PP19"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_15

    const-string v0, "Bizon"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 1275
    const-string v0, "Bizon"

    return-object v0

    .line 1277
    :cond_15
    const-string v0, "MachineGun_TommyGun"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_16

    const-string v0, "TommyGun"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 1278
    const-string v0, "TommyGun"

    return-object v0

    .line 1280
    :cond_16
    const-string v0, "MachineGun_MP5K"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_17

    const-string v0, "MP5K"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 1281
    const-string v0, "MP5K"

    return-object v0

    .line 1283
    :cond_17
    const-string v0, "MachineGun_UMP9"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-static {v1}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 1284
    return-object v1

    .line 1286
    :cond_18
    const-string v0, "MachineGun_Vector"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_19

    const-string v0, "Vector"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 1287
    const-string v0, "Vector"

    return-object v0

    .line 1289
    :cond_19
    const-string v0, "MachineGun_Uzi"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1a

    const-string v0, "UZI"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 1290
    const-string v0, "UZI"

    return-object v0

    .line 1292
    :cond_1a
    const-string v0, "MachineGun_P90"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1b

    const-string v0, "P90"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 1293
    const-string v0, "P90"

    return-object v0

    .line 1297
    :cond_1b
    const-string v0, "Other_DP28"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1c

    const-string v0, "DP28"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 1298
    const-string v0, "DP28"

    return-object v0

    .line 1300
    :cond_1c
    const-string v0, "Other_M249"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1d

    const-string v0, "M249"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1d

    .line 1301
    const-string v0, "M249"

    return-object v0

    .line 1303
    :cond_1d
    const-string v0, "Other_MG3"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1e

    const-string v0, "MG3"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1e

    .line 1304
    const-string v0, "MG3"

    return-object v0

    .line 1308
    :cond_1e
    const-string v0, "Sniper_AWM"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1f

    const-string v0, "AWM"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1f

    .line 1309
    const-string v0, "AWM"

    return-object v0

    .line 1311
    :cond_1f
    const-string v0, "Sniper_AMR"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_20

    const-string v0, "AMR"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_20

    .line 1312
    const-string v0, "AMR"

    return-object v0

    .line 1314
    :cond_20
    const-string v0, "Sniper_QBU"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_21

    const-string v0, "QBU"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_21

    .line 1315
    const-string v0, "QBU"

    return-object v0

    .line 1317
    :cond_21
    const-string v0, "Sniper_SLR"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_22

    const-string v0, "SLR"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_22

    .line 1318
    const-string v0, "SLR"

    return-object v0

    .line 1320
    :cond_22
    const-string v0, "Sniper_SKS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_23

    const-string v0, "SKS"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_23

    .line 1321
    const-string v0, "SKS"

    return-object v0

    .line 1323
    :cond_23
    const-string v0, "Sniper_Mini14"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_24

    const-string v0, "Mini14"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_24

    .line 1324
    const-string v0, "Mini14"

    return-object v0

    .line 1326
    :cond_24
    const-string v0, "Sniper_M24"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_25

    const-string v0, "M24"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_25

    .line 1327
    const-string v0, "M24"

    return-object v0

    .line 1329
    :cond_25
    const-string v0, "Sniper_Kar98k"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_26

    const-string v0, "Kar98k"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_26

    .line 1330
    const-string v0, "Kar98k"

    return-object v0

    .line 1332
    :cond_26
    const-string v0, "Sniper_VSS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_27

    const-string v0, "VSS"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_27

    .line 1333
    const-string v0, "VSS"

    return-object v0

    .line 1335
    :cond_27
    const-string v0, "Sniper_Win94"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_28

    const-string v0, "Win94"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_28

    .line 1336
    const-string v0, "Win94"

    return-object v0

    .line 1338
    :cond_28
    const-string v0, "Sniper_Mk14"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_29

    const-string v0, "MK14"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_29

    .line 1339
    const-string v0, "MK14"

    return-object v0

    .line 1341
    :cond_29
    const-string v0, "Sniper_Mosin"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2a

    const-string v0, "Mosin"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2a

    .line 1342
    const-string v0, "Mosin"

    return-object v0

    .line 1344
    :cond_2a
    const-string v0, "Sniper_MK12"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2b

    const-string v0, "MK12"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2b

    .line 1345
    const-string v0, "MK12"

    return-object v0

    .line 1347
    :cond_2b
    const-string v0, "Sniper_Mk47"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2c

    const-string v0, "MK47"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2c

    .line 1348
    const-string v0, "Mk47 Mutant"

    return-object v0

    .line 1352
    :cond_2c
    const-string v0, "ShotGun_S12K"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2d

    const-string v0, "S12K"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2d

    .line 1353
    const-string v0, "S12K"

    return-object v0

    .line 1355
    :cond_2d
    const-string v0, "ShotGun_DP12"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2e

    const-string v0, "DBS"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2e

    .line 1356
    const-string v0, "DBS"

    return-object v0

    .line 1358
    :cond_2e
    const-string v0, "ShotGun_M1014"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2f

    const-string v0, "M1014"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2f

    .line 1359
    const-string v0, "M1014"

    return-object v0

    .line 1361
    :cond_2f
    const-string v0, "ShotGun_Neostead2000"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_30

    const-string v0, "NS2000"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_30

    .line 1362
    const-string v0, "NS2000"

    return-object v0

    .line 1364
    :cond_30
    const-string v0, "ShotGun_S686"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_31

    const-string v0, "S686"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_31

    .line 1365
    const-string v0, "S686"

    return-object v0

    .line 1367
    :cond_31
    const-string v0, "ShotGun_S1897"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_32

    const-string v0, "S1897"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_32

    .line 1368
    const-string v0, "S1897"

    return-object v0

    .line 1372
    :cond_32
    const-string v0, "Sickle"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_33

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_33

    .line 1373
    return-object v0

    .line 1375
    :cond_33
    const-string v0, "Machete"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_34

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_34

    .line 1376
    return-object v0

    .line 1378
    :cond_34
    const-string v0, "Cowbar"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_35

    const-string v0, "Crowbar"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_35

    .line 1379
    const-string v0, "Crowbar"

    return-object v0

    .line 1381
    :cond_35
    const-string v0, "CrossBow"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_36

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_36

    .line 1382
    return-object v0

    .line 1384
    :cond_36
    const-string v0, "Pan"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_37

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_37

    .line 1385
    return-object v0

    .line 1389
    :cond_37
    const-string v0, "SawedOff"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_38

    const-string v0, "Sawed-Off"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_38

    .line 1390
    const-string v0, "SawedOff"

    return-object v0

    .line 1392
    :cond_38
    const-string v0, "R1895"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_39

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_39

    .line 1393
    return-object v0

    .line 1395
    :cond_39
    const-string v0, "Vz61"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3a

    const-string v0, "Scorpion"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3a

    .line 1396
    const-string v0, "Scorpion"

    return-object v0

    .line 1398
    :cond_3a
    const-string v0, "P92"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3b

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3b

    .line 1399
    return-object v0

    .line 1401
    :cond_3b
    const-string v0, "P18C"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3c

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3c

    .line 1402
    return-object v0

    .line 1404
    :cond_3c
    const-string v0, "R45"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3d

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3d

    .line 1405
    return-object v0

    .line 1407
    :cond_3d
    const-string v0, "P1911"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3e

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3e

    .line 1408
    return-object v0

    .line 1410
    :cond_3e
    const-string v0, "DesertEagle"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3f

    const-string v0, "Dessert Eagle"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3f

    .line 1411
    const-string v0, "DesertEagle"

    return-object v0

    .line 1415
    :cond_3f
    const-string v0, "Ammo_762mm"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_40

    const-string v0, "7.62mm"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_40

    .line 1416
    const-string v0, "7.62"

    return-object v0

    .line 1418
    :cond_40
    const-string v0, "Ammo_45AC"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_41

    const-string v0, "45ACP"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_41

    .line 1419
    const-string v0, "45ACP"

    return-object v0

    .line 1421
    :cond_41
    const-string v0, "Ammo_556mm"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_42

    const-string v0, "5.56mm"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_42

    .line 1422
    const-string v0, "5.56"

    return-object v0

    .line 1424
    :cond_42
    const-string v0, "Ammo_9mm"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_43

    const-string v0, "9mm"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_43

    .line 1425
    const-string v0, "9mm"

    return-object v0

    .line 1427
    :cond_43
    const-string v0, "Ammo_300Magnum"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_44

    const-string v0, "300Magnum"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_44

    .line 1428
    const-string v0, "300Magnum"

    return-object v0

    .line 1430
    :cond_44
    const-string v0, "Ammo_50BMG"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_45

    const-string v0, "50BMG"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_45

    .line 1431
    const-string v0, "50BMG"

    return-object v0

    .line 1433
    :cond_45
    const-string v0, "Ammo_12Guage"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_46

    const-string v0, "12Guage"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_46

    .line 1434
    const-string v0, "12Guage"

    return-object v0

    .line 1436
    :cond_46
    const-string v0, "Ammo_Bolt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_47

    const-string v0, "Arrow"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_47

    .line 1437
    const-string v0, "Arrow"

    return-object v0

    .line 1441
    :cond_47
    const-string v0, "Bag_Lv3"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_48

    const-string v0, "Bag L3"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_48

    .line 1442
    const-string v0, "Bag lvl 3"

    return-object v0

    .line 1445
    :cond_48
    const-string v0, "Bag_Lv1"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_49

    const-string v0, "Bag L1"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_49

    .line 1446
    const-string v0, "Bag lvl 1"

    return-object v0

    .line 1449
    :cond_49
    const-string v0, "Bag_Lv2"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4a

    const-string v0, "Bag L2"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4a

    .line 1450
    const-string v0, "Bag lvl 2"

    return-object v0

    .line 1453
    :cond_4a
    const-string v0, "Armor_Lv2"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4b

    const-string v0, "Vest L2"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4b

    .line 1454
    const-string v0, "Vest lvl 2"

    return-object v0

    .line 1458
    :cond_4b
    const-string v0, "Armor_Lv1"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4c

    const-string v0, "Vest L1"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4c

    .line 1459
    const-string v0, "Vest lvl 1"

    return-object v0

    .line 1463
    :cond_4c
    const-string v0, "Armor_Lv3"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4d

    const-string v0, "Vest L3"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4d

    .line 1464
    const-string v0, "Vest lvl 3"

    return-object v0

    .line 1468
    :cond_4d
    const-string v0, "Helmet_Lv2"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4e

    const-string v0, "Helmet L2"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4e

    .line 1469
    const-string v0, "Helmet lvl 2"

    return-object v0

    .line 1472
    :cond_4e
    const-string v0, "Helmet_Lv1"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4f

    const-string v0, "Helmet L1"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4f

    .line 1473
    const-string v0, "Helmet lvl 1"

    return-object v0

    .line 1476
    :cond_4f
    const-string v0, "Helmet_Lv3"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_50

    const-string v0, "Helmet L3"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_50

    .line 1477
    const-string v0, "Helmet lvl 3"

    return-object v0

    .line 1481
    :cond_50
    const-string v0, "Pills"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_51

    const-string v0, "PainKiller"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_51

    .line 1482
    const-string v0, "PainKiller"

    return-object v0

    .line 1485
    :cond_51
    const-string v0, "Injection"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_52

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_52

    .line 1486
    return-object v0

    .line 1489
    :cond_52
    const-string v0, "Drink"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_53

    const-string v0, "EnergyDrink"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_53

    .line 1490
    const-string v0, "Energy Drink"

    return-object v0

    .line 1493
    :cond_53
    const-string v0, "Firstaid"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_54

    const-string v0, "FirstAid"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_54

    .line 1494
    const-string v0, "FirstAid"

    return-object v0

    .line 1497
    :cond_54
    const-string v0, "Bandage"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_55

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_55

    .line 1498
    return-object v0

    .line 1501
    :cond_55
    const-string v0, "FirstAidbox"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_56

    const-string v0, "MedKit"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_56

    .line 1502
    const-string v0, "Medkit"

    return-object v0

    .line 1506
    :cond_56
    const-string v0, "Grenade_Stun"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_57

    const-string v0, "Stun"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_57

    .line 1507
    const-string v0, "Stun"

    return-object v0

    .line 1510
    :cond_57
    const-string v0, "Grenade_Shoulei"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_58

    const-string v0, "Grenade"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_58

    .line 1511
    const-string v0, "Grenade"

    return-object v0

    .line 1514
    :cond_58
    const-string v0, "Grenade_Smoke"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_59

    const-string v0, "Smoke"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_59

    .line 1515
    const-string v0, "Smoke"

    return-object v0

    .line 1518
    :cond_59
    const-string v0, "Grenade_Burn"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5a

    const-string v0, "Molotov"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5a

    .line 1519
    const-string v0, "Molotov"

    return-object v0

    .line 1523
    :cond_5a
    const-string v0, "Large_FlashHider"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5b

    const-string v0, "Flash Hider Ar"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5b

    .line 1524
    const-string v0, "Flash Hider Ar"

    return-object v0

    .line 1527
    :cond_5b
    const-string v0, "QK_Large_C"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5c

    const-string v0, "Compensator Ar"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5c

    .line 1528
    const-string v0, "Compensator Ar"

    return-object v0

    .line 1531
    :cond_5c
    const-string v0, "Mid_FlashHider"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5d

    const-string v0, "Flash Hider SMG"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5d

    .line 1532
    const-string v0, "Flash Hider SMG"

    return-object v0

    .line 1535
    :cond_5d
    const-string v0, "QT_A_"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5e

    const-string v0, "Tactical Stock"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5e

    .line 1536
    const-string v0, "Tactical Stock"

    return-object v0

    .line 1539
    :cond_5e
    const-string v0, "DuckBill"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5f

    const-string v0, "Duckbill"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5f

    .line 1540
    const-string v0, "DuckBill"

    return-object v0

    .line 1543
    :cond_5f
    const-string v0, "Sniper_FlashHider"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_60

    const-string v0, "Flash Hider Sniper"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_60

    .line 1544
    const-string v0, "Flash Hider Sniper"

    return-object v0

    .line 1547
    :cond_60
    const-string v0, "Mid_Suppressor"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_61

    const-string v0, "Suppressor SMG"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_61

    .line 1548
    const-string v0, "Suppressor SMG"

    return-object v0

    .line 1551
    :cond_61
    const-string v0, "Choke"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_62

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_62

    .line 1552
    return-object v0

    .line 1555
    :cond_62
    const-string v0, "QT_UZI"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_63

    const-string v0, "Stock Micro UZI"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_63

    .line 1556
    const-string v0, "Stock Micro UZI"

    return-object v0

    .line 1559
    :cond_63
    const-string v0, "QK_Sniper"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_64

    const-string v0, "Compensator Sniper"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_64

    .line 1560
    const-string v0, "Compensator Sniper"

    return-object v0

    .line 1563
    :cond_64
    const-string v0, "Sniper_Suppressor"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_65

    const-string v0, "Suppressor Sniper"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_65

    .line 1564
    const-string v0, "Suppressor Sniper"

    return-object v0

    .line 1567
    :cond_65
    const-string v0, "Large_Suppressor"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_66

    const-string v0, "Suppressor Ar"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_66

    .line 1568
    const-string v0, "Suppressor Ar"

    return-object v0

    .line 1572
    :cond_66
    const-string v0, "Sniper_EQ_"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_67

    const-string v0, "Extended QD Sniper"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_67

    .line 1573
    const-string v0, "Ex.Qd.Sniper"

    return-object v0

    .line 1576
    :cond_67
    const-string v0, "Sniper_E_"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_68

    const-string v0, "Extended Mag Sniper"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_68

    .line 1577
    const-string v0, "Ex.Sniper"

    return-object v0

    .line 1580
    :cond_68
    const-string v0, "Sniper_Q_"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_69

    const-string v0, "QuickDraw Mag Sniper"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_69

    .line 1581
    const-string v0, "Qd.Sniper"

    return-object v0

    .line 1584
    :cond_69
    const-string v0, "Large_EQ_"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6a

    const-string v0, "Extended QD Ar"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6a

    .line 1585
    const-string v0, "Extended QD Ar"

    return-object v0

    .line 1588
    :cond_6a
    const-string v0, "Large_E_"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6b

    const-string v0, "Extended Mag Ar"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6b

    .line 1589
    const-string v0, "Extended Mag Ar"

    return-object v0

    .line 1592
    :cond_6b
    const-string v0, "Large_Q_"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6c

    const-string v0, "QuickDraw Mag Ar"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6c

    .line 1593
    const-string v0, "QuickDraw Mag Ar"

    return-object v0

    .line 1596
    :cond_6c
    const-string v0, "Mid_EQ_"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6d

    const-string v0, "Extended QD SMG"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6d

    .line 1597
    const-string v0, "Ex.Qd.SMG"

    return-object v0

    .line 1600
    :cond_6d
    const-string v0, "Mid_E_"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6e

    const-string v0, "Extended Mag SMG"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6e

    .line 1601
    const-string v0, "Ex.SMG"

    return-object v0

    .line 1604
    :cond_6e
    const-string v0, "Mid_Q_"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6f

    const-string v0, "QuickDraw Mag SMG"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6f

    .line 1605
    const-string v0, "Qd.SMG"

    return-object v0

    .line 1608
    :cond_6f
    const-string v0, "Crossbow_Q"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_70

    const-string v0, "Quiver CrossBow"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_70

    .line 1609
    const-string v0, "Quiver CrossBow"

    return-object v0

    .line 1612
    :cond_70
    const-string v0, "ZDD_Sniper"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_71

    const-string v0, "Bullet Loop"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_71

    .line 1613
    const-string v0, "Bullet Loop"

    return-object v0

    .line 1617
    :cond_71
    const-string v0, "ThumbGrip"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_72

    const-string v0, "Thumb Grip"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_72

    .line 1618
    const-string v0, "Thumb Grip"

    return-object v0

    .line 1621
    :cond_72
    const-string v0, "Lasersight"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_73

    const-string v0, "Laser Sight"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_73

    .line 1622
    const-string v0, "Laser Sight"

    return-object v0

    .line 1625
    :cond_73
    const-string v0, "Angled"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_74

    const-string v0, "Angled Grip"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_74

    .line 1626
    const-string v0, "Angled Grip"

    return-object v0

    .line 1629
    :cond_74
    const-string v0, "LightGrip"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_75

    const-string v0, "Light Grip"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_75

    .line 1630
    const-string v0, "Light Grip"

    return-object v0

    .line 1633
    :cond_75
    const-string v0, "Vertical"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_76

    const-string v0, "Vertical Grip"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_76

    .line 1634
    const-string v0, "Vertical Grip"

    return-object v0

    .line 1637
    :cond_76
    const-string v0, "HalfGrip"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_77

    const-string v0, "Half Grip"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_77

    .line 1638
    const-string v0, "Half Grip"

    return-object v0

    .line 1642
    :cond_77
    const-string v0, "GasCan"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_78

    const-string v0, "Gas Can"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_78

    .line 1643
    const-string v0, "Gas Can"

    return-object v0

    .line 1646
    :cond_78
    const-string v0, "Mid_Compensator"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_79

    const-string v0, "Compensator SMG"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_79

    .line 1647
    const-string v0, "Compensator SMG"

    return-object v0

    .line 1651
    :cond_79
    const-string v0, "Flaregun"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7a

    const-string v0, "FlareGun"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7a

    .line 1652
    const-string v0, "Flare Gun"

    return-object v0

    .line 1654
    :cond_7a
    const-string v0, "Ammo_Flare"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7b

    const-string v0, "FlareGun"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7b

    .line 1655
    const-string v0, "Flare Gun"

    return-object v0

    .line 1658
    :cond_7b
    const-string v0, "Ghillie"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7c

    const-string v0, "Ghillie Suit"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7c

    .line 1659
    const-string v0, "Ghillie Suit"

    return-object v0

    .line 1661
    :cond_7c
    const-string v0, "CheekPad"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_7d

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7d

    .line 1662
    return-object v0

    .line 1664
    :cond_7d
    const-string v0, "PickUpListWrapperActor"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7e

    const-string v0, "LootBox"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7e

    .line 1665
    const-string v0, "LootBox"

    return-object v0

    .line 1667
    :cond_7e
    const-string v0, "AirDropPlane"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7f

    const-string v0, "DropPlane"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7f

    .line 1668
    const-string v0, "DropPlane"

    return-object v0

    .line 1670
    :cond_7f
    const-string v0, "AirDropBox"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_80

    const-string v0, "AirDrop"

    invoke-static {v0}, Lkentos/loader/floating/Overlay;->getConfig(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_80

    .line 1671
    const-string v0, "AirDrop"

    return-object v0

    .line 1673
    :cond_80
    const/4 v0, 0x0

    return-object v0
.end method

.method private getWeapon(I)Ljava/lang/String;
    .locals 1
    .param p1, "id"    # I

    .line 776
    sparse-switch p1, :sswitch_data_0

    .line 1191
    const-string v0, ""

    return-object v0

    .line 1099
    :sswitch_0
    const-string v0, "Knife"

    return-object v0

    .line 1092
    :sswitch_1
    const-string v0, "Panci"

    return-object v0

    .line 1085
    :sswitch_2
    const-string v0, "Sickle"

    return-object v0

    .line 1078
    :sswitch_3
    const-string v0, "Crowbar"

    return-object v0

    .line 1071
    :sswitch_4
    const-string v0, "Machete"

    return-object v0

    .line 1108
    :sswitch_5
    const-string v0, "Crossbow"

    return-object v0

    .line 1189
    :sswitch_6
    const-string v0, "Desert Angle"

    return-object v0

    .line 1154
    :sswitch_7
    const-string v0, "Scorpion"

    return-object v0

    .line 1140
    :sswitch_8
    const-string v0, "Sawed Off"

    return-object v0

    .line 1175
    :sswitch_9
    const-string v0, "R45"

    return-object v0

    .line 1168
    :sswitch_a
    const-string v0, "P18C"

    return-object v0

    .line 1147
    :sswitch_b
    const-string v0, "R1895"

    return-object v0

    .line 1182
    :sswitch_c
    const-string v0, "P1911"

    return-object v0

    .line 1161
    :sswitch_d
    const-string v0, "P92"

    return-object v0

    .line 1131
    :sswitch_e
    const-string v0, "MG3"

    return-object v0

    .line 1117
    :sswitch_f
    const-string v0, "DP28"

    return-object v0

    .line 1124
    :sswitch_10
    const-string v0, "M249"

    return-object v0

    .line 1062
    :sswitch_11
    const-string v0, "NS2000"

    return-object v0

    .line 1055
    :sswitch_12
    const-string v0, "M1014"

    return-object v0

    .line 1048
    :sswitch_13
    const-string v0, "DBS"

    return-object v0

    .line 1041
    :sswitch_14
    const-string v0, "S12K"

    return-object v0

    .line 1034
    :sswitch_15
    const-string v0, "S1897"

    return-object v0

    .line 1027
    :sswitch_16
    const-string v0, "S686"

    return-object v0

    .line 1018
    :sswitch_17
    const-string v0, "Mk12"

    return-object v0

    .line 1011
    :sswitch_18
    const-string v0, "Lynx AMR"

    return-object v0

    .line 1004
    :sswitch_19
    const-string v0, "Mosin"

    return-object v0

    .line 997
    :sswitch_1a
    const-string v0, "QBU"

    return-object v0

    .line 990
    :sswitch_1b
    const-string v0, "SLR"

    return-object v0

    .line 983
    :sswitch_1c
    const-string v0, "Win94"

    return-object v0

    .line 976
    :sswitch_1d
    const-string v0, "Mk14"

    return-object v0

    .line 969
    :sswitch_1e
    const-string v0, "Mini14"

    return-object v0

    .line 962
    :sswitch_1f
    const-string v0, "VSS"

    return-object v0

    .line 955
    :sswitch_20
    const-string v0, "SKS"

    return-object v0

    .line 948
    :sswitch_21
    const-string v0, "AWM"

    return-object v0

    .line 941
    :sswitch_22
    const-string v0, "M24"

    return-object v0

    .line 934
    :sswitch_23
    const-string v0, "Kar98k"

    return-object v0

    .line 926
    :sswitch_24
    const-string v0, "P90"

    return-object v0

    .line 919
    :sswitch_25
    const-string v0, "MP5K"

    return-object v0

    .line 912
    :sswitch_26
    const-string v0, "Bizon"

    return-object v0

    .line 905
    :sswitch_27
    const-string v0, "ThommyGun"

    return-object v0

    .line 898
    :sswitch_28
    const-string v0, "Vector"

    return-object v0

    .line 891
    :sswitch_29
    const-string v0, "UMP"

    return-object v0

    .line 884
    :sswitch_2a
    const-string v0, "UZI"

    return-object v0

    .line 875
    :sswitch_2b
    const-string v0, "ACE32"

    return-object v0

    .line 868
    :sswitch_2c
    const-string v0, "ASM AR"

    return-object v0

    .line 861
    :sswitch_2d
    const-string v0, "FAMAS"

    return-object v0

    .line 854
    :sswitch_2e
    const-string v0, "Honey Badger"

    return-object v0

    .line 847
    :sswitch_2f
    const-string v0, "G36C"

    return-object v0

    .line 840
    :sswitch_30
    const-string v0, "Mk47"

    return-object v0

    .line 833
    :sswitch_31
    const-string v0, "M762"

    return-object v0

    .line 826
    :sswitch_32
    const-string v0, "QBZ"

    return-object v0

    .line 819
    :sswitch_33
    const-string v0, "AUG"

    return-object v0

    .line 812
    :sswitch_34
    const-string v0, "Groza"

    return-object v0

    .line 805
    :sswitch_35
    const-string v0, "M416"

    return-object v0

    .line 798
    :sswitch_36
    const-string v0, "SCAR-L"

    return-object v0

    .line 791
    :sswitch_37
    const-string v0, "M16A4"

    return-object v0

    .line 784
    :sswitch_38
    const-string v0, "AKM"

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x18a89 -> :sswitch_38
        0x18a8a -> :sswitch_37
        0x18a8b -> :sswitch_36
        0x18a8c -> :sswitch_35
        0x18a8d -> :sswitch_34
        0x18a8e -> :sswitch_33
        0x18a8f -> :sswitch_32
        0x18a90 -> :sswitch_31
        0x18a91 -> :sswitch_30
        0x18a92 -> :sswitch_2f
        0x18a94 -> :sswitch_2e
        0x18aec -> :sswitch_2d
        0x18aed -> :sswitch_2c
        0x18aee -> :sswitch_2b
        0x18e71 -> :sswitch_2a
        0x18e72 -> :sswitch_29
        0x18e73 -> :sswitch_28
        0x18e74 -> :sswitch_27
        0x18e75 -> :sswitch_26
        0x18e77 -> :sswitch_25
        0x18ed9 -> :sswitch_24
        0x19259 -> :sswitch_23
        0x1925a -> :sswitch_22
        0x1925b -> :sswitch_21
        0x1925c -> :sswitch_20
        0x1925d -> :sswitch_1f
        0x1925e -> :sswitch_1e
        0x1925f -> :sswitch_1d
        0x19260 -> :sswitch_1c
        0x19261 -> :sswitch_1b
        0x19262 -> :sswitch_1a
        0x19263 -> :sswitch_19
        0x19264 -> :sswitch_18
        0x192bc -> :sswitch_17
        0x19641 -> :sswitch_16
        0x19642 -> :sswitch_15
        0x19643 -> :sswitch_14
        0x19644 -> :sswitch_13
        0x196a5 -> :sswitch_12
        0x196a6 -> :sswitch_11
        0x19a29 -> :sswitch_10
        0x19a2a -> :sswitch_f
        0x19a32 -> :sswitch_e
        0x19e11 -> :sswitch_d
        0x19e12 -> :sswitch_c
        0x19e13 -> :sswitch_b
        0x19e14 -> :sswitch_a
        0x19e15 -> :sswitch_9
        0x19e16 -> :sswitch_8
        0x19e18 -> :sswitch_7
        0x19e1a -> :sswitch_6
        0x1a1f9 -> :sswitch_5
        0x1a5e1 -> :sswitch_4
        0x1a5e2 -> :sswitch_3
        0x1a5e3 -> :sswitch_2
        0x1a5e4 -> :sswitch_1
        0x1a5e5 -> :sswitch_0
        0xf695b -> :sswitch_38
        0xf695c -> :sswitch_38
        0xf695d -> :sswitch_38
        0xf695e -> :sswitch_38
        0xf695f -> :sswitch_38
        0xf6965 -> :sswitch_37
        0xf6966 -> :sswitch_37
        0xf6967 -> :sswitch_37
        0xf6968 -> :sswitch_37
        0xf6969 -> :sswitch_37
        0xf696f -> :sswitch_36
        0xf6970 -> :sswitch_36
        0xf6971 -> :sswitch_36
        0xf6972 -> :sswitch_36
        0xf6973 -> :sswitch_36
        0xf6979 -> :sswitch_35
        0xf697a -> :sswitch_35
        0xf697b -> :sswitch_35
        0xf697c -> :sswitch_35
        0xf697d -> :sswitch_35
        0xf6983 -> :sswitch_34
        0xf6984 -> :sswitch_34
        0xf6985 -> :sswitch_34
        0xf6986 -> :sswitch_34
        0xf6987 -> :sswitch_34
        0xf698d -> :sswitch_33
        0xf698e -> :sswitch_33
        0xf698f -> :sswitch_33
        0xf6990 -> :sswitch_33
        0xf6991 -> :sswitch_33
        0xf6997 -> :sswitch_32
        0xf6998 -> :sswitch_32
        0xf6999 -> :sswitch_32
        0xf699a -> :sswitch_32
        0xf699b -> :sswitch_32
        0xf69a1 -> :sswitch_31
        0xf69a2 -> :sswitch_31
        0xf69a3 -> :sswitch_31
        0xf69a4 -> :sswitch_31
        0xf69a5 -> :sswitch_31
        0xf69ab -> :sswitch_30
        0xf69ac -> :sswitch_30
        0xf69ad -> :sswitch_30
        0xf69ae -> :sswitch_30
        0xf69af -> :sswitch_30
        0xf69b5 -> :sswitch_2f
        0xf69b6 -> :sswitch_2f
        0xf69b7 -> :sswitch_2f
        0xf69b8 -> :sswitch_2f
        0xf69b9 -> :sswitch_2f
        0xf69c9 -> :sswitch_2e
        0xf69ca -> :sswitch_2e
        0xf69cb -> :sswitch_2e
        0xf69cc -> :sswitch_2e
        0xf69cd -> :sswitch_2e
        0xf6d39 -> :sswitch_2d
        0xf6d3a -> :sswitch_2d
        0xf6d3b -> :sswitch_2d
        0xf6d3c -> :sswitch_2d
        0xf6d3d -> :sswitch_2d
        0xf6d43 -> :sswitch_2c
        0xf6d44 -> :sswitch_2c
        0xf6d45 -> :sswitch_2c
        0xf6d46 -> :sswitch_2c
        0xf6d47 -> :sswitch_2c
        0xf6d4d -> :sswitch_2b
        0xf6d4e -> :sswitch_2b
        0xf6d4f -> :sswitch_2b
        0xf6d50 -> :sswitch_2b
        0xf6d51 -> :sswitch_2b
        0xf906b -> :sswitch_2a
        0xf906c -> :sswitch_2a
        0xf906d -> :sswitch_2a
        0xf906e -> :sswitch_2a
        0xf906f -> :sswitch_2a
        0xf9075 -> :sswitch_29
        0xf9076 -> :sswitch_29
        0xf9077 -> :sswitch_29
        0xf9078 -> :sswitch_29
        0xf9079 -> :sswitch_29
        0xf907f -> :sswitch_28
        0xf9080 -> :sswitch_28
        0xf9081 -> :sswitch_28
        0xf9082 -> :sswitch_28
        0xf9083 -> :sswitch_28
        0xf9089 -> :sswitch_27
        0xf908a -> :sswitch_27
        0xf908b -> :sswitch_27
        0xf908c -> :sswitch_27
        0xf908d -> :sswitch_27
        0xf9093 -> :sswitch_26
        0xf9094 -> :sswitch_26
        0xf9095 -> :sswitch_26
        0xf9096 -> :sswitch_26
        0xf9097 -> :sswitch_26
        0xf90a7 -> :sswitch_25
        0xf90a8 -> :sswitch_25
        0xf90a9 -> :sswitch_25
        0xf90aa -> :sswitch_25
        0xf90ab -> :sswitch_25
        0xf947b -> :sswitch_24
        0xf947c -> :sswitch_24
        0xf947d -> :sswitch_24
        0xf947e -> :sswitch_24
        0xf947f -> :sswitch_24
        0xfb77b -> :sswitch_23
        0xfb77c -> :sswitch_23
        0xfb77d -> :sswitch_23
        0xfb77e -> :sswitch_23
        0xfb77f -> :sswitch_23
        0xfb785 -> :sswitch_22
        0xfb786 -> :sswitch_22
        0xfb787 -> :sswitch_22
        0xfb788 -> :sswitch_22
        0xfb789 -> :sswitch_22
        0xfb78f -> :sswitch_21
        0xfb790 -> :sswitch_21
        0xfb791 -> :sswitch_21
        0xfb792 -> :sswitch_21
        0xfb793 -> :sswitch_21
        0xfb799 -> :sswitch_20
        0xfb79a -> :sswitch_20
        0xfb79b -> :sswitch_20
        0xfb79c -> :sswitch_20
        0xfb79d -> :sswitch_20
        0xfb7a3 -> :sswitch_1f
        0xfb7a4 -> :sswitch_1f
        0xfb7a5 -> :sswitch_1f
        0xfb7a6 -> :sswitch_1f
        0xfb7a7 -> :sswitch_1f
        0xfb7ad -> :sswitch_1e
        0xfb7ae -> :sswitch_1e
        0xfb7af -> :sswitch_1e
        0xfb7b0 -> :sswitch_1e
        0xfb7b1 -> :sswitch_1e
        0xfb7b7 -> :sswitch_1d
        0xfb7b8 -> :sswitch_1d
        0xfb7b9 -> :sswitch_1d
        0xfb7ba -> :sswitch_1d
        0xfb7bb -> :sswitch_1d
        0xfb7c1 -> :sswitch_1c
        0xfb7c2 -> :sswitch_1c
        0xfb7c3 -> :sswitch_1c
        0xfb7c4 -> :sswitch_1c
        0xfb7c5 -> :sswitch_1c
        0xfb7cb -> :sswitch_1b
        0xfb7cc -> :sswitch_1b
        0xfb7cd -> :sswitch_1b
        0xfb7ce -> :sswitch_1b
        0xfb7cf -> :sswitch_1b
        0xfb7d5 -> :sswitch_1a
        0xfb7d6 -> :sswitch_1a
        0xfb7d7 -> :sswitch_1a
        0xfb7d8 -> :sswitch_1a
        0xfb7d9 -> :sswitch_1a
        0xfb7df -> :sswitch_19
        0xfb7e0 -> :sswitch_19
        0xfb7e1 -> :sswitch_19
        0xfb7e2 -> :sswitch_19
        0xfb7e3 -> :sswitch_19
        0xfb7e9 -> :sswitch_18
        0xfb7ea -> :sswitch_18
        0xfb7eb -> :sswitch_18
        0xfb7ec -> :sswitch_18
        0xfb7ed -> :sswitch_18
        0xfbb59 -> :sswitch_17
        0xfbb5a -> :sswitch_17
        0xfbb5b -> :sswitch_17
        0xfbb5c -> :sswitch_17
        0xfbb5d -> :sswitch_17
        0xfde8b -> :sswitch_16
        0xfde8c -> :sswitch_16
        0xfde8d -> :sswitch_16
        0xfde8e -> :sswitch_16
        0xfde8f -> :sswitch_16
        0xfde95 -> :sswitch_15
        0xfde96 -> :sswitch_15
        0xfde97 -> :sswitch_15
        0xfde98 -> :sswitch_15
        0xfde99 -> :sswitch_15
        0xfde9f -> :sswitch_14
        0xfdea0 -> :sswitch_14
        0xfdea1 -> :sswitch_14
        0xfdea2 -> :sswitch_14
        0xfdea3 -> :sswitch_14
        0xfdea9 -> :sswitch_13
        0xfdeaa -> :sswitch_13
        0xfdeab -> :sswitch_13
        0xfdeac -> :sswitch_13
        0xfdead -> :sswitch_13
        0xfe273 -> :sswitch_12
        0xfe274 -> :sswitch_12
        0xfe275 -> :sswitch_12
        0xfe276 -> :sswitch_12
        0xfe277 -> :sswitch_12
        0xfe27d -> :sswitch_11
        0xfe27e -> :sswitch_11
        0xfe27f -> :sswitch_11
        0xfe280 -> :sswitch_11
        0xfe281 -> :sswitch_11
        0x10059b -> :sswitch_10
        0x10059c -> :sswitch_10
        0x10059d -> :sswitch_10
        0x10059e -> :sswitch_10
        0x10059f -> :sswitch_10
        0x1005a5 -> :sswitch_f
        0x1005a6 -> :sswitch_f
        0x1005a7 -> :sswitch_f
        0x1005a8 -> :sswitch_f
        0x1005a9 -> :sswitch_f
        0x1005f5 -> :sswitch_e
        0x1005f6 -> :sswitch_e
        0x1005f7 -> :sswitch_e
        0x1005f8 -> :sswitch_e
        0x1005f9 -> :sswitch_e
        0x102cab -> :sswitch_d
        0x102cac -> :sswitch_d
        0x102cad -> :sswitch_d
        0x102cae -> :sswitch_d
        0x102caf -> :sswitch_d
        0x102cb5 -> :sswitch_c
        0x102cb6 -> :sswitch_c
        0x102cb7 -> :sswitch_c
        0x102cb8 -> :sswitch_c
        0x102cb9 -> :sswitch_c
        0x102cbf -> :sswitch_b
        0x102cc0 -> :sswitch_b
        0x102cc1 -> :sswitch_b
        0x102cc2 -> :sswitch_b
        0x102cc3 -> :sswitch_b
        0x102cc9 -> :sswitch_a
        0x102cca -> :sswitch_a
        0x102ccb -> :sswitch_a
        0x102ccc -> :sswitch_a
        0x102ccd -> :sswitch_a
        0x102cd3 -> :sswitch_9
        0x102cd4 -> :sswitch_9
        0x102cd5 -> :sswitch_9
        0x102cd6 -> :sswitch_9
        0x102cd7 -> :sswitch_9
        0x102cdd -> :sswitch_8
        0x102cde -> :sswitch_8
        0x102cdf -> :sswitch_8
        0x102ce0 -> :sswitch_8
        0x102ce1 -> :sswitch_8
        0x102cf1 -> :sswitch_7
        0x102cf2 -> :sswitch_7
        0x102cf3 -> :sswitch_7
        0x102cf4 -> :sswitch_7
        0x102cf5 -> :sswitch_7
        0x102d05 -> :sswitch_6
        0x102d06 -> :sswitch_6
        0x102d07 -> :sswitch_6
        0x102d08 -> :sswitch_6
        0x102d09 -> :sswitch_6
        0x1053bb -> :sswitch_5
        0x1053bc -> :sswitch_5
        0x1053bd -> :sswitch_5
        0x1053be -> :sswitch_5
        0x1053bf -> :sswitch_5
        0x107acb -> :sswitch_4
        0x107acc -> :sswitch_4
        0x107acd -> :sswitch_4
        0x107ace -> :sswitch_4
        0x107acf -> :sswitch_4
        0x107ad5 -> :sswitch_3
        0x107ad6 -> :sswitch_3
        0x107ad7 -> :sswitch_3
        0x107ad8 -> :sswitch_3
        0x107ad9 -> :sswitch_3
        0x107adf -> :sswitch_2
        0x107ae0 -> :sswitch_2
        0x107ae1 -> :sswitch_2
        0x107ae2 -> :sswitch_2
        0x107ae3 -> :sswitch_2
        0x107ae9 -> :sswitch_1
        0x107aea -> :sswitch_1
        0x107aeb -> :sswitch_1
        0x107aec -> :sswitch_1
        0x107aed -> :sswitch_1
        0x107af3 -> :sswitch_0
        0x107af4 -> :sswitch_0
        0x107af5 -> :sswitch_0
        0x107af6 -> :sswitch_0
        0x107af7 -> :sswitch_0
    .end sparse-switch
.end method

.method private getWeaponIcon(I)I
    .locals 1
    .param p1, "id"    # I

    .line 1198
    const/4 v0, 0x0

    return v0
.end method

.method private handleFuelHealthText(Landroid/graphics/Canvas;FFFFF)V
    .locals 23
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "posX"    # F
    .param p3, "posY"    # F
    .param p4, "fuel"    # F
    .param p5, "health"    # F
    .param p6, "size"    # F

    .line 541
    move-object/from16 v0, p0

    iget-object v1, v0, Lkentos/loader/floating/ESPView;->mStrokePaint:Landroid/graphics/Paint;

    const/16 v2, 0x32

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v3, v3}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 542
    const/high16 v1, 0x42340000    # 45.0f

    sub-float v5, p2, v1

    const/high16 v12, 0x41980000    # 19.0f

    add-float v6, p3, v12

    const/high16 v13, 0x42480000    # 50.0f

    add-float v7, p2, v13

    const/high16 v14, 0x41c80000    # 25.0f

    add-float v8, p3, v14

    const/high16 v9, 0x40400000    # 3.0f

    const/high16 v10, 0x40400000    # 3.0f

    iget-object v11, v0, Lkentos/loader/floating/ESPView;->mStrokePaint:Landroid/graphics/Paint;

    move-object/from16 v4, p1

    invoke-virtual/range {v4 .. v11}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 543
    iget-object v4, v0, Lkentos/loader/floating/ESPView;->mFilledPaint:Landroid/graphics/Paint;

    const/16 v5, 0x64

    const/16 v6, 0xff

    invoke-virtual {v4, v5, v6, v6, v3}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 544
    sub-float v16, p2, v1

    add-float v17, p3, v12

    const/high16 v4, 0x42200000    # 40.0f

    sub-float v7, p2, v4

    const/high16 v8, 0x42b40000    # 90.0f

    mul-float v9, p4, v8

    const/high16 v10, 0x42c80000    # 100.0f

    div-float/2addr v9, v10

    add-float v18, v7, v9

    add-float v19, p3, v14

    const/high16 v20, 0x40400000    # 3.0f

    const/high16 v21, 0x40400000    # 3.0f

    iget-object v7, v0, Lkentos/loader/floating/ESPView;->mFilledPaint:Landroid/graphics/Paint;

    move-object/from16 v15, p1

    move-object/from16 v22, v7

    invoke-virtual/range {v15 .. v22}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 545
    iget-object v7, v0, Lkentos/loader/floating/ESPView;->mStrokePaint:Landroid/graphics/Paint;

    invoke-virtual {v7, v2, v3, v3, v3}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 546
    sub-float v15, p2, v1

    const/high16 v2, 0x41e80000    # 29.0f

    add-float v16, p3, v2

    add-float v17, p2, v13

    const/high16 v3, 0x420c0000    # 35.0f

    add-float v18, p3, v3

    const/high16 v19, 0x40400000    # 3.0f

    iget-object v7, v0, Lkentos/loader/floating/ESPView;->mStrokePaint:Landroid/graphics/Paint;

    move-object/from16 v14, p1

    move-object/from16 v21, v7

    invoke-virtual/range {v14 .. v21}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 547
    iget-object v7, v0, Lkentos/loader/floating/ESPView;->mFilledPaint:Landroid/graphics/Paint;

    const/16 v9, 0x2d

    const/16 v11, 0x1e

    invoke-virtual {v7, v5, v6, v9, v11}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 548
    sub-float v13, p2, v1

    add-float v14, p3, v2

    sub-float v1, p2, v4

    mul-float v2, p5, v8

    div-float/2addr v2, v10

    add-float v15, v1, v2

    add-float v16, p3, v3

    const/high16 v17, 0x40400000    # 3.0f

    const/high16 v18, 0x40400000    # 3.0f

    iget-object v1, v0, Lkentos/loader/floating/ESPView;->mFilledPaint:Landroid/graphics/Paint;

    move-object/from16 v12, p1

    move-object/from16 v19, v1

    invoke-virtual/range {v12 .. v19}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 549
    return-void
.end method

.method public static scale(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 17
    .param p0, "bitmap"    # Landroid/graphics/Bitmap;
    .param p1, "maxWidth"    # I
    .param p2, "maxHeight"    # I

    .line 1733
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    move/from16 v1, p1

    int-to-float v2, v1

    div-float/2addr v0, v2

    .line 1734
    .local v0, "widthRatio":F
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    move/from16 v3, p2

    int-to-float v4, v3

    div-float/2addr v2, v4

    .line 1736
    .local v2, "heightRatio":F
    cmpl-float v4, v0, v2

    if-ltz v4, :cond_0

    .line 1737
    move/from16 v4, p1

    .line 1738
    .local v4, "width":I
    int-to-float v5, v4

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v5, v6

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v5, v6

    float-to-int v5, v5

    .local v5, "height":I
    goto :goto_0

    .line 1740
    .end local v4    # "width":I
    .end local v5    # "height":I
    :cond_0
    move/from16 v5, p2

    .line 1741
    .restart local v5    # "height":I
    int-to-float v4, v5

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v4, v6

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v4, v6

    float-to-int v4, v4

    .line 1743
    .restart local v4    # "width":I
    :goto_0
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v4, v5, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 1745
    .local v6, "scaledBitmap":Landroid/graphics/Bitmap;
    int-to-float v7, v4

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    int-to-float v8, v8

    div-float/2addr v7, v8

    .line 1746
    .local v7, "ratioX":F
    int-to-float v8, v5

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    int-to-float v9, v9

    div-float/2addr v8, v9

    .line 1747
    .local v8, "ratioY":F
    int-to-float v9, v4

    const/high16 v10, 0x40000000    # 2.0f

    div-float/2addr v9, v10

    .line 1748
    .local v9, "middleX":F
    int-to-float v11, v5

    div-float/2addr v11, v10

    .line 1749
    .local v11, "middleY":F
    new-instance v10, Landroid/graphics/Matrix;

    invoke-direct {v10}, Landroid/graphics/Matrix;-><init>()V

    .line 1750
    .local v10, "scaleMatrix":Landroid/graphics/Matrix;
    invoke-virtual {v10, v7, v8, v9, v11}, Landroid/graphics/Matrix;->setScale(FFFF)V

    .line 1752
    new-instance v12, Landroid/graphics/Canvas;

    invoke-direct {v12, v6}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 1753
    .local v12, "canvas":Landroid/graphics/Canvas;
    invoke-virtual {v12, v10}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    .line 1754
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v13

    const/4 v14, 0x2

    div-int/2addr v13, v14

    int-to-float v13, v13

    sub-float v13, v9, v13

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v15

    div-int/2addr v15, v14

    int-to-float v15, v15

    sub-float v15, v11, v15

    move/from16 v16, v0

    .end local v0    # "widthRatio":F
    .local v16, "widthRatio":F
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v14}, Landroid/graphics/Paint;-><init>(I)V

    move-object/from16 v14, p0

    invoke-virtual {v12, v14, v13, v15, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 1755
    return-object v6
.end method


# virtual methods
.method public ClearCanvas(Landroid/graphics/Canvas;)V
    .locals 2
    .param p1, "cvs"    # Landroid/graphics/Canvas;

    .line 333
    const/4 v0, 0x0

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 334
    return-void
.end method

.method public DrawCircle(Landroid/graphics/Canvas;IIIIFFFF)V
    .locals 1
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "posX"    # F
    .param p7, "posY"    # F
    .param p8, "radius"    # F
    .param p9, "stroke"    # F

    .line 555
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mStrokePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p2, p3, p4, p5}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 556
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mStrokePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p9}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 557
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mStrokePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, p6, p7, p8, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 558
    return-void
.end method

.method public DrawCurveRect(Landroid/graphics/Canvas;IIIIFFFFF)V
    .locals 12
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "stroke"    # F
    .param p7, "x"    # F
    .param p8, "y"    # F
    .param p9, "width"    # F
    .param p10, "height"    # F

    .line 351
    move-object v0, p0

    iget-object v1, v0, Lkentos/loader/floating/ESPView;->mStrokePaint:Landroid/graphics/Paint;

    move/from16 v2, p6

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 352
    iget-object v1, v0, Lkentos/loader/floating/ESPView;->mStrokePaint:Landroid/graphics/Paint;

    invoke-static/range {p3 .. p5}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 353
    iget-object v1, v0, Lkentos/loader/floating/ESPView;->mStrokePaint:Landroid/graphics/Paint;

    move v3, p2

    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 354
    const/high16 v9, 0x40a00000    # 5.0f

    const/high16 v10, 0x40a00000    # 5.0f

    iget-object v11, v0, Lkentos/loader/floating/ESPView;->mStrokePaint:Landroid/graphics/Paint;

    move-object v4, p1

    move/from16 v5, p7

    move/from16 v6, p8

    move/from16 v7, p9

    move/from16 v8, p10

    invoke-virtual/range {v4 .. v11}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 355
    return-void
.end method

.method public DrawCustom(Landroid/graphics/Canvas;IIIILjava/lang/String;FFF)V
    .locals 2
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "txt"    # Ljava/lang/String;
    .param p7, "posX"    # F
    .param p8, "posY"    # F
    .param p9, "size"    # F

    .line 413
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mTexturePaint:Landroid/graphics/Paint;

    invoke-static {p3, p4, p5}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 414
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mTexturePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 415
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mTexturePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p9}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 416
    const-string v0, ""

    iget-object v1, p0, Lkentos/loader/floating/ESPView;->mTexturePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, p7, p8, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 417
    return-void
.end method

.method public DrawDeadBoxItems(Landroid/graphics/Canvas;IIIILjava/lang/String;FFF)V
    .locals 3
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "txt"    # Ljava/lang/String;
    .param p7, "posX"    # F
    .param p8, "posY"    # F
    .param p9, "size"    # F

    .line 522
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mLootBoxPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p9}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 523
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mLootBoxPaint:Landroid/graphics/Paint;

    const-string v1, "#FF40CC7E"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 524
    const/high16 v0, 0x42700000    # 60.0f

    sub-float v0, p7, v0

    const/high16 v1, 0x41200000    # 10.0f

    sub-float v1, p8, v1

    iget-object v2, p0, Lkentos/loader/floating/ESPView;->mLootBoxPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, p6, v0, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 525
    return-void
.end method

.method public DrawEnemyCount(Landroid/graphics/Canvas;IIIIII)V
    .locals 14
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "width"    # I
    .param p7, "height"    # I

    .line 392
    move-object v0, p0

    move/from16 v1, p3

    move/from16 v2, p4

    move/from16 v3, p5

    iget-object v4, v0, Lkentos/loader/floating/ESPView;->nearStrokePaint:Landroid/graphics/Paint;

    const/16 v5, 0xff

    invoke-virtual {v4, v5, v1, v2, v3}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 393
    iget-object v4, v0, Lkentos/loader/floating/ESPView;->nearFillPaint:Landroid/graphics/Paint;

    const/16 v5, 0x3c

    invoke-virtual {v4, v5, v1, v2, v3}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 394
    const/16 v4, 0x46

    .line 395
    .local v4, "halfWidth":I
    div-int/lit8 v5, p6, 0x2

    sub-int/2addr v5, v4

    int-to-float v7, v5

    const/high16 v8, 0x42820000    # 65.0f

    div-int/lit8 v5, p6, 0x2

    add-int/2addr v5, v4

    int-to-float v9, v5

    const/high16 v10, 0x43070000    # 135.0f

    const/high16 v11, 0x41500000    # 13.0f

    const/high16 v12, 0x41500000    # 13.0f

    iget-object v13, v0, Lkentos/loader/floating/ESPView;->nearFillPaint:Landroid/graphics/Paint;

    move-object v6, p1

    invoke-virtual/range {v6 .. v13}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 396
    div-int/lit8 v5, p6, 0x2

    sub-int/2addr v5, v4

    int-to-float v7, v5

    div-int/lit8 v5, p6, 0x2

    add-int/2addr v5, v4

    int-to-float v9, v5

    iget-object v13, v0, Lkentos/loader/floating/ESPView;->nearStrokePaint:Landroid/graphics/Paint;

    invoke-virtual/range {v6 .. v13}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 397
    return-void
.end method

.method public DrawEnemyCount(Landroid/graphics/Canvas;IIIIIIII)V
    .locals 4
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "x"    # I
    .param p7, "y"    # I
    .param p8, "width"    # I
    .param p9, "height"    # I

    .line 528
    invoke-static {p3, p4, p5}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    const/4 v1, 0x0

    filled-new-array {v1, v0, v1}, [I

    move-result-object v0

    .line 529
    .local v0, "colors":[I
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    sget-object v3, Landroid/graphics/drawable/GradientDrawable$Orientation;->RIGHT_LEFT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    invoke-direct {v2, v3, v0}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 530
    .local v2, "mDrawable":Landroid/graphics/drawable/GradientDrawable;
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 531
    const/high16 v3, 0x42f00000    # 120.0f

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setGradientRadius(F)V

    .line 532
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3, p6, p7, p8, p9}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 533
    .local v3, "mRect":Landroid/graphics/Rect;
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setBounds(Landroid/graphics/Rect;)V

    .line 534
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 535
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    .line 536
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 537
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 538
    return-void
.end method

.method public DrawFillCircle(Landroid/graphics/Canvas;IIIIFFFF)V
    .locals 1
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "posX"    # F
    .param p7, "posY"    # F
    .param p8, "radius"    # F
    .param p9, "stroke"    # F

    .line 592
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mFilledPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p2, p3, p4, p5}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 593
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mFilledPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p9}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 594
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mFilledPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, p6, p7, p8, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 595
    return-void
.end method

.method public DrawFillRect(Landroid/graphics/Canvas;IIIIIIII)V
    .locals 4
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "x"    # I
    .param p7, "y"    # I
    .param p8, "width"    # I
    .param p9, "height"    # I

    .line 435
    invoke-static {p2, p3, p4, p5}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-static {p2, p3, p4, p5}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-static {p2, p3, p4, p5}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    filled-new-array {v0, v1, v2}, [I

    move-result-object v0

    .line 436
    .local v0, "colors":[I
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    sget-object v2, Landroid/graphics/drawable/GradientDrawable$Orientation;->RIGHT_LEFT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    invoke-direct {v1, v2, v0}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 437
    .local v1, "mDrawable":Landroid/graphics/drawable/GradientDrawable;
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 438
    const/high16 v3, 0x40c00000    # 6.0f

    invoke-virtual {v1, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 439
    const/high16 v3, 0x42f00000    # 120.0f

    invoke-virtual {v1, v3}, Landroid/graphics/drawable/GradientDrawable;->setGradientRadius(F)V

    .line 440
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3, p6, p7, p8, p9}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 441
    .local v3, "mRect":Landroid/graphics/Rect;
    invoke-virtual {v1, v3}, Landroid/graphics/drawable/GradientDrawable;->setBounds(Landroid/graphics/Rect;)V

    .line 442
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 443
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    .line 444
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 445
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 446
    return-void
.end method

.method public DrawFilledCircle(Landroid/graphics/Canvas;IIIIFFF)V
    .locals 2
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "posX"    # F
    .param p7, "posY"    # F
    .param p8, "radius"    # F

    .line 586
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mFilledPaint:Landroid/graphics/Paint;

    invoke-static {p3, p4, p5}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 587
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mFilledPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 588
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mFilledPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, p6, p7, p8, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 589
    return-void
.end method

.method public DrawFilledCurve(Landroid/graphics/Canvas;IIIIIIII)V
    .locals 4
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "x"    # I
    .param p7, "y"    # I
    .param p8, "width"    # I
    .param p9, "height"    # I

    .line 422
    invoke-static {p3, p4, p5}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    const/4 v1, 0x0

    filled-new-array {v1, v0, v1}, [I

    move-result-object v0

    .line 423
    .local v0, "colors":[I
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    sget-object v3, Landroid/graphics/drawable/GradientDrawable$Orientation;->RIGHT_LEFT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    invoke-direct {v2, v3, v0}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 424
    .local v2, "mDrawable":Landroid/graphics/drawable/GradientDrawable;
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 425
    const/high16 v3, 0x42f00000    # 120.0f

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setGradientRadius(F)V

    .line 426
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3, p6, p7, p8, p9}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 427
    .local v3, "mRect":Landroid/graphics/Rect;
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setBounds(Landroid/graphics/Rect;)V

    .line 428
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 429
    invoke-virtual {v2, v1}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    .line 430
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/GradientDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 431
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 432
    return-void
.end method

.method public DrawFilledRect(Landroid/graphics/Canvas;IIIIFFFF)V
    .locals 11
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "x"    # F
    .param p7, "y"    # F
    .param p8, "width"    # F
    .param p9, "height"    # F

    .line 365
    move-object v0, p0

    iget-object v1, v0, Lkentos/loader/floating/ESPView;->mFillPaint:Landroid/graphics/Paint;

    invoke-static/range {p3 .. p5}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 366
    iget-object v1, v0, Lkentos/loader/floating/ESPView;->mFillPaint:Landroid/graphics/Paint;

    move v2, p2

    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 367
    const/high16 v8, 0x40a00000    # 5.0f

    const/high16 v9, 0x40a00000    # 5.0f

    iget-object v10, v0, Lkentos/loader/floating/ESPView;->mFillPaint:Landroid/graphics/Paint;

    move-object v3, p1

    move/from16 v4, p6

    move/from16 v5, p7

    move/from16 v6, p8

    move/from16 v7, p9

    invoke-virtual/range {v3 .. v10}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 368
    return-void
.end method

.method public DrawFilledRect2(Landroid/graphics/Canvas;IIIIFFFF)V
    .locals 9
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "x"    # F
    .param p7, "y"    # F
    .param p8, "width"    # F
    .param p9, "height"    # F

    .line 358
    move-object v0, p0

    iget-object v1, v0, Lkentos/loader/floating/ESPView;->mFillPaint:Landroid/graphics/Paint;

    invoke-static {p3, p4, p5}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 359
    iget-object v1, v0, Lkentos/loader/floating/ESPView;->mFillPaint:Landroid/graphics/Paint;

    move v2, p2

    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 360
    iget-object v8, v0, Lkentos/loader/floating/ESPView;->mFillPaint:Landroid/graphics/Paint;

    move-object v3, p1

    move v4, p6

    move/from16 v5, p7

    move/from16 v6, p8

    move/from16 v7, p9

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 361
    return-void
.end method

.method public DrawFilledRoundRect(Landroid/graphics/Canvas;IIIIFFFF)V
    .locals 11
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "x"    # F
    .param p7, "y"    # F
    .param p8, "width"    # F
    .param p9, "height"    # F

    .line 371
    move-object v0, p0

    iget-object v1, v0, Lkentos/loader/floating/ESPView;->mFillPaint:Landroid/graphics/Paint;

    invoke-static/range {p3 .. p5}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 372
    iget-object v1, v0, Lkentos/loader/floating/ESPView;->mFillPaint:Landroid/graphics/Paint;

    move v2, p2

    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 373
    const/high16 v8, 0x41200000    # 10.0f

    const/high16 v9, 0x41200000    # 10.0f

    iget-object v10, v0, Lkentos/loader/floating/ESPView;->mFillPaint:Landroid/graphics/Paint;

    move-object v3, p1

    move/from16 v4, p6

    move/from16 v5, p7

    move/from16 v6, p8

    move/from16 v7, p9

    invoke-virtual/range {v3 .. v10}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 374
    return-void
.end method

.method public DrawFilledTriangle(Landroid/graphics/Canvas;IIIIFFF)V
    .locals 13
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "posX"    # F
    .param p7, "posY"    # F
    .param p8, "size"    # F

    .line 561
    move-object v0, p0

    iget-object v1, v0, Lkentos/loader/floating/ESPView;->mFilledPaint:Landroid/graphics/Paint;

    invoke-static/range {p3 .. p5}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 562
    iget-object v1, v0, Lkentos/loader/floating/ESPView;->mFilledPaint:Landroid/graphics/Paint;

    move v2, p2

    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 564
    const/high16 v1, 0x40000000    # 2.0f

    div-float v3, p8, v1

    .line 565
    .local v3, "halfSize":F
    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    float-to-double v6, v3

    mul-double/2addr v4, v6

    double-to-float v4, v4

    .line 567
    .local v4, "height":F
    move/from16 v5, p6

    .line 568
    .local v5, "x1":F
    div-float v6, v4, v1

    sub-float v6, p7, v6

    .line 570
    .local v6, "y1":F
    sub-float v7, p6, v3

    .line 571
    .local v7, "x2":F
    div-float v8, v4, v1

    add-float v8, p7, v8

    .line 573
    .local v8, "y2":F
    add-float v9, p6, v3

    .line 574
    .local v9, "x3":F
    div-float v1, v4, v1

    add-float v1, p7, v1

    .line 576
    .local v1, "y3":F
    new-instance v10, Landroid/graphics/Path;

    invoke-direct {v10}, Landroid/graphics/Path;-><init>()V

    .line 577
    .local v10, "path":Landroid/graphics/Path;
    invoke-virtual {v10, v5, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 578
    invoke-virtual {v10, v7, v8}, Landroid/graphics/Path;->lineTo(FF)V

    .line 579
    invoke-virtual {v10, v9, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 580
    invoke-virtual {v10}, Landroid/graphics/Path;->close()V

    .line 582
    iget-object v11, v0, Lkentos/loader/floating/ESPView;->mFilledPaint:Landroid/graphics/Paint;

    move-object v12, p1

    invoke-virtual {p1, v10, v11}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 583
    return-void
.end method

.method public DrawItems(Landroid/graphics/Canvas;Ljava/lang/String;FFFF)V
    .locals 6
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "itemName"    # Ljava/lang/String;
    .param p3, "distance"    # F
    .param p4, "posX"    # F
    .param p5, "posY"    # F
    .param p6, "size"    # F

    .line 480
    invoke-direct {p0, p2}, Lkentos/loader/floating/ESPView;->getItemName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 481
    .local v0, "realItemName":Ljava/lang/String;
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    .line 482
    const-string v1, "LootBox"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/high16 v2, 0x43160000    # 150.0f

    cmpl-float v2, p3, v2

    if-ltz v2, :cond_0

    .line 483
    return-void

    .line 487
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "Airdrop"

    if-nez v2, :cond_2

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 490
    :cond_1
    const/4 v2, -0x1

    .local v2, "itemColor":I
    goto :goto_1

    .line 488
    .end local v2    # "itemColor":I
    :cond_2
    :goto_0
    const-string v2, "#FFFFBE28"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    .line 493
    .restart local v2    # "itemColor":I
    :goto_1
    iget-object v4, p0, Lkentos/loader/floating/ESPView;->mItemsPaint:Landroid/graphics/Paint;

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 494
    iget-object v4, p0, Lkentos/loader/floating/ESPView;->mTextPainti:Landroid/graphics/Paint;

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 496
    iget-object v4, p0, Lkentos/loader/floating/ESPView;->mItemsPaint:Landroid/graphics/Paint;

    invoke-virtual {v4, p6}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 497
    iget-object v4, p0, Lkentos/loader/floating/ESPView;->mTextPainti:Landroid/graphics/Paint;

    invoke-virtual {v4, p6}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 498
    iget-object v4, p0, Lkentos/loader/floating/ESPView;->mItemsPaint:Landroid/graphics/Paint;

    sget-object v5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 500
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " ("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    float-to-int v5, p3

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "m)"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 502
    .local v4, "displayText":Ljava/lang/String;
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_2

    .line 505
    :cond_3
    iget-object v1, p0, Lkentos/loader/floating/ESPView;->mTextPainti:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, p4, p5, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_3

    .line 503
    :cond_4
    :goto_2
    const/high16 v1, 0x41000000    # 8.0f

    sub-float v1, p5, v1

    iget-object v3, p0, Lkentos/loader/floating/ESPView;->mItemsPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, p4, v1, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 508
    .end local v2    # "itemColor":I
    .end local v4    # "displayText":Ljava/lang/String;
    :cond_5
    :goto_3
    return-void
.end method

.method public DrawLine(Landroid/graphics/Canvas;IIIIFFFFF)V
    .locals 10
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "lineWidth"    # F
    .param p7, "fromX"    # F
    .param p8, "fromY"    # F
    .param p9, "toX"    # F
    .param p10, "toY"    # F

    .line 337
    move-object v0, p0

    iget-object v1, v0, Lkentos/loader/floating/ESPView;->mStrokePaint:Landroid/graphics/Paint;

    invoke-static {p3, p4, p5}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 338
    iget-object v1, v0, Lkentos/loader/floating/ESPView;->mStrokePaint:Landroid/graphics/Paint;

    move v2, p2

    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 339
    iget-object v1, v0, Lkentos/loader/floating/ESPView;->mStrokePaint:Landroid/graphics/Paint;

    move/from16 v3, p6

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 340
    iget-object v9, v0, Lkentos/loader/floating/ESPView;->mStrokePaint:Landroid/graphics/Paint;

    move-object v4, p1

    move/from16 v5, p7

    move/from16 v6, p8

    move/from16 v7, p9

    move/from16 v8, p10

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 341
    return-void
.end method

.method public DrawName(Landroid/graphics/Canvas;IIIILjava/lang/String;IFFF)V
    .locals 16
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "nametxt"    # Ljava/lang/String;
    .param p7, "teamid"    # I
    .param p8, "posX"    # F
    .param p9, "posY"    # F
    .param p10, "size"    # F

    .line 726
    move-object/from16 v0, p0

    const-string v1, ":"

    move-object/from16 v2, p6

    invoke-virtual {v2, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 727
    .local v1, "namesp":[Ljava/lang/String;
    array-length v3, v1

    new-array v3, v3, [C

    .line 728
    .local v3, "nameint":[C
    const/4 v4, 0x0

    .local v4, "i":I
    :goto_0
    array-length v5, v1

    if-ge v4, v5, :cond_0

    .line 729
    aget-object v5, v1, v4

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    int-to-char v5, v5

    aput-char v5, v3, v4

    .line 728
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 730
    .end local v4    # "i":I
    :cond_0
    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v3}, Ljava/lang/String;-><init>([C)V

    .line 731
    .local v4, "realname":Ljava/lang/String;
    iget-object v5, v0, Lkentos/loader/floating/ESPView;->mTextPaint:Landroid/graphics/Paint;

    move/from16 v6, p2

    move/from16 v7, p3

    move/from16 v8, p4

    move/from16 v9, p5

    invoke-virtual {v5, v6, v7, v8, v9}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 732
    iget-object v5, v0, Lkentos/loader/floating/ESPView;->mTextPaint:Landroid/graphics/Paint;

    move/from16 v10, p10

    invoke-virtual {v5, v10}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 733
    iget-object v5, v0, Lkentos/loader/floating/ESPView;->mTextPaint:Landroid/graphics/Paint;

    const/high16 v11, 0x40400000    # 3.0f

    const/high16 v12, -0x1000000

    const/high16 v13, 0x40000000    # 2.0f

    invoke-virtual {v5, v11, v13, v13, v12}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 734
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v11, "("

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    move/from16 v11, p7

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v12, ")"

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object v12, v0, Lkentos/loader/floating/ESPView;->mTextPaint:Landroid/graphics/Paint;

    move-object/from16 v13, p1

    move/from16 v14, p8

    move/from16 v15, p9

    invoke-virtual {v13, v5, v14, v15, v12}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 735
    return-void
.end method

.method public DrawName1(Landroid/graphics/Canvas;IIIILjava/lang/String;IFFF)V
    .locals 15
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "nametxt"    # Ljava/lang/String;
    .param p7, "teamid"    # I
    .param p8, "posX"    # F
    .param p9, "posY"    # F
    .param p10, "size"    # F

    .line 651
    move-object v0, p0

    const-string v1, ":"

    move-object/from16 v2, p6

    invoke-virtual {v2, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 652
    .local v1, "namesp":[Ljava/lang/String;
    array-length v3, v1

    new-array v3, v3, [C

    .line 653
    .local v3, "nameint":[C
    const/4 v4, 0x0

    .local v4, "i":I
    :goto_0
    array-length v5, v1

    if-ge v4, v5, :cond_0

    .line 654
    aget-object v5, v1, v4

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    int-to-char v5, v5

    aput-char v5, v3, v4

    .line 653
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 655
    .end local v4    # "i":I
    :cond_0
    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v3}, Ljava/lang/String;-><init>([C)V

    .line 656
    .local v4, "realname":Ljava/lang/String;
    iget-object v5, v0, Lkentos/loader/floating/ESPView;->mNamePaint:Landroid/graphics/Paint;

    move/from16 v6, p2

    move/from16 v7, p3

    move/from16 v8, p4

    move/from16 v9, p5

    invoke-virtual {v5, v6, v7, v8, v9}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 657
    iget-object v5, v0, Lkentos/loader/floating/ESPView;->mNamePaint:Landroid/graphics/Paint;

    move/from16 v10, p10

    invoke-virtual {v5, v10}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 658
    iget-object v5, v0, Lkentos/loader/floating/ESPView;->mNamePaint:Landroid/graphics/Paint;

    const/high16 v11, 0x41000000    # 8.0f

    const/high16 v12, -0x1000000

    const/high16 v13, 0x3fc00000    # 1.5f

    invoke-virtual {v5, v11, v13, v13, v12}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 660
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "   "

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object v11, v0, Lkentos/loader/floating/ESPView;->mNamePaint:Landroid/graphics/Paint;

    move-object/from16 v12, p1

    move/from16 v13, p8

    move/from16 v14, p9

    invoke-virtual {v12, v5, v13, v14, v11}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 661
    return-void
.end method

.method public DrawName2(Landroid/graphics/Canvas;IIIILjava/lang/String;IFFF)V
    .locals 16
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "nametxt"    # Ljava/lang/String;
    .param p7, "teamid"    # I
    .param p8, "posX"    # F
    .param p9, "posY"    # F
    .param p10, "size"    # F

    .line 693
    move-object/from16 v0, p0

    const-string v1, ":"

    move-object/from16 v2, p6

    invoke-virtual {v2, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 694
    .local v1, "namesp":[Ljava/lang/String;
    array-length v3, v1

    new-array v3, v3, [C

    .line 695
    .local v3, "nameint":[C
    const/4 v4, 0x0

    .local v4, "i":I
    :goto_0
    array-length v5, v1

    if-ge v4, v5, :cond_0

    .line 696
    aget-object v5, v1, v4

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    int-to-char v5, v5

    aput-char v5, v3, v4

    .line 695
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 697
    .end local v4    # "i":I
    :cond_0
    const-string v4, ""

    .line 698
    .local v4, "str":Ljava/lang/String;
    new-instance v5, Ljava/lang/String;

    invoke-direct {v5, v3}, Ljava/lang/String;-><init>([C)V

    .line 699
    .local v5, "realname":Ljava/lang/String;
    iget-object v6, v0, Lkentos/loader/floating/ESPView;->mTextPaint:Landroid/graphics/Paint;

    move/from16 v7, p2

    move/from16 v8, p3

    move/from16 v9, p4

    move/from16 v10, p5

    invoke-virtual {v6, v7, v8, v9, v10}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 700
    iget-object v6, v0, Lkentos/loader/floating/ESPView;->mTextPaint:Landroid/graphics/Paint;

    move/from16 v11, p10

    invoke-virtual {v6, v11}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 701
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v12, ""

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-direct {v0, v5}, Lkentos/loader/floating/ESPView;->Nation(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/high16 v12, 0x42a00000    # 80.0f

    sub-float v12, p8, v12

    const/high16 v13, 0x41f00000    # 30.0f

    sub-float v13, p9, v13

    iget-object v14, v0, Lkentos/loader/floating/ESPView;->mTextPaint:Landroid/graphics/Paint;

    move-object/from16 v15, p1

    invoke-virtual {v15, v6, v12, v13, v14}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 702
    return-void
.end method

.method public DrawNation(Landroid/graphics/Canvas;IIIILjava/lang/String;IFFF)V
    .locals 15
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "nametxt"    # Ljava/lang/String;
    .param p7, "flag"    # I
    .param p8, "posX"    # F
    .param p9, "posY"    # F
    .param p10, "size"    # F

    .line 750
    move-object v0, p0

    move-object/from16 v1, p1

    const-string v2, ":"

    move-object/from16 v3, p6

    invoke-virtual {v3, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 751
    .local v2, "namesp":[Ljava/lang/String;
    array-length v4, v2

    new-array v4, v4, [C

    .line 752
    .local v4, "nameint":[C
    const/4 v5, 0x0

    .local v5, "i":I
    :goto_0
    array-length v6, v2

    if-ge v5, v6, :cond_0

    .line 753
    aget-object v6, v2, v5

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    int-to-char v6, v6

    aput-char v6, v4, v5

    .line 752
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 754
    .end local v5    # "i":I
    :cond_0
    new-instance v5, Ljava/lang/String;

    invoke-direct {v5, v4}, Ljava/lang/String;-><init>([C)V

    .line 755
    .local v5, "realname":Ljava/lang/String;
    iget-object v6, v0, Lkentos/loader/floating/ESPView;->mTextPaint:Landroid/graphics/Paint;

    move/from16 v7, p2

    move/from16 v8, p3

    move/from16 v9, p4

    move/from16 v10, p5

    invoke-virtual {v6, v7, v8, v9, v10}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 756
    iget-object v6, v0, Lkentos/loader/floating/ESPView;->mTextPaint:Landroid/graphics/Paint;

    move/from16 v11, p10

    invoke-virtual {v6, v11}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 757
    const/high16 v6, 0x42aa0000    # 85.0f

    add-float v6, p8, v6

    const/4 v12, 0x0

    sub-float v12, p9, v12

    iget-object v13, v0, Lkentos/loader/floating/ESPView;->mTextPaint:Landroid/graphics/Paint;

    const-string v14, ""

    invoke-virtual {v1, v14, v6, v12, v13}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 758
    invoke-direct {p0, v5}, Lkentos/loader/floating/ESPView;->Nation(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/high16 v12, 0x42920000    # 73.0f

    add-float v12, p8, v12

    const/high16 v13, 0x42440000    # 49.0f

    sub-float v13, p9, v13

    iget-object v14, v0, Lkentos/loader/floating/ESPView;->mTextPaint:Landroid/graphics/Paint;

    invoke-virtual {v1, v6, v12, v13, v14}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 759
    return-void
.end method

.method public DrawOTH(Landroid/graphics/Canvas;IFF)V
    .locals 2
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "image_number"    # I
    .param p3, "X"    # F
    .param p4, "Y"    # F

    .line 476
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->OTHER:[Landroid/graphics/Bitmap;

    aget-object v0, v0, p2

    iget-object v1, p0, Lkentos/loader/floating/ESPView;->p:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, p3, p4, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 477
    return-void
.end method

.method public DrawOTH2(Landroid/graphics/Canvas;IFF)V
    .locals 2
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "image_number"    # I
    .param p3, "X"    # F
    .param p4, "Y"    # F

    .line 630
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->OTHER:[Landroid/graphics/Bitmap;

    aget-object v0, v0, p2

    iget-object v1, p0, Lkentos/loader/floating/ESPView;->p:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, p3, p4, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 631
    return-void
.end method

.method public DrawPlayerID(Landroid/graphics/Canvas;IIIILjava/lang/String;IFFF)V
    .locals 11
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "nametxt"    # Ljava/lang/String;
    .param p7, "teamid"    # I
    .param p8, "posX"    # F
    .param p9, "posY"    # F
    .param p10, "size"    # F

    .line 640
    move-object v0, p0

    const-string v1, ":"

    move-object/from16 v2, p6

    invoke-virtual {v2, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 641
    .local v1, "namesp":[Ljava/lang/String;
    array-length v3, v1

    new-array v3, v3, [C

    .line 642
    .local v3, "nameint":[C
    const/4 v4, 0x0

    .local v4, "i":I
    :goto_0
    array-length v5, v1

    if-ge v4, v5, :cond_0

    .line 643
    aget-object v5, v1, v4

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    int-to-char v5, v5

    aput-char v5, v3, v4

    .line 642
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 644
    .end local v4    # "i":I
    :cond_0
    iget-object v4, v0, Lkentos/loader/floating/ESPView;->mNamePaint:Landroid/graphics/Paint;

    invoke-static/range {p3 .. p5}, Landroid/graphics/Color;->rgb(III)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 645
    iget-object v4, v0, Lkentos/loader/floating/ESPView;->mNamePaint:Landroid/graphics/Paint;

    move/from16 v5, p10

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 646
    iget-object v4, v0, Lkentos/loader/floating/ESPView;->mNamePaint:Landroid/graphics/Paint;

    const/high16 v6, 0x41000000    # 8.0f

    const/high16 v7, -0x1000000

    const/high16 v8, 0x3fc00000    # 1.5f

    invoke-virtual {v4, v6, v8, v8, v7}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 647
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v6, p7

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v7, ""

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v7, v0, Lkentos/loader/floating/ESPView;->mNamePaint:Landroid/graphics/Paint;

    move-object v8, p1

    move/from16 v9, p8

    move/from16 v10, p9

    invoke-virtual {p1, v4, v9, v10, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 648
    return-void
.end method

.method public DrawPlayerName(Landroid/graphics/Canvas;IIIILjava/lang/String;FFF)V
    .locals 5
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "nametxt"    # Ljava/lang/String;
    .param p7, "posX"    # F
    .param p8, "posY"    # F
    .param p9, "size"    # F

    .line 461
    const-string v0, ":"

    invoke-virtual {p6, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 462
    .local v0, "namesp":[Ljava/lang/String;
    array-length v1, v0

    new-array v1, v1, [C

    .line 463
    .local v1, "nameint":[C
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_0

    .line 464
    aget-object v3, v0, v2

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    int-to-char v3, v3

    aput-char v3, v1, v2

    .line 463
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 465
    .end local v2    # "i":I
    :cond_0
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v1}, Ljava/lang/String;-><init>([C)V

    .line 466
    .local v2, "realname":Ljava/lang/String;
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x5

    if-le v3, v4, :cond_1

    .line 467
    const/4 v3, 0x0

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 469
    :cond_1
    iget-object v3, p0, Lkentos/loader/floating/ESPView;->mNamePaint:Landroid/graphics/Paint;

    invoke-virtual {v3, p2, p3, p4, p5}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 470
    iget-object v3, p0, Lkentos/loader/floating/ESPView;->mNamePaint:Landroid/graphics/Paint;

    invoke-virtual {v3, p9}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 471
    iget-object v3, p0, Lkentos/loader/floating/ESPView;->mNamePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, p7, p8, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 472
    return-void
.end method

.method public DrawRect(Landroid/graphics/Canvas;IIIIFFFFF)V
    .locals 12
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "stroke"    # F
    .param p7, "x"    # F
    .param p8, "y"    # F
    .param p9, "width"    # F
    .param p10, "height"    # F

    .line 344
    move-object v0, p0

    iget-object v1, v0, Lkentos/loader/floating/ESPView;->mStrokePaint:Landroid/graphics/Paint;

    move/from16 v2, p6

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 345
    iget-object v1, v0, Lkentos/loader/floating/ESPView;->mStrokePaint:Landroid/graphics/Paint;

    invoke-static/range {p3 .. p5}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 346
    iget-object v1, v0, Lkentos/loader/floating/ESPView;->mStrokePaint:Landroid/graphics/Paint;

    move v3, p2

    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 347
    const/high16 v9, 0x40a00000    # 5.0f

    const/high16 v10, 0x40a00000    # 5.0f

    iget-object v11, v0, Lkentos/loader/floating/ESPView;->mStrokePaint:Landroid/graphics/Paint;

    move-object v4, p1

    move/from16 v5, p7

    move/from16 v6, p8

    move/from16 v7, p9

    move/from16 v8, p10

    invoke-virtual/range {v4 .. v11}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 348
    return-void
.end method

.method public DrawTeamID(Landroid/graphics/Canvas;IIIIIFFF)V
    .locals 2
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "teamid"    # I
    .param p7, "posX"    # F
    .param p8, "posY"    # F
    .param p9, "size"    # F

    .line 449
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mNamePaint:Landroid/graphics/Paint;

    invoke-static {p3, p4, p5}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 450
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mNamePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p9}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 451
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkentos/loader/floating/ESPView;->mNamePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, p7, p8, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 452
    return-void
.end method

.method public DrawText(Landroid/graphics/Canvas;IIIILjava/lang/String;FFF)V
    .locals 2
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "txt"    # Ljava/lang/String;
    .param p7, "posX"    # F
    .param p8, "posY"    # F
    .param p9, "size"    # F

    .line 705
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mTextPaint:Landroid/graphics/Paint;

    invoke-static {p3, p4, p5}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 706
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mTextPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 708
    invoke-virtual {p0}, Lkentos/loader/floating/ESPView;->getRight()I

    move-result v0

    const/16 v1, 0x780

    if-gt v0, v1, :cond_3

    invoke-virtual {p0}, Lkentos/loader/floating/ESPView;->getBottom()I

    move-result v0

    if-le v0, v1, :cond_0

    goto :goto_1

    .line 710
    :cond_0
    invoke-virtual {p0}, Lkentos/loader/floating/ESPView;->getRight()I

    move-result v0

    if-eq v0, v1, :cond_2

    invoke-virtual {p0}, Lkentos/loader/floating/ESPView;->getBottom()I

    move-result v0

    if-ne v0, v1, :cond_1

    goto :goto_0

    .line 713
    :cond_1
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mTextPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p9}, Landroid/graphics/Paint;->setTextSize(F)V

    goto :goto_2

    .line 711
    :cond_2
    :goto_0
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mTextPaint:Landroid/graphics/Paint;

    const/high16 v1, 0x40000000    # 2.0f

    add-float/2addr v1, p9

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    goto :goto_2

    .line 709
    :cond_3
    :goto_1
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mTextPaint:Landroid/graphics/Paint;

    const/high16 v1, 0x40800000    # 4.0f

    add-float/2addr v1, p9

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 715
    :goto_2
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mTextPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, p6, p7, p8, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 716
    return-void
.end method

.method public DrawTextBold(Landroid/graphics/Canvas;IIIILjava/lang/String;FFF)V
    .locals 1
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "txt"    # Ljava/lang/String;
    .param p7, "posX"    # F
    .param p8, "posY"    # F
    .param p9, "size"    # F

    .line 455
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->PaintTextBold:Landroid/graphics/Paint;

    invoke-virtual {v0, p2, p3, p4, p5}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 456
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->PaintTextBold:Landroid/graphics/Paint;

    invoke-virtual {v0, p9}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 457
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->PaintTextBold:Landroid/graphics/Paint;

    invoke-virtual {p1, p6, p7, p8, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 458
    return-void
.end method

.method public DrawTextBot(Landroid/graphics/Canvas;IIIILjava/lang/String;FFF)V
    .locals 2
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "txt"    # Ljava/lang/String;
    .param p7, "posX"    # F
    .param p8, "posY"    # F
    .param p9, "size"    # F

    .line 634
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mNamePaint:Landroid/graphics/Paint;

    invoke-static {p3, p4, p5}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 635
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mNamePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 636
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mNamePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, p6, p7, p8, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 637
    return-void
.end method

.method public DrawTextMode2(Landroid/graphics/Canvas;IIIILjava/lang/String;FFF)V
    .locals 2
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "txt"    # Ljava/lang/String;
    .param p7, "posX"    # F
    .param p8, "posY"    # F
    .param p9, "size"    # F

    .line 400
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mFPSText:Landroid/graphics/Paint;

    invoke-virtual {v0, p2, p3, p4, p5}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 401
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mFPSText:Landroid/graphics/Paint;

    invoke-virtual {v0, p9}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 402
    const-string v0, ""

    iget-object v1, p0, Lkentos/loader/floating/ESPView;->mFPSText:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, p7, p8, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 403
    return-void
.end method

.method public DrawTextName(Landroid/graphics/Canvas;IIIILjava/lang/String;FFF)V
    .locals 4
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "txt"    # Ljava/lang/String;
    .param p7, "posX"    # F
    .param p8, "posY"    # F
    .param p9, "size"    # F

    .line 377
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mFPSText:Landroid/graphics/Paint;

    invoke-virtual {v0, p2, p3, p4, p5}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 378
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mFPSText:Landroid/graphics/Paint;

    invoke-virtual {v0, p9}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 379
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lkentos/loader/floating/ESPView;->mFPSTime:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 380
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lkentos/loader/floating/ESPView;->mFPSTime:J

    .line 381
    iget v0, p0, Lkentos/loader/floating/ESPView;->mFPSCounter:F

    iput v0, p0, Lkentos/loader/floating/ESPView;->mFPS:F

    .line 382
    const/4 v0, 0x0

    iput v0, p0, Lkentos/loader/floating/ESPView;->mFPSCounter:F

    goto :goto_0

    .line 384
    :cond_0
    iget v0, p0, Lkentos/loader/floating/ESPView;->mFPSCounter:F

    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr v0, v1

    iput v0, p0, Lkentos/loader/floating/ESPView;->mFPSCounter:F

    .line 387
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lkentos/loader/floating/ESPView;->mFPS:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 388
    .local v0, "fpsText":Ljava/lang/String;
    iget-object v1, p0, Lkentos/loader/floating/ESPView;->mFPSText:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, p7, p8, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 389
    return-void
.end method

.method public DrawTexti(Landroid/graphics/Canvas;IIIILjava/lang/String;FFF)V
    .locals 1
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "txt"    # Ljava/lang/String;
    .param p7, "posX"    # F
    .param p8, "posY"    # F
    .param p9, "size"    # F

    .line 719
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mTextPainti:Landroid/graphics/Paint;

    invoke-virtual {v0, p2, p3, p4, p5}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 720
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mTextPainti:Landroid/graphics/Paint;

    invoke-virtual {v0, p9}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 721
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mTextPainti:Landroid/graphics/Paint;

    invoke-virtual {p1, p6, p7, p8, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 722
    return-void
.end method

.method public DrawTexture(Landroid/graphics/Canvas;IIIILjava/lang/String;FFF)V
    .locals 2
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "txt"    # Ljava/lang/String;
    .param p7, "posX"    # F
    .param p8, "posY"    # F
    .param p9, "size"    # F

    .line 406
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mMDText:Landroid/graphics/Paint;

    invoke-static {p3, p4, p5}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 407
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mMDText:Landroid/graphics/Paint;

    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 408
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mMDText:Landroid/graphics/Paint;

    invoke-virtual {v0, p9}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 409
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mMDText:Landroid/graphics/Paint;

    invoke-virtual {p1, p6, p7, p8, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 410
    return-void
.end method

.method public DrawTriangle(Landroid/graphics/Canvas;IIIIFFFFFFF)V
    .locals 3
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "posX1"    # F
    .param p7, "posY1"    # F
    .param p8, "posX2"    # F
    .param p9, "posY2"    # F
    .param p10, "posX3"    # F
    .param p11, "posY3"    # F
    .param p12, "stroke"    # F

    .line 664
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 665
    .local v0, "path":Landroid/graphics/Path;
    invoke-virtual {v0, p6, p7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 666
    invoke-virtual {v0, p8, p9}, Landroid/graphics/Path;->lineTo(FF)V

    .line 667
    invoke-virtual {v0, p10, p11}, Landroid/graphics/Path;->lineTo(FF)V

    .line 668
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 670
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 671
    .local v1, "paint":Landroid/graphics/Paint;
    invoke-virtual {v1, p2, p3, p4, p5}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 672
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 673
    invoke-virtual {v1, p12}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 675
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 676
    return-void
.end method

.method public DrawTriangleFilled(Landroid/graphics/Canvas;IIIIFFFFFF)V
    .locals 3
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "posX1"    # F
    .param p7, "posY1"    # F
    .param p8, "posX2"    # F
    .param p9, "posY2"    # F
    .param p10, "posX3"    # F
    .param p11, "posY3"    # F

    .line 679
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 680
    .local v0, "path":Landroid/graphics/Path;
    invoke-virtual {v0, p6, p7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 681
    invoke-virtual {v0, p8, p9}, Landroid/graphics/Path;->lineTo(FF)V

    .line 682
    invoke-virtual {v0, p10, p11}, Landroid/graphics/Path;->lineTo(FF)V

    .line 683
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 685
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 686
    .local v1, "paint":Landroid/graphics/Paint;
    invoke-virtual {v1, p2, p3, p4, p5}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 687
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 689
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 690
    return-void
.end method

.method public DrawUserID(Landroid/graphics/Canvas;IIIILjava/lang/String;FFF)V
    .locals 5
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "nametxt"    # Ljava/lang/String;
    .param p7, "posX"    # F
    .param p8, "posY"    # F
    .param p9, "size"    # F

    .line 738
    const-string v0, ":"

    invoke-virtual {p6, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 739
    .local v0, "namesp":[Ljava/lang/String;
    array-length v1, v0

    new-array v1, v1, [C

    .line 740
    .local v1, "nameint":[C
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_0

    .line 741
    aget-object v3, v0, v2

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    int-to-char v3, v3

    aput-char v3, v1, v2

    .line 740
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 742
    .end local v2    # "i":I
    :cond_0
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v1}, Ljava/lang/String;-><init>([C)V

    .line 743
    .local v2, "realname":Ljava/lang/String;
    iget-object v3, p0, Lkentos/loader/floating/ESPView;->mTextPaint:Landroid/graphics/Paint;

    invoke-virtual {v3, p2, p3, p4, p5}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 744
    iget-object v3, p0, Lkentos/loader/floating/ESPView;->mTextPaint:Landroid/graphics/Paint;

    invoke-virtual {v3, p9}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 745
    iget-object v3, p0, Lkentos/loader/floating/ESPView;->mTextPaint:Landroid/graphics/Paint;

    const-string v4, "#FFFFFF"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 746
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ID: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lkentos/loader/floating/ESPView;->mTextPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v3, p7, p8, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 747
    return-void
.end method

.method public DrawVehicles(Landroid/graphics/Canvas;Ljava/lang/String;FFFFFF)V
    .locals 4
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "VehicleName"    # Ljava/lang/String;
    .param p3, "distance"    # F
    .param p4, "health"    # F
    .param p5, "fuel"    # F
    .param p6, "posX"    # F
    .param p7, "posY"    # F
    .param p8, "size"    # F

    .line 511
    invoke-direct {p0, p2}, Lkentos/loader/floating/ESPView;->VehicleName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 512
    .local v0, "realVehicleName":Ljava/lang/String;
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 513
    iget-object v1, p0, Lkentos/loader/floating/ESPView;->mVehiclesPaint:Landroid/graphics/Paint;

    invoke-virtual {v1, p8}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 514
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    float-to-int v2, p3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "m)"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 515
    .local v1, "displayText":Ljava/lang/String;
    iget-object v2, p0, Lkentos/loader/floating/ESPView;->mVehiclesPaint:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 516
    iget-object v2, p0, Lkentos/loader/floating/ESPView;->mVehiclesPaint:Landroid/graphics/Paint;

    const-string v3, "#FFFFBE28"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 517
    iget-object v2, p0, Lkentos/loader/floating/ESPView;->mVehiclesPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, p6, p7, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 519
    .end local v1    # "displayText":Ljava/lang/String;
    :cond_0
    return-void
.end method

.method public DrawWeapon(Landroid/graphics/Canvas;IIIIIIIFFF)V
    .locals 3
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "a"    # I
    .param p3, "r"    # I
    .param p4, "g"    # I
    .param p5, "b"    # I
    .param p6, "id"    # I
    .param p7, "ammo"    # I
    .param p8, "ammo2"    # I
    .param p9, "posX"    # F
    .param p10, "posY"    # F
    .param p11, "size"    # F

    .line 598
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mNamePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p2, p3, p4, p5}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 599
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mNamePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p11}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 601
    invoke-direct {p0, p6}, Lkentos/loader/floating/ESPView;->getWeapon(I)Ljava/lang/String;

    move-result-object v0

    .line 602
    .local v0, "wname":Ljava/lang/String;
    if-eqz v0, :cond_2

    .line 603
    const-string v1, "Sickle"

    if-eq v0, v1, :cond_1

    const-string v1, "Machete"

    if-eq v0, v1, :cond_1

    const-string v1, "Crowbar"

    if-eq v0, v1, :cond_1

    const-string v1, "Pan"

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 606
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lkentos/loader/floating/ESPView;->mNamePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, p9, p10, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 604
    :cond_1
    :goto_0
    iget-object v1, p0, Lkentos/loader/floating/ESPView;->mNamePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, p9, p10, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 609
    :cond_2
    :goto_1
    return-void
.end method

.method public DrawWeaponIcon(Landroid/graphics/Canvas;IFF)V
    .locals 8
    .param p1, "cvs"    # Landroid/graphics/Canvas;
    .param p2, "id"    # I
    .param p3, "posX"    # F
    .param p4, "posY"    # F

    .line 612
    sget-object v0, Lkentos/loader/floating/ESPView;->bitmapCache:Landroid/util/LruCache;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 613
    .local v0, "cachedBitmap":Landroid/graphics/Bitmap;
    const/4 v1, 0x0

    const/high16 v2, 0x422c0000    # 43.0f

    if-eqz v0, :cond_0

    .line 614
    sub-float v2, p4, v2

    invoke-virtual {p1, v0, p3, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 616
    :cond_0
    invoke-direct {p0, p2}, Lkentos/loader/floating/ESPView;->getWeaponIcon(I)I

    move-result v3

    .line 617
    .local v3, "weapon_icon":I
    if-eqz v3, :cond_1

    .line 618
    invoke-virtual {p0}, Lkentos/loader/floating/ESPView;->getWidth()I

    move-result v4

    int-to-float v4, v4

    const v5, 0x45124000    # 2340.0f

    div-float/2addr v4, v5

    iput v4, p0, Lkentos/loader/floating/ESPView;->mScaleX:F

    .line 619
    invoke-virtual {p0}, Lkentos/loader/floating/ESPView;->getHeight()I

    move-result v4

    int-to-float v4, v4

    const/high16 v5, 0x44870000    # 1080.0f

    div-float/2addr v4, v5

    iput v4, p0, Lkentos/loader/floating/ESPView;->mScaleY:F

    .line 620
    invoke-virtual {p0}, Lkentos/loader/floating/ESPView;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-static {v4, v3}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 621
    .local v4, "bitmap":Landroid/graphics/Bitmap;
    const/high16 v5, 0x42960000    # 75.0f

    iget v6, p0, Lkentos/loader/floating/ESPView;->mScaleX:F

    mul-float/2addr v6, v5

    float-to-int v5, v6

    const/high16 v6, 0x42200000    # 40.0f

    iget v7, p0, Lkentos/loader/floating/ESPView;->mScaleY:F

    mul-float/2addr v7, v6

    float-to-int v6, v7

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 622
    .local v5, "scaledBitmap":Landroid/graphics/Bitmap;
    sget-object v6, Lkentos/loader/floating/ESPView;->bitmapCache:Landroid/util/LruCache;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v6, v7, v5}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 623
    sub-float v2, p4, v2

    invoke-virtual {p1, v5, p3, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 626
    .end local v3    # "weapon_icon":I
    .end local v4    # "bitmap":Landroid/graphics/Bitmap;
    .end local v5    # "scaledBitmap":Landroid/graphics/Bitmap;
    :cond_1
    :goto_0
    return-void
.end method

.method public InitializePaints()V
    .locals 11

    .line 174
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkentos/loader/floating/ESPView;->nearFillPaint:Landroid/graphics/Paint;

    .line 175
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 176
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->nearFillPaint:Landroid/graphics/Paint;

    const/16 v2, 0x3c

    const/16 v3, 0xe1

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v4, v4}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 177
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->nearFillPaint:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 178
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkentos/loader/floating/ESPView;->nearStrokePaint:Landroid/graphics/Paint;

    .line 179
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 180
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->nearStrokePaint:Landroid/graphics/Paint;

    const/16 v2, 0xff

    invoke-virtual {v0, v2, v3, v4, v4}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 181
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->nearStrokePaint:Landroid/graphics/Paint;

    sget-object v5, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 182
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->nearStrokePaint:Landroid/graphics/Paint;

    const/high16 v5, 0x40400000    # 3.0f

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 184
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkentos/loader/floating/ESPView;->mPaintBitmap:Landroid/graphics/Paint;

    .line 185
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 187
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkentos/loader/floating/ESPView;->mPaintBitmap1:Landroid/graphics/Paint;

    .line 188
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 190
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkentos/loader/floating/ESPView;->mVehiclesPaint:Landroid/graphics/Paint;

    .line 191
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 192
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mVehiclesPaint:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 193
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mVehiclesPaint:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lkentos/loader/floating/ESPView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v6, 0x7f080003

    invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getFont(I)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 195
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkentos/loader/floating/ESPView;->mItemsPaint:Landroid/graphics/Paint;

    .line 196
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 197
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mItemsPaint:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 198
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mItemsPaint:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lkentos/loader/floating/ESPView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getFont(I)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 200
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkentos/loader/floating/ESPView;->mStrokePaint:Landroid/graphics/Paint;

    .line 201
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 202
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mStrokePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 203
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mStrokePaint:Landroid/graphics/Paint;

    invoke-static {v4, v4, v4}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 204
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mStrokePaint:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 206
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkentos/loader/floating/ESPView;->mFilledPaint:Landroid/graphics/Paint;

    .line 207
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 208
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mFilledPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 209
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mFilledPaint:Landroid/graphics/Paint;

    invoke-static {v4, v4, v4}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 210
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mFilledPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 212
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkentos/loader/floating/ESPView;->mFillPaint:Landroid/graphics/Paint;

    .line 213
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 214
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mFillPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 215
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mFillPaint:Landroid/graphics/Paint;

    invoke-static {v4, v4, v4}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 217
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkentos/loader/floating/ESPView;->mTextPaint:Landroid/graphics/Paint;

    .line 218
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 219
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mTextPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 220
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mTextPaint:Landroid/graphics/Paint;

    invoke-static {v4, v4, v4}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 221
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mTextPaint:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 222
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mTextPaint:Landroid/graphics/Paint;

    const/high16 v3, 0x40000000    # 2.0f

    const/high16 v7, -0x1000000

    invoke-virtual {v0, v5, v3, v3, v7}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 223
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mTextPaint:Landroid/graphics/Paint;

    const v3, 0x3f8ccccd    # 1.1f

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 225
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkentos/loader/floating/ESPView;->mTextPainti:Landroid/graphics/Paint;

    .line 226
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 227
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mTextPainti:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 228
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mTextPainti:Landroid/graphics/Paint;

    invoke-static {v4, v4, v4}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 229
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mTextPainti:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 231
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkentos/loader/floating/ESPView;->mLootBoxPaint:Landroid/graphics/Paint;

    .line 232
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 233
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mLootBoxPaint:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 234
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mLootBoxPaint:Landroid/graphics/Paint;

    invoke-static {v4, v4, v4}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 235
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mLootBoxPaint:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lkentos/loader/floating/ESPView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getFont(I)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 236
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mLootBoxPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 238
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkentos/loader/floating/ESPView;->mTexturePaint:Landroid/graphics/Paint;

    .line 239
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 240
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mTexturePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 241
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mTexturePaint:Landroid/graphics/Paint;

    invoke-static {v4, v4, v4}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 242
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mStrokePaint:Landroid/graphics/Paint;

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 243
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mTexturePaint:Landroid/graphics/Paint;

    sget-object v5, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 244
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mTexturePaint:Landroid/graphics/Paint;

    invoke-static {v1, v1, v1}, Landroid/graphics/Color;->rgb(III)I

    move-result v5

    const/high16 v8, 0x41200000    # 10.0f

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-virtual {v0, v8, v9, v9, v5}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 245
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mTexturePaint:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lkentos/loader/floating/ESPView;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const/high16 v10, 0x7f080000

    invoke-virtual {v5, v10}, Landroid/content/res/Resources;->getFont(I)Landroid/graphics/Typeface;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 247
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkentos/loader/floating/ESPView;->mNamePaint:Landroid/graphics/Paint;

    .line 248
    sget-object v5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 249
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mNamePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 250
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mNamePaint:Landroid/graphics/Paint;

    invoke-static {v4, v4, v4}, Landroid/graphics/Color;->rgb(III)I

    move-result v5

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 251
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mNamePaint:Landroid/graphics/Paint;

    sget-object v5, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 252
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mNamePaint:Landroid/graphics/Paint;

    sget-object v5, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 253
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mNamePaint:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lkentos/loader/floating/ESPView;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getFont(I)Landroid/graphics/Typeface;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 255
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkentos/loader/floating/ESPView;->mFPSText:Landroid/graphics/Paint;

    .line 256
    sget-object v5, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 257
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mFPSText:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 258
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mFPSText:Landroid/graphics/Paint;

    invoke-static {v2, v2, v4}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 259
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mStrokePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 260
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mFPSText:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 261
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mFPSText:Landroid/graphics/Paint;

    invoke-static {v1, v1, v1}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    invoke-virtual {v0, v8, v9, v9, v2}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 262
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mFPSText:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lkentos/loader/floating/ESPView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getFont(I)Landroid/graphics/Typeface;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 264
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkentos/loader/floating/ESPView;->mMDText:Landroid/graphics/Paint;

    .line 265
    sget-object v2, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 266
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mMDText:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 267
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mMDText:Landroid/graphics/Paint;

    invoke-static {v4, v4, v4}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 268
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mMDText:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 269
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mMDText:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 270
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mMDText:Landroid/graphics/Paint;

    invoke-static {v1, v1, v1}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    invoke-virtual {v0, v8, v9, v9, v2}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 272
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lkentos/loader/floating/ESPView;->PaintTextBold:Landroid/graphics/Paint;

    .line 273
    sget-object v2, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 274
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->PaintTextBold:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 275
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->PaintTextBold:Landroid/graphics/Paint;

    invoke-static {v4, v4, v4}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 276
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->PaintTextBold:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 277
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->PaintTextBold:Landroid/graphics/Paint;

    const v1, 0x3e4ccccd    # 0.2f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 278
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->PaintTextBold:Landroid/graphics/Paint;

    invoke-virtual {v0, v8, v9, v9, v7}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 279
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->PaintTextBold:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lkentos/loader/floating/ESPView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getFont(I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 285
    invoke-virtual {p0}, Lkentos/loader/floating/ESPView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f070098

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iget v2, p0, Lkentos/loader/floating/ESPView;->mScaleY:F

    const/high16 v3, 0x42480000    # 50.0f

    mul-float v5, v2, v3

    float-to-int v5, v5

    mul-float/2addr v2, v3

    float-to-int v2, v2

    invoke-static {v0, v5, v2, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lkentos/loader/floating/ESPView;->botBitmap:Landroid/graphics/Bitmap;

    .line 286
    invoke-virtual {p0}, Lkentos/loader/floating/ESPView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iget v2, p0, Lkentos/loader/floating/ESPView;->mScaleY:F

    mul-float v5, v2, v3

    float-to-int v5, v5

    mul-float/2addr v2, v3

    float-to-int v2, v2

    invoke-static {v0, v5, v2, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lkentos/loader/floating/ESPView;->lootBitmap:Landroid/graphics/Bitmap;

    .line 287
    invoke-virtual {p0}, Lkentos/loader/floating/ESPView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iget v2, p0, Lkentos/loader/floating/ESPView;->mScaleY:F

    mul-float v5, v2, v3

    float-to-int v5, v5

    mul-float/2addr v2, v3

    float-to-int v2, v2

    invoke-static {v0, v5, v2, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lkentos/loader/floating/ESPView;->airdropBitmap:Landroid/graphics/Bitmap;

    .line 291
    invoke-virtual {p0}, Lkentos/loader/floating/ESPView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iget v1, p0, Lkentos/loader/floating/ESPView;->mScaleY:F

    const/high16 v2, 0x42200000    # 40.0f

    mul-float v3, v1, v2

    float-to-int v3, v3

    mul-float/2addr v1, v2

    float-to-int v1, v1

    invoke-static {v0, v3, v1, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 294
    .local v0, "commonVehicleBitmap":Landroid/graphics/Bitmap;
    iput-object v0, p0, Lkentos/loader/floating/ESPView;->buggyBitmap:Landroid/graphics/Bitmap;

    .line 295
    iput-object v0, p0, Lkentos/loader/floating/ESPView;->uazBitmap:Landroid/graphics/Bitmap;

    .line 296
    iput-object v0, p0, Lkentos/loader/floating/ESPView;->trikeBitmap:Landroid/graphics/Bitmap;

    .line 297
    iput-object v0, p0, Lkentos/loader/floating/ESPView;->bikeBitmap:Landroid/graphics/Bitmap;

    .line 298
    iput-object v0, p0, Lkentos/loader/floating/ESPView;->daciaBitmap:Landroid/graphics/Bitmap;

    .line 299
    iput-object v0, p0, Lkentos/loader/floating/ESPView;->jetBitmap:Landroid/graphics/Bitmap;

    .line 300
    iput-object v0, p0, Lkentos/loader/floating/ESPView;->boatBitmap:Landroid/graphics/Bitmap;

    .line 301
    iput-object v0, p0, Lkentos/loader/floating/ESPView;->busBitmap:Landroid/graphics/Bitmap;

    .line 302
    iput-object v0, p0, Lkentos/loader/floating/ESPView;->miradoBitmap:Landroid/graphics/Bitmap;

    .line 303
    iput-object v0, p0, Lkentos/loader/floating/ESPView;->scooterBitmap:Landroid/graphics/Bitmap;

    .line 304
    iput-object v0, p0, Lkentos/loader/floating/ESPView;->ronyBitmap:Landroid/graphics/Bitmap;

    .line 305
    iput-object v0, p0, Lkentos/loader/floating/ESPView;->snowbikeBitmap:Landroid/graphics/Bitmap;

    .line 306
    iput-object v0, p0, Lkentos/loader/floating/ESPView;->snowmobileBitmap:Landroid/graphics/Bitmap;

    .line 307
    iput-object v0, p0, Lkentos/loader/floating/ESPView;->tempoBitmap:Landroid/graphics/Bitmap;

    .line 308
    iput-object v0, p0, Lkentos/loader/floating/ESPView;->monsterBitmap:Landroid/graphics/Bitmap;

    .line 309
    iput-object v0, p0, Lkentos/loader/floating/ESPView;->brdmBitmap:Landroid/graphics/Bitmap;

    .line 310
    iput-object v0, p0, Lkentos/loader/floating/ESPView;->atvBitmap:Landroid/graphics/Bitmap;

    .line 311
    iput-object v0, p0, Lkentos/loader/floating/ESPView;->truckBitmap:Landroid/graphics/Bitmap;

    .line 312
    iput-object v0, p0, Lkentos/loader/floating/ESPView;->gliderBitmap:Landroid/graphics/Bitmap;

    .line 313
    iput-object v0, p0, Lkentos/loader/floating/ESPView;->utvBitmap:Landroid/graphics/Bitmap;

    .line 314
    iput-object v0, p0, Lkentos/loader/floating/ESPView;->coupeBitmap:Landroid/graphics/Bitmap;

    .line 315
    iput-object v0, p0, Lkentos/loader/floating/ESPView;->airplaneBitmap:Landroid/graphics/Bitmap;

    .line 318
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Lkentos/loader/floating/ESPView;->p2:Landroid/graphics/Paint;

    .line 319
    iget-object v1, p0, Lkentos/loader/floating/ESPView;->OTHER:[Landroid/graphics/Bitmap;

    array-length v1, v1

    .line 320
    .local v1, "bitmap_count_oth":I
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    if-ge v2, v1, :cond_2

    .line 321
    iget-object v3, p0, Lkentos/loader/floating/ESPView;->OTHER:[Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lkentos/loader/floating/ESPView;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget-object v5, Lkentos/loader/floating/ESPView;->OTH_NAME:[I

    aget v5, v5, v2

    invoke-static {v4, v5}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v4

    aput-object v4, v3, v2

    .line 322
    const/4 v3, 0x4

    if-ne v2, v3, :cond_0

    .line 323
    iget-object v3, p0, Lkentos/loader/floating/ESPView;->OTHER:[Landroid/graphics/Bitmap;

    aget-object v4, v3, v2

    const/16 v5, 0x190

    const/16 v6, 0x23

    invoke-static {v4, v5, v6}, Lkentos/loader/floating/ESPView;->scale(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v4

    aput-object v4, v3, v2

    goto :goto_1

    .line 324
    :cond_0
    const/4 v3, 0x5

    if-ne v2, v3, :cond_1

    .line 325
    iget-object v3, p0, Lkentos/loader/floating/ESPView;->OTHER:[Landroid/graphics/Bitmap;

    aget-object v4, v3, v2

    const/16 v5, 0x16

    invoke-static {v4, v5, v5}, Lkentos/loader/floating/ESPView;->scale(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v4

    aput-object v4, v3, v2

    goto :goto_1

    .line 327
    :cond_1
    iget-object v3, p0, Lkentos/loader/floating/ESPView;->OTHER:[Landroid/graphics/Bitmap;

    aget-object v4, v3, v2

    const/16 v5, 0x50

    invoke-static {v4, v5, v5}, Lkentos/loader/floating/ESPView;->scale(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v4

    aput-object v4, v3, v2

    .line 320
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 330
    .end local v2    # "i":I
    :cond_2
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 12
    .param p1, "canvas"    # Landroid/graphics/Canvas;

    .line 90
    invoke-virtual {p0}, Lkentos/loader/floating/ESPView;->getDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    .line 91
    .local v0, "rotation":I
    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lkentos/loader/floating/ESPView;->getVisibility()I

    move-result v1

    if-nez v1, :cond_1

    if-eqz v0, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 96
    :cond_0
    invoke-virtual {p0, p1}, Lkentos/loader/floating/ESPView;->ClearCanvas(Landroid/graphics/Canvas;)V

    .line 97
    const/16 v4, 0xff

    const/16 v5, 0xff

    const/16 v6, 0xbe

    const/16 v7, 0x28

    const-string v8, "GameBlaster Pro - FPS: "

    const/high16 v9, 0x437f0000    # 255.0f

    const/high16 v10, 0x42700000    # 60.0f

    const/high16 v11, 0x41e00000    # 28.0f

    move-object v2, p0

    move-object v3, p1

    invoke-virtual/range {v2 .. v11}, Lkentos/loader/floating/ESPView;->DrawTextName(Landroid/graphics/Canvas;IIIILjava/lang/String;FFF)V

    .line 98
    invoke-static {p0, p1}, Lkentos/loader/floating/Overlay;->DrawOn(Lkentos/loader/floating/ESPView;Landroid/graphics/Canvas;)V

    .line 99
    return-void

    .line 92
    :cond_1
    :goto_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 6
    .param p1, "changed"    # Z
    .param p2, "left"    # I
    .param p3, "top"    # I
    .param p4, "right"    # I
    .param p5, "bottom"    # I

    .line 103
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    .line 104
    invoke-virtual {p0}, Lkentos/loader/floating/ESPView;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const v1, 0x45124000    # 2340.0f

    div-float/2addr v0, v1

    iput v0, p0, Lkentos/loader/floating/ESPView;->mScaleX:F

    .line 105
    invoke-virtual {p0}, Lkentos/loader/floating/ESPView;->getHeight()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x44870000    # 1080.0f

    div-float/2addr v0, v1

    iput v0, p0, Lkentos/loader/floating/ESPView;->mScaleY:F

    .line 109
    nop

    .line 110
    invoke-virtual {p0}, Lkentos/loader/floating/ESPView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f070098

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iget v2, p0, Lkentos/loader/floating/ESPView;->mScaleY:F

    const/high16 v3, 0x42480000    # 50.0f

    mul-float v4, v2, v3

    float-to-int v4, v4

    mul-float/2addr v2, v3

    float-to-int v2, v2

    .line 109
    const/4 v3, 0x0

    invoke-static {v0, v4, v2, v3}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 116
    .local v0, "commonBitmap50":Landroid/graphics/Bitmap;
    iput-object v0, p0, Lkentos/loader/floating/ESPView;->botBitmap:Landroid/graphics/Bitmap;

    .line 117
    iput-object v0, p0, Lkentos/loader/floating/ESPView;->lootBitmap:Landroid/graphics/Bitmap;

    .line 118
    iput-object v0, p0, Lkentos/loader/floating/ESPView;->airdropBitmap:Landroid/graphics/Bitmap;

    .line 122
    nop

    .line 123
    invoke-virtual {p0}, Lkentos/loader/floating/ESPView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-static {v2, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v1

    iget v2, p0, Lkentos/loader/floating/ESPView;->mScaleY:F

    const/high16 v4, 0x42200000    # 40.0f

    mul-float v5, v2, v4

    float-to-int v5, v5

    mul-float/2addr v2, v4

    float-to-int v2, v2

    .line 122
    invoke-static {v1, v5, v2, v3}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 130
    .local v1, "commonBitmap40":Landroid/graphics/Bitmap;
    iput-object v1, p0, Lkentos/loader/floating/ESPView;->buggyBitmap:Landroid/graphics/Bitmap;

    .line 131
    iput-object v1, p0, Lkentos/loader/floating/ESPView;->uazBitmap:Landroid/graphics/Bitmap;

    .line 132
    iput-object v1, p0, Lkentos/loader/floating/ESPView;->trikeBitmap:Landroid/graphics/Bitmap;

    .line 133
    iput-object v1, p0, Lkentos/loader/floating/ESPView;->bikeBitmap:Landroid/graphics/Bitmap;

    .line 134
    iput-object v1, p0, Lkentos/loader/floating/ESPView;->daciaBitmap:Landroid/graphics/Bitmap;

    .line 135
    iput-object v1, p0, Lkentos/loader/floating/ESPView;->jetBitmap:Landroid/graphics/Bitmap;

    .line 136
    iput-object v1, p0, Lkentos/loader/floating/ESPView;->boatBitmap:Landroid/graphics/Bitmap;

    .line 137
    iput-object v1, p0, Lkentos/loader/floating/ESPView;->busBitmap:Landroid/graphics/Bitmap;

    .line 138
    iput-object v1, p0, Lkentos/loader/floating/ESPView;->miradoBitmap:Landroid/graphics/Bitmap;

    .line 139
    iput-object v1, p0, Lkentos/loader/floating/ESPView;->scooterBitmap:Landroid/graphics/Bitmap;

    .line 140
    iput-object v1, p0, Lkentos/loader/floating/ESPView;->ronyBitmap:Landroid/graphics/Bitmap;

    .line 141
    iput-object v1, p0, Lkentos/loader/floating/ESPView;->snowbikeBitmap:Landroid/graphics/Bitmap;

    .line 142
    iput-object v1, p0, Lkentos/loader/floating/ESPView;->snowmobileBitmap:Landroid/graphics/Bitmap;

    .line 143
    iput-object v1, p0, Lkentos/loader/floating/ESPView;->tempoBitmap:Landroid/graphics/Bitmap;

    .line 144
    iput-object v1, p0, Lkentos/loader/floating/ESPView;->monsterBitmap:Landroid/graphics/Bitmap;

    .line 145
    iput-object v1, p0, Lkentos/loader/floating/ESPView;->brdmBitmap:Landroid/graphics/Bitmap;

    .line 146
    iput-object v1, p0, Lkentos/loader/floating/ESPView;->atvBitmap:Landroid/graphics/Bitmap;

    .line 147
    iput-object v1, p0, Lkentos/loader/floating/ESPView;->truckBitmap:Landroid/graphics/Bitmap;

    .line 148
    iput-object v1, p0, Lkentos/loader/floating/ESPView;->gliderBitmap:Landroid/graphics/Bitmap;

    .line 149
    iput-object v1, p0, Lkentos/loader/floating/ESPView;->utvBitmap:Landroid/graphics/Bitmap;

    .line 150
    iput-object v1, p0, Lkentos/loader/floating/ESPView;->coupeBitmap:Landroid/graphics/Bitmap;

    .line 151
    iput-object v1, p0, Lkentos/loader/floating/ESPView;->airplaneBitmap:Landroid/graphics/Bitmap;

    .line 152
    return-void
.end method

.method public run()V
    .locals 8

    .line 156
    nop

    :goto_0
    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mThread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkentos/loader/floating/ESPView;->mThread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_0

    .line 158
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 159
    .local v0, "t1":J
    invoke-virtual {p0}, Lkentos/loader/floating/ESPView;->postInvalidate()V

    .line 160
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    .line 162
    .local v2, "td":J
    sget-wide v4, Lkentos/loader/floating/ESPView;->sleepTime:J

    sub-long/2addr v4, v2

    const-wide/16 v6, 0x0

    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    sget-wide v6, Lkentos/loader/floating/ESPView;->sleepTime:J

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 166
    .end local v0    # "t1":J
    .end local v2    # "td":J
    goto :goto_0

    .line 163
    :catch_0
    move-exception v0

    .line 164
    .local v0, "e":Ljava/lang/Exception;
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 165
    return-void

    .line 168
    .end local v0    # "e":Ljava/lang/Exception;
    :cond_0
    return-void
.end method

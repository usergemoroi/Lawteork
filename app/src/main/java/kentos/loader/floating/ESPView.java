package kentos.loader.floating;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.util.LruCache;
import android.view.View;
import androidx.core.view.ViewCompat;
import kentos.loader.C0931R;
import net.lingala.zip4j.util.InternalZipConstants;
/* loaded from: classes2.dex */
public class ESPView extends View implements Runnable {
    private static int itemPosition;
    private static int itemSize;
    public static long sleepTime;
    Bitmap[] OTHER;
    private Paint PaintTextBold;
    Bitmap airdropBitmap;
    Bitmap airplaneBitmap;
    Bitmap atvBitmap;
    Bitmap bikeBitmap;
    Bitmap bitmap;
    Bitmap boatBitmap;
    Bitmap botBitmap;
    Bitmap brdmBitmap;
    Bitmap buggyBitmap;
    Bitmap busBitmap;
    Bitmap coupeBitmap;
    Bitmap daciaBitmap;
    Bitmap gliderBitmap;
    Bitmap jetBitmap;
    Bitmap kudaBitmap;
    Bitmap lootBitmap;
    private float mFPS;
    private float mFPSCounter;
    private Paint mFPSText;
    private long mFPSTime;
    private Paint mFillPaint;
    private Paint mFilledPaint;
    private Paint mItemsPaint;
    private Paint mLootBoxPaint;
    private Paint mMDText;
    private Paint mNamePaint;
    private Paint mPaintBitmap;
    private Paint mPaintBitmap1;
    private float mScaleX;
    private float mScaleY;
    private Paint mStrokePaint;
    private Paint mTextPaint;
    private Paint mTextPainti;
    private Paint mTexturePaint;
    private Thread mThread;
    private Paint mVehiclesPaint;
    Bitmap miradoBitmap;
    Bitmap monsterBitmap;
    private Paint nearFillPaint;
    private Paint nearStrokePaint;
    Bitmap out;

    /* renamed from: p */
    Paint f209p;

    /* renamed from: p2 */
    Paint f210p2;
    Path path;
    Bitmap ronyBitmap;
    Bitmap scooterBitmap;
    Bitmap snowbikeBitmap;
    Bitmap snowmobileBitmap;
    Bitmap tempoBitmap;
    Bitmap trikeBitmap;
    Bitmap truckBitmap;
    Bitmap uazBitmap;
    Bitmap utvBitmap;
    Bitmap vehicleBitmap;
    private static LruCache<Integer, Bitmap> bitmapCache = new LruCache<>(10485760);
    private static final int[] OTH_NAME = {C0931R.C0933drawable.draw00a0, C0931R.C0933drawable.draw00a0, C0931R.C0933drawable.draw00a0, C0931R.C0933drawable.draw00a0, C0931R.C0933drawable.ic_warning, C0931R.C0933drawable.ic_boot, C0931R.C0933drawable.ic_alert};

    public static void ChangeFps(int fps) {
        sleepTime = 1000 / fps;
    }

    public ESPView(Context context) {
        super(context, null, 0);
        this.mFPS = 0.0f;
        this.mFPSCounter = 0.0f;
        this.mFPSTime = 0L;
        this.mScaleX = 1.0f;
        this.mScaleY = 1.0f;
        this.path = new Path();
        this.OTHER = new Bitmap[7];
        InitializePaints();
        setFocusableInTouchMode(false);
        setBackgroundColor(0);
        Thread thread = new Thread(this);
        this.mThread = thread;
        thread.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int rotation = getDisplay().getRotation();
        if (canvas == null || getVisibility() != 0 || rotation == 0 || rotation == 2) {
            return;
        }
        ClearCanvas(canvas);
        DrawTextName(canvas, 255, 255, 190, 40, "GameBlaster Pro - FPS: ", 255.0f, 60.0f, 28.0f);
        Overlay.DrawOn(this, canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top2, int right, int bottom) {
        super.onLayout(changed, left, top2, right, bottom);
        this.mScaleX = getWidth() / 2340.0f;
        this.mScaleY = getHeight() / 1080.0f;
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), C0931R.C0933drawable.draw00a0);
        float f = this.mScaleY;
        Bitmap commonBitmap50 = Bitmap.createScaledBitmap(decodeResource, (int) (f * 50.0f), (int) (f * 50.0f), false);
        this.botBitmap = commonBitmap50;
        this.lootBitmap = commonBitmap50;
        this.airdropBitmap = commonBitmap50;
        Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), C0931R.C0933drawable.draw00a0);
        float f2 = this.mScaleY;
        Bitmap commonBitmap40 = Bitmap.createScaledBitmap(decodeResource2, (int) (f2 * 40.0f), (int) (f2 * 40.0f), false);
        this.buggyBitmap = commonBitmap40;
        this.uazBitmap = commonBitmap40;
        this.trikeBitmap = commonBitmap40;
        this.bikeBitmap = commonBitmap40;
        this.daciaBitmap = commonBitmap40;
        this.jetBitmap = commonBitmap40;
        this.boatBitmap = commonBitmap40;
        this.busBitmap = commonBitmap40;
        this.miradoBitmap = commonBitmap40;
        this.scooterBitmap = commonBitmap40;
        this.ronyBitmap = commonBitmap40;
        this.snowbikeBitmap = commonBitmap40;
        this.snowmobileBitmap = commonBitmap40;
        this.tempoBitmap = commonBitmap40;
        this.monsterBitmap = commonBitmap40;
        this.brdmBitmap = commonBitmap40;
        this.atvBitmap = commonBitmap40;
        this.truckBitmap = commonBitmap40;
        this.gliderBitmap = commonBitmap40;
        this.utvBitmap = commonBitmap40;
        this.coupeBitmap = commonBitmap40;
        this.airplaneBitmap = commonBitmap40;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.mThread.isAlive() && !this.mThread.isInterrupted()) {
            try {
                long t1 = System.currentTimeMillis();
                postInvalidate();
                long td = System.currentTimeMillis() - t1;
                Thread.sleep(Math.max(Math.min(0L, sleepTime - td), sleepTime));
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public void InitializePaints() {
        Paint paint = new Paint();
        this.nearFillPaint = paint;
        paint.setAntiAlias(true);
        this.nearFillPaint.setARGB(60, 225, 0, 0);
        this.nearFillPaint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.nearStrokePaint = paint2;
        paint2.setAntiAlias(true);
        this.nearStrokePaint.setARGB(255, 225, 0, 0);
        this.nearStrokePaint.setStyle(Paint.Style.STROKE);
        this.nearStrokePaint.setStrokeWidth(3.0f);
        Paint paint3 = new Paint();
        this.mPaintBitmap = paint3;
        paint3.setAlpha(225);
        Paint paint4 = new Paint();
        this.mPaintBitmap1 = paint4;
        paint4.setAlpha(255);
        Paint paint5 = new Paint();
        this.mVehiclesPaint = paint5;
        paint5.setAntiAlias(true);
        this.mVehiclesPaint.setTextAlign(Paint.Align.CENTER);
        this.mVehiclesPaint.setTypeface(getResources().getFont(C0931R.font.mfontx));
        Paint paint6 = new Paint();
        this.mItemsPaint = paint6;
        paint6.setAntiAlias(true);
        this.mItemsPaint.setTextAlign(Paint.Align.CENTER);
        this.mItemsPaint.setTypeface(getResources().getFont(C0931R.font.mfontx));
        Paint paint7 = new Paint();
        this.mStrokePaint = paint7;
        paint7.setStyle(Paint.Style.STROKE);
        this.mStrokePaint.setAntiAlias(true);
        this.mStrokePaint.setColor(Color.rgb(0, 0, 0));
        this.mStrokePaint.setTextAlign(Paint.Align.CENTER);
        Paint paint8 = new Paint();
        this.mFilledPaint = paint8;
        paint8.setStyle(Paint.Style.FILL);
        this.mFilledPaint.setAntiAlias(true);
        this.mFilledPaint.setColor(Color.rgb(0, 0, 0));
        this.mFilledPaint.setStrokeWidth(3.0f);
        Paint paint9 = new Paint();
        this.mFillPaint = paint9;
        paint9.setStyle(Paint.Style.FILL);
        this.mFillPaint.setAntiAlias(true);
        this.mFillPaint.setColor(Color.rgb(0, 0, 0));
        Paint paint10 = new Paint();
        this.mTextPaint = paint10;
        paint10.setStyle(Paint.Style.FILL);
        this.mTextPaint.setAntiAlias(true);
        this.mTextPaint.setColor(Color.rgb(0, 0, 0));
        this.mTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mTextPaint.setShadowLayer(3.0f, 2.0f, 2.0f, ViewCompat.MEASURED_STATE_MASK);
        this.mTextPaint.setStrokeWidth(1.1f);
        Paint paint11 = new Paint();
        this.mTextPainti = paint11;
        paint11.setStyle(Paint.Style.FILL);
        this.mTextPainti.setAntiAlias(true);
        this.mTextPainti.setColor(Color.rgb(0, 0, 0));
        this.mTextPainti.setTextAlign(Paint.Align.CENTER);
        Paint paint12 = new Paint();
        this.mLootBoxPaint = paint12;
        paint12.setAntiAlias(true);
        this.mLootBoxPaint.setTextAlign(Paint.Align.LEFT);
        this.mLootBoxPaint.setColor(Color.rgb(0, 0, 0));
        this.mLootBoxPaint.setTypeface(getResources().getFont(C0931R.font.mfontx));
        this.mLootBoxPaint.setDither(true);
        Paint paint13 = new Paint();
        this.mTexturePaint = paint13;
        paint13.setStyle(Paint.Style.FILL);
        this.mTexturePaint.setAntiAlias(true);
        this.mTexturePaint.setColor(Color.rgb(0, 0, 0));
        this.mStrokePaint.setStrokeWidth(0.5f);
        this.mTexturePaint.setTextAlign(Paint.Align.CENTER);
        this.mTexturePaint.setShadowLayer(10.0f, 1.0f, 1.0f, Color.rgb(1, 1, 1));
        this.mTexturePaint.setTypeface(getResources().getFont(C0931R.font.cof));
        Paint paint14 = new Paint();
        this.mNamePaint = paint14;
        paint14.setStyle(Paint.Style.FILL);
        this.mNamePaint.setAntiAlias(true);
        this.mNamePaint.setColor(Color.rgb(0, 0, 0));
        this.mNamePaint.setTextAlign(Paint.Align.CENTER);
        this.mNamePaint.setTextAlign(Paint.Align.CENTER);
        this.mNamePaint.setTypeface(getResources().getFont(C0931R.font.mfontx));
        Paint paint15 = new Paint();
        this.mFPSText = paint15;
        paint15.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mFPSText.setAntiAlias(true);
        this.mFPSText.setColor(Color.rgb(255, 255, 0));
        this.mStrokePaint.setStrokeWidth(0.5f);
        this.mFPSText.setTextAlign(Paint.Align.CENTER);
        this.mFPSText.setShadowLayer(10.0f, 1.0f, 1.0f, Color.rgb(1, 1, 1));
        this.mFPSText.setTypeface(getResources().getFont(C0931R.font.mfontx));
        Paint paint16 = new Paint();
        this.mMDText = paint16;
        paint16.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mMDText.setAntiAlias(true);
        this.mMDText.setColor(Color.rgb(0, 0, 0));
        this.mMDText.setStrokeWidth(0.5f);
        this.mMDText.setTextAlign(Paint.Align.CENTER);
        this.mMDText.setShadowLayer(10.0f, 1.0f, 1.0f, Color.rgb(1, 1, 1));
        Paint paint17 = new Paint();
        this.PaintTextBold = paint17;
        paint17.setStyle(Paint.Style.FILL_AND_STROKE);
        this.PaintTextBold.setAntiAlias(true);
        this.PaintTextBold.setColor(Color.rgb(0, 0, 0));
        this.PaintTextBold.setTextAlign(Paint.Align.CENTER);
        this.PaintTextBold.setStrokeWidth(0.2f);
        this.PaintTextBold.setShadowLayer(10.0f, 1.0f, 1.0f, ViewCompat.MEASURED_STATE_MASK);
        this.PaintTextBold.setTypeface(getResources().getFont(C0931R.font.mfontx));
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), C0931R.C0933drawable.draw00a0);
        float f = this.mScaleY;
        this.botBitmap = Bitmap.createScaledBitmap(decodeResource, (int) (f * 50.0f), (int) (f * 50.0f), false);
        Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), C0931R.C0933drawable.draw00a0);
        float f2 = this.mScaleY;
        this.lootBitmap = Bitmap.createScaledBitmap(decodeResource2, (int) (f2 * 50.0f), (int) (f2 * 50.0f), false);
        Bitmap decodeResource3 = BitmapFactory.decodeResource(getResources(), C0931R.C0933drawable.draw00a0);
        float f3 = this.mScaleY;
        this.airdropBitmap = Bitmap.createScaledBitmap(decodeResource3, (int) (f3 * 50.0f), (int) (f3 * 50.0f), false);
        Bitmap decodeResource4 = BitmapFactory.decodeResource(getResources(), C0931R.C0933drawable.draw00a0);
        float f4 = this.mScaleY;
        Bitmap commonVehicleBitmap = Bitmap.createScaledBitmap(decodeResource4, (int) (f4 * 40.0f), (int) (f4 * 40.0f), false);
        this.buggyBitmap = commonVehicleBitmap;
        this.uazBitmap = commonVehicleBitmap;
        this.trikeBitmap = commonVehicleBitmap;
        this.bikeBitmap = commonVehicleBitmap;
        this.daciaBitmap = commonVehicleBitmap;
        this.jetBitmap = commonVehicleBitmap;
        this.boatBitmap = commonVehicleBitmap;
        this.busBitmap = commonVehicleBitmap;
        this.miradoBitmap = commonVehicleBitmap;
        this.scooterBitmap = commonVehicleBitmap;
        this.ronyBitmap = commonVehicleBitmap;
        this.snowbikeBitmap = commonVehicleBitmap;
        this.snowmobileBitmap = commonVehicleBitmap;
        this.tempoBitmap = commonVehicleBitmap;
        this.monsterBitmap = commonVehicleBitmap;
        this.brdmBitmap = commonVehicleBitmap;
        this.atvBitmap = commonVehicleBitmap;
        this.truckBitmap = commonVehicleBitmap;
        this.gliderBitmap = commonVehicleBitmap;
        this.utvBitmap = commonVehicleBitmap;
        this.coupeBitmap = commonVehicleBitmap;
        this.airplaneBitmap = commonVehicleBitmap;
        this.f210p2 = new Paint();
        int bitmap_count_oth = this.OTHER.length;
        for (int i = 0; i < bitmap_count_oth; i++) {
            this.OTHER[i] = BitmapFactory.decodeResource(getResources(), OTH_NAME[i]);
            if (i == 4) {
                Bitmap[] bitmapArr = this.OTHER;
                bitmapArr[i] = scale(bitmapArr[i], 400, 35);
            } else if (i == 5) {
                Bitmap[] bitmapArr2 = this.OTHER;
                bitmapArr2[i] = scale(bitmapArr2[i], 22, 22);
            } else {
                Bitmap[] bitmapArr3 = this.OTHER;
                bitmapArr3[i] = scale(bitmapArr3[i], 80, 80);
            }
        }
    }

    public void ClearCanvas(Canvas cvs) {
        cvs.drawColor(0, PorterDuff.Mode.CLEAR);
    }

    public void DrawLine(Canvas cvs, int a, int r, int g, int b, float lineWidth, float fromX, float fromY, float toX, float toY) {
        this.mStrokePaint.setColor(Color.rgb(r, g, b));
        this.mStrokePaint.setAlpha(a);
        this.mStrokePaint.setStrokeWidth(lineWidth);
        cvs.drawLine(fromX, fromY, toX, toY, this.mStrokePaint);
    }

    public void DrawRect(Canvas cvs, int a, int r, int g, int b, float stroke, float x, float y, float width, float height) {
        this.mStrokePaint.setStrokeWidth(stroke);
        this.mStrokePaint.setColor(Color.rgb(r, g, b));
        this.mStrokePaint.setAlpha(a);
        cvs.drawRoundRect(x, y, width, height, 5.0f, 5.0f, this.mStrokePaint);
    }

    public void DrawCurveRect(Canvas cvs, int a, int r, int g, int b, float stroke, float x, float y, float width, float height) {
        this.mStrokePaint.setStrokeWidth(stroke);
        this.mStrokePaint.setColor(Color.rgb(r, g, b));
        this.mStrokePaint.setAlpha(a);
        cvs.drawRoundRect(x, y, width, height, 5.0f, 5.0f, this.mStrokePaint);
    }

    public void DrawFilledRect2(Canvas cvs, int a, int r, int g, int b, float x, float y, float width, float height) {
        this.mFillPaint.setColor(Color.rgb(r, g, b));
        this.mFillPaint.setAlpha(a);
        cvs.drawRect(x, y, width, height, this.mFillPaint);
    }

    public void DrawFilledRect(Canvas cvs, int a, int r, int g, int b, float x, float y, float width, float height) {
        this.mFillPaint.setColor(Color.rgb(r, g, b));
        this.mFillPaint.setAlpha(a);
        cvs.drawRoundRect(x, y, width, height, 5.0f, 5.0f, this.mFillPaint);
    }

    public void DrawFilledRoundRect(Canvas cvs, int a, int r, int g, int b, float x, float y, float width, float height) {
        this.mFillPaint.setColor(Color.rgb(r, g, b));
        this.mFillPaint.setAlpha(a);
        cvs.drawRoundRect(x, y, width, height, 10.0f, 10.0f, this.mFillPaint);
    }

    public void DrawTextName(Canvas cvs, int a, int r, int g, int b, String txt, float posX, float posY, float size) {
        this.mFPSText.setARGB(a, r, g, b);
        this.mFPSText.setTextSize(size);
        if (SystemClock.uptimeMillis() - this.mFPSTime > 1000) {
            this.mFPSTime = SystemClock.uptimeMillis();
            this.mFPS = this.mFPSCounter;
            this.mFPSCounter = 0.0f;
        } else {
            this.mFPSCounter += 1.0f;
        }
        String fpsText = txt + this.mFPS;
        cvs.drawText(fpsText, posX, posY, this.mFPSText);
    }

    public void DrawEnemyCount(Canvas cvs, int a, int r, int g, int b, int width, int height) {
        this.nearStrokePaint.setARGB(255, r, g, b);
        this.nearFillPaint.setARGB(60, r, g, b);
        cvs.drawRoundRect((width / 2) - 70, 65.0f, (width / 2) + 70, 135.0f, 13.0f, 13.0f, this.nearFillPaint);
        cvs.drawRoundRect((width / 2) - 70, 65.0f, (width / 2) + 70, 135.0f, 13.0f, 13.0f, this.nearStrokePaint);
    }

    public void DrawTextMode2(Canvas cvs, int a, int r, int g, int b, String txt, float posX, float posY, float size) {
        this.mFPSText.setARGB(a, r, g, b);
        this.mFPSText.setTextSize(size);
        cvs.drawText("", posX, posY, this.mFPSText);
    }

    public void DrawTexture(Canvas cvs, int a, int r, int g, int b, String txt, float posX, float posY, float size) {
        this.mMDText.setColor(Color.rgb(r, g, b));
        this.mMDText.setAlpha(a);
        this.mMDText.setTextSize(size);
        cvs.drawText(txt, posX, posY, this.mMDText);
    }

    public void DrawCustom(Canvas cvs, int a, int r, int g, int b, String txt, float posX, float posY, float size) {
        this.mTexturePaint.setColor(Color.rgb(r, g, b));
        this.mTexturePaint.setAlpha(a);
        this.mTexturePaint.setTextSize(size);
        cvs.drawText("", posX, posY, this.mTexturePaint);
    }

    public void DrawFilledCurve(Canvas cvs, int a, int r, int g, int b, int x, int y, int width, int height) {
        int[] colors = {0, Color.rgb(r, g, b), 0};
        GradientDrawable mDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, colors);
        mDrawable.setShape(0);
        mDrawable.setGradientRadius(120.0f);
        Rect mRect = new Rect(x, y, width, height);
        mDrawable.setBounds(mRect);
        cvs.save();
        mDrawable.setGradientType(0);
        mDrawable.draw(cvs);
        cvs.restore();
    }

    public void DrawFillRect(Canvas cvs, int a, int r, int g, int b, int x, int y, int width, int height) {
        int[] colors = {Color.argb(a, r, g, b), Color.argb(a, r, g, b), Color.argb(a, r, g, b)};
        GradientDrawable mDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, colors);
        mDrawable.setShape(0);
        mDrawable.setCornerRadius(6.0f);
        mDrawable.setGradientRadius(120.0f);
        Rect mRect = new Rect(x, y, width, height);
        mDrawable.setBounds(mRect);
        cvs.save();
        mDrawable.setGradientType(0);
        mDrawable.draw(cvs);
        cvs.restore();
    }

    public void DrawTeamID(Canvas cvs, int a, int r, int g, int b, int teamid, float posX, float posY, float size) {
        this.mNamePaint.setColor(Color.rgb(r, g, b));
        this.mNamePaint.setTextSize(size);
        cvs.drawText(teamid + "", posX, posY, this.mNamePaint);
    }

    public void DrawTextBold(Canvas cvs, int a, int r, int g, int b, String txt, float posX, float posY, float size) {
        this.PaintTextBold.setARGB(a, r, g, b);
        this.PaintTextBold.setTextSize(size);
        cvs.drawText(txt, posX, posY, this.PaintTextBold);
    }

    public void DrawPlayerName(Canvas cvs, int a, int r, int g, int b, String nametxt, float posX, float posY, float size) {
        String[] namesp = nametxt.split(":");
        char[] nameint = new char[namesp.length];
        for (int i = 0; i < namesp.length; i++) {
            nameint[i] = (char) Integer.parseInt(namesp[i]);
        }
        String realname = new String(nameint);
        if (realname.length() > 5) {
            realname = realname.substring(0, 5);
        }
        this.mNamePaint.setARGB(a, r, g, b);
        this.mNamePaint.setTextSize(size);
        cvs.drawText(realname, posX, posY, this.mNamePaint);
    }

    public void DrawOTH(Canvas cvs, int image_number, float X, float Y) {
        cvs.drawBitmap(this.OTHER[image_number], X, Y, this.f209p);
    }

    public void DrawItems(Canvas cvs, String itemName, float distance, float posX, float posY, float size) {
        int itemColor;
        String realItemName = getItemName(itemName);
        if (realItemName != null && !realItemName.isEmpty()) {
            if (realItemName.equals("LootBox") && distance >= 150.0f) {
                return;
            }
            if (realItemName.equals("LootBox") || realItemName.equals("Airdrop")) {
                itemColor = Color.parseColor("#FFFFBE28");
            } else {
                itemColor = -1;
            }
            this.mItemsPaint.setColor(itemColor);
            this.mTextPainti.setColor(itemColor);
            this.mItemsPaint.setTextSize(size);
            this.mTextPainti.setTextSize(size);
            this.mItemsPaint.setStyle(Paint.Style.FILL);
            String displayText = realItemName + " (" + ((int) distance) + "m)";
            if (realItemName.equals("LootBox") || realItemName.equals("Airdrop")) {
                cvs.drawText(displayText, posX, posY - 8.0f, this.mItemsPaint);
            } else {
                cvs.drawText(displayText, posX, posY, this.mTextPainti);
            }
        }
    }

    public void DrawVehicles(Canvas cvs, String VehicleName, float distance, float health, float fuel, float posX, float posY, float size) {
        String realVehicleName = VehicleName(VehicleName);
        if (realVehicleName != null && !realVehicleName.isEmpty()) {
            this.mVehiclesPaint.setTextSize(size);
            String displayText = realVehicleName + " (" + ((int) distance) + "m)";
            this.mVehiclesPaint.setStyle(Paint.Style.FILL);
            this.mVehiclesPaint.setColor(Color.parseColor("#FFFFBE28"));
            cvs.drawText(displayText, posX, posY, this.mVehiclesPaint);
        }
    }

    public void DrawDeadBoxItems(Canvas cvs, int a, int r, int g, int b, String txt, float posX, float posY, float size) {
        this.mLootBoxPaint.setTextSize(size);
        this.mLootBoxPaint.setColor(Color.parseColor("#FF40CC7E"));
        cvs.drawText(txt, posX - 60.0f, posY - 10.0f, this.mLootBoxPaint);
    }

    public void DrawEnemyCount(Canvas cvs, int a, int r, int g, int b, int x, int y, int width, int height) {
        int[] colors = {0, Color.rgb(r, g, b), 0};
        GradientDrawable mDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, colors);
        mDrawable.setShape(0);
        mDrawable.setGradientRadius(120.0f);
        Rect mRect = new Rect(x, y, width, height);
        mDrawable.setBounds(mRect);
        cvs.save();
        mDrawable.setGradientType(0);
        mDrawable.draw(cvs);
        cvs.restore();
    }

    private void handleFuelHealthText(Canvas cvs, float posX, float posY, float fuel, float health, float size) {
        this.mStrokePaint.setARGB(50, 0, 0, 0);
        cvs.drawRoundRect(posX - 45.0f, posY + 19.0f, posX + 50.0f, posY + 25.0f, 3.0f, 3.0f, this.mStrokePaint);
        this.mFilledPaint.setARGB(100, 255, 255, 0);
        cvs.drawRoundRect(posX - 45.0f, posY + 19.0f, (posX - 40.0f) + ((fuel * 90.0f) / 100.0f), posY + 25.0f, 3.0f, 3.0f, this.mFilledPaint);
        this.mStrokePaint.setARGB(50, 0, 0, 0);
        cvs.drawRoundRect(posX - 45.0f, posY + 29.0f, posX + 50.0f, posY + 35.0f, 3.0f, 3.0f, this.mStrokePaint);
        this.mFilledPaint.setARGB(100, 255, 45, 30);
        cvs.drawRoundRect(posX - 45.0f, posY + 29.0f, (posX - 40.0f) + ((health * 90.0f) / 100.0f), posY + 35.0f, 3.0f, 3.0f, this.mFilledPaint);
    }

    public void DrawCircle(Canvas cvs, int a, int r, int g, int b, float posX, float posY, float radius, float stroke) {
        this.mStrokePaint.setARGB(a, r, g, b);
        this.mStrokePaint.setStrokeWidth(stroke);
        cvs.drawCircle(posX, posY, radius, this.mStrokePaint);
    }

    public void DrawFilledTriangle(Canvas cvs, int a, int r, int g, int b, float posX, float posY, float size) {
        this.mFilledPaint.setColor(Color.rgb(r, g, b));
        this.mFilledPaint.setAlpha(a);
        float halfSize = size / 2.0f;
        float height = (float) (Math.sqrt(3.0d) * halfSize);
        float y1 = posY - (height / 2.0f);
        float x2 = posX - halfSize;
        float y2 = posY + (height / 2.0f);
        float x3 = posX + halfSize;
        float y3 = posY + (height / 2.0f);
        Path path = new Path();
        path.moveTo(posX, y1);
        path.lineTo(x2, y2);
        path.lineTo(x3, y3);
        path.close();
        cvs.drawPath(path, this.mFilledPaint);
    }

    public void DrawFilledCircle(Canvas cvs, int a, int r, int g, int b, float posX, float posY, float radius) {
        this.mFilledPaint.setColor(Color.rgb(r, g, b));
        this.mFilledPaint.setAlpha(a);
        cvs.drawCircle(posX, posY, radius, this.mFilledPaint);
    }

    public void DrawFillCircle(Canvas cvs, int a, int r, int g, int b, float posX, float posY, float radius, float stroke) {
        this.mFilledPaint.setARGB(a, r, g, b);
        this.mFilledPaint.setStrokeWidth(stroke);
        cvs.drawCircle(posX, posY, radius, this.mFilledPaint);
    }

    public void DrawWeapon(Canvas cvs, int a, int r, int g, int b, int id, int ammo, int ammo2, float posX, float posY, float size) {
        this.mNamePaint.setARGB(a, r, g, b);
        this.mNamePaint.setTextSize(size);
        String wname = getWeapon(id);
        if (wname != null) {
            if (wname == "Sickle" || wname == "Machete" || wname == "Crowbar" || wname == "Pan") {
                cvs.drawText(wname, posX, posY, this.mNamePaint);
            } else {
                cvs.drawText(wname + "(" + ammo + InternalZipConstants.ZIP_FILE_SEPARATOR + ammo2 + ")", posX, posY, this.mNamePaint);
            }
        }
    }

    public void DrawWeaponIcon(Canvas cvs, int id, float posX, float posY) {
        Bitmap cachedBitmap = bitmapCache.get(Integer.valueOf(id));
        if (cachedBitmap != null) {
            cvs.drawBitmap(cachedBitmap, posX, posY - 43.0f, (Paint) null);
            return;
        }
        int weapon_icon = getWeaponIcon(id);
        if (weapon_icon != 0) {
            this.mScaleX = getWidth() / 2340.0f;
            this.mScaleY = getHeight() / 1080.0f;
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), weapon_icon);
            Bitmap scaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (this.mScaleX * 75.0f), (int) (this.mScaleY * 40.0f), false);
            bitmapCache.put(Integer.valueOf(id), scaledBitmap);
            cvs.drawBitmap(scaledBitmap, posX, posY - 43.0f, (Paint) null);
        }
    }

    public void DrawOTH2(Canvas cvs, int image_number, float X, float Y) {
        cvs.drawBitmap(this.OTHER[image_number], X, Y, this.f209p);
    }

    public void DrawTextBot(Canvas cvs, int a, int r, int g, int b, String txt, float posX, float posY, float size) {
        this.mNamePaint.setColor(Color.rgb(r, g, b));
        this.mNamePaint.setAlpha(a);
        cvs.drawText(txt, posX, posY, this.mNamePaint);
    }

    public void DrawPlayerID(Canvas cvs, int a, int r, int g, int b, String nametxt, int teamid, float posX, float posY, float size) {
        String[] namesp = nametxt.split(":");
        char[] nameint = new char[namesp.length];
        for (int i = 0; i < namesp.length; i++) {
            nameint[i] = (char) Integer.parseInt(namesp[i]);
        }
        this.mNamePaint.setColor(Color.rgb(r, g, b));
        this.mNamePaint.setTextSize(size);
        this.mNamePaint.setShadowLayer(8.0f, 1.5f, 1.5f, ViewCompat.MEASURED_STATE_MASK);
        cvs.drawText(teamid + "", posX, posY, this.mNamePaint);
    }

    public void DrawName1(Canvas cvs, int a, int r, int g, int b, String nametxt, int teamid, float posX, float posY, float size) {
        String[] namesp = nametxt.split(":");
        char[] nameint = new char[namesp.length];
        for (int i = 0; i < namesp.length; i++) {
            nameint[i] = (char) Integer.parseInt(namesp[i]);
        }
        String realname = new String(nameint);
        this.mNamePaint.setARGB(a, r, g, b);
        this.mNamePaint.setTextSize(size);
        this.mNamePaint.setShadowLayer(8.0f, 1.5f, 1.5f, ViewCompat.MEASURED_STATE_MASK);
        cvs.drawText("   " + realname, posX, posY, this.mNamePaint);
    }

    public void DrawTriangle(Canvas cvs, int a, int r, int g, int b, float posX1, float posY1, float posX2, float posY2, float posX3, float posY3, float stroke) {
        Path path = new Path();
        path.moveTo(posX1, posY1);
        path.lineTo(posX2, posY2);
        path.lineTo(posX3, posY3);
        path.close();
        Paint paint = new Paint();
        paint.setARGB(a, r, g, b);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(stroke);
        cvs.drawPath(path, paint);
    }

    public void DrawTriangleFilled(Canvas cvs, int a, int r, int g, int b, float posX1, float posY1, float posX2, float posY2, float posX3, float posY3) {
        Path path = new Path();
        path.moveTo(posX1, posY1);
        path.lineTo(posX2, posY2);
        path.lineTo(posX3, posY3);
        path.close();
        Paint paint = new Paint();
        paint.setARGB(a, r, g, b);
        paint.setStyle(Paint.Style.FILL);
        cvs.drawPath(path, paint);
    }

    public void DrawName2(Canvas cvs, int a, int r, int g, int b, String nametxt, int teamid, float posX, float posY, float size) {
        String[] namesp = nametxt.split(":");
        char[] nameint = new char[namesp.length];
        for (int i = 0; i < namesp.length; i++) {
            nameint[i] = (char) Integer.parseInt(namesp[i]);
        }
        String realname = new String(nameint);
        this.mTextPaint.setARGB(a, r, g, b);
        this.mTextPaint.setTextSize(size);
        cvs.drawText("" + Nation(realname), posX - 80.0f, posY - 30.0f, this.mTextPaint);
    }

    public void DrawText(Canvas cvs, int a, int r, int g, int b, String txt, float posX, float posY, float size) {
        this.mTextPaint.setColor(Color.rgb(r, g, b));
        this.mTextPaint.setAlpha(a);
        if (getRight() > 1920 || getBottom() > 1920) {
            this.mTextPaint.setTextSize(4.0f + size);
        } else if (getRight() == 1920 || getBottom() == 1920) {
            this.mTextPaint.setTextSize(2.0f + size);
        } else {
            this.mTextPaint.setTextSize(size);
        }
        cvs.drawText(txt, posX, posY, this.mTextPaint);
    }

    public void DrawTexti(Canvas cvs, int a, int r, int g, int b, String txt, float posX, float posY, float size) {
        this.mTextPainti.setARGB(a, r, g, b);
        this.mTextPainti.setTextSize(size);
        cvs.drawText(txt, posX, posY, this.mTextPainti);
    }

    public void DrawName(Canvas cvs, int a, int r, int g, int b, String nametxt, int teamid, float posX, float posY, float size) {
        String[] namesp = nametxt.split(":");
        char[] nameint = new char[namesp.length];
        for (int i = 0; i < namesp.length; i++) {
            nameint[i] = (char) Integer.parseInt(namesp[i]);
        }
        String realname = new String(nameint);
        this.mTextPaint.setARGB(a, r, g, b);
        this.mTextPaint.setTextSize(size);
        this.mTextPaint.setShadowLayer(3.0f, 2.0f, 2.0f, ViewCompat.MEASURED_STATE_MASK);
        cvs.drawText(realname + "(" + teamid + ")", posX, posY, this.mTextPaint);
    }

    public void DrawUserID(Canvas cvs, int a, int r, int g, int b, String nametxt, float posX, float posY, float size) {
        String[] namesp = nametxt.split(":");
        char[] nameint = new char[namesp.length];
        for (int i = 0; i < namesp.length; i++) {
            nameint[i] = (char) Integer.parseInt(namesp[i]);
        }
        String realname = new String(nameint);
        this.mTextPaint.setARGB(a, r, g, b);
        this.mTextPaint.setTextSize(size);
        this.mTextPaint.setColor(Color.parseColor("#FFFFFF"));
        cvs.drawText("ID: " + realname, posX, posY, this.mTextPaint);
    }

    public void DrawNation(Canvas cvs, int a, int r, int g, int b, String nametxt, int flag, float posX, float posY, float size) {
        String[] namesp = nametxt.split(":");
        char[] nameint = new char[namesp.length];
        for (int i = 0; i < namesp.length; i++) {
            nameint[i] = (char) Integer.parseInt(namesp[i]);
        }
        String realname = new String(nameint);
        this.mTextPaint.setARGB(a, r, g, b);
        this.mTextPaint.setTextSize(size);
        cvs.drawText("", posX + 85.0f, posY - 0.0f, this.mTextPaint);
        cvs.drawText(Nation(realname), posX + 73.0f, posY - 49.0f, this.mTextPaint);
    }

    private String Nation(String code) {
        if (code.equals("G1")) {
            return "🌍️";
        }
        return new String(Character.toChars((Character.codePointAt(code, 0) - 65) + 127462)) + new String(Character.toChars((Character.codePointAt(code, 1) - 65) + 127462));
    }

    private String getWeapon(int id) {
        switch (id) {
            case 101001:
            case 1010011:
            case 1010012:
            case 1010013:
            case 1010014:
            case 1010015:
                return "AKM";
            case 101002:
            case 1010021:
            case 1010022:
            case 1010023:
            case 1010024:
            case 1010025:
                return "M16A4";
            case 101003:
            case 1010031:
            case 1010032:
            case 1010033:
            case 1010034:
            case 1010035:
                return "SCAR-L";
            case 101004:
            case 1010041:
            case 1010042:
            case 1010043:
            case 1010044:
            case 1010045:
                return "M416";
            case 101005:
            case 1010051:
            case 1010052:
            case 1010053:
            case 1010054:
            case 1010055:
                return "Groza";
            case 101006:
            case 1010061:
            case 1010062:
            case 1010063:
            case 1010064:
            case 1010065:
                return "AUG";
            case 101007:
            case 1010071:
            case 1010072:
            case 1010073:
            case 1010074:
            case 1010075:
                return "QBZ";
            case 101008:
            case 1010081:
            case 1010082:
            case 1010083:
            case 1010084:
            case 1010085:
                return "M762";
            case 101009:
            case 1010091:
            case 1010092:
            case 1010093:
            case 1010094:
            case 1010095:
                return "Mk47";
            case 101010:
            case 1010101:
            case 1010102:
            case 1010103:
            case 1010104:
            case 1010105:
                return "G36C";
            case 101012:
            case 1010121:
            case 1010122:
            case 1010123:
            case 1010124:
            case 1010125:
                return "Honey Badger";
            case 101100:
            case 1011001:
            case 1011002:
            case 1011003:
            case 1011004:
            case 1011005:
                return "FAMAS";
            case 101101:
            case 1011011:
            case 1011012:
            case 1011013:
            case 1011014:
            case 1011015:
                return "ASM AR";
            case 101102:
            case 1011021:
            case 1011022:
            case 1011023:
            case 1011024:
            case 1011025:
                return "ACE32";
            case 102001:
            case 1020011:
            case 1020012:
            case 1020013:
            case 1020014:
            case 1020015:
                return "UZI";
            case 102002:
            case 1020021:
            case 1020022:
            case 1020023:
            case 1020024:
            case 1020025:
                return "UMP";
            case 102003:
            case 1020031:
            case 1020032:
            case 1020033:
            case 1020034:
            case 1020035:
                return "Vector";
            case 102004:
            case 1020041:
            case 1020042:
            case 1020043:
            case 1020044:
            case 1020045:
                return "ThommyGun";
            case 102005:
            case 1020051:
            case 1020052:
            case 1020053:
            case 1020054:
            case 1020055:
                return "Bizon";
            case 102007:
            case 1020071:
            case 1020072:
            case 1020073:
            case 1020074:
            case 1020075:
                return "MP5K";
            case 102105:
            case 1021051:
            case 1021052:
            case 1021053:
            case 1021054:
            case 1021055:
                return "P90";
            case 103001:
            case 1030011:
            case 1030012:
            case 1030013:
            case 1030014:
            case 1030015:
                return "Kar98k";
            case 103002:
            case 1030021:
            case 1030022:
            case 1030023:
            case 1030024:
            case 1030025:
                return "M24";
            case 103003:
            case 1030031:
            case 1030032:
            case 1030033:
            case 1030034:
            case 1030035:
                return "AWM";
            case 103004:
            case 1030041:
            case 1030042:
            case 1030043:
            case 1030044:
            case 1030045:
                return "SKS";
            case 103005:
            case 1030051:
            case 1030052:
            case 1030053:
            case 1030054:
            case 1030055:
                return "VSS";
            case 103006:
            case 1030061:
            case 1030062:
            case 1030063:
            case 1030064:
            case 1030065:
                return "Mini14";
            case 103007:
            case 1030071:
            case 1030072:
            case 1030073:
            case 1030074:
            case 1030075:
                return "Mk14";
            case 103008:
            case 1030081:
            case 1030082:
            case 1030083:
            case 1030084:
            case 1030085:
                return "Win94";
            case 103009:
            case 1030091:
            case 1030092:
            case 1030093:
            case 1030094:
            case 1030095:
                return "SLR";
            case 103010:
            case 1030101:
            case 1030102:
            case 1030103:
            case 1030104:
            case 1030105:
                return "QBU";
            case 103011:
            case 1030111:
            case 1030112:
            case 1030113:
            case 1030114:
            case 1030115:
                return "Mosin";
            case 103012:
            case 1030121:
            case 1030122:
            case 1030123:
            case 1030124:
            case 1030125:
                return "Lynx AMR";
            case 103100:
            case 1031001:
            case 1031002:
            case 1031003:
            case 1031004:
            case 1031005:
                return "Mk12";
            case 104001:
            case 1040011:
            case 1040012:
            case 1040013:
            case 1040014:
            case 1040015:
                return "S686";
            case 104002:
            case 1040021:
            case 1040022:
            case 1040023:
            case 1040024:
            case 1040025:
                return "S1897";
            case 104003:
            case 1040031:
            case 1040032:
            case 1040033:
            case 1040034:
            case 1040035:
                return "S12K";
            case 104004:
            case 1040041:
            case 1040042:
            case 1040043:
            case 1040044:
            case 1040045:
                return "DBS";
            case 104101:
            case 1041011:
            case 1041012:
            case 1041013:
            case 1041014:
            case 1041015:
                return "M1014";
            case 104102:
            case 1041021:
            case 1041022:
            case 1041023:
            case 1041024:
            case 1041025:
                return "NS2000";
            case 105001:
            case 1050011:
            case 1050012:
            case 1050013:
            case 1050014:
            case 1050015:
                return "M249";
            case 105002:
            case 1050021:
            case 1050022:
            case 1050023:
            case 1050024:
            case 1050025:
                return "DP28";
            case 105010:
            case 1050101:
            case 1050102:
            case 1050103:
            case 1050104:
            case 1050105:
                return "MG3";
            case 106001:
            case 1060011:
            case 1060012:
            case 1060013:
            case 1060014:
            case 1060015:
                return "P92";
            case 106002:
            case 1060021:
            case 1060022:
            case 1060023:
            case 1060024:
            case 1060025:
                return "P1911";
            case 106003:
            case 1060031:
            case 1060032:
            case 1060033:
            case 1060034:
            case 1060035:
                return "R1895";
            case 106004:
            case 1060041:
            case 1060042:
            case 1060043:
            case 1060044:
            case 1060045:
                return "P18C";
            case 106005:
            case 1060051:
            case 1060052:
            case 1060053:
            case 1060054:
            case 1060055:
                return "R45";
            case 106006:
            case 1060061:
            case 1060062:
            case 1060063:
            case 1060064:
            case 1060065:
                return "Sawed Off";
            case 106008:
            case 1060081:
            case 1060082:
            case 1060083:
            case 1060084:
            case 1060085:
                return "Scorpion";
            case 106010:
            case 1060101:
            case 1060102:
            case 1060103:
            case 1060104:
            case 1060105:
                return "Desert Angle";
            case 107001:
            case 1070011:
            case 1070012:
            case 1070013:
            case 1070014:
            case 1070015:
                return "Crossbow";
            case 108001:
            case 1080011:
            case 1080012:
            case 1080013:
            case 1080014:
            case 1080015:
                return "Machete";
            case 108002:
            case 1080021:
            case 1080022:
            case 1080023:
            case 1080024:
            case 1080025:
                return "Crowbar";
            case 108003:
            case 1080031:
            case 1080032:
            case 1080033:
            case 1080034:
            case 1080035:
                return "Sickle";
            case 108004:
            case 1080041:
            case 1080042:
            case 1080043:
            case 1080044:
            case 1080045:
                return "Panci";
            case 108005:
            case 1080051:
            case 1080052:
            case 1080053:
            case 1080054:
            case 1080055:
                return "Knife";
            default:
                return "";
        }
    }

    private int getWeaponIcon(int id) {
        return 0;
    }

    private String getItemName(String s) {
        if (s.contains("MZJ_8X") && Overlay.getConfig("8x")) {
            return "8x";
        }
        if (s.contains("MZJ_2X") && Overlay.getConfig("2x")) {
            return "2x";
        }
        if (s.contains("MZJ_HD") && Overlay.getConfig("Red Dot")) {
            return "Red Dot";
        }
        if (s.contains("MZJ_3X") && Overlay.getConfig("3x")) {
            return "3X";
        }
        if (s.contains("MZJ_QX") && Overlay.getConfig("Hollow")) {
            return "Hollow Sight";
        }
        if (s.contains("MZJ_6X") && Overlay.getConfig("6x")) {
            return "6x";
        }
        if (s.contains("MZJ_4X") && Overlay.getConfig("4x")) {
            return "4x";
        }
        if (s.contains("MZJ_SideRMR") && Overlay.getConfig("Canted")) {
            return "Canted Sight";
        }
        if (s.contains("Rifle_AUG") && Overlay.getConfig("AUG")) {
            return "AUG";
        }
        if (s.contains("Rifle_M762") && Overlay.getConfig("M762")) {
            return "M762";
        }
        if (s.contains("Rifle_SCAR") && Overlay.getConfig("SCAR-L")) {
            return "SCAR-L";
        }
        if (s.contains("Rifle_FAMAS") && Overlay.getConfig("FAMAS")) {
            return "FAMAS";
        }
        if (s.contains("Rifle_M416") && Overlay.getConfig("M416")) {
            return "M416";
        }
        if (s.contains("Rifle_M16A4") && Overlay.getConfig("M16A4")) {
            return "M16A-4";
        }
        if (s.contains("Rifle_G36") && Overlay.getConfig("G36C")) {
            return "G36C";
        }
        if (s.contains("Rifle_QBZ") && Overlay.getConfig("QBZ")) {
            return "QBZ";
        }
        if (s.contains("Rifle_AKM") && Overlay.getConfig("AKM")) {
            return "AKM";
        }
        if (s.contains("Rifle_HoneyBadger") && Overlay.getConfig("Honey Badger")) {
            return "Honey Badger";
        }
        if (s.contains("Rifle_Groza") && Overlay.getConfig("Groza")) {
            return "Groza";
        }
        if (s.contains("Rifle_ACE32") && Overlay.getConfig("ACE32")) {
            return "ACE32";
        }
        if (s.contains("SubmachineGun_UMP45") && Overlay.getConfig("UMP")) {
            return "UMP";
        }
        if (s.contains("MachineGun_PP19") && Overlay.getConfig("Bizon")) {
            return "Bizon";
        }
        if (s.contains("MachineGun_TommyGun") && Overlay.getConfig("TommyGun")) {
            return "TommyGun";
        }
        if (s.contains("MachineGun_MP5K") && Overlay.getConfig("MP5K")) {
            return "MP5K";
        }
        if (s.contains("MachineGun_UMP9") && Overlay.getConfig("UMP")) {
            return "UMP";
        }
        if (s.contains("MachineGun_Vector") && Overlay.getConfig("Vector")) {
            return "Vector";
        }
        if (s.contains("MachineGun_Uzi") && Overlay.getConfig("UZI")) {
            return "UZI";
        }
        if (s.contains("MachineGun_P90") && Overlay.getConfig("P90")) {
            return "P90";
        }
        if (s.contains("Other_DP28") && Overlay.getConfig("DP28")) {
            return "DP28";
        }
        if (s.contains("Other_M249") && Overlay.getConfig("M249")) {
            return "M249";
        }
        if (s.contains("Other_MG3") && Overlay.getConfig("MG3")) {
            return "MG3";
        }
        if (s.contains("Sniper_AWM") && Overlay.getConfig("AWM")) {
            return "AWM";
        }
        if (s.contains("Sniper_AMR") && Overlay.getConfig("AMR")) {
            return "AMR";
        }
        if (s.contains("Sniper_QBU") && Overlay.getConfig("QBU")) {
            return "QBU";
        }
        if (s.contains("Sniper_SLR") && Overlay.getConfig("SLR")) {
            return "SLR";
        }
        if (s.contains("Sniper_SKS") && Overlay.getConfig("SKS")) {
            return "SKS";
        }
        if (s.contains("Sniper_Mini14") && Overlay.getConfig("Mini14")) {
            return "Mini14";
        }
        if (s.contains("Sniper_M24") && Overlay.getConfig("M24")) {
            return "M24";
        }
        if (s.contains("Sniper_Kar98k") && Overlay.getConfig("Kar98k")) {
            return "Kar98k";
        }
        if (s.contains("Sniper_VSS") && Overlay.getConfig("VSS")) {
            return "VSS";
        }
        if (s.contains("Sniper_Win94") && Overlay.getConfig("Win94")) {
            return "Win94";
        }
        if (s.contains("Sniper_Mk14") && Overlay.getConfig("MK14")) {
            return "MK14";
        }
        if (s.contains("Sniper_Mosin") && Overlay.getConfig("Mosin")) {
            return "Mosin";
        }
        if (s.contains("Sniper_MK12") && Overlay.getConfig("MK12")) {
            return "MK12";
        }
        if (s.contains("Sniper_Mk47") && Overlay.getConfig("MK47")) {
            return "Mk47 Mutant";
        }
        if (s.contains("ShotGun_S12K") && Overlay.getConfig("S12K")) {
            return "S12K";
        }
        if (s.contains("ShotGun_DP12") && Overlay.getConfig("DBS")) {
            return "DBS";
        }
        if (s.contains("ShotGun_M1014") && Overlay.getConfig("M1014")) {
            return "M1014";
        }
        if (s.contains("ShotGun_Neostead2000") && Overlay.getConfig("NS2000")) {
            return "NS2000";
        }
        if (s.contains("ShotGun_S686") && Overlay.getConfig("S686")) {
            return "S686";
        }
        if (s.contains("ShotGun_S1897") && Overlay.getConfig("S1897")) {
            return "S1897";
        }
        if (s.contains("Sickle") && Overlay.getConfig("Sickle")) {
            return "Sickle";
        }
        if (s.contains("Machete") && Overlay.getConfig("Machete")) {
            return "Machete";
        }
        if (s.contains("Cowbar") && Overlay.getConfig("Crowbar")) {
            return "Crowbar";
        }
        if (s.contains("CrossBow") && Overlay.getConfig("CrossBow")) {
            return "CrossBow";
        }
        if (s.contains("Pan") && Overlay.getConfig("Pan")) {
            return "Pan";
        }
        if (s.contains("SawedOff") && Overlay.getConfig("Sawed-Off")) {
            return "SawedOff";
        }
        if (s.contains("R1895") && Overlay.getConfig("R1895")) {
            return "R1895";
        }
        if (s.contains("Vz61") && Overlay.getConfig("Scorpion")) {
            return "Scorpion";
        }
        if (s.contains("P92") && Overlay.getConfig("P92")) {
            return "P92";
        }
        if (s.contains("P18C") && Overlay.getConfig("P18C")) {
            return "P18C";
        }
        if (s.contains("R45") && Overlay.getConfig("R45")) {
            return "R45";
        }
        if (s.contains("P1911") && Overlay.getConfig("P1911")) {
            return "P1911";
        }
        if (s.contains("DesertEagle") && Overlay.getConfig("Dessert Eagle")) {
            return "DesertEagle";
        }
        if (s.contains("Ammo_762mm") && Overlay.getConfig("7.62mm")) {
            return "7.62";
        }
        if (s.contains("Ammo_45AC") && Overlay.getConfig("45ACP")) {
            return "45ACP";
        }
        if (s.contains("Ammo_556mm") && Overlay.getConfig("5.56mm")) {
            return "5.56";
        }
        if (s.contains("Ammo_9mm") && Overlay.getConfig("9mm")) {
            return "9mm";
        }
        if (s.contains("Ammo_300Magnum") && Overlay.getConfig("300Magnum")) {
            return "300Magnum";
        }
        if (s.contains("Ammo_50BMG") && Overlay.getConfig("50BMG")) {
            return "50BMG";
        }
        if (s.contains("Ammo_12Guage") && Overlay.getConfig("12Guage")) {
            return "12Guage";
        }
        if (s.contains("Ammo_Bolt") && Overlay.getConfig("Arrow")) {
            return "Arrow";
        }
        if (s.contains("Bag_Lv3") && Overlay.getConfig("Bag L3")) {
            return "Bag lvl 3";
        }
        if (s.contains("Bag_Lv1") && Overlay.getConfig("Bag L1")) {
            return "Bag lvl 1";
        }
        if (s.contains("Bag_Lv2") && Overlay.getConfig("Bag L2")) {
            return "Bag lvl 2";
        }
        if (s.contains("Armor_Lv2") && Overlay.getConfig("Vest L2")) {
            return "Vest lvl 2";
        }
        if (s.contains("Armor_Lv1") && Overlay.getConfig("Vest L1")) {
            return "Vest lvl 1";
        }
        if (s.contains("Armor_Lv3") && Overlay.getConfig("Vest L3")) {
            return "Vest lvl 3";
        }
        if (s.contains("Helmet_Lv2") && Overlay.getConfig("Helmet L2")) {
            return "Helmet lvl 2";
        }
        if (s.contains("Helmet_Lv1") && Overlay.getConfig("Helmet L1")) {
            return "Helmet lvl 1";
        }
        if (s.contains("Helmet_Lv3") && Overlay.getConfig("Helmet L3")) {
            return "Helmet lvl 3";
        }
        if (s.contains("Pills") && Overlay.getConfig("PainKiller")) {
            return "PainKiller";
        }
        if (s.contains("Injection") && Overlay.getConfig("Injection")) {
            return "Injection";
        }
        if (s.contains("Drink") && Overlay.getConfig("EnergyDrink")) {
            return "Energy Drink";
        }
        if (s.contains("Firstaid") && Overlay.getConfig("FirstAid")) {
            return "FirstAid";
        }
        if (s.contains("Bandage") && Overlay.getConfig("Bandage")) {
            return "Bandage";
        }
        if (s.contains("FirstAidbox") && Overlay.getConfig("MedKit")) {
            return "Medkit";
        }
        if (s.contains("Grenade_Stun") && Overlay.getConfig("Stun")) {
            return "Stun";
        }
        if (s.contains("Grenade_Shoulei") && Overlay.getConfig("Grenade")) {
            return "Grenade";
        }
        if (s.contains("Grenade_Smoke") && Overlay.getConfig("Smoke")) {
            return "Smoke";
        }
        if (s.contains("Grenade_Burn") && Overlay.getConfig("Molotov")) {
            return "Molotov";
        }
        if (s.contains("Large_FlashHider") && Overlay.getConfig("Flash Hider Ar")) {
            return "Flash Hider Ar";
        }
        if (s.contains("QK_Large_C") && Overlay.getConfig("Compensator Ar")) {
            return "Compensator Ar";
        }
        if (s.contains("Mid_FlashHider") && Overlay.getConfig("Flash Hider SMG")) {
            return "Flash Hider SMG";
        }
        if (s.contains("QT_A_") && Overlay.getConfig("Tactical Stock")) {
            return "Tactical Stock";
        }
        if (s.contains("DuckBill") && Overlay.getConfig("Duckbill")) {
            return "DuckBill";
        }
        if (s.contains("Sniper_FlashHider") && Overlay.getConfig("Flash Hider Sniper")) {
            return "Flash Hider Sniper";
        }
        if (s.contains("Mid_Suppressor") && Overlay.getConfig("Suppressor SMG")) {
            return "Suppressor SMG";
        }
        if (s.contains("Choke") && Overlay.getConfig("Choke")) {
            return "Choke";
        }
        if (s.contains("QT_UZI") && Overlay.getConfig("Stock Micro UZI")) {
            return "Stock Micro UZI";
        }
        if (s.contains("QK_Sniper") && Overlay.getConfig("Compensator Sniper")) {
            return "Compensator Sniper";
        }
        if (s.contains("Sniper_Suppressor") && Overlay.getConfig("Suppressor Sniper")) {
            return "Suppressor Sniper";
        }
        if (s.contains("Large_Suppressor") && Overlay.getConfig("Suppressor Ar")) {
            return "Suppressor Ar";
        }
        if (s.contains("Sniper_EQ_") && Overlay.getConfig("Extended QD Sniper")) {
            return "Ex.Qd.Sniper";
        }
        if (s.contains("Sniper_E_") && Overlay.getConfig("Extended Mag Sniper")) {
            return "Ex.Sniper";
        }
        if (s.contains("Sniper_Q_") && Overlay.getConfig("QuickDraw Mag Sniper")) {
            return "Qd.Sniper";
        }
        if (s.contains("Large_EQ_") && Overlay.getConfig("Extended QD Ar")) {
            return "Extended QD Ar";
        }
        if (s.contains("Large_E_") && Overlay.getConfig("Extended Mag Ar")) {
            return "Extended Mag Ar";
        }
        if (s.contains("Large_Q_") && Overlay.getConfig("QuickDraw Mag Ar")) {
            return "QuickDraw Mag Ar";
        }
        if (s.contains("Mid_EQ_") && Overlay.getConfig("Extended QD SMG")) {
            return "Ex.Qd.SMG";
        }
        if (s.contains("Mid_E_") && Overlay.getConfig("Extended Mag SMG")) {
            return "Ex.SMG";
        }
        if (s.contains("Mid_Q_") && Overlay.getConfig("QuickDraw Mag SMG")) {
            return "Qd.SMG";
        }
        if (s.contains("Crossbow_Q") && Overlay.getConfig("Quiver CrossBow")) {
            return "Quiver CrossBow";
        }
        if (s.contains("ZDD_Sniper") && Overlay.getConfig("Bullet Loop")) {
            return "Bullet Loop";
        }
        if (s.contains("ThumbGrip") && Overlay.getConfig("Thumb Grip")) {
            return "Thumb Grip";
        }
        if (s.contains("Lasersight") && Overlay.getConfig("Laser Sight")) {
            return "Laser Sight";
        }
        if (s.contains("Angled") && Overlay.getConfig("Angled Grip")) {
            return "Angled Grip";
        }
        if (s.contains("LightGrip") && Overlay.getConfig("Light Grip")) {
            return "Light Grip";
        }
        if (s.contains("Vertical") && Overlay.getConfig("Vertical Grip")) {
            return "Vertical Grip";
        }
        if (s.contains("HalfGrip") && Overlay.getConfig("Half Grip")) {
            return "Half Grip";
        }
        if (s.contains("GasCan") && Overlay.getConfig("Gas Can")) {
            return "Gas Can";
        }
        if (s.contains("Mid_Compensator") && Overlay.getConfig("Compensator SMG")) {
            return "Compensator SMG";
        }
        if (s.contains("Flaregun") && Overlay.getConfig("FlareGun")) {
            return "Flare Gun";
        }
        if (s.contains("Ammo_Flare") && Overlay.getConfig("FlareGun")) {
            return "Flare Gun";
        }
        if (s.contains("Ghillie") && Overlay.getConfig("Ghillie Suit")) {
            return "Ghillie Suit";
        }
        if (s.contains("CheekPad") && Overlay.getConfig("CheekPad")) {
            return "CheekPad";
        }
        if (s.contains("PickUpListWrapperActor") && Overlay.getConfig("LootBox")) {
            return "LootBox";
        }
        if (s.contains("AirDropPlane") && Overlay.getConfig("DropPlane")) {
            return "DropPlane";
        }
        if (s.contains("AirDropBox") && Overlay.getConfig("AirDrop")) {
            return "AirDrop";
        }
        return null;
    }

    private String VehicleName(String s) {
        if (s.contains("Buggy") && Overlay.getConfig("Buggy")) {
            return "Buggy";
        }
        if (s.contains("UAZ") && Overlay.getConfig("UAZ")) {
            return "UAZ";
        }
        if (s.contains("MotorcycleC") && Overlay.getConfig("Trike")) {
            return "Trike";
        }
        if (s.contains("Motorcycle") && Overlay.getConfig("Bike")) {
            return "Bike";
        }
        if (s.contains("DAcia") && Overlay.getConfig("Dacia")) {
            return "Dacia";
        }
        if (s.contains("Dacia") && Overlay.getConfig("Dacia")) {
            return "Dacia";
        }
        if (s.contains("AquaRail") && Overlay.getConfig("Jet")) {
            return "Jet";
        }
        if (s.contains("PG117") && Overlay.getConfig("Boat")) {
            return "Boat";
        }
        if (s.contains("MiniBus") && Overlay.getConfig("Bus")) {
            return "Bus";
        }
        if (s.contains("Mirado") && Overlay.getConfig("Mirado")) {
            return "Mirado";
        }
        if (s.contains("Scooter") && Overlay.getConfig("Scooter")) {
            return "Scooter";
        }
        if (s.contains("Rony") && Overlay.getConfig("Rony")) {
            return "Rony";
        }
        if (s.contains("Snowbike") && Overlay.getConfig("Snowbike")) {
            return "Snowbike";
        }
        if (s.contains("Snowmobile") && Overlay.getConfig("Snowmobile")) {
            return "Snowmobile";
        }
        if (s.contains("Tuk") && Overlay.getConfig("Tempo")) {
            return "Tempo";
        }
        if (s.contains("PickUp") && Overlay.getConfig("Truck")) {
            return "Truck";
        }
        if (s.contains("BRDM") && Overlay.getConfig("BRDM")) {
            return "BRDM";
        }
        if (s.contains("LadaNiva") && Overlay.getConfig("LadaNiva")) {
            return "LadaNiva";
        }
        if (s.contains("Bigfoot") && Overlay.getConfig("Monster")) {
            return "Monster";
        }
        if (s.contains("CoupeRB") && Overlay.getConfig("CoupeRB")) {
            return "CoupeRB";
        }
        if (s.contains("glider") && Overlay.getConfig("Motor Glider")) {
            return "Motor Glider";
        }
        if (s.contains("UTV") && Overlay.getConfig("UTV")) {
            return "UTV";
        }
        if (s.contains("ATV1") && Overlay.getConfig("ATV1")) {
            return "ATV1";
        }
        if (s.contains("Reindeer") && Overlay.getConfig("Reindeer")) {
            return "Reindeer";
        }
        return "";
    }

    public static Bitmap scale(Bitmap bitmap, int maxWidth, int maxHeight) {
        int height;
        int width;
        float widthRatio = bitmap.getWidth() / maxWidth;
        float heightRatio = bitmap.getHeight() / maxHeight;
        if (widthRatio >= heightRatio) {
            width = maxWidth;
            height = (int) ((width / bitmap.getWidth()) * bitmap.getHeight());
        } else {
            height = maxHeight;
            width = (int) ((height / bitmap.getHeight()) * bitmap.getWidth());
        }
        Bitmap scaledBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        float ratioX = width / bitmap.getWidth();
        float ratioY = height / bitmap.getHeight();
        float middleX = width / 2.0f;
        float middleY = height / 2.0f;
        Matrix scaleMatrix = new Matrix();
        scaleMatrix.setScale(ratioX, ratioY, middleX, middleY);
        Canvas canvas = new Canvas(scaledBitmap);
        canvas.setMatrix(scaleMatrix);
        canvas.drawBitmap(bitmap, middleX - (bitmap.getWidth() / 2), middleY - (bitmap.getHeight() / 2), new Paint(2));
        return scaledBitmap;
    }
}

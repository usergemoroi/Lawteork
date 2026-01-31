package kentos.loader.activity;

import android.app.ActivityManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.GravityCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardViewHelper;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.topjohnwu.superuser.Shell;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Locale;
import kentos.loader.C0931R;
import kentos.loader.Component.DownloadZip;
import kentos.loader.activity.MainActivity;
import kentos.loader.floating.FloatService;
import kentos.loader.floating.Overlay;
import kentos.loader.floating.ToggleAim;
import kentos.loader.floating.ToggleBullet;
import kentos.loader.server.ApiServer;
import kentos.loader.utils.ActivityCompat;
import kentos.loader.utils.FLog;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.p024ws.WebSocketProtocol;
import org.json.JSONObject;
import org.lsposed.lsparanoid.Deobfuscator$$app;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.utils.FileUtils;
/* loaded from: classes2.dex */
public class MainActivity extends ActivityCompat {
    public static boolean Ischeck = false;
    private static final int REQUEST_PERMISSIONS = 1;
    public static int bitversi;
    public static String bypassmode;
    public static boolean check;
    public static String daemonPath;
    public static int device;
    public static boolean fixinstallint;
    public static String game;
    public static int gameint;
    public static boolean hiderecord;
    static MainActivity instance;
    public static boolean kernel;
    public static String modeselect;
    public static boolean modestatus;
    public static boolean noroot;
    public static String socket;
    public static String typelogin;
    RelativeLayout BGMIONOFF;
    private FixObbDownloadTask currentTask;
    public LinearProgressIndicator progres;
    private AlertDialog progressDialog;
    private SharedPreferences sharedPreferences;
    public String BGMI_INSTALL_OFF = Deobfuscator$$app.getString(-3440732227320504137L);
    public String nameGame = Deobfuscator$$app.getString(-3440732223025536841L);
    public String CURRENT_PACKAGE = Deobfuscator$$app.getString(-3440732145716125513L);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class FixObbDownloadTask extends AsyncTask<String, String, Boolean> {
        private TextView fileNameText;
        private String gameNameStr;
        private volatile boolean isManualCancelled;
        private TextView percentText;
        private ProgressBar progressBar;
        private AlertDialog progressDialog;
        private TextView sizeText;
        private TextView speedText;
        private String targetPackage;
        final MainActivity this$0;

        private FixObbDownloadTask(MainActivity mainActivity) {
            this.this$0 = mainActivity;
            this.isManualCancelled = false;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 1168
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:1007:0x0dd4 -> B:815:0x0b89). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:953:0x0d45 -> B:911:0x0cc4). Please submit an issue!!! */
        /* renamed from: doInBackground  reason: avoid collision after fix types in other method */
        protected java.lang.Boolean doInBackground2(java.lang.String... r29) {
            /*
                Method dump skipped, instructions count: 5822
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kentos.loader.activity.MainActivity.FixObbDownloadTask.doInBackground2(java.lang.String[]):java.lang.Boolean");
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ Boolean doInBackground(String[] strArr) {
            String str = "ۢۦۨۙ۟ۨۘۥۢۛۛۖ۬ۖۨۖۘ۫ۗۖۛ۟۫۟ۘ۬ۛۘ۫ۡ۫ۛ۠ۥۜۛۗۥ۟۬۬۠ۧۧ۫۬ۖۘۥۢۘۘۛۢ۫ۦ۟ۙۢۡۘۘ۫ۜۦۘ۟ۦۚۧۢۘۘۘۙ۟ۧۘۗۧۥۡ";
            while (true) {
                switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 73) ^ 69) ^ 452) ^ 86) ^ 428) ^ 161) ^ 311) ^ 186) ^ 351) ^ 927) ^ 670) ^ 886) ^ 804) ^ PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW) ^ 494) ^ 91) ^ 599) ^ 247) ^ 920) ^ 256) ^ 898) ^ 958) ^ 837) ^ 216) ^ 298) ^ 75) ^ 67) ^ 87) ^ 279) ^ 211) ^ 397) ^ 681939460) {
                    case -1958482522:
                        str = "ۨ۬ۖۘ۟ۤۥۘۧۜۘۘ۟ۨۨۜۨ۫ۛۡۥۘۤ۠ۥۖۚۖ۟ۡ۬ۡۡۦۢۧۨ۬۫ۤۡ۠ۘۖۜ۬ۘۘ۠ۤۨ۫ۤۛ۬ۨۥ۫ۥ۠ۨ۬ۦۧۘ۫ۚۡۦۖۚۡۚۦۘ۟ۨۖۘۨۧ۫ۛۚۤۖۛۡۘۜۚۖۘۥ۟ۥۛۦ";
                        break;
                    case -1083061134:
                        return doInBackground2(strArr);
                    case 386871275:
                        str = "ۤۖۖۥۡۨۥۤۜۘۚۡۜ۫ۤۦ۫۬ۚۤۧۤۦۘ۫ۡۙۦۢۜۘۤ۠ۧۗۘۖ۠ۨۘ۬ۢۥۡۛۡ۠ۡۚۤۡۥۘۚۖۤۗۜۨۜۘ۟ۜ۬ۖۚۨۦۘ۫ۘۡۘۤۘۦۖۥ۫ۨۜۧۘۗۦ۟۫۟ۡۗۥۥ۬ۦۚۘۧۘۡ۫ۢۡ۟۟ۘ۬ۡۘۗ۫۫";
                        break;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$onPreExecute$0$kentos-loader-activity-MainActivity$FixObbDownloadTask */
        public /* synthetic */ void m76x6a202d20(View view) {
            TextView textView = null;
            String str = "۬ۥ۠ۛۙۖۤۖۛۨۧ۬ۗۙۡۘۜ۫ۢ۟ۗۧ۬ۤۡۜ۟۟ۤۛۧۘۖۘۘۢۧۨۘۤ۬۬ۛۙ۫ۙۥۡۧۙۜۗۖۘۧ۠ۜۚ۟ۜۘ۬ۚۢ۬ۦۘۨۗۦۖۦۙۥۘۨۙۜ";
            while (true) {
                switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 822) ^ 617) ^ 187) ^ 636) ^ 704) ^ 151) ^ 544) ^ 221) ^ 291) ^ 447) ^ 435) ^ 629) ^ 505) ^ 228) ^ 454) ^ 514) ^ 654) ^ 853) ^ 517) ^ 801) ^ 190) ^ 164) ^ 262) ^ 130) ^ 624) ^ 792) ^ 51) ^ 512) ^ 646) ^ 575) ^ 830) ^ (-1745662864)) {
                    case -1494463786:
                        String str2 = "۠ۛۜۖۥ۫ۖۤۜۧۤۗۤ۠ۛۧۧۚۧ۠ۛۘۨۘۦۘۤۙۘۢۚ۠ۗۤۜۨۗۙۥۘۘۛ۬۟ۗۨۘۧۛۗۚ۠ۡ۫ۘۦۧۘۛ۬۟ۧۙۧۢۘۙۗۡۥۘۙۛۢۛۖۖ۠ۦۥۘۗ۫ۧۦۗۜۨۢۗۙۡۘ";
                        while (true) {
                            switch (str2.hashCode() ^ (-725058349)) {
                                case -1747706407:
                                    String str3 = "ۦ۫ۥۖۖۜۘۡۚ۟ۚۘۘۡۡۘۘۘۡۤۛ۟ۚۚۜۘۧۘۧۢۗۦۘۨۥۘۜۗۖۥۘۢۦۙۖۘۧۨۨۧۥۖۤ۟ۥۢۚۜۦ۫ۦۘۚۧۢۘ۠ۥۘۚۢۢۨۖ۫ۢۖۧۖۧۘۤۨۥ۠ۦۥۘ۫۟ۛ۫ۙۥۘۦۘۡ";
                                    while (true) {
                                        switch (str3.hashCode() ^ (-1370357643)) {
                                            case -1298050533:
                                                String str4 = "۟ۨۥۘۗۙ۬ۧۥۜۛۗۚۡۛ۫ۜۜۘۧۦ۟ۦ۟ۡۨۗۡۤۛ۬ۗۘۡۚ۫۬ۧۤۨۥۧ۫ۗۥۘۨۢۥۘۨۧۖۘۘۜۧۢۧۜۘۗۘۧۧ۫ۦ۠ۖۥۚۗۖ۫ۤۨۦۜۘۦۢۘۘۥۙۖۘۡۗۥ۫ۢۙۤۖۧ";
                                                while (true) {
                                                    switch (str4.hashCode() ^ 167072480) {
                                                        case -1526447724:
                                                            str3 = "ۤۗ۟ۥۧۢ۬ۗۤۤۖۜۘۨۧ۬ۨ۫ۨۘۡۧۢ۟ۥ۫ۡۦۚۜۘۦۥ۠۠۟ۡۤۖ۫ۧۡۢۜۘ۬ۛۨۘ۟ۥ۠۬ۡۚۛۥۨۛ۠ۥۢۙۤۢۙۖۘۙۤۘۦۥۧۤ۠۟ۜۜۘۘ۠ۘۘۛۢۧ۟ۢۨۥۢ۫۟ۥ۬";
                                                            break;
                                                        case -1129951209:
                                                            str3 = "ۦۖۦۘ۫ۚۘۘۧۧۨۤۡۤۤۜۥۖۦۙ۟ۜ۫۬ۨۖۗۨۖۘۨۢ۠ۚۡۦۘۙۗ۬ۚۚۖۧ۫ۨۦ۟ۨۧۤۛۙۗۚۚۘۨۘۚۗۥۧۗۘۢۢۨۘۚۙۧ۫ۚۗۖۢۦۘۚۤۜۘۛ۟ۚ۟ۛۥ۬۫۬۫ۖۚۤۛۨۘ۫ۘ۟۠ۖۛۦۚۥۘ۬ۘۖۘۦۚۡۘۤۛ۬ۧ۬۠ۙۜۘۘۢۜ۫ۜۨۘ";
                                                            break;
                                                        case 337011499:
                                                            str4 = "۟ۖۦۘۢۤۥۘۡۗۤ۟ۙۥۘۙۧۙۧۛۢۗۘۡ۠ۗۦۗۚۧ۬ۖ۫ۜ۟۟ۙۖۘۗۙۜۘۜۤۤۙۡۙۖۜۡۘۦ۠۫ۡۖ۠ۖۘۙۥۦۦۡۤ۫ۗۦۥۘۖۦۜۘۜۧۘۖ۬ۦۧۨۨۨۛۘۘۚۙۥۤۦ۬ۙۖ۠ۙۚۚ۬ۜۨۘۡ۫ۡۘۡۜۧۘۘۖۜۘ۟۫ۧۥۥۦۘۦۨۧۘۚ۟ۥۢۨ۟";
                                                        case 830646706:
                                                            String str5 = "ۢۥۨۘۘۖۘۤۛۘ۫ۨۤۜ۬ۨۘۢۨ۫ۜۙۤۛۖۤۥ۬ۥ۟ۚ۟۫ۧۦۘۜۜۦۘۙ۟ۖۘ۫ۛۜۢۘۦۤۧ۠ۤ۠ۙۛ۠ۨۘ۬ۡۤۧۘۖۨۘۡۘۨۡۗۦۜۘۡۛۚۥۡۘۤ۬ۛۛۗۢۖۥۖۘۥ۟ۨۘۢۧۨۜۨۧۨ۟ۥ۠ۧۗۡۡۘۘۗۡۖۗۢۥۘۡۙۖ۫ۗ۫۫ۧۢۚ۬ۧ۬ۡۨ۟ۛۖۘ۬ۨۡۖۜۗۧ۫ۡ";
                                                            while (true) {
                                                                switch (str5.hashCode() ^ (-1677163611)) {
                                                                    case -1364045254:
                                                                        str4 = "ۛۢۧۗ۟ۘۥۛۥۜۘۥۘۨۘۨۦۦۡۥۙۚۦۘۛۡۦۘۦ۟ۘۥۤ۟ۖۢۢۢ۫ۜۘۧۜ۬ۚۖ۠ۦۗۖۚۤ۫ۚۡۚۢۛۙ۬ۢۡۦۧۘۙۤۥۥ۠۟ۡۦۦۘۢ۠ۢ۫ۘۧۙۘۘۢۡۧۢۨۡۘ۟ۛۥۛ۬ۙۥۦۜۦۜۢۧۚۖۘ۟ۡ۠ۗۜۙۙۘۢ۫ۤۙۚۙۖۦ۬ۖ";
                                                                        break;
                                                                    case -189108431:
                                                                        String str6 = "ۗۜۘۘۖۡۘۘ۠۬۬ۗۖۥۢۖۘۤۗۛۦۨۜۘۖۛۤۧۜۘۢ۫ۤۜ۠ۡۥۨۘۘۦۦۨۘۨ۬ۡۥۗۦۘۡۜ۫ۧۢۘۛۧۥۡۚۥۘۖۖۦۡۜۡۘۦ۫ۗ۠ۗۙۧۗۙ۫ۖۖۘ۠ۥۘۘۨ۟ۨۡ۫ۨۘۜۤۡۘۗۢۡۗۖۦۢۧۡۚۜۘۘۚۤ۠ۜۢۘ";
                                                                        while (true) {
                                                                            switch (str6.hashCode() ^ 916255951) {
                                                                                case -1693062639:
                                                                                    str5 = "۬ۜۥۥۗۜ۫ۖۚۧۦۥۘۖۧۙۚ۠۠ۡ۫ۡۘۥۥۧۘۨ۠۬ۡۘ۟ۙۥۘۦۡۨۘۛۨۢۦۦۖۘۛۗۖۘۙۙۚۖۜ۠ۛۗۧۢۘ۠۟ۢۤۧۙ۬ۙۤۧۙ۫ۚۥۚۗ۬ۘ";
                                                                                    break;
                                                                                case 404833339:
                                                                                    str6 = "ۜۧۘۘ۟ۚۗ۫ۥۧۘۙۤۥۘۖ۫ۖۘۢۡۙۚۚۖۧۘ۠ۤۜۢ۫۠ۨ۫ۦۜۘ۬ۜۦۚۚۧۢ۠ۡۘۨۚۢۚۚۖۘ۫۬ۧۗ۬ۨۢۡۤۦ۫ۡۤۧۗ۫ۨۙۙۢۥۖۧۘۢۢۥۡۛۨۘۢۦۖۙۧۚۗۜۜۘۨۨۖۘ۟ۡۡ۬۟۫ۡۘۖۤۧۦۘۤۢ۬";
                                                                                case 435999949:
                                                                                    str5 = "ۛۙۙۡۢۚۢۘۤۦۚۘ۬ۨۦۘۨ۬۬ۗۢۛۗۥۘ۠۬ۦۡ۬ۗۢۗۗۤۚۖۘۨۗۧ۟ۢۖۘۛۢۡۘ۬ۤۛۨۥۨۖۥۘۘۤۗ۬ۛۡۘۗۘۤ۬ۙۜۘۦۤۚ۫ۦۦۘۘ۟ۜۘۖ۬۫ۦۤۧۡۙۘۘۦۘۥۦۗۙۢۖ۬ۗ۠ۖۘۢۙۖۢۘۦ۟ۜۤۖۧۦۘۨۗۡۛۗۖۘ۟ۧۗ۟ۥ";
                                                                                    break;
                                                                                case 1373867829:
                                                                                    str6 = textView != null ? "ۘۗۥ۬۬ۘۘۡۨۤۛۜ۠ۘۤۨۘۦۤۖۛ۫ۜۧۤۘۘۗۦۡۘۡ۫ۤۧ۠ۢ۬ۤۧۧۘ۬ۛۤۨۘ۠ۖۜۘ۫ۙۜ۟ۧۤۧ۫ۜۘۚۡۚۧۦۘ۬ۤ۠ۗۢۖۜۥ۫۟ۖۦ۠ۙ۫۟ۖۘۡۥۘۘۙۜۗۢۤۘ۠۬ۖۘۡۥۨۘۖۨۧۖۢۜۘۧۨۛۧۗۗۤۨۙ۟ۙۘۘۦ۟ۧۙ۠ۥ۫۠ۙۚۜۡ۠ۧۦۘۘ۟ۘۡۖۗۨۦ" : "۬ۢۨۖ۬ۘۘۤ۫۬۠۠ۙ۠ۚۛۧۧۘۘۚ۬ۢۥۡۨۨۘ۟ۢۤۤۖۧۖۙۨۨۧۢۘۘۤۥ۠ۙۜۡۨ۫۠۟ۢۖ۫ۥۖۘۗۗۤ۬ۜۙۘۖ۠ۥۥۛۢۤۦۘۙ۫ۨ۬ۡۦۧ۫ۙۢۖ۠۠۫ۧۦۡۧ۬ۤ۬ۚۖۛۘۦۘۥۧۥۨ۫۫ۦۡۢۖۗ۫۟ۚۚۤۖۘۘۙۡۘ۬ۡۗ۬ۨۘ۫ۜۥۘ۟ۛۘ۫ۤۖۡۤۖۘ";
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 419708749:
                                                                        str5 = "۟ۗۨۘۖ۬۟ۖۨۨۥۦۢۘ۟۟۟ۘۧۡۦۘ۬ۗۖۧۡۚۛۗۛۗۨ۠ۡۖۤۦۚۦۖۡۘ۠ۛۘۘۜۡۦۡ۫ۜۘ۫ۚۧۛۦۧۙۢۨ۠۫ۦۘۚۢۥۘۖ۬ۙۥۗ۬ۙۖۥۘ";
                                                                    case 1058624999:
                                                                        str4 = "ۜۖۤۧۖۥۘ۬ۘۦۗ۬۟۫۫ۙۨ۬ۚۗۢۡۘ۬ۚۧۡۢ۟ۗۡۢ۟ۧۘۘۗۧۤۛۚۖۘۖۙۥۛ۟ۥۘۡۗۨ۫ۘۖۘۨۨۘۘ۟ۜۦ۬ۤۘۘۛۛۦۘۙ۬ۨۦ۫ۗۧۙ۬ۥۚۛۤ۟ۖۢ۟ۤۖۦۘۙۧۤۗۖۥۘ";
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 328268854:
                                                str2 = "ۚۧۤۤۨۘۛ۬ۖۘۥۧۖۘ۫ۡۖ۫ۢۚ۟ۚ۠ۧۧۚۙ۫ۖۘۦ۠ۤۚۢۢۛۢۨۤۨۘۘۖ۫۬ۖۗۜۥۘۘۗۜ۬ۦ۬۟ۡۥۚۨۤۖۜ۠ۧ۠ۗۥۘۘۧۗ۫۬ۚۜۦ۠";
                                                break;
                                            case 392140655:
                                                str2 = "ۦ۟ۗۨۖۖۗۖۥۘ۠ۛ۠ۙۤ۬۬ۦۦۘ۫ۛۧۖۤۖ۫ۦۡ۟ۥۖۘۛۛ۫ۨۨۥۛۦۧۖۨۤۗۧ۬ۦۦۘۘۨۛ۟ۥۗ۠ۘۚۖۘ۫ۖۧۚۨۘۗۦۘ۟۠ۜۘۚ۟ۥۙ۬ۜۘۢۥۨۘ۫ۦ۫ۥۡۘۘۚۖۨۢۢۧۗ۬۫ۤۙۖۚۢۜۘۨۥۘۙۙ۟ۙۜۘۘۜ۫ۨۘۖۜ۠۬ۡۜۘ۟ۖۚ";
                                                break;
                                            case 1479967197:
                                                str3 = "ۢۨ۬ۖ۟ۧۨ۠ۥ۫ۛۤ۟ۘۨۘۢۥۚۖۡۖ۠۫ۥۛۖ۫ۙۘۡ۟ۚۥ۠ۡ۠ۜۥ۟ۙۚۜ۬ۢۥۘۧۧۖۘ۟۟ۗۗۢۨ۬۫ۘۚۡۥ۫ۚۛۢۥۥۙۛۗ۠۟ۥۗۦۨۥ۫ۢ۬ۥۗۨۘۘۥۥ۬ۘۘ۬ۘۡۥۛۘۚۛۤ۟ۘۙ۟ۖ۟ۤۦ۬ۨ۬ۗۦۦۘۢۥۤۤۤۜۘ۠۫۬ۚۧۢۤۚ۫۠ۗۙ۠۬ۤ";
                                        }
                                    }
                                    break;
                                case -293283735:
                                    str2 = "ۥۙۙ۬۫۬ۢۛۘۖۛۦۛۚۦ۬۠ۧۘ۫ۦۙ۬ۤۧۥۜۘ۬ۚۡۘۥۜۡۡ۬ۢ۫ۦۘۘۗۗ۟۟ۘۨۘۨ۠ۡ۟ۦۘۘۨ۫ۦ۫ۤۥۡ۠ۦۘۙۦۘۖۜۗۤۖۥۘ۠ۙۛۤۢۘۘ۫ۛۘۖۚ۬۟ۤۤۢۜۜ۟ۗۢۥۙۘۘۖۜۧۧۘۢۦۘۙ۫ۛۛۧ۬ۜۦۢۛ۬۟ۗۜۚۖۨ۫۠۟۠ۖ۫۟ۥۥۦ۟ۡۛۦۛ";
                                case -86499372:
                                    str = "ۧۗۤۨ۬ۖۘۡۥ۬ۨ۠ۖۛۙۤۢۥۦۘۗۜۖۖۡۛۗۚۦۘۗ۫۬ۙۛۖۘۖۢۖۚ۠ۥۘۘۢ۫ۚۧۦ۟ۤۖۘۥۦۙۢۖۦۘۡۤۚ۫ۙۦۖ۟ۘۘۜۢۨۘۥۤۖۘ۬۫۠ۤۨۛۨ۠ۖۘۗۧۡۘۨۨۤ۬ۖۨۨۤ۬ۚۥۧۘۗۨۖ۠۟۫ۘۢۤۥۨ۠";
                                    continue;
                                case 721855138:
                                    str = "۫ۧۨۚۖۦۙۨۘۢۧۡۘۨۖۛۘۢۖۜۜۦۡۖ۟ۙۦۘۘۘۗۨۙ۫ۨۚۢۨۦۛۨۘ۬ۙۖۘ۬ۨۙۥۙۖ۟۟ۖ۠ۨ۟ۘۘۨ۟ۘۡۘ۬ۤۜۘۜۤۧۚۖۚۚۙۥۗۘۨۘ۫ۛۚ۠ۢۦۤ۟ۨۤۘۢۢۡۘ۠ۜ۟ۥۦۢۚۥۜۜ۬ۚ۠ۘۡۘ";
                                    continue;
                            }
                        }
                        break;
                    case -1063616353:
                        textView = this.fileNameText;
                        str = "ۖۥۜۘۧ۟ۡۘۜۥۜۘۡ۟ۧۧ۠ۡ۫۠ۖۦ۫ۖۘۢۤۨۘۧۚۗ۬ۙۜۘۘۛۦ۫ۗۢ۠ۥۦۘۡ۠ۘۘ۫ۥۦۘ۟ۘۘۨۦۦۦۖۚۧۦۧۨۥۦۘۢ۟ۚۙ۠۟ۗۤۘۗ۫ۨۘۙۘۥۘ";
                        break;
                    case -928659060:
                        cancel(true);
                        str = "ۢۨۘۖۖۚ۬۫ۚ۬ۤۧۤۦۚۥۜۜۗۨ۫ۛ۠ۗۚۗ۬ۧۙ۠ۨۚ۟ۡۨۤۘۛۥۙۢۡۧ۟ۨ۫ۨۦۚۜ۬ۡۙ۠ۚ۬ۡۗۧ۠ۡۢۤۛ۬ۨۧ۟ۡۘۢۤۘۘۗ۠ۘۘ";
                        break;
                    case -889567887:
                        str = "۫۠ۧۖۙۥۘۜ۫۠ۤۘۢۛۥۧۦ۬۫ۚ۬ۨۦۦ۠ۡۡۜۢۜۜۘۗۢۛۗۤۛۙۨۛۡۗۢۢۦۜۘۜۨ۫ۗۦۥ۫ۤۘۘۛ۫ۥۤۘۖۛۖۦۘۘۗۜۚۨۖۘۘۨۧۘۚۡۤ";
                        break;
                    case -33748344:
                        this.isManualCancelled = true;
                        str = "ۨ۫ۧۧۙ۫ۛۛۜۘۗۦۨۘۙۗ۠ۢۡۖۨۘۡۡۛۦۘۚ۟ۦۘ۟ۧۘۤۙۥۗۥۜۘۗۦۜ۫ۘۢۚۢۥۘ۫ۡۚۚ۠ۦۘۥۥۙۙۦ۟ۖۤۡۘۨۛۖۘۢۜۡۦۚۥۨۤۢۤۖۚۘۢۚۙۛ۟ۗۢۛۜۛۚ۟ۜۜۘ";
                        break;
                    case 140618574:
                        str = "ۜۨ۟ۗ۟۟ۦ۫ۗۡ۫۠ۖۜۧۨۖ۫ۡۢۚۖ۟ۡۦۗۢۥۗۧۙۜۡۘۡۥۖۘۛۢۖۘۨۨ۫۫ۤۦۡ۠ۗۢ۫ۗۨۦۥۘۜ۬ۧ۟ۧۢۧۤۚۢۖۘۙۥۦۧۛۖۡۖۖ۬ۡۨ۟۠ۦۘ۟ۖۡۘۢۛۨۘ۫ۛۙ۟ۚۡۘ۟ۘۧۚۧۡۘۖ۫۠ۘۖ۟";
                        break;
                    case 323298110:
                        return;
                    case 928655255:
                        textView.setText(Deobfuscator$$app.getString(-3440732399119195977L));
                        str = "۫ۧۨۚۖۦۙۨۘۢۧۡۘۨۖۛۘۢۖۜۜۦۡۖ۟ۙۦۘۘۘۗۨۙ۫ۨۚۢۨۦۛۨۘ۬ۙۖۘ۬ۨۙۥۙۖ۟۟ۖ۠ۨ۟ۘۘۨ۟ۘۡۘ۬ۤۜۘۜۤۧۚۖۚۚۙۥۗۘۨۘ۫ۛۚ۠ۢۦۤ۟ۨۤۘۢۢۡۘ۠ۜ۟ۥۦۢۚۥۜۜ۬ۚ۠ۘۡۘ";
                        break;
                    case 1572945648:
                        view.setEnabled(false);
                        str = "ۗۜۥۘۤۢۡۧ۬ۛۖۦۜۜۗ۫ۜۦۧۘۥۙ۟ۛۗۥۘۥۖۛۜۨۦۙۜۦۥ۟ۨ۫ۚۡۚۡۥۘ۟ۗۖۘۖۛۦۘ۬۠ۨۘۢ۫ۥۘۡۤ۬ۤۧ۫ۡۦۘۡ۬ۛۘۡۛۥۧۘۦۜۖۘۥۗۦۘ۫۟ۡۧ۫ۦۡۚۦۚۚۢۚۘۘۗۥۚۤۦۜۧۖۘۗۛۧۜ۟ۤۖۜۖۗۛ۟ۡۧ۟۟۠ۛ";
                        break;
                }
            }
        }

        @Override // android.os.AsyncTask
        protected void onCancelled() {
            super.onCancelled();
            try {
                AlertDialog alertDialog = this.progressDialog;
                String str = "۟۬ۗۤۥۨۘۥۨۘۡ۫ۙ۟ۖۜ۟ۜۤۥۤ۠۬ۘۥۨۧۨۘۢ۬ۥۘۚ۬ۡۘ۫ۨ۟ۡۚۙۛۨۖۨۧۚۛۚۢۛۡۜۗۡۛۘۡۖۘۥۘۜۘۨۚۢۜۡۘۥ۬ۢۘۙۚۗۧۛۦۜۥۗۚۖۘۦ۫ۚۡۘۙۥۜۗۖۢۡ۠ۚۖۘ۟ۦۡۘۤۨۥۘۥۛۖۡۜ۠ۙ۬ۦ۬۫۬ۙۖۙۗۘۧۖۨۨۘ۬ۘ۫ۡۙۡۘۡ۠۬ۡۨۤ";
                while (true) {
                    switch (str.hashCode() ^ (-1976607029)) {
                        case 647928825:
                            String str2 = "ۜۗۖۘۨ۠۠۬۬ۗ۟۬ۢۜۖۢ۠ۛۦۖ۟ۜۛۜۛۥ۟ۙۨۥۚۛ۬۬۠ۥۗۦۖۘۥۖۘۥۙۙۥۜۥۥۢۜۘ۫ۢۦۘۥۘۜۘۡۤۨ۠۠ۢۘ۟ۡ۠ۖۜۡ۬۬ۖ۠ۙۛۧۥۘۦۛۘۦ۬ۙۚۙۖ۟۟ۦۘۜ۫ۜ۬ۡۨۘ۫ۜۙۚ۠ۖۘۡۜ۠";
                            while (true) {
                                switch (str2.hashCode() ^ 1673425369) {
                                    case -1436391140:
                                        str = "ۛۧۦۢ۟ۘۘۧۥۥ۬۬ۙ۟ۨۦۘۥۤۡۙۖۦۘۜۤۘۨۥۚ۬ۗ۫ۦۨۤۦۜۖۙۘۗۤۜۡۜ۬ۜۦ۟ۦۤۚۦۧۘ۫ۡ۬ۜۖۛۖۡۘۘۥۧۧۘۗۢ۟۬۠ۖۡۘۖۚۨۨۡۖۘۘۧۦۚۜۖۘۚ۬ۙۡۘۗۦۧۖۘ۫ۡۖۖ۬ۥ۟ۤۜۘ";
                                        continue;
                                    case -37723428:
                                        String str3 = "ۖۜۢۡۧۜۘۧۘۦۥۡۖۜ۬ۘۦ۠۠ۘ۠ۦۨۛۗۡۗۚۘۥۤۙۚۦۦۢۜۘۤۘۘ۬ۢۥ۫ۘۗ۟۫ۦۚۜ۠ۡۜۦۜۤۨۘ۟ۤۧۗۜۤۚۖۡۢۛۧ۟۬۟ۙۚۦ";
                                        while (true) {
                                            switch (str3.hashCode() ^ 865771245) {
                                                case -1575765999:
                                                    String str4 = "ۜۦ۟۟ۖۡۘ۫ۡۤۤ۬ۚۙۜۖۡۢۨۘۧ۬ۥۛۜۥۘۛۡۖۘۧۤۖۘۚۜۘۧ۟ۘۥۙۚۦۘۡۧۜۜۘۨۜۗ۫ۘۤۡۖۙۙ۠ۡۘۤۜۘۤۢۘۙۡۗۢۚۜۘۜۗۜۧ۟ۜۘ";
                                                    while (true) {
                                                        switch (str4.hashCode() ^ 1454619579) {
                                                            case -1900879731:
                                                                str3 = "ۙۚۗۘۖۦۘۡۧۢ۠ۥ۬ۘۡۘۤۤۛۨۤۥۘۨۙۖۗ۬ۦ۠۬ۘۘ۬ۙ۠۫ۤۥ۬۟ۙۧۥۖ۟ۥۨۘ۟ۛۡۘۧۘۦ۟۬۟۠۠ۚۜ۠ۛۨۜۘۨۦۦۘۧ۟ۨ۬۟ۡۘۖۙۧۙۗۚۧۗ۟ۜۘۖۚ۟۟ۙۡۤ۫۟ۙۘۚۖۘۘ۟ۙ۬ۨۥۘۨۥۘۘ";
                                                                break;
                                                            case 1708205688:
                                                                str4 = "ۜۧۖۘۜۙۨۦۡۘ۬ۛۙۖۙۤۤۤۖۨۨۘۖۥۤ۟۟ۘۨۨۧۡۜ۫ۗۢۥۘۗۡۨ۟ۙ۟ۗۘۘۡۚۢۤ۠ۤۡۢۦۛۤۦۘۤۖۘۥ۠ۤۥۥ۬ۥۥۡۗۦۘۡۥۘ";
                                                            case 1845216483:
                                                                String str5 = "ۙۥۧۘ۫ۘۚ۠ۚ۫ۨۤ۟۟۠ۚۧۥۨۘۧ۟ۘۖۦۨۛۚۦۜ۠ۙ۟۫ۚۙۘۥۘۤۚۘۘۨ۬ۨۛ۬ۙۡ۠ۛ۠ۗ۟ۤۦۘ۬ۜۥۘۗۛۚۡۘۘۘۥۛۨۘۗۜۙۚ۫ۛ۠ۗۗ۫ۥۨۘۥۚۚۚۧ۫۠ۧۥۘۛۤۢ۫ۖۙۨۜۥۗۧۖۘ۬۠ۖۘۥۦ۟ۥۚۗ۫۠ۖۘۦۨۨۘۜۗۗۤ۠ۨ";
                                                                while (true) {
                                                                    switch (str5.hashCode() ^ (-72036879)) {
                                                                        case -1801274562:
                                                                            str5 = alertDialog != null ? "ۖ۠ۨۘۤۜۧۦۙۖۧۙۖۘۖۨۖۘۥ۬ۦ۟ۚۨۦۜۥۘۨ۬ۛ۠۫ۥۚۙۙۙۜۧۛ۫ۦ۠ۘۡۘۖۦۡۘۚ۟ۛۡۘۨۥۘۦۗۜۘۢۦ۟ۛۦۡ۬۟ۨۘۥ۠ۨۘ۟ۜ۫۬۠ۛۨۖۖۘۦۘ۬ۢ۬ۡۦ۫ۙۖ۠ۙۜۜۘۗۡۖۘۙ۠ۜۘۨۜۜۛ۬ۥۧۛۨۗۥۖ۬ۢۚۤۢۥۗۢۖۜۦۖۙۘۡۘۨۧۢ۠۫ۗۙۜ" : "ۢۜ۟ۡۤۨۚ۫ۙ۬ۛۥۘ۠ۦ۠۬ۡۦۘ۟۫ۦۘۖ۬ۨۘۜۙۥۘۧ۫ۜۙۖۦۡۜۧۖۨۧۘۨ۫ۖ۬۬ۗۖۦۚۚۢۜۘۜۙ۫۬ۢ۫ۤۙ۬ۚۚۖۨۧۧۢۛ۫ۡۡۘۧ۫ۥ۠۠۠۫۬۟ۧۙۘۨۚۥۨۤۥۘۖۜۙۜۨۛۡۛ۬ۤۜۖۨۡۡ";
                                                                        case -1309245561:
                                                                            str5 = "ۦ۬ۜۘۗۖۧۚ۠ۥۖۡۜ۫ۥۨۘۜ۠ۢۙۨۥۘۧۡۘۜۤۘ۫ۥۖۘۙۖۖۘ۬ۨۥ۠ۤۦ۫ۥۛۤۤۧ۠ۚۖۡۚۦۖ۬ۥۡۘۖۤۨۘۘ۟۫ۚۗۚ۬ۗۥۘۦۛ۫ۛۖۘۗۡۦۨۖۘۙ۟ۗۤۖۥۚۡۥۘۢۜۨۘۙۢ۠ۜ۫۠ۙ۠ۤۘۦۚ";
                                                                        case 124943847:
                                                                            str4 = "ۡۖۧۘۘۖۦۘۙۚۜۘۡ۫ۜۘۥ۫ۦۘ۫ۧۡۖۢۜۘ۬ۨۥۘۖۥۤ۫ۨۨۦۙۨۘۙۖۚ۠ۗۦۘ۟۬ۙۨۨۡۡ۫ۦۦۢۡۘۘ۫۬ۖ۟۟ۖۦ۫ۖ۫ۛ۟۫۠ۧ۬ۚۚۖۖۨۚۤۨۥۚ۠ۦ۫ۥۜۜ۬ۧ۟ۡۘۖ۫ۘۘ۠۬ۥۘۥۘۢۗۗۥ۠ۧۨۤۧۛۖ۫۬ۙۧۡۘۖ۬ۡۘۛۛ۫";
                                                                            break;
                                                                        case 1867857813:
                                                                            str4 = "۠ۦۦۘۜۖۛ۫ۥ۬ۦۜۖ۠ۢۡۧ۬ۗۧ۟ۢۗۡۦۨ۬۠ۧۥۗ۠ۗۘ۟ۨۙ۟ۢ۠ۦۖۧۡ۬ۘۘۗۘۢ۠ۗۘۘۛۥۧۡۖۘۘۘۜۤۤۤۤۥۘۦۤۢۥ۬ۖۤۦۚۡۢۦ۫ۖۘۖۥۡۡۜۛ۫۟ۥۧۖۘ۠ۖۜۤۙۗۤ۬ۡۘ۟ۛ۠ۗ۠ۦۘۙ۟ۖۘۚ۬ۚۤۧۜ۠ۤۖۘۜۘۖ۟ۦۜۘۡ۟ۗۡ۠ۜۛۡۤ";
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 2048389889:
                                                                str3 = "ۘۨۖ۟۫ۚۢۚ۫ۛۦ۟ۜۙ۟ۥۧۧۜۥۡۘۘۢۛۢۦۗۙۨۤ۠ۡۘۘۤۡۨۙۢ۫ۥۗۘۦۡۙ۟ۥۨ۬ۖ۟ۨۦۛۜۢۤۨۤۧۤۖۥۙۡۘۘۚۦ۫۟ۥۙ۬ۖ۫ۙۛۡۡۧۦۛۤۗۗۗ۟۬ۡۗۢۢۛۢ۬ۗۘ۫ۜۗۥۜۦۘۧۧۜۤۚ۟ۥۗۚ۠۟ۥۦ۫ۖ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 1551153919:
                                                    str3 = "۟۟ۚ۠ۗۥۘ۟ۛۥۘۘۡۤۚۨۥۘۚۨ۠ۖۛۚۤۙۖۧۛۘۥۚۜۖۚۛ۟ۗۨۘۤ۫ۨ۫ۨۡ۫۫۫ۤۤ۟ۤ۟ۥۤۚۨۘۧۗۗۘۖۘۨۜۢۙ۫۬ۜۨۢۛۨۜۦۧۥۧ۫ۡۘۥۚ۟ۙۙۖۘۤ۫ۦۡۜۥۢۨۡۘۜۢۦۙۙۥۡۢۖۥۗۡۘ";
                                                case 1765662935:
                                                    str2 = "ۗۜۙ۬ۛۢ۟ۖ۠ۜۥۗۘۚۤۘ۫ۖۘۦۥۚۙۖ۟ۧ۬ۙۢۥۦۘۚۡۡۘ۠ۘۜۘۦ۬ۜۘۨۧ۬ۧۥۖۘۜۡۘۘۚۖۦ۬ۥۢۢۨۖۖۜ۠۫۫ۖۧ۬ۢۧ۬ۖۤۧۧۧۥۨۘۜ۫ۧۧ۠ۜۘۦ۠۬۬ۘۨۘ۟ۙۖۘ۬۫ۜۘۦۨۥۗۦۢۤ۠۠۫ۚۤ۟۠ۥ۟ۜۖۘۗ۠ۛۖۙۤۜۛ۠";
                                                    break;
                                                case 1964585522:
                                                    str2 = "ۜ۬ۤ۠۟ۖ۫ۡۗ۬۬ۤۤۗۢۦۤۢۛۨۢۢۧۥ۟۟ۖۧ۫ۜۖۡۢۜ۠ۜۘ۬ۢۨ۠ۖۧۘۛۥۘۥۜۙۡۤ۠۟ۚۜۧۗ۬ۨۜۙ۠ۧۜۘ۠ۙۥۘۦۥۥ۫ۦۤۧۥۜۘۤۚۘۘۛۤۦۗ۟ۦ۬۬ۦ۬ۢ۫ۨ۠ۦۛۙۥۘ۬ۖۖۘۘۜۡۗۧۧۡۖۦۖۛۢۨۜۘۗۡۛۢۨۘ۠ۖۛ۬۠ۥۘۤۖۨ۬ۦۢ۫ۙ۠";
                                                    break;
                                            }
                                        }
                                        break;
                                    case 1008542257:
                                        str2 = "ۤۙۘ۬ۢۖۘۦۨۥ۠ۨۗۤۥۥۚۧۙ۬ۖۘۡۖۦۘ۟ۦۖۡۨۚۛ۠ۢۗۧۛۗۙۡۘ۟۫ۘۖ۬ۖۘۤۢۦۘۙ۟ۖۘ۫۬ۥۘۧ۬۟۬۠ۙۡۧۜۘۚۗۦۘ۫ۘۗ۠ۗۧۜۚۨۘ";
                                    case 1404140726:
                                        str = "ۙۚۖۘۥۧۖۤۖۨۘۨۦۤۗۦۡۘ۟ۛۦۘۙ۫ۨۘۤۖۜۘۦۗۥۖۜۖۘۥۛۨۡۨ۫ۢ۟۬ۡۘۖ۫ۖۘ۠ۡۜۥۧۦۘۛ۬۬ۤۖۗ۟ۘۙۙ۫ۨۘۨۢ۫ۗۗ۟ۧۧ۠ۘۛۤۨ۬ۗۘۛ۠۠ۨۨۨۘ۫۠ۤ";
                                        continue;
                                }
                            }
                            break;
                        case 1072046636:
                            str = "ۨۖۘۘ۬ۦۘۘ۫ۙۢۛۚ۫ۤۖۗۦۗۨۘۛۖۨۘۧۚۥ۟ۥۥ۬۠ۜۤۖۖۨۜۘ۟۟ۜۘۤۛۘۘۛۗۢۙۙۢۦ۬ۜۖ۫ۜۘ۟ۢۘۘۦۡۜۦۗۡۧۥۥۗ۫ۛۢۚۜۘۥۡۨ";
                            break;
                        case 1708708298:
                            break;
                        case 1734470163:
                            String str6 = "ۘۘ۠۫ۜۡۚۥۧۚ۟ۤۤ۫ۙۧۥۖ۠۬ۦۘۗۡۜۘ۬ۗۗۘۘۙۚۡۗۦۘ۟ۜۛۖ۟ۥۥۦۜ۠ۖۗ۟ۨۘۢۖۜۘۢۧۘۘۦۤۖۘ۫۫ۦ۬ۘۜۡۛۖۨۛۤۛۨۘۨۡۘ۬ۤۢۛۦ۫۠ۘۧۢ۟ۤۨۢۨۚۨۘۢۜ۠ۗۜۘۘ۫ۢۜ۟۠۬ۦ۫ۨ۠ۘۘۘۦۥۜۘۜۙۚۜ۟ۧۚۦ۠ۜۗۜ۟ۨۚۧ۠";
                            while (true) {
                                switch (str6.hashCode() ^ (-1786030939)) {
                                    case 41485822:
                                        str6 = "۠ۗۚۘۧۨۘۙۥۗۨ۟ۧۢۚۘۚۤۨۗۨ۟ۡۙ۬ۙۖۨۘۤ۠ۦۘۗ۠ۢ۠ۗۨۘۥۗۗۦ۟ۧۧۜۙۛۥۗۤۨۧۘۥۗۜۘۧ۟ۘۛۗ۬ۥۨۡۛۜۙ۫ۧۖۦۥۛۥۘ";
                                        break;
                                    case 936725653:
                                        break;
                                    case 1576697801:
                                        String str7 = "ۜۦۦۘ۟ۨۘۤۜۧۡۤ۬۬ۚۖۗۘۡۘۧۛۙۗۦ۠ۡۡ۫ۗۡۦ۫ۦ۟ۦۡۜ۟ۨۛۘ۠ۥۘۥۢۦۘۙۨ۠ۙ۫ۨۚ۟۟۟ۚۖۜۘۨۜۥۘۥۖۦۨۤۖۘۡ۬۫ۥۦۘ";
                                        while (true) {
                                            switch (str7.hashCode() ^ (-1199698892)) {
                                                case -1461851482:
                                                    String str8 = "ۦۥۗۘۗ۬ۦۦۢ۬ۖۙ۟ۡۡۘۤۗۥۘ۠ۧۖۖ۟ۢۥ۬ۦۘۙۘۢۧۗۦۧۧ۫۠ۢۢۦ۬۟ۗ۟ۨۥۧۢۙ۟۬ۗۦۛۜۘۖۘۖ۬ۘۘۥ۫۠ۤۡۖۘۗۗۤۜۛۦۘۦ۬ۦۘ";
                                                    while (true) {
                                                        switch (str8.hashCode() ^ (-1329723422)) {
                                                            case -34744123:
                                                                str8 = "ۘۚۜۘۦۡۛۦۢۙۦۡۡ۟ۡ۠ۥۜۨۜۘۨۘۖۖۖۖۦ۬ۘۙۛۢۚۖۛۤۗۖۘۢۦۖۧۛۦۦ۬ۤۧۥۨۥۘۛۛۦۖۘۛ۠۬ۙۗۥۘۤۢۜۚۛۡۨۦۢۡۚۛۖۗۡ۟ۥۖۘۦۘ۫ۦ۟ۚۙۗ۫ۙۘۗۙۧۥۜۡۢ۠ۨۘۛۛ";
                                                            case 263727545:
                                                                String str9 = "۟۬ۦۨۜۜۧۤۥۥ۬ۛۚۨۜۚۨۦۦۖۘۜ۠ۨۚۘۛۦۜ۟ۦ۬ۥ۫ۜۦۘۘۙ۬ۚ۬۟ۤۖۛۨۛ۠۬ۢۗۙ۠ۧۢ۬ۚۨ۫ۧۜۚۥۥۢۜۘۢ۬ۖۦۤۗ۫ۢ";
                                                                while (true) {
                                                                    switch (str9.hashCode() ^ (-1290332395)) {
                                                                        case -2059125346:
                                                                            str8 = "۟ۘۘۘۧ۫ۤۙۦۧۘۗۙۤۤ۠ۗۤۧۜۘۘۛۡۘۖۙۥۘ۬ۜۖۜۤ۬۫۠ۗۛۡۦۜ۫۟۟ۦ۬ۛۛۜۡ۠ۙ۬ۨۦۘۖۦۧۘۙۛۖۥۚۤ۟ۦۘ۟ۧۗۤۦۡۘۡۛ۬ۨ۬ۗۦۤۨۚۨۡۤۗ۬ۛۧۡۗۚ۠";
                                                                            break;
                                                                        case -1644146439:
                                                                            str8 = "۠ۥۥۚۤۥۘ۟ۖۦ۠ۜۘۘۛۙۜۨۧۥ۠ۧۜۖۛ۠ۢ۟ۗۡۘ۠ۛۨۖۨۘ۫ۨ۬ۚۘۨۦۘۧۗۧۘۘۦۧۙۘۘۢۢ۫ۧۢۘۤ۟ۛۡۢ۠ۡۘۤۛۘۘۤ۟ۢ۫ۧۦۘۖۛۨۛۧۨۘۗۖۧۘ۠ۗۘۘۤۤۙ۠۠ۜۘۖۜ۫ۥۖۤۚ۬ۘۤۨ۫۠ۛۧۙۖۘۛۡۨۘۦ۬ۖۘ۬ۖۖ";
                                                                            break;
                                                                        case 10702947:
                                                                            String str10 = "ۥۦۚۤۥۘۘۢ۫ۖۢ۫ۚۢ۫ۜۘ۫ۗ۟ۚۖۢۗۛۤۜۛۧ۫۬ۤ۟ۤۘۚ۠ۘ۟ۨۧۘۖۘۘۦۤۖۘۚۡۦۜ۫ۧ۬۫ۡۘ۬ۙۧ۟۫۫۟۠ۦۘۤ۠ۜۘ۠ۛۘۘۛۥ۬ۧۜۡۖۧۜۘۤۨ۟۠ۨۧ۟ۘۧۗ۟ۡۘ";
                                                                            while (true) {
                                                                                switch (str10.hashCode() ^ 750554030) {
                                                                                    case -1177712594:
                                                                                        str10 = alertDialog.isShowing() ? "ۗۜۡۛۗۡ۬ۢۜ۟ۥۧۘۚۥۛۛ۟ۛۧ۠۫۫ۜۛۨۢ۫ۢۜۢۡۘ۠ۧۙۛۜۖۘۚۧ۠ۥۚۡۘۧۗۘۥ۫۟ۡۥۧۘ۟ۢ۬ۡۥۤۤۗۙۤ۫۠ۦ۬ۗۜۗ۫ۖۗۜۥۜۦۡ۠ۗۙ۠ۧ۟ۡۥۦۘ۟۫ۥۘۚۜۤۡۨۖۘۛۜۜۘ۠۠ۘۘ۟۬ۗۘۚۛۜۧ۟ۙۥۚۜۘ" : "ۗ۠ۘۘۖۚۙۖۡۧۨ۠ۦۜۡۘ۠ۜ۟ۙۤ۬ۛۥ۠۠ۡۖۘ۟۟ۘۖۜۖۘۘۥۨۤ۬ۧۡۤۧۡ۬ۢۙۛۘۜۘۦۘۨۖۛۛ۫ۘۘۦ۟ۨۜۤۙ۬ۖۥۘۨۘۙ۟ۘۤۜۧۛۤۗۖۘۗ۫۫ۥۧۘۙۖۦۘۦۥ۫۬ۨۡۨۧۡۘ۬ۛۢۗ۬ۥ";
                                                                                    case -191611590:
                                                                                        str9 = "ۥۛۤۘۥۘ۠ۚۘۘۥۡۚۧۖۥۘ۠ۗۙ۫ۖۜۙۦۡۡۥۛۥۦ۟ۢۢۨۢۖۡۚۢ۠ۖۦۜۘۚۢۘۘۤ۫ۤۦ۟ۗۛۗۦۙ۠ۢۚۛۢۥۗۤ۟ۗۗۛۚۦۚۨۦۘ۬ۨ";
                                                                                        break;
                                                                                    case 1084741505:
                                                                                        str10 = "۟ۙ۟ۜۤۥۘۛۤۚۦۤۨۨۦۛۜۚ۫ۙۜ۠ۖۗۡۗۧ۠۠ۤۡۢۧ۟ۜۤۤۢ۠ۦۥ۫ۡۧ۟ۡۛۜۧۘۚ۟ۙۦۚۡۘۧۧۜۘۤۗۜۘۡ۬ۛۙۚۥۥۨۘۛۙۜۘۗۙ۟ۧۦۦۗۛ۠ۢ۫ۤۥۖۗۛ۟ۥ";
                                                                                    case 1785992364:
                                                                                        str9 = "ۖۛۦۘۦۨۖۘ۬ۥۥ۟ۧۨۨۚۦ۬۬ۛۛۜۡۘۖۘۤ۬ۡۛۖۤۢۦۧۗۢۚۢۦۘۘۙۨۨ۟ۢۢ۬ۘۧۗۤۖۘۚۜۜۘۛۥۥۘۨۧۘ۟ۨۘۗۚۘ۟ۛۡۚۨۙۙۛۗۜۗۙۤۢ۬ۤۙۜۛۗۘۘۚۗۚ";
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 546907388:
                                                                            str9 = "۟۟ۢ۬ۢ۫ۗۤۨۘۛ۫ۥۜۤۥۘۙۤۤ۬۟۫ۗ۫ۡۘ۠ۖۜۤ۠ۚۙ۟ۦۥ۠ۨۘ۫ۨۦۘۨۨۤۖۜۘۖۧۡ۠ۦۙۨۡۦۢۤۙۗ۟ۧۧ۠ۨۦۦۘۛۛۨ۟ۙ۫ۥۦۦ۠ۚۗۘۖۤۛۦۡۘۘۖۥ۫۫ۡۘ۫۫۫ۗۥۖۢ۠۠ۖ۠ۙۛۜۧۖۗ۬ۙۨۢ۫ۢ۠ۘۙۜۘۧۙ۟ۦۖۜۘۢۗۦۢۧۨ۠ۜ۬ۖۜۥۘ";
                                                                    }
                                                                }
                                                                break;
                                                            case 1242653272:
                                                                str7 = "۫ۜۥۘ۫ۡۜۘ۬ۘۜۘۦ۠۟ۤۨۘۘۨ۫ۖۦۧۘۘ۠ۘۜۗۥۘۘۦۘۦ۬۫۟ۦۖۗ۟۟ۧۡۘۡۧۡۛۤۙۘۤۦۘۤ۟ۜۤۛۦۜ۟ۜۛ۬ۚ۠ۛ۟ۢۢۜۥ۟ۘۘ۠ۤۧۙۨۗ۠۠ۦ۟ۧۧۙۙ۠ۖ۬ۘۘۡۨۨۡۤۜ۠ۡۙۧۦۘۙۦۙ";
                                                                break;
                                                            case 1326425592:
                                                                str7 = "ۡۨۤ۫ۢۧۚۘۥۘۚۡۖۘۥۡۘ۫ۤۥ۠ۦۘۡۤۨۢۜۧۥ۫ۨۙۡۦ۫۠۬۫ۤۢ۫ۡۘۘ۫ۡۧۘۤۨۘۘۤۛۛۧ۠ۨۘۗۖۡۘ۬ۖۨۢۧۜۘۥۚۡۘۨۘۗۡۢ۠ۡۜۙۡۧۧۗۨۨۘ۬ۙۧۗۧۦۘۨۙۜ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case -358239435:
                                                    str6 = "ۖۢۨۘۗ۫ۘۘۧۙۧۦ۬ۤۖ۠ۛۙ۬ۘۘۡ۠ۜۨ۠ۧۗۧۜۘۜۨۖ۟ۜ۠۟ۥۨۘۙۥۡۙۖۤۙۧۦۖۥۢۤۗ۟۬ۤۨۘۗۛ۠ۥۨۖۚۤۜ۟ۧۙۘ۠ۨ۫ۧۡۛۚ۫ۛۤۥۘ۠۫۬ۧ۟ۛ۟ۚۤ۠ۛۖۙۖۖۦۖ۟۫ۡۘ۬ۨۥۡۨ۫ۘ۟ۚۡۦۢۢۖۡ۟ۙۤ۫ۢۡۡۛ۠ۦۡۦ۫ۘۘۦۧۤۘۖۤ";
                                                    continue;
                                                case 1224658558:
                                                    str6 = "۟ۘۤ۫ۙ۠ۚۨ۠۬ۡۘۘۜۤۛۛ۫ۜۘ۟ۛ۫ۙۦۗۙ۫ۡۢۛۦۚۖ۫ۙۤۦۘۜۦ۟۬ۢۙۛۨۘۤۧۨۚۢۖۘۚ۫ۧۘۤۖۘۗۙۥۦۙۨۘ۬ۙۧۘۖ۫۠ۥۜۢۧۥۘ۬ۚ۠۠ۙۖۛۖۗۤۜ۫۫۠ۖۘ۟۫ۚۦۨۜۘۢۚۜۘۖ۠ۚۘۖۘ۬۫ۖۙ۫ۧۗۗ۠ۛۤۥۘۙ۠ۘ";
                                                    continue;
                                                case 1951603435:
                                                    str7 = "ۚ۠ۨۘۜۛ۬ۘ۬۬ۢۧ۟ۥۧ۫ۗ۟ۦۘۗۤۦۘۜۡۦۨۖۧۖ۬ۧۜ۫ۦۘۧۨۥ۫ۙۜۧۗۘ۠ۙۛۧۡۨۘۛۗۨۘۨۗۙۗۛۨۙۢۥۘۥۖۧۖ۬ۨۡۦ۬ۚۗ۬ۡ۫۟ۚۛۖۖۗۢ۬ۨۗۤۤۜۘۧ۫ۗۤۨۡۘ۫ۧۦۤۤ۬ۙۘۖۘۗۙۥۘ۟ۛۨۘ۫ۤ۫ۥۢ۟ۜ۟ۥۘۙۗۥ۠ۚ۫۠ۛۜ۫ۤۧۦۦ۟ۡۗۢ";
                                            }
                                        }
                                        break;
                                    case 2026905163:
                                        this.progressDialog.dismiss();
                                        break;
                                }
                            }
                            break;
                    }
                }
            } catch (Exception e) {
            }
            String str11 = "ۤۜۦۘۖ۬ۤۙۤۡ۬ۗ۬ۜ۫ۜۘۗ۫۠۠ۥ۟ۧۧ۬۟ۘۧۙۗۤ۠ۡۛۙۡۤ۠ۥۦۡۚۧۖۧۘۘ۬ۢ۬ۢۡۦۖ۫ۖۘۙۙۙۙۘۡ۟۬ۦۛۡۘۢۚ۫ۜۜۥۜۜۨۘۦ۠ۛۚۦۖۘۥۤۖۧ۟۟۟ۙ۬۟ۤۧۡۥۧۘ۬ۡۖۘ۠ۜۦۘ۟۟ۡۘ";
            while (true) {
                switch (str11.hashCode() ^ 1751711798) {
                    case -1960510668:
                        Toast.makeText(this.this$0.getApplicationContext(), Deobfuscator$$app.getString(-3440732480723574601L), 0).show();
                        return;
                    case -1372590145:
                        return;
                    case -165386226:
                        String str12 = "ۘۙۡۘۥۚۡۘۨۗۘ۬ۖ۠۫ۧۤۧۤۘۘۧ۫ۚ۟ۧ۟ۦۛۜۡۖۥۥۤۢۛ۠ۖ۬ۤۘۦۢۨۘ۠ۢۢۗۥۖۘۙۤۚۖۨ۟ۘۜۦۢۛۘۚۚۡۘۙۗۘۘۡ۠ۡ۫ۖۜۜۨۡۘۦۜ۠ۛۨۨۢۖۘۘۧۨۖۨ۟ۨۥۗۦ۠ۘۙۡ۠۟ۤۥ۠ۛۗۛۡۨۘۥۨۡۘۖۖۚۘۗۤۢۧۘۘۘۨۡۘ۠۠ۦۗۢ۬ۡۖۙ۬ۨ۫";
                        while (true) {
                            switch (str12.hashCode() ^ (-1371892476)) {
                                case -229960554:
                                    str11 = "ۜ۟۠ۙۦۜۜۦۨۘۘۥ۬۫ۖۘۡۡۢۜۡۘۘ۫۬۟ۜۛۘۘۥۡۧۦۖ۟ۡۚۦۖۨۗ۠۬ۧ۫ۖۘ۠ۖۥۧۦۨ۬ۖۢۗۡۖۘۘۙۤۖۙۡۚۧۛۨۨۥۘۥۖۦ۟ۜۧۘ";
                                    continue;
                                case -221340564:
                                    String str13 = "ۦۘۙ۟ۗۖۘۥۘۨ۫ۤۦۘۨۦۧۨۨۙۦ۠ۨۗ۟ۨۘۢۘۘۤۙ۠۫ۡۚۤۘۘ۬ۤۚۡ۫ۡۘۡۨۨۘۛۗۜۦۡۥۘۗۨ۬ۖۦ۫ۤ۬ۡۖ۠ۜۗۢۖۚ۟۫۫ۘۘ۬۬ۘۘۛۚۚۜۦۨۦۨۚ۫ۚ۬ۨۜۧۘ";
                                    while (true) {
                                        switch (str13.hashCode() ^ 948730768) {
                                            case -238075968:
                                                str13 = "ۡۧۘ۠ۚۡۘۛۙۥۙۚۘۘۜ۫۠۫ۚۦۘۚۧ۫۫ۚۥ۫ۡ۟ۨۖ۟ۚۧۖۘۦۡۛ۫ۡۙۗۖۨۘۙۜۦۙۡۦ۠ۦۦ۬۟ۘ۬ۙ۫ۚ۬ۡۦۡۘۘۜۨۘۘۦۜۤۖۡۜۘۨۛۤۤ۟ۜۨۦۖۘ۫ۜۗ۠ۦۤۙۛۢ۬ۜۚۜۢۡ۠ۘۦ۟ۜ۠ۙ";
                                            case 336468474:
                                                str12 = "ۙ۠۟ۦ۟ۜۘۙۗۦۘۢۘۜ۠ۦۧۛۜۡۙۙۥ۬۠ۧ۬۠ۡۘۥۚۨۦۨۥۘۡ۟ۛۧۜۦۘ۬ۡۘۘ۬ۥۢۤۖۜۘۥۚۙۙۢۛۡۚۘۘ۫ۛۡۘۚۨۨۘۜ۟ۖۘ۠ۜۘۘۥۨۡۦۡۨۘۖۥۨۚۨۛۨۤۗۨۥۘۘۛ۟ۡۢۖۘۤۤۤ۠ۖۖ۠ۛۘۘ۟ۘۘۘۦۨۦۘۤ۫ۚۧۗۖۛ۠ۘۙۚ۠۠ۚۢ۠ۚۖۘۧ۠ۥۘۜ۫ۚۨ۫ۜ";
                                                break;
                                            case 1476917983:
                                                str12 = "ۢۛۢۨۖ۠ۖۧۥۘۤ۫ۘۘۢۘۧۨۨۥۨۡ۟ۢ۫ۦۘ۬ۙ۫ۘۧۢ۠ۥۘۛۙ۬ۚۥۨ۠ۥ۠ۢۛۗۡۨۧ۫ۢۥۙۡۙۙۙۢۖۥۖۢۙۨۘۤۨۖۘۖۢۡۨۤۨۚۙۦ";
                                                break;
                                            case 1547275136:
                                                String str14 = "ۧۧۙۡۦۨۘ۫ۖۦۘۦۤۜۡۨۙ۟ۙۗ۠۟ۡۧۨ۠ۥۘۜۜ۠ۛ۠ۢۘۢۨۘ۟ۧۢۗ۬ۘ۬۫ۚۢۨۦۘۧ۠ۜ۫ۖ۠۠ۢۦۢۥۛۜۘۖۦۢ۟ۡ۫ۛۘۦۙۥۘ۫ۗۖۘۨ۠۟ۦۨۧۢۢۘۘۢۖۖۙ۫ۦۘۛۗۥۛ۬ۨۚۨۜۧۦۨۘ";
                                                while (true) {
                                                    switch (str14.hashCode() ^ (-1623692117)) {
                                                        case -201102853:
                                                            str13 = "۬ۛۨۜ۫ۜ۟ۦۥۤۘۙۖ۫ۨۘۜ۠ۢۥ۬ۦۘ۟ۦۚۡ۬۬ۡۘۗۗۘۚۢۢۦۛۘۡۘۜۢۡۘۙۘۖ۟ۥۧۖۨ۫ۛۗۖۘۜۙۥۘ۟ۜۖۘۤ۫ۥۘۖۧۗۗۢۨ۫۟ۡۘۧۥۥۘۢۤۦۜۖۥۧ۠ۦۘۙۖۥۙ۬ۢۢۢ۬ۦۡۡۘۧۖۢۗۗۛۚۚۧۦۨۦ۫۠ۦۡۦۡۘۥۘۧۘۤۦۨ";
                                                            break;
                                                        case 347025812:
                                                            str14 = "ۥۛۥۘ۠ۛۜۘۚۖ۠ۤۛۖۘۜۖۘۥۙۢ۬ۨۘۥ۫ۘ۫ۥۧۘۧۗۦۘۖۤۨ۬۫ۖ۟ۥۜ۫ۡۘ۬ۢۧۖ۫ۚۗۨ۬ۥۢۗۘ۬ۨۘۚۧ۫ۙۢۥۜۜۘۘۧۛۙۙۗ";
                                                        case 631329758:
                                                            str13 = "ۘ۬ۦۚ۬ۙ۬ۡۘۡۘۨۘ۫ۥ۬ۤۨۙۙ۫ۥۘۖۙۥۘۧ۬ۗۙۧۤۦۡۢۘۦۢ۫ۤۢۤۢۦۖۦۗۘۖۧ۬ۜۘۜۘۥۥۛۖۨۡۘۗۢۘۘۡۛۚۙ۫ۚۤۚۦۧۙۦۛۗۜۘۙۧۢۡۖۡۘ۫ۡۛۥۖۥۘۖۜ۫ۚۜۡۘۖۖۥۘ۠ۙۥۘۙ۫ۢ";
                                                            break;
                                                        case 1176679805:
                                                            String str15 = "ۧۧ۠۟۬ۡۘۜ۠۠۬ۜۡۘۙۢۥۛۗ۟ۥۛۖۧۢۚۙ۟ۘۘۦۚ۬۬ۤۖۘۡۦۥۘۡ۫ۜۘۧۚۛۢۛۜ۬ۚۛۜۙۜۘۙۢۖۘ۫ۢ۟ۨ۟ۨۘۖۗۥۘۜ۟ۘۘۗۥۘ۫ۥۗۧۖۜۡۥۢۙ۬ۥۘۖۚۜۘۨ۟ۤۜۦۦۢۥۨۗۡ۫ۜۧۘۥۖۧ۟ۘۜ";
                                                            while (true) {
                                                                switch (str15.hashCode() ^ 86564029) {
                                                                    case -976271549:
                                                                        str15 = "۬ۢۡۚۖ۟۫ۢۤۚۗۘۘۨۧۘۘۙۧۧۨ۫۟۠ۧۤۚۙۦۡ۟۫ۗ۫ۚۦۙۡۘ۟۠ۘۖۡۦۙۡ۫ۢ۠ۦۘۥ۫ۜۧۙۙۖۧ۫ۨۖۘ۫ۚۢۨۦۧۘۛۥۜۘۦۤۥۚۢۗۧۢۘۨۦۥۧۧۧۢۛۨۧۘۚۘ۠ۜۘۧۜۤۢۡۧۘۘۡۥۢ۠ۦ";
                                                                    case -68635219:
                                                                        str15 = !this.this$0.isFinishing() ? "ۚۗۦۜۘۨۘۤۨۘۘۖۦۜۨۖۘ۠۟۟ۖۙ۫ۢ۫ۦۤۢۖۘ۟ۢ۫ۧۤۙۤ۫ۤۘۘۘۧۥۙۛۖۙۚۚ۠۫۟ۤۡۚۘۛ۠۟ۙ۬ۧ۠ۥۘۡۡۜۘ۬۫ۥۡ۫۟ۙ۬ۥۗۘۘ۟ۘۤۖۛۘۘ۠ۨۜۡ۬ۗ" : "ۦ۠ۥۘۗۢۧۤۚۗ۟ۜ۬ۙۗ۠ۡۘ۟ۡۧۥۥۡۦۥۧ۟۟۬ۥ۬ۚۢۧ۟۟ۗۛۤ۫ۖۨۧ۠ۧۥۘۗ۬۬ۦ۟ۦۘۨۛۨ۫ۤۦۘۜۤۧۥۜۢۥ۫۬۠ۛ۬۟ۘۘۘۢۗۨۢۘۡۘۡۥۨۛۙۙ۟ۙۗ";
                                                                    case 328657121:
                                                                        str14 = "ۤۦۨ۠ۗۡۗ۟۟ۦ۬ۨۘۦۜ۟۬ۚۡۘۛ۬ۚ۫ۗۚ۫۫۠۟ۜ۟ۚۜۘۗۚ۠ۗۖۘۘۚ۟ۤۗۘ۠ۘ۬۫ۚۧ۟ۙ۫ۙۚۨۧۗۜۘ۠ۤۥۘۙۧۢ۫۫۠ۙۚۥ۠۬ۛۨۥۦۘ۠ۛۥۗۤۥۛۙۚۚ۬۟";
                                                                        break;
                                                                    case 344003756:
                                                                        str14 = "ۨۘ۫۫ۙۡۨ۟ۚۙۦۚۖۥۦۘۖۨۦۤۦۜۘۢۧ۫ۖۗۧۢ۬ۨۨۖۜۦ۬ۙۛۛۧ۠ۘۖۙۗۦۛۜۦ۠ۛۥۗ۟ۛ۫ۥۘۤۥ۬ۛۜۖۛۙۙۙۤۦۧۜۚ۠ۡ۟ۜۘۘۙۨۦ۫ۡۡ۟ۡ۫ۡ۫ۨۙ۫۟ۦ۟ۧۤ۟ۡۚۡۖ";
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case 1689261923:
                                    str12 = "ۡ۠ۥۢ۠ۥۘۖۦۨۘۧۧۦۢۡۧۘۙۛۜ۫۠۠ۨۥ۟ۡ۫۠ۡۚۖۘۖۥۛۛۛۥۛۤ۟ۡۦۜۡۦۥ۟ۚۖۘۧۢۥۜۨۖۧۨۘۧۨۦۘۖ۟ۡۘۨۖۧۛ۟ۘۚۙۜۘۚۥۜۜۜۘۛۤۖۚۖ۫ۖۦۥۤۧۢ";
                                case 1948128715:
                                    str11 = "ۦۗۥۦۛۘۘۚ۟۬ۡۗۦۘۡ۟ۧۥۨۦۗۖۗۢ۬ۢ۠۬ۘ۠ۢۛۧۗۨۘ۟ۜۦۘۖۨۡۢ۟ۖۘۧۙۦۡۘۜۡ۟ۧۨۜۡۘۙ۫ۤۢ۫ۡۢ۫ۚۘ۠ۛ۬ۢ۫ۢۜۘۖۖ۫ۙۙۥۘۢۦۡۘۢۦۥ۟ۤۢۦ۫ۡ۟ۛۤۗۨۤ۬ۥۘۨ۫ۛۚۤۡۘ";
                                    continue;
                            }
                        }
                        break;
                    case 1978962136:
                        str11 = "۬ۥۥۘۙۘۖۤۥ۬۠ۧۙ۟ۨۘۥۤۛۦۤۧ۬ۨۥۢۢ۬۬ۧۦۘۙ۟ۦ۫ۗۦۥۖۡۘۜۥۤۜۖۡۨۗ۫ۗ۟ۤۛ۟ۚۥۖۤۨۖۘۡۦۢ۠ۨۧۘۥۘ۟ۚ۫ۛ۟ۚ۬";
                        break;
                }
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 379
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        /* renamed from: onPostExecute  reason: avoid collision after fix types in other method */
        protected void onPostExecute2(java.lang.Boolean r9) {
            /*
                Method dump skipped, instructions count: 1098
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kentos.loader.activity.MainActivity.FixObbDownloadTask.onPostExecute2(java.lang.Boolean):void");
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
            String str = "ۘۤۤۜۨۥ۟ۤۦۧۙۤۥۢۨۘ۬۟ۙۦۥۧۘ۬ۢ۫ۨۜۤ۫ۡ۠ۛۤۙۤۨۘ۬ۡ۬ۜۧۛۘۡۘۘۤۜۤۨۛ۫ۡۥۗۢۦ۫ۦۛۡۘۘۦ۫۟۫ۡۘۛۨۡۘۜۜ۠";
            while (true) {
                switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 570) ^ 924) ^ 153) ^ 519) ^ 689) ^ 447) ^ 739) ^ 431) ^ 355) ^ 798) ^ 391) ^ 781) ^ 822) ^ 359) ^ StatusLine.HTTP_TEMP_REDIRECT) ^ 148) ^ 355) ^ 207) ^ 962) ^ 231) ^ 964) ^ 498) ^ 642) ^ 228) ^ 817) ^ 754) ^ 310) ^ 271) ^ 556) ^ 846) ^ 579) ^ (-2004068591)) {
                    case 74753279:
                        onPostExecute2(bool);
                        str = "ۡۙۥۘۨۘۜۡۜۦۥۙۘۘۛ۬ۙۜۢۖۘ۠ۧۛۜ۟ۢۙۚۡۘۚۢۡۗۙۜۨۙۖۤۧۦۘۦۨۧۘۦۢۦ۫ۛۖۗۥۡۘۤۢۥۧۗۛۚۤ۟ۜۤۚۘۖۦۘۜۙ۫۬ۜۗۜۖۡۘ";
                        break;
                    case 1284720398:
                        str = "ۨ۫ۛۛۥۘۙۤۘۘۥۧۜۢۙۥۗ۫ۡۗ۠ۢۚۦۥۘۦۗۜۘ۬ۛۖۘۤۘۤ۬۬ۡۘۖ۟ۛۙۛۚۛۥۖ۟ۙۡۘ۟ۜۢۜ۟۠۟۠ۘۢ۠ۚۦۥۥۘۦۥۗۨۨۖۗۢ۫۬ۦۧۘۦۖۜۨۧ۬ۖۨۡۦۢۙۙۘۡۙ۟ۖۘۘ۠ۚ۠ۖۖۘۜۘ۠ۙ۟ۦۢۙۤ۟ۖۨۘۤۖۥۨۚۜۙۢۨۘ۫ۙ۬ۨۧۨۘۡۙۧۖۧۨۘ۠ۧۙ";
                        break;
                    case 1624328654:
                        str = "۫ۘۡۘ۫ۢۗۙ۠ۘۧ۟ۧۦۢۥۘ۟ۛۥۚۤۡۘۨ۠ۡۘۙۧۤۗ۫ۧۡۖۦۘۡۖۘۦۜۘۦۗۘۘۘۚۨۘۤۤۚۗۡۜۘۖۛۥۘۥۛۢۢ۟ۘۜۢۖۘۛۤۡۘۖۧ۠ۧ۟۠ۘۖۧ";
                        break;
                    case 1923391483:
                        return;
                }
            }
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            String str = "ۥۜۤۥۚۘۘ۫۫۫ۢ۬ۨۘۗۨ۫ۥۛۚۥۘۨۘۖۖۥۘۧ۫ۥۦۗۚۖۜ۬ۡۦۨۢۖۘۙۙ۬ۜۚۨۘۚۖۗۨۨۛ۟ۖۛۥۡۗۡۛۢ۟ۤ۫ۨۡۢۡۥۘۡ۫ۙۡ۬ۦۖۦۚۤۦۖۜۨۛۤۙۜۘۤۤ۫ۙۗۨۘۥۙۜۘۙۛۥۘۖ۟ۧۤۘۡ";
            while (true) {
                switch (str.hashCode() ^ (-592084213)) {
                    case -1696452055:
                        try {
                            LinearLayout linearLayout = new LinearLayout(this.this$0);
                            linearLayout.setOrientation(1);
                            MainActivity mainActivity = this.this$0;
                            int access$100 = MainActivity.access$100(mainActivity, mainActivity, 20);
                            linearLayout.setPadding(access$100, access$100, access$100, access$100);
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            gradientDrawable.setColor(-1);
                            MainActivity mainActivity2 = this.this$0;
                            gradientDrawable.setCornerRadius(MainActivity.access$100(mainActivity2, mainActivity2, 12));
                            linearLayout.setBackground(gradientDrawable);
                            TextView textView = new TextView(this.this$0);
                            this.fileNameText = textView;
                            textView.setText(Deobfuscator$$app.getString(-3440728580893269833L));
                            this.fileNameText.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                            this.fileNameText.setTypeface(null, 1);
                            this.fileNameText.setTextSize(16.0f);
                            linearLayout.addView(this.fileNameText);
                            ProgressBar progressBar = new ProgressBar(this.this$0, null, 16842872);
                            this.progressBar = progressBar;
                            progressBar.setMax(100);
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                            MainActivity mainActivity3 = this.this$0;
                            layoutParams.topMargin = MainActivity.access$100(mainActivity3, mainActivity3, 12);
                            MainActivity mainActivity4 = this.this$0;
                            layoutParams.bottomMargin = MainActivity.access$100(mainActivity4, mainActivity4, 4);
                            this.progressBar.setLayoutParams(layoutParams);
                            linearLayout.addView(this.progressBar);
                            LinearLayout linearLayout2 = new LinearLayout(this.this$0);
                            linearLayout2.setOrientation(0);
                            TextView textView2 = new TextView(this.this$0);
                            this.percentText = textView2;
                            textView2.setText(Deobfuscator$$app.getString(-3440728224410984265L));
                            this.percentText.setTextColor(-12303292);
                            this.percentText.setTextSize(12.0f);
                            this.percentText.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                            linearLayout2.addView(this.percentText);
                            TextView textView3 = new TextView(this.this$0);
                            this.sizeText = textView3;
                            textView3.setText(Deobfuscator$$app.getString(-3440728211526082377L));
                            this.sizeText.setTextColor(-12303292);
                            this.sizeText.setTextSize(12.0f);
                            this.sizeText.setGravity(GravityCompat.END);
                            this.sizeText.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                            linearLayout2.addView(this.sizeText);
                            linearLayout.addView(linearLayout2);
                            TextView textView4 = new TextView(this.this$0);
                            this.speedText = textView4;
                            textView4.setText(Deobfuscator$$app.getString(-3440728168576409417L));
                            this.speedText.setTextColor(-7829368);
                            this.speedText.setTextSize(12.0f);
                            this.speedText.setGravity(17);
                            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                            MainActivity mainActivity5 = this.this$0;
                            layoutParams2.topMargin = MainActivity.access$100(mainActivity5, mainActivity5, 4);
                            MainActivity mainActivity6 = this.this$0;
                            layoutParams2.bottomMargin = MainActivity.access$100(mainActivity6, mainActivity6, 16);
                            this.speedText.setLayoutParams(layoutParams2);
                            linearLayout.addView(this.speedText);
                            MaterialButton materialButton = new MaterialButton(this.this$0);
                            materialButton.setText(this.this$0.getString(C0931R.string.str009b));
                            materialButton.setBackgroundTintList(ColorStateList.valueOf(SupportMenu.CATEGORY_MASK));
                            materialButton.setTextColor(-1);
                            MainActivity mainActivity7 = this.this$0;
                            materialButton.setLayoutParams(new LinearLayout.LayoutParams(-1, MainActivity.access$100(mainActivity7, mainActivity7, 45)));
                            materialButton.setOnClickListener(new View.OnClickListener(this) { // from class: kentos.loader.activity.MainActivity$FixObbDownloadTask$$ExternalSyntheticLambda0
                                public final MainActivity.FixObbDownloadTask f$0;

                                {
                                    this.f$0 = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    String str2 = "ۢۗۡۖ۟ۘ۬ۚۙ۫ۤۧ۫ۗ۠ۢۛۤ۫ۡۧۘۗۨ۟ۥۘۘۢۢۘۘۦۖۘۘ۫۠ۜۘ۠ۜۢۚۗۨۧۤۖۡ۫۠ۨۚۚ۫ۛۦۘۨ۬ۦۧۧۜۗۤۡ۫ۗ۬ۗۡۘۥۧۘۘۦۡۧ";
                                    while (true) {
                                        switch ((((((((((((((((((((((((((((((((str2.hashCode() ^ 441) ^ 8) ^ 582) ^ 128) ^ 536) ^ PointerIconCompat.TYPE_HAND) ^ 966) ^ 765) ^ 816) ^ 877) ^ 148) ^ 312) ^ 454) ^ 177) ^ 422) ^ 685) ^ 643) ^ 41) ^ 146) ^ PointerIconCompat.TYPE_ALL_SCROLL) ^ 922) ^ 376) ^ 916) ^ 930) ^ 823) ^ 645) ^ 589) ^ 244) ^ 476) ^ 476) ^ 444) ^ (-1247389063)) {
                                            case -383773292:
                                                str2 = "ۡ۫ۢۥۧ۫ۦۛۢ۫ۛۖ۠۬۬۠۠ۜۜۤۡۘۨۥ۬ۡۡۧۘۦ۟۬ۜ۫۠ۤ۠ۘۘ۫ۛۦۤۡۡۚۖۘ۠ۢۜۘۗۙۚۥۙۙۨۘ۫۠۫ۚۖۡۡۚۧ۟۫ۧۥۘۦۡۛۙۘۥۘ۬ۚۨۘۙۡۧۘۢ۬ۖۘۗۖۦۘۢۗۥۘۗ۫۟۬ۤۜۙۖۥۘۧۘۗۚۨ";
                                                break;
                                            case 575931274:
                                                str2 = "ۢۙۢۛۨ۫ۦۥۙۙۤۡۘۜ۟ۘۖۨ۟ۛۤ۫ۦۥ۫۠ۚۨۘۢۜۖۘۧۡۘۘۗۦۡ۠۟ۜۘ۫ۥۙ۟۠ۘۨۥۥۖۖۢ۠ۚۦۘۦۡۧۘۧۜۖۚۤۢۡۖۘۘۨۙۧۛۡۥۘۤۘۖۨۢ۠ۛۦ۟ۨۤۚۡ۠ۘۡۡۦۤۙۗ۬ۖۘۘۢۖۨۦۗۚۨۘۥۢۦ۠ۦۥۚۙۢ۠ۚۥۡۙۥ";
                                                break;
                                            case 1002608250:
                                                return;
                                            case 1651752644:
                                                this.f$0.m76x6a202d20(view);
                                                str2 = "۬ۢۢۗۙۤۙۛۨۘۤۢۜۦۧۘ۬ۚۤۨ۫۟ۗ۬۟۟ۛۥۤۖ۬ۤۥۧۙۚۘۘۨۜۨ۬ۨۖۘ۠ۨۥۘ۬ۘ۫ۥ۠۫ۘۖۨۘۤۤۨ۠ۦ۬ۘۗۨۘۡۡۦ۠ۧۧۙۙۤۘ۠ۨۥۤۤۜۚۘۘۘۙ۬ۤ۠ۜۥۗۨۘ";
                                                break;
                                        }
                                    }
                                }
                            });
                            linearLayout.addView(materialButton);
                            AlertDialog.Builder builder = new AlertDialog.Builder(this.this$0);
                            builder.setView(linearLayout);
                            builder.setCancelable(false);
                            AlertDialog create = builder.create();
                            this.progressDialog = create;
                            String str2 = "۠ۤۙۦۜۚۤۥۦۙۘۜۘ۠ۜۡۖۚۛۚۗۡ۬۫ۦۘۜۘ۠ۖۨۧ۬۫۬ۛۨۙۚۥۘۥۛۢۦۛۡۘ۫ۖ۟۟ۚۜۖۛۡ۟ۢۥۘۗۘۡۘۛ۠ۗۤۜۘۖۘۙۡۢۛ۠";
                            while (true) {
                                switch (str2.hashCode() ^ (-179192248)) {
                                    case -1339297257:
                                        String str3 = "ۥۦۛۛ۬۬ۦ۫ۜۘۢۗۨۙۢۢۢۤ۟ۙ۬ۙۛۥۡۥۨۢۙۖۘۢۙۥۢۜ۬۫ۖ۠ۦ۟ۤ۫ۦۖۜۗۜۘۦۘۙ۫ۥۙۡۜۖۖۢ۫۬ۥۘۘۙۥۜۘۨۗۨۛ۟ۨۘۤ۠ۗۨۥۥۦۗۢۢۨۖ۫ۥۨۚۘۘۦۗۛۖۘۢ۟۫ۥۤۡ۟ۜۡۧۜۢ۫ۤ۫ۗۗۤۧۖۛۜۡۢۨ";
                                        while (true) {
                                            switch (str3.hashCode() ^ (-957594084)) {
                                                case -2072460084:
                                                    str2 = "ۙۥۘۛۦۘۘۙۥۘۜۤۡۘۧ۫ۙۘۚۗۥۥۡۜۦۧۘۜۦۨۜ۬ۡ۟۫ۘۘۗۙۡۚۧۛۗۢۛ۬ۢۤۗۨۘۙۨۧ۠ۚۜۢۙۨۘۛ۫ۦۘۙۡۧۤۙۢۥۤۚۤۙ۬ۚۘۦ۬ۘۛۦۙۛۧۤۖۛ۟ۧۦۥ۫۬ۗۡۤۤ۠۫ۖۥۥۨۖۛۥۦۘۛۙۧۙ۠ۦ۠ۧۚ۫ۦۘۙۘۥۘۧۘ۟ۨ۠ۚ۟ۖۛۥ۫ۤ";
                                                    continue;
                                                case -1968419707:
                                                    str3 = "۬۬ۡ۟ۤۜۘۚ۫ۜۘ۫ۘ۫۟ۡۦۘۡۚۙۧ۟ۙۤۜۡۘۦۚۥۡۛ۬ۦۥ۠۬ۛۤۖۧۚۦۡۘۖۗۖۖۘۘۘۤۚۦۘۧۦۖۚۥۢ۟ۤۘۘۙۦۥۜۜۡۥۥۚ۫ۗۧۚۖۧ";
                                                case -109864142:
                                                    String str4 = "ۡۢۦۘۗۙۘۘۧۤ۬ۡۙۛۢۜۘۘۚۥۙۙۖ۟۟۫۠ۨۧۜۚۜۡۨۗۥۦۙۦۧۚۖۙ۫ۧۤۡۘۜۘۜۘ۟ۗۜۘۘ۬ۧۘ۠ۡۥۢ۫ۛۙۙۛ۬۬ۗۥۘۖ۠ۤۦۛۘۘۢۨۨۜۥ۬ۥۗۡۨ۬ۧۘۢۧۜ۫ۜۙ۟ۚۜۡۗ۠ۧ۟ۤۘۘۦۛۘۘ۟ۨۡ۟ۘۜۘ۟ۙۧ۬ۚۜۥۜۜۘ۬ۧۛۙۙۦۦۜۡۘۦ۬۠";
                                                    while (true) {
                                                        switch (str4.hashCode() ^ 6833724) {
                                                            case -1878220830:
                                                                String str5 = "ۡۛۥۜۖۡ۠ۡ۠ۤۙ۟ۛۡۦۘۛ۫ۖۖۗۨۘ۟ۘۥۘۡۦۥۧ۠ۨۘۚۘۦۨۧۜۖۨۨۨۜۘۘ۫ۚۥۡۖۙۡۗۖۘۧۡۗۛۘ۠ۡۥ۫ۨۖۧ۠ۙۘۘۤ۟۫ۡۜ۟ۜ۟ۚ";
                                                                while (true) {
                                                                    switch (str5.hashCode() ^ 1805123488) {
                                                                        case -1812307744:
                                                                            str4 = "ۧۨ۫ۤۛۘۘ۠ۗۚۛۗۖۘۛۙۘۘۘۜۘۛۘ۠ۥۢۡۘ۟ۤۡۘۦۗۜۘۢ۫ۜۥ۫۟ۖۚۙۧ۠ۖۘۢۧۦۚۛۜۘۘۛۢۢۚۢ۫ۜۖۘ۠ۚۨۨ۬ۢۖۧۡۦۜۖۘۥ۠۫ۧ۟";
                                                                            break;
                                                                        case -1481704442:
                                                                            str4 = "ۘۢ۟ۢ۠ۡۘۡ۫ۤۨۖۥۘۥۡۥ۬۟ۘۘ۟۬ۦۘۥۚۜۘۗۡۥۥۜۚۥۡۧۘ۫ۦۙۨ۬ۜۤۢۡۡۨ۬۠ۚۙۤۦۜۘۗۤۖۤۢۦۘ۠ۨۙۗۖ۟ۡۢۗۧۛۚۦۨۙ۠۬ۨۥۢۗۘۘۧۘۚۨۡۘۘۛۨۚۢ۬ۜۧۥۚۜۖۘۛ۬۬ۗۤ۠ۤۥۖۘۧۘۢۦۡۘۗۤۜ۫ۨۡۤۚۚۜۦۘۧۘۨ۟ۤۗۙۛۥۢۗ";
                                                                            break;
                                                                        case -775692895:
                                                                            str5 = "ۤۖۨۚۧۥۦۥۧۘۙۥ۫۠ۛۥۘۧۙۜ۬ۖۜۘۘۚۧۜۛۘۧۖۘ۠ۙۨۘ۫ۨۡۘۛۖۢ۟۬ۦۛۚۜۖۛ۬ۢۧۢۡۨۧۘۦۗۢۚۨۨۢۥۘ۬۬ۥۘۥۡۘۘ۬ۜۘ۬۠۠۬ۗ۬ۙۢۨۛۡۘۢۜۘ۬ۢۘۥ۬ۖۙۜ۟ۖۙۘۦ۠ۗۡۥۢۨۘ۠ۢۦۘۜۤۘۚۙۘۘۜ۬۟ۧۨۦۘ۟ۨۧۗۘۚ۟۬ۗ۫ۡ۠";
                                                                        case 1754029020:
                                                                            String str6 = "ۧۙۨۥۢ۠۠ۦۜۘ۫ۨ۟ۙۥۙۜۦۧۧۢۖۘۥۥۖۘۘۜۥۘۤۘۤۛۜۢۦۦۧۡۖ۠ۡۙۦۨۦۦۢۜ۟ۦ۬۫۬ۥۘۘۨۚۦۤۜۘۤۥۥۘۗۙۧ۫ۦۙۤۛۧۥۛۡۘ";
                                                                            while (true) {
                                                                                switch (str6.hashCode() ^ (-175570429)) {
                                                                                    case 867139424:
                                                                                        str6 = create.getWindow() != null ? "ۜۢۙۢۨۘۖۨۖۘۖۙۗۙۡ۠۬ۗ۬ۗۙۛۛۜۘۘ۠۟ۨۦۜۛۤۖۙۡۧۗۜۨۡۛۦۢۜۚۦ۟۫۠ۘۙۖۜۨۘۗۘ۫۠ۜۜۘ۟ۥۤ۫ۡۙۢۤۚۥۤۖۢۜۦۤ۫ۨۘ۫ۖۜۚ۠ۜۘۛۖۦۨۤۥۦۧۥۚۘۦۧۚۚۨۦۜۘۨ۬ۨۘۚ۫۫ۦۖۘۘۗۤ۟ۡۗۗۙۤۦۘۚۤۜ۟ۥۖۘۚۗ۟ۥۤ۫۬۫ۜ" : "۬ۢۦۘۢۗ۠ۖۢۨۘۘۚ۟ۗۤۚۨ۟ۦۗۥۘۡۤۛۜۤۥۘۛۡۨۘۨۛ۬ۜۨۘۗۖۤۡ۬ۘۘ۟۬ۗۨۥۢۥۘۥۘۛۥۧ۫۫ۖۘۗۚۡۘۧۗۧۜۧ۟ۥۨۦۜۧ۠۠ۦۜۘۚۚۡۦۨۘۗۡ۟ۨ۬۠ۦ۟ۖۘ";
                                                                                    case 1756803444:
                                                                                        str6 = "۠۟ۧ۫ۘۤۜۢۛۛۥۖۘۘۖۙ۫ۙۡۘۨۧۦۘۛۡۜۗۡۡۘ۬ۢۗ۟ۢۜ۠ۢۖۘۢۙۨۘۘۥۡۙۖۧۥۥۨۘۧۙ۬۟ۘۗۨۧ۫ۙ۟ۡۘۤۙۥۛۥۘۘ۟ۜۜۘۥۛ۫ۗۚۢۢۚۙۤۗۦۘۗۨۛۥۤ۠ۥۛۨۘۦ۠ۤۢۗۨۘۦۨۘۧۧۘۘۧۛۘۘ";
                                                                                    case 1956302977:
                                                                                        str5 = "ۥۢۖۘ۬ۧۘۘ۬ۚۤۜۥۘۛۥۖۘ۬ۖۨۘۗۡۜۘۛۜۜ۫ۖ۠ۙۙۜۛۛ۟۠ۛۦۘۧۖۚ۠۫۫ۤۘۡۘۛۦ۠ۛۨۘۘ۬ۚۘ۠۠ۡۖۘۤۢۙۥۘ۠ۛ۠ۨ۬ۧۘۛۡ۟ۙۧ۬ۙۦۤۧۧۦۛ۬ۧ۟ۨۘۚۙۨۘۖ۫۠ۢۢۧۡۢ۬۬۬ۖ۬ۙۧۦ۟ۖۘ۬ۡۢ۟ۛ۫ۖ۠";
                                                                                        break;
                                                                                    case 2017102694:
                                                                                        str5 = "ۗ۠ۥۗۧۡۖۧۦۘ۫ۗۧ۠ۛۜۘۖۘۧۘۜۦۤۧۗۦ۬ۦۢۨۘۙ۬ۜۘۦۗۤ۟ۨ۠ۖۢۛۥۚۙۦۢۤۢۤۙۗۗۤۡۢ۫۠۫۟ۡۥۥۢۨۜۘۖ۫ۘۗۥۢۢۗ";
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case -1238314110:
                                                                str3 = "ۢۧۘۘۢۥۨۘۘ۟ۜۜۥۖ۟۟ۦۜۛۜ۠ۘۘۜۨۦۘۙ۟ۙۥ۟ۨۘ۟ۥۘۢ۫ۨۘۡۤۘۘۥۗۦۘ۠۫ۦۧ۠ۤۗ۠۟ۛۦۘ۬ۘۨۗ۬ۦ۬۬ۘۘۗۚۜ۬ۦ۫ۛۥ۬ۡۛۖۘۨۤۢ۟ۨۚۦ۠۬ۚ۟ۤۘ۬ۜ۬ۤۜۧۙۢۦ۟ۢۥ۬ۡۖۙ۫";
                                                                break;
                                                            case -1101370560:
                                                                str4 = "ۥۘۡۤۜۙۙۡۢۢۘۦۦۜ۠۟ۖ۬۫ۢ۫ۜۨ۟ۢۙۦۘۤ۠ۜۘۢۖۧۘۦۜۨ۠ۤ۠ۦ۫ۚۦ۟ۚۨۚۛۘۙۖۘۛ۠ۚۤۘۦۡۗۨۘۖۚۤۥ۠ۘۥ۠ۢۗۦۧۘ۟ۗۨۘ۟ۛ۬ۡۚۘۘۘ۫ۦۡۙۦۜۨۜ";
                                                            case 1378204464:
                                                                str3 = "۬ۛۜ۠۠ۥۨۘۤۙۧۘۘۘۢ۬ۤۘۥ۟ۥ۬۟۟۬ۛۤۜۘۡۛۡۖۡۢ۠ۚۨۘ۫ۨۧۜ۫ۜ۫ۧۨۧۤ۟۫ۘۦۨۜۤۨۧۡۘ۟ۨۥۖۦۥۛۡۨۨۘۢ۟ۨۖۨۘ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 1353943269:
                                                    str2 = "ۥۢۧۥۘۡۘۖۤۜۘۙ۫ۧۜ۬ۜ۫ۛۥۘ۫۫۟ۚۢۥۘۤۤۦ۫۫ۥۙۧۖۤۖۥۘۢ۟ۖۘۢۤۜۘۡۡۨۘۡۙۡۖ۟ۗۦۥۘۘۙۘۗۨۧۡۘۛۨۨۥۚۨۘۚۧ۠ۜۥ۟۟۟ۙۢۦۛۥۨۢ۟۫ۨۘۥۤۚۗۡۘۤۤۢۛۚۨۡۥۘۗۥۢۙۖۘۘۖۜۘۜۘۥۧ۟ۧ۠ۨۦ۬ۜۘ";
                                                    continue;
                                            }
                                        }
                                        break;
                                    case -38172088:
                                        str2 = "ۤۜۘۙ۠ۚۧ۬ۡۘۘۨ۟ۘۜۨۜۜۦ۠ۦ۬ۥ۠ۢۦۨۙۧ۠ۖۗۛۜۘ۠ۙۥۘۘ۫۠ۥ۟۟۟ۚۥۤ۬ۚۘۖۜ۟ۙۥ۠ۧۛ۟ۚۛۧ۠۫ۛۘۖۦۖ۬ۘۚۜۘۢۤۥۘ";
                                        break;
                                    case 713205848:
                                        break;
                                    case 2014368946:
                                        this.progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                                        break;
                                }
                            }
                            this.progressDialog.show();
                            String str7 = "ۨۡۡ۫۠ۥۘۤۧۧۘ۟ۜۘۧۧۘۥۡۖۘۜۨۧۥ۟ۜ۠۠ۥۤۜۗۜۡۧۘ۫ۢۗۖ۟ۨۙۢۢۖۜۖۘۚۢۦ۟ۙۜۘۖۨۥۘۖۨۧۘ۟ۗ۫ۧۜۛۢۢ۟۬ۨۨۘۢۗۢۙۜۧۢۦۥ۠ۜۘۦۧ۟۟ۙۡۚۡ۟ۛۛۚۢۥۤ۬ۦۦۘۢۤۛۙۗۥۘ";
                            while (true) {
                                switch (str7.hashCode() ^ (-1196838886)) {
                                    case -941126408:
                                        String str8 = "ۙۗ۬ۖ۟ۜۚۡۥۘ۫ۥۤ۠ۧۗۤۚۨ۟ۤۢۢۢۖۘۥۦۘۘۥۗۤۛۢۜۘۢ۟ۛۘۘۨۥۥۜۘ۫۟ۢۘۦۦۙۡۡۙۙۗۥۨۦ۠ۢۧۤۢۜۡۥ۠ۚۥۘۡ۬ۡۘۜۖۡۘ۫ۥۖ۠ۡۥۗۜۜۘۖۗۖ۬ۙۢ۬ۤ۟ۨۦۗۧ۬۠۬۬ۦ۠ۜۘۙۜۗ۟ۥۡۦۖۨ۫۟ۜۘۨۙۨ";
                                        while (true) {
                                            switch (str8.hashCode() ^ (-655348748)) {
                                                case -1218058040:
                                                    String str9 = "ۖۦ۬۟ۘۙ۠۫ۖۦۚۗۙۙ۫ۛ۠ۛۗۦۡۢۡۘۥ۬ۧ۟ۛۥۛ۬۟۬ۜ۬ۗۗۦۦۘۘ۫ۛۢۚۛۙۗۦۚۥۚۜۦۨۢۛۥۧۨۥۨۘۗۗۙۢۦۨۥۧۜۨۘۛ";
                                                    while (true) {
                                                        switch (str9.hashCode() ^ (-1240172193)) {
                                                            case -1603347352:
                                                                str8 = "ۙۢۡۗۤۢۚۚۢۜۧۛۦۚۥۘۨ۠ۧۗۧۚ۟ۦ۟ۚۜۖۘۦۘۛۧۗۛۨۨۡۗ۟ۘۘ۬۫۠ۙۥۧ۫ۡۡۘۚۖۨۘ۫ۘۤۡۛۗۨۜۜۙ۠ۡۥۤۜۘۨۢۙۤۚۤ۟۟۟ۤۚۡۘۖۚۡۘۙۚۢ۠ۡۧۨ۟ۜۘ۟۠ۦۘۚۙۙ۫ۖۧۘۖۡۚ۠ۦۦۛۜۘ۬ۤۧ۫ۥ۠ۤۦۦۥۘۦۥۛۧۥۚۨۦۘۢ۟ۜۥ۬۟";
                                                                break;
                                                            case -506943287:
                                                                str9 = "ۛۧ۟ۗۚۨۘۗۧ۠۬ۘۦۨ۟ۤۢۤۘۘ۫ۨۦۨ۬ۤۙۘۡۘۖۡۘۘۖۡۨۖۨۗ۫۠ۖۙۨۢۛ۟ۖۘۨۦۧۧۗۘۘۜ۠ۡۤۜۨۘ۟ۤۜۘۛۢۗۦۨۜۘۡۡۘۥۛۜۧ۬ۗ۠۟ۖۘۗ۫۫ۦۚۘۤۢۖۘ۫ۘ۬";
                                                            case -398337569:
                                                                str8 = "۠ۖۖۘ۬ۗ۬ۗۤۙۢ۟ۘۘۤ۫ۢۖۘۡۘ۠ۢۢۛ۫۫۟ۡ۟ۨۡۘۘۧ۟ۚۨ۟۬ۚۥۤۛۧۚۧ۠ۖۘۦ۬ۜۘ۟ۤۨۥ۫ۦۖ۬ۡۘۗۦۗ۬ۨۥۘۡۜۜۧۘ۫ۙۜۥۥۚۖۘ";
                                                                break;
                                                            case -213431278:
                                                                String str10 = "ۘۗۖۘۗۙ۠۬ۜۜۘۧۨۘۥۢۨۘ۟۠ۥۘۘۘۜۘۗۘۨ۫ۦۥۘۨۤۜ۫۬ۘۨۤۥۘۘ۠ۜۘۦ۟ۖۘۘۛۜ۟ۛۘۘۚ۬ۤۤۤۖۘۢۖۥۘۥۤ۬ۦۢۨۘۘۡۙ۬ۦۧۘۗ۫۟ۘۙۙۡۢۥۘۨ۬ۚۙۢۗۤۜۡ۠۠ۡۘۥۥۤۚۗۢۨۗ۠ۧۢۥۙۧۦ۟۟ۦۜۦۘ۟ۛۜۗ۫ۡۘۛ۟۬";
                                                                while (true) {
                                                                    switch (str10.hashCode() ^ 57753171) {
                                                                        case -908166331:
                                                                            str9 = "ۤۧۖۘۦ۬ۚۤۜ۬ۤۤۡۖۘۙ۫ۙۧ۬ۚۚۜ۬ۘۚۤ۟ۥ۬ۤ۠ۨۘۙ۟ۨۘۢۤۜ۬ۧۡ۫ۗۡۚۖۦۡۘ۠ۨۘۘۚۙۡۘ۬ۜ۠ۨۛۢۚ۬ۙۚۡ۬ۜۙۥۘۖۙ۠ۧ۫۟۟ۨۤۨۡۥۘ۟ۜ۬ۚۤۧ۟ۜۜۚ۫۬ۨ۫۬ۜۘۥ۬";
                                                                            break;
                                                                        case 134374179:
                                                                            str9 = "ۜۙۡۙۙۗۨۧۡۘ۠ۚۜۘۛۥۚۤۦۡۘۨۥۨۢۙۙۚۤۥۘۢۧۜۤۘ۬۠ۚۜۜۘۨۘۘۢۦۘۛ۫۬ۢ۬ۛۚۘۙ۬۫۟ۜۙۖۙۤۤۘۚۧۙ۟ۚۘۗۛۡۜۗۘۘۜۦۜۘۥۤ۫۠ۙۧۖ۠ۥ۬ۡۘۘۖ۟ۢۤۤۥۦۡۦ۠۬۠ۙۖۥۘۢ۟ۦ۠ۛۘۘ۫ۘۚ۠ۨۤۤ۟۫";
                                                                            break;
                                                                        case 1306102432:
                                                                            String str11 = "ۖۘۧۘۗۦۦۡۤۚۖۡۙۢۢ۫ۧ۫۟۟ۖۗۜۤۗۜۨۖۘۛ۬ۨۦۦۤۧۗۦۘۡ۫ۡۘۤ۫ۙۛ۬ۖۨ۟۟ۥۧۛۧۥۨۘۨۗۗ۟ۜۖۘ۬ۨ۬ۥۥۙ۫ۜۖۘۥ۠ۚۖۛۤۛۚۗۘ۫ۢۤۡۘۨۧۛ";
                                                                            while (true) {
                                                                                switch (str11.hashCode() ^ 1270447550) {
                                                                                    case -227305583:
                                                                                        str10 = "ۚۗ۟ۛۖۦۘۨ۫ۤۘۢۘۚۦۤۤ۫ۖۘۙۖ۬۬۠ۛ۟ۦ۠ۘۛۛۧۤۗۖ۬ۖۘۥ۠ۦۘ۬۬ۡۙ۟ۡۘۤۖۖۘۨۗۙۨۥۡۘۗۧۛۢۚۖۘۨۦ۠۟ۦۧ۟ۦۡۘۦۦۛۢ۟ۚۥۖۚ۟ۢۨۥۤۤۡۦۘۜۘۜۘۜۢۖۚۘۖ۬ۙۖۘۛۖۡۘۖۤۛۧ۫ۡۙۛ۬ۡۜۥۚۜ۠ۖۘۧۢۚۘۘۙۢۤۗۖۖۘ۫ۚۘ۬ۜۖۘ";
                                                                                        break;
                                                                                    case 1805205327:
                                                                                        str11 = this.progressDialog.getWindow() != null ? "ۙۦۚۖ۬ۜ۟ۖۘۙۥۜۘۦۛۖۘۘۦۥۘۖ۬ۦۨۡۥۥ۬ۥۘۢۡۡۙۙۖۙ۠ۢ۫ۦۘۧۚۥۗۘ۟ۙۦۘۙۜۦۘۦۗۙ۠ۡ۬۟ۖ۠ۚۘۜۘ۟ۤۘۨۚۗۡ۠ۜۡ۟۫ۨۜۨۘ۫ۡۘۘۧ۬ۚۗۥۘۘ۬ۧۤۗۦ۠ۦ۬ۤۚۦۙۜۧ۠ۜۙ۬" : "ۧ۫ۘۘ۬۫ۘ۬ۘ۬۬ۘۢ۠ۢۛۨۨۨۘ۟۫۬ۗ۬ۖۗ۬ۘۘۧۙۖۘۘۧۥۦ۠ۨۜۙۛۤۙۖۘۛۨۗ۬ۖۙۖۤۚۡۛ۠ۚۤۜۜۘۘۧۙۘۖ۬۠ۗۦ۠ۧۛ۫ۧۥۘۘ۬۬ۙۦۖۘ۫ۛۙۜۜۜ۠ۤ۠";
                                                                                    case 2061515146:
                                                                                        str10 = "۬ۙۧۦۢۘۘۜ۟ۥۘ۫ۦۥۚۛ۬ۧۥۥۧۧۨۖۚ۠ۦۥۥۘۗ۠ۥۘۜ۠ۡۘۤۙۚۚ۬۬ۛ۫ۡۗۦۢ۬ۛ۫۠۠ۥۘۛۜۦ۟ۡۜۦۜۚۥۜۛۚۗۥ۬ۛۙۡۛ۠ۚۘۚۦۛۖۛۨۜۘۤۗۦۘ۟ۜۖۜۢۥۚۥۢۚۢۧۘۜۧ۟۠ۥۘۖۗ۠ۛۜ۠۠ۜۥۘۦ۟ۥۘۗۜ۬۠ۡۧۘ";
                                                                                        break;
                                                                                    case 2070540390:
                                                                                        str11 = "ۛۛۨۖ۠۟ۜۖۥۘ۬ۘ۠ۗۥۡۤۦۡۘۘ۠ۨۖۤۙۦۖۥۘۜۙۥۘۚۖۚ۠۟ۧۦۖۡۤۜۥۥۨۥۘۧۥ۟ۜۧۥۘۙۨۙۜ۬ۚۘۗۤ۬ۤۘۗۛۨۘۘۥۘۥۤۦۘۜۨۥۘۛۧ۫۫ۖ۫ۢۛۡۦ۠ۚۨ۟ۡۖۡۨۘۙۧۚ۠ۗۛۚۧۗۜۡۚ۫ۖۖۢۨۖۧ۟ۛۖ۟ۛۙ";
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 1890550686:
                                                                            str10 = "ۢۜۥۡ۟ۡۘۦۘۥۜۨۘۧ۠ۚۗۗۛ۟ۜۖۘۡۧۦۘۘۥۦۘۗۨۖۘۥۨۚ۫ۙۡۘۙۥۜۥۚۘۨۧۧۥۚۤ۟ۗۡۖ۫ۙ۠۬ۨۘۨ۬ۗۤۦۢۜ۫ۢۡۗۤ۟ۚۗۛۨ";
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case -949175079:
                                                    str7 = "ۖ۟ۖۘ۫ۢۡۜۧۦۡۗۛۗۚۡۘۦۨۡۘ۟ۛۗۦۦۛ۟ۛۤۘۡۘۧ۟ۥۘۗۡۖۢۧ۟ۦۘۡۘۜ۬۟ۧۤۨ۫ۚۜۘ۫ۧ۠۫ۗۨۢ۟ۜۥۖۜۘۡۛۛ۟ۖۦ۠ۚۘ۬ۖۧۘ۠۬ۡۛۨۖۥۤۚۨۙۙۨۡۚ";
                                                    continue;
                                                case -454363189:
                                                    str7 = "ۖۤۨۘ۟ۢۦۘۤۖۥۘۨۖ۫ۙۡۤۢۡ۠ۘۡۨ۬ۦۘۦۚۡۘۚ۫ۨۡۡۗۗۖۢ۫ۖۦۙ۠ۤۖۖۨ۟ۛۨۘۢۡۜۘۤۙۨۦۘۚۘ۠۬ۛۨۧۘۚۥۨۘۤۨۥۘۜۗ۟۫ۛۗۤ۟ۛ۟ۧۨۘۦۛۦۘۢۖۤۜۢۜ۟ۖ۫ۡۛۦۤ۫ۦۧۚۧۦۥۖۖۗ۫ۦۘۖۨۘۢۤۘۧ۟ۦ";
                                                    continue;
                                                case 588554908:
                                                    str8 = "ۥۢۘۘۧ۟ۙ۠ۨۖۡۥۖۘۛۨۚ۟ۨۡۦۙۦۘۘۡۡۘ۟ۛۜۡ۠ۚ۫ۗۥۢۖۖۙۗۦۘۦ۬ۧۥۦۙۛۗ۬۬ۚۘۘۘۛ۠ۢۡۨۘۛۖۦۘ۟ۡۧۦۨۘۘۧۘۤۗۜۛۨۗۙ۟ۤۖۥۨۦۘ۬ۨ۬۠ۧۖۤ۫ۨۤۖۥۜۙۦۦۡۜۘۦۗ۟ۦۜۢ۫ۚۜۘ۠۟ۗ۠ۘ۫۫ۛۚۜ۟ۥۘ";
                                            }
                                        }
                                        break;
                                    case 425258823:
                                        str7 = "ۦۡۡۘۦۤۡۘۡۗۢۛۘۚۦۘۢۗۚۨۘۘۥۘ۟ۗۜ۠ۘۜۘۖۢۙ۫ۜۘۥۥۖۘۖۡ۠۠ۢۗۢۡ۟ۡۤۚۗۡ۬ۢۗۡۘۗۗۨ۟ۦۢۨۦۧۘۖۜۢ۫۫ۛۙ۬ۢۤۧۘ۠ۘۚۜۚ۠ۙۖۖ۫۠ۡۘۖ۟ۘۘۖۘۗۙۥۤۗۢۖ۬۠ۨ۬ۛۙ";
                                        break;
                                    case 1394832849:
                                        return;
                                    case 1977389408:
                                        this.progressDialog.getWindow().setLayout((int) (this.this$0.getResources().getDisplayMetrics().widthPixels * 0.9d), -2);
                                        return;
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            return;
                        }
                        break;
                    case -1603237206:
                        String str12 = "ۜۛۨۘۧ۫ۧۙۙۡۘۘۢۥۘۤۡۗ۬ۗۖۘۨۢۥۧۘۢ۫ۤۙۤ۟ۡ۠ۜۘۙۖۛۛ۬ۘۦۤۨۙۚۧ۠ۨۤۖۚۘۛۥۗۙۘۘۛ۬ۚۤۧۛ۬ۗۨۖۢۧ۫ۛۧۖۛۧ";
                        while (true) {
                            switch (str12.hashCode() ^ (-2067701950)) {
                                case 18618416:
                                    String str13 = "ۛۨۡۘۢۛ۟۫ۥۦۘۧۡۢ۠ۖۗۖ۬ۧۥۨۧ۠۫ۚۛۥ۬۠۟۟ۤۚ۠۟۠ۖۙۦۡۘۥۘۘ۟ۡۜۢ۫ۜۨۛۡۘۙۜۖۢۘۘۨۖۛۢ۫ۥۘۚۧۘۘۗۥۖۜۙۥۘۖۡۙۙۜۥۨۥ۠۬۫ۘۙۛۧۤۛۧ";
                                    while (true) {
                                        switch (str13.hashCode() ^ 1621337073) {
                                            case -1956310538:
                                                str13 = "ۢۛۥۘۧ۬ۗۖۦۡۗۙۚۨ۟ۡۘۜ۫۟ۤۧۨۘۘۚۢۛۥۙ۠ۜۨۘۥۘۖ۠ۙ۟ۜۛۚۢۜۡۘۢۧۨ۫ۢۖ۠ۡ۟ۜۧۖۚ۠ۖۧۧۘۡۥۜۢۤۦۛۚۧۘۦ۬ۥۚۛ۫۬۫ۗۦۜۘ۟ۜۥۘۘۤۦۗۥ۟ۖۗۨۘۧۖۡۜ۫ۜۘ۫ۜۥۙۜ۟ۖۚۡۘۗۗۡۘۜۙۘۜ۬ۢ";
                                            case -1832275811:
                                                String str14 = "ۙۙ۬ۗۧۦۗۥۦۤۤۡۘۜۘۙۡ۫ۖۘۨ۫ۡۖۘۖۘ۠ۥ۠ۙ۫ۦۘۚۦۖۥۨ۫ۚ۫ۜۘ۟ۜۘ۫ۙ۟۠ۖ۬ۜۦ۠ۡۛ۬ۦۘۗۦۨۨۙۚۖۘۤۧۚۜۜۡۘۘۚۜۘۖۙۨ۬۠ۧۙۧۧۜۡۦۘۛۛۡۘۦ۟ۚ۟ۙۢ۬ۡ۠ۜۢۜۘۗۨۨ۟۠ۛۗۦۘۛۧۢۦۨۧۘۗۢۜۜۦۥۘۗۘۤۡۖۦۘۙۨۨۘۗۙ۫ۗۥ۫";
                                                while (true) {
                                                    switch (str14.hashCode() ^ 1246263794) {
                                                        case -1662317883:
                                                            String str15 = "ۢۦۧۦۙۨۗ۫ۨۘۙۨۘۘۚۙۦۘۛۥ۫۟ۢۘۘۗۨ۬ۚۥۥۙۗۖ۬۬ۡۘۗۜ۟ۡۛۥۘۢۤۨۘۡۛۘۘۢ۠ۤ۠ۖۧۘۚ۫ۨۘۧۢۥ۠۟ۨۘۢ۬ۥۨۦۙۨۨۡ۠ۤۖۘۧۨۗ۬ۙۜۘ۠ۢۘۘۦۦ۟ۗۘۖۘ۬ۛۘ";
                                                            while (true) {
                                                                switch (str15.hashCode() ^ (-1486191380)) {
                                                                    case 380903841:
                                                                        str14 = "ۚۥۖۨۦۛۗ۟ۡۘۚۛۡۘۛ۫ۛۛۦۡۘۨۡ۫ۛۢۗۖ۠ۥۘۢۧ۠ۥۢۤۥۡ۠۠ۢۗۥۛ۫ۥۤۜ۫۠ۨۘۨۚ۬ۙ۫ۤۧ۟ۘۘۥۜۦۜۘۡۦۚۥۛۚۦۛۘۦۘۖۘۥۦۜۥ۠ۡۖۘ۬۫۬ۦۢۙ۟ۚۖۘۥۜۨۗۦۦ۠ۚۜۦۙۨۘۢۡۨۙۤۖۘۖۖۦۥۤۖۥ۟";
                                                                        break;
                                                                    case 1051110748:
                                                                        str15 = "ۥۙۘۘۜۚۜ۠۟ۜ۬ۥۦۘۨ۠ۨۘ۠ۨۛۗۡۥۡۡۧۖ۬ۡۘۖۙۙۛۧۛۛۗۡۜۘۡۛ۠ۧۨۦ۟ۛۜۘ۠ۥۡۘۢۧۢۥۖۚۤۜۚ۠ۦۡۡۜۖۘۘۤۜۡۙۘۚۤۧ";
                                                                    case 1355636922:
                                                                        str14 = "ۘۢۖۤۖۜ۫ۛۤۗۙۜ۬ۘۘۘۚۗ۫ۖۥۦ۫ۡۢۥۗۨۘۡۛۢۛۙۦۙۜۜۥۡ۬ۤۤۨ۬ۢ۠ۛۡۧۘۚۜۢۙۖۖۡۥۡۗ۫ۗۙۨۨۘ۬ۜۢ۠۟ۥۢۧۖۘۦ۠ۥۤۥ۟ۖۥۡۘ۠۠ۗۛ۬ۙۗ۠ۥۚۗۦۘۤ۬ۡۘۢۗۖۘۥۗۨۤۦ۟۫ۘ۠۫ۨۖۘۦۡۘۢۘۘۤۛۧ";
                                                                        break;
                                                                    case 1871055377:
                                                                        str15 = this.this$0.isFinishing() ? "۠۬۟ۡ۠ۖۘۚ۟ۘۛ۟ۦۥ۟ۖۗۤۘۖ۠ۦ۟ۥۚۦۚ۠ۘۨۦۗۛۧۦۦۢۤۚۦۜۗۘۘۜۨۦۘۧۛۦۘۦ۬ۡۡۦ۟ۘ۟ۦۘۧۗ۟ۙۗۨۘ۬ۖۜۨۤۖۦۢ۫۬ۙ۫ۗۚۢ۫ۜ۫ۗۛۗۨۙۦۘۧۖۚ" : "۫۟ۖ۠ۧ۬۟ۨۖۘۖۦۡ۟ۗۥ۫۟ۤۥۛۛۦۤۛۖ۫ۨۘۨۜۛۜ۠ۖۘۥۘۜ۫ۨۨۥۗ۬ۦۧۘۛۧۥۛۧۡۘ۫ۡۤۛۨۜۚ۬ۘۘۦۙۙۡۧۡۘۖۚ۟ۢۦۧ۟۫ۚ۬ۤ۫ۦۘۜ۫ۡۥۘۘۗۨۛۢۢۙۚۡۘ۟ۦۘۘۚۨۗ۬۬ۧۖ۬ۧۛۥۤۨۙۖۘۦۛۜۥ۠ۦۘۖۡ۠ۦۥۧۘ۫ۥ۟۫ۢۜۡ۬۟ۜ";
                                                                }
                                                            }
                                                            break;
                                                        case -527917056:
                                                            str13 = "ۖۛۡۘۢۨ۫ۧۥۘۘۙۖۛۢۙۧۤۡۦۘۙ۠ۥۥۦۗۘۧ۠ۢۡۧۘۥۜۘۥۥۧۧ۫ۜۛۤۘۘۤۡ۬ۨۡۘۢۥۖۘ۬ۦۚۙۖۜۙۦۥۦۨۜۘۤۦۡۨ۬ۡ۬ۚۨۘۜۤۨۘ";
                                                            break;
                                                        case 702530390:
                                                            str13 = "ۛۛ۬ۨۦۖۤۛۚۡۡۡۤۡۘۧۦۖۘ۠۟ۥۚۖۥۘۤۥۛۨۦۘ۟ۛۚ۠۟ۧ۫ۙۦۘۜۛۖۘۘۡ۟ۜۗ۬۠ۦ۠۟ۖۥۘۛ۫۫ۘۗۦ۫ۗۨۥۜۡۘۚۜۢۜ۠۫ۙۧۛۤۡۧۢۢۗۥ۬ۘۨۦۧۡۙۦۗۗ۬۠ۖ۠ۜۘ۫ۚۙۚۥۘۘ۬ۨۢۛۖۛۤۗۢۘ۬ۗۙۥۘۘۥۘۡۚۜۘۙ۬ۚۥۥ۠ۖۙۚ";
                                                            break;
                                                        case 1654855243:
                                                            str14 = "ۤۡۜ۫ۗۢ۫ۡ۫ۗۛۚۛۦۨۘۗ۫۟ۙۛۘۘ۬ۖۨ۟ۢۖۥۜۗۖۡۘۙۜۘۖۦۧۘۨ۟ۖ۟۫ۧۦۢۧ۬ۜۘۛۧ۟ۙۡ۟ۡۢۤۜۖۘۚۡۢ۠ۢۨۘۡۧۚ۠ۤۡ";
                                                    }
                                                }
                                                break;
                                            case 816018701:
                                                str12 = "ۥۗۗۥ۫ۡۦ۫ۖۢۜ۟۠۫ۡۨۖۛۗۡۨۘۢۚۢۛۛۨ۫ۤۗۤ۠ۛۧۦۢۢ۬ۗۗۥۧۘۜۘ۠ۢۜۚۥۨ۫ۧۙۙۢۘۘۜ۟ۗۙۙۜۘۧۜۧۦۢ۫ۦۦۜۢۚۥۘ";
                                                break;
                                            case 1791043359:
                                                str12 = "ۨ۬ۡۢۤۢ۠۟ۦۘۡۙۖۘۢۖۘ۫ۡۚۗۤۘۘۗ۬ۦۘۤۚ۟ۥۨۢۡۙ۠ۚۚۜۘۨۢۦۘ۠ۖۖ۠ۖۨۘۚۨۦۘۡۗۚۨۗۡۦۚۜۘۚۘۙ۠۫ۡۚۜۧۛۦۗ۟ۜۗۤۤۨۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case 313351836:
                                    str = "ۚۡۤ۟ۘۢۥۖۢۙ۫ۤۨۛ۟ۚۧۡۨۧ۬ۘۦۢ۟۬۟۫ۘۖۘۤۚ۬ۧۗۗۡۜۖۘ۠۫ۦۘۘۡۡۘ۠۠ۥۧۛۗۖۘۜۥ۠ۢۡۙ۠ۤۨۘۗۜ۫ۨۘۦۘ۠ۛۖ۠ۢۥۘۡۘۖۘۛ۬۟ۢۙ۫۠ۛ۫ۘ۟ۖۢۙ۠ۖ۠ۘۨ۫ۜۖۦ۠ۨۥۜۘ۫ۢۚۥۥۜ۟ۚۡۖۨۛۚۢۨ";
                                    continue;
                                case 803563518:
                                    str12 = "ۧۜ۠ۦۛۧۗۚ۠ۗۤ۫ۥۦۡۘۥۗۖۧ۫ۙۖۖۛ۬ۙۖۘۚۖۦۖ۬ۖ۠ۥۖۘ۬ۥۛۨ۠ۚ۫ۜۗۤۥۦۘ۬ۦۨۘۙۙ۫ۤۨۥۨۡۘۚۤۥۖۢۜۘۜ۠ۦ۠ۚۙۨۢۨۛۜ۠ۦۜۤ۫۬ۡۘۛ۫ۦ۟ۦۘۛۚۛۦۨ۠۬۬ۖۘۤۧۤۢۘۢۥۗۜۘۧۢۗۙۚۡۨۛۥۘ۠ۢۗ";
                                case 932341312:
                                    str = "۠ۗۖۘۥۘۡۡۜۡۖۚۥۘۧۚۜۗۜۧۨۢۜۘۥۥۨۘۚۡۢۖ۠ۙۢ۫ۧ۠ۡۨۥۤۨۨۖۢۦ۬ۢۚۨۤۜ۠ۥۙۘ۫ۨۨۘۗۨۚۨۖۤۚۢ۠ۥۜۨۢ۫۠ۙۤۙۥۢ۠ۥۚۥۘۛۘۗۡۜۧۜۗۥ";
                                    continue;
                            }
                        }
                        break;
                    case -1328482427:
                        str = "ۖۘ۟ۢۛۘۘۢ۟ۦۘۦۗ۫ۙۡۢ۫ۡۢۥ۬ۗ۟ۗ۟ۨۥۧۘۙۚ۬ۛۙۥۘۧۨۗۚ۠ۙۦ۬ۖۘ۫ۡ۟۟ۙۙۖ۠ۧۜ۫ۨۦۚۚ۬۬ۜۖ۟ۘۖۜۘۚۗۖۜۖۦۘ۬ۖۥۘ۠ۤۜۘۗۛ۟ۖۦۖۘۚۛۖۘۧۚۜۘۖۡۜ۠۫۬ۧۚۗ۬ۧۜۤ۬ۦۘ";
                        break;
                    case 1736113711:
                        return;
                }
            }
        }

        @Override // android.os.AsyncTask
        protected /* bridge */ /* synthetic */ void onProgressUpdate(String[] strArr) {
            String str = "۟ۘۨۦۦۗۨ۬ۦۘۖ۫ۜۘۘۤ۬۬ۤۖ۠ۘۤۢۧۧۧۤۥۘۡۨۤۢۚۦۖۘۛۖۨۘۗۢ۫ۥۚۢۥ۠ۚۛۙۗۘۨۚۢۗۢۥۥۤ۫۫ۥ۬ۘۖ۠ۜۚۖۦۖۡۘۦ";
            while (true) {
                switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 475) ^ 89) ^ 614) ^ 670) ^ 14) ^ 546) ^ 943) ^ 864) ^ 502) ^ 100) ^ 129) ^ 237) ^ 199) ^ 730) ^ 799) ^ 44) ^ 135) ^ 716) ^ 732) ^ 798) ^ 330) ^ 131) ^ 600) ^ 979) ^ 903) ^ 596) ^ 787) ^ 141) ^ 437) ^ 868) ^ 917) ^ 250685828) {
                    case -731889354:
                        str = "ۙۜۖۘۧ۟ۜۘۦۘۧۘۤۦۧۙۖ۫ۨ۫ۜۗ۟ۥۘ۬ۦۡۜۦۦۘۜۚ۫ۤۡۜۘۨ۫ۥۨ۠ۤۗۦ۟ۦۧۡۖ۬ۢۥۨۨۛۛۦۘ۬ۡ۬ۚۥۜۘۦۚ۟۫ۢۘۗۖۥۥۧۤۗۧۗ۟ۥ۬ۢۥۗۨۖۨۘۘۤۦۘ";
                        break;
                    case -435768099:
                        return;
                    case -22695085:
                        onProgressUpdate2(strArr);
                        str = "ۜۗۨۘۤۛ۠ۖۛۘۥۨ۬ۖۢۧۙۛۜۗ۠۬ۘۙۘ۟ۨ۠ۨ۠ۘۥ۟ۛ۬ۘۜۘۗ۫ۡۘۢۛۢۗۗۡۘۧۛۡۗۧۢۦۨۦۘۦۥۖ۬ۢۙۛ۬ۨ۫۬۟ۚ۟۬ۘۤۘۘۦۘۥۧۚۖۖۗۘ۟ۛۢۥۙۗ۫ۗۡۙ۬۬ۛۥۨۙۡۡۘۡ۬ۜۜۛۚۛ۬ۘ۠ۘۘۘۦۨۡۢۛۖۘۘۢۡ";
                        break;
                    case 352378231:
                        str = "ۙۚۘۘۤۘۜۧ۟ۗۚۜ۫۬ۡۤۘۡۤۥۜۘ۟ۛۜۗۙ۟ۚۚ۠ۧۖۘۥۤۢۢ۠ۖ۠ۙۗۚۙ۬ۗۥۨۘۧۧۦۧۖۘۥۧۖ۬۠ۜۦۘۚۖۨۦ۟۫ۚ۠ۛۡۚۖۘۚۙۖۘۧۚۚۖۤۘۢۜۜۘۚۨۗۡۖۡۘۙۚ۬ۢۚۦۘۜۗۜۘۛۚ۠ۛۘۖ۫ۥۥۘۘۛۡۘۨۘۧ۫ۡۧۘ۠ۤۨ۫ۦۘۡۥۛۙۧۤۚۥۘ";
                        break;
                }
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 578
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        /* renamed from: onProgressUpdate  reason: avoid collision after fix types in other method */
        protected void onProgressUpdate2(java.lang.String... r13) {
            /*
                Method dump skipped, instructions count: 2500
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kentos.loader.activity.MainActivity.FixObbDownloadTask.onProgressUpdate2(java.lang.String[]):void");
        }
    }

    static {
        try {
            System.loadLibrary(Deobfuscator$$app.getString(-3440719978073775945L));
        } catch (UnsatisfiedLinkError e) {
            FLog.error(e.getMessage());
        }
        fixinstallint = false;
        check = false;
        hiderecord = false;
        gameint = 1;
        bypassmode = Deobfuscator$$app.getString(-3440719948009004873L);
        bitversi = 64;
        noroot = false;
        device = 1;
        game = Deobfuscator$$app.getString(-3440719917944233801L);
        kernel = false;
        Ischeck = false;
        modestatus = false;
    }

    private void CountTimerAccout() {
        Handler handler = null;
        String str = "ۡۦۦۡۡۦ۠ۜۗ۠ۡۥۙۦۛ۠ۦۡۗۚۘۚۨۦۗۛۦۘۜۦۚۥ۫ۘۘۦۨۡ۬ۨۖۘۛۛۧۢۧۛۖ۬ۤۚۜ۬ۥۖۖۧۖۛۢۙ۫۟ۚۡۘۘۚۗۥۦۛ۬ۨۘۦۥۖۦۗ۠ۘۚۜۛۜ۠۠ۧۡۜۨۗ۫ۦۘۘۚۡۛ۬ۡۚۨ۬ۜۨۥۘ۫ۛۙ۠ۦۜۘۗۙۡۘۨۛۜۘۛۤۜۥ۠ۗۘۖۙۙۜۖۨۥۤ۬ۙۜۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 664) ^ 448) ^ 6) ^ 468) ^ 780) ^ 26) ^ 370) ^ 274) ^ 785) ^ 39) ^ 673) ^ 333) ^ 613) ^ 229) ^ 839) ^ 215) ^ 504) ^ 647) ^ 992) ^ 693) ^ 57) ^ 881) ^ 610) ^ 703) ^ StatusLine.HTTP_PERM_REDIRECT) ^ 207) ^ 330) ^ 447) ^ 783) ^ 949) ^ 628) ^ 1707943671) {
                case 526950567:
                    return;
                case 1068258250:
                    handler.postDelayed(new Runnable(this, handler) { // from class: kentos.loader.activity.MainActivity.1
                        final MainActivity this$0;
                        final Handler val$handler;

                        {
                            this.this$0 = this;
                            this.val$handler = handler;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                long time = new SimpleDateFormat(Deobfuscator$$app.getString(-3440732072701681481L), Locale.getDefault()).parse(ApiServer.EXP()).getTime() - System.currentTimeMillis();
                                String str2 = "ۦۗۨ۟ۨۧ۬ۨۤ۬۫ۙۜۢۡ۟۫۬۫ۥۘۢۥۤ۠ۛۛ۠۠ۛ۠ۡۘۘ۟ۛۘۢۖۜۖۧۘ۬ۥۖۘۧ۠ۛ۟ۚ۠ۘ۫ۚۖۛۗۦۦۘۖ۟ۗۙۤۘۘۙ۬ۚۢ۫ۦۘۨۦۘۗۦۘۘ۫ۗۢۤۚۚۙ۬ۘۘۜۤۥ۬ۧۧۧۖۨۘۢۤۛۢۗۛۖۖۖۘۘۜۜۚۥۘۛۗ۫ۜۙۧ";
                                while (true) {
                                    switch (str2.hashCode() ^ 1771008650) {
                                        case -1720123556:
                                            System.exit(0);
                                            return;
                                        case -968189385:
                                            String str3 = "ۥۡۛ۠۬ۦ۫ۗ۟۠ۙۢۚۧۦۘۙۙۥۤ۬ۘۘ۬ۥۖۘۢۜۙۜۥۥ۬۠ۦۚۤۦۛۨۘۘۚۡۘۘ۫ۗۡۗ۟ۢۗۥۘ۠ۙ۬۬ۨۧۘۜۙۗۡ۟ۛۢۖۨۚ۠ۦۙۡۖۨۗۦۘۢ۬ۥ۠ۦۚۧۡ۬ۧۢۨۦۦۖۘ";
                                            while (true) {
                                                switch (str3.hashCode() ^ (-1253511626)) {
                                                    case -2113635521:
                                                        str3 = "ۧۚۜ۠ۥۡۘۤۥۘۘۡۙۡۘۡ۟ۨۘۜۖۦۜ۟۬ۧۦ۫۟ۚۢۙۙۗۗ۟ۗۤۜۘۗۜۦۘۚۧۖۜ۟ۥۘۙۥۖۘۗۘۦۘۥۖۦۘ۫ۖۥۘۘۥۖۚ۬ۜۘۙۤۡۡۤۨۘۦۤۡۘ۟ۚۘۘۦۨۜۘ۬ۧ۫ۦ۬۟ۡ۟ۨۦۡۨۘ۫ۘ۫ۛۧۦۘۗ۟ۖۘۚۡۥۘ۬۫ۜۛۜ۫ۘۢۖۘ۟ۥۨۦۗۘۛۘۨۘۚۧۚ۫ۥۗۚۦۜۛۨۖۖۖۜۘ";
                                                    case -314537550:
                                                        str2 = "ۦ۟ۜۘۢۗۨۖۚۖۘۜ۠ۢ۫ۗۡۘۘۦۖۚ۟ۦۖۨۥۘۤۜۥۘۧۦۚۛۦۥۨۖۗۦۤۖ۠ۤۥۘۨۢۜۥۙۦۥ۬ۙۡ۬۟ۘ۫ۚ۬ۦۜۦۤۙۗۛ۟ۤۘۗۛۖۘۗۤ۟ۘۡۡ۫ۙۦۤۚۧۦۦۘۤۘۡ";
                                                        continue;
                                                    case 160608990:
                                                        String str4 = "۟ۖۨۜۖۚۡۗ۬۟۫ۖۘ۠ۢۛۖۖ۬ۤۡۥۘۜ۫ۧۛ۠ۙۛ۫ۨۘ۠ۖۢۤۢۢ۠ۖۘۚۛ۠ۗۡۢۥۢۥۘۗۥۚۦۦ۟ۦۦۛۖۤۥۘۖ۟ۘۘۙۘ۫ۘۚۛۨ۫ۥۘۙ۬ۛ";
                                                        while (true) {
                                                            switch (str4.hashCode() ^ 1814413665) {
                                                                case -1358658464:
                                                                    str4 = "ۖ۬ۗ۫ۧۤۤۗ۫ۜۚۖ۟ۡۥۘۜۛۨۖ۟ۦۤ۟ۦۘ۫ۛۧۥۧۚۤۥ۟ۡۛۛۜ۬ۙۡۡۡۡ۫ۢ۟ۤۧ۟ۤۖۦۢۡۘۡۚ۫۫۫ۜ۠ۜۘۛۖۨۘۧ۬ۜۖ۠ۛۤۗ۫ۖۢۡۘۥۙۡ۠ۥۖۘۖۨۘۘۦۤۡ۫ۦۚۘ۬ۧۡۨۦۗ۫ۖۘۧۛۦۘ۬ۜۨۘۦۨۡ۟ۦ۬۟ۥ۫ۚۚ";
                                                                case 1108121144:
                                                                    str3 = "۬ۖۥ۫ۥۘۚۚۙۙۥۙۥ۫ۜۜۨۙۨۖۗ۬ۤۢۖۢۘۘۨ۬ۖ۠۬ۘۘۚ۫ۨۘۥ۫ۜۘۘۥ۬۬ۡۗ۫ۢۗ۠ۜۘ۬ۦۦ۫ۢۜ۫ۥ۫۫ۡۨ۠ۛۜ۟ۤ۟ۦ۬ۢ۬ۜۨۘ";
                                                                    break;
                                                                case 1530051251:
                                                                    String str5 = "۬ۚ۬ۙۢۜ۬ۡۢۗۤۥۡۡۖۘۛۗۢۧۥ۟ۡۖۚۗۡۘۖ۟ۨۘۦۚۡۖۘۨ۬ۥۡۤۗۦۚۘۧۦۨۜۨ۟ۜۖۜۘۤۙ۬ۥۦۜۦ۟ۦۨۜۧۘۙ۬ۡۡۜ۟ۢۗۥۘۘۤۧۨۙۥۡۨۙ۫ۙۢۢۨ۠ۜۖۘۚۡۥۤۨۧۘۘۡۦۘۖۤۖۦۡۛۖۗۜۘ۟۟ۛ۟ۚۚۗۤۢۦۨۤۢ۬۬ۚۤۗۘۢۛۖۘ";
                                                                    while (true) {
                                                                        switch (str5.hashCode() ^ (-1130621749)) {
                                                                            case -1819043568:
                                                                                str4 = "ۡۥ۠ۤ۬ۥۜۧۥۘۛۖۘۢۤۚ۟ۥۜۨۙ۟ۤ۟ۖۙ۠ۥۜۙۚۗۢۖۙۧۘۘۙۧۖۤۤۗ۫۟ۦ۬ۦ۬ۥۤۦۘۛۧۘۘۚۛ۫ۗۦۦۢۢۘۘۨۗۡ۠ۖۥۤۨۥۤ۫ۙۘ۬ۤۤۛۚۜۘۨۦۧ۟ۘۜۘۤۧ۟ۙۡۧۨ۠۫ۛ۬ۥ۟ۙۘۘۤۥ۫ۨۖ۬ۚۥۦۢۧ۟ۨۖۗ";
                                                                                break;
                                                                            case 645353589:
                                                                                String str6 = "ۛۢۗۤۗ۬ۘۗ۟ۙۛۢۘۥۤ۠ۢۡۢ۬ۤ۫ۖۥۘۘۢۤۗۤ۫ۧۦ۟ۗۙۘۤ۫ۚۤۛۦۙۡۧۘۦۛ۟ۧۨ۠ۛ۟۫ۜۜۡۘۥ۫ۥۛ۟ۦۜۦ۬ۖۗۨۘۗۦۢۛۧۡ";
                                                                                while (true) {
                                                                                    switch (str6.hashCode() ^ (-654336406)) {
                                                                                        case -1297104051:
                                                                                            str6 = "۟ۘ۠۟ۨۦۘۛۖۡۡ۟ۢۥۢۚۛۙۚۙۥۡۘ۫۠ۜۘۥۛ۫۠ۦۘ۫ۙۙۤۙۨۗ۠ۧۤۥۘۘۙ۠ۜۧۦۧۗۡۚۚۤۗۖۤۖۡۗۤۡۙۦۖ۬ۘۘۨۘ۫ۤ۬ۖۘۜۜۜۘۙ۬ۥۘۙۧۥۘ۫ۢۙۦۡۚۥ۫۟ۧۥۘۛ۟ۦۘۦۡ۟ۡۨۧۦۜۘۨۗۡۘۖۚۘۦۥۦ۟ۧ۠ۜۜ";
                                                                                        case -677723659:
                                                                                            str6 = time <= 0 ? "۠ۨۧۘۗۜۙۗۙۚ۫ۦۖۘۘۤۚۦ۟ۢۦ۬ۘۘ۫۬۬ۖ۬ۨۢۜ۠ۢۨۥۜۢۥۘۥۜۥۗۢۜۘۤۡ۟ۡۗۥ۫ۚۤۖۛۨۘۙۢۜۘۛ۠ۨ۬ۤۗۦۜ۠ۜۨۘۡۘۛۙۨۥۘ" : "۬ۦۙ۠ۛۧۢۘۖۘ۫ۛۜ۫ۧۘۢۙ۠ۖۧۨۡۛۡۖۧۦۘۧۢۗۗۧ۫ۜۦۥ۟ۗۖۘۤۤ۠۬ۙۦۖ۫ۦۘۜۢۘۢۚۚ۬ۜۘۦۡ۟ۙۤۜۙۜۙۘ۠ۡ۬ۤۚ۬ۤ۬۠ۙۥۛۢۨۜۥۨۘۥۥۗ۬ۜۜۘ";
                                                                                        case -416904540:
                                                                                            str5 = "ۜۘۧۘۛۤۖۦۖ۬ۡ۫۠ۜۤۘۦۚۜۜۦۘۘ۟ۗۦ۫ۛۤۤ۬۬ۧۖۜۘۥۚۖۘۗ۫ۘۤ۟۬ۘۚ۫ۨۨۘۧۘۦۘۚۚۡۘۛۥۜۘۗۜ۟۬ۡۘۨۢۛۘۙۤ۫ۦۜۘۦۖۤ۬ۤۦۘۨۤۥۘۘ۫ۖۜۤۨۘۗۛۥ";
                                                                                            break;
                                                                                        case 343485792:
                                                                                            str5 = "ۛۦۤۚۘۥۨ۠ۖ۬ۥۗۢ۟ۨۘ۠ۙۘۘۗۗۡ۟ۤۨۖۢۧ۬ۥۚۢۘ۟ۙۡۘۜۢۚۦ۠ۚۧۤۨۘۖۗۛۚۦۡ۫ۗۨۨ۫ۦۘۗۥ۬ۜۦۨۤ۠ۢۙۗۧۖۙۙۙۥۦ۠ۧۡ۫ۤ۫ۗۡۘۛۤۗ۠ۦ۫ۥۜۧۘ۟ۖۦۘ۫ۗۡۘۨۚۢۤ۫ۜ۫ۙۢۖۧۤ۬ۘ۟ۥۛۥۘۨۦ";
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 1673461981:
                                                                                str4 = "ۦ۟ۦۘۛۛۚۘۢۖۛۤۥۘۗۗۜۘۨۢۜۘۢۤۖۙۚ۫ۨۢۡۘۜۧۡۤۛۚ۫۟ۥۛۜۘۢ۬ۖۘ۬ۘۖۧۗۥۨۧۘۢۗۨۘ۟ۦ۟۠ۤۗۥ۬ۦۘۘۘۦۜۖۧۦۚۦۘ۬ۘۡۘۚۜۛۤۘۘۘۧۡۚۤۚۢۗ۬۫ۡۥۤۤۘۛ۫ۧۘۖ۫ۨۖ۠ۜۢۗۥۨ۫ۗۤۘۘۜۨۛۦۢۦ۬ۘۢۨۢۦۦۛ۠ۡۜۘۘۥۡۛ";
                                                                                break;
                                                                            case 1830862586:
                                                                                str5 = "ۜۢۡۢۤۙۥ۟ۘۙۘۖۘۤۜۨۜ۟ۦ۫ۛ۠۟ۨ۠ۡۥۘۘۨ۠۠ۘۡۘۗۖۢۖۨۥۢۗۘۘۥۢۦۧ۬ۘۧ۟۟ۧۧۥۘۗۢۘ۟۫ۥۘۘۥۖۛۧۤۖۢۘۨۖۘۛ۫ۡۡۥۥۘۥۢ۟ۥۨۙۢۚۜۥۢ";
                                                                        }
                                                                    }
                                                                    break;
                                                                case 1564249147:
                                                                    str3 = "ۤۤۜۘ۬ۥۘ۫ۜ۟ۘۤ۟ۡۚ۟ۡۖۙۧ۟ۜۖۤۡ۫ۜۜۙ۠۠۫ۢ۬ۥۡۧۢۗۗۜۛ۫ۨۙۘۦۘۖۗۢۥۨۛۦۘۙۥۜۘۛۛۜۖۦۨ۫ۨۘۖۜۛۜ۫ۢۥۥ۟";
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 1407314839:
                                                        str2 = "۟ۛۦۘۡۚۗۦ۬ۥ۠ۧۖۛ۬ۡۚۡۤۖۚۛ۬ۧۛۙ۫ۜۘۡۡۤۨ۬ۚ۟ۡۗۘۥۤ۬ۡۡ۠ۜۘۘ۫ۘۦۖۦۖۘۥ۠ۤۙۨۚۥ۟ۤ۬۫ۜۘۙۖۚۡۗۨۘۘۡۜۘۖۙۥۧۦۛۗۡ۬۬ۦۖۧۢۘۘۢ۬۠";
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 1644657421:
                                            str2 = "ۤ۬ۥۥۡۚۦۦۨۙۢۦۘۨۢۦۘ۟ۚ۬ۚۘۨۘ۠۠۠ۙ۬ۘۘۥۚۧۘۢۧ۬ۛۦۛۜۧۘۗۨۙۢۨۛۦۧۘ۫ۚۡۨۜۥۗۨ۟۠ۡۡۘۨۙۦۤ۫۟ۖۨۘۦۗۘۘ۬ۦۜۘ۟۠ۛۦۧ۠ۚۤ۠ۡۘ۟ۖۘۘۘۙۜۘۛۦۦۘۚۗۡۘ۫ۗ۫ۧۦۘ";
                                            break;
                                        case 2012827756:
                                            String str7 = (time / 86400000) + Deobfuscator$$app.getString(-3440731986802335561L) + ((time / 3600000) % 24) + Deobfuscator$$app.getString(-3440731973917433673L) + ((time / 60000) % 60) + Deobfuscator$$app.getString(-3440732235910438729L);
                                            TextView textView = (TextView) this.this$0.findViewById(C0931R.C0934id.keyexpiry);
                                            String str8 = "ۢۦۖۖۙ۠ۚ۫۟۟ۗۤۥۨ۬ۡۤۘ۬۟ۥۘۛۥۤۢ۬۟ۗۦۢۢۜۤۜۦۘۖۥۛ۫ۦۚۘۗۙۜۡۧۘۜۧۘۘۛ۠ۘۘۤ۬ۧۛۡۨۘ۫ۗۙۗۙۥۘۖۥۧۢۚۨۘۘۚۡۘ۠ۢ۫ۥۧۡۘۢۗۛۜۢ۟ۖۘۢۢۦۢۥۘۙۢۖ۬ۗۚ۫ۛۧۢ۫ۗ۬ۦۧۘۤۦۦۘۧۤ۠";
                                            while (true) {
                                                switch (str8.hashCode() ^ (-61021016)) {
                                                    case -1495477299:
                                                        str8 = "ۘۢۨۘ۠۟ۥۘۡۤۚۢ۟ۢ۟ۗۡۘۙۜۧۘۗ۫ۛۧۨۘۗۗۗ۫ۘۤۨۦۢ۠۬ۨۨۙۡۧۡۜۘۖۚ۬ۘۖۢ۬ۖۤ۫ۘۡۗ۟ۗ۟ۦۗ۫ۙۜۧۤۖۘۚ۫ۨۨۛ۠ۢۖۥۘۖۜۧۘۜۖۘۤۜۛۡۨۦۜ۬ۜ";
                                                        break;
                                                    case -714577011:
                                                        String str9 = "ۜۡۜۢ۫ۡۘۙۢۧ۫ۢۖۘۥۚۖۧۦۛۙۛۤۤۙۢۨ۟ۜۘ۟ۚۗ۠۠ۜۘۡۢ۬ۥ۫ۘۘۧۤۛۨ۬ۦۘۚ۬ۥۖۨۨۘۙۥۚۧۛۚۡۡۧ۟ۘۙۨۚۦۥۦۘۨۨۜ۟ۚ";
                                                        while (true) {
                                                            switch (str9.hashCode() ^ 1466316072) {
                                                                case -579160750:
                                                                    str8 = "ۨۘۥۘۤۧۡۘۘۖۨۥۙۦ۟۠ۧۥ۬ۛۦۦۧۘۚۧۦۘ۫۫ۡۗۛۤۨۧۦۖ۬ۤۙۜۦۢۨۘۧ۫ۧ۫ۚۖۘۧۢۜۡۚۨۘ۠ۙۜۘۜۢۡۘ۫ۢۨۘۥ۟۫۠ۘۜۘۖۤۧۛ۟ۤ";
                                                                    continue;
                                                                case 1166283477:
                                                                    str8 = "ۜۡۢۙ۟ۤۙۜۗ۫ۜۘۤۦۧۧۢۘۘۘۖۘۖۛۖۢۢۤ۠ۘۜۨ۬ۖۘ۫ۛۘۡۦۥۦ۟ۙ۟ۘۢۖۜۘۙۥ۬۬۠ۡۘۙ۬ۜۘۨۢ۬ۦۢۖۘ۫ۘۢ۠ۙۨۦۖ۟ۘۘۧۚۢۧۦۥۗۧۦ۬ۖۥۢ۟ۡۘ";
                                                                    continue;
                                                                case 1636654783:
                                                                    str9 = "۬۠ۜۘۘۨۘۘۜۛۛۢ۫ۥۘۙۘۥ۫ۡۖ۠ۥۘۥۚ۬ۖۦ۟ۨۤۚۚ۬ۗۖۖ۟ۥۧۨ۬ۨ۟ۨۚۨۘۢۜۥۡۗ۟ۙۤۜۘۚ۫ۡۨ۬ۜۥۦۘۜۛ۬ۙۛۨۤۙۦۧۦۧۘۤ۫ۜۨۦ۟ۘۧۘۘۚۢ۠ۤۘۗۡۨ۬۬ۛۖۧ۟ۤۗۤۦ۟ۦۗۖۦۥۙۨۛۘۨۛۛۗۚ۟ۤۨ";
                                                                case 1943783928:
                                                                    String str10 = "ۛۗۖۘۦۨۛۛۘۥۘۦۘۘۘۙۥۡۢۨۨ۫۬ۙۡ۫ۥۘۜۜۙ۫ۢۥۙۢۖۚۨ۫ۥۙۨۘۨۛۨۛۖۨۘۚۨ۬ۤۛۘۨۛۖۘۡۤۡۥۗۢ۠ۥۘۘۨۙ۠ۖ۠ۘۘۢۤۜۗۜ۬ۖۥۘۛۡ۬ۡۡۘۘۢۛۗۛۜۗۘۘۘۘۖۨۘۦ۫ۜۘ۫ۢ۠ۗۜۖۘ";
                                                                    while (true) {
                                                                        switch (str10.hashCode() ^ (-1754873337)) {
                                                                            case -755262748:
                                                                                str9 = "ۤۤۢۦۗ۫۫۟ۜۢۖ۠۬ۛۥۧۡ۠۫ۜۖۨۨۥۘ۠ۙۗۘ۟ۘۦۚۚۜۗ۠ۥ۠ۡۤۚ۬ۛۨۧۦۚۦۘۚۙۨۛۘۦۖۚۥۘۦۘ۠ۖ۫۟ۗ۬ۦ۟ۘ۫ۛۘۥۗۚۤۡۦۛۡۗۨۘ۟۫ۦۘۛ۫۠۫ۢۨ۬۫ۘۜۖۖۡۛۖۘ۟ۡۧۘۨ۬۬ۤۖۦۘ۫ۡۦۨۢ۫ۢۡۥ۬ۢۢۡۦۙۨ۠ۥۨۛۧۦۘۧۖۘۘ";
                                                                                break;
                                                                            case -525303113:
                                                                                str10 = "۫ۙۖ۟ۤۧۗۧۤۧ۬ۦۘۖۦۡۘۧۛۡۖ۟ۘۘۛۦ۟ۚۨۦۘۤۘۥۘۡۤۜ۟۠ۤۤۚۨۨۦۧۘۜ۠ۛۙۚۜۤۦۢ۫ۡۡۤۗۘۗۚۤۚۘۨ۬ۢ۫۠ۢۦ۬۬ۛۤ۫ۧۗۨۖۘۨۤۜۗۚۧۡۛۘۘۨ۟ۦۥۨ۠۬ۦۗۘ۠ۡۡۧۡۘۨۨۡۘۦۢۗۘۥۖۘۘ۫ۗۢۙۨ۟ۜۡۘ";
                                                                            case 850459982:
                                                                                str9 = "ۛۙۘۗۛۛۥۢ۫۬ۙۜۘۢۖۘۥۖۥ۠ۙۥ۬ۥۥۘۖۦ۫ۧۢۢ۟ۡ۟ۚۖۡۘۛۜۧۙۖۖۚۧۦۘۛۡۤ۬ۧۢ۟ۘۤۜۜۘۘۜۥۥۧ۠ۖۘۤ۠ۥ۟ۜۘۜ۬ۘ۫ۘۛۤۜۦۘۖۢۦۘۧ۠ۥۘۛۗۦۨۤۘۘ";
                                                                                break;
                                                                            case 1110853262:
                                                                                String str11 = "۫ۚۨ۠۟ۛ۠ۦۘۗ۠ۤۚۗۜۘۜۖۘۗۘۜۛ۬ۨۘۢۘۚۨۚۡۘۨ۫ۗ۫۟ۙۙۦ۟ۢۦۜۘۜۘۙۤۢۡۧۘۨۗۗۢ۫ۖۙۘۘۨ۠ۗۢۗۛۢۗۦ۬۫ۛۡۡۘۘۖ۠ۛ۟ۙۧ۟۠ۛ۟۠ۡۘۥۜۖۘ۟۫ۗۚۜۘۘ۬۠ۛۜ۬۟۟۬۬";
                                                                                while (true) {
                                                                                    switch (str11.hashCode() ^ 824421386) {
                                                                                        case -1281378827:
                                                                                            str11 = "ۘۥۢ۫ۚۗۘۤۨۦۦۤۢۘۘ۟ۗۜۦۤۛۙۢۦۘۘۡۘۚۨۘۘ۠ۥۨۤۤۦۘۢۘۡۜۘۚ۠۫ۡ۠۫ۥۘۡۧ۫ۙۙۦۢۧ۫ۦۦۡ۬ۡۖۘۚۚۧۘۜۚ۫ۡ۬ۙۧ۟ۜۜۡۢۨ۫ۗۜۥۘۧۖۛۜۨ۠ۦۛۖۘۖۖۚۤۘۨۘۗۥۨۘۥۨۢۡۗۢۜۜۘۘ۫ۢۢ۠ۥۗۨۦۛ۟ۛۙۚۜۥۘ۫ۢۡۘۜۗۗۦۥۘ";
                                                                                        case -174306389:
                                                                                            String str12 = "۟۠ۢ۠ۛۘۘۡۧۨۥۜۚ۠ۢۖۘۚۢۗۛۙۦۚۤۖ۟ۧۡۛۙ۬ۛ۬ۡۢۙۤۤۤۧۜۘۘ۬ۙ۫ۧۘۘ۫ۦۙۧۤۤۛۥۜۘ۫۠ۤۤ۠ۨۥۜۜۘ۟۠ۦۢۡۨۘۙۗۡۙۜۘۘۨۘۘۘۚ۟ۨۘۤۙۙۦ۫ۗ";
                                                                                            while (true) {
                                                                                                switch (str12.hashCode() ^ (-1861020077)) {
                                                                                                    case -1148274603:
                                                                                                        str12 = textView != null ? "۠ۙۚۦۜۨۦ۟ۚۘۧۚۘۧۙۡۢۤۗۨۧۧۥۘۦ۫ۗۖ۟ۤ۬ۨۤۢۜۧ۠ۖۤۧۧۤۜۙۗۢۢۡۤۤ۟ۙۘۘۥۨۦۤ۬ۧۖۧ۟ۢۚۦۘۡۘ۫ۜۚۚۚۡۦ۬ۤۨۧۖۤ۬ۗۖۧۢۖۡ۬ۡۢ۟۫ۘ۟۫ۡۛۦۘۥۨۥۘۡۘ۟ۨۡۘ۫۫ۖ۬ۖۧۦۧۧ۟ۡۥۘ" : "ۛۙۡۘۤ۫ۜۤ۠ۧۤۨ۫ۘ۟ۗ۠۫ۨۘۤ۫ۥ۟ۨۤۖ۟۬۬ۘۨۘۦۚۘۘۖۜۥۘۙۖۦۜۘ۟ۨۨ۠ۡ۬ۧۗۖۙۜ۬۠ۤۘ۟ۡۤ۬ۡۡۡۤۨ۟ۥۚۙۤ۠ۥۜۨۘۛۢۥۘ۟ۧۜۘۙۖۜۘۤ۠ۨۘ۟ۤۧۥۛۘۘۥ۠ۢۨ۠ۡۖۥۚۗ۫۫ۤۦۦۘۧۖۖۘۚ۬ۛ۬۬ۘۚۗۨۛۦۧۘ۠ۘۦۘۗۜۗ۫ۚۘۘۛۦۜۘ";
                                                                                                    case -416497048:
                                                                                                        str11 = "ۖۧۜۘۖۙۖۘ۠۠ۘۘ۠ۘۙۢۤۙۧۨۡۘۤۘۢۡ۟ۗۤۙۥۘۧۨۗۙۦۖۘۛۙۚۛ۫ۘۘۖۛۤۢۚۛۦۜۥۢۚ۬۬ۜ۟۟ۤۨۚۧۦۢ۫ۥ۬ۖۦ۫ۖۦۘۧ۠ۥۘ۫ۥ۠۠ۜۘ۫ۥۦۘ۟۬ۚۘۜۥۘۦۘۨ";
                                                                                                        break;
                                                                                                    case 316176632:
                                                                                                        str11 = "ۛۗۘۦۨۨ۠ۗۥۘۢۗۜۧۖۖ۬ۧۥۘۖ۫۟ۚۜۦۨۗ۠ۙ۫ۡۘۚۗۢۙۙۜۘۦۗۡۘۚۥۥۥ۟ۜۤۨ۟ۡۘۦۨۡۙۗۥۨۗۚۡۤ۠ۦۘۢۥۗۚ۬ۥۘۡ۟ۙۦۤۜ";
                                                                                                        break;
                                                                                                    case 2089492847:
                                                                                                        str12 = "۬ۙۜ۬ۨۜۥۖۦۙۦۥۘۤۚ۫ۥۘۧۘ۬ۢۡ۟۫ۧۡ۬ۗ۫۟ۘۦۚۤۧۦۛ۟ۦۧۘۗۨۡۙۦۡۘ۫۬ۜۘۖۥۧۘۖ۫ۜۘۘۗۨۘ۫۟ۥۘۡۘۗۤ۟ۦۡ۫ۜ۠ۘ۫۫ۦ۫ۡۨۨۜ۠ۘۘۘۚ۬۫ۗۚ۟ۛۡۤۢ۠۫ۦۖۘ۠ۤۘۜۙۙۤ۟ۙۡۡۜۘ۟ۖۥۘۗ۠ۡۘۜۡ۠ۘۡۜ۟ۦۜۘۜۖۧۛۘۧۘۗۦۜۙۢۗ";
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 62823835:
                                                                                            str10 = "۫۠ۖۘۥۤۦۘۜۗۤۚۚۘ۟ۘۦۧۨ۠ۛ۫ۡۘۗۖۙ۠ۖۘۥۥۚۨۛۤۚۨۙ۬ۛ۠ۜۦۨۨۘۡۥۡۘۢۜۙۙۘ۫۟ۚۤۙ۟ۚۘ۫ۥۘ۠ۡۦۘۤۦۖۡۜۘۙۖۗ۬ۡۧۘ۟ۢۧ۟ۧۙۖۦۘۗۧۡۗۖۙۤۘۧ۠ۗۦۘۛۥۦ۠ۛ۠۫ۛۗۡۡۜۗۡۨ۟۠ۚۖۤۚ";
                                                                                            break;
                                                                                        case 1472608544:
                                                                                            str10 = "ۚۧ۬۟ۡۡ۟ۨۡۖۖ۠ۙۡۥۘ۟ۛ۠ۤۙۜۘۥۥۥۘۢ۟ۖۚۧۛۚ۬ۨۘ۫ۛۦۘۚۡۤۡۤۜۘۙۖۥ۬ۜۧۜۧۧۨۨ۬ۙ۬ۜۘۧۜۖۘۢۛۛۢ۬ۦۘۙۧۙۧۚۙۡۗۙۙ۫ۦۙ۫ۥ۫ۚۤۦۦۧۘ۫ۥۤ";
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case -108875281:
                                                        break;
                                                    case 1764119699:
                                                        textView.setText(str7);
                                                        break;
                                                }
                                            }
                                            this.val$handler.postDelayed(this, 1000L);
                                            return;
                                    }
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }, 0L);
                    str = "ۗۜۢۧۜۘۙۖۡ۠ۙۛ۠ۖۥۨۢۗ۟۬ۦۗۙۡۙ۬ۜۘ۬ۨۨۘۢۡ۬۟ۜۦۘۦ۠ۡ۫ۥۗۨۖۜۧۤۖۖ۟۫۫ۨ۟ۥۥۖۧۘ۟ۚۜۘ۟۟۬ۥ۠ۨۘۚۖۨۘۧۦۧ";
                    break;
                case 1640047113:
                    str = "ۚۨ۠ۚۢۥۜۜۤۗ۠ۧۛ۬ۖۦۛۨۨۖۤۚۚۖۚ۟ۧۗۖۦۘۥۜۦ۟۬ۥ۬ۗۚۗۚۛۡۡۘ۟ۗۥۘۜۡۛۢۛ۟ۚ۠ۘۜۤۘۘۨۨۜۘۜۢ۬ۙۙۨۡۘۚۚ۠ۛ";
                    break;
                case 1909229751:
                    handler = new Handler();
                    str = "ۦ۟ۖۡ۬ۡۘۦ۬ۛۜۗ۟ۥۘۖۘۗ۬ۧۢۘۖۡۧۘۢۧۖۘۘ۟ۜۘ۠ۢۦۜۢۦۜ۫ۨۥۢۖۘۥۜۨۨۡۖۘۘۙ۫ۤۛۢۡۗۜۙۦۢ۫ۢۨۦۘۘۘۨۘۘۗ۫۫ۢۘۥۡۛۗ۟ۨۥ۠ۗۘۢۡۥۘۗۚ۟ۜۧۡۘۦ۫ۧۖۡۧۘۤۥ۫ۨ۟ۨۘۗۙ۟۬ۧ۫۠ۤۘ۬ۨۛ۬ۖۘۘۥۤ۬ۧ۫ۘۘۢۧۜۘۚۦۜۘ۟۟ۡ";
                    break;
            }
        }
    }

    public static void DwnSocket(MainActivity mainActivity) {
        String str = "ۙۚ۟ۛۥۘۢ۬ۖۘۦۨ۫ۧۥۘ۠ۤ۬ۛۘۛ۠ۡۥۘۧۤۥۘۜۥۢۜ۫ۙۘ۫ۖۦۜۦۘۙۙۘۙۡۨۘ۬ۚ۟ۘۚۗ۟ۨۙۦۖۧۗۧ۠ۗۘۘۜۗۧۧۤۦ۬۫ۜۚۡۡ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 695) ^ 543) ^ 997) ^ 115) ^ 707) ^ 672) ^ 620) ^ 440) ^ 631) ^ 371) ^ 515) ^ 456) ^ 512) ^ 978) ^ 379) ^ 394) ^ 918) ^ 196) ^ 200) ^ 88) ^ 460) ^ 591) ^ 123) ^ 353) ^ 981) ^ 246) ^ 588) ^ 982) ^ 836) ^ 428) ^ 496) ^ (-1094428540)) {
                case -963566126:
                    str = "ۜۦۛۢ۠ۘۜۗ۬ۛ۟ۨ۠ۥ۠ۢۨۨ۬ۤۡۘ۠ۨ۬ۢ۫ۤۙۜۖۖۧۦۘ۫ۦ۠۠ۡۘۧ۫ۚ۠۬ۦ۬ۘۢۡۡۨۖۤۜۢۜۦۦۢۥ۠۠۠۫ۖۘۛ۫ۡۘۜۨۡ۠ۦۨۘ۠ۥۦۘ۫ۙۛۚۢۡۘ۟۫ۖ۠۬ۘۘ";
                    break;
                case -856384935:
                    new DownloadZip(mainActivity).execute(Deobfuscator$$app.getString(-3440732132831223625L), ApiServer.mainURL());
                    str = "ۤۗۦۘۤۢۗۚۜۧ۬ۚۛۦۤۚۤۖۨ۠ۙ۠ۖۨۖۜۜۦۘۨۗۜۘۗۧ۟ۗ۫ۦ۟۠ۨۘۧۛۨۘۤۘۖۚۦۧۧۙۨۘ۠ۖۘۡۧۨۡۗۙۜۚۜۘۤ۬ۢ۬ۘۦۜۤۦ۟ۨۤۙۡ۫ۚۜۜۡ۟ۛ۫۠۬ۖ۟۟ۥۘۛۥۥۦۖۘۧۗۗ۠ۙۡ۟ۦۘۘۡ۬ۖۘ۬ۘۦۘ۠ۨۤ۟ۛۨ";
                    break;
                case 543251690:
                    return;
            }
        }
    }

    private void ExecuteElf(String str) {
        try {
            Runtime.getRuntime().exec(str, (String[]) null, (File) null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void Loadssets() {
        String str = "ۦۥۖ۠ۙۤۧۙۥ۠ۧۧۘۚۧ۟۠ۡۘۡۦۘۡۚۡۘ۟ۥ۟ۥۙۤۦۤ۫۠ۨۖۘۙۗۨۡ۬۬ۧۚۦ۟ۧ۫۟ۡۘۘۜۙۜۤۧ۟ۦۥ۫ۥ۠ۘۗۙۛۤۢ۠ۚۚۨۘ۠ۛۗۚۤۜ۬ۛۡۘۥۨۥۘۨۥۜۘۤۦۡۘۧ۠ۗۛۡۘۗۘ۟ۜۥ۫ۤۢ۫ۤۖۘۙۘۘۘۖۘۥ۫ۗۥۘۚۜ۬ۙۙ۟ۚۜۚۦۙۛۜۙۡۗۖ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 453) ^ 1001) ^ 154) ^ 185) ^ 348) ^ 44) ^ 820) ^ 993) ^ 132) ^ 390) ^ 170) ^ 225) ^ 931) ^ 481) ^ 247) ^ 216) ^ 402) ^ 343) ^ 497) ^ 270) ^ 733) ^ 973) ^ 101) ^ 706) ^ 500) ^ 404) ^ 617) ^ 986) ^ 911) ^ 891) ^ 995) ^ 1742098022) {
                case -2001991014:
                    MoveAssets(getFilesDir() + Deobfuscator$$app.getString(-3440726708287528777L), Deobfuscator$$app.getString(-3440726699697594185L));
                    str = "ۚۧۗۦۤۘۘۦۡ۬ۢۚ۠ۦۖۨ۫ۥۨۘۗ۫ۤۢۛۖ۟ۨۧۘۛۖۛۧ۫۟۬ۥۨۨۗۚ۟ۖۦۘۡۙۡۤۖۗۖۛۧۢۚۘۤۢۢۖۨۨۚۜۙۢ۟ۚ۬ۧ۟ۚۛۙۜۤۥۘ";
                    break;
                case -1885273692:
                    MoveAssets(getFilesDir() + Deobfuscator$$app.getString(-3440726532193869641L), Deobfuscator$$app.getString(-3440726523603935049L));
                    str = "۟ۖۡۘۗۢۢ۫ۛۜۘۢۘۘۧۚۜۘۢۨۗۢۙۥۛۨۤۤ۫ۥۘۙۤۘۘ۬ۙۖۜۖۘۜۡۖۗۨۙۗ۟ۚ۠ۧۖۤۡۥ۬ۧ۫ۙۦ۫ۥۜۘۨۨۙ۟ۦ۟ۦۧ۫ۚۛۥۦۡۘۧ۟ۙۡ۬ۨۘۥ۟ۘۘ۟ۘۖۦۜۧۘ۠ۙۜۘ۬۫ۛۥۨۖۘ۫ۤۥ۬ۧ";
                    break;
                case -788639158:
                    MoveAssets(getFilesDir() + Deobfuscator$$app.getString(-3440726682517725001L), Deobfuscator$$app.getString(-3440726673927790409L));
                    str = "ۛۙۘۡۢۙ۫ۡۥ۬۫ۡ۬۫۬ۗۡۦ۠ۘۦۚۧۡۘۢۗۙ۬ۦۖۘ۠ۘۚۧۥۘۘۦۧۨۘۙۡۧۖۛۚ۬ۤۘۚۛۡۖ۠۬ۦۘۨۘ۬ۙ۠ۦۥۥۘ۫۬ۜ۟ۖۢۖۢۥ۫ۙۡ۫۬ۦ۟ۡۜۤۦۘۖۘۛۘ۟ۦ۬ۚۡ۬ۧۙۧ۟ۖۤۗۦۘۤۙۚۚۛۥۘۖۘۦۡۤۘۘۛ۫ۦۘۛۤ";
                    break;
                case -685938068:
                    MoveAssets(getFilesDir() + Deobfuscator$$app.getString(-3440726609503280969L), Deobfuscator$$app.getString(-3440726600913346377L));
                    str = "ۢۛۦۡۥۘۘۚۙ۟ۥۤۨۙۨۨۘۦ۠ۨۤ۫ۢ۬ۤۤۨ۬۟ۥۦۨۙۘۙۘۙۘۦۜ۫ۙۛۨۘۧۛۨۖۧ۬ۗۛۗ۬ۘ۬۬۟ۛۢۛۙ۟۬۟ۛۛۘۘۖۖۦۢۡۜۘۘۢۦ";
                    break;
                case 269235128:
                    str = "ۜۘۘۘۡۘۡۘۘۘۥ۟ۚۨۘ۬ۦۡ۬ۙۥۙۚۨۘ۫ۤۥۘۚۛۖۘۧۖۡۘۙۦۚ۫ۖۜۤ۟ۛۡ۟ۗۛۧۖۘۘۜۗۡۧ۠۟ۜۖۘۦۥ۠ۙۖۨۘۖۗۤۖۙۜۘۥ۠ۤۗۛۗۛۧۥ";
                    break;
                case 609526939:
                    MoveAssets(getFilesDir() + Deobfuscator$$app.getString(-3440726729762365257L), Deobfuscator$$app.getString(-3440726721172430665L));
                    str = "۟ۜ۫ۧۤۢۘۤۧۢۦ۬ۛۛۖۨۛۖۘۧ۫ۨۘۢ۬ۢۘۜ۠۫۫۠ۛۛۧ۠ۦۘۙۨۧۘۢۡ۫ۢ۫ۜۧۧۥۧۥۘۙۘ۠۫ۨۥۘۙۤۥۘۡۢۢۨۦۘۙۦۘۛ۫ۡۘ۠ۗ۬ۖۤۥۚۡۧۘۥۘ۫ۛۜۧۘۥۧ۠ۡۜۖ۟ۧ۠ۡۗۗۖۤۡۘۖ۟ۛۢۧۛ۫ۜ۠ۗۥۖۧۚ۠ۚۛۥۘ";
                    break;
                case 999045672:
                    MoveAssets(getFilesDir() + Deobfuscator$$app.getString(-3440726570848575305L), Deobfuscator$$app.getString(-3440726562258640713L));
                    str = "ۗۗۡۘۚۡۖۚ۠ۘۘۖۤۦۘۥۨ۠۬ۙ۟ۘۘۛۧۘ۬ۦۨۧۘۡۘۥۘۖۗۧ۠ۖۙۛۢۨۘۖۛ۠۟ۤۖۨ۠ۦۘۛۜۘ۫ۖۧۛۗۦۢۥۘۘ۟۠ۢۥۨۘۙۧۗۤۦۘ";
                    break;
                case 1412861207:
                    MoveAssets(getFilesDir() + Deobfuscator$$app.getString(-3440726493539163977L), Deobfuscator$$app.getString(-3440726484949229385L));
                    str = "ۤۡۢۤۧۨۘۚۙۗۡ۟ۡۘۦۙ۠۫ۨۦ۬ۦۗۜ۠ۥ۟ۙۛۧۜۗ۠ۚۢۡۡۘۧ۠ۗۡۙۜۘۗۘۨۗۦۥۛۚۙۧۧ۫۠ۦ۟ۧ۫ۗ۫ۧۘۘۙۜۡۘۨۖۘۘۦۚۘۘۙۘ۬۟ۚۖۖۡ۫ۡۖۗ۬ۡۜۚ۫ۤ";
                    break;
                case 1924941391:
                    return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private boolean MoveAssets(String str, String str2) {
        File file = new File(str);
        String str3 = "ۘۡۡۘۜۡ۬ۖۢۡۧۗۜۨۜۦۡۡۖۘۧۤ۟ۙ۠ۘۛۛۡۘۧۖۢۚۘۡۘۚۚۡۘ۬ۛۦۘۧۧۨۦۘ۟ۧۗۥۖۙۙۖۖ۬۟۠۟ۖ۠ۖۘ۫ۙ۟۫ۨۨۤۡۡ۟ۦ۠ۛۧ۠۠ۨۘۗۥۚۚۡۡۘۨۡۘۖۗۜۘ";
        while (true) {
            switch (str3.hashCode() ^ 373201637) {
                case -404336492:
                    file.mkdirs();
                    break;
                case -134814048:
                    String str4 = "ۧۚۘۘۛۗۘۘۡ۫ۚۥۦۘ۬ۜۗۘۥۥۛۦۘۤۡ۟ۤۜۖۘ۠ۚۛ۫۬ۙۛۜ۫ۖۗۥ۟ۜۗۗۥۖۘۚ۬ۧ۬۬ۡۗۚۛۛ۫۟ۘۖۨۘۘۗۘۦۦۤۦۡۛۙۡۘۘ۫ۡ۫ۛ۫ۗۗ۟ۖۘ۠ۢ۫ۡۨ۟ۡۛۖۙۙ۟ۛ۫ۖ۟ۤۡۤۜۘ۟ۘۗۖۧۥۘ۬ۛۡۨۙۨۘۘۖۨۘۛۤۨۤۗۢۜۡۧۘ۫ۨۥۜۡۤ۠ۡۧ";
                    while (true) {
                        switch (str4.hashCode() ^ (-1953981579)) {
                            case -1941063646:
                                String str5 = "ۥ۬ۡ۬ۨۨ۟ۛۧۧۜۘ۫۠ۥ۬۠ۦ۟ۦ۟ۜ۟ۛ۫ۗۛ۫ۦۜ۟ۗۙۢۢۨۘۥۗۛۗۗۤۘۧۥۡۛۥۘۙۧۗۡۥۜۘ۠ۡۖ۬ۛۛۘۢۡۛۡۘۨۢۜۖۛۖۘ۬ۨۧۘ۬ۤۚۤ۠ۜ۟ۗ۠ۤۛۘۤ۬ۛ";
                                while (true) {
                                    switch (str5.hashCode() ^ (-33038295)) {
                                        case -1946352426:
                                            str4 = "ۜ۬ۡۘۧۖۦۚۥۘۘۛۨۘۘۧۡۨۘ۬ۧۜۘۥۤۥۙ۫۫ۛۖ۠ۘ۟ۦۘۛ۫ۜۘۙۡۖۘ۬ۥۚ۬ۧۧۢ۟ۡۙۖۤ۫ۥۡۘۤۦۜۦۖۧۘۤۖۘ۠ۨۖۢۨۦۗۙۖۘۜۚ۬ۤۚۖۙۙۘۘۦۘۜ۫ۖۗۡۙۖۧۨۤۧۘۨۘۛۦۛ۠ۚۘۘۛۥۧۘۗۙ۬ۗ۟ۥۘۢۦۡ۫ۨۘۖۗۥۥ۫ۗۥۜۛۚۛۖۨۖۜ۠ۢۥۦۧۘۘ";
                                            break;
                                        case -646569507:
                                            str4 = "ۧۥ۫۫۬ۤۧۢۗۢۦۦۘۢۨ۫۠۬ۚۜۗۨۘۙۜۦۘۖۗۗ۫ۗ۫ۤ۫۠ۙۥۥۖۚۤۤ۟ۖۦۜۘۘۙۘۤۖۙ۟ۜۘۧۘۙۦۦۘۡۦۘۘۙۜۨۘۥۙۦ۟۠ۡۘ۬۟ۦۘ۬ۖۧۥ۟ۡۡۛۦۗۤۤۥۥۤۚۙ۟ۛۜۖۘۙۨۙۤۜۜۛ۫ۜۙۧۤ۬ۦۜ۠ۚۥۚۨۘۧۗۨۢ۬ۖۙۧۥ۫ۦ۫ۖۛۨۡۨۖۘ۟ۧ۬";
                                            break;
                                        case -70565243:
                                            String str6 = "ۛۤۛ۠ۛۜۘۘۡۘۘ۫ۨۨۘۧ۠ۥۚۚۦۘۙۙۘ۟ۥۜۖۥۗۜۢ۟۫۠ۡۘۧۙۖۘۡۤۖۚۦۦۘۧۛۘۡ۟ۜۢۦۛۛ۬ۡۘ۠ۖۧۧ۠ۥۘۗۚۥۥ۠ۢ۬ۤۤۖ۟ۥۚۗۛ۫ۛ۟ۖۤ۫ۡۨۧۢۙۗ۠ۛۘ۟ۢۘ۟ۘۡۘۥۜۧۢۧ۬ۚۤ۫ۘۡ۟ۛۚۦۘ۬ۜۦۘۢۤۥۘ۠ۖ۫";
                                            while (true) {
                                                switch (str6.hashCode() ^ (-2043800947)) {
                                                    case -1409006834:
                                                        str6 = "ۦۜ۫ۙۢۨۘۚ۟۬ۘۥ۬ۢۧ۠ۚ۫ۘۦ۬ۘۢۜۨۧۦۦۘۥۢۘ۫ۨۨۘۢۥ۬۬ۧۖۘۤۧۛ۬ۧ۠۬ۙۤ۬ۜۗۚۖ۠ۙۗۙۙۜۘۗۙۚۢ۫ۥ۠ۤۛۡۖۨۛۘۖۛۨۦۘۚۜۘۘۦۚۨۙۗ";
                                                    case -1236903053:
                                                        str5 = "ۦۗۜۧ۬ۚ۫ۤ۬ۛۘۨۥۜۨۘۥۢۤۨۛۢۜ۟ۦۘ۠ۧ۫ۙ۫۫۟۬ۛۥۙۜۘۙۘۧۛۧۢ۠ۚ۫ۢۨۖۥۧۘۖ۟ۧۤ۠۠۠ۡۨ۠ۥۘۦۨ۫ۛۗۖۦ۬ۥۦۥۨ۠ۡۗۘ۠ۤۦۚ۟ۜۦۘۘۜ۫ۖۘ۫ۖۤۤۧۢۤ۫ۜۘ۟ۧۛۜۡۖ";
                                                        break;
                                                    case 390532304:
                                                        String str7 = "ۨۢ۟ۨۥۤۨۨۤ۬ۚ۠ۢۖۥۘۛۚۦۛۨۘۚ۫ۡۦۨۚۖ۫ۚۤ۬ۢۡۡۡۘ۟ۘۖۤۦۜۡ۬۠ۖۙۛۙۨۘۦۘۘۘۢ۠ۨ۟ۧۜۘۗ۫ۨۗۥۗۥۗۗۛۥ۫ۧۘ";
                                                        while (true) {
                                                            switch (str7.hashCode() ^ 1800890172) {
                                                                case -1883876444:
                                                                    str6 = "۬ۤۛۦۜۡۖۥۘۢۜۘ۬ۜۡۗ۫۟ۤۨۗۦۛۡۧۨۘۦۥۧۡۖ۫۠ۤۗۡۨۘۙۗۥۘ۬ۖۡۘ۠ۡۢۢۥۡۘۜۙۘۘ۫ۥۘۥ۫ۨۘۚۥ۫ۦۦۧۜ۫۫ۗۜۚۥۜۤۥۛۥۘۨۘۥۘۦۜۜۘۘ۠۬ۡۦۢۛۢ۬ۨۘۖۥۥۢۚۧۡۗۨۜۘ۟ۚۚۗۧۜۤۥۧۘۗۚۜۘ۠ۛ۠ۙۜۘۘۚۥۖۖ۫ۚۧ۫ۥۘۤۧۙ";
                                                                    break;
                                                                case -1196424676:
                                                                    str6 = "ۥۥۤۘۘۧ۟۬ۡۘۙۧۤۜۛۖۘۙۖۜ۠ۙۘۘۗۢ۫۬ۢۦۥۦ۬ۤۙ۫ۜ۫ۧۢۥۦ۬ۨۗۗۧۜۖۙۙۨ۫ۥ۟۟ۡۘۨۦۘۢۖۧۘۢۙۥۧۡۥۡۦۘۘۧ۫ۖۘۗۙۖۘ۬ۢۜۘ۬۠ۢۛۡۥۘ۬ۚۜۦ۬ۜۘۡۘۗۙۦۦۙۘۜۡۚ۟ۡۧۥۚۖۖۘۚۖۘ۫ۢۡۡۧ۫ۨ۠ۛۧۖۥۘۚۘۧۖۨۖۘۛۨۨ۬ۚۦۘ";
                                                                    break;
                                                                case 1358395702:
                                                                    str7 = "ۚۜۖۘۧۘۧۦ۬ۖۘۗۛۨۘ۫۫ۨۘ۬ۗۛۛۚۧۢۗۚ۬ۘۘۙۗۦۖۥ۟۟ۙ۬ۨۤۡۘ۬ۤۧۨۚۨۘ۬۫ۙ۬ۨۘۚۗۤۢۗۘۤۚۤ۠۠۟ۢ۫ۨۗۛۦۘۙۥۧۘۗ۟۟ۙۧۨ۠۫ۚۢۛۚۚۛ۠ۖۦۦۘۦۡۨۘۜۡ۫ۛ۫ۦۘۙۨۤ۟ۦۡۚ۟ۚ۠ۙ۬۬ۦۜۤۢۚ";
                                                                case 1685755384:
                                                                    str7 = !file.exists() ? "ۗ۫ۙۘ۠ۛۙۚۨۘۧۙۥۘ۬۠ۖۘۡۨۥۘۙۙۚۛۜۧۘۨۨۧۛۡ۠ۦۥۤۧ۠ۙۨۧۥۙۘۤۡۥۚۖۙۖۛ۬ۨۧۢۖۘ۬ۗۖۘ۫ۘۥۘۥۖۤۚ۟۬ۖۢۘۘۗ۫ۗۢۦۦۡۜۡ۟ۥۛۧۖۨۦۖۨۘ۫ۡۘۦۗۥۛۨۦۢۘۚۗۖۧۘۜۚۙۛۗۚ۟ۡ۫ۘۤۜۘۢۜۛ۫ۘ۠ۖۥۘۚ۬ۖۛۜۨۢ۟۬" : "ۙۙۥۜۙ۬ۦۦۨۦ۫ۗۚ۟ۦ۟۫ۖۘۜۧۗ۠ۤۜ۟۟ۜۥۛۖ۟ۨۥۘۗۥۖۥ۠ۜۘۨۛۘۘۨۤۗ۟ۘۖۘۤۤ۬ۢۙۗ۠ۡۗۦۤۥۤ۟ۜۘۨ۬۬ۗۡ۟ۢۡۘۘ۠ۧۡۖۦ۟ۦۗۨۚۥۘۜۦۧۤۙ۬";
                                                            }
                                                        }
                                                        break;
                                                    case 1311301041:
                                                        str5 = "۟۟ۜۘۚۛۚۢۤۜۘۖۢۡۗۧۡ۬ۗۜۡۥۨۘۙۨۙۜۢۤۨۗۛۘ۟ۦۘۜۨۨۥۦۘۘۦۧ۫ۙۤۘۥۨۖۜۙۤۧ۠ۛ۬ۢۘ۫ۘۡۘ۫ۥۘۘ۠ۥۗۙۖۡۤۘۨۘ۫ۜۧۘۜۗۡۘۛۜۗۨۚۨۚۖۙۜ۬ۘۘ۟ۗۤۘۘ۟ۧۛۖۘۗۦۥۧۥۜۘۡ۟۠ۘۨۖۘۜۥۗۙ۠ۥۘۨۤۥۘۤۢۡۘ۫۠ۛۖۙۘۨۜ۫ۦۦۛ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case 129553687:
                                            str5 = "ۜۜۡۖۦۦۘۖۥۥۘۨۤۦۘۘۗۖۘۚۥۨۘۚۢ۬ۜ۬ۧ۫۠ۥ۟ۧۤۨۧۖۚۨۢۖۢۡۘۖۤۨۘۢۤۜۗۛ۠۫ۢۥ۟ۗ۠ۥۨ۫۟ۡۚۧۢۧۛۜ۠ۙۥ۬۬ۦۦۘۨۦ";
                                    }
                                }
                                break;
                            case -1215599375:
                                str4 = "ۦۧۛۙۙۤ۠ۘ۟ۥۢۗۧۛ۟ۤۥۘ۟ۗ۠ۚۜۨۚۖۥ۠ۤ۬ۙۦۘۦ۬ۥۤ۟ۦۨۜۡۖۙ۟۟ۧۥۛ۫ۨۧۜۖۜۗۖۘۖ۠ۦۘۘۤۨۙۖۧۘۘۤۥ۫ۨۜۙۨ۫ۡۗۚۜۡۘۥ۠ۘۘۜۨۨۥۥ۠۫ۥۘۦۨۧۘۘۘۜۘۥۛۚۤۖۛۥۨۗۤۘۡۘۧۙ۟ۚ۟ۚۗۡۧۘۖ۬ۛۨۦۧۡۦ۟ۖ۫ۖۛۖۖ";
                            case -905198542:
                                str3 = "ۢۧ۫ۜۢۢۦ۬ۡۚۢۨۘۖۧۥۘۗ۟ۡۡۤۘۘۗۗۘۘۘۡۨۘ۠۟ۢۖۡۨۘۗۥۜۘۤۦۥۘۨۘۢۨۙۡۚ۬۬۫ۨ۠۬۫۟ۥۥۧۘۗۛۙۦۡۙۚۙۘۘۘۙۦۚۗۧۢۚۜ";
                                continue;
                            case 1728021356:
                                str3 = "ۚ۬ۢ۫۠ۙۘۚۜۘۗۛۗۥۗۚۨۖۨۗ۬ۖۘۦۤۚ۫۫ۨۘ۬ۧۜۘۦۘۢ۬۟ۤۢۘۙ۫۬ۨۧۨۧۛۗۧۦ۠ۜۘۨۨۡۘۗ۫۠ۖۚۙۜ۬ۜۨۙۡۘ۬ۗۡۢۚۡۚۘۘۘۜۡۦۘۚ۟ۘۢ۟ۘۖۛ۫ۖ۫ۡۘۦۥ۬ۗۖۨۘۙۗۦۡۚۚۧۘ۫";
                                continue;
                        }
                    }
                    break;
                case 1056553641:
                    break;
                case 1552715955:
                    str3 = "ۘۨ۫ۛۛۜۘۖۢۡۖۢ۬۫ۙۦۘۙ۬۬ۖۧۦۘۦۖۤ۬۫ۨۘۤۛ۬ۧۨۗۗۢۜۘۙۥۖ۫ۡۜۘۤ۠۬ۚۡۧۢۗۘۧۡ۫ۢۨۘۛۡۧۦۛۘۘۜ۬۬ۛۚۘۘ۟ۤۡۘ۟۬ۜۘۤۗۛۤۧۥ۫۟۠ۢۜۙۙۡۘۤۙ۠۫ۨۧۘ۠ۛۦ۟ۛ۠ۗۜۘ";
                    break;
            }
        }
        try {
            InputStream open = getAssets().open(str2);
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, str2));
            byte[] bArr = new byte[1024];
            while (true) {
                int read = open.read(bArr);
                String str8 = "ۛۗۚۨۗۖۘ۠ۗ۟۫۟ۨۘۤۡۜۢ۠۫ۦ۬ۘۧۘۛۤۢ۫ۗۦۚۧۙۚ۬ۡۗۘۛۧۘۘۤ۟۬۬۟ۜ۫۫ۘۘۦۜۧۧ۟ۡۚۡ۟ۙۛۤۜۦۘ۬۫ۚ۬ۦۚۧ۬ۢۛۤۡۘۙۖۨۨ۠ۖۨ۠ۙ۟ۥۜۦۜۚۘۦۨ۠ۡۘۛ۠۬۠۬ۛۛۥۤۡۘۨۘ۟ۙۜۤ۬ۦۘۛۤۘۘۖۛۤۖۜۡۘۤۗۙ۠۫ۘۘۢۜۛ";
                while (true) {
                    switch (str8.hashCode() ^ (-450616033)) {
                        case -95893344:
                            str8 = "ۤ۫ۡۘ۠۬۟ۚ۠ۨۙۘ۬ۜۦ۠ۛۡۜ۠ۚۘۡۖۜۘۢۘۧۘۡۛۗۢۛ۠۟ۨۘۗۨۡۘۤۨۜۤۥۜۗۨۘۧۡۦۖۖۦۘۧ۠ۜۘۛ۬ۨۘۘۦۘ۠ۤۨۘۡۘۢۡۤۡۘۧۨۧۧۡۡۘۢۘۖۤۢ۫ۛۛۨۨۡۡۘۧۖۤۡۗۧۥۢۡۘ۠ۚۧ۫ۦۨ";
                        case 1056354669:
                            break;
                        case 1206539851:
                            String str9 = "ۚۨۦۘۨۡۗۥ۟۫ۚۦۥۤۨۜۘۢۤۡۘ۠ۦۘۨ۫ۖۘ۬ۡۖۚۧۘۘۘۧۤۙۦۘۡ۟ۜۨ۠ۚۧۤۜۨۢۧۡۘۨۦۢۥۙۜۨۘ۫ۧۨۜ۟ۦۘۡ۬ۖۦۚۘۘ۠ۜ۠۫ۙۡۚ۫۟۫ۜۥۘ۬ۜۗ۫ۤۜۧۙۜۘ";
                            while (true) {
                                switch (str9.hashCode() ^ 1932972854) {
                                    case -839557222:
                                        str9 = "ۡ۠ۨۘۗۜۤۡۘۜۗۥۢۙ۟ۢۡۙۜۘۤۜۨۘۦۗۦۘ۠ۗۢ۠ۧ۠ۙۤ۫ۙۛۧۨۨۧۗۙ۟۟ۖ۟ۦۡۧۛۨ۫ۧۢۢۗ۫۟ۛۨۙۡۦۡۜۨۗ۫ۥۤ۟ۤۥ۟ۘۘۨۢۡۘۢۖۘ۫۫ۡۜ۠ۖۘۥۨۦۘۛ۠۟ۘۡۥۘۥۗۨۜۧۥ۬ۢۤۤۗۡۘۛۤۖۘۗۥۦۘۨۤۛۗۘۜۘۨ۠۠ۦ۬ۘ۠ۜۖ۫ۨۨ۟ۙ";
                                    case -407448176:
                                        String str10 = "ۦۤۘۡۘۥۘ۫ۙۥ۟ۥۦ۫ۥۨۖۖۨۦۤ۫۬ۢۙۥۘۧۧۘۥۜۗۘۘ۟ۨۛۨۘۖۗۥۘۨۦۦۡ۫ۘۘۙ۫ۛ۟ۜۦۘۗۛۖۜۡۘ۟ۦۡۦۛۖۤ۟ۥۘۧۦۘۛۛۥۘ";
                                        while (true) {
                                            switch (str10.hashCode() ^ (-424955607)) {
                                                case -252740900:
                                                    str9 = "ۙۗۡۥ۬۟ۖۦۖ۬ۚۥۙ۠ۜۘۖۥۡۤۢۢۘ۠ۖ۟۟ۡۢۤۡۘۧۙ۫۫ۨۤۘۨۗۘۙۡۨۤ۠ۜۘۨ۬۠ۥۤۖۧۖۡۢۙۜۢۘۢۧۨۗۧ۬ۛ۫۠ۖۘۤۢ";
                                                    break;
                                                case 533101570:
                                                    str9 = "ۖ۟ۖۡۘ۬ۨۨۢۖۨ۫۠ۡۦۘۛۜۜۥۚ۟ۥ۬ۖۘ۟ۢۘۖ۬ۨۘۖۢۢۨۦۧۡۜۘۨ۫ۡۘۛ۫ۨۖۤۘۘ۫ۘۗ۟ۤ۬۫ۤ۫ۙۛۙ۠ۢۘۘۦۨ۠ۙۥۤۚۗۘ۠ۜ۫۠ۗۜ۟۬ۖۘۢۦۜۘۨۖ۟ۖۨۘۗۗۘۜۜۙۤۥۦۘۥۦۥ";
                                                    break;
                                                case 1360214139:
                                                    String str11 = "ۘۗ۬ۘۤۗۘۗ۠ۤۛۖ۠ۢۘۘۜۤۗ۫۫۟ۖۡۘۤۙۖۡۦۗۙۜۡۗۖۛۗۛۛۢۨۥۘۤۦۤ۬۫ۨۥۧۡۥ۟ۦۜۧۤۙۜۨۘۨۗۡۚۘۦۘۛۘۢۥۥۘ۟ۦۘۧۗۡۘ۠۟ۘۘۤۤ۬۟ۛۦۗۜۡ";
                                                    while (true) {
                                                        switch (str11.hashCode() ^ (-1367068680)) {
                                                            case -1336205555:
                                                                str10 = "ۢۦ۟ۖۥۛۚۚ۟ۙۚۥۘ۬ۖۛ۠۫ۨ۬ۨۘ۬ۘۦۨۙۥۦۜۨۢۢ۠ۥۚۛۘ۬ۜۘۙ۟ۢۧۘۡۘۡ۠ۦۡۨۥۙۙۡۥۦۢۗ۬ۦۤ۟ۘ۟ۧۡۘۧۛۡۛۘۙۡۤۤۡ۫ۚ۟ۖ۬ۘ۟ۡۚ۠ۜۜ۠ۡۘۗۙۨۘۧۨۜۜۖۛۨ۬ۨۙۥۜۘۨۤۦۘ۫ۛۨۛۜۖۘۤۡۖۘۦ۫ۜۘ۠ۥۥۘۛ۬۫ۥ۠ۧۧۜۡۘ۟۫ۦ";
                                                                break;
                                                            case -464914338:
                                                                String str12 = "ۧۤۡۘۜۦۘۘ۟ۚ۟ۥۤ۠ۘۙۘۘۤۥۜۖۨ۬۬ۛۘۘ۫ۤۡۜۨۚۛۖۦۘۦۛ۠ۤۥۢۢۚ۬۬ۢ۠ۥۤۜۢۚۨۘۖۦۚۛۢۨۛۚۘۨۘۙۥۡۛۚۙ۠ۤۧۧ۠ۤۦۘۖۗۖۙۜۙ۠ۢ۠ۙۡ۟ۥۧۘ";
                                                                while (true) {
                                                                    switch (str12.hashCode() ^ 1258921384) {
                                                                        case 743142904:
                                                                            str11 = "ۚۤۘۢۜۦۘۛۜۘۘ۠ۥۗ۠ۦۥۤۚۦۢۡ۟ۙ۟ۦۘۙۥ۟ۧۦۘۘۤۙۜۜ۠ۘۘۛۢۜۥۘۘۗۜۖۘۥۤۘ۟ۚۖۘ۬۫ۖۘۗۙۖۘ۫ۢۚ۬ۦۨۨۛۢۚۡۧۘۡۢۖۦۨ۬ۖ۠ۦۦۙۡۘ۫۫۬ۛۙۚۥۤ";
                                                                            break;
                                                                        case 987173954:
                                                                            str11 = "ۤ۫ۜ۟ۘۧۙۜ۬۟ۗۡۘۛۨۗۚۨۤۤۜۧ۟ۛۡۘۡۙ۠ۙۗۘۜ۟ۖۦۧ۟ۦۚۤۤۤۧۦۤۗۘۢۖ۟۫ۘۖۢۥۘ۟۬ۦۘۢۧۜۘۥۥۧ۬ۡۥۘۡۧۧۛۡۦۛ";
                                                                            break;
                                                                        case 1444127855:
                                                                            str12 = -1 != read ? "ۖ۫ۢۤۙۘ۬۫ۗ۟ۧۨۤۦۘۤۙۡ۟ۘۖۜ۟ۨۨ۫ۦۘۖۜۧۘ۟ۧۚ۟ۘ۫۬ۧۧۙۧ۟ۨۜ۠۬ۚۥۘۙۛۗۦۢۥۥۖۡۗۗۛۛۜۙۘۤۙۨ۫ۜۛ۠۠ۧۡ۠ۘۛۜۘۡ۠ۘۘۨۨ۟ۨۡۘۦۧۘ۟۬ۚۖۛۧۖۘۜۖ۟" : "ۚۜۦۚ۠ۗۥ۟ۤۛۥۦۘۨۗ۟ۙۘۘۚۖۥۘۘۦۧ۟۠ۘ۬ۥۛ۟ۨۢۙۧۜۦۧۧۜۤۨ۫ۥ۫ۛ۠۠ۨۛۡۥۛۘۘ۠ۨ۠۫ۛۧۙۖ۠ۘۤۥۘۡۘۘۘ۫ۗۡ۠ۡۢۢۢۡۘۨۗ۟۟ۘۜۘۗۙۦۘۡ۫ۗۙۧۘۧۦ۠ۗۧۢۙۖۗۦۜۤۨۡ۟ۜۥۦۡۡۖۘۦۥۦۘۢۨۖ";
                                                                        case 1613822573:
                                                                            str12 = "ۨۤ۬ۡۛۦۖ۫ۘۗ۟ۜۡۧۨۖۨۥۘۜۡۧۘۛۦۡۘ۬ۢۗۥۛ۟ۚۧۚۗۡۦ۬ۤ۠ۖۧ۬۠ۧۥۘۨۚۨۦۜۧۘۥۜ۬ۖۖ۠ۖ۟ۜۧۙۜۘ۠ۛۘۘۚۨ۬ۘۧۦۘۢۥۖۘۢۧۜ۫ۛۨۘۢۥۘۧۜۖۥۙۧ";
                                                                    }
                                                                }
                                                                break;
                                                            case 1113567650:
                                                                str11 = "ۥۗۦۛۚۘۚۨۖ۟ۙۤۨۤۜۙۨۡۘۙۢ۟ۜۚۖۘ۫ۗۢۚۚۜۘۜۗۘ۟ۚۖۘۛۡۧۗۧ۫ۘۚۢۧۗۚ۬ۦ۬۟ۥۨۨۡۙۨ۬ۙۧۜۖۖۛۗ۬ۦۥۘ۠ۧۢۘۛۥۨۢ۬ۜۨۛۜۢۨۨۘۛۘۨۘ";
                                                            case 1528145895:
                                                                str10 = "۠ۖۧۘۙ۫ۘۧۗۥ۠۠۫ۜۥۗۨ۠ۘۘ۟۬ۥ۟۬ۛ۟ۙۛ۟ۛۖۢۡۢۘۘۡۤۨۘ۠ۚۖۖۛۨۥۙۥۘ۟ۤۤۘۘۧ۠ۥ۫ۢۢۚ۟۟۫ۢۧۖۗۦۖۛۖ۠ۛۙۛۧۛۜۘۤۥۦۘۘۛ۫ۧ۬۬۠ۙۨۘ۠ۙۚۖۘۦ۫ۢۛۨ۬۟ۛ۟ۜۗ۫ۙۖۧۦۚۦۘۙۡۙۙ۟";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 1828566122:
                                                    str10 = "۫ۢۤۗۤۥۜۘۚۛ۫ۡۘ۠ۗۥۚ۠ۛۖۙۦ۬ۤۢۙۗۡۦ۬ۘۘۤۤۥۘۚۥۦ۠ۛۛۚۦۙ۬ۘۦۛۙۘۘۜ۬ۜۧۜۦۚ۠ۥۨۗ۫ۜۢۗۨۙۦۘۗۡۖۧۤ۠ۛ۫ۦۚۨ۫ۨ۫ۦۘۗۥۙۚ۠ۤۛ۠ۛ۠ۢۘۡ۫ۘۘۨ۟ۧۤۜۖۗ";
                                            }
                                        }
                                        break;
                                    case 1234493783:
                                        str8 = "ۖۧۧۨۗ۠ۙۘۚۨۡۨۖۘۜۘۗۡۨۗۖ۬ۚۦۘۡۥۛۤۢ۟ۖۦۥۘۧۘۨ۟ۛۙۜۦ۠ۖۜۘۤۚۧۦۙۗ۬۟ۙۗۡۗۘۘۙۖۜۨۘ۫ۤۨۘۘ۫ۤۖۧۚ۫ۧۧۗۜ۠ۦۛۖۡۚۧۜ۫ۛ۬۬ۢۛۜۚ۫ۦ۫ۘۗۡۘۦ۬ۜۨۧۘۨۢۨۘۢۡ۬ۨۨۥۗ۠ۜۘۡۙۙ";
                                        break;
                                    case 1990841006:
                                        str8 = "ۥۨۦ۟ۨۧۤۤ۫۫ۖۦۘۜۚۨۘۘۖۦۘۗۘۜۜۛۧۜۜۦ۬ۜ۠۟ۦۥۢۙۡۘۚۗۚۚۖۜۚۛۡۨۧۚۜ۬۠۟ۨۜۤۥۘۗۙۖۙۥۙۢ۫۠ۢۨۢۘۥۘۦۚ۠ۗۤۢۗ۟ۖۤۖۘ۫ۛۗۛۢۖۢۚۥۘ۬ۗ۟ۦۤۗۢ۟ۥۜ۫ۡۘۜ۫ۨۗۢۡ۬۠ۜۘۧۦۧۘۧۢۖۘۛۢۜۙۜۗۨۜۜۘۥۢۗۨۗ۫";
                                        break;
                                }
                            }
                            break;
                        case 1513346911:
                            open.close();
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            return true;
                    }
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e) {
            return false;
        }
    }

    static /* synthetic */ int access$100(MainActivity mainActivity, Context context, int i) {
        String str = "ۜۨۜۘۚۚۜۘۥۤۢۙ۫ۡۘ۬ۛۚۧۧۥ۬ۜ۟۠ۗۥۘۡۢ۬ۡۨۜۘۨۨۘۜۧۨ۫ۢۙۧۙۘۘۛۘۡۧۘۤ۠ۚۢۧۡۦۖۘ۫ۖۖۘۜۡ۟ۨۙۘۘۗۙۚۜۥ۬ۡ۠ۡۘ۬ۥۖۘۤۜۦۛۡۛۚ۫ۘۘ۠ۤۘۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 223) ^ 357) ^ 452) ^ 282) ^ 123) ^ 114) ^ 759) ^ 916) ^ 934) ^ 57) ^ 728) ^ 473) ^ 889) ^ 665) ^ 660) ^ 891) ^ 626) ^ 448) ^ 745) ^ 303) ^ 491) ^ 648) ^ 689) ^ 331) ^ 65) ^ 831) ^ 715) ^ 337) ^ 433) ^ 252) ^ 942) ^ (-604277753)) {
                case -1643035744:
                    str = "ۙۙۥۘۙۤ۫ۦۢ۟۫ۥۨ۟ۖۥۘۚۚ۬ۥۦ۠۫ۙۨ۬۟ۘۘۛۤۙۡ۫ۨۘۧۖۢۖۡ۟ۜۗۡۢۛۗۧۡۤ۫ۤۛۘۜۙۥۘۘۧ۟ۤۖۛ۫ۧۜۧۘۜۡۜۘ۠ۜۥۖ۟ۛۤۙۧۙۥۖۘۧۖۢۨۚۧ";
                    break;
                case -728803896:
                    return mainActivity.m79dp(context, i);
                case 1132482587:
                    str = "ۘۜۡۥۜۘۚ۟۫ۜۛۖۘۛۖۜۘۜ۠ۗ۫ۦۢ۫ۗۖۘۘۧ۫ۙۥ۟ۤۨۧۘۨۛۗۥ۟ۜۖۧۘۜۥۖ۟ۚۖ۫۠ۖۘۜۦ۫ۖ۟ۡۤۥۘۡۜۧۘۢۡۢ۟ۜۧۥۘۤۧۨۖۘۚ۟ۦۖۙۘۖ۠۠ۧۗۧۚۤۡۜۚۧ۬ۧۨۘۘۨ۠ۢۖۘۗۢۨۢۡ۟۬ۙ۬۬۬ۦۘۗۦۡۘۨۗۨ";
                    break;
                case 2021897815:
                    str = "ۨۜ۬ۜۘۡۘۘۗۗۥ۫ۛ۫۠ۘۢۛ۠ۦۖۖۜۘۖ۟ۥۗۦۥۡ۫ۦۘۡۢۜۖۙۜۖۖۜۛۥۡۜۧۗۨۘۦۧ۬ۧۢۨۘۛ۫۫ۧۛۛۗۧ۬ۤ۬ۗۜ۫ۜۢۖۨۘۥ۬ۡۘۚۨۖۗۖۖۘ۟۫ۜۘۘۦۚۛۥ۫۠ۙ۠۠۠ۥۥۘۨۚ۬ۘۘۖۥۧۘۜ۟ۤۛۙۛۚ۬ۗۖۗۙۛۗۚۨۤۜ۟ۥ۫ۛۖۢۤۤۥۘ";
                    break;
            }
        }
    }

    static /* synthetic */ String access$200(MainActivity mainActivity, String str) {
        String str2 = "۟۟ۚۨ۫۠۬ۜ۠ۖۡۛۛۘۘ۟ۘۛۧۗۢ۟ۛ۬ۘۢۨۘۜ۟ۘۘۖ۠ۥۘۡ۠ۚ۬ۨۡۘۗۙۜۘۖ۫ۡۘۦۡۘۘۙۤۜۖ۠ۥۘۚۦۥۘۛ۫ۤ۠ۢۥۘۦۖ۫ۡۦۥۘۛۗ۠ۚۧۦۡۘۘۙۤۡۗۛۥۧۗۡ۬ۦۘۘ۫۫ۥۘ۫ۧۦ۫ۡۚۢۙۖۗۘ۬ۥۡ۟ۙۛۗۦۥۨۘ۠ۨۢۗۖۖ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str2.hashCode() ^ 924) ^ 276) ^ 473) ^ 417) ^ 608) ^ 556) ^ 171) ^ 29) ^ 437) ^ 801) ^ 387) ^ 75) ^ 89) ^ 71) ^ 367) ^ 959) ^ 147) ^ 113) ^ 910) ^ 241) ^ 693) ^ 309) ^ 783) ^ 91) ^ 832) ^ 549) ^ 900) ^ 808) ^ 730) ^ 733) ^ 414) ^ 760502199) {
                case -262346044:
                    return mainActivity.getObbUrl(str);
                case -180291101:
                    str2 = "۟ۢۨۘۦۥۢۥۨۧۘۥ۠ۡ۫ۚۡ۟۟ۜۧۦۦۘۥۥۤۧۤۗۜۢۨ۫ۗ۫ۧۢ۫۟ۘۛۖۢۙۦ۬ۤ۫ۜۗۗۜ۬ۨۙۥۘۦۦۡۡۦۘۧۧۜ۬ۗۜۦ۬۟ۛۜۥۘۤۙۧۧۤۨۘۘۥۘۥۗۧ۟ۢۦۥۥ۬۠ۨ۠ۢۗ۟ۧ۟ۖۢۡۢۙۥۙ";
                    break;
                case 1095685191:
                    str2 = "ۜۨۜۘۜۡۦۨ۠ۡۘ۬ۚ۟۟۠ۘۘۘۧۡۧۦۥۜۜۡ۫ۜۚ۠ۡۧۘ۠ۗ۫۠۟ۘۘۙ۠ۦۜۗۘۘۨۧۘۚۡ۠۫ۜۥۘۥۖ۟ۗۘۜۡۙۦۜ۬ۡۘۥۘۜۘۜۚۡۖۡۡۘۜ۠۟۠ۦۘ۟ۛۨۘ۫۟ۡۘ۬ۛۥۘۖ۠ۛۧۢۗۨۤۛۖۤۙۛ۠ۥۜۗۤۖۖۘۢۗۡۘۡۘۚۜۨۙ۬ۥۛ";
                    break;
            }
        }
    }

    static /* synthetic */ void access$300(MainActivity mainActivity, String str) {
        String str2 = "ۧۤۥۘۖۘۚۚۜۢ۠ۙۡۘ۠ۥۚۗ۬ۨۤۢۜۘۢۥۘۨۢۖۧۥۤۦۢۗۗۜۘۛۚۗۜ۠ۗۙۖۢۙۡ۬ۡۙ۫۫ۨۘ۫ۚۚۨۧۗ۫ۗ۬۬ۡۦۛۨۧۘۢۚۤۙۥۧۦ۫ۘۜۜۜ۟ۢۗۚۥۘ۬۠ۗۜۖۥۘ۬ۥۨۘ۠۬ۥۘۜۛۜۜۖۧۘۜ۟ۨۘۘۧۢۥۛۚ۬ۨۨۙۨۘۙۛۘۜۨۦۥۥ۟ۢۘۨۘۚۚۡۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str2.hashCode() ^ 720) ^ 947) ^ 739) ^ 627) ^ 663) ^ 523) ^ 337) ^ 501) ^ 951) ^ 784) ^ 490) ^ 556) ^ 474) ^ 656) ^ 148) ^ 443) ^ 120) ^ 604) ^ 673) ^ 496) ^ 527) ^ 954) ^ 407) ^ 370) ^ 126) ^ PointerIconCompat.TYPE_HELP) ^ 520) ^ 992) ^ 566) ^ 544) ^ 943) ^ (-1839510147)) {
                case -1595302665:
                    str2 = "۫۬ۚۗ۬ۖۘ۫ۛ۫ۜ۠ۧۨ۫۟ۨۗۡۘۖۦۗۡۖۡۘۖۗ۟ۦۗۥۘ۟ۚ۠۬ۥ۟۠۠ۧۦ۬ۡۘۦۢۜۘۗۙ۫ۚۜۢۥۨ۟ۢۤۗۚۛۦۦۙۨ۬۟ۚۙۜ۟ۚ۠ۡۘۛۚۛ";
                    break;
                case -934706742:
                    return;
                case -115682757:
                    mainActivity.showDownloadCompleteDialog(str);
                    str2 = "۬ۡۦۘۚۢ۫ۦۛ۠۫ۙۘ۠ۚۤۜۘ۟ۚۘ۟۟۬ۗۚۧۨۙۗۤۖۥۘۜۥۜۘ۬۠۠ۨۨ۟ۥۥۦۘۚۦۖۘۥۥۦ۟ۘۜۘۧۦۨۙۙۥۘۧۖۜۘ۠ۘ۬ۛ۬ۛۦ۬ۦ۬۟ۘۘۖۢۛۦ۟ۙۡۘ۬۠ۘ۟ۖۗ۫ۥۢ۟۟ۜۜۘۤۙ۟۫ۥۥۘ۠ۛۘۘۛۢۢۨ۟ۨۘۨ۬ۡۘ۟ۢۖۘۖۢۛۗ۠۬ۖۖۡۢۨۘۤۤۥۘۧۢۨ";
                    break;
                case 909540754:
                    str2 = "ۖۘۘ۫ۨۤۧۖ۫ۜۙۦۚ۬ۖۦۛۛ۫ۚۚۘۘۛۢۧۛۛۨۖۡ۠ۦۜۜۘۦۥۖ۟ۧۤۘۜۧۡۦۨۗۥۘ۟ۦۖۙۘۥۘ۠۟ۡۘۖۗۜۖۧۚ۬ۥۘ۟ۦ۫۫ۢۦ۫ۧۚ۟ۗ۫ۦۘۘۘ۠ۢۜۛۚۦ۠ۡۙۜۚۤۧۨۛۘۦۜۜۚۤۥۢۛ۠ۙۜۖۥۛۚ۬۠ۢۥۘ۫ۥۘۨۚۘۘۙ۟ۤۧۢ۟۟۠ۧ";
                    break;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 341
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private void checkPackageStatus(android.widget.TextView r13, com.google.android.material.button.MaterialButton r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 1100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kentos.loader.activity.MainActivity.checkPackageStatus(android.widget.TextView, com.google.android.material.button.MaterialButton, java.lang.String):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 347
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static boolean copyFile(java.io.File r11, java.io.File r12) {
        /*
            Method dump skipped, instructions count: 1118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kentos.loader.activity.MainActivity.copyFile(java.io.File, java.io.File):boolean");
    }

    /* renamed from: dp */
    private int m79dp(Context context, int i) {
        float f = 0.0f;
        String str = "ۤۖۖ۬ۨۡۘۚۧۨۛ۟ۛ۟۬۬ۜۘ۬ۦ۫ۜۘ۟ۧۡۙۖ۟ۖۛۛۨۨۡۘۨۛۘۘۡۜۘۨۨۖۢۘۙۢۡۥۘ۬۬ۤۧۛۜۘۘۨۗۧۢۖ۟ۙۡ۫۟ۜ۬ۨۡۗ۠ۡۘۨۚ۫ۨۤۦۤۡۘۥۜۘۦۘۚۧۜۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 178) ^ 380) ^ 910) ^ 100) ^ 916) ^ 648) ^ 292) ^ 154) ^ 97) ^ 355) ^ 49) ^ 546) ^ 323) ^ 762) ^ 190) ^ 944) ^ 959) ^ 977) ^ 49) ^ 47) ^ 687) ^ 529) ^ 988) ^ 646) ^ 44) ^ 801) ^ 725) ^ 517) ^ 881) ^ 144) ^ 156) ^ 1398641021) {
                case -2053844367:
                    str = "۠ۦۤۦ۬ۙۢۤۥۘۤۧ۫ۜۡۧۖۢۙۚ۟ۥۘۢۡۡۗ۫۠ۙۘ۫ۧۥۢ۬ۥۦۖۚۘ۫ۢۦۧۖۦۘۤۙۨۖۧۨۗۨۥۥۛۧۖۜ۫ۡۤۨ۫ۨۚۖۧۢۗۥۜۜ۬۫ۡۨ۬ۡۥۘۧۦۘۘۚ۟ۤۨۥۡۘ";
                    break;
                case -1104038296:
                    return (int) Math.ceil(i * f);
                case -122642636:
                    str = "ۡۛۡۖۗۜۜۜ۟۬ۜۘۘۨ۫ۦۘ۟ۥۘۘ۟ۙۤۚۘۜۖۜۙۤۛۤ۬ۧۨۥۧۥۘۤ۠ۧۜۚۦ۠ۙۧۗ۬ۚۧۘ۬ۖۨ۠۬ۥۘۧۘۦۧۙۜۘ۫ۖۢۨ۟۟ۜ۬ۖۘ۬ۥۢۗۘۦۜۢ۫ۨۧ۟ۗۙۡۘۚۜ۬ۗ۬۟ۚۤۘۨ۠ۥۘ۠ۚۜۘۛ۠ۚۦۧۧ۫ۤۧۥۥۡۚ۫ۘۢ۫ۡۘ";
                    break;
                case 1756868889:
                    str = "ۘۤۦۘ۠۟۬ۛۖ۟ۛۖۧۥۡۗ۠۟۬ۗ۫ۚۖۚۜۢۡ۟ۖۘۜ۫ۨۨۗۦۘۖ۟۠ۥۘۨۨ۬ۥۘ۬۠ۚۢۘۡ۟ۡۘۙۨۦۘۦۖ۠ۖ۬ۦۘۨۗ۠۫ۢۜۥۦۛۚۖۧۘۚۙ۠۬ۤ۫ۢ۬ۦۖ۫ۦۗۖۨۡۨۘ۫ۘۖۘۗۡ۫ۡ۠ۖۛۚ۫";
                    break;
                case 1787368090:
                    f = context.getResources().getDisplayMetrics().density;
                    str = "ۚۘۨ۫ۜ۬ۧۤۦۘۘۧ۬ۘۨ۬ۡۜ۟ۦۜۘۘ۫ۘۢ۫ۨۨ۬ۖۡۖۦ۠ۧۙۤۢۛۨۥۡۘۡۡۥۛۙۘۘۚۜۧۢۨۦۘۥۖۦۘۛۚۨۚۚ۬ۤۢ۟ۤۢۧ۟ۗۜۗۢۢۧۥۛۨۘۡ۟ۛۚۡۨۡۜۖۛ";
                    break;
            }
        }
    }

    public static MainActivity get() {
        while (true) {
            switch (((((((((((((((((((((((((((((((("۫ۡۜۘۧ۫ۚۢۜۧۥۨۘۚ۬ۙ۠ۤۘۛۘۡۦ۫ۖۜۗ۠ۗۨۘۥ۫ۗۙۨۘۜۛۤۖۦۨۖۥۚۥۡۘ۬۫ۨۘۗۨ۬۫۟ۖۘۥۜۖۖۡۘۦۡۘۗۚۤۥ۠۬ۦۙۤۜۙۨۢۚ۬ۘ۬۠ۥۘۘ۟۫ۢۡۛۛ۟ۜ۠ۧۥۦۘۥ۟ۡ۠۠ۜۘ۫۠ۥۧۤ۫۬۬۟۠ۘۥۘۘۧۖۘ".hashCode() ^ 994) ^ 400) ^ 417) ^ 461) ^ 128) ^ 538) ^ 821) ^ 579) ^ 701) ^ 242) ^ 870) ^ 811) ^ 164) ^ 644) ^ 415) ^ 879) ^ 970) ^ 912) ^ 893) ^ 910) ^ 893) ^ 554) ^ 375) ^ 825) ^ 980) ^ 8) ^ 760) ^ 74) ^ 339) ^ 227) ^ 400) ^ 669056070) {
                case 320804296:
                    return instance;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 407
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private java.lang.String getObbUrl(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 1294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kentos.loader.activity.MainActivity.getObbUrl(java.lang.String):java.lang.String");
    }

    private void hideSystemUI() {
        String str = "ۥۥ۠ۡۚۚ۠ۢۤۛۘۥۜۧۦۦۛ۫ۦۖۜۖ۫ۙۡۗۨۡۗۡۧ۠ۙۨۥۧۘۢۙۛۥۤۙۡۦ۠۫ۛۡ۟ۚۗۖۙۥۜ۫ۜۨۢۗ۬ۜ۫ۢ۟ۦ۬۬ۙۖۘۚۘۘۢۢۦ۫ۙۖۧۘۡۘ۬ۙۖۢۥۘ۬ۘۧ۬ۖ۟ۗۖۡۗۤۤ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 466) ^ 720) ^ 970) ^ 655) ^ 816) ^ 637) ^ 365) ^ 764) ^ 136) ^ 330) ^ 984) ^ 709) ^ 491) ^ 468) ^ 568) ^ 568) ^ 627) ^ 520) ^ 12) ^ 652) ^ 274) ^ 921) ^ InputDeviceCompat.SOURCE_KEYBOARD) ^ 707) ^ 565) ^ 884) ^ 319) ^ 836) ^ 612) ^ 535) ^ 275) ^ (-941417336)) {
                case -1597217068:
                    str = "۠ۖۨۨۖۧۜۥۘۢۥۧۘۢۙۘۛۧۦۘۚۚۥۘۗۢ۟ۨۦ۫۫ۡۧۜۜۛۙ۠ۥۤۛۨ۫ۜۘ۟ۧۛۙ۫ۖۘۚ۟ۢۥ۬ۚ۟۬ۡۘۤ۠ۥۘ۟ۡ۬ۤۛ۟ۙۤ۫ۧ۬ۚۗۖۡۖۙۛۙۖۜۛۚۥۘۛۘۡۙ۬ۤۗۛ۟۫ۖۢۨۘۤۡۛ۟۠ۦۘۘۤۧۗۙۖۘۗۦۧۘۢۦۨۘۤۦ۫";
                    break;
                case -1450771829:
                    return;
                case 741339776:
                    getWindow().getDecorView().setSystemUiVisibility(3332);
                    str = "ۛۦۚ۫۟ۗۧۛۗ۫ۛۚۥۘۡۦۥۡۘۨۗ۟۬۬ۜۜۢ۠ۜ۟ۡۘۜۢۘۘ۠ۗۡۘۙۨۘۘۘۦ۫۬ۗۢۢۧۗۙۥۜۦۨ۫ۢۢۖۙۙۜۘۢۚۢۛۚۜۘۨۛۥۙۜۘۛۗۘۘۜۧۘۘ۬ۡۥۘ۫۟ۜۘ۠ۥۘۘۖ۟ۢ";
                    break;
            }
        }
    }

    private boolean isServiceRunning() {
        String str = "۬۠۟ۧ۠ۥۘۤۜۘۥ۟ۚۡۙۜۥۡۨۘۨۘۚۢ۬۫ۨۚ۟ۥۥ۠۬ۘۛۡۚۙۧۧۦۘۛۙۦۖۨۦۨ۟ۖۘۢۥۗ۠ۦۢۥۘۧۨۜۢۖۘۗۘۢۢۚۨۘۤ۠ۖۗ۠ۘۘۖۨۚ۠ۖۨۘۘۡۥۘۦۙۛ۬ۨۨ";
        ActivityManager.RunningServiceInfo runningServiceInfo = null;
        Iterator<ActivityManager.RunningServiceInfo> it = null;
        ActivityManager activityManager = null;
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 425) ^ 409) ^ 390) ^ 632) ^ 174) ^ 225) ^ 586) ^ FrameMetricsAggregator.EVERY_DURATION) ^ 239) ^ 689) ^ 323) ^ 420) ^ 773) ^ 636) ^ 398) ^ 314) ^ 162) ^ 87) ^ 822) ^ 640) ^ 714) ^ 573) ^ 986) ^ 951) ^ 475) ^ 763) ^ FileUtils.FileMode.MODE_755) ^ 918) ^ 751) ^ 108) ^ 895) ^ (-1044121865)) {
                case -1572784329:
                    return false;
                case -926859100:
                    String str2 = "ۡ۫ۚۜۦ۬ۦۥ۠۟ۤۘ۠ۙۢۧۛۥۥۜۛ۫ۡۜۘ۠ۤۥۜۧۖۘۛۚ۬ۢۜۨ۫ۥۦۢۙۡۘۢۢۡ۟۟ۜۘ۬ۨۨۘۗۦۖۗۧۗ۠ۖۤۧ۬۫ۚۧ۠ۚۗۥۛ۬ۙ۟ۛۡۘ۟ۘۘۘۨۛۖۘۘۘۨۥۢ۬۫ۢۥۘۗ۠۠ۖۥ۫ۖۧۧۢۨۘۥ۟ۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 2072518408) {
                            case -731743764:
                                String str3 = "ۤۖۤۧۢۙ۠ۥ۟ۢ۫ۘۡۧ۫۬ۤ۫ۡۗۧۡ۬ۖۘۙۦۢۤۢ۠ۡۜۦۘ۠ۜۜۘۨ۬ۖۥۘۙۥ۠۫۫۟ۗۘۘۦۢۡۦۧ۟۠ۡ۟ۜۘ۫ۡ۠ۡۦ۫ۤۙۡ۬ۜۚۢۗۤۚ۫۬ۛۜۦۡ۠ۤۙۦۘۚۢۥۢۧ۟ۙۜۙ۬ۧۥۘۛ۫ۥ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1510281319) {
                                        case -1317329187:
                                            str2 = "۟ۤۚ۟ۦۧۙۚ۟ۡۜ۟ۘۥ۫ۜ۫ۛۚۙ۟ۖۘۥۥۜ۫ۤۜۛۧ۫ۘۘۨ۬ۖۖۙۤۙۡۥۨۨۥۘۧۛۦۘ۬ۗ۟ۛۧۡۛ۟ۡۘۜ۟ۘۘۗۡۧۨۛ۟ۖۗۦۘ۟۟ۖۨ۬ۤۖۘ۬۟۟ۖ۬ۨۜۚۡۡۘ۫ۢۨۘۤۘۥۨ۬ۛۥۜ۠ۛۥۥۘۤۜ۠ۜۖۥۚ۟ۦۗ۫۠ۤۥۧۖۤۗ۟ۛۘۘۘ۠ۜۜۤۤۛ۬ۘ۫";
                                            break;
                                        case 191128986:
                                            str2 = "۟ۘۢۛۙۙۖ۟۠ۡۤۤ۬ۗ۠ۙۥ۟۬ۡۘۚ۠ۜۘ۟ۡۚۦۜۚ۫ۦ۟ۥۖۢۦۘ۠ۤۜۜۘ۬ۛ۟ۜۖۖۘۛۚۢۗۙۘۦۚ۟ۥۛ۟ۜۥۚۧۖۛۡ۠ۚۖ۬۟ۖۘۧۥۘۘ۟ۥۧۡ۬۬ۡ۬ۛۜۙۤۡۦۦۘۛ۬ۧۛۢۨۗۤۨۢۚۧ";
                                            break;
                                        case 1201722424:
                                            str3 = "ۚۨۨ۬ۡۥ۠ۤۥۗۤ۟ۖ۫ۘۡۙۚۤۦ۟۬ۜۘ۬ۡۘۘ۫ۘۖۘۡۡۦۘۜۤۢۖۤۥۚۦۗۚۡۘۨۚۨۘۢۢ۟ۡ۟۠ۡۗۨۘۛۗ۬ۡ۬ۧ۬۬۠ۚۚ۫ۥۚۘۛۧۦۘ۠ۨۥۧۗۖۘۗۖۦ۟ۦۖۦۛۤۤۜۖۘۨۛۖ۫ۘۜۘ۬ۢۖۘۡ۠ۙ";
                                        case 1306411101:
                                            String str4 = "ۡۢۛۚۦۘۘۤۦۡ۠ۚۜۘۢۡ۠ۜۦۖۘۜۨۨۛۥۘۘۙۖۨۘۨ۟ۜۧ۬ۧۛۜۗۚۦۗۙۤ۬ۘۚۦ۠ۗۡۨۤۜ۟ۗ۬ۚۦۨۖۘ۠ۜۦۗ۟ۢ۠ۗۥۘۗۥۛۡ۠۫ۚۧ۫۠ۗۦۚۘ۟ۖۥۙ۠ۢۜۤۛۙۡۡ۟۬ۛۙۜۛۥۤ۟ۧ";
                                            while (true) {
                                                switch (str4.hashCode() ^ 1120767504) {
                                                    case 607828678:
                                                        String str5 = "ۛۖۜۘۙۙ۫۫ۖۥۨۦۘۡۙ۬ۛ۫ۖۢۧۤۧۚۘ۠ۗ۬۟۫۬ۡۜۘۘۥۘۜۘۦۘۦ۬ۥۥۘۧ۫ۨۘ۬۫ۗۖ۟ۧۗۜۧۘۙۦۧۚۙۤۖۙ۟ۙۨۛ۟ۛ۟۬ۜ۟ۗۤ";
                                                        while (true) {
                                                            switch (str5.hashCode() ^ 314067913) {
                                                                case -2142982939:
                                                                    str4 = "ۗۙۖۧۥۡۘۙۛۚ۬۠ۧۨۖۡۛ۫۠ۦۨۗۤۙۢۖ۟ۜۘۚۧۜۨۜۧ۠ۗ۫۫ۥۚۡۛ۠ۢۗۥۧۧۨۘۙ۫ۥۗۙۜۢ۬ۖۘۙۤ۟ۚ۬ۡۘۗۡۚۜۧۗۛۛۧۥۧۧ۠۟۫۠ۦۦۘۧۖ۟ۧۙۦۘۤۜ۫ۢۧۦۘۜۘۖۘۢۥۧۘۖ۠ۨۘ۠ۦۨۘ";
                                                                    break;
                                                                case -1669450518:
                                                                    String str6 = "۟ۛۡۡۨۥۘ۬ۡۤۙۢۥ۟ۤۖۤ۠ۜۚۙۧۤ۠ۘۥۨ۫ۗۗ۫۟ۢۙ۟ۨۘ۠ۡۖۜ۟ۜ۬ۙ۫۠ۚ۬ۡ۠ۨۙۤۥۘ۠ۜۨۨۦۦۘۢۦۘۘۥ۟ۛۨ۠ۜۚ۟ۖۗۜۦۗۚ۬۠ۛۡ۠ۢۤۡۗ۬ۧۨۛۦ۫ۖۘۡۚۧۚۦۧۘۖ۫۠ۢۘۥۘ۟ۥۗۤۚ۫ۚۖۨۥۧۖۘۦۘۨ۠۟ۛۗۡۘۥۚ۟۟ۧۥ";
                                                                    while (true) {
                                                                        switch (str6.hashCode() ^ 1972770061) {
                                                                            case -1459830328:
                                                                                str5 = "ۡۦۜۚۦۦۘ۠ۥۢۙ۟ۖۘ۠ۖۥۦۚۨۘۥۛۜۤۗۜۤۘۦۡۜۜۘۛ۬ۛۛۨۖۛۙۦۘ۫ۗۧۤ۠ۜۢۚۥۢۘۜۘۨۢۡۨ۫ۡۥۖۗۥۘ۟ۛۘۜۗۖ۟ۤ۬ۨۨۥۥۘۖۦۨ۬ۧۢۥ۬ۜ۬ۘۘۨۢۡۘ";
                                                                                break;
                                                                            case -212595756:
                                                                                str6 = "ۜۥۖۤۚۙ۟ۛۤ۟ۙ۠ۥۘ۫ۚۚۦۚۢۡۨۘۗۤۨۘۙۖۖۢۚۤۖۨ۫ۧۛۦۘۙۛۘۗۦۦۘ۬ۜۨۙۛۚ۫ۢۧۚۚۤۢۤۧۗۘۙۙۦۙۖۖۖۘۖۦ۬ۨ۫ۗ۫ۚۧ۬ۛۙۘۛ۫ۤ۬ۨۘۘۦ۠ۦ۟ۡۘۘۛۜۘۡۥۙۢۘۜۘۦۛۖۡۧۤۢۗۘۘۧۦۢۦۥۨ۫ۧۜ۟ۡۤ۬ۛۛ۟ۚۡۘ۠ۚۛۚ۬ۘ";
                                                                            case 263789849:
                                                                                str5 = "ۥۥۡۘۛۧۥۘۡۚۨ۬ۚۢ۠ۧۤ۫ۡۢۧۙ۟ۡۨ۫۠ۦ۠ۨۖۛۢۘۢۗۚۤۧۡ۫ۡۨۚۘ۟ۛۖۨ۫ۗ۬ۡۚۘۚۦۙۥۗۡ۟ۤۜۘۛۤۥۙ۬ۨۘ۠ۖۡۨۧۘ";
                                                                                break;
                                                                            case 454601748:
                                                                                str6 = FloatService.class.getName().equals(runningServiceInfo.service.getClassName()) ? "ۨۚۦۘ۬۠ۜ۫۬ۥۘۨۦۗۗ۫۠ۘۦۚۧ۬ۙۖ۠۠۟ۚ۠۠۬ۡۘۢۛۨۘۙۗۤۛ۠۠۟ۖۨۘۢۥۖ۫ۗۘۘۘۚۥۢۨۨۧ۫ۧۧ۟ۘۘۗ۟ۛ۟ۚۖۤۚ۫ۜۚ۬ۘ۫ۙ۬ۢ۫ۚۥ۬۠۫۟ۙۘۤۗۛۜۘۨۦ۫ۧۖۙ۠ۚۜۤ۬ۗۜۚۖۡۧۥۘۖ۠۬۬ۜۥ۫ۛ۠۠ۨ" : "ۥۨۧۘۖۘۦۘۨ۠ۚۡۧۥۚۙۗ۫ۦۛۙۗۜۙۛ۬ۦۨۘۥۡۤۤۚۡ۠ۧۚۡۛۨۚۖۦۘۦ۫۬ۧ۫ۚۛۜۜۘۢۚۨۜۘ۫ۛۚ۟۠۟۠۠ۘ۠ۡ۟ۘ۠ۡۜۧۧۘۘ";
                                                                        }
                                                                    }
                                                                    break;
                                                                case -57085912:
                                                                    str5 = "۬ۦ۠ۙۥۤۗ۠ۖۥۦۘ۫ۤۛ۫ۗۨۤۦۘۜۧۗۘۡۜۘۦۡۢ۠ۨۛ۠ۚۨۘۜ۬ۚ۟۫ۥ۠ۜۨۘۤ۫ۤۛۧۦۘۨۨۦۛۗۨۖۢۡۘۗۤۨۘۥۤۜۥۧ۫ۙۗ۫ۢۖۡ۫۟۠ۢۨ۠۫ۘ۠ۜۖۗۧ۫ۚۜۙ۬۠۟۠ۛۡۤۙۖۧۖۚۜۙۧۖۜۥۜ۫ۤۢۙۨۘۥ۬ۘۖ۠ۜ۬ۢۡۘۥۦۜ۫ۚ۟ۜۗۜۘ";
                                                                case 2147405529:
                                                                    str4 = "ۦۧۘۚ۠ۤۧۥۦۘۙۡۘۗۖۧۘۗۖۦ۬ۡۨۘۧۧۖۢۙۚۙۛۥۛ۠ۧۢۙۥۘ۬۠ۧۖ۬ۗۗۥۡۚۧۨۘۛ۟ۦۨ۠ۙۤۢۧۧۘۢ۟ۡۖۘۦۘۡۘ۫ۡۜ۠ۛۥۙۚۘۚۘۢۗۡۖۧۘ۟ۢ۠ۢۨۡۦۤۢۜۘۥ۫ۙ۠ۥۧۘۤۡۨ۬ۨۥۖ۠ۘۨۘۜۘ۟ۧۜۘۨۡۧ۟۫ۜۘ";
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 864339984:
                                                        str4 = "ۗۧۦۘۗۘ۫ۤۚۖۘۙۖۖۘۢ۠ۗ۬۟ۨۨۨۢۧۡۖۘۛۗۙۡۛۢۦۦۨۢۖۦۡۚۧۚ۠ۢ۬ۥۜۜۗ۫ۜۨۧۘۤۢۧۛۜۦ۬۫ۛۡۢۥۘۧۛۙۢ۠ۜۘ۠ۙۤۥۦۧ۫ۖۧۚۙ۟ۡۦۘۧۘۘۥۦۛ";
                                                    case 1866004988:
                                                        str3 = "ۖ۠ۗ۬۠ۨۘ۠۫ۡۘ۟ۜۤۗ۫ۚۥۥۘۨ۫ۧۦۨۦۘۤۤۨۖۘۤ۠ۖۤۗ۬ۛۖۢ۟۫ۜۜۛۨۘۨ۟۟ۗۢۚۤۚۜۢۨ۬ۛۧۖۘۘۢۜۢۚۘ۫ۨ۟ۖۘ۫ۨۛ۫";
                                                        break;
                                                    case 1915463996:
                                                        str3 = "ۗ۟ۨ۠ۡۗۥۧۖۘ۟ۙۘۘۘۘۡۘ۬ۡۧۦۘۢۨۧۖ۟ۨۘ۟ۚۘۙۦۧۘ۬ۤۧۥۧۡۖ۬ۜۜ۬ۗ۬ۙۦۥۤۨ۟ۚۨۤۗۡۦۦۜ۟۫ۛۢۛ۟ۢۨ۠ۤۢۜۘۢۡۦۥ۫۠ۜۜۖۥۘۥۖۖۘ۬ۖۘ۫ۨۨۛۛۙۡ۟ۜۡۚ۫۟ۡۘۙۨۡۘۘۥۖۘۖۢۘۘۖۤۖۖۡۖۘۖۛۘۘ۫ۛۜۘۡۖۡ۬ۙۛۘۡۘ";
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                            case -640618544:
                                str = "ۧۦۗۙ۠ۛۧۙۥۢۘۨۙۗۨۘۡ۬ۨۖۡۘ۟۟۟ۦۥۧۘۤ۟ۨۘۛ۠ۙۢۨۨ۟ۧ۬۬ۘ۫ۥۡۖۜۙۜۜ۠ۧۨۡۘۥ۬ۗۥ۠ۚۦۛۖۘۡۤۡۤۖۙۛۛۤ۬ۚۗۦ۠۟ۤ۬۬ۧۦ۬ۖۤۜۘۚۜۛ";
                                continue;
                                continue;
                            case 1007815349:
                                str = "ۦۦ۠ۢۖۘۘ۬ۙۤ۫۟ۨۘۥۙۖۘۤ۬۫ۗۘۡۘۗۖۖ۟ۜۖۧۛۦۘ۟ۗۨۘۚ۟۬ۥۖۘۚۖۙۙۘ۠ۜۚۙۤۖۛۜۢۛۦ۫ۜۚۨ۫ۖۧۡ۫ۤۡۘۙ۟ۦۢۨۧ۟ۗۙۘۖۡۘۢۖۢ۟ۘۘ۟ۥ۠ۥ";
                                continue;
                            case 1265855997:
                                str2 = "ۦ۫ۚۦۧۢ۟۫ۛ۟ۨۖۘ۟۫ۜۥۗۡۘۡۤ۬ۦۜۚۗۖۜۘۛۚۛۢۙۘۘ۫ۧۙۘۦ۬۟ۢۙ۟ۚۥۚ۠۠۬ۦۛۗ۬ۜ۟ۥۙۦۢ۬ۤۦۘۘۢۖۘۘۧۡۦۘ۬۫ۤ۬ۥۦۢۨۨۘۘ۬ۗۛۗۤ۠ۖۡ۫ۜۙ";
                        }
                    }
                    break;
                case -712545844:
                    str = "۠۠ۢ۫ۥۖۘۨۙۜۧۜۛۖۦۢ۟ۤۛۦۥۡۢۤ۬۫ۢۧۥۥۖۘۚۤ۫ۖۗۙۡۜۦۘ۠ۙۦۖۚۛ۫ۚۘۘۚ۟ۜۘۢۡۨۧۧ۫۠ۜۤۖۡۗۙۤۥۘۗ۬ۖۥ۟۫۫ۙۦۘۡ۟ۛ۠ۤ۫ۡۘۨۘ۠ۚ۟ۥۘۤۤۛۙ۠ۡۖۜۡۨۜ۠ۦ۠ۡۖۘۖ۬ۙۚۘۘۖۡۘۨۤۡۘۜۨ۬";
                    continue;
                case -328129055:
                    str = "ۤ۟۟ۙۙ۬۟ۦۚۖۢۨۘۖۤۦۥۜۘۘۤۧۨۘۘۖۥۘۢۦۨۙ۠ۜۥۙ۫ۙۤۘۨۜۦۧۗۜۡۨۖۖۚۢۛۨۙۛۖۚ۫ۨۡۧۤۧ۫ۦۘۦۖۘۘۙۧۡۨۦۛۜۨۚ۟ۛ۟ۗ۠ۖۛۙ۬ۛۚ۟ۤۨۗۗۧۗۛ۠ۖۥۖۡۜ۬۠ۥۗ";
                    activityManager = (ActivityManager) getSystemService(Deobfuscator$$app.getString(-3440726978870468425L));
                    continue;
                case 44987732:
                    str = "ۡۚۚۘۘۥۢۖۥۧۦۙۛۖۙ۠ۧ۬۬ۖۤۛۜۘۙ۬ۚۦۛۖۘۜۡۛۦۧۛۡ۠ۨۘۖۡۤۛۦۦۜ۬ۡۘۦۖۜۥۖۘۙۛۦۘۚۛۡۘۗۙۥۘ۫۫ۛۛۧۧۗ۟ۦۘۧۡ۟۫۫ۜۘۙ۬۠ۜۘۧۡۚۢۙۗۜ۠ۚۜۘۖ۫ۖ۠ۦۨۘۢۡۖۗۨۖۘۦۥۥۘ۬ۜۘۥۙۜۘ۬ۘۥۧۚ۬۬۠ۨۘۖۛۢۚۨ۬ۦۜۦۘۥۥۦ";
                    it = activityManager.getRunningServices(Integer.MAX_VALUE).iterator();
                    continue;
                case 175653347:
                    str = "۬۠۟ۢۖۛۨ۠ۥۘۢ۫۬۬ۡۘۜۘۜۧۛۗۢۜ۬ۦۚۛۘ۬ۧۖۥۘۨۗۖۢۨۦ۫ۙۨ۬۟۬ۢ۬ۤۙۢۜۡۘۘۜۤۨ۬ۚۥۥۗۘۡۙۢۥ۠ۡۙۗۦۛۢۦ۬ۛ۠ۡۛۙۗۖۖۦۦ۟ۤۙۖۘ۬ۖۨ۟ۘۦۛ۠۠ۛ۠ۧۧۖ۠ۡ۫ۗۙۨۙۛۗۛۜۥ۫ۘۦۢ";
                    runningServiceInfo = it.next();
                    continue;
                case 874406926:
                    String str7 = "ۦۥۜۘ۠۟ۜۛۧۖۘۖ۬ۥۚۡۚۧۚ۬ۢ۫ۜۘۡۢۘۗۡۛۚۗ۬ۥۧۖۗ۠ۖۨۦۖۘۡۙۖۚ۠ۡۨ۠ۡۘۡۡۙۦۚۤۙۤۢۨۦ۫ۛ۠ۨۜۡۜۘ۫ۜۗۦۢۖۘ۫ۥۢ";
                    while (true) {
                        switch (str7.hashCode() ^ (-117858483)) {
                            case -2076449178:
                                String str8 = "ۚۡۚۤۖۗ۟ۢۜۡۢ۠ۜۖۧۖۦۦۘ۫۟ۖۘۢ۬ۘۡۙۤ۠ۜ۫ۗۦۖۙۥۘۘۚ۠ۜۘۨ۟ۙۦ۠ۛۚ۟ۘۢۧۖ۬ۗۜۘ۫ۘۘ۫۫ۖۤۘۘۘۖ۬ۡ۠ۚۨۦۚۖۖ۫ۜۘۢۜۢۧ۟ۙۙۜۧۘ۬۬۟";
                                while (true) {
                                    switch (str8.hashCode() ^ 1625431239) {
                                        case -1932490688:
                                            str8 = "ۥۖ۫ۚۚۥ۠ۙۦۘۖۨۘۘۦۦ۫ۗۨ۟ۡۤۙ۫ۜۗۙۦۘۚۤۗ۫ۖۨۘ۠ۧۚۡۘۨۘۗۥۧۜ۠ۖ۠۫ۘۘۥۚۨۘۦۙۥۘ۫۬۠ۜ۟ۢ۫ۘ۟ۗ۫ۦۘۗۨۨۘۧۖۤۜ۬ۥۧۤۖ۟۫ۢۨ۠ۦۖۜۛۚ۫ۧۧ۬ۦۘۡۡۧۘۜ۟ۘۘۧۧۖۨۜۗۡۤۛۘۗۘۙۨ۠ۚ۫ۢ۫ۙۖۙۨۘۙۙۡۘۡۧۦۘۦۦ۟ۥۥۡ";
                                        case -1452230297:
                                            str7 = "ۧۙۦۘۛۘۛۘ۬ۜ۠ۖ۠ۦ۟ۢۨۘۜۥۛ۟ۖۧۗۨۡۘۘۗ۠ۤۗۤۥۘۥۧۤ۬ۢۜۨۤۜ۠ۜ۬۬ۗۖۘۘ۬ۤۥۛۘۘۜۛۖ۫ۘۜۘۧۢۥۘۥۢۤۛۨۜۦۢۡۦ۬ۚۦۘۡۘۙۥۡۚۢۥۘ۫ۥ۬۠ۢۥ۠۠ۗۥ۬ۢۨۜۘۘۤۤۥۘ۠ۗۖ";
                                            break;
                                        case 1571921042:
                                            str7 = "ۗۜۥۘۙۙۦۘۘۖ۟ۡ۬ۥۘ۠ۧۦۜ۟ۥۗۡۘۦۙ۠ۘۙۖۘۡ۬ۙۘۡۨ۫ۦۡۖۖۘ۬ۡۡۚۡۥۘۚۖۧ۟ۖۢۜۗۘۘۚۜۚۛۚۨۘۘۢۘۦۦۙۙۥۜۘۙۗۖۘۘ۟ۨۘۤۨۡۘۙۨ۫ۥۜۘۘۙۘ۟ۢۙ";
                                            break;
                                        case 2132594705:
                                            String str9 = "۠۫۫ۧۚۦۘۖۨ۠ۨۦۦۘۡۨۤ۠ۤۘ۬ۥۦۙ۠ۛۨۘ۫ۡۜۦۡۨۘۛۚۡۘۥ۟ۜ۬ۧۘۙۥۙ۠ۜۜۧۛۧۚۢۧۜۦۥۖۚۡ۫ۙۘۘ۬ۗۥۘۤۜۦۥۦ۟ۢۦۘۘۨۖۨۘۛۡ۠ۜۦۘۘ۬ۡۡۘۖ۠ۢ۬ۧۜۘۡۤۗۛۚۧۛۡۘ۫ۧۤۘۥۢۚۜۖۦۖۡۤۨۧۥ۟ۥۘۥ۫ۦۛۨۚ۬ۚۢ۫ۜۡ";
                                            while (true) {
                                                switch (str9.hashCode() ^ 391547468) {
                                                    case -790416666:
                                                        String str10 = "۬ۧۥ۠ۚۦۨ۟ۖۚۜۛۙۥۥۗۥۢ۠ۥۘۚۥۡۗۦۘۘ۠۬ۚۡۡۧۨۛۤۡۜۛۤۜۘۢۥۦۘۥۧۗۡۤ۠۠۠ۡۡۥ۟ۦۡۛۨۢۙۗۨ۫ۨ۟ۘۘۥۧۧۘ۟ۧ۟ۨۗۛۡۡۘۡۗۨۘۨۨ۟۠ۡۤۧ۬ۤۛۘۗۥ۠۠ۧۙۡۘۧ۫ۚۘۨۡۘۨۗۨۢ۬ۘۛۛۖۘ۫ۗۜۘۚۖۨۘۡۛ۬ۛۤ۟ۙۛۘۘ۫ۡ۟";
                                                        while (true) {
                                                            switch (str10.hashCode() ^ 1196292840) {
                                                                case -1781426115:
                                                                    str9 = "ۙۥۡۘۤۚۦۛۛۗۡۤۙ۬۟ۨۙۜۡۙۦۛۖ۟ۛۦۧۘۖۧۡۘ۬ۨۧۘۖۚۨۘ۟ۚ۟ۧۚۘۛۙۨۨۜۨۖۨۨۜۢۜۘۤۙۧۥۤۡۘۘۦۥۘۤ۠ۛ۠ۛ۠۫ۨۤۢۚۡۘۚۢۖۘ۫۬ۜۘ۟ۢۗۢۦۢ۫ۗ۠ۥۧۘۥ۬ۦۘۗۜ۫ۧۦۡۜ۠ۘ";
                                                                    break;
                                                                case -1493840158:
                                                                    str10 = "ۗۚۚۨۧۘۛۛۘۥۧۗۡۧۘ۠ۦۛ۫ۛۥۧۜۨۘۦۙۘۘۡۤۨۖۧۛ۟ۥ۠ۙۙۦۛۡ۫۬ۨ۟ۡۦۨۛۡۡ۫۟ۢۚ۟ۜۖۡ۟ۚۢ۫ۢۜ۠ۖۘ۠۟ۡۚ۫ۜۘۤۛۨۘۛۥۨۘۢ۠۬ۢۤۥۘۤۚۡۘۗۚۥۗۚۚۗۖۖۡۦۜۘۚۧۛۗۛۥۘۨۜۦۘۘۙۖۘۡۢۖۜۡۘۜۛۤۥۛ۟ۘۨۦۚۦۧۘۚ۟ۧ";
                                                                case -1349229390:
                                                                    str9 = "۫۟ۡۘۙ۬۬ۨۖۤ۠ۜۚۢۖۛۛۛۙۙ۫ۗ۠ۗۙۜ۬ۧ۟ۘۜۦۥۦۘۙۜۘۡ۫ۘۘۙ۫۟ۚۡۨۘۨۜۜۘۢۨۦۘۛ۬ۜۘۜۖ۬۬۫۫ۛۨ۬ۙۗۤۦۗۘۚۥۜۗۥۘۦۜ۫ۚۖ۬ۢۡۡۘۜۦ۫۠ۘۜۘۢۡۜ۬۫ۜۘۙ۟ۛۖۜۡۘ۟۬ۗۖ۟ۦۚۥۦۘۤۙۦۗ۟ۖۘۜۖۧ۬۬۟ۜۤۖۘۧۤۙۤۜۖۦۘۦۘ";
                                                                    break;
                                                                case -972249848:
                                                                    String str11 = "۫ۤۧ۠ۙۦۘۢۗۗۧۚۖۛۘۛۙ۠ۢ۟ۖۡۘ۬ۢۡ۟۟ۢۥ۠ۘۘۙۘۢۨۦۖۘۡۨ۠۟ۜۥۙۥ۬ۨۧۥۥۜۨۘۨۦۜۘ۬ۧ۫ۖ۫۠ۥۜۖۘۦۖۨۘ۫ۥۖۘ۠ۧۥۛۘۙۥ۠۫ۤۡۜۥۗۜۖ۟ۨۘۗۜۨۜۛۥۘۘۤۨ۠ۚۘۘۗۨۜۢ۬ۜۘۛۙۙۢۡ۟ۘۗۛ۬ۢۙۖۙ۟ۤۖۥۘۥۘۙۘ۬ۖ۠ۜۘۗ۠ۛ";
                                                                    while (true) {
                                                                        switch (str11.hashCode() ^ 295027616) {
                                                                            case -671836052:
                                                                                str11 = "ۢ۟ۜۘۖۜۡۘۗ۫۬ۚ۫ۚ۟ۨۡۡۚۚۚۛ۬ۢۨۘ۬ۖ۫۠۫ۘۘ۫ۛۙۦۗۧۤ۫ۡۤۡۧۖ۬ۦ۟ۚۗۨۗۙۗۚۖۘ۟ۥۗۨۚۜ۬ۤۛۘۦ۬ۘۤۚۙ۫ۜۘ۬ۗ۟";
                                                                            case 162824925:
                                                                                str10 = "ۜۨۘ۫ۦۦۘۙۨۘۘۢ۬ۜۘۡۧۤۘ۟ۨۘ۬۫۬ۧ۬ۡۘۥۛۨۘۡ۬ۗۖۧ۫۟۠ۖ۬۫۠ۗۡۚۛۨ۟ۢ۫ۦۧ۠۟ۧ۬ۚۧۧۜ۠۠ۤ۫ۘۡۧ۟ۗۨۘۡۧۘۘۥۥۧ۟ۧ۬ۚ۟ۦ۫ۚۚۙۘۢۜ۬ۥ";
                                                                                break;
                                                                            case 166251057:
                                                                                str10 = "ۚ۬ۥۘ۟ۧۥ۠ۘۡۘۤۥۦۗ۟ۜۘۡ۠ۨۘ۟ۚۥۘۗ۫ۤ۬ۥۘ۟۫ۖۘۛۥۖ۫ۙۖۘۥۧۖۜۢۚ۫ۜۛۤۗۙ۠۠۬ۙ۠ۜۗۢۘۘۚۨۧۚۧ۟ۦۤۨۘۤۚۦۘۡ۟ۦ۬ۜ۫ۜ۬ۖۙۙۘۘۗۦۙۗۙۚۖۥۘۖۜۘۗۛ۫ۜۥۖۘۤۥ۬ۥۗۥۧۥۜۤۜۘۦۢۗۢ۬ۜۚۤۧ";
                                                                                break;
                                                                            case 1270861819:
                                                                                str11 = activityManager != null ? "ۨۤۨۘۧۚ۫۫ۚۘۨۖۗۙۥۤ۟ۗ۠۫۫ۧ۟ۚۜۤۛۧۖۖۖۨۨۨۘۢۦۤۧۖۛۨۤۛۥۢۖۖۙۦۘۨۚۥۡ۫ۗ۟۟ۡۘ۫ۛۛ۠ۚۨۦۙ۟ۜۨۡۘۙۙۗۙۡۗ" : "۬ۧۜۘۤۢۚۜۚۛۥۥۥۘ۫ۥۦۗۖۖۛۥۡۢۦۘۘۙۦۢۘۤ۠ۤۡۜۘ۫ۜۘۡۤۢۘۗۖۘۦ۫ۥۗۢ۬ۗۢۧ۬۠ۛۡۧۨۗۘ۟۟ۥۨۘ۟۠ۜۨ۠ۡۘۜۥۡۘۡۤۖۚۧۛۡۨۢۨۜۙۢۢۤۘ۠ۛۙۖۚۤۖۚۛۧۙۜۖۛۙ۫۬";
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 315077075:
                                                        str8 = "ۙۜۡۗۡۥۙۡۦۘۚۢۘ۠ۤۚۥۜۛ۬ۦۦۘۥ۠ۡۘۚۢۙۨ۬ۨۘۙ۫ۜۢۡۢ۠ۤۧۨۡۘ۬۠ۚۛ۟ۨ۫ۢۤۜ۬۫ۧ۫ۗ۟۬ۖۦۘۢۜۜۘ۫ۚۤۛۘ۟ۗۗ۬";
                                                        break;
                                                    case 509293953:
                                                        str8 = "ۘ۟ۡۗۨۥۜ۠ۥۘۡۧۡۘۜۜۘۢۦۘۜ۠ۙۧۜۘۜۨۦۥ۫ۢۤۛ۟۟ۖۥۘۢۧ۫ۜۖۘۦۙۡۥۤۜۘۢۦۥۘۘۢ۫ۧۚۡۘۤۧۧۘۚۡۘ۠ۢۥۘۖۗ۫ۚۦۤۢ۠ۨ۬ۗۖۤۨۖۛۨۡ۬ۨۤۤۜۡ۠ۥۢۗۢۖۢۡۡۦۢ";
                                                        break;
                                                    case 1423938046:
                                                        str9 = "۫ۡۡۘۦۨۖۛ۬۠ۥۗ۟ۦۜۘۜۛۚۚ۬ۚۤۨۧۘۚۚۡۘۙۚۥۖۡۖۡۜ۠ۙۚۛۘۨۘۨۘۜۘۖۦۥۘۦۙۚۥۗۜۨ۟ۙۗۗۦۘۡۦۥۨۛۖۘۚۦۨۘۡۢ۫ۧۜۨۘۤۧۜۘۦ۠ۨۤ۬۬۬۠ۘۘۢۨۤۤۨۦۨۗۘۛۤ۬ۗۧۗۦۢ۟۫ۘ۠ۗ۠۫ۖۜۜ۟ۧۘ۠ۨ۫";
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                            case -2058567386:
                                str = "۫ۤۥۘ۠ۥۜۦ۬ۧۥۚۢ۫ۗ۬ۜۛۤۚ۬ۢۦۘۛۚۦۡۗۖۗۛۘۘ۟ۨۗۨۜ۟۫ۜۗۤۨ۫ۚۜۧ۠ۦۥۘ۠۠ۢۥۗۤۙۥۗۤۙۗۖۙۢۧۦۦۚۨۘۤۤۨۘۧۤۘۘۜۥۤۙۥۚۦۘۜۙۨۘ";
                                continue;
                            case -775108959:
                                str7 = "ۥۤۨۘۙۤۙۗۦۥ۬ۡۖۘۥۘۥۘ۫ۦۧۖۖۢۚۖۘۘۡ۠ۨۚۜۥۘۛۦۡۡۘ۟۠ۧۤ۟ۘۨۖ۫۠ۡ۠۟۬ۗۖۥ۫۬ۨۦۘۙ۠ۦۙۖۛۜ۬ۗ۠ۨۧۘۥ۫ۨ۫۠ۖۘ۠۠۟۠۬ۤ۟ۘ۠ۥ۟ۤ۬ۙۦۘۦۗۜۖۨۘۧۥۢ۬۟ۡۘ۫ۤۖ";
                            case 1164858831:
                                break;
                        }
                    }
                    break;
                case 1306771721:
                    return true;
                case 1856642424:
                    String str12 = "ۧ۠ۘۘۜۢ۠ۖۘۡۘۙۢۧۚۘۨ۠ۙۧۛۛ۟۟ۙۢ۫ۨ۟ۢۨۨۘ۬ۜۦۘۨ۟ۘۖۦۘۤۡۧۘۚۢۦۘۗۚ۠ۧۥۦ۠ۘۥۨۢۦۨۢۗۛۙۢۛۦۛ۟ۚۙۨۘ۟۫ۘ";
                    while (true) {
                        switch (str12.hashCode() ^ (-397122988)) {
                            case -1567252335:
                                String str13 = "۬۟ۘۘۨ۠ۦ۟ۛۢۧۤۛۜۙ۬ۤۖۡۚۜۘۤۦۛۧۦۜۘ۬ۦۨۘۗۦ۫ۧۖۢ۫ۡۘۚۗۘۘ۫ۛۦۛۖۙۚۘۙۜۦۦۜۚۨۘۗۜ۫ۨۤ۟ۡۨ۟ۧۨۧۘ۟ۤۙ";
                                while (true) {
                                    switch (str13.hashCode() ^ (-1344810610)) {
                                        case -514431450:
                                            str12 = "۟۠ۨۘۖۜۨۘۗ۬ۗۨۥۢۧۦۨۘۘۛۡۘۨۚۧ۬ۧۥۘۨۖۘۙۧۡۘۤۛۘ۫ۗۙۦۖۡۘۗۜۙ۫ۖۨۚۦۤۤۚۦۦ۬ۧۜۢۡۘۢۙۚۢۡۧۧۦۢۗ۫ۜۧۥۥۘۙۚۦۘۥۧۗۨ۬۟ۧۥۘۘۙ۟ۨۧۥۧۘۧ۬۟ۙ۬ۡۜ۟ۗۛۨۘۘۜۚۤۙۧۦۘۙۡۥۦۧۖۘۛ۫ۡۘ۬ۖۖۘ";
                                            break;
                                        case 203307077:
                                            String str14 = "ۤۥۨۘۤۚۤ۫ۖۘۛۙۙۙ۬ۤۖ۬ۨۘۨۚۥ۟۫۬ۚ۠ۜۘۗۨۖۘۚ۬ۖۘۥۢۜۘ۠ۧ۠ۘۤۛ۫ۡۚۥۛۘۡۖۜۘۦۛۡۧۡۨۙۙ۠۟ۧۙۡ۠ۜۘۨۙۗ۠ۨ۫ۘ۟ۨۘ۫۬ۢ۠ۛۖۤۛۙ۬۫۠۠ۦۥۘ";
                                            while (true) {
                                                switch (str14.hashCode() ^ 1787140) {
                                                    case -1929497621:
                                                        str13 = "ۡۗۙۦۨۥ۠ۘۚۧۖۘۘ۠ۙۦۛ۠ۘۘۖ۫ۜۘۗۚ۟۬ۦۥۘۘ۬۬۫ۙۦۨۘۧۘۧۢۡۦۘۘۚۥۦۘۚ۬ۛۥۦۗۡۖ۠ۚۢ۠ۖۨۤ۟۠ۥۨۦۚۚۜۘۗۤۖۥ۫ۚۡۚۤۢۤۡۘۘ۟ۗۧۚ۬ۢۜۘ۫ۙۤۢۦۜۘ۫ۥۥۘ۫ۖۚۦۨۘ۬ۘۥۤۢ۫ۚ۟ۚۚۘۚ۬ۡۨ";
                                                        break;
                                                    case -647177371:
                                                        str14 = "ۗ۬ۤۥۤۖۘۤۦۛۙۗۙۧۨۘۛۨۘ۬ۡۦۛۜ۬ۢۗۜۘۨ۟ۖ۟۟ۘۘۥۛۡ۠۫ۥۘۦ۟ۡۢۢۨۘ۟ۦۘ۬ۦۛۢۦ۠۬ۨۘۘۨۡۤۚ۫ۜ۫ۢۥۨۡۘۘۨۨۛۤ۟ۤ۠۠ۤۜۙۦۘۢۡۙ۬ۙ۟ۙۘۡ۠ۡۘۖ۫ۖۘۨۦۧۘ۠ۖۧۘۥۥۛۗۨۘ۠ۖۜۘۖۜۗ۠ۥۛۙۤۙ";
                                                    case 979195724:
                                                        str13 = "ۗ۬ۧ۟ۙۦۘۗۘۘۙۢۗۙ۟ۖۘ۟ۥۢۨۡۢ۫ۚۜۘۨۗۤۥۧ۠ۚۥۥۧۖۥۜ۟ۛ۠ۥۘۧۗۧۛۢۢۚۚۥۙۜ۬ۗۦۖۘۚۖۡ۬۠ۙ۫ۡۛ۫ۙۤۤۡۡۘۢ۬ۤۖۘۘ۬ۡۤ۫۬ۥ۫ۡۦۛ۟ۢۧ۠ۗۗۥۖۘۡ۬۟ۙۛ۟ۘۦۨ";
                                                        break;
                                                    case 2135572080:
                                                        String str15 = "ۦ۟ۘۘۨ۠ۥۘۚۜۢ۠ۢۜ۟ۤ۟ۨۘۘۙۢۛۥۚۨۨ۬۫ۥۦۗۧۡۘۘۚۡۖۛۨۖۘۘ۬ۗۤۤۜۘۥۛۥۘ۠ۜۖۘۛ۟۬۠ۦۜۘۖۖۖۘۨۘۥۥۛۦۘۧۚۤۜۖ۬۬ۘۦۘ۟ۤۨۘۗۖۗۜۙۡۥۦۥ۬ۨۗ۫ۤۥۘۜۜۡۘۙ۫ۡۙۢۗۨ۬ۚ۟ۡ۟ۜۘۨۜۚۤ۬ۨۖۖۘۘ";
                                                        while (true) {
                                                            switch (str15.hashCode() ^ 822739084) {
                                                                case -1856040727:
                                                                    String str16 = "ۡۦ۫۬ۙۜ۫ۦۢ۠۬ۖۘۦۥۖۜۖۜۤۢۦۘۗ۟ۡۜۢۜۚۘۙۗ۬ۜ۟ۛۘۥۜۚۦۡۚۧۛ۠۬ۨۘۨۨۖۘ۟۫۠ۤۜۦۘ۠ۥۦۘۥۦ۬ۗۜۙۥۘ۬ۗۜۤۙۛۘۘۨ۠ۦ۟ۤۦ۟ۨۘۘۦۖۙۧۖۙۢۧۢۘۨۘۦۦۨۥۧۜۘۙۧۨ";
                                                                    while (true) {
                                                                        switch (str16.hashCode() ^ 1338878006) {
                                                                            case -1789037451:
                                                                                str15 = "۫ۛۥۨ۠ۦۦۚۛۢۚۤ۬ۖۨۚ۫ۧ۠ۤۜ۠ۤۖۗۨۜۛۧ۟ۢۢۡۘۡ۫ۖۢۤۖۘ۬ۜۨۘۖ۫۬ۖ۟ۦۘۛۜ۟ۨ۫ۧۖۨ۫ۗۖۥۡۨۦ۫ۜۘۥۨ۟ۢ۟ۦۘۥۡۧۘۚۥۨۘۙ۬ۚۢ۫ۚۙۙۜۘۡ۬۫ۡۘۨۢ۟ۜۘۘۗ۫۫ۢۘۘۚۖۥۘۢۗۡۘۚۗ۬ۘۖۙۗ۫ۙۦ۫ۡۘۙ۬ۘ۟۫۫ۡۜۥۘۢۧۖۘۛۨۙ";
                                                                                break;
                                                                            case -1311276162:
                                                                                str16 = it.hasNext() ? "ۨۢۘۘۢۢ۬ۧۘۢۚ۬ۚۚۗ۬ۤ۠۠ۤ۬ۨۘۛۛۧۙ۬ۦۘۚۨۘۨۙ۬ۚۜۥۘۤۚۦۦۢۨۙۘۥ۬ۦۘۛۙۜۘۤۘ۫ۡ۟۬۟ۜ۠ۘۚۙ۫ۦۤۖۖۥۧۙ۟ۨ۬ۧ" : "ۚۜۨۘۘۜۚۨ۠ۛۜ۬ۜۧۜۥۤۛۙۖۗۤۛ۠ۦۤۢ۬ۖ۫ۦۜ۫ۜۧۦۖ۫ۛۧۥۘۖۗۛۜۖۘ۟ۛۡۘۤ۟ۢۡۧۛۖۦۜۗۛۚۖ۟ۡۦۚۦ۫ۛۥۘ۬۬ۜۘۡۗۦ۬ۛۡۖۨۘۘۖۤۛ۬۫ۘۤۡۧۘۛ۬ۖۘۨۘۚ۟ۛۗۖۥ۬";
                                                                            case -540117443:
                                                                                str15 = "۫ۡۛۢ۠ۖۘ۠ۛ۬ۧۥۛ۫ۜۛۘ۟ۡۖۜۘ۫ۘۘۘۘۖۧۤۥۜۘۗۚۥۖۨۡۘۢۦۡۛۥۘۢۢۥ۫۬۬ۗۙۖۨ۫ۙۥ۫ۨۛۗ۟۫ۢۜۗۥ۬ۙۜۖۘۥ۠ۘۛۛۙۗۚۡۘۧۡۦۘۢۛۢۦۨۤۜۙۦۘ۫۬ۦۘۖۜۥۡ۫ۛۥۥۛ۬ۤۦۘ۟ۙۧۖۢۡۢۥۨ۫ۨ۟۬ۙۗۚۘۛ۬ۦۚۛ۫ۥۤۦ۟ۥ۠ۘ";
                                                                                break;
                                                                            case 661895313:
                                                                                str16 = "۠ۛۥ۠ۦۖۘۖۚۘۘۢۥۖۖۤۡۤۗ۟ۗۘۜۘۛ۠ۦۘۜۡۘۘۡ۠ۘۨ۫ۦۛۡۦۥۜۨۘ۬ۛۚۛ۠ۨۢۘۘۘۢۖۡ۫ۙۘۘ۟۫ۨۧۥۚۥۘۖۢۧۛۢۦۘۛۜۧۘ۠ۘۥۘۤۜۥۘۢۢ۫۠۠ۚ۟ۘ۫ۥۗۗۗۡ۬ۜۘ۫ۤۥۘۜ۠ۜۘۧۤ۬ۜ۟ۦۤۜۛۚ۟ۦۘۦۦۨۡۤ۠ۧۤۘۘۧۗۡۘۗۗ۫ۥۨۥۥۜۚ";
                                                                        }
                                                                    }
                                                                    break;
                                                                case -1442359028:
                                                                    str14 = "۬ۢۥۘۚۖۘۦ۠ۡۧۦۙۥۘۦۘۨۧۗۙ۫ۤۜۚۘۢۙۘۚ۠۫ۙ۠ۜۘ۟ۦۦۚ۠ۘ۫۟ۢۙۘۜۘۧ۟۟۠ۗۘۜۖۗ۟ۘۖۗۘۘ۬ۚۖۘۦۢۙۡۘۤۙۥ۫ۗۦۜ۫ۦۦۘۜۖۦۦۛۡۧۢۨ۫۠۠ۜۡۥۘ۫ۗ۟ۦۦۜۘۨۢۜۙۦۡ۬ۤۡۥۡۧۢۧۙۢۥ۟ۖۖۘ";
                                                                    break;
                                                                case 163880164:
                                                                    str15 = "ۗۛۦۡ۠ۚۛ۟ۦ۟ۧ۟۟۟۫ۥۨۢۜۤۥ۟ۤۢۨۚۦ۫ۛ۠۫۟۟ۢۘۜۚۦ۬۠ۙۦۙۘۘۢۛ۫ۤۥۦۖۚۜۘۖۡۡۘۧ۬ۥۧۡ۬۬ۨۥۜۢۜۘۦۨۨۘۡ۬ۚۢۜۜۛۘۘۘ۟ۛۘۘۚ۬۫ۨۢۙ۬۟۟ۜۧۥۙۗۡۘۤ۠ۨۘ۟ۖ۫۠ۜۙۜۢۗۦۤۘۘۛ۬۫ۜۜۘ";
                                                                case 1885975715:
                                                                    str14 = "ۜۧۚۛ۫۟ۧۜۜۘۙۢۘ۫ۛۥۤۡۘۘۗۡۘۧۥۨۘۘۢۨ۬ۖ۬۠ۡۛۛۘۘۖ۠ۖۨۜ۟ۦۨ۟ۦ۬ۡۘۦۚۗۦۙۥۘۜۢ۠ۘۤۗ۠ۨ۫۠ۢ۠۟ۨۧ۟ۙۘۚ۠۟ۡۢۜۚۡۙ۠۟ۖۘۚۢۢۢۙۤ۠ۘ۟ۗۦ۬ۨۤ۟ۨ۠ۧۦۨۙ۬ۜۢ۠ۤۧۨ۬ۥۡۦۨۘۙ۬ۧۡۜۚۙ۬ۗۡۡۢۦۡۘۥۛ۬";
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        case 823232891:
                                            str13 = "ۤۧۙ۬ۚۘۦۦ۬ۙۥۧۘ۠۫ۥۧۗۛۧ۬ۦۛ۬ۜۘۘۢۥۘۢۦۧ۠ۙۘ۬ۛ۫ۗ۠ۥۙۧۜۤ۫ۚۛۙۨۖ۟۬۟ۤ۬ۨۚۡۥۤۘۘ۠ۧۦۘۘ۠ۘۘ۠ۖۧۤ۠۬ۜۧۖۢۡۧۘۘۧۜۙۗۡۘۙۡۡۖۚۘۥۢ۬۠ۢۨۚۡۖ۫ۗۥۘ۬ۛۡۘۘۥۜۚۢۚۚۡ۟ۙۙۡ۠ۧ";
                                        case 1706683659:
                                            str12 = "ۜۡ۟۟ۖۦۦۥۘۤۙۥۘۙ۠ۤۛۥۦۨۗۖۨۛ۠ۦۘۖۘۧۜۥۘۗۗ۠ۢۛۜۡۙۦۜۛۡۘۖۘۨۡ۟ۢۖ۬ۚۤ۠۫ۛۧۙۜۛۖۘۙۡۖۘۘۨۖۛۧۖ۬۬ۥۢۢۙۨۜۘۘۜۖۡۘۖۢۜۘۢۙۨۗۡۧۜ۠ۥۘۗۗۛۜۨۧۡۥۤۜۦۘ۠ۡۧۘۧۥ۠ۤۦۡۧۤ۟ۤۧ۟ۖ۫ۖۘۘۡۧۚۢۡۘۦ۬ۦۛۥۥ";
                                            break;
                                    }
                                }
                                break;
                            case -581891949:
                                break;
                            case 472298361:
                                str = "ۙۤۡۗۧ۟۟۬ۨۡۤۥۜ۫ۜۙۚۗۖ۫ۖ۬۟۬ۛ۫۬ۧ۠ۥۘۙۥۘۘۗۖۖۤۤۘ۬۫ۚۥ۠ۛۙۦ۠ۥۧۥۘۡۨ۠ۦ۟ۜۘۨۦۖۘۡۘۢۛۢ۫۟ۚۡۢۢۚۡۧۜ";
                                continue;
                            case 1185611314:
                                str12 = "ۡۨۧۧۧ۟ۜۛۦۘۦۛۦۦۗۜۨۗ۫۬ۚۡ۬ۜۛۜۦۘ۫ۛ۠ۛۖۨۘ۫ۢۡ۬ۨۗۗۨۦۘۧۧۦۘۛۧ۠ۗۡۡۘۡ۠ۨۜۧۢۜۙۥۥۥۧۧۚ۟ۥ۠ۖۘۨ۠ۖ۟ۛۥۦۥۧۘۚ۠ۙۜۚۢۛۙۙ۠ۡۙ";
                        }
                    }
                    break;
                case 1984014469:
                    str = "ۡۚۚۘۘۥۢۖۥۧۦۙۛۖۙ۠ۧ۬۬ۖۤۛۜۘۙ۬ۚۦۛۖۘۜۡۛۦۧۛۡ۠ۨۘۖۡۤۛۦۦۜ۬ۡۘۦۖۜۥۖۘۙۛۦۘۚۛۡۘۗۙۥۘ۫۫ۛۛۧۧۗ۟ۦۘۧۡ۟۫۫ۜۘۙ۬۠ۜۘۧۡۚۢۙۗۜ۠ۚۜۘۖ۫ۖ۠ۦۨۘۢۡۖۗۨۖۘۦۥۥۘ۬ۜۘۥۙۜۘ۬ۘۥۧۚ۬۬۠ۨۘۖۛۢۚۨ۬ۦۜۦۘۥۥۦ";
                    continue;
            }
            str = "ۙۢ۟۠ۡ۫۠ۦۖۧۤۤ۫ۡۦۡۖۙۦۗۖۚۗۢۧۨۡۡۡ۟ۨ۟ۢۦۚۜۘۙۨ۠ۘۤۖ۟ۛۡۘۨ۬ۘۦۖۖۘ۠۫ۗۢۛۥۙۡۛۨۛۨ۬ۚۖۜۥۧۜ۬ۘۘ۟ۙ۟ۨۗۥۘۦ۟ۥۥۗۗۦۚۜۘۤۡۛۦۢ۬۬ۗۖۢۗ۠ۨۥۤۘۗۧ";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$installGameWithObb$10(MainActivity mainActivity) {
        String str = "ۜ۫ۡۘۚۤۨۜۗۥۢۡۘۤۥۧۙۧۢ۠ۡۧۘۘۚۜۘۥۚ۫۠ۧۥۨ۬ۚ۠ۙۙۢۚۦۘ۟ۘۦۦۤۨۥ۫ۜۘۧۛۘۘۙۖۙۚ۟۫ۖۡۧۘۙۙ۠۬ۜ۬۬ۧۛۢۢۖۘۦۙۥۤ۫ۦۘۛۢۗ۬ۗۦۘۤۗ۬ۢۘۡۘۘۨۜۛ۟۫ۗ۠ۦۘۡۗۚ۬ۨۛۢۡۘ۬ۙۡۘ۠ۖۘۢۚۥۥۨۥۚۜۛ۟ۥۗۘۚۧۦۙ۟ۧۘۢ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 450) ^ 691) ^ 841) ^ 386) ^ 73) ^ 875) ^ 823) ^ 385) ^ 35) ^ 681) ^ 237) ^ 354) ^ 226) ^ 915) ^ 874) ^ 324) ^ 4) ^ 883) ^ 651) ^ 271) ^ 322) ^ 719) ^ 70) ^ 880) ^ 207) ^ 36) ^ 22) ^ 335) ^ 963) ^ 641) ^ 845) ^ (-429930998)) {
                case -1716650806:
                    return;
                case -825356310:
                    mainActivity.doHideProgress();
                    str = "ۤ۠ۨۘۘۘۘۤۨۥۘۢۚۙۖ۬ۦۘ۟ۥۡۘۡۘۥۦۢ۠ۚۤ۟ۤۜۦۘۥۦۜۘۢۡۧۖۧۢۚ۟ۚۚ۬ۧۚۧۨۧۙۜۘۢۨۤۤۡۥۘۧ۫ۦۘۧۦۦۘۚ۟ۛۥۡۧۘۘۜۦۛۥ۠ۡۜۘۘۚۧۢۡۚ۫ۖۧۘ۠ۚۛۨۚۥۚۗ۟ۦۢۙۛ۟ۙۙۚۖۘۥۧ۬۠ۛۥۧ۫ۦۘۘۛۥۡۘ۬ۨۥۡۦۘۨۦ۟۬۬ۤۥۚۡۘ";
                    break;
                case 613725476:
                    str = "ۤۘۖۜۥۨۡۧۖۘۘۦۧۜۜۥۘ۟ۚ۠ۢۨۛ۫ۘۘۛ۫۟ۡۜۡۘۢ۟۠۠ۚۘۘۖۦۧۘۤۥ۫ۛۙ۠ۖ۠ۦۜ۫ۜۘۚۦۨۘۚۛۜۙۜۡۘۗ۫ۦۢۚۡ۠ۜۘۥۦۖ۠ۡ۫ۙۖۚۙۙۥۘۤۜۙۦۖۚۦۖۙ۫ۢۢ۟۫ۨۡۢۧ۟۠ۘ۬ۢ۟ۤ۟۫ۤۛۖ۫ۨۘ۠ۧ۬ۡۜۘۘۡۙ۬۠۟ۡۢۘ۫ۜ۬ۚۡۡۦۘ";
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$installGameWithObb$12(MainActivity mainActivity) {
        String str = "ۤۙۖۚۤ۬۠ۗۨۘ۠ۘۜۘۜۙۦۘۢۦۨ۠ۙۖ۫ۡۧۘۥۗۗۤۡۙۙۜۤۨۡۖۛۥۘۦۢۗۤ۫ۧۛۢ۟ۗۜۢ۫۫ۢۦۦ۫۠ۦۨۥۧۡۜۘۦ۠ۦ۫ۧۡۗۦۤ۟ۢۗۨۘۙۗۥۘۢۚۙۤۚۖۘۘ۟ۖۙۙ۟ۖۤۦۘۜۨۖۢۦۡۤۦۡ۬ۘۜۜۘۜۚۙۜۧۙۤۨۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 397) ^ 722) ^ 758) ^ 321) ^ 28) ^ 69) ^ StatusLine.HTTP_PERM_REDIRECT) ^ 441) ^ 722) ^ 811) ^ 694) ^ 384) ^ 278) ^ 321) ^ 930) ^ 850) ^ 24) ^ 748) ^ 397) ^ 172) ^ 112) ^ 655) ^ 299) ^ 896) ^ 512) ^ 48) ^ 804) ^ 133) ^ 99) ^ 870) ^ 753) ^ (-1261593246)) {
                case -396755121:
                    mainActivity.doShowProgress(true);
                    str = "ۤۤۦۙۖۜ۠ۥ۟ۧۨۘ۟ۡۦۘ۬ۖۖۨۨۨ۫ۘۨۘۚۨ۬ۛ۬ۡۘۚۤۦۘۗۥۗۗۜۡ۫ۛۥۦۥ۟ۢۥۘۥۗۗۢ۟ۜ۠۟ۨۛۙۘۡۦۢۙ۫ۘ۟۬ۖۘۡۧۖ۬ۤۧۖۜ۟ۤۛۗ۠ۗۚۨۧۘۢۜۧۢۡۨۘۛۘۨۘۨۗۤۡۗۨۘ۫ۨۖ";
                    break;
                case 247407199:
                    str = "ۖۘۡۗۨۖۙۤۛۖۦۢۥۧۘۘ۠ۦۜۘ۟ۥۖۖ۟ۘۘۢۡۧۘ۬ۚۤ۟ۘۘۢۛۗۤۢۘ۠ۤۡ۠ۖۥ۫۠ۢ۬ۛ۬ۥۜۢۜ۬ۙۛۗۙۙۤۤ۫ۡۥۘ۫ۘۥۛۘۨۘۗ۬ۦۘۜ۠ۛۨۤ۬ۙۙۚۘۢۤ۫ۗۤۙۜۨ۟ۤۙۜۡۘ۫ۤۧۛۡۙۖ۠ۜۜۤۢۥۨ۫۫ۡ۬ۜۛۨۡۥۛۧ۫ۡۤۦ۟ۥۘۨ۠ۢۡ";
                    break;
                case 1463180642:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$promptForObbDownload$16(AlertDialog alertDialog, MainActivity mainActivity, String str, String str2, String str3, View view) {
        String str4 = "ۘ۠ۧۗۛ۫ۧۖۜۤۢ۫۬ۦ۠ۜۨۙ۫ۨۘۙۘۙۤۘۤۡۨۖۜۤۛۦۖۥۜۚۛ۬ۚۦۘۨۗ۫۫ۜ۫ۚۡۙۛۛۡۛۡۥۢۖۗۙۥۖۘۘ۠ۦ۫ۡۙۨۗۢۖۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str4.hashCode() ^ 494) ^ 376) ^ 750) ^ 838) ^ 650) ^ 405) ^ 372) ^ 625) ^ 599) ^ 633) ^ 184) ^ PointerIconCompat.TYPE_GRAB) ^ 147) ^ 957) ^ 485) ^ 539) ^ 11) ^ 922) ^ 191) ^ 983) ^ 185) ^ 739) ^ 756) ^ 556) ^ 136) ^ 594) ^ 698) ^ 814) ^ 175) ^ 509) ^ 445) ^ (-908634525)) {
                case -1734966644:
                    str4 = "ۨ۬ۖۘۡۖۧۘۢۗۙ۠ۡۘ۫ۖۨۘۙۘۤ۫ۨ۫ۜۤۘۙۖۥۘ۬ۧ۫ۢ۟ۢ۠ۜۥۘ۬۫ۚۗۨۡۚ۠۬ۥ۬ۡۘۡۘۗۨۙۖۧۖۧۦۥۘۤۥۘۦۛۘۘۨۦ۠ۢۡۗۙ۬ۘۘ۟ۢۧۛۢۥۘۨ۫ۖۘۨۘ۬ۛ۫ۘۜۨۥ۟۫ۦۛۜۘۘۚۦۧ۟ۦۖۘ";
                    break;
                case -1662821340:
                    str4 = "ۜ۠ۡۘۦۖۢۥۙۨ۠ۖۘۜۙ۠ۡ۟ۚۧۚۡۢۦۙۜۘۗۦ۟ۚ۬ۚۖ۫ۥۖۦۧۨۤۛۦۙۥۘۜۨۢۛۤۤۦۗۢۗ۬ۢ۫ۛۥۘۜۘۦ۬ۘۘۗۧۦۘ۫ۚۧۨۜۧ۟۟ۙۙ۬ۘۘۗ۬ۙۨۡۜۘۡۤۥۘ";
                    break;
                case -411563675:
                    str4 = "۠ۚۨۗۙۗۜۧ۠۬ۤۛۤۘۦۘۛۛۦ۬ۖۖۚۘۜۘۦۜۦۘۙۜۨۘۖۘۧۦۖۘۦ۟ۡۘۛۢۥۘۨۙۘۧۤۨۘۛۘۛۡۚۖۘ۟ۙۖ۬ۧۡ۬ۙۙۛۡۧ۠ۡۥۘ۟ۘۗۤۥۧۘ۫ۗۥۘۛۖۨۖ۫ۥۡۨۨۙۧۡۘۤ۬ۘۘۨۖ۬ۙۙۘۘۖ۫ۖۢۗۡۗۜۘۧ۟ۤۦۧۘۢۡۨۢۜۘ۠ۦۡۘۥۛۖۘۤۥۨۘۤۦۡۘۙۤۜ";
                    break;
                case -14882349:
                    str4 = "ۧۙۘ۠ۦۧۘۘۘۜۦۘۥۘ۫ۛۢۖۤ۫ۜ۠ۨۨ۬ۤۧۚۘۘۨۗۜۖۧۗۤۧۤ۫۬ۧۖۚۡۘۢ۟ۗۙۤۛۥۡۙۤۖۖۘۡ۬ۨۘۤۛۜۘۗۘۨۦۧۨۘۢۢ۠۟ۧۨۤۛ۫";
                    break;
                case 282719695:
                    mainActivity.startObbDownload(str, str2, str3);
                    str4 = "ۚۧۡۦۧ۫۫ۖۚ۫ۦۘۛۚۘۦۛۛۚۡۖ۠ۥۥۖۧۦۘۤۤۦۖ۟ۖۦۖۡۘۧۧۨۥۖۘۘۙۖۧۖ۫ۛۤ۟ۡۢۗۘۚۜۛۗۨۙ۫ۢۜۘۨۙۗۢۗۙ۬۬ۜۖ۟ۡۙ۠ۥۘۚۜۨۗۡۡۘ۫۫۠ۡۘۖ۬۬ۥۡ۟ۤۧۡۘۥۙ۠ۗ۫ۦ";
                    break;
                case 733094583:
                    str4 = "ۧۤۦۖۡۘۤ۫ۖۘۤۨۤۦۤۜ۬۠ۛ۫۬ۡۘۜ۟ۥۘۗ۬ۖۘۢۥۧۘۖۛۖۘ۬ۤۡۘ۟ۦۡۘۖۛ۫ۤۚۘۘ۬۟۫ۜۤۦۘۘ۫۫ۤۢۤۤۖۙۛۛۥۘ۟ۢۨۢۚۦۘۧۡۖۘۧۦۖۘ۟ۡ۬ۧۙۛۨۢۥۘۜۥۥۥۚ۬۠ۨۘ۠ۢۤۙۡۚۖۘۛۜۖۛ";
                    break;
                case 1109533353:
                    str4 = "۠ۡۢۜۨۥۘۨ۠ۥۗۡۨ۟ۗۖۘۥ۟۬ۥ۬ۥۘ۬ۙۧ۠ۙۡۘۙۥۨۘۦۦۨۘۙۜۡۙۡۜۘۖ۠۠ۥۥۙۗۙۜۥۘۗۡۛۡۢۨۖۛۖۘ۬۫ۘ۬ۚۦۘ۟ۘۦۘۤ۠ۗ۠ۦۗۥۧۤۙۖۧۘۖ۠ۧ۠ۜۘۜۤۨ۬۬ۨ۬۠ۖۘۧۨ۟ۥۘ۟ۗۦۥۧۘۤۧۧۡۚۛ۬ۘۜۘۤۦۢۥ۫ۨۤ۬ۚ۟۬۟ۡ۠ۘۘۛ۠ۨ";
                    break;
                case 1599197973:
                    return;
                case 1871246230:
                    alertDialog.dismiss();
                    str4 = "ۢۙۨۘۢۙۡۘ۬ۚۢۦۨۖ۠ۦۘۧۦۘۘ۬ۥۙۛ۠۬ۙ۬ۚۡ۬ۜۘۙۗۧۡۙۥۜۜۡ۠ۢۨۘ۠۬ۜۘۦۧ۫ۗۜۛۦۖۘۘۨ۠ۘۙۤۥۘۦۧۖۘۘ۠ۜۘ۠ۦ۫ۡۢۙۘ۟ۢ۫۫ۛۦۖۘۚۡۙۥۗۚۧۧۖ";
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$setupGameButton$4(AlertDialog alertDialog, View view) {
        String str = "ۗۦۡۘ۫ۙ۬۠ۥ۟ۦۙۢۚۚ۬ۨۚۖ۬ۦۥۙۥۨۢۗۗ۟۫۠ۡۤۧۢۚۡۧۥۛۙ۬ۥۨۙۢۙۚ۟ۨۘۘۤۥۦۥۤۘۦۛۥۜۢ۬۬ۦ۬ۖ۫ۚۢۢۢۤۚۥۘۨ۫۟ۙۦ۬۫ۘۥۘۜۗ۟ۢۗۗ۬۟ۚۛۙۨۘۛۖ۬ۜۗۦۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 169) ^ 752) ^ 151) ^ 907) ^ 467) ^ 853) ^ 690) ^ 296) ^ 58) ^ 680) ^ 120) ^ 402) ^ 37) ^ 174) ^ 655) ^ 289) ^ 904) ^ PointerIconCompat.TYPE_GRABBING) ^ 962) ^ FileUtils.FileMode.MODE_755) ^ 39) ^ 783) ^ 312) ^ 592) ^ 756) ^ 925) ^ 579) ^ PointerIconCompat.TYPE_VERTICAL_TEXT) ^ 117) ^ 451) ^ 620) ^ (-204292132)) {
                case -1353809668:
                    str = "ۜۢۗ۟ۦۢۨ۫ۘۗ۬ۖۚۥۘۦۜۡۘۚ۠ۡۘۜ۬ۚۥۜۘۙۥۨۗۜ۟ۜۛۛۙۧۡۙۖ۟ۨۘۥۧۜۚۘۚۡۧۜۗ۫ۛۦۘۧ۟ۛ۬ۨۗۦۜۗۥ۬ۡۖۛۛۥۨۥۜۛۨ۬ۦۗ۟۬۬ۡۨۧۙۖۚ۟ۥۗۤۧ۫۟ۚۧۥۘۢۘۧۘۙۜۜۤۚۘۦۥ۠ۡۛۘۘۙ۫ۥۨۖۢۢۘۜۘ۟ۗۘۘۚ۟ۖۘ۫ۗۜ";
                    break;
                case 616365304:
                    alertDialog.dismiss();
                    str = "ۖۨ۟ۚۖ۫۬ۧۘ۫ۛ۠ۥ۟ۛۛۢ۠ۗ۟۟ۡۜۖ۟ۙۗۘۖۘۘۥۛۛۢۛۘ۬ۙۢۜۨۦۧۖۤۙۤ۠ۜۛۘۘۥۛ۬ۚ۠ۜۘۘۦۖ۠ۤۘۨ۠ۜۘۥۡۨ۠ۨۛۙ۫ۗۧ۬ۘۘ۫ۥۘۘۡۥ۠ۢ۠ۡ۟ۛۢۦۘۨۖۥۖۘۧۘۘۥۡۛ۟۟ۗۥۗۡۗ۫ۦۦۖۚ۫ۘۘۨۤۘۖ۟ۡۘ۟ۘۖۙۖۘۘۡۘۧۤ۬ۛ";
                    break;
                case 824600716:
                    return;
                case 1417763033:
                    str = "ۥۧۥ۫ۡۧۘۖۘۨۛۦۚۙۚۨۖۛۙۢۥۗۚۨۡۜۙۖ۟ۡۘۙۜۗۢۛۨۢ۫ۤۨۧۘۚ۠۟ۥۜۚ۟۬ۥ۬۬۟ۦۡۗۛۜۤۙۙۥۤۡۤۦۘۤۤۨۗ۫";
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$showDownloadCompleteDialog$17(AlertDialog alertDialog, View view) {
        String str = "ۘۘۚۤۙۧ۠ۛۡۘ۬ۢ۟۟ۜۛۗۖۥۘۢۘۚۡۖۥۛۖ۠ۙ۟ۡۢۤۢۥۥۛۘۘۧۦۦۘۨۡۥۙ۬ۦۜۜۚۗۛۘۘۖۙۨۘۙۛۦۦۖۜۘۦۥۘۘۖۗۢۘۘۖۘۧۚۥۘۛ۠ۚۗۗۘ۟ۡۚۛۡۜ۫ۡۚۖۗۜۘ۫ۢۦۦ۟۟۟ۜۙۧۖۙۢۡۨ۫ۦۡۙۛ۫ۧ۠ۘۘۙۛ۟۬ۜ۬ۡۦۘۙۖۦۙۖۥۘۡۖۖۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 136) ^ 97) ^ 943) ^ 998) ^ 197) ^ 409) ^ 228) ^ 412) ^ 475) ^ PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW) ^ 933) ^ 399) ^ 384) ^ 806) ^ 317) ^ 591) ^ 911) ^ 26) ^ 896) ^ 909) ^ 799) ^ 93) ^ 437) ^ 833) ^ 164) ^ 480) ^ 772) ^ 256) ^ 30) ^ 623) ^ 127) ^ 982399521) {
                case -2004393457:
                    alertDialog.dismiss();
                    str = "ۚۛۥۘ۠ۘۗ۬ۜۚۧۦۥۨۗۦۘ۬ۦۦۧۚۥۘۙۥۤۗ۬ۦۗۘ۠ۧۥۤۙۚۤۢ۠۬ۗۥۖۘۖۨۥ۫ۨۡ۬ۤ۬ۨۨۘ۠ۚۜۜۙۘۘۦۛۡۤۜۜۘۡۥۥۚۙۢ۠ۛۡۘۖۧۡۘ۫ۨۜ۟ۚۡ۫۬ۜۘ۬ۛۤۙۧ۟ۗۢۗۛۥۡۘ۬ۧۨۘ۠۟ۙۢ۠ۜۘۖۢۡۦۦۜۘ۟ۦۥۘ۠۟ۧۗۦ۠ۨۖۡۗ۟۬۟ۢ۠";
                    break;
                case -1365468078:
                    return;
                case -1014329608:
                    str = "ۢ۬ۖۥ۠ۖۗۧ۠ۡۛۦۘۧ۫۟ۢۖۥۗۡۙۦۙۘۡۥۖۙ۬ۡ۬۟ۨ۟ۛ۫ۢۗۘۘۢۦۨ۫ۢۥۡۧۛۡۥۧۘۖ۟ۚۨۛۦۘۡ۠۟ۚۙ۬ۥۘۘۡۘۨۘ۫ۙۨ۠ۛۙۤۜ۟ۢۡۘۘ۠ۘۚۡۙۛۘۧۤۢۙۛۘ۟ۥۘۢ۫ۖۘۢۗ۠ۜ۠۫";
                    break;
                case 355753463:
                    str = "ۗۚۖۜۜ۟ۚۨۧۨۧۥۤ۟۫ۨۤۢۖۦۜۖۘۜ۫ۜ۟۬ۡۧۘۥۚۥۘۡۤ۬۟ۨ۫ۜۘۡ۫ۦ۬ۡ۬۫ۖۛۘۘۤ۫ۦ۬ۡۚۥ۬۬۫ۦۦۦۘۜۥۖۘۛۥۖۘۜۖۢۖۘۙ۬ۗۘۘۜ۟ۖۘ۠ۥۧۦۥۢ";
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$showStyledDialog$19(AlertDialog alertDialog, View view) {
        String str = "ۘۛۥۘۨۤۦۘۧۘۡۘۦ۠ۥۤۤۥۘۧ۫۬۫ۛ۬۠۟ۧۗۨۨۨۢۛۨ۟ۨۗ۬ۜۗۘۘۨۙ۠۫ۖۡۘۖۨۛۧۖۜۥۛ۟۬ۤۡۘۖۗۖۘ۬ۨۦۘۡ۠ۥ۠ۜ۟ۤ۫ۗ۟ۦ۠ۘ۬ۨۡۜۜۜۙۨ۫۟ۡ۫ۙۘۖۤۙۜ۫ۤۗۜۡۧۤۨۘ۟ۗۨۙۖۜۨۛۨۧۚۖۘۥۜۦۛۜۜۡ۬ۢۨۛ۬ۚۖۧۘ۠ۦۚ۟۟";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 89) ^ 450) ^ 42) ^ 902) ^ 490) ^ 438) ^ 410) ^ 426) ^ 705) ^ 369) ^ 845) ^ 651) ^ 42) ^ 905) ^ 561) ^ 335) ^ 610) ^ 491) ^ 549) ^ 359) ^ 862) ^ 845) ^ 854) ^ 773) ^ 874) ^ 201) ^ 609) ^ 696) ^ 388) ^ 7) ^ 274) ^ 1384180760) {
                case -1373358729:
                    return;
                case -904270056:
                    str = "ۧۙۘۘۙۚۢ۬ۡۛۙ۠ۥۖۦۖۘ۫ۢۛ۫ۜ۬ۨ۫ۘۘۜۙۘۘ۬ۖ۬ۘ۠ۦۚ۠ۘۜۜۖۘۨۨۧۘۚۦۙۗۙۦۖۨۡۘۥۦۤۦۚۘ۫ۘۦ۬ۖ۬ۖۙۙۨ۠ۨۘ۟۠ۡۖ";
                    break;
                case -538012327:
                    str = "ۤۜۛۖۡۖۧۚۨۘ۬ۚۗ۬ۨۨۚۚۡۘۗۧۖۘۢۨۗۗۘۨۖ۠ۘۦۧۥۤۖۘۜۡۥۜۢ۬ۡۨۛ۫۟ۘۚ۬ۖ۟ۜۙۤ۫۬ۘۜۨۘۢۚۜۘۜۘۧ۬ۗۖۗۘۘ۫۫ۥۘۛۤ۬ۛۘۙۤۡۥۘۛ۠ۚ۟ۢۢ۬ۡۜۘۢ۬ۦ۬ۙۖۤۘۤۥۢۛ۫ۦۧۤۛۨۘۨ۟ۥۘۜۤ۟ۘۢۡ";
                    break;
                case 976811769:
                    alertDialog.dismiss();
                    str = "ۤۘۘۗۨ۬ۡۗۡۧ۬۫ۚۥۜ۫ۙۡۖۡۨۚ۟ۙۘۤۖۘۦ۠ۚ۫ۖۜ۫ۨۘۘۚۚۢ۬ۜۘۨۛ۬ۢۥ۠ۘۤ۬ۙۖۖۦۚ۫ۡۥۛۙۥۖ۫ۡۘۚۧۡۚۗ۠ۘۡۦۘ۬ۤۦۘ۟ۨۖۘۘۡۧۧۨۜۥۦۚۜۙۘۖۖۨ۟ۢۨۘۛۜۢۥۗۗ";
                    break;
            }
        }
    }

    private void promptForObbDownload(final MainActivity mainActivity, final String str, final String str2, final String str3) {
        LinearLayout linearLayout = null;
        GradientDrawable gradientDrawable = null;
        TextView textView = null;
        TextView textView2 = null;
        LinearLayout.LayoutParams layoutParams = null;
        final AlertDialog alertDialog = null;
        String str4 = "۬ۘۛۤۗۥۘۢ۟ۡۘۙۗۡۙۜۨۗ۟ۨۜۘۡۜۨۘۨۥۜۘۘۨۙ۬ۙ۬۬۫ۧ۬ۧۢۦۢۢۧۚۜۙۧۧۜۗۨۘۛ۫ۡ۠۫ۙۖۙۖ۬۬ۖۦۡۢۧۗۢ۟ۢۘۘۚۧۦۛۥۗ۟۫ۥۘ۫ۦۜۜۤۘۘۜۥۖ";
        Button button = null;
        Button button2 = null;
        LinearLayout linearLayout2 = null;
        AlertDialog.Builder builder = null;
        while (true) {
            switch ((((((((((((((((((((((((((((((((str4.hashCode() ^ 16) ^ 259) ^ 335) ^ 677) ^ 927) ^ 775) ^ 219) ^ 27) ^ 391) ^ 799) ^ 340) ^ 388) ^ 703) ^ 530) ^ 222) ^ 632) ^ 49) ^ 618) ^ 150) ^ 759) ^ 965) ^ 1) ^ 650) ^ 116) ^ 828) ^ 997) ^ 283) ^ 519) ^ 365) ^ 605) ^ 548) ^ (-1337053321)) {
                case -1944129122:
                    return;
                case -1925780713:
                    textView2.setTextSize(16.0f);
                    str4 = "۟۠ۜۘۢ۫ۡۘۥۦ۠ۘۘۜۡۘۖۖۙۡۘ۬ۧ۠ۙۜۘۤ۫ۥۡۜ۠ۛۛۡۛۢۨۖۥۥۦ۬ۚۡۘ۫ۤۜ۬۬۬ۢ۟ۜۘۡۚۥۙۛۨۚۨۡ۠ۜۤۘۤ۫ۤۛۡۦۙۛ۟ۘۘۘۜۙۥۘۦۗۨۛۜۚ۠۠۟";
                    break;
                case -1853408375:
                    textView2.setText(getString(C0931R.string.str00cb));
                    str4 = "ۨ۫ۨۘۤۨۥۘۛۧۡۘۚۤۙۤۙۜۖۤ۫ۤۖۦۘ۫۫ۧۖۜۘۤۧۧۙۙ۟۬ۨۖ۟ۢۦۜۛۗۗۡۘ۟ۧ۟ۨۦۢۨۚۗۡۧۨۘۢۢۛۛ۟ۗۛ۠ۡۤۡۘۤۧۢۜۛۦۜ۠۬ۧ۟ۜۘۦۖۖۚۤۥۘۤۙ۫۫ۙۛۤ۠ۡۖ۠ۧ۟ۤۢۛ۬ۘۘۘ۫۟ۗۛۛۘ۟ۖ۠۫ۙۛۘۨۘ";
                    break;
                case -1796770887:
                    button2.setText(getString(C0931R.string.str009a));
                    str4 = "ۤ۬ۦۘۘ۫ۦۜۘۘۘۨۜۘۚۙۘۘۚ۬ۨۘۡۦۨ۫ۜۜۡ۬ۗۛۦۡ۬ۛۦۘۛۦۖ۫۠۟ۢۗۛۧۖۘۛۗۨۢۛۛۚۦۨۘۦ۫ۥۘۢۗۚ۫ۤۥۘ۫۬۟ۧۡ۫ۛۘۢۦۙۢ۬۠ۚۨۡ۟ۛۤۨۖۨۨۖۨ";
                    break;
                case -1603279058:
                    gradientDrawable.setColor(-1);
                    str4 = "ۚۖۜۘ۟ۢۡۘۢۖۗۨۦۥ۟۠ۜۦۢ۠ۗۗۡۘۢ۫ۚ۬۟ۨۜۢۚۜ۫ۖۘۗۦۧۦۢۡۘۨۦۜۗۖ۠ۦۢ۫ۘ۠ۤۧ۫ۨۘۚۜۘۜۚۛۥۢ۟ۚۥ۠۬ۤۜۘ۫ۙۜۘ۠ۜۨۘۖ۬۬ۢۥۥۘۡۜ۟ۜ۫ۜۘۤۗۦ";
                    break;
                case -1507784783:
                    builder.setView(linearLayout);
                    str4 = "ۙۡۥۧۙۗ۬ۙۥ۠ۤۖ۬ۤ۟۫ۚۡۘ۟۫ۘۧۤۡۘۥۖ۫ۘۚۥۤۦۘۚ۟ۤۨۡۧۘۙۦ۬۬ۥۜۘۖۤ۬ۙ۠ۜۗۨۛۥۥۗۨۜۧۚۛ۠ۘۥۧۖۨۙۜۙۜۡۥۨۨۧۥ۟ۡۘۤۡۜۨۗۜۘۘۘۧۘۙۢۦ۠ۤۜۙۥۛۛۗۚ۬ۧۖۘ";
                    break;
                case -1455632040:
                    str4 = "ۢۢۧۦ۫ۡۘۦۚۦۘۗۚۜۜۦۥۜۗۖۢۜۜ۟ۨۢۧۧۙۢۡۛۤۜۘۤۥۦۘۛۜۦۨ۟ۤ۫ۨۥۘۦۨۧۘۜۜۥۘۚۡۥۨۜۜۘ۟ۖۦۤۘۙۨۖۚۧۙۦۘۜ۟ۜ۫ۛۙۗۛۨۘۖۤ۠ۡ۬ۢۤۜۡۘۢ۟ۘۘ۬ۨۛۘ۟ۡۨ۟ۘۖ۫ۧۢ۫ۖۦۥۘۗۢۡۘۜۜۤۘۤۚۖۘۖۘۧۤۘۘۧۙۘۘۚۙۥۡۚۜۧۜۛ";
                    break;
                case -1298168402:
                    button.setText(getString(C0931R.string.str0010));
                    str4 = "ۦۜۜۥۡۦۦ۬ۘۛۦۖۘۖۘۥۛۙۘۙۜۖۘۘۨ۫۠ۦۙۧۥۨۖۡۥۗۤۚۖۧۡ۫ۥۨ۠ۧۜۥۦۦۦۘۘۧۗۨ۠۫ۘۤ۫ۨۗۦ۫۫ۢۚۥۧۘۘۚۘۘۘ۫۬۬ۦۙ۠ۢۛۜۘۖۚۜۘۗۢۦ۬ۘۘۘۖۚۧۚۛۧ۠ۜۙۢۢ۫ۡ";
                    break;
                case -1168193524:
                    linearLayout2.addView(button2);
                    str4 = "۬ۙ۫۟ۚۚۡۤ۫ۛۛۨ۬ۗ۠۟ۡۘ۠ۥۨۢۛۖۘۘۘۗۦ۫ۥۘۥۜۡۘۙۦۛۧۦۗۙۡۢۜ۟ۜۘۢۜۥۘۗۗۥۘ۟۠ۧ۬۟۫۠ۖۤۤۖۥ۫۠ۜ۠ۦۡۜۤۦۖۘۖ";
                    break;
                case -1156101922:
                    linearLayout.setPadding(m79dp(mainActivity, 20), m79dp(mainActivity, 20), m79dp(mainActivity, 20), m79dp(mainActivity, 10));
                    str4 = "ۢۡۨۘ۫ۚۖۘۢۧ۟۠۟ۜۘۧۛۡۘ۬۫ۙۥۢۦۘۥۡۤۧ۠۫ۨۙۦۡۘۡ۠۫ۜۜۢۨۘ۬۟ۖۘۘۗۗۙۡۗ۟ۦ۟ۛۚۧۧۚۖ۟۬ۦۧۗۨۙۘۘ۫ۢۧۥۛۙۧۢۨۥۘۥۢۨۗۡۘۦ۫ۥ۠ۡۡۘۚۚ۫ۖۦۛۖ۬ۘۘۗۖ۫ۥۚۙ";
                    break;
                case -974107972:
                    str4 = "ۧ۟ۗ۠ۤۜۥۙۧۡۛۢۢۢۧۛ۟ۜۡۤۨۘۖۤۖۘۡۢۘۦۙۦۘۧۗ۠ۨۘۦۘ۟ۗۜۜۘۨۡۤ۬ۧۜۧ۬ۦۗۡۦۘ۬ۡۙۢۨۛۦۖۜۜ۬۬ۛۜۘۘ۫ۧۦۘۖۖۙۧۚۚ۬۬ۜۥۧ۟ۜۨۘۘ۠ۚۙۤۢۜ۫ۜۢۖۤۘ۬ۙۘۘۨۡۢۡ۬۠ۜۡۛۜ۠ۤۛ۠ۘۘ۟۟ۤ۫۬ۜۘۖۡۛۧۢ۟ۜۙۛۖۚ";
                    textView = new TextView(mainActivity);
                    break;
                case -924175314:
                    str4 = "ۧۤۧۤ۟ۡۘ۬ۢۢۛۙۗۧۡ۬ۢۗۥۘۙۜۧۨ۠ۦۘۖۗۘۥ۠ۡۘۜۜ۟ۚۧۥ۠ۛۤۛ۟ۘۡۨۘۚ۫ۙۜۥۘ۠ۨۛۨۦۗ۟ۗۡۘۙۦۨۘ۟ۖۜۘۖۖۜۙ۟۫ۙۢۜ۟ۗۡۚۡۘۖۗۦۘۗۡۘۤ۠ۚۙۨۘۙۜۢ۬۬ۢ۠ۜۗۢۢۢۥۥۤۧۡ۬ۜۖۤۚۡۡۧۢۧۛۘۡۘۦۗۙۗۧ۟ۦۤۜ۬";
                    break;
                case -903702509:
                    str4 = "ۗۥۖۗۜۤۦۤۥۘۢۨۢۛۚۛۤ۬ۦۘۖۧۡۘۤ۬ۨۡۨ۟ۚ۟ۗۛۢۜۘۡۧۨۘۨ۫ۦۥۙۡ۬ۤۚۗۧۙ۠ۢۢۧۜۡ۟ۢۥۛۗۦۘ۟ۛۜ۠ۘ۬ۢۘۨۘ۬۠۬ۙۦۖۘۗ۟ۛۨ۬۬ۜۤۡۘۧ۠ۜۘۗۜۨۘۚۜۦۗۖۖۘۦ۫ۦۘۢ۟ۡۤۢ۠";
                    linearLayout2 = new LinearLayout(mainActivity);
                    break;
                case -901608067:
                    linearLayout2.setOrientation(0);
                    str4 = "۟ۚۖۘۜۡۘ۬ۥۧۡۢۥۘۘ۟ۡۦ۬ۨۦۗۨۘۥۛۦ۟ۜۧۘۢۤ۬ۜۧۘ۟۫ۙۡۛۢۖۛۘۖۙۦۘۙۡۚۦۖۘۤۡۘۘۗ۬ۥۛۢۥۘۙۖۦۖۗۨۘۧۛ۬ۤۦۘۘۨ۟ۘۘۖۥ۬۬ۦۡۖۡۚۗۖۦ۠ۜۙۡۙۡۘۤ۫ۡۤۗۨۚۦۤۡۤ";
                    break;
                case -760642489:
                    linearLayout.setOrientation(1);
                    str4 = "ۜ۠ۘۘۗۘۦ۠ۧۡۘۨۛۢۧ۠ۗۧ۟ۢ۫۠ۘۧۨ۠ۚ۫ۜ۟۫ۙۘۗۦۘۦۦۜۤۙۖۨۤۢۙ۫ۢۜ۬ۦۘۦ۬ۥۘۤۧۢۤ۬۟۫ۘ۫ۖۙ۠ۚۜۥۘۡۦۨ۠ۦۦۜۦۗۘۚۦۢۖۘۤۛ۫ۨۗۨۨ۫ۜۘۧۡ۫۫۫ۜۨۢۥۜۙۜ۠ۘۤ";
                    break;
                case -658586739:
                    button.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                    str4 = "۫ۚۥۚۡۨۤ۠ۦۧ۠ۜۘۡ۠۟ۤ۠ۨۖۜۜۘۢۜۥۙ۬ۥ۬ۜۖۗۘۨ۬ۦۢ۫۬ۚ۟۬ۥۚۖۦ۬ۜۨ۫ۧ۫ۡۘۖۧۘۘۥۖۖۘۧۘ۬ۢۦۤۛۘ۠ۡ۬ۦۘۥۛۚ";
                    break;
                case -625812219:
                    alertDialog = builder.create();
                    str4 = "ۨۢۡۘۘۧۙۙۙۦۘۧۘۘ۬ۛۧۢۤۘۘۘۦۜۘۖۙۥۤۗۛۜۥۧۘۚۢۜۘ۠۟ۡۗ۠ۖۘۘۡۜۢ۟ۘۘۜۥۜۚۡۧۘۚ۫ۤۛۖۘۡۙ۫۫ۤۤۤۥۚۛۤۡۤۧۥۘ۫۠ۨۘ";
                    break;
                case -570218556:
                    textView2.setLayoutParams(layoutParams);
                    str4 = "ۧۘۦۙۖۙۚۢۖۘۚۖۘۘۗۡۧۘۨۨ۠ۥۥ۬ۚۖ۬ۘۗۖ۟ۢ۠۫۫ۜ۫ۨۥۘۢۛۘۘۜۜۘۙۘۤۙۥۨۗۧۦۚ۫ۘۘ۟۫۫ۘۤۘۘۛۤۡ۟ۡۙۢۘۘۧۥ۫ۥۡۦۤۨۘۡۙۦۚ۫ۛۢۧۨۤ۟۬ۗ۟ۘۘ۟ۥۘ۠ۛۚۘۙۧۤۜۡۘ";
                    break;
                case -546179289:
                    linearLayout2.setGravity(GravityCompat.END);
                    str4 = "ۜۙ۫ۙۢۦۨۙۖۚۛۧۘۘ۟۠ۡ۫ۛ۟ۨ۟ۖۘۨۚۜۘۢ۬۟۟۬ۡۘ۠ۘ۬۬ۥ۟ۗۤۨۘۛۤۨۘۢ۫ۖۘۨ۫ۚ۬۠۫۫ۜۜۘۡۘۙ۫۬ۗۗۨۧۚۙۙۘۡۥۛ۫۬۟ۗۨۜۤۗۚۘ۫۬ۧۙ۬ۦۗۗۘۘ۠ۧۨۘۘۥۡۦۦۢۢ۟ۢۜۗۢۛۤۧ۟ۨۢۚۨۥۘۨۗۧ";
                    break;
                case -485222615:
                    str4 = "ۢۜۖۦۥۗۛۦۜ۫ۚ۟۟ۛۥۘۘ۟۠ۧۧۙ۟ۖۚۖۖۥۚۜۨ۫۟ۜ۫۠ۖۘۧ۠ۤ۟ۜ۬ۖۦۚۗۗ۫۟ۢۗۧۖۘ۬۟ۘۥۘۗ۬ۜ۫ۜۘۤ۟ۥۜۘۡۖۤ۫ۙۦ۫ۥۚۨۢۥۘۦۧۡۘ۬ۜۜۘ۠ۢۖۘۦۖۜۘۨۡۧ۠ۤۘۗۡۧ۫ۥۘۗ۬ۨۘۥۤۙ۬۟ۤ۠ۢۛۘ۬۫ۧۧ۬۠۫ۜۡۜۘۚۚۗ۬ۙۡ";
                    break;
                case -437940521:
                    str4 = "۟ۚۨۘۦۙۘۘۛۗ۫ۛۜ۬ۘۘۘۥۙۘۜۙۨ۫ۜۖۘ۠ۨ۬ۤۦۜۥۤ۟ۙۢۨۘ۟ۚۦۘۧۧۘۘ۬ۧۙۘۥ۟ۜۡۜۨۛۙۗۜۖۚۨۘ۬۟ۦۤۜۢ۠ۡۡ۬ۢۡ۬ۦ۟۬ۨ۟ۡۘۡۢ۫ۥ۫۫ۤ۫ۢ۫۠۠ۗۢۖۡۘۥ۫ۛۥۙۙ۟۟ۡۘ۠ۙۚۢۜۦۘۗ۠ۢۤۛۘۘۨۧۥ";
                    layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    break;
                case -330044510:
                    str4 = "ۛۦۗۥۦۘۤۜۥۦ۠ۜ۫ۛ۫ۢۥۖۛۖۘۜۜ۠ۧۡۘۜۧۢ۫ۦۖۘۧۗۨۜۛۦۙۚۨۨۖۘۤۡۙۛ۫ۡۘ۫۫ۦۢ۬ۦۘۡۤۛۧ۠ۨۙۖ۠ۙۡۜۛۚۖۘ۬ۡۡۘۨۚۥۘۘۙۖ۫ۦۚۜۨۜۘۗۚۨۘۛۙۜۢۥۘۗۦۦۘۙ۫ۤۧۘ";
                    button = new Button(mainActivity, null, 16843563);
                    break;
                case -299117716:
                    gradientDrawable.setCornerRadius(m79dp(mainActivity, 8));
                    str4 = "ۦۤۡۖۢۖۘۢۤۚۧۜۧۗ۟ۙۤ۟ۜ۫ۛۡۧۧۨۘۦۢۙۘ۬ۖۘۘ۫ۧۦۧۤ۟ۧۜ۠ۨۨۡۥۨۜۦۘۛۗۜۘ۬ۘۜۘۧۙۥۘ۟ۡۨۜۦ۬ۚۧۧ۫ۜۜۛ۠ۚۜۤۨۘۛۛۗ۠۠ۨۧۖۡۧۚۘۘۦۙۥۘۥۦۡ۫ۚۛۘۧۥۦ۫ۨۘۧ۟ۧۡۙۥۘۥۡۨۚۥۨۘۖۢۡۘ۠ۙۘۘۢۢۢ۟ۗۦۘۦۜ۬ۧۖۗۢۘۖۘ";
                    break;
                case -265734496:
                    linearLayout.addView(linearLayout2);
                    str4 = "ۛ۟۟ۚۤۚۛۛۗۛۚۡۘ۬ۥۤۥۤۡ۬ۚۚۛۚۙ۬ۢۜۘۗۖۦۢۨۡۗۖۜۢۨۡۚۨۘۘ۫ۚۖۘۥ۠ۜۘۘۜۡۘۨۢۥۗۢۡ۫ۨۙۡۜۗ۬ۦۤۧۥۚۧ۠ۜۘۗۘۥۗۙۘۙۗۘۘۚۤۖۢۘۤ۬ۛۗۗ۬ۥ۟۫ۗۗ۫ۧۢۙ۫۟ۖۜۘ";
                    break;
                case -223798056:
                    button2.setOnClickListener(new View.OnClickListener(this, alertDialog, mainActivity) { // from class: kentos.loader.activity.MainActivity$$ExternalSyntheticLambda5
                        public final MainActivity f$0;
                        public final AlertDialog f$1;
                        public final MainActivity f$2;

                        {
                            this.f$0 = this;
                            this.f$1 = alertDialog;
                            this.f$2 = mainActivity;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            String str5 = "ۥۙۤۤۥۦۘۛۤۖ۟۬ۚۢ۫ۜۘۡۖۖۜۜ۬ۚۧۗۧ۠۬۠ۘۨۘۦۨۦ۟ۦۦۜ۠ۙۜۘۙ۠ۖۘۗۤ۬ۧۢۦۘ۠۠ۜۙۗۙۙۜۖۨ۟ۡۘۜۙۢ۟ۥۘۙۜۦۘ۠ۤۘۡۨۥۦۤۘۘۗ۠ۘ۟ۧ۠ۛ۬ۤۘۧۢۧۖۧ۠ۨۛۥۧۥۘۚۢ۫ۛۘۜۘۚۥ۠ۘۧ۠۫۫ۨۘۢ۠";
                            while (true) {
                                switch ((((((((((((((((((((((((((((((((str5.hashCode() ^ 829) ^ 557) ^ 33) ^ 442) ^ 724) ^ 953) ^ 289) ^ 50) ^ 399) ^ 606) ^ 312) ^ 386) ^ 162) ^ 955) ^ 907) ^ 186) ^ 803) ^ 246) ^ 107) ^ 964) ^ 51) ^ 739) ^ 716) ^ 896) ^ 487) ^ 370) ^ 529) ^ 328) ^ 745) ^ 916) ^ 731) ^ (-577347576)) {
                                    case -1023275696:
                                        return;
                                    case -573506720:
                                        str5 = "۫ۘ۬۟ۙۢۛۖۛۨۧۧۜۜۡۘ۫ۘۥۘۘۘۥۦۙۧۨۧۘۜۧۧ۬ۘۢۛۖۜۘۡۡۥۘۨۙۜۘۚۚۘۙ۫ۜۤۖۛۚ۟ۦۢۦۦۛۧۡۘ۠ۧ۬۟ۘۧۘۢ۬ۦۦۧۚۡۡ۬ۢ۫ۥ۟ۤۨۗۖۢۛۨ۫ۧ۟ۗۡۡۨۢ۟ۙۜۨۧۜۘۥۧۡ";
                                        break;
                                    case -160717639:
                                        this.f$0.m78x567030ea(this.f$1, this.f$2, view);
                                        str5 = "ۜۡۤۧ۫۫ۡ۬ۚ۠ۗۨۘۖۢۜۦ۬ۦۘۧ۟۬ۘۖ۟ۥۦ۟ۗۨۦ۟ۥ۟ۘۤۖ۫ۡۜۢۖۗۛ۫ۙ۟۫۠ۧۛۚۚۨۨۘۜۢۥۘۦۖۘۧۙۛ۟ۤۨۘۗۤ۫ۜۚ۫ۛۧ۬۬ۛۧۗۥۡۚۛ۠ۛۡ۫۠ۖۙ۫۬ۡۜۡۘۘۢۜۘۡۦۘۚۛ۠۫ۗ۟ۥۧۥ۬ۤۗ۠۠ۧۥۤۥۘۧۢۛۡ۟ۨ۫ۗۗۦ۟ۧ۫";
                                        break;
                                    case 1185958275:
                                        str5 = "ۘۥ۟ۛ۬۬ۥۗۙ۬۫ۥۧۤۗۨۤۨۘۢۥۗ۫ۤ۫ۖۜ۟ۙۦ۟ۜۚۨۗۙۧۨۡۜۙۦۜ۠۫ۢۜۢۡۛۚۚۧۜۘۙۥۤۦۦۨۡۧۘ۬۫ۢۛۧۨۤۖۤۡۢ۫";
                                        break;
                                }
                            }
                        }
                    });
                    str4 = "۠۬ۗۜۡۢۤ۟ۥۦۢۥۡۨ۠ۗۛۦۚۛۡۘۗۧ۟ۖۥ۫ۖۘۦۚۖۘۖۗۜۥۢۛۢ۟ۖۘۙ۬۬ۚۘۖۘۚۤ۟ۨۨۗۜۡۘ۬ۡ۫ۛۘۡۘۖۧۤۙ۫ۘۘۗۨ۟ۥۥۧۦ۬ۡۡۚۡۘۗۢۗۥۦۡۘ۫ۥۜ";
                    break;
                case -156809123:
                    alertDialog.show();
                    str4 = "ۦۖۜۚ۬ۖ۬ۛۥۘۛۧۗۜۤۜ۬ۥۦۤۘۘۤۨۙۜۗۧۡۤۡۖۦۚۜۧۘۥۨۨۡ۠۠۬۟ۥۘۦۥ۬ۛۧۦ۬ۧۧۨۚۦ۫۫ۗ۫۫ۗۧۡۤ۫ۛ۟ۧ۟ۘۘۢۛ۟ۘۘ۟۠ۘۗ۬۠ۨۤ۫ۖۨۥ";
                    break;
                case -34582604:
                    layoutParams.topMargin = m79dp(mainActivity, 10);
                    str4 = "ۧۙۙ۬ۥۙۜۧۦۘۛۛۘ۠۬ۖۖۚۜۘ۟ۗۙۤۜۦۛ۠ۗۢ۫ۢ۬۠ۗۜ۬۟ۧۨۘ۬۠۟ۚ۫ۖۘۢۙۚۡ۠ۘۙۙۨۘۨۤۛ۟ۙ۠ۡ۫ۖۦۢۤۨۖۘۚۗ۠ۨۨۚۖۦۧ۠ۚۨۘۨۗۥۗۖۘۘۘ۫ۖ۟ۥۖۘۡۖۥۙ۠ۛۡۗۖۘۙۖۥ۫۫ۛۛۤ۠ۤۧ۬۬ۡۖ۟ۖۦۛۘۜۘۚۘ۫ۦۛۜۤۦۨۘۜ۠ۦۘ";
                    break;
                case 26666672:
                    str4 = "ۢ۠ۘۛۢ۬ۨۦۗۘۚۤۛۜۨ۟ۙۖ۟ۚۚۚ۫ۛۙ۠ۘۗۗۜۘۨ۬ۘۘۧۘۖۨۦۘ۠ۤۦۘۡۚۙۗ۠ۦ۫۬ۜۘ۫۟ۨۘ۬ۨۜ۟ۧۘۥۧۧۘۥۘۧۙۙۧ۬ۥۨۤۨۚۡۘۘ۬ۥۛ۠ۤ۟ۘۤ۫ۦۘۚ۫ۗۘۘۛۢ۟ۚۖۥۤۖۜۘ۠ۧۘۛ۟ۚۚۚۧۘۘۤۖۛۦۘۗۗۙ";
                    builder = new AlertDialog.Builder(mainActivity);
                    break;
                case 150923612:
                    layoutParams.bottomMargin = m79dp(mainActivity, 20);
                    str4 = "ۦۚۦۗۧۘۘ۟ۧ۬ۨۦۨۘۨۗۢ۫ۡۛۚۡۛۤۗ۠ۢۜۘۦ۫ۦ۫۟ۖۖۢۜۖۘۤۦۖۖ۠ۡۘۜۚۡۜۡۚۡۖۚۡۜۨ۫ۖۛۥۥۥ۬ۘۖۢۚ۟ۘۘۘۙۜۨ";
                    break;
                case 447304860:
                    String str5 = "ۚۘۥۘ۬ۖ۫۟ۤۗۗۢ۫ۢۥ۫ۥۤۘۜ۬ۘۦۚۢۡۙۖۨۖۙ۠ۘۘۦۥۥۘۚۚۨۘۥۖۥۘ۫۫۫ۦۢۡۘۢۙ۠ۤ۫ۤۙ۬ۥۘۦۜۥ۬ۨۢۙۦۘۨۖۤۢ۫ۘ۫۟ۜۙۢۖۘۨۙۘۧۗۘۧۨۦۘ۟ۖۖۘۢ۠ۖۘۡۜۖۘۛۦۛۤۘۢۡۘۦ";
                    while (true) {
                        switch (str5.hashCode() ^ (-1613735149)) {
                            case -1812165766:
                                str4 = "۫ۛۛۛۢۦۘۥ۬۫۬۠ۜۤۙۦۜۙۙۖۡۘۦۦۦۛۢ۬ۤۧ۬۠ۡۢۘۙ۠ۤۙۦ۫ۘۨۘۙۙ۬۟ۧ۠ۗۙۚۘۘ۠ۥۥۜ۟ۨۦۧۙۥۦۦۙ۬ۜ۠ۗۖۙۖۚۗ۟ۡۤۜۛۚۗ۠۟ۚۦۘ۟ۗۧ۠ۜۘۗۘۚۢ۬ۜۚۨ۟۟ۛۧ";
                                continue;
                            case -1304930582:
                                str4 = "ۙۧ۟ۚ۠ۨۢۦۦۡۨۤۗۤۙۡۨۚۜۨ۟ۛ۫ۜۘۖۥۧۘۙۢۘۘۢۡۘۖۜۦۘۚۙۦۘۗۧۖۘۤۡۥۘۤۖۗۥ۬ۗۦ۟ۚۡۨۛۤۥۢۡۡۘۥۥۤۦۢۘۘۤۢ۟ۜۙ۠ۘۥۘ۫ۡۧۗۚۜۦۚۖۢۚۗۗۛ۬ۡۜۤ۠۟۠ۖ۬ۢۤۢ";
                                continue;
                            case -1101825474:
                                String str6 = "ۙۥۥۡۦۗۥ۫ۘۘۜۨۢۖۘۨ۟۟ۤۨۚۢۜۘ۟۠ۦۦۥۦ۬ۡۜۥۥۚۤۤۗۢۧۘۘۘۧۧۥ۫ۛ۟ۘۘۗ۫ۨ۬ۧۚۖۖۖ۫۟ۨۚۜۜۥۜۥۘۢۤۗ۫۟ۚۛۜۗ۫ۖۦۘۢۗۜۘۦۨۢۚۜۙ";
                                while (true) {
                                    switch (str6.hashCode() ^ 1824270480) {
                                        case -1270596239:
                                            String str7 = "ۙۗ۟ۛۧۡۘۜۛۜۘۖۨۡۘۧ۬ۘۘۗۚۥۘۘۙۡۥ۟ۜۘ۫ۤۘۘ۬ۚۡۘ۫ۘۙۛۢۤۘ۬ۗۜۨۢۖ۠ۢۢۢۖۙۚۙۛۘۘۧۥۡۚۙۘۡۤۨ۠۠ۥ۫ۦۘۘۦۡۙ۟ۧۖۘۤۖۜۦۥۤۗ۫ۧۖۘ۫۫ۜۤۨۙۘۘۜۗۨۘۡۤۚۚ۬ۢۗۗۨۘۡۦۢۦ۫ۗۢۡۧۘۙۜۥۥۨۦ";
                                            while (true) {
                                                switch (str7.hashCode() ^ 1644683234) {
                                                    case -1964881340:
                                                        str6 = "ۦ۟ۤۚۧ۠ۛۨۘۦۤۘۘ۟۟ۡ۠ۦۘۘۜۙۛۖۖۛۙ۠ۨ۠ۦۘۘۚۙۨۡۖۘۨ۫ۥۘۚۥ۬۬ۦۘۘۡۛۜۚۧۨۘۡۤ۟ۢ۫ۜۘۗۛۘۘۤۜۙۢۚ۫ۛۦۨۘۛۤۡۘۜ۫ۡۘ۟ۚۦۘۤ۟ۖ۠ۜۜۚۘۗۦۦۥۘۤۥ۫ۧۧ۫ۦۤۦۗۛۘ۠ۙ";
                                                        break;
                                                    case -1566923367:
                                                        str6 = "ۢۚۛۢۨۡۢۥ۟۬۠۫ۥ۟ۜۖۖ۠ۢ۬۫ۘۤۗۙۛۤۤۧۜۘۗۗ۠ۚ۟ۨۦۢۚۙ۟ۥۚۤۧۦۗۡۘۦۗۘۘۨۚۦۖ۫ۥۘ۬ۢۜۘۘۦۖۘۘۤۙۜۦۦۢۙ۟ۡۗ۟";
                                                        break;
                                                    case -1138501650:
                                                        String str8 = "ۡۛۥۘۤ۬۟ۖۖۦ۫ۦۨۧۗۙ۟ۧۗۢۡۚۤۘۘۡۙۦۧ۠ۘۘۡۡ۬۫ۗۦۤ۠ۢۚۢۥۘۖۢۘۛ۬ۜۨۢ۬۠ۗۖۙ۟ۡۙ۟ۘۨۗۨۘۖۜۨۘۗۖۧۜۗۦۚۖۘۤۛۥ۠۠۟ۨۜ۫۫ۛۛۦۜۤۙۘۡۧۙۡ۠۟ۡۛۨۥۘ۫ۦۘ";
                                                        while (true) {
                                                            switch (str8.hashCode() ^ 1312755823) {
                                                                case -1577954295:
                                                                    str7 = "ۜۧۙ۠ۖۤ۫۬ۤۤ۫۠ۜۙ۫ۡۧۤۥۤۙ۫۫ۖۘۛۗۧۨۦۚۘۥۜۡۜۥ۬ۙۘ۫ۡۤۢۖ۠ۨۘۨۛۢ۠ۧۖۗ۠ۥۘۘۘۨۘۖۘۡۥۧۘ۫ۘ۟ۤ۬ۖۘۥۚۥۘۨۙ۠ۛ۠ۧۤۗۛۦۜۗ۫ۦۘۛۙۥۘ۫ۛ۫ۛ۠ۢۢ۫ۜۚۗۡ۠۬ۥۧۛۖۙۥۙۨ۠۬ۘۘ";
                                                                    break;
                                                                case 1064085683:
                                                                    String str9 = "ۡۛۦۚۤۖ۟ۧۦ۟ۧۢۨۛۨۘۙۧۦۦ۫ۥۘۜ۟ۧۛۚۢۖ۬ۖۡۢۘۖۡ۬ۨۧۙۜ۫ۙۡۖۘۚۘۧۘۧۢۦۘۥ۬ۘۘ۫ۦۧ۠ۜۥۘۦۧۘۛۘۖۢۙۢۥۙۧۤۛۖۘۦۡ۟ۛۛۨۘۥۨ۠ۚۜۡۡۡ۫ۘ۫ۜۘۨ۟ۘۘ۠ۥ۫۠ۤۡۘۥۧۥ۬ۨۖۨۡۨۘ۟۟۫ۥ۬ۘۘۘۛۜۧۡۘۛۙ۬ۛۦۜ۟ۚۤ۠ۦۤ";
                                                                    while (true) {
                                                                        switch (str9.hashCode() ^ 1927327002) {
                                                                            case -591570439:
                                                                                str9 = "ۙۦ۫ۦ۬ۨۘۖۨۢۦۗۤ۠ۖۡ۠ۥۗ۬ۚۤۖ۬ۗۙۜۘۡۗۧۜۗۨۘۙۦۡۘۛۘۛۛۖۨۘۢ۫ۥۘۚۢ۫ۥۢۘۤ۫ۘۘۛۤۥۘۖۨۖۥۖ۬ۗ۟ۖۘ۫ۨۨۘۡۨۛۥ۫ۙۤ۬ۢۛۦۖۘۢۧ۟ۖ۠ۥۘۘۡۘۘ۬۬ۜۨۜۜۤۡ۫۬۬ۦۗ۠ۖ۟ۜۜۚۜۧۥۘۖۜۘۦ۫ۖۡ۬ۜۘۜۢۜۘۘۦۧۡ۟ۘۛۖۡ";
                                                                            case -267560175:
                                                                                str8 = "ۜۛۙ۟۟ۦۘۖۗۨۘۤۨۘۘۚۢۡۙۚۙۙ۠ۖۘ۫ۛۘۘۦۡۙۤۡ۫ۘۙۨۗ۫ۦۘۜۨۜۘۧۗۤۤۨ۬ۢۦۘ۟ۘۘۡۘۚۜۘۘۜۦۥۘۤۤۧۥۤۗۦۦ۫ۘۦۡۘۥۤۘۢۦۧۘۦۛ۟ۛۜۙۦۢۦۤ۬ۚ";
                                                                                break;
                                                                            case 951548977:
                                                                                str9 = alertDialog.getWindow() != null ? "ۧ۫ۘۘۗۡۜۚۜۢۙۧۨ۠ۢۖۘ۟ۖۤ۠۫ۗۗۖ۟ۨۢ۫ۢ۬۠ۧ۠۟۠ۚۖۘ۟ۦۛۤۤۥۧۘۧۘۚ۠۫ۦۡۘۚۘۘۗ۬ۡۖ۟۟ۥۥۖ۫ۘۜۘۘۘۥۘۡ۠۠ۧ۠ۨۘ۟ۨۗۦۦۘۙۤۗۚۥۜ۬۫ۥۘ۠ۤۦۘۥۘۙ۫ۜۖۧۦۚۚۡ" : "ۡۧۡۘۚۛۨۘۡۢۘۨۡۥۘۛ۫ۜ۟۟ۙۢ۠ۜۘ۫ۚۥۘۤۨۨۘ۠ۥۦۙ۠ۘۘۗ۫ۜۧۗۙۘۙۙۚۨۤۛۜۘۘۦۘۙۧۚۤ۫ۘۘۜۗۧۜ۟ۛۤۚۜۦ۫ۦۘۙۦۧۖۖۧۦۤۘۖ۬ۥ۠ۥۦۦۚ۬ۘۘۤۧۚۧۧ۠ۡ۫ۛ۫ۤ۫ۥۧ";
                                                                            case 2036186807:
                                                                                str8 = "ۖۥ۟۠ۤۘۘۛۛۡۦۖۘۘ۬ۨۗ۬ۙۦۘۚۤۛۨۜۥۘۜۖۛۗۢۚ۠ۨۢۢۛۡۘۡ۠ۛۛۢۜۧۨۘۖۢۛۛ۫ۗۢۥۛۗۛۥۙۜۦۘۙۘۦۦۖۨۤۤۖۘۨ۫ۚۚۨۘۘۙۥۗۥۜ۠۟۫ۗۧۖۤۜۢۚۗۘۘۨۜ۟ۘۨۨۛۖۨۘ۬ۦۧۘ";
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 1138106275:
                                                                    str7 = "ۧۡ۫۟ۚۛۥۧۤۜ۫ۗۦۡۘۘ۠۫۬ۘۚۛ۠ۘۘ۟ۨۜۘۘۖۛۙۡۗۦ۠ۘۘۘۨ۠ۢۡۨۖۘ۫ۡۛۛۜۡۘۡۗۢۘ۫ۨۢۗۦ۟ۡۜ۫ۘۥۘ۠۠ۛ۟ۦۤۘۘۗۚ۠۫۟۬ۦۙ۠ۗۜۤۦۧۦۘ";
                                                                    break;
                                                                case 1852516546:
                                                                    str8 = "ۧۙۖۨۘۘۢۨۥۘۚۢۗۛۗۥۤۦۘۥ۫ۨۨۖ۟ۗۚۛ۟ۙۢۧۙۨۙۨۥۘۘۢۥۥ۬ۥۘۡۛۘۘ۫ۚۘۙۜۗۦ۟ۨۘۜۧۥ۫۟ۘۧۜۘۜ۫ۘۘۜ۬۬ۥۥۖۚۙۡۘۗ۬۬ۢ۫ۖۙۛۥ۟ۥۜۘۨۤۨۘ";
                                                            }
                                                        }
                                                        break;
                                                    case 537286767:
                                                        str7 = "ۦۢ۫ۨ۟ۨ۬۫ۤۥۦۘۘۦۡۨۘۢۙۚۙۗ۫ۜۛۡۤ۫۠ۚ۠ۥۘۡ۬ۘۘۨۖۙ۬ۡۛۙۜ۟ۨۤۢۢۤۙۥۨۜۦ۫ۗ۬ۜۥۘۚۧ۠ۨۦۗ۫ۜۘۦۖۘۘۜۚۛۖۛۖۘۥۖ۫ۤۤ۫ۗۘۘۦ۟ۦ۬ۤۢ۬۟ۧۥۜۘۜۘۜۧۛۗ";
                                                }
                                            }
                                            break;
                                        case 425268498:
                                            str5 = "ۖۜۚ۟۫ۘۘ۠۠ۜۛۜۥۘۤۦ۫ۛ۫ۜۘ۠ۦ۫۬ۗۘۘۡۡۤ۠ۨۨۘۦۖۘۨۗۗۛۢۥۖۙ۬ۦۥۙۢ۫ۦۘۦۚۘۘۘۦۘۘ۠ۧۦۧۥۥۘۗۖۖۖۡ۫ۨۢۨ۫۠ۜۚۙۚۗۗۡۘۢۡۜۙ۠۟ۜ۬ۘۘۗۧۗۦۘۦ۫۬ۡۘۢ۟ۚۦ۬۟۬۫ۛۨ۟ۜۘۘ۫ۧۙۢۖۘ۟ۧۜ۫ۚۥ";
                                            break;
                                        case 1139504239:
                                            str5 = "ۛۗ۟ۨۤۦۘۜۗۙ۟ۡۥۘۨۜۘۥۦۛۙۘۘۘۜۦۜۘۢۧۡۘ۬ۘ۬ۤ۬ۨۗ۬ۢۡۤۨۘ۬ۨۗۧ۬ۜۘۢۙۦۘۜۡۘۡۙۦۖۢۜ۠ۜۥۦۗۚ۟ۖۧۘۜۖۡۘۜۙۙۡ۠۠ۜ۟ۜۥ۫ۤۚۖۦۙۨ۟ۧ۟ۢۚۧۥۡۨۖۘۡۡۨۘۢۥۚۦۙ۫";
                                            break;
                                        case 2082609712:
                                            str6 = "ۘ۬ۥۘۡۗۨۤ۬ۛۡۧۦۦۜ۠ۧۤۙ۬ۛۚۖ۬۟ۨۤۨ۫ۛۡۘ۟ۖۖۘ۬ۦۖۘۧۢ۟ۦ۠ۘۘ۠ۤۦۘۛۛۜۘ۬ۡۗۖۥۜۘ۟۟ۦۤۜۜۘ۬ۚۙ۫ۘۜۘ۠ۦۙۛۛۦۤۚۜۧۡۥۖۦۧۢ۠ۤۛۘۨۧۦ۫ۡۛۘۘ۬ۙۘۙۘۨ۟ۖ۫ۗۛ۠";
                                    }
                                }
                                break;
                            case -66479653:
                                str5 = "۠ۥۘۨۥۤۤۗۡۘۗۙۜۥۥۛۧۛۧ۫ۤۦۨۛۨۘۧۥۧۨۧۚ۬ۖۢ۠ۧۥۘۡۜ۬ۙۦۙۖۧۘۚۤ۟۫ۛ۬۫ۤۡۚۥ۬۬ۥۜۘۤۙۛ۬ۢۖۘ۠ۚۦۘۥۜۛۦۦ۠";
                        }
                    }
                    break;
                case 552104587:
                    linearLayout2.addView(button);
                    str4 = "۠ۤۙۡۡ۠ۥۜۘۚۤۙ۟ۘۦۘ۠ۖۘۘۦۧۨۘ۟۠ۖۘۘۥۛۦۨۛۥ۬ۜۤۦۗ۬ۥۘۘۗۙۦۘۤۙۢۗ۫ۗۢۘۡۡۖۜۤۨۘۨۛۧۚۛۗۧۜۘۤۦۘۘۧۤ۠ۛۧۜۘ";
                    break;
                case 554121376:
                    linearLayout.addView(textView);
                    str4 = "ۢۛۡۤۨۙۦۡۤۗۜۥۘ۫ۦۡۗۨ۫ۗۤۡۘۙۘۨۘ۠ۨۘۘۦۤۥۘۦۨۨۘ۬۟ۜۧۧۥۘۚ۠ۙ۬ۦۨۗۜۨۘۧ۬ۨۘۖ۫ۡۘ۠ۨۖۘۛۛۗۡۘۧۘۤۡۢۘ۫۬ۜۡ۫ۨۛۢۚۢۨۘۦۘۨ۬ۢۚۛۤۤۧۘ۫ۨۨۘۜۡۙۗۤۖۛ۫۬ۡۧۥۘ";
                    break;
                case 565343774:
                    textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                    str4 = "ۚۛ۟ۘ۟۬ۧ۬ۥۥ۠ۡ۟ۦۘۖۛۘ۠ۢۜۘۘۢۛۦۧۘۡۘۖ۬ۦۖۖۢۚۖۘۖۥ۬ۧ۠ۜۜۘۡ۬ۨۘۤ۫۬ۤۚۦۘ۠ۤۖۘۨ۟۬ۤۙۨۘ۠۟ۖۘۤۚۨۘۙ۟ۗ۫ۦۖ";
                    break;
                case 705897732:
                    str4 = "ۨۙ۬ۗۡۗ۠۬ۗۛۤۧ۠ۛۘۘۦۙۥۧۦ۟۟ۙ۟ۗۙۥۤۥۗۥ۬ۧۦ۠ۙۘ۠ۙۦۤۡۘۧ۠۠۫ۘۗۛۖۘۙۙۥۘ۬ۗۖۘۤ۠ۧ۫ۜۦۘۚ۟ۦ۫ۦۛۧۖۢۛۚۜۢۧۚۚۤۥۘۛۛۜۧۡۧۘۦۥ۫";
                    button2 = new Button(mainActivity, null, 16843563);
                    break;
                case 707945881:
                    alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                    str4 = "ۙۧ۟ۚ۠ۨۢۦۦۡۨۤۗۤۙۡۨۚۜۨ۟ۛ۫ۜۘۖۥۧۘۙۢۘۘۢۡۘۖۜۦۘۚۙۦۘۗۧۖۘۤۡۥۘۤۖۗۥ۬ۗۦ۟ۚۡۨۛۤۥۢۡۡۘۥۥۤۦۢۘۘۤۢ۟ۜۙ۠ۘۥۘ۫ۡۧۗۚۜۦۚۖۢۚۗۗۛ۬ۡۜۤ۠۟۠ۖ۬ۢۤۢ";
                    break;
                case 749634641:
                    textView.setTypeface(null, 1);
                    str4 = "ۦۗۦۖ۟۠ۦۛۜۘۧۛۥ۬ۨۥۥۦۙۨۗۢ۟ۧۨۘۡۗۨۘۚ۟ۦۚۥۜۘۨۤۡۘ۬ۛۤۨۦۘ۠ۧۚۛۦۥۘۗۘۛۘۖۧۖۡۛۥ۠ۘۘ۬۟ۢۚۖۘۛۜۦۗۜ۫۫ۚۡۘۢۤۜۧۦۥۚۧۢۖۡۘۖۧۚۡۚ۟۫ۘۦۢۡۛۚۤۦۥۗۖۖ۟ۖۘۚۛۨۦ۠۫ۙۜۚ";
                    break;
                case 753508571:
                    linearLayout.setBackground(gradientDrawable);
                    str4 = "۟ۗۡۜۧۖۥۦۙ۬ۨ۫ۙۜۘۚ۫ۦۚۜۨۥۢ۠ۜ۠ۦۘۨۦۥۚۛۘۘۤۧۖۘۧ۟ۙۦۦۙۡ۫ۡۦۚۗۤۚۗۚۖ۫ۦۦۖۘۖ۟ۨۤۨۧۘۢۗۨۡ۟ۘۗۤۢۙۥۨۘۗۦۡۤۥ۬۫۠ۥ۫ۤۛۜۡۙۥۗۢ۟ۜۘۘۜۜۘۗۧۥۖۗۥ";
                    break;
                case 842567880:
                    str4 = "ۦۗ۫ۧۛۘۙ۫ۖۙۘۤۨ۬ۤۨۧۦۘۦۙۡۘۤۖۡۘۜۢۨۘ۟ۥۘۘ۟ۚۖۢۗ۬ۧ۫۫ۛۨۡۖۚ۠ۡۗۥۥۖۦۘ۟ۧۨ۬ۦ۫ۧۙ۠ۦۖ۟ۡۖۧۘ۠ۚۙۜۚۛۖۤۘۘ";
                    break;
                case 1105293180:
                    str4 = "ۛۢۜ۫ۖۘۙ۫ۨۘۛۚۜۘ۬۫ۘۘ۬ۗۡۘۘۦۨۙ۟۫ۦۜۧۘۥۢۙۙۦۜۢۢۥۤۦۧۚۘ۬ۧ۠ۦۜ۟ۡۘۦۙۡۢۘۡۘۙۧۢۙۛۥۘۤۨۦ۬ۖۨۗۡۘۦۖۦۘۚ۫۬ۖۛ۫ۛۗ۬۫ۚۛۤۧۚۛ۠ۡۜۛۢۧ۟ۗۧۥۘۥۧ۠ۡ۟ۦۘ۫ۦۗۥۗۙۙ۠ۨۘۡۙۧۤۜۘ۟ۥۧۘ۠ۡۘۘ۠ۗۙۙۧۤ";
                    textView2 = new TextView(mainActivity);
                    break;
                case 1232346879:
                    textView.setTextSize(18.0f);
                    str4 = "۫ۦۙۦ۠ۨ۠۫ۛۥۚۨۘۡ۬ۦۘۗۛۨ۟ۡۗۗ۟ۤ۬ۘۤۙۖۧۡۜۦۦ۟ۚۜۢۢۖ۬ۖۢۨ۬ۚۜۖۘۜۙۡۘ۟۫ۘۙۚۗ۬ۖۨۗۤۥۘۤۦۦۘ۟۬۠ۦۘ۠ۢۚ۠ۡۨۤۡۜۨ۬ۢۥ۬ۛ۟ۛ۫ۜۨۗۡ۠ۙۜۧ۠ۙ۫ۛۙۨۘۙ۬ۤۖۜ۬ۥۢۘۧۥۘۤ۬ۖۘۙۙۡۛۗ۟ۖۡۘۧۜۚۤۘۧ";
                    break;
                case 1243025372:
                    str4 = "۫ۧۥۢ۟ۘۘۥۧۜۖ۫ۖۘۛۗۘۜۧۘۘۡ۬ۡۛۚۗۤۛۖۘ۫ۦۨۘۧۛۧۦۡۘۘۧ۬ۛۛ۠ۦۘۦۜۖۥۛۛۢۖۘۚ۟ۖۡۦۧۨ۫ۗۜۛۖۢۘۚ۟ۖۤۚ۠ۖۘ۠۫ۛ";
                    break;
                case 1275117056:
                    button.setOnClickListener(new View.OnClickListener(alertDialog, mainActivity, str, str2, str3) { // from class: kentos.loader.activity.MainActivity$$ExternalSyntheticLambda6
                        public final AlertDialog f$0;
                        public final MainActivity f$1;
                        public final String f$2;
                        public final String f$3;
                        public final String f$4;

                        {
                            this.f$0 = alertDialog;
                            this.f$1 = mainActivity;
                            this.f$2 = str;
                            this.f$3 = str2;
                            this.f$4 = str3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            String str10 = "۟ۢۥۘ۟ۥ۟ۨۤۘۘۤ۠ۦۘۘۧۧ۠ۖۡۘۨۡۘۙۧ۬ۧۢ۫ۤۨ۠ۢۨۤۥۗ۟ۘۗۤۡۘۧۖۖۘۢ۬ۦۘ۬۠ۥۗۦۦۘۤۥ۟ۗۚۡۚۛ۟ۡۢۧۖۡۘۥۙۦۘۢۖۘ";
                            while (true) {
                                switch ((((((((((((((((((((((((((((((((str10.hashCode() ^ 838) ^ 880) ^ 699) ^ 127) ^ 582) ^ 191) ^ 640) ^ 909) ^ 987) ^ 77) ^ 722) ^ 678) ^ 283) ^ 181) ^ 366) ^ PointerIconCompat.TYPE_ZOOM_IN) ^ 200) ^ 699) ^ 470) ^ 305) ^ 856) ^ 590) ^ 543) ^ 423) ^ 199) ^ 719) ^ 973) ^ 16) ^ 953) ^ 770) ^ 20) ^ (-1802317548)) {
                                    case -1792346018:
                                        str10 = "ۖۖ۫ۥۙۥۘۥۧۙ۠ۢ۟ۜۧ۠۬ۖۖۘ۟ۥ۟ۙۚ۫۬۫ۨۢۖۦۘۖۚۡۘ۫ۤۘۢۦۖۖۥۙۘۦۦۤۖۖۘ۠ۗۡۘۜۖۤ۟ۨۘۘ۠ۜۨ۠ۡۛۧۧۡۘۡۦۦ۫ۥۘۘۛۜ۟ۗۘۗ۬۫ۘ۠ۚۡۚۡۡۖۚۜ۟ۖۙ۬ۧۨۛۥۛۨۚۘۛۧۥۡۧۛۨۙۚۥۙۢۘۢ۫ۦۦ۫ۚۚ۫ۘۚۘۘۡ۠ۘۘۖۡۛۤۘۘ";
                                        break;
                                    case -902660175:
                                        str10 = "ۢۥ۠ۢۧۘ۬ۥ۬ۙۜۨ۠ۧۧۛۧۜۡۡۢ۫ۖۘۘۜۨ۫ۗ۠ۥۘۤۡۖۘۢ۟ۨ۬ۡۧۘ۫ۤۢۚ۟ۖۘۖۜۦۘۢ۫ۤۨۤۘۘ۟ۥۧ۠۟ۨۤۤۦۚ۠ۛۚۥۘۧۗۦۘۨۘۗ۟ۘۢۥۨۥۘ۫ۜۘ۟ۙ۫ۦۥۥ";
                                        break;
                                    case 805749811:
                                        return;
                                    case 1090110541:
                                        MainActivity.lambda$promptForObbDownload$16(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, view);
                                        str10 = "ۙۛۜۚۤۨۘۡۚۖۗۤۗۤۘۜ۠ۤۖۧۧۦۙۢۡۗۚ۫۫۟۟ۚ۫ۧۜۨۧ۬ۘۖۢۘۧ۫۬ۘۡۘۡۧۡۨۥ۫ۨۙۥۘۘۤۖۘۦ۠ۡ۬ۚ۟ۜ۠ۚۥ۟ۡۘۘۦۖۘۚۥۥۘۤۧۜۘۜۨۥۘۘۤۖۤۧۢۗۤۦۘۥۨۗۗۥۧۚۜۛۢۦۘۘۨ۬ۡۨۛۘۧۜۢۖۥۨ۠۠۫۬۫ۧۡۛ۫۠ۛ۠۟ۙۗۖۙ";
                                        break;
                                }
                            }
                        }
                    });
                    str4 = "ۤۚۧۡۖۧۡ۠۬ۗ۬ۘۘۧۦۨۘۜۡ۬ۖۗۖۗۥۘۧۚ۫ۙۚۘۘۡ۫ۡۥۤۛۥۦ۬ۦۢۧ۠ۛۜۖۡۥۘۛ۬۬ۥۧۘۘ۠ۢۧۧۛۤۛۛۜۜ۠۠ۙۨۗۚۖۦۘۦۚۢۙۚۦۘۢۨۜۘۦۖۦ۟ۗ۟ۛۧ۬ۤۡۖۨ۠ۖۘۜۢ۠ۛۢۦۜۤ";
                    break;
                case 1361272339:
                    textView.setText(getString(C0931R.string.str0044));
                    str4 = "ۤۗۥ۠۫ۛ۟ۘ۬ۘ۟ۘ۬ۘۖۘۢۥۤۦۘۤۚۡۗۢ۫ۦۘۨۢۦۢ۬ۗۚۢ۟ۜۛۘۘۧۥ۟۬ۧۙ۫ۘۧ۟ۗۥۡۦۛۦۘ۫۟ۡۘۙۨ۠ۧۛۜۘۗۜۨۘۜۘۡۥ۬۠ۥۜ۬۬ۨۖۢۜ۬ۦۖۘ۠۬ۥۖۛۘۘۦۢۜ۠۬ۢۦۖ۠۟ۛۙ";
                    break;
                case 1395929132:
                    str4 = "ۤۦۦۘۡۜۚۢۜۜۘۚۢۥ۫ۧۖۗۥۜۘۡ۬ۘۘۙ۫ۘۜۗ۬ۧۨۨۘۘۘۛۜۚۜۡۛۜۘۚۧۧۥۨۜۘۥ۠ۦۘ۫ۜۨۦ۫ۢ۫ۤۨۘ۬ۗۘۨۤ۫ۢۡۖۘۛۧۨۘۥۥۦۘ۠۬";
                    gradientDrawable = new GradientDrawable();
                    break;
                case 1401969420:
                    button2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                    str4 = "۠۬۟ۥۗۦۙۡ۠ۦ۫۟۫ۧۡۘۗۘۢۥۗۖۛۦۧۘۖ۟۫ۤۘۨۘۜۚۢۗۧۥۘۦ۠ۜ۠۫ۚۗ۫ۛۚۡۘۡۢۚ۠ۙۡۢ۫ۥ۟ۡۘۨۦۨۤ۟ۙۘ۟ۜۘۢۖۙ۟ۛۢۥۖۚۦۥۜۥ۬ۡ۬ۚۘ۬۠";
                    break;
                case 1574473319:
                    textView2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                    str4 = "۫ۖۨۘ۠ۗۢۖۘۥ۫ۘۦۘۙۛۥۗۘۡ۠ۤۖۛ۫ۜۘۛۢۥۘۢۘۘۗ۠ۤۛۖۖۘۥۦۡۘۙۚۥۘۥ۠ۛۖۤۖۘ۟ۙۘۘ۬۟ۢۥۚۨۢ۟۫۫ۥۛۡ۠ۦۘ۫ۥۧۨۤۤۛ۫ۥۡ۟ۛۥۘۜۡۖۘۨ۬ۦۦۖۜۘۤۥ۠۬ۘۤۛۙۘۘۙۢۤۧۚۘۘۜ۬۟ۧۨۖۘۖۙۙ۠ۖۥۢ۫ۧۤۗۗۘۗۖۘۗۙۦۘۤۗۗۦۧ۟";
                    break;
                case 1834957494:
                    linearLayout.addView(textView2);
                    str4 = "ۚۡۨۘۦۨۘۜۢ۠ۡۘۧۤۚ۫ۘۤۙۨۥۥۨۢۖۛۜ۟ۗ۟ۚۚۧۥۖۗۨۘۦۥ۠ۨۙۤۦۘۜ۠ۦۤۧۤۢۦۖۜ۫ۦۘۜۘۨۡۧۙۤۧۦۜ۬ۧ۫ۜۨۘۦۛۡ";
                    break;
                case 1857419625:
                    builder.setCancelable(false);
                    str4 = "ۢۚۥ۬ۙۦۘۘۢۥۘۜ۫ۡۛۦۜۧۦۨۖۢۥۘۜۢ۠ۢۡۗۦۜۡۘۜۡۖ۫ۢۢۜۛۦۘ۬ۚۡۡۛۖۘۖۛۡۖ۫ۡۘۗۧۛۧۗۡۜۙۥ۠ۙۥۤ۫۫ۘ۠۫ۚ۫ۥۡۧۥۘۜۙۢۗ۬ۘۘۙۥۜ۠۠ۡۢۗۢ";
                    break;
                case 2127179597:
                    str4 = "ۜۨ۫ۢ۠ۖۘۙۡۦۘۗۜ۬۬ۦ۫ۗۦۧ۬ۤۥۘۛۦۦۘ۬ۥۤ۟ۘۥۘۥ۫ۦ۫ۜۨۘۚۛۥۥ۬ۦۗۗۦۘۨ۫ۖۘۜۡۖۖۜۘۧۥۡۘۡۗ۫ۧۨۘۘۗۗۖۘۗ۟ۜۘۦۜ۫۟ۢۘۘۡ۫ۧۗۨۤۡۘۛۗ۬ۤۛۛۡۘ";
                    linearLayout = new LinearLayout(mainActivity);
                    break;
            }
        }
    }

    private void runBypassCmd(String str) {
        String str2 = "ۚۗۨۤ۠ۙۙۡۨۘۘۧۦۚ۫۫ۥۘ۟ۦۧ۬ۧۨۘ۟۠ۥۘۚۛۛۤ۬ۘۢ۫ۡۗۖۥۥۚۦ۠۠ۦۘۖۧۦ۫ۗۘۡۗۛۖۧۙ۠ۧۡۨۦۘۢۦۨۨۢۗۢۛۜۘۥۦ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str2.hashCode() ^ 492) ^ 611) ^ 184) ^ 333) ^ 471) ^ 790) ^ 670) ^ 798) ^ 145) ^ 266) ^ 283) ^ 292) ^ 63) ^ 834) ^ 657) ^ 799) ^ 690) ^ 43) ^ 727) ^ 535) ^ 725) ^ 14) ^ 966) ^ 336) ^ 453) ^ 841) ^ 869) ^ 962) ^ 985) ^ 473) ^ 239) ^ (-549731293)) {
                case -1729032616:
                    return;
                case -988356055:
                    str2 = "۠ۘۖۘۧۦ۟۫ۢۦۜۗۡۦۤۢ۟ۨۥۚ۠ۤۚۗۖۛ۬ۨۘۧۖۛۖ۠ۡۘۨۜۘۖۛۘۖۜۛۖۢۙۦۡۦ۟ۨۥۗ۟ۡۡۘۥۗۡۘۘۛۧ۟ۢۨۡۘۤۡۛۡ۠ۨۛ۬ۘ";
                    break;
                case -326897546:
                    str2 = "ۚ۠ۜۘۙ۫ۢۤۥۛۚۚۡۙۛۘۘ۬ۖۥۚ۠ۥۘۡۘۦۧۚۚۖۗۦۢۖۜۦ۫ۥۡۥۡۘ۫ۢۗۨۚۜۘۘۛۥۘۢۥ۫ۘۢۗۙۦۨۘۘۜ۟ۜۗۖۘۥۗۘۡۚۘۘۧۘ۟ۨۦۘ";
                    break;
                case 995387840:
                    new Handler().postDelayed(new Runnable(this) { // from class: kentos.loader.activity.MainActivity$$ExternalSyntheticLambda18
                        public final MainActivity f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String str3 = "ۤ۟ۧۧۙۘۨۙۜۧۦۘۛۤۥۛ۠ۖۘۦۡۗ۬۬ۖۨۧۨۘۥۛۥ۬۫۠۬ۤۥۦۜۜۘۜۧۨۘۖۡۢۥۛ۫ۙۢۦۘۗ۫ۤۛ۬۫ۖۗۦۢۜۧۘۚۧۙۡۗۦۨۢ۟ۖۢ۠ۢۚۤۘۤۛۨۧۗۦۧۡۥۚۛ۠ۥۖۖۦۥۛۧۨۦۘۘۙۘ۬ۜۜۘ۬ۚ۫ۖۖۡۛۥۘۦۧۤ۫ۚۜۘۢۜۚۜۘۖۙۘۘۨۚۧ";
                            while (true) {
                                switch ((((((((((((((((((((((((((((((((str3.hashCode() ^ 646) ^ 437) ^ 967) ^ 737) ^ 662) ^ 40) ^ 133) ^ 270) ^ 791) ^ 666) ^ 815) ^ 923) ^ 794) ^ 771) ^ 872) ^ 160) ^ 374) ^ 904) ^ 960) ^ 505) ^ 640) ^ 804) ^ 967) ^ 258) ^ 576) ^ 106) ^ 327) ^ 824) ^ 144) ^ 952) ^ 374) ^ 576996814) {
                                    case -1239643575:
                                        return;
                                    case -629585188:
                                        this.f$0.m255lambda$runBypassCmd$9$kentosloaderactivityMainActivity();
                                        str3 = "ۡۥۦۘۖۙۘ۟ۥۖۦۡۡۛۗۜۖۦۧۘۡۡ۠ۚۚۥ۟ۛۤۡ۬۟ۙۜۜۙۚ۠۬ۛۡۘۧۜۛۘۧۘۘۙۚ۠ۨ۟ۢۜۢۘۗۡ۟ۤ۟ۥ۟ۙ۟ۤۚۖۘۙ۠ۦۤۗۜۨۡۧۘ";
                                        break;
                                    case 1414526169:
                                        str3 = "ۦۖۦۘۚ۟ۧ۫ۖۜۜۖۢ۟ۖۤۦۜۛۢۜۖۦۨۡۦۢ۟ۘۜۦۖۤ۟۟۬ۨۢۦۜۘۦۨ۠ۧۜۡۘۜۦۘۚۨۗۜۜ۫ۨ۠۬ۡۨۗۜ۟ۧۤۦ۬ۛۧۘۘۜ۟ۖۨۛ";
                                        break;
                                }
                            }
                        }
                    }, 13000L);
                    str2 = "ۨۨۜۘۙۚۢۧۢۨۡۗ۟ۖ۠ۤۦۖۧۘۛۚۜۦۗ۟ۥ۠ۗ۬ۢۢۛۖۗۜۘۛ۟ۘۘۨۢۥۖۥۡۚ۠ۛۜۗ۠ۜۦۖۥۥ۫ۙۖۙ۠ۢۥۧۘۧۘۢۦۥ۠ۜ۫ۢۗۗ۟ۗۧۗۤ۟ۦۖۨۘۥ۬ۚ۬ۗۘۘ";
                    break;
            }
        }
    }

    private void setupGameButton(MaterialButton materialButton, final String str, final int i, final Runnable runnable) {
        String str2 = "ۛۖۦۘۙۗۡۘۧۚۖۘۘۨۨۘۨۢۖۘۜۨۗۜۧ۟۠ۗ۫ۢ۠ۥۘۧۥۡۘ۟۬ۦۘ۫ۗۢۚۖۨۦۢۥۨۧۘۨۖۖۙۗۨۘۗۤۤۤۧ۫ۡۙۨۘۜۨۘۢۦۡۘۖۛ۫ۧۚ۬۟ۦۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str2.hashCode() ^ 403) ^ 845) ^ 251) ^ 713) ^ 973) ^ 657) ^ 305) ^ 402) ^ 988) ^ 584) ^ 581) ^ 346) ^ 909) ^ 510) ^ 455) ^ 415) ^ 637) ^ 314) ^ 951) ^ 849) ^ 14) ^ 47) ^ 621) ^ 757) ^ 465) ^ 154) ^ 191) ^ 960) ^ 446) ^ 750) ^ 852) ^ (-775192667)) {
                case -2066789707:
                    str2 = "ۛۘۦۖ۟۠۬ۤ۠ۥۖۤۦ۟ۘۘ۟۟ۨ۫۬ۙۧۤۡۘۙ۫ۗۦۢۦۘ۬ۡۦۘۡۙۜۘۖۢۖ۠ۡۤۢۙۛۤۖ۫ۧۤ۬ۘۖۛۛ۬ۗۘۤۚ۠ۘۛۡۢ۠۬۫ۨۘ۬ۚۥ۬۬ۥۘۖۘۗۗۥۢ۬ۡۦۗ۬ۤۜۡۛ";
                    break;
                case -1441584497:
                    str2 = "ۨۦۦۘۚۛۚۜۜۡ۟۫ۢۛۜۜۘۚۜۚ۫ۙۜۙۡ۬۠۠ۧۡۙۙۥۧ۟ۙ۟ۘۡۘۡ۬۬ۢۢۤ۠۬ۧۥ۟۟ۧۦۗۨۦۡۘ۟ۚۘۘۧۨۨۘۦۜۥۘۙۤۖۜۧۘۖۢۧ۠ۗۙۦۖۨۗۢۜۢۙۘۧۘ۫ۦۘ۬ۛۥۘۡ۟ۥۘۦۜۛۚۖۨۘۙۘۦۘۥۘۧۢ۟ۦۘۥ۠ۨۘ۬۟ۗ";
                    break;
                case -367877322:
                    return;
                case -282400030:
                    materialButton.setOnClickListener(new View.OnClickListener(this, i, str, runnable) { // from class: kentos.loader.activity.MainActivity$$ExternalSyntheticLambda0
                        public final MainActivity f$0;
                        public final int f$1;
                        public final String f$2;
                        public final Runnable f$3;

                        {
                            this.f$0 = this;
                            this.f$1 = i;
                            this.f$2 = str;
                            this.f$3 = runnable;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            String str3 = "ۗ۬ۤۙۢۧۖ۫ۢۧۖۛ۟ۢۘۘۡۗ۠۟ۘۜۗۚۧ۠۠۟ۙۦۖۘۥ۟ۘۥۛۡۘۗۤۙۗۧۥۧۦۙۦۡۥۘۨ۟ۥۨۗۚۤۨۚۙۛ۠ۖۢۙ۬ۖۡۘۡ۟ۘۘۦۗۘۥۨۘۘ";
                            while (true) {
                                switch ((((((((((((((((((((((((((((((((str3.hashCode() ^ 773) ^ 503) ^ 896) ^ 815) ^ 809) ^ 891) ^ 917) ^ 749) ^ 796) ^ 419) ^ 289) ^ 337) ^ 179) ^ 687) ^ 617) ^ 164) ^ 830) ^ 959) ^ 660) ^ 398) ^ 592) ^ 188) ^ 161) ^ 563) ^ 91) ^ 9) ^ ViewUtils.EDGE_TO_EDGE_FLAGS) ^ 427) ^ 971) ^ 414) ^ 904) ^ (-196166962)) {
                                    case -1911749085:
                                        this.f$0.m260lambda$setupGameButton$8$kentosloaderactivityMainActivity(this.f$1, this.f$2, this.f$3, view);
                                        str3 = "ۨ۟ۥۘۚۡۨۘۡۘۦۦۤۖۘۜۘۡ۫ۡۖۘ۫ۧۡ۬ۙ۫ۢۧۜۗۜۢۛ۟ۛ۠۠ۗۖۘۘۨۜۡۘۚ۫ۢۤۤۘۖۢۨۘۤ۫۫ۥۨۨۘۥ۬ۗۨۛۥۘۜۚۚۨۜۤۙۥۖۦۥۘۜۙۜۘۥۚۖۘۢۖ۠ۗۗۙ۬ۢۖۘۖۚۤ۠ۤۦۘ۬ۛۖۘ۫ۥۘۙۘۘ";
                                        break;
                                    case -1767441084:
                                        str3 = "۟۬ۙۚ۟ۖۘۦۘۡۘۛۨۤۘۤۤ۬۫۬ۖۨۘۙۖ۟ۡۧۘۘ۫ۨۨ۬ۧۖ۟۫ۘۘۡۥۤ۠ۘۘۖۡۦۘۦ۠ۥۗۖۛ۬ۜۘۢۥۜۘۢۤۢۙ۬ۥ۬۬ۦ۟ۢ۟ۦۗۖۢۜ۬ۛۖۙ۠ۛۥۘۘۤۡۙۢۡۛۖۘۦۤۛۖۢۡۜۜۘۨۚۧۚۡۛۖ۫ۙۡۖۧۘۧۥۖۢۨۘۛۤۡ";
                                        break;
                                    case 1428979597:
                                        str3 = "ۢ۬ۨ۟ۤۦۖۧۘۘۤۥۧۦۘۚ۫ۧۛۛۙۜ۠ۜۨۛۤ۫۠ۡۘ۬ۜۚۦۜۘۙ۠ۦۘۧ۬۠ۦۨۧۙۘۚۢۗۥۘۨۚۜۨۥۚۡ۬ۦۘۜۘۨۘۗ۫۠ۨ۟ۤۡۚ۠ۚ۬ۖۘ";
                                        break;
                                    case 1505197139:
                                        return;
                                }
                            }
                        }
                    });
                    str2 = "ۜۚۡۘۤۛۗۥۗۨۘۤۤ۫ۛ۠۠ۨۘ۫ۛ۟ۦۢ۫ۦ۠ۨۚۙ۬ۗۦۨ۟ۦۜۡۢۜۡ۟۬ۚۛۗۦ۬ۙۚۖ۠۫ۡ۠ۡۘۖۤۜۤۢۘ۬ۚۜۘۚۚ۠ۚۜۙۡ۫ۥ۟ۘۜۢۚۗۙۜۦۘۤۦۘۢۤۥۘۛۧۖۗۢۦۤۧۡۜ۬۫ۦ۫۠ۘۖۧۘۙۜۚۗۚ۫ۛۢۦۛۤۚۢۡۥ";
                    break;
                case 819204392:
                    str2 = "ۘۗ۟۬ۗۖۘ۠۫ۧۘۘۥۦۡۘۙۥۨ۫۬ۥۦۗۦ۟۠ۖ۬ۜۢۜۘۖۜۧۨۘ۬ۧ۠ۚۦۖۘۚ۬ۘۤۖۘ۬ۖۧۘۡۘ۬ۛ۠ۥۦ۬ۜۧۧۦ۬ۥۢۜۧۤۛ۟ۜۖۦۚۡ۠ۧ۠ۛۖۚۜۘ۠ۤۡۘۛۢۡۦ۟ۧۙۤۡۥ۠۬ۢۗۖۧۖۘۛۗ۟ۛ۫ۢ۠ۗۨ۠ۥۛ۠ۤ۫ۤۖۖۘۧۜۛ۠ۥۘۧ۠ۜ۬ۖۜۘ";
                    break;
                case 1870727712:
                    str2 = "ۜۖۧۘۢ۬ۦۘۤ۫ۧۘۖ۬ۚۗۗ۟ۚۦۦۖ۫ۥۥۗۚ۟ۜۢ۫ۜۖ۫ۤۤۤۙ۠ۖۘۛۗۡۘۢ۫ۖۘۧۦۡۗۡ۠۬ۜۘۚۤ۫۠ۡۚ۫ۛۜۘۢۖۛۙۡۜۘۛۖۨۘۧۚۗۜ۠۬ۧ۫ۨۨۙۢ۬ۦۖۘۤۚۤ";
                    break;
                case 2038383357:
                    str2 = "۬ۗ۬ۨۧۡۘۨۗ۠۟۬ۥۦۢۧۙۖۡۘۥۗۥۜۥ۬ۛ۠ۘۘۧۛۗۨۤۜۘۛۗ۠ۥۡۥۘۤۤ۟ۦۦۘۗۨ۫ۧۧۡۘۢۛۗۨۙۜۘۛۙ۟ۡۧ۟ۤ۠۫۫ۦۥۥۜۦ۟ۘ۬ۦ۠ۢۗۡۘۥۤۢۗۖ۬ۢۘۘۧۜۨۘۙ۫۫ۧۖۖۘۚۧۨۥ۟ۨ";
                    break;
            }
        }
    }

    private void showDownloadCompleteDialog(String str) {
        LinearLayout linearLayout = null;
        int i = 0;
        GradientDrawable gradientDrawable = null;
        TextView textView = null;
        View view = null;
        MaterialButton materialButton = null;
        final AlertDialog alertDialog = null;
        String str2 = "ۜۜۥ۟۬ۗ۫ۚۡۥۙۗۚ۠۫ۡ۬۟ۘۢۛۨۘۘۡۗ۟ۧۙۤۥ۠ۤۗ۫ۘۜۨۘۖۜۛۥۥۙۗۘۦۘ۬ۡۧۨۗۖۧ۟ۗۧ۫۟ۢۡۥۘۖۡۥ۟ۡ۫ۥۥۗ۬ۖ۬ۛ۠ۖۗۜۥۘ۟ۛۨۘ۬۫۬ۘۡۘۨۗ۟ۖۥۘۘۧۦۙۡۘ۟ۧۦ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str2.hashCode() ^ 360) ^ PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW) ^ 665) ^ 236) ^ 163) ^ 981) ^ 111) ^ 314) ^ 848) ^ 740) ^ 188) ^ PointerIconCompat.TYPE_ALL_SCROLL) ^ 555) ^ 458) ^ 136) ^ 285) ^ 291) ^ 98) ^ 680) ^ 136) ^ 137) ^ 898) ^ 301) ^ 209) ^ 969) ^ PointerIconCompat.TYPE_CELL) ^ 549) ^ 526) ^ 921) ^ 49) ^ 608) ^ 1178936610) {
                case -2064439489:
                    view = new View(this);
                    str2 = "ۤۢۦۘۤۥۥ۬ۡۡۖ۬ۡۘ۬ۧۤۧۗۢ۟۟ۦۘۨۗۤۚۙۙۨۤ۟ۨ۟ۨ۬ۨۨۚ۫ۤ۬ۧۜۨۤ۠ۙ۠ۖۡۧۘ۟۟ۗۥۧۥۘۦ۫ۙۗۜۛۢۡۥۤۘۘۨۖۦۘ۫ۡۘۢۤۜۚۗۘۖۡ۬۟۠۟ۤۨۗۥۚۥۘۖۖ۬ۘۖۗۤ۟ۦۘۙۘۘۗۛۖۘۖ۠۠ۜ۠۫۫ۡ۬ۛۖۧ";
                    break;
                case -2055768826:
                    linearLayout.addView(view);
                    str2 = "۬ۖۖۙۧۘۘۘۖۘۘۖۗ۬۟ۚۥۜۗۥۗۢۨۘۥۥ۠ۜ۬ۡۘۜ۠ۨۡۢۛۥۗۖۘۜۤۦۙۧ۬ۤۘۨۘۤۦۛۢۧۦۢۖۥۙ۫ۛۛ۫۫ۖۛۥۗۦۡۢۤ۬ۖ۠ۜۘۥۛۚ";
                    break;
                case -1991284736:
                    linearLayout.setOrientation(1);
                    str2 = "ۜۧۥۡۤۙ۫ۖۤۖۤۡۢۢۗۛۢۗۢۨۜ۟۫۬۫ۤۛۦۖۦ۠ۤۖۙۨۛۡۛۧۧۖۚ۟ۥۘۖۖۙ۬ۘۜۦۜۘ۟ۢۘ۟ۘۤۗ۬ۢۥۡۦۘۛۛۢۦۥ۫ۛۤۙۡۖۡ۫ۡۤۥۤۤۢۧۖۘۢۨۗ";
                    break;
                case -1903366286:
                    linearLayout = new LinearLayout(this);
                    str2 = "ۘۗ۬ۗۚ۬ۚۛۜ۠۬۬ۙۘ۟ۨۜۧۘۜۡ۬ۖۦ۠ۘۤۨۘۙۖۧۛۙ۫ۗ۬ۚۛۤۥۨۤۘ۟ۙۗۜۡۙۦۜۘۤۚۖۚۢۤۗۡۡ۫ۤۡ۟۟۫ۢ۬ۤۡۢ۫ۢ۟ۙۖۜۘۜۖۨۧ۬ۜۢۥۜۘ۫ۢۡۛ۠ۥۘۙۛۨۨۜۜۛۘۗۜۥۨۘۡ۟ۗۗۨۘ۠۬ۢۤۢۦۤ۫ۨۘۨ۫۟۫ۖۜۘۖۧۥۘۜۦۜۘۦۤۛ";
                    break;
                case -1868842379:
                    view.setLayoutParams(new LinearLayout.LayoutParams(-1, m79dp(this, 20)));
                    str2 = "ۧۚ۟ۗۢۡۘۨۜۥۚۥۧ۫ۙ۫ۦۜۧۘۛۙ۠ۦۘۙۢۧ۠۬ۢۖ۫۬ۗۦۢۗ۠ۢ۟ۡۘۨۘۦۡۡ۫ۚۦۚۦۛۖ۟ۘۘ۠ۚۧ۫ۗۤۜۡۤۡۤۖ۫ۨۥۘ۫ۡۘۘۨۛ۫ۚۡۥۘۡۜ۫ۧۜۘۖۛۗۥۦۘۧۗۢ۬ۢۚۧۜ۬ۧۙۦۘۧ۬۬ۥۛۜ۬ۜۜۘ۬ۖۨۥۘۘۧۧۚ۬ۘۨ۟۫۠۠ۢۥۗۧۜۗۥ";
                    break;
                case -1803722590:
                    textView.setTextSize(18.0f);
                    str2 = "ۜ۟ۦۙۧۡۛۢۤۗۡۘۚ۠ۜ۫ۥۥۡۢ۠ۥۢ۠ۘ۠ۘ۟ۘۘۚ۬۫ۧۦۢۨۨۦۘۘۖۜ۫ۧۤۧۘ۫۫ۤ۠ۚۜۘۜۦۧۖ۬ۘۘۦۤۥۙۤۡ۠ۡۨۖ۠ۢ۠۠ۨۥۨۡۘۡۛ۠ۙۙۡۚۗۡۢۥۡۘۙۦۨ۬ۚ۫ۘۜ۟ۡ۟۬۟ۖۘۖۗ۬ۢۜۖۘۙ۟ۖۗۤۨۘۚۘۘۡۤۨۤۢۛۥ۠ۢۜۙ۠ۛۥۧ";
                    break;
                case -1337386617:
                    materialButton.setTextColor(-1);
                    str2 = "ۦ۫ۘۘۙۢۛۢۢۜۘ۠ۨۡۥ۟ۗۧۡ۠ۖۘۥۘۚۦۖۘۖۖۡۙۥ۠۫۠ۛۨۖۖۦۚۦۘۚ۫ۦ۠ۖ۬۫ۚۡۡۘ۠ۛ۫ۥ۠ۖۘۚۨ۟ۙۨۧۥۡۜ۟۬ۨۘ۟۟ۥۜۜۧۡۘ۠ۢۤۤۨۗۧۢ۫ۨۙ۫ۢۢ۟ۖۢۤ۠۠ۙ۠ۖۨۦۖ";
                    break;
                case -1086823913:
                    textView.setTypeface(null, 1);
                    str2 = "ۗۨۨۘۘ۬ۙ۫۫۠ۖۥۖۜۛۡۘۥ۟۟ۗۢۦۚۤ۫ۘۥۜۘۗۛۘۘۧ۫ۜۘۘۛۡۘ۫ۛۜۦۛۖۘۨۘۢۥۡۥۢۥۤۥۖ۟ۥۧۖۘۡۡۖۘۡۦۡۨۥۘۡۙۥ۬ۦۥۤۥۧۘۗۡۦۧۥۦۘۛۖ۠ۦۖۧۘۗۖۙ۫۫ۜۘۢۦۤ۠ۘۘۙۗۡ۟ۖۗ۫ۡۢۘۢۖۘۙۥۡۘ۠ۚۢ۟۫ۥۛۜۨۡۜۥ۫۠ۦۘۘۗ۠ۢ۟ۨ";
                    break;
                case -957314633:
                    textView.setGravity(17);
                    str2 = "ۖۘۨۢۖۜۘۡۙۦۘ۫ۜۘۚۡۘۡ۫۠ۘۨ۠ۦۡۘۘۘۚۥۗ۠ۙ۫ۛ۬۬ۘۨۘۖۜۡۖۖۖۘ۫ۡۙ۠ۜۘۘۦ۬ۜۢۨۥ۫ۢ۟ۧۡۘ۫ۖۚۚ۬ۦۘۨۙۦۨۘۜۘۥۚۧۦ۫ۖۘۛ۬۟۟۠ۗۤۢۥۘۗ۟ۧۙۙۡۘ۫ۜ۬ۚ۫ۜ۠۬ۦۘۙ۟ۙ";
                    break;
                case -918621745:
                    str2 = "ۦۨۧۥۨۘۗۘۘۧ۫ۗ۫ۡۜۨۧۡۛۢۙۥۢۦۘۥ۟ۙۘ۫ۤۙۨ۠۟ۙۥۘۢۨۡۥۜ۫ۚ۠ۤ۠ۛۖۗۢۡ۬ۖۗ۠۟ۘ۠ۗۢۨۙۡۘ۟ۦۛۡۨۘۦ۬ۙۢۡۙۦ۠ۨۘۚۙ۬ۖۗۗۤ۟۟ۙۥ۟ۧ۫ۢ۟ۗۘ۠ۛۜۚۗۧۛۥۡۨۨۘۡۜۘۢ۟ۜۦۘۦۘۙ۬ۧ";
                    break;
                case -668727608:
                    alertDialog.show();
                    str2 = "۟ۙ۟ۨ۟۫ۜۘۗۧۙۧۥۘۨۡۙۜۖۡۜ۠ۜۤۢۛ۫ۦۛۧ۟ۧۡۧۘۙۦۧۧۙ۠۠ۗۖۘۗۜۜۘ۫ۡۘۦۧۡۢۤۡ۟۬ۖۚ۫ۖۥۨۧۘۚۚۙۡۘۧۧۦۘۧ۬ۘ۫ۗۘۤۢۨۨ۫ۘۘۗۧۧۜ۟۠ۢۘۗۨۧۢۧۘ۟ۙ۬ۡۘۘۙ۫ۤۨۘ۠ۚۗۧ۟ۥۘۡۥۦۘۚۨ۟ۦ۫ۨۘۢ۟ۙ۟۬ۘ۬ۤۥۘ";
                    break;
                case -551832415:
                    String str3 = "۟ۗۨۘۗۤۦۘۛ۟ۡۢۡۤۜ۫ۤۦ۬ۦۘۡۚۤ۟۠ۗۧۦۢۖۘۘ۬ۖۧۘ۟ۧۨۛۛۡۘۜۧۙ۠۫۠۟ۛۡۘۢۙۚۜۖۘۤ۠ۨۘ۫۫ۖۚۤۧۚۘۙۜ۟۬ۥۨۘۗۨۢ";
                    while (true) {
                        switch (str3.hashCode() ^ (-2117629330)) {
                            case -946215416:
                                str3 = "ۦۖ۫ۦۚۢۡۦۛۧۘۛۥۤۘۘۡۜۜۦۚ۬ۖ۟ۚۡ۠ۦۧۘۜۜۛۜۧۗۨۧۙۖۘۨۛۡۘ۠۫ۗۦۢۥ۠ۚۧۗۛۤۥۨۗۦ۟ۥۘۚۘ۠ۨۧۥۘۛۡۧ۟ۡۥ۟ۡۖۘ";
                            case 994711324:
                                str2 = "ۛۙ۬۠۬۠ۚۗ۟ۥۦ۫ۧۡۨۥۜۘ۟ۦ۠ۖۢۚۨۗۦۘۤۥۙۨۗۥۗۙۖۚۦ۬ۤۤۘۙۧۤۗۨۥۘۜۜ۫ۚۢۨۘۤۘۡۘۧۙۦۘۨ۟ۥ۫ۘۡۘۘۚۖۘۢ۠۠ۥۢۦ۬۠ۜۘۦۢ۠۬۠ۢۤ۫ۦۦ۠ۦۧۨۖۘۢۗۜۘۖۗ۬ۢۘۥۘ۠ۤ۟ۧۗۨۛ۠ۜ۫۠ۛۡ۫ۜۖۖۨۘ";
                                continue;
                            case 1716394613:
                                str2 = "ۗۢۡۗۙۙۧۢۥۖۜۜۦۥۗۦۗۦ۟ۦ۬۬ۘۡۛۨۢۜۤ۬ۘ۬ۘ۫ۥۤۤۚۦۥۛۛۚۜۘۚۥۛۢۙۙۨۚ۟ۤۦۚ۠۠ۢ۟ۢۢۙۙۜۘۥ۫ۘۘۢ۬ۨۘ۟ۨۨۨۜۙۗۧۛۘۧ۫ۙۦۘۢ۟ۗۗ۬ۚ۟ۚ۠ۧۦۖ۟۟ۢۧۜۘۘ";
                                continue;
                            case 1761708700:
                                String str4 = "ۙۜۡۡۢۡۦ۫ۚۖۡۧۖۖۗ۠ۢۨۘۧۙ۬ۡۜۢۗۦ۠ۤۦۨۘۧۘۜۘۚۤۤۢۖۘۡ۠ۥۘۤۜۦۤۛۛۚۧۤۡۗۜۘۨۗۛۙۗ۟ۢۦۡۗ۠۫ۤۨۙۤۜۤ۫ۖۧۡۧۦۥ۠ۜۘۜ۟ۖۘۖ۠ۥۘ۟ۡ۠ۚۚۦۦ۟ۖۧۢۤۛۖۖۛ۬ۥۘ";
                                while (true) {
                                    switch (str4.hashCode() ^ 1316725546) {
                                        case -195802820:
                                            str3 = "ۡ۠ۨۘۨ۟ۦۘ۠ۤۘۘۜۚۘۘۥ۠ۘۘۦۗۤۜۗۙۦ۬ۥۥۤۨۜۨۡۘۘۖۧۘۡ۫ۗۖۤۘۤۗۡۜۛۜۘۧ۬۟ۚۨۨۧۢۦۘ۫ۚۧ۠ۗۛ۫ۦۙ۬ۢۜۖۙۜۙۦ۬۫ۙۙۙۡۜۘ۫ۖۥۖۘۥ۬۫ۥۘۗۖۡۘۛۜۘۘۘۡۢۡۖۜۘۘ۟ۙ";
                                            break;
                                        case 476277768:
                                            str4 = "ۡ۠۟ۧۢ۟ۖۤۨۖۜۘۡۡۢ۠ۢۥۗۦۡ۟ۦۛۙ۠ۗۖۡۘۘ۬۫ۤۜۥۢ۬ۢۜۙ۬ۗ۫ۚ۬ۚۚ۠ۙ۠۫ۧۨۘۨ۟ۧ۫ۜۧۗۜۤ۠۬ۙۨ۬ۙۨۜ۟ۘۧۨۘۘۘۖۛۜۘۗ۫ۗۦ۟ۨ۫ۚۚۘۗۗۧۙۘۘۥۤۢۦ۠ۥۧ۠ۤۙۤۜۘۡۜۨۘۢ۠۬۟ۘۧۤ۟ۘ۟ۤۧۘۘۘ۟ۚۖۘۜۖۢۙۘۦ";
                                        case 1175292313:
                                            str3 = "۟ۨۦۘۙ۬ۦۘۚۨۘۦۜۘۨۨۗۗ۠ۖۘ۫ۤ۫ۚۜۛۧۖۦۘ۬ۤ۬ۚۤۛۙۢۘۖۚۘ۠ۙۛۛ۟ۨۜۧۙۢ۫ۧۗ۟ۘۘۢۡۘ۫ۙۘۜۥۨۘۘۨۧۚ۬ۨۘۛۧۛۗۡ۟ۧۙ۠ۤۗۜ۠۟ۦۘۤۘۘۜ۠ۛ";
                                            break;
                                        case 1631099267:
                                            String str5 = "ۦۛۦۛ۬ۖۖۡۦۘۦۡۢۖۧۨۘۤۘۙۖۖۘۘۗۙ۬ۜۖۖۘۙۤۤ۬۠ۜۙ۟ۖۘۙۥۤۧ۫ۤۡۖۨۢۥۖۘۘۘۥۚۛۗۨۢۚۤۥ۬ۡۘۦۖۗۙۖۥۜۘۙ۟ۢۜۜۧۘۘۧۡ۠ۢ۟ۖۨۦۘۤۛ۬ۖۖۦۛۗۜ۬ۙ۬۟ۙ۟ۨۘۥۖۖۘۢۤ۟ۘۧۥۘ۠ۢۖۨۤۛۜۡۢ";
                                            while (true) {
                                                switch (str5.hashCode() ^ 457976819) {
                                                    case -2012583789:
                                                        String str6 = "ۚۥۤۨۙۘ۟ۖۤۗ۟ۚۖ۟ۘۘۡۥۦۖۜۗۛۜۛۦۘۘۥۙۛ۠ۗ۟ۡۖ۬ۤ۬ۡۢۚۘۘۥۡ۫ۚۦۖۘۜۙۡۘۦۡۨۘ۠ۚۘ۫ۥۧۘۙۦۘۘۡۤۢۖۜۖۡۘۤ۬ۢۡ۫ۧۙۘۚۖۨۨۖۨۚ۬ۢ۬ۧ۟ۘ۠ۨ۟ۨۘۥۧۗۘ۠۠ۥۗ۬ۙۗ۟ۨۢۜۘۡۖۚۦۤۢۛۥ۟ۢۥۘۜ۬۫ۨ۠۬ۗ۫ۡۘۖۜۦ";
                                                        while (true) {
                                                            switch (str6.hashCode() ^ (-855272187)) {
                                                                case -1207850642:
                                                                    str5 = "ۢۥۨۨۚۤۙۧۨۘ۟ۤۜ۬۬ۗۥۤۘۘۗۚۤۥۗۨۨۗۨۘۙۙۚۘۡ۫ۥ۫ۛۙۦۨ۬ۜۘۤ۟ۖۨۨۘ۠ۧۛۖۦۘۧ۟ۗ۠ۨۜۡۧۜ۬۟ۦۨۥۧۘ۟ۦۦۛۖۦۘۢۘۥۖۧۘ۠ۨۤۧۚ۟۫ۘۡۦ۬۠ۦۡۙ۟ۜۙۨ۫ۧۦۘۢۡۧۘۗۛۗ۟ۚۥ۟ۦۛۜ۫ۨ";
                                                                    break;
                                                                case 444366937:
                                                                    str6 = "ۤۗ۟ۚ۬ۖۛۜۚۚۨۜۘۥ۫ۤ۟ۙۘۘۢۛۚۥۗ۟ۦۨۧۜۤۖۢۧۘۜۧۘۘۚۘۨۜۡ۠ۙۖۡۘ۟ۗ۫ۥۚ۠ۛۤۡۘۙۗۘۘۥۗۤۘۛۥۘ۬ۨۡ۬ۥ۟ۤۗۖۘۛۢۜۘۢۢۥ۠ۙ۬ۨۥۦۘۤۡۧۘۦۙۦۘ";
                                                                case 458943679:
                                                                    str5 = "ۖۗۖ۠ۗۦۡۙۦۚ۠ۜ۬ۜۡۧۤۡۦ۬ۜۘ۟ۧۢۖۤۥۘۜۘۚۙۛ۟۬ۙۖۘۛۛۖ۬۠ۛ۫ۧۖۙۥۘۢۛۡۧ۟ۦۛۤ۫ۤۦۥ۠۬ۨۘۜ۬۫ۖ۬ۥ۠۟ۥۚۡۘۨۛۘۘۜۧۥۗۧۢۤ۬ۛۜۜۤۗۡۛۥۡۦۡۢ۫ۢۡۦۘۡۜۥۘ";
                                                                    break;
                                                                case 1860997043:
                                                                    String str7 = "۬ۗۡۗۘۗۖ۫ۖۛۡ۫۬ۛۚۙۧۗ۬ۘۤۙۛۗ۬ۨۘۡۤ۠ۤ۬ۧۥۘۘۧۨۡۦۥۤۚۚۙ۠ۖ۟ۛ۫ۚۤۨۛۦۨۘۙۘۘۘۦۘۨۘۗ۠ۢۖ۟ۦ۫ۚۨۙۢۙۖ۟ۜۘ۫ۨۖۗۙۛۘۛۛۥۤۦۘۚ۫ۦۘ۠ۖۥۜۧۙۢۖۖۖۥۥۢۨۦۘۚۙۥۨ۫ۖۨۧۖۜ۬ۨۘ";
                                                                    while (true) {
                                                                        switch (str7.hashCode() ^ 871545160) {
                                                                            case -1231864991:
                                                                                str6 = "ۙۥۘۦۗ۫ۨۚۥ۫ۛۥۘ۟ۧۗۧۙۨۚ۫ۦۧۨۘۨۖۢۖۚۘۘۥ۟ۨۘۘ۠ۘ۟ۥۖۘۚۤۗ۟ۚ۬ۘۨۧۢۥۜۚۤۖۨ۫ۢۖۘۚ۬ۤ۬ۧۗۤۘۡۘۢ۠ۙۥۦۚ۫۠ۖ۟ۥۡ۫۠ۘۘۢۙۗ۫ۛۡۘ۫ۚۥۘۢ۬ۡۢۘۨۘۜۧۘۤ۬ۡۢۘۧ۟ۘ۟۠ۗۖۤۨ۠۠۬۬ۚۚۨۛۧۜۡۦۦ۟ۤۢۚۡ۠";
                                                                                break;
                                                                            case -1017423271:
                                                                                str7 = "ۡ۠ۖۦ۠ۗ۫ۙۛۤۦۜۘۤ۫ۙۚۗۦ۟۬ۡۧۘۘۡۨۘۘۜۚۨۢ۠ۙۢۧۚۡ۟ۚ۟ۡۡۘۡۘۙۗۥۘۗۘۥ۟ۨۥۘۘ۫ۚۢۙۧ۬ۘۘۙ۠۬ۗۦۚۧ۠ۦۧۜۨۘۖۛ۠ۤۧۨۛ۫۟ۡ۫ۨۘ۬۟ۨۘ";
                                                                            case -428921974:
                                                                                str7 = alertDialog.getWindow() != null ? "۬ۦۚۙ۟ۘۘۢ۠ۚ۟ۚۘۘ۠ۦ۟ۤۡۘۧۗۘۨۜۖۘ۟ۧۚۤ۫ۖۘۨۡۡ۫ۚ۟ۙۢۧۚۧۨۘۗ۬ۜۖۗۡۤۦۥۘ۠ۜۢۧۚۥۘۚۥۘۘۖۨ۟ۧۗۨۘۘۚۦۘۚۚۥ۟ۜۘ" : "ۙۙۜۘۖۙۚۘۗۙۗۢ۫ۥۢۜۛۧۛۧۖ۫ۘۥۘۛۧ۟ۜۨۛۛۜۥۡۨۨۧ۠ۡۘۤۤۥۙۥۧۧ۬ۡۤۚ۬۬۟ۛۖۤۦۘۧۢۛۥۥ۠۟۟ۦۘ۟ۢ۫ۛۢۨۘۚۗۘۘۛۗۛ۫ۨۜۘۚۢۥۘۖۦۧۘۥ۟ۛ۠ۙۜۢۧ۟ۦۛۨۘۢۚۥ";
                                                                            case 454974976:
                                                                                str6 = "ۖۙۚۗۘۢۘۚۗۢۗ۫ۥۨۥۗ۠ۨۘۢۥۗۚۤ۟ۥۤۨۨۚۦۖ۫ۙۜۦۨۘۙۥ۫۬۟ۙۘۖ۬ۜ۠۬ۡۢ۫ۧ۫ۧۧۖۨۛۗۢۗۦۖۘۦۦۨۘ۫ۘۖۘۖ۬ۡۘۡۚۥۤۖۡۘۧۚۜۘۚۧۛ۟ۦۘۡ۟ۨۖۥۡۘۦۘۚۚۗۤۡۧۖۘۖۥۡ";
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case -1420019852:
                                                        str4 = "ۙۖۨۘۧۨۛۘۦۨۤ۬ۗۖۢۨۥۤۦۘ۠ۡۘۥۧۨۧ۠ۚۛۢۖۘ۠ۢۧ۠ۦۘۨۘۦۘۧۚۨۘ۠۟۫۬ۗ۬ۤۧۜۘۚ۫ۢۢۦۗۖۙۥۘۨ۠۫ۛ۬ۥۘۘۜۜۙ۬ۢۥۘۘۙۧۡۘ۬۠ۤۙۙۜۘۨ۟ۖۘۜۨۧۘۗۛۦ۟ۙۛۥۘۘ۟ۢۡۘۚۥ۫۬ۜۤۢ۫ۤۨۜۘۧۙۥ۫ۨۢۨۖۦۗ۫۬ۢۤۨۘۦۦۨۡ";
                                                        break;
                                                    case -59829724:
                                                        str4 = "۟ۘۡۘۢۛۘۘۢۛۡۘ۬۫ۘۙ۟ۗۧۙۨۘۤۡۥۗ۫۠ۢ۟ۗ۟ۤ۠ۢۜ۫۟ۙۦۘۨ۫ۨۗۗۢۨۘۖ۟ۧ۠ۡ۬۟ۗۡۖۘۗۤ۟۟۬ۢۧۗ۟ۚۛۘۘۨۥۥۘۥۛۘۘۛۙۗۤۘۛۖۢ۠۬ۥۚ۫ۧۤۜۚۡ۬۠۟ۙۛۨۘۤۜۢ۟۫ۡۘۚۡۜۘۜۥۤ۫۠ۛۡ۬ۘۘۗۗۤ۟۟۬ۧۘ۟ۘۛۨۘۨ۟۟ۥۖۧۘۥۨۜۘ";
                                                        break;
                                                    case 632736942:
                                                        str5 = "ۗۥۨۘ۟ۚ۬ۡ۟۟ۧۙۦۤۦۥۨۦۦۦ۟ۧۧۖۦۘۨۧۜۘۚۗۡۧ۠ۖۘ۬ۧۡۗ۟ۨۘۗۜۡۘ۟۫ۨ۟ۙۨۘۚۘۜۘۗۦۛۘ۫ۡ۫ۨ۬۟ۡ۠ۜۤۡۙۛۦۘۘۘۜۘۦۡۘۨۧ۫ۢۥ۬ۜۡ۟ۢۖۦۘۜۥۥۜۙۦۙۚ۫۫ۜۛۖ۬ۖ۬ۡۗ";
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -519503438:
                    linearLayout.setBackground(gradientDrawable);
                    str2 = "ۚۦ۟ۧ۟ۜۘۚۙۜۥۦۦۘۚۢۖۘۥۙۖ۠ۚۖۘۚۛۦۤ۫ۡۧۨۥۧ۠ۖۨ۫ۦ۠ۗۛۧۜۘ۫۬ۥۡۚۛ۫ۗۨ۠ۢ۫۠ۗۧۘ۟ۛۤۡۘۨۖۦۙۘۘۘۚۖۚ۫۫ۖۘۨۧۖۘ۬ۜۗ۬ۨ۠۫ۛۧۦۛۢ۠ۡۘۖ۬ۘۘۘۤۛ۫ۜۖۡ۬ۗ";
                    break;
                case -510681477:
                    materialButton.setOnClickListener(new View.OnClickListener(alertDialog) { // from class: kentos.loader.activity.MainActivity$$ExternalSyntheticLambda11
                        public final AlertDialog f$0;

                        {
                            this.f$0 = alertDialog;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            String str8 = "ۗۚۥۘۧۛ۠ۦۤۦۘۛۨۜ۠ۢ۫ۡۗۨ۟ۤ۟ۡۧۙ۫ۚۛ۟۫ۙۚۢۖۘۧۖۨۘۖۡۤۗۢۜۘ۟ۧ۟ۡۛۘۘۨۖ۠ۘۤۢ۫ۚۗۨۧۥۘۢۛۡۘ۠ۧۘۡۜۘۘۙۙ۫ۗ۬۟ۧ۬ۨۧۥۨۢۥۖۥۦ۠ۜ۠ۢ";
                            while (true) {
                                switch ((((((((((((((((((((((((((((((((str8.hashCode() ^ 537) ^ 752) ^ 76) ^ 351) ^ 389) ^ 279) ^ 142) ^ 301) ^ 482) ^ 674) ^ 368) ^ 626) ^ 295) ^ PointerIconCompat.TYPE_VERTICAL_TEXT) ^ 536) ^ 704) ^ 581) ^ 459) ^ 773) ^ 285) ^ 692) ^ 801) ^ 736) ^ 517) ^ 463) ^ 970) ^ 121) ^ 835) ^ 743) ^ 545) ^ 20) ^ (-2020381212)) {
                                    case -1483609215:
                                        MainActivity.lambda$showDownloadCompleteDialog$17(this.f$0, view2);
                                        str8 = "ۛۘۚ۠ۚۘۜۖۘۨۧ۬ۚۜ۠ۦۨۖۦۦۘۨۦۨ۠ۡۧۧۖۢۚۤۛ۫ۥۗۗۧۖۛ۟ۜۗۡۥۘۧۘۦۘ۬ۛۡۘۥۜۥۘ۟۬۫ۤ۠ۙۘ۠۬ۘۗۨۘ۠ۗ۫۠ۡۜۘ۬ۥۖۘ۬ۘۖۦ۬ۥۘ۠ۦ۟ۨۦۘۙۚۧۙۤۡۘۨۖۚۘۧۙۧ۬ۨۤۤ";
                                        break;
                                    case -633960258:
                                        return;
                                    case -600932549:
                                        str8 = "۠ۘ۠ۤۤۡ۟ۤ۫ۤ۬ۨۘۜۢۢۤۨۘۧۖۨۛۧۧۧۛۦۘۙ۬۠ۙ۠ۨۨۥۦۨۨ۫ۖۥ۫ۙ۟ۖۘ۫ۗۢۢۛۧۢ۠ۢ۬ۖۨۘۧۦۘ۫ۛ۬۫ۨۨۘۧۢ۬ۘۦۢۢۜۚۗ۬۬۬ۘۥۧ۬ۦ۬۫ۚۤۖۡۘ۫ۙۦ۫ۖۡۗۦ۬ۚ۬ۚۘۡۖۘ";
                                        break;
                                    case 484397832:
                                        str8 = "ۧۙ۬ۥ۟ۥۘۖۘ۬۟ۙۖۘۤۖۡۘۘۦ۠ۤۦۘۘۦ۟ۢ۬ۜۧۘۖ۟ۤۦۡۚ۫ۨۘۘۢ۬ۡۘۖۘۤۦۛۦۘ۠ۜ۫ۦۗۜۘۦۘۜۛۧۧ۬ۤۡۤۙۛۤۙۥۥ۬ۥۘۛۘۨۘۘۘۦۘۥۦۦۥۘۨۗۦ۟ۛۨ۬ۙ۫ۗۙۥۗ۟ۙ۬ۖۚۧۜۙۢۖۚۜۘۗۚۤ۬۠۟ۧ۬ۖۘۥۥۘۥۖۖۘ";
                                        break;
                                }
                            }
                        }
                    });
                    str2 = "ۥۙۦۖۤۤۙۗۦ۫۬ۘۗۖۚ۬ۤۖۘۗۢۨۖۢۡۗۨۧۤۖۥۜۨۙۡۙۜۖۦۘۨۦ۟ۤۦۧۘ۟ۜۦۖ۫ۗۛ۬ۙ۟ۘ۫۫ۨۗۛ۫ۨۗۥۨۘۙۚۨۘۖ۫ۨۘۜ۫ۘۘ۠۠ۗ۠ۛ۠ۜۜۥ۟ۗۦۙۜ";
                    break;
                case -437556260:
                    textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                    str2 = "ۗۦۗ۫ۢۥ۫۬۫۟ۘۗۙۧۥۘۤ۫ۨۡ۠ۧ۠ۛۥۘ۫ۨۦۘ۫ۚۦۘۘۦ۫ۧۦۥۘۛۡۨ۬ۗ۠ۡۜۗۚۨۡۘۜۛۨۘ۠۟ۥۚ۟ۧۤۖۗ۠ۛۤۡۨۙۜۜۘۘۙۧۡۘۡۜۨۙۛۜۘۧ۠ۧۥۙۧ۠۬ۜۘۛۗۜۘ";
                    break;
                case -240696192:
                    linearLayout.addView(materialButton);
                    str2 = "ۤۥ۟ۖۤۛۜۚۘۘۡۚۖۘۦ۬ۗ۠ۖۖۥۚۥۢ۠۫۠ۘ۠ۗ۬۠ۢ۠ۨۤۚ۠۬ۨ۠ۧۨۜۜۡۥۧ۠ۘۦۥۘۜ۬ۥۘۚۧ۬ۦۛۥۘۨ۬۬۫ۦۖۘۢۨۤۤۢۘۚ۟ۜ۠ۤۚۨۨۙۖۧ۠ۛ۫ۤۤۢۤۜۨۦۘۢ۠ۦۚۗۤ۬ۢ۟ۗۤ";
                    break;
                case -166527446:
                    materialButton = new MaterialButton(this);
                    str2 = "ۨ۬ۗۧۚۨۨ۬ۜ۬ۘۛۥ۫۟ۗۜۥ۬ۜۚۡ۠ۦ۬ۘۤۧۗ۟ۘۘۤۤۚۖۖ۫ۙ۟ۦ۠ۛۡۘۘۚۧۜۨ۬ۖۘۨۤۨۘۦۧ۫ۥ۫ۤۨۖۙ۫ۜۥۘ۟۟۠ۤۥۙۥۤۦ۬ۘۛۖ۬ۦۨۢ۠۠ۧۚۘۙۖۜۚ۠ۨۜ۫۟ۢ۫ۖۧۖۤۘۦۘۢ۫ۖۚۗۡۨۜۨۘۡۛۢ۟ۢۤ";
                    break;
                case -112118410:
                    linearLayout.addView(textView);
                    str2 = "ۤۖۧۘۜۢ۟ۘۙ۫ۨ۬۬ۧ۠ۛۡۢۙۦۛۥ۠۠ۘۤۧۥۘ۬ۖ۬۟ۧۨۘۗ۠ۡۢۘۨۖۡۘۘۡۖۥ۬ۥۦۘۧۦۚۤۡۜۘ۫ۗۘۘۡۨۢۗۧ۟ۗۥۦۘۥۢۤۨ۠ۤۧۨۤ۟ۖۚۢۚۖۙۘۨ۟ۜۛۚۘۘۚۦ۟۟ۡۘۗۨۥۘۖ۬ۡۗۨۚ۫ۨۘۨۧۦۗۘۛۖۙۧۗ۠ۤۖۡۘۗۛ۫ۘۤۛۘۘۢۛۗۖۘ";
                    break;
                case 192030752:
                    materialButton.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(Deobfuscator$$app.getString(-3440727511446413129L))));
                    str2 = "ۘۤۥۨۚۨۘۛ۠ۘۘ۟ۘ۟ۛۢۘۘۧۗۘۘۨۨۛۚۖ۫۬۫ۖۡۜۛۙۛۜۘۥۨۦ۠۠ۥۘ۠ۨۖۘ۟۬ۡۘۤۚ۠ۜۤۦۧۦۥۘۚۧۜۘۢۢۨۨۥۘۙۚۦۡۛۘ۟ۨۧۘۢۖۡۘۖۤۖۛ۟ۢۘۘۢۨۗۦۘۜۛۗ";
                    break;
                case 365531906:
                    gradientDrawable.setColor(-1);
                    str2 = "ۧۖۥ۠ۛۘۚۜۡۧۜۢۧۛۢ۫ۗۚ۠ۜۘۛۖۙۗ۫ۘۦۥۧ۟ۤۖۚۤۖۨۤۢۘۦۥۚۗۡۧۘۧۡۖۘۙ۬ۙۧۨۥۦۨۤۨۛۚۥۨۦۖ۠۫ۗۘۥۦۖۘۥۤۜۙۚۦۘۥۢۛۥۦۨۘۦۥۜۘ";
                    break;
                case 465272729:
                    materialButton.setText(Deobfuscator$$app.getString(-3440727524331315017L));
                    str2 = "ۨۨۥۡۥۛۡۖۡۦۖۜۗۥۡۘۨ۠ۤۧۨۢۤۘۧۨۨۧۖۖۘۛۘۧۦۨۡۘۖۜۨۘ۠۫ۦۢۥۤۥۧۡ۠۟ۘۘۛ۠ۡۘۙۛۙۛ۫۟ۙۛۚۦ۫ۡۘۧۘۧۘۦۚۧۜۜ۠ۜۡۘۛۜۡۘ۟ۢۧۘۥۗۡۦۦۘ";
                    break;
                case 477934777:
                    textView = new TextView(this);
                    str2 = "ۨۗۖۡۥۚۖۢ۫ۚ۬۠ۛۧۥۤۦۘۨۦۜۘۖۨۢ۫ۨۡ۟ۡ۬۫ۜۘ۬ۢۜۘ۫ۧۡۘۖ۫ۦۥۖۦۡۙۙۖۖۘۘۨۧۘۘ۬ۚۥۘۘۢۖۘۦۡۢۧ۠ۖۧۖۨۘۚۚۗۛ۬ۡۧۗۜۘۛۤۘۘۙۨ۬۠ۡۦۡۡۡۘ";
                    break;
                case 512709630:
                    alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                    str2 = "ۛۙ۬۠۬۠ۚۗ۟ۥۦ۫ۧۡۨۥۜۘ۟ۦ۠ۖۢۚۨۗۦۘۤۥۙۨۗۥۗۙۖۚۦ۬ۤۤۘۙۧۤۗۨۥۘۜۜ۫ۚۢۨۘۤۘۡۘۧۙۦۘۨ۟ۥ۫ۘۡۘۘۚۖۘۢ۠۠ۥۢۦ۬۠ۜۘۦۢ۠۬۠ۢۤ۫ۦۦ۠ۦۧۨۖۘۢۗۜۘۖۗ۬ۢۘۥۘ۠ۤ۟ۧۗۨۛ۠ۜ۫۠ۛۡ۫ۜۖۖۨۘ";
                    break;
                case 566282181:
                    str2 = "ۗ۠ۘۦۢۧۙۡ۫ۚۘۡۡۨۢۧ۟ۡ۠ۘۙ۫۠ۥۘۥۡۦۛۛۜۘ۬ۙۢ۠ۨۘۡۨۥۘ۬ۤۙۙۦۡۢۙۘۘۜۡۙۜۖۙۥۡۡۡۙۨۛۥ۫ۚۥۖۢۙۛۙ۫ۛ۟ۥۥۘ۬۟ۜۘۚۨۡۘۡۡۖۜۗۜۚۙۥۘۡ۠ۦۜۧۧۚۡۖۜۜۥۜۥۥ۠ۨ۠ۤۛۖۥۧۚۛۖۙۡۗ";
                    break;
                case 594108242:
                    return;
                case 748810143:
                    gradientDrawable = new GradientDrawable();
                    str2 = "ۖۘۧ۠۫ۘۨ۟ۥۜۧۡۙۨۡۘۢۖۡۨۡۥۘۢۤۡ۫ۜ۟ۨ۟ۖۘۡۤۛۛۖۚۘ۠ۧۥۙۦ۠۫ۙۡ۠ۧۖۥۗۘۙ۠۫ۥۜ۠ۗۤۤۦ۠ۤۜۡۘۘۨۚۦۙۜۘۙۡۧ";
                    break;
                case 901637371:
                    linearLayout.setPadding(i, i, i, i);
                    str2 = "ۧۘۧۘۨۜ۬ۡۦۜۤۛۛۜۤۡۨۖۖۚۙ۫ۨۘۖۘۥۤۜۘۧۜ۬ۗۚ۟ۖۦ۟۫۬ۘۥۛ۬ۢۤۛۖ۠ۦۖۙۖۘۤ۫۟ۖۛۜۨۖۦۤۚۥۘ۟ۨۨۘۖۛۘۘۗۙۘۘۨۢۙ۬ۧۖۘۘۧۡ۠ۘۦۘۦۘۥ۟۠۫";
                    break;
                case 1406119350:
                    linearLayout.setGravity(17);
                    str2 = "ۦۚۘۘۘۤ۠۠ۚۘۦۖۘۗۡ۠ۙۧۧۗۨۨۚۨۡۘۖۛۢ۬۟ۦ۠ۜۡۘ۬۬ۧۘۜۧۘ۠ۙۧۧۖۧۘۨۗۘۥۜۘ۬ۚۦۤۧۗ۬ۡۨۡۤۗ۠ۜۘۙۡۘۘۤۢۙۙ۫ۨۘ۠ۚ۫ۖۥۧ۬ۨ۠ۙۗۚ۠۟ۧ۬ۚۘۗۤۜۗۙۧۙۧۦۢۦۘ۟ۢۨۘۚ۠ۜ۟ۖۙ۫ۧۥ۠ۜۗ";
                    break;
                case 1532214928:
                    textView.setText(Deobfuscator$$app.getString(-3440727309582950217L) + str + Deobfuscator$$app.getString(-3440727571575955273L));
                    str2 = "ۛۡۦ۫ۚۦۦۛۡۘۚ۬ۛۖۖۘۨۡ۟۟۟ۥۘۤۜۜۘۘۛ۟۟۟ۦۘ۠ۖۚۜۡۦۛۜۛ۬۟ۚۛۗ۟ۤۖۛۢ۠ۧۨۛۨ۬ۥۦۤۤۧ۬۬ۙۥۤ۫ۜۛۙۦۚۖۤۗۙۚۚۚۜ۠ۛۨۤ۬۫ۘۘۦ۠ۖۗ۠ۗ۫ۜۥ۟ۡۜۡۢۥۥۤ۠ۤۛۘۛۜۦۚۛ۠ۚۤ۫ۨۦۚۛۦۗۙۦۜۜ۟ۧۡۗۜ";
                    break;
                case 1749679033:
                    gradientDrawable.setCornerRadius(m79dp(this, 8));
                    str2 = "ۥ۬ۛۤ۬ۖۧۜ۠ۧۖۜ۫ۛۛۖۙۧ۟ۙۜۡ۟ۢۘۘۦۙۥۤۜۨۘۖۦۦۘۤۡۧۘۛۦۡۦۛۖۘۚۢۙۥۛۖۘۖۖۦۘ۫۟ۢ۠ۦۖۛۖ۠ۖۘۧ۟ۨۦۗۤ۬ۥۤۖۘۦۙۛۢۙۥۘۘۦ۫ۧ۠ۨۘۗۥ۫ۘۜۖ۫ۜۦۘۡ۠ۚۦۜۘ۠ۚ۫ۤ۬۬۠ۖۡۘۧ۟ۜۘۨۢۜ۠ۨۚۦۧۧۨ۬۫۬ۖۜۖۗۜۘۥۖ";
                    break;
                case 1761421932:
                    i = m79dp(this, 24);
                    str2 = "ۥۡۤۖۡۥۘۢۦ۫ۨ۟ۜۘۡۢۖۘۦۢۘۘ۫ۘۧۘۚۦۖۨ۠ۙۜۨۥۗۗۢۥۛۨ۫ۧۦۚۖ۬۬ۧۖۗۘۘۥ۠ۥۘ۬ۤۙۛۚۘۘۖۙ۬ۛۡۦۡۦۥۢۥۦۚۜۦۘۧۚۡۙۗۦۙۖۦۘۨۘ۟ۖۙ۟۟ۗ";
                    break;
                case 1903460185:
                    alertDialog = new AlertDialog.Builder(this).setView(linearLayout).setCancelable(true).create();
                    str2 = "ۡۥ۬۫۟ۜۘۘۨۜۤۦ۠۫ۨۥۘۤۡۦۦۘۖۡۡۘۗۖۚۘۨۜۙۙۖۦ۫ۨۛۘۚۡۨۜۘۧۖۧۜۡۘۘۤ۠ۧۙۦۘۘ۬ۧۨۤۙۤۙۢۗۢۖۧۚۖ۠ۢۚۙۛۖۡۛ۬ۙۗۚۤۨۨۡۘۛۦۤۧۗ";
                    break;
            }
        }
    }

    private void showErrorDialog(final String str) {
        String str2 = "ۡۤ۫۟ۡۘۘۤ۟ۖۘۖۙۚۨۥۘ۟ۛۥۛۡۥۗ۠ۦۧۗۨۘۗ۫ۢۡۥۛۛ۟ۢۖۙۜۘ۟ۚۡۦۨۘ۠۠ۗۛۧ۬ۤۗۘۗۛۚ۠۬ۢۤۘۦۘۚۡۨۘۤۥ۬ۚۥ۟۠ۛۙۚ۫ۙۜۗۡۘۛ۬ۤۥۗ۠ۙۥۤ۟ۧۜۘ۬ۦۦۗۨۚۡۜ۠۬ۤۜۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str2.hashCode() ^ 390) ^ 948) ^ 712) ^ 714) ^ 898) ^ 629) ^ 807) ^ 93) ^ 403) ^ 216) ^ 453) ^ 770) ^ 366) ^ 311) ^ 273) ^ 1001) ^ 454) ^ 459) ^ 900) ^ 853) ^ 133) ^ 915) ^ 142) ^ 110) ^ 236) ^ 934) ^ 999) ^ 616) ^ 564) ^ 209) ^ 681) ^ 565253671) {
                case -567712467:
                    runOnUiThread(new Runnable(this, str) { // from class: kentos.loader.activity.MainActivity$$ExternalSyntheticLambda19
                        public final MainActivity f$0;
                        public final String f$1;

                        {
                            this.f$0 = this;
                            this.f$1 = str;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String str3 = "ۡۙۤۗۨۡۖۙۖۢۙ۫ۤۚۦۡ۬ۗ۫ۤۙۡۙۨۤ۟ۢۗ۟ۛۛۙۚۚۧ۟ۨۙ۠ۙۜۧۘۢ۬ۨۖۗ۠ۚۧۧۤۢۡۘۚۨۗ۟ۥۡۘۙۡ۠ۘۡۛۨۚۘ۠۠ۧۖۘۘۤۜۘۘ۬ۙۨۢۙۙۖ۠ۖۙۧ۬ۥۛۦۘۙۚۧۘۧۘۡۦۧ۬ۤۨۘ";
                            while (true) {
                                switch ((((((((((((((((((((((((((((((((str3.hashCode() ^ 354) ^ 417) ^ 110) ^ 168) ^ 899) ^ 803) ^ 199) ^ 292) ^ 824) ^ 156) ^ 575) ^ 226) ^ 842) ^ 204) ^ 324) ^ 77) ^ 594) ^ 448) ^ 61) ^ 749) ^ 846) ^ 53) ^ 717) ^ 51) ^ 978) ^ 782) ^ 738) ^ 999) ^ 332) ^ 157) ^ 678) ^ 1292378721) {
                                    case -2036401311:
                                        this.f$0.m261lambda$showErrorDialog$18$kentosloaderactivityMainActivity(this.f$1);
                                        str3 = "۠ۤ۠ۡۖۧۘۨ۟ۖۘ۬ۙۤ۟ۜۢۢ۟ۡ۟۟ۖۡۖۖۢۨۧۖۚۢ۠۬ۨ۟ۥۡۘۦۜۧۘۦۨۜۘ۟ۦۦۢۛۤۗۗۖۨۗۜۜۛۚۙۨۘۥۨۛۨۢۤ۟ۜۤۡۛۧۢۛۥۘ۬ۦۧ۬۬ۥۘۚۧ۫ۨۤۡۡۨ۫ۙۜۘۧۥۧ۬ۖۘۖۖۘۨۦۦۘ";
                                        break;
                                    case -739695549:
                                        str3 = "۠۟ۖۘۨ۠ۘ۟ۜۜۘۦۗۦۛۙۨۗۤۥۤۡۤۤۚۦۘۘۘۤۘۧۘۡۨ۬ۥۤ۫ۙ۟ۢ۠ۡ۬ۦۤ۠۬ۖۗۗۖ۠۠ۡ۟ۦ۟۟۠ۢۙ۠ۘۗۢۙۙۘۨۧۘۙ۠۬ۖۥۘۘۢۡۛۢۚۘۡۖۨۛۨ۠ۛۙۖۡۡۜۘ۟ۦۧۦۘۡۜۘۦ۬ۖۙۗ۫۫ۚۘۘ۬ۡۖۢ۬۬ۧۢۨۜ۟ۤۙۗۧۤۚۡۘ۟۟ۡ۬۠ۜ";
                                        break;
                                    case 209016451:
                                        return;
                                }
                            }
                        }
                    });
                    str2 = "ۙۦۢۨۨۥۘۢۢۥۧ۬ۗ۬ۨۜ۫ۨۦۘۗۡ۬ۥ۟ۢ۬ۚۙۜۛۦ۫ۧۡۥۡۘۜۢۖۘۙۧۨۘۦ۫ۧۛۙۜۘۡۧۛۜۨۖۘۤۗ۬ۥۛ۟۫ۦۜۘۗۤ۠ۧۛۚۘۘۜۚۚ۠۫ۤ۬ۤۡۜ۟ۧۡ۟ۗ۬ۖۦ۫ۖ۫ۙۗۥۖۙۘۥۥۦۦۚۡۧۘۢۗۘۜۡۨۨۘۡۖۛ۬ۢۦۤۙ۠ۤ۫ۙ۠ۢۖۘ۠ۖۧۘۨۖۜ";
                    break;
                case -471498203:
                    return;
                case 1572810213:
                    str2 = "ۘۜۧۖۧۜۘۤ۬ۙۢۨۥۘ۠ۧۚۡۡۛۚۢۖۘ۟ۦۖۘ۟۠ۨۗۢۧۙۦۚ۬ۨۥۘۜۡۨۛۗ۠ۢۧۜۘۢۤۖۛۖۗۥۗۘۦۢۖۘ۟ۙ۠ۨ۟ۤۜ۟ۨۘ۟۠ۥۢۙۡۘۖۨۨۘۨ۬ۙۜۧۧۨۛۛۛۧۥۥۙ۠ۚۤۗۦۧۘۧۡۧۘۜ۬ۙ۠ۗۢ";
                    break;
                case 1603533901:
                    str2 = "ۤ۟۬ۙۧۘۘۖ۬۬ۜۤۗۗۨۗۜۦۨۘۖ۟۠۫۫۠ۡۜۘۧۧۜۢۤۤۛۦۗۥ۠ۚ۬ۦ۠۫ۗۖۥۧۨ۠ۜ۬ۙۥ۫ۨۜۘۙ۠۬ۥۖۙۗ۬ۗۤۨۦۘۡ۫ۤۙۖۘۘۖۡۚۗۦۜۛۗۢ۬ۥۘۘۖۨ";
                    break;
            }
        }
    }

    private void showStyledDialog(String str, String str2) {
        LinearLayout linearLayout = null;
        TextView textView = null;
        TextView textView2 = null;
        LinearLayout.LayoutParams layoutParams = null;
        LinearLayout linearLayout2 = null;
        Button button = null;
        final AlertDialog alertDialog = null;
        String str3 = "۟ۖۦۘۡۡۦۘۥۖۧۘۙ۬ۛۘۚۦۘ۟ۗۗۖ۫ۙۧۨ۟۬ۧ۫۫ۨۘۥۗۤۡۛ۟ۢۡۡۜۨۧۘ۫ۤۛۙۨ۠ۜۥۡۘۙ۫ۛۧۥۧۘۦۧ۟ۢۜۖۖۡۡۧ۬ۛۤ۫ۦۘۦ۠ۥۘۧۖۨۧۖۢۢۥۘ۠ۜۡۘ۬ۦۖ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str3.hashCode() ^ 952) ^ 667) ^ 138) ^ 627) ^ 547) ^ 829) ^ 36) ^ 462) ^ 266) ^ PointerIconCompat.TYPE_ALL_SCROLL) ^ 334) ^ 303) ^ 785) ^ 425) ^ 102) ^ 38) ^ 230) ^ 135) ^ 762) ^ 825) ^ 437) ^ 889) ^ 649) ^ 625) ^ 148) ^ 761) ^ 280) ^ 671) ^ 139) ^ 556) ^ 655) ^ 1906341093) {
                case -1894982026:
                    linearLayout.addView(textView2);
                    str3 = "ۜۨۧۡۧ۫۟ۘۖۘۙۘۢۢۢۘۨۜۘۘ۟ۤۤ۫ۚۜۙۨۥۘۢ۬ۖۙۗۖۙ۫ۧۜ۬ۚۖ۫ۛ۫ۤۥۘۜۛۡۘۨ۫ۘۨۚۖ۫۬۬ۖۧۥۘۜۗۦۡۚۙۨۚ۫ۚۥۖۘۡۡۜۙۨۚۧۧ۟ۙۘۥۥ۬ۥۙۡۥۘ۬ۛۥۘۛۖ۠ۙۗۡۘۥ۬ۖۛۙۦۤ۠ۨۚۤۙۗۥۡۛۦۘۤۥ۫ۘۚۦۤۘ۟ۥۘ۠ۜۜۜۘۧۘۡۘ";
                    break;
                case -1736952604:
                    textView2 = new TextView(this);
                    str3 = "ۥۤۦۢۚۛۛۧۘۘ۬ۢۜۘۡۛۡ۬ۖ۠ۖۦۘۛۖۡ۬۫ۤۜۡ۠ۥ۫ۧۧۡۛۖۙۜۡۧۙ۟ۨۛۨۖۘۘۤۖۥۘۡۨۧۘۗۚ۠ۡۤۦۦۢۧۨۨۡۘۧۙۥۘۧۥۜ۬۬ۥۘ۠ۢ۬ۗۛۛۡۛۡۦۧۘ۟ۨۖۗۙۥۡۢۦۨۥۤۙۦۚ۠ۖۜۘۡۡۖ۫ۖۡۘ۬۟۟ۜۚۧۖۢۖ";
                    break;
                case -1674416896:
                    alertDialog.show();
                    str3 = "ۡۡۖۘ۫ۢۛۘۧۦۢۚۜۘۘ۫ۨۘۛۙۢۚۨۜۘۘۚۨۧۦۡۘۚۥۙۜ۟۫ۜ۫ۛۙۧۜۖۛۨۘۙ۠۬۠۠ۨۥۦۘۦۗۖۢۤ۠ۤۖۘ۠ۤۘۡۗۥ۬ۨۘۙۗۧ۬۠ۨۢۚۢۚۜ۟۫ۜۖۨۤۢ۬ۜۜ";
                    break;
                case -1627173194:
                    str3 = "ۗۗ۟۬ۜۧۘۨۙۚۗۚۜ۫۟ۛۤۘۖۨ۫ۥۢۖۡ۬۫ۥ۟ۧۜۦۤۡۖۖۘۡۨۜۘۖ۫ۡۘۙ۠ۥۘۜ۫ۘۛۡۨۡۢۤۤۥۘۖۛۗۜۡ۠ۥۥۨۜۚۗ۬۠ۢۚۥ";
                    break;
                case -1562938679:
                    linearLayout.addView(textView);
                    str3 = "۫ۛۖۘۙۡۙ۬ۤۗۡۢۛۙۧۖۘ۬ۜ۟ۨۧۧۘۖۖۙۧۖۘۧۖ۠ۢ۫ۥۘۛ۟۫۟ۦ۬ۧۧۧۛۤۥۤ۟ۤۘۦۥ۠ۨ۠ۖۚۤۡۛۤۜ۫ۨۖ۬ۨۘ۟ۦۥۙۤۢ۬ۡۦۘۨ۠ۧۖۧۨۘ۬ۖ۬ۧۗۥۡ۬ۥۘ۬ۥ۫۬ۜۜۧۦ۟ۛۜۘ۬۫ۨ";
                    break;
                case -1539513743:
                    layoutParams.setMargins(m79dp(this, 8), m79dp(this, 8), 0, m79dp(this, 16));
                    str3 = "ۨۧۛ۬ۗۖ۫ۦ۫ۙ۟ۡۘ۫ۤۘۘۘۛۜۚۚۥ۫۟۟ۡۙۖۘۘ۫۟۟ۚۥۘۨ۠ۦۘۧۥ۠ۡۥۤۨ۬ۖ۫ۤۨۘۤۤۢۚۡۖ۟ۜۥ۠ۛۚۚ۬۬ۥۧۨۘۨۢۤۜۗ۟ۨۚۨۗۨ۟۠ۖۦۘ۫ۥۥۘۗۧۡۘۤۛۘۛۡۙ۬ۧۤۛۜۘۘ۫ۥۗ۬ۦ۫ۦۘۥ۬ۖۜۥۖۘۗۚۤۜ۠ۗ";
                    break;
                case -1268929737:
                    textView.setTextSize(18.0f);
                    str3 = "ۙۧۖۘۘۖۘۘۗۡۦۧۨۖۢۘۡۘۧۛۗ۬ۛۨۜۦۨۗۙ۫ۢۡ۠ۖ۠ۥۜۜۡۘ۟ۡۡۘۢۗۜ۠ۤۡۘۧۙۘۙۨۨۘۢۛۢۗۡۘۖۛۢ۠۬ۤۛۧ۫۫ۜۘ۠ۨۦۛ۟ۦۡ۬ۖ۫ۢۨۘ۫ۛ۫ۘۙ۠ۥۛۦۛۢۥۨۙۦۡۦۛۨۗ۬ۗۙ";
                    break;
                case -1255736335:
                    textView.setPadding(m79dp(this, 8), 0, 0, 0);
                    str3 = "ۨۖۜ۟ۤ۟ۖۡۦۘ۟ۤۖۘۜۨۖۘۘۘۥۜۧۥۘۦ۬ۤ۬ۥۖۥ۠ۖۢۥۨۜۙۡۨۖۜ۟ۙۡۘۨۨۚۡۘۘۙۜۧۘۢۡۦۘۡۙۜۖ۟ۜۛ۟ۡ۫ۢۨۛۥ۠ۙۛۘۘۦۜۦۘ۠۟۫ۨۡ۠ۤ۟ۢ۬ۜۘۛۥۥۘۨۗۤ۠ۡۢۜۨۢۧ۠۬ۘۙۚۖۚۜۗۤ۠ۗ۬ۚۥ۬ۨۗۚۖۘ";
                    break;
                case -948082301:
                    textView = new TextView(this);
                    str3 = "۠۠ۚۚۡۤۤ۬۠ۚۥۢۗۦۘۧ۫ۦۜۚۜۘۨۘۦ۠ۥۘۚۚۖ۬۟ۨۤ۠ۖۙۗۖۘۨۘ۫ۦ۬ۜ۫۫ۗۧۗۤۘۗۜۜۙۨۦۘ۟ۧۘۘ۠ۦ۬ۡۚۨۘۡۛۤۢ۠ۖۘۥۨۖۘۚ۟۫ۤۤۥۘۚۡۨۢۘۡ";
                    break;
                case -498358349:
                    layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    str3 = "ۡۜۨۘۚ۫ۖۘۘۦۤۚ۟ۜۖۚۨۘۡۢ۟۬ۧۜۘۙۙۗ۫ۢۚ۬ۘۘ۠ۢۛۦۚۗۛۡۢ۟ۛۖۘۥۗ۬ۖۡۘۛۨ۫۠ۚۧۙۨۘۤ۟۬ۚۗۜۘۗ۟۫ۖۖۗۘ۠ۜۤۨۥۘ۬ۤۙۜۧۘۥۘ۟ۧۜ۠۠ۗ۬";
                    break;
                case -497976334:
                    textView.setText(str);
                    str3 = "۟ۦۖۘۖۜۡۘ۟۫۠ۖۖۛۨۢۦۘۘۜۦ۫ۨۦۢۜۥۘ۠ۘۘۗۙۨۘۡۗ۠ۨۧۡۙ۬ۚۧۖۡۜ۫ۜۛۚۜ۬ۙ۫ۢ۫ۘۘۖ۠ۥۘۦۢۗۚۙ۠۟۫ۤۥۤۖۘۢۦۜۘ۟ۤۜۘۡۚۛۗ۫ۥ۫۫۬ۛۧۚۘ۫ۜۘۖۘۚۡ۠ۖۘۛۤۦۧ۬۫۟۠۫";
                    break;
                case -377982412:
                    linearLayout.setOrientation(1);
                    str3 = "ۥ۫۠ۖۡۙۦ۠ۤۥۙۖۘۛ۟ۤۖ۬ۡۥۜۖ۠ۤۡۙۥۗۡۤۜۜ۬ۡۨۤۦۗۧۡۨۧ۫ۤۖۨۘۜۗۧۤۜۧۛ۬ۨۘۢۡۦۘۘۢۚ۫ۧۜۤۥۙۙۦۘۛۗۖۗۗۤۛۦۢۤۤۡ۬۠ۗ۟ۙۡۦۘۜۘ";
                    break;
                case -370501523:
                    str3 = "ۤ۠ۛۖۖۛۤۙۘۘۛ۬ۨۘ۠ۚ۫ۢۨۥ۬ۢۘۘۜۗۡۥۗۘۙۤۖۨۥۙ۟ۡۧۨۥۧۦۚۥۘۛ۬ۡۘۥ۟ۦۚ۬ۥۘۛۥۢۦۡۢۡ۟ۨۘۙۨۥۘۚ۬ۜۨۦۘۨۖۘۘۖۖۘۧۙۖۜ۟ۦ۠ۤۡ۬ۘۤ۬ۤ۟ۗۤۦۘۡۘۥۛ۬ۖۘ۬ۜۘۧۘۨۘ";
                    break;
                case -232033447:
                    textView2.setText(str2);
                    str3 = "ۜۤۜۘ۫ۙۡ۬ۗۚۨ۠ۖۘۡۨ۬ۢۤۥۘ۠ۚ۫۠۠ۨۘۢۛۛۘ۫۠ۤۦۤۢ۟۠ۤ۫ۖۘۥۜۜۘۡ۠۟ۦ۬ۘ۟ۦۤۛۛ۠ۘۚۜۗۢۜۘ۬ۥۚۨۥ۫ۨۡۨ۫ۙۦۘۛۖ۬۟ۗۘۖۨ۠ۢ۫۬ۙۢۘۘۦۗ۬";
                    break;
                case -209459418:
                    button.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                    str3 = "۬۟ۚۖۘۘۘۤۨۧۘۖۖۨۘ۬ۛ۟ۙۤۦ۟ۡۨۘۚۧۧۨۜۥۡۨۘۤۡۨۘ۫۫ۗۙۛ۟۬ۡۗۘۡۨۜۨۚۨۨۡۘۛۢۛ۬ۜۡۘ۫ۖۖۘۨۤۗۙۥۡۥۥۧۘۡۘۨۘۙ۫ۘۘ۬ۖۡۡ۫۬۫ۤۛ۬۟ۧۚۢۡ۫۟۬۬ۡۤۦۘۦۘۗۧۤ۠ۛۙ";
                    break;
                case -135586397:
                    textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                    str3 = "ۜۢۢ۟ۖۛۛۖ۟ۤۨۜۢۧ۟ۛۛۘۘۥۖۥۘۥۜۜۘۜۤۨۖۙۤۧۥۡۘ۠ۤۢۥ۫۬۫ۢۚۖۗۨۘ۬ۨۢۘۙ۬ۚۛ۫ۤۖۖۦۚۙۧۢۖۘۙۚۛۦۢ۫ۜۥۜۛ۫ۥۚ۟ۨۘۨۡۡۨۚۥۘۧۘۧۘ۬ۢۡۘ";
                    break;
                case -100207671:
                    linearLayout = new LinearLayout(this);
                    str3 = "۫ۨۜۗۜ۬ۛۤۦۜۦۨۜ۫ۧ۟ۘۘۜ۬ۡۘۛۛ۟ۖۧۜۘۢۦۢۢۘۗ۬ۛ۟ۖۖۨۗۛۜ۫۬ۘۘۛۗۗ۫ۜۛۦۢۖۘۖۦ۠ۘ۫ۖۚۥۚ۟ۙۛۥۧ۬ۥ۫ۘۘ۫ۡۘ";
                    break;
                case -2576439:
                    str3 = "۫ۢۗۗ۠۠ۦۧۢۘۧۧۥۙۨۘۘۘۚۙۦۚ۟ۜ۠ۦۥۚۤ۫ۘۚ۬۫ۘۗۥۘ۫ۨۤۛ۠ۗۦۡۜ۟ۡۨ۟۬ۥۤۡۜۡۛ۫ۗ۫ۖۛۥۜۗۙۙۥۜۥۘۛۜۡۖۢۨۡۦۥۙ۫ۗۚ۬ۦ۠۬ۤۢۤۥ";
                    break;
                case 244127112:
                    linearLayout.setBackgroundColor(-1);
                    str3 = "۫ۦۦۦۤۨۘۤۜۡۡۢ۫ۘۜۥۢۡۖۘۡۛ۬ۗ۟ۛ۠ۧۛ۫ۤ۫ۢۤۤۛ۬ۘۤۦۘ۠ۡ۫۬ۙۘ۫ۗۖۛ۟ۨۘ۟ۦۘۢۖۡۥۨۡ۠ۛۙۥۧۨۗ۬ۨ۫۠ۦۘۨۜۖۘۙ۬ۧۤۜۗۖۘۘ۟ۗۤ";
                    break;
                case 308099778:
                    button.setAllCaps(false);
                    str3 = "ۤۥۖۥ۟۠ۢۗۡۘ۫ۚۖۚ۟ۥۘۘ۟ۘۧۘۙۘۧۘۘ۫ۜۨۖ۠ۘ۟ۚۡۢ۫ۜۘۗ۠۠ۛۤۡۚۦۜۡ۬ۖۨۘۚۘ۫ۢۧۥۘۙۤۗۜ۟ۚۖ۟ۥۙۤۥۘۛ۠۬ۛۢۘۘۘۘۨۦ۠ۥ۬ۘۧۤۜۛۧۤۢۚۛۨ۫ۢ۫ۚۤۦۘۘۚۘۘۦۙۥ۬ۤۘۘۤۡۡۧۖ۬۠ۛۦۨ۟ۦۜۗۥ۟ۚۜ۟۬ۙ۟ۘۦۘۜۥۢ";
                    break;
                case 398337138:
                    linearLayout2.setOrientation(0);
                    str3 = "۠ۜۙۧۖۥۘۥۡ۠ۥۧ۠ۤۘۘۘۢۜۗۚۦ۟ۤۘۗ۟۠ۛۘ۬ۥۥۦۘ۟ۜۢۛۘۛ۫ۜۘۚۜۜۘۚۤۥۘۨۚۖۘۙۤۢۘۚۖۘۢۛ۠ۚۡۤۡ۫ۡۘ۟ۥۦۘۖۚۥۜۛۡۘۛۡۜۡۦۖۘۛۦۘ۫ۧۖۨۢۘۘ۠ۘۘۦۡۛۦ۫ۦۦۨ۬۫۫۟ۙۡۘۘ۠ۨ۫ۘۧۙۦۚۘ۟۟ۦۡۧۘۛۢۨۨۙ۫ۗ۠ۜۧ۫ۦ";
                    break;
                case 402216173:
                    button.setOnClickListener(new View.OnClickListener(alertDialog) { // from class: kentos.loader.activity.MainActivity$$ExternalSyntheticLambda20
                        public final AlertDialog f$0;

                        {
                            this.f$0 = alertDialog;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            String str4 = "ۘۨۤۖۗۗۡۚۦۘۡ۬ۤۛۗ۬ۦۥۘۨۢۦۘۥۚ۫ۨۥۨۘۥۘۚۖۨۙۛۖ۫۬ۢۢۧۗۥۘۡ۟ۛۡۦۤۡۤۢ۠ۢ۠ۧ۠ۨۜۘۥۨۚۤۘۡ۠ۘۘۚ۬ۘۙۥۘۙۨۘۘۖۙۨۚۙۘۘۨۖ۬ۗۡۦۖ۠۠ۤۖۢۚۖۧۘۛۗۡۤۡۡۘ۫ۘ۬ۛ۫ۖۚۡۧ۠ۙۖۘۘ۟۫";
                            while (true) {
                                switch ((((((((((((((((((((((((((((((((str4.hashCode() ^ 815) ^ 405) ^ 860) ^ 264) ^ 311) ^ 541) ^ 709) ^ 240) ^ 416) ^ 242) ^ 608) ^ 893) ^ 722) ^ 1000) ^ 651) ^ 803) ^ 754) ^ 381) ^ 298) ^ 253) ^ 672) ^ 879) ^ 916) ^ 12) ^ 500) ^ 566) ^ 496) ^ 665) ^ 333) ^ FileUtils.FileMode.MODE_755) ^ 281) ^ 530395364) {
                                    case -1973773440:
                                        return;
                                    case -793955624:
                                        MainActivity.lambda$showStyledDialog$19(this.f$0, view);
                                        str4 = "ۡۦ۬ۘۗ۠۫ۢۡۥۘۤۨۥۘۘۡۥۚ۟ۙۡۧ۫ۜ۠ۡۚ۟ۡۜۡۥۦۘۘۡۡۘ۟ۜۙۢۦۨۘۨۗۜۦۜۥۘۨ۠۫ۜ۫ۚۛ۟ۦۢۚۡۙۛۘۚ۟۫ۖۜۧۘ۬ۛۖۘۗ۫ۤۘۦۖۨۚ۬ۤۖۚۗۨۨۦۜۘۡ۬ۥۘۙۖ۟ۜۚۡۘۨ۬ۘ۫ۥۤۛۛۥۘ۬۬۫ۗۖۛۦۦۛۨۜۘۗۤۡۘۤۙۨ۬ۘۖ۟۬ۛۚۗۥۘ";
                                        break;
                                    case 79299675:
                                        str4 = "ۥۨۖۘۤۖۧۘۡ۫ۘۥ۠ۘۘۡۢ۬ۗۖۙۗۢۢۨۙۗۜۥ۟۫ۧ۟۟ۚۖۘ۬ۦۥۘۤ۠ۦۙ۠ۖۘ۬ۨۖۘ۠ۡۚۗ۫ۨۚۚۖۛۗۧ۟۟ۛ۠ۜ۫ۥۡ۬ۥۨۡۘۚۖۛۤۘۡۥ۬۫ۡۘۦۡ۫ۡۘۤ۫ۛۧۜۦۘۢۜ۠۬ۥ۫ۘۧۧ۫ۢ۫۬ۜۖۡۜۘۦۦ۠ۘۘ۫ۤ۟ۚۡ۬ۗ";
                                        break;
                                    case 635446403:
                                        str4 = "ۥ۟ۡۥۖۥۗ۫ۚۦ۬ۨۨۘ۫ۘۨۘۘۨۤۙۗۗۨۘۡۜۥ۫ۗۖۘۢۚۤۢ۬ۦۖۦۥۘۙۖۖۘۗۢ۫ۙ۫ۨۘۧۗۜۘۥۘۦۘ۠۟ۢۘۖۢۥۡۨۧۙۦۥ۬ۡ۫ۘۖۘۢۤۘۘ";
                                        break;
                                }
                            }
                        }
                    });
                    str3 = "ۙۨۖ۬ۡۘۘ۟۟ۢۙ۫ۥۖۥۧ۟۬۫۠۠ۗۛۜۨۖۘۧۡ۟۠ۦۖۗۘ۟ۗ۫ۖۥۥۡۜۤ۫ۘۛۦۢۧۦۘۖۖۡۘۛۗۢۢ۠ۘۘۜۦۛۙۦ۠ۤۡۥۤ۠ۖ۟ۧ۬ۤۗۜۤۙ۠۬ۘۘۤ۬ۜۗۦۙ";
                    break;
                case 548444438:
                    button.setText(getString(C0931R.string.str009c));
                    str3 = "ۧۨۥۘ۠ۚۨۘۚۙ۠ۗ۠ۨۘۨۥۜۘۘۦۤۛ۠ۤۨۥ۟ۨۥۗۚۥۧۤۚۗ۠۬ۜۧۛۧۨۙۚ۫۠ۧۛۗ۬ۤۚ۠ۙۥ۠ۢۘۘۦۢۥۘۦۧۘۘۜ۟ۚ۫۠ۨۛۚۜۡۗۦۘ۠ۤ۬۠ۜۧۘۥۡۘۚۘۤۤۢۥۙ۬ۘۘۜۢۧۜۗ۠ۘۨۘ۠ۦۘۡۤۡۡۢۛۜۢۥۥۡۜۘۧۗۥۡۧۧۡۡۘۖۢۤ۬۟ۦ";
                    break;
                case 626473513:
                    return;
                case 840512910:
                    linearLayout.setPadding(m79dp(this, 16), m79dp(this, 16), m79dp(this, 16), m79dp(this, 8));
                    str3 = "ۛۜۨ۫ۜۨۥ۬ۘۦۤۘۧۖۡۘۥۨ۫ۥۧۧۖ۠ۙۗۘۜۘۜۛ۟۟ۙۖۘ۫ۨۦۘ۫ۨۜۦۚۚۘۗ۫ۨۘۚ۟ۜۖ۠ۢ۠ۨۖ۬۬ۖۛۜۘۖۧ۫ۜۗۧۢۙۡۢۖۘۘۖۧۨۘ۟ۙۤۢۜۙۥۘۚۥ۠ۡۜۗۤۖۚ۠ۨۨۤۜۘۦۖۧۘ۬۠۬ۜۗ۟۫ۖۢۘۦۘۢۜ۠ۗۨ۫ۜۧۗۧۗۖۘ۟ۡۚۜ۟";
                    break;
                case 847706494:
                    linearLayout2.addView(button);
                    str3 = "۬ۨۢۨۚۘۘۥۗ۬ۛۙۘۘۗۨۜۨۡ۫ۦۢۦۘۚۖۡۘۖۥ۠۠۠ۨ۫ۙۗۜۘۦ۟ۖۥۢۙ۫ۖۢۧۙ۫۟ۗۘ۠ۦۖۥۖۗۜۘۢۤۗۨۦۡۘۢ۟ۖۘۤۨۡۘ۟ۗۧۥ۠ۧ";
                    break;
                case 882431728:
                    textView2.setLayoutParams(layoutParams);
                    str3 = "ۥ۫ۘۘ۬ۨۘۗ۠۫۬ۘ۟ۥ۠ۢۥۛۦ۟ۖۖۘۡ۫۫ۛ۠ۤ۠۬ۘۤۙ۠ۦۜۦۦ۠ۥۘ۟ۙۖ۠ۚۘۘۛ۬ۛ۠ۗۗۗۙ۫ۤۛۗۢۛۨۤۨۦۘۢۤۚ۬ۘۛۨ۠ۛۖۥۧۢ۠ۨۘ۬ۡۖۤ۫ۦۢۧۥۘۦۤۗ۠ۗ۠۠ۜۜ۬ۡۥۘۧۤۥۖ۟ۗۤ۫ۛۖۧ۟ۖ۠ۘۘۥۖ۬ۥۜۙ";
                    break;
                case 1142861502:
                    textView2.setTextSize(16.0f);
                    str3 = "ۡۤۦۘۖۙ۟ۧۖۖۘۢۢۘۘ۠ۤۖۙۦۘۢۧۨۘۡۘۛۛۗۦۙۢ۠۠ۙۦۚ۫ۤ۟ۦۥۥۖ۟۫ۧۧۡۥۧۘۥۚۚۜ۫ۛۘۗۥۨۙۤۡۖۙۢۜۘۢۨۡ۫۟ۖۡۚ۬۬ۙۙۘۗ۬ۙۙۗۚۛۦۘ";
                    break;
                case 1268875664:
                    alertDialog = new AlertDialog.Builder(this).setView(linearLayout).setCancelable(true).create();
                    str3 = "۬ۘۜۘۗۚۦۘۥۤۨۜۗۦۘ۬ۡۗۦ۬۠ۧۥ۬ۜۦۛۤۨۘۡۢۘۚۗۦۘۥۚۨۤ۟ۦۖۜۨۘۢۥۥۗ۠ۦۜۗۨ۠ۧۧۗۗ۟ۚۥۨۥ۟ۦۘۢ۟ۤۜ۟ۜۙۘۢۙۘۨۘ";
                    break;
                case 1356889761:
                    button = new Button(this, null, 16843563);
                    str3 = "ۜۘۙۖۡۨۘۢۗۗۡۥۢۗۥۜۘ۬۬ۗۙ۬ۜۘۛۢۖۦۙۧۢ۠۬ۥ۠ۡۚۢۗ۠۠ۛۤۡۡۙۡۘۢۧۥۥ۫ۤۚۡۦۖ۠۟ۗۡ۬ۨۦۜۘۜ۟ۦ۠۬ۖۘۘۤۥۚۦۗۡۤۨۘۖۥۧۖۗۦۘ۟۫ۢۧۛۖ۟ۢۛۦۤۥ۫ۗۧۨۡۖ۠ۚۦ۬ۡۘۥ۟ۡۥۙۢۡۡۡۘۘۙۜۘ";
                    break;
                case 1400278479:
                    linearLayout.addView(linearLayout2);
                    str3 = "۬۟ۥۘ۟ۡ۠ۖۘۨۘۡ۫۟ۜ۬ۙۦۘۘۤۙۙۡۨۥ۫ۡۘۨۡۜۨ۠ۜۘۜ۬ۧۦۧۦۚۜ۠ۦ۫ۙۗۦۗۡۛ۫۫ۨ۫ۡۦۘ۟ۙۘۘۖ۟ۛۙۖۦۡۨۘۢۡۤ۟ۚ";
                    break;
                case 1620657204:
                    linearLayout2.setGravity(GravityCompat.END);
                    str3 = "ۧۘۜۙ۠ۢۢۦۦۦۛۤ۟ۚۡۘۜ۠ۘۘۘ۠۬۬۟ۛۛۧۨۧ۠۟۠ۤۙۨۖۢ۬ۦۥۘ۠ۘۘۨۤۗۧۤۘۘۚۤۘۗ۬ۥۦ۬ۖۨۗۚۜ۟ۘۘۤ۬ۢۧۙۖۘۗۜۨۚۦۦۘ۬ۤۛ۬ۢ۬ۜۖۧۘ۫ۧۧۚۚۨۘۚ۫۫۟۟ۜۢۦۧۘۖۢۗۢ۫ۙۦۧۗۦۨۦۥۘ۬ۥۦۚۛۤ";
                    break;
                case 1703947031:
                    textView.setTypeface(Typeface.DEFAULT_BOLD);
                    str3 = "ۖۜۨۘۖۢ۟ۤۘۨۖۙۧۡۗۘۘۗۘۜۘ۬۠ۡۜۧۦۖۡۧۗ۬ۢ۟۬ۚۖۡۥۘۤۦۥۘ۬۠ۙۜۡۡۘۛۛۖۧۜۨۘۚۢۤۤۧۖۘۖۨۡ۫ۧۚ۬ۘۡۚۜۘۨۙۙۗ۬ۜۘ۟ۧۗۛۡۨۘ۬ۗۖۘۘ۟ۙ۬ۢۨۘۦ۬ۨۚۧۦ۫ۗۥۘ۟۫ۧۙۤۖۡ۬ۖۘۙۘۦۘۥ۠۟ۙۚۖ۟ۛۨ";
                    break;
                case 1824139356:
                    linearLayout2 = new LinearLayout(this);
                    str3 = "۫ۨۜۖ۬ۤۚۡۤ۫ۚۜۦ۠ۘۜۘۘۧۡ۠ۦۘۨۛۤۧۢ۬ۨۧۜ۫۬ۥۘ۬۫ۘۜ۟ۨۖۚۘۖۗ۟ۧۗ۟ۗۨۘ۠ۨ۠۬ۖۥۘۥۙۦۨ۬ۤۨۦۛۨ۫ۜ۬ۜ";
                    break;
                case 1981761840:
                    textView2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                    str3 = "ۧۘۜۧۛۤۢۡ۫۫۠۬ۧۥۤۜۜۧۘۢۘۦۙۢ۬ۖۚ۬ۙۦۤۗۥۖۘۤۦۡۘۥ۫ۦ۟۟ۥۢۖۖ۬ۨۖۤۧۧ۬۬ۜۦ۫ۛۥۜۛۡۤۜ۫۫ۚ۬ۨۗۡۨۡۚۡۗۥۡ۟ۦۙۚۤۧۜۨۗۘۡۙ";
                    break;
            }
        }
    }

    private void showSuccessDialog() {
        String str = "ۛۢۤۦۘۨۡ۬ۦۘ۠۠ۜۡۘۦۘۨۜۚۘۧۘۤۘۡۘۦۨۙۘ۬ۜۘۨۨۖ۟ۖۘۨۙۥۖۡۤۤۘۜۘۤۢ۠ۦۘۘۘۢۤۖۗۦۨۛ۬۫ۧۥۘۦۚۘۛۧۥۡۨۨۘ۟ۘۛۖۨۢۗۘۨۥۙۚۤۤۙۘ۟ۥۘۖ۫ۡۚۛ۠ۥۡۡۖۤۗۤ۠ۡۚ۟ۘ۬ۥ۟ۜۘۡۘۧ۠ۡۢ۠ۥ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 534) ^ 592) ^ 3) ^ 286) ^ 301) ^ 163) ^ 581) ^ 865) ^ 246) ^ 192) ^ 351) ^ 230) ^ 316) ^ 575) ^ 911) ^ 761) ^ 80) ^ 218) ^ 369) ^ 894) ^ 962) ^ 584) ^ 2) ^ 566) ^ 873) ^ 406) ^ 95) ^ 997) ^ 293) ^ 170) ^ 228) ^ 727059952) {
                case -1120930793:
                    showStyledDialog(getString(C0931R.string.str00e0), getString(C0931R.string.str00ca));
                    str = "۫ۜۥۘۡ۫ۢۗۤۨۘۙۖۤۚۡۧ۬ۙۜ۟۬ۥۨۧ۬ۖۜۥۨۤۖۤۦۘۧۖۧۤ۠۫۫ۥۨۘۦۘ۟ۨۦ۬ۤۘۜۘۙ۫ۡۡۘۢۖۛ۟۠ۙۨ۟ۥ۬ۗۖۜۥۧ۬ۦ۟ۘ۬ۦۙۤۢ۫ۗۜۘۥۘۨۘۖۛۜۘ۠ۧۡۘۛ۟ۨۘۙ۠ۤۘۥۘۘۨ۬ۚۦۛۘۘ۠ۚ۟ۥ۠ۥۚۘۡۘۜۚۥ";
                    break;
                case -611887953:
                    return;
                case 1679227366:
                    str = "۠ۢ۬ۜ۫ۨۘۧ۬ۖ۠ۘ۫۠ۘۛۢ۫ۛۡۥۖۦۨ۟۠ۛ۠ۜ۬ۡۚۙ۠ۢۖۢۖ۠۬۟ۢۥۨۨۢۦۦ۬۟ۤۥۥ۠۫ۘ۬ۤۦۥۨۤۨۡ۠ۜۘۨۘۧۘۥۖۡۘۦۜۨ";
                    break;
            }
        }
    }

    private void showSystemUI() {
        String str = "ۧۚۥۘۧ۬ۧۘۚۛۘۖۥۚۢۤۥ۫ۗ۠ۛ۠۠ۙۨۙۚۢۗۢ۟ۨ۫ۗۗۦۡۦۙ۠ۖ۟ۢۦ۫ۜۡۜۜۡۢۛۢۚۜۧۨۘۢۦۘۢۚۡۘۙۤۘۜۤۛۗۨۘۛۡ۬";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 570) ^ 430) ^ 734) ^ 220) ^ 484) ^ 407) ^ 886) ^ 544) ^ 624) ^ 787) ^ 882) ^ 836) ^ 437) ^ 258) ^ 142) ^ 347) ^ 740) ^ 662) ^ 638) ^ 617) ^ 932) ^ 255) ^ 332) ^ 475) ^ 910) ^ 426) ^ 545) ^ 215) ^ 413) ^ 182) ^ 782) ^ 634263845) {
                case -1923676774:
                    getWindow().getDecorView().setSystemUiVisibility(1280);
                    str = "۠۫ۘۜ۬ۡۥ۟۠ۥۦۙۤۗۛۡۘۗۚ۟ۜۘ۠ۧۥۘۡۨۘۤۖۥۘ۟۬ۦۧۤۥۘۗۢۧۘ۟ۗۦۥۤۡۦۘۤ۫ۛۘ۫ۤۚ۬ۜۘۧۛۘ۠ۚۗۗۙۖۜۦۗ۫ۛۚۨۨ۟";
                    break;
                case -988040657:
                    return;
                case 434361172:
                    str = "ۡۚۦۢ۬ۥۨۡۥۘۥۤۨ۟ۛ۠ۨۦۖۘۗۤ۠۟ۥۨۦ۫۫۟۬ۖۘ۫ۙۖ۟ۛۚۥ۠ۥۘۗۚۙۦۛۥۘۥۤۖۗ۬ۖۘۥ۟ۛۥۘۙۙۙۡۘۖۤۚۡ۠ۙۙۗۗۢۦۨۘۥ۬ۡۥۚ۠ۗۜۗۛۙۨۘۖۢۦ۫ۦۗۛۡۖۢۦۘۤۨۘۛ۫ۡۦۖۚۡۤۙۡ۟ۙۖۦۛۨۘۛۢۘۧۢۢۨۗۘۧ۠ۘ۠ۨۥۢۨۜ";
                    break;
            }
        }
    }

    private void startFloater() {
        String str = "ۜۛ۫ۨۥۨۨۤ۫ۦۘ۠ۛۥۙۖۨۘ۫ۗۙ۬ۧۧ۟۠ۢ۫۫ۗ۟ۦۖۘۦۡۦۥۧۖۘۘۡۧۚۘ۬ۨ۬ۥۦۨۜۘۨۖ۟ۖۧۘۖۛ۟ۡ۟ۨۨۗۖۘ۟ۙۜۧۧ۟ۦۘۗۤۖۧ۬ۡۘۜۨۡۛۧۜۘۚۗۜۥۛۦۘۛۥۤ۫ۦۡۢ۬ۖۘۨۢ۫";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 391) ^ 458) ^ 240) ^ 350) ^ 26) ^ 848) ^ 604) ^ 275) ^ 605) ^ 827) ^ 397) ^ 227) ^ 912) ^ 949) ^ 336) ^ 169) ^ 864) ^ PointerIconCompat.TYPE_TEXT) ^ 517) ^ 375) ^ FileUtils.FileMode.MODE_755) ^ 686) ^ 376) ^ 117) ^ 570) ^ 248) ^ 387) ^ 9) ^ 420) ^ 750) ^ 23) ^ 2052536324) {
                case -751687470:
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) { // from class: kentos.loader.activity.MainActivity$$ExternalSyntheticLambda21
                        public final MainActivity f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String str2 = "ۢ۠۫۫ۛۖۤۘۚۧۙ۫ۙ۟ۤۥۘۨۖۘۧۙۖۧۗۦۦۘۙۜۧ۬ۗۜۦۢۖۧۘۡۜۨۗۛۘۙۚۜۘۗۦۖۘۥۘۘۘۡۤۘۘۤۢۧۤۦۘ۟۠ۖۡ۠ۜۘ۫ۨۧۢۜۢۨ۠ۜۢۨۛۦ۠۟ۦۧۢۜ۠ۥۘ";
                            while (true) {
                                switch ((((((((((((((((((((((((((((((((str2.hashCode() ^ 916) ^ 279) ^ 243) ^ 711) ^ 929) ^ 488) ^ 926) ^ 794) ^ 741) ^ 911) ^ 44) ^ 378) ^ 268) ^ 875) ^ 906) ^ 715) ^ 313) ^ 738) ^ 587) ^ 105) ^ 262) ^ 844) ^ 432) ^ 166) ^ 394) ^ 945) ^ 716) ^ 525) ^ 871) ^ 850) ^ 665) ^ (-1677125987)) {
                                    case -540329845:
                                        str2 = "۫ۡۢۖۤۧۨۛۛ۬۠ۙ۠ۖۨۖ۟ۢۘۜۧۡۜۖۘۥۦۖۘۥۧۨۘۨۚ۠ۘۛ۫ۛۙۜۘۖ۠ۙۛ۬ۥۨۙۗ۬۟ۨۘۘ۟ۧۧۗ۬ۛۡۘۚ۟ۗ۬۬۬ۙ۬ۡۘ۬۬ۥۙ۬ۘ";
                                        break;
                                    case 77515072:
                                        this.f$0.m262lambda$startFloater$21$kentosloaderactivityMainActivity();
                                        str2 = "ۤ۟ۡۘ۟ۦۛۗۖۜۘۙۛۚ۠ۗۦۨۖۤ۟ۙۗۡ۬۠ۚۥۖۘ۫ۨ۟ۤۢ۠ۘۜۥۘۚۚۖ۠ۤۛ۬ۤۥۘۖۗ۫ۜۦۙۚ۬ۚۙۢۙۘۦۖۘۥۡۢۗۢۦۘۢۧۖ۫ۤۖۘ۟ۙۦۜ۬ۗۛ۟ۖ۬۠ۦۘۧۙۢ۟۫ۦۘۖۡۛۧۜ۟ۤۨ۫ۜ۠ۦۨۚ۬ۢۨۥۘۧۥۨ۠۠ۥ۫ۘۘۙۘۡۘۘ۬ۖۤ۬ۘۗ۟۠۫۠ۦۗۜۜۘ";
                                        break;
                                    case 469193375:
                                        return;
                                }
                            }
                        }
                    }, 6000L);
                    str = "۟۫۠ۨ۬ۦ۫ۤۗۧ۟ۨ۬۟ۛۢۖۖۘ۫ۖۡۘۦۘۖ۠۬ۘۦۗۢۘۘۘۛۙۛۗۖۡۘ۬ۜ۫ۢۖۖ۬ۚۖۘۨۘ۫ۘ۟ۙ۟ۖۧۥۨۗۚۤۜۙۙ۫۫ۦۖۦ۬۟ۛۡ";
                    break;
                case -582081668:
                    return;
                case 1266081452:
                    str = "۟۟ۢۙ۠ۥۘۦۦۖۘۧ۠ۢ۟ۥۡۘۛۜۧۘۢۥۧۘۛ۠ۦۘۚۤۖۡۧۘۤۧۨۢ۫ۜۧۘۚۜ۬ۨۜۙۥۘۖ۠ۨۥۜ۠ۨۦۨۘۛۢ۫ۜۚۛ۟ۤۨۦۤۡۥۨ۟ۖۤۛ۟ۥۖ۟۟ۧۧۧ۫ۥۖۜۜ۟ۦۥۘ۬ۗ۬ۤۘۨ۠ۧۚۙۘۧ۬ۛۖۘ";
                    break;
            }
        }
    }

    private void startObbDownload(String str, String str2, String str3) {
        String str4 = "۫۠ۜۘ۬ۥ۠ۢۖۥ۫ۢۤۡۜۢ۠ۘ۫۬۫۟ۙۘۘۦ۫۟ۗۛۖۘۦۧۤۢۚ۬ۡۖۤۙۦ۟ۜۗ۟ۚۡ۫ۢۥ۠ۧۗۙ۟ۧۥۙۚۗۨۥۙ۟ۡۧ۬ۚ۟ۥۘۖۜۨۘۘۨۡۨۗۖۘۘۖۡۘۛۙۖ۠ۙۧۤۥۘ۟۬ۛۡۢۥ۠ۜ۠ۢۜۤ";
        FixObbDownloadTask fixObbDownloadTask = null;
        FixObbDownloadTask fixObbDownloadTask2 = null;
        while (true) {
            switch ((((((((((((((((((((((((((((((((str4.hashCode() ^ 25) ^ 593) ^ 396) ^ 554) ^ 688) ^ 162) ^ 145) ^ 591) ^ 544) ^ 604) ^ 759) ^ 778) ^ 500) ^ 116) ^ 959) ^ 343) ^ 688) ^ 964) ^ 530) ^ 865) ^ 372) ^ 396) ^ 806) ^ 845) ^ 784) ^ 75) ^ 480) ^ 439) ^ 64) ^ 818) ^ 967) ^ 1043907188) {
                case -2049721997:
                    String str5 = "ۧۙۦۘۗۙۨۘ۠ۦۨۘۚ۠۬ۘۚۥۘۙۜۦۘۧۥۜۘۙۚۦۤۚۦۘۢۖۛ۟ۜۛۥۗ۠ۥۘۘۘۘۖۥۘۡۧۙۨۨۘۦۡ۬ۙۦ۠ۥۚۜۢۖۘۨ۟ۙۙۢۖۘۗ۫ۥۘ۬ۛۖ۫ۛۜ۠ۘ۟ۨۙ۫۬۬ۢۤۧ۫ۙۘۛ۫ۛ۠ۗۧۢۗۜۡۘۢۥ۠۠ۥۘۙ۬ۖۚۛۜۘ۠۬ۦۘۗ۟ۙۨۛ";
                    while (true) {
                        switch (str5.hashCode() ^ (-1154821914)) {
                            case -2078960403:
                                str4 = "ۗۗۘۥۘۚۨۛۚۨۗ۬ۖۨۜۘ۠ۙۛۖۛۡۘۘۘۧۘۗۗۜۨۜۙ۠۫ۗۥۤۖۘۡ۟ۘۘۨۖ۠ۛۚۙۛ۟ۨۘ۬ۛۦ۫ۨۙۡ۠ۥۨ۟ۛۤۨۥۗۥ۟ۧۖۙ۠ۧۢۚۗۜۘ";
                                continue;
                            case -707940292:
                                str5 = "ۙۦۖۚ۫ۘۘ۫۟ۦۥ۠ۥۘۡۗۛۨۜۜۦۢۘۖۜۨۘۖۖۡۙ۫ۡۧۚ۠ۛۦۡۘ۠ۨۘ۫ۨۥۜۜۙ۫ۥۖۦۖۚۤ۫۫ۥۥۘۧ۟ۖ۬ۤۖۘۙۦ۫ۛۜۖۘۚ۫ۥۘ۠ۥۘۘ۬۠ۥۡ۬ۡۨۥۦۘۤۡۥۘۗۡۦۘ۬ۚۨۘۚۜۘۘ۟ۘۜۘ۬ۙۥۘۤۦۧۙۦۢۜۦۦۛۜۖۘۨۥۖ۫ۛۚ۟ۘۤ۟ۜۥۘ۫ۛۥۚۜۚۜۙۘ";
                            case -475161998:
                                String str6 = "ۘۤۘۘۨ۠ۗ۫ۘۘۗۜۨ۬ۧۙۙۥۘۚ۫ۡۤ۫ۦۡۙۖ۫۟ۧۡۧۨۜۨۧۛۜۤۢۗۡۘۛۜۡۤۡۚۛ۬ۛۧۜ۫۠ۦ۫ۜۦۧۘۖۦۜۘۢۙۘۦۨۧۘۘۤۦ۟۬ۗۗۘۦۖۧۘۗۛۢۚۦۥۘۚۛۙۜۧۖۦۗۡۢ۬ۜۘۖ۬ۚۢۗۦۘ۬ۖۚ۫ۛ۟ۨۘ۫ۨۛۘۨۘۥ۬ۡۚۜ۠ۢۗ۬ۦۙ۟ۛۛ";
                                while (true) {
                                    switch (str6.hashCode() ^ 1743271773) {
                                        case -65646340:
                                            str6 = "ۤۨۘۘۢۥ۫ۦۦ۟ۘۙۤ۟ۧۘۘۥۧۨۤۖۗۘ۫ۛۧۥۜۧۛۦ۟ۜ۠۠ۢۢۜۜۘۙۜۖۘ۠۠ۡۘۦۧۘۘۖۖۥۘ۫ۧ۠۠ۚۨۡ۫ۜۘ۠ۘۧۘۢ۬ۡۥ۫ۨۘۤۘ۫ۗۗۗۡۧ۠ۛۘۘۘۥۛۥۥۧ۟ۥۢۢ۬ۙ۟۟ۦۧۘۘۢۙۗۤۘۘۚۥۢ";
                                        case 248396934:
                                            String str7 = "۫ۤ۫ۗ۟۟ۙ۠ۥۘۤۛۜۜۦۚۗۥۨۘۗۙۨۨۙۤۙۘۨۚۨ۫ۢۢۨۘۛۡۘۘۛۤ۬۠ۜۖۘۡۖ۫ۙۢۥۘ۬۟ۡۘۢۤ۠ۢۜۧۘۢۘۥۙ۠۟۠ۜۗ۫ۤۦۘ۠۟ۧۗ۠۫ۥۤۤۥۚۢۚۛۡ۬ۡۤ۫ۘ۠ۥۥۡۘۖۤۡۖۙۨۨۖۧۗۙۦۤ۫ۧۧۥۨۛۚۢۤۖۚۚ۠";
                                            while (true) {
                                                switch (str7.hashCode() ^ 1009605372) {
                                                    case -1521509311:
                                                        String str8 = "ۙ۠ۨۙ۠ۛۜ۟۫ۤ۟ۤ۫ۖ۬ۦۗۦۘۖۢۢۦۨۖۘۥۖۛۚۖۖۦۥ۟ۡۧۖۖۖۚۨۡۧۘۛ۟ۥۦۡ۟ۚۥۦۘۡۥۦۘۙۦ۫ۚ۠ۨۗۥۦۘۛ۠۠ۧۙۦۛۚۖۥۙۚ";
                                                        while (true) {
                                                            switch (str8.hashCode() ^ (-164017368)) {
                                                                case -815194357:
                                                                    str7 = "ۘۥۢ۠ۤۖۢۡۜۙۗۖ۫ۦۘۧۧ۠ۢۜۖۘۧۤۨۘۚۧ۠ۚ۬ۦۤۨۗۗ۫ۦۥ۠۟ۧۚۛۥۥۡۙۧۖ۠۬ۦۦۧۜۧۢۗۧۛ۠ۦۡۙۘۙۘ۬ۚۦۜۙۛۦۘ";
                                                                    break;
                                                                case -628150562:
                                                                    str7 = "ۜۜۦۘۦۖۤۖۛۦۗۜۙ۠ۦۘۨۢۙۦۤۖۘۤۡ۬ۘۦۧۙ۟ۜۡۚۜۘۡۗۤۗ۟۟ۡۧ۟ۙۚۜۘۥۨۘۤۜۗۨ۟ۚۖۛۗۘۜۦۘۙ۬ۛۥ۟ۖۘۥۜ۬ۤۦۜۘۚ۟ۥۘۜۢۧۡۜۦۘۨۚۚۤ۟ۥۦ۫ۧۜۦۜۢۙۛۖ۟۫ۜۛۤۚۡۦۘ";
                                                                    break;
                                                                case -9474179:
                                                                    str8 = "ۜۗۡۘۙ۟ۚۦۘ۠ۨۨۘۖۛۡۘۛ۟ۢ۫ۖۚۜۖۘ۬ۛۧ۟ۚۖۘۖۧۘ۬ۦۛ۟ۗۙ۫ۢۖۗۛۛ۠ۘۙۜۢۚ۬ۤۖۘ۠ۚۖۧۙۚۢۜۧۘۖۦ۬۠ۘۢۘۗۡۛ۟۠۫ۜ۫ۨ۟ۗۛۡۙۘۘۖۧۥۢ۬ۥۜۦ۟ۙۥۤۚۜۨ۟ۧۙۥۚۧۨۘۧ۟۬۫ۚۤۢ۫ۙۡ۫۠ۡۨۜۚۦۙۨ۟ۚۦۘ۫ۜۡۘ";
                                                                case 1598027732:
                                                                    String str9 = "ۥۤۘۘۥۜۛۢۥۙۘۦۢۗۥ۟ۜۖۖۘۧ۠۫۬ۘۗۢۧۖۘۜۙۘۘ۠ۡ۫ۜ۟ۢۜۦۖۘۡۢ۫ۖۘۤۦۦۤ۟ۜۜۨ۟۠ۤۦۡۘۙۚ۫ۧ۟ۖۦۜۢۨۙۨۧۘ۟ۗۨۘۛۦۦۦۦۤۘۚۙۜۨۘۧ۠ۥۥۚۤۤۨۜۘۡ۬ۢۚۙۧۤ۬ۚ۫ۘۧۦۢ۬ۧۦۘ۟ۛۦۗۤۜۘۖ۟۠ۙۤۜۤۖۢ۫ۨۥۛۜۜ";
                                                                    while (true) {
                                                                        switch (str9.hashCode() ^ 577577472) {
                                                                            case -1551454773:
                                                                                str8 = "ۧ۫ۥۘ۟۟ۨ۬ۜۦۢ۬ۗۘۖۤۥۘۤۘۚۤۖۗۖۡۖۖۛۥۜۘۘۜ۫ۥۡۡۖۘۢ۬ۢۙ۫۬ۙۤۤ۠۬ۤۗۛۥۦۚۧۥۤۢۜۧ۟ۜۦۥۘۦۡۧۘ۟ۚۜۘۘۚۤۜ۠ۜۘۢۙۜ۫ۧۡۤ۠ۨۘۥۢۨۘ";
                                                                                break;
                                                                            case -1007431822:
                                                                                str8 = "ۛۨۥۥ۟ۡۘۚۘۥ۫ۦۜۖۡۧۗۜۚۢۥ۬۫ۦ۬ۚۖۖۨ۟ۦ۠ۘۙۗ۫ۢ۫۟ۘۘۙۤۦ۫ۗۦۚۜۘۘ۬۟ۨۘۛۢۥۤ۫۫ۗۛۢۢۚۚۛۦۧۥۘۙۧ۠ۜۘۥۘۢ۠۠ۧۧۤۨۚۥۘ۟ۛۦۗۦۘۦۨۛ۠۠ۤۛۚۡۘۢۤۨۘۜۧۡۘ";
                                                                                break;
                                                                            case -356187880:
                                                                                str9 = fixObbDownloadTask2.getStatus() == AsyncTask.Status.RUNNING ? "ۦۙۚ۠۟ۧۧۖ۬ۙۦۤ۬۬ۥۡ۬ۤۚ۟ۚ۬ۚۘۗۧۢۡۥۛۡ۟ۖۘۦۥۦ۬ۤۡۗۜ۟۫ۥۙۤۥۘۢۖۡۙ۬ۙۤۤ۬ۦۥۨۢۙۢۡ۠۫ۧۨ۠ۢۘۘۦۚۘۘ" : "ۚۧۦ۠۟ۢۖۤۡۛۖ۬ۨۗۨۙۖۜۚۘۘ۠۠ۚ۫۫ۤۙۚۢۘۚۢ۬ۦۙۨۘ۫ۡۤۢۤۖۤۥۛ۬ۧۧ۫ۜۦۚۦۖۜۘۚۤۥۘ۬۬ۖۙۚۧۘۗۙۜ۬ۚۛۡۧۘۗۘۧۘۢۜۘۘۛۖۜۥۗ۟ۤۙ۫۫ۜۧۘۦۗۥۘ۠۟ۦۦۥۜۘۚۧ۟ۘۖۧۘۦۘۗۢۚ۬ۖۧۚۗۨۤۡ۠۠ۥ۫۬ۧ۫ۥۘ۬ۗ۫ۜۨ";
                                                                            case 531882261:
                                                                                str9 = "ۡۜۘۘۗۗۤۤۨۡۗۥۘۘۚۥۨ۫ۚۘۤ۟ۜۨ۬ۡۘۘۧ۫ۙۤۘۘۖۙۛۤۤۗۙۚۦۥ۟ۤۦ۠ۡۚ۫ۘۛۙۛۨۥۘۖۚ۫ۖۘۡۚ۟ۦ۬ۦۚ۠ۧۤۢۨۦ۠ۛۘۛ۟ۖۗۨ۟ۦۛۜۢۧۖۤۙۘ۠ۦۘ۠ۜ۟ۥۢۧۧۦۨۛۘ۟۫۠ۦۘۤۤۛ۟ۚۤۨۤۡۘۖۚۛ";
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case -188035840:
                                                        str6 = "ۖۥۘۘۧۘۖۘ۬ۛ۟۬۠۫ۢۢ۠ۨۡۧۘ۬ۦۢۗۡۡۘۢ۫ۜۘۡۦۥۘۗۨۙۛۡۦۤ۠۫ۘۛۦۘۚۙۨۘۜۖۦۘۤۥۡۧۜ۬۟ۥۜۘۨۘۢۙۧ۫۫ۧۧۛ۫ۚۦۘۥۘۤۦ۟۟ۜۤۘۘ۟ۦۤۛۨۙۥۚۜۥ";
                                                        break;
                                                    case 478908920:
                                                        str6 = "۟ۧۜ۬ۘۧۘ۟ۨۧۘۧۧۦۛۘۘۨ۫ۧۙۢۘۘ۫ۖۥۡۧۘۨۢۘ۟ۦۘۗۛۛۡۖۦۘۥۜۚۗۗۙۧۢۤۦۥۧۘۤۥۥۘۜۦۗۘۧۘۖۗ۬ۖۜ۠ۨۛۗ۠ۛۤ۫۬ۚۖ۫ۥۘۡ۫ۥۘۦۙۧۛ۟ۜۘۥ۫ۛۛۘۦۚ۟ۤ۟ۚۧۢۗۨ۬ۜۘ";
                                                        break;
                                                    case 845946829:
                                                        str7 = "ۙۛۙۧۚۡۘ۟۟۫۟ۖۘۙۛۦۦ۫ۦۘۡۖ۠۠ۚۖۘۥۗۡۘۢۛۚۜۤۥۖۥۘۥۧۡۘۤ۠ۚ۬۠ۨۗۘۖۘ۬۬۬ۨۙۨ۬ۡۘۗۤۡۘۘۥۛ۠۠ۗۙۛ۠ۦۖۘ۫۫ۖۘۤۗۙۗ۠ۨۘۨۖۦۗۙۛۤ۫ۚۘ۫ۘۘۚ۠ۤۖۡ۫ۗۤۘۘۨ۫۬۬ۚۜۛۦۘ۠ۥۧۙۥۢۜۦۨۘۦۜۘۘۢۤۙۚۘۥۘۨۚۜۡۢۘ";
                                                }
                                            }
                                            break;
                                        case 265748946:
                                            str5 = "ۜۚۧ۠ۤۦۤۗۡۘۦ۬ۨۘۜۧۗۡۤۛۜۧۘۦۧۚۧۛۦ۟ۢۥۘۚۧۘۧۘۚۜۦۤۥۛۙۦۗۖۛۤۧۚۘۥۘۖۥۚۦۛ۟ۢۡۖۘۖۛۨ۬۬۠۫ۚۥۘۦۖۨۦۖۦۜۦۘۘۤۡۖۜۧۥ۟ۤۧ۬ۘۘ";
                                            break;
                                        case 2144746928:
                                            str5 = "ۨۙۜۧ۬ۚۥۨ۬ۨۙ۠ۥ۬ۘۘۨۛۥ۬۬ۚۥۛۨۨۜۧۘ۬۫۟ۧۘ۠۠ۥۛۗ۠ۦۘۗۚۖۥۥۧۢۗۙۥۢۜۙۡۘۘۗۧۚ۟ۖۘۖ۟ۢ۬ۗۖۘۨۖۨۨۥۦۥۛۘۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1830434933:
                                break;
                        }
                    }
                    break;
                case -1761894787:
                    fixObbDownloadTask.execute(str, str2, str3);
                    str4 = "ۤۘۤۤۘۖ۬ۨۛۤۖۡۜۧۢۜۨۚ۠۠۟ۖ۟ۤۜۦۗۡۘۧۨۤۙۛۚ۠ۧۛ۬ۢ۬۠ۥ۟۟ۗۡۨۘ۬۬ۘۘۨۤۘۖۘۖۘ۫ۜۜۢۜۜۨۦۘ۫۬ۖ۫ۖ۬۟۠ۢ۠ۜ۬ۢۢۨۘ۠ۧۡۘ۫ۜۥۥۤ";
                    continue;
                case -1144599434:
                    String str10 = "ۗۘۦۘۤۚۗۚۚۚۘ۬ۦ۫ۙ۬ۧۘ۬ۥ۟ۢ۫ۜۛۗ۫ۤۢ۠۠ۙ۬۟ۘۙۥ۫۬ۤۛ۫ۨۢ۫ۨ۟ۘۤۚۛۤ۫ۧۧ۟ۗۚ۠ۧۖۘۤۘ۬ۚۤۤۘۚۤۛۗۚۜۙۜۘۥۦۥۘۖۨۧۘۢۡۦۘۜۤۨۤۜۨۘ";
                    while (true) {
                        switch (str10.hashCode() ^ (-539495797)) {
                            case -1983859251:
                                str10 = "ۚۧۚۛۦۜۘۦۢۜۘۦۛۙۜۨۢۙۖۗۗۘ۟ۡۨۡۦ۫ۧ۠۫۟ۥۛۚۚۙۗ۟ۦۘ۟ۨۜ۠۫ۦۘۗۦۗۚۧۥۘ۠ۘۡۚۧۡۘۦۚۜۡۧۨ۬ۥۘۨ۟ۥۘۛۦۢ۠ۢۡ۠۬ۡ۬۠ۡ۬ۦۜۙۥۡۘ";
                            case -490296365:
                                str4 = "ۧۦۖۘ۫۟ۧۙۡۜۘۦ۬ۚۖۗۡۘۙۨۖۘۗۜۙۦۧۚ۫ۧۢۘۙۡ۫۟ۙۙۨۜۘ۬ۤۚۘۘۦۗۥۤۚۗۦۖۧۖۘ۬ۗ۬ۗۧۧ۫ۖ۬ۙ۟ۥۘۢۦۥۘ۠ۜۖ۬۟۠ۤ۫ۜۖ۬۠ۥۧ۬ۡۧۘۡۥۚۜۨۚۖ۟۫۠ۨۡۘۢ۠ۥ۬ۥۦۗۖۥۘۥۥۘۧ۬ۖۛۙۙۧۥۘۡۚۜ";
                                continue;
                            case 579230517:
                                break;
                            case 1163368317:
                                String str11 = "ۖۦ۬ۘۜۧۘۥۖۧۡۧ۟ۧۥۖۥۧۥۧۦ۠ۦۧۡۘۦۦ۠ۢ۟ۤۢۗۡۘ۫ۥۙۘۧۨۘ۟ۧۧۛۨۖۘ۬ۦۨۜۘ۠ۨۖۘۘۨۨ۟ۡۦۧۖۚۛۧ۠ۤۚۨۦۛ۠ۘۜۘۥۜۚ۬۟ۚۡۤۙۢۚۦ۫۬ۖ";
                                while (true) {
                                    switch (str11.hashCode() ^ 694675194) {
                                        case -535558898:
                                            str10 = "ۨۚۧ۟ۗ۟ۜۢۡۚۘۜۘۛ۬ۙۦۖۢۥۙۜۘۖۘۧۜۢۙۗۨۤۤۡۡۘۛۗ۫۠ۖۜۗۢ۫۫ۛۘۨ۬ۤ۬ۗۦۡۙۤۨۢۦۦۨۤۦۖۜۘۘۤۖۘۚۚۤۗۜۙۥۖۥ";
                                            break;
                                        case 569130289:
                                            str10 = "ۤ۫ۖۘ۠۫ۜۗ۫ۡۜ۠ۡۘ۬ۡۨۘۡۧۗۧۦۥۘۧ۟ۘۘۡۥۜ۬ۥ۬ۡۡۨۘۘ۟ۖۘۖۡۖۘۢۡ۠۟ۛۨۘۚۚۖۘۤۛۚ۫ۛۛۢ۟ۛۤۡۙۙۦۥۗ۟ۙۥۨۜۦۥۥ۠ۢ۠۟ۛۛۚۤۧ۬ۘۘۨۘ۫ۨۤ۫ۗۚۢ۟۫ۧۛۢۥۘۘۛۙۨۖۧۥ۟۫ۥۜۡۘ۫ۡ۟۫ۧۘۧۜ۬";
                                            break;
                                        case 981661909:
                                            str11 = "۫ۙۘۗۚۗۘ۫ۙ۠ۛۡۘ۬ۖۜۘ۫ۢۖۘۥۢۜۘۘۦۨۛۤۘۨۧ۫ۨۡۘۧۦۨۜۢۦۘ۟۬ۜۘۜۘۖۘۚۤۜۘۢ۠ۡۗۦۘ۠۟۫ۜ۫ۥ۠۫۬ۗۦۘۨ۟ۡۘ۬ۖۖۛۥۜۘۘۘۦۘ۠ۥ۟ۨ۟ۨۤۨۨۘۛۥۜۙۢۜۘۜۥ۬۬۟ۨۘ۟ۤۘۘۙۦۙۚۨ۬ۖۤۘۘۨۚۘۙۥۖۙ۫ۨ۬ۡۘۜۡۗۗۦۚۜۨۘۜۘ۬";
                                        case 2130649488:
                                            String str12 = "۠ۗۨۘۧۢۖۨۖۧۘ۠۫۬۬ۤۨۘۡۢۙۦۙۛ۟ۤ۫ۘۛ۟ۘۢۗ۬ۨۢ۬ۧۨۘۚ۫ۘۘ۬ۦۜۘۚۦۖۘ۟ۛۛۥۦۛۨۖۗ۠ۚۙۦۢۢۤۡۢۢۤ۠ۨ۠ۤۖۛۙۖ۬";
                                            while (true) {
                                                switch (str12.hashCode() ^ (-676333190)) {
                                                    case 327268556:
                                                        str11 = "ۤ۬ۖۘۚ۟ۨۘ۬۟ۦۘۚۚۡۘۧۗۧ۟ۘۙۦۗۡۥۡ۫۟۬ۙۖۗ۟ۚۤۥۘۗۘۤۗۙۖۘ۟ۦ۫ۢۙۨۘۜۨ۠ۨ۠۫ۘ۫ۥۘۡۦۘۤۛۦۘۡۜۥۗۜۙۜۢۘۘۜۘۡۘۥۤۡۘۙ۬ۖۘۗۥۡۘۨۨۘۖۙۦۚۛۛۤ۫ۛۡۛۦۦۢ۠۟ۥۛ۟۠ۛۦۡۦۚۡ۠ۢۖۘ۫ۖۙۨۥۚ";
                                                        break;
                                                    case 1074923789:
                                                        String str13 = "ۨ۟ۜۘۤۜ۫ۨۗۙۦۜۢۡۥ۬ۛۜۧۘ۬ۛۥۖ۫ۖۘۨۨ۬۠ۤۤۘ۫ۢۖۨۚۙۛۡۖ۫۫۬ۖۤ۠ۥۜۙۤۥۧۢۤ۠ۚۖۧ۫ۙ۠ۢۚ۠۫ۤۢۦ۟ۤۚۨۘۙۢۨۘ۠ۘۚۜ۟۬ۜۥۙ۬۬ۙۚۚۧۨۘۢ۟ۜۘۙۖ۠ۙۥ۬ۖۧۘۦ۫ۖۥۛۗۥۧۨۘۗ۠ۚۡ۫ۚۛۦۗ۟ۧۤۦۘ۫ۤۦۢۢۥۘ";
                                                        while (true) {
                                                            switch (str13.hashCode() ^ 1792205152) {
                                                                case -1672961608:
                                                                    String str14 = "ۗۛۧ۟ۙۨۛۘۢۘۥۖۘۤۗۖۘۢۦ۫ۜ۠ۥۚ۫ۢۖۙۛۚ۫ۡۤۦۘۘۛۢۨۤۨۦۙ۟۫ۘ۠ۥۘۛ۠ۗۜۖۙۡۨۛ۬ۙ۠۟۬ۚۦۡۨ۟ۦۥۘۥۗۨ۬ۛۙ۠۠ۛ۬ۥۧۘۛۚۦۘۨ۠۟۬۬ۙ۠ۙۜۘ۫ۧۖۗۦۨۘۗۧ۬ۧۖۢۙۥۤۡۚۨ۫ۤۢۥۡۡۡ۬ۡۙ۠ۨ";
                                                                    while (true) {
                                                                        switch (str14.hashCode() ^ 1835931828) {
                                                                            case -1614845511:
                                                                                str14 = "ۢ۫ۢ۟۬ۤ۫۠ۗۙۧ۫ۚ۟ۛ۠ۦۘ۬ۨۧۘ۬۬ۗۚۨۡۘۥۡۦۡۗۚۜۤۖۧ۬ۤۛۛۙۘۛۗۤۡۙۨۧۦۥۡۚۛۙۧۧۜۨۖۤۥۢۨ۫ۚۛۦۛۡۚۨۖۢۧ۬ۛۙۘۨۗۡۘۧۛ۫ۙۥۘۡۙۤۡ۬ۥۗ۟ۦۢۛۧۡۧۖ";
                                                                            case -608508829:
                                                                                str14 = fixObbDownloadTask2 != null ? "ۢۚۚۜۥۜۘ۬ۜۜۢۤۢۜ۫ۡۖۗ۠ۡۜۜۘۙۜۗۗۢۚ۬ۜۚۧ۫ۢۤۖۦۘۘۖۢۚۛۜۙ۠ۦۗ۟۠ۢۖۥۢۘ۠ۗۖۙۚۧۖۜۥۨ۠ۡۖۗۛۨۘ۠۫ۜۘۧۨ۠ۥۜۨۘۛۛۤۛ۬۠ۡۢۥۘۜۙۙ۟۫ۤ۬ۗۜۗۥۨۘۨۥۦۧۡۜۘۧۘۙ۠ۥۖۢۛۤۢۥۨ۟ۜۨۘ۟ۤۛۘۖۨۘۦ۫ۘۤۖۜۢۘۘ" : "ۢۛۦۘۡۖۦۘۨۖۘۛۦۥ۠ۥۗۙۘۧۥ۬ۜ۠ۦۢۡۧ۟ۛۥۨۘ۬۠ۘۘۦۘۘۘۥۗ۟ۜۢۚۥۦۜۡ۠ۨۘۡۙۜۦۡ۫۬ۢۖ۠ۥۤۧۘۦۘۦۛۘۧۦۢۥۢۦۘۚۦۙ";
                                                                            case 1032663155:
                                                                                str13 = "ۡۤۗۥ۟ۦۘۘۜ۠ۨۗ۠ۤۛۧۤۨۧۖۛۧۗ۬ۥۤ۬ۥۖۤۧۗۨۦ۟ۛ۠ۨ۠۫ۘۡۢۖۡ۠ۨۤۗ۫ۜۘۙ۠۠ۖۥۨۘ۠ۘ۬۫۫ۨ۟ۘۨۥۗۨۦ۬ۗۜۖۜۘ";
                                                                                break;
                                                                            case 1848761896:
                                                                                str13 = "ۥ۠ۖۘۧۢۡۘۖۤۥۘ۬ۢۗ۟۬ۛۖۗۘۧۡۧۙۤۢ۫ۤۨۘۗۘۗۡۤۦۘۚۚ۟ۢۡۘۗۛۥۖ۠ۚۢۙۖۧۧۦ۫ۡۛۜۖ۠ۘۧۛۦۡۢۤ۟۬ۦۢۛۨۘۘۥۨۡۘۥۖۙۤۢۤۤۤۤۧۛۦۨۘ۬";
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case -668282610:
                                                                    str12 = "ۚ۬۬ۨۜۚۦۖۧۤۛۢۧۡۚۢ۠ۢۙۥۘۖۙۜۛۨۜۘۖۥۖ۬ۗۡۘۖۡۗۘۚۚۗۙۥۨۨۥۛۤۦۘۤ۟۠ۚۢۤۤۤۨۘۗ۬ۘۘۛۡۘۚۦ۬ۢۧۙۧۨۤۜۤۜۢۤۧۗۜۨۘ۟ۦۥۘۜۡۢۚۛ۬";
                                                                    break;
                                                                case 895965599:
                                                                    str12 = "ۧۦ۠۬ۢۥۘۗۘۖۙ۬۬ۙۛۥۘۦۦ۟ۥۨۧۚ۟ۥۘۥ۟ۤۜ۬ۨ۫ۥۛۦۛۤۙ۬ۘۗ۬ۖۡۧ۫ۦۦۡۘ۟ۛۨۘ۟۫ۘۘۗۚۙۢ۬۠ۘۧۡۤۦۙۨ۠ۡۜۤۚۛۡۛۧۤۜۘۥۚۘۧ۠ۘۧۡۘۖۦۘۘۢۛۨ۟ۥۤ۟ۡۘ۟ۡۢ۫ۙۡ۬ۘ۟ۛۚ۠ۙۜۘۥ۟۟۫۠ۙ";
                                                                    break;
                                                                case 1424221862:
                                                                    str13 = "ۗۦۡۘۙۨۗۚۚۢۨۨۘۛۛۜۘۦ۟۟ۢۗۡۡۢۙ۬ۡۘۘۤۥۛۧۥ۠ۛ۠ۘ۬۫۫ۤ۫ۤ۬ۤۥۘۙۘۘۤ۟ۨۘۙۙۜۗۡۛۤ۬ۖۘۧۨ۟ۙۥۧۜ۬ۜ۠ۛۘۘۧۘۚۤ۟ۘۙ۟ۦۤۥۡۘۡ۟ۡۘۦ۠ۨۘ۠ۧۛۧۨۘۤ۫ۥۘۧۙۗ۠ۛ۠۫۠ۡۜۛۡۘۖۛ۬ۗۥۡۘ۫ۗۚ";
                                                            }
                                                        }
                                                        break;
                                                    case 1080808448:
                                                        str12 = "۫ۢۛۚۜۦۘۤۘ۬ۚۤۜۘۙۤۡۘۨۢۡۨۗۛۥ۟ۤۛۤۨۥ۫۟ۥۨۘۘۛۨۡۥۧۘۙۧۜۘۨۜۛۢ۫ۙۦۙ۬ۧۡۢۦۡ۫ۨۘ۟ۗ۟ۨۡۗۜۙۙۧ۬ۢۜۘ۬ۜۨ۫ۢۥۜ۠ۨۘۢۡۖۘ۟ۢۘۡۘۦۘۜ۫ۜۘۖۙۡۡۧۤۤۗۥۘ۠ۤۖۖۛۦۛۦ۫ۦۦۥۘ۬ۨۥۘۖۧ";
                                                    case 1901936229:
                                                        str11 = "۫ۙۧۙۢۚۨۚۘۘۤۗۘۧۜۤۤ۬ۖۥ۫ۢ۟ۘۖۘۗۙۙۢ۬ۚۜۜ۠۠ۦۖ۟ۥۘۚۖۥۘۗۖۥۖ۟ۖۘۖۦۘۨۚۜۘۖۙۙۙ۠ۜۢۨۦۘۧۢۚۤۙۥۘۥۘۘۖۥۘۘۗ۬ۚۙۨۤۦۘۨۖۥۘۙۢۤ";
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -783515718:
                    str4 = "ۗۦ۬۫ۜۨۘۡۛۛۨۘ۬۬۫ۨۘ۬ۥۚۧۘۦۦ۠ۚۦۦۦۗۤۖۢۘۜۧۘۘۛ۠ۡ۬ۙۨۜ۠ۚ۫ۦۘۘۜۦۘۘۙۚۗۧۧۡۨۘ۫ۛ۟ۘۖۨۘ۫۬ۦۘ۠ۙۥۘۨۡۙ";
                    continue;
                case -626517774:
                    fixObbDownloadTask2 = this.currentTask;
                    str4 = "ۥۜۚۥۘ۟ۘ۠۫ۖۖۘۧۦ۫ۜۥۘۚۤۨۘ۟ۗۘۘ۫ۛۦۘ۬۟۫ۚۧۢۡۛۙۛۢۨۗۖۢۤۤۥۘۗۡۤ۫۠ۜۘۛۤۡۘۢۚۘۖ۟۬Oۢۙۖۢۛۨۗۖۘۘۡ۠ۥۘ";
                    continue;
                case -566497963:
                    str4 = "۬ۦ۟ۥۡۧۦۧ۟ۧۤۖۘ۟ۧۗ۠۫ۡۘۚ۬ۦۤۚۡۦۡۢ۬ۧۢۦۦۡۘۚۥ۠ۖۢۖۘۗ۠ۘۢۘ۟ۤ۫۫ۡۢۢۢ۫ۤۗ۬ۖۚۛۥۦۦ۟ۧۢۦۘۧۧۧ۬ۡۘۤۜۥۘۤ۫۫ۡۥۧۘۘۙ۬ۚۥۡۘۥۛۙ";
                    continue;
                case 299519069:
                    this.currentTask = fixObbDownloadTask;
                    str4 = "ۨۤۧ۟ۨ۫ۤ۟ۘۡۢ۫ۜۙۥ۫ۥۦۘۛۘۤ۬۬۬ۗۙۖۘۡۨۛۧ۟ۨۘۖ۫ۢۚۨۥۘۢۛۖۘۙۚۙۢۥۡۘ۟ۚۙ۟۬ۜۙۡۘۤۨۗۤۦۤۧۗۘۘۘ۫ۡۜۙۘۘۗۡ۠ۗۙ۠ۢۥۧۧۖۘۘۨۗۗۢۛ";
                    continue;
                case 497099437:
                    this.currentTask.cancel(true);
                    str4 = "۫ۛ۟ۙۛۡ۫ۖۛۦۖۘۢۤۖۘ۫ۙۘۨۥۢ۠ۖۜۚۜ۫ۛۚۡۥۧۧۛ۟ۜۥۙ۬ۧۖۘۖۖۨۘۧ۬۫ۗ۠ۗۢ۫ۡ۫ۢۘۖۛ۠ۥۨۡۖۚۚۙ۬ۦۧۨۨۨ۟ۦ۫ۛ۫ۥۦۗۡ۬ۥ۬۫ۦۘۜۨۤۖۨۦۘۥۖۘۘ۫ۦۤۗۙۡۜۡۡ";
                    continue;
                case 513287425:
                    str4 = "ۙۨۦۛۚۛۜ۟ۡۘۗ۟۟۬ۡۨ۟ۛۢۖۦۡۙۛۦۘۗۗۗۘۢۦۜ۟ۥۖ۫۟ۜۧۜۡ۠ۧۥۛۦۖۖۜۚۖۘۦ۟۠۠۟ۛۤۗ۠۬ۘۚۙۡ۠۬ۛۦۦ۠۬ۤۜۘ۬ۙۛۢۢۨۘ۬ۖۘۦ۫ۜۘۚۜۨ";
                    continue;
                case 1305204496:
                    return;
                case 1408358070:
                    fixObbDownloadTask = new FixObbDownloadTask();
                    str4 = "ۦۤۢۖۖۢۜۢۤ۬ۡۢۜۧ۠ۚۘ۠ۧۧۖۘۖۖۖۘۢۖۜۘۤۚۘۘۚ۟ۤۖۡۜۘۡۗۨۧۚۚ۠ۥۥ۬ۤۡۧۗۙۜۘۙۤۖۤ۠ۤۧۜۚۜ۬ۥۢۦۜۧۘۨۢۢۚۘۖ۟ۢۜۘۗۜۘۜ۟ۨۨۨۧۧ۫ۦ۠۟۟۟ۨۘۘۙۧۡۘۜۧۙۙۥۨۘ";
                    continue;
                case 1921976327:
                    str4 = "ۜ۟ۖۘۤۤۖۘۤۖۖۘۜۢۨۘۤۘۖۥ۬۠ۧۤۡ۟ۙۡۨۘ۬۬ۦۘۤۚۖۖۜۥ۠ۘۨۗۥۦۘۖۙۘۢۘ۬ۜۤۢ۬ۨۘۘۧ۠ۢ۫ۜ۫ۜۤۙۦۛۖۘۖۘۡۘۧۘۜۘۢ۟ۡۘۙۗۖۘۘۙۚۗۧ۫ۘۡۚۧۧۖ۠۠ۙۨۨ۬ۤ۫ۘۘۤۦۦۤۨۘۘ";
                    continue;
            }
            str4 = "۫ۛ۟ۙۛۡ۫ۖۛۦۖۘۢۤۖۘ۫ۙۘۨۥۢ۠ۖۜۚۜ۫ۛۚۡۥۧۧۛ۟ۜۥۙ۬ۧۖۘۖۖۨۘۧ۬۫ۗ۠ۗۢ۫ۡ۫ۢۘۖۛ۠ۥۨۡۖۚۚۙ۬ۦۧۨۨۨ۟ۦ۫ۛ۫ۥۦۗۡ۬ۥ۬۫ۦۘۜۨۤۖۨۦۘۥۖۘۘ۫ۦۤۗۙۡۜۡۡ";
        }
    }

    private void startPatcher() {
        String str = "ۡ۫ۤۢ۬ۜۘۗۤۖۘۨۗۜ۟ۙۡۗۤۘۘۖۖۖ۠ۚ۟ۛۙۡۘۤ۫۠۟ۧۡ۫ۤۖۜۡۧۡۙۥۘۙۜۖۘۜۦۧۧۧۛۛۜۨۘۛۗ۟ۗۙۚۡۤۥۜۖۢۤۤۖۘۗۘۥۚ۬ۘۨۚۨۘۜۡۦۘۙۡ۟ۜۗۤۥۚۘۘۙ۫۫ۙۖ۟ۗۡۤ۠۠ۧ۠۫۫ۘۙ۬ۗۛۢ۟ۜۖۨۤۙ۟ۧۡۘۢۙۦۘ۬ۛ۠۫ۚۨۘۦۜ۫۫ۨۚ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 68) ^ 973) ^ 231) ^ 795) ^ 57) ^ 370) ^ 826) ^ 72) ^ 320) ^ 415) ^ 486) ^ 609) ^ 407) ^ 50) ^ 413) ^ 837) ^ 559) ^ 528) ^ 597) ^ 186) ^ 967) ^ 990) ^ 844) ^ 66) ^ 946) ^ 416) ^ 129) ^ PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW) ^ 415) ^ 973) ^ 215) ^ 557769741) {
                case -611407228:
                    startFloater();
                    str = "ۗۥۗ۬ۗ۟ۥۚۜۚۘۗۤ۫۟۬ۘۥۧۡ۠ۤۡۡۤۖۧۘۢ۫ۜۢۥۡۘ۠ۤ۠ۨ۫ۘۘۥۛۥۢۢۧۢ۟ۦۙۛۙۤۨۘۘ۫۠ۖۘۜۦۗ۟ۦۨۘۡ۫ۧۙۚۢۦۙۢ۠۬ۦ۠ۨ۟ۥۖۧۘۜۖ۠ۖۜۖۘۘۘۧۡۦۜۘۚۥۧۘۖۛۗۦۚۙ۟۬۬۟ۙۢۨۦۜۙۡ۠ۜۜۖۦۦۚۜۡ۠ۛۚۜۘۡۙۨۘۨۚۛ۫ۗ";
                    break;
                case -151160909:
                    str = "ۡۢ۫۠ۙۛۜۢۖۢ۬۫ۡۚۥۘۧۧۧۧۚ۬ۙ۬۟ۘ۟ۘۘۢۢ۠ۧ۠ۦۧۘۨۦۡۘۤۧ۫۟۟ۦۘۧۦۖۨۖۢۡۨۖۢۜ۟۬ۗۦۗ۠ۦۗۛۙۧۦۨۘ۫۬ۡۘۢۧۢۤۨۥۙۙۙۚۖۜۘۡ۫ۥۘۤۨۛ";
                    break;
                case 232527599:
                    str = "ۤ۬ۙۨ۠ۚ۟۫ۜۦۚۥۘۚ۟ۢۨۛ۬۠۟ۜۥۡۖۘۢ۠۟ۘۘ۬ۗۥ۬ۜۘۧۘۨۗۙۙۤۜۚۛۥۘۦ۟ۤۗۨ۬ۤۙۛۢۘۜۜۙۜ۫ۦ۬ۢۡۘۘۘۡۢۤۨۙۢۧ۫ۛۨ۠ۨۧ۟ۦۦۛۦۘۘۢۚۦۘۥۢۜۘۙۤۘۦۢ۬ۘ۟ۖۗۜ۬ۘ۠ۦۤۡۧۘۙۨۦۤ۠ۚۖ۠۠ۛۤۧۜۡۜۤۡۥۗۘۗ۠ۖۥۘ";
                    break;
                case 393045658:
                    String str2 = "ۘۡۡ۠ۖۖۙۨۖۥۧۡۘ۫۬ۥۘ۟۬ۜۘۚۥۦۘۤ۟ۡۘۦۚۖۘۜ۬ۤ۠ۜۦۨۢۡۘۗۢ۟ۧۨۗ۟ۢۘۘ۫ۜۚۚ۠ۥۘۜۦۚۥ۫۠ۙۛۚۥۧۧۛ۫ۡۘ۠ۢۗۢۢۘۘۡ۟ۦۘۘۜۙۚۥۧۘۚۛۨۘۡۘۧۛۨۢ";
                    while (true) {
                        switch (str2.hashCode() ^ 574869540) {
                            case -1656467716:
                                str2 = "ۤ۠ۜۨ۟ۚۚ۬ۙۤۥۧۘۨ۟۟ۙۨۜ۟۬ۜۜۡۖ۫ۢ۟۟ۗۛ۟ۡۗۦۛۦۖۗۨۡ۠ۖۘۚۜ۟ۨۢۨ۟ۧۘۘۤۢۛۛۢ۫ۙۖۡ۠ۗۥۘۗۖۜ۫ۛۚۧۗۛۨ۬ۨ";
                            case 2260369:
                                str = "ۚۙۖۘۨۨۚۘۙۡۘۖۘۖۘۙۘۡۘۢ۟ۡۖۜ۬ۛ۬۠۬ۢۧ۬ۚ۫ۛۛۛۛۡۘۡۚۚ۠ۘۖ۠ۜۖۘ۟ۖۡۘ۫ۤۥۘ۫ۚۖۘۙۖۙۥۙۙۧۜۖۛۢۢۙ۠۫۟ۤ۬ۙۙۘ";
                                continue;
                            case 653411108:
                                str = "۠۠ۡۘ۬ۛۜۦۢۘۧۦۢۘۧۦۤۚۡۜۛۙۙۗۦۡۨ۬ۖ۠ۛۡۡۚۗ۟ۨۥۗۜ۬ۧۙۚ۠ۡۖۜۧ۫ۘۜۘۥۦۗۤۘۥۘ۬ۘۥۢ۫ۖۗۗۦۖ۟ۖۢۗۨۙۜ";
                                continue;
                            case 2087084888:
                                String str3 = "۠ۗۖۘۨۗ۬ۚۜۨۘۥ۫ۨۢۜۧۘۖ۠ۥۘۘۙۦۘۢۗۖۘ۠۬ۘۦۦۘ۟ۛۙۥۡۥۢۖۗۡۘۢ۬ۨۘۘۛ۫ۨۧۗ۫ۛۨۘۜ۠ۦۙۤۘۘۨۙۘۡ۟ۜۢۢۛۗ۟ۨ۫ۨۡۘۜۧۜ۬ۨۥ۠ۙ۟ۦۧۖۚ۠ۦۘۧۖۜۘ۬ۚۜۡۧۜۘ۫ۤۤۢ۬ۚۥۡۨۘۙۛ۠ۦ۬ۘۘۦۙۤ۠ۥ۫";
                                while (true) {
                                    switch (str3.hashCode() ^ 2112663270) {
                                        case -1172390697:
                                            str2 = "۬ۙۗۚۦۗۥۦۜۦۧۡۜ۟ۦ۬ۘۥۘۧ۠ۙۖ۟ۥۢۙۘۘ۟ۦۨۖۢۥ۬ۘۜۘ۟ۨۖۘۨۗۡۡۜۘ۠ۚۨۙ۬۫ۤۢۖۘ۟ۘۧۤۧۖۦۦۘۙۥۘۘ۟ۦ۠ۢۖۡۦ۬ۢ";
                                            break;
                                        case -517266089:
                                            String str4 = "۬۬ۧ۬ۧۥ۠ۙ۬ۥ۠۬۠ۚۙۚۙۖۘۨۖۚۤۚ۠ۧۚ۟۟ۖۡۘۙۨۥۘۧ۠ۨۗۙۦۥۤۜۚۘۧۘ۟ۖۦۜۧۨۘۘۤ۠۫ۚۡۘۡۢۚ۬ۨۡۘۨ۠ۡ۬ۦۨۦۛۜۥۖ";
                                            while (true) {
                                                switch (str4.hashCode() ^ (-1152342314)) {
                                                    case -776272848:
                                                        str4 = "۫ۖۧۘۙۦۧ۫ۤۦۦۡ۠ۚۧۦۘۛ۫ۖۢۜۥۘۙۡۧۘۛۢ۫۟ۖۨۘۗ۫ۤۧ۫ۥۨۨ۠ۗۖۢۜۡۦۥۢۡۘ۠ۙۘۚ۫۬ۨۦ۠ۤۖۢۧۧۥۘ۟ۢۖۘۥۖۖۖۡۡۥۛۡ";
                                                    case 325612317:
                                                        str3 = "ۘۜۖۖۙۗ۬ۖۦۙ۬ۜۙۖۥۘۦۤۚۜ۫ۡۘۢۙۡۛۖۥۢ۬ۙ۬ۥۛ۫ۘۘۥۖۙ۬ۨۡۡۛ۬ۨۧۦۘۡۗۜۗۙ۟۟ۗۖۘۡ۫ۡۘۜۖۖۘۗۨۘۘۨۤۤ۟ۧۨۚ۫۟ۜ۠ۚۤ۬ۦۘۘۥ۬ۗۘۥۜۖۨۘۥۤ۫ۜۧۤۗ۬۠ۦۢ۠ۤۨۘۘ";
                                                        break;
                                                    case 637249789:
                                                        str3 = "ۗ۟ۘۢۘۚ۫ۛۖ۠ۛۨ۬ۥۙۗۛۥۘ۬ۙۡۦۢ۬ۙۥۨۘ۫ۥۦۗۨۜ۠ۙۛۙۦۧۧ۟ۘۗۖۧۘۡ۟ۚۢۗۢ۟۠ۖۘ۬ۢۗۥۥۛۗۧۤۛ۫۟۫ۢ۟ۙۥۜۘۨۦۤ۫ۛۤۢ۫۫ۨ۠ۨۛۥۦۦ۫ۦ۫ۜۥ۠ۢۜ۬ۦۘ۟۠ۜۘۜۤۙۚ۬ۦ۟ۡۧۘ۫ۦۥ۟ۧۚۙ۫ۡۘ";
                                                        break;
                                                    case 647145913:
                                                        String str5 = "ۘۚۗ۠ۙۖۢۜۘۦۙۖ۫ۜۨۘۖۙۧۧۚ۟ۘۚۨۛ۫ۥۘ۠ۚۨۖۖۡۜۨۘ۟۬ۨۘ۫ۨۦۘ۬۟۬ۢۦۡۘۘ۠ۖۙۦ۠ۛۧۦۘۘۢ۬ۗۤ۠ۘۦۧۘۜ۫۟ۗۡۙ۟ۤۤۘۢۜۘۧۙۘۘۤۖ۟ۧ۟۬ۗۤۘۘ";
                                                        while (true) {
                                                            switch (str5.hashCode() ^ 1639333648) {
                                                                case -2002673604:
                                                                    str4 = "۬ۚۦ۟۫ۜۚۤۛۡۛۖۘ۟ۡۦۘۖ۟ۡۜۙۢ۬ۚۥۘ۬۟ۥۘۙۢۧ۬۬۠۠ۢۨۡۙۖۘۖۖۖۥۢۧ۬ۛ۫ۨۜۛۤ۠ۡۚۛۜۡۤ۟ۙۚۡۘۤۘۙۙ۠ۙ۟ۥۜۘ۠ۡۡۘۛۢۥ۠۬ۦۗ۬ۜۦۥۗۙ۬ۛۛ۫ۚۖۦۘۖ۠ۦۦۘ۫۠ۜۘ";
                                                                    break;
                                                                case -1727180185:
                                                                    String str6 = "ۘ۬ۨۘۢۜۥۘۜۗۖۦۥۖۥۢ۬ۙ۫ۚ۠ۧۦۘۥۤ۟ۘۚۦۘۙۥۡۘ۬ۦۢ۬ۡۨ۫۟۟ۖۘۚۗۤۡۥۛۡۖۦ۬ۚۢۧۖۘ۟ۚ۫ۥ۫ۚ۟ۤۢۜۚۡۘۚۦ۬ۖ۠ۥۘۥۧ۫۫ۦۘۘ۬ۦۨۥۙۙۨۦۘۡۘۦۜ۠ۢۘۖ۠۠ۨۘۧۖۡۘۛۧۛ۟ۦۖ۠ۘ۫ۤۨ۬ۖ۬ۥۚۨۚۢۢۦۘۛۥۘۙ۠ۗۢۚ";
                                                                    while (true) {
                                                                        switch (str6.hashCode() ^ 1186640354) {
                                                                            case -1325145155:
                                                                                str5 = "ۤ۟ۨۘۦ۬۫ۦۖۡۚۜۥۘ۠۟ۘۘ۠ۚۜۚۦۨۤۦۨ۫ۢۦۘۚۨۡۘۦۜۧ۫ۥۘۘۥۤ۟ۡۜ۟۬ۖۘ۬ۚۢۚۥۢۡۡ۬ۦ۬۬ۤۙۚ۟ۦۘۨۤۛۗۢۤۥ۫ۦۘ۟ۙۖۡۦۨۘۢۧۥۘۦۙۛۛۡۥۘ۠ۛۨۘ";
                                                                                break;
                                                                            case -954476869:
                                                                                str5 = "ۘۘۥۘۘۢۦۘۡۙۘۘۤۥۤۖۗۡ۬ۗۘۧۗ۟ۘۨۛۜۤ۬ۨ۟ۘۘۨۨۖۘۦ۫ۨۘۜۡۜ۬ۙ۫ۜۦ۟ۦۨۜ۫ۥ۠ۖ۫ۧۛۚۨۘۥۜۜۤۚۘۘۘۗۛۤۛۤۙۧۜۨۨۘ۠ۤۡۜ۫ۘۘ۬ۛۦۘ۫ۨۜۘ۬ۗۨۘۛ۠ۥۧۚۖ۟ۡۧۘۚۧۥۥۘۖۖۘۖۘ۠ۨ۬ۚۧۜۘۗۧۙۚ۟ۖۨۜۘ۫۟ۘۡ۬ۛ۠ۖۙۡ۬ۘ";
                                                                                break;
                                                                            case -182799248:
                                                                                str6 = "ۨۨ۬ۙۚۢ۬ۨۖ۫ۨۘۜ۠ۙۖۨۧۙ۠ۖۛۡۛۘۧ۠۫ۡ۟ۤۗۚ۠ۘۜۛ۟۟۬۫۫ۨۜۡۘۘۜۙۘۜۖۤ۠۠ۢۤ۠ۥۧۘ۠ۚ۠ۨۘۗۘۛۦۛۦۧۚۧ";
                                                                            case 1179330329:
                                                                                str6 = !Settings.canDrawOverlays(get()) ? "۫ۢۤۨۗۡۘۖۜۨۨۗۦ۬ۢۥۘۙۛ۟ۛۖۜۘۘۙۘۘۘۡۙۗۘۙۥ۬۫ۖۘۘۙ۟ۦۘ۟ۘۚۙۘ۫۠۫ۥۘ۠ۤۜۘۧۨۗۢۙۖۢۥۚۛۛۧۤ۟۟۟ۢۦۘۡۧۖۘۤۙۜۘۧۦ۠ۥۡۨ۠ۦۧۘۤ۠۬ۥۘ۠ۤۨۖۖ۠ۡۚۚۥۡ۫ۘۦۛ۟ۙ۟ۤۙۙ۠ۥ۬ۛۘۢۥۘۛ۟ۜۘ۫ۥ۠ۛۖ۬ۛۜۘۘۚ۬۬ۦۖۘۘ" : "ۧۜۘۘۖ۫۟ۧۨ۠ۨ۬ۧ۟ۨۧۘۜۥ۬ۧۙۚۙۡۜۘ۫ۛۛۘ۠ۡ۠۟ۜۤۦۘۘۤۥۘۘۡۤ۟ۘۖ۬۠ۤۢۗۚۜۘۡۚۢۦۡۢۦۡۖۗۖ۠ۜۜۘ۟۟۫ۦۢۡۘۧۘۖۨۥۦۘ۫ۥۖۘ۠ۚۤ۬ۘ۫ۚۙۤ";
                                                                        }
                                                                    }
                                                                    break;
                                                                case -1618986856:
                                                                    str4 = "ۖۖۧۙ۬ۘۘۗۦۘۗۨ۟ۨۡ۠ۙۨۨ۬ۜۖۢۖۘ۬ۡۥۘ۬ۦۘۗۥ۫ۤ۟ۜۗۜۜۜۡۜ۬ۧۗ۫ۚ۫ۢۜۤ۠ۛ۫۠۠ۡ۟۠۫۫ۤۦ۬ۢۥ۟۠۬ۜۡۛۚۦۘۡۧۖۧ۬ۜۘۢۙۜۘۥۤۡۨۡۧ۫ۢۨۘۢ۫ۙۧۢ۫ۦۡۘ۫ۨۧ۠ۤۤۡۢۖۘۛۖۛۚۜۥۘ۬ۦۡۘۨۤۗۢۙۛۘ۟۠ۜۘۘۦۗۥ";
                                                                    break;
                                                                case 2082849625:
                                                                    str5 = "ۛۚۡۢۤۖۤ۠ۜ۠۠ۨۘ۬ۛ۬ۜۙۧ۬ۧۗ۫ۦۦۚ۬۟۠۬ۙۧۘۖۘۛۥۖۘ۬ۚۘۘۢ۬ۚۢۖۛۜۤۦۘۖۨۜۘ۠ۙۜۖ۠ۚ۬ۜ۟ۜۖ۟ۙۡ۠ۡۖۚۢۡۘۖۛ";
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        case -477452763:
                                            str2 = "ۡۘۦۘۛۦۜۧ۟ۘۘۤۛۘۘۘ۠ۧۤۥۛۜ۟۬ۨۧۗۥۥۘۛۜۦۘۧۙۥۨ۬ۨۨۤ۠۬ۜۘۘۡۘۜ۟۫ۥۘۤۗۜۘۗۢۤۘ۠ۢ۬۠ۢۢۜۥۥۜ۠۠ۤۗۦۢۦۘۗ۫۟ۢۘۨۘ۟ۤ۟۫۠ۜۘ۠ۨۥۨۘ۟۠ۜۥۜۛۖ۬ۡۧ۟ۛ۠ۤۡۡۘۨۡۚۖۤۦۘۖ۠ۗ۟ۥۡۖۚۦۘ";
                                            break;
                                        case -200009377:
                                            str3 = "ۘ۫ۥۘۡۡ۫ۜۦۘۚۡۢۦۡۖۘۦۚۡۙۤۥۨۡۧۘۚ۬ۡۨۗۨۘۖۤ۟ۨ۫ۛۡ۟ۦۥۡ۫ۜۥۡ۬ۚۘۦۤۜۘۗۡ۬ۗۤۖ۠ۤۦۜۙۘۗۗۨۘ۫ۨۢۦۖۥ۟ۢۖ";
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 945623516:
                    return;
                case 1536190375:
                    str = "ۗۥۗ۬ۗ۟ۥۚۜۚۘۗۤ۫۟۬ۘۥۧۡ۠ۤۡۡۤۖۧۘۢ۫ۜۢۥۡۘ۠ۤ۠ۨ۫ۘۘۥۛۥۢۢۧۢ۟ۦۙۛۙۤۨۘۘ۫۠ۖۘۜۦۗ۟ۦۨۘۡ۫ۧۙۚۢۦۙۢ۠۬ۦ۠ۨ۟ۥۖۧۘۜۖ۠ۖۜۖۘۘۘۧۡۦۜۘۚۥۧۘۖۛۗۦۚۙ۟۬۬۟ۙۢۨۦۜۙۡ۠ۜۜۖۦۦۚۜۡ۠ۛۚۜۘۡۙۨۘۨۚۛ۫ۗ";
                    break;
                case 1889261585:
                    startActivityForResult(new Intent(Deobfuscator$$app.getString(-3440727232273538889L), Uri.parse(Deobfuscator$$app.getString(-3440727017525174089L) + getPackageName())), 123);
                    str = "ۖ۠ۙۚۤ۬۟ۢ۬ۙۙۧۚۦۘ۠۟ۨۘۛۤۨۙۡ۬ۡ۠ۢۗۧۡۛ۠ۖۖۖۡ۫ۜۙ۫ۜۘۥۘۥۘ۬۫ۢۘۡۜۤۡۘۘ۟ۘۤۥۥۗۙۙۜۘۥۢۙۦۡۘۖۙۨۘ۬ۤۗ";
                    break;
            }
        }
    }

    private void stopPatcher() {
        String str = "ۙۦۤ۟۫ۗۙۧۚۚ۠ۧۡۦۨۧۥۘۘۛۨۘۗۖۖۘ۬ۜۨۚۙۨۜۙۗۨ۬۬۟ۚۧۗۗۨۢۧۤ۬۫ۚۦۙۧۚۛۖۢۚ۠ۥ۬ۖۘۤ۟۠۠۠ۨۘۘۚۡۤۨۡۘۡۢۤۘ۫ۘۘۤۜۖۘ۠ۚۡۗۡۗۥ۠ۨۘۢۙۢۨۨ۟ۛۖۨۜ۟ۡۖۦۢۦۡۘ۬ۗۥۘ۬ۘ۟ۖۦۚۢۥۘۘۡۘۚ۬ۚ۟ۢۙۙۥ۟۬۠ۢۨ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 350) ^ 409) ^ 576) ^ 155) ^ 965) ^ 370) ^ 688) ^ 761) ^ 328) ^ PointerIconCompat.TYPE_TEXT) ^ 971) ^ 632) ^ 346) ^ 40) ^ 326) ^ 487) ^ 958) ^ 659) ^ 571) ^ 922) ^ 372) ^ 779) ^ 324) ^ 667) ^ 230) ^ 491) ^ 196) ^ 496) ^ 729) ^ 583) ^ 965) ^ (-1029719659)) {
                case -707679159:
                    return;
                case -527887686:
                    stopService(new Intent(get(), ToggleBullet.class));
                    str = "۟ۡۧۡۙ۠۟۟ۡۡۦۗ۟۟۬۬ۢۚۡۚۜۚۙۜۦ۬ۨۘ۠ۖۦۘۙۘۥۧۗ۬ۧۥۧۘۖۦۦۖۦۧ۬ۗۚۤۥۚۜۨۘۗۡۧۚۖۢۧ۫ۨۗ۟ۘۜۚۗۡ۟ۜۘۜۧۜۘۗۥۡۘ۠ۗۜۘۤۤۖۘ۟۟ۢ۠ۤۥ";
                    break;
                case -310830936:
                    str = "۟ۡۥۙۨۦۛۤۡ۫۟ۧۙۚۙۢۜۡ۠ۘۜ۫ۦ۬۠ۖ۠۫ۗۥۘۘۡۧۛۖۨۘ۟ۗۥۘۢۘۦۘۖ۬ۜۘۙۢۢ۠۬ۡۘ۠ۘۧۡۦۦ۟ۨۥۘۤ۬ۥۜۘۜۘۘۨۘۙ۫۟۠ۚ۠ۛۗۦۘۚ۠ۥ۠۠ۚۖۚۡۘۛۨۖۦ۫۫ۢۘۜۘ۫ۙۘ۬ۘۨ۬ۘۘ";
                    break;
                case 972541127:
                    stopService(new Intent(get(), ToggleAim.class));
                    str = "ۚۢۚۥۢۙۜۛۦۤ۟۠ۙ۟ۢۚۢۥۙۡۗۨۖۦۢ۟ۤۖۤ۬ۡۖۘۢۚ۫ۢۛ۠۠۬ۡۘۢۦۥۘۢۡۘۘۡۡۖۘ۬۬ۨۗۖۢ۫ۚۘۦۚۘۘۖۧۜ۟ۧ۠۬۟ۦۘ۫ۦۘۘۢۚۦۗۧۡۘۥۙۜ۠ۡۙۙۛۚۧۚۛۛۜۨۖۡۥۢۢۛۦۨۘ۫ۨۧ۬ۖ۟ۥۘۜۘ۬ۦۘۧۧۜۗۨۜۘۚ۟ۦۦۖۨۥۦۡۛ۬۠";
                    break;
                case 1120694067:
                    stopService(new Intent(get(), Overlay.class));
                    str = "ۗۡۚۖۙۖۗۖۗۤۗۗۜۘۡۢ۠۠ۙۥۥۡۙۜۘۚۜ۫ۨۥۢۨ۠ۨۛۧۖ۠ۛۙۥۥۤ۠ۚۘۘۚ۫ۡۦۢۧۤۗۤۦۦۨۘۥۡۤۡۙۡۘ۬ۘۡۘ۬ۘۧۖ۠ۥۛ۬ۥ۬۫ۜۢۤۦۘۙ۠ۡۘۦۛۘۘ";
                    break;
                case 2014479680:
                    stopService(new Intent(get(), FloatService.class));
                    str = "ۥۦۤۖ۟ۜۘۡۢ۟ۨۡۛۦ۫۬ۖۡۧۗۥۘۧۡۥۘۖۗۡۘۖۧۦ۟ۛۖۘۥۨ۬ۘۘ۟ۛۨۥۡۨ۫ۚۨۡۗ۟ۥۘۨۡۧۗۘۘۗ۬ۥۘۜۚ۟۬ۥ۫ۗۤۜۘۘ۬ۧۨۙ";
                    break;
            }
        }
    }

    private void updateHideRecordColor(MaterialButton materialButton, boolean z) {
        String str = "۬ۨۧۘۥ۬۟ۚۦۖۘۘۛۙۜۡۜۥۙ۬ۨ۫۠۠ۤۡۘۥۤ۬ۢۙ۫ۥۗۖۘۨۖۛۧ۬ۥۘ۫۟ۧ۠۟ۥۘۖۛ۟ۢۨۦۘۖ۬ۗۧۗۦ۬ۦۧۘ۫ۢۘۗۤ۬ۗ۠ۨ۠ۗۘۢۦ۠ۤۨۘۢۖۤۢۧۥۙ۬ۗۜۢۥۦۚۖۘۙ۫ۥۘۜۢ۫ۤۖۖۘۗۙۤ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 972) ^ 766) ^ 212) ^ 993) ^ 596) ^ 756) ^ 382) ^ 90) ^ 846) ^ 727) ^ 476) ^ 131) ^ 595) ^ 521) ^ 821) ^ 750) ^ 426) ^ 438) ^ 295) ^ 114) ^ 682) ^ 861) ^ 629) ^ 32) ^ 47) ^ 92) ^ 97) ^ 489) ^ 1) ^ 447) ^ 454) ^ 1729988847) {
                case -2009169809:
                    materialButton.setIconTintResource(C0931R.C0932color.color0027);
                    str = "ۖ۫ۤۜ۟ۜ۫ۙۚۙۡۖۘۖۘۥۨۢ۠ۙۛۖۤۡۦۛۚۢ۬ۥۨۘۘۡ۟ۖۘ۠ۨ۬ۨ۫ۨۘۘۨۨۘۖۤ۟ۧۛۡ۟ۤۘۙۦۘ۠۫ۥ۠ۤۖۤۡۧ۠ۥۘۘۦ۟ۥ";
                    break;
                case -1982617276:
                    String str2 = "ۡۥۥۘۢ۟ۥۘۦۥۦۤۘۨۢۤۜ۠ۛۛ۬ۛۤۖۨۨۨۗۥۘۧۨ۫ۨۢۢۜۚۛ۟ۖۥۧۚۜ۠ۦۖۘ۫ۜۜۖۧۥۘۤۖۖۙۡۚۘۢ۬۬ۙۥۤۦۙۧۦ۬ۛۗ۫۠۫ۙۜۢ۬ۙۜۘۘۛۥۘۙ۟ۦۘۡۘۤۗۗۖۘ۫ۨ۟ۗۚۤ۟ۚۖۙۙۡ";
                    while (true) {
                        switch (str2.hashCode() ^ (-2004382037)) {
                            case -561453809:
                                str = "۬۫ۚۨۡۧۘۤۚ۫ۛۜ۟۫ۦ۠۬ۜۜ۟ۡ۠ۖۤۢ۫ۢۥۘۖۖۖۘۥ۠ۘۦۧۜ۠ۦۘ۫۠ۙۡۘ۬ۖۥۢۗۜ۠ۢۨۘۥۖۛۘۗۨۙۢۙۙۗۥ۠ۦ۫ۧۙۥۘۤۖۘۘ۬ۡۘۙۘۦۗۗۤۥۢ۟ۜۤ۟";
                                continue;
                            case -16126817:
                                String str3 = "ۖۙۥۘۙۜۜۘۛ۫۬ۨۘۡۡ۟ۚۢۧۧ۬۠ۢۦۢ۬ۡۚۥۧ۬۟ۛۛۦ۬ۙۥۘۥۦ۬۟ۦ۫ۤۦۤ۫ۜ۬ۖۗۗۜ۫ۡۨۘۘۧ۫ۡۡۜۙۤۧۗۚۢۢۢۡۘۘۦۗۘۘ۟ۦۘۛ۬ۙۧۥۦۘۗ۟ۤۦۡۧۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ 54514833) {
                                        case -749545548:
                                            str2 = "ۙۙۡۘۙۨ۬ۢۦۡۘ۫ۦۖ۠ۙۘۙۧۦۢۗۛۜۡۜۘۢ۟ۜۨۡۥ۠ۛۡۙۚۗۗۖۡۚ۟ۘۚۜۚۚۥۨۘۦۛ۬ۦۚۖۚ۫۟ۥۜۘۖۙۜۘۥ۫ۥۥۜۘۘۘ۬ۘ۬ۘۘ";
                                            break;
                                        case -272852185:
                                            str3 = "ۘ۫۠ۢ۠ۡۘۧۦۦۜۦۨۘۨۚۛۚۥۜۘۗ۬ۥۖۛ۟ۥ۬ۘۘ۠ۙ۠ۧۙۙ۫ۨۜۛۜۦۘۙۛۡۘۢۙۙ۠۫ۘۘۙۙ۠ۚۖۡۥۧۖۘۚۤۤۖ۫ۡ۠ۙۘۛ۬ۨۤۘۨۘۨ۬ۦ۟ۨۧۘ۬ۨۡۘ۬ۨۨۨۢۜۡ۫ۨۖۤۤۥۤۦۘۚۜۦۘۨۜۢۧۤۡۘۚۙۚۛۢۖۘۢ۠۫۬ۢ۠ۥۥۡۢۧۡۘۚ۠ۦۜ۫ۜۘۥۦۤ۟۫ۛ";
                                        case 365875239:
                                            String str4 = "ۨۘۚۧۢۡۘ۫ۘۖۘۚۨۜۘۜ۠ۡۢ۠ۚ۠ۜۦۘۤۙۡۘۜۦۤۦۙۚۜۨۢۛۚۘۧ۬ۘۘۦ۬ۦۧۜۖۚ۫ۨۘۢۨۗۘۦۥۘۤۗۤۘۧۥۡۚ۬ۖۘۦ۫ۧۛ۬ۧۚۛۖۘۘۤۤ۠ۚۨۧۧۦۘۖ۟ۘۥۡۨ۬ۧۤۙ۟ۥۘۦۨۧۘ۟ۗۘۛۤۛۤۚۦۧۤۦۦۗۡۘۖۤۖۘۢۧ۫ۙۦۚۚۚۗۖۦۛ۬ۥۨۘۡۚۛ";
                                            while (true) {
                                                switch (str4.hashCode() ^ 822666439) {
                                                    case -284319216:
                                                        str3 = "ۧ۬ۢۧۘۧۘۛۨۨۤۗۥۘۤ۠ۧۢۜۙۘ۠۫ۡ۠ۤۤۥۜۘۛۗ۠ۘۛۤۚۥۨۘۤ۫ۡۛ۫۫۬ۥۘۤۚ۠۫۫ۘۘ۬۬۟ۧۖۢ۫۬ۖ۟ۖ۫ۚۥۨۘۦۗۚۗۨۘۘۤۢۙۦۡۜ۠۟ۥۧۦۛۘۛۧ۬ۧۨ۫ۚۛۤۢ۟۟ۛۖۘ۟۫۬ۤ۠۫ۙۢۥۘۦۚۖۘۖۦۛۥۘۡۘۦۛۙۢۚۜۘۜ۬ۡۘۡۚۥۙۘۦۘۗۦۘۘ";
                                                        break;
                                                    case -103154576:
                                                        str3 = "ۥۨۖۖۧۘۘۨ۬ۥ۫ۜۦۗۜۙۤۥۥ۬ۦۜۘۡ۟ۚ۬ۛۨۘۗ۬ۚۜ۬ۨۘۜۡۡۘۛۚۚۧ۟ۨۢۜۢۡۛ۬۟ۡۨۖۤۜۘۙۛۤۚ۫ۖ۫۫ۜۤۖۜۖۚۤۛۗ۠ۘۚۦۙۡۢۘۤ۟ۨ۫۬ۡۘۙ۠ۤۖ۟ۖۜ۟۬ۥ۬۟ۨۨ۫ۚۘۡ۟ۥۚ۫ۧۜۜۨۤۥ۬۟ۙۖ";
                                                        break;
                                                    case 1138063317:
                                                        str4 = "ۢ۫ۨۘ۫ۢۚۡۚۨۢۗۜۥۗۨۘۛۚۥۘۦ۫ۦۘۥۚ۠ۜۗۦۘ۟ۗۤۙ۟ۡۘۤۢۜۘۘۚۗ۟ۥۖۢۜۘۦۧۢۚ۫ۦ۠ۦۧۡۧۥۢ۠ۙۥ۟ۢۡۚۥۙۘۧۘۦۚ۫ۜۥۢ۟ۘۡۘۦ۠ۦۘۛۡۘ۠ۚۘۗ۬ۡۛ۠ۡۜۙۧۗۦۧۜۗ۠ۨۙۤۜۦۥۙۥۡۖۧ۫ۚۧۥۙۛۖۦۘۦ۟ۦۘۖۢۥۙۡۘۜۜ۟";
                                                    case 1452066722:
                                                        String str5 = "ۛۖۢۨۨۗۥۙۖۘۧ۬ۘۡ۫ۧۗ۟۠ۛۨۘۘۙۘۦۢ۬ۗۜۖۘ۬ۢۖۡۘۚۦۘۖۡۢۦ۬ۦۙۙۡۗ۬ۢۜ۠ۛۡۡ۟ۗۛۛ۫۫ۜۘۧۢۦۘۚۦۦۘۛۖ۟ۘ۫ۦ";
                                                        while (true) {
                                                            switch (str5.hashCode() ^ (-1285673629)) {
                                                                case -1886924634:
                                                                    str4 = "۟ۥۦۘ۟ۦۗۥۧۦۙۥۦۘۤۥۢۛ۬ۡۡۜۦۤ۟ۜۘۧ۟ۙ۫ۢۚ۫ۗۜۘۦۙۥۘۛۤۦۡۖۦۘۜۙۤۦۡۖۘۜۡۥۖۢۤۧۖۧۘۗۤۘۛۗۦۘ۟۫ۡۘۘۖۡۚۜۤ۬۫ۧۗۡ۫ۘ۠ۦ۠ۥۦ۟ۛۖۘ۟۟ۛ";
                                                                    break;
                                                                case -92726725:
                                                                    String str6 = "۬ۧ۟ۙۢۖ۫ۖۜۙۨۤۢۘۜۘۥ۬ۖۨۚ۫ۗۛۥۗۡۦۢۥۘۤۧۜ۬ۘۧۘۗۛۥۥۧۨۘۜۜۘۥۤۤۡۚۖۘۤ۟ۙۧ۠ۧۛۤ۟ۘۚۜۘۨۧۤۤۜ۟ۛۛۜ۬ۚۖۨۨۗۧۖۜۨۜۨۘۜ۫ۦۘۖۡۧۘۖ۫ۦۘۗۥۡۘ۬ۧۥۘۧ۟ۚ۫ۜۚۖۜۘۜۧۖۛۨۡۨ۬۫ۛۢۙ";
                                                                    while (true) {
                                                                        switch (str6.hashCode() ^ 1884579093) {
                                                                            case 33839824:
                                                                                str6 = "ۗ۠ۨۘۗ۟ۥۚۚ۫۬ۚ۠ۖۦۥۖۜۘۨۛۖۘۙۛۜۥۛۙۚۘۦۘ۫ۗۤۜۛۛۢۢۧۢۖۛۤۘۜۘۨۦۧۘۚۘۦۘ۟۠ۦۘۨ۠ۖۘۧۥۦۘ۫ۚۧۚ۬ۗۧۗۥۘۥ۬ۡۗۥۡۘۢۛۡۘۨۘۜۘ۠۫ۥۜۖۘ۟ۜۨ۠۟ۜۘۨۦۖۜ۫ۡۡۧۡۤۥۖ";
                                                                            case 154702028:
                                                                                str5 = "ۧۛۖۨۛۜۘۘ۫ۦۘۘۢۢۜ۫ۚۤ۬ۨۥۜ۫ۘ۫ۙ۬۫ۘۛ۬ۦۧ۠ۨۨ۫ۥۤۜۘۘۚ۠ۘ۠۟ۗۛ۫ۡۘۡۡۧۥۤۦۘۚۖ۟ۧ۟۠ۛۥۘۨۨۙۥۦۜۘۙۛۥۘ۠ۨۛ۬ۘۛۘۢۘ۟۠ۥۧۘۦۘۘۙۘۘۖۜۧۜۜۦۘۢۨۡۘۡۘۨۘۚۨۗ";
                                                                                break;
                                                                            case 394433575:
                                                                                str6 = z ? "ۤ۟ۖۘۜۚۖۧۖۖ۫ۖۜ۠ۘۥۦۡۦۘۢۘۡۘۨۜۘۘۤ۫ۙۙ۠۟۫ۛۤ۬ۜۛ۬ۖۘۤ۠ۛۥۙۘۘۜۖۡۘۖ۠ۘۧ۠ۘۘۗۤۨۘۚۤ۬ۧۥ۟ۗۡۜۘۥۛ۠۠ۜۚ۬ۛۨ" : "ۚ۟ۤۗۤۜۧۘ۠ۥ۫۟ۛۡۦۤۦۛ۟۠۬۠ۜۙۢۨۘۦۛۥۘۙۤۡۘ۬ۚ۟ۧ۠ۘۖ۫ۡۘۜۘۡۘۨۙ۬۟ۦۜۖ۫ۜۘۢۙۦۘۜۙۤۙۡۢ۠۟ۨۛۜۗۖ۫ۡۙۙۡۘۜۡۚۛۡۖۦۨۜ۟ۜۜ۠ۤۨ";
                                                                            case 1297188260:
                                                                                str5 = "۠ۡۧۧۛۗۦۖۡۤۡۛۜۤۗ۬ۜ۟ۜۛۜۚ۠ۢۙۜۨۘۡۘ۫ۗۘۘۘۗۗ۫ۥۖۘۖۦۡۘۘ۠ۖۢۙۖۢۥ۟ۙۥۘ۟۬ۤۧۦۧۤۚۥۤۨۨۘۧۗۥۦۚۖۚۧۡۜۗۙۤ۬ۖۙ۫ۡۧۖۜ۠۠ۨۘۥۢۖۘۡۗۗۘۤۖۘ۫۟ۜۘ۠ۧۡۜۘۖۘۧۗۨۖۗ۠ۚۥۧۘۤۙ۟";
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 478722798:
                                                                    str4 = "ۙۨۦۘۥ۬ۦۘ۟ۘۛۚۢۚۥۙۨۛۙۚۦۜۨۘ۬ۥۧۘۙۖۦۚۤ۟۬۬۠ۡ۟ۜۨۡ۠ۨۦۘۘۗۧۤۜۥۘۖ۬ۜۘ۬ۖۘۘ۟ۨۛۘ۬۠ۡۤۖۥۤۥۘۘۗۗ۫۟ۡۘۚۤۛ۬۫ۢۦ۠۠ۜۜۘۗۘۧۘۖۚۢ۟ۜۗۧۦۥۡۤۥۦۧۥۘۙۦۡۨۨۘۘۦۜۢۨۨۢۦۨۥۘۥۥۧ";
                                                                    break;
                                                                case 1831136860:
                                                                    str5 = "ۙۖۧۘۙ۟۬ۘۤۙۢ۫ۖۜۥۖۘۧۧۖۘۥۤۡۘۚۨۢۦۦۙ۬ۚۨۘۖ۠۠۫ۚۖۙۚۚۚ۠ۤۚۦۘۘۘۛ۠ۦ۠ۤ۟۠ۧۗۘۤۤ۫ۜۧۚۙ۠ۖۦۜۘۧۢۖۘ۬۟ۘۘ۬۬ۚۢۥۘۘۤۦۤۡ۬ۖۖ۫۠ۖۖۛۥۙۧ۫ۢ۫ۜۨ۟ۢۖۖۘۛۥۨۘۥۗ۬ۘۧۡۡ۫۟۫ۙۦ۬ۢۘۘۤۥۘۘۛ۫ۜۙۨ۠ۙۢۚ";
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        case 1113827793:
                                            str2 = "ۘ۠ۘۜ۬ۨۨۤۦ۫۠ۖۨۛۥۤ۫ۥۙۚ۬ۡۘۧۗۨۘۦۘۘۘۢۦۨۙۤ۠۫۫ۜۘ۟ۨ۬۫ۧۘۛ۫ۖۘۨۧۦۦۛۡۘۧۡۚ۠ۚۨۘۗۖۘ۟۬ۥۢۛۛۗۗۡۨ۬ۢۧۜۛۘۢۙۚۦۘۜ۟ۤۧۛۧ";
                                            break;
                                    }
                                }
                                break;
                            case 1033785254:
                                str2 = "ۧۨۥۘۢۦۜۘۘۜۚۚۧۗ۫ۧۤ۠ۗۗۧ۫ۖۘۜۨۤۖۖۜۖۧۢۚ۫ۧ۬۫ۤۚۦۤ۟ۜۦۢۧۤۜۗۦۘۜۗۨۘۥۘۘ۠ۦۡۘ۟۬ۜۨ۟ۘۘۙۖۡۘۘۡۗ۬ۥۨۘۛ۫۬ۜۦۚۢۥۧۘ۬۬۫ۤۜۜۗۤۖۘۚۛۖ۬ۦۘ۠ۡۧۘ۠ۤۨۘۖ۬ۘۘ";
                            case 1820418555:
                                str = "ۦۗۢۖۧۖ۫ۜۜۜۨۥۘۦۨۦۘۖۤ۫ۘ۬ۛۜۖۦۜۘۚ۬ۢۡۘۤۖۜۘۡ۫ۥۘۤ۟ۤۧ۠ۛۘ۫ۦۘۜ۫ۖۦۗ۟۠ۨۖۘۘۚۤۙۜۜۡۧۨۘ۬۬ۛ۠ۤۦۘۛۜۡۘۙۥۨ۫ۢۧۨۢۢۧۘۧۘۛۘۛۛ۬ۨۖۧۦۘۙۖۨۘۨ۟ۡۘۛۘۢۖۢۖۛ۠ۘ۬ۥ۫ۘۢۦۘۙۢۡۘ۠ۛۥۗۥۦۘۡۥۥۘۛۤۜۘۢ۫ۡ۠۠ۜ";
                                continue;
                        }
                    }
                    break;
                case -1308423205:
                    materialButton.setTextColor(getResources().getColor(C0931R.C0932color.color0023));
                    str = "ۜۢۦۙۢۙ۫۬ۥ۠ۚۘۘ۫ۚ۠۟۟۫ۧۜۤ۫ۧۦۤۧۥۘ۠ۦ۟۬ۖۡۘۨ۬ۖۘۜۙۡۛۦۨ۠۟ۦۘۤ۟ۙ۫ۢۗ۫ۘۤۨۗۦۨۜۤۨ۬ۘ۟ۢۖۘۦۦۨۧۢۧۛۖ۠۠۟ۢۦ۫ۜۛۘۖۡۘۙۚۖۙۥۘۛۨۦۜۤۗۗۚۥۘۥۛۡۘ";
                    break;
                case -786113276:
                    str = "ۘۧۤ۟ۨۜۘۡۛۡۘۦۨۖۘۙۤۙۢۙۗۛ۫۠ۥۘۧۘۙۘۖۘ۠ۛۜۘ۫ۢ۠ۡۡۘ۟۟ۨۖۦ۬ۢۢۨۨۦۚ۟ۤۥۚۧۡۘ۬ۡۡۨۧۗۢۧۘۘ۟ۖۨۘۨۘۢۦۨۖۙۘۡۘ۬ۧۦۘۦۜۡۘۢۥ۬ۤۨۖۘ۟ۦۘۘ۟ۥۨۖۘۥۦۛۙۙۥۧۨۤۖۘۚ۬ۥۘۤۖۧۤۜۨۨۖ۟ۜۜۥۡۖۜ۠۫ۚ۬ۡۘۨۦۥۘۢۡۖ";
                    break;
                case -234852582:
                    str = "ۘۗۘ۟ۢۘۢ۟ۥۘۙ۠ۦۘۚۧۛۘۜ۫ۚۧۛۖۡۘۡۚۛ۠۟ۨۘۘۘۚۛۧۥۘۚۦۧۛ۠۟ۨ۟ۥۘۨۜ۫۠ۧۥۥۖۘۘۥۡ۬ۤۛۙۖۗۙۚۢۥۘۗۡۖۘ۫ۗۘۖۙ۠ۢ۟ۢ۠ۡۙ۫ۥۦۤۨۢۤۘۘ";
                    break;
                case -78136025:
                    str = "ۖۨ۬ۙۨۥ۠ۨۘۨۘۦۘۘۗۡۘۦۦۜۘۢۘۦ۟ۤۨ۫ۦۘۥۛۤۖۘ۬ۡۦۘۤۡۘ۬ۨۙۚ۠ۖۖ۠۬۠ۙۜۘۦۜۡۘۙۡ۫ۛۜۤۨۘۙۗۗۜۘ۫ۚۚۚۙۡۦ۟ۖۦۥۥۘۥۤۖۘۛۗۥۘ۠ۥۜۘۡۛۦۘۜۧۦۢ۠۫ۙ۬ۙۙۢۖۘۥۛ۠";
                    break;
                case 44531548:
                    return;
                case 804254856:
                    materialButton.setIconTintResource(C0931R.C0932color.color0023);
                    str = "ۙ۠ۨۘۖ۫ۜۘۜ۫۫ۥ۠ۦۘۗۗ۠ۤۦۗۚۢ۠ۜۙۨۛۤۤۨۙۚۚ۠ۜۘۛۜۜۘۡۥۤ۠۟۟۬ۖۤۘۘ۟ۦۜۥۦۨۜۢۛۚۥۚۥۡۦۥ۟ۛۥۗۥۗ۬ۜۘۡۥ۫ۚ۟ۦۘ۟ۡۙ۬ۖۜۨۢۡۘۦۥۛۛۡۗۥۜۧۤۘۘۨۦ۟ۧۢۨۘۤۖۛ۟۬ۖۘۡ۟ۚۙۛۦ۫ۜ۬ۖۗۢۖۢ۠ۨۥۥۘۖۧۡ۫ۧ";
                    break;
                case 955791365:
                    str = "ۦۗۡۘ۟ۘۖۘۙۤۨۙ۫ۢۥۙۘۘۨۘۡۘ۟ۖ۟۬ۥۨۚ۟ۧۧۦۧۘ۟ۖ۠۬ۧۙ۟۬ۜ۬ۜۢۖۚۜۘۡ۠۠ۦ۬ۚۜۘۜۘۗۥۤۦۚۘۘۛ۠۬ۘۥۘۘۚ۬ۖۘ۬۫۠ۡۗۘۘۧ۫ۥۘۙ۬۫ۗۧۚۢۢ۬ۤۧۥۘۚۗۡۖۨ۬۫ۛۗۨۛۥۜ۟ۚ";
                    break;
                case 1825114515:
                    materialButton.setTextColor(getResources().getColor(C0931R.C0932color.color0027));
                    str = "ۘۧۤ۟ۨۜۘۡۛۡۘۦۨۖۘۙۤۙۢۙۗۛ۫۠ۥۘۧۘۙۘۖۘ۠ۛۜۘ۫ۢ۠ۡۡۘ۟۟ۨۖۦ۬ۢۢۨۨۦۚ۟ۤۥۚۧۡۘ۬ۡۡۨۧۗۢۧۘۘ۟ۖۨۘۨۘۢۦۨۖۙۘۡۘ۬ۧۦۘۦۜۡۘۢۥ۬ۤۨۖۘ۟ۦۘۘ۟ۥۨۖۘۥۦۛۙۙۥۧۨۤۖۘۚ۬ۥۘۤۖۧۤۜۨۨۖ۟ۜۜۥۡۖۜ۠۫ۚ۬ۡۘۨۦۥۘۢۡۖ";
                    break;
            }
        }
    }

    public void Checking() {
        String str = "ۧ۠ۘۚۥۘۚۚۥۨۤۖۘۢ۠۫ۙۛۡۚۧۦۘۧۗۖۘۗۗۢۨۤۥۘ۠ۡۜۘۧۥۨ۠ۥۜ۬ۙۤۦۛۨۘۘۗۥۜۘۡ۫ۧۗۜۗۖۘۘۙۧۚۥۙۨۦۨۤۨۘۢۥۛۧۤۨ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 183) ^ 545) ^ 958) ^ 651) ^ 218) ^ 854) ^ 705) ^ 101) ^ 713) ^ 631) ^ 932) ^ 458) ^ 143) ^ 667) ^ 120) ^ 724) ^ 557) ^ 671) ^ 459) ^ 176) ^ FileUtils.FileMode.MODE_755) ^ 649) ^ 757) ^ 67) ^ 471) ^ 94) ^ 848) ^ 420) ^ 753) ^ PointerIconCompat.TYPE_ZOOM_OUT) ^ 615) ^ 1278313439) {
                case -926512128:
                    return;
                case -258911950:
                    str = "ۤۨۘۤۗۖۘۖ۫ۨۚۨۙۦۡ۟ۚۡۘۢ۟ۤۚۚۥۖۚۦۘۧۥۨۘۖ۬ۛ۟ۢ۬ۨۙۖۢۡۙۘۥۡۘ۬۬ۥۨ۠ۤۡۘۢۢۡۦۖۜۘۢۥ۟۫ۜۨۗ۠ۤۜۘۜۘۦۧۦۡۨۘ۫ۦۢۛۚۥۗۦۜۘۥۤۙ";
                    break;
                case -90780519:
                    String str2 = "ۨۨ۬ۦ۠۬۫ۙۙۤۢۗۢۤۥۘۗ۟ۘۛۢ۬ۦۢۦۥۖۡۘۚۙۜۘۛ۠ۖۘۛۗۥۘ۟ۨۘۢۢۨۘ۫۟۟ۛۧۡۘ۬۠ۘۘۧۛۜۘۧۘۢۗۦۧ۬ۡۡۘۖۙۘۘۡۙۨۗۥۖ۠ۗۛ۠۫ۖۘ۠ۢۜۙۛۛۘ۬ۖۙۘۗۤۡ۫ۡۘۗۗۗۢ۟ۜۘۤۗۙۖۤۧۧۤۖۘۨۙۨۘۨ۟ۡۘۜ۬ۥۜۚۙۚۚۘۢۙ۬ۦۘۗ۟";
                    while (true) {
                        switch (str2.hashCode() ^ 1837741823) {
                            case -2010420490:
                                String str3 = "۬ۘۡۘۗۤۘۚۥۤۨۛۥۘ۠ۢۥۘۙۢۜۘ۠ۧۨۘ۫ۖۜۘۧۡۘ۟ۢ۬ۘۦ۠ۘۘۙۜۜۘۢۥۦۘۖۗۜۘۙۨۡ۬ۢ۠۬ۥۡۘ۫ۛۨۧۡۢۧۢۖۡۥۚۖۖۗۜۥۧۘ۬۠ۜۘ۫۠ۥۘۧۘۘۘۜۦۤ۠ۡۗۘۚۦۘۥۜۘۤۘۨۨۢۘۘۚۗ۫۠ۢ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-485520564)) {
                                        case -1729801752:
                                            str3 = "ۤۦ۫ۛۚۙۘۧۘۘۨۤۥ۠ۙۚۜۛۜۥۡۘۙۗۢۢۛۨۘ۬ۥ۠ۜۘۡۘۥۧۙۨۥۥۘۥۜۜ۠ۚۘۘۗۙۛۡۦۤۛۘ۟۬ۙۥۘۘۦۨۤۜۦۧ۬۠ۢۚ۠ۦۦۖۚ۬۟ۨ۠۟ۧۘۨۦۘۗۢۘۚۗۡ۠ۜۧۘۛۜۨۘ۬ۚۘۘۤۛۥۜۗ۫ۖۚۡۨ۬ۙۜۚۜۛۧۢۚۚۚ";
                                        case 193046247:
                                            str2 = "۬ۤ۫ۨۖ۟۟۠ۛۤۜۥۤ۟ۦۘ۠۠۟ۚ۬ۥ۟۫ۥۘۨ۟ۥ۟ۙ۠ۨۧۖ۫۬۫ۖۧۦۨۘۗۧ۫ۧۢۗۜۦۙۨۘۜۘۡۥۡۥۗۤۡ۠ۦۘۜۨۙۖۦۙۚۖ۠ۚۥۖۦۧ۠ۖۧۘۨۡۧۘۤۙۦۥ۟ۢ";
                                            break;
                                        case 1762146753:
                                            str2 = "۠ۧۚ۟ۧ۬ۛۢۦۧۢ۫۠ۧۗۧۢۖۚۙۜۡۖ۟۫ۢۜۘۚۙۘۧۖۜ۬ۗ۟ۙۙ۫ۖ۟ۨۘۧۜۦۘۜۤۖۢ۠۟ۙ۫ۧ۟ۗۦۖۥۖۧ۫ۚۗۖۙۡ۟ۨۥۨۡۖۜۘ";
                                            break;
                                        case 1925210777:
                                            String str4 = "ۢ۬ۥۘۨۦۜۘۧ۟ۦۘۤۜۘۧ۟ۦۘۥۤۨۧۡۥۘۙۨۥۜ۫ۡۘۘۦۘۘۚۛۖۘۤۚ۟ۛۜۚۚ۬ۗۗۖۘۚۦۨۡۖۨۖ۟ۡۖۨۘۛۛۗ۬ۜۨۛۥۧۘۦ۟ۘ۬ۤۡۘۦۖۥۘۗ۟ۡۗ۬۟ۡۧۜۖ۠ۖۘۚ";
                                            while (true) {
                                                switch (str4.hashCode() ^ 2120758929) {
                                                    case -741240995:
                                                        str3 = "ۚۧ۬۟ۛۚۛ۟۟ۘۧۖۨۥۧۘۥ۫ۨۘۙۡۡۘۡۘۦۘۜۧۨ۫ۛۥۨۛۖۘۢۖۘ۬ۘ۟ۛۧ۠ۢۤۦۗۤۦۖ۠ۢ۟ۖۢۜۜ۬۬ۖ۫ۢۥۥۦۗۖۦۘۥۨ۫ۘۥۡۘ۫ۨۛ۬۫ۨۘۚ۠ۘۘۗ۫۫ۗۢۡۖۜ۫ۚۨۘۤ۬ۢۚۢۨۚۙۛۡ۫ۤۢۜ۫ۜۛ۫۠۫ۥۧۦۘۧۚۘ۬ۘۤۨۛۥۘۤ۫۠";
                                                        break;
                                                    case -552224233:
                                                        str3 = "ۦ۫ۥۘۗۤۘۨ۟۟ۦۖۜۘۜۦۘۘۜۗۥۘۜۘۢۘۙۜۖۤۥۥۜۘۘۖۡ۠ۤۥۚۦۛۡ۠۟ۖۧۗۖۘۤۡۨ۠ۡ۟۫ۡۚۚۢۜۘ۫ۧ۬ۘۘۨ۬ۜۥ۟ۚۘۘۥۢۨۧۗ۟ۥۦۡۡ۟ۦۘ۫ۦۘۨۦۡۢۡ۟۬ۡۙۤۖ۠۟ۧۘ۠ۛۨۘۖ۠۬ۦ۬۬ۚۘۘۧ۟ۥۘۧۜۖۘۢ۬ۡ۠ۙۜۘ۬ۧۘۖۤۖۘۙۚۘۘۥ۟ۢ";
                                                        break;
                                                    case -230317922:
                                                        str4 = "ۘۥۗۧۧۧۙۦۜۘ۫ۘۛۤ۟ۚ۠۬ۜۢۖ۠ۖۗۧ۫ۧ۠ۜۦۚۗۥۧۜ۫۠ۨ۫ۦۤ۬۟ۗۦ۬ۛۤۖۗۛ۠ۖۗۤۙۛ۬ۜۘۦ۠ۡۛۘۦۘۨ۫ۛۥۜۦۘۜ۫۬۬ۗۗۘۥۘ۫ۚۦۨۧۨۗ۠ۖۘۛۛۨۘۢۡ۟ۖ۠۠ۙۧۙۡۗۥۡۚۨۚ۫ۦ۠ۘۚۦۡۜۚۙۤ";
                                                    case -52058428:
                                                        String str5 = "ۗۖۨۘۤۛۙ۠ۧۥۘۢۙۖۘۥ۬۠ۡۥۨۘۧ۠ۜۘۙۗ۠ۘۗ۟۫ۙۛۧ۠ۨ۬ۙۢ۟ۨۜۘۛۥۖۘۖۥۥۜۡۦۘۤۧۗۦۛۘۜۦۛۘۗ۟ۚ۟ۙۢ۬ۙۨۦۥۤۖۨۘۘۢۧۘۦۗ۫ۜ۠ۦۛۛۖ۬ۚۙۧۜۙۜۚۜۧۘۘۚۢۥۘ۬ۤۡ۬ۛۥ";
                                                        while (true) {
                                                            switch (str5.hashCode() ^ (-1221155723)) {
                                                                case -1537002427:
                                                                    String str6 = "ۤۚۡ۫ۙ۠ۡۗ۫ۜ۬۫ۤۛۛۜۘۧۦۘۜۡۜۘۡ۟ۦۦۘۧۢۙۨۡۧۨ۟ۡۗۘۚۚۦۖۚ۠ۧۡ۟ۤۖۚۘۧ۫ۢۘ۫ۗۢ۫ۘۘ۫۟ۖۘۤۜۦۘۛۦۘۙۦۥ۠ۦۜۘۧۤۦۘۖۨۡۤۤۖ۬ۘۦ";
                                                                    while (true) {
                                                                        switch (str6.hashCode() ^ 1120401235) {
                                                                            case -1355327499:
                                                                                str6 = "ۖۙ۫ۥ۬۟ۘۤۨۚۥۘ۫ۗۖۢۖۦۖۘۜۜۘۘۚۨۢۖ۠ۧۨۥۚۧ۬ۨۘ۠ۦۥۘۦۙۜ۟ۧۗۨۨۚۛۢۤۗۢۦۘ۬ۢۗۧۜۨ۟ۦۗۚۧۦۧۥ۬ۧۨۘۨۥ۫";
                                                                            case -666846754:
                                                                                str5 = "ۧۦۖۘۡۥۦۧۨۧۘۤۛۗۛۜۢ۟ۜۘ۠ۖ۬ۚۛۖۘۗۙۙۚۗۘۥۘۤۤۜ۠۬۠ۨۚۛۢۨۚ۬ۤۥۖۗۥۧ۬ۦ۟ۨۧۘۨ۫ۛ۬ۜۥۘۥۙۥۨۜۙۨ۟ۘۘۘ۟۠ۛ۟ۧ۟۠ۗۘۡۥۘۘ۬۫ۘۖۗۗۡۡۡۜۤۨۦۨۗۚۦۘۧۜۛۧۗ۫ۦۚ۫ۛۡۤۦۨۛۜۖۧۦۡۧۛۢۜۚۙۗۜۚۗۨۚۛ";
                                                                                break;
                                                                            case 218278784:
                                                                                str5 = "ۗۛۥۘۢۤۤۢۘۖۘ۫ۤۦ۟ۧ۠۫ۦۤۡۛۙ۠ۖۦۜۢۥۘۚۥۘۢۦۤ۟۠۠ۤۚۢۚۖۚ۫ۖۛۜۘۛۨۜۘۜۛۨۘ۠ۨۖۘ۟ۜۥۗ۠ۥۘۖۦۨۘۡۘۨۘۘۖۥۙۜۦۘۜ۫ۥۡۘۙۛۘۤ۠ۘۘۚ۠۫ۡۧۘۜ۟ۖۘۥۥ۫ۘ۟ۘۦۨۧۛۗۧۥ۫ۗ۬ۖۚۗۖ۠ۚۥۡۙۗ۠۠ۧ۬ۛۥ۬ۜۖ۬ۖۘۨۘ";
                                                                                break;
                                                                            case 726013058:
                                                                                str6 = new File(new StringBuilder().append(getFilesDir().toString()).append(Deobfuscator$$app.getString(-3440731535830769481L)).toString()).exists() ? "۠۟ۗۨۗۥۚ۬ۛ۟ۨۧۘۚۖۙۛ۟۫۬ۧۧۨۢۚۢ۟ۖۘۘ۠ۖۘۗ۬ۙۚۤۘۘۡۗ۟۠ۡۚۜ۬ۦۘۜ۠۠ۤ۬ۢ۫ۜۘۥۗۙۤ۫ۡۜۨ۟ۜ۟ۦۢۤۙۢۥۙۥۡ۠ۡۜۘۢۘۙۛۘۨۡۛۢۛۚۛۜ۫۟ۡۥۛۦۘۨۘۖ۬ۡۨۘ" : "ۚۥۙۚۦۡۗ۟۠ۖۜۧۦۦۦۘۛۡۖۘۗ۟ۖۘۡۚۢۨۙۤ۬۠ۙۚۦۖۛۗ۬۟ۜۗۧۦۧۜ۟ۜۡۙۤ۟۟ۙۙۛۧ۠ۤ۟ۦۖۘۘۡۨۛۘ۠۠ۧۢۘۖۘۜۘ۫ۙۜۘ۟۟ۘ۬ۚۨۦۨ۫ۛ۬ۡۘۗۙ۟ۚۢ۫ۢۙۨۘ۬ۤۡۘۙۥۚ";
                                                                        }
                                                                    }
                                                                    break;
                                                                case 985366004:
                                                                    str4 = "ۢۙ۟ۤۧۧۘۥۜۘ۬ۜۦۘ۠ۖ۠ۙۗ۫ۧۨۘۦۡ۠ۤۦۢۦۦۜۘ۫ۛ۫ۦۖۖۘۖ۠۟۫ۦۘۘۛۧۤ۠ۨ۬ۡۨۦۚ۫ۖۖۦۜۡ۠ۙۜۘ۫ۥ۬ۤۢۤۙۘۢۡۘۢۧ۬ۨۢۛۦۙۙۡ۫ۜ۠ۙۥۘ۫ۧۥۦۡ۫۠ۚۦۙۙۘۘۥۥۖۚۚۥۘۙۤۖ۠۬۫ۨ۠ۡۘۤۨۥۘ۬ۖۧۘۛۥۧۨۘۛۧۗۜۚ۬ۥۘۘۛۧ";
                                                                    break;
                                                                case 995132715:
                                                                    str5 = "ۤۜۡۧۧۜۨۥۜۙۦۡ۠ۦۘۘۢ۟ۗ۫ۨۥ۫۠ۛۘۛۖۧۜۖۘۚۤۥۘۢۜۚۦۚ۬ۚ۬ۥۘۨۤۦۛۖ۫۠ۡۧۛۡۙ۠ۙۘۘ۬ۨۘۡۨۚۖۙۚۛۢۗۢۡۧۘۘۗۦ";
                                                                case 1511574263:
                                                                    str4 = "ۗۘۖۚۧۖۤۚۡۘ۬ۦۨۘۡ۬ۛ۬ۢۦۜۖۨۘۥۘۚۖۥۖۥۨۦ۠ۨۢ۫ۙۚۧۖۘ۫۫ۤۗۜۙۢۙۡ۟۟ۧۧۥۘ۠ۖ۫ۛ۫ۚۜۡۡۡۜۘۙۛۗۢۨۘۘۛۢۨۘۡۜۧۢۦۖۤ۠ۛ۠ۚۧۤۜۘۘ۬ۛۤ۟ۖۡۘۘۖۤۨۜۢۨۥۦۦۤۚۢۖۡۗۙۚ۟ۖۧۜۦۘۖۗ۫ۦۘۥۨۖۘۦۢۘ۠۠ۤ";
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                            case -1903570724:
                                str2 = "ۤۖۖۜ۫ۜۜۖ۬ۦۚ۟ۜۘۢۦۤۛۦۡۖۗۖۢۖۙ۫۬۠۟ۘۛۚۖۘۘۙۨۘۡۤۡۚ۟ۜۧۡۘۜۙۨۘ۠ۜ۬ۨۖۢ۟ۢۧۜۚۘۘۗ۟ۜۘۦۨۢۢ۠ۨۘ۠ۛ۟ۗۡۧۘ۫ۡۧ۬ۢۥۙۛۦۚۖۨۘۧۚۦۘۦۢۦۡ۠ۥۘۧۢۙۖ۟ۦۘۘۨۥۘۖۗۖۘۤۧۗ۫ۜۘ۟ۚۗ";
                            case -1843369079:
                                str = "ۢۘۛۜۨۘۘۡۘۙۢۡۡۘۦۘۡ۟ۡۘ۫ۘۛ۠ۤۡۘۙ۫ۘۘۛ۟ۛۥۗۖۙۧ۫۟۫ۘۘۡۛۗۢۥۜۤۤۡۤۘۙۛۢۡۘۡۤۨۘۧ۠ۖۢ۬ۨۘۨ۬ۦۜ۠ۦۘۦۗ۫ۤۗۙۜۜۘ۫ۡۦۘۡۚۨۘۙ۬ۦۘۘۡۦۢۘۘۘۢۧۛ۬ۖۘ۟۬ۛ۫ۡۘۘۖ۬ۨۡ۬۫ۤۦۖۘۡۘۨۢۧ۠۫ۤۤۨ۫ۜۤۥۨۧۡۧۧ۫ۦ";
                                continue;
                            case -681368408:
                                str = "ۡ۫۟۬ۥۖ۟ۚۧۦۧۡۘۖ۬۠ۚۢۦۘۧۚۗۥۥۦۘ۫ۨۧۧۦۦۘۛۦۡۖۜۚۖۙ۬ۚۥۙۛۖۙ۠ۧۖۡۢۥۥۤۡۛۨۥ۫ۚۖۘۙ۠۫ۥۚۜۨۨۦۘۘۧۨۘۗۦۘۘۢۤۖۢۡ۫ۛۦۘ۫ۧۙۨ۠ۚۚۜۛۖۨ۟۟۠ۖۘۥۨۚ۠۬ۛۜ۫ۡۚ۫ۛ۬ۗ۬ۨ۟ۨۘۥۛ۠ۜۡۖۘۤۛۦۜۘ۠ۧ۟ۨۘۡ۬ۜ";
                                continue;
                        }
                    }
                    break;
                case 2059195247:
                    new DownloadZip(this).execute(Deobfuscator$$app.getString(-3440731518650900297L), ApiServer.mainURL());
                    str = "ۡ۫۟۬ۥۖ۟ۚۧۦۧۡۘۖ۬۠ۚۢۦۘۧۚۗۥۥۦۘ۫ۨۧۧۦۦۘۛۦۡۖۜۚۖۙ۬ۚۥۙۛۖۙ۠ۧۖۡۢۥۥۤۡۛۨۥ۫ۚۖۘۙ۠۫ۥۚۜۨۨۦۘۘۧۨۘۗۦۘۘۢۤۖۢۡ۫ۛۦۘ۫ۧۙۨ۠ۚۚۜۛۖۨ۟۟۠ۖۘۥۨۚ۠۬ۛۜ۫ۡۚ۫ۛ۬ۗ۬ۨ۟ۨۘۥۛ۠ۜۡۖۘۤۛۦۜۘ۠ۧ۟ۨۘۡ۬ۜ";
                    break;
            }
        }
    }

    public void Exec(String str, String str2) {
        try {
            ExecuteElf(Deobfuscator$$app.getString(-3440725823524265801L) + getFilesDir() + str);
            ExecuteElf(Deobfuscator$$app.getString(-3440725475631914825L) + getFilesDir() + str);
            ExecuteElf(Deobfuscator$$app.getString(-3440725445567143753L) + getFilesDir() + str);
            ExecuteElf(Deobfuscator$$app.getString(-3440725398322503497L) + getFilesDir() + str);
            Toast.makeText(this, str2, 0).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public native String ONOFFBGMI();

    public void checkobbinstall(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String str2 = "۠ۢۘۗۙۡۘ۫۠ۗۖۙۜۘۘۦ۟ۖۗۤۦۧ۫ۨ۫ۡۘۖۛۛۢۢ۠ۨۥۗۡۨۜۗۙۧۡ۬ۚۤ۫۫ۡۚ۠ۤۖۧۨۥۘۜ۬ۖۘۧۢ۬ۙۜۛۨۥۨۘۙۤۛۛۛۖۘۢۦ۬۠۠ۗ۫ۥۘۢۜ۠ۘۗۖۤۙۜۦۤۛۧۤۡۜ۟ۚ۠ۖۧۦ۟ۛۤۥۙۧۜۥۘۙ۬ۡۦ۟ۜۛۜۘۙ۟ۤۜۖۘۤۨۡۜۙۡۘۧۡۡۘ";
            while (true) {
                switch (str2.hashCode() ^ (-407512409)) {
                    case -2012925155:
                        String str3 = "ۧۧۘۘۡۘۖۥۛۚۧۙۜۘ۠ۖۘۘۗۘۧۘۘۧ۟ۙۤۜۢۚ۠ۜۢ۟ۘۥۧۗۦۢۨ۠ۙ۬ۖۢۜ۬ۥۘۨ۫۠۟ۦۥۘۢۖۡۢۡۗۡۖۘۛۧۢۧۨۥ۫ۘۧۘۛۤۜۦۘۥۘۧۥ۟۠ۢۦۘ۟ۦۧۡۦۥۘۡۨۘۡۦۘۢ۠ۖ۠ۜۡۘ۫ۘۨۘۘ۬ۘۦۜۜۘ۫ۙۖۚۖۘۚۨۡۦ۬ۨ";
                        while (true) {
                            switch (str3.hashCode() ^ (-1086058216)) {
                                case -762375437:
                                    str3 = "۬ۧ۠۟ۙۢۗۜۙ۠ۛۧۙۚۘ۠ۘۖۛۘۥ۬۠ۘۘۘۤۖۙ۟ۡۘۘۢ۠ۚۙۨۘۤۨ۫ۜ۬ۢ۠۬۫ۚۖۖۘۜۡۡۘ۠ۖۥۘۛ۬ۙۚ۟ۚ۫۟۬ۜۙۜۥۥۘۦ۟ۗۙۥۗۙۧۖۘۜۤۖ۬ۛ۫ۗ۫ۡۨ۟ۚۚۘۨۘۨۖ۟ۤۧۨ۫ۤۥۘۥۥ۟ۤۥۛ۬ۥۦۘۦ۟ۦۘۨۧۖۘۗ۠ۘۘۘۙۚۖۗۖۘۦ۟ۖۙۧۖۘۧۨ";
                                case -569485223:
                                    String str4 = "ۢۜۙۚۘۤۚۦۘ۫ۤۖۘۘۥۦۨ۬ۨۘۚۨ۠ۧۥۘۛۡۜۘۚۧ۠ۚ۫ۗۙ۟ۡۡۦۘ۬ۦ۟ۥۢۗ۠ۦۘۨ۠۠ۘ۟ۘۘۦۘۦۢ۠۠ۧۚۙۗۧۚۧۜ۠ۥۘۘ۠ۦۨ";
                                    while (true) {
                                        switch (str4.hashCode() ^ (-374199825)) {
                                            case -1885901787:
                                                str3 = "ۘۖۥۤۜۖۘۙۥۘۘۨۥۚۛۥۜ۫ۢۖۖۧۘۘۢ۟ۛۡۗۙ۟ۡۦۘۥۗۜۘۡۤۘۘۙۖۥۨۡ۬۠۟ۦۘۛۙۤۢۗۥ۫ۢۦۘۙۙۖۨۙ۬ۡۙۖۧۗ۬ۘۘۙ۠ۢۖۛۡۦ۠ۧۡۢ۫ۢ۠ۢۡۘ۬ۥۥۘۤۤۦ۟ۢۚ۬ۛۙۗۜۛۗۢۘۚ۫۬ۦ۠ۖ۠ۧۛ۫۟ۖۧۧۜۚۧۙ۠ۘۜۡۚۦۙۥۚۢۨۖۘۛۖۖۘ";
                                                break;
                                            case -1702489337:
                                                str3 = "ۘ۫ۜۧۚۦۘ۟ۙۖۘ۬ۚۦۡۘۨۙ۟ۘۥۧۚۚۚۥۚۜ۬ۖۗ۬ۜۘۨۨۢۧۙۤۨۨۥۘۦۜۛ۫ۙۤۨۤ۟ۧ۫ۘۘۨۜۡۨۤۘ۟۠ۡۘۜۚ۟ۢۡۥۢۦۜۡۘۖۘ";
                                                break;
                                            case 535336173:
                                                String str5 = "ۘ۬ۥۘۚۦۦۨ۠ۜۗۘۘ۬ۗۨۘۗۨۧۘۥۜۘ۠۬ۜۘۢۜۛۗۨۡۢۜۖۡۖۘۛ۬۬۬ۛۨۘ۫ۦۜۘۙۥۤۥۤۥۦ۬ۢۥ۫۟ۛ۬ۛۚۖ۠۠ۡۢۢۘۘ۟ۢۤ۟ۗ۫ۙۘۜۘۨ۟ۤ۫ۛۦ۬ۙۘۘۚۥ";
                                                while (true) {
                                                    switch (str5.hashCode() ^ 629196190) {
                                                        case -615034383:
                                                            str4 = "۟۫ۚۥۥۖۘ۠ۢۦۜۘۚۡۘ۠ۢۨۡۘۡۢۗۥ۟ۧۗۛ۟۟ۢ۟ۙۤۖۘۜۘۘۨۛ۟ۡۙۘۘۛۘۦۘۢۡۖۨ۠ۨۘ۫ۖۖۤۡۢۖۜۙۛۥۥۛ۫ۚۧ۟۟ۡۦۡۘ۟ۢ۠ۖ۬ۦۜۦۦۦۜۜۧۘۘۘۨ۠ۛ۟۟ۘ۬ۘۛۙۧۡۨۢۡۛۤۙۚ۫ۤ۫ۦۡۛ۬ۖۘۤۧۦۥۦۖ";
                                                            break;
                                                        case 998290007:
                                                            String str6 = "ۙۢ۠ۖۧۛۢۧۨۤ۫ۙۡۙۖۡۘۧۘۦۥۛۥ۟۠ۨۗۤۧۡۤ۬ۚۘۘ۠ۚ۬ۖۙۧۦۦۢۤۙۡۦۗۤۦۢۛۚۡۙۗۖۙۢۖۡۘۚۢۡۘۧ۬ۘۘۨۚۘۘ۟ۙۨۙۙۨۘۨ۟ۗۚۚۛۨۙۡۧۗۨۘۘ۫ۚ۫ۨ۫ۥۡۜ۫ۙ۬ۛۛۢۗۖۘ۠ۘۡۢۥۛۧۖۖۘۧۖۢ۫ۙۦ";
                                                            while (true) {
                                                                switch (str6.hashCode() ^ 1849947321) {
                                                                    case -1212354920:
                                                                        str5 = "ۦۨۙ۫ۜۗ۠ۦۛۜۚۦ۠ۡۜۧۘۡ۬ۛ۠ۖ۬ۡ۠ۘ۬ۡ۟۟ۗۙۦۡۙۥۛ۟ۗ۠ۙۨۘۜۖۧ۫۟ۘۘۤۥۛۛ۠۠ۧ۟ۧ۫ۡۡۘۡۢۧۥۘۦۘۧۖۛۜۗۖۘۛۨۡ";
                                                                        break;
                                                                    case 78977699:
                                                                        str6 = !jSONObject.getBoolean(Deobfuscator$$app.getString(-3440731003254824777L)) ? "ۢۥۤ۠ۡۡۛۨۡۡ۟ۡۘۗۦۘۜۡۖۦۢۖۘۡۤۖۚۦۨۘۖۦۢۤ۟ۙۜۚ۟۫ۨۦۘۧۧۘۘۘ۠ۡۗۨ۫۠ۗۢۖۘ۬ۢ۫ۨۦۦۘۢ۠ۤ۟ۨۚ۠ۤۥ۠ۦۖۘۡۥ۠" : "۫ۚ۟۟ۢۛۤۚ۠ۘۖ۫۠ۙۗۨ۬ۙۘۙۘۢۖۙۖ۟ۨ۫ۘ۫۟ۦۥۖ۟ۚۘۚۥۦ۬۬۫ۦۗۤۜۨۡۘۘۡۘۦۥ۟ۦۖۖۥۘ۠۬ۧۗۢ۬ۧۨۖۚ۬ۖ۫ۥۗۛۖۚۛۤۙۨۘۗۨۥۚۡۨ۠ۛۖۨ۠ۨۘۡۘۦۘۥۨۘۙۨۦۗۛۖۘۡۗۧۨۡۗۙۜ۫۬ۗ۫";
                                                                    case 152636613:
                                                                        str6 = "ۙۥۦۢۦۜۘۚۗۥۘ۬ۜۗۗۦۙۛۚۖۘ۟ۤۘۘۛۡۚ۟۟ۦۘۨ۬ۦۦۡۘۘۘۗۙۨۡۦۘۙ۠ۨۘۖۛۨۘۚۥۗۚۖۦۘۧۛۘۘۢۖۨۘۗۦۤۧۥ۬ۤۛۦۚۙ۫ۗۦ۟ۘۘۘ۠ۡۘۨۜۥۜ۠ۚ۬ۤۚۦۡۘۗ۟ۦۘ۬ۡ۫ۘۙۙۙۧ۫ۡۛۛ۠۠ۜۛۛۚۤ۬ۥۘۤ۟ۗۗۡۖۘ";
                                                                    case 1270645698:
                                                                        str5 = "۠ۜۡۘۘۚ۠ۗۚۘۢ۠ۧۘ۟۠ۘ۬ۨ۫ۙۙۦۜۘۚ۟۠ۦۗۤ۬ۢۚۜۗۖۘۤ۟ۛۥۖۘۘۜۡۥۘۤۘۢ۟ۥۖۘۤۥۢۢۡۙۢۧۘۚ۫ۤۘۢۚۙۜۥ۫ۙۦۙ۠";
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 1441968057:
                                                            str5 = "ۢۢۥ۬۬ۡۘ۟ۡۥۘ۟ۤۡ۟۟ۗۢۖۥۘۘۡۡۘ۫۠ۥ۬ۜۘۡۛۖۘۤۛۚۘۧۥۤۢۡۤۖ۫ۛ۟ۙ۫ۚۢۡ۬ۘ۠ۡۥۧ۟ۗۘۢۖۡۢۗ۠ۥۘۡۖۙ۟ۙۥۘۡۧۜ";
                                                        case 1933278090:
                                                            str4 = "ۨۦۗۙۙۜۘۖۜۢ۬ۥۖۘۗۘ۫ۧۤ۬ۤۡۨۗۦۜۢۖۙۧۗۘۘ۟ۨۥۡۖۚۚۙۜۛۛ۟۠۫۫ۙۙ۬ۤۗ۠ۛۥۡۘ۬ۥ۠ۛ۟ۜۘۨۢۦۘۘۗ۬ۛۤۡۖۨۡۨۧۦۘۧۖ۬ۧۖۘۚۗۖۦۤۘۘۘۨ۟ۛۗۗۙۦۦۜۤۦۥۗ۬۫";
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 592698415:
                                                str4 = "ۗۛۖۛ۬۟ۛۘۨ۬ۙۤۤۖۨۖۜۖۘۖۦ۠ۗۙۥۨۨ۠ۧۥۜ۬ۚۖ۫ۦۜۘۘۗ۬۟ۗۢۢۨۜۘ۠۫ۜۘۙۦۙۦۖۤۨۧۤۧۨۜۚۨۥۘۧۨۡۘ۠ۨۚۖۘۦۘۢ۬ۥۘ۠۟ۨۘۤۚۦۘ۟۟ۡۘۛۜ۬ۨۧۡۡ۠ۛۚ۟ۨۘۨۗۜۘۢۙۘۦ۬ۦ";
                                        }
                                    }
                                    break;
                                case -195110183:
                                    str2 = "۠ۙۗ۬ۧۦۥۨۚۧۖۖۥۡۡۥ۠ۜۘ۠۠ۜۙۡۨۘۢۧۜۢۘۦۖۘۢ۟ۦۚ۫ۢۜۘۧۘۘۢۜۘۛۚۘۖ۟ۢ۬۫ۥۘۖۢۥۖۨۡ۟ۜۘۦۨ۟ۙۡۖۘۘۤۨۘۤ۫ۡۘۘۜۥۘ۟ۡۘۘۘۜۗۢۧ۟ۡۜۤۗ۟ۨۤ۬ۢ۠ۢۙۥۧۙۤۦ۟ۧ۠ۢۜۙ۫ۙۚۧۖۗۢ۠";
                                    continue;
                                case 2028065890:
                                    str2 = "ۗۦۡۘۤۘۚۡۗۘۘۦ۫ۧۖ۟ۤۧۜۦۘ۠ۢۨۘۚۧۛۚۘۙۢ۫ۖ۫ۥۘۨۚۡۘۖۨۚ۫ۧۤۥۘۛۧ۬ۜۘۚۨۙۛۤۗۢۡۛۛ۟۫ۡۤۗۧۧۨۘۦ۫ۨۧۚ۬ۨۘۢ۬ۤۘ۬ۢۤۤۢ۫۫ۚۡۡۡۡۤۨ۬ۦۛۦۘۨۧۦۡۚۦۘۢۤ۬";
                                    continue;
                            }
                        }
                        break;
                    case -52757280:
                        System.exit(0);
                        break;
                    case 1167154410:
                        str2 = "ۜۨۖۙ۫۫ۡ۟ۙۧۤۢۤۥ۫۫ۧۖۦۢۗۥۡۚۧۦۘۧۦۥۘۤ۬ۤۜۖۧۛۦۛۙۡۘ۬ۗۗ۟۟ۦۘۥۜۡۢۖۗۗۙۥۘۛۨ۫ۢۙۤۡۙۚۦۛۘۥۖۥۗۨ۠";
                        break;
                    case 1618753246:
                        break;
                }
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(Deobfuscator$$app.getString(-3440730973190053705L));
            String str7 = "۠ۨۦۘۖۜۜۨۚۦۖۤۙۦۗۦۧ۠ۦۘۖۛۧ۟ۧ۬ۥۘۧۘ۬ۨۘۘۧ۠ۖ۟ۨۚ۫۠ۘۘۙۙۙۗ۟۟۟ۡۦ۫۬۠ۦۘۨ۟۫ۨۧۘۘۙ۬ۚۛۘۨۘۤۨۘۥۥۘۘ۠ۢۥ";
            while (true) {
                switch (str7.hashCode() ^ (-2066421701)) {
                    case -1013055736:
                        break;
                    case 1534957288:
                        String str8 = "ۡ۬۠ۚۖۙۤۢ۫ۚ۫۟ۖۨۥۛۤ۬ۦۧۧۤۙۥۚۥۥ۫ۘۙۢ۫ۡۛۤ۟ۢۖۗۖۘۡۗۜۚ۠ۦۘۚۘۘۘۙۢۙ۬۟ۦۚۛۜۘ۟ۜۖۦۨۖۤ۬ۜۘۦۢۖۘ۟۬۫";
                        while (true) {
                            switch (str8.hashCode() ^ 34515191) {
                                case 568025105:
                                    str8 = "ۢۢۦۦ۬ۥۘۧۖۖۥۥۛۙۥۚۢ۟ۥۖۤۙۚ۟۬ۙۦۘۥۧۙۥ۬۫۠ۨ۬ۜۖۘۘ۬ۥۛ۟۟ۙۘۢۥۘۙۘۜۜ۬ۧۛۖۚۗۥۖۧۜۘ۫ۘۘۧۗۦۘۜۗۗۤ۠ۗۙۛۙۢ۠ۛ۠ۖۢۗۥۜۘ۬ۖۥۢۗۦۢۤۖۘۘۤۚۧۧۛۙۦۖۛۚ۟ۨۤۡۨۦۡۘۡۖۦۘۙۘۦۘ";
                                case 990131332:
                                    str7 = "ۧۡۜۘۥۘۘۡۚۙۡۜۦۦۗۛ۫ۢۖۘۧۚۡۘۚ۠ۗۢۘۙۨۜۥۘ۠۟۬ۜۧ۫۟ۗ۬۟ۦ۟ۡۨۜۘۨۜۚ۠ۥۨۘ۟ۗۡ۠ۖ۫ۤۖۙۢۦ۬ۘۢۦۘۦۜۙۡۧۜۡ۫ۘۢ۟ۖۘۙۛۗ۠۬ۢۗ۫ۗ۬۬ۚ۬ۖ۟ۗۘۤ۫۫ۖ۠ۦۧۗ۬ۡۥۖۥۘۥۘۖۗۢۡۥۧۛۜۧۘ";
                                    continue;
                                case 1185123552:
                                    String str9 = "ۥۘ۠ۙ۟۫ۛۛۤ۟ۡۚ۟ۜۙ۫۟۠ۘۢۡۘۗۘ۫ۖۢۜۘۖۦۛ۟ۖۧۚۡۘ۬ۖۡۘۧۢ۫ۖۦ۟ۛۢۘۚۖۥۗۜۘۥۤۙۖۤۡۜ۠ۙۚ۠ۢ۬ۡۖ۟۟ۧ۟ۢۥۘ";
                                    while (true) {
                                        switch (str9.hashCode() ^ 1656976026) {
                                            case -2800398:
                                                str8 = "ۥۖۧۘۥۜۤۚۨۡۜۙۙۤۛۧۢۦۡۘ۟۠ۥۢ۟۬ۤۛۖۘۤ۬ۛۙۨۖۤۗ۬۠ۜ۠ۦۧۚ۬ۘۘۨۥۖۘ۠ۙۘۘۛۖۙۚۤۥۘۛ۫ۜ۟۠ۙ۬۟ۢۧۨۦۘۧۧۙۛۗۨۘ۫ۢۖۜۧۨۘ۟ۜۚۡۥۗۘ۠ۥۘ";
                                                break;
                                            case 818549279:
                                                str9 = "ۦ۟ۨۧۤۨۘۦ۫۬۠ۗ۬ۖۦۘۖۙۧۥۢۖۘۧۤ۫ۧ۬ۖۗ۬ۜۨۦۥۘۡۢۢ۫ۢ۬۫ۦۡۡۚۥۘۚۧۜ۟ۦ۠۫ۖۙۚۨۢ۠ۧۦۨۡۡۗ۠ۖۘۚ۫۟ۧۖۤۨۢۛ";
                                            case 1176404058:
                                                String str10 = "ۧ۫ۚ۫ۜ۟ۖۦۗۖۧۨۘۧۜ۫ۨۗۛۨۗ۫ۥۜۡۦۗۡۜۡۤۡۨۘۘ۫۟ۥۘۡۤۜۨۥۙۗ۠ۧۗۡۚۡۘۧۚۖۘۙ۠ۘۘ۬ۨۨ۟ۢۡۘۗۘۘ۟۫ۜ۠ۘۘۘۘۜ۠ۦۗ۟۬۬۟ۡ۟ۨۨۨۘ۬ۧ۫ۗۗۙۗ۬ۧۖ۬ۥۢ۟ۚۗ۬ۦۙۖ۠ۨۧۨۚۧۧ۟ۦۚۘۜۡۡۤۜۧۦۤۚۡۙۢۙۘ۟ۘۘ";
                                                while (true) {
                                                    switch (str10.hashCode() ^ (-994570634)) {
                                                        case -1913532608:
                                                            str10 = "ۙۛۡۘۧۘۚۚۤۦۛۖۖ۫ۤ۟ۛۗۧ۬ۘۘۘۤۢۥۙۛۙ۠ۘۨۥۙۡۦۨۗۡ۠۠ۧۗۘۜۛۥۘۦۖۨۦۛ۠ۢۢۤۚۛۘۨۦۨۘۡۤۥۘۧۜۢۜۧۢۙۙۧۢۙۚۛۤۘ۫ۘۦۥۛۜۛۚۨۘۥۡۚۦۨ۟۬ۧ۬ۤ۫۟ۚ۬۫ۜۙ۟ۨ۫ۤۤۧۦۘۘۜ۟ۜۜۢۘۖۜۘۧۖۦ۬ۢۢۦۦۗۛۙۖۘۧۜۦۘ";
                                                        case -722272755:
                                                            str9 = "ۧۘۨۘۚۗۡۘۨ۠ۡۜۦۗۡۘۡۘ۬ۚۨۘ۟ۧۥۘ۫ۛۦۘ۫۠ۦۘۡۤۙ۬۟ۚۜۧۥۨۥ۫ۖۚۤۗ۠ۧۧ۠ۘۘۡۧۡۘۙۢۥۘۜۛۘۜۛۤ۬ۖۧۘ۠ۛۜۘۘۛ۟ۦۨۚ۫ۡۥۦۦۜۤ۫ۖ۟ۗۡۘۛۙ۟ۚۖۘۧۛۥۘ۟۟ۡۘ۫ۙۚ۫ۥۨۗۛۤ۟ۜۖۘۨ۬ۤۚۖ۟ۨۥۜ۟ۛۛۙۦۛۛۦۘۘ۟ۜۘۡۘ۠۟ۡ۠";
                                                            break;
                                                        case 1599322151:
                                                            str9 = "۫ۖۦ۠ۖۘۘۛ۟ۢۥۥۧۙۚۙ۠ۜۧ۟ۖ۫ۨۗۙ۠ۛۙۦۜۤۦۘۦۚۨۡۘۡ۟ۧ۠ۗ۬۬ۘۗۦۘ۫ۗۖۜۘۘ۟ۦ۫ۛۚۦ۟ۗۗۥ۟ۨ۫ۘۢۛۛۡۥۧ۠۬ۧۦۡۡۛ۬ۦۙۖۗۥ۫۬ۦۢۡۥۙۡۨ۫۬۫ۙۧۘۘۧۡ۠ۨ۫ۜۚۦۙۦۨۚۛۢۛ۫ۧۛ";
                                                            break;
                                                        case 1940203947:
                                                            String str11 = "۬۟ۤ۟ۖ۫ۦۚۦۛۘۤۚۤۖ۠ۛ۠۫۟ۡ۠ۜۖ۠ۧۦۡۥۘۛۗۥۗۙۗۚۗۚۤۘ۟ۤۙ۠۟ۧۘۙۡۜۖۗ۫ۢۚۦۥۢۜۙ۟ۖۘۥۜۛۜ۫ۦۘۦۤۙ۟ۘۨۘۢۢۗۡۤۡۜۘۥۛۡ۫ۨۘۘ";
                                                            while (true) {
                                                                switch (str11.hashCode() ^ (-1960142784)) {
                                                                    case -162652199:
                                                                        str11 = "ۧۡۥ۬ۙۥۚۖۙۧۗۜۘ۬ۛۘۘ۟ۦۦۦۙۖۤۦۥ۬۬ۢۙۡۦۘۛۛۜۦۙۖ۟ۨۨۘۦۥۜۘ۟ۥۥۘۥۘۙۗ۠ۘۘۡۗۤۧۖۥ۠ۖۖۢ۬۬ۛۜۦۚۤۗ۫۬ۡۥۛۤۡۢ۫ۗ۬ۥۨۘۜۘۤۗۢۙۡۖۙۨۖۘۢۗۡۚۖۚ۠ۜۨۘۧۛۦۘ";
                                                                    case 260462085:
                                                                        str11 = jSONObject2.has(Deobfuscator$$app.getString(-3440730951715217225L)) ? "ۨۥۘۘۦ۟ۖ۟۠ۦۗۧۜۜۘۖۘۦۜۧۘ۟۠ۡۦۛۖۧۙۛ۠ۥۘۘۜۜۘۛۛۜۘۨۤۥ۟ۜۖۘۧۜۡۨۧۢۦۡۡۖۖ۟۬ۥۘۘۙ۫ۧۢۘۙۙۙۙۖۤۦۧۚۤۥ۬ۢۦۤۘۛۖۡۦۦۨ۟۬ۙۦۡۘ۬ۘۜۗۛۡۥۘۡۘۧۖۢ۬ۛ۬" : "ۡۗۨۘۙۚۘۘۘۡۘۜۗۜۘۤۤ۠ۥۜۜ۟۬ۜۚۚۨۙ۫ۡۢۨۘۥۡ۠ۥۖۛۡ۫ۦۘۙۙۨۡۥۙ۟۟ۛۘۛ۟۠ۦۨۢۜ۬ۚۚ۠ۙ۟ۨۘۦ۬ۜۘۘۘ۠ۛۗۤۡۛۖۚۗۘۘۨۗۦۘۧۥۦۘۖۥۡۚۤ";
                                                                    case 440527449:
                                                                        str10 = "ۨۤ۫۟ۥۘۧ۠ۜۢۜ۬ۡ۬۬ۡ۠ۜۧۤ۟ۚۦ۬ۛۖۡۘۗۛۦۢ۬ۡ۠ۨۧۘۡ۠ۥۘۡ۬ۘۚۖۨۘۜۜۚۛۘۧۘۨۤۡۘۗۨۥۚۚۢۙ۬ۥۘۜ۟ۜۘۦ۫۠ۛ۠ۢۦۚ۟";
                                                                        break;
                                                                    case 1169725810:
                                                                        str10 = "ۖۢۚۨۜۗۖۖۘۘۚۗۘۙ۟ۡۘ۫ۖۖ۫ۦ۫ۚۚۚۚۡۢۥ۟ۤ۬ۦ۬ۤۖۥۘۤۙۖۥۥۧۦۡۗ۠ۚۜۜۚۨۘۛۛۥۘۡۨۤۦ۟ۛۘۜۜۗۨۘۘۡۥۗ۬ۨۢۧ۫ۙ۟۫۫ۡۨۧۤۗۥۘ۫۫ۦۜۨۛ";
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 1785891264:
                                                str8 = "ۤۜۚۗ۬ۨۤۙۢ۠ۜۘ۠۟ۡۘۗۡۚۚۦۥۘۥ۬ۦۦۘۧۗۡۜۥ۬ۖۢۜۘۡ۬ۖۘۜۧۖ۠۟ۙ۟ۦۦۘۙۛۜۖۨۗۨ۬ۥۡۦۤۖ۟ۡۤۙۖۤ۬۠ۗۡۘ۫ۧۦۘۤۜۘۤۛۦ۬ۨۥ۬۬ۨۘ۠ۢۡ۠ۜۘۤۡۖۚۡۘۧۜۨۦۖۘۤۘۖۘۖ۠۫ۨۥ۟۬ۢۘۘ۠ۜۡۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case 2048421632:
                                    str7 = "۠ۡۨۖ۟ۡۙۘۥۘۗۘۜۖ۫ۢۙۘۨۘ۬۠ۦۢۜۚۤ۫ۚۜۥۡۘ۠ۚ۫ۚۤۢ۬ۙۧ۠ۨۤۥۢۗۢۗۛۙ۟ۨ۫ۙۨۛۜۚۡۥۛۨۦۘۜۢۥۢۖۘ۠ۤۡۘۘۚ۬ۖۖۖۘۘ۟ۧ۟ۚۖ۫۬ۖۨ۬ۖۘ۬ۡۘۗۘۜۘۥ۠۫ۢ۠ۤۡۖۜ";
                                    continue;
                            }
                        }
                        break;
                    case 1551712175:
                        String str12 = "ۚۦۥۘۘۗۡۨۨۘۚۨۧۗ۫۟۬ۙۛۖۦۗۤۦۜۚۧۢ۫ۙۗ۬ۙۤ۫ۚۦۧۡۘۨۡۢۙ۬ۥ۠ۚۘۘۥۡۛۘ۬ۡۗۦۜۢۦۡۘۨ۠ۗۚۦۦۘۦ۟۠ۧۧۘۙۡۨۘۛۖۜۨۖۤۖۘۦۘۛۨۦۨ۫ۜۘ";
                        while (true) {
                            switch (str12.hashCode() ^ (-736631480)) {
                                case -492300423:
                                    return;
                                case -390587400:
                                    String str13 = "۫۠۠ۧۦۢۤ۬ۢ۫۫ۦۨۤۧۙۤۡ۬۬۫ۡۖۧ۫ۚۘۘۥ۫ۢۧۡۙۤ۫ۗ۠ۡۜۘۛۘۜۘ۫۫ۨۘ۫۠ۥۘۧۙۦۘۢۘۚۛ۫ۖ۫ۢۜۘ۬۟ۥۘ۠ۗۥۦۥۘ۬ۦۘۤۛ۬ۤۛۜۘۥۢ۫ۙۘۜ۠ۖۜۨۗۥۖۧۖۧۚۢۥۖۘۘۛۨۛۧۢۖ۟۠ۘ۬ۘۘ۫ۗۗ۬ۨۜۢۙۚۦ۠ۚۜۨ۫ۘ۫۬ۥۖۘۘۗۖۘ";
                                    while (true) {
                                        switch (str13.hashCode() ^ 464735827) {
                                            case -1530501902:
                                                str13 = "ۧۨۦۘۘۚۛۧۦ۫ۦۙ۫ۨۦ۫ۖ۬۟ۖۛۖۘۜ۬۬ۤۦۧۘۦۡۨۘۧ۫۬ۘۚۖۡۖ۫ۙۚۦ۟۫ۚۥ۫ۘ۫ۧۘ۫ۤۡۘ۟ۘۙۗۚۨۜۖۦ۬ۤ۟ۨۜۦۘۡۦۖۤۤۤۜۥۜ۬ۗۛۛ۫ۡۡۢۡۤۙۖۘ";
                                            case -128404891:
                                                String str14 = "ۚۦۧۘۙۧۖۘۙۚۗۚۤۡۘ۠ۖۤ۟ۘۨۘۖۘۨۘۛۖۡۘۡۙۨۘۢۗۜۘ۬ۘۜۜۢ۬ۙۤۘۘ۟ۜۖۖۡۚۤۗۗۡۘۨۘ۠ۡۛۨۢۘۘۧ۟ۚۚۜۖۘۧۛۖۘۧ۠ۖۥ۟ۦۘۡۥۖۛۚۗۤ۬ۦۘۖۗۦۛۡۦۘۖ۬ۤ";
                                                while (true) {
                                                    switch (str14.hashCode() ^ (-648433194)) {
                                                        case -1266575066:
                                                            str13 = "ۖ۫ۖۘ۫ۨۥۦ۠۬ۡۦۥۘۡۖۙۖۦۥۜ۬ۡۘۘۗۨۘۗۖۖۘ۬ۘۜ۠ۘۧۦۦۗۚۢۖۗۤۨۙۡۘۚ۫ۤۘۖۚۡۜ۟ۧۥۗ۠ۚ۟ۦۚۚۜۘ۠ۘ۬۟۫ۗ۠ۙۗۜۤۢۛۤۖۛۜ۬ۖۚۖۘۧۨۘۘۘۖۘۛۨۖۘۢۨۛۨ۬۠۠ۦۘ";
                                                            break;
                                                        case -930281410:
                                                            String str15 = "ۘۘۡۘۖ۠ۙ۟ۧۤ۟ۨۘۘ۫۬۠ۖۦۧ۫ۦۘۥۜۚ۬ۨ۟ۘۘ۫ۛۨۡۘۥۥۘۘۥۧۜۘۛۙۘۘ۟ۚۜۘ۠ۨۥۘۧۨۚ۫ۖۗۢۗۡۘۚۗۤۨ۠ۥۥۦۘۤۘۖۘۦۤ۫ۘۚۖۛۧ۠ۥۙۘۥۥۡۧۙۤۨۙۨ";
                                                            while (true) {
                                                                switch (str15.hashCode() ^ 176892568) {
                                                                    case -1834001200:
                                                                        str15 = "ۧۥۧۘ۫ۚ۠ۛۦۨۜۤۢۘۡۚۖۡ۬ۤ۟ۧۦۦۧۘۧۦۨۙۤۚۚ۠ۛۤۙۘۘ۠ۤۙۥۘۛۚ۠ۖۘۘۡ۬ۘۙۥۘۖۦۧۘۚۜۗۤۛۜۦۢۦۘۛۨۖۥۥۛۘۦ۬ۨ۫۫۬ۦۘۗۦۥۘۢۦۡۖۘۨۘۜۖۥۘ";
                                                                    case -841605108:
                                                                        str14 = "ۨ۟ۦۙۦۥ۟ۛۥۘ۟ۡۧۘۥۥۧۘۙۦۜۘۖۖۤۦۛۥۦۘۘۛ۠ۜۘ۠ۚۡۦۥ۫ۗ۟ۥۧۚۗ۟ۦ۫ۤۨۦۨۤۡۘ۬ۘۖۙۥۡ۟ۙۜۘۥۗۛۦۖۜۙۦۜۘۥۨۨۘۛۛۢۙ۬ۤ۟۬ۥ۠ۧۖۘۛ۠ۙ";
                                                                        break;
                                                                    case -841467579:
                                                                        str14 = "۠ۘۥۧۤۡۘۘۙۥۧۚۡۘۥۨۧۡ۠ۘۘۜۛۤۙۦۚۚۚۦۘۖۚۡ۟ۡۘۡۛۘۘۜۤۨۨۧۤۧۥۙۨۥۤۤۜۧۤۘۖۤ۠ۥۚۡۗ۠ۥۧۙۦۘۚۜۗۛۚۦۛۢۡۘۧۙۡۘۜۜۛۥۤ۬ۧۙ۫ۥۙۘ۟ۢۗۘۨ۟۠ۛۥۢۜۧۘۚ۠ۙ۫ۗۜۜۥۥ۫ۛ۟ۥ۫ۜۘۢۘۥۘ";
                                                                        break;
                                                                    case -121367884:
                                                                        String str16 = "ۧ۟ۜ۠ۖۛۚۤ۬۬۠۟۟ۤۤۥۘۗۡ۟ۜۘۦۧۘ۟ۖۦۜۨۚۛ۫ۜۢ۠ۙۢۢ۬۟ۢۚۙۚۦۢۡۤۦۜۘۙۘ۬ۖۜۥۥۙۢۘ۟ۥۡۢۡۢ۠ۥۜۢۖۛۤۚۛۤ۠ۙ۫ۡۢۦۗۥۤۡۖ۫ۧ";
                                                                        while (true) {
                                                                            switch (str16.hashCode() ^ 1277655130) {
                                                                                case 557163409:
                                                                                    str15 = "۬ۡۧ۠۬ۜۘۚۨۡۘۡۙۨۘ۬ۢۚۢۜۘۛۦۘۨۦۛ۬ۖۢۘۘ۫ۜۖ۠۟ۜ۟ۢۦۚۜ۫ۚۗۡۖۨۨۡۖۚۚۘۘۙۦۚۜۘ۬ۤۨۘۖۚۙۢۥۥۘۢۜۨۨۛۜ۟ۦۜ";
                                                                                    break;
                                                                                case 1456131399:
                                                                                    str15 = "ۦۜۥۥۖۚۡۢۘۤۚۥۘ۫ۜۢۙۖۦۨۡۖۘ۫ۜۜۘۛۡۨۨ۟ۗۤۡ۬ۚ۫ۨۨۨۘۦۚۖۥۜۖ۫ۨۨۤۢۦۗۙۘۘۢۚۥۘۦۢۙۧۜۧۘۜۖ۫ۜۚۢۚۘۦۘۡۧۥۘۙ۟۠ۘۗۜۤ۫۫ۗۗ۬ۤ۠ۛ";
                                                                                    break;
                                                                                case 1630323001:
                                                                                    str16 = "ۥۘ۬ۙۖۤ۫ۘۤۛۤۥۘۤۜ۟ۘ۬۬ۚۚۘ۬ۙۖۜۛۨۘۨۘۨۛۨۧۚۖۖ۫۠ۖ۫ۨ۠ۘۙ۫ۥۧۘۧۗۦۗۗۥۘ۠ۚۦ۫۠ۖۘۘۨۥۙۧۚۗۗۥۖۙۧۙۤۨۦۧۘۡ۫ۧۢۘۦۘۛۚۢۥۨۗۘۧۨۥ۠ۜۘۧۛۜۤۤ۫۫ۧۡۘۥۦۜ۠ۨۘۘ۟ۚۦۘۚۙ۬ۥۡۖۘۨۢۢۚۘ۟ۜ۫ۦۘ۠ۛۗ";
                                                                                case 1737244188:
                                                                                    str16 = jSONObject2.isNull(Deobfuscator$$app.getString(-3440730925945413449L)) ? "ۚۙۜۙۡۦۛۛ۬۠ۥۖ۟ۦۤۦۢ۟ۥۚ۬ۥ۫۟ۤۧۜ۠ۖ۫ۨۜۜۜۗ۟ۚۙ۫ۖۘۥۦ۠ۥۚۡۜۧۘۘۡۜۧ۟ۡ۠ۥۢۜۡۘۗۚ۫ۤۜۖۘۥۢۡۘ۬۫ۖۢۖ۬۫ۡۖۘۨ۠" : "ۤۧۦۖۘۖ۬ۤۘ۫۬ۡۗۜۡ۟ۗ۟ۘۧۨۘۢۢۥۘ۟ۧۚۤ۟ۡۘ۫ۡۤۗۜ۫۟ۡۘۢۦۙۗۗۥۘ۫ۙۘۤۡۘۘۛۥۡۗۨۖۘۛۦۜۘۜۥۨۘ۟۠۬ۖۘ۠ۙۜۗ۬ۨ۬۠ۛۦ۟ۘۗۛۤۡۘۘ۟ۡۘۘۦۡۤۜۗۘۢۜۗۨۚۢ۠ۥۧۤ۬ۡۙۜۘۨۥ۟۫ۜۘۦ۬ۙۘۖۡۥ۬ۚۤۖۜۥۜ۫ۧ۫۬ۧۖۜ";
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 1066743395:
                                                            str13 = "ۘۦ۠ۨۨۦۖ۟ۥۘۙۦۘ۫ۜ۠ۗ۫۟ۨۘۘ۫ۤۡۡۚۛۤۗۢۥ۠۠ۢ۠ۜ۬ۥۧۘۧۡۚۛۗۘۘۗ۟ۚۖۚ۬ۡۖۧۗۗۨۜ۫ۡۗۘۥۘ۫۫ۜۘۥۤۖۘ۫ۥۜۚۡۘۤۡ۠ۚۗۢ۟ۖ۫ۧۚۘ۠ۚ۟";
                                                            break;
                                                        case 1753161790:
                                                            str14 = "ۨ۬ۖۘۥۡۧۘۢۡۗۖ۠ۘۘ۠ۥۦۘۜۜۤۤۚۙ۠ۙۗۨۧۘۦۘۖۨۛ۫ۦۨۧۖۨۨۘۨۧۖۢۡۦۨۢۛۙۖۧۧۤ۬ۢۗۘۘۚۤۨۤۛۖۘ۠ۘۡۘ۠ۚۥۢ۬ۙۚۨۖۘۜۧۘۗۗۨ۫ۙۦۘۙۙۦۘۨ۫ۜۘۤۙ۬ۡۧۢ۫ۧۜۘۛۘۗۧۜۜۘۖۖۥۘۡۛ۫ۛۗۢۥۥۢ۬ۢ۠";
                                                    }
                                                }
                                                break;
                                            case 586088114:
                                                str12 = "ۚ۠۟ۥ۟۬ۘ۫ۡۜۤۡۘۛۤۧۘۗۨۨ۟ۡۖۘۖۘۢ۫ۥۤۚۜۦ۟۫ۦۖۘۨۖۚۛۡ۫۟ۚۦۡۘۘۛ۟ۘ۟۟ۜۥۡۘۨ۫ۡۡ۬ۨۘۡۜۨۘۥۖ۬ۖۜۥۤۗۘ۟ۙۨۥۗۢۧۦۢۢ۫ۥۘۗۖۚ";
                                                continue;
                                            case 2030427319:
                                                str12 = "ۡۢ۟ۗۗۡۙۧۙۨ۠ۙۧۤ۟۠۫ۙۚۖۦۘۤ۟۬ۨۨۘۦۥ۬ۛۚ۟۠ۢۤۤۢ۠ۗۨ۟۠۠ۘ۬ۘۨۢۥ۬۠ۤۛۢ۫۬ۖۘۖۙۢ۟ۘۖۘۛۜۨۜۤۤۖۡۖۘۛۗۖۘۦۦۘۖۥۘۡۙۚۛۥۧۢۖۦۥۥ۫ۗۨۧۘۤۨ۬ۙۜۗ";
                                                continue;
                                        }
                                    }
                                    break;
                                case -191624200:
                                    break;
                                case 170019379:
                                    str12 = "۬ۨ۟۬ۥۥۦ۟ۡۘۘۘۜۘ۫۟۬ۡۚۨۘۚ۬ۦۘۡ۟ۨۘۥۥۡۘۨ۬۬ۤۘۨ۬ۦۡۘ۫۫۟ۚۡۛۛۘۜۚۥۙۜۛۚۤۘۛۗۗۤۛۙۦۡۨۧۨۘۚۘۡۚۧۙۙۗۘ۠ۢۘۘۗۘۦۘۘۥۨۥۨۚۗۚۖۘۚۛۖۘۤۛۧ۟۠ۗ۟ۗۖۘۢۡۘۘۧۘۘۙۢۢۥۘۥۚۜۨۖۥۜۘ";
                                    break;
                            }
                        }
                        break;
                    case 1892945681:
                        str7 = "ۢۖۢ۫۬ۦۘۡۦۖۘۙ۟۬۠ۛۖۧۜۙ۫ۜۥۘۨۛۜ۬۫ۜۛۧۡۦۖۧۗۗۥۦۘۚۥۗۨۜ۫ۨۜ۫ۛۧۦ۠ۜۥۥ۠ۦۘۗۗۧۜۢۙۨۚۖ۫ۨۖۙۜۡۘۦ۟۫ۦۜۢۡۢۨۘۘ۫ۦۗ۠ۖۜۧۥۘۧۛۜۢۛ۟۠ۦ۬ۢۘۥۘۘۜۙ";
                        break;
                }
            }
            System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public void devicecheck() {
        String str = "ۧۛۖۘ۟ۖۜۜ۟ۘۛۤۘۘ۫ۡ۬ۦۡ۠۫ۨۤۜۧۜۘۖۜۧۘ۫۬ۖۘۙ۠ۢۙۨۘۘۨۧۡۦ۬ۨ۟ۗۨۤۚۨۘۧۡۛۛۡ۬ۗ۠ۨۘۢۚ۬ۡ۠ۦۘۖۜۘۨۡۗ۫ۢ۫۟ۥۘۘۤۗ۟ۦۢۨۘۜۙۖۘ۟ۡۛۛۗۨۘۘ۠ۜۘۗۚۜ۫ۦۘۚ۟ۘۥ۟ۚۚ۠ۙۜۥۡۨۨۘ۟ۘۖۢ۫ۨ۠ۡۦۘۨۗۥۘ۠ۜۚ۟ۧۗۧۛ۠";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 650) ^ 213) ^ 612) ^ 929) ^ 695) ^ 194) ^ 275) ^ 86) ^ 240) ^ 981) ^ 29) ^ 16) ^ 453) ^ 205) ^ 520) ^ 374) ^ 101) ^ 681) ^ 663) ^ 150) ^ 626) ^ 696) ^ 149) ^ 525) ^ 504) ^ 691) ^ 225) ^ 440) ^ 745) ^ 458) ^ 127) ^ 1980611196) {
                case -1739194522:
                    str = "۟ۧۨۘۖۙۦۖۥ۠ۜۘۘۤ۟ۜ۬ۦۘۚۨۘۘۛۘۚۤۘۚ۫ۧۛۦۤۡ۬ۗۡۘۢۢۢ۟ۛۗۡۖۘۘ۬ۘۧۜ۬۟۬ۜۖۨۛ۟ۖۘۘۜۥ۟ۦۗۤۤۘۘۨۤۖۘۥۥۘۘۙۦۧۚ۟ۤۖ۠۠ۙۢۘۘ۬ۜۤۤۤۧۖۧۜۤ۫ۘۘۦۙۘۘ۠۬ۢ";
                    break;
                case -1647950840:
                    str = "ۚۙۦۡۨۦۘۖۡۧۘۘۘۨۘۛۗ۫۠ۖۛۨۚۧ۬ۧۧۨۛ۠ۛۜۨۚۚۗۖۨ۠ۦ۫ۢۡ۫ۡۧ۫۠۟ۜۛۢۘۡ۟ۜۥۘ۫ۖۖۘۧۥۘۜ۬۫ۤۦۨۘ۫ۗۙۧۢۜۘۘۚۛ۟ۡۨۘۙ۫ۥۦ۬۬ۜۤۛۘ۫";
                    break;
                case -1460044850:
                    FLog.info(Deobfuscator$$app.getString(-3440732124241289033L));
                    str = "ۤۜۛۛۖۨۘۖ۫ۚۗۘۦۘۜۜۜۘۥۙۥۘۢۖۡۘ۬ۦۡۘۘۙۥۨ۟ۡۘ۠ۤۦۘۧۤۗۥۢ۬ۗ۠ۡۘۜۤۡۘ۠ۘ۫ۨۧۤ۟ۨۗۧ۟ۛۜۨۨۢۘۨۦۧۚۡۚۙۨۤۢۢۨۢ";
                    break;
                case -596980690:
                    return;
                case -459742383:
                    device = 1;
                    str = "۠۫ۥۥۘۗۥ۫ۢۧ۟ۧۙۥۜ۟۫ۖۗ۟ۥۢۘۧۢ۟۟ۦۤۥۘۥۜۗۗۗۗۧۛ۬ۢۖۡۖۥۖۦ۫ۦ۬ۢۧۘۘۘۥۦۘ۬۟ۦۚۧۨۗۖۢۦۜۙۨۧۥۘۨۜۜۘۚۧۨ۟ۛۦۘۦۨۜۥۢۡۘۢۡۖۧۙۤۙۙۖۛ۠ۖۤ۠ۥۘۨ۬ۙ";
                    break;
                case -316729792:
                    Ischeck = false;
                    str = "۟ۦۗۧۖۢۙۤۦۘ۬ۙۚ۟ۢۨۘۦۦۡۙ۟ۨۗۥۖۘۜۡ۬ۙۖۖۘۗۘۢۨ۟ۥۢۧۡۘۘۨۨۘۦۚ۠۫ۙۛ۫۟۟ۚ۟ۥۘۜۨۗۤۘۚۚۗۜۘ۠ۙۙۘۤۘۖۦۛۘۙۦۘۤ۟ۥۘ۠ۥۘۛۦۢ۬ۘ۠ۚ۠ۙۧۙۦۤۖۘۜۙۦۖۦ۫ۚ۠ۘۥۘۤۨۦۧۛ۫۬ۗۤۥۘۧ۟ۛ";
                    break;
                case -248825593:
                    noroot = true;
                    str = "۫ۚ۟ۙۤۤ۬ۜۘۘۧ۠ۡۘۗ۠ۙۢۦۥۘۙۛۤۢ۟ۥۚۦۖۖۦۘ۟ۡۙ۫۫ۦۘۥۥ۟ۖۘ۟۟۫ۥ۟ۚۦۨۥۡۘۦۘۜ۟ۙۨۧۘۛۡۡ۟ۗۧۧ۫ۧۜۘۛۜۙۤ۫ۜ";
                    break;
                case 868994900:
                    modeselect = Deobfuscator$$app.getString(-3440731793528807241L) + Build.VERSION.RELEASE;
                    str = "۠ۖ۫۫۬ۗۛ۬ۜۘۢۖ۫ۥۤۥۡۛۖۘۦ۬ۖۥۘۦۘۖۨۘ۬ۢۛ۠ۗ۬ۘ۫ۤۢۚ۫ۦۛۧۘۥۧۧۢ۫۬ۤۡۘۢۜۤۖۨ۫ۚۥۘۤۦۖۚۧۧۧۢ۬ۘۖۦۘۦ۬ۖۢۜۚۨۘۥ۫ۢۛ۠ۥ۫ۚۦ";
                    break;
                case 1065309546:
                    FLog.info(Deobfuscator$$app.getString(-3440731711924428617L));
                    str = "۬ۖۨۦۗۦۘۤۚۖۢۦۘ۠ۛۥ۠ۢۡۛۙۢۗۛۢ۟ۧۗۛ۟ۜۢۚۜ۟۠ۥۧۛ۫ۦ۬ۙۚۚۛۛۚۡۧۤۚۥۛ۠ۡ۟۟ۘۦۥ۠ۙۙ۠ۖۚ۟ۛۥۖ۠ۧۜ";
                    break;
                case 1279346632:
                    modeselect = Deobfuscator$$app.getString(-3440731913787891529L) + Build.VERSION.RELEASE;
                    str = "ۚۗ۟ۡۜۖۘۜۦۤۘۡ۠ۨ۫ۚۤۜۜۘۡۚ۬ۤۡ۬ۨۙۗۧۜۡۨۘ۬ۥ۬ۤۖۢۜۙۥۗۧۨۦۦۘۤ۫ۦ۟ۤۜۚۚۜۘۜ۫۬ۧۥ۟ۗۤۛۛ۟۠ۡۚۖۖۧۢۧ۫ۖۘۜۜۡۨۖۤۦۛۗۛۦۧ";
                    break;
                case 1352749710:
                    String str2 = "ۗ۠ۦۧۜۙۙۢۜ۠ۢۛ۬ۜ۫ۢۘۤ۠ۡۡۢۚۦۘ۫ۗۖۘۨۦۦۘ۟ۢۢۨۥۦۘۥۡۦۢۘۘ۠ۥۧۖ۟ۧۗۘۜ۫ۜ۟ۘ۠ۜ۫ۦۢۙ۫ۡۘۡۜۘۡۥۗۢۡۘۘ۟ۗۥۗ۟ۢۢۗۢ۫ۢۖۘۧۗۢۤۖۦۘۚۨۧ۟ۜۦۧۤۛۙۨۙۥۗۨۘۘۛۖۘۚۙۦۖۘۧۘۙ۬۟ۡۙۡ۬۬۟ۙۘ۫ۨۦۢ۟۟ۨۦۚۚ";
                    while (true) {
                        switch (str2.hashCode() ^ (-1041820960)) {
                            case -1138110914:
                                str2 = "۬ۖۨۘ۬ۢ۬ۚۧۨۘ۠۬ۨۘۗۨۖ۟۠ۛۖۢۘۘ۠ۗۢۙۦۦۨۘۖۜۦ۫ۚۤۖۘۜۚ۠ۧۙۢۘۥۥۘۙۗ۟ۧۚۡۘۤۤۜۢۘۚ۫ۘۘۚۡۢ۬ۡۤۥۜۨۖ۠ۡۘۥۡۚۤۚۥۨۗۡۥۚۦۨۥ۟ۜ۫ۖۘۥ۬ۥۘۨۗۥۘۢۡۗۧۖۥ۬ۡۘۢ۬ۘ۫ۧۦۤ۠ۧۧۡۙۙۗۚ";
                            case -1104309799:
                                str = "ۡۚۥ۫ۙۥۘۥۧۨ۟ۡۢ۟ۜ۟ۛۙ۬ۨۛۥ۠ۦۜۘ۫۬ۦۘۡ۬ۜۘۖۘۖۚۥۘۘ۫۫ۢۢۘۘۘۗ۬۟ۡۚۙۥۤۨۘۦۗۜۘۜۙۗۨ۫ۖۘ۬۠۬۠ۦۡۘۤ۠ۛ۫۟ۜۘ۟ۖۡ";
                                continue;
                            case -728736068:
                                String str3 = "ۨۗۨۘ۬ۨ۟ۧۥ۬ۘ۠ۤ۬ۜۥۘ۬ۥۡۘۤۚۢۧۚۦۥۜۢ۬ۦۢۛۘ۟ۙۖۖۘۖ۬۫ۜۗ۟ۥۗۡۘۜۦۧۘۤۙۥۢۦۖۛ۬ۚۛۖۘۖۖۨۘ۠ۜۤۥ۠ۘۘ۬ۜۨۗۦۙۥۚۛ۠۠ۢۖۦۘۗۖۧۘۧۖۦۧۧ۬ۙۧۜۘۨۘۜۘۗۡۜۘ۠۫ۧ۫ۢۖۜ۬ۥۘۙۤۡۘ۟ۡ۟ۛ۫۫";
                                while (true) {
                                    switch (str3.hashCode() ^ (-957797337)) {
                                        case -1797232875:
                                            str3 = "ۥۨۗۡۖ۟ۜۙۜ۫ۡ۟ۗۚۥۤۜ۫ۨۗ۠ۨۘۤ۠ۥۚۜۖۘۨ۟۠ۜۗۗۡۜۡۘۗۦ۟ۛ۟۟۠ۘۡۘۛۚۥۘۖ۬ۜۜۤۘۗۗۤۤۛۖ۟ۘۛ۟ۢۚۗۨۖ۠ۦۡ";
                                        case -506259249:
                                            str2 = "ۦۧ۟۫ۥۖۨ۬ۘۢۘۧ۫۠ۘ۬ۛ۠ۧۥۘۙ۫ۧۡۛۜۘۤۨۦۗۥ۫ۥۡۘۦۙۘۚۨۥ۠ۖۡۘۨۢ۟ۤ۫ۜۡ۫۬ۜۙۧۤۗۢۡۡۛۗۧ۟ۖۨۚ۠ۛۖۘۚ۠۬ۗۨۨۘۤۥۦۘۗۤۖۘۚۚۨۘ۠ۨۚۘۨۙۘۗۖۘۨۥۜۘۖۧۨۛۙۛ";
                                            break;
                                        case 535934888:
                                            String str4 = "ۤۨۤۨۘۛۗۥۥۘۡۜۢۘۜۥۘۜۦۗۡ۬ۗۙۙۡۘۚ۬۟ۧۛۜۘۦۥۘۦۛۨۖۙۗۜۜۙۙۦۛ۠ۖۘۘۥۡۙ۠ۖۡۡۨۧۘۙۛۦۗۙۨ۫ۜۦۘۘ۫۟ۥۛۡ۟۬ۡ";
                                            while (true) {
                                                switch (str4.hashCode() ^ 484007615) {
                                                    case -2049058225:
                                                        str3 = "ۡۙۥۘۛۦۡۜۨۨۘۦۜۨۥ۬۟۬ۙۥۘۖ۠ۦۡ۟ۛۖۧ۬۬ۛۜۘۢ۠ۨۘ۬۬ۦۛۥۡۙۘۨ۠ۨۥۘۤۡۜۛۧۙۨۚۘۘۢۜۡۘۙۙۙۘۤۜۘۤ۬ۨۘۦ۫ۙۢ۠ۛۘۥ۬ۜۨۥۘۦۘ۫ۤۢۧۨ۟۫ۛۤۖۘۛۙۦ۠ۨۡۗ۫ۤۨۤۦۘۜ۟ۘۘ۬ۦۨۘۘۤۡ۬ۥۡۘۤۗۛ";
                                                        break;
                                                    case -1001070531:
                                                        str4 = "ۡۥۖۘۘۖۧۘۖۖۧۘۚ۬ۘۛۖۥۘۙۧ۠۠ۘۨۘۥۖۘۘۤۖۜۨۘ۫ۙۥۡۦ۠ۦۘۖۜۥۘۨ۠ۨۘۜۜۦۘۧۛۡۘ۠۬ۘۨۚ۟ۧۨۜۜۨ۬ۙۗۖۢۖ۟ۧۖۨۙۙۜۘۥۢ۟ۚۢ۠۬ۢۖۘۤۗۜۘۗ۬ۘۘۦۦ۫";
                                                    case 869073381:
                                                        String str5 = "ۢۦ۬۬ۡۦۘ۠ۦۥۦ۟ۡۛۤۤۢۦۤۨ۫ۧۚۙ۠ۢۥ۫ۡۜۜۘۖ۬ۡۚ۠ۛۙۗۥۘۖۢۖۘۛۡۛۙۚۚ۠۬ۥۘۤۜۨۘ۟ۚۖۘ۟۟ۥۧۗۡ۠ۤۘۛ۟ۨۤۜۡ۟ۚۖۤۦۦۥۡۛۗۖ۬ۖۘۗۡۖۢۡۤۚۖۘۧ۫ۡۢ۟ۨۘۧۧۢۨ۟ۦۘۧۛ۟ۡۨۡۙۙۗ۠ۧۚۥۨ۠ۗۘۢ۠ۤۖۘۛۨۜۘۡۧۨۘ";
                                                        while (true) {
                                                            switch (str5.hashCode() ^ 1086436832) {
                                                                case -2134979710:
                                                                    str4 = "ۤۥۧۖۢ۬ۦۦۘۘۦۘۘۨۦۙۤ۫ۗۖۗۛ۫ۥۥ۟ۚۥۘ۠۠۬ۧۛۡۘۖۘ۬۠ۥۧۘۙۡۜۧۜۚۨ۟۬ۨۜۧۘۜ۟ۛۚ۠ۥۧۗ۬ۦۨۨۘۤۖۘۤۛۘۘۛۦۜۘ۟ۦۥۙ۟۫ۡۛۦۙۙۢۡۨۨۘۧۛۧ۬۠ۥۧۤۤۥ۟ۛۘۨۘۘۙۥۖۖۤۡۘۦ۟۟ۧۚۜۘ۟۟ۡۘۜ۟ۡۘ";
                                                                    break;
                                                                case -269592472:
                                                                    String str6 = "ۗۗۨۗۧۖۤ۠ۥۘۥۖۚۖۗۘۘۡۡۡۚۚۖۘ۠ۤۗۨ۫ۜۘۢۖۜۘۥۘۖۨ۫ۢۡۢۥۡۖۜۚۦ۟ۜۙۨۘۢۛۜۙۦۦۦۧۨۘۦۘۨۘۙۗۡۘۗۗۗۦۧۜۘۡۤۘۘۚۚ۫۬ۤۚۖۡۦۘ۠ۛ۟ۧۥۦۘۤۙ۟ۥۡۚۡ۟ۥۘۢۡۥ۟۫ۤۨۘۤ";
                                                                    while (true) {
                                                                        switch (str6.hashCode() ^ (-615796261)) {
                                                                            case 581943200:
                                                                                str6 = "ۥۢۥۙۙ۬ۦ۫ۚۨۤۤ۫ۙۢۜۡ۫ۗۜۘۨۢۜۛۛۡۘۧۛۘۙۘۘۢۡۨۘۦۦۘۘۦ۟ۙۚۡۗ۠۫ۜۘ۟ۤۖۘۗۚۢۦ۟ۥۘۤ۠ۜ۬ۨۘۜۨۥۨۜۘۘۚۧۜۗۧۦۘۖ۬ۦۘۘۙۛ۬۬ۨۤۜۨۘ۠ۧ۟۬ۤۦۘۖۦۨۘۖ۠ۛۖ۫ۗۚۜۥ۟ۦۨ۠ۡۜۘۗۤۢۚۗۦۡۙۗۖۖۥۘۤۤ۬ۚۙۚۡۗۗ۟ۘۦۘ";
                                                                            case 655874762:
                                                                                str6 = Shell.rootAccess() ? "ۙ۠ۡۘۡۙ۟ۚۤۤۙۡۧۧۥۦۘۜ۠۟۠۬ۖۘ۫۫ۗ۫۬۠ۗۜۛۧۙۡۗۦۜ۬ۤۛۖۜۡۜۦۥۙۨۤۡۚۙۦۘ۟ۢۡۖۘۖۡۨۚۚۦۘۤۥۗ۬ۚۖۡۢۜ" : "ۘۢۖۘۘۢۙۙۨۘۨ۬ۨۤ۬ۦۘۧۦۦۛۡۡۘۖۜۛ۬ۘۧۧۜۦۘۚۨۤۥۛۦۘۛ۫ۥۙ۟ۖۘۡۙۙۗۜۘۗۖۨ۬ۚۨۘۘۡۧۙۥۥ۟۠ۖۢۘۛۡ۫ۗۘۛۦ۬ۘۦۨۜۖۛۤۙۙۚۡۥۘۨۙۙۗۡۚۧۖۜ۠ۤۢۦۤۜۘۛ۠ۖۘ";
                                                                            case 692285432:
                                                                                str5 = "۟ۘۘۘۜ۬ۘۘۛ۬ۘۘ۫ۨۖۘۚ۟ۘۘ۠ۢۦۨ۫ۡۘۢۜۧۡ۬ۙۢ۫ۤۚۚۘۘۤۖۘۘۚۛۡۘۛۚۜۘ۫ۙۤۜۨۦۡۦۡ۫ۤ۫۬ۜۘۖۚۡۨ۫ۡۡۤۡۘۧۜۧۘۤ۬ۡ۟ۡۘۨۗۤۚۛۜۤۦۥۘ۟ۖۤۡۥۥۖۘۗ۠ۛۧۦۗ۬ۥۘۧۤۚ";
                                                                                break;
                                                                            case 1706682350:
                                                                                str5 = "ۡۤ۟ۨۗ۫۠ۚۚۦۦۧۜۡۖۘۧ۫ۦۘۘ۫ۛۢۖۘۨ۫۫ۨۧۢۤۧۗ۟ۜۦۗۧۦۘۘ۬۠ۢۘۨۨۦۨۚۥۘۡۚۙۛ۟ۦۘۘ۫۬۟ۡۥۘۛۨۙۘۤ۫۫ۛۥۡۥۖ۫ۨۚۖ۫ۖ۬ۤۤۢۗۧ۫ۦۢۨۨ۠ۢۛۢۢۢۖۙ۠ۘۘ۠ۧۘۘۢۥۛۨ۫ۨۘ۠ۦۨۘ۬ۧۖۢ۬ۥۘ";
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 223454194:
                                                                    str4 = "ۦ۫ۗ۫ۦۡ۟ۘۨۚۥۘۧ۠ۦ۠۠ۙ۟ۨۢۜۧۡۘۚ۫ۗۗۡ۫ۦۙۘۜۡۜۘۥۖ۫۬ۨۘۙۜۗۜۙۗۛ۫ۦۘ۠ۘۙۨۖۨ۫ۖۥۘۖۦ۬ۚ۟ۡۛۗۧۛۧۨۙۨۧۛۧۤۖۙ۟ۡۛۨ۫ۜۗۡ۬۠ۚۧۥۘۛ۠ۡۢۡۘ۬ۖۨۖۗۧۛۨۥۧۡۘۤۥ۫ۙ۫ۥۖۖۚۖۚۗۦۘ۬ۙۖۦۘۢۧ۫۬ۤۥ";
                                                                    break;
                                                                case 1269128408:
                                                                    str5 = "۬۬ۛۛۜ۫ۖۜۚۦ۠ۨۜۢۗ۟ۛ۬ۛۢۤۡۘۘۙۤۤۗۡۜۥۢۥۤ۬ۨۥۤۨ۬ۧۚۚۥۘ۫ۢۜۘ۬ۙ۠ۗۦ۠ۤ۠ۡۗ۫ۙۧۨۛۚۦۛ۫ۚۧۖۨۥۘۨۛ۫۠۬ۦۘۥۥ۫ۙ۬ۨۢۙۢۗۤۧ";
                                                            }
                                                        }
                                                        break;
                                                    case 1527619953:
                                                        str3 = "ۘۗۘۘۘۚۤۥۗۡ۬ۗۡۘۙ۟۬ۖۚۜ۠ۨۘۚۘۧۤۜۧۘ۟۠ۢۦۢۙۤۥۦ۬ۚۨۘۘۨ۫ۗۨۖۢۦۥۘۘ۠ۘۘۥۙۡۗۜۖ۬ۛ۠ۡ۬ۗۦۘ۟ۦۦۨۘۙۦ۫ۨۨۜۘۖۡۙۗۜۜۧۙۤۦ۟ۚۤۥۘۘۛۡۧۢۦۥۘۦۨۘۘۚۜۖۘۧۚۙۧ۬ۥۚۜۤۛۥ۟ۖۡۙۨۢۛۨۜۦۛۚۥ۫ۤۤ۟ۜۖۢۛۨ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case 1784838873:
                                            str2 = "۟ۡۗۗۜ۠ۙ۠ۥ۬۠ۧۦۛۡۜۘ۟ۖۨ۫ۨۘۖۘ۫ۚۖۨۘۨۦ۠ۧۢۡۢۘۖۘۢۡۢۙۘۧۛۜۧۤۢۨۘۘۛ۠ۤۚۢۡۘ۬ۜۛۚۜۧۘۜۜۧۤۥۨۜۜۡ";
                                            break;
                                    }
                                }
                                break;
                            case -431208944:
                                str = "۠ۥۨۧۨۗۡۛۖ۫ۘۘۡ۫ۘۘ۠ۘۘۧۨۖ۬ۚ۠ۜ۬ۥۖۦۖۘۥۦۤۙۚۘۘۖۜۥۛۙۨۘۚۘۛ۬ۥۜۘۗۖۘۘۨۢۖۘۢۡۢۡۚۦۡۧۦۘۜۛۨۡۜۡۘ۫ۧۨ۟۬ۡ";
                                continue;
                        }
                    }
                    break;
                case 1492301026:
                    Ischeck = true;
                    str = "۠ۜۜ۬ۥۘۘۗۥۦۘۜۚۢۨۚۛۥۨۛۤ۠ۚۤۦۛۚۦۨ۬ۢۛۘۛۥۦ۫ۡۦ۫ۘۘۛۨۥۘۥۖۖۘۤۘۢۛۡۧۨۛۗ۟ۦۦۘۚۚۖۥۙ۬ۧۡۘ۟۠ۛۚۖۢۢۖۘۤۨۨۘۥۜۥۤ۬ۤۤ۫ۘۛ۫ۧ";
                    break;
                case 1714776315:
                    device = 2;
                    str = "۟ۧۨۘۖۙۦۖۥ۠ۜۘۘۤ۟ۜ۬ۦۘۚۨۘۘۛۘۚۤۘۚ۫ۧۛۦۤۡ۬ۗۡۘۢۢۢ۟ۛۗۡۖۘۘ۬ۘۧۜ۬۟۬ۜۖۨۛ۟ۖۘۘۜۥ۟ۦۗۤۤۘۘۨۤۖۘۥۥۘۘۙۦۧۚ۟ۤۖ۠۠ۙۢۘۘ۬ۜۤۤۤۧۖۧۜۤ۫ۘۘۦۙۘۘ۠۬ۢ";
                    break;
            }
        }
    }

    public void doHideProgress() {
        String str = "ۗۨۧۘۚۥۗۡ۟ۗ۫ۚۡۘۛۡۖۘ۬ۜۧۘۙ۟ۨۘۧۢۚۨۥۡۤۥۛۧۘۡۗ۟ۦۤۢۡۘۗۥۨۦۘۗۙۤۨۧۥ۠ۥۜ۟۫۟۫ۥۘۚۧۦۘۤۢۡۘۨۛۡۘۚۖۢۡ۠ۖۛۖۚ۠ۗۢۘۥۖۘۨۖۚ۫ۦۖ۠ۢۥۢۦ۟ۨۙۨۦۦۛۗ۬ۨۗۙۧۥۘۜۧۧ۟ۡۧۨۘۨ۫ۡۘ";
        AlertDialog alertDialog = null;
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 571) ^ 690) ^ 16) ^ 489) ^ 49) ^ 281) ^ 370) ^ 954) ^ 765) ^ 904) ^ 876) ^ 458) ^ 43) ^ 341) ^ 345) ^ 823) ^ 292) ^ 20) ^ 26) ^ 153) ^ 892) ^ 514) ^ 685) ^ 695) ^ 94) ^ 121) ^ 889) ^ 947) ^ 785) ^ 284) ^ 665) ^ 1412989063) {
                case -1792089397:
                    String str2 = "ۘۛۖۘ۫ۨۜۗۛۨ۟ۛۘۘۙۗۥۘۖۡۥۘۛۨۗۘۖۜۘۧۢ۠ۜ۫ۚ۠۟ۡۛۦۤۜۘ۬ۗۜۘۨۘۛۘ۫ۛۥ۠ۧۘۘۦۘۗۛۜۘۗۛ۠۟ۧۖۘۧ۬ۖۘۖ۟ۜۛ۫۫ۛ۠۬ۨۧۖۘ۟ۦۘۙ۟ۥۚۛۜۘ۫ۦۛۤ۫۬ۚۗۚ۟ۚۥۘۜ۠ۙۙۢۨۛ۫ۘۘ۬ۡۘۘۛۘۛۧ۟ۧ۫ۛۥ";
                    while (true) {
                        switch (str2.hashCode() ^ 652587268) {
                            case -1980829455:
                                break;
                            case -1676216971:
                                str = "ۦۘۡۘۤ۟ۖۘ۟۬ۤۥۡۘۜۡۘۘۜۢۥۘۦۚۖۘ۟۬ۧۚۥۧۢۜۢۦۤ۟ۗ۫ۤۙۛۢ۬۬۟ۢۛۧۜ۠ۖۘ۬۟ۖۙۚۦۘۜۛۦۘۙۘۘۧۜۧۨۖۗۛ۬ۖۘۤۘ۠ۗۗۤ";
                                continue;
                            case -418527461:
                                String str3 = "۫۠ۜۘۥ۟ۜۘۥۜۜۢۘ۟۟ۨۦۘ۟ۤۨۘۚۧۘۙۢۡۥۤۦۘ۫ۧۢۙۧۡۨ۬ۚ۬ۥۘۨۡۥ۬ۧۗۡۥۜۘۚۦۨۘۦۧۙۚۗۗۢۢۜۘۖۚۨۘۨ۫۟۟ۚۧۥۢۧۗۘۦ۠ۗۚۦۚۚۙۗۧ۫۫ۗۨۥۗۜۖۜ۠ۛۜۘۥ۬ۦۙۧۖۨۗۨ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-233522757)) {
                                        case -1568064141:
                                            String str4 = "ۧ۟ۨۨۛۜۘۡ۫۬ۘ۠ۢۙۧۤۚۖۧۘۚۡۛ۫ۘۢ۠ۡۚ۬ۗۘۘۦۘۤ۬ۤ۬ۦۗ۠۟ۖۘ۟ۧۢ۠ۗۧۖ۬ۛۛۦۘۖۚۥۘۚۘ۬ۛۧۘۜ۟ۨۖۚۗ۟ۛۜۘۢۢۖۘۤ۟ۢۦ۟۫ۨۤۥۜۧۘۢ۟ۘۗ۬ۗۥۗ۟ۢۖۖۤۗۖۘۢۡۡ";
                                            while (true) {
                                                switch (str4.hashCode() ^ 12883961) {
                                                    case -1479156880:
                                                        str3 = "۬۫ۘۘۢۦۦۤۗۥۘۦۙۛۧ۠ۖۘۦۧۦۘۨۙۡۜ۫ۖۦۖ۫ۡ۬۟ۧۜۦۦ۠ۦۘۙۡ۫ۤ۬ۡ۬۬۬۬ۛ۫۬ۦۖۘۖۙۙۖۢۥۘۗۛۗ۫ۢۦۛۢۧ۠۫ۧ۠ۗ۬ۘۦۜۥۜۢۨ۫ۢۜۥۘۖۙ۠۫ۚۤۚۚۛۖۚۖۤۖۡۦۘۦۧۚۜ";
                                                        break;
                                                    case -305404839:
                                                        str3 = "ۨ۫ۘۘۚۛۡۘۦۢ۠ۤ۫۠۫ۘۡ۬۬ۥۘۤ۠ۚۗۡۙۚۘۨ۟ۜۚۨ۟ۨۘۜۨۙۧ۠ۚۨۖۦۘ۬۫۠۫ۛۖۘۨۡ۟ۜۨۘۤ۫ۖۘ۫ۙۦۙۛۢۦ۠ۜۘ۫ۘۘ۟ۥۨۘۥۨۙ";
                                                        break;
                                                    case 1742288792:
                                                        str4 = "ۚۥۥۘۥۢۧ۫ۗۗۥۙۨۚۧ۫ۢۧۤۧۤۖۘۢۤۜۗ۫۟ۘۡۖۘۛۖۨۤۘۨۚ۬ۥۘۗۡۥۘ۠ۡۚ۠ۜۘۤۤۨۦۚۘۘۤۜۙۜ۫۟ۘ۠ۡۘ۬۟ۤۢۚۚۦۤۦۘۛۙۙۦۢۗۜۧ۬ۖۖۖۤۙۖۚۙۤ۟۫ۖۘۜۥۨۛۦۜ۫ۜ۬ۨۢۙۥۨۖۘۛۨۨۤۗۖۖۡۤۙ۠ۨ";
                                                    case 1848806949:
                                                        String str5 = "ۥ۬۠ۗۨۗۗۙۢۦۥۧۘۘۥۛ۟ۗۧۙ۫ۗۚۤۜۘۡۖ۬ۘۛۡۘۥۥۘ۬ۗ۫ۗۡۜۘۦۦۗۜۡۦ۟ۜۘۙۘۚۛ۠ۤۨ۬ۖۘۤۖۜ۟۠ۙۘۖۗۜۧۘۛ۟ۦۘۛۧۜۢۡۧۘ۫ۧۨۘۡۢۛۨۥۚ۠ۦۜۢ۫ۖۥۤۥۚۥۖۚۜۥۘ۟۟";
                                                        while (true) {
                                                            switch (str5.hashCode() ^ 1995873895) {
                                                                case -1413029269:
                                                                    str4 = "ۚۧۥۘ۠ۡۥۖۛ۠ۧ۬ۥۧۤۦۘۜۗۛۚۚۛۘۛۥۢ۟ۨۘۨ۫ۨ۫ۡۚۘۧۖۚۦۦ۟ۨۘۚۜۧۘۚۖ۟ۚۨۥۘۧۙۜۥۚ۫ۨۤۤۛۜ۟ۙۙ۫ۥۡۥۘۤۘ۠۟ۧۢۤۛۨۥۘۘۙ۟ۘۘۖۤۢ۬ۦۨۘۙۛۧۡۧۦۘۡ۠ۜۘۘۡۦۦۡۛۖۤۖۦۘۦۧۡ۟۫ۦۥۘ۬۟ۦۘۚۘ۠ۗۥۦۘۛۜۖۗ۟ۤۛۨۘ";
                                                                    break;
                                                                case 456988689:
                                                                    str4 = "ۖۨۗۢۛۢ۟ۙۖۘۘۖۛۨ۫ۦۘۙۡۡۘۜ۠ۨ۠ۖۚ۫ۨ۬ۙۚۖۘ۫ۛۥۗ۫ۘۧۨۚۙۦۘ۟ۧۨۗۘ۫ۨۥۖۘۥۗۡۚۘۚ۠ۘۤۧۢۨۜۡۥۦۤۧۛۨ۟ۛۚۤۨ۫۫۠۬۬ۡۘ۬ۙۛ۬۟ۚۢ۬ۛ۟ۚ۬ۡۥۙۥۗ۬ۥۙۥۘ";
                                                                    break;
                                                                case 1217866786:
                                                                    String str6 = "ۡ۟ۙۨۥۗ۟ۦۡۢ۠ۥۘۛۤۦۚۙۥۧۛۖۤۡۦۘ۫ۛ۠۠ۡ۫ۥ۫ۛۦۙ۠ۧۡۧۘۦ۬ۚ۬ۜ۬ۡۡۥ۫۫ۡۘۤۧۖۘۢۡۧۨۙۥۢۚ۟ۥۛۧۤۨۥۛۧۡۘ۠ۧۨۘۥۢۗۚ۠ۗۚۧۘۥۤ۬ۚ۫۫ۢ۟ۨ۠ۢۙۡۛۡۤۨۚۨۨ";
                                                                    while (true) {
                                                                        switch (str6.hashCode() ^ 365630368) {
                                                                            case -2032176987:
                                                                                str6 = "۠ۧۖۛۨۥۘۥۤۡۘۛۜۜۘۜۛ۬ۡ۟ۤ۠ۘۘۙ۟ۡ۫ۥۖۘۚ۟ۚۥ۠ۙۘۗۧ۬۠ۜۢۜۘۛۡ۠ۥۥۨۦۖ۠۟ۗۘۘۖۨۘ۠۟ۢۧۗۡ۬ۘۘۛۖۛۧ۟ۤۨۡ۫";
                                                                            case -1931567837:
                                                                                str5 = "۟ۖۗ۠۟۠ۤۘۥۘ۟ۛۖۘۛۦۦۜۖۦۘۖۚۧۦ۬ۖۙۤۦۜۧۙۧۖ۟ۗۘۨۚ۬ۘۗۧ۬۠ۗۤ۬ۙۚ۠ۡۜۦۨ۟۬ۥۘ۠۟ۙ۠۟ۚۨۧ۠ۦۗۘۖۧۘۢۦ۫";
                                                                                break;
                                                                            case -690282793:
                                                                                str5 = "ۤ۠ۗۛۢۢۜۧۦۧۖۘ۫۟ۡۘ۠۫ۦۘ۫ۦۢ۫ۥۡۘۚۦ۫ۘۖۘۘۤ۟ۘۘۖ۬ۦۘ۟ۖۜۘۧ۫ۗۖۜۨۤۙۤۚ۠۫ۗۛۗۢ۫ۨۘۙ۬ۨۥۘ۫۬۬ۖ۬۫ۢۙۘ۬ۡۚ";
                                                                                break;
                                                                            case 1556737111:
                                                                                str6 = alertDialog != null ? "ۜۚ۠ۙۥۨۘۜۨۗ۟۟ۖۘۦۖۨۘۢۜۥ۠ۨۢ۟ۙۘۚۧۥۘۘ۫۬۫ۗۥۙۘۙۖۨ۫ۢ۟ۛ۠ۥ۬ۜۙۡۘۥۖۘ۠ۨۚۛۗۦۘ۬ۦۨۘۦۡۥۦۘ۟ۙ۟ۘۘۛۢ۬۬ۗۘۜ۬ۜۘۜۖۦۘ۠ۧۜ۠ۚۢۤ۠ۜۥۗ۠۟ۤۡ۟۫ۙۘۘ۫۫ۙۗۖۡۘ۠ۤۦۘۛ۬ۦ۟ۡۥۚ۠ۘ۟۬ۡۘ۫ۦۘۘۖۚۖۦ۫ۦۘۗۢۡ" : "ۛۧۜۘ۬ۥ۠ۢۛۜۘۜۖۘۙۜۦۘ۫ۖۨۘۙۗۡ۫ۡۜۘۥۚۙۘ۟۫۠ۦ۟ۨۜۡۘۧۛ۟۠۟ۜۘ۫۫ۦۦۗ۫ۨ۬ۨۘۤۖۘۥۥۗۨۗۤۗ۬ۙۚۦۦۤ۫ۜۘۗۙ۠ۨۡۦۘۚۜۖۦۗۘۘۜۘۢۗ۬۬ۜۙۤۖۦۡۨ۫ۧ۬ۦۘۗۥۦ۠ۧۙ";
                                                                        }
                                                                    }
                                                                    break;
                                                                case 1891716871:
                                                                    str5 = "ۚۖۨۘۨۚۨ۟ۚۘۘ۟ۡۨۘۢ۟ۗۗۢۘۤۦۦۘۗ۫ۥۘۧۨ۬۟ۥۛ۟ۥۥۜۗۢۦۙ۠ۨۦۖۘۙۜۨۘۙۢۡۡۙۛۖۖۥۘۜۖۡۦۚۥ۠ۜۘۘ۟ۦۜۡۙۧۚۛۖۘ۠ۤ۫۠ۧۧۙ۟ۚۢۖۘۙۡۘۘ۠ۚۡۘ";
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        case -735802013:
                                            str2 = "ۨۨۨۙ۟۟ۤۢۚ۟ۦۢۛۗۨۘۖۥۚۘۘ۟۟ۙۗۗۖۖۘۨۡۧۘۘۧۘۘۙۥۢۥۤۖۘۛۨ۫ۛۖۘ۠ۘۦۘۥۧۨۘ۬ۤ۠ۦۨۨۘۤۜۜۘۢۥۘۘ۠ۖۛ۟ۢۦۗۚۤۗ۟ۨ۬ۦۘ۠ۘۥۘۚ۫ۡۘۨۨۥۨۙۥۥۢۡ۬ۨۘ۬ۦۙۖ۠ۗۡ۠ۗۡۢۥۘ۠ۘۘۛۚۘۘۙۖۤۛۘۨۘ";
                                            break;
                                        case 1173211492:
                                            str3 = "ۖۗۨۘۘ۬ۚۙۚۖۘۤۖۤۤۢ۟ۖۦۘۦ۠ۘۡۧۤ۠۫ۨۨ۠ۘۡۦۧۘۖ۟ۥۖۘۦۘۤۗۧۛۧۖۥۙۥۥۛۖۘۜۖۘۛۛۡۢ۬ۥۨۖ۬۫ۙۜۘ۫ۢۦۘۡ۬۫ۚ۟ۡ۬۫ۦۘۛۢ۫ۜۡۦۘۦۥۘۘۚۨ۬۬ۦۤۘۙۘۤۚۥ۟ۙۥۘۤۥۧۙۥۧ۟۬ۧۗ۠ۦۘۡۙۘۘۖۤۡ۟ۥۦۘۖۚ۫۠ۧۘۛۜۙۗ۫۟";
                                        case 1505016133:
                                            str2 = "۫ۨۢ۫۫ۘۘۦۢۛۧۨ۠۟۠ۘۤ۫۬ۙۦۖۚۡۨۘ۠ۛۚۥۥۛۛۡۤۧ۠ۨۘۙۖۙۡۦۛۙۘۢۧ۫ۜۘ۠ۚۥۘۜ۫۟۫ۛۛۛۖۧۙۡۧ۠ۜۦۘ۬۠ۛۗۧۚۖۘۖ۟۠۬ۨۜۥۘۥ۟ۡۘ۬ۚۦۗۛۛۧۜ۠ۛۖۢۨۛۧ۠ۜۘ۬ۥۗ";
                                            break;
                                    }
                                }
                                break;
                            case 19321562:
                                str2 = "ۘۚۘۘۡ۠ۖۘۜۙ۫۬ۡۨۘۖۢۥۛۤۙۜۘۙۥۢۜۘۨۜۜۦۢۡۛ۟ۘۘۤ۬۠ۜۚ۫ۗۥۘۘۜۗۛۥۘۡۢۨۘۖۢ۠ۙۡۛۢۛۤۜۦۧۘۥۡۦۘۙۢۚۡۜۙۨۗۦۘۨ۠ۥۦۛۧۥۧۦۙۙۥۘۢۜ۫";
                        }
                    }
                    break;
                case -1107263740:
                    alertDialog = this.progressDialog;
                    str = "ۢ۫۠ۡۦۘۘۨۘۡۘۚۗۤۙۨۙۤۢۡۤۥۛۙۛۤ۬ۧۘ۫ۗۖ۬۫ۨۦۜۛۨۘۦۘ۟ۖۤۛۡۧۦۧۖۖ۬ۧۙۥۦۘۗۚ۠ۘۚۘ۬۬ۢۦۙۘۥۗۡۘۘۢۨۘ۟ۤۛ۬ۢۘۘۦۚۨۡۗۜۚۛۦۘۘ۫ۤۢۡۘۚۤۥۘ۫ۤۥۘۤۨۨۘ۫ۛۦۘۨۢۜۧۤۤۦۙ۟ۥۦۥۧ۠ۘۘ";
                    continue;
                case -932933263:
                    this.progressDialog.dismiss();
                    str = "ۜۖۛۛۥۧۘ۠ۘۙۢۡۗۤۘۙۡۖۜۘۤ۬ۜۘ۫ۧۘۘۖۨ۫ۚۗ۬ۡۜۦۘ۬ۨۡۘۡۢۜۘۨۙ۟ۢۧۦۘۥۚۦۘۚۖۘۚ۠ۙۧۙۚۚۢۦۘ۬ۜۛۨۛۡۧۤۥۙ۫۠۬ۛۖۖۨۡۘۥۙ۫ۛۢۘۧ۠ۜۘۥۜۖۚۙۨۡۦۥۨ۬ۢۤ۫ۖۘۗۘۜۖۡۚۢۡۖۘۦۚۖۥ۠ۢ";
                    continue;
                case -862106759:
                    str = "۫ۘۜۘۥۡۜۘۚۢ۠۠ۖۖۗۥۨۘۢۛۙۥۧۗ۠ۗۙۢۧۘۘ۟ۗ۫۟۫ۙۚۜۨۘۡۡۡۘ۠ۡۖ۫ۙۜ۬ۡۚۤۧ۠ۨ۫ۡۥ۟ۧ۫ۥۘۤۚۜۘ۠ۥۢۘۤۧۘۡۖۘۖۙ۬";
                    continue;
                case -180938455:
                    String str7 = "۟۠ۧۙۡ۬ۨۘ۬ۜۥۘۥۖۥۜۚۗۘۘۛۧۨۚۛۗ۬ۖۧۘ۠ۘۦۘۢۧ۠ۤۢۡۙۡۘۘۗ۫ۡۘۦۜۨۜۜۙ۠ۖۨ۟ۜۜ۟ۦۥۘ۟ۤۖ۬ۢۥۘۢۢۥۘۖۙۢۧۤۢ۟ۤ۟ۤ۬ۢۚ۟ۜ۫ۢۖۘۚۛۤۙۘۡۘۤۡۡۧۡۘۘۢۘۗۗ۟ۥۘ";
                    while (true) {
                        switch (str7.hashCode() ^ (-701162327)) {
                            case -1966605400:
                                str7 = "ۢۦۖۘ۠ۗۥ۫ۗۤ۬ۘۙۛ۟ۦ۟ۚۙۤۢۛۢ۠ۧۘۘۘۜۤۜۜۨ۟ۛۖۧۘۙۤۘۘۛۢۘۘ۫ۦۘۗۥۚ۬ۘۗۜۦۖۥ۠ۥ۫ۡۘۘۙۡۨۨۙۙۨۘۡ۟ۧۤ۟ۖ";
                            case -1192048795:
                                break;
                            case 712268373:
                                String str8 = "ۡۙۨۘۧۜۦ۟ۢۧۗ۬۫ۡۛ۟ۡ۟۫۬۬ۘۘۚ۟ۚۧۥۙۨۚ۫ۚۡۦۘۘ۫ۨۧ۟ۖۘۚۚۜۘۜۚۥۤ۠ۘۘ۬ۘۘۘ۬ۡۦ۬ۙۧۦۖۢۛۧۡ۫ۘ۫ۧۙ۫۬۠ۨ۠";
                                while (true) {
                                    switch (str8.hashCode() ^ 203618412) {
                                        case -2047827197:
                                            str7 = "ۨۤۙۘ۬ۗ۠۟۫ۡۘۥۗۡۛۙۖۘۤۗۦ۫ۥ۫ۤۤۤ۫ۙۖۘ۫ۗ۬ۛۚۦۥۗ۬ۧۤۨۘۥ۠ۤۚۖۖۙۘۚۧۘ۬ۚۙۡۨۥۧۘۘ۠۠ۡ۠ۤۨۗۛۤۢۖۘۥ۟۫۟ۨ۬۬ۘۙۧۜۙۢۙ۟۬ۘۜۘ۫ۘۖۘ۠ۘۦۘۥ۬ۗۤۡۥۘ۫ۢۜۘۗۛۘ۫ۚ۟ۜۧۦۙۤ۠ۛۥۦۘ";
                                            break;
                                        case -1035641620:
                                            String str9 = "۬۬ۛۛۡۛۖ۟ۥ۟ۨ۟ۚۘۖۚ۠ۘۘۜ۫ۥۘۢۦۡۚ۬۬ۨۧۥۧ۫ۨOۤۛۚۢۖۨۡۥۘۤ۠ۖۘۚۛۡۘۚۜۡۚۖۨۘۘۜۜۘۙ۬ۢ۟ۢۘۘ۠ۛۖۘۦۖۡ۬ۘ";
                                            while (true) {
                                                switch (str9.hashCode() ^ 196395092) {
                                                    case -2124597386:
                                                        str8 = "ۛۛۧ۬ۢۧۙۥ۫ۦ۟ۖۛۥ۬ۛۤۡۘۚۚۙۤۢ۠ۧۧۨۘ۬ۧۖۘۛۗۖۦۡۜۘۧۤۢۦۗ۠ۨۨۛ۟ۦ۠۫ۥۥۘۜ۫ۤۗۚۢ۫ۛۡۘۘۘۢۜ۫ۘ۬ۗۖۖۤ۠ۥ";
                                                        break;
                                                    case -954687139:
                                                        str9 = "۟ۥۙۙ۫ۥۘ۠ۥۦۘۚ۬ۥۗۤۗۢۤۖۘۨۛۙۤۗۧۜۘۧۜۦۦۘۜۥ۠۫ۖۘ۬ۨۧۘ۟۬ۥ۟ۨۥۘۥۖۘۚۧ۬ۤ۠ۜۘۡ۫ۘۘۢۡۦۢۦۤۦۥۛۜ۬ۛۦۛۜۘۚۥۘۥۖ۠ۙۤ۫۠ۦۜۘۦۢۖۚۢۙ";
                                                    case -296470756:
                                                        String str10 = "ۦ۠ۡۤۢۨۘۚۚۨۡۨۛ۫ۖۧۤ۬ۖۘۦۗ۫ۤ۬ۨۘۛ۬ۙۖۚ۟ۤ۬ۡۙۗۖۘۢۡۚۦ۠ۡۦۥ۬ۗۡۜۙۥۘ۠ۚۦۘۧۨۨۘۦۢۥۘۤۦۖۘ۟ۜۦۘۨۢۨۢۤ۫۬ۦ۟۟ۡۖ۬ۖۥۘۘۦ۟ۖۚۘۦۨ۠";
                                                        while (true) {
                                                            switch (str10.hashCode() ^ (-130557735)) {
                                                                case -709784438:
                                                                    String str11 = "ۘۛۤۤۡۧۘ۫ۙۚۛۦۜۤ۬۠ۨۨ۫۟۠۫ۘ۠ۖۤۦۢۙۦۦۘۛ۟۫ۗۨ۫۠۟۠ۙۛۜ۟ۥۦۗۧۖۘۤۨۜ۟ۢۥ۠ۤۘۢ۟ۥۘۢۢۙۚۜۛۖۗۤۚۜۙۜۗ۬";
                                                                    while (true) {
                                                                        switch (str11.hashCode() ^ (-1192560471)) {
                                                                            case 32327211:
                                                                                str10 = "ۡۛۥۦۙۨۘۥۧۘۘۢۜۦۦ۬ۛۖۙۗ۟ۦۜۨۥۘۘۗۧۜ۟ۘۦۘۛۛ۠ۧۢۦۘۛ۫ۥۚۤۜۘ۬۬ۖ۟ۗۖۘۗۥۤۛۗۘۥۚۥۘۛ۬ۥۜۘۦ۬ۥۡۦ۬ۗۦۙ۟ۘۢۥۡۗۢۖۡۡۘۨۧۜۛۤۦۘۜۙۗ۠۬ۥۘۦ۟ۥۘۨۢۛ۟ۥۖ۠ۖ";
                                                                                break;
                                                                            case 202152668:
                                                                                str11 = alertDialog.isShowing() ? "ۢ۠۠ۗۖۗ۬ۨۜۙ۬ۢۥۘۡ۬ۘ۫ۢۧۚۚۢ۠۫ۡۧ۟۟ۦۜۥۘۨۘۨ۫ۡۛ۠ۦۛ۬ۖۦۘ۟ۜۘۥ۠ۤۤۥۖۘۛۦۢ۟ۥۥۘۜۘۙۗۡۚۢ۠ۛۡ۟ۨۢۘۘ" : "ۖ۟ۡ۬ۖۘۡۧۖۘۨۗۗۗۢۛۦۜۛۧ۟ۘۡۙ۠ۚۡۘ۠ۨۖۗۡۧ۫ۢ۬ۦ۟ۙۖۛۙۙۨ۠۬۫ۜۘۥۨ۫ۨ۠ۥۧۦۘۘۥۥۗۨ۠ۥ۫ۖۡۜۘۜۘۦ۠۫ۖ۬ۛۙۚ۫ۨۜۚ۫ۦ۠ۖۘۥۘۢۜ۠ۖۗۗۙ۫ۧ۬ۥۡۢۤۡ۟ۢ۟ۜۤۢۥ۠ۚۦۦۘۘۗۖۘ";
                                                                            case 585229487:
                                                                                str11 = "ۖۙۜۘۨۗ۠ۧۚۨۦۗۡۢۜۜۘۡ۫ۜۘۚۡۖۨۚۦۘۧۥۨۧ۟ۨۘۛۨۡۢۧۗۧ۫۫ۡۛۦۘ۬ۖۥۘۛۛۨۢۙۦۨ۬ۜۤۧۧۜۧۡۚۗۡۘۜۙ۟۫ۜ۟ۙۜۧۘ۟۬ۥۘۜۦ۟ۖۧۗۡۦۤۥۘۡۦۛۡۘۧ۫ۛۡۘۙۤۧ۠ۜۗ";
                                                                            case 1479447965:
                                                                                str10 = "ۨ۟ۘۘۥۛ۟ۥۘۢۖۥۨۨۥ۠ۚۙۡۘۡ۬ۘۘ۟ۙ۬۬ۢۡۖۛۘۘۥۙ۫ۚۤۚۛۘۘۘ۟ۦۖۘۤۚ۫ۢۦۙ۫ۚۙ۫ۢۗۦۘۛۗۨۘ۟۟۫ۡ۠ۨۘۦۛۛۥ۠۟ۙۢۜۘ۟۟ۨۘۖۥۚۜ۬ۗۤۙۗۛ۫ۜ";
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case -545559070:
                                                                    str9 = "۠ۧۦ۠ۘۛۘ۠ۢۗ۬ۡۘ۠ۨۜۘۦۥۦۚۨۚۜۢۗۚ۠ۖۘۚۦ۟۠ۨۜۗۨۡۦ۠۟۬ۤۦۘۛۨۦۘۘۢۜۘۛۥۘ۟۠ۧۘۡۗ۫ۡۖ۠ۙۖۡۘ۠ۧۖۡۚۖ۫ۨۛۤ۟۫ۖۨۘۘۤۘۘۚۗ۠۬ۘۢۤۧۘۛۥۘ۠۬ۥۘۤۗۡۗۖۡۧۖۘۛۗۗ۠ۦ۫۟۟ۨۘۡ۬۫ۘۜۥۘۢۢۛۛۚۗۜۘۖۘ";
                                                                    break;
                                                                case 174341051:
                                                                    str9 = "ۧۥۚ۫ۧ۬ۤ۬۬ۦۨۖۘۚۥۙۙۛۛۙۧۖۧۜۡۡۖۖۘۙۛۥۘۖ۟ۧ۠ۘ۠۬۫۬ۨۦۢ۟۫ۛۦ۠ۘۖۧۘۢۥۚۛۗۡۘ۫ۚ۬ۚۖۚۖ۠ۘ۠ۚۦۖۨ۬ۥۖۘۙۧۘۛۘۚۦ۫ۦۘۘۨۚ۠ۗۘۘ";
                                                                    break;
                                                                case 563277443:
                                                                    str10 = "ۥۚۖۘۨۥۘۚ۫ۨۘۖۛۦۖۚۨۘۖۧۡۘ۫ۚۘۘ۫ۘۥ۠ۥۘۤۧۖۘ۬ۗۛۥۤۥۘۦۦ۠۠ۥۨۘ۟ۦۡۘۥۙۦ۬۫ۗۦ۫ۖۤۛۡۨ۟ۗۤۦۡۥۧۘ۬ۛۦۘ۫ۜ۫ۧ۫ۦ۟ۦۢۚۘۜۘۢۨۗۚۚۤۙ۬ۨۦ۟۬ۦۘۦۜۦۤۧۧۘۘ۟ۡ۠ۨۙۡۘۤۦۛ۬۠ۡۘۜ۬ۜۘۛ۬ۙ";
                                                            }
                                                        }
                                                        break;
                                                    case 1454145213:
                                                        str8 = "ۙ۫ۜۘۖۨۖۘۙۛۖۢۖ۫ۢ۟ۖۧۖۤۙ۟ۚۛۖۥۧۛۡۘ۠ۙۦۘۧ۟ۨۨ۠۟ۨۚۢۥۘۙۖ۟ۨ۫۠ۥۖۜۙۡۖ۬ۢۛۚۜۗۢۗۘۥۘۦۜۨۘ۟۟ۨۘۢ۫۬ۨۘۗ۫ۗۨۚ۠ۦۘ۬ۙۨۦ۬ۦ۬ۡۦۘۛۘۨۚ۠ۜۚۖ۫ۗ۬۠ۚۛۘ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case -29001444:
                                            str8 = "ۧۦۜۨۘۨۡۥۗ۫ۙۡۚۛۘۙ۫۟ۖ۟ۧۚ۠ۖۘۛۨۥۘۥۚۤۢۖ۫ۙۛۜۦۖۦۘۧۖۨۘۥ۫ۨۘۚ۠ۛۡۘۖۘۥۢۜۘ۟۬ۦۘۜۛۘۘۢۥۙۦۚۦۘۥۚۖۨ۫ۤۙۡۨۘۜۨۧۚۖۨ۟ۗۖۤ۫۬ۡۨۚۘۥۗۢۨۨۘۡۧۧۖۤۤۘۚ۠۠۟۟۬۠ۥۘۦۘۨۘۦۖۥۘ۬ۡ۟ۡۖۥ۫۟ۜۦ۫ۚۢ۟۬۠";
                                        case 2056333119:
                                            str7 = "ۨۖۧۢۙۥۘۢۛ۫ۦ۟ۗۤۨۚۥۘۥ۫ۘۨۘۤۚۘۜۖۖۘۙۗ۟ۙۡۘ۟ۘۘ۬ۙۖۘۖۤۨۡۦۦۨۜۧۙۡ۟ۙ۠ۡۘۥۘۚۖۙۡۘۜۙۥۘ۠۠ۥ۫ۡ۬ۨۧ۫ۗۗۜۧ۬ۘۥۘۤ۬ۨۘۥ۟ۨۘۢۛۨۡۨۧ۫ۧۗ۟۟ۦۘۘۜۡۛۦۘۙ۠ۤۡۥۚۚۙۦۙۙۖۨۨۘ";
                                            break;
                                    }
                                }
                                break;
                            case 785300195:
                                str = "ۤۤۨۧ۟۫۫ۜ۫ۡ۬ۖۘۦ۬ۦۤ۬ۙ۫ۖ۟۬ۨۡ۫ۨۘۛ۬ۡۗۨ۟ۨ۠ۖۘۗۤۘ۟۟ۨۘۘۜۦ۟ۘ۫ۥ۬۫ۨۜۜۘ۠ۖۨۗۚۖۘۤۦۛ۠ۥۘۘ۬ۧ۠ۡۨۦۘ۫ۗۛۨ۬ۡۘۗۚۜۘۛۥۚۡۙۧۚۧۧ";
                                continue;
                        }
                    }
                    break;
                case 421475574:
                    this.progressDialog = null;
                    str = "ۛۜۗۤۨۦۛۡۢۨۤ۬ۖۙ۬ۖۦۥۜۚ۫ۜ۟ۢۨ۟ۛۖۤۖۘۚۤۖۘۛۖ۫ۥۥۡۘۥۦۘۜۧۘۛۗۨۘۤۨۡۘۦۥۗۢۢۡۨۜۧۧۢۡۜۦۥ۬ۖۘۢۗۡۤۢۦۘ";
                    continue;
                case 1289045969:
                    return;
            }
            str = "ۜۖۛۛۥۧۘ۠ۘۙۢۡۗۤۘۙۡۖۜۘۤ۬ۜۘ۫ۧۘۘۖۨ۫ۚۗ۬ۡۜۦۘ۬ۨۡۘۡۢۜۘۨۙ۟ۢۧۦۘۥۚۦۘۚۖۘۚ۠ۙۧۙۚۚۢۦۘ۬ۜۛۨۛۡۧۤۥۙ۫۠۬ۛۖۖۨۡۘۥۙ۫ۛۢۘۧ۠ۜۘۥۜۖۚۙۨۡۦۥۨ۬ۢۤ۫ۖۘۗۘۜۖۡۚۢۡۖۘۦۚۖۥ۠ۢ";
        }
    }

    public void doShowProgress(boolean z) {
        AlertDialog alertDialog = null;
        LinearLayout linearLayout = null;
        int i = 0;
        GradientDrawable gradientDrawable = null;
        TextView textView = null;
        LinearLayout.LayoutParams layoutParams = null;
        LinearProgressIndicator linearProgressIndicator = null;
        AlertDialog alertDialog2 = null;
        String str = "ۘۛۤۛۜۗۤ۫۠۬۟ۖۛ۬ۥۘۜ۫۬ۚۨۖۛۘۜۘۨ۬ۥۘۜۧۦۘۗۦۘۗۦۧۦ۟ۘۘۤ۟ۥۘۡۚۨ۟ۚۜۘۙ۟ۘ۬ۖۖ۠ۦۤۖۢۡۘۗۗۛ۟ۜۛۨ۟ۘۘ۟۟۟ۜۨ۠ۛۡۦۘۨۢۛۧۨۧۘۚۡ۬۫۬ۛۚۖۥۖۚۛۡۡۡۘۘۛ۟ۡۖ۟";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 481) ^ 196) ^ 295) ^ 174) ^ 682) ^ 179) ^ 733) ^ 500) ^ 743) ^ 34) ^ 815) ^ 640) ^ 135) ^ 762) ^ 693) ^ 820) ^ 695) ^ 667) ^ 312) ^ 813) ^ 87) ^ 283) ^ 997) ^ 508) ^ 753) ^ 67) ^ 584) ^ 618) ^ 750) ^ 714) ^ 371) ^ (-1370131797)) {
                case -2061519654:
                    str = "ۥۚۛۜ۬ۧۤۜۗۜۜۡۘ۬۟ۨ۬ۖۛ۟۬ۤۗۖۗۛۢۦۢۢ۠ۚۛۥ۟۠ۜۛ۫ۙۡ۠ۥۥ۬ۜۘۘۢ۟ۦۤۧۚۦۖۘۥۧۥۤۗۡۜۛۦ۫ۨۘۙۢۘۘۤۗۙۡۚۤ۠ۚ۟۠ۧ۫ۗۚۙۤۖۜۡۥۡ";
                    continue;
                case -1802501386:
                    linearLayout.setOrientation(1);
                    str = "ۙۧۛۛۜ۠ۧۨۨۘ۟ۚۨۘۢۖۚ۫ۤ۠ۤ۫۠۬ۗۡۨۤۡۘ۬ۘۧۨۦ۫ۧۘۗ۬ۢۨ۬ۡۧۘۗۗۗۙۙ۫ۚۗۛۖۚۦۨ۟ۨۖۛ۠ۢۘۚۥۛۛۖۘ۬ۜۛۖۗۗ۠ۚۨ۟۫ۚۧۜ۟ۙۢۦۙۤۥۘۚۢۦۧۗۙۨۛ۬ۤۧ۠ۗ۠ۖ۬ۤ۫ۜۥۖۤۖۘ۟ۢۖۨۖۘ۠۟ۢۜۤۜۧ۬ۦ۬۠۟ۘۙۨۘ";
                    continue;
                case -1791871446:
                    this.progressDialog = alertDialog2;
                    str = "ۜ۠ۗۡ۠ۦۘۚۖۧۦۜۧۘۘۘۤۧۙۦۘۗۨ۠ۨۖۢۧۛۨۘ۫ۜۘ۫ۢۨ۬۠ۖۢۖۧ۟۬ۛ۠ۖۘۛۤۡۨۜۡۘۗ۟ۛۙۨۗۦۚۖ۠ۘۙۗ۠ۨ۬۫ۚۡۘۘۘۛۙۨۘۡۡۜۙۘۚۛۜ۫ۥ۠ۢۖۛ۟ۙۘۘۜۜۨۘۜۧۦۘۥۤۢۦۘۜۘ";
                    continue;
                case -1679586857:
                    linearLayout.setBackground(gradientDrawable);
                    str = "۬ۘ۟۟ۤۡۘۨۙ۫ۦۡۘۦ۫ۡۘۘۧ۟ۖۙ۬ۦۘۙۦۚۦۗۗۗۗۜ۟ۗۤۧۜۗۜۥ۠ۤۤۡۘۥۚۗۚۗۜۘۦۨۜۘۡۧۖۧ۟ۘۧۘۦۘۚۘۦۘ۠ۡۘۘۡ۠ۦ۠۫ۘ";
                    continue;
                case -1481725208:
                    linearLayout.setPadding(i, i, i, i);
                    str = "ۖۖ۟ۖۨۗۥۡۥۘۡۤۢۧۚ۠۠۠ۦۘۘۧۥۘۜۚۖۡۘۗۢۜۥۘ۟ۧۧۘۙۘۘۥۘۢۦۘۖۘۛۦ۫ۛۧۦۛ۫ۢ۫۟ۡۘ۟۫ۙ۬ۤۜۘۙۛۖۧۖۧۙۜۘۘۨ۫۬ۥۧۘ";
                    continue;
                case -1443143204:
                    linearProgressIndicator.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    str = "ۚۘۧۘۚۥۖۘۜۘۤ۠ۦۘۖۦۙۨ۠ۤۙۥۘۘۤۧۥۜۨۘۡ۬ۗ۬ۖۗ۟ۡۜۘۤۡۙۦ۫ۤۡۗۦ۬ۢۡۘۡ۫ۚۨۨۥۥۥۢۥۗۡۘۡۤۨۗۛ۟ۥۖۡۘۙۤۜۜۨۙۥۨۦۘۖ۫۫ۗ۠ۖۙۨۙۤ۬ۡۘ";
                    continue;
                case -1404934621:
                    textView.setText(getString(C0931R.string.str005d));
                    str = "ۤۥۗۙۗۛۙۜ۟ۖۙۜۢۚ۬ۦۨ۫ۚ۠ۥۘۧۖۙۧ۠۠۠ۥۡ۠۬۠ۖۢۛۗۚۜۘۢۘۚۢۥۖۛۘۘۦۤ۠ۘۤ۫ۖ۠۠ۙۤۤ۟ۖۖۧ۫ۖۖۗۖۢۢۜۘۜۥۧۘۛۖۢۡ۟ۘ۬ۙۦۨۙۦۘۙۨۤۙۢ۠ۧ۬ۥۘۦۛۤۦۢۨۘ۠ۛۛۖۛۥۘۛۢۨۘۢ۬ۘۘۡۡۦۘۧ۟ۜۘ";
                    continue;
                case -837512669:
                    linearLayout = new LinearLayout(this);
                    str = "ۡ۬ۥۨۙۦۨۤ۬ۡ۫ۘۘۖۦۜۨۖۡۘ۬۬ۚۙۨۘۘۗۘۡۘۙۤۚۛ۟ۛ۟۟ۛۧ۟۫۟ۦۘۖ۫ۛ۬ۤۥۘۡ۟ۖۘۚۜۘۘۙ۠ۤ۬ۢ۠ۗۨۗۡۡۦۧۥۘۘۧۡۦۤ۠ۚۙۡۨۧۢ۬ۢۨۗ۠ۘۜۘۨۡۧۘۙۥۡۘۤۛۤ۬ۧۦۥۥۥۖۘۥ۠ۘۡۘۜۡۘۘۙ۬ۤ۟ۙۤ۠ۛۥ۠ۨۘۜۙۧ۫ۨ۫ۘۘۢ";
                    continue;
                case -734750131:
                    layoutParams.bottomMargin = m79dp(this, 16);
                    str = "۠ۛ۠ۛۜۖۤۖۡۘۘ۠ۘۘ۫ۖۘۥ۠ۧۗ۬ۜۘۚۥۤۡۧۥۤۤۦۘۢۚۡۘۜۤ۫۟ۖۜۘۤۡۦۛۨۤۛۜ۠ۢۤۘۘۘ۟ۖۘۥ۫۟ۥ۠ۖۘۥۖۡۗۨۘۘۛۘ۟۬۟ۦۨۧۨۗۢۧ۟ۢ۬ۚۚۡۖ۠ۢۛۚ۠";
                    continue;
                case -609804032:
                    linearProgressIndicator.setIndicatorColor(ContextCompat.getColor(this, C0931R.C0932color.color0024));
                    str = "ۖۙۨۘۥۧ۫ۘۧۘۘ۟ۖۖۘ۫ۨۘۦۦۥۡۨۡۚۜۡۤۘۖۨۡۛۨۦۥ۟ۦۥۙۗ۫ۘۥۗۤۦۧۚۖ۟۠ۙۘۥۨ۠ۡۨۜۙۦۙۙۘۥۘ۫۠ۨۘۡۜۧۘۛۘۧۗۥۖۘۢۦۦۧۖۡۘۛۢۥۚۜۗۖ۬ۥۢۥۘۥۡۤۤ۬ۖۖۦۡ۬ۗۦۙۛۚ۠ۘ۠ۤۨۘۘۖۙۢۛۗۚ";
                    continue;
                case -394004767:
                    i = m79dp(this, 24);
                    str = "ۙۗۢۨۢۡۘۦۗۘۘ۫ۢۡۛۙۘۘ۫ۢۚۙۢۘ۫ۡۦۘۨۚۨۛۗۥۚۢۖۡۙۨۚ۟ۚۢ۫ۖ۟ۧ۟ۦۜۥۨ۠ۖ۫ۦۦۦ۫ۛۢۜۛۛ۬ۨۖۖۡۡۙۡ۠ۦۨۢۗۚۧۗ۫ۥۘۤۧ۬ۡۡۘۘۧ۠ۥ";
                    continue;
                case -206266132:
                    linearProgressIndicator = new LinearProgressIndicator(this);
                    str = "ۙۙۛ۫ۡۧۘۨۤۡۘ۬۫ۤۖۗۦ۠۟ۡۛۢۜۘۨۗۨ۟ۙۨۘۗۤ۬ۥۙۨۘۥۘۨ۟ۦۖۜ۬۠ۢۨۜۗۘۙۘۡ۬ۚۗ۠ۥۧ۬ۜۧۧۖۡۘۨۜۢ۬۠ۥ۫ۤۥۨۢۨۘ۫ۚۖۢۛۜۘۗ۫ۖۘ۫ۦ۬ۥۗۧ";
                    continue;
                case -198090152:
                    gradientDrawable.setCornerRadius(m79dp(this, 4));
                    str = "ۛ۬ۥۘۗۘۧۦۡۜۛ۠ۛۛۘۦ۟ۘۖۨ۫ۙ۟۬ۙ۠ۥۖۤۨ۫ۨۘۨۘۢۙۜ۟۬ۡۛۖۖۢ۠ۨۘ۟ۨۗۡۗ۟ۦۗۜ۫ۛۖۦ۠ۗ۫ۥۘۘۦ۠۟ۘۢۖۘۤۡۦۚۤۚ۠ۜ۫ۡۛۡۗۘۖ۠ۨۜۘۙۧۛ۫ۧۦۘۡۡۨۥۜۥۘۚۖۖۘۡۙۖۘۙ۠ۦۙۗ۟۟۠۟۫ۢۘۘۤۤۥۘ۠ۦۦ۬ۜۗۘۗ۬ۜۥ۠ۜۗۙ";
                    continue;
                case -167668545:
                    textView = new TextView(this);
                    str = "ۖۛۘۘ۟ۨ۫ۥ۠ۥۘ۠ۢ۬ۗۤۖۘ۟ۡۡۜۢ۠ۢۗۡۘ۠ۖ۠ۗۤۨۘۧۘۙۘ۫ۘۘ۬ۤۤۗ۟ۘ۟۠ۢۖۢۥۘۛ۟۫ۖۡۧۘ۟ۚۜۘ۫ۧۘۘۗ۬۠ۜۦۘۘۥۙۘۜۥۡۘۗ۫ۛ";
                    continue;
                case -133913477:
                    this.progressDialog.show();
                    str = "۬۠ۤ۟ۡۤ۠ۜۘۘ۫ۤۘۢۨۦۚۚۨۥۧۦۘۧۦۤۜۦۡۘۜۜۤۛۦ۫ۘۗ۟ۗۢ۬ۜۛۖۘۚۥۥۘ۠ۧۖ۠ۦ۟ۦۜۡ۟ۗۨ۬ۙۡۘۥۨۥۘۤۨۨۚۖ۟ۦ۫۠ۗۨۤ۠ۦۤۤۥۡۘ۠ۚ۬Oۚ۫ۤۜۛ۠ۙۦۤ۟ۛۡۚۤ۠ۤۦۙ۟ۚۚۧۡۧۘۡۤۗۥ۟ۖۘۡۧۢ";
                    continue;
                case 308464395:
                    alertDialog = this.progressDialog;
                    str = "ۨۗۥۙۗۖۚ۫ۚۘۙۨ۬ۢ۠ۗۥۗۚۧۡۛ۫ۧۙ۟ۖۘۖۛۨۘ۟ۥۧۘۦۜۗ۟۠ۚۜۡۗۛۧۧ۟ۜ۠ۖۜۗۡۘۡۨۨۘۨۢۖۘۗۙۜۚۖۜۘۙ۬۟۫ۨۙۛۘۘ";
                    continue;
                case 326500003:
                    linearProgressIndicator.setIndeterminate(z);
                    str = "ۦ۠ۧ۠ۢۦۘۚۘ۠ۘ۫ۛۦ۟ۚۧۥۘۥۗۖۘۤ۫ۦۘۜ۫ۖۢ۠ۧ۟ۜ۟ۧۖۧۘۤ۬۠ۧ۬ۖ۟ۖۘۧۗۨۘۢۜۖۘۡۚۤۨۙ۠ۥۧۘۥ۟۟ۖۙۛۧ۟ۙۨۗۨۘۤۨۗۨۤۘۚۗۜۦۛۧۛۜۥ۬ۙ۟ۡ۫ۦۚۖۡۧۘۤۛۤ۠ۤ۬ۗۜۘۡۛۚۦ۟ۥۘۘۛۨ۫ۜۜ";
                    continue;
                case 374188484:
                    String str2 = "۠ۡۗۨۛۙۦۖۙۡۦۘۘۤ۟ۚۙ۬۠ۘ۟۟۬ۜۖۙۤۘۦۤۧۤۦ۟ۤ۟ۘ۠ۛۘۢۦ۠۠ۧۥۘۚۖ۠ۦۦۘۘ۬ۥۡۙۦۦۨۦۜۢۛ۠ۦۦۡۢۥ۫ۚۜ۫۫ۚۥۘۜۡۜ۠ۚۤۖۗۚ۟ۤ۠ۛۛۘۢۥۘۦۢۥۘۚۧۜۘۜۚۙۘۡۦۤۥۡۨۜۜۦۗۡۘۨۤۥ۬۟ۡۘۤ۠۬ۙۥۘۘۤۙۦۙۖۧۘۛۚۛ";
                    while (true) {
                        switch (str2.hashCode() ^ 803117813) {
                            case -1786396761:
                                break;
                            case -815340459:
                                str = "ۤۧ۬ۡۧۤۙۢۘۘۙۡۙۗۡ۫۠ۦۥۘۥۢۢۛۦۜۘۖۧۧۡۤ۟ۛ۠ۢۜۡۖۜۡۘۘۦۡۚۧۦۖ۬ۨۙۡۙۜۨۢۨۘۚۤۤ۟ۙۛۢۧ۬ۧۧ۫۬ۢۦۘۛۤ۬ۨۡۖ۟۟ۤ۬ۗۡۜۦۘۗۗۦۘۛۦۖ۫ۘۥۘۘ۬ۗۛۡۗۥۡۡ۫۫ۨۙ۠ۙۛۡۧۜۘۙۢۛۤۚۖۖۧۨۘۧۡۨ۫ۦۢ۫ۙۚۜۛ۬";
                                continue;
                            case -750323825:
                                str2 = "ۥۥۤۘ۬۠ۦۡ۫ۙ۬ۙۦۖۦۗۨۨ۠ۤ۬ۜۙ۟ۢۚ۫ۜۨۘۖۥۨۘۖ۟ۘۘۖۛۚۙۨۚۥۨۘۘ۟ۙۖۘۦۗ۫ۧۘۜۘۧۘۦۘۜۘۜۘۨۜ۟ۨ۫ۨۘۤۜۡۘ۠ۧۡۘۘۖ۬۠ۜۘ۫۠ۛۤۡۛۧۥۡۤۗۧۗۖۘ۬ۤۜۦۚۨۚ۬ۜۗۤۦۖ۠ۘۘۘ۫ۜۛۧۦۚۧ۬ۙۤۚۚۙ۬۬ۗ۫ۧۧ۟۫ۡۨۜۢ";
                            case 1150825506:
                                String str3 = "ۦۖۦۘۙۦۜۢ۫ۦۘۗۥۥۘۙ۠ۜۘۘۖۛۢۥۥۜۧۨۙۢۧۨۛۖۤۙ۠ۜۜۥ۟ۦۤۘۨۚۦۖۙۚۛ۫ۤ۟ۚۙۚۡۡ۟ۛ۠ۢۙۘۗ۬ۡۡۥۘ۫ۛۦۧۘۡۧۦۙۡۦۘۙۛ۠ۜۚۜۖ۠ۦۜۤ";
                                while (true) {
                                    switch (str3.hashCode() ^ 73206186) {
                                        case -1059254500:
                                            str2 = "ۧۚۧۤۖۚۙ۫ۙ۟ۖۖۘۢۧۥۘۧۙ۠۫ۦ۫۟ۛۥۘۜۛۡۘۧۥۦۘۗۧۘۘۧۦۖۘ۬ۡ۬۫۟۬ۥۖۨۘۘۘۧۘۙۛ۠۠ۗ۫ۙۤۦۘۦۘۥ۠ۙۦۦۙۡۚۤۙۚ۫ۤۗ۬ۡۘ";
                                            break;
                                        case -808715479:
                                            str3 = "ۚۡۨۙۜۧۘ۫ۗۙۚۖۨ۫ۖۗۜۢۡۧۤ۟ۛۡۧۜۖۛۢۖۘ۠ۙۡۘۛۖۦۡ۬ۨ۫ۦۗ۫ۧۤۦۦۨ۬ۗۖۘۛۢ۠ۦۛۘۘۦۗۡۘۤۢۗۜ۫ۛ۬ۚۡۘۜۤۡۨۗۤۖۡ۠ۘۧۗۖۥ۟ۥۤ۬۠ۜۜۘۦۚۢۧ۬ۛۙۧۘۘۜۡۖ۟ۤۘۗۤۚۙۢ۟ۘ۟ۨۛۛۖۘۨ۠ۡۘۧ۫ۥۢۙۘۦۖۥۡۨۘۘۙۚۧ";
                                        case -458900895:
                                            str2 = "ۨ۠ۢۢۙۖۘ۫ۥ۟ۛۧ۟۬۬۟ۖۚۛۧۥۘۚۢۢۨۜ۟ۡۡۘ۟۫ۥۘۦۘۖ۬ۡ۟ۨۖ۟ۨۤۥۘ۫ۢۖۘۖۤ۠ۜۦۡۘۖۗۦ۫ۜۥۘۡۦۧۘۘ۟۠ۖۗۖۙۡۥۘۤۛۖۘۖۤۙۧۥۘۦ۟ۙۧۡۧۘۡۦۡ";
                                            break;
                                        case 379171119:
                                            String str4 = "۠ۧۖۘۧۖۤۦ۟ۨۘۦۥۧۧۧۥ۟ۚۚۦۜۨۘۚۥۖۘۨۚۦ۠ۗۚۤۖۤۨۛۥۘۛۤۦۘۥۘۘۢۗۨۘ۫ۡ۫۫ۤۜۤۚۘۘۡ۬ۤۡ۬۟ۛۘۛۡۧۢ۫ۧ۬ۢۗۧۜۤۧ۬ۖۗۥۖۡۘۨۡۨۘۥۙۙۦۥۡ۠ۖۜ۬ۖۡۗ۟ۥ۠ۖۚۖۧۘ";
                                            while (true) {
                                                switch (str4.hashCode() ^ (-1663491008)) {
                                                    case 746665036:
                                                        str3 = "ۢۖۥۖۧۥۜۙۤۤ۟ۖۗۨۙ۠ۚۛ۫۬۟ۘۘۥۘ۟ۜۚۘۙ۫ۤ۠ۘۛۧۗۧۧۥ۫ۤ۬ۙۛ۬ۜۦۢۚ۫ۚۧۜۙۛۗۦۘ۬ۡۘ۠ۘۘ۬ۧۙۗۡۨ۟ۦۘۨۦ۠ۢۧۖۚۧۡ۠ۦۖۘۥ۟ۤۛۜۘ۟ۢۦۗۘ۠ۖۦۘۤۧ۫ۘ۠ۢ۫ۧۜۘۚ۬۫ۥۗۜۘۥ۫ۜ۬ۗ۫ۘۘۖۡۛۢۤۖۘۙ۫۫۟ۘۤ";
                                                        break;
                                                    case 794068142:
                                                        String str5 = "۠ۙۘ۫۠ۧۨۛۧۘۢۙۛۧ۬ۥۛۘۘۨۡ۟ۗ۫۫۟ۧ۟ۜۗۡۘۙۚۗ۠ۛۦۡ۫ۦۘۨ۟ۡۘ۠ۥۡۜۛ۬ۨۖۨۘۘۧۨۧ۬ۘۥۘۡۚۤۚۗۚۖۥ۫ۨۡ۠ۥۚۦۘ";
                                                        while (true) {
                                                            switch (str5.hashCode() ^ 1740408377) {
                                                                case -1414321551:
                                                                    str4 = "ۢۨۧۘ۬ۚۨۘۡ۬۫ۨۨۦۖۨ۬ۖۨۧۨ۬۟ۚ۫ۢۨۧۦۘۗۧ۠۬۬ۥۘۛۖ۫ۢۢۨۡ۫ۧۖۦ۫ۘۥۗۜۨۡۗۚۚۤۜۛۜۦۗۥۥۤۡۨۘ۠ۙۙۜ۫ۥۗ۠ۖ۬۟ۥۘۦۡۙۢۤ۫ۚۢۛۡۢۧۗۨۗۦۥ۫ۧۨۘۗۦۧۛۡ۠ۦۥ۫۬ۖ۠ۧ۬ۧۥۜۗۘۧۦۘ۬ۚۥۡۛۜۘۤۢۙۧۚ۬ۥ۫ۦۘ";
                                                                    break;
                                                                case -933066661:
                                                                    str4 = "۠ۦۥۛ۟۫۬ۚۗۘۛ۬ۖۜۘۘۥۨۘۛۨۖۜ۟ۤۧۜۖۘ۟ۜۙۥ۟ۥۘۧۖۖۘۤۘۖۘۗۚۧۖۙۡۗۤۙ۟۬ۥۙۘۘۢۥ۟ۛۚۡ۬ۡۧۘۨۡۥۘۘۥۨۘۗۜۨ۫ۨۨ";
                                                                    break;
                                                                case -197537241:
                                                                    str5 = "۬ۥ۠ۤ۫ۨۘۡۦۘۢ۫ۛۚۙۖۙۘۡۘۙۥۘۦۢۘ۟ۧۨۨ۠ۡۚ۟ۧۨۤۡ۟ۢۦۘۗۖ۠۬ۧۢ۠۟ۛ۫۫ۡۘۧۛۖۙ۬ۖۘۧۘۢ۬۫۬ۛ۟ۦۙۘ۟ۜۦۖۘۙ۬ۦۘۙۦۖۘۧۘۛ۠۫ۤۚ۫ۦۘۙۡۘ۫ۚۥۖۛۛۘۧ۬ۖۛ۠۬۟۬";
                                                                case 1004649014:
                                                                    String str6 = "ۤۚۢۧۜ۬۫ۨ۟ۙۘۙۡ۠۠ۡ۟ۤۨۛۘۗۙۜۥۜۥۘۨۥۜ۟ۖۥۖۢۗ۫۫ۛۧۜۥۘۡ۬ۖۚۨۘ۟ۛۤ۟۠۠۟ۦۜ۫ۗۘۥۧۦۘ۬ۢۗۙۜۥۜۗۢۙۛۛۗ۟ۙۡۨۥۘۤۖۜۥۤ۬ۜۘ۫ۛۗۖۘۛۗۘۥۡ۫۫ۙۧ۟ۜۦۘ۠۟ۥۘۦۥۧۘۦۧۗۢ۟ۜۤۡ۟ۦۡۡ۠ۖۘۡ۬ۡۘۤ۟ۦۚ۟ۦ";
                                                                    while (true) {
                                                                        switch (str6.hashCode() ^ (-882820736)) {
                                                                            case -775931829:
                                                                                str5 = "ۡۚۨۘۖۡۜۘۨۜۥۖۗۡۘ۠ۧۨۙۥۡۦۜۧۘۡۙۜۡۜۘۤۢۜ۟ۧۤۡۛۢۖۡۛۙۘۙ۫ۜۘۘۖۤۦۘ۟۫ۘۧۨۥۢۦۧۜۘۨۤۧۡۥۛۖۘ۠۫ۡۘ۫ۘۥۥۦۨۧۡۖۘۚ۬ۨۡۧۥۗۡ۫ۗ۫۟ۢ۫ۡۧۛ۟ۜ۠ۘۖۧۥۘ۬ۛۖۘۙۡۚۥۡۡۜۜۛۚۜۤ۟ۜۡۨۦۜۧۤۘ۠ۡۘۤۖۛۗۛۢ";
                                                                                break;
                                                                            case 767441751:
                                                                                str6 = alertDialog.isShowing() ? "ۨ۟ۗ۬ۦ۟ۗۜۜ۬۟ۡۚۨۜۘۚ۬۠۠ۤۗۙۙۘۚ۬۫ۖۙ۬ۜۥۦۘ۟ۨ۟ۢۛۙۦۧۢۜۙۡۥۢۦۛ۟۠ۛۜۤۙ۬ۚۜۨ۠۠ۥۧۢۙۥۢۘۨۘۜ۟ۚ۠ۘۛ۬ۤۚۚۢۦۘۗۡۦۘۨۨۡ۟۟ۙ" : "ۛ۠ۘ۬ۘ۟ۧ۟ۢۥۚ۬ۖۚ۟ۘۢۦۦۧ۬۫ۦ۠ۤ۟ۦۤ۬۫۟۟ۜ۟ۡۘۖۛۘۘۛۘۡۧۙۧۘۜ۠ۜۢۖۖۖ۬ۜۖۧۤۚۨۘۨ۫ۡ۟ۛۤۚۜۧۘۢ۬ۥۦۜۙ";
                                                                            case 1047620602:
                                                                                str6 = "ۢۡۜۤۦۚۗۛ۟ۦۚۢ۫ۘۛ۠ۥۘۚۚۤۡۘۘۘۦۖۨۘۢۥۤۨ۫ۤۢۜۖ۬ۘۜۘۥۧۥۘ۠ۙۨ۠ۢۥۘۘۗۖۖۢۡۦۛۛۚ۟ۖۧۙۤۘۘۦ۠۠ۦۦۘۛۨۘۨۡۘۘۢۗۨ۫ۜۘۧۥۜۘۧۖۦ۠ۖ۠ۦۗۨ۬ۜۧۘۙۤۛۚۥ۬ۖۙۦۘۘ۠ۙ۟۫۟ۗۚۥۘۧۜۚۘۘۡۘ۠ۦۤۖ۬ۖۘۡۨۥۘۘۜۜ";
                                                                            case 1888248016:
                                                                                str5 = "ۢۘ۫۫ۨ۬ۧۦۖۦۗۡۘۜ۫ۡۘۧ۫ۛۗۦۘۙ۠۬۠ۦۦۖۙ۫ۖۜۘۡۨۤۘۜۚۗ۫ۖۚ۬۠ۧ۫ۨۘۥ۟۬ۧۖۢۚ۫۠۟ۤۘۛۤۨۘۥۗۡ۫ۧۘ۟ۚۦۘۘ۬ۥۘۥۧۢ۟ۦۜۥۢۖۡ۫ۤ۠ۗۛۚۗۥ۟ۛۥۛۜۘۘۤۙۛۥۤۡۘۖۙ۠ۡ۟ۜۡۘۘۙ۫ۜۥۧۖۢۛ۠ۥۦۘ۟۟ۙۘ۟۫ۥۖۘ";
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 913661819:
                                                        str3 = "۬ۜۥۘۢۛۨۘۚۘۛۥۧۘۖۗۦ۫ۗۖۛۢۜۚۗ۟ۦۙۛۡۧۚ۠۫ۥۘۥۙۧۘۦۗۗۧ۟۟ۖۘۤۦۘۧۥۖۚ۬ۨ۫ۘۗۦۨۥۢۛۡ۠ۥۜۚۡۧۛۨۖۥۗۨۖۘۢ۠ۢۗۦۜۦۡ۠ۗۦۥ";
                                                        break;
                                                    case 1927486006:
                                                        str4 = "۫ۤۦۘۚۤۨ۟ۙۦ۟ۤۡۘۛۢۙۥۡۦۘ۫ۨۛۚۢۦۙ۠ۦۘۖۙۤ۫ۡۜۘ۬ۡ۫ۙۜ۬ۢۡۛۦۘۖۘۨۨۡۤۗۖۡ۫ۙۤ۫۟ۛۗۜۧۥۜۢۤۨۘۚۥۡۧ۬ۖۘۘ۬۟ۖۛۜ۬۟۟۟ۜۡۘۛۘۘۖۙ۟۠۬ۜۘۘ۬ۘۘۖ۬۫۟۠ۥۘۡۢۚۨۦۗۛۥۥۘۖۤ۫ۜۧۜ۫ۧۥ";
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 403155135:
                    layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    str = "ۚۚۨۖۧۘۘۥ۬ۦ۬ۘۢۨۢۛۛۜۢ۟ۦۘ۬ۙۥۘۨۡۦۘۨ۠۬ۜۜ۠۫ۥۨۘۙۜ۟ۢۨۜۗ۟۫۬ۥۦۥ۠۟ۥۖۚ۟ۘۧۡۘۡۗۡۘۦ۫ۙ۠ۗۥ۬ۘۘۘ۬ۜۗۧ۟ۦۦۡۛۛۢۨۖۥۙۙۙۜ";
                    continue;
                case 567530084:
                    textView.setTextSize(16.0f);
                    str = "ۨۥۧۥ۟ۨۛۙۦۛۦۗۥۥ۠ۛۜۡۖۧۖۗۦۛ۬ۜۘۙۗۥۜۙۡۘۨ۫۫ۢ۟ۦۘۧۛۜۘۜۛ۬ۤ۠ۘۘۙ۠ۦۘۛ۬۬ۢ۫ۢۙ۫ۦۛۘۜۘۜ۠ۖۘۦ۫ۖۘۦۡۨۡۜۨۘۙۖۡۙۢۜ۬ۢۛۘۡۘۘۨۢۚۤۢۖۗۢ۫ۡۡۥۙۤۜۨ";
                    continue;
                case 581052905:
                    String str7 = "ۥۧۦ۫۫ۦۘۛۙۡ۠ۦۨۨ۠ۨۘۛۜۙۜۨۡۘ۠۟ۘۘۜۛۡۘۚ۫ۙۚ۫ۙۤۜۡۦۛۢۖۙۗۤۜۧۘۚۦۦۚۜۧۘ۠ۡ۠ۜ۟ۜۘ۟ۢ۟ۡۧۤ۬ۡۥۛ۬ۘۘ۬ۦ۬ۗ۠ۥۘۢۛۨۘۘۥۘۘ۠۠ۤۢۨۛ۫ۧۜۘۖۗۘۚۖۘۖۘ۬ۥۥۛ۬ۦۙۦ۠ۙۧۛۢۤۖۛ۬ۨ۠ۡۙۥ";
                    while (true) {
                        switch (str7.hashCode() ^ (-246243883)) {
                            case 226211626:
                                String str8 = "ۗۚۡۘۥۜ۬ۚۥۨۤۜۨۨۤۘۘۦۙۤۜۛۨۘۜۡۖۤۖۦۛۡۧۢۢۜۘۥ۠ۚۚۜۘۙۛۦۘۢۘۙۡۦ۠ۙ۠ۖۚ۬ۨ۠۠ۧ۬ۙۦۙۤ۟ۢۨۧۘۖ۠ۤۘۢۛۛۙۦۘۤۦۘۘ۟۟ۥ۫ۘۜۧۜۙۜ۫۫۫۟ۖ۠ۚۥۘ۫ۖۧۘۧ۬ۙ۫ۨۘۖۛۧ۫ۦۡۘۛۨ۬ۨ۫ۖۘۧۦۖ۟ۢۨۜۨۤۗۘۖۘۙۦۜۘۨۨۧ";
                                while (true) {
                                    switch (str8.hashCode() ^ (-1124865748)) {
                                        case -1228865199:
                                            String str9 = "ۗۙۢۚ۬ۛۚۛۖۦ۠۬۟۠ۜۡۨۘۚ۬ۖۘۘۢۤۥۜۛ۬ۙۥ۠ۗۦۘۧ۫ۦۘۛۨۘۘۤۜۘۙ۟ۨۘ۠ۖۧۘۢ۠ۦۘ۟ۧۚ۫ۢۗ۫ۛۘۘ۬ۢۡ۬ۖۘۤۨۥۘ۬ۗ۫ۗۢۜۛۖۖۘۥۚ۠ۡۡۚۧۥۘۚ۠ۖ";
                                            while (true) {
                                                switch (str9.hashCode() ^ (-442739144)) {
                                                    case -1871620042:
                                                        str8 = "۠ۨۢۛ۠ۤۤ۬ۘ۠ۛۥۘۗۢۥۘۢ۟ۜۦۡۛۖ۫۫ۧۖۘ۫ۖۥۘ۫ۧۘۘۡۤ۠۟ۖۢ۟۬ۗۤۗۨۢۗ۫۠ۦۖۘۙۜۖ۫ۖۘۨۦۨۘۖۛۥۛۧ۠ۡۢۥۧۗۗۘۥۘۥۢۡۧ۫ۙۢۧ۫ۚۧۧ۠ۜ۟ۢۙ۟ۗۜۨۛ۠ۡۦۚۜۘ۟ۢۨۢۥۡۗۨۛۥۚۥ۬ۚۧ۫ۜۡۨۘۦۜۘۦ۬ۥۘۤۜۘ۟۬ۗ";
                                                        break;
                                                    case -1385040449:
                                                        str9 = "ۜۨۦۘۡۦۚ۫ۗۦۧۤۜۖ۬ۦۘۦۤۡۘۘۧۥۘ۠ۥۦۧ۠ۢۨۤۡۛۤۦۚ۟ۥۨۧۨۘۧۙۚۢۗ۫ۛۨۖ۟ۖ۫ۤ۫ۚۡۡۘ۠۟ۖۘۛ۟ۡۘۦۡۨ۬ۢۡۘ۠۠ۧۤۡۘۧۤۧۨ۠ۙۥۤۖۘ۠ۨۡۧۢۢۗۘۧۘۢۚۦۘ۟ۜۢۢ۟۫۫ۢۤ۟ۛۨۚۧ۟ۢۤۖۘ۠۠ۖۨ۬ۜ";
                                                    case -994181490:
                                                        str8 = "ۤۘۢ۠ۤۤ۟ۘۤۖۚۥۘ۫ۙۖ۠ۥۡۘۨۗۥۘۦۙۙۦۘۦۦ۫ۤ۫ۤۤ۬ۙۛۜۨۤ۫۟ۘۛ۫ۖۘۚۦۧۡ۬ۥۜۦۡۦ۫ۦۘۗۢۘۘۙۡۦۘ۟ۦۛۦۢۗۛۨۙۜ۟۬ۗۙۦۡۧۖۨۨ۠ۧۖ۬ۖۡۢۜ۫ۖۘۥۖۦۡ۬ۦۘۘۡۖۦۗ";
                                                        break;
                                                    case 637577014:
                                                        String str10 = "ۦۘۜۜۘ۫ۛۨۧۘۢۡۖۗۖۜۧۚۗۛۛۥۜۢۢۤۤۥۥۡۡۤۙۡۤۨۨۨۥ۟ۚ۟ۖۚۖۜۡ۟ۗۡۥۛۙۜۜۚۘۦ۠ۨۘۚۨۖۘۢۛۙۗۜۜۘۜۨۘۘۡۢۘۘ";
                                                        while (true) {
                                                            switch (str10.hashCode() ^ (-544099270)) {
                                                                case -1949115195:
                                                                    str9 = "ۖۦۖۘۙۚۚۨ۫ۜۘۨۚ۬۠ۘۘۢ۟۠ۦۤ۫ۘۢۨۘۡۖۥۗۚۡ۫ۚ۟ۗ۫ۦۘۖۦۘۦ۬ۦۨۜۡۛ۟ۥۧ۫۟ۛۡۘۧۜ۫۟۟ۨۘ۬ۖۘۙۥۥۘۦ۬ۦۘۜۘۜۜۛۜۙۧۤۤ۟۬ۜۡۖۘ۠ۛۖۜۥ۠ۘۨۡۤۛۖۤۦۡۗۘۧۙۨ۠";
                                                                    break;
                                                                case -855078843:
                                                                    str9 = "ۨ۠ۧ۬ۦۥۘۜۚۥۘۗۚۡۘۧ۫ۥ۫ۦۘۘ۠۠ۧۘۤۛۢۢ۠ۛ۫ۥۧ۠۬ۨۨۡۘۦ۟ۥۘ۟ۧۥۘ۟ۥۧۦ۟ۡ۬۫ۡۦۙۥۘۢۡۨۘۤۨۜۧۥۜۛۦۖۘۗ۫ۜۙ۬ۨۘۘۙۥۘۙۛ۬ۧۚۨۦ۫ۢۢۘۙ۟۫ۙۗۢۥۘۚ۟ۦۨ۟ۗۖۤۢ";
                                                                    break;
                                                                case -569042568:
                                                                    String str11 = "۫ۨ۬۫۟ۦۘۢ۫ۦۙۥۘۘۤ۫ۖ۟ۡۧۙۦۛۘ۫ۖۙۢۥۤۥۖۘۘۡۛۘۖۧۘۜۤۜۘۨۥۨۘۘۧۡۦۢۢۛۙۤۡۗ۠ۖۨۘۛۘۡۢ۫ۨ۬ۥ۬ۦۘۤ۟۬ۡۥۖ۟ۢۛۖۛۡۥۘۘۗۛۢۡۦۘۥ۫ۧ۫ۜۡۘۖ۫ۖۘۥۢ۬ۧۛۢ۟ۡۦۘ";
                                                                    while (true) {
                                                                        switch (str11.hashCode() ^ (-1762264746)) {
                                                                            case -1192706982:
                                                                                str11 = alertDialog2.getWindow() != null ? "۬ۦۡۜۧۘۢ۟ۚ۬۫۬ۙ۬ۢ۫۫۬۠ۧ۠ۜۧۤۙۘۜۗۤۙ۫۫ۚ۟ۨۥۜۘۘۡ۠ۥ۟ۖۙ۬۫ۨۘۗۧۥۘۨ۟ۖۘۡۤۜۖۜۦۘۥۛۜۘ۠ۜۜۙۖۙ۠ۛۧۙۤۡۘ" : "ۡۡ۬ۥۧ۟ۥۧۧ۠ۗۜ۬ۗۛۜۙۡۦ۠ۜ۫ۡ۠ۘۦۘۤۧۦۘ۟۬ۘ۟۠ۚۡۦۨۘۘۨۥۘۚۢۜۨۡۥۘۙ۬ۖۘ۠ۘۜۘۤۛۨۘۢۖۘۙۛۜۘۤۙۘۘۚ۟ۖۘۤۤۦۘۧ۫ۚ";
                                                                            case -819677800:
                                                                                str11 = "ۢۥۚ۟ۖۜۘۦۥۡۚۢۜۘۗ۫ۡۙ۠ۘۖ۟ۧۙۥۘ۟ۜۜۘ۠ۗۧۖۙۛ۟ۖۘۜۥۥۙۗۦۘۜۖۦ۠۟ۨۖۛۦۘ۟ۗۛۨۜۛۖۛۖۘۦۜۥۗۥۖۗۜۘۘۢ۬ۚۨۨۡ۫ۤ۫۟ۨۘۖ۫ۧ۬ۧۖۘ۬۠ۜۘۘۡۛۙۚ۠ۧۤۥ۠ۥۘۚۖۡۘ۠۟ۜۘۧۡۧ۬ۦ۬ۤۘۨۘ۬ۧۦۘۜۦۖۦ۫۬ۜ۟ۥۘ۫ۛۦۘۦۡۡ";
                                                                            case 1171156808:
                                                                                str10 = "ۥۨۦۘۙ۫ۧۡۧۗۙۨ۬۫ۘۘۦۜ۠۟ۡۡۧ۠ۜۥۢۜۘۖۦۦۘۖ۫۬۬ۧۘۘۦۛۖۘۧ۠ۖ۟ۧۧۘ۟ۗۦ۬ۡۧ۠ۨۘۖ۟ۦۦۚۘۤۗ۫ۢ۟ۚۡۘۢۢۛۡ۬ۦۢۚۥۙۖۡۤۚۡۡۧۖۛۛۛۦ";
                                                                                break;
                                                                            case 1770388139:
                                                                                str10 = "ۨۥۥۤۦۢۚۛۥۘۗۖۥۢ۬ۥۘۧۜ۬۬ۥۤۤۜۤۦۘ۫ۥۛۦۤۖۘۛۖۚۜۗۡۘۥۚۘۘۦۖۡۘۚۚۜۘۢۢ۟ۤ۟ۡۙۤۜۦ۠ۡۤ۬ۙۘۗۢ۫۟۫ۙۗۙۢۡ۬ۨۖۨۚۖۡۘۛ۫ۡۥۜۚ۬ۘۘۘۛۗۦ۬ۥۤۢۛۗۛ۟۫ۨۜۤۗۚۙۢۛۡ۬ۥۡۘۖۚۤۤۘۛ";
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 1651793369:
                                                                    str10 = "ۡۘۙ۬ۛۥ۠۟ۡۘۤۗ۫ۖۘۜۡۛ۟ۤۥۗۙۙۢۖۤۜ۬ۚۥۡۘۦۘۘۨۨ۠۠ۗۢۖ۟ۤۦۚۨۛۨ۬ۥ۬ۤۤۦۗۨۙۡ۟ۚ۟ۤۧۜۦۥۘۧ۬ۘۘۧۨۙۜۧۡۘۜ۫ۨۘۡۤۥۘۤۚۨۘۨۢۦ۠ۥۚۜ۠ۘۖۚ۬ۛ۫ۖ۫۬ۨۘۚۙۘ۟۬ۘۘ۫۟ۗ۬ۡۘۘۗ۬ۖ";
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        case 125079875:
                                            str7 = "ۨ۬ۧ۟ۥۘۘۨۗۡۘۚۘۘ۟ۗ۟ۛۗۖۤۗۖۤ۫ۢۖۤۜۗۧۖۙۨۘۘ۠ۡۤ۬ۗۨۘ۠ۜ۫ۤۙ۬۫ۗ۠ۗۛۥۙۚۦۘۢۙۨۡۡۗۧۡۘۘۢۗۚۨۦۖۘۙۡۜۘۘۢ۫ۡۜۤۘۦۘۚۚۖۘۨ۫ۡۡۢۚ۬۟ۤۙۚۗ۠ۨۜۘۥۤۡۗۙ۠";
                                            break;
                                        case 464160268:
                                            str8 = "ۚۚۚۦۛۡۘۙۖۡۜ۟ۚۢ۟ۘۘۡۦۘۡۢۜۥ۬ۢۙ۠ۨۘۦۚۗۢۖ۫۫ۗ۫ۚ۠ۡۤۨۖۘ۠ۙۖۤۦۨۘۦ۟ۧۡۛۘۘۧ۫ۥۘۘۘۗ۟ۢۘۘۡۜۤ۫ۙۥۤۚۗۛۘ۟ۨۖۧۡۨۨۗۙۙۦۨۘۡ۟۠ۘۥۖۘۙۜۛۦ۬ۤ۠ۘۗۘۥۛۥۤ۬ۢۢۨ۬ۥۘۦۘ۬ۨ۫۟۠ۦۚ۠ۜۤۖۡۥۤۨۘۖۜۡ";
                                        case 949119003:
                                            str7 = "ۨۨۚۗۥۧۘۘۦۚۢۢۡۛۥۘۘ۠ۗۚ۟ۥۧ۬ۨۖۘۤۦ۟ۧ۬ۖۖۨۘۙۡۦ۬ۡۧۢۛۙۜۦۦۡ۫ۘۘۚۥۡۘۛۧۙ۟ۦ۠ۙۛ۠۟ۘۙۥۥۖۘ۬۬ۜۛۖۘۘۜۘ۠ۥۨ۫ۘ۟ۨۘۢۖۜۘۖۛۢ۫ۚۤۚۦۜۘۤۨۦۖۧۡۘۢۙ۬۬ۛۨۘ۠۬ۜۡۖۥ۫ۖۘۗۡۨۘۢۙۤۙۢۧ۬ۚۥۘۢۙۡۘۡ۠ۥۘۜۧۥۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1317753344:
                                str7 = "ۘۗۥۘۥۛۥۘۥۡۗۢۧ۫ۚۘۘۘۡۜۧۘۧۛۖ۫ۡۢۨۨۥۘۨۗۥۨۖۛۤۖۢۗ۠ۚۤۨۗ۬ۥۨۡۡ۬۫ۢۖۥ۟۟ۨ۠ۜۘ۬ۜۘۗۢۗۧۥۧۥۥۖۡۧۡۚۘۤ۠ۤۙ۠ۡۦۚۥۢۛۥۚۢۙۜ۠ۡۘ۬۟ۡۘ۫ۥۡۛۙۜۛۗۤۙۤۜۘۦۧ۠ۘ۟ۨۘۚۤۖۘۤۦۨۡ۬ۜۦۖۙۥۨۤ۟ۢۨۘۤۡۧ";
                            case 1353888913:
                                str = "ۧۛ۟ۚۘ۠۟ۥ۬ۧۢۘ۬ۖۢۢۡۖۘۤۛۗ۠ۗۖۤۚۗۛۛۧۚ۬ۛۧۛۜۘۨۨۛۢ۫ۥ۬ۢ۠۠ۦۡ۫۬ۨۘۨۘۖۛۧۨۘۜۙۦۖۙۡۘۧۦۜۘۛۛۘۧۗۤۛ۫ۙ۫ۙۨ۟ۛۡۨۥۗۢۗ۟ۖۤ۠ۢۨۘ۟ۙۖۢۗۘۨۚۖۗۛ۠";
                                continue;
                                continue;
                            case 2018652689:
                                str = "ۨۥۗۢۚۦۘۡۤۦۘ۫۠ۤۦۖۧۘۖۙۛۗۜۦۗۖ۟ۢۗۗ۫ۘۜۙۚۜۘۧۛۜ۟۠ۥۘ۬ۚۢۡۘۖۧۢۢۘۖ۫ۖ۫ۡۧ۟ۡۜۧۦۘ۟۫۟ۚۡ۠ۖ۠ۨ۫ۛۚۛۥۨۤۘ۠ۦۚۡ۫۠ۚۗۗۗۜۙۖۛۚۙ۟ۨۡۘ۫ۤۦۜۢۨۘۛ۬";
                                continue;
                        }
                    }
                    break;
                case 674368772:
                    textView.setLayoutParams(layoutParams);
                    str = "۟۫ۢ۟۟ۖۘۢۘۡۘۤۜۧۨۦۘۦۥۥۘ۟ۥۨۜۥۚۖۡۙۦ۬ۡۘۦۙۜۘۛۗ۬ۛ۬ۤ۫ۛۢۙۜ۟۬ۡۘۧۙۡۘۡۙۘۘۙ۫ۤ۠ۚۚۗۚۡۘۥ۫ۜۘۨ۠۬ۖۘۘۙۥۗۢۗۜ۫ۧ۬۟ۥۡۖۨۢۗ۟۠۟ۢۥۖۦۥۙۘۚۘۦۤۘۛۡ۠۠ۨۘۧ۠ۨۡۖۖۘۦۦۨ۬ۙۧۨۚۦ۬ۛۥۧۤۜۘ۫ۜۜۘ";
                    continue;
                case 866167391:
                    linearLayout.setGravity(1);
                    str = "ۢۚۥۘۚ۬ۧۘۜۗۛۖۤۦۜۡۘۢۢۤۗۢ۠ۘۨۘۘ۫ۥۙۧ۠ۤۚ۬۬ۢۢۜۘۨ۟۬ۡۤۚۧۡۥۙۚۦۥۖۡۘۥۙۢۧۗ۬ۖۜۙ۟ۢۖۘۨۜۨۘ۟ۥۡۢۛۨۧ۫ۢۧۡ۬ۧۤۖۙۥۦۢۡۘۥۛۜۘ۬ۚ۬۫ۦۘۘۛ۟ۘۘۢۡۛۨ۬ۤ۫ۖۨۘۦۚۚۢۢۡۥۤۥ۬ۘ۟ۘۛۥۗۙۗ۫ۖۡ۬۟ۦ۫";
                    continue;
                case 1368741739:
                    gradientDrawable = new GradientDrawable();
                    str = "ۧۚۥۢۧۦۘ۫ۧۨۘ۫ۜۥۗۗۥۘ۬ۖۥ۫۠ۨۛۛۥۢۜۘۘ۠ۛۜۘ۟۟ۘ۫ۘ۠۠ۥۦ۬ۖۦۘۢۛۡۘۤۙۡۥۛۛۚۥۢ۠ۛۡۘۜۥۡۘۗۤۙۛۡۙۦ۫ۛ۬ۨ۠ۜۙۤۦۚۜۚۖۜۢۘۚۨ۠ۖ۟ۡ۫ۨۤۙ۟ۦۖۘۗۚۦۘ۟ۥۘۘ۬۠ۗۚۚ۠ۖ۟ۜۙۦۗۦۥۘۙۙۧۙۘۨۛ۫ۢۛ۟ۡۛۜۦۘۧ۬ۘ";
                    continue;
                case 1505147445:
                    this.progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                    str = "ۨۥۗۢۚۦۘۡۤۦۘ۫۠ۤۦۖۧۘۖۙۛۗۜۦۗۖ۟ۢۗۗ۫ۘۜۙۚۜۘۧۛۜ۟۠ۥۘ۬ۚۢۡۘۖۧۢۢۘۖ۫ۖ۫ۡۧ۟ۡۜۧۦۘ۟۫۟ۚۡ۠ۖ۠ۨ۫ۛۚۛۥۨۤۘ۠ۦۚۡ۫۠ۚۗۗۗۜۙۖۛۚۙ۟ۨۡۘ۫ۤۦۜۢۨۘۛ۬";
                    continue;
                case 1587080906:
                    gradientDrawable.setColor(-1);
                    str = "ۗۙۖۢۖۜۘۗۚۘۘۘۨ۠ۥۥۨۥۥۡ۟ۙ۟ۥۢۜۘۤۥ۬۫۠ۘۚۧۜۛۡۡ۟ۨۤۢۘۖۘ۬ۖۢۖۙۨۘ۠ۗۘۘ۟ۢ۫ۜۗ۫ۨۚۖۗ۬۟ۗۜۘ۟ۧۙۤۚۖۘۘۛۨۘۡۚۡۘ۠ۢۙ۟ۗۥ۫۠ۜۦۛۖۘ";
                    continue;
                case 1618299151:
                    linearProgressIndicator.setTrackColor(Color.parseColor(Deobfuscator$$app.getString(-3440726630978117449L)));
                    str = "ۥۚۨۡۖۧ۟ۡۜۢۡۧۘۘۤۡۘۛۦۜ۠۟۫ۥۙۗۜ۠۠ۦۙۧۧۦۡۤۥۘۤ۠ۘۦ۟ۖۖۦ۫ۧ۫ۜۘ۠ۢۡۗۡ۫ۗ۟۫ۖۢۙ۟ۖۘ۬ۡۥۘ۠ۖۧۘ۬ۛۖۘۜۧۡۘۗ۠ۨۘۧ۟ۙ۬ۙۡۢۙۡۘۜۙۚ۬ۥ۬۠ۖۙۥ۬ۖۖۥۘۥۜ۠ۡۜ۫ۘۥۢۚۨۡۢ۫ۢ";
                    continue;
                case 1639661761:
                    linearLayout.addView(linearProgressIndicator);
                    str = "۟۬ۖۗۗۢۦۡۦۙۛۖۘۢۜ۠ۙۜۨۘ۠ۛۙۖۥۜۢ۟ۚۜۤۨ۠ۢۘۘۖۖۨۖۡ۬۟ۙۘۧ۬ۨۘۥۗ۫۫ۛ۫ۢۗۥۜۡۜ۟ۨۚۛۥۧۘۘ۫ۢۨۗۙۤ۠ۤۦۘۚۦ۟ۘۨۤۙ۬ۥۤۧۛۨۗۘۘۜۛۥ۬ۘۚۥۢۧ۟۫ۡۘ۫ۥۧۘ۫ۘۤۦۘ۫۠ۘۜ۟ۦۧۘ۟ۦۡۡۗۨۖۡ۠ۙۤۢۘۡۙۤۨ";
                    continue;
                case 1651909342:
                    textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                    str = "ۗ۠ۛۤۢۜۘۨ۟ۜۢۚۨۢۧۚۜۥ۟ۢۚۨۗۘۤۙۢۧۗۜ۬۟ۨۢۛۛۘۨۧۦۧۡۤ۬ۖۘۙۘۘۧۦۦۘۦۥۘۘۘ۬ۡۘۡۦۜۨ۬ۥۡۙۢۗۡۦۘ۫ۢۦۘ۠ۧۦۘ۟ۧۡۖ۫ۡۘۥۦۚۛۛۖۨۜ۬ۚ۟ۦۘۜۡۛۨۨۗۙۧۧۚۖۘۥۙۦۘۨۖۘۢۚۦۦۛۨ۟ۡۦۖۘۘۙۥۦۨۚۘۗ۟ۥۛ۠";
                    continue;
                case 1667855761:
                    alertDialog2 = new AlertDialog.Builder(this).setView(linearLayout).setCancelable(false).create();
                    str = "ۢ۫۫ۥۨ۬ۘ۬ۖۡۨۚ۬۟ۨۘ۫ۗۜ۠ۖۖۦۢۡۨۤۗۗ۠ۙۘۢ۫ۖ۠۫ۥۤۢۖۥۡۤۖ۟ۖۖۢۡۜۛۤ۟ۙۙۙ۫۬ۗۥۢۨۘۙۛۡۧۚۤۛۘۡۨۘۗۛۡۘۙۚۚۦ۟ۛۥ۠ۨۛۢ۠";
                    continue;
                case 1736082850:
                    String str12 = "ۚۚۥۚۗ۟۫ۖۦۘۗۖۘ۟ۛ۠ۙۙۦۙۘۥۡۚۨ۠ۧۥ۠ۦۧۘۛۤۤ۫ۡ۟ۦ۠ۚۥۧۙۘۛ۠ۛۢۖۘۚ۬ۜۘ۬ۡۧۘۥۦۨۘ۠ۥۤۗۛۚۘۚۘۨۥۧۘ۫ۘۛ۬ۥۦۘۛۘۥۡۨۡۜۦۦ۠ۖۦۘ۠ۡۘۡۤۖۤۡۨۢۗۚۖۧۘ۫ۖۡۡۗ۫ۥۖۥۜۡۙۙ۠ۧۢۘۥ";
                    while (true) {
                        switch (str12.hashCode() ^ 1422121589) {
                            case -1249992049:
                                break;
                            case -660673049:
                                str12 = "ۜۦۖ۟ۢۧۖۚۛۛۤۥۘۤۜۦۡ۠۟ۗۙۖۘۡ۟ۥۖۥۨۗ۫ۨۦۜ۫۫ۗ۟ۤۧ۟ۧۖ۬ۡۘۖۚۥ۠ۡۨۘۤۢۦۚۤۤۨۧۖۘۚۖۛ۬ۛ۠۟ۜۜۘۜ۠ۦۘۜ۬ۡۘۢ۠ۡۚۜ۬۟ۦۜۜۨۚ۟ۤۦ۬ۗۘۥۗۧۜۚۧۛۜ۟۫ۖۘۨۨۗۥۡۡۘۗ۬ۗۥ۫ۦۘۥۙۤ";
                            case 198308062:
                                str = "ۗۦ۫ۢۖۡۚۖۡۖۙۜۘۘۖۡۘۥۙ۫ۢ۟ۚۙۡۡۛۧۙ۫ۛۧۥ۟ۛ۬ۛۢۧۘۗۜۢۤۨۢۚ۬ۤ۟ۨۛۖۛۡۜۘۜۛۢۥۢۥۛۜۧۘ۟ۚۗ۫ۙ۠۟۫۫ۥ۬۬۠ۥۘۤۨۡ۟ۛ۠ۘۙ۟۟۬ۗۛۘۘ۠ۨۙۖۦۢۤۧۜ۟۠ۤۢۜۧۘۖۡۗۚ۬ۗۢۙۛۙ۟۠ۘۨۘۥۦ۬ۦۦۜ۬۠ۡۖۤۜ";
                                continue;
                            case 1812355265:
                                String str13 = "ۙۜۦۘ۬۟۫۬۬۠ۜ۟ۤۜۥۦۜۧ۬ۗۗ۠ۙ۟ۛۧۥ۠ۨ۠ۖۖۡۢۢۤۤۚۡۚۥۘۗ۬ۛۘۥۜۘ۫ۤۨۘۥۗۘۜۜۖۘۨۜۘۙۢۡۘۗۘۥۜۡۤۙۦۢۜۨۨۘۛۛۡۘۗ۫ۥۘۤۙۛۙۚۥۘۨ۠۬";
                                while (true) {
                                    switch (str13.hashCode() ^ 1879566969) {
                                        case -1638985051:
                                            String str14 = "۫ۗۗۨ۫ۨۖۦۛ۫ۘۧۘۤۡۚۤۜ۬ۡۘۨۦۥ۬ۧ۫۫ۜۘ۠ۘ۫۠۠ۧۨۘ۫ۗۧۨ۬ۨۥۚ۫ۨۤۖۥۚۧ۠۠ۖۦۦۤۚۦۘ۬ۡۘ۠ۧۚۢ۬ۚۧۙ۟ۥۗ۟ۜۡۘۡۨ۠ۥۡ۬۠۫۬ۙۤۜۜۗۤۤۡۖ۠ۙۥۘۜۗۧۜ۟ۥۜ۬ۧ۠۟ۧۙۙۢۛۚ۫۬ۜۘ";
                                            while (true) {
                                                switch (str14.hashCode() ^ 1898377028) {
                                                    case -2070252825:
                                                        String str15 = "۫ۥۚۜۢ۟۫ۦۜۦ۟ۗۨۜۖۤۚۙۛۗۦۖۡۢۜۤۥۜۘۖۙۨۘۙۖۚۜۧۖۘۧۙۤۛۜ۟۫ۖ۬ۙۨۡ۟ۛۧۧۙۘۘ۬ۖۜۘۜۢۖۤۡۘۨۢۤ۬ۙۡۘ۬ۥۜۘۛ۫۠۬۬ۖۢۖۥۧ۬ۘۘۖۖ۠ۗۖۘ۟ۘۨۛ۫۬ۗۗ۬ۗ۬۬";
                                                        while (true) {
                                                            switch (str15.hashCode() ^ (-997053964)) {
                                                                case -2025372656:
                                                                    str15 = "۠ۙۡۨۗۚۤۥۡ۫ۥۙ۫ۡۡۘۙۖ۟ۘۙۨۘۖۡۘۘۖ۬ۢۥۜۘۘۖۡۙۚۢۨۜۛۖۘۤۚۚ۠ۥ۫ۖ۬ۤۜۘۚۨۜۖۘۖۗۡۚ۫ۜ۬۠ۗۨۗ۫ۧ۫۫ۘۥۥۘۗۨۘۤۗۗۜ۬ۙۗ۠ۨۘ۬ۤ۬ۤۦۚ۬ۨۨۘۖۥۤۚۙۙ۠ۙۦ۬ۗۤۥ۬۠ۥۚۦۘۡۤۗۛۙ۫ۤۧ";
                                                                case -1210305659:
                                                                    str14 = "۠ۛۚ۬ۡۦۘ۫ۜ۠۫ۦۥۘۖۦۧۛۢۥ۫ۘۘۘۢۚۥۘۚۢۤۗ۠ۨۚۙۦۘۛۘۖۛ۬ۧۢۤۥۘۖۢۚۚۥۢۘۛۙۙۥۖۘۥۥ۫ۖۨۘۜ۟ۧۦۧۡۦۡۜۘۗۘۥۘ۠ۛۦ";
                                                                    break;
                                                                case 576108926:
                                                                    str14 = "ۤۘۤ۟ۧۜۢۥۜۜۛۡۢۤۦۛۥۥۧۦۡۦۖۢۦ۫ۡۖ۬ۗۨۘ۟ۤ۠ۦۛۘۢۨۚۦۖۜۘۤۚۨ۫ۖ۟ۢۛۗۙۤۘۘ۠ۦۙۢۙۨۘۦ۟ۦۘۙۦۗۗۡۚ۬ۗ۠ۗۖ۬ۖ۫ۡۨ۬ۗۢۖۥۘۙ۫ۧۦۥۘۢۙۧ۫۠ۙۡۘۘۡۜ۫";
                                                                    break;
                                                                case 2119000185:
                                                                    String str16 = "ۨۥۖۘ۬ۖۙۚ۫ۘۚۖ۫ۙۘۦۙۥ۠ۥۜۧۘۢۘۨۘۧ۫ۢۖ۬ۡۥۨۨۢۡ۟ۤۤۧ۫ۧۡ۫۠ۙ۬ۤۦۥۥۤۡۘۛۥۖۘۡۙۖۥۢۗ۬ۨۜۡ۠ۤۡۤۜۘ۟ۚ۬۫ۗۗۖۚۥۘ۬ۙ۫ۘ۬ۤۨۦۛ۫۬ۙۨۛۛ۫ۦۙۙۘۡۘۡۤۚ";
                                                                    while (true) {
                                                                        switch (str16.hashCode() ^ 1434393072) {
                                                                            case -1846437811:
                                                                                str16 = "ۘۜۧۨۖۦ۠۟ۖۘ۠ۨ۠۬ۚۜۤۦۧۘ۬ۚۧ۠۫ۘ۟ۘۢۥ۠ۡۡۖ۬ۨۙۘۜۦ۫۫۫ۨۗۦۘۡۨ۟ۨۙۦۘ۟ۘۦۘ۬ۨ۫ۘۘۖۢۜۘۛ۠ۖۘۖۘ۟ۘۜۘۢۧۨ۠۬ۜۗ۟ۖ۠۫ۦۘۥۚۦۘۨۚۖۘۤۘ۬ۢ۬ۙ۟ۥۤۙۢۚ۟ۗ۫";
                                                                            case -730153935:
                                                                                str15 = "ۡ۟ۡۘۖۤۛ۬ۚۧۚۛ۟ۗ۫ۘۘۡۜۖۘ۫ۗۡۘۢ۠ۜۜۙۜۥۚۡۘۥ۟ۖۘۧۗ۬۠ۨۚۤۜۙۨ۠ۦۡۘۜۘۡۧ۬ۥ۬ۚۘۛۦۘۚۘۙۗۜ۫۬ۚۘۨۚ۫ۗۗۡۘۦۨۜۘۤۥۘۘۛۚۡۘۥۗۡۘۧۦۗۦۘ۟ۤۛۦۧۦ۫۫ۢۘۘ۟ۘۦۚۡۢۚۘ۬ۥۧۘۘۨۡۢۦۧۚ۬";
                                                                                break;
                                                                            case 1520187065:
                                                                                str16 = alertDialog != null ? "ۙ۫ۡۘ۬ۥۦۘۗۥۙۖۦۖۘۛۜۜۘ۟ۙۨۘۢ۠۠ۖۜۛ۬ۘۘۥۡۜۚۨۡۘۨۖۦۖۦ۠۟ۗۥۘۡ۟ۘۥۚۖۥۗۛۥۚ۟ۨ۫ۤۢۧۨۘۥۨۤۗ۬ۖۘۡۛۤۙۜۛۗۨۥ" : "ۧ۠ۨۘۢۥۦ۫ۤۡ۬ۚۖۘ۬ۡۢ۟ۜ۬۠ۤۦۘۤ۟ۜ۠۠ۨۘۛ۟۬۬ۛ۠ۥۥۨۘ۬ۤۤۙۥ۬ۛۙۤۗۧۢۧۨۥ۠ۖۛۧۨ۟ۘۤۘۘۢۥۢۢۢۦۢۥۛۗۡۖۧۜۜۘۡ۟ۢۤۥۙۥۛۗۚۡۧۖۛۢۧۖۘۧ۠ۨۚ۟ۥۨۤۖۥۜۨۨۗۖۘ۟ۜۚۡۨۧ۬ۨۘۗۡ";
                                                                            case 1574072122:
                                                                                str15 = "ۘ۟ۧۗۖ۠۫ۡۥۘۜۙۙۘۙۢۖ۠۟ۡۨۡ۟ۢۦ۟ۗۢۖۘۦۘۡۡۦۘۨ۫ۡۗۘۦ۫ۘۘۘ۟ۚۨۜۛۗۧۢۘ۬ۥۡۘۛۚۗ۫ۗۖۜۡۘ۟ۧۨۚۨۤۨۧ۬۫ۚ۬ۚ۟۫۬۠۫ۜۤ۠ۥۘۚۙۚ۠۬ۛۖۘۧۡۧۘ۠ۛۗۢۡۜ۟ۗۡۘ";
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case -362720719:
                                                        str13 = "ۖۨۢ۬۟ۘۘۨ۠ۥۡ۟۫۠ۡۢ۠ۙۖۦ۟ۗۜۘۘۜۥۘۥۙۥۤۚۥۜۢۢ۬ۧ۠ۙۘۛۨۚۛۡۖۧۘۨۜۛ۟۬ۤۧۗۥۘۦ۟ۙۖ۠ۖ۠ۚۤۛۚۡ۫ۘۛۙۗۜۘ";
                                                        break;
                                                    case 526186468:
                                                        str14 = "ۚۘۦ۠ۛۢۥۘۦ۫ۡۖۘ۫ۦۙۥ۟ۘۗۙۘۚ۟ۙۙۗۗۙۤۖۦۢۧۧۗۦۘۨ۫ۡۖۢۘۘۡۧۜۘۘۖۡۘۗۤۨۚۗۜۘۧۢۖۧۥۤۚۢۜۨۘۘۘۤۚ۫ۡۙۚۢۥۚ";
                                                    case 1571545582:
                                                        str13 = "۠ۤۜۛۛۥۘۜۤ۠۠ۘۜۘۢ۟ۡۘۦۧ۠۬ۘۢۚۡۨۘۨ۫ۜۘۨۘ۠ۘ۫ۚۦۚۚۖۛۜۘۖۛۜۧۖ۠ۛۥۘۘۘۚۤۛۤۦۘۘ۬ۘۘۥۗۘۘۤۡۜۘۥۧ۬ۚۖۛۙۜۨۙۜۥ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case -9268740:
                                            str13 = "۬ۤۦۨۧۢۥۙۤۨۤۗۖۧۡۖۜۘۢۡۡۗۧۜۗۗۥۗ۟ۛۙۥۗ۠ۡۙۡۗۢۖۨۡۗۦۘۤۖۨۡۙۥۥۥۢۚۙۚ۬ۦۘۖۨۗ۟ۖۦۘۤ۟۟ۚۥۨۘۥ۠۠ۢۜۤ۫ۥۤۗۤۧۚۨۥۘۛۥۙۖۨۗ۬ۦۡۘ۟ۛۖۘۡۦۜۜۦۢ";
                                        case 830455301:
                                            str12 = "ۨۡۦۘۖۢۥۘۨۧ۬ۘۤ۠۟ۨۖۘۛ۬ۜ۠ۨۧۢ۟ۦ۠ۡ۫ۜۦۛۖۜۚۘۙۚ۟ۤۧ۟ۢۘۘۥۨۦۘۨ۟ۘۘۗۨۜ۟۫۫ۨۥ۟ۙ۬ۡۥۚۚ۫۠ۖۜ۟ۛۦۢۢۙ۬ۢۡ۫ۘۛۢ۬۬۠ۤۡۜۖۧۦۘ۫ۧ۫۬ۤ۠ۖۤۦۘ۫ۖۜۘۥۥۘ";
                                            break;
                                        case 1891091557:
                                            str12 = "ۚ۟ۦۘۖۛۜۘ۫ۦۥۘۧ۠ۦۚۨ۠۬ۡۘۘۡۘۥۧۜۡۘۖۨۨۘۖۧۧ۟۟ۡۢۗۡۖۜ۟ۜۦ۫۬ۢۜۘ۠ۡۘۗۚۘۘۧۙ۟ۛۧ۟ۖۡۤۢۤۤۦۜۘۥ۠۟ۜۖ۟ۚۙۖۦۦۥۨۙ۫ۖۘ۠۬ۨۧۘۤۧۢۜۛۦۘۤۙ۟ۨۦۧۘ۠ۜۜۗۨ۫ۦ۫ۧۢۥ۫۬ۗۘۛۨۧۘۚۖۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 1884523240:
                    str = "ۘۧ۟ۙۘۦۘۡۚۡۤۘۥۘۢۜ۬ۚ۟ۜۘۖۢۖۧۙۡۤۙۧۖ۠ۥ۬ۚۗ۬ۨۖۘ۟۠ۗ۟ۖۢ۫۬ۨۗۧ۠ۥۚۜۘۘۙۢۖۘ۬ۨۨۘۙۦۧۖۢۡ۟ۗۢ۠ۗۘۦۛ۫ۚۙۚۛۙۡۡۘۢۢۘۜ۬ۚۙ";
                    continue;
                case 1914147120:
                    linearLayout.addView(textView);
                    str = "ۖۖۙ۟ۢۖۘۥۡۖۧۜۜۡ۠ۗۘۢۗۘ۟ۙۛۜۗۢ۠ۢۤۥۘۚۢۦۘۘ۬ۜۗۨ۫ۡۡۦ۟۠ۧۥۧۙۖۛ۠۫ۖۘۘ۟ۜۜۙۨۙۥۦۦۘۥۧۨۘۗۘۧۢۙۦۡۥۘۘۜۛ۠ۥۜ۬ۥۡۥۖۘۗۦۘۘۤۢۨۘۡۧۡۜۡۨۘۦۜۘۘۘۦۡۘ";
                    continue;
                case 1949060081:
                case 2032652982:
                    return;
            }
            str = "ۚۚۖۙ۫ۖۜۛۚۢۧۙ۬۠ۢ۟ۗۨۚۛۙۦ۟ۘۢ۬ۙ۬۟ۘۘۚۖۙۚ۫ۘۤۖۖۘۘۧ۟ۥۚۙۜۗ۠ۢۢۘ۬ۧۤ۬ۛۙۥۜۧۘۗۥۧۚۧۧۘ۟ۜۘۚ۠ۗۢۢۜۘ";
        }
    }

    public void exportSettings() {
        String str = "۬ۡۤ۬ۖ۠ۖۙۦۗۘۦۘۢۢ۠۬ۜۗۛۙ۬ۗۚۙ۫ۦۖ۫ۦۡ۟ۤ۫ۧۖ۫ۡ۬ۖۘ۫ۧۛ۠ۧۤۡۘۦۦۚۨۖۚۢ۫ۚۛۡۚۡۙۦۧۘۘۘۧ۫۬ۙ۟ۛۘۚۖۖۥ۫ۨۘۘ۟ۙۚۢۨۘۦ۠ۥۘۖ۫ۤۤۦۨۨۢۤ۟ۚۜۘ۠ۜۖۗ۟ۙ۬ۧۥ۬۠ۡ۠ۗۡۘۚۗۢ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 261) ^ 296) ^ 5) ^ 939) ^ 395) ^ 746) ^ 385) ^ 677) ^ 88) ^ 335) ^ 953) ^ 314) ^ 525) ^ 360) ^ 601) ^ 302) ^ 536) ^ 701) ^ 144) ^ 613) ^ 552) ^ 500) ^ 676) ^ 160) ^ 893) ^ 700) ^ 716) ^ 980) ^ 292) ^ 846) ^ 634) ^ (-1843357693)) {
                case -312459015:
                    Toast.makeText(this, getString(C0931R.string.str00c9), 0).show();
                    str = "ۛ۠۫ۖ۟ۛۧۨۖۘۢ۬ۥۤۥۘۗۡۦۙ۠ۦۨ۬ۦۘ۟ۦۚۘۡۘۜۦۢۧۚۜۘۚۚۥۚۥۧ۠ۖۨۘ۠ۜۘ۠۟ۧ۬ۚ۬ۖ۫۠ۖ۬ۜ۟ۥۨۢۨ۠ۡۨ۬ۧۖۛۙۥ۫ۖ۟ۦۤۢۖ۬ۘۦۘۨۨ۫ۖۘۜۘ";
                    break;
                case 435829022:
                    str = "۫ۜۢ۫ۦۙ۬ۤۗۗۖۖۚۚ۫۬ۦۜۘۦۗۢۢۙۥۥۚ۫ۥۨۥۘۘ۫ۤۦۛۘۘۗۜ۠ۢۡۥۘۧۚۚ۬ۢۙۗۚ۬۫۫۬۟۟ۦۘۘۧۖۘ۫۠ۦۘ۠ۚۨۘ۬ۨۤ۠ۤ۠ۘ۫ۨۘۖۖۙۧ۬ۖۦۜ۠ۦۥۥۘۥۢۘ";
                    break;
                case 775082651:
                    return;
            }
        }
    }

    public ApplicationInfo getApplicationInfoContainer(String str) {
        String str2 = "ۛۧۨۨۛۗۢۥۨۦۧۜۥۜۖۘۜۙۦۘ۬ۡۡۖۥ۬ۢۥۘۨ۬ۥۘ۠ۡۥ۫ۡۡۘۡۤۖۖۤۦۘۨۜۚۧۖۦۘ۠۫ۨۨۖۦۘ۠ۨۦۨۖۜۙ۟ۗۛۜۘۙۡۧۘۗۤۤ۬ۜۧۦۗۦۘۖۛۜۘۜۖۤۘۢۜ۟۟ۖ";
        while (true) {
            switch (str2.hashCode() ^ 857294346) {
                case -1757730598:
                    try {
                        BlackBoxCore.get();
                        PackageInfo packageInfo = BlackBoxCore.getBPackageManager().getPackageInfo(str, 0, 0);
                        String str3 = "ۚۦۢۛۤۗۥۤۛۙۦ۬ۗ۟ۖۘۖۦ۬ۖۛۜۖۗۢۢۗ۫ۧۙۤۥۢۢ۬ۦۖ۟ۥۥۘۗۚۧۖ۟ۘۛۘۦ۠ۤۥۦۖۦۘ۠ۤۢ۫ۡ۫ۚۛۧۢۨۘۦ۫ۡۘۡ۫ۥۧۡ۬ۤ۠ۢۚۖۥۜ۟ۡۘۚۚۧ۬۠ۨ";
                        while (true) {
                            switch (str3.hashCode() ^ 1964583573) {
                                case -1957498087:
                                    return packageInfo.applicationInfo;
                                case -1016533532:
                                    break;
                                case 937816455:
                                    str3 = "۟۫ۨۘۡ۫ۖۢۦ۫۬۟ۚۧۚۥۘ۬ۡۘۘۥۨۚۢۢۡۘۗ۬ۖۢۙۡۘۢۤۥۨۙ۟ۥۡۛ۟۬۫ۡ۫ۗۧۤۤۚۢۧۥۘۨۧ۬ۥۥۢ۟ۙۘۘۧۘۗۙۤۛ۠ۜۡۘ۟ۙۛۗۜۥۘ۟ۦۘ۟ۡۘۘۧۖۧۘ۬ۖۦۘۡۙۨ۬ۖ۬ۖۥۚۛۚۗۖ۠ۦ۫ۘۘۘ۠ۡۘۛۢۧۖۗۚۥۖۢ۬ۧۘۜۧۨۧۛۦ۫ۖۗۢۗۢ";
                                    break;
                                case 1514320935:
                                    String str4 = "ۛۛۖۖ۠ۛ۟۟ۤ۠ۢۢ۠ۗۡۖۡۥ۬۠ۦ۫ۖ۟ۖۖۦۘۧۥ۟۫ۗۨ۠ۤ۬ۙۨۧۙۙۗۧۤۧۤۨۜۨۚۢۚ۟ۦۘ۫ۨۧۖۛۘۘۜ۠ۥۘ۫ۗ۟ۤۘۨ۟ۡۨۤۚۖۢۚۥۚۢ۟ۢۢۜۤۛۜۘۜۥۘ۫ۗۦۙ۟ۡۘ۠۫ۘۘۥۨۨۘۡۦۙۨ۬۫ۡ۟ۚ۬۫ۦۙۧ۟۟ۖ۬";
                                    while (true) {
                                        switch (str4.hashCode() ^ 1727289943) {
                                            case -622077245:
                                                str3 = "۟ۧۙۘۙۛ۟ۥۦ۫۫ۖۗۥۥۤۛ۟ۢۨۗۚۚۢۘۦۢۜۚۚۚۖۘۡۚۧۚ۟ۜۗۨ۟ۥۙۥۘ۠ۦۦۘۘ۠ۥۘۧۗۛ۫ۛ۫ۙۥۨۘۙۡۧۘۙ۫ۨ۫۟ۨۘۦ۠ۖۧۢۦۘ۠ۖۘۘۢۛۡۙۖ۫ۛۡۦ۬ۛۤ";
                                                continue;
                                            case 745691670:
                                                str4 = "ۢۧۡۘۡۘۖۛ۠ۖۘۜۢ۠ۛۤۚۤۢۨۘ۟ۙۦۘۡۛ۠۫۠ۙۛۨۘۢۨۚۤۖۘۗۗۦ۫۫ۨۘۘۡۙۜ۟ۜۘ۬ۧۦۦۨ۬ۘۨۘۘۗۘۘۡۦۛۤۘۖۘۗۖ۫ۥۜۥۡۡۤۤۢۘۚۙۚ۫۫ۧۖۡۖۨ۠ۛۚ۫۟ۗۨۢ۟ۧۙۘۦۛۤۚۦۘ";
                                            case 921941747:
                                                str3 = "۫ۢۜۘۗۘۨۘۚۤۚۡۧۥۜۙۗۢۜۧۢۚ۟ۖ۬ۜۚ۬ۧۗ۟۫۟ۤۦ۟ۡ۠ۡۦۦۤۚ۬ۙۢ۟۫ۙۜۡ۬ۗۗ۠ۗ۫ۡۚۦۗۜۖۜۤ۟ۧۖۘۘ۬ۖۦۘۧ۫ۜۘ";
                                                continue;
                                            case 1263914435:
                                                String str5 = "ۧۦۘۘۦۥۛۧۥۛۙ۫ۢۥۥۡۛۙۤ۠۬ۚۡۦۘۥۢۚۙۤۡۡۖۧۘۢۦۘۘۖ۠ۖۥ۬ۖۜۤ۬ۛۤۖۘۗۦۙۧ۟۫ۘۘۘۘۘ۠ۡۘۛ۫ۨۘۥۘۖ۬ۘ۠ۦ۠ۘۚ۬ۙۧۨۘ۠ۛۥۘۤۡۥۘۥۥۖۦۜۢ";
                                                while (true) {
                                                    switch (str5.hashCode() ^ (-651369048)) {
                                                        case -1177636983:
                                                            str5 = "ۛ۫۬ۜۗۜۘ۟ۖۙۡۤۦۚ۟ۧ۠۫ۥۥۧۡۨ۟۟ۧۛ۬ۜ۟ۛۢۛۧۡۖۧۘ۬ۙۘۘ۫ۦ۟ۨ۠ۦۘۛۤۖۘۘۙ۟ۧۜۡۜۖۡۘۦۧۜۗۛۙ۫ۢ۟ۚ۬ۜۘۨۜۧۗ۫ۘۘ۟ۥۡۘۨۚۨۘۚ۫ۧۖۨۧۘ۟ۛۜۘۛۢ۫ۢۤ۟۠ۤۤۨۜۙۙۢ۟ۖۧۘۚ۟ۘۦۗ۠ۘۙۥۙۢۦ۫۬ۨۢۡۘۛۦۨۘۜۘۛۤ۠";
                                                        case -1085834894:
                                                            String str6 = "ۦۡۦۘۥۡۢۖۤ۟ۥۧۨ۬ۘۖۘۧۢۜۡۨۗۜۛۖۘ۫ۜۧۙۥۘۚۦۡۘۤۖۘۧۢۦۘۜۡۘۘۧۛۤ۟۫ۚ۠ۨۦۘۖۜ۬۬ۚۢۨ۬۫ۤۚۥ۬ۛۨۦ۬ۦۡۘۘۜۤۤۖۢۡۙۘۘۢ۫ۖۘۥ۬ۢۡ۟ۨ";
                                                            while (true) {
                                                                switch (str6.hashCode() ^ (-1223140677)) {
                                                                    case 361395318:
                                                                        str5 = "ۙۖ۬ۖۘۙۜۚۡۘۦۜۦۘۥۥۜ۟۬ۘۘۗۗۡۤۚۜۘۘۗ۫ۚۤۜ۠۟۟ۚۗۘۢۦ۫ۦۦۜ۠۟۫ۦۥ۫۟ۛۚۜ۠۠ۧۘۦۙۨۡۡۡۘۗۜ۫ۨۜۘۘۖۖۤ۟۠ۢۥ۠ۘۘۤۨۧۢۚۜۘۗ۠ۥۘۦۨۗۙ۬ۧۘۢۛۗۢۜۗۡۢۛۧۡۘۧۖۢ۟ۢۙۧۙۜۚ۠ۛۦۢ۟ۙۙ۫۬ۨۨۖۛۚۗۨۘۙ۫ۘ";
                                                                        break;
                                                                    case 1015529402:
                                                                        String str7 = "ۧۗ۫ۡ۬ۨ۫ۦۖۘۙ۬۫۠ۖۗۛۘۙۦۚۜۘۡۙۡۘۛ۫ۚۢۥۥۚۖۡۘۖۙ۫ۗۖۧۘۥۚۙ۠۟ۨۜ۫ۘۡۗ۬ۢۤۦۘۤۚۖۘ۠ۧۙ۟ۨۜۧۦ۠ۦۘۖۨۦۙ۬ۙۜۗۢ۬ۡۘۘۦ۠ۖ۫ۚۛۧۙۦۘ۫ۢۥ۬ۜۨۖۘۡۥۤۛۚۢ۠ۧۦۨۘۜۘۡ۟ۥۘۤۚۙۦۚۛۘۖۘۘۧۨۚۧۖۜۛ۠ۢۦ۬۬";
                                                                        while (true) {
                                                                            switch (str7.hashCode() ^ 1811382954) {
                                                                                case -1972233073:
                                                                                    str6 = "ۜۗۡۘۘۜۖۘۢ۠ۤۨۜۖۘۖۢۙۡۚۨۘۤۘۦۧۙۥۘۚۨۥۘۘۡۡ۫ۚۙۙۙۘۢ۟ۘۨۘۗۛۘۧۥۤ۬۠ۜۛ۠ۤۤۖۘۦۖ۟ۘۜۘۜۖۘۦ۟۬ۖۡ۫ۢ۬ۡۘۡۧۡۘۨۜۖۚۧۡۗۘۚۦ۠ۡۨۦۡۙۡۜۘۚۤۜ۠ۚۢۥ۫ۘ۠ۤۦ۟ۖۡۘۦۢۡۘۛ۠۠ۗۨ۬ۢۗۚ۬ۛ۟ۛۘۨۘۤۚۙۗ۬";
                                                                                    break;
                                                                                case -1378756638:
                                                                                    str7 = packageInfo != null ? "ۙۙۨۘۗۨۨۥۢ۠۠ۚۤۧۤۙ۫ۜۦ۬ۜۘ۟ۤ۟ۖۦۨۘۙۙ۬ۥۚۡ۠ۚۥۘۡ۬ۘۘۤۧۗۘۢ۬ۜۖۘۨۚۙۡۛۜۘۧۤۘۜۙۦ۫ۤۤۢۗۤۧۦۗۖۛۥۧۘ۫ۜۢۗۢۤۡۛۚۡۚۜۨۧۥۘۤۡۘۘۜۨۡ۠۠ۦۘۖۨۦۚۚۧۘۦۡۦ۠ۥۘۢۖۘۙۘ۠ۛۜۨۘۡۧۚۖۙۥۘۖۖۜۘۢ۬۟ۚۘۖۘ" : "۬۟ۘۛۢۛ۬ۧۚ۫ۛۥۜۗۘۘۜۨۙۥ۬ۚ۟ۤ۬ۧ۠ۗۤ۫ۢ۬ۡۡۙۛ۬۠ۤ۫ۙۙ۬ۦۤۜ۫۠ۡۘۙ۟۠ۙۗۙ۠۟ۡۤ۟ۦۤۖۘۧ۬ۦۘ۬۠ۚ۟ۨ۟ۘۨۡۘ۟ۨۗ۫۫ۗ۠ۛ۟ۖۜۜۘۖ۫ۡۘ";
                                                                                case -1340095828:
                                                                                    str7 = "۬ۤ۟ۦۚۖۘۤۨۙۖۘۧۢۢۥۘۚۛۘۘۜ۬۫ۜ۬ۡۜ۫ۛۥۘۨۨۧۢۡۦۖۘۤۧ۠ۤ۬ۘ۫ۢۚۦۜۡۖۘۘۦۢۛۛۧۥۢۙۦۢۧۖۘۥۖۨ۫ۗۜۘ۫ۥۨۘۙۛۨۘۙ۟ۥۦ۟۠ۜۥۤۨ۫ۢۗۢ۬";
                                                                                case 1115831074:
                                                                                    str6 = "ۜۨۦۘ۫ۤۙۤۚۜۘۥۥۤۨ۟ۜۘۙۘۥۜ۬ۘ۠۬ۚۤۡۗ۬ۙۘۗۙ۠ۖۘۥۡۧۢۥ۟ۘۛۜۘۦۦۙۤ۫ۤۖۜۘ۟ۙۜۥۢۜۚ۫ۜۜ۟ۘۖۨۤۙ۬ۦۘۛ۬ۤ۬ۤۤۛۛۚۜۡۥۘۢۘۛۘۛۥۗۗۨۘۘۦ۫ۡ۟ۗۨۖۨۘۘ۬ۨ";
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 1297522743:
                                                                        str5 = "ۨۨ۟ۘۥۘۨۙۦۖۘۜۘ۫ۨۥۘۖۚۖۘ۫ۖۧۗ۬ۘ۠ۢۦ۟ۖۤۜۨۨۘۗۛ۬ۥۘۥۦۤۢۥۤ۬۫۠ۦۜۦۜ۟۫ۖۖۖۘۥۘ۬ۧۢۜۚۖ۫ۙ۬ۧۧ۬ۦۘۧۤۧ۬ۗۨۘۧۖۥۚۙ۟ۢۥۘۢۜۨۘۚ۬۟ۦ۫ۨۧۡۖۘۡ۟ۛۘۧۘۡ۬ۖۨ۬۬ۧۢۖ۠ۗۢۢۙۜۨۨۚۧ۟ۥۥۥۡۢۡۧۧۙۘ";
                                                                        break;
                                                                    case 1672162623:
                                                                        str6 = "ۖۙ۠ۡۨۥۤۖۘۥۤۡۘ۬ۤۡۢۜ۬۠ۤۗۜۖۥۖۚۤۗۗۗۛۙۖۘۘ۟ۜۖۜۖۙۥۧۘ۬ۦ۟ۡۥۢۡۘ۟ۜۖۖۖۤ۟ۖ۫ۥۡۥۘۘۗۥۦۥۚۤۘ۫ۙۤۦۚۗۜۨۖ۠ۥۨۦۘۛۜۘۧۜۢۧۜ۠ۥۜۥۤۥ۟ۖ۠ۦۡۗۖۘ";
                                                                }
                                                            }
                                                            break;
                                                        case 878448807:
                                                            str4 = "ۖۨۖۡۛۘۥۚۨۘۦۦۡ۟ۙۜۘۚۥۥۘۤۧۡۙۥۦ۟ۚ۬ۗۖۤۢۦۖۖۙۙۥۙ۠ۤ۟ۥۨ۫۫ۜۘۨۗۡۘۗۛۜۜۥ۠ۖ۬ۙۨ۟ۦۘۥۢۜۧ۟۟ۤۡۛۤۘۦۘۥۧۗۖۛۥۘۜۚ۟۬ۧ۬ۖۨۙۦۗ۫ۤۥۥۧۚۘ۬۟ۨۚ۫ۧ";
                                                            break;
                                                        case 1980939865:
                                                            str4 = "ۘۡۦۜۚۢۜۛۘۗۡۤۜۛۨۦۜ۠ۡۙۜۡۙ۫ۖ۬۠ۗۜۘۛۥۢۤ۟ۨۖۥۥۘۧۢۖۧۖۥۘۘۢۜۛۖۡۚۦۘۚ۬ۖۥ۠ۘ۠ۚۨۗ۫ۡۘۛۤۘ۟ۦۦ۬۠ۙ۠۬۬۠ۢ۬ۧۤۚۜ۠۟ۚۤۢۥۘۦ۠ۢۛ۬ۗۧ۠ۨۘۨ۫ۙ";
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return null;
                case -442223414:
                    return null;
                case 1251118612:
                    str2 = "ۥ۬ۘۘۦۥ۫ۨۢۡ۟ۘۤۥۦۜۘۡۥۡۘۘۧۜۘۢۤۜ۬ۚۧ۠۟ۜۘۥۜۜۡۤۨۘۨ۫ۨۘۖۚ۬۬۬ۡۘۗ۟ۢۖۡۘۘ۠ۜۡۘۘۤۥۢۥۘۘۧ۟ۘۚۡۘۘۧ۫۠ۥ۟ۚۥۙ۠ۡۚۨۡۨۤۛۛۡۖۚ۠ۢۖۘۘۛۚۖۙۡۘۧۗۖۘۚۚۙ۠ۘۘۤۨۤۖۦ۫ۘۤۤۗۧۧ۟ۤۥۘ";
                    break;
                case 1475865188:
                    String str8 = "ۡۥ۬ۡۥۜۘۧۧۥۛۜۜۡۥۥۘ۠۫ۗۛۙۖ۟ۛۢۙۘۗۥ۠ۘۘۥۢۥۡۘۖ۟ۦ۠ۥ۟ۜ۟ۚ۫ۨۜۘۘۖۜۦ۠ۦۚۗ۫ۜۡۜۘۦ۟ۘۢۦۙۗ۠ۚۗۨۘۘۦ۬ۢۧۨۖۚۚۨۘۤ۬ۦۘۦۤۦۘۦۗ۫۬ۤۦۘ۬ۨ۬ۜۗۦۘۜۜۤ۠ۗ۟ۘۧ۟ۦ۟ۜۘ۬۠ۨ۫ۤۘۙۥ";
                    while (true) {
                        switch (str8.hashCode() ^ 2129480987) {
                            case -1421026556:
                                String str9 = "ۢۚۜۙۖۡ۠ۚۛۙۧۢ۟۟ۤۡ۫ۦۘۥۙۤۡۢۨۘۤۚۡۜۖ۬ۤۤ۬۫ۚۡۘۗۧۜۘۜۙۥۧ۫ۢ۟۟ۘۦۙ۬ۗ۠۫ۗۧۡۘۨ۬ۡۘۚۡۛۢۤ۟ۧۖ۫ۦ۟ۡۘۦ۫ۖۡۙۦۥۥۖۘۨۗۧۗۥۘۢۧۤ۠ۥۖ۫ۖۘ۠ۘۗۗ۬ۜۚۢۡۘ۬ۥۖۡۗ۬ۙ۬۟۠ۙۜۨۗۢ";
                                while (true) {
                                    switch (str9.hashCode() ^ (-521893849)) {
                                        case -949487423:
                                            str8 = "ۦۢۥۘۡۧۧۢۖۦۜۧۥۘۢۦ۬ۘۥۡۤۢۛۘۢۥۦۡۖۘۥۘۧۘۡۙۨۘ۬۫ۖۘۛۤۘۚۦۘۢ۟ۨۛۥۘۧۢۤۚ۠ۡۧۚۡۨۖ۫ۤۗ۫ۨ۠ۚۚ۟۫ۙۘۙۘ۫ۥ۟ۡۘۚۢۚۦۢۤ۠ۤۚ۠ۢۡۘۜۛۧ۫ۢۖۘۘۢۖۘۖۥۨۘۘ۫ۨۘ";
                                            break;
                                        case 1086978508:
                                            String str10 = "ۨۜۢۚۖۛۡۚۧۙۤۙۥۨ۠ۢۜۡۘۖۧۦۧۜ۟۠ۜ۠ۧۘۤ۬ۧ۬۬ۨۡۗۨۘۚۚۚ۫ۘۨۜ۠ۘۜۘ۬۫ۥۘ۟ۖ۟ۘ۟ۖۧ۫ۨۦۗۘۘۦۦۖۘۜۘۨۘۚۦۚ";
                                            while (true) {
                                                switch (str10.hashCode() ^ (-513279110)) {
                                                    case 465991323:
                                                        String str11 = "ۚۛۡۖۘ۬ۛۜۧۘۢ۠ۤۗۙۦۡۢۖۘۥۧۡۦۛۦۨۡۨۘۙۗۗ۠۫ۨ۫ۦ۫ۡۡۦۘۙ۫۬ۡۡۜۢۙۡۗۛۨۗ۫ۡۘۥۖۛۦۜۧۗۤۡۘۢۘۡۖ۬ۖۘۥۚۘۡۚ۟ۜۛۛۘۥۛۡۛ۫ۚۦۦۘۡۥۤۛۗۗ۠ۧۙۨۗۖۚۦۘۧۚۥۘ";
                                                        while (true) {
                                                            switch (str11.hashCode() ^ (-96860996)) {
                                                                case -290290041:
                                                                    str10 = "ۨۢ۟۬ۦۧۘ۠ۘۤۘۨ۫ۗۤ۫ۧۤۜۘۜ۬۫ۖ۠ۦ۠ۙۙۚۛۛ۠ۖۘۗ۟ۘۗۢۦۙ۫ۡۢۜۖۧۛۤ۟۫ۖ۠ۧۨۨۜۥۘۨ۫ۗۙۨۦۘ۟ۗۜۧۤ۠ۚۘ۠۬۠۠ۖۨۘۦۢۧ۟ۨ۟ۜۘۡۡۘۧۘۤ۠ۖ۫۟ۚ۬ۚ۬ۖ۫ۦۘ۬ۨ۫ۖ۠ۛۘۘۦۘۧۗۘ۫ۢۖۖۘۨ";
                                                                    break;
                                                                case 128196783:
                                                                    str11 = !isInstalled(str) ? "ۗۡۥۚۦۖۘۚۦۤۜ۫ۧۧ۠ۜۘۗۗۛۨۦ۟ۖۛۨۧۘۙۗۖ۟۬ۗۥۖۚۜ۟ۥۖۧۖۘۡۤۨۘۦ۟۬ۗ۫ۡۡۖۙ۟ۛۛۖۧۖۘ۟ۚۧۛۜۘۙ۫ۦۘۦۡۖۜ۬ۨۗۥۛۡۦۦ۬۫۟ۨۜۖۨ۬ۥۡۘۘۘۦۜ۫ۗ۠۟ۛ" : "ۤۢۥۘ۬ۜۘۘۡۜۨۘۢۜۧۗ۫ۗ۠ۥۥۦ۟ۦۗۡۛۦۧۡۘ۫ۨۦ۟ۖۘۘۚۗۡۘ۠ۜۖۘۖۧ۠۠ۥۜۘۡ۠ۖۘۛۢۨۘۖ۫ۖۨۥۘۢۗۚۧ۫۬ۖۗۙۗ۟ۜۤۗۤ۠ۡ۫ۦۘۖۘ۟۬ۥۦۖۜ۬ۡۘۜۚۤۥۙۙ۠۬ۢۧۚۢ۟ۘۜۘۢۜۖۘۧ۬ۗۜۨۧۖۛۦۘۦۜۥۘۢ۠ۤ";
                                                                case 246757457:
                                                                    str11 = "ۛۗۛ۠ۙۥ۠۬ۤۨۧۘۖ۠ۙۙۗ۠ۡۚۥۚۚۢۧ۫ۜۛ۫ۗۥۖۘۥۥ۫ۛۖۜۘۤۜۖۘۤ۫ۦۘ۬ۛۨۘ۫ۦۡ۠ۨۙ۟۟ۧۜۥ۟ۨۧۢ۟ۜۘۖۚۡۖۡۜۘۚۢ۫ۦ۟۬ۡۘ۬ۢۘۢۤۙۥۘۡۦۘۛۚۙۗۜۘۛۧۨۘۦ۠ۨۚۦۥۘۨۛۡۘ۠ۛۛ۫۠۟۬ۚۚ۟ۦ";
                                                                case 711563120:
                                                                    str10 = "ۛۖ۟۠ۛۜۜۙۘۤ۠ۜ۟ۦۘۘۧۛ۬۬۬ۜۚۚۡ۠۬ۗۡ۫ۥۘۤۤۚۥۛۥ۟ۗۘۜۢ۫ۖۢ۠ۗۗۨ۟۫ۨۘۖۗۚۗۦۘ۬ۧ۫ۥۨۖۘۚ۠ۘۘ۫ۧۨ۟ۙۜۘ";
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 1524105807:
                                                        str10 = "ۢۚۡۘۜۗۡۘۗۙ۟۫ۧۡۘۘۥ۠ۡۤۦۘۚ۠ۦۘۖ۬ۜۘۡۙۙۥۢۦۘ۬ۗۨۘۦۥۥۘۢۛۚۦۜۙۧ۫ۦۘۨۧ۟ۘۦۗۨۢۛۡۖۖۚۦۤۙۨۤۖۜۘۘۚۤ۟ۢۧۧ۬ۢۘۘۡۖ۬ۨۙ۫۫ۙۗۘۡۤۦۥ";
                                                    case 1913458223:
                                                        str9 = "ۘۚۡ۬ۜ۫ۨۖۙۖۖۜۘ۬ۡۤۧۜۨۚ۬ۜ۬ۜۖ۟ۜۥۘ۫ۗ۠۬۠ۨۘ۟ۗۗۦ۟۟ۦۤۖۘۜ۟ۖۘۨۨ۟۟ۚۨۘۢ۠ۚۖ۠ۥۥ۬۟ۦۢۨۘ۬ۥۧۘ۟ۘۖۧۨۘۛۤۢ۬ۗ۟ۘ۬ۨۨ۠ۨۥۡۛۡۡۗۛۚۥۨۙۧۘۖ۫ۢۦۦۘۤ۟۟۟۫ۥۨۤ۠ۙۛ۬ۛ۠ۖۘۛ۬ۡۘ";
                                                        break;
                                                    case 1914526991:
                                                        str9 = "ۦۢۨۘۜۦۥۘ۫ۢۢۡۧۨۨۦۤۨ۫ۗۙۥۧۗۚۢۨۗۨۥۗۡۘۛ۟ۜۘۥۙۤۢۛۘۦۢ۫ۡۤۜۘۦۘۘۘۢۨ۠ۘۨۡۘۧۢۤۥۙۛۤۖ۟ۖۙ۫ۙۦۢۛ۬ۥۛۨۦۘۚۜۙۦۚ۫۟ۨۡۛۥۗ۫ۛۦۛۨۖۘۦۚۜۗۨۛ۬ۙ۠۟ۢۨۘۜۢۦۘۧۗۥۚۢۜۘۡۜۙۥۤۤۜۚ۟ۙۚ۬ۚ۟ۦۧۚۨۘ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case 1164236986:
                                            str9 = "ۥۨۚۥ۬ۗۗۨۨۘۘۡۜۡۥ۬ۢ۠ۛۚۘۦۘ۬ۛۡۘۚۢ۫۬ۥۨۘۤۛ۬ۦۛۢۥۦۛۧۜۥ۫ۦۖ۠ۢۗۡ۠ۧ۬۫ۧ۟۠ۖۤۥۨ۫ۧۘ۫ۙۙۗۘۦ۠ۖۘۚۦۨۘۢۨ۟۟ۜ۫ۜۢ۬۟ۨۧۘ۫ۥۖ۠ۢۖۦ۫ۤۦۗۥۡۤۗۗ۠ۖۘۘۡۘۧۚۛۜ۟ۦۨۨۚۜۧۜ";
                                        case 1226751255:
                                            str8 = "ۛ۫ۖۥۛۡ۫ۛۖ۠ۧۦۘۖ۠۟ۛۚ۬۫ۙۚۖ۫ۡۘۛۨۡۜۦۦۘۥۚۙۙ۠ۘۘۡۗۦ۫۟ۚۨ۟ۨۘۘۙۢ۫ۙۗۖ۠ۦۡ۠۠ۦۨۧۘۦ۫ۦ۠۠۬ۧۨۗۦۢۨۖۥ۟۟ۚۙۙۢۧۚ۬ۙۥ۟ۜۗۢۖ۠۬ۥۗۤۦۧۨۦ۫ۖۘۤ۬ۛ";
                                            break;
                                    }
                                }
                                break;
                            case -859714432:
                                str2 = "ۛ۠ۦۘ۠ۡۘۘۙۢۦۘۙۙۜۘۛۤۡۖۙۛۘۡۘۘۤۜۗۘۨ۫ۨ۟۟ۢۥۚۥۨۘۜۛۙۚۡۙ۟ۨۖۘۙۧۚۤۨۤ۫۬ۧۨۖۜۘۚۙۜۢۜۧۘۥۖۥۘۙۧۘۘۗۜۨۘ۫ۧ۠۬۟ۦ۬۫ۦۘۛ۫۬ۥۤ۫ۖۘۥۦ۟ۡۡ۠۬۬ۘ۬ۙۘ۫ۖۘۧۖۙۡۛ۫ۛۜۜۘۛۤۥۘ";
                                continue;
                            case 166539568:
                                str2 = "ۧۢۦۖۖ۫ۨۧ۟ۚۧۗۥۦۦۘۖ۟ۖۘۜۖۧۘۧۖۙۧ۠ۖۗۦۖۘۜۘۦۘۧۦ۫ۤۢۦۖۙۜۡۗۜ۫ۖۚ۫۠ۡۧۗۥۖۥۦۡۖۜۘۢۦۙۗ۬ۘۧۚۥۘۦۡۨۘ۟ۖۤ";
                                continue;
                            case 446680279:
                                str8 = "۟۟ۡۡۜۥۘ۫ۛ۠۬ۨۧۥۙۙۖۙۤ۟ۖۨۖۡۤۛۘۢ۠۫ۙۙ۟ۙ۬ۢۢۤۘۘۚۨۜۘۥۦۧۘ۬ۗۦۘ۟ۡ۬ۖۢۦۗۥ۠ۖۤۨۘۚ۫ۚۜۨۘ۟ۙۧۥۜۛۦۦۤ۟ۨۜۘۤۥۦۦۜۛۡ۫ۚۘۖۜ۠ۖۡۘۛ۬۟ۤۚۥۜ۟ۖ۟ۧۖۤۨۧ۟ۧۦۦۡ۠ۛۖۥۜۙۨۨۧۦۢۧۦۗۤۦۘۚۖۦۛۡۚ";
                        }
                    }
                    break;
            }
        }
    }

    public LinearProgressIndicator getProgresBar() {
        String str = "ۜۡۥۘ۬۠ۜۘ۟۫ۜۘ۟ۡۡۘۨۥۥۥ۬۬ۛۤۘۨۗۘۖۖۘۡۜۖۘۥۘۥۘۚۤ۟ۧۗ۫ۨۘۗۗۥۧۘۦۘۛ۫ۘۗ۠ۜۜ۟ۨۘۦۘۗۥۢۜۘۛۖۖ۫ۖۡۘۗ۟ۘۘۚ۫۬ۧۦۡۘۧۗۖۘۨۜۧ۠ۙۤۤۗۛ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 933) ^ 345) ^ 111) ^ 231) ^ 189) ^ 165) ^ 170) ^ 456) ^ 711) ^ 952) ^ 781) ^ 315) ^ 839) ^ 386) ^ 305) ^ 460) ^ 76) ^ 323) ^ 878) ^ 287) ^ 853) ^ WebSocketProtocol.CLOSE_NO_STATUS_CODE) ^ 356) ^ 17) ^ 803) ^ 446) ^ 77) ^ 959) ^ 948) ^ 207) ^ 123) ^ (-65205963)) {
                case -1583458985:
                    return null;
                case -321554401:
                    str = "ۗۡۖۨۡۧۘۡۘۖۚۤۥۧۜۡۥۥۘۖۖۤ۫ۨۨۘۖۘ۠ۤۦۘۦۗ۟ۙۡ۬ۧۙۜ۠ۜۜۘۙ۠ۡۖۥۜۘۡۜۘۘۜۖ۠ۗۛۚۡ۫ۦۥۨ۠ۤۦۧۥۖ۟ۙۢۛۦۘۖۘۤۥۘۙ۠ۥۘ۫۬ۧ۬۟۠ۦ۟ۥ";
                    break;
            }
        }
    }

    public void handleGameAction(String str, MaterialButton materialButton, TextView textView, String str2) {
        String str3 = "ۡ۬ۚۧۥۡ۬ۥۥۢۛۨۘ۫ۥۖۚۛۧ۠ۗۦۧ۟ۥۦۧۘۘ۟ۡ۫۬ۤۜ۟ۤۦۦۧۛۚۥۘۗۙۚۗۗۤۘۖۤۤۨۜۥۚۗۛ۠ۘۘۙۡۘۤ۫۟۬ۚۜۥۗ۟ۧۢۡۙۘۗۗۧۛۦۘۧۘۖۧۗۨۘۘۘۘۘۦۥۡۚۨۗ۬ۤۤۤۢۘۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str3.hashCode() ^ 302) ^ 922) ^ 332) ^ 354) ^ 346) ^ 400) ^ 108) ^ PointerIconCompat.TYPE_NO_DROP) ^ 406) ^ 847) ^ 470) ^ 61) ^ 950) ^ 349) ^ 91) ^ 663) ^ 739) ^ 917) ^ 524) ^ 56) ^ 823) ^ 150) ^ 72) ^ 944) ^ 969) ^ 84) ^ 102) ^ 446) ^ 440) ^ 330) ^ 540) ^ (-828992317)) {
                case -1882847952:
                    str3 = "ۡ۫ۥۚ۬ۢۜۤۘۘۘۜۖ۟ۥۛۨۜۨۗۦ۠ۘ۟ۤۧۡۘۥۖۜۧۤۨۘۖۖۘۘۢ۬ۥۘ۫ۙۤ۫۬ۚۜۖۢۖۙۧۢ۠ۜۥ۟ۡۧۜۨۘۥۖۧ۟۠ۥۘۥۡۘ۬ۛ۠ۦۧۘ";
                    break;
                case -1794875518:
                    launchApk(str);
                    str3 = "ۨۗۡۘۙۤۘ۬ۡ۫ۥۨۨۘۡۨۚۙ۟ۖۙ۠ۖ۟ۜۥۘۘ۠۫ۥ۫ۖۥۗۚۢۡۗۜۤ۫ۛۤۛۢۖۡۤ۫۟ۨۥۗۜۢ۠ۛۨۛۙۨۘۘ۟۬ۗۥۗۨۘۛۗۖۖۥۗۚۖ۠ۙۘۘۨ۟ۧۥۧۘۦ۟ۖۛۙۨۘۜۡ۬۫ۚۨۦۜۜۧۨۦۧۛۨۘ۫ۦۡۘ۫ۙۘ۫۠ۧۢ۠ۧۚۦۢ";
                    break;
                case -1468728233:
                    str3 = "ۤۙ۫ۘۦۥۘۦۗۡۘ۟۠ۡ۟ۛۖۛۚۨۘۗۛۜۘۚۖ۫۫۟ۘۡۗۛۦۘۙۨ۟۟ۢۦۜۚۖۡۘۦ۠ۧۜ۫۫ۥۤۖۦۛۥ۫ۘۦ۟ۚۖۘ۠ۛۥۜۡۗۛۢۖۢۙ۟ۖۤۦۘ۫ۛۥۨۚۥۙ۟ۡۘۧۦ۠ۛۤۜۙۘۤۙ۠ۦۘۨۖۛۡۚ۫ۙۛۥۘ";
                    break;
                case -1315227159:
                    str3 = "ۚ۬ۥۥ۬ۡۧۢۗ۬ۚۘۚۘۨۘ۟۬ۛ۬۟ۙۤۦۚۘ۫۫ۛۛۧۦۡۤۦ۠ۗۜۛۘۖۡۜ۬۫۬۠ۡۤۡۘۥۘۙۨۡۘۤ۠ۦۘۘۨۨۙۖۜ۬ۥۖۘۨۜۙ۫ۡۛۡۘ۫ۗۧۗۡۢۖۢۚۡۥۖۙۦۨۤۢۖۨۘۚۥ۫ۧۦۧۘۛ۠ۛۚۧۧۥۧۨۘۖ۟ۡۡۥۚۦۧۘۘۨ۫";
                    break;
                case -976936266:
                    installGameWithObb(this, str);
                    str3 = "ۚ۬ۥۥ۬ۡۧۢۗ۬ۚۘۚۘۨۘ۟۬ۛ۬۟ۙۤۦۚۘ۫۫ۛۛۧۦۡۤۦ۠ۗۜۛۘۖۡۜ۬۫۬۠ۡۤۡۘۥۘۙۨۡۘۤ۠ۦۘۘۨۨۙۖۜ۬ۥۖۘۨۜۙ۫ۡۛۡۘ۫ۗۧۗۡۢۖۢۚۡۥۖۙۦۨۤۢۖۨۘۚۥ۫ۧۦۧۘۛ۠ۛۚۧۧۥۧۨۘۖ۟ۡۡۥۚۦۧۘۘۨ۫";
                    break;
                case -536792231:
                    String str4 = "ۗۨۦۘۥ۫ۖۘۢۨۢۚۤ۟ۘۡۢۧ۟۟ۚۙ۠ۖۢ۬ۖ۟ۘۘۨۛۢۦۖۘۢ۫ۙۦ۟ۦۘۜۤۨۥ۟ۜ۟۫ۢۗۥۦۘۚۢۦۜۡۘۘۛۦۨۘۦۥ۟۟ۛ۟۟ۖۢۦۦۦۘۖ";
                    while (true) {
                        switch (str4.hashCode() ^ 1312410691) {
                            case -1970768339:
                                String str5 = "ۛۧۛۤۘۖۢۧۥۘۚۦۗۛۢۨۘۛۗۙۖ۟ۘۘۢ۟۠ۖ۫ۥۘ۫ۗۧۥۧۖ۠ۥۘۗۚۨۧۧ۟ۧ۬ۤۥۛۥۘۦۘۨۘ۫ۘ۫ۘۘۚۘۘۘۘۤۜۘۢۗۙۗۡۘ۠ۜۦۙۚۘۘۧۙۘۥ۫ۤۤۖۚۜۙۘۖ۬ۦۘ";
                                while (true) {
                                    switch (str5.hashCode() ^ 1480038706) {
                                        case -1573242219:
                                            str4 = "ۥۚۡۘۨۚۦۤ۬۫ۗۖۢۤۥۙۡۤ۟۬ۙ۠ۘۥۘۗۥ۟ۗۧۙۡ۠ۘۘۢۘۢۢۛۢۦۘۨ۬ۘ۫ۗۦۡۘۜۡۦۘ۬ۚۚۨۛۗۜۛ۫۠ۧۢۥۥۛۢۧۧ۟۟۫ۚ۬ۛۘۥۜۥ۫ۗ۬۫ۥۢۗۦ۫ۨ۬ۗۘۖۘۦۖۢۢۦۖۜۗۧۦ۬۬ۥۗۨۧۛۡۘۖۢۨ۟۫ۗۡ";
                                            break;
                                        case -900546640:
                                            String str6 = "۬ۛ۟ۦۛۥۛۛۘۘ۠ۜ۠ۙۜۦۘۢ۫ۢ۟ۖ۬ۗ۫ۜۘۚ۫ۖۧ۫ۨ۬ۖۥۘۢۚ۠ۢ۫ۡۨ۟ۗۧۖۘۥ۬ۜۨۦۗۥۙۜۛۧ۬ۦۜۧۘ۟ۘ۟ۜۦۡۘۧۛۢۘۧۜۥۘۙۦ۠۫ۚ۟ۗۖۘ۬ۚ۬ۗۤۘۘۥۡۖۢۘۨۘۖۤۗۗۤۙ۠۟۫ۚۢۗۨ۫ۧۧۜۛۦۛ۟ۙ۠ۤ";
                                            while (true) {
                                                switch (str6.hashCode() ^ 1319403983) {
                                                    case -1003431498:
                                                        str5 = "ۙۗۖ۠ۚۥۘۦۛۙۚۨۜ۫ۥۘۘۨ۠ۥۘۦۦۥۘ۟ۛۥۡۨۛۗۜۘۘۜۡۛۘۚۨۘۦۗۖۚۜۥۨ۠۫ۨۦۗۧۛۦۖۤ۟۫ۛۙ۠ۤۖۤ۟۫ۘۜۡۨۜۧ۠ۢۡۛۥ۠ۢۧۘۥۧۗۚۦۘۙۖۥۖ۬ۥۘ";
                                                        break;
                                                    case -798063009:
                                                        String str7 = "ۤۨۧ۫ۖۢ۟ۘۘۘۚۛ۫ۘۛۨۨ۠ۥۖۖۨۘۢۜۦۡۛۧۙۨۘۢ۠ۘۘۧۘۘۤۨۦۦۚۢۛۤۢ۫۬ۡۘۜ۫۠ۛۥۧۘۘۛۧۧ۟۟ۥ۬ۚ۠ۖۦۙۢۙ۠ۡۢ۟ۙ۫ۖ۠ۚۡۘۤۥۚۡۖۧۨ۟ۜ۠ۜۛ۫۟ۦ۬ۛۥ۬ۤۜۗۨۡۘۖ۠۫ۗ۫ۥۘۜۚ۟ۖۢۢۖۨۧۗۦۖۦۢۢ۟۠ۦۘۧ۟ۜۘۧ";
                                                        while (true) {
                                                            switch (str7.hashCode() ^ 515924615) {
                                                                case -2068362705:
                                                                    str7 = "ۢۛۡۧۙ۟ۖ۠ۛ۠۟ۘۗۜ۠ۗۧۦۘۥۛۜۙۦۨۧۧۖ۠۠۬ۦ۫۫ۢۡۡۤۤۘۘ۫ۨۦۘۡ۠ۨ۟۬ۥۘۙ۬ۜۘۗۘ۬ۖ۠۠ۦ۫ۦۘۛۥۤ۠ۨۗۥۛۥۘۨۜ۟ۗۜۙ۬ۗ۬ۦ۟ۨۘۛۙۡۘۢۜۘ۟ۙۜۘۡۥۦۨ۬۫ۨۦۛۗۨۖ";
                                                                case -1510465302:
                                                                    str6 = "ۦ۬ۙ۟ۖۢۘۧۦۤۥۗۥۜۦ۟۬ۧ۠۠ۤ۫۫ۖۚ۟ۧ۬ۦ۫ۥۜۘۥۘۦۘۛۗۡۨۧۛ۟ۢۥ۫۫ۡۙ۬۬ۖ۠ۧۢۜۨۗۡۖۜۖۛ۠۠ۘۡۖ۫ۙۦۥۘۙۦۦۡۙۙۤ۟ۢ۫ۛۥۨۚۗۡۧۘۨ۫ۜۘ۬۟ۡۘۘۜ۫ۥۡۘۨۡ۠ۦۧۨۘۘۤ۠ۚۙۜۥۗۦ۬ۨۦۥۜۖۢۘۘۚۘۗ۬ۨۜۘۘۥۢ";
                                                                    break;
                                                                case 808179615:
                                                                    String str8 = "ۚ۠ۦۧ۫ۜۢۗۨۘۙۜ۟ۘۨ۫ۢۡ۫ۖۜۡۧۗۨۘ۫۬ۖ۬ۚۨۘۤ۠ۗۦۡۘۜۡۥۙۙۤۙۛۦ۟ۨۛۙۥۗۜۨۙ۫ۘۤ۫ۨۖۧۙۖۘۥ۫ۖۘۡۘۗۨۥۨۘ";
                                                                    while (true) {
                                                                        switch (str8.hashCode() ^ 1047467483) {
                                                                            case -1894377121:
                                                                                str7 = "ۢ۠ۙۚۨۖۘ۬ۨۗۡۘۖۡۦ۬ۧۨۨۛ۟ۜۘۖۜۧۙۖۚ۬۬ۗۤۨۥۗ۬ۡۘۧۙۜ۠ۙۧۢۜۤۖۨۙۘۙۡۘۜۢ۟ۥۨ۟۫۠ۚ۫ۡۖۦۤۧ۬ۖۘۘۥۘ۠۟ۚۥۘۚۧۘۤۤ۫ۤۜۦۧ۬ۨۘ۬ۙۘ";
                                                                                break;
                                                                            case -603106943:
                                                                                str7 = "ۖۜۤۢۡۦۛ۬۬ۙ۬ۘۘۨۗۦۘۚۥۜۘۚ۫ۤ۠۬ۚۖۥۧۚۛۦۙۤۜ۬ۘۥۗۢۡۘۗۖۚۛۘۥۘۜ۠۫۠ۗۡۗۜۛۡ۟ۤۡۗۖۘۡۚۘۘ۠۬ۤۨۙ۠ۗۘ۟ۧۘۡۘۗۧۖۤۚ۬۬ۥۦۦ۬ۨۧۦ۟ۛۖۛ۟ۨۨۘۜۚۦۘ";
                                                                                break;
                                                                            case 1192463146:
                                                                                str8 = materialButton.getText().toString().equals(getString(C0931R.string.str005a)) ? "ۚ۫ۚۦ۠ۜۛۛۘۘۚۧۡۚۙۤۡۦۜۘۡۙۨۡۗۨۘۦۜۤۧۙۡۢۨۦۘ۠ۥ۟ۛ۠۬ۘۖۘ۫ۨۛۛۢ۫ۦۗۤۥۙۘۙۜۛۡۦۘۚۤ۬ۨۡۦ۟۠۟ۡ۠ۧۗۡۢ۫ۛۥۘۙۛ۠ۘۚۦۘۡۧ۠ۢۨۤ" : "ۥۢ۟ۜۤۙ۠ۙۨۡۥۘۢۡ۠ۙ۠ۦ۟ۜۥۤۧۥۨۚۜۛۡۧۖۛۖۥۘۘ۫ۙۨۦۗۘۥۨۘۗۜۡۢۗۦ۠ۤۖۚۘۘ۟ۢۗۥۖۘۘۜۧۢ۫ۛۡۢۥۥۛ۬۟ۘۜۧ۠ۖۘۘۥۘ۫ۜ۫ۥ۟ۗ۬ۨۖۚۡۜۗۘۗ۫ۨ۠۟۬ۡ";
                                                                            case 1827405392:
                                                                                str8 = "ۚ۬ۜ۠ۚۚۧۢۖۘۢۘۚ۠ۛۡۘ۫ۚ۫ۦۖۜۦۡۘۜۛۧ۠ۦۥۘۧۙۡۢۢۖۢ۟ۗ۬ۤۛ۟۟۟ۧ۟ۡۧۜۘۙ۟۠ۦۙۙۜۡۜۘۢۖ۫۬ۛۗۢۡۘۘ۫ۢۖۘۦۛۘۨۘۨ۫ۥ۫ۡۧۤۖ۫ۥۡۙ۬۫۟ۖۧۦۙۛۧۡ۬۠ۘۜ۫";
                                                                        }
                                                                    }
                                                                    break;
                                                                case 2030546938:
                                                                    str6 = "ۛۖۗۗۜۛۡۜۢۢۨۦۛۛۨۙۜۦۘۖۘۖۘۥۡۡۘۙۧ۫ۢۥۥۛۖۛۜ۟ۛۤ۟ۡۘۘۚۥ۠۬ۚۙۚۘۘ۠ۡۘۘ۠ۡ۬۟ۧۦۘۢۥۥۘ۟ۦۦۘۗ۟ۖۘ۟ۜ۠ۜۗۙۥۗ۠ۤۤۡۤ۬ۜ۬۠۬۟ۧۖۘۙۙۡۘۘۗۖ۟ۥۨۧ۫۠ۚۖۗۢ۟ۧۡۨۘۨۘۧۦۤۘۘۦۖ۬";
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 207400546:
                                                        str5 = "ۛۙۥۛۘۡۤۦۜۘۧۙۦۧ۫ۢ۫ۜۖۜۗۨۛۤۥۘ۬۫ۗۙۤۙۧۤۡۖۥ۠ۦ۟ۚۚۧ۟۬۟ۜۦۖۖۘۡۛ۟ۤۚۛۤۢۢۚۜۖۙ۠ۜ۠ۨۜ۟ۜۡۘۡ۟ۤۥ۬ۘۖ۬۬ۜ۫ۗۤۤۚۡۘۦۢۙۥۜۙ۫ۙۡۜۙ۬ۗ۠ۧۧۘۘ۫ۤۧ۬ۘ۠ۚۧۨ۫ۨۡۘۜۡۨۘۨ۟۟ۗۜۡۘۜۨۘ۬ۗۛۢۤۖ";
                                                        break;
                                                    case 1573731907:
                                                        str6 = "ۗۧۘ۬ۖۜۘۙ۬ۜۢ۬ۚۡۧ۟ۢۗۤۤۛۘ۠۫ۦۙ۟ۙۨ۠ۡۘۤۡۜۡۜ۫ۤۙۚۜۨۡۢۤۥۦۚۛۘ۟ۜۖۘۡۨۦۘ۠ۡ۫ۚۛۦۘۨۡۥۘۨۘ۠ۨۘۤۧۧ۬";
                                                }
                                            }
                                            break;
                                        case -680839679:
                                            str4 = "ۦۜۖۘۜۘۡۛۗۥۘ۬ۡۧۖۡۡۘ۫ۨۖۚ۫ۦ۠ۢ۠ۤۙۦ۬ۧۤ۬ۡۘ۬ۚ۟ۧۙۡۘۡ۫ۘۥۚۨۘۚۦۡۜ۟ۥۘۗۤۡۖۜۡۧۜۜۥۥۢۙ۫ۤۢۢۘۘۖۡۦ۬ۥۘ";
                                            break;
                                        case 2101079583:
                                            str5 = "ۖۢۧۡۤ۠۠ۚ۬ۢۥۜۧۤۙۘۚۦۨۨۥۘۧ۟ۢ۫ۙۥۘۙۗۛۢۜۥۘۥ۟ۜۦ۟ۘۘۜۧۘۧ۫ۦۚۧۗۦۗۜۥۦۡۘ۠۫ۘ۬ۚۗ۫ۧۡۘۗ۟ۦۘۛۡۖۘۨ۠ۖۘۤۛۛۧ۠ۡۚ۫ۦۘ۫ۥۤ۟۫ۨۘۨۙۡۤۢۚۡۢ۬ۤۗۢۢ۟ۚۗ۫ۨۘ۫ۘۨ۬ۜۥ۟ۙۡۖ۠ۜۜۙۘ";
                                    }
                                }
                                break;
                            case 570551269:
                                str3 = "ۛۡۛۗۜ۠ۨ۬ۢۨۙ۟ۖۚۨۧۚۛۜۡۛۦۦۘ۫ۜۘ۠ۥۥۘۘۥۡۙۤ۟ۛۙۢۧۥۘۢۗۦۘۘ۫ۦۘۗۦ۬ۢۤ۠ۜ۫ۚۚۚۡۘۧۤۛۡۖۤۡۜۖۘ۠ۙۜۙۦۧۗ۟ۗۜۙۧۤ۠ۚ۬ۜۜۘۘۖۘۘۦ۠ۨ۠۠۟ۙۗۨۘۥۡۢۧۡۦۘۘۙ۟ۨۜۧ۠ۢۚۦۚۚ۠۠ۘ۬ۧۥۦۦۖۘۧۖۘۘ۬ۥۡۤۙۨ";
                                continue;
                            case 1273305984:
                                str4 = "ۜۤۘۘۧ۠ۨۘۥۗۢۥۜ۟۟۬ۖۗ۠ۦ۠ۗۥۘ۫۬ۡۧۥۦۨۜۦۘۨۡۦۙۥۘۧۦۥۛۜۦ۟ۥۙۨۜۥۘۥ۠ۛ۠ۖۧۘۧ۬ۘۘۢ۫ۜۘۨ۬ۜۘۜۙۡۛۤۚۜ۬ۘۙۤ۬۫ۘۧۘ۫ۛۜۘ۬ۢۥۘۥۨۧۙۖۘۘۤۗۖۘۥ۫ۗۜۖۘۘ۬ۜ۫ۛۦۖۗۜۘۧ۫۫۟ۡۦۘ۫ۨۛۜۧۨۘۢۨۗۡۨۗ۠ۜۛ۬ۜۢۗۢ۠";
                            case 1393797561:
                                str3 = "ۡۢۖۘ۟۟ۦۨۢۥۘۦ۠ۙۗۘۧۥۖۚۥ۫ۡۘ۟ۤ۟ۖ۟ۗۚۧۥۧۥۙۚ۬ۥ۟ۦۘۖۙۗۦ۬ۧ۬ۥ۠ۦ۟ۗۗۡ۠۬ۗۖۘۘ۟۬ۜۙۨۘۤۗ۠۫۬ۨۘۡۗۢ۠ۚۗۜۛ۠ۥۨۦۘ۬ۤۜ۠ۙۥ۟ۧ۟۬ۢۛۘ۫۟ۢۖ۬ۦۤۨ۟۠ۗ";
                                continue;
                        }
                    }
                    break;
                case 396959666:
                    str3 = "ۦ۬ۡۘۗۖۙۜۤۧۥۘۢۨ۟ۡۘۜ۬ۗۚ۫ۧۥۜۡۖۡۡۘۤ۠ۦۘۗۗۖۡۨۜۧۨۥ۫ۢۗۨۙ۠ۢۢۖۘۛۦۨۢۖۨۘۗ۫ۦۘۜۘۘ۠ۜۦ۟ۢۖۘۧۧۨۘ۟۫ۢۚۜۧۡۤۥۛ۟۠ۧۖۤۧۖ";
                    break;
                case 443385491:
                    str3 = "۟ۜۧۘۦۢ۠ۦۡۦۘ۟۟ۜۘۢ۫ۚۥۧۘۘۛۡۚۜۧۘ۬ۡ۠ۜ۬ۦۢۗۥۘۘۧۜۘ۟ۙ۬۫ۗۡۙۥۧۘۗ۠ۡۙۛ۫ۘۦۘۧۛۨۘۖۛ۬ۚۜۤۙۖۜۖۗۨۤۡۡ۟ۨۛۘ۬ۦ۟۫ۚۢ۠ۗۢۗۗۡ";
                    break;
                case 972867142:
                    str3 = "۫ۙۖۘۥۘۤۥۦ۫ۡۢۘۤۡۨۘ۟ۚۥ۠ۜ۬ۖۛ۫۟۫ۢۜۘۖۘۡۧۜۘۥۖۚۡ۬ۡۘ۠ۖۘۘۨ۫ۦۗۜۦۦ۫ۘۗ۟ۚۜ۫ۢۤۢ۟ۧ۬ۧۜۧۛۨۤۖۜۤۖ۫ۙۥۘۙۛ۠۠ۤۖۨۛۛۨۛۢۤۜۦۘۗۡۥۙۤ۟ۚۦۤۖۖۦۘۛۢ۬۟ۤۨۘۚۙۘ۠۟ۡۧۥ۟ۤۡۘۙۤۗۜۧ۫۫ۜۧۘۚ۬ۦۘۤۤۦ";
                    break;
                case 1248999414:
                    startPatcher();
                    str3 = "ۧۡۢ۬ۚۘۘ۬ۤۦۙۢۚ۟ۜۘۦۚۨۘۨۖۨۥۤۛۡ۫ۜۘۧۢۦۤۗۡۦۗۜۤۛۘۜۨۖ۬ۦۛۘۜۙ۠۠ۢ۠ۖ۫ۥۙۜۦۛ۫۫ۦۘۘۛۧۥۗۖۧۡۢۛۘۧ";
                    break;
                case 1376383739:
                    return;
            }
        }
    }

    public void importSettings() {
        String str = "ۡۚۘۘ۟ۨۖۨۢۥۘۤۖۘۢۡ۬۬ۦۖ۫ۘۜۜۙۡۧۗۧ۫ۜ۟ۢۦۘۤ۬ۚۨۗۘ۟ۧۘۙ۟ۨۗۘۘۛۦۡۘۚۤۨۘ۟۠ۗۦۙ۠ۨۛۢۡ۫ۘۘۨۢۜۘۘۦۜۥۥۘۘۙۖۢ۫ۜۖۘۡۜۥۘۛۦۥۛۦۖۘۙۦۘۨۡۤۘۢۥۜۨۨۘ۬ۨۨۙۦۙۙۦۥۘۜ۠ۧۚۥۨۦۧۥۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 165) ^ 274) ^ 3) ^ 267) ^ 83) ^ 873) ^ 147) ^ 47) ^ 598) ^ 562) ^ 245) ^ 662) ^ 889) ^ 222) ^ 713) ^ 322) ^ 578) ^ 400) ^ 305) ^ PointerIconCompat.TYPE_ZOOM_IN) ^ 321) ^ 422) ^ 455) ^ 506) ^ 107) ^ 168) ^ 287) ^ 510) ^ 116) ^ 53) ^ 609) ^ (-450487825)) {
                case -1638245512:
                    return;
                case -930976933:
                    Toast.makeText(this, getString(C0931R.string.str00c9), 0).show();
                    str = "ۛ۠ۤ۟ۧ۫ۥۦۢۜۛ۠ۜۜۙۛۖۥۘ۠ۥۛ۬ۥۧۘۨۢۘۧۗۤ۠۬ۖۢ۫ۙۛۥۜۖۘۡ۠ۘۘ۟ۘۡۘ۫ۙۗۦۨۖۘۡۡۙۤۗۡۘۖۚۙ۠۟ۦۘۜۚۦۖۥۘۡۗۡۘۨۘۨۘۜۖۡۧۢۖۛ۫ۜۚۜ۟ۛۦۘۛۗۚۜۘۡۘۡۧۗۨۘ";
                    break;
                case -240031420:
                    str = "ۙۥۜۘۗۗ۬ۛ۬ۗۥ۫ۨۨۧۜۖۘۜۘۦۖۢ۬۟ۨۥۧ۟ۥ۬ۛ۫ۡۘۥۗۥۘ۠ۘۛۤۚ۬ۜۙۥۘۦۜۘۘۙۦۦۘۡۤ۬ۛۙۤۦ۫ۦۘۢۜۢۧۜۗۖ۬ۡۘۤۥ۫۫ۘۙ";
                    break;
            }
        }
    }

    public void initMenu1() {
        MaterialButton materialButton = null;
        MaterialButton materialButton2 = null;
        MaterialButton materialButton3 = null;
        MaterialButton materialButton4 = null;
        MaterialButton materialButton5 = null;
        TextView textView = null;
        TextView textView2 = null;
        TextView textView3 = null;
        TextView textView4 = null;
        TextView textView5 = null;
        final MaterialButton materialButton6 = null;
        final SharedPreferences sharedPreferences = null;
        String str = "ۗۤۥۘۥۧۡۘ۫ۦۘۨ۫ۜۚ۬ۢۛۨۥۘۤۜۦۧۖۥۨۦۖۨ۠ۚۡۡۘ۟ۗۡۘۚ۟ۗ۠ۛۥۘۖۢۧۘ۬۫ۘۦۢۨۥۨۚۚۖۘۘۡۦۖۡۦ۬ۜۙۥ۬۠۬ۜ۫۠۬ۥۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 147) ^ 132) ^ 89) ^ 89) ^ 545) ^ 243) ^ 113) ^ 468) ^ 286) ^ 635) ^ 824) ^ 394) ^ 236) ^ 655) ^ 703) ^ 176) ^ 338) ^ 530) ^ 887) ^ 559) ^ 526) ^ 474) ^ 295) ^ 315) ^ 753) ^ 925) ^ 930) ^ 958) ^ 681) ^ 236) ^ 666) ^ 1930516228) {
                case -1923115803:
                    materialButton6.setIconTintResource(C0931R.C0932color.color0027);
                    str = "۬۠ۥۘۚ۫ۜۨ۟ۤۧ۫ۜ۟ۦۧۧۜۨۖۤۡۘۘۢۡۘۢۦ۬ۢۗۤۛ۫۬۠ۛۦۘۖۚۛۛۗۡۘۥۦۜ۬ۤۗ۫ۙۚۡۚۨۗ۫ۨۚۨۡۨۦۘۛۧۛۚۙۚ۟۬ۖۧۨۚۚۖۥۘۚۦۦۘۧۜۗۧۦۘۘۢۥ۫ۡۜۖۨۙۤۜۨۘۧۖ۬۟ۙۛ۫۟ۡۚۧ۫ۢۙ۬ۢۖۢ۟ۥۛۥۢۘۘ۫ۤۡۦۘۡۙ۫۠ۛۥۧۘ";
                    break;
                case -1674135828:
                    materialButton6.setText(getString(C0931R.string.str001c));
                    str = "ۧۘ۠۫ۨۦۨ۫۟ۖۜۦۘۡۘۖۘۚۡۘۡۖۦۘۧۘۨۘۨ۠ۗۨ۠ۘۘۖۥۘۘ۬ۢۢۨۡۖۘ۠ۧ۠ۙۛ۠ۚۗۛۡۚۜۘ۟ۤ۠ۧۙۦۘۚۛۗۗۙۙۡۗ۬ۧۖۘۙۜۙ۬ۢۛۖۗۧۦۥۜۙۛۧۖۘ۬ۗۧۤۢ۬ۦۗۛ۬ۜۖ۫ۜۥۗۗ۟ۡۘ";
                    break;
                case -1665038229:
                    str = "ۥۙ۠۫ۖۖ۬ۡۜۘۜۤ۬ۜۛۘۙ۠ۛ۟ۘۦۘۡۨۢۧۙۜۘۖۨۧۢۚۨۘۛۤۜۧۗۦۖۜۜۖۢۡۘۖۖۛۜۚۢۙۦۤۘ۠ۦۘۘ۟ۦ۬ۚۖۢ۠۠ۨۢۤۧۡ۬ۘۨ۠۫ۡۚۢ۟ۨۢۗۥۖۧۤ۬ۡۡۘۦ۫ۖ۬ۜۗۡۧۤ۫ۚۗ۫ۜۘ۟۠ۜۡ۠۬ۛ۫۬ۥۨۙ۫ۚۥ";
                    textView = (TextView) findViewById(C0931R.C0934id.id0216);
                    break;
                case -1633684335:
                    modestatus = true;
                    str = "۠ۚۜۘ۬ۜۛۤۜۘۖ۠ۗۗۦۖۢۦۜ۫ۚۢۖۢۨۢ۟ۗۜۦۖۘۡۛۦۘۛۡ۬۟ۖۦۘۢ۬ۙۥۛۦۧ۟ۜ۠ۤۡۘۘۚۧۦۢۛۙ۫ۚۖۗۘۖۙۗۙۦۤۘۙۡۡ";
                    break;
                case -1601236499:
                    modestatus = false;
                    str = "ۗۧۢۚۚۛۗۨۡۙۨۢۙ۫۬۟ۨ۠ۗۡ۟۬ۙۙۥۦۧۡۦۙۡۥ۬۬ۧۙۥۨۖۥۙۦۘۙۗۘۘۤۢ۠۫ۖۘۡۘۧۥۛۥۨۘۜۜۧۘ۠ۤ۟ۗۘۘ۬ۙۧۖۛۘۧۚۥۙۧ۠ۦۙۡۤۤۧۘۖۖۘ";
                    break;
                case -1548438814:
                    sharedPreferences = getSharedPreferences(Deobfuscator$$app.getString(-3440731419866652489L), 0);
                    str = "ۨۧۨ۬۫ۛۘۢۘ۠۫ۡۧۙۤۥۘۘۤۚۜۤ۫ۤۖۥۗۘۜۛۡۤۨۘۙۨۦ۠ۗۦۚۚۛۦۚۛۤۛ۠۠ۤۜۘۢ۟ۧۧۗۛۙۛۜ۟ۢۡۜ۟ۗۢۗ۟ۚۦۘۚ۠ۖۘ";
                    break;
                case -1382376777:
                    str = "ۜ۬ۜۙ۫ۤۛ۬۬۫۟ۙ۠ۜۡۘۧ۬۬ۥۙۙۛۨۡۘ۬ۤۚۗۤۘۘ۟ۨۘۚۥۖۤ۬ۡۤۜ۠ۡۘۤۘ۫۫ۘۜۥۘۛۤ۟۫ۘۥۘۧۘۘۘۜۥۙۛۛۘۘ۫ۧۧۚ۬ۦ۫ۥۧۘۦۘۨۘۖۧۦۖۡۘۜ۟ۡۙۜۡۘ۠ۙۢۙۚۛۧۖ۬ۦۖۡۘۨۚۨۘۜۖۜۘ۫ۗۙۢۤۜ۟۫ۨۢۨۧ۬ۢۛ۬۫ۥ۟۫ۜۘۢۤ۬ۦۚۨ";
                    materialButton2 = (MaterialButton) findViewById(C0931R.C0934id.InstallGlobal);
                    break;
                case -1040262110:
                    str = "۫ۧۗۙ۠ۥۤۥۙ۫ۥۘۖۗۖۘۘۨۤۗ۬ۙۛ۠ۖۖ۠ۜۘۚۤۡۛۚۢۛ۠۫۫ۥۨۘۜۜ۬ۧۜ۟ۖۥ۬۟ۛۜۘۚ۠ۜۘۧ۫ۚۧۢۗ۬۬ۡۦۙۥۘۙۜۡۘ۬۫ۙۨۢ۠ۛۛۗۚ۬ۨۘۖۥۧۘۖۡۙۢۧۡۧۥۚ۠ۛۚۖۚۙۧۤۘۢۨۤۨۥ۠ۗۢۘۨۛ۫۬ۗ۬۫";
                    materialButton4 = (MaterialButton) findViewById(C0931R.C0934id.InstallVNG);
                    break;
                case -1022743289:
                    str = "ۦۢۦۘ۬۟ۡۜۦ۠ۤۜۡ۫ۥ۠ۡۥۦۘۙۢۘۘۙ۫ۜۨۘۚۜۖۢ۬۬ۜۘۚۗۦۡۦۙۦۨۧۘۡۗۦ۬ۧۦۧ۫ۙ۬ۜۖۦ۫ۧ۠۠ۨۘۡۖۘۥۚۤ۟ۨۨۘۜۥۚ۬۫ۜۥۗ۟ۘۛۖ۠ۨۦۨۖۗۜۙ۬";
                    materialButton = (MaterialButton) findViewById(C0931R.C0934id.InstallBgmi);
                    break;
                case -984959640:
                    str = "ۘ۬ۛۡ۬۟ۙۛۡۘۖۘۙ۬ۥۥۘ۟ۤۦۦۧۥۘۖۨۦۧۘۨ۟ۦۘ۟۬ۨۛ۫ۥۘۜۧۚۚ۠ۙۨ۫ۡۘۘ۬ۘۘۚۖۚۤ۟۠ۨۧۨۘ۟ۛۘۘ۬ۧۘۘۘۢۛۡۚۘ۫ۖۡۦۦۘ";
                    textView2 = (TextView) findViewById(C0931R.C0934id.id0215);
                    break;
                case -739176265:
                    str = "ۦۦۧۖۤۨۘۘۤۚۦ۟ۖۘۙ۫ۦ۠۟ۥۘۗۙۘۧۨۜۘۤ۠ۦۘۨۥۛۡۨۦۢۖۗۦۖۜ۟ۦۖۚۢ۟ۚۥۧۚ۟ۨۘ۟ۗۤ۬۟ۖۘۦۗۦۘ۫ۡ۠ۧۧۘۘۡۤۗۢۤۥۘۗ۟ۖۘۨ۟ۜۧ۠ۦۚۚۦۘ۠ۖۤۨۧۡۘ";
                    textView3 = (TextView) findViewById(C0931R.C0934id.id0217);
                    break;
                case -628437054:
                    checkPackageStatus(textView, materialButton, Deobfuscator$$app.getString(-3440731510060965705L));
                    str = "۟ۖۨۜۨ۟ۜۤ۬ۧۢۧۥۧۘۗۚ۫ۥ۫ۚۦۨۜۘۗ۠ۖۖۡۘۢ۫ۤۡۡۙۨۘۦ۟ۦ۟ۡ۟ۦ۫ۦۧۘ۬۟ۦۧۘ۠ۗۘ۬ۥ۠ۗۗۗۦ۠ۨۘۙۨۨۥۢۦ۠ۘۗۚ۠ۦۘ۬۫ۡۚۥۨۖۧۘۧ۬ۚ۠ۖ۠۠ۛۙ۫ۥ۫ۙۜۢۜ۬ۨۛۗ۬ۜۗۦۘ۫ۥۜۘ۬ۤۖۘۧۤ۫ۚ۠ۥۦۙ۠ۦۧۘۧۙۦۢۧ";
                    break;
                case -588448677:
                    String str2 = "ۗ۟ۨ۬ۨۡۘۦۥ۫ۗ۠ۨ۬ۤۚ۟۠ۡ۟ۛۢۖۙ۬ۢۜۨۗۡۤۚۢ۠ۨۗۤۛۙۘۧۦۨ۟ۜ۫ۙۙۨۘۢۙۨۘۧۨۧۘۗ۬ۡۦۡۜ۠ۛۧۙۖ۟ۧۢۨۜۘۜۢۤۥ۫ۥ۠ۜۜۜۜۘۘ۠ۘۘۦۗۜۜۤۜۘۗۤۗۤۛۦۛۥۦ";
                    while (true) {
                        switch (str2.hashCode() ^ (-585559883)) {
                            case -1867119029:
                                str2 = "۫ۜۨ۬۫۫ۜ۫۫ۛۦۥۘۖۨۖۘۦۧ۫۠ۤۜۤۨۛۚۘۧۘ۬۬ۗۢ۠۠ۥۙۢۜۨۥۧۦۛۥۜۡۙۘۙۡۚۖۢۚۛۧۚۙ۟ۘۘۢۤ۫ۙ۫ۨۘ۬ۚۤۛ۬ۜۙۡۡۘۙۢۦۘۥۨۧۜۘۦۘ۟ۖۨۘ۟۟۟ۧ۫ۜۘۜۤۧۥ۟ۢۨۛۤۗ۫ۥ۬ۤ۠ۗۛۛۥۧۘۜۤۥۥۢ۠ۖۥۧۘۙ۠ۥۘۜۦۚۘ۟ۜۘ۠۟";
                            case -642593328:
                                str = "ۙۨۛۜۙۡۘ۬ۙۤۥۛۥۘۡۙۖ۫ۚۚۛۡۜۘۙۛۢۢ۟ۡۘۜۨۘۘۨۨ۟۫۟ۚ۬ۜۧۥ۫ۦۘ۠ۢۛۛۡۥۘ۫۠ۗۖۜۛۤ۬ۛۜ۬ۙۛ۟۠ۦۦۘۖۘۙۧۘۘۦ۟ۖۘۢ۫ۙۢ۬ۙۛۖۖۘ۫ۧۡۘۘ۬ۛ";
                                continue;
                            case -154102950:
                                String str3 = "ۦۗۘۧۤۖۘۡ۠ۜۘۡۜۥۘۛۨۦۧ۬ۙۨۜۛ۟ۖۧۘۙۗۖۛ۠ۖۧۙۦۘ۠ۘۘ۠ۘ۠ۨۖۘۡۚ۟۠ۘۘۖ۟ۙۦۦۨۘۤۨۘۘۦۙ۠۟ۖۧۖۥۘ۬ۗۙۡۥۥۨۖ۫ۖۡۧۘۡۚۢۚۢۨۘۗۢۤۛۡۤ";
                                while (true) {
                                    switch (str3.hashCode() ^ 120705453) {
                                        case -985558505:
                                            str3 = "ۜۥۤۡۥۧۛۘۡۡۥۧۘۢۧۛۖۘۧۘۚۗۙۡۙۤۘ۫۠ۥۖۡۨۥۜۘ۠ۦۘۘۤۖ۠۬ۚۦۘۦۜۘ۬ۜۨۨۦۧۢۤۡۘۢۗۦۘۘۗۗ۟ۗۥۗ۠۠ۗۙ۠ۛۘۦۗۛۚ۟ۦۘ۬ۦۧۚۖۨۘۚۧۡ۠ۛۨۘ";
                                        case 217416338:
                                            str2 = "۫ۙۢۚۘ۟۠ۙ۟۬ۖۡۚۜۖۛۨۛۘۛۦۗۘ۬ۛ۠۠ۢۥۛۛۨۡۡۨۢۦۗۤۡۖۨۜۧۡۘ۫ۢۜۘۢ۬ۦۥۢ۫ۢۚۦ۬ۡۧۘۜ۟۫۬۟ۥۘۚۛۖۘۜۛۖ۠ۡۖۡۚ۫ۤۤ۫ۜۤۥۧۦۘۛۛۤۚۡۖۘۜۜۧ۟ۥۜ۠ۗۡۘ۠ۙۧ۠ۖ۠ۨۦۜۘۦۘۘ۬ۤۜۘۥۖۤ";
                                            break;
                                        case 683443967:
                                            str2 = "ۖۖ۟۬ۖۜۘ۠ۧ۟ۧۚۙۥ۠۬ۥۗ۟ۤۡۨۘۘۡ۬ۘ۫ۥ۠ۚۤۢۧۖۜۘۙۦۡۧۤۘۛۡۥۘۘۛۜ۬ۗۖ۟ۙۢۥ۠ۦۘۛۘۘۜۜۙۧ۫ۨۛۘۗۧۥۘ۟ۢ۫ۖۤۤۛ۬ۗۤ۬۠ۖۡ۟ۥۧۖۘ۫ۛۘۜۙۢۜ۟ۡۘ۫ۗ۟ۙ۫۬";
                                            break;
                                        case 1764827345:
                                            String str4 = "۟۠ۚ۫ۚۗۤۥ۟ۨۧۤۢ۬ۡ۫ۘ۬ۨۡۘۦ۠ۚ۟ۢ۠ۙۧۘۗۥۡۘ۫ۦۘۗۛۖ۟ۧۚۖۦ۫ۙۧۜۘۛۜ۫ۨۖۦۘۨ۠ۡۘۚۜ۫ۨ۫ۘۘۡۙۜۚۨۜ۬ۡ۟۟ۘۙۙۦۦۘۦۤۢۦۦ۬ۥۚۨۚۤ۟ۨۖۨۡۙ۬ۖ۟ۜ۫ۢۥۘۜۤۛ۬۠۠ۙ۬۠ۥۙۙۥۗۡ۫ۖۛ۠ۦۘۘۙۖۙۘۗۗۢۧۜۘۢۛۘۘ";
                                            while (true) {
                                                switch (str4.hashCode() ^ (-232006231)) {
                                                    case -2070011908:
                                                        str3 = "ۨۗۦۥۡۡۘۨ۬ۗۗ۟۟ۚ۫ۜۘۨۘۚۜۨۧ۟ۚۡۘۙۢۘۛۙۡۘۡۚۢۖۡۦۨۧ۠ۖۖۙۗۛۨ۬ۧۡۘۧۨ۠ۖۚ۟ۜۖۡۘ۟ۧۥۘۧۥ۟ۙۤۥۘ۠ۛۙۜۥۗۜۜۡۘۤۥۖۘ۫ۨ۟ۛۖۨۘۡۨۘۘ۫ۛۛۥۚۨۘۦ۟ۦۢۗۚۥۨۦۜۖۖۛ۟ۡۘۜۥۚ۠۬ۙۦ۟ۜۖ";
                                                        break;
                                                    case -583824311:
                                                        str3 = "۟ۚ۟ۡۖ۬۟ۡۡۢۜ۟ۤۡۜۤۨۛۙۦۙۧ۬ۛ۟ۡۧ۠ۦۥۦۘ۠ۧ۬۟ۢۘۘۨۨۨ۫ۘۖۘۙۦۥ۟۬ۦۘۦۧۦ۫ۚۨۦۚۙۦۨۥۘۥۡۖۘۨ۫۠ۥۜۘۨ۬ۥ";
                                                        break;
                                                    case 1219262787:
                                                        str4 = "ۙۤۦۘۙ۠ۡۧ۬ۖۚۢۥ۫۬ۚۖۛۥۨ۬ۘۘۨ۬ۘۥۘۘۘۦۨۨۙ۠ۘۖۙۜۘۤۢۢ۫ۛۘۘۢۤۖۘۚۘۧۘۨ۟ۜۘۘۗۥۘۙۡۜ۟ۤ۬۫ۡۡۘۘ۠ۦۘۘۢ۟ۡۛۦ";
                                                    case 1509670901:
                                                        String str5 = "ۤ۟ۨۤۨ۟ۚۥۙۨۘ۫۫ۚۖۘۨ۬ۘۙۧۨۜۜۥۘۤۗۛۦۡۚۧۥ۟ۢۙۘۦۤۧۖۗۡۢۜۜۦۥۘۘ۟۟ۡۗۦۘۚ۬ۦۘۡ۬ۜۘۚۧۤۢۧۦۚۧۙ۟ۤۥۘۙ۬ۡۘۧۥۜۘ۟ۖۖۥ۟ۚۜۧۘۘ۫ۥۘۘۚۦۛۨ۬۠ۡۘۜۘۘ۬ۡ۠۬ۙ۬ۤۡۥۧۦ۬ۚۡۘۘۗۧۘۧۧۥۗ۬ۚۚۘۜۘۛۨۖۦۦ";
                                                        while (true) {
                                                            switch (str5.hashCode() ^ (-2015572348)) {
                                                                case -1688974152:
                                                                    String str6 = "ۤۛۙۡۤۨۘۥ۟ۘۖۘۦۘۘۘۥۘ۠ۙ۟ۦ۟ۘۧۡۧۜ۟ۥۥۡۖۜ۫۫ۡ۬ۢۧ۠ۨۘۘۨۜۘۥۙۙۜۦۘۚۚۖۘۥۥۡۡۙ۫ۤۧ۫ۚ۫۬ۚۡۗۨۡۘۦ۬ۖۘ۬ۦۖۘ";
                                                                    while (true) {
                                                                        switch (str6.hashCode() ^ 2124235994) {
                                                                            case -1803636427:
                                                                                str6 = sharedPreferences.getBoolean(Deobfuscator$$app.getString(-3440731372622012233L), false) ? "ۙۨۚۥۙۚۙۡۘۡۤۜۘۨۦۧ۬ۥۦۘ۟ۘۛۤ۟ۧۖۢ۫۠۬ۖۘۖۗ۬۫ۨۚۜۜۥۗۡ۫ۛۧۛ۫ۡۗۢۘۘۧ۟ۖۘۢ۠ۤۛ۫۫ۥ۟۫ۙۢۘ۬ۚ۬ۗ۫ۥۦۜۨۘ۬ۧۥۘۖۡۢۗۘۨۤ۫ۦ۠۟ۨۚۥۦۘۦۨۡۦۦۧۘۛۛۡۥۧۥۘۤۚۡۘ۬ۙۢ۠۠ۤۦۘۘۧۡ" : "ۙۚ۫ۨۗۨ۫ۦ۠ۨۛ۬ۧ۠۠۫۫ۦۘۖ۫ۜۘۚۧۡۗ۠ۨۨۡۗۦۖۢۙۢۢۜۛۨۘۢۙۗۥۧۖۘۦۦۜۘ۬ۥۨۘۙ۬ۨۘۖۨۥۘۨۙۥۘ۟ۨۨۜۨۢ۠ۥۧۘۥۥۖۡۚۦۘ";
                                                                            case -1368014560:
                                                                                str5 = "۬ۘۡۡۙ۟ۚ۠ۙۙۨ۫ۛۤۢ۬ۥۗۗۜ۬ۗ۠ۗۦۘۘۘۡۢۡۘۥۢۡۘۦۚ۬ۗۙۡۚۜۡۘ۬ۘۡۘ۬ۛۡۘۤ۠ۖ۠ۨ۠ۙ۟ۥۘ۟ۦۨۤۚۚۖ۟ۢۜ۠ۙۥۡۘۜ۠۫۟ۡۡۘۗۙۧۧۘۘۗۧۘۤۛۤۥۘۛۘۥۘ۫ۡۦۚۤۢ۠۠ۥۘ";
                                                                                break;
                                                                            case 906607150:
                                                                                str6 = "۠۟ۜۡۢۚ۟ۨۘۚۦۖۚۢۚۜ۠ۨ۠ۧۦ۬ۛ۬ۤۙۦۡۙۜۗۧۡ۟ۙۜ۬ۚۡۘ۬ۢۚۜۥۥۘۢۛۧۨ۫ۖ۬ۙ۠ۘ۟ۨۖۗ۫ۖۘۦۘۧۨۧۘۚ۬ۜۜۖۚۛۙۛ";
                                                                            case 1536749403:
                                                                                str5 = "ۥۙ۟ۗۧۡۘۚۢ۠ۧۦ۬ۦ۬ۚۡۡۘۘ۟۫ۖۘۧ۫ۡۚۥۥۥ۟ۙ۬۬ۥ۠ۢۨۘۨۚۨۙۤ۫ۢۘۚۧۧۡۘۖۥۢۢۘۘۘۛۚۧ۬ۥ۫ۤۛۨ۫ۢۜ۟۠ۧۘۙۦۘۛۢۖۧۛۜۘۛۘ۫ۥۦۤۤۢۦۥۨۘۡۛۙۦۚۥۘۖۖۨۘۙ۟ۨۘۘ۫";
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case -863502559:
                                                                    str4 = "۫ۙۙۦۚۖۘۥۨۨۘ۠ۥۛۤ۬ۥ۠ۤۜۘۖ۟ۘۘ۠ۙۢۧۧۥۦۗۚۡ۠ۤۦۨۨۙۜۚۘۦۦۜ۫ۖۘۧۨۤۢ۠۟۟ۖۦ۠ۢ۬ۚ۠۬ۖ۫ۨۗۧۗۢۘۦۜۡۡۘۙۢ۫ۤۖۛۤۚ۠ۦۨۚۚۡۘ۠ۚۜۢۡۧۖۨۢۡۛ۫۫۟ۘ۟ۦۥۜۗۖۚۛ۠ۥۢۚۗۖۗۤۚۧۨ۟ۢۤ۟ۡۖۧ۠۫ۤۜۙۜۘ";
                                                                    break;
                                                                case -188040715:
                                                                    str4 = "ۨۖۜۘۖۡۗۧۡۛ۫ۤۨۘۗۧۦ۟ۘۘۢۗۖۗۢۜ۟۟ۘۚ۬ۜۖۥۚۚۢۦ۟ۨۛۙ۠ۧۢۛ۫ۖۗۜۗۙۙ۬ۙۘ۠ۤۧۦ۬ۢۧۙ۫۟ۤۢۧۗۚۛۖۗۤۥ۬ۜۤ۠۫ۡ۫ۦ۟ۨۘۖۙۗۘۢۢ";
                                                                    break;
                                                                case 1415779689:
                                                                    str5 = "ۚ۬ۧۢۤۡۢۗۘۚۘۡ۠ۦۚ۬ۜۘۚۗ۫۟ۧۜ۬۟ۜۘ۟ۗۢۢ۬ۦۗۚۘۙۢ۬ۙۚۚۨۜۛۡۦۡۙ۟ۢ۫ۡۘۖۧۡۜۡۦۘۧۧۥۘۜ۫ۜۘۨۖۢ۠۟ۛۜ۬۠ۘۨۖۘۚۗ۬ۛۘۧۘۥۖۙۚۙ۬ۥۖۧۘۚۥ۫ۧۘۨۗۥۘ";
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                            case 1950177867:
                                str = "ۘۧۜۥۨۤۚ۠ۨۥۥۥۘۗۡۘۨۨۗۥۤۨۥۥۘۤۢۢۗۤۨۖ۫۫ۛۥۨۘۡ۫۫ۘ۫ۚ۠ۤۡۘۗ۠۬ۘ۟ۧۜۚۧ۟ۖۥۘۨ۫ۡۗ۟ۗۛۙۘۘ۬ۤۙۤۥۥۘ";
                                continue;
                        }
                    }
                    break;
                case -368407669:
                    materialButton6.setIconTintResource(C0931R.C0932color.color0023);
                    str = "۫۬ۢ۫ۢۥۙۤۨۘۧ۟ۛ۫ۨۢۛۚۤ۟ۚ۬۫ۨۜۘۢۖۜۘ۬ۢ۟ۙۦۜۡ۟ۙۖۧۦۘۖۨۙ۬ۚۘ۠ۧۢۗ۟ۤۛۘ۟ۥۥۘ۬ۙۦ۠ۡۘ۠ۗۜۘۡۛۡۢ۬۬ۥ۠ۡۘۘۛۜۗۤۘۡ۠ۢۥۖۥۜۧ۬ۘۜ۬ۛۥۗۦ۫ۘۤۤۚۙۢۘۘۚۚۤۥ۬ۢۦۗۧۙۧۡ۫ۜۘ۬ۢۨۘۙ۬ۜۘۖ۟ۦۘۨۢۖۘۙۙۧ";
                    break;
                case -182111848:
                    str = "ۗۗۨۘ۠ۗۡۡۘ۟ۘۨۥۘۨ۟ۥ۬ۚۜۘ۫ۧۨۗۖۧۘ۫ۙۜۘ۟ۤۖۥۜۗۛۨۧۘۧ۟ۦۢ۟ۚۧ۬ۖۖۜۨ۫ۥ۬ۚۡۘۘ۬۬ۘۘ۬ۡۖۘۧۙۚۖۡۡۗۤۜۘۙ۬ۡۨۚ۬";
                    break;
                case 34320465:
                    str = "ۦۡۙۤۧۗۦ۫ۘۘۗۥۡ۟ۙۥۘۦۢ۬ۙۨ۬ۜۡۖۘۜۙۨۘ۫ۚۙ۠۬ۥۘۗۨۙ۫ۖۖۘۤۙۗۥۚۖۘ۟۟ۘۘۚۙۨۨۡۘ۫ۙۗۙۧۦۗۧۚ۬ۥۖۘۛۨ۠ۛ۟ۜۢۚۘۘۗۚۚۜۡۜۘۥۖۗۛۙۥۘۨۧۥۘ";
                    break;
                case 53276087:
                    checkPackageStatus(textView5, materialButton5, Deobfuscator$$app.getString(-3440731213708222281L));
                    str = "ۗۨۥۘۜ۫ۦۦۘۨۗۥۙۥ۠ۖۘۢ۠ۚۢۛۖۛۘ۠ۨ۠ۨۘۛۨۥ۫ۗۤ۫ۨۦۘۨۖۗ۫۟ۥۖۡۙۜۙۦۘۛۜۡۘۤۧۜۘۨ۠ۛۘ۬ۦۚۧۙۛۦۘۘۗۚۦۡ۫ۧۘۧۤ۠ۧۧ۟ۛۧۤۜۥۘۙۘۗۗ";
                    break;
                case 516933746:
                    materialButton6.setText(getString(C0931R.string.str001d));
                    str = "ۚۖۡۘۜۜۘۖۤۙۨۖۡۦۚ۟ۚ۫ۦۖۖۘۘۙۥ۠ۖۜۡ۬ۖۘۦۗۥ۟ۦۜ۟ۗۛ۟ۛۦۚۥۨۜۤۥۘۚۖۜۧ۫ۤۚۜ۫ۗ۫ۢ۠ۧۨ۟ۘۘۘۥۡۢۨۙۢۦۦ۫";
                    break;
                case 579288263:
                    materialButton6.setOnClickListener(new View.OnClickListener(this, sharedPreferences, materialButton6) { // from class: kentos.loader.activity.MainActivity$$ExternalSyntheticLambda3
                        public final MainActivity f$0;
                        public final SharedPreferences f$1;
                        public final MaterialButton f$2;

                        {
                            this.f$0 = this;
                            this.f$1 = sharedPreferences;
                            this.f$2 = materialButton6;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            String str7 = "ۗۙۖ۠۟ۥۘۜۙۛۧۥ۫ۢۜۡۛۡۦۘ۬۬ۖۨۦۘۘۛۛۜ۠ۜۘۗۗۜۘۗۘ۟ۘ۬ۤۖۡۜۘۜۚۨۘۢ۟ۜۘۗۛۥۘۚۗۗ۠۫۬۠ۗۗۜۚۦۖ۟ۥۘۧۙۥۘۖۙۨۘۨۤ۬";
                            while (true) {
                                switch ((((((((((((((((((((((((((((((((str7.hashCode() ^ 425) ^ 974) ^ 954) ^ 258) ^ 48) ^ 286) ^ 684) ^ 405) ^ 898) ^ 869) ^ 660) ^ 175) ^ 857) ^ 220) ^ 532) ^ 497) ^ 471) ^ 683) ^ 215) ^ 729) ^ 519) ^ 796) ^ 589) ^ 419) ^ 994) ^ 682) ^ 104) ^ 642) ^ 313) ^ 545) ^ 522) ^ (-328613172)) {
                                    case -814116294:
                                        this.f$0.m249lambda$initMenu1$0$kentosloaderactivityMainActivity(this.f$1, this.f$2, view);
                                        str7 = "۫ۚۙ۠۬ۥۘۤۜۘ۬۠ۡۘۥۨ۬ۦۦۧۘۢۦۖۙۧ۠۟ۢۖۘۧۢۡۘۖۦۛۘۛۥۙۦۛۛۤ۟ۙۘۤ۟ۧۘۨ۬ۧ۫۫ۙۖۜۘۘۘۥۢۢۥۨۘۦ۬ۗۥۜۜ۬۟۠ۜۨۧۘ";
                                        break;
                                    case -148262721:
                                        str7 = "ۙۖۧۘ۟ۦۨۡۤۗۢۦۛۜ۟ۗۖۨۦۘۡۜۙۥۚۖۘۛۥۜۘ۠ۢۖۘۧۗ۠ۘۛۢ۠ۚۡۜۦۙ۟۟ۦۘۢۡۧ۠ۦۛۧۚۖۘۛ۟ۦۘۤۡۖۨۛۥۘ۫ۡۨۘ۠ۦۦۘۗۨۙۗ۫ۢۨ۬ۜۘۥۛۡ۬۬۬ۤ۠ۙ۠ۜۖ۬ۥۙۛۛۖۘۤۥۨۥۜۦ۬۠ۡۜۛۨۘۨۢۗۙۛۥۗ۬ۖۘۨۧۡۛۙ۫ۛۢۨۘۧۢۡۘۗ۠ۖ۠ۛۥۘ";
                                        break;
                                    case 724988351:
                                        str7 = "ۧۢۖ۟ۚۡۤ۫ۚ۬ۗۥۘۧۜۥۧۧۚۧۘۖۘ۠ۨۨ۟ۨۚۙۧۧۢۨۨۢۥۨۖۧۘۧ۟ۘ۟ۗۦۨۘ۬ۨ۟ۚۧ۬ۜۡۤۘۘۚ۠ۚ۫۟۫ۜۦۢۚۦۧۘ۠ۙۖۧ۠ۚ";
                                        break;
                                    case 1676039564:
                                        return;
                                }
                            }
                        }
                    });
                    str = "ۢۦۦ۫۟ۦۥۡۢۥۘۖۘۜۦۛۘ۟ۤۚۙۥۘ۫ۤۨۖ۫ۘۘ۬۠ۖۘۛۢۘۘۘ۬ۧۥۗۢ۫ۛۜۢ۬ۧۥ۬ۛۘۙۚۖۨۘۜۘۜۘۜ۬۫ۙۨۘۗۘۜۘۥۨۥۘ۟ۙۚ۬ۛۜۙۡۨۘۦ۠ۖۘۚۢۚ۟ۦۦۘ۠۬ۦۥۜ۫ۦۙۨۛۥۡۘ۠ۤۢۛۛۖۘ۟ۘۤۘۖۜۘ۬ۗ۬۠ۛۡۘۛۖۜ";
                    break;
                case 607601804:
                    checkPackageStatus(textView3, materialButton3, Deobfuscator$$app.getString(-3440731647499919177L));
                    str = "۬ۡۡۧۧۢۥۤۡۢۗۛ۬۫ۜۘۖۤۢۘۛۨۘ۠ۚۥۘۙۨۡۘۚ۠ۛۡ۟ۘۘۛ۫ۗۜۨ۫ۧۧۢۥ۬ۛۙۡۦۢۤ۠ۖۙۖۘۘۡۤۤۛۦۦۦۥۡۢۨ۟ۧ۠ۜ۟ۤۤ۫ۡۘۛ۟ۤۜ۟ۡۛۘ۟۫ۛۖۨ۠ۗ۟ۖۘۚۦۛ۟ۦۨۘۧۦۜۘۚ۫ۗۛۢۥۧۡ۫ۦ۫ۖۘۜۗۤۥۦۖۘ";
                    break;
                case 819187910:
                    str = "ۢۧ۟ۖ۬ۨۘۚۚۚۙۚۖۘۧۚۥۦۚۙۖ۫ۡۘۘۘۘۧ۬ۨۘۢۚۨۘۢ۫ۤۨۙۥۤۡۖۧۗۛۨۥۗۘۤۨۚ۟ۛۨۜ۠ۖۘ۟ۗۥۡ۬ۜۛۧۨۧۜۖۖۜ۟ۜۚۛۦۤۙۜۢۡۘ۟۠۠ۧۜۡۛۙۙ۟ۥۗۚ۬ۛ۟ۘۘۚۦۜۖ۫۫ۙۙۙۨۧۤۚۚۢۤۜۦۘۙۧ";
                    materialButton3 = (MaterialButton) findViewById(C0931R.C0934id.InstallKR);
                    break;
                case 1037076332:
                    checkPackageStatus(textView2, materialButton2, Deobfuscator$$app.getString(-3440731437046521673L));
                    str = "ۤ۬ۗۦۗۨۘ۠ۢۡۘۤۗ۫ۦۨۘۖ۠ۦۡۙۘ۬ۧۘۙ۠۫ۗۧۧۙۙۡۘۖۛۘۘۖۤۜۘ۬ۨ۫ۥ۠ۨۙۢۡۘۤۘۚۛ۬ۢۧۥ۫ۗ۫ۢ۟ۦ۟ۖۡۖۛ۫ۦۘۖۢۚۧ۫ۡۗۢۨۘۘۧۢۘ۬ۙ۟ۙۨۘۧۘۖۤۦۘ۠ۗۗۜۤ۫ۨۦ۬ۦۚۦۚۚ۫ۚۚۛۚ۬ۜۙۚۥ۫ۦۙ";
                    break;
                case 1352642016:
                    str = "ۗ۠۟ۚ۫ۘۦ۟ۦۘ۟ۢۢ۟ۨۥۘۙۗۥۘۛۦۜۗۨۨۙ۬ۜۚۢۡۘۧۖۢۛۜۙۨ۫ۡۘۗۤۨۘۘۡۤۗۖ۬ۜۚۗ۟ۘۧۘ۠ۜ۬۬ۜۙۛ۟ۦۘۨۦۨۦۧۛۖۗۖۥۖۦۙ۠ۖۡۧۥۥۦۖۢۥۘ۫ۦ۫ۨ۬ۧۗۡۦۨ۟ۘۘۜ۠ۧۡۧ۫۟ۥ۫ۘۦۘۢ۫ۦ۠ۘۨۘۖۜۘ";
                    materialButton6 = (MaterialButton) findViewById(C0931R.C0934id.id004d);
                    break;
                case 1544604126:
                    str = "۟ۢۤۨۛۥۘۙ۠ۨۧۦۖۘ۬ۛۨۚۥۨۤ۫ۤۦۤۥۘ۟ۛۦۘ۫ۢۡۘۙۛۡۘۢۙ۠ۡ۫۟ۘۡۢۦ۟ۦۘ۬۠ۜۙۨۘۘۙ۠ۖۦۚۜۛۡۘۨۨ۫ۛۚۦۘۛۧ۟ۙ۟ۜ۫۫ۨۘ۟ۜۙ۬ۨۨۛۛ۠ۗ۬۟ۙۘۘۗ۟ۥۘۙۛۤۖ۠ۨۘۙۙۦۧ۬ۨۘۜۡۛۡ۠ۗۡۡۢۖۛۧ۟ۖۛ";
                    textView5 = (TextView) findViewById(C0931R.C0934id.id02891);
                    break;
                case 1661716307:
                    str = "ۥۘ۬۠۟ۡۘۜ۬ۘۘۨ۬ۙۨۦۗ۬۠ۘۚۖۥۙ۫ۨۦۨۧۢ۟ۖ۬ۜ۫ۘۘۘۤۘۖۘۙۦۧۘۖۡۛ۬ۗۥۘۘ۫ۖۢ۬ۤۜۖۡۢۘۖۥۨۤۨۡۘۡۘۗۥۚۖۘۦۘۦۧۨۦۨۤ۬ۦ۬۫ۛۛۘۤ۫ۖۘۙۖۘۘ۫ۦۥ۫ۡ۬ۚۥۨۘۚۗۘۘ۠ۥۜۦۤۧۛ۠ۨۘۙۧۡۘۜۗۡۘۗۧۜۘۚ۬ۤۢۛۖ۠ۧ۬ۚ۬ۡۘ";
                    materialButton5 = (MaterialButton) findViewById(C0931R.C0934id.InstallTW);
                    break;
                case 1787176857:
                    return;
                case 1797773566:
                    materialButton6.setTextColor(getResources().getColor(C0931R.C0932color.color0027));
                    str = "ۗۗۨۘ۠ۗۡۡۘ۟ۘۨۥۘۨ۟ۥ۬ۚۜۘ۫ۧۨۗۖۧۘ۫ۙۜۘ۟ۤۖۥۜۗۛۨۧۘۧ۟ۦۢ۟ۚۧ۬ۖۖۜۨ۫ۥ۬ۚۡۘۘ۬۬ۘۘ۬ۡۖۘۧۙۚۖۡۡۗۤۜۘۙ۬ۡۨۚ۬";
                    break;
                case 1885175453:
                    str = "ۧۛۤۨۧۨۘۡۨۛۙۙۗ۟ۤ۟ۗۛۗ۠ۥۘۘۜۤ۫۬ۛ۟ۨۖۧۘۥ۠ۖ۬ۨۡۘ۫ۜۗۦۦۢ۫ۨۢۖۘ۠ۘۥۜۘۗ۫ۦۘۤ۬ۖۛ۟ۢۙۘۥۘۛۦ۟ۨۡۥۥۨ۠۠ۘ۬ۛۘۥۚۜۡۘۨۘۨۥ۫ۗۜۥ۠ۜۘۛۛۜ۠ۗۖۙ۟ۥۘۗۨۖۜۖۦۦۗۡۘۤۢۙۗۡۖۧۖۙ";
                    textView4 = (TextView) findViewById(C0931R.C0934id.id0218);
                    break;
                case 1919475567:
                    checkPackageStatus(textView4, materialButton4, Deobfuscator$$app.getString(-3440731570190507849L));
                    str = "ۜۙ۟ۡ۟ۘۙۦۦۜ۬ۖۘۡۦۤۚۘۢۙۚۥۘ۟ۜۨۘ۬۫ۚ۟ۚۨۘۢۙۡۘۨۤۨ۬ۥ۫ۥۚ۫ۛۙۜۚۘ۠۟ۤۜ۟ۨۖۜۖۛۚۨۘ۠ۙۤ۠۫ۖ۬ۚۘۢۚۛۥۦۢ۠ۚ۬ۨۙۘۡۙۨۘۗۧۘۨۖ۠";
                    break;
                case 1979200266:
                    materialButton6.setTextColor(getResources().getColor(C0931R.C0932color.color0023));
                    str = "ۨۖۦۚ۫ۦۘۡۨۜۘۢ۟ۖۘۨۤۖۘ۟ۙ۟ۘۙۥۘۗۤۤۢۡ۠ۜۘۥۦۦۨۘۜۤۢ۟ۖۤۧۚۛۚۚ۬ۦۖ۟۫ۚۛ۠ۖۚۜۖ۟ۜۖۡ۟ۤ۠ۡۚۘ۫۟ۥۘ۠ۤۥۘۖۡۦۨۜۖۘۗۘۜۘۧۥۦۤۥۘۢۦ۠۠ۦۦۘۖۙۨۦۙ۬ۖۚ۬ۘۨۢ";
                    break;
            }
        }
    }

    void initMenu2() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        ((TextView) findViewById(C0931R.C0934id.deviceInfoTextView)).setText(str.toUpperCase() + Deobfuscator$$app.getString(-3440730827161165641L) + str2 + Deobfuscator$$app.getString(-3440730818571231049L) + Build.VERSION.RELEASE);
        setupGameButton((MaterialButton) findViewById(C0931R.C0934id.InstallBgmi), Deobfuscator$$app.getString(-3440730767031623497L), 5, new Runnable(this) { // from class: kentos.loader.activity.MainActivity$$ExternalSyntheticLambda22
            public final MainActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str3 = "ۖ۟ۘۡۚۘۘۚ۟۠ۜ۫۠ۙۙۨۥۦۢۛ۠۬۫ۥۘۨۜۦۛۥۨۘۗۙۢۘۜۧۘۢۖۦۧۡۥ۠ۥۤۖۙۢ۠ۘۡۘۜۡۥۘۛۖۚۨۤۧۥۖۘۜۙۧ۠۬ۦۘۥۤۢۜۦۨۨۤ۠ۖۜۘۘ۫ۜۘۘۡۙ۫ۖۜۘۢ۟ۦۦ۠ۗۦۡۗۧۥۦۜۨۢۜۖۘ۬ۙۖۘۙ۠ۜۜ۠ۢۘۥۚ۟۫ۦۨۨۘۘۜۛ۠ۜۦۤۧۗۛ";
                while (true) {
                    switch ((((((((((((((((((((((((((((((((str3.hashCode() ^ 472) ^ PointerIconCompat.TYPE_GRAB) ^ 638) ^ 237) ^ 27) ^ 717) ^ 883) ^ 529) ^ 954) ^ 519) ^ 627) ^ 248) ^ 153) ^ 202) ^ 621) ^ 408) ^ 379) ^ 927) ^ 777) ^ 713) ^ 897) ^ 880) ^ 621) ^ 969) ^ 413) ^ 122) ^ 758) ^ 129) ^ 13) ^ PointerIconCompat.TYPE_CROSSHAIR) ^ 561) ^ 1919873430) {
                        case -111888642:
                            return;
                        case 309117541:
                            this.f$0.launchbypassNoRootin();
                            str3 = "ۜۧۤۗۤۜۡۥۨۘۧ۟ۥۘۚۨۦ۟ۧۧۙۜۢۢۛۜۙۘۥۚۤ۠۠ۢۙۨۦۤۖۜۘۙ۠ۜۘۛۘۧۗۚۗۧۖ۫ۚ۫ۦ۫ۡۢۗۤۗۛۧۘۘۧۦۨۘ۬ۜۧۘۙ۫ۡۘۚۚۧۦ۬ۛۡۦۨۘۧۜ۫ۛۢۜۘ۫۬۟ۖۤ۬ۦۢۦۛۜ۟ۨۢۚۡۦۘۢۧ۟۟ۨۧۘۨۜۜ۫ۨۛ";
                            break;
                        case 1546798973:
                            str3 = "ۜۧۨۙ۟ۨۘۗ۫۫۫ۘ۟ۙۘۗۨۢۘ۟ۜۘۗۘۦۦۗۧۦۢۦۨۜۘۘۥۖۨۘ۠ۙۡۘ۠ۥۘۧ۬۠ۡۢۨۘۗۨۨۘ۟ۙ۬۬۫ۡۚۘۗۖ۫ۥۢۘ۬ۚ۠ۘۘۙ۠ۢۙ۟۫ۡۚۦۘۛۗ۠۟ۘ۠ۖ۫ۤۗۥۧۘ";
                            break;
                    }
                }
            }
        });
        setupGameButton((MaterialButton) findViewById(C0931R.C0934id.InstallGlobal), Deobfuscator$$app.getString(-3440730419139272521L), 1, new Runnable(this) { // from class: kentos.loader.activity.MainActivity$$ExternalSyntheticLambda23
            public final MainActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str3 = "ۖۤۨۘۛۦ۟ۢۖۡۘۦ۬ۡۙ۬ۚۤۤۗۚ۠ۛ۬۬ۚۖۙۤۥۜۤۦۦۗ۠ۨۦۗۥۛۙۡۘۤۖۢۚۘ۬ۡۙۥ۫ۥۘۜۦۢۡۢۢۡۖۘۗۘۜۘۡ۠ۡۘ۬ۢۡۦ۫ۚۘۜۖۘۜۚ۫ۦ۠ۙ۠ۦ۫ۨۜ۟";
                while (true) {
                    switch ((((((((((((((((((((((((((((((((str3.hashCode() ^ 444) ^ 26) ^ 223) ^ 276) ^ 448) ^ 396) ^ 232) ^ 394) ^ 158) ^ 707) ^ 386) ^ 284) ^ 764) ^ 791) ^ 979) ^ 752) ^ 481) ^ 653) ^ 129) ^ 92) ^ 713) ^ 441) ^ 893) ^ 519) ^ 960) ^ 261) ^ 370) ^ 136) ^ 419) ^ 462) ^ 633) ^ (-1415391976)) {
                        case 485998275:
                            this.f$0.launchbypassNoRootgl();
                            str3 = "۟ۖۥ۟ۡۘۘ۬ۜۧ۫۠ۨۜ۬ۨۘ۠ۘۡۦۖۜۘۢ۟ۦۖۗۡۙ۫ۚۤ۟ۚۨۗۡۘۢۧۥۡ۬ۧۥۗۥۘ۫ۙۚۦۦۡۘۗۚۘۤۢۖۘۘۨ۠ۗ۬ۡۘۨ۬ۡ۫ۥۘۢۤۤۘ۟ۨۦۧۚۘۛۜ۠۫ۦۨۢ۫ۚۘ";
                            break;
                        case 1404726753:
                            str3 = "ۙۘ۠ۘۡۛۢۦۜۖۢۦۧ۠ۘۘ۠ۛۥۘۧۧۛۗۘۘۤۨۛۢۘ۟ۡۙۗۦۘۛۤ۬۬۠ۧۡۘۥۥۧۛۦۘۘ۬ۦۦۘۤ۬ۜۘۥۧۨۘۡۖۢۗۦۨۘۗۥۗۧۘۡۘۗۘۨۘ۠ۜۙ";
                            break;
                        case 1905505728:
                            return;
                    }
                }
            }
        });
        setupGameButton((MaterialButton) findViewById(C0931R.C0934id.InstallKR), Deobfuscator$$app.getString(-3440730354714763081L), 2, new Runnable(this) { // from class: kentos.loader.activity.MainActivity$$ExternalSyntheticLambda24
            public final MainActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str3 = "ۚۚۙۖ۬ۦۦۤۗ۟ۖ۬ۢۗ۬ۛۨ۬ۤ۫ۥۗۨ۬ۥۡۦ۬ۖۦۘۖۙۙۦۦۜۘۧۢۨ۠ۨۦۘۗ۬ۜۢۙۡۘ۬ۜ۬ۛۛ۠ۡۤۦۜ۫۟ۢۨۤۤ۠ۥۚۢۨۤۖۖۧۜۘۘۤ۠ۡۜۙۥۨۨۖۧ۫ۗ۟ۤۡ";
                while (true) {
                    switch ((((((((((((((((((((((((((((((((str3.hashCode() ^ 355) ^ 572) ^ 321) ^ 937) ^ 156) ^ 705) ^ 712) ^ 801) ^ 226) ^ 92) ^ 845) ^ 431) ^ 238) ^ 449) ^ 940) ^ 68) ^ 458) ^ 222) ^ 51) ^ 131) ^ 0) ^ FrameMetricsAggregator.EVERY_DURATION) ^ 599) ^ 14) ^ 2) ^ 763) ^ 171) ^ 812) ^ 965) ^ 352) ^ 521) ^ (-767285967)) {
                        case -1584479188:
                            str3 = "ۜۧ۬ۜۖۥۘۗۗۙۙۡۦۘۤۥۨۘ۫ۛۚۛ۟ۙۨۡۥ۫ۚۜ۫۫ۖۛۢ۬ۤۢ۟ۡۡۨۙۛ۫ۖۘۨۛۦ۬ۚۜۘ۠ۡ۠۠ۚۖۥۥ۠۬ۥۡۘۘ۟ۦۨۖۚۚۤ۟ۛۗۡۥ۫ۘۙۜۘۢۘۡۥۖۥۗ۟۫ۘۗ۬ۥۢ۠ۙۧۜۘۛۘۥۡۨۥ۫ۜۥۧۢۖۤۧۖۗ۬ۘۧۜۘ";
                            break;
                        case -1009152655:
                            return;
                        case 692477244:
                            this.f$0.launchbypassNoRootkr();
                            str3 = "ۧۢ۟ۛۚۖۛ۠ۛۛۘ۬ۙ۠ۥ۟ۖۜۘۛۥ۠۬ۦۧۥ۬۬۫ۜۡۘۖۗۤۥۧۧۜۨۘ۟۫ۖۘۨۗۜ۠ۜۛۘۨۗ۠ۦۧۥۨۦۘۘۙۢۘۗۧ۠ۖۘ۫ۙۥۦ۟ۤۤۙۤ";
                            break;
                    }
                }
            }
        });
        setupGameButton((MaterialButton) findViewById(C0931R.C0934id.InstallVNG), Deobfuscator$$app.getString(-3440730552283258697L), 3, new Runnable(this) { // from class: kentos.loader.activity.MainActivity$$ExternalSyntheticLambda25
            public final MainActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str3 = "ۘۗ۬۬۟ۜۥۘ۠ۗ۫ۙۜۖۘۡۖۥۘۡۛۥۘ۟۫ۚۡۥۡۢ۟ۚ۬ۨۜۘۦۜۡۨۜۥۖۨ۟ۜۘ۟ۛ۫۠ۗۨ۬ۘۧ۬ۤۘ۫۠ۜۧ۫ۡۜۘ۟۫ۛۨۜۖۘۛۦۡۢۛۤ۫ۗۗۛۧ۠ۨۢۘۘ۫ۦۚۥ۫ۥۘ۬۟۠ۧ۠ۢۜۥۖۥۦۨۘۛۘۘۙۘۢۚۛۥۨۗۘۘ۬۟۠ۧۢۜۘۤۤ۬ۛۥۗۤۗۜۛۜۨ۬۬۟";
                while (true) {
                    switch ((((((((((((((((((((((((((((((((str3.hashCode() ^ 268) ^ 328) ^ 630) ^ 959) ^ 785) ^ 858) ^ 211) ^ 187) ^ 456) ^ 914) ^ 965) ^ 463) ^ 101) ^ 997) ^ 328) ^ 117) ^ 745) ^ 587) ^ 924) ^ 61) ^ 483) ^ 97) ^ 881) ^ 725) ^ 180) ^ 573) ^ 811) ^ 612) ^ 195) ^ 15) ^ 963) ^ 376960316) {
                        case -2114953657:
                            this.f$0.launchbypassNoRootvn();
                            str3 = "ۡ۬۠ۜ۬۫۫ۗۥۘۤۧۛ۠ۜۧۘۨۛۙۡ۫ۜۘۢۙۥۘۥ۠ۡ۬ۨۘۖۘ۬ۚۜۦۘۚۧۛۛۥۘۜۢۤۦ۫۬ۚ۠ۦۘۧۧ۬ۖۤۡۧۦۥۙ۫ۖۧۧۨۘۖۨ۫۫ۤۡۢۢۡۥۚ۟ۜ۫ۖۤۗۚۨۚ۫ۧۜۘ۬ۧۘۘۢۨۗۧۡۦۖۗۗۚۥۗ";
                            break;
                        case 490813030:
                            str3 = "۠ۖۡۘۥۤۜۘۡۦۧۘۘۗۡۘۜۘۦۘ۬۬۬۠ۚۦۘۧۤۗۨۨۜۘۜۗۦۦۧۘ۠ۡۚ۠ۛۡۨۧۜۢۡۜۗۢۨۘ۟ۢۡۗۖۛۤۢۜۤۜۖۘ۠ۙۢۡۡۚ۟ۥۤ۟ۡۛۚ۬ۤۡۚۤۜۢۦۘۢ۟ۨۘۜۨۡۛ۫۟ۚ۫ۘۨۢ۬ۡۖۘ۬ۚۜۡ۬ۡۖۧۛۜۤۗۘۦۘۛۦۧۡۢۢ";
                            break;
                        case 873485541:
                            return;
                    }
                }
            }
        });
        setupGameButton((MaterialButton) findViewById(C0931R.C0934id.InstallTW), Deobfuscator$$app.getString(-3440730470678880073L), 4, new Runnable(this) { // from class: kentos.loader.activity.MainActivity$$ExternalSyntheticLambda26
            public final MainActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str3 = "ۡ۠ۥۚۦۡۢۥۡۙۡۜۛۤۨۘۙ۠ۖۘۢۦۗۗۢۧۧ۟ۘۦ۟ۘۘۖۤۡ۫ۗۦۘۤۜ۟ۨۨۥۤۤۜۘ۬ۙۡۘۡۖ۬ۥۡۧۘۤ۟ۜۧۤ۟ۤۖۖۢۦۘۢۗۧ۬۫۫۫ۙۤۙۤۜۖۢ۫ۜۗۡۧۥۘۦۧۡۘ";
                while (true) {
                    switch ((((((((((((((((((((((((((((((((str3.hashCode() ^ 871) ^ 893) ^ 746) ^ 235) ^ 132) ^ 366) ^ 400) ^ 854) ^ 555) ^ 539) ^ 925) ^ 689) ^ 837) ^ 686) ^ 296) ^ 458) ^ 674) ^ 863) ^ 346) ^ 626) ^ 141) ^ 974) ^ 999) ^ 79) ^ 881) ^ 84) ^ 741) ^ 676) ^ 947) ^ 916) ^ 201) ^ (-1993965975)) {
                        case -1633273544:
                            str3 = "۠ۥۢۖۛۥ۬۫ۘ۬ۖۗۤۧۘۘ۟ۢۥۘ۬ۘۨ۠ۨۙۢۗۥ۬۫ۨۗ۫ۡۘۡۛۗۚۚۚ۟ۦۥۨۤۜۘۧۤۘۘۛۖۛۛ۟ۢۛۥۛۦۥ۫ۚۢۥۡۨۧۛۢۘۘ۬ۚۘۘ۫ۥ۠ۛۨۥۥۚۘۘ۫۟ۥۗۨۘۘۚۨۚ";
                            break;
                        case -372098999:
                            return;
                        case 1086163856:
                            this.f$0.launchbypassNoRoottw();
                            str3 = "ۘۨۗۗۥۡۦۨۨۘۘۧۧ۠ۛ۟ۢۗۡۘۥ۫ۘۗۧ۠۫ۚۨۡۨۦ۫ۦۘ۫ۛۙۜۡ۬ۡۛۥۦۨ۫ۖۢۡۘۢۡۖۘۢۥۘۨۛۜ۬۫ۙۖۜۥۘ۬ۙۨۘ۟۠ۛۚۘۘۘۢۦۥۘ";
                            break;
                    }
                }
            }
        });
        SharedPreferences sharedPreferences = getSharedPreferences(Deobfuscator$$app.getString(-3440725729034985289L), 0);
        final SharedPreferences.Editor edit = sharedPreferences.edit();
        try {
            hiderecord = sharedPreferences.getBoolean(Deobfuscator$$app.getString(-3440725690380279625L), false);
        } catch (ClassCastException e) {
            edit.remove(Deobfuscator$$app.getString(-3440725918013546313L)).apply();
            hiderecord = false;
            edit.putBoolean(Deobfuscator$$app.getString(-3440725870768906057L), false).apply();
        }
        final MaterialButton materialButton = (MaterialButton) findViewById(C0931R.C0934id.hiderecord);
        updateHideRecordColor(materialButton, hiderecord);
        materialButton.setOnClickListener(new View.OnClickListener(this, edit, materialButton) { // from class: kentos.loader.activity.MainActivity$$ExternalSyntheticLambda1
            public final MainActivity f$0;
            public final SharedPreferences.Editor f$1;
            public final MaterialButton f$2;

            {
                this.f$0 = this;
                this.f$1 = edit;
                this.f$2 = materialButton;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str3 = "ۦۤۚۤۘۜۥۤۢۙۡۖۚۛ۫ۢۢۚۚۥۜۘ۬۬۫۬ۙ۠ۗ۠ۗۘ۬۠ۥۖۖ۬ۥۚۖۡۘ۟ۚۜۦۥۘۡۥۘۢ۫ۙۚۜ۟ۥ۟ۡۥۙۚ۟۠ۦۘۥ۫ۛ۟۠۠ۡۙ۠ۛ۠۟ۤ۫ۢۨۨ۬۠۫ۖۚۢۙۘۧ۟ۖۜ۟۠ۧۘ۫ۖۢۙۛ";
                while (true) {
                    switch ((((((((((((((((((((((((((((((((str3.hashCode() ^ 791) ^ 580) ^ 219) ^ 160) ^ 649) ^ 143) ^ 437) ^ 506) ^ 71) ^ 88) ^ 563) ^ 695) ^ 339) ^ 761) ^ 152) ^ 46) ^ 210) ^ 704) ^ 518) ^ 465) ^ 807) ^ PointerIconCompat.TYPE_NO_DROP) ^ 16) ^ 409) ^ 112) ^ 248) ^ 384) ^ 504) ^ 382) ^ 884) ^ 259) ^ 1693642961) {
                        case -1850740310:
                            str3 = "ۦۨ۠۬ۘۢ۠ۢۜۘ۫ۛۛۢۛ۫ۧ۟ۘۜۛۡ۬ۜۘۜ۫۠۬ۧ۬۠ۧۘۙۜۡۘۧۤۘۘۜۤۤۖۥۧۛۦۢ۠ۜۜۘۡۙۤ۠ۤۦۡۛ۟۬ۦۧ۬ۚۤۛۜۤۦۡ۠ۡۙۗۙۛۦ۬۫ۨۘۖ۠۬ۜۘۘ۟ۡۘۘۖۥۡۘۥۢۚۗ۬ۨ۬ۢۥۡۚ۬ۢۚ۠ۜۧۦۥۙۛۡۨ۟ۥۗ۬";
                            break;
                        case -713249487:
                            this.f$0.m250lambda$initMenu2$1$kentosloaderactivityMainActivity(this.f$1, this.f$2, view);
                            str3 = "ۢۜۙۨ۬ۤۧۤۛ۠۠ۚۚۖۤ۟۫۫ۢۨۡۨۜۖۘۡۚ۬۬۫ۜۨۗۨۧ۟ۥ۟ۨۘۖۡۖۘۡۢ۫۠ۤۜ۟۠ۖۘۦۗۦۗۨۢۚ۟ۘۧۡۗۖۘۘۥۢۤۥ۬ۚۖۥۖۗۨ۟ۨ۟ۥۘۜۡ۠ۜۘۤۡۘ۟ۢۨۦ۫۬۟ۜۦۨۘ۠ۥۦۘۜ۫ۚۗۥۧ۟ۛۥۖۖۚ۫ۛۜۘۢۚ";
                            break;
                        case -695774301:
                            return;
                        case 1375863251:
                            str3 = "ۙۙۤۧۧۛ۠ۧۦۘ۠ۨۜۘ۫ۥۤۡۚۨ۬۫۫ۢۥۙۖۢۧۨۚۢۡۢۡۛ۫ۙۜۗۢ۟ۡۥۡۜۥۜۦۖۘ۬ۜ۠ۢۗۦۘ۟۫ۙۜۦۘۙۡۥۘۙۙۘۘۥۖۖۘۧۦۧۗۥۤ";
                            break;
                    }
                }
            }
        });
        ((MaterialButton) findViewById(C0931R.C0934id.id010d)).setOnClickListener(new View.OnClickListener(this) { // from class: kentos.loader.activity.MainActivity$$ExternalSyntheticLambda2
            public final MainActivity f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str3 = "ۛۨۙۡ۠ۙۖۥۖۘۢ۫ۡۗۙۦۚۗۘۘۛۤۧۥۨۡۘ۬ۙۜۢۙۧۢ۬ۛۢۦ۟ۧۡ۬۬ۨۨۦۖ۠ۘۛۡۥۘۗۖۢۧۨۡۜ۬ۛۘ۬ۗۧۥ۬ۡۙۧ۟ۛ۟ۛۛۜۢۜۚۨ۫ۙۦ۫ۢۗۥۘۦۙۥۜۗۘۤۗۗۚ۫ۥۙۧ۠ۥۛۖۖۖۤۜۥ۫ۜۘۛۛ۟ۤۢۙ";
                while (true) {
                    switch ((((((((((((((((((((((((((((((((str3.hashCode() ^ 631) ^ 460) ^ 266) ^ 423) ^ 339) ^ 63) ^ 820) ^ 380) ^ 289) ^ 769) ^ 73) ^ 581) ^ 999) ^ 193) ^ 270) ^ 214) ^ 856) ^ 57) ^ 160) ^ 323) ^ StatusLine.HTTP_PERM_REDIRECT) ^ 822) ^ 686) ^ 94) ^ 865) ^ 48) ^ 253) ^ 106) ^ 301) ^ 523) ^ 388) ^ 1665977130) {
                        case -2014386932:
                            return;
                        case -475215101:
                            this.f$0.m251lambda$initMenu2$2$kentosloaderactivityMainActivity(view);
                            str3 = "۟ۨۜۛۙۨۘۢۖ۬ۥۡۢ۬ۙۜۘۤۦۘ۫۟ۙۖۡۛۙۢۨۢۙۤۖۜۦۙۘۧۨۖۥۡۜۘۘۜۤۗ۟ۜۘ۠ۛ۫۬ۗۚ۠۠ۜۜۦۥۘۙ۟ۢۡۘۙۗۚۘۘۡۧۥۘۧۗ۬ۢۜۜۘۙ۫ۗۨ۟ۖۘ۟ۛۚۖۗۨ";
                            break;
                        case 711471097:
                            str3 = "ۨۢۧۤۤ۟ۡۡ۟ۗ۫ۛۘ۟ۢۥۗۗۜۗۘۘۢۜ۬ۗۖۥۘۛۦۥۘ۟۟ۚۗۙۛۨۨ۠ۢ۟ۥۙ۟ۧۤۙۖۘۛۨ۬۟ۢۦۧ۬ۘۧۨۖۜ۫۬ۨۖۘۡۧۨۘۙۙۛۥۤۗۚۧۨۦۘۢ۬ۧۖۘۗۤ۫ۨۤ۟ۧۚۡۘ۟۟ۢۙۛ۬ۧۥۛۛ۟۟ۘۜۙۗۡۘۥۘۤۨۘۥۘ۬ۚۡۘۡۜۜۘۤۘۚۚ۠ۜۘ۠ۖۦ۫ۖ۫";
                            break;
                        case 761837730:
                            str3 = "ۧ۫ۛ۟ۛۤۢۖۜۘۧ۬ۧ۬ۛۧۖۛۛۛۘۡۘ۬ۥ۟ۥ۟ۖۘۢۛۚۦۡۦۧۢۡۘۦۗۘۧۡۤۛۨۚۢۥ۬ۛۧۨۘۨۘۦۘۖۜۗ۟ۛۛۛۤ۫ۥ۬ۦۘۜۥۜۛۗۡۖۛۗۖۢۥۛۛۖۦۨۤۦۘ۟۬ۢۤۨۚۚ۫ۥ۫ۙۧۚۦۥۨ۟۫";
                            break;
                    }
                }
            }
        });
    }

    public void installGameWithObb(final MainActivity mainActivity, final String str) {
        String str2 = "ۗۛۥ۠۠ۘ۟ۤۚۘۨ۬ۖۙ۟ۙۦۡ۫۬ۖۘۥ۫۬ۚۦۙۘۤۥۘۤۧ۬ۘۢ۫۫ۧۙۗۜ۠ۡ۟۫ۛۦ۠ۙۡۨۘ۟ۛۘۥۤۖۦۘۚۘۛۡۦۡۘۤۙۗۧۙۡۦۖ۠ۖ۠ۥۘۗۚۖۘۡۘۥۖۦ۟ۢۧۗۨۘۘۛۙۧ۠ۗۖۘۚۗۘۘۘۤۦۘۗۙۛ۟ۦۦۥۡۤ۠۬ۖۥۡ۠";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str2.hashCode() ^ 960) ^ 498) ^ 672) ^ 520) ^ 287) ^ 918) ^ 672) ^ 437) ^ 765) ^ 159) ^ 40) ^ 113) ^ 101) ^ 404) ^ 474) ^ 632) ^ 927) ^ 214) ^ 216) ^ 448) ^ 472) ^ 295) ^ 868) ^ 397) ^ 104) ^ 754) ^ 710) ^ 318) ^ 510) ^ 284) ^ 837) ^ 1150710445) {
                case -626350052:
                    str2 = "ۖۧۚ۟ۜۙ۫۟ۧ۬ۨۨۘۥۜۘۡۚۡۤ۟۬ۨۘۢۘۘۘۘۛۨۤۤۥ۫۫ۚۥۘۨۙ۬ۧۜۧۜۥۚۘۢۨۥۘۘۙۤۛۤ۬ۖۤۚ۠ۡ۬ۡۘۘ۠۫ۨۖۦۛۡۨۛ۟ۡۘۡ۟ۘۜ۬ۥۢۚۥۘۡۘۖ۬ۡ۠ۛ۬ۤۡۖۨۗۙۨۚۧ۠ۘۧ۫ۤۘۧۡۢ۫۟۠ۗۘۗۨۘۥۧ۬ۚۚۛۧۡۧۡۙۜۘۡۨۥۢ۟ۛ";
                    break;
                case -488038170:
                    return;
                case 755686552:
                    new Thread(new Runnable(this, mainActivity, str) { // from class: kentos.loader.activity.MainActivity$$ExternalSyntheticLambda16
                        public final MainActivity f$0;
                        public final MainActivity f$1;
                        public final String f$2;

                        {
                            this.f$0 = this;
                            this.f$1 = mainActivity;
                            this.f$2 = str;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String str3 = "ۗۛۘۛۤۨۗۡۙۥۤۘۥ۟۟ۨۦۗ۟۫۫ۨۜۘۦ۠ۖۢ۟۫۬ۚۗ۫ۦۗۛۡۘ۫ۧۥۨۛۦۥۗۛۡۥۢۖۨۖۘ۫۫ۥۘۖ۬۟ۘۧ۟ۢۗۥۘۥ۬ۨۘۢۦۜۜۜۘۗۢۜۘ۫ۙۜۘۦ۫ۢ۟ۖۜۘۜۚ۬ۚۜۡۘۢ۠۟ۘ۟ۚۢۘ۫ۙۦۧ";
                            while (true) {
                                switch ((((((((((((((((((((((((((((((((str3.hashCode() ^ 311) ^ 891) ^ 652) ^ 771) ^ 88) ^ 965) ^ 108) ^ 631) ^ 325) ^ 603) ^ 614) ^ 946) ^ 838) ^ 49) ^ 371) ^ 572) ^ 978) ^ 806) ^ 852) ^ 707) ^ 148) ^ 838) ^ 422) ^ PointerIconCompat.TYPE_CELL) ^ 652) ^ 775) ^ 298) ^ 81) ^ 977) ^ 549) ^ 600) ^ 1912727672) {
                                    case -1757142040:
                                        this.f$0.m254lambda$installGameWithObb$14$kentosloaderactivityMainActivity(this.f$1, this.f$2);
                                        str3 = "ۤ۠۫ۛۘۘ۠۬ۜۤۥۖ۬ۡ۟۟ۛ۠ۥۥۦۘۗ۠ۢۦۡۨ۟ۗۡۘۤۜ۟ۖ۫ۙۥۨۦۘۡ۫ۙ۠۠۠۠ۧ۫ۛۦ۟۟ۛۥۧ۠ۨۤۨۚۛۙۙ۠۠ۦۘۜۡۤۛۤۛ۬۠۬۬۬ۧۜۘۤۤۖۦۥۤۚ۠۟ۛۛ۠ۡۘۡۘۥۘۘۖۨۘ۠۟ۘۥ۬";
                                        break;
                                    case -175816384:
                                        str3 = "ۘۧۨۘۤۗۖۖ۫۫ۥ۬۟ۙ۟ۦۘ۟ۤۤ۬ۛ۬ۥۘۨۘ۟ۦۚۡۖ۬۬۬۫ۧۚۜۘۥ۠ۖۖۧۛۥۨۖۖۡۗۢ۟ۗ۫ۛ۠ۥۘ۬ۗۘۖۢۥۘ۬ۨۨۘ۟ۘۨۘۚ۠ۥۘۡۚۡۘ";
                                        break;
                                    case 586684135:
                                        return;
                                }
                            }
                        }
                    }).start();
                    str2 = "۬ۧۨۖۘۛۦۘۙ۠۬ۛۡۜۘۛۧ۬ۗۖۧ۬ۦۚۖۦۖۤۥ۫ۗۢۦۘۛۙۤۥۥۤۧۡۤ۟ۙۜۘ۫ۙ۟ۧ۟۫ۘۦۖۘ۟ۢۦ۠ۡۙۡ۟ۚ۫ۗۜۙ۫ۜۢۨۖۚ۬۟ۙۙۦۖۢۚ۠ۨۨۚ۫ۤۦ۠ۜۘۙ۠۫۟ۥۢۧۢۦۘۖ۬ۢۨ۠۫ۙۗۖۘۘۙۦۘۡۜ۠۟ۜۖۢۦۢۤۤۢۥۢۦۘۢۛ۟ۛۚۖۜۡ";
                    break;
                case 1197971397:
                    str2 = "ۘۥۥۧ۟ۗۥۥ۬ۧۥۥۘۧۦ۠ۦۗۡۨ۫ۦۘۨۧ۟ۨۛۚۦۤۤۡۤۤۥۘۖۖۜۥۥۡۘۙۥ۠ۧ۟ۗۦۥۦۘۡۢۧۖۨۗۦۖۚۖۘۥۚۥ۬ۧۧۗۤۗ۟ۨ۬۬۟ۢۥۘۢۛ۫ۦۨۤ۠ۛۖۘ۫ۡ۠";
                    break;
                case 1907891884:
                    str2 = "۟ۙۘۖۛۖۖۦۘۥ۬ۛۛ۟ۚۖ۬ۗۥۦ۠ۘۧۚ۟۟ۢۜۖۜۘ۟ۡۧۧۚۜۚۧۛۛۥۘۧۧۖۘۥۜ۬ۜۢۜۤۗۨۗۦۘ۟ۨۧۘۢۢۘۛۦ۠ۖۧۜۜۦ۫ۥۤۖۦۙ۠ۖ۠ۢۜۚۚ۬ۦۘ۫ۢۤ۫ۤۜۘۧۖۢۘۧ۬ۚ۠۫ۡۛۘ۫ۘۨۚۛۦۗۦۜ۫ۤۧۡۖ۠ۖ۫ۦۨۥۘ۠ۦۜۘ۠ۥ۫ۖۜۤ";
                    break;
            }
        }
    }

    public boolean isInstalled(String str) {
        String str2 = "۬ۨۜ۬ۥۧۘۘۙۜۘۙ۬ۗ۟ۧ۬ۨۨۙۦ۠ۘۤۘۜۘ۠ۦۖ۫ۗۤۧۘۢۛۙۤۦ۟ۨۤۧۤۛۦۧ۬۬ۛۦۚۘۘۙۘۛۧ۫ۧۨۥۡۘۛ۠۟ۤۚۤ۫ۖۥۘۨۖۜ۫ۛ۫ۤۚ۬۫ۡۖۘۢۙۚۨۖۗۦۜۤۢۨۘ۟۠۬ۢۢ۠ۨۥۡۘ";
        while (true) {
            switch (str2.hashCode() ^ 2066549392) {
                case -1543382314:
                    str2 = "ۤۥ۟۠ۡۖۘۥۙۜ۠ۢۦۙۨۛۜۤۙۚ۟ۨۘۥۙۡۧۨۧۗۢۥۛۜۛ۬ۨۥۘ۬ۤ۟ۧۧ۟ۙۦۜۙۡۥۘۚۛۡۖۙۡۘۡۜ۟ۦ۫۫ۡ۫ۚۚ۟ۖۢۜۥۥۙۧۤۘۦ۬ۗۨۧۡۙ۠۬۠ۧۤۘۘۨۙۥ۫۠ۗ۬۬ۥۛ۟ۜ۫ۧۢۡۦۘۘۦۦۦۜۧۦۘ۠ۨۤۘۜۥ۟۫ۖۘ";
                    break;
                case -1009211623:
                    String str3 = "۬۟ۜۘ۟ۤۨۘۛۦۥۘۖۜۤۥ۠ۚۧۤۦۘ۟ۗۦ۟ۢ۬ۗۘۧۙۦۘۢ۬۟ۚۧۥۘۦۦۧۘۜۗۦۨۛۗ۟ۤۥۘۧۤۛۨۦۢ۫ۗۦۡ۬ۤۙۦۖۗۜۤ۟ۗۦۘۜۥۦۗ۠ۤۢۨۖۘۘۘۗۘۡۧۙۡۤ۬ۚۨۧۢۢۧۤۖۘۥۦۥۘ۠ۥۜۘۘ۫ۛۚ۠ۧۤ۬ۜۘۧۜۚۙ۟ۖۖ۬ۘ۠۫ۨۘۙۦۘۘۥۛۚۗۨۗۧۛۗ";
                    while (true) {
                        switch (str3.hashCode() ^ (-434927576)) {
                            case -1012994615:
                                str2 = "ۨۚۙۚۨ۫ۡۛۡۢۙۚۘۨۙ۟ۥۜۜۢۜۘۙۧۨۘ۠ۚۥۘۢۗۘۜۗۢۡۗۗ۬ۛ۟ۦۧۡۘۖ۠ۧۧ۬ۖۘ۬ۤۖۘ۬۠ۡۘۖۢۧۢۨ۬ۛۥ۟ۛۢۥۖ۬ۘۘۗۛۥۧۡۖۨ۬ۜۥ۟ۦ۫ۚ۫ۨۚ۬۫ۨۦۤۘۜۖۜۦۘۦۗۦۘۨۥۦ";
                                continue;
                            case -586039899:
                                str3 = "ۨۗۥ۠ۢۖۢۤۥۜۖۘۥۢۜۘۧۧۘۥ۬ۤۗۨۗۦۖۦ۠ۜۗ۬۬۫۬ۢۨۘ۬ۧۗۦۛۘ۟ۘ۬ۨۖۥۘۜ۟ۖۘۧۢۘۘۡۗۙۙۛۤۚۨۖۙۚ۟ۧ۠ۨۘۗۗۚۘ۫ۥۡۦۖ۟ۡۙ۬ۜۦ۠ۙۢ۬ۥۙ";
                            case 826471780:
                                str2 = "ۥۤۖۥ۠۠ۧ۫ۛۤ۫ۨۘۗۛۡ۠ۤۥۘۚ۬ۜۗۡۥۗۘۙ۟ۗۢۜۧۚۜۨۙۘۚ۟ۛۨ۠ۡۘۙ۟ۖۘۢۢۗۜۢۖۚۛ۫۟ۘۘۧۥۥۛۘۥ۠۟۟۠۬ۜۙۖۗۚ۬ۥۘۥۙۨۦۤۜۚ۬ۗۜۥۜۢۖۚۧۥۡۦۜۖ۫ۢ۠ۜۘۨ";
                                continue;
                            case 1086313453:
                                String str4 = "۟ۡۨۡۢۦۢۢۘ۫ۚ۬ۜ۬ۜۘۘۙ۫ۙۜ۬۬ۖۨۘۥۦ۫۫ۗۗۗۙ۠ۢۙۖۖ۠ۙۦۡۜۦۤۤۡۨ۬۬ۦۘۡ۠ۖۚۘۥۜۚ۫۠ۜۦۘۜ۬ۧ۠ۛ۠۬ۤۤۤۤۚۧۨۧۘ۬ۛۤۡ۫ۡۘۥۜۧۘۚۤۤ";
                                while (true) {
                                    switch (str4.hashCode() ^ (-34261337)) {
                                        case -1727520713:
                                            str3 = "ۤۙۛۤۙۥۦۚۖۘۙۜۡۘۗۖۨۗۢۡۘۖۗۧۡۧۡۘۥۨۜۡۥۧۜۘۨۜۘۘۘۢۦۘۥ۠ۙۢۛۦ۫ۥۡۦۢۥۘ۬۫۬۬ۘۘۡ۬ۡۘۢۦۧۨۜ۫ۨۥۧۜ۠ۨۙۘۜۤۗۖۨۖۘۘۖۖ۠ۨۖۡۚۜۥۧۤۡۚۤۡۜۜۚۘ۫ۤۥۘۘ";
                                            break;
                                        case -241050109:
                                            str4 = "ۗۛۦۘۧۡۨۜۜۡ۟۫ۢۡ۠ۢۖۗۚۚۘۤۥۚۥۘۘ۫ۜۗۙۨۘۛ۬ۡ۫ۧۥۗۗۜ۟ۤۖۧ۫۫۟ۜۖۨۘ۠۬ۥۧۘ۬ۥۚۖ۠ۧ۟ۛ۟ۢ۟ۘۘۛۘ۫ۧۡۜۘۢۤۨۚ۠ۧۘۥۜۛۨ۬ۤۦۗۨۥۘ۟ۧۚۤۡۗۥۙۚۨۘۢۜۧۘۧ۬ۖۘۖۚۡۘۚ۫ۜۘۙۢ۟ۦ۫ۖۘ";
                                        case 540237562:
                                            str3 = "ۜۘۚۤۨۘ۠۬ۦۖۜۦۘۦۚۧۗۜۤۖۦ۠ۜۖۘۛۧۤۤۦۜۖ۬ۡۢۡۡۘ۟ۨۦۘۤۘۜۘ۟ۖ۫ۛ۠ۧۘۗۜۚۗۘۘ۟ۥ۟ۚ۬ۗۦۢۢ۬۬ۦۡۢ۫۟ۖۥۛ۬ۚۛۧۥ۫ۤۥۘ۫ۦ۟ۛۡۛ۠ۦۧ";
                                            break;
                                        case 581041268:
                                            String str5 = "۬ۨ۟ۖۨۦۘۨۤۘۘۘۡۦۨۖۛۙۛ۫ۖۖۧۤۛۗۡۧ۬ۨۧۙۡۢۙۤۤۜۘۡۦۖۘ۫ۛۖۘۖۧۛۥۙۢۥۗۥۘۜۢۛۚۖۡۥۦۗۢۖ۠ۗ۫ۘۘۦ۫۬ۧۢ۟۬ۘۜۦۙۛۦۥۡۘ۬ۨۚۦ۫ۖۘۦۧۨۘۖۗۥ۬ۢۡۘۛۗۜۘۨۨۜۘ۠ۜۨ";
                                            while (true) {
                                                switch (str5.hashCode() ^ (-1078417668)) {
                                                    case -1581144007:
                                                        String str6 = "ۗۘۖۘۢ۠ۨۚۗۤۧ۠ۥۘۗ۬ۙۥۤۜۤۦۗ۬ۢۘۘۧۜۛ۟ۧۦۧۗۜۘۗۥۧۘۖۗ۠ۜۛۘۘۤۨۡۨۙۤۡ۟ۚۜۖۗۗۨ۟ۖۨۚۖۚ۬۟ۙۙۥۨ۬ۡۡۘۙۜۙۦۜۦۜۙۤۦ۫ۜۥۥۘۘ۠ۘۦ";
                                                        while (true) {
                                                            switch (str6.hashCode() ^ 692544090) {
                                                                case -2034729367:
                                                                    str5 = "ۥۛ۠ۛۨ۟ۛۦ۟ۢۜۖ۠ۥۦۤۤ۠ۢۧۨۘۢۧۦۗۘۦۗ۟ۖۤ۬ۖۗۘۘۢ۬ۙ۠۟ۨۘۦۜۘۜۚۢۨ۟ۗ۬ۢۦۗۗۥۜۥۧۗۡۖۙ۠ۗ۫ۦۗۛ۟ۘۘۥ۫ۦۖۡۡۡ۫۬ۦۥۨۘۘ۫ۡۢۡۨۥۛۘۘ۫ۢۥ۫ۛۥۘۖ۠ۙۥۙۚ۠ۛۘۘۙۘ۟ۛۗ۟۬ۘۥۡۛ";
                                                                    break;
                                                                case -1833309957:
                                                                    str5 = "ۘۚۙۡۢۡۘۢۤۚۘۥۘۡۤۛۛۖۜۘۦۦۥۘۨۧۘۜۙۡۜ۟ۖ۫ۙۧ۬ۧۛۥ۠ۘۘۢۥۜۘ۟ۢۢۖۨۙۥۜۗۘۘۧ۬ۦۖۙۜ۠ۗۙۧۖۚ۬ۙۛۡۡۜۜۘۡۚۜۗۤۖۘ۫ۛۥۖۢۖۡ۫۬ۗۦۖۘۜ۫ۖۛۤۥۘ۬ۨۖ۫ۤۡ۟ۘ۬۠ۚۡۘ۠ۡۦ۬۫ۗ۟ۡۥ۬ۚ۬ۙ۬ۚۥۥۢ۬ۚۜۛ۟ۧۡ۬ۦ";
                                                                    break;
                                                                case -527138046:
                                                                    str6 = BlackBoxCore.get() == null ? "۬۠ۖۘۛۡ۬ۙۘ۬ۜۥۘۡۧۗ۟ۙۛۙۗۡ۠ۙۥ۟ۦۧۦ۫ۜ۬۫ۛ۫ۡۡۜ۬ۙۖۘۜ۫ۗۤۜۙ۟ۤۨ۬۬ۖۘ۟ۡۦۘۗۗۢۗۦۛ۠ۦۜۥۤ۬۬ۚ۠۠ۗۘۘۗۦۧ۫ۖۨۡۜۥۘۦۢۜۙۡ۬ۡۜۨۨۘ۠۟ۘۘۧۖۜۢ۠۬ۗۙۡۦۖۦ۠ۡۘۥۤۜۘ۬ۛۖۖۦۚ۟ۧۜۘ۠ۚۧۦۧۛۦۚۦۘ" : "ۗۛۥ۟ۦۘ۬ۚۜ۠ۦۘ۫ۥۦۦۡۜ۠ۧۜۘۨ۠ۥۘ۠ۖۡ۬ۘ۫ۛۦ۠۬ۢ۫ۘۘۚ۠۟ۡۥ۫ۦۘ۬ۢ۠ۧۘۗۘ۬ۘ۟ۧۥۘ۫ۧ۫ۗ۠ۘۚۢۦۘۘۢۖۘۗۤۦۢۘۡۨۥۦۘۘۤۡۥۚۧۥۘ۠۟ۙ۠ۘۥۘۙ۟۟ۚۖ۫ۤۗۖۨۗۙ";
                                                                case -16276789:
                                                                    str6 = "ۡۢۧۜۙۨۚۧۚۨۘۡۘۢ۠ۦۘ۟۫ۡۨۧۥۘۖ۫ۥۥ۫ۢۤۚ۬ۦۡۦۥۨۚۚۥۘۤۦۛ۠ۛۦۘ۠ۙۡۙ۟ۨۘۨ۟ۜۦ۟ۡۘۘ۟ۖۘۧ۫۠۫ۜۖ۠ۦۘۘ۠ۨۨۘۡۛۦۘ۫۫ۥۥۗۘۘۗۘۖۦۨ۬ۤۘۧ";
                                                            }
                                                        }
                                                        break;
                                                    case -930859432:
                                                        str5 = "ۥ۬ۖۘۘۨ۫ۧ۫ۤۙۗ۠ۛۙۦۦ۠ۥۘۤۥۚۖۗۚ۠ۤۨۜۚۘۦۡۘۜۛۦۘ۫ۜۦۘۘ۠ۖۘۗۛۧۜ۫ۘۡۥۛۡۦۤۜ۫۠ۦۧۘۘۙۖ۫ۤۤۜۘ۬ۡۙ۟ۛۚۦۙۧۡۦۚۜۧۙۧۥۘۥۥۖۘۖۛۨۘۤۗۗۡۘۦ۬۫۫ۤۡۘۢۨۖۘۥۖۗۛۨ۫ۤ۠ۡۜ۠ۡۜۦۧۗۗۨۗۚۨۘۜ۫ۡۘ۫ۤۨۘ۠ۜۙ";
                                                    case -235068950:
                                                        str4 = "ۙۗۖۘ۫ۚۘۛۗۛ۠ۛ۠ۤۖۛۙۥۨۧۙۘۘۦۙۗ۠ۘۗ۠ۗۜۖۦۜ۫ۢۨۘۙۙۦۘۦۦۨۚ۠ۖۨۙۖۘ۟۬ۢۢ۬ۡ۠ۨۡۘۨۢۦۘۥۥۙۡ۫ۦۘۨ۫ۥۘۡۢۘۘۛ۟ۛۜۧۥۗۤۥۖۚۢ۬ۤۖۘۘۜ۠";
                                                        break;
                                                    case 985065771:
                                                        str4 = "ۥۥ۬ۨۦۨۥۡۖۧۨۦۚۥۡۘۙۧ۟ۙۦۤ۠۫ۖۙۖۨۤۚۘۖۙۜۧۡۙۜۖۢۡۘۖۧ۟ۢۗ۫ۥ۫۫ۡۦۜۘۜۤۜۘۤۤۖۢ۠ۙۘۖۦۘ۬ۡۜۘۙ۟ۨۛۜۢۙۨۘۙ۬ۛۡۨۧۢۚ۬ۘ۟ۙۧۡۖۤۥۙۘۙۨۘۘۙۗۦ";
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -780813429:
                    return false;
                case -16494136:
                    try {
                        return BlackBoxCore.get().isInstalled(str, 0);
                    } catch (Exception e) {
                        return false;
                    }
            }
        }
    }

    public boolean isRunning(String str) {
        String str2 = "ۙ۠۠ۘ۟ۦۦۛۖۘ۫ۥۢۨۖۜۘۚۖ۫ۡۜۙۙۦ۠ۥ۬۟ۗۦۤۚۥۘۨۧۦۘۖۖۖۘۜۥ۫ۨۖۜۚ۠۬ۡۨ۠۠ۗۢۦۧۜۨۧۖۨ۬ۤۛ۫ۛۧۘۘۘۖ۟ۙ۫۫۟ۜۧۥۨۘ۟۫۬ۥۡۨۘ۫۬۠۬ۖۘۘۧۢ۫ۘۜۤۢۦۜۘۧۘۖۗۖۘ۫ۢۖۧۢ۠ۨۨۜۖ۫ۨۘۚ۟ۙۥۜ۬ۤۥۜۗ۫ۨۜۖۖ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str2.hashCode() ^ 47) ^ 661) ^ 602) ^ 819) ^ 186) ^ 369) ^ 967) ^ 498) ^ 109) ^ 760) ^ 818) ^ 579) ^ 605) ^ 406) ^ 288) ^ 484) ^ 878) ^ PointerIconCompat.TYPE_ZOOM_IN) ^ 25) ^ 969) ^ 182) ^ 866) ^ 523) ^ 138) ^ 293) ^ 115) ^ 797) ^ 720) ^ 316) ^ 402) ^ 237) ^ (-2131394006)) {
                case -1061426691:
                    return true;
                case 566472380:
                    str2 = "۠ۜۥۘۥۡۜ۠ۡۘ۟۬۠ۛۢۥ۟۠ۜۘۚۜۘ۟ۚۦۘۗۚۢۘۘۘۡۚۘۘ۫ۙۢ۠۟ۚۢۜۘۘۚۧۧۖۦۘ۫ۛۜ۟ۚۤۢۛۧۨۡۥۘۙۦۥ۫ۤۢۜۢ۬ۙۗۨۘۘ۬ۧ";
                    break;
                case 874241458:
                    String str3 = "ۥۥۡۨۢۡۛۨۘۨۖۘۘۡۛ۬۫ۛۡۘۙۢۥۧۗۨۥۡۨۘۤۚۧ۠ۚۥۤۛ۬ۨۘۜۛۢۙۗۘۢ۬ۖۜۦ۠ۨۜۧۘۧ۠ۙۛۢۦۤ۬۫ۤ۠ۡۘۥ۟۠۟ۦ۫۠ۧۨ";
                    while (true) {
                        switch (str3.hashCode() ^ (-1296427896)) {
                            case -1934216960:
                                str2 = "ۖۨۨۘۦ۟ۥۘۦۢۡۘۢۤۦۘۥۚ۬ۚ۟ۜۚۢۙۤۜ۟۠ۤ۫۟ۦۗۨ۠ۙۚۜۘۡۚۦ۟۠ۢۦۡۥۛۥۜۘ۠ۜۗۜۗۥۥۚۜۘۜۜۜۘ۠۫ۗۙۢۨۘۡۥۘۘۙ۠ۤ۫ۘۗۦۘ۠ۦۥۘۘۙۧ۠ۖۤ۬۬۫ۥۡۘۖۘۥۖۘۡ۬۠ۙۨۘۘۚۢ۫";
                                continue;
                            case -874574679:
                                str2 = "ۘۢۦ۟ۥ۟ۨۥۧۛۗۥۘ۫۬ۨۘ۟ۚۙۧۢ۠ۨۚۥۘ۫ۙ۬۫ۚۥۘۗۡ۫۫ۦۖۘۦ۟۟ۚ۠ۥۘۙ۫ۚ۟۠ۙۢۚ۬ۨۘ۠ۗۖۘۖۖۤۘ۬ۜۘۜ۠ۜۢۗۥۘۡۗۡۥۘۥۘۧۡۙۡۦۥۘ۠ۧۚۦۗۚۢۦۡۘۜۗۚ۠۫ۨۙۛۨۘۤۡۤۗۗۧ";
                                continue;
                            case 683292177:
                                str3 = "ۦ۬ۜۘۖ۬۬ۚ۬ۨۘ۠ۤۨۗۗۜ۟ۜۘ۫ۧۛۖۘۥۜۢۢۦۘۙۦۗۖ۠ۤۖۘۙ۬ۡۖۧۘۘۨۨۢۖۖۘۘۤۜۚۧۘۙۜ۟ۘۡ۬ۧۢۚۤۥ۬ۦۜۙۦۘۨۨۘۘۙۢۧ۫ۖۦۙۚۦ۟ۖۜۘۢۢۛ۟ۡ۫";
                            case 1716815111:
                                String str4 = "۠ۙۖۘۖۨۡۘ۟ۥ۫ۖۧۡۜۚۗۡۜ۠ۢۨۖۘۦۛۦۘۖۚۤ۠۬ۖ۟ۢۖۘۚۘۦۘۡۜۚۡۡۦۘ۬ۥۨ۬ۙ۬ۧ۫ۗۢۗۥۘ۫ۨۙۦۤۤۤۢۧۚۨۛۨۙۦۘۗ۫ۚۗۗۙۨۡۦۘ۬ۙ۟۟ۘ۟ۗۖۨۧۥۧ";
                                while (true) {
                                    switch (str4.hashCode() ^ (-1499471615)) {
                                        case -1723700729:
                                            String str5 = "ۤۗۡۘۚ۟ۡۨۚۨۘۨۖۢۖۨۢۚۜۨۘۚۥۥۙۗۡۘ۠ۥ۬۬ۖۡۘۤ۠ۘۘۚۗۘۘۨۢۢۗۙۖۘۥۖۘۨۤۜۘۡۦۨۘۦ۟۟ۤۛۗۖۜۤۚۛ۫ۘۤۤۥۗ۫ۖۥۘۘۖۙۜۘ";
                                            while (true) {
                                                switch (str5.hashCode() ^ (-768653114)) {
                                                    case -1355002968:
                                                        str5 = "۠ۤۘۘۦۥ۠۠ۥۦۤۡۘۘۧۥۘۡۧۦۘ۟ۨۘۥ۫ۜۘۧۘۛۥۚۖ۠۫۫۠ۦۨۛ۬ۚۥۜۧۧ۟ۜ۫ۛۧۜ۬ۨۖۜۖۘۘۘۡۘۢۥۖۘۜۡۘ۫ۜۚ۫ۖ۠ۘۚۥۘۤۜۦۘۜۖۢ۠ۥۨۤۨۧۖۨۥۘ۬ۢۨۖۧۜۘۖۧۘۢۡۖۘۖ۬ۘۘۥۢۜۘۙ۫ۦۘۗۘۘۘۧۛۡۢۦۦۘ۟ۜۥۘۗۡۥۘۙۗۖۨۨ۫ۘۦۨۡ۟۫";
                                                    case -129720153:
                                                        str4 = "ۨۙۦۘۤۙۡۦ۬ۖۘۜۘۦ۠۠ۥۘۜۜۨۧۡۡ۬ۖۗۥۘۙۧۦۗۧۧ۟۫ۘۧۙۗ۫ۜۨۛۡۡ۫ۘۚ۟ۜۖ۠ۚۘۚۚۚۘۘۤۜۘۧۡۗۘ۟ۥۘۗۤۖۘۡۢ۫۬ۗۗۦۗۧۡۘۘ۫۠ۜۦۦۚۨۤۥ۫ۖۨۙ۫ۡۘۡۨۦۨۢۡۨۜۘۘۗ۟ۥۜۥ۟ۘ۬ۖۘۥ۟ۥ۠ۘۛۜۘۜۘۘ۬ۥۘۘۙۘۢۚۖۘۦۙۨ";
                                                        break;
                                                    case -47490051:
                                                        str4 = "ۢۘۘۢۡۘۚ۟ۡ۬ۧۡۘۡۚ۬ۤۘ۫ۢۦۢ۬ۦۜۘ۫۫ۖۘۚۘۦ۬ۥۜۗۖۖۘ۫ۧۤۖۢۦۘۛۘۡۘۖۘۤ۟ۛ۟ۗ۬ۛۥۘۘ۠۟۫ۚۡۧۢۨ۠ۤ۠ۢۦۙۛۚۘ";
                                                        break;
                                                    case 1158251959:
                                                        String str6 = "ۘۢۡۘۨۜۡۦۨۤۡ۬ۜۘۛۦۘ۫ۙۥۘ۟ۢۦ۟ۙۘۨ۠۫۟ۧۥ۟ۘ۫ۛۦۡۘۧ۬ۗ۬ۧۚۥۖۜۘ۠ۢۜۘۧ۫۠ۡۧۘۘۗ۟ۜۘۗ۟ۨۘۨۛۖ۬ۖۛۥۚۦۢۤۧۢۚۚۢۖۦ۟ۜۨ۫ۙۘۡۦۘۙۦۗۘ۫ۘ۫ۧۙۖۚ۬ۖ۫ۗۢۙۦۨۦۘۨ۬ۨ۠۠۟ۘۗ۟ۨۖ۠";
                                                        while (true) {
                                                            switch (str6.hashCode() ^ 28388570) {
                                                                case -1895507929:
                                                                    str5 = "ۨۙۖۘۜ۠ۢ۬ۤۥۡۡۚۢۡۤۢۙ۟ۘۤۦۘ۬ۧۙۤۚ۟ۤ۬ۤۖۦۡۘۥۦۥ۫ۘۙۙۨ۠ۙۤۦۜۙۥۢۗۢۥۢۨۘۧۤۛۡۥۡۘۙ۫۬ۧۙۤۡۥ۫ۦ۠ۚۙۚۜۖ۠۠ۘ۬ۗۙۦۢ۠ۜۚ۟ۧ۠";
                                                                    break;
                                                                case -949821893:
                                                                    str6 = "ۡۜۨۘۗ۟ۥۡۜۖۦۡۘۦۗ۬ۜ۫ۙۛۦۢۜۤۗ۬۟ۥۦۨۘ۬۟۟ۧۧ۟ۜ۫ۜۘۗۜۡۘۦۜۡۘۨۚۜۙ۬ۨۘۛۦۜۘ۬ۗۢۧۡۘۧۖۜۘۘۤ۟۟ۥۗۛۨۡۘۖۡۥۙۥۘۛۤۙۥۘۡۘۘۜۡۘۧۡۘ۟ۧۘۘ۫ۙۘۤۚۜۘۛۛۖۘۘ۬ۖۥۖۜۘۢۨۦ۟۟ۦۘ۫ۨ۬ۖ۠";
                                                                case 516139593:
                                                                    str5 = "۫ۗ۟ۚۗۚۥۙۥۙۦۖۘۢۙۘۧ۬ۢۧۤۜۘ۫ۜ۬ۚ۠ۖۘۚۤۨۘۦۜۤۜۦ۟ۜ۟۫ۤ۫ۢۖ۬ۖۘۤۘۦۧۘۖ۬۫۫۬ۜۖۘۥۙۖۜۡۙۦۖۘۙۛۦۢۖۘ۬ۙۡ۫ۜۜۢۧۚ۟ۥۥۘ۫ۙۙۘۖۜ";
                                                                    break;
                                                                case 1008383616:
                                                                    String str7 = "۠ۘۦ۟ۙ۟ۧۙ۬ۢۗ۠ۘۧۧ۠ۦۦۘۨۘۨۢۘۦۘۢۡۛۛۦۤۡۚۢۤۛۗۧ۠ۤۖ۬ۥ۠ۨۡۘۜۧۜۘۛۢ۟ۖۤۛۡ۫ۧۡۜ۬ۧۗۚۛۡۥۘۧ۫ۙۛۢۤ۟ۤۧ";
                                                                    while (true) {
                                                                        switch (str7.hashCode() ^ (-1291220456)) {
                                                                            case -218668748:
                                                                                str6 = "ۦۡۜۘۥۙۨۘۘۡ۟۫۟ۗۜۥۡۘۡۧۚۚۨۥۨۤۚۙۛ۟ۧۡۗۖ۬ۜۦ۠ۡۘۨۧۥ۫ۤ۬ۗ۫ۗۢۛۛۦۗ۠ۨ۫ۖۧۙۚۦۙ۬ۦۡۨۘۖۘۨ۠۟ۜۢۚۦۦۛۗۢۡۥ۫ۚۨۖۥۙۢۛۜ۟۟۬۠ۛۦۘ۠ۨ۟ۜۘۦۘۧۧۢۡ۟ۘۘ۬۬ۙ۟۫ۥۘۥ۫ۧ۫ۖۧ۬ۧۦۚۚۥۗۖ۟ۚۙۡ۟ۢۡۘۥۚۨۘ";
                                                                                break;
                                                                            case 61767879:
                                                                                str6 = "ۧ۬ۚۛۧ۬ۡۡ۫ۡۢۜ۠ۗۨۘۥۦۖ۫۟ۦۘ۬۫ۦ۟۬۫۫ۤۘۘ۬۬ۦ۬ۛۦۘۘۨۤۥ۫ۘۜۢ۠ۖۘۧۚۛۡۧ۟ۢۗۖۡ۬۠۟۫ۜ۠ۨۘ۠ۤ۟۬۠ۧ۟ۙۜۘ";
                                                                                break;
                                                                            case 1812415598:
                                                                                str7 = BlackBoxCore.get() == null ? "ۦۦ۫ۖۧۚۘ۫ۚۨۘۥۘۜۚۧۗۛۚۤۢۡۘ۫ۙۖۘ۠ۨۥۢ۠ۖۖۙۥۘۤۛ۬ۗۙۧۨۢۦۘۨۢۦ۠ۗۨۘۦۛۘۜ۟ۥۘۤۧۘۡ۫ۢۖۦۘۖۚۘۘ۟ۛ۫ۥۨ۫۫ۥۥۡۦۘۘۘۜۡ۟ۧۦۘۥۘۘۗۜۨۛ۫ۧۥۧ۟۬۠ۥۘۖۢۛۗۜۨۛۗۦۘۚۢۜۘۚۙ۫ۛۛۜۖۙ۫" : "ۥۛۥۨۜۚۨۤۡۘ۬۬ۜۢۚۗۖۤ۠ۤۤۘۡ۫ۜۗ۫ۧۖۖۜۨ۠ۦۡۥۨۙۧ۫ۛۡۧۖۘۡۜۨۡۨۖۤ۬۬۫ۖ۠۟۬ۚۥۜۜۛۚ۠ۥۘۢۨۡۘۘۚۧۖۛۡۘ";
                                                                            case 2008009399:
                                                                                str7 = "ۧۖ۠ۚۛ۬ۖۤۗۛۦۜۖۙۗۘۘۘۙ۠ۚۥۥ۬ۤۖۨۘۨۗۗۧۦۖۡۦۖ۫ۚۙۛۥۘۘۨۗ۫۠ۙۜۖۨۘ۬ۚۡۘۗۖۘۘۥۦۧ۟ۥۤۛ۫ۚۛ۫۬۠۟۬ۗ۠۫ۚۚ۬ۦۥۗ۠۠ۦ۬ۜۖۘۦۙۜۘ";
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        case -1153985149:
                                            str4 = "۫ۧۘۘۖۙ۟ۖ۫ۦۡۗۡۢۖ۟۬ۜۦۘۙۚۨۘۤ۟ۦ۟ۦۛۙۜۦۘۛۗۜ۫۬ۢۥۛۧ۫ۙۨۖۚۖۘۤ۫ۡۙۙۧۜۥۡۘ۠ۤ۠ۧۦۡۘۚۨ۠۠۫ۙۘ۫۬ۖۛۡۙۛ۠";
                                        case -524589939:
                                            str3 = "۟ۚ۠ۢۖۘ۟ۧۨۛۚ۟ۥۧ۬ۚۛۡۖ۬ۥۘ۟ۥ۬۟۫ۧ۬ۡۤۦۨۘۢۛ۫ۛ۬ۘۘۨۧۥۦۖۨۨ۠ۢۦ۠ۨۗۗۗۛۘۘۜ۫۬ۢۜۘۗ۠۠ۦ۫ۙۚۦۥ۟۠";
                                            break;
                                        case -197941854:
                                            str3 = "۟۫ۥۘۡۙۢ۬ۛۙۨۖۗۛۙۧۥۚۘۥۧۡۘۖۜۦۘۜۖ۬۠۟۫ۢۥۘۘۢۛ۫ۢۜ۟ۥۛۦۚۡۤۘۘۢۘۘ۬ۘۦۡۦۡۘ۟ۨۧۘۗۙۙۢۨۡۘ۟ۘۗۥۤۦ۬ۡۥۚۤۚۙۚ۬ۛۥۥۘۢۖۘۘ۫ۨۦۘ۬ۤۡ۫ۡۙۗۚۥۘ۬ۚۤۜۨۥ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 1294395324:
                    return false;
                case 1631549174:
                    str2 = "ۥۧۡۚ۫۠ۙۡۢ۟ۨۛ۬ۥ۫ۢۧ۬ۗۚۡ۠۟ۥۡۧۘۡۖ۠ۜۚۢۘۦۢۤۗۥۡۖۧۖۛۛ۬ۛۖۘۖۖۥۘ۬۟ۜۘۛ۫ۥۘۤۜۖۗۘۥۖۗۥۘ۫ۜۡ۬ۦۧۛۙۖۥۦۡۧ۫۬ۨۜ۬ۘۡۘۢۦ۟";
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$initMenu1$0$kentos-loader-activity-MainActivity  reason: not valid java name */
    public /* synthetic */ void m249lambda$initMenu1$0$kentosloaderactivityMainActivity(SharedPreferences sharedPreferences, MaterialButton materialButton, View view) {
        boolean z = false;
        SharedPreferences.Editor editor = null;
        String str = "۬۟ۥۧۤۥۘ۠ۜۦۧۛۥۘۘۜ۫ۗ۟ۨ۬ۖۢ۠ۦۛ۠ۦۥۘۛ۬ۥۘۨ۠۟ۛ۬ۧۤۖۨۚۙۥۘۚۦ۟ۡۦۢۚۙۗ۫ۘ۟۟ۤۧۥۥۛۦ۟ۙۦۘ۬۫ۡۘ۟ۡۥۘ۬ۢۧ۬ۗۦ۟ۢۧۛۜۥۡۡۘۨ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 695) ^ 44) ^ 693) ^ 87) ^ 962) ^ 67) ^ 834) ^ 63) ^ 596) ^ 955) ^ 182) ^ 893) ^ 711) ^ 397) ^ 201) ^ 804) ^ 820) ^ 368) ^ 193) ^ 804) ^ 706) ^ 18) ^ 248) ^ 79) ^ 419) ^ 127) ^ 311) ^ 297) ^ 78) ^ 393) ^ 20) ^ 1219648323) {
                case -2024691983:
                    str = "ۘ۟ۡۘۘۥۤ۠۠ۙۥۦۡۖۙۧۚۖۘۧۘۨۘۚۨۢ۟ۧۧۧۡ۟ۢۙۢۙۖۡۘۤۢۨۖ۫ۤۡۜۖۥ۫۫ۘۨۘ۫ۡ۠ۤۜۧ۬۟ۡۘۗۥۨۘ۠ۙ۫۟ۗۡ۟ۖۘۜ۠۬۟۠ۢۙۨۨۘۗۖۢۢۙۜۛۚ";
                    break;
                case -1841800383:
                    Toast.makeText(this, Deobfuscator$$app.getString(-3440720347440963401L) + getString(C0931R.string.str001d), 0).show();
                    str = "ۙۧ۫ۧۡۡۘۡۦۚۤ۠ۜۨ۟ۧ۫ۧۦۥ۫ۡۘۛۡۙۗۢۥۡۦۜۘۥۧۘ۬۬۟۠ۤۙۜۦۗۥۚۢۡۘ۟۠ۧۡۘۘۙۦ۫ۖۥ۟ۢ۫ۜۤ۬ۚۛۙۦۚ۟ۘۤۖ۫ۧ";
                    break;
                case -1688380893:
                    materialButton.setIconTintResource(C0931R.C0932color.color0027);
                    str = "۬ۡۖۘۥۗۡۘ۬ۨۧۙۖۘۤۘۢۢۛ۟ۛۨۡۘۧۖۥۜۧۖۖ۟ۚۖۡۖۘ۫۫ۙ۫۠ۨۚۜۦۨۧۥۘۘ۫۠۬ۨۛ۬ۜۘۚۡۜۧۥۢۚ۟ۖ۫ۨ۬ۜۚۖۘۤۘۦۘۧ۟";
                    break;
                case -1434321425:
                    materialButton.setText(getString(C0931R.string.str001d));
                    str = "ۦۖۘۖۨۦ۫ۜۡ۟ۨۖۘ۠ۜۨۘۦۥۚۜ۟ۜۘۧۥۖۡۜۦۘۚۡۢۡۜۤۢ۬ۢۧ۬ۢۡ۫ۙۘۦۦۚ۟ۘ۬ۨۦۡۘۘۙۦۡۘۗۨۘ۬ۤۢ۟ۜ۫ۤ۫ۨۜۧۘۚۙۚ";
                    break;
                case -1352957484:
                    str = "ۘۦۜۛ۟ۡۦۥۜۘۗۨ۬۟ۛۨۘۙۖۖۥ۟ۨۘۜۙۨ۫ۘۡۘۚۚۥۘۗ۠ۜۘۢۗ۬ۙۖۧۘ۬ۘۜۘۖۡۦۖۥۖۘۚۘۧۘۦ۠ۧ۟ۧۘۘۨۢ۠ۦۚۦۘۚۘۜ۫۠۟ۤۛ۫ۖۦۥۘۧۢۦۙ۫ۡۖۥ۫ۤۨ۬ۧۚ۟۠ۚۖ۠ۚۖۧۖۨۘۙۘۧۘۢۨۙۥۜۢ۠ۙۥۤۚۨۘ۠ۦ۬۠ۗۗۖ۫ۙۦۜ۬ۧۤۖۘۖۚۗ۬ۨۗ";
                    break;
                case -1181611282:
                    editor.apply();
                    str = "۟۬ۢۚۧۙۜۗۡۘۛۘ۠ۦۡۢ۫۬ۡۘۘۡۧۚۥۙ۠ۥۥۨ۫ۧ۟ۥۘۥۛۚۖۙۚۥۤۛۤۖۘۛۜ۠۠۫ۧ۬ۤۘۨ۫ۦۧۤۡۤۡۦۘۙ۟ۜۘۛ۟ۦۘۛۢۨۘۡۧۖۘۦۗۙۘۡۖۘۚۤۤۤۙۙۢۢۜۘۧۦ۬ۘۚۘۧۦۜۢۜۥۜۡۡۘ۠ۧ۟۠ۛۛ۫ۢۖۘ۟ۚۤۛۧ";
                    break;
                case -1180562984:
                    Toast.makeText(this, Deobfuscator$$app.getString(-3440720300196323145L) + getString(C0931R.string.str001c), 0).show();
                    str = "۠ۨۛۖ۫ۛ۫۬ۜۦۙۙ۫ۖۘۘۘ۟ۦۘۢۗۜۘۙ۠ۡۢۙۙۦۙۘۚۥۘۜۙۖۘ۫ۙۦۛۤۡۘۙۚۦۥۛۘۛۗۜۘۘۘۦۖۖۚ۫ۨۛۢۨۘۡ۟ۨۘۥۗۢۙۤۜۤۢۜۘۥۤۧ۠ۨۦۘۥۛۨ۟ۚۨ۫۠ۧۥۜۙۧۦۘۘۨ۠ۢ۟۠ۚۚۜۖۙ۟ۚۖ۬ۜۢ۠ۘۘ۬۠ۚ۟ۤۜ۫ۨ۫ۥۧۢۜۥۘۧ۟ۜۦۡۧۘ";
                    break;
                case -966957783:
                    str = "ۡۥۡۘۘۨۛ۠ۖۨۘۚۙۜۙۗۥ۠۠ۨ۬ۜۦۘۢۤۦۙۢۡۥۢۤۢۚۨ۬ۤ۬ۛ۬ۘ۟ۥ۫۠ۙ۬ۖۢ۬ۚۥۜۜۘۡ۟ۜۘۘ۟ۥۘ۬۟ۡۘۦۨۨۘۜۗۦۘ۫ۘۚۦۧۖۘ";
                    break;
                case -880396018:
                    String str2 = "ۦۚ۟ۧۘ۟۠ۛۧۗۚ۬ۛۘۦۦۢۥۙۘۘۢۗ۠ۙۧۥۜۖۚۘۛ۫ۘ۟ۖۘۢۜۛۖ۬ۤۜۗۖۘۗۤۖۘۙۜۖ۫ۨ۠۬ۡۦۥۙۦۗ۫ۦۘۘۗۦۘۤۗۘۨ۬ۥۘۘۨۘۡۜۙۥۨۥۘۖۛۧ۟ۧ۫ۜۚ۟ۨۘۘۧ۟ۧ۫ۛۡۘۡ۠۠ۛۦ۟ۢۜۖۘۛۜۖۧۦ۟ۥ۠ۡۡۤ۫";
                    while (true) {
                        switch (str2.hashCode() ^ (-2058905831)) {
                            case -1678037188:
                                str2 = "۠ۨۛۤ۬ۤۖۡۡۘۨ۟ۥۘۡۚۜۘۚۤ۟ۨۧۘۚۦ۠ۥۥۧۘۙۘۦۜۘۡ۟۬ۗۧ۬ۥۦ۠ۥۘۛۧ۠ۦۡۘۙ۫ۖ۬۟۬ۙۙۦۢۤۦۢ۬ۘۘۜۜۨۘۢۜۗ۫ۢۨۗۙۥۘ۬۬ۙ۟ۚۡۘۢۜۨۘۘۖۨۘۡۧۛۨۙ۟ۚۧۜۡۡۘۘۜۧ۫ۙۥۦۗۚۨۛۛۘۨۢۚۢ۫۠ۥ۟ۦۤۢۨۘۦۚۡ۟ۛۚ۟۟ۢۙۨۧ";
                            case -366090406:
                                str = "۠ۘ۫۠۠ۡۘۦۘۥۥۥۧۤۡۥ۬ۥۙ۬ۙۖۘ۬ۖۤۚۗۖ۬ۨۜۘۢۨۘۧۜۚۥۗۚۢۘۘۡۦۡۘۜۛۙۖ۠ۢۜۜۘ۠ۥ۫ۡۥۖۢۘۚ۬ۡۘۡۧۤ۠ۘۘ۠۫ۤۛ۫ۨۘۡۙۨۘ۬ۘۤ۬ۤ۬ۚۦ۠۬ۖۨ۫۟۟ۦۘۘۢۨۜۧ۬ۥۘ";
                                continue;
                            case 1477890720:
                                String str3 = "ۙۢۡۘ۟ۙۜۜ۟ۙۖۡۜ۬ۦۢۖۗۦۘۛۤۡ۬ۡۥۘۧۤ۠ۨۦۨۘۖۢۤ۫ۖۨۙۙۢۘۖ۠ۧۧۜۘۛۦۧۧۖۚۡۦۘۗۚ۫ۖۥۖۨۘۦۘۦۚۘۘۘۨۥۨۜۧۘۨۢۥۘۚۜۖ۠ۦۥۘۦۨۦۘۛ۫ۧۢۚۨۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1502691810)) {
                                        case -1710653534:
                                            String str4 = "۠ۦۢۛ۟ۛۛۢۛۜۜۤ۫۬ۜۘۘۧۙۢۥۡۧۜۤ۬ۧۙۖۥۖۙۦ۬ۥۦ۠ۖۧۢۤۙۛ۫ۙۘۘۙ۬ۖۖۙۨۘۧۢۢۥ۟ۜۛ۠۫ۤۡۧۘۦۛۢۦۜۘۤۙۡۘ۬ۨۥ۬ۛۡۘۡ۫ۡۥۚۨۘۚ۫ۥۢ۟ۗۛۥۘۛۗۖۘ۟ۨۜۛۖۘۘۤۛۧ۬ۧۥۘۘۘۡۘۦ۬ۘۘ۠ۥۘۛۤۗ";
                                            while (true) {
                                                switch (str4.hashCode() ^ 625426546) {
                                                    case -1627444809:
                                                        str3 = "ۨ۬ۢۙ۠ۧۢۚۖۢۙۚۗۘۘ۟ۢ۟ۙۧۛۗۖۥۘۧۘۦۜۖۖۘۚۛۖۘۥۚۘۨۘۖۘ۬ۛۦ۫ۙۢۗۡۨۜۦۘۘۙۛۦۘۜ۫ۘۛۙۜۘۥ۠ۖۘۗۜۢ۬ۘۧۖۙۥۙۗ۬ۤۤۤۨۖۤۡۘۖ۠ۦۜۘۢۗ۫۟ۢۦۘۛۨۘ۬ۨۜۘۚۗۚۦۙۘۚۙۙۥۛۘ۠ۛۖۤۖۗۧۗۤۘۘۘۥۙۦۘ۠ۨ۫۫ۜ۠ۜۡۗ";
                                                        break;
                                                    case -637309140:
                                                        String str5 = "ۧ۬۬ۗۦۧۘۘۘۗۜۚۨۘۢ۫ۧ۠ۡۤ۠۫ۙۚۧۦۘۢۦ۠ۜ۫۫ۦۤ۟۬۟۬ۙ۠ۗۙۧ۫ۘ۟۟ۤ۟ۤۤۧۥۘۨ۫ۘ۟ۜ۬ۖۗۢۛۙۥۦۘۜۙۜۘ۬۬ۖۢۧ۫ۤۨۥۙۢۖ۫ۤ۫ۢۤۦۚۨۢ۠ۛ۠۬ۧۡۧ۟۠ۤۦۖ۟ۦۦۘۧۥۧۘۛۥۘۘۨۙۘ۬۬ۖۘ۠ۛۨۥۜۙۥۡۥۛۚۖۘۘۦۨۜ۫ۘۘ";
                                                        while (true) {
                                                            switch (str5.hashCode() ^ (-1587652759)) {
                                                                case -2093541287:
                                                                    str4 = "ۦۖۦۘۨۡۡۘ۬ۦۗۚ۠ۗۦ۟ۥ۫ۗۦۘۖۢۗۡۦۘۤۡۡۘۥ۠ۡۘۚۚۨۧۘۘۦ۠ۥۖۜۨۘۜۦۢ۬۬ۡۘۘۤۘۘۛ۬ۦ۟ۦ۫۬ۡۦ۫ۚۥۘۧۜۨۘۤۜۧۛ۬ۙۧۡۘ۬ۘۧۘۙ۫ۗۡۘۛۗۦۘۘۘ۠ۛ";
                                                                    break;
                                                                case -169184727:
                                                                    str4 = "۟۫ۡۤ۠ۘۧ۬ۖۘۗۥۡۘ۬ۡۘۛ۫ۨۘ۬ۗۙۤۤۨۗۦۗۗۗۚۘۧۢۜۥۧۘ۬۠ۛۦۚۚۛۢۘۘۨۘۘۚۜۖ۠۟۠ۚۛۗۨۥۘۖۧۢۦۘۦ۟ۢۢۢۛۦۡۛۚۙۗۗۧۢۨ۟ۡۥۤۥۥۤۖۘ";
                                                                    break;
                                                                case 715723161:
                                                                    str5 = "۫ۦ۟ۦۙۜۨۦۘۛۦۢۧۢ۫ۡۗۜۧۤ۫ۤ۟ۥۘۙ۠ۧۜۗۥۚۡۘۙۗۖۗۙۙۙۜۚۡۡۖۘۨ۬ۗۡ۬ۘ۫ۚۡۜ۟۫۟ۜۢۥۖۧۧۧۘۘۖۛۢۡۗۛۛۖ۠ۙ۟ۜۘۙۧ۬ۧۥۤ۬ۜۢۦۜۡۘ";
                                                                case 1964839984:
                                                                    String str6 = "ۧ۬ۨۢۖۘۘ۟ۛۥۘۛ۟ۡۚ۟ۘ۬ۚۤ۠ۨۘۙۤۤۙۗۥۘ۟ۖ۟ۨۨۖ۟ۘ۠ۧۤۤۙۗۗۗۗۜۘۚۖ۟ۛۨۚ۬۠۫۫ۢۙۛۨۘۙۨۧۚۜۜۘۙۚۛۦۜۜۤۨۡۧ۫۬ۨ۬ۥۘ۠ۗۦۘۙۡۤ";
                                                                    while (true) {
                                                                        switch (str6.hashCode() ^ 306766015) {
                                                                            case -1804445363:
                                                                                str6 = z ? "ۢ۟ۜۘ۫ۚۗ۠ۚۤۚۜۦۘۘۡۜۚۛۨۘۡۦۧۜ۬ۖۘ۫ۖۡۘ۠ۚ۠ۘۧۖۘۢۨۜ۫ۘۡۖۦۨۘۧ۠ۘ۠ۧ۟ۥۧۙۖۡۥ۠۬ۜۘۜ۬ۖ۫ۙۨۘ۬ۖۡۘ۬ۢۨۘۤۛۤۨۙۤ" : "ۡۦۡۘ۫ۛۢ۫ۧۜۤۗۡۖۘۖۥۢ۟ۘ۫ۨۘۤۥۧۗۙۡۘۨۜۧۘۙۧۘۘۦۦۜۘۛۤۖۥ۠ۗ۠ۦۢۗۗۖۘۗۖۧۜۨ۠ۤۧۜۘ۫۬ۡۗۛۘۘۛۗۡۘ۠۫ۗ۠ۚۧۡۥ۟ۜۦ۠۬ۢۗۚۢۘ۬ۡۧۖۖۢۖۗ۟۫۬۫ۜۘ۬ۖۢۨۖۘۘۜۢ۬ۜۙۨۘۨۧۘۘۘ۬ۨۘۜۖۧ";
                                                                            case 17177702:
                                                                                str6 = "ۜۨۦۘ۠ۘۢ۫ۦۧۗۖۜ۟ۜۚۦۗۛۨۖۥۢۡۧۢۙۧۚ۟ۖۘۨ۟ۢۧ۫ۦۘ۟۫۫ۘۖۜۨۥۜۘۤۙۡۡۦۙۥۨۘۦۗۡۜ۬ۖۨۡۥۘۡ۠ۙ۬ۘ۠ۥۛۗۙۙ۫ۧۡۖۛۡۗۖ۫ۧۘۖۦۛۢۛۧۨۥۦۖۧۜۗۨۦۗۡۦۜۢ۠۟ۡۘۨۚۧۤ۬ۖۗ۫ۘۘ";
                                                                            case 383657307:
                                                                                str5 = "ۤ۫ۘ۫۫ۗ۫۟ۡۘۦۖۡۧۙ۠۠ۥۚ۟ۥۘ۟ۘۙۨۖۧۘۤۘۦ۬ۥ۠ۛۗۢۨۨ۠ۜۗۧ۫ۥۨۘۜۨۡۘۢۚۦۥۡۘۤۧۨۧۘۡۘ۫ۗ۫ۨۘ۫۟۠ۙۛۗۢۛۤۜ";
                                                                                break;
                                                                            case 878547769:
                                                                                str5 = "ۤۛۤۢۢۥۗ۬ۥۘۛۨ۫ۡۘ۫ۥۜۥۘۗۜ۬ۨۗۥۘ۬ۘ۫۫۟ۤۗ۠ۥۧۨۦۘ۬ۖۚۦۜۤۦۛۙۥ۠ۖۘۚ۬۬۟ۖۡۘۢۜۦۘ۠ۜۘۘ۫ۥۧ۠ۘ۠ۥۘ۠ۙۨۡۡ۫ۜ";
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 1339120691:
                                                        str4 = "ۦۡۘۥۘۧۤۢۨۘ۫ۡۢۘۨۡۘۢ۬ۨۘ۬ۦۨۘۛۦۖۡۡۨۘۡۘۗۥ۠ۡۦۜ۟ۗۢۦ۟ۤۜۛۙ۬ۛۢ۫ۡۘ۠ۛ۫ۧۗۤۛۚۥۘۤۚ۠ۗۜۗۘۙۥۘۛ۠ۡۖۦۢۙۦۘ۫ۚۦۡ۫ۥۘۘۙ۬ۧۤ۠";
                                                    case 1925885950:
                                                        str3 = "ۤۨۖۘۖۙۜۖۥۤۙۥ۫ۛ۫ۦ۟۟۟ۤۢۥۢۢۘۙ۠ۥۘۜۨۦۘۧۧۗ۟۟ۥ۬ۦۡ۬ۘۘۘۙۨۡۘۜۨۘۘۥۡۛۖۗۚۤ۬ۢۙۜۜۛۖۖۛۤۥۘ۠۠ۖۘۙ۠ۥۘۤۦۨۢ۬ۦۖۙۧۚۡۤ۫ۢۖۙۜۡۘۡۘۥۖۘۤۙۛۜۘ۬ۤۛۙۘۦۘ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case -465448988:
                                            str2 = "ۗۢۖۘۥ۟ۨۘۦۜۖۗۨۙ۟۬ۘۗۤ۠ۛۘۖ۫ۛ۬ۧۚ۫۠ۘۜۘۤ۫ۤ۫ۚۥۢۤۧۖۤۘۢۦۥۘۥۦۙۘۧ۬ۚۘۧ۟۬ۗۗۛۘۨۥۚۤ۫۫۫۠ۡۘۙ۠ۤۛۤۦ۟ۖۜۦۚۦۘ۫۫۠۫ۥۛۦۨۖۢۤۧ۬ۖۖۧۘۜۘۜۘۧ۫ۨۥۗۤۤۦۥۚۧۖۥ۟ۦۤ۫ۦۘۦۛۘۚۘۘۖۖۗ۠ۜ۠ۦۜ۬";
                                            break;
                                        case 1470571796:
                                            str3 = "ۙۨۚۤ۟ۢۚۘۤۜ۠ۖ۠ۚۥۘۙۘۦۘۡۨۙ۠ۘ۟۟ۨۦۘ۬ۘۡۛۨۖۗۚۛۖۢۡۖۡ۠ۧ۠ۧ۬ۛۨۙۨۗۘ۫ۥۘۚ۠ۘۘۚۦۧۘۖۘۛۨۚ۫ۧۧۡۘۨ۟ۤۢۜۜۘ";
                                        case 1768974314:
                                            str2 = "ۘ۬ۢۜۜۘ۬ۡۘۧۧۖۧ۬۟ۖۗۖۘۚۤۙ۬ۗۜۘۨۖۘۘۨۦۘۘۜۛۖۘ۠ۛۖۥۤۤۛ۟ۜۘۘۤۥۚۚۘۘۡۖۢ۟ۖۛۨۥۢۥۢۘۘۧۙۡۘۖۘۡ۬ۤۡۘۜۤۧۦۛ۠ۧۙ۟ۛۧۡۘۥ۠۫ۨۘۜۘۛۧۢۨۘۡ۟ۡۘۗۢۘۖ۫ۨ۠ۢ";
                                            break;
                                    }
                                }
                                break;
                            case 1798462314:
                                str = "۠۟ۘۘۨۦ۠۫ۜۜۚۤۨۘۚۥۛۨ۟ۢۧ۬ۘۘۡ۬ۖ۬ۙۨۥۙۘ۬ۗۥ۟۫ۧۤۗۜۘۘۦ۫ۛۚۦۦۘۘۖۜۤۥۘۘ۬ۧۡۨۢۢۧۤ۠ۢ۠ۧۜۗ۬ۗۡۦۘۡۜۢۛ۬ۚۦۧ۠۠۬ۥۘۨ۟ۢۙۢۖ۠ۙۥۤۛۦۘ۫ۛ۫ۚ۬۫ۢۦ۬ۛۙۙۨۤۘۧۡۧۜۗۙ۠ۜ";
                                continue;
                        }
                    }
                    break;
                case -134888101:
                    stopPatcher();
                    str = "ۚ۟ۘۘۘۗۢۗۢ۫ۚ۫ۡۙۛۙۖۥۜۤۚۡۢ۫ۨۥۢۡۧۗۨۡۧۗۖۦ۫ۗۧ۟ۖۗ۠ۙ۫ۨۘۙۤۧ۟ۧۖۤۤۥۘۨۢۜ۬ۖۥۘۡ۠ۘۚۨۨۘۖۤۥۚۤۘۗۦۢ۫۫ۨۘۖ۬ۖ۟ۨۦۦۗۘۗ۟ۨۘۜۙ۟ۡۨۧۚۜۦۘۙۘۨۥۜۘۘۥۘ۬ۤۧۛۦ۟ۨۡۗۛۤۤۖۘۥۦۧۘۙۚۤۙۗ۫ۛ۟۬ۡۛۗ";
                    break;
                case -79461352:
                    editor = sharedPreferences.edit();
                    str = "۟۠ۡۡۛۨۥ۠۫ۛۛ۠ۙۥۤۖۙۨۚ۬ۖۘۤۦۘۘۜۖۙ۠ۧۢۖۡۢۗۜۙۛۗ۬۫ۖۘۘ۟ۨۖ۫ۖ۠ۧۜۤۘ۠ۡۘۙ۠ۡۘۙۦۦۘۦ۫ۙۦۜۖۘۜۦۘۥۥ۬ۤ۟ۥ";
                    break;
                case 551700769:
                    materialButton.setTextColor(getResources().getColor(C0931R.C0932color.color0023));
                    str = "ۢۥۧۙۖۜۨ۫ۤۨ۠ۘۘۢۘۘ۠۬ۨۘۤۚۡۘۜۢۥۜۤۖۘۖۘۘ۫ۘۥۘ۫۟ۧۙۖۘۘ۬ۢۧۨ۟ۙۢۤ۬۠ۖ۫ۗۥ۠ۚۙۗۘۡ۫ۘۖۚۜۛۨۦۡۘۥۤۧۛۙۥۘ";
                    break;
                case 584339753:
                    return;
                case 614891888:
                    materialButton.setTextColor(getResources().getColor(C0931R.C0932color.color0027));
                    str = "ۧۡۢۚ۟۫ۤ۠۫ۚۘۦ۫ۚۤۘۖ۟ۧۤۡۥۨۨۘ۫ۦ۫ۨۘۜۜۡۘ۫ۧۜۤۖۧۘۡۙۡۘۜ۟ۨۘۧۛۚۦۦۖۢۡ۫ۚۚۦۘ۬ۤۡۧۤ۬ۛۖ۫ۧۦۚۥۧۦۘۗ۠ۡۢۛۖۘۖۡۖۘۥۨۛ۫ۥ۬۠ۦۙ";
                    break;
                case 794191759:
                    modestatus = true;
                    str = "ۙۙۥۘۚۥۧۛۘۧ۫ۜۘۘۙۦۧۘ۬ۘۖ۫۫ۗۚۥۘۡۘۜۙۗ۬ۗۢ۠ۛۧۨ۬ۘۚۢ۬ۨۘۚۡ۠ۤۛۡ۬ۙ۫ۥۥۘۤۨۖ۠ۧۥۚۥۥۘۢۨۛۢۡۡۘۘۗۘۡۚۖۘۨۤۦۥ۬ۖۘ۟ۤۖۘۡۥ۫ۘۜۨ۫ۜۘ۠ۥۡۨۙۧۗۧۘ۬ۥۧۘۡۦۦۤۡۡۚ۟ۦۨۧۛۢۧۢ";
                    break;
                case 1238180760:
                    materialButton.setText(getString(C0931R.string.str001c));
                    str = "ۖۘۘۘۗۜۜۥۤۥ۠ۛۘ۟ۜۥۘۥۢۤۨۜ۟ۢۛۛۤۗ۬۠ۚ۫ۖۙ۟۟۟ۧۡۙۛۚۛۢۨۘۡۡۖۘ۬ۛۦۘ۠ۗۦۘ۠۟ۥ۟ۥۜۥۖۜۘ۠ۚۡۜۢۢ۫ۚۤۗ۠ۛۛۛۙۘۦۖۘۘ۠ۨۘۜۨۘۨۛۧۜ۠ۥۙۨۜۘ۫ۘۢۖ۫ۙۥۜۨ";
                    break;
                case 1243341040:
                    editor.putBoolean(Deobfuscator$$app.getString(-3440720167052336969L), z);
                    str = "ۛۖۘۘۡۨۡۘۢ۟ۛۛۤۧۖۚۜۘۧۤۙۢۥۧۨۨۘۘۜۙۦ۟ۘۦۘۘۤۚ۫ۖۧۥۡۘۧ۟ۦۨۖۚۛۚۛ۫ۗۚۜۨۥۗ۬ۨۧۢۚۖۧۦ۫۟۠ۘۨۘۧۘۡۘۙۥۘۘۜ۬ۘۘ۟ۦۘۘۥۖۦۡۨۖۘ۫۫";
                    break;
                case 1249052892:
                    modestatus = false;
                    str = "ۗۜۜۛۚۙۗۚۙۢۙۧۡۙۡۘۡۦۛۥۛ۫ۖۜۡۛۙۦۘۙ۠ۧۢۖۨۚۚۥۗۦۤۨۢۜ۠۟ۜۘۜۡۗ۟ۜۘۘۨۤۡۚۨۦ۬ۗۙ۟ۜۥ۬ۖ۫ۨۘۘۧ۬ۜۘۨ۫ۢۖ۟۟ۚۚۙۛ۬ۖۘۡۖۡۜۦ۠ۡ۫ۦۘۥ۫ۗۨۡ۬ۜۥۜۘۡۨۨ";
                    break;
                case 1398608674:
                    stopPatcher();
                    str = "۠ۦۖۘۡۗۡۘۘۜ۟ۨۚۘۘۛۨۡۜ۫ۤۛۜۧۥۗۙ۫ۗ۬۠ۛ۫ۗۧۥۘۧ۟ۢۙۤۡۘ۬ۢۢۚۥۖۘ۫ۚۨۘۗۙۥۥۚۙۢۡۥ۟۫ۜۡ۫ۙۙۚۡۘۜۨۜۘۡۦۧۘۖۙۧۛ۠ۗۘۙۜۘ۟ۢۖ۠ۦ۫ۨ۟ۧۨۥ۬ۚۖۥۖۙۡۘۙۡۨ۟۠۟ۜ۬ۘۙۦۗۤۙۧ۫ۛۚۧۜۚ";
                    break;
                case 1551686370:
                    materialButton.setIconTintResource(C0931R.C0932color.color0023);
                    str = "ۖۥ۟ۗ۬ۢۛۗۥۘ۬۟ۘۘۥۥۡ۟ۘۘۘۦ۬ۚۢ۟ۨۧۤ۟ۨۖۘ۬ۤۡۘۡۥۧ۬۬ۜ۫ۡۖۧۢ۫ۡۖۧۘۜۡۙۢۘۙ۠ۚ۠۫۠۠ۡۧۖۘۚ۠ۛۖۛۤۧۡۥۙۘۘۘۗ۬ۘۘۡ۟ۢۗۛۥۛۥۘۘۦۖ۬ۦ۟۠ۦۗۘۙ۠ۖ۟ۘۤۦ۬ۖۘۨۘۦۛۖ۬ۨۡ۫ۢۨۘۥۘۙ";
                    break;
                case 1646031180:
                    str = "ۜۘۨۙ۬ۘۡۛ۫۬۟۬ۚۛۦ۟۫ۡۘۘۨۖۘ۬۬۫ۙۤۘۡۗ۬ۜۤۥۘۡ۠۠ۖ۬۠ۤۘۡۚۤۖۘ۬ۗۤ۬ۢۛۛۛۖۘۙۘ۬ۖۙۘۘۤۙ۟ۤ۟ۖۙۨۘۜۤۢ۟ۗۨ";
                    break;
                case 1905198933:
                    str = "ۚ۟ۘۘۘۗۢۗۢ۫ۚ۫ۡۙۛۙۖۥۜۤۚۡۢ۫ۨۥۢۡۧۗۨۡۧۗۖۦ۫ۗۧ۟ۖۗ۠ۙ۫ۨۘۙۤۧ۟ۧۖۤۤۥۘۨۢۜ۬ۖۥۘۡ۠ۘۚۨۨۘۖۤۥۚۤۘۗۦۢ۫۫ۨۘۖ۬ۖ۟ۨۦۦۗۘۗ۟ۨۘۜۙ۟ۡۨۧۚۜۦۘۙۘۨۥۜۘۘۥۘ۬ۤۧۛۦ۟ۨۡۗۛۤۤۖۘۥۦۧۘۙۚۤۙۗ۫ۛ۟۬ۡۛۗ";
                    break;
                case 1919983797:
                    z = !sharedPreferences.getBoolean(Deobfuscator$$app.getString(-3440720261541617481L), false);
                    str = "۠ۘۡ۬ۤۨۘۡۢ۠۫ۦۢ۠ۢۘۘۡۧۥۥۙۗ۟ۙۡۦ۫ۖۘۢۦۧۘ۟ۧۥ۠ۜۘۥۥ۬ۧۙۥۙۘۙۥۧۨۘ۟ۖۡۨۘ۫۫ۨۛۗ۟۠۫ۘۚۤۦۘۡ۠۬ۘۘ۠ۛ۟ۨۘۛۥ۟۠ۨۖۘۙ۫ۚۚۘ۬ۜۗۜ۫ۦۘۖ۟ۜۘۚۢۥ۫ۥۧۘۗۘ۠ۙ۫ۨۘۧۘۧۡۙۦ۟ۤ۬ۤۖ۟ۧۧۡۦۘۥۢۧۚۘۥۚۡۡ";
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$initMenu2$1$kentos-loader-activity-MainActivity  reason: not valid java name */
    public /* synthetic */ void m250lambda$initMenu2$1$kentosloaderactivityMainActivity(SharedPreferences.Editor editor, MaterialButton materialButton, View view) {
        String str = "۫۠ۦۡۗۘۘۥۘۜ۠ۨۘۘۨۗ۫ۡۚۖۘۢۥۦ۬ۛۡ۫ۖۡۢۤۘۨۙ۬۬۟ۧۛۗۖۘۘۛۚۢۦۦۛۘۖۘۚۥۗۧ۟ۙۘۢۦۦۧۨۘۘۙۢۨۤۡۘ۬ۢ۟۬ۦۗ۬ۤۥۖۧۜۘۚۦ۟ۛۘۙۙۖۘۘ۠ۗۜۥۧۛۗ۠ۗۨۘۧۨۤۘۘۛۜۧۖ۟۬ۡۙۡۘۙۨۚۜۗۘ۬ۖ۬ۦۘۤ۫ۗۦ۫ۡۤۢۖ۟۠ۛۦۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 691) ^ 149) ^ 356) ^ 85) ^ 756) ^ 988) ^ 223) ^ 915) ^ 161) ^ 986) ^ 468) ^ 426) ^ 526) ^ 283) ^ 528) ^ 684) ^ 503) ^ 867) ^ 283) ^ 134) ^ 194) ^ 406) ^ 444) ^ 242) ^ 690) ^ PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW) ^ 601) ^ 297) ^ 253) ^ 126) ^ 960) ^ (-386298273)) {
                case -1761519730:
                    return;
                case -1638840018:
                    updateHideRecordColor(materialButton, hiderecord);
                    str = "ۧۡ۟ۙ۫ۦۥۢۦۘۙۥ۠ۜۖ۠ۨ۟ۘۘۙۨ۠ۚۚۡۦۧۖۘۥۢۢۜۙۖۤۘۨۚۡۚۗۡۘ۫۫ۡۘ۠ۤۨۘۚۢۥۧۘ۠ۗۙۤۦۖۘ۫۫ۗۦۙۡۛۛۨۦۚۖۨۥۦۘ";
                    break;
                case 16141895:
                    str = "ۙ۟ۗۦۘۡۥ۟ۨۘۡۘۡۧۤۡۘ۟ۙ۟ۤۛۘۨۙۜۘ۟ۥۢۨۘۡۖۢ۫ۖۡۖۘۥۨۘۡۦۥۜ۫ۖۘۥۡۥۘۨۗۧۛۘۖۘۦۘۘ۫ۢۖ۠ۛ۬ۢۨۧۙۘۤۖۘۚۡۖۘ۠ۛۥۘۧۘ۬ۢۢۨۢۧۙۖۦۖۘ";
                    break;
                case 234679479:
                    str = "ۖۙۘۘۛۤۡۘ۬ۧۨۘۗۙ۠ۚۜۨۚۛۗۢۙۦ۬۟ۜۘۧ۟ۡۘۥۡۘۘۡ۫ۦۡۦ۠ۚۖۨۘۚۥۨۘۛۗۨۘۙۗ۠۫ۙۜۤۧۘۗ۟ۢ۬۠۫۬ۚ۟ۤۦۘ۟۬ۧ۠ۡۘ";
                    break;
                case 537076690:
                    str = "ۢۚۚۜۗۖۧۗ۟ۛۜۡۘ۠ۢۜۚۨۥۘۨ۠ۦۘ۬ۨۘۧ۟ۧۚۘۖۚۖۡۘۢۤۜ۟ۗ۬ۖۧۙۜۙ۬ۙۦۖۖۘۘۙۛۨۘۚۥۤۗ۫ۗ۬ۨۨۢۡۘۘۖۥۘۘۤ۠ۥ۟ۨۘ۠ۚۥ۠ۚۚۗۦۜۘۧۤۢۚۘۥۗۢۤۦۡۡۘۤۡۧۡ۠ۥۚۨ۟";
                    break;
                case 1409908363:
                    hiderecord = !hiderecord;
                    str = "ۦۛۜۡۥۦۜۡۜۘ۟۫ۛۦۡۖ۠۫۠۟ۡۡۗۖۘۘۨۚۦۨ۬ۢۧۥۘۡۘۧۡۚۡۢۧۖۧۡۨ۬ۙۙۦۘۥ۠۠ۛۙۤۚ۬ۦۜۧ۠ۜ۟ۨۨۨۜۘ۟ۛ۫ۜ۫ۘۛۢۤۢۥۧۙ۫ۖ۬ۦۘۗۗۡۘ";
                    break;
                case 1762505152:
                    str = "۬۫ۜۘ۬ۙ۫۬۠ۤۘ۫ۖ۬ۖۘ۫ۛ۫ۦۤۙۤۤۤۖۡۙۘۘ۠ۛ۬ۜۘۚۥۘ۫۫ۦۗ۬ۧۥۢۜۢۛۦۘۖۦۚۛۜۧۚۘۘۦۘۛۙۢۢۗ۫ۨۤۦۗۤۧۢۜۖۡۘ";
                    break;
                case 1919400845:
                    editor.putBoolean(Deobfuscator$$app.getString(-3440720583664164681L), hiderecord).apply();
                    str = "۠ۥۢۡۚۗۤۖۙ۠ۧۦۘۙۥ۟ۨۦۧۡۙ۟۠ۦۦۘۙۢۙ۫۟ۧۛۦۘۘۘۖۘۘۛۢ۟ۡۤ۬۬۫ۘۦۧۘۨۧۧ۬ۧۡۚ۬ۥۥۘۧۛۥ۬ۧۦۢۤۜۜ۬ۡۗۖۧۦۦ۫۠ۚۦۘۖۤۥ۠ۦۥۘۜۡ۫ۚ۠ۛۥۗۙۗۚۜۘۙۥۗۗۚۚ۠ۧۖۡۜۛۘۢۖۜۛۖۜۙۘۖۧۥۢۗۗۘۥ۬ۨۦۘ۟ۤۛ";
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$initMenu2$2$kentos-loader-activity-MainActivity  reason: not valid java name */
    public /* synthetic */ void m251lambda$initMenu2$2$kentosloaderactivityMainActivity(View view) {
        String str = "ۦۙۜۘۦۚۥۘۙۢۥۘ۫ۗۥۘۘۡۢۦۜ۟ۚۜۜۘ۬ۦۚۖۛۘۛۥۥۘۤ۬ۦۘۙۧۖ۟۫ۖۘۦۜۢۤۙۙ۫ۧۚۘۦۧۢۦۛۦۖ۟ۜ۟۟ۜۘۖۦۡۡۙۥۤۖۡ۟ۗۧۨۡۘ۬ۗۡۘۙۢۘۙ۠ۤۡ۟ۜۘ۟۫۟ۧۡۖۡۤۚۚ۠ۨۘۨۙۗ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 467) ^ 208) ^ 718) ^ 818) ^ 831) ^ 122) ^ 535) ^ 193) ^ 118) ^ 216) ^ 28) ^ 91) ^ 831) ^ 672) ^ 894) ^ 1022) ^ 474) ^ 688) ^ 272) ^ 478) ^ 815) ^ 393) ^ 424) ^ 773) ^ ViewUtils.EDGE_TO_EDGE_FLAGS) ^ 649) ^ 419) ^ 877) ^ 267) ^ 100) ^ 52) ^ 2026151320) {
                case -1434041511:
                    str = "ۚۢۧۧ۟۫ۘۙۦۘۡۗ۫ۦۖۘ۠ۡۘۘۡ۠ۘۘۧۖۥۘۧۚۗ۫۬ۥۘۡ۟ۛۖ۠ۙۤۦ۬ۦ۠۬ۛ۬ۥۤ۠ۜ۟۫ۜۘۘۖ۠ۦ۬ۘۤ۟ۥۘۨۢۚۗۜۜۢ۟ۨۘۗۙۡۜۥۦۢۦۜۧۤۖۚ۬۫ۜۤۙۨ";
                    break;
                case -88932853:
                    finish();
                    str = "ۛۦۚ۠۬ۤۛۨۖ۬ۜۧۤۧۡۤۧ۟ۗۚۨۥۙۥۚ۠ۢ۫ۖۖۘۗ۫ۙۖ۟ۤ۠ۨۨۘۚۖۖۡ۠ۡۨۤۧۨ۟ۥۘ۬ۘۚۛۘ۠ۚۡۦۘۚۨۜۘۜۥۙۡۧۡۘۛۤۢۚ۫۫ۡۤۧۜۤۖۛۙۡۥ۫۟ۦۚۧۥۗ۟۬ۦ۟ۙۦۢ۠ۦۙۢۢۙۨۘۙۘۛۖۘۦۧ۟۫ۘ۠ۗۘۧۘ";
                    break;
                case 77877143:
                    return;
                case 766335006:
                    str = "۬ۗۡۘۛۥۢۜۢۜۘۧۜۘۘۧۗۗۖۤۖۘۙۙۘۥۡۘۘۥۡۥۘ۠ۖۦ۬ۤۙۚ۬ۘۥ۫۫۠ۦۗۙ۬۫ۧۨۤ۠ۦۤۦ۠ۧۚۡۘ۠ۜۨۘۗۤۚۘ۠ۘۘۗۤۛۘۙۥۘۛۜۚ۫ۥۘۘۛۡۜۥۦۡۙۙۡ۠ۧۛ";
                    break;
                case 1104036500:
                    startActivity(new Intent(this, LoginActivity.class));
                    str = "ۜۡ۫ۙۢۚۙۜۡ۬۬ۡۙۙۦۦ۟ۙ۠ۧۡۘ۠ۘۥۘۦ۬ۥۛۛۘۘۗ۠ۙۡۤۚۗۜۢۜۘۖۘۥ۟ۖۘ۬۠ۛۤۨ۫ۤۨۥۙۡۜۘۢۚۡ۫ۡۨ۠ۗ۫ۙ۟ۙۚ۟ۛۧۖ";
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$installGameWithObb$11$kentos-loader-activity-MainActivity  reason: not valid java name */
    public /* synthetic */ void m252lambda$installGameWithObb$11$kentosloaderactivityMainActivity(MainActivity mainActivity, String str, String str2, String str3) {
        String str4 = "ۘۜۨۥ۠ۡۘۘۦۚۥۚۜۗۦۙۧۙۖ۫۫ۨۘۢۖۡۗۛۧۛۨ۠۬۠ۙۨۘۡۘۙۙۘۘۘۜ۠۟۠ۛ۟ۤۛۛ۟ۚ۠ۜۡۘۡ۬ۙ۠۫ۚۜۤۘۢۗۖۛۙۡۘۚۚۦۘۡۦۢۤۦۖۙ۫ۥۧۤۥۘۛۢۨۘۜ۠ۨ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str4.hashCode() ^ 600) ^ 732) ^ 623) ^ 90) ^ 542) ^ 362) ^ 665) ^ 52) ^ 949) ^ 19) ^ 559) ^ 560) ^ 243) ^ 409) ^ 287) ^ InputDeviceCompat.SOURCE_DPAD) ^ 295) ^ 762) ^ 778) ^ 362) ^ 888) ^ 643) ^ 665) ^ 500) ^ 90) ^ 603) ^ 677) ^ 982) ^ 683) ^ 48) ^ 945) ^ 1351414196) {
                case -699083413:
                    return;
                case -76934131:
                    str4 = "ۜۗۜۢ۟۬ۛۤۨۘۘۙۚۜۡۦۙۧ۠ۡ۠ۡۘۡۛۗۥۜۦۥۧۦۗ۠ۜۘۦۧۘ۠ۛۖۙۗۜۢۢۜۧۦۘۘ۫ۦۢۚۚۘۛۚۛۚۖۥۨۖۖۘۘۦۤۨۖۙۘۢۙۤۡۨۧۙۦۛ۫ۛۖۧۘۢۨۨ۠ۛ۟ۤۨۗۧۧۜۖۧۙۖ۠ۨۘۗۙۜ۟ۚۙۡۖ۟ۛۗ۬ۤۖۡۙۡۨۘ";
                    break;
                case 15765761:
                    str4 = "ۜۢۨۘۧۧۧۥۚۤۤۖ۠ۥ۟ۨۢۢۜۚۘۘ۟۬ۤ۟ۡۡۗۚۘۘۧ۫ۢۥ۟ۧۖۢۢ۠ۘۜۧۚۗ۠ۖۨۘۙۗۘۘۙۧۡۡۨۗۚۦۜۙۙۤۘۧۘۡۡۖ۟ۙۡۗۜ۫۫۠ۜ۠ۖۨۚۘ۫ۚۙۡ۫ۦۜۘ";
                    break;
                case 1335555898:
                    promptForObbDownload(mainActivity, str, str2, str3);
                    str4 = "۟ۡۧۘ۟ۡۨۘۙۙ۫ۡۜۘۚۗۚ۠ۛۘۧۘۤ۠ۡۧۨۦ۠ۖۙۛۚۦۘ۬ۤۡۘۘۛۛۛۦۤۧۡۛۦۗۘۘۦ۫ۘۡۙۘ۟۬ۗۙۜۦۘۦ۬ۦۘۡۖۦۙۚۤۚۦۨۘ۬ۧۘ۫ۘۘۢۤۦۘۗۘۖۚۗ۫ۧۦۦۘۡۘ۫۬ۧ۠۠۟ۛۦۛۤۡۖۘۘۚ۫ۗۤۤۨۘۜۛۜۘۖۛ۠۬ۗۥ";
                    break;
                case 1641948395:
                    str4 = "ۙۨۜۛ۠ۨۗۜۡۘۦ۠۠ۨۘۜۙۧۘۜۤ۫ۖۧۥۘۙ۫۫ۚۙۡۘۢۨۡۘ۫ۖۧۨۥۙۢۜۖۘۛۥۤۙۜۥ۬ۚۜ۬ۧۚۘۡۘۘۜ۟ۗۛۧۖۤۗۨۘۛۡ۬ۘۚۗ۠ۤۖۘ";
                    break;
                case 1843519511:
                    str4 = "ۨۗۥۘۗ۠ۗۦۜۜۘۚۗۘۘ۠۠ۡۘۙ۠ۜۜۥۘۙۛۛۚۦۡۘۘ۟۬ۢۜۦۘۢ۫ۖۜۨۥۘۙۘۘ۟ۘ۬ۧۤۤۗۖۖۘۧۨۢۢ۬۟ۚۨۤۙ۟ۡۥۗۘۦۨۘۘۙۛۡۨۘۘۤۨۦۘۥۘۥۜۨ۟ۚۨۜۘۨۤۜۘۗۨۜۡ۬ۘۜۜۧۛۗۨۘۘۜۥۤ۠۟ۗ۫ۨۙۜۚۛۢۢۜۦ۬";
                    break;
                case 2146397530:
                    str4 = "ۖ۬ۡۨۚۥۘ۬ۗ۬ۨۚۦۘۖۙۙۖۧۨۘ۬ۙۨۘۦۨۨۘ۬ۥ۬ۖۛۖۘۡۖۦۘۧۗۛۙ۠۫ۡۖۤۚ۠ۦۢۡۘۛۢۤۧۡۘ۟۠ۜۧۥۥۧۙۡ۬۬۫ۦۥۘۗۜۨۨۤۖۧۘۖۜۜۘ۟ۗۖۘۘۛۙۛۜۗۡۖۧۘ۬ۖۥ۫ۗۡۨۛۨ۠۟ۤۦۦ۠ۡۢ۠ۧۜۡۘۡ۠ۨۘۘۦۖ";
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$installGameWithObb$13$kentos-loader-activity-MainActivity  reason: not valid java name */
    public /* synthetic */ void m253lambda$installGameWithObb$13$kentosloaderactivityMainActivity(MainActivity mainActivity) {
        String str = "ۙ۠ۤ۬ۙۤۢۧۜۘ۟ۗۢۧۢۘۘۛۚۖۘ۟ۘۤ۟۫ۧۖۥۚۤ۫ۧ۫ۤۖۘۢۙۜۢ۬۠ۥ۟ۘۘۗۚ۬۠۫۠ۨۙۥۘۖ۫۠ۙۚۦۡۘۡ۟ۜۥۘ۟۬ۤۢۙۖۡ۫ۦۘۢۘۛۧۧۖۘۤۤۘۢۦۜۧۥۨۡۨ۠ۥۘۨۧۖۡۨۥۡۧۖۘۛۧۛ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 129) ^ PointerIconCompat.TYPE_GRAB) ^ 694) ^ 762) ^ 396) ^ 591) ^ 927) ^ 879) ^ 835) ^ 735) ^ 961) ^ 618) ^ 851) ^ 887) ^ 935) ^ 351) ^ 291) ^ 46) ^ 433) ^ 103) ^ 830) ^ 989) ^ 191) ^ 583) ^ 611) ^ 467) ^ 866) ^ 850) ^ 99) ^ 447) ^ 201) ^ (-785184680)) {
                case -1549399727:
                    str = "ۗۧ۟ۥ۬ۨۜ۟ۦۛۗۦ۠۫ۨۤۤۦۗۜۡۗۜۘ۟ۡ۬ۖ۟ۧۥۢۨۢۖۥ۫ۧۨۡۧ۠ۥ۬۟ۨۘۧۗۘۘۢۧۥۘۨۨ۟ۢۨۡۘۤۚۤۜۚۜ۠ۚۡۘۗۜۚۛۚۜۨۨۦ۠ۤۧۖ۠ۖۥۙۥۘۖۨۢۧۦ۫ۥۜۖۘۡ۟۟۠ۦۖۢۘۜۘ";
                    break;
                case 217613261:
                    showSuccessDialog();
                    str = "۫ۜۡۘ۟۠ۗ۬ۥ۠ۗۡۜ۫ۧۘۙۜۖۘۛۥۦۘۗۖۦۦ۬ۥۖۢ۠ۡ۬ۦۗۗۡۗ۟۠۟۬۫ۢ۫ۘۖۨۘۦۘۜ۠۠ۥۘۖۡ۫ۙۖ۠۠ۦۜۘ۬ۤۧ۬ۜ۫ۧۤۥۘۖۛ۠";
                    break;
                case 350606292:
                    mainActivity.doHideProgress();
                    str = "ۜۢۥۘۛۧۘۘۢۡۗۡۚۜ۟ۥۥۘۖۗۖۘۚۥۙۛۨۜۗۙۨۛ۠۫ۨۨۡۘ۟ۖۘۢ۠ۗۖۜۧۨۦۜ۠ۨۧۡۚۘ۟ۗۤۗۡOۜۦۗ۠۫۬ۤۗۦۧۙۦۘۥۗ۟ۥۢۜۧۨۨۦۤۘ۠ۤۚۡۨۖۘ";
                    break;
                case 1393331164:
                    return;
                case 1688582994:
                    str = "۟۬ۡۘۘ۠۬ۗۘۦۘۖۥۘۘۥۚۥۙۜۢۢۖۖ۠ۦۨ۫ۖۥۡۥۙۙۤۙۛۤۖۥۙ۬۬ۜۧۘۖ۠ۨۖۛۖۙۤ۬ۖ۫ۛۛۥۗ۟ۖۘۙۧ۟ۧ۟ۗۨ۟ۚۥ۫۠ۛۨۜۘ۟ۚۖۖ۠۬ۜۢۡۧۘ۬۠ۡ";
                    break;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 582
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    /* renamed from: lambda$installGameWithObb$14$kentos-loader-activity-MainActivity  reason: not valid java name */
    /* synthetic */ void m254lambda$installGameWithObb$14$kentosloaderactivityMainActivity(kentos.loader.activity.MainActivity r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 2708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kentos.loader.activity.MainActivity.m254lambda$installGameWithObb$14$kentosloaderactivityMainActivity(kentos.loader.activity.MainActivity, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$promptForObbDownload$15$kentos-loader-activity-MainActivity */
    public /* synthetic */ void m78x567030ea(AlertDialog alertDialog, MainActivity mainActivity, View view) {
        String str = "ۢ۫۬۟ۡۘۚۖۥۥۚۜۥۜۤۙۜۨۘۢ۟ۗۨۛۛۗۦۤۘۖۡۘۖۡۢ۟ۥۥۙۦ۬ۘ۠ۘۘۤ۠ۖۘۜۧۗۡۨۘۛ۠ۙ۠ۗۘۘۢ۬ۢۦۨۧۡ۫ۖۘۖۛ۫۟ۨۨۙۥۥۤ۟۟ۤۤ۫ۚۤۜۤۖ۫۬ۡۘۤۢۡ۟ۜۦۡۚۦۘ۫ۧۤ۟۟۫ۦ۟ۥۘۨ۬ۦۧ۬ۖۘۖۗۧۘۧۧۜۗۥۢ۠ۢۚ۬ۨۘۦۢۡۘۛۤۥۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 365) ^ 349) ^ 127) ^ PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW) ^ StatusLine.HTTP_TEMP_REDIRECT) ^ 357) ^ 278) ^ 168) ^ 36) ^ 903) ^ 838) ^ 997) ^ 45) ^ 483) ^ 211) ^ 979) ^ 540) ^ 973) ^ 449) ^ 663) ^ 180) ^ 176) ^ 823) ^ 820) ^ 556) ^ 914) ^ 188) ^ 106) ^ 674) ^ 487) ^ 153) ^ (-1631361583)) {
                case -1761243831:
                    Toast.makeText(mainActivity, getString(C0931R.string.str00cb), 0).show();
                    str = "ۚۡۤ۫ۛۜۤۙۚۚۛۗۦ۬ۥۘۘۗۥۧۘ۟ۛ۟ۙۜۥۘۢ۬ۧۘۛ۫ۛۥۛۖۜۤ۫ۡ۬۬ۜۚۧۙۡۘۡۛ۫ۥۘۨۙۘ۫ۛ۠ۚ۠ۡۥۘۡۜۦۨ۬ۥۘۘ۟ۚۚۦۗ۫۬۬ۛۗۢ۟۫ۙۙ۬ۜۜۘۗۤۚۗۜۜۘۦۗۡۘۜۖۘۧۙ۫ۤۥ۟ۙۧۙۘۗ۬ۢۗ۠ۙۖۘۙۖۜۘۦۡۖ۟۬ۨۚۥۡۘ۫ۦۤ";
                    break;
                case -1276330301:
                    str = "ۘ۫ۨۘۚۘ۟۬ۦۡ۬ۦۙۙۖۜۖۥۛ۬ۡۦۦۛ۫۬ۖۗۤۘ۫ۜۥۘۘۥۦۖۘۢۚۤۖ۟۠ۨۧۘ۠ۨۖۜ۟ۘۘۧۥۘۡۘۧ۠۟ۙۛۢۡ۫ۖۘ۫ۤۜۘۢۗۤۖ۟ۥۨۘۜۘۛ۬ۥۘۢۡۜۘۜۧۡۦۖۗۜۗۧۧ۫ۙۦۗۦۘۛۚ۟ۘۖ۬ۡۗ۫ۗۗ۟ۛۧ۠ۗۛۥۘۡۖۡۘ";
                    break;
                case -1137712876:
                    alertDialog.dismiss();
                    str = "ۘۢ۟ۨۛۤۨ۫ۢۗۥۘۥۚۘۘۥۡۡۘۘۙۛۘۘۛۤ۠۬۬۠ۗۥ۫ۦۘۧۚۥۥۜۛۘۙۡۘۚۡۥ۬ۢۗ۫ۧۖۘۧۙۥۘۖۥۛ۫۠ۘۘ۠ۢۦۢۨۧۥ۟۬ۦۨۘۘۧۜۜۘ";
                    break;
                case -660815559:
                    str = "ۨ۬ۡۘۚۡۨۘۧۘۢۜۡۜۘۗۨۖۘۗۚۘۦۜۥۡۤ۠ۧۜۘۗۧۦۙۦۤۚۡۘ۟ۧۜۘۘۦ۟۫ۥۘۚۦۛۚۤۤۘۛۜ۬ۥۗۜۥۡۘۚۛۘۘ۟ۘۡۘۥ۟ۘۥۢۦۘۧۜ۫ۧ۠ۜۘۗ۠ۜۘۥۡۜۘۖۙۦۜ۟۫";
                    break;
                case 142680968:
                    return;
                case 272985988:
                    str = "۬ۧۡۙۨۥۧۤۘۘ۠ۛۧۨۚۖۘۖۘۜۘۥۖۚۨۢۧ۬ۙ۟ۨۧۛ۬ۡۗۖۥۡۙۚ۬ۜۧۥۖۚۤۜ۬ۙۙۥۛۨ۟۬ۤۜۢۢۧۢۗۢۗۧۤۗ۟ۘۘۧۘۢۛۖۜ۫ۗۖۘۛۦۨۘۨۤۜ۫۫۠ۨ۫ۗۢۖۨۘ۟ۛۡۘۚۨۜۘۜۥۜۘۙۛۡ";
                    break;
                case 2130096724:
                    str = "ۗۥۡ۠ۤۖۘ۟ۛ۬ۘۡۨۘ۟ۨۡۘۧۢ۠ۢۢ۠ۖۘۧۧۘۘۡۛۤۛ۠۬ۤۗۥۨ۫ۖۘۡۦۖۖۚۘۜ۬۟ۙۨۥ۫ۧۤۖۤۜ۟۬۟ۨۙۤۗۘۘۦۜۢۖۧۤۛۤۤۛۜۗۗۦۨۙ۬ۢۖۨۘۗۧۥۘ";
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$runBypassCmd$9$kentos-loader-activity-MainActivity  reason: not valid java name */
    public /* synthetic */ void m255lambda$runBypassCmd$9$kentosloaderactivityMainActivity() {
        String str = null;
        String str2 = "ۗ۫ۘۘۦ۟ۨۘۤۜۖۘۤۗ۟ۜۗۤۡۢۖۘۨۢۦۢۨۘۘۜۥ۬ۤۦۧ۫۠ۘ۟۟ۚۦ۬ۡۘۦۦۨۘۜۤۖ۬ۧۖۘۛۧۗۜ۫ۨۘۨ۫ۥۘ۬ۢۛ۫ۘۧ۠۠ۙ۬ۗۦۖۖۛۡ۠ۨۘۖ۟ۖۤۢۥۤ۫ۘ۬ۜۦۗۧۧ";
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        while (true) {
            switch ((((((((((((((((((((((((((((((((str2.hashCode() ^ 151) ^ 428) ^ 653) ^ 232) ^ 750) ^ 627) ^ 508) ^ 492) ^ 583) ^ 147) ^ 212) ^ 161) ^ 112) ^ 498) ^ 522) ^ 728) ^ 685) ^ 528) ^ 582) ^ 506) ^ 662) ^ 1000) ^ 769) ^ 88) ^ 46) ^ 197) ^ 450) ^ 499) ^ 297) ^ 634) ^ 208) ^ 2125279093) {
                case -1371897837:
                    str2 = "ۛ۠ۡۘۜۛۗۡۘ۬ۖۢۖۡ۠ۙۙۛۘۘۤۧۡ۠ۢۖۘۡۢ۬۠۫ۨۘۗۨۘۜۢۦۗۢۗۢۛۦۗۧ۬ۥۢۥۜۡۨ۬ۖۘۚۜ۟ۦۛۨۘۛۘ۟ۤۤۦۘۛ۫ۨۘۧۢۖۘۖۗۙ";
                    break;
                case -1356582367:
                    String str3 = "۠ۡۖۘۗۘۡۗ۠ۡۘ۬ۙۧۨۨۚۚۛ۫ۤۚۨۖۖ۟ۡۦ۠ۥۜۜ۟ۘ۫ۚ۫ۖۤۡۘۗ۬ۨۘۖۚۚ۠ۘۡۘ۠ۧ۬۬ۥۖۦ۟ۡۘۤۘۖۘۙۜۨۘۘۗۜ۫ۙۨۗۙ۫ۨۚۜۘۦۦۧۘۧۦۧ۫ۥ۫ۙ۬۟۠ۜۥۘۦ۟ۥ۬۫۫ۜۙۡۗۗ۬۟۬ۖۘ";
                    while (true) {
                        switch (str3.hashCode() ^ (-2059942710)) {
                            case -900537681:
                                str2 = "۬۠ۨۨۚۜۘۤۜۘۗ۫ۡۤۡۥۢۚۡ۬ۗۖۘۖۗۖ۠ۘۜۡۗۘۘۧۛۥۘ۠۬ۥۜۗۗۢۡۗۧۜ۬ۨۨۚۥۤ۟ۦۘۦۘ۫ۙۧۦۡۗ۟۟ۖۘۤ۠ۜۘۤۛۙۜۜ";
                                continue;
                            case 6503390:
                                str3 = "۫ۤۗۥۘۤۗۗۖۘۨ۬ۖۧۤۙۖۦۧۢۡ۠۟۬ۡ۟ۡۙۤۥۘ۠۬۫ۢ۟۫ۚ۫ۦۘۚ۟۟ۢۙۡۘۘۗ۠۬ۦۥۧۖۜۛۖۧ۫ۚۙۤۘۤۗۧۢ۫ۦ۟ۖۘۧۧۧۨۛۦۘۗۘۘۘۗۖۨۛۥۦۤۥۘ";
                            case 1323319585:
                                str2 = "ۧۥ۫ۥ۠ۜ۠ۦۘۙ۫ۙۖۜۨۥۤۦۘۖۘۜۧۗۚۦ۫ۙۖ۫ۡۘۛۚ۟ۚۛۦۙۧۚۜ۬ۖۦۛۢۗ۠ۛۡۙۥۘ۟ۘۘۡۘۘ۠ۢۤ۟ۜۧ۠ۘۡۚۥۧۘۙۥۘۙۛۥۘۘۧۡۧۢۥۘۦۙۘۦۘۘۙۨۘۗۢۖۘۨۜۡ۬ۥ۠ۥۙۨۨۡۘۜۦۥۧ۬ۘ۫ۢ۟۠ۘۡۙۨۘۘۘ۠ۡۢۥ۫ۤۥ۠۬ۜۜۘۡ۟ۧ";
                                continue;
                            case 1779914657:
                                String str4 = "ۗۥۛۜۚۜۘۢۛۨۚۧ۟ۙۗۖۢۡۘۛۘۛۗۨۥۙۖ۠۠ۛۧۚۘۗۧۧۜۘ۬ۗۡۘۗۗۘۢۗ۟ۗۘۜۡ۫ۙ۟۟ۘۘۨۘۘۘۖ۬ۦۘۚۙۦۘۘۜۧۘۦۨۥۘۤۤۜۜۢ";
                                while (true) {
                                    switch (str4.hashCode() ^ (-602436338)) {
                                        case -1946035652:
                                            str3 = "ۧۜۤ۠۠ۗۖۜۜۘۛۙۖۘۦۦۦۘ۟۠ۘۘ۫ۛۥۘ۫ۚۘۢۦۦۘۤۦۗۢۦۥۦۗ۟۫ۢ۟ۥۥۙۘ۠ۙۢ۫ۖۘۚۨۖۧۢۜۙ۫ۚۚۨۜۙۨۖۘ۫ۢۗۖۥۢۛۤۜۘۘۢۥ";
                                            break;
                                        case -1712454894:
                                            String str5 = "۠۫ۧۘ۬ۖۛۘۗۛ۬ۗۢۤۨ۫۟ۗۦۨۨۘۦۘۖۘ۫ۚۘۘۜۨۡۨۗۧۗۥۗۘۢۦۘۛۤۛۨ۫۟ۢ۠ۨۘ۫۠ۙۖۢۙ۬ۥۨۜۙۨۘۚۗۛۖۡۗۘۗۖۘۧۥۡۨۚۡۘۛ۬ۖۘۤۥۘۨۗۢ۫ۡۧۘ۟ۦ۬ۚۛۦۘ۫ۢۗۘۙۛۥ۫ۥۘۨ۫ۗۤۦۜۘ۠۟ۨۡۤۚۜۖۢۥ۫";
                                            while (true) {
                                                switch (str5.hashCode() ^ (-1153186865)) {
                                                    case -2018507959:
                                                        str4 = "ۘ۬۟ۚۡۨۢۥۨۦۡۗۨۧۡۨۤۨۚۚ۠ۘۖۡۧۢۥ۬ۘۙۗ۠۬ۚۥۖۘۢۘۗۧۡۖۢ۟ۘۘۧ۟ۛۤۘ۬۠ۤۡۘ۠ۡۤ۠۟ۥۘۜۢۘۗۡۥۘ۠ۧۜ۠ۜۘۛۖۧۘۢۙۦۘۗ۬ۥۤۗ۫ۨۘۘۥۡۙۨۗۦۘ۬ۧۡۨۦۗۥ۟ۥۘۨۛۦۚۘۜۘ۬ۦۗۧۨۚۙ۬ۡۢۡۧۘ۠۠ۛۨۨۙۙۡۖۘۛۘۖۘ۬ۙۦۘ";
                                                        break;
                                                    case -298046804:
                                                        String str6 = "ۥۜۧۡ۠۟ۥۘۘۗۚۢۦۧۧۡۙۘۡۡۡۡۤۢۙۤۨۥۗۦۘۥ۠ۚۙۛ۫ۜۘۚ۟۫۟ۙۧۖۤۖۖۘۡۨۙ۠ۦۗۘۧۥۡۜۘ۠ۤۧۛۡۖۘۘۙۨۧۨۖۘۥۤۨۧۡۥ۟۬ۘۘ۫ۙۨۢۖۡۜۡۧۗۚۨ۠۫ۦۚۙۨۖۦۧۘۗۚۖۥۘ۫ۜۗۘۙۗۧ۟۟ۙۤ۫ۖ";
                                                        while (true) {
                                                            switch (str6.hashCode() ^ (-2089689462)) {
                                                                case -1577472492:
                                                                    str5 = "ۘۘۜۘۨۗ۬ۡۖۨۚۡۚ۟۟۫ۚ۠ۨۘۚۨۗۛۗۖۘۚۦۚ۬ۡۜۗۙ۬ۜۘۦۖۢۡۧۜۜۦۧۘۥۘۡۘۖۙۗۨۦۦۖ۟ۛۡۖۦۘۗۢۗۖۡ۬ۛۚۢۦ۬ۧ۬۟ۡ";
                                                                    break;
                                                                case -1366618252:
                                                                    String str7 = "ۘۥ۫۟ۡ۠ۙ۫ۜۥۗۨۘۧ۬ۨۘۗۖۘۖۚۖۘ۟ۘ۫ۖۙۨۛۤۦۤۦۘۧۙ۟ۖۖۚۖ۬۟ۢ۫ۜۘۥۦ۬ۢۙۥۘۢ۠ۜۦ۬ۚۗۘۜۘ۫۠ۚۚۨۙ۟۬ۧ۬۬ۜۦۘۗۘۜۘۙۥۛۡ۟ۢۦۙۖۘۦۗ۫ۡۥ۠ۙ۠ۘ۟ۘۙۗۙۖۢۖۙۛۥۢۜ۟۬ۘ۟ۛ۬ۙ۟ۜۖۖۘ";
                                                                    while (true) {
                                                                        switch (str7.hashCode() ^ (-2035580208)) {
                                                                            case -192342225:
                                                                                str7 = gameint == 5 ? "ۖۚۜۨ۫ۧۢۦۨ۫۫ۦۗۧۧۡ۠ۤۛ۫ۤۢۡۜ۟ۦۘ۠ۗۦۚۘۘۘۡۢۖۘۡۜۧۘۗۥۢۧۚۖۤۢۛۙۦۡۚ۬ۛۖ۠ۡۙۡۧۘۧۥ۟ۚۢۖۡ۬۫ۤۦۢۨۜۖۘۙ۬ۨۘۡ۫۬ۖ۟۟ۧۙۙۢۢۚۖۦۧۤۖۖۘۨۜۥۨۙۥۧ۫ۦۘۡۢ۬۬۟ۨۘۚۘ۬ۧۨ۠ۨۗۜ" : "۟ۤۖۘۗۗۖۘۦۤ۫۟۬ۗۛۜۢۡۚۖ۬ۧ۠ۥۖۚۦ۫ۚۜۛۢۙۘۢۛۜۘۨۚۢۦ۬ۜ۟ۜۥۜۖۤۗۦۗ۬ۙ۟ۨ۬ۥۡۥ۠ۨۛۡۘۡۥۚۨ۟ۡۖۗۜۘۙۤ۠ۡ۟ۡۤ۟ۦ۬ۧۖ۠ۗۖۥۗۦۖۥۘۢ۟ۙۖۖۧ۫ۦۘۨۛ";
                                                                            case -181856756:
                                                                                str6 = "۟۬ۢۜۛۘۧۦۦۥۙۥۜۙۛۗۖۧۤۡۖۙ۫ۗ۬ۧۦ۫ۚۥۨۡۦ۫ۨ۟۠ۡۘۛۛۙ۫۟۟ۜۘ۫ۛۛۥۘۘ۫ۥۘۦۖ۟ۘۚۤۢ۫ۨۤ۬ۢۡۚۦۧۗ۫ۚۛ۬ۚۦۤ۫ۛۖۢۗۧۘ۟ۨۙۢۥ";
                                                                                break;
                                                                            case 687121080:
                                                                                str7 = "ۨۙ۟ۚ۠ۡۘۘۛۙۦۙ۫ۙۦ۠۬ۥ۠ۚۧۦۜۥۥ۫ۦۘۗۙۦۘۥ۠ۖۢۡۘۘ۬ۤۥۙۨۦۘۡۘۘ۟ۨۤۤۖۘ۠ۦۧۚۛۨۘ۟ۗ۟ۖۘۘۘۖۛ۬ۖۛۡۘۤۚ۟ۖۢۤۤۧۜۙۡ۟ۘۥۦۘۜ۬ۖ۬ۧۛۘۨۘۤۢ۠ۢۦۛ۟۬۫ۨۨۘۘۗۚۨۘۢۧۜۡۘۥۘۡۧۘۘۗۚ۫";
                                                                            case 1426331823:
                                                                                str6 = "ۛۜ۠ۦۧۙۥۛۜۘۥۨۨۧ۟ۘۚۢۜۘ۠۟ۨۨۗۡۘۖۙ۫ۛۚۢ۠ۧ۫ۗۨۘۧ۬ۙۗۗ۟ۤۛ۠ۧۤۤۢ۬ۥۤۗۘۘۘۦۥ۬ۨۘۥ۠ۛ۬۬ۨۘۚۜۧۘۨ۟ۡۘۚۦۗۖۘۡۛۦۦۘۜۢۙۦ۟ۡ۟۟ۗۤۘۦۘۛۨ۫ۢۢۗۨۤۨۢ۬ۦۖۗۧۢ۫ۨۘۛۢۗۘۢۦ۟ۨ";
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case -327442151:
                                                                    str6 = "ۢۘۤۨۖۨۘۘۗۚۖۙۦۘۡۖۡۘ۫ۛۥۘۚ۠ۛ۠۫ۖۘۘۙۢ۠ۥۡۘ۬ۧۦۦۢۤۦۦۥۘۦۛۧ۠ۢۦۘۙۖۨۦۦۦۘۧۗۨۘۢۛۥ۟ۥۥۘۛۘ۬۠ۜۘۖۦۛۡۢۚۙۨۘ";
                                                                case 1466290356:
                                                                    str5 = "ۢۢۛۜۨۢۥۙۥۘۙۗ۫۬ۙۜۘۙۧ۬ۦۚۜۥۨ۬ۜۥۘۗۦۜۛۥۦۨۙۡۘ۟ۙ۠ۢۥۖۛۨۛ۬ۖۘ۬۠ۜ۠ۤۢۗۘۥۘۤۗۦۢ۠۠ۤۡۦۘ۬ۤۗۛۦ۟";
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 1688671050:
                                                        str4 = "ۖۖۤ۫ۘۦۘۨۚۥۡۘۖۘ۠ۛۘۧۦ۠۟۟ۜۜۡۨۢۘۘۜۜۖۘۤۖۢۢۗۜۘۖۦۜۨ۟ۨۘ۠۫ۢۢ۫ۙ۠ۢۜۨۚۜۧ۬۬ۡ۬ۛ۫ۦ۬ۦۦۗۘۘۜۖۤۡۤ۠ۡۘۤ۠ۡۘۨ۟ۢۢ۬ۖۛۥ۫ۧۡۨۘۢۛۨۧۘۥۘ۟ۗۢۜ۠۫ۤۜۧ";
                                                        break;
                                                    case 1756720138:
                                                        str5 = "ۨۥۨۘۥ۫ۢۦۡۦۙۜۜۘۘۖ۟ۢۦ۬۠ۢۡۗۧ۫۠ۘۜۘۛ۟ۘۘ۫ۢۗۦۛ۟ۘۦۙۛۨۖۢۥۨۘۤۨۧۘۚ۫ۛۚۖۛ۬ۛۧۚۜۘ۫ۛۨ۠ۗۘۘ۫ۨۨۤۢۧۖ۟ۙۙ۫ۧۥۘۚ۠۬ۦ۬ۡۨۘۡ۟ۤۖۜۙ۬ۧۗۜۥۘ۟ۥۚۧۙۛ";
                                                }
                                            }
                                            break;
                                        case 370700900:
                                            str4 = "۫ۦۦۗۘ۠ۥۥۨۡۖۨۘۜۜۘۢۖۧۦ۫ۘۘۙۤۗۨۘ۟۫ۘۛۚۛۨۘۛ۫ۦۥ۫ۚ۠ۧۚۢۤۤ۠ۨۙۙ۬ۦ۬ۧ۟ۘۖۘۚۡۡۘۙ۠۠ۗ۬ۛۙۛۘۘۡۚ۠ۖ۟ۦ۬ۧۚۥۤۦۙۢۥۘۨ۬ۡۙۧۦۘۜ۟ۖۘ۬ۚۦۘۘۜۜۘۗۧۚۧۢۢۡۥۗۘۛۨۘۖۡۜۚ۠ۜۘۥۡۨ";
                                        case 1596779073:
                                            str3 = "ۨۖۨۗۥۥۙۧۘۦ۠ۜۘۘۗۛ۠ۨ۫ۥۖۘ۟ۡۛۥۛ۫ۨۛۢۗۤۤۧۖۛۛۙۡۘ۠ۘۛۗ۫ۖۘۥۚۘۘۖۨۘ۫ۨۧۘۚۗ۫ۗ۠۠ۧۖۥۚۨۗۥ۬ۚ۠ۦۙۜۛ۬ۧ۬ۡۘۙۨۡۘۙۤۢ۫۟ۚۗ۠ۙ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -728380520:
                    j3 = -3440721026045796169L;
                    str2 = "ۢۧ۫۠۬ۨۘۖۦۘۨۛ۫۟ۡۗ۬۬ۛۡۥۧۦ۬ۨۘۚۛ۫ۛۥ۫۟ۙۢۥۘۘۙۜ۬۟ۚۢۧۡۙۦۚۙ۟۠ۨۛۘۥۘۤۜۘۧ۠ۢ۟ۚ۟ۧۨ۫ۖۤۚۙۚۖۧۥۡۘۤۙۘۘۤۙۘۘۥۙۗۜۙۙ۫ۧۗ";
                    break;
                case -598928703:
                    return;
                case -396299166:
                    j = -3440721004570959689L;
                    str2 = "ۘ۟ۖۘ۬ۘۥۘ۬۫ۚۘۗۥۘۖۜۨۙۖۘۤۖۥۢۦۗۜۧۘۘ۠ۥ۬۟ۘۖۤۢۦ۟ۥ۟ۨۜۖۗۧۤۨ۠ۡۤۨۤۧۨۥۘۥۛ۫۟ۜۥۧۘۖۙ۫ۦۘۦۨۨ۠۬ۘ۫ۛۥ";
                    break;
                case -369054697:
                    Exec(Deobfuscator$$app.getString(-3440720983096123209L) + game + str, getString(C0931R.string.str00e0));
                    str2 = "ۙۚۥۘۢۥۡۤۦۨ۟ۨۧۡ۟ۙ۬ۛۙۙ۫ۜۘۦۗۘۘۖۜ۬ۡ۫۟ۦۚۗۜۘۡۨۜۨۖۖۨۘ۬ۖ۟ۡۜۚۗۧۙۤۛۜۥۦۨۧۘ۬ۥ۬ۥۘۧ۟ۘۘۜۙۦۜ۫ۤۛۙۨۘ";
                    break;
                case 216811351:
                    str = Deobfuscator$$app.getString(j2);
                    str2 = "۠ۦۖۘۦۖ۫ۨۥۥۚۗۛۧۦ۬ۗۘۢۘۤۚۦۙۤ۟ۚ۬ۚۥۥۘۦۧۛ۟۫ۦۘۢ۟ۦۘ۫۫ۢۙۨۥۘ۫ۢۙۖۡۢۤۦۤۨۨۥ۟ۥۘ۟ۗۚۙۗ۠ۧۧۨۘۜ۟۠ۢۖۥۦۚۥۘ۟ۨۦۘۧۧۖۘۙۧۖۘۜۧۤۧ۬ۖۥۢ۟ۗۛۥۘۡۖۛۙۤۚۘۖۙۡۚ۟ۡ۫ۙۥۖۢۦۙ۫ۛ۠ۢۘۙۜۘۖۤۖۘ۬ۙۘۢۛ۠";
                    break;
                case 991092325:
                    str2 = "ۚ۬ۛۦ۟ۥۢۡۘۘۡۗۗ۠ۤۚۛۚ۫ۨۗ۟ۡۙۤۢۡۦۘۜۗۡۘۨۦۖۘۧۛۦۢۘۡۘۜ۟ۡۘۛۤۗۙۙۥۘۙۨۙۦۥۦۖۤۧۦۥۧۘ۟۫ۛۛۥ۫ۨۢۖۘ۬ۙۤۖۨ";
                    j2 = j3;
                    break;
                case 1472023011:
                    str2 = "ۛۚ۠ۜۨ۟ۥۦ۠۠ۛۜۘۖۚۡۘۨۗۤۢ۬ۘۛۖۨۘ۠ۖۛۖ۬ۘۘ۬ۢۙۧۥۢ۫ۛ۫ۖ۬۫ۧ۟ۡۡ۠۫ۤۥۜۤ۟ۘۦۛۨۘۨۨۛۦۖ۟۫ۗ۠ۙۗ۫ۗ۬۫ۘ۫";
                    break;
                case 1669427534:
                    str2 = "ۛۚ۠ۜۨ۟ۥۦ۠۠ۛۜۘۖۚۡۘۨۗۤۢ۬ۘۛۖۨۘ۠ۖۛۖ۬ۘۘ۬ۢۙۧۥۢ۫ۛ۫ۖ۬۫ۧ۟ۡۡ۠۫ۤۥۜۤ۟ۘۦۛۨۘۨۨۛۦۖ۟۫ۗ۠ۙۗ۫ۗ۬۫ۘ۫";
                    j2 = j;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$setupGameButton$3$kentos-loader-activity-MainActivity  reason: not valid java name */
    public /* synthetic */ void m256lambda$setupGameButton$3$kentosloaderactivityMainActivity(String str, AlertDialog alertDialog, View view) {
        File file = null;
        String str2 = "ۤۛۥۘۖ۟ۨۜۜۡۘ۟ۗۥۘۗ۫ۦۧۡۧۘ۟ۗۥۘۖۙۜ۠ۥۘۚۥۦۥ۫ۦ۟ۡۖۘۧۨۦۘۙۚۧۙۘۘۥۜۧۘۦۙۡۢۥۡۘ۠ۘۨۘۧۨ۬۫ۡۚۙ۫ۡۘۖۥۦۘ۫ۥ۫۬۫ۤۢ۠ۧ۠۠ۘۘۦۡۡۛۤۖۚۘۡۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str2.hashCode() ^ 561) ^ 508) ^ 432) ^ 516) ^ 55) ^ 379) ^ 107) ^ 889) ^ 94) ^ 129) ^ 318) ^ 676) ^ 293) ^ 977) ^ 627) ^ 846) ^ 239) ^ 757) ^ 120) ^ 287) ^ 99) ^ 112) ^ 927) ^ 687) ^ 319) ^ 914) ^ 306) ^ 444) ^ 457) ^ 764) ^ 469) ^ 187653017) {
                case -1974235824:
                    str2 = "ۚ۫ۥۨ۫ۨ۬ۙۨۘۗۜۧۘۢۥۜۘۤۗۖۘۥۢۥ۫ۤۛۧۨۜۜۚۨۜۦ۬ۚ۫ۚۚۤۘۘۗۡ۫ۤۨ۟ۗ۠ۡۜۙۗۨ۟ۡۗۢۖۨۡۨۥۙۜۘۢۥۜۥۖۥۘ۠ۦ۬۬ۖۘۚۤۜۘۢۗۡۘ۠ۧۦۥ۫ۖۘۦۢۘ";
                    continue;
                case -1818595551:
                    str2 = "۠ۘۗۨۤۘۙ۬ۢ۟ۖۡۘۗۗۦۘ۠ۨۗۘ۫ۦۘ۟ۛۦۘۥۜۥۘۦ۫ۖۘۘۛ۠ۜۦ۬۟ۘۨۘۦ۬ۜۘۢۜۨۘۨۙۜۘۨۖۘۘۚ۟۠ۙۙ۠ۧ۟ۚۚۡۘ۫ۢۨۧۨۨۘۨۨۜۘۢۚۤۦۢۧۘۢ۠ۖۥۨۘۦۡۖۘۙۛۛۦ۟ۤۛ۫ۨۗۢۦۘ۟ۤۧۢۘۖۨۛۙ۬۫ۤۤ۠ۤۖۛۛۤ۟ۜۘۘۡۙ۠ۙۘۘ۠ۙۛۗ۬ۡۜ۬ۘ";
                    continue;
                case -1358290541:
                    file = new File(Deobfuscator$$app.getString(-3440721146304880457L) + str + Deobfuscator$$app.getString(-3440720961621286729L));
                    str2 = "ۧۦۜۘۦۖۨۘۡۗۤۨۛۛۛۚۖۡ۟ۗ۫ۦۧۛۘۦۘۨۜۘۚ۫ۖۡۨۤۖۧۛۤ۟ۧۡۘۛۛ۫ۡۨۡۘ۫ۥ۠ۤۛۢ۟ۜۙۗۗۧۚۘۧۙ۠ۘۙۤۤۤۖۧۨ۠ۙۛ۠ۤۜۤۘۖۚۜۦۙ۠ۛۖۗۨۚۥۜۢۛ۬ۨۢۖۢۢۙۧۗۡۘۧۚۦۙۧۡ۟ۤۗۘۤ۫";
                    continue;
                case -1321714188:
                    str2 = "ۜۙۘۘۗ۟ۘۘۛۤۤۧ۬ۛ۫ۨۦۘ۬ۨۜۙۤۦ۬ۡۥۢۚۦۥۢ۫ۛۥ۠۬ۢۜۘۢۧۗۚۤۢۘۚۖۢۗۖۢۗۦۘ۟۠۠ۦۜۦۗ۟ۜۘۨۥۦۘۧۜۥۘۘۛۜۘۚۜۢۖۢۧۥۤۘ۠۠۬۬ۤۤۗۛۘۘۨ۟ۡۜ۟ۗۖۖۜۙۤۡۘ۠ۙۨۧۨۤ۬ۦۘۖۤۧۖۧۜۨۧۥ۫۠ۤۖۦ۟ۨۙۨ۠ۡۨۘۤۙۙ";
                    continue;
                case -1129844102:
                    str2 = "ۤۦۢۦۤۡۘۧۛۘۘۨۜۙۢۡۜۘ۠ۢۖۘۢۢۨۦ۟۫۟ۜۚۢۦۘۘۥ۫ۗ۬۫۬ۜۤۥۘۚۛۨۘۙ۬ۖۘۙۛۥۡۚۧۥۗۦۘۡۥ۫ۜۚۜۘۨۤۨۨۙۜۦۨ۠ۚۖۜۖۢ۬ۢ۟ۙۘۘ۬ۡۜۘۘۛ۫ۡۦۥۘ۟ۨۨ۬ۖ۬۠ۛ۫ۤ۠ۚۨۚ۠۬ۥۥۘۦۜۗۛۤۛۦۘۥۙۜۦ۬ۦۥۨۛۘ۫ۧۢۚۛ۬ۢ";
                    continue;
                case -696621415:
                    Toast.makeText(this, getString(C0931R.string.str003b), 0).show();
                    str2 = "ۤۙۡۘۧۨۘۚۦۡۘۧۜۡۘۙ۟ۨۘ۠ۨ۫۬ۥۥۚۦۖۘۥۘۨۘۤۗ۟۠ۖۘۦۦۜۘۦ۬ۦۦۘۖۦۧۘۡۙۛۤۚ۬۟ۨ۠ۚۜۜۜ۟ۦۘۘ۬ۨۢۥۧۘۗۧ۬ۗ۬ۨۘۜ۫ۥۘ۬ۖۘۘۗۛۤ۬ۖۘۤ۠ۤۧۜۖۘۢۨۡۘۨۘۘۖ۬ۜۡۢۨۙ۬";
                    continue;
                case 271734831:
                    str2 = "ۡۛۥۘۚ۠ۜۘۚۤۘۘۗۡۘۧۜۘۘۦ۠ۚۨ۬ۖۤ۬ۢۨ۫ۥۖۡۥۘۙۨۧۘۙۨۡۘۢۨۧۤ۬ۦۗۦۧۘۛ۠ۗۖۤۜ۬ۜۖۘ۬ۦۢ۬ۦ۬ۡۘۨۥ۫۟۠ۦۦ۫۬۠۠۟ۖۘۙ۬ۨۜۦۨۧۗۢۦ۠ۡۘۗ۬ۘ";
                    continue;
                case 964816249:
                    String str3 = "ۛ۬ۛۨۘۤۤۚۡۘۙۡۦۦۖ۠ۦ۟ۡۘۘۢۖۚۨۦۘۚۢۤۢ۬ۨۙۧ۬ۢ۟۟۬ۜۤۖۗۡۤۨۖۧ۬ۡۗۗۛۜ۫ۦۡۜۥۢۦۘۤۥۧۘۖ۟ۥۘۙۜۚۨۖۡۘۥۧ۟ۤ۠ۘۘۦۛۦۧۥۖۘۡۛۙۗۦۜۘۜ۟ۤۢۢۖۡۗۨۘۨۚۚۡۡۘۨۢ۟ۨۖۗۘۨۦۗۦۘۧ۬۫";
                    while (true) {
                        switch (str3.hashCode() ^ (-1932710463)) {
                            case -584750038:
                                String str4 = "ۦۡۘۘۙ۫ۦۘۤۢۘ۫ۧۘۡۛۤۖۙۨۦۧۥۦ۬ۛ۬ۘۘۘۡۦۖ۟ۜۘۛۛۤۚ۠ۡۜۖ۬ۛۨ۫ۗۦۜۤۛ۫ۡۚۤۨۡۘۥۘۜۡۜۗۛ۬ۦ۫ۛۜۘ۬۠ۡۘۢ۬ۥۘ";
                                while (true) {
                                    switch (str4.hashCode() ^ (-1785938502)) {
                                        case -1389621321:
                                            str3 = "ۦۤۛۡۢۨ۠ۢۦۘ۟۟ۜۘۖۤ۠ۨۚۘۛ۬ۖۘۤۨۨۘ۠ۡۨۘ۬ۤ۠ۨ۫ۤ۬ۖۤۛۜۢۚۗۘۛ۟ۜۘۥۙۦۘۘۜۦۘۡۨۤۨۖۨۘ۫ۤۜۘ۬ۢۨۘۙۙۘۘۡۡۦۜ۟ۜۢۧۛۘۦۗۤۚۢ۬۠ۙۢۤۙ۫ۘۜۗۧۧ۬ۘۘۛۦۡۘۘۙۜۚ۬ۖۘۙ۠۟ۜۘۛ۠ۨۘۗۥۡۘۚۙۥۦۙۚۛۛۖۘ۫ۤۤۨۤۢۦۨۜ";
                                            break;
                                        case -380152753:
                                            String str5 = "ۛۘ۠ۗۤۚۤۗ۬ۜۧۛ۠ۡ۠ۤۘۤۖۘۛۚۧ۬ۢۨۧۗۨ۠ۘۥۦ۬ۤۘۘ۫ۤۗۤ۬ۜۤ۟ۥۘۙۜۙۗۚ۬ۨۚ۠ۥۛۡ۠ۦۢۦۗۥۦۖۘۢۘۧ۟ۖۗۢۘۙ۫ۜۦۘۡۚۡۘۥ۬۫۬۬ۨۘ۠ۘ۠";
                                            while (true) {
                                                switch (str5.hashCode() ^ 1109465181) {
                                                    case -2092763541:
                                                        str5 = "ۗۥۢۚۧۡۘۢۨ۬۠۟۫ۘ۬ۦۘۙۧۜۢۘۥۧۨۧۥۖ۫ۚۨۡۘۥۥۡۘ۠ۙ۫ۗۦۡۘۛ۠ۘۘ۠ۘۡۙۚۙۘۢ۬۫ۨۘۧۖۦۘۘۚ۟ۧۤۘۜۛۨۥ۫ۜۘۜۨۚۘۦۘۘ۫ۥۛۡۖۘۗۗۖۚۛۢ۫ۦ۬ۖ۟ۜ۟ۛۨۘۘۡ۬۬ۦۘۘ۫ۤۗ";
                                                    case -438305791:
                                                        str4 = "ۦۜ۟ۘۚۜۘ۟۫ۗۡۙۥۘۢۡ۠ۤۙۛۡۨۨ۬ۜ۫ۚۦۥۙۙۥ۟ۚ۫۟ۨۘۘۢۤۛۢۗۜۘۢ۠ۚۜۧۚۗ۫۠۟ۗۜۤ۫ۖ۠۫۫ۚۤۖۜۜۨۘۧۘۜۙۘۘۘۨۛۖۙۢۥۘۡۧۘۢۢۖۦۦۖۤ۫ۜۘۥ۫۟ۜ۫ۛ۫ۖۨۙۦۥۘۚۛۗ۫ۡۤ۟۫۠ۡۢۖۘ۟ۢ۟";
                                                        break;
                                                    case -124381673:
                                                        String str6 = "ۚۤۙۙۦ۠ۤۤۢ۠ۨۚ۬ۦۙۘۨۦۖۚۥۦۨۗۜۖۦۦۦۧۘۘۜۡۘ۫ۙۜۖ۟ۜۗۦۖۥۧۗۙ۠ۧۖۡ۠ۤۧۜۘۛ۬ۢۦۡۜۘۡۨ۟ۚ۬ۢۡۡۧۧۡۜۘۢ۬۠۟ۤ۬ۡۗۧۚ۬ۜۗۤۡۙۡۧۘۡ۟ۥۘۦۤۡۘۚ۠ۨۘ۫ۥۜۘۚۢ۟۠ۢۘۘۡۥۡۡۚ۠ۗۜۜۘۦۗۙ";
                                                        while (true) {
                                                            switch (str6.hashCode() ^ 1370965588) {
                                                                case -1801977764:
                                                                    str5 = "ۜۚۖۘۖ۠۫ۜۦ۫۠ۢۧۛۘۘۘۙۨۖۘۧ۠ۧۛۨۧۛۗۥۘۚ۬ۛ۠ۥۜۘ۬۬ۦۘۛۦۙ۫ۜۧۘۗۘ۬ۚۙ۠ۥۧۦۘۥۚۛۡۙۨۨ۟ۘۦۨۘ۟۟ۨۘۡۦۧۤۗۢۚۚۦۘۥۧ۟۫ۧۜۘۙۗۛ۠۬ۜۘ۫۠ۡۘ";
                                                                    break;
                                                                case 897483908:
                                                                    str6 = "ۢۦ۫۟ۦۛۡۗۗ۫ۤ۫ۚۘۛۜۨۘۘۛ۬ۖۡۘۙۧۚۗ۫ۤ۠۬ۗۨ۟ۗۛۛ۬ۖۦۛۨۘۜۗۤۛۗۥۘۜ۫ۦۘۖۜۙۖۥۘ۬ۢ۬ۜۛۖۘۢۧۚۗۚۜۘۢۦۖۘ۫ۛۥۘ۬ۜۘۙۚۡۧۤۗۛۘۜۥۦۢ";
                                                                case 1048470568:
                                                                    String str7 = "ۜۧۘۡۛۖۘ۬ۗۡۛۗۡۤۖۧۦۘۤۤۖۘۘۡۜۘ۠ۖۥۘۗۗۖۚۦۤ۠ۜۛۦ۟۠ۡۘۘ۬۬ۜۨۙۡ۬ۡۡۘۡۧۨۚ۠ۗۗۘۜۘۡۡۤ۠۫ۦۘۚ۫ۗۚ۠ۚۥۦۘۙ۫ۧۦۗ۬ۛۨۜۘۦۚۥۘۢۙۦۘ";
                                                                    while (true) {
                                                                        switch (str7.hashCode() ^ 1816282875) {
                                                                            case -1609981285:
                                                                                str6 = "۠ۘۤۦۨۚۚۨۛۗۨۗۢۜۧۗۚۡۘۗۘ۬۠ۤۨۘۦۢۛ۟ۥ۬ۘ۫ۥۚ۫ۡۢۗۦۘۨۡ۬ۛۛۥۘ۫۬ۦۧۖۨۘۖۜۙ۟۟ۗۧۧ۟ۛۚۦۘ۟ۨۧۢۡۢۘۙۥۘۛ۫ۤ۟۠ۚۧۖۧۘۡۛۡۘۢ۠۠ۖۛۘۘۜۡۡۘۚۙۘۘۗ۟ۖۘۡۡۤۚۦۨ";
                                                                                break;
                                                                            case -923472176:
                                                                                str7 = file.delete() ? "ۖۘۜۘ۟۫ۚ۟ۧۘۘ۫ۗۜۘ۟ۛۛۢۧۗۡۚۢ۠ۡ۬۟ۢۛۦۙۤۢۙ۟ۜ۟ۜۘۛ۠ۜۘۚۘۛ۠۠ۖۨۨۦۗۘۖۢۡۡۘۗ۟ۘۛ۟ۨۦۙۦۙۨۧۨۧۘۧۨۗۢۛۚۧ۟ۥۖۡۜۥ۠۠ۨۥۘ" : "ۛۤۥۘۙۥۚ۬ۜۘۛۘۨۚۧۘۘۨۖۜۘۢۥۨۤۜۙ۬ۖۦۨۥۦۘۙۜۜ۫۬ۨۘۡۥۖۘۙۘ۬ۥ۟ۦۘۗۦۜۥۢ۫۫۬ۘۘۚۧۛۗ۫ۨۘۡۥۛۚۤۚۖۜۚۧۜ۟۫۬ۢۡۚۨۘۜۡۡۘ۟ۥ۠ۚۚۜۦۧۤۚۦۦۛۦۦۘۤۜۥ۠ۥۙۡۨ";
                                                                            case -874302228:
                                                                                str6 = "ۤۡۖۘۘۢۤۥۤۡ۠۟ۙ۟ۘۘۢۛۖۘۥۛۦۗۛۚۨ۫ۜۘ۬ۙۘۘۛ۬ۦۤۤۧۤ۫ۜۘ۟۫۬ۛۤۚۦۢۧۚۜۘ۟ۚۗۗۘۥۜۙ۬ۙۚۢۥۥۡۘۨۜۨۧۜۜ۫ۨۤۥۢۜۜۖ۬ۨۧۦۚۤۧۧۚ۬ۡۙۚۜۘ۠ۖۖۧۡۗۧۦۘ";
                                                                                break;
                                                                            case 410681814:
                                                                                str7 = "ۨ۠ۚۘۗ۫۬ۙۧۦۘۢۛۥۘ۫ۘۘۘۖۡۚ۟ۖۦ۠ۗۦ۠ۘۥۘ۬ۛۜۘۛۤۨۘۛۘۥۤۨۗۧۜۚۘ۫ۡۘۙۥۧۦ۫ۨۡ۬ۛۖ۫ۢۨۧۘۢۘۛۚۢۥۘ۬ۘۤۙۧۘ۬ۡۡۧۧ۫ۙۤۙۚۚ۬۠ۡۗۦ۬ۜۚۥۦۘ۠۟ۥ۬ۖۧۘۜۗۤ۬ۜۖۛۡۘۖۧۜۜۤۡۘۘۤۗۜۗۡۘۗۗۜۘۘ۬ۦۡۥۚ۠ۗۗ";
                                                                        }
                                                                    }
                                                                    break;
                                                                case 2043335265:
                                                                    str5 = "ۚۘۜۘۙۖۛۗۥۦۡۘۜۦ۬ۥۜۜۧۘۦ۟۫ۗۥۥۘۨۙۚ۠ۙۨۘۤ۬ۥۘ۫ۢۡۘۛۦۛۘۙۘۘۖۡ۫ۥ۬ۡ۫ۨۨۡۥۨۘ۬۟ۖۘۗۜۘ۟ۗۘۛۢۥۨ۟ۧۘۡۙۡۡۗۖۦۨ۠ۨۘۖۢۨۤ۬ۖۗ۫ۢ";
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 1870510739:
                                                        str4 = "ۡۙۛۖۧۦۗۙۚۤۚۡۘۚۦۘۘۥۘۤۜۘۙۗۜۖۤۢۧۤۚ۠ۦ۬ۦۘۘۧۦۥۥۜۘۘۧۙۙ۟ۗۘۨ۫۬ۤ۟۬۟ۨۚ۠ۜۢۗ۫۠ۘۢۚۘۘۨۖ۠ۧ۟۠ۨۜۘۦ۬ۢۘۘۧۘۖۛۖۧۢ۟ۡۖۙۙۚۨۜ۟۟ۛۛۢۘ۠ۤۗۖۘۘ۠۟ۧۨۛۘۖۘ۬ۘۡ۠ۦۙۦۡ۠ۥۖۦۦۘۡۘۙۙۖ۬ۛۚ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case -94564144:
                                            str3 = "ۦۦ۟ۘۗۘۘۢۥۤ۬ۙۤۡ۠ۘۘ۟ۜۧۘۚ۟۠ۛۡۡۖۡۧۡۖۜۘ۫ۤۡۙۢۦۗۙۛۦۛۦۜۖۚ۫۠ۨۘۘۥۖۘۚۡۘۖۖ۟ۧ۟۬ۡۙ۬ۖ۬۬۟ۥۦۘۥۧۘۘۗۡۙ۠ۗۗۗ۫۟ۡۗۖۥۧ۟ۚ۟ۖۘۗۢۚۥۧۚۢۗۥۡۘۨۘۨۗۖۖۢۛ۬ۨۙۤۨۜ۟ۥۘۗۜۧۘۢ۠ۦۘۢۜۙۡۖۛۜۗۜۘۘۧۥ";
                                            break;
                                        case 1158166374:
                                            str4 = "ۜۜ۠ۥۗۖۘۨۙ۬ۗۥۨۘۛۤۜۘۗۚ۠ۧۘ۫۟ۧ۠۬ۗۜۘ۫ۦۘۥۤۧۨ۬ۛۢۥۥۖۧ۟ۨۖۘۗ۟ۡۙۗ۫ۚۤ۬ۖ۠ۜۛۡۧۚۚۧۖۦۦۚۥۚۧۗۗۗۥۚۗۚ۠۬ۧۜۗۚۦۘ۬ۙ۟ۤ۬ۙ";
                                    }
                                }
                                break;
                            case -301934389:
                                break;
                            case 365619771:
                                str3 = "ۛۢۖۘ۬ۧۘۘۙۨۖۗۢۜۘ۬ۘۦۙۡۧۜ۬۟ۡۘۥۦۖۘۜۨۧۘۖ۠۟ۜ۫ۛۛۦۘۧۘۢۘۖۨۤۡ۬ۚۦ۬ۛۘۘۥ۠ۖۖۥ۫ۗۨۘۘۧۦۡۨ۠ۨۗۥۢ۟۠ۙۙۛۥۘ۠ۧۦۘۜۨۧ۟ۚۜۧۢۦۖۡۧۘۦۢۘۘۖۧۧۖۦۧ۬۬ۛ";
                            case 1417442048:
                                str2 = "ۥۤۦ۬۠ۖۘۤۙۘۡۧۨۘۧ۟۫ۘۡۛ۫ۗۖۦ۫۟ۤۤۡۘۜۖۡۨ۟۫ۖ۬ۜۜۖۖۘۤۤۤۦۢۨۡۗۘۘۦۘۨۧۖۜۨۡۨۘۘۜ۟ۡۦۚۛۢ۬ۘ۬ۜۧ۟۟۫ۘۨۘ";
                                continue;
                        }
                    }
                    break;
                case 1279236629:
                    String str8 = "۟ۤ۫ۖۖۨ۠ۚۛۙۡۜۘ۠ۥۢ۠ۦۤۗۜۡ۬ۤۥۘ۟۫ۜۘۙۚ۟ۥۥۨۘۧۚۥۤۚۜۘۙۙۦ۫ۧۤۛۙۧۤۗۚۗۨۢۖۧۘۡۧۚۧۥۖۘۖۡۘۥۙۜۘۥۜۜۛۧۗ۬ۛۘۗۖۦۥۦۘ۬ۗۚۨۛۜ";
                    while (true) {
                        switch (str8.hashCode() ^ 337764403) {
                            case -1072539751:
                                str8 = "ۚۤۥۤ۠ۦۘۘۜ۬ۗۢۧۤۚۖۘۗۧۧ۟۫ۥۘۚۙۖۘۨۨۦۤۖۤۧۙۢۛۨۛۜۤۨ۬۠۟ۧۢۨۘ۬ۗۘۚۗۧۘۦۦۘۘ۟ۜۘۙۚۢۢ۬ۢۥۨۧۘۚۚۜۘ۬۟۟ۘۖۚۜۗۥۘۨۖۨۜۦ۫۫ۤۚ۠۬ۖۘ۠ۘۜۘ۠ۢ۬ۛۚۥۘۘۢۨۚۤۥۘ";
                            case -484957723:
                                break;
                            case 1046018942:
                                String str9 = "ۜ۬ۡۨۧۖۘۛۨۤۢۡۗۗۙۙۧۢۛۙ۟ۜۖۘۧۦۘۨۘۧۢۤۜ۟ۧۖۡۦۗۘۥۥۘۤۚۥۤۥۤۢۚ۬۟ۥۘ۟ۜۦۘۡ۬۫ۡ۟ۦۧۤۖۨۘۗۤۖۘۡۖۦ";
                                while (true) {
                                    switch (str9.hashCode() ^ 1596225324) {
                                        case -2123386208:
                                            str9 = "۠ۖۧۚۨ۠ۚ۟ۗۤ۬ۖۘۖۥۜ۫ۦ۫ۥ۬۟ۜۢۦۘۙۜۖۘۧ۠ۛۖ۫ۛۨۡۘ۬ۘ۟۠ۢۗۙۗۚ۫ۨۗ۠ۡۡۘۦۘۖۡ۫۟۠۠ۚۨ۟ۤ۠ۥۚۤۥۧۘ۬ۙۖۨ۠ۡۘ۠۠ۙۢ۫ۚۦۜۘۘۜۘۘ۟ۘۧۘ";
                                        case -1264200502:
                                            String str10 = "ۖۛۛ۠۫ۚ۬ۧۥۖۜۤۚۧ۫ۘ۫ۜۘ۬ۡۖۘۦۗۘۘۤ۫ۚۗۦۡۨۜۤۚ۟ۖۘۡ۬ۗۖ۠ۖۖۧۡۘ۫ۧ۫ۥ۠۬۠ۛۡۜۘۛۤۢۧۙۦۘۗۧۜۨۢۖۘۚۜۚۢۥۖۘ";
                                            while (true) {
                                                switch (str10.hashCode() ^ 245761447) {
                                                    case -433637438:
                                                        str9 = "۫ۢۘۘ۟ۛۥۥۜ۫ۛۘۡۘ۬۟ۘۦۦۥۘۛۖۨۘۥۥۥۘ۠ۚۧۖۜۘۗ۬ۨۘۛ۠ۡۘۧۦۢۦۥۜۨۖۘ۫ۗ۟ۗۤۨۘۜۚ۫۬ۡۚ۫ۖۙۛۦۥۢۧۦ۫۬ۧۧۤۥۘ۟ۡۙۚ۫۠ۨۘۙۖۨۘۚ۟ۙۡۦۖۘۤۡۛ۬ۡۨ۬۠ۜۘۘ۠ۤ۬ۜۜۘۗ۫ۜۢ۟ۘ۟ۨۘۖ۟۬ۦۗ۠";
                                                        break;
                                                    case -419527385:
                                                        str10 = "ۡۘۧۘ۫۟۬ۚۚۙۜ۟ۡۖ۫ۦۘۗۖۢۥ۬ۦ۟ۖۨۤ۟ۘۢۧۨۢ۟ۙۜۤۘ۠ۖۘۚۘۘۗ۬ۨۦۡۨۘ۫۫۠۬۠۟۠۠۟ۘۧۘۖۧ۟ۧۦۢۢ۫ۦۘۜ۫ۜۙۧۙۗ۬ۡۘۡۡۗ۟ۥۨۜ۫۠ۨۙ۠ۚۚۚۡۤۜۡۚۨۛۛۤۘۤۜۘۧ۟ۨۥۚۚ۟۠ۧۖۙۦۙۡۘۜۡۨۘۙ۬۫۠ۛۢۜۦۗۜ۫ۦ";
                                                    case 1326688225:
                                                        str9 = "۬ۖۜۘۜۖۦۚۛۛۦۡ۬ۜۙۘۧۤۚ۠ۢ۬ۚ۫ۛۛۜۗۗ۠ۡ۠ۨۧۘۖۢۦۘۚ۟۠ۗۧۚۙۚۥۘۦۚۜۘۘۥۚ۠ۖۧۛ۟ۚۦۢۜۚۖۜۙۜۘۧۗۚۧۥۙۦۜۦۤۦۘۤ۟ۢۨۡۜ۟ۧۦۦ۫ۡ۟ۛۦ۫۬ۗ۬ۢۗۢۗۦۘۜۦۡ";
                                                        break;
                                                    case 1532104749:
                                                        String str11 = "ۛۡۛۨ۟ۖۘ۠ۖۘۛۤۦۡۦ۟ۙۡۘۗۢۛۙۧۦۘۥ۟ۖۘۢ۠ۘۘۜ۬ۛ۟۟۫ۚ۠ۜۚۘۥۤۥۙۚۨۖۘۢۡۘۜۚۘۘۗ۟ۗ۠ۛۚۙۡۡۥۚۖ۠ۘۙۗۚۖۘ۠ۡۡۢۛۚۜۗۖ۠ۘۜۥ۫ۜۧ۟۟ۤۗۥ۟۠ۘۨۧۖ۫ۜۤ۟۠ۨۘ۬ۧۖۘۦۤۜۧۡۜۘۚۛۤ۠ۜ۬";
                                                        while (true) {
                                                            switch (str11.hashCode() ^ 956846445) {
                                                                case -1381624833:
                                                                    str11 = "ۢۧۘۙۥۜ۬ۥۙۢۘ۫ۥۡۨۘۧۥ۫ۧۢۘۘۚۛۚۙۜۘۘۚۧۦۘۖ۟ۗۡۡۘۖۦۙ۬ۨۧۘۘۜۨۜۨۘۥۦۜۘۥۢۨۥۗۨۘ۟ۡۦۘۤۡۥۘۤۚۨ۫ۨۛ۫ۡۦۘۛۢۜ";
                                                                case -443976576:
                                                                    str10 = "۫۬۫ۤۡ۠۬ۧۥ۬ۦۘ۟۫ۙۦۢۦۚۨۥۖۡۘ۫ۢۚۢۡۖۘۧ۬ۙۨۗ۠ۘۧۤۦ۫ۨۘ۫ۥۜ۠۬ۧۛ۫ۡۘۤۡۚۚ۟ۧۤۧۧۚ۬ۢۘۘۦۘ۟ۨۙۗۙۘۘۦۡۧ";
                                                                    break;
                                                                case 425655677:
                                                                    str10 = "ۚۥ۬۟ۡۦۜۢۘۘ۟ۗۙۙۢۨ۟ۦۨۢۜۦۥ۫ۥۧ۫ۥۖۚ۠ۦۤۤۧۦۦۘۛۜۘۚۛۗۦۜۥۘۖۤ۟ۦۦۜۘۨ۫ۗۘۤۛ۠ۘۙۡۦۨۢۗۜ۠ۢۡۥۤۧ۟ۥۗۜۧۜۛۢۗۨ۬ۨۤۗۖۗ۫ۦ";
                                                                    break;
                                                                case 531177945:
                                                                    String str12 = "ۥۡۖ۬ۡۦۢۜۖۦۧۗۖۘۦۙۘۙ۠۫ۜۗۙۖۖۢۡۚۜۦۘۛ۫ۤۚ۠ۦۘ۬ۦۧۘۦۦۘۦۧ۫ۤۖۖۘۚ۬ۡۙۨ۬ۖۘۗ۫ۡۗۘۘۥۘۚۦۖۘۛۙۚۢۖۥۘۨۧۥۧۗۧۛۘۧۢۖۦۘ۫۬ۦۧۡ۠ۖۨۛۥۥۖۨۗۥۘۙۢۛۜۤۛ۫ۚۜۖۢۨۘۤۙۦۘۨۤۖۘۧۛۦۘ";
                                                                    while (true) {
                                                                        switch (str12.hashCode() ^ (-856324791)) {
                                                                            case -1790441654:
                                                                                str12 = "ۡۜۗۛۢۖۢۨۥۘۡۘۢۤۢۦۘۚۛۡۘۡۘۜۧ۠ۚۤ۠ۢۙۚ۬ۖۥۘۨۗۡۥۙۘ۠ۗۖۨۤۜۘۚۖ۬ۤۛۙۗ۬ۖۘ۫ۡۧۘۤۗۢۨ۠ۦۘ۬۫ۘۘ۫ۗۢۥۙۦۘۖۗ۬ۡۛۖۤۤ۬ۤ۟ۜۙۗۜۡۖ۫";
                                                                            case -1377125328:
                                                                                str11 = "ۦۥۧۘ۬۬ۦۨۛۙۦ۠ۦۘۤۤۧۥۚۜۧ۬۫۠ۢۗۢۤۤۥۗۘۨۡۙ۫۠ۡۘۨ۫ۡۥ۠ۚ۫ۡۦۡ۠ۡۧ۬ۘۥ۬۟۫۠ۧۙۥۦ۫ۧۙۗۚۤ۫۬ۚۢۥۚۗ۬ۜ۫ۖۡ۫ۡۘۜۖۨۜۧۗۡ۬ۨۘ";
                                                                                break;
                                                                            case -1327780953:
                                                                                str12 = file.exists() ? "ۤۤۧۗۙۚۨۤ۫ۖ۫۟ۛۦۚۨۤۗۥۤ۠ۦۙ۠ۢۢۨۘۧ۬ۨۙۥ۟ۚۙ۠ۜۖۗۗ۠ۥۧۢۘۡۨۘۚۢۥۘ۫۠ۨۘۙ۬ۢۢ۠ۤۨۚۢۚۘۤۢۤۡۡۤۥۢۥ" : "ۧۦۜۘۙۢۜۘۚۤۢۛۚۧۦ۫ۥۤۘۨۨۥۙۜۗۢۙۚ۫ۦۗ۠ۖۙۤۦۦۡۧۗ۬ۖۜۦۘۨۖۗۤۥ۠ۦۨۥۘ۠ۖۙۡۢۖۘۙۧۦ۠ۡۗۦۜۨۗ۠ۛۥۢۜۤۖۢۡۜۘۙۖۘۥ۟ۥۜۢۚ۬ۘۜۘ";
                                                                            case 31851071:
                                                                                str11 = "ۧۤۘۦ۟ۖۘۨۡۙۢۗۜۢۘ۬ۨۥۖۘۨۧۘۘۧ۟۠۟ۦۥۘۜۢۘۘۤۘۧۘۥۥۦۘ۫ۡ۫ۜۡۗۛۘ۟ۙ۬ۜ۠ۦۦۘۙۨۥۘ۠ۚ۬۟ۙ۠ۦۗۥۘۘۜ۫ۛ۫ۜۨۗۥ۟ۙ۟";
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        case 1121549259:
                                            str8 = "۫ۛۙ۬ۤ۫ۙ۠ۦ۟ۜۗۤ۬ۨۘۢۘۦ۠ۘۤۥۜۘۨ۠ۙۚۙۥۥ۠ۥۢۨۙۛۙ۠۠ۤۛۛۡۦۘ۬ۜۥ۬ۘۜۢۤۗۗۨۘۦ۫ۥۘ۬ۡۨۤۦۥۘۗۘۘۘ۫ۖۜۘۡۧ۬ۦۤ۫ۛۜ۫ۛۨۘۜۚۖۘۜۘ۬ۡ۫ۨۧۥۚۘۤۖۛۘۘۘۨ۬ۗ";
                                            break;
                                        case 1601139414:
                                            str8 = "ۧۖۖۘۜۡۛۜۧۡۘۦۨۘۘۧ۬ۘۘۢۥۨۘۡۜۨۡۙۨۙۡۘۚ۠ۢۗ۫ۤ۟ۨۜ۫ۢۜۘۢۥۤ۟ۗۗۡ۬ۜۘۘۧۙۗۘ۬ۗۡۨ۫ۨ۬ۧۗۨۦۘۚ۠ۘ۫ۨۦۛۡۡ۬ۤۥۘۘ۬ۧۦۗۖۢ۬۫ۧ۟۬۠ۗۘۘ۬ۛۜ۠۟ۘ۬ۥۦۘۘۘ۫";
                                            break;
                                    }
                                }
                                break;
                            case 1249793319:
                                str2 = "۫۫۟ۚۚ۟۫ۧۖۥۨۘۢۘۨ۫ۜۤ۬۟ۖۘ۫۠ۗ۫ۥۤۨۛۖۘ۫ۦۦۘۘ۫ۛۡۖۘۘۡۨۥۘۨ۬ۜۘ۬ۢۦۘۛۘۦۘۙۙۨۘۢۤۤۚۧۧۧۨۘ۬ۛۛ۫ۗۤۥۙۡۘۛۚۨۨۥۖ۟ۢۥۖۧۘۗ۫ۖۘۛ۠ۥۘ";
                                continue;
                        }
                    }
                    break;
                case 1757761885:
                    alertDialog.dismiss();
                    str2 = "۫ۜۧۘۘۤ۟ۨۗۧ۠ۘۛۥ۟ۨۖۙۖۙۦۤۡۜۢۢۡۜۛۧۤۦۘۗۖ۫۬ۛۜۘۚۜۢ۟ۗۤۡۦۤ۫۫۟۠۫ۡۘۥۛ۟ۜ۫ۛۥۛۧ۟ۖۦۡۥۤ۬ۘۧۛۤۢۜۨۨۢۘ۬ۖۜۙ۟ۘۙۧۜۙۛۥۦۡۦۗۜ۠ۥۘۖۘۡۦ۫ۢۦۥۘۗۢۜۘۢۨۙۥۛۚۘۡ۫ۛۛۦۘۖ۬ۢۥ۠ۥۘۦۥۘ";
                    continue;
                case 1840822939:
                    return;
                case 2009642914:
                    Toast.makeText(this, getString(C0931R.string.str0046), 0).show();
                    str2 = "ۤۦۢۦۤۡۘۧۛۘۘۨۜۙۢۡۜۘ۠ۢۖۘۢۢۨۦ۟۫۟ۜۚۢۦۘۘۥ۫ۗ۬۫۬ۜۤۥۘۚۛۨۘۙ۬ۖۘۙۛۥۡۚۧۥۗۦۘۡۥ۫ۜۚۜۘۨۤۨۨۙۜۦۨ۠ۚۖۜۖۢ۬ۢ۟ۙۘۘ۬ۡۜۘۘۛ۫ۡۦۥۘ۟ۨۨ۬ۖ۬۠ۛ۫ۤ۠ۚۨۚ۠۬ۥۥۘۦۜۗۛۤۛۦۘۥۙۜۦ۬ۦۥۨۛۘ۫ۧۢۚۛ۬ۢ";
                    continue;
            }
            str2 = "ۗۨۘۘۥ۬ۙۢۡۜۛۥۥۘۖۨۦۦ۬۠۠ۘۦۘ۟ۦ۫ۢۡۦۘۛۛ۟ۚۥۜۘۖ۟ۛ۬۬ۡۘ۫۬ۜ۫۫ۜۘۚۛۘۘۖۜۙۚۢۦۗۨۘۚ۫۠ۧۛۡۖۡۧ۟ۘۖۘۚ۫ۧۜۙۥۘۘۤۦۘۢۡۥۘۦۨۧۘۦۨۨۘۨۛۗۦ۟ۨ۫ۥ۠۟ۘ۫ۜۧۢۜ۟ۖۤۨۘۧۥۖۛۘۖۘۧ۬ۨۘۙ۠ۢۘۨ۬ۚۤۗۨۚۨۥۢۜۗ۫ۖ";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$setupGameButton$5$kentos-loader-activity-MainActivity  reason: not valid java name */
    public /* synthetic */ void m257lambda$setupGameButton$5$kentosloaderactivityMainActivity(String str, Runnable runnable) {
        String str2 = "۫۟ۚۤۢۥۚ۫ۖۘۚۥۖۢۘۖۤۤۖۦۗۦۘۘۨۢۧۨۜۘۙۚ۟ۜۘۖۘۙ۠ۜۘۜ۟ۨۨۨ۠۫ۥۢۦۘ۟ۤۗۘۘۦۛۜ۟ۢۙۢ۟۟ۘۘۘۙۧ۠۠ۡ۬ۢۢۜۘ۠۠ۘۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str2.hashCode() ^ 429) ^ 810) ^ 577) ^ 623) ^ 633) ^ 676) ^ 554) ^ 129) ^ 292) ^ PointerIconCompat.TYPE_HELP) ^ 897) ^ 741) ^ 19) ^ 231) ^ 641) ^ 630) ^ 833) ^ 420) ^ 970) ^ 436) ^ 413) ^ 410) ^ 183) ^ PointerIconCompat.TYPE_WAIT) ^ 951) ^ 914) ^ 215) ^ 251) ^ 658) ^ 344) ^ 361) ^ 530335728) {
                case -1392517231:
                    return;
                case -1263670912:
                    String str3 = "ۡۜۦۡۚۥۘۜۤۜۘ۫۬۫ۧۘۙۥۥۘۥۡۛ۬۫ۥۘ۫ۢۨۨ۬۬ۛۥ۟ۜ۠۠ۧۖۥۘۤۚۡۥۚۖۘ۠ۚۥۖۜۘۜۛۙ۟ۙۨۜۥۦۘ۫ۦۨۘ۟ۢۙۘ۫ۢ۟۟ۖۘۦۚۦۧ۟ۗ۬ۖۜۘۜۢۦۘ۟ۤۧ۟ۖۖۥۙ۟ۛۥۘۘ۠۠ۛۦۧۖ۫ۚۡۖۛۙۤۢۗۥۢ۫۬ۤ۫ۛۖۨ۟ۜ۫ۤۥۦۤۚۛ۫ۚۗۢۧۖ";
                    while (true) {
                        switch (str3.hashCode() ^ (-284049118)) {
                            case -1859446935:
                                break;
                            case 525732905:
                                String str4 = "ۤۘۘۘۧ۬ۘۢۧۧۛۘۥۜۘۧ۬ۦۜۖۥۘ۫ۙۤۚۛۨۥۗۛۛۚۜۘ۟۫ۘۘۢۜۘۘ۠ۙۛۥۡۘۢ۬ۛۢۧ۫ۘۥۥۘۙۜۥۧ۫ۧۦۡۘۘ۠ۤۜ۬ۛۦۘۖۘ۫ۧۙۨۡۛۖۘۘۚۧۖ۠ۨۘۘ۠ۥۘۖۢۖۘۜۧۡۘۥۥۨۘۥ۠ۦۤۨۙۙ۫ۘۘ";
                                while (true) {
                                    switch (str4.hashCode() ^ 351234666) {
                                        case -1561642488:
                                            str3 = "ۥۢۡ۠ۚۨۘۗۘۜۡۚۧۖۡ۬ۗۜۛۘۙ۬ۜ۠۟ۘۤۦۘۙۜۨۚ۠ۧۖۡۡۘۙۗۚ۠ۤۢۥۚۡۘۥۤۡۥ۫ۦۜ۠ۜۘۙۥۧۜۧۧۤۗۨ۠ۢۡۘۡۨۤ۫ۡۤۤۜ";
                                            break;
                                        case 1119825857:
                                            String str5 = "ۨۜۨ۬۬۬ۗۤۦۘۧۚ۬ۧۛۘۘۢۚۜۤۚۛۖۜۖۘۤۤۘ۬ۜ۟۫۫ۖۜۘۥۘۛۚۤۢۗۚۡۤ۫ۥۙۘۘۘۦۜۨ۠ۡۘۗۖۨ۬ۘۦۚ۫ۦۘۨۦۖۘۙۘۖۡۧۧۜ۫ۦۘۦۖۡۧۖ۠ۗۚۥۘۥۨۛ۟ۦۦۘۤ۟ۥۢۧ۟۠ۗۘۘۘۚۦۘ۫ۗۚۢۢۡۘۤۢۜۚ۠ۤۨۧۘۘۚۡۖۘۢۦۡۗۡۜۤۚۨ۠۫ۙ۫ۖۘ";
                                            while (true) {
                                                switch (str5.hashCode() ^ 32784286) {
                                                    case -2019706883:
                                                        str5 = "ۢ۬۟ۧۚ۫ۢ۠ۖ۬ۚ۫۫۟ۗ۬۟ۚۖۦۥۘۨۥۨۘۡ۠ۨۘۢۙۡ۫ۡۡۖ۫۬ۖۚۦۘۧ۬ۢ۠۟ۜ۬ۦۦ۫ۗ۬ۙ۫ۜۨ۟ۦ۬ۦۚۤۤۜۘۗۦۖۘۗۘۘۗۨۜۜۧ";
                                                    case -1650918168:
                                                        String str6 = "ۧۚۡۘۜۦۨۦ۬ۨۧۛۙ۟ۜۡۘۚۡۥۧ۠ۛۚۛۧ۫ۡۡۘۤ۠ۥۢۚۡۡۛۦۧ۟ۖۘۛ۠۫ۦۚۢۛۨۖ۟۟ۦۜۥۢۨ۠ۥۡۘۙۙ۬ۨۢۘۙۥۥۘۙ۟ۢۘۤۡۛۧۘۘۙ۟ۦۛۙۧ۫ۢۚۧۨ۠۫ۦ۟ۨۢ۟ۢۨۜۧۧۨۜۘۙۦۘ۫ۙۜۛۜۙۡۤۖۘۢۚۡۘ";
                                                        while (true) {
                                                            switch (str6.hashCode() ^ (-1563712406)) {
                                                                case -1853343976:
                                                                    str5 = "۬۬ۘۘۨۜ۬ۢۛۡۢۗ۟ۥۡۧۘۙۗۛۖۢۨۙۡۦۘۦ۫ۧ۫ۚۢۡ۟ۨ۬ۛۜۘۜۙۨۥۢ۟ۛ۠ۜ۫ۡۤۡۡۘۗۢۙۤۥۧۘۚۢۧ۫ۖۧۥۦۧۘۖۨۤۧۛ۬ۖۡۜۘۜۚۢۥ۫ۖۗ۫ۧۥۜ۟۟ۡۧۚ۫۠ۖۘ۫ۨۖ۠ۖۨ۟ۘۘ";
                                                                    break;
                                                                case -1206688025:
                                                                    str5 = "ۗ۠۬۠ۜ۫ۘۥۘۨۘۜۘۗۧۜ۬۠ۡۤۧۗ۬۫ۥۧۗۙ۬۫ۗۘ۬ۘۨۦۛۡۘۜۛۙۛۚۙۙۘۥۘ۫ۘۛۖۙۛۙۢۥۧ۬ۤۥۥۦۘۥ۬ۡۘۙۥۛۤ۬ۨ۬ۨ۫";
                                                                    break;
                                                                case 279172487:
                                                                    String str7 = "ۖۚۡۚۛۜ۬ۦۡ۬۬ۡۘۢ۫ۘۖۥ۠ۜۛۤۘۖۡۘۤۛۖ۟ۦۘۨۢۖۘۚۛۜۘۥ۫ۚۘۡۢۗۜۘۛۢۧۘۖۧۘۦ۬ۥۘ۠ۙۛۦۧۡ۠۫ۦۨۥ۠ۤ۟۟ۤۘۧۘۖۨۥۘ";
                                                                    while (true) {
                                                                        switch (str7.hashCode() ^ (-632684030)) {
                                                                            case -2058753899:
                                                                                str6 = "ۨۡۨۥۛۘۘ۠۫ۨۧۥۦ۟ۨۗۦۛ۟ۗ۠ۤۨۘۧ۠۬ۙۤۖۜۥۖۘ۟ۙۖۘۨۙۜۘ۫۟ۢۧۦۙۤۥۧ۫۟ۜۘۚ۠ۢۧۦۤۜۧ۫ۥۗۙ۟ۙ۟۬ۜۨ۫ۥۡۢۖۦ۠ۙۦۨۚۖۗۘۡۖۧۗۤ۠ۙۤۢۢۤ۫۟ۤۘ۟ۨۜۥۡۤۨۘ۠ۧۦۘۥ۠ۧۥۖۘۘ۫ۧۖۙ۬ۖ";
                                                                                break;
                                                                            case -996066131:
                                                                                str7 = "ۗۦۨۘۘۦۡۘ۬ۦۧۜۙۥۘۜۙۙۛۢۛۨۛۘۘۗۖۦۖۜۧۘۤۜ۫ۧۘۘۘۘۡۘۚۗۖۘۤۜۚ۠۠ۖۜۨۗۚۛۦۘۧۡۤۛۚۛ۫ۜۧۘۘ۠ۤۡ۫۟ۘۦۧۦۖۨۨۧۥۘۢۤۥۤ۟ۦۘ۬۟ۦۘۛ۠ۧ۟ۗ۠";
                                                                            case -559959263:
                                                                                str6 = "ۡۙۨۦۢۦ۟ۡۧۘۙۢۛۖۖۘۡۖۡۘۖۦۦۤۙۜۘ۬ۛۨۘۡۘۥۘۢۦۚۘ۟ۗۗۤۜۘۤۥۖ۠ۛۥۗۤ۫ۘۧۨۥۤۘ۟ۥۜ۫ۥۢۛۛ۫ۦۡۘۨۢ۫ۤۧ۬ۨۧۙ۠ۗۘۖ۠ۤۜۘۦ۫ۛ۬۬ۡۢۧ۠ۖۘۧۘ۟ۚۚۨ۠ۛۧۘۦۜۘ۠ۖۘۘۗ۠ۦۘۜۜۢۧۖۗ۫ۗۡۨۦۡ۟۠ۘ۫ۜۘۗۨۥ۟ۙۜۘ";
                                                                                break;
                                                                            case -36973783:
                                                                                str7 = isRunning(str) ? "ۥ۟ۨ۠ۧۡ۫ۜ۠ۙۦۡۛۖۖۡۘۛۘۧۢۜۡ۫۬۠۫۫ۘۡۛۙ۬ۤۥۧ۠ۥۛۤۦۘۛۚۖۘۙۧۥۜۦۜۘۙۚۗۥۙۥۘ۠ۤۡۘ۫ۥۜۘۨۛۤۗۜۥۘۢۛۧۨۛۖۗۤۤۧۥۥۤۢۙۗ۠۟ۢۗۢۘ۫ۚۧۘۨۘۤۚ۟ۢۜۧۖ۬ۦۥۢۖۘۚۢۧ۠ۜۦ۟ۤۚۡۥۘۘ۫ۗۢۙۜۘۧۗۖۖۦۘۥۘۖ" : "۟ۘۤۜۘۜۘۨۙۚۧۙۛۡۚۥۘۢۥۥۧۢ۬ۙ۟۟۬ۘۥۘۙۤۗۛۦۘۡ۠۟ۡۡۛۗ۠۠۬ۘۘۡۧ۬ۦۜۚۥ۫ۦ۠ۦۢۨۤۨۘۜۤۨۢۚ۟۫ۘۘۦۖۧۧۡ۫ۡۛۥۦۖۚۜۜۡ۠ۖۨۛۧ۬";
                                                                        }
                                                                    }
                                                                    break;
                                                                case 1772187431:
                                                                    str6 = "ۗ۟ۥۘۚ۟ۘ۫ۘ۬ۥۗ۫ۗۙۨۘۢۚ۟ۗ۠ۜۧۚۘۢۚۖۡ۟ۚ۠ۖ۟۫ۖ۫ۘۘۡۛۥۗۡۘۥۗ۟۫ۧۜ۬ۖ۠ۦۘۥۤۦۙ۟۠۫۠ۜۘۛۖ۬۟۫ۨۚۢۢۥۗۥۘۘۤۥ۠ۛ۬۬ۗۜۢۦۨ۫ۨۧ۫ۤۜۥۦۜۥ۫۟۟ۙ۫ۜۘۙ۟۬ۛۛۨۦۘۜۗ۫ۘۘۖۛۡۘۜۧۜۖ۫ۨۘۨ۟ۘۘ۠۬ۦۘۗۛ۬";
                                                            }
                                                        }
                                                        break;
                                                    case 106568588:
                                                        str4 = "ۚۖۢۤۙۙۚ۟ۜۘۧۢۦۘۙۢۚۡۛۜۛۦۙۖۥۦۘۤ۬ۖۛۗۖۛۢۚۜۧۢۧۨۘۘۗۙۥۘۛۤ۟ۢۖ۬۠ۘۨۗ۬ۙۤ۬ۡۢ۟ۨۘۧۤۚۜۚ۠ۦۚۜۨۖۗ۬۠ۘ";
                                                        break;
                                                    case 1835685964:
                                                        str4 = "ۤ۫ۜۧ۫۟ۛ۫ۡ۫ۛۗۘۡۜۘۢۚۜۘۨۛ۬ۧ۫ۨۘۧۘۧۘۖۚۚۢۙۜۨۤۡۙۢۗۘۜ۬ۘ۠ۘ۠ۡ۫۫ۧ۬ۛۥۖۘۢۘۖ۫ۙۦۘۙۚۖۘۥۘۜۘۨ۫ۚ۬ۡ۬۬ۚۜ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case 1142840802:
                                            str3 = "ۙ۬ۘۘۖ۫ۤۗۚ۟ۧۤۘۘۗۦۦۘۘۧۨ۬ۜۦۘۧۧۘۘۖۗۥۥۘۖۦۘۘۨ۫ۗۨۙۥ۬ۜۡۘۢۢۛۥ۫ۘۜۖۡۥۤۧۛۜۖ۠ۨۦ۫ۥۨۗ۟ۜۘۖۖۖۘ۠ۥۧۘۡۖۘ";
                                            break;
                                        case 1215925772:
                                            str4 = "ۧۚۥۤۧۖ۫۠۫ۨۦۘۘۛۤۦۘۜۤۜۘ۠۫ۖۘۥ۠۟۠ۤ۫ۡۤۤۗۛۤۙۤۡۘۘۚۨۧۜۘۜ۫ۗۡ۫ۙ۠ۤۥۛۚۥۛۨۗۚۚۛۜ۟۠ۙۢۡۘۤۖۘۘ۠ۜۢ۬ۜۤ۠۫ۖۨ۟ۦۥۘۡۗۖ۬ۘۘۥ";
                                    }
                                }
                                break;
                            case 571599818:
                                str3 = "ۚۡۘۘۛۡ۫۠ۛۤ۬ۙۘۘۥۜ۠ۗ۠ۥۢۚ۫ۤۗۖۘۖۚۗۖۖۚۥۛۢۥۥۡۘۗۜۙ۫۟ۤۥۚۖۧۘ۫ۨۢ۫۠ۡۘۘ۟۟۬۫ۦ۟ۙ۠ۖۘ۠۟ۥۢۦ۬ۘۙۨۘۥۜۢۛۤۗۙۜۛۥۗۡۜۜۡ۬ۦۨ۫ۧۦۢۧۡۘۛۡۙۘ۟ۤۧ۬ۘۜۗۚۥۘۥۘۙۚۘۢۡۙ";
                            case 1361934798:
                                str2 = "ۗۜ۟۬ۨۢۖۙۨ۟ۧۤۧۛ۬ۧۤ۟ۘۜۧۘ۠ۙۨۘۦ۬ۢۜ۠ۡۛ۟ۦۘ۠ۘۘۘۢۤۡۤۨۖۘۗۖۡۦۚۢۨۗۡ۟ۖۤۚۨۖۘۛ۬ۤۡۦ۠۬۠ۡۘۗ۟ۦۢ۬ۖۘۗۚۜۥۦۘۘۨۘۖۘ۟ۦۦۙۜۨۘۧۢۥۘ";
                                continue;
                        }
                    }
                    break;
                case -1004345309:
                    String str8 = "ۧۙۚۦۢۛۖۚۗۙ۬ۦۖۘ۟ۘ۠۫ۡۖۜ۟ۜۘۖۤۧۥۛۗ۬ۘ۠ۚۢۘ۟ۨۙۚ۫ۢۢۖۖۘۖ۫۬ۖۙۘۘۗۦۗۨۙۚ۟ۨۖۛۜۘۗۘۨۘ۟ۜۡۘ۫ۥۨ۬ۗۤۤۡۨۗۧۦۜۥۗۘۢۡۧۧۤۡۙۘۛۧۦۘ۫ۘۡۗۤۚۡۚ۬ۧ۠ۚۡۥۦۛۘۘۘۧ۫ۜۘۢ۫ۨۦ۟ۗ۟ۛۨ۠ۙ۬ۧۙۛۛ۬";
                    while (true) {
                        switch (str8.hashCode() ^ (-1125341272)) {
                            case -340987781:
                                break;
                            case 237010493:
                                str2 = "۫ۚ۫ۖۡ۟ۦۚۜۤۥۘۖۙ۫ۥۥۖۜ۠ۧۧۛۗۛۦۡۡۖۘۖۘۥۘۡۙۜۤ۠ۗ۬ۛۘۡ۬ۗۚ۟ۚۨ۠ۗۤۨۢۛ۟ۨۘ۬۫ۦۘ۫ۢۥۘۢۚۖۧ۬۟ۖۖۥۘۤۦۤۦۢۗۤۛۡۘۨۛ۟ۡ۟ۘۘۗۚ۫ۡۚۘۘ۫ۨۜۗۨۘ۫ۦ۫ۚۧۘۘۨۨۖۚ۬۫ۢۜ۠۠ۛۘۦ۠ۥ";
                                continue;
                            case 1534620891:
                                String str9 = "ۛۙۨۖۜۗۨۗۦۘۢۜۛۘۥۖۖ۬۫ۗۧ۟۬ۛۡۥۜۘ۠ۖۥۘۛۧ۬ۤۚۘۛۥۚۢ۟ۨۗۗۛۛۧۡۘۧۘۨۘۢۗۢ۬ۘۨۘۡۤۥۙ۫ۤۦۗۧۗۤ۠۟ۢۛۦۤۦۚۦۘ۠ۜ۫ۗۖۡۘۥۜۙۧۥۧ";
                                while (true) {
                                    switch (str9.hashCode() ^ 2106447097) {
                                        case -1293624330:
                                            str8 = "ۤۡۢۥۥۖۘ۟ۚۢۖ۠ۤ۠ۜ۬ۛۦۡۘۡ۫ۨۜۦۛ۬ۘۧۘۦۤۤ۟۬ۛ۬ۗ۟ۛۤۤۨۘۙۡ۫ۛۥۡۤ۫ۖۜۘ۠ۗۚۙ۬۫ۧ۟ۜۘ۬ۘۦۘۨۧۖۘۜۚۨۜۤۨۗۧۙۡ۠ۘۘۡۧۙۘۖۥۜۘۘۛۡۨۘۚۖۗۧۜۜۘۡۗۜۜۥ۟۬۫ۜۘ";
                                            break;
                                        case -481117505:
                                            String str10 = "ۧ۬ۤۧۙۡۘۛۜۨۢ۬ۗ۟ۢۦۥ۫ۛۘۥ۠۟ۨۘۨۚۜۘ۠ۦۜۘۘۚۧۨۖۨۡۦۥۨۥۡۨۢۘ۠ۡۦۗۖ۟ۛۤ۟۫ۗۖۘۘۚۙۡ۠ۛۚ۫ۤ۫۫۬ۤۡۢۧ";
                                            while (true) {
                                                switch (str10.hashCode() ^ 1752064073) {
                                                    case -1092904335:
                                                        str9 = "ۙ۠ۦۨ۟ۡۤۤۦۦۜۤ۫ۨ۠۠ۘۚۨۖ۠ۙۢۧۢ۫ۗۖۨ۫ۧۗۘۘۦۤ۟۬ۗۙۥۘۜۗۛۦۘۢۥۖۘۡۗۜۦ۟ۖۘۜ۠ۢۛۙۥۘۗۧۖۧ۠ۘۨۤۗۘۥۘ۠ۦۦۛۥۚۦۘ۬۟ۚۤۥۗۧۡۦۘۗۙۦۥ۠ۥۨ۬ۘ۟ۢۡۙۦۘۘ۟ۛۨۘۦۘۛۚ۠ۚۦ۬۟ۛۨۘۡۦۙ۠ۤۗۡۜۘۜۗ۫ۚۗۖ";
                                                        break;
                                                    case -607580228:
                                                        str10 = "ۗۦۜۘۙۘۘۨۡۢۗۨۗۦ۟ۨۚۥۛۚ۠ۡ۟۬۠ۜۘ۫۟ۥۘۥۙۦ۟ۤۢ۠۟ۜۙۘۘۥۡ۫ۖۡۛۡۙۥۘ۬ۨۦۘۨۙۨۘۡۧۥۛۦۡۘۘۖۡۘۥۥۛۗۗۖۨ۠ۗ";
                                                    case -551658663:
                                                        String str11 = "ۚۡۛۘۥ۟ۤۙۘۚۗۖۦۡۥ۬ۛۦۘۗۥۧۘۛۘۤۨ۠ۡۘۙۥۨۜۥۦۘۨ۫۠ۧۛۨۗ۠ۦۘۘۜۗۨۦ۬۬۬ۨۥۗۢۤۜۘۖۨۘۙۙ۬ۘۡ۟ۘۤۜۢۢۥۙۥۘۘۡۦۘۡۙۦۧ۫ۧ۬ۗۦۦۜۡۡۥۨۘۙۡۦۘۧ۫۬ۚۖۘۘ";
                                                        while (true) {
                                                            switch (str11.hashCode() ^ (-1718224137)) {
                                                                case -1702243622:
                                                                    str11 = "ۜۜۗۘۤۡ۟ۦۘۢۙ۠ۚۤۚۥۛۧۤۚ۟۟ۥۜ۟۟ۨۘ۠ۢۛ۫ۘۛۦ۫ۤ۠ۧۖۘ۠ۦۡۨۛۦۦۜۛۛۚۥۗۛۧ۟ۜۖۛۤۤۡۜۧۢۖۘۛۢۜ۫ۗۦ۬ۡۘۢۗۘۡ۫ۖۖۡۛۛۙۜۘۢۧۗۜۛۢۙۖۨۡۛۡۘۡۗۖۚۧ۫ۗ۠ۤ۟۫ۖ۬ۨۦۘۛ۬ۦۘۛۢ۬";
                                                                case -1504335220:
                                                                    String str12 = "ۗۘۧ۟۬ۜۤۤ۫ۜۦۙۙۥ۟ۚۧۙۘۜۨۘۤۡ۫ۜۥۖۘۚۜۘۢۜۜۘ۬۬ۧۖ۫ۥۘ۠ۧۨ۬ۢۡۨۦۙۨ۟۠۠ۘۥۘۙۘۧۜۡۨۘۦ۠ۢۚۜۢۗۙۥۘۖۡ۟ۖۨۘ۫ۙۜۚۡۢۧ۬۟۟ۡۢۖۢۘۘۖۖۘۨۧۜۘۛ۫ۤۗ۠ۢ۬ۚ۫ۛۙۦۨۚۙۘۖۘۥۨۗۢ۠ۦ۟ۢۧ۟ۨۜۘۚۦۢ۟ۤ۫ۨۜۡۘ";
                                                                    while (true) {
                                                                        switch (str12.hashCode() ^ (-1906113288)) {
                                                                            case -1778116756:
                                                                                str11 = "۟ۡۦۤۡۜۜۡۜ۬ۧۖۘۥۦۗۧۗۧۧۜۘۢۖۜ۫ۦ۬۟ۦۘۗ۠ۚۡۦۡۗۘۡۘۦۚ۟ۜ۟ۡۘۧۨۙ۠۟ۥۨ۠ۘۜۤۙۚۢۗۖۧۨۨۚۖۤ۫ۘ۠ۡۗۚۢۙۗۢ۟ۨۦ۬ۘۨۙۨۦۥۘۜۡ۬ۗۙ۟۠ۡۦۜۨۙۗۜۘۖۚۘۦۦۘۘ۠۬ۡۨ۫ۛۖۢۥۖۖۡۘ";
                                                                                break;
                                                                            case -1546431480:
                                                                                str12 = bypassmode.equals(Deobfuscator$$app.getString(-3440721189254553417L)) ? "ۢۖۖۘۥۚۦۘۜۙۡۘۢۦۙۤۥۧۘ۬ۘۦۤۘۥۘۖۘۗ۬ۛۘۘۙ۟ۨۘۚۛۡۘ۬ۨۚ۠ۛۨۥۦۘۚۢۡۜۥۤ۫ۙۛۡۥۛۚۚۦۥۛۦۡۧۘۗۡۗۥ۠ۡۜۦۘ۠ۡۖۘ" : "۟ۜۘۧۖۗۗ۟۠۟ۗۥ۠ۡۜ۟ۧ۬ۧۨۦۛۡۛۖۛۢ۟ۧۖۘۚۥۜۘۛۤۚۜۜۚۢۡۘۗ۫ۚۢۦۡ۟ۢۡۙ۫ۘۘ۟۟ۡۘۥۥۜ۫ۦۜۘ۟ۧ۬ۘۥۧۘۡۨۦۘۥۚۤ";
                                                                            case -1058800443:
                                                                                str12 = "ۡ۫۠ۥۗۙۜۜۘۤۛ۫ۙۢ۫ۡۢ۠۠۫۠ۚ۬ۚۖۖۤۗ۠۟ۚۡۖۘۥۤۗۛۖۘۗۨۨۘۙۙ۟ۡۤ۬ۦۧۘۤۨۦۘ۫ۨۤۜۥۨۤۗۚۚۥۙۡۘۦۚ۬ۜۜۢۛۥۜ۟۠ۢۙۘ۫ۡۡ۟ۢۤۨۚۘۨۘۖۗ۬ۦ۠ۘۥۥۨ";
                                                                            case 1061357584:
                                                                                str11 = "ۡۧۦۘۡۢۦۧۨۢۙۜۤۦۡۘۖۦۘۘ۬ۘۜۚۨۢۜۢۖۗ۫ۜۘ۫ۘ۠ۤ۠ۖ۫ۖۚۜۖۘ۠ۖۖۘۦۖۛ۠ۛۨۘۖۤ۠ۖ۫ۙۡۘۦۘۗۛۡۚۧۦ۬ۧۤ۠ۥۘۘۗۥ۠ۧ۬ۖ۠ۙۤۖۖۘ۬۠ۚۥۜۡۛۨۥ۠ۖۘۜۤۗۖۗۙۖۥۨۘ";
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 446154103:
                                                                    str10 = "۠ۡ۠۠ۗۖۘۥ۟ۦۥۢۗۡۛۨ۫۫۟ۜۡۧۘۥۗۖۗۢۛ۫ۚۢۘۛۦ۬ۤۙۤ۟۫ۜۥۚ۫ۡۨ۠ۜۡۘۖۜۥۘۤۘۛۦۙۜۘۧۜۨ۠ۛۗ۫۟۫ۢۗ۟ۨۙۦ۬۬ۧۤۗۦۘۛۧۨۛۜۘۘۡۚۘۤ۠ۚ";
                                                                    break;
                                                                case 789359379:
                                                                    str10 = "ۨ۫ۘۤ۟ۘۚ۬۬ۦۨۧۖ۟ۢۡۘۨۨۨۧۘۢ۠۫ۤۧ۬ۖ۬۟۟۫ۥۙۥۛۖۦۢۢۛۗۖۖ۫ۖۘۨۘۛ۠ۘ۠ۢۜۦ۠ۖۘ۫ۡۙۖۖۖۥۥۤۤۡۘ۟ۥۤۨۤۦۘ";
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 377647678:
                                                        str9 = "ۢ۟ۖۘۧۖۦۗۜۤۛۦۘۛۘ۠ۚۘۙۥۨۛۛۥۜۘۘ۠ۗۤ۫ۡۘ۬۠ۨۘۡۘۘۘۜۚۧۤ۫ۛۙۗۛۙ۟۟ۨۧۙۚ۠ۖۨۙۗۢۜۥ۟ۜۧۘۨۖۥ۬ۛۦۘۜۛۥۘۦۦۖۘۘۚۤ۠۫ۛ۠ۢۜۧۜۡۖۗۜۘ۠ۘۦۧۧۡۗ۬ۛ۟ۡۗ۠ۚۙۛ۬۬۠ۙۦۘ۬ۥۛۛۡۘۢ۫ۥۘۧۙۜ۬۫ۚ۬۫ۛ۬ۚۗۛۡۘ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case -384409737:
                                            str9 = "ۢۨۡۢۢۧۨۖۚۤ۠ۜۘۧۥۦۧ۬ۧ۠ۨۥۘۗ۠ۢ۫ۖۨۘۤۙ۟ۥۦۨ۬۟ۨۢۧۗ۠۫۫۠۫ۨۘۚۦ۟ۧ۟ۡ۬ۙۧۛۤۦ۠۠ۗۡۖۡۘۧۖۢ۬۟ۛۛۦۘۨۢۖۜۨۙۙ۬ۥۙۛۡۘ۫۠۬ۛۧۘۨۖۥۘۙ۟ۘۙۥۢۤۧۡۤۖۥۘۥۤ۟ۜۨۘ۠ۙۤۢۖۛۦۦۡۥۛۡۤۗ۬۬۫ۨۖۖۘۦۥۜ";
                                        case 12087623:
                                            str8 = "ۗ۠ۤۧۜۦ۬ۜۡۘۥۨۤ۫۟ۨۘ۠ۘۥۘ۠ۧۥۢۚ۟ۙۥۧۘۙ۟ۚۙۡۘۤۙۦۢ۠۬ۤۥۘۘۨۖۖۗۤۜۘۜۥۘۘۗ۫ۨۘ۫ۛۨۘۙۦۚ۟ۖۘۡۡ۫۫۬ۜ۠ۜۦ۟ۘۨ۠ۛۡۘ۫۠ۦۘۜۧۖۙ۬۠۫ۢۙ";
                                            break;
                                    }
                                }
                                break;
                            case 1730564347:
                                str8 = "ۛۢۛۖ۬ۜۘۥۚ۬ۚۚۗۦۨ۫۬ۥۢۡۚۤۥۚ۟ۧۨ۟ۘۘ۬ۗۡۢ۟ۘۘۦۜۛ۬ۥۧۘۗۦۨۡۧۜۘۗۦ۟ۗۡۢۙۡۦۙۨۥۤۜۧۜۡۘۥ۟ۨۘۖۨۖۡۛۦۘۨۘۨۨۘۘۘۜۘۙۤۢۗۡۜۘ۬ۛۦ۬ۛۥۚۙۥ۬ۨ۫ۤۗۢ۟ۥ۫ۦۡۙۤۛۘۙۗ۠ۦۦۜ۠ۨۘ۬ۗۥۘۖۛۧ۫ۙۧ";
                        }
                    }
                    break;
                case -888206514:
                    runnable.run();
                    str2 = "۬ۤ۠۫ۜۥۘۚۜۥۘۜۢۧۙۛۗۜۘۜ۬ۡۘۦ۠۠ۦۛۚۜۚۧ۠ۚۖۘۜۗۘۘۤۜۧۥۘۚۜ۟ۙۛۡۘۧۗۚ۬۬ۘ۫۠ۤۖۛۦۘۥۘۙۡۢ۟ۨۧۢۡ۠ۤۙۢۤۢۤۛ۫۬ۨۘۖۢۜۙ۠۟۫ۧۜ۟ۛۗۥۘۘۨ۠ۥ۟ۘۡۘۡۥۦۘ۟ۦۛ۟ۛۛۘ۠ۖۘۘۘۥۘۦۙ۫ۚ۠ۨۘۜۦۚۗ۠۠ۛۨ۠";
                    continue;
                case -580393658:
                    str2 = "ۗۦۨۘۖ۠ۨۨۖ۫ۥۚۨۘۛۛ۫ۜ۬ۥۘ۟ۢۦۘ۟ۨۖۢ۫ۡ۟ۚۘ۠ۗۤ۟ۘۧۘۚۗۨۡۦۦۘۛ۫۠۠ۘۨۘۢۛ۫ۢۨۘۘ۟ۖ۠ۜۘۛۦۡۘ۬ۘۚۜ۠۠۟ۧۥۡۡ۟ۜۙۡۘۤۧۗ۫ۡۗۧۙۜ۫ۙۘ";
                    continue;
                case 412400785:
                    String str13 = "ۡۙۘۘۤ۠ۥۢۥۛۦۧۤۨۤۜۤۧۘۙۘۜۧۖ۟۫ۛۚۧۧۘ۟ۤۗ۟ۥۘۙۥۦۘۜۜ۫ۡۘۨۘۧۧۢۨ۠ۜۗۖ۟ۢۦۦ۫ۛ۠۟ۘۘۢۗۜۘۨۙۡ۟ۚۜۘۖۛۨۘ";
                    while (true) {
                        switch (str13.hashCode() ^ (-138085634)) {
                            case -1925619672:
                                String str14 = "۠ۥۖۢۚۖ۠۫ۡ۫ۢ۫ۜۖۘۗۛۦۘ۫ۢۡۤ۟ۗۨ۫ۤۤۖۙۗۥۘ۟ۢۥۘ۠ۡۛۨۗ۫۠۠ۨۘۚ۫ۙۗۢۚۤۖۘ۟۫ۜۚۚۥۘۡ۬ۘۧۚۖۘۦۖ۬ۨ۟ۚۨ۬ۜۘۙۧۗۡۤۥۘۤۧ۬ۧ۠ۢۛۜۘۨۦۨۖۤۖۤۨۨۘۖۗۜۘۙ۟۬ۗۘ۬ۙۖۥۘۨۥۜۘۙۥ۠";
                                while (true) {
                                    switch (str14.hashCode() ^ 1390314297) {
                                        case -1868709015:
                                            str13 = "ۤۨۤۨۙۥۥ۠ۢۦۢۘۘۦۨ۫ۗۛۥۘۚۚ۟ۤۜ۠ۜۥۥۦۚۖۛۡۖ۟۠ۤ۟ۖۘۥۙ۬ۘۢۤۗ۫ۙۙۜۦۗۡ۟ۤۜۚۛۥۥۦۥ۠ۜۡۜۜۗۘۘ۟ۜۧۘۘۚ۠ۧ۟۬۟۠ۡ۠ۢۡۘۦۘۨۚۛۡۜ۟ۙ۬ۘۘ۬ۘۘۥۚ۫ۛۧۜۘ";
                                            break;
                                        case -1238327091:
                                            str14 = "ۗۜۘۚۡۜ۫ۚۜ۟ۦۖۘ۟ۥۡۘۤۜۜۗ۠ۡۘۚۧۦۘۚۚۘۘۖۜۘۘۖۡ۟۬ۗۡۡۡۦ۬ۥۢ۟ۦۧ۟ۜۜ۠ۡۢۚۖۡۚ۠ۧۦۘ۠۫۫ۘۨ۟ۘۨۢۖۚۦۥۘۜۚۥ۠۠ۛ۬ۥۢۗۢۙۗۖۧ۬۟ۨۛۘۡۥ۠ۤ۟ۧۗۜۧ۠ۡۡ۟";
                                        case -795171790:
                                            String str15 = "ۡۤۖۡۚۢۚ۟ۜۘۤۛ۟ۙۘۘۘۧۡۡۘ۠ۤۥۦۥۜۜۙۨ۠۬۠ۨ۫۬ۛ۟ۥۘۚۥۤۦۢۨۘۖۛ۠ۢۘۖۧۜۖۛۤۙۤۢۡ۫۟ۗۥۛۗۧۤۗۚ۫ۗۤۦۘۧ۠ۡۦ۟ۢۚۚۙۜۧۗۜ۠ۨۘۙۨۙ";
                                            while (true) {
                                                switch (str15.hashCode() ^ 1616093926) {
                                                    case -1034946053:
                                                        str14 = "ۡۤۘۘۦۧۜۨ۫ۨۥۨ۬ۘۜۡۘۚۧ۫ۗۦۛۡۜۧۘۧۥۖۘۖۗۙ۫۫ۡۢۤۖۘۗۡۘۘۥۘۘۙ۬ۡۘۚ۫۠ۧۗۧۨۘۖۢۥۧۨۘۨۘۨ۬ۨۘۥۦۖ۬ۗ۠۠۫ۧۢۦۡۘ۟ۤۨۘ۬ۚۚۨۘۘۜ۟۫۠ۛۦۘۙۥۨۨۧۤۧ۟ۡۘ۟ۗۦۡ۟ۖ";
                                                        break;
                                                    case -782592749:
                                                        str14 = "ۖۘۥۘۤۗۢۤۚۚۚۨۧ۟ۡۡۘۨۦۤۥۙ۠۫ۨ۫ۗۨۧۘۥ۫ۗۤۙۥۜۜۥ۟۟ۙ۟ۢۖۤۗۖۘۗۥ۠ۛۥۤۤۦۤ۠۬ۜۤۖۨۘۘۢ۬ۖۗۧۘۛ۬ۖ۠ۧ۬ۥۤۗ۠ۛۚۦ۬ۗۥۜۡۘۡ۫ۛۘ۠ۚۥۡۘۖۖۥۘۢۢۘۜۧۘ";
                                                        break;
                                                    case 209327836:
                                                        String str16 = "ۛۘۛۗ۬ۛۦۢۜۘۚۥۨۘۗۚۛۧۗۨ۫ۦۧۘۙۖ۫ۡۗ۠ۤۘۜۖۥۜۥۨۡ۫ۖۗ۬ۦۜۡۢۛۨۘۘۨۦۘۖۖۤۡۡۢۙۤۢۛۤۛۚۧۘۘۨ۬ۨۘۜۤۘۘۛۤۡۘۖۤ۠ۧۙ۬ۨۚۡ۬ۨۛ۠ۦۘۡۥۧۘۚ۠ۘۤ۟ۨۘۦۧۨۦۖ۫ۙۛۨۖۨۢ۫ۙۜۘۘۙۖۘۨۦ۠۟۠ۧ۫ۤۘ۟ۙۡۘ۟ۜۦۧ۫۬";
                                                        while (true) {
                                                            switch (str16.hashCode() ^ 1234466942) {
                                                                case -2129585552:
                                                                    str15 = "۠ۦۥۘۦۖۛۘۨۡۘۧۗۖۘۨۤ۠ۤۛۥۘۜۥ۬ۨ۫ۚ۟ۨۨ۠ۦ۬ۖۜۖۘۥۢۡۘۤۚۦۘ۟۠۬ۛۨۨۘ۫ۘۖۘۧۘۡۜ۫ۘۜۢۜۘ۫ۗۥۘۜۛۡۤۘۥۘۢۘۧۘۖۛۘۘۦۤۦۘۤ۫ۗۖۚ۠۠ۗۛۥۙۨ۠ۥۛ۟ۢۢۛۢۜۘۨۡۧۥۘۘۘۘۤۜ۠ۛۖۘ۟ۙۜۘ۫ۖۧۤۖۖۨۨ۫ۗۚۜۘۘۘۡۘۦۥ۫۟ۗۤۦۨۖۘ";
                                                                    break;
                                                                case -1207963359:
                                                                    str15 = "۫ۨۦ۫ۧۚۡۗۖ۫ۤۙۧۖۘ۟۬ۥۥۦۦۦۗۥۧۖۡۘۚۖ۬ۢۙۢۡۜۦۘۚۜۗۧۚۡۛۡۘۜۖۧ۟ۜ۠ۦۘۘۥۦۢۧۡۜۙۛۜۘ۟ۙۙۥۢۥۘۚۙۨ۠ۜۘۤۢۜۘ۟۟ۡۗۡۙ۫ۗ۫ۦۧۘۜۛۧ۫ۨۘۘۡۤۡۡ۫۬۠ۤۥۘۚۡۖۧۖۘ۬۟ۦ۬ۜۦۘ۟ۗۖۗۚ۠ۤۢۦۙۖۡۘۙۚ۟ۦۗ۫";
                                                                    break;
                                                                case 698237390:
                                                                    String str17 = "ۧۗۜۤۙۡۖۨۨۘۦۗۥۘۢۘۤۦ۬ۜۘۨۚۦ۬ۜ۫ۨۢۤۗۗۘۦۦۘۢۚۥۤۗۥۘۦۜۛۥۧۨۘۤۢۨۘۧۥۚ۠۬ۥۘۦۦۡۘۘۗ۟۠ۥۢ۟ۛۡۘ۬ۚ۠ۛۧۧۧۥۤۥۨۜۡۜۥۘۖۤ۬ۢۘۙ۬ۡ۬";
                                                                    while (true) {
                                                                        switch (str17.hashCode() ^ 387727151) {
                                                                            case -1697657666:
                                                                                str17 = runnable != null ? "ۡۗ۠ۧۦۧ۫۬۫۬ۧۘۢۗ۠ۛ۠ۨۘ۫۟۟ۘۦۥۘۙۧۨۘۦ۟ۗۦۤۤۡۦۚ۟ۛۘۖ۟ۛۚ۟۟ۥۗ۠ۚۥۦۨ۬ۙۚ۬ۨۛۨۗۜ۬ۗۚۜۘ۠۟ۖ۬ۨۘ۬ۘۨۘ" : "ۘۘ۟ۜۤۘۙۘ۬ۥ۟ۢ۫ۗۗۘۖۘۛ۬ۘۘۘ۟ۖۘ۟۠ۙۖۗۦۘ۟ۥۢ۟ۡۜۘۨۦ۫ۚۥۥۚ۟ۚ۟۫ۢۘ۟ۧۖۨۘۨۜۧۙ۟ۦۘۤۢۨۘ۬ۛۦۘۦۖۘۘ۟۬ۜۘ۟ۖۜۚۤۡۘۚۦۥۧۘ۬ۙۚۨۜۘ۬ۘۖۘۧ۫ۛۦۗۜ۟ۛ۠ۦۡ۠ۦۘۖۘ۬ۙۨۨ۫ۤ۠ۦ۠ۧۗۢ";
                                                                            case -380834108:
                                                                                str16 = "۠ۦۙۧۗۢۨۖۘۡۙۥۘۖۤۚۥۖۘ۠ۥۨۘۥۡۤۗۥۛۙۢۖۘ۫ۥۘۘۖۡۗ۟۬ۡۢۚ۬۬ۜ۬۟ۛۦۙۖۨۘۜۜۗۡۙۡۘۨۘۡ۫ۜۧ۬ۘۜ۟ۡ۬۬ۥۦۖۗۨۢۚ۠ۡۘۚۙۨۘۙ۟ۨۘۘۖۨ";
                                                                                break;
                                                                            case -126784611:
                                                                                str16 = "ۤۗ۟۠ۘۨۘ۟ۧۨ۬ۜۧۘ۟۫ۧۙۡۥۧ۬ۘۘ۠ۤ۟ۚۖۘۜ۬ۦۘ۬ۡۜۗۖۡۘۖۨۖ۠ۤۦ۬ۡۨۘۤۙۘۡۡ۟ۥۘۜ۠ۘ۠ۢۜۖۘۡۛۘ۠ۥۦۘ۫ۦۨۘ۟۠ۚۧۤ۟۟ۘۥۢۛۚۢ۠ۦۚۖۘۥۗ۫ۧۢۧۤ۬۬ۗۘۘۡۚۘۘۘ۬ۨۘۛۥۢۛۧۧۙۘۡ۫۟ۤۚۘۥۘ";
                                                                                break;
                                                                            case -92234667:
                                                                                str17 = "ۖ۠ۚۛۜۗۥۨ۟ۙۦ۟ۢۡۥۘ۠۠ۥۤۡۨۘۤۙۙ۟ۛۛ۠ۗۘۢۨۡۜۙ۟ۙۖۨۘ۟۫ۡۜۖۙۘۙۚۙ۬ۙۤۙۖۘۢ۬ۖۘۤ۟ۖۧۚ۫ۥۚۖۙۖۥ۟ۛۤۜۘۖ۬ۥۖۧۖۜۚ۠ۜۨۧۦۖۜۦۨۘۨۤۢۘۧۤۗۤۨ۫ۚ";
                                                                        }
                                                                    }
                                                                    break;
                                                                case 728668201:
                                                                    str16 = "ۥۙۡۘ۫ۚۙ۠ۚۧۦۧۘۘ۬ۢۡۖۙۚۚۢۛ۬ۛۚۡ۠۬ۦۨۡۨ۫ۖۘۘۡۜۘۡ۟ۜۡۛۜۘ۬۠ۖۘۗۥۥۡۚۨۨۦۘۘۙۡ۬ۧۨۖۘۢۖۜۘۡۡۨۢۨۘۖۛۛۙ۬ۢۜۖۘ۫ۙۗۛ۟ۡۙۖۡۧۚۜ۠ۖۘۚۦۧۡ۟ۨۘ۟ۙۗ۫ۥۘۘ۫ۥۘۛ۟ۘۜۨۦۘۢۦۧۨۚۘۘ";
                                                            }
                                                        }
                                                        break;
                                                    case 2098882293:
                                                        str15 = "۬ۨۚۛۗۦۛ۬ۥۤۦۜ۫ۘۙۨ۟ۘۛ۟ۛ۠ۗۡۘۗ۟ۜۘۘۘۙ۫۫ۗۤ۫ۥۢۖۖۘۙۤۛ۟ۨۧۘۚۦۨۘ۬ۡۢۡۘ۬ۥۧۘۖۜۜۘۢ۠ۨۛۨۗۜۘۖۡۡۖۘۡۡۦۨۦۚۧۖۘۧۘۖۘۚۥۥۘۡ۬ۗۤ۠ۨ۬ۘۗۧۢۧۡۨۜ۫ۢۛۧۖۗۚۨۘۤۥۙۢۗۡۛۖۜ";
                                                }
                                            }
                                            break;
                                        case 279568112:
                                            str13 = "۬ۢ۫ۖۛۧۘۦۜ۟ۥۘ۬ۡۙ۟ۚۘۙۢۚۙۘۧۘۖۛۘۤۙ۟ۖۖۥۘ۠ۢۦۘۤۜۨ۫۬ۨۛ۫ۧۙ۫ۛ۬ۢۘۦۨۙ۬ۙۧۨۗۖ۠۟ۡ۫ۛ۟ۥۧۘۨۧۦۘ۠۫ۘۘۙۗۨۜ۠۬ۡۨۡ۬ۡ۫۬ۥۚۧۨۖۡۘۜۖۖۖۦۤۡ۟۠ۡۘۦۛۚ۫۫۠ۛۥۖۥۘ۬۟ۦۙ";
                                            break;
                                    }
                                }
                                break;
                            case -1286345227:
                                str2 = "ۦۚۛۡۜۘۘۤۨۚۢۙۛۤۦۙۘۜ۫۬ۨ۟۟ۤۥۘۗۡۦۚۘۙۗۖۙۤۤۧ۟ۤ۬۬ۜ۠ۢۢ۟۫ۖۘ۟ۦۛۥ۬ۖۘۚۗ۠ۡۗۦۘۨۦۖۤۥۨۡ۫ۗۗۥۗۙۦ";
                                continue;
                            case -313285656:
                                break;
                            case 1137184621:
                                str13 = "ۥۧۖۤ۠۫ۘۘ۬ۦۗۜۥۙۤۗۜۖۘۨ۠ۨۤۖۦۘۙ۠ۖۘۧ۫ۛ۫ۖۘۥۜۛۛۜۖۘ۟ۥ۟ۡۜ۟۠ۡۘ۟ۜۥۘۜۗۡۘۧ۟۫ۡۚ۠ۧۤ۟ۗۦۦۥۥۘۘۗۜۡۥۦ۟۟ۥۜۚۨۘۥۡ۟ۚ۫ۜۘۢۜۙۢۨۨۜۥۘۗۗۖۘۢۤۚ۬ۘۡۘۖۖۙ۬ۢ۬ۜۧۡۘ۬ۡ۟ۖۙۚ۟ۖۗۦۘ۫۬ۘۜۜۨۨۘۛ۠ۖ";
                        }
                    }
                    break;
                case 1367710535:
                    str2 = "ۚۚۧ۟ۛۚۦۥۖۛۤۖۘۛۚۨۘۡ۫ۖۘ۬۠ۙۘۢۦۘۧۢۘۘۥۥۥۘۙۙۙۜۛۨ۟ۘۧۘۙ۬ۛ۠ۗۨۦۦۥ۠ۘۜۜۢۖۘۨۤۘۛۡ۟ۨۚۥۢۙ۫ۡۙۖۦۨۧۛۡۨۘ۠ۧ۫۫ۧۢ۟ۡۗۡۧ۫ۤۜۤ";
                    continue;
                case 1922409649:
                    str2 = "ۥ۠ۛۚۦۢۙ۠ۨۘۨۗۘۘۙۖۗ۟ۡۘۘۜۖۘۜۛۘۘ۠ۚ۠ۗۧۙ۬ۨ۬ۜۢۛۦۖۡۘۡۙۦۘ۫۟ۨ۫ۦ۟۬ۖۛۙ۠ۘۚۗۛۦۤۚۧۢۧۦۖ۠ۨۢ۫ۛۜۘۢۖ۬";
                    continue;
            }
            str2 = "۬ۤ۠۫ۜۥۘۚۜۥۘۜۢۧۙۛۗۜۘۜ۬ۡۘۦ۠۠ۦۛۚۜۚۧ۠ۚۖۘۜۗۘۘۤۜۧۥۘۚۜ۟ۙۛۡۘۧۗۚ۬۬ۘ۫۠ۤۖۛۦۘۥۘۙۡۢ۟ۨۧۢۡ۠ۤۙۢۤۢۤۛ۫۬ۨۘۖۢۜۙ۠۟۫ۧۜ۟ۛۗۥۘۘۨ۠ۥ۟ۘۡۘۡۥۦۘ۟ۦۛ۟ۛۛۘ۠ۖۘۘۘۥۘۦۙ۫ۚ۠ۨۘۜۦۚۗ۠۠ۛۨ۠";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$setupGameButton$6$kentos-loader-activity-MainActivity  reason: not valid java name */
    public /* synthetic */ void m258lambda$setupGameButton$6$kentosloaderactivityMainActivity(final String str, final Runnable runnable, AlertDialog alertDialog, View view) {
        String str2 = "ۨۗۙۘۦۢۚۧۦۙۤۧۜ۠ۗۘۦۥۡۗۜۘۨۢۦۡ۫ۘۖۖۧۘۙۧۘۖۡۥۘۘ۟ۥۘ۠۟ۙۥۘۦۘۡۦۡۘ۟ۨۡۗ۫ۘ۟ۤۨ۫۫ۦۘۙۗۖۘۖۨۤۚ۟ۦ۫ۙۜۘۛۨ۬۟ۨۢ۟ۛۥۡۗ۬ۙۚۨۘۚۦۗۧ۟ۢۡۡۘۨۖ۠۫ۧۖ۟۬ۜۘ۬ۚۧۦۜۨۘۡۨ۬ۗۗۗ۠ۨۤ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str2.hashCode() ^ 473) ^ 339) ^ 3) ^ 599) ^ 937) ^ 608) ^ 857) ^ 7) ^ 156) ^ 237) ^ 359) ^ 291) ^ 997) ^ 183) ^ 495) ^ 802) ^ 850) ^ 3) ^ 701) ^ 99) ^ 933) ^ 530) ^ 366) ^ 893) ^ 72) ^ 807) ^ 723) ^ 487) ^ 535) ^ 909) ^ 376) ^ (-1052909169)) {
                case -1797812830:
                    runnable.run();
                    str2 = "۬ۡۧۖ۬ۙۤۨۡۖۗۙ۬ۗ۫ۙۡۜۘ۟۬ۘۘۘۖ۠ۡ۫ۜۛۧۦۘۧ۟۫ۛۗ۟ۡۙۦۚ۠ۚ۬ۖۗۢ۠ۤۨۥۙۙۚۘۗۖۘ۠ۢۜۘۜۨۨۧ۫ۨۘۥۗۖۡۥۧۘ۠۫۟۟۠ۨۘۤۘۧۗۢۖۘۦۨۧۘۜ۠ۧۛۤۙۛ۠ۜۤۢۥۨۥۘ۟ۥۗ۫ۘۘۧ۠ۡۘ۬ۚۨۘۨۙۛۨۖۘ۠ۡۗۚۛۛۜۖۘۗ۫ۡۘ۟ۙۥ";
                    break;
                case -1533732588:
                    str2 = "ۜۢۡۗ۬۟ۤۨۘۘۢ۟ۤ۫ۛۤۛۖۙۗۖۦۗۧۨۘۥۖۘۥۤۥۘۤۦ۫ۧۘۡ۫ۙۨ۬ۚ۟ۚ۫۠ۖۡۗۥۥۦۦۧ۬ۧۢۘۜۥۧۡۘۧۦۘۦۙۘۖۡۙ۫ۧۧ";
                    break;
                case -1496478769:
                    str2 = "۠۠ۢۡۙۧۗۡۦۖ۫۬ۜۘۘ۟ۘۡ۠ۤ۟ۥۙ۬ۙۜۢۤۡۢۛۛ۫ۖۗۨۘۦۘۛۙ۬ۢۜۢ۬ۛۢۖ۟ۧۤۤۛۤۙ۫ۙۚۥۘۛۚۘۘ۟ۨۨ۫۬ۧۗ۠ۢۢۘۢۘۚۡۛۡۧۘۧۘۗۘۢۥۢ۟";
                    break;
                case -1275588518:
                    str2 = "۟ۦۤۨۦۥۘۖۚۥۘۙۡۛۤ۫ۛ۟ۡ۟ۢۖۛۨۢ۫ۖۚۡۘۧۜۨۘۖۢۙۚۜ۫ۚۖۡ۫ۛۢۜۡۜۡۛۘۡۤۦۘۘۢۦۘۖۡۜۘۢ۠ۨۗۚۜۨۘ۠ۨۚۗۛ۟ۙۡۦۨۨۗۦۜۜۥۢۜۤ۟ۨۗۨ۟ۖۘۤۦۖۨ۟ۜۘۛۧۛ۬ۙۦۘ۬ۙۧ";
                    break;
                case -584007808:
                    startPatcher();
                    str2 = "ۗ۬۠۫۠ۚۢ۠ۦۗۤۘۖۢۡۘۦۗ۫ۢۨۡۘۚۜۖۡۛۡۘۜۨۘۧ۟ۡۙ۬۫ۚ۟ۡۘ۟ۖۗ۠ۛۚۡۦۜۘۦ۠ۥۗۙۡۘۥۖۨ۟ۨۘۜ۬ۦۘۗۛۨۘۡۢۡ۠ۨۢۡ۬ۛ";
                    break;
                case -316069089:
                    alertDialog.dismiss();
                    str2 = "ۘۚۨۘۧۡۖۘۚ۟ۦۖۨ۠ۥۢۦۘۡۢۦۘۦۖ۟ۛۛۨۛۚۜۘۚۡۜۘۦۘ۠۬ۖۨۡ۠ۡۤۘۘ۟ۘۛۥۚۖۥۙۙۙۢۨۜ۬ۤ۫ۗۧ۠ۨۦۚۢۥۘ۬ۧۥۙۖۚۦۦۡۘۘۤ۟ۨۘۥۙۥۤ۬ۡۖ۬ۤۛۨ۠ۨۚ۬ۥۦۘۚۘۘۨۚۗ";
                    break;
                case -7037038:
                    String str3 = "ۨۡۘۥۚۢۥۧۘۙۥۦۚۤۘۘۗۦۤۖۤ۬ۧۙۛۡۤ۬ۧ۠۫ۨۢۡۚۤۛ۠۠۟ۤ۫۫ۢ۫ۙۥ۫ۥۘۢ۫۟ۧۛۜۘۤ۠ۦۙ۟ۦۘۜ۟ۚ۠۫ۖۘ۟ۥ۟ۧۗ۫ۘۤ";
                    while (true) {
                        switch (str3.hashCode() ^ 918437834) {
                            case -1489821153:
                                str2 = "۬ۡۧۖ۬ۙۤۨۡۖۗۙ۬ۗ۫ۙۡۜۘ۟۬ۘۘۘۖ۠ۡ۫ۜۛۧۦۘۧ۟۫ۛۗ۟ۡۙۦۚ۠ۚ۬ۖۗۢ۠ۤۨۥۙۙۚۘۗۖۘ۠ۢۜۘۜۨۨۧ۫ۨۘۥۗۖۡۥۧۘ۠۫۟۟۠ۨۘۤۘۧۗۢۖۘۦۨۧۘۜ۠ۧۛۤۙۛ۠ۜۤۢۥۨۥۘ۟ۥۗ۫ۘۘۧ۠ۡۘ۬ۚۨۘۨۙۛۨۖۘ۠ۡۗۚۛۛۜۖۘۗ۫ۡۘ۟ۙۥ";
                                continue;
                            case -802634187:
                                str3 = "ۛۘۡ۫ۤۖۘۧۡۚۚ۫ۤۧۙ۬ۧۡۘۘۖۦۨۘۤۢۚۜۦۗۤۦۢۚۨۧۛۘۡۘۨۖۖۤ۬۫ۗۚۜۛۗۘۘۦ۠۠ۨۜۘۥۢۚۙۡۘۤۗۖۦۚۡ۫۠ۖۢ۬ۘۙۛ۠۬ۖۤ۠ۤۥۘۧۦۤۢۛۙۥۡۗ";
                            case 130140707:
                                String str4 = "۟۟۟ۡۤۖۘ۬۟ۦۘۥۗۛۜۗ۟ۦ۫ۜۤۦۖ۬۫ۥۡۘۧۛۨۘۚۖۜ۟ۢۛۢ۬ۧۖۤۖۘۡۦۥۛۥۡۡۡ۟ۨ۠ۙۨ۟ۚۡۦۚۚ۟ۜۜۘۗۧۥۙۦۨۘۤۦۧۘۡۘۛۛۥۨۗۚ۠ۜ۟ۖ۫ۛ۟";
                                while (true) {
                                    switch (str4.hashCode() ^ 431008650) {
                                        case -1899899721:
                                            str3 = "۬ۙۙۢۥۜۘۢ۟۫ۤۡۜۘ۠ۜۧۘۤۚ۫ۨۥۖۚ۬ۦۜۨۢۜۜۘۥ۟ۙۜ۫ۛ۬ۚۛ۬ۖۚۘۧ۠ۙۖۡۗۗۨۜۖۘۢۡۥ۫ۡۢۨۨۡۛ۟ۖۙۙۜۘ۠ۜۡۗۖ۫ۡۘ۬ۡۧۘۥۡۘۨۢۨۘۖۙۜۖۥۙۢۙ۟ۢۘۧۙۦۘۙۥۜۘۤۤۘۢۚۥ۫ۙۥۘ۬۫ۨۗۗۦ";
                                            break;
                                        case -1867600313:
                                            String str5 = "ۙ۫ۡۘۖۢۤۨۡۡۘۛۖۜۧ۫ۜۧۤ۠۠ۡۤ۠۠ۤ۬ۘۡۘۙۚۨۥۘۘ۠ۘۗۡۚۘۘۨۨ۫ۡۥ۬ۢ۬ۙۖۛۖۨ۟۬ۡۜ۠ۨۢۛۚۙۙۜ۟۫۟ۥۦۘۛۛۦۘۜۡۖۘ۫ۛۨ۟ۙۥۛۘۗۖۜۦۘۥۜۥ";
                                            while (true) {
                                                switch (str5.hashCode() ^ 1647741781) {
                                                    case -1736900126:
                                                        String str6 = "ۢۢ۟ۖۖۖۥۧۘۛۚۖۚۧۘۘ۠ۨۦ۠ۥۜۘۦۢۗ۫ۤۧۜ۠ۤۚ۟۬ۜ۟ۨۛۦۖۨ۬ۥۘۘۘۦۤۜۡۘۗۖۚۙۦۘۜۗۥ۟۫۫ۧۢۖۘۚۜ۬۟۫ۖۘ۠ۙ۟۫۫ۗۛۚۘ۬۫ۥ۬ۖۨۖۚۜۤۗۡۦۛۢ۟ۤ۫ۤ۠ۤۜۗۦۘۤۖۧۘ";
                                                        while (true) {
                                                            switch (str6.hashCode() ^ 15338778) {
                                                                case -857649439:
                                                                    String str7 = "ۙ۟ۜۡۢۤۚۤۡۥۧۦۘۨۡۛ۠ۥۜۥۚ۟ۥۗ۬ۥ۟ۧ۫ۦۡۘۖ۟ۧۥۜۗۗۥۙۤۧۘۘۢ۫ۥۤ۟۟ۖۖۦۘ۟ۚۤۖۦ۫ۥۧۘۙۘ۬۠ۗۗ۫ۢۗۘۚ۫ۤۗۤۖۚۚ۠۟ۙ۠ۤۤ۠ۛۧۙۖ۠۠ۖۘ۟ۡۖۘۢۤۡۘۡۤۗۧ۬ۡۘۜۚۘ۬ۙ۫ۜۜ۟ۗۨۢ۠۠۫ۙۖۜۘ۬ۛۚۥ۠ۢۤۢ۟ۧۨۗ";
                                                                    while (true) {
                                                                        switch (str7.hashCode() ^ 1651637720) {
                                                                            case 553818303:
                                                                                str6 = "ۚۢۧ۠ۡۨۦۙۚۙۨ۬۬ۦ۬ۤۖۜۗ۬۫ۗۥۛۛۗۡۘۙۜۗۛۧۥۘۙۙۡۘ۠ۗۙۧۖۡۘۜۜۨۘۗۥۡۦۤۦۦۛۖۘ۫ۢۨۧۡۦۘۥۨۖۘۗۖ۟۠ۧ۫۟۟ۤ۬۫ۧۖۛۥۘ۫ۜ۟ۗۤۘۘ۬۟ۨۗۢ۫";
                                                                                break;
                                                                            case 745621998:
                                                                                str7 = runnable != null ? "۫ۥۧۦۤۡۘۥۘۥۘۨۚۥ۟ۚۧۚۤۥۚۖۡۘۧۙۤۦۖۥۧۖۧۘۥ۫ۜۙ۟ۨۘ۫ۘۨۘ۠ۤۧ۠ۛۘۘۘۤۡۧۥۨۘۗۖۘۘۗۖۖۘۦۛۜۥۗۙۦۦۡۦ۠ۧۗ۟ۘ۠ۥۦ۠ۤۢۚۡۘۙ۬۠ۙۨۧ۫ۦۖۘۗۘۖۘۗ۠ۗۚۗۜۚۦۜۛۘۧۚۧۖۨۤۜۢۧ۫ۖۤۙۦۙۖۘۖۨۖۘۦۨۨۧۧۡۡۧۘۚۘۜ" : "ۛۢۛۖۡۨ۠ۚۥۘۜۙۨ۬ۦ۬ۜۥۧۙۥۘۤۧۡۡ۟ۦۜۧۘۘۢۗۧۘۤۡۘۖۢۗۥ۠ۡۡ۫ۡۘۗۦۖۘۢۥۧۘۢۥۘۚ۬ۜۢۚۡ۟ۚۧ۟ۜۘ۫ۤ۫۟ۚۖ۫ۖۥۘ۠ۖ۫ۨۢۥ۠ۖۡۨۤۦۙۢ۬";
                                                                            case 1386655074:
                                                                                str6 = "ۨ۫ۤۜۤۥۘۨۗۗۗۡۖۘۚۙ۫ۘۡۥۘۥۘ۬ۙۚۨۥۧۘۦۛ۠ۛ۬ۖۘۗۦۨۚۥ۬۟ۜۘۘۥ۫ۘۘۚۚۘۜ۬ۜۘ۟ۘۡۡۘۙۧۗۜۙۜ۟ۨۧۘۥۤۡۤۡ۟ۥۖۖۘۚ۬ۙ۫ۙۥۚۚ۬۠ۙۧۢ۬ۡۘۥۢۖۛ۠ۨۜۘۧۘۥ۟ۤ۠ۘۦۘۗۢۨۘۨۛۡۘۗۧۨۨۘۦۚۙ";
                                                                                break;
                                                                            case 1404056488:
                                                                                str7 = "ۦ۠ۦ۬۫ۜۘۦۖۨۘۗۧۡۘۖۛۙۧۗۨۚۛۥ۟۟ۨ۬ۛۥۘۘۘۧۢۛ۟ۛۖۘۢۦۡۜۘۨۘ۬ۛۦ۠ۡۡۘ۠ۢۧۗۘۖۨۡۢۢۛۗۗ۠ۜۢۖۡۘۙ۠ۛۙۚ۬۟۬ۖۘۜ۬۬ۜۡۥۘۘۧۜۘۖۖۥۛ۠ۥ";
                                                                        }
                                                                    }
                                                                    break;
                                                                case -671134187:
                                                                    str5 = "ۚۡ۟ۨۜۜۢ۟ۚۦۗ۟ۢ۠ۛ۫ۚۥۘۧۖۥۥۛۖۚۛۖۖۤۖ۫ۜۦۡ۫ۗۛ۠ۥۛۘۗۖۘۖ۬ۘۘۥ۫۬ۡۘۚۖ۫۠ۙ۬ۨۘ۟۫ۙ۬۬ۙۙۗۚۡ۟ۨۘۚۨ۠ۖۧۚۗ۟ۥۘۙۨۖۥ۠ۢۘۗۨ";
                                                                    break;
                                                                case -358657849:
                                                                    str5 = "ۢۦۛ۬ۧۥۘۤ۟ۗۖۦ۟۫ۢۦۡۨۥ۟ۢۘۘۜۦۦۘۡۨۘۙۗۗۗۧۥ۠۫ۡۜۙۢۙۦۢۨۘۢۙۢۡ۠ۖ۬ۙ۫ۖۦۥۘ۫ۡۘۘۗۜۡۘۧۡۖۘۛ۬ۗۙۖۦۤۦۘ۬۟ۧۥ۫ۖ۫ۜۡۗ۠ۙۧ۫ۨۧۘۘۥۤ۠ۥۡۘۥۖۘۗ۠ۖۘۥۧۚۜ۟ۘۘۨۥۢۚۚۦۘۖۗۢۛۥۨۘ۫ۨۘۧۡۡ۬۠ۘۘۚ۫ۖ";
                                                                    break;
                                                                case -320342940:
                                                                    str6 = "۠ۧۥ۠ۨۙۦۗ۟۬ۧ۟ۨ۫۫ۢۥۙۗۡۥۨۖۥۘ۫۫ۥۨۧۡۘۘۨۧۙۤۘۘۘ۫ۖۘ۬ۧ۬ۨۢۤۘ۬ۦۘۙۡ۟۟ۤ۫ۥۜۦ۬ۡۥۜۗۢۗ۫ۥۘۧۘۙ۠ۚۧۜۚۥۦۛۤۛ۠ۛۙۥۧ۟ۙۧۢۢۗۡ۬ۜۘۤۡ۫ۖۘۗ۬۟ۙ۬ۜۢ۫ۢۡۤ۟۬ۜۜۘۙۖۜۖۜۖۛۚۦۘۧۦۙۡۨۨۘۡۚ۫ۨۗ";
                                                            }
                                                        }
                                                        break;
                                                    case -1523228735:
                                                        str4 = "۠ۤۘۡۤۥ۬ۧۨ۟۟ۦۘۤۤۛ۬ۜ۟ۢ۟۟ۡۗۢۤۚۤۜۢۥۜ۟ۘۤ۠ۙۖۢۢ۬ۖۢۚۧۙۤۙۡۧۤۨۘۜۦۙۚۦۡۥ۠ۡۥۧۗ۟۫ۡۘۥۨۨۘ۟ۨۦ";
                                                        break;
                                                    case 96350352:
                                                        str5 = "ۙۤۦۘۥۚ۬ۥ۟ۗۙ۬ۜۘۖۡۡ۟۬ۡ۫ۘ۬ۤۜۘۤۜۦۤۖ۫۠ۘۦۘۚۘۨۨۤ۫ۥۚۘۘۧ۠ۙ۫ۗۜۜۜۙۙۙ۫ۥۙ۫ۢۡۛۥۜۥۜۙ۟ۡۧۘۦۥۖ۬ۥۘۦۨۘۘ۠ۗۧۗۛۛۚۥ۟ۨ۬ۤ";
                                                    case 1293305578:
                                                        str4 = "ۘ۬ۜۢۡۡۘۜ۟ۘ۬ۨۘۘۥۦۥۘۦۨۘۘۚۜۘۘۧ۠ۤۘۧۘۖۘۥۦۤۘۘۧ۟ۙۖۡۧۘ۠ۤۥ۬ۥۢۢۜۤۢ۬ۥۛۤۦۘۥۨۥۘۖۘ۬ۖۧ۬۫ۧۤۧۚۚ۟ۗ۫۠ۙۚۖۨۦۙۖ۠ۢ۟ۛۢۗۘۜۛ۠۫ۖۜۚۨۨۘۤۢۛۗۥۘۘۖۧ۠ۡۜۡۘۚۘ۫ۚۥۘۜۦۥۥۥ۟";
                                                        break;
                                                }
                                            }
                                            break;
                                        case 141536625:
                                            str4 = "ۚ۟ۜۘۥۗۗۛ۠ۦۦۤۜۛۛۡۘۙۜۘۘۥۚۛۘ۟ۖۘۤۖۜۦۗۜۘۥ۟ۨۘۘۛ۬ۖۙۚۖ۠ۜۘ۬ۚ۠۫ۥۧ۫ۡ۠ۜۨۜۘۡۖ۫۫ۧۤ۬ۥۗۨۘۙۖۦۘۨۙۨ۫ۢۦۘۖۨۥۘۨۤۡۘۡۨۨۘۨۘۧ۟۬ۖۘ۫۬ۘۘۡۖۜۘۗۡۛۛ۫ۘۧۘۡۘ";
                                        case 1503497347:
                                            str3 = "ۘۤ۠۠۫ۡۘۦۧۢۖۘۦۘ۠۠ۡۘۗۧۤ۠ۗۚۛ۫ۚ۠ۙۤۢۨۘۖ۠۬ۗ۟ۥۨۦ۬ۖۦۡۚۤۙۤۦ۟ۧۡۚۖۨۘۦۗۖۘۜۦ۫ۙۛۧۡ۠ۤۖۦۡۘ۠ۥۜۤۖۧ";
                                            break;
                                    }
                                }
                                break;
                            case 423086305:
                                str2 = "۠۠ۧۖۨۘۢۡ۬ۥۨۨۖۛۚ۫ۥۦۧ۠ۜۥ۟ۥۘ۠ۢۙۜۗۛۦۨۢۧۖ۠ۜۦۖۦ۟ۗۡۥۘ۠ۙ۠ۙۦۚۚۨۜۘۢۛ۬ۜۘۛ۫ۦۦۘۢۗۡ۟ۚۦۥۛۜۘۗۛۨ۫ۡۘۤ۠ۥۘۧ۟ۚۢ۟ۥۘۡۥۥۘۦۗۦۢۡۘ۟ۢۧۥ۟ۡۘ۫ۡ۬۠ۚ۟ۗۘ۠ۢۛۗۡۖ۟۠ۤۧ";
                                continue;
                        }
                    }
                    break;
                case 72923379:
                    tryAddLoader(str);
                    str2 = "ۗۥۛ۠۫ۜۘ۬ۛۧۛ۟ۨۜۜۘ۫ۛ۫۠۠ۜۚۨۡۘ۟ۦۘۛۖۧۖۢۤۛۡۤۢۡۤۚۥ۬ۜۖۨۘ۬ۡۤۤۙۙۥۥۘ۫۫ۥۘۛۙۜۘۢۗۤۛۥۦۘۛ۫ۘۘۤۜۡۘۡ۫ۥۦۤۙۚۧ۠ۤ۠ۢ۬۟ۘۨۡ";
                    break;
                case 658987717:
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this, str, runnable) { // from class: kentos.loader.activity.MainActivity$$ExternalSyntheticLambda17
                        public final MainActivity f$0;
                        public final String f$1;
                        public final Runnable f$2;

                        {
                            this.f$0 = this;
                            this.f$1 = str;
                            this.f$2 = runnable;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String str8 = "ۛۨۜۘۢۛ۠ۨۢۘۚۨۡۧۖۚۧۛ۫ۜۜ۟ۖۦۢۨۘۦۥۡۢۡۧۥۖۘۘۖۜۘۛۨۚۨۜۙۤۥۧۥ۫ۢۤۥۜۢۛۨۤۗۥۙۧۡۥۛۜۘ۫ۥۙ۫ۥۡۡۧۦۢ۟ۨۤ۬ۛ۫ۨۧۧۖۘۘۛ۬۠ۡۛۙ۫ۚۛۛۜۘۖۘۧۘۢ۟ۜۘ";
                            while (true) {
                                switch ((((((((((((((((((((((((((((((((str8.hashCode() ^ 944) ^ 497) ^ 429) ^ ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) ^ 804) ^ 149) ^ 56) ^ 739) ^ 757) ^ 427) ^ 613) ^ 170) ^ 556) ^ 721) ^ 15) ^ 112) ^ 681) ^ 879) ^ 782) ^ 544) ^ 0) ^ 254) ^ 395) ^ 570) ^ 764) ^ 678) ^ 626) ^ 94) ^ 994) ^ 370) ^ 784) ^ (-222452401)) {
                                    case -2036401249:
                                        str8 = "ۧۚۦۙۖ۬ۛۜۧۘۖۘۢۨۨۘۚۚۧۚۖۨۗۥۘۢ۬ۤۙۢۨ۟ۢۡۡۜ۫۟ۗۜ۟ۦۘۛۙ۟ۢۖۖۜۜۖۘۦۥۡۘ۠ۖۦۘۢۥۘۤۗۗۨ۟۠ۥۧۨۘۤۨۢ۫ۧۦۘۙۢۚۧۚۛۜ۬۠ۡۜۘۘۘ۟ۜۧۛۥۡۥۘ۬ۙ۬ۥۥۡۘ۟۫ۜۥ۫ۡۘ۬ۘ۟ۨۦۡ۬ۢۤۧۤۨۘۜۨۖۘۚۦۜۨۛ۫ۥۡۨۘۜۗۨ";
                                        break;
                                    case 1055705469:
                                        return;
                                    case 1258504590:
                                        this.f$0.m257lambda$setupGameButton$5$kentosloaderactivityMainActivity(this.f$1, this.f$2);
                                        str8 = "۬۬ۘۖۤۦۜۤۖ۟ۖۚۤ۠ۦ۬ۨۦۢۜۦۚۚۦۖۢۨۦۡۡۛۡۤۙۧ۫ۜۥۚۗۥۘۘۥۥۨۖۧۦۨ۫ۦۚۖۢ۟ۥۘۘۛ۫۟ۗۚۜۡۥ۬۠ۗۧۤۤۡۘ۫۠ۧ";
                                        break;
                                }
                            }
                        }
                    }, 3000L);
                    str2 = "۬ۥۧۘۡ۠ۨۘۢۗۨۙۗ۠ۛۘۚۥۥۜۘۤۥۙ۟ۙۡۘۧۛۤ۠ۛۦ۟ۦ۫۬ۜۥۘ۫ۥۤۚۘ۬۫۠ۢۛ۫ۧۛۡۡۗ۠ۧ۫ۗۡۥۧۡۧۨۘۚۘۖۘ۫ۢۧۙ۫ۚ۠ۧۛ۫۬۟۟ۘ۠ۚۗۦۚۛۧ۠ۧ";
                    break;
                case 938394317:
                    str2 = "ۥۜۡۖۤۨۛۗۖۘۨۗۧۗ۫ۜۘۥۧۥۘۘ۠ۗۨۤۛۖۙ۟ۖۢۦۤۤۚ۠ۛۖۧ۟ۗۖ۠ۥۘۧۙۗۧۢ۟ۥۗۨۥۖۘۚۡۜۤۥۘۚۢۛۧۚۢۜۜۦۘۢ۫ۥ۠ۦ۬ۙۨۦۡۛ۫۫ۦۥۦۥۘۛۤۙۥۨۢۦۘۚۛۡۘۗۢۦۗۙۘ";
                    break;
                case 1331159141:
                    return;
                case 1535564179:
                    str2 = "۬ۚۛۨۤۥۤۚ۟۠ۘۛۗ۠ۘۛۚۘ۟ۜۘۧۥۖۚۤۦۘۧ۫۫ۚۧۢۚۢۡۘۧۨۜۘۦۗ۠ۥۗ۠۠ۨۜۛۚ۟ۚۛ۫ۡۤۢۗۥۛ۠ۥۘۢۦۥۨۚۚۡۛۦۘۖۥۨۘۜۘۥۥۜ۟ۜۖۤۘ۟ۨۘۗۚۡۤۡۜۖۖۡۘۥۦۨۥۥ۟ۡۛۤ";
                    break;
                case 2006888443:
                    launchApk(str);
                    str2 = "ۜۢۚۦۘۨ۠ۨۘۗۧۛ۬ۖۧۗۢۖۘۥۧۥۘۨ۠ۖۘۥۙۘۛۦ۠ۙۢۗۦۧۜۘۚۛۜۖۨ۬ۜۢۗۦۢۚۢۦۜ۟ۛ۟۫ۜۥۤۙۥ۫ۤۚۡۧۦۥۘۤۢۦۚۙۥۘۤ۠ۡۧ۫ۖۘۛۙۛۨۡۗۦ۫ۢۘۡۡۘۦۢۛۚ۠ۙۜۜ۬ۤۢۤۦۙۧۡۛۗۚۧۧۦۘۜۥ۟ۖۧۦۜۘۧ۠ۦۘۚۙۢۡۦۜۡۘ";
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$setupGameButton$7$kentos-loader-activity-MainActivity  reason: not valid java name */
    public /* synthetic */ void m259lambda$setupGameButton$7$kentosloaderactivityMainActivity(String str, AlertDialog alertDialog, View view) {
        String str2 = "ۨۚۛ۠ۛ۟ۢۗ۬ۧۨۢۗۚۗ۟ۦۨۚ۟ۜۘۜۚۜۦۧ۬ۧ۟ۢۨۛۥ۠۬۠ۧۨ۠ۙۘۙ۠۟ۘۘ۬۬ۥۘ۠ۧۘ۟ۛۙۡۧۘ۫ۧۨۘۡۥۤۛ۬ۘۘۦۦۡۖۜۜۘ۠۫۠ۗۖۦۘۜۧۛۦۚۡۥۢۡ۬ۛۡ۟ۗۦۖۛۨۛۛ۬۠ۥۛۦۙۚۛۨ۬ۨۚۢۥۦۗ۬ۥۗ۠ۦ۟";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str2.hashCode() ^ 985) ^ 360) ^ 340) ^ 88) ^ 852) ^ 485) ^ 225) ^ 743) ^ 39) ^ 125) ^ 428) ^ 827) ^ 861) ^ 766) ^ 723) ^ 419) ^ 963) ^ 879) ^ 399) ^ 617) ^ 167) ^ 291) ^ 914) ^ 429) ^ 224) ^ 325) ^ 484) ^ 203) ^ 275) ^ 866) ^ 899) ^ 1433084065) {
                case -1708384701:
                    installGameWithObb(this, str);
                    str2 = "ۤۤۗ۬ۡۨۘۜۗۗۛۦۦۙۗ۟ۖۡۥۘۤۤۥۗۢۥ۫ۤۚۖۚ۬ۢ۬ۨۥۡ۫ۡۗۜۘۙۤۖۘۗۥۖ۟ۖۡۘۡ۟۟ۤۘۨۨۢۤۚۙۥۜۚۘۡ۫ۘۘۡۖۥۘۦۢۜۘۗۡۢۢ۠ۗۙۨ۠ۛ۠ۥۗۤۛۘۤۥۗۚۜۘۜۙۜۘۙ۟ۖۘۙۤۥۘۨۤ۬";
                    break;
                case -374952232:
                    str2 = "ۥ۟ۘۘۜۛۧۛۚۦۘ۫ۤ۬ۢ۠ۢۖۖۘۗۤۥۗۡۡۘۘ۠۬۫ۧۖۢۗۚ۠ۦ۬ۖۙۛ۫ۡۘۘۘۧۧۡۤۛ۠ۛۡۦ۬ۥۘۢۦۚۨۥ۟ۤۜ۫ۛۚۜۛۨۗۛۥ۟ۗۢۦۘۖۗۧۚۦۘۛۚۘۨۙۖ۬۟ۖۛۛۘ۟ۗۛۜۚ۠ۢۚ۟ۤۢۜۘۡۡۤۧۨ۟ۚۤ۠۬ۡۖۦۜۜۘ";
                    break;
                case 127700541:
                    str2 = "۠ۨۥۘۤۖۤۗۧۗ۠ۡۖۘۚۡۤۢۤۧۘۢۨۛۚۡۜۨۙۛۥۡۘۙۡۖۘۚۤۡۘۛۚۡ۠ۥۡۦ۬ۢ۟ۡ۠۠ۥۦۘۥۜۘۘۨۜۥ۠ۥۘۚۥۜۘۗۘ۠ۥۘۡۦۘۥ۠ۘۚۚۜۘۦۙۜۜۧۦۘ۟ۜ۫ۙۦۜۘ۬ۡ۠ۖۘۖۘۘۖۢ۠ۘۧۤۗۖ";
                    break;
                case 699821900:
                    return;
                case 1061300081:
                    Toast.makeText(this, getString(C0931R.string.str00cc), 1).show();
                    str2 = "ۤۖۤۚۛۗۚۦ۫ۚۜۥۘۥۘۧۘ۫ۨۨ۟ۦۧۨ۬ۘۤۤۙ۠ۦۜۘۤۥۖۘ۟۟ۜۘ۠ۤۘۘۥۘ۫۟ۘۦۘۗۡ۠ۜۚۢۢ۟ۛ۫ۜۛۜۡۨ۟ۧۢۙۦ۬ۦۖۙۡۧۦ۫۟ۨۚۘۧۥۧۖۘۗۦۥۘۗۜۘۘۡۛۦ";
                    break;
                case 1516688116:
                    str2 = "ۤۖۤۚۛۗۚۦ۫ۚۜۥۘۥۘۧۘ۫ۨۨ۟ۦۧۨ۬ۘۤۤۙ۠ۦۜۘۤۥۖۘ۟۟ۜۘ۠ۤۘۘۥۘ۫۟ۘۦۘۗۡ۠ۜۚۢۢ۟ۛ۫ۜۛۜۡۨ۟ۧۢۙۦ۬ۦۖۙۡۧۦ۫۟ۨۚۘۧۥۧۖۘۗۦۥۘۗۜۘۘۡۛۦ";
                    break;
                case 1525032683:
                    alertDialog.dismiss();
                    str2 = "ۡ۬ۜۘۢ۬ۧ۬ۦ۟ۡۨۙۗ۬ۖۘ۟ۡۢۡۦۤ۫ۖۜۘۦۢۨۙ۠ۥۘۧۗۨۚ۠ۜۘۨ۫ۧۦۥۖۘۙۥۚ۟۠ۦۘۘۚۥۘۢ۟ۧۤۗۥۚۙۛۨۖۤۗ۠ۦۘۡ۬ۢ۬ۦ۟ۚۥ۫ۤۖۢۚۘ۟ۚ۠ۗۧۢ۠۟ۖۦۖۦۧۦۘ۬۬ۡۥۗ۠ۙۥۘ";
                    break;
                case 1727934978:
                    str2 = "ۗ۫ۚ۟ۖۢۨۜ۬ۦۦۚۛ۠ۗ۫ۜۤ۬ۡ۬ۤ۠ۛۗۗ۫ۦۙۜۘۗۢۦۘۦ۫۬۫ۤۧۖۤ۟ۢ۬ۦۘۧۦ۟ۦۛۚۡۚۥۘ۬ۜۧۡۚۡۦۨۖۗۗۘۗۛۢ۟ۥۛۘۚۗۨۨۜۗۙ۟۠ۥۢۖۘۧۘۦۧۥۦۢۘۤۜۜۥۗۘۤۢۘۘ۠ۜۡۘ";
                    break;
                case 1777865671:
                    String str3 = "ۘۥۘۘۤ۬ۨۙۘۖۘ۟ۖۛ۟ۨۡۨ۬ۦۛۢۜۘ۬ۜ۟ۙۗ۫ۛۡۨۨۚ۬ۨۡۧۖ۟ۗ۫۬ۦ۠ۜ۫۠ۦۙۖۥ۫ۥۡۦۢۡۘۥۚ۟ۤۜۧۘۧۡۧۘۤ۬ۤۜۖ۬ۨۘۙۘۜۘ۫۬ۥۘۙۛۘۘۤ۬۟ۘ۬ۨ";
                    while (true) {
                        switch (str3.hashCode() ^ 1971535119) {
                            case -1019515218:
                                str3 = "۫ۨۖۘۢۤۦۘۤۢۡۘ۠ۢۜۘۨۥۨ۟ۚ۫ۢۖۨ۬ۦۛۧ۟ۨۛ۟۠ۖۜۦۚ۬ۚ۬ۥۚ۠ۗۨۘۦۚۡۧ۫ۜ۠ۢۦۚۨۧۘۛ۬۬ۗۜۡۘۙۙۖۢۛۦۘۨۤۦۘۙۤۡۥۡۛۗۜۘ۠ۚۦۘ۠ۤۡۘ۠ۖۘۡۛۦۘۘۗۚ۫ۢۛۙۙ۠ۢۜۡ۫۫ۜ";
                            case 1746308948:
                                str2 = "ۡۖۗۧۢۦۘۖۥ۫ۘۗۨۘ۠ۤۜۘ۟ۘۤۤۦۜ۫ۨۗۧۢۙ۫ۤۤۖۡۖۗ۬۬ۡ۟ۛۙۖۖۘۧۡۡۛۧ۫ۗۡۚۛۛۤۙۧۘ۟۬ۘ۟ۤۦۤۛۧۛۖۖۨۘۥۘۨ۟ۛۖۖۦۙۢ۬ۧۦۤۡۗۛۤۚۘۚ۬ۢۜ۫ۧۗ۬۬ۙۥۘۨۖۙ";
                                continue;
                            case 2013908178:
                                String str4 = "۫۠ۗۡۜۦۘۧ۬۬ۦۛۦ۬ۨۘۦۥۤۦۚۖۘۡ۠ۘۘۗۗۥۘ۬ۖۨۤۡۧۢۚۡۘ۬ۥ۬ۖ۟ۥۥ۬ۗۛۗۗۗۡۤۛۘ۠ۢۘۨۘ۬۫ۖۘۥۧۜۧ۬ۘۘۡ۟ۖۙۨۥۘۨ۫ۨ";
                                while (true) {
                                    switch (str4.hashCode() ^ (-327167080)) {
                                        case -662282151:
                                            String str5 = "ۨۧۦۗۧۡۘۜۜۘۘۛ۟ۨۢۙۖ۬ۢ۫ۛۗۨ۠ۨۗۡۨۛۛۖۘۦ۠ۤۡۗ۬ۤۘۘۢۡۤۨۖۨۘۙ۫۬ۧۘۡۘ۟۫ۜۘ۟ۛۨۘۛۚ۫۫ۘۦۘۧۖ۠ۚۗۥۜۖۗۜۦۘۢۖۘۘۨۘۤۨۖۛ۠ۡۨۘۢۤۜۘۦۥ۟۠ۢۘۘۚۜۦۘۦۧ۟ۗۤۖۘ";
                                            while (true) {
                                                switch (str5.hashCode() ^ (-1876991272)) {
                                                    case -1393955849:
                                                        str4 = "۬۟ۤۢۗ۠ۤۙۘ۠ۧ۫ۡۢۦۘ۬ۨۜۘۜۡ۫ۖ۟ۧۥ۬ۖ۟ۙۗ۠ۤۛۛۨۧۘ۠ۤ۠ۖۚۨۤۡۧۘ۟ۙ۫ۢۡۜۘ۠ۚۜۘۗۜۥۘۗ۟ۘۘۖ۫ۙ۟۟ۡۘۙۢۙۜۗ۫ۙۡۡ۟ۜۙۜۚۤۘۚۥۦۢۖۢۜۘۡۗۦۨۛۘۖۡ۠ۙۖۘۤۦۘۘۘۨۛۖۦۧۛۥۡۥۖۘ۠ۧ۟۟۫ۨۘۗۨۘۘۢۚۘۜۧۨۥ۫";
                                                        break;
                                                    case 251812011:
                                                        String str6 = "ۘۥۥۘ۟ۧۙۥۜۧۘۢ۫ۖۘۚۜۜۘۢۧۥۘۘ۟ۗۧ۟ۨۘ۟ۢ۬ۗۜۜۘۢۘۥ۫۠ۦ۫ۥۨۧۧۙۘۡۦۗۢ۟۠ۙۗۗۛۦۘۗۙ۟ۘۙ۠ۚۥۢۤۙ۠ۖۗ۫۟ۛۖۘۡۥۖۗ۟ۦۘۡۨۦۘۨۦۡۛۧۜۘ۟ۜۥ۫ۜۥۘۜۛۘۖ۟ۜۥۥۡۘۥۛۡۘ۫ۤ۫ۦۥۦ۠ۧۨۘۖۙۤۚ۫ۡۘ۬۠ۡۘۡۥۛۛۜ۫۬ۨۛۗۘۘۘ";
                                                        while (true) {
                                                            switch (str6.hashCode() ^ 389850219) {
                                                                case -1812325936:
                                                                    String str7 = "ۚۥ۫ۢۧ۟ۘ۫ۡۘ۬ۚۗۛۤ۠ۢ۬۫ۨۧۡۘۤ۫ۡۢۡ۟۠ۥۖۘۖۧۘۧۤ۠ۚۚ۬ۙۢ۫ۚۘۡۘۗۛۡۘۥ۠ۘۘۨۙۡ۠۠ۛۘۚۡۘۦ۫ۡۡۥۖۘۜ۫ۤۙۢۖۘ۫۟۫۫ۙۜۘ۫۫۟ۦۨۧۘۡۖۧۘۗۙۚۘۖۦۚۗ۫ۚۨۡۖۚ۟۟ۜۚۤۚۥۘۘۙۗۖۥۖۘۡۤۗۚۙۡۘ";
                                                                    while (true) {
                                                                        switch (str7.hashCode() ^ (-1487429946)) {
                                                                            case -1808761331:
                                                                                str7 = !fixinstallint ? "ۦۘۘۗۜۧۘۢۛۧۗۙ۟ۢ۫ۧۧۥۘۧۦۥۧۛۘۚۚۙ۬ۛۖۧۤۘۘ۫ۖۡۘۚۦۧۢۗۦۨ۫ۡۦۤۡۘۛۛۤۤۡ۫ۙۘ۬ۧۨۜۘ۟ۡۗ۟ۖۡۘۡۨۡۛۛۨۘ۫ۖۦ۟۟ۜۖۖۘۗۘۨۘۜۗ۬ۚۖۖۘۡ۫ۤۡۧۘۧ۟۫ۥۖ۫ۢۧۡۨ۠ۘۡۡۡ۠۠ۦۡۜۘۙۧ۠ۨۘۘۚۧۜ۠ۙۧۦۖ۠ۜۨۘ" : "۬ۤ۫۫ۗۖۘۦ۠ۜۘ۠۫ۦۘ۟ۡۙۨۜۤۜۚۡۘۚۨ۟ۚۛۡۙۘۛۦ۟ۗۦۖۡۘۦۧۧۘۦۘۘ۟۫ۖۥ۬۬ۘۖۘۤۚۖۘۙ۟ۦۘ۟۫ۗ۟ۗۦۚ۫ۨۡ۟ۙۙۙ۟ۗۨۛۖ۠۟ۖ۟ۛۗۨۘۚۖ۠ۦۧۦۘۜۧۡۘۢ۠ۦۧۧۨۘۘۧ۫ۜۧۜۘ۟ۜ۬ۤۘۙۖۙۜۘۙۢۜۚۦۜۘ";
                                                                            case -1449370931:
                                                                                str6 = "ۧۦۢۗۦۧۛۗۡۘۢۤۧۚ۬ۜۨۨۙۜ۫۫ۚ۫ۙ۟ۡ۠ۘۧۤۙۥۘۦ۫ۡۜۧۜۘۨۡۦۘۨۨۥۧۛۥۘۡۤ۟ۗ۟ۙۚۤۡۙۤۖ۠ۜۜۘۤۦۥۥۘۗۜۢۜ۠۟ۖۘۢۗ۟ۢ۟۟ۨ۟ۛۚۛۦ۫۫۟ۖۛ۫ۜۢۜۘۛۨۥۤۥۖۘۙۢۦۘۤۚۧۦۜ۫ۖۤ۫ۗۜۘۧۛۘ۫ۛۡۖۥۘۘۛۘۧ۟ۚۘۘۧۖۢ";
                                                                                break;
                                                                            case -974286333:
                                                                                str6 = "ۛۤۜۘۚۙۥۘ۫ۙۘۨ۬ۦۜۘۧۘۥۧۦۚۖۗۧۜۧۘۙۦۥۘۖۤۗۖۡۗۡ۟ۘۘۦۛ۠ۧۧۙۜۙۢۥۥۚۜۦۘۚۚۥۘۜۡۢۘۖۖۘۨۡۦۘۛ۫ۧ۫۟ۢۗۜۜۘۜۗ۬ۗۚۖۘۙۧۤۘ۠ۦۘۖۧۚ۟ۧۛۦۚۢۢۢۖۢۜۥۖ۠۫";
                                                                                break;
                                                                            case 1207207941:
                                                                                str7 = "ۗۨۜۦ۬ۤ۠ۘۧۘۨۡۘۥۦۧۘۚۥۤۦۜۧۖۙۥۘۨۨۖۘۥۙ۫ۛۢۙۧۘ۟ۥۙۥۘ۫ۦۖۜۧۥۘۛۛۥ۠ۦۖۚۚۜۛۗۚ۟ۧۘۘ۟ۗۛۡۦ۟ۦۛۥۖۦۘۜ۬ۥۘ";
                                                                        }
                                                                    }
                                                                    break;
                                                                case -1755286091:
                                                                    str6 = "ۙۢۧۜۦۢۙۡۧۘۜۙۨۘۤ۠ۘۡ۫ۜۛۛۜۘۥۤۗۘ۠ۥ۠ۨۢ۟۠ۚۡ۟ۤۨۚۢۜۧۦۘ۟ۛۘۨ۠ۥۘۖ۫ۤۙ۬ۙۥ۬ۖۘۛ۬ۡۘۡ۬ۧۨۘۖ۟۫ۘ۟ۨۥۛۦۘۡۛۗۛۦ۫ۙ۠ۤۧ۬ۚۤۤۧۜۤۧۖۨۤۥ۠۫۠ۘۧۘۖۦ۬";
                                                                case 126455893:
                                                                    str5 = "ۨۡۨۛ۠ۙۧۚۨۘۢۧۥ۟ۢۜۙۖۛ۫ۥۥۖ۬ۙۥۨۧۘ۫۫ۨ۫ۦۗۙ۫۫ۢۜۢۛۘۜۛۨۗۡۤ۬ۘۥۦۛۗ۬ۖۙۚۙ۫ۚۙۤۤۖۢۥۘ۟ۖۡۘۡۜۛ۫ۢۜۘۙۜۙۖۛۦۘۘۥۘۘۘۧۦۢۘ۠۬ۛۡ۫ۤ۫ۦۚۗۙۜۙۥ۠ۥ۬ۛۜۤۤۡۨۦ۟ۥۘ";
                                                                    break;
                                                                case 2140033674:
                                                                    str5 = "ۧۢۜۘۨۨۥۜۢۙ۬ۥ۟ۘ۠ۡۗۙۨۢۦۦۤ۠ۖۢۡۢۖۢۨۚۛۡ۬ۧۥۚۗ۫ۥۧۜۧۧ۠ۜۨۛۛۥۘ۬۫ۜۘ۠ۗۦۘۜۚۥۘۨۦۛۜ۟ۥۘۢۘ۟ۧۤۤۨۥۗ";
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 460329968:
                                                        str5 = "۠ۧۖۧۢۘۘۤ۟۟ۤۘۥۘ۠ۘۧ۬ۧۛۦۛ۟ۢۧۙ۠ۤۚ۟ۥۥۘۤۦۖۗ۫ۘۘۗ۠ۘ۠۫۟ۨۘۨۘۢۜۜۛۛۡۘۗۡ۠ۚۦۨۡۢۥۘۢۗۘۘ۟۫ۥ۠ۤ۫ۦۧۘ۠ۜۘۘۥۜۤۡ۠ۤۜۗۧۛۖۦۘۧۘ";
                                                    case 1063374915:
                                                        str4 = "ۢۨۗۚ۟ۜۘۜۖۛ۟ۖۜ۠۬ۜۚۨۗۖۙۜۗۧ۬ۢۥۙۡۚۙ۫ۤۚۗۤۦۘ۠ۨۖۘ۟ۘ۟ۖۘۜۘۗۚ۬ۨۛۢۥۥۘۘۗۖۢۡ۟ۡۡۘ۫ۥۜۧۘۖۘۙۤۛ۫ۙۙۧۜ۬ۛۧۛۙ۟ۧۛۙ۠ۘۜۘۘ۬ۛۦۘ۟ۡۥۤۥۚ۠۟۫۟ۡ۟";
                                                        break;
                                                }
                                            }
                                            break;
                                        case -39793333:
                                            str3 = "ۚۘۗۗۦۤۡۤۨۘۥۘۘۘ۟۬ۜۡۘۙۤ۟۟ۗۨۦۤۢۢۘۘۥۨ۫ۡ۬ۜۘۗ۫ۚ۬ۧۡۥۢۥۨۚۡۘۦۧۘۘۢۚۜۧ۬ۤ۟ۙۦۘۤۙۤۤۚۙۧۜ۬۫ۦۤۨۥۜۜۙ۬۠۟۫ۨۨۗ۟ۥۤۨ";
                                            break;
                                        case 1041498970:
                                            str4 = "ۥۦۤۙۡۧۧۥ۫ۖۗۤۚۛۜۧۨۥۘۢۦ۫ۗۢۧۢ۠ۡۘۘۧۙۨۚۥ۬ۘۘ۠ۛۚۧ۫۫ۜۖۖۜۙۛۢ۬ۖۘۦۨۜۘۧۚۖۘۦ۟ۛۗ۠ۦۤۢۢ۠۟۟ۦۜۡۤۖ";
                                        case 2104369209:
                                            str3 = "۠ۚۜ۠ۚ۫۫ۥ۟ۛۜۘۖ۠ۛۨۧۖۘۨۦۛ۫ۥ۟ۤۜۡۛ۟ۘ۬ۘۛۤۘ۬۬ۘۥۥۡۥۘ۟ۗۖۘۤۖۘۜۚۢۛۖۖۥۥۘۢۘۡۚۡۙۢۢۖۘۖۗۤۡ۬ۙۢ۟ۦۧۡۨۘۦ۬ۡۘۘۥۜۨ۟ۚۢۥۛۘ۬ۡۛۛ۟ۙۦۘۨ۫ۛۤۨۜ";
                                            break;
                                    }
                                }
                                break;
                            case 2118548668:
                                str2 = "ۢۛۗۚۘۦۘ۬ۙۗۙۤۙۨۦۨۘۨ۫ۦۛ۬ۢۤۢۢۛۥۥ۠ۚۖۙۛۚۤۙۡۧۖۡۘۧۦ۬ۨۛۢۥۘۖۘ۠ۨۦۘ۠ۧۜۘ۠۟ۥۘۙۙۖۚۚۥۙۛۘۘۗۥۥۡۘ۫۠ۦۘ";
                                continue;
                        }
                    }
                    break;
                case 1840149337:
                    str2 = "ۛۙۖۡۦۨۘۖۧۨۤۘۛۦ۠ۜ۟ۘۜۘ۠ۧۥۘۘۤۡۘۗ۫ۘۚۢۨ۬ۦۜۘۡۨۦۘۙۗۡۘ۟ۤ۬ۡۛۜۘ۠ۜۘۘۢۢۖۘۦۜۖۘۙ۟ۨۘۢۥۘ۠ۥۡۨۜۖۥۜۧۘۡ۟ۘۤ۠ۦ۫ۛ۬ۥۧۥۛۜۘۧۙۖۛۦۦۘۙۤ۬ۥۤۥۘۚۧۡۛۖۦۘۦۗۘۙۦ۫ۚۜ۫ۜۛۤۨۦۤۥۢ۫ۛۛۗۨۛ۫۠۟۬ۙ۫ۗۗۧۨ";
                    break;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 527
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    /* renamed from: lambda$setupGameButton$8$kentos-loader-activity-MainActivity  reason: not valid java name */
    /* synthetic */ void m260lambda$setupGameButton$8$kentosloaderactivityMainActivity(int r26, java.lang.String r27, java.lang.Runnable r28, android.view.View r29) {
        /*
            Method dump skipped, instructions count: 2252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kentos.loader.activity.MainActivity.m260lambda$setupGameButton$8$kentosloaderactivityMainActivity(int, java.lang.String, java.lang.Runnable, android.view.View):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$showErrorDialog$18$kentos-loader-activity-MainActivity  reason: not valid java name */
    public /* synthetic */ void m261lambda$showErrorDialog$18$kentosloaderactivityMainActivity(String str) {
        String str2 = "ۨۘ۠ۢۡۘۘ۟ۦۨۘۚ۫ۜۧۥۚ۟ۘ۬۟ۛۥۘۤۧۖۚۡۙۡ۬ۤ۠ۗۜۤۘۖۘۦۚۘۡۨۡ۟۠۟ۤۥۗ۟ۦۘ۟ۦۢ۟ۥۘۛ۬ۦۘ۬ۜۚ۠ۛۗ۟ۥۙۧ۟ۦۛۧۥ۬ۚ۠۟ۢۦۘۦۦۥۡۨۧ۬۫ۘ۬ۘۘ۬۬ۛۨۤ۫۬۟ۖۘۤۤۥ۟ۘۗۜۤۤۘ۬ۛۧۘۨۘۜۤۧ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str2.hashCode() ^ 355) ^ 387) ^ 262) ^ 473) ^ 451) ^ 367) ^ 672) ^ 357) ^ 608) ^ PointerIconCompat.TYPE_HAND) ^ 297) ^ 412) ^ 883) ^ 204) ^ 706) ^ PointerIconCompat.TYPE_CROSSHAIR) ^ 519) ^ 643) ^ 144) ^ 526) ^ 152) ^ 749) ^ 15) ^ 653) ^ 61) ^ 717) ^ 602) ^ 455) ^ 63) ^ 321) ^ 821) ^ (-442347155)) {
                case -1876223414:
                    str2 = "ۢۧ۟ۛۨۡۘۚ۠۫ۛۧۜۘ۟ۨۢۘۙۖۘۤۧۥۘۥۤۨۧ۠ۙۙۨۨ۫ۘۡۘ۠ۤۨۘۧ۟ۛ۠ۗۡۜۛۦۘۙ۬ۜۘۙ۫۫۟۟۠ۡۢۦۘۤۦۘۘۡۙۚ۠۬ۖۚۘۘۤۛۦۘ۬ۡۦ";
                    break;
                case -1177735198:
                    return;
                case -775090512:
                    showStyledDialog(getString(C0931R.string.str0046), str);
                    str2 = "ۙۨۥۘۘۘۧ۠ۢۡۨۙۦۧۢ۫۠۬ۥۖۖۖۥۧۘ۫ۡ۬ۡۚ۬۬ۛۡۚۖۘۥۘ۠ۜۜۘۘۤۡۨۧۖ۫۠۟ۢۨۘ۬۫۟۟ۜۡۘۢۖۤۡۨۦۘۥۡۦۥۖۢۗۨ۬";
                    break;
                case 71186473:
                    doHideProgress();
                    str2 = "ۢۗۡۘۘ۠ۡۗۢ۟ۘۦۚۜۨۡۘۘۥۡۘۗۢۤۢۗۜۘۜ۫۬ۙۘ۫ۤۙ۬ۗۛۖۘ۟۠ۜۘۡ۫ۗۥۥۜۘۘۙۚۛۙۛۘۚۦۘۛۚۡ۫ۧۨۤ۬ۤۖۜ۫۫۬۟ۛۧ۠۬ۚۨۚۦۘ۠ۢۦۘۡۧۦۥ۫ۜۘۡۗ۟ۨۗ۟۬ۖۧۘ۟۟ۥۤۤۢۙۜۜۘۘۨۨۛۤ۠ۥ۬ۚ۫ۥۜۖۘ";
                    break;
                case 1983098957:
                    str2 = "۠ۛۘۚۧۜۘۜ۬ۗۢۡۦۘۢۤۡۡۜۗۖ۟ۥۖۚۙ۠ۨۙۘۥۨۛ۬۠۬ۢ۟ۜ۟۬ۖۘۢۚۡۘ۫ۙۗۤۧۨۖۦۡۨۡۤۘۤۥۘۙ۠ۖۦۨۘۘۤۨۥ۟ۗ۟ۜۧۗ۫ۜۨۗ۟۠ۖۖۘۤۨۧۘ";
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$showUninstallDialog$20$kentos-loader-activity-MainActivity */
    public /* synthetic */ void m77x6d319683(String str, DialogInterface dialogInterface, int i) {
        String str2 = "ۧۤ۟ۘۚۨۘ۬ۦۢۚ۫ۜۢۧۖۘۡ۟ۦۧۗۨۘۤۦۜ۬۫ۘۘۨۜۛۜۛۧۚ۠ۘۖۨۚۗۗۤۧۨۚۘۢۨ۫۬۬ۗۢۖۘۥۥۦ۠۬۬ۥ۬۫ۥ۫۟ۛۢۜ۟ۧۜۖۨۨۜۥۦۘۨ۠ۚ۟۬ۜۘ۠۬۟ۖۘۡۛۜۘۘ۬ۘۨۡۚۨۤۨۨۡ۠ۗ۠ۙۚۜ۬ۨۘۖۛۡۘ۫ۖۖۘۙۚ۫";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str2.hashCode() ^ 48) ^ 89) ^ 940) ^ 549) ^ 526) ^ 189) ^ 408) ^ 36) ^ 759) ^ 47) ^ 960) ^ 991) ^ 512) ^ 811) ^ 952) ^ 348) ^ 899) ^ 813) ^ 555) ^ 86) ^ 162) ^ 84) ^ 622) ^ 505) ^ 507) ^ 211) ^ 72) ^ 596) ^ 24) ^ 364) ^ 702) ^ 1925823528) {
                case -1846644366:
                    str2 = "۫ۧۤ۟۬ۨۘۗ۬ۨ۟ۤۗ۟ۚۡۨۗۙۧۖۧۘ۫ۗۗۙۦۜۘ۟ۛۘۘۡۨ۟ۜۗۨ۬ۦۖۘۘ۠ۖۘۡۖۘۛۧۢۖ۠ۥۘۜ۠۠ۧ۬ۨ۬ۗۦۘ۠ۥۗۨۨۙۙ۫۟ۘۚۧۗۦۘ";
                    break;
                case -931198722:
                    str2 = "ۨۗ۠ۜۦۨۘۥۛۜۖۨۧۘۨ۫۟ۤۙۜۘۦۧۖۨۘۚۦۙۖۦۗۖۚۖۚۦ۠ۡۦۡۢۨۥۘۧۤۛۚۡۜ۫ۜۡۘۖ۠ۥۘۢۘۜۘۡۥۤۙۤۡۘۨۚۥۧۘۖۘ۠ۦۧۧۡۦۘۘ۟ۤۗ۬۬ۢۢ۟۬۟ۡۘ۟ۙۙ";
                    break;
                case 410352659:
                    Toast.makeText(this, getString(C0931R.string.str00e4), 0).show();
                    str2 = "ۧ۬ۘۨۜۦۧۨۘۧۗۜۜ۠ۡ۬ۘۥۘۤۦۨۘۗ۬ۡۧۡۚ۫ۛ۟ۧۜۧۘۜۢۨۘ۟ۥۗۦ۟ۦۦۡۛۛۧۧۗۚۧۦۨۘۥۖۧۘۥۛۙۥۨۦۘۨۛۛ۬ۡۥۨ۟ۡۘۢۗۦۧۥۡۘۥۚۨۧۛۖۘ۫۟ۘۘ۠ۡۨ۟ۡۡۤۤۘۗۛۡۘۨۖۧۛۖۨۘۖ۟۫ۤۤۡۛ۟ۧۘۨ۬ۦۛۧ۟ۚ۟ۦۙۨۤ۟۬ۥۗۜۛۖ۠";
                    break;
                case 827314256:
                    str2 = "ۘۢ۫۟ۖۜ۬ۘۨۘۖۥۨۘۧۧۜۢۗۤۜۚۛۘ۫ۡۖۧ۬ۥۖۢۙۡ۟ۗۘۖۖۜۜۘۤ۠ۨۧۗۘۘۢۡۧۘۢۚۖۘۨۤۜۘ۠ۙۤۘ۟ۨۘ۟ۘۖۚۡۗۜۦۧۘۦۛۥۛ۠ۥۘ";
                    break;
                case 1742463876:
                    return;
                case 1810105323:
                    str2 = "ۗۜۛۘ۟ۚۛۢۛ۠ۦۙۜ۟ۜ۠ۧۙۢۗۨۚ۠۫ۙۚۚۦ۟ۗۗ۠ۖۘۨۙۧۙۧۚ۬ۚ۫ۡۛ۟ۗۡ۟ۘۤۨۘۤۤۦۖ۬ۥۘۘۥۧ۠ۜۦۘۡۧۢۥۖۤۗۧۥۤ۠ۛۢۥۨۖۦۨۘۙۤۡۘۘۡۗۡۛۦۜ۠ۜۖۦۘۚۖۘۤ۫ۙۜ۠ۦۘ۠ۦۨۨۖۧۘۚۘۚۨۜۧۧۦۖۘۖۛۥۢۙۜۡۥۘۘۚۗۦ";
                    break;
                case 2092329841:
                    unInstallApp(str);
                    str2 = "ۛ۬ۖۘۘۡ۠ۛۙۦۘۖۡۧۘۢۨۙۤۜۡ۟۬ۥۢ۫ۨۘۜ۠۫ۨۜۘۘۨ۬ۤ۠ۤۡۘۨۢۜۘۤۛۚۨۡۜۘۨۨۘ۬ۙۡۘۚۨ۟۟ۢۖۘۗۧۨۧۦۦۦۡۧۘۙ۫ۥۥۛۘ۬ۛۚ";
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$startFloater$21$kentos-loader-activity-MainActivity  reason: not valid java name */
    public /* synthetic */ void m262lambda$startFloater$21$kentosloaderactivityMainActivity() {
        String str = "ۖۛۘۘ۫ۨۢۤۘۘۘۗۢۜۜۛ۫ۤۚۙ۬۠ۖۘۢ۬ۨۥۛۦۘۢۢ۠۠ۚۢۤۦۢۜۥ۠ۥۘ۫ۘۖۚۢۘۢۤۚۛۚۤۚۜۘۨۦۛۛۙۨۘۜۛۦۘ۠ۖۥۘۥۥۚ۫ۨۖۘۙ۫۠ۚۛۜۘۤۘۥۘ۟ۚۥۨۧۖ۠ۥۦۧۥۛ۠ۨ۬۟ۛۢۗۡ۬۠ۧۘۗۜۘۧۨ۠ۡۛۨۘ۫ۦۜۥۡۧۘۦ۫ۨۙۡۧۘۥۡۛۦۜۦ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 441) ^ 811) ^ 121) ^ 126) ^ 25) ^ 911) ^ 696) ^ 889) ^ 108) ^ 653) ^ 703) ^ 216) ^ 778) ^ 964) ^ 593) ^ 573) ^ 256) ^ 966) ^ 310) ^ 390) ^ 12) ^ 961) ^ 333) ^ 340) ^ 702) ^ 888) ^ 665) ^ 530) ^ 557) ^ 201) ^ 477) ^ 1988694370) {
                case -1265950101:
                    str = "۬۠ۥۙۖۤۚۢۜۘۡۥۧۚ۟۠۫ۡۦۘۖ۠ۖۘۡۦۧۘۡۘۘۘۡ۬ۨۡۜ۠ۡ۫۬ۧۚ۟ۨۥۖۘۘ۠ۦۘۡۥۦۙۤۘۘ۠ۤۜۙ۠ۘۘ۟ۨۦۦ۬ۖۘۘۢۚ۬۠ۤ۠ۘۧۖ۟ۨۚۛۤۢۘۨۘۛۙۙۦۙۙ۫ۚۢۧۨۡۘ۫ۦۨۖۙۙۖۖۥۘۦ۠ۖۘ۫ۜۡۘۤۨۡۘ۬ۖۡۛ۬ۖۥۧۙۨۚۘۡۘۡۙۡۜۘۥۥۨۘ۠ۗۖ";
                    continue;
                case -1076419194:
                    String str2 = "ۖۡۧۘۗۛۤ۟ۙ۫ۙ۫۫ۙۚ۬۫ۦۙ۟ۜۜۥۢۜ۫ۛۡۨۜۥۥۚۤۧۖۚۖۦۘ۠ۘۗۚۥۤ۠۟ۗۚۡۧۘۡۦۜۘۤۜ۫۫ۘۗۧۧۘۘۥۡ۟ۗۜ۠۬ۨۧ۫۫ۡۗۤ۬ۥۦۛۤۨۥ۠ۘۦۘۢۜۨۘۥۤۦۘ۠ۧۥۘۗۤۨۢۖۡۡۙۨۘ";
                    while (true) {
                        switch (str2.hashCode() ^ (-1208328789)) {
                            case -2020638085:
                                str = "ۗۗۖۡۛۘۘۗۚ۠ۙۢۖۘۥۦۨۢ۟ۧ۟ۥۢۤ۟۟ۤۤۤ۟ۜۘۛۨۗ۫۠ۖۥۙۛۡۙۖۘۘۛۖ۬ۥۖۘۖۖۗ۟۠ۤۖۦۤ۠ۥۚۤۜۘۙ۠ۡۧۜۡۨ۬ۡۨۥۦۘ";
                                continue;
                                continue;
                            case -1884711333:
                                String str3 = "ۚ۬۫ۗۗۧۦۥ۬۫ۙۘۙۧۨۘۜۗ۫ۡۛۨۘۜۚۜۜۡۜۘ۫ۢۥۤۥۘۡۚ۠ۡۘۙۚۜۡۘۚ۬ۘۦۗۤۜۖۨۘۚ۟ۨ۠ۦۜۘ۫ۗۖ۬ۥۦۦۘۜۘۢ۟ۨ۟ۧۚ۟ۡ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-177854229)) {
                                        case -1733759766:
                                            str2 = "ۜۖۦۛۙۘۜۖۡۤ۟۠ۜۡۜۘۛۚۨۨۤۚۥۘۦۦۗۡۘۛۢۡۛۧۖۨۚ۬ۚ۠ۡۖۖۚ۬۬ۚۧ۠ۚۤ۬ۚۢۧۥۧۘ۟ۜۡۥۘۥۥۨۢۥۘ۫۫ۘۘ۬ۨۧۘۡۦ۫ۧۤۜۢۦۧۘۨۢۗۥۤۙۥۜۖۙ۬ۡۥۢۘۘۤۘۘۘۤ۫ۜۘۛ۫ۜۚۛۥۘۦۧۡ۠ۜۨۘۗۙۢۨۦۙ";
                                            break;
                                        case -1504796938:
                                            String str4 = "ۨۙۡۘۙۜ۟۠ۗ۫ۦۗ۟ۘۢۙ۫ۥۘۨۢۧۗۛ۬ۙ۠ۚۡ۫ۡۚۙۦۖۘۢ۠ۘۘۘۗۚۨۚۨۖۘۗ۫ۧۢ۠ۨۘۡۜۨۙۖۗۤۛۛۨۨ۟ۥۤۦۘۨۨۜۘۘۡۦۘ۟ۡۧۜۖۥۘۨۥۜۘ۠ۗۤۘ۟ۘۡۘۚ";
                                            while (true) {
                                                switch (str4.hashCode() ^ 1854138604) {
                                                    case -1838651830:
                                                        str3 = "ۗ۟ۧۦ۠ۜۘۨۗۖۘ۬ۡۖۘ۫ۛۗۡۢۚۙۗۙ۟ۢۖۦۙۖۘۤۡۚۡۘۛۥۨۡۧۤۦۥۡۛ۬ۥۚ۫ۦۨ۫۠ۡۘۘۜ۬۬ۖ۬۬ۥۡۥۢۜۜۘۧۙۢۖۨۨ۫۬ۦۘۜۙۨۘۢۤۤۧۧۨ۟ۥۖۗۡۙ";
                                                        break;
                                                    case -748543855:
                                                        String str5 = "ۚۘۥۘۜ۫ۨۨ۬۟ۢۦۚۗۖۜۘ۠ۙۡۥ۬ۦۨۜۙۙۛ۬ۘۢۖۘۙۘۜ۟۠ۡۘ۠ۡۤۦۨۥۢۜۥۖۤۖۘۛۦۗۦ۫ۦۘۖۘۚ۠۠ۖۘۥۛۚۦ۠ۡۘۙۗۨ۫ۢۗ۬۟ۘۘ";
                                                        while (true) {
                                                            switch (str5.hashCode() ^ (-627876952)) {
                                                                case -1839683289:
                                                                    str4 = "ۛۧ۫ۖۨۘ۬ۙۚۢۡۖۘۦۨۛ۫ۥ۬ۚۚۙۥۖۤ۫ۙۚ۟ۦ۫ۧۗۗۡۜۜۘ۫ۥۢ۟ۢۖۘۖۢۜۘۢ۠۠۫ۢۢ۬ۡۨۙۖ۠ۘۗۨۦۢۨۢۗۚۡۦۘ۟۬ۘۘۧۙۢۦۗۢۦۤۚ۫ۖۦۦۘۥۘۦ۫ۘۤۖۦۘۢۥۘۚۢۘۘ۬ۥ۠ۘۦ۠ۗۤۤۖ۫ۜۜۥۚۨۡۡ۟ۥۨۨۚ۟ۢۗۖ۬ۤ۠ۥۦۖ";
                                                                    break;
                                                                case 70479961:
                                                                    str5 = "ۜۗ۟ۖ۟ۥ۫ۜۥۘۦۡۛۛۜۧۜۥۦۘۙ۟ۦ۬ۙۜۧۚۖ۠ۨۦۦۦۡۘۤۥۘۘ۫ۧۦۧۜۨۨ۬ۖۜۨۢۛۛۙۗۦۛۘ۬ۘۛۜۘۡ۟۫ۚۖۨۙۙۜۘۜۨ۫ۦۗۛ";
                                                                case 821547376:
                                                                    str4 = "۟۫۬ۡۢۦۘۜ۬ۘ۟ۢۚۛۡ۫ۖۙۘۘۖۦۢۚ۬ۘۘ۬ۚۦۘۖۥ۟۠ۖ۬ۢۚۥۘۖ۟ۗۗۡۤۦۜۗ۠ۛ۫ۗۨۥ۬۟۬۫۬ۖۘۢۜۘۥ۫ۥۗۨ۬ۥ۠ۛۡ۠ۢۗ۬ۘۘ";
                                                                    break;
                                                                case 1574790771:
                                                                    String str6 = "ۚ۬ۥۘ۟ۨۜۘ۟ۙۨۥۤۨۘۥۨۘۘۙۨۢۤۜۥۘۚۚۘۘ۫ۘ۟ۡۙۘ۬ۙ۠ۢۚۥ۠ۢۘۡۘۚۚۨۘۖۛۜۜ۠۫ۜ۠ۗۖۗۚۥۙۜۤ۟ۡۘۜۦ۬ۧۧۙۦۚۢۨۛ۟۟ۧۦۨۥۗ۠ۖۘ۫ۦۘ۫ۖ۟";
                                                                    while (true) {
                                                                        switch (str6.hashCode() ^ (-135312541)) {
                                                                            case -824184232:
                                                                                str5 = "ۚۢ۬ۖ۠ۧۚۜۚ۫۠ۗۡۙۛۘۙۖۘۗۜۨۙۛۛۖۛۤۥۤ۬ۨۜۘ۫ۢۧۚۖۨۘۘ۟ۤ۠ۥۥۘۜ۠ۙۦۡۤۢۘ۬ۖۤۢۡۨ۟ۜۚۢۗۡۗۘ۬ۘۗۥ۟ۚۤۨۡۡۘ۠۠ۦ۟ۘۥۥۘۛۧۢۖۛۜۗ۠ۥۘۖ۬ۧۦۢۚۚۗ۫ۘۡۦۘۢۦۨۨ۬ۛۦۘۖۘۡۤۜۖ۫ۨۘ۟ۙۘۘۥۦۥۘۜۢۡۘۢۚۥ";
                                                                                break;
                                                                            case -506548686:
                                                                                str6 = "۟۬ۨۗۥ۫ۛۙۦ۬ۨ۬ۦۤۧۗۢۨ۬ۛۦۛۖۘۜۡۘۘۘۛۨۡۘ۬ۖۡۘۜۨۥۘۡۨ۬ۨۗۘۘۧۧۡۙۖۢۙۚۜ۬۟ۦۘۨ۫ۖۢ۠۟۟ۜ۫۠ۘۖۤۚۥۜۨۘۙۙ۫۟ۥۜ۟۠ۚۜۜۥۘۢۨۘۧۥۘۡۜۡ۠ۤۥۡ۠ۖۢۦۦۢۥۧۘۚۨۥۘۥ۫۠ۛۙۥۨۨ";
                                                                            case 179371896:
                                                                                str5 = "۟ۢ۟ۢۦۢ۠ۙۧ۠ۜۗ۠ۥۖ۫ۨۗۖ۫ۦۗۘۗۧۖۢۢۥۨۚۢۧۥۡۨۤۚۨۘۨۗۖۨ۫ۨۘ۟ۖۨۚۙۦۥۜۤۘۙۡۘۖ۟ۦۘۙ۟۫ۛۖۥۦۙۜۘۤۚۛۙ۠ۡ۫ۜۚۢۡۦۜۥۘۙۖۖۢۥۗ۠۠۠۟ۦۖۚۜ۟ۡۖ۬ۙ۟ۡۤ۬۬ۖۨ۬ۘۘۦ۫۫";
                                                                                break;
                                                                            case 1083931730:
                                                                                str6 = getSharedPreferences(Deobfuscator$$app.getString(-3440726351805243209L), 0).getBoolean(Deobfuscator$$app.getString(-3440726029682696009L), false) ? "۬ۥ۟ۛۗ۟ۦ۟ۜۨ۬ۖۘۥ۠ۦۘۛۢ۫ۗۨۧۘ۟۫ۙۤ۬۠ۢۤۘۘۜۨۜۗ۫ۘۜۜۥۢۗ۟ۚۚۜۘۘۨۧۚۚۡۧۡۗۜ۟ۙۛۦۖ۟ۤ۟ۧۦۗۢۦۘۘۛۧۤۥۤۢۛۚۖۘۢۢۗۥ۫ۚ۬ۧۧۜ۫ۙۛۗۛ۫ۗۢۡ۟ۢۛۜۜۖ۫ۖ" : "ۤۡۜۘ۬ۛۥۘۤ۠ۖۤ۟ۧۧۘۖۘۦۦۧۙۦۥۘ۫ۨۘۗۜۖ۟ۚۦۘۚۦۖۧۘۥۘۦۨۘۡۥۗۚ۬۠۫ۙۦۘ۟ۨۘۘۡ۠ۡۘۡۘۙۙۥۙۡ۠ۥۘۦۘۜۘ۠ۢۦۚۜۥۘ۟ۨ۠ۛۖۜۖۙ۠ۜۨۛۜۘۗۘۡۧۘۤۨۨۘۢۘ۬ۚ۟ۢۚۢۨۘۢۖۦۘۦ۫۠۫ۨۥۛۦۙۙ۫ۧ۟ۖ";
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case -692400589:
                                                        str3 = "ۙۗۦۧۢۦۨۥۧۘۛۛۜ۠ۡۛ۫ۧۥۜۛ۫ۙۤۡۘۨۦۘۘ۫ۤۡۘۛۙ۠ۨۗۖۘۧۤۖۘۧۨۨۛ۬ۥۗۜ۬ۖۜۥۦۖ۫ۤۥۙۘۗۥ۟۬ۜۘۨۤۘۚ۬۬۟ۧۖۚۙ";
                                                        break;
                                                    case 1807848268:
                                                        str4 = "۬ۡ۫۫ۚۚ۬ۥۚۛۥۙۡۦۘۘ۬ۘۖۘۘۘۥۨ۬ۖۘۗ۠ۢۡۚۡۛۨۘۨۧۥۚۜۘۘۡۛ۟ۧۨۤۧ۬ۖ۫ۜۜ۠۬۠ۡۘۗ۫۬ۧۢۢ۠ۤۥۘۦ۟ۜۘۤ۟ۨۚۡۦ";
                                                }
                                            }
                                            break;
                                        case 774608962:
                                            str2 = "ۘۗۖۗۨ۠ۛۦۚۥۜ۬ۥۖۡۥ۬ۚۧۢۘۘۡۢۖۘ۫ۜۨۛۜۚۗ۟ۥۘۧۗۜۚۨۥۘۗۥۖۘ۟ۙ۫ۜۢۢۖ۟ۤ۬ۖ۫ۦۘۛۘۜۘۤۥۘۖ۠ۥۡۖۘۘۚۨۘۥ۠ۙۜۖۚۧۙۘۘۤۡۦۘۡ۫ۢۨۥۦۖۢۗۛۨۘۡۜۨۢۜۡۘۥۡ۟ۦ۬۫۫ۜۧۘۤ۬۠ۖۗۜۘۙۛ۠";
                                            break;
                                        case 1453903001:
                                            str3 = "۠ۛۤۜۨۖۡۧۥۛ۟ۡۖۚ۫ۢۡۙۡۖۨۡۡ۟ۜۘۜۘۘۚۡۡۘۙۗۦۘۨۥ۬ۧۥۘۚۡۢۨ۟۬ۡۖۦۘۥۢۤۗۦۜۡۜۡ۬ۘۢۧۨۖۙۚ۫۬ۖۗۥۨۘۘ";
                                    }
                                }
                                break;
                            case 904696968:
                                str2 = "ۙۘۙۢۚۗۜ۠ۜۖۗ۟ۙۥ۫ۢ۬۟ۘۨۙۨ۫۟ۤۛۖۦۤۡۘ۬ۙ۫۫ۨۛ۬ۨۙۢۤ۟ۧۤ۟ۢ۟ۨۘ۟ۡ۬۫ۛۜۘۢۛۦۚۤۡۘۤۗۢۢۨۚۧۗۦۧۨۘ۫ۥۖۘ";
                            case 1084032514:
                                str = "ۙۤۦۙۗۙۙ۬ۖ۫ۖۙۨۥۗۜ۠ۛۗۘۧۘۖ۠ۦ۟ۚۖۜۨۤۡۗۖۘۘ۠ۜ۠ۡ۫۠ۙۢۥۡۙۛۤۥۘۤۗۘۗۨۖۘۚۛۜۘۖۧۘ۬ۤۥۛۧ۠ۦۤۜۛۨۘۤۙۡۘۛۢۡۦۜ۫ۤۜۤ۬ۥۜۨۗ۫۠ۧۥ۠۟ۥۥۗۙ۫۟ۙ۫ۛۧۧۤۘۤۨۢۘۙۦۧۖۢۨۘ";
                                continue;
                        }
                    }
                    break;
                case -1018779147:
                    loadAssets(Deobfuscator$$app.getString(-3440726381870014281L));
                    str = "ۡۜ۬۠ۗۡۗۖۛۤ۟ۥۘۤۡۜۘ۠ۜۖۘ۬ۡۜۦۛۘۘۛ۬ۦۘۖۨۧۘۙۗۜۘۧۢۡۖۖۡۘۧۤ۬ۘۙۖ۟ۢۖۛ۠ۦۘۜ۫ۨۘۙ۫ۜۘۗۜۜۘۧۨۚۡ۟۠ۨۤۥۙۙۧ۟ۜۘ";
                    continue;
                case -379663563:
                    return;
                case -127509300:
                    break;
                case -117778041:
                    String str7 = "ۗ۠ۤۧۨۘۚ۠۬ۥۧۘۘۤ۫۠ۜۡۚ۟ۗ۟۠ۧۖ۫ۘۧۜ۬ۧۗۘ۟ۚۘۗۛۛ۟ۤۤۗۘۚۥۘۘۖۦۘۡۨۡۘۘۚۥۘۧۨۢۘۘۤۚۛۥۧ۠ۨۘۤۜۜۘ۠ۚۖۥۢۡۡۖۜ۬ۢۤۛۗۗۛۥۗ۟۟ۡۢۨۤۛۚۗۚۡۙۧۤۗۦۡۙۚۨ۫ۗۖ۬ۗۧۥۘ۠ۜۘۘۨۡۘ۫۠ۚۨۨۖۜۛۨۘ۬ۛۥۘۦۙۡۘ";
                    while (true) {
                        switch (str7.hashCode() ^ 607272620) {
                            case -1935895148:
                                break;
                            case -536084522:
                                String str8 = "ۛۡۙ۬۠ۨۛۜ۫ۖۜۙۛۗ۬ۚۜۡۘۦۘۢۢ۠ۙۥ۬ۘۥ۬ۨۦ۬ۙۦۡۖۛ۬ۙۧۥۜۘۚۛۘۘۧۗۖۛۨۙۖ۟ۘۘۡۛۘۜۙۚۢۨۘۧ۟ۚۦ۠ۨۜ۬۠ۙۦ۬ۜۜ۫۫ۡۡۧۥۜۨۚۡۤۜۘۡۦۦۨ۟ۘۖۗۘۘۛۡۧ۫ۡۢ";
                                while (true) {
                                    switch (str8.hashCode() ^ (-1661075287)) {
                                        case -1944588819:
                                            str7 = "۟ۙۖۘۘۡ۟ۘۚۚۙۨۦۧۖۜۘۢۖۦ۟۟ۡۘۦۡ۟ۖۨۥۡۜۢۖۧۜۘۙۨۧۘۥۤۢۘۥۘ۬ۨۡۢۧۖۙ۟ۜۖۜۤۥۛ۫۠ۥۘۗۦۡ۟ۜۥ۠ۦ۟۬ۛ۫ۧ۠ۦۘۥ۫ۨۘۚۡۖ۫ۦۥ۠ۢۤۙۨۛۨۧۜۘۨۛۜۙۦۘۗۤۗۥۨۖۛۖۡۧ۫ۥۘۚۘۘۘۤ۟ۛۨ۫ۨ";
                                            break;
                                        case -888638400:
                                            str7 = "ۚۜۚۛۢۧۙ۫ۦۘۨۨ۬ۦ۠ۥۡ۠۠ۙۤۥۘۙۙۧ۬ۛۦۘۤ۫ۦ۟ۥۡۛۚۜۘۦۤۛ۫ۘۘ۬ۜۘۖۢۧۤۡۢۨ۟ۢۛۖۚ۟۠ۡۦ۬ۤۢۛۜۜۜۛۧ۬ۡۘ۠ۖۘۘۢۚۤۥۧۨۘ۟ۡۘۛۥۗ۫ۧۜۘ";
                                            break;
                                        case 1158338132:
                                            String str9 = "۟ۥۛۛۥۖۖۨۡۘۘ۬ۡۥ۠ۡ۫ۗۥۜۖۤۨۛۘۛۚۙۙۖۚۖۥۖۖۗۗ۟۠ۧ۠ۖۦۘۗۤۖۘۚۧۥۧۚۨۖۢ۠ۜۖۥۘۡۛۙ۬ۜۨۗۦۨۘۤ۫ۜۘ۬۟ۘ۠۠ۘۘۥۗ۫ۡ۫۠ۡۦۤ۠ۦ۟ۢ۬";
                                            while (true) {
                                                switch (str9.hashCode() ^ 1762024151) {
                                                    case -1986296071:
                                                        str8 = "ۗۧۗۨۨۡۘۘۢۢۚۥۤ۟۠ۘۘ۟۬۟ۦۙۛۗۘۖۘ۫ۦۧ۠ۖۖۘۤۢ۫ۧۖ۟۫ۦۙۧۗۢۜۚۘۘۤۘۖۢۗۤ۠ۙ۫ۜۨۡۘۘۥۖۥۡۧۚۦۚۨۘۙۢ۠ۜۘۧۨۘۘۥۘۦۘۦۡ۠ۜۜۡۗ۫ۙ۫۟ۤۙۨۛۧۥۘۦۖۖ۠ۗۖۚ۫ۧۧۨ۫ۡۤۘۘۥۛۡۖۥ۟ۧۧۚ۠ۥۛۤۢۦۖ۬ۡۘۨۖۦۘ۫ۙۘۘ";
                                                        break;
                                                    case -1014869910:
                                                        str9 = "ۜۖۦۘ۟۠ۚۗۦۧۘۢۤۢ۠ۚۖ۫ۖۙۡۘۘۘۧۥۛۦۗۙۖۥۜۘۗ۠۫ۜ۠ۖۘۜۧۨۡۖۚ۬ۙۗۗۙ۬۫ۚۙ۠ۨۚ۟ۡۛۙۡۜۘ۟ۗ۠ۦۡۖۘ۬ۥۤ۟ۖۘۧۛۜۘۛۤۡ۫ۡۖۘۘۡ۬ۛۖۡۛۨ۫ۛۛۙ۫ۙۘۗۢۥۦۧۡۘۥۖۡۗۖۛۜۧ۬ۜۘۜۘ۟ۥۚۜۖۘۦۥ۠ۨ۠۟ۢۙۗۙۛۥۗۧ";
                                                    case 1439433728:
                                                        String str10 = "ۥ۬ۤ۠۟ۖۖۥۘ۟ۛۖ۬ۜۧۘۨۡۜ۟۬ۦۖۖۘۛۨۧۙۗۖۛۢۤۜ۫ۗۢۚۜۘۛۢۤۖ۟ۘۚۥۘۘۖ۟ۚ۫ۥ۫۬ۥۢۗۛ۟ۘ۟۬ۨۡۚۗۨ۬۟ۢۜۘۧۤۛۦۙ۟۬ۨۧۗۘۖۢۢ۬ۗ۬ۢ۠ۜ۠ۛۘۘۡۗۚ۬۬ۡۢۥ۠ۧۘۧۙۧ۫ۦۖۡۘ۬ۗۨۘۧۖۗۛۛۢۖۨۜۖۦۨۗۢۖۘۧ۟ۥ";
                                                        while (true) {
                                                            switch (str10.hashCode() ^ (-206345729)) {
                                                                case -1681163031:
                                                                    str9 = "۠ۘۨۥۧۥۘۛۗۗۘۙۥۡۚۨۘۚۨ۟ۤ۟ۛ۬ۢۤۗۘۘ۟ۥۡۧۥۥۘۚۤ۬ۛۦۨۘۡ۟ۡۧۘۘۚۘۙۢۛۙۘۘۨۗۥۡۚۦۘ۠ۦ۟۫ۨۘۘۖۡۤۘۤۡۘۧۛ۠ۧۧ۠۟ۗۙۛۧۨ۬ۢ۠ۙۗۦۡۙۘ۫ۗ۟ۤ۫ۜۖۘۢ۠۟۠ۨۘ۠ۗۨۘۙۥ۫ۤ۫ۦۨۖ";
                                                                    break;
                                                                case -1561362876:
                                                                    String str11 = "ۖۥۖۘۡۖۧۘۗۦۧۘۡۙۦۢۚۨۦ۬ۜۘۧۥۖۘۚۛۘۘۧۤۗۦ۟۠ۡۖۚۨۡۥۦ۠۬ۦۗۢ۠۫ۤۗ۫۫۟ۘۘ۫۟۟۫ۨۘۙۥۧۘۗۤۨۘ۬ۙۛۥۤۘۘۙۥۗۨۥۢۜۦۜ۫ۚ۬ۛۦۨۘۥۜۜۙۨۗ";
                                                                    while (true) {
                                                                        switch (str11.hashCode() ^ (-993304479)) {
                                                                            case -1410371147:
                                                                                str11 = !isServiceRunning() ? "۬ۚۖۗۚۡۘۦۖۦۚ۟ۦۡۘۚ۟۬ۤۘۛۖ۠ۥۘۦ۫۟ۖۤۦۜۧۥۘۙۤۨۥ۬ۘۘۘۢ۟۠ۛۗۖۨۦۘۙۛۦۘۡۧۖۘۖ۟ۙۗۧۡۨۤۥۖ۟ۡۡ۟ۢۖۥۧ۬ۢ۫ۜۢۖۘۘۧۥۛۢۦۧۦۥۛۘ۠ۤۧۜۜۦۙۦ۫ۢۢ۫ۦ۟ۨۜۘۧۜۖۚ۠۫ۧۗۜ۬ۢ۠۟ۛۘ" : "ۧۧۨۗۗ۟ۙۙۨۘۥۚ۫ۛۙۗۘۨۦۥۗۤ۬ۡۜۡۙۧ۟ۘۖ۬ۛ۠ۡۙۜۘ۟ۗۛۛۛۘۘۛ۠۫۠ۤۗ۠ۥۦۘۧۗۨۘۚۢۜۥ۬ۡۥۥ۫ۡ۠ۨۘۜ۬ۤ۫ۘۦۢۦۜۘۗ۬ۤۖ۫ۡۘۚۖ۬ۡۢۙ۫ۜ۟";
                                                                            case -846024017:
                                                                                str11 = "ۤۙۦۘۙۜۘۚۢۜۤۛۤ۟ۧۥۧۥۤۘ۟ۜۘۢۙۛۗۥۙۥ۟ۖ۬ۧۘۖ۫ۢ۠۟ۦۖۦۥۘۥۛۡۘۦ۟ۧۘۤۜۦ۠ۡۤۥۨۥ۠ۢۗۤ۬ۘۘ۠ۗۧۨۖ۫ۤۤۘۘ";
                                                                            case 531770765:
                                                                                str10 = "۫۫۬ۡۗۛ۬ۖۘۗۡۛ۬ۗۦ۠ۜۖۗۛۙ۠ۜۙۚۥۨۙۚۜۘۜ۬ۙۗۖۦۘۙۥ۟ۧۢ۫ۥۤۨۖۨۦۘ۠ۙۖۘ۠ۤۘۘۢ۟ۥۘ۫ۤۧۨۦۜۨ۫ۘۘ۬ۢۢۛ۠ۚۥۡۤ۟ۖۧۘۗۘۘۦۧۙۧ۬۬ۢۖۗۥۨۘ۟۟ۨۖۡ۟ۚۚۢۛۙۜۘ۫ۢۢۖ۠ۘۘۚۘ۫ۥۨۗۦۧ۠";
                                                                                break;
                                                                            case 1334515762:
                                                                                str10 = "۬۠ۘۨۥۖۘ۟ۗۜۘۨۖ۬ۧ۫ۥۘۘۜۘۡۤۖۘۨۨۜ۬ۧۗ۟۟ۨۘ۟ۧۢۡۘۧۖۦۘۘ۫ۡۥۘۧۥۤۢۧۡۘۚۗۥۘ۫ۨۚ۫ۢۛۦۤۧۥۖۤۧۜۧۘ۠ۛۜ۬ۜۜۘۡۗۢۜۨۦۥۗۥۗۛ۠ۛ۫ۦۘۧۥ";
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 233591852:
                                                                    str10 = "۠ۢۜۘۨۡۥۚ۠ۢۡۢۡۗۦۥۘۡۢۡۗ۫ۖۘۥۜۦۘۗۨ۫ۛۜۘ۬ۧۜۘ۠ۘۗۖۙۙۘۥ۫ۗ۫ۤ۫ۥ۬ۦۦۡۘۦۤۢۗ۠ۜۘۢۥۗۤۗۜۘ۠ۖۦۘۨۨۥۘۘۧۜۘۢۧۜ";
                                                                case 689640842:
                                                                    str9 = "ۤۗۨۘۛۢۜ۠۬ۗۙۢۗ۬ۘۤۜۧۨۘ۬ۧۜۘۗۘۡ۬ۤۚۤۘۘۙۦ۫۠۬ۗ۠ۥۙۘۙۡۘۘۙۛۙۡۚۨۗۥۘۥۢ۬ۜۖۛۜۛ۠۬ۚۤۨۦۜۧۨۛ۫ۡۦۤۢۧ";
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 2096627775:
                                                        str8 = "ۘۙۤۖۖۦ۠ۢۥۛۥ۫ۜۘۛ۫ۜ۟ۨۜۨۚۡۥ۠ۜۘ۫ۨۨۘۡ۬ۖۙ۠ۡۚۘۦۘ۬۫ۦۘۡۤۚۢ۟۠ۨۡۖۖۛۧۛۤ۫ۥۡ۬ۗۥۥۘۥۜۡۘۚۘۦۘۖۢۡۘۦۛۛ۟ۜۖۦۘۡۘۨۜۥ۬ۙۨۜۜۘۤۡۡۗۛۖۘۦۘۘۖۚۖۘۡۖۘۘ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case 1636825265:
                                            str8 = "ۧ۠ۚۜ۬ۥۘۧۢۜۗۘۘۘۖۚۢۨۢۜۘۚۗۨۜۦۧۥۗۧ۫ۥۢۗۘۘۘۨ۬ۦۘۖ۠ۢۜۦ۬۟۠ۘ۟ۧۢ۟ۗۛۗۥۢ۬ۨۘ۫ۙۘۦ۠ۖۥۘۦۥۖۘۜۛ۬ۦۧ۠ۚ۠ۜۘۧۛۙۜ۟ۥۘۦۜ۠ۤۙۗۥۦۡۘۛۚۖۧۨۛۥۖۛ۫ۧۗۢۜۦۨ۠ۖۘۙۦۤۤۧۙ۠ۡۡۘ";
                                    }
                                }
                                break;
                            case 312942773:
                                str = "۠ۡۜۘۤۨۡۜۡۗۙۛۚۚ۬ۨۢۖ۫۬ۧۧۚ۬ۧۙۘۤۧۡۘۛۗۡۘۦۖۨۘۛۨۘۙۘۥۘۤۚۡۘۗۢۨۢۤۘۘۙۜۛ۫ۢۡۜ۬ۧۜۧۨۜۨۦۜ۬ۛ۠ۦۥۘۢۙۗ۫۬ۛۗۨۚ۬ۗۢۖۧۗۥۢ۠ۙ۫ۦۛۜۖۘ۠ۗۖۛۧۜ۠ۦۛۘۙۚ۬ۛۨۡۢۧۨۘۢۗۜ۠ۙۦۘ۟۬ۧۜ۠ۧ۠ۚ۟ۖۘۤ";
                                continue;
                            case 1480430349:
                                str7 = "ۡۛۜۘۤۖۥۘۛۥ۟۫ۥۥۤۡ۫ۤۧۦۘ۫ۚ۫ۢۚۙۢ۫ۙ۠ۜۘۡۚۥۜۗ۠ۡ۫ۤۘۘۘۛۘ۠ۚ۟ۖۡۡۥ۫ۡۘۚۗۖۘ۟ۗۗۜ۟ۖۘ۬ۜۥۘۖ۫ۙۡۙۦۘۚۦۨۡۜ۬ۘۨۗ۬۠ۙۚ۬۬ۨۢۘۘۧ۬ۦۘۚ۫ۥۘ۠ۖۖۨۘۘۘۨۡۖۙ۫۫ۡۜۚۦۨ۟ۖۛۖۨۥۥۚۛ۠ۗۖۘۦۖۘۢۖۜۘۖۥۜۘ";
                        }
                    }
                    break;
                case 331290871:
                    startService(new Intent(this, ToggleAim.class));
                    str = "۟۬ۨۘ۬ۡۡۖۡۘۘۗۤۥۗۤۧۢۖ۠ۡۥۢۚۘۨۘۦۧۡ۠ۨۨۘۚۨۥۘۦۜۘۜ۠ۙۛۢۧ۟ۗۜ۠ۜۢۖۦۘۙۨۤۛۚۖۘۖ۬ۧۙۗۦۘ۠ۥۛۛۨۜ۠ۤۡۘۤ۟ۡۘ";
                    continue;
                case 566718745:
                    startService(new Intent(this, FloatService.class));
                    str = "ۤۨۜۘۖۥۛ۟۬ۖۘۡ۟ۘۚۛۡۘۗۗۥۦۜۙۡۤ۫ۧۦ۬ۦ۟ۘۘۨۚۦ۫۬۠۟ۚ۬ۙ۫ۛۜۦۧۘۤ۬ۡۘۗۚۙۧ۟ۜۢ۬ۡۦۤۜۘۚ۫ۚۙۧۘۘۤۖۙۜۛۖ۠ۤۚۦۘۦۘ۟ۜۥۖ۬ۘۡۧۦۘ۫ۦۚۘۢۚۘۦۘۨۥۘۛ۟ۥۘۢۜ۫ۗۚ۟ۜۡۨۙۘۘ۠ۛۚۨۨۡ";
                    continue;
                case 1100078085:
                    startService(new Intent(this, ToggleBullet.class));
                    str = "ۧ۠ۧۜ۫۟ۜۜۥۙۛ۟ۛ۫ۘۘۡ۠ۜۙۘۚۧۡ۬ۗۢۡۘ۟ۤۘۘۨ۟ۢۦۜۚۢۘۦۦۢۛۤۚ۬ۘۚۨۘۜۡ۠ۡۛۦۢۘۡۧۧۢ۬۟ۨۘۙۛ۬ۤۤۧ۟ۘۘۘۥۦ۠ۦۗ۠۠ۜۘ۟۫ۜ۬ۥۨۘۛۘۨ۬ۥۚۗۜ۠۬ۧۦۛۚۦۘ۟ۥۘ";
                    continue;
            }
            str = "۟۬ۨۘ۬ۡۡۖۡۘۘۗۤۥۗۤۧۢۖ۠ۡۥۢۚۘۨۘۦۧۡ۠ۨۨۘۚۨۥۘۦۜۘۜ۠ۙۛۢۧ۟ۗۜ۠ۜۢۖۦۘۙۨۤۛۚۖۘۖ۬ۧۙۗۦۘ۠ۥۛۛۨۜ۠ۤۡۘۤ۟ۡۘ";
        }
    }

    public void launchApk(String str) {
        String str2 = "ۡۙۘ۬ۥۚۘ۬ۡۛۦۤۚ۬ۢ۟ۡ۠ۘۖۛۖ۟ۨۜۙۜۘ۫۫ۛۧ۠ۚۗۗۗۦۢۜۘ۠ۛ۟ۗۧۡۘۚ۟۫ۥ۫ۜۘ۫ۘ۫ۘ۠ۜۘۤۘۗۢۙ۟ۦۜۦۘ۫ۜ۠ۙۛۦۘۡۥۖۙۦۖۖۙ۟ۘۗۖۥۙۜۨۛۡۘۢۡۥۘۘۖۘ۠ۥۜۘۚۥۘۛۚۥۢۡۦۘ۟ۙۚۛۘۘۚۤۙۨۚۢۙۡۢۥۗۨۘ۠ۧۦۤ۬۟ۨۖۖۘ";
        while (true) {
            switch (str2.hashCode() ^ 669946475) {
                case -1496365093:
                    Toast.makeText(this, getString(C0931R.string.str00c8), 0).show();
                    return;
                case 578889486:
                    try {
                        BlackBoxCore.get().launchApk(str, 0);
                        return;
                    } catch (Exception e) {
                        Toast.makeText(this, getString(C0931R.string.str0046), 0).show();
                        return;
                    }
                case 1006999106:
                    str2 = "۬ۖ۟ۧۡۡۜ۬۠ۡۖ۬۫ۖ۠۟ۘۘ۟ۨۢۘۡۚۜۛۜۘۜۗۢۖۦ۟ۖ۟ۗۢۥۧ۟ۗ۟ۗۛۨۜۤۙۖۛۜۡۢۨۚۨۤۜۖۘۦۦۜۘۡۢۧۨ۠ۤۢۙ۬۠ۗۗۛۥۦ۫۫ۨۙۚۜ۠ۚۜۘۙ۟ۖ";
                    break;
                case 1726238586:
                    String str3 = "ۢۤۤۡۥ۬ۘۘۨۜۘۦۡۧۦۘ۬ۚ۠ۦۦۢ۬ۗۘۤۙ۠ۡۖۢۡۖۗۜۡۦۘۙ۟ۛ۟ۡ۟ۚۦۦۙۚۥۦۜۡۧۖۤۤۜۡۘۛۜۥۡۨۦۦۖۘۘۚۜۦ۬ۜۘۛۢۡۘۨۖۖۡۖۦۘۧۡۚۚۧۡۘ۟۠ۡۘۘۖۘ۫۬ۗۢ۟۠ۨۡۧۘۘۘ";
                    while (true) {
                        switch (str3.hashCode() ^ 576661918) {
                            case -626094449:
                                str3 = "ۨۖۥۘۖۘۘۧۘ۬ۥ۟۬ۢۢۧۧۘۘ۟ۚۗۘۢۗ۬ۥۚۧۧۦۛۙۤۨ۬ۘۛۡۘۙۜۥ۟ۖۤۨۧۚ۫۬ۜۛۙ۟ۥۙۖۘ۠ۘۧۖ۟ۘۘۗۡۖۘۛ۫ۦۘ۬ۚۘۘۘۥ";
                            case 301315528:
                                str2 = "ۜۥۘۘ۬ۢۥۢۖۨۘۘۥۦۡۦۦۥ۬ۜۘۥۘۙۧۖۗۥۘۡۘ۬ۚۤۤۛۢۚۖۘ۟ۧۦۘۦۡۡۘۛۧۡۘۘۘۡۛۥۘۡ۠۬ۡۗۦۘۖۦۧۘۨۡۢۧۢ۟۠ۥ۬ۢۗۘۘ۟ۦۧۘۛ۟۠ۘۧۤۦ۟ۘۘ۬ۜۢۨ۟ۖۘۚ۫ۜۢ۟ۖۘۗۗ۫ۢۚۛۧۖۨۘۢۛ۫ۢۛۜ۟ۦۖۤۙۘ۟ۨ۠";
                                continue;
                            case 590400684:
                                String str4 = "۫ۛۛۢۢۗۘۘۨۧ۠ۥۘۗ۠ۚ۬ۤ۟۫۬ۨۘ۬ۙ۟ۖۛۘ۠ۗۡۛۤ۫۟ۘۙۨۡۦۧۙۚ۫ۘ۟۫۬۫ۛۥۡۗۤۖۥۚ۬۟ۗ۠ۚ۟ۨۘۘۨ۟ۤۜۚۡۘ۬ۛۛ۫۫ۗۧۗۦۘۘ۫ۧۖۥ۠ۨ۬۬۫ۢۦۘۧۗ۫ۘۨ۫ۦۤۨۤ۫ۦۘۨۚۘۘۖۨۘۢۨۨۘۗۚۜۜۦۦۘ";
                                while (true) {
                                    switch (str4.hashCode() ^ 1087999275) {
                                        case -1396960769:
                                            String str5 = "ۨۚۤ۫ۛۘ۠ۘۧ۠ۖ۟۫ۛۙۛ۫ۡ۬ۥۘۘ۟ۚۛ۫ۨۘۢۡۨۜۦۘ۠ۘۗۨۘۜۡۗۦۘ۫۫ۦ۫ۜۘۡۜۖۘ۟ۦ۠ۥۗۤۛۗ۟ۦۖۘۙ۫ۦۘۤۛۥۦ۫ۖۥۨۧ۟ۤۡ۫ۨۦۘۤۢۘۦۨۖۢۨۦ";
                                            while (true) {
                                                switch (str5.hashCode() ^ 1879898252) {
                                                    case -272844874:
                                                        str5 = "ۧۙۛۨۖۨۖ۟ۚ۫ۗۖۢۙۦۚۢۘۥۤۗ۫ۥۦۦۗۛ۬ۖۡۘۨۜۖۖ۟ۖۘۧۖۥۘۖۙۜۖۦۘۘ۫۠ۚۚۨۧۙۢۢۢۤۡۤ۟ۡۗۤۗۖۗۥۧۛۘۛۚ۠ۚۛ۫۠ۜۙۦۥۘۦۨۚۘ۫ۘۘۥۧۗ";
                                                    case -253401862:
                                                        String str6 = "ۨۖ۬ۗۤ۟۬ۢۥۨۛۡ۫۬ۦۘۦۧۛ۠۬ۤ۟ۢۥۖۙۖۘۥۡۚۘۘۥۨۚ۬ۘۘۘۚ۫ۨۘۛۤۡۘۖۨۦۜ۫ۖۘ۠ۖ۟ۢۥۡ۟۠ۦۛۛ۠ۖۘ۠ۨۡۦۦۦۘ۟۬ۢۦۢۛ۫ۛۘۘۧۖۖ۫ۨۜۙۦۨۘ۠ۡۚۢۖۧۜۧۘۘۙۜۡۖۖۖ";
                                                        while (true) {
                                                            switch (str6.hashCode() ^ (-347018840)) {
                                                                case -228168287:
                                                                    str6 = !isInstalled(str) ? "۠ۦۖۘۖۚ۠ۢ۠ۚ۠۬ۚۘۗۨۤۤ۬۠ۧۢ۫ۖۡۘ۫ۤ۬ۙۧۧۚ۟ۜ۠ۥۘۜۦۜۙۖۖۘۨۤۙۨۘۖۨ۠ۥۥۤ۫۠ۘۤۘۢۤۧ۟۟ۚۜۘۥۤۡۗۢ۟۬ۖۧۘۧۦۥۧ۠ۖۜۘۧۗۡۦۛۙ۠ۢۜۜۘۛۧ۠ۘۡۘ۬ۘ۟ۥۧۥ۬ۚۧۛ۟ۥۨۛۜۘۨ۠ۜۖۡۦۘ" : "ۡۘۡۖۜۤۚۖ۬۟ۡۧۖۘۚ۫ۡۦۖۚۘۛۡۘۘۛۖ۫ۜۧۘۘۥ۫ۛۘۦۜۤۢ۟ۗۧۦۘ۠ۗۤۗ۠ۡۘۡۦۢۜۖۧ۫ۛۤۥۙۨۘۨۧۥۘ۠ۧۜ۠ۧۡۘۨۡۤ۬ۥ۬ۥۘۜۘۘۥۘۖۜۙۧۡۥۘۥ۫ۦۘۖۜۘۘۘۥۦۡۥۨۧۤۘۘۢ۬ۨۘ";
                                                                case -207963916:
                                                                    str6 = "۬۟ۙۜ۟ۦۗۙۡۜۦۧ۫ۨۘۦۤۦۨۡۢ۟ۢۨۘۤۘ۠ۗۧۥۧۨۘ۫ۛ۟۫ۚۜۙۢۖۜۖۢۥۜۘۘۗ۫ۥۘۤۥۖۘۘۖۛۡۤۙۖ۫ۘ۬۬ۡۥۨۖۨ۠ۛۧ۟ۨۡ۠۬ۧۚۜۦۤ۬ۖۙۘۛۨۖۘۦۘۡۚ۫ۖۧۡۘۚۖۥ";
                                                                case 510468320:
                                                                    str5 = "ۚۘۛۘۧۗۦ۬ۨۦ۬ۢۛ۬ۘۡ۫۬ۖ۬ۡۛ۠ۚۚۨۥۜۗۘۤۡۡۧۡۡۘ۬۠ۧۧ۠ۥۡۛۚۦۡۨ۠ۦۘۘۥ۫ۘۘۘۚۘۥۤۚۙ۠ۛ۬ۨۤۖ۬ۖۘۜۨۜۘۛۚۘ۬۟ۨۘ۬ۦۚۖۙۨۗۧۜۘۘ۬ۘۥۤ۠۠ۖۛۦۥ۬ۜۜ۟ۗ";
                                                                    break;
                                                                case 866707362:
                                                                    str5 = "ۧۤ۟ۛۢۚۙۜۖۘۘۦۘۗ۬ۘۘ۠۠۫ۢۗۨۘۚ۠ۤۥۥۘۘۤۚۚۗۜۥۨ۫ۧ۟ۘۘ۠ۧۧۘۤ۫ۗۛۖۘۖۢۘ۫ۙۛۢۥۥۘ۬ۘۧۦۥ۠ۜۜۦۢۛۦۘۧ۠ۧ۟ۡۗۚۦۜۜۢۖۘ۠۠ۡۧۡۨ۠ۘۤ";
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 1093686943:
                                                        str4 = "ۦۥۘۢۡۧۘۤۛۦۘۤۦۥۘۖۙۡۛۡۧۘۥ۠ۧ۫ۥ۬ۧۜۨۜ۠ۛۡۢ۬ۘۙۨۡۢۥۘۙۡۢۡۥۖۘ۬ۜۙ۟ۖ۬۠ۗۚۚۧۛ۫ۘۜۘ۟۫ۘۘۡۜۦۘۙۙۘۘ۟ۥ۫۠ۥۜۘۜ۬ۖۛۙۡۘۤۘۜ۬ۙۗۧ۟ۚ";
                                                        break;
                                                    case 2051796483:
                                                        str4 = "ۘۥۤۢۨۘۘۖۡۤۙ۬ۧۢۙۖۥۜۘۚۖۡۘۢۥۦۘ۠ۢۧۡۡ۠۠ۨۨۘۗ۬ۙۗ۬ۛ۟۟ۧۦۗۜۢۖۚۙۦۤۛ۟ۜۘۖۙۘۘۖۦۘۜۨۜ۟ۛ۠۠۟ۙۦۥۨۤۨ۬ۘۜۘۥۙۥۘۤ۠ۨۦۨ۫ۛۖ۫ۥۦۡۘ۬ۥۙۗ۬ۙۦ۟ۚۚۧ۬ۢۦۜ۠ۡۚۨۡۗۜۗۤۢۜۥۡۥۤ۠۟ۥۘۤۛ۠ۤۚۘۗۤۘ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case -1109776192:
                                            str3 = "ۙۨۦۘ۠ۨۢ۬ۘ۬ۛۢۧۤۧ۬۬ۗۨ۟ۢۘۢۘۧ۠ۦۗۡۖۘ۟ۦۧۚۨۗ۬ۖ۟ۙۢۖۘ۟ۢۘۘۦۜ۟ۧۡۖۘ۫ۖ۬۫ۤۦۨ۠۫ۤۨۘۘۛ۫ۜۦ۟ۘۘۦۤ۬ۤ۫ۦ";
                                            break;
                                        case -271950838:
                                            str3 = "ۘ۬ۦۘۚ۠۠ۛ۬۠ۛ۟ۤۘۡۙۗۦۥ۟۫ۧ۬ۖ۟ۧۡۛۖۢۤۖۖۨ۟ۙۘۨۡ۫ۗ۠ۗ۫ۤۡۖۡۜۘۙۥۨ۬ۧۜۘۛ۫۟ۧۨۖۘۛ۟ۘۗۖۢۜ۫۫ۦۦۙۜۢۨ";
                                            break;
                                        case 1129235377:
                                            str4 = "ۥۨ۬ۗۦۨۘۥ۠ۜۧۗۖۛۛۥۘۦۢۛ۠ۙۘۘۚۜۡۡۥۘۘۜ۬ۢۜۛۙ۠ۙۥ۫۠ۙۗۗۘۙۥۗۡۚۛۨۜۧۤۖۚ۬ۜۦۧۧ۫ۦۢۖۤۧۛۧۧۜۘۗۜۢۡۘۡۘۨۗ۬ۙۡۘۘۤۡۡۘۜۖۡۘۧۨۘ۫ۗۥۧۙۚۨۤۖۘۧۦۤۚۦۚۚ۟ۦۛ۫۠ۙ۬۟ۡۧۖۘۤۖۜ";
                                    }
                                }
                                break;
                            case 1336628041:
                                str2 = "ۤۡۖۘۗۥۖۧ۟ۢۛۙۖۘۖۥۜۘۘۘۨۚۗۡۤۨۜۨۨ۬ۖۤۥۜ۟ۡۦۗۦۢۗۘ۬۠ۦۘ۬ۛۘۙۨۙۗۛۜۡۘۘۤ۟ۚ۬ۜۦۘۦ۫ۖۖ۟ۢۗۛۜۘ۬ۖۜۥۘۛۤۛۨۘۜۡۖۥۘۦۘ۟ۡۜ";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    public void launchbypassNoRootgl() {
        String str = "ۖۡۦۘۡۦۚۡۡ۬ۨۚۥۘۙۚ۫ۧۢۨۨۧۙۡۜۘۜۧۦ۠ۘۥۘۚۦۡۘۨ۟۟ۦۡۘۡۢۘۡۡۛۡۡۜۘۨۤۦۘۦۥۤ۟ۡ۬ۛۛۤۚۙۢۘ۠ۧۧۨۖ۬ۨۗۡۘۤ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 119) ^ 105) ^ MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION) ^ 267) ^ 294) ^ 29) ^ 600) ^ 642) ^ 887) ^ 697) ^ 252) ^ 69) ^ 651) ^ 580) ^ 603) ^ 986) ^ 738) ^ 183) ^ 273) ^ 713) ^ 242) ^ 178) ^ 814) ^ 14) ^ 953) ^ 769) ^ 829) ^ 695) ^ 141) ^ 905) ^ 79) ^ (-1235394283)) {
                case -1454690921:
                    runBypassCmd(getString(C0931R.string.str00e0));
                    str = "ۧۚۧ۬ۙۡۖۘۚۤۙ۫ۖۘۜۙۢۡۨۨۜۙۘۖۘۢۨ۫ۖۙۛۡۦۘۚۡۥۗۦ۠ۡۙۨۤۘۥۘ۬ۗۙۧۥۜ۫ۦۨۘۚۛۖۘ۟ۥۧۘۡۜۦۖۖ۟ۡۦ۠ۘۨ۬ۨۤۨۘۥۗۛۘۤۗۨۢۨۘۛۧۧۨ۫ۛۦ۟ۡۘۘۙۜۖۨۘ۬۫ۥۘۗۘ۫";
                    break;
                case -1260965159:
                    str = "۠ۤۚۡۧۥ۟۟ۛۥۜ۟ۦۥۧۘ۠ۨۜۦۜۥۨ۬۠۠ۢۛ۬۫ۤۦۘۘۛۡۨۦ۫ۖۘۨۚۚۧۧۛۦۗۖۘ۠ۘۘۨۢۙۛ۬ۖۢۚۙۥۥۤۘۥۘۦۥ۫ۦۖۛۨۘۘ";
                    break;
                case 662557529:
                    return;
            }
        }
    }

    public void launchbypassNoRootin() {
        String str = "۬۠ۖۢ۫ۖۥۨۘ۫۟ۘۖۛۨۘۘۧۦۥۘ۬۟۫۟۬ۧۗۙۚۘۜۖۘ۟ۘۥۗۜۙ۠ۧۘۗۢ۠ۨ۬۠ۢۘۧۘۜۚۜۤۗۚۢۨۜۘۦۦۢۜۡۨ۠ۥۜۘ۠۠ۢۛۖۧ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 700) ^ 902) ^ 173) ^ 546) ^ 379) ^ 431) ^ 822) ^ 913) ^ 905) ^ 536) ^ 87) ^ 731) ^ 412) ^ 407) ^ MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION) ^ 448) ^ 254) ^ 442) ^ 473) ^ 211) ^ 582) ^ 143) ^ 759) ^ 72) ^ 845) ^ 798) ^ 6) ^ 242) ^ 424) ^ 766) ^ 41) ^ 78109498) {
                case -2028990526:
                    runBypassCmd(getString(C0931R.string.str00e0));
                    str = "ۚ۟ۜۘ۫ۦۜۘۖ۠ۧۤۨۗۢۨۘۜۛۚۡۨۜ۟ۤۜۘۧۜۤۢ۟ۛۜۧۖ۫۫ۨۘۚ۫ۘۚۢۦۙۨۘۤۨۘ۠ۛۜۙۛۙۧۢۡ۟ۘۘ۟۟ۜ۬ۨۙ۠ۧۖۘۦ۬ۢ۫ۦۖۚۨۚۛ۬ۘۛ۟ۧۢۤۙۡۧۖۧ۬ۛۨۘ۬ۗۜ۠ۥ۠ۜۘۡۖۖۛ۬ۥ۫ۤۜۘۢۘۖۘۛ۟ۜۘ";
                    break;
                case -373300661:
                    str = "ۥ۫ۙ۟ۙۨۘۙۚۡۡۗۥ۫ۘۥۙۚ۠ۧۥۧۨۙۛۚۡۘۜۛۧ۫ۖ۬۬ۢۨۘۚۥ۠۟ۦۥۦۧۦۙۡۧۖۙۨۥ۟ۨ۠ۢۡۘۖۖ۬ۡۛ۠۟۫ۜۨ۠ۗۥۗۧۤۦۡۖ۠۬۬ۜۙۨۜۘۙۘۤۨ۠۫ۤۦۜۢ۠ۢۦۡ۬ۗۖۘۥۜ۠۠ۦۛۛۖۙۤۨۘۛۦۡۧ۟ۧ";
                    break;
                case 1140038260:
                    return;
            }
        }
    }

    public void launchbypassNoRootkr() {
        String str = "۟۫ۥ۬ۡۚۛۖۚۗ۫ۗ۠ۛ۬ۚۛۛۜۘ۟۠ۥۘ۬ۖۡۘۗۘۤ۬ۨۚۜۥ۟ۘۥۜۜۖ۫ۦۖۖۘۤۦ۠ۗۚۛۢۡۜۥۦۤۦۤۨۤۛۖ۫ۜۘۘۚۙۘۖۧۤۧۙۨۘۧۤۦۚ۠ۥۘۦۚۜۗۜۧۘۘ۫";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 214) ^ 123) ^ 105) ^ 297) ^ 410) ^ 716) ^ 926) ^ 955) ^ 169) ^ 645) ^ 568) ^ 883) ^ 839) ^ 587) ^ 769) ^ 233) ^ 437) ^ 272) ^ 579) ^ 101) ^ 751) ^ 957) ^ 544) ^ 754) ^ 683) ^ 692) ^ 996) ^ 496) ^ 543) ^ 177) ^ 824) ^ (-1102442225)) {
                case -1778509190:
                    str = "ۦۥۙۦۥۤۛۗۨ۫ۤۤ۬ۡۥۦۦۧۗۘۜۛۘۨۖۖۛۤۧۜۜۘۙۡۙۡۘۚۥ۟ۗۛۚۖۖۛۤۧۖۘۧۖۜۘ۟ۦۦۘۜۦ۠ۦۚۛ۫ۘۨ۟ۥۖۘۦۜۘۦۨۨۘۖۛۡۘۧ۬۫۫ۙ۫ۗۛۛ۟۫ۢۦۦۜۘۚۖۥۙۙۨۘ۠۟ۜۢۚۤۖۨۚۙۧۨۧ۫ۜۘۦۥۢۧۖ۟ۡۜۘ۠ۛۚ۫ۦ۬۬ۘۘۜۧۜۗۢ";
                    break;
                case -187544270:
                    return;
                case 972178369:
                    runBypassCmd(getString(C0931R.string.str00e0));
                    str = "ۛۜۤۗۢۘۖ۫ۗۜۘۛ۫۬ۛۘۦۨۘۖۖۖۡۤ۟۟ۥۛۨۖۗۚۜۙۜۤ۬ۛۨۡۘۤ۫ۥۙۢۗ۬۬ۤۜۧۘۨ۫ۧ۫۬ۦۘۙۢۦۘۚۡۢۖۤۤۗۤۥۘ۟ۗۤ۟ۡۡۘ۫ۘۡۦۛۥ۬۠ۖۘ۠ۚۢۛۡۛۧۤ۬۠ۧۡۘۖۘۧۘۜ۫ۜۘۙ۠ۨۦ۬ۖۧۦۚ۫ۥۖۥۛۜۢۧۚ";
                    break;
            }
        }
    }

    public void launchbypassNoRoottw() {
        String str = "ۜۤ۠ۙۘۙۡۧۜۘۛۢۜۘۛۧۨۥۜۡۘۖۖۥۜۢۖۘۤ۫ۘ۬ۢۥۘۗۖ۠ۤۢ۟ۜ۟ۖۘۨۖۦۘ۠ۢۖۘۦۖۘۙ۫ۜۘۢۨۘۧ۠ۘۘۢۗۘۘۖ۬ۘۥۨۨۛ۬ۨۘۨۘۨۘۖۧۛ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 123) ^ 718) ^ 311) ^ 364) ^ 993) ^ 805) ^ 209) ^ 934) ^ 111) ^ 998) ^ 596) ^ 153) ^ 745) ^ 687) ^ 359) ^ 818) ^ 325) ^ 840) ^ 114) ^ 724) ^ 780) ^ 894) ^ 388) ^ 88) ^ 953) ^ 228) ^ 233) ^ 413) ^ 729) ^ 622) ^ 894) ^ 567032530) {
                case -1447081706:
                    runBypassCmd(getString(C0931R.string.str00e0));
                    str = "ۥ۟ۘۘۜۙۨۘۧۢۖۘۡ۟ۘۙۛۚۜ۬ۢۦۘ۫ۤۡۗۘۗۜۙۜۡۛۙۛۛۢۖۖ۫ۙۧۡ۬ۛۡۘ۫ۘۚۛۚ۫۫۫ۨۘۘۚۙۜۙۚۛ۟ۢۗ۫ۙۚۗ۠ۤۨۘۘۨۢ";
                    break;
                case -626451234:
                    str = "ۧۨۦ۠۟ۢۜ۫ۧ۟ۢۘۘۙۡ۟ۢۨۘ۫ۜۛۚ۠ۥۙ۠۫ۨۡ۫ۗۚۘۘۨ۬۬ۧۗ۠ۨ۬ۘۨۜ۟ۦۜ۫۬ۨۗۨۜۜۨۢۗۡۨۦۚۧۤۚۡ۫ۦ۬ۥ۟۟۫ۤۥۘۛۢۨۘۙۨۢۥۜۧ۬ۚۧۦۛۢۜۖ۫ۛۢۤۘۦۖۛ۬ۨۨۘ۬ۛ۟۬۬ۗۗۡۘۨۛۡۘ۬۬ۜۘ۟۟ۥۘۜۤۛۥ۠ۜۨۛۥۘ۬ۜۧۘ";
                    break;
                case -6597096:
                    return;
            }
        }
    }

    public void launchbypassNoRootvn() {
        String str = "ۜۦۨۘۢ۬ۢۦۚۦۗۧۚ۠۠ۜۧۢۧۙۛۘۘ۫ۘۢۢۤ۠۫ۜۧۦۘۧۘۜۛۗۢۖۘۗۥۧۘ۟ۨۥۤۗۜۘۦۡۜۗۧ۟۠۠ۨۘۜۚۦۘۨۙۤ۟ۥۘۧ۟ۦۧۨۡ۠ۜۘۘۖ۫ۥۥۗ۫۟ۨۙۨۙۤۢ۟ۢۖۘۘۘۦۖۧۘۜۨۦۨۨۙ۬۠ۛ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 186) ^ 114) ^ 202) ^ 56) ^ 536) ^ 605) ^ 686) ^ 715) ^ 739) ^ 11) ^ 420) ^ 537) ^ 605) ^ 8) ^ 23) ^ 68) ^ 226) ^ 109) ^ 569) ^ 951) ^ 439) ^ 347) ^ 959) ^ 486) ^ 32) ^ 110) ^ 841) ^ 925) ^ 482) ^ PointerIconCompat.TYPE_NO_DROP) ^ 757) ^ 1793117048) {
                case -2012666348:
                    runBypassCmd(getString(C0931R.string.str00e0));
                    str = "ۛ۟ۦۘۨۨۤۦۖۦۘ۠ۢۥۢۗۤۗۚۚۛ۫ۦۖۢۨۘ۬ۗۚ۠ۨۖۘۗ۟ۦۢۧ۬۬ۘۖۨۥۘ۫ۜۘۘۘۖۖۨۡ۬۠۫ۨۘۦۦۦۘۗۘۦۘۖۙۥ۫ۛۤۧۙۨۘۦ۫ۨۘۛ۟ۙ۠۫ۨۖۜۜۦۡۡۙۗۛۤۖۢۖۛ۠ۧۗۥۚ۟۬۟ۜۛۚ۬ۘۘ۟ۧۜۚ۟ۥۘۧۡ۠ۡ۠ۦۘۡۡۙۗۙۗۦۖۤۖۥۙۜ۠ۦۘ۟ۨۦ";
                    break;
                case 1724129431:
                    return;
                case 1758167139:
                    str = "ۙۥۙۘۡ۬ۗۚۨۘۧۘۨۘۖۙۘۨۧۡۨۖۘۘۚ۠۠ۜ۟ۖۛۖۘ۠۟ۖۘۢۢۜۘۨۗۨۖۙۨۘ۠ۛ۠ۛۦۢۖ۫ۥ۬ۜۡۘۗۡۧۘۘ۫ۘۗۡۡۖۤۨ۫ۜۘۧۛ۟ۙۢۡۤ۠ۙۧ۫ۤۙۥۥ۟ۧۗ۟ۦۘۛ۬ۦۛۛۜۘ۠ۥۙۘۢ۠۠ۡۨۘ";
                    break;
            }
        }
    }

    public void loadAssets(String str) {
        String str2 = getFilesDir().toString() + Deobfuscator$$app.getString(-3440726940215762761L) + str;
        daemonPath = str2;
        socket = str2;
        try {
            Runtime.getRuntime().exec(Deobfuscator$$app.getString(-3440726931625828169L) + daemonPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        String str = "ۖۨۥ۟ۨۤۚ۟ۚۛۗ۟۫ۨ۬ۢۨۥۘۨۡۧۘۜۨۦۘ۬۠ۧۘۛۡۗۗۚۘۨۚۖۘۗۦۘۨۘۖۦۘۨۢۥۘۢۦۖۘۖ۫ۡۘۜۡۧۗ۬ۨۘۛ۠ۛۚ۟ۗۦۤۘۘ۟ۡۧۢۚۙ۬ۥۥۗۘۘۢۖۥ۬ۡۧۘۗۦۥۘ۫ۨۙۛۤۚ۟ۛۜۘۥۗۗۧۛۢ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 116) ^ 208) ^ 241) ^ 180) ^ 541) ^ 167) ^ 59) ^ 766) ^ 975) ^ 384) ^ 916) ^ 50) ^ 919) ^ 827) ^ 670) ^ 47) ^ 84) ^ 815) ^ 79) ^ 750) ^ 629) ^ 143) ^ 321) ^ 37) ^ 472) ^ 532) ^ 611) ^ 51) ^ 248) ^ 717) ^ 839) ^ (-844768804)) {
                case -487990345:
                    return;
                case 1386000:
                    str = "۫ۖۜۡ۟ۨۗۦۛۙۙۚۤ۫ۡۨۗۘۗ۫ۥۧۨۧۙۢۡۘ۬ۤۖۡ۫ۗۚۡۖۘۤۧۘۘۘۡۨۘ۬ۤۖۘۘۢۜۨۛۥۘ۬ۢۨۘۗۢۡۨ۟ۘۨۨۡۗۢۙۗۦۖۙۚ۬ۚۤۗ";
                    break;
                case 1320878287:
                    Toast.makeText(this, getString(C0931R.string.str0020), 0).show();
                    str = "ۖۨۦۦ۫ۦۨۤۡ۠ۤۖ۟ۢۘۦۘۖۨۖۜۘ۬ۦ۠ۨۤ۬ۛۨ۟ۨۛۧۥۜۧ۫ۢۨ۠ۘ۫ۘۜۘۦۨۦۢۖۘ۬ۡۚۘۡۖۧۢۡۙۜۢۢ۫ۨۘۦۙۙۤۢۖۤۡۦۙۡۙۦۤۡۡۘۦۘ۠ۢۦۘۤ۬ۨۗۜۦۘۙۤۘ۬۠ۖۡۚۡۖۤ۠";
                    break;
                case 1622798000:
                    super.onBackPressed();
                    str = "ۡۡۡۧۗۘۗۜۧۘ۫۟ۥۘۜۡ۠ۤ۬ۚۛۛۡۘۧۚۡۥۜۚۥۥۤۛۡۦۙۜۨۧۚۨۘۙۘۗ۫۟ۚۥۗۖ۠ۧۖۢۦۖۘۥۨ۬ۛ۬ۦۘۘۦۖۚۨۧۢۚۛۚۗۖۘ۫۟ۥۘۘۤۡ۟ۢۚۛ۫۫ۨۘۡۛۚ۠ۜۦۖ۫ۢۖۚ۠۠ۨۚۢۥۥۘۘۗۤۘۘ۟۫ۖۘۥ۬۬۠ۜۜ۠ۚۥ";
                    break;
            }
        }
    }

    @Override // kentos.loader.utils.ActivityCompat, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        setNavBar(C0931R.C0932color.background);
        setContentView(C0931R.layout.activity_main);
        setRequestedOrientation(1);
        String str = "۟۫۟ۖۚۖۗۦۧ۬ۨۥۘ۟ۘۙۙۨۥۘ۫ۛۥۘۘۚۥۙۤۧۨ۟ۨۘۧۦۧ۬ۢۖۘۖ۫۬ۡۜۘۜ۬۟ۤۙۘۘ۬۟ۜۗۖۤۤۡۜۚ۠ۥۘۤۥۡۜ۫ۢۥۜۙۗ۟ۜۗۥۘۤۜۤ۬ۥۘۥۧۥۘۛۗۙۙۙۗ۫ۡ۠۬۬ۚ۬ۙۧ۬ۜۖۘۧۧۙۦۧۘۛۤۦۘ۬ۖ۬۠ۚۡۖۨۙ";
        while (true) {
            try {
                switch (str.hashCode() ^ (-121998853)) {
                    case -790278523:
                        BlackBoxCore.get().doCreate();
                        break;
                    case 124578152:
                        String str2 = "۠ۖۘۘۗۛۘۧۨۜۙۥۗۖۢۚۜۨۘ۬ۛۘ۫۬ۡۢۜۘۧۗۥ۠ۗۥۨۨۗۗ۠۟ۜ۫ۢۖۗۡۡۚۖۥۡۢۢۘۜۘۦۨۘ۠ۗۘۘ۠ۚۤۡۖ۫ۜۗۧۙۡ۠۫ۚ";
                        while (true) {
                            switch (str2.hashCode() ^ (-1695615335)) {
                                case -963377571:
                                    str2 = "ۦۜۥۘ۟ۘۤۦۜۘۜۚۜۘ۟ۧۘۘۨۢۜۘۤۧۥۘۤ۫ۛۖۚۜ۠ۖۥۘ۟ۘۙۗۚۗۨ۠ۖۙۙۨ۠۫ۧۦۦۧۤ۠ۘۘ۟ۘ۬ۚۚ۬ۙ۬ۨۜۛۚۗۢ۠ۤۜۜۙۡۡۘۘۧ۠";
                                case -512856995:
                                    str = "ۙۦۘۢ۫۬ۖۖۜۘۧۚۨۘ۠ۚۡۘۜۤۙۗۖۙۛۛ۫ۖ۠ۦۗ۬ۚۢۡۦۘۚۘۡۤ۬ۤۜ۫ۨۦۙ۟ۜۛۨۘۘۗۚۜۘۘۙۗۨ۠ۛۗۨۘۖۦۙۚۨۘۛۚۚۢۡۨۘۘۡۙۖۦۖ۠ۨۖۛۘۚۥۦۙۘۙۡۘۢۢۙۦ۟ۡ۬ۚۙ۫ۙۜۙۤۤۤۜ۫۟۬ۢۖۦ۬ۨۥۘ";
                                    continue;
                                case 795649504:
                                    String str3 = "ۙ۬ۡ۫ۙۛۛۨۡۘۘۘۥۘۦۙۥ۫ۗۥ۠ۜۘۧۡۦۘۦۖۧۡ۫۟۫ۤۖۛۚۘۢۢۡۘۢۙۦۘۙۜۨۘۖ۫ۥۘۡ۠۫ۜۗۛۤۦۘۘۨ۠۫۫۠ۤ۠۠ۦۘۦۥۘۤۗۦۘ۫۫ۥۘۚۗ۫ۖۙۥۘ۟ۥۧۗۧۗۙۛۙ";
                                    while (true) {
                                        switch (str3.hashCode() ^ 681067207) {
                                            case -1234319678:
                                                str2 = "ۡ۠ۧۛۢۡۘۗۢۜۘ۬ۙۨۤۤ۠ۦ۟ۙۤۥ۬۫ۧۛ۫ۜۥۘۦۖۧۘ۬ۥۜ۠ۘۗ۫ۛ۟ۥۤۜۖۘ۬ۥ۬ۨۡۜۨۘۙۗۜۘۖۙۙۡۖۨۘ۫۠ۡۘۜۢۦۘۘۖۙۘۡۜۢۤ۟ۢۡۤۢۥۚ۠ۥ۟ۦۥ۟ۧۤ۬";
                                                break;
                                            case -592248581:
                                                str3 = "ۙۛۜ۠ۦۖۘ۬۫ۙۖۗۖ۫ۨۦۦۙۦۧۦۜۘۡۙۛۚۦۘۙ۠ۖۘ۫ۗۗۜۨۡ۠ۤۘۘۖۜۖۙ۬ۖۘۨۦۦۦۘ۠ۤۗۜۜ۟ۜۘ۟ۖ۫ۚۜۙۚ۠ۧ۠ۚۡۘۘۡۦۦۢ۠ۢۛۙۢۖۘۖۧ۟ۚۖ۫ۨۤۘۘۥۘۧۘۘ۟۠ۥۧۘۘۥۥۦۘ۟ۤۨۛۤۡ۟ۘۛۥ۫ۜۘۡ۟۟ۛۜ۠ۧ۠ۙ۠۟ۘۘۦۨۛۤۤۜۘۡۤۨۘ";
                                            case 246104093:
                                                String str4 = "ۗۢۧۧۢۗۖۧۨۚۜۘ۟ۨۜۘۡۤۦۙۖۘۦۜ۟۫ۚۦۨۛۚ۬ۧۘۘۛۤ۠ۗۥۦ۬۫ۢ۫۬ۗۡۧۜۘۦ۬ۤۢۗۗۥ۫ۘۜۜۗۤۗۥۘۥۡۦۘۚ۬ۖۘۥۤۖۘۜۙۨۖۨ۟ۙۗ۬ۨۡ۠ۧۡۛۜۖۘۡۡۢۘۥۧۘ۟ۨۛ۟ۥۡۘۢۢۢۥۖۚۥۖۛۥ۟ۦۘ۫۠ۢۢۜ۫";
                                                while (true) {
                                                    switch (str4.hashCode() ^ 834032135) {
                                                        case -1358155052:
                                                            str3 = "۫ۡۘۨۛۦۘ۬ۦۧۨۛۥۖۥۧۚ۟ۖۚۘۘ۠ۧۚۦۘۤۖۧۙ۫ۥۖۘۚۘۥۘ۫ۘۘۘۜۤۦۘۙۡۡۘۨۜۡۘۨ۫ۧۜ۠ۖۘۛۘۡۡ۟۟ۧۖۢۧ۬ۨۙ۠ۨ۫ۥۧۖۜۡ۠ۜۘۛ۫ۘۛۦۚۢ۠ۡۘۘۨ۟ۦۨۚۡۖۨۧۚۦۖ۠ۡۘۗۧۖۘۥۛۡ۠ۧۡۘۗۢۡۖۘۥۘۨۗۘۘ";
                                                            break;
                                                        case -603366709:
                                                            String str5 = "ۧۥۚۙ۬۬ۗۦۦۘۜۗۨۘ۠ۥۗۦۤۥۘۤۗۦۘ۬ۥۚۥۨۦۙۤۚۜۚۥۖۙ۫ۢۡۘۜۡ۬ۨۤۙۗۗۘۘۛۨۡۥۧۘۘۛ۫ۗۙۙۥ۫ۙۦۘۙۢ۠ۘۛۗ۫ۙۖۘۗۤۛ۫ۛۧۘۡۗۦۛۜۘۢۥ۫ۢ۟ۘۘۖۧۘۘۨۢۤۤۗۥۡۚۧۙۚۛ";
                                                            while (true) {
                                                                switch (str5.hashCode() ^ 1883220862) {
                                                                    case -1779385484:
                                                                        str4 = "ۤ۬ۦ۠ۡۜۤۚۙۤۢۨۘۤۢۜۘۛۡ۫ۘ۫ۥۗۜۧۧ۬ۡۤۨۥ۟ۛۡۡۛۦۘ۠ۨۧۘۜۢۧ۫ۛۗۘۥۜۘۡۤۘۖۙۙۨۛ۬ۢ۬ۡۛۜ۫ۥۤۜۘۖۥ۟۟۟ۧۙۗۡ";
                                                                        break;
                                                                    case -512886711:
                                                                        str4 = "ۚۡۜۘۥۢۥۜ۬ۙۡۤۖۘۖۢۗۧۥۘۥۡۦۖۢۛۧ۫ۤۡۘ۬ۜۦۘۨۦۧۘ۫ۘۧۚۡۛۘۧۘۘۡ۫ۨۢۦۤۧ۟ۖۨۨۧۚۛۦۗۡۙۜۚۦۘۙۥۜۘۚۥۢۛ۠ۧ";
                                                                        break;
                                                                    case 179484035:
                                                                        str5 = "ۤۤۦۨ۬ۨۘ۠۠ۡۤۜ۫ۢۙ۠۫۟ۦۥ۬۟ۦۧۘۨۗۥۘۙۙۥۘۘۢۜ۬ۗۗۦۢۦۦۖۨۖۤۙۗۤۤۥۦۡ۫ۘۨۗۨۜۘۙۘۖۘۥۘۛۤۘۡ۫ۧۥۘۤۤۢۖۛۤ";
                                                                    case 1914206379:
                                                                        str5 = BlackBoxCore.get() != null ? "۠۠۠ۘۡۖۘۚۢۥۗۦۘۨۢۚ۫ۧۖۤۛ۬ۨۤۚۘ۠ۡۘ۫ۢۙۢۜۧۘ۫۬ۧۡۜۛۧۛۦ۬ۜۤۛۙۖۤۤۛۢۘۡۧ۫ۘۘۚۤۧۧۗۡۘ۠۟ۖۘۢۦ۠ۛۚ۟۟۬ۘۚۚۤۦۥۦۘۨۢۖۘۥۜۡۘۚ۟ۡۘ" : "ۡۛۦۥ۬ۘۘۨۦۛۙ۬ۦۧ۠ۨ۬۟ۗۘۤۚۗۚۖۘۚۥۨۜۤ۫ۚ۬ۜۡۘۡ۬ۛۙۢۡۖۘۛۦۡۘۤۦ۠ۢۖۛۤۛۖۘۦۡۚۚۨۛۤۜ۠ۘۡۨۦ۟ۖۢۧۡۧۧۢۦۦۖۘۚ۟ۘ۬۫ۢ۫ۡۚۤۦۘۘ";
                                                                }
                                                            }
                                                            break;
                                                        case 1521907306:
                                                            str3 = "۠ۗۙ۠۫ۖۘۚۚۙ۬ۚۖۧ۫ۘۢ۫۬ۖۥۤۘۙۥ۟ۙۨۘ۬ۚۤۧ۟ۚۧۜۜۘۡۡۘۘۜ۟۫۬ۗۚۦۜۛۨۡۨۘ۬ۢۖۧۢۖۘۢۤۚۡۗۗۚ۫ۤۛۡۖۘۗ۬ۨۘۖ۬ۡۘۦۥۥ۬ۙۥ۬ۡۦۥۙۢۜۙۜۘۖۧ۟ۨۨۖۘۛ۫ۡۘۛۨ۠ۙۢۖۘ۠ۨۧۡۦۘۦۤۥۢۧۨۘ۬ۤۢ";
                                                            break;
                                                        case 1735971787:
                                                            str4 = "۫ۤۧ۬ۚۛۛۥۡۗۛۗۖۢۨۘۜۜۧۦۜۦۗۛۥۘ۟ۨۦۘۦۧۥۘۛۧۚۖۥۘۚ۠ۚ۟ۖۡۘۢ۟ۡۡۦۜۥۦ۟ۢ۫ۗۢۖۖ۫ۨۘۧ۠۬ۘ۫ۗۘۚۧۙۤۧۧۛۦۘۨۙۘۘۗ۫ۡۘ۬ۤۜۛۙ۠ۙۥۧۜۧ۫۠ۖۘۙۜۢۦۢۘ۟ۛۖۤۨ۠ۛۡۥۡۘۨۧۙ۫ۗۘۙۦۛۧۢۘۘۤۛۘۛۤ۬ۤۥۨ";
                                                    }
                                                }
                                                break;
                                            case 1908841564:
                                                str2 = "ۤۢۦۛ۫ۖۘۨ۠ۘۘۘۡۦ۟ۢۛ۟ۨۤ۫ۖۖۖ۬ۨۜۧۨۘ۟ۗۦ۬ۙۛ۬۬ۚ۠ۙۛۚۖۚۥ۫ۢ۫ۦ۫ۜۦۛۥۢۖۘۙ۠ۢۨۙۥۘۢۛ۫۬ۨۘۨۨۨۘۗۧۜۧ۫ۘ";
                                                break;
                                        }
                                    }
                                    break;
                                case 1180281650:
                                    str = "۫ۙ۠ۡۥۙۥۥۘۘۚ۠ۨۢ۫ۦۡۚ۟ۥۡۙۘۥۘۖۤۡۗۥۙۡۙۡۖۡۜۘۚۜۖۘۡۙۜۡۥۤۖۢۦۘۛۚ۠ۧۖۡۜۜ۬ۢۨۚۢۨۨۢۛۘۘ۟ۥۡۖۖۥۘۦۤۥ۫۠ۡۚ۫۫۟۟ۦۧۗ۟ۘۚۨۘ";
                                    continue;
                            }
                        }
                        break;
                    case 1165649791:
                        break;
                    case 1826234479:
                        str = "۬ۘۥۖۙ۟ۧۡ۟ۥ۫ۜۘۤۜۤۢ۬ۢۤ۫ۦۘۘ۫ۥۥ۬ۘۘۢۤۤۧۜۦۨ۠ۖۡ۟ۡۘ۟ۧۖۘ۠ۦۖۘ۫۠۠ۦۦۦۘۛ۫ۙۢۖۥۘۙ۬ۙۚۜۡۙۘۘۡۖۙۦ۠ۡ۬۠ۜ";
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        initMenu1();
        initMenu2();
        Loadssets();
        new DownloadZip(this).execute(Deobfuscator$$app.getString(-3440732141421158217L), ApiServer.mainURL());
        devicecheck();
        instance = this;
        Checking();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        String str = "ۘۗۚۙۨۤۛۚۛۡ۟ۨۘۖ۬ۦۡۖۡۧۨ۫ۥۘۨۘۧ۠ۦۘۖۡ۬ۙۘۨ۟۫۫ۚۚۘ۠ۗۚۢۤۛۢ۬ۥۧۦۘۜۛۥۘۡۜۦۢۧۛۧۥۙۤۗۦۘ۬ۤۥۖۥۜۘۢۨۧۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 355) ^ 239) ^ 565) ^ 982) ^ 656) ^ 132) ^ 977) ^ 384) ^ 73) ^ 195) ^ 570) ^ 906) ^ 483) ^ 231) ^ 349) ^ 767) ^ 415) ^ 443) ^ 817) ^ 259) ^ 353) ^ 344) ^ 852) ^ 243) ^ 540) ^ 361) ^ 293) ^ 519) ^ 674) ^ 386) ^ 531) ^ 138073554) {
                case -1614328014:
                    stopService(new Intent(get(), Overlay.class));
                    str = "ۢۥۧۘۢ۟ۧۗۘۡۘ۟۠ۦۚۦۥۗ۟ۖۛۖۧۘۗۚۦۘۚۦۘۖۚ۬ۧۚۛۖۢۜۘ۠ۘۦۦۨۥۙۙۛ۟۟ۜۧ۟ۢۗۡۡۖۖۘۥۡۨۧ۫ۧۡۡۢۗۗۚۢۥ۫ۨۘ۬ۨۜۘۦۢۥ۬ۖۘۨۥۦۗ۬ۗ۫ۛۤۢۘ۫ۜۦۖۘۤۤ۬۠ۦۡ";
                    break;
                case -1406060763:
                    stopService(new Intent(get(), ToggleBullet.class));
                    str = "ۙۘۦۛۢۨ۠ۜ۫ۛۧۨۢۨ۠ۢ۟ۗۚۜۜۨۘۜۘۘۖۤ۫۫ۦۘۛۧۡۗ۟ۤۜ۠ۘۙ۬ۛۡۜۘۖۡ۬ۤۡۦۡۨۡۤ۬ۡۤ۠ۚۢۚۙۚۜۘۖۨۧۚۥۦۘۨۥۧۘۢۤۦۘۗۦ۟ۤۛ۠۬۟۠ۚۖۤۚۖۦۘۖ۠ۤۧۨ۠۠ۨۗۦۤۜۙۛۛۗۗ۠۬ۤۦۥۛۥۘۖۘۖۘ۫ۨۨۘۧۡۧۘ۬ۗۢۥۦۗۙۡۘ";
                    break;
                case -674761916:
                    stopService(new Intent(get(), ToggleAim.class));
                    str = "۠ۦ۫ۥۗ۟ۜۡۘ۬ۖۖۘۛۤۦۨ۠۟ۘۚۧۜ۬ۘۥۘۥۡ۬ۗۚۢۛۡۨ۟ۦ۠ۖۘ۟ۥۧۘۥۢ۟ۢۢۧ۟ۛۜۖۛۖۥۦۥۚۦۖۘۦ۠ۥۘ۫ۥ۟ۘۚۛۦۛۧۜۨ";
                    break;
                case -484088411:
                    str = "۠ۗۨۘۨۥۙۧ۠ۥۘۘۜۜ۟ۧۗۘۙۤۨۚۜۘۡۡۧۘ۟ۡۡ۫۟ۨۘۦۘۛۧۖۘۨۦۥۘ۠ۧ۠ۦۢ۟ۛۥۧۘۜۤۜۘ۠ۖۢ۟ۜۦۗۤۡۢۖۘۗۗۥۘۥ۠ۖۘۡۖۧۦۧۢ";
                    break;
                case -301961346:
                    stopService(new Intent(get(), FloatService.class));
                    str = "ۘۗ۬ۜۤۨۛۡۤ۬ۤۡۙۛۖۘ۬۬ۢۧۥۖۘۢ۬ۗ۬ۨ۟ۦۤۡۢۙۙۜ۫ۚ۬۫ۚۡۗۛۚۤۘۛۡۗۡۚۢۨۡۘ۠ۙۦۨۛۡۘۛۨۡۘۛۤ۫ۤۨ۠ۥۘۘۢۨۘۧۨۧ۠ۛۢۥۜۧۗۚ۠۫۬ۜ۟ۡۦۘۚۦ۬۬ۦۜۡۜۘۘۦ۠۠ۧۜۙۧ۫۫ۛ۬ۥۡ۬ۜۨ۠ۜۖۖۜۖۜۨ۟ۚۤ۬ۙۢۡۖ";
                    break;
                case 1593527543:
                    super.onDestroy();
                    str = "ۜۧۛۘۚۦۘ۟ۚۗۗۦۚۨۨ۠ۙۤۛۘۨۦۘۖۦۘۘۤ۟ۘۨۙ۫۫۟ۜ۫ۘۦۘۜۙۢۛۢۡۦۖۛ۬ۦۛۘۥۤ۟ۤۧ۠ۚۘ۟ۘ۫ۜۜ۟ۖ۫ۧۚۦۡ۠ۢۤۗۜۧۖۖۨۤۦۧۦ۬ۚ۠۟ۚۖ۟۬ۦۗۥۚۤۖۥ۠ۗ۫ۖۜۢۜۡۘۖ۟ۨۦۦۛۤۖ۟ۥۚۢ";
                    break;
                case 1946420863:
                    return;
            }
        }
    }

    @Override // kentos.loader.utils.ActivityCompat, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        String str = "۟۬ۙ۫ۦۤ۫ۡۜۘ۟ۥۧ۬ۢۧۦۦۜۘۥۘۥۘ۬ۜ۫ۗۖۛۜۙۗۡۥۧۨ۬ۦۧۙۗۙ۟۫ۧۥۢۢ۫ۥۘۥۛۨۘۛۘۘۘۢ۬۫ۖۘۘۘ۬۟ۥ۟۫ۨۘۥۙۥۘۖۥۜۨ۠ۛۡۡۧۛۜۦۤۡۦۨ۬۠۟ۗ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 14) ^ 184) ^ 818) ^ 995) ^ 354) ^ 261) ^ 558) ^ 92) ^ 522) ^ 174) ^ 896) ^ 938) ^ 286) ^ 155) ^ 31) ^ 100) ^ 401) ^ 385) ^ 988) ^ 851) ^ 282) ^ 599) ^ 834) ^ PointerIconCompat.TYPE_GRABBING) ^ 610) ^ 475) ^ 474) ^ 333) ^ 978) ^ 327) ^ 332) ^ 1457135545) {
                case -1916399914:
                    finish();
                    str = "ۢۢۙۗۤ۬ۦۛۘۘۤۚ۠ۖۙۧۥۧۖۘۦ۟ۥۘۜۥۦۥۗۛۤۧۛۡۤۗۥۗ۫۫ۗ۠۠۬ۢۢۙۜۘۛۦۧۘ۫ۖۤۜۤۨۘۡ۠ۦ۬ۥۘۙۙۜۤۢ۠ۦۛۥۙۨۥۙۡۜ";
                    continue;
                case -1763931056:
                    str = "ۖۖۨۘۢۤۗۤۚۤ۟ۛ۫ۗۤ۫ۤۖ۠ۚۜ۬ۢۨۨۛۦۛۡۦ۬ۜۖۜۥۖۘۗۚۖۘ۬ۤۦۘ۫ۗۥۘۜ۟ۚۨۤ۟ۗ۠ۥۖ۟ۨۡۖۜ۟۠ۢ۫ۘۘ۠۟ۥۘۙۤۚۦ۟ۘۤۖ۫ۗۗ۠ۧ۬ۙۚۛۜۛۚ۠ۖۜۤۢۡۦۚ۬ۛ۠ۙۛۨۡۖۢۢۘۛۡۥۛۙۡۘ۫۫ۨۨۥۗۧۙۡۘۙۜۘۚۨۧ۫ۖۖۗۧۧ";
                    continue;
                case -919418531:
                    return;
                case 420086140:
                    str = "ۤۤۚ۫ۚۖۘۨۤ۠ۜۨۜۜۦ۫ۙۤۜۖۧۥۘۗۙۚۦۚۖۥۥۙۛ۫ۚ۬۫ۛۗۜ۟ۢۦۛۢۡۧۧۙۦۘۗ۬ۗۧۜۥۘۡۜۘۘۜ۫ۤۢۘۢ۬ۧۛۡ۠ۜۘ۠ۜۛۥۨۥۘۦ۠ۘۤ۫ۢۨۖۖۘ۟ۘۨۤۢۦ";
                    continue;
                case 760846472:
                    String str2 = "ۖ۫ۤۦ۠ۘ۠ۦ۬ۜۖ۬ۗۥۡۘۧ۬ۢۢۚۤ۠۫ۚۧۜۘۖۚۘۖ۠۠ۦۦۥۘۗۚ۬ۤۧۘۘ۠ۦۧۘۛۥۧۤۚۘۘۧ۬ۨۘۜۦ۬ۧۧۦۘۤۧۛۥۦۜۘ۠۬ۦۘ۫۫ۘۧۘۥۚۙۦۘ۬ۙۧۖ۠ۘۘۘۦۢۡ۟ۦۡۘۧۤۘ۫ۢ۟ۡۚ۬ۦۘۛۜۢ۠ۥۨۜ۫ۨۨ۠ۖۢۨۗۢ۬";
                    while (true) {
                        switch (str2.hashCode() ^ 697888768) {
                            case -1245048995:
                                str = "ۗ۟ۨۘۧۛ۬ۘ۠۟۟ۥۨۛۙۥۡۡۥۘۡۙۡ۠ۨۘۜ۬۬ۥۖۖۘۧ۫ۨۘۙۡۦۚۜۚۗۨۨۢۚۦۤ۟ۦۘ۠ۘۜۘۗۙۨۘۢ۬ۘۘۜۘۗۧۚۢۦۜۡۤۙۚۛ۟ۡۘ۟۫ۦۡۙۢۦۨۜۛ۫۬ۚۖۥۘۦۨۨۚۘۘۘ۟۠۬ۜۧۦۙۖۨۘۦۤۤ";
                                continue;
                            case 21172095:
                                break;
                            case 369438082:
                                String str3 = "ۧ۬ۜۘۛۚ۬ۢۦۡۘۤۛ۠۠ۥۥۘۢۨۗ۫۫ۡۘ۫ۦ۟ۥۢۘۦۢۙۧۚۨۛۚۡۤۚۦۡۧۨ۬ۚ۟ۨۙۖۛۨۘۙۦۘۗۦۥۘۨۙ۫ۥۧۛ۬ۜۘۢۛۦ۠ۦ۟ۚۚۙ۫ۤۗۚۡ۟ۛۜۘ۫ۡۗ۟ۘۦ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1343649826) {
                                        case -1452350214:
                                            String str4 = "ۙۗۖۖۘۧۛۨ۠ۨۘۦۗۡۘۙۚۧۙۢۗۡۛۨۘۜۦۗۦۗۖۗۚۨۙۚۚۙۖۢۥۘۚ۫ۨۘ۫ۦۨۧۘۜ۫ۢۗۙۚۘۘۜۚ۬ۥۘۘ۫ۡۘۥۛۡۘ۫ۤۥ۫ۥۗۖ۫ۥۘۧۢۜۚ۬ۖۘۗۜۧ۫ۛۨۘ";
                                            while (true) {
                                                switch (str4.hashCode() ^ 1883953178) {
                                                    case -1059596958:
                                                        String str5 = "ۦۧۥۘۜۖۨۘۛۨۧ۬ۧۦۘۚۡۧۘۡ۫ۥۜۨۨۦۦۧۘۢ۟ۥۜۦۨۧۛ۠ۤ۟۠ۡۛۥۤ۫ۦۘۖۘۨۘۙۨۧۥۜۨۡۢۘۚۢۖۜۤ۠ۦۚۥۖۗ۟ۚۥ۫ۗۜۖ۟۫";
                                                        while (true) {
                                                            switch (str5.hashCode() ^ 1198015198) {
                                                                case -1891197312:
                                                                    String str6 = "ۤۨۦۘۡ۫ۥۖۘۖۘۢۛ۠ۢۡۘ۠۬۬۫ۘۘۙۘۤۧۛۖۘۗۡۘۖ۬۠ۡۙۛ۟ۡۥۨۚۙۡۜۙ۠ۢۡۗۤۖۘۧۥۨۘ۫ۜۙ۬ۨ۫ۜۜ۟۟ۢۡۘۨۗۦۙۦۘ۫ۛۙۦ۟ۘۗ۠ۦۘۢۜۦۘ۫ۢۖۗۚۜ۟ۧۤ۫ۖۘۤۡۘۤ۠۬ۦۛۦۥۦۦ۟ۜۚ۟۠ۖۛۜۧۚۡۢۜ۟۟ۤۘۜۧۡۘ۠ۦۡۢۜۤ";
                                                                    while (true) {
                                                                        switch (str6.hashCode() ^ 14394376) {
                                                                            case -1282119143:
                                                                                str6 = i == 1 ? "ۛ۬ۨۤۢۨۨۦۘۚۤۡۘۧۤ۬ۜۜ۠ۛ۠ۡۛۗۙۖۘۨۚ۠ۚۛۧۨۥۧۘۙۚۡۘ۬ۡۘۘۙۘۙ۠ۨۛۛۦۨۘ۫ۛ۬ۙۨۤ۬ۘۤۦۨۜۥ۟ۚۗۖۘۧ۬ۘ۬ۜۦۘ۠ۡۨۘۜۧۖۚۚۥۗۖ۟ۖۙۜۘۚۚۡۨۖۦۡۛۡۘۦۦۙۖ۫ۦ" : "ۢ۠ۖۛۥ۟ۡۗۗۢۡۘۦۚۖۘۖۚۖ۟ۥ۬۠ۙۤۧ۠ۨۘ۬ۢۗۧۦۨۚۙۨۖۧۖۗۚۚۧ۠ۢۛۦۙ۫۫ۥۘۦۧۦۘۡۧۘۙۦ۠ۛۤۥۘ۫۫ۨۘۗۤۦۘۢۘ۬ۘۨۧۙۚۥۘۤ۠ۧۘ۬ۜۘۘۜۢ۟ۘۗ۠۫۫۠ۗۜ۟ۘۗۗۨۤۢۡۘۢ۟ۧ۠ۛ۠ۗۖۨ۫ۡۡۨۖۢ۟ۖۧۙۘ۠ۘۘ۟ۦۜ۬ۙۗ";
                                                                            case -713553369:
                                                                                str5 = "ۨۧۧۧ۬۫ۦ۠ۨۘ۠۟ۦۘۗ۫ۜۘۘۛۢۙۨۨۘۧۜۨۘۙۖۚۧۧۢۚ۬ۥ۫۬ۤ۠۬ۖۖۚ۠۠ۘۜۘۙۡۘ۠ۨۖۘۘۢ۫۟۫ۘۙۦۢۤۥۧۡۛۥۘۚۗۖۦۡۥۘۦۘۦۘ";
                                                                                break;
                                                                            case 1670415778:
                                                                                str5 = "ۥۤۨۚۡۦۙۗۜ۬ۖۛۜ۬ۦۚۥۜ۫ۜۖۘ۫ۛۜۘۤۙۗ۬۫ۡۘۨۘۦۨۢۢ۬ۜۘۧۨۗ۬ۚۘۗۦۨۘۤۢۙۨۤۦۘۗۦۙۘۛ۬ۛۦۦۖۘۗۗۢۘۛۡۦۨ۠ۨۦ۫ۖ۠ۦۦۦۦۤۖۦ۟ۦۚ";
                                                                                break;
                                                                            case 1862651518:
                                                                                str6 = "ۦۦۦۘۢۥۦۖۨۨۤ۫ۨ۠ۘۨۘۚۤۤۢۙ۬ۥۘۥۘ۫ۧۗۧۧۦۤۖ۟۫ۡۥ۫ۨۡ۟ۨۧۨۢۚ۬ۗۦۘۢۙۧۦۙۦ۫۟ۜۚۧۦۘۗۗۘۘۨ۫ۛۛۧۖۖۥۢ۠ۘۙۛۨۛۧۗ۫۠ۘۘۛۡۘۖۜۚ۬۠۠ۖۘۖۘ۬ۥۥۧۘۗ۫ۘۘ۬ۡۖ۬ۢۥۘۜ۬ۦۘۜۖۖۥ۬ۤ";
                                                                        }
                                                                    }
                                                                    break;
                                                                case -154211499:
                                                                    str4 = "۠۟ۜۘ۟ۥۡۘۚۘۢۧۡ۟ۤۡۥۘۗ۬ۘۗ۟ۦۜۙ۫۠ۙۧۥۢ۟ۘۗۧۥۘۘۜ۫۬۬ۨۘۤۘۡۘ۟۫ۥۚۘۗۚ۫ۡۨۜۚۥۨۜۧۖۧۘۡ۬ۡۘۜ۬ۦۢۛۧۢ";
                                                                    break;
                                                                case 669444387:
                                                                    str4 = "۟۠۠ۛۦۥۗۜۘ۬ۛۜۘۦۡۗۜۛۘۗۢۥۙۛۨ۬۫ۢۛۜ۟۟۬ۦ۟ۛۧۦۡ۬ۧۨۜۖۦۥۙۛۨۙۤۧۙۨۥ۠ۡۨ۠ۤۜۧۘۘۜۦۡۖۨۘۗۨۖۘۖ۫ۦۘ۠ۥ۟ۚۤۘۥۜۤۖۖۗۗۧۡۘۗۦۖۘۥۘۗۖۖۧۖ۠ۥۘۥۘۦۘ";
                                                                    break;
                                                                case 683977635:
                                                                    str5 = "ۦۡۨۛۖۨۘۡ۟ۦۘۦ۟ۜۘۨۡۥۥۛۧۤۤۘۘۢ۠ۗۘۘۘۗۧ۟۠ۥۘۘۡۛۡۘۜۖۡۘۧ۬ۤۘۖۦۢۚۗ۫ۜۘۦۗۡۘۜۧۨۗۨۧۘۙۗۜۥۖ۬ۡۛ۠ۛۦۥۘۚۛ۟ۡۦ۠ۜۛۜۡۤۗ۟ۤۤۘۛۢۡ۫ۡۘۨۢۥۘۖ۬ۦۖۥ۟۬ۡۘ";
                                                            }
                                                        }
                                                        break;
                                                    case -1046043685:
                                                        str3 = "ۘ۟ۨۗ۫ۙ۠ۨ۬ۨۨۥۘۗ۟ۗۧۡۨ۠ۦۧۧۡۘۛۗۡۘ۫ۙۨۘۨۦۗۜۙۡۘۙ۠ۦۘۜ۟ۖۘۧۙۦۖ۟ۨۨۥۘۢۗ۠ۗۗۦۗۥۥۛۙۨۥ۟ۥۘۖۨۡۖۚۨۘ۠ۥۢ";
                                                        break;
                                                    case -34759536:
                                                        str4 = "۠ۧۖ۠ۚۤۗۨۨۚۨۨۡۗ۟ۡۚۗۜۢ۠۟ۨۘ۬ۖۙۥۡۜۦۜۖ۫ۙۚۙۘ۫ۙ۟ۤۖ۫ۜۘ۬ۖۤۛۚۤۘ۬ۥۘۥۙۦۧۖۦۢۚۗۜۖ۫ۙۛۗ۠ۜۘۚ۬ۡۘ";
                                                    case 1431162678:
                                                        str3 = "۠ۛۗ۟ۜ۬ۖۥۖ۫ۙۡۘ۫۟ۤ۟ۦ۠ۚ۠ۖۗۤۤۜۜ۫ۧۜۤۛۢۡۘۢۦ۬ۥۛۥ۬ۙۜۙۛۖ۬۠ۗ۬۠ۜۘۦۧ۠ۡۡۖۙۙ۬ۗ۠ۨ۫ۨ۫۬۬۬۟ۜۧۘ۫ۢۥ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case 1182874590:
                                            str2 = "۠ۚ۫۬۫ۦۗۗۤۥۘۖ۠ۙۜۘ۬ۧۦۜۧ۫۫ۖۜۧۙۢۨۡۘۢۨ۟۠ۡۨۘۖۨۖۧ۟ۥۘۛۤۜ۠ۜۖۘ۟ۧۢۖۖۧۖۢۖ۟ۥۧۚۙۦۖۡۖۘۤۗۨ۫ۤۨۛ۬ۡۘ۠ۛۨۘۧۖۢۖ۠ۗ۫ۖۙۖ۬ۦۨ۬۬ۜ۟ۜۦ۟ۧۘۧۘۢ۫۟ۚ۠ۚ۫ۨ۠۬۬ۧۦۚۚۨۥۦۘۛۖۧۘۚۧۥۨۖ۟۟ۥۧۘ۠ۨۜ";
                                            break;
                                        case 1280653144:
                                            str3 = "ۚۦ۬ۛۛۖۨۦ۬ۜۚۘ۟ۜۗۥۚۜۗۘۜۘۙۛۧۖ۫ۥۚ۠ۨۥۨۘۡۦۚۗ۫ۥۢ۫ۖۘۧۡ۫ۖۗۡۘ۬۟۫ۢۤۦۡۧۘۛۙۧۤ۟ۦۘۘۖۘۨۦۙۖ۫ۖۗۗۜۘۚ۠ۤ۬ۥ۟ۧۤۦۛۛۛۢۧ۟ۨ۫۠ۖۦۦۦۙۚۙۜ۟ۢۤۙ";
                                        case 1350618719:
                                            str2 = "۠ۧۢ۬ۖۡۗۨۘۘۦۨۙ۫ۙۡۥۡۘۘۨۙۜۗۜۚ۠ۘۦۘۢ۬ۡۘ۟۟ۖۡۦۧۘ۬ۦۨۙۡۙ۬ۦۛۨ۫۠ۗ۬ۖۢ۠ۥۤۙۨۘۨۨۘۘ۫ۘۧۘۛۢ۠ۦۘۧۘۚۥۗۙۦۘۗۢۜ۠ۖۘۘۛۢۚ۬۠ۗۦۜۘۥ۬ۨۢۦۨۘۢۛۜۨ۫ۨۘ۠۫ۡۘ۬ۤ۬ۜ۬۫ۗۘۚ۬ۢۢۥۡۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1565079187:
                                str2 = "ۡۘۖۘ۬ۨۛۙۨۖۘۗ۠ۗ۠ۙۤۤ۫ۘۘۨۡۘ۠۬ۡۦۚۘۚ۠ۦۘ۟ۤ۠ۧۜ۬ۥ۟ۧۜ۫ۥۥ۫ۢۙۛۛۡۥۥۧۜۜ۟ۡۘۚۡۛۤۢۖۘۨۛ۬ۖۢۙۙۨ۫۟ۖۡ۠ۡۡۘۖۙۥۘۜ۫ۦۨۙۚۤۧۡۘۙ۫ۢۖۚ۬ۥ۟۠۬ۤۚۘۤۦۙۜۚ۠ۧۙۢۗۥ۫ۥۘۗۖۚ۬۟ۤۖۘۧۛ۬۟ۡۡۛ۟ۢ";
                        }
                    }
                    break;
                case 1340066123:
                    String str7 = "ۢۙۗۘۡۖۚۛۥۘۨ۟ۘۜۤۥۡۜۘۘۦ۫ۢ۟ۖۥۘ۬ۛۡۡ۬ۡۘۧۥۦۤ۫ۦۡۘۧۖۨۘۗۛۜۛ۫ۤ۫ۜۧۤۚۥ۠۫ۤۨۘۨۡۢۜۘۨۙۜۗۜۘ۟ۗۦۜ۟ۤۖۥۨۘۢ۠ۗۛۖۨۘۧۥۨۘۘۥۡۘ۬۠ۗ۬ۚۡ۬ۧ۟ۤۥۘۤۘۧ";
                    while (true) {
                        switch (str7.hashCode() ^ (-45875337)) {
                            case -1664261902:
                                str = "ۙۖۢۢۖۚۗ۠ۦۘۘ۫ۦۘ۫ۥۧۘۢۧۛۦ۠ۤۥۧۙ۬ۖ۟ۧۧۙ۫ۚۦۘۗۙ۟ۜۛ۟ۘۛ۬ۧۨۜ۬ۙۡۦۡۜۗ۠ۤ۫ۡۜۗ۠ۧۦۡۘ۬ۧ۬ۜۚ۠ۧۦۤۤ۫ۥۘۤۜۧۘۢۦۘۙ۬۟ۗۦۛ۫ۛ۟۟ۨۘۘۘۘۧۤ۬ۗۚۙۖۘ۬۟ۤۜۚۜۛ۬ۜۘۤۡۖۘ۫ۘۥۥۙۧ";
                                continue;
                            case -964788676:
                                str = "ۢۧۚۚ۠ۜ۫ۨۘۘۗ۠ۥۤۦۦۦۛۛۚۛۘ۫ۚۦۧ۫ۙۚ۫ۗۦۚۨۘ۠ۨۡۖۜۧۥۘۘۖۜۡۘۥۨۘۘۧۘۢۨ۟ۢۙۤ۟ۙۗۡۘۧۧۦۜۤۖۗۘۗۛۡۘۢۥۡۘۙۨۡۖۘۦۘۗۥۦۘ۟ۖۧۘۡۥۨۡۧۡۘۢۘۘۙۛۛۧۛۚ";
                                continue;
                                continue;
                            case 395342820:
                                str7 = "ۦۧۙۢ۟ۖۘۨ۟ۗۢۤۚۧۢۡۘۖۙۡۘۗۜۡۘۢۖۜۘۤۨۘۖ۠ۢ۟۬۟ۦۘۤۛۗ۬ۤۤۜ۠ۡۘۘۜۥۨۤۨ۫ۤۗۥۛۜۚۨ۫ۦۙۦۙ۟ۧۜۘۡۨ۠ۖ۟ۛۛۗۡۘۜۧۥۘۗ۠ۡۗۨۜۘۚۡۘۗۙۖۚۢۢۜۛۦ۬ۤۧۢۘۢۘۙۗۗۧۖۘۜۜۨۘۤۨۥۘۧ۬ۡۘۡ۟ۦ۟ۨۙۦۗۖۨۘ۠ۗۧ۫ۗۗۖ";
                            case 1402544160:
                                String str8 = "ۚۙۖۘۚۢۨۢۙۙۢۗۨۘۖۛۘۨۥۥۘۗۡۘۘۨ۠ۙۢۨ۟ۖۤۡۨ۠۫ۦ۠ۖۗۨۘۖۘ۫ۢۚۘۛ۠ۦ۟۫ۚۚۖۙۙۙ۟ۚۡۢۧۛۡۘۛۢۖۘۧۥۛۢۖۦۙۧۥ۫ۨۧۢۧۨۤۗۛۚۦۚۖۗ۫ۧۗۚۤ۠ۨ۫ۧۦۘ۠ۦۘۡ۫۠ۘۜۢ۫ۢۖۘۧ۬ۖۥ۬۟ۡۚۗۗۥۧۘۘۦۜۘۘۚۢۗۜۘۛۙۘۘ";
                                while (true) {
                                    switch (str8.hashCode() ^ 1799866818) {
                                        case -1019173998:
                                            str7 = "ۛۜ۟ۦ۠ۜۛ۬ۡۛۨۡۘۤۗۘۘۨۨۨۘۢۘۖۘۨۗ۫ۤۚۦۘۛۨۜۚۨۨ۟ۦۡ۠ۖ۟ۛۦۡ۠ۘۦۘۡۘ۫ۙۥۘۖ۬ۛۡۦ۬۬ۨۧۘ۫۬ۙ۫۠ۧۥ۬۬ۢ۫ۚۧۨۘۨۖۘۙۜۘۤۚۦۦۨۡۜۦۘۗۜۦۘۜ۫ۜۘ۟۠ۘۙۤ۬ۡۦۗ۠ۚۖ۬ۛۜۢۜۘ۠۫ۧ۫ۨۗۢۗ۟ۜۦۘۨۚۥۘۡۘۜۜۥۜ";
                                            break;
                                        case -771759668:
                                            str8 = "ۛ۠۟۬ۙۛۙۥۥۧۦۢ۟ۤۘۘۧۛۢۜۤ۫ۧۜۚۚ۠ۜۘۤۖۘ۠ۥۙۛۥۧۘۢ۫ۤ۠ۧۚۤ۠ۦ۫ۥۚۧۤۢ۟ۗۛۤۦۖۦۦۨۘۥۤۡۢ۬ۘۘۙ۫ۥۛ۠ۡۜۜۡ۠ۘ۠۟ۦۤۢ۫۟ۜۧۡۘۢۥۜۗ۬۬ۢۡۗ۠ۛۡۦۖۢۡۗۖۢ۠ۤۙۧۖۘۘۢۤ۠ۧۛۤۙۤ";
                                        case 1078193149:
                                            str7 = "۬ۡۦۘ۟ۢۦۘ۬ۧ۟ۢ۠ۦ۫ۚۨۦۚۜۦۙۖۘۛۡۜ۫ۦۦۘ۫۫ۢۢۧۖۢۧۙۢ۠ۦۚ۬ۘۙ۟ۥ۬ۗۚۗۨۨۘۤۡۡۨۢۛۛۜۢ۟ۢۡۘۜۡۥۘ۟۫ۨ۠ۖۧۜۘۧۘۡۤۧۡۘۚۗۗ۫ۙۧۧۚۖۡۖۨۘ۬۫۬۬ۛ۫۠ۨۘۘۚۤۢۖۤۨۘۖۜۧۘۜۜۨۘۖۗۜۛ۠ۖ";
                                            break;
                                        case 1279436506:
                                            String str9 = "۫ۚ۬۟ۗۦۥۛۙ۠ۗۜۛ۠۬ۚۗۡۗۡۛۤۦۨۛۥ۟ۗۡۦ۬ۦۙ۠ۡ۫۬ۤۢ۠ۗ۟ۦۘۧۘۖۘۘ۟ۖۜۖ۬ۙ۟ۛۥۛۜۙۧۘ۫۠ۛ۫۠ۥۘۘ۬ۥۘۦۧ۬۠۫ۙۘۥۖۘ۬ۢۚ۬۠ۥۜۤ۬ۥۧۘۘۨ۟ۖۘ۬ۗۗۨۨۗۗۥۢۜۗۡۘۥ۫ۥۧۜ۫ۛۙۜۘۚۥۘۘ";
                                            while (true) {
                                                switch (str9.hashCode() ^ 12442788) {
                                                    case -1913675308:
                                                        String str10 = "ۛۖۢۙۘ۟ۦ۟ۜۘۗۧۥۘ۬۬ۚۗۚۥۖۗۢۜۖ۬ۤۜۛ۫ۨۘۤۚۡۛۦۖۘۜۘۙۡۖۖۦۢۖۘۧۨۛ۫ۡۜ۟۠ۦۥۦۡۘۨۗۢۙۙۤۤۘۛۦۘۙۘۛۚۤ۟ۡۦۥۦۤ۠۬ۗۦۙۨ۟ۜۥۘۡۘۢۖۚۢۦۡۖۘۗۗۛ۠ۡۚۖۘ";
                                                        while (true) {
                                                            switch (str10.hashCode() ^ (-624051330)) {
                                                                case -1279727735:
                                                                    str9 = "ۧۢ۬ۗۚۖۘ۬ۚۙۛ۟ۛۜ۠ۦۘۚۗۨ۬۬۠ۙۜۦۘۙۧ۫ۙۛۚۛۢۥۘ۠ۜۘۘ۬ۢۥۥۤۗۤۡۨۥۧۥۛۖۥۢۘۜۜ۠ۙ۬ۙۗ۠ۦۜۘۜۡۘۘ۬ۗۜۘۚۛۙۨۖۘۘ";
                                                                    break;
                                                                case -479311060:
                                                                    str10 = "۫ۦۙ۬۟ۙ۟ۦ۠۬۫ۦۘۜۡۡۘۙۦ۬ۢۖۥۤۦۤۥۢ۬ۛۥ۟۟ۤۥۘۧۤۦۘۢ۬ۚۚۨۘۢۧۡۛۢۜۘۦ۠ۨۘۧۙۨۘۡۙۢۢۚۨۛۙۤۥ۠ۘۘۥ۟ۘۘۧۦۥۗۧۥۦۘۘۜۜۥ۟ۘۦۘ۠ۖۨۜۡۘۥۧۦۘۡۘۥۘۘۙ۫ۛۥۘۘۡۨۘ۬۫ۗۦۢۧۡ۟ۤۦۜۛۤۡۨۘ";
                                                                case -69915234:
                                                                    String str11 = "ۧۨۥۘ۠ۗۘۘ۟ۡۡۤۥۙۥۚۚۤۖۚ۬ۗۘۧۘ۫ۢ۠ۛۖۦۛۡۨۦۘۘۚۧ۟ۥ۫ۚۧۡ۫ۦ۟ۦۜۗ۫ۥۜۡۜۢۖۛۤۙۗۨۘۧۘ۫ۨۦۨۘۡۖۘۘۛۡۦۤ۬ۗ۬ۡۚۜۘۗۨۧۘ۬ۥ۟ۤ۠ۗۦۘۗۘۖۜۘۖۦۖۢۡۗۙۨ۠ۛۗۧۙۨۘۜۙۖۘۧ۠ۜۘ";
                                                                    while (true) {
                                                                        switch (str11.hashCode() ^ 2128210208) {
                                                                            case -929019236:
                                                                                str11 = "۬ۜۗۨۗۨۘۧۖ۬ۡ۬۟۬ۢ۟ۢۦۘۧۖ۬ۦ۠ۤۛۖۚۗۘۧۘ۬ۚۗۙۥۨۘۡۚ۫ۡۙۜۛۥۘۧۤۥ۟ۤۘۖۘ۟ۙۧۧۜۗۢۚۙۡۘۗۥۥۘۙۖۚۥۨۘۙۧۥ۫ۤۙۥ۫۟ۡ۟ۖۘۦۗۛۚۡۗۘۙۧۜۗۤۜۤۨۘۙۤۦۘ۬ۦ۬";
                                                                            case -522544329:
                                                                                str10 = "ۦ۬ۤ۟ۚۚۚۜ۬ۛۘۥۜۢ۟۟ۙۨ۟ۥۘۥۘۘۛ۬ۤۨۚۡۘۢۛۚۖۥ۠۫ۡۜۘۢۥۘ۬ۘۘۛۜۘۧۨۖۘۜۚ۟ۥۧۨۘۨ۬۫ۙ۠۟۫ۙۘۚۧ۬۬ۜۗۘۜۙۙۜۙ۠ۛۡۥ۫ۛۦۚ۟ۥۘۛۚۧ۠ۙۦۘۗۗۜۘ۫۟۟۬ۜۛ";
                                                                                break;
                                                                            case -358212144:
                                                                                str11 = iArr.length > 0 ? "ۖۙۖۚۖۘۘۧ۟ۖۘ۬۠ۢۜۡ۫ۦۚ۟ۖۥۛۗۨۦۧۙ۠ۤۢۜۘۙۢۢۨۗۡۧ۫ۨۤۢۥۡۗ۟ۡۢۨۖۗ۠ۥۛۢۤ۠ۦۘۥ۠۫ۡۗۙ۫ۦۘۤۦۤۖۙۨۗۛۙ۠۟ۡۤۖۘۚۛۡۘۙۡۜۖۗۜۘ۠ۜ۬ۧ۟۟۟ۙۨۤۚۤۦۨ" : "ۦۡۡۘۢۡۢۘۙۥۤۧۖ۬۬ۖۢ۫ۜۢ۫ۙۚ۫ۜۥۙۢ۟ۚ۟۟ۡۛۗۗۦۧ۬ۘۨۤۘۘۥ۫ۢ۟ۗۨ۠ۦۘۚ۠ۥۥ۬ۖ۬ۜۦ۬ۦۙۨۙۖ۠ۗۦۙۙۨ۫ۜۘۙۨۦۘ۫ۡۤۧۤۜۘۨۧۘۘ۬ۛ۠ۙۥۤۖ۟ۗۗ۠ۡۘ۫ۦۥۘۤۨۤۦ۬ۘۘۨۤۚۥ۬ۨۘۛ۟ۦۡ۬ۙ";
                                                                            case 1763308704:
                                                                                str10 = "ۜۛۥۦۜۨۘۗۧۘۘۡۦۧۚۖۖۤۖۨۘۜۨۙۦۢۡۘ۠ۚۤ۟۟ۢۘۥۘۙ۠ۦ۠۠ۛۤ۟ۥۘۚ۟۠ۙ۠ۥۗۚۧ۬ۜۙۙۦۥۘ۬ۨۧۖۨۖۛ۬ۘۜ۟ۚۜۨۡۘۖ۟ۜۘۛۦۛۥ۫ۘۘ۬ۘۥۘۧ۫ۙۡۡۦۧۙ۟۬ۗۨۥۜۦۘۤۥ۬ۤۜۖۘ";
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 1620783717:
                                                                    str9 = "ۧۗ۫ۨۥ۫۟ۛۡۢ۬ۙۦۡۧۙۢۖۥ۫ۨۘۙۖۘۨۘۗۡۚ۠ۦۨۛۦۢۛ۟۟ۘۘۧۧۙۛۧۤۧۢۜۘۨۨۛۖ۠ۨۘۘۡۜۘۢۤۤۛ۬ۘۘۨۜۜۧۛ۫ۛۜۥۖۨۢۙۖۘ۟ۛۙۖۚۜۘۥ۫۠ۘ۬ۙ۟ۜۡۥ۠۬ۢۡۘۤۜۙۙۜۙۨۙۢۢۖۢۜۚۡۨۦۘۡۙۢ";
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case -653076259:
                                                        str8 = "ۙۢۗۡۥ۠ۦۙۢۛۦۧۛۛۦۦۗ۟ۚۥۦۘۢ۫۬ۡ۫ۜۥۛۥۘۡۧ۠ۖۢۤ۫ۗۙ۟ۡ۬ۙۢۢۦۢ۫۠ۨۙ۬ۡ۬۫ۜۡۘۙ۠ۥۘ۬ۖۨۘۥ۠ۗۜۧۘۘۖۘۤۨۡ";
                                                        break;
                                                    case 2006942327:
                                                        str9 = "۬ۦ۬ۗۥۤ۠ۛۡۘۨۙۥۘۧۜۜۦۤۥۧ۠ۙۥ۬ۖۛۘۘ۫۠ۡۦۜۚۧۢۖۧۘۙۦ۫ۘۘۖۤ۫ۤۧۜۘ۟۬ۙۙۚۘۤۜ۠ۜۛۥۘۢۢۙۘۨۡۖۧۚۖۘۡۛۛۢۧۤ۬ۘۛۤۦۘ۟ۘۦۘۧۥۢۘ۠ۘۛ۬ۨۛۛۢ۬ۙۗۚ";
                                                    case 2010955327:
                                                        str8 = "ۜۧۡۘۥۦ۠ۤۥۙۨ۟ۜۘۖۘۧۘۤۛۡۥۧ۫ۙ۟ۖ۠ۤ۫ۖۙۨۡۥۘۗۢۜۘ۠ۛۙۤۙۡۘۦۗۦۚۡۥۘۘۙۡ۟ۥۡۛۘ۠ۤۘ۟ۘۘۚ۬ۧۧۥ۠ۖۘۙۡۧ۬۠ۘۢۧ۟ۚۜ۠ۨۤۗۚۧۥۘ";
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 1396038743:
                    str = "ۘۗۜۤ۬ۡۨۗۜۘۖۡ۠ۖۨۘۘۡۡۢ۬ۤۜۘۖۥۙۘۦۚ۠ۙ۫ۘۨۡۘۤۤۜۘۤ۬ۘۧۨۜۧ۠ۘۘ۫ۡۘۘ۟ۘۜۖۚۖ۟ۜۜۘ۟ۙۖۨۢۨۘۦۛ۠۟ۡۘۘۧۙۚۢ۟ۦۘ";
                    continue;
                case 1679220450:
                    str = "۬ۜ۟ۛۜۦۥۦۘۜ۫ۙۨۡۥۡۧۢۦۨۦۚۙۧۖۗۨۢۧ۫ۘۚ۬۟۫ۦۘ۫ۜۡۛ۟ۘۚۨ۟۫ۘۡۘۨۨۙۛ۫ۜ۟ۦۚ۠ۡ۠۬ۛۙۙۛۙۦۚۦۘۘۦۗ۟ۧۡۜ۠۟ۧۜۡۘۦۖۡۨۥۙۖۙۗ۠ۧۥۘۤ۠ۧ۬ۡۨۘۖۛ۫ۛۦۗۜۛۥۘۨۜۥۘۦۨۨۘۗۢۚۦۙۚ";
                    continue;
                case 1920174394:
                    super.onRequestPermissionsResult(i, strArr, iArr);
                    str = "ۛۢ۫۬۠۬ۥۥۘۘۦۛ۟ۥۧ۠ۖۦۡۘۥۚۨۚۢ۠ۤۨۙ۬ۛۢ۠۟ۥۗ۫ۦۥۢۜۜۙۥۡۘۨۘۗۢۨۛۨۨۤۛۗۢ۫ۚۤۜۘۖ۠ۨ۬ۧۖ۟ۨۡۖۧۖۢۚۗۛۖۖۘۥۗ۟ۛۨۡۘۤۤۜۘ۫۫ۤ۠ۘۨۘ۟ۙ۫ۛۥ۬ۧۢۡۘۛۥۤ";
                    continue;
                case 2140649361:
                    String str12 = "۫ۥۖۘۛۚۥۘۤۨۨۘۖ۠ۜۘۜۖۨۘۧۖۖۘ۬۠ۜۘ۫ۗۖ۠ۡ۟ۛۜۦۙۛ۫ۧۚ۫۠۫ۖۘ۫ۢۦۗ۬ۦۘ۫ۚۡۡۥۥۡۜۧۢۤۨۧۢۨۘۚ۫ۦۘۡۚۚ۟ۨ۫۟۠ۦۙۡۧۤۢۚ۬ۡۢۦۖۘ۟ۧۡۡۡۗۖۖ۬ۢۛۢۗۦۢ۬ۢۦ";
                    while (true) {
                        switch (str12.hashCode() ^ 2022915134) {
                            case -1281203761:
                                str = "ۢۧۚۚ۠ۜ۫ۨۘۘۗ۠ۥۤۦۦۦۛۛۚۛۘ۫ۚۦۧ۫ۙۚ۫ۗۦۚۨۘ۠ۨۡۖۜۧۥۘۘۖۜۡۘۥۨۘۘۧۘۢۨ۟ۢۙۤ۟ۙۗۡۘۧۧۦۜۤۖۗۘۗۛۡۘۢۥۡۘۙۨۡۖۘۦۘۗۥۦۘ۟ۖۧۘۡۥۨۡۧۡۘۢۘۘۙۛۛۧۛۚ";
                                continue;
                            case -1225097857:
                                String str13 = "ۤۧ۟ۛ۫۫ۙۙ۬ۜۚۖۦۡۘۗۘۥۘۜ۬ۧ۬ۥۛۖۖۡ۟ۥۘۢۡۨۧۥ۟ۡۨۘۜۦۦۘۧۖۢۜ۫ۖۤ۠۬۠ۗ۟ۗ۫ۥ۬ۢۦۛ۟ۖۙۦۨ۬ۖ۟۬ۥۘ۟ۙ۟ۙۥۚ۟ۥۧ۠ۥۛ۫۬ۘۘۢۗۘۢۗۡۘۧۢ۬ۤۥۗ۠ۨۦۘۤ۬ۧ";
                                while (true) {
                                    switch (str13.hashCode() ^ 1794298869) {
                                        case -1717371340:
                                            String str14 = "۫ۘۧۙۡۥ۠ۡۜۘۤۘۚۢ۟ۨۘۦۗ۫ۡۨۧۘۦۤۚۛۘۜۨۧۧۘ۫ۨۥۧۤۨۘۨۨۦ۠ۛ۟۠ۦۥۘۘۢۖۘۛۧۧۨ۠ۢۚۛۡ۬ۥ۟ۢۜۚ۫ۡۙۨۘۙۚۢۖۙۦۜۧۘۗ۠ۙ۬ۡ۫۬۬ۦۘ۟ۛۡۦۦۨۛۢۘۛۨۘ۫ۡۥۦۧۘۙۤۛ۟ۙۘۡۙۖۘۦۨ۠ۦۢۦ۟ۤۥۖ۠ۛۘۛۦ۫ۗۜ";
                                            while (true) {
                                                switch (str14.hashCode() ^ (-637622533)) {
                                                    case -1547052499:
                                                        str13 = "ۚۧۢۡۘۘۘۤۖۧۤۤۡۘۘ۬ۦۗۚۗ۫ۥۨۘۡۖۘۡ۠ۢۙۧ۠۫ۢۘۢ۫ۚۢۘۘۗۘۨۘۖۧۡ۫ۥۖۦۨۜۘۚۘۦۢۛۢ۬ۥۖۘۨۡۗ۬ۗۧ۬ۢۙۤۦۖۘۥ۠۬ۗ۟ۚۡۘ۬ۗۥۢۥ۟ۘۘۚۤ۟";
                                                        break;
                                                    case -951787657:
                                                        String str15 = "ۖۢۦ۬۟ۛۘۖۜۘۙ۫ۦۘۦۧۘۘۤۧۜۘۧۗۢ۫ۤۦۤ۫ۤۤ۫ۚ۬ۛۜۜۛۜۙۦۜۘۖۧۥ۠۬ۨۜۘۡۘۙۥۙۦۗۚۤۙۡ۠ۥۜۘ۬ۖۗۤۡ۬ۡۧۙ۠ۤۚ۠ۢۡۦۜۡۛۚ۫۟ۚۗۚ۫ۡۛۢۖۘ۬۬ۨۛ۠ۨۘۡۖۜۗۤۨ۟ۡۘ";
                                                        while (true) {
                                                            switch (str15.hashCode() ^ 852694354) {
                                                                case -1939134769:
                                                                    String str16 = "۟۟ۘۘ۠ۨۗۘۘۜۗۢ۟ۖ۫ۜ۬ۗۚۥ۫۫ۗۙۧۛۛۢ۬ۙۖ۫ۧۢۜۖۨۛۖۛۥ۟ۛ۬ۛ۟ۥۜۙۘۨۧۗۚۛۖ۟۟ۜۚۜۙۥۘۤۥۨۘۡۘ۟ۖ۠۫ۢۖۥۘۡۛۘۘۖۦۛۢۤ۫۟ۨۡۚۗۤۛۗ۟ۘۧۘۡ۫۠ۡ۬ۥۘۤۖۤ";
                                                                    while (true) {
                                                                        switch (str16.hashCode() ^ 2006218095) {
                                                                            case -2076794918:
                                                                                str15 = "ۛۖ۫ۜ۠ۡۘۚ۠۬۬ۢ۠ۦۜ۬ۗۨۨۘ۟ۢۘۚۤ۟ۧۗۢۧۜۙۗۥۖۘۨۡۛۤ۟ۛۧۥۘ۟ۧ۟ۚۨۜۘۛۤ۬ۙۛۨۘۙۡ۬ۧۧ۫۫ۚۛۧ۠ۤ۫ۥۡۘۛۘۥۧۥۧۢ۫ۧۗ۟ۘۘۤۧۖۧۢۘۘ۠ۦۦ۠ۡۧۢۨۥۥۢۗ۠ۢۤ۫ۦۘۙۨۤۥۡۙۤ۠۟ۖۡۦۢۥۥۨۗۥۖۚۤۢۜۘۘۦۜۢۢ";
                                                                                break;
                                                                            case -1038764927:
                                                                                str16 = iArr[0] != 0 ? "ۨۛۧۡۡۧۜۖۖۘ۫ۦۘۙ۟ۥۘۧ۫ۖۘۙۜۖۘ۟۠ۘۘۘۥۡۘۨۡۦۘۧۧۘ۠۬ۨۘۚۨۘۜۗۢۢۖۘۛ۟ۖۘ۫ۢۙۤۘۡۜۖ۟ۦ۬ۨۦۨۜۨۥۚۨۢۥۧۘۘ۬ۧۧۨ۬ۡۧۗۤۖۨۘ۬۫۟ۘ۠ۧۢۜۜۥۗۨۧۦ۫ۙ۟ۚۘۨۥۘۜۡۖ۠ۙۘۧ۫ۜۥۤۗۗۤ۫ۜۖۡۘۖۛۤۢ۟ۨۛ۠ۘۨۨۨ" : "ۨ۫ۨۘۨۧۙ۫ۘۙۢۖۡ۫ۨۥۗۢۨۙۦۨۘۗ۠۫۫ۙۤۦۢۡ۬ۤۦۘۨۗۗۦۦۦۘۙۥۦ۫ۨۖۙ۫ۖۘۗۜۥۘۨۤۙۦ۬ۧۦۚۡۘ۟ۙ۫ۗۛۡۘۥ۟ۜۧ۫۠ۥۙۡۜۨۨۘۤۡۘ۬ۨۘۘۜۡۥۘۖۘۦۘۗۧۨۚۤۥۘۖۢۜۘۢۤۜۚۖۨ";
                                                                            case 485635629:
                                                                                str15 = "ۖۛۦۧۧۘۘ۬ۨۛۗ۟ۜۘۗۥ۫ۛۦۢۛۗۥۛۥۜۢ۫ۜ۠ۧۖۘۘۛۜۥ۬ۜۖۖۦۖ۟ۜۚۖۘۥ۫ۜۤۦ۫ۗۢۙۘۡ۬۟۬ۘ۠ۜۥۘۙۧۥۖۘۦۘ۬ۙۦۖۥۘۘ";
                                                                                break;
                                                                            case 1286665488:
                                                                                str16 = "۬ۖ۠۬ۦ۠۠۬ۖۘۗۘۧۘ۠ۧۥۥۗۨۘۖۙۤۡۢۡ۫ۨ۬ۘ۟ۡۘۘۘ۠ۖۗۙۢ۠ۘۛۙۧۘۘۢ۟۫ۧۚۨۥۛۤۥۢۖۥ۫ۜۘ۟۬ۙۥۛۖۨۜ۬ۛۚۖۨۡۘ۫ۦۜۤۨۢۖۧۘۛ۟ۜۤ۟ۦۧۚ۬ۘۢۘۘ۬ۨ۠ۙۤۜۧۖۢۗۜۘۗۦ۠ۨ۟ۨۘۥۚۥ۫ۤ۬";
                                                                        }
                                                                    }
                                                                    break;
                                                                case 174386239:
                                                                    str14 = "ۜ۟ۥۘۗ۟ۧ۬۫ۧۥۨۢۢۢۡۘۙۙ۠ۛۡۖۙۚۙۚۦۤ۬۫۫۟ۛۜۘۜ۬ۖۘۛۥۜۛۨۨۥۥۡۘ۫ۜۦۡۤ۠۫۫ۡۥۖۥ۬ۡ۫ۨۡۥ۟ۗ۬ۛۖۜ۟۬۫ۢ۟ۛ۟ۡۧۘۘۙۤۦ۬۫ۡۧۖۦۤۖۗۖۘۘۖۢۡۧۜ۫ۦۛۚۜۧۘۢۨ۫ۙۘۨ۬ۚۢۙۢۜۦۘۘ";
                                                                    break;
                                                                case 508643969:
                                                                    str14 = "ۛ۟ۨۘۦۜ۠ۗ۫ۦ۫ۛۛۧۥۘ۫ۛۡۦۜ۟ۨۘۜۘۧۥ۫ۛۦ۬ۦۗ۟۟ۢۡۤۗۧۧۢۨۢ۫ۤ۟ۙۧۜۜۜۥۘۘۛۚ۠ۜۙۨۖ۠ۦۢ۫ۙ۠ۨۤ۟۠ۦۘۢ۠ۧ۫۫۫ۡ۠ۦۛ۫ۜۘۢۘۜۘ۠ۙۨ۫ۧۛۢۜۙ۠ۜۘۥۧۨۥۢۘ";
                                                                    break;
                                                                case 1740003432:
                                                                    str15 = "ۦۜۤۜۚۙۦ۟۬ۙۛ۟ۢ۬ۜۗۚ۫۠ۚۥۦ۫ۦۘ۬ۤۘۜۥۦۙۡۥ۠ۛۖۘۢۘ۬ۘۥۧۦۖۥۘۢۗۘۘ۫ۥۘ۬ۡۥۛۢ۠ۧۤۦ۠۟ۖۘۨۙ۬ۥۙۚۧۚۧۤۘۖۘۦ۬ۡۘ۟۠۫ۤۛۜۘۘۦۤ۟ۖۢ۬۫ۖۥۘۥۘۡۚۜۜۨۡۘۦۨۙۖ۠ۦ۫۠ۖۘۘۥۨۘۗۜۛۤۚ";
                                                            }
                                                        }
                                                        break;
                                                    case -575212224:
                                                        str13 = "ۢۙ۬۬ۙۨۖۖۢۜۜۨۘۙۨۗ۠ۙۜۘۤۤۘۘ۟ۘۧۜۦۘ۟۠ۨۧ۟ۗۥۨۧۘۨۦ۬ۨۢ۠ۖۦۘۧ۟۫ۚۙۖۦۤۧۥۨۜۘۘ۫ۗۢۥۘۘ۟ۦۚۧۘۡۨۧۘ۫ۚۡۘۢۜ۬ۗۢۘۙۨۘۛۧۗۧۚ";
                                                        break;
                                                    case -436543574:
                                                        str14 = "ۥ۠ۤۥۤۥ۠ۗ۠ۗۡۤۨۡۖۘۥۨۘۢۥۡۘۥۨۡۙۧۥۚۘ۠ۗۖۜ۟ۛۙۡ۫ۤۘۚۘۖ۟ۨۘۡ۬ۘۘۡۘۛ۠ۜۤۘۡۢۥۥۚۘۨۢ۬ۡۘ۫ۤۜۘۗۧۧۡۥۨ۬۟ۛ۠ۦۦۘۦ۟ۥۘۜۛۦۘۡۚۡۛۨۘۘ۬ۚۘۘۢ۫ۨۘ۠ۥۜۙ۟ۡۦۡۤۙۤۡۘۚۦۡۘۤۧۘۘ۠ۙۢ";
                                                }
                                            }
                                            break;
                                        case 112258805:
                                            str12 = "ۚۡ۠ۛۦۘۛۜۡۘۗۤ۫ۖۡۘۘ۬ۦۛۢۗ۫ۦۨۘۙۨ۠۬ۥۘ۠۟ۘۖۥ۠ۖ۠ۘۘۨ۟ۨۘۨ۫ۤۗۥۥۡۧ۠ۜۘ۠۠ۚۗۜۘۢۖۘۨۢ۟۟ۖۦۜ۫ۘۚۗۨۘ۫۫ۚ۟ۘۙۦ۠ۘۧۘۡۚۥ۠ۛۘۛۢۜ۠ۥۘۖۘۜ۬ۘۘ۬۬۟ۛۘۖۘۛۜۘۛ۠ۘۘۙۚۡۘ";
                                            break;
                                        case 214969737:
                                            str12 = "ۛ۫ۥۘۚ۟۫ۦۡۙۙۜۙۚ۬ۧۢۡۘ۫ۨۙ۫ۥۤۢ۠ۤ۫ۙۨۘۦ۟ۦۘۨۛۘۘۨۚۥ۬ۗ۫ۥ۟ۘۛۡۡۙۢۦۘۥۨۘۘۨۢۖۘۗۡۥۜۦۗۖ۬ۦۥۡۘۢۛۗۚۡۦ";
                                            break;
                                        case 390029312:
                                            str13 = "ۡۙۖۘۗ۬ۘۘۦۙۥ۬ۘۢ۬ۜۥۡۖۖ۫ۥۢۨ۫ۧۥۛۦۘۡ۬ۧۨۘۚۚۗۘۘۚ۟ۘۘۦۨ۫ۤ۟ۧۛۦۡۘۨۘۜۘۗۘۨ۬۟ۘۡۨ۫ۜۤۥ۬ۤۚۨۦۘۚۖۢۦۡۦۘ";
                                    }
                                }
                                break;
                            case -1093537468:
                                str12 = "ۥ۫ۖۘۥۥۡۥۜۧۡۡۜۗۥۘ۬ۚۗۜ۬ۡۘۦۡۥۘۡۥۛۦۛ۟۠ۥۛ۠ۡۜ۬۬۠ۥۛۜۧۦۥۢۗ۬ۨۢۜۚۡۜۤۘۥۦۘۛۜۨۦ۬ۜۘۤۢ۬ۦۛۤۤۗۚۢۛ۬ۛۦۜۘۖۗۜۘۧ۬ۦۛۡۚۥۜۖۘۛ۫ۤۖۡۤۨۨۧۘۖۜ۫";
                            case -775310170:
                                break;
                        }
                    }
                    break;
            }
            str = "ۢۢۙۗۤ۬ۦۛۘۘۤۚ۠ۖۙۧۥۧۖۘۦ۟ۥۘۜۥۦۥۗۛۤۧۛۡۤۗۥۗ۫۫ۗ۠۠۬ۢۢۙۜۘۛۦۧۘ۫ۖۤۜۤۨۘۡ۠ۦ۬ۥۘۙۙۜۤۢ۠ۦۛۥۙۨۥۙۡۜ";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        String str = "ۜۚۚ۬ۨۛ۟۟ۥۘ۫ۥۙ۟ۡۘۘ۟ۤۧۘۚۥۘ۟ۘ۬ۡۘۖۘۖ۬ۦۘۛ۬ۦۘۜۖ۠ۙ۠۟ۚۦۥۘ۬ۧۥ۟ۙۥۥۘۜۙۡۘ۬ۨۛۙ۫ۢۨۧ۠۫ۘۥۘۧۨۖۘۤۗۨۨۗۦ۠ۡۦۗ۠ۛۡۜۥۨۦۡۛۧۜۘ۠۠ۦۘۘۖۡ۟ۘ۠ۚۤۜۘۤۤۦۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 303) ^ 387) ^ 801) ^ 41) ^ 560) ^ 326) ^ 884) ^ 998) ^ 88) ^ 675) ^ 314) ^ 498) ^ 461) ^ 106) ^ 936) ^ 753) ^ 894) ^ 959) ^ 384) ^ 131) ^ 210) ^ 213) ^ 143) ^ 11) ^ 56) ^ 266) ^ 971) ^ 878) ^ 979) ^ 143) ^ 356) ^ (-400161249)) {
                case -1943231519:
                    CountTimerAccout();
                    str = "ۗۚۚ۟ۨۤۡ۠ۤۥۤۢ۬ۦۦۘۤۘۨۘۦۨۧۚۗۥۜ۫ۗۛ۫ۛ۫ۖۨ۟ۡۘۘ۟ۢۥۨۗۖۘۗ۫۬ۖۧ۬ۧۢ۬ۡۛۡۘۛۙۡۘ۬ۡۡۛۨۚۤۡۥ۟ۜۖ۫ۤۥ۠ۢ";
                    break;
                case 235234704:
                    return;
                case 678758013:
                    getSharedPreferences(Deobfuscator$$app.getString(-3440726214366289737L), 0).edit().putBoolean(Deobfuscator$$app.getString(-3440726446294523721L), false).apply();
                    str = "ۚۚ۫ۦ۬ۨۦ۟ۘۢۖۗۤۡۙۨۢۜۘۨۥۦۡۨۘۖۡۥۘۜۖۘ۬ۜ۟ۤۖۜۜۨۜۘۙۛۖۢ۟ۜۘۜۤۗۖ۫۫۠ۘۘۢۤۙۘ۠ۦۘۢۤۧۥۢۦۚۙۜۘۙۥۧۚ۟ۘۘۙۘۧۡۚۘۡۗۙۗۚۙ۬۟ۦۥۜۖۘۗۢۖۗۘۦۘۨۨۧۡۢۘ۟ۢ۟ۖۛۛۚۥۗ۫ۜۜۘۢۜۙ";
                    break;
                case 1050121714:
                    super.onResume();
                    str = "۫ۚۛ۟ۦۘۜ۠ۜۤۚۨۘۢۤۜۛۚۧۗۙۘ۫ۗۙ۠ۨۢۡۢ۠ۨۛ۟ۘۢۜۗۨ۬ۚۨۡۜۖۨۘۦۡۦۘ۟ۢۢ۟۟ۚۚۦۖ۬ۢۖۘۘۛۥۜۘۚۗ۫۠ۡۡۡۘۖۦۘۛ۫ۜۖۛۥۘۨۘۧۘۛۖۨۘۥ۫ۡۘ";
                    break;
                case 1662955217:
                    str = "۫ۗۨۜۢۦۘۡۚۤۧۛۦۛۘۡۤۚۘۘۡۘۡۘ۠ۧۘۧۨۡۘۗۧ۫ۙ۟ۖۢۗۜ۟ۦ۬ۛ۟۫۬ۥۗۜۖۦۙۥۘۘۜ۬۫ۦۜ۫ۢ۬ۜۧ۠ۤ۟ۚ۫ۖ۠ۗۛۙۢۧۛۡ۟ۢۢۧۚۨۧۙۢۢۥۘۧۥۤۤۤۛۗ۫ۛۨۖ۬ۙۚۜۘۖ۬ۡۨۥۖۘۡ۟ۦۡۡ۬ۤۖۢۨۡۘ";
                    break;
                case 1861204264:
                    String str2 = "ۚ۟۟۫ۘۦۘۗۛ۫۬ۨۡۡۥۚ۬۠۫ۚۦۛۥۦ۟۬ۦ۬۠ۧۜۗۨ۠ۖ۠ۥۛۦ۬ۗۖۘۘ۫ۤۦۛۛۖۗۨ۠ۤۧۘۢۢۜۚۢۗۜۘۘ۟ۦۘۢۙۚۚۧۧۚۥۨۘ";
                    while (true) {
                        switch (str2.hashCode() ^ (-774055390)) {
                            case -2116085913:
                                str = "ۚۚ۫ۦ۬ۨۦ۟ۘۢۖۗۤۡۙۨۢۜۘۨۥۦۡۨۘۖۡۥۘۜۖۘ۬ۜ۟ۤۖۜۜۨۜۘۙۛۖۢ۟ۜۘۜۤۗۖ۫۫۠ۘۘۢۤۙۘ۠ۦۘۢۤۧۥۢۦۚۙۜۘۙۥۧۚ۟ۘۘۙۘۧۡۚۘۡۗۙۗۚۙ۬۟ۦۥۜۖۘۗۢۖۗۘۦۘۨۨۧۡۢۘ۟ۢ۟ۖۛۛۚۥۗ۫ۜۜۘۢۜۙ";
                                continue;
                            case -823917822:
                                str = "ۖۥۜ۠ۤ۠ۡۚۚ۠ۥۖۗ۟ۨۛ۬ۨ۠ۚۖۧۦۘۧۦۜ۬ۥۘۡ۫ۡۜۚۖۙۡۨۘۥۘۧۤۡۘۘۧۤ۫ۜۡۜۛۗۢۚۚۥۢۨ۬ۤۧۜۥۦ۠۟ۢ۠۠ۤ۬ۜ۟ۦۘ";
                                continue;
                            case 789848804:
                                str2 = "ۦۨۜۘۚۨۙۤۚۥۖۨۖۙۨۨۘ۟ۜۗۗۥۥۘۧۦۙۦۥۦۘۚۛۥۡۙۨۛۡۜۡۘۜۡۥۖۘ۠ۡۙۛۘۧۘۖۜۘۘۚۜۘۘۗ۬ۖۨۤۖۘۤ۠ۜۚۖ۟ۥۛۛۦۡۤ۠ۘۙۗۖۖ۠ۤۡۘۖۘۛۙۖۨۘ۬ۗۨۙۧۘۨۤۗۚۗ۬ۘۥۛۛۥ۬";
                            case 1721810161:
                                String str3 = "ۨۛۡۘۨۛ۠ۘ۫ۖۦۗۛۨۘۘۨۧۜۧۘۛۤۘ۠ۨ۟ۤ۬۬ۛۧۥۨۥۧ۫ۡۚۢۖۘۦۢۡۦۡۨۜۛ۫ۙۦۤۘۤۧۖۛۡۘۙۜۥۘۤۤۥۚ۫ۜۘۧ۬ۦۚ۠ۥۘ۟۬ۗ۬ۡۛۚۡۘۘۦ۬۠۫ۦۘۨۖۡۘۨ۟ۘۜۘۤۢۧۡۜ۠۬ۥۦۘ۫ۥۡ۫ۨۙۡۗۤۢۘۜ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1765188062)) {
                                        case -571529633:
                                            str2 = "۠۬ۤ۠ۨۜۘ۫ۨۛۢۗۜۘۜ۟ۛ۫۫ۤۢۜۨۘۦۚۥۘ۬ۦۥۘۙ۠ۘۙ۬ۨۘ۠ۥۖۘۛۖۨۙۥۚۨۦۘۗۧۖ۬۟ۦۢ۠ۡۡ۠ۤ۬ۙۢ۬ۨۡۥۤۥۘۡۢۥۘۤۛۧۨۚۧ";
                                            break;
                                        case -226230045:
                                            String str4 = "۠ۚۚۨۙۥۘۘۜۜۘۨ۟۬ۨ۟ۜۘ۟ۨۗۧۥۢۛۧ۫ۗۙۚۗۙۢۥۗۖۚۥۖ۟ۙ۟۠ۡۛ۬ۨۚۤۜۦۚۗۘۖۗۦۚ۬۫ۨۨ۬ۙۚۖۚۢۘۘۚۖۙ۫ۙ۠ۛۦۤۙۜۦۘۖۨ۟ۡۤۛۨ۟ۚۥۗۘۘۛۦۘۘۚۖۨۚ۬ۛۚۚۧۤۥۨۚۗ۠ۗۧۥۛ۠ۥ۬ۜۨۖۙۥۛۦ۠۫ۡۖ۟ۨ۫ۗ۫ۚۡۦۡۘ";
                                            while (true) {
                                                switch (str4.hashCode() ^ 2095179240) {
                                                    case -1993991349:
                                                        String str5 = "ۡۜ۬۠ۗۜۘ۟ۡۧ۠ۛۗۛۛۥۢۜۥۖۙۜۘۚۦۦۘ۫ۘۗۛۜۢۛۥۧۘۖۧۢۛۖۙۢۧۛۢۤۙۜ۫ۛۗۦ۟ۘۜۗۤۤۤ۬۫ۧۧۜۙ۠ۧۧۜۙۦۛۨۘۥ۫ۙۢ۬ۥۘۥۙۛۘ۠ۥۥۙ۫۫ۙۖۘۤ۫ۦۧۥۖۦۜۘۙۥۨۘۛۜ۫";
                                                        while (true) {
                                                            switch (str5.hashCode() ^ 1901376193) {
                                                                case -1010596136:
                                                                    String str6 = "ۡۧۗۦۤۖۘۙۤۨ۠۟ۧۜۢۖۘۦۨۦۘۥ۟ۥۘۙۤ۬ۗۤۛۜ۟ۨۘۖۛۥۘ۫۫ۜۘ۫ۗۦۘۤۘۥۡۤۛ۠ۛۛۖۦۖۘۗۤۖۧۤ۫ۘۤ۠ۗۦۗ۫ۜۘۢۚ۫ۗۘۙۙۨۗۤۘۚۨ۟ۖۘۤ۠ۛۡۘۨۚۜ۫ۛۗۨۙۧ۬ۨۘۘۡۙۙۜۘۛۨۤۤۗۘۖۥۘۤۢۙۗ۬ۘ";
                                                                    while (true) {
                                                                        switch (str6.hashCode() ^ (-1422895482)) {
                                                                            case -1054976028:
                                                                                str6 = "۬ۤۙۧۖۧ۟۠ۡۧۥۚ۟ۦۧۖۗ۫ۤۜۘۚۨۥۘۘۜۥۡ۬ۡۘ۠ۚۜ۟۬ۥۡۥۖۙ۠ۥۚۗ۠ۙۡۙۢۢ۠۬ۙۧ۠ۙۛۘۘ۠ۖۨۘۘ۬ۥۘۤۦۚ۠ۥۧۥۗۥۘۤۜۘۡۛۤۦۡ۟ۤۡۙۦۢۡۙۘۧ۫۟ۙۛ۫ۡۘ۟ۢۨۘۗۚۘۘۥۛۛ۠۫ۙۥۦۡۜۥۦۙۥۦۛ۫ۨۜ۬ۢ۠ۙۖۥۦۖۖۚۤ";
                                                                            case 296096356:
                                                                                str5 = "۟ۖۛ۬ۖۨۧۨۘۥۘۡ۫ۢۦ۫ۛۡ۠ۗۢۨ۟ۤۚۘۧۡۡ۟۟۟ۨۘۢۚۤۢۖۜۘۥۦۖۜۦۛ۫ۢ۠ۜۗۡ۬۠ۨۨ۫۫ۤ۬ۦۘ۫ۗۤۨۘۘ۫ۨ۬ۘۚۡۘۙ۫۬۬۠ۖۘۤۖ۠ۗۥۡۡ۫ۘ۫ۧ۠ۚ۫ۧ۫ۨۘۤ۬ۛۡۖۘۧۜۥۦۦۥۘۥۥۨۖۡۗ۟ۥ۟ۢۚۥۘ";
                                                                                break;
                                                                            case 747152477:
                                                                                str6 = getSharedPreferences(Deobfuscator$$app.getString(-3440726321740472137L), 0).getBoolean(Deobfuscator$$app.getString(-3440726278790799177L), false) ? "۟۠ۥۖ۬ۦۘۡ۠ۦۖۦۜۘۢۗۦۢ۫ۖۢۦۚۧۙۡۘۧ۟۬۠۫ۗۢۛۖۨۦۜۦۡۜۛ۬ۙ۟۟ۙۦۡۤۚۨۙۛۗۥۥۖۘۤۡۖۤۡ۬ۥۛۤۥۢۤۛۢۢ۟ۧۦ۬ۖۡۘۛ۠۫ۙۡۡۘۘۥۡۘۖ۬ۧ۫ۗۨۢ۬ۙ۠۠ۨۘۥ۠ۦۘۖۤۘ" : "ۗۨۜۗۤۘ۠ۗۥۘۥۧۧۖۘۢۥۜۙ۬ۗ۬۠۫ۨۢۥۖ۫ۡۖۘۖۗۘۘ۫ۖۧۙ۬۫ۜۢ۫ۡۧۡۘ۬ۜۗۘۧۘۛ۟ۙ۟۠ۨۜۛ۠ۨۖۚۙۘ۬ۖۤۛۢ۠ۜۘ۠۟ۨ۠ۥ۬ۦۨۦۧۡۗۡۥۨۘ۫ۛۥۗۚۥۥۧۛۦۧۡۘۙ۬ۜۡۡۡ۟ۢۥۗۚۗۢۨۙ۟ۦۘۘ۬ۘۖۗ۟ۧۙۦۖۜۨۦۥۖ۟ۦۨۢ";
                                                                            case 1581469565:
                                                                                str5 = "ۗۘۗۢۙۚۥ۟ۥۘۗۘ۟۬ۨۗۚۥۢ۟۫ۘۧۦۘۤۙۨۘ۠۟ۛۜۗ۬ۙ۟ۖۘۧۚ۬۫ۤ۠ۢۥۤ۫ۘۥۘۨ۟ۦۘۜۛۥ۟ۤۚ۬ۘ۟۟ۦۜ۟ۜۥۚ۬ۡۚۖۖۘۦ۫ۖ";
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 466527135:
                                                                    str4 = "ۘۖۨۘۚۙۢ۠۠ۖۘۦ۫ۚۜۜۛۥۘۖۘ۫ۢۗۘۤ۟ۤۛۜۘۘۤ۬ۥۦۘۛ۬ۨۘۖۜۨۘۡۦۦۘۥ۫ۘۘۚۤۡۡۚۖۘۧۡۛۦۙۙ۟ۖۨۧۛۥۘۧۨ۫ۜۡۤ۫۫ۨۘۖۖۚۨۡۢۛ۬ۦۤۗۘۤۦۖ۟ۗۙۘۥ۫ۦۗۛۗۖۤۢ۫ۤۖۛۘۘ۟ۨۥ۫۬ۖۘۧۖۧۘۖۚۨۘۖۡۢۖ۬ۘۘۤۘۨۗ۠ۡۢ۠ۦ۠۬";
                                                                    break;
                                                                case 1629586511:
                                                                    str4 = "ۧۢۥۘۡۖۘۦۙۥۛ۫ۜۚۨۨ۟ۙۜۘۜۧۖۘۦۜۙ۫ۦۘۘ۬۬ۖۛۦ۫ۦۘۚۖۥۘۘۥۜۤۨۧۨۨ۫ۗۢۦۗۘۚۡۘ۟ۡ۟ۤۡۥۜۨۧۘۛۨۢ۬۠ۖۘ۠ۗ۬ۗ۬ۨۘۧۙۢۡۖۖۙۜۥۘ۟ۛۧۤۥۙ۠ۤۦۘۙۚۘۢ۠ۥۤۛۦۚۙۡۘ";
                                                                    break;
                                                                case 2013038540:
                                                                    str5 = "۟ۜۘۖۜۨۧۖ۫۟۠ۨۘۦۖۦۘۖ۟ۜۘۗ۬ۨۘۘۥۨۘ۫ۗۤ۠ۙۧۨۥۘۤۤ۠۠ۗۙۤۘۚۖۗۤ۠۠ۥۘۢۗ۠۟ۘۨۘۥ۫ۤ۠ۙۡۘۙۦۛۜۥۢۥۡ۬ۦۗۜۘ۠ۖۡۘۖۘۖ۠ۜۗۤۡۘۜۖۦۘ۠ۘۥۘۡۥ۫ۥۖۛۙۛۨۙ۟ۨۘۨۙۖۘ";
                                                            }
                                                        }
                                                        break;
                                                    case -892624654:
                                                        str4 = "ۡۨ۠ۤۢۢۨۖۚۥۤۙ۟ۜۢۥۖۛۧۘۡۘ۫ۛۜۘۥۡ۠ۘۘۧۚۛۗۗۢۛۦۧۨۗ۟ۥۘۙۙ۬ۘ۟۠ۛۡۦۘۙۧۨۡۢ۫۟ۢۜۘۢۗۢ۬۟ۤۛۢ۫۫۠ۡ۬ۧۦۘۧ۠ۢۤۗۘۘ۟ۛۛۦ۬ۥۨۡۢ۟ۨۛۧ۟ۡۤۖۙۦۥ۟۟ۛۘۘ";
                                                    case -487428175:
                                                        str3 = "ۙ۫۟ۘۥۨ۫۠ۙۘۥۦۘۨ۫ۖۘ۫۟ۜ۫۠۫ۙۦۡۨۛۜۘۡۧۚ۟۠ۖۜۧۛ۫۬ۡۘۜۗۗۜۘۙۡۢۜۖۚۖۘۜۡ۫ۢ۟ۥ۠۟ۜۢۨۗ۫ۚۘۘۥۦۡۘۚۘۡۘۡ۟ۦۚ۟ۤۗۥۜۘۢ۠۠ۤ۬ۢۚۥۗ";
                                                        break;
                                                    case 973262475:
                                                        str3 = "ۤۤۡۘ۟ۤۥ۟ۢۦۜ۟ۛۤ۬ۘ۟۟ۘ۟۫ۜۘۖۥ۟ۧۙۗۖۦۖۘۢۘۖۘ۟ۦۥۖۚۦۘۘ۫ۙۚۧۘۘ۫ۦۙۡ۬ۗۗۗۧۜۧ۟ۨۨۤ۟ۥۢۨۧ۟ۖ۠ۡۨۦۗ۫ۚۖۧ۫ۗ۫۫ۤۤۥ۬ۧۗۗ۫ۖۛ۟ۥۢۘۥۙۦۘۦ۠ۚۧۥ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case 596474806:
                                            str2 = "ۘۢۖۘۨۧ۫۟ۖ۠ۡۜ۟ۢ۬ۚۦۧۚۥۨۘۗ۠۬ۙۧ۬ۘ۠ۨ۟۬ۦۘۢۧۢۢۗۗۤۖۛۦۘ۟۫ۜۘۘۤۥ۫ۨۨۤۚ۫ۨۢۢ۟ۛۧۘۧۘۛۖۜۤ۬ۢ۫ۘۘۘۗۘۛۖۨۘۨۧۤ۫ۗۙۖ۬ۜۛۧۜۘۦۜ۫ۙۚ۠ۜۛۖۥۡۥۖۡۡۥۗۦۘ۬۟۫ۨۦ۫ۖۙ۠۟ۚۜۘ۟ۦۖۘۦۦۦۘۡ۫ۖ۬ۤۨ";
                                            break;
                                        case 859245199:
                                            str3 = "ۗۖۡ۠۬ۡۘ۠ۢۘۘۚۦۙۚۡۚۢ۟۠۟۫ۥ۬ۖۖۨۙۚ۠ۥ۫ۖۛۥۘۗ۟ۧۢۤۡۘۛۚۦۘ۬ۖ۬ۖۗۜۚۙ۠ۢۙ۬ۖۥۢۗۖۜۘۗ۬۫ۡۡۜۢۡۛۖۤۨۘ۠ۥۗۨۛۢۧۚۜۧ۟۬۟ۡۗۗۨۘۘۜۖۢ۬ۖۘ۠ۚۦۘۘۦۨۘۤۖۦۘۛ۬۫ۗۡ۟۬ۜۖۖۛۢۗۖۙ";
                                    }
                                }
                                break;
                        }
                    }
                    break;
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        String str = "ۦۗۤۛۚۢ۠ۦۡۨۖۜۜۘ۠ۨۨۘۙ۬ۖۘ۠ۗ۬ۘ۟ۡۘۡۧ۠ۦۥۖۤ۠ۘۜۨ۫ۛ۬ۡۘۡۦۙ۟۠ۛۡۡۥۘۦۥۚۖۡۖۘۗ۠ۗ۠ۚۖۘۚ۫ۜۙ۫۬۟ۚ۠ۚۛۘۘ۠ۚۘۘۘۤۜۘۧۚۗ۬ۡۦۘ۟ۙۡۖ۫۠ۨ۠ۥۜۜ۬ۤ۟ۦ۬ۤۖۘ۬ۢۦ۬۫ۖۡۖۘۘ۟ۗۘۘۜۘ۫ۘ۬۫۟۠ۨۚ۟ۖۨۦۧۘ۠ۚۦ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 218) ^ 38) ^ 285) ^ 50) ^ 808) ^ 129) ^ 733) ^ 524) ^ 361) ^ 924) ^ 375) ^ 601) ^ 134) ^ 551) ^ 773) ^ 743) ^ 459) ^ 935) ^ 535) ^ 9) ^ 939) ^ 33) ^ 428) ^ 309) ^ 836) ^ 892) ^ 358) ^ 889) ^ 593) ^ 905) ^ 658) ^ 1485681913) {
                case -1754065568:
                    str = "۫ۙۦۗۦ۫ۚۤۥۚۜ۫۟۬ۖۘۧۘۧ۬۫ۡۦۘۚۥۗۨۘۡۘۛۛۜۘۦۛۧۡ۬ۚ۫۬۟ۦۚۖۙۨ۫ۗۧۦۤۖۘ۫ۗۖۖ۬۠ۙۖۡۘۡۡۧۘ۟ۧۖۤۥۥۘۧۙۡۦۥۨۘۙۗ۬ۡۚۦۘۛۛۘۘۙۛۨۘۘۧۨۘۗۡۥۘ۟ۛۜۖ۟ۥۖۥ۬";
                    break;
                case -1644680752:
                    super.onWindowFocusChanged(z);
                    str = "ۖۘۦۘ۠ۢۖۘۗۤ۟۠ۗۚۜۢۢ۫ۛۜۨۗۥۘ۠ۡۡۦۛۛۖۙۥۘۧۦۥ۬۟ۥۗ۠۬ۤ۫۫ۥۙۜۘ۬۠ۙۧۨۥۚۨۖۜۨۛ۫ۢۙۗۢۧۥۚۖۖۜۖۙۛۙۦۥۖۧۜۜ۠ۡۦۗۦۦۙ۠ۨۖۤۨۜۨۜۘ۟ۖۡۙۧۧۢ۠ۦۖۡۜۘۙ۬ۗۛۤۢ۬۟ۙۘۚۢ";
                    break;
                case -502883487:
                    hideSystemUI();
                    str = "ۛ۠ۜۦۜۗ۠ۗ۠ۛ۫ۚۚ۟ۦۘۥ۫ۛۙ۫ۦۘۡۥۢۖ۬ۖۘۖۢ۟ۖ۫۠ۨۗۖۤۚۘۥۧۦۨۘۦۥۛۡۤۡ۠ۘۢۥۘۘۢۥۘۥۨ۟ۙۢۡۘۨۧ۠ۛ۫ۚۡۜۡۘۙۧۘۘۘۗۡۘۡ۫ۖۙۧۜۨۢ۫ۖۖۜ۬ۘۡۢۦ۬ۖۘۛۙۡۡۘۗۤۖۤ۫۫ۖۤۙۤۡۥۧۖۗ۫ۖۚۦۗۜۤۖۡۥۦۗۖۘۥۨۜۘ";
                    break;
                case 526660454:
                    showSystemUI();
                    str = "ۧ۬ۡۘۢۧۦۘ۠ۚۨۘ۟۬ۥۢۛۖۘۗۧۛ۫ۤ۫ۘۨۛۘۜۢ۫۬۫ۨۗۢۡۙۦۘۡۥۤۗ۬ۗ۫ۥۥۡۥۨۘ۬ۚۗۦۙۜۖۚۥۥ۫ۡۘۧ۟ۦ۟ۚۨۥۥۗۗ۠ۜۜۧ۫ۜۜۢۙۜۤۨۢۗۦ۬ۚۤۜۧۘ۬ۢۤۧۗ۟ۡۗۗۙۨۥۢۨۢۦۥۖۘۗۡۡۘۧۙ۟۬ۨۖۛ۫ۨۨۘۧۘۧۧۜۙۥۜۘ۬ۙۧۤۜ۟";
                    break;
                case 1068123454:
                    String str2 = "ۙۤۜۘۗ۟ۜۛ۟ۚۚۖۖۘۘۘ۬ۚۨۧۘۢۤۜۦۦۨۘۨۦۡ۟۬ۘۜۥۡۘۥ۫ۦۘ۬ۚۜۚۜۚۥۛۥ۠ۗ۬ۖۘۢۧۥۙ۟ۨۘۨ۬۟ۨ۟ۨۘۧۙۥۘ۫۠ۚۦۡ۟۠ۗۨۧۧۖۥۜۧۘۦۢۖۘ۬ۙۡۦۙۜۧۨۡۘۚ۬ۘۤ۫ۦۙۥ۟۟ۦ۟۠ۨۗۡۚۘۘۚۢۘۘۛ۠ۘ۫ۤۘ";
                    while (true) {
                        switch (str2.hashCode() ^ (-978167129)) {
                            case -994069511:
                                String str3 = "ۥۗۖۘ۫ۘۙۚ۟ۖ۬۟ۖۘۡۤۖۤۖۗۤ۠ۨ۠ۙۤ۠ۗۖۘ۫ۛ۫ۧۥۖۘۘۙۨۥۨۥۘۨۡۦۙۤۦۦۘۧۡۦۙۛۙۜۘۜۧۘۥۘۡۘۛۗۨۛۡۖۥۥ۫ۨ۬ۧۨ۫ۦ۬ۦ۟ۖۖۘۛۚۘۥۨۙۙۛۜۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-945775311)) {
                                        case -890851702:
                                            str2 = "ۛۨۖۘۨۦ۫ۤ۟ۧۘۖ۠ۦۤۡۤۜۜۘۚۛ۫ۤ۠ۘ۠ۙۘۘۚۢۘۘۛ۬ۗۥ۠ۥۘۢۙۤۤۛۗۡۥۖۘۡۙ۫ۧ۠ۜۘ۫ۨ۫۫ۡۢۨۘۚۧۖۘۛۧۤۘۥۧ۫ۤۗۤۡۤۗ۫ۨ۫ۗۖۘۧۖۦۘ۬ۨۖۡ۬ۖ";
                                            break;
                                        case -94038199:
                                            str3 = "ۧۥۨۘۖۨۥۡۙۜۥۧۢۤۘۡ۬ۙۘۘۤۦۘۥۤۜۘۜۚۜۘۚۛ۫۬ۥۧۢۙۜۖۢ۟ۦۧۡۘۛۥۗ۬۠ۘۘۚۘۗۜۢۘۘۡ۫ۙۦ۟ۜۦ۬ۚۤ۠ۧۛۗۧ۬ۢ۫۟ۗ۟ۥۡۚۖۜۨۛۘ۠۫ۖۧۘ۬ۜۡۘۢۢۥۡۦۘۘۧۖۘۨۧۗ۫ۥۦۘ";
                                        case 285840042:
                                            str2 = "ۢۚۦۘۧۨۥۦۖۦۛۦۛۚ۬ۛۢۜۚۥۘۡۘۘۘۖۘۚۤۗۛۙۡۘۦۛۢۛۥۨۤۖۡۘۘ۠ۦۘۗۤۥ۬ۦۡۘۧۗ۬ۨۤ۠۠ۚۛ۬ۧۨۥۜۧۘ۟ۢۖۜ۬ۛ۫ۢۦۘۡۘ۠ۤ۠ۥۥۨۖۡۙۛۖۥۘۡۨۧۜ۠۠ۛۛۖۥۚ۟۫ۜۜۜۘۘ";
                                            break;
                                        case 1411497934:
                                            String str4 = "ۡۡۙۤ۬۠ۖۖۧۘۢۙۥۘۦۙۛۗۡۖۡ۠ۤۖ۫ۜۘ۠ۖۖۘۜۜۡۤۨۘۢۜ۬ۚۚۦۘۢۦۘۘۗۧۧ۬۬۟ۜ۬ۜۦۚ۠ۗۜۥۛۧۖۘ۫ۥۡ۠ۚۨۙۘۛۧۘۦۚۢۡۘۜۙۡۘۚۜۦۤۜ۫ۖ۬۬۬ۘۢ۠ۦۥۘۜۨۜۘ۠ۘۧۖۧۗۦۜۦۥ۠۟ۦ۫ۡۘ۟ۚۧۚ۠ۜ۠ۖ۫۟ۤۨۘۨۨۖۜۢ۫ۖۢ۬ۖۜۦ";
                                            while (true) {
                                                switch (str4.hashCode() ^ 2041152220) {
                                                    case -257386408:
                                                        String str5 = "۟ۧ۠ۗۡۘ۫ۜۜۙۦ۬ۙ۫ۗ۠ۤۨ۬۟ۨۡۥۡۘۛۘ۟ۗ۬ۦۥۥۦۡۛۘۘ۫ۤۙۦۛۚۗۨۘۨۙۦۘۦۥۥۘۜۡۙۤ۫ۚۘۨۛۤۢۚۨۚۦۚۚۖۘۧۘۧۘۜۨ۠";
                                                        while (true) {
                                                            switch (str5.hashCode() ^ 972654508) {
                                                                case -2032681579:
                                                                    String str6 = "ۖۗۦۘۚۖۛۛۗۨۘۧۦۨ۫ۨۜۘۨۧۚ۫۠ۢۨۨۘۤۦ۬ۛ۟ۛۖۛۢۢۥۧۢ۟ۙۧۦۘۘۜۢۥۘ۬ۢ۠۬۠ۧ۫ۨۛ۬ۜۦ۟۫ۨۘۢۛۖۘۙۢۖۘ۬ۤ۠ۜ۟ۧۛ۫ۛ۟ۨۨ۠ۤۧۚۡۛ۬ۘۜۘ۟ۖۛۧۚۨۘ۠ۦۛۛ۬ۜۡ۠۬۟ۜۡ";
                                                                    while (true) {
                                                                        switch (str6.hashCode() ^ 1400519416) {
                                                                            case -867512324:
                                                                                str6 = z ? "ۢۛۗۙۢۙۥ۫ۙۧۢۢۥ۠ۡۖۨۡۘۢۗۢۦۦۙۡۢۘۘۨ۫ۢۦۤۘۘۚۦ۠ۗۙۘۘۤۡۢ۫۟۠۠ۡۖۢۗۙۡۦ۫ۦ۫ۦۘۧ۫۫۬ۢۧ۟۬۟ۜۡۧۖ۫ۨۖۤ" : "۟ۤ۬ۥۡ۟ۡۗۦۦۗۘۜۖۨۘۚ۬ۡۢۨۘۚۦ۠ۥۨۖۘۤۥۖۖ۫ۚۖۘۦ۟ۖ۟۫۬۫۟ۨۙۘۡۘۧۡۦۘۨۚۡۘۜۗۘۘۧۘۥ۠ۥۧ۬ۘۚۛ۫ۖۘ۟ۜۧۘۛ۬ۥ۬ۙۨۨ۫۠ۧۤۨ۠ۖ۟ۜۡۜۦۛۖۖۤۡۘۥۡۘۧ۫ۘ۟ۧ۫";
                                                                            case -373455081:
                                                                                str6 = "ۡۥۚۗۦ۫۟ۙ۠ۘۨۘۙۡۨۨۙۧۥۘ۬۬ۜ۬ۗۗۙۨۥ۟ۧۗۗ۬ۜۜۘۨ۠ۨۦ۫ۨۜۘۖ۬ۨۙۗۦ۫ۦۙ۟ۢ۬ۜۖۧۥۦۘۘۜۢۥۢۥ۫ۤۖ۬ۖۚۖۘۖۧۥۢ۬۬ۖۘۚ۟ۘۛۚۖۗۙۛۦۘۜۥۦ۟ۘۡۤۘۥ۬ۛۨۤۚۨۘۧۡۧۘۘۡۦۜۚۘۖ۟۫";
                                                                            case -61424380:
                                                                                str5 = "ۜۧۜۘۦۜۥۢ۟ۧۚۦۥۘۘۢ۫ۚۤۢۡۛۚۢ۫۟ۡۗ۠ۡۛۦۡۥۙۚۦۖ۫۬ۜۘۧۡۦۧ۫ۦ۬ۥۖۘۚۚۡۘۧۙۤ۠ۛۖ۫ۜۘۨۗ۬ۖۧۨۘۢۧۡۡ۬ۡۙۤ۠ۜۙۦۘۧۖۘۥۗۤۧۗۜۘ۟ۥ۠";
                                                                                break;
                                                                            case 1301179156:
                                                                                str5 = "ۗۙۢۢۘ۬ۗۘ۠۠ۙۙۢۦۙ۫ۢۨ۫ۢۖۢۚۨۘ۬ۨۙۨ۫ۦۖۧۦۘۛۚۛ۟ۡۦۖۤۙۥ۬ۜۘۛۘۖۘۥ۟ۘۦۧۜ۟۬ۖۘ۠ۘۥۘۗۥۧۨۖۡۘۜۡۨۘۡۨۥۘۜۖ۬ۤۧۦ۬ۡۖۡۘ۫ۛۦۢۡۘۗۤۨۦۦۛۢۚۨۧۡۢۨۨۤ";
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 395279314:
                                                                    str4 = "ۤۦۖۘۦۘۢ۬ۗۨۘۙۨۗۥۤۡۘۛۘۛۥۨۜۘۦۙۜۘۚۘۗۨۛۗۛۛ۫ۡ۠ۜۘۛۜۥۤۚۛۘۜۖۘ۬۬ۚۨۚۖۘ۟ۨۙ۟ۢ۟ۦۜ۠ۘۥۚۢ۟ۡۘۙۡۘۧ۠ۙۛ۬ۘۘۚۧۚۤ۟ۦۜۙۖ۫۠ۗۛۨ";
                                                                    break;
                                                                case 570051657:
                                                                    str4 = "ۜۗۜۘۖ۟ۡۘۛۨۥۦۛۖۘۧۤۥ۟ۙۤۧ۬ۤ۟۠ۨۘۥ۫ۨۛۥۢ۠ۧۖۜ۠ۖۘۥۤ۫ۚۗۗۧۧۨۘۦۘۖۘ۠ۡۘۘۢۙۜۘۖۦۘۛۜۡۘ۬ۧۡ۠ۖ۠ۜۨۘۚۘۨۘۡۗۜۘ";
                                                                    break;
                                                                case 2077410204:
                                                                    str5 = "ۨۡۙ۬ۚ۟ۨ۬ۗۘۤۥۗۨۘۦۥۨۚۦۡۧ۠ۤۚۤۧۤۘ۠ۦ۬ۤۘ۠ۘۡ۫۬۬ۛۤۖۡۜۡۘۨۚۗۙۤۤ۠ۜۥۘ۠ۤۘۘۡۘ۠۠ۦۘۥ۫ۖۨۧۘۧۗۢۗۥۥۘۗ۟ۦۘۢ۬ۛۧ۠ۗۧۧۖۘ";
                                                            }
                                                        }
                                                        break;
                                                    case 627259898:
                                                        str3 = "۫ۥۜۛۦۘۘۧۖۦۘ۬ۜۘۘۘۖۜۨۧ۫ۚۦ۫۠ۧۖۢ۠ۘۖ۬۟۬۫۟ۛ۫ۘۘۧ۫ۜۘۜۖۤۛۢۦۘۤۛۘ۬ۗۨۛ۬ۡۘۖۨۘۘۜۤۡۥۥ۠ۙۜۤ۬ۧۘۧ۬۬ۥۙۗۧۥ۬ۖۗۤۥۦۢۘ۠ۜۘۢۢ۬ۤ۟ۖۘۙۥۛۜۦۙۛ۬ۦۨۡ۠۟ۘۥۛۡۧۘۘۛۘۘۤ۠۬۫۫ۨۘ";
                                                        break;
                                                    case 1139293413:
                                                        str4 = "۬ۛۘۘۤۨۡۚ۬ۥۘ۫ۚۨۘۨۘۚۖۖۢۚۤ۫ۙۨۨۘۧۥۦۘ۠ۤۥۘ۫ۤۦۨ۫ۜۘۘۦۢۙۖۘۘۨۜۜۘۡۧۘۘ۬ۢ۫۬ۘۘ۟ۢۗۨۢۦ۠ۜۘۘۢ۫ۘۘۜۧۛۗۚۜۧۧۨۘۖۥۜۘۖۤۤۨ۠ۗۙۡۧۘ۬۠ۛۨ۠ۢۥۖۙۨۖۥۚۘۨۚۤۖ";
                                                    case 1249935211:
                                                        str3 = "ۤۡ۫ۚۨۖۘۤۚۦۧۘ۫ۤۘ۫ۦ۫ۚ۫ۧۜۘۙۡۦۦ۬۫ۗۡۘۜۗۘۘۨۦۧۘۡۦۡۥۜۘۘۖۧۛۘۘۤۜ۫ۗۤۥۘۘۡۡۘ۠۫ۧۥۜۡۚ۫ۢۖۥۖ۠۠ۨ";
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                            case 289397276:
                                str2 = "ۡ۫ۜۡۥۜۚۧۖۘ۟ۖۙ۠ۨۦۘ۬ۧۨۘۖ۟ۜۘۦۗ۫ۜۗۡۘۨ۠ۖۜۗۤۨۛۨۘۛۢۦ۠ۨ۟ۜۙۤۢ۠ۤۦۛۡۘۦۦۥۙ۫ۘۘۘ۫ۙ۟ۥ۬ۧ۫ۘۘۢۨ۬ۥۛۖۙۙۥۛۛۡۘۥۦۚۨ۠ۤۦۘۨۥۦ";
                            case 657142192:
                                str = "ۧۢۙ۠۫ۨۘۗۢۜۖۧ۠ۖۗۘۗۘۘۧۜۖۘ۟ۧۜ۟۫۫ۘ۬ۡۨۤۥۖۧۘ۟ۦ۫ۤۡۘۡۨۗ۬ۦ۠ۛۘۘۥ۟ۨ۫ۡ۬ۡ۠ۘۚۢ۠ۥۙۨۘۢ۫ۚۤۤۘۛۡۡۘۛۛۚۗ۟ۦۘۧۗۡۚۡۧۨۡۘ";
                                continue;
                            case 1156058836:
                                str = "ۘۨۢ۟۬۫ۘۙۨۗۚ۬ۥۡ۬ۖۡۤۜۤ۟ۗۥۚ۠ۜۖۡۡ۠۠۟ۗۦۥ۬ۗۖۘۖ۠ۤۢۚۦۦۜ۫ۡۗۖۘۜۙۘۨ۠ۜۘۨۦۙ۠۬ۡۡۛۜۘۘۤ۫ۨۤ۬ۦ۫ۡۧۡۡۘۖۦ۠ۚۦۙۖۜۖۨۤ۫";
                                continue;
                        }
                    }
                    break;
                case 1308117035:
                    return;
                case 1354442391:
                    str = "ۧ۠ۦۦۡۡۧۤۙۛۨۘۘۖۚۚۧۧۨۖۢۚۥۜۥۖۥ۫ۜۡۖۤۨۗۘۥۖۨۘۢۥۖۘ۬ۜۙۤۡۛ۫ۧۙۜ۫ۜۡۧ۟ۛۘ۬ۧۜۘۘۛۢ۠ۨۢۘۘۗۧۢۦ۫ۦۘۧۙۖۚ۠۬ۜۨۢۘ۠۠ۤۜ۟۟ۨۢ۟ۛۢۢ۬۟ۖۦۨۗۢ۟ۜۡۘ۟ۢۜۘ۫۟ۦۜۦۡۨ۠ۘۘ";
                    break;
                case 1715069127:
                    str = "ۧ۬ۡۘۢۧۦۘ۠ۚۨۘ۟۬ۥۢۛۖۘۗۧۛ۫ۤ۫ۘۨۛۘۜۢ۫۬۫ۨۗۢۡۙۦۘۡۥۤۗ۬ۗ۫ۥۥۡۥۨۘ۬ۚۗۦۙۜۖۚۥۥ۫ۡۘۧ۟ۦ۟ۚۨۥۥۗۗ۠ۜۜۧ۫ۜۜۢۙۜۤۨۢۗۦ۬ۚۤۜۧۘ۬ۢۤۧۗ۟ۡۗۗۙۨۥۢۨۢۦۥۖۘۗۡۡۘۧۙ۟۬ۨۖۛ۫ۨۨۘۧۘۧۧۜۙۥۜۘ۬ۙۧۤۜ۟";
                    break;
            }
        }
    }

    public void resetSettings() {
        String str = "ۛۡۚۦۙۜۘ۟۬ۚۖۘۦۛۜۘۦۥۢۜۚۥۧ۫ۛۡۢۙۡۘۖۖ۫۟ۚۖۘۥ۫ۦۘۛۥۚۖۜۧۘۗ۠ۜۤۗۨۗ۠ۡۘۙۦۦۘ۬ۡۦۘۘۘۦۘۘ۬۫ۥ۬ۨۘۖۡ۟۬ۤۤ۬۟ۚ۠۬ۖۖ۬ۗۖۥۨۦۛۥۘۙۡ۟ۧۚۥۘۗۤۨۘۡۦۗۘۥ۫";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 386) ^ 559) ^ 349) ^ 235) ^ 291) ^ StatusLine.HTTP_TEMP_REDIRECT) ^ 534) ^ 204) ^ 453) ^ 811) ^ 615) ^ 218) ^ 605) ^ 676) ^ 353) ^ 116) ^ 354) ^ 861) ^ 825) ^ 336) ^ 886) ^ PointerIconCompat.TYPE_ALL_SCROLL) ^ 702) ^ 968) ^ 761) ^ 589) ^ 291) ^ 490) ^ 206) ^ 51) ^ 740) ^ (-1970316463)) {
                case 243859599:
                    str = "ۙۧ۟ۜۛۖۡۛۗۧۙۤۡۧۗۚۜۘۛۚ۬ۨۢۚۨۗۗۨۥۛۙۧۘۗۡۖۘۥ۠ۙ۠ۜۘۨۖ۫۫ۤ۬۬۟ۜۘۡ۠ۦۘ۟ۢۜ۬ۨ۠ۗۦۚۚۢۨۘۘۤۚۨۧۥۘۢۛ۫۟۫۫ۙۖۨۖۜۖۘۜۦۧۚ۠ۧ۫ۥۜ۫ۤۚ۠ۜۖ۬۠ۘۖۚۜۨۢۗۤۜۧۘ۬۬ۡۘ۫ۗۡۘۥۧۥۘ";
                    break;
                case 514396487:
                    Toast.makeText(this, getString(C0931R.string.str00e0), 0).show();
                    str = "ۧ۬ۙۥۗۧ۬ۛۚۜۤۤۙ۫ۦۙۗۥۘۘۛ۠۬ۨۨۚۡۚۧۧۨۗ۠ۧۡۘۧۡۘۚۗۧۨۘ۠ۚۧۚۦ۬ۥ۫ۧۦۘۙۧ۫۠ۦۧ۟۫ۖۘۧ۫ۥۦ۬۠ۜۥۙۚۙۧ";
                    break;
                case 1551118463:
                    getSharedPreferences(Deobfuscator$$app.getString(-3440727030410075977L), 0).edit().clear().apply();
                    str = "ۦ۠ۡ۬۬ۢ۫ۚۖۘ۟ۚۛۨ۟۫ۥۥۖ۫۬ۡۘۦۨۘۘۜۘۦ۠ۦۧۘۛۙۦۘۛۥ۠ۚۚۖۡۘۧۘۛۥۦۢ۫ۜۘۖ۬ۘۜۡۚۧۢۡۘۗۚۜۘ۫ۛۧۦۨ۟ۨۦۦۘۛۤۥۚۜۥۘ";
                    break;
                case 1638575953:
                    return;
            }
        }
    }

    @Override // kentos.loader.utils.ActivityCompat
    public void setNavBar(int i) {
        String str = "ۘ۫ۜۧ۬ۦۘۘ۬ۥۤۤۚۗۡۢۢۥۥۤۡۥۘۥۦۙۦۡ۟۫ۘۥۘۚۢۜۘۖۢۡ۠ۛۡۘۗۥۥ۟۠۫ۧۨ۫۬ۥ۫ۘۦۖۘۖۜ۠ۤۛ۬۟ۚۛۧۥۙ۠ۧۗۨۦ۬ۢۥۦۘۢ۠۟ۛۛۘۘۤ۟۫ۛ۟ۨۦۛۤۦۧۛۙۗۡۡۨۚۢۚۗۜۦۘۧۢۚۡۧۡۘۤۨۛۖۖۖۜۢۜۘۨۥۖۘۘۖۜۘۥۙۗ۬ۛۡۡۦۖۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 174) ^ 632) ^ 243) ^ 818) ^ 135) ^ 21) ^ 737) ^ 53) ^ 377) ^ 970) ^ 686) ^ 758) ^ 512) ^ 68) ^ 474) ^ 410) ^ 569) ^ 633) ^ 313) ^ 795) ^ 199) ^ 705) ^ 869) ^ 8) ^ 947) ^ 573) ^ 280) ^ 130) ^ 918) ^ 554) ^ 419) ^ 425621144) {
                case -1714927330:
                    getWindow().addFlags(Integer.MIN_VALUE);
                    str = "ۡۙۖۨۚۗۚۡۖۜۦۙ۠ۨۘۚۛ۠ۚۧۧۙ۫ۧۘۦۥۘ۬ۥۦۘۘۧۗۡۗۛ۫ۨۦۗۜ۫۫۫ۢۤ۟ۢۦۧۘۤۜ۠ۥۘۨۘۜۙۦۤۖ۟ۨۗۡ۠۠ۢۢۢۗۨۚۜۘۘۥۥۘ۠۟ۘۘۤۡۗۨ۫ۧۜۧۥۧ۠ۧ۫ۡۙۦۘۧۢۜۘۜ۠ۤ";
                    break;
                case -1132901055:
                    getWindow().getDecorView().setSystemUiVisibility(4);
                    str = "۟ۧۖۘۘۢۥ۠ۚۜۘۤۖۧۜۜۦۘۨۖۨۗۖۘۛۢ۫ۛ۟ۦ۠۠۫ۢۛۤۡ۬۬ۗ۫ۨۖۖۘۧۥۡۘۧۨۨۘ۟ۘۤۗ۬ۦۨۗۜۤۗۗۢ۫ۨۖۦ۠ۤۡ۟ۨۜۘۘ۫ۥۨۘۡۚۗۥ۟ۖۘ۟ۡۤۡ۬ۜۦۤۦۧۨ۟ۜۚۚۚۗۥۘ۠ۨۘۘ۟ۙ۬ۤۖۦۥۢۢۥۡۘۘۢۨۡۜۨۘ";
                    break;
                case -621673790:
                    getWindow().setStatusBarColor(ContextCompat.getColor(this, i));
                    str = "ۚۗۨۢۢۛۙۖۨ۟ۦ۠ۥۦۧۜ۟ۘۘۤۢۖ۫ۘۥۘۚ۟ۥۘ۫ۜۥۘ۫ۚ۟ۨۨۨۦ۫ۖ۠۟ۥۖۡۡ۟۠ۖۧ۠ۡۗۛ۫ۗ۫ۢۖۦۛۦۘۥۘۚۥۨۘۧ۫ۜ۫ۚ۬ۖۗۦۘۚ۫ۡۖۜۧۛۛ۫۫۠ۙ۠۫ۚۥۗ۬ۧ۠ۦۘۤ۬۫ۨۡ۟ۢۖ۠";
                    break;
                case -254286733:
                    getWindow().getDecorView().setSystemUiVisibility(8192);
                    str = "ۗۦۥۘۜۦۘۛۢۥۢ۠ۘ۫ۨۧۘۡۢۧ۟ۦۦۘۜۥۜ۬۬ۗۗ۟ۜۘۢۙ۟ۜۜۗۢ۬ۡۘ۠ۚۖۘۥ۬ۡۘ۠ۨۥ۠۫۠ۢ۫ۙۜۗۥۘ۠ۙۖۘۧۡۧۡۡۧۖۦۖۘۖۖۙۜۤ۬ۛۤۧۤۦۘۘۗۗۚۖۥ۬";
                    break;
                case -208824490:
                    getWindow().clearFlags(67108864);
                    str = "ۢۡۛۛ۫ۦۘ۠ۚ۟ۨۧ۫ۡۦۚۨ۫ۦۘۧۛۗۜۧۚۖۘۘۘۚۡ۫۫ۖۧ۟ۢۥۨۘۘۚۜۖ۠ۨۘ۟۬ۧ۠ۖۨۤۨۛ۟ۦۘۘ۬ۘۨۘۖۧۥ۟۟ۛۥۦ۟۬ۦۡ۬ۡۧۘۗۥ۠ۦۦۥۘ۬ۢۢۚ۟ۜۘۖ۠ۧ۠ۤۗۥۦۨۘۛۛۜۘ۠ۗۥۘۖۧۚۥ۟ۨۘۨۙۘۘۡۡۗ۫۟ۥۨۦۜۘۦ۟ۜ۠ۢۨۘۨۜۜۘ۠ۖ۟ۦ۠ۛ";
                    break;
                case 351131109:
                    str = "ۗۢۛ۠ۦۜۘۨ۟ۙۧۖۦۘۙۧۥۘ۬۠ۦۘۖۜۘ۬۠ۖۘ۠۬۠۠ۨۗۦ۬ۦۘ۫ۥ۬ۜۗۧۖ۫ۖۘۚ۟ۜۘۚۡ۫ۢۦۨۘۦ۫ۙ۬ۛۢ۠۫۠ۗ۠ۙۨۘۥ۠ۡۘۙۖۡۦۚ۠ۖۖ۠۟۟ۨۘۙ۠ۦۘۧ۬۬۟ۗ۬ۜۙۡۜۖۥ۬ۖۚۛۢ۬ۘۧ";
                    break;
                case 1667822692:
                    return;
                case 1884115473:
                    str = "ۦۜۜ۟ۚۚۥۢۘۖ۬ۜۘۙۦۛۖۙۥۥۥۘۘۖۚۖۡۗۘۘۜۢۡۘۙ۫ۦۥۖۨ۠ۢ۠ۜۥۜۧۖۘۧ۬ۧۜۢ۠ۧۗۘۘ۟ۛ۟ۜ۟ۦۘۙۗۜ۫ۚ۬ۛۗ۠ۨۥ۫ۜ۠ۡۘۢۥۜۘ۫ۙ۫ۡۧۘ۬۟ۘۘۛۥۨۘ";
                    break;
            }
        }
    }

    public void showObbDownloadDialog() {
        String str = "۟ۢۙۜۡ۟ۥ۟ۡۨۚ۬ۘۖۚۥۢۖۥۡۘۘۘۗ۠۫ۜ۫ۜۥۗۨۤۢۦۨۖ۫ۤۘۥۘ۟ۢۖ۬ۖۦۜۧۜ۫ۗۘۘ۬۫ۥۗۖۘۗۧۘۦ۠ۥۜۙۢۚۧۨۘۘۚۥۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 341) ^ 312) ^ 25) ^ 185) ^ 951) ^ 514) ^ 172) ^ 735) ^ 660) ^ 565) ^ 961) ^ 552) ^ 819) ^ 347) ^ 323) ^ 820) ^ 482) ^ 115) ^ 375) ^ 311) ^ 46) ^ 153) ^ 177) ^ 770) ^ 217) ^ 126) ^ 455) ^ PointerIconCompat.TYPE_ALL_SCROLL) ^ 293) ^ 577) ^ 758) ^ (-1877586294)) {
                case -628120920:
                    str = "۠ۗۜۘۦ۟ۙۜ۠ۧ۬ۥۧ۟ۨۜۘۦۜ۬۟ۧۨۜۢۙۙۨ۫ۛۡۙۜۘۖۖۦۘ۟۬ۥۢ۠ۙۛۙ۠۠ۦۘۖۗۡ۠۠ۜۘۘ۬ۛۚۡۢ۬ۦۜ۫۠ۖۘۜۜۦۥۙۖۘ۫۬ۖۘۜۦ۟ۜۤۦۘ۬ۛۖۘۦۜۤۤۥۨ۬ۨۙۥۖۥۘۗۤۛ۟ۦۧۚۛ";
                    break;
                case 439841737:
                    Toast.makeText(this, Deobfuscator$$app.getString(-3440727477086674761L), 0).show();
                    str = "ۦۧۥۘۡۘۛۛ۠ۧۛ۬ۥۘۛۙۡۡ۬۬ۖۘۘۘ۫ۘ۠ۡ۫ۦۤۗۧۥۗۗ۬۫۬۫ۜ۠ۖۚۙۜۢۡۘۢۖۨۘۙۜۖۘ۠ۨۧۘۤ۫ۦۘۚۡۘۘ۠ۜۤۨۧۦۦۦۤ۫ۢۙۥۦۖۘۚۡۦ۫۬ۢ۫۫۫ۥۨۘ۫ۡ۟ۗ۠ۚۖۦۙۘ۟ۦ۬ۢۥۘۙۨۘۥۚۘۘۢۘ۠۫۠۠ۡۤۤۥ۬ۢ";
                    break;
                case 1380455872:
                    return;
            }
        }
    }

    public void showUninstallDialog(final String str, MaterialButton materialButton, TextView textView, String str2) {
        String str3 = "۠ۤ۟ۡۘ۟ۖۨ۟ۖ۫ۜۘۛۚۦۡۗۙۥۥۘۦۧۤۧۤۥۗۛۥۛۖۢۦۢۚۘۧۥۘۜۖۧۘ۟ۦۤۢۥۨۤۦ۠۬ۙۘۘ۠ۤۦۖۗ۬ۦ۟ۚۘۢۖۦۡۦۙۢۥۜۛۜ";
        AlertDialog.Builder builder = null;
        while (true) {
            switch ((((((((((((((((((((((((((((((((str3.hashCode() ^ 166) ^ 32) ^ 953) ^ 181) ^ 88) ^ 899) ^ 835) ^ 544) ^ 484) ^ 946) ^ 714) ^ 118) ^ 805) ^ 870) ^ 960) ^ 800) ^ 565) ^ 799) ^ 658) ^ 387) ^ 893) ^ 594) ^ 582) ^ 849) ^ FileUtils.FileMode.MODE_755) ^ 152) ^ 377) ^ 975) ^ 634) ^ 100) ^ 542) ^ (-1892308355)) {
                case -2014088101:
                    str3 = "ۜ۫ۚۥ۬ۦۘ۟ۘۧۢۗ۟ۤۜۘۚۤۢ۬ۛۙۢ۠ۛۗۚۖۘۗۧۘۚۙ۫۟ۤۤۙۖ۫ۗۡ۫ۧۢۦۘ۠۟ۡۨۥۖۜۤۨۘۚۜ۬ۥۢۘۘۡۦۖۘۥۡۘۖ۟ۘۘ۠ۡۜۖۗۖۘۘۛۢۥۘۛۚ۟ۘۗۘۖۡۚۦۦۘۘۧ۠ۡ۟ۚۡۛ۫ۢۚ۟ۧ۟ۚۡۘۜۡۥۥۘۚ۠۟ۡۙۜۘ";
                    break;
                case -1537246995:
                    str3 = "ۦۙ۟ۙۥۘۘ۠ۧۙۨۚۘۦ۠ۥۡۢۢۦۜۥۘ۟ۛۖ۬ۦۘۢۡۧۘۢۜۖۗۚۖ۬ۢۧۨۗۡۤۚۙ۬ۨ۫۠ۢۖۘۥۦ۠۫ۗ۠ۡۧۛۗۢۥۘۤ۬ۤۘۚۨ۠ۢۨۘ۠۠ۜۘۧۗۥۘ۠ۗۘۘ۫ۖۦۡ۟ۚۢۧ۬ۧ۠ۦۘۚۨۜۧۗۘ۟ۗۡۘۦۥۧۘۡۢۥۙۛۘۘۧۘۨۘۛۘۘۘۡۗۨۘ۫ۨۖۘۡ۟ۧۢ۬ۗۛۧۚۜ۟";
                    break;
                case -1531525501:
                    str3 = "۫ۗۜۜ۠۫ۨۚۚ۟ۨۡۖۛ۫۫ۜۛ۟ۛۦ۠ۢۡۘۖۖۨ۟ۘۘ۫۟ۥۢۚۨۖۚۖۘۨۗۖۘۛ۫ۖۘۥۧۨۘۛۨۖۧۙۡۘۚ۬۟ۜۘۘۧۗ۟ۢۘۜۨۡۘۤۨۥۘۛۗۦۜۘۙۢۜۥۖۘۖۜۜۘۡ۟ۙۙۡۜۦ۟ۖۙۤۥۘۦ۟ۡۘۘۘ";
                    break;
                case -304354196:
                    str3 = "ۧ۟ۢۚۢۖۘۛ۬ۨۘۡۡۨۘۨ۟ۜ۠۫ۡۘۚۙۛۢۚۘۢۗ۬۬۠۟۬۠ۧۧۢۙۡۜۙۦۡۧۘۛۖۚ۟ۤۤۙۥۖۘ۟ۧۡۘۡ۟ۘۘۡۘۜۘۨۜۗۚۤۧۢۥۦۗۙۖۖۖۧۘۘ۬ۥۘۚۨۦۘۜۙۨۤ۬۠ۚۙۦۧۥ۬ۜۧ۠۬ۥۦۛۢ";
                    break;
                case 221521037:
                    builder.setNegativeButton(getString(C0931R.string.str009b), (DialogInterface.OnClickListener) null);
                    str3 = "ۙۛۘۘ۟ۚۜۦ۫ۨۢ۟۠ۙۡۥۘۨ۫ۤۖۨ۟۬ۡۘۤۨۡۥۢۥۘۖ۠۠۬ۧۥۘۚۤۙۦۧۡۘۛۘۘ۟۬ۖۜ۫ۦۛۨۘۘۛۦۡۤ۫ۦۘۡۜ۫ۦۘ۠ۜۘۖۡ۠ۜۘۧۚ۠ۚ۫ۧ۟۠۟ۡۥۘۡ۬ۙ۬ۘۘ۫ۧۖۘۦۦۡۦۛۚۨۦۗۤۗۤۢ۠ۜۙۡۦۦۜۗۖۜۗۘ۟ۖ";
                    break;
                case 517808856:
                    builder.setPositiveButton(getString(C0931R.string.str009c), new DialogInterface.OnClickListener(this, str) { // from class: kentos.loader.activity.MainActivity$$ExternalSyntheticLambda4
                        public final MainActivity f$0;
                        public final String f$1;

                        {
                            this.f$0 = this;
                            this.f$1 = str;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            String str4 = "ۜۤۙۧ۟ۡ۬ۢۥ۫ۨۜۘۨۦۘۜۗ۠ۨۛۘۙ۫ۡۚۗۥۧۘ۟ۘۡۘۨ۠ۢۨۘۥۘۡ۫ۡۧۜۖۙۡۧۘۧۥۦ۫۠ۙۖۛۖۘۤۦ۟ۗ۠ۜۧۘۖۘ۟ۛ۬ۢ۟۬ۗۤۧۢ۬ۚۥ۬۬۫۟ۖۘۡۘۙ۫ۖۖۘ۬ۧۜۖۘۡۘۥۗۘۗۗۦۥۥ۫۟۫ۥۘۥۚ۬۬ۧۗ۠۫ۖۜۖۥۚۖۨۘۖ۬ۙ۠ۜۜۘۚۗۤ۟ۧۜ";
                            while (true) {
                                switch ((((((((((((((((((((((((((((((((str4.hashCode() ^ 428) ^ 918) ^ 428) ^ 805) ^ 379) ^ 889) ^ 766) ^ 479) ^ 121) ^ 869) ^ 829) ^ 48) ^ 489) ^ 619) ^ 358) ^ 968) ^ 76) ^ 108) ^ 135) ^ 432) ^ 391) ^ 179) ^ StatusLine.HTTP_PERM_REDIRECT) ^ 895) ^ 876) ^ 43) ^ 476) ^ 60) ^ 363) ^ 862) ^ 222) ^ 409907404) {
                                    case -2045608541:
                                        str4 = "ۦۜۜ۟ۗ۠۬۫ۘۚۘۚۧ۟ۚۥۨۡۘۨۧۜۘ۠ۗۘۘ۬ۚۥۘ۫ۛۚۥ۬ۙ۟ۜۡۨۜۘۜۧۦۘۧۧۥۘۧۤۡۥۖۢۧ۫ۥۘۛۜۥۡۛۜۥ۠ۚ۠ۙۡۜۛۛۛۡۘ۟ۙۗ";
                                        break;
                                    case -1750851009:
                                        str4 = "ۧۨۖۘۥۖۜ۬ۧۧۦۨۛۛ۬ۜ۫ۤۛۛۖۛۢۜۙ۫۫ۗۖۥۘۤۡۖۜۙۜ۟ۦۘۚۙۙۧ۫ۥۡ۠ۧۖۛۨۘۤ۟ۤۖۢ۬ۤۗۤۢۙۗۜ۬ۗۡ۫۟ۗۦۘۘۖ۠ۗۖ۫ۙ۬۫ۨۡۡۘۡۖۘۙۛۦۘ";
                                        break;
                                    case -1432281761:
                                        str4 = "ۚۦۜۨۜۚۤ۬ۧۡۧ۫ۙ۬ۖۜۡۡۤۛۥۛۚۥۘۤۡ۬ۤۚ۟ۧ۬ۘ۟۟ۨۘۘۥۜۖۨۧۘۡۨۡۘ۫۫۫ۛۤۨۡۗۥۘۜۧ۬۬ۦۦۘۨۜۦ۟ۛۦۘۖۖ۬ۖۜۖ۠ۧ۟ۗۖۜ۫ۢۥۘۛۢۨۗۧۤۛۖۨۘۘۛۖۘۤۖۘ۬ۡ۠ۢۙۤۜۨۖ";
                                        break;
                                    case -1074437853:
                                        this.f$0.m77x6d319683(this.f$1, dialogInterface, i);
                                        str4 = "ۥۤۙۥۢۘۛۢۛۚۧۢ۫۟ۖۦۙۗۤ۟۟ۖۚۢۧۛۤۨۤۦۗۗ۫ۙ۟ۘۦۧۤۡۢۙ۬ۙۖۖۘۤ۫۠ۦۦۢۧۤ۫ۙۦۧۛ۠ۜۘۖۜۜۘۖ۫ۦۥ۟ۢۡۡۥۘۦۢۦۖ۟ۡۘ۬ۜ۬۫ۜۜۤۘۘۡۗۤۧۖۦۘۛۦۛۦۚۡۛ۟ۛ";
                                        break;
                                    case -126397174:
                                        return;
                                }
                            }
                        }
                    });
                    str3 = "ۛۙۘۗۘ۫ۦۖ۟ۢۚۛۙ۫ۨ۟ۛۤۨۗۨۜۧۖۢۜۨۧ۬۫۫ۢ۠ۜۡۘۖۛۦۚۛۤۤۘۤۗۗۖۘۥۧۜۘۚۙۜۘۡۗ۫ۧۡ۠ۙ۬ۚۨۢۙ۬ۗۙۢۦ۫ۡۜۧ";
                    break;
                case 1067035199:
                    str3 = "۟ۧۖۗ۟۟ۨۡۦ۫ۦۘۘۘۨۗۨۛ۠ۦۗۤۢ۟ۨۘۛۘۥۘۧۜ۠ۜۡۙۘۥۛۢۘ۬ۨ۫ۜۘۙۖۨۗ۟ۥۗۙۛ۫ۨۥۘۤۢۘۘۥ۫ۦۡۖۥۘۜۡۘۧۨۗۡۖۛۗۦۘۘۙۙ۟ۦۥۥۘۚۤۢۢۦۙ۫ۜۘ";
                    break;
                case 1109675611:
                    builder = new AlertDialog.Builder(this);
                    str3 = "ۦۚۖۘۡۤۦۤۙۛۘۡ۫ۖۘۥۨ۬ۡۗۢۙۨۢ۫ۛۦۘۖۦۢۚۨۡ۬ۜۛۨۤۨۧۧۙ۬ۥۧۛ۠ۖۚۡۘۥۧ۟ۨ۬ۧ۟۠ۚ۬ۙۘۖ۫ۘۘۙۢۡ۬ۥۥ۟ۖۦۙۦۨۚ۟ۡۘۡۗۥۘۡ۠۫ۨۘۥۘ";
                    break;
                case 1634786266:
                    return;
                case 1672390265:
                    builder.setTitle(getString(C0931R.string.str00e3));
                    str3 = "ۦۗۖ۫ۜۦۨۜۘۡۘۥۘۙۤۦۙ۠ۦۘۨ۬ۛۗۦۨۘۨ۬ۨۘۙۡۦۘۗۗۗۨ۟ۜۘۤۦ۬ۖۜ۬۬ۚۡۨۢۥ۫ۢۢۛۘۘۚۨۖۘۧۖۧ۟۠ۥۤۨۛ۬ۛۜۘۖۛۨ۟ۧۖ۫۫ۙ۫ۖ۠ۜۨۤۜۡۗۥۥ۫ۤۚۖۘۧ۠ۥۙۙ۫۟ۥۡۥۤۚ۟ۖۖۦۨۖۘۘ۫ۛ۟ۘۦۘۚۙۙ";
                    break;
                case 1683090857:
                    builder.setMessage(getString(C0931R.string.str0040));
                    str3 = "ۚ۠ۘۘۖۖۥۘۧۡۨ۫۟ۗۜ۟ۖۘۨۢۘ۟۬ۖۜ۫ۜ۫ۚۛۢ۠ۜۗۧۡۗۙۜۤۛۥ۠۟ۧۜۜۘۗۛۢ۬ۚۙۖۛۦۘۡۜۖۦۡۨۚ۟ۨۘۡۥۚۛۜۘۗۛۜۜۢ";
                    break;
                case 1716102811:
                    builder.show();
                    str3 = "ۦۦۙۚ۫ۥۤۗۖۘ۟ۡۗۖۤۨۘۡ۬۬ۛۢۜۨۥۚ۫ۡۡ۠ۢۜۘ۫ۜۧۘۧۧ۠ۛۘۨۘۧ۟ۘۘۥۢۡ۫ۥۚۚۗۢۛۖۡۘۚۨ۠۟ۛۗۧۙۦۦۚۦ۫ۚۖۘۚۗۦۥ۟ۥۚۡ۬ۜۦۖۘۧۨۘۘۗ۠ۧۡۥۡۘ";
                    break;
            }
        }
    }

    public void stopRunningApp(String str) {
        String str2 = "ۥۛۙ۠ۘۡۘۗۙۛۥ۠۬۠ۡۖۘ۠ۖۥۘۤۥۥۘۛۙۤ۠۟ۨۤۡۛۘۗۦۖۘۦۘۥۤۨۛۧ۫ۤ۫ۦۘ۠ۖۘۚۛۗۚۗۥۚۗۤۗ۟ۧ۫ۤۨۘۦ۬۫ۨ۬ۤۤ۫ۙۡۦ۬ۜۚۗۘۢۨۛۦۗ۫ۗۨ۫ۗ۬";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str2.hashCode() ^ 218) ^ 357) ^ 857) ^ 147) ^ 933) ^ 663) ^ 508) ^ 229) ^ 291) ^ 863) ^ 649) ^ 17) ^ 962) ^ 704) ^ 970) ^ 115) ^ 713) ^ 815) ^ StatusLine.HTTP_PERM_REDIRECT) ^ 425) ^ 986) ^ 637) ^ 968) ^ 336) ^ 831) ^ 993) ^ 522) ^ InputDeviceCompat.SOURCE_DPAD) ^ 595) ^ 40) ^ 619) ^ (-1164502981)) {
                case -480426166:
                    BlackBoxCore.get().stopPackage(str, 0);
                    str2 = "۟ۜۦۘ۟ۡ۟۟ۦۙۖ۫ۨۘۜۜۛۡۙۡۘۗ۬ۥۘۛۨ۟۠ۨۘۘ۫۫۠۠ۨۨ۠ۥۗ۫ۥۖۘۘۙۗۤۚۘۘۨۢۙۥۧۤۦ۠ۦۤۡۨۘۙۨۨۜۡۡۖۦ۫ۢۥۘۘۙۙۡۖۧۘۨۚ۟ۛ۫ۖۢۙ۟ۘۚۡۘۗۧۨۘ۫ۢۘۘ۬ۜ۠ۗ۠ۘۘۥۥۤۡۜۨۘ";
                    break;
                case 597801476:
                    str2 = "ۤۤۢ۠ۛۜۘ۫ۦ۬ۥۢۗۙۢۧۙۤۥ۬ۨۗۜۢ۫۠ۛۜۚۗۨۘۖۤۧۘۧ۟ۘۙۢۚۡۥۘ۬ۤ۫۟ۧۖۡۜۗۡ۬۬ۧ۠ۘۘۚۡۡۢۖۛۚۤۨۘۢ۬ۘۘۖۢۜۧ۬ۛ";
                    break;
                case 889288921:
                    String str3 = "۬۠۫ۨۗۙ۟ۧ۬ۧۨۖۗ۫ۚۖ۬ۦۢۨۡۧۘۖۘۖۚۤۚۖ۫ۥۨۡۘۡۚۡ۠ۦۧ۬ۛۥ۬ۤ۫ۘۧ۟ۥۧۘۡ۬ۧۨۛۛۧۤۥۚۗۛۤۥ۟ۦۚۘ۬ۗۖۙۖ۫ۨۧۘۖ۠ۛ۫ۚۖۖۜ۬ۘ۟ۗۜ۟۠۫۠ۨۘۤۙۡ۬ۦۦۘۥ۬۬";
                    while (true) {
                        switch (str3.hashCode() ^ (-508251084)) {
                            case -1843410883:
                                str2 = "۟ۜۦۘ۟ۡ۟۟ۦۙۖ۫ۨۘۜۜۛۡۙۡۘۗ۬ۥۘۛۨ۟۠ۨۘۘ۫۫۠۠ۨۨ۠ۥۗ۫ۥۖۘۘۙۗۤۚۘۘۨۢۙۥۧۤۦ۠ۦۤۡۨۘۙۨۨۜۡۡۖۦ۫ۢۥۘۘۙۙۡۖۧۘۨۚ۟ۛ۫ۖۢۙ۟ۘۚۡۘۗۧۨۘ۫ۢۘۘ۬ۜ۠ۗ۠ۘۘۥۥۤۡۜۨۘ";
                                continue;
                            case -978899860:
                                str2 = "ۜۗ۫۬ۧۤۤ۠ۖ۫ۖۘۥۗۙۤۙۚ۫ۤۡۗۡۘۛ۠ۢ۟ۚۨۜ۟ۦۚۧۨۧ۠۟ۘۧۘۛۜۛۧۤۖۨۦۦۛ۠ۖۘۢۧۙ۬ۘۜ۠۠ۚۙۦۘۤ۠ۨۥۨۙ۠ۢ۟";
                                continue;
                            case 1451851099:
                                str3 = "ۜۥ۟ۖۙۡۘۧۗۜۢۢۧ۠ۥۡۛۜۖۚۥۜۖۘۨۘۡۧۦۘ۟۫ۤ۬ۧۥۚۖۦۙ۠۠ۘۡۛ۟ۥۜ۫ۙۙۜ۬ۚۜۦۗۡ۟ۜۘۙۖۚۢ۫ۨۘۘۚۥ۫۟ۤۚۛ۟ۨۗۨۘۤ۠ۨۘۧۖۤۛ۠ۜۘۢۡۛ";
                            case 1732405842:
                                String str4 = "ۧۡۜۛۖۛۡۜ۠ۥۚۡۛۡۡۘۢ۬ۗ۟ۖۦۚۡۦۛۚ۫ۡۦۦۘۨۖۦۘۖ۠۫۬ۙۚ۫۟ۨۢۘۡۘۧۛۦۤۢ۫ۜۘۖ۠ۗۛۡۦۚۗۧۧۡۧۨۘ۟ۚۖۘۨۢ۫۫۬ۦۤۗۜۘۜۢۧۙۜۤۙ۬ۘۘ۫ۢۙۛۙۡۘۢۛۗۙۛۤۜۜ۫۠۟ۗ۠ۡۙ۫ۙۥۖۗۘۛ۠ۢۙۘ";
                                while (true) {
                                    switch (str4.hashCode() ^ 130031000) {
                                        case -1922121003:
                                            str3 = "۫۬ۘۧۦۧۘۨ۬ۙۘۡۥۛ۟ۡۘۥۖۛۚ۫۬ۡۡۖۘۖۥۧۦۧۜۛ۠۫ۧۗ۫ۤۧۜۢۢ۫۟ۗ۟ۧۤۦۘۜ۠ۖۘۢۙۡۘۗۛۜۘۚۤۧ۟ۘۨۘۗۥۘۖۦۢۘۙۛۤ۠ۡۘۢ۟۠ۘۜ۬ۨۚۨۘ۠ۘۘۢۛۖۜۡۥ۠ۘ۬ۗۛۡۤۗۖۘۚۘۤ";
                                            break;
                                        case 511766551:
                                            String str5 = "ۢۡ۫ۢۥ۟ۥۨۡۖ۫ۢۛۜۥ۟ۘۘۛۛۖ۬۟ۖۘۦۗۖۙ۟ۖۘۛۚۚۧۖۜۘۥۢ۬ۧ۟ۧۚ۟ۜ۠ۖۡۘۖۨۥۘ۟ۘۜۘۧۙ۬ۤۥۤۡۤۡۚۢۡۧ۫ۤۚۥۦۘۥۘۥ";
                                            while (true) {
                                                switch (str5.hashCode() ^ 329171788) {
                                                    case -2145307377:
                                                        str5 = "ۤۜ۬ۖۥۢۥ۫ۧۢۤۧۘ۫ۦۢۤۖۚ۠ۢ۠ۦۙۛۦۖۖۖۘۘ۟ۥۙ۫ۘۧۘۜ۬ۖۡۖۤ۟۠ۘۘۜ۟ۢۚۤۚ۫ۡ۟۫ۦ۟ۗۧۨۘۢ۠ۢۖۨۧۘ۟ۨۨۡ۟ۘۘۖۛۦۘۥۧۚ۬ۢۗ۬ۗ۟۟ۜۢۘۡۢۨۨۛۡۨۘۘ۠ۡ۠ۤ۠۠ۢۜۖۘۦ۫ۜۦۘۘ۬ۨۘ۟ۗۖ۫۬ۙ";
                                                    case -1906336173:
                                                        str4 = "۟۫ۨۘۦۚۙۥۡۘۥ۠ۘۘۜۢۘۡۦۡۜۜۡ۬ۤۙۤ۟ۥۤۚۢۘۜ۫ۢۗۦۨ۬ۜۧ۫ۖ۫۟۟ۚۥ۬۟ۢۤۡۙ۫ۢۨۘۜۗۥۢۢۢۥۡۦۘۥۘۤۧۦۤۜۧ۬ۘۧۘۙۡۗۛۖۘۘ۠ۜۧۤۘۧۘۘۧۖۗۚۨۘۖۚۨۘ۬۫۬ۡۚۖۘ۠ۢۚۘ۫ۨۚۡ۠ۡۗۘۡۡ۠ۘۤۜۚۚۘۧ۟۫ۛۗ";
                                                        break;
                                                    case -710567135:
                                                        String str6 = "ۚۜۤۜ۠ۘۘۜۥ۟۟ۥۡ۟ۥۘۗۛۧۗۥۘ۬ۤۗ۟ۘۘ۫۟ۢ۫ۗۧۢۢۧۤ۬ۦ۠ۡ۠۟ۢۥ۫ۨۡۛۥۨۘۧ۬ۢ۠ۛۖۦۢۡ۬۬ۤۜۡۢۥۘۛۗۨۘ۟ۜ۠ۥۚۜۘۥ۠ۨۛۦۥۘ۫۫ۨۦۛ۫ۚ۟ۧۘۥۥۦۦۥۙۡۛۨۚۗۡۜۨۘۗۘ۠ۨۥۚۧۗۘۘ۠ۢۡۘۨۜ۫ۗۚۥۚۤ۬ۙۥۦۘۨۢ۫";
                                                        while (true) {
                                                            switch (str6.hashCode() ^ 2097702530) {
                                                                case -1857669208:
                                                                    str6 = "ۡۧۖۛ۟ۘۘۢۖۡۨۙۛ۫ۖۡۘۖۧ۫ۘ۟۠ۨۦۘ۫ۜۛ۬ۘۥۘۥۘ۬ۚۥۧۘۖۥۢ۠ۖۖۜۙۛ۬ۗۧۥۨۖۚۚ۟۫۫۟ۛۨۚۗۚۤۡۗۛۘۦۨۛۖۘۜ۬ۘۘۤۖ۠۫ۚ۠ۤ۟ۚۙ۬۟۟ۙۨۘۘۙۥۨۢۤ۟ۗۗۙۦ۫۟ۢۙ";
                                                                case -1831646393:
                                                                    str5 = "۟ۥ۟ۧۧۘۘۥۚۡۧ۠ۥۦۘۚۖۙ۬ۥۜۦۘۘۦ۠۬۟۠ۚ۬۟ۤ۠ۙۦۤ۠ۧۛۢۛۜۖۤۖۚ۬ۤۚۡۧ۠ۢۥۘۤۦۦۘۚۖۡۘۘ۫ۖۜۙۖۤۜۖۘۛۖۥۘۨۚ۟";
                                                                    break;
                                                                case 595287414:
                                                                    String str7 = "ۦۚۘۘۧ۟ۡۘۨۙۧ۠ۡۘۢۛۦۛۜۜۘۛۘۨۘۘ۠۬۬ۥۙۢۖۘۧۙۘۢۘۦۘ۫۫ۖۘۖۧۘۙۧۤۧۘۧۘۨۧ۠ۗۜۤ۫ۤۢ۬۠ۨۘ۟۬ۖ۬۠ۨۘۥۙ۬ۨۨۥۧ۬ۧ";
                                                                    while (true) {
                                                                        switch (str7.hashCode() ^ (-1674453338)) {
                                                                            case -1232640911:
                                                                                str7 = "ۖۖ۟۬ۘۧۛۜۡۘ۟ۚۥۙۚۤۦۚۘۘ۠ۗۙۗۛ۬ۥۚۙۤۡۘۘۤۗۡۤۘۘۨۘ۫ۡۖ۟ۢۖۛۡۧۚۚۗۢۖۙۚۘ۟۬ۦۘ۟ۡۡۘۡۧ۬ۛۤۨ۫ۙۡۘ۟۠ۘۖۢ۠ۘۚۛۨۙۚ۟ۜۗ۟ۙۘۜۥۤۦۖۨۢۧۖۙۡۘۨ۠ۘۘۦۘ۠۠۬ۜۘۨ۠ۜۧۘۛ۬ۖۢ";
                                                                            case -637824651:
                                                                                str6 = "ۢۙۜ۠ۦ۠۬۠ۜۘۢۥۘۘۢ۠ۦۘۘ۬ۥۘۢۚ۠ۢ۫ۧۡۘۘ۫ۙ۬ۤ۟۫ۧۗۢۦ۬ۤۚۜۥۘۖ۬ۚۤ۬ۖۧۡۡۘ۠ۗۨۘۚۥۥۢ۟۫ۧۦ۟ۨۧۛۢۙۦۤۙۧۚ۠ۢۙۨۗۥۧۖۦ۠ۢۘۧ۠ۛۘۧۘۚۥۖ۫ۢۗ۫ۚۖ۟ۢۥۘۥۖۗۨۛ۠ۦۘ۠۫ۨۙۜ۠ۖۡۧۘۨۧ۟ۗ۠ۦۙۡۖ۫ۚۦۧۢۘ";
                                                                                break;
                                                                            case 1757530455:
                                                                                str6 = "۟ۢۨۘۡۖ۠ۥ۟ۨۘۛۜۙۥۦ۫ۦۦۡۦۙۡۘۙۖۥۖ۠ۤۥۙۢۘۜۘۧۜۘۘۧۘۘۘ۠ۥۦۙ۬۬ۨ۟ۡۘۢۙۘۥۥۢ۠ۥۘۢ۠ۨۡۨۡۘ۠ۤۛۙ۠ۢ۫ۖۜۘۙ۬ۙ";
                                                                                break;
                                                                            case 1986019917:
                                                                                str7 = BlackBoxCore.get() != null ? "ۘ۠ۛۜۚۖۤۥۘۘۧۨۖۘۡۜۡۥۧ۟ۘۨۘۡۚۚۥۥۛۘۧۛ۠ۗۜۨۥۦۙۦۡۜۖۤۖۗ۫ۙۙۘۘۦۘۗۛۦۘۧ۬۬ۗ۬ۧۡۜۘۘۖۛ۟ۡۨۘۢ۠ۤۨۜ۬ۖۥۧۘ۬ۡۥۘۡ۠ۡۜ۠ۜۘۛۙ۫۬۫ۥۖۢۖۘۗۥۛۖ۠ۜۦۛ۫ۙۡۢ۬ۨۘۡۤۖۘۛۦۥۘۡۦ" : "ۙۜۖۘ۠ۨۦۘۜۡۙ۫۫ۡۛۨۖ۬ۥۥۡۖۜۦ۟ۖۥۨۘۦۦۥۥۨ۟ۜۢۢۤۙۦۘۦۡۜۧۘۤۦ۠۬ۨۘۛۗۤۥۚ۠ۦۘ۫ۛۙۛۛۘۨۛۡ۬ۛۨۙۖۘ۠ۛ";
                                                                        }
                                                                    }
                                                                    break;
                                                                case 1572027205:
                                                                    str5 = "ۨ۠ۢۗۡ۠ۜۗۥۘۧۧ۫ۢ۬ۖ۬ۙۘۢۜ۬۬ۗۤۢۜۘ۬ۙۥۛۛۢۤۡۨۘۢۜۖۥ۠۟ۙۖۛۚ۟۫ۡۜۨۘ۬ۨۢۨۡۜۘۦۛۦۘۛۦۘۗۤۙۘۙۘۘۨۨ۟ۧۥۧ۠ۡۢ۟ۘۜۘۤ۠ۦۘۚۦۤۙۗۖۤۤۦ۠۟ۡۧ۬۠ۡ۫ۢۢۛ";
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 29132788:
                                                        str4 = "۬ۗۚۜ۠ۘۘۤۥۖۘۗۖۘ۟ۤۤۚ۫۟ۗۨۧۘۛ۟ۜۘۦۙۚۦۜۦۗ۟ۚۢۦ۬ۛۧۦۘۜۖ۠۟۫ۜۘ۫ۘۘ۟۫ۘۘۛۦۧۦۜۦۘۙۜۜۘۛۢۜۙۧۘۨۚ۠ۢۨۗۗۚۗۢۦۘۙۥۧۘۚۘۧۤ۬ۥۘۗۜۗ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case 955879363:
                                            str4 = "ۨۘۥ۬ۗۜۘۤۚ۫ۘ۬ۧۘۢۘ۬ۗۘۜۢۢ۠۟ۡۛۘۧۘۨۦۘۘ۬ۛۖۖۚ۟ۗۚۜۘۛۧۨۗۚۧۚۙۡۤ۟ۛۜ۠ۦۘ۬ۗۙۚۙ۟ۢۘۗۜۡۛۘۘۙۤۨۘۢۥۘۘۗۥۥۤۖۡۗۜۤۖۤۡۖۜۙۚۘۡۗ۟ۘۘ۟ۛۛۗ۠ۨۘۖۙۥ";
                                        case 2003470612:
                                            str3 = "ۗۛ۠ۢۡۗۚۤ۫ۚ۠ۜۧ۟ۜۡ۫ۢۙۧۥ۠ۗ۠۫۬ۥ۠ۦۜۢۖۨۘ۫ۙۡۦۖۤ۟ۢۗۚ۠ۜۘۜۦ۟ۥ۫ۖ۠ۨۢ۬ۦۚۘۢۤۥۖۖۧ۠ۛۢۢۖۢ۬ۗ۫ۢۥ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 1567885045:
                    str2 = "ۘۙۘ۠ۢۦۘۘۤۗۥۗۡۘۘۧۢۡۡۗۘۘ۟ۘۘۦۥۧۖۘۙۛۧۗۖ۠۟ۦۛ۫۫ۙ۟ۡۨۚۖۘۧۚۘۡۙۨۧۦۧۚۤۦۘ۬ۨۥۘ۫ۤۜۨۗۦۘۡۥۚۦ۠۠ۜۧۙۢ۬ۧۘۤۜۚ۫ۗۖۡۡۘ";
                    break;
                case 1717304288:
                    return;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 437
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public boolean tryAddLoader(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 1632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kentos.loader.activity.MainActivity.tryAddLoader(java.lang.String):boolean");
    }

    public void unInstallApp(String str) {
        String str2 = "۫ۖۡۖۧۚۨۘۤۘ۟ۖۘ۠ۗۥۢۖۛۢۛۤ۟ۡۥ۟ۢۜۘۗۛ۟۫ۜۖۘۛۛۘ۬ۨۨۘۨۡۡۖۡۖۘۥۜۧۘۡۖۢۙۚۦ۫ۡۜۧۡۗۡۚۨۗۨۘ۬ۧۤۛۤۘۘۢۤۨۗۗۖۢ۠ۡۨ۬ۛۗۚۨۙۜۘۚۚۨۤۨۥۘۗۡۜۘۨۜ۟ۙۢۜۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str2.hashCode() ^ 900) ^ 725) ^ 75) ^ 692) ^ 392) ^ 415) ^ 667) ^ 552) ^ 995) ^ 844) ^ 460) ^ 388) ^ 190) ^ 633) ^ 649) ^ 567) ^ 695) ^ 405) ^ 603) ^ 539) ^ 705) ^ 675) ^ 769) ^ 837) ^ 125) ^ 562) ^ 671) ^ 1023) ^ 924) ^ 979) ^ 755) ^ (-1142106690)) {
                case -1946425501:
                    return;
                case -1860120585:
                    String str3 = "۫ۘۘۘۥۢۦۘۧۢۖۘ۬ۘۘۛۗۖۘ۠۬ۢۧۙ۬۠ۖ۠۬ۖۘۛ۠ۖۢۘ۫ۦۧۚ۬۫ۥۘۙۢ۟ۤۦۖۚۦۘۤۛۤ۟ۗۡۘۦۧ۫ۧۗۚۨ۫ۧۖۦۛۘۘۖۘۧۘۦۘۚۥۦۘۨۜ۬ۗ۟ۖۘۘۖ۠۫ۤۜۗۛۖ۬۬ۗۥۧ۟ۨۤۚۡۡۚ۬ۨۘۜ۫۬ۧۧۨۘۥ۟ۡۘۘ۫ۚۚ۫ۨۜۦۛۙۥۥۘۤۨۛۧۤۘۨۡۜۘ";
                    while (true) {
                        switch (str3.hashCode() ^ (-1506786623)) {
                            case -1044897336:
                                str3 = "۠ۧۜۘۦ۠ۘۘۙۚۜۘۨۧ۠ۚ۬ۙۘۗۢۙۗۖۡۡۦۘ۬ۦۙۢۘ۠ۙۦۗۖۢۙۙۧۖۧۗۜۘۦۡۙۥۚۖۦۘۢ۫ۘۛۤۖۧۘۖۘۧۘۘ۟ۛۡۘۡۢۗۖ۫ۢۧۗ۟ۘۘۛۥۢۡۨۜۦۘۘۧ۠ۨۢۥۘ۬۫ۚ۫ۙۦۘ۬ۜۘ۬ۦۧۘۡ۠ۗۚۨۜۦۥ۠ۙۙۧۦۘۧۗۡۖۧۘۗۖۦۘۙۡ۫ۗۤ۬ۦۜۖۘ";
                            case 1568608:
                                String str4 = "ۗۘۗۡ۬ۖۘۖۛۤ۠ۗۖ۟ۨۛۦۚ۠۟ۖۘۛ۫ۜۖۥۤ۟۠ۘۘۗۘۗۤۦۛۢۜۙ۬ۜۤۙ۟ۡۖۧۘ۬ۨۥۙ۫ۖۘۘۛۜۘ۬۫ۖۖۨۥۘۤۙۡۤۨۥۗۧۗۜۖ۠ۚۙۘۘۙۨۗۜۖۘۧۜۢۘۛۧۗۡۢۗۖۦۘۥۧۘۘۖۜۗۛۙ";
                                while (true) {
                                    switch (str4.hashCode() ^ 1563503994) {
                                        case -2058679279:
                                            str3 = "ۘۨۗۚۥۖۘ۬ۧۥۘۖ۫ۡۦۜۧۚۢۡ۠ۧۜۤۧۘۜۙۗۤۦۘۘۡۤۡۘ۫ۖۡۘۧۚۘۘۛ۬ۡۘۛۥ۠ۘۢۡۨۗۜۘۖۧۨۢۚۘۘۨۚۤۥ۠ۥۘۗ۫ۙۧۧۙۛۥۥ۫۬۫ۡۖۤۥ۠ۦ۬ۡۘۡ۫۠ۙۚۚ";
                                            break;
                                        case -987692645:
                                            str3 = "ۦۨ۫ۛ۫۠ۨۥۤۖۨۚ۠۫ۧ۬ۥۢۥۘۛ۠ۖۘۜ۬۟ۢۢۦۘۙۦۖۘۡ۟ۙ۫ۦۦۘۘۖۥۨ۬۫ۡۦۡۘۥۙۚ۬۫۟ۙ۟ۜۘۨۘۗ۠ۨۨۨۨۘۖۖۛۢۦۜۘۖۤ۟ۦۡۗۖۜۖۘ۠ۢۜۧۛۨۛۙۧۚ۠ۦۘۗۖۡۖ۬ۢ۟ۨۨۘۡۖۙ";
                                            break;
                                        case 1167543980:
                                            String str5 = "ۚ۫۟ۤۦۥۘۙۦۨ۠ۢۗۡۢۥ۫ۥۧۘۡۘۧۘ۫ۨ۠ۤۥ۟ۦۘۤۦۢ۠ۦۖۜۤ۠ۛ۫۠ۖۦ۬ۢۛ۬ۗۢۗۡۖۖ۫۟ۨۘۦۙۦۚۡۥۘۖۘۜ۠ۛۖ۠ۦۖۡ۫ۤۥۜۨ۟ۨۘۘۚۥۢۜۘۚ۬ۛۤۦۥۦۛ۠ۖۡۚۙ۟ۘۖ۟ۙۖ۬ۚۗۨۥۛ۫ۙۙۚۚ۟ۗۥۚۘۘۘۧۥۤۥۜۘۜۛ۬ۧ۬ۡ";
                                            while (true) {
                                                switch (str5.hashCode() ^ 747225416) {
                                                    case -626254209:
                                                        str4 = "ۖۨۛ۠۠ۨۘ۬ۡ۫ۛۙۥۘۧ۟ۜۘ۠۟ۥۘۗۨۧۢۤۜۘۧۢۜ۟۟ۜۡۥ۫۫ۖۘۡ۫ۜۢ۫ۥۘۡ۫ۡۘ۬ۨۘۘۗۗۡ۠ۜۗۗۤۦۨۖۘۚۘ۟ۜۛۡ۫ۧۡۘ۟ۗۖۘۘ۟ۘ";
                                                        break;
                                                    case 702116597:
                                                        str5 = "ۤۨۘ۟ۤۡۨۨۧۘۙۦۧۙۖۤۛ۠ۖۜۙۖۘۥۘ۠ۨۖۧۧۘۦ۟ۢۛۥۦۦۘۥۥۦۢ۬ۥۨۨۜۘۧ۬ۢۖ۠ۙ۬ۦۜۦۖۘۘۖ۫ۢۧ۫۠ۙۢۛۚۨۥۖۨۦ۫ۧۘ۠۬ۨۘۤۚۗۤۛۖۜ۬ۘۚۦۘ۬ۨۧۘۛۖۘۘۗۗۘۛ۫ۨ۫ۡۗ۫ۦۧۘ۠۫ۦۦۖ۬۫ۙۖۘۢۚۙۗۗۢۥ۠ۨۘ۟ۘۢۡۡۤۙۦۤ";
                                                    case 911253519:
                                                        String str6 = "ۦۧۜۘۗۛۛ۟ۧۗۛۥۘۧۚۡ۬۫ۗ۟ۥۗۖ۫ۧۛۚ۠ۖ۫ۨۘۗۖۗۤۛۧ۠ۜۦۜۜ۬ۙۥۖۘۦۦۖۘ۟ۥۧۡۗۧۨ۠ۜۚۦۛۥۥۨۛۡۦ۬ۚۗ۬ۚۢ۟ۡۡۙۡۖۘ۠ۡۦۢ۫ۖۘۘۨۡۨۙۡۙ۬ۥۘۙ۫ۖۗۛۡۘۜۤۜۘۙۧۧۦۗۡۘۗۦۛۤۡۧۘۢۘۦۘۥۦ۫۫۬ۖ۬ۨۧۥۥۧۜۘ";
                                                        while (true) {
                                                            switch (str6.hashCode() ^ (-985050507)) {
                                                                case -2080570076:
                                                                    String str7 = "۟ۜۨ۟ۨۨۜۡۘ۫ۦۡ۫ۨۘۦۤۘۘ۫ۙۦۨۚۛۘۛۥۜۤ۬ۚۛ۟ۤۧۘۧۢۜۦۗۚۧ۬ۨۘۜۥۖۘ۟ۥۖ۫ۙ۬ۜۨ۬ۖۤۧۨۘۦۘۥ۟۫ۥ۫ۘۢۙۨۛۦۦۤۧۡۜۖۗ۠ۨۘۚۗۜۘ۟ۥۜ";
                                                                    while (true) {
                                                                        switch (str7.hashCode() ^ 317560807) {
                                                                            case -1604687027:
                                                                                str6 = "۟۬ۖۘۢۛ۫ۥۘۗ۟ۢۤ۬ۘۥۛ۟۟ۜۥۘۜۥۢۨۡۦ۬ۢ۬ۘۦۡۤۙۥۖۚۘۘۨۖۛۙۨۡ۬ۜۖۘۜ۬ۨ۠ۦۢۨۦۜۨۢۘۘۢ۫ۖۘۛ۠ۦۘۢۨ۬ۙۛۚ۬ۧ۫ۢۛۡۧۜۦۚۥۡۘ۠ۛۨۡۦۘۖۤۢۦ۠ۡ۬ۥۥۗۢۗۦ۟ۢۥۦۦۘۢۚۦۘۢۙۦۘۛۙۜۛۚۚ";
                                                                                break;
                                                                            case -1190601414:
                                                                                str6 = "ۖۥۖۘۧۜۜۧۗۢۨۨ۬ۛ۬ۧ۠ۖ۟ۛۨۦ۠ۚ۫۬ۗۤۙۜ۫ۗۤۙۚۘۘۚ۫ۢۡۡۜۘۚۙۜۦۥۧۘۚۙۥۘۢۥ۟ۤۦۦۖۖۨ۠ۢۡۘ۟ۘۜۗ۠ۙۢ۠ۘۜ۠۫ۨۦۧۥۜۢۥۜۘۘ۟ۦۗۛۛۥ۬۠ۡ۟۬ۤۡ۠ۛۖۢۥۘۥۜۧۘ";
                                                                                break;
                                                                            case 896974366:
                                                                                str7 = "۫۟ۡۘۨ۟ۡۘۗ۠ۥۤ۟۟ۦۖۡۘۤۨۥۘۦ۫ۨۡۦۘۗۖۧۨۙۜ۫ۜۡ۫ۜۜۦۘۘۨۖ۫۠ۥۦۘۘۜۦۘۤ۫ۜۘۨۖۧ۟ۖۜۘ۠ۡ۠ۥۦۡۘۤۢۜۘۤۛۖۙۖۗۢۖۘۥۤ۟۫ۜۤۨۗۜۦۖۧۘۡ۠ۧ";
                                                                            case 1266964259:
                                                                                str7 = BlackBoxCore.get() != null ? "۬۫ۢۚ۫ۖۘۗ۠ۨۘۖ۬۠ۢۡ۫۫ۡ۬۠ۢ۟ۨۥۤۜ۟ۨۘۛۜۡۘ۠ۥۧۖۢ۫ۡۘۖۤۘۘۘ۬ۡۡۘۜ۬ۙۦۨۛ۠ۗۙۧ۫ۧۡۛۡۥۙۥۘ۫ۦۘۨ۠ۦۖۢۥۧۨۘۥۦۘۨۨۤ۫۟ۘۚ۠" : "ۚۗۤۨۨۡۘ۬ۖۛۦۥۖۘۜۘ۠ۙۨۡۗۦۘۛۦۙۢۥۧۦۛۨۤۦۡ۫ۨۜۘۚۤۗۜۙ۫ۤۙۨۘۘ۫ۗۗۢ۠ۢ۟۫ۛ۟ۤۗۖۘۨۢۨۘۘۗۖ۟ۧۢۧ۫ۖۡۡۜۘۡۡ۬ۡۧۘۖۛۨۘ۫۬ۛۦۜۙۧۖۘۘۢ۠۬ۨۜۢۥۘ۫ۢ۠ۧۨ۠ۚۙۦۘ۬ۘ۟ۧۡۨۢۜ۟";
                                                                        }
                                                                    }
                                                                    break;
                                                                case -996923305:
                                                                    str6 = "ۜ۫ۦۡۨۖۘۨۖۚۙۡۦ۠۠ۧ۫۟ۛۘۦۤۦۧۚۢۜۖۢ۫ۢۛۘۗۖۗۦۙۜۘۨۖۦۘۧۤۥۖۡۘۘۤ۫ۜۤۖۖۘۨ۫ۧۦۦۢ۠۫ۧۘۨۘۧۧۖ۬ۡۘۛۨۛ۠ۖۦۘۗۧۦۚۥۤۛ۟ۚۢ۫ۖۘ۬ۜۡۘۖۧۛۛۧۡۘۡ۠۬ۢۘۖۘۨۧۡۡۢۜۙۜۥۘۤۡۘۨۥ۫";
                                                                case 918716347:
                                                                    str5 = "۟ۥۖۘۦ۠ۜ۟ۙ۠ۡۡۘۘۚۧۛۗۚۜۧۘۙۗۥۜۦۘ۬ۜۜ۟۟ۥۖۗ۟ۤۙۖۥۧۘۘۧ۠ۦۦۛۦۘۡۚۘۘۛۦ۟۠۠۫ۖۘۦۖۥ۫ۢۧۢ۟۬ۥۢ۟۟ۢۨۢ۫۫ۙ۟ۡۘۛۡۘۘۧۘۨۗۡۢۨ۟ۜ۫ۛۡۧۢۖۗ۠ۘ۟ۚۜ۠ۘۘ۬۟ۘۘۘۘۛۤۨۘۢۢۜۘۛۚۙۛ۠۟ۥۘۙ۬ۙۢ۬۫ۚ";
                                                                    break;
                                                                case 1271309830:
                                                                    str5 = "ۚۖۛۨۚۨۥۜۤۙۗۗۧ۬ۜۘۢۤۡۘۦ۬۟ۥۘۙۙۢۦۜۥۤ۟۟ۦۘۤۧۗۡۥۛۦۙۤۛۛۧۢۨۨۨۧۡۘۛۚۙ۬ۙۨۥ۟ۚۦۧۡۛۦ۬ۛۨۧۘ۟ۙۛۧۙ۬۫ۚۘۗ۟ۦۘۚۤۤ۫ۤ۟ۚۥۡۚۗۜ۬ۛۖۤۘۖۗ۟ۖۛۤۜۚۖۥۘ۬ۛۖۖۤۥۘ۠ۦۘۤۥۦۘۖۖۥۤۤۚۥ۟ۨۘۖۨۗۡ۬ۙ";
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 1431021106:
                                                        str4 = "ۗۤۡۘ۟ۙۤ۠ۖۖۖ۟ۨۢ۫ۙۚۖۖۘ۟ۙۦۢۧۡۘ۫ۤۙۙۗۢ۟۠ۥۚ۫۠ۨۗۛۛۙۖ۠ۘۢۢۡۤۡۘۤۙۖۛ۟ۗۘ۫ۡۘۨۜۡ۠ۙۜۜ۟۬ۚۥ۠ۢۧۦۘ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case 1681271956:
                                            str4 = "ۨ۟ۜۥۜۚۡۘۖۚۧۜۦۡ۫۟ۛۜۘۧۥۗۧۖ۠۟ۚۚۙۜۚۥۘۡۘۖۖۖۥۘ۠ۗ۠ۨۘ۬ۜۜۙۢۡۘۙ۬ۨۨۛۡۘۧۢۥۢ۟۟ۨۨۘۘۨۘۖۙ۬ۖۖ۟ۜۘۦۦۛۗۗۡۘ۫ۜۛ۠ۚۗۢۧۥۨۖۥ";
                                    }
                                }
                                break;
                            case 601936172:
                                str2 = "ۧ۠ۡۘۨۛۥۘۙ۬ۦۘۘ۫ۚ۬۫ۨۛۧۗۜۛۜۘۖۗۛۧۨۜۛ۫ۧ۬۬ۡۘۥۚ۟ۡ۫ۛۗۜۘ۬ۜۤ۬۟ۗۥۡۜۧۥ۬ۙۡ۬ۨۙۡۦۡۘۦۚۘۘۘۡۧ۫ۖۛۦ۠ۘۘۘۧۤۜۢۨۢۖۛۨۗۘۤۛ۬ۡۖۘۘ۫ۘۤۚۖۤۥۙۦۘۦۦۜۘۢۤ۬ۨۗۛۖۙۖۡۘۦۤۙۡ";
                                continue;
                            case 1574973481:
                                str2 = "ۥ۟ۡۘۥۤ۟۠ۦۥۘۛۢۡۘۤ۫ۖۘۥۜۦۘۛ۫ۡۗۛۛ۬ۢۖ۫ۨۘۘۗ۠ۦ۬ۧۖۨۛۡۖۦۧۥۖۦۘۗۡ۠ۧۦۦۘۖۙۡۖۙۙ۠ۛۖۚ۬ۦۢۤۡۘۜۖۧۘۗۡۘۥۙ۬ۥ۠ۢۧۜۨۘۘ۠ۖ۟۟ۖ۫ۖ۠";
                                continue;
                        }
                    }
                    break;
                case -1696838208:
                    str2 = "ۨ۠ۥۘۧ۟ۚۘ۫ۘۚۛۖ۬ۖۘۢ۠ۧ۠ۨۘۨۦۡۘۙۢ۠۟۫ۧۧۢۦۤۨۘۥۨ۠ۦۜۦۘۨۢۙۦۗ۬ۦۨۘۛۨۗۡۤۧۛ۫ۦۘۛ۟ۦۘۙۤۖۧ۟ۧۢۨۗۥ۬ۤ۟ۖۙ۫ۧۢۘۙۗۤ۫ۤۡ";
                    break;
                case -764390346:
                    BlackBoxCore.get().uninstallPackage(str);
                    str2 = "ۥ۟ۡۘۥۤ۟۠ۦۥۘۛۢۡۘۤ۫ۖۘۥۜۦۘۛ۫ۡۗۛۛ۬ۢۖ۫ۨۘۘۗ۠ۦ۬ۧۖۨۛۡۖۦۧۥۖۦۘۗۡ۠ۧۦۦۘۖۙۡۖۙۙ۠ۛۖۚ۬ۦۢۤۡۘۜۖۧۘۗۡۘۥۙ۬ۥ۠ۢۧۜۨۘۘ۠ۖ۟۟ۖ۫ۖ۠";
                    break;
                case 309823858:
                    str2 = "ۚۥۚۖ۬ۚۢ۫ۖ۫ۚۗ۠ۢۥۘ۫ۚ۟ۗۦۘ۫ۙۛۢۗۖۘۜۡۨۘۨۚۡۘۤ۟ۘۘ۟ۥۚ۟ۛۥۘۦۦۡۚۦۜۘۧۛۢۘ۟ۜ۟ۤۗ۬ۚۨۘ۠ۡ۬۟ۜۛۡۨۨۢ۬ۙ۟ۤۘۘ";
                    break;
            }
        }
    }

    public void updateGameStatus(String str, TextView textView, MaterialButton materialButton) {
        String str2 = "۟ۢۜۗۥۧۘ۟ۨۘۥۛۖۙ۬ۖۘۜۖۜۘ۟۫ۜۘۚ۬ۢۜۢۖ۠ۚ۟ۥۦۨۘۙ۬ۖۘۘ۫ۘۘۖۘۛۢۙ۫ۦۥۡۘۥۚۤ۟ۧۥۘۥۘۜ۬ۦ۟۫ۡۢۢ۫ۛ۟ۧۤ۟۠۟ۖۘۨۘ۟ۨۚۨۧۜۗۙۨۥ۟ۖۘ۟۬۫ۗۖۦۘ۠۬ۘۘۙۜۘ۠ۜۦ۫۬ۢ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str2.hashCode() ^ 458) ^ 977) ^ 665) ^ 30) ^ 836) ^ 684) ^ 697) ^ 938) ^ 163) ^ 482) ^ 757) ^ 584) ^ 296) ^ 841) ^ 408) ^ 447) ^ 766) ^ 186) ^ FileUtils.FileMode.MODE_755) ^ 684) ^ InputDeviceCompat.SOURCE_DPAD) ^ 690) ^ 499) ^ 571) ^ 685) ^ 915) ^ 213) ^ 231) ^ 852) ^ 976) ^ 338) ^ 603031481) {
                case -2073668336:
                    textView.setText(getString(C0931R.string.str00e6));
                    str2 = "ۧ۫ۤۛۙۦۤ۫ۗۖۡۦۘۘۙ۟ۙۢۘۢ۬ۢۡۘۘۚ۫ۛۤۦۘۖۖۧۤۗۛۨۨۡۚۖۖۜ۟ۘۘۦ۠ۖۘۤۢۤۢۛۖۦۚۡۘ۟ۘۡ۟۠ۥۘ۫ۚ۫ۖۙۥ۬۟ۜۚۘۨۘ۟ۤ۠ۘۢۘۘ۫ۚۥۘۜ۠۟ۨۚۦۨ۠ۜۨۗۢ۠ۤۧۖۛۜ۟ۧۖ";
                    break;
                case -1922226906:
                    materialButton.setText(getString(C0931R.string.str005a));
                    str2 = "ۨۘۨۤۦ۫ۨۖۚۖ۬ۧ۫ۡۘۦۙۦۘۧ۟ۗۨۘۤۢۤۜ۟ۘ۬۫۬ۧۢۗۜۦۦۛۙۤۤۤۥۡۘۗۤۧ۠ۢۜۘۦ۟ۚۢۖۨۘۗ۫ۛۧۙۘۘ۬ۖۥۘۡۛۘۘ۫۬ۢۙۡۦۚۚۙۥ۫ۦۘۜۧۧۦۜۨ۠ۘۚۛۨۥ۠ۢ۠۫ۡۡۧۨۘۥۧۘ";
                    break;
                case -1500118537:
                    str2 = "ۛۥۨۘۙۖ۠ۡۛۥۢۢۜۘۨۜۘ۠ۧۡۘۡۢۡۘۜۚۙ۬ۛۘ۫ۚۨۘۗۘۗۚۗۙ۠۫ۗ۠ۘۜۥ۬ۛۢۖۚۥۤۖۡۜۜۥ۟۬ۗۖۖۜۗۤ۠ۜۡۖۦۚۦۜ۫ۦ۫";
                    break;
                case -1275104824:
                    str2 = "ۖۥۙۖۛۜۘ۟ۘۡۘ۬ۙ۬۫۟ۗۨۗۧۧۛۗۤۦۖۥۥۥ۟ۡۥۤۜۘۘۛ۬۠ۨۜۦ۟ۛۡ۠ۙۡ۫۬ۜۧۥۜۧ۠ۗۜ۫ۢۡ۬۠ۥۖۨۜ۠ۘۦ۟۠۬ۥۡۘۗۦۦۛۜ۫ۡۦۜۘۘۢۖ۟ۖ۟ۘۧۘۢۧۥۘۡۥۧۦۛۨۘۧۛۤۚ۟ۡۗۤۢۨۚ۫ۢ۬ۢ۟ۦۘۦ۬ۖۘ";
                    break;
                case -1141404405:
                    str2 = "۫ۨۡ۠۫ۘۨۙۗ۠ۘ۟ۧۛ۟ۙ۟ۨۘۘ۬ۥۘۖۢۨۦۡۦ۫ۤۥۘۛۙۡۡۨۨ۟ۤۧ۟۬ۖۘۤۥۖۘۥۜۦۘۖ۠ۡۘۖ۟ۛۙۘۜۘۗۖۦۘۧ۬ۦۘۡۡ۬ۦۗۤۢ۬ۘ۟ۢۚۜ۟۬ۚۨۧ۠۠ۡۘۧۥۛ۟ۛۙۥۦۥۦۡۡۘۘ۟۬ۢۨۧۘۦ۬ۗۥۗۥۘۜۡ۬ۚۧۜۘ۠۠ۖۡۧۘۘ";
                    break;
                case -798094470:
                    str2 = "ۜۗۤۦۢۜ۟ۜۛۢۜۦۘۡۘۚۛۜ۫ۘۢۥۤۜ۫ۗۛۨۤ۟ۦۘۛ۫ۖۘۡۦۧۥۨ۬ۛۘۦۖۥۦۘۧۛۡۘ۠ۤۜۘۛۡۜۛۨۨۙۖۨ۫ۜۚۛۙۖۘۨۚۨۗۗۜۘ۠ۥ۟";
                    break;
                case -717838965:
                    textView.setText(getString(C0931R.string.str00c8));
                    str2 = "ۚۚۡۘۥۢۜۘۚۦۦۘۤۦۚۛۥۘۤۚۤۖۧۜۘ۬ۘۨۘ۬ۨۚ۫ۛۖۘۜ۬ۙۗۖ۫ۘۡۦۘۦۛۥۡۜ۟۬ۗۥۢۡۧۘۡ۠ۛۚۡۜۘۦ۬ۗۡۙۦۘۦۥۧۘۖ۠ۥ۠۬ۤۙۙ۬";
                    break;
                case -36487180:
                    String str3 = "ۚ۠ۗۘۖۡۘ۫ۧۜۖۚۤۗۙۜ۠ۖۚۚۘ۫۬ۢۘۤۜۛۡۜۖۜ۬ۨۘۘۗۢۚۚۖ۬ۙۧۦۘۥۘۦۖۧۤ۫۟ۘۙۛۖ۟ۧۛۧۚ۠ۢۛۥۤ۠ۙۚۦۘۖۡۡۘ۫۫۠";
                    while (true) {
                        switch (str3.hashCode() ^ 1591515229) {
                            case -1149481686:
                                str2 = "ۛۢۜۥۦ۫ۦ۫ۤ۫ۚۚ۫ۢۖۘۚ۬ۜۘۦۡۥۘۡۚۖۘۙۗۨۘۥۘۦۜ۠ۡۧۖۙۖۗۦۡ۠ۥۚ۬۟ۗ۠ۦۛۖۢۨۨۙۤ۬ۦۘۜۥۥۘۢۘۚۨۢۦۘۗۘۢ۫ۢۘ۠۠ۛۙ۬ۤۦۢۧۦۢۤ۫۟ۥۨۘۘ۬ۧ۠ۦ۬ۨ۠ۗۡۚۜۘۧۧۖۘ";
                                continue;
                            case -204517740:
                                String str4 = "ۦ۟ۨۘۛ۟ۗ۫۠ۗۙۧۙۢ۬ۡۖۧۘۦۧۤۡ۫ۥ۬ۨۘۘۖ۠ۧۥۛۢۢۨۧۧۥۢ۟ۚۤ۠ۨۗۥۨۛۡۘۦۦۖۧۙۖۨۥ۫۠ۡۖۘۛ۟ۡۘۖۦۨۘۙۨۗۙۛۖۘ";
                                while (true) {
                                    switch (str4.hashCode() ^ 1857621365) {
                                        case -786255813:
                                            String str5 = "ۧۤۢ۟ۨۖۙ۫ۡۗۛۥۘۡۘۨۘۥۥۗۤۢۦۘۚ۫ۘۘۜۗۧۚۧ۫ۙۙۥۘۥۚۦۘۖۖ۟ۨۘۜ۬ۘ۬ۖ۬۫ۘۜۗۢۚۗ۟ۘۧۘۚۤۧۛۤۦۙ۟۫۟ۙۧۡۤۡۘ۫ۡۢۙۢۥۧ۫ۨۢۜ۬ۙ۠ۘۘۤ۟ۡۧۢۖۧ۟۫ۙ۠ۜۘۥ۬۟۠ۨۨۘ";
                                            while (true) {
                                                switch (str5.hashCode() ^ (-1979226037)) {
                                                    case -2000907578:
                                                        String str6 = "ۚ۟ۦۘۖ۬۫۬ۥۥۘ۟ۡۡۘ۟ۙۜۥۢۡۘ۫ۖۡۡۚ۠ۜۧۨۦۜۘۘ۫ۘۘ۠ۦۦ۠ۖ۫ۖۛۖۘۘۖۡۖۢۢۥۙۡ۫۫ۢۨۚۨۥۚ۫۬ۛۜۘۜۘۢۘۧ۟۠ۤۛ۫ۥ۫ۤۡۤۚۘۜۘۡۗۨۘۦۨۡۘ۠ۨۗۚۤۥۘۛۜۦۘ۫۫ۘۘۡۧ۠۟ۜ۟ۢۗ۠ۤۨۧ۬ۖۦ۠ۥۜۙ۫ۨ";
                                                        while (true) {
                                                            switch (str6.hashCode() ^ (-718013997)) {
                                                                case -1809326405:
                                                                    str5 = "ۙ۫ۥۜۘۜۘۡۥۧۤۥۗۖ۫۬ۦۜۘۖۡۜۘۙۤۥۘۙۜۛۙۡۖۘۨۚ۠ۢۤ۠ۥ۠ۨۘۙۡۘۘ۬ۗۧۥۢ۬ۨۧۘۢۘۘۗۖۦۖۥ۬ۡۜۙۘ۫ۘۘۛۙۨۜۨۛۜۡۥۘۤۡۤۤ۟ۜۘۥۨۡۘۢۤۜۘۡۘۛۗۥۨۘۦۤۗۙۜۢۛۨۘۙ۫ۨۖۜۧۘ۟ۗۗۨۗۗۘۧۦۙ۬ۧۨۡۤ۠ۖۧۘۜۛۗۗ۠ۦۘۙۢۙ";
                                                                    break;
                                                                case -921893286:
                                                                    str5 = "ۖۖۥۡۧۘۚۡۘۥۛۘۘ۬ۤۤۖۦۜ۠ۜۘۛۥ۫ۖۙ۫ۙۖۘۙ۠ۖۘ۠ۛۨ۟ۚ۬ۘۦۦۘۛ۟ۤۚۢ۬ۜۗۨۨۖ۬ۡۧۚۧۚۡۘۥۚۖۘ۬ۥۥۘ۬ۗۥۘ۬۫ۘۘۨۢۚ";
                                                                    break;
                                                                case 751878942:
                                                                    String str7 = "ۥۡۦۘۚۨۥۘۦ۫ۘۖۘۘۧ۠ۨۘۜۚۘۙۤۖۘ۠ۢۘۘ۬ۥ۫ۖۤ۠۬ۥۦۘۖۢۥۜۤۥۘۤۜۜۛۗۡۘۢۤۢۡۗۘۘۛۘۦۘ۬ۚۘۘۥۤۗۦ۠ۗۥۧ۫ۙۚۧۗۗۚ۬ۦ";
                                                                    while (true) {
                                                                        switch (str7.hashCode() ^ (-543931041)) {
                                                                            case -1295808444:
                                                                                str7 = isInstalled(str) ? "ۡۗۗۧۦ۫ۙ۬ۡۤ۬ۢۖۧۥۘۥ۫۬۟۠ۙۗۙۜۥۨۖۢۢۨۥۜ۠ۦۤۦۘۦۡ۟ۗۧۥۡۥۖۛۧۧۨۢۡۧۜۘ۠۟۫ۖ۠ۜۘۙۗ۟ۥۨۢۛۧ۫ۦۚۘۘۨۡۧۥۦۜۘۛۛۚۧۧۨۡۚۚ۟ۜ۬ۛۚ۫ۧۜۢ۟ۨۥۙۦۥۘۥۦۘ" : "ۗ۫ۦۦۙ۬ۗۖۛۜۥۛۖۛۙۡۘۘۘۧ۟ۖۘۡۧۥۘۖۤۚ۫ۡۚۜۜۗۡ۬ۘۘۙۚۥۗۦۤۢ۬ۖ۠ۚۖۢۗۘ۫ۖۙۡ۟ۢ۟۟ۛۧۙ۬۫۫ۥۘۤۢۖۘۥ۫ۜۘۘۤۦۘ";
                                                                            case -573857396:
                                                                                str7 = "ۥۦۚۜۡۥۢ۫۫۫ۜۘ۫ۧۥۨ۠۟ۖۖۖۘۚۗۥۜۥۘۧۡۗ۫ۦۖ۬۫ۜۘۤۢۖۘۧۜۘۛ۬ۨۘۗۨۦۘۡۦ۫ۗ۠ۛۚۨۢ۬ۥۘۖ۠ۚۘ۟۬ۗۥۨۘ۬ۛۚۖ۬ۥۘۖ۠۬ۜۚۡۘۧۘۖۘ۬ۙۗ۟۬۫ۙۥۖۙۖۘۡۗۨۘۛۨ۫۫ۜ۠ۙۥۜۗۡۡۘۤۜۚۜۙۢۤۡۘ";
                                                                            case 460004062:
                                                                                str6 = "۠۟ۜۘۘۡۢ۠ۦۜ۠ۘۙۧۥۡۘۜۡۡۗ۠ۥۘۡۙۥۡۡۨۘۛۙۡۖۢۚۗۙۖۘۚۧۨۧۙ۟۠ۛۦۘۚۜۗۡۢۧۘۙۡۢ۫ۢ۫ۨۘۙۖ۟ۙ۬۫۫۬ۚۘۘۡۧۥۘۡۧ۠ۛۙۤۤۗۧۧۗۛۛۡۧۘۢۚۘۥ۟ۥۘۥۖۘۘۖۥۨۘۛۘ۬";
                                                                                break;
                                                                            case 2065374401:
                                                                                str6 = "ۚۘۛۜۧۘ۟۠۫ۚۚۘۘۧۡۥ۬ۥۖ۠ۨ۠۫ۚۢۥ۠ۙۤۚۡۘۨۛۡۧ۬ۦۘ۠ۖۦۡ۠ۥۘۤ۬ۘۨۥ۫ۡۖ۫ۗۘۡۡ۫ۖۘۧ۬ۡۘۡۥ۠ۘ۟ۥۘۦ۟ۥۘ۬ۛۜۨۨۚۛۗۚ۠۟ۡۤۦۜۖۜۛ۫ۡۜۘ۫۬ۖۘۤۧ۠ۨۛ۬ۧۤۘۘ۬ۚۖۘ۬۠ۥۘ۬۫ۡۘۡۡۦۚ۠ۗۗۤۡۙۗۘۘ۫ۢۥۛۦۘۨ۠ۥۗۦۨۘ";
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 1390600141:
                                                                    str6 = "ۦ۫ۨۘۙۥۧۘۡۢۡۘۦۨۘۧۛۤۥۘۘۖۛۧۥۦۜ۬ۜۚ۠ۡۜۘۤۢ۠ۘۡۘۖۛۤۤۧ۬ۨۜۥۢۧۨۘۗۡۖۦۘ۠ۚۧۢۘۢۘۦۧۙۚۜ۫۫ۘۘۘۜۨۦۛۗۨۖۡ۟۠ۨۨۢ۟ۥۦۖۘ۫ۨۘ۠۬ۥۨۚۖۚۛۖۛۦۤۗۖۦۘۥۛۦ۠۠ۧۜ۠ۘۘۡۧۤۨ۠ۨۘ";
                                                            }
                                                        }
                                                        break;
                                                    case -1299263461:
                                                        str4 = "ۡۢۘۗۨۘۘ۬ۦۛۙۙ۠۠ۘۤۨ۫۟ۜۧ۠ۛۘۘۥۚۨۘ۟۟۫۠ۛۛۥۗۖۗۚۥۡۡۘۤۥۗۡۚۨۘۢ۬ۥۡۦۧۘ۟ۙ۟۬ۡۢ۠ۨۚۢ۫ۨۘۦۤ۫ۥۚۘۘۨۡ۠ۦۖۦۘۡۡ۬ۘۢۡۥۤۤ۫ۤۡۘۦۛۦۘۦۡۚۡ۫ۜ۫ۖۜۘۜۗۚۥۛۘۘۙ۫ۜۘۘ۠ۖۘۡۧۥۘۦۡۘۘ";
                                                        break;
                                                    case -181336675:
                                                        str5 = "ۛۢۖۘۚۘۢۛۚۡۘOۥۧ۠ۥ۠ۨۘۖ۫ۘۘۨۥۧۘۢۙۚ۟ۚۜۘۡۤۡۘ۠ۜۤ۬۟ۜ۟ۤۢ۠ۥۥۘ۟ۛ۫۟ۛۚۥۛۜۢۧ۬ۙۡۜۘۤۘۥ۫۬ۗۥۡ۟ۙۖۨۤۙۡۧۘۡۚۚۜۧۖۜۘۙۗ۟ۗۛۘۘ";
                                                    case 945696378:
                                                        str4 = "ۜۖۚ۟ۢۘۘ۟ۥۖۘ۟ۤ۠۬۟ۗۨۘۘۤۘۦۨۛۖ۠ۦ۬ۖ۠۫ۙۖۢۖۢۗ۫۠ۚۗۤۦۘۚۚۤۗۜ۟ۥۧۥۧۖۗ۟ۨۡۘۢ۠ۧۢ۫۠ۡۤۥۗۚ۠۟ۨۡۙۘۦۙۥۧۛ۟ۦ۟ۡۘۢۨۧۤۚۨ۠۫ۛۤۘۛ۠ۡۘ۫۬ۗ۟۬ۤۘ۠۬۫۬ۜۘۧۤ۫ۢۦۡۚۡۚ۟ۦۘ۫ۘۜۘۚ۬ۛۙۨۤۚۗۘۘ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case 638403419:
                                            str4 = "ۛ۫ۖۚۛۢۢۖۨۧۦۧۗۨۧۧۘۡۤۚۡۘۗ۫ۨۘۘۖۧۥۤ۫ۖ۫ۥ۫ۨ۟۟ۥۚۗۜ۟ۘۨۡۙۧۘۘۘۦۜۘۗ۬ۧۜ۠ۨۘۧۦ۬ۢۤۦۘ۠ۛۤۚۗۡۤۡۨۧۚۤۨۛۥۡۦۘۡۚۡۘۥ۟ۢۛۡۨ۟ۖۥۗۖۜ۟ۗۜۗۨۙۡ";
                                        case 879954206:
                                            str3 = "ۜۙۢۚۨۙۜۨۡۢۖۖۗ۟ۖۘۚۙۦۖ۫۠ۛۤۥۡۖۥۘۛۢۥۚۗۦۘۨۜ۠۠ۤۥۤ۫۫ۛۚۦۘۦۘۖۘۧۢۛۧۗۗ۫ۨۗۚۜۘۡۖۨۖۜۢۘۤۗۤ۫ۖۡۚۤ۬۫ۖۘۘ۠ۘۧ۬ۥۘۚ۟ۜۘۖ۠ۡ۟۠ۨۨ۟ۜۘۙۤۡۘۨۡۜۤۗ۟۟ۥۦۘۢ۠۬ۦ۫ۢۢۥۡۘۧ۠ۖۘ۬ۜ۠ۜ۟ۗۨۧۨۘ۫۟ۖۧۜۚ";
                                            break;
                                        case 1990354758:
                                            str3 = "ۚۙ۫۬ۖۧۘۜۖۤ۬ۥۦۗۘۘۘۢۢۥۘۧ۟ۗۢۛۖۘۨۢ۬ۤۜۥ۠ۖۡۘۨۨۥۖۘۖۖۧۘۜۚۥ۟ۘۜۘۡۡۡۘ۬ۢۤۜۢۡۤۡۥۦۨۘۧۛ۫۫ۥۘۛۡۧۖۡۧۘۦۛۢۥۢۦۘۘۜۖۘ۬ۢۨۘۨۡۛۡۜۥۘۡ۫ۘۛۢۖۤۛۜۘۜۚۚۙ۬۫ۥۚۛۤۛۨۨۖۤۚۜ۟";
                                            break;
                                    }
                                }
                                break;
                            case -172865721:
                                str2 = "ۦۖۚۗۖۖۘۜۧۧۖۦۧۘۜۦۦۥۛۜ۟ۛۨۗۘۧۜ۫ۨۘۢۤۦۜ۬ۙۛۙۡۙۛ۬ۛۖۥۛۦۡۘۜ۠ۦۘۜ۫ۨۗ۟ۨۦۤۥ۠ۡۘۧ۟ۡۥۨۛۙۡۦۖۧۢۛۖ۠۫ۧۢۥۨۧۜۖ۟ۗۧۡ۟ۤۨ۠ۗۖ۟ۦۡۧ۟ۡۚۘۥ۠ۛۦۛۙۥۥۙۦۥ۬ۦ۠ۢۦ۫ۧ";
                                continue;
                            case 2031629691:
                                str3 = "ۦۡۦۘۛۛۥۧۧ۬ۨۦۢۗۡ۫ۖ۟ۤ۟۠ۥۜۗ۫ۚۥۡۙۗۡۘۜۘ۠ۢۡۤۜۡۘۦۤۘۡ۫ۘۨ۠ۡۘۙۚۜۘۨۜۧۖۘۨۘ۬ۢۖۤۗ۠ۦۗۘۘۜۘۢۚۛۜۘۦۛ۠ۥۡۦۢۦۨۘۜۖۤ۠ۥۘۚۙۖۘ";
                        }
                    }
                    break;
                case 118682367:
                    str2 = "ۧۥۛۥۚ۟ۜۖۨۘۡۤ۟ۨۨۢۥۡۤ۠ۜۨۦۧۡۘ۫ۚۥۘ۬ۧۦۘۖۛۛۧۛۗۛۦۤۛ۫ۗ۠ۦۦۘۗۧۚ۫ۖۤۙۨۙۥ۠ۢۧۗۜۘۙ۠ۨۘۡۖۡۘۤۖۗۗۛۨۘۦ۠ۗ۟ۘۡۘۨۧۦۘۦ۬۟ۦۚۚۧۥۘۢ۠ۡۘۥۜ۠۠ۗ۠۟ۢۨۘۚۘۥۘ۠۠ۜۘۤۤۥۖۖۘۙۙۘ۠ۙۘ";
                    break;
                case 646560584:
                    materialButton.setText(Deobfuscator$$app.getString(-3440727266633277257L));
                    str2 = "ۧۥۛۥۚ۟ۜۖۨۘۡۤ۟ۨۨۢۥۡۤ۠ۜۨۦۧۡۘ۫ۚۥۘ۬ۧۦۘۖۛۛۧۛۗۛۦۤۛ۫ۗ۠ۦۦۘۗۧۚ۫ۖۤۙۨۙۥ۠ۢۧۗۜۘۙ۠ۨۘۡۖۡۘۤۖۗۗۛۨۘۦ۠ۗ۟ۘۡۘۨۧۦۘۦ۬۟ۦۚۚۧۥۘۢ۠ۡۘۥۜ۠۠ۗ۠۟ۢۨۘۚۘۥۘ۠۠ۜۘۤۤۥۖۖۘۙۙۘ۠ۙۘ";
                    break;
                case 1422462401:
                    return;
            }
        }
    }

    public void updateSystemInfo() {
        String str = "ۙۜۦۘۚۥۚ۬۠ۙۨۚۜۜ۟ۨۘۡ۫ۦۧۤۨ۫ۢۚۨۤ۫ۧۨۘۜۨۛۚۧۡۘ۬۬ۜۥۙ۫ۛۘۘ۫ۨۗۗۘۘۨۧۦۧ۠ۥۤۚۨۧۚۨۘۗۜ۬ۦۖۨۦ۟ۙۡۘ۫۟ۥ۬ۘۘ۠ۙۛ۠۟ۦۘۥۥۗۖ۬ۦۜ۠ۖۧۥۜۘۖۘ۠ۦۗۡۘ۫ۡ۫ۖ۟ۦۘۦۡۜۧ۬ۗۡۨۛ۬ۛۜۙۡ۫ۛۥۘۘۦۘۡ۠ۖ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 786) ^ 740) ^ 963) ^ 969) ^ 431) ^ 83) ^ 482) ^ 114) ^ 110) ^ 795) ^ 510) ^ 919) ^ 108) ^ 53) ^ 556) ^ 582) ^ 599) ^ 501) ^ 96) ^ 527) ^ 829) ^ 982) ^ 857) ^ 562) ^ 644) ^ 849) ^ 580) ^ 139) ^ 109) ^ 195) ^ 921) ^ (-1662182608)) {
                case 476834110:
                    str = "۫ۤۜۛۜۛ۫۟۠ۨ۟ۖۘۢۜۢۗۘۤۜۚۨۘۤۘۥۢۛۧۛۤۚۡۢ۟ۖ۟ۘۗۙۦۖۘۦۖۧۙۧ۠ۡۤ۬ۥۡۘۘۛ۬ۘۘ۬ۧۤۢۚۢۚۦۜۘۡ۠ۡۘۘۡ۬ۙۡۦۖۚ۫ۛ۟ۥۜۢۚۦۘۛۘۨۘ";
                    break;
                case 1523419987:
                    return;
            }
        }
    }
}

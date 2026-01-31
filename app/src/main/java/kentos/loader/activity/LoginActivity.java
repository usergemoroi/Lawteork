package kentos.loader.activity;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.solver.widgets.Optimizer;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.content.ContextCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardViewHelper;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kentos.loader.C0931R;
import kentos.loader.activity.LoginActivity;
import kentos.loader.server.ApiServer;
import kentos.loader.utils.ActivityCompat;
import kentos.loader.utils.FLog;
import kotlin.UByte;
import okhttp3.internal.http.StatusLine;
import org.json.JSONObject;
import org.lsposed.lsparanoid.Deobfuscator$$app;
import top.niunaijun.blackbox.utils.FileUtils;
/* loaded from: classes2.dex */
public class LoginActivity extends ActivityCompat {
    public static boolean Kooontoool;
    private static String ModeSelect;
    public static String PASSKEY;
    public static boolean Sufii;
    public static String USERKEY;
    private SharedPreferences prefs;
    private AlertDialog progressDialog;
    private ImageView showpassword;
    private boolean updateCheckComplete = false;
    private static final String USER = Deobfuscator$$app.getString(-3440728430569414473L);
    private static final String PASS = Deobfuscator$$app.getString(-3440728409094577993L);
    private static final String PREFS_NAME = Deobfuscator$$app.getString(-3440728662497648457L);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kentos.loader.activity.LoginActivity$2 */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC09372 implements View.OnClickListener {
        final LoginActivity this$0;
        final Context val$context;
        final TextInputEditText val$textPassword;

        View$OnClickListenerC09372(LoginActivity loginActivity, TextInputEditText textInputEditText, Context context) {
            this.this$0 = loginActivity;
            this.val$textPassword = textInputEditText;
            this.val$context = context;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$onClick$0$kentos-loader-activity-LoginActivity$2  reason: not valid java name */
        public /* synthetic */ void m248lambda$onClick$0$kentosloaderactivityLoginActivity$2() {
            String str = "ۛۡۨۘۜۤۙۥ۬۫ۧۜۜ۬ۢۘۘۛۥۙۚۨۡۘۗۘۛۖۤۙ۟ۨۨۘۢۡۙ۠ۘۦۡۦ۬ۥۢۡۘۤۘۧۖۚۘۦۜۦۘ۠۬ۨۦۘ۠ۥۧۛۗۧۨۤۙ۟ۨۘۗۥۙۘۡۦۘ";
            while (true) {
                switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 602) ^ 926) ^ 648) ^ 371) ^ 304) ^ 763) ^ 558) ^ 631) ^ 458) ^ 298) ^ 376) ^ 906) ^ 707) ^ 158) ^ 903) ^ 906) ^ 324) ^ 562) ^ 247) ^ 55) ^ 258) ^ 279) ^ 913) ^ 376) ^ 749) ^ 618) ^ 604) ^ 501) ^ 393) ^ 584) ^ 509) ^ 1621342634) {
                    case -895292514:
                        str = "۠ۥۗ۟۠ۚ۬ۗۨۨۥۘۨۛۚ۫ۘ۬ۙۙۖۘۛۙۜۘۗۥۨۘۢ۠ۧ۬ۘۚۛۗۡۖۢۤ۫ۨۦۙ۟ۦۘۦۧۘۘۥ۠ۜ۬ۥۦۤ۫ۤۙۛۨۘ۬ۡۚۥۢۨۘۖ۠ۖۙ۠ۘۘۖۚۥۜۥۧۘ۟ۥۤۜ۟ۗۤۖۗۥۘۚۢۚ۟ۚۧۥۜۡۧۖ۟ۤۡ۟ۡ";
                        break;
                    case -71373842:
                        return;
                    case 1075012842:
                        LoginActivity.access$300(this.this$0);
                        str = "ۛۗۘۘۛۙۚۘ۬ۙۘۡۨۥ۟ۨۖۡۚۡۤ۫ۦۘۥۗۛ۬ۧۥۧ۫ۘ۟ۢ۫ۘۜۛۨۥۘۥۨ۫ۖۜۧۘۤۤۙۧ۠ۦۗۧۚۚۖۙۛۚ۫ۘۡۛۥۡۨۡۦۦۧۘۢۢۛۤ۟ۜۘۜ۫ۥ۫ۧ۠ۨۛۙ۬ۙۚۡۢۢۢۧ۬۬ۚۙ۬ۧ";
                        break;
                }
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str = null;
            String str2 = "ۥۡۖۨۢۤۡ۬۫ۡۘۢۥۨۘۘۘۛۨۘ۬ۨۦۘۦۙۗ۠ۥ۬ۦۧۛۗۜۨۘ۫ۡۜۗۧۤ۟ۥ۟ۘۥۨۘ۬ۘۜۥ۟۠ۡۨ۠ۦۚۨۘۚۥۦۘۚۨۜۘ۠ۦۚۢۦۘۙۡۖ۟ۖۘۘۧۖۘۘۜۛۗۛۙۨۘۡۨۜۦۡۤ";
            while (true) {
                switch ((((((((((((((((((((((((((((((((str2.hashCode() ^ 960) ^ 666) ^ 977) ^ 280) ^ 382) ^ 211) ^ 821) ^ 130) ^ 125) ^ 631) ^ 810) ^ 129) ^ 716) ^ 913) ^ 565) ^ 35) ^ 602) ^ 246) ^ 327) ^ 221) ^ 907) ^ 251) ^ 106) ^ 512) ^ 149) ^ 171) ^ 13) ^ 54) ^ 352) ^ 794) ^ 325) ^ 1352352720) {
                    case -2022548558:
                        LoginActivity.USERKEY = str;
                        str2 = "۫ۛۘ۫ۧۧۢۤ۬ۡۡۦۧۨۘۘ۬ۢۡۘۘۖۖ۠۟ۨۛۡۧۗۚۢ۠ۨ۟ۨ۫ۜۘۧۧۘۦۘۨ۠ۖۥ۠ۗۦۖۘۘۡ۫ۜۡۨۜۦۘۥۡۜۜ۬۠ۤ۬ۜۘۖۢۜۘۡۧۡۡۤ۫ۦ۟ۦۚۢۧ۫۟ۖۘۨ۟ۨۤۤۡۡ۠ۘۘۥۖۜۨۦۖۘۤ۫ۥۘ";
                        break;
                    case -1796520208:
                        Toast.makeText(this.val$context, Deobfuscator$$app.getString(-3440729512901173065L), 0).show();
                        str2 = "ۘ۬ۧۧۥۧۛۡۘۘۙ۫ۥۘۢۛۨۢۖۙۗۤۛۧۨ۫ۡۨۤۧۥۗۥۛ۫ۖۜۘ۟ۧۙۜۛۨۡۨ۟ۨۙۖۦۢۡ۬۫ۧۛۥۜ۫ۜۘ۬ۘۡۘۤۘۨۘۨۜۘۘ۫ۧۡۘ۟ۛۤ۠ۗۨۘۖۚ۫۠ۛۦۢۨ۠۟۫ۡ";
                        break;
                    case -1697129417:
                        LoginActivity.PASSKEY = Deobfuscator$$app.getString(-3440729667519995721L);
                        str2 = "ۖ۠ۡۘۜۜۜۦۢۖۘ۟ۛۨۨۚۜ۫۫ۤۚۥۦۡۥۦۘۡۧۨ۫ۘۘۛۤۢۘۥۧۛ۟ۡۘ۬ۧۖ۟۬۟۟ۤۧ۫ۧۘۘۖۡۗ۠ۢۜۘ۟ۡۦۨ۫ۖۦۦۜۘۙۜۡ۟ۢۥۨ۟ۤۡۚۙۤۖۘۥ۬ۗ۠ۘۧ";
                        break;
                    case -1599987339:
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) { // from class: kentos.loader.activity.LoginActivity$2$$ExternalSyntheticLambda0
                            public final LoginActivity.View$OnClickListenerC09372 f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                String str3 = "ۙ۫ۥۘ۟ۦۘۚۥۘۘۘ۟ۨۘۜۥۛۜۥ۬ۚۦۥۘۗۚ۬۟ۚۡۨۥۜۘۧۘۥ۠ۢ۟۬۟ۦۘۗۛ۠ۤ۟ۗۙۛۤۤ۟۬ۛۨۗۨۘۥۦۡۘۗ۫ۥۘۡۙۥۖۘۥۢۘ۫ۢۗۘۦۙۖۜۦۛۗ۫ۜۘۗۥۛۡۙۚ۟ۘۜۢ۫ۡۘۧۨۗۗۥۘۚۥۥۘۢۜۜۘ۫ۖۡۥۘ۫ۖ۬ۤ۟";
                                while (true) {
                                    switch ((((((((((((((((((((((((((((((((str3.hashCode() ^ 466) ^ 99) ^ 403) ^ 392) ^ 386) ^ 964) ^ 133) ^ 867) ^ 541) ^ 11) ^ 355) ^ 163) ^ 397) ^ PointerIconCompat.TYPE_ZOOM_OUT) ^ 998) ^ 545) ^ 206) ^ 387) ^ 138) ^ 723) ^ 663) ^ 239) ^ 323) ^ 32) ^ 649) ^ 162) ^ 224) ^ 372) ^ 597) ^ 51) ^ 299) ^ (-1135620196)) {
                                        case -1348004609:
                                            return;
                                        case -685084826:
                                            this.f$0.m248lambda$onClick$0$kentosloaderactivityLoginActivity$2();
                                            str3 = "ۛۚۤۥۦۢ۟ۘۨۙ۫ۢۥۘۡۗۜۡۘۡۛۢۖ۠ۡۘۙۧۜۘۚ۫۟ۗ۟ۗۜۗ۫ۧۥۧۜۨ۫۠ۙۙۗۗۧۥ۠ۡۘۖ۬ۤ۬ۨۛ۠ۦۡۥۦۙۙۜۡ۫ۗۘۘۧۙۥۜۡ۠ۜ۬ۡ۠ۘۚ۠ۖ۠ۧۚۥۘۢۦ۠ۢۛۨۘۘۨۦۡۖۨۤۦۛۢ۬ۦۛۚۡ۠ۤۘۘۖ۫ۨۘۧۘۜ۫۬";
                                            break;
                                        case -340960621:
                                            str3 = "۬ۡۘۢ۠ۨۘۜۨۗ۬ۚۘۘ۠ۜۗۙۗۥ۟ۤۨۤ۠ۜۖۢۛۖۚۙۚۢۛۚ۟۟ۨۥۦ۠ۘۘۚۨۚۖۢۜۚۚ۬۫۟ۤۧۥۛ۠ۙۚۢۨۡۗۦۘۢۡۤۧۖۜ۟ۢۤ";
                                            break;
                                    }
                                }
                            }
                        }, 100L);
                        str2 = "ۛۢۚۢۤۡ۟۫ۧ۬ۦۚۗۗ۠ۤۨۥۜ۟ۖۘ۟ۦۦ۬۬ۜۜۦۘۘ۬ۖۘۘۖ۟ۙۢ۬ۤۛۢۥۢۨۥ۟ۢۦۧۘۘ۬ۜۢۜ۬ۖۧۥۦۘۦۘۨۚۢۨۜۤۨ۫ۦۖۘۘۚۛ۟ۖۘۧۙۡۦۢۚۖۘۢ۬ۥ۠ۤۥۘۤ۬ۘۘۢ۠ۨۙۜۡۘۖۜۦ";
                        break;
                    case -598065201:
                    case -140606350:
                        return;
                    case 163744943:
                        str = this.val$textPassword.getText().toString().trim();
                        str2 = "ۤ۫ۖ۫۠ۜۘۡ۠ۤ۫ۖۘ۬ۦۗ۟ۤۘۘۖ۫ۥۦۚۜۘۘ۠ۢۜ۟۫ۖۜۦۥۖۤۦۡۜ۟ۢۛ۫ۧۙ۟۟ۖۖۢۨۘ۠ۘ۟ۜۤۢۗ۬ۦۤ۫ۨۜۙ۠ۥۙۛۢۦ۠ۨۤۥ";
                        break;
                    case 260061376:
                        str2 = "ۡۢۜۙۧۖۘۖۥۦۘۡۥۙۦ۠ۢۘۘۥ۠ۢۛ۬ۘۛۤۦۡ۫ۦۙۚۗۦۜۙۡ۟ۨۘ۫ۤۤۥۚۦۤۛۛۜۧۦۘ۫ۨۨۗۖ۬۬ۢۛۥۘۡۘۨۗۜۛ۠ۚۚۥۘ۬ۡۘۘۧۡۖۘ۬ۨۨۚۤ۠ۙۡ۬ۨۛۚۧۘۡۢۙۖۜۖۥۡۙۙۗۦۦۘۙۨ۫ۡۙۥۘۢۤۜۘۡۤ۬ۙۧۘۘۧۘۘۖۜۢۜ۬۬ۤ۟ۤۡۙ";
                        break;
                    case 743935288:
                        str2 = "ۗۨۜۢۘۙۦۤۚ۬ۗۦۚۢۥۘ۠ۖۛ۬ۥۢۛۗ۬۬۟ۖۘ۬ۢۜۘۛۘۙۛ۬ۖۨۧۥۨۨۙۢۤۡۨۘۦۘۨ۫ۧۙۗۛۘۜۘ۟ۡۧۚۡۘۜ۬ۛۛۡۡۗۛ۫۫۫ۦۘۧۖۛۚۖۦۘۥۖۘۜ۫ۥۥۤۧۘ۫ۛۥۧ۬ۜۖۜ۫۫ۨ۠ۜۤۗۥ۟ۘۥۥۘۗۘۦۘۨۜۥ۠ۢۗۖ۠ۜۚۖۚ۠۟ۖۘۢۖۘۜ۟ۗ";
                        break;
                    case 795326466:
                        String str3 = "ۥۥ۟ۗ۠ۘ۠ۘۥۘۛۤۚۚ۠ۘۙۖۘۖۤۦۜۘۛۘۘۚ۬ۧۖۘ۬ۘۤۖۜۥۡۛۦ۫ۡ۫ۢۡۢ۬ۥۡۘۛۢۖۘۜۢ۠ۜۡۦۘۦۗ۫ۜ۫ۧ۟ۙ۫ۚۢۢۢۧۗ۬ۦۨۡۦۘۤۛۥۡ۟۬ۖۖۧۘ۬۫ۡ۫۠ۖۘۡۤۡۘۥۧۤۧۛۘۡۛۤۖۜۧۘۛ۫ۤ۟ۦۢ۟۬۫ۨۦۖۜ۬ۨۡ۬ۡۥۧۘۢۦۜۘۨۦۦۘ";
                        while (true) {
                            switch (str3.hashCode() ^ (-1529086950)) {
                                case -1211212723:
                                    str3 = "ۡۢۦۘ۬ۧۦۤۛۥۤ۫ۚۨۥۢۦۗ۬ۤۛۥۥۚۨۧۦۦۘۗۚۜۘ۫ۚ۫ۗۘۘۘۦۤۦۘۤۧۥۘۧۧۜۘۧۗۜ۠ۢ۫ۡۙۙۡۡۤۧۖۗۨۢۢۢۚۗۘۨۘۥۨۘۘۗۜۡۢۡۨۦۖۘۥ۫ۡۥۢۨۢۤۥۘ۫ۢ۬۟ۨۦۘۜۤۗۚۢۥۘۤۥۖۘ";
                                case -113039909:
                                    str2 = "ۢۚۘۘۘ۠ۚۧۚۛۧۢۙ۟ۤۘۘ۬ۛۘۡۚۜۥۜۥ۟ۦۤۜۧۘۦۧۘۥۨۦۖۧۦۘۖ۫ۦ۬ۛ۠۬۠ۧۦۙۜۘ۬۬ۦۘۜۚۦۦۡۧۡۨ۟ۙ۟ۖۥۧ۟ۗۡۜ۬ۧۙ۟ۦۤۙۚۗ۠ۡۦۘۧۖۥۘۖۡۦۘ۠۬ۗۧۨۧۘۢۙۡۘۨۤۜۘ۟ۜۘۤۖۙۨ۠۬ۦۖ۟ۖۘ";
                                    continue;
                                case 76740970:
                                    String str4 = "ۗۡ۫ۡۥۚۙ۫ۚۜۘۜۘۙۢۡۧۦۦۘۗۚۥۗۢۨ۟ۘۘۚۖۜۘۖ۫ۖ۟ۗۛۖۙۛ۫ۦۥ۟ۖۘۤۗۖۘ۬ۚۛۡۧۧۛۥۛۧۨۢۚۘۖۦ۟۠ۤۧۢۤۘ۬ۚۡۦۘۦۙۗۢ۟ۨۦ۫ۖۥۨۘ۟ۦۤ";
                                    while (true) {
                                        switch (str4.hashCode() ^ (-495915388)) {
                                            case -1983039783:
                                                str3 = "ۛۜۗۤۜۧۧۙۦۘۥۗ۫ۖۤ۠۟ۘۧۜۚۦۘۡۘۖۘۤۦ۟ۘ۫۫ۥۢۦۡۤۥۘۤ۫ۤۡۦۘۨۥ۟ۜۚۙ۟ۖۖۥۤۗۦۗۤۦۧۡۘ۠ۡۘۦ۠ۨۘۤۚۘۘۜۥۘۗۘۧۘۙ۬۠ۘۢۤ۬ۥۘۡۨ۠ۤۥۢۥۥۢۦۖۘ۟ۘۘۧۙۖۘۜ۠ۘۘ";
                                                break;
                                            case -30865395:
                                                String str5 = "ۜۘۥۘۤۢۗۚۖۜۘ۟ۘۧ۫ۙۖۘۗۙۥۗ۟ۨۥ۫ۡۘۡۙۡۘۘۘۜۢۥۙ۫ۛۨۧۖۡ۟۬ۖۡۧۤ۫۫ۙۙۗۤۜۢۧ۠ۧ۫۫ۥۘ۬ۗۨۜۜ۬ۡۜۨۘ۫ۢۦۗۧۨۥۗۨۘ۫ۜۧ۠ۚ۫ۥۜ۫ۚۧۖ";
                                                while (true) {
                                                    switch (str5.hashCode() ^ (-1775864583)) {
                                                        case -1412712780:
                                                            str4 = "ۘۦۙۤۗۙۧۜۘۘۢۜۨۘۗۤ۟ۚۢۘۙ۫ۨۡ۫ۥۘ۠۬ۗۜۛ۬ۘۧۖۘ۠۠ۘۖۙۖ۠ۛۢ۟ۥۨۘۡۤۗۗۡۜ۬ۛۡۘۜۜۢۧۡۘ۫۠ۦ۬ۜۘۦۧۤۢ۟۠ۥۥۨ";
                                                            break;
                                                        case 339652684:
                                                            String str6 = "ۖ۫ۡۘ۠ۙ۬ۚۛۗۘۡۧۘۦۥۧ۬۟ۜۘۗ۫ۥۜۖۘۗۛۨۘۜۜ۠ۚۨۡۤۛۥۖۥۤۚ۟۠ۖۘ۟ۙ۬ۢۛۧۡۙ۟ۡۘۛۜۖۘۚۛۙۜۦۘ۠ۙۢۜۤۥۥۚۦۘۡۖۡۘۜۚۧ۠ۤۦۘۚۚۢۢ۠";
                                                            while (true) {
                                                                switch (str6.hashCode() ^ (-1879023268)) {
                                                                    case -1495782125:
                                                                        String str7 = "ۦۧۡۘۛۙۖ۬ۢ۫ۚۚۧۛۤۨۙۥۤ۬۟۟ۧۥۦۘۘۥۧۡۨۦۨۢۗۖۘۥ۟ۜۘۤۦۗۡۧۘۗۗۙۨۡ۠ۙۘۙ۫ۦ۫ۢ۟ۗ۬ۛ۟ۦۘۜۘ۬ۦۤۜۡۙۚۥۡۡۥۨۘۖۛۚۚۥۡۘ۬۫ۦۘۚۤ";
                                                                        while (true) {
                                                                            switch (str7.hashCode() ^ (-1124722021)) {
                                                                                case 503174733:
                                                                                    str7 = str.isEmpty() ? "ۙ۟ۛۙ۬ۨۘۜ۬ۧۢۗۙ۫ۘ۫ۥۥ۠ۗۡۚۥۚۛۙۘۡۡۘۖۙۨۘۜ۫ۧۙۛۗۙۥ۫ۚ۠ۖۜۨۤۢۚۨۘۙۢۛ۠۠ۘۖۨۥۘۛۘۚۘۙ۟۟۟ۥ۫۫ۘۘ۬ۨۧۧۘۖۧۡ۫ۢ۟ۤۨۘۙ۬ۡۘ۫۬۠ۦۛۚۜۜۘۧ۟۠ۚۥ۬" : "ۡۛۡۘۧ۠ۗۙ۟ۘۘۤۜۢۗۧۥۗۥ۟ۥۧۖۨۗۥ۠ۦۜۗۚۗۘۚۖ۫ۜۘۨ۠ۦۨۡۜۘۚۘۜۢۙۡۘۗۢۚ۟ۖۥۘۙۘ۠ۧ۟ۧۚ۬ۤۤۙ۟۫ۥۘۘ۠۠ۧۧۢۖۘۤۥۘۧۤۛۖ۫۟ۡۡۦۘ۬۟ۙ";
                                                                                case 1355288112:
                                                                                    str6 = "ۜۥۘۘۨۛ۫۠ۜۧۘ۬ۨ۟ۡۙۙۚۜۧۛ۫ۦۜۦۘۜۨۘۘ۬ۡۖۘۥۜۘۜۡۨۚ۫ۢ۫ۢۦۤ۬ۙۗ۟ۚۚۖ۟۬ۤۗۗۦۤ۬ۦۘۧ۟ۨۤۘۖۘ۠۬ۚ۬۬ۨۧۢۨۨۙ۬ۙ۬ۥۘۘۧ۫ۨۘۜۗ۬ۦۖۡۚۘۘۘۧ۠۬ۘۖۗۗۛ";
                                                                                    break;
                                                                                case 1504463248:
                                                                                    str7 = "ۢۢۖۘۤۦۦۧۤ۫ۢۙۨۘۚۖ۠ۨۧۛۢۘۖۤۡ۫ۚۖۧۥ۟ۜۘۤۙۦۧۥۨ۬ۦۗ۫ۙۥۘۜۧۨۢۚۚۛۗ۟۬۠ۦۘۨۘۙۚۗ۬ۛۛۥۘۦ۠ۡۘۡۜۧۨ۫ۗۙۜۘۘ۟ۚۖۘۧ۠ۙ۟ۜۦۘ۫ۧ۫ۥۛ";
                                                                                case 1703709236:
                                                                                    str6 = "ۡۖۡۘ۬ۡۢ۠ۡۘۚ۬۟ۘۙۘۘۘۗ۬۟ۚۥۙۤ۫۟۬ۢۚ۬۟ۨۧۚۘۦۘۚۢۙۖۦۧۘۛۧۡ۟ۗۢۛۖ۫ۛۜ۫ۛۖۘ۫ۙۨۗۘۧۙ۫ۥۘۨۥ۟ۡۧۘ۫ۨ۫۬ۤۧۖ۬ۙ۬ۜ۟ۨۘۤۨۙۦۤۨۘۗۡۛ۠ۧ۫ۖۜۦۘۖۢۤ";
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case -730732374:
                                                                        str6 = "ۖۘۡۘۜۤۡۘۙ۟۫ۢۖۡۘ۠ۨۡۘۦۗۚۧۚۛۜۡ۫ۡۙۧۚۨۙۨۨۜۙۖۛۚۖۙۗۡۘ۬ۘۡ۬۟ۨۖ۫ۨۥۜۧۘۗۨۤۡ۟ۚۢۨ۬ۘۤۜۘۙۧۜۖۡۛ۠ۖۧۘۥۥۚۗۘۙۚۙۗ۟۫۟ۙۦۗۖۗۖۘۡۤۢ۟ۖۤۨۙۤ۠۫۬ۡۘۘۜ۟ۜۘۤۧۗۖۦۘۘۗۛۡۘ";
                                                                    case 1900304144:
                                                                        str5 = "ۛۙ۟ۛۙۛ۫۬ۡۘۥ۠۠ۜۗۨۘۡۛۗۜۨۥۘ۬ۗۢۥۚۖۘۥ۟۬۠۟ۛ۫ۛۨۘۢۢۗۨۗ۠ۘۘۦۘ۫۠ۘۘۦ۠ۙۦۢۡۥ۬ۘۘۦۤۡۗ۫۠ۨۧۡۘ۟ۦۘۘۦۘۖۖ۫ۚ";
                                                                        break;
                                                                    case 2090962657:
                                                                        str5 = "ۚۜ۫۫ۘۧۙ۬ۥۘۦۛۥۘۧ۬۬ۗۤۛۛ۬ۖ۟۠ۡۛ۟ۖۘۛۘۥۘۚۦۗۘۜۨۚۥۘۜۥۜۜۘۦۘۧ۟ۨۧۜۨۨۙۙ۬ۥۘۧ۫ۡۘۜ۠ۦۘۙ۬ۡۘۜۛۚۙۧ۟ۡ۠ۨۨۢۦۘۤۖۜۘ۫ۤۨۘۥۚۨۙۤۖۘ";
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 425846042:
                                                            str5 = "ۚۡۖۘۗۘۡۥۢۥۘۡۡ۬ۖۘۘۘ۟ۚۖۜۗۤ۟ۘۨۘ۟ۦۤۛۢۥۡۖۦۚۖۚ۫۠ۤۚۖۘۘۚ۟ۢۜ۟ۘۜۤۗۢۥ۫ۢۤۚۨۘۗۖۚ۟ۗۦۘ۬ۤۘۨۙۘۘۗۥۨ۟ۦ۠ۘۢۢ۬ۜۨۛۖۘۖۤۡۧۦۦۘ۟ۦۘۖۥۧۘۤۛۜۚۜ۬ۢۘ۬۫ۙۧۧۧۖۘۚۢۘ۫ۥۦۘۚۢۗ۠ۙۛ۠ۢۢۨ۫ۙۛۜۡ";
                                                        case 1506144501:
                                                            str4 = "ۗۚۥۥۢۗۢۙۙۢۜۖۤۡۖۘۛۡۖۘۧۙۖۢۘۡۛ۠ۖ۠ۛۧ۟۠ۛ۠۠ۨۙ۟ۦۜۥۗ۠ۜۥۘۢۛۜ۫ۥۡۘۜۛۘۘۖۦۥۘ۠ۖۢۥۤۨۘۘۡۛۖۖۜۗۤ۟ۘ۟ۨۨۨۦۡ۟ۢۤ۠ۡۘۘۧ۬۠ۖۥۘۚۗۢۚۨۨۘۡۢۙۡ۫ۗۚۦۡۧ۫ۨۘۡۢۜۘۦۛ۬ۜۢۨۘۢ۠ۦۘۡۧۖۘۘ۟ۡۖۖۘۘ۫ۡۧۡ۟ۥ";
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 1290256488:
                                                str3 = "۬ۡۡۛۡۦۢۤۥۦۚۙۚۗۚۘۢۘ۬۫ۛۜۧۤۧۦۖۚۙۡۘۘۜۜۘۧۚۧۗۜۧۘۜ۬ۡۘ۠۫ۗۧۥۗۙۦۘۘۜۡۖۘۡۚ۠ۤۛۦ۠ۚۥ۟ۨۜۘۙ۠ۡۘ۠۫ۖۡۖۜۘۘۧۨۘۨۡ۫۟ۦۗ۬ۛۨۨ۠ۛ۟ۧۜۘۚۚۖۘۥۧۗۤۗۙ۬ۥۤ۬ۗ۟۟ۤۖۘۡۙۦۙۜۨۘۢ۠ۥۤۧ۠ۜۖۥ۠ۦۘۘۡ۫ۥۗۥۙ";
                                                break;
                                            case 1843405294:
                                                str4 = "ۙۛۜۡۛۛۧۥۧۜ۟ۧۙۦۖۢۚ۠ۙۨۧۘ۫ۘۦۘ۟ۡ۟ۙۚۜۘۘۚۥۘۚۛۜۘۡۥۦ۫ۗۡۘۚۙۘ۠ۘۘۦۛۤ۟ۙۢ۫ۘۡۘۗۗۨ۟ۗۖ۫ۜ۫ۨۤ۟۠ۙۖۛ۬۫ۦۥۚۥۤۤۤۤۗۧۧۗ۫ۢۖۘ۫ۙۧ۬ۧۖۡۘۛۘۗۨۘۥۡۧۨۡۡۛۛۜۥ۬ۦۧ۬ۨۛۙ";
                                        }
                                    }
                                    break;
                                case 907911680:
                                    str2 = "ۢ۫ۜۘۘۛۨۘۥ۟ۦۨۛۛ۟۫ۥ۠ۙۢۧۙۧۨ۬ۦۘۢۜ۫۫۬۠ۙۤ۬۟۠۟ۢۗۤۚۧۜ۟ۡۥ۬ۨۦۚۨۥۨ۟ۗۤۢۢۡۖ۠ۜۡۦۧۘۨۗۥۘۥۘۘ۬ۗۚ";
                                    continue;
                            }
                        }
                        break;
                    case 918909362:
                        LoginActivity.access$200(this.this$0, str, LoginActivity.access$100());
                        str2 = "ۡۢۜۙۧۖۘۖۥۦۘۡۥۙۦ۠ۢۘۘۥ۠ۢۛ۬ۘۛۤۦۡ۫ۦۙۚۗۦۜۙۡ۟ۨۘ۫ۤۤۥۚۦۤۛۛۜۧۦۘ۫ۨۨۗۖ۬۬ۢۛۥۘۡۘۨۗۜۛ۠ۚۚۥۘ۬ۡۘۘۧۡۖۘ۬ۨۨۚۤ۠ۙۡ۬ۨۛۚۧۘۡۢۙۖۜۖۥۡۙۙۗۦۦۘۙۨ۫ۡۙۥۘۢۤۜۘۡۤ۬ۙۧۘۘۧۘۘۖۜۢۜ۬۬ۤ۟ۤۡۙ";
                        break;
                    case 1806150876:
                        str2 = "ۤۦۛۙۧۥۘ۫ۥ۠ۜۖۦۘۤۘۖۘ۬ۘۧۗۤ۟۟ۛۛۤۡۖۘۛ۠ۨۘۡۦ۫ۚۛۖۘۧۢۡۘۢ۫ۦۘ۫۠ۧۥۢۧۘ۠ۜۧۙۦۘ۫ۛۧ۬۫ۦۘ۟ۢۡۘۥۢۨۘ۬ۙ۫۬۟۬ۙۜ۠ۛۨۛۦۢۜ۟ۦۡۘۖۢۗ۬۫۟ۘۨۧ۫ۢ۬ۙۗۙۢ۬ۨ۫ۨۥۦۛ۫ۧۧۘۘۚ۠ۡۘۦۙۦۘ۟۫ۨۘ";
                        break;
                    case 2011654927:
                        String str8 = "ۦۤۦۧۜۧۘۙ۟ۦۘ۬ۨ۫۟ۡۗۙۡۜۡ۠ۖۘۙۛ۫ۖۡۘۘۦۧۧ۫۬ۥۘۧ۬ۢ۟ۢۧ۬ۜ۬ۜۥۘۘ۟ۜۘۚ۬ۖۘۨ۬ۡۘۖۥۤۘۚ۠ۥۖۡۘۜ۠ۥۥۖۙۗۖۙۖۗۛ۫ۘۖۘۥۛۜۗۘۧ۟ۘۡۘۗۖۜۚۨۥۖۤۛ۬ۤۧۖۚۤۦ۟ۗ۟ۖۘۦۤ۫۟ۥۧۘۥ۬۟ۢ۟ۥۘ";
                        while (true) {
                            switch (str8.hashCode() ^ 2124809885) {
                                case -947547484:
                                    str2 = "۬۬ۨۘۤۗۗۙۛۥۧ۫ۙۛۛۢ۬ۛۛ۫ۧ۬ۗۙ۬ۢ۬ۤۗۗۖۘۦۢۦۘۢۗ۬ۢۡۖۙۘۖۘۚۖۗۧۨۚۚۛۖۘ۠ۧۗۛ۠ۜۘ۠۟ۖ۠ۥۨۚ۬ۜۨ۠ۨۘ۟ۧۘۘۘ۟ۖ";
                                    continue;
                                case 1360859374:
                                    str2 = "ۛۥۜۘۨۥۘۘۡ۬۫ۚۢۨۘ۟ۦۥۘۧ۠ۤ۫ۨۨۤۢۥۘۥۘۧۘۖۢۛۙۧۤۙۦۥۘۜۗۘۘۤ۬ۖۢۦۗۖۚ۫ۖۚۙۜ۠ۥۖۨۦ۟ۡ۟ۜۘۜۘ۟ۧ۬ۙۗۥۘۨۖۤۡ۠۠ۜۘۦۘۢۚۖۘۗۗۦۦۘ۠۠ۨۙ";
                                    continue;
                                case 1423563681:
                                    str8 = "۬۠ۦۘۜ۠ۘۘۗۤ۬ۤۗۨۚۡۖۘۤۖ۠ۥۜۘۡۜۖۘۤ۟ۖۘۛۗ۠ۢۚۘۤۨۨ۬ۡ۬۫ۙۚۨۜۖۘۤۥۛ۟ۜۧۛۛۨۘ۟ۙۨۘۘۤۢۚۥۧۦۘۨۘۡ۠ۨۡۦۨۘۘ۬۟۬ۤ۠ۦ۬ۡۘۡ۠۬ۖۧۜۘۛۨۥۖۡۜ۟ۥۘۜ۬ۨۨ۫ۥۘۙۦ۟۟ۥۖۨ۬ۢۢۘۥۘ۬ۦۦۘۤۛۥۘ";
                                case 1553609604:
                                    String str9 = "۬ۗۙۗۢ۬۟ۤۜۘۤۢۗۢۨۥۘۡۖۜ۠۫۠۠ۨۘ۟ۚۤۧۛۥۘۥۙۜۘۚۤۥۘۡۨۢۡ۟ۤ۬ۧۥۘۧۘۘۜۙۗۦۘۡۘۡۥ۟ۥ۟ۖۘۙۙۢۥۢۘۘۗۤۘۘۤۚۚۧۗۚ۬ۛۨۘ۟ۢۜ۬۬۠۠ۥۘۥ۟ۧۤۨۘۨۨۡۘ۬ۤ۬ۨۘۜۚۨۢۛ۬ۜۘۥ۠ۙۘۦۧۘۡ۟ۨۘۖۘۘ";
                                    while (true) {
                                        switch (str9.hashCode() ^ (-1638284745)) {
                                            case -1712056780:
                                                str8 = "ۨۖۥۨۙۥۘ۫ۤۖۛ۬ۛ۟۬ۧ۬ۤۤ۠ۡۧۖۗۘۘۧۧۛۥۚۦۘۢۡۛۧۤۦۤۚۨۡۤۘۘ۬ۜۖۡ۟ۙ۫ۦۜۘ۟ۧۖۘۥۦۡۘۙۛۖۘۛۥۗۗ۠ۥ۠ۢۧ۠ۧۚۘۢۥۨۛۧ۠ۜ۫۬ۡۘۧۚۨ۟ۙۖۘۜۙۘۚۨۛۗۨ۠ۡۖۦۘۘۜۙ";
                                                break;
                                            case -763527835:
                                                String str10 = "ۖۧ۠۟۟ۡۘۥۥۢۤۗۘۡۨۥۨۦۥۘۚۜ۠۟ۢۛۥۙۚۢ۫ۡ۬ۨۡۖۛۡۥۥۗۘۘۦۗ۫ۥۦۙۜۘۚۨۛ۫ۨۤۥۧ۟ۗۤۦۘۙۖۜۘۚۙۨۘ۟ۢۧۜۥۘۦۤۚۚۨ۫۫ۥۘۨۘۜۘۨ۟ۚ۠ۜۥۖۖۘۦۥۘ۫۫ۖۗۤۖۖۨۘۚ۠ۦۢۨۚۗۜۦۤ۫۟ۗۢ۫ۗ۟۬ۛۙۥۦۥۖۘۚۦۡۘۘۡ۟";
                                                while (true) {
                                                    switch (str10.hashCode() ^ (-1854227509)) {
                                                        case -1533248575:
                                                            String str11 = "ۙۢ۫ۜۡۨۨ۫۫ۜ۟ۤۙۗۘۥۛۢۘۘۜۜۖۘ۬ۛۥۦۡۧۘۦ۠ۡ۫ۖۜۨۥۛۧۡۧۙۧۥۘۡۤۨۘۘ۬ۛ۠ۡۖۦ۠ۨۤۡۥۘ۫۫ۘۘۛ۠۫ۗۙۗۢۘۘۧۨۖۘ";
                                                            while (true) {
                                                                switch (str11.hashCode() ^ 830996730) {
                                                                    case -2089854534:
                                                                        str10 = "۟ۨۘۘۙۨۗ۬ۛۚ۠ۢ۠ۧۨۡ۫ۚۘۘۘۚۜۘ۫۫ۛۨۜۧۙۧۘۨۡۥۘۛۢۖۘ۫ۢۖۜۡۥۘۡۚۡۘ۠ۢۥ۠ۘ۫ۚۛۥۘۙۘۜۙ۟۟ۜۖ۫ۡ۠ۙۘۗۡۜۥۛۘۚۘۘۜ۬ۨۘۤۢۦۘۦۨۡۡۛۚۚۢۥۡۥۦۙ۫ۦۢۧۗ۟ۥۦ۫ۤۛۙ۠ۛۨۖۘ۟۟ۜ۟۠ۘۘۢۖۨ";
                                                                        break;
                                                                    case -2089070787:
                                                                        String str12 = "۬ۜۢ۟ۥۧۘۛۛۨ۬ۖۖۚۨۨۘۜۢ۬ۗۚۛۘ۬ۤۢ۟۠ۜۨۚۘ۬ۜۘۢۜۘۜۛ۟ۗۧۜۨۗ۫ۚۨۨۘۘ۠ۜۨۧۦۘۙ۫ۥۘۙۢۦۥۨۘۘ۫۠ۘۘۤۖ۟ۨۖۖۘۤۗۥۘۥ۬ۧۛۢۢۥۙ۠۟ۖۥۘ۠ۧۡ";
                                                                        while (true) {
                                                                            switch (str12.hashCode() ^ (-342644676)) {
                                                                                case -2068459448:
                                                                                    str11 = "ۡۜۤ۠ۗۡۤۗۚۚۜۘۧۧۜۘ۬۬۠ۘ۬ۥۘۜۧۨۘۛ۟ۡۧۥۨۜۡۗۙۚۖۖۘۥۤۚۨۘۤۚۥۘۡ۠ۡۥۡۡۘۜ۬ۘۘۤۤۤۛ۠ۨۤۦ۬ۡۦۙۢ۠ۜۤۘ۫۟ۛۙۥۤۖۘ۬ۚۙۛۢ۬۫۫ۜ۠ۜۘۦۖۜۘۙۖۖۙۤ۫ۜۚۦۘ۬ۡۙ";
                                                                                    break;
                                                                                case -213703765:
                                                                                    str12 = "ۘۨۗ۠۠۠۬ۗۢۧۗۖۘۢۡۚۜ۬ۚ۟ۧۛۧۖۜۘۖ۫۫ۜۘۦۥۜۜۧۖۨۘۜۙۘۧۘۤۦۘ۠۬ۢۙۛۖۘۚۥ۟ۤ۬ۚۤۜۧۛۨۗ۟ۘۢۖۤۚۥۚۛۛۦۘۘۘۨۖۡۘۜۥ۠ۢۖۖۡۘ۠ۡۦۗۛۜۘۛۙۥۘ۠ۖۦۘ۫ۙۖۖۧۘ۫ۗۦ۫ۘۡۘۚ۟ۥۤۘۘۙۜۥ";
                                                                                case 629229381:
                                                                                    str12 = !str.toUpperCase().startsWith(Deobfuscator$$app.getString(-3440729731944505161L)) ? "ۖۘۖ۬ۦ۬ۦ۟ۘۘۗ۟ۘۘ۫ۘ۠ۢۨۖۜۛۚ۬ۖۧۙ۫ۥۘۜ۫۟ۙۛۢۚۢ۫ۧ۠ۢۤۙ۫۠ۘۢۡۨۜۡۦۖۜ۫ۧ۬ۚۦۙ۟ۡۘ۟ۖ۬۟ۙۖۧۧۤۖۖۖۘۙۜۛۛۦۖۥۡۛۤۨۦۘ۫ۗۡ۫۟۟ۨۨۘۥۙۘۥۤۡۘۨۙۜ۟۬" : "ۡۚ۟ۥۥۜ۫ۥۜۘۡۖۘۚ۟ۡۘۘۜۧ۠۠ۤۤ۟ۜۚۖۘۨۜۘۦۦۘۘ۟۬ۦۛ۠ۙۦۜۦۘۤۦ۟۬ۤۧۗۦ۠ۜۥۧ۫ۛ۫ۜۨۜۗۘۦۙۖۛۧۥ۟ۜۘ۠ۥۧۥۚۘۘۚ۬ۥ۠۟ۨۜۦۖۦۡۦۘ";
                                                                                case 1678803256:
                                                                                    str11 = "ۗۡۜۘۤۡۚۙۦۢۙۤ۟۠ۨۢۦۦۤۦۡۜ۟۬ۘۜۡۗۢۡۧۘۥۡۚۙۗۘ۫ۜۘۘ۬ۖۧ۫ۖ۫ۜۧ۬ۡۖ۫ۥۘۦۘۚۧۛۚۨۘۡۘۥۦۚۜۚ۠ۡۨۡۘ۟۫۬ۖۗ۠ۧۙۢۚۥۜۘۛۚۤۥۤۦۘۤۧۥۘۙۢۦۘۡ۫۠ۖۘۜۘ۠ۥۦۥۙ۫ۨۨۥۘۚۖۨۘۨۢ۫ۗ۬ۦ۟ۗۥۘۖۖۡۘۜۧ۟ۡۥۖ۫۬ۚ";
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case -687584866:
                                                                        str11 = "ۙۘۖۘۦۥۤۡۜۡۧۡۧۦ۫ۚ۫ۧ۟ۧۗۥۤۛۖۜۤۢۦۧۦۘۖۤۦ۫۟ۡۘ۠ۚۡۦۘۘۘۜۚۜۧۢۡۘۦۜۡۗۥۧۜۨۖۧۙۥۘ۫ۦۧۦ۫ۙۘۗۤۨۢۨ۠ۡۨۘۗۚ۠ۢۜۜۘ۫ۧۡۜۖۗۤۘ۬";
                                                                    case 1272180929:
                                                                        str10 = "ۦۧۙ۫۫ۡۘ۟۟ۥۧۡۧۘۗۢۖۘۚۧۜۘ۠ۧ۟ۘۢۤۧۛۖۘ۟ۤۤ۬ۦۢۤۡۤۘ۠ۛۥۦۘۧۡۜۘ۠ۢۛۜۚ۠ۢۙۧۢۡۜۘۤۧۘۘۨ۟ۥۘۙۧ۬۟ۘۢۗۛۙۖۘۖۘۜۧ۟ۥۛ۟ۖۡۜۘۨ۟ۦۧۤۛ";
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case -1163210280:
                                                            str9 = "۫ۧۢۦۡۘۦۨۧۖۗۦۘۖ۫ۢۥ۠ۚۥۚۛۜۦۖۘۧ۠ۦۘۛۗۦۘۚ۫ۗۚۘۚۥۨۗۗۘ۬ۧۗ۫ۗۡۥۢۡۘۤۤۨۘۨۢۜۘۛۖۨۗۛۢۘۧۨ۠ۙۙۦۜۘۙۗ۬ۛۤ۠ۨ۫ۗۦۙ۟ۥۙ۟ۗۦ۟۬ۘۗۜۨۘۨ۟ۙۥۨۘۘۤۖۦۘۡ۠۬ۦۖۖۘۛ۬ۨۚۢۗۨۖۜۗ۟ۧۡۥۤۡۧ۬ۘۢۥۧۛۨۘ";
                                                            break;
                                                        case 1048663186:
                                                            str10 = "ۛۘۥۘۙۧ۟۫ۛۙۢۦۜۗ۠ۘۥۜۢۜۤۡۛۚۛۚۦ۟ۤۚۥ۟ۜۘۨۜۥۘۘ۠ۢ۠ۦۨۜ۫ۜۘۗۜۦۗ۟ۚ۬ۢۚۗۡ۟ۥۙۜۤ۠ۙۦۛۦۘۖۨۤۚ۠ۡۙۖۖۙ۫ۡۜۚۖۚۘۛۧۗۜۘۘۗ۬ۨ۫ۛۡۙۖۘۖۖۦۘۘۚۨۘ۫ۗ";
                                                        case 1452322470:
                                                            str9 = "۠ۗۛۛۤ۫۠ۛۦۘۘ۟ۡ۫ۚۦۧۘۗۘۜۘۧۘۧۖۙۙۛۦۛۜۢ۬ۛۡۖ۟ۦۥۘۗۡۖۘۜۙۡۘۘۚۤۦۦۦۘ۬ۘۘۘۢۡۦۘۧۨۜۜۦۖۦۗۘ۠۟ۢۙۛۨۤۜ۫ۤۥۜۘۚۥۜۘۙۛۚۢ۟ۜۨۙ۟ۧۦۥۤۦۖ۠ۢۡۦۤۗۚۖۥۘ۟۫ۚۢۜۖۘ۫ۗۦۜۦۡۖۢۨ";
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 985537333:
                                                str9 = "ۙۦۧۘۤ۟ۛۛۚۜۧۛ۬ۙۙ۬۟۬۟ۜۚۜۘۦۖۢۗۜۜۘۧۗۙۢۨۚۖۨۤۙ۬ۗۚۛ۬ۢۨۘۡ۟ۥۦۜ۬ۦ۬ۦۤۦۖ۟ۤۥۜ۠ۖۘۚۥۢۤۦۥۡۘۖۘۜۙ۠";
                                            case 1376787138:
                                                str8 = "ۚۘۦۥۤۨ۬ۥ۬ۦۙۘۦۨ۫ۚ۟۬۬ۛۛۗۧ۬ۙ۬ۙۡۙۡۗۡۨۘ۟۟ۡۘۙۘۨۨۛۥۘۧۥ۫ۚۙۙۥ۫ۖۦۢۥۙۚۡۘۧۜ۠ۦۚۛۖ۫ۜۘۦۢۥۘۛۚۜۚۥۗۜۛۘۘۧۖۨ۟۟ۚ۬۬ۘۘۡ۠۠ۘۦۛۜ۟ۜۘ۫ۤۜۡۤ۬۫ۦ۫";
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case 2083992879:
                        LoginActivity.access$000(this.this$0).edit().putString(Deobfuscator$$app.getString(-3440729688994832201L), str).apply();
                        str2 = "ۘ۟ۦۘۛۧۘۤ۠ۥۥۧۜۘ۟ۜۡۤۨۘۖۗۘ۟ۖۥ۫ۙۤۧۗۘۦۢۘۘ۫۟ۗۗۘۛۛۗۗ۫ۜۘۡۡۙ۟ۤۜۘۧۘۥۢۦۤۜ۫ۚۡ۬ۛۢۘۙۗ۠۫ۘ۫۬۫ۛۗۦۡۨۘۧۙۦۘۧۜ۫ۚۖۦ۠ۤۦۙۜۜۘۤۨ۫۠۫ۖ۫ۗۙۖۡۘۡ۠ۖۚۙ۫ۙ۠۬ۚۦۜۘۛۛۛۡۘ۟ۜۤ۠۠۠ۘۘۤۖ۟ۚۖۡۘ";
                        break;
                }
            }
        }
    }

    static {
        try {
            System.loadLibrary(Deobfuscator$$app.getString(-3440728610958040905L));
        } catch (UnsatisfiedLinkError e) {
            FLog.error(e.getMessage());
        }
        Sufii = true;
        Kooontoool = false;
    }

    private static void Login(final LoginActivity loginActivity, final String str, final String str2) {
        LinearLayout linearLayout = null;
        int i = 0;
        GradientDrawable gradientDrawable = null;
        ImageView imageView = null;
        LinearLayout.LayoutParams layoutParams = null;
        TextView textView = null;
        LinearLayout.LayoutParams layoutParams2 = null;
        LinearProgressIndicator linearProgressIndicator = null;
        LinearLayout.LayoutParams layoutParams3 = null;
        AlertDialog alertDialog = null;
        String str3 = "ۙ۬ۙۢ۟ۡۘۧۤۤۙۨۖۘۦۤۥ۟ۖ۫ۚۡۜۘۙ۠ۜۘۘۦۘۙ۫ۨۘۚۚ۠ۜۧۦۧۡۗۥۛۦۖۨۖۘۡۙۙۙۛۨ۟ۦۖۘۘ۬ۦۘ۟ۙ۬۠ۙۥۥۘ۠ۚۛۥۘ۫ۦۗۖۡۚ۠ۥۘۚ۟ۥۨۤۨۘۧۛۧ۠ۦۨ۫ۥۘ۟۟ۦۙۧۦۘۖۦۧۨۛۨۖ۫ۘۘۢۙۦۘۤ۫ۡۘۤۧۢ۟ۥۜ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str3.hashCode() ^ 141) ^ 521) ^ 35) ^ 488) ^ 129) ^ 41) ^ 47) ^ 346) ^ 217) ^ 727) ^ 117) ^ 683) ^ 791) ^ 678) ^ 660) ^ 864) ^ 373) ^ 97) ^ 102) ^ 40) ^ 137) ^ 172) ^ 623) ^ 586) ^ 593) ^ 187) ^ 870) ^ 795) ^ 45) ^ 934) ^ 365) ^ 1767044580) {
                case -2058565475:
                    alertDialog = new AlertDialog.Builder(loginActivity).setView(linearLayout).setCancelable(false).create();
                    str3 = "ۘۙۜۘۗۤۦۘۙ۟ۥۙۧۤۙۙ۫ۗ۫ۙۖۜ۬ۧ۠ۤۥۖۦۤۚۛۤۧۡۦۢۛۨۢۛ۟۬ۡۡ۫۟ۙۤ۠۠ۘۗۛ۬ۤ۠ۙۖۘ۫۫ۢۜۘۡ۟ۛۘۘۖۖ۠ۚ۬ۨۘۗ۟ۤۥۛ۟ۛ۟ۢ۟ۨ۠ۚۗۛۖۖۖ۬۟ۨۘۘۧۗۙۨۙۜ۬ۡۘۤۡۤۤۨۗۘۥۖۘۦۤۚۦۨۜۘۛۦۦۘ";
                    break;
                case -1952722307:
                    layoutParams3.topMargin = m80dp(loginActivity, 12);
                    str3 = "ۘۦۖ۠ۖۙۡۢۧۧۘۡۥۦۜۘۧۖۘۘ۬ۦۛۤۦۧۙۚۦۘۜۛۥۘۡۥۥۘۖۢ۟ۙۖ۬۫ۤۘۘ۬ۙۨۘ۬ۧۙۦۤۙۗۛۡۢۛۡۦۜۢۧۙۤ۬ۡۦۡۨۚۡۖۨۘۗ۫۟ۢۖ۫ۤۥۛ۫۟ۦۘ۫ۨۜۘۤ۬۬ۦ۬ۦۙۦۘۘۘۗ۠ۥۘۙ۠ۦ";
                    break;
                case -1840880112:
                    alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                    str3 = "ۗۦۥۦۗۥۦۥۖ۟ۜ۬ۦۘۖۘۦۙۖۘۥۛۜۗۜۡۘۧۨۦۗۥۚۜۦۖۘ۠ۧ۠ۧۤۡۢۜۖۚ۫۫۬ۗۘۘۜۙ۠ۢۢ۬۠ۦۡ۬ۡۙۖ۟ۤۙۜۨۘۗۢۘۘ۟ۢۘ۠ۤۨ۠ۜۡۚۥۘ۫ۢۖۘ۟ۥۥۧۛۛ";
                    break;
                case -1680694021:
                    str3 = "ۤۢۥۘۤ۠ۜ۬ۛۥۘۢۚۢۢۗۛۨۢۤ۫ۡۜ۟ۤۨۘۙۚۤۙۚۖۡۤۘ۠ۛۥ۫ۨ۠ۗۢۧۡۘۤۥۨۘۨۜۧۘ۟ۧۢۜۡۚۤۡ۫۬ۢ۠ۢۗۛۖۨ۫ۗۧۗۤۖۛۦۛۥۗ۟ۡۘ۟ۥۦۘ۫ۥۖ۟۟ۜۘۛ۬ۧۛۦۧۨۘۡۦۘۤۗۛۚۚۨۢۖ۬ۙۘۦۘۛۢۨۘۙ۬ۡۘۚۦ۠۫ۤۥۘۥ۫ۧۛۚۨۤۘۧۘ";
                    break;
                case -1631703428:
                    gradientDrawable = new GradientDrawable();
                    str3 = "۟ۦۜۘۛۧ۟ۜ۫ۥۘۛۨ۫ۤۧۘ۬ۢۖۘۥ۫۟ۦۛۥۘۤ۟ۡۢ۫ۢۜۙۜۙۨۗۧۡۦۘۤۢ۟ۚۢۥۙۥۧۗۖۤۖۧ۠ۛۢۢۢۤۦۘۥۢۜۙ۠ۚۗ۟ۚۨ۫۬۟۟۫۟ۥۦۢۨۜۚ۟ۡۙۗۚۧۨۘۥ۠ۘۖۘۨۘ۠۟ۥۙۥ۟ۢۦۧۘۡۛۘۥ۠ۖۘۙۧۢۖۛۢۢ۟۫";
                    break;
                case -1473978064:
                    linearProgressIndicator = new LinearProgressIndicator(loginActivity);
                    str3 = "ۘۖۡۧۚۡ۟ۘۘ۠ۜ۫ۚۖۗ۠ۚۖۘۜ۬ۘۘۨۚۚ۟ۦۗۘ۫ۧۧۗۘۘۦۖۢ۠ۨۥۘ۟ۤۢ۟ۚۦۙۛۛۤۨۦۘۛۧۦۜ۬ۨۜۦۦۘ۟ۗ۫ۤ۟ۛۛۧۡۗۢۜۘ۟ۘۖۚۧۨۘ۟ۜۙۤۜۦۘۨ۟ۚ۟ۘۜ";
                    break;
                case -1419398314:
                    i = m80dp(loginActivity, 12);
                    str3 = "۫ۢۘۘ۬ۥۘۦۢۡۘۜۗۜۘۖۙۘۖ۬ۥۘۛۦۨۘۥۨۙۙۧۤۧ۟ۘ۫ۘۜۗۘۘۨۦ۬ۢ۬ۜۘ۟ۧۜ۬ۢۜۘۙ۫۠ۗۚۙۜۘۥۚۚۛۚۥۜۤ۫ۥۤۛۜۘ۠ۡ۠۟ۘۦۘۚ۟ۜۗۖۦ۬۠ۗۙۧۡۘ";
                    break;
                case -1115866699:
                    layoutParams3 = new LinearLayout.LayoutParams(m80dp(loginActivity, 120), -2);
                    str3 = "ۡۡ۫ۢ۫۠ۢۥۛۦۧۖ۫ۚۨۘ۟ۦۗۢۜ۟۬ۖۢۢۖۘۡۜۛۖۨ۫ۚۖۧۗۤۜۚۥۖۘۥۢۨۘۥۘ۠ۨۘۘۨۙۦۘۢۖۘۖۢۥۢۤۦۘ۫ۨۦۘ۫۫ۘ۟ۤۨۘۚۨۦۛۚۘۨۥۥۖۡۡۨۦ۟ۡۗ۠ۘۨۥ۬ۢۗۥۢۙۗۨۖۘۡۧۘۘ۟ۙ۬ۤۘۗۗۘۘۧۨۗۖ۟ۖۘ";
                    break;
                case -1106654012:
                    layoutParams.topMargin = m80dp(loginActivity, 20);
                    str3 = "ۧ۠ۧۘۧۚۛۛۥۘۧۡۜۘۖ۟۠ۧۡۡۚۦۦۘ۟ۧۘ۬ۘۢۥۜۦۘۥۢۥۜۜ۟ۧ۟ۖۘۤۦۘۤ۟ۜۤ۬ۥۘۖۤۖۘۘ۠ۖۘ۠۬ۦۖۧۦۧۧۡۘ۟ۜۜۦ۫ۡۧۤ۬۬ۘ۠۫ۗۘ۫ۥۜۖ۟ۖۗۥۘۘۨۧۘۘۜۚۨ۫ۥۥۜۜۧ۟۫ۡۘ۫ۚ۟";
                    break;
                case -975481522:
                    linearLayout.setGravity(1);
                    str3 = "۫ۙۖۗۖۙۦۤۘۘۘۨۛۤۨ۬ۥۧۚۛۙۢ۟ۦۙۜۛۙۙۨۘۙۥۨۘۧ۬ۛۤۡ۟ۜۧ۠۟ۘۢۨۥۡۘۖۖۗۙ۠ۦۘ۟ۥۨۘۛۧۜۘۡ۠ۜۘۡ۟ۚۧ۠ۢ۠ۜۘۘۧۛۛۛۢۨۛۙ۠ۢۜ۠ۡ۫ۖۘۡۨۥۘ";
                    break;
                case -732440656:
                    layoutParams2.topMargin = m80dp(loginActivity, 10);
                    str3 = "ۨۤۥ۫ۦۛۨۢۘۡۡ۬ۥۥۘۧۥۤۧ۫ۙ۬ۢ۠۬۬ۥۘۚۧۤۚۡۦۘۖۗۛۖۘۜۘۡۗ۫۟ۦۥۘ۫ۨۚۛۖۦۘۛ۟ۙ۫۠۟۫ۡۗ۫ۥۤ۫ۤۦۜۡ۬۫ۗۨۘ۟ۗۜۜۨۗۛۜۦۦۛۙۨۙۖۛ۬۠ۦۜۤۘۢۖۥۙۡۢۦۜۡۧۘۦۤۛۢۧۢۢ۬ۨۘۜۗۚۜ";
                    break;
                case -655324547:
                    linearLayout.addView(linearProgressIndicator);
                    str3 = "۟ۖۧۘۖ۠ۖ۬ۨۜۘۜۙۢۜۥۢۛۢۦۚۤۡۘۦۘۥۢۖ۬ۘۛ۬ۚۖۗ۠ۖۘۗۚ۬ۙ۟ۨۨۢۡۘۛ۟۠۟ۥۜۘۡۤۨۘ۬۬ۦۘ۬ۧۚۜۨ۫ۥۛۢۥۙ۟ۧۚۧۖۨۘۧ۠۠ۧۘۜۘۨۛ۬ۖۗۤۛۛۛۨۥۘۘۧ۬ۦۚۡۙۘۛۨۘ۠ۤۜۢۢۤۥۛۨۘۧۛۤۘۦۢۘۘۢۙۚ۠ۨۚۥۜۗۖۘ۬۬ۦۘ۬ۛۦ";
                    break;
                case -523085781:
                    imageView.setLayoutParams(layoutParams);
                    str3 = "ۖۛۙۖۦ۟ۥۛۚ۫ۚۖۧۢۙۚۥۦ۬۬ۡ۫۫ۥۢۙۦۛۚۨۨۚۦۗۡۦۘۙۦۨۘۡۚۛ۟ۜ۠ۧۡۜۘۤۦۨۘ۠ۤۦۘ۬۟ۖۘۨۘۥۘ۟ۚۙۛۨۨۦۦۖۘۙۢۡۗۢۖۘۨۢۜۘۖۧۥۘۘ۠ۙۛۧۡۘ۠ۜۚۤۜۨۗۦۤۗۡۦ۠ۜۥۘۘۙ۫۬۠ۘۘۚۜۢۜۙۦۦ۠۠۬ۥۘ";
                    break;
                case -453837495:
                    linearProgressIndicator.setIndeterminate(true);
                    str3 = "ۗۘۨۛۥۤۢۧۜ۠ۛۥۘ۫ۜۧ۠ۢۖ۫ۖۦۚۤ۟ۜۚۧ۟ۨۦۘۖۙۦۘۢۛۡ۫ۢۘۥۜۛۜ۫ۙۙۡۤۤۢۛۦۦۗ۬ۙۢ۠ۨ۬ۜۥۘۛ۟ۙۥۢۜۗۛۦۘۚۤ۫ۖۖ۠ۙۢۖۘۨۥۦ۬ۦۡ۫ۖ";
                    break;
                case -419386409:
                    textView.setTextSize(16.0f);
                    str3 = "ۙۖۙۖ۫۠ۛۨۡ۟ۨ۫ۦۖۦۘۦۛۗۚۘۧۘ۫ۙۡۘ۠ۢۜۘۦۧ۠ۘۜۗۚ۟ۘۘۦۘۖۘۗۛ۬ۧۢۖ۠ۤۨۥۘ۫۬۟ۦۘۧۧۜۘۜ۫ۨۖۙۤۦ۟ۖۦۡۖۘ۠۟ۤۤۥ۟ۤۢۥۘۖۘۜ۬ۘۦۗۥۦۘ۬۠ۗ۠ۢۨۨۚۙ۟ۢ۠ۤۡۛ۟ۤۢ";
                    break;
                case -370076092:
                    gradientDrawable.setColor(-1);
                    str3 = "۟ۡۦۘ۠ۤۘۦۤۧۖۘۤۙ۫ۗ۠ۛۜ۠ۙۖۘۖۨۘ۟ۡۡۥۦۚ۬۠ۢۢۡۨۘۗۧۥۙۛ۬ۥۦۦۤۤۜۡۗۢۘۚۦۜۗۖ۬ۥۦ۫ۦ۟ۗۛۥۧ۬ۦۘۧۘ۬ۙۡۤ۟ۧ۬۫۠ۥۘ۬ۥۖۥۦۛۢۦۤۗۡۦ۫ۖۨۘۙۦۦۖۘ۬ۨۦۘۢ۟ۜۖۜۙۡۤۘۛ۟ۥ۬۠ۥۘۢ۟ۖۘ۫ۥۘ۟ۙۜۘ۠ۤ۟۬ۡۜۘ";
                    break;
                case -263682923:
                    linearProgressIndicator.setTrackColor(Color.parseColor(Deobfuscator$$app.getString(-3440729182188691273L)));
                    str3 = "۠ۖۢۙۚۦۤۡۢ۬۠ۘۘ۟۬ۨۗۢۚۗۡۥۥ۬ۨ۟ۘۘۜۦۚۤۧۙ۠ۡۛ۟ۧۙۨۤۦۘۢ۬ۥۘۡ۬۠۬ۜۛۙۤۦۘۧ۠ۡ۫ۚۢۜۖۘۥۙۜۘۦۘۖۢۖۛ۬ۖۚۖۚۡۘۢۜۦۦۧۢۘ۫ۥۡۚۦ";
                    break;
                case -182413402:
                    imageView = new ImageView(loginActivity);
                    str3 = "ۙۧۨۘ۠ۥۖۘۢۤ۠ۜ۫ۚۙۘ۫ۦۦۧۘ۬ۛۜۘۥ۠ۦۘۡ۟ۚۜۡ۫ۗۥۧۘ۫۫ۨۧۢۛۛۡ۠ۘۤۚۥۗۨۥۧۦۘ۬ۚ۠۟ۘۨۜۘۙۚۢ۠ۡۦۤۢۖۡۘۨ۟ۛۤۙۡۘۜۘۢۗۥۦۘۚۘ۟ۨۘۦۘ۬۫ۘۘ";
                    break;
                case -130754813:
                    linearProgressIndicator.setIndicatorColor(ContextCompat.getColor(loginActivity, C0931R.C0932color.color0024));
                    str3 = "ۧۢۘۚۜۧۨۗ۠۟ۜ۠۫ۥۘ۠ۛۥۘ۫۫۠ۦ۫ۤ۠ۚ۬ۛۧۖۗۢۢ۟ۗۚۡ۟ۧۤ۟ۦۘۗۦۦۘ۟ۦۘۛۜۘۤۥۘۘۢۗۗۖۘۦۘۚۢۗۨۡۦۖ۠ۦ۫ۖۘۡۤۘۘۤۚۗۜۙۦۘۤۤ۠ۧ۠ۥۚۥۥۘۨۥۥۘۙۗۧۛۛ۟ۗۚۖۘ۠ۘۘۨۦۨۘۙۗۖۘۗۢۢۚۥۖۧۖۥۘ";
                    break;
                case -2313742:
                    alertDialog.getWindow().setLayout(m80dp(loginActivity, 220), -2);
                    str3 = "ۧۘۚۡۗ۫ۡۗۛۤۙۜۘۥۤۛۘ۟ۗۙۚۘۤۨۘۤۖۡ۫ۜۥۦۦۡۥۚۢۗۗ۫ۛۦۨۦۜۧۘۗ۟ۡۘۛ۠ۥۦۨۨۛۨۨۥۡۦۘۥۥۜ۠ۘۛۛۚۖۘۥۗ۟ۜۢۨۛۨۥ۟ۙ۫ۡ۬ۡۚۡۧۗ";
                    break;
                case 49519217:
                    imageView.setImageResource(C0931R.C0933drawable.draw008a);
                    str3 = "۠ۡۧ۟۬ۡۘۥۗۥۘۖۢۡ۟۬ۘۖۢۧۙۙۚۚۚۙۤۖۥۘ۠ۘۖۧۥ۬۫ۨۜۘۨۖۢ۫ۥۜۘۖۙۨ۟ۖۖۘۧۖ۠ۦۨۙۘۤۜۘۛۡۨۤ۟ۥۘ۟ۢۜۤۦۙۙۨ۬ۖۖۘ۠ۘۥۘۚۥۘۘۢۜۦ۠ۦۨۘۗۗ۟۟ۤۥۘۧۤۥۖ۟ۘۤ۠ۥۘۚۡۡۘۘۤ۟ۛ۬ۖۘۙۖ۟ۤۛ۟ۗۡۚۡ۠ۛۘۘۦ۟ۚۡۥۘۡۖ۫ۘۘ";
                    break;
                case 272130660:
                    layoutParams = new LinearLayout.LayoutParams(m80dp(loginActivity, 64), m80dp(loginActivity, 64));
                    str3 = "ۦۦۨۘۦ۬ۦۘۗۨۧۨ۟ۚۖۘۘۗۘۖۥۘۤ۟ۙۦۘۥۥۖۘۥۚۦۘ۠ۘ۫ۚۨۡ۫۟۫۟۫ۜۘۥۡ۬ۚۜۢۥۦۦۘۚۨۦۗۚۨۘۙۚۘۖۥۥۡۘۡۘۚۚ۫ۜۗۘۧۢ۟ۜۘۧۗۙۥۖۤۙۧ۫۠۟";
                    break;
                case 301838941:
                    final Handler handler = new Handler(loginActivity, alertDialog) { // from class: kentos.loader.activity.LoginActivity.6
                        final AlertDialog val$dialogloading;
                        final LoginActivity val$m_Context;

                        {
                            this.val$m_Context = loginActivity;
                            this.val$dialogloading = alertDialog;
                        }

                        @Override // android.os.Handler
                        public void handleMessage(Message message) {
                            String str4 = "۠ۢۜۘۥۜۡۧۘ۟ۛۢۡۘۧۧۤۦۜۦۘ۬ۢۘ۟۟ۧۤۗۛ۫ۥۙ۬ۙۥ۫ۜۡۢۗۛۖۘۤۜۦۘۤ۟ۛۚۜۜ۟ۗۧۚ۠ۨۘۙۜۥۘ۟ۗۦۡۙۦۘ۠ۡۜۘۧ۠ۨۤ۬ۙ";
                            while (true) {
                                switch (str4.hashCode() ^ 599730383) {
                                    case -2094966681:
                                        String str5 = "ۡۘ۠ۧۗۘۡۚۢۙۨ۫ۥۘۦۘ۟۬ۡۖۘۛۤۦۙۨۨ۟ۖۤۜۘ۬۫ۨۦۖۤۡۡۖ۠ۙ۫ۤۧۨۚ۫ۖۘۤ۠ۥۘ۫ۦۦ۬۬ۗ۬۬ۙۜۥۧۚۧۤۗۢۖ۠۫ۡۚۚۖۘۙۜ۬۟ۨۛۚۢۘۥ۫۟ۦ۫ۖۘۢ۟ۨۘ۫ۦۨۙ۫۬۠ۙۨۥۨ۬";
                                        while (true) {
                                            switch (str5.hashCode() ^ 756426424) {
                                                case -2017827021:
                                                    str4 = "ۤۛۘۘۛۗۜۘۦۗۢۜۤۥ۬ۦۖ۠ۘۘۖۙۡۘ۠ۖۘۤۘۥۘ۟۟ۛۦۢۚۖۚۧۡۧۘۖ۟ۨۘۜۨ۬ۢۥۡ۬۠ۗ۠ۢۖ۫ۨۦۘۡۥ۟ۚۧۥۘۥۦۜ۬ۤۤۙ۫ۖۘ";
                                                    continue;
                                                case -795681290:
                                                    String str6 = "ۨۥۥ۫ۧۢۘۜ۟ۥ۬ۜۙۛ۟ۙ۫ۗۡۢۦۦ۟ۧۗ۫ۦۘ۬ۜۦۦ۠ۖۗۢۧ۫ۦ۠ۧۚ۬ۨۘۘۤۛ۠ۥۦۚۢ۠ۖ۫ۡۧۘ۫ۖۖۚۘۨۘۚۨۜۢ۫ۦۘ۫ۖۛ۫۟۟ۘۛۜۘۧۧۨۘۧۜۗ۠ۡۚ۬ۥۜۙۙ۟ۢۥ۬۫ۢۡۨۜ۠ۤۙۖۘۨۜۨۨۛۖۢ۠ۘۜ۠ۡ۫ۨ۠ۜۚۨۚ۟ۖۧ۬ۥۘ۬ۛۦۘ۬ۜۖۘ";
                                                    while (true) {
                                                        switch (str6.hashCode() ^ 782634244) {
                                                            case -1864507468:
                                                                String str7 = "ۡۨۥۘ۟۠ۚ۫۠۟۠۠ۗۜۥۗۖۜ۠ۡۙۜۘۤۡۦۤ۫ۨ۫۟ۜ۬ۖ۬ۢۛۖۘ۬ۙۧ۬ۘۦ۟ۚۤ۫ۡۥۘۡ۬ۡۦۨۧۖۖۡۚۡۗۜۦۚ۬ۢۧۜۜۧۘۙۙۧ۫ۗۖۤۨۜ۟۫ۚۢۡۘۘۥۘۨۦ۫ۨۘ۟ۛۘۗۖۦۘۥۖۨۥ۫ۚۚۘۖ";
                                                                while (true) {
                                                                    switch (str7.hashCode() ^ (-328810757)) {
                                                                        case -912490914:
                                                                            str7 = "ۜۗۖۡۙۖۘۖۖۜۘۜۜۚ۬ۜۥ۟ۘۙۖۡۥۛ۬۠ۢ۬ۥ۠ۖۛۙۢۖۘۨۦ۠ۦۡۘۘۗۛۗۖۜۘۘ۫ۘۦۤۡۘۚۖۨۘۤۜۤ۬ۧۛۡۧۗۥۘۙۜۖۨۧۘۘۗ۠ۧ۬ۙۜۛۚ۠ۙۡۡۤۛۥۘۙۙۛۤ۫ۡۘۧ۬ۘۘۥ۟۟۫ۢۡ۠ۡۦ";
                                                                        case 82228332:
                                                                            String str8 = "ۜ۟ۚۤۡۛۘۖۢۡ۬ۖۘ۬ۧۨۘۛۗۧۖ۬۟ۛ۠ۧ۠ۘۢۨۧ۟ۧ۬ۖۘۘۘۦۚۜۘۤ۫۟۠۫ۖ۠ۚۡ۬ۖۜۘۛۛۘۨۘ۟۟ۙ۫ۥۙۤۜۛۡۚۤۥۚۦۦۧۤۤۙۧ۠ۘ۠ۡ۫ۨۖۚۚۘۘۖ۬ۖۘۦۙۜۦۙۤۖۧۛۢۦۖۘۨۜۨۖۨۧۨۖۨۘۦۤۦۧ۟ۖۘ";
                                                                            while (true) {
                                                                                switch (str8.hashCode() ^ (-1061440920)) {
                                                                                    case -1536651304:
                                                                                        str7 = "ۦۢۖۥۥ۫ۨۢۡۦۖۚۖۡۘ۫۫۫۠ۛۡ۫ۗۖۘۥۤۜۘۜۡۜۚۙۖۖۡۘۚۜۤ۫ۡۚۖ۟ۘۗۨۜ۠ۦۦۖۥۜۘۖ۟ۗۘۖۨۗۛ۟ۖ۟ۙۢۗۢۚۘۤ۫ۗ۠۠ۛۙ۬ۨۘۥ۫ۘۧۨۧۘ۫۬ۡۘ۟۟ۛۙۨۧۘۧۨۛۦۛۘۘ۟ۡۘۗۙۙ۫ۤۗۡۥۖۜۧۜۚۘۘ۬ۙۖۘۥۦۗ۠ۙۖۘ۠۬ۦۨۤۜ";
                                                                                        break;
                                                                                    case -682479613:
                                                                                        str8 = message.what == 0 ? "ۡۦۘۘ۠ۜۚۛۜۤ۟۫ۢۗۖۥۘۙۧۥۚۚۧۜۦۢۢۦۨۘۤۘۖۤۛۢۙۚۡۤ۠ۚۢ۬۠۟ۚۨۦۥۗۘ۟ۤۢۘۧۨۖ۫ۡۨۘ۫ۛ۟ۙۡۛۧ۠ۤۡ۠۠ۦۦۗ۫ۡۨۘۚ۫ۡۘۡۚۖۘۢۜۢۥۤۧۗۚۦۡۨۘۙۥۚۚۤۡۨۛۘۘۙۜۦۘ۬۫ۧ۠۫ۦۘۛ۬ۜۢۢۘ" : "ۛۡۨ۬۫ۦۘۦۙۥۗۗۜۖۙ۫ۧۛۗۛ۫ۙۤ۬۬ۛۜۘۨۥۜۦۡۘ۬۠ۖ۬ۢۖۘۢۤۙۧۤۖۘ۠ۧۡ۟ۧۜ۠ۥۛۖۗۨۘ۬ۨۦۘۙۚ۠ۜۤۨۘۥۢۖۘۘۜۘ۬ۙ۬ۘۜۤۜۥ۠ۥۦۙۢۨۧ";
                                                                                    case -153998919:
                                                                                        str8 = "ۦۧۢۢۦۦۘۡ۠ۦۘ۟ۨۤ۫ۧۨۘ۟۟۫ۖ۟ۙ۫ۗۚۙ۬۠ۙۗۥۘۡۘۜۚۥۦۤۨۘۜۥۦۘۙۦۨۘۧۤۙۢۛۢۗ۫ۡ۫ۦۡۘۚۧۗ۠ۤۘۚۨۨۤۤۘۘۘۧۜۘۛۗۘۙۥۥۥۖ۠ۡۜۥۤۜۘ۫ۙۦ۟۬ۙۤۖۦ۟ۖۜۡۛۜ۟ۚۜۘۤۤۙۦۘ۟ۜۢۜ۬ۨۦۘۨۛۚۗ۬۟ۚ۬ۖۘ۫ۧۜۘۙ۠ۛۜ";
                                                                                    case 1182897484:
                                                                                        str7 = "ۥۗۨۖۗۜۘۥۖۖۡۧۖۘ۟ۡۦۡ۠ۚۦۢۘۘۛۦۢ۬ۛۙۚۥ۬ۡۨۦۨۧۡۘۧۨ۟ۛۖۥۘۘۘۜۘۜۨۙۜۜۛ۠ۢۧۜۨ۟ۖۜ۫ۖۨۗ۬۬ۜۨ۬ۧ۫ۚۜۦۛۦۘ";
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 1377011398:
                                                                            str6 = "ۧ۬۫ۥۢۤۧۚۖۘۘ۟ۛۗۙۘۘۗۛۤۥۧۦۥۗۗۛ۠ۨۨۜۧۘۤۢۦۘۖۢۡ۬ۖۜۧۘۖۘۗ۟ۨ۟ۗ۬ۛۤۤ۟ۤۘۢۤ۬ۦۖۖۦۘۗۖۦۘ۬ۧۜۖ۬ۨۘ۟۬ۘ";
                                                                            break;
                                                                        case 1646380900:
                                                                            str6 = "ۜ۟ۡۘ۠۬ۡۧۧۘۡۤ۫ۦۢۚۖۨۡۘۢۢ۬ۘۜۗ۫ۛۥۜۙۤۜ۫ۥۘۧۡۖۨۢۤۖۡۧۗ۟ۙ۠ۘۗۖۗۖ۫ۢ۫ۛۖۘۙۘۥۘۥۛ۫۠ۚۢۙۘۥۗ۟ۨۙۘۨۗ۟ۢۨۙۗۖۜۘۘۖۙ۫ۛ۫ۢۥۘۘۚۧۙۨۢ۬ۧۗۙ";
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case -1418757690:
                                                                str5 = "ۛۡۛۗۗۖۛۤ۬ۥ۟ۨۛۢۥۘ۬۟ۢ۬ۧۛۛۜۜۧۡۗۦۦۨۧۘۘۖۥ۬۠ۘۚ۠ۙۚۧۚۖۘۤۧۢۚۙۜۜۗۜ۟۠ۢ۠ۖۘ۠۟ۘۘۚۢۘ۫ۦۨ۟ۘۡۘ۠۟۬ۡۨۘۡۛۥ۬۟۬ۗۛۦۘۥۗۡۡۧۛۗۥۖۜۢۖۛ۟ۦۦۖۘۢۦۤۨۡۨۘۜ۫ۡۘ۬۟ۜۘۖ۠ۧ";
                                                                break;
                                                            case -894654001:
                                                                str6 = "ۤۘۜۧۨۙۡ۬ۖۘۥۨۥۚۜۢ۬ۗ۠ۤۡۧۘ۬ۛۥۨ۟۬۫ۨۦۢۘۡۘۧۘۤۜۖۛۥ۫ۧۘۡۖ۬ۗۡۘۖۛۛۜۘۘۖۥۘۚ۫ۧ۫۬ۥۙۧ۬ۢ۫ۧۡۦۦۜۥۥ۟ۜۨۛۧۜۤۢۡۥ۬ۖۧ۠۬ۙۗ۬ۜۥۢۤۦۧ۠۟ۤۜۖۨ";
                                                            case 888060370:
                                                                str5 = "ۘۨۛۥۥۧۢ۫ۥۘۚۡۧۧۨۘۗۡۡۥۧۥۜۗۖۚۜۤۦۘۥۧۥۘۖۙۥۘۖۢۘۧۢۙ۠ۖۥۙۚۨۘۗۗۨۘۚ۬ۦۘ۠ۧۤ۟ۢۨۘ۬ۨۥۘ۠ۙۦۘ۟ۡۘ۟ۥ۠ۜۚۦۘۖۙۨۗۙ۟۠ۚۖۘۛۡۜۘ۫ۜ۫ۙۛۡۘۤۛۧ۬ۖۖۘۘۢۥۘۗۡ۬ۤۘۡۗ۬۟ۤۧۥۡۗۘۘۙۥۤۢ۫۫ۨۛ۠ۢۨۦۛ۠ۢۙۢۤ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case -109628005:
                                                    str4 = "ۖۥۤۖۥۢۧۚۖۧۦۨۧ۠ۜۢۜۖۥۜۘۚۡۦۘ۠ۡۘۧ۟ۧۤۗۛۨۨۙۘۛۙۗ۫۬ۢۤۡۘۖۤۨ۟ۖۛۡ۟۟۬ۢ۫ۖۗۦۢ۫ۥۖۥۗۚۥۘۨۚۦۘ۠۫۬۠ۡ۫ۥۘ۬ۥۚۘ۠ۨۤۤ۫ۧۧۥۡۘۢۡۡۘۗۦۤۦۥۡ۫ۢ۠۟ۢ۫ۛ۫۬ۨۥۨۡۥۤۨۜۖۧ۫ۡۙۥۢ۫ۖۧۗۙۜۗ۬";
                                                    continue;
                                                case 10184330:
                                                    str5 = "ۢۢۧ۟ۖ۠ۜۨۦۢ۫ۥۘۦۗۚۦۧۛۥۘ۫ۤۧۥۘۢ۟ۘۘۜۡ۟ۥۨۤۤۨۘۦۤۚۛۖۥۘۤۧۥۥۛۡۦۘۘۡۥۡۧۤۦۘۦۗ۟ۛۗۘ۫ۖۖۦۥۖۘۚۜۚ۟ۚۡۘ۠ۛۗۨۜ۬۫ۢۧۧۤۘۧۚۡۘ۫۬ۗ۫۠۫۟ۦۘ۬ۜۨۡۜۦۘ";
                                            }
                                        }
                                        break;
                                    case -1846167736:
                                        String str9 = "ۚۥۧۘ۫ۦۨ۬ۥ۬ۢۦۜۘۛ۬ۥ۟ۧ۬۟ۦۥۨۜۘۗۢ۟ۧۢۚ۬۬ۧۚۘۥۘ۬ۨۖۘۢۢۦۧۙۥۘۢۘۘۖۘۦۗۖ۠ۧۚۜۤ۬ۙ۬ۗۛۙۤۨۘۥ۫۬۠۬ۙۜۥۜۤۜ۬ۤۗۜۛۚۘۗۘۙۘۘۦۘۖ۠ۘۢ۬ۙ۬۟ۧۚۚۡۦ۟۫۫ۛۥۘ۬ۦۨۤۨۥۥۥۦۘۗۥۡۘۡ۬۫ۛ۟ۗۧۛۜ۟ۡ۟ۗۥ";
                                        while (true) {
                                            switch (str9.hashCode() ^ (-975662724)) {
                                                case -981240844:
                                                    LinearLayout linearLayout2 = new LinearLayout(this.val$m_Context);
                                                    linearLayout2.setOrientation(1);
                                                    linearLayout2.setPadding(LoginActivity.access$900(this.val$m_Context, 16), LoginActivity.access$900(this.val$m_Context, 16), LoginActivity.access$900(this.val$m_Context, 16), LoginActivity.access$900(this.val$m_Context, 16));
                                                    linearLayout2.setBackgroundColor(-1);
                                                    TextView textView2 = new TextView(this.val$m_Context);
                                                    textView2.setText(this.val$m_Context.getString(C0931R.string.str0044));
                                                    textView2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                                                    textView2.setTypeface(Typeface.DEFAULT_BOLD);
                                                    textView2.setTextSize(18.0f);
                                                    textView2.setPadding(LoginActivity.access$900(this.val$m_Context, 8), 0, 0, 0);
                                                    linearLayout2.addView(textView2);
                                                    TextView textView3 = new TextView(this.val$m_Context);
                                                    textView3.setText(message.obj.toString());
                                                    textView3.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                                                    textView3.setTextSize(16.0f);
                                                    textView3.setPadding(LoginActivity.access$900(this.val$m_Context, 8), LoginActivity.access$900(this.val$m_Context, 8), 0, 0);
                                                    linearLayout2.addView(textView3);
                                                    AlertDialog create = new AlertDialog.Builder(this.val$m_Context).setView(linearLayout2).setCancelable(false).setPositiveButton(this.val$m_Context.getString(C0931R.string.str009c), (DialogInterface.OnClickListener) null).create();
                                                    create.show();
                                                    String str10 = "ۧۛۧ۬۟ۥۘۥۘۜۧۗۘۘۗۖ۬ۡۢۦۤۜۘۨۘۧۥۜ۟ۙۗۦۘۡۘۘ۟ۨۦۘ۟ۨۨۤۡۖ۬ۖۙۛ۠ۨۤۜۧۧ۬ۦۧۡۗۚ۫ۚۙۧۥۘ۟ۦۥۖۖۖۘۨۗۘۖۙۛۛ۬ۡۘۗ۠۫۠ۘ۫ۢۤۥۤۦۘۦۙ۟ۛۘۥۖۦۙۤۥۖۙۦ";
                                                    while (true) {
                                                        switch (str10.hashCode() ^ 243903723) {
                                                            case -1218745070:
                                                                break;
                                                            case 345812020:
                                                                GradientDrawable gradientDrawable2 = new GradientDrawable();
                                                                gradientDrawable2.setColor(-1);
                                                                gradientDrawable2.setCornerRadius(LoginActivity.access$900(this.val$m_Context, 4));
                                                                create.getWindow().setBackgroundDrawable(gradientDrawable2);
                                                                create.getWindow().setLayout(this.val$m_Context.getResources().getDisplayMetrics().widthPixels - LoginActivity.access$900(this.val$m_Context, 40), -2);
                                                                break;
                                                            case 882711291:
                                                                String str11 = "۫ۘۧۘۙ۫ۨۘۜۧۨۘ۫ۥۘ۬۬ۖۘۨۖ۬ۧۨ۠ۢۜۖۘ۫ۧۢۧۡۖۘۧۦۢۡۢ۟ۢۨۙۦ۫ۜۘۧۗۦۘۗۤۛۢ۫ۤۧۘۢۢۢۥۛۙۡۘ۬۟۫۬ۖۘۤۢۜۙۗ۠ۢ۬ۚۚۘۤۘۗ۬ۙۥۜۘۡۚۜ۬ۡۜ";
                                                                while (true) {
                                                                    switch (str11.hashCode() ^ 1927578506) {
                                                                        case -813909894:
                                                                            str11 = "۫ۤۗۤ۟ۘۢ۫ۙ۠ۗۛۨۖۙۖۨۖۘۧ۟۟ۦۖۧۡۚۨۦ۫ۖۦۨۙۘۥ۬۫ۗ۟ۡۨۤۨۙۦ۬ۢۖۚۘۡۜۥۘۛۥۦۘ۟ۨۖۘۘۥۤ۫ۧۨۥۘ۬ۨۙۘۘۛۛۢۘۡ۫ۧ۠ۜۘۛۛۥۘ۬۬۬ۢۙۛۘۨۖۘ۟ۥۡۘۨۤۡۘ۟ۦۤۥۢۡۢۖۚ۫ۗۢ۫ۘۖۙ۟ۙ۫ۚۛۚۖۖ۫ۢۡۛۦۥۗۘ";
                                                                        case -758149230:
                                                                            String str12 = "ۡۦ۬۫۬۬ۘۤۚۛۛۛۘۨۥۘۖۛۨۘۧۨۘۘۤۤۛ۠۬ۡۘۗۧ۟ۜ۫ۤ۠۬ۛۥۡۨۖۢۖۘۢۘۗۤۥۨۘۜۨۨۤۤ۫۫۠ۥۢ۠ۜۘۖۥ۫ۛۚ۠ۚۤۥ۟ۘۘۗۡۜۘۦۚۢۗۙۚ۟ۡ۫ۡ۬ۙۖۙۤۤۦۥۧۙۙۜۥۖۘۢۙۖۢۦ";
                                                                            while (true) {
                                                                                switch (str12.hashCode() ^ 1118794092) {
                                                                                    case -1659642797:
                                                                                        String str13 = "ۛۚۖۖۨ۠ۡۦۡۘۥۛۥۘۚۨۘ۠ۦۨۡ۬ۖۧۜۥ۬ۛۘۘۖۦۘۘۥۨۥۘۛ۬ۤۤۜۚۦۧۥۘۢۨ۠ۖۖۗۤۧۥۚۤۘۘۦ۫ۥۧۙ۫ۦ۫ۧۧۗۨۘۤۜۨۘ۟ۦۖۘۜۘۚ";
                                                                                        while (true) {
                                                                                            switch (str13.hashCode() ^ 431571416) {
                                                                                                case -1763993261:
                                                                                                    str13 = "ۚۨۥۘ۠ۡۦۥۦۖۢۗۨۘ۬ۢۜۘۥۗۨۙۢۦۗۗۜۘ۬ۛۛۧۢۗۢۚ۠ۙ۠۬ۥۜۛۚۤۤۙ۬ۙۦۧ۬ۥۘۚۨۦۘۙۘۨۘۨۖۦۘۗ۬ۙ۫ۛۥۦۧۜۘۗۨۦ۟ۤۛۘۧ۟ۥ۟ۘۥۜۖۡۗ۟۬ۛۡۘ";
                                                                                                case -1636025657:
                                                                                                    str12 = "ۖۤۛۖۧۥ۫ۘۚۖۜۘۙۢۦۘۤۡۥۦۖۘۥۧۡۚۘۚۗۚ۟ۗۜۧ۫ۚ۟ۡ۠ۦۤۜۤۚۙۦۗۨۢۡۧۚۧۦۖ۬ۤۡ۫ۗۖۚۛۡ۠ۖۘۨۚۧۦۛۚۢۜۡ۠ۖۜۘۙۡۢۖۡۤۨۨ۫ۖۗۜ۠ۗۦ۠ۤۚۖۜۘۚ۫ۖ۫ۙ۬";
                                                                                                    break;
                                                                                                case -1479330854:
                                                                                                    String str14 = "۬ۜ۬ۗ۬ۦۧۘۖۤۖۨۦۙۛۡۘۦۥۡۡۘۘۤ۬۫ۡۚۥ۫۬ۢ۟ۥۛۢ۫ۨۖۦۘۛۗۥ۫۠۠ۚۥۘۥ۬ۥۥۖۢۨۢۧۙۡ۠ۤۗۡۖ۬ۨۡۛۢۥۘۘۖ۫۠ۡۙۡۘۢۥۢۙۖۧۤ۟ۖۘۧۘۡۘ";
                                                                                                    while (true) {
                                                                                                        switch (str14.hashCode() ^ 1472196609) {
                                                                                                            case -1372459417:
                                                                                                                str13 = "۬ۙۜۘۗۛۥ۟۠ۦۘ۫۫ۡۢۨۜۢۖۨۘ۟۬ۛ۠ۤۖۗۧ۟۬ۛۡۘ۟ۜ۫۟ۜۦ۬۬۫ۥۢۥۜ۬۬ۖۡۗۚۦ۬ۙۖۨۗ۫ۡۗۘۘۨۡ۟ۛۦۘۛۗ۠ۚۜۦۘۨ۬";
                                                                                                                break;
                                                                                                            case -597597926:
                                                                                                                str14 = "ۦۤ۫ۚۡۚۢۨۜۘۧۤۥ۠ۥۘۘۚۘۘۛۙۨۘ۬ۘۘۤ۠ۚ۬ۧۜۤۢۨۛۘۘۘۦۦ۟ۘۜۜۦۛۥۚ۫ۧۜۤۨ۫ۗۛۦۘۡۘۜۤ۠ۦۘ۫۬ۦۨۛۜۗۢۘۘۡۨۗۦ۬ۘۘۤۗۖۡۧۤ۟ۨۦۘۥ۟۬ۛۚ۫ۨ۫ۡۜۙۦۛۥۨۘۖۚۨۘۤ۠۬ۥۡۧ۟ۥۙۡۘۘۨۖۡۘ";
                                                                                                            case 1340920511:
                                                                                                                str14 = create.getWindow() != null ? "ۥ۠۬ۦۘ۫ۙۗۜۘۡۚۛۛۚۢ۠۫ۦۘۚ۫ۥۘ۠ۥۗۘ۫ۡۘۜۡۘۙۖ۬ۖۙۖ۫ۖۥۘۢ۫ۢۢۗۙۘ۬ۨۢۢۨ۠ۙۘۘۙ۬ۦۘ۠ۙ۟ۚۦۖۘۥۛۡۘۢ۠ۖۚۦۘۘۨ۠ۖۘۘۗ۠۠ۛۜۘۜۨ۬۠ۗۛۘۥۘۨۗ۠ۥۥ۫ۡۢۜۛ۠ۤ۠۬ۢۖۥۥۙۚۜۘ۫ۖۡۘ۠۟۟۫ۧۡ۫ۚۜۤ۟ۦۘ۟ۖۜۘ۠ۚۢۤ۬ۦ" : "۟۫۠ۜۚ۬ۛۛۖۙ۫ۙ۬ۨۘۜۖۥۘۖۖۥۘۦ۫ۙۘۤۖۥۙۢۜ۟ۨۘۡۡۦۛۖ۟ۛۖۘۙ۠ۡۘۜۧۘۦۡۜۘۡۗۖۘۢ۬ۖۙۨۢ۬۟ۗ۠ۖۢۡ۬۫ۜۥۥۤۗۙ";
                                                                                                            case 1725758595:
                                                                                                                str13 = "ۨۨۢۤۗ۬ۢۙۘۘ۫۟ۘۘۛۖۥۘۤۥۥۡۧۘ۬ۙۦۘۧۚۡۢ۫ۘۘۡۧۥۢۢ۬ۖۧۘۗۥۘۘۢۧۦۘۚۘۖۘۖ۟ۧۨۚۤۚۦۨۘۡۛۦۘۤۗ۟ۚۦۙۚۥۜ۬ۚۢۤۤ۠۠ۥۖۗۖۖۥۖ۫ۙ۠۫ۚ۫ۘۘۙۡ۟ۘۜۦۘۚ۫۠۬ۚۥ۟ۛۨۧ۫ۥۗۦۙۥۨۘۘۙۤۜۚۢۙ";
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                case -914235782:
                                                                                                    str12 = "۫ۛۦۥۚ۠۫۟۟ۨۛۘ۠ۥۡ۫ۨۘۦۛۚۥۡۥۘۘ۫ۥۘ۫۫ۡۘۧۜۨۘۜۖۘۡۢ۟۠ۡۛۢ۬ۖۙۡۨۘۢ۟ۘۘۜۢۙۨ۠ۗۜ۬۠ۧۖ۬۬ۥۧۧ۠۠۟ۤۚ۠ۙۙۨۘۘۢۨۧ۠ۘ۬۟۬ۧۤۡۦۨۙۛۖۙۤۧۤۛ۬ۗ۟۫ۜ۬";
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case -421820559:
                                                                                        str11 = "ۖ۠ۛۙۧۚۢۧ۟ۖۢ۟ۙۥۙۧۥۧۡۧۜۘۥ۬ۘۧۛۖۜۡۨۢۡۢۙ۫ۘۘ۫ۧۚ۬۠۫۠ۦۨۥۢۜۙۘۘۨ۬ۡ۠ۨۜ۬ۥۦۥۢۨۘ۟ۚ۟ۗۢۡ۬ۘ۬ۖۦۗۨۥۘۡۜۥۘۨۙۚۧۗۜۥۦۤ۬ۧ۠ۗۥۦۘۚۗ۟ۘۤۡۜۖۜۘۤ۫ۙۧۜۛۚۗ۟ۡۖۥۘ۟ۦۜۘ";
                                                                                        break;
                                                                                    case -247684420:
                                                                                        str12 = "ۧ۫ۥۘ۫ۙۨ۟ۢۖۢۦۧۙۙۛۖۢۖۨۥۖۛۥۡۘۗۢۗ۬ۢۦ۟ۦۢۧۜۖۘۗۨۨۛۙۘۥۡۖۘ۫ۚۖ۠ۦۥۘۙۥۜۘۥۢۚۨۦۖۥ۟ۡۨۚ۫ۙۜۛۢ۠ۡۗۨۘ۬ۥۘۛۜۜۘۘۡۘۘ۬ۚۥۦۦ۬ۤ۬ۤ۠ۘۙۢ۟ۡۘۧ۠ۢۖۨۖۘ۫ۧۢۥۚۜۗۛۜۗۦۨۘ۫";
                                                                                    case 1843899819:
                                                                                        str11 = "ۨۡۖۘۤ۬ۜۘۧ۟۟ۦۛۘۛۧۦ۫۟ۙۛۢۘۘۜۗۗ۫ۖۡۘۛۦۜۘ۫ۖۦۚۡۢۥۡۡۘۖۥۜۗۦۥۘۤۘۙۨۢ۬۟۠۫ۢ۫ۧۧۜۚۚۛۜۘ۬ۛۖۛۧۜۤۗۥۘۜۢۘۜۚۜۘۦۖۨۘۖۨۚۘۜۨ۫ۥ۫ۖۡۘ۫ۛۦۘۤۨۛ۠ۛۖۗۦ۬ۙ۟ۖۢۙۙۙۘۦۘۙۖۥۘۜ۠ۢ۬ۖ۬ۨۗۡۘۨۙۧۧۗۖۘۧۥ۠";
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 660100643:
                                                                            str10 = "ۢ۬ۨۨۢۚۥۨۖۘۧۘۘۙۢۨ۫ۛۙ۠ۢۚۗۜۧ۬۠ۖۜۖۢۗۚۥۘۥۛۖۘۦۖ۠ۛ۫ۜۧۧۥۘۢۛۖ۟ۡۖۘۗۚۨۘۧۖۧۘۚۖۖۢۨ۠ۜۛۖۧۘ۫ۡۖ۫ۖۤۙۥ۬ۛۡۡ۬۬ۡۘۦۙۖۘۡۛۡ";
                                                                            continue;
                                                                        case 1091405020:
                                                                            str10 = "ۢۢۘۧۙۥۘۙۡۙۡۘۦۘۤۡ۟ۘۙۡۘۜ۫ۨۘۢۦ۟ۛۨ۬ۖۥۧۘۥۧۘۡۜۛۧۨۥۘۚۜۖۗۘۡۜۢۖۙۛۦۘۨۚۦۘۧۢ۠ۡ۟ۨۘ۠ۥۤۨ۠ۦۗۗ۬۠ۤۜۗۡۘۤ۟ۤۘۤ۠۠۠ۖۢۧۧۤۡۦۘۨۡۨۛۖۦۚۥۙۛۧۦۘۥۦۦ";
                                                                            continue;
                                                                    }
                                                                }
                                                                break;
                                                            case 1590059287:
                                                                str10 = "ۗۙۖۚۡۛۘ۟ۙۛۗۨۤۧۨۘۧ۬۫ۘۗ۠۟ۦ۬ۤۢۨۘۖۙۖۘۗۘۘۜۧۜۘۡۖۘۧۜۚۚۧۘۘۥ۟ۢۚۨۘۘ۟۫ۥۘۤ۫ۨۦۛۛۢ۫ۨۘۚۤۥۘۘۗۚۜۛۖۘ۠ۧ۠ۨۚۜۘ۬ۢ۫ۥ۠۫ۜۡۜۘۖۢۘۘ۫ۦۡۦ۫ۖۘۖۚۚۙۦۥ۠۬ۥۘۗ۟ۘۘۤۜ۟ۨۚۚۡۘۡۘ";
                                                                break;
                                                        }
                                                    }
                                                    Button button = create.getButton(-1);
                                                    String str15 = "۬ۚۘۘ۠ۙۥ۫۠ۤۙ۬ۡۘۘ۬ۘۘۥ۟۫ۙ۠ۨۨۘۚ۠ۦۘۗۚۘۘۜۥۚ۬۠ۦۧ۬۫ۘۚۧ۬۬۠ۙۨۘۡۥۥۡ۠ۖۤۛۡۧۤۥۘ۟ۡۡۥۙ۠ۖۜۦۚۦۙۚ۠۬ۢۛۦۦۜۚۜۨۖ۬ۤۖ۬ۢۡۡۛۖۙ۟۫ۛۥ۫ۨۦۙۧۗۗۖۖۦۜۚ۠ۙۡۙۚۙ۬ۗۘۙ";
                                                    while (true) {
                                                        switch (str15.hashCode() ^ (-1066993005)) {
                                                            case -1933309326:
                                                                String str16 = "ۢۙۧۤۦۜ۬ۦۡۤۦۗ۫ۥۛۗۚۘۛ۠ۦۘۗ۫ۡۘۨۧۙ۠ۛۚۖۦۧۘ۠۬ۛۤ۬۫ۖۘۘۘۖۘۧۗ۫ۘ۫ۦۧۘۨ۟۫۫ۤ۬ۦ۬ۗۤۗۧۛۚۨۚۥ۬ۤۖۨۖۖۨۧۤۡۨۦ۟۠ۥۛۗ۫ۘۦۘ۫ۚۤ۫ۛ۬ۙۛۖۘۥۖ۠ۘۛۜ";
                                                                while (true) {
                                                                    switch (str16.hashCode() ^ (-50889454)) {
                                                                        case -305391115:
                                                                            str15 = "ۧۙۖۖۨۖ۫۟۟ۖۧۨۘۥۥۥۘۗ۟ۧ۠۫۬ۥۤ۬ۤ۫۫ۛۛۜۢ۟ۜۨۨ۠ۖۙۡۦۙۗۦۧ۠۬ۙۚۘ۟ۜۘۙۙ۫۟ۖۘۘ۟ۨۘۥۡۚۡۘۡۚۜۖۨۛۢۙۚ۫ۦۢۘۙۜ۫ۘۜۖۘۢۙۥۘۨۢۖۘۙۦۢ۫۫ۥۘ۟ۦ۫ۗۤ۬ۦۜۖۘ";
                                                                            continue;
                                                                        case 1007929385:
                                                                            str15 = "۫ۖۡۜۗۨۗ۠ۙۡۛۘۚۙۦۡۙۨۤۢۜۘۘ۠ۘۘۢۧۜۘ۠۠ۡ۬ۗۨۘۖۖۜۘۧۛۜۧۥۢۤۨۧۧۨۦۘۢۜۦۘۖۗۙۙۦۘۘۨ۬ۦۛۗۚۖۡۘۢۙ۠ۡ۟ۖ۠۠ۙ";
                                                                            continue;
                                                                        case 1650812078:
                                                                            str16 = "۠ۡۧۘ۠ۗۡۘۜۖۥۙۦۧۘۢ۠ۤۖۧۥۘۦ۟ۙ۬ۗ۠ۙۙۢ۟ۚۘۘ۠۠۠۠ۜ۬ۖۜۡۘۜۢۜۘ۬ۦۗۖ۟ۦۥۡۙۚۢۥۘۧ۟ۗۧ۫ۜۘ۫۟ۜۙۜۢۧۖ۬ۛۦۧۚۛۛ";
                                                                        case 2122942433:
                                                                            String str17 = "ۢۧۜۖ۬ۨۨ۟۠ۖۡۚۖۚۜۖۘۙۡۚۛۡۜۚۙۢۢۙۖۗ۟۬۠ۙۥۧۖۘۜۤۜۘۛ۬ۨۘۗۛۚ۬ۤۢۤ۬ۘۘۡۢۛۛۚۥۘۧ۫۠ۛۛۧ۫ۘۘۛۨۘۜۛۡۘ";
                                                                            while (true) {
                                                                                switch (str17.hashCode() ^ 1470162677) {
                                                                                    case -2040734984:
                                                                                        str16 = "ۧ۟ۘۙۥۧۤ۫ۡ۟ۖۧۥۥ۬ۤۥۘۘۜۦ۬۠ۤۖۘۚۙ۬ۢۘۘۖ۠ۡۛۛۥۘۧۛۡ۠ۥۡۖۙۢ۫ۦ۠ۧۧۛۛۤۥۘۢۤۚ۟ۙۜۦ۠ۥۡۜۤ۬ۧۗۧۜۦۤۛۦۘۘۥ۬۟۠ۨۘۗۚۨۦۢۨۘۚۚۘۘ۫ۜۦۡ۟ۦۨۨۜۘ۫ۜۜ۬ۖۦ۫ۗ۟ۤۧۥۘۛ۬ۥۙۜۧۘۚۗۘ";
                                                                                        break;
                                                                                    case -1713177088:
                                                                                        str16 = "ۗۢ۬ۗ۠ۨۘۚۧ۬۠۫ۦۜۢ۟۬۠ۨۘۙۤۨۘۨۦۛ۬ۨ۫ۨۧۛۧۘ۟ۚۦۘۘۢۦۘۦ۠ۛۗۥۤۙ۠ۢۧۙ۫ۤۢۗۡ۫ۛۗۘۤۦۥۖۤۖ۟ۘ۠ۥۘۘۨۖۘۙۛۘۘ";
                                                                                        break;
                                                                                    case -1634102697:
                                                                                        str17 = "۠ۚۤۨۨۘۘۤۛ۫ۙۢۧ۟۬ۢ۫ۖۚۨۘۢۖ۠ۢۘۧۦۨۥۨۥۨۡۢۧ۫ۛۦۗۖۛۜۘۚۚۥۡ۫۬ۢ۟ۙۥۚۘۘ۠ۙۚۚ۫ۦۜ۠ۘۨۛۦۘۧ۟۫ۤۘۘۧۥۧ۟ۡۥۛۛۜۘۨۚۜ۬ۜۖۘۢۦ۬ۚۗۖۘ۟ۧۜ۠ۘۧۘۢۖۥ۬۠ۘۧۨۜۘ۠ۦ۟۠ۨۨۦۙۛۜۧ۬";
                                                                                    case -945827407:
                                                                                        String str18 = "ۢۨ۬ۛۗۤۡۚۙۗۧۗۢ۫ۤۧۨۖۘ۫ۙۨ۟۟ۦۘۨۦۨۢ۟ۜ۟ۜ۬ۧۚۚۗ۟ۘۘ۟ۙۦۘۜۦۦۘۛۘۦۘۦۛۡۘۧۨ۟ۧۗۧۘۜۜۗۨ۬ۛۧۡۘۡۖۤ۠۟ۢۙۧۙۙ۬۠ۗۦۚ۟ۙۢۙۜۘۘۧ۠ۡۦۧ۫ۗۦ۟ۦۢ۬۠ۘۘۚۛۥۘ";
                                                                                        while (true) {
                                                                                            switch (str18.hashCode() ^ (-1066842762)) {
                                                                                                case -1284505079:
                                                                                                    str17 = "ۧ۫ۙۡ۫ۚۖۨۤۛۤۡۘۗۦۦۘۘ۬ۥۘۥۡۡۘۘ۟ۜۧۙۚۢ۬ۘۙۗۖۡۦۖۘ۟ۘۗۖۚ۬ۥ۠ۧ۬ۘ۬ۦ۟ۜۦ۬۠ۨۧۨۖ۫ۛۜۡۡۖ۠ۙۧ۟ۡ۟ۘ۟ۧۜۛ۫۬۫ۗ۬ۙۗۜۤ۠ۚۡۗۨۗ۟ۦ۠۫ۦۧۘ۟ۢۗۘۘۢۖۛ۟۠۟ۛۙۖۘ۬ۜۨۘۤۙۘۘۜۖۡۘ";
                                                                                                    break;
                                                                                                case -1149646732:
                                                                                                    str17 = "ۛۢ۬ۥۗۜۘۨ۬ۨۘۖۗۡۘۧۨۘۤۗۦۘۙ۠۠ۗۦۡۘۦۨۡۘۤۢۤ۬ۨۡۘۥۗۥ۠ۘ۫ۧ۠ۤۥۤۥۘۛۗ۬ۙۥۧۘۜۥۘۤۘۜۘۨۧۨۘ۬ۥۖۧۗ۟ۦۚۗۧ۟ۗۖۘۜۘۚۦۡۘ۠ۛۤۥۦ۠ۖۘۨ۠ۤۨۨۢۧۙۦ۫ۨۦۖۙۖۚ۠ۖۘ۫ۥۜۗۢۤ۫ۛ۟ۥۨ۬ۗ۠ۘ";
                                                                                                    break;
                                                                                                case -345044238:
                                                                                                    str18 = "ۡ۬ۨۘۢۛۡۘۗۨۜۘ۬ۖۙۛۛ۟ۧۧۨۘ۫۬ۜۘۚ۠ۙۤۢۘۥ۠ۨۘۢۗۛۗ۬۟ۥۛ۫ۖۢۡ۫ۦۘۘۧۗۜۘ۟ۢۘۘۙ۟۫ۙ۠۠ۗۨۧۘۛ۠ۦۘ۠ۛ۟ۧۘۛۨۨۥۘۖۛ۟";
                                                                                                case 907196280:
                                                                                                    String str19 = "ۚۖۥۘ۫ۙۦۘۦۖۜۧۙۦۦ۠ۥۤۗۘۚۜ۬ۤۖۗۗۥ۫ۡ۠ۨۡۚۦۘ۬ۛ۬ۚۧۚۡۘۘۖۦۥ۫ۧۢۛۢ۟ۦۧۘۨۥۤۚۚۥۘ۠۠ۨۘۦۡۡۨۤۡۗۖۙۧۤۦ۠ۧۢۨ۬ۡۤۦۗۨۙ۠۬۫ۙ۟ۚۚ۬ۖۘۤۖۜۘۚ۟ۜۥۦۦۦۜۢۙۗۧۖۨۗۢۚۥۘۖۛۚ";
                                                                                                    while (true) {
                                                                                                        switch (str19.hashCode() ^ (-1200107349)) {
                                                                                                            case -213926726:
                                                                                                                str19 = button != null ? "ۖۧۤ۠ۢۨۚۖۧۨۡۘۤۙۧۢۡۜۘۚۚۛۖۡۨۙۘۛ۫ۖۖۘۦۙۨۤۨۦۧۤۤۥۡۖۘۢۛ۟ۡ۟ۧۗۤ۟ۤ۠ۖۙۦۖ۟ۗۚۢ۟ۨۘۛۛ۠ۢۚۨۗۦۡۘۙۨۢۦۤ۠ۥۘ۠۬ۛۤۧۤۜۗۘۧۙۧۤۙۘۘۨۨۦۘۧۖۡۘۚۧۦۘۗۚ۫ۤ۠ۙۥ۟ۦ۫ۦۘ۬ۡۛ" : "ۧۨۛۜ۟ۥۘۤۖۡۘۗۙۨ۟۫۫ۗۛۤۦ۟ۚۖۤۧۙ۬۫ۤۜۡۙ۫ۨۢ۠ۦۘۡۙۧۜ۫ۢۦ۬ۡۘۚۨ۠ۥۦۜۘۨۘۢۡۧۡ۫ۤۖۘ۬۫ۘۘۧ۠ۜ۠ۘۧۤۢ۫ۡۚ۟ۦۛۙۘۥۨۘۧۗۖۘۢۚۖۖ۫ۤ";
                                                                                                            case 225466838:
                                                                                                                str18 = "ۙ۠۠ۗۚۘۛۡۥۥۦۢۧۚۦۘ۟۟ۜۘۥۧۚۥۢۖۤۤۙۨۥۜۜۨۜ۬ۗۗۙۚ۬۠ۧۡۘۘۙۢۜۡۜۘۤ۬ۥۤۜۘۡۦۛۤۨۖ۠ۜۨ۫۟ۖۢ۫ۢۧۖۘۘۜۥۘۙۙ۟ۥ۠ۥۘۚۜۘ۟ۗۘۗۜۛۜ۟ۜۧۛۜۘۤۗۚۚ۟ۗ۠";
                                                                                                                break;
                                                                                                            case 231402016:
                                                                                                                str18 = "ۚۧ۠۬ۡ۫ۙۘۜۘۤۨۖۖۤۦۘ۠ۤۥۘۜۨۥۘۜ۠ۘۘۙۦۨۘۧۧ۠ۥۡۨۘ۟ۛ۬ۗۚۦۘۘۗۘۚۘ۬ۗۢ۬ۧۚۧۧ۠ۥۘۜ۫ۦۚۚۦۘۡۢۥۘۘ۟۬ۨ۟۟ۢۗۢۘۧۘۘۤ۠ۥۖۚۖۙۗۜ۫ۡۨۦۤۥۘۜ۬ۖۘۗۧۡۘۚۧ۟ۗۥۥۙۨۜۘۤۨۗۡۗۙۜۨ۬ۜۤۛۗۥ۠";
                                                                                                                break;
                                                                                                            case 1779643361:
                                                                                                                str19 = "ۥۤۥۖۦۛۚ۠ۘۜۜۧۘۥ۠ۙۥۦۧۘۚۗ۠ۢۗۦۘۤۘۚۡۗۛ۠۫ۗۤۗۜۘۢۡۢۘۦ۠ۨۛۤۥۘ۬ۦۜۘۙ۠ۡۘۜۜ۬ۛۛۤۗۙ۠ۛ۬ۢۘۙۘ۠ۡۡۘۤ۫ۜۘۥۥ۬ۤۥۢۖ۫ۚ۟۠ۜۙۙۘ";
                                                                                                        }
                                                                                                    }
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
                                                            case -1600526342:
                                                                str15 = "ۤ۠ۥۨ۫۠ۚۗۨۙۨۚۦۛۛۗۥۗۢۙۜۢۦۘۥ۫ۘۘۥ۫ۜۘۨۦۤ۟ۢ۬ۦۜ۟ۜۧۡۗۧۧۢۡۨۗۗۘۗۨۨ۠ۙۛۚۤۜۦۦ۟ۜۧ۫ۥ۠ۡۘ۠۬ۥۘۛۜۛ";
                                                                break;
                                                            case 307242572:
                                                                break;
                                                            case 1047053242:
                                                                button.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                                                                button.setAllCaps(false);
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 86900653:
                                                    String str20 = "ۛ۠ۨۤۙۦۢۖۙۗۙۥۥ۟ۚۦ۠ۢۤۧ۫ۛۗ۠ۗ۟ۥۘۜ۫ۧۤۥۙۘ۫ۨۖۘۨۚ۫ۤۦۧۡۚ۟ۡۜۗ۫ۚۛ۬ۦۤۘۖۨۘۧۛۖۢ۟ۤ۫ۜۗۧ۬ۗ۠ۗۜۘۛۗۡۛۘۡۘ۠ۖۘۗۧ۬ۚۢۘ۠۠ۖۘۖۢۨۘۨۨۜۘۖۖۧۗۥ۬";
                                                    while (true) {
                                                        switch (str20.hashCode() ^ 1875028191) {
                                                            case -2053379008:
                                                                str9 = "ۗ۠ۥۘۦۥۖۡ۠ۥۘۦۙۖۘ۟ۚۘۘۛۥ۫ۚۥۦۘۘۤۖۘۨ۫ۙ۫ۜۦۗۚ۟ۨۜۖۦۦ۟ۦۦۡۡۘۨۧۦۘۡ۫ۘۢۚۨ۬ۡۘۦۙۙۡ۠ۙ۠ۨۨۙۖۥۗ۫ۖۘۧۦۦۘۗ۟ۙۜۖۜۧ۫ۙۢ۟ۥۘۤۧۜۘۙۗۦۥ۫ۤۖۖۖۦۡۧۘۦ۟ۥۘۛۙۘۘ۬۠ۥۧۘۘ۟ۤۢۨ۟ۜۘۨۖ۠ۜۚۚ۠ۥۤ۟ۦ۟ۙ۠ۖۘ";
                                                                continue;
                                                            case -736760109:
                                                                String str21 = "۬ۨۖ۫۬ۜۖۡ۠ۖۤۚۛۧۗۧۘۥۘۗۥۚۡ۬ۨ۠ۤۙۖۘۧۥ۫ۜ۬ۙۨۤ۬ۙ۟ۜۜۘۛۛۦ۫۟۟ۧۧۘۘ۠ۗۥۧۦ۠۬ۛۡۘۤ۟ۗ۟۬ۦۘۧ۟ۦۘۦۘۡۡ۟ۡۤ۬ۘۘۦۜۘۘۖۢۙ۬ۗۨۘۥۖۖۘۢۥۗۤۚ۬ۦۘ۟ۖۙۗ۫۬۠ۥ۫ۙۤۢۤۖۘۡۚۙ۟ۛۖ";
                                                                while (true) {
                                                                    switch (str21.hashCode() ^ (-1488382965)) {
                                                                        case -1072109282:
                                                                            str20 = "۫ۜۚۙۦۘۢ۬ۧۗۖۦۥۢۖۗۦ۟۠ۢۨۘۜۘۖۘۚۚۤ۟ۥۘۘۦۤۢۤۧۜۥۙۨ۫ۜۘۙ۫ۦۘ۠ۥۘ۬ۗ۟ۥ۫ۙ۟۬ۦۘۡۗۡۘۛ۠ۚۙۘۡۘۚۜۜۨ۬ۜ۬ۤۨۘۥۙۦۢ۬ۥۘۚ۫ۨۗۡۧۘۘۛۨۘۚۢۘۘۧۖۥۘۜ۬ۜۘۛۥۤۢۢ۫";
                                                                            break;
                                                                        case -798845964:
                                                                            str20 = "۠ۧۦۘۗۜۨ۟ۥۜۘۚۘۨ۠ۨ۠ۜۡۧۘۗ۫ۗۢۙ۬ۚۥۧۘۘ۬ۜۘ۠ۡۤۧۚۜۡۜۜۗۚۦۘۛۛۨۦۢۜۘۢۜ۫۫ۘ۟۠ۡ۬ۤۜۨۙۡۘۢۜۥ۫ۜۡۘۛ۠۬ۘ۠ۡۘ";
                                                                            break;
                                                                        case -535531262:
                                                                            str21 = "۠ۜۨۙۤۧۘ۫ۘۢۧۨۡۨۚۨۥۥۘۢۖ۠۫ۙۦۙۤۦۚۙۖۗۥۡۘ۟۟ۦ۟۫ۢۨۨ۟ۤۖۖۘۚۨۥۘ۫ۚۚۡۧ۬ۛۜۡۘۘ۟ۖۘ۬ۙۡ۫ۜۙ۬ۜۙ۟ۙ۟ۛۥۜۘۢۜ۫ۨۘ۠ۘۖۢۙ۫ۧۙۘۘ";
                                                                        case 585975357:
                                                                            String str22 = "ۚۢۚۙۢۡۘ۟ۚۖۘۤۥۜۘ۬ۘۛۦۚۨ۬ۜۧۥۖۘۧۢۚۖ۫ۨۘۧۚۧۧۢۜۘۧۛۗۖۡ۬ۨ۫ۨۥۜۚۗ۬ۙ۠ۛۜۘ۠ۨۡۘۥۘ۬ۨۧۘۘۡۙ۟۫ۤۥۤ۫ۨۘ۠ۛ۟۬ۖۡۥۢۧۤۖۢۛۜۘۤ۬ۨۘۨ۠ۖۘۤ۠ۨۘۡۜۡۘۧۗۖۘۤۧۦۜۨۚۛۧۘۧۘۛۖۤ۟۠۫ۘۘۙۧۛۢۖۡۦ۫ۚۤۙۖ۠۫۠";
                                                                            while (true) {
                                                                                switch (str22.hashCode() ^ (-1690341678)) {
                                                                                    case -1838462199:
                                                                                        str21 = "ۡۡ۠۟ۦ۠ۖۡۥۘ۠ۗۘ۠ۙۛۙۜۘۘۡۢ۠۫ۡۦۘۜ۟ۜ۬ۛۨۚ۟ۜۡ۟ۡۛ۠ۥۘۨۤۘۘۗۛۚۗۤۖۥۨۜۙۙ۬ۜۘۥ۬ۨۢۨۢۜۘۖۘ۠ۚۡۘۖۦۨ۬۠۬ۛۨۚ۫۠ۘۡۜۘ۬ۥۚۘۦۢۡ۠ۤ۠۫ۧۥ۟۬۬۫ۥۚۖۜۗۤۖۚ۫ۤۘۚ۠ۤۨۨۙۖۙۜۘ۠ۚۘۘۥۥۛۡۧۦ۬ۤۥۘ";
                                                                                        break;
                                                                                    case -1727270072:
                                                                                        str21 = "ۤۖۖۥ۟ۖۥۘۘۜۛۗ۬۟ۜۘ۬ۡۡۘۚۤۖۘ۫ۛۚۡۤۖۤۦ۬۬ۥۦ۠ۛۘۘ۟ۥۡۘۥ۬۠۫ۚۗۨۧۢۥۘۡۘۗۨۦۘۦۚۨۖ۠۟۬۠۬۫ۥ۬ۘۦۜۗ۠ۨۦۘ";
                                                                                        break;
                                                                                    case -112705466:
                                                                                        str22 = "۟ۖۢۤۥۥۡ۫ۥۘۡۧۗ۬ۡۤۡۥ۟ۥۧۘۙ۬ۚۡ۠ۡۘۧۦ۫ۦۧۘ۫۬۫ۛۚۦۘۜۢ۫۟ۜۘ۟ۧۦۘۨۧۘۘۘۤۨۘۦۗ۟ۧۡۧ۫۠ۘۥۨۢۜ۫ۖۘۦۤۚۢ۫ۙۥۖۨۘۦ۟ۘۚۚۦۘۖۨ۟ۡۗۗۢۛۙ۫۫ۗۥ۬ۨۖ۟ۜۘۛۙۤۖۙۦۛۖۙۚۜۗۥۦۢ۫ۥۢ۠ۡۧ۫۠ۨ۫ۛۜۡۜۘ۬ۗۖ";
                                                                                    case 1133191754:
                                                                                        String str23 = "۬ۥ۟ۢ۫ۢۨۢ۟ۨۗۛۢۗۛ۫ۙۡ۠ۥۤ۠ۢ۟۟۬ۤۚۗ۫ۦۘ۫ۛ۟۫ۦۙۖ۫ۦۘ۠ۨ۬ۦ۬۠ۦۨۦۘۤ۟۠ۦ۫ۚ۟۠ۡۘۛۙۘۗۡ۠ۦ۬ۤۛۧۜۨۢۢۙۡۨۨۖۛ۬ۨۖ۠ۜۘۘۥ۟ۤۦ۬ۦۘۗ۠ۤۜۘۤ۬ۥۘۗۡۜۘ";
                                                                                        while (true) {
                                                                                            switch (str23.hashCode() ^ 1452491210) {
                                                                                                case -1344668149:
                                                                                                    str22 = "ۤۚۛۤۙۗ۠ۤۨۘ۟۠ۨۜ۬۫ۤۚۧۦۥۛ۠ۧۨۘ۫ۜۦۘۨ۟ۦۘۨۜۨۡۢۡۤۢ۫۬۫ۨۘۥۗۨۘ۠ۙۧۗۨ۟ۢ۫۬ۧۖ۟ۙۙۘۨۦۨۘۧۙ۠ۜۧۥ۫۫ۥۙ۠ۥ۠ۥۙۜۘۙ۬ۚۗۚۢۛۙ۫ۚۗۖۘ۬۬ۙۨۡۡۘۛۧۖۘ";
                                                                                                    break;
                                                                                                case -1318755958:
                                                                                                    str23 = "۫ۡ۬ۙۨۡۘۙۧۡۘ۟ۧۤ۬ۜۗ۫ۡۥ۟ۖۨۘ۟ۥۤۜۥۘۜ۠۫ۤۨۙۛ۠ۘۘۤۨۧ۠ۘۨۘ۠ۙ۬ۥۖۘۖۨۙ۟ۧ۟ۙۦۚ۟۫ۜۦ۠ۛۢ۠۬ۤۙۙۘۖ۟ۙۖۘۨۢۖ۫ۧۤ۟ۗۥ۠ۘۡۘۜۜۖۙۚۥۘۘۙۗۤۥۧۚ۬۟ۗۘۘ";
                                                                                                case 521308004:
                                                                                                    str22 = "ۛۨۗ۫۬ۚۨ۟ۘۘۤۘۦۘۨۤۖۤۥۦ۫۬ۘۘۗۛۖۤ۫ۧۢۢۧۢۥۧۘۧۢۦۘۘۙۙۛۡ۬ۤۨۧ۠ۙۢ۠ۤۤ۬ۦۜۡۨۘۡ۠ۡۘۦۗۨۘۖۨۦۙ۬ۦۘۜۘۦۥۦ۟ۥ۬ۗۡ۟۬ۛۗۥۥۘۚۧ۠ۗۥ۟ۖۧ۬ۤۤۦۜۗۢ۫ۘۜۖۤۦۧۤۧ۬ۖۢ۬ۚ۫ۢۖۘ";
                                                                                                    break;
                                                                                                case 852057585:
                                                                                                    str23 = message.what == 1 ? "۬ۤۘۘۛ۠ۦ۟ۗۙۜۛۚۜۢ۬ۦۖۘۘۛۖۦۘ۫ۡۛۛۡۖۘۘۚۛۜ۫ۘۥۘۜۘۡۧۙۢۘۦۘۨۥۖۘۙۚۛۢۤۥ۟ۥۦ۬ۖۥۙۖۗۛۙۘۘۨۧۡۘۤۢۤۖۗۨۘۗۜ۠" : "ۧۨۢۦۥ۠۬۫ۧۚ۬ۧۥ۠۠۠ۗۢۦ۫ۖۘۘۧۢ۠ۥۘۨۡۥۘۢۙۥۘۙۦۧۡۘۤۢ۟ۧۨۙ۫ۗ۠ۚ۫ۥۤۜۡۤۜۚۗۨۡۘۥۜ۫۫۬ۦۘۘۦۖۘۛۚۢۚۢۙۧۨۘۨۘۙ۟ۛۥۙۦۥۧۦۨۡۜۦۚۖۜۤۗ۬۠ۢ۠ۚۘۚۚۦۙۖ۠۠ۦۚۜۦۥۘۢۚۦ";
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case -692363148:
                                                                str9 = "۫۫ۥۘۖۤۘ۠۬ۖۘۧۢۥۘۛۚۖۤۢۡۘۨۤۦۘ۫ۤۨۚۧۚۥ۟ۦۘۥۥ۠ۖۜۦۦۛۢۤۦ۫ۥۛۜ۠ۙۘۗ۠ۖۘۛۙۘۘۥۖۡۘۚۡ۬۫۠ۖ۠ۢۚۗۙۜۨۤ۫ۦۘۖۥۘۢ۟ۡۡۘ۫ۢۙ۬۫ۨۨۘۦۦۦۘۙۢۦۘۥۤۢۚۥۚۡۤۘۘ۠ۧ۟ۛۚۧۥۨۨۗۤۦۘۖ۫";
                                                                continue;
                                                            case 1596551692:
                                                                str20 = "ۦۥۘۘ۬ۗۖۜۘۛۚۗ۬ۧۤۜ۬ۚۤ۬ۥۛ۫ۖ۠ۢۡۘۨ۟ۤ۟۬ۛۗ۟ۡۘ۠۟۟ۥ۠ۥۙۚۖۘ۫ۡۧ۟ۙۦ۟ۦۡۢۦۥۦۜۢۢۢۜۢۛۧۥۤۘۨۧۥۘۢۢۜۘ";
                                                        }
                                                    }
                                                    break;
                                                case 628478628:
                                                    str9 = "ۜۨۢۨۛۙۙۘۘۘ۫ۧۧۛ۬ۜۚۨ۟ۖۤۚۦۡۧۙۦۘۛۗۘۨ۫ۗ۟۟۠ۥۤ۬ۙۘۜ۠ۦۗۙۡۨۧۜۘۛۛۖۘ۠ۙ۫ۜۗۥۘۥۖ۠ۙۥۘۛۥۛۤۦۜۘۤۤ۠ۦۨۖۛ۬ۜۖۡۧۘ۫۫۬ۚ";
                                                    break;
                                                case 1152140417:
                                                    break;
                                            }
                                        }
                                        break;
                                    case -729738331:
                                        str4 = "ۖۗۦ۬ۚۨۘۘۙۚۤۡۡ۟ۙۙۚۜۗۦۗۤۨۤۛۖۧ۠ۦ۫ۘۗۡۥۘۘۦۡ۬ۛۜۛۤۗۡۖۚ۟ۗۡۘۙ۠ۜ۫ۥۢۡۨۜۘۗۤۨۙ۫ۡ۬۫ۚۦۚۜۘۖۛۖۜۤۛۤۡۨۚۜۘۘ۠ۦۙۖ۬ۙۖۤۤ";
                                        break;
                                    case 535009412:
                                        try {
                                            this.val$m_Context.startActivity(new Intent(this.val$m_Context.getApplicationContext(), Class.forName(ApiServer.activity())));
                                        } catch (ClassNotFoundException e) {
                                            e.printStackTrace();
                                        }
                                        Toast.makeText(this.val$m_Context, Deobfuscator$$app.getString(-3440729238023266121L), 0).show();
                                        break;
                                }
                            }
                            this.val$dialogloading.dismiss();
                        }
                    };
                    new Thread(new Runnable(loginActivity, str, str2, handler) { // from class: kentos.loader.activity.LoginActivity$$ExternalSyntheticLambda1
                        public final LoginActivity f$0;
                        public final String f$1;
                        public final String f$2;
                        public final Handler f$3;

                        {
                            this.f$0 = loginActivity;
                            this.f$1 = str;
                            this.f$2 = str2;
                            this.f$3 = handler;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String str4 = "ۦ۫ۡۖۦۙۦۜۥۢ۠ۢۢۥ۠ۚۖۡۜ۠۟۠ۖۛۛۡۜۙۧۛۜۥۨۘۡ۟ۗ۟۟ۖۡۢۘ۫ۧۨۙۨۗۖ۫ۛۦۛۜۦۦ۟ۗۦۘۘ۠ۚۢۗۜۘۘۧۦۖۤۢۦۘۨۦۥۦۚۜۘ۠ۤۚۧۙۥۙۚۗۥ۫ۤۥۖۜۤ۟ۡۧۢۤۜۘ";
                            while (true) {
                                switch ((((((((((((((((((((((((((((((((str4.hashCode() ^ 849) ^ 767) ^ 985) ^ MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION) ^ StatusLine.HTTP_TEMP_REDIRECT) ^ 665) ^ 649) ^ 831) ^ 426) ^ 407) ^ 782) ^ 243) ^ 130) ^ 735) ^ 186) ^ 670) ^ 722) ^ 561) ^ 549) ^ 77) ^ 921) ^ 560) ^ 841) ^ 536) ^ 265) ^ 726) ^ 813) ^ 40) ^ 451) ^ 125) ^ 554) ^ 1804226340) {
                                    case -1103317116:
                                        str4 = "ۥۡ۠ۚۘۤۜۜۦۘ۠۠ۘۘۖ۫ۡۘۜۘۥۘۦ۠ۦ۠ۗۘۘۙۗ۠ۥۡۥۘۗ۠ۘ۟ۨ۬ۡۡۘۧۤۜۘۗۚۗۚۙۢ۬ۢۦۘۖ۬ۦۗۧۗۦ۠ۨۘۚۤۥ۠ۨۚۤ۠ۘۘۛۘۙۢۨۦ";
                                        break;
                                    case -996510392:
                                        LoginActivity.lambda$Login$2(this.f$0, this.f$1, this.f$2, this.f$3);
                                        str4 = "ۥۥۖۜۦۨۥۘۢۙۤۜۘۨۘ۟ۙۖۨۙۛۙۡ۠ۚۥ۬۠ۡۢۘۘۖۙۘۘۚۤۦۗۥۘ۟۠ۜۘ۬۫ۢۤۢۖۘۨۢۥۘۨ۠ۡۘۙۚۢۗۘۥۢۗۨۢ۫ۖۘۨۘۛۡۦۘۘ۠ۡۘۤۛۢ۟ۚۨۘۘۖۜۢۙۢۛۢ";
                                        break;
                                    case -405639670:
                                        return;
                                }
                            }
                        }
                    }).start();
                    str3 = "۬ۤ۫ۘ۟۟ۜۙۨۘ۬ۜۗۚۤۖۥۥۨۘۤۗۖۤۡۧۘۢۛۨۤۖۡۘۘۥۦۘۙۜۦۦۜۧ۫ۘۚۙۨۦۘۘۤۧۤۜۘۜۙ۠ۚۢۧۘۨۢۗۛۥۜۘۧۘۘۥۖۘۛۧۜ۟ۨۨ";
                    break;
                case 345945008:
                    str3 = "ۢۤ۬ۜ۬۬ۡۢ۟ۘۧۥۘۜ۟ۦۘ۟۫ۢۧۥۡۡۦۥۖۡۨۖۨۖۘۤۥۥۖ۟۠ۧ۫ۘۧۡۥۦ۬ۖۘۧۢۡۘۨۢۥۘۙۖۤۙ۠۬۬۟ۨۘۢۘۨ۟ۦۙ۫۠ۙۖۙۙۘۧۜۡۘۘۚۚۚۡۡۗۖۙ۫ۛۥۦۘ۟ۨۘۘۜ۟ۛۤۘ۬ۤۨۘۧۘۦۘۡۙۗۧۘۘ۠ۜۦۡۢۥۖۨۘۡۚ۟ۨۡۥۘۡۢۖۘۡ۫ۜۨۢۦۘ";
                    break;
                case 359933222:
                    linearLayout.addView(imageView);
                    str3 = "ۨ۟ۘ۬ۦ۠ۙۡۦۘ۫ۖۖۨۜۥۙۜ۫ۦۘۡۡۧۦۘۙۢ۠ۜ۬۟ۙۢۥۘۖۨۘۡۤۘۘ۫ۘۘۘۗ۠۫۬۫ۘۘۘۛۚۥۨۧ۠ۦ۠ۧۛۘۗ۟ۛۢۦۥۛۗۥۘۤۢۢۛ۠ۡۘ";
                    break;
                case 382844567:
                    gradientDrawable.setCornerRadius(m80dp(loginActivity, 4));
                    str3 = "۟ۚۜۨۚ۟ۤۚۗ۟۫ۖۖۘۗۧ۫ۦۘۨۢۨۤۚۘۥۡۧۘۢۘۗۢۛۤۘ۬۬ۥۡۘۗ۟۬ۦۥۜۘ۠ۛۙۚۨۘۥۖۥۗۥۨۘۤۦۚۤۜۧۘۖۜۘ۬ۛۦۥۘۢۦۗۙۘۜۘ۟ۜۥۖۥۢۨ۠ۛۦۥۛ";
                    break;
                case 396634374:
                    return;
                case 539900787:
                    linearLayout.setPadding(i, i, i, i);
                    str3 = "ۗ۠ۧۦۗۡۢۧ۬ۘۡۙ۬ۢ۬ۜۜۦ۫ۜۚ۫ۙۡۘۦۘ۬ۡۤۚۢ۠ۛۖۙۗۢ۠۟ۨۧۘۙ۬ۤۗۤۧۜۧۘۙۙۜۘۘۤۛۧۚ۟۫ۧۛۡ۫ۜۗۨۡۘۢ۠۫ۤۧۨۤ۫ۥ۟ۛۖۘ۠ۥۜ۟۟ۡۧ۠ۚۖۦ۫۬ۢ۠ۦۗۜ۫۬ۙ۬ۗ۠ۢۢۖۤ۬ۡۡۘۜۘ۫ۖۜۛ۠ۨۗۚۡۘۤۘ۟۠ۥۦۛۚ";
                    break;
                case 550180971:
                    textView.setText(loginActivity.getString(C0931R.string.str005e));
                    str3 = "۫ۘۗۙۨۗۥۖۨۢۢۥ۠۫۬۠ۤۜ۟ۦۥۘۧۜ۟ۙ۟۫۫ۚۧۘۧۖ۬۠ۦۥۚۙۡۛۨۖۛۙۤۚۥۨ۟۫۟ۚ۬۬ۤ۫ۜۧۘ۠ۖۘۚۡۥۘ۬ۥۥۤ۟ۥۤۡۧۥۢ۠۫۠ۘۘۦ۫ۥۘۗۙۘ۬ۚۘۜۘۧۢۙ۫۠ۤۤۛۛۥۘ۬ۙۨۖۗۨۙۧۨۘۨۘۡۦۚۡۨۜۛۖۛ۫ۨۘۚۖۙۙ۠۫ۢۤ۠۟";
                    break;
                case 642664668:
                    linearLayout.setOrientation(1);
                    str3 = "ۚۙ۠ۚۛۦۘۜۡ۬ۙۛۦۘۢۨۨ۬۟ۙ۠ۖۖۢۨۘۤ۬۬ۤۡۨۦۜۙۦۛۦۨۖۜۚۨۡۛ۫ۦۘ۠۠ۙ۬۬ۗۤۗۦۘۛۙ۫۬ۡۥۘۦۘۘ۬ۥۜۛۧۗ۟ۧۡۘۨ۫ۖۘۜۡ۫ۖۚ۟ۚۨ۬ۡۡۘۥۢۛۛ۠ۤۛ۠ۡۘۛ۠ۥۤۨۘۜ۬ۖ۫ۤۜۘۥۗ۠ۦۥۜۘ۬ۙ۟ۖ۟ۚ";
                    break;
                case 831569238:
                    textView.setLayoutParams(layoutParams2);
                    str3 = "ۜ۬ۘۘۧۙۦ۟ۥۖۘۧۥ۠ۧ۟ۜۘۥۙ۠ۗۜۖ۬ۦۚۗۡۥۙ۟ۡۘ۬ۨۚۖۨۤۢۢۚۢۥۗۡۢۥۛۥۘۢۦۨۙۧۖۘۗۨ۫ۢ۬ۨۘۥۢۙۡۤۧۚۤۡۘۙۛۘۘ۫ۖۦۚۚ۬ۖۡۖۘۦۙۤۧ۟ۦۘۚ۟ۥۢ۬ۛۥ۟۬ۨۛۖۧۤۡۘۧ۠ۘۨۚ۟ۖۤۜ۠ۛۥۧۖۛۘۜ۠";
                    break;
                case 869705490:
                    textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                    str3 = "ۦ۬ۦۤۢۢۙۚۨۤۖۛۦۨۢۗۧۡۚ۟ۢۖۖۘۢۗۙۗۨۨۤۖۧ۬ۦۦۥۡۨۘۛ۠۟ۛۗۧۜۜۖ۠ۙۢۢ۫ۜۘۡۥۦۘۦۛۖۦۗۘۤۚۤۖۗ۠ۘۦۥ۬۫ۦۚۡۨۖۜ۟ۧ۟ۨۘۖ۫ۘۘۜ۠ۘ۫ۗ۟ۤ۬ۢۧۨ۬ۦۨۡۢۨۤۙۜۛۨۤ۟ۚ۟ۥۥۗۨۘۖۖۤ";
                    break;
                case 888872871:
                    layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    str3 = "ۜۤۛ۠ۧۧۚۢۨۘۥۡۘۘ۠ۖۡۘۜۧۦۥۦۛۙ۫ۢۛۧۥ۠ۦۛۙۧۖۘۤۨۧۨۨۧۖۖۨۧۗۖۘۦۚۜۖۤ۟ۢۡۘۧۤۥ۫ۤۦۘ۠ۚۤۙ۠۟ۡۖۜۘۢۦۥۗ۬ۥ";
                    break;
                case 1183764101:
                    linearLayout = new LinearLayout(loginActivity);
                    str3 = "۠ۤۢۢ۟ۚۘۥۛ۟ۢ۫ۨۦۘۚ۠ۥۜ۬ۙۧ۫ۨ۬ۡۙۨ۠ۜۘۥۦۗۨۛۖۢۢۥۘ۬ۨ۬ۜۤۥۤۥۥۖۚۘۡۖۜۢۜۜ۬۟ۤۧۚۙۘۧۖۘ۠ۚ۬ۥۡۨ۠ۨۘۛۡۖۙۜۘۖۚۥۘۛۙۘۘۧۨۘۘ";
                    break;
                case 1280048013:
                    linearLayout.setBackground(gradientDrawable);
                    str3 = "ۗۨۢۗۗۧ۠۠۟ۥۨۚۖۡۦۚۛ۫۠ۗۜۧۡ۟۫ۦۥۢ۠ۛۛۙۡۘۡۖ۠ۚۦ۠ۥ۬۫ۡۚۗۦۜۘۧۖۧۜۘۦۥ۠۫ۥۗۧ۫ۨۘۚۖۡۗۦۛۢۖ۟ۧۢۜۧۖۛۧۛۥۚۢۚۤ۠ۜۨ";
                    break;
                case 1518929570:
                    linearLayout.addView(textView);
                    str3 = "ۥۘۖۘ۟۫۠۠۠ۥۘۦۤۜۘۡۤۛۚۥۜۘۡۦۛۙۢۘۨ۟ۦۦۦۖۢۛۡۖۜۧۘۤۧۙ۠۫ۥۥۙۨۘۢۨۖۧ۬ۢ۟ۡۖ۟ۤۛ۫ۚ۬ۚ۠ۘۘۥۗۙۗۤ۫ۗۧۤ۬۠ۚۥۢۡۜۦ۬۬ۙۜۖۘۛۚۚۖۗۡۘۙ۟ۛۙۙۘۘۙۜۗۧ۬۠ۙ۟ۡۛۖ۬ۜ۬ۨۘ۬ۗۙۢۘۙ۠ۙۥۘۨ۠ۡۘ۠ۦۧۘۥۨۥۖۥۡۘ";
                    break;
                case 1609754946:
                    str3 = "۠۠ۖۘۥۦۥۘۗۢۢ۬ۚۗۚۢ۫۠ۤۧ۠۬ۙ۠ۘۖ۬ۦ۠۠۠ۨۥۤۦۦۤ۬ۦۘۘۘۘۡۗۨۦۡۧ۟ۗۚۧۘۙۥۢ۟ۥۘۛۨۦۘۡۛۨۘ۫ۙۥۢۢۥ۬۠ۨۘ۟ۡۢۢۡۖۘۗ۬۫ۨۤۘۘۘۚۘۘ۬ۥۥۙۜ۬۫ۡۘۗۢۗ۠۟ۗۢۜۨۙۧ۫ۤۦۧۜۢۜۧۖۘۦۛ۟";
                    break;
                case 1830246812:
                    alertDialog.show();
                    str3 = "ۜۗۜۘۘۥۡۖۜۖۥۙۧۖۚۨۢۜ۠ۢۘۧۘۦۖۗۛۡۙۡۙۘۥ۬ۦۡۘۗۛۦۡ۠ۘۥۙۨۘ۬۫۠ۨۨۡۘۡ۟ۥۚ۠ۢ۟۟ۧۢ۟ۖۛ۠ۗۛۗۘۧۜۘ۟ۚۘۘۨۛۘ۬۟ۘۘۨۦ۫۟ۜۚ۠۟ۛۗۦۨۘۛۖۘۘ۟ۛۨۢ۬ۗ۠ۡۨۘۤۤۘۡ۠ۥۘۚۦۧۘۚۘ۫ۛۘۘ";
                    break;
                case 1878886689:
                    textView = new TextView(loginActivity);
                    str3 = "ۡۦۧۘۤۤۦۘۢۨۘۘۤۧۨۘۦ۬۬ۗۙۜۙۚۙۖۧۘۘ۠ۙۘۛۘۢۢ۠ۤۦۤۤۛۘۗۤۢۘۦۙ۫ۚۛۖۘۖ۬ۦ۬۬ۛۢۜۛۖۚۨۗ۫ۦ۟ۚۧۗۜۧۦ۬ۛۖۖۡۖ۫ۗۗۦۘۜۜۥۜ۠۬۟ۘۧۚۜۘۤۦۦۡۥۘ۫ۖ۟ۨۗۘۘۡۥۖۘۘ۫ۤۙۖۦۘۛۨ۟۬۠ۜۖۥۥۘۧ۫ۚ۬۠ۖۖۨۜۙۛۙ";
                    break;
                case 1928502849:
                    linearProgressIndicator.setLayoutParams(layoutParams3);
                    str3 = "ۤۡ۫ۥ۬ۜۘۙۚۧۥ۫ۥۘ۟ۛۥۘۜۛۘۜۜۦۘ۫ۖۥۙۢۙۙۡۘۘۚ۠ۦۗۛۧۚۨۨۚ۬ۜۨۥۡۤ۫۠ۦۡۢۡۧۨۨۢۧۥۨۘ۠ۡ۟ۚۡۗۖ۬ۗۦۘۙۡۥۘۜۡۘۘۢ۫ۨۖۖۖۘۤۦ۠ۜۨۧۘۗۚۜۘۚ۫۠ۖۧ۫۠ۨۤۧۛۜۗۡۨۨۘۘۨۚۙ۟ۙۧ۟ۖ";
                    break;
            }
        }
    }

    static /* synthetic */ SharedPreferences access$000(LoginActivity loginActivity) {
        String str = "۬ۤۥۘۨۚ۬ۖۙ۠ۜۜۧۦۖۛۙۥ۫ۛ۬۫ۤۙۛ۠ۜ۟ۨۘۡۖۗۚۘۡۘۨۤۙۖۡۙۢۙۨۥۡۘۚ۫۬ۧۤۗۘۨۨۘۙۖۜۘ۬۟ۦ۬ۘۚۙۖۚۡ۬۬ۢۧۨۗ۟۠ۗۜ۫ۛۘ۟ۤۙۜۘۥۙۦۙۛۖۘۖۥۡۢۜ۬ۥۨۘۢۙۦۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 903) ^ 1000) ^ 72) ^ 410) ^ 18) ^ 248) ^ 127) ^ 580) ^ 684) ^ 156) ^ 615) ^ 147) ^ 482) ^ 77) ^ InputDeviceCompat.SOURCE_KEYBOARD) ^ 219) ^ 109) ^ 243) ^ 372) ^ 993) ^ 324) ^ 924) ^ 345) ^ 227) ^ 821) ^ 306) ^ 328) ^ 609) ^ 243) ^ 368) ^ 133) ^ (-643368844)) {
                case -768603246:
                    str = "ۘۡۦۘۘۙۢۡۨ۠۫۬ۦۘۘۧ۬ۨ۟ۡۛۤۦۡۦۜۘۥۧۖۘۙ۬۬ۨۨۗۧۚۙۜ۠ۨۢۤۢۨۙۦۘ۬ۤۨۘۚۨۧۜ۠ۗۦۥۚۛ۫ۙ۠ۨۙ۬۫ۢۖۛ۟ۢۖۙۥۢۙۡۙۖۘۧۙۤۘۖۚۡۙۜۘۧۧۢۨۤۜۛۤۙۨۚۡۜۖۨۘۧ۫ۤۗ۫ۤۛۖۦۘ۠ۗ۠ۛ۫ۦۘۦۨۚ۫ۖ۫ۧۢۡۦۜۗۥۜۘۖۡ۟";
                    break;
                case 208085158:
                    return loginActivity.prefs;
            }
        }
    }

    static /* synthetic */ String access$100() {
        while (true) {
            switch (((((((((((((((((((((((((((((((("ۛۛۥۘۦۖۢۚۘۚۢ۫ۛۖۦۡۘۢۖۙ۫ۦۥ۫ۖۖۘۢۡۜ۟ۦۧۗۗۢۨۧۘۢ۬ۖۘ۬ۜۖۘۢۧۡۘۨۖۖۘۜ۠۟ۙ۟ۖۜۘۗ۠ۨۖۦۜۘ۠۫ۥۘۡۗ۟۠۟ۜ۫۬۟ۡ۠ۥۘ۬ۜ۬ۚ۠۠ۘ۟ۜۡۖۢۥۢۦۘۖ۠ۡ۬ۙ۠ۧ۠ۥ۫ۛۦۜۘۥۘ۠ۜۦۘۨۢۖۘۖۖۡۘۗۧۖۘ".hashCode() ^ 445) ^ 55) ^ 659) ^ PointerIconCompat.TYPE_WAIT) ^ 561) ^ 38) ^ 189) ^ 724) ^ 958) ^ 706) ^ 284) ^ 221) ^ 431) ^ 608) ^ 82) ^ 509) ^ 343) ^ 542) ^ 758) ^ 563) ^ 166) ^ 492) ^ 589) ^ 499) ^ 690) ^ 883) ^ 164) ^ 946) ^ 939) ^ 365) ^ 405) ^ 141626286) {
                case -464559129:
                    return ModeSelect;
            }
        }
    }

    static /* synthetic */ void access$200(LoginActivity loginActivity, String str, String str2) {
        String str3 = "ۨ۫ۖۧۚۖۡۥۢۚۛۥۢۚۜۘۥۦۖۘۥۨۜۚۖۨۘۡۗۜۧ۟۠۠ۚۛ۬ۥۡۛۜۛ۟ۚۙۛۡ۬ۡۥۙۙۛۘۘۡۦۛۗۥۜۡۘ۟۫ۡۤ۬ۨۘۚۜۙۛۖۢۦۖۗۡۖۡۥۤۚۥۖۧۘۢۢ۠ۡۨۨۘ۬ۚۦۘۚ۬ۨ۫ۘۧ۟ۛۢۜۨ۟ۛۧۢۢۨۚ۟ۜ۟ۨۤۤۡ۫ۛ۟۟ۨۘۛۨۨۘۢۥۧۘۨۜۨۢ۠۬";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str3.hashCode() ^ 547) ^ 742) ^ 663) ^ 389) ^ 224) ^ 69) ^ 182) ^ Optimizer.OPTIMIZATION_STANDARD) ^ 376) ^ 294) ^ 959) ^ PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW) ^ 669) ^ 456) ^ 910) ^ Optimizer.OPTIMIZATION_STANDARD) ^ 675) ^ 479) ^ 526) ^ 291) ^ 334) ^ 59) ^ 624) ^ PointerIconCompat.TYPE_CROSSHAIR) ^ 579) ^ 348) ^ 947) ^ 796) ^ 117) ^ 212) ^ 921) ^ (-1308381595)) {
                case -1401156918:
                    Login(loginActivity, str, str2);
                    str3 = "ۙۛۢ۬ۦۤۚۖۘۘۜۥۨۘ۟ۘ۬ۛۢۘۘ۬ۤۡۡۤۧۘ۬۟۟ۚۦ۟ۛۘۨۘۛ۟۟ۙۘۛۖۘۚ۟ۡۨۛۚۢۜۤۤ۠۟ۜۖۦۢ۠ۡۘ۠ۡۘۘۘ۠۠ۢۙ۟ۢۘۘۘۡۜ";
                    break;
                case -373941591:
                    str3 = "ۖۙ۬ۡۚۙ۟ۧۨۤ۟ۖۚۜۧۨۡۥۘۚۘۥ۟۠ۧۙۖۗۙۡۗۥۛۜۘۖ۫ۢۡۗۦۤۛ۫ۗۡۨۨ۬ۖۘۨۥۘۘۤ۬ۜۘ۬ۙ۟۟ۢۡۘۧ۫ۦۘۧۤ۠۫۠۫ۜۗۦۢ۫ۥۚۖۛۢۛۤۢۤۨۘۖۨۘۚ۬ۜۘ";
                    break;
                case 699435129:
                    return;
                case 1618181110:
                    str3 = "ۤ۫ۡۘۜۗۨۘۡ۬ۧۛۛ۬ۦ۟ۛ۟ۘۤ۫ۡۤۦۗۜۘۛۡۖۙۛۜۘۚۛۢۗۨۛۜ۟ۗۙۖ۫ۨۛۚۦۢ۫ۘ۟ۘۖۡ۠ۛۙۨ۫ۛۨۤۜۘۘۚۦۘۥ۟ۡۘۢۢۦۘۙۡۗۛۡ۫۫ۚ۬ۗۛۖۘۨۥۥۥۨۘ";
                    break;
                case 2129825823:
                    str3 = "۬ۖۤۜۡۥۡۧۦۘۖۦۙۜۜۧۘۘۨۙۦۥۡۖۧۜۧۜۥۘۨۘ۠۬ۘۦۘۥۗۡۥۙۡۘۘۦ۫۬ۜۘۨۖۜۘۛ۟ۦۘۙۛ۠ۧ۠۬ۚۢ۬۠ۧۨۨۗۘۘۙ۟ۚۧۜ۠ۙ۫۫۟ۥ۬۠۟ۦۙۤ۫ۤۘۦۘۢ۫۠۟ۡ۠ۦۡۙۙ۟ۜ۠ۡۧۚۥۛ۬ۧۡۦ۟ۜۘۢۙۦۨۨۘۘ";
                    break;
            }
        }
    }

    static /* synthetic */ void access$300(LoginActivity loginActivity) {
        String str = "ۨۗۘۘ۟ۤۥۜ۟ۖۘ۠ۙۨۗ۠ۚۙۜۘۜۙۢۢۚۦ۬ۙۖۘۢۨۚۢۜ۫۬ۗۗۛۤ۫۫ۨۢۗۜ۬ۢ۫۟ۗۛۧۤۙ۠ۦ۬ۨۗۧۖ۬۟ۡۛ۫ۛۘۢۛ۠ۡۨۘۜۦۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 260) ^ 163) ^ 632) ^ 751) ^ 336) ^ 744) ^ 388) ^ 331) ^ 164) ^ 549) ^ 879) ^ 179) ^ 102) ^ 937) ^ 25) ^ 297) ^ 408) ^ 870) ^ 299) ^ 397) ^ 375) ^ 600) ^ 698) ^ 17) ^ 649) ^ 309) ^ 623) ^ 378) ^ 618) ^ 327) ^ 187) ^ (-1485064870)) {
                case 439629471:
                    return;
                case 1635076413:
                    str = "۬ۛۜۘۛ۫ۜۘ۟ۙۚۛۗۡۡۢۦۘۨۦۨۦۨۦۦۜۘ۟ۜ۫ۢ۫ۘۙ۠ۖۤۥۧۙۖۨۘۢۖۛۛۢۖۘۜۚۘ۠ۦۖۦۧۦۚۜ۟ۙۥۘ۠ۚۜۦۘۢۛۖۢ۠ۨۢۙۛۚ۟ۗۜ۟۬ۘۘۖۙۖۘ۫ۗۡۥۛۤ";
                    break;
                case 1774337720:
                    loginActivity.showInvalidKeyDialog();
                    str = "ۢۘۘۧۥ۫ۜۜۗۧۢ۟ۚ۠۫ۧۛۖۡۜۥۘ۫ۡۛ۫ۛۦۜۙۛۢۘۥۘ۠۫ۨۧۨۘۧۥ۟ۦۚۢۛۡۚ۫ۘۗۤ۬ۖۘۘۘ۫ۙۧۥۘۙۙۗ۠ۖۘۘۘۘۗۨۡ۟ۚ۟ۜۘ۫ۘۜۖۜۨۘۤۢ۠۬ۤۜۥ۟ۥۘ۟ۨۚۦۛ۟ۤۜۦۘ۬ۦۥۘۜ۟ۜ۫ۖۙ۠ۛۡۧۤۙۢۡ";
                    break;
            }
        }
    }

    static /* synthetic */ AlertDialog access$400(LoginActivity loginActivity) {
        String str = "۟۫ۤۡۦۧ۫ۛۧۧۙۨۡۙۛۧۗۤۢۖۥ۟ۤۛ۬ۜۘۖ۫۫۬۠ۙۖۤۧۙۦۘۘۛۢۙۜ۠ۨۦ۫ۢۤۨۨۚۦۥۗۙۡۘۧۜۘۘۢ۟ۘۛۗ۟ۜۦۡۜۙۡۛ۟۫ۜۘ۬ۘۘۘۤ۫ۥۘ۟ۦۡۘۗ۫ۦۦۤ۠۠ۨۥۘۛ۟ۦۚۢۛۛ۬ۢۙۥۘۗۤۡۘۦۧۦ۠ۘۡۡۢ۬۫ۜۧۖۗ۟ۖۨۡۧ۫ۛۙۛۥۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 1) ^ 761) ^ 740) ^ 158) ^ 404) ^ 719) ^ 568) ^ 368) ^ 652) ^ 845) ^ 972) ^ 84) ^ 916) ^ 747) ^ 237) ^ 785) ^ 405) ^ 601) ^ 698) ^ 466) ^ 139) ^ 552) ^ 369) ^ 76) ^ 675) ^ 961) ^ 432) ^ 11) ^ 283) ^ 588) ^ 877) ^ (-699146312)) {
                case -1267108619:
                    str = "ۜۨۧۘ۬ۛۖ۟ۖۡۘۚۤۜۘۧۚۖ۫ۦ۬۠ۗۚۢۧۥۘۛۧ۟ۚۦۢۘۥۨ۫ۢ۫ۚۡۧۤۦۙۚۙۚۙۗۛۤۧۥۘۨۡۘۜۗ۠ۤۛۘۖۜۧۛۙۜ۟ۖۢۢۘۥۘۦۦۛۧۥ۟ۚۚۖۘۚۤۚۡۦۡۖۛ۟ۛۖۚۡ۠ۧۙۜۘۖۘۦ۟ۚۨ";
                    break;
                case -1221624497:
                    return loginActivity.progressDialog;
            }
        }
    }

    static /* synthetic */ void access$500(LoginActivity loginActivity) {
        String str = "ۘۦ۟۫ۥ۬ۘۖۡۘۗۛۖۘۥۛۦۘۥۘۡۘ۠ۡۨۘۘۘۙۜۦۨۘ۟ۜۜۡۜۢۛۗۜۨۜۙۖۤۤۘۤۧۧۡ۬ۢۡۘۘۡۧۘ۠۠۫۬ۥۘۘۖ۫ۧۢۙۡۜۜۖۘۖ۬ۗۢۧۨۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 928) ^ 714) ^ 13) ^ 451) ^ 446) ^ 777) ^ 189) ^ 770) ^ 724) ^ 636) ^ 322) ^ 633) ^ 825) ^ 89) ^ 45) ^ 674) ^ 341) ^ 730) ^ Optimizer.OPTIMIZATION_STANDARD) ^ 552) ^ 340) ^ 142) ^ 171) ^ 279) ^ 590) ^ 686) ^ 692) ^ 772) ^ 721) ^ 657) ^ 285) ^ (-601425200)) {
                case -2018088838:
                    loginActivity.showUpdateDialog();
                    str = "۬ۢۖ۟ۜۖ۬ۤۙ۠۟ۡۘ۫۫ۜ۠ۜۥۘۢۚۘۘ۫ۨۧۛۢۖۘۙۨ۫ۡۧۚۛۡۜۡۗۧۡۛۧۖۢۖۘۗۜۡ۬ۛ۬ۤۙۙۛۨ۫۠ۜۘۢۤۧۙۦۥۤ۠ۙۙۚۦۘۗ۬ۧۚۗۧۖۚۜۢ۫ۧ۟ۢۖۛ۠ۚ۬ۚ۟ۨۜ۠ۚۙۗۜۥۥۢۥۥۘ";
                    break;
                case 308120180:
                    str = "۟۬ۡۘ۬۬۠ۚۘۧۧۖۚۘۙۡۥ۠۟ۨۙ۠ۜۘۘۚۖۢۗۥۛۤۤۥۢ۟ۢۦۘۧۘ۠ۡ۬ۥۡ۟۫ۗۡۙۥۦ۠۠ۜۙۜۘۧۖۚۙۘۘۛۘۤۢۢۛ۬ۨۢۛ۠ۡۘ";
                    break;
                case 1348653472:
                    return;
            }
        }
    }

    static /* synthetic */ boolean access$602(LoginActivity loginActivity, boolean z) {
        String str = "ۖۛۙۥۨ۟۫ۗۖۗۦۨۜۜۘۦۨۧۗ۠ۤۗ۫ۛۘۡ۟۠ۨۖۤۢۜۘۤۥۦۚ۬ۡۥ۫ۜۦۘۙۖۢۦ۫۬۠ۜۥۘ۟۠۫ۗۛۧۜ۫۟ۧۘ۫ۡۘۘۢۤۥۘۤۙۘۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 625) ^ 193) ^ 61) ^ 549) ^ 274) ^ 70) ^ 879) ^ 575) ^ 163) ^ 316) ^ 634) ^ 160) ^ 125) ^ 21) ^ 678) ^ 9) ^ 528) ^ 110) ^ 558) ^ 487) ^ 483) ^ 206) ^ 576) ^ 882) ^ 977) ^ 626) ^ 508) ^ 989) ^ 729) ^ 613) ^ 795) ^ 751490993) {
                case -746135280:
                    return z;
                case -238801495:
                    str = "ۥۥۧۨۧۚۦۡۧۗۧ۟ۦۥۦ۬ۦ۠۬ۢۜۦۖۘ۬۬ۛۡ۬ۡۛۨ۬ۚۦ۫ۜۥۗ۬۫ۖۤۙۡۡۜۘۡۙۨۘۛ۠ۖۦۧۧۢۜۢۖۨۜۘۚۙۖۘ۠۫ۜۢۤۨۘۢۙۘ";
                    break;
                case 785218585:
                    str = "ۢۢۘۢ۫ۦۤۛۦۘۗۨۦۜۤۙۚۧۡۙۤۧۚۨۗۗۤ۫ۘۤۡۘ۟۠ۧۢۧۜۥۨۢۙۡۙۨۤۨۘۥۡۢ۬ۛۨۘۢۚۤۖۖۧۘۤۡۚۜۜۦۖۦ۫ۧۙ۟ۘ۠ۢۡۢ۬";
                    break;
                case 1869792431:
                    loginActivity.updateCheckComplete = z;
                    str = "۟ۜۖۘۛۥۛۦۥ۬ۛۦۘۖۥ۬۟ۥۛۥۛۨۘۢۗۦۧ۠۟ۚ۟ۖۘۖۡ۟ۤۡ۫ۚ۬۫ۙۡۘۜۗۨ۠ۡۥۘۨۨۤ۟ۗۡۘ۠ۤۦۥ۬ۤۚۙۥۤۢۘۛۦۨۚۦۡۘۛ۫ۨۘ";
                    break;
            }
        }
    }

    static /* synthetic */ void access$700(LoginActivity loginActivity) {
        String str = "ۙۥۗۜۡۙۜۨۧۛۧۨۛۛۖ۟ۧۙۤۥۖۢۦۘۧ۟ۙۗۢ۫۫۬ۨۗ۟ۗ۫ۢۖۘۥ۠ۤۙۖۡۙ۬ۦۘۛ۬ۡۙۙۖۘۨۘۢۡۥۚۗۤۤۢ۟ۧۚۛ۠۠ۚۡۤۗۚۚ۟ۘۘۡۗۖ۬ۤۢۖۢ۠۟ۧۛ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 978) ^ 584) ^ 921) ^ 350) ^ 463) ^ 86) ^ 804) ^ 242) ^ 689) ^ 387) ^ 97) ^ 526) ^ 840) ^ 919) ^ 631) ^ PointerIconCompat.TYPE_TEXT) ^ 589) ^ 70) ^ 238) ^ FileUtils.FileMode.MODE_755) ^ 480) ^ 106) ^ 443) ^ 675) ^ 289) ^ 761) ^ 545) ^ 217) ^ 100) ^ 593) ^ 954) ^ 260860943) {
                case -934653307:
                    return;
                case 97380453:
                    str = "۟ۨ۠۟ۖۢۚۗ۟۫ۜۛ۫ۧۗ۟ۧۗۘ۠ۖۗۤ۬ۗ۫ۨۘ۫ۙۧۜ۟ۛۖۚۙۥ۟ۨۖۨۧۨ۠۬ۧۢۦۘۡۚۥۘۛ۫۬ۚ۫ۘۘۦ۬ۘۙۗ۫ۡۢ۟ۧۥۘۙ۫ۢۤۚۡۘ۫ۢۚۖ۫ۜۘۙۤ۟ۤ۬ۥۦۧۖۘۘ۠ۢ۟ۜۖۦۥۘۡۥ۠ۥۨۙ";
                    break;
                case 640396911:
                    loginActivity.enableNavigationButtons();
                    str = "ۚ۬۫ۤۖۖۘۡۖۙۦۜۦۘۜۤۜۤۨۖۘۜۡۨۘۤۥۘۛۛۦۘۗ۠ۖۘۖۜ۠ۡۨۡۘۡۡۘۧۙ۬ۖ۫ۨۢۢۦۘۜۨۙ۬ۧۨۙۢۚۦۤۖۘ۟ۧۖۦۨۡۘۛۖۘۘۢ۟ۜۧۦۘ۫ۛۥۘۘۘۦۖۥ۬ۘۗۧ۠ۘۜۘ";
                    break;
            }
        }
    }

    static /* synthetic */ void access$800(LoginActivity loginActivity) {
        String str = "ۦ۟ۜ۫ۖۨۦ۬ۖۜ۫ۢۖۥۘۡۗۨۘۗۢۙ۠۠ۡ۠ۜۘۤۗۡۙۨۙۦۨۘۘ۫۠۬۟ۚ۫ۛ۫ۦۘۘ۟ۛۦ۫ۙۙۜۡۘۡ۠ۛۧۜۢۛۚۜۘۖۛۚۗۛۤۙ۟ۢۧ۬ۤ۫۠ۖۘۖۜۥۢۦۖۗۡۛۧۥۘۛۡۦ۬ۛۜۘ۬ۢۥۘۡۡۘۘۨۧۛۨۢۢۚۖۥۘۨۛۡۘۡۚۙ۫ۙۧۙۜۘ۬ۡۢ۫ۜۢۘۨۦۘۥ۬ۨ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 807) ^ 178) ^ 921) ^ 832) ^ 711) ^ 784) ^ 785) ^ 393) ^ 968) ^ 944) ^ 590) ^ 414) ^ 411) ^ 221) ^ 573) ^ 320) ^ 202) ^ 810) ^ 692) ^ 325) ^ 522) ^ 469) ^ 638) ^ 454) ^ 82) ^ 361) ^ 556) ^ 931) ^ 41) ^ 836) ^ 520) ^ (-820043495)) {
                case -329412254:
                    return;
                case 339247151:
                    str = "ۖۛۜ۬ۤ۟ۥ۬ۤۚۦ۠۫ۧۜۘ۟ۥۡ۠ۘۡۖۙ۬۟ۙۡۛۘۖۥۧۘۖۖۨۘۡۦۧۘ۬ۥۜۘۛۖۗۧ۫ۘۘۤۚۛ۠۟ۘۘۖۢۜۘۚۦۧۙۙۦۚۥۢۜۜۤۖۥۜۘۙۜۥۙ۬۫ۡۗ۫ۛ۫ۘۘ۠ۙ۟۬۟ۡ";
                    break;
                case 1861616747:
                    loginActivity.showUpdateErrorDialog();
                    str = "ۥ۟ۘۘ۠ۜۘۥ۬ۡۘۦۥ۫ۡۢ۬۬۠ۛۦۧۗۦۦۜۘۤ۫۠ۢۥۘۗۦۗۚ۬ۦۘۜۥۦۦۚۖۡۥۜۘۢۜۦۘۥ۠ۜۘۚۢۥۥۤۨۘ۟ۚۜۘۨ۬ۤۨ۫ۘ۬ۦۖۤ۬ۡۘۛۡۗۧۦۘۤۢۦۘۙۗۨۥ۫۠ۚۥۡۖۖۦۡ۬ۢۧۜۘۚۘۗ۫ۖۛۤۢۖۙ۠ۡۨ۠ۜۧۛۖۘۗۡۚۨۤۖۧۧۗۙ۬ۙۤۦۗۙۨ۫";
                    break;
            }
        }
    }

    static /* synthetic */ int access$900(Context context, int i) {
        String str = "۠ۧ۠۫ۦۨۘۥۨۤۚۢۜۡ۠ۡۘۧۜۢ۠ۗۜۘ۫ۥۛۛۜۥۡۡۗۙۡۖۘۛۡۧۘۜ۠ۘۘۥۢ۠ۦۢۡۘ۠ۧۙ۬ۡۜ۬۬ۜۜۧۗۡۘۜ۠ۙۚ۬ۜۘۛۢۛۢۛۜۧ۬ۙۘ۟ۤۤۙۦۘۛ۠۫ۤۖۜ۟ۗۤ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 517) ^ 675) ^ 690) ^ 362) ^ 318) ^ 388) ^ 391) ^ 454) ^ 932) ^ 811) ^ 617) ^ 298) ^ 479) ^ 107) ^ 80) ^ 96) ^ 296) ^ 418) ^ 196) ^ 227) ^ 423) ^ 304) ^ 914) ^ 458) ^ 588) ^ 190) ^ 144) ^ 0) ^ 455) ^ 948) ^ 63) ^ 1718615096) {
                case -1627120373:
                    str = "ۦۛۛۗۛۖۖۧۨۘۛۡۨۢۢۚۖۧۥۘ۠ۙۧ۟ۨۥۘۛ۫ۨۘۚۜ۟ۖۖۗۡۧۦۘۤۥۘ۟ۨۥۘۜۨ۠۬ۥ۠ۤۛۨۨۨ۬ۡۜۚۡۘۧۘۗ۟۠۬ۦۢۢۙۘۘ۟ۚۧۜ۬۠۟۫ۨۘۥۥۘۤ۬ۧۦ۠ۡۘۢۡۥۘۨۗۜۘۗۦۨۘۙۥۦۘۛۘۥۤۚۜۘ";
                    break;
                case -610746179:
                    return m80dp(context, i);
                case 1033470801:
                    str = "ۙۚ۠ۤ۠ۡۚۗ۬ۛ۬ۧۘۚۨۜۡۥۛۤۥ۠ۢۘۢۦۧۚۛۨۘۢۦۜۘۚ۟ۖۘ۬۫۬ۨۨۥۘ۫۟ۖۘۙۜ۠ۢۖۡ۠ۧۨۛۦۘۧۧۘۘۨۜ۫ۖ۫ۙۡ۬ۘۘۘ۬ۖۘۡۧۗ۟ۛۖۨۧۗۨۧۖ۟ۙۨۧۡۘ۟ۤۧ۬ۦۛ۬ۘۙۗۨۡۗ۟۬";
                    break;
            }
        }
    }

    private boolean checkSignature() {
        try {
            Signature[] signatureArr = getPackageManager().getPackageInfo(getPackageName(), 64).signatures;
            int length = signatureArr.length;
            int i = 0;
            while (true) {
                String str = "ۢۢۘۧۘۖۘۚۗ۫ۚ۫ۛۡۧۧۨ۬ۧۨۘۖۘۧۘۧ۬ۨۛ۠ۜۥ۟ۙۖۥ۬۠ۨ۟ۥۢۖۥۨۖۗ۫ۨۜۦۛۥۘۘۡ۫ۡۧۧۚۢۖۘ۬ۡۥۥۤۢۖ۠ۛۚۤۗۙ۬ۡۘ۫ۢۙۧۥ۬ۗۨۗۗۛۧۜۘ۫ۗۗۗ۠ۖۘۨۚۙ۟ۧۖۢۚۧۚۗۦۘۖۨۥۘۛۖۥۥۗۨۘ۟ۜۡ";
                while (true) {
                    switch (str.hashCode() ^ 169077628) {
                        case -1925990983:
                            return false;
                        case 392066100:
                            String str2 = "ۥۥۥ۫ۥ۬۬ۤۜۘۚۙۜۘ۫ۜۛۘۨۦۘ۫ۖۜۧۢۥ۬ۗۜۙ۟ۛۤۗۦۘۦۗ۟ۨۘۧۜۧۥۘ۫۬ۚ۬ۛۙۢۨۨۘۜۘۚۘۘۖ۠ۥۦۘۧۥۜۚۖۘۥ۠ۙۤۜۡۘ۠ۖۦۘۖۧۥۥ۫ۨۘۦۗۚۨۖۦۖۛۨۘۘۥۡۖۖۚۢۖۘۘۧۡۙۡۖۨۘۙۤۡۘ۫ۘۧۘۥۗۤۨۥۘۘۤۧۥۘۛۛۗۗۤۥۘۜۥۘ۠ۥۢ۬ۖۤ";
                            while (true) {
                                switch (str2.hashCode() ^ 1122128277) {
                                    case -944508787:
                                        str = "ۗۨۘۘۧۜۡ۠ۢۢۥۘۛۗۢۙۛ۟ۚۚۖۘۧۦۦ۟ۤ۫ۛۖۘۘۤۨۙۛ۟۬ۜۛۡۜ۬ۢۡۖۤۡۖۧ۫ۨۜۧۘ۟ۧ۬ۘۨۛۥ۫ۥۖۜۡۧۤۚۨۛ۬ۖۜۦ۠ۨۥۡۗۜۨۖۗۚۨۖۘۤۜۙۘ۟ۖۘۥۚۜۥ۟ۗۖۙ۟۫۠ۜۢۛۚۘۘۘۖ۠۟ۚۧۘۜۗ";
                                        break;
                                    case 1387339956:
                                        str = "۬ۡۛۖۙ۠ۗۙ۫ۖۧۘۢۡۚۨۙۚۙۚۖۗۙۗۥۘۙۛۙۢۛۥۘۖۥۖۜۨۙۖۘ۬ۧ۫ۨۘۗۨۘۘ۫ۚۘۘۖ۠ۤ۠ۥۘۘۛۥۘۜۘۥۢۗۘۧۨۦۧۡۖۦ۫ۘۘۧۧۡۗۥۘ۠۫ۢۤۜۚۨۚۧۗۚۨۘۘۧۗۖ۬۟ۦۤۙۘۦۧۧۘ۟ۘۙۤۖ۫ۡۥ۬ۜۙۚۦۘۧۡۜۘۨۗۡ۬ۜۡ۬ۧۡۜۢۙ";
                                        break;
                                    case 2051837367:
                                        str2 = "ۜۛۖ۟ۖۧۢۖۤۛۥۤ۠۬ۙۚۨۦ۠ۜۖۦۘ۬۫ۗۚ۟ۥۘۘ۠ۘ۬ۘۖۤ۠ۦۘۙۜۤۥۙۖۥۢۢۥ۫ۙۦ۟ۢۤۡ۬ۥۤ۬ۖۖۙ۠ۢ۠ۜۡۘۨۢۧۛۜۙۖ۟ۢۙۤۡۘۖۙۨۢ۠ۡۘ۫۟ۥۗۦۘۘ۬ۗۥۡۗۨۦۘۘۤۥۨۖۨۘ۟ۖۘۛۡۖۘۜ۫ۨۘ۬ۘۘۧ۠ۛۤ۫ۦ۬ۨۧۘۤ۬۬۠ۛ۫";
                                    case 2060234947:
                                        String str3 = "۬۟ۨ۬ۦۦۘ۠ۖۥۙۜۘۚۡۢۚ۟ۨۘۙۗ۠ۥۛۧۙۘۡۘ۬ۚۘۧۥۖۢۥۙ۠ۨۘۘۤۙۙۘ۟ۘۚۗۗ۫ۘۜۘۗۦ۬ۖۧۢۡۡۤۡۗۡۦۦۜ۬ۨۚ۠ۢۥۘۤۨۙ";
                                        while (true) {
                                            switch (str3.hashCode() ^ (-685201408)) {
                                                case -2070309201:
                                                    String str4 = "۟ۛ۠ۜۘۘۦۥۜۘۡۛۤ۬ۦۚۦۘۘۡ۬۫ۚۥۦۧۥ۫ۧ۫ۢۦۖۖۘۗ۫ۙ۟ۦۤۘۙ۫ۨۥۘۤۘۢۡ۫ۙۙۜ۠ۖۙۢۛۡ۟ۡۜۡۨ۫ۢۥۛۘۘۤۨۥۘ۟۟ۡ";
                                                    while (true) {
                                                        switch (str4.hashCode() ^ (-146661769)) {
                                                            case -1007413863:
                                                                str3 = "ۥۥۥۘ۫ۘۦۘۡۨ۫۠ۗۚ۟ۗۨۘۨۧۨۘۨۤۜ۬۬ۛ۠ۥۙۜۧۚۘ۬۠ۚۨۘۘۢۦۢ۟۟ۙ۠۟ۙۗ۠ۘۗۡۜۤۛۖۗۤۧۦۙۧۘۜۖۘۛ۠ۖ۠ۤۘۘۖ۠ۧ۬ۤۜۙ۫ۦ۬ۢۥۘۦۗۦۖۢۘۘۛۗۧ";
                                                                break;
                                                            case -922671666:
                                                                str3 = "ۙۙۧۚۦۜۥۚۡۤ۠ۨۖۡ۠ۦۤۜۘۤۚ۫ۨۖۗۚۙ۠ۥ۟ۚۜ۫ۢۗ۫ۜۢۜۘ۠ۘ۟ۥ۟ۜۡ۫۫۬ۦ۫۠ۖۗۥۘ۠ۗ۟ۛۨۜۘۚ۫ۗۜۙۛۗ۠ۘۚۗۧۜ۬ۢۥۦۨ۟۟ۨۘ۟ۦۖۘ۟ۜۨۗ۠ۗۨۜۙ۬ۚۦۜۡۚۨۡۘۙ۬ۥۘۘۛ۟ۚۗۨۘۖۘۖۘۜ۬ۧۧ۠ۡۛۥۘۘۦۡۧۘۢۗۥۗۨۥ";
                                                                break;
                                                            case -706798690:
                                                                String str5 = "ۚۖۦۘۛۗ۠۟ۜۜۘۚۘۧۘۛ۠ۥۦۛۚ۫ۜ۫۫ۢ۠۠ۦۘ۬۬ۨۘۦۥۦۛۡۘۧۚ۟ۜۢۖۘۦ۫ۘۘۦۦ۬ۨۦۢۜ۫ۥۘۜۦۨۘ۟ۨۢۖۥۨۦۗۛۧۙ۫ۚ۟ۡۘۢ۬ۨ۫ۦ۠ۖۘۡۖ۬ۗۜۘ۫۬ۛۨۙۦۥۡۘۘۢۢۜۘۧۢۜۗۡۦ";
                                                                while (true) {
                                                                    switch (str5.hashCode() ^ (-826483573)) {
                                                                        case -1265380037:
                                                                            str5 = i < length ? "ۡۢۗۨۚۢۙۡۦۘۛ۠۠ۧۛۜۢۚۦ۠ۛۗ۟ۜۧۘۗۘۙۛۥ۬۟ۚ۟ۗ۫ۨۙۢۘۚۦۘۧۢۘۛۘۦۛۨۙۧۜۖۧۤۡۚۖۨۜۦۘۧۛۡۘۖۨۖۖۛۥۥۖۙۡۥۘۛ۬ۦۘۙۙۥ۬ۢ۟ۥۧۘۢۧۖ۬۟ۥۘۦ۠ۥۘۤ۠ۘۘۡۘۘۘ" : "ۖۘۡ۟ۥۦۥۛۙۚۙۤۘۡۧۨۚۥۘۘۖۨۨۖۙۨۖ۟ۘۡۡۘۖۚۖۖۧۙۚۗۦۘۤ۠ۡۘۦ۬ۗۖۢۘۘۧۙۥۛۗۦۘۡ۟ۧۗۨۘۘۗۡۘۢۢۗ۫۫ۡۗۨ۫ۧۘۨۘ۫ۜۚۧۙۘ۠ۗۨۘۡۢ۟ۙ۫۠ۦ۠ۦۘۘۖۘۧ۠ۢۥۥۛۤۗۗ۫ۦۡۘۗۢۖۤۤۧۥۢ۟ۢۥۡۘ";
                                                                        case 546923630:
                                                                            str4 = "ۗۖۚۦ۟ۨۘ۬ۖۧۘ۠ۛۜ۠ۢۛۤ۠ۨۘ۠۠ۥۚۤ۬ۦۖۧۘۨۥۧۘۨۚۥۤۨۜۥۙ۬۬ۡۦۘۥۘ۫ۗۗۡۧ۫ۘۧۜ۬ۧۨۘ۟ۡۨۚۚۘۘۤۧۜۢۚۥۘۤۤ۫ۤۨۤۚۜ۟۟ۗ۟ۜۜۦۘۧۡۥ۠ۥۜ۬ۙۖۘۦۥۧۡۜۘۢۥۘۘۜۗ۫ۗ۬ۜۘۚۦۨ۠ۗ۫ۚۧۖۤۜۘ";
                                                                            break;
                                                                        case 603504459:
                                                                            str4 = "ۢۚۙۜۚۦۘۡ۬ۥۘۗۦ۠ۨۗ۟ۚ۟ۜۛۚۨۖۢۢۡ۠۫۠۠ۖۢۥۘۙۛۦ۟ۜۢۢ۬ۤۘۨۜۘۧ۬۟۟ۢۜۘۦۙۤ۫۠ۙۗۦۤۡۡۙ۠ۥۥۡۨ۫۟ۥۙۗ۠ۘۘۘۙۙۥۧۥۙۛ۬ۢۚۜۘۦۧ۟۬ۙۢۙۙۖۘۜۢۦۘ۟ۥۦۘۛۦ";
                                                                            break;
                                                                        case 1833067719:
                                                                            str5 = "ۥۙۨۘۨ۬ۘۖۡۤۧ۟ۘۛۨۘۢۛۛۨۘ۫ۛ۠ۙۖ۬۠ۚۥۘۡۤۦۦۥۗۢۗ۠ۨۢۗO۬ۤۡۘۜ۬ۜۘۧ۫ۤۙۙ۟ۦۥۚۦۛۡۛۤۗ۟ۢۨۘۢۘۜۘۙۛ۬";
                                                                    }
                                                                }
                                                                break;
                                                            case -531772648:
                                                                str4 = "۟ۜۜۘۖۢۘۥ۫۟۬ۖۧۥۘ۟ۚۨۘۚۚۙۛۢۛۡۜۜۛۦۡۖ۠ۥۘۚۥۨۘۘۤۖۘۘۗۘۘۛۖۥۤۚۧ۫ۜۚ۬ۢ۫ۧۧۜۢۛۨۖۛۜۙۦۘۥۧۗۡۧۧۙ۬ۜ";
                                                        }
                                                    }
                                                    break;
                                                case -1954000065:
                                                    str2 = "۠ۙۚۖ۠ۖۖ۠۠ۦۡۘۘۤۡ۠ۛۢ۬ۨۗۢۘ۬۟ۤۢۖۤۤۘۘۛۢۡۘۨۚۦۘۥۖۖۘۜۚۧۘۛۚ۬ۡۦۗۢۥۦۗۡۖۨۢۖ۠ۛۨۧۘۡۥ۟ۥۢ۫ۙ۠ۨۘۜ۫ۡۢۡۦۛ۫ۛۨۗۗۨۖۧۘۖ۬۟";
                                                    break;
                                                case 748227609:
                                                    str3 = "ۡۗۨۘۗۧۤۜۢۖۜۜ۬ۥۖ۬ۢ۫ۢۜ۟ۙ۟ۛۨۤۢۘۛۘ۬۫ۥۨۘۨ۬ۖۛۨ۠ۜ۫ۢۗۦۜۨۖۧۡۛۘۘ۬ۢۖۘۖۤ۠۬ۘۛۘۧۧۡ۫ۖۘۤ۟ۡۘ۫۟۬۫ۢۨ";
                                                case 1586282852:
                                                    str2 = "ۙۤۡۘۦۙۗۜۚۧۤۥۚۗۦۘۡ۟۠ۤۤۧۜۘۦۘۤۜۥ۫ۧۘۘۛۙۤ۠ۨۘ۬ۖۜۜۛۛۤۘ۠ۙ۟۟ۧۘۦۨۡۛۘۡۧۘۤۖۦ۟ۢۗۤ۟ۧۘۖۖۨۨۘۨۧۨۜۤۘۘۘۡۘۘ۟ۘۘۚۦ۠ۜۖۜ";
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                            break;
                        case 1898291689:
                            boolean equals = getSignatureHash(signatureArr[i].toByteArray()).equals(Deobfuscator$$app.getString(-3440729147828952905L));
                            String str6 = "ۧۖ۠۫ۥۡۤۚۖۘۜۦۧۘۤۗۡۖۖۚۘۘ۟ۢۤۖ۫ۚۗ۫ۥۘۢۡۥۘۖۢ۠ۛۧۗ۟ۦۚ۫ۗۥۢۖۜۛۥۘۡۛۖۘ۫ۜۢ۠ۢۜۘۨ۫ۦۦۤۨۖ۠ۗۧۨۘۘۧ۬ۦۘۧۢۚ۠ۦۦۘۛۙ۫ۘۙۦۥۙ۠";
                            while (true) {
                                switch (str6.hashCode() ^ (-555163518)) {
                                    case -1257929250:
                                        return true;
                                    case -985953202:
                                        break;
                                    case 1446554943:
                                        String str7 = "ۖ۬ۤۗۤۖۥۦۖۘۚۨ۫۫ۨ۟ۧۧۛۛ۬۟ۧۗۤۜۘۖۖ۬ۨۢ۫ۤ۠ۦۧۛۦۘۦۤۥ۠ۥ۠۠۠ۖۖۧۙۙۙۧۦ۠ۛۗۙۚۡۛ۟ۤۘ۟ۖۤۜۡۙ۟ۗۥۡۘۡۙۥۘۢۡۡ۟ۨۥۡۗۡۧۛۜۛۥۦۘۖۙۚۘۦۗۖۤۨۘۧۜۖ۬ۜ۫ۢ۬ۘۘ۫ۖۘ۠۬ۗ۠ۡۜۘۚۦۚۛۤۘۙۛۡۘۗۨ۟ۖ";
                                        while (true) {
                                            switch (str7.hashCode() ^ 930201770) {
                                                case -1939160954:
                                                    str7 = "ۤۜۡۥۜۜۘۙۙۢۢ۟ۨۧۙۛۚ۬ۡۘ۫ۢۜۦ۟ۙۧۛۛۘ۠ۢۙ۠۬ۙۢۖۘۥۗۘۘۛۤ۠ۜۥ۫ۙۘۨۘۤۖۖۘۤۗ۬۠ۢۨۖ۠ۘۡۤۡۙ۫۟ۛۢۚۜۡۧ۫";
                                                case -958878214:
                                                    str6 = "ۦۗۖۘ۬ۤۧۖۘ۟ۨ۫ۤۤۧ۠ۚۜۙۢۙۦۘۙۢۤۚۨۧۘۤۜۗ۠ۢۚۡ۫ۡۛۢ۠ۦ۠ۤۘ۬ۧۘۘۗۡۧۨۧۜۜۛ۠۟ۢۛۦۘ۫ۥۨ۠ۡۛۗۥۨۘ۠ۥ۫ۜۖۢۙۥۛۡۨ۠ۢۙۨۙ۟ۙ۟ۘۘۛۢۛۜۢۚۙۡ۬ۧۛۜۘۡۦۢ";
                                                    break;
                                                case 961572203:
                                                    str6 = "۬ۙ۠ۛۢۢۥۘۘۛۤۖۖۘۘۚۥۦۘۛ۠ۢۛۙۧۧ۫۟ۡۖۗۢ۟ۦۘۦۤۜۡۖۢۤ۬ۘۦۡۡۨۙۡۘۗۤ۠ۜۜۘۗ۟ۚۛ۟۫۬ۜۧۖ۠۟ۛۧۗ۬۬ۥۥۖۤ۠۠ۗۛۤ۫ۤ۫۫ۛۗ۠ۜۨۨۥۛۦۜۘۧۡۘۢۚۘۢۜۨۘۤ۟ۜۘ۬۟ۧۢۘۦ۟ۡۥۨ";
                                                    break;
                                                case 1422229360:
                                                    String str8 = "ۤۢۚۥۙۥۘۖۛۦۘۡۘۡۘۖۜۗۧۗۚ۠ۗۛۥۧۡۤۨ۫ۥ۫۫ۤۗۙۤۖۥۘۗۖۖۦۖ۫۠ۛۜۚۜۥۘۜۡۖۖ۬ۡۘۜۦۢۗۥۤۥ۫ۜۧۦ۫ۧۙ۟ۗۚۨۨۧ۠۟۟۠ۘۖۖۙۥۧۢۡۜۜ";
                                                    while (true) {
                                                        switch (str8.hashCode() ^ (-541695227)) {
                                                            case 339766626:
                                                                str8 = "ۚ۫ۛۦۥ۬۫۫ۥۘۤۨ۬ۜ۫ۤۨۨۨۘۖۗۘۖۨۥۘۘۘۜۦۥ۫ۚۢۥۘۨۙ۠ۗۛۥ۫ۜ۫ۘۖ۟ۛۧۤ۫ۧۘ۟ۦۘ۫ۚۜۘۦۨ۫۟ۨۡۦۤۚۨۗۖۙۜۘ۠ۜۗۜۡۦۘۜۨۙۢۢۧۢۡۥۘۗۛۤۛۙۦۜۛۘۘۡۡۦۨۛۥۘۖۦۛ۟ۙۚۜۖۜۘۗۡۜۜۨۚۧۖۢۧۧۨۘ۫ۘۖۚۥۙۛۗۤ۟ۡۡ";
                                                            case 748292420:
                                                                str7 = "ۥۜ۬۬ۧۙۗۤ۫ۖۘۧۘۜۨۛۢۢۖۨۙۡۘۦۧۤۘۧۢۛ۫۫۟ۦ۟ۥۙ۫ۛ۬ۚۤۜ۬۟۬ۢ۬ۥۜۧۢۢۨۡۤۥۦ۬ۤۦۚۚۙۥۖۘۤۘۛ۠ۦۨۛۦۚۘۙۛ۟ۡۥۜ۬ۖۘۢۚۙۖۢۤۗۨۦۘۡۢۡۚۘۢ۟ۛۥۚۚۜۘۦۜۥ۟۬ۥۜۡ۠ۨ۟ۧۜۦۗ";
                                                                break;
                                                            case 878682860:
                                                                str7 = "ۥۜ۫۟ۤۥۘۛۖۖۖۧۡۘۦۗ۬ۘۜۨۚ۟ۜ۟ۢۨۧ۬ۨۢ۟ۚ۟ۡۘۤۚ۠۟ۨۦۨ۫ۖۖۜۛۥۖۙ۬ۛۦۢۤۥ۫ۖ۬ۧۤۜۘۡۘۦۙۧۦۘ۬۠ۘۘ۫ۥۡۘۜۜۛۗۚۘۨۨ۫۬ۧۢۦ۟ۦ۫۬۬ۧۨۦۘ۠۠ۘۚۛۛۙۙۜۘ";
                                                                break;
                                                            case 1320985839:
                                                                String str9 = "۟ۧۚۙۖۨ۫ۨ۟ۗۙۦۤۥۛۢۛ۟ۗۗۚۤۛ۫ۤ۠ۚۡۨۘۚ۬ۘۘۘۥۦۜۖ۬ۗۛۗۖۗۨۡ۬ۡ۬ۘۥۥ۬ۛۚۤ۬ۦ۠ۥۧ۟ۢۢۧۘۙۢۡۖۛ۟۫ۦۘۖۡۢۢۗ۬ۚۥ۠ۧۙۖۘۚۢۨ";
                                                                while (true) {
                                                                    switch (str9.hashCode() ^ (-2036685795)) {
                                                                        case -893230634:
                                                                            str8 = "ۗ۟۠ۡۘۢ۠ۜۙ۫ۨۘۢۜۘۨۤۤۨۡۤۛۦۦۘۜۡ۬۬ۗۜ۬ۨۧۗۛ۠۬ۢۧۖۤۜۦۖۘ۟ۛۨۘۚۨ۠ۛۙۥۘۦۡۘۤۡ۠ۖۨۖۨۤۙ۠۠ۙۢۢ۟ۗۨۤ۬ۧ۟۬ۥۡۡ۫ۘۡۘ۬ۖۡۘۜۦۜۘۜۡۘۛۚۦۘۜ۬ۤۧۜۘۚۜۖۘ۬ۦۘۘۥۛ۬ۛۖ۫۫۬ۥ";
                                                                            break;
                                                                        case 40392671:
                                                                            str9 = "ۧۢۢۙۦۛۙۙۜۢۢۖۘۗۖۘۘۙۜۡۗۥۧ۬ۜۡ۫ۛۛۦۥۦۘۘۥۖۘۨۡۢۧۘۗۙۥۖۢۤۡۘ۠ۙۖ۟ۘۥۜ۟۠ۚۛۥۘۤ۠ۤۗ۠۫ۡ۬ۨۘۥۧ۫ۘۨۙ۫ۚۜۘۙۚۗۛۥ۟ۙۚۜۘ۠۠ۤۜۜۘۨۨۘۙۤۦۘ۟ۡۗۥۥ۟ۨۤۜۗۚ۫ۧۦۘۨۜۦۧ۠ۡ۫ۢۡ";
                                                                        case 428653621:
                                                                            str8 = "ۚۦۖۘۤۧۗۧۘۗۢۡۧۙۘۘ۟ۢۛۗۘۡۘۗۢ۟ۖۦۛۧ۬۫۠ۥۢۚۧۚۤ۬ۦ۠ۖۘۘ۟ۢۗۡ۠ۚۘۤۖۘ۠ۜۙۘ۟ۤۚ۠ۖۨۦۘۡۢ۟ۖۤۜۘۘ۠ۦۧ۟ۦۘۚ۬۬ۦ۬ۙۘ۠ۖۘۚۛۜۘۛ۬ۙۘۨۘۘۧۡۨ۬ۙۘۘۘۡۡۧ۬ۖۘ";
                                                                            break;
                                                                        case 981207487:
                                                                            String str10 = "ۢۢۧۜۥۘۖۥۖۛۡۘۙۛۡۘۦۨۨ۬ۚۤۙ۬ۙۧۡۖۥ۟ۨۘ۬ۙۢۗۦ۬۠ۥۧۘ۟ۦۘۗۛۚۘۚۡۤۥۦۘ۫ۙۛ۫۟ۖ۬ۙۜۡۚۚۨۥۗۨ۫ۨۘۘۚۨۢۨۚۤۥۖ۟ۘۘۜۗۥۘۜۘۤۨۧۨۘ۬ۡۢۖۚۖۘۢۢ۠ۛۢ۠۬ۖۦ";
                                                                            while (true) {
                                                                                switch (str10.hashCode() ^ (-1334198447)) {
                                                                                    case 236944595:
                                                                                        str10 = "ۖۡۛۧۘۜۘۙۧۥۥۡۙۥۦۡۖۤۡۘۘ۠ۖ۠ۘۢۘۢۘۜۦۜۖۙۗ۬ۗۨۗۘۡۚ۠ۡۛۡ۫ۛ۟۬۠۬ۛۛۢ۠۟ۡ۫ۧۗۥۗ۠۬۟ۗۦۜۖۜۦۡۘۡۦ۠ۛۖۨۘۘۖۥ۫ۜۤۢۙۡ۟ۧۚۙۡ۫ۥۙۙۛۖ۟ۖۥۘۛۖ۫ۡ۠ۦۘ۟ۥۤۛۖۨۘۚۦۜۘۖۥۗۤۤۘۘۥۛۛۥۘۜۘۖۗ۬ۗۢۦ";
                                                                                    case 870310777:
                                                                                        str9 = "۠ۦۧۘۜۖۜۘۙۢۖۥۖۨۚۦۘ۬ۖۘ۬ۘۜۦۥ۬ۥۧۡۙۘۦ۠۠۟ۛۘ۟۬ۢ۠ۚۘۧۜۦۘۥۨ۬ۨۨۡۘۚۘۢ۬۫ۢۛۛۖۚۦۗۢۧۨ۬ۤۡۘۛۙۦۘ۠ۛۙ";
                                                                                        break;
                                                                                    case 1070345823:
                                                                                        str10 = equals ? "ۖۘ۟ۙۡۘۤۤۦۦۗۥۗ۫ۛۤ۠ۨۦۘۥۢۜۘ۫ۜۡۙۚۜۘۡۘۘۦۢۙۜۡۘۧۜۧۢۤۖۘۤۡۘۘۜۛۢۖ۟ۦۙ۬ۘۙۤۜۘۙۧ۬ۨۖۦۢۨۨۘۖۤۘۛۗۜۘۢ۠ۦۘ۠ۙۨۘۧۜۜ۠ۥۜۨ۠ۛ" : "ۤۘ۬ۧۨۤۘۢۤۖ۠ۗ۬ۖۢۚۦۘۘۧۡۧۦۤ۠۠ۤۗ۫ۛ۫ۘۖۘۡۢ۟ۡۘ۟ۥۘۧۦۗۥۙۡۘۢۘۥۘۧ۟ۜۚۜۜۘۥۜۘۘۘۧۘۨۘۘۜۥۙۦ۬ۡۘ۠ۤۧۙۨۜۧ۟ۦ۬ۗ۟ۜ۠ۥۛۢۥۨ۫ۜۘۜۦۨۦۖۧۘۛۡۘۥ۫ۛۨ۬ۥۗۜۢۨۙۡۘۥۦۘۦۥۡۗۚۧۙۘۧۡۜ۫ۤ۟ۜۘۘۘۡ";
                                                                                    case 1908250695:
                                                                                        str9 = "۠ۤۥۡۦۥۘ۬ۘۧۘۥۛۧ۬ۖ۠ۢۡۛ۬ۜۡۘۖۧۖۘۡۡۘۘۢۛۗۗۥۤۤ۬ۛ۬ۚۖۘ۬ۤۥۘ۠۟ۦۢ۠ۖۘۨۡۜۘۖۧۡۘۛۧۨۘ۫ۡۜۛۘۥۖۡۗ۠ۧۦۘۢۡۥۥۘۛ۫۠ۖۡۜۘۦۧۦۥۚۡۜۘۥۜ۬ۜ۟ۙۙ۠ۖۦۖ۬ۚۘۡۥۗۦۜۘۚ۟ۜۚۗۥۚۖۘۡۨ۠";
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
                                            }
                                        }
                                        break;
                                    case 1796968492:
                                        str6 = "ۡۤ۠ۙۢۨۖۨۚۚۤۦ۬۟ۗ۠ۧۥۚۚۥۙۡۘۘۥۛ۠ۥۚۥۚۘۚۜۚۥۚۖۘۧۧۛۖ۫۬ۦۖۖۘۤۚ۬۟ۛۚ۬ۡۡۘۘۗۘۘۤۘۚۗۧۖۘۜ۠ۢۗۦۤۦ۫ۛۖۙۤۡۚۜۦۥۙ۟ۨۘۢۖ۫ۘۛۘۙۜۤۗۖۜۘۗۢ";
                                }
                            }
                            break;
                        case 2137067626:
                            str = "۫ۖۘۙۤ۟ۖ۬ۡۘ۟۬ۥۘۡۨ۫ۦۛۢۛۛۦۘۚۙ۠ۧۙۘ۫ۘۥۘۨۤۨۛۨۘۥۜۘۘ۬۟ۦۘۨۘۘۤۡۦۘۙۥۦۤۜۜۘۖۡۚۖۚۘ۟ۧۛۡۜ۠ۥۗۛۧ۬۠ۜۤۡۘۛۡۤ۠ۙۡۛۥۤۜۖ۟ۨۖۛ۟ۥۦۙ۬ۘۘۤۧ۟ۧۤۖۘ۬۟ۡۡ۫ۜۘۜ۬ۘ۠ۜۜۘۗ۠ۜۘۥۙ۬";
                    }
                }
                i++;
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: dp */
    private static int m80dp(Context context, int i) {
        float f = 0.0f;
        String str = "۫ۖۥۢۡۛۚۧۙ۫ۘۚۖۘۘۚۖۙۖ۫۟۫ۡۡۘۙۦۤۜۧۘۢۥۨۘۧۢۘ۫ۖ۠ۙۙۖۥۡۢ۟ۡۢۗ۠ۙۦۤۡ۫ۚۦۨۗۡۘۧۧۜۨۛۜۘۡۙۙۜۛۘۖۙۤ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 105) ^ 40) ^ 914) ^ 719) ^ 391) ^ 431) ^ 418) ^ 78) ^ 906) ^ 799) ^ 390) ^ 668) ^ 283) ^ 21) ^ 804) ^ 80) ^ 16) ^ 893) ^ 649) ^ PointerIconCompat.TYPE_HAND) ^ 747) ^ 985) ^ 75) ^ 234) ^ 363) ^ 33) ^ 442) ^ 391) ^ 128) ^ 109) ^ 889) ^ 30352066) {
                case -1220590368:
                    str = "ۖ۟ۦۛ۟ۥۖۛ۫ۙۨۘۘۖۜۗۤ۬۬ۚ۠ۙۨۥۙۚ۫ۨۘۤۦۘۧۜۛ۫۫ۦۘۧۢۨۘ۫۬ۙۤۦۡۥۦۘۤ۬ۡۚۢۦۘۧۖۘ۠ۖۘۤ۟ۦۚ۟ۜۘۜۧۚۖۛۧۡۚۤ";
                    break;
                case 698994423:
                    str = "ۜ۫ۚۙۙۗۦۢۗۜۘۖ۟ۜۡۚۧۥ۫ۛۗۜۡۦۖۙۖۗ۟ۥۛۖۛۦۘۙۖ۬ۜ۟ۦۦۘۛۨۡۤ۠ۚۖۨۘۙۦۚۦ۫ۨۘۚۗۛۤ۟ۖۥۡ۬ۦۗۖۘۗۚ۟";
                    break;
                case 1131802541:
                    return (int) Math.ceil(i * f);
                case 1904857618:
                    f = context.getResources().getDisplayMetrics().density;
                    str = "ۨ۠ۦ۫ۢۖۘ۟ۨۘۤۨۘۘۤۖۨۘۗۛۖۘۦۥۡۘۖۦۚۙ۬ۘۘۨۥۤۖۗۡۖۡۧۘۡ۫ۖۘۛۚۘۚۘ۟ۢۤۘۧۜۘۛۖۤۨۧۖۜ۠ۦ۟ۦ۟ۧۨۧۘۡۡۜۘ۠ۡۢۖۡۖۦۘۜۖۘۘۖۚۖ۬ۘۘۤۥۦۘۧۨۜۘۘۖۖ۟ۤۘ۟ۗۡۘۘ۫ۦ۟ۡۘۦۦۨۘ۠ۤ۬ۙ۫۠۫ۨۗ";
                    break;
            }
        }
    }

    private void enableNavigationButtons() {
        MaterialButton materialButton = null;
        String str = "ۧۜۧۘ۫ۗۘۘ۫ۧۚۚۛۖ۠ۥۗۤۗۡۘ۫ۗۥۘ۟۠ۚۥۚ۬۠ۧۦۢ۫ۧ۠ۡۢ۠۬۟ۢۦۚۜۛۨۘۛۜۜۨۜۦۛۙۘۘۥۧۗۦۧۙ۠۫ۘۘۛۗۥۘۦۛۦۛۤ۬ۜۨۖۨ۬۫ۙۤ۠ۥۘۦۖۙۘۗ۫ۤۘۤ۠ۥۢۦۘۤۥۦۘ۬ۙۘ۫ۦۧۘ۟ۡۥۥۜۢۨۥۗۦۗۖۘۥ۟ۜۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 803) ^ 502) ^ 860) ^ 497) ^ 202) ^ 407) ^ 758) ^ 408) ^ 692) ^ 464) ^ 202) ^ 152) ^ 35) ^ 207) ^ 310) ^ 636) ^ 946) ^ 286) ^ 772) ^ 807) ^ 591) ^ 103) ^ 830) ^ 820) ^ 563) ^ 214) ^ 909) ^ 267) ^ 279) ^ 851) ^ 441) ^ (-1545208649)) {
                case -1249731099:
                    materialButton.setEnabled(true);
                    str = "ۦۧۥ۟۫۫ۤۛۗ۠ۨۘۗۛۗۥ۬ۘۚۘۚ۟ۗۡۜۥۨۦۡۥۘۨۜۘۡ۟۟ۛۛۦۢ۫ۜۘ۠ۙۢۧۛۜۨ۠ۜۥۤۘۢۧۖۤۖۥۘۜۛۤ۠۬ۘۘۤۖۚۡۥۘۥۢۜۘۡ۟ۖۜۧۖۘ۠ۛ۫ۦۤۡۢۡۥۘۨ۬ۨۘۨۙ۟ۜۚۦ۠ۗۦ۟ۢۙ";
                    break;
                case 29821315:
                    str = "ۤۢۘۘ۟ۤۥۘ۬ۗۤۢ۬۟۠ۥۦۗ۫ۡۚۗۜۢۦۖۛۦۘۖ۬ۦۘۚۦۦۜۨۧۘۦۜۛۙ۠ۘۘۛۜۘۘۜۡۚۦ۬ۦۘۨۡۧ۬ۗ۠ۙۨۨۘۧۤۜۘۢۦۥۘۛۜۦۘۛۚۚۡۥ۫ۙۚۖ۠ۚۦۘ۬ۚۨۥ۠۬ۢۨۥۘۨۨ۫ۚۢۦۘ۬ۖۛۚۗۖۘۛۛ۟ۨۙ۟ۙۡۚ۠ۛۖۘۛ۠ۙۢۦۧۘۛۛۢۜۛۥۘۧۥۥۘۘ۫ۜۥۢ۠";
                    break;
                case 390516427:
                    return;
                case 579169360:
                    String str2 = "ۦ۬ۚۚۜۙۡۨۚ۟ۨۧۤۚۥۨ۫ۗ۬ۗۢۥۨۗۥۛ۠ۤۜۦۘۡۦۚۜ۠ۦۘۦۥۧۢ۬ۚۧۗۤۜۡۦۚۛۜ۬ۗۚۚ۟ۥۨۧۘ۫ۘۧۜۚۨۗ۫ۢۦ۫ۦۘۨۙۦ۫ۜۢۢۡۦۘۡۦۢ۬۟۬ۦۡۡۘۤۡۧۘ۟ۙۡۦ۬ۨۘۨۚۢۦۥۢۢۧۘۘ۠ۜ۬۟ۖۨۘۖۚۨۛۦۤ";
                    while (true) {
                        switch (str2.hashCode() ^ 986862072) {
                            case 217171636:
                                String str3 = "ۘۡۘۚۢۜۘۖۦۘۤ۠ۖۨۡۦۙۡۖ۠ۡۦۗۛۡۘۖ۫ۥۥۢۨۘۨۧۡ۫۬ۛ۠ۧۗۖۗۤۜۤۨۘۦۗۙۨۜۘۘۢۢۘۘۖۘۗۘۛۖۡۥۖۖۛۗۨۖۧۘۘۢۦۨۢۤۡۙۜۤۡۨۧۜۥ۫ۘۖ۟ۨۨ۠۬ۥۧۘۡ۬ۖ۟۟ۛۚۦۡ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-387937142)) {
                                        case -2104524640:
                                            str2 = "ۤۙ۫ۖۛ۠۠ۦۖۨ۟ۛۛ۬ۦۥۨۨۦۛۥۘۘۛۜۘۢۚۢ۠ۤ۬۟ۥۘۢ۫ۖۡۙۥۘۦۙۦ۟۫ۘۦ۬ۨ۬ۧۦۚۦۧۛۡ۠ۥ۬ۘۤۗ۠۠ۧۧۥ۫ۜۘۧۡ۠ۨ۬ۜ۫۬ۢۛۨۨۗۧۘۘ۠ۥۢۧۥۚ";
                                            break;
                                        case 65329715:
                                            String str4 = "۠ۙۗ۬۬ۘۘۢۚۛ۠ۜۦۤۦۥۤۘۨ۬ۛۖۜۢۙ۫ۧۦۘۛ۫ۘۧۤ۫۟ۘ۠ۢۨۡۘۖۨۗ۫ۛۤۤۖۖۘۧۡ۫۟ۤۛۖۚ۬ۘۙۡ۠ۙ۫۠ۨۘۙۡۗۚ۫۠۫۫ۘۜۘۨۘ۫ۚۘۘۛۧۘ۠ۚۧۡۧۥۨۖ۬ۘۧۙۖۚۛ۫ۘۘۥ۫۫";
                                            while (true) {
                                                switch (str4.hashCode() ^ (-1289818119)) {
                                                    case -650081936:
                                                        str3 = "۬ۧۗۤ۠ۘۘۥ۟ۧۛ۟ۖۘۙۙۖۘۜ۠ۡۘۘ۬ۥۘۛۘۦۜ۠ۨۘۧۢۥۤۢۛۦۨۧۘۥ۬ۗۦۛ۬ۤۨۡۘۜۢۛۘ۠ۡۘ۬ۡۚۧۥۖۜۙۡۚۘ۠۬ۤۨ۫ۙۖۨۗۛۧۗۡۤۡۚۙۨۙۖۦۥۘ۟۬ۢ۠ۧۗۛۢ۠ۥۦۦ۟ۛۖۨۡۡۖۖۖۘۡ۬ۙۤۢۦۘ۠ۗۜۘۙۡۜۘۛۡۧۘ۬ۘۤۢ۬۟ۦۛۗ۠ۖۜ";
                                                        break;
                                                    case -364267445:
                                                        str4 = "۟ۤۤۡۨۤۦ۬ۧۤۛ۟ۡۜۘ۠۫ۚ۟ۡۧۜۖۘۘۘۧۘ۬ۖۛۨۚۥۡۙ۟ۢۨۖۚ۟ۜۘۜۛۨۘۡۡۗۤ۠ۘۘۤۦۥۦۡۦۘ۟ۙۘ۠ۛۦۘۗۨۨۨۦۘ۟ۜ۠۠ۘۘۘۗۨۥۤۘۘ۟ۡۧۘ۟۠ۛ۫۟۫۬ۛ۟۠ۙۤ۟ۨۘۘۗۧۗ۟ۥ۬";
                                                    case -227326601:
                                                        String str5 = "ۦۖۘ۟۟۟ۜ۫ۚۡ۫ۤ۟ۘۡۤۦۙۚۨ۟۠ۧۖۘۗۢۨۘ۠ۗۘۘۚۧۢۜۡ۬۫ۙۨۚ۬ۦۛۚۜۘۗ۟ۧۛۚۛۚۦۧ۟۠ۨ۟ۨۧ۟۟ۨۗۥۡۙۤ۫ۢۢۖۨ۠ۖۥۗۗۘۢ۬ۚۜۨۙ۟ۘۘۧۖۖ۠ۗ۟ۦۧۢۨۡۘۚۘۗ۬ۖ";
                                                        while (true) {
                                                            switch (str5.hashCode() ^ (-2047763554)) {
                                                                case -2024604247:
                                                                    str5 = "ۛۗۜۖۛۛ۫ۚ۬ۘۘۥۡۚۙۧۜۡۗۨۡۥۡۘۨۥۜۤۚۡ۬ۘۘ۫ۢ۫ۜۥۚۘ۟ۛۢۗۤ۬ۖۙۦۧۘ۟۟ۥۨۤۡ۫ۜۗۙۨۗۡۦۘۗۘۘۘۧۙۨۧۥۧۡ۠۫ۗۚۗۘۦۨۘۙۛۥۘۗۧۢۥۛۥۥۥۦۘۛۦۧۘۘۦۤۨۚۛ";
                                                                case -1556625878:
                                                                    str4 = "ۦۡۚۨۖۡۘۘۥۨۚۖۡ۬ۨۘۗۗ۬ۨ۬ۥۥۘۧۦۨۦۛۢۥۙۢۡۜۚۥۖ۟ۥۧۚۤۗۤ۫ۗۚۙۤۥۙۛۛۛۜۜۧۙۨۘ۟ۜۘۡۛۨ۫ۗۙۗۙۦ۟ۢۡۤ۟۟ۢۨۜۚ۫ۗۚۨ۠ۧۡۘ۠۟۫۠ۧۚۘۡۘۘ۬۬ۤۧۤۖۥۡۨ۫ۦ۫۬ۜۛۤ۠۟ۡۘۢ";
                                                                    break;
                                                                case -1126813787:
                                                                    String str6 = "ۚۡۡۘۚۦۤ۫ۢ۠ۘۨۗ۠ۙۖۘۥۙۦۘۤۡۧۘۖ۬۫ۖۚۜۗ۫ۚ۟ۘۤ۬ۦۦۘۚۚۡۘۧۙۜۘ۫ۢۤۧۤۤۧ۠ۢ۠۬۫ۥۨۜۘ۠ۨۗۢ۫ۚۥ۫ۜۘۦۗۦۘۚ۫ۙۢۗۥۛۥ۟ۙ۫۬ۘۥۦ۫ۗ۬ۖۡۜ";
                                                                    while (true) {
                                                                        switch (str6.hashCode() ^ (-485882331)) {
                                                                            case -881328640:
                                                                                str6 = "ۥۤۥۖۖۢۨۧۦۧۦۖ۬ۖۘۤۧۖۘ۬ۢۥ۟ۘۖۧۢ۬ۘ۫ۥۘۨۧۢ۫ۜۘۗۛۘۘۜۧۨۘۙۜ۫۫ۡۥۛۜۖۛۨ۟ۙۡۢ۬ۤ۟ۖ۠ۢ۠ۥۡۘۚۧۦۘۛۜۙۖۨ۬ۗۛۛۢۤۛۗۧۡۥ۫ۨۘ۟ۘۦۛۦۧۤۨۜۛۥۧۤۙۜۘۦۥۧۘۘۥۦۨۡۘۦ۠ۘۘۢۨۧۘۡ۫ۧ";
                                                                            case -737036850:
                                                                                str5 = "۫۬ۛۜۚۜ۟ۛۧۦۖۜۘۙۨۛۘۨۥۘ۟ۨۢۨۢۡ۬۬ۖ۬ۨۘ۟ۗۚ۬ۘۦۛۤۦۘۡۘۘۘۛ۟ۡۘۦۙۗۛ۬ۢۗۗۛ۟ۚۥۚۨۘۡۨۥۘۧۢۥۥۜۦۙۚ۟ۙۥۤۙ۫ۖۘ۠ۦۥۛۨۙۙ۟ۥۘۧ۠ۦۘ";
                                                                                break;
                                                                            case -394174436:
                                                                                str5 = "۟ۗۥۖۨۥۘ۬ۡۘۙۘۦ۟ۨۖ۬ۖۤ۫ۦ۬۟۬ۦۧۚۘۤۧۘۨۤ۫ۦۡۘۙۜۧ۬ۦۧۨۘۤ۬ۗ۫ۖۜۘۢ۬ۡۘ۟ۦۘۙۡۘۚ۬ۨۜۜۘۢۢۦۘۜۦۤۙ۠ۡ";
                                                                                break;
                                                                            case 1874622626:
                                                                                str6 = this.updateCheckComplete ? "ۖۨۡۘۧۘ۬ۙۡۨۘۡۥۨ۟ۙ۟ۡۦ۟ۡۙۢۡۙۖۦ۠ۥۜۡۘ۟۠ۖۡۛۦۘۙۦ۫ۛۢۛۜۖۨۘ۫ۜۘۜۧۢۘ۫ۚۨۚ۠ۧۖ۬۬ۗ۫ۚۖۜۘۜۚۢۧۨ۫ۘۢ۬۠ۘۗ۫ۦۘۖۤ۫ۧۨۦۥ۠۠ۛۤۧۥۗۨۘ۟۬۫ۥۨۜۘۨ۟ۜۘۡۗۢۧۡۤۡ۫ۚۥۘۚۥۦۖ" : "ۚۜۗۖۜۖۢ۫ۧ۠ۘۨۘۧۛ۠۟ۨۢ۟ۖۢۧ۫ۖۘ۫ۢۡۥ۫ۨۡۤۥۜۗۙۦۖۤۧۛ۫ۨۙۛ۟ۜ۫ۖۤۡۘۘۥۡۗۛۧ۠ۖۡ۟ۢۡ۠ۦۦۢۦۨۘ۟ۤۗ۟۟ۖۘۗۘۙ۠ۧ۟ۙۜۗۧ۠ۦۘۚۗۜۗۜۨۘۗۡۧۘۛ۫ۙۚۥۧۘ۟ۧۙ۟ۖۘۗۡۦۘۛۨۨۢۢۙۢۘۡۘ۫۟ۡۘۡۦۦۘۘۙۗۤۘۖۘ";
                                                                        }
                                                                    }
                                                                    break;
                                                                case -768839082:
                                                                    str4 = "ۥ۠ۖۘۛ۟ۚۜ۠ۧۤ۠ۖ۠ۨۖۧۗۚ۟ۗۛۛۙۧ۬ۢۨۛۨۘۥ۬ۥۘۙۢۡۧ۟ۜۘۦۛۛۖ۫ۨۙۡ۫ۘۘۥۡۘ۟۬ۤۚ۟ۘۗۡۧۖۥ۠۟۟ۘۘ۫ۡ۟ۗۥۗۙ۬ۙ۫ۨۡۘ۬ۖ۟ۜۘۢ۫ۨۤۥۘۨۘۨۥۖۘۦۘۜۘۧۨۚۡۛۙۡۚۨۘ۟۠ۡۖ۠ۨ۟ۖ۠ۤۛ۬ۢۤۘۘۛ۫ۖۘۛۘۡۘ۠ۛۡ۟ۤۜۘ";
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 684688196:
                                                        str3 = "ۚۚۗۧۨۢۙ۫۟ۨۦۖۙۤۨۜۦۘ۟۫ۦ۟۬ۧۡۙۥ۫ۚ۫ۧۥ۠ۦۘۙۚۜۜۗۦ۫۟ۘۡۙۤۤۨۨۘۡ۠ۚ۫۫ۚۗۙۡۥۛۨۘۦۘۥۘۡ۫ۡۜۙۦۘۗۚۢ۬ۗۢۥۙۦۘ۬ۙۨۘۚۘۙۜۡۙۜۚۙۚۤۡۘۖۘۘۘۚ۠۫ۢۙۧۡۧۦۘۤۧۘۘۡۘۦۘۢۧ۬ۧۘۖۘۗۜۨۡ۬۠ۚۚۛ۠ۨ۫ۥ۬ۖۘ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case 385008480:
                                            str3 = "ۦۦۛۧۘۜۘ۠ۥۜۘۤۗۨۘۙۧۥۨ۬ۥۘ۟ۜۛ۫۟ۢ۬۟ۘۧۚۥۘ۫ۤۛۦۨۧۘۙ۟ۚۨۙۛۗ۟ۦۘۢۚۥۘۚ۠ۘۛ۟ۦۥ۟ۤۖۦۘۜۨۥۗ۠ۖۘۖۖۨۛۘ۟ۛۛ۟ۖ۠ۗۚۗۢۤۥۗۙۢۦۙۥۥۘۥۙۡۘۘۛۤۨۤۨۘۢۥۘۧۚۜۚۗ۬ۡۖۖۗ۬ۦۘۧۚ۬۠ۛۚ";
                                        case 1937995131:
                                            str2 = "۠ۜۢۗۙۧ۬ۘۤۡۨۨۘۚۧۚۧۗۖ۠۫ۦۤۦ۟ۛ۬ۘۘۦۚ۟ۖۥۚ۠ۚۤ۠ۘۘۤۥۦ۬ۗۦ۠۟ۙۢۡۡۘۖ۫ۡۨۜۙۗۡۦۢۛۚۖۨۗ۫۬ۖ۠ۤۦۥۙۘۘ۟۫ۘ۫ۢۤۦۥۚۨۨۜ۬ۤ۠ۙۖۧۥۚۡۨۘۢ۫ۦۘ۟ۡۤ۠۠۫۬۬ۨۖ۠۠ۤۨ۫ۖۨ۟";
                                            break;
                                    }
                                }
                                break;
                            case 352815176:
                                str2 = "۠۫ۜۢۘ۫ۢۜۖۘۜۙ۫ۚۤۖۚۚۖۤۜۚ۫۟ۚۜۡۡۘ۟ۧۖۢۜۨۖۛۡۘ۠ۚۨ۬ۗ۠۬ۡۘۨۤۧۥ۠ۡ۫ۡۖۘۨۤۜۖۘۜۘۢۧۦۘۦ۠ۜۘۙۧۛۙ۠ۨۘۘۘۜۘۘۜۖۨۤۘۨۧ۟ۧۖ۠ۘۥۙۦۤۖۥۜۧۘۛۜۥۘ۟ۜۜۘۦۤۘۚۙۥۘۤۘۦۘۦۡۚۘۛۘۖۨۨ۠ۖۘۖۤۘۘ۟۬ۡۜۤۧ۟ۚۚ";
                            case 871918068:
                                str = "ۦۧۥ۟۫۫ۤۛۗ۠ۨۘۗۛۗۥ۬ۘۚۘۚ۟ۗۡۜۥۨۦۡۥۘۨۜۘۡ۟۟ۛۛۦۢ۫ۜۘ۠ۙۢۧۛۜۨ۠ۜۥۤۘۢۧۖۤۖۥۘۜۛۤ۠۬ۘۘۤۖۚۡۥۘۥۢۜۘۡ۟ۖۜۧۖۘ۠ۛ۫ۦۤۡۢۡۥۘۨ۬ۨۘۨۙ۟ۜۚۦ۠ۗۦ۟ۢۙ";
                                continue;
                            case 1581050822:
                                str = "ۚۖۤۜۖۧۦۙۚۗۤۡۥۘۘۗ۬۠ۤۡۦۘۦۡۦۘۡۗۤ۫ۙۙۦ۠ۘۘۘ۟ۤۨۧۥۘۧۘۗ۫ۦۖۤۘۚۧ۬ۘۖۨۘۙۚۘ۫ۖۦۗۦ۟ۖۘۢۡۚۨۦۗOۦۚ۟ۧۦۖۥۘۡۘۖۨۘۘۖ۫ۥ۟ۜۧۡۜۘ۠ۖۖۘۡۧۙۦۥ۫ۢۖۧۘ۟ۖۦۢۙۦ۫۫۟۟ۖۢ";
                                continue;
                        }
                    }
                    break;
                case 2082327101:
                    str = "ۖۨۦۘۦۚۡۘۖۙۚۧۧۗ۟ۚۨۡ۬ۗ۬۟ۡۘۡ۟ۨۦۖۥۘ۠ۚۥۘۚۡۗ۫۠ۢۤۚۛۡۦۘۧۦۘۘ۬ۚ۬۬ۥۘۜ۬ۢ۟ۜۢۤۜۚۜۘۥ۫ۥۘۨ۬ۘۘۜۚۜۛ۬۬ۢۘۖۘۚۖۗ۬ۤۖۜۧۙۙ۠ۚۡۥ۫ۨۛۤۗۗ۫ۖۘۧۢ۠ۦۨۥۜۗۗ۫ۙۙۦۙۤۥۥۦۛ۟ۜ۟ۛۤۙ۫ۡۨۦۡ۟ۦۡۘ";
                    materialButton = (MaterialButton) findViewById(C0931R.C0934id.id010c);
                    break;
            }
        }
    }

    public static String getModeSelect() {
        while (true) {
            switch (((((((((((((((((((((((((((((((("۬ۤۛۡۜۜۥ۬ۘۛۤ۟۫ۖۨۘ۟ۖۥۘۧ۠ۨۘۛۜۥۜۦۛ۫۠ۧۛ۟ۢۦۧۡۤ۫ۘ۫ۢۨۡ۠ۦۘ۫ۜۧۖ۠۫ۤۨ۫ۖ۬ۜۨۨۦۘۗ۟ۧۖۜۨۧۗۨۡۥۜۘۙۧۛۛۙۡۦۢ۟ۤۘ۠ۨۦۥۘۧۚۘۤ۬ۥ۫ۨۘۥۥۨۢۛۖۘۡۜۗۜۥۡۘۧ۬ۡۗۡۨ۫ۙ۟ۡ۬ۖ۫ۤ۠۫ۧ۬ۗۖۜۘۛۦۢ۫ۥ۠".hashCode() ^ 623) ^ 465) ^ 986) ^ 108) ^ 165) ^ 73) ^ 413) ^ 481) ^ 506) ^ 656) ^ 181) ^ 612) ^ 459) ^ 692) ^ 410) ^ 103) ^ 464) ^ 811) ^ 12) ^ 479) ^ 789) ^ 821) ^ 980) ^ 388) ^ 387) ^ 845) ^ FrameMetricsAggregator.EVERY_DURATION) ^ 174) ^ 118) ^ 301) ^ 617) ^ 1267584199) {
                case -692910374:
                    return ModeSelect;
            }
        }
    }

    private String getSignatureHash(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance(Deobfuscator$$app.getString(-3440728868656078665L)).digest(bArr);
            StringBuilder sb = new StringBuilder();
            int length = digest.length;
            int i = 0;
            while (true) {
                String str = "ۗۤۜۘۡۨۥۧ۠ۖۘۡۨۥۛۜۛۤۜۜۤۚ۠ۚ۫ۨۡۘۤۛۛۨۛ۬۟ۥۡۦۜۤۦۧۘۦۛۜۘۦۖۛۘۗۘۘۢ۬ۦۘ۠ۚۤ۟ۨۘۧۖ۬ۘۜۥۘ۟ۚ۠۫ۖۨۘۚ۠ۦۛۡۦۛۥۙۡۦۘۛۤ۠ۤۘ۠ۜ۬ۙۗۚۨۘۦ۫۫ۛ۠ۘۘ۟ۚۛ۬ۥۡ۬ۥۛۤۛۖ۠ۘ۬۬ۢۥ";
                while (true) {
                    switch (str.hashCode() ^ 1121169732) {
                        case -1506547545:
                            String hexString = Integer.toHexString(digest[i] & UByte.MAX_VALUE);
                            String str2 = "ۖۖۧۘۙ۬ۖۘۦۜۖۥۗۡۨ۬ۥۘۜۡۦۘۙۖۦۘۖ۫ۛۧۛ۬ۚۘۦۛۚۙۖۤۙۤۗ۬ۛۚ۬ۤۡۨۘ۟ۢ۠ۗۙۜۙۖ۠ۡۜۤۦۢۛ۬ۥۨۘۚ۬ۜۦۜۘ۟۠ۤۧۙۥۖۚۢۧۧۜۢۘۗۙۘۘۖۨۖۘ۟ۨ۠ۡۨۦۘۖ۟ۡۘ۫ۗۡۡۗ";
                            while (true) {
                                switch (str2.hashCode() ^ (-1707410466)) {
                                    case -2101013424:
                                        break;
                                    case -2077338302:
                                        String str3 = "۫۟ۤۢ۫ۥۘ۬ۦۧ۟ۛۧۤۢۡۘۙۖۨۘ۬۫ۡۨۦۥۙۦۥۘۥۘۖۘۧۗۘۡ۬۠۬ۡۘۘۥۖۢ۟ۥۜۘ۠ۧۦۘۧ۬ۡۥۦۨۘۖ۠ۨۘۗ۠ۨۘۦۖۜۘۡۙۧۤ۫ۘۧۚۗۧۤۛۨۙۧۡۚۨ۫ۚۛۢۛۨۧۜۘ";
                                        while (true) {
                                            switch (str3.hashCode() ^ 165030372) {
                                                case -1900023548:
                                                    str2 = "ۘ۬ۙۢۥۧۘۛۚۙۖۜۜۘ۟۟۫ۧۜۚۤۖۧ۬ۢۜۘۡۜۦ۬ۛۥۘۛ۟ۥۦۢۡۘۘۧۜۥۥۦۘۖۖۨۥۚ۬ۢۛۢۘۘۨۗۖۘۚۤۜۘۥۧ۬ۧۚ۟ۙۗۥۢۡ۬ۢۖ۟ۜۘ۬ۨۥۜۢۛۛۢۤۗۦۥۡۡۥۘۥ۬ۥۗۤۥۦۨۥۚۡۘۨۗۧۨۙۨۜۨۨۚۡۘۘۙ۟";
                                                    break;
                                                case -1523586009:
                                                    String str4 = "ۙ۟ۡۘۖۘۚۧۨۘ۠ۖۦۘۢۧۘۨ۫ۚۚۚۘۘۚ۠۠۠۫ۡۘ۠۫ۚۡۚ۬۟ۡۖۢۥۚۙۛۙۗۙ۬ۘۚ۟ۦۙۤۚۡۘ۫ۦۨۢۖ۠ۡۚ۟۬ۛۡۘۚ۫ۚۥۤۖۦۜۜۡۖۗۗ۟ۡۘ۠ۘ۬ۘ۠ۘ۠ۧۙ";
                                                    while (true) {
                                                        switch (str4.hashCode() ^ (-1530992463)) {
                                                            case -2112096666:
                                                                str3 = "ۖۗۛۦۖۨ۠ۜۡۘۙۚۘۦۖۘۘۥۙ۟۠ۖۚۗۧۙۧۦۨۖۚۨۘۨۧ۠ۘۗۛۚۥۜۘۙۛۖ۠۬۠ۜۙۨۧ۠ۨۘۚۨۙۘۨۡۨۘۘۖۦۨۙۘۦۨۘۗۧۜۙۢ۠ۜۖۜۥۛۥ۠۬ۡۗۤ۠ۙۜۚۘۦۦۧۘۘۖۜۘۦ۠ۦۖۙۦۘۖ۟ۢۖ۫ۖۘ۫ۚۦۘۘۘۗۚۚ۟ۖۙۡۛۦۙۘ۠۬ۘۧۙۡ۟ۧۛۢۦۘ";
                                                                break;
                                                            case -873028908:
                                                                str3 = "ۥۙۨۘۚۢۤۥۜۨۨۡۤۦۖۢۚۢۥۘۛۢۤۨۦۡۘۤۛ۬ۧ۠ۦۘۛ۬ۘۘۢۧ۫ۛۜۨۘۤۤۜۘۙۙۖۛ۬ۡۘۢۧۗۛۧۘۘۤ۬ۥۘ۬ۘۘۘ۠ۗۨۦۧۜۡۜ۠۠ۦۡۘ۬ۛۢۦ۫ۦۜ۠ۢۘۧۢ۟۟ۡۦۚۗۘۦۖ۠۟۟ۡ۟۠ۧ۫۬۟ۤ";
                                                                break;
                                                            case -684906338:
                                                                String str5 = "ۜۗۚۜۦۘ۠ۜۨۘۧ۟ۘۘ۫ۛۘۘۙۦۡۖۦۘۘۛۘ۟ۖ۬۫ۢۗۗۡۢۧۖ۟۠۠ۥۡۡۤۚ۟ۡۘۖۜ۟ۡۤۥۘۛۛۖ۫ۜۦۗۚۡۗۙۦۨۚۦۘ۠۫۠ۡۨۖۚۢۘۦۢۙۡۖ۬ۙ۫ۥۘۙۛۨۘۨۤۖۗ۫ۦۘۡ۬ۨۘۖۜۧۘۛ۟ۨۘ۟۠ۡۡۤۦۘ۟ۙۘۘۨۡۦۘۨۘۢ۬۬";
                                                                while (true) {
                                                                    switch (str5.hashCode() ^ 588432399) {
                                                                        case -92597523:
                                                                            str5 = "۠۬ۨۛۨۖۘۤۡۥۘۗۗۜۥۜۤۤ۬۟ۖۖۙۖۡۚۖۗۥۘۛ۠۬ۨۙ۫ۥۧۛۤۙۥۘۧۚۦۘۛۧۧۖۥۥۜ۟ۗۦۦ۠ۗۜۜۧۗۙۙۜۘۘۛ۟ۢۨ۟ۤۥۜ۬۟ۨۚۘۘۘۚۤۖۡۧۜۘۢۡۦۘۤۥۛ۟۫۠ۚۚ۫ۤۙ۠۠ۨۙۢۤۦ۠ۦۘ۠ۗۜۘۡۦۗۥۖۧۘۥۜۡ";
                                                                        case 110711629:
                                                                            str4 = "ۧۛ۟ۘۗۛۢۡۦۘۗۘ۫۟ۜۥۧۢ۠۫ۖۘ۟ۘ۠ۙ۫ۜۘۥۗۥ۟ۧۗ۫۬۠۫ۧۨۧ۟ۧۚ۟ۥۧ۬ۤۚۨۘ۬۟ۜۥۤۨۘۢۗۙۧۘۖۘۡۧۚ۟ۛۙ۫۫ۜۘۧۤۥۤۡۜۙۚۜۘۦۜۨۘ۬ۥۥۦۗۘۘۛۚۡۘۗۨۨۘۧ۫ۥۘۜۚۜۜۚۧۘ۟ۢ۟ۜۖۘ۠ۤۙ۫ۨ۫ۥۜ۬";
                                                                            break;
                                                                        case 1057646364:
                                                                            String str6 = "۟ۙۙۤۥۨۙۚ۫ۚۗ۫ۨۙ۬ۘۘۧۥۙۖۚۨۘۛۨۨۨۥ۬ۦۗۢۢۗ۟۫ۗ۫۠۫ۖۨۡۜ۠۟ۘۥۘ۫ۛۥۘۗۖۧۘۗۘۜۛ۟ۥۘۜۧۡ۟ۛۜۘ۠ۘۢۧۗۢ";
                                                                            while (true) {
                                                                                switch (str6.hashCode() ^ (-344904648)) {
                                                                                    case -1920734511:
                                                                                        str5 = "۫ۡۘۥۙ۟ۘۢۛ۫ۡۨۛۛۡۡۘۖۦۧۘۦۢۨۤۘ۟ۖۨۖۘۘۧ۟ۤۡۙۥ۫ۡۘۘۢۦۨۗۦۘ۬ۡۛۙ۫ۖۘۧۡۜۘۚۘۙۡۦۘۨۤۙۖۤۦۘ۫ۦ۫ۡۦ۫ۜۦۘۘۗۦۥۜۡۦۗ۠۠ۙۥۚ۫ۦۤ";
                                                                                        break;
                                                                                    case -1674769445:
                                                                                        str5 = "ۗۘ۫ۦۗۦۘۦۨۡۘۡ۠ۖۥۛۤۜۨۜۦۘ۬ۖۡۘۘۦۧۢۛ۠ۘۘۙۜۖۘۥۖۨۥۧۘۡ۬ۦۘۧۤۡۘۤۢۜۘۖۡۜۨۘۦۢ۫ۛۚۤۛۥۗۗۧۢۦۤۤ۬ۚ۫ۤۚۥۘۘۛۚۘۚۧۙۜۙ۫ۧ۫ۢۙۨۘۖۥۚۧۙۖۚۡۧۘۘۖۧۡ۠ۦۘ";
                                                                                        break;
                                                                                    case -937734081:
                                                                                        str6 = "۬ۨۨۘۡ۠ۛۜۗۙۖ۫ۚۥ۫۬ۘۧ۠ۖۡ۬ۚ۬ۡۘ۟ۖۡۙۨ۠ۛۖۨۘ۬ۥۧۘۡۛ۫ۙ۬ۡۘۗۢ۠ۙۨۘ۟۠ۢ۠ۨۡۜۥۧۘ۠ۙۡۦۖۘۘۗ۬ۗۘۨۛۤۘۛۥۥۘۘ";
                                                                                    case -403727679:
                                                                                        str6 = hexString.length() == 1 ? "۟۠ۧۥۧۘۚۜۦۘۢۨ۬ۖۜۢۧۧۜۘۤۛ۟ۛ۟۬ۙ۫۠۠ۗۨۘۧۧ۠۫۫ۗ۠ۥ۫ۢۛۡ۫ۦ۫ۨۖ۫ۧۡۡۘۚۡۘۖۥۖۘۜۢۤۧۗۜ۠ۙۢۥۖ۠ۨۙۤۙۦ۫ۧۜۘۥۧۜ۫ۜۥۙۡۦۜ۬ۥۚۖۨۙۖۘۖۙۜۘ۠ۜ۫ۚۘۧۘ" : "ۦۢ۬ۧۘۢ۫۫۬۠۫۬۟ۚ۫ۤۘ۬ۛۢۥۘۧۢۜۗۤۛۚۛۛۚۗۦۙۤۦۙ۠ۤۧۥ۬ۜۘۤۗ۬ۡۘۚۚ۬۠ۘۧۗۨۥۢۖۚ۠ۘۘۡۗۥۘۥۥۡۛۥۨ۠ۧۧۨۖۘ۠ۦۦۘ۠ۢۥۢۥۥۘۖۖۗۙ۫۬ۤۗۜۘۡۡۨۡۡ۬ۧ۫ۥ";
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 1486335951:
                                                                            str4 = "۫۫ۡۘۘۢۛ۟ۙۜۘۙۜۛۢۘۢۡۦۢۘۛۜۦۖۜۚۨۤۥۤۖۘۗ۫۫۟ۤۘۧۗۦۙۖۧۗۥۤۖۨۘ۟۬ۥۘۤ۟ۦۘۢ۬ۛۤۤۧۘۥۦۘۦۧۤۦۛۙۥۘۘۘۢۢۢۨۛ۟ۤۧ۬ۙۦۛۖۧۦۘۤ۠ۥ۫ۨ۠ۖ۟ۡۘ۠۠ۡۘ۫ۚۗ۟ۖۙۤۘۘۘۦۡۜ۟ۨ۫ۖ۠ۗۥۨۡۥ۟ۘۘۘۢۘۜ۟ۜۘۨ۠ۨۗۛ";
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case -86316167:
                                                                str4 = "ۧۚۜۚۘۤ۫ۖ۟ۜۧۨۤۘۜۡۥۦۘۛۙۗۘۨ۫ۨۡۗۤۜۢۜ۠ۜۥ۠ۖۘۗۘۢۦۤۢۤ۟ۜۘۛۚۖ۠ۤ۟ۢۚۛ۬ۥۖۘ۫ۨۡ۠ۚۥۢۨۜۘۥ۫ۥۘۘ۠ۜۘ";
                                                        }
                                                    }
                                                    break;
                                                case -667223359:
                                                    str2 = "ۚ۠۬۬ۙۡۘۗ۟ۡۙۡۘ۟ۤ۟ۡۗۜۛۧۨۜۦۘۘۥۦۘ۬ۧۘۘۧۤۥۘۤ۠ۧۜۢۦۘۛۦۙۚۧۢۧۧ۬ۖۨۘ۟ۗۥۘۥۖۨۘۨ۟ۤ۠ۛۛۧ۟ۡ۟ۦۘ۬ۚ۬ۧۨ";
                                                    break;
                                                case -343837180:
                                                    str3 = "ۘۘ۟ۥۡۢۥۚۘۘۨۢۖ۠ۡۚۖۧ۟ۢۦۚۛۛۧۙۜۖۘۢۡۛۛۨ۟ۜۦۡۗۡۜۡۢۚۛۛۧۤۘۘۘ۫ۜۚۖۛۥۛۧ۬ۛۖ۟ۤۘ۬۠ۦۘۘۧۢۤۨۦۧ۟ۥۡ۬ۖۚۤۜۥۖۛۤۖۖۥۜۘۢۖۥۧ۫ۜۘ۟ۦۢۨۛۢۦۢۡۘۤ۫ۥۚۧۥۘۢۛۚۙۢۡۘۧۤۖۘ";
                                            }
                                        }
                                        break;
                                    case -481074694:
                                        sb.append('0');
                                        break;
                                    case 1575991395:
                                        str2 = "ۛ۟ۚۢۨۘۤۦۗۚ۟ۘۘۦ۟ۤۢ۠ۨۘۜۤۗ۠ۡۘۛۜۨ۠ۖۦ۬ۙ۫ۨۘ۬۬ۘۧۧ۬ۨۧ۠ۗۤۙۜۚۙۧۜۘ۠۫ۨۘۦ۟ۧۢۛۙۧ۟ۚ۟ۨ۫ۨۡۘۜ۟ۖۥۗۚ۠ۜۦۘۦۛۜۘۚۢۦۘۜ۟ۦۘۘۛۜۘۚۤۨۜۖۨۘۡۙۨۘۙۖۦ";
                                }
                            }
                            sb.append(hexString);
                            i++;
                            break;
                        case -1425837672:
                            str = "۠ۡۛ۫ۛ۟ۗۖۜۘۖۧۜۡۤۤۤۚۡۘۛۚۨۚۢۦۥۗۜۡ۫ۙۥۗۥۘۡۨۘۘ۟ۡۧ۬۟ۥۘ۟ۗۢۤۜ۬۬ۚ۫ۡۥۘۚۗۜۘۧۢۥۛۜۥۘۡۜۗ۫ۚ۫ۖۥۖۥۛۘۘۙۡۘۙ۠ۜۘۖۧۘۛ۫ۤۢۚۚ۠ۖۖۨۦ۬ۙۥۜۘ۟ۢۡۘۗۧۛۖۙۨۘۧۢۗۡۖۨۡ۬ۨۡۥۗ۠۬ۗۖۨۜۘۜ۟ۢۦۛۜۘۜۘۤ";
                        case 1943597950:
                            return sb.toString();
                        case 2126990399:
                            String str7 = "ۡۥۧۘۨۦۜ۬ۗۘۤۜ۠۬ۧۘ۬ۛۜۗۦۧۥۙۙۡ۟ۖ۟ۦ۬ۖۜۛۙۙۤۛۧۜۚۖۤ۠ۗۡۥۥۜۘۡۙۘۘ۠۠ۛ۟۟ۛۦ۬ۜۘۗ۫۫۬ۢۤۢۡۡۛۛۤۜۤۚۘۖۙۡۧ۫۠۬ۖ۬ۤۘۧۢۦۘۗۜۢۥ۬ۨۘ۠ۦۦۘۢ۟ۦ۫ۡۤ";
                            while (true) {
                                switch (str7.hashCode() ^ 216440590) {
                                    case -1467786310:
                                        str = "ۙۙۡۘۗۦ۫ۦۧ۫ۧۗۜۜۥۗۗ۫ۥۙۜۖۘۖۢۥۘۛۡۧۤ۠ۦۘۜ۬ۘۘۛۤۧۙۜ۟ۦۜۚۡۗ۬ۦۢۡ۟ۙ۟۬ۤۖۜۦۢۡۤۗۥۘۘۖۛۦۤۜۘۨۙۡۦۦ۟";
                                        break;
                                    case -104641239:
                                        str = "ۨۙۦۘ۬ۚۢۚۗۘۘۡۜۥۘۥۜۖۘۗۧۖۘۡۚۖ۠۟ۧۚۚۜۧۖ۟ۜۥۘۘۙۤۗۙۚ۫۫ۧ۫۬ۙ۫ۗۦ۫۟ۗ۬ۥۛۤۧ۬ۙۖۥۢۦۨ۫ۧۨۦۛۢۥۘ۟۠ۤ۬ۥۨ۟ۧۛۥۡۘۨ۠ۜ۬ۙۨۘۙۧ۫ۙۨۨۛۦ۫ۥۡۦۘۦۛۜۗۡۘۘ";
                                        break;
                                    case 1513481259:
                                        str7 = "ۥۤۥۦۢ۠۬۬ۙۦۗ۫ۨۥۦۥ۬ۘۚۥۘۖ۠ۨ۫ۡۥۖۧۘۘۙۜۦۘ۠۫ۖۜۤۖۘ۟ۨۡۘ۟ۢۦۘۘ۠ۖۘۥۨۡۘۜۖۧ۠ۗۦ۫ۦۘۘۘۘۘۘ۫ۡۙۢۤۦۘۢۨۧۘۨۜۥۘ";
                                    case 2000307416:
                                        String str8 = "ۢۥۚۛۤۡۘۤۡ۠ۡۜۨۘ۟ۡۖۨ۠۬ۜۗۨۘۜۙۜۘۙ۫ۘۘۜۗۙ۫ۗۖۘۗۧۥۘۛۦ۟ۜ۠ۘۘۡ۫ۤۦۤۤۧ۫ۘۘۙۙۦۘۧۜۡۘۙۛۖۘ۬۬ۧۡۖۙ۬ۗۡۘۧۚ۟ۛۜۥۘ۫ۜۡۙۜۛۦۢۖۘۨۙۘۘ۠ۙ۟ۙۛ۠۟ۛ۟ۙۨۨۘۜۗۦۘۜۗۛۤۦ۠ۨۢۡ۟ۤۚۡۢۡۘ۬ۨۙۙۤۚۗۨۜۘۙۨۢۦۘۧ۬ۗۖ";
                                        while (true) {
                                            switch (str8.hashCode() ^ (-296391825)) {
                                                case -2131223566:
                                                    str8 = "ۨۗۖۘۘۛۤ۬۫ۜۨۖۘۜۘۡۘۦۖۘۘۜۡ۬ۨۘۛۤۧۛۦۛۘۤۨۘۨۨ۬ۢۥۜۙۧۗ۠ۚۡۡ۫۠ۜۖ۟ۘۛۨۘ۫ۥۗ۫ۢۤ۬ۢ۬ۚۨۘۧۛۖۘۤۤ۬ۛۗۘۘ۟ۨۨۘۥۘۥۚ۫ۡۘ۠ۨۦۘۤ۟ۦۧۨۡۧۥۧۘۨۖۨ۫ۡۢۦۧۡۘ۠ۚۖ۫ۙۨۘۦۙۜۡ۠ۜۦ۠ۡ";
                                                case -1564431568:
                                                    String str9 = "ۗۦۤ۟ۙۜۘۖۖۦۤۖۜ۟۟ۨ۟ۦ۠ۦۖۘۨ۠ۜ۟ۗۙۖۢۙۡۗۙۢ۬ۘۘ۬ۥۡ۬ۦۙۘۢۦۘۤۚ۫ۙۧۨۘۘۛۚ۟ۚۧۢۗۧۖۨۘۜۘۥۘ۬ۖ۟ۜ۠ۨۦۥۘۡۙ۬ۡ۬ۡۘ۟ۜۜۗۛۚۡۜۛ۬ۘۦۘ۫ۛۗۥۡۥۡۧۘ۫ۘۜۨۥۦۛۜۜ۫ۧ۠۠۟ۘۧ۬ۖۢۦ۠۫۠ۖۗۥۘۧۘۦۛۜ";
                                                    while (true) {
                                                        switch (str9.hashCode() ^ 988586054) {
                                                            case -1224283475:
                                                                str8 = "ۥۥۥۘۘ۬ۢۗۜۢۡۢۢ۫ۛۜۧۚۥۡۜۥۜ۬ۜۘۛۜ۠۫۬ۚۗ۟۬ۨۖۙۦ۫ۥۢۥ۟ۘ۠ۨۙۡۚ۟ۖۜۖۤ۬ۤۥۨۘۚۦۖۛۧۤۛۘۥۘۚۧۘۧۛۢ۠ۛ۫ۜ۠ۛۖۤۘۘۨۖۖۙۢۜۘۘۚ۬";
                                                                break;
                                                            case -99732046:
                                                                String str10 = "ۢۗۧ۬ۨ۫ۖۦۡۘۥۡۛۤۙۙۗۢ۠ۥۡۡۢ۫ۡۗ۟ۨ۟ۘۖۘ۟۫ۜۙۦۚ۟۫ۛ۬ۢۥۚۜۙۖۘۖۘ۠ۜۢ۠۬۠ۦۘ۟ۙۧۥۤۨۘۧۗ۠۫ۤۖۥۤۗۤۤۛ۫ۙۚۢۢۥۙۖۚ۬ۚ۬ۦۡۖ۠ۖۘ۫ۦۥۧۤۨۛۤۘۦۚۖۘۙۘۛ۟ۗۜۘۨۙۥۥۗۡۘۛۡۚ۬ۗۜۦۦۥۘۦۗ۠ۗۨۘۘۧۗ۠";
                                                                while (true) {
                                                                    switch (str10.hashCode() ^ 337035407) {
                                                                        case -1498243511:
                                                                            str10 = i < length ? "۟ۦۛ۬ۧۖۥ۟ۢۘۧۘ۬ۥۙۨۜۨۧۥۥۢۨۡۘ۠ۜ۬۠ۢۤ۠ۚ۬ۨ۠۫۫ۥۨ۟ۚۚۚۜۦۘۡۡۨۘ۟ۡۡۚۡۘۤۡۙۢۨۗ۫ۤۖۘۙۦۥ۬ۘۚۧ۟ۖۘۚ۟ۚۨۚۨۘ۬ۦۡۘۘۦۡۨۘۦۛۦۡۤ۫ۘۘۢ۠ۚ۬ۥۧۘۚۜۘۧۚۖۖۗۡۘۦۢ۠ۛۘ۬ۙۚۥۢۨۘۘۛۗۚۛۨۖۘ۟ۦۦۢۤۢۚۡۛ" : "ۚۚۨۨۨۜۗۦۜۘۡ۫۟ۧۦۙۖۦۡ۬ۧۢ۟ۙۡۤۛۢۖۦۗۘۨۡۘۢۛ۟ۚۨۘ۬ۚۤۚ۬ۗۗۨۘۢۨۜۘۥۧۗۙ۫ۛۥۨۥۤۗۥۘ۬ۥۚۨۢۡۘۛ۟ۡۢ۠ۡۘۡ۫ۥۘۖۧۖۘۜۘۢۢۜۘۘۥۚ";
                                                                        case -1173989404:
                                                                            str9 = "۠ۡ۠۬ۖۡ۬ۘۢ۟ۘۘۘۦۚۡۚ۟ۖۖۗۢۥۙۘۘ۠ۧۢۚۡۘ۠ۚۧۚۧۚ۫۠ۚ۬ۡۨۖۘۘ۠ۘۢۧۜۦۘۧ۬ۚۜ۫ۙۜۡۜۥۡ۬۫ۛۧۨۛۖ۬ۧۙۥۗۡۢۡ۬ۡ۟ۖ۠ۥۦۘۧۜۦۘۛۢۦۖۙ۠ۨ۬ۨۜ۠ۚۢۢۥۘۛۜ۬ۜۖۡ۠ۗۗۥۛ۫ۙۤۥۘۚۤۨ";
                                                                            break;
                                                                        case -88874728:
                                                                            str9 = "ۜۛۦۘ۬ۡۢۨۖۢۗۛۥ۟ۨۦۘۢ۬ۖۘۚۤ۬ۤۥۗ۠ۘۚ۫۫ۨۙۖۜۨۗۤۚۛۘۘۧ۟ۢ۠۟ۜۚ۬ۨۘۥۧۦ۬۠ۨۘۦۥۡۥۡۖ۫ۜۖۡۘۧۦ۬۠ۢۥ۬ۦۨۘۢۡۦۥۡۨۘۨۡۚۨۨۡۜۛۜ";
                                                                            break;
                                                                        case 289642273:
                                                                            str10 = "ۢۨۥۜۡۧۘۡۥۦۘۛ۬ۧ۫ۛۜۛۚۡۢۜۜۚۦۚۥۚۖۖۘۤ۬۬ۘۤۛ۬۬ۙۦۛ۬۬ۦۥۡۘۛۦۘ۫ۛۚۚ۫ۘۘۨۚۜۚۛۗۛۧۙۗۥ۫۫ۙ۠ۤۨ۠ۙۨۘۨۡۢۚ۠ۢۥۖۡۨ۫۟۬ۡۥۘ۟ۥۙ۟ۧ۫ۤۖۦ۬ۗۗۛۥۨۤۖۦۘۥ۫ۧۚ۠۫ۚۛۤۤۧ۬";
                                                                    }
                                                                }
                                                                break;
                                                            case 1001300985:
                                                                str9 = "ۨۜ۠ۜۙ۫ۗۤۛۗ۬ۚۚۜۨۘ۟ۦ۟۫ۡ۫ۧۥۥۘۥۦۢۙ۟ۖۜۗۨۘۖۗۧۨۗۚ۟ۖۧۘۨۘۨۙۚۛۦۚۨۘۗۦۡۡۤۤۗۘۚۖۦ۫ۤۡۘۘ۟ۜۜۘۖ۠۫ۖۨۖۘۤۗۛ۟ۤۦۘۗۘۚۧۙۡۨ۟ۜۘۧۖۡ۬۠ۗ۫ۜۗۘۙ۫۟ۘۧ۬ۧۢۥ۟ۖۦۥۜۚۘۘۢۡۥۘۢۖۦۘۗۦۙۢ۫ۤۧۚۢۖۦۘۘ";
                                                            case 1795980570:
                                                                str8 = "ۜۡۢۨۛۡۤۜۜۤۗۢۤ۠ۨۙۨۙۘۦۘۦۗۚۧ۟ۥۘۢۛۗۡۘۤۤۘۡ۟ۜۘۗۤۜۧ۟ۜۨۥۡ۠ۤ۬۠۟ۗ۬ۚۡ۫ۤ۠ۦۜۘۘۧ۟ۦۘ۬ۧۜۤۤۥۘ۟ۡۦ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 616316237:
                                                    str7 = "ۖ۠ۡۧۧۜ۠ۨۚۢ۫ۦ۟ۡۜ۟ۜۡۘۥۚۜۥۡۘۗۡۡۘۘۢۥۘۖۦ۟۫۬ۖۘۨۨۚۘۨۘۜۡ۟ۘۦۙۡ۫ۡۘۚۗۘۚۖۘ۫ۜۗۧۡۨۘ۬ۚۙۦۖ۠ۤۛۚ۠ۥۤ۠ۥ۬ۦ۟ۡۦ۠ۤۨۢۡۜۨ۬ۜۛۖۧۙۜۡۗۥۘ۠ۡۥ۫ۤۢ";
                                                    break;
                                                case 820779721:
                                                    str7 = "ۘ۟ۙۧ۠۟ۦ۫ۨ۬ۨۧۛۢۙۦۚۖۦ۫ۖۖۘۛ۟۬ۨ۫ۥۘ۠ۤۨۡۤۖۙۨۜۥۢۗ۠ۤۙۘ۬ۘۧ۫ۥ۫ۢۖۤۛۨۘۦ۫۠ۨۥۜ۬ۢۡۘۡۚۜۘ۠ۧۢۦ۬۟ۘۖۘۘۤۨ۟ۨۘۥۘۤۧۨۧۜۤۡ۬ۧۤۥۛۡۙۡۘۛ۬ۡۘۖۘ۠ۗۥۛۗۢ۬ۧۘ۫ۤۨۗ۫۟ۡۘۛ۬۫۫ۨۚ۬ۚۡۘۦۥۘۢۘ";
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                            break;
                    }
                }
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void goLogin(Context context) {
        Intent intent = null;
        String str = "ۨۢۦۘۤۜۘ۠ۛ۟۟ۤۨۤۥۦۘۤۚۨۘۤۦۖۗ۬ۥۘۚۥۢ۬ۡۤۥۥۥۥۙۨۘۢۦۙۗۙۚۘۥۡۜۘۖۛ۟ۙۧ۫۬ۦۡ۬ۚۤۖۘۚۦۡۛ۠ۡۚ۬ۥۘۤۚۥ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 409) ^ 497) ^ 552) ^ 579) ^ 969) ^ 686) ^ 134) ^ 995) ^ 494) ^ 700) ^ 656) ^ 871) ^ 805) ^ 567) ^ 220) ^ 979) ^ 43) ^ 506) ^ 516) ^ 214) ^ 502) ^ 886) ^ 321) ^ 565) ^ 116) ^ 2) ^ 133) ^ 602) ^ 874) ^ 114) ^ 743) ^ (-2081531260)) {
                case -237154940:
                    intent = new Intent(context, LoginActivity.class);
                    str = "ۥۥۧ۠ۙ۬۠ۜ۠ۧۦ۫ۥۙۙۛۙۡ۬ۙۖ۠ۛۙۤۥۦۘۨۗ۬۠ۖۘۖۦۧۙۦۗۖۘۧۛ۫ۘۚۘ۬ۧۢۚ۠ۙ۠ۘۘۚۖۢ۬ۛۢ۟۟۫ۡ۠۫ۖۧۡۤۘۨ۬ۖۘۧۙۙۧۥۘۙۛۥۗۙۤ";
                    break;
                case 553419455:
                    str = "ۧۥۚ۠ۢۧۙۦۡۘۦۤۦۙۗۨۘۡۡ۬ۗۙ۠۠ۗ۠ۥۖ۫ۥۧۥ۟ۤۗ۟ۜۚۛۦ۠ۗ۠ۖ۬ۜۜۘۛ۠ۙۦ۬ۙۥۖۚۤۧ۬ۢ۫ۦۘ۠ۥۖ۟ۖۘۘۖ۟ۖۚۜۜۘۥۜ۠۠ۘ۫۫۬۟ۥۖۘۘۢۘۙ۬ۘۘۙۨۧۚۡۘۜۡۥۘ۫ۛ۠ۤۘۡۡۙۡۚ۫ۨۢۚۜۘ۠۟ۛۡ۬ۨۧۗۡۙۛۤ۫ۙۚۚۡۙۧۢۦ";
                    break;
                case 1264142040:
                    return;
                case 1360187505:
                    intent.setFlags(268468224);
                    str = "ۧۜۦۘ۠ۡۚۖ۠ۗۗ۬ۥۘۘۜۥۘۥۗۡۚۘۘۘۧۛۜۙۗۚۛۧۙۙ۬ۡۘۨۛۜۜۙۙۗۙ۟ۡۧۨۙ۟ۚ۬۟ۖۘ۠ۥۡ۟ۙۛۧۘۛۨۘۘۗ۫ۡۘۦۛۧ۠ۛۨ۫ۤۙ";
                    break;
                case 1444902858:
                    context.startActivity(intent);
                    str = "ۢۦۦۗۗۧۨۛۡۘ۫ۖۨۙۜۛۢۘۗۖۜۚۛۖۙۨۥۘ۠۠ۖۥۚۡۨۧۨۖۢ۫ۜۦۦۘۦ۫ۛۘ۠۫ۙۘۥۥۘۜۧۢۡۘ۟ۖۢۨۨ۟ۘۤۖۦۨۧۘ۠۬ۦۘۘ۠ۚۢۥۖۘۡۧۧۢۙۢۘۥۦۤۧ۬ۨ۬ۛۗ۠ۦۤۗۥۚۧ۟ۜۜۡۢۦۘۖۨۡ۬۫۠ۜۖۘ۠ۛۦۘۧۖۖۘۦۥۡۤۢ۬ۙۦۨۘۚ۠ۖ";
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$Login$2(LoginActivity loginActivity, String str, String str2, Handler handler) {
        String str3 = "ۢۙۖۘۡۦۧۘۤۡۜۘ۠ۚۡۘۥ۠ۡ۠ۙۨۘۡ۟ۗۘۢۜۘۥ۠ۖۛۦۚۡۢۢ۫ۦۡۦ۬ۨۘ۬۫ۛۘۗۨ۬ۖۜۙۦۘ۟ۚ۠ۦۥۧۙۡۜۘۨ۫۫۠ۨۙۙۗۨۗۥ۠ۢۥۜۘۛۚۥۘۙۥۥۗۡۚ۠ۤۦۘۥۗۡۥ۬ۡ۬۬ۢ۟۫ۡۦ۟ۡۘۙ۬۬ۤ۠۫ۜۥۙۤۧۦۘ۫ۧ۟ۢۙۢ";
        Message message = null;
        String str4 = null;
        while (true) {
            switch ((((((((((((((((((((((((((((((((str3.hashCode() ^ 86) ^ 663) ^ 499) ^ 722) ^ 150) ^ 192) ^ 570) ^ 934) ^ 674) ^ 684) ^ 995) ^ 215) ^ 940) ^ 696) ^ 328) ^ 214) ^ 312) ^ 404) ^ 224) ^ 623) ^ 970) ^ 919) ^ 602) ^ 122) ^ 947) ^ 42) ^ 429) ^ 714) ^ 860) ^ 107) ^ 697) ^ 983773186) {
                case -1934068069:
                    handler.sendEmptyMessage(0);
                    str3 = "ۜۜۦۘۘۗۘۛۗۧۜۘ۠ۤۤۥۨۜۗۧۦۜ۫ۘۧۘۖۙۨۨۘۛۘۖۘۚۨ۟ۛ۠ۖۘۗۤۘۡۘ۠۬۟ۗۢ۠ۦۘ۫ۘۡۢ۫ۜ۬ۖۥۘۥۧۢ۠ۛۜۘ۠ۗۚۧ۫۠۠ۤۙۖ۫ۙۡۘۘۜۛۛۡۖۗۡۡۙۧ۫ۦۘۘۡۥۦ۬ۘۨۘۦۘۘ";
                    break;
                case -913155044:
                    str3 = "ۙ۬ۨۘۧۘۡۛ۠ۢۚ۟ۨۚ۟ۨۜۢۨۨۙۧۗ۠ۨۘۢۡۡ۟ۗۜۘۘ۬ۘۘۧۛۜۘۙۚۜۘۦۘۢۦۥ۫۟ۛۨۘۙ۫ۜۜۚۘۘۗۨ۠ۨ۟ۥۘۨۚۡۘۖ۟۫ۙۜۥ۠۬ۘۘۤۖۨۘۗۖۦۖ۬۫ۖ۟ۦۙۥۜۘۙۤ";
                    break;
                case -783533811:
                    str3 = "۫ۘۛۧ۫۟ۛۙ۟ۨۦۛ۫ۥۘۖۙۙۘۨۚۘۨۘۘۥ۬ۨۘ۬ۘۢۧۗۤۦۜۨۘۖۗۦۘۢۘۖۙۚۡۛۚۡۘۦۚۨۡۢۦۘ۬ۤۖۘۡۡ۟ۧۤۜۗ۟۫ۤ۬۠ۢۨۗۙ۠ۗۧۧۡۡۧۡۖۦۧۘۗۚۖۘۢۙۖۘ۫ۚۙۡۙۜۜۙۤۗۙ۫ۙ۬۟ۖ۫ۘۘ۫ۢۤۚۙۦۘ۠ۤۨ";
                    break;
                case -768875317:
                    message.what = 1;
                    str3 = "۫ۘۖۘۨۡۜۘۦۚۘۨۤۙۧ۟ۤۤ۬ۤ۠۫ۥ۠ۤۡۘۙ۬ۦ۟ۧۧۡۤۗۛ۫ۡۛ۫ۘۘ۬ۙۦۘۧۖۡۘۤۢۖۗۛ۫ۗۗ۬ۥۛۘۚۡۘۖۙ۠ۙۙۖۨۚۤۥۜۛۧۥۙۚ۟ۥۙۧۥۘۡۤۘۗۘۚ۠ۜۢ";
                    break;
                case -555662873:
                    str3 = "ۚۜۢۧۗۖۘۚۨۗ۬۫ۢۧۖۖۨۦۨۤ۫ۡ۬ۢۧۡۜۤۡۡۘۥ۟ۜۘۨۢۛۚ۟ۛۡ۫ۦۥۙۥۘۥۦۢۡۡ۠ۘۗۨۥۦۘۛۥۦۙۗۥۘۦۘۜۤۖۛ۬ۙۨۘۡۗۨ";
                    str4 = native_Check(loginActivity, str, str2);
                    break;
                case -69571761:
                    handler.sendMessage(message);
                    str3 = "ۙ۬ۨۘۧۘۡۛ۠ۢۚ۟ۨۚ۟ۨۜۢۨۨۙۧۗ۠ۨۘۢۡۡ۟ۗۜۘۘ۬ۘۘۧۛۜۘۙۚۜۘۦۘۢۦۥ۫۟ۛۨۘۙ۫ۜۜۚۘۘۗۨ۠ۨ۟ۥۘۨۚۡۘۖ۟۫ۙۜۥ۠۬ۘۘۤۖۨۘۗۖۦۖ۬۫ۖ۟ۦۙۥۜۘۙۤ";
                    break;
                case -29772467:
                    message = new Message();
                    str3 = "ۗۧۢۢۢۘۘ۬۫ۤۗۨۢۨ۬ۥۥۖۡ۠ۘۘۦۛ۟ۥۥۧ۟ۛ۠ۡۦۤۗۥۙۢۦۛۢۡۖOۥۗۡ۟ۖۖۧۗ۟ۙۢۖۘۗ۠ۛ۟ۗۗ۠ۛۚۥۢۜ۬ۜۗۢۖۦۘ۠ۛۢۖۦۢ۠۟ۤۢ۠ۗ۫ۖۢۥۡۢۚ۫ۨۥۙۖ۠ۙۦۘۛۡ۬";
                    break;
                case 215928942:
                    return;
                case 512770927:
                    String str5 = "ۢ۫ۡۛۦۦۜۗۜۛۚ۫ۥۥۛ۫۟ۦۢۥ۟ۨۘۗۜۛۡۜ۬ۘۘۖۢۙۨۘۦ۠ۡ۟ۤۘۘۜۛۢۧ۬ۙۧۢ۠ۚۗ۟ۤۜۘ۫۠ۘ۫۠ۘۘۚ۬ۧۤ۟ۤ۫ۘۘۡۚۜۥۥۡۜۥۗۘ۟ۢۤۧۜۗۚۥۘۡ۠ۦۜ۫ۨۘۛۥۦۧۨۦۘۘۤ۟۫ۧۡۛۢ۫ۘۗۖۘۨۙۙ";
                    while (true) {
                        switch (str5.hashCode() ^ (-1697600544)) {
                            case 1192112653:
                                str5 = "ۥ۟ۘۦۜۢ۟۬۬ۡۛ۬ۧۥۘۜ۬ۡۦۥۤ۠ۨۧۦۤۘۘۢۧۧۢ۬ۛۘ۫۬۬ۦۤۙ۠ۡۘۛۦۥۦۚ۠ۗۖۢ۠ۘۢۨۦۘۗۧۜۡۙۡۘۨ۬ۦۗۛۦۘۧۦۡۛۛۦۘۤۖۘۡۖۙ۫ۙ۟۠ۡۜۘ۠ۤۖۘۢۜۥ۬ۗۥۗۖۦۜۦۜۘۖۥۗۦۗۡۗۛۨۙۙۥۥۨۡۘۥ۬ۢۤۧۦۜۨۧۧ۟ۛۚۛۢ۠۟ۚ";
                            case 1335975823:
                                str3 = "ۘ۫۠ۥۨۡۤۦ۟ۙۢ۟ۜۚۙۥۧۙۦۧۡ۠ۡ۠ۥۥۘۡۗۢ۬ۗۜۘۥۙۘۧۚ۟ۢۧۖۘ۠ۡۢ۠ۛۡ۫ۘۜۧۖۢۢۜۘۨۚۦۘۙۡ۫ۘۛۘۜۜۘۘۚۤۗۥۨۦۘۦۛۚ۫۬ۜۘۤۙ۟ۦۛ۠ۡ۠ۢۜۜۘۤۚۢۘۖۙۢۖۘۙۨۗ۫ۖۦۘۘۡۚۥۚ۠ۤۨۘۨۜۡ۫ۧۚۙۖۦۖ۬ۨۘۤۧۜۘۗۖ۟";
                                continue;
                            case 1492282169:
                                str3 = "۬ۖۢۥۧۦۛ۠ۥۥۛۘ۬ۢۘۨۤۤۦۨۨۗۨۙۛۚۜ۫ۦۖۛۙۥ۟ۧۜۘۜ۫ۡۘۙۤۧ۬ۥۜۘ۬ۛۙۘ۫ۘۡۙ۫ۜۖۖۘۙۥۛ۟ۤۤ۫ۧۖۤۗۜۘ۠۫ۘۚ۟۫ۜۦ۬ۘۘۤۥۖۜۨ۟ۨۘۛۖۦ۫۫۫۫ۚۛۙۧۡۘ۫ۖۘۤۤۥۘ";
                                continue;
                            case 1754175842:
                                String str6 = "ۥۗ۬۟ۛۨ۟ۡۦۤۖ۬ۥۚۙۤۡۘۘۜ۬ۖۘۜۙۜۘۧۜۖ۫ۗ۟۟ۛۡ۟ۙۚۙۜ۟ۚۢۛ۠۠ۛۛۗ۬ۛۤۘۙۜۛۙ۠ۨۘۦۛۖۘ۬ۗۥ۬ۜۡۢۘۡۘۜ۫ۨۘ۠ۨ";
                                while (true) {
                                    switch (str6.hashCode() ^ 135887552) {
                                        case -2010993772:
                                            str5 = "ۥۙۦۘۖۨ۟ۜ۠ۨۘۚۛۘۘۜ۟ۖۘۨۖۢۦ۟ۥۢ۫۟۟ۧۖۘۗۢ۬۠ۥۡۚۘۘۦ۠ۜۘ۠ۛۢۗۡۛۚ۠ۤۧۙ۫ۖۥۜ۠ۢۤۥ۠ۙۨۗۗۛۢۗۢۛۛۙۤۜۘۥۤۥۗۙۨۘۖۖۢۖۡۜۘ۠ۘ۟ۤۡۢ۠ۘۖۘۛۥۢ۬ۚۥۘ۟ۨۜ۟ۚۧ۟ۖۨۘ۫۟ۨۤۜ۬ۤۥ۠ۙ۬ۘۘ";
                                            break;
                                        case -1863388709:
                                            str6 = "ۦ۫ۨۘ۟ۘۘ۠ۗۡۘۜۤۨۘۙ۫ۛۢۗۤۛۧۘۘۗۢۖۘۘۛۖۨۨۥۥۨۛۨۗۜۘۗۗۙ۫ۗۥۘۧۖۢۨۡ۠ۦۦۘۘۙۗ۬ۜۜۖۘۖۙۚۥۤۥۧۖۛۥۧۘۛۨۛۢۜۥۧ۬ۤۚ۬ۨۦ۟ۙۖ۟ۧۗۨۦۘ۫ۥ۠ۥ۬ۜۘۤۤۖۘۙ۫۟ۨۛ۬ۗ۟ۘۗۥۚۥۢۜۘۙ۟ۥۖۡۦ";
                                        case 33439996:
                                            str5 = "ۛۜۖۘۧۨ۟۫ۦۥۢ۬ۢۤ۬ۘۤۢۡۘۥۙۗۛۛۜۡ۠ۙۤۥۤ۠ۙ۠ۥۡۤ۟۫ۜۛۖۗ۟ۜ۠ۜۘۧۖۦۨۖۨۘۨۥۦۘ۬ۖۖۘۜۤۢۡۦۘ۫ۖۖۘ۠۠ۖۧۛۜۢۙۜۙۛۜۧۡۧۜۦۢ۟ۖۙۗۡ۟ۧۜۦۛۦۤۤۦۘۚۜۖۘۢۦۘۘ۠۠ۨۦۤۥۘۙۢۦۘۧۗۤ";
                                            break;
                                        case 1068807263:
                                            String str7 = "۬ۖۨۘۥۨۘۛ۫ۦۙۘۢۥۡۜۖۨۢۗ۬ۘۥۦۖۧۜۜۘ۬ۛۜۘۡ۬ۜۢ۠ۧۚۨۧۘ۠۠ۡۤ۟ۦۚۤۘ۬ۦۘۙ۟ۘۢ۟۫ۡۡۚۡۡۧۡۨۙۚۛۢۖۛۢۚۢۥۥۨۗۨۖۗ۫ۤۢۢۦۘۥۜ۟ۦۖۥۧ۫ۦۘ۫ۢۡۡۧ۫ۙۜۧۥۢۡۨۚۖۘۤۘۘۧ۫ۚۘ۠ۥۚۖۜۘۤۙۦۚ۟ۨ۬ۛۜۘ۟ۧۦ";
                                            while (true) {
                                                switch (str7.hashCode() ^ (-1460599545)) {
                                                    case -1607828677:
                                                        str6 = "۟ۛۡۘۥۢۧ۬۬ۧ۟ۙۗ۠ۛۦۘۙ۬ۨ۫ۦۥۘۙۗۧۘۦۡۘۨ۬ۘ۟ۤ۟ۢۗۡۘۖۚۚۢۜۨۙۢۤۖۦۘ۬ۡ۫۟ۥۥۦۛۚۛۜۛ۫ۢۜۦۤ۠ۘۨۨۘۥۨۥ۠ۗۤۗ۬ۢۛۙ۟ۙۦۨۤۥۨۥۛۙ۬ۖۘ۫ۖۘ۠ۨۦ۠ۘ۫۫۠ۙ۬۬ۥۗۧۤۜۘۧۦۘۖۛۗۦۗۦۘۗۦۧۘ۟۫۬۠ۘۥۘۢۗۥ";
                                                        break;
                                                    case -838354309:
                                                        str6 = "ۛۥۦۘۤۚۘۛۙ۬ۤ۟ۥۚ۟ۙۗۦۛ۬ۦۗۡۨۧۙۢۥۢۜ۬ۨ۫ۜۜۛۜۙۢۢ۫ۙۘۘۨۧۧۦۤۚۙۛۘۘۖ۟ۖۘۢۨۜۘۨۙۛۘۙۢ۠ۥۘ۫ۘ۬ۚۥۦ۠ۙۤ۠ۤۗۜۤۜۘۙۡۜۖۦۨۘ۫ۤ";
                                                        break;
                                                    case 514957268:
                                                        str7 = "ۗۨۖۘۗ۠ۨۜۜۜۘ۟ۡۢۢ۫۬ۥۢۛ۟ۨۥۘۖۖۡۘۖۥۚۙۗۦۘۨۢۜۡ۠ۨۡۨۖۢۜۧۡۛۤ۟۫ۨۘۗ۠ۥۘ۠ۚۚۦۦ۫۫ۧۥۖۖ۟ۘۤۖۘۙ۫ۡۘۥۥۦ۠۬۫ۥۛۨۘۚۥۧۗۘ۟ۘۢۡۗۥۨ۟ۘۛۢۢۨۖۧۧۖۙۘۘۖۡۖۘ";
                                                    case 1494287992:
                                                        String str8 = "ۗۦۜ۠ۧۦۖۖۥۘۢ۬ۗۛۘۥۜ۬ۥ۠ۙۦۘۦ۬ۡ۠ۦۗۢۛۦۘۜۥ۠ۢۧ۬۠ۗۡۨۧۢ۠ۘ۟ۢۘۤ۟ۖۚۛ۠۬ۙ۬۬ۙۥۤۙۘۘۜۦۦۘ۟ۨۤۜۘۘۛۚ۠ۨ۬ۢ۠۬ۥۢۗۖۘۥۧۙۖۧۧ۬ۗ۬ۚۙۦ۫ۥ۫ۗۘ";
                                                        while (true) {
                                                            switch (str8.hashCode() ^ 1715020398) {
                                                                case -1376010936:
                                                                    str7 = "۫ۥۖ۬ۖۧۙ۬ۥ۫ۨۘ۠ۤ۫ۘۦۥ۟ۛۜۘۥۗ۟ۛۚۖ۟ۘۜۘۢ۫ۢۤۦۜۘۙۘۥۛۤۜۘۨ۟۬ۘۘ۬ۧۘۚۛۖۨۘ۠ۢۨۗۥۜۘ۬ۗۡۘ۟۟ۙۧۨۙ۬ۛۜۘ۠ۜۨۧۥۤ۬۠ۖۤۨۡۘۧ۟۠ۧۨۥۘۢۖ۟ۙۨ۫ۗۖۜۘۧۖۖۧۛۜۘۦ۬ۤۜۚۙۛۧۨ۠ۧ۟ۢۨۘۜۚۖۘۥۧۚۚۖۛ۠۬ۜۘۧ۬ۛ";
                                                                    break;
                                                                case -209832910:
                                                                    String str9 = "۬ۧۧۜ۟ۨۘۘۘۧۘۙۦۢ۫ۗ۠۟ۗۢۧۙۤۤۙۜۗۙۜ۟ۛ۫۬ۚۗۜۢ۠ۘ۟ۚۨۜۡۘۤۢۘۘۧ۬ۡۘۖ۬۟ۦۙۜۘۦۤۦۘ۬ۡۘۘ۠ۢۦۘۗۨۤ۬۠ۡۗ۠ۡۘ۬ۘۘۡۙ۟ۘۙۢۘۡۙۙۤۤ۫ۙ۠ۥۜۤۚۘۦ۟ۥۜۥۘۧۢۤۢ۠ۜ۫ۖۧ۬ۙۛۨ۠ۡۤ۟ۨۘ";
                                                                    while (true) {
                                                                        switch (str9.hashCode() ^ (-1183185105)) {
                                                                            case -964237469:
                                                                                str8 = "۟ۡۡۘۙ۠۠ۨ۟ۜۘۨۨۧۡۨۘۙۙۚۡۙ۟۟ۨ۟ۖۙۚۨۨ۠۬۫۟ۤۦۘۖ۫ۦۙۘ۟۟ۖۜۢۥۡۚۖۜۘۥۛ۟ۢۘۦ۫ۢۢۜۘۖۘۥۖۥۗۘ۫ۜۢۘۘۜۧۨۘۖۥۗۢۦۥ۬ۡۙۡۦۧۘ۟ۛۦۦ۬ۙۢۨۘۧۛ۬ۧۜۗۗۡۘۗ۬ۜۘ۬۫ۦۢ۫ۛۙ۫ۜۘۨۢۙ";
                                                                                break;
                                                                            case 418136814:
                                                                                str9 = "ۗ۬۟ۚۦۡۘۨ۟ۘۘۜۨۢۛۤۜۘۚۡۢۤ۟ۙۚۨۧۤ۫ۗۚۧ۫۬ۖۘ۟ۧ۫۫ۦۗ۬۠۫ۗۖۦۛۖۚۡۦۧۘۧ۟ۡ۫۠ۖۘۘ۠ۦ۫ۨ۫ۙۜۖۘۥۖۘۛۛۘۖۚ۟ۡۘ۟ۤۜۨۘۜ۟۠ۢۜۨۘ۬ۤۥۘ۟۠۠ۦ۟ۜۢ۬ۛۧۡۢۜۡۘۚۥۘۘۚۗۡۜ۬ۖۚۖۡۘ۠۫ۘۘۤۘۜۘۜۡۙۨ۫ۙۖۖۗۘۨ۠";
                                                                            case 1488432221:
                                                                                str8 = "۫ۧ۫ۤ۬ۧۦۖۜۚۘۦۘ۬ۧۜۛۡۜۘۛۧۡۜۤۚۦۚۡۡۨۤۚۥۧۨۙۘۘ۬ۤۙۘۥۜۘ۟ۗۦ۠ۢۚۙۨۦۘۧۢۘۗۚۡۜۜۦۙ۠ۜ۠ۖۖۢ۠۫۬ۥۤ۠ۖۨۘۘۘۖۢۤۧ۟ۧ۠ۢۦۢۗ۫ۤۘۘۦۧۚۦۘۗۛۦۖ۫ۘۛ۫۫ۜۖۢ۬ۗۨ۫ۙۙۦۛۗۡ۬۟";
                                                                                break;
                                                                            case 1848620548:
                                                                                str9 = str4.equals(Deobfuscator$$app.getString(-3440728834296340297L)) ? "۠ۢۥ۠ۖۦۘۙۡۥۘۛ۬۫ۖۗۘۘ۬ۘۡ۫ۧۨ۟ۧۘۙۨۜۚۚۛۛۙۖۘۖۘۚۘۦۘۦۧۘۨۢۜۨ۫ۥۘۘ۟ۗۢۡۖۛۛۦۘۤۢۜۘۡۤ۫ۥۤۗۘۘۘ۫ۤۖۧۘۘۚۦۘۜۡۧۡۗۗ۫ۤۡۚ۟ۖۘۡۨ۟۟ۡۦۘ۫ۜۚۚۖۘۗۦۘۘۛۧ۠ۘۡۨۙۚۛۙ۠ۗۧ۬ۗ" : "ۛۘۦۘۨۘۤۚ۟۟ۛۘۥۘۡۚ۬۬ۘۜۥۜۘۛۘۧۛۨۡۤۚۥۘۦ۟ۘۜۘۗۘۧۚۨۧۜۘۨ۫ۨۘۧۤۨۧۜ۬۟ۜۚۦۧۦۙ۟ۘ۬ۜۥۥۛۦۘۛۥۖۗ۠ۘۨۙ۫ۤ۬ۙۤۙ۬۠۟ۛ۫ۛ۫ۘۜۜۘۚۘۥۛۘۨۨ۟ۚۛۡۘۙۢ۬ۛۙۨۚۗ۠ۧۢۛۙۧۜۘ۬ۨۡ";
                                                                        }
                                                                    }
                                                                    break;
                                                                case 1033511394:
                                                                    str7 = "ۘۨۡۢۦۜۘۧۧۜۧ۬ۙۜۨۜۘۡۨۥۤۚ۫ۢۙۘۦۘۧۘۤۗۜۘۖۙۡۘۦ۬ۙۘۗۙۦۛ۬۫ۖۗ۟۬۟ۜۗۤۦۦۤۧۜۢۘۧۙۢۡۘۙ۠ۢۘ۫ۢۜۙۜۘۗۧۨۢۘۖۖۙۥۤۦۨۥۖۤۜۚۘۘۜۗۡۖ۬ۥۗۦۤۖۥۘ۫ۙۥۖۥۘۘ۫ۥۦۢۡۜ۫ۜۦۘۦ۠ۥۘۛۜۙ۠ۛۤۜۗۥۘۧۜۘۘۡ۫ۥۘ";
                                                                    break;
                                                                case 1181060361:
                                                                    str8 = "ۘ۫ۙۙۨ۠ۤۚۢۛۚۜۘ۬ۧۦۛۘۜۘۜۨ۫ۤۡۚۙۙۛ۠۫ۡۗ۫ۥۛۘۥۥ۟۬ۙۜۜۛۨۘۚ۠ۜۛ۫ۙۜۚۥۥۨۘۥۖ۟ۘۤ۠ۥۦۡۘۥۘ۫ۦۦۤۖۦ۬ۗۥۙۘۡۗۨۤ۬ۤۘۘۗ۫ۜۘ";
                                                            }
                                                        }
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
                case 649374141:
                    message.obj = str4;
                    str3 = "۟۫ۛۚۨۚۚ۬ۦۤۧۘۧ۫۫ۜ۟۫۫ۦۡۗۨ۫۠ۡۜۘۜ۬ۛ۬ۚۖۘۚۗۚۦۢ۠ۘ۟ۙ۫۠۠ۗۗۜ۟ۦۥۘۡۜۖۘۗۖۨۤۧۙۘۛۢۦۛ۬ۨ۬۫ۘۡۜۘۘ";
                    break;
                case 1088777763:
                    str3 = "ۦۛۢۚۜۛۗۤۦۘۜۢۥۘۙۘۧۧۢۡۧۙۜۨۧۘۖۧۤۜۥ۬ۥۢۥۘۖۘۖۘۛۥۨۙۦۛۥ۟ۢ۬ۘۦۦ۠ۢۘۖ۟ۢۖۨۘۛۦۖۘۛ۫ۢۘۙۘۧۨۘۤ۬۠ۥۙۖ";
                    break;
                case 1390079118:
                    str3 = "ۘۗۖۜۘۡۖ۬ۢۜۘۚۚۖۥۘۤۛ۠ۜۚۚۘۜۢۗۧۨۖ۟۫ۗۗۢۘۥۖۘۡۘۤۤۧۡ۟ۗۘۨۗۜۘ۟ۘۗۥۧۘۘۗ۬۠۬ۧۜۙ۟۟ۨ۫ۙ۠ۥۘ۫ۨۖۘ۟ۗۨۨۢۦۘۚۥۨۘۤۖ۫ۘۧۨۘۜۖۜۢۜۦۢۙۖۘ۠ۧۢ۫ۜۜۛۡۙ۠۫ۡۢۨۚۥۙۥۙۙۥ۟۫ۡۖۦۢۙۜۧۨۢۡۘ۫ۥۖۘ";
                    break;
                case 1579617676:
                    str3 = "ۚۙۡ۫ۢۘۥۗۜۘ۠ۡۧۥۛۜ۟ۥۖۙۡۢۡۚۖۘۚۘۜ۟ۜۨۘۧ۟ۘۘۘۧۡۘۤۛۜۖۜۦۘۥ۬ۨ۬ۚۙ۫ۦۛۙۥۦۚۢۨۘۖ۬ۦۘۧۜۨۗۛ۟ۦۨۦ۬ۘۜۤ۟۫ۘۤۙۚۢۘۦۚۡۡۨۦۘۧۦ۬ۛۚۖۘ۫ۧۨۗۘۚۤۤۥۦۦۢۖ۠ۡۘۥۡۥۘ۫ۘۨۘۘۜۡۘۦۗۗ۫۟ۢۘۦۘ۫۫ۦۘۗ۠ۛۥ";
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$showUpdateErrorDialog$1(DialogInterface dialogInterface, int i) {
        String str = "۟۫ۗۢۡۡۥۧۨۙ۟ۜۘ۬ۧۖ۬ۡۖۘۢۢ۟ۜۘۥۧۡۘۧۙ۫ۘۢۤۨۘۘۜۨۢ۫ۥۨۜۚۤۡۡۥ۟۟ۜ۫ۨۗۤ۬ۜۘۨۤۨۘ۠۬ۛۜۦۤۜۨۘ۠۬۠ۛۗۨۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 179) ^ 629) ^ 135) ^ 657) ^ 992) ^ 483) ^ 735) ^ 101) ^ 917) ^ 991) ^ 878) ^ 78) ^ 100) ^ 345) ^ 46) ^ 747) ^ 281) ^ 495) ^ 438) ^ 991) ^ 319) ^ 102) ^ 443) ^ 149) ^ 550) ^ 817) ^ 633) ^ 535) ^ 587) ^ 992) ^ 193) ^ (-681508254)) {
                case -1262955558:
                    str = "ۦۡ۬ۡ۫۟ۦۘۢۛۧۡۘ۟۠ۜۘۚۜۡۘۢۨۧۙۨۛۖۢ۟ۗۘۤۡۡۘۘۖۥۘۨ۬ۢۤ۬ۜۦ۠ۤۧۨۖۤۜۘۘۛ۫ۥ۫ۜۡ۠۬ۚۖۘ۠ۜ۬۫۠ۡۘ۫ۖۗۛۛۘۘۙۗۦ۬ۜۘ۟۫ۚۨۚۥۘۨۘۤۦۙ۫ۗۖۙ۫ۥۡۘۖۘۖۘ۠ۥۡۘۤۙۗۦ۠۠ۛۗۨۘ۟ۙۛ۬ۗۘۘ۟۬ۜۘۤۨۨۥ۬ۧۥۨۢۨۜۛ";
                    break;
                case 58401023:
                    return;
                case 517586736:
                    str = "ۜۨۗ۟ۘۙۖۜۦۘۡۧ۬ۛۜۘۘۦۗۥۘۛۥ۠ۢۙ۬ۢۤۢۚ۟۠ۤۢۥۖۗۡۜۧۧۧۤۦۜۤۖۘۤۦ۫ۤۗۙ۫ۢ۬ۙۨۘۖۘۧۜ۟۫۫ۦۘ۟ۙ۬ۚ۬۟ۨۦۤۚۧۘۖۘۖۘۘۗۖۘ۟ۛ۟ۥ۠ۗ۟ۜۡۘ۠ۗۚۗۛۗۢۡۧۘۤ۠ۘ۬۫ۧۚۘۘۨۤ۟۟ۙ۬۟ۡۙۡۨۘۖۨۡۘۛۗ۠ۢۘۚ۟ۨ۬";
                    break;
                case 1688364788:
                    System.exit(0);
                    str = "ۧۧۜۜۨۜۘۛۘۥۖۜۘۤۜۖۡۨۧۘ۫ۜۦۧ۠ۦۡۜۤۨۜۛ۟ۖۦۡ۬ۧۤۗۖۥۙ۫ۡۧۡ۟ۜۥۘ۫۠۬ۢ۬ۢۢ۬ۤۦۥۚۛۧۧۜۥۢۜۦۛۙ۟ۗۨ۟۠";
                    break;
            }
        }
    }

    private static native String native_Check(Context context, String str, String str2);

    public static void setModeSelect(String str) {
        String str2 = "۟۬ۨۘۢۨ۬ۛۙ۠۫ۘۥۘ۬ۛۘۙۢۦۘۙۚ۠ۤۧۖۡۧۥۦۨ۠ۘۘۨۚ۬۠ۖۤ۠۠ۚۢ۬ۤۥ۫۫ۢۦۦ۠ۦۘ۫ۜۛۚۥ۫ۧۖۦۘۦۗۚۙۨۢ۠ۗۜۧۦۦ۟ۘۖۡۜۖۛۘۡۘۢۡۤۦۗ۫۟ۡۗۛۦۗۥۧۡۨۦۘ۬۬ۥ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str2.hashCode() ^ 120) ^ 779) ^ 667) ^ 939) ^ 685) ^ 61) ^ 966) ^ 949) ^ 491) ^ 92) ^ 549) ^ 410) ^ 385) ^ 581) ^ 353) ^ 844) ^ 660) ^ 335) ^ 220) ^ 825) ^ 494) ^ 440) ^ 448) ^ 197) ^ 604) ^ 927) ^ 153) ^ 872) ^ 104) ^ 588) ^ 846) ^ 1528653804) {
                case -1617245698:
                    str2 = "ۛۖۡۘۗۡۘۜۙۘۘۜۖۦۘۖۜۦۘۦۙۡۨۘۥۧۡ۫ۤۗ۠ۧ۟ۢۘۖۨۘۨۚۡۘ۫۠ۤ۠۟ۡۨۘ۟۬ۖۘۡۦۘۡۡۥۘۧۜ۟ۡۨ۫ۢۤۙۧۚۦۘۚۘۨۧ۬ۨۘ۟ۙۤ۠ۙۜۢ۫ۜۘ۟ۛۚ۫ۚۦ۬ۛۦۘ۟۬ۢ۟۟ۦۙۤۢۗۘ۬ۛۢ۟";
                    break;
                case 1544976147:
                    ModeSelect = str;
                    str2 = "ۦۧۦ۠ۧۡۧۜۚۜۤۧۢ۬ۖۢ۫ۙ۬۟ۤۨۢۤ۠ۦۚۤۦۧۦۜ۟ۜۖۜۤۗۙۧۥ۫ۗۥۘۤۦۨۜۢ۟۫ۖۡۘۥۦۜۘۗۜۤۘۚۚۧۖۡۘۚ۫ۚۖۙۗۦۤۖۘۡۦۥۥۨۘۘۘۙۡۘۜۛ۟ۛۥۘۘۥۗۤۢۗۙۜۧۘۘۘ۠ۥۘۖۡۜۛۨۥۘۡۨۜۧۘۡۗۛۗ۠ۙۥ۫ۨۘۘۢۦ۠ۥۨ۠ۨۧۘ۫ۘ۟";
                    break;
                case 1924966772:
                    return;
            }
        }
    }

    private void showInvalidKeyDialog() {
        LinearLayout linearLayout = null;
        TextView textView = null;
        TextView textView2 = null;
        AlertDialog alertDialog = null;
        GradientDrawable gradientDrawable = null;
        int i = 0;
        int i2 = 0;
        Button button = null;
        String str = "ۨۖۨۘۥۥۗۚۖۧۘ۠ۤۡۡۧۛۜۥۥۘۗ۫ۥۙۚۜۧۖۚ۠ۨ۟ۘۢۧۜۡۥۘۖۨۧۚۡۘۡ۟۟ۢۜۥۛۡۥۜ۬ۦۘۡۦۗ۬۟۬ۖ۠ۡۘۢۤۦۘۖۤۨۘۧۙۘۘۛۚۘۚۨۘۘۡ۟ۥۜۧۙۛۦۜۘۥ۟ۧۗ۟ۛ۫ۦۢۙ۟ۘۘۗ۠ۖۘۤۗ۟ۘۧۤۧ۫ۖۘ۟ۘۥۘۙۧۤۛ۫ۚۡۥۧۘۦۤۙ۟ۖ۟ۛ۟ۛۨۖ۟";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 466) ^ 641) ^ 243) ^ 810) ^ 660) ^ 472) ^ 133) ^ 674) ^ 329) ^ 518) ^ 656) ^ 494) ^ 706) ^ 433) ^ 170) ^ 554) ^ 69) ^ 106) ^ 360) ^ 537) ^ 336) ^ 363) ^ 825) ^ 635) ^ 181) ^ 494) ^ 403) ^ 700) ^ 378) ^ 177) ^ 484) ^ 1192926702) {
                case -2083610170:
                    alertDialog.getWindow().setBackgroundDrawable(gradientDrawable);
                    str = "ۜۥۖۢۚۡۘ۠ۢۥۢۙ۫ۧۨۥۘۦۘ۟۫ۜۡۢۚۘۘ۟۠ۘۦ۟۠۫ۡۧۢۨۥ۬ۘۨ۠ۨۨۦۥۘۢۗۢۘۘۧۧۢۢۥ۬ۨۧۦۨۚۦۖ۫ۚۦۘۛۦۖۛۢۢۨۛۨۘۘۗۘ۟ۖۢۡۡۖۨ۠ۧۖ۠ۜ";
                    break;
                case -1580755802:
                    linearLayout.setBackgroundColor(-1);
                    str = "ۥۧۗۨۧۦۘ۬ۦ۬ۘۜ۠ۦۘۘۥ۟۬ۛۚۥ۠۬ۗۙۡۤۡۢۡ۬ۘۘ۠ۥۙۘۥۨۙۤۚ۫ۤۖۥ۬۫۠ۜۘ۬ۖۜۘ۫ۨۥۜ۠ۘۘۨۨۜۘۖۦۖۘۡۛۗۨۘۚۨۦۘۧۢۖۘ۬ۤۨۘۨۡۥۘۚ۠۫ۧۜ۟";
                    break;
                case -1498561453:
                    alertDialog = new AlertDialog.Builder(this).setView(linearLayout).setCancelable(false).setPositiveButton(getString(C0931R.string.str009c), (DialogInterface.OnClickListener) null).create();
                    str = "۠۫ۥۘۘۗۙۚۡۦۘۙۚۖۤۛۤۚۡ۟ۢۘۡۥۢۥۨ۬ۖۘ۫ۙ۫ۨۢۤۦۤۦۘۘۖ۟۠۬ۖۘۡۖ۠ۥۙۜۘۨۨۤۗۘ۬۟ۛۦۘۜۜۦ۟ۖۢۘۨۘۛۨۤ۟ۤۨۗۧۘۖ۟۟۬ۖۘۢۚۢۤۥۧۘۧۚۨۘ۫ۛۦۘۖ۠۬ۧۤۙۧۥۡۘۗۦ۬ۨ۠ۢ۠ۦۥۘۢۥ۟ۨۙۥۘۙ۟ۚ۬ۦۖۢ۫ۤۨۥۧۖۧ۬ۚۘۨ";
                    break;
                case -1347408159:
                    return;
                case -1272336574:
                    linearLayout.addView(textView);
                    str = "۬ۗۤ۫ۧۦۖۗۧۖ۫ۚۦۢۥۖۧ۫ۢۢۙ۠ۛۜۘۦۜ۬۠ۙۜ۬ۘۧۥۢۧۗۜ۬ۙۡۜۘ۠۠۠۫ۤۜۘ۠ۡ۟ۥۡۘۘۜۚۥۚۚۖۗۧۦۚۘۧۘۘ۬ۙۖۖۥۨۖ۬۠۫ۚۡۥۢ۠ۜۨۘ۟ۗۦۦۛۙۤۢ۟ۨۙۛۧۥۜ۟۫۫۠۫۟ۦۡۘ۫ۘۨۘۨۧۘ۟ۖۧۤۗ۬ۨۚۖۤۦۘۗۢۚۘۜۖۘ۫ۢۤ";
                    break;
                case -1212890722:
                    textView.setText(getString(C0931R.string.str0044));
                    str = "۟ۙۡۗۖۘۚۥۚ۫ۢۙۧۖۜۥۛۙۦۦۥۛ۫ۨۘۢۘۨۡۥۗۙۘۘۨۜۤۡۗۧۛۡۦۘۘۡۘۘۗۘ۠ۗ۟ۚۘۦ۬ۖۚۙۚۗ۟ۖۘۨۗۜۘۜۜۦۨۧ۠ۢۥۜۙۨۡۙ۫ۦۙۖۨ۬ۗ۫ۡۢ۬۬ۙۥۘۦ۫ۦۢۦۨۘۡۦۘ۬ۥ۠ۥۧۧ۠ۚۨۡۛۨۨۘۥ۠ۙۖۦۖۜۘ۠۬ۡۘۤۖۧۗۙۤۗۛ۠";
                    break;
                case -1166745365:
                    String str2 = "ۛۛۖۘۢۤۘۘۢۡۦۘۘۧۡۘۨۛۖۨۙۤۥۧۘ۫۬ۜۙۨ۠ۧ۬۫ۖۘۘۘۧۖۦۘۛۙ۟۠ۚۨۡ۟ۜۜ۫ۨۙۛۘۜۥۥۚۜۡ۠ۨۜۛۡۦۡۘۚۡۚۡ۟ۦۘۥۡۧۘ";
                    while (true) {
                        switch (str2.hashCode() ^ (-707563094)) {
                            case -121809605:
                                str2 = "ۜۚ۬ۢۧۥۘ۫ۛۨۚ۬ۤۛۡ۬ۤۗۥۘۧۙۥۘۙۛۧۗۨۛ۠ۜۦۛۙۨۖۡۙ۟ۛۢۖۨۖۖۖ۫ۤۡۜۢۗۜ۠ۧۢۡ۫ۘۦۦۖ۫ۖۧۨ۠ۥۡۚۖۘۗۖۜۥ۠ۖۘۦ۬ۥۘۜۗۜ۬ۙۢۡۤۛۨۜۘۙۘۨۘۘۜ۬۫۫ۦۢ۟۠";
                            case 198587278:
                                String str3 = "ۤۖۡۘۗۧ۬ۢۙ۠۠ۤۤۛۡۘ۟ۛۧۥۖۘ۬۠ۙۤۦۘ۬ۙۛۤۦ۬ۘۚۤ۟۠ۦۘ۟ۖۦۘۘۦۨۘ۬ۗۜۘۜۧۛۛۜۨۘ۠ۧۨۨۘۨۘۢۖۙۦۘۨ۫ۛۜۦ۫۫ۘۖ۬ۚۤۧ۠ۦۧۢۛۙۗ۬ۦ۬ۚ۟ۥۘۘۜ۟ۨۘ۬ۧ۫۠ۥۖۢۡۥۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-368196992)) {
                                        case -1498068064:
                                            String str4 = "۬ۜۨۤۤۢۙۙۘۖۚۡۘ۠ۛ۠ۗۤۤۙ۬ۦۘۚۤۦۘۥۛۖۘۜۤ۫ۚۧۦۘۙ۟ۙۧ۬ۙۖۥۖۙ۠ۛۤۡۘۧۚ۫ۤۡۤۧۤۡۡۨۥۘۘۗ۬ۨ۬ۛ۠ۖۘۤۗۡۘ۟ۜۧۘۜۗۚ۠ۛۘ۠ۡۘۧۗۘۚۡ";
                                            while (true) {
                                                switch (str4.hashCode() ^ (-1469508490)) {
                                                    case -240048348:
                                                        str3 = "ۥۨ۬ۡ۬ۦۘۙۜۙۜۜۧۘۛۖۚۜۖۤ۟ۙۤۡۨۤۚۦۨۘ۠۬ۙ۬ۨۜۦۘ۬۟۠۟ۜۨۤۘ۠ۘۘۤۤۤ۠ۦۢۧ۟ۛۜ۫ۧۧۜۦۤۖۘ۟ۘۧۖۚ۫ۗۡ۬ۗ۫ۧۘۤۘۘۗۡۨ۟ۥۖۘۜۢۧ۟ۨۘۘ۫ۦۚ۫ۗۦۥۗۗۨۡۨۙۙۚۖۤ۠۬ۥۗۤۧۨۡۖۙ۠ۦۘ";
                                                        break;
                                                    case 422560332:
                                                        str3 = "ۥۙۦۘ۬ۨۗۙۡۡۘۦۢۜۛۚۘۚۨۘۥۙۤۤ۫۟ۤۜۖۘۧۗۦۘۤۥۥۘۨۦۜۘۜۜۜۢۗۘ۠ۜۨۘ۫ۘۖ۠ۜۛ۟ۗۛ۫۬ۡۘ۟۟ۤ۠۫ۢۦۘۤۖۛۚۗۖۘۚ۟ۜۘۚ۬ۗۡۛۡۘ۬ۗۛۤۛۘۘۡۤۦۘۛ۬ۗۛۧۨۘۖۢۡۛۗۙ۟ۛۛۜ۫ۗۡ۫ۦۘۢۚۦۚ۟ۘۘۜۖۨۢ۫ۖۛ۟ۡۦۙۡۘۤ۠ۘۤ۫ۦ";
                                                        break;
                                                    case 928431983:
                                                        str4 = "ۛ۬ۨۨۡۢ۠ۨ۫ۥۡۤۜۨۧۘۗۥۘۡ۫ۧ۫۫ۜۨۛ۫ۨۢۜ۬ۨۗۦۡۙۜۜۤۗۥۜۘۛ۬ۘۘۧۗۤۛۢۖ۫ۙۦۘۨۖۙۨۡۜۘ۠۫ۥۘۜۛۗۜۛۥۘۦۖ۠ۥۥۘۦۛۡۘۥۖ۫ۗ۬ۚۤۖۢۨۤۤ۠۠ۥۘۧۥۖۚۤۨۘۢۚۦۤۙۥۘ";
                                                    case 1392232608:
                                                        String str5 = "ۖۤۢۤ۠ۨۘۤۜۘ۟ۗ۟ۧۛۢۨۨۨۡ۬ۙۜۢۧ۫ۦۚۦۙۜۦۧۘۗۘۦ۠ۧۥۘۚۛۦۥۗۜۘۨۛۨ۟ۙۥۢۙۘۨ۫ۘۘۤۡۘۘ۟۠ۦۘۦۢۥۘۨۖۛ۠ۧۨۘۧۤۢ";
                                                        while (true) {
                                                            switch (str5.hashCode() ^ 441688803) {
                                                                case -788769467:
                                                                    str4 = "ۗ۬ۙۗۛۛ۠ۤ۫ۛۥۙۦۢۜۚۡ۟ۤۤ۠ۨۙۛۛۥۥۙۨۚۘۧۦۚ۬ۙ۬ۥۘ۠۟ۡۘۜۙۙۥۙۦۘۘۢۖۘۨ۫ۡۘۗۘۢۨۚ۠ۤ۬۠ۨۨۜۘۤۙۦۘۜ۬ۚۡۘۧۙۢ۬ۡ۠ۗۡۚۥۘ۟ۢ۫ۛۧۜۜۤۖۢۜۦۨۗ۫ۖۥۖۛ۟";
                                                                    break;
                                                                case -225050990:
                                                                    str5 = "۫ۘۚ۟۟ۨۚ۟۟۬ۚۙۖۘ۠ۗۜۘۙۡۥۖۧۡۘۚۥ۠۫۫ۛۖۚۥۛۤۚۤۡۗ۟ۨۗ۠ۡۙۡۘۘۧۦۨۤۛۜۘۤ۫ۨۗ۠ۥۘۙۨۧ۠ۜۨۘۤۙۥۘ۟ۦ۟۫ۙۨۘۢ۟ۛۡۨۗ۠۫ۥۘۚ۠ۘۘۛۧۜۧۘ۫۫ۗۨۘۜۡۖۤۧۧۧۗۢۚۢۗۦ۠ۘۘۙۘۖۜۘۗۗۜۖۘۖۤۤۧ۫ۥۖۤۥۧۜۘۨۗۚ";
                                                                case 303146274:
                                                                    str4 = "ۙۛۚۡۚۨۘۧۧۙۛ۠ۖۘۗۙ۬ۖۖۖۜۗۘۘۥۙۥۢۥۦۘۙۛۘۥۖۦۘۥۜۡۘۖۤۡۘۧۖۨۢۧۖۘۗۡ۠ۚۚ۬ۖۜۘۗۡۦۧۡۥۘۚۖۚۚۦۘۛ۬ۚۚۖۙۤۧ۬ۙۤۨۨۙۥۚ۟ۚۥۧ۬ۧۥۘۘۤۘ۬۠ۢۗۨ۬ۚۜۜۢ";
                                                                    break;
                                                                case 720718466:
                                                                    String str6 = "ۜۢۙۛۖۖۘۡۘۨۘۨۛۥۘۢۨ۟ۖۜۜۙۢۘۨۘۘ۟ۖۘ۫۬ۡۘ۠ۖۧۦۤۡۘۚ۫ۦۘۛۧۤۦ۟۬ۧۦۜۘۙۨۗ۬ۙۛۛ۠ۧۢۘ۠ۨۤۡۘۚۙۡۖۜۛۤۦۡۚۦۘ";
                                                                    while (true) {
                                                                        switch (str6.hashCode() ^ 346408454) {
                                                                            case -1807264292:
                                                                                str6 = alertDialog.getWindow() != null ? "ۛۦۡۘ۠۠۫ۤ۬ۢۧۡۘۙۤۥۤۖۤ۫۟ۧ۫ۤۢ۠ۦۡۘۡۖۖۢۥۥۧۚۦۘۡۦۧۘۡۙۡ۬ۙ۫ۦۖۥۘۤۤۜۢ۠ۘۘۦ۬ۤ۫ۡ۠ۖۙۨۘۘ۬ۖۘ۫ۘۖۘۘۛۨۙ۠ۖۘ۫ۜ۫ۛ۠ۦۘۘۖۜ۟ۘ۠ۦ۬ۡۘۤۚۚۙۦ۫ۢ۠ۥۘۖ۫ۢ۫ۢ۟ۡۨ۫ۡۨۜ۬ۖۧ۠ۙۚۧۜۚۡۜۦۧ۬ۘۘۡۗۘۘۖۜۘ۠ۘ۬" : "ۨۦۗۖ۟ۘۘۥۢ۟ۛ۠۫ۜۘۨۧۡۚۗۖۘۡۨۖ۬ۚۘۘۖۥۨۘۚۙۛ۫ۥۧ۫ۛ۬ۙ۬ۢۢ۠ۤ۬ۛۙۛۤۙۙۦۢ۫ۤۜۤۢۨۛۡۘ۠ۨۨۛۗۦۖۤۘ۟ۗۡ۠ۡ۟۫۬ۖۥۖۘ۫ۗۨۛۥۥ۬ۜ۬ۦۨۥۙۛۘۘۦۥۥۘۖۚۦۘ۬ۖ۫ۡۥۖۘۧۨۥۙ۟ۖۧۚ۟";
                                                                            case -749758583:
                                                                                str5 = "ۛۤۛۦۢۙ۬ۖۖۘۚ۬ۡۘ۫ۥ۠ۢۤۜۤۚۚۘ۫ۗۤ۫ۘۘۖ۠ۡۘۛ۠ۘۛ۫ۖۘۦۧ۬ۙۗۡۨۙۡ۠ۡۘۘ۫ۢۘۚۗۜۛۘۡۘۨ۠ۦۘۡۥۧۘ۫ۨۡۘۙ۫ۘۖۜ۫ۨۘۖۘ";
                                                                                break;
                                                                            case 1801393346:
                                                                                str5 = "ۗۡۧۤۜۘۗ۬ۧۗۧۦۥۦۥۘ۫ۜۦۘۖ۫ۖۨۢۛۗۜۥۘ۬ۘ۬ۢ۠ۦۘۗۧ۠ۢ۠ۜۘۨۤۘۗۦۚۨ۫ۦۜۚۘ۬ۖۘۘ۫ۜۨۘۦۛۧۨۚ۫ۥۚۢۤۚۤ۟ۗ۠ۜ۟ۡۧۡ۠۟۬ۤۤۧۖۨۙ۟ۙۧ۠ۨ۠ۢۘۨ۬۟۠ۨۡۤۘ۠ۖ۠ۨۘ۟ۦۖ۬ۘۗۘۥۡۚۦۘۘ";
                                                                                break;
                                                                            case 2102499391:
                                                                                str6 = "۫ۛۙ۫ۡۘۘۥۢ۠ۘۤۗۚۧۧۘۖۘۘ۬ۤۗ۠ۡۘۜۛۤۖۛۨۘۚۖۚۛۡۥ۠ۢۖ۠۠ۜۥۨۦۢۢ۟ۢ۠ۚۙۥۡ۫ۚۦۚۖۤۡۧۘۖ۠۠ۤۧ۟۟ۤۨ۠ۚۥۥۦۨ۟ۚۙۦۗۦۘۥۡۦ۟ۤۤ۠۟ۥۤۥۘ۟۟ۨ۫ۛۥۘۦۨ۬ۡۤۤۛ۟ۙۖۘۢ۫۠ۦۙۙۨ";
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        case -940632068:
                                            str3 = "ۗۢۜۘۧۖ۟ۦۢۨۙۙۘۤۙۡۡۡۧۘۧۛۡۘۥۗۢۛۨۖۘ۟ۚ۫۫ۘۧۘۧۛۖۘۚۘۢۢۥۡۘۖۡۚ۫ۤۖۙۡۖۜۙۢۚۦۘۖ۠ۘ۬ۜ۫۠ۚۙۜ۬ۤۜۡۗ۠ۘۦ۟ۦۘۥۢۧۧ۠ۙۨۙۜۘ۬۫ۧۤۤ۟۠ۤۤۨۨۘۦ۬۟ۧ۫ۡۗۙۡۥۘ۬۟ۘۤۤۜ۠ۦ۬";
                                        case -407954491:
                                            str2 = "ۙۡۙۦۖۖۚۜۡ۟ۘۘۘۧۡ۬ۜ۟ۨ۬ۜ۠۠۬ۘ۠۬ۚۨۘۘۘۡۗۧۥۢۜۘۥۡۦۚ۫ۖۛۡۗۘۧۢۦۡۡۘۢۧۙۚۦۥ۠ۗ۬ۘۢۘ۠ۢۖۘۧۨۜۘۨ۠ۦۤۢۗۡۡ۬ۜۜۜۘۤۗۨۜ۟ۧۥۤۡۘ۫ۡۨۙۚۡۥ۟۬ۧۗۙۥۜۦۘۙۚۖۡۛۦۖۛۙ۠۠ۡ۬ۥۨۘ";
                                            break;
                                        case 1491874368:
                                            str2 = "ۘۥۨۘۙ۠ۜ۬۟ۨۘ۟ۙۦۘۜۧۥۦۛۡۘۨۖۢۖۢۘۘ۠ۥ۠ۛۙۜۛ۬ۧۗۧۡۘ۫۠ۜۘۤ۬ۨۥۙۖۨۘ۫ۚۘۚۘۡۚ۬ۡۛۧۦۘۥ۬ۗۗۖۖۨ۬ۦۘ۬ۙۖۘۜۡۧۘۛۢۥۚۨۦۘۗ۠ۤۧۙۥۚۚۦ";
                                            break;
                                    }
                                }
                                break;
                            case 1426635103:
                                str = "۠ۥ۠ۦۗ۠۫۟ۥۗۙۗۘۘ۟ۙۦۜۘۖۜۚۜۜۨۡۗۥۘۗۜۗۛ۠ۖۘ۬۫۫ۥۧۥۘۧۡ۟ۤۥۖۦۘۖۘۗۦۖۙ۠ۡۥ۟ۤ۬ۘۡۘۤۛۛۧۜۘۚ۟ۖۘۤۙۧۜ۬ۦۘۤ۟۬ۛۧۛ۬ۡۜۙۘۘۘ۬ۢۛۨ۬ۗۥۖۦۘۜۘ۫۟ۛۦۤۘۗ۠ۚۚۨۥۘ۟ۛۨۘ۫ۥۘۘۖۦۨ";
                                continue;
                            case 1905343523:
                                str = "ۦۙۨۘ۠ۤۢۡۦۘۥ۫ۧ۫ۨۧ۬ۚۧۨ۠ۧۥۢۖۡۨۘۢۤۦۘ۬ۤۜۘۢ۬۬ۦۖۘۘۧۥۡ۟ۥۘۘۛۚۙۙۦۖۙۚۡۛ۬ۖ۟ۤۚۗۡۘۡ۫ۦۘ۟ۤ۟ۡۛ۫۫۫ۦۘۢۚۖۤ۠۫ۖۙۨۘۨۤۦۘۢۦ۟ۦ۫۬ۜۘۘۗۡۙۤۖۜۡۨۤ۟ۘۢۖۢۢ۫ۘۘۧۗۚ۟ۗۘۢۖۚۤۨۨ۬ۜۛۖۧ۬ۙۧۦ";
                                continue;
                        }
                    }
                    break;
                case -1120093389:
                    gradientDrawable.setColor(-1);
                    str = "ۜۘۤ۟۠ۡ۠ۨ۬۠ۧۖۚۡۖۘۚ۟ۘۥۖۜۤۡۘ۠ۤۙۖ۫۫ۜ۫ۙۜۦۖۘۧۢۖۗ۫ۜۘۛ۫ۡۘۡۢۗۧۦۧ۬ۡۢۧۢۨۡۧۘ۫ۖ۫ۚۛۡۥ۠ۥۘ۟۟۫۬ۗۚۜۖۖۘۧۛ۟ۙۨ۫ۙ۟۫ۛۤۦۤۡۘۡ۬ۖۘۤ۫۬۠ۙۡۘۜۢۘۖۘ۠۟ۜ۬ۦۛۘۖۚۧۘۛۖۘ";
                    break;
                case -904448599:
                    i2 = m80dp(this, 40);
                    str = "ۖۖۨۘ۟ۖۘۥۦۜۗۤۤۢۗ۬ۦۗۦۙ۫ۗۖۡۨۘ۟۫۬ۢ۟۟ۧۧۦۥۘۚۢۥۘۚ۠ۛۛ۟ۨۘۦ۟ۦۚ۬ۢۥ۫ۤۧۖۦۘ۟ۘۧۗ۫ۤۘۡ۟۫ۧۘ۟ۤ۬ۦۨۘۤ۟ۦۘۤۦۦۘۚۘۧۘۗۧ۬۟۫ۙ۠ۛ۠ۚ۠ۛۙۡۘۜۖۤۚۚۥۘ۬ۙۦ۠ۗۡ۬ۙ۬ۥ۫ۡۥۜ۟ۨۥۦۥۗۥۧۙ۫ۜۨۜۘۘۙۖۘ";
                    break;
                case -687962007:
                    gradientDrawable.setCornerRadius(m80dp(this, 4));
                    str = "۬ۢۢۢۛۧۙۡۛۥۨۦۚ۬ۨۛۖۤۜۢ۬ۢۙۛۗۜۘۤۘۖۘۖۤۥۘ۟۟ۦۢۛ۠ۦۖۜۘۦۘۛۙۚۨۘۡۚۥۘۛۡ۠ۗ۬ۜۘۥۨۡۘۘۦۦۘۤۚۘۛۦۨ۟۬ۢۤ۬ۚ۟ۚۡۛۧۦۗۙۨۢۧۛ۬۠۬ۗۨۘۦۖۘ۫ۨۨۘۨۨ۠ۜۤۦۘۡۘ۟ۤ۠ۧ۬ۗۜۤۖۜۖۦۦ";
                    break;
                case -657371735:
                    textView2.setTextSize(16.0f);
                    str = "ۘۛۤۙۤۜۥ۠ۜ۬ۥ۟ۖۡۜۖ۬۬ۤ۬ۢۖۢۥۛۙ۠۠ۨۘۛۜۖ۠ۙۜۘۦ۫ۗۤۡۧۛۖۦۘۖ۬ۘۘۨۥۡۘۤۖۨ۬ۨۧۘۢۘۦۘ۠ۧۖۘۤۖ۬ۥۡۡۛۤۜۘۖۧۥۘۢ۟ۗ۬ۥۘۢۦۖ۟ۛۘ۟۫ۗ";
                    break;
                case -549808025:
                    String str7 = "ۨۖۡۨۡۙۤۛۡۖ۟۠ۨۜۤ۬ۜ۠۫۟ۨۘۧۛۥۙۛۡۘۖۡۘ۬۠ۧۜ۟۫ۧ۠ۡۘ۬۫ۘۘۛۖۘ۟ۚۡۘۨ۫ۜۥۜ۫ۦۜ۠ۢۚۨۖۚ۬ۧۚۜۘۡۡۜۜۛۙ۫ۖۘۤۜۖۘۨ۫ۗۢۛۛۛۚ۫ۥۦۢ";
                    while (true) {
                        switch (str7.hashCode() ^ 700988661) {
                            case -656017101:
                                str = "ۗ۬ۡۘ۠ۛۦۘۥۛۢ۟ۙ۟۫ۥۖۘۘۡۖۘ۠ۤۨۘۧۖۧۢ۬ۙۘۤۧ۟ۧۜ۠ۦۗ۠ۘۘۜۡۢۥۙۙۤۢۥۘۥۢۛۚۥۗۜ۬ۖۘۦ۟ۜۥ۬ۡۘ۟ۙ۬ۧۛ۫۬ۢۤ۬۫";
                                continue;
                            case -560731677:
                                str7 = "۟ۦۙۜ۟ۨۚۛۧۚۚ۫ۢ۫ۦۦۜۡۧۙ۠ۖۘۦ۫ۡۙۙۙۜۧۦۜۖۚۖۧۧۨۘۗۚۜۨۧۦۗۖۤۡۨۨ۠ۡۧۘۡۜۙۘۖۡۘۦۗۡۘۥۢۘۡ۬ۖۘۥۡۧۘۙ۬ۨۘ۠ۙۜۘ۫ۜۖۧ۬ۧۨۤۡ۫ۥۛ۟ۤۡ۠ۢۡۘۥۥۥۘۢۘ۟ۙۨۘۘۚ۫۠۬ۘۚۡۜۘۨ۟ۘۘۚۗۧ";
                            case 1383206183:
                                str = "۟۟ۧۗۜۡۘۦۨۦۘۚۥۚۛ۠ۢۙۢۤ۠ۥۘۥۙ۟ۢۨۥۖ۬۠ۘ۬۟ۚۘۜۘ۟۬ۚ۠ۤۙۢۤۦۘۛۘۧۘۤ۬ۨۤۗۘۤۦۘۡ۫ۚۦۜۥۘۡۧۚۘۡۦۛۨۗۤۤۡۘ۟ۦ۟ۦۧۖۘ۠ۤۗۚۙۜۘۨ۟ۛ۟ۖۘ۠ۥ۫ۗۛ۬ۦۖۜۘۤۖۖۘۧۗ۟ۢۗۙ۫۬ۖۘۧۥۥۘ۟ۛ۬ۦ۫۠ۥۜۜۘ۫ۤۛ۬۠ۨۘ۫ۨ";
                                continue;
                            case 1456614133:
                                String str8 = "ۨۤ۟۟ۦۗ۬ۘۘ۬۟ۦۖۢۥۘۘۤۖۤ۠ۨۘ۟ۙۨۚ۠ۢ۟ۤۨۤۜۚۥۗ۟ۙۦۤۖۤۖۘۗۚۙۢۦۘۛ۠ۥۘۘۨۨۘ۟۫ۦۘۦۜۧۚۥۛ۫ۜۘۘۘۤۘ۠ۘۚۘۢۜ";
                                while (true) {
                                    switch (str8.hashCode() ^ (-6605088)) {
                                        case -1972809986:
                                            str7 = "ۛۥۥۘ۟ۘۗ۟ۗۘۘۥۨۘۦۦۡۛۦۥۚۚۥۘۡۥۨۘۡۘۜۜۜۢۗۜۜۘۨۡۧۘۧۚ۟۠ۦۘۧۚۜۘۘۨۧ۟ۡۘۘۨۛۢۤ۟ۡۜۡۗۙۚۤۢۧۧۤ۟ۘۘۧ۫ۢۙۙۤۗۥ۬ۥۥۘۡ۫۬ۤۗۜۘۥۨۦۙۥۘۢۧۥۘ۟ۚۤۤۙ۠ۦۙ";
                                            break;
                                        case 34255995:
                                            str8 = "۬ۤۦۘۛ۟۠ۘۘۘۥۡۢۗۧۨۧۤ۬ۜ۟۟ۤۥۖۖۗۙۜۢۘۗۘۜۖۛۗۧۤۦۘۘۘۙۜۚۗ۬ۥۘۤۦۘۘۗۗ۬۬ۚۗۥ۬ۤۜ۠ۘۘۖۚ۟ۗۗۘۘۧ۟۠۠ۡ۟ۛ۟ۗۘۘۛۚ۠ۥۨۙۦ۟ۘۘ۬۠ۨۘۨۙۗۖ۠۠ۨۜ۬ۗۙۙ";
                                        case 785221366:
                                            str7 = "ۧۗ۠ۗۙۥۦۨۦۘۦۚۡۢۗۦ۠ۘ۟ۜ۫ۦۛۜۖۦۦ۬ۜۚۚ۬ۨۘۦۚۦۘۚۧۢۨۥۗۦ۫۬ۥۖ۟ۙ۬ۜۘۚۡ۬ۦۜۖۘۢۧۥۘۡۤۨۖۤۢۨۡۥۤۢۡۖۚۢ";
                                            break;
                                        case 1802164718:
                                            String str9 = "۟ۘۢۤۙۨۘ۬ۛۧ۠ۛۛۦۖۧۙ۠ۗۡۙۥۧۗۖۥۤۖۨۘۜۧۡۘۥۡۡۜۖۙۙۧۚۡۦۡۘۥ۬ۛۡۦۨ۟۠ۨۘۖۧ۫ۢۖۜۘۧۡۦۥ۬ۙۗۤ۫ۖۘۨ۠ۡۚۤۖۛۙۜۗۤۡۘۤۢ۠ۧۦۡۘۛۖ۬ۚۗ۠ۘ۟ۦ۬ۜۡۘۢۤۦۧۢ۠ۦ۫ۛ۬ۖۧۘ۠ۘ۟ۗۢۜۛۜۢۘۚۨۘۤۧۦۖۜۢۗۦۖ";
                                            while (true) {
                                                switch (str9.hashCode() ^ 874359100) {
                                                    case -1312557871:
                                                        str8 = "ۦۨۖ۟ۤۨۘۥۗۨۨ۟ۡۛۘۜۖۡۖ۟ۤۤۖۜۥۚ۠۬ۙۡ۬ۦۗۡۘۜۤۘۘۢۤ۠ۧۜۘۚۜۘۜۗۙۙۚۨ۫۟ۚۙۖۛۨۦۖۘۦۜۦۥ۠ۖۥۧۡۨ۬ۦۦۘۙۦۘۘۗۦۧۘۧۥۜۤۗۥۡۖ۬";
                                                        break;
                                                    case -778636053:
                                                        String str10 = "ۡۜ۬ۡ۬ۢ۠۠ۜۢۗۗۖ۬۬ۦۖۧۤۚۖۦۡۘۚۡۜۘۦۦۤۧۚۤ۠ۖۡۜۚۜۘۘۥۥۛۦۗۗۦۧۘ۠ۚۢۨۡۛۤۖۘۧۗ۫ۘۘۨۘۗۥۦۘۘۛ۫ۘ۟ۡۨۧۘۘۖۤۘۘۗۧۡۘۖ۠ۥۤۤۧۚۗۜۧۙ۟ۢۦۦۛۡۘ۠ۖۘۨۢۤ";
                                                        while (true) {
                                                            switch (str10.hashCode() ^ 1859972928) {
                                                                case -1144387193:
                                                                    str9 = "۫ۗۥۧۚۨ۬ۜۙۦ۫ۘۡۡۢۦۙۙۨۚۗۙۦۜۢۡۘ۠ۖۦۢۚۜۙۧۗۤ۠۬۫ۢ۠۬۠ۧۥۧۙۙۖ۬ۥۢۜ۠۟ۜۨۚ۬۠ۛۜۨۘۨۥۘ۟ۗۘۤۖۖۘۚۢۨۘۗ۬ۥۘ۟ۦۘۘ۠ۧ۬ۘۛۧ۬ۨۤۖۘۥۘۛ۟ۙۘۤۨۘۜۧ۬";
                                                                    break;
                                                                case 753557300:
                                                                    str9 = "۟ۘۨۢۦۘۨ۟۟۬ۘۘۚ۬ۨۜۢۜۥۗۖۗۗۛ۫ۦ۠ۧ۠ۧ۬ۡۨۤۘۖۘۤۢۜۚ۟ۚۜۦۨۘ۠۟۬۟ۥۦ۬ۡۛۜۦۙۘۤۡۦۙۢ۬ۖۙۛ۟ۗۚۗۖۘۥۡۧۘۥۤۨۦۢۜۥۡۙۗ۬ۗۖۥۡ";
                                                                    break;
                                                                case 1152724918:
                                                                    str10 = "۫۫ۢۦۧۧۗ۬ۦۘ۟ۖۤۥ۟ۜۦ۠ۗ۬ۘۨۙۧۘۘۜۡۜۘ۬ۖۖۢۦۜۗۧۤۢ۫۫ۜ۟ۡۢۥۤۚ۟ۖۗۤۧ۬ۨۘ۠ۘۜۘۖۘۦۘۧۨۧۨۜۗۙ۫ۢۖۘۨۥۖ";
                                                                case 2064241750:
                                                                    String str11 = "ۜۧۡۖۖ۫۟۟ۥۘ۫ۤۨۨۜۧۤ۫ۦۘۦۙۦۨۙ۫ۛ۬۬ۙۨۗۦۨۙۗۥۥۘۖۦۨۘ۫ۧۧۛ۠ۨۘۙۤۡۘۙۦۚ۫۟ۖۨ۫ۢۥۧۘۧ۠ۢۗۦۛۢۖۚۜۡ۠۬۠ۖۘ۠ۦۙۚۤۡۘ۬ۛۖۘ۬ۡۖۘۘۛۦۙۘۨ۫۠ۘۘۚۛۙۚۛ۫ۖۗۨ";
                                                                    while (true) {
                                                                        switch (str11.hashCode() ^ (-1803798362)) {
                                                                            case -1214771331:
                                                                                str10 = "۫ۙۖۘ۬ۨۨۦۚۦۘۖ۫ۛ۠ۖۗۖ۬ۜۘۛۛۨ۟ۦۢۖۖۛۙ۫ۖۘۢۘۜ۟ۦۧۘۘ۠ۢۨ۬ۢۚ۫۫ۨۥۗۜۤۗۡۗۨۜۙۜ۫ۜۦۘۨۤ۟۬ۙۨۤۜ۟۠ۜۧۙۡۜۜۙۖۙۘۖۘۙۛۡۤۦۚ۟ۖۚ۟ۙ۫ۜۘ۬ۗۗۜۘۦۨۧۤ۟";
                                                                                break;
                                                                            case -272229571:
                                                                                str11 = button != null ? "ۚ۟ۘ۟۬۬ۛ۫ۜۖ۟ۜۘۚۡۜۙ۫ۦۤۢۙۦ۫۠ۖۛۚۤۗ۠ۛۘۙ۬ۨۤۙۡۘۘ۠ۨۜۘۢ۫ۗۙۤۢۧ۫۫ۘۢۨۘۜۨ۟ۧۨۜۙۗۥۘۥۗ۫ۙۦۘۘ۫۠ۨۘ۟ۨۦ" : "۬ۘۦۜۥۥۜۤ۟ۛ۠۫۬ۘۥۢۘۦۘۢۘۥۘۦۛ۟ۚۢ۬ۙۙۘۥۡۘۜۥۧۘۤۥۦۖۚۖۙۤۦۨۚۜۛۘۦۘۚۗ۫ۦۖ۟ۜۜۘۘۖۥۖۘۙۧۘۘۗ۠۫ۨۖۙۧۦۘۥۛۚ۫ۦۧۘۥۛۖۗۜۙ۠ۖۧ۫ۜۘ۫ۛۢۘ۬ۦۘۡۧۜۘۡ۬ۜۘۡ۬ۙۘۨۢۥۥۥۢۡۛۦ۟ۗۧۧ۟ۦ۬ۛۥۚۨۜ۬ۛۧ۬";
                                                                            case -126645207:
                                                                                str11 = "۠ۖۡۘۘۨۡ۟ۤۦۡۨ۠۫ۧۜۘۘ۫ۜۘۗۛۘۘ۫۟۟ۖۦ۬۟ۚۛۥۥۨۘۧۢۦۘۖ۟ۖۘۙۜۗ۠۬ۨۖ۫ۡۘۘۗۢۨۜۦ۫۟ۥۘۤۗۖۘۡۖۡۘۢ۫۟ۜۚۦۘۢۢۚ۠ۡ۬ۥۨۗۥۚۚۥۦۖۘۗۖۜۘۜۖۖ";
                                                                            case 4289527:
                                                                                str10 = "ۗۚۡۘۙۗۘ۟ۧۚ۠ۡۥۦ۠ۡۘۘۘۘۥۦۧۥۘ۫ۡۘۗ۟ۨۘۜۦ۬۟ۘۘ۠۠ۛۜۨۡۚۚۘۘۧۘۢۢۙ۫ۥۚۖۘۚ۠ۥۘۥۘۥۜۨۨۘۜۘۘۘۡۥۧۛۚۖۘۢ۬ۥۘۙۦۦۛ۬ۨۤۦ۫ۢۢ۫ۙۨۘۧۘ۟ۘۙۖۢۢۙ۟۬ۚۙۚ۠ۡۨ۠ۙۛۥۘۨ۬ۙۚۤ۠۬ۥۘۘ";
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case -124769693:
                                                        str9 = "ۨ۠ۘۘ۫ۖۜۨۧۜۘۚۘۜۘ۬ۨۚ۟۬ۤۧۨۗۗۡۨۘۢۙۦۨۜۜۘۢ۫ۥۢۚۡ۫ۖ۫ۡۢۗۛۘۙۖۜۙۘۖۚۘۚۡۘۤۙ۟ۗۖۜ۫۫ۖۘۤۢۨۘ۟۟ۗۗۗۧۜۡۘۘ۬ۛۤ۬ۖۗۛۖ۬ۥۤ۬۬ۨ";
                                                    case 2084069003:
                                                        str8 = "ۛۛۜۢۗۗ۫۬ۧۖۙۗۗۡ۟ۚ۟ۡۘۜۗۢ۟۟ۤۗ۠۫ۖ۟ۗۧۢ۠ۡۘۙ۟ۖۤ۠ۡۦۤۛۥۦۙ۬ۦۧۙۖۘۜۨۖ۫ۗۦۜۜۡۡۘۨۖ۠۬ۨۥۜ۠ۗۛ۫ۥۜۘۚ۠ۨۚۙ۫ۗ۫ۖۘۧۙۙ";
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
                case -233394894:
                    textView2.setText(getString(C0931R.string.str0055));
                    str = "ۥۛۡۗۗۚۡۛ۟ۘۜۘۘۖۗۨۘۚۗۚۛۡۙۧۜۗ۟۟ۜۘۧۧۘۘۥۖۡۙۗۜ۬ۗۡۢۚۡۘۢۖ۬ۚۙۘۘۥ۠ۚ۠ۜۖ۫ۧۜۘۗۗۘۘۢ۟ۥۘۛۢۥۘ۬ۥۧۛۨ۠ۚۡۧۘ";
                    break;
                case -229381120:
                    textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                    str = "ۖۥۦ۟ۧۦۘOۜۘۜ۬ۘۖۡۛۧۧۦۗۨۖۧۘۥۛۚۖۥۤۛۗۗۢۧۘۜۙۤۤ۠ۜۘۗۙۦۧۤ۬۠ۘۡۖۥۧۨۤۗۡۘ۟ۨ۟ۥۗۗۗۜۥۘۙۥۨۙۖۨۘۙۢۡۙۧۙۡۥۖۦ۬ۖۘۥۙۦۘۛۛۚ۬ۗ۟ۧ۠ۦۘۚۚۨۘۢ۬ۛۗۗۘۘۧ۫۟ۙۜ۠ۙۜۧۘۦ۫۟";
                    break;
                case -120665541:
                    str = "ۜۡۨۘۦۦۡۘ۠۠ۘۘۙۗۡۤۢۦۡۦ۬ۦۜۚ۬ۡۤۚۗ۫ۥۥ۬ۨۤ۠ۖۨۚۙۡۥۘۧۜۙۖۛۘۘۜۖۢ۟ۧۘ۠ۡۥۘۖۖۛۥۚۥ۠ۧۨۘۚۚۘ۟ۘۧۘ۟ۚۧۗۡۘ";
                    break;
                case -16616048:
                    textView.setTextSize(18.0f);
                    str = "ۥۛۗۢۜۥۘۗ۠۫ۤ۬ۡۘۢ۠ۚۙۙۥۘۢۨۜۢۧ۫ۜۤۥۜۧۘۨۧۛۙ۠ۥۘ۟ۗۗۙ۫ۡۥ۠۬ۨۙۧ۟۬۟۬۬ۧ۬ۘۦ۬ۡۖ۠ۨ۠ۜۧ۬ۛۢۨۜ۬ۗ۬ۥۘۙۖۛۖۚ۬ۥۤ۫ۚۘۗ۠ۡۘ۠ۘۢ۫ۢۘۘۢۤ۬ۜۚۛ۬۠ۡۘ";
                    break;
                case 93668302:
                    linearLayout.addView(textView2);
                    str = "۠ۥۧۘۜۥۗۤۥۨۨۖۨۘۛۢۧۗۧۜۘۤ۟ۤۜۡۛۧۦۜۢۡۦۘۢ۟ۨۘۙۛۚۡۜۙۥۧ۬۠ۤۚۚۡ۟ۗۢۙۨۗ۠ۗۨ۟۟ۥۘۢۡۜۨۥۢۨۤۜۚۖۘ";
                    break;
                case 120690902:
                    textView.setTypeface(Typeface.DEFAULT_BOLD);
                    str = "ۗۥۜۘۧ۠ۘۙۖۙ۫ۖۜ۠ۗۗ۟ۤۚۚۚۨۘۢۙۥۘۗۢۢ۟ۖۥۜۛ۬ۛ۟ۥۛۖۗ۫ۨۛۗۢۜۘ۟ۢۦۘۧۡۥۘۦۨ۫ۚۧۨ۠ۚۘۧ۫۠ۢۘۛۛ۫ۖۘ۫ۙۡۘۗۚۚۨۖۧۘۤۛۨۛۦۤۢ۟ۖۧۦۘ";
                    break;
                case 365024938:
                    gradientDrawable = new GradientDrawable();
                    str = "ۘ۟ۚۦ۫ۛۚۧۘۘۨۙۜۘ۬ۜ۬ۧۙۥۘۧ۠ۘۢۨۦۘ۬ۘۘ۠ۨۜۘۚۙۨ۫ۖۥۙ۬ۨۦۚ۫۫ۨۥۘۦۧۜ۫ۥ۫ۚۙۨۘۛۘۥ۬ۨۖۘۥۦۧۘۧۖۧۡۚۜۘۛۘۡۘۖۧۡ";
                    break;
                case 369425596:
                    alertDialog.show();
                    str = "۫ۡۧۘۧۖۘۤۢۖۢ۫ۨۘۘۨۘ۟۟۠۬۫۫ۜۢۡۗۦۦۘۘۥۡۘۧ۠ۢ۫ۢۢ۬ۧۦ۟ۢۧۘۨ۠ۨۗۤ۟۟۬ۖۡۘۧۖۥۘۦۚۧۨۤۘۧۗ۬ۤ۬۬۫ۤۥ۫ۥۗۦۤۦ۠ۤۨۘۛ۬ۢ۟ۡۚۖۢۗۚۧۤۗ۟ۜۘۢ۠۟ۜۢۢۙۥ";
                    break;
                case 376319659:
                    button = alertDialog.getButton(-1);
                    str = "ۙۙۡۘۥۧۖۘۗۘ۠ۛ۟ۘۜۥۜۘ۫۟ۥۡۖ۟۬ۗۤۛۘۖۡۨۘۗۨ۠ۖۚۜۘۧۜۙۥۢۦۘۡۨۗۜۢۧ۬ۙۘ۬ۛۤۥۜۚۨۖۦۘۤۧۚۦۡ۬ۦۤۢۨۧۘۘۚۙۘۖۛۦۘ۫ۨۖۘ۟ۙۗ۟ۤ۟ۢۡۘۛۜۖۘۢۡۘۘۙۚ۟ۨۚۛ۠ۤۜ";
                    break;
                case 391694199:
                    textView2.setPadding(m80dp(this, 8), m80dp(this, 8), 0, 0);
                    str = "ۜۜۖۘ۟ۢۜۦۜۡۘۙۖۙ۫ۚۗ۬۠ۧۢۡ۟ۨۦۖۘ۫ۡۥ۟۬ۖۢۥۨۗۗ۬ۛۦۘۚۤۗ۬ۥۖۘۢ۬ۜۘ۟۟ۦ۟۫ۖۚۗۚۗۘۥۘۛۖۦۗۢۦۘۚۚۖۘۧۖۜۥ۠ۥۘ";
                    break;
                case 491377661:
                    button.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                    str = "ۨۤۚ۫ۢۥۘۡۘۖۢۚۤ۠ۜۘۗۚۦۘۜۥۧ۫ۦۥۘۡۖ۫ۜۤۨۦۥۤۥۨۚۜۡۖ۠ۦۘۖ۠ۡۘۚۘ۫ۜۡۙۖۛۦ۠۫۠۬۫۬ۡۥۡۘۛ۠ۨۘۗۛۘۙۤۥۥۘۨ۬ۙۡ۬ۥۖ۟ۤۙۚ۬ۨۗۢ۫ۢۘۨۤ۫ۡۘۛۡۚۨ۟ۧۖۤۗۥۛۧۢۙۜۘ۟ۙۘۘۜ۠ۚۧ۬ۜۘۢۤۧۧۙۨۘۙۗۡۘۧۙۜۘۘۧۨۘ";
                    break;
                case 695719528:
                    button.setAllCaps(false);
                    str = "۟۟ۧۗۜۡۘۦۨۦۘۚۥۚۛ۠ۢۙۢۤ۠ۥۘۥۙ۟ۢۨۥۖ۬۠ۘ۬۟ۚۘۜۘ۟۬ۚ۠ۤۙۢۤۦۘۛۘۧۘۤ۬ۨۤۗۘۤۦۘۡ۫ۚۦۜۥۘۡۧۚۘۡۦۛۨۗۤۤۡۘ۟ۦ۟ۦۧۖۘ۠ۤۗۚۙۜۘۨ۟ۛ۟ۖۘ۠ۥ۫ۗۛ۬ۦۖۜۘۤۖۖۘۧۗ۟ۢۗۙ۫۬ۖۘۧۥۥۘ۟ۛ۬ۦ۫۠ۥۜۜۘ۫ۤۛ۬۠ۨۘ۫ۨ";
                    break;
                case 788298854:
                    textView2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                    str = "ۘۥ۠ۘ۟۬ۡۖۦۘ۟ۗۛۤۤ۠ۦۢ۠ۛۤ۠ۘ۟۬ۙۢۖۘ۠ۘۧۛۨۧۘۚ۠ۙۥۧۘۘۢ۟ۡ۟ۢۢۨۧۜۗۖ۫ۗۚۜۘۚۜۤ۟۬ۚۡۗۘۛۦۢۨۡۧۜ۠ۛ۫ۖ۫۫۠ۖۦۘۘۚۥۡۘ۠ۧۛۛۡۜۦۗۦ۠ۛۛۗۥۘۡۛ۟ۧۥۚۘ۠ۙۢۦۡ۬ۤ۫ۨ۠۫ۦۤ";
                    break;
                case 843497227:
                    linearLayout.setPadding(m80dp(this, 16), m80dp(this, 16), m80dp(this, 16), m80dp(this, 16));
                    str = "ۖۜۦۘۡۚۘۘ۟ۡۥۗۢۡ۫۟۠ۡۜۘۘۖۗ۠ۡۢۜۘۨ۠۫ۚۡ۬ۖۘۦۦۜۧۜۗۡۘۤ۬ۥۘ۠ۥۧۘۜ۫ۖۘۤۤ۫ۗۧۚۜۧۘۦ۬ۨۤ۫ۜۚۙ۬ۡۜۥۘۘۘۘۚۜ۫";
                    break;
                case 1100292928:
                    linearLayout = new LinearLayout(this);
                    str = "ۧۖۚۧۖۨۤ۫ۘۘۡۖۙ۬ۛۜۘۘۖۨۛۖ۟ۛۙۜۛۡۘۦۥۥۘۡ۬ۜۘ۠ۡ۬ۢۥۥۖۨۘۤۦۜۙۖۨۘۡ۟ۘۖۢۜۘۥۥۧۘ۠۫ۡۘ۠۫ۦۛۚۜۙۜۦۙ۟۟۟۫ۨ۫ۖ۟ۜۡۧۘۙۜۘۙۦۛۢۗۜۘ";
                    break;
                case 1165430837:
                    alertDialog.getWindow().setLayout(i - i2, -2);
                    str = "ۦۙۨۘ۠ۤۢۡۦۘۥ۫ۧ۫ۨۧ۬ۚۧۨ۠ۧۥۢۖۡۨۘۢۤۦۘ۬ۤۜۘۢ۬۬ۦۖۘۘۧۥۡ۟ۥۘۘۛۚۙۙۦۖۙۚۡۛ۬ۖ۟ۤۚۗۡۘۡ۫ۦۘ۟ۤ۟ۡۛ۫۫۫ۦۘۢۚۖۤ۠۫ۖۙۨۘۨۤۦۘۢۦ۟ۦ۫۬ۜۘۘۗۡۙۤۖۜۡۨۤ۟ۘۢۖۢۢ۫ۘۘۧۗۚ۟ۗۘۢۖۚۤۨۨ۬ۜۛۖۧ۬ۙۧۦ";
                    break;
                case 1250986290:
                    textView = new TextView(this);
                    str = "۠ۤۥۘۨۙۡ۟ۛۤۗۗۜ۟ۥۡۚۦۛۢۤۥۜۖۜۚۙۗۥۖۚ۟ۥ۫ۛۤۦۘۘۡۦۘۡ۟ۨۘۡ۟ۘۥۖۨۘۘۜ۟ۘۨۜۘۤۘ۫ۛۛ۬ۜۖۨۘۜ۫ۗۚۖۗۗۙ۟۫ۗۜۘ";
                    break;
                case 1881093519:
                    textView2 = new TextView(this);
                    str = "ۢۧۘۖۘۜ۠ۗ۟۠ۚۡ۠ۗ۫ۢۖۘۙۥ۫ۨۘ۫ۗۚۥۘ۫ۖ۫۟ۢۜۨۖۦۘۜ۠ۧۜۥۖۘۦۢۛۛۡ۟ۛۚۘۘۘۙۡۘۙۤ۟ۨۦۘ۠ۦۘۗۙۜۡۘۤۘۚ";
                    break;
                case 1885562162:
                    i = getResources().getDisplayMetrics().widthPixels;
                    str = "ۜۨ۟ۤۡۜۘۜۙۖۥ۟ۨۘ۬ۢۖۘۢ۫ۦۥۨ۫ۤۙۘۘۦ۫ۥۙۤۥۘۧۚۜۧۥۚۛۖۗۥۛۖۘۙ۫ۢۧۤۨۗ۠۫ۥۨۦۖۘۥۜۥۗۜۨۥۗ۬۫ۘۨۡۚۨ۠ۘۘۘۛۙۥۗۘ۬۟۬ۦۨۘۥۨۧۘ";
                    break;
                case 1910666333:
                    linearLayout.setOrientation(1);
                    str = "۫ۥۥۘۘۦۦۢ۫۫ۛۜۧۤۙۛۤۙۜۧۤۘۘۤۤ۟ۡۗۤۛۥۖۜ۟۬ۛۚۚۘۙۘ۫۠ۦ۠ۚۢۦۦۘۦۜۦۡۧۛ۟۠۫ۛ۬ۧۗۗۘۘۤۜ۫ۥۨۤۥۚۗۖۧۥۦۛۛۘۙۖۖۦ۠ۚۧۢۤ۟ۧۦۥۤۛ۬ۦۘۛۙۡۘۨۜ۫ۜۘۘۥۙۡۡۛۛۥ۟ۡۘۘ۫ۚۜۗۨ۫ۨ۫ۘۜۥۥۨۥ۟۟۟ۢ۫ۥ";
                    break;
                case 2036497749:
                    textView.setPadding(m80dp(this, 8), 0, 0, 0);
                    str = "۟۟ۤۤۤ۟ۨۥۥۘۦۨۘۜ۫ۙ۫ۥۤۙۦۦۘ۠۫ۥۘۡۛۚ۟ۥۨۘۗۡ۬۟ۧۖۘۤۢۨۤۥۦۤۛ۟ۘۜ۬ۗۡۘۦۦۤۖۨۥۘۥۜۘۜۡۨۘۨ۬ۡ۬ۥ۬ۤۙۗ۟ۛۨۘۡۦۧۘ۫ۖ۟ۚۘۘۘۡ۟ۖ۫ۢۡۘ۠ۤۖۙ۫ۧۖۖۘ۬۟ۚۛ۫ۜۛۙۙۥۙۛۖۡ۠۟۟ۢۜ۫ۧۚۢۗۜۥۧۙۧ۟ۚۚ۬۠ۤ";
                    break;
            }
        }
    }

    private void showProgressDialog() {
        LinearLayout linearLayout = null;
        int i = 0;
        GradientDrawable gradientDrawable = null;
        ImageView imageView = null;
        LinearLayout.LayoutParams layoutParams = null;
        TextView textView = null;
        LinearLayout.LayoutParams layoutParams2 = null;
        LinearProgressIndicator linearProgressIndicator = null;
        LinearLayout.LayoutParams layoutParams3 = null;
        AlertDialog alertDialog = null;
        String str = "ۜۖۧۨ۫ۧۥ۬ۘۘۧۙۜۘۡۖۗۧۧ۬ۥۡۜۘۤۥۤۧۜۨۥ۠ۚۖۛۧۚۜۙ۫ۥۢ۟ۛۢۡۤ۟ۘۢۖۖ۬۫ۢۢۥۖۘۧۖۘۤ۠ۗۦۤۘۥۙۥۘۨۚۚ۠ۡۚۤۢۨۘۘۡۖۘۡۡ۟ۘۥۥۘۦۘۛۤ۬ۗ۬ۡۘۧۘۦۘۜۜۘۘۧ۟ۦۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 653) ^ 527) ^ 255) ^ 959) ^ 516) ^ 630) ^ 711) ^ 835) ^ 466) ^ 912) ^ 58) ^ 278) ^ 343) ^ 426) ^ 16) ^ 392) ^ 440) ^ 448) ^ 30) ^ 993) ^ 775) ^ 627) ^ 782) ^ 206) ^ 168) ^ 790) ^ 986) ^ 237) ^ 521) ^ 313) ^ 979) ^ 926635675) {
                case -2144089711:
                    textView.setTextSize(16.0f);
                    str = "ۦ۬ۧۘۨۢۘ۟ۡۘۛ۟ۡ۟۬ۚۗۡۥۘۡۘۜۢ۫ۨۢۤۜۛۦۘۢۗۖۘۘۢۥۗۨۗ۠ۧۖۘۢۡ۠ۢۛۘۘۜۨۥۨۙۨۘ۫۠ۥ۬۫ۤۘ۬ۡۥۢۦۗ۟ۦۢۦۜۙ۠ۦۥۘۥۗۢۢۨۤۖۘۦۗۘۘۙۤ۟ۦۤۙ۫ۜۗۚۛۨۥۦ۫ۨۧۘۘۜۜ۟ۜۦۧۘۘۤۡۘۛۡۖۘ۬ۨۜۨۗۖۡ۬ۚۛۨۤۖ۟ۙ۬ۤ";
                    break;
                case -2115135875:
                    gradientDrawable.setColor(-1);
                    str = "ۗۜۛۛۖۜۘۜۤۨۘۢۦۚۥ۬ۖۘۦ۠ۘۜۥۜ۬۫۟ۚ۫ۜۛ۬ۖ۠ۖۧۘ۟ۨۨۙۨۨۘۢ۬ۖ۫۟ۤۡۨۚ۫۟ۧۗۚ۠۬ۙۜۘۡۧۗۨۘۡۘ۠۫ۘۘ۟۟ۦۛ۠۠ۧۦۤ";
                    break;
                case -2049143358:
                    linearLayout.addView(linearProgressIndicator);
                    str = "ۢۚۦۤۚۡۜۜۥۢ۫۫ۘ۠ۤ۠۬ۙۜ۠ۦۘۡۖۥۥۦ۠ۘ۟ۢۘۢۦۘ۬ۖۜۖ۫ۢۦۚۗۖۘۨۜۜۢۥۛ۬ۚ۠ۗۜۨۧ۫ۘۘۜ۫ۡۗۤ۟ۖۥۘۢۤۥۘۤۘۖۗۚ۠۬ۨۢ۫ۘۖۢۖۥۖۤۡۗۤۛۙۧۨ۠۟ۦۘۡۘۜۖۧ";
                    break;
                case -1839998709:
                    textView.setLayoutParams(layoutParams2);
                    str = "ۢ۠۠ۨ۬ۖۘۚۚۖۘ۠ۖۥۘۛۖۢۚۙۚ۫۟ۙۨۡۧۗۚ۟ۙۨۖۡۡ۟ۨۨۧۘۜۦۛۧۨۘۥ۟ۘۡۖۡۘ۬ۖۛۧۜۦۘ۟ۧ۬ۜۨۢۦۡۥۘۥۥۘۚۢۧۧۤۜۨۤۤ";
                    break;
                case -1697051196:
                    layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    str = "ۙۡۨۘۢۧۥ۬ۤۡۘ۬ۨۖ۠ۜۧۧۖۘۚۚۢ۬ۚۡۗۜ۫ۤۛۜۘۛۥۡۘۥۧۧۙۤۦ۫ۨ۠ۘۙۨۘۜۢۜۜ۫ۥۘۥۗۘۘۧۡ۬۬ۚۢۡۢۙۥۚۖۜ۬ۦۘۨۡۢۡ۬ۖۘۤۧ۠ۖۘۙۥۨۜۥۢۢۢ۟ۡۘۨۗۜۘۡۦۥۨۢۤۥۖۘۦ۟ۧۤۧ۫۟ۛۦ۠ۖۘۨۨۖۨۛۗۧۗۦۘۘۘۦۘۖۨۘۖۗۢۦۚ۠";
                    break;
                case -1454628092:
                    String str2 = "۠۫ۜۘۖۖۛ۫ۛۧۛ۟ۙۙۨۘۥۢۚۧ۠۬ۨۥ۫ۥۚۤۦۥۨۤۖۡۘۦۡۤۛۢ۬ۤۡۧۘۢۨۛۥۦۖۨ۫ۗۡۡۘ۠ۜۧۘۙۢۖۨۚۦۘۚ۫ۧۧ۟ۢۜۛ۟";
                    while (true) {
                        switch (str2.hashCode() ^ 1601357716) {
                            case 252507448:
                                str = "ۧۖۚ۬۟ۜۢ۬ۡ۟۬ۗ۠۠ۦۤۥ۟ۦۙۖۙۚ۬۠ۡۗۧۨ۟ۥۛۧۗۡۘ۫ۚۖۘۚۛۨۘۘۥۨۧۘۜۘۡۡۙۧ۟۠ۛۘۦۙۗۜۨۘ۠ۥۘ۠۟ۘۘۢۥۦۡ۫ۥۨۛۡ۫۫ۧۧۨۘۛۛۡۘ۟ۚۗۥۧۜۘۙۚۨۘۢۛۘۜۧۖۥۗۘ";
                                continue;
                            case 893764915:
                                str2 = "ۛۛۡۜ۫۟ۤۖۙۙۗۥۚ۠ۤۘۡۖۢۖ۫ۛۢۙۢۡۙ۠ۤۥ۫ۗۖۡۘۘۧۡۘۧۛۧۢۨۘۘۛۗۘۘۢۙۜۢ۠ۚۘ۠ۥ۟ۖۚۙۦۖۘۘۛۧۙۤ۫ۢۙۧۡۢۦۘۦۢۙۤ۠ۥۦۜۥۘۘۘۥۨۛۢ";
                            case 1383267822:
                                String str3 = "ۦۚۜۘ۠ۦۦۙۦۜۘۥۖۥۘۛۖۢۗۛۡ۠ۨ۬۬ۗۥۘ۟ۥۧۘ۟ۡۚ۫ۛۚۜۖۜۖۨۖۘۢۦ۫ۤ۫ۖ۫۫ۚۙۜۘۘۘ۬ۜۘۘۖۡۘۦ۫ۚۢۘۘۢۗۧۤۢۚۢۤۤۗۘۖۚۨۥۙ۬ۘ۠ۤۖ۠ۜۨۘۧ۬ۡۘۧ۠ۨۛۤۥۘۛۛۡۖۥ۟۬ۢۘۘ۬ۚۥۖۚ۟ۛ۬ۡۜۥۧۘۥۖ۫";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1256661935)) {
                                        case -1318354951:
                                            str2 = "ۜۙۨۘۥۙۥۘۗۢۜۥۘۥۦۨۜۘۙۚۖۘۧۙۖۤ۠ۜۘۢۙ۬۫ۜۘۘۦۥ۬ۖۚۛۤ۫ۥۘۙۤۨۧۖۗ۟ۦۥۘۙۢۛۙۦ۫ۨۗۛۗۡۙ۟۟ۦ۫ۥ۫ۧ۟ۨۤۘۘۖۜۧۤۧۧۥۨ۬۠۟ۧۨۥۘ۫ۖۦۘۗ۫ۨۢۚ۟ۜۖ۫ۘۤۥۘۜۖ۬ۤۗۤ۠ۖۘ۠ۗۥۜۤۜۜۥۥۘ";
                                            break;
                                        case 443139023:
                                            String str4 = "ۥۜۜۘۚۚ۟ۘۛ۫۠۫ۤۗ۠ۛۥۗ۬ۜۡ۫ۡۢۡۨ۬ۥۘۡۚ۠ۤۖۜۘۥۨۥ۫ۤۨۚ۬ۗۛۧۥۘۘۛۡۡۘۜ۫ۨۜۧۥۗۧۚۨۧۚۢۦۗۤۘۨ۠۫ۦۗۧ۠ۖ۠۟۠ۦۥۛۥۢۧۖۘۥۜۚۡۘ۟ۦۖۘۨۘۢۥ۬ۜۘۥۦۦۛۘۦۘ۫ۛ۬۫۠ۨۘۢۦۜۚۦۜ";
                                            while (true) {
                                                switch (str4.hashCode() ^ 1067932114) {
                                                    case -1945300527:
                                                        str3 = "۟ۥۦۢۦ۬ۡ۬ۤۨۢۗۚۧۧۢۤۡۚ۫ۤۚۦۥۜۧۚۧۨ۫ۘۗۚۥۢۙۧۨۨۡۜۛۧۛ۟ۗۙۢ۟۟ۖ۠ۨۢۢۘۡۗۧۨۤ۫۟ۢ۠ۜۨۥۗ۫ۙۗۛۨۘۧ۠ۤۦۖ۠۟ۖۘۤۦۤۙ۠ۡ۠ۡۤۤۨۚ۫ۘۦۗۢۘۘ۟ۚۨ";
                                                        break;
                                                    case -1717197808:
                                                        str3 = "ۢۜۜۘۜۙۡۤۡۧۘۥۜۜۘۖ۫ۥۘۢۡۙۦۨۙۨۛۨۗۗۥۘۦۧۛۧۜۤ۟ۜۦۦ۟ۥۖ۬ۡۘۧۡ۟ۖ۠ۖۘۦۧۖ۠ۨۤ۠ۖۨۘۧۘۡۘ۟ۢۘۥۛۤ۠ۛۡۘۘۜۜۤۘۘۘۙۙۖۘ۟۫ۨۘ۟ۙۥۘۢۡ۟ۤۘۡ";
                                                        break;
                                                    case -1188660891:
                                                        String str5 = "۟ۦۙۜۡۛ۠ۚۤۥۛۜۘۘۨۡۘۨ۬۬ۘۗۛۢۦۥۘۘۢۗۙۡ۠ۦۤۤۥۜۘۤۧۦ۠۟۬۫ۢۖۘۡ۬ۗۡۧۜۘۚۤۥۦۦۖۘۚۖۥ۠ۥۚ۫ۘۘۢۤۛۜۧۚۦۚۤۡ۟ۘۙۡ۠ۛۜ۫ۛ۠ۧۥۦۘ";
                                                        while (true) {
                                                            switch (str5.hashCode() ^ (-552349618)) {
                                                                case -1716657627:
                                                                    str5 = "ۡۜۨۘۜ۟۫۬ۨۘۧۦۜۘۨۤۙۛۦۖۘۥۘۙۚۖۦۘ۟ۡۚۚۦۨۨۦۢۘۤ۠ۨۥۡ۫ۥۦۘۖۙۗ۫ۧۡۨ۠ۢۤۤۨۘۗۜۦۘ۠ۚۛۛۙۤۨۗۧۥۖۗۜۚۧۨۗۛۛۘۛۤۦ۬ۚۤۡۖۨۘۥۘۧۘ";
                                                                case -527537910:
                                                                    String str6 = "ۛۖ۟ۧۜۦۘۖۛۢۘۘۗۨۤۧ۫۬۬۠ۤۗۖۖۖۧۡۛۙۢۘۖۤۘۘۤ۠ۥۛۖۗۥ۟۫۫ۤۥۡۗۤۙۚ۬ۜۙۛۢۗۡۥۢۥۘۛۖۚۙۜۥۘۜۗۛۥۙ۫۫۫ۘۡۗۡۚۨۘۘ۟ۥۦۘ۟۫ۥۘۨ۫ۖۥۛۦۘۖۡۜۚۥۘ۫ۧۜۤ۬ۢۧۘ۫ۥۛ۟ۤۤۧۗۤۨۘۧ۟ۛ";
                                                                    while (true) {
                                                                        switch (str6.hashCode() ^ (-664175984)) {
                                                                            case -496030088:
                                                                                str6 = this.progressDialog.getWindow() != null ? "۫ۜۡ۬ۖۧ۠ۡۘۛۡۥۛۛۢ۬ۘۧۘ۬ۛۥۧۘۖ۟ۨۘۨۚۥۘۡۘۦۘ۟۫ۤۤۧۢۛۦۖۘۢۙۨۖ۬۬ۧۙۗۧ۬ۦۘۙۡۗۖۤۛ۫ۛۖۜۜۚۢۘۘۡ۬ۦ۫ۛۢۡۚۦۗۧۦ۫۫ۨۧۜۨۘۢۦۚ" : "ۤۦۜۦۘۡۘۚۜۡۘۚۘۗ۠ۥۨۘ۟ۢۚۛۚ۠ۧۛ۫ۢ۬ۦۘۚۡۖۖ۫ۛۡۡۖۜۥۦۘ۠ۨۘۘۖۛۖۘۛ۬ۢۘۨۘۗۛۢۤۧۥۘۦ۫ۥ۟ۨۦۧۡۙۗۡۡۘۦۘۗۖ۠ۥۖۗ۠۬ۥۤۢۤ۬ۘۧۥ۠ۨ";
                                                                            case 239337408:
                                                                                str5 = "۠۫ۛۤۧۨۥۘۨۦ۬ۧۙۙۡۜۙۨۨۥۖۢۦۡۜ۫۟ۧ۫ۥۘۛۧۘ۬ۡۘۘۦ۠ۜۘ۠ۙۙۘ۟ۖۢ۬ۖۖۖۢۡ۫۟۟ۖۢۦۘ۬ۚۗۧ۬ۗۘ۟ۜۥ۠ۡۘۦۘ۬ۢۘۢۥۛ۟۟۟ۦۘ۠ۖ۫۟ۖ۠";
                                                                                break;
                                                                            case 371744126:
                                                                                str5 = "ۦۢۖۢۢۢۨۧۘ۟۠ۙۦۚۢۚ۟۬ۡۦۘۖۥۛۤۜۨۘۥ۫۠ۥۚۖۥۧۧۚۛۜۖۛۢۤۖۧۗۡۜۙۧۦۘۖۤ۟ۢۦۥۘ۠ۜۧۘۛۥۘ۫۠۫ۨ۟ۤۚۦۨۘ۫ۦۥۧۗۥۘ۫ۨۡۘۨۖۡۖۚۡۘۤۥۤۛۢۡۖۢ۬ۢۗۨۗۥ۬ۘۖۢۜۗۙۥ۫ۡۗۢۘۜۤۗۙ۬ۦۤۦ۬ۖۚۘۡۘۥ۬ۨۥۨۤ";
                                                                                break;
                                                                            case 1461404586:
                                                                                str6 = "ۥ۬ۧۤ۫۫ۘۙۖۥۧۜۘۢۘۨۘۚۜۨ۟ۛۦۘ۠ۜۖۘۡۢۖۘۦۘۜۨ۬ۚۘۜ۬ۗ۠۫۫۠ۡۧۢۨۘۦ۫ۡۥۢۙۨۚۧۛۥۛۢۘۦۛۢۢۢۖ۫ۛۧۥۥ۟ۥۢۢۨۘۗ۟۟ۡ۠ۜۘۥۦۜۖۥۗۙۧۢۜۘۢۜ۫ۦۘۘۤۦ۬۟ۥۚ۠ۖۘۥۨۦۘۙۜۛۨۨ۟ۢۤ۟۠ۦۦ";
                                                                        }
                                                                    }
                                                                    break;
                                                                case 238377854:
                                                                    str4 = "ۤۡۘ۠ۥ۫ۗۖۜۘۥۖۘۘۢۧ۫ۘۧ۫ۙ۟ۧ۫ۙۨۜۥۛ۠ۗۡۘۙۨۦۗۡۡۘۡۛ۠ۡۢۙۜ۠ۡۡ۟ۘۘۜۢۜۖۤۨۘۨ۠ۚۥۘۥۘ۠ۡۦۚۧۤۥۧۦۢۢۨۨۚۗ۟ۖ۬ۢۧۦۚۢۘۥۛۥۜۛ۟۫ۦ۟ۜ۬ۛۤۨۜ۫ۥۘۤۗۡۘۖۖۜۘۖ۟۟۟ۗۖۖ۟ۘۘ۠ۘۤ";
                                                                    break;
                                                                case 1155190931:
                                                                    str4 = "ۚۖۧۧۚۜۤۡۢ۟ۛۖ۠ۚۥۘ۬ۙ۟ۚۡۜۘۛ۫۠ۚ۟ۘۦ۬ۜۘۨۧۛ۬ۡۨۛۘۖۖۙۧۛ۟۟ۡ۬ۨۘۘۡ۟ۧۥ۟ۖۨۥۨۨۜۧۚ۬ۡۧۜۨۛۡۜ۠ۖۘۧ۬ۡۙۤۤۡۛۦۘۜ۠ۗۧۙۡۙۡۘۘ";
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 637836292:
                                                        str4 = "ۜۛۚۖۥ۬ۗ۬ۤ۫ۙ۬ۜۨ۫ۥۖۘۤۛۙ۟ۘۥۘ۠۬ۖۢۡۙۚۛۨۘ۬ۘۘۚۧۡۜۗۛ۫۟۫۬۟ۦۘۥۘۥۚۨۥۘ۫۫ۡ۫ۡۜۜۧۘۦ۫ۗ۬ۗۚۦۗۡۘ۠ۛۤۙۤۡۘۗ۫۟ۤۦۤۤۜۨۘۖۡۨۗۙۦۘۦۗۦۘ۬ۡۙۗۙۥۘ۠ۜ۠ۗۨۜۚۤۤۘۘۘۨ۬ۘۘۢ۠ۤ";
                                                }
                                            }
                                            break;
                                        case 968741629:
                                            str2 = "ۘ۟ۘ۠۫ۥۢۢۦ۫ۦۡۘ۠۟۬ۙۚۡۘۖۥۚۘۚۡۡۥۚۚۧۢۙۛۦۘ۠ۢۦۖۤۙ۟ۗ۠۬ۘ۟ۦۥۘۧۙۥۘۥ۫۬ۨۗۥۧۚۦۚۘۦۡۦۚۜۗۜۘۖۦۘۥ۠ۡۗۘۘۢۚ۬ۘۤۨۘۥۨ۠ۡ۫ۗۘۡۢۗۦ۫۠ۘۥۘ۟۫ۖۘ۫ۛۖۘ۫۠ۖۢۜۡۘۢۡۦ۠ۦۙ۬ۤۜۘ";
                                            break;
                                        case 1950960957:
                                            str3 = "ۖ۠ۨۘۧۙۖۘۘ۟ۦۘۜۨ۫ۖۜ۫۠ۤ۟ۥۦ۠ۜۗۛ۟ۤۘۧ۬ۘۚۛ۬ۦ۫۟ۨ۠۬ۜۡ۟ۚۘ۟ۦۤ۟۠ۢۤۢۛۜۘ۠ۘۡۢۤۨۘۖۛۥۘۗۧۗۜۗۖۡۗ۬ۡۜۥ۫ۧۖۘۘۖۘ۬ۛۥۘۡۙۖ";
                                    }
                                }
                                break;
                            case 1661813617:
                                str = "ۧ۠ۦۘ۟ۜۥۙۘۧۘۢۘۖۧۢۢۙۛۜ۫۬۟ۛ۬ۖۘۧۗۢۦۥۜۥۖۛۜۙۘ۟ۗ۬ۢۦۘۦۚۖ۫۟ۤۜ۬ۤۧۤۥ۟ۗۦۘۚۢۦۘۙۡۖۘۧ۬ۢ۫۬ۢ۫۬ۤۢۨۛۢ۠ۡۢۥۛۜۥۘۚۛۡ۫ۢۡۘۦۨ۫۬ۗۖۖۡ۟۫ۢۡۤۡۘ";
                                continue;
                        }
                    }
                    break;
                case -1415728814:
                    this.progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                    str = "ۧ۠ۦۘ۟ۜۥۙۘۧۘۢۘۖۧۢۢۙۛۜ۫۬۟ۛ۬ۖۘۧۗۢۦۥۜۥۖۛۜۙۘ۟ۗ۬ۢۦۘۦۚۖ۫۟ۤۜ۬ۤۧۤۥ۟ۗۦۘۚۢۦۘۙۡۖۘۧ۬ۢ۫۬ۢ۫۬ۤۢۨۛۢ۠ۡۢۥۛۜۥۘۚۛۡ۫ۢۡۘۦۨ۫۬ۗۖۖۡ۟۫ۢۡۤۡۘ";
                    break;
                case -1378816962:
                    i = m80dp(this, 12);
                    str = "ۜۦۤۡۜۡۦۘۜۘۨۘۙۥۦۖۘۘۖۨۤۢۧۛۖۧۘۜۙۢۚ۬۫۫ۙۥۘ۫ۚۖۜۜۜۘۨۗۧ۠۠ۥۢۡۖۘ۫ۖۡۨۦۜۘ۫ۘۡۘۧۧۚۤۙۦ۬ۡۜۘۜۚۦۘۛۢ۬۫ۘۧۘۡۚۖۢۡ۬۬ۧۥۘۙۦۡ۬۬۟ۚ۠ۖۘۖ۬ۛۜۚ۫۠ۖۦۗۨۖۖۥۡۖۜۘۤۨۦۨ۫ۘۘۡۡ۬ۘۛۨ۟ۙۖۘۜۙۘۡۨۗۛ۫ۥ";
                    break;
                case -1197946045:
                    this.progressDialog.getWindow().setLayout(m80dp(this, 220), -2);
                    str = "ۚۙۜۘۚۢ۠ۥۙۡۘۡ۬ۡۖ۟ۥۘۥۜۥۘۜۧۗ۫ۛۧۘۧۖۘ۟ۘۤۖۥۙۧۨۢۨۖۜۛ۬۫ۚۜۡ۬۟۫ۘۚۡۦۢۧۘۚۖۘۘۤ۟ۤۗ۠۟۟ۙ۬ۘۘۚ۟ۢۡ۬ۢۙ۠ۚۛ۠ۦۤۤ۠۫۠۫ۧۧۧ۟ۧۢۦ۟ۧۨۥۙۖۘۥۚۙ";
                    break;
                case -1189898780:
                    linearLayout.setBackground(gradientDrawable);
                    str = "۠۫ۡۘۖ۠۟ۥ۫ۗ۠ۨۜۘ۠ۨۡۨۗۥۘۦ۫ۘۘۢ۠ۡۖۙۖ۫ۚۘۘۛۘۧۤۖۨۙۙۚۛۙۘۢۨۘ۬ۙۖۘۚۨ۬ۨۢۡۚۖۤۢۛۘۘۗۜۙۧۜۚۗۤۨۘ۟ۡۦ۠ۥۥۘۨۗ۬ۧۛۖ۫ۡۨۖ۫ۘ۠ۘۘۗ۟ۥۘۖۙۘۧۨۦۙۨۥۘ۠ۦۖۘۥۦۦۧۚ۟ۧۨۖۘۤۛۤۧ۫ۚ";
                    break;
                case -1184554413:
                    str = "ۤۨۨۘ۫ۤۥۘۙۥۚۤۖۡ۫ۨۨۘۨۤۖۧۧۡ۠ۢۜۘۙۖۙۛۡۖۘۢۨۘۨۗۜۢۢ۠ۧۥۙۤۚۥۤۦۙۙۡۦۘ۟۠ۨۘۤۧۨۦ۫ۘ۫ۜ۠ۧ۬۫ۚۗۚ۠ۥ۠ۘۖۜۘۢۛۥۚ۟ۗ۬ۚ۫ۖ۠ۛ۬ۘۜۘ";
                    break;
                case -1034275993:
                    layoutParams2.topMargin = m80dp(this, 10);
                    str = "ۙۖۜ۫۠ۚۤ۠ۘۘۤۗ۫ۘۧ۫ۙ۬ۛۜ۠۫ۡۥ۫ۢ۟۬ۢۖ۫ۦۥ۠ۜۙ۠۬ۗۗۡۥ۟ۛۥۡۙ۫۟ۦۗۜۧۜۖ۟ۚۘۘۘۢۖۢ۟۫ۤۘۡۘ۟ۜۨۜۨۢۦۖۧۦۛۤۗ۟ۤۨۢۦ۬ۦۢۙۛۢ۬ۙۚۚۜۜۧۢۨۖۗ۠ۚۚۢۥۘۚۤۦۘۜۚۧۥۖۘ";
                    break;
                case -1034270743:
                    linearProgressIndicator = new LinearProgressIndicator(this);
                    str = "ۗۥۡۨۖۗۡۛۜۧۗ۫۬۫ۡۘۢ۟ۡۨۜ۬۫ۨۧۖۛۧ۟ۜۧۘۙ۬ۗۘۨۥۧۢۖۜۚۖۨۨ۫۫ۙۦۘۤۘۥ۠ۙۜۘۚۡۚۗۛۦۘ۫ۧۚ۫ۜۘۘ۬ۡۚۧۡۖۡ۬ۨۧۤۥۡۤۛۘۨۧۘۖۦۛۗۘۨۘۡۧۘۘۚۤۚۜۨۢۢۚۨۗۜ۫";
                    break;
                case -759944937:
                    linearLayout.setPadding(i, i, i, i);
                    str = "ۤ۫ۨۘۢۖۧۧۖۦ۟ۨ۟ۡۙۢ۟ۦ۬ۧۥۧۥ۬ۨۥۧۘۦۗۜۘ۟ۖۦ۫ۙۛۖۤۗ۬ۜۡ۫ۦۜۘ۟ۨۗۗۦۢۚۜۥۛ۠۫ۦۥۡۛۖۛۛۤۙۧۧۗ۫ۖۖۘۨۗۥۘۦ۠۠ۥۡۥۚ۠ۖۦۚۦۡۧۥۘۚۘ۬ۧۨۨۢۢۗۢۦۨۘۘ۫ۥ";
                    break;
                case -599896728:
                    layoutParams3 = new LinearLayout.LayoutParams(m80dp(this, 120), -2);
                    str = "ۜۚۦۢۦ۠ۢۢۖۘ۬۟ۡۗۢۦۘۨۢ۟ۘۜۧۦۤۜۘۛۜۘۘۛۧۚۗ۫ۜۖۖۘۘ۠۟ۢۤۤۘۡ۟ۜۚۨ۟ۥۗۥۧۜۘۤۦۜۘۢۡۘۖۖۦۘۜۥ۟ۙۡۘ۟ۧۦۘۗۗۚۦۜۥۡ۟ۜۘ۟ۤۙۧۧۜۙۙۥۘۤۖۖۘۛۦۧۘۗۛۧۨۢۛۖۦ۠۬ۛۜۢۥ۠ۖۛۨۙ۫ۚۖ۫ۧ۬۠ۚۥۘۤ۠ۨ۫ۚۜ";
                    break;
                case -451196034:
                    gradientDrawable.setCornerRadius(m80dp(this, 4));
                    str = "ۘۛۘۢۡۡۘۦۗۥۨۚ۟ۡۡ۟ۧۘۘ۟۫ۥۖۧۜۘۤۛۦۘۚ۬ۥۘۢۙۡۦۦۨۘ۟۟ۧ۬ۚۧۛۛۡۤۛ۟۬ۢۘۢ۠ۖۘ۟ۘۖۚۜۤۘۘۢۛۙ۫ۙۚۧۧۜۦۘۛۤۨ";
                    break;
                case -433816865:
                    return;
                case -410205412:
                    imageView.setImageResource(C0931R.C0933drawable.draw008a);
                    str = "ۨۦۖۘۥ۟ۢۥۙۙ۟۠ۨۘۦۧۦ۬ۜۘ۟ۦ۠ۛۖۦۗ۟ۗ۫ۗ۫ۨ۬ۗۡۗۘۘۡۛۖۙۘۘۘۧۢۤۧۥۨۘۚ۬ۜ۠ۤۥ۠ۥۘۢ۠ۜۤ۠ۗۥۦۢۤ۫ۥ۠۬ۘۙۜۚ";
                    break;
                case -295902341:
                    linearProgressIndicator.setLayoutParams(layoutParams3);
                    str = "۬ۜ۠ۚ۟ۧۥۨۗۚۨۜۘ۫ۥۢۦۧ۟ۧۧۡۜۗۦۘ۬ۦۜۘۜۨۘۜۨۥ۟۠۠ۖۘۜۘۧۗۡۛ۠ۨۢۥۗۚۥۦۗۖۥۖۘۗۡۗۧۗۚۡۛۖۘۡۖۗ۫ۖۚۛۗۦۨۖۨۜۧۥۚۘۖۘۤۚۘۚۢۤۦۧۜۘۨۜۛۡ۟ۦۘۥ۬ۘۘۖۘ۫۫ۘۙۗۙ۠ۜ۟ۜۘۢۥۦۘ۫ۨ۠ۗ۟۠ۚۤۖۡ۬ۡۤۘۙۤۦۘ";
                    break;
                case -280222232:
                    textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                    str = "ۧۡۙۧۡ۟ۚ۟ۡ۟ۤۙ۫ۡۘۢ۬ۢۦۤۤۗ۟۫ۧۨۚۨۡۖۥۚۗۚۖۘۨۨۢۙۜۗۗۙۖۦۨۦۜۢۜۛ۠۬۠ۧۙۥۙۛۗۥۧۡۚۖۡۢۧۛۗۙۧۚۥۘۥ۬ۦۘ۟ۢۘ۫ۖۢ۬ۚۜۨۗۖ";
                    break;
                case -195693018:
                    linearProgressIndicator.setIndeterminate(true);
                    str = "ۨۗۘ۟ۡۘۡۗۙ۠ۜ۠ۢۙۧۘ۟۬ۙۗ۫ۢۦۘ۟ۜۜۤۨۘۙ۫ۛ۟ۥۡۘۖۛۘۘۢۙۚۜ۠ۖۘۧۥۧۘۢۛۗۢۡۗۚۗۛۦۙۛۙۦۘ۠۬۬ۨۖۨۘۛۛ۬ۢۙ۟۫ۤ۬ۙۘۗۢۖۜ۬ۤۦۘۙ۬ۡۤ۟ۗ۠ۤ۬ۛ۠ۚۡۥ۟ۜۘۦ۬ۢۖۘۙ۟ۘۢۜۡۘۥۤۤۢۖۛ";
                    break;
                case -181010517:
                    layoutParams = new LinearLayout.LayoutParams(m80dp(this, 64), m80dp(this, 64));
                    str = "ۙۡۚۤۛۦۘ۬ۨ۠ۛۖۥ۟ۤۡۘۡۦۨۖۖۙۗۗۘۘۡۦۧۘۥۘۨ۫ۥۤۙۖۛۥۨۦۘۛ۟ۜۘۦ۟ۘۘ۬ۚ۠ۗۧ۫ۤۨ۠۠ۢۜۘ۫۬ۢۡۨۡۘ۫۬ۦۡۚۡۘۧۤۜۘۤۥۗ۠ۧۡۡۡۧۘۛۡۖۧۙۜۜۛۦۘ";
                    break;
                case 180005682:
                    linearLayout.addView(imageView);
                    str = "ۧ۠ۨۘۚۗۢۡۧۗۥۦۨۥۘۖۢۢۢ۬ۨۢۡۚۧ۟ۨۘۡۦۦۘۢۥۖ۫ۢۥۘۥ۠ۘۢ۫۬ۘۨۡۘۧۘۢۡ۠ۘۘۘۢۘۤۗۧۨ۟۬ۨۨۚۚۘۦۥۚ۟ۖۥ۬ۛۦ۟";
                    break;
                case 277718036:
                    linearLayout.setOrientation(1);
                    str = "ۨۡۘۘۦۦ۠۬۬۟ۡ۠ۜۘ۟ۜۢ۬ۨۜۘۢ۬ۧۨۧ۟ۚ۫۬ۡۘۡۦۡۘۧۧۥۜۢۧۧ۫ۨۢۥ۬۟ۢۨۚۗۨ۠ۖۧ۠ۙۧۡۦۡۢۨۨۗۡ۟ۗۡۤۡۨ۫ۛ۬";
                    break;
                case 344124074:
                    textView = new TextView(this);
                    str = "ۘۢۨۧۢۖۘۛۚۜۘۖۖۖۘ۟ۙ۫ۘۥۘۘۦۘۤۚۗۡۧۥ۠ۘ۠ۖۘ۟۟ۡۨۚ۟ۦ۫ۨۘۗۧۚ۬ۚۖۘ۠ۥ۬۬ۨۥۦ۬ۤۚۛ۬ۢۖۜ۬ۙ۠ۧۧۧۚۖ۟ۢۖۜ۬ۘ۫ۧۖۘ۫ۙۦۘۤۛ۫ۙۥۗۡۙۥۘ";
                    break;
                case 357098217:
                    layoutParams3.topMargin = m80dp(this, 12);
                    str = "ۨۥۨۚۙ۟ۙۨۘۘۦۥۦۖۖۥۨۧۙۖۚۨ۬ۙ۠ۡ۫ۗۧۤ۠ۧۦۦۤۖۢۛۜۙۨۙۨۘۖ۟ۨۖۚۗ۠ۜۜۘ۫ۛۜۘۥۘۘۜۗۥۛۚۡۘۛۨۦۗ۟۠ۚۚۖۙۦۘۢۦۘۦۢ۫ۨۢ۫ۦۙۙۡۤ۠ۙۘۖۖۢ۟ۖۡۘۚۙۘۙۤ";
                    break;
                case 449607268:
                    textView.setText(getString(C0931R.string.str0037));
                    str = "۠ۚۛۛۚ۫۬ۦۡۘۛ۠ۥۘ۫ۙۗۡۡۡۘۘ۫ۦۘۙۡۥۘۢۧۦۘۘۖۥۘۧۚۛۛ۟ۘۘۧۥۡ۠ۡۖ۠ۖۡۘۜۢۡۦۧۢۦۛۡۢۜۘۙ۫ۥ۠ۛۥۘۖ۠ۡۨۘ۟ۙۧۦ۠ۚۜۧۘۗۖۥۨۘۨ۟ۢ۫ۘۛۨۧۘۚۚۥۙۗۜۛۤۖۧۤۥۡۡۖۘ۫ۧۙ۠۬ۖۦۜۥۤۘۢۜۙۘۦ۫ۡۘۨۗۦۗۘ۟ۘۛۡۙۡۤ";
                    break;
                case 815859454:
                    alertDialog = new AlertDialog.Builder(this).setView(linearLayout).setCancelable(false).create();
                    str = "ۖ۬ۡۘ۬ۤۜۢۖ۟۫ۜ۠۬۠ۡۘ۫ۧۨ۟ۤۢۗۡ۫۫ۢۡۥ۠ۛۘۧۘۡۖۦۥ۟ۡۥۥۤۘۦۨ۫ۡۢۥۗۘ۫ۧ۠ۖۨ۠ۘۡۘۧۡۦۘۢۜ۟ۤۦۙ۫ۗۖۘۢۡۧۘۧۤۦۘۘۥۜۛۛۘۘۙۖۜ۫ۖۚ۫ۥۘ۟۠ۥۦۢۥۙۦۥۘۡۥ۟۫ۦۥۤۦۗۙ۬ۧۢ۠ۤۤۗۦۗۛ۬ۦۘۘۛۨۤۙۤۙۥۦۨۘ";
                    break;
                case 1155276657:
                    gradientDrawable = new GradientDrawable();
                    str = "ۦۥ۬۟ۧۥۥ۟ۘۡۚۚۘۗۚۧۜ۫ۘۥۨۘ۠ۤۜۘۚۡۨ۟ۘۥۘۨۧۦۘ۟ۢۦۨۙۥۘ۟ۖۚۡۖۘۨۖۤ۫ۙۢۚۛۜۘۘۚ۫ۖۜۘۖۥۢۥۖۦۙۛۡۖۗۛۘ۬ۡۘ";
                    break;
                case 1186994916:
                    linearLayout = new LinearLayout(this);
                    str = "ۥ۠ۡۥۦۚۘ۟ۘۜۥۙۘۨۚۤۡۢۨۧۖۘۖ۬ۛۙۢۖۜۘ۫ۜۙۢۦۤۜۢۙۧۛۙۘۡۘۚۚۜۥۖۙۖۘۤ۠ۖۘۡ۟ۜۚۢۤ۟۫ۜۘۛۥۛۨۡۘۛۜۡۤۦۚ۠۬ۙۧۦۤۙ۟ۥۜ۟ۜۥۖۤۜۨۘ۬ۜۛ۬ۢۜۘۘۧ۟";
                    break;
                case 1374675096:
                    linearLayout.setGravity(1);
                    str = "ۖۦۧۘۗۦۘۘۧۙۘ۟ۥ۫ۡ۠ۦۜۜۦۜۨۖۧۤۜۥۦۧۘۜ۟ۛۢۙۦ۠ۤۨۚۜۙۥۘۦۘۚ۬ۥۘۥۥۡۘۚۢۥۗۦۜۘۢۘۢ۫ۖۦۤ۬ۙۛۢۡ۫۠ۢۗۖۜۨۙ۠ۦۥۘۜۙۢ۠ۥ۬ۗۙۗۥۙۤ۫ۨۦ۠۠ۗ۬ۚۜۘ۠ۚ۫۠ۛ۠";
                    break;
                case 1390648044:
                    linearProgressIndicator.setTrackColor(Color.parseColor(Deobfuscator$$app.getString(-3440729216548429641L)));
                    str = "ۖۖۗۢۜۛۖۤۡۘۗ۠ۚ۟ۡۗۛۛۥۘۜۨۡۘۧۤۥۘۥۦۦۖۛۙۚۦۧۘۚ۫ۛ۠۟ۖۘ۫ۢ۫ۤۦۡۘۖ۟ۨۘۗۨۜۘ۬ۗۙۢۛ۫ۖۤۡۢۦۡۘۡ۟ۤ۫۟ۨۘۜ۬ۥۖۧۖۘ۬ۤۢۥۛۦۘۤ۬ۘۤ۫ۜۘۤۖۛۦۚۘۢ۠۠ۙۘۘۘۨۙۜۘۖۘۘ";
                    break;
                case 1527156079:
                    layoutParams.topMargin = m80dp(this, 20);
                    str = "ۖۛ۫ۗۧ۬ۤۖ۠ۥ۫۬ۧ۠ۜۘۙ۟ۜۘۘۛۦ۬ۗۖۘۘۦۡۤ۠۟ۤۗۨۘۢ۬ۗۙ۠ۤۜۥۚۜۤۘۘۙۧۥۙۜۜ۠ۨ۬ۤۗۚۛۖۗ۬ۧۖۗۖۜۧۢۘۥۥۧۘ۫ۤۡۘ";
                    break;
                case 1641761124:
                    alertDialog.show();
                    str = "ۥۦۧۘۧۨۛۥۧ۫ۨ۬ۥۘ۫ۦۡۨۚۡۘۥۤۨۙۧۘۜۘۢۜ۫ۤۙۢۙۙۥ۠ۡۥۜۘۙۨۗ۠۫۫ۥۗۘ۫ۚۚۘۧۢ۫ۖۜۘ۬ۡۦۦۗۜۘۥۖۘۘ۬ۥۘۢ۟ۧۙۢ۫۬ۛ۟۬ۥۙۡۤۨ۠ۥۡۘۚۢۤۢۡۡۚۡۚۤ۬ۧۢ۫ۥۘۢۜۚۡ۟ۚۡۗۦۡۖ۫۫۬ۘۘۨۨۡ";
                    break;
                case 1643060685:
                    imageView.setLayoutParams(layoutParams);
                    str = "ۤۖ۠ۧ۫ۖۘۢ۠ۜۘۚۜۤۨۤۨۘۘۦۙ۫۬ۦۜۢ۠۟ۖۥۙۨۚۗۨۘ۠ۖۧۘۢ۫ۤۚۥۤۙۡۛۗۦۨۘۧۚ۬ۨۙۡ۫ۧۚۜۜ۫۟ۜۚۧۚۗ۫ۖۘۦۜۘۘۙۡۡۘۖ۠ۡۘۨۥۧۦۜۘ۟ۙۡ۠ۖۥۘۤۧۙۖۗ۠ۜۚۢۚۦ۟ۙۙۘۘۖۛۥۘ۬ۦۨۘۙۨۙۥۤۙۦۖۗۥۜۖۘۤۦۘۧۥۧۖۙۡۘۡۢۘۘ";
                    break;
                case 1661659163:
                    this.progressDialog = alertDialog;
                    str = "ۧۚۖۘۤۙۚۖ۠ۨۨ۟ۥۙۜۨۦ۟ۛۚۘۘۗۚۤ۟ۛۨۙۚۛۦۥۖۘۘۘۤۨۘۢۗۗۦۘۧ۬ۗۧۛۨۘ۠۫ۡۘ۟ۢۡۘۡۜۨۘ۫۠ۖۙۤۨۨۗ۬ۦ۠ۥۘۜۜۖۖۗۨۘ۫۫ۦۖ۫۟ۙۗۨۘۥۧۙۛۥۧۗۜۖۘ۬ۖ۠ۡۗۗ۠ۖ۫ۢۗۧ۠ۧۗۡۢ۬ۤ۠ۢۢ۫۬ۜ۬۟ۧۧۥۛۜۘۘۦۡۖۘ۠ۚۦۘۜۛۚ";
                    break;
                case 1690884633:
                    imageView = new ImageView(this);
                    str = "ۘۨ۬ۙۧۧۦۧ۬ۨۧۗۤۗۚۥ۫ۙۖۜۚۤۛۘۘۢ۬ۜۜ۠ۜۘۤ۠ۙ۠ۦۥ۟ۘۙۨۘۖۘ۫ۢۙ۫ۥ۫ۙۨۖ۫ۡۗۖۧۨۘۡۙۤۦۧۚۖۙ۫ۤۡۨۘۘۘۡۥ۫ۥۨ۬ۥۘۥ۫ۢ۬۬ۙۦۜۘۙ۬ۡ۬ۧۥۘ۬۠ۖ۫ۖۖۘۧۚۢۤۛۖۘۤۜۢ۫ۜ۠۟۟ۧۢۙۚۖۧۘ";
                    break;
                case 1799984392:
                    linearProgressIndicator.setIndicatorColor(ContextCompat.getColor(this, C0931R.C0932color.color0024));
                    str = "۟۫ۡۘۢۤۥ۠ۥۤۨۡۡۘۘۨۖۘ۫ۚۜۘۜ۟ۢۗۨۤۖۖ۟ۖۦ۟ۗۨۘۜۘۖ۬ۘ۫ۤ۟ۦۘۚۖۘ۠ۢۥۜ۠ۘۙۛ۫۟ۦۥ۟ۖۨ۟ۢۘۖۙ۠۠ۖ۟ۜ۬ۜۖۤ";
                    break;
                case 2023780284:
                    linearLayout.addView(textView);
                    str = "ۖ۟ۘۘۖۧۨۘ۫ۦۡ۟ۡ۟ۛۢۦۘ۫ۨ۠ۛۜۗۛۙۡۘۦ۟۫۫ۚ۫ۧ۫ۤۛۜۘۥۖۡۘ۬ۢۡۘۦۨۜۡۥۦۢۢۜۨۡۧۘ۟۫ۨۘۗۙۗۤۢۡ۬ۡۨ۟۬۠ۡۦ۟ۚۜۧۚۘ۠ۚ۬ۧۦ۟ۛۖ۠ۥۗۗ۫ۨ۫ۘۘۚۚۥ۫ۨۜۢۘۘۘۥۙ۟";
                    break;
            }
        }
    }

    private void showUpdateDialog() {
        LinearLayout linearLayout = null;
        TextView textView = null;
        TextView textView2 = null;
        AlertDialog alertDialog = null;
        GradientDrawable gradientDrawable = null;
        int i = 0;
        int i2 = 0;
        Button button = null;
        String str = "ۘۗۖۘ۟۟۠ۤۜ۫ۜۗۗۖۦۡۘ۬ۡۨۛۘۨۘۚۜۥۥۗۡۘۥۦۡۘۨ۫ۛۚۜۧۘۘۚۖۦۤۥ۫ۢۦۡ۠ۦۦۧۥۘ۫ۛۥۜۜۘ۬۬ۨۘ۫۬۟ۦۘۘۛۖۤۛۘۚ۫ۙۘۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 149) ^ 45) ^ 861) ^ 369) ^ 117) ^ 609) ^ 290) ^ 544) ^ 172) ^ PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW) ^ 853) ^ 384) ^ 89) ^ 750) ^ 470) ^ 936) ^ 179) ^ 817) ^ 694) ^ 164) ^ 371) ^ 41) ^ 108) ^ 903) ^ 958) ^ 456) ^ 165) ^ 20) ^ 787) ^ 944) ^ 884) ^ (-1597612179)) {
                case -1954152810:
                    textView2.setTextSize(16.0f);
                    str = "ۥۗۡۘۥۧۘۚۙۘۜۤۛ۫ۧۛۧۥ۫ۜۖۦۘۡۢۡۖ۠ۖ۬۫ۥ۟ۛۥۘ۬ۜۥۖ۟ۨۘ۬ۤ۫ۜۨۘ۬۫۬۬ۚ۟ۡۢۦ۟ۜۖ۬۠ۨۘۛ۠ۧ۠۠۟ۦۘۤۥۦۢۘۛۦ۠ۥۖۚۜۖۘۙۗ۠۠ۜۛ۫ۢۛۤۥۘۘۙۗۙۚۜۨۘۚۛ۬ۥۗۧ۠ۡۨ۫۠ۙۜۖ۟ۥۜۡۘۜ۟۫ۚۛۦۛۗۥۢۧ۫ۧۡۖۘۧۨۛ";
                    break;
                case -1754212173:
                    button.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                    str = "ۜۛ۬ۢۢۘۥ۫ۘۚۘۘ۠ۧ۟ۘ۟ۜۘۜۥ۬ۡۦۧۘۚۡۚۡۨۨۘۦۤۧۧۙۘۘۤۨ۫ۡۜۨۦۥ۬ۚۦ۟ۜۗۤ۬ۛۚ۬۬ۖۘۙۗۧۙۖۦۘۚۤۘۘ۟ۥۥۘۖۡۚۡۥۨۘ۠ۗۘۛۡ۠ۙ۬ۥۗۥۨۤ۟۫۟ۗۦۘۜۗۚ۠ۧۚۙۥۨۤۗۘۛۖ۬ۖۢۡۘۢۥۖۢۜۦ۟ۙۡۘ";
                    break;
                case -1610308263:
                    textView2 = new TextView(this);
                    str = "ۛ۠ۘۘ۠ۥ۠ۜ۟۟ۢۖۨۘۦۤۚۗۖۦۘۙ۫ۦ۫۫ۤ۟۬ۖۘۦۗ۟ۚۗۡۜۗ۠۟۟ۖۘۜ۬ۤۜۥ۫۬ۛۛۖ۬ۥۙۙۤ۫ۖۘۜۥۗۢ۟ۤ۬ۦ۠ۚۦ۬ۙۗۦۘۥۚۘۘ";
                    break;
                case -1606511930:
                    i = getResources().getDisplayMetrics().widthPixels;
                    str = "۟۠ۘۘۡۢۗ۬۟ۘ۠ۧۦۘ۫ۘۘ۠ۜۡ۬ۚۤۚ۟ۥۘۤۚۘۚ۠ۛۤۜۦ۠ۡۤۗۢ۬ۤۘۜۘۨۘ۫ۧ۬ۦۘۖۘۧۘۡۦۜۘ۬ۛۥۘۖۙۡۘۦۛ۟۫ۙۜۘۗۥ۟ۤۖ۫ۚ۬ۖۘۧۡ۬ۥۥۖ۫ۘۘۙۜۥۡۖۜۤۙۙۥ۫ۡۛۦۘۡۥۖۘ۫ۨۡ";
                    break;
                case -1429921306:
                    textView.setText(getString(C0931R.string.str00c5));
                    str = "ۖۢۗۘۗۦۚ۠ۛۥۨۙۡۛۤۖۨۚۢ۫۠ۚۖۦۘ۠ۢ۟۟ۚۘۘۧۙۢ۟ۥۖ۫ۨۧۘۤ۬ۦ۬ۨۙۛۚۛ۫ۜ۬ۥ۠ۖۘۗۡۜ۟ۢ۠ۖۘۘۘۖ۫ۜۙۖۘۙۥۨۘ۟ۤۡۘ۠ۘۘ۟ۢ۫۠ۦۨۘۚۨۚ۫۬ۨۢۖۡۘ۬ۗۦۖۗۡ۠ۦۘۛ۟۫";
                    break;
                case -1423135825:
                    alertDialog = new AlertDialog.Builder(this).setView(linearLayout).setCancelable(false).setPositiveButton(getString(C0931R.string.str009c), new DialogInterface.OnClickListener(this) { // from class: kentos.loader.activity.LoginActivity$$ExternalSyntheticLambda0
                        public final LoginActivity f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            String str2 = "ۚۗۖۧ۫ۥۡ۬ۢۗۦ۫ۨۙۙۦۙۦۘۢۗۙ۫ۨۛۦۛۡۘ۠ۤۥۧۖۡۖۚۘۘۚۗۧ۫ۨۜۘۜۘۧۘ۫ۚ۫۫ۘۢ۠ۘۘۘۧ۟ۖۚۡۙۥۘۛ۬ۧۧۡۗۡۘ۠ۧۤ۠۠ۚۗۦۚۗۘۥۢۙۗۤۘۘۤۛ";
                            while (true) {
                                switch ((((((((((((((((((((((((((((((((str2.hashCode() ^ 381) ^ 614) ^ 830) ^ 779) ^ 913) ^ 113) ^ 506) ^ 532) ^ 0) ^ 717) ^ 222) ^ 674) ^ 65) ^ 673) ^ 137) ^ 497) ^ 663) ^ 902) ^ 460) ^ 965) ^ 38) ^ 546) ^ 399) ^ 549) ^ 847) ^ 144) ^ 540) ^ 332) ^ 160) ^ 864) ^ 147) ^ (-2137030281)) {
                                    case -931451068:
                                        str2 = "ۗۨۡۤۨۖ۫۫ۡ۫ۚ۠ۧ۫ۢۚۗۛ۬۟ۢۗۤۦۥۡۦۘۢۨۥۘۘۗ۫۫۠۫۬ۢۤۨۛ۫۠ۢۘۘۙ۟ۖۘۢۨۚۜۗۗۘۦۜۘۙۢۥۘۡۢۢۗۗۗۚۙۦۘۤۗ۠ۚ۠ۨۘ";
                                        break;
                                    case 120706009:
                                        this.f$0.m247lambda$showUpdateDialog$0$kentosloaderactivityLoginActivity(dialogInterface, i3);
                                        str2 = "ۚ۬ۜۘۤ۠ۢۢۘۥۘۡۖ۟ۘۛۜۧۙ۠ۜۡۖ۫ۤۚۦۖۧۜ۟ۥۘ۟ۙۘۛۛۨۘۗ۠ۘۘۥ۫ۘۘ۟ۜۦۜۢۡۘۘ۟ۚۦۡۤۙۥۜۘ۠ۜۗ۬۬ۛۖۨۨ۬ۢۜ۟ۦۨۘۢۦۘ";
                                        break;
                                    case 898701875:
                                        return;
                                    case 930828840:
                                        str2 = "ۖۤۡۖۥ۟۫ۦۨۤۦ۟۫ۛۥۘۡ۠ۨۦۨۘۜۨ۠ۡۜ۬۟ۡۘۛۢۤۥۛۨ۬ۧۗۡۤۦۘۡۙۨ۫ۗۡۥۗۥ۠ۨ۠ۢۧۥۘ۬۫ۡۗۖۗۡۗۘۘۦۖ۟۟ۥۚۖۤۙۤۥۨۛۨۖۖۡ۟ۤۡۖۖۘۖ۟ۘ۬ۨۜۗۛۧۡۗ۬۬۠ۥۘۨۗۤۜۦۗ۫ۦۜ۫ۨۤۧۡۘۤ۟ۡۘۛۧۜۘۥۡۧۘۡ۟ۘۘۖۘ";
                                        break;
                                    case 2018996591:
                                        str2 = "ۨ۠ۗۚۤۥۘۧۖۢۥ۬ۥ۫ۨ۟۠ۧۡۘۛۦۖ۟ۚۡۘۘۡۜۘۚۚۜۢۛۙۡۤۜۘۘۛۡۘۡۡۨۘ۬۫ۨ۫ۘۢۙ۬ۤۚۢۙۗۨۘۘۧۙۛۜۙۘۗۦۡۘۛۧۧ۠ۥۡۖ۠ۦ";
                                        break;
                                }
                            }
                        }
                    }).create();
                    str = "ۚ۬ۚۜ۫ۙۛۥ۟ۤۡۗ۟ۤۡ۟ۦۘ۠۠ۥۡۚۗۗۤۖۘۨۤۨۘۗۦۙۦۘۢ۟ۛۨۡ۟ۥۛۥ۬۠۫ۜۙۧۘ۠ۘۘۡۢۦۘۤۦۤۤۢۡۨ۫ۙ۠ۖۥۥ۠ۖۗ۟ۧۘۡۢ۠ۙۛ۬ۖۡۘۘۨۜۙۢۛۤۧۜۘ۟ۖۚۙ۠ۧۢۛۘۢۦۗ";
                    break;
                case -1032872426:
                    gradientDrawable.setColor(-1);
                    str = "ۙ۠ۖ۠ۥۤۖۙۦۧۤۚۧۙۧۗۡۜ۫ۖۜۧ۠ۡۘ۟ۗۥۘۨ۫ۦۛۥۤۙۢۧۜۦۡۘۥۢۤ۬ۙۜۖۤ۠ۖۡۜ۠۟ۘۧۘۙۖۜۘۤۡۦۚۖۘۙۡ۟۠ۡۘۨ۟ۡۘۢۢ۟ۘۛۥۗۢۘ۟ۛۦۚۛ";
                    break;
                case -998974681:
                    linearLayout.setPadding(m80dp(this, 16), m80dp(this, 16), m80dp(this, 16), m80dp(this, 16));
                    str = "۟ۥۦۘۛ۠ۢۨۜۨۖ۬ۗ۬ۡۚۜ۠۬ۚۧۖۥۤۨۗۙۗۤۚ۫ۥۡۦۛۦۡۘۗ۬ۧۜۗۗۜۢۤۨ۬ۧۡ۟۠ۘ۬ۜۚ۬ۥۘۘ۠ۖۘۢۜۜ۠ۜۨۜۖ۠ۚۤۖۘۘۧۘۘۡ۫ۙۡۦۙۙۙۤۖۨ۟ۤۡۛۢۡۘۘۤۥۧۘۘۥۜۖۘۤۜۖۦۘۧۦ۫ۜۤۗۜ۠ۡ۠ۦۥ";
                    break;
                case -820109087:
                    linearLayout.addView(textView);
                    str = "ۢ۟ۛ۬ۢۘۗۘۧۖۙ۠۫ۗۦۘ۠ۧۚ۠ۦ۬ۘۛۨۘۦۧ۠ۜۚۜۘۘۚۘۘۜۦ۠ۡۦۚۡ۬۬ۢۥۜۡۖۡۢۗۖۗۢۢۘۤۥۤۥۤ۬ۛۙۛ۫ۘۘۙۥۨۘۦۥۘۚۗۘۘۘۚ۠ۦۛۨۗ۟ۡۨۨۘۨۥۖۘۜۥۧۖ۠ۨ۬ۗۥۘۖۢۦۘۘۜۥۖۘۘۨۨۦۦۗۘۘۢۚۡۘۦۧۘ";
                    break;
                case -792792205:
                    String str2 = "ۥۡۘۜۥۥۘۧۛۜۘۘۜۨۚۥۥۜۘۥۗۦۨۨۢ۫ۦۡۜۡ۬ۨۡۦۜۘۧۘ۟ۨۨۘۢۖ۟۫ۤۢۘۖۘ۫۬ۧ۫ۖۦۘۜۤۦۧ۬۟۫ۖۦۘۧۧۜۙ۫ۤۛۘۘ۠۟۬ۡۜۛ۟۟ۨ۫ۤۘۖۧ۬۫ۚۢۜۙۜۢۜۥۘۚۢۘۘۚۧۡۧۤ۟ۖۨ۫ۘۖۜۧۘۘۜۡۙۙ۫۫ۤ۠ۥ۬ۧۡۗۙۨ۟ۗۘۘۨ۟ۙ";
                    while (true) {
                        switch (str2.hashCode() ^ 1099057970) {
                            case -1960311029:
                                str2 = "ۘ۬ۜۘۥۖۨۘۦۗ۟۫ۛۙۜۛۡ۟ۖۜ۟ۤۥۜۚۨۘۗۜۡۛۙۘ۫۬ۡ۫ۖۨۘۥۨۘۘۙۦۥۢ۠ۙۚۨۘۡ۟ۜۘۡۡۦۥ۬ۡۖۙ۟۠ۡۢ۫ۚۧۜۧۢۖۘۡۘۢۘۘۡۦۚ۬ۘۘۘ۬ۘۘۜۤۤۙ۫ۢۥ۬ۥۡۙ۠۠ۖۘۧۘۛۖۘۧۘ";
                            case 338618417:
                                String str3 = "ۧۚ۬ۛۛۦۘۤ۬ۨۘ۬ۦۧۘۢ۠ۢۨۤۙۜۖۛۖۨۡۘۗۦۖۘۙ۟ۖۘۘ۬ۤۢ۟۟ۧۙۨ۫ۡۦۢۢۤۧۦۘۘ۟ۛۖۚۥۨۘۨۙۦۖۦ۬ۛۧۗۡ۟ۘۘ۬۬ۗ۠ۚۜۢۜۦۘۚۨۖۘ۬۟۬ۗۢۥۘۨۢۙۖ۫ۖۨۖۢۡۡۘۜۦۥۧۦۘۘۢۡۖۜۨ۫ۚۤۜۘۛۦۚۙۤۘۘ۫ۖۡۥۧۡۘ۬ۘۧۧۖۡۘۙۡ۬ۢ۟ۖۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1564032725)) {
                                        case -587340019:
                                            str3 = "ۗۚۧۦۘۨۘۧۨۧۖۙ۠ۨۜ۬ۡۖ۫ۢۢۖۘ۬ۡۜۘۚۨۨۘۛ۬ۙۥۜ۟۠ۦۙ۠ۤ۠ۘۢۧۤ۟ۜۘۙ۠ۦۤۚۛۘۜ۠ۢۡۧۘۦ۬ۖ۟ۦ۟۬ۨۙ۟ۥۗۤۢۖۙ۫ۖ";
                                        case -94211334:
                                            String str4 = "ۘ۟ۢ۟ۗۖۦۨۖ۬ۙۦۘۖۙۙۗۡ۠ۘۧۜۘۨۤۡۡۢۛ۟ۖۥۧۦۢۤ۠۫۬ۢۘۜۨ۬ۖۖۤۤۡۤۙۖۗ۟ۛۢۖۢۥۤۧۜۥۛ۫ۖۖۘۢۛ۠ۘۥۜ۬ۘۘۙۤۜۗ۠ۢۙۘۖۗۢۡۘۖۗ۬ۚۨۘ۫ۧۙۢۗۤۤۦ۬۬۫ۜۘ";
                                            while (true) {
                                                switch (str4.hashCode() ^ (-1906543534)) {
                                                    case -1815696225:
                                                        String str5 = "۫۫۟ۚۗۦۘۜۦۨۡۙۨ۟ۢ۟ۦۗۘ۬ۛۜۘۜ۫۠ۛ۠ۥۗ۟ۚۨۤۙۘۨ۠ۘ۠ۢ۠ۡۘۙۤۦۘۦۜۤ۠ۗۖۖ۫ۢۖۨۙ۫ۗۡۘۤۛۡۗۘۜۘۧ۬ۢۘۖۡ۬ۡۢ۠۬ۖ۟ۨۜۨۡ۟ۚ۫ۘۚۨۨۤۦۡۘۢۗ۫ۨۡۡۘۛ۬ۧ۬ۦۧۖۧۘۡۜۥۘۚۨ۟ۦۢۢۦ۫ۨۘ۟ۘۘ۫ۜۡۘۚ۟ۤ۫۬ۦۘ۟۫۫";
                                                        while (true) {
                                                            switch (str5.hashCode() ^ 759706091) {
                                                                case -1789255100:
                                                                    str5 = "ۛ۠ۤ۬۠ۦۡ۟۠ۧۛ۟ۚۘ۟ۤۖۜۘۚۖۖ۫ۦۛۛۨ۟ۡۨۡۘۜۦۡۘۨ۫ۚۗۧۚ۠ۗۖۘۢۗۥۢۨۦۢۨۘۨۖۥۢۛۖۜۥۨۘ۠ۗۨۥۜۨۘ۠۠۬ۧۘۘۖۘۨ";
                                                                case -930873096:
                                                                    str4 = "ۙۨ۠ۨۚۥۜۤۘۡ۫ۨۘۚۙۦۧۖۧۚۛۦۢۤ۫ۘۦ۫ۦ۠ۡۘۢۨۖۘۛۜۗۘۙۙۙۚۦۘۙۘ۟ۧۨۦ۠ۖۨۘۧۧۘۢۖۙۦۧۘۚۘ۟۠ۛۡۘ۫۠ۢ۠ۛۛ۟ۥۦۘ";
                                                                    break;
                                                                case 1206135930:
                                                                    String str6 = "ۨۘ۫ۘۡۨۘۜۙۜۘ۠۫ۚۥۤۘۘۛۖ۠ۛۘۡ۫ۧۜۢۢۜۘۦۡ۬ۤ۬۠ۨۖۦۘۗۙۥۘۚۗ۠ۥ۟ۖۘۙ۠۠ۛ۟۫ۢۧۘۘۡۜۘۚۜۘۖۚۤۘۘۗ۬ۦۖۜۨۘۜۜۛۙۡۦۙۛۡۥ۫ۨۘۘۥ۠ۗۙۡۘۙۜۚۧۥ۬ۛۡۖۚۚۖۚۖۥ";
                                                                    while (true) {
                                                                        switch (str6.hashCode() ^ (-839034517)) {
                                                                            case -1680953590:
                                                                                str5 = "ۚۚۗۥۡۥ۟ۨۖۘ۠۬ۖۦ۬ۢۚۚۛۘ۠۬ۤۘۛۜۤۜۘۘۖۥۖۧۨۗۡۘ۫ۖۨ۫۟ۜ۬۟ۜۚۥۘۗۛۛۥۨۧۢۖۛۧۖۘۡ۟۬۫۬۟۬ۜۛۤۥۖۧ۫ۘۘۨ۠ۧۜۡۦۘۤ۬ۘۧۤۛۤۚۨ۠ۘۥ۟ۚۥۢۙۜۤ۬ۤۢۨۤۚۢۛۢۖۖۘ۫ۨۘۜۜ۟ۡۤۦۧۥۥۗۙۖ۫ۦۘۨۘۘ";
                                                                                break;
                                                                            case 569535315:
                                                                                str6 = alertDialog.getWindow() != null ? "ۨۧ۫ۙۡۖۘ۟ۙۡۘ۠ۙۢۧۤ۫ۦ۫ۜۛۧۛۚۤۦۘۦۤۜۘۗۗۘۘ۟ۖ۟ۜۗۜۘۗۤۧۖۦۥۘۧ۬ۤۥ۟ۦۥۥۘۤۥۦۤ۫۬۟ۙۥۘ۟ۗ۟۫ۛۢۙۤ۠ۡۦۜۘۥۥۡۘۗ۟۟۟۠۠ۖۙۖۢ۫ۜ۟ۜۘۘ۬۬۬ۧۜۘۡ۫ۖۘۥ۫ۢۙ۠ۦۘۖ۟ۥۥۘۢۡۡۘۜۖۦۘۚۜۤ۫ۗۢۢ۟ۡۘۛۥ۠ۨۦۜۧۛ۠" : "ۛ۠۬ۢ۬ۧۢۖۜۘۜۨۧۗۚۦۧۖۦۘۧۢۥ۟ۦۧۘۗۤۘۘۖۨۤ۟۠۬۬۠ۨۨ۬ۚۨۦۨۘ۟ۡۘۧۡۙۜۜ۟۬ۖ۟ۦۧۦۢۥۢۨۜۦۖۨ۟۟ۢۘۤۥۗ۫۫ۙۖۘۘۘۜۜۦۙۚۘۘۢۨۥۨۜۦۘۥ۟ۘۡۛۨۘۥۦۖ۟۠ۡۘۢۦۡۘۥۡ۟ۨۤۧ۫ۦ۟ۘۘۧۘ۠ۘۧۘ۟ۤ۬ۢۦۦۡۥۛۛۚۡ";
                                                                            case 759698933:
                                                                                str5 = "ۗۧۗ۫ۥ۟ۢۙۥۗۦۦۨۖۘ۠ۧۦۘۤۗۥ۠ۡۖۧ۫ۨۛۖۛ۟ۗۤۗ۬ۛۘۦۘۘۖۛۘ۫ۛۦۘۡۙۘۘۗۥ۫ۗ۟۠ۖۜۛۤۘۧۘۙۧۘۜۘۖۘ۟ۗۥۢۥ۟ۢۡ۟ۚۙ۟ۦۖ۬۠ۡۥۘۨۨۡۘۢۘۗ۟ۨۚۖۗۚۛۦۜۧۜۜۦ۟۠۟ۖۦۘۚۡۡ۬ۡۧۘۨۛۘ۟ۗۜۘ";
                                                                                break;
                                                                            case 1061761629:
                                                                                str6 = "ۖۨۢۘۗۤۨۚۤۡ۠ۧۦۗۤۛۜ۟ۧ۟ۗۛۖۖ۫ۡۡۘۧۨۧۡۥۚۛۖۘۙۡ۟۫ۜۧ۠ۙۧۚ۟ۗۖ۟ۛ۟ۤۧۖۘۜ۟ۖۘۤۨۚۘۧۡۘۛۧۤۢۢ۠ۨۤۘۚۦۘۘۤۙۘ۫ۙۥ۟ۖ۟ۚ۫ۨۘۚۘۥۧۛ۬ۤ۠ۡۛۚۜۖ۫ۡۘ";
                                                                        }
                                                                    }
                                                                    break;
                                                                case 1930009339:
                                                                    str4 = "ۢۨۦۜۨۛۢۖۛ۫ۜۨۦۥ۬ۧۖۘۛ۠ۘۘ۠ۙۜۖۦۥۘ۫ۙۤۚۜۜۘۗۨۘۘۗۦۗۘۘ۬۟ۡۘۦۛ۬ۡۗۛۙۗۦ۬۠ۖۢۡۘ۬ۜۡۘ۠ۛۙۘۙ۫ۗۦۗ۫۟ۦۤۡۚ۫ۙۧۚۤۡ۬ۜۜۤۡۥ۟ۘۘۚۚۨۚۙ۬ۜۛۗ۫ۡۜۘ";
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case -259464528:
                                                        str4 = "۬ۚ۬ۜۡ۫۠ۨۛۘۘۡۢۙۢۜۦۙۨۢۦۘۤ۠ۚ۬ۙۥۘۦۚۙۗۙۨ۠۠ۛۚۡۘۥ۠۫ۥۖۙۛ۬ۨۘۙ۬ۦۘۨۦ۫ۖۡ۬ۨۜۨۧۖۦۙۢۥۘۢ۠ۖۘۦۡۦۘ۬ۛۥۗۗۧ۠۠ۨ۟ۗۗۗ۬ۦۨۦۢۢۢۦ۠ۗۛۦۤۘۦۢۘۙۧ";
                                                    case 1362829471:
                                                        str3 = "۫ۤ۠۠ۙۧۚ۟۟ۦۚۤ۫ۨۘۚۘۧۤۧۘۘۨۥۘۥۘۙۙۧۗ۫۫ۘۡۗۖۨۦۦۥ۬۬ۜۡۘۥۖ۬ۚۛۥۚۢۥۥ۫ۧۜۤۙ۫ۘۖۘۤۤۨۘۚ۠ۥۙۧۧ۫ۤۗ۫ۥۛۨۘۛۧۥ۫ۗۦۘۚۢۦۘۘۗۡۙ۟ۘ۟ۙ۫ۗ۬۠ۛۛ۟ۜۢ۟ۤۧۜۜۘۙۘۗۡۘۗۧۚ";
                                                        break;
                                                    case 1726397220:
                                                        str3 = "ۧۥۖۤۖۛۘۘۜۖۗۜ۠ۨۨۘ۬ۥۜۘ۬ۜۖۢۚۜۛۜ۟ۗۖۥۘۡ۟۫ۛۨۡۡۦ۫ۖۖۡۘ۫ۛۘ۫ۖ۟۠ۤۖۘ۠۫ۨۨۥ۟ۡۚۘۘۥۤۡۘ۬ۤۛۡۥۘۘۖۢ۬ۚۥۦۘ۟ۢۜۘۚۜۜۘۨ۫ۡۘۤۡۥۚ۫ۛۥ۫ۜۘ۟ۖۚۙ۟ۙۗۖۦۖۤۨۘۥۨۜۧ۬ۧۙۘۖۘۙۖۨۢۗۡۗۘۜۘۥۡۛۦ۬۟ۧۨۢۥۙۨۘ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case 508017574:
                                            str2 = "۬ۚۦۤۢۛ۫ۧۡۘۦ۬ۨۙ۠۟ۛۗۙۛۗ۫ۛۤۢ۬ۡۥۘۘۧۘۚۘۦۘۙۦۧۛۨۨۘۢ۠۠ۨۡۛۤۚۙۡۘۜۘ۠۟ۡۤۦۦ۫ۖۨۘۙۚۘ۠ۧۘۘۢۚۘۘۛۦۨۘ";
                                            break;
                                        case 1407257252:
                                            str2 = "ۙۗۧۗۙ۟ۙۖ۠ۗ۠ۜۡ۬ۘ۠۫ۘۗۘۚۦۘۚۤۦۘۙۘۜ۟۠ۡۘ۟ۧۘ۬ۡ۬ۢۘ۟ۨۘۡۖۢۡۛۨۥ۬ۜۦۢۨۡ۬ۢۛۛۜۧۘۚۜۤۦۘۤۘۖۛۨۥۘۦۡۚۚۙ۬ۤۡۘۧۗۦۘۗۜۡ۫ۖۜۘ۟ۘۡۘۦۡ۟ۥۡ۠ۖۚۡۥۚ۠ۢۖ۫۟ۦۖۤۥۦۘ۬۠ۦ";
                                            break;
                                    }
                                }
                                break;
                            case 537612815:
                                str = "ۦۙۜۦۥۘۥ۟۬ۡۙۥۧ۫۫ۘ۠ۙۙ۬ۨ۠ۘۥۦۢۡ۟۫ۡۘ۠ۧۛۘۢۘۘۙۦۤۗۗۖۜ۟ۜۗۘۧۘ۫۟ۙ۬ۖۢۡ۠ۗۧۡ۬ۧۘ۫ۚۡۛۥۡۡۙۢۧ۟ۖۙۦۨ۬ۢ۬ۙۧۡۛۚۦ۬ۡ۫";
                                continue;
                            case 1928081959:
                                str = "ۘۢ۟ۜۥۡۥۦ۟ۙ۟۬ۚۡ۠ۥۜۢۤۛۘۨ۟ۘۧ۫ۗۖۚۚۘ۟ۙۗۚۖ۫ۥۧۘۛۤۜۘۛۡۨۖۦۥ۟ۗۨ۫۬ۖۡۢۥۤۧ۬۫ۡۨۦۨۜۘ۟ۘۡۘ۬ۧۥ";
                                continue;
                        }
                    }
                    break;
                case -626173515:
                    button.setAllCaps(false);
                    str = "ۦ۬ۡۘۧ۫ۢ۟ۙۙۘۘۘۗۤۦ۟۬ۖ۟ۗ۬ۤۥۘۘۜۡۡۘۛ۬ۖۘۙۤۧۘۥۥۤۙۙۛۥ۠ۧ۬ۦۨۘۜۘۚۖۦۘۗۜۗۘ۟ۘۘۗۥۘ۟ۜۦۤۚۜۦۦۡۢۗۢۗۘۜ";
                    break;
                case -461121057:
                    i2 = m80dp(this, 40);
                    str = "۠ۜۖۥ۬ۥۘۛۚۖۘۢ۫ۤۚۡۥۘۥۖ۟ۗۡۥۨ۟ۗۦ۬۬ۚۜۜۜۛ۟۬ۧۥ۫ۛۙۘۛۜۡۚ۟ۥۨۨۙۡۙۗ۫ۙۖۖۥۡۡۜ۫ۦۨۦۗۥۖۘۚ۬ۘۦۧۖ";
                    break;
                case -431485845:
                    linearLayout.addView(textView2);
                    str = "ۥۚۖۘۡۥۤ۬ۢۜۥۨۥۘۦۤ۟ۧ۠ۡۖ۟ۚۥۢۡۘۨۗۖۘۡۥ۬ۥۚۥۘۦۥۘۘ۟ۧۗۗۙۘۢۜۜۨۡۡۘۦۚۖۘۚۛۢۡۤۦۗۢۨۖۥۥۘ۬۟ۡۖۥۦۜۡۖۘ۠ۗ۫ۦ۟۠ۤ۠۠ۧ۟ۙ۬ۗۨۘۡۛۜ";
                    break;
                case -300546057:
                    String str7 = "ۚۛ۫ۘۙۢۛۙۘۡۨۘ۫۬ۜۘۚۙۡۘ۬۫ۖۧۤۗۙۗۦۘ۠۫ۡۘۙۦۜۚۡۦۨۥۙۨ۫ۘۘۚۡۡۨۗۨۘۦۥۨۥۜۨۘۧۜۙۡۥۡۘۛۡۘۡۥۡۘۡۦۢ۠ۢۜۗۘۙ";
                    while (true) {
                        switch (str7.hashCode() ^ (-794488212)) {
                            case -590160389:
                                str = "ۦ۬ۡۘۧ۫ۢ۟ۙۙۘۘۘۗۤۦ۟۬ۖ۟ۗ۬ۤۥۘۘۜۡۡۘۛ۬ۖۘۙۤۧۘۥۥۤۙۙۛۥ۠ۧ۬ۦۨۘۜۘۚۖۦۘۗۜۗۘ۟ۘۘۗۥۘ۟ۜۦۤۚۜۦۦۡۢۗۢۗۘۜ";
                                continue;
                            case 406746020:
                                str = "۫ۨۨۘۦۦۘۘ۬ۙۛۨۚ۟ۥ۬ۘۛۛۤۜۛۖۧۙۡۘ۠ۖۦۘ۟ۚ۫ۗۘ۠ۤۧۥ۫ۚۜۘۥۤۨۘۙۗۚۡۥۡۘۜۤ۠ۖۢۥۧۜ۠ۚۥۧۜ۠ۢۤۖۖ۫۟ۡۘ۠ۧ۠ۤۨ۬ۖۘۦۜۡۧۙۖۤ۫ۡۚۖۖۘۥ۫ۤۚ۬ۧۘۦۚۙۘۘۗۗۗۙۙ۟ۤۖۧۘ۠ۤۙۛ۬۟ۖۤۧۦۢۙۙۧۖۘۢۙ۟ۦۙۛۥۥۘ";
                                continue;
                            case 1892565297:
                                String str8 = "ۙۛۥۜۖۦۙۖۜۘۦۦۖۥۨۗ۟۫۟ۚۘۛۙۜۙۚۘ۠ۘۚۢۥۖ۟ۥۜۘۢ۬۟۫۬ۜ۫ۚۨ۬ۖ۬ۤۙۖۤۚۧۥۖۘۛۗۙۢۥۡۘۤۤۙۨۥۡ۠ۧۖ۟ۙ۟ۨۢۡۘۖۤۗۨ۟ۦۘۥۥۙ۟ۨۥۢۖۛۡۧۨ۫ۤ۟ۗۥ۬ۢۘۗ";
                                while (true) {
                                    switch (str8.hashCode() ^ (-1273507168)) {
                                        case -1349458582:
                                            str8 = "ۗۘۡۛۥۡۗۥ۫ۙۡ۟ۚۗۜۗۖۨۘۚۗۡۤۜۨۡۤۥۤ۠ۦۘ۟۟۠ۘ۫ۗۚۥۢۗۢۡۘۗۘۡ۠ۖۜۨۥۚ۬ۘۡۘ۟ۡۡۧۜۨۘۜۢۥۘۘۥۡۘۘۜۘۚۖۢۙۤۖۘ";
                                        case -991410924:
                                            str7 = "ۥۧۢۧ۟ۦۘۢۤۗۜ۟ۦۘۙۜۡۨۖۧۙ۬ۖ۟ۨۧۘۢۥۥۘۤ۠ۡۘۙۧۚۤۛۦ۬ۘۤۢ۟ۤۜۛۖ۬ۙۚۨۖ۬ۚ۫ۘۦۧۧۘۡۜۡۛۧۨۘ۠ۤۦ۟ۙۚۧ۬ۗ";
                                            break;
                                        case -134232233:
                                            String str9 = "ۘۧۚۥۦۖۦۛۢۦۡۘۘۙۚۗ۟ۖۘۘۖۨۦ۟ۜۥۗۘۢۚۧۚۜۜۗۡ۠ۖۘۥۜۨۜ۟ۨۘۥۡۖۘ۫ۡۧۙۘۛۢۡۥۥۙۨۘۙۜۢۜۧۛۥ۠ۖۛۖۨۘۙ۟ۡۘۨۢ۟ۢ۠ۜۖۜۡۗۜۨۘۗۡۗۘۜ۟ۦ۟ۡۛ۠ۗۡۥ۠۟ۚۛۡۜۡۘۛۡۡۤۚۢۖۦۧۘۥۡۗ۬ۛۛ۫ۦۥۚۖۜۤ۫ۚۘۢۦۘۚ۟ۜ";
                                            while (true) {
                                                switch (str9.hashCode() ^ 967661906) {
                                                    case 244306697:
                                                        str8 = "ۘۧۦۘۛۥۡۘۦۨۦۘۚۤۜ۟ۥۦۘۛۛۛۛۜۦۘۨۖۗۛ۠۫ۗۛۖۡۨۘۘۖۖۨۜۥ۫ۚ۟۠۬ۧۨۧۜۥۗۧۜ۬۠ۧۥۢۚۖۖۡۢۢۤۧۥۧ۬ۚ۫ۥ۠ۨۘۛۨۢ۫۟ۤ۬۬ۨۛۚۤۢۡۡۦۦۗۙ۬ۨۘۗۜۤۛۜۜۘ۬۟ۨۜۖۙ۫ۡۨۘۚۥ۫ۥ۠ۜۘۘۨۖۘۨۢۦۘۖۨۨۨۢۙ۬ۗۜۘۖۡۖۢ۬۠";
                                                        break;
                                                    case 1244125672:
                                                        String str10 = "۟ۙۨۦۧۖۨۥۙۗۘ۬ۨۙ۠ۨۧ۠ۛۧۥۘۡۤۖۘۚ۟۠ۨ۟ۤۡ۠۫ۤۜۗۢۙۨۘۖۗ۬ۦۙ۬ۨۥۧ۬ۖۛۥۚۢۘۜۛ۟۠ۥۚۤ۬ۡۘۘ۬ۛ۬ۢۨۨ۫۟ۘۘۚۨۥۘ۟ۗۛ۫ۜۡۘۜۨۢ۫ۥۘۚ۫ۖۥۨۦۜۨۦۘۢۨۧۥ۬ۤۙۜۤ۟ۦۘۛۚۢۛۗۗۢ۬ۢ";
                                                        while (true) {
                                                            switch (str10.hashCode() ^ 981472568) {
                                                                case -1807442483:
                                                                    str9 = "۟۫ۥۘۗ۬۬ۢۙۡۘۘ۟ۗۙۥ۬ۥۨۘۙۡۦۘ۟ۘۚۥۦ۬ۘۚۥۙۦۚۛۚۖۛۢۦۘۖۛ۠۬ۖۘۦۢۜ۠ۨ۫ۙۥ۬ۥۡ۬ۛۧۥۘۡ۬ۧ۠ۙۘ۫ۙۡۢۗۨۘۤۘ۟ۖۥۜ۟ۜۜ۬ۖۙۘۦۨ۟ۨۖ۠ۦ۫ۛۘۨۘۜۧۡۦۥۤۗۤ";
                                                                    break;
                                                                case 1525813176:
                                                                    str10 = "۠ۗۥۘۛۤۥۡۢۜۘۖۚۢۗۛۚۥ۬ۗۡۗ۫ۚۛۜۥۙ۟ۨۧۚۜۗۗۦ۠۫ۧۡۗۦۥۦۘۜۗۖۤۧۨۘ۬ۨ۟ۨۘۡۘۛۘۛۚۦۖۘۚۖ۬ۘ۟ۢۤۤۙۛ۫ۖۘۛۦۘۘۧۖۦۘۡۜۨۘ۟ۤۖۙۘۦۘ۠ۡۥۘ";
                                                                case 1643176179:
                                                                    String str11 = "ۗۧ۬۬ۧۜۘۧۛۥۘۦۦۜۢۗۘۢۖۜۛۤۙۗۦۘۡ۬ۙۥۡۡۗۤۢۥۛۥۛۨۤ۠ۥۘۚۡۦۡۧۜۖۨۤ۫ۡۘۧۖۥۘۢۖ۫ۜ۬ۜۤ۫ۘ۬۠ۥ۫ۗۘۘ۠ۛۛ";
                                                                    while (true) {
                                                                        switch (str11.hashCode() ^ (-2006622380)) {
                                                                            case -149473000:
                                                                                str10 = "ۤۘۜۘۖۤۨ۟ۖۘۜ۠۫ۤ۟ۜۘ۟ۨ۬ۢۡۗۥۦۖۤ۫ۤۘ۫ۜۧۜ۫ۛۖۥۢۦ۠ۛۗۘۨۦۙۦۡۤۢۧۜۘ۬۬ۦۘۨۦۨۙ۬ۖۧ۬ۢۢۨۖۘۨۗ۬ۧۗۢۙۛۜۘۛۜۡۚ۟ۥۘۡ۫ۜ۬ۗۨ۫ۗۡۘ";
                                                                                break;
                                                                            case -57390464:
                                                                                str11 = "ۢۙۜۘۤۢۚ۬ۦۜۛ۟۠ۙۥۥۘ۠ۘۜ۬ۗۡۜۤ۠ۜۚۤۤۦۦۢۗۗۦۧۘۛۚۛۗ۠ۘۗۢۖۘۦۜۥۘۛ۬ۤۥ۬ۡۘۙۗۛ۫ۙ۬ۛۗۜۘۗۨۘۢۧۥۧۚ۫ۡۧ۬ۗ۠ۙۗۥۥۘۨۤۛۧۛۡ۠ۜ۟ۚۚ۠ۡ۬ۙۧۤۚ۫ۨۡۙۨۚ۠ۤۦۢۨۨۘۡ۠ۘۥۧۦۖۗۖ۠ۘۨۤۢۜۘۡۧۦۘ۫۠ۛ۟ۥۢ";
                                                                            case 709861661:
                                                                                str11 = button != null ? "ۖۥ۠ۨۖۖۢۨۗ۫ۜۘۙۚۘۢۨۘۤۨۖ۫۟ۢۚۖۡۘۦۚۦۘۢۙۜۘۦۦۧ۬ۗۤۢ۫ۧۘ۟۫ۛۗۢۧۢۖۘۛۦۤۙۘۨۙۖۖۙۢۢۖۙۦۥۗۜۜۨۘ۫ۗۡۘۙۡۦۘۨۡۙۨۘ۟۬ۥ۠ۖۗۖ۬ۧۤۖ۫ۡ۠ۧۖ۠ۘۦۘ۫ۖۥۧ۠ۡۡۜۤۜۜۙۦ۬ۗۜ۬ۥۘ" : "۬ۛۧۛۢۦۙۚۘ۬ۘۘۡۖۦۘ۫۫۫ۗ۟۫ۢۧۜۡۗۘ۬ۚۢۖ۬ۚۥۘۘۚۙۜۘۜۘۚ۠۟ۚۦۨۘۛۜ۠ۦۛ۫ۨۘ۠۫ۡۡۘۙۡۜۛۥۘۘۘ۠۠ۨۢۙۨۦ";
                                                                            case 2022978993:
                                                                                str10 = "ۦ۟ۙ۬ۜۚۤۨۨۘۢۦۧۘۘۜ۟ۢۛۨ۫ۜۢۚۚۧۘ۠ۙۦۥۘ۠ۨۧۘۘۢ۬ۖ۟ۖۥۙۧۖۛۖۘ۬ۢ۬۟ۨۥۙۦ۟ۙ۠ۧۢۤ۟۟۫۠۠ۜۤ۟ۜۥۘ۟ۧۛۦۙۥۗ۬ۦۥۨۖۘۡۙۧۥۛۙ۫ۜ";
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 2013556281:
                                                                    str9 = "۫۟ۘۘ۫ۡ۟۟ۛۛۘۙ۫ۡۗ۫۟۫ۢۨۦۜ۠ۤۤۙ۫۟ۡۤ۠ۖۘ۫ۥۡۤۥۢۘۦ۟ۘۢۡۘ۠ۥۖۘۛۢۙۜ۟ۘۘۥۜۤۘۚۖۘۛۡۜۘۨ۬ۖۤ۫ۖۘ۠ۢۢۜۙۡۦۙۘۘۥۨۖ۫ۦۖۢ۟ۡۘ۬۫ۦ";
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 1663122707:
                                                        str8 = "۬ۚۖۙۘۙ۬۬ۙۡ۠ۚ۬ۢ۬ۨۙۜۗۧۙ۟ۡۨ۟ۜۥۗۦۙۘ۠ۨۚۦۘۖ۬ۧۨۨۤۗۡۘۡ۫ۖۘۚۡۥۘۥ۟ۦۘۜۙۘۘۧۖ۫ۚۥۜۦۤۛ۫ۤۤ۠۠ۘۘۜۧۨۗ۠ۨۘۤۤۨۘۨۡ۟ۜ۟۟ۢ۟ۚ۫ۦۘۚ۫ۘۘ۬ۛۗۗۛ۫ۛ۠ۜۘۘۚۛ۫ۙۥۘۛ۬۟ۛۦ۟ۨۗ۠ۤۦۙۖۙ۟ۥۢۛۖۖۘۧۥۚ";
                                                        break;
                                                    case 1852525518:
                                                        str9 = "ۦۖۖۧۗ۫ۦۘۧۘۘۜۧۚ۬ۜۥۘۡۘۚ۫ۜ۠ۡۛۧۛ۟ۘۢۜۘۗۡۦۘۨۛۢۜۗۧۡۢۡۘ۬ۗۗۥۖ۠ۨۗ۬ۘۛۜۘۢۦۘ۠ۤۗۥۡۘۘۦ۬ۜۘ۫ۜۖۦۚۡۘۡۢ۟۫۫ۖۘ۠ۘۗ۠۠ۥۘۘۡ۟ۤ۟";
                                                }
                                            }
                                            break;
                                        case 903006040:
                                            str7 = "ۜۛۨۘ۫ۛ۟ۥۜۥۘۢۦۚۛۡۗ۬۫ۦ۫ۡۢۛۙۚ۠۠۫۫ۛۨۘۛۥۧۘ۟ۗۧۦۢ۠ۙۗۦۗ۟ۤۘۜ۠ۢۜۡۖۦۡ۬ۡۧۘۡۘۘۙۦۡۘۦۘۦۢۜۖۘ۟ۘۢۚۢۜۧۛ۫۟ۖۚۡۘۨۜۘۗۤۗۚۧۦۦۨۨۧۘ۠ۥۡۘۧ۫ۥۡۙۨ";
                                            break;
                                    }
                                }
                                break;
                            case 1994461868:
                                str7 = "۠ۜۤۥ۫ۤ۟ۥۘۘ۬ۚۤۚ۟۟ۛۥۘۜۗۗۚۘۤۦ۟ۡۘۘۡۡۘ۫ۛ۟ۛۜۡۘۢۙۨۘۦۜۥۘۧۚۥۘۥۡۡۗۛۦۥۡۚۧۖۡۤۚ۠ۖ۠ۚۦۚ۫ۧ۟۠۟ۨۘۘۤۖۥ۠ۥۥ۬ۥۘۘۛۦۛۥۖۧۖۢۚ۠ۥۥ۬ۛۤ۠ۦۘ۬ۤۖۘۧۘۜۘ";
                        }
                    }
                    break;
                case -297220586:
                    textView2.setText(getString(C0931R.string.str00c6));
                    str = "۟ۜۘ۬ۡ۟ۖۧ۬۠ۘۙۧۖۢۦ۬ۙۗۜۤۡۗۤ۟ۨۥۘۛ۠ۚۦۜۙۙۢۙ۫۟ۧۘۜۧۘ۬ۗۦۘۨۖۘۦۙۘۛۗ۫ۗۤۜۘۦۚۜۘۦۘۙۨۗۛۖۨ۫ۡۦ۬ۥۡۗ۟ۡ۟ۚۨۘۦۢۧۨۙۛ۟۫ۥۢۡۥۗۛۛۛۤۘۘۡۧۗ۬۠ۙ";
                    break;
                case -162065826:
                    textView = new TextView(this);
                    str = "ۙۧ۫ۗۚۙۡۙۜۗۖۦۘۢ۫۬ۡۗۗ۠ۦۘۢ۫ۘۢۚۜۘ۟۟ۤۤۥۖۧۛۥۖۢ۠ۚۚۗۨۧۥۘۜۨۘ۬ۦۥۘۖ۬ۥۘۘ۟ۦ۠۫ۘۙۗۜۖۧۢۜۢۛ۬ۘۥۘۜۧۡۗ۫ۥ۬ۧۨ۟ۖۘۡۦ۟ۡۙۥۘ۟ۢۗۘۜۤۤۗ۠ۧۨۙۧۢۤۖۡۘ۬ۖ۟۬ۦۖۘۨۡۥ";
                    break;
                case -152051263:
                    textView2.setPadding(m80dp(this, 8), m80dp(this, 8), 0, 0);
                    str = "ۘۘۜۘۖۦۖۘۛۢۨۘۢۧۜۗۦۥ۫ۢۚۗۢۦۘ۟ۥۢۛۖۢۨۨۤۖۥۗۦۘۚۧۜۜۘۙۥۗ۬ۗۦۘۤ۬ۗۜۧۧ۠ۗۜۚ۟ۦۘۥۢ۟ۥۨۗۖۦۤۡۖۡۖۦۖ۬۟۬ۨۢۤۢۚ۟ۘۙۜ۫ۚۜۙ۠ۜ۟ۘۘ۟ۨۨۘۤۛۖۘۡۖۚۗۨۢۜۧۦۘۗۜۨۘۧ۟ۘۤ۠ۗۗۤۥۘۧۖ۠ۘۘۜۤۦ۠۠ۘۡ۫۟ۜ";
                    break;
                case -45733250:
                    linearLayout.setBackgroundColor(-1);
                    str = "ۗۡۤۖۥۗۧۖۙ۠ۨۦ۫ۘۥۖۦۘۨ۫ۘۦۧۡۘ۫ۦ۬ۖۘۜۘ۟۟ۦ۠ۛ۫۫ۖۘۦ۫ۨۤ۟ۤۖۛۢۜۘۡۢۡ۫ۙۚۦۙۜۜۨۗ۠ۛ۠ۜۤۚۖۡۜۦۗۨۤۨ۠ۤۚ۫ۥۛۡۡۘ۟۬ۜۘۡۢۛۙۢۤۥۗۘ۟ۢۛۘۦۜۤۤۦۘۧۤۗ۟ۦۘۘ۟ۨۗۖ۠ۖۘۖۧۘۘۢۧۦۘۥۛۡۘۧۨۜۡۢۗ";
                    break;
                case 223051122:
                    alertDialog.getWindow().setBackgroundDrawable(gradientDrawable);
                    str = "ۨ۠ۢۨۨ۬ۗۛ۫ۛ۬ۚۚۢۘۚۨ۠ۧۦۖ۠ۦۚۙۘۘۜۥۦۘۥۡۧۘۤۡۤۛۖۘۚ۟ۖۘ۬ۛۖ۬۬ۜۘۤ۫ۨۜۡۡ۠ۘۨۜۙۜۜۜۡۖ۫ۜۖۚۛ۬۟۠ۥۘۢ۠ۜ۫ۥۘۙۤۚۥۜۗۗ۠۟ۙۛۜۘۢۗ۠ۢ۫ۜۚۨۜۘۢ۬ۥۘ";
                    break;
                case 308543596:
                    gradientDrawable.setCornerRadius(m80dp(this, 4));
                    str = "ۘۜۚۙۙۨۙۛۘۡۧۜۘۧۦ۬ۦۜۜۨۚۘۙۨۤۡۧۡۡۘۧۡۖۦ۬ۚۦۤۚۛ۫ۡۘۛۙۖۘۚۨۥۘۤۦۦۙۘۤۗۙ۠ۡۤۧۘۚۡۘۗۦ۫ۤۜۥۙۚۘۤۤۚۦۧۖۘۨۥۛ۫ۘۧۘۜۜۗۨ۫ۛ۠ۨۗ۫ۦۨۙۡۦۦۜ۬ۥۘۜۘۘۥۢۚ۠ۥۘۘۚۧ۠۟ۖۘۚ۫ۢۢ۫ۙۦۗۡ۟ۥۡۥ۟ۖۘۢۢۦ";
                    break;
                case 373615754:
                    textView2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                    str = "ۖۚۘۛۤۖۢۚۜۖۘ۠۠ۜۖۘۗۡۦۘۤۦۨۘ۟ۧۨۘۤۚ۠ۚۦۦۘۛۡۖ۫ۦ۟۬ۛۧۧۚۚۥ۟ۥۡۥۛۜۘۚۥۙۖ۠ۙۥۧۥۧۨۦۘ۬۫ۛۨۦۗ۟۬۫ۤۢۗۗۡۥۘۛۡ۟ۦۥۤۢ۠ۚۖۜۛۚۧۧۤۚ۟ۡۤۨۘ۬ۥۙۙۖ۠ۢۢۘۘۦۚ۬ۧۢۢۗۚ۟ۦۛۚۡۨۖۦۛۥۘۙۢ۬ۘۜ۫ۡ۬ۗ";
                    break;
                case 524177586:
                    textView.setTextSize(18.0f);
                    str = "۠ۛۜۘۚ۬۟ۨۤۘ۫ۨۜۘ۬ۢ۫ۡ۫ۢۖۥۨۛۜ۬۟۬ۘۦ۬ۘۘۦ۠۟ۨۨۦۘۦۗۙۘۘۙۥ۟ۡۖۖۘۨۦۥۡۤۤۙۖۦۘ۫ۘۦۗۡ۟۫ۗۨۧۥۘۛ۬ۥۘۡۡۧۗ۠۫۟۠ۜ۬ۖۙ۠ۤۙۡۗ۟ۗۚ۠ۘۨۘ۟ۗۙۥۧۜۢۘۖۘ۠ۙۢۚۦۢۗۖۧۥۡۘ۫ۗۘ";
                    break;
                case 666783641:
                    return;
                case 884624771:
                    str = "ۙۛۦ۟۫ۡۘۧۡۖۘۨۦۤۨۧۤۚۜ۫ۦۡۘۥۢ۫ۖۧۥۘۡۡۜۢۦۙۜۡۘۘۡۖۘۜۧۚۦ۫۠۫ۘۨۧۘۖۘ۬ۡۦ۟۬ۡۚۙۖۘ۟ۜۧۘۥۖۜۡۜۧۘ۠ۥ۟ۙۥۤۗۛۢۢ۠ۗ۠۫ۨۘۡۘۥۚۢۢۚۡۨۥۤۙۜۨۘۚۨۚۢۙۖ";
                    break;
                case 907728655:
                    gradientDrawable = new GradientDrawable();
                    str = "ۨ۬ۥ۠ۦۘۚۚۢۖ۬ۥۢۤۦۦۖ۬۬ۦۘۢۘۗۢ۫ۗۧۧۧۡۧۘۚۘۜۙۧۖۘۥ۠۫۟ۛۘ۠۬ۘۘۤۙۡ۠ۗۥ۠۫ۨۘۢ۬ۦۘ۟۠۬ۡۦۖۚۦ۟ۤۘۥۡۖۙۥۤۢۛ۠ۘۢۢۧ۫ۛۢۜۦ۬ۙۤۗ۠ۛ۫ۤۨۙۖۧۜۘۖ۬ۗۡ۠۠ۥۗۧۨۚۚۖۘۨۡۧ";
                    break;
                case 993216016:
                    alertDialog.show();
                    str = "ۧۚۜۧۢ۠ۧۗۘۘۤۢۨۘۘۛۚۧۖۥۘۙۡۘۘۧۤۗۘۙۥۘۦۧۖۥۙۡۖ۫ۨۙۜ۟ۧۥۤۙۡۢۤۜۤۧۙ۫ۧۡ۠ۜۗۨۤۗۦۘۚ۠ۦۘۡۖۗۖۖۙۢ۫ۧ۠ۙۦ۠۫ۜۙۢۡۥۛۜ۠ۢۡۛۜۘ";
                    break;
                case 1166666206:
                    textView.setPadding(m80dp(this, 8), 0, 0, 0);
                    str = "۟ۧ۠ۘۡۜۘۢۛۧۘۥۨۘۨۨۢۥ۫۬ۛۙۘۘۥ۟ۦۘۙۜ۬ۚۚۗۢۦۜۘ۟ۖۨۘ۬ۢۤۛۗۦ۠ۢۥ۫ۨۖۦۡۡۘۧۛۚۜۤۜۘۡۗۚۘۧۙۦۧۦۘۗۧ۟ۜۧۡۘۜۘۙۗۜۤ۟ۥۡۤۨۗ۬ۘۘۖۢۡۦۢ۫۟ۜۨۖۧۛۤ۫ۡۘۦۡۜۙۨۡۖۡۗۨۖۘۘۢ۫ۡ۫ۥۘۙ۫۟۠۬۠۠ۡۘۙۚۨۘۙۦۧۘ";
                    break;
                case 1198595405:
                    linearLayout = new LinearLayout(this);
                    str = "ۙۘ۟ۚۘ۟۠ۥۨۘۛۥۖۘۘۜۘۗۦۧۜۜ۬ۤ۬ۤۤۥ۠ۢۤۗۘۖۚۧ۟ۜۜۘ۫ۖۘۘۦۜۖۘۥ۬ۦ۫ۦۢۦۨۚۡۧۗ۬ۥۡۘۜۗۥۘۧۘۚۤ۫ۡۘ۠ۚۗۢۙ۫ۜۦۡۘ۟۟۫ۛۨۘ۠ۘۚ۫ۜۦ";
                    break;
                case 1238728697:
                    textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                    str = "ۧۥۧۘۦۨۨۛۧۥۢ۫۬۠ۘۧۦۡۤۨۗۢ۫ۜۖۘۥۘۤۜۜۖۘۚۚۨۘۜۧۨۘۢ۟ۛ۟ۦ۬ۤۡ۟۠۟ۚۡۡۗۜ۫ۡۘۛۡۖۘ۟ۚۥۘ۠۫ۗۦۧۜۘۚۗۡۖۤۖۤۘۖۘۦ۠ۥۧۖۨۘۢ۠ۘۘۤۖ۬ۗۦۗۚۗ۬۬ۗ۫ۚۡۧ۟ۛ۫ۜ۠";
                    break;
                case 1678478324:
                    alertDialog.getWindow().setLayout(i - i2, -2);
                    str = "ۦۙۜۦۥۘۥ۟۬ۡۙۥۧ۫۫ۘ۠ۙۙ۬ۨ۠ۘۥۦۢۡ۟۫ۡۘ۠ۧۛۘۢۘۘۙۦۤۗۗۖۜ۟ۜۗۘۧۘ۫۟ۙ۬ۖۢۡ۠ۗۧۡ۬ۧۘ۫ۚۡۛۥۡۡۙۢۧ۟ۖۙۦۨ۬ۢ۬ۙۧۡۛۚۦ۬ۡ۫";
                    break;
                case 1756009008:
                    button = alertDialog.getButton(-1);
                    str = "ۚۜۛۖۚۡ۠ۧۦ۫ۡ۟ۚۖۘۢ۫ۥۦۧۨۘۜۨۖۘۖۙۦۦۢۦ۠۬ۨۘۡ۟ۚۛ۫ۡۘۘۛۖۘۦۘۙۖ۬۠ۘۚۜۘ۠ۨ۠ۤۛۥۡ۫ۦۢۚۤۖۚۜ۠ۛۤۙۥۧ۬ۦۘۧۧۥۥۖۦۘۡۘۚۢ۠ۛۡ۫ۡۨۘۡ۬ۥۢۜ۟ۧۡۘۨ۬ۢۢۘ۬ۘۜۧۦۘۦۘۤۦۧۘ۬ۛۖ";
                    break;
                case 1771933239:
                    linearLayout.setOrientation(1);
                    str = "ۢۛۜۢۤۦۘۤۘۛۢۖۘۦۚۚۦۜۘۥۥ۟ۤۖۘۦۜۖۤ۟ۗۖۡۘ۠ۢۖۘۦۦۘۘ۟۠ۘۦۗۖۘۦۖۡۘۦۜۗۨۚ۠ۧۚ۠۟ۘ۫ۢۥۖۘۨ۫۟ۨۨۙۦۖۖۘۖۡۥۘۚ۬ۤۤۚ۟ۖۧۢۢ۟۬ۤۧۖۘۜۥۡۨ۫۟ۤۜۨۘۢۘ۫۫ۙۚۜۨۖۘۗۛۘۘۜ۬ۗۧۖۦۦ۠";
                    break;
                case 1881033952:
                    textView.setTypeface(Typeface.DEFAULT_BOLD);
                    str = "۠ۘۗۚۧۗ۬ۗۥۘۧۦۖۘۙۢ۟ۧۢۦۘ۫۟ۜ۬ۥۧۘۢۦ۟ۦۡۙۘۛۛۚۚۥۨۥ۬ۥۖۦۘۛۜ۟ۤۙۡۘۡۙۚ۫ۧۖ۠ۡ۟ۙۗۢۦۤ۠ۦ۬ۦۡۥۜۨۗۡۘۜۙۙۚ۫ۗ۟ۜۥۦۡ۫ۤ۠ۧۡۚۖۘۨ۫ۡۘۨۧۚ۫ۜ۟ۘۖۜ۬ۘۘۗۚۥۘ۟ۢۦۘ۫۫۫ۢۢۘۨۖۙ";
                    break;
            }
        }
    }

    private void showUpdateErrorDialog() {
        LinearLayout linearLayout = null;
        TextView textView = null;
        TextView textView2 = null;
        AlertDialog alertDialog = null;
        GradientDrawable gradientDrawable = null;
        int i = 0;
        int i2 = 0;
        Button button = null;
        String str = "۠ۘۨۘ۟ۦۦۘۦۛۧۚۚۜۘ۠ۡ۬۫ۥ۬ۤۤۤۜۥۡۘۜۘۖۘۦۡ۟۟ۡ۬ۨ۬ۨۨۡۨۦۧۜۘۙ۬ۜ۠ۜۘۢۘۧۙۜۦۘ۫۠ۛۧ۟ۨۘ۟۟۠ۨۘۥ۬ۙۤ۬ۥۘ۠ۥۛۜۖۛۜۚۢۘۢۖۘۦ۫ۖ۠ۥۘۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 186) ^ 645) ^ 122) ^ 50) ^ 83) ^ 871) ^ 962) ^ 835) ^ 685) ^ 189) ^ 736) ^ 848) ^ 42) ^ 33) ^ 714) ^ 151) ^ 176) ^ 994) ^ 524) ^ 901) ^ 391) ^ 883) ^ 976) ^ 321) ^ 601) ^ 796) ^ 694) ^ 338) ^ 428) ^ 272) ^ 383) ^ (-225104378)) {
                case -2048291480:
                    linearLayout.addView(textView2);
                    str = "ۧۛۙۛ۬ۤۧۘۨۧ۫۬ۙۜۙۢۚۥۘ۫ۙ۟ۥۧۚۜ۬ۗ۟ۖۗۧ۫ۜۤۤۨۘ۠ۙۤ۫۫ۨۡۖۚۙۜۘۜ۬ۜۘۙۦۧۘۨۦۜۥۛ۠۬ۘۡۘۛۡۜۗ۠ۘۡ۠ۘۘۙۤۖ۬ۗۛۦۛ۫۫۫ۖۖ۟ۜۘۘۡۤ";
                    break;
                case -1993029003:
                    linearLayout.setOrientation(1);
                    str = "ۢۘۜۖ۟ۨۘ۫ۘۜۘۨۘۚ۟۬ۨۘۨۗۚۥ۫ۚۢۢۥۘ۠ۘۢ۫ۢ۟ۙ۟۟۫ۥۘۧ۫ۦۘۖۨۨۢۧۘۙۙۖۙ۬ۙۢۥۧۢۥۘۖۗۥۗۗۗ۠۫ۥ۠ۚۜ۟ۗۧۤۛۗۤۡۛۥۙۢ۫ۚۛۨۤۥۘ۟ۧۡۗۗۡۘۘ۟ۤۗۡۗۦۤۨۘ۠ۡۚ۠ۘۧ۟ۡۨۨۡۚۙۘ۟ۖ۟ۙ";
                    break;
                case -1738040129:
                    textView.setText(getString(C0931R.string.str0044));
                    str = "ۚۢۙۘ۬ۧ۬ۜۧۘۡۜۗۖۛ۫ۖۢۤۚۜ۟۫ۜۙۜۥۛۚۧۖۨ۠ۥ۟ۙۧۚ۟ۥۧۜۘ۬۬ۖۗ۫ۛۧۨۧۖ۬ۦ۬ۖۘۙۤ۫ۤۨ۠ۤۥۖ۫۟ۨۙۚۘۘۦ۠۫ۖۧۡۘۨۤۖۘۦ۟ۖۤۤ۠ۧۚۙۦ۠ۦۘۜ۬ۡۥ۬ۘۛۢ۬ۥۖ۟۬۫ۛ۬ۦۡۘۙۗۧۖ۠ۥۢۛۢۙۥۖۘۚۧ۟ۦۛۘۘۙۜ۫ۚۖۛ";
                    break;
                case -1624462046:
                    button = alertDialog.getButton(-1);
                    str = "ۤ۟ۘۨۘۦۘۦ۬ۖۘۡۤۨۘۢۗ۫ۖۨۘۚ۟ۧۨۧۤۚۤ۬ۖۧۘۖۘ۫ۛۡۨۘۥۨۡۖۥۨۘۨۡۦۘۛۜ۠ۙ۠ۧۧۘۡۘۧۙۚۤۧۢۢۦۜۘۚۤۚۥۡۡۨ۫ۦۛ۟ۨۘۢ۬ۢۙۦۡۘۦۚۦۘۖۤۦۧ۠ۜ۬ۜ۟ۥ۠ۡۥۛۛۦۘۚ۫ۜۗۡۚۜۜ۠ۧۧۛۨۦ۬ۛ۫ۜ۠";
                    break;
                case -1552648130:
                    gradientDrawable = new GradientDrawable();
                    str = "ۙۙۤۥۥۙ۫ۖۘۙۖۤۤ۫ۥۥۖۧۘۧ۠ۖۢۘۥۙۚ۟۫ۡ۠ۛ۬ۢۦ۠ۦۘ۫ۙۨۘ۫۫ۤۙۥۘ۠۫ۛۨۡۙۚۖۘۗۚۥ۫۠ۨۘ۠ۛۘۧۙۖۢۜۢۜۢ۫ۛ۠ۘ۬ۘۘ۟ۡۗ۠ۤ۠ۗۗۘۘ۬۠ۨ";
                    break;
                case -1502955470:
                    textView2.setTextSize(16.0f);
                    str = "ۖۚۜۢۖۘۘۧۡۜۘۙۘۤۧۥۖۧ۠۠ۥۦۦۘۥ۬ۜۘۖۘۚۧۧۨۨۢۥ۟ۙ۬ۘۖۛۡ۫ۜۙۦۚۙۚۚۛ۫ۜۙۖۛ۫ۜۖۘۙۛۥۢۚۜۨۜۘۜۗۖۗۢۖۘۤ۬ۖۘۛۢۚۧۘۘۘۦ۬ۖۘۜۧۖۘۥۖ۟ۛۢۖ۠ۢۜۨۚۙۨۡۤۖۖۢۤۨۘۚۛۘۛۗۥۘۜ۫ۘۢۚۡۘ";
                    break;
                case -1465237366:
                    textView.setTextSize(18.0f);
                    str = "ۚ۫ۨ۠ۧ۫ۧ۬۬۬ۚ۫۟۫ۖۘۗۛۖۤۖ۬۬ۤۜۘۛۜۘۘۙۨۘۢۦۡۘۢۛۢۚۙۨۛۧۦۘ۟۠ۢ۬ۚ۟۠۬ۡۖۚۥۢ۟ۤۨۖۦۜۤۖۥ۫۟ۛۧۥ۠ۥۘ";
                    break;
                case -1254748870:
                    button.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                    str = "ۢ۬ۙۗۜۜۛۜۗۖۘۚۘۧۥۗۘۜۘۙۘۤۙ۬۬ۥۡۡۘۧۙۚ۫ۨۜۥۥۘۘ۠۠ۗۘۖۦۦ۠۟۠ۙۡۘۨۤۡۙ۟ۖۛۦۧۨۤۖ۬۬ۨۘۦۙۥۘۚۨۥۘۘۥۙۚۡۜۘۜۢۖۘۜۜۨۘۦۨ۬ۚۙۚۖۨۤۙۗۜۘۡۛۤ۠ۗۚۥۖۘۡۤۗۤ۫ۖۗۙۛۖۙۤ۟ۧۛ۠ۙۖ";
                    break;
                case -1184252493:
                    alertDialog.getWindow().setLayout(i - i2, -2);
                    str = "۠ۘۜۘ۫۫ۨۘ۟ۘ۟ۙۨۡۘۢۡۧۘۜۨۡۘۤۖۦ۠ۢۗۧ۠ۡۘۧۛۘۘ۠۠ۖۖۡۢ۫ۘۧۡۜۤۤۘۨۤۤۖۧۘۦۛۢۛ۫ۙ۫ۧۖۘۥ۬ۧ۫ۡۙۗۚۖۘ۫ۘ۬ۖۨ";
                    break;
                case -1052960981:
                    textView2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                    str = "ۗۤۡۘۙۚ۬۟۫ۗۡۧۧ۫ۡۖ۠ۧۛۜۘۚۖۥۙ۫ۖۜۗ۬ۨۧۛۖۚ۫ۚ۫ۜۘۙۖۜۘۧۖۡۘۢۥ۠۫۬ۤۦۡۤۦۘۥۘ۟ۤۤۥۜۘۥۘۚۡۗۖۗ۠ۘۛ۬ۧۧۢۨۘۗۢ۫ۘۘۖۗۜۧۘۦ۟ۖۘ";
                    break;
                case -965346888:
                    textView2.setText(getString(C0931R.string.str00e5));
                    str = "۫۠ۖ۟۟ۜۖۥۘۚۛ۠ۨۜۥۘۖۗۨۘ۟۬ۦۧۢۦۘۢۦۥۖۢۜۘۚۘۖۦ۠ۘ۬ۚۥۢۨۜ۬ۨ۟ۧۛۗۙ۬ۡۘۖۡۘۢۦ۫ۛۙۙۗ۟۫ۨ۟ۗ۟ۜۘۘۤۘۘۛۖۥۡ۠ۖۜۡۧۘ۫ۚۡۘۨۤۜۘ۬ۨۘۘۚۘۗ۠ۜ۠۫ۖۤۖۨۗۥۨۧۘ۬۠۟ۧ۬ۚۨ۟ۡ۫ۦۖۘۢۛۘۙۡۨۘۗۜۡۥۦۦۧ۬۬۬ۛ۬";
                    break;
                case -848892232:
                    linearLayout = new LinearLayout(this);
                    str = "ۡۛۦۨ۬ۥۡۖ۫۬ۥۘۘۥۙۨۘ۬ۙ۫ۘۜۜۦۛۥۘۤۛۨ۬۟ۡۧۧۥۦۦۧۚۦ۟۠ۡۙۥۛ۟۠۫ۦۢۨ۬۟ۛۨۘۘۥۖۘۗۜۦۧۚ۠۠ۜۖۖ۫۫۬۠ۖۖۡۘۧ۬۠۠۠ۤۤۙۧ۬ۙۨۘۨۡۡۥۤۨۢۗۨۦۘۡۛۧ۫۟ۡۘۚ۠ۘۘۚۢۖۤ۟ۜۘۢ۫۫ۛ۬۫";
                    break;
                case -639339994:
                    String str2 = "ۜ۠ۦۘۥۦۚ۫ۚۖۘۢۧۡۘ۟۠ۜۘۜۙۥۖۨ۠ۥۘۗۜۧۘ۬ۘ۫ۛ۠ۖۘۡۙۦۗۜۗۜۢۙۗۖۘ۫۬ۦۘۥۛ۟۟ۚۙۡ۫ۚۧۦۘۘ۠۫ۡۢ۬ۛۡۥۧ۟ۚۗۖۧۦۘۤ۟ۧ۫ۖۤۨۡۘۡۦۥۙۢۗۡۧۤۥ۬ۜۛۜۜۘۛۤۥۦۤۛ";
                    while (true) {
                        switch (str2.hashCode() ^ (-681263563)) {
                            case -1698794344:
                                str = "۫۠ۖۤۛۡۘ۬ۥۡۙۥۘۙۢۘۛۚۨۘۨۙۛۧۙۧۛ۟ۜۘۖۗۧۙۘۦۜ۟۟ۖۥۘۢۜۨۘۧ۫ۢۛۜۜۥۡۧۘۤۖ۟ۚ۠ۜۢۥ۟ۤ۫ۧۚۖۡ۬ۤۡۖۚۡۘ۟ۜۥۘ";
                                continue;
                            case 274913841:
                                str = "ۚۡ۫ۢۤۤۥ۟۠ۘۢۥۚۦۡۘۡۜۡۗۦ۫۫ۤۧۨ۠۟ۥۚۘ۫ۥۧۢۘۡۘۨۛۥۘۥ۬ۥۙ۠ۖۙ۬ۚۧۘۡۘۘۙ۟۠ۖۘۙۛ۫۠ۙۨۘ۬ۦۡۘۜۥۗۢۧۜ۟ۢۛ۟ۗۢۘۙۗۙۚ۠ۧۚ۬ۗۥ۫ۚۙۜۘۦۙۚۗۢۨۜۛۦۤۙ۠";
                                continue;
                            case 416204542:
                                String str3 = "۫ۧ۟ۥۚۘۘ۬ۡۛۦۦۘۗۙۢ۠ۖۚۦۢۤۜۤۦۘۛۧۡۘ۠ۧۦۘۤۙۛۗۦۨۨۧ۬ۛۥۡۘۗ۬ۛۦۧۜۘۡۤ۠ۛۖۦۘۗۤۤۙ۬ۥۜۢۜۜ۟ۚۗ۠ۥۘ۫ۦ۬۫ۨۡۥۖۡۘۚۨۡۙۛ۠ۛ۠ۤۧۛ۫ۨ۬ۤۙۙۡۘۡۙۖۘۚۚ۬ۧۦۜۘ۫ۢ۬۟۬ۢ۫۟۬ۨ۟۟ۧۗ۟ۙۥ۟ۛۦۛۨ۬ۡۘۡۥۤۖۡۜ";
                                while (true) {
                                    switch (str3.hashCode() ^ 613750631) {
                                        case -1553332154:
                                            str3 = "ۡۤۚۚۘۥۘۨ۠ۛ۫ۚۗ۫ۜۦۙۧۦۘۚ۬ۧۨۨۥۗ۬ۦۘۜ۟۫ۦۡۘۜۦۖۗۨۦۘۗۢۦۛ۫ۨۘۜۨۘۘۘ۬ۛۡ۠ۛۢۗۙۨۡۥ۠ۖۜ۫ۨۧ۠ۤۧ۠ۘۥۡ۟ۙ۟ۤۥۘۥ۬ۡۦۘ۟ۚۘۤۗۚۢ";
                                        case -527413971:
                                            String str4 = "ۨ۫ۗ۟ۛۛۛۜۢۢۛۗۦۜۨ۫ۛۜۘ۫۟ۗ۬ۗۦۥۡۗۖۘۨۘ۫ۙۨۗۗۥۘۙۙۘ۠ۢۙ۟ۤۨ۟ۥۘ۬۫ۖۘۘۜۘۘۥۙ۬ۜۘ۠ۦۥۗۡۖۘ۫ۨۤۢۢۤۗۢۥۘ۫ۦۙۤۤ۟ۛۜۙۗۦۙۡۚۧۖۦۦۢ۟۬۬۫ۛۥۥۦ۟ۛۨۘۚۦ۠۫ۥۡ۫۟ۗ۠ۛۖ۬ۚ";
                                            while (true) {
                                                switch (str4.hashCode() ^ (-1257022185)) {
                                                    case -1299697361:
                                                        str3 = "ۖۥۚ۠ۛۛۜۥۖۘ۠۫ۚۘۨۡۘۤ۬ۚۧۖۛ۟ۡۧۘۢۜۘۘۢۙۛ۬ۨۦۙ۠ۗۢۜۘۛ۠ۙۢۥۜۘۘۡۘ۟۬ۨۚۜۦۨۚۛۨۖۙۦۛ۬۫۟ۧۚۥۙۤ۫ۥۜۜ۟ۤ۫ۙۤۨۥۜۙۨۛ۫ۦۥ۠ۦۡۢۖ۠ۜۧۗۚۡۖۥۘۜۡۨ";
                                                        break;
                                                    case -530449626:
                                                        str4 = "ۖۥۙ۠۟ۨۘۥۥۧۨۡۖ۟ۨۘ۠ۦۘۘۖۨۡۦۘۨۥۤۖۡۥۘۖ۠ۗۧۙۘۨۦۘۜ۬ۚ۠ۧ۠۬۠ۡۖ۬ۙ۬ۨ۠ۙۢ۫ۛ۫ۢۛۛۘۡۘ۬ۙۙۡۗ۟ۥۘۢۛۥۢۖۦۛ۠ۚۧ۠ۖۜۨۥۘۢۨۚۛ۟ۡۘ۬۠ۛۧۡۘۤ۟ۛۨۜۖ";
                                                    case 846941863:
                                                        String str5 = "۫ۘۛۛۗۦۘۖۤۡ۫ۨۨۨۦۘۧۧ۠ۧۛۜۖۡۚ۬۬ۥۗ۠۠ۚۨۘۖۘۨۜۗۘۧۦۚۧۢۤۦ۬ۖۦۢ۫ۢۨۤۗۗۗۖۚۚۜ۬۟ۡۡۘ۟ۜ۟ۗۛۧۗۛۧۤۧ۬ۧۦۜۘۨۗۚۨ۠ۥۤۜۧۦۚۙۦۚ۫ۨۘۢۘۧۦۧۡۘۥۤۤۡۗۨ۠ۙۡۘۛۗۖۘۤۘۖ";
                                                        while (true) {
                                                            switch (str5.hashCode() ^ 538768209) {
                                                                case -1386851203:
                                                                    str4 = "ۦ۬ۤۨ۠ۦۘۘۡۧ۟ۛۜۛۨۛۥۗۜۘ۠ۢۚۜۗۦۘۙ۠ۥۘۘۡۡۘۛۖۨ۫ۚۤۦۙۦ۠ۗ۬۬ۖۘۤۨۜۘۧ۟ۢۘ۫ۖۥۛۜۘۤۗۨۡۦۤۧ۟ۡۦ۫ۢ۬۠ۘۘ۟۠ۗۥ۬۫ۜۢۖۨۖ۟ۧۥ۟ۦۗۧ";
                                                                    break;
                                                                case -854046343:
                                                                    str5 = "ۜۨۘۤۘۨۘۙ۟ۨ۫ۛۧۛۥۧۘۢ۠ۜۘۧۗۦۘۨ۟۬ۖۤ۫ۤۚۦۘۧۛۢۥۖۡۛۚۧۧۦۙۜۘۘۧۤۡۘۘۦۨۨ۬۠ۚۦۡۦۥۘۘ۟ۤۖۧ۠۠۠ۢۨۗ۫ۤۡۜۡۢۙۤۢۥ۠ۦۘۛۥۥۘۡۖۨ";
                                                                case -465880079:
                                                                    String str6 = "ۤۖ۬ۧۦ۠ۗۗۡۖ۟ۙ۬۬ۖ۬۫ۘۘۘۥۛۡۘۡۖۖۘۡۢ۟۠ۨۡۨۙۥۜۥۘۧۧۗۧ۬ۤۙۙۧۜۢۖۘۡۦۢۖ۫ۛۗ۫ۤۘۜ۠۠ۘۘۛۙۥۘ۫۟ۛ۠۬ۡ۟ۘۨۘۜۥۘۖۥۨۜۚۜۘۘۛۥۧۡ۠ۚۚۡۘۜۦۛۘۘۘۘ۟۠ۡۡ۫ۨۘۙۙۙۨۙۨۘۖۤۖۘۧۥۚ۟ۘۛۥۜ۟ۤۧ۫ۥ۬۟";
                                                                    while (true) {
                                                                        switch (str6.hashCode() ^ (-909324352)) {
                                                                            case -883120561:
                                                                                str6 = button != null ? "ۘۢۨۘ۫ۚۦ۬ۧۢۚۢۜۦ۟ۨ۠ۢۨ۬ۥۢۧۙۤۚ۠ۘۘ۬۫ۢ۠ۘۡۘ۬ۚۦۧۗۡۘۙۚ۬ۤ۬ۘ۠ۥۦۘۘۚۘۘۦۜۦۛۨۡ۟ۛ۠ۡ۠ۘۘۢ۠۫ۘۛ۠۟۬ۡۘ۟ۙۡۖۖۗۡ۬ۨۡۤۥۗۨۧۘ۬ۡۘۢ۟ۤۥۜۘۧۢۜۘۗ۫ۚۨۢۢۦۚۦۘۖۜۦۘۜۘۥۖۜۧۘۜۗۘۘ" : "۬ۚ۟ۖۧۜ۬ۨۘۗۗۗ۬ۨۘۗۘ۟ۥۖۛۛۤ۬ۖ۠ۘۙ۟ۦ۠ۡ۠ۥۧۘ۠ۘۡۘۙۗۡۛۛ۠ۤ۫ۘۜ۫۟۫ۚۦۗۛۛۖۛۢۗ۫ۙۦ۠ۜۤۨۥۢۡۗ۬ۧۘ";
                                                                            case -660472393:
                                                                                str5 = "ۡۡۜۢۢۡۘۚۨۡۚۧۥۘۨۙۘۛۥۘ۫ۘۨۘۗ۠ۖ۟ۦۦۘۘۚۖۖۙۨۘ۬۬۠ۧۙ۠ۖۛۡۦۘ۠۟ۚ۟۠۬ۘۘ۬ۨۘۘ۠ۧۨۧۤ۬ۨۧۡۤۢۡۘۘۙۨۘۗۙۖۡۧۡ۟ۤۖۘۢ۬ۡۜ۠ۨۘۜۛ۠ۦۢۛ";
                                                                                break;
                                                                            case 490492976:
                                                                                str5 = "ۖۜۨۘۧۤۡۙ۬ۥۘۦۢ۟ۤۚۢۥۙۧۙۨۤۘۥۡۘۤۦۘ۬۠ۗ۬ۡۙ۟ۚۖۘۘۘ۟ۛۙ۠ۤ۠ۛۡ۬ۜۘ۫۫ۖۘۜۜۧۘۖۥ۟ۧۛۧۘۤۧۨۘۥۜۘ۠ۧۖۗۘۧۤۗۥۙۡۖۛ۫ۙۨۢۜۢۦۤۥۤۡۘۗۖۨۘۘۨۜۘ۠۫ۦۚۗۜۡۡۦۘ۬۟ۦۘۗۜۚۡۛۨۘ۬ۛۘ";
                                                                                break;
                                                                            case 1902053398:
                                                                                str6 = "۠ۧۖۙ۫ۜۘۡۧۦۘۖ۬ۛ۬ۢۘۤۚۥۖ۟ۡۡۨ۠ۚ۠ۥۘۡ۬ۢۜۗۥۘ۠ۧۘۦۘۘ۟ۦۘۘۨ۠ۛ۟ۘۡۖۘۗۦ۟ۨۘۚ۬ۚ۫۫ۥۘۢۦۢ۟ۚ۫ۤۙۥۘۥۖۖۙۛۢۛۘۨۖۗۜۙ۠ۨۛۖۖۛۡۘۛۨ۠ۚۚۗۖۚۡۥ۫ۘۖۨ۬ۚۢۡۘ۬ۛۤۖ۟ۦۨۙ۠ۗۖۘۢۤۨۘۙۗ۟ۛۚۤۧ۬ۖۘۨ۠ۡۘ";
                                                                        }
                                                                    }
                                                                    break;
                                                                case -44511679:
                                                                    str4 = "۠ۡۛۙۢۥۛۦۨۙۖۘۡۖۨۨۦۧۘۙۜ۫ۗۥ۟ۖۡۧۘ۟۟۟ۛۧ۫ۖۡۖۘۚ۬ۜۘۜۖۖۖۗۨۙۨۜ۠ۜۦۘۦۗۛۨۤۙ۫ۨۧۘۤۤ۠ۧۖۘ۠ۤۘۚۚۡۙۧۤ";
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 2010034371:
                                                        str3 = "ۖۢۡ۬ۖۦۖۖۖۙۙ۠۫ۥ۟ۚ۟ۧۗۛۧۗۜۘۨۥۗۥۘۧۘ۟۫ۜۘ۫ۢۙۨۖۡۘۢۧ۬ۛۗۘۥ۟ۥۘ۫ۜ۠ۨۙۧ۟ۚۗۚۙۜ۟۠۫ۙۥۘۥۘۥۘۘۤۦۘۧۢ۫";
                                                        break;
                                                }
                                            }
                                            break;
                                        case 1117065903:
                                            str2 = "ۥۛۨۘۤۡۜ۫ۨۜۗۨۤ۠ۘۘۘۖۡۥۜۢۖ۠ۧۡۦۥۖۘۘۢ۬ۚۜۢ۟۟ۚۤۤۧ۠۟ۥۚ۠ۖۨۘۥ۟ۡۘۖۖۤۤ۟ۖۡۚۢ۠ۗۚۖۡۘۛۖۤۨۖۖۧۨۢۨ۟ۙۨۛۦۘۥۗۛ۠ۡۖۘۡ۬ۦۘۧۗۤ۫ۖۖۤۤۥۘۨۡ۟ۦۗۥۘ";
                                            break;
                                        case 1936654475:
                                            str2 = "ۢ۠ۥۘۧۛۢۘۗۧ۬ۘۘۤۘ۠ۦۘۛۥ۬ۢۨۧۡۘۨۛۖۥۚ۟ۡۤۢۗ۬ۤۚۙۢۘۘۘۘۥۘۡ۟ۥۘۜۨۘۘۢۨۡۘۨۦۙۢۥۜۗۧۥۘۙۘۨۘۨ۫۟ۜۖ۬ۖۥ۟";
                                            break;
                                    }
                                }
                                break;
                            case 1433371319:
                                str2 = "ۗ۫ۢ۟۟ۧۧۨۦۥۖۘ۫ۢۨ۠ۦۥۘۤۥۘۡۖۚۗۤۙۖۘ۬ۢۥۡۖ۟ۡۘۚۚۗ۬ۤۘۘۘ۟۟۫ۚۛۦۚۖۘۖۧۥۖۨۛۚۙۜۘ۠۫ۦۘۛۘۤۜۚۗۤۦۧۘۗۜۧۘۢ۠ۘۘۨ۫ۚۧۗۤۢۚۗۗۤۤ۫ۢ۟ۧۡۘۡۢۛۛ۟ۥۧۢۖ";
                        }
                    }
                    break;
                case -629244558:
                    textView2.setPadding(m80dp(this, 8), m80dp(this, 8), 0, 0);
                    str = "۬ۖ۟۬ۥۛۤ۟ۤۤۘۦۘۘ۟ۜۨۖۙ۫ۘۙۜۘۛۢ۠ۜۤۚۛۨۛ۫ۤ۫ۡۘ۟ۘۖۜۚۖۨۚۧۙۧۨۘۥۤۦۢۗ۬ۜۦ۠ۛ۠۟۫ۜۥۢۘۨۘ۬ۗۦۜۖۢۤ۫ۥۤۡۢۖۤ۟ۧ۟ۛۘۘ۠ۡۦۛۧۥۘ۠ۜۢ۫ۡۥۘۛۘۛۦۜۗ";
                    break;
                case -451121717:
                    str = "۠ۖۤۥۦۨۡۗۜ۬ۨ۟ۢۢۦۘ۟ۨۗۢۚۙۨۗ۟ۡۥۘۡۖۧ۟ۨۦۘۘۘۘۘۛۥۧۨۥۙۥۥۨۘۙۢۖۢۚۘۧ۫ۜۘ۟ۘۘۦ۬ۤۘ۬ۤ۠ۡۥ۠ۦۗۨ۠ۥۘۖ۠۬ۗۦۛ۬ۥۡ۠ۨۘۗۘۜۘۛۖ۠ۘۦ۟ۥۨ۟ۦۗۜۘۨ۫ۜۘ۫ۘ۠ۚۤۖۘ۟۟ۚۖۗۧۗ۬ۜۘۧۤۛ";
                    break;
                case -369255800:
                    textView.setPadding(m80dp(this, 8), 0, 0, 0);
                    str = "ۗ۟ۘۘۨۤۗۥۧ۠ۖۢۡۘۦ۟ۗۗ۟ۘ۠ۢۗۢۥۜۘۚۘۧۙۜۡۘۦ۫ۜۗۙۤۦۤۘۘ۬ۖۘۘۙۚۡۜۗۘۛۡۜۙۡۙۘۢۗۡۨ۟ۚۤۡۘۨۧۜۘۚ۟ۘۧۧ۬ۙۖۘۖۨۤۨ۬ۥۖۡۜۘۘۚ۬ۜۥۡۘ";
                    break;
                case -368398740:
                    linearLayout.setPadding(m80dp(this, 16), m80dp(this, 16), m80dp(this, 16), m80dp(this, 16));
                    str = "ۧۖ۫۫۠ۖۜۗۤ۟ۘۘۗۛۖۘۘۡۖ۬۠ۡۘ۟ۖۨۛۛۜۛۨۚۨۤۥۘ۫۠ۢۛۥۧۥۧ۫ۢۜۨۘۜۜۡۛۗۦۘ۫ۨۛ۠ۙۘۛ۟ۘۘۥۘ۬۫۬ۤۗ۟۠ۨۛۡۖ۟ۖۘۖ۠۬ۦۚۧۜۙۦۘۥۙۦۘۨۙۢ";
                    break;
                case -303864659:
                    textView2 = new TextView(this);
                    str = "ۗۦۗۚ۫۫۫ۨۙۖ۬ۚۙۖۛ۠۟۫ۙۤۦۘۙۜۘۘۢۚۥۘۨۥۦۘۡۡۗ۠ۡۖۡۛۛۘ۠ۖۘۘۡ۫ۘ۟۫ۨۘۧۤ۬ۘ۟ۢۥ۟ۡۥۗۛۧۨۙۧۚۢ۟ۖۙۘ۠ۢۖۘ۬۬۬ۜۘۜۛ۫ۨۘ۠ۜۡۛ۠ۡۖۢ۬ۡ۬ۘۨۧۖۘۖۗۖۘ۠۬ۘ۬۠۫ۡۧۤۖۨۡۥۨۤۛ۟ۧ";
                    break;
                case 66828059:
                    linearLayout.setBackgroundColor(-1);
                    str = "۟ۙۧ۬ۨۛ۬۬۬ۘۗ۫ۚۥۗ۫ۡۘۘۥ۫ۡۚ۠ۥۘۥۙۨۘۡۦۗۦۛۦۘ۫ۜۜۘۜۦۡۘۙۗۙۘۨۡۘ۟ۡۢۧۛۙۡۨۘۢۜۨۦۜۦۚۡۘۘۥۧۖۘۜۦۧۘۥۢۘۨۡۙۨۘۦۘ۬ۙۜۙۤۜۘۧ۟ۖۦۤۜۦ۫ۜۘۖ۠۟ۢ۫۬ۨۜ۟ۘ۠ۜ";
                    break;
                case 84951549:
                    alertDialog.getWindow().setBackgroundDrawable(gradientDrawable);
                    str = "۠۫ۜۘۖۛۥۘ۬ۦۥۘۗۛۘۘۦۖ۠ۤۛۧۙۗۖۘۢۡۘۘۥۢ۠ۛۥۢ۫ۢۥۘۛۤۡۘۜۨۙۧ۠ۚ۬ۡۖۨ۠ۦۚۘۡۦۥۘۙۘۤۤ۠ۦۢۘ۟۫ۦۘۖۜ۟ۡۘ۬ۢۡۦ۬ۥ۬ۨ۬ۥۘۚۥۤ۬ۢ۫۫ۘۦۘ";
                    break;
                case 426647794:
                    alertDialog.show();
                    str = "ۚۚۥۙۡۧۘۢ۫ۡۘۜۦۘۘۙۨۙۜۙۨۡۖ۫۟ۖۢۨۖۧ۠ۨ۟ۤۧۜۖۘ۫۟ۤۜۘۢۨۘ۬ۛ۫۠ۦۧۥ۟ۜۘۡۨۘۡۗ۫ۡۘ۬ۖۚۦۙ۟ۘۘۦۚ۬ۢۙۗۜ۟ۡۡۘۦۘۙۚۜ۬ۙۜۘۧۗۛۘۖۨۘ۠ۚۘۘۡۥ۬ۧۢۥۖۥۥۢۜۜۘۤۗۤۘۗۡۤ۠ۗۘۙۜۙ۟ۡ";
                    break;
                case 440889135:
                    gradientDrawable.setColor(-1);
                    str = "ۤ۟ۦۘ۫ۨۘۘۚۡۘۢۜۡۘۨۢ۟۟۬ۜۘ۠ۖۘ۫ۤۘۘۢۙۜۘ۟ۥۨۘۧۥۖ۫ۗۙۢۦۛۚۤ۫ۘۧۜۘۤۚۨۘۢۤۥۘ۬ۜۥۘ۫ۨۗۚۡۖۡۙۦۘۧۗۦۖ۟ۡۘۖۧۘۤۢ۬ۡ۠ۖۘۤۨۡۘۦۥۚۛۗ۠ۙ۫۠ۡ۫۬ۜۘۖۘۤۗۘۘۧۥ۟ۙۜۛۙۘۡۘۛۜۨۛۤۘ۠ۧۜۨۡۘ";
                    break;
                case 470467555:
                    alertDialog = new AlertDialog.Builder(this).setView(linearLayout).setCancelable(false).setPositiveButton(getString(C0931R.string.str009c), new DialogInterface.OnClickListener() { // from class: kentos.loader.activity.LoginActivity$$ExternalSyntheticLambda2
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            String str7 = "ۚۜۦۘۗۜ۬ۚۘ۫ۥۧۜۘۥ۟ۤۙ۫ۘۘۖ۠ۨۚ۬ۤۥۤۨۘ۬ۥۢۢ۬۫ۥۥۜ۟۠ۡۨ۬ۨۘ۟ۥ۟ۙۗ۟ۛ۠ۤۨۘۚۤۛۜۖۖۘۗۛۥۘۦۘۦۘۨ۠ۖۡۦۦ۟ۥۨۡۛۙ۠ۙ۠۬ۢۨۥۢ۫ۦۡۛۦۤ۟ۦۢۚ۫۟ۘۜۦۡۜۥ";
                            while (true) {
                                switch ((((((((((((((((((((((((((((((((str7.hashCode() ^ 345) ^ 885) ^ 752) ^ 187) ^ 328) ^ 628) ^ 198) ^ 298) ^ 932) ^ 598) ^ 419) ^ 313) ^ 754) ^ 734) ^ 242) ^ 835) ^ 913) ^ 344) ^ 221) ^ 57) ^ 490) ^ 234) ^ 679) ^ 999) ^ 401) ^ 206) ^ 50) ^ 920) ^ 616) ^ 746) ^ 54) ^ (-1478015657)) {
                                    case -1410529602:
                                        LoginActivity.lambda$showUpdateErrorDialog$1(dialogInterface, i3);
                                        str7 = "ۢ۬ۛ۟ۖۚ۟۟ۨۘ۫ۛۧۨۚۜۘ۟ۦۦۘ۬ۨۧۘۨ۬ۛۖۜۜۘۥ۬ۛ۟ۖۢۘۜۨۗ۬ۢۚۢۖ۟ۨۧۘ۫ۖۙۧ۟ۥۚۤ۫ۨۘۧۢ۠ۛۖ۠ۘۘۨۜ۬ۙۢۨۖۡۚ";
                                        break;
                                    case -1091297321:
                                        return;
                                    case -25317290:
                                        str7 = "۬ۗۘۙ۟۟ۦۢۚۨ۫ۧۘۥۨ۬ۙۙۦۥۢۘۤۡۡ۠ۚۖۘۚۗۢۖ۠ۛ۠ۦ۫ۦۙۥۡۘۦۦۧۘۜۛۘۘۧ۠ۦۜ۫ۜۛۚۥۙ۫۟ۨۜۧۘۘۢۥۘۗ۫۟ۛۖۘۥۘۨ۠۟۬ۧ۟ۨۘۖۙ۟ۨۥ۬ۚۜ۫";
                                        break;
                                    case 1561663671:
                                        str7 = "ۦۜۚۖ۬ۜۗۨۧۘ۟ۜۢۗ۫ۧ۟ۥۦۥۤۜۘ۬۫ۗۦۨۤۗۦۘۘۦۦۡۘ۟۠۫ۗۖۦۘۦۤۦۘ۟ۦۨۘۧۘۗۜۦۘ۬ۙ۫ۜۢۢۛۥۘۙۗۦۛۥۛۚۜۢ۠ۨۧ۟ۗۨۘ";
                                        break;
                                    case 1962125962:
                                        str7 = "ۙۡۘۡۦۢۚۡ۠ۧۨۖۨ۬ۗۥۨۡۘ۫ۛۖ۬ۦۦۘۨۥۚۚۛۥ۠ۢۛ۟ۧۨۥۨۙۖۘۛۗۘۥۜۢۦۘۖ۬ۙ۫ۦۘۨۤۢۜۘۖ۫ۚۗ۫ۨ۫۟ۨ۬ۖۡۘ۬ۤۚ";
                                        break;
                                }
                            }
                        }
                    }).create();
                    str = "ۚۦ۫ۚ۫ۘۘ۟ۤۢۨۡۖۘۜۦۥۤۘۦ۟ۖۥۘۚۛ۫ۥۙۡۖۥۡۚۦ۬ۛۤۥۘۡۛ۬ۗۡۤ۬ۖۥۡ۫ۙۚۜۨۛۜۖۘۚ۟۟ۧۖۗ۬ۜۜۙۧۨۘۛ۫ۥۥۡۤ۟ۛۥۦۖۖۖۗۡۚۗۡۢۘۧۘ۬ۘۨ";
                    break;
                case 481774137:
                    String str7 = "ۡۧۖۘۜۥۥۖۚۖۘۧۧ۬ۜۥۜۘ۟۟۫ۧ۟۬۫ۖ۬ۨۜۧۘۜۡۥۘ۟ۗۗۙۡۥۖۥ۬ۗ۟ۡۘۖۛۘۡۘۦۜۥۘۦۜ۫ۙ۬ۤۢ۠ۖ۫ۗۡۨۡۨۘۛۥۧۘۨۛۖۘ۫ۨۜۢۦۗۛۥ۠ۢ۫ۙۗۦۤۜۘۨ۫ۘۘۤۗۧۗۤۘۦۢۜۘۤ۬ۨ";
                    while (true) {
                        switch (str7.hashCode() ^ 674703304) {
                            case -1416123111:
                                str = "۠ۘۜۘ۫۫ۨۘ۟ۘ۟ۙۨۡۘۢۡۧۘۜۨۡۘۤۖۦ۠ۢۗۧ۠ۡۘۧۛۘۘ۠۠ۖۖۡۢ۫ۘۧۡۜۤۤۘۨۤۤۖۧۘۦۛۢۛ۫ۙ۫ۧۖۘۥ۬ۧ۫ۡۙۗۚۖۘ۫ۘ۬ۖۨ";
                                continue;
                            case -979062158:
                                str = "ۘۙۜۘۦۨۜۢۦۘۙۡۨۘ۫ۥۡ۟ۜۜۤۛۡۢ۟ۚۖۘ۬۟ۚۚۨۜۘۡ۫ۜۧ۠ۙۖۡۚۚۘۦۢۤ۠ۧ۠ۦۡۥ۬ۢۡۘۘۢ۬ۖۘۗۖۘۘۚ۟۬۫۠ۢ۟ۛۧۖۤ۫۫ۢۗۚۛۙۢۦۘۧۦۦۘ۬۬ۖۘ";
                                continue;
                            case 133457771:
                                str7 = "ۡۦۢۢۖۡۘۛۘۢۛۡۜۤۦۥۦ۬ۗۥۤۡۘۘۥۛۘۦ۠ۢۗۡۘ۠۫۠ۨۛۦۥۧۢۚۡۧ۫۟ۖۘۛۥۜۤۙۤۦ۫۟ۘۙ۬ۘۦۘۘۧۤۧ۟ۖۡۘ۟ۙۘۘ۠ۡ۬ۥۙۘۘ۬۟ۛ۟ۜۨۦۤۗۧۨۨۘۥۖۨ";
                            case 1865924376:
                                String str8 = "ۧ۟ۗۥ۠ۥۜۜۘ۫۠ۜۘ۟ۛۨۘۘۦ۬ۧ۫ۜ۬ۥۘۙۨۘۦ۬ۢۦۢۥۗۤۚ۟ۗۘۡۦۥۥ۟ۜۘ۬ۨ۠ۖۛۜۘۦۘ۫ۖۚۤۢ۬ۙ۠ۡۖۘۨۜۚۨۡۘۖ۫۫ۦۤ۟ۨۘۙۧۧۛ۫۬ۦ۠ۥۘ۫ۡ۠۟ۚۡۘۙۤۜۗۨۦ۫ۨ۬۠ۦۗۧۗۤۥۖۦ۬ۚ۟ۖۘۖۜۡۗ۫۬ۥۙۤۚۨۖۗۨۦۡۙۧ";
                                while (true) {
                                    switch (str8.hashCode() ^ (-806377109)) {
                                        case -1677892561:
                                            str7 = "ۚۨۛۡۨۤۜۚۚ۠۬ۜۘۖۢ۬۠ۡۛۜۗ۟ۛۤۢۘۜۦۦۖۘۜۧ۟ۛۚ۫ۡ۬ۗۜ۠ۘۘۘ۠ۡۥۜ۫ۡ۬ۘۘۥۧۢۛۜۜۡۗ۬ۛۙۨۡۤۘۤۙۘۤۖۘۛۖۜۘۥۦۧ۬۟ۘۘ۬ۗۚۨۛۨۘ۫۟ۗۧۨۡۥ۫ۥۘۢ۠ۗۛۚۙ۟ۡ۠";
                                            break;
                                        case -1323416550:
                                            String str9 = "ۨ۟ۨۚ۠ۛۧۘۖۘۧۙۛۚ۫۠ۧۤۘ۫۬۫۟ۜۜۘۤۗۧ۫ۦۧۘۦۖۥۙۨ۟ۘۥۘۘۦۥ۠ۨ۠ۛۗۗ۟ۧۤۙۡۧۛۡۢۦۦۗۖۘۗۗۦۘۙۖۙۦ۟ۤ۫ۧۘۖ۠ۜۘ۠ۗۜ۟ۛۦۤۜۜۢۘۘۗۙۘۘۦۘۦۛۘ۠ۥۖ۫ۧۧۥۘۥۨۥۘۖۡ۬۠۬ۦۘۙ۠ۖۛۢۜۚ۟ۘۘ";
                                            while (true) {
                                                switch (str9.hashCode() ^ (-208607792)) {
                                                    case -1858177745:
                                                        str9 = "ۘ۟۟ۡۡۖۘۖۦۡۘۗۧ۟ۙۚ۬۠ۚۜۥۚۡۘۚ۫ۨۘۚۛۜۘۤۚۗۜۦۨۘ۫ۤۖ۬ۛ۬ۚ۠ۦۘۙۘۜۘۧ۠ۢۢ۟ۗ۬ۗۜۦۜۦۘ۠ۖۘۘ۫ۖۜۘۚ۫ۜۘۜ۟ۥۨۘۤۡۜ۠ۚۛۥۘ۫ۥۖ۠ۧۖۘ۫ۗ۠۟۟ۨ";
                                                    case -482008179:
                                                        str8 = "۠ۙۤۧۨۨۛۦۚۙۤ۫ۢۨۛ۫ۡۘۥۖۧۘۤ۬ۥۘ۬ۖۧۦۧۘۘۜۤۘۖۛۨۖۗۤۦۚۚۖ۟ۢ۫۬ۥۛۗۤۙ۠ۡ۬ۛۨۘۖۦۦۘ۠ۥۢۖۤۙ۠ۥۤۧۦۨۘۢ۟ۨ۠ۡۘۤۖۘۘۜۚۨۨ۫ۜۚۜۢۙ۟ۛۤۖۡۗ۬ۤۘۛۦۜۙۚ";
                                                        break;
                                                    case 468499047:
                                                        String str10 = "ۧۤۘۘۛۨۨۙۡۘۜۦۘۚۗ۬ۙۤۜۘۚۤۗۙ۟۠ۧۘۤ۬ۥ۟ۡۧۚۤۙۦۛۜۜۙۢۖۘۛۗۘ۫۠۫ۘۘۨ۫ۢ۟ۥۤۘۘ۠ۖۡۘۗۙۚ۟۬ۜ۫ۜ۟ۢۧۛۘۛۡۘۘۙۡۘ۫ۦۖۛۤ۬ۖۢۢۗۚۡۛ۫۠۠ۖۦۗۖۗ۬ۨ۫ۧۦۘ";
                                                        while (true) {
                                                            switch (str10.hashCode() ^ (-932326252)) {
                                                                case -2038045796:
                                                                    str9 = "۠ۖۢۘۜۛۦۥ۬۠ۖۦۧۤ۬۫۟ۙۡۜۘۛۖۧ۫ۗۤ۫ۙۡۚ۫ۨۘۤ۠۬ۡۗۡ۬ۛ۬ۙ۠ۨۗۛۙۧۜۢ۫ۦ۬۫ۗ۫ۥۗۧۢۛ۫ۧۤۚۨۨۜ۬ۤۢۛ۠ۙۗۛۥ۫ۢ۟ۢ۫ۤ۠ۦۛۜۦۨۗۚۦۙۧۘۜۖۜ۠ۢۨۘۢۢۚ۬ۘۗۜۖۖۙۘۥۘۙ۬ۡۘ";
                                                                    break;
                                                                case -1491272685:
                                                                    str9 = "۟۠ۡ۬ۙ۫ۨ۠ۡۘۘۡۦۚۨۡۘۧۢۧۧۢۖۡۧۚۤۘۖۖۢۜۘۜۧۥۘۦۡۦۘ۠ۦۗۛۛۤۥۨۧۘۚۧ۫ۥۢۡ۬۫ۙۚۤۥۜۛ۠ۧۘۨۢۢۤۛۙ۠ۛۖۨۘ۠ۜۧۘ";
                                                                    break;
                                                                case -1253161544:
                                                                    String str11 = "۫ۙۗ۠۟ۙ۫۟ۚۘۨۘۘ۬ۦۥۘۖۗۨۨۘۢۤۜۘۚۢۥۘ۫۠ۖ۠ۖۚ۟ۨۦۚ۠ۨۚ۠ۖ۠ۤۥۘ۠۠۟ۜۤۘۢ۬ۥۘۢ۠ۧۙۥۙۛۥۨۘۛۢۙۡ۟ۦۘۚۧۢۚ۟ۦۛۤۨۘۤ۟ۨۘ۟ۤۢۚۗۚۥۧۥۦۛۗۧۢۦۘۦۜۡۤۦۤۗۦۨۘۛۡ۟ۖۜۘۘ۫ۧۤۧ۬۬ۢ۬ۦ";
                                                                    while (true) {
                                                                        switch (str11.hashCode() ^ 1560464661) {
                                                                            case -2051737984:
                                                                                str11 = "ۜۘۤۜۛۖۘۙۤۥۦۥ۟ۡ۟ۜۘۚۡۘۘۛۢۛۘۜۤۨۡۜۢۘۥۥۘ۫ۥۥۘۖ۟ۘۘۚۚۙۘ۬ۛۦۖۗ۠۟ۨۗۧۜۘۗ۟ۡۧۛۡۥۜ۠ۗ۫ۖۘۡۢۥۗۤۡۧۧۥۘۤۗۧۚۧۨۘۢۡۙۛ۠۬ۧ۬ۦۘۦۨۖۘۘۖۥۘۥ۫ۧۨ۠ۜۘۜ۠ۨ";
                                                                            case -773410387:
                                                                                str10 = "ۘۡۖۘۙۤ۠ۜۧۥۘۜۢ۬ۛ۫ۚۚ۫ۥۗۨۘ۠ۥۜۘۧۖۙۚۥۙۧۙۨۘۚۡۡۨ۫ۢ۬ۡۥ۠ۥۤۛۥۨۦۖۤ۬۟۠ۡۘۧ۠ۦۧۘۙۜۗۜۗۚۗۢ۠ۙۛ۟ۜۧۥۗۙۘۛۦۦۚۛۜۡۤۛۖۘۖۧۛۛۘ۫ۡۗ۬ۘ۫ۨ۬ۖۡۤۨۚۨۖۧۘ۬۠ۤ۟ۙۚۦ۠";
                                                                                break;
                                                                            case 452140016:
                                                                                str10 = "۠۟۬ۤۥۘۧۙۨۧۤۡۚۧۘۘۨۥۘۘۤۤۥۘۘۦۗۗۜۗۢۗۘ۟۟ۙۥۘۙ۟ۨۡۤۙ۟ۨۨۛ۠۬ۛۤۖۘۖۜۥۘۤۜۦۖۦۡۘ۬ۨۥۘ۬ۜۡ۬ۘۘۙ۠ۢۖ۬ۗ۟ۛۡۘ۟ۙۡۘۚۥ۬ۛۦۦۘۘ۫ۘۗۥۨۘۗۗۚۙۦ۬ۢۢۙ۫ۛ۬ۡۗۚۛۥۘۚۚۘ۬ۖۡ۬ۥۙ";
                                                                                break;
                                                                            case 1371560176:
                                                                                str11 = alertDialog.getWindow() != null ? "۠۬ۦۙۖ۫ۡۡۘۘۥۦۖۛۚۚۢ۟ۥۘۦ۟ۙ۫ۜۥۘۦ۟ۖۘۢۨۧۘۛۙۖۘۡۜۨۘۢۦۜۘ۠ۤۡۘۥ۬ۘۢۥ۬ۦۚۡۘۦۗۨۦ۠۫ۤۨۛ۬ۧۤۧۧ۟ۛۨۧۘۤۨۡۤۜ۫ۚۗۧ۠ۜۤۗۢۢۘۡۢۤۡۧۖۗ۟ۢۜۧۘۨۜۘۡۧۥۛ۠ۦ" : "ۜۖۘۘۨۜۤۤۥۨ۟ۜۙۦ۟ۡۡۡ۟ۘۧۦۘۗۛۡۜۦۘۗۨۦۘۙۦۡۘۛۤۧۗۚۥۘۜۧۖۘۛۜۧۥۜ۬ۡۨۘۘۙۜۢ۟ۧۦۘۗۢۥۘۦۚۦۚ۫۫ۥۢۜ۟۬ۦۢۤۦۢۙۜۙۛۗۦۘ۠ۙۧۜۨۗۘۖۙ۫ۡۨ۠ۛۖۥۗ۬ۡ";
                                                                        }
                                                                    }
                                                                    break;
                                                                case 424758616:
                                                                    str10 = "۬ۡۥۘۛۛۜۘۥۜۘۡۢۗ۟۫ۚ۠ۨۦۖۥۦۜۖۘۚ۫۫ۥۘ۠ۘ۬۫ۧۨۥۘۧۘ۠ۦۧۘ۠ۗۜۘۥۨ۫ۗۜ۠ۦ۬ۜۨۗۤ۫ۢۥۘۡۙۧۘۛۜۛ۟ۤ۫ۖۢۖۦۗۡۡۡۡۨۘۢۢۛۚۗۜ۠۬";
                                                            }
                                                        }
                                                        break;
                                                    case 1457509333:
                                                        str8 = "۫ۜۨۘۡۤ۠ۛ۟ۚ۟ۚۘۘۙ۬ۖۥۧۨۤۙۘۘۖۤۖۖ۠۠ۦۦۥۘۖۘۡۨ۟ۡۦۨۨ۠۫ۗ۬ۢۚۗۥۗ۫ۙۨۜۖۢ۟۠ۦۘۢ۬۬۟ۢۛۜۖۘ۟ۘۧ۟ۘ۫ۨۢ۫۠ۨۘۘ۫ۘۨ۬ۘۙۜۧ۬ۖۨ۟۟ۙ۠۟ۖۚۘ۠ۥۘۚ۠۫۠۫ۥۘۧۦۖۘۙۨۚ۬ۘۜۘ۬ۡۦ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case -789242703:
                                            str8 = "ۘۧ۟ۧۛۗ۠ۥۤ۫ۖۧ۟ۘۜۘ۬۟ۜۙۜ۠ۥ۬ۖۥۧۚ۫۫۟۟ۖۡۘۢ۫ۜۘۘۖۦۛ۠ۗۥۜۤ۬ۤ۟۬ۙۙ۠ۘۚ۫ۙۦۘۜ۟ۚۖ۠ۥۘ۠ۡۗۥۚ۟ۛۖۖۘۗۤۡۤۢ۬ۡۗۗۤۨۘۧ۫ۗ۠ۖۧۘۧۥۧۘ۟۠ۙۘ۟ۢۦ۫۠ۗۙ۬ۙۚ۫ۤۜۨۧۚۖۥۤۧ۫ۡۘ";
                                        case -210329270:
                                            str7 = "۟ۘۜۦ۟۬ۧ۬ۘۘ۠ۚۨۘۙۢۡۘۢۨۨ۠۬ۜۘۤ۟ۨۛۡۥۛۢۖۡۤ۫ۙۢۦ۠ۧۙۗ۠۫ۙۖ۟ۜۨ۫ۧ۬ۦۘ۟ۗۥۖۧۦۘۥۥۘۖۙ۬ۜۢۙۡ۟ۜۗۖۧ۠ۤۜ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 593386015:
                    gradientDrawable.setCornerRadius(m80dp(this, 4));
                    str = "ۖۥۢۜۗۖ۬۬ۙۨ۫ۤۤ۠ۘۘ۠ۧۡ۠ۖۥۘۗۖۡۘ۠ۤۧۙۢۖۘۤۜۧ۟ۙۥۙ۠۟ۦۢۜۘ۫ۤۢۥۢ۠ۤۤۡۘ۬ۜۨۘۗۙۚۡۥۘ۟۬ۖۘۦ۬ۥۧۙ۟ۙۗ۫ۧۨ۫ۛۚۢۡۛۗ۟ۜۘۜ۫ۡ۫۟ۤۦ۫ۨۨ۠ۛۨۙۨۜۘۘۘ۠ۥۘۘ";
                    break;
                case 629632984:
                    textView = new TextView(this);
                    str = "۬ۗۚ۠ۡۨۤۗ۬ۖۧۥۢۖۚۤۢ۫ۡۛۛۘۛ۬ۢۗ۠ۢۖۦۙۡۤۚۦۤۡۖۚۙۖۖ۠ۨۘۤۜۗۨ۠ۨ۫۬۬ۦۙۖۘۚۢۦۘ۬۬ۗۗۢۜ۠ۢۢۤۘۢ۫۠ۡۧ۬۟ۨۙ۟ۘ۠ۦۘ۟ۤۦۘۚۦۛۥۢۛۨۚ۫ۦۧۥۨۜۡۘۡ۬۟۬۫ۗ۟۫ۚ۬ۦۨۘۖۨ۠۬۠ۛ";
                    break;
                case 755963385:
                    textView.setTypeface(Typeface.DEFAULT_BOLD);
                    str = "ۙۡۘ۬۬ۨ۠ۨۘۛ۟ۘۘۛۘۧۘۖۦۡۘۛۗۧ۠۠ۖۗ۬ۢ۠ۘۜۘۥۗ۟ۛۤۦۘ۫ۧ۫ۥ۫ۖ۬ۦۤۤۢۧۦۡۥۥۛۤ۠ۙۦ۟ۖ۟ۘۤۨۚۘۘۢ۠ۤ۠۠ۢۦۖۨۘۘۜ۠ۖۦۨۢۧۡۘۢۤۖۚ۫ۘۙۥۘۨ۬ۜۘۛۚۦۘۛۖۗ۟ۥۨۧۤۜۘ۬ۢۦۘ۠ۖۛۚۘۙۧۗۧ";
                    break;
                case 839480168:
                    textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                    str = "۬ۚۨ۠ۡۜ۬ۢۜۘۗۧۨۘ۬ۗ۫ۗ۫ۚۢۘۢۗۦۥۘۘۤۗۥۥۜۨۤۡۥۙۜۧۘۘۢۛ۬ۖۜۚۨۧۗۖ۠ۥۡۦۘ۟ۙۢۛۘ۟ۥۢ۟ۦۡۨۜۘۤۚۘۦۦۥۛ۟ۡۘ۟ۤۜۙۦۤ۟۟۫ۛ۠ۧ۠ۧۜۘۚ۠ۤۙۧۖۢۚ۫ۚۛۡۘ";
                    break;
                case 1013007125:
                    i2 = m80dp(this, 40);
                    str = "ۜ۫ۦۡۘۗ۟ۢۧۢۙۦۤۥۚۙۤ۠۫ۧ۠ۚۡۘ۬ۘۘۚۤۙۧ۬ۗ۠ۤۥۘ۬۟ۢۨۨۥۘۖۧ۟ۙۙ۟ۘۨۙۙۨۘۥۦ۬ۢۨۚ۟ۥۧۛۘۘۛۤۨۘۙۙۡۧۚۜۥۧۢۦۘۜۗۛ۟ۨۛ۬۬ۡۦۡۜۜۘۤۙۜۘۛۡۡۘۙۢۖۚۨۖۘ";
                    break;
                case 1338461550:
                    return;
                case 1613411748:
                    button.setAllCaps(false);
                    str = "ۚۡ۫ۢۤۤۥ۟۠ۘۢۥۚۦۡۘۡۜۡۗۦ۫۫ۤۧۨ۠۟ۥۚۘ۫ۥۧۢۘۡۘۨۛۥۘۥ۬ۥۙ۠ۖۙ۬ۚۧۘۡۘۘۙ۟۠ۖۘۙۛ۫۠ۙۨۘ۬ۦۡۘۜۥۗۢۧۜ۟ۢۛ۟ۗۢۘۙۗۙۚ۠ۧۚ۬ۗۥ۫ۚۙۜۘۦۙۚۗۢۨۜۛۦۤۙ۠";
                    break;
                case 1695566166:
                    i = getResources().getDisplayMetrics().widthPixels;
                    str = "ۧ۬۬۟ۡۨۚ۟ۤۘۨۖۘ۟ۥۥۡۡۖۘۦۨ۫ۗۛۖۘ۟ۥۧۘۛ۬ۦ۫۫۬۫ۨۧۘۜ۟۟ۖۡۥۘۗۗۧۡۘۡۡۤۨۨۤۗۘۙۛۚۤ۬ۨۖۧۘ۠ۗ۠ۧۖۡۛۨۙۦ۬ۜۘ۠۬ۨۘۢ۠۫۫ۜۜ۫ۘۘۘ۫ۜۧۜۤۜۚۦ۟ۢۙۡۙۖۙۢ۠۫۬ۥۘۙۚۖۛۗۘۙ۟ۦۘۨۜۙ";
                    break;
                case 1747896221:
                    linearLayout.addView(textView);
                    str = "ۙۦۡۢۧۥۘۗۜۨۘ۫ۛ۬۟۠ۘ۫ۧۦۤ۬ۨۡۚۥۘۖ۫ۦۘۖۖۖ۬ۖۧ۬ۚۦۘۛۖۦۧۥ۬ۡۚۤۗۘۖۧۜۤ۠ۜۧۘ۟ۦۘۦۚۚۥۨۛۘۧۡ۫۫ۙۜۜۦۙۥۡۘۗ۟ۢۙۗۜۘۥۜۧۘۖۤ۫";
                    break;
            }
        }
    }

    public void checkForUpdate() {
        String str = "ۦ۠ۖۡۚ۬ۚ۫۠ۢۨ۟ۗۡۖۘۜۥ۬ۨۢۘۨۧۘۛۚۖۜۨۘۜ۠ۦۘۛۡۢۗۦۨۡۥۛۛ۬ۖۘۛۜ۬ۖ۫ۘۙۤۚۚ۟ۥۦۧۡۧۨۘ۬ۛۦۚۘۡۧۚۚۥۘۗۥۚ۠ۜۥۗۥ۟۫ۗ۠ۜۘ۠ۦ۠۟ۧۤۚۥۛۢ۠ۥۜۜۨۘۢ۬۟۬ۤ۟ۖۜۡۛۦۚۥۢۥۚۙۢ۬ۛۡۗۗۙ۫۫ۖۜۚۜۧۦۘ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 322) ^ 555) ^ 473) ^ 309) ^ 297) ^ 514) ^ 902) ^ 627) ^ 476) ^ 579) ^ 470) ^ 311) ^ 488) ^ 106) ^ 155) ^ 978) ^ 59) ^ 751) ^ 741) ^ 34) ^ 879) ^ 803) ^ 588) ^ 557) ^ 343) ^ 91) ^ 942) ^ 14) ^ 983) ^ 298) ^ 451) ^ (-763612224)) {
                case 994236709:
                    str = "۟۠ۖۘۦۘۜۢۥۧۦۗ۠ۛۦۗۜۜۨۗۖۤۛ۫ۧۥۢۨۦ۫۠۠ۤۖۘۜۡۘۦ۫ۨۜۤۥۙۢۨۘۜۗۥۘۗۤۡۘ۫ۘ۠۠۫ۗۖۙۨۘ۬ۜۜ۠۟ۜۦۧۦۧ۟ۗۜۨۡۘۧۛۥۤۚۘۘ۠۬۫۬۬ۡ۬ۛۨۘۥ۟ۛۛۡۦ۟ۨۥۘ۫۬۟۟ۨۘۘ";
                    break;
                case 1507119234:
                    Volley.newRequestQueue(this).add(new JsonObjectRequest(0, ApiServer.URLJSON(), null, new Response.Listener<JSONObject>(this) { // from class: kentos.loader.activity.LoginActivity.4
                        final LoginActivity this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override // com.android.volley.Response.Listener
                        public /* bridge */ /* synthetic */ void onResponse(JSONObject jSONObject) {
                            String str2 = "ۢۙۜۘۛ۬ۧۜ۬ۡۘۢ۟ۚۙۤۦۧۘۖ۬ۖۘۗۤۘۘ۫ۢۦۘۥۡۢ۠۫ۜۤ۫ۗۥۥۜۢ۬ۧ۠ۘۨۘۖ۫ۤۦۥۡۘۨۦۘۘۢۨ۬ۚۡۨۘۦ۠ۚۛۖۥۨۨ۫ۛۤۜۨۦ";
                            while (true) {
                                switch ((((((((((((((((((((((((((((((((str2.hashCode() ^ 68) ^ 371) ^ FrameMetricsAggregator.EVERY_DURATION) ^ 391) ^ 463) ^ PointerIconCompat.TYPE_CELL) ^ 865) ^ 603) ^ 898) ^ 295) ^ ViewUtils.EDGE_TO_EDGE_FLAGS) ^ 884) ^ 231) ^ 338) ^ 534) ^ 246) ^ 889) ^ 456) ^ 474) ^ 265) ^ 855) ^ 705) ^ 72) ^ 361) ^ 528) ^ 946) ^ 603) ^ 36) ^ 748) ^ 563) ^ 886) ^ 2059733731) {
                                    case -1580542461:
                                        str2 = "ۦ۟ۖۘۤۚۡ۫ۦۧۘ۟ۤۚۢۛۥۤۨۨۘۘۜۧۦۘۦۘ۟۟۫ۘۡۡۘۘۗۡ۫ۖۚ۟ۡ۠ۜۜۘۘۡۜۦ۬ۘۢۥۡ۠ۘۥۛۘۨۢ۫ۜۛۡۧۙۘۙۘۘۧۗ۫۠ۖۘۨۜۘ";
                                        break;
                                    case -645165352:
                                        onResponse2(jSONObject);
                                        str2 = "ۡۨ۠۟۫ۛۖۡۗۚۨۘۖۡ۫۬ۗۦۘۚۙۜۜ۠ۧ۟ۗۥۘۢۡۨ۬ۖۘ۠ۙۦۛۦۜۘۗۡۥۘۙۤ۬ۚۢۛۛۧۥۨ۟ۥۘۙ۟ۦ۬ۜۥۡۧۧ۠ۘۧۤۙۡۚ۬ۙۚۡۘ";
                                        break;
                                    case -550604594:
                                        str2 = "ۖۤۡۘۘۖۖۘۘۤۦۜ۬ۘۧۦۢۗۦۧۘ۬۬ۦۗۛۦۧۡۥۥ۬ۖۧۦۖۦۨۡۘۚ۠ۤ۬ۛۜۘۛۖۛۜۦۨۜۡ۠ۘۙۧۡۨۗ۫ۗۥۘۧۖۜۘۛۖۥۗۚ۬ۘۛ۠ۗ۫ۘۘ";
                                        break;
                                    case 601253798:
                                        return;
                                }
                            }
                        }

                        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                            jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 358
                            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
                            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
                            */
                        /* renamed from: onResponse  reason: avoid collision after fix types in other method */
                        public void onResponse2(org.json.JSONObject r11) {
                            /*
                                Method dump skipped, instructions count: 970
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: kentos.loader.activity.LoginActivity.C09394.onResponse2(org.json.JSONObject):void");
                        }
                    }, new Response.ErrorListener(this) { // from class: kentos.loader.activity.LoginActivity.5
                        final LoginActivity this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override // com.android.volley.Response.ErrorListener
                        public void onErrorResponse(VolleyError volleyError) {
                            String str2 = "۫ۥۘۙۗۨ۫ۦۦ۠ۨۖ۟ۡۖۗۢۖۘ۫۠ۤۡۢۛۘۖۗ۬۟ۖۙۛۜۗ۠ۧۖۚۡۘۚۜ۟ۢ۟ۦۘۘۙۧ۠ۤۚۦۨۘۨ۬ۤ۠ۡۖۘۨۘۜۚۛۚۡۘ۫ۤۚۖۦ";
                            while (true) {
                                switch ((((((((((((((((((((((((((((((((str2.hashCode() ^ 170) ^ 523) ^ 323) ^ 286) ^ 406) ^ 796) ^ 78) ^ 728) ^ 769) ^ 358) ^ 980) ^ 763) ^ 155) ^ 940) ^ 780) ^ 446) ^ 7) ^ 206) ^ 478) ^ 680) ^ 416) ^ 484) ^ 667) ^ 824) ^ 883) ^ 500) ^ 812) ^ 322) ^ 503) ^ 41) ^ 518) ^ 80844526) {
                                    case -2108113892:
                                        LoginActivity.access$400(this.this$0).dismiss();
                                        str2 = "ۗۨۥۢۙۗۥۘۙۖۗۘۖۜۘۡ۫ۦۘ۫ۚۗۡۖۧۖۗۙۦ۟۟ۥۙ۠ۘۧۡۗۜۘۜۗۢۨۗ۟ۨ۬ۚۙۖ۬۟ۛۧۚۢۥۢۨۗ۬ۙۥۡ۫ۨ۟۬۫۠ۜۢۜۘ";
                                        break;
                                    case -884010807:
                                        LoginActivity.access$800(this.this$0);
                                        str2 = "ۙۨۢۘۜۨۘ۬ۨ۫ۡۛۥ۫۫ۧ۬ۤۜۘۨۢۡۡ۫ۛۨۧۚۨۥۛۖۤۤۤۖۘۥۖ۟ۙۚۖۤ۠ۙۢۖۦۘۜ۟ۛ۠۫ۧۗۧۡۘۜۨۘۥۡۖۛۖۡۖۘۗۜۧۥۘۙ۠ۦۘ۫ۜۛۗۧۤ۬ۨۘ۫ۚۨۘۥۙۥۘۖۢۡۘۛ۬ۡۘۡ۫ۥۘۖۘۜۘۙۘۡۘ";
                                        break;
                                    case -269837532:
                                        return;
                                    case 272271394:
                                        str2 = "ۡۛۘۘۤۥۗۦۙ۬ۨۘۘۢ۟ۜ۟ۖ۬ۤ۬ۨۘ۠ۡۙۙۗۜۘۧۘۨ۟ۙۦۜۢۖۘۥۖۖۚ۠ۡۘۥ۫ۜۙۤۨۜۢۖ۠ۢۥۨۡۤ۠ۗۛۛۡۤۦۘۘۙۥۤ۟ۜۘۡ۬۟ۙۛۗۚۨۤۦ۠۠ۚۚۦۘۚۧ۠ۨۡ۠ۗ۟ۜۘۙۘۛۢۤۜۘۘۗ۬ۨۧۤۙ۟ۦۦۢۨۙۘۜۘۥۜ۠ۘۡۨۘۖۥۡ۬۬ۡۘۤۜۤۘۚۖۘ";
                                        break;
                                    case 1145592063:
                                        volleyError.printStackTrace();
                                        str2 = "۬ۡۦۘۛۚۜۜۦۦۘ۠۟ۧۛۖ۠ۨۡۚۥ۟ۖۖۖ۟ۧ۟۫۠ۙۚ۟ۦۘۤۥۛ۟ۡ۬ۚۡۨۘۛۗۡۘۚۙۥ۟۬ۢۗۦۘ۬ۧ۬۟۫ۦۙۘۘۡ۫ۜۘۤۖۛۙ۟ۖۥ";
                                        break;
                                    case 1362816032:
                                        str2 = "ۧ۟ۖۘۙۚۢۡ۟ۥۗ۬ۤۨۧۘ۠۠ۨ۫ۚۡۘۨ۫۫۬ۖۦۘ۠ۦۜۘۛۘۨۘۗۙۙۢۛۖۚۘۖۙۢۢۗۡۢۤۨۜۘۨۜۧ۠ۙۡۘ۠۬ۧۗۡۨۘۦۜۖۢ۬ۤۡۥۘۧۗۖۦۚ۟۫ۡۢۛۧۗ۠ۨۘۗۤۙۙۥۛۖۡۤۖۡۘۛۡۦۘۡۜۘ";
                                        break;
                                    case 1697999664:
                                        String str3 = "۫۠ۚۡۚۜۘ۠ۥۡ۫ۛۛ۫ۘۜۘۛ۫ۨۘۜۤۛۚۢۡۙۦۚۛۙۨۘۢۢ۫ۘ۬ۦۜ۫۫ۗۦۖ۬ۖۡۤۜۚ۬ۘۛ۬۬ۦۛۨ۟ۥ۟ۛۥۨۤۨ۬۟ۜۜ۠۬ۜۥۤۖ۠ۡۘۙ۫ۢۘۜۗۢۘۚۤۡ۫۟ۖۦۘۢۦۖۘ۟۟ۘۛۤۖۤ۫ۡۧۗۡۤۨۢۥۚۦۥۨۘۧۚۛ";
                                        while (true) {
                                            switch (str3.hashCode() ^ (-901320098)) {
                                                case -1840386586:
                                                    str2 = "ۗۨۥۢۙۗۥۘۙۖۗۘۖۜۘۡ۫ۦۘ۫ۚۗۡۖۧۖۗۙۦ۟۟ۥۙ۠ۘۧۡۗۜۘۜۗۢۨۗ۟ۨ۬ۚۙۖ۬۟ۛۧۚۢۥۢۨۗ۬ۙۥۡ۫ۨ۟۬۫۠ۜۢۜۘ";
                                                    continue;
                                                case -1764965952:
                                                    String str4 = "ۡۨۢۥۚۦۘۗۗۛۛۧۥۘۜۦۢۦۘۡۚ۫ۥۜ۬ۜۘۧۤۡۛۙ۬۫۬ۜۘ۟ۢ۫ۡۚۨ۟ۡۘۘۥ۟ۡۗۨۤۖۨۦۦۘۢۙۧۦۡ۟ۚ۬ۡۘۡۤۘ۠ۢۜۘۨۡۡۜۥۘۜۚۖۦ۟ۡۘ۫۠ۢۡۥۧ۟ۜۢۦۖۦۘۖۡۧۥۜۖ۟ۨ۬ۛ۟ۨۥۧۧۚۦ۫ۜۙ۟ۧۥۘ۫ۖۡ";
                                                    while (true) {
                                                        switch (str4.hashCode() ^ (-1854116526)) {
                                                            case -2041868599:
                                                                str4 = "ۨۨۦ۬ۧۦۘۗۡۘۦۖۗ۠ۘۤۧۛۤۖ۠ۜۘۛ۬ۖۘۧۗۙۨۜۛۦ۠ۘۘۥ۟ۘۘۨۢۦ۫ۚ۬ۘۧۜۦ۠ۛۗۨۘۘۜ۟ۗۢۤ۟ۢۗۤۜ۟ۧ۠ۖۘۨ۟۬۟ۢۨ۫ۘۘۘۛۡۥ۬ۜۤۡۦۢۢۜۨۙۜۚۧۘۛۚ۬۬۠۠ۦۙۧۡۥ۫۫ۡۧۗۛۧ۟۠ۤۥۤۧۖ۟۟۬ۨۧۘۘۡۨۥۡۚ۬ۥۡۛ";
                                                            case 219650472:
                                                                str3 = "ۢۥ۠۠ۢ۟۟۟ۦۛۗۘۚ۫ۡۘۢۢ۫ۙۦۢ۬ۛۨ۫ۙۢۢۤۧۖۦۘۖۗۚۥۨ۟ۘۨۙۡ۠ۜۡۡۘۘۤۚۘۜۥۘۘ۬ۨۘۢۤۜۖ۫ۚ۠ۤۦۘۧۚۜۛۘ۬ۗ۫ۡ";
                                                                break;
                                                            case 1344097985:
                                                                String str5 = "۫ۛۜۘ۫ۖۜۡ۟ۜۘ۠۠ۖۙ۟ۡۘۨۜۖۚۨۨۘۜ۠ۥۘ۬ۥۧۤ۫ۡۗۖۚ۫۟۬۟ۧۚۚۘۘۖۙۨۘۛۡ۠ۧۚ۟ۦۘۧ۟ۢۧۚۚۛۗۡۖۢۤۗۗۨۘۦۖۘۖۧ۬ۤۤۜۘۛۙۘۙۖۘۦۢۧۢ۟۬";
                                                                while (true) {
                                                                    switch (str5.hashCode() ^ 1378478288) {
                                                                        case -661292977:
                                                                            String str6 = "ۡۤۢ۟۬ۡۘۖۘۜۘۤۛۦۤۢۗۥۘ۠۟ۤ۟۟ۖۧۦۨ۠ۙۗۧۛۧۜۛۚۜۘ۫ۧۢۧۖ۫ۚۨۤۗۖۥ۬ۖۨۘۢۛۚۖۘۜ۠ۡۙۜ۠ۤۖ۠ۖۘۨۨۨۢۘۛ۠ۗۚ۠ۦۙۙۗۡۘۗۘ۠ۜۜۢۢۤ۫۬۠ۤۙۥۦۘۙۢۗۤۨ۟";
                                                                            while (true) {
                                                                                switch (str6.hashCode() ^ 718761411) {
                                                                                    case -880560118:
                                                                                        str5 = "۬ۦۘۖۖۦۘۧۦۨ۟ۤۨ۟۠ۨ۫۟۠ۤۨ۫ۨۜۘ۠۠ۧۙ۠۟ۗۘۡۢۧ۫ۗۧۡۙۡۘۢۧۢۥۜۖۛۚۤۦ۫ۤۧۛۗۢۨۥۥۘۤۚ۠۬ۤۗۦۦۗۦ۠۠ۤ۫ۢ۠۫ۥۧ۠ۗۢ۠۬۬ۡۖۜۘ۟ۚۥۜۗۘۢۙۢۚ۫ۨۘ۠ۦۜۤۚۥۘۤۧۦۘ۫ۜۥۦ۟ۨۜۦۜۘۚۙۖۨ۟ۜۘۥۤۜۘۛۘۧۙ۠ۦۘ";
                                                                                        break;
                                                                                    case 691135224:
                                                                                        str5 = "۠ۨۢ۠ۛۖۘۗ۟۬ۛ۠ۘۘۤ۫ۘۗ۫ۘۘ۬ۨۤۖۜ۫ۧۨ۠ۧۚۚۘۚۜۘۦۗۖۘ۫ۦۜۘۖ۟ۧۜۜۦۧ۟ۛۘ۠۠ۧ۫ۨۧۥۘۢ۬ۛۦۙ۟ۦۦۖۘۦۜۛۜۦ۫ۜ۫ۡۘ";
                                                                                        break;
                                                                                    case 1738201039:
                                                                                        String str7 = "۫ۖۦۦ۬ۨۚۜۡ۟ۗۦۛۜۖۘۗۧۡۘۧۘۜۧۜۡۘۢۨ۠ۥۖۨۘۜۙۦۘ۠ۦۥۥۥۤ۟ۘۜۘۧۤ۫ۘۘۨۧ۠ۦۛۨۛۧۥۘۦۧۧۦۜۡۘۥ۟ۜۖۤۨۗۢۨۛۙۗۛۨۘۨۨۡۗۤۡۥۥۡ۠ۦ۬۫ۘ۟ۙۙۤۗۜۚۤۚۗۨۚۖۦۖۚ۠ۛۡۤۨۚۛۥۥۘۥۜ۫ۛ۬ۙۧۢۢۗۜۖۘۧۘۦ۠ۢ";
                                                                                        while (true) {
                                                                                            switch (str7.hashCode() ^ 367544832) {
                                                                                                case -2094910468:
                                                                                                    str7 = LoginActivity.access$400(this.this$0).isShowing() ? "۠۬ۥۜ۫۠۬۠ۘۘ۫۬ۚۡۦۡۘۜۖۜۘ۫ۤۖۢۤ۠ۦۡۥۘۤۥۜۘۥۚۨۜۘۘۨ۫ۦۦ۟۫ۘ۬ۥۦۥ۠۬۬ۖۖۚۢۛۡۖۥۛۢۡۘ۫ۤۡۜۙۨۥۘۗ۟ۤۥۢۘۖۙۜ۫ۧۙۦۚ۠ۗ۟ۨۗۧۥۧۦۜ۠۠ۨۘ۟ۛۨۘۧۖۧ۠ۚۧۙۛۛ۫۟۠۫۟۬ۥ۠۫ۤۛۧ" : "ۚۗۙۘۡۥۥۚۤۙۡۘۡ۬ۦ۠۠۫ۢۚۙ۬۫ۨۘۧۗۦۘ۫ۙۥ۫ۙۘۧۡ۬ۧۥۗۘۜۧۢ۫ۘۘۥۨۧۦۨۧۘۤۡۧۡۢۢۜۖۦۘۘ۬ۚۢۡۤۗۨۢۖۦ۫ۚۛ۟۬ۗۛۨ۬ۘۘۙ۠ۥ۟۠۟۠ۚۖۜۧۗ۟ۢۨۢ۟ۤ۠ۜۢ۬ۦۥ";
                                                                                                case 265803537:
                                                                                                    str7 = "۫ۢۗ۫ۦۙۜۙۙۜۗۡ۬۠ۡۘ۟ۚۜۚۥۗۙۤ۬ۤ۬ۛۤۚۢۜۢۨ۬ۧ۟ۘۚۙۗۤۡۘ۫ۘۢ۬ۚۡۘۘ۫ۜۙۛۛۤ۬ۜۘۚۚۥۘۢ۟ۘۘۗۨۛ۟ۜۢۦ۟۬ۧۚۘۘۦۖۢۤ۠ۢ۫ۥۢۢۚ۠ۧ۬ۗ۟ۡۙۦۙ۬۠ۤۖۛۜ۬۫ۢۧ";
                                                                                                case 492120833:
                                                                                                    str6 = "ۥۨۚۚۢ۟ۧۥۦۘ۫ۥۜ۬ۡۜۨۦۧ۠ۧۡۢۖۦۤۖۚ۠ۖۜ۠ۢۙۗۙۥۘۜۜۨۘۜۜۡۚۢۢۧۡۨۨ۠ۖۡۙۙۚۥۧۜۧۤۚۖۘۘۖۙۖۘۖۡۨ۬۫۬ۚۡۧۧۖ۫ۧۦۦۘ۟ۘۛ۫ۧۜۘۚ۟ۗۧ۠۟ۗۨۛ۫ۥۧۢ۟ۢۖ۫ۗۧ۫ۡۢۙۚۙ۟ۢۛ۟۠ۧۢ۬ۗۥۘۚۨۦ۟ۥ۫ۢ۟ۙۛۡ";
                                                                                                    break;
                                                                                                case 1795850687:
                                                                                                    str6 = "ۦۤۦۥۜۤ۫ۗۢۦۛۖۗ۬ۗۦۘ۬۫ۗۢۜۤ۫۟ۨۘۧۦۖۘ۬ۦۡۤۦۗۙۖۥۘۗۢ۟۟ۧۦۦۥۙۘۙۘۡ۫ۜۗۙۢۡۙۙ۫ۘۜۘۧ۫ۘۘۤۚۡۘۡ۠۬۬ۡ۠ۛۖۘۖۡۘ۠ۨۜۘ۟ۡ۬ۘۤۦۘ";
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 1763614410:
                                                                                        str6 = "ۤۛۘ۟ۙۚ۠ۧۖۦ۟۟ۤۗ۬ۨۦۖ۬ۡۦۛۥۘۜۡۜۘۙۖۧۤۡۘۘۖۘۖۡ۫ۜۦۢ۠ۧۢ۫ۢۥۤۗ۟ۥ۬ۥۘ۟۟ۚۙۨۦۤۖۡۘۢۚۙۨۢ۟ۚۤ۬ۢۡۜۘ۠ۥۚۜۜۨۗۘۜۘۧ۟۟ۨۖۢ۫ۡۗۗۤۛ۬ۨۘۙۥۢ۬ۡۢ";
                                                                                }
                                                                            }
                                                                            break;
                                                                        case -158988921:
                                                                            str4 = "ۧ۫۟ۜۨۨۚ۫ۖۘۤۘۙۥ۫ۦۧۧۡۚۦۧۧۥۥ۫ۦۙۜۥۘۖ۠ۜۘۥۚۚۛ۟ۥۧ۬ۨۨۘۘۘ۠۫۟۫ۨۥۘۖ۫ۨۘۖۦۢۚ۫ۜۘ۟ۛ۟ۖۗۦۥۜۦۘۙۙ۠ۦۥۖ";
                                                                            break;
                                                                        case 1090545730:
                                                                            str5 = "ۡۚۥۨۨ۬ۜ۟۠ۥۗۦۤ۟۫ۗۗۚۚ۫ۦۜۨ۫ۤۧ۫ۡۥۥۥۥۘۤۚ۬ۖۛ۠ۧۜۨۤۜۘۤۙۚۛۙۚ۟ۨۜۖۨۤۚۛۤۘۘۢۢۘۨۘۧۘۧۗۖۘۖ۫ۘۘ";
                                                                        case 1252040937:
                                                                            str4 = "ۧۜۥۘۡۖ۬ۙۗۘۘۙ۫ۥۘۤۤۜۘۘ۫ۡۘۛۚۡۡۥۤۚۦۘۦ۫ۨۢ۠۟ۖۜۜ۫ۦ۫۠ۛۘۧۤۤۢۛۘۘۨ۫ۤۜۦۖۘۛۙۜۨۦۛۥۘۡۦۥۘۡۖ۫ۖۙۨۘ۠ۥۥۘ";
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 1508774856:
                                                                str3 = "ۤ۠ۘۢ۠ۙۗۚۦ۬ۜۘ۬۫ۧ۠ۚۡۘ۫۬۬ۜۧۦ۠۬ۘۦۡۙۜۢۦۘۨۡۛۥ۬ۦۘۛۙۗۦۨۛ۟۫ۨۗۧۜۘۢۨ۠ۜۨۘۢۛۡۘۢۧۨۖۦۨۤۧۛ۠ۢۜۘۧۢۘۘۗ۬ۢۜ۠ۢۧۜۘۘۛۦۘۢ۫ۥ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case -1290868204:
                                                    str2 = "ۨۨۜۧۜۢۢۤۤ۟ۧۤۘۛۧۤۖۦ۟ۤۖۨۦۙۥۧۡۘۥۧۥۥۛۨۘۜ۠ۙۦۦ۠ۘ۠ۦۘ۬۬ۡۘۨۚۦۘۤ۟ۜۘۨۙۨۛ۠ۜۥۘۨۘۧۜۧۘۙۖۦۘ۟۫ۛۘۘ۬۠ۘۜۦ۬ۥۦۧ۫ۡۡۘۥۥ۫ۥ۠ۦۘۗۢۨۦۡ۫ۖۗ۠۟ۡۘۙۗۖ";
                                                    continue;
                                                case 373918413:
                                                    str3 = "۠ۥۧۛۖۘۨۢۨۨۛۘۛۦۥۘۢۙۡۢۢۥۘۜۡۨۘ۫ۡۡۗ۫ۜۨۢۚۨۜۗۦ۫ۙۛۖۨۘۖ۟ۡۘۨ۫ۡۨۛۤۛۛۚ۬ۜۜۚۧ۫۟ۗۡۘ۬۫ۥ۫ۙۘۦۘۥۛۢۚ۟ۧۤۦۗۙ۬ۙۧۧۡۗ۬ۤۦۘ۬ۨۡۘۤۘۘ۫ۜۦۘۘۙۘۖۥۤ";
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                    }));
                    str = "ۥ۟ۥ۬ۙۦۘۜۘۜۘ۟۟ۡۥ۬ۚۤۖۢۢۗۥۤۢۙۧۛۢۢ۫ۡۜۗۥ۟ۨۥۘۤۖۖۘ۬ۥۗ۬ۜۛ۬ۜۨۘۗۖۘۗۤۥۘۘ۫ۖۡۘۤ۟۟ۛۗۧۡۙۙۚۘۖۜۦۧۖ۟ۤۖ۬ۘۤۡۗۖۢۛۨۘ۬ۜۦۘۦۡۤ۬ۢ۠ۥۗۚۘ۬ۜۧۙۨۘۖۜۛۛۦۥ۫۠ۢ۟ۤۨۘۖۢۘۗۜۧۤ۟ۛۖۘۨۘۡۧۜۤ۠ۙ";
                    break;
                case 1590325213:
                    return;
            }
        }
    }

    public void initDesign() {
        String str = "۟ۗ۫۠ۨۥۘۘۗۚۖۤۙۖۘۡۘۢۘ۠ۤۙۦۘۨ۠۟ۥۙۖۛۧۗۗۧۚۢۡۡۘۚ۫ۤۘۘۜۘۨۖۦۘ۠ۨۘۢ۬ۨۡۢۥۘۨۚۥۙ۠ۖۘۗ۬ۘۛۨۦۚۛۖ۬ۙۗۦۜۘۚ۬ۨۘۙۨ۟ۛ۫ۦۘۧ۟ۦۧۘۘ";
        MaterialButton materialButton = null;
        TextInputEditText textInputEditText = null;
        TextInputLayout textInputLayout = null;
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 639) ^ 167) ^ 857) ^ 52) ^ 188) ^ 180) ^ 574) ^ 76) ^ 282) ^ 33) ^ 393) ^ 147) ^ 319) ^ 321) ^ 404) ^ 921) ^ 295) ^ 125) ^ 410) ^ 744) ^ 15) ^ 743) ^ 249) ^ 937) ^ 872) ^ 403) ^ 436) ^ 314) ^ 651) ^ 928) ^ 143) ^ (-1241438723)) {
                case -1587371462:
                    ((MaterialButton) findViewById(C0931R.C0934id.id01ad)).setOnClickListener(new View.OnClickListener(this) { // from class: kentos.loader.activity.LoginActivity.3
                        final LoginActivity this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            Intent intent = null;
                            String str2 = "ۘۛۙۛۥۦ۠ۛۚۙۧۦۘۘۨۘ۠۫ۦ۫ۜۧ۫۠۫ۛۜۘۘۢ۟ۡۛۜ۬ۧۗ۬ۧۡۡۘۦ۫۬ۖۥۘۜۖۦۛۦۤۡۜۗۤۜۨۚۥۨۘۜۥۗ۬ۛۦۘۗۜۦۘ۟۟ۤۢۢۢۥۥۘۡۦۦۨۚۙۙۥۖۘۙۙۜ";
                            while (true) {
                                switch ((((((((((((((((((((((((((((((((str2.hashCode() ^ 244) ^ 948) ^ 586) ^ 191) ^ 732) ^ 945) ^ 528) ^ 39) ^ 222) ^ 873) ^ 35) ^ 225) ^ 68) ^ 405) ^ 556) ^ 650) ^ 794) ^ 99) ^ 621) ^ 374) ^ 647) ^ 1022) ^ 349) ^ 165) ^ 874) ^ 665) ^ 88) ^ 363) ^ 138) ^ PointerIconCompat.TYPE_HAND) ^ 831) ^ (-1324095047)) {
                                    case -2000049428:
                                        intent = new Intent(Deobfuscator$$app.getString(-3440729663225028425L));
                                        str2 = "ۖۢ۫۫ۜۡ۠۟۠۬ۜۧۖۛۧۙۢۜۜۧ۠ۛۢۧۡۧۘۛۡۗۖۛۗۡۨۧۘۛ۬ۚۗۧۜۘ۠ۚۡ۠ۨۗ۬ۦۜۢۦۧۘۡۙۧۖۙۖۢ۬ۡۧۙۤۦ۫۫ۡۘ۬۬ۘ۠ۖۜۦۧۨ۟۟ۙۛۛۢۗۥۧ۬ۙۦۘۢ۬ۜۘۥۤۗ۫۫ۘۘ۟ۤۨ۠۬ۘۚۥۢۥ۬۟ۥۖۘۥۧۖۘۨۥۨۘ۠ۖ۫ۤۜۢۖۗۤ۬ۗۖۘ";
                                        break;
                                    case -826931019:
                                        str2 = "ۦۜۧۘۜۡۤۧۨۧۘۢۚۧۤۙۙۖۗۡۖۥۙ۠۟ۘۙۦۨۙ۠ۖۘۛۘۨۤۖۜۘۜۥۖۙ۠ۛۢۨۙۥ۠ۡۜۦۘ۫ۘۡۘۤ۠ۡۘۢۦۨۘ۠ۜۤۡۘۥۤۖۚۚۢۛۧۡ۬ۙ۫ۛ۠ۦۥۘۛۖۜۘۗۚ۠ۥۗ۟";
                                        break;
                                    case 166570775:
                                        return;
                                    case 1436286565:
                                        intent.setData(Uri.parse(ApiServer.getOwner()));
                                        str2 = "ۚۘۨۗ۬۬ۥۡۧۗۘۘۥۦۡۘۗ۟ۗۜۘۧۘۖۛۙۗۜۚۗۗۘۢۤۖۦ۟ۤۘۘۚۛۧۧۘۘۘۢۥۙ۟ۤۘۡۧۜۚۧۗۗۡۤۘ۫ۖۘۙۘ۫ۙۧۜۘۚۥۥۘۧۥۧۘۦۖۛۧۛۦۘۨ۟۠۟۟ۜۘۢۡ";
                                        break;
                                    case 1460276580:
                                        this.this$0.startActivity(intent);
                                        str2 = "ۛۡ۠۟۠ۛ۫ۡۘۘۡۜۡۛۚۨۘۙۦۛ۬ۜۨۗۙۜۘۤ۟۠ۜۖۖۘ۠ۖۦۡۧۗۢۖ۠ۢۥۛ۫ۧۜۧۧۦۘۘۨۥۢۘۜۘۘۡۗۛۢۚۜۜ۟ۗۥۘۘۖۡۨۧ۟ۦۘۜۢۡۙۢۦۘۙ۬ۖۘۜۙۚ۠ۚ۠ۤ۟ۚۦۢۚۡۚ۬۟ۖۡۘۡ۫۬ۘ";
                                        break;
                                    case 1944658826:
                                        str2 = "۟ۡۥۘۥۦۘۙ۠ۖۘۙۡۥۘۧۧ۫ۖۡ۬ۖۧ۫۬ۥۘۛۦۦۘۘۚۥ۠ۢۛۚۙۦۛ۫ۜۦۘۘ۠ۚۚۛۦۘۛۙۗ۠۫۬ۢۜۦۖۜۦۘۤ۫ۘۨۨۨۘۚ۠ۗۦۗۚۜۘۗ";
                                        break;
                                }
                            }
                        }
                    });
                    str = "ۘۜۖۘ۫ۜ۠ۛ۠ۙۤ۟ۤ۠ۧۗۘۡۖۙۜۜۖۢۢ۫ۨۥۦ۟ۚ۠۠ۘۤۙۖۗۡۜ۠ۡۨۘۡۚۜۛۦۖۦۚۡۘۖۜۡۥ۫ۦۘ۫ۖۥۙۢۨۘ۟ۡۛۢۧ۬ۢۦۦۥۡۨۘ۠۫ۜ۠ۜ۫ۗۧۙۤۖۢۢۚ";
                    break;
                case -1345699523:
                    textInputLayout.setEndIconOnClickListener(new View.OnClickListener(this, textInputEditText) { // from class: kentos.loader.activity.LoginActivity.1
                        final LoginActivity this$0;
                        final TextInputEditText val$textPassword;

                        {
                            this.this$0 = this;
                            this.val$textPassword = textInputEditText;
                        }

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            String str2 = "۫ۨۦ۬ۦۘۘ۠ۛۡۛ۫۬۬ۜۗۘ۟ۥۘۗۖۨۙۡۨۦۤۡۜ۫ۜۘۥۡۥۘۡۚۙۢۥۤ۬ۢۙۥۢ۫ۜۨۘۖ۠ۜۘ۬ۨۨۘۗۢۨۖۦۘۘ۠ۜ۬۬ۦۡۜۚۨۘ۬ۜۜۘۙۖۧۘۛۛۦۘۡۥۧۘۧۡۧۘۡۘۖۨۗۖۘ۫۬ۡۡۥۧۘۨ۠ۜۜۤ۬ۡۗۢۨۜۜۘۙۦۦۤۙۖۖۥۧۘ۫ۨۢۖۢۧۨۜۢۜۙۜۢۜ۟ۢۖۘ";
                            CharSequence charSequence = null;
                            ClipboardManager clipboardManager = null;
                            while (true) {
                                switch ((((((((((((((((((((((((((((((((str2.hashCode() ^ 673) ^ 506) ^ 587) ^ 653) ^ 988) ^ 174) ^ 113) ^ 155) ^ 95) ^ 760) ^ 61) ^ 538) ^ 753) ^ 81) ^ 237) ^ 999) ^ 292) ^ 26) ^ 937) ^ 411) ^ 432) ^ 414) ^ 290) ^ 18) ^ 571) ^ 958) ^ 619) ^ 887) ^ 641) ^ 165) ^ 929) ^ 756268855) {
                                    case -2140591192:
                                        charSequence = clipboardManager.getPrimaryClip().getItemAt(0).getText();
                                        str2 = "ۧ۬۟ۗۦۡ۫ۦۛۚۤۜۘۛۚۧۛۘۘ۬ۖ۫۠ۧ۫ۥۖۘۗۦ۬ۤۤ۫۬ۘ۠۫ۥۚۗۥ۠ۗۖ۟ۖۢۤۢۦۜۘۘۛۗۦ۠ۗۙۡۚۚۥۡۘۘۤۖۘ۠۟ۦۘۧۢۧۜۡۡ";
                                        continue;
                                    case -1034735477:
                                        String str3 = "ۘۘۡۘۗۥۧۘۦۧۥۘۘۡۚۥۗۥۨۧۢۧ۫۬ۚۡۙ۟ۘۥۜ۫ۘۘۜۢۡۡۖۘۧۗۥۘ۬ۘۥۘۤۗ۟ۤ۫ۥۙۡۥۘۘۘۤۡۤ۠ۜۨۘۗ۟ۖۘۦۤۙۨۥۛ۬۫ۗۡۧۡۨۨۨۘۡۡۡ۟۠ۙۨۗ۫ۜۦ۠";
                                        while (true) {
                                            switch (str3.hashCode() ^ (-2015101984)) {
                                                case -1450450820:
                                                    str3 = "ۤۨۖۘۨۥ۠ۤۥۧۘۦ۟ۙۚ۠ۢۨۥۗ۬ۡۦۡۘۛۧ۬ۡۡۜ۬ۢۢ۟ۚۡۗ۫ۨۢۤۚۧۤ۬ۢۢۙۜ۠ۙ۠ۧۜۚۘۜۘۨۤۜۡۤۤۨۚۢۛۘۥ۠ۤ۠ۡۡۧ۠ۨ۬ۜۥۘ۠۫ۙ۫ۙ۟ۜۦۙۗۛ۫ۖۢۦۘۖۥۡۘۢۘۥۦۚۗ";
                                                case -200045261:
                                                    String str4 = "ۖۚ۠ۥ۟ۢۙۡۨۘۙۨۤۤۦۡ۠ۡۥۨۦۘۤۨۘۢۧ۬۠ۙ۠ۜۘۨۥۜۦ۫۠ۖۦ۟ۡۚ۫ۦۘۛۦۢ۫ۜۦۨ۟۠ۦ۫ۗ۟ۤۢۥۘ۫ۧۖۘۚۜۤ۠ۢۚ۫ۚۦۘ۬ۥۛۘۙۧۜ۬ۦ۠ۧۥۘۤۧۤ۟ۧۡۘۧ۟ۦۘ۠ۘۦۘۘۜ۟ۗ۟ۜۘ۠ۨۜۧۜۜۘ۬۟ۖ۠۫۠ۧ۠۟";
                                                    while (true) {
                                                        switch (str4.hashCode() ^ 691837639) {
                                                            case -1288646174:
                                                                String str5 = "ۗۧۡۢ۠ۢۦۦۜۨ۠ۚ۟ۖ۟۟۫ۛۙۛۥۥۥۘۛۘۘۘۤ۠۟ۖۙۜۛۜۥ۠ۙۨۛۥۘۖۛۘۘۤ۬ۨۘۙۦۖۦۡ۬ۨۤۨۘۛۙۘۧ۬ۜۘۧۤۥۘۦۛۨ۬ۧۧ۟ۢۢۧۗۡۘۥۘۤۦۘ۬ۡۚۦ۬ۜۘۤۖۨۦۗۦۘۨۨۘۢۢ۠ۡۡ";
                                                                while (true) {
                                                                    switch (str5.hashCode() ^ 711960195) {
                                                                        case -1410605758:
                                                                            str4 = "ۥۗ۬ۡۖۧۘۨ۫ۡۘۡ۫ۢ۬ۘۘۘۡۘۚۡۡۡ۟۫ۤۚ۠ۡۧ۬ۧۜۖۖۙۛ۬ۖ۠ۢۘۚۖۘۢۥۛۘ۫ۚۘۙۙۚۡ۬۠ۨۖۘۖۙۥۘۤ۬ۚ۬ۧۖۘۙ۟ۤۢ۫ۘۘۜ۬۬۬ۘۨۘۡۦۛ۠ۚۦۘ۠ۜۨۘۖ۫ۢۡۤۘۘۡۢۜۘۦ۫ۖOۨ۠ۘۨۘۖۘ۬ۛ۠ۛۡۢۘۡ۟ۚۧۗۖ۠۠ۖۖۜۘۚۙ۬ۛۨۜۘۜ";
                                                                            break;
                                                                        case -946252975:
                                                                            str5 = "ۤۗۨۦۚۧۗ۫ۜۘۗۘۧۘ۠ۥ۟ۛۥ۠ۚۢۡۧۤۡۘ۬ۗۢۚۤۖ۫ۧۦۧۙ۠ۗۘۜۘ۠ۡۙۛۥۘۘۚ۫ۘۜ۬ۜۘ۟ۜۗۘۧۥۘۨۗۡۡۖ۠ۢۗۨۧۘۨۘۙۛ۠۫۠";
                                                                        case -180475988:
                                                                            String str6 = "ۗۨ۬ۧ۟ۜۨۤۙۥۜۖۗ۟ۥۘۧ۠ۖۡۧۡۖۦۡۘۥ۫ۙۤ۬ۘۘ۬۫ۦۗ۬ۥۘۥۙۚۗۤ۟۬ۚۘۘ۟ۡ۫ۖ۬ۖۨۚۦۧۢۛۚۖ۟ۚۚۘۜ۠۫ۚ۠ۚ۠ۖۛۖۤۘۘۨ۟ۛۦۜۘۚۘۤۚ۠ۨۗۙۖ";
                                                                            while (true) {
                                                                                switch (str6.hashCode() ^ (-462014451)) {
                                                                                    case -1180708400:
                                                                                        str5 = "۠۫ۦۘۜۨۘۥۛۗۢ۫ۡ۫ۥۨۡۥۤ۬ۖۘۦ۫ۛ۠ۘ۫ۨ۠ۥۘ۟ۙۛۧۢۡۡۡۘۚۚۨۤۢۢ۠ۗۜۘۦ۟ۡۗۢۜۖۜ۟ۛۘۥۘۛۥۚۙۚۤۨۡۡۘۚۚۜۘۙۢۚۛۨۖۗۗۖۘۦۥۚۦۢ۬ۥۢۦۘۦۛۡۘۗۨۛۙۖۦۤۘۦۤ۟ۜ۬ۙۨۨۘۧۦۥۘۖۛۜۘ۫ۥۜۘ";
                                                                                        break;
                                                                                    case -1012978291:
                                                                                        str6 = "ۗۗۗ۟ۥ۠۟ۙۡۘۥۤۥۘ۫ۡۦۘۡ۟ۘۥۖۘ۫ۢۥ۠ۜ۟ۧۧۘۘۡۦۨۖۧۦۘۡۙ۠۟ۧۘۗ۟ۢ۫ۦۘۖۜ۠۫ۚۡۙۙۘ۟ۨ۬ۧۘۤۖۧۘۛۛۖۘۤۙۡۘۖۡ۟۫ۡۚۙ۬ۦۖۛۚۡۨ۬ۘ۬۫ۡۗۨۘۡ۫ۗ۠ۜۖۘۚۚۛۛ۬۬ۥۛۧۜ۬ۚۛ۬ۧۨۦۧۥۖۛۦ۟ۜۚۨۛ۠ۦ۟ۤۙۜۘۘ۠ۗ";
                                                                                    case 525694047:
                                                                                        str5 = "ۢۗۜۡۗۗۧۧ۟ۘۖۦۘۡ۟ۥۘۨۚۖ۬ۨۦۘۨ۫ۛۦۡۦۘ۠ۡۙۧۨۙۤۤۨ۫ۧۢۢۖۘۗ۬ۛ۟ۧ۠ۢۖۘۡ۫۟۫ۚۡۘۨۤ۬۠ۢۥۘۨۗۖۘۡۘۨۘ۟ۘۖ۠ۥۛۖۨۦۘۘۛۜۘۧۜۧۢۡۧۘ۬ۘۡ۠ۜۚۡ۠ۦۤۢ۠۬ۢ۠ۤۙۡۘۢۦ۠ۢ۬ۧۥۡۦۙ۠ۢۘۥ";
                                                                                        break;
                                                                                    case 1816540712:
                                                                                        String str7 = "ۨ۬ۘ۬ۚ۫ۤ۬ۨۙ۟۫ۚ۫ۢۥۢۙۘۥۨۗۤۡۛۦ۬ۘۚ۬۫ۦۦ۟ۡۘۛۢ۠ۗۢۡۧۛۤۙ۬ۧۨۘۦۘۨ۫ۦۙۡۢۗۗۘۘ۬ۧ۬ۚۘۡ۬ۥۧ۠ۦۘۨ۟ۙۤۘۚۡۘۨۨۡۘ۬۠ۘۗۖۡۘ۠ۥۦۢۛۡۘۖۛۡۧۜۛۚۨ۬ۖۢۖۚۘۘۥ۫ۦۙۚۜۘ۫۠ۛ";
                                                                                        while (true) {
                                                                                            switch (str7.hashCode() ^ (-2101934683)) {
                                                                                                case -561868661:
                                                                                                    str7 = clipboardManager != null ? "ۛۥۛۙۧ۫ۢۜۜۦۧۦۘۛ۟ۘۘۘۨ۫ۡۗۜۘ۬ۘۡۢ۬۠ۡۚۨۘ۠ۗۛۤۙۘۘۥۛۜ۟ۨۢۚۙ۫ۖۧۧ۫۠ۨۗۘۘۢۦۨۨۥۘۡۧۘۘۖ۠ۖۚۤۜۚۖۛۥۨۙۦۚۘۘۗۙۢ۬۟ۚۤۛۜۘ۟ۚۧۚۛۚۢ۟۟۫ۤۘۘۘ۬ۤۛ۬۬ۦ۠ۦۜۡۖۘۢۢ۠ۢۧۧۖ۠ۡۘ" : "ۤۦۗۚ۫ۚۘ۠ۚۨۡۢۨۥۥ۟ۥۦ۫ۧۥۨۦۧۘ۬ۘۤۢۙۧۜۦۥۦۘۦۡۙ۟ۚۨۘۘۛۗۚۚۥۧۤۥۨۛۘۘۨ۬ۨۚ۠ۙۢۖۗۚۤۖۙ۠ۨۘۨۖۜۗۥ۬ۡۜۖۧۤۨ۬ۨۘۘۙ۟ۙۜۢۦۘ۫ۘۧۛ۠ۛ۫۬ۨۘ۟ۗۡۙۜۤۦۤ۠ۡۛۡۦۜۥۦۡۚ۠ۥۛۘۦۡ۫ۨۢۥۨۜۘۜۖۡۘ۟ۧۡ";
                                                                                                case 17865461:
                                                                                                    str6 = "ۤۡۖۘ۫ۜۖۘۥۧ۟ۧ۠ۧ۬ۨۘۜۘۨۙ۬ۘۘۜۜۖۡۦۜۛۡ۬۬ۘۜۘۖ۠ۘۘ۬ۙۦۛ۬۠۟ۨۧۘۦۙۡۨ۫ۤۤۢۜۘۛۧۢۡ۬ۘۘ۬ۦۡۜۡ۬ۙ۟ۨۦۡۘۗۘۥۢۗۢۚۦۖۡۢۛ۫ۘۚۘ۟ۚۢۜۜۤۚۘ۬۠ۢۘۡۨۘۡۡۗۡۘۛۛۛۖۘۡۧۛ۫۬۟ۖۢۙۖۨۡۡ۬۫ۧۜۗۗۦۤۤۥ";
                                                                                                    break;
                                                                                                case 114371120:
                                                                                                    str7 = "۬ۦۛ۠ۙۨۘۥۡۦۗۙۨ۬ۥۜۘۧ۟ۤۤۚۘۚۧۦۘۡۨۖۛۛۨۘۜ۠ۗۥ۫ۡۘۤۤۛۗۘۜۡۚۛۤۤۤۤۗۜۘۡۤۥۘ۬ۘۘۘۨ۫ۦۘۖ۟ۘۘۢۢۚۢۚۗۦۖۘۘ۠ۗ۬۟ۘۗۙۤۙۥۜۢۜۗۜۤ";
                                                                                                case 241671295:
                                                                                                    str6 = "ۘۧۥۦۗۙۙۛۦۘۨ۠ۚۦۡۦۨۥۢ۟ۧۦۘۤۙ۟ۙ۫ۨ۟ۙۙۧۢۤۢۥ۫ۧۡۘۥۤۜۘۦۧۡۘۥۖۥۘ۫ۤۨ۬ۛۖۧۥۦۖۤۦۘۤ۬ۦۦۡۢ۠۬ۢۢۡۧۘۤۜۥۜۤۢ۟ۦ۠ۛۡ۬ۦۡۡ۠۠۠ۙۜۗۖ۠۠ۥۜۜۘۧۗ۠ۤۢۢ";
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 1513838047:
                                                                            str4 = "ۗۘۘۥۙ۟ۢۜ۬ۙۡۘۘ۬ۦۤۛۚۗۢۜۖۤۘۤۧۧۡۗۜۢۙ۟ۜۦۘۨ۟ۥۘۖۘۤ۠ۘۘۙۤۢۙۛۙۛ۫ۘۦۘ۬ۨۛۜۡۙۥۘۨۦۤ۟ۧۧۗۢۥۖۛۦۘ";
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case -907986930:
                                                                str3 = "ۛ۠ۜۧ۬ۗۚۛۗۚۡۥ۬ۚۘۘ۬ۘۙۦۛ۟۫ۜۜۘۖ۫ۦ۫۟۠ۧۚۜۗۨۤۢۖۛۧۥۧۙۛۜ۠ۧۡۘۛۡۦۘ۫ۧۤۘ۟۟۫ۢۗ۬۟ۢۘۗ۫۬۠ۧۗۖۨۖۥۙۨ۬ۙۥۥۦۘۘۤۥۡ۫ۗۙۥۜۘۙۗۢۛۘۖۜ۠ۨۢۖۦۘ۬ۥۘۨ۟ۥۘۨۢۡۘۙ۟ۡۘ۬۟ۥۚۜۖۘ۬۠۬۫۬ۨ۠۠ۨۘۥۗۦۛۘۨۘ";
                                                                break;
                                                            case 485992869:
                                                                str4 = "۠ۥۚۜۧۡۘۜۦۥۚۗۡۘۡ۟ۜۘ۠ۤۥۢۖۨۜۙۨۧۢۙۗ۟ۡۘۧۚ۟ۦ۟ۖۘ۟ۧۙ۬ۡۘ۠۫ۛۗۧۥۢۛۡۘ۟۫ۨۘۨۖۚۖۘۨۗۖۘۤۨۢ۬ۘۡۛ۠ۢۤ۫ۨۘ۫ۨۧۘۦ۬ۖۘۜ۟۬ۛۛۙۚۗۙ۬ۤۘۖۡۜۖۧۙۦۛۤۥۖۨۘۛ۠ۡ۠ۖۘ۟ۥۘۧۚ۠ۡۤۚۡ۠۠ۛۙۘۥۙۥۘۛ۠ۦۘۘۜۜ";
                                                            case 2011988214:
                                                                str3 = "ۘۖۚۦۤۗۜ۬ۡ۬ۡۥۘ۫ۖۤۥ۠ۦۘۖۙۦۧۖۦۘۤۡۨۘۙ۬ۧ۫ۘۡۘۥۧۛ۟ۙۡۘ۬ۨ۟ۧۨۖۦۖ۬ۡۙۢۙ۟ۢۤۚ۫۠ۘۥۗۗۘۜۡۤۘ۫ۥۨۤۥۜۛۜۘ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 470331540:
                                                    break;
                                                case 605666361:
                                                    str2 = "۬۠۫ۡۤۖۘ۠ۦۜۘ۠ۙۗۢۥۘۨ۫ۜۨۜۗۗۤۜ۬ۖۤۛ۫ۛۦۚۥۘۛۗۘ۫۫۟ۡ۠ۡۘۛۨۛۦۘۥۘۛۡۗ۟ۥۢۨۘۜۚ۫ۥۨۨۦۖۖۢۘۦ۬ۦۢۨۨۨۢۨۥۘۗۗۨ۫ۢۦۘۨۦۛۜۨ۫ۧۛ۫ۥ۟ۦۨۚۘ۟ۦۥۘۢ۠ۡۘۗۥۘۢۘۨۘۤ۟۬ۢ۫ۘۖ۠ۡۘۚۥ۠۬ۨۡۘۢ۠ۨۘۜۛۧۤۡ";
                                                    continue;
                                            }
                                        }
                                        break;
                                    case -942338483:
                                        str2 = "ۡ۫ۛ۫ۜۙۡۨۢۨۡۘۗۦۡۚۥۡۥۜۖۘۨۥۘ۫ۧۥۘۧۜۢۙۦۨۘۡۡۥۗ۠ۢۡۧۘۘۙۛۦۘۗۢۦۘۘۧۘۛۥۚۚۧۡۘۡۜۦۥۖ۫۫ۡۙۗۦۨۘ۟۟ۢ۠۬ۖۘ";
                                        continue;
                                    case -429129784:
                                        str2 = "ۧ۫ۦۘ۠ۘۧۡ۟ۨۘۗۛۥۗۘۡۘۗۜ۫ۛ۠ۧ۠ۥۘۦۢۜۘۙۙۢۜۧ۟ۜۡۡۘۨۦ۫ۛۢۗۡۢ۟ۥۦ۬۬ۛۖۘۗ۠ۥۧۘ۟ۜۗۡۘۚۘۥۘۦ۫۠ۙۧۖۜۛ۠۬ۦۙۨ۟۬۟۫۟ۡۘۖۤ۬ۘۧ۫ۛۧۥۦۘ۫۠ۗۚۧۨۦۚۖ";
                                        clipboardManager = (ClipboardManager) this.this$0.getSystemService(Deobfuscator$$app.getString(-3440729555850846025L));
                                        continue;
                                    case -5355877:
                                        String str8 = "۟ۤۜۘ۬ۦۙۡۧۜۤۘۖۘۡۤۡۛۜۦ۫ۡۘۚۖ۟ۗۚۧۜۖ۠ۜۗۧۦۛۖۦۙ۟ۛۜۘ۠۫ۢۖۖۦۘۥۨۥۦۦۘۤ۬ۗۘۜۨۡۥۜۦۦۤۙ۫ۜۡ۟ۜۘۗۛۡۘۧۦۜۘ۠ۚۥۘ۟ۨۜۛۛۖۘۘۢۚۘۦۗۙۦ۫ۤۢۜ۫ۙۦۘ۟ۥ۠ۖۘۖۘۙۚۘۘۙۙۛۦۗۢۙ";
                                        while (true) {
                                            switch (str8.hashCode() ^ 2068295127) {
                                                case -1701228651:
                                                    str2 = "ۧۖۡۘۢۘۛۦۧۖۘ۫ۗۡۛۨۘۧۦۛۢۗ۬۫ۧۖۘ۟ۜۥۘۨۢۡۘۛۙ۠۠ۛۘۘۜۘۚۜۢۗۤۦ۬ۛۨۦۘۤۚۦۨۥۘ۬ۗۨۘۡۚ۫ۨۡۘۛ۬ۜ۟ۥۧۘۥۤۨ۬۫ۤ";
                                                    continue;
                                                case 31233156:
                                                    String str9 = "ۦۦۦۘۡۘۘۘۘ۫ۡۨۜۛ۬ۥۤ۫ۦۙۨۙۦۘۘۜۜۘۦۗۡۘۧ۫ۧۤۧۛۢ۟ۡۧۖۘۘۘۚۨۗۢۚ۫ۖۘۖ۟ۜ۬ۜۥ۫۬ۦۘۜۖۥۘۘۨۦۘۛۗۙۦۨۢ۬ۜۦۘۜۡۘ۟ۚۦۢۦ۠ۤۥۚۧ۫۟ۛۗۖ۠ۢۦۖۘ۟ۧۗ۟ۗۜۧۘۛ۟ۦۘۗۨۜۘۙۖۖۘۙۜۖۘ۫۠ۛ۫ۧۤ";
                                                    while (true) {
                                                        switch (str9.hashCode() ^ 81485776) {
                                                            case -757787353:
                                                                str8 = "ۜۢۧۖۦۖۘ۟ۗۢ۠ۖۤۤۛۜۘۙۗۢۙ۠ۙۦۗۦ۫۫ۨۛۤۗۦۥۨۦۢۦ۠ۦ۬ۘۤۗۖ۟ۗۖۡۘ۠ۗ۬ۛۢ۟۬۟ۦۧۥۢ۠ۗۨۘ۠ۘۤ۬ۚۥۙۘۘۤۡۨ۬ۦ۫ۜۘۦۘۜۢۚۗۜۦۘۜۤۖۧ۫ۢۜۧۘۘۜ۟ۛۚۧۦۘ۬۟ۙ";
                                                                break;
                                                            case -94816267:
                                                                str9 = "ۛۘۧ۬ۦۦۤۛۘۨۛۡۦۢۛ۟ۥۥ۠۫ۧ۬۠۫ۤۨۥۗۙۛ۬ۦۢۙۨۤۘۘ۫ۛۘۤۤۖۙۚۗۨۜۥۘۥۛۖۖۨۚۤۤۨۘۜۥۧۦۛۘۘ۫ۜۚ۬ۗ۫ۡۨۢۛ۫ۚ۫ۛۦۢۙۧۙۥۢۢۨۘ";
                                                            case -37835383:
                                                                str8 = "۠ۥ۠ۖۚۜۦ۟ۨۦۗۡۦۦۤۥۡ۬۫ۢۖۘۨۛ۟ۧ۟ۛ۟ۘۛۢۦ۟ۢۨۜۦۦۨۘۤۚۨۢۥۥۙۙ۫ۖۤۗ۬ۘۗ۠ۛۗۢ۟ۛۛ۟ۙۧۨۘۙۤۥۜ۟ۦ۠۬ۥ";
                                                                break;
                                                            case 1022518594:
                                                                String str10 = "ۘ۬ۛۜۥۧۢۤۛۥۨۗۚۦۧۘۘۖۧ۟ۜۙۘ۬۠۬۬ۧۧۜۙۚۖۡۘۧۘۧۘ۠ۦ۫ۨۙۚۛۙۡۘۚ۬ۢ۫۫ۤۖ۟ۧۙۨۦۘۧۥۖۜ۫۫ۚۦۦۘۗۚۖ۟ۨۨۦۨۘۖۚۡۙۖۖۨۗۚۚۦۜۘ۬ۚۦۘۧۡ۬ۘۡ۬ۡۨۧۗۦ۠ۧۗ۬ۧۥۜۘۢۜۨۘۥۢۡۘۢ۬ۖۘۥ۫";
                                                                while (true) {
                                                                    switch (str10.hashCode() ^ 2087886930) {
                                                                        case -1944225982:
                                                                            str9 = "۫ۛۧ۬ۘۘۧۧۢۧ۟ۜ۟ۜۘۡۜۡۡۛۚۖۦۖۘۤۥۥۘۦۜۘۥۦۖۘۡ۫ۛۥۢۛۧ۬ۥۘ۬۟ۚۨۖ۠ۚۙۜۦۗ۠ۙۙۖۘۖۛۜۘ۠ۧ۬ۜ۠۟ۤ۫ۨۧۘۢۖۢۛۧ۫۟ۢۖۗ۬ۘۘۡۚۢۚۡۦۘ۠ۙ۠ۦۙ۠۠ۗۨۘۜۛۥۛ۠ۥۘ۬ۛۤۨ۫ۘ۠۠ۖۚۗۖۨۧۧ۫ۢ۟ۨۡۡۨ۠ۦۧ۫ۢ";
                                                                            break;
                                                                        case 788142464:
                                                                            str9 = "ۥۚ۠ۙۗۨۘۛۘۨۘۜۡۨۘۦۥۤۡۙۧۥۦۥۘ۬ۙۘۘۘۜۜ۫ۡۡۛ۬ۡۛۦۗۛ۠۬ۤۥۡۘۢ۫۬۫۬ۢۜ۫۠ۥۧۜ۟ۧۦ۠ۛ۬ۥۖۥۖۘۢۦۖۘۜۥۖۘۚۤ۫ۡۥۨۖۜۦ۫ۦۖۦۘۘ۠ۘۜۘۙۖۘۘۛ۫ۧۢ۬۠ۤۚۜۘ۠ۦۦ";
                                                                            break;
                                                                        case 1357649769:
                                                                            str10 = "ۗۖۛۗۚۦۘۗۢۖۘ۬ۘ۠ۜ۟ۧ۫ۤۦۘۚۙ۟۫ۧۦۘ۫ۙۧ۟ۘۗ۠ۖۥۦۜۧۘۖۡۥۘۖۙۜۢ۫ۦۧۢۧۤۛۡۚۖۜۚۧۦۚۡۘۥۗۨۘۥۨۤ۠ۛۥۘۜۚۡۢۢۨۗۗۖۘ۠ۨۥۘ۠ۜۘۘ۠۟ۜ۫ۡۜۢۧۘ۬ۛۤۧۧۤۚۗ۟ۚۡۧۘ";
                                                                        case 1992259885:
                                                                            String str11 = "۟ۙ۬ۘۖۘۖۗۧۛۚۡۛۛۚۛ۫ۨۥۙۗۚۦۘۜۥ۫۠ۖۥۘۨۙۖۧۧ۫ۢۜۙۛۦۘۘۚ۫ۜۤۨ۟ۢۡۧۥۥۡۘۨۡۘۢۧ۠ۨۧ۠ۚۛۗۦۘۘۢۡۗ۟ۧۦۘ";
                                                                            while (true) {
                                                                                switch (str11.hashCode() ^ 1812439005) {
                                                                                    case -1864487102:
                                                                                        str10 = "ۗۖۜۜۧۖۙۢۨۘ۬ۤ۟ۥۜۛ۫ۢۥۡۜ۫ۘۥ۠ۨ۬ۦۘۥۗ۫ۢۜۚۚۜۦۧۥۡۙۛۨۘ۬۬ۗۡ۟۬ۗ۬۟۬۫ۘۘۢ۠ۖۘۘۥۧ۬ۡ۬۠ۡۘۙۛۗۡۜ۫ۙ";
                                                                                        break;
                                                                                    case -1703757203:
                                                                                        str11 = "ۥ۫ۡۙۥۖۙۜۗ۬ۧۘۦۙۧۦ۫ۦۘ۟ۦۢۜۙۤ۠ۖۨۜۢۖ۠ۢۢۘۥۧۘۛۦۗۧۨۡ۬ۧ۫۟۟ۥۖۜۘۚۙ۫ۜۧ۟ۛۖۗۨ۠ۙۖ۠ۛۡ۫ۨ۬ۙۗۢۖۢۜۙۥۙ۟۬ۛۜۨۘۘۢۨۙ۬ۧۥۧ۠ۜۥ۠ۘۘۥۜۦۖۥۢۦۦۘۤۚۘۘۖۥۥ۫ۥۥۘۨۖ۬ۡۡۖۜۖ۬ۖۨۥۜۖۧۚۢ";
                                                                                    case -1436615316:
                                                                                        str10 = "۠۬۫ۗۢۤۧۗۦۧۥ۠ۧۗۜۡۖۤۙۤۡۛ۫ۚ۫ۙۡ۠ۖۘۚۧۨۘۖۘۡۘ۬ۚۥۘۛۦۦ۫ۥۨ۠ۨۧۨۜ۫ۢۗ۫ۨۧۦۘۘۢۧۧ۫ۡ۫ۛۢۜۘۧۘ۫ۚۗۡۥۘ";
                                                                                        break;
                                                                                    case 297879317:
                                                                                        String str12 = "ۧۤۗۧۡۤۘۡۧۘۨۗۖۘۜ۬ۥ۫ۨۤۢۙۘۡۜۡۙ۟ۡ۟۠ۖۘۗۗ۟ۧۧۘۚۧۨۖۚۨ۟۠ۜۙۙ۬ۢۜۦۖ۟ۡۘۨۘۘۘۘۙۚۨۘۚۙۤۘۘۗۛۢۢۘۘ۫ۚۡۘۧ۫ۤۘ۠۫ۚۨۜۘ۠ۙ۫۟ۢ";
                                                                                        while (true) {
                                                                                            switch (str12.hashCode() ^ 1128510260) {
                                                                                                case -2025077899:
                                                                                                    str11 = "ۤۢۙۧۜۡۘۗۦۥۡۖۦۙۚۦۥۨۧۤۚۡۘۖۖ۫۬ۚ۬ۧ۠ۧ۠ۡ۟ۧ۬ۗۡۧۥۘۦۥۛ۬۟ۖۘۙ۫ۥۘۧۤۥۘۦۢۘۦۗۡۘۢۘ۫۠ۤۘ۠ۦ۟ۖ۠۬ۙۧۢۜۧۦۘ";
                                                                                                    break;
                                                                                                case -1896010807:
                                                                                                    str11 = "ۦۛۜۘۤۡۦۘۖۘۚۧۛ۬ۜ۠ۙ۫ۖۡۛ۟ۖ۬۟ۨۤۘ۠ۦۥۖۘۚۥۤۥۚۘۨۙ۫ۘۧۘ۟۫۬ۙۘۛۧۥۙۙۖۙۜ۠ۡۘۢۗۦۘۦ۬ۡۗۘۙۧ۠ۘۘۖۧۤۨ۠ۤ";
                                                                                                    break;
                                                                                                case 594084785:
                                                                                                    str12 = charSequence != null ? "ۚۦۢۖۖ۫ۚۤۡۘۨۚ۟۫ۤۡ۟ۦۘۢۛۚ۫ۤۥۢۘۘۢۖۨۙۢۙ۫ۥ۬ۧۤۢۘ۟ۛۡ۟ۡۤ۠ۦۘۨۥۚۙۛۗ۟ۖۦۘ۬ۖۦۘۧۙۖۘۖۦۘۘۙۤ۬ۢۗ۠ۗۘ۟" : "ۚۦۦۘ۫ۛۜۘۡ۟ۛۙ۫ۘۧۘۥۧ۬ۗۛۘۡۤ۠ۥۘۥ۫ۙۥۙۧۧۖۥۘۗۛۜۘۗۗ۟ۖۜۢۦۡۚۧ۟ۖ۬۫ۘۘۚۥ۟ۨۥۨۧۡۡۘۤ۫ۙۦ۬۟۬ۢ۫ۧۡ۫ۛۛۡۘۥ۬ۤۡۜۘۘۤ۟ۡۚۘۢۛ۫ۦ";
                                                                                                case 683081604:
                                                                                                    str12 = "ۦۜ۬ۤ۫ۚۜ۠ۧ۬ۧۜۘۜۡ۫۬ۢۡۘۖۤۘۛۚۦ۠۬ۘۜۧۘۢۘۖۚ۟ۥۜۡۧ۠ۚ۫ۥۖ۠ۛۤۖۘۘۥۛۖۦۘۛۚۡۥۘۧۢۤ۬ۙۗۤۗۧ۫۟ۨ۬ۤۚ";
                                                                                            }
                                                                                        }
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
                                                case 408257377:
                                                    str8 = "۟۫ۖۦۖۦ۠۬ۦۘۛۙۡۘۢۦۦۘۘۡۥۘۛۨۡۙۤۨۦۧۦ۟ۢۢۖۘ۟ۧۜۘ۬ۡۥ۠ۨۨۨۢۧ۫۬ۛ۫ۢۢۘۡۥۥ۫ۧۙۖۖۛۙۨۥۜ۟ۤ۟۫ۢۡۖ۟ۘۧۢۛۢۢۨۡۘ۫ۦۥۘۨ۟ۦ۠ۧۥ۬ۦۦۘۖ۠ۡۤۤۖۘۦ۠۟ۘۤ۠";
                                                case 683901077:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 200116029:
                                        str2 = "ۨ۠ۖۜۗۗۚ۠ۦۘۙ۫ۙۜۙ۬ۖۧۨۛ۫ۨۘۦ۫۠ۤۜۜۤۙۡۜۧۡۘ۠ۨۙۙ۠ۚۧۦۘۤ۠ۡۘ۟ۢۘۘۖ۟۟ۛۥ۟ۨۨۙ۬ۛ۫۠ۜ۠ۨۘۦۢۘ۬ۚۘۘۗ";
                                        continue;
                                    case 205383027:
                                        return;
                                    case 658930454:
                                        this.val$textPassword.setText(charSequence.toString().trim());
                                        str2 = "ۜۨ۟ۤۢ۬۟ۘۖۘۖۦۥۚۛۘۘۧۘ۬ۤۥۤۙ۠ۡۥ۬ۖۘۗۖۗ۬ۧۘۢۢۛ۟۬ۘۗۧۨۘۧۦۚۛۖۛۥ۫ۤ۠ۤۘۘ۠ۧ۟ۛۜۥۡۖۘۥۘ۟ۨۙۘۘۖۧۦۙ۫ۗۚۛۧۛ۫ۖۘۧ۟ۡۜۢ۬ۙۚۘ";
                                        continue;
                                    case 2140570111:
                                        String str13 = "ۜۖۜۘ۟ۘۙۛۛۡۘۗ۫ۥۘۨۨ۟ۙۛۦ۫ۢۡۤۤ۬ۗۤۜۘۧۢۡۘۥۢۙۘۚۜۘۗۗۦۘۙۤۗۨۤۡۘۘۚۖ۠ۢۤ۟ۜۖۘۚۢۖۛۜ۟ۜۖۧۢ۬ۢۨۖۨۙۦۗۛۢۚ";
                                        while (true) {
                                            switch (str13.hashCode() ^ 228702509) {
                                                case -2129724820:
                                                    str2 = "ۛ۠۟۠ۤۦ۬ۜۜۚۡۧ۠ۜۢۙۛۢۡۛۘۘ۟ۗ۟ۡۚۢۤ۟ۦۜۡ۬ۖ۠ۗ۫ۢۡۘۖۛ۫۟ۚ۬ۥۧ۬ۜ۬ۘ۫۫ۘ۫۬ۨۘۤ۬ۚۤۘۗۗۡۢۧۤۢۡ۫ۦۛ۠ۧۨۗۙۖ۫ۤۢۥۘۖۢۤۜ۬ۦۘۢ۠ۘ۬ۨۙۦۥۘ۠ۥۖۘ۟ۥۘۘۚۖۡۨۖۖ۟ۘۜۘۨ۠ۜۘۨۥۥۘ";
                                                    continue;
                                                case -429790573:
                                                    break;
                                                case 73731902:
                                                    str13 = "ۗۖۘۘۙۘۛۡ۫ۚۥ۠ۡۘۧۙ۟ۨۛۨۘۥۦۘۘۦۘۨۢ۠ۨۘۨۜۖۘۗ۫۠ۚ۫ۖۘ۬ۚۖ۫ۙۤۤۛۜۡۡۦ۬۫ۛۜۡۘۖۦۡۙۗۦۘۖۜ۠ۚۗۥۧ۬ۖۗۖۡۦۙۨۖۢۚۗۥ۬ۚۗۚۜۙۥ۫ۙۖ";
                                                case 837538035:
                                                    String str14 = "ۦۙۚۙ۬ۛۘۖۡۜۘ۬ۗۡۦۛۜۤۗۗ۟ۤ۠ۙۗۡۚۨۨۦۛۤۜۜۦۧۧۧۤۖۘۡۤۘۜ۫ۥۘ۟ۙۢۧ۟ۡۥۛۘۤۧۡۘۨۙۢۢۧۦۦ۫ۖۘۦۦۜۘۚ۠ۥۥۛۧۥۤۦۗۘۛۘۡۖ۬ۙۡۛۥ۬۠ۘۘۜ۠۟ۚۖۖۛ۟ۦۘ";
                                                    while (true) {
                                                        switch (str14.hashCode() ^ (-3621161)) {
                                                            case -557395362:
                                                                String str15 = "ۘۖۖۨۚ۫۠۫ۜۛۗۥۘۘ۠۠۬ۥۚۘۜۢۙۧۜۘۧۖ۠ۗۙۘۥۚۦۘۗۗۡ۬ۚۜۧ۬۟ۧ۬ۡۡۦۨۘۛۗ۟ۗۥۥۡۗ۟۟ۛۥۧ۟۫ۡ۫ۚۡۦ۫۟ۛۥۚ۟ۢۢۤۥۘۡ۟ۤۡۘۧۧۖۜۢۨۘۤ۟ۡۘۨۧ۫۫ۜۡۚۡۘۘۛۥ۬";
                                                                while (true) {
                                                                    switch (str15.hashCode() ^ 1760531431) {
                                                                        case -1423496429:
                                                                            str14 = "ۦۦۦۙۨۜۘۦ۫ۚۘۖۥۤۗۦۥۥۜۘۗ۬ۢۙۜۥۘۧۙۦۘۥۧۧۙۦۨۘ۬ۧ۠ۜۥ۟۟ۡۘۡۧۜۘ۠۫ۗ۟ۗۧۘۨۢۥۘۙۜ۠ۨ۟ۢۥۘۧۗ۟ۢۨۨۚۡۢۗۙۡۚۧ۠۟ۘۘۡۛۤۙۚۦ۠۠ۥۢۡۛ۟۬ۨۦ۬ۧۛۦۘۜۥۗ";
                                                                            break;
                                                                        case -1388597617:
                                                                            String str16 = "ۘۤۜ۫۟ۥۘۢۤۗ۠ۗۘ۠۠ۤۦۨۙ۟ۖۘۢ۠۬۟ۜۙ۟ۜۢۙۜۘۘۚۢۖۢۘۛ۠ۘۙۜۛۤۚۨۜۘۗۧ۬ۦۗ۫ۘۜۨۘۗۖۨ۠ۧۖۘۛۖۦۘۘ۠ۦۘۡ۬ۢۢۤ۬ۦ۬ۖۘۨۖۦۘۜۦۤۙۧۚ۬ۧۗ۠ۥ۠ۥۦ۟ۢ۟ۛۢۨۘۦ۫ۡ";
                                                                            while (true) {
                                                                                switch (str16.hashCode() ^ 1324291445) {
                                                                                    case -1841619672:
                                                                                        str15 = "ۧۧۙ۬۬ۖۘۥۢۙۖۥۨۚۡۘۥۙۢۤ۬ۨۗ۬ۙۛ۬ۥۘ۠۫ۨۧۘۢۥۢۧ۫ۦۘۚۦۤ۫ۗۦۘۢ۬ۛۨۡ۬ۖۘ۠۫ۨۧ۟ۖۘۦۗۘۘۡۦۥۡۥۦۙ۬ۚ۬ۤ۟";
                                                                                        break;
                                                                                    case -353897060:
                                                                                        String str17 = "۫ۙۤۛۡۙۜۙۥۥۛۖۦ۫۟ۗۗ۟ۙ۫ۡ۠ۧۢۦۘۜۢۙۦۘۗۘۥۘۧۚۦۘۧۘۜۘۛۚۦۘۤۢۘ۬ۨۘۢۡۚۡۦۤۦۖۥۘۘۘۧۚۤ۬ۖ۬۫ۛ۫ۙۥۗ۬ۤۡۘ۫ۗۛۤۦۛۡۥۨۗۤ۠ۜۦۧۘۛ۟ۛۙۖۗۦ۠ۨۥۦ۬۬۠ۜ";
                                                                                        while (true) {
                                                                                            switch (str17.hashCode() ^ 1669332832) {
                                                                                                case -2037817038:
                                                                                                    str16 = "ۖۤ۠۠ۖۛۢۡۛۛ۬ۘۘۖۦۘۘۙۗۧۜۧۙۜ۟ۗۖۤۨ۠ۜۖۘۤۤۜۘۥ۟ۘۘۢ۟۬ۛۗ۠ۢ۠ۤۜۘۛۘۨۘۨۖۘۨ۠ۥۘۧۖۡۤۡۗ۫ۢ۟۬ۤۥۘۦۛ۫ۖۗ۬۬۬ۘۥۚۚۜۜۜۘۙۨ۬ۧ۬۠ۗۡۦۘ۬ۤۦۙۖۨۨۗۘۘۥ۫ۜ";
                                                                                                    break;
                                                                                                case -1676108319:
                                                                                                    str16 = "ۜۗۡۘۚۚۦۘۨۢۨۘۘ۠۠۬ۜۘۤۧۥ۟ۨۦۘ۠۠ۜۘ۬ۨ۫۬ۦۡۙۙۡۘۡۦ۫ۚۥۢۤۛۘۘ۠ۥ۟ۚۜ۫۠ۗۤ۬ۡۦۘۖ۟ۘ۟ۚۢۢۖۙ۟۫۟ۨۦۗۦۗۜۘۘۥ۬ۧۢۥ۬ۦ۠۬ۥۧۘ۬۫۬ۦۖۚۖۢۘۚۢ۠ۥ۠ۨۘۜۖۥۘۜۤۜۘ";
                                                                                                    break;
                                                                                                case 713440520:
                                                                                                    str17 = "ۗۦۧۘۚۜۛۡۦۦۘ۟ۧۥۘۢ۠ۗۖ۬ۧۤۘۜۜۢۥۖۡۜ۟ۥۦۘۦۛۖۘ۠ۚۦۢۙۚۤۢۙۤ۠ۤ۟۬۬۫۬۫ۛۘۤۥۚۦۥ۟ۨۖۖۡ۬۬۠۫۠ۖۘۗۦۧۙۦۧۘ۟ۜۧۘۥ۬ۙۘۚ۬۟ۧۥۘۡ۟ۖۘ";
                                                                                                case 881397367:
                                                                                                    str17 = clipboardManager.hasPrimaryClip() ? "ۡۚۥۤۜۜۚۤۦۗۨ۟ۡۤۧۤۢ۫ۗۡ۫ۤ۫۫ۜۧۘ۟ۦۤۗۡۨۖ۟ۡۘۧۤۦۘۙۙۢ۟ۙۖۛ۬ۤۗ۫ۛۛ۬ۘۘۚ۬ۘۘۜۡ۬۬ۚۘۘۙۢۙۚۦۚۚۛۥۘۜ۬۬ۙۤۖۚ۟ۖۙ۬۟ۨۗۙ۟ۥۦ۬ۡۡۘۡۨۜۘۖۧۦۧۤۙۢۚۡۗۤۦ۠ۥۖۜۢۜۢ" : "ۘۨ۬ۖۥۦۧۥۗۡۤۨۘۜۗ۟۟ۧۦۘۙۨۦ۫ۚۡۤۖۘۛۘۘۖۦۦ۫ۢ۠ۦ۟ۦۘۚۖۜۨ۠ۜۘۦۜۗۡۡۥۘۗۚۗۚۧۤ۠ۜۥۗۥۛۖ۫۠ۚۤ۠ۢۚ۟ۦ۟ۦۢ۠ۘۘۙۚۡۖۤۡۘ۠ۦۘۛۖۧۘ۬ۗ۠ۢ۠ۥۚۤۖ۟ۜۡۜۥۡۘۛۧۖۡۗۡۛ۟ۚۖۡۦ۫ۦۖ";
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case -292525777:
                                                                                        str15 = "ۨۗۖۘۨ۠ۥۘۙۤۥۘۨۗۜۜ۠۬ۘ۟۫ۜۨۖۘۢۖۜۘۦۛۙۦ۟ۗۧ۠ۡ۬۫ۡۘۡۚۡۘۛۜۡۦۖۖۘۖۘۘۙۖ۠۬۟ۥ۬ۦۡۘۙۜۦۧۙۖۘۜۚۨۖۥۙ۬ۜۜۜ۬ۨ";
                                                                                        break;
                                                                                    case 1588179518:
                                                                                        str16 = "ۡۙۖۘۧۗ۠ۛ۫ۚۖ۬۬ۢ۫۟ۖ۟۬ۦۚۖۘۘ۟ۦۘ۬ۦۡ۫۟ۚۦ۠ۥۙۙ۠ۚۚۛۖۘ۫ۗۖۨۡۙۡۜۧۨۖۜۘۗ۬۫ۢۖ۬ۤۧۡۘۤۦۥۘ۟ۡۡۖ۠۫ۙۙۖۘۛ۟ۤۜۢۘ۟ۜۘۤ۟ۜۢۧۥۘ";
                                                                                }
                                                                            }
                                                                            break;
                                                                        case -1225489372:
                                                                            str14 = "۠ۤۦۘۢۦۧۘۡۥۥۘۖۢۥ۠ۧۙۛۦ۟ۦۡ۫ۛۨ۠ۛۛۘۡۨۜۘۚۛۨ۬ۡ۫ۙۨۥۘۢۚۦۙۥۡۘ۠ۧۡۛۡۘۜۧ۫ۛۘۢۚۘ۠ۗۢۡۜۨۘۤ۬ۗۤۛۨۡۤۢ";
                                                                            break;
                                                                        case 792136351:
                                                                            str15 = "ۥۛۧۘۚ۟ۤۧۛۨۢۧۢۤۤۖۦۖۘۤ۫۬ۛۧ۫ۖۚۖۢ۠ۧۡۤۡۥۜ۬ۘ۫ۦۘ۫۟ۜۧۢۥۤۢۥۘۗۤ۠ۙۡۤ۬۠۫ۘ۫۫ۛ۟ۛۘۨۜۨۗۘۘۥۥۤۢۜ۫ۙۦۜۛۚۚۖۦۘۨۥۘۜۖۢۖۘۦۙ۠ۜۢۥۨۡ۫۟ۖۛۗۜۜۚۥ۟ۘۥ۠ۘۘۜۜۘ";
                                                                    }
                                                                }
                                                                break;
                                                            case 118193128:
                                                                str13 = "۬ۙۚۢۡۨۘۙۜۘۘۙۥۘۘۢ۬ۙۡ۬ۦۚۘۥۘۛۗ۬ۘ۟ۙۛۘۦۘۙۖۤۡ۫۟۫ۘۘۘۦ۠ۨ۬ۜۡۘ۬ۥۙۛ۬ۡۛۜۧ۟۟ۖۛ۟ۡۘ۠ۦۦۘۨ۠ۥۘ۟ۘۗ۠ۘۨۚۛۛ۟ۘۖ۠ۜۖۖۚۡۘ۫۫ۨۖۗ۫۟ۙۨۜ۬ۨۢۚۧۦۨۚۖۘۦ۠۬ۡۗۖۘۛۨ۫ۤۘۘ۟ۥۘۘ";
                                                                break;
                                                            case 944369926:
                                                                str13 = "ۖۙۦۘۥ۬ۘۧۛۡۜۧۙۖۘۖۖۨۘۘۢۚۤۜ۟ۜۘۨۖۛۘۖ۟ۚ۟ۥ۟ۘۧۘ۟ۘۜۘ۬۬۟ۡۡۚۙۜۘ۠ۜ۬ۢ۟ۘۘۙۡۜۘۢۦۜۙۡۢۦۗۦۜ۬۬۟ۨۧۘۨ۠ۥۘ۠۠ۙۢۗۙۛۢۖۤۙ۬ۖۨۙۜ۫ۚ۠ۥۨ۬ۦۛ۟ۡۡۢۙ";
                                                                break;
                                                            case 2028958900:
                                                                str14 = "ۡۦ۫ۨۧۢ۬۟ۗ۠ۤۜۦۨۧۘۚۤۢۖۚۢۚۡۖۚ۫ۛۜ۫ۘۙ۠ۡۘ۟ۨۦ۟ۥۘۛۙۘۘۚۜۧۘۥۖۨۘۥۡۚۡۦۨۘ۬ۢۥۘۡۡۤۥۥۧۘۨۜ۫۬ۜ۟ۧ۬ۢۗۢ۟۬ۡۨۢ۟ۡۜۜۜۘ۬ۖ۠ۦ۠ۘ۬ۖۦۗۥۤۘۦۧۚ۫ۨۘ۬۬ۚۦۤۜ۬۠ۚ۫ۜۡۘۥۚۦۘۥ۟";
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                }
                                str2 = "ۜۨ۟ۤۢ۬۟ۘۖۘۖۦۥۚۛۘۘۧۘ۬ۤۥۤۙ۠ۡۥ۬ۖۘۗۖۗ۬ۧۘۢۢۛ۟۬ۘۗۧۨۘۧۦۚۛۖۛۥ۫ۤ۠ۤۘۘ۠ۧ۟ۛۜۥۡۖۘۥۘ۟ۨۙۘۘۖۧۦۙ۫ۗۚۛۧۛ۫ۖۘۧ۟ۡۜۢ۬ۙۚۘ";
                            }
                        }
                    });
                    str = "ۡۥۦۘۘ۟ۘۥۢۨۘ۬ۘۘۘۚۗۖۨۖ۫ۢۚ۠۫۬۬ۨۡ۬ۥۘۢۥۨۥۥۘۡۨۘۘۖۖۦ۠ۘۙۨۥۨۨۦۜۚۗۦۘۘۙ۫ۤۘۥۘ۠ۘۜۛ۫ۨۚۜۨۗۚ۠ۗ۟ۜۛۤ۠۫ۤۜۥۘۛۢۜۘۗ۬ۚۚۖ۫۠ۚۛۚۨ۠ۚ۬ۥۘۧ۫ۖ";
                    break;
                case -1274892448:
                    return;
                case -1081073469:
                    Kooontoool = true;
                    str = "ۙۡۜۘ۟ۛ۠ۖۢۘۘ۫۟ۚۜۘۚۛ۠ۡۘۗۘۥۘۨۙۜۘۧۦۘۚۙۜۢۚۡ۠۬ۜۛۜۖۘ۫ۗ۟ۨۡ۬ۘۘ۠ۢۜۘۨۘۨۥۨ۬ۧۢ۫ۢۘ۫ۦۚ۫ۗۥۥۚ۬ۦۘۤۤۖۘۙۚۨۘ۟ۙۡۖۡۦۘۜ۟ۡۘۘۢۖ";
                    break;
                case -740670905:
                    str = "ۛۘۜ۫۠ۙۧۡۧۜۦۧۘۚ۟ۨۡ۠ۘۤ۠ۧ۬ۙۗۥۥۧۘۛۥۧۥۚ۬ۘۡ۟ۡۛۤ۫ۜۘۡۡۦۘۥ۬۟ۧۚۥ۫ۖ۬ۥۡۨۚۡۗۚۧ۬۟ۧۤۢۤۡۘۤ۠ۤ۬ۥ۬۫ۘۡۘ۠۫ۘۘۦۘۚۗۖ۫۠۠ۥۘۘۖۤۚ۟ۘۘ۠۫ۖۘ۫ۗۛۧۧۙ";
                    materialButton = (MaterialButton) findViewById(C0931R.C0934id.id010c);
                    break;
                case -721723031:
                    str = "ۚۤ۟ۗۚ۠ۖۨۥۜۢۛ۠ۖۘ۟ۜ۠ۘۤۘۧۖۜۘۢۖۜۡۙۖۦۜۜ۬ۧۢۘۜۘۦۖۦۘۨ۟ۡۘ۬ۜۡۡۘ۬ۦۖۜۤۙۢ۫ۧۚ۫ۨ۬ۤۘۨۦۦۨۙۧۤۨ۠ۥۘ۟ۥۦۨۛۢۧۧ۟ۛۙۚۚ۟ۛ۟۬ۨ۫ۧۜ۫ۗۦۧۤۥ۬ۘ۠ۨۙۜۘۗۥ۠ۛ۠ۜۘۢۙ۫ۨ۠ۛ";
                    textInputLayout = (TextInputLayout) findViewById(C0931R.C0934id.id00c0);
                    break;
                case -65744378:
                    str = "ۖۙ۟ۥۥۦۘۨۢ۬۟ۦۜۘۙ۠ۥۘ۟ۨۤۖۥۨۙۤۨ۫۫ۢۢۦۡۤۖۡۘۥۦۡۘۖۦۜۨۧۖۘۜۘۥۗۥۡۘۡ۫ۜۙ۟۟ۗۤۥ۫۟ۢۢۨۡۘ۠ۗۖ۟ۡۖۜ۠ۘۘۨۚۧۜ۫۫ۖۙۘۘۘۥۤۥۖۗ۫ۥۤۥۡۡۘۡۘۧۘۨۙۦۘۨۤۥۘۥۧۘۘۤۢۥۘۤۘۨ۟ۙۚۡ۟ۘۨۥۘ";
                    break;
                case 133996329:
                    str = "ۢۨۘۘ۠ۘۜۘۗ۟ۚۚۛۖۘۗۖۥۘۜۡۧۢۜۘ۬ۥۧۦۚۨۡۦۥۘۨۤۢۙۖۙۨۜۘۘ۬۠ۥۘۘۖۗۦۥۘۨ۟ۘۘۘۜۘۘۦۦۙۦۘۨۘۙ۬۫ۢ۬ۛۘۡ۠ۖۢۛۙۢۥۘۦۗۛۦۘۗۨۘۚۧۤ۠۠ۢۖۛ۟ۡ۟ۨۦۨۥۘ۬ۙۥۙ۠ۡۘ";
                    textInputEditText = (TextInputEditText) findViewById(C0931R.C0934id.textPassword);
                    break;
                case 499719249:
                    this.prefs = getSharedPreferences(Deobfuscator$$app.getString(-3440729061929606985L), 0);
                    str = "ۦۘۛۛۗۜۨۛۖۦۙ۟۫ۧۤۜۧۥۗۧۧ۫ۗۧۛۚۧ۫ۤۗۡۦۧۘۘۢ۠ۥۢ۫ۦۙۛۦۙۘ۟۫ۛۢۛۡ۟ۙۖۘۥۙۜۛۤ۟ۨۙۜۘۧۙۛۘۢۚۛۙۦۨۛۖۘۥ۫ۖۧۨۡۘۜ۬ۘۘۡ۫ۜۥۙۚ۟۫ۙ۬ۗۗ۟ۥۨۘۜۢۢ۠ۙۛۛ۟ۡۘ۟ۗۨۚۥۘ۠ۧۢۥۡۤۚ۬ۜۘۘۚ۬ۗۘۜۡۢۛۦۧۨۘ";
                    break;
                case 657645870:
                    setModeSelect(Deobfuscator$$app.getString(-3440729010389999433L));
                    str = "ۛۚۜۖۚۨۦۗۤۧۢۖ۫ۧۛۦۥ۠ۘۧۜۦۘۡۘۢۦۗۧۡۘۘۛۥۢۜۧۦۨ۬ۥۘۙۢۘۚۘۢۚ۬۠ۛۚ۟ۙ۫ۥۘۗ۟ۘۘۤۙۡۘۧۘ۬ۜ۫ۡۚۢۦۘ۟ۡۖۜۡ۟ۙۗۗۜ۫ۖ۠ۤۚۗۨ۟ۢ۠ۦۧۚۥۙۦۚۨۨۦۘۡۤۚۨ۠۠ۦۗ۟۬ۡۙۛ۫ۖۗۧ۫ۛۛ۟ۥۚۦۧۥۡ۫ۧۥۘۢۢ۬ۖۜۦ";
                    break;
                case 722406071:
                    materialButton.setOnClickListener(new View$OnClickListenerC09372(this, textInputEditText, this));
                    str = "ۗ۫ۥۘ۬۠ۖۘۛۤۨۜۦۙۗ۬ۥۚۡۜۢۤۘۘۤۜ۠ۖۙۤۛۚۨۘۜۜۨ۠ۚۘۛۡۥۗۜۖۘۚۚۘۧۘۡۚ۫ۜۘۗۘۛۧۦۡۘۥۡۥۘۜۗ۬ۦۦۥۚۙۚۧۤۙۨۦۡۘ۫ۨۜۡۦۜ۠ۙۥۘۤۨۧۘ۠ۘۜ";
                    break;
                case 905543059:
                    materialButton.setEnabled(false);
                    str = "ۙۙۖۘۧۜۖۘ۟ۥۨۗۛۨۘۙۜۥۘۧ۟ۗۥۗۡ۬ۡۘۙۖۡۘۜ۟ۡۖۢ۟ۧۖۘۥۨۗۙۖۗۚۚ۬ۗۨ۬ۗۛۙۥۤ۬ۡۜۥۤۖۧ۫ۦۘۗۧۧۚۢۘۥۨ۟ۚۤۧۜۥۤۘۥۛ۫ۦۢۘ۠ۘۖۖ۫ۥۤۜۘ۠ۛۙۦۘۡۙۦۘۦۨ۬ۚۘۖۘۘۦۧۡۧۦۘۥۜۥۛۢۙۗۦۛ۠۟۟ۗ۟ۡۤۡۛۜۢ";
                    break;
                case 2109777208:
                    textInputEditText.setText(this.prefs.getString(Deobfuscator$$app.getString(-3440728967440326473L), Deobfuscator$$app.getString(-3440729220843396937L)));
                    str = "۠ۨ۫۬ۦ۬ۥۗ۟ۗۘۤ۫ۧۡۤۧۨۜ۟ۥۦۦۢۙ۫ۖ۠۫ۦۖۗۛ۟ۚۜۦ۟ۛۧۥ۫ۚۢۦۥۦۘۖۛۘ۟ۗ۟ۗ۫ۦ۫ۜۗ۟ۜ۠ۖ۠ۗ۟۫ۘ۠ۢۙۧۨۧۘ۠ۢۢۥۡۜۖۨۥۘۢۨ۬۟ۖ۬۟۫ۖۡۗۧۘۘ۬۟۠ۘ";
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$showUpdateDialog$0$kentos-loader-activity-LoginActivity  reason: not valid java name */
    public /* synthetic */ void m247lambda$showUpdateDialog$0$kentosloaderactivityLoginActivity(DialogInterface dialogInterface, int i) {
        Intent intent = null;
        String str = "ۖۙۗۧۤۡۘۧۧۨۦۡۜۙۛۢۢ۫ۜۘۜۧ۬ۜۗ۬ۜۛۖ۫۫ۜ۬۟ۖ۬ۨۖۘۖۘۡۚۥۜۘ۬ۢ۬ۗۚ۬۠ۨۖۥۘۙۢۖۥۛۙۡ۠ۦۦۡۜۙۧۨۙ۟ۘ۠۬۟ۦۘ۟ۤۗۧۛۨۜۖۜۤ۟ۨۗ۟ۖۘ۬ۘۨۘۤ۬ۗۛۧ۬ۧۛۧۨۦۛ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 363) ^ 160) ^ 225) ^ 876) ^ 642) ^ 612) ^ 715) ^ 187) ^ 810) ^ 886) ^ 938) ^ 525) ^ 595) ^ 781) ^ 653) ^ 303) ^ 695) ^ 361) ^ 35) ^ 985) ^ 367) ^ 452) ^ 564) ^ 900) ^ 853) ^ 178) ^ 16) ^ 765) ^ 947) ^ 204) ^ 912) ^ (-1732668297)) {
                case -1440813997:
                    str = "ۖۘ۬۬ۖ۟ۙۦۘۚ۬ۡۡۚ۫۬ۚۙۥۜۢۜۘۘ۟۟ۥۙۖ۠ۤۨۛ۫ۨۦۜ۟۬ۡ۬ۙۙۨ۟ۥۜۡۨۚۡۦۛۘۗ۬ۘۘۥۨ۫ۛۙ۟۟ۖۤۦۦۡۘۨۘۖۘۢۗۖۘۛۥۦ۫ۢ۫۬ۙۗۡ۫ۡۥۦۜۘ۟ۧۙۜۛ۟ۚۚ۟ۧۥۧۘۧۦ۬";
                    break;
                case -1280966423:
                    str = "ۙۘۘۧۜۥۘۢۢۨ۠ۧ۫ۨ۠ۙۡۜ۟ۜۦۡۘۨۨ۫ۤۧۖۘۧۛۛ۟ۙۚۧ۟ۖۘۢۚۖۚۗۖۘ۠۠ۙۙۤۢۙ۫ۜۘ۫ۨۤۨۚۡۘۧ۬ۤۜۘۘۘۘۧۜۥ۠ۡۙۖۢۨۧۜ۬۬ۜۘۥۙ۫ۨ۫۟۫ۨۨۘۢۤۗۗۙ۫ۚ۬ۤۡۗۘ۠ۛ۬ۧۢ۠ۥۖۥۘ۬ۖۗ۠ۛۗۡۤۥۘۧ۬ۖ۬ۜۚۧۨۦۦۥۘۘۥۘۖۘ۠";
                    break;
                case -1271682968:
                    intent = new Intent(Deobfuscator$$app.getString(-3440728821411438409L));
                    str = "۠ۜۖۚۤۖۘۨۗۥۘۖۜۢۧۢۛۖۡۙۘۧۜۙ۬ۛۧۘۖ۫ۤۤۗۧۖۘۥۙۢۢۡۜۨۘۜۘۢ۬ۚۥۘۥ۬ۗۜ۫ۖۘۛۧ۟۬ۨۡۘ۫ۚ۬۟ۛۥ۫۟۠ۥۘۧۘۙۛۥۥۜۨۘۤ۟ۗۗ۫ۢ۟ۙۨۘۗۜۦۗۥۧۜۗ۟ۘ۫ۛۧ۬ۧۦۡ۫ۘۦۖۘ۟ۢۢ۟ۜۙۚۚۡۘۙ۟ۡۚۗ۫ۚ۫۟ۨ۬ۦۘ۟۬";
                    break;
                case 1045167820:
                    intent.setData(Uri.parse(ApiServer.getOwner()));
                    str = "ۦ۫ۨ۬۠ۜۘ۟۬ۚۨۧۢۜۤۥۚ۬ۡۘۦ۫ۜۧۜۘۛۦۧۗۚۥۘۧۤۢ۠ۖ۠ۚۨ۫ۚۤۢۦۖۧ۟ۥۗ۠۫ۥۘۜۤۜ۟ۚۛۧۚۨۘۗۙۚ۫ۦۥۘۘۜۖۘ۬۠ۜۨۧۖۜۦۡۙ۠ۦۙۗۨۡۥۥۛ۫ۘۖۛۤۗۛۦۜ۟۫ۢۥ۬ۦ۠";
                    break;
                case 1499529698:
                    return;
                case 1978325830:
                    startActivity(intent);
                    str = "ۚۙۗۛۖۧۘ۬ۖ۟ۨۧۜۦۘ۬ۖۤۘ۟ۥۛۖۘۘۥ۟ۢۜ۠ۚۨ۠ۡۖۨۥۘۘۗۖۖۡ۟۫ۡۗۘۥۗۙ۫ۜۘۨۛ۫۫۫ۚۘۨۥۘ۠۫ۡ۠ۡۛۦۘۜۦۘۘۜۗۢ۫ۙۗۗۙۡۧۙ۬ۚۙۧۗۨۧ۠۫ۨۘۗۙۘ۫ۡۖۘۛۧۖۘۨۨ۬ۚۚ۠ۗۚۜۘۧۤۧۨۗۨۛۧۨۘ";
                    break;
                case 2095906945:
                    str = "ۖۛۖۘۚ۫ۤۜ۫۬ۗۚ۬ۤۥۖۖۛۗ۫۟ۚۜ۠ۥ۟ۨۖۡۤۛۖ۟۫۫ۚۜ۬ۨۘۥۥ۟ۛۗ۟ۥ۠ۘ۬ۦ۫ۖۧۚۧۗۖۡۘۥۗ۠ۤۜۧۘۦۦۚۤۢ۠ۦۦۦۘۜۖۥۘۢۡ۟ۤۥ۠ۦۚۧۘۗ۠";
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kentos.loader.utils.ActivityCompat, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str = "ۚۨۜۚۗۛۡ۫ۘۘۗۨ۬۬ۖۚ۫ۗۜۘ۬ۦۛۚۙۢۨۗۘۘۜۖۤۗ۟۟ۥۘۥۘۖۧۢۘۡۗۘ۬ۦۘۤۜۘۘۜۙۜۘۥۤ۠ۘۦ۠ۦۡۤۢۤۘۗ۠ۨۗۢۥۘۛ۠ۘۘۧۚۨۢۦۚۖۨ۟ۖ۬ۚۗۗۖۥۢۖۜۜ۟ۜۗۜۚۙۘۘۗۦۨۘۨۦۚ";
        while (true) {
            switch ((((((((((((((((((((((((((((((((str.hashCode() ^ 155) ^ 732) ^ 499) ^ 230) ^ 7) ^ 753) ^ 720) ^ 428) ^ 831) ^ 174) ^ 110) ^ StatusLine.HTTP_TEMP_REDIRECT) ^ 103) ^ 340) ^ 183) ^ 672) ^ 525) ^ 785) ^ 33) ^ 980) ^ 968) ^ 571) ^ 216) ^ 837) ^ 797) ^ 479) ^ 485) ^ 689) ^ 272) ^ 41) ^ 279) ^ 972077587) {
                case -1641752410:
                    String str2 = "ۢۘۤۙۖ۠ۡۛۜۘۜۧۡۜۖۨۨۛۦ۬۟ۛۡۨۛۗۡۢۙۚۨۘۦۨۤۚۛۥۤۖ۟ۙۥۡۘ۬ۚۡۢۥۘۖۚۥۖ۟۠ۜۥۦ۟۠ۜ۟۫ۗۤ۟۬ۦۨۜۘ۟ۘۚ۫ۙ۫";
                    while (true) {
                        switch (str2.hashCode() ^ 2110049306) {
                            case -1920036343:
                                str = "ۛۨۡۧۥ۠ۨۜ۬۬ۤۘۤۜۘ۬ۜۚۗۛۛ۠ۙۦۨۧۧۚۜۘ۠ۢۨۛۧۘۙۢۥۜ۬ۢۤۖۘۗۧۖۜۜۘۛۙۖۘۦۥۨۢۘۢ۬۟ۖ۬۠ۘۖۤۧۙۢۦۡۧۤۥۖۙۨۥۖۨۗۡۗ۠ۗۖ۠ۦۘ۠ۗۢۡۖ۠ۗ۠ۥۛۡۧۜ۠ۘۘ۟ۛ۠۠ۤۦۘۜۥۦۜ۠ۙ۟ۚۖۘ";
                                continue;
                            case -297717619:
                                String str3 = "ۤ۠۬ۦۡۨۦۘ۬ۛۜۖۘۘ۫ۨۘۧۚ۠ۚۢ۟ۙۢۖ۟ۦۘ۟ۙۥۘۖۚۜۜۢۗۥۤۚ۬ۛۜۧ۬ۦۧۧۡۘ۫ۥ۫ۤۖ۟ۨۦۧۤ۫۫ۚۖۚۢۙۘۗۖۚ۠ۚۛۢ۫";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1892833308)) {
                                        case -1299742128:
                                            str3 = "ۖۜۚۘۢۡۘ۫ۧۨ۫۟ۗۘ۟ۖۘۜ۫ۘۘۚۘۖۘۢۙۤ۟ۧ۫۟ۧۨۗۛۥۨۥۦۘۘۨۜۛۘۢ۟ۚۖۘۦۡۢۦۦ۟ۧۙۖۛۨۗ۫ۨۡۢۜۤ۫ۙۨۜۗ۬۫ۗۛ۟ۗۗۜۨ۟۟ۖۘ۬ۖ۠ۗۤۗ۠ۤۙۡۥۡۗۥۙۚ۠ۧۧۢۜۘۦ۬ۡۘۥ۬۠ۖۙۛۗۡ۬۫ۗ۬ۧۜۘ";
                                        case 192650460:
                                            String str4 = "۫ۡۘۘ۠ۚ۬ۖ۟ۘ۫ۢۥۡۥۥۧ۟ۜۨۡۘ۫ۛ۫۟ۜۛۥ۬ۡۦۛۢ۟ۖۧ۠ۙۘۘ۟ۘۥۘۨۧۘۘۤۘ۟ۨ۬ۗۨۨۖۨۥۨۘۘۚۙۘۘۢۡۙۛۥۜ۫ۢۤۤۗۨۙۗ۠ۚۨۖۧ۫ۜۘۢۘۜۢۨ۫ۨۗۨۘۖۧ۠ۤۜۡۘ۬۫۫۫۫۟";
                                            while (true) {
                                                switch (str4.hashCode() ^ (-657658796)) {
                                                    case 272065984:
                                                        String str5 = "ۦۚۨۜۧۥۘۗۥۖۘۛۚۦۘۚۜۜۚۙ۟۟ۥۖۘ۟ۘۡۨۦۨۧۢۘۘۢۤۛۜۤۙۡۨۢۘۜۢۖۖۘۚ۟ۙۤۤ۬۟ۚۡۤۦۖ۟ۥۥۢۛۡۘ۬ۦ۟ۢۤ۫۟ۨۚۤۛۡۘ";
                                                        while (true) {
                                                            switch (str5.hashCode() ^ (-674899197)) {
                                                                case -1713355783:
                                                                    str4 = "ۛۥۦۘ۠۫۫۠۫ۘۘۚۥۢۘۦۘ۟۟ۦۘۙۤۤ۟۟ۖۧۡ۠ۗ۟ۢۜۖۤۙ۬ۤۗ۬ۦۛۘۤ۬ۤ۠ۛۨۜۢۦۥۦۡۥۘۨۡۨۘ۟ۗۘۥۧۚۤۚۨۘ۫ۤۜۘۨۦۗۧۘۚ";
                                                                    break;
                                                                case -717838151:
                                                                    str4 = "ۨۚۦۛۗۜۘ۬ۢ۟ۡۦۘۗۚۦۨۘۥۥۥۨ۠ۤۛۖۡۤۢۡۗۧۙۖۢۥۜ۟۬ۤ۠ۚۛۖۘۖۨۨۘۚۙۥۙ۠ۤۛۚۘۘۛۡ۬ۥ۠ۘۘۤۧۤ۫ۥۙ۫ۗۦۧۥۛۚۡۚۗۦۧۘۤۢ۟ۛۙۘۤۨ";
                                                                    break;
                                                                case 1106269426:
                                                                    String str6 = "ۙۥۤۙۙۖۡۛۥۡۡۜۘ۟ۨۘۘۤ۬ۗۧۨۨۘۙۤ۠ۡ۠ۘۖۡۘۛۚۗ۫۫ۖۨۚ۠ۚۦۨ۟ۥۘ۟ۢۘۘۥۖۧۖۚۙۤۨۦۘ۫ۦۤۦۗۜۛۨۘۡۦۗۘۢۥۖۘ";
                                                                    while (true) {
                                                                        switch (str6.hashCode() ^ 1108544577) {
                                                                            case -1827924944:
                                                                                str6 = !checkSignature() ? "ۡۛۖۘۨ۬ۧۡۡۜۘۤۖۨۘۧۧۗۡۡ۫ۙۗۖۤ۫ۛۘ۫ۗ۟۟۠ۢۡۥ۟۟ۥ۟ۜۤۡۖۢۚ۫ۚۨۥۖ۟ۢۗۢ۬ۨۙۜۗۛۡۤ۬ۙۥۘۧ۫ۧۚۛۜۘۖۥۘ۟ۨۧۦۜۥۜ۠ۘۢۤۜۦۘ۬ۘۦۘ" : "ۛۧۖۘۧۘۥۖۤۘۘۤۜ۬۟ۨۛۗۘۘۘۙ۫ۘۜۥۤۡۤۚۧۚۢۦۧۖ۠ۥۚۡۡۥۘۜۙۨۘۦۛۖۗۗ۫۬ۙۘۘۥۦۗۨۛۙۧۙۛۡ۬۟ۥۚۡۘۗۢۤۛ۬ۦۚۜۥ";
                                                                            case -960959651:
                                                                                str5 = "ۨۤۤۦ۬۟ۤۜۜۘۥۚۡۘۧۧۨۙۗ۟ۡۜ۠ۖۦۨۘۨۥۜۙۚۡ۠ۚۨۘ۬ۥۦۨۛ۟ۘۖۗۜۡۥۨۚۦۘۧ۬۠ۤۛۘۜۡۧۘۚۛۛۧ۟ۨ۠ۤۡۘۡۗۥۘۛۖۥۤۘۙ۟ۥۨۘۗۛۥۘ۬ۛۡۜۚۖۘۤۦۜۧۧۗۢۥۚ۬۠ۗ۠ۢۦۘۖ۫";
                                                                                break;
                                                                            case 1447938120:
                                                                                str5 = "ۚۘۤ۠ۚۘۘۚ۟ۨۛۤۛۘۡۖۥ۠۟ۚ۫ۥۡۚۨۛۘۘۛۥ۟ۡۨۡۘۚ۟ۘۘ۬ۢۗۤۗ۬ۗۜۡۘۘۜۚۘ۬ۜۘۤۦ۟ۖۨۧۘ۟۟ۡۘۦۘۘۘ۠ۙۖۘ۠ۖ۫ۙ۠ۙۜ۠۬ۨۥۦۧ۠ۦۘۜۦ۫۬۟ۘۥۚ۬";
                                                                                break;
                                                                            case 1755544491:
                                                                                str6 = "ۡۥۙ۬ۥۖۘۘۘۡۘۜۥۙۗۨۜ۫ۖ۫ۜۡۘ۬ۥۥۘۚ۬۫ۥ۫ۢۗۚۤ۬ۗۖۘۖۖۘۖ۫ۘۖۜۥۘ۠ۗۢۗۖۨ۫ۧ۟ۙۗۘۘۡۤۚۚۦۥۖۡۢۖۢۨ۬ۚۥۘۥۥۤۙۢ۬ۧۡ۬ۨۡۦۧۨۘۤۜۗۥۜۥۥۡۙۛۛۖۨۖۧۦۖۘ۠۟ۡ۠ۥۡۘ۫ۘۨۘۛۛۖۡۗۜۘ۠ۛۦۘۤۨۥۘۙۧۨۛۛۗۡۘ";
                                                                        }
                                                                    }
                                                                    break;
                                                                case 1778477493:
                                                                    str5 = "ۢۚ۠ۤۤۤۨ۫ۨۗۦۧۘ۠ۡۤۤۢ۫ۦۘۜۙۙۖۘۙۚۧۛۚۥۦۘۧۘۜۡۜۘۧۛۙۗۦۖ۟ۨۧۢۖۘۡۚۡۧۙ۬ۖۛۥۤ۬ۙ۬۫ۥۜۡۢۥ۬ۚۨۜۘۘۖۨ";
                                                            }
                                                        }
                                                        break;
                                                    case 320852230:
                                                        str3 = "ۦۗۜۡۙۦۤۗۜۤۤۖۤۘۥۚ۟ۙ۟ۡۖۘ۠ۤۖۘۙۚۘۘۨۤۨۡ۠ۧ۟ۦ۟۫ۖۦۦۢ۟ۤۗ۟ۦۡ۫ۢۙۡ۫۠ۙۡۘۜ۬ۤۦۘۤۗۘۛۗۤ۟ۡۨۘۚۧۡۘۢۜ۟ۚ۟ۨ۟ۦۛۦ۫ۘۧۦۘۧۧۙۤۖۘۙۡۛۙۡۧۡۖۜۘۗۙۘ";
                                                        break;
                                                    case 1143112585:
                                                        str3 = "۬ۨ۬ۧ۟ۜۦۦۖۘۙۙۡۘۨۥۧۙۙۜۗۥۦۘۧۙۘۖۘۛ۫ۦۙۘۖۖ۫ۨ۟ۜۤۜۢۚۡ۬ۗ۠ۥۨۘۢۗۜۜ۠ۘۘۚ۟ۘۘۖۡۘۦۨۡۘۦ۟ۢۘ۫۠۫ۚ۠ۘۘۘۡۡ۬ۥۦ۟ۚۤ۟ۚۜۨۘۙۚ۫ۥۥۥۛ۬ۦۘۗۦۖۨۖۙۨۛ۫۟ۗۜ۟ۛۖۖ۟ۙ۬ۖۘ۬ۡۦۘ";
                                                        break;
                                                    case 1745441702:
                                                        str4 = "۫ۖۤ۠ۘۗۥۧ۟۬۬ۤۘۜ۟۬ۡۘۧۙۙ۟ۜۖۘۛۨۘۧۥۘۘۤۘۘ۫ۜ۬ۢۡۘ۫ۦۙ۠ۢۚۜۥۦۘۧۥۖۘۜ۠ۥۨۤۧۤ۫۫ۢۦۛۨۘۥۛۨۙ۟۬ۦ۬ۙۥ";
                                                }
                                            }
                                            break;
                                        case 797678060:
                                            str2 = "ۛۚۜۦۦ۬ۗۡۤۘۢۤۘ۠ۡ۬ۦ۟ۦۗ۬ۢۖۘۧۙۖۘۙ۬ۦ۟ۡۜۘۡۥۥۘۧۢۧۖ۠ۚۖۖۧۡۦ۟۬۠۟ۛۡۤ۟ۢۨۘۥۛۜۘۙ۬ۦۚۛۦۘۜۡۘۘۡ۫ۛۜ";
                                            break;
                                        case 954510083:
                                            str2 = "ۖۤۨۦۢۥۜۜ۬ۘۧۧۜۨۡۘۗۖۚۖۗۡۘ۬ۘۖۘۨۡ۠ۖۘۥۛ۬ۢۢ۠ۥۘۖۙۤۜۦ۠ۨۦۨۛۤ۫ۤۥۖۛۚۢۢۘۦۘ۠ۖۡ۬۟ۦۘۙۧۥۘۥۙۥۘۥۤۜۘ۠ۙ۠ۘۤۙۨۘۤۨۜۤۜۘۖۘۛۨۧ";
                                            break;
                                    }
                                }
                                break;
                            case 609742999:
                                str2 = "ۢۚۙ۬ۢۗۚۧ۫ۗۧۖۘۥ۫ۥۘ۟۟ۖۘۧ۫ۧۦۗۡ۟ۡۥۘۜۘۢۨ۫ۢۘۗۥ۠ۙۥۘۗۚۙۗۥۘۤۧۖۘۘۦۙ۬ۘۥۘۖۙۜۘۙۤۨۚ۬ۘۘۖۖۡ۬۫ۦۚۢ۟۬ۙ";
                            case 1931466925:
                                str = "ۖۙۢۥۜۥۛ۟ۨۘۨۜ۫ۡۧۖۘۢۧۧۜۗۚۚۘۡۘۨ۟۫ۢ۫ۢ۫ۢۦۘۡۥۥۧۨۢۙ۬ۙ۫ۛۜۘۡۧۤۥۘۧ۬۫ۚ۟ۙۡۚ۫۟ۚۜۦۘۧۤ۠ۥۜۦۘۤ۟ۛۧۜۘۖۜۘۨۛۡۨۜۨ۟ۚۤۚۛۛۙۢۦ۬ۨۘ۫ۤۡۘۗۛۥۧۖۥۢ۠ۗۜۖۘ۬۠ۖۤ۫ۛۨۘۦۘۜۦۘۥ۠ۡۘۙ۬ۨۘ۟ۜۦۖۗۜۘ";
                                continue;
                        }
                    }
                    break;
                case -1143883623:
                    getWindow().getDecorView().setSystemUiVisibility(1280);
                    str = "ۖۖۥۘ۫۬ۜۗۜ۟۫ۢۨۥۨ۬۬ۗۦۘ۫ۗۦۘ۠ۚۢۡۜۦۘۧۚۧۛۚۛۚۛۛ۫ۨۨۘ۬۬ۘۘۗۖۦۘۗۡۘۦۤۥۘۧ۟ۜۤۛۜ۟ۘۖۘۥۛۘۜۙ۠۠ۚۡۜ۬ۙۤۗۖۥۙۖۛۙۜۘ۬۬۠ۘۥۥ۬ۗۢۧۖۧۘۙۡۗۦۤۙۦۨۖ۠ۡۧۜۧۖۘۦۖۨۘۙۡۦۖ۬ۜۘۦۖۜۚۗۖۘۚۨۢۜ۟ۡۙۖۚ۬۟ۦۘ";
                    break;
                case -1093161498:
                    initDesign();
                    str = "۟ۚۦۘۜۨۡ۬ۗۢۘ۟ۥۖۤ۟۫ۦۢۙۖۨۘۨۧۛۛ۟ۖۖۧ۬ۨۧۘۥۥۖۘۡۦۘۜ۬ۙۤۥۨۜ۠ۡۛۗۨ۟ۗۢۖۜ۟ۚۖۗۨۖۘۙۛ۬ۘۜۥۘۛ۟ۜۤۗ۫";
                    break;
                case -312316896:
                    checkForUpdate();
                    str = "۟ۢۧۥۛۦۘۨ۟ۙۡۡ۬ۛۦ۬۫ۥ۫ۤۡۘۘۨۦۘ۟ۦۖ۬ۗ۠۬ۛۤۖۨۜۘۗ۠ۦ۫ۗۢۧۛۢۘۜۨۚۖۜۘۧۤۤ۬ۡۘۛۦۤۛۜۜۦ۟۟۬ۢۤۨۡۖ۠ۛ۫ۤۤ۫۟ۥۤۤۘۜۘۛ۬ۨۖۛۧۛ۫۟۫ۥۨۘۗۚۨۘۥۧۢ۟ۜ۟";
                    break;
                case 93292792:
                    return;
                case 337594287:
                    str = "ۨۢۤۤۥۥۘۘۥۦۧ۠ۚۛۡۚ۬۫ۧۙۘ۟ۚۦۦۘ۬ۚ۟۫ۧۨۘۗۤۜۘۢۢۥۘۦۦۨۖۨ۫ۦ۟ۜۤۛۜۘۜۡ۬ۘ۠ۦۘۤ۬ۘۘۙۛۖۘ۬۫ۤۧۖ۟۬ۗۥ۟۫۬۟۟۬";
                    break;
                case 483058359:
                    showProgressDialog();
                    str = "ۦۡ۠ۖۛۗۗۜۜۘ۠ۖ۟ۛۨ۬۫ۥۘۧ۠ۦۗۤۘۘۙۦۢۧۗۜۘۗۡۥۘۦۚۛۛۤۨۨۘۢ۫ۢۨ۫ۘۧ۬ۨ۠۫ۖۘۚۜۘۘۤۜۘ۟۬۟ۦۗۜۘ۫ۤۦۘۚۗ۠ۖۗۦۘ";
                    break;
                case 1225613744:
                    str = "ۛۢۗۜۗۗۘ۟ۥۛۚۙۧۙۡۦ۬ۡۨۡ۫ۤۙۖۘۗۚۦۘۧۤۧۨ۟ۧۨۛۛۖۖۢۚۜۨۘۤۚۨۘ۠ۜۖۛۢۤۗۙ۟ۛ۟ۜۖ۬ۜۦ۟ۡ۬ۚۡ۟ۨۛۚۖ۫ۢۖۨۘۦۨۙ۟ۦۧ۬ۧۤۙ۠ۥۘۘۡۖۘ";
                    break;
                case 1302613059:
                    Log.e(Deobfuscator$$app.getString(-3440729452771630921L), Deobfuscator$$app.getString(-3440729392642088777L));
                    str = "ۖۙۢۥۜۥۛ۟ۨۘۨۜ۫ۡۧۖۘۢۧۧۜۗۚۚۘۡۘۨ۟۫ۢ۫ۢ۫ۢۦۘۡۥۥۧۨۢۙ۬ۙ۫ۛۜۘۡۧۤۥۘۧ۬۫ۚ۟ۙۡۚ۫۟ۚۜۦۘۧۤ۠ۥۜۦۘۤ۟ۛۧۜۘۖۜۘۨۛۡۨۜۨ۟ۚۤۚۛۛۙۢۦ۬ۨۘ۫ۤۡۘۗۛۥۧۖۥۢ۠ۗۜۖۘ۬۠ۖۤ۫ۛۨۘۦۘۜۦۘۥ۠ۡۘۙ۬ۨۘ۟ۜۦۖۗۜۘ";
                    break;
                case 1586363746:
                    super.onCreate(bundle);
                    str = "۬ۢۨۨۦۗۜۖ۫ۚۥۧۛۢ۟ۖۢ۠ۥ۟۟ۥۢ۟ۧۚۥۨۨۗ۫ۖۛ۫ۙۡۥۦۘۚۖۜۗۖۥۘۜۢۘ۟ۛۛۧۘۤۖ۬ۛۖۡۨۗۜۥۘۘۖۘۘ۬ۛۡۧۨۨۙ۠ۜۙۡۧۤۛۜۘ۬ۨۗۡ۫ۛۦ۬ۙ";
                    break;
                case 1799838710:
                    setContentView(C0931R.layout.activity_login);
                    str = "ۚ۬ۨۘۛ۫ۨۘ۫ۛۘۢۧۡۖۡۡۦۡ۟ۢ۬ۙۘۜۘۤۖۡۘۧۤۧۗۢۘۘۨ۫۫ۦۤۛۨۛۡ۬ۜۦ۫ۖۧۘۚ۫ۜۘۙۜۜۘ۟ۚۘۘ۠ۧ۫ۦۥۥۘ۫ۜۦۘ۟۠۬ۤۙۧۖۥۦ";
                    break;
            }
        }
    }
}

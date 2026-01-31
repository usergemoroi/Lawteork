package com.topjohnwu.superuser.internal;

import android.content.Context;
import android.util.Log;
import com.topjohnwu.superuser.Shell;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Collections;
/* loaded from: classes.dex */
public final class Utils {
    private static final String TAG = "LIBSU";
    public static final Charset UTF_8 = StandardCharsets.UTF_8;
    public static Context context;
    private static Class<?> synchronizedCollectionClass;

    public static void log(Object log) {
        log(TAG, log);
    }

    public static void log(String tag, Object log) {
        if (vLog()) {
            Log.d(tag, log.toString());
        }
    }

    /* renamed from: ex */
    public static void m90ex(Throwable t) {
        if (vLog()) {
            Log.d(TAG, "", t);
        }
    }

    public static void err(Throwable t) {
        err(TAG, t);
    }

    public static void err(String tag, Throwable t) {
        Log.d(tag, "", t);
    }

    public static boolean vLog() {
        return Shell.enableVerboseLogging;
    }

    public static synchronized Context getContext() {
        Context context2;
        synchronized (Utils.class) {
            if (context == null) {
                UiThreadHandler.runAndWait(new Runnable() { // from class: com.topjohnwu.superuser.internal.Utils$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Utils.lambda$getContext$0();
                    }
                });
            }
            context2 = context;
        }
        return context2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$getContext$0() {
        try {
            Method currentApplication = Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]);
            context = (Context) currentApplication.invoke(null, new Object[0]);
        } catch (Exception e) {
            err(e);
        }
    }

    public static Context getDeContext(Context context2) {
        return context2.createDeviceProtectedStorageContext();
    }

    public static boolean isSynchronized(Collection<?> collection) {
        if (synchronizedCollectionClass == null) {
            synchronizedCollectionClass = Collections.synchronizedCollection(NOPList.getInstance()).getClass();
        }
        return synchronizedCollectionClass.isInstance(collection);
    }

    public static long pump(InputStream in, OutputStream out) throws IOException {
        long total = 0;
        byte[] buf = new byte[65536];
        while (true) {
            int read = in.read(buf);
            if (read > 0) {
                out.write(buf, 0, read);
                total += read;
            } else {
                return total;
            }
        }
    }
}

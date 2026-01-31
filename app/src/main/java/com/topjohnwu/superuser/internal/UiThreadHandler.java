package com.topjohnwu.superuser.internal;

import android.os.Handler;
import android.os.Looper;
import com.topjohnwu.superuser.ShellUtils;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class UiThreadHandler {
    public static final Handler handler = new Handler(Looper.getMainLooper());
    public static final Executor executor = new Executor() { // from class: com.topjohnwu.superuser.internal.UiThreadHandler$$ExternalSyntheticLambda0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            UiThreadHandler.run(runnable);
        }
    };

    public static void run(Runnable r) {
        if (ShellUtils.onMainThread()) {
            r.run();
        } else {
            handler.post(r);
        }
    }

    public static void runAndWait(Runnable r) {
        if (ShellUtils.onMainThread()) {
            r.run();
            return;
        }
        WaitRunnable wr = new WaitRunnable(r);
        handler.post(wr);
        wr.waitUntilDone();
    }
}

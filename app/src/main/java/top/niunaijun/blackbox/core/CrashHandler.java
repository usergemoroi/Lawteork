package top.niunaijun.blackbox.core;

import java.lang.Thread;
import top.niunaijun.blackbox.BlackBoxCore;
/* loaded from: classes3.dex */
public class CrashHandler implements Thread.UncaughtExceptionHandler {
    private Thread.UncaughtExceptionHandler mDefaultHandler = Thread.getDefaultUncaughtExceptionHandler();

    public CrashHandler() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static void create() {
        new CrashHandler();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (BlackBoxCore.get().getExceptionHandler() != null) {
            BlackBoxCore.get().getExceptionHandler().uncaughtException(thread, th);
        }
        this.mDefaultHandler.uncaughtException(thread, th);
    }
}

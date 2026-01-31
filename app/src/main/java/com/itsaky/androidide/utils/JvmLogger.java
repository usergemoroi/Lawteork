package com.itsaky.androidide.utils;

import com.itsaky.androidide.utils.ILogger;
/* loaded from: classes.dex */
public class JvmLogger extends ILogger {
    public static LogInterceptor interceptor;

    /* loaded from: classes.dex */
    public interface LogInterceptor {
        void onLog(ILogger.Level level, String str, String str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JvmLogger(String tag) {
        super(tag);
    }

    @Override // com.itsaky.androidide.utils.ILogger
    protected void doLog(ILogger.Level level, String message) {
        LogInterceptor logInterceptor = interceptor;
        if (logInterceptor != null) {
            logInterceptor.onLog(level, this.TAG, message);
        } else {
            System.err.printf("%-25s %-2s %s%n", LogTagUtils.trimTagIfNeeded(this.TAG, 25), Character.valueOf(level.levelChar), message);
        }
    }
}

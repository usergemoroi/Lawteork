package com.itsaky.androidide.utils;

import android.util.Log;
import com.itsaky.androidide.utils.ILogger;
/* loaded from: classes.dex */
public class AndroidLogger extends ILogger {
    /* JADX INFO: Access modifiers changed from: protected */
    public AndroidLogger(String tag) {
        super(tag);
    }

    /* renamed from: com.itsaky.androidide.utils.AndroidLogger$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C09191 {
        static final /* synthetic */ int[] $SwitchMap$com$itsaky$androidide$utils$ILogger$Level;

        static {
            int[] iArr = new int[ILogger.Level.values().length];
            $SwitchMap$com$itsaky$androidide$utils$ILogger$Level = iArr;
            try {
                iArr[ILogger.Level.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$itsaky$androidide$utils$ILogger$Level[ILogger.Level.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$itsaky$androidide$utils$ILogger$Level[ILogger.Level.VERBOSE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$itsaky$androidide$utils$ILogger$Level[ILogger.Level.INFO.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$com$itsaky$androidide$utils$ILogger$Level[ILogger.Level.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    @Override // com.itsaky.androidide.utils.ILogger
    protected void doLog(ILogger.Level level, String message) {
        switch (C09191.$SwitchMap$com$itsaky$androidide$utils$ILogger$Level[level.ordinal()]) {
            case 1:
                Log.e(this.TAG, message);
                return;
            case 2:
                Log.w(this.TAG, message);
                return;
            case 3:
                Log.v(this.TAG, message);
                return;
            case 4:
                Log.i(this.TAG, message);
                return;
            default:
                Log.d(this.TAG, message);
                return;
        }
    }
}

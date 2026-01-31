package com.itsaky.androidide.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.function.Function;
import top.niunaijun.blackbox.utils.ShellUtils;
/* loaded from: classes.dex */
public abstract class ILogger {
    public static final String DEFAULT_TAG = "AndroidIDE";
    public static final String MSG_SEPARATOR = " ";
    protected final String TAG;
    protected boolean isEnabled = true;
    private static final List<LogListener> logListeners = new ArrayList();
    private static final Map<String, ILogger> cachedLoggers = new WeakHashMap();

    /* loaded from: classes.dex */
    public interface LogListener {
        void log(Level level, String str, String str2);
    }

    protected abstract void doLog(Level level, String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public ILogger(String tag) {
        this.TAG = LogUtils.preProcessLogTag(tag);
    }

    public static ILogger instance() {
        return cachedLoggers.computeIfAbsent(DEFAULT_TAG, new Function() { // from class: com.itsaky.androidide.utils.ILogger$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ILogger createInstance;
                createInstance = ILogger.createInstance((String) obj);
                return createInstance;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ILogger createInstance(String tag) {
        return cachedLoggers.computeIfAbsent(tag, new Function() { // from class: com.itsaky.androidide.utils.ILogger$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ILogger newPlatformDependentLogger;
                newPlatformDependentLogger = ILogger.newPlatformDependentLogger((String) obj);
                return newPlatformDependentLogger;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ILogger newPlatformDependentLogger(String tag) {
        return LogUtils.isJvm() ? new JvmLogger(tag) : new AndroidLogger(tag);
    }

    public static void addLogListener(LogListener listener) {
        logListeners.add((LogListener) Objects.requireNonNull(listener));
    }

    public static void removeLogListener(LogListener listener) {
        logListeners.remove(Objects.requireNonNull(listener));
    }

    public static ILogger newInstance(String tag) {
        return createInstance(tag);
    }

    public ILogger error(Object... messages) {
        return log(Level.ERROR, messages);
    }

    public ILogger log(Level level, Object... messages) {
        logAndNotify(level, generateMessage(messages));
        return this;
    }

    private void logAndNotify(Level level, String msg) {
        if (!isEnabled()) {
            return;
        }
        doLog(level, msg);
        for (LogListener listener : logListeners) {
            listener.log(level, this.TAG, msg);
        }
    }

    protected String generateMessage(Object... messages) {
        StringBuilder sb = new StringBuilder();
        if (messages == null) {
            return "null";
        }
        for (Object msg : messages) {
            boolean z = msg instanceof Throwable;
            String str = ShellUtils.COMMAND_LINE_END;
            sb.append(z ? ShellUtils.COMMAND_LINE_END : MSG_SEPARATOR);
            sb.append(msg instanceof Throwable ? LogUtils.getFullStackTrace((Throwable) msg) : msg);
            if (!(msg instanceof Throwable)) {
                str = MSG_SEPARATOR;
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public ILogger warn(Object... messages) {
        return log(Level.WARNING, messages);
    }

    public ILogger verbose(Object... messages) {
        return log(Level.VERBOSE, messages);
    }

    public ILogger info(Object... messages) {
        return log(Level.INFO, messages);
    }

    public void logThis() {
        debug(getCallerClassDescription());
    }

    public ILogger debug(Object... messages) {
        return log(Level.DEBUG, messages);
    }

    public void setEnabled(boolean enabled) {
        this.isEnabled = enabled;
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    protected String getCallerClassDescription() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        int elementsLength = elements.length;
        for (int i = 1; i < elementsLength; i++) {
            StackTraceElement element = elements[i];
            String klass = element.getClassName();
            String method = element.getMethodName();
            if (!ILogger.class.getName().equals(klass) && !klass.contains("java.lang.Thread")) {
                return String.format("%s [%s]", method, klass);
            }
        }
        return "<Logger> <Cannot get caller information>";
    }

    /* loaded from: classes.dex */
    public enum Level {
        DEBUG('D'),
        WARNING('W'),
        ERROR('E'),
        INFO('I'),
        VERBOSE('V');
        
        public final char levelChar;

        Level(char levelChar) {
            this.levelChar = levelChar;
        }

        public static Level forChar(char c) {
            Level[] values;
            char c2 = Character.toUpperCase(c);
            for (Level value : values()) {
                if (value.levelChar == c2) {
                    return value;
                }
            }
            throw new IllegalArgumentException("Invalid level char " + c2);
        }
    }
}

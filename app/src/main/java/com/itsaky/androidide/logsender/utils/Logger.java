package com.itsaky.androidide.logsender.utils;

import com.itsaky.androidide.utils.ILogger;
/* loaded from: classes.dex */
public class Logger {
    public static final ILogger LOG = ILogger.newInstance("LogSender");

    public static void error(Object... messages) {
        LOG.error(messages);
    }

    public static void warn(Object... messages) {
        LOG.warn(messages);
    }

    public static void info(Object... messages) {
        LOG.info(messages);
    }

    public static void debug(Object... messages) {
        LOG.debug(messages);
    }
}

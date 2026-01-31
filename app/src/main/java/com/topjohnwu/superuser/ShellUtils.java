package com.topjohnwu.superuser;

import android.os.Looper;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Typography;
/* loaded from: classes.dex */
public final class ShellUtils {
    private ShellUtils() {
    }

    public static boolean isValidOutput(List<String> out) {
        if (out != null && out.size() != 0) {
            for (String s : out) {
                if (!TextUtils.isEmpty(s)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static String fastCmd(String... cmds) {
        return fastCmd(Shell.getShell(), cmds);
    }

    public static String fastCmd(Shell shell, String... cmds) {
        List<String> out = shell.newJob().add(cmds).mo91to(new ArrayList(), null).exec().getOut();
        return isValidOutput(out) ? out.get(out.size() - 1) : "";
    }

    public static boolean fastCmdResult(String... cmds) {
        return fastCmdResult(Shell.getShell(), cmds);
    }

    public static boolean fastCmdResult(Shell shell, String... cmds) {
        return shell.newJob().add(cmds).mo92to(null).exec().isSuccess();
    }

    public static boolean onMainThread() {
        return Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper();
    }

    public static void cleanInputStream(InputStream in) {
        while (in.available() != 0) {
            try {
                in.skip(in.available());
            } catch (IOException e) {
                return;
            }
        }
    }

    public static String escapedString(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(Typography.quote);
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if ("$`\"\\".indexOf(c) >= 0) {
                sb.append('\\');
            }
            sb.append(c);
        }
        sb.append(Typography.quote);
        return sb.toString();
    }

    public static long gcd(long u, long v) {
        if (u == 0) {
            return v;
        }
        if (v == 0) {
            return u;
        }
        int shift = 0;
        while (((u | v) & 1) == 0) {
            u >>= 1;
            v >>= 1;
            shift++;
        }
        while ((u & 1) == 0) {
            u >>= 1;
        }
        while (true) {
            if ((v & 1) == 0) {
                v >>= 1;
            } else {
                if (u > v) {
                    long t = v;
                    v = u;
                    u = t;
                }
                v -= u;
                if (v == 0) {
                    return u << shift;
                }
            }
        }
    }
}

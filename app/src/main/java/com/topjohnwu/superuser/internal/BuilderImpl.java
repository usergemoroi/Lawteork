package com.topjohnwu.superuser.internal;

import android.content.Context;
import com.topjohnwu.superuser.NoShellException;
import com.topjohnwu.superuser.Shell;
import java.io.IOException;
import java.lang.reflect.Constructor;
import top.niunaijun.blackbox.utils.ShellUtils;
/* loaded from: classes.dex */
public class BuilderImpl extends Shell.Builder {
    boolean hasFlags(int flags) {
        return (this.flags & flags) == flags;
    }

    @Override // com.topjohnwu.superuser.Shell.Builder
    public ShellImpl build() {
        ShellImpl shell = null;
        if (!hasFlags(1) && hasFlags(2)) {
            try {
                shell = build(ShellUtils.COMMAND_SU, "--mount-master");
                if (shell.getStatus() != 2) {
                    shell = null;
                }
            } catch (NoShellException e) {
            }
        }
        if (shell == null && !hasFlags(1)) {
            try {
                shell = build(ShellUtils.COMMAND_SU);
                if (shell.getStatus() != 1) {
                    shell = null;
                }
            } catch (NoShellException e2) {
            }
        }
        if (shell == null) {
            return build(ShellUtils.COMMAND_SH);
        }
        return shell;
    }

    @Override // com.topjohnwu.superuser.Shell.Builder
    public ShellImpl build(String... commands) {
        Class<? extends Shell.Initializer>[] clsArr;
        Shell.Initializer init;
        try {
            ShellImpl shell = new ShellImpl(this.timeout, hasFlags(8), commands);
            MainShell.set(shell);
            if (this.initClasses != null) {
                Context ctx = Utils.getContext();
                for (Class<? extends Shell.Initializer> cls : this.initClasses) {
                    try {
                        Constructor<? extends Shell.Initializer> ic = cls.getDeclaredConstructor(new Class[0]);
                        ic.setAccessible(true);
                        init = ic.newInstance(new Object[0]);
                    } catch (Exception e) {
                        Utils.err(e);
                    }
                    if (!init.onInit(ctx, shell)) {
                        MainShell.set(null);
                        throw new NoShellException("Unable to init shell");
                    }
                }
            }
            return shell;
        } catch (IOException e2) {
            Utils.m90ex(e2);
            throw new NoShellException("Unable to create a shell!", e2);
        }
    }
}

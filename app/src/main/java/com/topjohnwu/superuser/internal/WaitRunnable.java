package com.topjohnwu.superuser.internal;
/* loaded from: classes.dex */
public final class WaitRunnable implements Runnable {

    /* renamed from: r */
    private Runnable f160r;

    public WaitRunnable(Runnable run) {
        this.f160r = run;
    }

    public synchronized void waitUntilDone() {
        while (this.f160r != null) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
    }

    @Override // java.lang.Runnable
    public synchronized void run() {
        this.f160r.run();
        this.f160r = null;
        notifyAll();
    }
}

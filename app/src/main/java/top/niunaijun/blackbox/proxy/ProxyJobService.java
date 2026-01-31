package top.niunaijun.blackbox.proxy;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.content.res.Configuration;
import top.niunaijun.blackbox.app.dispatcher.AppJobServiceDispatcher;
/* loaded from: classes3.dex */
public class ProxyJobService extends JobService {
    public static final String TAG = "StubJobService";

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyJobService$P0  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class jobJobServiceC1140P0 extends ProxyJobService {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyJobService$P1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class jobJobServiceC1141P1 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P10 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P11 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P12 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P13 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P14 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P15 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P16 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P17 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P18 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P19 extends ProxyJobService {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyJobService$P2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class jobJobServiceC1142P2 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P20 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P21 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P22 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P23 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P24 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P25 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P26 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P27 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P28 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P29 extends ProxyJobService {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyJobService$P3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class jobJobServiceC1143P3 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P30 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P31 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P32 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P33 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P34 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P35 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P36 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P37 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P38 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P39 extends ProxyJobService {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyJobService$P4  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class jobJobServiceC1144P4 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P40 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P41 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P42 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P43 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P44 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P45 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P46 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P47 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P48 extends ProxyJobService {
    }

    /* loaded from: classes3.dex */
    public static class P49 extends ProxyJobService {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyJobService$P5  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class jobJobServiceC1145P5 extends ProxyJobService {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyJobService$P6  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class jobJobServiceC1146P6 extends ProxyJobService {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyJobService$P7  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class jobJobServiceC1147P7 extends ProxyJobService {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyJobService$P8  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class jobJobServiceC1148P8 extends ProxyJobService {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyJobService$P9  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static class jobJobServiceC1149P9 extends ProxyJobService {
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AppJobServiceDispatcher.get().onConfigurationChanged(configuration);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        AppJobServiceDispatcher.get().onDestroy();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        AppJobServiceDispatcher.get().onLowMemory();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        return AppJobServiceDispatcher.get().onStartJob(jobParameters);
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return AppJobServiceDispatcher.get().onStopJob(jobParameters);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        AppJobServiceDispatcher.get().onTrimMemory(i);
    }
}

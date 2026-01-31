package top.niunaijun.blackbox.proxy;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.entity.AppConfig;
import top.niunaijun.blackbox.utils.compat.BundleCompat;
/* loaded from: classes3.dex */
public class ProxyContentProvider extends ContentProvider {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyContentProvider$P0 */
    /* loaded from: classes3.dex */
    public static class C1130P0 extends ProxyContentProvider {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyContentProvider$P1 */
    /* loaded from: classes3.dex */
    public static class C1131P1 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P10 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P11 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P12 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P13 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P14 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P15 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P16 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P17 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P18 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P19 extends ProxyContentProvider {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyContentProvider$P2 */
    /* loaded from: classes3.dex */
    public static class C1132P2 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P20 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P21 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P22 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P23 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P24 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P25 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P26 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P27 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P28 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P29 extends ProxyContentProvider {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyContentProvider$P3 */
    /* loaded from: classes3.dex */
    public static class C1133P3 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P30 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P31 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P32 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P33 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P34 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P35 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P36 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P37 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P38 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P39 extends ProxyContentProvider {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyContentProvider$P4 */
    /* loaded from: classes3.dex */
    public static class C1134P4 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P40 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P41 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P42 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P43 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P44 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P45 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P46 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P47 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P48 extends ProxyContentProvider {
    }

    /* loaded from: classes3.dex */
    public static class P49 extends ProxyContentProvider {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyContentProvider$P5 */
    /* loaded from: classes3.dex */
    public static class C1135P5 extends ProxyContentProvider {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyContentProvider$P6 */
    /* loaded from: classes3.dex */
    public static class C1136P6 extends ProxyContentProvider {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyContentProvider$P7 */
    /* loaded from: classes3.dex */
    public static class C1137P7 extends ProxyContentProvider {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyContentProvider$P8 */
    /* loaded from: classes3.dex */
    public static class C1138P8 extends ProxyContentProvider {
    }

    /* renamed from: top.niunaijun.blackbox.proxy.ProxyContentProvider$P9 */
    /* loaded from: classes3.dex */
    public static class C1139P9 extends ProxyContentProvider {
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        if (str.equals("_Black_|_init_process_")) {
            if (bundle != null) {
                bundle.setClassLoader(AppConfig.class.getClassLoader());
                BActivityThread.currentActivityThread().initProcess((AppConfig) bundle.getParcelable(AppConfig.KEY));
                Bundle bundle2 = new Bundle();
                BundleCompat.putBinder(bundle2, "_Black_|_client_", BActivityThread.currentActivityThread());
                return bundle2;
            }
            throw new AssertionError();
        }
        return super.call(str, str2, bundle);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}

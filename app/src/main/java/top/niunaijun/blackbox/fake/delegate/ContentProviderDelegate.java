package top.niunaijun.blackbox.fake.delegate;

import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.util.ArrayMap;
import black.android.app.ActivityThreadProviderClientRecordPContext;
import black.android.app.IActivityManagerContentProviderHolderContext;
import black.android.content.ContentProviderHolderOreoContext;
import black.android.providers.SettingsContentProviderHolderContext;
import black.android.providers.SettingsGlobalContext;
import black.android.providers.SettingsGlobalStatic;
import black.android.providers.SettingsNameValueCacheContext;
import black.android.providers.SettingsNameValueCacheOreoContext;
import black.android.providers.SettingsSecureStatic;
import black.android.providers.SettingsSystemStatic;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;
import p007b.AbstractC0567c;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.fake.service.context.providers.ContentProviderStub;
import top.niunaijun.blackbox.fake.service.context.providers.SystemProviderStub;
import top.niunaijun.blackbox.utils.compat.BuildCompat;
import top.niunaijun.blackreflection.BlackReflection;
import top.niunaijun.blackreflection.utils.ClassUtil;
/* loaded from: classes3.dex */
public class ContentProviderDelegate {
    public static final String TAG = "ContentProviderDelegate";
    private static Set<String> sInjected = new HashSet();

    private static void clearContentProvider(Object obj) {
        if (BuildCompat.isOreo()) {
            Object mProviderHolder = ((SettingsNameValueCacheOreoContext) BlackReflection.create(SettingsNameValueCacheOreoContext.class, obj, false)).mProviderHolder();
            if (mProviderHolder != null) {
                ((SettingsContentProviderHolderContext) BlackReflection.create(SettingsContentProviderHolderContext.class, mProviderHolder, false))._set_mContentProvider(null);
                return;
            }
            return;
        }
        ((SettingsNameValueCacheContext) BlackReflection.create(SettingsNameValueCacheContext.class, obj, false))._set_mContentProvider(null);
    }

    public static void clearSettingProvider() {
        Object sNameValueCache;
        Object sNameValueCache2 = ((SettingsSystemStatic) BlackReflection.create(SettingsSystemStatic.class, null, false)).sNameValueCache();
        if (sNameValueCache2 != null) {
            clearContentProvider(sNameValueCache2);
        }
        Object sNameValueCache3 = ((SettingsSecureStatic) BlackReflection.create(SettingsSecureStatic.class, null, false)).sNameValueCache();
        if (sNameValueCache3 != null) {
            clearContentProvider(sNameValueCache3);
        }
        if (ClassUtil.classReady(SettingsGlobalContext.class) == null || (sNameValueCache = ((SettingsGlobalStatic) BlackReflection.create(SettingsGlobalStatic.class, null, false)).sNameValueCache()) == null) {
            return;
        }
        clearContentProvider(sNameValueCache);
    }

    public static void init() {
        clearSettingProvider();
        BlackBoxCore.getContext().getContentResolver().call(Uri.parse("content://settings"), "", (String) null, (Bundle) null);
        for (Object obj : ((ArrayMap) AbstractC0567c.m164a(BlackBoxCore.mainThread()).mProviderMap()).values()) {
            String[] mNames = ((ActivityThreadProviderClientRecordPContext) BlackReflection.create(ActivityThreadProviderClientRecordPContext.class, obj, false)).mNames();
            if (mNames != null && mNames.length > 0) {
                String str = mNames[0];
                if (!sInjected.contains(str)) {
                    sInjected.add(str);
                    ((ActivityThreadProviderClientRecordPContext) BlackReflection.create(ActivityThreadProviderClientRecordPContext.class, obj, false))._set_mProvider(new ContentProviderStub().wrapper(((ActivityThreadProviderClientRecordPContext) BlackReflection.create(ActivityThreadProviderClientRecordPContext.class, obj, false)).mProvider(), BlackBoxCore.getHostPkg()));
                    ((ActivityThreadProviderClientRecordPContext) BlackReflection.create(ActivityThreadProviderClientRecordPContext.class, obj, false))._set_mNames(new String[]{str});
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void update(Object obj, String str) {
        IInterface provider;
        char c;
        IInterface wrapper;
        if (BuildCompat.isOreo()) {
            provider = ((ContentProviderHolderOreoContext) BlackReflection.create(ContentProviderHolderOreoContext.class, obj, false)).provider();
        } else {
            provider = ((IActivityManagerContentProviderHolderContext) BlackReflection.create(IActivityManagerContentProviderHolderContext.class, obj, false)).provider();
        }
        if (provider instanceof Proxy) {
            return;
        }
        str.getClass();
        switch (str.hashCode()) {
            case 103772132:
                if (str.equals("media")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 783201304:
                if (str.equals("telephony")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1434631203:
                if (str.equals("settings")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
                wrapper = new SystemProviderStub().wrapper(provider, BlackBoxCore.getHostPkg());
                break;
            default:
                wrapper = new ContentProviderStub().wrapper(provider, BlackBoxCore.getHostPkg());
                break;
        }
        if (BuildCompat.isOreo()) {
            ((ContentProviderHolderOreoContext) BlackReflection.create(ContentProviderHolderOreoContext.class, obj, false))._set_provider(wrapper);
        } else {
            ((IActivityManagerContentProviderHolderContext) BlackReflection.create(IActivityManagerContentProviderHolderContext.class, obj, false))._set_provider(wrapper);
        }
    }
}

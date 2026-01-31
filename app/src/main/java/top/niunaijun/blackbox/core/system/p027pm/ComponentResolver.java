package top.niunaijun.blackbox.core.system.p027pm;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.List;
import top.niunaijun.blackbox.core.system.p027pm.BPackage;
import top.niunaijun.blackbox.utils.Slog;
/* renamed from: top.niunaijun.blackbox.core.system.pm.ComponentResolver */
/* loaded from: classes3.dex */
public class ComponentResolver {
    public static final String TAG = "ComponentResolver";
    private final Object mLock = new Object();
    private final ActivityIntentResolver mActivities = new ActivityIntentResolver();
    private final ProviderIntentResolver mProviders = new ProviderIntentResolver();
    private final ActivityIntentResolver mReceivers = new ActivityIntentResolver();
    private final ServiceIntentResolver mServices = new ServiceIntentResolver();
    private final ArrayMap<String, BPackage.Provider> mProvidersByAuthority = new ArrayMap<>();

    /* renamed from: top.niunaijun.blackbox.core.system.pm.ComponentResolver$ActivityIntentResolver */
    /* loaded from: classes3.dex */
    public static final class ActivityIntentResolver extends IntentResolver<BPackage.ActivityIntentInfo, ResolveInfo> {
        private final ArrayMap<ComponentName, BPackage.Activity> mActivities;
        private int mFlags;

        private ActivityIntentResolver() {
            this.mActivities = new ArrayMap<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addActivity(BPackage.Activity activity, String str, List<BPackage.ActivityIntentInfo> list) {
            this.mActivities.put(activity.getComponentName(), activity);
            int size = activity.intents.size();
            for (int i = 0; i < size; i++) {
                BPackage.ActivityIntentInfo activityIntentInfo = (BPackage.ActivityIntentInfo) activity.intents.get(i);
                if (list != null && "activity".equals(str)) {
                    list.add(activityIntentInfo);
                }
                addFilter(activityIntentInfo);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeActivity(BPackage.Activity activity, String str) {
            this.mActivities.remove(activity.getComponentName());
            int size = activity.intents.size();
            for (int i = 0; i < size; i++) {
                removeFilter((BPackage.ActivityIntentInfo) activity.intents.get(i));
            }
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IntentResolver
        public boolean isPackageForFilter(String str, BPackage.ActivityIntentInfo activityIntentInfo) {
            return str.equals(activityIntentInfo.activity.owner.packageName);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // top.niunaijun.blackbox.core.system.p027pm.IntentResolver
        public BPackage.ActivityIntentInfo[] newArray(int i) {
            return new BPackage.ActivityIntentInfo[i];
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IntentResolver
        public ResolveInfo newResult(BPackage.ActivityIntentInfo activityIntentInfo, int i, int i2) {
            BPackage.Activity activity = activityIntentInfo.activity;
            BPackageSettings bPackageSettings = activity.owner.mExtras;
            if (bPackageSettings == null) {
                return null;
            }
            ActivityInfo generateActivityInfo = PackageManagerCompat.generateActivityInfo(activity, this.mFlags, bPackageSettings.readUserState(i2), i2);
            ResolveInfo resolveInfo = new ResolveInfo();
            resolveInfo.activityInfo = generateActivityInfo;
            if ((this.mFlags & 64) != 0) {
                resolveInfo.filter = activityIntentInfo.intentFilter;
            }
            resolveInfo.priority = activityIntentInfo.intentFilter.getPriority();
            resolveInfo.preferredOrder = activity.owner.mPreferredOrder;
            resolveInfo.match = i;
            resolveInfo.isDefault = activityIntentInfo.hasDefault;
            resolveInfo.labelRes = activityIntentInfo.labelRes;
            resolveInfo.nonLocalizedLabel = activityIntentInfo.nonLocalizedLabel;
            resolveInfo.icon = activityIntentInfo.icon;
            return resolveInfo;
        }

        public List<ResolveInfo> queryIntent(Intent intent, String str, int i, int i2) {
            this.mFlags = i;
            return super.queryIntent(intent, str, (i & 65536) != 0, i2);
        }

        public List<ResolveInfo> queryIntentForPackage(Intent intent, String str, int i, List<BPackage.Activity> list, int i2) {
            if (list == null) {
                return null;
            }
            this.mFlags = i;
            boolean z = (i & 65536) != 0;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                ArrayList<II> arrayList2 = list.get(i3).intents;
                if (arrayList2 != 0 && arrayList2.size() > 0) {
                    BPackage.ActivityIntentInfo[] activityIntentInfoArr = new BPackage.ActivityIntentInfo[arrayList2.size()];
                    arrayList2.toArray(activityIntentInfoArr);
                    arrayList.add(activityIntentInfoArr);
                }
            }
            return super.queryIntentFromList(intent, str, z, arrayList, i2);
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IntentResolver
        public List<ResolveInfo> queryIntent(Intent intent, String str, boolean z, int i) {
            this.mFlags = z ? 65536 : 0;
            return super.queryIntent(intent, str, z, i);
        }
    }

    /* renamed from: top.niunaijun.blackbox.core.system.pm.ComponentResolver$ProviderIntentResolver */
    /* loaded from: classes3.dex */
    public static final class ProviderIntentResolver extends IntentResolver<BPackage.ProviderIntentInfo, ResolveInfo> {
        private int mFlags;
        private final ArrayMap<ComponentName, BPackage.Provider> mProviders;

        private ProviderIntentResolver() {
            this.mProviders = new ArrayMap<>();
        }

        public void addProvider(BPackage.Provider provider) {
            this.mProviders.put(provider.getComponentName(), provider);
            int size = provider.intents.size();
            for (int i = 0; i < size; i++) {
                addFilter((BPackage.ProviderIntentInfo) provider.intents.get(i));
            }
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IntentResolver
        public ResolveInfo newResult(BPackage.ProviderIntentInfo providerIntentInfo, int i, int i2) {
            BPackage.Provider provider = providerIntentInfo.provider;
            BPackageSettings bPackageSettings = provider.owner.mExtras;
            if (bPackageSettings == null) {
                return null;
            }
            ProviderInfo generateProviderInfo = PackageManagerCompat.generateProviderInfo(provider, this.mFlags, bPackageSettings.readUserState(i2), i2);
            ResolveInfo resolveInfo = new ResolveInfo();
            resolveInfo.providerInfo = generateProviderInfo;
            if ((this.mFlags & 64) != 0) {
                resolveInfo.filter = providerIntentInfo.intentFilter;
            }
            resolveInfo.priority = providerIntentInfo.intentFilter.getPriority();
            resolveInfo.preferredOrder = provider.owner.mPreferredOrder;
            resolveInfo.match = i;
            resolveInfo.isDefault = providerIntentInfo.hasDefault;
            resolveInfo.labelRes = providerIntentInfo.labelRes;
            resolveInfo.nonLocalizedLabel = providerIntentInfo.nonLocalizedLabel;
            resolveInfo.icon = providerIntentInfo.icon;
            return resolveInfo;
        }

        public List<ResolveInfo> queryIntent(Intent intent, String str, int i, int i2) {
            this.mFlags = i;
            return super.queryIntent(intent, str, (i & 65536) != 0, i2);
        }

        public List<ResolveInfo> queryIntentForPackage(Intent intent, String str, int i, List<BPackage.Provider> list, int i2) {
            if (list == null) {
                return null;
            }
            this.mFlags = i;
            boolean z = (i & 65536) != 0;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                ArrayList<II> arrayList2 = list.get(i3).intents;
                if (arrayList2 != 0 && arrayList2.size() > 0) {
                    BPackage.ProviderIntentInfo[] providerIntentInfoArr = new BPackage.ProviderIntentInfo[arrayList2.size()];
                    arrayList2.toArray(providerIntentInfoArr);
                    arrayList.add(providerIntentInfoArr);
                }
            }
            return super.queryIntentFromList(intent, str, z, arrayList, i2);
        }

        public void removeProvider(BPackage.Provider provider) {
            this.mProviders.remove(provider.getComponentName());
            int size = provider.intents.size();
            for (int i = 0; i < size; i++) {
                removeFilter((BPackage.ProviderIntentInfo) provider.intents.get(i));
            }
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IntentResolver
        public boolean allowFilterResult(BPackage.ProviderIntentInfo providerIntentInfo, List<ResolveInfo> list) {
            ProviderInfo providerInfo = providerIntentInfo.provider.info;
            for (int size = list.size() - 1; size >= 0; size--) {
                ProviderInfo providerInfo2 = list.get(size).providerInfo;
                if (providerInfo2.name.equals(providerInfo.name) && providerInfo2.packageName.equals(providerInfo.packageName)) {
                    return false;
                }
            }
            return true;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IntentResolver
        public boolean isPackageForFilter(String str, BPackage.ProviderIntentInfo providerIntentInfo) {
            return str.equals(providerIntentInfo.provider.owner.packageName);
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IntentResolver
        public BPackage.ProviderIntentInfo[] newArray(int i) {
            return new BPackage.ProviderIntentInfo[i];
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IntentResolver
        public List<ResolveInfo> queryIntent(Intent intent, String str, boolean z, int i) {
            this.mFlags = z ? 65536 : 0;
            return super.queryIntent(intent, str, z, i);
        }
    }

    /* renamed from: top.niunaijun.blackbox.core.system.pm.ComponentResolver$ServiceIntentResolver */
    /* loaded from: classes3.dex */
    public static final class ServiceIntentResolver extends IntentResolver<BPackage.ServiceIntentInfo, ResolveInfo> {
        private int mFlags;
        private final ArrayMap<ComponentName, BPackage.Service> mServices;

        private ServiceIntentResolver() {
            this.mServices = new ArrayMap<>();
        }

        public void addService(BPackage.Service service) {
            this.mServices.put(service.getComponentName(), service);
            int size = service.intents.size();
            for (int i = 0; i < size; i++) {
                addFilter((BPackage.ServiceIntentInfo) service.intents.get(i));
            }
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IntentResolver
        public ResolveInfo newResult(BPackage.ServiceIntentInfo serviceIntentInfo, int i, int i2) {
            BPackage.Service service = serviceIntentInfo.service;
            BPackageSettings bPackageSettings = service.owner.mExtras;
            if (bPackageSettings == null) {
                return null;
            }
            ServiceInfo generateServiceInfo = PackageManagerCompat.generateServiceInfo(service, this.mFlags, bPackageSettings.readUserState(i2), i2);
            ResolveInfo resolveInfo = new ResolveInfo();
            resolveInfo.serviceInfo = generateServiceInfo;
            if ((this.mFlags & 64) != 0) {
                resolveInfo.filter = serviceIntentInfo.intentFilter;
            }
            resolveInfo.priority = serviceIntentInfo.intentFilter.getPriority();
            resolveInfo.preferredOrder = service.owner.mPreferredOrder;
            resolveInfo.match = i;
            resolveInfo.isDefault = serviceIntentInfo.hasDefault;
            resolveInfo.labelRes = serviceIntentInfo.labelRes;
            resolveInfo.nonLocalizedLabel = serviceIntentInfo.nonLocalizedLabel;
            resolveInfo.icon = serviceIntentInfo.icon;
            return resolveInfo;
        }

        public List<ResolveInfo> queryIntent(Intent intent, String str, int i, int i2) {
            this.mFlags = i;
            return super.queryIntent(intent, str, (i & 65536) != 0, i2);
        }

        public List<ResolveInfo> queryIntentForPackage(Intent intent, String str, int i, List<BPackage.Service> list, int i2) {
            if (list == null) {
                return null;
            }
            this.mFlags = i;
            boolean z = (i & 65536) != 0;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                ArrayList<II> arrayList2 = list.get(i3).intents;
                if (arrayList2 != 0 && arrayList2.size() > 0) {
                    BPackage.ServiceIntentInfo[] serviceIntentInfoArr = new BPackage.ServiceIntentInfo[arrayList2.size()];
                    arrayList2.toArray(serviceIntentInfoArr);
                    arrayList.add(serviceIntentInfoArr);
                }
            }
            return super.queryIntentFromList(intent, str, z, arrayList, i2);
        }

        public void removeService(BPackage.Service service) {
            this.mServices.remove(service.getComponentName());
            int size = service.intents.size();
            for (int i = 0; i < size; i++) {
                removeFilter((BPackage.ServiceIntentInfo) service.intents.get(i));
            }
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IntentResolver
        public boolean isPackageForFilter(String str, BPackage.ServiceIntentInfo serviceIntentInfo) {
            return str.equals(serviceIntentInfo.service.owner.packageName);
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IntentResolver
        public BPackage.ServiceIntentInfo[] newArray(int i) {
            return new BPackage.ServiceIntentInfo[i];
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IntentResolver
        public List<ResolveInfo> queryIntent(Intent intent, String str, boolean z, int i) {
            this.mFlags = z ? 65536 : 0;
            return super.queryIntent(intent, str, z, i);
        }
    }

    private void addActivitiesLocked(BPackage bPackage, List<BPackage.ActivityIntentInfo> list) {
        int size = bPackage.activities.size();
        for (int i = 0; i < size; i++) {
            BPackage.Activity activity = bPackage.activities.get(i);
            ActivityInfo activityInfo = activity.info;
            activityInfo.processName = BPackageManagerService.fixProcessName(bPackage.applicationInfo.processName, activityInfo.processName);
            this.mActivities.addActivity(activity, "activity", list);
        }
    }

    private void addProvidersLocked(BPackage bPackage) {
        ComponentName componentName;
        int size = bPackage.providers.size();
        for (int i = 0; i < size; i++) {
            BPackage.Provider provider = bPackage.providers.get(i);
            ProviderInfo providerInfo = provider.info;
            providerInfo.processName = BPackageManagerService.fixProcessName(bPackage.applicationInfo.processName, providerInfo.processName);
            this.mProviders.addProvider(provider);
            String str = provider.info.authority;
            if (str != null) {
                String[] split = str.split(";");
                provider.info.authority = null;
                for (String str2 : split) {
                    if (this.mProvidersByAuthority.containsKey(str2)) {
                        BPackage.Provider provider2 = this.mProvidersByAuthority.get(str2);
                        Slog.m12w(TAG, "Skipping provider name " + str2 + " (in package " + bPackage.applicationInfo.packageName + "): name already used by " + (((provider2 == null || provider2.getComponentName() == null) ? null : provider2.getComponentName()) != null ? componentName.getPackageName() : "?"));
                    } else {
                        this.mProvidersByAuthority.put(str2, provider);
                        ProviderInfo providerInfo2 = provider.info;
                        if (providerInfo2.authority != null) {
                            str2 = provider.info.authority + ";" + str2;
                        }
                        providerInfo2.authority = str2;
                    }
                }
            }
        }
    }

    private void addReceiversLocked(BPackage bPackage) {
        int size = bPackage.receivers.size();
        for (int i = 0; i < size; i++) {
            BPackage.Activity activity = bPackage.receivers.get(i);
            ActivityInfo activityInfo = activity.info;
            activityInfo.processName = BPackageManagerService.fixProcessName(bPackage.applicationInfo.processName, activityInfo.processName);
            this.mReceivers.addActivity(activity, "receiver", null);
        }
    }

    private void addServicesLocked(BPackage bPackage) {
        int size = bPackage.services.size();
        for (int i = 0; i < size; i++) {
            BPackage.Service service = bPackage.services.get(i);
            ServiceInfo serviceInfo = service.info;
            serviceInfo.processName = BPackageManagerService.fixProcessName(bPackage.applicationInfo.processName, serviceInfo.processName);
            this.mServices.addService(service);
        }
    }

    private void removeAllComponentsLocked(BPackage bPackage) {
        int size = bPackage.activities.size();
        for (int i = 0; i < size; i++) {
            this.mActivities.removeActivity(bPackage.activities.get(i), "activity");
        }
        int size2 = bPackage.providers.size();
        for (int i2 = 0; i2 < size2; i2++) {
            BPackage.Provider provider = bPackage.providers.get(i2);
            this.mProviders.removeProvider(provider);
            String str = provider.info.authority;
            if (str != null) {
                String[] split = str.split(";");
                for (int i3 = 0; i3 < split.length; i3++) {
                    if (this.mProvidersByAuthority.get(split[i3]) == provider) {
                        this.mProvidersByAuthority.remove(split[i3]);
                    }
                }
                this.mProvidersByAuthority.remove(provider.info.authority);
            }
        }
        int size3 = bPackage.receivers.size();
        for (int i4 = 0; i4 < size3; i4++) {
            this.mReceivers.removeActivity(bPackage.receivers.get(i4), "receiver");
        }
        int size4 = bPackage.services.size();
        for (int i5 = 0; i5 < size4; i5++) {
            this.mServices.removeService(bPackage.services.get(i5));
        }
    }

    public void addAllComponents(BPackage bPackage) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mLock) {
            addActivitiesLocked(bPackage, arrayList);
            addServicesLocked(bPackage);
            addProvidersLocked(bPackage);
            addReceiversLocked(bPackage);
        }
    }

    public BPackage.Activity getActivity(ComponentName componentName) {
        BPackage.Activity activity;
        synchronized (this.mLock) {
            activity = (BPackage.Activity) this.mActivities.mActivities.get(componentName);
        }
        return activity;
    }

    public BPackage.Provider getProvider(ComponentName componentName) {
        BPackage.Provider provider;
        synchronized (this.mLock) {
            provider = (BPackage.Provider) this.mProviders.mProviders.get(componentName);
        }
        return provider;
    }

    public BPackage.Activity getReceiver(ComponentName componentName) {
        BPackage.Activity activity;
        synchronized (this.mLock) {
            activity = (BPackage.Activity) this.mReceivers.mActivities.get(componentName);
        }
        return activity;
    }

    public BPackage.Service getService(ComponentName componentName) {
        BPackage.Service service;
        synchronized (this.mLock) {
            service = (BPackage.Service) this.mServices.mServices.get(componentName);
        }
        return service;
    }

    public List<ResolveInfo> queryActivities(Intent intent, String str, int i, int i2) {
        List<ResolveInfo> queryIntent;
        synchronized (this.mLock) {
            queryIntent = this.mActivities.queryIntent(intent, str, i, i2);
        }
        return queryIntent;
    }

    public ProviderInfo queryProvider(String str, int i, int i2) {
        synchronized (this.mLock) {
            BPackage.Provider provider = this.mProvidersByAuthority.get(str);
            if (provider == null) {
                return null;
            }
            return PackageManagerCompat.generateProviderInfo(provider, i, provider.owner.mExtras.readUserState(i2), i2);
        }
    }

    public List<ResolveInfo> queryProviders(Intent intent, String str, int i, int i2) {
        List<ResolveInfo> queryIntent;
        synchronized (this.mLock) {
            queryIntent = this.mProviders.queryIntent(intent, str, i, i2);
        }
        return queryIntent;
    }

    public List<ResolveInfo> queryReceivers(Intent intent, String str, int i, int i2) {
        List<ResolveInfo> queryIntent;
        synchronized (this.mLock) {
            queryIntent = this.mReceivers.queryIntent(intent, str, i, i2);
        }
        return queryIntent;
    }

    public List<ResolveInfo> queryServices(Intent intent, String str, int i, int i2) {
        List<ResolveInfo> queryIntent;
        synchronized (this.mLock) {
            queryIntent = this.mServices.queryIntent(intent, str, i, i2);
        }
        return queryIntent;
    }

    public void removeAllComponents(BPackage bPackage) {
        synchronized (this.mLock) {
            removeAllComponentsLocked(bPackage);
        }
    }

    public List<ResolveInfo> queryActivities(Intent intent, String str, int i, List<BPackage.Activity> list, int i2) {
        List<ResolveInfo> queryIntentForPackage;
        synchronized (this.mLock) {
            queryIntentForPackage = this.mActivities.queryIntentForPackage(intent, str, i, list, i2);
        }
        return queryIntentForPackage;
    }

    public List<ResolveInfo> queryProviders(Intent intent, String str, int i, List<BPackage.Provider> list, int i2) {
        List<ResolveInfo> queryIntentForPackage;
        synchronized (this.mLock) {
            queryIntentForPackage = this.mProviders.queryIntentForPackage(intent, str, i, list, i2);
        }
        return queryIntentForPackage;
    }

    public List<ResolveInfo> queryReceivers(Intent intent, String str, int i, List<BPackage.Activity> list, int i2) {
        List<ResolveInfo> queryIntentForPackage;
        synchronized (this.mLock) {
            queryIntentForPackage = this.mReceivers.queryIntentForPackage(intent, str, i, list, i2);
        }
        return queryIntentForPackage;
    }

    public List<ResolveInfo> queryServices(Intent intent, String str, int i, List<BPackage.Service> list, int i2) {
        List<ResolveInfo> queryIntentForPackage;
        synchronized (this.mLock) {
            queryIntentForPackage = this.mServices.queryIntentForPackage(intent, str, i, list, i2);
        }
        return queryIntentForPackage;
    }

    public List<ProviderInfo> queryProviders(String str, String str2, int i, int i2) {
        ProviderInfo generateProviderInfo;
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        synchronized (this.mLock) {
            for (int size = this.mProviders.mProviders.size() - 1; size >= 0; size--) {
                BPackage.Provider provider = (BPackage.Provider) this.mProviders.mProviders.valueAt(size);
                BPackageSettings bPackageSettings = provider.owner.mExtras;
                if (bPackageSettings != null) {
                    ProviderInfo providerInfo = provider.info;
                    if (providerInfo.authority != null && ((str == null || providerInfo.processName.equals(str)) && ((str2 == null || ((bundle = provider.metaData) != null && bundle.containsKey(str2))) && (generateProviderInfo = PackageManagerCompat.generateProviderInfo(provider, i, bPackageSettings.readUserState(i2), i2)) != null))) {
                        arrayList.add(generateProviderInfo);
                    }
                }
            }
        }
        return arrayList;
    }
}

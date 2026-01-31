package top.niunaijun.blackbox.core.system.p027pm;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import top.niunaijun.blackbox.entity.p029pm.InstallOption;
import top.niunaijun.blackbox.entity.p029pm.InstallResult;
import top.niunaijun.blackbox.entity.p029pm.InstalledPackage;
/* renamed from: top.niunaijun.blackbox.core.system.pm.IBPackageManagerService */
/* loaded from: classes3.dex */
public interface IBPackageManagerService extends IInterface {
    public static final String DESCRIPTOR = "top.niunaijun.blackbox.core.system.pm.IBPackageManagerService";

    /* renamed from: top.niunaijun.blackbox.core.system.pm.IBPackageManagerService$Default */
    /* loaded from: classes3.dex */
    public static class Default implements IBPackageManagerService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
        public void clearPackage(String str, int i) {
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
        public void deleteUser(int i) {
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
        public ActivityInfo getActivityInfo(ComponentName componentName, int i, int i2) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
        public ApplicationInfo getApplicationInfo(String str, int i, int i2) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
        public List<ApplicationInfo> getInstalledApplications(int i, int i2) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
        public List<PackageInfo> getInstalledPackages(int i, int i2) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
        public List<InstalledPackage> getInstalledPackagesAsUser(int i) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
        public PackageInfo getPackageInfo(String str, int i, int i2) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
        public String[] getPackagesForUid(int i, int i2) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
        public ProviderInfo getProviderInfo(ComponentName componentName, int i, int i2) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
        public ActivityInfo getReceiverInfo(ComponentName componentName, int i, int i2) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
        public ServiceInfo getServiceInfo(ComponentName componentName, int i, int i2) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
        public InstallResult installPackageAsUser(String str, InstallOption installOption, int i) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
        public boolean isInstalled(String str, int i) {
            return false;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
        public List<ResolveInfo> queryBroadcastReceivers(Intent intent, int i, String str, int i2) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
        public List<ProviderInfo> queryContentProviders(String str, int i, int i2, int i3) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
        public List<ResolveInfo> queryIntentActivities(Intent intent, int i, String str, int i2) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
        public List<ResolveInfo> queryIntentServices(Intent intent, int i, int i2) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
        public ResolveInfo resolveActivity(Intent intent, int i, String str, int i2) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
        public ProviderInfo resolveContentProvider(String str, int i, int i2) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
        public ResolveInfo resolveIntent(Intent intent, String str, int i, int i2) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
        public ResolveInfo resolveService(Intent intent, int i, String str, int i2) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
        public void stopPackage(String str, int i) {
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
        public void uninstallPackage(String str) {
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
        public void uninstallPackageAsUser(String str, int i) {
        }
    }

    /* renamed from: top.niunaijun.blackbox.core.system.pm.IBPackageManagerService$Stub */
    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IBPackageManagerService {
        static final int TRANSACTION_clearPackage = 20;
        static final int TRANSACTION_deleteUser = 22;
        static final int TRANSACTION_getActivityInfo = 9;
        static final int TRANSACTION_getApplicationInfo = 5;
        static final int TRANSACTION_getInstalledApplications = 11;
        static final int TRANSACTION_getInstalledPackages = 12;
        static final int TRANSACTION_getInstalledPackagesAsUser = 24;
        static final int TRANSACTION_getPackageInfo = 6;
        static final int TRANSACTION_getPackagesForUid = 25;
        static final int TRANSACTION_getProviderInfo = 10;
        static final int TRANSACTION_getReceiverInfo = 8;
        static final int TRANSACTION_getServiceInfo = 7;
        static final int TRANSACTION_installPackageAsUser = 17;
        static final int TRANSACTION_isInstalled = 23;
        static final int TRANSACTION_queryBroadcastReceivers = 14;
        static final int TRANSACTION_queryContentProviders = 16;
        static final int TRANSACTION_queryIntentActivities = 13;
        static final int TRANSACTION_queryIntentServices = 15;
        static final int TRANSACTION_resolveActivity = 2;
        static final int TRANSACTION_resolveContentProvider = 3;
        static final int TRANSACTION_resolveIntent = 4;
        static final int TRANSACTION_resolveService = 1;
        static final int TRANSACTION_stopPackage = 21;
        static final int TRANSACTION_uninstallPackage = 19;
        static final int TRANSACTION_uninstallPackageAsUser = 18;

        /* renamed from: top.niunaijun.blackbox.core.system.pm.IBPackageManagerService$Stub$Proxy */
        /* loaded from: classes3.dex */
        public static class Proxy implements IBPackageManagerService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
            public void clearPackage(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
            public void deleteUser(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageManagerService.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
            public ActivityInfo getActivityInfo(ComponentName componentName, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, componentName, 0);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ActivityInfo) _Parcel.readTypedObject(obtain2, ActivityInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
            public ApplicationInfo getApplicationInfo(String str, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ApplicationInfo) _Parcel.readTypedObject(obtain2, ApplicationInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
            public List<ApplicationInfo> getInstalledApplications(int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageManagerService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ApplicationInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
            public List<PackageInfo> getInstalledPackages(int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageManagerService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(PackageInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
            public List<InstalledPackage> getInstalledPackagesAsUser(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageManagerService.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(InstalledPackage.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IBPackageManagerService.DESCRIPTOR;
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
            public PackageInfo getPackageInfo(String str, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return (PackageInfo) _Parcel.readTypedObject(obtain2, PackageInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
            public String[] getPackagesForUid(int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageManagerService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createStringArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
            public ProviderInfo getProviderInfo(ComponentName componentName, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, componentName, 0);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ProviderInfo) _Parcel.readTypedObject(obtain2, ProviderInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
            public ActivityInfo getReceiverInfo(ComponentName componentName, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, componentName, 0);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ActivityInfo) _Parcel.readTypedObject(obtain2, ActivityInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
            public ServiceInfo getServiceInfo(ComponentName componentName, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, componentName, 0);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ServiceInfo) _Parcel.readTypedObject(obtain2, ServiceInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
            public InstallResult installPackageAsUser(String str, InstallOption installOption, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, installOption, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    return (InstallResult) _Parcel.readTypedObject(obtain2, InstallResult.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
            public boolean isInstalled(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
            public List<ResolveInfo> queryBroadcastReceivers(Intent intent, int i, String str, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, intent, 0);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    this.mRemote.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ResolveInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
            public List<ProviderInfo> queryContentProviders(String str, int i, int i2, int i3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    this.mRemote.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ProviderInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
            public List<ResolveInfo> queryIntentActivities(Intent intent, int i, String str, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, intent, 0);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    this.mRemote.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ResolveInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
            public List<ResolveInfo> queryIntentServices(Intent intent, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, intent, 0);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ResolveInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
            public ResolveInfo resolveActivity(Intent intent, int i, String str, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, intent, 0);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ResolveInfo) _Parcel.readTypedObject(obtain2, ResolveInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
            public ProviderInfo resolveContentProvider(String str, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ProviderInfo) _Parcel.readTypedObject(obtain2, ProviderInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
            public ResolveInfo resolveIntent(Intent intent, String str, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, intent, 0);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ResolveInfo) _Parcel.readTypedObject(obtain2, ResolveInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
            public ResolveInfo resolveService(Intent intent, int i, String str, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, intent, 0);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ResolveInfo) _Parcel.readTypedObject(obtain2, ResolveInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
            public void stopPackage(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
            public void uninstallPackage(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageManagerService
            public void uninstallPackageAsUser(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IBPackageManagerService.DESCRIPTOR);
        }

        public static IBPackageManagerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IBPackageManagerService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IBPackageManagerService)) ? new Proxy(iBinder) : (IBPackageManagerService) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Parcelable resolveService;
            List installedApplications;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IBPackageManagerService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IBPackageManagerService.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    resolveService = resolveService((Intent) _Parcel.readTypedObject(parcel, Intent.CREATOR), parcel.readInt(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, resolveService, 1);
                    break;
                case 2:
                    resolveService = resolveActivity((Intent) _Parcel.readTypedObject(parcel, Intent.CREATOR), parcel.readInt(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, resolveService, 1);
                    break;
                case 3:
                    resolveService = resolveContentProvider(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, resolveService, 1);
                    break;
                case 4:
                    resolveService = resolveIntent((Intent) _Parcel.readTypedObject(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, resolveService, 1);
                    break;
                case 5:
                    resolveService = getApplicationInfo(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, resolveService, 1);
                    break;
                case 6:
                    resolveService = getPackageInfo(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, resolveService, 1);
                    break;
                case 7:
                    resolveService = getServiceInfo((ComponentName) _Parcel.readTypedObject(parcel, ComponentName.CREATOR), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, resolveService, 1);
                    break;
                case 8:
                    resolveService = getReceiverInfo((ComponentName) _Parcel.readTypedObject(parcel, ComponentName.CREATOR), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, resolveService, 1);
                    break;
                case 9:
                    resolveService = getActivityInfo((ComponentName) _Parcel.readTypedObject(parcel, ComponentName.CREATOR), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, resolveService, 1);
                    break;
                case 10:
                    resolveService = getProviderInfo((ComponentName) _Parcel.readTypedObject(parcel, ComponentName.CREATOR), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, resolveService, 1);
                    break;
                case 11:
                    installedApplications = getInstalledApplications(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedList(parcel2, installedApplications, 1);
                    break;
                case 12:
                    installedApplications = getInstalledPackages(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedList(parcel2, installedApplications, 1);
                    break;
                case 13:
                    installedApplications = queryIntentActivities((Intent) _Parcel.readTypedObject(parcel, Intent.CREATOR), parcel.readInt(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedList(parcel2, installedApplications, 1);
                    break;
                case 14:
                    installedApplications = queryBroadcastReceivers((Intent) _Parcel.readTypedObject(parcel, Intent.CREATOR), parcel.readInt(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedList(parcel2, installedApplications, 1);
                    break;
                case 15:
                    installedApplications = queryIntentServices((Intent) _Parcel.readTypedObject(parcel, Intent.CREATOR), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedList(parcel2, installedApplications, 1);
                    break;
                case 16:
                    installedApplications = queryContentProviders(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedList(parcel2, installedApplications, 1);
                    break;
                case 17:
                    resolveService = installPackageAsUser(parcel.readString(), (InstallOption) _Parcel.readTypedObject(parcel, InstallOption.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, resolveService, 1);
                    break;
                case 18:
                    uninstallPackageAsUser(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 19:
                    uninstallPackage(parcel.readString());
                    parcel2.writeNoException();
                    break;
                case 20:
                    clearPackage(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 21:
                    stopPackage(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 22:
                    deleteUser(parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 23:
                    boolean isInstalled = isInstalled(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(isInstalled ? 1 : 0);
                    break;
                case 24:
                    installedApplications = getInstalledPackagesAsUser(parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedList(parcel2, installedApplications, 1);
                    break;
                case 25:
                    String[] packagesForUid = getPackagesForUid(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStringArray(packagesForUid);
                    break;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }
    }

    /* renamed from: top.niunaijun.blackbox.core.system.pm.IBPackageManagerService$_Parcel */
    /* loaded from: classes3.dex */
    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedList(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                writeTypedObject(parcel, list.get(i2), i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            t.writeToParcel(parcel, i);
        }
    }

    void clearPackage(String str, int i);

    void deleteUser(int i);

    ActivityInfo getActivityInfo(ComponentName componentName, int i, int i2);

    ApplicationInfo getApplicationInfo(String str, int i, int i2);

    List<ApplicationInfo> getInstalledApplications(int i, int i2);

    List<PackageInfo> getInstalledPackages(int i, int i2);

    List<InstalledPackage> getInstalledPackagesAsUser(int i);

    PackageInfo getPackageInfo(String str, int i, int i2);

    String[] getPackagesForUid(int i, int i2);

    ProviderInfo getProviderInfo(ComponentName componentName, int i, int i2);

    ActivityInfo getReceiverInfo(ComponentName componentName, int i, int i2);

    ServiceInfo getServiceInfo(ComponentName componentName, int i, int i2);

    InstallResult installPackageAsUser(String str, InstallOption installOption, int i);

    boolean isInstalled(String str, int i);

    List<ResolveInfo> queryBroadcastReceivers(Intent intent, int i, String str, int i2);

    List<ProviderInfo> queryContentProviders(String str, int i, int i2, int i3);

    List<ResolveInfo> queryIntentActivities(Intent intent, int i, String str, int i2);

    List<ResolveInfo> queryIntentServices(Intent intent, int i, int i2);

    ResolveInfo resolveActivity(Intent intent, int i, String str, int i2);

    ProviderInfo resolveContentProvider(String str, int i, int i2);

    ResolveInfo resolveIntent(Intent intent, String str, int i, int i2);

    ResolveInfo resolveService(Intent intent, int i, String str, int i2);

    void stopPackage(String str, int i);

    void uninstallPackage(String str);

    void uninstallPackageAsUser(String str, int i);
}

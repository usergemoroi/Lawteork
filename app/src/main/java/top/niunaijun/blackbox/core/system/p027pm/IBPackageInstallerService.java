package top.niunaijun.blackbox.core.system.p027pm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: top.niunaijun.blackbox.core.system.pm.IBPackageInstallerService */
/* loaded from: classes3.dex */
public interface IBPackageInstallerService extends IInterface {
    public static final String DESCRIPTOR = "top.niunaijun.blackbox.core.system.pm.IBPackageInstallerService";

    /* renamed from: top.niunaijun.blackbox.core.system.pm.IBPackageInstallerService$Default */
    /* loaded from: classes3.dex */
    public static class Default implements IBPackageInstallerService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageInstallerService
        public int clearPackage(BPackageSettings bPackageSettings, int i) {
            return 0;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageInstallerService
        public int installPackageAsUser(BPackageSettings bPackageSettings, int i) {
            return 0;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageInstallerService
        public int uninstallPackageAsUser(BPackageSettings bPackageSettings, boolean z, int i) {
            return 0;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageInstallerService
        public int updatePackage(BPackageSettings bPackageSettings) {
            return 0;
        }
    }

    /* renamed from: top.niunaijun.blackbox.core.system.pm.IBPackageInstallerService$Stub */
    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IBPackageInstallerService {
        static final int TRANSACTION_clearPackage = 3;
        static final int TRANSACTION_installPackageAsUser = 1;
        static final int TRANSACTION_uninstallPackageAsUser = 2;
        static final int TRANSACTION_updatePackage = 4;

        /* renamed from: top.niunaijun.blackbox.core.system.pm.IBPackageInstallerService$Stub$Proxy */
        /* loaded from: classes3.dex */
        public static class Proxy implements IBPackageInstallerService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageInstallerService
            public int clearPackage(BPackageSettings bPackageSettings, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageInstallerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, bPackageSettings, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IBPackageInstallerService.DESCRIPTOR;
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageInstallerService
            public int installPackageAsUser(BPackageSettings bPackageSettings, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageInstallerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, bPackageSettings, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageInstallerService
            public int uninstallPackageAsUser(BPackageSettings bPackageSettings, boolean z, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageInstallerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, bPackageSettings, 0);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBPackageInstallerService
            public int updatePackage(BPackageSettings bPackageSettings) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBPackageInstallerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, bPackageSettings, 0);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IBPackageInstallerService.DESCRIPTOR);
        }

        public static IBPackageInstallerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IBPackageInstallerService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IBPackageInstallerService)) ? new Proxy(iBinder) : (IBPackageInstallerService) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int installPackageAsUser;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IBPackageInstallerService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IBPackageInstallerService.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    installPackageAsUser = installPackageAsUser((BPackageSettings) _Parcel.readTypedObject(parcel, BPackageSettings.CREATOR), parcel.readInt());
                    break;
                case 2:
                    installPackageAsUser = uninstallPackageAsUser((BPackageSettings) _Parcel.readTypedObject(parcel, BPackageSettings.CREATOR), parcel.readInt() != 0, parcel.readInt());
                    break;
                case 3:
                    installPackageAsUser = clearPackage((BPackageSettings) _Parcel.readTypedObject(parcel, BPackageSettings.CREATOR), parcel.readInt());
                    break;
                case 4:
                    installPackageAsUser = updatePackage((BPackageSettings) _Parcel.readTypedObject(parcel, BPackageSettings.CREATOR));
                    break;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeNoException();
            parcel2.writeInt(installPackageAsUser);
            return true;
        }
    }

    /* renamed from: top.niunaijun.blackbox.core.system.pm.IBPackageInstallerService$_Parcel */
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
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            t.writeToParcel(parcel, i);
        }
    }

    int clearPackage(BPackageSettings bPackageSettings, int i);

    int installPackageAsUser(BPackageSettings bPackageSettings, int i);

    int uninstallPackageAsUser(BPackageSettings bPackageSettings, boolean z, int i);

    int updatePackage(BPackageSettings bPackageSettings);
}

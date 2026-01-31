package top.niunaijun.blackbox.core.system.p027pm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import top.niunaijun.blackbox.entity.p029pm.InstalledModule;
/* renamed from: top.niunaijun.blackbox.core.system.pm.IBXposedManagerService */
/* loaded from: classes3.dex */
public interface IBXposedManagerService extends IInterface {
    public static final String DESCRIPTOR = "top.niunaijun.blackbox.core.system.pm.IBXposedManagerService";

    /* renamed from: top.niunaijun.blackbox.core.system.pm.IBXposedManagerService$Default */
    /* loaded from: classes3.dex */
    public static class Default implements IBXposedManagerService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBXposedManagerService
        public List<InstalledModule> getInstalledModules() {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBXposedManagerService
        public boolean isModuleEnable(String str) {
            return false;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBXposedManagerService
        public boolean isXPEnable() {
            return false;
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBXposedManagerService
        public void setModuleEnable(String str, boolean z) {
        }

        @Override // top.niunaijun.blackbox.core.system.p027pm.IBXposedManagerService
        public void setXPEnable(boolean z) {
        }
    }

    /* renamed from: top.niunaijun.blackbox.core.system.pm.IBXposedManagerService$Stub */
    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IBXposedManagerService {
        static final int TRANSACTION_getInstalledModules = 5;
        static final int TRANSACTION_isModuleEnable = 3;
        static final int TRANSACTION_isXPEnable = 1;
        static final int TRANSACTION_setModuleEnable = 4;
        static final int TRANSACTION_setXPEnable = 2;

        /* renamed from: top.niunaijun.blackbox.core.system.pm.IBXposedManagerService$Stub$Proxy */
        /* loaded from: classes3.dex */
        public static class Proxy implements IBXposedManagerService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBXposedManagerService
            public List<InstalledModule> getInstalledModules() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBXposedManagerService.DESCRIPTOR);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(InstalledModule.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IBXposedManagerService.DESCRIPTOR;
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBXposedManagerService
            public boolean isModuleEnable(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBXposedManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBXposedManagerService
            public boolean isXPEnable() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBXposedManagerService.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBXposedManagerService
            public void setModuleEnable(String str, boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBXposedManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p027pm.IBXposedManagerService
            public void setXPEnable(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBXposedManagerService.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IBXposedManagerService.DESCRIPTOR);
        }

        public static IBXposedManagerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IBXposedManagerService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IBXposedManagerService)) ? new Proxy(iBinder) : (IBXposedManagerService) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IBXposedManagerService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IBXposedManagerService.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    i3 = isXPEnable();
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    break;
                case 2:
                    setXPEnable(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    break;
                case 3:
                    i3 = isModuleEnable(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    break;
                case 4:
                    setModuleEnable(parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    break;
                case 5:
                    List<InstalledModule> installedModules = getInstalledModules();
                    parcel2.writeNoException();
                    _Parcel.writeTypedList(parcel2, installedModules, 1);
                    break;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }
    }

    /* renamed from: top.niunaijun.blackbox.core.system.pm.IBXposedManagerService$_Parcel */
    /* loaded from: classes3.dex */
    public static class _Parcel {
        private static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
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

        private static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            t.writeToParcel(parcel, i);
        }
    }

    List<InstalledModule> getInstalledModules();

    boolean isModuleEnable(String str);

    boolean isXPEnable();

    void setModuleEnable(String str, boolean z);

    void setXPEnable(boolean z);
}

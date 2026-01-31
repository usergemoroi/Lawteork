package android.content.p001pm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: android.content.pm.IPackageInstallObserver */
/* loaded from: classes.dex */
public interface IPackageInstallObserver extends IInterface {
    public static final String DESCRIPTOR = "android.content.pm.IPackageInstallObserver";

    /* renamed from: android.content.pm.IPackageInstallObserver$Default */
    /* loaded from: classes.dex */
    public static class Default implements IPackageInstallObserver {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.content.p001pm.IPackageInstallObserver
        public void packageInstalled(String str, int i) {
        }
    }

    /* renamed from: android.content.pm.IPackageInstallObserver$Stub */
    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IPackageInstallObserver {
        static final int TRANSACTION_packageInstalled = 1;

        /* renamed from: android.content.pm.IPackageInstallObserver$Stub$Proxy */
        /* loaded from: classes.dex */
        public static class Proxy implements IPackageInstallObserver {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IPackageInstallObserver.DESCRIPTOR;
            }

            @Override // android.content.p001pm.IPackageInstallObserver
            public void packageInstalled(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IPackageInstallObserver.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IPackageInstallObserver.DESCRIPTOR);
        }

        public static IPackageInstallObserver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IPackageInstallObserver.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IPackageInstallObserver)) ? new Proxy(iBinder) : (IPackageInstallObserver) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IPackageInstallObserver.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IPackageInstallObserver.DESCRIPTOR);
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                packageInstalled(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
        }
    }

    void packageInstalled(String str, int i);
}

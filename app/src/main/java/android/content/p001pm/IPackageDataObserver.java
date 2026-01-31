package android.content.p001pm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: android.content.pm.IPackageDataObserver */
/* loaded from: classes.dex */
public interface IPackageDataObserver extends IInterface {

    /* renamed from: android.content.pm.IPackageDataObserver$Default */
    /* loaded from: classes.dex */
    public static class Default implements IPackageDataObserver {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.content.p001pm.IPackageDataObserver
        public void onRemoveCompleted(String str, boolean z) {
        }
    }

    /* renamed from: android.content.pm.IPackageDataObserver$Stub */
    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IPackageDataObserver {
        public static final String DESCRIPTOR = "android.content.pm.IPackageDataObserver";
        static final int TRANSACTION_onRemoveCompleted = 1;

        /* renamed from: android.content.pm.IPackageDataObserver$Stub$Proxy */
        /* loaded from: classes.dex */
        public static class Proxy implements IPackageDataObserver {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // android.content.p001pm.IPackageDataObserver
            public void onRemoveCompleted(String str, boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IPackageDataObserver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IPackageDataObserver)) ? new Proxy(iBinder) : (IPackageDataObserver) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                onRemoveCompleted(parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            }
        }
    }

    void onRemoveCompleted(String str, boolean z);
}

package android.content.p001pm;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: android.content.pm.IPackageDeleteObserver2 */
/* loaded from: classes.dex */
public interface IPackageDeleteObserver2 extends IInterface {

    /* renamed from: android.content.pm.IPackageDeleteObserver2$Default */
    /* loaded from: classes.dex */
    public static class Default implements IPackageDeleteObserver2 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.content.p001pm.IPackageDeleteObserver2
        public void onPackageDeleted(String str, int i, String str2) {
        }

        @Override // android.content.p001pm.IPackageDeleteObserver2
        public void onUserActionRequired(Intent intent) {
        }
    }

    /* renamed from: android.content.pm.IPackageDeleteObserver2$Stub */
    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IPackageDeleteObserver2 {
        public static final String DESCRIPTOR = "android.content.pm.IPackageDeleteObserver2";
        static final int TRANSACTION_onPackageDeleted = 2;
        static final int TRANSACTION_onUserActionRequired = 1;

        /* renamed from: android.content.pm.IPackageDeleteObserver2$Stub$Proxy */
        /* loaded from: classes.dex */
        public static class Proxy implements IPackageDeleteObserver2 {
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

            @Override // android.content.p001pm.IPackageDeleteObserver2
            public void onPackageDeleted(String str, int i, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.content.p001pm.IPackageDeleteObserver2
            public void onUserActionRequired(Intent intent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, intent, 0);
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

        public static IPackageDeleteObserver2 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IPackageDeleteObserver2)) ? new Proxy(iBinder) : (IPackageDeleteObserver2) queryLocalInterface;
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
            }
            if (i == 1) {
                onUserActionRequired((Intent) _Parcel.readTypedObject(parcel, Intent.CREATOR));
            } else if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                onPackageDeleted(parcel.readString(), parcel.readInt(), parcel.readString());
            }
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: android.content.pm.IPackageDeleteObserver2$_Parcel */
    /* loaded from: classes.dex */
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

    void onPackageDeleted(String str, int i, String str2);

    void onUserActionRequired(Intent intent);
}

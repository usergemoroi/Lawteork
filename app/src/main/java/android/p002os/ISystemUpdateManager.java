package android.p002os;

import android.os.Parcelable;
/* renamed from: android.os.ISystemUpdateManager */
/* loaded from: classes.dex */
public interface ISystemUpdateManager extends IInterface {

    /* renamed from: android.os.ISystemUpdateManager$Default */
    /* loaded from: classes.dex */
    public static class Default implements ISystemUpdateManager {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.p002os.ISystemUpdateManager
        public Bundle retrieveSystemUpdateInfo() {
            return null;
        }

        @Override // android.p002os.ISystemUpdateManager
        public void updateSystemUpdateInfo(PersistableBundle persistableBundle) {
        }
    }

    /* renamed from: android.os.ISystemUpdateManager$Stub */
    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements ISystemUpdateManager {
        public static final String DESCRIPTOR = "android.os.ISystemUpdateManager";
        static final int TRANSACTION_retrieveSystemUpdateInfo = 1;
        static final int TRANSACTION_updateSystemUpdateInfo = 2;

        /* renamed from: android.os.ISystemUpdateManager$Stub$Proxy */
        /* loaded from: classes.dex */
        public static class Proxy implements ISystemUpdateManager {
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

            @Override // android.p002os.ISystemUpdateManager
            public Bundle retrieveSystemUpdateInfo() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) _Parcel.readTypedObject(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.p002os.ISystemUpdateManager
            public void updateSystemUpdateInfo(PersistableBundle persistableBundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, persistableBundle, 0);
                    this.mRemote.transact(2, obtain, obtain2, 0);
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

        public static ISystemUpdateManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ISystemUpdateManager)) ? new Proxy(iBinder) : (ISystemUpdateManager) queryLocalInterface;
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
                Bundle retrieveSystemUpdateInfo = retrieveSystemUpdateInfo();
                parcel2.writeNoException();
                _Parcel.writeTypedObject(parcel2, retrieveSystemUpdateInfo, 1);
            } else if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                updateSystemUpdateInfo((PersistableBundle) _Parcel.readTypedObject(parcel, PersistableBundle.CREATOR));
                parcel2.writeNoException();
            }
            return true;
        }
    }

    /* renamed from: android.os.ISystemUpdateManager$_Parcel */
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

    Bundle retrieveSystemUpdateInfo();

    void updateSystemUpdateInfo(PersistableBundle persistableBundle);
}

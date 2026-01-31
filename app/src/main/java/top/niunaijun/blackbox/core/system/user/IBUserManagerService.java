package top.niunaijun.blackbox.core.system.user;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* loaded from: classes3.dex */
public interface IBUserManagerService extends IInterface {
    public static final String DESCRIPTOR = "top.niunaijun.blackbox.core.system.user.IBUserManagerService";

    /* loaded from: classes3.dex */
    public static class Default implements IBUserManagerService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.user.IBUserManagerService
        public BUserInfo createUser(int i) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.user.IBUserManagerService
        public void deleteUser(int i) {
        }

        @Override // top.niunaijun.blackbox.core.system.user.IBUserManagerService
        public boolean exists(int i) {
            return false;
        }

        @Override // top.niunaijun.blackbox.core.system.user.IBUserManagerService
        public BUserInfo getUserInfo(int i) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.user.IBUserManagerService
        public List<BUserInfo> getUsers() {
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IBUserManagerService {
        static final int TRANSACTION_createUser = 3;
        static final int TRANSACTION_deleteUser = 5;
        static final int TRANSACTION_exists = 2;
        static final int TRANSACTION_getUserInfo = 1;
        static final int TRANSACTION_getUsers = 4;

        /* loaded from: classes3.dex */
        public static class Proxy implements IBUserManagerService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // top.niunaijun.blackbox.core.system.user.IBUserManagerService
            public BUserInfo createUser(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBUserManagerService.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return (BUserInfo) _Parcel.readTypedObject(obtain2, BUserInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.user.IBUserManagerService
            public void deleteUser(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBUserManagerService.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.user.IBUserManagerService
            public boolean exists(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBUserManagerService.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IBUserManagerService.DESCRIPTOR;
            }

            @Override // top.niunaijun.blackbox.core.system.user.IBUserManagerService
            public BUserInfo getUserInfo(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBUserManagerService.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return (BUserInfo) _Parcel.readTypedObject(obtain2, BUserInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.user.IBUserManagerService
            public List<BUserInfo> getUsers() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBUserManagerService.DESCRIPTOR);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(BUserInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IBUserManagerService.DESCRIPTOR);
        }

        public static IBUserManagerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IBUserManagerService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IBUserManagerService)) ? new Proxy(iBinder) : (IBUserManagerService) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            BUserInfo userInfo;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IBUserManagerService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IBUserManagerService.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    userInfo = getUserInfo(parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, userInfo, 1);
                    break;
                case 2:
                    boolean exists = exists(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(exists ? 1 : 0);
                    break;
                case 3:
                    userInfo = createUser(parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, userInfo, 1);
                    break;
                case 4:
                    List<BUserInfo> users = getUsers();
                    parcel2.writeNoException();
                    _Parcel.writeTypedList(parcel2, users, 1);
                    break;
                case 5:
                    deleteUser(parcel.readInt());
                    parcel2.writeNoException();
                    break;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }
    }

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

    BUserInfo createUser(int i);

    void deleteUser(int i);

    boolean exists(int i);

    BUserInfo getUserInfo(int i);

    List<BUserInfo> getUsers();
}

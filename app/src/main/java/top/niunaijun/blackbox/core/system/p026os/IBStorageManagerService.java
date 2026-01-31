package top.niunaijun.blackbox.core.system.p026os;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.storage.StorageVolume;
/* renamed from: top.niunaijun.blackbox.core.system.os.IBStorageManagerService */
/* loaded from: classes3.dex */
public interface IBStorageManagerService extends IInterface {
    public static final String DESCRIPTOR = "top.niunaijun.blackbox.core.system.os.IBStorageManagerService";

    /* renamed from: top.niunaijun.blackbox.core.system.os.IBStorageManagerService$Default */
    /* loaded from: classes3.dex */
    public static class Default implements IBStorageManagerService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p026os.IBStorageManagerService
        public Uri getUriForFile(String str) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p026os.IBStorageManagerService
        public StorageVolume[] getVolumeList(int i, String str, int i2, int i3) {
            return null;
        }
    }

    /* renamed from: top.niunaijun.blackbox.core.system.os.IBStorageManagerService$Stub */
    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IBStorageManagerService {
        static final int TRANSACTION_getUriForFile = 2;
        static final int TRANSACTION_getVolumeList = 1;

        /* renamed from: top.niunaijun.blackbox.core.system.os.IBStorageManagerService$Stub$Proxy */
        /* loaded from: classes3.dex */
        public static class Proxy implements IBStorageManagerService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IBStorageManagerService.DESCRIPTOR;
            }

            @Override // top.niunaijun.blackbox.core.system.p026os.IBStorageManagerService
            public Uri getUriForFile(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBStorageManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Uri) _Parcel.readTypedObject(obtain2, Uri.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p026os.IBStorageManagerService
            public StorageVolume[] getVolumeList(int i, String str, int i2, int i3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBStorageManagerService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return (StorageVolume[]) obtain2.createTypedArray(StorageVolume.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IBStorageManagerService.DESCRIPTOR);
        }

        public static IBStorageManagerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IBStorageManagerService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IBStorageManagerService)) ? new Proxy(iBinder) : (IBStorageManagerService) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IBStorageManagerService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IBStorageManagerService.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                StorageVolume[] volumeList = getVolumeList(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeTypedArray(volumeList, 1);
            } else if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                Uri uriForFile = getUriForFile(parcel.readString());
                parcel2.writeNoException();
                _Parcel.writeTypedObject(parcel2, uriForFile, 1);
            }
            return true;
        }
    }

    /* renamed from: top.niunaijun.blackbox.core.system.os.IBStorageManagerService$_Parcel */
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

    Uri getUriForFile(String str);

    StorageVolume[] getVolumeList(int i, String str, int i2, int i3);
}

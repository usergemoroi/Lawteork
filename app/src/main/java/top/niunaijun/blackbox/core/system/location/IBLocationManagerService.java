package top.niunaijun.blackbox.core.system.location;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import top.niunaijun.blackbox.entity.location.BCell;
import top.niunaijun.blackbox.entity.location.BLocation;
/* loaded from: classes3.dex */
public interface IBLocationManagerService extends IInterface {
    public static final String DESCRIPTOR = "top.niunaijun.blackbox.core.system.location.IBLocationManagerService";

    /* loaded from: classes3.dex */
    public static class Default implements IBLocationManagerService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
        public List<BCell> getAllCell(int i, String str) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
        public BCell getCell(int i, String str) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
        public BLocation getGlobalLocation() {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
        public List<BCell> getGlobalNeighboringCell() {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
        public BLocation getLocation(int i, String str) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
        public List<BCell> getNeighboringCell(int i, String str) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
        public int getPattern(int i, String str) {
            return 0;
        }

        @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
        public void removeUpdates(IBinder iBinder) {
        }

        @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
        public void requestLocationUpdates(IBinder iBinder, String str, int i) {
        }

        @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
        public void setAllCell(int i, String str, List<BCell> list) {
        }

        @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
        public void setCell(int i, String str, BCell bCell) {
        }

        @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
        public void setGlobalAllCell(List<BCell> list) {
        }

        @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
        public void setGlobalCell(BCell bCell) {
        }

        @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
        public void setGlobalLocation(BLocation bLocation) {
        }

        @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
        public void setGlobalNeighboringCell(List<BCell> list) {
        }

        @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
        public void setLocation(int i, String str, BLocation bLocation) {
        }

        @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
        public void setNeighboringCell(int i, String str, List<BCell> list) {
        }

        @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
        public void setPattern(int i, String str, int i2) {
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IBLocationManagerService {
        static final int TRANSACTION_getAllCell = 12;
        static final int TRANSACTION_getCell = 11;
        static final int TRANSACTION_getGlobalLocation = 16;
        static final int TRANSACTION_getGlobalNeighboringCell = 10;
        static final int TRANSACTION_getLocation = 14;
        static final int TRANSACTION_getNeighboringCell = 6;
        static final int TRANSACTION_getPattern = 1;
        static final int TRANSACTION_removeUpdates = 18;
        static final int TRANSACTION_requestLocationUpdates = 17;
        static final int TRANSACTION_setAllCell = 4;
        static final int TRANSACTION_setCell = 3;
        static final int TRANSACTION_setGlobalAllCell = 8;
        static final int TRANSACTION_setGlobalCell = 7;
        static final int TRANSACTION_setGlobalLocation = 15;
        static final int TRANSACTION_setGlobalNeighboringCell = 9;
        static final int TRANSACTION_setLocation = 13;
        static final int TRANSACTION_setNeighboringCell = 5;
        static final int TRANSACTION_setPattern = 2;

        /* loaded from: classes3.dex */
        public static class Proxy implements IBLocationManagerService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
            public List<BCell> getAllCell(int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBLocationManagerService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.mRemote.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(BCell.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
            public BCell getCell(int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBLocationManagerService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.mRemote.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return (BCell) _Parcel.readTypedObject(obtain2, BCell.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
            public BLocation getGlobalLocation() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBLocationManagerService.DESCRIPTOR);
                    this.mRemote.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    return (BLocation) _Parcel.readTypedObject(obtain2, BLocation.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
            public List<BCell> getGlobalNeighboringCell() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBLocationManagerService.DESCRIPTOR);
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(BCell.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IBLocationManagerService.DESCRIPTOR;
            }

            @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
            public BLocation getLocation(int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBLocationManagerService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.mRemote.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return (BLocation) _Parcel.readTypedObject(obtain2, BLocation.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
            public List<BCell> getNeighboringCell(int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBLocationManagerService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(BCell.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
            public int getPattern(int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBLocationManagerService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
            public void removeUpdates(IBinder iBinder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBLocationManagerService.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
            public void requestLocationUpdates(IBinder iBinder, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBLocationManagerService.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
            public void setAllCell(int i, String str, List<BCell> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBLocationManagerService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    _Parcel.writeTypedList(obtain, list, 0);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
            public void setCell(int i, String str, BCell bCell) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBLocationManagerService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, bCell, 0);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
            public void setGlobalAllCell(List<BCell> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBLocationManagerService.DESCRIPTOR);
                    _Parcel.writeTypedList(obtain, list, 0);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
            public void setGlobalCell(BCell bCell) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBLocationManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, bCell, 0);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
            public void setGlobalLocation(BLocation bLocation) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBLocationManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, bLocation, 0);
                    this.mRemote.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
            public void setGlobalNeighboringCell(List<BCell> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBLocationManagerService.DESCRIPTOR);
                    _Parcel.writeTypedList(obtain, list, 0);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
            public void setLocation(int i, String str, BLocation bLocation) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBLocationManagerService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, bLocation, 0);
                    this.mRemote.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
            public void setNeighboringCell(int i, String str, List<BCell> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBLocationManagerService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    _Parcel.writeTypedList(obtain, list, 0);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
            public void setPattern(int i, String str, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBLocationManagerService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IBLocationManagerService.DESCRIPTOR);
        }

        public static IBLocationManagerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IBLocationManagerService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IBLocationManagerService)) ? new Proxy(iBinder) : (IBLocationManagerService) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            List<BCell> neighboringCell;
            Parcelable cell;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IBLocationManagerService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IBLocationManagerService.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    int pattern = getPattern(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(pattern);
                    break;
                case 2:
                    setPattern(parcel.readInt(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 3:
                    setCell(parcel.readInt(), parcel.readString(), (BCell) _Parcel.readTypedObject(parcel, BCell.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 4:
                    setAllCell(parcel.readInt(), parcel.readString(), parcel.createTypedArrayList(BCell.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 5:
                    setNeighboringCell(parcel.readInt(), parcel.readString(), parcel.createTypedArrayList(BCell.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 6:
                    neighboringCell = getNeighboringCell(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    _Parcel.writeTypedList(parcel2, neighboringCell, 1);
                    break;
                case 7:
                    setGlobalCell((BCell) _Parcel.readTypedObject(parcel, BCell.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 8:
                    setGlobalAllCell(parcel.createTypedArrayList(BCell.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 9:
                    setGlobalNeighboringCell(parcel.createTypedArrayList(BCell.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 10:
                    neighboringCell = getGlobalNeighboringCell();
                    parcel2.writeNoException();
                    _Parcel.writeTypedList(parcel2, neighboringCell, 1);
                    break;
                case 11:
                    cell = getCell(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, cell, 1);
                    break;
                case 12:
                    neighboringCell = getAllCell(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    _Parcel.writeTypedList(parcel2, neighboringCell, 1);
                    break;
                case 13:
                    setLocation(parcel.readInt(), parcel.readString(), (BLocation) _Parcel.readTypedObject(parcel, BLocation.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 14:
                    cell = getLocation(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, cell, 1);
                    break;
                case 15:
                    setGlobalLocation((BLocation) _Parcel.readTypedObject(parcel, BLocation.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 16:
                    cell = getGlobalLocation();
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, cell, 1);
                    break;
                case 17:
                    requestLocationUpdates(parcel.readStrongBinder(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 18:
                    removeUpdates(parcel.readStrongBinder());
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

    List<BCell> getAllCell(int i, String str);

    BCell getCell(int i, String str);

    BLocation getGlobalLocation();

    List<BCell> getGlobalNeighboringCell();

    BLocation getLocation(int i, String str);

    List<BCell> getNeighboringCell(int i, String str);

    int getPattern(int i, String str);

    void removeUpdates(IBinder iBinder);

    void requestLocationUpdates(IBinder iBinder, String str, int i);

    void setAllCell(int i, String str, List<BCell> list);

    void setCell(int i, String str, BCell bCell);

    void setGlobalAllCell(List<BCell> list);

    void setGlobalCell(BCell bCell);

    void setGlobalLocation(BLocation bLocation);

    void setGlobalNeighboringCell(List<BCell> list);

    void setLocation(int i, String str, BLocation bLocation);

    void setNeighboringCell(int i, String str, List<BCell> list);

    void setPattern(int i, String str, int i2);
}

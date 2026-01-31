package top.niunaijun.blackbox.core.system.p025am;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: top.niunaijun.blackbox.core.system.am.IRequestPermissionsResult */
/* loaded from: classes3.dex */
public interface IRequestPermissionsResult extends IInterface {
    public static final String DESCRIPTOR = "top.niunaijun.blackbox.core.system.am.IRequestPermissionsResult";

    /* renamed from: top.niunaijun.blackbox.core.system.am.IRequestPermissionsResult$Default */
    /* loaded from: classes3.dex */
    public static class Default implements IRequestPermissionsResult {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p025am.IRequestPermissionsResult
        public boolean onResult(int i, String[] strArr, int[] iArr) {
            return false;
        }
    }

    /* renamed from: top.niunaijun.blackbox.core.system.am.IRequestPermissionsResult$Stub */
    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IRequestPermissionsResult {
        static final int TRANSACTION_onResult = 1;

        /* renamed from: top.niunaijun.blackbox.core.system.am.IRequestPermissionsResult$Stub$Proxy */
        /* loaded from: classes3.dex */
        public static class Proxy implements IRequestPermissionsResult {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IRequestPermissionsResult.DESCRIPTOR;
            }

            @Override // top.niunaijun.blackbox.core.system.p025am.IRequestPermissionsResult
            public boolean onResult(int i, String[] strArr, int[] iArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRequestPermissionsResult.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    obtain.writeIntArray(iArr);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IRequestPermissionsResult.DESCRIPTOR);
        }

        public static IRequestPermissionsResult asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IRequestPermissionsResult.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IRequestPermissionsResult)) ? new Proxy(iBinder) : (IRequestPermissionsResult) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IRequestPermissionsResult.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IRequestPermissionsResult.DESCRIPTOR);
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                boolean onResult = onResult(parcel.readInt(), parcel.createStringArray(), parcel.createIntArray());
                parcel2.writeNoException();
                parcel2.writeInt(onResult ? 1 : 0);
                return true;
            }
        }
    }

    boolean onResult(int i, String[] strArr, int[] iArr);
}

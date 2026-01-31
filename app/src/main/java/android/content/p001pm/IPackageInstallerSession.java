package android.content.p001pm;

import android.content.IntentSender;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
/* renamed from: android.content.pm.IPackageInstallerSession */
/* loaded from: classes.dex */
public interface IPackageInstallerSession extends IInterface {

    /* renamed from: android.content.pm.IPackageInstallerSession$Default */
    /* loaded from: classes.dex */
    public static class Default implements IPackageInstallerSession {
        @Override // android.content.p001pm.IPackageInstallerSession
        public void abandon() {
        }

        @Override // android.content.p001pm.IPackageInstallerSession
        public void addClientProgress(float f) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.content.p001pm.IPackageInstallerSession
        public void close() {
        }

        @Override // android.content.p001pm.IPackageInstallerSession
        public void commit(IntentSender intentSender) {
        }

        @Override // android.content.p001pm.IPackageInstallerSession
        public String[] getNames() {
            return null;
        }

        @Override // android.content.p001pm.IPackageInstallerSession
        public ParcelFileDescriptor openRead(String str) {
            return null;
        }

        @Override // android.content.p001pm.IPackageInstallerSession
        public ParcelFileDescriptor openWrite(String str, long j, long j2) {
            return null;
        }

        @Override // android.content.p001pm.IPackageInstallerSession
        public void removeSplit(String str) {
        }

        @Override // android.content.p001pm.IPackageInstallerSession
        public void setClientProgress(float f) {
        }
    }

    /* renamed from: android.content.pm.IPackageInstallerSession$Stub */
    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IPackageInstallerSession {
        public static final String DESCRIPTOR = "android.content.pm.IPackageInstallerSession";
        static final int TRANSACTION_abandon = 9;
        static final int TRANSACTION_addClientProgress = 2;
        static final int TRANSACTION_close = 7;
        static final int TRANSACTION_commit = 8;
        static final int TRANSACTION_getNames = 3;
        static final int TRANSACTION_openRead = 5;
        static final int TRANSACTION_openWrite = 4;
        static final int TRANSACTION_removeSplit = 6;
        static final int TRANSACTION_setClientProgress = 1;

        /* renamed from: android.content.pm.IPackageInstallerSession$Stub$Proxy */
        /* loaded from: classes.dex */
        public static class Proxy implements IPackageInstallerSession {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.content.p001pm.IPackageInstallerSession
            public void abandon() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.content.p001pm.IPackageInstallerSession
            public void addClientProgress(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeFloat(f);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // android.content.p001pm.IPackageInstallerSession
            public void close() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.content.p001pm.IPackageInstallerSession
            public void commit(IntentSender intentSender) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, intentSender, 0);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // android.content.p001pm.IPackageInstallerSession
            public String[] getNames() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createStringArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.content.p001pm.IPackageInstallerSession
            public ParcelFileDescriptor openRead(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ParcelFileDescriptor) _Parcel.readTypedObject(obtain2, ParcelFileDescriptor.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.content.p001pm.IPackageInstallerSession
            public ParcelFileDescriptor openWrite(String str, long j, long j2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ParcelFileDescriptor) _Parcel.readTypedObject(obtain2, ParcelFileDescriptor.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.content.p001pm.IPackageInstallerSession
            public void removeSplit(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.content.p001pm.IPackageInstallerSession
            public void setClientProgress(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeFloat(f);
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

        public static IPackageInstallerSession asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IPackageInstallerSession)) ? new Proxy(iBinder) : (IPackageInstallerSession) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            ParcelFileDescriptor openWrite;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    setClientProgress(parcel.readFloat());
                    parcel2.writeNoException();
                    break;
                case 2:
                    addClientProgress(parcel.readFloat());
                    parcel2.writeNoException();
                    break;
                case 3:
                    String[] names = getNames();
                    parcel2.writeNoException();
                    parcel2.writeStringArray(names);
                    break;
                case 4:
                    openWrite = openWrite(parcel.readString(), parcel.readLong(), parcel.readLong());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, openWrite, 1);
                    break;
                case 5:
                    openWrite = openRead(parcel.readString());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, openWrite, 1);
                    break;
                case 6:
                    removeSplit(parcel.readString());
                    parcel2.writeNoException();
                    break;
                case 7:
                    close();
                    parcel2.writeNoException();
                    break;
                case 8:
                    commit((IntentSender) _Parcel.readTypedObject(parcel, IntentSender.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 9:
                    abandon();
                    parcel2.writeNoException();
                    break;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }
    }

    /* renamed from: android.content.pm.IPackageInstallerSession$_Parcel */
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

    void abandon();

    void addClientProgress(float f);

    void close();

    void commit(IntentSender intentSender);

    String[] getNames();

    ParcelFileDescriptor openRead(String str);

    ParcelFileDescriptor openWrite(String str, long j, long j2);

    void removeSplit(String str);

    void setClientProgress(float f);
}

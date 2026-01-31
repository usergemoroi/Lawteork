package top.niunaijun.blackbox.core;

import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import top.niunaijun.blackbox.entity.p028am.ReceiverData;
/* loaded from: classes3.dex */
public interface IBActivityThread extends IInterface {
    public static final String DESCRIPTOR = "top.niunaijun.blackbox.core.IBActivityThread";

    /* loaded from: classes3.dex */
    public static class Default implements IBActivityThread {
        @Override // top.niunaijun.blackbox.core.IBActivityThread
        public IBinder acquireContentProviderClient(ProviderInfo providerInfo) {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.IBActivityThread
        public void bindApplication() {
        }

        @Override // top.niunaijun.blackbox.core.IBActivityThread
        public void finishActivity(IBinder iBinder) {
        }

        @Override // top.niunaijun.blackbox.core.IBActivityThread
        public IBinder getActivityThread() {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.IBActivityThread
        public void handleNewIntent(IBinder iBinder, Intent intent) {
        }

        @Override // top.niunaijun.blackbox.core.IBActivityThread
        public IBinder peekService(Intent intent) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.IBActivityThread
        public void restartJobService(String str) {
        }

        @Override // top.niunaijun.blackbox.core.IBActivityThread
        public void scheduleReceiver(ReceiverData receiverData) {
        }

        @Override // top.niunaijun.blackbox.core.IBActivityThread
        public void stopService(Intent intent) {
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IBActivityThread {
        static final int TRANSACTION_acquireContentProviderClient = 4;
        static final int TRANSACTION_bindApplication = 2;
        static final int TRANSACTION_finishActivity = 7;
        static final int TRANSACTION_getActivityThread = 1;
        static final int TRANSACTION_handleNewIntent = 8;
        static final int TRANSACTION_peekService = 5;
        static final int TRANSACTION_restartJobService = 3;
        static final int TRANSACTION_scheduleReceiver = 9;
        static final int TRANSACTION_stopService = 6;

        /* loaded from: classes3.dex */
        public static class Proxy implements IBActivityThread {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // top.niunaijun.blackbox.core.IBActivityThread
            public IBinder acquireContentProviderClient(ProviderInfo providerInfo) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityThread.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, providerInfo, 0);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // top.niunaijun.blackbox.core.IBActivityThread
            public void bindApplication() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityThread.DESCRIPTOR);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.IBActivityThread
            public void finishActivity(IBinder iBinder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityThread.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.IBActivityThread
            public IBinder getActivityThread() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityThread.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IBActivityThread.DESCRIPTOR;
            }

            @Override // top.niunaijun.blackbox.core.IBActivityThread
            public void handleNewIntent(IBinder iBinder, Intent intent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityThread.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    _Parcel.writeTypedObject(obtain, intent, 0);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.IBActivityThread
            public IBinder peekService(Intent intent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityThread.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, intent, 0);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.IBActivityThread
            public void restartJobService(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityThread.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.IBActivityThread
            public void scheduleReceiver(ReceiverData receiverData) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityThread.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, receiverData, 0);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.IBActivityThread
            public void stopService(Intent intent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityThread.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, intent, 0);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IBActivityThread.DESCRIPTOR);
        }

        public static IBActivityThread asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IBActivityThread.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IBActivityThread)) ? new Proxy(iBinder) : (IBActivityThread) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IBinder activityThread;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IBActivityThread.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IBActivityThread.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    activityThread = getActivityThread();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(activityThread);
                    return true;
                case 2:
                    bindApplication();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    restartJobService(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    activityThread = acquireContentProviderClient((ProviderInfo) _Parcel.readTypedObject(parcel, ProviderInfo.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(activityThread);
                    return true;
                case 5:
                    activityThread = peekService((Intent) _Parcel.readTypedObject(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(activityThread);
                    return true;
                case 6:
                    stopService((Intent) _Parcel.readTypedObject(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    finishActivity(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    handleNewIntent(parcel.readStrongBinder(), (Intent) _Parcel.readTypedObject(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    scheduleReceiver((ReceiverData) _Parcel.readTypedObject(parcel, ReceiverData.CREATOR));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
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
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            t.writeToParcel(parcel, i);
        }
    }

    IBinder acquireContentProviderClient(ProviderInfo providerInfo);

    void bindApplication();

    void finishActivity(IBinder iBinder);

    IBinder getActivityThread();

    void handleNewIntent(IBinder iBinder, Intent intent);

    IBinder peekService(Intent intent);

    void restartJobService(String str);

    void scheduleReceiver(ReceiverData receiverData);

    void stopService(Intent intent);
}

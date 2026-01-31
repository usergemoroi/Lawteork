package top.niunaijun.blackbox.core.system.p025am;

import android.app.job.JobInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import top.niunaijun.blackbox.entity.JobRecord;
/* renamed from: top.niunaijun.blackbox.core.system.am.IBJobManagerService */
/* loaded from: classes3.dex */
public interface IBJobManagerService extends IInterface {
    public static final String DESCRIPTOR = "top.niunaijun.blackbox.core.system.am.IBJobManagerService";

    /* renamed from: top.niunaijun.blackbox.core.system.am.IBJobManagerService$Default */
    /* loaded from: classes3.dex */
    public static class Default implements IBJobManagerService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p025am.IBJobManagerService
        public int cancel(String str, int i, int i2) {
            return 0;
        }

        @Override // top.niunaijun.blackbox.core.system.p025am.IBJobManagerService
        public void cancelAll(String str, int i) {
        }

        @Override // top.niunaijun.blackbox.core.system.p025am.IBJobManagerService
        public JobRecord queryJobRecord(String str, int i, int i2) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.p025am.IBJobManagerService
        public JobInfo schedule(JobInfo jobInfo, int i) {
            return null;
        }
    }

    /* renamed from: top.niunaijun.blackbox.core.system.am.IBJobManagerService$Stub */
    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IBJobManagerService {
        static final int TRANSACTION_cancel = 4;
        static final int TRANSACTION_cancelAll = 3;
        static final int TRANSACTION_queryJobRecord = 2;
        static final int TRANSACTION_schedule = 1;

        /* renamed from: top.niunaijun.blackbox.core.system.am.IBJobManagerService$Stub$Proxy */
        /* loaded from: classes3.dex */
        public static class Proxy implements IBJobManagerService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // top.niunaijun.blackbox.core.system.p025am.IBJobManagerService
            public int cancel(String str, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBJobManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p025am.IBJobManagerService
            public void cancelAll(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBJobManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IBJobManagerService.DESCRIPTOR;
            }

            @Override // top.niunaijun.blackbox.core.system.p025am.IBJobManagerService
            public JobRecord queryJobRecord(String str, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBJobManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return (JobRecord) _Parcel.readTypedObject(obtain2, JobRecord.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.p025am.IBJobManagerService
            public JobInfo schedule(JobInfo jobInfo, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBJobManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, jobInfo, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return (JobInfo) _Parcel.readTypedObject(obtain2, JobInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IBJobManagerService.DESCRIPTOR);
        }

        public static IBJobManagerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IBJobManagerService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IBJobManagerService)) ? new Proxy(iBinder) : (IBJobManagerService) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Parcelable schedule;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IBJobManagerService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IBJobManagerService.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    schedule = schedule((JobInfo) _Parcel.readTypedObject(parcel, JobInfo.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, schedule, 1);
                    break;
                case 2:
                    schedule = queryJobRecord(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, schedule, 1);
                    break;
                case 3:
                    cancelAll(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 4:
                    int cancel = cancel(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(cancel);
                    break;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }
    }

    /* renamed from: top.niunaijun.blackbox.core.system.am.IBJobManagerService$_Parcel */
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

    int cancel(String str, int i, int i2);

    void cancelAll(String str, int i);

    JobRecord queryJobRecord(String str, int i, int i2);

    JobInfo schedule(JobInfo jobInfo, int i);
}

package top.niunaijun.blackbox.core.system.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* loaded from: classes3.dex */
public interface IBNotificationManagerService extends IInterface {
    public static final String DESCRIPTOR = "top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService";

    /* loaded from: classes3.dex */
    public static class Default implements IBNotificationManagerService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
        public void cancelNotificationWithTag(int i, String str, int i2) {
        }

        @Override // top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
        public void createNotificationChannel(NotificationChannel notificationChannel, int i) {
        }

        @Override // top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
        public void createNotificationChannelGroup(NotificationChannelGroup notificationChannelGroup, int i) {
        }

        @Override // top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
        public void deleteNotificationChannel(String str, int i) {
        }

        @Override // top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
        public void deleteNotificationChannelGroup(String str, int i) {
        }

        @Override // top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
        public void enqueueNotificationWithTag(int i, String str, Notification notification, int i2) {
        }

        @Override // top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
        public NotificationChannel getNotificationChannel(String str, int i) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
        public List<NotificationChannelGroup> getNotificationChannelGroups(String str, int i) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
        public List<NotificationChannel> getNotificationChannels(String str, int i) {
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IBNotificationManagerService {
        static final int TRANSACTION_cancelNotificationWithTag = 9;
        static final int TRANSACTION_createNotificationChannel = 4;
        static final int TRANSACTION_createNotificationChannelGroup = 6;
        static final int TRANSACTION_deleteNotificationChannel = 5;
        static final int TRANSACTION_deleteNotificationChannelGroup = 7;
        static final int TRANSACTION_enqueueNotificationWithTag = 8;
        static final int TRANSACTION_getNotificationChannel = 1;
        static final int TRANSACTION_getNotificationChannelGroups = 3;
        static final int TRANSACTION_getNotificationChannels = 2;

        /* loaded from: classes3.dex */
        public static class Proxy implements IBNotificationManagerService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
            public void cancelNotificationWithTag(int i, String str, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBNotificationManagerService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
            public void createNotificationChannel(NotificationChannel notificationChannel, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBNotificationManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, notificationChannel, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
            public void createNotificationChannelGroup(NotificationChannelGroup notificationChannelGroup, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBNotificationManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, notificationChannelGroup, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
            public void deleteNotificationChannel(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBNotificationManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
            public void deleteNotificationChannelGroup(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBNotificationManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
            public void enqueueNotificationWithTag(int i, String str, Notification notification, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBNotificationManagerService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, notification, 0);
                    obtain.writeInt(i2);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IBNotificationManagerService.DESCRIPTOR;
            }

            @Override // top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
            public NotificationChannel getNotificationChannel(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBNotificationManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return (NotificationChannel) _Parcel.readTypedObject(obtain2, NotificationChannel.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
            public List<NotificationChannelGroup> getNotificationChannelGroups(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBNotificationManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(NotificationChannelGroup.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.notification.IBNotificationManagerService
            public List<NotificationChannel> getNotificationChannels(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBNotificationManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(NotificationChannel.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IBNotificationManagerService.DESCRIPTOR);
        }

        public static IBNotificationManagerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IBNotificationManagerService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IBNotificationManagerService)) ? new Proxy(iBinder) : (IBNotificationManagerService) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            List notificationChannels;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IBNotificationManagerService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IBNotificationManagerService.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    NotificationChannel notificationChannel = getNotificationChannel(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, notificationChannel, 1);
                    break;
                case 2:
                    notificationChannels = getNotificationChannels(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedList(parcel2, notificationChannels, 1);
                    break;
                case 3:
                    notificationChannels = getNotificationChannelGroups(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedList(parcel2, notificationChannels, 1);
                    break;
                case 4:
                    createNotificationChannel((NotificationChannel) _Parcel.readTypedObject(parcel, NotificationChannel.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 5:
                    deleteNotificationChannel(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 6:
                    createNotificationChannelGroup((NotificationChannelGroup) _Parcel.readTypedObject(parcel, NotificationChannelGroup.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 7:
                    deleteNotificationChannelGroup(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 8:
                    enqueueNotificationWithTag(parcel.readInt(), parcel.readString(), (Notification) _Parcel.readTypedObject(parcel, Notification.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 9:
                    cancelNotificationWithTag(parcel.readInt(), parcel.readString(), parcel.readInt());
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

    void cancelNotificationWithTag(int i, String str, int i2);

    void createNotificationChannel(NotificationChannel notificationChannel, int i);

    void createNotificationChannelGroup(NotificationChannelGroup notificationChannelGroup, int i);

    void deleteNotificationChannel(String str, int i);

    void deleteNotificationChannelGroup(String str, int i);

    void enqueueNotificationWithTag(int i, String str, Notification notification, int i2);

    NotificationChannel getNotificationChannel(String str, int i);

    List<NotificationChannelGroup> getNotificationChannelGroups(String str, int i);

    List<NotificationChannel> getNotificationChannels(String str, int i);
}

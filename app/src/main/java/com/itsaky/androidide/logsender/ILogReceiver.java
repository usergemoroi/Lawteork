package com.itsaky.androidide.logsender;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.itsaky.androidide.logsender.ILogSender;
/* loaded from: classes.dex */
public interface ILogReceiver extends IInterface {
    public static final String DESCRIPTOR = "com.itsaky.androidide.logsender.ILogReceiver";

    void connect(ILogSender iLogSender) throws RemoteException;

    void disconnect(String str, String str2) throws RemoteException;

    void ping() throws RemoteException;

    /* loaded from: classes.dex */
    public static class Default implements ILogReceiver {
        @Override // com.itsaky.androidide.logsender.ILogReceiver
        public void ping() throws RemoteException {
        }

        @Override // com.itsaky.androidide.logsender.ILogReceiver
        public void connect(ILogSender sender) throws RemoteException {
        }

        @Override // com.itsaky.androidide.logsender.ILogReceiver
        public void disconnect(String packageName, String senderId) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements ILogReceiver {
        static final int TRANSACTION_connect = 2;
        static final int TRANSACTION_disconnect = 3;
        static final int TRANSACTION_ping = 1;

        public Stub() {
            attachInterface(this, ILogReceiver.DESCRIPTOR);
        }

        public static ILogReceiver asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iin = obj.queryLocalInterface(ILogReceiver.DESCRIPTOR);
            if (iin != null && (iin instanceof ILogReceiver)) {
                return (ILogReceiver) iin;
            }
            return new Proxy(obj);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code >= 1 && code <= 16777215) {
                data.enforceInterface(ILogReceiver.DESCRIPTOR);
            }
            switch (code) {
                case 1598968902:
                    reply.writeString(ILogReceiver.DESCRIPTOR);
                    return true;
                default:
                    switch (code) {
                        case 1:
                            ping();
                            break;
                        case 2:
                            ILogSender _arg0 = ILogSender.Stub.asInterface(data.readStrongBinder());
                            connect(_arg0);
                            break;
                        case 3:
                            String _arg02 = data.readString();
                            String _arg1 = data.readString();
                            disconnect(_arg02, _arg1);
                            break;
                        default:
                            return super.onTransact(code, data, reply, flags);
                    }
                    return true;
            }
        }

        /* loaded from: classes.dex */
        private static class Proxy implements ILogReceiver {
            private IBinder mRemote;

            Proxy(IBinder remote) {
                this.mRemote = remote;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ILogReceiver.DESCRIPTOR;
            }

            @Override // com.itsaky.androidide.logsender.ILogReceiver
            public void ping() throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(ILogReceiver.DESCRIPTOR);
                    this.mRemote.transact(1, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }

            @Override // com.itsaky.androidide.logsender.ILogReceiver
            public void connect(ILogSender sender) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(ILogReceiver.DESCRIPTOR);
                    _data.writeStrongInterface(sender);
                    this.mRemote.transact(2, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }

            @Override // com.itsaky.androidide.logsender.ILogReceiver
            public void disconnect(String packageName, String senderId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(ILogReceiver.DESCRIPTOR);
                    _data.writeString(packageName);
                    _data.writeString(senderId);
                    this.mRemote.transact(3, _data, null, 1);
                } finally {
                    _data.recycle();
                }
            }
        }
    }
}

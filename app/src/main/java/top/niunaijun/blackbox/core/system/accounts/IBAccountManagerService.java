package top.niunaijun.blackbox.core.system.accounts;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.accounts.IAccountManagerResponse;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
/* loaded from: classes3.dex */
public interface IBAccountManagerService extends IInterface {
    public static final String DESCRIPTOR = "top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService";

    /* loaded from: classes3.dex */
    public static class Default implements IBAccountManagerService {
        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public boolean accountAuthenticated(Account account, int i) {
            return false;
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public void addAccount(IAccountManagerResponse iAccountManagerResponse, String str, String str2, String[] strArr, boolean z, Bundle bundle, int i) {
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public void addAccountAsUser(IAccountManagerResponse iAccountManagerResponse, String str, String str2, String[] strArr, boolean z, Bundle bundle, int i) {
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public boolean addAccountExplicitly(Account account, String str, Bundle bundle, int i) {
            return false;
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public boolean addAccountExplicitlyWithVisibility(Account account, String str, Bundle bundle, Map map, int i) {
            return false;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public void clearPassword(Account account, int i) {
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public void confirmCredentialsAsUser(IAccountManagerResponse iAccountManagerResponse, Account account, Bundle bundle, boolean z, int i) {
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public void copyAccountToUser(IAccountManagerResponse iAccountManagerResponse, Account account, int i, int i2) {
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public void editProperties(IAccountManagerResponse iAccountManagerResponse, String str, boolean z, int i) {
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public void getAccountByTypeAndFeatures(IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr, int i) {
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public int getAccountVisibility(Account account, String str, int i) {
            return 0;
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public Map getAccountsAndVisibilityForPackage(String str, String str2, int i) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public Account[] getAccountsAsUser(String str, int i) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public void getAccountsByFeatures(IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr, int i) {
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public Account[] getAccountsByTypeForPackage(String str, String str2, int i) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public Account[] getAccountsForPackage(String str, int i, int i2) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public void getAuthToken(IAccountManagerResponse iAccountManagerResponse, Account account, String str, boolean z, boolean z2, Bundle bundle, int i) {
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public void getAuthTokenLabel(IAccountManagerResponse iAccountManagerResponse, String str, String str2, int i) {
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public AuthenticatorDescription[] getAuthenticatorTypes(int i) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public Map getPackagesAndVisibilityForAccount(Account account, int i) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public String getPassword(Account account, int i) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public String getUserData(Account account, String str, int i) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public void invalidateAuthToken(String str, String str2, int i) {
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public String peekAuthToken(Account account, String str, int i) {
            return null;
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public void registerAccountListener(String[] strArr, String str, int i) {
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public void removeAccountAsUser(IAccountManagerResponse iAccountManagerResponse, Account account, boolean z, int i) {
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public boolean removeAccountExplicitly(Account account, int i) {
            return false;
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public boolean setAccountVisibility(Account account, String str, int i, int i2) {
            return false;
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public void setAuthToken(Account account, String str, String str2, int i) {
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public void setPassword(Account account, String str, int i) {
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public void setUserData(Account account, String str, String str2, int i) {
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public void unregisterAccountListener(String[] strArr, String str, int i) {
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public void updateAppPermission(Account account, String str, int i, boolean z) {
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
        public void updateCredentials(IAccountManagerResponse iAccountManagerResponse, Account account, String str, boolean z, Bundle bundle, int i) {
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IBAccountManagerService {
        static final int TRANSACTION_accountAuthenticated = 26;
        static final int TRANSACTION_addAccount = 21;
        static final int TRANSACTION_addAccountAsUser = 22;
        static final int TRANSACTION_addAccountExplicitly = 9;
        static final int TRANSACTION_addAccountExplicitlyWithVisibility = 29;
        static final int TRANSACTION_clearPassword = 17;
        static final int TRANSACTION_confirmCredentialsAsUser = 25;
        static final int TRANSACTION_copyAccountToUser = 12;
        static final int TRANSACTION_editProperties = 24;
        static final int TRANSACTION_getAccountByTypeAndFeatures = 7;
        static final int TRANSACTION_getAccountVisibility = 31;
        static final int TRANSACTION_getAccountsAndVisibilityForPackage = 32;
        static final int TRANSACTION_getAccountsAsUser = 6;
        static final int TRANSACTION_getAccountsByFeatures = 8;
        static final int TRANSACTION_getAccountsByTypeForPackage = 5;
        static final int TRANSACTION_getAccountsForPackage = 4;
        static final int TRANSACTION_getAuthToken = 20;
        static final int TRANSACTION_getAuthTokenLabel = 27;
        static final int TRANSACTION_getAuthenticatorTypes = 3;
        static final int TRANSACTION_getPackagesAndVisibilityForAccount = 28;
        static final int TRANSACTION_getPassword = 1;
        static final int TRANSACTION_getUserData = 2;
        static final int TRANSACTION_invalidateAuthToken = 13;
        static final int TRANSACTION_peekAuthToken = 14;
        static final int TRANSACTION_registerAccountListener = 33;
        static final int TRANSACTION_removeAccountAsUser = 10;
        static final int TRANSACTION_removeAccountExplicitly = 11;
        static final int TRANSACTION_setAccountVisibility = 30;
        static final int TRANSACTION_setAuthToken = 15;
        static final int TRANSACTION_setPassword = 16;
        static final int TRANSACTION_setUserData = 18;
        static final int TRANSACTION_unregisterAccountListener = 34;
        static final int TRANSACTION_updateAppPermission = 19;
        static final int TRANSACTION_updateCredentials = 23;

        /* loaded from: classes3.dex */
        public static class Proxy implements IBAccountManagerService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public boolean accountAuthenticated(Account account, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, account, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public void addAccount(IAccountManagerResponse iAccountManagerResponse, String str, String str2, String[] strArr, boolean z, Bundle bundle, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    obtain.writeStrongInterface(iAccountManagerResponse);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStringArray(strArr);
                    obtain.writeInt(z ? 1 : 0);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public void addAccountAsUser(IAccountManagerResponse iAccountManagerResponse, String str, String str2, String[] strArr, boolean z, Bundle bundle, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    obtain.writeStrongInterface(iAccountManagerResponse);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStringArray(strArr);
                    obtain.writeInt(z ? 1 : 0);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public boolean addAccountExplicitly(Account account, String str, Bundle bundle, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, account, 0);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public boolean addAccountExplicitlyWithVisibility(Account account, String str, Bundle bundle, Map map, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, account, 0);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    obtain.writeMap(map);
                    obtain.writeInt(i);
                    this.mRemote.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public void clearPassword(Account account, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, account, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public void confirmCredentialsAsUser(IAccountManagerResponse iAccountManagerResponse, Account account, Bundle bundle, boolean z, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    obtain.writeStrongInterface(iAccountManagerResponse);
                    _Parcel.writeTypedObject(obtain, account, 0);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public void copyAccountToUser(IAccountManagerResponse iAccountManagerResponse, Account account, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    obtain.writeStrongInterface(iAccountManagerResponse);
                    _Parcel.writeTypedObject(obtain, account, 0);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public void editProperties(IAccountManagerResponse iAccountManagerResponse, String str, boolean z, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    obtain.writeStrongInterface(iAccountManagerResponse);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public void getAccountByTypeAndFeatures(IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    obtain.writeStrongInterface(iAccountManagerResponse);
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    obtain.writeInt(i);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public int getAccountVisibility(Account account, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, account, 0);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public Map getAccountsAndVisibilityForPackage(String str, String str2, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    this.mRemote.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public Account[] getAccountsAsUser(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Account[]) obtain2.createTypedArray(Account.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public void getAccountsByFeatures(IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    obtain.writeStrongInterface(iAccountManagerResponse);
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    obtain.writeInt(i);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public Account[] getAccountsByTypeForPackage(String str, String str2, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Account[]) obtain2.createTypedArray(Account.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public Account[] getAccountsForPackage(String str, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Account[]) obtain2.createTypedArray(Account.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public void getAuthToken(IAccountManagerResponse iAccountManagerResponse, Account account, String str, boolean z, boolean z2, Bundle bundle, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    obtain.writeStrongInterface(iAccountManagerResponse);
                    _Parcel.writeTypedObject(obtain, account, 0);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public void getAuthTokenLabel(IAccountManagerResponse iAccountManagerResponse, String str, String str2, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    obtain.writeStrongInterface(iAccountManagerResponse);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    this.mRemote.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public AuthenticatorDescription[] getAuthenticatorTypes(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return (AuthenticatorDescription[]) obtain2.createTypedArray(AuthenticatorDescription.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IBAccountManagerService.DESCRIPTOR;
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public Map getPackagesAndVisibilityForAccount(Account account, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, account, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public String getPassword(Account account, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, account, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public String getUserData(Account account, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, account, 0);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public void invalidateAuthToken(String str, String str2, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    this.mRemote.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public String peekAuthToken(Account account, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, account, 0);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public void registerAccountListener(String[] strArr, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    obtain.writeStringArray(strArr);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public void removeAccountAsUser(IAccountManagerResponse iAccountManagerResponse, Account account, boolean z, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    obtain.writeStrongInterface(iAccountManagerResponse);
                    _Parcel.writeTypedObject(obtain, account, 0);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public boolean removeAccountExplicitly(Account account, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, account, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public boolean setAccountVisibility(Account account, String str, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, account, 0);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public void setAuthToken(Account account, String str, String str2, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, account, 0);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    this.mRemote.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public void setPassword(Account account, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, account, 0);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public void setUserData(Account account, String str, String str2, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, account, 0);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    this.mRemote.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public void unregisterAccountListener(String[] strArr, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    obtain.writeStringArray(strArr);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public void updateAppPermission(Account account, String str, int i, boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, account, 0);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
            public void updateCredentials(IAccountManagerResponse iAccountManagerResponse, Account account, String str, boolean z, Bundle bundle, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBAccountManagerService.DESCRIPTOR);
                    obtain.writeStrongInterface(iAccountManagerResponse);
                    _Parcel.writeTypedObject(obtain, account, 0);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IBAccountManagerService.DESCRIPTOR);
        }

        public static IBAccountManagerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IBAccountManagerService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IBAccountManagerService)) ? new Proxy(iBinder) : (IBAccountManagerService) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String password;
            Map packagesAndVisibilityForAccount;
            int i3;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IBAccountManagerService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IBAccountManagerService.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    password = getPassword((Account) _Parcel.readTypedObject(parcel, Account.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(password);
                    break;
                case 2:
                    password = getUserData((Account) _Parcel.readTypedObject(parcel, Account.CREATOR), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(password);
                    break;
                case 3:
                    AuthenticatorDescription[] authenticatorTypes = getAuthenticatorTypes(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(authenticatorTypes, 1);
                    break;
                case 4:
                    Account[] accountsForPackage = getAccountsForPackage(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(accountsForPackage, 1);
                    break;
                case 5:
                    Account[] accountsByTypeForPackage = getAccountsByTypeForPackage(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(accountsByTypeForPackage, 1);
                    break;
                case 6:
                    Account[] accountsAsUser = getAccountsAsUser(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(accountsAsUser, 1);
                    break;
                case 7:
                    getAccountByTypeAndFeatures(IAccountManagerResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.createStringArray(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 8:
                    getAccountsByFeatures(IAccountManagerResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.createStringArray(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 9:
                    i3 = addAccountExplicitly((Account) _Parcel.readTypedObject(parcel, Account.CREATOR), parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    break;
                case 10:
                    removeAccountAsUser(IAccountManagerResponse.Stub.asInterface(parcel.readStrongBinder()), (Account) _Parcel.readTypedObject(parcel, Account.CREATOR), parcel.readInt() != 0, parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 11:
                    i3 = removeAccountExplicitly((Account) _Parcel.readTypedObject(parcel, Account.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    break;
                case 12:
                    copyAccountToUser(IAccountManagerResponse.Stub.asInterface(parcel.readStrongBinder()), (Account) _Parcel.readTypedObject(parcel, Account.CREATOR), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 13:
                    invalidateAuthToken(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 14:
                    password = peekAuthToken((Account) _Parcel.readTypedObject(parcel, Account.CREATOR), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(password);
                    break;
                case 15:
                    setAuthToken((Account) _Parcel.readTypedObject(parcel, Account.CREATOR), parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 16:
                    setPassword((Account) _Parcel.readTypedObject(parcel, Account.CREATOR), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 17:
                    clearPassword((Account) _Parcel.readTypedObject(parcel, Account.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 18:
                    setUserData((Account) _Parcel.readTypedObject(parcel, Account.CREATOR), parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 19:
                    updateAppPermission((Account) _Parcel.readTypedObject(parcel, Account.CREATOR), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    break;
                case 20:
                    getAuthToken(IAccountManagerResponse.Stub.asInterface(parcel.readStrongBinder()), (Account) _Parcel.readTypedObject(parcel, Account.CREATOR), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 21:
                    addAccount(IAccountManagerResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readInt() != 0, (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 22:
                    addAccountAsUser(IAccountManagerResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readInt() != 0, (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 23:
                    updateCredentials(IAccountManagerResponse.Stub.asInterface(parcel.readStrongBinder()), (Account) _Parcel.readTypedObject(parcel, Account.CREATOR), parcel.readString(), parcel.readInt() != 0, (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 24:
                    editProperties(IAccountManagerResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0, parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 25:
                    confirmCredentialsAsUser(IAccountManagerResponse.Stub.asInterface(parcel.readStrongBinder()), (Account) _Parcel.readTypedObject(parcel, Account.CREATOR), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), parcel.readInt() != 0, parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 26:
                    i3 = accountAuthenticated((Account) _Parcel.readTypedObject(parcel, Account.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    break;
                case 27:
                    getAuthTokenLabel(IAccountManagerResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 28:
                    packagesAndVisibilityForAccount = getPackagesAndVisibilityForAccount((Account) _Parcel.readTypedObject(parcel, Account.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeMap(packagesAndVisibilityForAccount);
                    break;
                case 29:
                    i3 = addAccountExplicitlyWithVisibility((Account) _Parcel.readTypedObject(parcel, Account.CREATOR), parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), parcel.readHashMap(getClass().getClassLoader()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    break;
                case 30:
                    i3 = setAccountVisibility((Account) _Parcel.readTypedObject(parcel, Account.CREATOR), parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    break;
                case 31:
                    i3 = getAccountVisibility((Account) _Parcel.readTypedObject(parcel, Account.CREATOR), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    break;
                case 32:
                    packagesAndVisibilityForAccount = getAccountsAndVisibilityForPackage(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeMap(packagesAndVisibilityForAccount);
                    break;
                case 33:
                    registerAccountListener(parcel.createStringArray(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 34:
                    unregisterAccountListener(parcel.createStringArray(), parcel.readString(), parcel.readInt());
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
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            t.writeToParcel(parcel, i);
        }
    }

    boolean accountAuthenticated(Account account, int i);

    void addAccount(IAccountManagerResponse iAccountManagerResponse, String str, String str2, String[] strArr, boolean z, Bundle bundle, int i);

    void addAccountAsUser(IAccountManagerResponse iAccountManagerResponse, String str, String str2, String[] strArr, boolean z, Bundle bundle, int i);

    boolean addAccountExplicitly(Account account, String str, Bundle bundle, int i);

    boolean addAccountExplicitlyWithVisibility(Account account, String str, Bundle bundle, Map map, int i);

    void clearPassword(Account account, int i);

    void confirmCredentialsAsUser(IAccountManagerResponse iAccountManagerResponse, Account account, Bundle bundle, boolean z, int i);

    void copyAccountToUser(IAccountManagerResponse iAccountManagerResponse, Account account, int i, int i2);

    void editProperties(IAccountManagerResponse iAccountManagerResponse, String str, boolean z, int i);

    void getAccountByTypeAndFeatures(IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr, int i);

    int getAccountVisibility(Account account, String str, int i);

    Map getAccountsAndVisibilityForPackage(String str, String str2, int i);

    Account[] getAccountsAsUser(String str, int i);

    void getAccountsByFeatures(IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr, int i);

    Account[] getAccountsByTypeForPackage(String str, String str2, int i);

    Account[] getAccountsForPackage(String str, int i, int i2);

    void getAuthToken(IAccountManagerResponse iAccountManagerResponse, Account account, String str, boolean z, boolean z2, Bundle bundle, int i);

    void getAuthTokenLabel(IAccountManagerResponse iAccountManagerResponse, String str, String str2, int i);

    AuthenticatorDescription[] getAuthenticatorTypes(int i);

    Map getPackagesAndVisibilityForAccount(Account account, int i);

    String getPassword(Account account, int i);

    String getUserData(Account account, String str, int i);

    void invalidateAuthToken(String str, String str2, int i);

    String peekAuthToken(Account account, String str, int i);

    void registerAccountListener(String[] strArr, String str, int i);

    void removeAccountAsUser(IAccountManagerResponse iAccountManagerResponse, Account account, boolean z, int i);

    boolean removeAccountExplicitly(Account account, int i);

    boolean setAccountVisibility(Account account, String str, int i, int i2);

    void setAuthToken(Account account, String str, String str2, int i);

    void setPassword(Account account, String str, int i);

    void setUserData(Account account, String str, String str2, int i);

    void unregisterAccountListener(String[] strArr, String str, int i);

    void updateAppPermission(Account account, String str, int i, boolean z);

    void updateCredentials(IAccountManagerResponse iAccountManagerResponse, Account account, String str, boolean z, Bundle bundle, int i);
}

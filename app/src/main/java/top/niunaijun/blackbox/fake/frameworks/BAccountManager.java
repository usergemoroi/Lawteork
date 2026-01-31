package top.niunaijun.blackbox.fake.frameworks;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Map;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.core.system.ServiceManager;
import top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService;
/* loaded from: classes3.dex */
public class BAccountManager extends BlackManager<IBAccountManagerService> {
    private static final BAccountManager sBAccountManager = new BAccountManager();

    public static BAccountManager get() {
        return sBAccountManager;
    }

    public boolean accountAuthenticated(Account account) {
        try {
            return getService().accountAuthenticated(account, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void addAccount(IAccountManagerResponse iAccountManagerResponse, String str, String str2, String[] strArr, boolean z, Bundle bundle) {
        try {
            getService().addAccount(iAccountManagerResponse, str, str2, strArr, z, bundle, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void addAccountAsUser(IAccountManagerResponse iAccountManagerResponse, String str, String str2, String[] strArr, boolean z, Bundle bundle) {
        try {
            getService().addAccountAsUser(iAccountManagerResponse, str, str2, strArr, z, bundle, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public boolean addAccountExplicitly(Account account, String str, Bundle bundle) {
        try {
            return getService().addAccountExplicitly(account, str, bundle, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean addAccountExplicitlyWithVisibility(Account account, String str, Bundle bundle, Map map) {
        try {
            return getService().addAccountExplicitlyWithVisibility(account, str, bundle, map, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clearPassword(Account account) {
        try {
            getService().clearPassword(account, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void confirmCredentialsAsUser(IAccountManagerResponse iAccountManagerResponse, Account account, Bundle bundle, boolean z) {
        try {
            getService().confirmCredentialsAsUser(iAccountManagerResponse, account, bundle, z, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void copyAccountToUser(IAccountManagerResponse iAccountManagerResponse, Account account, int i, int i2) {
        try {
            getService().copyAccountToUser(iAccountManagerResponse, account, i, i2);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void editProperties(IAccountManagerResponse iAccountManagerResponse, String str, boolean z) {
        try {
            getService().editProperties(iAccountManagerResponse, str, z, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void getAccountByTypeAndFeatures(IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr) {
        try {
            getService().getAccountByTypeAndFeatures(iAccountManagerResponse, str, strArr, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public int getAccountVisibility(Account account, String str) {
        try {
            return getService().getAccountVisibility(account, str, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return 3;
        }
    }

    public Map getAccountsAndVisibilityForPackage(String str, String str2) {
        try {
            return getService().getAccountsAndVisibilityForPackage(str, str2, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Account[] getAccountsAsUser(String str) {
        try {
            return getService().getAccountsAsUser(str, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void getAccountsByFeatures(IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr) {
        try {
            getService().getAccountsByFeatures(iAccountManagerResponse, str, strArr, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public Account[] getAccountsByTypeForPackage(String str, String str2) {
        try {
            return getService().getAccountsByTypeForPackage(str, str2, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Account[] getAccountsForPackage(String str, int i) {
        try {
            return getService().getAccountsForPackage(str, i, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void getAuthToken(IAccountManagerResponse iAccountManagerResponse, Account account, String str, boolean z, boolean z2, Bundle bundle) {
        try {
            getService().getAuthToken(iAccountManagerResponse, account, str, z, z2, bundle, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void getAuthTokenLabel(IAccountManagerResponse iAccountManagerResponse, String str, String str2) {
        try {
            getService().getAuthTokenLabel(iAccountManagerResponse, str, str2, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public AuthenticatorDescription[] getAuthenticatorTypes() {
        try {
            return getService().getAuthenticatorTypes(BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Map getPackagesAndVisibilityForAccount(Account account) {
        try {
            return getService().getPackagesAndVisibilityForAccount(account, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getPassword(Account account) {
        try {
            return getService().getPassword(account, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // top.niunaijun.blackbox.fake.frameworks.BlackManager
    public String getServiceName() {
        return ServiceManager.ACCOUNT_MANAGER;
    }

    public String getUserData(Account account, String str) {
        try {
            return getService().getUserData(account, str, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void invalidateAuthToken(String str, String str2) {
        try {
            getService().invalidateAuthToken(str, str2, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public String peekAuthToken(Account account, String str) {
        try {
            return getService().peekAuthToken(account, str, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void registerAccountListener(String[] strArr, String str) {
        try {
            getService().registerAccountListener(strArr, str, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void removeAccountAsUser(IAccountManagerResponse iAccountManagerResponse, Account account, boolean z) {
        try {
            getService().removeAccountAsUser(iAccountManagerResponse, account, z, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public boolean removeAccountExplicitly(Account account) {
        try {
            return getService().removeAccountExplicitly(account, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean setAccountVisibility(Account account, String str, int i) {
        try {
            return getService().setAccountVisibility(account, str, i, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void setAuthToken(Account account, String str, String str2) {
        try {
            getService().setAuthToken(account, str, str2, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setPassword(Account account, String str) {
        try {
            getService().setPassword(account, str, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setUserData(Account account, String str, String str2) {
        try {
            getService().setUserData(account, str, str2, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void unregisterAccountListener(String[] strArr, String str) {
        try {
            getService().unregisterAccountListener(strArr, str, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void updateAppPermission(Account account, String str, int i, boolean z) {
        try {
            getService().updateAppPermission(account, str, i, z);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void updateCredentials(IAccountManagerResponse iAccountManagerResponse, Account account, String str, boolean z, Bundle bundle) {
        try {
            getService().updateCredentials(iAccountManagerResponse, account, str, z, bundle, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}

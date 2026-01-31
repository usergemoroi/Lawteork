package top.niunaijun.blackbox.core.system.accounts;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountAuthenticatorResponse;
import android.accounts.IAccountManagerResponse;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.core.util.AtomicFile;
import androidx.core.util.Preconditions;
import black.com.android.internal.RstyleableStatic;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.lingala.zip4j.util.InternalZipConstants;
import p017g.AbstractC0927a;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.core.env.BEnvironment;
import top.niunaijun.blackbox.core.system.BProcessManagerService;
import top.niunaijun.blackbox.core.system.ISystemService;
import top.niunaijun.blackbox.core.system.ProcessRecord;
import top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService;
import top.niunaijun.blackbox.core.system.p027pm.BPackageManagerService;
import top.niunaijun.blackbox.core.system.p027pm.PackageMonitor;
import top.niunaijun.blackbox.utils.ArrayUtils;
import top.niunaijun.blackbox.utils.CloseUtils;
import top.niunaijun.blackbox.utils.FileUtils;
import top.niunaijun.blackbox.utils.Slog;
import top.niunaijun.blackbox.utils.compat.AccountManagerCompat;
/* loaded from: classes3.dex */
public class BAccountManagerService extends IBAccountManagerService.Stub implements ISystemService, PackageMonitor {
    private static final int MESSAGE_COPY_SHARED_ACCOUNT = 4;
    private static final int MESSAGE_TIMED_OUT = 3;
    private static final String TAG = "AccountManagerService";
    private static BAccountManagerService sService = new BAccountManagerService();
    private static final Account[] EMPTY_ACCOUNT_ARRAY = new Account[0];
    private final Map<Integer, BUserAccounts> mUserAccountsMap = new HashMap();
    private final AuthenticatorCache mAuthenticatorCache = new AuthenticatorCache();
    private final LinkedList<TokenCache> mTokenCaches = new LinkedList<>();
    private final LinkedHashMap<String, Session> mSessions = new LinkedHashMap<>();
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private final Context mContext = BlackBoxCore.getContext();
    private final BPackageManagerService mPms = BPackageManagerService.get();

    /* loaded from: classes3.dex */
    public static final class AuthenticatorCache {
        final Map<String, AuthenticatorInfo> authenticators;

        private AuthenticatorCache() {
            this.authenticators = new HashMap();
        }
    }

    /* loaded from: classes3.dex */
    public static final class AuthenticatorInfo {
        final AuthenticatorDescription desc;
        final ServiceInfo serviceInfo;

        public AuthenticatorInfo(AuthenticatorDescription authenticatorDescription, ServiceInfo serviceInfo) {
            this.desc = authenticatorDescription;
            this.serviceInfo = serviceInfo;
        }
    }

    /* loaded from: classes3.dex */
    public class GetAccountsByTypeAndFeatureSession extends Session {
        private volatile Account[] mAccountsOfType;
        private volatile ArrayList<Account> mAccountsWithFeatures;
        private volatile int mCurrentAccount;
        private final String[] mFeatures;
        private final boolean mIncludeManagedNotVisible;
        private final String mPackageName;
        private final int mUserId;

        public GetAccountsByTypeAndFeatureSession(BUserAccounts bUserAccounts, IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr, int i, String str2, boolean z) {
            super(BAccountManagerService.this, bUserAccounts, iAccountManagerResponse, str, false, true, null, false);
            this.mAccountsOfType = null;
            this.mAccountsWithFeatures = null;
            this.mCurrentAccount = 0;
            this.mUserId = i;
            this.mFeatures = strArr;
            this.mPackageName = str2;
            this.mIncludeManagedNotVisible = z;
        }

        public void checkAccount() {
            if (this.mCurrentAccount >= this.mAccountsOfType.length) {
                sendResult();
                return;
            }
            IAccountAuthenticator iAccountAuthenticator = this.mAuthenticator;
            if (iAccountAuthenticator == null) {
                if (Log.isLoggable(BAccountManagerService.TAG, 2)) {
                    Log.v(BAccountManagerService.TAG, "checkAccount: aborting session since we are no longer connected to the authenticator, " + toDebugString());
                    return;
                }
                return;
            }
            try {
                iAccountAuthenticator.hasFeatures(this, this.mAccountsOfType[this.mCurrentAccount], this.mFeatures);
            } catch (RemoteException e) {
                onError(1, "remote exception");
            }
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.Session, android.accounts.IAccountAuthenticatorResponse
        public void onResult(Bundle bundle) {
            this.mNumResults++;
            if (bundle == null) {
                onError(5, "null bundle");
                return;
            }
            if (bundle.getBoolean("booleanResult", false)) {
                this.mAccountsWithFeatures.add(this.mAccountsOfType[this.mCurrentAccount]);
            }
            this.mCurrentAccount++;
            checkAccount();
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.Session
        public void run() {
            this.mAccountsOfType = BAccountManagerService.this.getAccountsFromCache(this.mAccounts, this.mAccountType, this.mPackageName, this.mIncludeManagedNotVisible);
            this.mAccountsWithFeatures = new ArrayList<>(this.mAccountsOfType.length);
            this.mCurrentAccount = 0;
            checkAccount();
        }

        public void sendResult() {
            IAccountManagerResponse responseAndClose = getResponseAndClose();
            if (responseAndClose != null) {
                try {
                    int size = this.mAccountsWithFeatures.size();
                    Account[] accountArr = new Account[size];
                    for (int i = 0; i < size; i++) {
                        accountArr[i] = this.mAccountsWithFeatures.get(i);
                    }
                    if (Log.isLoggable(BAccountManagerService.TAG, 2)) {
                        Log.v(BAccountManagerService.TAG, getClass().getSimpleName() + " calling onResult() on response " + responseAndClose);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putParcelableArray("accounts", accountArr);
                    responseAndClose.onResult(bundle);
                } catch (RemoteException e) {
                    if (Log.isLoggable(BAccountManagerService.TAG, 2)) {
                        Log.v(BAccountManagerService.TAG, "failure while notifying response", e);
                    }
                }
            }
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.Session
        public String toDebugString(long j) {
            StringBuilder append = new StringBuilder().append(super.toDebugString(j)).append(", getAccountsByTypeAndFeatures, ");
            String[] strArr = this.mFeatures;
            return append.append(strArr != null ? TextUtils.join(",", strArr) : null).toString();
        }
    }

    /* loaded from: classes3.dex */
    public class RemoveAccountSession extends Session {
        final Account mAccount;

        public RemoveAccountSession(BUserAccounts bUserAccounts, IAccountManagerResponse iAccountManagerResponse, Account account, boolean z) {
            super(BAccountManagerService.this, bUserAccounts, iAccountManagerResponse, account.type, z, true, account.name, false);
            this.mAccount = account;
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.Session, android.accounts.IAccountAuthenticatorResponse
        public void onResult(Bundle bundle) {
            if (bundle != null && bundle.containsKey("booleanResult") && !bundle.containsKey("intent")) {
                if (bundle.getBoolean("booleanResult")) {
                    BAccountManagerService.this.removeAccountInternal(this.mAccounts, this.mAccount);
                }
                IAccountManagerResponse responseAndClose = getResponseAndClose();
                if (responseAndClose != null) {
                    if (Log.isLoggable(BAccountManagerService.TAG, 2)) {
                        Log.v(BAccountManagerService.TAG, getClass().getSimpleName() + " calling onResult() on response " + responseAndClose);
                    }
                    try {
                        responseAndClose.onResult(bundle);
                    } catch (RemoteException e) {
                        Slog.m17e(BAccountManagerService.TAG, "Error calling onResult()", e);
                    }
                }
            }
            super.onResult(bundle);
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.Session
        public void run() {
            this.mAuthenticator.getAccountRemovalAllowed(this, this.mAccount);
        }

        @Override // top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.Session
        public String toDebugString(long j) {
            return super.toDebugString(j) + ", removeAccount, account " + this.mAccount;
        }
    }

    /* loaded from: classes3.dex */
    public abstract class Session extends IAccountAuthenticatorResponse.Stub implements IBinder.DeathRecipient, ServiceConnection {
        final String mAccountName;
        final String mAccountType;
        protected final BUserAccounts mAccounts;
        final boolean mAuthDetailsRequired;
        IAccountAuthenticator mAuthenticator;
        final long mCreationTime;
        final boolean mExpectActivityLaunch;
        private int mNumErrors;
        private int mNumRequestContinued;
        public int mNumResults;
        IAccountManagerResponse mResponse;
        private final boolean mStripAuthTokenFromResult;
        final boolean mUpdateLastAuthenticatedTime;

        public Session(BAccountManagerService bAccountManagerService, BUserAccounts bUserAccounts, IAccountManagerResponse iAccountManagerResponse, String str, boolean z, boolean z2, String str2, boolean z3) {
            this(bUserAccounts, iAccountManagerResponse, str, z, z2, str2, z3, false);
        }

        private boolean bindToAuthenticator(String str) {
            AuthenticatorInfo authenticatorInfo = BAccountManagerService.this.mAuthenticatorCache.authenticators.get(str);
            if (authenticatorInfo == null) {
                if (Log.isLoggable(BAccountManagerService.TAG, 2)) {
                    Log.v(BAccountManagerService.TAG, "there is no authenticator for " + str + ", bailing out");
                }
                return false;
            }
            Intent intent = new Intent();
            intent.setAction("android.accounts.AccountAuthenticator");
            ServiceInfo serviceInfo = authenticatorInfo.serviceInfo;
            ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
            intent.setComponent(componentName);
            intent.putExtra("_B_|_UserId", this.mAccounts.userId);
            if (Log.isLoggable(BAccountManagerService.TAG, 2)) {
                Log.v(BAccountManagerService.TAG, "performing bindService to " + componentName);
            }
            if (BAccountManagerService.this.mContext.bindService(intent, this, 1)) {
                return true;
            }
            if (Log.isLoggable(BAccountManagerService.TAG, 2)) {
                Log.v(BAccountManagerService.TAG, "bindService to " + componentName + " failed");
            }
            return false;
        }

        private void close() {
            synchronized (BAccountManagerService.this.mSessions) {
                if (BAccountManagerService.this.mSessions.remove(toString()) == null) {
                    return;
                }
                IAccountManagerResponse iAccountManagerResponse = this.mResponse;
                if (iAccountManagerResponse != null) {
                    iAccountManagerResponse.asBinder().unlinkToDeath(this, 0);
                    this.mResponse = null;
                }
                cancelTimeout();
                unbind();
            }
        }

        private void unbind() {
            if (this.mAuthenticator != null) {
                this.mAuthenticator = null;
                BAccountManagerService.this.mContext.unbindService(this);
            }
        }

        public void bind() {
            if (Log.isLoggable(BAccountManagerService.TAG, 2)) {
                Log.v(BAccountManagerService.TAG, "initiating bind to authenticator type " + this.mAccountType);
            }
            if (bindToAuthenticator(this.mAccountType)) {
                return;
            }
            Log.d(BAccountManagerService.TAG, "bind attempt failed for " + toDebugString());
            onError(1, "bind failure");
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            this.mResponse = null;
            close();
        }

        public void cancelTimeout() {
            BAccountManagerService.this.mHandler.removeMessages(3, this);
        }

        public boolean checkKeyIntent(int i, Intent intent) {
            if (intent.getClipData() == null) {
                intent.setClipData(ClipData.newPlainText(null, null));
            }
            intent.setFlags(intent.getFlags() & (-196));
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return BAccountManagerService.this.mPms.resolveActivity(intent, 0, null, this.mAccounts.userId) != null;
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        public IAccountManagerResponse getResponseAndClose() {
            IAccountManagerResponse iAccountManagerResponse = this.mResponse;
            if (iAccountManagerResponse == null) {
                return null;
            }
            close();
            return iAccountManagerResponse;
        }

        public void onError(int i, String str) {
            this.mNumErrors++;
            IAccountManagerResponse responseAndClose = getResponseAndClose();
            if (responseAndClose == null) {
                if (Log.isLoggable(BAccountManagerService.TAG, 2)) {
                    Log.v(BAccountManagerService.TAG, "Session.onError: already closed");
                    return;
                }
                return;
            }
            if (Log.isLoggable(BAccountManagerService.TAG, 2)) {
                Log.v(BAccountManagerService.TAG, getClass().getSimpleName() + " calling onError() on response " + responseAndClose);
            }
            try {
                responseAndClose.onError(i, str);
            } catch (RemoteException e) {
                if (Log.isLoggable(BAccountManagerService.TAG, 2)) {
                    Log.v(BAccountManagerService.TAG, "Session.onError: caught RemoteException while responding", e);
                }
            }
        }

        @Override // android.accounts.IAccountAuthenticatorResponse
        public void onRequestContinued() {
            this.mNumRequestContinued++;
        }

        public void onResult(Bundle bundle) {
            Intent intent;
            boolean z = true;
            this.mNumResults++;
            if (bundle != null) {
                boolean z2 = bundle.getBoolean("booleanResult", false);
                boolean z3 = bundle.containsKey("authAccount") && bundle.containsKey("accountType");
                if (!this.mUpdateLastAuthenticatedTime || (!z2 && !z3)) {
                    z = false;
                }
                if (z || this.mAuthDetailsRequired) {
                    boolean isAccountPresentForCaller = BAccountManagerService.this.isAccountPresentForCaller(this.mAccountName, this.mAccountType, this.mAccounts.userId);
                    if (z && isAccountPresentForCaller) {
                        BAccountManagerService.this.updateLastAuthenticatedTime(this.mAccounts, new Account(this.mAccountName, this.mAccountType));
                    }
                    if (this.mAuthDetailsRequired) {
                        bundle.putLong(AccountManagerCompat.KEY_LAST_AUTHENTICATED_TIME, isAccountPresentForCaller ? this.mAccounts.findAccountLastAuthenticatedTime(new Account(this.mAccountName, this.mAccountType)) : -1L);
                    }
                }
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("intent");
                if (intent != null && !checkKeyIntent(Binder.getCallingUid(), intent)) {
                    onError(5, "invalid intent in bundle returned");
                    return;
                }
            } else {
                intent = null;
            }
            if (bundle != null && !TextUtils.isEmpty(bundle.getString("authtoken"))) {
                String string = bundle.getString("authAccount");
                String string2 = bundle.getString("accountType");
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                    new Account(string, string2);
                }
            }
            IAccountManagerResponse responseAndClose = (this.mExpectActivityLaunch && bundle != null && bundle.containsKey("intent")) ? this.mResponse : getResponseAndClose();
            if (responseAndClose != null) {
                try {
                    if (bundle == null) {
                        if (Log.isLoggable(BAccountManagerService.TAG, 2)) {
                            Log.v(BAccountManagerService.TAG, getClass().getSimpleName() + " calling onError() on response " + responseAndClose);
                        }
                        responseAndClose.onError(5, "null bundle returned");
                        return;
                    }
                    if (this.mStripAuthTokenFromResult) {
                        bundle.remove("authtoken");
                    }
                    if (Log.isLoggable(BAccountManagerService.TAG, 2)) {
                        Log.v(BAccountManagerService.TAG, getClass().getSimpleName() + " calling onResult() on response " + responseAndClose);
                    }
                    if (bundle.getInt("errorCode", -1) <= 0 || intent != null) {
                        responseAndClose.onResult(bundle);
                    } else {
                        responseAndClose.onError(bundle.getInt("errorCode"), bundle.getString("errorMessage"));
                    }
                } catch (RemoteException e) {
                    if (Log.isLoggable(BAccountManagerService.TAG, 2)) {
                        Log.v(BAccountManagerService.TAG, "failure while notifying response", e);
                    }
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.mAuthenticator = IAccountAuthenticator.Stub.asInterface(iBinder);
            try {
                run();
            } catch (RemoteException e) {
                onError(1, "remote exception");
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.mAuthenticator = null;
            IAccountManagerResponse responseAndClose = getResponseAndClose();
            if (responseAndClose != null) {
                try {
                    responseAndClose.onError(1, "disconnected");
                } catch (RemoteException e) {
                    if (Log.isLoggable(BAccountManagerService.TAG, 2)) {
                        Log.v(BAccountManagerService.TAG, "Session.onServiceDisconnected: caught RemoteException while responding", e);
                    }
                }
            }
        }

        public void onTimedOut() {
            IAccountManagerResponse responseAndClose = getResponseAndClose();
            if (responseAndClose != null) {
                try {
                    responseAndClose.onError(1, "timeout");
                } catch (RemoteException e) {
                    if (Log.isLoggable(BAccountManagerService.TAG, 2)) {
                        Log.v(BAccountManagerService.TAG, "Session.onTimedOut: caught RemoteException while responding", e);
                    }
                }
            }
        }

        public abstract void run();

        public String toDebugString() {
            return toDebugString(SystemClock.elapsedRealtime());
        }

        public Session(BUserAccounts bUserAccounts, IAccountManagerResponse iAccountManagerResponse, String str, boolean z, boolean z2, String str2, boolean z3, boolean z4) {
            this.mNumResults = 0;
            this.mNumRequestContinued = 0;
            this.mNumErrors = 0;
            this.mAuthenticator = null;
            if (str == null) {
                throw new IllegalArgumentException("accountType is null");
            }
            this.mAccounts = bUserAccounts;
            this.mStripAuthTokenFromResult = z2;
            this.mResponse = iAccountManagerResponse;
            this.mAccountType = str;
            this.mExpectActivityLaunch = z;
            this.mCreationTime = SystemClock.elapsedRealtime();
            this.mAccountName = str2;
            this.mAuthDetailsRequired = z3;
            this.mUpdateLastAuthenticatedTime = z4;
            synchronized (BAccountManagerService.this.mSessions) {
                BAccountManagerService.this.mSessions.put(toString(), this);
            }
            if (iAccountManagerResponse != null) {
                try {
                    iAccountManagerResponse.asBinder().linkToDeath(this, 0);
                } catch (RemoteException e) {
                    this.mResponse = null;
                    binderDied();
                }
            }
        }

        public String toDebugString(long j) {
            return "Session: expectLaunch " + this.mExpectActivityLaunch + ", connected " + (this.mAuthenticator != null) + ", stats (" + this.mNumResults + InternalZipConstants.ZIP_FILE_SEPARATOR + this.mNumRequestContinued + InternalZipConstants.ZIP_FILE_SEPARATOR + this.mNumErrors + "), lifetime " + ((j - this.mCreationTime) / 1000.0d);
        }
    }

    private boolean addAccountInternal(BUserAccounts bUserAccounts, Account account, String str, Bundle bundle, Map<String, Integer> map) {
        if (bUserAccounts == null) {
            bUserAccounts = new BUserAccounts();
        }
        synchronized (bUserAccounts.lock) {
            if (bUserAccounts.getAccount(account) != null) {
                Slog.m20d(TAG, "skipping since insertExtra failed for key " + account);
                return false;
            }
            BAccount addAccount = bUserAccounts.addAccount(account);
            addAccount.password = str;
            if (bundle != null) {
                for (String str2 : bundle.keySet()) {
                    addAccount.insertExtra(str2, bundle.getString(str2));
                }
            }
            if (map != null) {
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    setAccountVisibility(account, entry.getKey(), entry.getValue().intValue(), bUserAccounts);
                }
            }
            saveAllAccounts();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void completeCloningAccount(IAccountManagerResponse iAccountManagerResponse, final Bundle bundle, final Account account, BUserAccounts bUserAccounts, final int i) {
        new Session(bUserAccounts, iAccountManagerResponse, account.type, false, false, account.name, false) { // from class: top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.8
            @Override // top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.Session, android.accounts.IAccountAuthenticatorResponse
            public void onError(int i2, String str) {
                super.onError(i2, str);
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.Session, android.accounts.IAccountAuthenticatorResponse
            public void onResult(Bundle bundle2) {
                super.onResult(bundle2);
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.Session
            public void run() {
                BAccountManagerService bAccountManagerService = BAccountManagerService.this;
                for (Account account2 : bAccountManagerService.getAccounts(i, bAccountManagerService.mContext.getPackageName())) {
                    if (account2.equals(account)) {
                        this.mAuthenticator.addAccountFromCredentials(this, account, bundle);
                        return;
                    }
                }
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.Session
            public String toDebugString(long j) {
                return super.toDebugString(j) + ", getAccountCredentialsForClone, " + account.type;
            }
        }.bind();
    }

    private Account[] filterAccounts(BUserAccounts bUserAccounts, Account[] accountArr, String str, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Account account : accountArr) {
            int intValue = resolveAccountVisibility(account, str, bUserAccounts).intValue();
            if (intValue == 1 || intValue == 2 || (z && intValue == 4)) {
                linkedHashMap.put(account, Integer.valueOf(intValue));
            }
        }
        return (Account[]) linkedHashMap.keySet().toArray(new Account[0]);
    }

    private void generateServicesMap(List<ResolveInfo> list, Map<String, AuthenticatorInfo> map, RegisteredServicesParser registeredServicesParser) {
        AuthenticatorDescription parseAuthenticatorDescription;
        for (ResolveInfo resolveInfo : list) {
            XmlResourceParser parser = registeredServicesParser.getParser(this.mContext, resolveInfo.serviceInfo, "android.accounts.AccountAuthenticator");
            if (parser != null) {
                try {
                    AttributeSet asAttributeSet = Xml.asAttributeSet(parser);
                    while (true) {
                        int next = parser.next();
                        if (next == 1 || next == 2) {
                            break;
                        }
                    }
                    if ("account-authenticator".equals(parser.getName()) && (parseAuthenticatorDescription = parseAuthenticatorDescription(registeredServicesParser.getResources(this.mContext, resolveInfo.serviceInfo.applicationInfo), resolveInfo.serviceInfo.packageName, asAttributeSet)) != null) {
                        map.put(parseAuthenticatorDescription.type, new AuthenticatorInfo(parseAuthenticatorDescription, resolveInfo.serviceInfo));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static BAccountManagerService get() {
        return sService;
    }

    private int getAccountVisibilityFromCache(Account account, String str, BUserAccounts bUserAccounts) {
        int intValue;
        synchronized (bUserAccounts.lock) {
            Integer num = getPackagesAndVisibilityForAccountLocked(account, bUserAccounts).get(str);
            intValue = num != null ? num.intValue() : 0;
        }
        return intValue;
    }

    private String getCallingPackageName() {
        int callingPid = Binder.getCallingPid();
        ProcessRecord findProcessByPid = BProcessManagerService.get().findProcessByPid(callingPid);
        if (findProcessByPid != null) {
            return findProcessByPid.getPackageName();
        }
        throw new IllegalArgumentException("ProcessRecord is null, PID: " + callingPid);
    }

    private Map<String, Integer> getPackagesAndVisibilityForAccountLocked(Account account, BUserAccounts bUserAccounts) {
        return bUserAccounts.getVisibility(account);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleGetAccountsResult(IAccountManagerResponse iAccountManagerResponse, Account[] accountArr, String str, int i) {
        if (needToStartChooseAccountActivity(accountArr, str, i)) {
            return;
        }
        if (accountArr.length != 1) {
            onResult(iAccountManagerResponse, new Bundle());
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", accountArr[0].name);
        bundle.putString("accountType", accountArr[0].type);
        onResult(iAccountManagerResponse, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isAccountPresentForCaller(String str, String str2, int i) {
        BUserAccounts userAccounts = getUserAccounts(i);
        return (userAccounts == null || userAccounts.getAccount(new Account(str, str2)) == null) ? false : true;
    }

    private void loadAccounts() {
        FileInputStream fileInputStream;
        Throwable th;
        Exception e;
        Parcel obtain = Parcel.obtain();
        try {
            if (!BEnvironment.getAccountsConf().exists()) {
                obtain.recycle();
                CloseUtils.close(null);
                return;
            }
            fileInputStream = new FileInputStream(BEnvironment.getAccountsConf());
            try {
                try {
                    byte[] byteArray = FileUtils.toByteArray(fileInputStream);
                    obtain.unmarshall(byteArray, 0, byteArray.length);
                    obtain.setDataPosition(0);
                    HashMap readHashMap = obtain.readHashMap(BUserAccounts.class.getClassLoader());
                    if (readHashMap == null) {
                        obtain.recycle();
                        CloseUtils.close(fileInputStream);
                        return;
                    }
                    synchronized (this.mUserAccountsMap) {
                        this.mUserAccountsMap.clear();
                        for (Integer num : readHashMap.keySet()) {
                            this.mUserAccountsMap.put(num, (BUserAccounts) readHashMap.get(num));
                        }
                    }
                    obtain.recycle();
                    CloseUtils.close(fileInputStream);
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    obtain.recycle();
                    CloseUtils.close(fileInputStream);
                }
            } catch (Throwable th2) {
                th = th2;
                obtain.recycle();
                CloseUtils.close(fileInputStream);
                throw th;
            }
        } catch (Exception e3) {
            fileInputStream = null;
            e = e3;
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
            obtain.recycle();
            CloseUtils.close(fileInputStream);
            throw th;
        }
    }

    private boolean needToStartChooseAccountActivity(Account[] accountArr, String str, int i) {
        if (accountArr.length < 1) {
            return false;
        }
        return accountArr.length > 1 || resolveAccountVisibility(accountArr[0], str, getUserAccounts(i)).intValue() == 4;
    }

    private void onResult(IAccountManagerResponse iAccountManagerResponse, Bundle bundle) {
        if (bundle == null) {
            Log.e(TAG, "the result is unexpectedly null", new Exception());
        }
        if (Log.isLoggable(TAG, 2)) {
            Log.v(TAG, getClass().getSimpleName() + " calling onResult() on response " + iAccountManagerResponse);
        }
        try {
            iAccountManagerResponse.onResult(bundle);
        } catch (RemoteException e) {
            if (Log.isLoggable(TAG, 2)) {
                Log.v(TAG, "failure while notifying response", e);
            }
        }
    }

    private static AuthenticatorDescription parseAuthenticatorDescription(Resources resources, String str, AttributeSet attributeSet) {
        RstyleableStatic m84a = AbstractC0927a.m84a();
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, m84a.AccountAuthenticator());
        try {
            String string = obtainAttributes.getString(m84a.AccountAuthenticator_accountType().intValue());
            int resourceId = obtainAttributes.getResourceId(m84a.AccountAuthenticator_label().intValue(), 0);
            int resourceId2 = obtainAttributes.getResourceId(m84a.AccountAuthenticator_icon().intValue(), 0);
            int resourceId3 = obtainAttributes.getResourceId(m84a.AccountAuthenticator_smallIcon().intValue(), 0);
            int resourceId4 = obtainAttributes.getResourceId(m84a.AccountAuthenticator_accountPreferences().intValue(), 0);
            boolean z = obtainAttributes.getBoolean(m84a.AccountAuthenticator_customTokens().intValue(), false);
            if (TextUtils.isEmpty(string)) {
                obtainAttributes.recycle();
                return null;
            }
            return new AuthenticatorDescription(string, str, resourceId, resourceId2, resourceId3, resourceId4, z);
        } finally {
            obtainAttributes.recycle();
        }
    }

    private String readUserDataInternal(BUserAccounts bUserAccounts, Account account, String str) {
        String str2;
        if (bUserAccounts == null) {
            return null;
        }
        synchronized (bUserAccounts.lock) {
            str2 = bUserAccounts.getAccountUserData(account).get(str);
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean removeAccountInternal(BUserAccounts bUserAccounts, Account account) {
        boolean delAccount;
        synchronized (bUserAccounts.lock) {
            delAccount = bUserAccounts.delAccount(account);
            if (delAccount) {
                saveAllAccounts();
            }
        }
        return delAccount;
    }

    private Integer resolveAccountVisibility(Account account, String str, BUserAccounts bUserAccounts) {
        int accountVisibilityFromCache;
        if (bUserAccounts == null || bUserAccounts.getAccount(account) == null || (accountVisibilityFromCache = getAccountVisibilityFromCache(account, str, bUserAccounts)) == 0) {
            return 3;
        }
        return Integer.valueOf(accountVisibilityFromCache);
    }

    private void saveAllAccounts() {
        synchronized (this.mUserAccountsMap) {
            Parcel obtain = Parcel.obtain();
            AtomicFile atomicFile = new AtomicFile(BEnvironment.getAccountsConf());
            obtain.writeMap(this.mUserAccountsMap);
            FileOutputStream fileOutputStream = null;
            try {
                fileOutputStream = atomicFile.startWrite();
                FileUtils.writeParcelToOutput(obtain, fileOutputStream);
                atomicFile.finishWrite(fileOutputStream);
                CloseUtils.close(fileOutputStream);
            } catch (IOException e) {
                e.printStackTrace();
                atomicFile.failWrite(fileOutputStream);
                CloseUtils.close(fileOutputStream);
            }
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean updateLastAuthenticatedTime(BUserAccounts bUserAccounts, Account account) {
        bUserAccounts.updateLastAuthenticatedTime(account);
        return true;
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public boolean accountAuthenticated(Account account, int i) {
        Objects.requireNonNull(account, "account cannot be null");
        BUserAccounts userAccounts = getUserAccounts(i);
        if (userAccounts == null) {
            return false;
        }
        return updateLastAuthenticatedTime(userAccounts, account);
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public void addAccount(IAccountManagerResponse iAccountManagerResponse, final String str, final String str2, final String[] strArr, boolean z, Bundle bundle, int i) {
        BAccountManagerService bAccountManagerService;
        final Bundle bundle2;
        if (iAccountManagerResponse == null) {
            throw new IllegalArgumentException("response is null");
        }
        if (str == null) {
            throw new IllegalArgumentException("accountType is null");
        }
        if (bundle == null) {
            bAccountManagerService = this;
            bundle2 = new Bundle();
        } else {
            bAccountManagerService = this;
            bundle2 = bundle;
        }
        new Session(bAccountManagerService.getUserAccounts(i), iAccountManagerResponse, str, z, true, null, false, true) { // from class: top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.4
            @Override // top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.Session
            public void run() {
                this.mAuthenticator.addAccount(this, this.mAccountType, str2, strArr, bundle2);
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.Session
            public String toDebugString(long j) {
                return super.toDebugString(j) + ", addAccount, accountType " + str + ", requiredFeatures " + Arrays.toString(strArr);
            }
        }.bind();
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public void addAccountAsUser(IAccountManagerResponse iAccountManagerResponse, String str, String str2, String[] strArr, boolean z, Bundle bundle, int i) {
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public boolean addAccountExplicitly(Account account, String str, Bundle bundle, int i) {
        return addAccountExplicitlyWithVisibility(account, str, bundle, null, i);
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public boolean addAccountExplicitlyWithVisibility(Account account, String str, Bundle bundle, Map map, int i) {
        return addAccountInternal(getUserAccounts(i), account, str, bundle, map);
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public void clearPassword(Account account, int i) {
        setPassword(account, null, i);
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public void confirmCredentialsAsUser(IAccountManagerResponse iAccountManagerResponse, Account account, Bundle bundle, boolean z, int i) {
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public void copyAccountToUser(final IAccountManagerResponse iAccountManagerResponse, final Account account, final int i, int i2) {
        BUserAccounts userAccounts = getUserAccounts(i);
        final BUserAccounts userAccounts2 = getUserAccounts(i2);
        if (userAccounts != null && userAccounts2 != null) {
            Slog.m20d(TAG, "Copying account " + account.toString() + " from user " + i + " to user " + i2);
            new Session(userAccounts, iAccountManagerResponse, account.type, false, false, account.name, false) { // from class: top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.2
                @Override // top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.Session, android.accounts.IAccountAuthenticatorResponse
                public void onResult(Bundle bundle) {
                    if (bundle == null || !bundle.getBoolean("booleanResult", false)) {
                        super.onResult(bundle);
                    } else {
                        BAccountManagerService.this.completeCloningAccount(iAccountManagerResponse, bundle, account, userAccounts2, i);
                    }
                }

                @Override // top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.Session
                public void run() {
                    this.mAuthenticator.getAccountCredentialsForCloning(this, account);
                }

                @Override // top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.Session
                public String toDebugString(long j) {
                    return super.toDebugString(j) + ", getAccountCredentialsForClone, " + account.type;
                }
            }.bind();
        } else if (iAccountManagerResponse != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("booleanResult", false);
            try {
                iAccountManagerResponse.onResult(bundle);
            } catch (RemoteException e) {
                Slog.m12w(TAG, "Failed to report error back to the client." + e);
            }
        }
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public void editProperties(IAccountManagerResponse iAccountManagerResponse, final String str, boolean z, int i) {
        if (iAccountManagerResponse == null) {
            throw new IllegalArgumentException("response is null");
        }
        if (str == null) {
            throw new IllegalArgumentException("accountType is null");
        }
        new Session(getUserAccounts(i), iAccountManagerResponse, str, z, true, null, false) { // from class: top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.6
            @Override // top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.Session
            public void run() {
                this.mAuthenticator.editProperties(this, this.mAccountType);
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.Session
            public String toDebugString(long j) {
                return super.toDebugString(j) + ", editProperties, accountType " + str;
            }
        }.bind();
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public void getAccountByTypeAndFeatures(final IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr, final int i) {
        if (iAccountManagerResponse == null) {
            throw new IllegalArgumentException("response is null");
        }
        if (str == null) {
            throw new IllegalArgumentException("accountType is null");
        }
        final String callingPackageName = getCallingPackageName();
        BUserAccounts userAccounts = getUserAccounts(i);
        if (ArrayUtils.isEmpty(strArr)) {
            handleGetAccountsResult(iAccountManagerResponse, getAccountsFromCache(userAccounts, str, callingPackageName, true), callingPackageName, i);
        } else {
            new GetAccountsByTypeAndFeatureSession(userAccounts, new IAccountManagerResponse.Stub() { // from class: top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.1
                @Override // android.accounts.IAccountManagerResponse
                public void onError(int i2, String str2) {
                }

                @Override // android.accounts.IAccountManagerResponse
                public void onResult(Bundle bundle) {
                    Parcelable[] parcelableArray = bundle.getParcelableArray("accounts");
                    Account[] accountArr = new Account[parcelableArray.length];
                    for (int i2 = 0; i2 < parcelableArray.length; i2++) {
                        accountArr[i2] = (Account) parcelableArray[i2];
                    }
                    BAccountManagerService.this.handleGetAccountsResult(iAccountManagerResponse, accountArr, callingPackageName, i);
                }
            }, str, strArr, i, callingPackageName, true).bind();
        }
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public int getAccountVisibility(Account account, String str, int i) {
        Objects.requireNonNull(account, "account cannot be null");
        Objects.requireNonNull(str, "packageName cannot be null");
        BUserAccounts userAccounts = getUserAccounts(i);
        if ("android:accounts:key_legacy_visible".equals(str)) {
            int accountVisibilityFromCache = getAccountVisibilityFromCache(account, str, userAccounts);
            if (accountVisibilityFromCache != 0) {
                return accountVisibilityFromCache;
            }
            return 2;
        } else if ("android:accounts:key_legacy_not_visible".equals(str)) {
            int accountVisibilityFromCache2 = getAccountVisibilityFromCache(account, str, userAccounts);
            if (accountVisibilityFromCache2 != 0) {
                return accountVisibilityFromCache2;
            }
            return 4;
        } else {
            return resolveAccountVisibility(account, str, userAccounts).intValue();
        }
    }

    public Account[] getAccounts(int i, String str) {
        return (Account[]) getUserAccounts(i).accounts.toArray(new Account[0]);
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public Map getAccountsAndVisibilityForPackage(String str, String str2, int i) {
        Integer num;
        HashMap hashMap = new HashMap();
        BUserAccounts userAccounts = getUserAccounts(i);
        synchronized (userAccounts.lock) {
            for (BAccount bAccount : userAccounts.accounts) {
                if (bAccount.account.type.equals(str2) && (num = userAccounts.getVisibility(bAccount.account).get(str)) != null) {
                    hashMap.put(bAccount.account, num);
                }
            }
        }
        return hashMap;
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public Account[] getAccountsAsUser(String str, int i) {
        BUserAccounts userAccounts = getUserAccounts(i);
        ArrayList arrayList = new ArrayList();
        synchronized (userAccounts.lock) {
            for (BAccount bAccount : userAccounts.accounts) {
                if (bAccount.account.type.equals(str)) {
                    arrayList.add(bAccount.account);
                }
            }
        }
        return (Account[]) arrayList.toArray(new Account[0]);
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public void getAccountsByFeatures(IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr, int i) {
        if (iAccountManagerResponse == null) {
            throw new IllegalArgumentException("response is null");
        }
        if (str == null) {
            throw new IllegalArgumentException("accountType is null");
        }
        String callingPackageName = getCallingPackageName();
        BUserAccounts userAccounts = getUserAccounts(i);
        if (strArr != null && strArr.length != 0) {
            new GetAccountsByTypeAndFeatureSession(userAccounts, iAccountManagerResponse, str, strArr, i, callingPackageName, false).bind();
            return;
        }
        Account[] accountsFromCache = getAccountsFromCache(userAccounts, str, callingPackageName, false);
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("accounts", accountsFromCache);
        onResult(iAccountManagerResponse, bundle);
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public Account[] getAccountsByTypeForPackage(String str, String str2, int i) {
        Integer num;
        BUserAccounts userAccounts = getUserAccounts(i);
        ArrayList arrayList = new ArrayList();
        synchronized (userAccounts.lock) {
            for (BAccount bAccount : userAccounts.accounts) {
                if (bAccount.account.type.equals(str) && (num = bAccount.visibility.get(str2)) != null && num.intValue() == 1) {
                    arrayList.add(bAccount.account);
                }
            }
        }
        return (Account[]) arrayList.toArray(new Account[0]);
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public Account[] getAccountsForPackage(String str, int i, int i2) {
        BUserAccounts userAccounts = getUserAccounts(i2);
        ArrayList arrayList = new ArrayList();
        synchronized (userAccounts.lock) {
            for (BAccount bAccount : userAccounts.accounts) {
                Integer num = bAccount.visibility.get(str);
                if (num != null && num.intValue() == 1) {
                    arrayList.add(bAccount.account);
                }
            }
        }
        return (Account[]) arrayList.toArray(new Account[0]);
    }

    public Account[] getAccountsFromCache(BUserAccounts bUserAccounts, String str, String str2, boolean z) {
        Account[] accountsByType;
        if (str != null) {
            synchronized (bUserAccounts.lock) {
                accountsByType = bUserAccounts.getAccountsByType(str);
            }
            return accountsByType == null ? EMPTY_ACCOUNT_ARRAY : filterAccounts(bUserAccounts, (Account[]) Arrays.copyOf(accountsByType, accountsByType.length), str2, z);
        }
        synchronized (this.mUserAccountsMap) {
            int i = 0;
            for (BUserAccounts bUserAccounts2 : this.mUserAccountsMap.values()) {
                i += bUserAccounts2.toAccounts().length;
            }
            if (i == 0) {
                return EMPTY_ACCOUNT_ARRAY;
            }
            Account[] accountArr = new Account[i];
            int i2 = 0;
            for (BUserAccounts bUserAccounts3 : this.mUserAccountsMap.values()) {
                Account[] accounts = bUserAccounts3.toAccounts();
                System.arraycopy(accounts, 0, accountArr, i2, accounts.length);
                i2 += accounts.length;
            }
            return filterAccounts(bUserAccounts, accountArr, str2, z);
        }
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public void getAuthToken(IAccountManagerResponse iAccountManagerResponse, final Account account, final String str, final boolean z, boolean z2, final Bundle bundle, int i) {
        String readCachedTokenInternal;
        String readAuthTokenInternal;
        Preconditions.checkArgument(iAccountManagerResponse != null, "response cannot be null");
        try {
            if (account == null) {
                Slog.m12w(TAG, "getAuthToken called with null account");
                iAccountManagerResponse.onError(7, "account is null");
            } else if (str == null) {
                Slog.m12w(TAG, "getAuthToken called with null authTokenType");
                iAccountManagerResponse.onError(7, "authTokenType is null");
            } else {
                BUserAccounts userAccounts = getUserAccounts(i);
                AuthenticatorInfo authenticatorInfo = this.mAuthenticatorCache.authenticators.get(account.type);
                final boolean z3 = authenticatorInfo != null && authenticatorInfo.desc.customTokens;
                final String string = bundle.getString(AccountManagerCompat.KEY_ANDROID_PACKAGE_NAME);
                bundle.putInt("callerUid", Binder.getCallingUid());
                bundle.putInt("callerPid", Binder.getCallingPid());
                if (z) {
                    bundle.putBoolean(AccountManagerCompat.KEY_NOTIFY_ON_FAILURE, true);
                }
                if (!z3 && (readAuthTokenInternal = readAuthTokenInternal(userAccounts, account, str)) != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("authtoken", readAuthTokenInternal);
                    bundle2.putString("authAccount", account.name);
                    bundle2.putString("accountType", account.type);
                    onResult(iAccountManagerResponse, bundle2);
                } else if (!z3 || (readCachedTokenInternal = readCachedTokenInternal(userAccounts, account, str, string)) == null) {
                    new Session(userAccounts, iAccountManagerResponse, account.type, z2, false, account.name, false) { // from class: top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.3
                        @Override // top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.Session, android.accounts.IAccountAuthenticatorResponse
                        public void onResult(Bundle bundle3) {
                            if (bundle3 != null) {
                                String string2 = bundle3.getString("authtoken");
                                if (string2 != null) {
                                    String string3 = bundle3.getString("authAccount");
                                    String string4 = bundle3.getString("accountType");
                                    if (TextUtils.isEmpty(string4) || TextUtils.isEmpty(string3)) {
                                        onError(5, "the type and name should not be empty");
                                        return;
                                    }
                                    Account account2 = new Account(string3, string4);
                                    if (!z3) {
                                        BAccountManagerService.this.saveAuthTokenToDatabase(this.mAccounts, account2, str, string2);
                                    }
                                    long j = bundle3.getLong(AccountManagerCompat.KEY_CUSTOM_TOKEN_EXPIRY, 0L);
                                    if (z3 && j > System.currentTimeMillis()) {
                                        BAccountManagerService.this.saveCachedToken(this.mAccounts, account, string, str, string2, j);
                                    }
                                }
                                Intent intent = (Intent) bundle3.getParcelable("intent");
                            }
                            super.onResult(bundle3);
                        }

                        @Override // top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.Session
                        public void run() {
                            this.mAuthenticator.getAuthToken(this, account, str, bundle);
                        }

                        @Override // top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.Session
                        public String toDebugString(long j) {
                            Bundle bundle3 = bundle;
                            if (bundle3 != null) {
                                bundle3.keySet();
                            }
                            return super.toDebugString(j) + ", getAuthToken, " + account.toString() + ", authTokenType " + str + ", loginOptions " + bundle + ", notifyOnAuthFailure " + z;
                        }
                    }.bind();
                } else {
                    if (Log.isLoggable(TAG, 2)) {
                        Log.v(TAG, "getAuthToken: cache hit ofr custom token authenticator.");
                    }
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("authtoken", readCachedTokenInternal);
                    bundle3.putString("authAccount", account.name);
                    bundle3.putString("accountType", account.type);
                    onResult(iAccountManagerResponse, bundle3);
                }
            }
        } catch (RemoteException e) {
            Slog.m12w(TAG, "Failed to report error back to the client." + e);
        }
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public void getAuthTokenLabel(IAccountManagerResponse iAccountManagerResponse, final String str, final String str2, int i) {
        Preconditions.checkArgument(str != null, "accountType cannot be null");
        Preconditions.checkArgument(str2 != null, "authTokenType cannot be null");
        new Session(getUserAccounts(i), iAccountManagerResponse, str, false, false, null, false) { // from class: top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.7
            @Override // top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.Session, android.accounts.IAccountAuthenticatorResponse
            public void onResult(Bundle bundle) {
                if (bundle == null) {
                    super.onResult(bundle);
                    return;
                }
                String string = bundle.getString("authTokenLabelKey");
                Bundle bundle2 = new Bundle();
                bundle2.putString("authTokenLabelKey", string);
                super.onResult(bundle2);
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.Session
            public void run() {
                this.mAuthenticator.getAuthTokenLabel(this, str2);
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.Session
            public String toDebugString(long j) {
                return super.toDebugString(j) + ", getAuthTokenLabel, " + str + ", authTokenType " + str2;
            }
        }.bind();
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public AuthenticatorDescription[] getAuthenticatorTypes(int i) {
        BUserAccounts userAccounts = getUserAccounts(i);
        ArrayList arrayList = new ArrayList();
        synchronized (userAccounts.lock) {
            for (BAccount bAccount : userAccounts.accounts) {
                AuthenticatorInfo authenticatorInfo = this.mAuthenticatorCache.authenticators.get(bAccount.account.type);
                if (authenticatorInfo != null) {
                    arrayList.add(authenticatorInfo.desc);
                }
            }
        }
        return (AuthenticatorDescription[]) arrayList.toArray(new AuthenticatorDescription[0]);
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public Map getPackagesAndVisibilityForAccount(Account account, int i) {
        return new HashMap();
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public String getPassword(Account account, int i) {
        if (Log.isLoggable(TAG, 2)) {
            Log.v(TAG, "getPassword: " + account + ", caller's uid " + Binder.getCallingUid() + ", pid " + Binder.getCallingPid());
        }
        if (account != null) {
            return readPasswordInternal(getUserAccounts(i), account);
        }
        throw new IllegalArgumentException("account is null");
    }

    public BUserAccounts getUserAccounts(int i) {
        BUserAccounts bUserAccounts;
        synchronized (this.mUserAccountsMap) {
            if (this.mUserAccountsMap.get(Integer.valueOf(i)) == null) {
                this.mUserAccountsMap.put(Integer.valueOf(i), new BUserAccounts());
            }
            bUserAccounts = this.mUserAccountsMap.get(Integer.valueOf(i));
        }
        return bUserAccounts;
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public String getUserData(Account account, String str, int i) {
        if (Log.isLoggable(TAG, 2)) {
            Log.v(TAG, String.format("getUserData( account: %s, key: %s, callerUid: %s, pid: %s", account, str, Integer.valueOf(Binder.getCallingUid()), Integer.valueOf(Binder.getCallingPid())));
        }
        Objects.requireNonNull(account, "account cannot be null");
        Objects.requireNonNull(str, "key cannot be null");
        return readUserDataInternal(getUserAccounts(i), account, str);
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public void invalidateAuthToken(String str, String str2, int i) {
        BUserAccounts userAccounts = getUserAccounts(i);
        synchronized (userAccounts.lock) {
            boolean z = false;
            for (BAccount bAccount : userAccounts.accounts) {
                if (bAccount.account.type.equals(str)) {
                    bAccount.accountUserData.values().remove(str2);
                    z = true;
                }
            }
            if (z) {
                saveAllAccounts();
            }
        }
        synchronized (this.mTokenCaches) {
            Iterator<TokenCache> it = this.mTokenCaches.iterator();
            while (it.hasNext()) {
                TokenCache next = it.next();
                if (next.account.type.equals(str) && next.userId == i && next.authToken.equals(str2)) {
                    it.remove();
                }
            }
        }
    }

    public void loadAuthenticatorCache(String str) {
        this.mAuthenticatorCache.authenticators.clear();
        Intent intent = new Intent("android.accounts.AccountAuthenticator");
        if (str != null) {
            intent.setPackage(str);
        }
        generateServicesMap(this.mPms.queryIntentServices(intent, 128, -1), this.mAuthenticatorCache.authenticators, new RegisteredServicesParser());
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.PackageMonitor
    public void onPackageInstalled(String str, int i) {
        loadAuthenticatorCache(str);
    }

    @Override // top.niunaijun.blackbox.core.system.p027pm.PackageMonitor
    public void onPackageUninstalled(String str, boolean z, int i) {
        loadAuthenticatorCache(null);
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public String peekAuthToken(Account account, String str, int i) {
        String str2;
        Objects.requireNonNull(account, "account cannot be null");
        Objects.requireNonNull(str, "authTokenType cannot be null");
        BUserAccounts userAccounts = getUserAccounts(i);
        if (userAccounts == null) {
            return null;
        }
        synchronized (userAccounts.lock) {
            str2 = userAccounts.getAuthToken(account).get(str);
        }
        return str2;
    }

    public String readAuthTokenInternal(BUserAccounts bUserAccounts, Account account, String str) {
        String str2;
        if (bUserAccounts == null) {
            return null;
        }
        synchronized (bUserAccounts.lock) {
            str2 = bUserAccounts.getAuthToken(account).get(str);
        }
        return str2;
    }

    public String readCachedTokenInternal(BUserAccounts bUserAccounts, Account account, String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.mTokenCaches) {
            Iterator<TokenCache> it = this.mTokenCaches.iterator();
            while (it.hasNext()) {
                TokenCache next = it.next();
                if (next.userId == bUserAccounts.userId && next.account.equals(account) && next.authTokenType.equals(str) && next.packageName.equals(str2)) {
                    if (next.expiryEpochMillis > currentTimeMillis) {
                        return next.authToken;
                    }
                    it.remove();
                }
            }
            return null;
        }
    }

    public String readPasswordInternal(BUserAccounts bUserAccounts, Account account) {
        if (bUserAccounts == null) {
            return null;
        }
        synchronized (bUserAccounts.lock) {
            BAccount account2 = bUserAccounts.getAccount(account);
            if (account2 == null) {
                return null;
            }
            return account2.password;
        }
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public void registerAccountListener(String[] strArr, String str, int i) {
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public void removeAccountAsUser(IAccountManagerResponse iAccountManagerResponse, Account account, boolean z, int i) {
        Preconditions.checkArgument(account != null, "account cannot be null");
        Preconditions.checkArgument(iAccountManagerResponse != null, "response cannot be null");
        new RemoveAccountSession(getUserAccounts(i), iAccountManagerResponse, account, z).bind();
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public boolean removeAccountExplicitly(Account account, int i) {
        int callingUid = Binder.getCallingUid();
        if (Log.isLoggable(TAG, 2)) {
            Log.v(TAG, "removeAccountExplicitly: " + account + ", caller's uid " + callingUid + ", pid " + Binder.getCallingPid());
        }
        if (account == null) {
            Log.e(TAG, "account is null");
            return false;
        }
        return removeAccountInternal(getUserAccounts(i), account);
    }

    public void saveAuthTokenToDatabase(BUserAccounts bUserAccounts, Account account, String str, String str2) {
        if (bUserAccounts == null) {
            return;
        }
        synchronized (bUserAccounts.lock) {
            bUserAccounts.getAuthToken(account).put(str, str2);
            saveAllAccounts();
        }
    }

    public void saveCachedToken(BUserAccounts bUserAccounts, Account account, String str, String str2, String str3, long j) {
        if (account == null || str2 == null || str == null) {
            return;
        }
        TokenCache tokenCache = new TokenCache(bUserAccounts.userId, account, str, str2, str3, j);
        synchronized (this.mTokenCaches) {
            this.mTokenCaches.add(tokenCache);
        }
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public boolean setAccountVisibility(Account account, String str, int i, int i2) {
        Objects.requireNonNull(account, "account cannot be null");
        Objects.requireNonNull(str, "packageName cannot be null");
        BUserAccounts userAccounts = getUserAccounts(i2);
        if (userAccounts == null) {
            return false;
        }
        return setAccountVisibility(account, str, i, userAccounts);
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public void setAuthToken(Account account, String str, String str2, int i) {
        Objects.requireNonNull(account, "account cannot be null");
        Objects.requireNonNull(str, "authTokenType cannot be null");
        BUserAccounts userAccounts = getUserAccounts(i);
        if (userAccounts == null) {
            return;
        }
        synchronized (userAccounts.lock) {
            userAccounts.getAuthToken(account).put(str, str2);
            saveAllAccounts();
        }
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public void setPassword(Account account, String str, int i) {
        Objects.requireNonNull(account, "account cannot be null");
        BUserAccounts userAccounts = getUserAccounts(i);
        if (userAccounts == null) {
            return;
        }
        synchronized (userAccounts.lock) {
            BAccount account2 = userAccounts.getAccount(account);
            account2.password = str;
            account2.authTokens.clear();
            saveAllAccounts();
        }
        synchronized (this.mTokenCaches) {
            Iterator<TokenCache> it = this.mTokenCaches.iterator();
            while (it.hasNext()) {
                TokenCache next = it.next();
                if (next.account.equals(account) && next.userId == i) {
                    it.remove();
                }
            }
        }
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public void setUserData(Account account, String str, String str2, int i) {
        if (str == null) {
            throw new IllegalArgumentException("key is null");
        }
        if (account == null) {
            throw new IllegalArgumentException("account is null");
        }
        BUserAccounts userAccounts = getUserAccounts(i);
        if (userAccounts == null) {
            return;
        }
        synchronized (userAccounts.lock) {
            userAccounts.getAccountUserData(account).put(str, str2);
            saveAllAccounts();
        }
    }

    @Override // top.niunaijun.blackbox.core.system.ISystemService
    public void systemReady() {
        loadAccounts();
        loadAuthenticatorCache(null);
        this.mPms.addPackageMonitor(this);
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public void unregisterAccountListener(String[] strArr, String str, int i) {
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public void updateAppPermission(Account account, String str, int i, boolean z) {
    }

    @Override // top.niunaijun.blackbox.core.system.accounts.IBAccountManagerService
    public void updateCredentials(IAccountManagerResponse iAccountManagerResponse, final Account account, final String str, boolean z, final Bundle bundle, int i) {
        if (iAccountManagerResponse == null) {
            throw new IllegalArgumentException("response is null");
        }
        if (account == null) {
            throw new IllegalArgumentException("account is null");
        }
        Binder.clearCallingIdentity();
        new Session(getUserAccounts(i), iAccountManagerResponse, account.type, z, true, account.name, false, true) { // from class: top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.5
            @Override // top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.Session
            public void run() {
                this.mAuthenticator.updateCredentials(this, account, str, bundle);
            }

            @Override // top.niunaijun.blackbox.core.system.accounts.BAccountManagerService.Session
            public String toDebugString(long j) {
                Bundle bundle2 = bundle;
                if (bundle2 != null) {
                    bundle2.keySet();
                }
                return super.toDebugString(j) + ", updateCredentials, " + account.toString() + ", authTokenType " + str + ", loginOptions " + bundle;
            }
        }.bind();
    }

    private boolean setAccountVisibility(Account account, String str, int i, BUserAccounts bUserAccounts) {
        synchronized (bUserAccounts.lock) {
            BAccount account2 = bUserAccounts.getAccount(account);
            if (account2 == null) {
                return false;
            }
            account2.visibility.put(str, Integer.valueOf(i));
            return true;
        }
    }
}

package top.niunaijun.blackbox.core.system.accounts;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public class BUserAccounts implements Parcelable {
    public static final Parcelable.Creator<BUserAccounts> CREATOR = new Parcelable.Creator<BUserAccounts>() { // from class: top.niunaijun.blackbox.core.system.accounts.BUserAccounts.1
        @Override // android.os.Parcelable.Creator
        public BUserAccounts createFromParcel(Parcel parcel) {
            return new BUserAccounts(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public BUserAccounts[] newArray(int i) {
            return new BUserAccounts[i];
        }
    };
    public List<BAccount> accounts;
    public final Object lock;
    public int userId;

    public BUserAccounts() {
        this.lock = new Object();
        this.accounts = new ArrayList();
    }

    public BAccount addAccount(Account account) {
        BAccount bAccount = new BAccount();
        bAccount.account = account;
        this.accounts.add(bAccount);
        return bAccount;
    }

    public boolean delAccount(Account account) {
        return this.accounts.remove(getAccount(account));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long findAccountLastAuthenticatedTime(Account account) {
        BAccount account2 = getAccount(account);
        if (account2 != null) {
            return account2.updateLastAuthenticatedTime;
        }
        return -1L;
    }

    public BAccount getAccount(Account account) {
        for (BAccount bAccount : this.accounts) {
            if (bAccount.isMatch(account)) {
                return bAccount;
            }
        }
        return null;
    }

    public Map<String, String> getAccountUserData(Account account) {
        BAccount account2 = getAccount(account);
        return account2 == null ? new HashMap() : account2.accountUserData;
    }

    public Account[] getAccountsByType(String str) {
        ArrayList arrayList = new ArrayList();
        for (BAccount bAccount : this.accounts) {
            if (bAccount.account.type.equals(str)) {
                arrayList.add(bAccount.account);
            }
        }
        return (Account[]) arrayList.toArray(new Account[0]);
    }

    public Map<String, String> getAuthToken(Account account) {
        BAccount account2 = getAccount(account);
        return account2 == null ? new HashMap() : account2.authTokens;
    }

    public Map<String, Integer> getVisibility(Account account) {
        BAccount account2 = getAccount(account);
        return account2 == null ? new HashMap() : account2.visibility;
    }

    public void readFromParcel(Parcel parcel) {
        this.userId = parcel.readInt();
        this.accounts = parcel.createTypedArrayList(BAccount.CREATOR);
    }

    public Account[] toAccounts() {
        ArrayList arrayList = new ArrayList();
        for (BAccount bAccount : this.accounts) {
            arrayList.add(bAccount.account);
        }
        return (Account[]) arrayList.toArray(new Account[0]);
    }

    public void updateLastAuthenticatedTime(Account account) {
        BAccount account2 = getAccount(account);
        if (account2 != null) {
            account2.updateLastAuthenticatedTime = System.currentTimeMillis();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.userId);
        parcel.writeTypedList(this.accounts);
    }

    public BUserAccounts(Parcel parcel) {
        this.lock = new Object();
        this.accounts = new ArrayList();
        this.userId = parcel.readInt();
        this.accounts = parcel.createTypedArrayList(BAccount.CREATOR);
    }
}

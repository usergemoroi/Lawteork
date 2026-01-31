package top.niunaijun.blackbox.core.system.accounts;

import android.accounts.Account;
import java.util.Objects;
/* loaded from: classes3.dex */
public class TokenCache {
    public Account account;
    public String authToken;
    public String authTokenType;
    public long expiryEpochMillis;
    public String packageName;
    public int userId;

    public TokenCache(int i, Account account, String str, String str2) {
        this.userId = i;
        this.account = account;
        this.authToken = this.authToken;
        this.authTokenType = str;
        this.packageName = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TokenCache) {
            TokenCache tokenCache = (TokenCache) obj;
            return this.userId == tokenCache.userId && this.expiryEpochMillis == tokenCache.expiryEpochMillis && Objects.equals(this.account, tokenCache.account) && Objects.equals(this.authToken, tokenCache.authToken) && Objects.equals(this.authTokenType, tokenCache.authTokenType) && Objects.equals(this.packageName, tokenCache.packageName);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.userId), this.account, Long.valueOf(this.expiryEpochMillis), this.authToken, this.authTokenType, this.packageName);
    }

    public TokenCache(int i, Account account, String str, String str2, String str3, long j) {
        this.userId = i;
        this.account = account;
        this.expiryEpochMillis = j;
        this.authToken = str3;
        this.authTokenType = str2;
        this.packageName = str;
    }
}

package top.niunaijun.blackbox.core.system.p025am;

import java.util.Objects;
/* renamed from: top.niunaijun.blackbox.core.system.am.PendingIntentRecord */
/* loaded from: classes3.dex */
public class PendingIntentRecord {
    public String packageName;
    public int uid;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PendingIntentRecord) {
            PendingIntentRecord pendingIntentRecord = (PendingIntentRecord) obj;
            return this.uid == pendingIntentRecord.uid && Objects.equals(this.packageName, pendingIntentRecord.packageName);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.uid), this.packageName);
    }
}

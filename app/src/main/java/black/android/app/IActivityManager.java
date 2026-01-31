package black.android.app;

import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
import top.niunaijun.blackreflection.annotation.BMethod;
import top.niunaijun.blackreflection.annotation.BParamClassName;
@BClassName("android.app.IActivityManager")
/* loaded from: classes.dex */
public interface IActivityManager {

    @BClassName("android.app.IActivityManager$ContentProviderHolder")
    /* loaded from: classes.dex */
    public interface ContentProviderHolder {
        @BField
        ProviderInfo info();

        @BField
        boolean noReleaseNeeded();

        @BField
        IInterface provider();
    }

    @BClassName("android.app.IActivityManager$ContentProviderHolder")
    /* loaded from: classes.dex */
    public interface ContentProviderHolderMIUI {
        @BField
        ProviderInfo info();

        @BField
        boolean noReleaseNeeded();

        @BField
        IInterface provider();

        @BField
        boolean waitProcessStart();
    }

    @BMethod
    Integer getTaskForActivity(IBinder iBinder, boolean z);

    @BMethod
    void overridePendingTransition(IBinder iBinder, String str, int i, int i2);

    @BMethod
    void setRequestedOrientation(IBinder iBinder, int i);

    @BMethod
    Integer startActivities();

    @BMethod
    Integer startActivity(@BParamClassName("android.app.IApplicationThread") Object obj, String str, Intent intent, String str2, IBinder iBinder, String str3, int i, int i2, @BParamClassName("android.app.ProfilerInfo") Object obj2, Bundle bundle);
}

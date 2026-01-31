package top.niunaijun.blackbox.core.system.accounts;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import top.niunaijun.blackbox.core.system.p027pm.PackageManagerCompat;
/* loaded from: classes3.dex */
public class RegisteredServicesParser {
    public XmlResourceParser getParser(Context context, ServiceInfo serviceInfo, String str) {
        int i;
        Bundle bundle = serviceInfo.metaData;
        if (bundle != null && (i = bundle.getInt(str)) != 0) {
            try {
                Resources resources = getResources(context, serviceInfo.applicationInfo);
                if (resources == null) {
                    return null;
                }
                return resources.getXml(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public Resources getResources(Context context, ApplicationInfo applicationInfo) {
        return PackageManagerCompat.getResources(context, applicationInfo);
    }
}

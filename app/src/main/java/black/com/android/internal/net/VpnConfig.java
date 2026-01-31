package black.com.android.internal.net;

import java.util.List;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BField;
@BClassName("com.android.internal.net.VpnConfig")
/* loaded from: classes.dex */
public interface VpnConfig {
    @BField
    List<String> allowedApplications();

    @BField
    List<String> disallowedApplications();

    @BField
    String user();
}

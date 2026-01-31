package black.android.widget;

import android.content.pm.ApplicationInfo;
import java.lang.reflect.Field;
import java.util.ArrayList;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.widget.RemoteViews")
/* loaded from: classes.dex */
public interface RemoteViewsContext {
    @BFieldCheckNotProcess
    Field _check_mActions();

    @BFieldCheckNotProcess
    Field _check_mApplication();

    @BFieldCheckNotProcess
    Field _check_mPackage();

    @BFieldSetNotProcess
    void _set_mActions(Object obj);

    @BFieldSetNotProcess
    void _set_mApplication(Object obj);

    @BFieldSetNotProcess
    void _set_mPackage(Object obj);

    @BFieldNotProcess
    ArrayList<Object> mActions();

    @BFieldNotProcess
    ApplicationInfo mApplication();

    @BFieldNotProcess
    String mPackage();
}

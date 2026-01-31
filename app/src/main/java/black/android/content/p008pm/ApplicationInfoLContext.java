package black.android.content.p008pm;

import java.lang.reflect.Field;
import top.niunaijun.blackreflection.annotation.BClassNameNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldCheckNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldNotProcess;
import top.niunaijun.blackreflection.annotation.BFieldSetNotProcess;
@BClassNameNotProcess("android.content.pm.ApplicationInfo")
/* renamed from: black.android.content.pm.ApplicationInfoLContext */
/* loaded from: classes.dex */
public interface ApplicationInfoLContext {
    @BFieldCheckNotProcess
    Field _check_primaryCpuAbi();

    @BFieldCheckNotProcess
    Field _check_privateFlags();

    @BFieldCheckNotProcess
    Field _check_scanPublicSourceDir();

    @BFieldCheckNotProcess
    Field _check_scanSourceDir();

    @BFieldCheckNotProcess
    Field _check_secondaryCpuAbi();

    @BFieldCheckNotProcess
    Field _check_secondaryNativeLibraryDir();

    @BFieldCheckNotProcess
    Field _check_splitPublicSourceDirs();

    @BFieldCheckNotProcess
    Field _check_splitSourceDirs();

    @BFieldSetNotProcess
    void _set_primaryCpuAbi(Object obj);

    @BFieldSetNotProcess
    void _set_privateFlags(Object obj);

    @BFieldSetNotProcess
    void _set_scanPublicSourceDir(Object obj);

    @BFieldSetNotProcess
    void _set_scanSourceDir(Object obj);

    @BFieldSetNotProcess
    void _set_secondaryCpuAbi(Object obj);

    @BFieldSetNotProcess
    void _set_secondaryNativeLibraryDir(Object obj);

    @BFieldSetNotProcess
    void _set_splitPublicSourceDirs(Object obj);

    @BFieldSetNotProcess
    void _set_splitSourceDirs(Object obj);

    @BFieldNotProcess
    String primaryCpuAbi();

    @BFieldNotProcess
    Integer privateFlags();

    @BFieldNotProcess
    String scanPublicSourceDir();

    @BFieldNotProcess
    String scanSourceDir();

    @BFieldNotProcess
    String secondaryCpuAbi();

    @BFieldNotProcess
    String secondaryNativeLibraryDir();

    @BFieldNotProcess
    String[] splitPublicSourceDirs();

    @BFieldNotProcess
    String[] splitSourceDirs();
}

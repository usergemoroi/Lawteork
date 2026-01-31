package top.niunaijun.blackbox.core.system.p026os;

import android.net.Uri;
import android.os.Process;
import android.os.storage.StorageVolume;
import black.android.p009os.storage.StorageManagerStatic;
import black.android.p009os.storage.StorageVolumeContext;
import java.io.File;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.core.env.BEnvironment;
import top.niunaijun.blackbox.core.system.ISystemService;
import top.niunaijun.blackbox.core.system.p026os.IBStorageManagerService;
import top.niunaijun.blackbox.core.system.user.BUserHandle;
import top.niunaijun.blackbox.fake.provider.FileProvider;
import top.niunaijun.blackbox.proxy.ProxyManifest;
import top.niunaijun.blackbox.utils.compat.BuildCompat;
import top.niunaijun.blackreflection.BlackReflection;
/* renamed from: top.niunaijun.blackbox.core.system.os.BStorageManagerService */
/* loaded from: classes3.dex */
public class BStorageManagerService extends IBStorageManagerService.Stub implements ISystemService {
    private static final BStorageManagerService sService = new BStorageManagerService();

    public static BStorageManagerService get() {
        return sService;
    }

    @Override // top.niunaijun.blackbox.core.system.p026os.IBStorageManagerService
    public Uri getUriForFile(String str) {
        return FileProvider.getUriForFile(BlackBoxCore.getContext(), ProxyManifest.getProxyFileProvider(), new File(str));
    }

    @Override // top.niunaijun.blackbox.core.system.p026os.IBStorageManagerService
    public StorageVolume[] getVolumeList(int i, String str, int i2, int i3) {
        if (((StorageManagerStatic) BlackReflection.create(StorageManagerStatic.class, null, false)).getVolumeList(0, 0) == null) {
            return null;
        }
        try {
            StorageVolume[] volumeList = ((StorageManagerStatic) BlackReflection.create(StorageManagerStatic.class, null, false)).getVolumeList(BUserHandle.getUserId(Process.myUid()), 0);
            if (volumeList == null) {
                return null;
            }
            for (StorageVolume storageVolume : volumeList) {
                ((StorageVolumeContext) BlackReflection.create(StorageVolumeContext.class, storageVolume, false))._set_mPath(BEnvironment.getExternalUserDir(i3));
                if (BuildCompat.isPie()) {
                    ((StorageVolumeContext) BlackReflection.create(StorageVolumeContext.class, storageVolume, false))._set_mInternalPath(BEnvironment.getExternalUserDir(i3));
                }
            }
            return volumeList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // top.niunaijun.blackbox.core.system.ISystemService
    public void systemReady() {
    }
}

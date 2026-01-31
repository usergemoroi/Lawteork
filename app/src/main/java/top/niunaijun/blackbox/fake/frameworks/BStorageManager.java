package top.niunaijun.blackbox.fake.frameworks;

import android.net.Uri;
import android.os.RemoteException;
import android.os.storage.StorageVolume;
import top.niunaijun.blackbox.core.system.ServiceManager;
import top.niunaijun.blackbox.core.system.p026os.IBStorageManagerService;
/* loaded from: classes3.dex */
public class BStorageManager extends BlackManager<IBStorageManagerService> {
    private static final BStorageManager sStorageManager = new BStorageManager();

    public static BStorageManager get() {
        return sStorageManager;
    }

    @Override // top.niunaijun.blackbox.fake.frameworks.BlackManager
    public String getServiceName() {
        return ServiceManager.STORAGE_MANAGER;
    }

    public Uri getUriForFile(String str) {
        try {
            return getService().getUriForFile(str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public StorageVolume[] getVolumeList(int i, String str, int i2, int i3) {
        try {
            return getService().getVolumeList(i, str, i2, i3);
        } catch (RemoteException e) {
            e.printStackTrace();
            return new StorageVolume[0];
        }
    }
}

package top.niunaijun.blackbox.fake.frameworks;

import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import top.niunaijun.blackbox.core.system.ServiceManager;
import top.niunaijun.blackbox.core.system.user.BUserInfo;
import top.niunaijun.blackbox.core.system.user.IBUserManagerService;
/* loaded from: classes3.dex */
public class BUserManager extends BlackManager<IBUserManagerService> {
    private static final BUserManager sUserManager = new BUserManager();

    public static BUserManager get() {
        return sUserManager;
    }

    public BUserInfo createUser(int i) {
        try {
            return getService().createUser(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void deleteUser(int i) {
        try {
            getService().deleteUser(i);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // top.niunaijun.blackbox.fake.frameworks.BlackManager
    public String getServiceName() {
        return ServiceManager.USER_MANAGER;
    }

    public List<BUserInfo> getUsers() {
        try {
            return getService().getUsers();
        } catch (RemoteException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}

package top.niunaijun.blackbox.fake.frameworks;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.core.system.ServiceManager;
import top.niunaijun.blackbox.core.system.location.IBLocationManagerService;
import top.niunaijun.blackbox.entity.location.BCell;
import top.niunaijun.blackbox.entity.location.BLocation;
/* loaded from: classes3.dex */
public class BLocationManager extends BlackManager<IBLocationManagerService> {
    public static final int CLOSE_MODE = 0;
    public static final int GLOBAL_MODE = 1;
    public static final int OWN_MODE = 2;
    private static final BLocationManager sLocationManager = new BLocationManager();

    public static void disableFakeLocation(int i, String str) {
        get().setPattern(i, str, 0);
    }

    public static BLocationManager get() {
        return sLocationManager;
    }

    public static boolean isFakeLocationEnable() {
        return get().getPattern(BActivityThread.getUserId(), BActivityThread.getAppPackageName()) != 0;
    }

    public List<BCell> getAllCell(int i, String str) {
        try {
            return getService().getAllCell(i, str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return new ArrayList();
        }
    }

    public BCell getCell(int i, String str) {
        try {
            return getService().getCell(i, str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public BLocation getGlobalLocation() {
        try {
            return getService().getGlobalLocation();
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<BCell> getGlobalNeighboringCell() {
        try {
            return getService().getGlobalNeighboringCell();
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public BLocation getLocation(int i, String str) {
        try {
            return getService().getLocation(i, str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<BCell> getNeighboringCell(int i, String str) {
        try {
            return getService().getNeighboringCell(i, str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int getPattern(int i, String str) {
        try {
            return getService().getPattern(i, str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // top.niunaijun.blackbox.fake.frameworks.BlackManager
    public String getServiceName() {
        return ServiceManager.LOCATION_MANAGER;
    }

    public void removeUpdates(IBinder iBinder) {
        try {
            getService().removeUpdates(iBinder);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void requestLocationUpdates(IBinder iBinder) {
        try {
            getService().requestLocationUpdates(iBinder, BActivityThread.getAppPackageName(), BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setAllCell(int i, String str, List<BCell> list) {
        try {
            getService().setAllCell(i, str, list);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setCell(int i, String str, BCell bCell) {
        try {
            getService().setCell(i, str, bCell);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setGlobalAllCell(List<BCell> list) {
        try {
            getService().setGlobalAllCell(list);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setGlobalCell(BCell bCell) {
        try {
            getService().setGlobalCell(bCell);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setGlobalLocation(BLocation bLocation) {
        try {
            getService().setGlobalLocation(bLocation);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setGlobalNeighboringCell(List<BCell> list) {
        try {
            getService().setGlobalNeighboringCell(list);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setLocation(int i, String str, BLocation bLocation) {
        try {
            getService().setLocation(i, str, bLocation);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setNeighboringCell(int i, String str, List<BCell> list) {
        try {
            getService().setNeighboringCell(i, str, list);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setPattern(int i, String str, int i2) {
        try {
            getService().setPattern(i, str, i2);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}

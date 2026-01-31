package top.niunaijun.blackbox.core.system.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.AtomicFile;
import android.util.SparseArray;
import black.android.location.ILocationListenerContext;
import black.android.location.ILocationListenerStubStatic;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.core.env.BEnvironment;
import top.niunaijun.blackbox.core.system.ISystemService;
import top.niunaijun.blackbox.core.system.location.IBLocationManagerService;
import top.niunaijun.blackbox.entity.location.BCell;
import top.niunaijun.blackbox.entity.location.BLocation;
import top.niunaijun.blackbox.entity.location.BLocationConfig;
import top.niunaijun.blackbox.utils.CloseUtils;
import top.niunaijun.blackbox.utils.FileUtils;
import top.niunaijun.blackbox.utils.Slog;
import top.niunaijun.blackreflection.BlackReflection;
/* loaded from: classes3.dex */
public class BLocationManagerService extends IBLocationManagerService.Stub implements ISystemService {
    public static final String TAG = "BLocationManagerService";
    private static final BLocationManagerService sService = new BLocationManagerService();
    private final SparseArray<HashMap<String, BLocationConfig>> mLocationConfigs = new SparseArray<>();
    private final BLocationConfig mGlobalConfig = new BLocationConfig();
    private final Map<IBinder, LocationRecord> mLocationListeners = new HashMap();
    private final Executor mThreadPool = Executors.newCachedThreadPool();

    private void addTask(final IBinder iBinder) {
        this.mThreadPool.execute(new Runnable() { // from class: top.niunaijun.blackbox.core.system.location.BLocationManagerService$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                BLocationManagerService.this.m31xaca30fac(iBinder);
            }
        });
    }

    public static BLocationManagerService get() {
        return sService;
    }

    private BLocationConfig getOrCreateConfig(int i, String str) {
        BLocationConfig bLocationConfig;
        synchronized (this.mLocationConfigs) {
            HashMap<String, BLocationConfig> hashMap = this.mLocationConfigs.get(i);
            if (hashMap == null) {
                hashMap = new HashMap<>();
                this.mLocationConfigs.put(i, hashMap);
            }
            bLocationConfig = hashMap.get(str);
            if (bLocationConfig == null) {
                bLocationConfig = new BLocationConfig();
                bLocationConfig.pattern = 0;
                hashMap.put(str, bLocationConfig);
            }
        }
        return bLocationConfig;
    }

    @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
    public List<BCell> getAllCell(int i, String str) {
        BLocationConfig orCreateConfig = getOrCreateConfig(i, str);
        int i2 = orCreateConfig.pattern;
        if (i2 != 1) {
            if (i2 != 2) {
                return null;
            }
            return orCreateConfig.allCell;
        }
        return this.mGlobalConfig.allCell;
    }

    @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
    public BCell getCell(int i, String str) {
        BLocationConfig orCreateConfig = getOrCreateConfig(i, str);
        int i2 = orCreateConfig.pattern;
        if (i2 != 1) {
            if (i2 != 2) {
                return null;
            }
            return orCreateConfig.cell;
        }
        return this.mGlobalConfig.cell;
    }

    @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
    public BLocation getGlobalLocation() {
        BLocation bLocation;
        synchronized (this.mGlobalConfig) {
            bLocation = this.mGlobalConfig.location;
        }
        return bLocation;
    }

    @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
    public List<BCell> getGlobalNeighboringCell() {
        List<BCell> list;
        synchronized (this.mGlobalConfig) {
            list = this.mGlobalConfig.neighboringCellInfo;
        }
        return list;
    }

    @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
    public BLocation getLocation(int i, String str) {
        BLocationConfig orCreateConfig = getOrCreateConfig(i, str);
        int i2 = orCreateConfig.pattern;
        if (i2 != 1) {
            if (i2 != 2) {
                return null;
            }
            return orCreateConfig.location;
        }
        return this.mGlobalConfig.location;
    }

    @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
    public List<BCell> getNeighboringCell(int i, String str) {
        List<BCell> list;
        synchronized (this.mLocationConfigs) {
            list = getOrCreateConfig(i, str).allCell;
        }
        return list;
    }

    @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
    public int getPattern(int i, String str) {
        int i2;
        synchronized (this.mLocationConfigs) {
            i2 = getOrCreateConfig(i, str).pattern;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$addTask$1$top-niunaijun-blackbox-core-system-location-BLocationManagerService */
    public void m31xaca30fac(IBinder iBinder) {
        final BLocation location;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = null;
        while (iBinder.pingBinder()) {
            final IInterface asInterface = ((ILocationListenerStubStatic) BlackReflection.create(ILocationListenerStubStatic.class, null, false)).asInterface(iBinder);
            LocationRecord locationRecord = this.mLocationListeners.get(iBinder);
            if (locationRecord != null && (location = getLocation(locationRecord.userId, locationRecord.packageName)) != null) {
                if (!location.equals(obj) || System.currentTimeMillis() - currentTimeMillis >= 3000) {
                    currentTimeMillis = System.currentTimeMillis();
                    BlackBoxCore.get().getHandler().post(new Runnable() { // from class: top.niunaijun.blackbox.core.system.location.BLocationManagerService$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((ILocationListenerContext) BlackReflection.create(ILocationListenerContext.class, asInterface, false)).onLocationChanged(location.convert2SystemLocation());
                        }
                    });
                    obj = location;
                } else {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }

    public void loadConfig() {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e;
        Parcel obtain = Parcel.obtain();
        try {
            try {
                if (!BEnvironment.getFakeLocationConf().exists()) {
                    obtain.recycle();
                    CloseUtils.close(null);
                    return;
                }
                fileInputStream = new FileInputStream(BEnvironment.getFakeLocationConf());
                try {
                    byte[] byteArray = FileUtils.toByteArray(fileInputStream);
                    obtain.unmarshall(byteArray, 0, byteArray.length);
                    obtain.setDataPosition(0);
                    synchronized (this.mGlobalConfig) {
                        this.mGlobalConfig.refresh(obtain);
                    }
                    synchronized (this.mLocationConfigs) {
                        this.mLocationConfigs.clear();
                        int readInt = obtain.readInt();
                        for (int i = 0; i < readInt; i++) {
                            int readInt2 = obtain.readInt();
                            HashMap<String, BLocationConfig> readHashMap = obtain.readHashMap(BLocationConfig.class.getClassLoader());
                            this.mLocationConfigs.put(readInt2, readHashMap);
                            Slog.m20d(TAG, "load userId: " + readInt2 + ", config: " + readHashMap);
                        }
                    }
                    obtain.recycle();
                    CloseUtils.close(fileInputStream);
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    Slog.m20d(TAG, "bad config");
                    FileUtils.deleteDir(BEnvironment.getFakeLocationConf());
                    obtain.recycle();
                    CloseUtils.close(fileInputStream);
                }
            } catch (Throwable th2) {
                th = th2;
                obtain.recycle();
                CloseUtils.close(null);
                throw th;
            }
        } catch (Exception e3) {
            fileInputStream = null;
            e = e3;
        } catch (Throwable th3) {
            th = th3;
            obtain.recycle();
            CloseUtils.close(null);
            throw th;
        }
    }

    @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
    public void removeUpdates(IBinder iBinder) {
        if (iBinder == null || !iBinder.pingBinder()) {
            return;
        }
        this.mLocationListeners.remove(iBinder);
    }

    @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
    public void requestLocationUpdates(final IBinder iBinder, String str, int i) {
        if (iBinder == null || !iBinder.pingBinder() || this.mLocationListeners.containsKey(iBinder)) {
            return;
        }
        iBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: top.niunaijun.blackbox.core.system.location.BLocationManagerService.1
            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                iBinder.unlinkToDeath(this, 0);
                BLocationManagerService.this.mLocationListeners.remove(iBinder);
            }
        }, 0);
        this.mLocationListeners.put(iBinder, new LocationRecord(str, i));
        addTask(iBinder);
    }

    public void save() {
        synchronized (this.mGlobalConfig) {
            synchronized (this.mLocationConfigs) {
                Parcel obtain = Parcel.obtain();
                AtomicFile atomicFile = new AtomicFile(BEnvironment.getFakeLocationConf());
                this.mGlobalConfig.writeToParcel(obtain, 0);
                obtain.writeInt(this.mLocationConfigs.size());
                for (int i = 0; i < this.mLocationConfigs.size(); i++) {
                    obtain.writeInt(this.mLocationConfigs.keyAt(i));
                    obtain.writeMap(this.mLocationConfigs.valueAt(i));
                }
                obtain.setDataPosition(0);
                FileOutputStream startWrite = atomicFile.startWrite();
                FileUtils.writeParcelToOutput(obtain, startWrite);
                atomicFile.finishWrite(startWrite);
                obtain.recycle();
                CloseUtils.close(startWrite);
            }
        }
    }

    @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
    public void setAllCell(int i, String str, List<BCell> list) {
        synchronized (this.mLocationConfigs) {
            getOrCreateConfig(i, str).allCell = list;
            save();
        }
    }

    @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
    public void setCell(int i, String str, BCell bCell) {
        synchronized (this.mLocationConfigs) {
            getOrCreateConfig(i, str).cell = bCell;
            save();
        }
    }

    @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
    public void setGlobalAllCell(List<BCell> list) {
        synchronized (this.mGlobalConfig) {
            this.mGlobalConfig.allCell = list;
            save();
        }
    }

    @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
    public void setGlobalCell(BCell bCell) {
        synchronized (this.mGlobalConfig) {
            this.mGlobalConfig.cell = bCell;
            save();
        }
    }

    @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
    public void setGlobalLocation(BLocation bLocation) {
        synchronized (this.mGlobalConfig) {
            this.mGlobalConfig.location = bLocation;
            save();
        }
    }

    @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
    public void setGlobalNeighboringCell(List<BCell> list) {
        synchronized (this.mGlobalConfig) {
            this.mGlobalConfig.neighboringCellInfo = list;
            save();
        }
    }

    @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
    public void setLocation(int i, String str, BLocation bLocation) {
        synchronized (this.mLocationConfigs) {
            getOrCreateConfig(i, str).location = bLocation;
            save();
        }
    }

    @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
    public void setNeighboringCell(int i, String str, List<BCell> list) {
        synchronized (this.mLocationConfigs) {
            getOrCreateConfig(i, str).allCell = list;
            save();
        }
    }

    @Override // top.niunaijun.blackbox.core.system.location.IBLocationManagerService
    public void setPattern(int i, String str, int i2) {
        synchronized (this.mLocationConfigs) {
            getOrCreateConfig(i, str).pattern = i2;
            save();
        }
    }

    @Override // top.niunaijun.blackbox.core.system.ISystemService
    public void systemReady() {
        loadConfig();
        for (IBinder iBinder : this.mLocationListeners.keySet()) {
            addTask(iBinder);
        }
    }
}

package top.niunaijun.blackbox.core.system.user;

import android.os.Parcel;
import androidx.core.util.AtomicFile;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import top.niunaijun.blackbox.core.env.BEnvironment;
import top.niunaijun.blackbox.core.system.ISystemService;
import top.niunaijun.blackbox.core.system.p027pm.BPackageManagerService;
import top.niunaijun.blackbox.core.system.user.IBUserManagerService;
import top.niunaijun.blackbox.utils.CloseUtils;
import top.niunaijun.blackbox.utils.FileUtils;
/* loaded from: classes3.dex */
public class BUserManagerService extends IBUserManagerService.Stub implements ISystemService {
    private static BUserManagerService sService = new BUserManagerService();
    public final HashMap<Integer, BUserInfo> mUsers = new HashMap<>();
    public final Object mUserLock = new Object();

    private BUserInfo createUserLocked(int i) {
        BUserInfo bUserInfo = new BUserInfo();
        bUserInfo.f247id = i;
        bUserInfo.status = BUserStatus.ENABLE;
        this.mUsers.put(Integer.valueOf(i), bUserInfo);
        synchronized (this.mUsers) {
            saveUserInfoLocked();
        }
        return bUserInfo;
    }

    public static BUserManagerService get() {
        return sService;
    }

    private void saveUserInfoLocked() {
        Parcel obtain = Parcel.obtain();
        AtomicFile atomicFile = new AtomicFile(BEnvironment.getUserInfoConf());
        try {
            obtain.writeTypedList(new ArrayList(this.mUsers.values()));
            FileOutputStream fileOutputStream = null;
            try {
                fileOutputStream = atomicFile.startWrite();
                FileUtils.writeParcelToOutput(obtain, fileOutputStream);
                atomicFile.finishWrite(fileOutputStream);
                CloseUtils.close(fileOutputStream);
            } catch (IOException e) {
                e.printStackTrace();
                atomicFile.failWrite(fileOutputStream);
                CloseUtils.close(fileOutputStream);
            }
        } finally {
            obtain.recycle();
        }
    }

    private void scanUserL() {
        FileInputStream fileInputStream;
        Throwable th;
        Exception e;
        ArrayList createTypedArrayList;
        synchronized (this.mUserLock) {
            Parcel obtain = Parcel.obtain();
            try {
            } catch (Exception e2) {
                fileInputStream = null;
                e = e2;
            } catch (Throwable th2) {
                fileInputStream = null;
                th = th2;
                obtain.recycle();
                CloseUtils.close(fileInputStream);
                throw th;
            }
            if (!BEnvironment.getUserInfoConf().exists()) {
                obtain.recycle();
                CloseUtils.close(null);
                return;
            }
            fileInputStream = new FileInputStream(BEnvironment.getUserInfoConf());
            try {
                try {
                    byte[] byteArray = FileUtils.toByteArray(fileInputStream);
                    obtain.unmarshall(byteArray, 0, byteArray.length);
                    obtain.setDataPosition(0);
                    createTypedArrayList = obtain.createTypedArrayList(BUserInfo.CREATOR);
                } catch (Exception e3) {
                    e = e3;
                    e.printStackTrace();
                    obtain.recycle();
                    CloseUtils.close(fileInputStream);
                }
                if (createTypedArrayList == null) {
                    obtain.recycle();
                    CloseUtils.close(fileInputStream);
                    return;
                }
                synchronized (this.mUsers) {
                    this.mUsers.clear();
                    Iterator it = createTypedArrayList.iterator();
                    while (it.hasNext()) {
                        BUserInfo bUserInfo = (BUserInfo) it.next();
                        this.mUsers.put(Integer.valueOf(bUserInfo.f247id), bUserInfo);
                    }
                }
                obtain.recycle();
                CloseUtils.close(fileInputStream);
            } catch (Throwable th3) {
                th = th3;
                obtain.recycle();
                CloseUtils.close(fileInputStream);
                throw th;
            }
        }
    }

    @Override // top.niunaijun.blackbox.core.system.user.IBUserManagerService
    public BUserInfo createUser(int i) {
        synchronized (this.mUserLock) {
            if (exists(i)) {
                return getUserInfo(i);
            }
            return createUserLocked(i);
        }
    }

    @Override // top.niunaijun.blackbox.core.system.user.IBUserManagerService
    public void deleteUser(int i) {
        synchronized (this.mUserLock) {
            synchronized (this.mUsers) {
                BPackageManagerService.get().deleteUser(i);
                this.mUsers.remove(Integer.valueOf(i));
                saveUserInfoLocked();
                FileUtils.deleteDir(BEnvironment.getUserDir(i));
                FileUtils.deleteDir(BEnvironment.getExternalUserDir(i));
            }
        }
    }

    @Override // top.niunaijun.blackbox.core.system.user.IBUserManagerService
    public boolean exists(int i) {
        boolean z;
        synchronized (this.mUsers) {
            z = this.mUsers.get(Integer.valueOf(i)) != null;
        }
        return z;
    }

    public List<BUserInfo> getAllUsers() {
        ArrayList arrayList;
        synchronized (this.mUsers) {
            arrayList = new ArrayList(this.mUsers.values());
        }
        return arrayList;
    }

    @Override // top.niunaijun.blackbox.core.system.user.IBUserManagerService
    public BUserInfo getUserInfo(int i) {
        BUserInfo bUserInfo;
        synchronized (this.mUserLock) {
            bUserInfo = this.mUsers.get(Integer.valueOf(i));
        }
        return bUserInfo;
    }

    @Override // top.niunaijun.blackbox.core.system.user.IBUserManagerService
    public List<BUserInfo> getUsers() {
        ArrayList arrayList;
        synchronized (this.mUsers) {
            arrayList = new ArrayList();
            for (BUserInfo bUserInfo : this.mUsers.values()) {
                if (bUserInfo.f247id >= 0) {
                    arrayList.add(bUserInfo);
                }
            }
        }
        return arrayList;
    }

    @Override // top.niunaijun.blackbox.core.system.ISystemService
    public void systemReady() {
        scanUserL();
    }
}

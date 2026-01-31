package top.niunaijun.blackbox.core.system.p027pm;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.AtomicFile;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import top.niunaijun.blackbox.core.env.BEnvironment;
import top.niunaijun.blackbox.entity.p029pm.InstallOption;
import top.niunaijun.blackbox.utils.CloseUtils;
import top.niunaijun.blackbox.utils.FileUtils;
/* renamed from: top.niunaijun.blackbox.core.system.pm.BPackageSettings */
/* loaded from: classes3.dex */
public class BPackageSettings implements Parcelable {
    public int appId;
    public InstallOption installOption;
    public BPackage pkg;
    public Map<Integer, BPackageUserState> userState;
    static final BPackageUserState DEFAULT_USER_STATE = new BPackageUserState();
    public static final Parcelable.Creator<BPackageSettings> CREATOR = new Parcelable.Creator<BPackageSettings>() { // from class: top.niunaijun.blackbox.core.system.pm.BPackageSettings.1
        @Override // android.os.Parcelable.Creator
        public BPackageSettings createFromParcel(Parcel parcel) {
            return new BPackageSettings(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public BPackageSettings[] newArray(int i) {
            return new BPackageSettings[i];
        }
    };

    public BPackageSettings() {
        this.userState = new HashMap();
    }

    private BPackageUserState modifyUserState(int i) {
        BPackageUserState bPackageUserState = this.userState.get(Integer.valueOf(i));
        if (bPackageUserState == null) {
            BPackageUserState bPackageUserState2 = new BPackageUserState();
            this.userState.put(Integer.valueOf(i), bPackageUserState2);
            return bPackageUserState2;
        }
        return bPackageUserState;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean getHidden(int i) {
        return readUserState(i).hidden;
    }

    public boolean getInstalled(int i) {
        return readUserState(i).installed;
    }

    public boolean getStopped(int i) {
        return readUserState(i).stopped;
    }

    public List<Integer> getUserIds() {
        return new ArrayList(this.userState.keySet());
    }

    public List<BPackageUserState> getUserState() {
        return new ArrayList(this.userState.values());
    }

    public BPackageUserState readUserState(int i) {
        BPackageUserState bPackageUserState = this.userState.get(Integer.valueOf(i));
        if (bPackageUserState == null) {
            bPackageUserState = new BPackageUserState();
        }
        BPackageUserState bPackageUserState2 = new BPackageUserState(bPackageUserState);
        if (this.installOption.isFlag(4) && BXposedManagerService.get().isModuleEnable(this.pkg.packageName) && BXposedManagerService.get().isXPEnable()) {
            bPackageUserState2.installed = true;
        }
        if (i == -1) {
            bPackageUserState2.installed = true;
        }
        return bPackageUserState2;
    }

    public void removeUser(int i) {
        this.userState.remove(Integer.valueOf(i));
    }

    public boolean save() {
        synchronized (this) {
            Parcel obtain = Parcel.obtain();
            AtomicFile atomicFile = new AtomicFile(BEnvironment.getPackageConf(this.pkg.packageName));
            writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            FileOutputStream startWrite = atomicFile.startWrite();
            FileUtils.writeParcelToOutput(obtain, startWrite);
            atomicFile.finishWrite(startWrite);
            obtain.recycle();
            CloseUtils.close(startWrite);
        }
        return true;
    }

    public void setHidden(boolean z, int i) {
        modifyUserState(i).hidden = z;
    }

    public void setInstalled(boolean z, int i) {
        modifyUserState(i).installed = z;
    }

    public void setStopped(boolean z, int i) {
        modifyUserState(i).stopped = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.pkg, i);
        parcel.writeInt(this.appId);
        parcel.writeParcelable(this.installOption, i);
        parcel.writeInt(this.userState.size());
        for (Map.Entry<Integer, BPackageUserState> entry : this.userState.entrySet()) {
            parcel.writeValue(entry.getKey());
            parcel.writeParcelable(entry.getValue(), i);
        }
    }

    public BPackageSettings(Parcel parcel) {
        this.userState = new HashMap();
        this.pkg = (BPackage) parcel.readParcelable(BPackage.class.getClassLoader());
        this.appId = parcel.readInt();
        this.installOption = (InstallOption) parcel.readParcelable(InstallOption.class.getClassLoader());
        int readInt = parcel.readInt();
        this.userState = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.userState.put((Integer) parcel.readValue(Integer.class.getClassLoader()), (BPackageUserState) parcel.readParcelable(BPackageUserState.class.getClassLoader()));
        }
    }
}

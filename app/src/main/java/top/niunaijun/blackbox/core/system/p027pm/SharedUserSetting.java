package top.niunaijun.blackbox.core.system.p027pm;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.AtomicFile;
import com.itsaky.androidide.utils.ILogger;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import net.lingala.zip4j.util.InternalZipConstants;
import top.niunaijun.blackbox.core.env.BEnvironment;
import top.niunaijun.blackbox.utils.FileUtils;
/* renamed from: top.niunaijun.blackbox.core.system.pm.SharedUserSetting */
/* loaded from: classes3.dex */
public final class SharedUserSetting implements Parcelable {
    String name;
    int seInfoTargetSdkVersion;
    int userId;
    public static final Map<String, SharedUserSetting> sSharedUsers = new HashMap();
    public static final Parcelable.Creator<SharedUserSetting> CREATOR = new Parcelable.Creator<SharedUserSetting>() { // from class: top.niunaijun.blackbox.core.system.pm.SharedUserSetting.1
        @Override // android.os.Parcelable.Creator
        public SharedUserSetting createFromParcel(Parcel parcel) {
            return new SharedUserSetting(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public SharedUserSetting[] newArray(int i) {
            return new SharedUserSetting[i];
        }
    };

    public SharedUserSetting(Parcel parcel) {
        this.name = parcel.readString();
        this.userId = parcel.readInt();
    }

    public static void loadSharedUsers() {
        Parcel obtain = Parcel.obtain();
        try {
            byte[] byteArray = FileUtils.toByteArray(BEnvironment.getSharedUserConf());
            obtain.unmarshall(byteArray, 0, byteArray.length);
            obtain.setDataPosition(0);
            HashMap readHashMap = obtain.readHashMap(SharedUserSetting.class.getClassLoader());
            Map<String, SharedUserSetting> map = sSharedUsers;
            synchronized (map) {
                map.clear();
                map.putAll(readHashMap);
            }
        } catch (Exception e) {
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
        obtain.recycle();
    }

    public static void saveSharedUsers() {
        Parcel obtain = Parcel.obtain();
        AtomicFile atomicFile = new AtomicFile(BEnvironment.getSharedUserConf());
        FileOutputStream fileOutputStream = null;
        try {
            try {
                obtain.writeMap(sSharedUsers);
                fileOutputStream = atomicFile.startWrite();
                FileUtils.writeParcelToOutput(obtain, fileOutputStream);
                atomicFile.finishWrite(fileOutputStream);
            } catch (Exception e) {
                e.printStackTrace();
                atomicFile.failWrite(fileOutputStream);
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.name = parcel.readString();
        this.userId = parcel.readInt();
    }

    public String toString() {
        return "SharedUserSetting{" + Integer.toHexString(System.identityHashCode(this)) + ILogger.MSG_SEPARATOR + this.name + InternalZipConstants.ZIP_FILE_SEPARATOR + this.userId + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeInt(this.userId);
        parcel.writeInt(this.seInfoTargetSdkVersion);
    }

    public SharedUserSetting(String str) {
        this.name = str;
    }
}

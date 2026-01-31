package top.niunaijun.blackbox.fake.service;

import android.content.Context;
import androidx.core.p006os.EnvironmentCompat;
import java.io.File;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p015e.AbstractC0925d;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.fake.hook.ClassInvocationStub;
import top.niunaijun.blackbox.fake.hook.MethodHook;
/* loaded from: classes3.dex */
public class BuildProxy extends ClassInvocationStub {
    private static final String IDENTITY_FILE = "guest_identity.json";

    /* loaded from: classes3.dex */
    public static class GuestIdentity {
        public String androidId;
        public String brand;
        public String fingerprint;
        public String model;
        public String radioVersion;
        public String serial;

        private GuestIdentity() {
        }
    }

    private static GuestIdentity generateNewIdentity() {
        GuestIdentity guestIdentity = new GuestIdentity();
        guestIdentity.androidId = UUID.randomUUID().toString().replace("-", "").substring(0, 16);
        guestIdentity.serial = EnvironmentCompat.MEDIA_UNKNOWN;
        guestIdentity.model = "Mi " + (new Random().nextInt(5) + 8);
        guestIdentity.brand = "Xiaomi";
        guestIdentity.fingerprint = "Xiaomi/umi/umi:10/" + UUID.randomUUID().toString().substring(0, 8) + ":user/release-keys";
        guestIdentity.radioVersion = "MPSS." + UUID.randomUUID().toString().substring(0, 8);
        return guestIdentity;
    }

    private static String getValue(String str, String str2) {
        try {
            Matcher matcher = Pattern.compile("\"" + str2 + "\":\"([^\"]+)\"").matcher(str);
            return matcher.find() ? matcher.group(1) : "";
        } catch (Exception e) {
            return "";
        }
    }

    private static GuestIdentity loadIdentity(Context context) {
        try {
            File file = new File(context.getFilesDir(), IDENTITY_FILE);
            if (file.exists()) {
                String str = new String(Files.readAllBytes(file.toPath()));
                GuestIdentity guestIdentity = new GuestIdentity();
                guestIdentity.androidId = getValue(str, "androidId");
                guestIdentity.serial = getValue(str, "serial");
                guestIdentity.fingerprint = getValue(str, "fingerprint");
                guestIdentity.model = getValue(str, "model");
                guestIdentity.brand = getValue(str, "brand");
                guestIdentity.radioVersion = getValue(str, "radioVersion");
                return guestIdentity;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void resetGuest(Context context) {
        saveIdentity(context, generateNewIdentity());
    }

    private static void saveIdentity(Context context, GuestIdentity guestIdentity) {
        try {
            Files.write(new File(context.getFilesDir(), IDENTITY_FILE).toPath(), ("{\"androidId\":\"" + guestIdentity.androidId + "\",\"serial\":\"" + guestIdentity.serial + "\",\"fingerprint\":\"" + guestIdentity.fingerprint + "\",\"model\":\"" + guestIdentity.model + "\",\"brand\":\"" + guestIdentity.brand + "\",\"radioVersion\":\"" + guestIdentity.radioVersion + "\"}").getBytes(), new OpenOption[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public Object getWho() {
        return AbstractC0925d.f161a;
    }

    @Override // top.niunaijun.blackbox.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        Context context = BlackBoxCore.getContext();
        GuestIdentity loadIdentity = loadIdentity(context);
        final GuestIdentity[] guestIdentityArr = {loadIdentity};
        if (loadIdentity == null) {
            GuestIdentity generateNewIdentity = generateNewIdentity();
            guestIdentityArr[0] = generateNewIdentity;
            saveIdentity(context, generateNewIdentity);
        }
        GuestIdentity guestIdentity = guestIdentityArr[0];
        AbstractC0925d.f162b.m215a(guestIdentity.brand);
        AbstractC0925d.f163c.m215a(guestIdentity.model);
        AbstractC0925d.f168h.m215a(guestIdentity.serial);
        AbstractC0925d.f167g.m215a(guestIdentity.fingerprint);
        AbstractC0925d.f166f.m215a("guest");
        AbstractC0925d.f165e.m215a("user");
        AbstractC0925d.f164d.m215a("release-keys");
        addMethodHook("getRadioVersion", new MethodHook() { // from class: top.niunaijun.blackbox.fake.service.BuildProxy.1
            @Override // top.niunaijun.blackbox.fake.hook.MethodHook
            public Object hook(Object obj3, Method method, Object[] objArr) {
                return guestIdentityArr[0].radioVersion;
            }
        });
        addMethodHook("getString", new MethodHook() { // from class: top.niunaijun.blackbox.fake.service.BuildProxy.2
            @Override // top.niunaijun.blackbox.fake.hook.MethodHook
            public Object hook(Object obj3, Method method, Object[] objArr) {
                return (objArr == null || objArr.length <= 1 || !"android_id".equals(objArr[1])) ? method.invoke(obj3, objArr) : guestIdentityArr[0].androidId;
            }
        });
    }

    @Override // top.niunaijun.blackbox.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}

package top.niunaijun.blackbox.utils.compat;

import android.os.Build;
/* loaded from: classes3.dex */
public class BuildCompat {
    private static ROMType sRomType;

    /* loaded from: classes3.dex */
    public enum ROMType {
        EMUI,
        MIUI,
        FLYME,
        COLOR_OS,
        LETV,
        VIVO,
        _360,
        SAMSUNG,
        HYPEROS,
        OTHER
    }

    public static int getPreviewSDKInt() {
        try {
            return Build.VERSION.PREVIEW_SDK_INT;
        } catch (Throwable th) {
            return 0;
        }
    }

    public static ROMType getROMType() {
        if (sRomType == null) {
            sRomType = isEMUI() ? ROMType.EMUI : isHyperOS() ? ROMType.HYPEROS : isMIUI() ? ROMType.MIUI : isFlyme() ? ROMType.FLYME : isColorOS() ? ROMType.COLOR_OS : is360UI() ? ROMType._360 : isLetv() ? ROMType.LETV : isVivo() ? ROMType.VIVO : isSamsung() ? ROMType.SAMSUNG : ROMType.OTHER;
        }
        return sRomType;
    }

    public static boolean is360UI() {
        String str = SystemPropertiesCompat.get("ro.build.uiversion");
        return str != null && str.toUpperCase().contains("360UI");
    }

    public static boolean isColorOS() {
        return SystemPropertiesCompat.isExist("ro.build.version.opporom") || SystemPropertiesCompat.isExist("ro.rom.different.version");
    }

    public static boolean isEMUI() {
        if (Build.DISPLAY.toUpperCase().startsWith("EMUI")) {
            return true;
        }
        String str = SystemPropertiesCompat.get("ro.build.version.emui");
        return str != null && str.contains("EmotionUI");
    }

    public static boolean isFlyme() {
        return Build.DISPLAY.toLowerCase().contains("flyme");
    }

    public static boolean isHyperOS() {
        String str = Build.DISPLAY;
        String lowerCase = str != null ? str.toLowerCase() : "";
        String str2 = Build.MANUFACTURER;
        String lowerCase2 = str2 != null ? str2.toLowerCase() : "";
        String str3 = Build.BRAND;
        String lowerCase3 = str3 != null ? str3.toLowerCase() : "";
        if (lowerCase.contains("hyperos") || ((lowerCase2.contains("xiaomi") && lowerCase.contains("hyperos")) || (lowerCase3.contains("xiaomi") && lowerCase.contains("hyperos")))) {
            return true;
        }
        String str4 = SystemPropertiesCompat.get("ro.hyperos.version");
        return (str4 == null || str4.isEmpty()) ? false : true;
    }

    public static boolean isL() {
        return true;
    }

    public static boolean isLetv() {
        return Build.MANUFACTURER.equalsIgnoreCase("Letv");
    }

    public static boolean isM() {
        return true;
    }

    public static boolean isMIUI() {
        return SystemPropertiesCompat.getInt("ro.miui.ui.version.code", 0) > 0;
    }

    public static boolean isN() {
        return true;
    }

    public static boolean isN_MR1() {
        return Build.VERSION.SDK_INT >= 25 || Build.VERSION.PREVIEW_SDK_INT == 1;
    }

    public static boolean isOreo() {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return i >= 25 && Build.VERSION.PREVIEW_SDK_INT == 1;
        }
        return true;
    }

    public static boolean isPie() {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            return i >= 27 && Build.VERSION.PREVIEW_SDK_INT == 1;
        }
        return true;
    }

    public static boolean isQ() {
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            return i >= 28 && Build.VERSION.PREVIEW_SDK_INT == 1;
        }
        return true;
    }

    public static boolean isR() {
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            return i >= 29 && Build.VERSION.PREVIEW_SDK_INT == 1;
        }
        return true;
    }

    public static boolean isS() {
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            return i >= 30 && Build.VERSION.PREVIEW_SDK_INT == 1;
        }
        return true;
    }

    public static boolean isSamsung() {
        return "samsung".equalsIgnoreCase(Build.BRAND) || "samsung".equalsIgnoreCase(Build.MANUFACTURER);
    }

    public static boolean isT() {
        int i = Build.VERSION.SDK_INT;
        if (i < 32) {
            return i >= 31 && Build.VERSION.PREVIEW_SDK_INT == 1;
        }
        return true;
    }

    public static boolean isU() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            return i >= 32 && Build.VERSION.PREVIEW_SDK_INT == 1;
        }
        return true;
    }

    public static boolean isV() {
        int i = Build.VERSION.SDK_INT;
        if (i < 35) {
            return i >= 34 && Build.VERSION.PREVIEW_SDK_INT == 1;
        }
        return true;
    }

    public static boolean isVivo() {
        return SystemPropertiesCompat.isExist("ro.vivo.os.build.display.id");
    }

    public static boolean isXiaomiDevice() {
        String lowerCase = Build.MANUFACTURER.toLowerCase();
        return lowerCase.contains("xiaomi") || lowerCase.contains("redmi") || lowerCase.contains("poco") || isMIUI();
    }
}

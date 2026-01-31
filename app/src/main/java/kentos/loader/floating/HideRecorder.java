package kentos.loader.floating;

import android.os.Build;
import android.text.TextUtils;
import android.view.WindowManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;
import org.lsposed.lsparanoid.Deobfuscator$$app;
/* loaded from: classes2.dex */
public class HideRecorder {
    private static String sName;
    public static final String ROM_MIUI = Deobfuscator$$app.getString(-3440742324788617033L);
    public static final String ROM_HYPEROS = Deobfuscator$$app.getString(-3440742303313780553L);
    public static final String ROM_EMUI = Deobfuscator$$app.getString(-3440741994076135241L);
    public static final String ROM_HONOR = Deobfuscator$$app.getString(-3440741972601298761L);
    public static final String ROM_FLYME = Deobfuscator$$app.getString(-3440741946831494985L);
    public static final String ROM_OPPO = Deobfuscator$$app.getString(-3440741921061691209L);
    public static final String ROM_REALME = Deobfuscator$$app.getString(-3440741899586854729L);
    public static final String ROM_SMARTISAN = Deobfuscator$$app.getString(-3440741869522083657L);
    public static final String ROM_VIVO = Deobfuscator$$app.getString(-3440742101450317641L);
    public static final String ROM_QIKU = Deobfuscator$$app.getString(-3440742079975481161L);
    public static final String ROM_NUBIAUI = Deobfuscator$$app.getString(-3440742058500644681L);
    public static final String ROM_ONEPLUS = Deobfuscator$$app.getString(-3440742024140906313L);
    public static final String ROM_SAMSUNG = Deobfuscator$$app.getString(-3440741714903261001L);
    public static final String ROM_BLACKSHARK = Deobfuscator$$app.getString(-3440741689133457225L);
    public static final String ROM_ROG = Deobfuscator$$app.getString(-3440741663363653449L);
    public static final String ROM_LENOVO = Deobfuscator$$app.getString(-3440741646183784265L);
    public static final String ROM_INFINIX = Deobfuscator$$app.getString(-3440741616119013193L);
    public static final String ROM_GOOGLE = Deobfuscator$$app.getString(-3440741856637181769L);
    public static final String ROM_UNKNOWN = Deobfuscator$$app.getString(-3440741826572410697L);
    private static final String KEY_VERSION_MIUI = Deobfuscator$$app.getString(-3440741792212672329L);
    private static final String KEY_VERSION_HYPEROS = Deobfuscator$$app.getString(-3440741414255550281L);
    private static final String KEY_VERSION_EMUI = Deobfuscator$$app.getString(-3440741319766269769L);
    private static final String KEY_VERSION_HONOR = Deobfuscator$$app.getString(-3440741500154896201L);
    private static final String KEY_VERSION_OPPO = Deobfuscator$$app.getString(-3440745511654350665L);
    private static final String KEY_VERSION_REALME = Deobfuscator$$app.getString(-3440745679158075209L);
    private static final String KEY_VERSION_SMARTISAN = Deobfuscator$$app.getString(-3440745292611018569L);
    private static final String KEY_VERSION_VIVO = Deobfuscator$$app.getString(-3440745202416705353L);
    private static final String KEY_VERSION_NUBIA = Deobfuscator$$app.getString(-3440745395690233673L);
    private static final String KEY_VERSION_ONEPLUS = Deobfuscator$$app.getString(-3440745017733111625L);
    private static final String KEY_VERSION_SAMSUNG = Deobfuscator$$app.getString(-3440744910358929225L);
    private static final String KEY_VERSION_BLACKSHARK = Deobfuscator$$app.getString(-3440745082157621065L);
    private static final String KEY_VERSION_ROG = Deobfuscator$$app.getString(-3440744729970302793L);

    public static boolean isRealme() {
        return check(Deobfuscator$$app.getString(-3440747676317867849L));
    }

    public static boolean isOppo() {
        return check(Deobfuscator$$app.getString(-3440747646253096777L));
    }

    public static boolean isVivo() {
        return check(Deobfuscator$$app.getString(-3440747899656167241L));
    }

    public static boolean isMiui() {
        return check(Deobfuscator$$app.getString(-3440747878181330761L)) || check(Deobfuscator$$app.getString(-3440747856706494281L));
    }

    public static boolean isEmui() {
        return check(Deobfuscator$$app.getString(-3440747822346755913L)) || check(Deobfuscator$$app.getString(-3440747800871919433L));
    }

    public static boolean isFlyme() {
        return check(Deobfuscator$$app.getString(-3440747500224208713L));
    }

    public static boolean isNubia() {
        return check(Deobfuscator$$app.getString(-3440747474454404937L));
    }

    public static boolean isOnePlus() {
        return check(Deobfuscator$$app.getString(-3440747440094666569L));
    }

    public static boolean isSamsung() {
        return check(Deobfuscator$$app.getString(-3440747405734928201L));
    }

    public static boolean isBlackShark() {
        return check(Deobfuscator$$app.getString(-3440747379965124425L));
    }

    public static boolean isRog() {
        return check(Deobfuscator$$app.getString(-3440747629073227593L));
    }

    public static boolean isGoogle() {
        return check(Deobfuscator$$app.getString(-3440747611893358409L));
    }

    public static boolean isActivice() {
        return false;
    }

    public static void setFakeRecorderWindowLayoutParams(WindowManager.LayoutParams layoutParams) {
        try {
            if (sName == null) {
                check(Deobfuscator$$app.getString(-3440747581828587337L));
            }
            String fakeTitle = getFakeRecordWindowTitle();
            if (!TextUtils.isEmpty(fakeTitle)) {
                layoutParams.setTitle(fakeTitle);
            }
            if (check(Deobfuscator$$app.getString(-3440747577533620041L))) {
                if (setMeizuParams(layoutParams) || !isActivice()) {
                    return;
                }
                setMeizuParams_new(layoutParams);
                return;
            }
            if (!check(Deobfuscator$$app.getString(-3440747551763816265L)) && !check(Deobfuscator$$app.getString(-3440747530288979785L)) && !check(Deobfuscator$$app.getString(-3440747221051334473L))) {
                if (check(Deobfuscator$$app.getString(-3440747195281530697L))) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        try {
                            Field privateFlagField = layoutParams.getClass().getDeclaredField(Deobfuscator$$app.getString(-3440747160921792329L));
                            privateFlagField.setAccessible(true);
                            setOnePlusParams(layoutParams, ((Integer) privateFlagField.get(layoutParams.getClass())).intValue());
                        } catch (Exception e) {
                            layoutParams.flags |= 8192;
                        }
                        return;
                    }
                    return;
                } else if (check(Deobfuscator$$app.getString(-3440747264001007433L))) {
                    setSamsungFlags(layoutParams);
                    return;
                } else if (check(Deobfuscator$$app.getString(-3440747238231203657L))) {
                    layoutParams.memoryType |= 268435456;
                    return;
                } else {
                    if (!check(Deobfuscator$$app.getString(-3440746946173427529L)) && !check(Deobfuscator$$app.getString(-3440746916108656457L))) {
                        layoutParams.flags |= 8192;
                        return;
                    }
                    return;
                }
            }
            setXiaomiParams(layoutParams);
        } catch (Exception e2) {
            layoutParams.flags |= 8192;
            e2.printStackTrace();
        }
    }

    private static void setXiaomiParams(WindowManager.LayoutParams params) {
        try {
            params.flags |= 4096;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean setMeizuParams(WindowManager.LayoutParams params) {
        try {
            Class<?> MeizuParamsClass = Class.forName(Deobfuscator$$app.getString(-3440746894633819977L));
            Field flagField = MeizuParamsClass.getDeclaredField(Deobfuscator$$app.getString(-3440747036367740745L));
            flagField.setAccessible(true);
            Object MeizuParams = MeizuParamsClass.newInstance();
            flagField.setInt(MeizuParams, 8192);
            Field mzParamsField = params.getClass().getField(Deobfuscator$$app.getString(-3440747010597936969L));
            mzParamsField.set(params, MeizuParams);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static void setMeizuParams_new(WindowManager.LayoutParams params) {
        try {
            Field mzParamsField = params.getClass().getDeclaredField(Deobfuscator$$app.getString(-3440746959058329417L));
            mzParamsField.setAccessible(true);
            mzParamsField.setInt(params, 1024);
        } catch (Exception e) {
        }
    }

    private static void setOnePlusParams(WindowManager.LayoutParams params, int flagValue) {
        try {
            Field flagField = params.getClass().getDeclaredField(Deobfuscator$$app.getString(-3440746636935782217L));
            flagField.setAccessible(true);
            flagField.set(params, Integer.valueOf(flagValue));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void setSamsungFlags(WindowManager.LayoutParams params) {
        try {
            Method semAddExtensionFlags = params.getClass().getMethod(Deobfuscator$$app.getString(-3440746581101207369L), Integer.TYPE);
            Method semAddPrivateFlags = params.getClass().getMethod(Deobfuscator$$app.getString(-3440746765784801097L), Integer.TYPE);
            semAddExtensionFlags.invoke(params, -2147352576);
            semAddPrivateFlags.invoke(params, Integer.valueOf(params.flags));
        } catch (Exception e) {
            params.flags |= 8192;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static String getFakeRecordWindowTitle() {
        char c;
        if (sName == null) {
            check(Deobfuscator$$app.getString(-3440746684180422473L));
        }
        String str = sName;
        switch (str.hashCode()) {
            case -2053026509:
                if (str.equals(Deobfuscator$$app.getString(-3440746091474935625L))) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1881642058:
                if (str.equals(Deobfuscator$$app.getString(-3440746280453496649L))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1631735723:
                if (str.equals(Deobfuscator$$app.getString(-3440746061410164553L))) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1292486777:
                if (str.equals(Deobfuscator$$app.getString(-3440746443662253897L))) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -602397472:
                if (str.equals(Deobfuscator$$app.getString(-3440746503791796041L))) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 81322:
                if (str.equals(Deobfuscator$$app.getString(-3440746108654804809L))) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2132284:
                if (str.equals(Deobfuscator$$app.getString(-3440746349172973385L))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 2366768:
                if (str.equals(Deobfuscator$$app.getString(-3440746679885455177L))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2432928:
                if (str.equals(Deobfuscator$$app.getString(-3440746301928333129L))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2634924:
                if (str.equals(Deobfuscator$$app.getString(-3440746525266632521L))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 66998571:
                if (str.equals(Deobfuscator$$app.getString(-3440746469432057673L))) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 68924490:
                if (str.equals(Deobfuscator$$app.getString(-3440746327698136905L))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 70782280:
                if (str.equals(Deobfuscator$$app.getString(-3440746409302515529L))) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2099768624:
                if (str.equals(Deobfuscator$$app.getString(-3440746383532711753L))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2108052025:
                if (str.equals(Deobfuscator$$app.getString(-3440746027050426185L))) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return Deobfuscator$$app.getString(-3440745996985655113L);
            case 2:
            case 3:
                return Deobfuscator$$app.getString(-3440746168784346953L);
            case 4:
                return Deobfuscator$$app.getString(-3440745812302061385L);
            case 5:
                return Deobfuscator$$app.getString(-3440745928266178377L);
            case 6:
                return Deobfuscator$$app.getString(-3440749892520992585L);
            case 7:
                return Deobfuscator$$app.getString(-3440750085794520905L);
            case '\b':
                return Deobfuscator$$app.getString(-3440750017075044169L);
            case '\t':
                return Deobfuscator$$app.getString(-3440749664887725897L);
            case '\n':
                return Deobfuscator$$app.getString(-3440749836686417737L);
            case 11:
                return Deobfuscator$$app.getString(-3440749707837398857L);
            case '\f':
                return Deobfuscator$$app.getString(-3440749493089034057L);
            case '\r':
                return Deobfuscator$$app.getString(-3440749106541977417L);
            case 14:
                return Deobfuscator$$app.getString(-3440749256865832777L);
            default:
                return Deobfuscator$$app.getString(-3440748835959037769L);
        }
    }

    private static boolean check(String rom) {
        String str = sName;
        if (str != null) {
            return str.equals(rom);
        }
        if (!TextUtils.isEmpty(getProp(Deobfuscator$$app.getString(-3440748831664070473L)))) {
            sName = Deobfuscator$$app.getString(-3440748994872827721L);
        } else if (!TextUtils.isEmpty(getProp(Deobfuscator$$app.getString(-3440748964808056649L))) || (getProp(Deobfuscator$$app.getString(-3440748595440869193L)) != null && getProp(Deobfuscator$$app.getString(-3440748500951588681L)).toLowerCase().contains(Deobfuscator$$app.getString(-3440748681340215113L)))) {
            sName = Deobfuscator$$app.getString(-3440748642685509449L);
        } else if (!TextUtils.isEmpty(getProp(Deobfuscator$$app.getString(-3440748625505640265L)))) {
            sName = Deobfuscator$$app.getString(-3440748273318321993L);
        } else if (!TextUtils.isEmpty(getProp(Deobfuscator$$app.getString(-3440748247548518217L)))) {
            sName = Deobfuscator$$app.getString(-3440748419347210057L);
        } else if (!TextUtils.isEmpty(getProp(Deobfuscator$$app.getString(-3440748397872373577L)))) {
            sName = Deobfuscator$$app.getString(-3440748028505186121L);
        } else if (!TextUtils.isEmpty(getProp(Deobfuscator$$app.getString(-3440747994145447753L)))) {
            sName = Deobfuscator$$app.getString(-3440748157354205001L);
        } else if (!TextUtils.isEmpty(getProp(Deobfuscator$$app.getString(-3440748131584401225L)))) {
            sName = Deobfuscator$$app.getString(-3440743364170702665L);
        } else if (!TextUtils.isEmpty(getProp(Deobfuscator$$app.getString(-3440743342695866185L)))) {
            sName = Deobfuscator$$app.getString(-3440743510199590729L);
        } else if (!TextUtils.isEmpty(getProp(Deobfuscator$$app.getString(-3440743488724754249L)))) {
            sName = Deobfuscator$$app.getString(-3440743407120375625L);
        } else if (!TextUtils.isEmpty(getProp(Deobfuscator$$app.getString(-3440743385645539145L)))) {
            sName = Deobfuscator$$app.getString(-3440743020573318985L);
        } else if (!TextUtils.isEmpty(getProp(Deobfuscator$$app.getString(-3440742977623646025L)))) {
            sName = Deobfuscator$$app.getString(-3440743149422337865L);
        } else if (!TextUtils.isEmpty(getProp(Deobfuscator$$app.getString(-3440743115062599497L))) || Build.MANUFACTURER.equalsIgnoreCase(Deobfuscator$$app.getString(-3440742732810510153L))) {
            sName = Deobfuscator$$app.getString(-3440742698450771785L);
        } else if (!TextUtils.isEmpty(getProp(Deobfuscator$$app.getString(-3440742938968940361L)))) {
            sName = Deobfuscator$$app.getString(-3440742835889725257L);
        } else {
            String manufacturer = Build.MANUFACTURER.toUpperCase(Locale.ROOT);
            String display = Build.DISPLAY.toUpperCase(Locale.ROOT);
            if (display.contains(Deobfuscator$$app.getString(-3440742535242014537L)) || manufacturer.contains(Deobfuscator$$app.getString(-3440742509472210761L))) {
                sName = Deobfuscator$$app.getString(-3440742483702406985L);
            } else if (manufacturer.contains(Deobfuscator$$app.getString(-3440742457932603209L)) || manufacturer.contains(Deobfuscator$$app.getString(-3440742427867832137L))) {
                sName = Deobfuscator$$app.getString(-3440742664091033417L);
            } else if (manufacturer.contains(Deobfuscator$$app.getString(-3440742634026262345L)) || manufacturer.contains(Deobfuscator$$app.getString(-3440742599666523977L)) || manufacturer.contains(Deobfuscator$$app.getString(-3440742573896720201L))) {
                sName = Deobfuscator$$app.getString(-3440742277543976777L);
            } else if (manufacturer.contains(Deobfuscator$$app.getString(-3440742243184238409L))) {
                sName = Deobfuscator$$app.getString(-3440742213119467337L);
            } else if (manufacturer.contains(Deobfuscator$$app.getString(-3440742183054696265L))) {
                sName = Deobfuscator$$app.getString(-3440742148694957897L);
            } else {
                sName = Deobfuscator$$app.getString(-3440742397803061065L);
            }
        }
        return sName.equals(rom);
    }

    private static String getProp(String name) {
        BufferedReader input = null;
        try {
            Process p = Runtime.getRuntime().exec(Deobfuscator$$app.getString(-3440742363443322697L) + name);
            input = new BufferedReader(new InputStreamReader(p.getInputStream()), 1024);
            String line = input.readLine();
            input.close();
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return line;
        } catch (IOException e2) {
            if (input == null) {
                return null;
            }
            try {
                input.close();
                return null;
            } catch (IOException e3) {
                e3.printStackTrace();
                return null;
            }
        } catch (Throwable th) {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            throw th;
        }
    }
}

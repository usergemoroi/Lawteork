package top.niunaijun.blackbox.utils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
/* loaded from: classes3.dex */
public class ShellUtils {
    public static final String COMMAND_EXIT = "exit\n";
    public static final String COMMAND_LINE_END = "\n";
    public static final String COMMAND_SH = "sh";
    public static final String COMMAND_SU = "su";

    /* loaded from: classes3.dex */
    public static class CommandResult {
        public int result;
        public String successMsg;

        public CommandResult(int i) {
            this.result = i;
        }

        public CommandResult(int i, String str) {
            this.result = i;
            this.successMsg = str;
        }
    }

    private ShellUtils() {
        throw new AssertionError();
    }

    public static boolean checkRootPermission() {
        return execCommand("echo root", true, false).result == 0;
    }

    public static CommandResult execCommand(String str, boolean z) {
        return execCommand(new String[]{str}, z, true);
    }

    public static CommandResult execCommand(String str, boolean z, boolean z2) {
        return execCommand(new String[]{str}, z, z2);
    }

    public static CommandResult execCommand(List<String> list, boolean z) {
        return execCommand(list == null ? null : (String[]) list.toArray(new String[0]), z, true);
    }

    public static CommandResult execCommand(List<String> list, boolean z, boolean z2) {
        return execCommand(list == null ? null : (String[]) list.toArray(new String[0]), z, z2);
    }

    public static CommandResult execCommand(String[] strArr, boolean z) {
        return execCommand(strArr, z, true);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(12:6|7|(1:9)(1:114)|10|11|12|13|14|15|(5:18|(1:22)|20|21|16)|23|24)|(11:26|27|28|(3:30|31|(1:33)(0))|35|(1:37)|39|40|(1:42)|43|44)(1:97)|34|35|(0)|39|40|(0)|43|44) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ad, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ae, code lost:
        r10.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f3, code lost:
        if (r10 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0110, code lost:
        if (r10 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0112, code lost:
        r8 = r9;
        r9 = r10;
        r1 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0136 A[Catch: IOException -> 0x0132, TRY_LEAVE, TryCatch #6 {IOException -> 0x0132, blocks: (B:102:0x012e, B:106:0x0136), top: B:115:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0101 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a8 A[Catch: IOException -> 0x00ad, TRY_LEAVE, TryCatch #9 {IOException -> 0x00ad, blocks: (B:43:0x00a3, B:45:0x00a8), top: B:117:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ec A[Catch: IOException -> 0x00e8, TRY_LEAVE, TryCatch #10 {IOException -> 0x00e8, blocks: (B:68:0x00e4, B:72:0x00ec), top: B:119:0x00e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0109 A[Catch: IOException -> 0x0105, TRY_LEAVE, TryCatch #13 {IOException -> 0x0105, blocks: (B:82:0x0101, B:86:0x0109), top: B:123:0x0101 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011f  */
    /* JADX WARN: Type inference failed for: r10v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.OutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CommandResult execCommand(String[] strArr, boolean z, boolean z2) {
        DataOutputStream dataOutputStream;
        Process process;
        DataOutputStream dataOutputStream2;
        StringBuilder sb;
        Process process2;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        int i;
        BufferedReader bufferedReader3;
        BufferedReader bufferedReader4;
        DataOutputStream dataOutputStream3;
        StringBuilder sb2;
        DataOutputStream dataOutputStream4;
        BufferedReader bufferedReader5;
        DataOutputStream dataOutputStream5;
        Process process3;
        DataOutputStream dataOutputStream6;
        Process process4;
        Process process5 = null;
        BufferedReader bufferedReader6 = null;
        ?? r1 = -1;
        r1 = -1;
        int i2 = -1;
        if (strArr != null) {
            try {
                if (strArr.length != 0) {
                    try {
                        process = Runtime.getRuntime().exec(z ? COMMAND_SU : COMMAND_SH);
                        try {
                            dataOutputStream2 = new DataOutputStream(process.getOutputStream());
                            try {
                                try {
                                    for (String str : strArr) {
                                        if (str != null) {
                                            dataOutputStream2.write(str.getBytes());
                                            dataOutputStream2.writeBytes(COMMAND_LINE_END);
                                            dataOutputStream2.flush();
                                        }
                                    }
                                    dataOutputStream2.writeBytes(COMMAND_EXIT);
                                    dataOutputStream2.flush();
                                    i2 = process.waitFor();
                                } catch (Throwable th) {
                                    th = th;
                                }
                            } catch (IOException e) {
                                e = e;
                                process2 = process;
                                sb = null;
                                dataOutputStream4 = dataOutputStream2;
                                i = i2;
                                bufferedReader4 = null;
                            } catch (Exception e2) {
                                e = e2;
                                process2 = process;
                                sb = null;
                                dataOutputStream3 = dataOutputStream2;
                                i = i2;
                                bufferedReader3 = null;
                            }
                        } catch (IOException e3) {
                            e = e3;
                            process2 = process;
                            sb = null;
                            bufferedReader2 = null;
                            i = -1;
                            bufferedReader4 = bufferedReader2;
                            dataOutputStream4 = bufferedReader2;
                            e.printStackTrace();
                            if (dataOutputStream4 != null) {
                                try {
                                    dataOutputStream4.close();
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                }
                            }
                            if (bufferedReader4 != null) {
                                bufferedReader4.close();
                            }
                        } catch (Exception e5) {
                            e = e5;
                            process2 = process;
                            sb = null;
                            bufferedReader = null;
                            i = -1;
                            bufferedReader3 = bufferedReader;
                            dataOutputStream3 = bufferedReader;
                            e.printStackTrace();
                            if (dataOutputStream3 != null) {
                                try {
                                    dataOutputStream3.close();
                                } catch (IOException e6) {
                                    e6.printStackTrace();
                                }
                            }
                            if (bufferedReader3 != null) {
                                bufferedReader3.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r1 = 0;
                            dataOutputStream = null;
                            process5 = process;
                            process = process5;
                            bufferedReader6 = r1;
                            dataOutputStream2 = dataOutputStream;
                            if (dataOutputStream2 != null) {
                                try {
                                    dataOutputStream2.close();
                                } catch (IOException e7) {
                                    e7.printStackTrace();
                                    if (process != null) {
                                        process.destroy();
                                    }
                                    throw th;
                                }
                            }
                            if (bufferedReader6 != null) {
                                bufferedReader6.close();
                            }
                            if (process != null) {
                            }
                            throw th;
                        }
                    } catch (IOException e8) {
                        e = e8;
                        sb = null;
                        process2 = null;
                        bufferedReader2 = null;
                    } catch (Exception e9) {
                        e = e9;
                        sb = null;
                        process2 = null;
                        bufferedReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                        r1 = 0;
                        dataOutputStream = null;
                    }
                    if (z2 != 0) {
                        sb2 = new StringBuilder();
                        try {
                            bufferedReader5 = new BufferedReader(new InputStreamReader(process.getInputStream()));
                            while (true) {
                                try {
                                    String readLine = bufferedReader5.readLine();
                                    if (readLine != null) {
                                        sb2.append(readLine + COMMAND_LINE_END);
                                    }
                                } catch (IOException e10) {
                                    process4 = process;
                                    sb = sb2;
                                    e = e10;
                                    dataOutputStream6 = dataOutputStream2;
                                    i = i2;
                                    bufferedReader4 = bufferedReader5;
                                    process2 = process4;
                                    dataOutputStream4 = dataOutputStream6;
                                    e.printStackTrace();
                                    if (dataOutputStream4 != null) {
                                    }
                                    if (bufferedReader4 != null) {
                                    }
                                } catch (Exception e11) {
                                    process3 = process;
                                    sb = sb2;
                                    e = e11;
                                    dataOutputStream5 = dataOutputStream2;
                                    i = i2;
                                    bufferedReader3 = bufferedReader5;
                                    process2 = process3;
                                    dataOutputStream3 = dataOutputStream5;
                                    e.printStackTrace();
                                    if (dataOutputStream3 != null) {
                                    }
                                    if (bufferedReader3 != null) {
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    bufferedReader6 = bufferedReader5;
                                    if (dataOutputStream2 != null) {
                                    }
                                    if (bufferedReader6 != null) {
                                    }
                                    if (process != null) {
                                    }
                                    throw th;
                                }
                            }
                            dataOutputStream2.close();
                            if (bufferedReader5 != null) {
                                bufferedReader5.close();
                            }
                        } catch (IOException e12) {
                            dataOutputStream6 = dataOutputStream2;
                            i = i2;
                            bufferedReader4 = null;
                            process4 = process;
                            sb = sb2;
                            e = e12;
                        } catch (Exception e13) {
                            dataOutputStream5 = dataOutputStream2;
                            i = i2;
                            bufferedReader3 = null;
                            process3 = process;
                            sb = sb2;
                            e = e13;
                        }
                        process.destroy();
                        sb = sb2;
                        i = i2;
                        return new CommandResult(i, sb != null ? sb.toString() : null);
                    }
                    sb2 = null;
                    bufferedReader5 = null;
                    dataOutputStream2.close();
                    if (bufferedReader5 != null) {
                    }
                    process.destroy();
                    sb = sb2;
                    i = i2;
                    return new CommandResult(i, sb != null ? sb.toString() : null);
                }
            } catch (Throwable th5) {
                th = th5;
                process5 = z2;
            }
        }
        return new CommandResult(-1, null);
    }
}

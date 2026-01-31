package com.topjohnwu.superuser.internal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class StreamGobbler<T> implements Callable<T> {
    private static final String TAG = "SHELLOUT";

    /* renamed from: in */
    protected final InputStream f159in;
    protected final List<String> list;

    StreamGobbler(InputStream in, List<String> list) {
        this.f159in = in;
        this.list = list;
    }

    private boolean outputAndCheck(String line) {
        if (line == null) {
            return false;
        }
        int len = line.length();
        boolean end = line.startsWith(TaskImpl.END_UUID, len - 36);
        if (end) {
            if (len == 36) {
                return false;
            }
            line = line.substring(0, len - 36);
        }
        List<String> list = this.list;
        if (list != null) {
            list.add(line);
            Utils.log(TAG, line);
        }
        return !end;
    }

    protected String process(boolean res) throws IOException {
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(this.f159in, Utils.UTF_8));
        do {
            line = br.readLine();
        } while (outputAndCheck(line));
        if (res) {
            return br.readLine();
        }
        return null;
    }

    /* loaded from: classes.dex */
    static class OUT extends StreamGobbler<Integer> {
        private static final int NO_RESULT_CODE = 1;

        /* JADX INFO: Access modifiers changed from: package-private */
        public OUT(InputStream in, List<String> list) {
            super(in, list);
        }

        @Override // java.util.concurrent.Callable
        public Integer call() throws Exception {
            int parseInt;
            String code = process(true);
            if (code == null) {
                parseInt = 1;
            } else {
                try {
                    parseInt = Integer.parseInt(code);
                } catch (NumberFormatException e) {
                    return 1;
                }
            }
            return Integer.valueOf(parseInt);
        }
    }

    /* loaded from: classes.dex */
    static class ERR extends StreamGobbler<Void> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public ERR(InputStream in, List<String> list) {
            super(in, list);
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            process(false);
            return null;
        }
    }
}

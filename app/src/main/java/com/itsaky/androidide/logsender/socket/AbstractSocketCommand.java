package com.itsaky.androidide.logsender.socket;

import net.lingala.zip4j.util.InternalZipConstants;
/* loaded from: classes.dex */
public abstract class AbstractSocketCommand implements ISocketCommand {
    protected String[] getParams() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(InternalZipConstants.ZIP_FILE_SEPARATOR);
        sb.append(getName());
        String[] params = getParams();
        if (params != null && params.length > 0) {
            sb.append(PARAM_DELIMITER);
            for (int i = 0; i < params.length; i++) {
                String param = params[i];
                sb.append(param);
                if (i < params.length - 1) {
                    sb.append(PARAM_DELIMITER);
                }
            }
        }
        return sb.toString();
    }
}

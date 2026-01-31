package top.niunaijun.blackbox.fake.provider;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import java.io.File;
import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.app.BActivityThread;
import top.niunaijun.blackbox.utils.compat.BuildCompat;
/* loaded from: classes3.dex */
public class FileProviderHandler {
    public static File convertFile(Context context, Uri uri) {
        for (ProviderInfo providerInfo : BActivityThread.getProviders()) {
            try {
                File fileForUri = FileProvider.getFileForUri(context, providerInfo.authority, uri);
                if (fileForUri != null && fileForUri.exists()) {
                    return fileForUri;
                }
            } catch (Exception e) {
            }
        }
        return null;
    }

    public static Uri convertFileUri(Context context, Uri uri) {
        if (BuildCompat.isN()) {
            File convertFile = convertFile(context, uri);
            if (convertFile == null) {
                return null;
            }
            return BlackBoxCore.getBStorageManager().getUriForFile(convertFile.getAbsolutePath());
        }
        return uri;
    }
}

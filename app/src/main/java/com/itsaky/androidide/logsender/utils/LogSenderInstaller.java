package com.itsaky.androidide.logsender.utils;

import android.app.Application;
import android.app.BackgroundServiceStartNotAllowedException;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.itsaky.androidide.logsender.LogSender;
import com.itsaky.androidide.logsender.LogSenderService;
/* loaded from: classes.dex */
public class LogSenderInstaller extends ContentProvider {
    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Application application = (Application) getContext();
        if (LogSender.PACKAGE_ANDROIDIDE.equals(application.getPackageName())) {
            return true;
        }
        try {
            Intent intent = new Intent(application, LogSenderService.class);
            intent.setAction(LogSenderService.ACTION_START_SERVICE);
            if (Build.VERSION.SDK_INT >= 26) {
                application.startForegroundService(intent);
            } else {
                application.startService(intent);
            }
        } catch (Exception e) {
            if (Build.VERSION.SDK_INT < 31 || !(e instanceof BackgroundServiceStartNotAllowedException)) {
                throw new RuntimeException(e);
            }
        }
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        return null;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues values) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        return 0;
    }
}

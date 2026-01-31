package top.niunaijun.blackbox.utils;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.system.Os;
import android.text.TextUtils;
import com.itsaky.androidide.utils.ILogger;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.UByte;
/* loaded from: classes3.dex */
public class FileUtils {
    private static Thread cleanerThread = null;
    private static boolean isClear = false;
    private static File tmpDir;

    /* loaded from: classes3.dex */
    public static class FileLock {
        private static FileLock singleton;
        private Map<String, FileLockCount> mRefCountMap = new ConcurrentHashMap();

        /* loaded from: classes3.dex */
        public class FileLockCount {
            FileChannel fChannel;
            RandomAccessFile fOs;
            java.nio.channels.FileLock mFileLock;
            int mRefCount;

            public FileLockCount(java.nio.channels.FileLock fileLock, int i, RandomAccessFile randomAccessFile, FileChannel fileChannel) {
                this.mFileLock = fileLock;
                this.mRefCount = i;
                this.fOs = randomAccessFile;
                this.fChannel = fileChannel;
            }
        }

        private int RefCntDec(String str) {
            if (this.mRefCountMap.containsKey(str)) {
                FileLockCount fileLockCount = this.mRefCountMap.get(str);
                int i = fileLockCount.mRefCount - 1;
                fileLockCount.mRefCount = i;
                if (i <= 0) {
                    this.mRefCountMap.remove(str);
                    return i;
                }
                return i;
            }
            return 0;
        }

        private int RefCntInc(String str, java.nio.channels.FileLock fileLock, RandomAccessFile randomAccessFile, FileChannel fileChannel) {
            if (!this.mRefCountMap.containsKey(str)) {
                this.mRefCountMap.put(str, new FileLockCount(fileLock, 1, randomAccessFile, fileChannel));
                return 1;
            }
            FileLockCount fileLockCount = this.mRefCountMap.get(str);
            int i = fileLockCount.mRefCount;
            fileLockCount.mRefCount = i + 1;
            return i;
        }

        public static FileLock getInstance() {
            if (singleton == null) {
                singleton = new FileLock();
            }
            return singleton;
        }

        public boolean LockExclusive(File file) {
            if (file == null) {
                return false;
            }
            try {
                File file2 = new File(file.getParentFile().getAbsolutePath().concat("/lock"));
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                RandomAccessFile randomAccessFile = new RandomAccessFile(file2.getAbsolutePath(), "rw");
                FileChannel channel = randomAccessFile.getChannel();
                java.nio.channels.FileLock lock = channel.lock();
                if (lock.isValid()) {
                    RefCntInc(file2.getAbsolutePath(), lock, randomAccessFile, channel);
                    return true;
                }
                return false;
            } catch (Exception e) {
                return false;
            }
        }

        public void unLock(File file) {
            FileLockCount fileLockCount;
            File file2 = new File(file.getParentFile().getAbsolutePath().concat("/lock"));
            if (file2.exists() && this.mRefCountMap.containsKey(file2.getAbsolutePath()) && (fileLockCount = this.mRefCountMap.get(file2.getAbsolutePath())) != null) {
                java.nio.channels.FileLock fileLock = fileLockCount.mFileLock;
                RandomAccessFile randomAccessFile = fileLockCount.fOs;
                FileChannel fileChannel = fileLockCount.fChannel;
                try {
                    if (RefCntDec(file2.getAbsolutePath()) <= 0) {
                        if (fileLock != null && fileLock.isValid()) {
                            fileLock.release();
                        }
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                        }
                        if (fileChannel != null) {
                            fileChannel.close();
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface FileMode {
        public static final int MODE_755 = 493;
        public static final int MODE_IRGRP = 32;
        public static final int MODE_IROTH = 4;
        public static final int MODE_IRUSR = 256;
        public static final int MODE_ISGID = 1024;
        public static final int MODE_ISUID = 2048;
        public static final int MODE_ISVTX = 512;
        public static final int MODE_IWGRP = 16;
        public static final int MODE_IWOTH = 2;
        public static final int MODE_IWUSR = 128;
        public static final int MODE_IXGRP = 8;
        public static final int MODE_IXOTH = 1;
        public static final int MODE_IXUSR = 64;
    }

    public static String buildValidExtFilename(String str) {
        if (TextUtils.isEmpty(str) || ".".equals(str) || "..".equals(str)) {
            return "(invalid)";
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!isValidExtFilenameChar(charAt)) {
                charAt = '_';
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static boolean canRead(String str) {
        return new File(str).canRead();
    }

    public static File changeExt(File file, String str) {
        String absolutePath = file.getAbsolutePath();
        if (getFilenameExt(absolutePath).equals(str)) {
            return file;
        }
        int lastIndexOf = absolutePath.lastIndexOf(".");
        return new File((lastIndexOf > 0 ? new StringBuilder().append(absolutePath.substring(0, lastIndexOf + 1)) : new StringBuilder().append(absolutePath).append(".")).append(str).toString());
    }

    public static void chmod(String str, int i) {
        try {
            Os.chmod(str, i);
        } catch (Exception e) {
            Runtime.getRuntime().exec((new File(str).isDirectory() ? "chmod  -R " : "chmod ") + String.format("%o", Integer.valueOf(i)) + ILogger.MSG_SEPARATOR + str).waitFor();
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
            }
        }
    }

    public static void copyFile(File file, File file2) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    FileChannel channel2 = fileOutputStream2.getChannel();
                    ByteBuffer allocate = ByteBuffer.allocate(1024);
                    while (true) {
                        allocate.clear();
                        if (channel.read(allocate) == -1) {
                            closeQuietly(fileInputStream);
                            closeQuietly(fileOutputStream2);
                            return;
                        }
                        allocate.limit(allocate.position());
                        allocate.position(0);
                        channel2.write(allocate);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    closeQuietly(fileInputStream);
                    closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    public static int count(File file) {
        String[] list;
        if (file.exists()) {
            if (file.isFile()) {
                return 1;
            }
            if (!file.isDirectory() || (list = file.list()) == null) {
                return 0;
            }
            return list.length;
        }
        return -1;
    }

    public static void createSymlink(String str, String str2) {
        try {
            Os.link(str, str2);
        } catch (Throwable th) {
            Runtime.getRuntime().exec("ln -s " + str + ILogger.MSG_SEPARATOR + str2).waitFor();
        }
    }

    public static int deleteDir(File file) {
        boolean z;
        int i = 0;
        if (file.isDirectory()) {
            try {
                z = isSymlink(file);
            } catch (Exception e) {
                z = false;
            }
            if (!z) {
                String[] list = file.list();
                int length = list.length;
                int i2 = 0;
                while (i < length) {
                    i2 += deleteDir(new File(file, list[i]));
                    i++;
                }
                i = i2;
            }
        }
        return file.delete() ? i + 1 : i;
    }

    private static void deleteRecursive(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                deleteRecursive(file2);
            }
        }
        file.delete();
    }

    public static void deleteTmp(Context context) {
        try {
            File file = new File(context.getFilesDir(), "ano_tmp");
            if (file.exists()) {
                deleteRecursive(file);
            }
        } catch (Exception e) {
        }
    }

    private static String getDataColumn(Context context, Uri uri, String str, String[] strArr) {
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("_data"));
                        query.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String getFilenameExt(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? "" : str.substring(lastIndexOf + 1);
    }

    public static void isCln(Context context) {
        if (context == null || isClear) {
            return;
        }
        final File file = new File(context.getFilesDir(), "ano_tmp");
        if (file.exists()) {
            deleteRecursive(file);
        }
        try {
            file.createNewFile();
            isClear = true;
            Thread thread = new Thread(new Runnable() { // from class: top.niunaijun.blackbox.utils.FileUtils$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    FileUtils.lambda$isCln$0(file);
                }
            });
            cleanerThread = thread;
            thread.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isExist(String str) {
        return new File(str).exists();
    }

    private static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    private static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static boolean isSymlink(File file) {
        if (file != null) {
            if (file.getParent() != null) {
                file = new File(file.getParentFile().getCanonicalFile(), file.getName());
            }
            return !file.getCanonicalFile().equals(file.getAbsoluteFile());
        }
        throw new NullPointerException("File must not be null");
    }

    public static boolean isValidExtFilename(String str) {
        return str != null && str.equals(buildValidExtFilename(str));
    }

    private static boolean isValidExtFilenameChar(char c) {
        return (c == 0 || c == '/') ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$isCln$0(File file) {
        long currentTimeMillis = System.currentTimeMillis();
        while (System.currentTimeMillis() - currentTimeMillis < 60000 && isClear) {
            if (file.exists() && file.isDirectory()) {
                deleteRecursive(file);
                try {
                    file.createNewFile();
                } catch (IOException e) {
                }
            }
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
            }
        }
        if (file.exists()) {
            deleteRecursive(file);
        }
        isClear = false;
    }

    public static void mkdirs(File file) {
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static int peekInt(byte[] bArr, int i, ByteOrder byteOrder) {
        int i2;
        int i3;
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            int i4 = i + 1;
            int i5 = i4 + 1;
            i2 = ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i4] & UByte.MAX_VALUE) << 16) | ((bArr[i5] & UByte.MAX_VALUE) << 8);
            i3 = bArr[i5 + 1] & UByte.MAX_VALUE;
        } else {
            int i6 = i + 1;
            int i7 = i6 + 1;
            i2 = (bArr[i] & UByte.MAX_VALUE) | ((bArr[i6] & UByte.MAX_VALUE) << 8) | ((bArr[i7] & UByte.MAX_VALUE) << 16);
            i3 = (bArr[i7 + 1] & UByte.MAX_VALUE) << 24;
        }
        return i3 | i2;
    }

    public static Parcel readToParcel(File file) {
        Parcel obtain = Parcel.obtain();
        byte[] byteArray = toByteArray(file);
        obtain.unmarshall(byteArray, 0, byteArray.length);
        obtain.setDataPosition(0);
        return obtain;
    }

    public static String readToString(String str) {
        FileInputStream fileInputStream = new FileInputStream(str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = fileInputStream.read();
            if (read == -1) {
                return byteArrayOutputStream.toString();
            }
            byteArrayOutputStream.write(read);
        }
    }

    public static boolean renameTo(File file, File file2) {
        return file.renameTo(file2);
    }

    public static void stopCln() {
        isClear = false;
        Thread thread = cleanerThread;
        if (thread != null) {
            thread.interrupt();
        }
    }

    public static byte[] toByteArray(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return toByteArray(fileInputStream);
        } finally {
            closeQuietly(fileInputStream);
        }
    }

    public static void writeParcelToFile(Parcel parcel, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(parcel.marshall());
        fileOutputStream.close();
    }

    public static void writeParcelToOutput(Parcel parcel, FileOutputStream fileOutputStream) {
        fileOutputStream.write(parcel.marshall());
    }

    public static void writeToFile(InputStream inputStream, File file) {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr, 0, 1024);
            if (read == -1) {
                bufferedOutputStream.close();
                return;
            }
            bufferedOutputStream.write(bArr, 0, read);
        }
    }

    public static void copyFile(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.flush();
            } catch (Throwable th) {
            }
        } catch (Throwable th2) {
            fileOutputStream = null;
        }
        closeQuietly(inputStream);
        closeQuietly(fileOutputStream);
    }

    public static int deleteDir(String str) {
        return deleteDir(new File(str));
    }

    public static void mkdirs(String str) {
        mkdirs(new File(str));
    }

    public static byte[] toByteArray(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[100];
        while (true) {
            int read = inputStream.read(bArr, 0, 100);
            if (read <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void writeToFile(byte[] bArr, File file) {
        ReadableByteChannel readableByteChannel;
        ?? r10;
        FileOutputStream fileOutputStream = null;
        try {
            readableByteChannel = Channels.newChannel(new ByteArrayInputStream(bArr));
        } catch (Throwable th) {
            th = th;
            readableByteChannel = null;
        }
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                FileChannel channel = fileOutputStream2.getChannel();
                try {
                    channel.transferFrom(readableByteChannel, 0L, bArr.length);
                    fileOutputStream2.close();
                    if (readableByteChannel != null) {
                        readableByteChannel.close();
                    }
                    channel.close();
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = channel;
                    r10 = fileOutputStream;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (readableByteChannel != null) {
                        readableByteChannel.close();
                    }
                    if (r10 != 0) {
                        r10.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            r10 = 0;
            if (fileOutputStream != null) {
            }
            if (readableByteChannel != null) {
            }
            if (r10 != 0) {
            }
            throw th;
        }
    }
}

package net.lingala.zip4j.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.progress.ProgressMonitor;
/* loaded from: classes.dex */
public class CrcUtil {
    private static final int BUF_SIZE = 16384;

    public static long computeFileCrc(File inputFile, ProgressMonitor progressMonitor) throws IOException {
        if (inputFile == null || !inputFile.exists() || !inputFile.canRead()) {
            throw new ZipException("input file is null or does not exist or cannot read. Cannot calculate CRC for the file");
        }
        byte[] buff = new byte[16384];
        CRC32 crc32 = new CRC32();
        InputStream inputStream = new FileInputStream(inputFile);
        while (true) {
            try {
                int readLen = inputStream.read(buff);
                if (readLen != -1) {
                    crc32.update(buff, 0, readLen);
                    if (progressMonitor != null) {
                        progressMonitor.updateWorkCompleted(readLen);
                        if (progressMonitor.isCancelAllTasks()) {
                            progressMonitor.setResult(ProgressMonitor.Result.CANCELLED);
                            progressMonitor.setState(ProgressMonitor.State.READY);
                            inputStream.close();
                            return 0L;
                        }
                    }
                } else {
                    long value = crc32.getValue();
                    inputStream.close();
                    return value;
                }
            } finally {
            }
        }
    }
}

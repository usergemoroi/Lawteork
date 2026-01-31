package net.lingala.zip4j.p022io.inputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import net.lingala.zip4j.util.FileUtils;
/* renamed from: net.lingala.zip4j.io.inputstream.NumberedSplitInputStream */
/* loaded from: classes.dex */
public class NumberedSplitInputStream extends SplitInputStream {
    public NumberedSplitInputStream(File zipFile, boolean isSplitZipArchive, int lastSplitZipFileNumber) throws FileNotFoundException {
        super(zipFile, isSplitZipArchive, lastSplitZipFileNumber);
    }

    @Override // net.lingala.zip4j.p022io.inputstream.SplitInputStream
    protected File getNextSplitFile(int zipFileIndex) throws IOException {
        String currZipFileNameWithPath = this.zipFile.getCanonicalPath();
        String fileNameWithPathAndWithoutExtension = currZipFileNameWithPath.substring(0, currZipFileNameWithPath.lastIndexOf("."));
        return new File(fileNameWithPathAndWithoutExtension + FileUtils.getNextNumberedSplitFileCounterAsExtension(zipFileIndex));
    }
}

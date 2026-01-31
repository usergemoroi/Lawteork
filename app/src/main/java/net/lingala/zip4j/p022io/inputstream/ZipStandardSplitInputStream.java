package net.lingala.zip4j.p022io.inputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
/* renamed from: net.lingala.zip4j.io.inputstream.ZipStandardSplitInputStream */
/* loaded from: classes.dex */
public class ZipStandardSplitInputStream extends SplitInputStream {
    private int lastSplitZipFileNumber;

    public ZipStandardSplitInputStream(File zipFile, boolean isSplitZipArchive, int lastSplitZipFileNumber) throws FileNotFoundException {
        super(zipFile, isSplitZipArchive, lastSplitZipFileNumber);
        this.lastSplitZipFileNumber = lastSplitZipFileNumber;
    }

    @Override // net.lingala.zip4j.p022io.inputstream.SplitInputStream
    protected File getNextSplitFile(int zipFileIndex) throws IOException {
        if (zipFileIndex == this.lastSplitZipFileNumber) {
            return this.zipFile;
        }
        String currZipFileNameWithPath = this.zipFile.getCanonicalPath();
        String extensionSubString = ".z0";
        if (zipFileIndex >= 9) {
            extensionSubString = ".z";
        }
        return new File(currZipFileNameWithPath.substring(0, currZipFileNameWithPath.lastIndexOf(".")) + extensionSubString + (zipFileIndex + 1));
    }
}

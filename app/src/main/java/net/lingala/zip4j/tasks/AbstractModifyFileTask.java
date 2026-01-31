package net.lingala.zip4j.tasks;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderUtil;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.ZipModel;
import net.lingala.zip4j.progress.ProgressMonitor;
import net.lingala.zip4j.tasks.AsyncZipTask;
import net.lingala.zip4j.util.FileUtils;
import top.niunaijun.blackbox.core.system.user.BUserHandle;
/* loaded from: classes.dex */
abstract class AbstractModifyFileTask<T> extends AsyncZipTask<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractModifyFileTask(AsyncZipTask.AsyncTaskParameters asyncTaskParameters) {
        super(asyncTaskParameters);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File getTemporaryFile(String zipPathWithName) {
        Random random = new Random();
        File tmpFile = new File(zipPathWithName + random.nextInt(BUserHandle.AID_APP_START));
        while (tmpFile.exists()) {
            tmpFile = new File(zipPathWithName + random.nextInt(BUserHandle.AID_APP_START));
        }
        return tmpFile;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateOffsetsForAllSubsequentFileHeaders(List<FileHeader> sortedFileHeaders, ZipModel zipModel, FileHeader fileHeaderModified, long offsetToAdd) throws ZipException {
        int indexOfFileHeader = getIndexOfFileHeader(sortedFileHeaders, fileHeaderModified);
        if (indexOfFileHeader == -1) {
            throw new ZipException("Could not locate modified file header in zipModel");
        }
        for (int i = indexOfFileHeader + 1; i < sortedFileHeaders.size(); i++) {
            FileHeader fileHeaderToUpdate = sortedFileHeaders.get(i);
            fileHeaderToUpdate.setOffsetLocalHeader(fileHeaderToUpdate.getOffsetLocalHeader() + offsetToAdd);
            if (zipModel.isZip64Format() && fileHeaderToUpdate.getZip64ExtendedInfo() != null && fileHeaderToUpdate.getZip64ExtendedInfo().getOffsetLocalHeader() != -1) {
                fileHeaderToUpdate.getZip64ExtendedInfo().setOffsetLocalHeader(fileHeaderToUpdate.getZip64ExtendedInfo().getOffsetLocalHeader() + offsetToAdd);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void cleanupFile(boolean successFlag, File zipFile, File temporaryZipFile) throws ZipException {
        if (successFlag) {
            restoreFileName(zipFile, temporaryZipFile);
        } else if (!temporaryZipFile.delete()) {
            throw new ZipException("Could not delete temporary file");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long copyFile(RandomAccessFile randomAccessFile, OutputStream outputStream, long start, long length, ProgressMonitor progressMonitor, int bufferSize) throws IOException {
        FileUtils.copyFile(randomAccessFile, outputStream, start, start + length, progressMonitor, bufferSize);
        return length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<FileHeader> cloneAndSortFileHeadersByOffset(List<FileHeader> allFileHeaders) {
        List<FileHeader> clonedFileHeaders = new ArrayList<>(allFileHeaders);
        Collections.sort(clonedFileHeaders, new Comparator<FileHeader>() { // from class: net.lingala.zip4j.tasks.AbstractModifyFileTask.1
            @Override // java.util.Comparator
            public int compare(FileHeader o1, FileHeader o2) {
                if (o1.getFileName().equals(o2.getFileName())) {
                    return 0;
                }
                return o1.getOffsetLocalHeader() < o2.getOffsetLocalHeader() ? -1 : 1;
            }
        });
        return clonedFileHeaders;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getOffsetOfNextEntry(List<FileHeader> sortedFileHeaders, FileHeader fileHeader, ZipModel zipModel) throws ZipException {
        int indexOfFileHeader = getIndexOfFileHeader(sortedFileHeaders, fileHeader);
        if (indexOfFileHeader == sortedFileHeaders.size() - 1) {
            return HeaderUtil.getOffsetStartOfCentralDirectory(zipModel);
        }
        return sortedFileHeaders.get(indexOfFileHeader + 1).getOffsetLocalHeader();
    }

    private void restoreFileName(File zipFile, File temporaryZipFile) throws ZipException {
        if (zipFile.delete()) {
            if (!temporaryZipFile.renameTo(zipFile)) {
                throw new ZipException("cannot rename modified zip file");
            }
            return;
        }
        throw new ZipException("cannot delete old zip file");
    }

    private int getIndexOfFileHeader(List<FileHeader> allFileHeaders, FileHeader fileHeaderForIndex) throws ZipException {
        for (int i = 0; i < allFileHeaders.size(); i++) {
            FileHeader fileHeader = allFileHeaders.get(i);
            if (fileHeader.equals(fileHeaderForIndex)) {
                return i;
            }
        }
        throw new ZipException("Could not find file header in list of central directory file headers");
    }
}

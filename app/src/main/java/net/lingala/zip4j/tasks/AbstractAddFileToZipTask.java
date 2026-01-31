package net.lingala.zip4j.tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderUtil;
import net.lingala.zip4j.headers.HeaderWriter;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.Zip4jConfig;
import net.lingala.zip4j.model.ZipModel;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.model.enums.EncryptionMethod;
import net.lingala.zip4j.p022io.outputstream.SplitOutputStream;
import net.lingala.zip4j.p022io.outputstream.ZipOutputStream;
import net.lingala.zip4j.progress.ProgressMonitor;
import net.lingala.zip4j.tasks.AsyncZipTask;
import net.lingala.zip4j.tasks.RemoveFilesFromZipTask;
import net.lingala.zip4j.util.BitUtils;
import net.lingala.zip4j.util.CrcUtil;
import net.lingala.zip4j.util.FileUtils;
import net.lingala.zip4j.util.InternalZipConstants;
import net.lingala.zip4j.util.Zip4jUtil;
/* loaded from: classes.dex */
public abstract class AbstractAddFileToZipTask<T> extends AsyncZipTask<T> {
    private final HeaderWriter headerWriter;
    private final char[] password;
    private final ZipModel zipModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractAddFileToZipTask(ZipModel zipModel, char[] password, HeaderWriter headerWriter, AsyncZipTask.AsyncTaskParameters asyncTaskParameters) {
        super(asyncTaskParameters);
        this.zipModel = zipModel;
        this.password = password;
        this.headerWriter = headerWriter;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addFilesToZip(List<File> filesToAdd, ProgressMonitor progressMonitor, ZipParameters zipParameters, Zip4jConfig zip4jConfig) throws IOException {
        Throwable th;
        ZipOutputStream zipOutputStream;
        FileUtils.assertFilesExist(filesToAdd, zipParameters.getSymbolicLinkAction());
        byte[] readBuff = new byte[zip4jConfig.getBufferSize()];
        List<File> updatedFilesToAdd = removeFilesIfExists(filesToAdd, zipParameters, progressMonitor, zip4jConfig);
        SplitOutputStream splitOutputStream = new SplitOutputStream(this.zipModel.getZipFile(), this.zipModel.getSplitLength());
        try {
            ZipOutputStream zipOutputStream2 = initializeOutputStream(splitOutputStream, zip4jConfig);
            try {
                for (File fileToAdd : updatedFilesToAdd) {
                    verifyIfTaskIsCancelled();
                    ZipParameters clonedZipParameters = cloneAndAdjustZipParameters(zipParameters, fileToAdd, progressMonitor);
                    progressMonitor.setFileName(fileToAdd.getAbsolutePath());
                    try {
                        if (FileUtils.isSymbolicLink(fileToAdd)) {
                            try {
                                if (addSymlink(clonedZipParameters)) {
                                    addSymlinkToZip(fileToAdd, zipOutputStream2, clonedZipParameters, splitOutputStream);
                                    if (ZipParameters.SymbolicLinkAction.INCLUDE_LINK_ONLY.equals(clonedZipParameters.getSymbolicLinkAction())) {
                                        continue;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        addFileToZip(fileToAdd, zipOutputStream2, clonedZipParameters, splitOutputStream, progressMonitor, readBuff);
                        zipOutputStream2 = zipOutputStream;
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                    zipOutputStream = zipOutputStream2;
                }
                ZipOutputStream zipOutputStream3 = zipOutputStream2;
                if (zipOutputStream3 != null) {
                    zipOutputStream3.close();
                }
                splitOutputStream.close();
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                try {
                    splitOutputStream.close();
                } catch (Throwable th7) {
                    th5.addSuppressed(th7);
                }
                throw th6;
            }
        }
    }

    private void addSymlinkToZip(File fileToAdd, ZipOutputStream zipOutputStream, ZipParameters zipParameters, SplitOutputStream splitOutputStream) throws IOException {
        ZipParameters clonedZipParameters = new ZipParameters(zipParameters);
        clonedZipParameters.setFileNameInZip(replaceFileNameInZip(zipParameters.getFileNameInZip(), fileToAdd.getName()));
        clonedZipParameters.setEncryptFiles(false);
        clonedZipParameters.setCompressionMethod(CompressionMethod.STORE);
        zipOutputStream.putNextEntry(clonedZipParameters);
        String symLinkTarget = FileUtils.readSymbolicLink(fileToAdd);
        zipOutputStream.write(symLinkTarget.getBytes());
        closeEntry(zipOutputStream, splitOutputStream, fileToAdd, true);
    }

    private void addFileToZip(File fileToAdd, ZipOutputStream zipOutputStream, ZipParameters zipParameters, SplitOutputStream splitOutputStream, ProgressMonitor progressMonitor, byte[] readBuff) throws IOException {
        zipOutputStream.putNextEntry(zipParameters);
        if (fileToAdd.exists() && !fileToAdd.isDirectory()) {
            InputStream inputStream = new FileInputStream(fileToAdd);
            while (true) {
                try {
                    int readLen = inputStream.read(readBuff);
                    if (readLen == -1) {
                        break;
                    }
                    zipOutputStream.write(readBuff, 0, readLen);
                    progressMonitor.updateWorkCompleted(readLen);
                    verifyIfTaskIsCancelled();
                } finally {
                }
            }
            inputStream.close();
        }
        closeEntry(zipOutputStream, splitOutputStream, fileToAdd, false);
    }

    private void closeEntry(ZipOutputStream zipOutputStream, SplitOutputStream splitOutputStream, File fileToAdd, boolean isSymlink) throws IOException {
        FileHeader fileHeader = zipOutputStream.closeEntry();
        byte[] fileAttributes = FileUtils.getFileAttributes(fileToAdd);
        if (!isSymlink) {
            fileAttributes[3] = BitUtils.unsetBit(fileAttributes[3], 5);
        }
        fileHeader.setExternalFileAttributes(fileAttributes);
        updateLocalFileHeader(fileHeader, splitOutputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long calculateWorkForFiles(List<File> filesToAdd, ZipParameters zipParameters) throws ZipException {
        long totalWork = 0;
        for (File fileToAdd : filesToAdd) {
            if (fileToAdd.exists()) {
                if (zipParameters.isEncryptFiles() && zipParameters.getEncryptionMethod() == EncryptionMethod.ZIP_STANDARD) {
                    totalWork += fileToAdd.length() * 2;
                } else {
                    totalWork += fileToAdd.length();
                }
                String relativeFileName = FileUtils.getRelativeFileName(fileToAdd, zipParameters);
                FileHeader fileHeader = HeaderUtil.getFileHeader(getZipModel(), relativeFileName);
                if (fileHeader != null) {
                    totalWork += getZipModel().getZipFile().length() - fileHeader.getCompressedSize();
                }
            }
        }
        return totalWork;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZipOutputStream initializeOutputStream(SplitOutputStream splitOutputStream, Zip4jConfig zip4jConfig) throws IOException {
        if (this.zipModel.getZipFile().exists()) {
            splitOutputStream.seek(HeaderUtil.getOffsetStartOfCentralDirectory(this.zipModel));
        }
        return new ZipOutputStream(splitOutputStream, this.password, zip4jConfig, this.zipModel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void verifyZipParameters(ZipParameters parameters) throws ZipException {
        if (parameters == null) {
            throw new ZipException("cannot validate zip parameters");
        }
        if (parameters.getCompressionMethod() != CompressionMethod.STORE && parameters.getCompressionMethod() != CompressionMethod.DEFLATE) {
            throw new ZipException("unsupported compression type");
        }
        if (parameters.isEncryptFiles()) {
            if (parameters.getEncryptionMethod() == EncryptionMethod.NONE) {
                throw new ZipException("Encryption method has to be set, when encrypt files flag is set");
            }
            char[] cArr = this.password;
            if (cArr == null || cArr.length <= 0) {
                throw new ZipException("input password is empty or null");
            }
            return;
        }
        parameters.setEncryptionMethod(EncryptionMethod.NONE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateLocalFileHeader(FileHeader fileHeader, SplitOutputStream splitOutputStream) throws IOException {
        this.headerWriter.updateLocalFileHeader(fileHeader, getZipModel(), splitOutputStream);
    }

    private ZipParameters cloneAndAdjustZipParameters(ZipParameters zipParameters, File fileToAdd, ProgressMonitor progressMonitor) throws IOException {
        ZipParameters clonedZipParameters = new ZipParameters(zipParameters);
        clonedZipParameters.setLastModifiedFileTime(Zip4jUtil.epochToExtendedDosTime(fileToAdd.lastModified()));
        if (fileToAdd.isDirectory()) {
            clonedZipParameters.setEntrySize(0L);
        } else {
            clonedZipParameters.setEntrySize(fileToAdd.length());
        }
        clonedZipParameters.setWriteExtendedLocalFileHeader(false);
        clonedZipParameters.setLastModifiedFileTime(fileToAdd.lastModified());
        if (!Zip4jUtil.isStringNotNullAndNotEmpty(zipParameters.getFileNameInZip())) {
            String relativeFileName = FileUtils.getRelativeFileName(fileToAdd, zipParameters);
            clonedZipParameters.setFileNameInZip(relativeFileName);
        }
        if (fileToAdd.isDirectory()) {
            clonedZipParameters.setCompressionMethod(CompressionMethod.STORE);
            clonedZipParameters.setEncryptionMethod(EncryptionMethod.NONE);
            clonedZipParameters.setEncryptFiles(false);
        } else {
            if (clonedZipParameters.isEncryptFiles() && clonedZipParameters.getEncryptionMethod() == EncryptionMethod.ZIP_STANDARD) {
                progressMonitor.setCurrentTask(ProgressMonitor.Task.CALCULATE_CRC);
                clonedZipParameters.setEntryCRC(CrcUtil.computeFileCrc(fileToAdd, progressMonitor));
                progressMonitor.setCurrentTask(ProgressMonitor.Task.ADD_ENTRY);
            }
            if (fileToAdd.length() == 0) {
                clonedZipParameters.setCompressionMethod(CompressionMethod.STORE);
            }
        }
        return clonedZipParameters;
    }

    private List<File> removeFilesIfExists(List<File> files, ZipParameters zipParameters, ProgressMonitor progressMonitor, Zip4jConfig zip4jConfig) throws ZipException {
        List<File> filesToAdd = new ArrayList<>(files);
        if (!this.zipModel.getZipFile().exists()) {
            return filesToAdd;
        }
        for (File file : files) {
            if (!Zip4jUtil.isStringNotNullAndNotEmpty(file.getName())) {
                filesToAdd.remove(file);
            }
            String fileName = FileUtils.getRelativeFileName(file, zipParameters);
            FileHeader fileHeader = HeaderUtil.getFileHeader(this.zipModel, fileName);
            if (fileHeader != null) {
                if (zipParameters.isOverrideExistingFilesInZip()) {
                    progressMonitor.setCurrentTask(ProgressMonitor.Task.REMOVE_ENTRY);
                    removeFile(fileHeader, progressMonitor, zip4jConfig);
                    verifyIfTaskIsCancelled();
                    progressMonitor.setCurrentTask(ProgressMonitor.Task.ADD_ENTRY);
                } else {
                    filesToAdd.remove(file);
                }
            }
        }
        return filesToAdd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeFile(FileHeader fileHeader, ProgressMonitor progressMonitor, Zip4jConfig zip4jConfig) throws ZipException {
        AsyncZipTask.AsyncTaskParameters asyncTaskParameters = new AsyncZipTask.AsyncTaskParameters(null, false, progressMonitor);
        RemoveFilesFromZipTask removeFilesFromZipTask = new RemoveFilesFromZipTask(this.zipModel, this.headerWriter, asyncTaskParameters);
        RemoveFilesFromZipTask.RemoveFilesFromZipTaskParameters parameters = new RemoveFilesFromZipTask.RemoveFilesFromZipTaskParameters(Collections.singletonList(fileHeader.getFileName()), zip4jConfig);
        removeFilesFromZipTask.execute(parameters);
    }

    private String replaceFileNameInZip(String fileInZipWithPath, String newFileName) {
        if (fileInZipWithPath.contains(InternalZipConstants.ZIP_FILE_SEPARATOR)) {
            return fileInZipWithPath.substring(0, fileInZipWithPath.lastIndexOf(InternalZipConstants.ZIP_FILE_SEPARATOR) + 1) + newFileName;
        }
        return newFileName;
    }

    private boolean addSymlink(ZipParameters zipParameters) {
        return ZipParameters.SymbolicLinkAction.INCLUDE_LINK_ONLY.equals(zipParameters.getSymbolicLinkAction()) || ZipParameters.SymbolicLinkAction.INCLUDE_LINK_AND_LINKED_FILE.equals(zipParameters.getSymbolicLinkAction());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public ProgressMonitor.Task getTask() {
        return ProgressMonitor.Task.ADD_ENTRY;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ZipModel getZipModel() {
        return this.zipModel;
    }
}

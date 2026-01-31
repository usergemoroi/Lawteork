package net.lingala.zip4j.tasks;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderUtil;
import net.lingala.zip4j.headers.HeaderWriter;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.Zip4jConfig;
import net.lingala.zip4j.model.ZipModel;
import net.lingala.zip4j.model.enums.RandomAccessFileMode;
import net.lingala.zip4j.p022io.outputstream.SplitOutputStream;
import net.lingala.zip4j.progress.ProgressMonitor;
import net.lingala.zip4j.tasks.AsyncZipTask;
import net.lingala.zip4j.util.InternalZipConstants;
import net.lingala.zip4j.util.RawIO;
import net.lingala.zip4j.util.Zip4jUtil;
/* loaded from: classes.dex */
public class RenameFilesTask extends AbstractModifyFileTask<RenameFilesTaskParameters> {
    private final HeaderWriter headerWriter;
    private final RawIO rawIO;
    private final ZipModel zipModel;

    public RenameFilesTask(ZipModel zipModel, HeaderWriter headerWriter, RawIO rawIO, AsyncZipTask.AsyncTaskParameters asyncTaskParameters) {
        super(asyncTaskParameters);
        this.zipModel = zipModel;
        this.headerWriter = headerWriter;
        this.rawIO = rawIO;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public void executeTask(RenameFilesTaskParameters taskParameters, ProgressMonitor progressMonitor) throws IOException {
        File temporaryFile;
        boolean successFlag;
        Throwable th;
        SplitOutputStream outputStream;
        Throwable th2;
        List<FileHeader> sortedFileHeaders;
        Charset charset;
        SplitOutputStream outputStream2;
        File temporaryFile2;
        Map<String, String> fileNamesMap;
        RenameFilesTaskParameters renameFilesTaskParameters = taskParameters;
        Map<String, String> fileNamesMap2 = filterNonExistingEntriesAndAddSeparatorIfNeeded(taskParameters.fileNamesMap);
        if (fileNamesMap2.size() == 0) {
            return;
        }
        File temporaryFile3 = getTemporaryFile(this.zipModel.getZipFile().getPath());
        try {
            RandomAccessFile inputStream = new RandomAccessFile(this.zipModel.getZipFile(), RandomAccessFileMode.WRITE.getValue());
            try {
                SplitOutputStream outputStream3 = new SplitOutputStream(temporaryFile3);
                try {
                    Charset charset2 = renameFilesTaskParameters.zip4jConfig.getCharset();
                    List<FileHeader> sortedFileHeaders2 = cloneAndSortFileHeadersByOffset(this.zipModel.getCentralDirectory().getFileHeaders());
                    long currentFileCopyPointer = 0;
                    for (FileHeader fileHeader : sortedFileHeaders2) {
                        try {
                            Map.Entry<String, String> fileNameMapForThisEntry = getCorrespondingEntryFromMap(fileHeader, fileNamesMap2);
                            progressMonitor.setFileName(fileHeader.getFileName());
                            long lengthToCopy = getOffsetOfNextEntry(sortedFileHeaders2, fileHeader, this.zipModel) - outputStream3.getFilePointer();
                            if (fileNameMapForThisEntry == null) {
                                try {
                                    sortedFileHeaders = sortedFileHeaders2;
                                    currentFileCopyPointer += copyFile(inputStream, outputStream3, currentFileCopyPointer, lengthToCopy, progressMonitor, renameFilesTaskParameters.zip4jConfig.getBufferSize());
                                    charset = charset2;
                                    outputStream2 = outputStream3;
                                    temporaryFile2 = temporaryFile3;
                                    fileNamesMap = fileNamesMap2;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    outputStream = outputStream3;
                                    try {
                                        throw th2;
                                    } catch (Throwable th4) {
                                        try {
                                            outputStream.close();
                                            throw th4;
                                        }
                                    }
                                }
                            } else {
                                sortedFileHeaders = sortedFileHeaders2;
                                String newFileName = getNewFileName(fileNameMapForThisEntry.getValue(), fileNameMapForThisEntry.getKey(), fileHeader.getFileName());
                                byte[] newFileNameBytes = HeaderUtil.getBytesFromString(newFileName, charset2);
                                int headersOffset = newFileNameBytes.length - fileHeader.getFileNameLength();
                                int bufferSize = renameFilesTaskParameters.zip4jConfig.getBufferSize();
                                charset = charset2;
                                outputStream2 = outputStream3;
                                temporaryFile2 = temporaryFile3;
                                fileNamesMap = fileNamesMap2;
                                try {
                                    long currentFileCopyPointer2 = copyEntryAndChangeFileName(newFileNameBytes, fileHeader, currentFileCopyPointer, lengthToCopy, inputStream, outputStream3, progressMonitor, bufferSize);
                                    updateHeadersInZipModel(sortedFileHeaders, fileHeader, newFileName, newFileNameBytes, headersOffset);
                                    currentFileCopyPointer = currentFileCopyPointer2;
                                } catch (Throwable th5) {
                                    th2 = th5;
                                    outputStream = outputStream2;
                                    throw th2;
                                }
                            }
                            verifyIfTaskIsCancelled();
                            charset2 = charset;
                            sortedFileHeaders2 = sortedFileHeaders;
                            outputStream3 = outputStream2;
                            temporaryFile3 = temporaryFile2;
                            fileNamesMap2 = fileNamesMap;
                            renameFilesTaskParameters = taskParameters;
                        } catch (Throwable th6) {
                            th2 = th6;
                            outputStream = outputStream3;
                        }
                    }
                    SplitOutputStream outputStream4 = outputStream3;
                    File temporaryFile4 = temporaryFile3;
                    try {
                        outputStream = outputStream4;
                        try {
                            this.headerWriter.finalizeZipFile(this.zipModel, outputStream, charset2);
                            successFlag = true;
                            try {
                                outputStream.close();
                                try {
                                    inputStream.close();
                                    cleanupFile(true, this.zipModel.getZipFile(), temporaryFile4);
                                } catch (Throwable th7) {
                                    th = th7;
                                    temporaryFile = temporaryFile4;
                                    cleanupFile(successFlag, this.zipModel.getZipFile(), temporaryFile);
                                    throw th;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                try {
                                    throw th;
                                } catch (Throwable th9) {
                                    try {
                                        inputStream.close();
                                        throw th9;
                                    }
                                }
                            }
                        } catch (Throwable th10) {
                            th2 = th10;
                            throw th2;
                        }
                    } catch (Throwable th11) {
                        outputStream = outputStream4;
                        th2 = th11;
                    }
                } catch (Throwable th12) {
                    outputStream = outputStream3;
                    th2 = th12;
                }
            } catch (Throwable th13) {
                th = th13;
            }
        } catch (Throwable th14) {
            th = th14;
            temporaryFile = temporaryFile3;
            successFlag = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public long calculateTotalWork(RenameFilesTaskParameters taskParameters) {
        return this.zipModel.getZipFile().length();
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    protected ProgressMonitor.Task getTask() {
        return ProgressMonitor.Task.RENAME_FILE;
    }

    private long copyEntryAndChangeFileName(byte[] newFileNameBytes, FileHeader fileHeader, long start, long totalLengthOfEntry, RandomAccessFile inputStream, OutputStream outputStream, ProgressMonitor progressMonitor, int bufferSize) throws IOException {
        long currentFileCopyPointer = start + copyFile(inputStream, outputStream, start, 26L, progressMonitor, bufferSize);
        this.rawIO.writeShortLittleEndian(outputStream, newFileNameBytes.length);
        long currentFileCopyPointer2 = currentFileCopyPointer + 2;
        outputStream.write(newFileNameBytes);
        long currentFileCopyPointer3 = currentFileCopyPointer2 + copyFile(inputStream, outputStream, currentFileCopyPointer2, 2L, progressMonitor, bufferSize) + fileHeader.getFileNameLength();
        long remainingLengthToCopy = totalLengthOfEntry - (currentFileCopyPointer3 - start);
        return currentFileCopyPointer3 + copyFile(inputStream, outputStream, currentFileCopyPointer3, remainingLengthToCopy, progressMonitor, bufferSize);
    }

    private Map.Entry<String, String> getCorrespondingEntryFromMap(FileHeader fileHeaderToBeChecked, Map<String, String> fileNamesMap) {
        for (Map.Entry<String, String> fileHeaderToBeRenamed : fileNamesMap.entrySet()) {
            if (fileHeaderToBeChecked.getFileName().startsWith(fileHeaderToBeRenamed.getKey())) {
                return fileHeaderToBeRenamed;
            }
        }
        return null;
    }

    private void updateHeadersInZipModel(List<FileHeader> sortedFileHeaders, FileHeader fileHeader, String newFileName, byte[] newFileNameBytes, int headersOffset) throws ZipException {
        FileHeader fileHeaderToBeChanged = HeaderUtil.getFileHeader(this.zipModel, fileHeader.getFileName());
        if (fileHeaderToBeChanged == null) {
            throw new ZipException("could not find any header with name: " + fileHeader.getFileName());
        }
        fileHeaderToBeChanged.setFileName(newFileName);
        fileHeaderToBeChanged.setFileNameLength(newFileNameBytes.length);
        updateOffsetsForAllSubsequentFileHeaders(sortedFileHeaders, this.zipModel, fileHeaderToBeChanged, headersOffset);
        this.zipModel.getEndOfCentralDirectoryRecord().setOffsetOfStartOfCentralDirectory(this.zipModel.getEndOfCentralDirectoryRecord().getOffsetOfStartOfCentralDirectory() + headersOffset);
        if (this.zipModel.isZip64Format()) {
            this.zipModel.getZip64EndOfCentralDirectoryRecord().setOffsetStartCentralDirectoryWRTStartDiskNumber(this.zipModel.getZip64EndOfCentralDirectoryRecord().getOffsetStartCentralDirectoryWRTStartDiskNumber() + headersOffset);
            this.zipModel.getZip64EndOfCentralDirectoryLocator().setOffsetZip64EndOfCentralDirectoryRecord(this.zipModel.getZip64EndOfCentralDirectoryLocator().getOffsetZip64EndOfCentralDirectoryRecord() + headersOffset);
        }
    }

    private Map<String, String> filterNonExistingEntriesAndAddSeparatorIfNeeded(Map<String, String> inputFileNamesMap) throws ZipException {
        FileHeader fileHeaderToBeChanged;
        Map<String, String> fileNamesMapToBeChanged = new HashMap<>();
        for (Map.Entry<String, String> allNamesToBeChanged : inputFileNamesMap.entrySet()) {
            if (Zip4jUtil.isStringNotNullAndNotEmpty(allNamesToBeChanged.getKey()) && (fileHeaderToBeChanged = HeaderUtil.getFileHeader(this.zipModel, allNamesToBeChanged.getKey())) != null) {
                if (fileHeaderToBeChanged.isDirectory() && !allNamesToBeChanged.getValue().endsWith(InternalZipConstants.ZIP_FILE_SEPARATOR)) {
                    fileNamesMapToBeChanged.put(allNamesToBeChanged.getKey(), allNamesToBeChanged.getValue() + InternalZipConstants.ZIP_FILE_SEPARATOR);
                } else {
                    fileNamesMapToBeChanged.put(allNamesToBeChanged.getKey(), allNamesToBeChanged.getValue());
                }
            }
        }
        return fileNamesMapToBeChanged;
    }

    private String getNewFileName(String newFileName, String oldFileName, String fileNameFromHeaderToBeChanged) throws ZipException {
        if (fileNameFromHeaderToBeChanged.equals(oldFileName)) {
            return newFileName;
        }
        if (fileNameFromHeaderToBeChanged.startsWith(oldFileName)) {
            String fileNameWithoutOldName = fileNameFromHeaderToBeChanged.substring(oldFileName.length());
            return newFileName + fileNameWithoutOldName;
        }
        throw new ZipException("old file name was neither an exact match nor a partial match");
    }

    /* loaded from: classes.dex */
    public static class RenameFilesTaskParameters extends AbstractZipTaskParameters {
        private final Map<String, String> fileNamesMap;

        public RenameFilesTaskParameters(Map<String, String> fileNamesMap, Zip4jConfig zip4jConfig) {
            super(zip4jConfig);
            this.fileNamesMap = fileNamesMap;
        }
    }
}

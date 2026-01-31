package net.lingala.zip4j.tasks;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderUtil;
import net.lingala.zip4j.headers.HeaderWriter;
import net.lingala.zip4j.model.EndOfCentralDirectoryRecord;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.Zip4jConfig;
import net.lingala.zip4j.model.ZipModel;
import net.lingala.zip4j.model.enums.RandomAccessFileMode;
import net.lingala.zip4j.p022io.outputstream.SplitOutputStream;
import net.lingala.zip4j.progress.ProgressMonitor;
import net.lingala.zip4j.tasks.AsyncZipTask;
import net.lingala.zip4j.util.InternalZipConstants;
/* loaded from: classes.dex */
public class RemoveFilesFromZipTask extends AbstractModifyFileTask<RemoveFilesFromZipTaskParameters> {
    private final HeaderWriter headerWriter;
    private final ZipModel zipModel;

    public RemoveFilesFromZipTask(ZipModel zipModel, HeaderWriter headerWriter, AsyncZipTask.AsyncTaskParameters asyncTaskParameters) {
        super(asyncTaskParameters);
        this.zipModel = zipModel;
        this.headerWriter = headerWriter;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public void executeTask(RemoveFilesFromZipTaskParameters taskParameters, ProgressMonitor progressMonitor) throws IOException {
        List<FileHeader> sortedFileHeaders;
        if (!this.zipModel.isSplitArchive()) {
            List<String> entriesToRemove = filterNonExistingEntries(taskParameters.filesToRemove);
            if (!entriesToRemove.isEmpty()) {
                File temporaryZipFile = getTemporaryFile(this.zipModel.getZipFile().getPath());
                boolean successFlag = false;
                try {
                    SplitOutputStream outputStream = new SplitOutputStream(temporaryZipFile);
                    RandomAccessFile inputStream = new RandomAccessFile(this.zipModel.getZipFile(), RandomAccessFileMode.READ.getValue());
                    try {
                        List<FileHeader> sortedFileHeaders2 = cloneAndSortFileHeadersByOffset(this.zipModel.getCentralDirectory().getFileHeaders());
                        long currentFileCopyPointer = 0;
                        for (FileHeader fileHeader : sortedFileHeaders2) {
                            long lengthOfCurrentEntry = getOffsetOfNextEntry(sortedFileHeaders2, fileHeader, this.zipModel) - outputStream.getFilePointer();
                            if (shouldEntryBeRemoved(fileHeader, entriesToRemove)) {
                                updateHeaders(sortedFileHeaders2, fileHeader, lengthOfCurrentEntry);
                                if (!this.zipModel.getCentralDirectory().getFileHeaders().remove(fileHeader)) {
                                    throw new ZipException("Could not remove entry from list of central directory headers");
                                }
                                currentFileCopyPointer += lengthOfCurrentEntry;
                                sortedFileHeaders = sortedFileHeaders2;
                            } else {
                                sortedFileHeaders = sortedFileHeaders2;
                                currentFileCopyPointer += super.copyFile(inputStream, outputStream, currentFileCopyPointer, lengthOfCurrentEntry, progressMonitor, taskParameters.zip4jConfig.getBufferSize());
                            }
                            verifyIfTaskIsCancelled();
                            sortedFileHeaders2 = sortedFileHeaders;
                        }
                        this.headerWriter.finalizeZipFile(this.zipModel, outputStream, taskParameters.zip4jConfig.getCharset());
                        successFlag = true;
                        inputStream.close();
                        outputStream.close();
                    } finally {
                    }
                } finally {
                    cleanupFile(successFlag, this.zipModel.getZipFile(), temporaryZipFile);
                }
            }
        } else {
            throw new ZipException("This is a split archive. Zip file format does not allow updating split/spanned files");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public long calculateTotalWork(RemoveFilesFromZipTaskParameters taskParameters) {
        return this.zipModel.getZipFile().length();
    }

    private List<String> filterNonExistingEntries(List<String> filesToRemove) throws ZipException {
        List<String> filteredFilesToRemove = new ArrayList<>();
        for (String fileToRemove : filesToRemove) {
            if (HeaderUtil.getFileHeader(this.zipModel, fileToRemove) != null) {
                filteredFilesToRemove.add(fileToRemove);
            }
        }
        return filteredFilesToRemove;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean shouldEntryBeRemoved(FileHeader fileHeaderToBeChecked, List<String> fileNamesToBeRemoved) {
        for (String fileNameToBeRemoved : fileNamesToBeRemoved) {
            if ((fileNameToBeRemoved.endsWith(InternalZipConstants.ZIP_FILE_SEPARATOR) && fileHeaderToBeChecked.getFileName().startsWith(fileNameToBeRemoved)) || fileHeaderToBeChecked.getFileName().equals(fileNameToBeRemoved)) {
                return true;
            }
            while (r0.hasNext()) {
            }
        }
        return false;
    }

    private void updateHeaders(List<FileHeader> sortedFileHeaders, FileHeader fileHeaderThatWasRemoved, long offsetToSubtract) throws ZipException {
        updateOffsetsForAllSubsequentFileHeaders(sortedFileHeaders, this.zipModel, fileHeaderThatWasRemoved, negate(offsetToSubtract));
        EndOfCentralDirectoryRecord endOfCentralDirectoryRecord = this.zipModel.getEndOfCentralDirectoryRecord();
        endOfCentralDirectoryRecord.setOffsetOfStartOfCentralDirectory(endOfCentralDirectoryRecord.getOffsetOfStartOfCentralDirectory() - offsetToSubtract);
        endOfCentralDirectoryRecord.setTotalNumberOfEntriesInCentralDirectory(endOfCentralDirectoryRecord.getTotalNumberOfEntriesInCentralDirectory() - 1);
        if (endOfCentralDirectoryRecord.getTotalNumberOfEntriesInCentralDirectoryOnThisDisk() > 0) {
            endOfCentralDirectoryRecord.setTotalNumberOfEntriesInCentralDirectoryOnThisDisk(endOfCentralDirectoryRecord.getTotalNumberOfEntriesInCentralDirectoryOnThisDisk() - 1);
        }
        if (this.zipModel.isZip64Format()) {
            this.zipModel.getZip64EndOfCentralDirectoryRecord().setOffsetStartCentralDirectoryWRTStartDiskNumber(this.zipModel.getZip64EndOfCentralDirectoryRecord().getOffsetStartCentralDirectoryWRTStartDiskNumber() - offsetToSubtract);
            this.zipModel.getZip64EndOfCentralDirectoryRecord().setTotalNumberOfEntriesInCentralDirectoryOnThisDisk(this.zipModel.getZip64EndOfCentralDirectoryRecord().getTotalNumberOfEntriesInCentralDirectory() - 1);
            this.zipModel.getZip64EndOfCentralDirectoryLocator().setOffsetZip64EndOfCentralDirectoryRecord(this.zipModel.getZip64EndOfCentralDirectoryLocator().getOffsetZip64EndOfCentralDirectoryRecord() - offsetToSubtract);
        }
    }

    private long negate(long val) {
        if (val == Long.MIN_VALUE) {
            throw new ArithmeticException("long overflow");
        }
        return -val;
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    protected ProgressMonitor.Task getTask() {
        return ProgressMonitor.Task.REMOVE_ENTRY;
    }

    /* loaded from: classes.dex */
    public static class RemoveFilesFromZipTaskParameters extends AbstractZipTaskParameters {
        private final List<String> filesToRemove;

        public RemoveFilesFromZipTaskParameters(List<String> filesToRemove, Zip4jConfig zip4jConfig) {
            super(zip4jConfig);
            this.filesToRemove = filesToRemove;
        }
    }
}

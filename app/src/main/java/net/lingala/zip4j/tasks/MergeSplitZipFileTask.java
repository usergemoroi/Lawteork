package net.lingala.zip4j.tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.List;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderSignature;
import net.lingala.zip4j.headers.HeaderWriter;
import net.lingala.zip4j.model.EndOfCentralDirectoryRecord;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.Zip4jConfig;
import net.lingala.zip4j.model.Zip64EndOfCentralDirectoryLocator;
import net.lingala.zip4j.model.Zip64EndOfCentralDirectoryRecord;
import net.lingala.zip4j.model.ZipModel;
import net.lingala.zip4j.model.enums.RandomAccessFileMode;
import net.lingala.zip4j.progress.ProgressMonitor;
import net.lingala.zip4j.tasks.AsyncZipTask;
import net.lingala.zip4j.util.FileUtils;
import net.lingala.zip4j.util.RawIO;
/* loaded from: classes.dex */
public class MergeSplitZipFileTask extends AsyncZipTask<MergeSplitZipFileTaskParameters> {
    private final RawIO rawIO;
    private final ZipModel zipModel;

    public MergeSplitZipFileTask(ZipModel zipModel, AsyncZipTask.AsyncTaskParameters asyncTaskParameters) {
        super(asyncTaskParameters);
        this.rawIO = new RawIO();
        this.zipModel = zipModel;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0 A[Catch: all -> 0x00ff, TRY_ENTER, TRY_LEAVE, TryCatch #10 {CloneNotSupportedException -> 0x010e, blocks: (B:4:0x000c, B:56:0x00f0, B:6:0x0017, B:10:0x002c, B:37:0x00b0, B:54:0x00da, B:53:0x00d7, B:55:0x00db, B:59:0x00f6, B:60:0x00fe), top: B:89:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00b3 A[SYNTHETIC] */
    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void executeTask(MergeSplitZipFileTaskParameters taskParameters, ProgressMonitor progressMonitor) throws IOException {
        RandomAccessFile randomAccessFile;
        Throwable th;
        int splitSignatureOverhead;
        long end;
        if (!this.zipModel.isSplitArchive()) {
            ZipException e = new ZipException("archive not a split zip file");
            progressMonitor.endProgressMonitor(e);
            throw e;
        }
        try {
            OutputStream outputStream = new FileOutputStream(taskParameters.outputZipFile);
            int totalNumberOfSplitFiles = this.zipModel.getEndOfCentralDirectoryRecord().getNumberOfThisDisk();
            if (totalNumberOfSplitFiles <= 0) {
                throw new ZipException("zip archive not a split zip file");
            }
            long totalBytesWritten = 0;
            int splitSignatureOverhead2 = 0;
            int i = 0;
            while (i <= totalNumberOfSplitFiles) {
                RandomAccessFile randomAccessFile2 = createSplitZipFileStream(this.zipModel, i);
                int start = 0;
                try {
                    long end2 = randomAccessFile2.length();
                    try {
                        try {
                            if (i == 0) {
                                try {
                                    if (this.rawIO.readIntLittleEndian(randomAccessFile2) == HeaderSignature.SPLIT_ZIP.getValue()) {
                                        start = 4;
                                        splitSignatureOverhead = 4;
                                        if (i != totalNumberOfSplitFiles) {
                                            try {
                                                long end3 = this.zipModel.getEndOfCentralDirectoryRecord().getOffsetOfStartOfCentralDirectory();
                                                end = end3;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                randomAccessFile = randomAccessFile2;
                                                try {
                                                    throw th;
                                                } catch (Throwable th3) {
                                                    if (randomAccessFile != null) {
                                                        try {
                                                            randomAccessFile.close();
                                                        } catch (Throwable th4) {
                                                            th.addSuppressed(th4);
                                                        }
                                                    }
                                                    throw th3;
                                                }
                                            }
                                        } else {
                                            end = end2;
                                        }
                                        FileUtils.copyFile(randomAccessFile2, outputStream, start, end, progressMonitor, taskParameters.zip4jConfig.getBufferSize());
                                        totalBytesWritten += end - start;
                                        randomAccessFile = randomAccessFile2;
                                        int i2 = i;
                                        int totalNumberOfSplitFiles2 = totalNumberOfSplitFiles;
                                        updateFileHeaderOffsetsForIndex(this.zipModel.getCentralDirectory().getFileHeaders(), i != 0 ? 0L : totalBytesWritten, i, splitSignatureOverhead);
                                        verifyIfTaskIsCancelled();
                                        if (randomAccessFile == null) {
                                            randomAccessFile.close();
                                        }
                                        i = i2 + 1;
                                        totalNumberOfSplitFiles = totalNumberOfSplitFiles2;
                                        splitSignatureOverhead2 = splitSignatureOverhead;
                                    } else {
                                        randomAccessFile2.seek(0L);
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    randomAccessFile = randomAccessFile2;
                                    throw th;
                                }
                            }
                            updateFileHeaderOffsetsForIndex(this.zipModel.getCentralDirectory().getFileHeaders(), i != 0 ? 0L : totalBytesWritten, i, splitSignatureOverhead);
                            verifyIfTaskIsCancelled();
                            if (randomAccessFile == null) {
                            }
                            i = i2 + 1;
                            totalNumberOfSplitFiles = totalNumberOfSplitFiles2;
                            splitSignatureOverhead2 = splitSignatureOverhead;
                        } catch (Throwable th6) {
                            th = th6;
                            throw th;
                        }
                        FileUtils.copyFile(randomAccessFile2, outputStream, start, end, progressMonitor, taskParameters.zip4jConfig.getBufferSize());
                        totalBytesWritten += end - start;
                        randomAccessFile = randomAccessFile2;
                        int i22 = i;
                        int totalNumberOfSplitFiles22 = totalNumberOfSplitFiles;
                    } catch (Throwable th7) {
                        randomAccessFile = randomAccessFile2;
                        th = th7;
                    }
                    splitSignatureOverhead = splitSignatureOverhead2;
                    if (i != totalNumberOfSplitFiles) {
                    }
                } catch (Throwable th8) {
                    randomAccessFile = randomAccessFile2;
                    th = th8;
                }
            }
            updateHeadersForMergeSplitFileAction(this.zipModel, totalBytesWritten, outputStream, taskParameters.zip4jConfig.getCharset());
            progressMonitor.endProgressMonitor();
            outputStream.close();
        } catch (CloneNotSupportedException e2) {
            throw new ZipException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public long calculateTotalWork(MergeSplitZipFileTaskParameters taskParameters) {
        if (!this.zipModel.isSplitArchive()) {
            return 0L;
        }
        long totalSize = 0;
        for (int i = 0; i <= this.zipModel.getEndOfCentralDirectoryRecord().getNumberOfThisDisk(); i++) {
            totalSize += getNextSplitZipFile(this.zipModel, i).length();
        }
        return totalSize;
    }

    private void updateFileHeaderOffsetsForIndex(List<FileHeader> fileHeaders, long offsetToAdd, int index, int splitSignatureOverhead) {
        for (FileHeader fileHeader : fileHeaders) {
            if (fileHeader.getDiskNumberStart() == index) {
                fileHeader.setOffsetLocalHeader((fileHeader.getOffsetLocalHeader() + offsetToAdd) - splitSignatureOverhead);
                fileHeader.setDiskNumberStart(0);
            }
        }
    }

    private File getNextSplitZipFile(ZipModel zipModel, int partNumber) {
        if (partNumber == zipModel.getEndOfCentralDirectoryRecord().getNumberOfThisDisk()) {
            return zipModel.getZipFile();
        }
        String splitZipExtension = ".z0";
        if (partNumber >= 9) {
            splitZipExtension = ".z";
        }
        String rootZipFile = zipModel.getZipFile().getPath();
        String nextSplitZipFileName = zipModel.getZipFile().getPath().substring(0, rootZipFile.lastIndexOf(".")) + splitZipExtension + (partNumber + 1);
        return new File(nextSplitZipFileName);
    }

    private RandomAccessFile createSplitZipFileStream(ZipModel zipModel, int partNumber) throws FileNotFoundException {
        File splitFile = getNextSplitZipFile(zipModel, partNumber);
        return new RandomAccessFile(splitFile, RandomAccessFileMode.READ.getValue());
    }

    private void updateHeadersForMergeSplitFileAction(ZipModel zipModel, long totalBytesWritten, OutputStream outputStream, Charset charset) throws IOException, CloneNotSupportedException {
        ZipModel newZipModel = (ZipModel) zipModel.clone();
        newZipModel.getEndOfCentralDirectoryRecord().setOffsetOfStartOfCentralDirectory(totalBytesWritten);
        updateSplitZipModel(newZipModel, totalBytesWritten);
        HeaderWriter headerWriter = new HeaderWriter();
        headerWriter.finalizeZipFileWithoutValidations(newZipModel, outputStream, charset);
    }

    private void updateSplitZipModel(ZipModel zipModel, long totalFileSize) {
        zipModel.setSplitArchive(false);
        updateSplitEndCentralDirectory(zipModel);
        if (zipModel.isZip64Format()) {
            updateSplitZip64EndCentralDirLocator(zipModel, totalFileSize);
            updateSplitZip64EndCentralDirRec(zipModel, totalFileSize);
        }
    }

    private void updateSplitEndCentralDirectory(ZipModel zipModel) {
        int numberOfFileHeaders = zipModel.getCentralDirectory().getFileHeaders().size();
        EndOfCentralDirectoryRecord endOfCentralDirectoryRecord = zipModel.getEndOfCentralDirectoryRecord();
        endOfCentralDirectoryRecord.setNumberOfThisDisk(0);
        endOfCentralDirectoryRecord.setNumberOfThisDiskStartOfCentralDir(0);
        endOfCentralDirectoryRecord.setTotalNumberOfEntriesInCentralDirectory(numberOfFileHeaders);
        endOfCentralDirectoryRecord.setTotalNumberOfEntriesInCentralDirectoryOnThisDisk(numberOfFileHeaders);
    }

    private void updateSplitZip64EndCentralDirLocator(ZipModel zipModel, long totalFileSize) {
        if (zipModel.getZip64EndOfCentralDirectoryLocator() == null) {
            return;
        }
        Zip64EndOfCentralDirectoryLocator zip64EndOfCentralDirectoryLocator = zipModel.getZip64EndOfCentralDirectoryLocator();
        zip64EndOfCentralDirectoryLocator.setNumberOfDiskStartOfZip64EndOfCentralDirectoryRecord(0);
        zip64EndOfCentralDirectoryLocator.setOffsetZip64EndOfCentralDirectoryRecord(zip64EndOfCentralDirectoryLocator.getOffsetZip64EndOfCentralDirectoryRecord() + totalFileSize);
        zip64EndOfCentralDirectoryLocator.setTotalNumberOfDiscs(1);
    }

    private void updateSplitZip64EndCentralDirRec(ZipModel zipModel, long totalFileSize) {
        if (zipModel.getZip64EndOfCentralDirectoryRecord() == null) {
            return;
        }
        Zip64EndOfCentralDirectoryRecord zip64EndOfCentralDirectoryRecord = zipModel.getZip64EndOfCentralDirectoryRecord();
        zip64EndOfCentralDirectoryRecord.setNumberOfThisDisk(0);
        zip64EndOfCentralDirectoryRecord.setNumberOfThisDiskStartOfCentralDirectory(0);
        zip64EndOfCentralDirectoryRecord.setTotalNumberOfEntriesInCentralDirectoryOnThisDisk(zipModel.getEndOfCentralDirectoryRecord().getTotalNumberOfEntriesInCentralDirectory());
        zip64EndOfCentralDirectoryRecord.setOffsetStartCentralDirectoryWRTStartDiskNumber(zip64EndOfCentralDirectoryRecord.getOffsetStartCentralDirectoryWRTStartDiskNumber() + totalFileSize);
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    protected ProgressMonitor.Task getTask() {
        return ProgressMonitor.Task.MERGE_ZIP_FILES;
    }

    /* loaded from: classes.dex */
    public static class MergeSplitZipFileTaskParameters extends AbstractZipTaskParameters {
        private File outputZipFile;

        public MergeSplitZipFileTaskParameters(File outputZipFile, Zip4jConfig zip4jConfig) {
            super(zip4jConfig);
            this.outputZipFile = outputZipFile;
        }
    }
}

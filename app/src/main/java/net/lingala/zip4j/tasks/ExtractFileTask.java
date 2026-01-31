package net.lingala.zip4j.tasks;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import net.lingala.zip4j.headers.HeaderUtil;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.UnzipParameters;
import net.lingala.zip4j.model.Zip4jConfig;
import net.lingala.zip4j.model.ZipModel;
import net.lingala.zip4j.p022io.inputstream.SplitInputStream;
import net.lingala.zip4j.p022io.inputstream.ZipInputStream;
import net.lingala.zip4j.progress.ProgressMonitor;
import net.lingala.zip4j.tasks.AsyncZipTask;
import net.lingala.zip4j.util.InternalZipConstants;
import net.lingala.zip4j.util.UnzipUtil;
import net.lingala.zip4j.util.Zip4jUtil;
/* loaded from: classes.dex */
public class ExtractFileTask extends AbstractExtractFileTask<ExtractFileTaskParameters> {
    private char[] password;
    private SplitInputStream splitInputStream;

    public ExtractFileTask(ZipModel zipModel, char[] password, UnzipParameters unzipParameters, AsyncZipTask.AsyncTaskParameters asyncTaskParameters) {
        super(zipModel, unzipParameters, asyncTaskParameters);
        this.password = password;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public void executeTask(ExtractFileTaskParameters taskParameters, ProgressMonitor progressMonitor) throws IOException {
        try {
            ZipInputStream zipInputStream = createZipInputStream(taskParameters.fileHeader, taskParameters.zip4jConfig);
            List<FileHeader> fileHeadersUnderDirectory = getFileHeadersToExtract(taskParameters.fileHeader);
            byte[] readBuff = new byte[taskParameters.zip4jConfig.getBufferSize()];
            for (FileHeader fileHeader : fileHeadersUnderDirectory) {
                String newFileName = determineNewFileName(taskParameters.newFileName, taskParameters.fileHeader, fileHeader);
                extractFile(zipInputStream, fileHeader, taskParameters.outputPath, newFileName, progressMonitor, readBuff);
            }
            if (zipInputStream != null) {
                zipInputStream.close();
            }
        } finally {
            SplitInputStream splitInputStream = this.splitInputStream;
            if (splitInputStream != null) {
                splitInputStream.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public long calculateTotalWork(ExtractFileTaskParameters taskParameters) {
        List<FileHeader> fileHeadersUnderDirectory = getFileHeadersToExtract(taskParameters.fileHeader);
        return HeaderUtil.getTotalUncompressedSizeOfAllFileHeaders(fileHeadersUnderDirectory);
    }

    private List<FileHeader> getFileHeadersToExtract(FileHeader rootFileHeader) {
        if (!rootFileHeader.isDirectory()) {
            return Collections.singletonList(rootFileHeader);
        }
        return HeaderUtil.getFileHeadersUnderDirectory(getZipModel().getCentralDirectory().getFileHeaders(), rootFileHeader);
    }

    private ZipInputStream createZipInputStream(FileHeader fileHeader, Zip4jConfig zip4jConfig) throws IOException {
        SplitInputStream createSplitInputStream = UnzipUtil.createSplitInputStream(getZipModel());
        this.splitInputStream = createSplitInputStream;
        createSplitInputStream.prepareExtractionForFileHeader(fileHeader);
        return new ZipInputStream(this.splitInputStream, this.password, zip4jConfig);
    }

    private String determineNewFileName(String newFileName, FileHeader fileHeaderToExtract, FileHeader fileHeaderBeingExtracted) {
        if (!Zip4jUtil.isStringNotNullAndNotEmpty(newFileName)) {
            return newFileName;
        }
        if (!fileHeaderToExtract.isDirectory()) {
            return newFileName;
        }
        String fileSeparator = InternalZipConstants.ZIP_FILE_SEPARATOR;
        if (newFileName.endsWith(InternalZipConstants.ZIP_FILE_SEPARATOR)) {
            fileSeparator = "";
        }
        return fileHeaderBeingExtracted.getFileName().replaceFirst(fileHeaderToExtract.getFileName(), newFileName + fileSeparator);
    }

    /* loaded from: classes.dex */
    public static class ExtractFileTaskParameters extends AbstractZipTaskParameters {
        private FileHeader fileHeader;
        private String newFileName;
        private String outputPath;

        public ExtractFileTaskParameters(String outputPath, FileHeader fileHeader, String newFileName, Zip4jConfig zip4jConfig) {
            super(zip4jConfig);
            this.outputPath = outputPath;
            this.fileHeader = fileHeader;
            this.newFileName = newFileName;
        }
    }
}

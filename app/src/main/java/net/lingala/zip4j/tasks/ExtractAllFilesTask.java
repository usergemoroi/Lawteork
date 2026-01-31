package net.lingala.zip4j.tasks;

import java.io.IOException;
import net.lingala.zip4j.headers.HeaderUtil;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.UnzipParameters;
import net.lingala.zip4j.model.Zip4jConfig;
import net.lingala.zip4j.model.ZipModel;
import net.lingala.zip4j.p022io.inputstream.SplitInputStream;
import net.lingala.zip4j.p022io.inputstream.ZipInputStream;
import net.lingala.zip4j.progress.ProgressMonitor;
import net.lingala.zip4j.tasks.AsyncZipTask;
import net.lingala.zip4j.util.UnzipUtil;
/* loaded from: classes.dex */
public class ExtractAllFilesTask extends AbstractExtractFileTask<ExtractAllFilesTaskParameters> {
    private final char[] password;
    private SplitInputStream splitInputStream;

    public ExtractAllFilesTask(ZipModel zipModel, char[] password, UnzipParameters unzipParameters, AsyncZipTask.AsyncTaskParameters asyncTaskParameters) {
        super(zipModel, unzipParameters, asyncTaskParameters);
        this.password = password;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public void executeTask(ExtractAllFilesTaskParameters taskParameters, ProgressMonitor progressMonitor) throws IOException {
        try {
            ZipInputStream zipInputStream = prepareZipInputStream(taskParameters.zip4jConfig);
            for (FileHeader fileHeader : getZipModel().getCentralDirectory().getFileHeaders()) {
                if (fileHeader.getFileName().startsWith("__MACOSX")) {
                    progressMonitor.updateWorkCompleted(fileHeader.getUncompressedSize());
                } else {
                    this.splitInputStream.prepareExtractionForFileHeader(fileHeader);
                    byte[] readBuff = new byte[taskParameters.zip4jConfig.getBufferSize()];
                    extractFile(zipInputStream, fileHeader, taskParameters.outputPath, null, progressMonitor, readBuff);
                    verifyIfTaskIsCancelled();
                }
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
    public long calculateTotalWork(ExtractAllFilesTaskParameters taskParameters) {
        return HeaderUtil.getTotalUncompressedSizeOfAllFileHeaders(getZipModel().getCentralDirectory().getFileHeaders());
    }

    private ZipInputStream prepareZipInputStream(Zip4jConfig zip4jConfig) throws IOException {
        this.splitInputStream = UnzipUtil.createSplitInputStream(getZipModel());
        FileHeader fileHeader = getFirstFileHeader(getZipModel());
        if (fileHeader != null) {
            this.splitInputStream.prepareExtractionForFileHeader(fileHeader);
        }
        return new ZipInputStream(this.splitInputStream, this.password, zip4jConfig);
    }

    private FileHeader getFirstFileHeader(ZipModel zipModel) {
        if (zipModel.getCentralDirectory() == null || zipModel.getCentralDirectory().getFileHeaders() == null || zipModel.getCentralDirectory().getFileHeaders().size() == 0) {
            return null;
        }
        return zipModel.getCentralDirectory().getFileHeaders().get(0);
    }

    /* loaded from: classes.dex */
    public static class ExtractAllFilesTaskParameters extends AbstractZipTaskParameters {
        private final String outputPath;

        public ExtractAllFilesTaskParameters(String outputPath, Zip4jConfig zip4jConfig) {
            super(zip4jConfig);
            this.outputPath = outputPath;
        }
    }
}

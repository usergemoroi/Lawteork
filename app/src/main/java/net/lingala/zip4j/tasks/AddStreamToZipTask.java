package net.lingala.zip4j.tasks;

import java.io.IOException;
import java.io.InputStream;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderUtil;
import net.lingala.zip4j.headers.HeaderWriter;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.Zip4jConfig;
import net.lingala.zip4j.model.ZipModel;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.p022io.outputstream.SplitOutputStream;
import net.lingala.zip4j.p022io.outputstream.ZipOutputStream;
import net.lingala.zip4j.progress.ProgressMonitor;
import net.lingala.zip4j.tasks.AsyncZipTask;
import net.lingala.zip4j.util.InternalZipConstants;
import net.lingala.zip4j.util.Zip4jUtil;
/* loaded from: classes.dex */
public class AddStreamToZipTask extends AbstractAddFileToZipTask<AddStreamToZipTaskParameters> {
    public AddStreamToZipTask(ZipModel zipModel, char[] password, HeaderWriter headerWriter, AsyncZipTask.AsyncTaskParameters asyncTaskParameters) {
        super(zipModel, password, headerWriter, asyncTaskParameters);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public void executeTask(AddStreamToZipTaskParameters taskParameters, ProgressMonitor progressMonitor) throws IOException {
        verifyZipParameters(taskParameters.zipParameters);
        if (!Zip4jUtil.isStringNotNullAndNotEmpty(taskParameters.zipParameters.getFileNameInZip())) {
            throw new ZipException("fileNameInZip has to be set in zipParameters when adding stream");
        }
        removeFileIfExists(getZipModel(), taskParameters.zip4jConfig, taskParameters.zipParameters.getFileNameInZip(), progressMonitor);
        taskParameters.zipParameters.setWriteExtendedLocalFileHeader(true);
        if (taskParameters.zipParameters.getCompressionMethod().equals(CompressionMethod.STORE)) {
            taskParameters.zipParameters.setEntrySize(0L);
        }
        SplitOutputStream splitOutputStream = new SplitOutputStream(getZipModel().getZipFile(), getZipModel().getSplitLength());
        try {
            ZipOutputStream zipOutputStream = initializeOutputStream(splitOutputStream, taskParameters.zip4jConfig);
            byte[] readBuff = new byte[taskParameters.zip4jConfig.getBufferSize()];
            ZipParameters zipParameters = taskParameters.zipParameters;
            zipOutputStream.putNextEntry(zipParameters);
            if (!zipParameters.getFileNameInZip().endsWith(InternalZipConstants.ZIP_FILE_SEPARATOR) && !zipParameters.getFileNameInZip().endsWith("\\")) {
                while (true) {
                    int readLen = taskParameters.inputStream.read(readBuff);
                    if (readLen == -1) {
                        break;
                    }
                    zipOutputStream.write(readBuff, 0, readLen);
                }
            }
            FileHeader fileHeader = zipOutputStream.closeEntry();
            if (CompressionMethod.STORE.equals(Zip4jUtil.getCompressionMethod(fileHeader))) {
                updateLocalFileHeader(fileHeader, splitOutputStream);
            }
            if (zipOutputStream != null) {
                zipOutputStream.close();
            }
            splitOutputStream.close();
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public long calculateTotalWork(AddStreamToZipTaskParameters taskParameters) {
        return 0L;
    }

    private void removeFileIfExists(ZipModel zipModel, Zip4jConfig zip4jConfig, String fileNameInZip, ProgressMonitor progressMonitor) throws ZipException {
        FileHeader fileHeader = HeaderUtil.getFileHeader(zipModel, fileNameInZip);
        if (fileHeader != null) {
            removeFile(fileHeader, progressMonitor, zip4jConfig);
        }
    }

    /* loaded from: classes.dex */
    public static class AddStreamToZipTaskParameters extends AbstractZipTaskParameters {
        private final InputStream inputStream;
        private final ZipParameters zipParameters;

        public AddStreamToZipTaskParameters(InputStream inputStream, ZipParameters zipParameters, Zip4jConfig zip4jConfig) {
            super(zip4jConfig);
            this.inputStream = inputStream;
            this.zipParameters = zipParameters;
        }
    }
}

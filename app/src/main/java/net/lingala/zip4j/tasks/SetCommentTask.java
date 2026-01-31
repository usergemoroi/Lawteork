package net.lingala.zip4j.tasks;

import java.io.IOException;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderWriter;
import net.lingala.zip4j.model.EndOfCentralDirectoryRecord;
import net.lingala.zip4j.model.Zip4jConfig;
import net.lingala.zip4j.model.ZipModel;
import net.lingala.zip4j.p022io.outputstream.SplitOutputStream;
import net.lingala.zip4j.progress.ProgressMonitor;
import net.lingala.zip4j.tasks.AsyncZipTask;
/* loaded from: classes.dex */
public class SetCommentTask extends AsyncZipTask<SetCommentTaskTaskParameters> {
    private final ZipModel zipModel;

    public SetCommentTask(ZipModel zipModel, AsyncZipTask.AsyncTaskParameters asyncTaskParameters) {
        super(asyncTaskParameters);
        this.zipModel = zipModel;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public void executeTask(SetCommentTaskTaskParameters taskParameters, ProgressMonitor progressMonitor) throws IOException {
        if (taskParameters.comment == null) {
            throw new ZipException("comment is null, cannot update Zip file with comment");
        }
        EndOfCentralDirectoryRecord endOfCentralDirectoryRecord = this.zipModel.getEndOfCentralDirectoryRecord();
        endOfCentralDirectoryRecord.setComment(taskParameters.comment);
        SplitOutputStream outputStream = new SplitOutputStream(this.zipModel.getZipFile());
        try {
            if (this.zipModel.isZip64Format()) {
                outputStream.seek(this.zipModel.getZip64EndOfCentralDirectoryRecord().getOffsetStartCentralDirectoryWRTStartDiskNumber());
            } else {
                outputStream.seek(endOfCentralDirectoryRecord.getOffsetOfStartOfCentralDirectory());
            }
            HeaderWriter headerWriter = new HeaderWriter();
            headerWriter.finalizeZipFileWithoutValidations(this.zipModel, outputStream, taskParameters.zip4jConfig.getCharset());
            outputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    outputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public long calculateTotalWork(SetCommentTaskTaskParameters taskParameters) {
        return 0L;
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    protected ProgressMonitor.Task getTask() {
        return ProgressMonitor.Task.SET_COMMENT;
    }

    /* loaded from: classes.dex */
    public static class SetCommentTaskTaskParameters extends AbstractZipTaskParameters {
        private String comment;

        public SetCommentTaskTaskParameters(String comment, Zip4jConfig zip4jConfig) {
            super(zip4jConfig);
            this.comment = comment;
        }
    }
}

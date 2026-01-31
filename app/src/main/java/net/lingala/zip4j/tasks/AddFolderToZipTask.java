package net.lingala.zip4j.tasks;

import java.io.File;
import java.io.IOException;
import java.util.List;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderWriter;
import net.lingala.zip4j.model.Zip4jConfig;
import net.lingala.zip4j.model.ZipModel;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.progress.ProgressMonitor;
import net.lingala.zip4j.tasks.AsyncZipTask;
import net.lingala.zip4j.util.FileUtils;
/* loaded from: classes.dex */
public class AddFolderToZipTask extends AbstractAddFileToZipTask<AddFolderToZipTaskParameters> {
    public AddFolderToZipTask(ZipModel zipModel, char[] password, HeaderWriter headerWriter, AsyncZipTask.AsyncTaskParameters asyncTaskParameters) {
        super(zipModel, password, headerWriter, asyncTaskParameters);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public void executeTask(AddFolderToZipTaskParameters taskParameters, ProgressMonitor progressMonitor) throws IOException {
        List<File> filesToAdd = getFilesToAdd(taskParameters);
        setDefaultFolderPath(taskParameters);
        addFilesToZip(filesToAdd, progressMonitor, taskParameters.zipParameters, taskParameters.zip4jConfig);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public long calculateTotalWork(AddFolderToZipTaskParameters taskParameters) throws ZipException {
        List<File> filesToAdd = FileUtils.getFilesInDirectoryRecursive(taskParameters.folderToAdd, taskParameters.zipParameters.isReadHiddenFiles(), taskParameters.zipParameters.isReadHiddenFolders(), taskParameters.zipParameters.getExcludeFileFilter());
        if (taskParameters.zipParameters.isIncludeRootFolder()) {
            filesToAdd.add(taskParameters.folderToAdd);
        }
        return calculateWorkForFiles(filesToAdd, taskParameters.zipParameters);
    }

    private void setDefaultFolderPath(AddFolderToZipTaskParameters taskParameters) throws IOException {
        String rootFolderPath;
        File folderToAdd = taskParameters.folderToAdd;
        if (taskParameters.zipParameters.isIncludeRootFolder()) {
            File parentFile = folderToAdd.getCanonicalFile().getParentFile();
            if (parentFile == null) {
                rootFolderPath = folderToAdd.getCanonicalPath();
            } else {
                rootFolderPath = folderToAdd.getCanonicalFile().getParentFile().getCanonicalPath();
            }
        } else {
            rootFolderPath = folderToAdd.getCanonicalPath();
        }
        taskParameters.zipParameters.setDefaultFolderPath(rootFolderPath);
    }

    private List<File> getFilesToAdd(AddFolderToZipTaskParameters taskParameters) throws ZipException {
        List<File> filesToAdd = FileUtils.getFilesInDirectoryRecursive(taskParameters.folderToAdd, taskParameters.zipParameters.isReadHiddenFiles(), taskParameters.zipParameters.isReadHiddenFolders(), taskParameters.zipParameters.getExcludeFileFilter());
        if (taskParameters.zipParameters.isIncludeRootFolder()) {
            filesToAdd.add(taskParameters.folderToAdd);
        }
        return filesToAdd;
    }

    /* loaded from: classes.dex */
    public static class AddFolderToZipTaskParameters extends AbstractZipTaskParameters {
        private final File folderToAdd;
        private final ZipParameters zipParameters;

        public AddFolderToZipTaskParameters(File folderToAdd, ZipParameters zipParameters, Zip4jConfig zip4jConfig) {
            super(zip4jConfig);
            this.folderToAdd = folderToAdd;
            this.zipParameters = zipParameters;
        }
    }
}

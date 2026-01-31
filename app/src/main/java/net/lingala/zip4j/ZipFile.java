package net.lingala.zip4j;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderReader;
import net.lingala.zip4j.headers.HeaderUtil;
import net.lingala.zip4j.headers.HeaderWriter;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.UnzipParameters;
import net.lingala.zip4j.model.Zip4jConfig;
import net.lingala.zip4j.model.ZipModel;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.model.enums.RandomAccessFileMode;
import net.lingala.zip4j.p022io.inputstream.NumberedSplitRandomAccessFile;
import net.lingala.zip4j.p022io.inputstream.ZipInputStream;
import net.lingala.zip4j.progress.ProgressMonitor;
import net.lingala.zip4j.tasks.AddFilesToZipTask;
import net.lingala.zip4j.tasks.AddFolderToZipTask;
import net.lingala.zip4j.tasks.AddStreamToZipTask;
import net.lingala.zip4j.tasks.AsyncZipTask;
import net.lingala.zip4j.tasks.ExtractAllFilesTask;
import net.lingala.zip4j.tasks.ExtractFileTask;
import net.lingala.zip4j.tasks.MergeSplitZipFileTask;
import net.lingala.zip4j.tasks.RemoveFilesFromZipTask;
import net.lingala.zip4j.tasks.RenameFilesTask;
import net.lingala.zip4j.tasks.SetCommentTask;
import net.lingala.zip4j.util.FileUtils;
import net.lingala.zip4j.util.InternalZipConstants;
import net.lingala.zip4j.util.RawIO;
import net.lingala.zip4j.util.UnzipUtil;
import net.lingala.zip4j.util.Zip4jUtil;
/* loaded from: classes.dex */
public class ZipFile implements Closeable {
    private int bufferSize;
    private Charset charset;
    private ExecutorService executorService;
    private HeaderWriter headerWriter;
    private boolean isEncrypted;
    private List<InputStream> openInputStreams;
    private char[] password;
    private ProgressMonitor progressMonitor;
    private boolean runInThread;
    private ThreadFactory threadFactory;
    private File zipFile;
    private ZipModel zipModel;

    public ZipFile(String zipFile) {
        this(new File(zipFile), (char[]) null);
    }

    public ZipFile(String zipFile, char[] password) {
        this(new File(zipFile), password);
    }

    public ZipFile(File zipFile) {
        this(zipFile, (char[]) null);
    }

    public ZipFile(File zipFile, char[] password) {
        this.headerWriter = new HeaderWriter();
        this.charset = null;
        this.bufferSize = 4096;
        this.openInputStreams = new ArrayList();
        if (zipFile == null) {
            throw new IllegalArgumentException("input zip file parameter is null");
        }
        this.zipFile = zipFile;
        this.password = password;
        this.runInThread = false;
        this.progressMonitor = new ProgressMonitor();
    }

    public void createSplitZipFile(List<File> filesToAdd, ZipParameters parameters, boolean splitArchive, long splitLength) throws ZipException {
        if (this.zipFile.exists()) {
            throw new ZipException("zip file: " + this.zipFile + " already exists. To add files to existing zip file use addFile method");
        }
        if (filesToAdd == null || filesToAdd.size() == 0) {
            throw new ZipException("input file List is null, cannot create zip file");
        }
        createNewZipModel();
        this.zipModel.setSplitArchive(splitArchive);
        this.zipModel.setSplitLength(splitLength);
        new AddFilesToZipTask(this.zipModel, this.password, this.headerWriter, buildAsyncParameters()).execute(new AddFilesToZipTask.AddFilesToZipTaskParameters(filesToAdd, parameters, buildConfig()));
    }

    public void createSplitZipFileFromFolder(File folderToAdd, ZipParameters parameters, boolean splitArchive, long splitLength) throws ZipException {
        if (folderToAdd == null) {
            throw new ZipException("folderToAdd is null, cannot create zip file from folder");
        }
        if (parameters == null) {
            throw new ZipException("input parameters are null, cannot create zip file from folder");
        }
        if (this.zipFile.exists()) {
            throw new ZipException("zip file: " + this.zipFile + " already exists. To add files to existing zip file use addFolder method");
        }
        createNewZipModel();
        this.zipModel.setSplitArchive(splitArchive);
        if (splitArchive) {
            this.zipModel.setSplitLength(splitLength);
        }
        addFolder(folderToAdd, parameters, false);
    }

    public void addFile(String fileToAdd) throws ZipException {
        addFile(fileToAdd, new ZipParameters());
    }

    public void addFile(String fileToAdd, ZipParameters zipParameters) throws ZipException {
        if (!Zip4jUtil.isStringNotNullAndNotEmpty(fileToAdd)) {
            throw new ZipException("file to add is null or empty");
        }
        addFiles(Collections.singletonList(new File(fileToAdd)), zipParameters);
    }

    public void addFile(File fileToAdd) throws ZipException {
        addFiles(Collections.singletonList(fileToAdd), new ZipParameters());
    }

    public void addFile(File fileToAdd, ZipParameters parameters) throws ZipException {
        addFiles(Collections.singletonList(fileToAdd), parameters);
    }

    public void addFiles(List<File> filesToAdd) throws ZipException {
        addFiles(filesToAdd, new ZipParameters());
    }

    public void addFiles(List<File> filesToAdd, ZipParameters parameters) throws ZipException {
        if (filesToAdd == null || filesToAdd.size() == 0) {
            throw new ZipException("input file List is null or empty");
        }
        if (parameters == null) {
            throw new ZipException("input parameters are null");
        }
        readZipInfo();
        if (this.zipModel == null) {
            throw new ZipException("internal error: zip model is null");
        }
        if (this.zipFile.exists() && this.zipModel.isSplitArchive()) {
            throw new ZipException("Zip file already exists. Zip file format does not allow updating split/spanned files");
        }
        new AddFilesToZipTask(this.zipModel, this.password, this.headerWriter, buildAsyncParameters()).execute(new AddFilesToZipTask.AddFilesToZipTaskParameters(filesToAdd, parameters, buildConfig()));
    }

    public void addFolder(File folderToAdd) throws ZipException {
        addFolder(folderToAdd, new ZipParameters());
    }

    public void addFolder(File folderToAdd, ZipParameters zipParameters) throws ZipException {
        if (folderToAdd == null) {
            throw new ZipException("input path is null, cannot add folder to zip file");
        }
        if (!folderToAdd.exists()) {
            throw new ZipException("folder does not exist");
        }
        if (!folderToAdd.isDirectory()) {
            throw new ZipException("input folder is not a directory");
        }
        if (!folderToAdd.canRead()) {
            throw new ZipException("cannot read input folder");
        }
        if (zipParameters == null) {
            throw new ZipException("input parameters are null, cannot add folder to zip file");
        }
        addFolder(folderToAdd, zipParameters, true);
    }

    private void addFolder(File folderToAdd, ZipParameters zipParameters, boolean checkSplitArchive) throws ZipException {
        readZipInfo();
        ZipModel zipModel = this.zipModel;
        if (zipModel == null) {
            throw new ZipException("internal error: zip model is null");
        }
        if (checkSplitArchive && zipModel.isSplitArchive()) {
            throw new ZipException("This is a split archive. Zip file format does not allow updating split/spanned files");
        }
        new AddFolderToZipTask(this.zipModel, this.password, this.headerWriter, buildAsyncParameters()).execute(new AddFolderToZipTask.AddFolderToZipTaskParameters(folderToAdd, zipParameters, buildConfig()));
    }

    public void addStream(InputStream inputStream, ZipParameters parameters) throws ZipException {
        if (inputStream == null) {
            throw new ZipException("inputstream is null, cannot add file to zip");
        }
        if (parameters == null) {
            throw new ZipException("zip parameters are null");
        }
        setRunInThread(false);
        readZipInfo();
        if (this.zipModel == null) {
            throw new ZipException("internal error: zip model is null");
        }
        if (this.zipFile.exists() && this.zipModel.isSplitArchive()) {
            throw new ZipException("Zip file already exists. Zip file format does not allow updating split/spanned files");
        }
        new AddStreamToZipTask(this.zipModel, this.password, this.headerWriter, buildAsyncParameters()).execute(new AddStreamToZipTask.AddStreamToZipTaskParameters(inputStream, parameters, buildConfig()));
    }

    public void extractAll(String destinationPath) throws ZipException {
        extractAll(destinationPath, new UnzipParameters());
    }

    public void extractAll(String destinationPath, UnzipParameters unzipParameters) throws ZipException {
        if (!Zip4jUtil.isStringNotNullAndNotEmpty(destinationPath)) {
            throw new ZipException("output path is null or invalid");
        }
        if (!Zip4jUtil.createDirectoryIfNotExists(new File(destinationPath))) {
            throw new ZipException("invalid output path");
        }
        if (this.zipModel == null) {
            readZipInfo();
        }
        if (this.zipModel == null) {
            throw new ZipException("Internal error occurred when extracting zip file");
        }
        new ExtractAllFilesTask(this.zipModel, this.password, unzipParameters, buildAsyncParameters()).execute(new ExtractAllFilesTask.ExtractAllFilesTaskParameters(destinationPath, buildConfig()));
    }

    public void extractFile(FileHeader fileHeader, String destinationPath) throws ZipException {
        extractFile(fileHeader, destinationPath, (String) null, new UnzipParameters());
    }

    public void extractFile(FileHeader fileHeader, String destinationPath, UnzipParameters unzipParameters) throws ZipException {
        extractFile(fileHeader, destinationPath, (String) null, unzipParameters);
    }

    public void extractFile(String fileName, String destinationPath) throws ZipException {
        extractFile(fileName, destinationPath, (String) null, new UnzipParameters());
    }

    public void extractFile(String fileName, String destinationPath, UnzipParameters unzipParameters) throws ZipException {
        extractFile(fileName, destinationPath, (String) null, unzipParameters);
    }

    public void extractFile(String fileName, String destinationPath, String newFileName) throws ZipException {
        extractFile(fileName, destinationPath, newFileName, new UnzipParameters());
    }

    public void extractFile(FileHeader fileHeader, String destinationPath, String newFileName) throws ZipException {
        extractFile(fileHeader, destinationPath, newFileName, new UnzipParameters());
    }

    public void extractFile(String fileName, String destinationPath, String newFileName, UnzipParameters unzipParameters) throws ZipException {
        if (!Zip4jUtil.isStringNotNullAndNotEmpty(fileName)) {
            throw new ZipException("file to extract is null or empty, cannot extract file");
        }
        readZipInfo();
        FileHeader fileHeader = HeaderUtil.getFileHeader(this.zipModel, fileName);
        if (fileHeader == null) {
            throw new ZipException("No file found with name " + fileName + " in zip file", ZipException.Type.FILE_NOT_FOUND);
        }
        extractFile(fileHeader, destinationPath, newFileName, unzipParameters);
    }

    public void extractFile(FileHeader fileHeader, String destinationPath, String newFileName, UnzipParameters unzipParameters) throws ZipException {
        if (fileHeader == null) {
            throw new ZipException("input file header is null, cannot extract file");
        }
        if (!Zip4jUtil.isStringNotNullAndNotEmpty(destinationPath)) {
            throw new ZipException("destination path is empty or null, cannot extract file");
        }
        if (unzipParameters == null) {
            unzipParameters = new UnzipParameters();
        }
        readZipInfo();
        new ExtractFileTask(this.zipModel, this.password, unzipParameters, buildAsyncParameters()).execute(new ExtractFileTask.ExtractFileTaskParameters(destinationPath, fileHeader, newFileName, buildConfig()));
    }

    public List<FileHeader> getFileHeaders() throws ZipException {
        readZipInfo();
        ZipModel zipModel = this.zipModel;
        if (zipModel == null || zipModel.getCentralDirectory() == null) {
            return Collections.emptyList();
        }
        return this.zipModel.getCentralDirectory().getFileHeaders();
    }

    public FileHeader getFileHeader(String fileName) throws ZipException {
        if (!Zip4jUtil.isStringNotNullAndNotEmpty(fileName)) {
            throw new ZipException("input file name is emtpy or null, cannot get FileHeader");
        }
        readZipInfo();
        ZipModel zipModel = this.zipModel;
        if (zipModel == null || zipModel.getCentralDirectory() == null) {
            return null;
        }
        return HeaderUtil.getFileHeader(this.zipModel, fileName);
    }

    public boolean isEncrypted() throws ZipException {
        if (this.zipModel == null) {
            readZipInfo();
            if (this.zipModel == null) {
                throw new ZipException("Zip Model is null");
            }
        }
        if (this.zipModel.getCentralDirectory() == null || this.zipModel.getCentralDirectory().getFileHeaders() == null) {
            throw new ZipException("invalid zip file");
        }
        Iterator<FileHeader> it = this.zipModel.getCentralDirectory().getFileHeaders().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            FileHeader fileHeader = it.next();
            if (fileHeader != null && fileHeader.isEncrypted()) {
                this.isEncrypted = true;
                break;
            }
        }
        return this.isEncrypted;
    }

    public boolean isSplitArchive() throws ZipException {
        if (this.zipModel == null) {
            readZipInfo();
            if (this.zipModel == null) {
                throw new ZipException("Zip Model is null");
            }
        }
        return this.zipModel.isSplitArchive();
    }

    public void removeFile(FileHeader fileHeader) throws ZipException {
        if (fileHeader == null) {
            throw new ZipException("input file header is null, cannot remove file");
        }
        removeFile(fileHeader.getFileName());
    }

    public void removeFile(String fileName) throws ZipException {
        if (!Zip4jUtil.isStringNotNullAndNotEmpty(fileName)) {
            throw new ZipException("file name is empty or null, cannot remove file");
        }
        removeFiles(Collections.singletonList(fileName));
    }

    public void removeFiles(List<String> fileNames) throws ZipException {
        if (fileNames == null) {
            throw new ZipException("fileNames list is null");
        }
        if (fileNames.isEmpty()) {
            return;
        }
        if (this.zipModel == null) {
            readZipInfo();
        }
        if (this.zipModel.isSplitArchive()) {
            throw new ZipException("Zip file format does not allow updating split/spanned files");
        }
        new RemoveFilesFromZipTask(this.zipModel, this.headerWriter, buildAsyncParameters()).execute(new RemoveFilesFromZipTask.RemoveFilesFromZipTaskParameters(fileNames, buildConfig()));
    }

    public void renameFile(FileHeader fileHeader, String newFileName) throws ZipException {
        if (fileHeader == null) {
            throw new ZipException("File header is null");
        }
        renameFile(fileHeader.getFileName(), newFileName);
    }

    public void renameFile(String fileNameToRename, String newFileName) throws ZipException {
        if (!Zip4jUtil.isStringNotNullAndNotEmpty(fileNameToRename)) {
            throw new ZipException("file name to be changed is null or empty");
        }
        if (!Zip4jUtil.isStringNotNullAndNotEmpty(newFileName)) {
            throw new ZipException("newFileName is null or empty");
        }
        renameFiles(Collections.singletonMap(fileNameToRename, newFileName));
    }

    public void renameFiles(Map<String, String> fileNamesMap) throws ZipException {
        if (fileNamesMap == null) {
            throw new ZipException("fileNamesMap is null");
        }
        if (fileNamesMap.size() == 0) {
            return;
        }
        readZipInfo();
        if (this.zipModel.isSplitArchive()) {
            throw new ZipException("Zip file format does not allow updating split/spanned files");
        }
        AsyncZipTask.AsyncTaskParameters asyncTaskParameters = buildAsyncParameters();
        new RenameFilesTask(this.zipModel, this.headerWriter, new RawIO(), asyncTaskParameters).execute(new RenameFilesTask.RenameFilesTaskParameters(fileNamesMap, buildConfig()));
    }

    public void mergeSplitFiles(File outputZipFile) throws ZipException {
        if (outputZipFile == null) {
            throw new ZipException("outputZipFile is null, cannot merge split files");
        }
        if (outputZipFile.exists()) {
            throw new ZipException("output Zip File already exists");
        }
        readZipInfo();
        if (this.zipModel == null) {
            throw new ZipException("zip model is null, corrupt zip file?");
        }
        new MergeSplitZipFileTask(this.zipModel, buildAsyncParameters()).execute(new MergeSplitZipFileTask.MergeSplitZipFileTaskParameters(outputZipFile, buildConfig()));
    }

    public void setComment(String comment) throws ZipException {
        if (comment == null) {
            throw new ZipException("input comment is null, cannot update zip file");
        }
        if (!this.zipFile.exists()) {
            throw new ZipException("zip file does not exist, cannot set comment for zip file");
        }
        readZipInfo();
        ZipModel zipModel = this.zipModel;
        if (zipModel == null) {
            throw new ZipException("zipModel is null, cannot update zip file");
        }
        if (zipModel.getEndOfCentralDirectoryRecord() == null) {
            throw new ZipException("end of central directory is null, cannot set comment");
        }
        new SetCommentTask(this.zipModel, buildAsyncParameters()).execute(new SetCommentTask.SetCommentTaskTaskParameters(comment, buildConfig()));
    }

    public String getComment() throws ZipException {
        if (!this.zipFile.exists()) {
            throw new ZipException("zip file does not exist, cannot read comment");
        }
        readZipInfo();
        ZipModel zipModel = this.zipModel;
        if (zipModel == null) {
            throw new ZipException("zip model is null, cannot read comment");
        }
        if (zipModel.getEndOfCentralDirectoryRecord() == null) {
            throw new ZipException("end of central directory record is null, cannot read comment");
        }
        return this.zipModel.getEndOfCentralDirectoryRecord().getComment();
    }

    public ZipInputStream getInputStream(FileHeader fileHeader) throws IOException {
        if (fileHeader == null) {
            throw new ZipException("FileHeader is null, cannot get InputStream");
        }
        readZipInfo();
        ZipModel zipModel = this.zipModel;
        if (zipModel == null) {
            throw new ZipException("zip model is null, cannot get inputstream");
        }
        ZipInputStream zipInputStream = UnzipUtil.createZipInputStream(zipModel, fileHeader, this.password);
        this.openInputStreams.add(zipInputStream);
        return zipInputStream;
    }

    public boolean isValidZipFile() {
        if (this.zipFile.exists()) {
            try {
                readZipInfo();
                if (this.zipModel.isSplitArchive()) {
                    return verifyAllSplitFilesOfZipExists(getSplitZipFiles());
                }
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }

    public List<File> getSplitZipFiles() throws ZipException {
        readZipInfo();
        return FileUtils.getSplitZipFiles(this.zipModel);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        for (InputStream inputStream : this.openInputStreams) {
            inputStream.close();
        }
        this.openInputStreams.clear();
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public int getBufferSize() {
        return this.bufferSize;
    }

    public void setBufferSize(int bufferSize) {
        if (bufferSize < 512) {
            throw new IllegalArgumentException("Buffer size cannot be less than 512 bytes");
        }
        this.bufferSize = bufferSize;
    }

    private void readZipInfo() throws ZipException {
        if (this.zipModel != null) {
            return;
        }
        if (!this.zipFile.exists()) {
            createNewZipModel();
        } else if (!this.zipFile.canRead()) {
            throw new ZipException("no read access for the input zip file");
        } else {
            try {
                RandomAccessFile randomAccessFile = initializeRandomAccessFileForHeaderReading();
                HeaderReader headerReader = new HeaderReader();
                ZipModel readAllHeaders = headerReader.readAllHeaders(randomAccessFile, buildConfig());
                this.zipModel = readAllHeaders;
                readAllHeaders.setZipFile(this.zipFile);
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (ZipException e) {
                throw e;
            } catch (IOException e2) {
                throw new ZipException(e2);
            }
        }
    }

    private void createNewZipModel() {
        ZipModel zipModel = new ZipModel();
        this.zipModel = zipModel;
        zipModel.setZipFile(this.zipFile);
    }

    private RandomAccessFile initializeRandomAccessFileForHeaderReading() throws IOException {
        if (FileUtils.isNumberedSplitFile(this.zipFile)) {
            File[] allSplitFiles = FileUtils.getAllSortedNumberedSplitFiles(this.zipFile);
            NumberedSplitRandomAccessFile numberedSplitRandomAccessFile = new NumberedSplitRandomAccessFile(this.zipFile, RandomAccessFileMode.READ.getValue(), allSplitFiles);
            numberedSplitRandomAccessFile.openLastSplitFileForReading();
            return numberedSplitRandomAccessFile;
        }
        return new RandomAccessFile(this.zipFile, RandomAccessFileMode.READ.getValue());
    }

    private AsyncZipTask.AsyncTaskParameters buildAsyncParameters() {
        if (this.runInThread) {
            if (this.threadFactory == null) {
                this.threadFactory = Executors.defaultThreadFactory();
            }
            this.executorService = Executors.newSingleThreadExecutor(this.threadFactory);
        }
        return new AsyncZipTask.AsyncTaskParameters(this.executorService, this.runInThread, this.progressMonitor);
    }

    private boolean verifyAllSplitFilesOfZipExists(List<File> allSplitFiles) {
        for (File splitFile : allSplitFiles) {
            if (!splitFile.exists()) {
                return false;
            }
        }
        return true;
    }

    public ProgressMonitor getProgressMonitor() {
        return this.progressMonitor;
    }

    public boolean isRunInThread() {
        return this.runInThread;
    }

    public void setRunInThread(boolean runInThread) {
        this.runInThread = runInThread;
    }

    public File getFile() {
        return this.zipFile;
    }

    public Charset getCharset() {
        Charset charset = this.charset;
        if (charset == null) {
            return InternalZipConstants.CHARSET_UTF_8;
        }
        return charset;
    }

    public void setCharset(Charset charset) throws IllegalArgumentException {
        if (charset == null) {
            throw new IllegalArgumentException("charset cannot be null");
        }
        this.charset = charset;
    }

    public void setThreadFactory(ThreadFactory threadFactory) {
        this.threadFactory = threadFactory;
    }

    public ExecutorService getExecutorService() {
        return this.executorService;
    }

    public String toString() {
        return this.zipFile.toString();
    }

    private Zip4jConfig buildConfig() {
        return new Zip4jConfig(this.charset, this.bufferSize);
    }
}

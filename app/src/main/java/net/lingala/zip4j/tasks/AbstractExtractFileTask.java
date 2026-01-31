package net.lingala.zip4j.tasks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.regex.Matcher;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.LocalFileHeader;
import net.lingala.zip4j.model.UnzipParameters;
import net.lingala.zip4j.model.ZipModel;
import net.lingala.zip4j.p022io.inputstream.ZipInputStream;
import net.lingala.zip4j.progress.ProgressMonitor;
import net.lingala.zip4j.tasks.AsyncZipTask;
import net.lingala.zip4j.util.BitUtils;
import net.lingala.zip4j.util.InternalZipConstants;
import net.lingala.zip4j.util.UnzipUtil;
import net.lingala.zip4j.util.Zip4jUtil;
/* loaded from: classes.dex */
public abstract class AbstractExtractFileTask<T> extends AsyncZipTask<T> {
    private final UnzipParameters unzipParameters;
    private final ZipModel zipModel;

    public AbstractExtractFileTask(ZipModel zipModel, UnzipParameters unzipParameters, AsyncZipTask.AsyncTaskParameters asyncTaskParameters) {
        super(asyncTaskParameters);
        this.zipModel = zipModel;
        this.unzipParameters = unzipParameters;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void extractFile(ZipInputStream zipInputStream, FileHeader fileHeader, String outputPath, String newFileName, ProgressMonitor progressMonitor, byte[] readBuff) throws IOException {
        boolean isSymbolicLink = isSymbolicLink(fileHeader);
        if (isSymbolicLink && !this.unzipParameters.isExtractSymbolicLinks()) {
            return;
        }
        if (!outputPath.endsWith(InternalZipConstants.FILE_SEPARATOR)) {
            outputPath = outputPath + InternalZipConstants.FILE_SEPARATOR;
        }
        File outputFile = determineOutputFile(fileHeader, outputPath, newFileName);
        progressMonitor.setFileName(outputFile.getAbsolutePath());
        String outputCanonicalPath = new File(outputPath).getCanonicalPath() + File.separator;
        if (!outputFile.getCanonicalPath().startsWith(outputCanonicalPath)) {
            throw new ZipException("illegal file name that breaks out of the target directory: " + fileHeader.getFileName());
        }
        verifyNextEntry(zipInputStream, fileHeader);
        if (fileHeader.isDirectory()) {
            if (!outputFile.exists() && !outputFile.mkdirs()) {
                throw new ZipException("Could not create directory: " + outputFile);
            }
        } else if (isSymbolicLink(fileHeader)) {
            createSymLink(zipInputStream, fileHeader, outputFile, progressMonitor);
        } else {
            checkOutputDirectoryStructure(outputFile);
            unzipFile(zipInputStream, outputFile, progressMonitor, readBuff);
        }
        UnzipUtil.applyFileAttributes(fileHeader, outputFile);
    }

    private boolean isSymbolicLink(FileHeader fileHeader) {
        byte[] externalFileAttributes = fileHeader.getExternalFileAttributes();
        if (externalFileAttributes == null || externalFileAttributes.length < 4) {
            return false;
        }
        return BitUtils.isBitSet(externalFileAttributes[3], 5);
    }

    private void unzipFile(ZipInputStream inputStream, File outputFile, ProgressMonitor progressMonitor, byte[] buff) throws IOException {
        try {
            OutputStream outputStream = new FileOutputStream(outputFile);
            while (true) {
                int readLength = inputStream.read(buff);
                if (readLength != -1) {
                    outputStream.write(buff, 0, readLength);
                    progressMonitor.updateWorkCompleted(readLength);
                    verifyIfTaskIsCancelled();
                } else {
                    outputStream.close();
                    return;
                }
            }
        } catch (Exception e) {
            if (outputFile.exists()) {
                outputFile.delete();
            }
            throw e;
        }
    }

    private void createSymLink(ZipInputStream zipInputStream, FileHeader fileHeader, File outputFile, ProgressMonitor progressMonitor) throws IOException {
        String symLinkPath = new String(readCompleteEntry(zipInputStream, fileHeader, progressMonitor));
        if (!outputFile.getParentFile().exists() && !outputFile.getParentFile().mkdirs()) {
            throw new ZipException("Could not create parent directories");
        }
        try {
            Path linkTarget = Paths.get(symLinkPath, new String[0]);
            Files.createSymbolicLink(outputFile.toPath(), linkTarget, new FileAttribute[0]);
        } catch (NoSuchMethodError e) {
            OutputStream outputStream = new FileOutputStream(outputFile);
            try {
                outputStream.write(symLinkPath.getBytes());
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
    }

    private byte[] readCompleteEntry(ZipInputStream zipInputStream, FileHeader fileHeader, ProgressMonitor progressMonitor) throws IOException {
        byte[] b = new byte[(int) fileHeader.getUncompressedSize()];
        int readLength = zipInputStream.read(b);
        if (readLength != b.length) {
            throw new ZipException("Could not read complete entry");
        }
        progressMonitor.updateWorkCompleted(b.length);
        return b;
    }

    private void verifyNextEntry(ZipInputStream zipInputStream, FileHeader fileHeader) throws IOException {
        if (BitUtils.isBitSet(fileHeader.getGeneralPurposeFlag()[0], 6)) {
            throw new ZipException("Entry with name " + fileHeader.getFileName() + " is encrypted with Strong Encryption. Zip4j does not support Strong Encryption, as this is patented.");
        }
        LocalFileHeader localFileHeader = zipInputStream.getNextEntry(fileHeader);
        if (localFileHeader == null) {
            throw new ZipException("Could not read corresponding local file header for file header: " + fileHeader.getFileName());
        }
        if (!fileHeader.getFileName().equals(localFileHeader.getFileName())) {
            throw new ZipException("File header and local file header mismatch");
        }
    }

    private void checkOutputDirectoryStructure(File outputFile) throws ZipException {
        if (!outputFile.getParentFile().exists() && !outputFile.getParentFile().mkdirs()) {
            throw new ZipException("Unable to create parent directories: " + outputFile.getParentFile());
        }
    }

    private File determineOutputFile(FileHeader fileHeader, String outputPath, String newFileName) {
        String outputFileName;
        if (Zip4jUtil.isStringNotNullAndNotEmpty(newFileName)) {
            outputFileName = newFileName;
        } else {
            String outputFileName2 = fileHeader.getFileName();
            outputFileName = getFileNameWithSystemFileSeparators(outputFileName2);
        }
        return new File(outputPath + InternalZipConstants.FILE_SEPARATOR + outputFileName);
    }

    private String getFileNameWithSystemFileSeparators(String fileNameToReplace) {
        return fileNameToReplace.replaceAll("[/\\\\]", Matcher.quoteReplacement(InternalZipConstants.FILE_SEPARATOR));
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    protected ProgressMonitor.Task getTask() {
        return ProgressMonitor.Task.EXTRACT_ENTRY;
    }

    public ZipModel getZipModel() {
        return this.zipModel;
    }
}

package net.lingala.zip4j.util;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFilePermission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ExcludeFileFilter;
import net.lingala.zip4j.model.ZipModel;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.progress.ProgressMonitor;
/* loaded from: classes.dex */
public class FileUtils {
    public static final byte[] DEFAULT_POSIX_FILE_ATTRIBUTES = {0, 0, -92, -127};
    public static final byte[] DEFAULT_POSIX_FOLDER_ATTRIBUTES = {0, 0, -19, 65};

    public static void setFileAttributes(Path file, byte[] fileAttributes) {
        if (fileAttributes == null || fileAttributes.length == 0) {
            return;
        }
        if (isWindows()) {
            applyWindowsFileAttributes(file, fileAttributes);
        } else if (isMac() || isUnix()) {
            applyPosixFileAttributes(file, fileAttributes);
        }
    }

    public static void setFileLastModifiedTime(Path file, long lastModifiedTime) {
        if (lastModifiedTime <= 0 || !Files.exists(file, new LinkOption[0])) {
            return;
        }
        try {
            Files.setLastModifiedTime(file, FileTime.fromMillis(Zip4jUtil.dosToExtendedEpochTme(lastModifiedTime)));
        } catch (Exception e) {
        }
    }

    public static void setFileLastModifiedTimeWithoutNio(File file, long lastModifiedTime) {
        file.setLastModified(Zip4jUtil.dosToExtendedEpochTme(lastModifiedTime));
    }

    public static byte[] getFileAttributes(File file) {
        if (file != null) {
            try {
                if (Files.isSymbolicLink(file.toPath()) || file.exists()) {
                    Path path = file.toPath();
                    if (isWindows()) {
                        return getWindowsFileAttributes(path);
                    }
                    if (!isMac() && !isUnix()) {
                        return new byte[4];
                    }
                    return getPosixFileAttributes(path);
                }
            } catch (NoSuchMethodError e) {
                return new byte[4];
            }
        }
        return new byte[4];
    }

    public static List<File> getFilesInDirectoryRecursive(File path, boolean readHiddenFiles, boolean readHiddenFolders) throws ZipException {
        return getFilesInDirectoryRecursive(path, readHiddenFiles, readHiddenFolders, null);
    }

    public static List<File> getFilesInDirectoryRecursive(File path, boolean readHiddenFiles, boolean readHiddenFolders, ExcludeFileFilter excludedFiles) throws ZipException {
        if (path == null) {
            throw new ZipException("input path is null, cannot read files in the directory");
        }
        List<File> result = new ArrayList<>();
        File[] filesAndDirs = path.listFiles();
        if (!path.isDirectory() || !path.canRead() || filesAndDirs == null) {
            return result;
        }
        for (File file : filesAndDirs) {
            if (excludedFiles == null || !excludedFiles.isExcluded(file)) {
                if (file.isHidden()) {
                    if (file.isDirectory()) {
                        if (!readHiddenFolders) {
                        }
                    } else if (!readHiddenFiles) {
                    }
                }
                result.add(file);
                if (file.isDirectory()) {
                    result.addAll(getFilesInDirectoryRecursive(file, readHiddenFiles, readHiddenFolders, excludedFiles));
                }
            }
        }
        return result;
    }

    public static String getFileNameWithoutExtension(String fileName) {
        int pos = fileName.lastIndexOf(".");
        if (pos == -1) {
            return fileName;
        }
        return fileName.substring(0, pos);
    }

    public static String getZipFileNameWithoutExtension(String zipFile) throws ZipException {
        if (!Zip4jUtil.isStringNotNullAndNotEmpty(zipFile)) {
            throw new ZipException("zip file name is empty or null, cannot determine zip file name");
        }
        String tmpFileName = zipFile;
        if (zipFile.contains(System.getProperty("file.separator"))) {
            tmpFileName = zipFile.substring(zipFile.lastIndexOf(System.getProperty("file.separator")) + 1);
        }
        if (tmpFileName.endsWith(".zip")) {
            return tmpFileName.substring(0, tmpFileName.lastIndexOf("."));
        }
        return tmpFileName;
    }

    public static List<File> getSplitZipFiles(ZipModel zipModel) throws ZipException {
        if (zipModel == null) {
            throw new ZipException("cannot get split zip files: zipmodel is null");
        }
        if (zipModel.getEndOfCentralDirectoryRecord() == null) {
            return null;
        }
        if (!zipModel.getZipFile().exists()) {
            throw new ZipException("zip file does not exist");
        }
        List<File> splitZipFiles = new ArrayList<>();
        File currZipFile = zipModel.getZipFile();
        if (!zipModel.isSplitArchive()) {
            splitZipFiles.add(currZipFile);
            return splitZipFiles;
        }
        int numberOfThisDisk = zipModel.getEndOfCentralDirectoryRecord().getNumberOfThisDisk();
        if (numberOfThisDisk == 0) {
            splitZipFiles.add(currZipFile);
            return splitZipFiles;
        }
        for (int i = 0; i <= numberOfThisDisk; i++) {
            if (i == numberOfThisDisk) {
                splitZipFiles.add(zipModel.getZipFile());
            } else {
                String fileExt = ".z0";
                if (i >= 9) {
                    fileExt = ".z";
                }
                String partFile = currZipFile.getName().contains(".") ? currZipFile.getPath().substring(0, currZipFile.getPath().lastIndexOf(".")) : currZipFile.getPath();
                splitZipFiles.add(new File(partFile + fileExt + (i + 1)));
            }
        }
        return splitZipFiles;
    }

    public static String getRelativeFileName(File fileToAdd, ZipParameters zipParameters) throws ZipException {
        String fileName;
        String rootPath;
        String tmpFileName;
        try {
            String fileCanonicalPath = fileToAdd.getCanonicalPath();
            if (Zip4jUtil.isStringNotNullAndNotEmpty(zipParameters.getDefaultFolderPath())) {
                File rootFolderFile = new File(zipParameters.getDefaultFolderPath());
                String rootFolderFileRef = rootFolderFile.getCanonicalPath();
                if (!rootFolderFileRef.endsWith(InternalZipConstants.FILE_SEPARATOR)) {
                    rootFolderFileRef = rootFolderFileRef + InternalZipConstants.FILE_SEPARATOR;
                }
                if (isSymbolicLink(fileToAdd)) {
                    String rootPath2 = new File(fileToAdd.getParentFile().getCanonicalFile().getPath() + File.separator + fileToAdd.getCanonicalFile().getName()).getPath();
                    rootPath = rootPath2.substring(rootFolderFileRef.length());
                } else {
                    rootPath = fileCanonicalPath.substring(rootFolderFileRef.length());
                }
                if (rootPath.startsWith(System.getProperty("file.separator"))) {
                    rootPath = rootPath.substring(1);
                }
                File tmpFile = new File(fileCanonicalPath);
                if (tmpFile.isDirectory()) {
                    String tmpFileName2 = rootPath.replaceAll("\\\\", InternalZipConstants.ZIP_FILE_SEPARATOR);
                    tmpFileName = tmpFileName2 + InternalZipConstants.ZIP_FILE_SEPARATOR;
                } else {
                    String bkFileName = rootPath.substring(0, rootPath.lastIndexOf(tmpFile.getName()));
                    tmpFileName = bkFileName.replaceAll("\\\\", InternalZipConstants.ZIP_FILE_SEPARATOR) + getNameOfFileInZip(tmpFile, zipParameters.getFileNameInZip());
                }
                fileName = tmpFileName;
            } else {
                File relFile = new File(fileCanonicalPath);
                String fileName2 = getNameOfFileInZip(relFile, zipParameters.getFileNameInZip());
                if (!relFile.isDirectory()) {
                    fileName = fileName2;
                } else {
                    fileName = fileName2 + InternalZipConstants.ZIP_FILE_SEPARATOR;
                }
            }
            String rootFolderNameInZip = zipParameters.getRootFolderNameInZip();
            if (Zip4jUtil.isStringNotNullAndNotEmpty(rootFolderNameInZip)) {
                if (!rootFolderNameInZip.endsWith("\\") && !rootFolderNameInZip.endsWith(InternalZipConstants.ZIP_FILE_SEPARATOR)) {
                    rootFolderNameInZip = rootFolderNameInZip + InternalZipConstants.FILE_SEPARATOR;
                }
                rootFolderNameInZip = rootFolderNameInZip.replaceAll("\\\\", InternalZipConstants.ZIP_FILE_SEPARATOR);
                fileName = rootFolderNameInZip + fileName;
            }
            if (!Zip4jUtil.isStringNotNullAndNotEmpty(fileName)) {
                String errorMessage = "fileName to add to zip is empty or null. fileName: '" + fileName + "' DefaultFolderPath: '" + zipParameters.getDefaultFolderPath() + "' FileNameInZip: " + zipParameters.getFileNameInZip();
                if (isSymbolicLink(fileToAdd)) {
                    errorMessage = errorMessage + "isSymlink: true ";
                }
                if (Zip4jUtil.isStringNotNullAndNotEmpty(rootFolderNameInZip)) {
                    errorMessage = "rootFolderNameInZip: '" + rootFolderNameInZip + "' ";
                }
                throw new ZipException(errorMessage);
            }
            return fileName;
        } catch (IOException e) {
            throw new ZipException(e);
        }
    }

    private static String getNameOfFileInZip(File fileToAdd, String fileNameInZip) throws IOException {
        if (Zip4jUtil.isStringNotNullAndNotEmpty(fileNameInZip)) {
            return fileNameInZip;
        }
        return isSymbolicLink(fileToAdd) ? fileToAdd.toPath().toRealPath(LinkOption.NOFOLLOW_LINKS).getFileName().toString() : fileToAdd.getName();
    }

    public static boolean isZipEntryDirectory(String fileNameInZip) {
        return fileNameInZip.endsWith(InternalZipConstants.ZIP_FILE_SEPARATOR) || fileNameInZip.endsWith("\\");
    }

    public static void copyFile(RandomAccessFile randomAccessFile, OutputStream outputStream, long start, long end, ProgressMonitor progressMonitor, int bufferSize) throws ZipException {
        byte[] buff;
        if (start < 0 || end < 0 || start > end) {
            throw new ZipException("invalid offsets");
        }
        if (start == end) {
            return;
        }
        try {
            randomAccessFile.seek(start);
            long bytesRead = 0;
            long bytesToRead = end - start;
            if (end - start < bufferSize) {
                buff = new byte[(int) bytesToRead];
            } else {
                buff = new byte[bufferSize];
            }
            while (true) {
                int readLen = randomAccessFile.read(buff);
                if (readLen != -1) {
                    try {
                        outputStream.write(buff, 0, readLen);
                        progressMonitor.updateWorkCompleted(readLen);
                        if (progressMonitor.isCancelAllTasks()) {
                            progressMonitor.setResult(ProgressMonitor.Result.CANCELLED);
                            return;
                        }
                        bytesRead += readLen;
                        if (bytesRead != bytesToRead) {
                            if (buff.length + bytesRead > bytesToRead) {
                                buff = new byte[(int) (bytesToRead - bytesRead)];
                            }
                        } else {
                            return;
                        }
                    } catch (IOException e) {
                        e = e;
                        throw new ZipException(e);
                    }
                } else {
                    return;
                }
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public static void assertFilesExist(List<File> files, ZipParameters.SymbolicLinkAction symLinkAction) throws ZipException {
        for (File file : files) {
            if (isSymbolicLink(file)) {
                if (symLinkAction.equals(ZipParameters.SymbolicLinkAction.INCLUDE_LINK_AND_LINKED_FILE) || symLinkAction.equals(ZipParameters.SymbolicLinkAction.INCLUDE_LINKED_FILE_ONLY)) {
                    assertSymbolicLinkTargetExists(file);
                }
            } else {
                assertFileExists(file);
            }
        }
    }

    public static boolean isNumberedSplitFile(File file) {
        return file.getName().endsWith(InternalZipConstants.SEVEN_ZIP_SPLIT_FILE_EXTENSION_PATTERN);
    }

    public static String getFileExtension(File file) {
        String fileName = file.getName();
        if (!fileName.contains(".")) {
            return "";
        }
        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }

    public static File[] getAllSortedNumberedSplitFiles(File firstNumberedFile) {
        final String zipFileNameWithoutExtension = getFileNameWithoutExtension(firstNumberedFile.getName());
        File[] allSplitFiles = firstNumberedFile.getParentFile().listFiles(new FilenameFilter() { // from class: net.lingala.zip4j.util.FileUtils.1
            @Override // java.io.FilenameFilter
            public boolean accept(File dir, String name) {
                return name.startsWith(zipFileNameWithoutExtension + ".");
            }
        });
        if (allSplitFiles == null) {
            return new File[0];
        }
        Arrays.sort(allSplitFiles);
        return allSplitFiles;
    }

    public static String getNextNumberedSplitFileCounterAsExtension(int index) {
        return "." + getExtensionZerosPrefix(index) + (index + 1);
    }

    public static boolean isSymbolicLink(File file) {
        try {
            return Files.isSymbolicLink(file.toPath());
        } catch (Error | Exception e) {
            return false;
        }
    }

    public static String readSymbolicLink(File file) {
        try {
            return Files.readSymbolicLink(file.toPath()).toString();
        } catch (Error | Exception e) {
            return "";
        }
    }

    public static byte[] getDefaultFileAttributes(boolean isDirectory) {
        byte[] permissions = new byte[4];
        if (isUnix() || isMac()) {
            if (isDirectory) {
                System.arraycopy(DEFAULT_POSIX_FOLDER_ATTRIBUTES, 0, permissions, 0, permissions.length);
            } else {
                System.arraycopy(DEFAULT_POSIX_FILE_ATTRIBUTES, 0, permissions, 0, permissions.length);
            }
        } else if (isWindows() && isDirectory) {
            permissions[0] = BitUtils.setBit(permissions[0], 4);
        }
        return permissions;
    }

    public static boolean isWindows() {
        String os = System.getProperty("os.name").toLowerCase();
        return os.contains("win");
    }

    public static boolean isMac() {
        String os = System.getProperty("os.name").toLowerCase();
        return os.contains("mac");
    }

    public static boolean isUnix() {
        String os = System.getProperty("os.name").toLowerCase();
        return os.contains("nux");
    }

    private static String getExtensionZerosPrefix(int index) {
        if (index < 9) {
            return "00";
        }
        if (index < 99) {
            return "0";
        }
        return "";
    }

    private static void applyWindowsFileAttributes(Path file, byte[] fileAttributes) {
        if (fileAttributes[0] == 0) {
            return;
        }
        DosFileAttributeView fileAttributeView = (DosFileAttributeView) Files.getFileAttributeView(file, DosFileAttributeView.class, LinkOption.NOFOLLOW_LINKS);
        try {
            fileAttributeView.setReadOnly(BitUtils.isBitSet(fileAttributes[0], 0));
            fileAttributeView.setHidden(BitUtils.isBitSet(fileAttributes[0], 1));
            fileAttributeView.setSystem(BitUtils.isBitSet(fileAttributes[0], 2));
            fileAttributeView.setArchive(BitUtils.isBitSet(fileAttributes[0], 5));
        } catch (IOException e) {
        }
    }

    private static void applyPosixFileAttributes(Path file, byte[] fileAttributes) {
        if (fileAttributes[2] == 0 && fileAttributes[3] == 0) {
            return;
        }
        try {
            Set<PosixFilePermission> posixFilePermissions = new HashSet<>();
            addIfBitSet(fileAttributes[3], 0, posixFilePermissions, PosixFilePermission.OWNER_READ);
            addIfBitSet(fileAttributes[2], 7, posixFilePermissions, PosixFilePermission.OWNER_WRITE);
            addIfBitSet(fileAttributes[2], 6, posixFilePermissions, PosixFilePermission.OWNER_EXECUTE);
            addIfBitSet(fileAttributes[2], 5, posixFilePermissions, PosixFilePermission.GROUP_READ);
            addIfBitSet(fileAttributes[2], 4, posixFilePermissions, PosixFilePermission.GROUP_WRITE);
            addIfBitSet(fileAttributes[2], 3, posixFilePermissions, PosixFilePermission.GROUP_EXECUTE);
            addIfBitSet(fileAttributes[2], 2, posixFilePermissions, PosixFilePermission.OTHERS_READ);
            addIfBitSet(fileAttributes[2], 1, posixFilePermissions, PosixFilePermission.OTHERS_WRITE);
            addIfBitSet(fileAttributes[2], 0, posixFilePermissions, PosixFilePermission.OTHERS_EXECUTE);
            Files.setPosixFilePermissions(file, posixFilePermissions);
        } catch (IOException e) {
        }
    }

    private static byte[] getWindowsFileAttributes(Path file) {
        byte[] fileAttributes = new byte[4];
        try {
            DosFileAttributeView dosFileAttributeView = (DosFileAttributeView) Files.getFileAttributeView(file, DosFileAttributeView.class, LinkOption.NOFOLLOW_LINKS);
            DosFileAttributes dosFileAttributes = dosFileAttributeView.readAttributes();
            byte windowsAttribute = setBitIfApplicable(dosFileAttributes.isReadOnly(), (byte) 0, 0);
            fileAttributes[0] = setBitIfApplicable(dosFileAttributes.isArchive(), setBitIfApplicable(dosFileAttributes.isDirectory(), setBitIfApplicable(dosFileAttributes.isSystem(), setBitIfApplicable(dosFileAttributes.isHidden(), windowsAttribute, 1), 2), 4), 5);
        } catch (IOException e) {
        }
        return fileAttributes;
    }

    private static void assertFileExists(File file) throws ZipException {
        if (!file.exists()) {
            throw new ZipException("File does not exist: " + file);
        }
    }

    private static void assertSymbolicLinkTargetExists(File file) throws ZipException {
        if (!file.exists()) {
            throw new ZipException("Symlink target '" + readSymbolicLink(file) + "' does not exist for link '" + file + "'");
        }
    }

    private static byte[] getPosixFileAttributes(Path file) {
        byte[] fileAttributes = new byte[4];
        try {
            PosixFileAttributeView posixFileAttributeView = (PosixFileAttributeView) Files.getFileAttributeView(file, PosixFileAttributeView.class, LinkOption.NOFOLLOW_LINKS);
            Set<PosixFilePermission> posixFilePermissions = posixFileAttributeView.readAttributes().permissions();
            fileAttributes[3] = setBitIfApplicable(Files.isRegularFile(file, new LinkOption[0]), fileAttributes[3], 7);
            fileAttributes[3] = setBitIfApplicable(Files.isDirectory(file, new LinkOption[0]), fileAttributes[3], 6);
            fileAttributes[3] = setBitIfApplicable(Files.isSymbolicLink(file), fileAttributes[3], 5);
            fileAttributes[3] = setBitIfApplicable(posixFilePermissions.contains(PosixFilePermission.OWNER_READ), fileAttributes[3], 0);
            fileAttributes[2] = setBitIfApplicable(posixFilePermissions.contains(PosixFilePermission.OWNER_WRITE), fileAttributes[2], 7);
            fileAttributes[2] = setBitIfApplicable(posixFilePermissions.contains(PosixFilePermission.OWNER_EXECUTE), fileAttributes[2], 6);
            fileAttributes[2] = setBitIfApplicable(posixFilePermissions.contains(PosixFilePermission.GROUP_READ), fileAttributes[2], 5);
            fileAttributes[2] = setBitIfApplicable(posixFilePermissions.contains(PosixFilePermission.GROUP_WRITE), fileAttributes[2], 4);
            fileAttributes[2] = setBitIfApplicable(posixFilePermissions.contains(PosixFilePermission.GROUP_EXECUTE), fileAttributes[2], 3);
            fileAttributes[2] = setBitIfApplicable(posixFilePermissions.contains(PosixFilePermission.OTHERS_READ), fileAttributes[2], 2);
            fileAttributes[2] = setBitIfApplicable(posixFilePermissions.contains(PosixFilePermission.OTHERS_WRITE), fileAttributes[2], 1);
            fileAttributes[2] = setBitIfApplicable(posixFilePermissions.contains(PosixFilePermission.OTHERS_EXECUTE), fileAttributes[2], 0);
        } catch (IOException e) {
        }
        return fileAttributes;
    }

    private static byte setBitIfApplicable(boolean applicable, byte b, int pos) {
        if (applicable) {
            return BitUtils.setBit(b, pos);
        }
        return b;
    }

    private static void addIfBitSet(byte b, int pos, Set<PosixFilePermission> posixFilePermissions, PosixFilePermission posixFilePermissionToAdd) {
        if (BitUtils.isBitSet(b, pos)) {
            posixFilePermissions.add(posixFilePermissionToAdd);
        }
    }
}

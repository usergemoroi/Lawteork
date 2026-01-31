package net.lingala.zip4j.model;

import net.lingala.zip4j.model.enums.AesKeyStrength;
import net.lingala.zip4j.model.enums.AesVersion;
import net.lingala.zip4j.model.enums.CompressionLevel;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.model.enums.EncryptionMethod;
/* loaded from: classes.dex */
public class ZipParameters {
    private AesKeyStrength aesKeyStrength;
    private AesVersion aesVersion;
    private CompressionLevel compressionLevel;
    private CompressionMethod compressionMethod;
    private String defaultFolderPath;
    private boolean encryptFiles;
    private EncryptionMethod encryptionMethod;
    private long entryCRC;
    private long entrySize;
    private ExcludeFileFilter excludeFileFilter;
    private String fileComment;
    private String fileNameInZip;
    private boolean includeRootFolder;
    private long lastModifiedFileTime;
    private boolean overrideExistingFilesInZip;
    private boolean readHiddenFiles;
    private boolean readHiddenFolders;
    private String rootFolderNameInZip;
    private SymbolicLinkAction symbolicLinkAction;
    private boolean unixMode;
    private boolean writeExtendedLocalFileHeader;

    /* loaded from: classes.dex */
    public enum SymbolicLinkAction {
        INCLUDE_LINK_ONLY,
        INCLUDE_LINKED_FILE_ONLY,
        INCLUDE_LINK_AND_LINKED_FILE
    }

    public ZipParameters() {
        this.compressionMethod = CompressionMethod.DEFLATE;
        this.compressionLevel = CompressionLevel.NORMAL;
        this.encryptFiles = false;
        this.encryptionMethod = EncryptionMethod.NONE;
        this.readHiddenFiles = true;
        this.readHiddenFolders = true;
        this.aesKeyStrength = AesKeyStrength.KEY_STRENGTH_256;
        this.aesVersion = AesVersion.TWO;
        this.includeRootFolder = true;
        this.lastModifiedFileTime = System.currentTimeMillis();
        this.entrySize = -1L;
        this.writeExtendedLocalFileHeader = true;
        this.overrideExistingFilesInZip = true;
        this.symbolicLinkAction = SymbolicLinkAction.INCLUDE_LINKED_FILE_ONLY;
    }

    public ZipParameters(ZipParameters zipParameters) {
        this.compressionMethod = CompressionMethod.DEFLATE;
        this.compressionLevel = CompressionLevel.NORMAL;
        this.encryptFiles = false;
        this.encryptionMethod = EncryptionMethod.NONE;
        this.readHiddenFiles = true;
        this.readHiddenFolders = true;
        this.aesKeyStrength = AesKeyStrength.KEY_STRENGTH_256;
        this.aesVersion = AesVersion.TWO;
        this.includeRootFolder = true;
        this.lastModifiedFileTime = System.currentTimeMillis();
        this.entrySize = -1L;
        this.writeExtendedLocalFileHeader = true;
        this.overrideExistingFilesInZip = true;
        this.symbolicLinkAction = SymbolicLinkAction.INCLUDE_LINKED_FILE_ONLY;
        this.compressionMethod = zipParameters.getCompressionMethod();
        this.compressionLevel = zipParameters.getCompressionLevel();
        this.encryptFiles = zipParameters.isEncryptFiles();
        this.encryptionMethod = zipParameters.getEncryptionMethod();
        this.readHiddenFiles = zipParameters.isReadHiddenFiles();
        this.readHiddenFolders = zipParameters.isReadHiddenFolders();
        this.aesKeyStrength = zipParameters.getAesKeyStrength();
        this.aesVersion = zipParameters.getAesVersion();
        this.includeRootFolder = zipParameters.isIncludeRootFolder();
        this.entryCRC = zipParameters.getEntryCRC();
        this.defaultFolderPath = zipParameters.getDefaultFolderPath();
        this.fileNameInZip = zipParameters.getFileNameInZip();
        this.lastModifiedFileTime = zipParameters.getLastModifiedFileTime();
        this.entrySize = zipParameters.getEntrySize();
        this.writeExtendedLocalFileHeader = zipParameters.isWriteExtendedLocalFileHeader();
        this.overrideExistingFilesInZip = zipParameters.isOverrideExistingFilesInZip();
        this.rootFolderNameInZip = zipParameters.getRootFolderNameInZip();
        this.fileComment = zipParameters.getFileComment();
        this.symbolicLinkAction = zipParameters.getSymbolicLinkAction();
        this.excludeFileFilter = zipParameters.getExcludeFileFilter();
        this.unixMode = zipParameters.isUnixMode();
    }

    public CompressionMethod getCompressionMethod() {
        return this.compressionMethod;
    }

    public void setCompressionMethod(CompressionMethod compressionMethod) {
        this.compressionMethod = compressionMethod;
    }

    public boolean isEncryptFiles() {
        return this.encryptFiles;
    }

    public void setEncryptFiles(boolean encryptFiles) {
        this.encryptFiles = encryptFiles;
    }

    public EncryptionMethod getEncryptionMethod() {
        return this.encryptionMethod;
    }

    public void setEncryptionMethod(EncryptionMethod encryptionMethod) {
        this.encryptionMethod = encryptionMethod;
    }

    public CompressionLevel getCompressionLevel() {
        return this.compressionLevel;
    }

    public void setCompressionLevel(CompressionLevel compressionLevel) {
        this.compressionLevel = compressionLevel;
    }

    public boolean isReadHiddenFiles() {
        return this.readHiddenFiles;
    }

    public void setReadHiddenFiles(boolean readHiddenFiles) {
        this.readHiddenFiles = readHiddenFiles;
    }

    public boolean isReadHiddenFolders() {
        return this.readHiddenFolders;
    }

    public void setReadHiddenFolders(boolean readHiddenFolders) {
        this.readHiddenFolders = readHiddenFolders;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public AesKeyStrength getAesKeyStrength() {
        return this.aesKeyStrength;
    }

    public void setAesKeyStrength(AesKeyStrength aesKeyStrength) {
        this.aesKeyStrength = aesKeyStrength;
    }

    public AesVersion getAesVersion() {
        return this.aesVersion;
    }

    public void setAesVersion(AesVersion aesVersion) {
        this.aesVersion = aesVersion;
    }

    public boolean isIncludeRootFolder() {
        return this.includeRootFolder;
    }

    public void setIncludeRootFolder(boolean includeRootFolder) {
        this.includeRootFolder = includeRootFolder;
    }

    public long getEntryCRC() {
        return this.entryCRC;
    }

    public void setEntryCRC(long entryCRC) {
        this.entryCRC = entryCRC;
    }

    public String getDefaultFolderPath() {
        return this.defaultFolderPath;
    }

    public void setDefaultFolderPath(String defaultFolderPath) {
        this.defaultFolderPath = defaultFolderPath;
    }

    public String getFileNameInZip() {
        return this.fileNameInZip;
    }

    public void setFileNameInZip(String fileNameInZip) {
        this.fileNameInZip = fileNameInZip;
    }

    public long getLastModifiedFileTime() {
        return this.lastModifiedFileTime;
    }

    public void setLastModifiedFileTime(long lastModifiedFileTime) {
        if (lastModifiedFileTime <= 0) {
            return;
        }
        this.lastModifiedFileTime = lastModifiedFileTime;
    }

    public long getEntrySize() {
        return this.entrySize;
    }

    public void setEntrySize(long entrySize) {
        this.entrySize = entrySize;
    }

    public boolean isWriteExtendedLocalFileHeader() {
        return this.writeExtendedLocalFileHeader;
    }

    public void setWriteExtendedLocalFileHeader(boolean writeExtendedLocalFileHeader) {
        this.writeExtendedLocalFileHeader = writeExtendedLocalFileHeader;
    }

    public boolean isOverrideExistingFilesInZip() {
        return this.overrideExistingFilesInZip;
    }

    public void setOverrideExistingFilesInZip(boolean overrideExistingFilesInZip) {
        this.overrideExistingFilesInZip = overrideExistingFilesInZip;
    }

    public String getRootFolderNameInZip() {
        return this.rootFolderNameInZip;
    }

    public void setRootFolderNameInZip(String rootFolderNameInZip) {
        this.rootFolderNameInZip = rootFolderNameInZip;
    }

    public String getFileComment() {
        return this.fileComment;
    }

    public void setFileComment(String fileComment) {
        this.fileComment = fileComment;
    }

    public SymbolicLinkAction getSymbolicLinkAction() {
        return this.symbolicLinkAction;
    }

    public void setSymbolicLinkAction(SymbolicLinkAction symbolicLinkAction) {
        this.symbolicLinkAction = symbolicLinkAction;
    }

    public ExcludeFileFilter getExcludeFileFilter() {
        return this.excludeFileFilter;
    }

    public void setExcludeFileFilter(ExcludeFileFilter excludeFileFilter) {
        this.excludeFileFilter = excludeFileFilter;
    }

    public boolean isUnixMode() {
        return this.unixMode;
    }

    public void setUnixMode(boolean unixMode) {
        this.unixMode = unixMode;
    }
}

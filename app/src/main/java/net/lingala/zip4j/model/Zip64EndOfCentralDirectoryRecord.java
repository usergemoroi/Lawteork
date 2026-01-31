package net.lingala.zip4j.model;
/* loaded from: classes.dex */
public class Zip64EndOfCentralDirectoryRecord extends ZipHeader {
    private byte[] extensibleDataSector;
    private int numberOfThisDisk;
    private int numberOfThisDiskStartOfCentralDirectory;
    private long offsetStartCentralDirectoryWRTStartDiskNumber = -1;
    private long sizeOfCentralDirectory;
    private long sizeOfZip64EndCentralDirectoryRecord;
    private long totalNumberOfEntriesInCentralDirectory;
    private long totalNumberOfEntriesInCentralDirectoryOnThisDisk;
    private int versionMadeBy;
    private int versionNeededToExtract;

    public long getSizeOfZip64EndCentralDirectoryRecord() {
        return this.sizeOfZip64EndCentralDirectoryRecord;
    }

    public void setSizeOfZip64EndCentralDirectoryRecord(long sizeOfZip64EndCentralDirectoryRecord) {
        this.sizeOfZip64EndCentralDirectoryRecord = sizeOfZip64EndCentralDirectoryRecord;
    }

    public int getVersionMadeBy() {
        return this.versionMadeBy;
    }

    public void setVersionMadeBy(int versionMadeBy) {
        this.versionMadeBy = versionMadeBy;
    }

    public int getVersionNeededToExtract() {
        return this.versionNeededToExtract;
    }

    public void setVersionNeededToExtract(int versionNeededToExtract) {
        this.versionNeededToExtract = versionNeededToExtract;
    }

    public int getNumberOfThisDisk() {
        return this.numberOfThisDisk;
    }

    public void setNumberOfThisDisk(int numberOfThisDisk) {
        this.numberOfThisDisk = numberOfThisDisk;
    }

    public int getNumberOfThisDiskStartOfCentralDirectory() {
        return this.numberOfThisDiskStartOfCentralDirectory;
    }

    public void setNumberOfThisDiskStartOfCentralDirectory(int numberOfThisDiskStartOfCentralDirectory) {
        this.numberOfThisDiskStartOfCentralDirectory = numberOfThisDiskStartOfCentralDirectory;
    }

    public long getTotalNumberOfEntriesInCentralDirectoryOnThisDisk() {
        return this.totalNumberOfEntriesInCentralDirectoryOnThisDisk;
    }

    public void setTotalNumberOfEntriesInCentralDirectoryOnThisDisk(long totalNumberOfEntriesInCentralDirectoryOnThisDisk) {
        this.totalNumberOfEntriesInCentralDirectoryOnThisDisk = totalNumberOfEntriesInCentralDirectoryOnThisDisk;
    }

    public long getTotalNumberOfEntriesInCentralDirectory() {
        return this.totalNumberOfEntriesInCentralDirectory;
    }

    public void setTotalNumberOfEntriesInCentralDirectory(long totalNumberOfEntriesInCentralDirectory) {
        this.totalNumberOfEntriesInCentralDirectory = totalNumberOfEntriesInCentralDirectory;
    }

    public long getSizeOfCentralDirectory() {
        return this.sizeOfCentralDirectory;
    }

    public void setSizeOfCentralDirectory(long sizeOfCentralDirectory) {
        this.sizeOfCentralDirectory = sizeOfCentralDirectory;
    }

    public long getOffsetStartCentralDirectoryWRTStartDiskNumber() {
        return this.offsetStartCentralDirectoryWRTStartDiskNumber;
    }

    public void setOffsetStartCentralDirectoryWRTStartDiskNumber(long offsetStartCentralDirectoryWRTStartDiskNumber) {
        this.offsetStartCentralDirectoryWRTStartDiskNumber = offsetStartCentralDirectoryWRTStartDiskNumber;
    }

    public byte[] getExtensibleDataSector() {
        return this.extensibleDataSector;
    }

    public void setExtensibleDataSector(byte[] extensibleDataSector) {
        this.extensibleDataSector = extensibleDataSector;
    }
}

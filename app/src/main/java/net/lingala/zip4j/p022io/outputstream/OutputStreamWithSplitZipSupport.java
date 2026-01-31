package net.lingala.zip4j.p022io.outputstream;

import java.io.IOException;
/* renamed from: net.lingala.zip4j.io.outputstream.OutputStreamWithSplitZipSupport */
/* loaded from: classes.dex */
public interface OutputStreamWithSplitZipSupport {
    int getCurrentSplitFileCounter();

    long getFilePointer() throws IOException;
}

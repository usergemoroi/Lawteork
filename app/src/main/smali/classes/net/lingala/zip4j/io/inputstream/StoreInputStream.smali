.class Lnet/lingala/zip4j/io/inputstream/StoreInputStream;
.super Lnet/lingala/zip4j/io/inputstream/DecompressedInputStream;
.source "StoreInputStream.java"


# direct methods
.method public constructor <init>(Lnet/lingala/zip4j/io/inputstream/CipherInputStream;)V
    .locals 0
    .param p1, "cipherInputStream"    # Lnet/lingala/zip4j/io/inputstream/CipherInputStream;

    .line 6
    invoke-direct {p0, p1}, Lnet/lingala/zip4j/io/inputstream/DecompressedInputStream;-><init>(Lnet/lingala/zip4j/io/inputstream/CipherInputStream;)V

    .line 7
    return-void
.end method

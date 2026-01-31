package black.android.nfc;

import android.os.IBinder;
import android.os.IInterface;
import top.niunaijun.blackreflection.annotation.BClassName;
import top.niunaijun.blackreflection.annotation.BStaticMethod;
@BClassName("android.nfc.INfcAdapter")
/* loaded from: classes.dex */
public interface INfcAdapter {

    @BClassName("android.nfc.INfcAdapter$Stub")
    /* loaded from: classes.dex */
    public interface Stub {
        @BStaticMethod
        IInterface asInterface(IBinder iBinder);
    }
}

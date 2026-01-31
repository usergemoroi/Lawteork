package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class Struct {

    /* renamed from: bb */
    protected ByteBuffer f78bb;
    protected int bb_pos;

    protected void __reset(int _i, ByteBuffer _bb) {
        this.f78bb = _bb;
        if (_bb != null) {
            this.bb_pos = _i;
        } else {
            this.bb_pos = 0;
        }
    }

    public void __reset() {
        __reset(0, null);
    }
}

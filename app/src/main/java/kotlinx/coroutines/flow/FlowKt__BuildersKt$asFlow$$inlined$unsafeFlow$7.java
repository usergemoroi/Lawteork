package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* compiled from: SafeCollector.common.kt */
@Metadata(m71d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, m70d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m69k = 1, m68mv = {1, 6, 0}, m66xi = 48)
/* loaded from: classes.dex */
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7 implements Flow<Integer> {
    final /* synthetic */ int[] $this_asFlow$inlined;

    /* compiled from: SafeCollector.common.kt */
    @Metadata(m69k = 3, m68mv = {1, 6, 0}, m66xi = 48)
    @DebugMetadata(m62c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7", m61f = "Builders.kt", m60i = {0}, m59l = {115}, m58m = "collect", m57n = {"$this$asFlow_u24lambda_u2d13"}, m56s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7$1 */
    /* loaded from: classes.dex */
    public static final class C09671 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C09671(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7.this.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006f -> B:19:0x0072). Please submit an issue!!! */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(FlowCollector<? super Integer> flowCollector, Continuation<? super Unit> continuation) {
        C09671 c09671;
        C09671 c096712;
        int i;
        FlowCollector $this$asFlow_u24lambda_u2d13;
        int[] iArr;
        int $i$f$forEach;
        int i2;
        int[] iArr2;
        FlowCollector $this$asFlow_u24lambda_u2d132;
        if (continuation instanceof C09671) {
            c09671 = (C09671) continuation;
            if ((c09671.label & Integer.MIN_VALUE) != 0) {
                c09671.label -= Integer.MIN_VALUE;
                c096712 = c09671;
                Object $result = c096712.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (c096712.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        int[] $this$forEach$iv = this.$this_asFlow$inlined;
                        i = 0;
                        $this$asFlow_u24lambda_u2d13 = flowCollector;
                        iArr = $this$forEach$iv;
                        $i$f$forEach = $this$forEach$iv.length;
                        break;
                    case 1:
                        $i$f$forEach = c096712.I$1;
                        i2 = c096712.I$0;
                        iArr2 = (int[]) c096712.L$1;
                        ResultKt.throwOnFailure($result);
                        $this$asFlow_u24lambda_u2d132 = (FlowCollector) c096712.L$0;
                        iArr = iArr2;
                        i = i2;
                        $this$asFlow_u24lambda_u2d13 = $this$asFlow_u24lambda_u2d132;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (i < $i$f$forEach) {
                    int value = iArr[i];
                    int i3 = i + 1;
                    Integer boxInt = Boxing.boxInt(value);
                    c096712.L$0 = $this$asFlow_u24lambda_u2d13;
                    c096712.L$1 = iArr;
                    c096712.I$0 = i3;
                    c096712.I$1 = $i$f$forEach;
                    c096712.label = 1;
                    if ($this$asFlow_u24lambda_u2d13.emit(boxInt, c096712) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i2 = i3;
                    iArr2 = iArr;
                    $this$asFlow_u24lambda_u2d132 = $this$asFlow_u24lambda_u2d13;
                    iArr = iArr2;
                    i = i2;
                    $this$asFlow_u24lambda_u2d13 = $this$asFlow_u24lambda_u2d132;
                    if (i < $i$f$forEach) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
        c09671 = new C09671(continuation);
        c096712 = c09671;
        Object $result2 = c096712.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c096712.label) {
        }
        if (i < $i$f$forEach) {
        }
    }

    public FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7(int[] iArr) {
        this.$this_asFlow$inlined = iArr;
    }
}

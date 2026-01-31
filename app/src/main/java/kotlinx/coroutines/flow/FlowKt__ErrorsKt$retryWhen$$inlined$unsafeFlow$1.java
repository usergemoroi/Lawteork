package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.InlineMarker;
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SafeCollector.common.kt */
@Metadata(m71d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, m70d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m69k = 1, m68mv = {1, 6, 0}, m66xi = 48)
/* loaded from: classes.dex */
public final class FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1<T> implements Flow<T> {
    final /* synthetic */ Function4 $predicate$inlined;
    final /* synthetic */ Flow $this_retryWhen$inlined;

    /* compiled from: SafeCollector.common.kt */
    @Metadata(m69k = 3, m68mv = {1, 6, 0}, m66xi = 48)
    @DebugMetadata(m62c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", m61f = "Errors.kt", m60i = {0, 0, 0, 0, 1, 1, 1, 1}, m59l = {117, 119}, m58m = "collect", m57n = {"this", "$this$retryWhen_u24lambda_u2d2", "attempt", "shallRetry", "this", "$this$retryWhen_u24lambda_u2d2", "cause", "attempt"}, m56s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 */
    /* loaded from: classes.dex */
    public static final class C09791 extends ContinuationImpl {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C09791(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00ab -> B:25:0x00af). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c5 -> B:30:0x00cc). Please submit an issue!!! */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        C09791 c09791;
        C09791 c097912;
        int $this$retryWhen_u24lambda_u2d2;
        long attempt;
        FlowCollector<? super T> flowCollector2;
        FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1;
        int i;
        Object obj;
        Object $result;
        Throwable cause;
        Throwable cause2;
        FlowCollector<? super T> flowCollector3;
        if (continuation instanceof C09791) {
            c09791 = (C09791) continuation;
            if ((c09791.label & Integer.MIN_VALUE) != 0) {
                c09791.label -= Integer.MIN_VALUE;
                c097912 = c09791;
                Object $result2 = c097912.result;
                Object $result3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (c097912.label) {
                    case 0:
                        ResultKt.throwOnFailure($result2);
                        FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12 = this;
                        int i2 = 0;
                        long attempt2 = 0;
                        i = 0;
                        Flow flow = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12.$this_retryWhen$inlined;
                        c097912.L$0 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12;
                        c097912.L$1 = flowCollector;
                        c097912.L$2 = null;
                        c097912.J$0 = attempt2;
                        c097912.I$0 = 0;
                        c097912.label = 1;
                        Object catchImpl = FlowKt.catchImpl(flow, flowCollector, c097912);
                        if (catchImpl == $result3) {
                            return $result3;
                        }
                        flowCollector2 = flowCollector;
                        $this$retryWhen_u24lambda_u2d2 = i2;
                        attempt = attempt2;
                        Object obj2 = $result3;
                        $result = $result2;
                        $result2 = catchImpl;
                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12;
                        obj = obj2;
                        cause = (Throwable) $result2;
                        if (cause == null) {
                            Function4 function4 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.$predicate$inlined;
                            Long boxLong = Boxing.boxLong(attempt);
                            c097912.L$0 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1;
                            c097912.L$1 = flowCollector2;
                            c097912.L$2 = cause;
                            c097912.J$0 = attempt;
                            c097912.label = 2;
                            InlineMarker.mark(6);
                            Object invoke = function4.invoke(flowCollector2, cause, boxLong, c097912);
                            InlineMarker.mark(7);
                            if (invoke == obj) {
                                return obj;
                            }
                            FlowCollector<? super T> flowCollector4 = flowCollector2;
                            cause2 = cause;
                            $result2 = invoke;
                            flowCollector3 = flowCollector4;
                            if (((Boolean) $result2).booleanValue()) {
                                throw cause2;
                            }
                            attempt2 = attempt + 1;
                            i2 = $this$retryWhen_u24lambda_u2d2;
                            flowCollector = flowCollector3;
                            i = 1;
                            $result2 = $result;
                            $result3 = obj;
                            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1;
                            if (i == 0) {
                                return Unit.INSTANCE;
                            }
                            i = 0;
                            Flow flow2 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12.$this_retryWhen$inlined;
                            c097912.L$0 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12;
                            c097912.L$1 = flowCollector;
                            c097912.L$2 = null;
                            c097912.J$0 = attempt2;
                            c097912.I$0 = 0;
                            c097912.label = 1;
                            Object catchImpl2 = FlowKt.catchImpl(flow2, flowCollector, c097912);
                            if (catchImpl2 == $result3) {
                            }
                        } else {
                            $result2 = $result;
                            $result3 = obj;
                            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1;
                            long j = attempt;
                            i2 = $this$retryWhen_u24lambda_u2d2;
                            flowCollector = flowCollector2;
                            attempt2 = j;
                            if (i == 0) {
                            }
                            i = 0;
                            Flow flow22 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12.$this_retryWhen$inlined;
                            c097912.L$0 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12;
                            c097912.L$1 = flowCollector;
                            c097912.L$2 = null;
                            c097912.J$0 = attempt2;
                            c097912.I$0 = 0;
                            c097912.label = 1;
                            Object catchImpl22 = FlowKt.catchImpl(flow22, flowCollector, c097912);
                            if (catchImpl22 == $result3) {
                            }
                        }
                    case 1:
                        $this$retryWhen_u24lambda_u2d2 = 0;
                        int i3 = c097912.I$0;
                        attempt = c097912.J$0;
                        flowCollector2 = (FlowCollector) c097912.L$1;
                        ResultKt.throwOnFailure($result2);
                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 = (FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) c097912.L$0;
                        i = i3;
                        obj = $result3;
                        $result = $result2;
                        cause = (Throwable) $result2;
                        if (cause == null) {
                        }
                        break;
                    case 2:
                        $this$retryWhen_u24lambda_u2d2 = 0;
                        long attempt3 = c097912.J$0;
                        ResultKt.throwOnFailure($result2);
                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 = (FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) c097912.L$0;
                        flowCollector3 = (FlowCollector) c097912.L$1;
                        cause2 = (Throwable) c097912.L$2;
                        attempt = attempt3;
                        obj = $result3;
                        $result = $result2;
                        if (((Boolean) $result2).booleanValue()) {
                        }
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        c09791 = new C09791(continuation);
        c097912 = c09791;
        Object $result22 = c097912.result;
        Object $result32 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c097912.label) {
        }
    }

    public FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(Flow flow, Function4 function4) {
        this.$this_retryWhen$inlined = flow;
        this.$predicate$inlined = function4;
    }
}

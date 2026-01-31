package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: SafeCollector.common.kt */
@Metadata(m71d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, m70d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1"}, m69k = 1, m68mv = {1, 6, 0}, m66xi = 176)
/* loaded from: classes.dex */
public final class FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1<R> implements Flow<R> {
    final /* synthetic */ Flow $this_unsafeTransform$inlined;
    final /* synthetic */ Function2 $transform$inlined$1;

    /* compiled from: Emitters.kt */
    @Metadata(m71d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m70d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1"}, m69k = 3, m68mv = {1, 6, 0}, m66xi = 176)
    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2 */
    /* loaded from: classes.dex */
    public static final class C10092<T> implements FlowCollector, SuspendFunction {
        final /* synthetic */ FlowCollector $this_unsafeFlow;
        final /* synthetic */ Function2 $transform$inlined;

        /* compiled from: Emitters.kt */
        @Metadata(m69k = 3, m68mv = {1, 6, 0}, m66xi = 176)
        @DebugMetadata(m62c = "kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2", m61f = "Transform.kt", m60i = {0}, m59l = {223, 224}, m58m = "emit", m57n = {"$this$mapNotNull_u24lambda_u2d5"}, m56s = {"L$0"})
        /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2$1 */
        /* loaded from: classes.dex */
        public static final class C10101 extends ContinuationImpl {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public C10101(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return C10092.this.emit(null, this);
            }
        }

        public C10092(FlowCollector flowCollector, Function2 function2) {
            this.$this_unsafeFlow = flowCollector;
            this.$transform$inlined = function2;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            C10101 c10101;
            C10101 c101012;
            boolean z;
            Object transformed;
            FlowCollector $this$mapNotNull_u24lambda_u2d5;
            if (continuation instanceof C10101) {
                c10101 = (C10101) continuation;
                if ((c10101.label & Integer.MIN_VALUE) != 0) {
                    c10101.label -= Integer.MIN_VALUE;
                    c101012 = c10101;
                    Object $result = c101012.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (c101012.label) {
                        case 0:
                            ResultKt.throwOnFailure($result);
                            FlowCollector $this$mapNotNull_u24lambda_u2d52 = this.$this_unsafeFlow;
                            z = false;
                            Function2 function2 = this.$transform$inlined;
                            c101012.L$0 = $this$mapNotNull_u24lambda_u2d52;
                            c101012.label = 1;
                            transformed = function2.invoke(t, c101012);
                            if (transformed == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            $this$mapNotNull_u24lambda_u2d5 = $this$mapNotNull_u24lambda_u2d52;
                            if (transformed != null) {
                                c101012.L$0 = null;
                                c101012.label = 2;
                                if ($this$mapNotNull_u24lambda_u2d5.emit(transformed, c101012) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        case 1:
                            $this$mapNotNull_u24lambda_u2d5 = (FlowCollector) c101012.L$0;
                            ResultKt.throwOnFailure($result);
                            z = false;
                            transformed = $result;
                            if (transformed != null) {
                            }
                            return Unit.INSTANCE;
                        case 2:
                            ResultKt.throwOnFailure($result);
                            return Unit.INSTANCE;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            c10101 = new C10101(continuation);
            c101012 = c10101;
            Object $result2 = c101012.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (c101012.label) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object emit$$forInline(Object value, Continuation $completion) {
            InlineMarker.mark(4);
            new C10101($completion);
            InlineMarker.mark(5);
            FlowCollector $this$mapNotNull_u24lambda_u2d5 = this.$this_unsafeFlow;
            Object transformed = this.$transform$inlined.invoke(value, $completion);
            if (transformed != null) {
                InlineMarker.mark(0);
                $this$mapNotNull_u24lambda_u2d5.emit(transformed, $completion);
                InlineMarker.mark(1);
            }
            return Unit.INSTANCE;
        }
    }

    public FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1(Flow flow, Function2 function2) {
        this.$this_unsafeTransform$inlined = flow;
        this.$transform$inlined$1 = function2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector collector, Continuation $completion) {
        Object collect = this.$this_unsafeTransform$inlined.collect(new C10092(collector, this.$transform$inlined$1), $completion);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    public Object collect$$forInline(FlowCollector collector, Continuation $completion) {
        InlineMarker.mark(4);
        new ContinuationImpl($completion) { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1.1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1.this.collect(null, this);
            }
        };
        InlineMarker.mark(5);
        InlineMarker.mark(0);
        this.$this_unsafeTransform$inlined.collect(new C10092(collector, this.$transform$inlined$1), $completion);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }
}

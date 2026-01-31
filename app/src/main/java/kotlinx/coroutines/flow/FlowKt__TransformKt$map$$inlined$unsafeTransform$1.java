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
public final class FlowKt__TransformKt$map$$inlined$unsafeTransform$1<R> implements Flow<R> {
    final /* synthetic */ Flow $this_unsafeTransform$inlined;
    final /* synthetic */ Function2 $transform$inlined$1;

    /* compiled from: Emitters.kt */
    @Metadata(m71d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m70d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1"}, m69k = 3, m68mv = {1, 6, 0}, m66xi = 176)
    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2 */
    /* loaded from: classes.dex */
    public static final class C10062<T> implements FlowCollector, SuspendFunction {
        final /* synthetic */ FlowCollector $this_unsafeFlow;
        final /* synthetic */ Function2 $transform$inlined;

        /* compiled from: Emitters.kt */
        @Metadata(m69k = 3, m68mv = {1, 6, 0}, m66xi = 176)
        @DebugMetadata(m62c = "kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", m61f = "Transform.kt", m60i = {}, m59l = {223, 223}, m58m = "emit", m57n = {}, m56s = {})
        /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1 */
        /* loaded from: classes.dex */
        public static final class C10071 extends ContinuationImpl {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public C10071(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return C10062.this.emit(null, this);
            }
        }

        public C10062(FlowCollector flowCollector, Function2 function2) {
            this.$this_unsafeFlow = flowCollector;
            this.$transform$inlined = function2;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0062 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            C10071 c10071;
            C10071 c100712;
            boolean z;
            Object value;
            FlowCollector flowCollector;
            if (continuation instanceof C10071) {
                c10071 = (C10071) continuation;
                if ((c10071.label & Integer.MIN_VALUE) != 0) {
                    c10071.label -= Integer.MIN_VALUE;
                    c100712 = c10071;
                    Object $result = c100712.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (c100712.label) {
                        case 0:
                            ResultKt.throwOnFailure($result);
                            FlowCollector $this$map_u24lambda_u2d4 = this.$this_unsafeFlow;
                            z = false;
                            Function2 function2 = this.$transform$inlined;
                            c100712.L$0 = $this$map_u24lambda_u2d4;
                            c100712.label = 1;
                            value = function2.invoke(t, c100712);
                            if (value == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            flowCollector = $this$map_u24lambda_u2d4;
                            c100712.L$0 = null;
                            c100712.label = 2;
                            return flowCollector.emit(value, c100712) != coroutine_suspended ? coroutine_suspended : Unit.INSTANCE;
                        case 1:
                            flowCollector = (FlowCollector) c100712.L$0;
                            ResultKt.throwOnFailure($result);
                            z = false;
                            value = $result;
                            c100712.L$0 = null;
                            c100712.label = 2;
                            if (flowCollector.emit(value, c100712) != coroutine_suspended) {
                            }
                            break;
                        case 2:
                            ResultKt.throwOnFailure($result);
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            c10071 = new C10071(continuation);
            c100712 = c10071;
            Object $result2 = c100712.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (c100712.label) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object emit$$forInline(Object value, Continuation $completion) {
            InlineMarker.mark(4);
            new C10071($completion);
            InlineMarker.mark(5);
            FlowCollector $this$map_u24lambda_u2d4 = this.$this_unsafeFlow;
            Object invoke = this.$transform$inlined.invoke(value, $completion);
            InlineMarker.mark(0);
            $this$map_u24lambda_u2d4.emit(invoke, $completion);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    public FlowKt__TransformKt$map$$inlined$unsafeTransform$1(Flow flow, Function2 function2) {
        this.$this_unsafeTransform$inlined = flow;
        this.$transform$inlined$1 = function2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector collector, Continuation $completion) {
        Object collect = this.$this_unsafeTransform$inlined.collect(new C10062(collector, this.$transform$inlined$1), $completion);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    public Object collect$$forInline(FlowCollector collector, Continuation $completion) {
        InlineMarker.mark(4);
        new ContinuationImpl($completion) { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1.1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__TransformKt$map$$inlined$unsafeTransform$1.this.collect(null, this);
            }
        };
        InlineMarker.mark(5);
        InlineMarker.mark(0);
        this.$this_unsafeTransform$inlined.collect(new C10062(collector, this.$transform$inlined$1), $completion);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }
}

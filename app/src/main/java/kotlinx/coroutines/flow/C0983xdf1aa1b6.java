package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.flow.internal.AbortFlowException;
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Limit.kt */
@Metadata(m71d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, m70d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m69k = 1, m68mv = {1, 6, 0}, m66xi = 48)
/* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 */
/* loaded from: classes.dex */
public final class C0983xdf1aa1b6<T> implements FlowCollector<T> {
    final /* synthetic */ FlowCollector $$this$flow$inlined;
    final /* synthetic */ Function3 $transform$inlined;

    /* compiled from: Limit.kt */
    @Metadata(m69k = 3, m68mv = {1, 6, 0}, m66xi = 48)
    @DebugMetadata(m62c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", m61f = "Limit.kt", m60i = {0}, m59l = {143}, m58m = "emit", m57n = {"this"}, m56s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1 */
    /* loaded from: classes.dex */
    public static final class C09841 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C09841(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C0983xdf1aa1b6.this.emit(null, this);
        }
    }

    public C0983xdf1aa1b6(Function3 function3, FlowCollector flowCollector) {
        this.$transform$inlined = function3;
        this.$$this$flow$inlined = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(T t, Continuation<? super Unit> continuation) {
        C09841 c09841;
        C09841 c098412;
        Object invoke;
        C0983xdf1aa1b6<T> c0983xdf1aa1b6;
        if (continuation instanceof C09841) {
            c09841 = (C09841) continuation;
            if ((c09841.label & Integer.MIN_VALUE) != 0) {
                c09841.label -= Integer.MIN_VALUE;
                c098412 = c09841;
                Object $result = c098412.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (c098412.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        Function3 function3 = this.$transform$inlined;
                        FlowCollector flowCollector = this.$$this$flow$inlined;
                        c098412.L$0 = this;
                        c098412.label = 1;
                        InlineMarker.mark(6);
                        invoke = function3.invoke(flowCollector, t, c098412);
                        InlineMarker.mark(7);
                        if (invoke != coroutine_suspended) {
                            c0983xdf1aa1b6 = this;
                            break;
                        } else {
                            return coroutine_suspended;
                        }
                    case 1:
                        c0983xdf1aa1b6 = (C0983xdf1aa1b6) c098412.L$0;
                        ResultKt.throwOnFailure($result);
                        invoke = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (((Boolean) invoke).booleanValue()) {
                    throw new AbortFlowException(c0983xdf1aa1b6);
                }
                return Unit.INSTANCE;
            }
        }
        c09841 = new C09841(continuation);
        c098412 = c09841;
        Object $result2 = c098412.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c098412.label) {
        }
        if (((Boolean) invoke).booleanValue()) {
        }
    }
}

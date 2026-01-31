package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.flow.internal.AbortFlowException;
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Limit.kt */
@Metadata(m71d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, m70d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m69k = 1, m68mv = {1, 6, 0}, m66xi = 48)
/* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1  reason: invalid class name */
/* loaded from: classes.dex */
public final class FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1<T> implements FlowCollector<T> {
    final /* synthetic */ Function2 $predicate$inlined;
    final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;

    /* compiled from: Limit.kt */
    @Metadata(m69k = 3, m68mv = {1, 6, 0}, m66xi = 48)
    @DebugMetadata(m62c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1", m61f = "Limit.kt", m60i = {0, 0, 1}, m59l = {143, 144}, m58m = "emit", m57n = {"this", "value", "this"}, m56s = {"L$0", "L$1", "L$0"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1$1 */
    /* loaded from: classes.dex */
    public static final class C09821 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C09821(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1.this.emit(null, this);
        }
    }

    public FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1(Function2 function2, FlowCollector flowCollector) {
        this.$predicate$inlined = function2;
        this.$this_unsafeFlow$inlined = flowCollector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(T t, Continuation<? super Unit> continuation) {
        C09821 c09821;
        C09821 c098212;
        FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1;
        Object invoke;
        T t2;
        FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$12;
        if (continuation instanceof C09821) {
            c09821 = (C09821) continuation;
            if ((c09821.label & Integer.MIN_VALUE) != 0) {
                c09821.label -= Integer.MIN_VALUE;
                c098212 = c09821;
                Object $result = c098212.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                boolean z = true;
                switch (c098212.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1 = this;
                        Function2 function2 = flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1.$predicate$inlined;
                        c098212.L$0 = flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1;
                        c098212.L$1 = t;
                        c098212.label = 1;
                        InlineMarker.mark(6);
                        invoke = function2.invoke(t, c098212);
                        InlineMarker.mark(7);
                        if (invoke != coroutine_suspended) {
                            t2 = t;
                            break;
                        } else {
                            return coroutine_suspended;
                        }
                    case 1:
                        Object value = c098212.L$1;
                        FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$13 = (FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1) c098212.L$0;
                        ResultKt.throwOnFailure($result);
                        invoke = $result;
                        t2 = value;
                        flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1 = flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$13;
                        break;
                    case 2:
                        flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$12 = (FlowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1) c098212.L$0;
                        ResultKt.throwOnFailure($result);
                        flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1 = flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$12;
                        if (!z) {
                            throw new AbortFlowException(flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1);
                        }
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (!((Boolean) invoke).booleanValue()) {
                    FlowCollector flowCollector = flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1.$this_unsafeFlow$inlined;
                    c098212.L$0 = flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1;
                    c098212.L$1 = null;
                    c098212.label = 2;
                    Object value2 = flowCollector.emit(t2, c098212);
                    if (value2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$12 = flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1;
                    flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$1 = flowKt__LimitKt$takeWhile$lambda6$$inlined$collectWhile$12;
                    if (!z) {
                    }
                } else {
                    z = false;
                    if (!z) {
                    }
                }
            }
        }
        c09821 = new C09821(continuation);
        c098212 = c09821;
        Object $result2 = c098212.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean z2 = true;
        switch (c098212.label) {
        }
        if (!((Boolean) invoke).booleanValue()) {
        }
    }
}

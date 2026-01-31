package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SafeCollector.common.kt */
@Metadata(m71d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, m70d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m69k = 1, m68mv = {1, 6, 0}, m66xi = 48)
/* loaded from: classes.dex */
public final class FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1<T> implements Flow<T> {
    final /* synthetic */ Object[] $elements$inlined;

    /* compiled from: SafeCollector.common.kt */
    @Metadata(m69k = 3, m68mv = {1, 6, 0}, m66xi = 48)
    @DebugMetadata(m62c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", m61f = "Builders.kt", m60i = {0, 0}, m59l = {114}, m58m = "collect", m57n = {"this", "$this$flowOf_u24lambda_u2d8"}, m56s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 */
    /* loaded from: classes.dex */
    public static final class C09701 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C09701(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        C09701 c09701;
        C09701 c097012;
        int i;
        FlowCollector<? super T> flowCollector2;
        FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1 flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1;
        int length;
        if (continuation instanceof C09701) {
            c09701 = (C09701) continuation;
            if ((c09701.label & Integer.MIN_VALUE) != 0) {
                c09701.label -= Integer.MIN_VALUE;
                c097012 = c09701;
                Object $result = c097012.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (c097012.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        i = 0;
                        flowCollector2 = flowCollector;
                        flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1 = this;
                        length = this.$elements$inlined.length;
                        break;
                    case 1:
                        length = c097012.I$1;
                        int i2 = c097012.I$0;
                        flowCollector2 = (FlowCollector) c097012.L$1;
                        FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1 flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$12 = (FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1) c097012.L$0;
                        ResultKt.throwOnFailure($result);
                        i = i2;
                        flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1 = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$12;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                while (i < length) {
                    Object element = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1.$elements$inlined[i];
                    i++;
                    c097012.L$0 = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1;
                    c097012.L$1 = flowCollector2;
                    c097012.I$0 = i;
                    c097012.I$1 = length;
                    c097012.label = 1;
                    if (flowCollector2.emit(element, c097012) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        c09701 = new C09701(continuation);
        c097012 = c09701;
        Object $result2 = c097012.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c097012.label) {
        }
        while (i < length) {
        }
        return Unit.INSTANCE;
    }

    public FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1(Object[] objArr) {
        this.$elements$inlined = objArr;
    }
}

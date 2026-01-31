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
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6<T> implements Flow<T> {
    final /* synthetic */ Object[] $this_asFlow$inlined;

    /* compiled from: SafeCollector.common.kt */
    @Metadata(m69k = 3, m68mv = {1, 6, 0}, m66xi = 48)
    @DebugMetadata(m62c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6", m61f = "Builders.kt", m60i = {0}, m59l = {115}, m58m = "collect", m57n = {"$this$asFlow_u24lambda_u2d11"}, m56s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6$1 */
    /* loaded from: classes.dex */
    public static final class C09661 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C09661(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6.this.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006b -> B:19:0x006e). Please submit an issue!!! */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        C09661 c09661;
        C09661 c096612;
        int i;
        FlowCollector<? super T> flowCollector2;
        Object[] objArr;
        int $i$f$forEach;
        int i2;
        Object[] objArr2;
        FlowCollector<? super T> flowCollector3;
        if (continuation instanceof C09661) {
            c09661 = (C09661) continuation;
            if ((c09661.label & Integer.MIN_VALUE) != 0) {
                c09661.label -= Integer.MIN_VALUE;
                c096612 = c09661;
                Object $result = c096612.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (c096612.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        Object[] $this$forEach$iv = this.$this_asFlow$inlined;
                        i = 0;
                        flowCollector2 = flowCollector;
                        objArr = $this$forEach$iv;
                        $i$f$forEach = $this$forEach$iv.length;
                        break;
                    case 1:
                        $i$f$forEach = c096612.I$1;
                        i2 = c096612.I$0;
                        objArr2 = (Object[]) c096612.L$1;
                        ResultKt.throwOnFailure($result);
                        flowCollector3 = (FlowCollector) c096612.L$0;
                        objArr = objArr2;
                        i = i2;
                        flowCollector2 = flowCollector3;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (i < $i$f$forEach) {
                    Object value = objArr[i];
                    int i3 = i + 1;
                    c096612.L$0 = flowCollector2;
                    c096612.L$1 = objArr;
                    c096612.I$0 = i3;
                    c096612.I$1 = $i$f$forEach;
                    c096612.label = 1;
                    if (flowCollector2.emit(value, c096612) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i2 = i3;
                    objArr2 = objArr;
                    flowCollector3 = flowCollector2;
                    objArr = objArr2;
                    i = i2;
                    flowCollector2 = flowCollector3;
                    if (i < $i$f$forEach) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
        c09661 = new C09661(continuation);
        c096612 = c09661;
        Object $result2 = c096612.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c096612.label) {
        }
        if (i < $i$f$forEach) {
        }
    }

    public FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6(Object[] objArr) {
        this.$this_asFlow$inlined = objArr;
    }
}

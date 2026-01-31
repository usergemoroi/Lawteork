package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StateFlow.kt */
@Metadata(m71d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u0010062\b\u0012\u0004\u0012\u00028\u0000072\b\u0012\u0004\u0012\u00028\u0000082\b\u0012\u0004\u0012\u00028\u000009B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0019H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b&\u0010'J!\u0010*\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u00022\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010\u000fR\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R*\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b4\u0010%\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, m70d2 = {"Lkotlinx/coroutines/flow/StateFlowImpl;", "T", "", "initialState", "<init>", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expect", "update", "", "compareAndSet", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/StateFlowSlot;", "createSlot", "()Lkotlinx/coroutines/flow/StateFlowSlot;", "", "size", "", "createSlotArray", "(I)[Lkotlinx/coroutines/flow/StateFlowSlot;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/Flow;", "fuse", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/Flow;", "resetReplayCache", "()V", "tryEmit", "(Ljava/lang/Object;)Z", "expectedState", "newState", "updateState", "", "getReplayCache", "()Ljava/util/List;", "replayCache", "sequence", "I", "getValue", "()Ljava/lang/Object;", "setValue", "getValue$annotations", "kotlinx-coroutines-core", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;"}, m69k = 1, m68mv = {1, 6, 0}, m66xi = 48)
/* loaded from: classes.dex */
public final class StateFlowImpl<T> extends AbstractSharedFlow<StateFlowSlot> implements MutableStateFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    private volatile /* synthetic */ Object _state;
    private int sequence;

    public static /* synthetic */ void getValue$annotations() {
    }

    public StateFlowImpl(Object initialState) {
        this._state = initialState;
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow, kotlinx.coroutines.flow.StateFlow
    public T getValue() {
        Symbol this_$iv = NullSurrogateKt.NULL;
        T t = (T) this._state;
        if (t == this_$iv) {
            return null;
        }
        return t;
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public void setValue(T t) {
        updateState(null, t == null ? NullSurrogateKt.NULL : t);
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public boolean compareAndSet(T t, T t2) {
        return updateState(t == null ? NullSurrogateKt.NULL : t, t2 == null ? NullSurrogateKt.NULL : t2);
    }

    private final boolean updateState(Object expectedState, Object newState) {
        getSlots();
        synchronized (this) {
            Object oldState = this._state;
            if (expectedState != null && !Intrinsics.areEqual(oldState, expectedState)) {
                return false;
            }
            if (Intrinsics.areEqual(oldState, newState)) {
                return true;
            }
            this._state = newState;
            int curSequence = this.sequence;
            if ((curSequence & 1) == 0) {
                int curSequence2 = curSequence + 1;
                this.sequence = curSequence2;
                Object curSlots = getSlots();
                Unit unit = Unit.INSTANCE;
                while (true) {
                    StateFlowSlot[] stateFlowSlotArr = (StateFlowSlot[]) curSlots;
                    if (stateFlowSlotArr != null) {
                        int length = stateFlowSlotArr.length;
                        int i = 0;
                        while (i < length) {
                            StateFlowSlot stateFlowSlot = stateFlowSlotArr[i];
                            i++;
                            if (stateFlowSlot != null) {
                                stateFlowSlot.makePending();
                            }
                        }
                    }
                    synchronized (this) {
                        int i2 = this.sequence;
                        if (i2 == curSequence2) {
                            this.sequence = curSequence2 + 1;
                            return true;
                        }
                        curSequence2 = i2;
                        curSlots = getSlots();
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
            } else {
                this.sequence = curSequence + 2;
                return true;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<T> getReplayCache() {
        return CollectionsKt.listOf(getValue());
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T t) {
        setValue(t);
        return true;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, Continuation<? super Unit> continuation) {
        setValue(t);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b5, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11, r6) == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac A[Catch: all -> 0x00f1, TryCatch #0 {all -> 0x00f1, blocks: (B:13:0x003f, B:29:0x00a6, B:34:0x00b1, B:45:0x00d6, B:47:0x00dc, B:36:0x00b7, B:40:0x00bf, B:32:0x00ac, B:16:0x0056, B:19:0x006a, B:28:0x0093, B:22:0x007b, B:24:0x007f), top: B:54:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1 A[Catch: all -> 0x00f1, TryCatch #0 {all -> 0x00f1, blocks: (B:13:0x003f, B:29:0x00a6, B:34:0x00b1, B:45:0x00d6, B:47:0x00dc, B:36:0x00b7, B:40:0x00bf, B:32:0x00ac, B:16:0x0056, B:19:0x006a, B:28:0x0093, B:22:0x007b, B:24:0x007f), top: B:54:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc A[Catch: all -> 0x00f1, TRY_LEAVE, TryCatch #0 {all -> 0x00f1, blocks: (B:13:0x003f, B:29:0x00a6, B:34:0x00b1, B:45:0x00d6, B:47:0x00dc, B:36:0x00b7, B:40:0x00bf, B:32:0x00ac, B:16:0x0056, B:19:0x006a, B:28:0x0093, B:22:0x007b, B:24:0x007f), top: B:54:0x0022 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00da -> B:29:0x00a6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00ed -> B:29:0x00a6). Please submit an issue!!! */
    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<?> continuation) {
        StateFlowImpl$collect$1 stateFlowImpl$collect$1;
        StateFlowImpl$collect$1 stateFlowImpl$collect$12;
        Object coroutine_suspended;
        StateFlowImpl stateFlowImpl;
        StateFlowSlot slot;
        FlowCollector<? super T> flowCollector2;
        Job collectorJob;
        Object oldState;
        Object newState;
        FlowCollector collector;
        FlowCollector<? super T> flowCollector3;
        Object obj;
        try {
            if (continuation instanceof StateFlowImpl$collect$1) {
                stateFlowImpl$collect$1 = (StateFlowImpl$collect$1) continuation;
                if ((stateFlowImpl$collect$1.label & Integer.MIN_VALUE) != 0) {
                    stateFlowImpl$collect$1.label -= Integer.MIN_VALUE;
                    stateFlowImpl$collect$12 = stateFlowImpl$collect$1;
                    Object $result = stateFlowImpl$collect$12.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (stateFlowImpl$collect$12.label) {
                        case 0:
                            ResultKt.throwOnFailure($result);
                            stateFlowImpl = this;
                            FlowCollector<? super T> flowCollector4 = flowCollector;
                            slot = stateFlowImpl.allocateSlot();
                            boolean z = flowCollector4 instanceof SubscribedFlowCollector;
                            flowCollector2 = flowCollector4;
                            if (z) {
                                stateFlowImpl$collect$12.L$0 = stateFlowImpl;
                                stateFlowImpl$collect$12.L$1 = flowCollector4;
                                stateFlowImpl$collect$12.L$2 = slot;
                                stateFlowImpl$collect$12.label = 1;
                                Object onSubscription = ((SubscribedFlowCollector) flowCollector4).onSubscription(stateFlowImpl$collect$12);
                                flowCollector2 = flowCollector4;
                                if (onSubscription == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            Job collectorJob2 = (Job) stateFlowImpl$collect$12.getContext().get(Job.Key);
                            collectorJob = collectorJob2;
                            oldState = null;
                            collector = flowCollector2;
                            break;
                        case 1:
                            Object newState2 = stateFlowImpl$collect$12.L$2;
                            slot = (StateFlowSlot) newState2;
                            FlowCollector<? super T> flowCollector5 = (FlowCollector) stateFlowImpl$collect$12.L$1;
                            stateFlowImpl = (StateFlowImpl) stateFlowImpl$collect$12.L$0;
                            ResultKt.throwOnFailure($result);
                            flowCollector2 = flowCollector5;
                            Job collectorJob22 = (Job) stateFlowImpl$collect$12.getContext().get(Job.Key);
                            collectorJob = collectorJob22;
                            oldState = null;
                            collector = flowCollector2;
                            break;
                        case 2:
                            newState = stateFlowImpl$collect$12.L$4;
                            collectorJob = (Job) stateFlowImpl$collect$12.L$3;
                            slot = (StateFlowSlot) stateFlowImpl$collect$12.L$2;
                            collector = (FlowCollector) stateFlowImpl$collect$12.L$1;
                            stateFlowImpl = (StateFlowImpl) stateFlowImpl$collect$12.L$0;
                            ResultKt.throwOnFailure($result);
                            oldState = newState;
                            flowCollector3 = collector;
                            collector = flowCollector3;
                            if (!slot.takePending()) {
                                stateFlowImpl$collect$12.L$0 = stateFlowImpl;
                                stateFlowImpl$collect$12.L$1 = flowCollector3;
                                stateFlowImpl$collect$12.L$2 = slot;
                                stateFlowImpl$collect$12.L$3 = collectorJob;
                                stateFlowImpl$collect$12.L$4 = oldState;
                                stateFlowImpl$collect$12.label = 3;
                                collector = flowCollector3;
                                if (slot.awaitPending(stateFlowImpl$collect$12) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            break;
                        case 3:
                            oldState = stateFlowImpl$collect$12.L$4;
                            collectorJob = (Job) stateFlowImpl$collect$12.L$3;
                            slot = (StateFlowSlot) stateFlowImpl$collect$12.L$2;
                            FlowCollector flowCollector6 = (FlowCollector) stateFlowImpl$collect$12.L$1;
                            stateFlowImpl = (StateFlowImpl) stateFlowImpl$collect$12.L$0;
                            ResultKt.throwOnFailure($result);
                            collector = flowCollector6;
                            break;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object newState3 = stateFlowImpl._state;
                    if (collectorJob != null) {
                        JobKt.ensureActive(collectorJob);
                    }
                    if (oldState != null) {
                        flowCollector3 = collector;
                    }
                    Object oldState2 = NullSurrogateKt.NULL;
                    obj = newState3 == oldState2 ? null : newState3;
                    stateFlowImpl$collect$12.L$0 = stateFlowImpl;
                    stateFlowImpl$collect$12.L$1 = collector;
                    stateFlowImpl$collect$12.L$2 = slot;
                    stateFlowImpl$collect$12.L$3 = collectorJob;
                    stateFlowImpl$collect$12.L$4 = newState3;
                    stateFlowImpl$collect$12.label = 2;
                    if (collector.emit(obj, stateFlowImpl$collect$12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    newState = newState3;
                    oldState = newState;
                    flowCollector3 = collector;
                    collector = flowCollector3;
                    if (!slot.takePending()) {
                    }
                    Object newState32 = stateFlowImpl._state;
                    if (collectorJob != null) {
                    }
                    if (oldState != null) {
                    }
                    Object oldState22 = NullSurrogateKt.NULL;
                    if (newState32 == oldState22) {
                    }
                    stateFlowImpl$collect$12.L$0 = stateFlowImpl;
                    stateFlowImpl$collect$12.L$1 = collector;
                    stateFlowImpl$collect$12.L$2 = slot;
                    stateFlowImpl$collect$12.L$3 = collectorJob;
                    stateFlowImpl$collect$12.L$4 = newState32;
                    stateFlowImpl$collect$12.label = 2;
                    if (collector.emit(obj, stateFlowImpl$collect$12) == coroutine_suspended) {
                    }
                }
            }
            switch (stateFlowImpl$collect$12.label) {
            }
            Object newState322 = stateFlowImpl._state;
            if (collectorJob != null) {
            }
            if (oldState != null) {
            }
            Object oldState222 = NullSurrogateKt.NULL;
            if (newState322 == oldState222) {
            }
            stateFlowImpl$collect$12.L$0 = stateFlowImpl;
            stateFlowImpl$collect$12.L$1 = collector;
            stateFlowImpl$collect$12.L$2 = slot;
            stateFlowImpl$collect$12.L$3 = collectorJob;
            stateFlowImpl$collect$12.L$4 = newState322;
            stateFlowImpl$collect$12.label = 2;
            if (collector.emit(obj, stateFlowImpl$collect$12) == coroutine_suspended) {
            }
        } catch (Throwable th) {
            stateFlowImpl.freeSlot(slot);
            throw th;
        }
        stateFlowImpl$collect$1 = new StateFlowImpl$collect$1(this, continuation);
        stateFlowImpl$collect$12 = stateFlowImpl$collect$1;
        Object $result2 = stateFlowImpl$collect$12.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public StateFlowSlot createSlot() {
        return new StateFlowSlot();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public StateFlowSlot[] createSlotArray(int size) {
        return new StateFlowSlot[size];
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow<T> fuse(CoroutineContext context, int capacity, BufferOverflow onBufferOverflow) {
        return StateFlowKt.fuseStateFlow(this, context, capacity, onBufferOverflow);
    }
}

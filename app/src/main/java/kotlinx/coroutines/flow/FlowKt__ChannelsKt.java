package kotlinx.coroutines.flow;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BroadcastChannel;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChannelFlowKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Channels.kt */
@Metadata(m71d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a/\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a9\u0010\u000b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a&\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m70d2 = {"asFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "Lkotlinx/coroutines/channels/BroadcastChannel;", "consumeAsFlow", "Lkotlinx/coroutines/channels/ReceiveChannel;", "emitAll", "", "Lkotlinx/coroutines/flow/FlowCollector;", "channel", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitAllImpl", "consume", "", "emitAllImpl$FlowKt__ChannelsKt", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produceIn", "scope", "Lkotlinx/coroutines/CoroutineScope;", "receiveAsFlow", "kotlinx-coroutines-core"}, m69k = 5, m68mv = {1, 6, 0}, m66xi = 48, m65xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes.dex */
public final /* synthetic */ class FlowKt__ChannelsKt {
    public static final <T> Object emitAll(FlowCollector<? super T> flowCollector, ReceiveChannel<? extends T> receiveChannel, Continuation<? super Unit> continuation) {
        Object emitAllImpl$FlowKt__ChannelsKt = emitAllImpl$FlowKt__ChannelsKt(flowCollector, receiveChannel, true, continuation);
        return emitAllImpl$FlowKt__ChannelsKt == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emitAllImpl$FlowKt__ChannelsKt : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #0 {all -> 0x00b5, blocks: (B:29:0x0084, B:31:0x008a, B:38:0x009c, B:39:0x009d), top: B:52:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #0 {all -> 0x00b5, blocks: (B:29:0x0084, B:31:0x008a, B:38:0x009c, B:39:0x009d), top: B:52:0x0084 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00b1 -> B:23:0x006a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object emitAllImpl$FlowKt__ChannelsKt(FlowCollector<? super T> flowCollector, ReceiveChannel<? extends T> receiveChannel, boolean consume, Continuation<? super Unit> continuation) {
        FlowKt__ChannelsKt$emitAllImpl$1 flowKt__ChannelsKt$emitAllImpl$1;
        FlowKt__ChannelsKt$emitAllImpl$1 flowKt__ChannelsKt$emitAllImpl$12;
        FlowCollector $this$emitAllImpl;
        boolean consume2;
        ReceiveChannel channel;
        Throwable cause;
        boolean consume3;
        Throwable th;
        Object m1775unboximpl;
        FlowCollector $this$emitAllImpl2;
        Throwable cause2;
        Object result;
        if (continuation instanceof FlowKt__ChannelsKt$emitAllImpl$1) {
            flowKt__ChannelsKt$emitAllImpl$1 = (FlowKt__ChannelsKt$emitAllImpl$1) continuation;
            if ((flowKt__ChannelsKt$emitAllImpl$1.label & Integer.MIN_VALUE) != 0) {
                flowKt__ChannelsKt$emitAllImpl$1.label -= Integer.MIN_VALUE;
                flowKt__ChannelsKt$emitAllImpl$12 = flowKt__ChannelsKt$emitAllImpl$1;
                Object $result = flowKt__ChannelsKt$emitAllImpl$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (flowKt__ChannelsKt$emitAllImpl$12.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        FlowKt.ensureActive(flowCollector);
                        $this$emitAllImpl = flowCollector;
                        consume2 = consume;
                        channel = receiveChannel;
                        cause = null;
                        flowKt__ChannelsKt$emitAllImpl$12.L$0 = $this$emitAllImpl;
                        flowKt__ChannelsKt$emitAllImpl$12.L$1 = channel;
                        flowKt__ChannelsKt$emitAllImpl$12.Z$0 = consume2;
                        flowKt__ChannelsKt$emitAllImpl$12.label = 1;
                        m1775unboximpl = channel.mo1756receiveCatchingJP2dKIU(flowKt__ChannelsKt$emitAllImpl$12);
                        if (m1775unboximpl == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        try {
                            Throwable th2 = cause;
                            consume3 = consume2;
                            th = th2;
                            $this$emitAllImpl2 = $this$emitAllImpl;
                            if (!ChannelResult.m1771isClosedimpl(result)) {
                                Throwable it = ChannelResult.m1767exceptionOrNullimpl(result);
                                if (it == null) {
                                    return Unit.INSTANCE;
                                }
                                throw it;
                            }
                            flowKt__ChannelsKt$emitAllImpl$12.L$0 = $this$emitAllImpl2;
                            flowKt__ChannelsKt$emitAllImpl$12.L$1 = channel;
                            flowKt__ChannelsKt$emitAllImpl$12.Z$0 = consume3;
                            flowKt__ChannelsKt$emitAllImpl$12.label = 2;
                            if ($this$emitAllImpl2.emit((Object) ChannelResult.m1769getOrThrowimpl(result), flowKt__ChannelsKt$emitAllImpl$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            boolean z = consume3;
                            cause = cause2;
                            consume2 = z;
                            $this$emitAllImpl = $this$emitAllImpl2;
                            channel = channel;
                            flowKt__ChannelsKt$emitAllImpl$12.L$0 = $this$emitAllImpl;
                            flowKt__ChannelsKt$emitAllImpl$12.L$1 = channel;
                            flowKt__ChannelsKt$emitAllImpl$12.Z$0 = consume2;
                            flowKt__ChannelsKt$emitAllImpl$12.label = 1;
                            m1775unboximpl = channel.mo1756receiveCatchingJP2dKIU(flowKt__ChannelsKt$emitAllImpl$12);
                            if (m1775unboximpl == coroutine_suspended) {
                            }
                        } catch (Throwable th3) {
                            e = th3;
                            consume2 = consume3;
                            Throwable cause3 = e;
                            try {
                                throw e;
                            } finally {
                                if (consume2) {
                                    ChannelsKt.cancelConsumed(channel, cause3);
                                }
                            }
                        }
                        cause2 = th;
                        result = m1775unboximpl;
                    case 1:
                        consume3 = flowKt__ChannelsKt$emitAllImpl$12.Z$0;
                        channel = (ReceiveChannel) flowKt__ChannelsKt$emitAllImpl$12.L$1;
                        FlowCollector flowCollector2 = (FlowCollector) flowKt__ChannelsKt$emitAllImpl$12.L$0;
                        th = null;
                        try {
                            ResultKt.throwOnFailure($result);
                            m1775unboximpl = ((ChannelResult) $result).m1775unboximpl();
                            $this$emitAllImpl2 = flowCollector2;
                            cause2 = th;
                            result = m1775unboximpl;
                            if (!ChannelResult.m1771isClosedimpl(result)) {
                            }
                        } catch (Throwable th4) {
                            e = th4;
                            consume2 = consume3;
                            Throwable cause32 = e;
                            throw e;
                        }
                        break;
                    case 2:
                        consume2 = flowKt__ChannelsKt$emitAllImpl$12.Z$0;
                        cause = null;
                        channel = (ReceiveChannel) flowKt__ChannelsKt$emitAllImpl$12.L$1;
                        FlowCollector flowCollector3 = (FlowCollector) flowKt__ChannelsKt$emitAllImpl$12.L$0;
                        try {
                            ResultKt.throwOnFailure($result);
                            $this$emitAllImpl = flowCollector3;
                            channel = channel;
                            flowKt__ChannelsKt$emitAllImpl$12.L$0 = $this$emitAllImpl;
                            flowKt__ChannelsKt$emitAllImpl$12.L$1 = channel;
                            flowKt__ChannelsKt$emitAllImpl$12.Z$0 = consume2;
                            flowKt__ChannelsKt$emitAllImpl$12.label = 1;
                            m1775unboximpl = channel.mo1756receiveCatchingJP2dKIU(flowKt__ChannelsKt$emitAllImpl$12);
                            if (m1775unboximpl == coroutine_suspended) {
                            }
                        } catch (Throwable th5) {
                            e = th5;
                            Throwable cause322 = e;
                            throw e;
                        }
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        flowKt__ChannelsKt$emitAllImpl$1 = new FlowKt__ChannelsKt$emitAllImpl$1(continuation);
        flowKt__ChannelsKt$emitAllImpl$12 = flowKt__ChannelsKt$emitAllImpl$1;
        Object $result2 = flowKt__ChannelsKt$emitAllImpl$12.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (flowKt__ChannelsKt$emitAllImpl$12.label) {
        }
    }

    public static final <T> Flow<T> receiveAsFlow(ReceiveChannel<? extends T> receiveChannel) {
        return new ChannelAsFlow(receiveChannel, false, null, 0, null, 28, null);
    }

    public static final <T> Flow<T> consumeAsFlow(ReceiveChannel<? extends T> receiveChannel) {
        return new ChannelAsFlow(receiveChannel, true, null, 0, null, 28, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    public static final <T> Flow<T> asFlow(final BroadcastChannel<T> broadcastChannel) {
        return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__ChannelsKt$asFlow$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
                Object emitAll = FlowKt.emitAll(flowCollector, BroadcastChannel.this.openSubscription(), continuation);
                return emitAll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emitAll : Unit.INSTANCE;
            }
        };
    }

    public static final <T> ReceiveChannel<T> produceIn(Flow<? extends T> flow, CoroutineScope scope) {
        return ChannelFlowKt.asChannelFlow(flow).produceImpl(scope);
    }
}

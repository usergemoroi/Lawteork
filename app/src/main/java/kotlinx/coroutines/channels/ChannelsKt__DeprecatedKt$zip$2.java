package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [V] */
/* compiled from: Deprecated.kt */
@Metadata(m71d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u008a@"}, m70d2 = {"<anonymous>", "", "E", "R", "V", "Lkotlinx/coroutines/channels/ProducerScope;"}, m69k = 3, m68mv = {1, 6, 0}, m66xi = 48)
@DebugMetadata(m62c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", m61f = "Deprecated.kt", m60i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, m59l = {487, 469, 471}, m58m = "invokeSuspend", m57n = {"$this$produce", "otherIterator", "$this$consume$iv$iv", "$this$produce", "otherIterator", "$this$consume$iv$iv", "element1", "$this$produce", "otherIterator", "$this$consume$iv$iv"}, m56s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3"})
/* loaded from: classes.dex */
public final class ChannelsKt__DeprecatedKt$zip$2<V> extends SuspendLambda implements Function2<ProducerScope<? super V>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReceiveChannel<R> $other;
    final /* synthetic */ ReceiveChannel<E> $this_zip;
    final /* synthetic */ Function2<E, R, V> $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$zip$2(ReceiveChannel<? extends R> receiveChannel, ReceiveChannel<? extends E> receiveChannel2, Function2<? super E, ? super R, ? extends V> function2, Continuation<? super ChannelsKt__DeprecatedKt$zip$2> continuation) {
        super(2, continuation);
        this.$other = receiveChannel;
        this.$this_zip = receiveChannel2;
        this.$transform = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$zip$2 channelsKt__DeprecatedKt$zip$2 = new ChannelsKt__DeprecatedKt$zip$2(this.$other, this.$this_zip, this.$transform, continuation);
        channelsKt__DeprecatedKt$zip$2.L$0 = obj;
        return channelsKt__DeprecatedKt$zip$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return invoke((ProducerScope) ((ProducerScope) obj), continuation);
    }

    public final Object invoke(ProducerScope<? super V> producerScope, Continuation<? super Unit> continuation) {
        return ((ChannelsKt__DeprecatedKt$zip$2) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ee A[Catch: all -> 0x016b, TRY_LEAVE, TryCatch #6 {all -> 0x016b, blocks: (B:26:0x00e6, B:28:0x00ee, B:46:0x0161), top: B:70:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0161 A[Catch: all -> 0x016b, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x016b, blocks: (B:26:0x00e6, B:28:0x00ee, B:46:0x0161), top: B:70:0x00e6 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0116 -> B:22:0x00c4). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0143 -> B:40:0x014a). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ReceiveChannel $this$consume$iv$iv;
        ChannelsKt__DeprecatedKt$zip$2 channelsKt__DeprecatedKt$zip$2;
        Object $result;
        ProducerScope $this$produce;
        ChannelIterator otherIterator;
        Throwable cause$iv$iv;
        ChannelIterator it;
        boolean z;
        boolean z2;
        int $i$f$consume;
        Function2 function2;
        Object $result2;
        ReceiveChannel $this$consume$iv$iv2;
        Throwable cause$iv$iv2;
        Function2 function22;
        ChannelIterator channelIterator;
        int i;
        boolean z3;
        boolean z4;
        Object $result3;
        Object element1;
        boolean z5;
        Object element12;
        Throwable cause$iv$iv3;
        Object hasNext;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Object element13 = null;
        try {
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    channelsKt__DeprecatedKt$zip$2 = this;
                    $result = obj;
                    $this$produce = (ProducerScope) channelsKt__DeprecatedKt$zip$2.L$0;
                    otherIterator = channelsKt__DeprecatedKt$zip$2.$other.iterator();
                    ReceiveChannel $this$consumeEach$iv = channelsKt__DeprecatedKt$zip$2.$this_zip;
                    Function2 function23 = channelsKt__DeprecatedKt$zip$2.$transform;
                    $this$consume$iv$iv = $this$consumeEach$iv;
                    cause$iv$iv = null;
                    try {
                        it = $this$consume$iv$iv.iterator();
                        z = false;
                        z2 = false;
                        $i$f$consume = 0;
                        function2 = function23;
                        channelsKt__DeprecatedKt$zip$2.L$0 = $this$produce;
                        channelsKt__DeprecatedKt$zip$2.L$1 = otherIterator;
                        channelsKt__DeprecatedKt$zip$2.L$2 = function2;
                        channelsKt__DeprecatedKt$zip$2.L$3 = $this$consume$iv$iv;
                        channelsKt__DeprecatedKt$zip$2.L$4 = it;
                        channelsKt__DeprecatedKt$zip$2.L$5 = element13;
                        channelsKt__DeprecatedKt$zip$2.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$zip$2);
                        if (hasNext != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        boolean z6 = z2;
                        $result3 = $result;
                        $result2 = hasNext;
                        $this$consume$iv$iv2 = $this$consume$iv$iv;
                        cause$iv$iv2 = cause$iv$iv;
                        function22 = function2;
                        channelIterator = it;
                        i = $i$f$consume;
                        z3 = z;
                        z4 = z6;
                        try {
                            if (((Boolean) $result2).booleanValue()) {
                                Unit unit = Unit.INSTANCE;
                                ChannelsKt.cancelConsumed($this$consume$iv$iv2, cause$iv$iv2);
                                return Unit.INSTANCE;
                            }
                            Object element14 = channelIterator.next();
                            z5 = false;
                            channelsKt__DeprecatedKt$zip$2.L$0 = $this$produce;
                            channelsKt__DeprecatedKt$zip$2.L$1 = otherIterator;
                            channelsKt__DeprecatedKt$zip$2.L$2 = function22;
                            channelsKt__DeprecatedKt$zip$2.L$3 = $this$consume$iv$iv2;
                            channelsKt__DeprecatedKt$zip$2.L$4 = channelIterator;
                            channelsKt__DeprecatedKt$zip$2.L$5 = element14;
                            channelsKt__DeprecatedKt$zip$2.label = 2;
                            Object hasNext2 = otherIterator.hasNext(channelsKt__DeprecatedKt$zip$2);
                            if (hasNext2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            element1 = hasNext2;
                            element12 = element14;
                            try {
                                if (((Boolean) element1).booleanValue()) {
                                    Throwable th = cause$iv$iv2;
                                    $result = $result3;
                                    z2 = z4;
                                    z = z3;
                                    $i$f$consume = i;
                                    it = channelIterator;
                                    function2 = function22;
                                    $this$consume$iv$iv = $this$consume$iv$iv2;
                                    cause$iv$iv = th;
                                    element13 = null;
                                    channelsKt__DeprecatedKt$zip$2.L$0 = $this$produce;
                                    channelsKt__DeprecatedKt$zip$2.L$1 = otherIterator;
                                    channelsKt__DeprecatedKt$zip$2.L$2 = function2;
                                    channelsKt__DeprecatedKt$zip$2.L$3 = $this$consume$iv$iv;
                                    channelsKt__DeprecatedKt$zip$2.L$4 = it;
                                    channelsKt__DeprecatedKt$zip$2.L$5 = element13;
                                    channelsKt__DeprecatedKt$zip$2.label = 1;
                                    hasNext = it.hasNext(channelsKt__DeprecatedKt$zip$2);
                                    if (hasNext != coroutine_suspended) {
                                    }
                                } else {
                                    Throwable cause$iv$iv4 = cause$iv$iv2;
                                    try {
                                        Object element2 = otherIterator.next();
                                        Object invoke = function22.invoke(element12, element2);
                                        channelsKt__DeprecatedKt$zip$2.L$0 = $this$produce;
                                        channelsKt__DeprecatedKt$zip$2.L$1 = otherIterator;
                                        channelsKt__DeprecatedKt$zip$2.L$2 = function22;
                                        channelsKt__DeprecatedKt$zip$2.L$3 = $this$consume$iv$iv2;
                                        channelsKt__DeprecatedKt$zip$2.L$4 = channelIterator;
                                        channelsKt__DeprecatedKt$zip$2.L$5 = null;
                                        channelsKt__DeprecatedKt$zip$2.label = 3;
                                        if ($this$produce.send(invoke, channelsKt__DeprecatedKt$zip$2) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        cause$iv$iv3 = cause$iv$iv4;
                                        $result = $result3;
                                        z2 = z4;
                                        z = z3;
                                        $i$f$consume = i;
                                        $this$consume$iv$iv = $this$consume$iv$iv2;
                                        it = channelIterator;
                                        function2 = function22;
                                        element13 = null;
                                        cause$iv$iv = cause$iv$iv3;
                                        channelsKt__DeprecatedKt$zip$2.L$0 = $this$produce;
                                        channelsKt__DeprecatedKt$zip$2.L$1 = otherIterator;
                                        channelsKt__DeprecatedKt$zip$2.L$2 = function2;
                                        channelsKt__DeprecatedKt$zip$2.L$3 = $this$consume$iv$iv;
                                        channelsKt__DeprecatedKt$zip$2.L$4 = it;
                                        channelsKt__DeprecatedKt$zip$2.L$5 = element13;
                                        channelsKt__DeprecatedKt$zip$2.label = 1;
                                        hasNext = it.hasNext(channelsKt__DeprecatedKt$zip$2);
                                        if (hasNext != coroutine_suspended) {
                                        }
                                    } catch (Throwable th2) {
                                        e$iv$iv = th2;
                                        $this$consume$iv$iv = $this$consume$iv$iv2;
                                        Throwable cause$iv$iv5 = e$iv$iv;
                                        try {
                                            throw e$iv$iv;
                                        } catch (Throwable e$iv$iv) {
                                            ChannelsKt.cancelConsumed($this$consume$iv$iv, cause$iv$iv5);
                                            throw e$iv$iv;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                e$iv$iv = th3;
                                $this$consume$iv$iv = $this$consume$iv$iv2;
                            }
                        } catch (Throwable th4) {
                            e$iv$iv = th4;
                            $this$consume$iv$iv = $this$consume$iv$iv2;
                            Throwable cause$iv$iv52 = e$iv$iv;
                            throw e$iv$iv;
                        }
                    } catch (Throwable th5) {
                        e$iv$iv = th5;
                        Throwable cause$iv$iv522 = e$iv$iv;
                        throw e$iv$iv;
                    }
                case 1:
                    channelsKt__DeprecatedKt$zip$2 = this;
                    $result2 = obj;
                    ChannelIterator channelIterator2 = (ChannelIterator) channelsKt__DeprecatedKt$zip$2.L$4;
                    ReceiveChannel $this$consume$iv$iv3 = (ReceiveChannel) channelsKt__DeprecatedKt$zip$2.L$3;
                    Function2 function24 = (Function2) channelsKt__DeprecatedKt$zip$2.L$2;
                    otherIterator = (ChannelIterator) channelsKt__DeprecatedKt$zip$2.L$1;
                    $this$produce = (ProducerScope) channelsKt__DeprecatedKt$zip$2.L$0;
                    ResultKt.throwOnFailure($result2);
                    $this$consume$iv$iv2 = $this$consume$iv$iv3;
                    cause$iv$iv2 = null;
                    function22 = function24;
                    channelIterator = channelIterator2;
                    i = 0;
                    z3 = false;
                    z4 = false;
                    $result3 = $result2;
                    if (((Boolean) $result2).booleanValue()) {
                    }
                    break;
                case 2:
                    channelsKt__DeprecatedKt$zip$2 = this;
                    element1 = obj;
                    Object element15 = channelsKt__DeprecatedKt$zip$2.L$5;
                    ChannelIterator channelIterator3 = (ChannelIterator) channelsKt__DeprecatedKt$zip$2.L$4;
                    $this$consume$iv$iv = (ReceiveChannel) channelsKt__DeprecatedKt$zip$2.L$3;
                    Function2 function25 = (Function2) channelsKt__DeprecatedKt$zip$2.L$2;
                    otherIterator = (ChannelIterator) channelsKt__DeprecatedKt$zip$2.L$1;
                    $this$produce = (ProducerScope) channelsKt__DeprecatedKt$zip$2.L$0;
                    try {
                        ResultKt.throwOnFailure(element1);
                        z5 = false;
                        i = 0;
                        z3 = false;
                        z4 = false;
                        $result3 = element1;
                        cause$iv$iv2 = null;
                        element12 = element15;
                        channelIterator = channelIterator3;
                        function22 = function25;
                        $this$consume$iv$iv2 = $this$consume$iv$iv;
                        if (((Boolean) element1).booleanValue()) {
                        }
                    } catch (Throwable th6) {
                        e$iv$iv = th6;
                        Throwable cause$iv$iv5222 = e$iv$iv;
                        throw e$iv$iv;
                    }
                    break;
                case 3:
                    channelsKt__DeprecatedKt$zip$2 = this;
                    $result = obj;
                    z2 = false;
                    z = false;
                    $i$f$consume = 0;
                    channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$zip$2.L$4;
                    $this$consume$iv$iv = (ReceiveChannel) channelsKt__DeprecatedKt$zip$2.L$3;
                    Function2 function26 = (Function2) channelsKt__DeprecatedKt$zip$2.L$2;
                    otherIterator = (ChannelIterator) channelsKt__DeprecatedKt$zip$2.L$1;
                    $this$produce = (ProducerScope) channelsKt__DeprecatedKt$zip$2.L$0;
                    ResultKt.throwOnFailure($result);
                    cause$iv$iv3 = null;
                    function22 = function26;
                    it = channelIterator;
                    function2 = function22;
                    element13 = null;
                    cause$iv$iv = cause$iv$iv3;
                    channelsKt__DeprecatedKt$zip$2.L$0 = $this$produce;
                    channelsKt__DeprecatedKt$zip$2.L$1 = otherIterator;
                    channelsKt__DeprecatedKt$zip$2.L$2 = function2;
                    channelsKt__DeprecatedKt$zip$2.L$3 = $this$consume$iv$iv;
                    channelsKt__DeprecatedKt$zip$2.L$4 = it;
                    channelsKt__DeprecatedKt$zip$2.L$5 = element13;
                    channelsKt__DeprecatedKt$zip$2.label = 1;
                    hasNext = it.hasNext(channelsKt__DeprecatedKt$zip$2);
                    if (hasNext != coroutine_suspended) {
                    }
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th7) {
            e$iv$iv = th7;
        }
    }
}

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
/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: Deprecated.kt */
@Metadata(m71d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, m70d2 = {"<anonymous>", "", "E", "R", "Lkotlinx/coroutines/channels/ProducerScope;"}, m69k = 3, m68mv = {1, 6, 0}, m66xi = 48)
@DebugMetadata(m62c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", m61f = "Deprecated.kt", m60i = {0, 0, 1, 1, 2, 2}, m59l = {487, 333, 333}, m58m = "invokeSuspend", m57n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, m56s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
/* loaded from: classes.dex */
public final class ChannelsKt__DeprecatedKt$map$1<R> extends SuspendLambda implements Function2<ProducerScope<? super R>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReceiveChannel<E> $this_map;
    final /* synthetic */ Function2<E, Continuation<? super R>, Object> $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$map$1(ReceiveChannel<? extends E> receiveChannel, Function2<? super E, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super ChannelsKt__DeprecatedKt$map$1> continuation) {
        super(2, continuation);
        this.$this_map = receiveChannel;
        this.$transform = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$map$1 channelsKt__DeprecatedKt$map$1 = new ChannelsKt__DeprecatedKt$map$1(this.$this_map, this.$transform, continuation);
        channelsKt__DeprecatedKt$map$1.L$0 = obj;
        return channelsKt__DeprecatedKt$map$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return invoke((ProducerScope) ((ProducerScope) obj), continuation);
    }

    public final Object invoke(ProducerScope<? super R> producerScope, Continuation<? super Unit> continuation) {
        return ((ChannelsKt__DeprecatedKt$map$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d2 A[Catch: all -> 0x0125, TRY_LEAVE, TryCatch #2 {all -> 0x0125, blocks: (B:26:0x00ca, B:28:0x00d2, B:40:0x011b), top: B:56:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0104 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011b A[Catch: all -> 0x0125, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0125, blocks: (B:26:0x00ca, B:28:0x00d2, B:40:0x011b), top: B:56:0x00ca }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0105 -> B:36:0x010f). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ReceiveChannel $this$consume$iv$iv;
        ChannelsKt__DeprecatedKt$map$1 channelsKt__DeprecatedKt$map$1;
        Object $result;
        ProducerScope $this$produce;
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
        Object $result4;
        ProducerScope producerScope;
        ChannelIterator channelIterator2;
        Function2 function23;
        ProducerScope $this$produce2;
        boolean z5;
        ChannelIterator channelIterator3;
        Function2 function24;
        Object hasNext;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    channelsKt__DeprecatedKt$map$1 = this;
                    $result = obj;
                    $this$produce = (ProducerScope) channelsKt__DeprecatedKt$map$1.L$0;
                    ReceiveChannel $this$consumeEach$iv = channelsKt__DeprecatedKt$map$1.$this_map;
                    Function2 function25 = channelsKt__DeprecatedKt$map$1.$transform;
                    $this$consume$iv$iv = $this$consumeEach$iv;
                    cause$iv$iv = null;
                    try {
                        it = $this$consume$iv$iv.iterator();
                        z = false;
                        z2 = false;
                        $i$f$consume = 0;
                        function2 = function25;
                        channelsKt__DeprecatedKt$map$1.L$0 = $this$produce;
                        channelsKt__DeprecatedKt$map$1.L$1 = function2;
                        channelsKt__DeprecatedKt$map$1.L$2 = $this$consume$iv$iv;
                        channelsKt__DeprecatedKt$map$1.L$3 = it;
                        channelsKt__DeprecatedKt$map$1.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$map$1);
                        if (hasNext == coroutine_suspended) {
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
                            Object it2 = channelIterator.next();
                            z5 = false;
                            channelsKt__DeprecatedKt$map$1.L$0 = $this$produce;
                            channelsKt__DeprecatedKt$map$1.L$1 = function22;
                            channelsKt__DeprecatedKt$map$1.L$2 = $this$consume$iv$iv2;
                            channelsKt__DeprecatedKt$map$1.L$3 = channelIterator;
                            channelsKt__DeprecatedKt$map$1.L$4 = $this$produce;
                            channelsKt__DeprecatedKt$map$1.label = 2;
                            Object invoke = function22.invoke(it2, channelsKt__DeprecatedKt$map$1);
                            if (invoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            $result4 = invoke;
                            $this$produce2 = $this$produce;
                            function23 = function22;
                            channelIterator2 = channelIterator;
                            producerScope = $this$produce2;
                            try {
                                channelsKt__DeprecatedKt$map$1.L$0 = $this$produce2;
                                channelsKt__DeprecatedKt$map$1.L$1 = function23;
                                channelsKt__DeprecatedKt$map$1.L$2 = $this$consume$iv$iv2;
                                channelsKt__DeprecatedKt$map$1.L$3 = channelIterator2;
                                channelsKt__DeprecatedKt$map$1.L$4 = null;
                                channelsKt__DeprecatedKt$map$1.label = 3;
                                if (producerScope.send($result4, channelsKt__DeprecatedKt$map$1) != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                $result = $result3;
                                z2 = z4;
                                z = z3;
                                $i$f$consume = i;
                                channelIterator3 = channelIterator2;
                                cause$iv$iv = cause$iv$iv2;
                                $this$consume$iv$iv = $this$consume$iv$iv2;
                                function24 = function23;
                                $this$produce = $this$produce2;
                                it = channelIterator3;
                                function2 = function24;
                                channelsKt__DeprecatedKt$map$1.L$0 = $this$produce;
                                channelsKt__DeprecatedKt$map$1.L$1 = function2;
                                channelsKt__DeprecatedKt$map$1.L$2 = $this$consume$iv$iv;
                                channelsKt__DeprecatedKt$map$1.L$3 = it;
                                channelsKt__DeprecatedKt$map$1.label = 1;
                                hasNext = it.hasNext(channelsKt__DeprecatedKt$map$1);
                                if (hasNext == coroutine_suspended) {
                                }
                            } catch (Throwable th) {
                                e$iv$iv = th;
                                $this$consume$iv$iv = $this$consume$iv$iv2;
                                Throwable cause$iv$iv3 = e$iv$iv;
                                try {
                                    throw e$iv$iv;
                                } catch (Throwable e$iv$iv) {
                                    ChannelsKt.cancelConsumed($this$consume$iv$iv, cause$iv$iv3);
                                    throw e$iv$iv;
                                }
                            }
                        } catch (Throwable th2) {
                            e$iv$iv = th2;
                            $this$consume$iv$iv = $this$consume$iv$iv2;
                            Throwable cause$iv$iv32 = e$iv$iv;
                            throw e$iv$iv;
                        }
                    } catch (Throwable th3) {
                        e$iv$iv = th3;
                        Throwable cause$iv$iv322 = e$iv$iv;
                        throw e$iv$iv;
                    }
                case 1:
                    channelsKt__DeprecatedKt$map$1 = this;
                    $result2 = obj;
                    ChannelIterator channelIterator4 = (ChannelIterator) channelsKt__DeprecatedKt$map$1.L$3;
                    ReceiveChannel $this$consume$iv$iv3 = (ReceiveChannel) channelsKt__DeprecatedKt$map$1.L$2;
                    Function2 function26 = (Function2) channelsKt__DeprecatedKt$map$1.L$1;
                    $this$produce = (ProducerScope) channelsKt__DeprecatedKt$map$1.L$0;
                    ResultKt.throwOnFailure($result2);
                    $this$consume$iv$iv2 = $this$consume$iv$iv3;
                    cause$iv$iv2 = null;
                    function22 = function26;
                    channelIterator = channelIterator4;
                    i = 0;
                    z3 = false;
                    z4 = false;
                    $result3 = $result2;
                    if (((Boolean) $result2).booleanValue()) {
                    }
                    break;
                case 2:
                    channelsKt__DeprecatedKt$map$1 = this;
                    $result4 = obj;
                    producerScope = (ProducerScope) channelsKt__DeprecatedKt$map$1.L$4;
                    channelIterator2 = (ChannelIterator) channelsKt__DeprecatedKt$map$1.L$3;
                    cause$iv$iv2 = null;
                    $this$consume$iv$iv2 = (ReceiveChannel) channelsKt__DeprecatedKt$map$1.L$2;
                    function23 = (Function2) channelsKt__DeprecatedKt$map$1.L$1;
                    ProducerScope $this$produce3 = (ProducerScope) channelsKt__DeprecatedKt$map$1.L$0;
                    try {
                        ResultKt.throwOnFailure($result4);
                        $this$produce2 = $this$produce3;
                        z5 = false;
                        i = 0;
                        z3 = false;
                        z4 = false;
                        $result3 = $result4;
                        channelsKt__DeprecatedKt$map$1.L$0 = $this$produce2;
                        channelsKt__DeprecatedKt$map$1.L$1 = function23;
                        channelsKt__DeprecatedKt$map$1.L$2 = $this$consume$iv$iv2;
                        channelsKt__DeprecatedKt$map$1.L$3 = channelIterator2;
                        channelsKt__DeprecatedKt$map$1.L$4 = null;
                        channelsKt__DeprecatedKt$map$1.label = 3;
                        if (producerScope.send($result4, channelsKt__DeprecatedKt$map$1) != coroutine_suspended) {
                        }
                    } catch (Throwable th4) {
                        e$iv$iv = th4;
                        $this$consume$iv$iv = $this$consume$iv$iv2;
                        Throwable cause$iv$iv3222 = e$iv$iv;
                        throw e$iv$iv;
                    }
                    break;
                case 3:
                    channelsKt__DeprecatedKt$map$1 = this;
                    $result = obj;
                    z2 = false;
                    z = false;
                    $i$f$consume = 0;
                    channelIterator3 = (ChannelIterator) channelsKt__DeprecatedKt$map$1.L$3;
                    cause$iv$iv = null;
                    $this$consume$iv$iv = (ReceiveChannel) channelsKt__DeprecatedKt$map$1.L$2;
                    function24 = (Function2) channelsKt__DeprecatedKt$map$1.L$1;
                    $this$produce = (ProducerScope) channelsKt__DeprecatedKt$map$1.L$0;
                    ResultKt.throwOnFailure($result);
                    it = channelIterator3;
                    function2 = function24;
                    channelsKt__DeprecatedKt$map$1.L$0 = $this$produce;
                    channelsKt__DeprecatedKt$map$1.L$1 = function2;
                    channelsKt__DeprecatedKt$map$1.L$2 = $this$consume$iv$iv;
                    channelsKt__DeprecatedKt$map$1.L$3 = it;
                    channelsKt__DeprecatedKt$map$1.label = 1;
                    hasNext = it.hasNext(channelsKt__DeprecatedKt$map$1);
                    if (hasNext == coroutine_suspended) {
                    }
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th5) {
            e$iv$iv = th5;
        }
    }
}

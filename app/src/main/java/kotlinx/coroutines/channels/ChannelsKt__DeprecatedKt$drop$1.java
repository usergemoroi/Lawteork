package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: Deprecated.kt */
@Metadata(m71d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m70d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, m69k = 3, m68mv = {1, 6, 0}, m66xi = 48)
@DebugMetadata(m62c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", m61f = "Deprecated.kt", m60i = {0, 0, 1, 2}, m59l = {164, 169, 170}, m58m = "invokeSuspend", m57n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, m56s = {"L$0", "I$0", "L$0", "L$0"})
/* loaded from: classes.dex */
final class ChannelsKt__DeprecatedKt$drop$1<E> extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {

    /* renamed from: $n */
    final /* synthetic */ int f223$n;
    final /* synthetic */ ReceiveChannel<E> $this_drop;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$drop$1(int i, ReceiveChannel<? extends E> receiveChannel, Continuation<? super ChannelsKt__DeprecatedKt$drop$1> continuation) {
        super(2, continuation);
        this.f223$n = i;
        this.$this_drop = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$drop$1 channelsKt__DeprecatedKt$drop$1 = new ChannelsKt__DeprecatedKt$drop$1(this.f223$n, this.$this_drop, continuation);
        channelsKt__DeprecatedKt$drop$1.L$0 = obj;
        return channelsKt__DeprecatedKt$drop$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return invoke((ProducerScope) ((ProducerScope) obj), continuation);
    }

    public final Object invoke(ProducerScope<? super E> producerScope, Continuation<? super Unit> continuation) {
        return ((ChannelsKt__DeprecatedKt$drop$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0079 -> B:21:0x0081). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00d9 -> B:29:0x00a4). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object $result) {
        ChannelsKt__DeprecatedKt$drop$1 channelsKt__DeprecatedKt$drop$1;
        ProducerScope $this$produce;
        ChannelIterator<E> it;
        Object $result2;
        ProducerScope $this$produce2;
        ChannelIterator<E> channelIterator;
        int remaining;
        ChannelsKt__DeprecatedKt$drop$1 channelsKt__DeprecatedKt$drop$12;
        Object obj;
        ProducerScope $this$produce3;
        ChannelIterator<E> channelIterator2;
        ChannelsKt__DeprecatedKt$drop$1 channelsKt__DeprecatedKt$drop$13;
        Object obj2;
        Object $result3;
        Object hasNext;
        Object $result4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                channelsKt__DeprecatedKt$drop$1 = this;
                $this$produce = (ProducerScope) channelsKt__DeprecatedKt$drop$1.L$0;
                int i = channelsKt__DeprecatedKt$drop$1.f223$n;
                if (!(i >= 0)) {
                    throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
                }
                int remaining2 = channelsKt__DeprecatedKt$drop$1.f223$n;
                if (remaining2 > 0) {
                    ProducerScope $this$produce4 = $this$produce;
                    int remaining3 = remaining2;
                    ChannelIterator<E> it2 = channelsKt__DeprecatedKt$drop$1.$this_drop.iterator();
                    channelsKt__DeprecatedKt$drop$1.L$0 = $this$produce4;
                    channelsKt__DeprecatedKt$drop$1.L$1 = it2;
                    channelsKt__DeprecatedKt$drop$1.I$0 = remaining3;
                    channelsKt__DeprecatedKt$drop$1.label = 1;
                    Object hasNext2 = it2.hasNext(channelsKt__DeprecatedKt$drop$1);
                    if (hasNext2 != $result4) {
                        return $result4;
                    }
                    Object obj3 = $result4;
                    $result2 = $result;
                    $result = hasNext2;
                    $this$produce2 = $this$produce4;
                    channelIterator = it2;
                    remaining = remaining3;
                    channelsKt__DeprecatedKt$drop$12 = channelsKt__DeprecatedKt$drop$1;
                    obj = obj3;
                    if (((Boolean) $result).booleanValue()) {
                        channelIterator.next();
                        int remaining4 = remaining - 1;
                        if (remaining4 != 0) {
                            it2 = channelIterator;
                            $this$produce4 = $this$produce2;
                            ChannelsKt__DeprecatedKt$drop$1 channelsKt__DeprecatedKt$drop$14 = channelsKt__DeprecatedKt$drop$12;
                            remaining3 = remaining4;
                            $result = $result2;
                            $result4 = obj;
                            channelsKt__DeprecatedKt$drop$1 = channelsKt__DeprecatedKt$drop$14;
                            channelsKt__DeprecatedKt$drop$1.L$0 = $this$produce4;
                            channelsKt__DeprecatedKt$drop$1.L$1 = it2;
                            channelsKt__DeprecatedKt$drop$1.I$0 = remaining3;
                            channelsKt__DeprecatedKt$drop$1.label = 1;
                            Object hasNext22 = it2.hasNext(channelsKt__DeprecatedKt$drop$1);
                            if (hasNext22 != $result4) {
                            }
                        }
                    }
                    $result = $result2;
                    $result4 = obj;
                    channelsKt__DeprecatedKt$drop$1 = channelsKt__DeprecatedKt$drop$12;
                    $this$produce = $this$produce2;
                }
                it = channelsKt__DeprecatedKt$drop$1.$this_drop.iterator();
                channelsKt__DeprecatedKt$drop$1.L$0 = $this$produce;
                channelsKt__DeprecatedKt$drop$1.L$1 = it;
                channelsKt__DeprecatedKt$drop$1.label = 2;
                hasNext = it.hasNext(channelsKt__DeprecatedKt$drop$1);
                if (hasNext != $result4) {
                    return $result4;
                }
                Object obj4 = $result4;
                $result3 = $result;
                $result = hasNext;
                $this$produce3 = $this$produce;
                channelIterator2 = it;
                channelsKt__DeprecatedKt$drop$13 = channelsKt__DeprecatedKt$drop$1;
                obj2 = obj4;
                if (((Boolean) $result).booleanValue()) {
                    return Unit.INSTANCE;
                }
                channelsKt__DeprecatedKt$drop$13.L$0 = $this$produce3;
                channelsKt__DeprecatedKt$drop$13.L$1 = channelIterator2;
                channelsKt__DeprecatedKt$drop$13.label = 3;
                Object e = $this$produce3.send(channelIterator2.next(), channelsKt__DeprecatedKt$drop$13);
                if (e == obj2) {
                    return obj2;
                }
                $result = $result3;
                $result4 = obj2;
                channelsKt__DeprecatedKt$drop$1 = channelsKt__DeprecatedKt$drop$13;
                it = channelIterator2;
                $this$produce = $this$produce3;
                channelsKt__DeprecatedKt$drop$1.L$0 = $this$produce;
                channelsKt__DeprecatedKt$drop$1.L$1 = it;
                channelsKt__DeprecatedKt$drop$1.label = 2;
                hasNext = it.hasNext(channelsKt__DeprecatedKt$drop$1);
                if (hasNext != $result4) {
                }
            case 1:
                int remaining5 = this.I$0;
                ResultKt.throwOnFailure($result);
                $this$produce2 = (ProducerScope) this.L$0;
                channelIterator = (ChannelIterator) this.L$1;
                remaining = remaining5;
                channelsKt__DeprecatedKt$drop$12 = this;
                obj = $result4;
                $result2 = $result;
                if (((Boolean) $result).booleanValue()) {
                }
                $result = $result2;
                $result4 = obj;
                channelsKt__DeprecatedKt$drop$1 = channelsKt__DeprecatedKt$drop$12;
                $this$produce = $this$produce2;
                it = channelsKt__DeprecatedKt$drop$1.$this_drop.iterator();
                channelsKt__DeprecatedKt$drop$1.L$0 = $this$produce;
                channelsKt__DeprecatedKt$drop$1.L$1 = it;
                channelsKt__DeprecatedKt$drop$1.label = 2;
                hasNext = it.hasNext(channelsKt__DeprecatedKt$drop$1);
                if (hasNext != $result4) {
                }
                break;
            case 2:
                ResultKt.throwOnFailure($result);
                $this$produce3 = (ProducerScope) this.L$0;
                channelIterator2 = (ChannelIterator) this.L$1;
                channelsKt__DeprecatedKt$drop$13 = this;
                obj2 = $result4;
                $result3 = $result;
                if (((Boolean) $result).booleanValue()) {
                }
                break;
            case 3:
                channelsKt__DeprecatedKt$drop$1 = this;
                it = (ChannelIterator) channelsKt__DeprecatedKt$drop$1.L$1;
                $this$produce = (ProducerScope) channelsKt__DeprecatedKt$drop$1.L$0;
                ResultKt.throwOnFailure($result);
                channelsKt__DeprecatedKt$drop$1.L$0 = $this$produce;
                channelsKt__DeprecatedKt$drop$1.L$1 = it;
                channelsKt__DeprecatedKt$drop$1.label = 2;
                hasNext = it.hasNext(channelsKt__DeprecatedKt$drop$1);
                if (hasNext != $result4) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

package okhttp3.internal.p024ws;

import androidx.core.app.NotificationCompat;
import androidx.core.view.PointerIconCompat;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.p024ws.RealWebSocket;
import okhttp3.internal.p024ws.WebSocketReader;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
/* compiled from: RealWebSocket.kt */
@Metadata(m72bv = {1, 0, 3}, m71d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000 `2\u00020\u00012\u00020\u0002:\u0005_`abcB?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0002\u0010\u0010J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\f2\u0006\u00105\u001a\u000206J\b\u00107\u001a\u000203H\u0016J\u001f\u00108\u001a\u0002032\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0000¢\u0006\u0002\b=J\u001a\u0010>\u001a\u00020\u00122\u0006\u0010?\u001a\u00020%2\b\u0010@\u001a\u0004\u0018\u00010\u0018H\u0016J \u0010>\u001a\u00020\u00122\u0006\u0010?\u001a\u00020%2\b\u0010@\u001a\u0004\u0018\u00010\u00182\u0006\u0010A\u001a\u00020\fJ\u000e\u0010B\u001a\u0002032\u0006\u0010C\u001a\u00020DJ\u001c\u0010E\u001a\u0002032\n\u0010F\u001a\u00060Gj\u0002`H2\b\u00109\u001a\u0004\u0018\u00010:J\u0016\u0010I\u001a\u0002032\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010*\u001a\u00020+J\u0006\u0010J\u001a\u000203J\u0018\u0010K\u001a\u0002032\u0006\u0010?\u001a\u00020%2\u0006\u0010@\u001a\u00020\u0018H\u0016J\u0010\u0010L\u001a\u0002032\u0006\u0010M\u001a\u00020\u0018H\u0016J\u0010\u0010L\u001a\u0002032\u0006\u0010N\u001a\u00020 H\u0016J\u0010\u0010O\u001a\u0002032\u0006\u0010P\u001a\u00020 H\u0016J\u0010\u0010Q\u001a\u0002032\u0006\u0010P\u001a\u00020 H\u0016J\u000e\u0010R\u001a\u00020\u00122\u0006\u0010P\u001a\u00020 J\u0006\u0010S\u001a\u00020\u0012J\b\u0010!\u001a\u00020\fH\u0016J\u0006\u0010'\u001a\u00020%J\u0006\u0010(\u001a\u00020%J\b\u0010T\u001a\u00020\u0006H\u0016J\b\u0010U\u001a\u000203H\u0002J\u0010\u0010V\u001a\u00020\u00122\u0006\u0010M\u001a\u00020\u0018H\u0016J\u0010\u0010V\u001a\u00020\u00122\u0006\u0010N\u001a\u00020 H\u0016J\u0018\u0010V\u001a\u00020\u00122\u0006\u0010W\u001a\u00020 2\u0006\u0010X\u001a\u00020%H\u0002J\u0006\u0010)\u001a\u00020%J\u0006\u0010Y\u001a\u000203J\r\u0010Z\u001a\u00020\u0012H\u0000¢\u0006\u0002\b[J\r\u0010\\\u001a\u000203H\u0000¢\u0006\u0002\b]J\f\u0010^\u001a\u00020\u0012*\u00020\u000eH\u0002R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006d"}, m70d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "originalRequest", "Lokhttp3/Request;", "listener", "Lokhttp3/WebSocketListener;", "random", "Ljava/util/Random;", "pingIntervalMillis", "", "extensions", "Lokhttp3/internal/ws/WebSocketExtensions;", "minimumDeflateSize", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Request;Lokhttp3/WebSocketListener;Ljava/util/Random;JLokhttp3/internal/ws/WebSocketExtensions;J)V", "awaitingPong", "", NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "enqueuedClose", "failed", "key", "", "getListener$okhttp", "()Lokhttp3/WebSocketListener;", "messageAndCloseQueue", "Ljava/util/ArrayDeque;", "", "name", "pongQueue", "Lokio/ByteString;", "queueSize", "reader", "Lokhttp3/internal/ws/WebSocketReader;", "receivedCloseCode", "", "receivedCloseReason", "receivedPingCount", "receivedPongCount", "sentPingCount", "streams", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "taskQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "writer", "Lokhttp3/internal/ws/WebSocketWriter;", "writerTask", "Lokhttp3/internal/concurrent/Task;", "awaitTermination", "", "timeout", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "cancel", "checkUpgradeSuccess", "response", "Lokhttp3/Response;", "exchange", "Lokhttp3/internal/connection/Exchange;", "checkUpgradeSuccess$okhttp", "close", "code", "reason", "cancelAfterCloseMillis", "connect", "client", "Lokhttp3/OkHttpClient;", "failWebSocket", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "initReaderAndWriter", "loopReader", "onReadClose", "onReadMessage", "text", "bytes", "onReadPing", "payload", "onReadPong", "pong", "processNextFrame", "request", "runWriter", "send", "data", "formatOpcode", "tearDown", "writeOneFrame", "writeOneFrame$okhttp", "writePingFrame", "writePingFrame$okhttp", "isValid", "Close", "Companion", "Message", "Streams", "WriterTask", "okhttp"}, m69k = 1, m68mv = {1, 4, 0})
/* renamed from: okhttp3.internal.ws.RealWebSocket */
/* loaded from: classes.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private boolean awaitingPong;
    private Call call;
    private boolean enqueuedClose;
    private WebSocketExtensions extensions;
    private boolean failed;
    private final String key;
    private final WebSocketListener listener;
    private final ArrayDeque<Object> messageAndCloseQueue;
    private long minimumDeflateSize;
    private String name;
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<ByteString> pongQueue;
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private TaskQueue taskQueue;
    private WebSocketWriter writer;
    private Task writerTask;
    public static final Companion Companion = new Companion(null);
    private static final List<Protocol> ONLY_HTTP1 = CollectionsKt.listOf(Protocol.HTTP_1_1);

    public RealWebSocket(TaskRunner taskRunner, Request originalRequest, WebSocketListener listener, Random random, long pingIntervalMillis, WebSocketExtensions extensions, long minimumDeflateSize) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(random, "random");
        this.originalRequest = originalRequest;
        this.listener = listener;
        this.random = random;
        this.pingIntervalMillis = pingIntervalMillis;
        this.extensions = extensions;
        this.minimumDeflateSize = minimumDeflateSize;
        this.taskQueue = taskRunner.newQueue();
        this.pongQueue = new ArrayDeque<>();
        this.messageAndCloseQueue = new ArrayDeque<>();
        this.receivedCloseCode = -1;
        if (!Intrinsics.areEqual("GET", originalRequest.method())) {
            throw new IllegalArgumentException(("Request must be GET: " + originalRequest.method()).toString());
        }
        ByteString.Companion companion = ByteString.Companion;
        byte[] $this$apply = new byte[16];
        random.nextBytes($this$apply);
        Unit unit = Unit.INSTANCE;
        this.key = ByteString.Companion.of$default(companion, $this$apply, 0, 0, 3, null).base64();
    }

    public final WebSocketListener getListener$okhttp() {
        return this.listener;
    }

    @Override // okhttp3.WebSocket
    public Request request() {
        return this.originalRequest;
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.queueSize;
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        Call call = this.call;
        Intrinsics.checkNotNull(call);
        call.cancel();
    }

    public final void connect(OkHttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        if (this.originalRequest.header("Sec-WebSocket-Extensions") != null) {
            failWebSocket(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        OkHttpClient webSocketClient = client.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        final Request request = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").header("Sec-WebSocket-Extensions", "permessage-deflate").build();
        RealCall realCall = new RealCall(webSocketClient, request, true);
        this.call = realCall;
        Intrinsics.checkNotNull(realCall);
        realCall.enqueue(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket$connect$1
            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                boolean isValid;
                ArrayDeque arrayDeque;
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                Exchange exchange = response.exchange();
                try {
                    RealWebSocket.this.checkUpgradeSuccess$okhttp(response, exchange);
                    Intrinsics.checkNotNull(exchange);
                    RealWebSocket.Streams streams = exchange.newWebSocketStreams();
                    WebSocketExtensions extensions = WebSocketExtensions.Companion.parse(response.headers());
                    RealWebSocket.this.extensions = extensions;
                    isValid = RealWebSocket.this.isValid(extensions);
                    if (!isValid) {
                        synchronized (RealWebSocket.this) {
                            arrayDeque = RealWebSocket.this.messageAndCloseQueue;
                            arrayDeque.clear();
                            RealWebSocket.this.close(PointerIconCompat.TYPE_ALIAS, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    try {
                        String name = Util.okHttpName + " WebSocket " + request.url().redact();
                        RealWebSocket.this.initReaderAndWriter(name, streams);
                        RealWebSocket.this.getListener$okhttp().onOpen(RealWebSocket.this, response);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e) {
                        RealWebSocket.this.failWebSocket(e, null);
                    }
                } catch (IOException e2) {
                    if (exchange != null) {
                        exchange.webSocketUpgradeFailed();
                    }
                    RealWebSocket.this.failWebSocket(e2, response);
                    Util.closeQuietly(response);
                }
            }

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e, "e");
                RealWebSocket.this.failWebSocket(e, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValid(WebSocketExtensions $this$isValid) {
        if (!$this$isValid.unknownValues && $this$isValid.clientMaxWindowBits == null) {
            if ($this$isValid.serverMaxWindowBits != null) {
                int intValue = $this$isValid.serverMaxWindowBits.intValue();
                return 8 <= intValue && 15 >= intValue;
            }
            return true;
        }
        return false;
    }

    public final void checkUpgradeSuccess$okhttp(Response response, Exchange exchange) throws IOException {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.code() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + ' ' + response.message() + '\'');
        }
        String headerConnection = Response.header$default(response, "Connection", null, 2, null);
        if (!StringsKt.equals("Upgrade", headerConnection, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + headerConnection + '\'');
        }
        String headerUpgrade = Response.header$default(response, "Upgrade", null, 2, null);
        if (!StringsKt.equals("websocket", headerUpgrade, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + headerUpgrade + '\'');
        }
        String headerAccept = Response.header$default(response, "Sec-WebSocket-Accept", null, 2, null);
        String acceptExpected = ByteString.Companion.encodeUtf8(this.key + WebSocketProtocol.ACCEPT_MAGIC).sha1().base64();
        if (true ^ Intrinsics.areEqual(acceptExpected, headerAccept)) {
            throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + acceptExpected + "' but was '" + headerAccept + '\'');
        }
        if (exchange == null) {
            throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
        }
    }

    public final void initReaderAndWriter(final String name, final Streams streams) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(streams, "streams");
        final WebSocketExtensions extensions = this.extensions;
        Intrinsics.checkNotNull(extensions);
        synchronized (this) {
            this.name = name;
            this.streams = streams;
            this.writer = new WebSocketWriter(streams.getClient(), streams.getSink(), this.random, extensions.perMessageDeflate, extensions.noContextTakeover(streams.getClient()), this.minimumDeflateSize);
            this.writerTask = new WriterTask();
            if (this.pingIntervalMillis != 0) {
                final long pingIntervalNanos = TimeUnit.MILLISECONDS.toNanos(this.pingIntervalMillis);
                TaskQueue this_$iv = this.taskQueue;
                final String name$iv = name + " ping";
                this_$iv.schedule(new Task(name$iv) { // from class: okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$$inlined$synchronized$lambda$1
                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        this.writePingFrame$okhttp();
                        return pingIntervalNanos;
                    }
                }, pingIntervalNanos);
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
            Unit unit = Unit.INSTANCE;
        }
        this.reader = new WebSocketReader(streams.getClient(), streams.getSource(), this, extensions.perMessageDeflate, extensions.noContextTakeover(!streams.getClient()));
    }

    public final void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            WebSocketReader webSocketReader = this.reader;
            Intrinsics.checkNotNull(webSocketReader);
            webSocketReader.processNextFrame();
        }
    }

    public final boolean processNextFrame() throws IOException {
        try {
            WebSocketReader webSocketReader = this.reader;
            Intrinsics.checkNotNull(webSocketReader);
            webSocketReader.processNextFrame();
            return this.receivedCloseCode == -1;
        } catch (Exception e) {
            failWebSocket(e, null);
            return false;
        }
    }

    public final void awaitTermination(long timeout, TimeUnit timeUnit) throws InterruptedException {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.taskQueue.idleLatch().await(timeout, timeUnit);
    }

    public final void tearDown() throws InterruptedException {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
    }

    public final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @Override // okhttp3.internal.p024ws.WebSocketReader.FrameCallback
    public void onReadMessage(String text) throws IOException {
        Intrinsics.checkNotNullParameter(text, "text");
        this.listener.onMessage(this, text);
    }

    @Override // okhttp3.internal.p024ws.WebSocketReader.FrameCallback
    public void onReadMessage(ByteString bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.listener.onMessage(this, bytes);
    }

    @Override // okhttp3.internal.p024ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(ByteString payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(payload);
            runWriter();
            this.receivedPingCount++;
        }
    }

    @Override // okhttp3.internal.p024ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(ByteString payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    @Override // okhttp3.internal.p024ws.WebSocketReader.FrameCallback
    public void onReadClose(int code, String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        boolean z = true;
        if (!(code != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        Object toClose = (Streams) null;
        Object readerToClose = (WebSocketReader) null;
        Object writerToClose = (WebSocketWriter) null;
        synchronized (this) {
            if (this.receivedCloseCode != -1) {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("already closed".toString());
            }
            this.receivedCloseCode = code;
            this.receivedCloseReason = reason;
            if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                toClose = this.streams;
                Streams streams = null;
                this.streams = null;
                readerToClose = this.reader;
                WebSocketReader webSocketReader = null;
                this.reader = null;
                writerToClose = this.writer;
                WebSocketWriter webSocketWriter = null;
                this.writer = null;
                this.taskQueue.shutdown();
            }
            Unit unit = Unit.INSTANCE;
        }
        try {
            this.listener.onClosing(this, code, reason);
            if (toClose != null) {
                this.listener.onClosed(this, code, reason);
            }
        } finally {
            if (toClose != null) {
                Util.closeQuietly((Closeable) toClose);
            }
            if (readerToClose != null) {
                Util.closeQuietly((Closeable) readerToClose);
            }
            if (writerToClose != null) {
                Util.closeQuietly((Closeable) writerToClose);
            }
        }
    }

    @Override // okhttp3.WebSocket
    public boolean send(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return send(ByteString.Companion.encodeUtf8(text), 1);
    }

    @Override // okhttp3.WebSocket
    public boolean send(ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return send(bytes, 2);
    }

    private final synchronized boolean send(ByteString data, int formatOpcode) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + data.size() > MAX_QUEUE_SIZE) {
                close(1001, null);
                return false;
            }
            this.queueSize += data.size();
            this.messageAndCloseQueue.add(new Message(formatOpcode, data));
            runWriter();
            return true;
        }
        return false;
    }

    public final synchronized boolean pong(ByteString payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(payload);
            runWriter();
            return true;
        }
        return false;
    }

    @Override // okhttp3.WebSocket
    public boolean close(int code, String reason) {
        return close(code, reason, CANCEL_AFTER_CLOSE_MILLIS);
    }

    public final synchronized boolean close(int code, String reason, long cancelAfterCloseMillis) {
        WebSocketProtocol.INSTANCE.validateCloseCode(code);
        ByteString reasonBytes = null;
        ByteString byteString = null;
        if (reason != null) {
            reasonBytes = ByteString.Companion.encodeUtf8(reason);
            if (!(((long) reasonBytes.size()) <= 123)) {
                throw new IllegalArgumentException(("reason.size() > 123: " + reason).toString());
            }
        }
        if (!this.failed && !this.enqueuedClose) {
            this.enqueuedClose = true;
            this.messageAndCloseQueue.add(new Close(code, reasonBytes, cancelAfterCloseMillis));
            runWriter();
            return true;
        }
        return false;
    }

    private final void runWriter() {
        if (!Util.assertionsEnabled || Thread.holdsLock(this)) {
            Task writerTask = this.writerTask;
            if (writerTask != null) {
                TaskQueue.schedule$default(this.taskQueue, writerTask, 0L, 2, null);
                return;
            }
            return;
        }
        StringBuilder append = new StringBuilder().append("Thread ");
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(currentThread, "Thread.currentThread()");
        throw new AssertionError(append.append(currentThread.getName()).append(" MUST hold lock on ").append(this).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 24, insn: 0x0139: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r24 I:??[OBJECT, ARRAY] A[D('pong' okio.ByteString)]), block:B:31:0x0139 */
    /* JADX WARN: Not initialized variable reg: 25, insn: 0x013b: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r25 I:??[OBJECT, ARRAY] A[D('writer' okhttp3.internal.ws.WebSocketWriter)]), block:B:31:0x0139 */
    /* JADX WARN: Not initialized variable reg: 26, insn: 0x013d: MOVE  (r8 I:??[OBJECT, ARRAY]) = (r26 I:??[OBJECT, ARRAY] A[D('writerToClose' kotlin.jvm.internal.Ref$ObjectRef)]), block:B:31:0x0139 */
    /* JADX WARN: Not initialized variable reg: 27, insn: 0x013f: MOVE  (r6 I:??[OBJECT, ARRAY]) = (r27 I:??[OBJECT, ARRAY] A[D('readerToClose' kotlin.jvm.internal.Ref$ObjectRef)]), block:B:31:0x0139 */
    /* JADX WARN: Not initialized variable reg: 28, insn: 0x0141: MOVE  (r5 I:??[OBJECT, ARRAY]) = (r28 I:??[OBJECT, ARRAY] A[D('streamsToClose' kotlin.jvm.internal.Ref$ObjectRef)]), block:B:31:0x0139 */
    /* JADX WARN: Not initialized variable reg: 29, insn: 0x0143: MOVE  (r9 I:??[OBJECT, ARRAY]) = (r29 I:??[OBJECT, ARRAY] A[D('receivedCloseReason' kotlin.jvm.internal.Ref$ObjectRef)]), block:B:31:0x0139 */
    /* JADX WARN: Not initialized variable reg: 30, insn: 0x0145: MOVE  (r7 I:??[OBJECT, ARRAY]) = (r30 I:??[OBJECT, ARRAY] A[D('receivedCloseCode' kotlin.jvm.internal.Ref$IntRef)]), block:B:31:0x0139 */
    /* JADX WARN: Not initialized variable reg: 31, insn: 0x0147: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r31 I:??[OBJECT, ARRAY] A[D('messageOrClose' kotlin.jvm.internal.Ref$ObjectRef)]), block:B:31:0x0139 */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x031a  */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v15, types: [T, okhttp3.internal.ws.RealWebSocket$Streams] */
    /* JADX WARN: Type inference failed for: r1v18, types: [T, okhttp3.internal.ws.WebSocketReader] */
    /* JADX WARN: Type inference failed for: r1v21, types: [T, okhttp3.internal.ws.WebSocketWriter] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean writeOneFrame$okhttp() throws IOException {
        ByteString pong;
        WebSocketWriter writer;
        final Ref.ObjectRef writerToClose;
        final Ref.ObjectRef readerToClose;
        final Ref.ObjectRef streamsToClose;
        Ref.ObjectRef receivedCloseReason;
        Ref.IntRef receivedCloseCode;
        Ref.ObjectRef messageOrClose;
        Ref.ObjectRef streamsToClose2;
        Ref.ObjectRef writerToClose2;
        Streams streams;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        WebSocketListener webSocketListener;
        RealWebSocket realWebSocket;
        int i;
        final Ref.ObjectRef messageOrClose2 = new Ref.ObjectRef();
        messageOrClose2.element = null;
        final Ref.IntRef receivedCloseCode2 = new Ref.IntRef();
        receivedCloseCode2.element = -1;
        final Ref.ObjectRef receivedCloseReason2 = new Ref.ObjectRef();
        receivedCloseReason2.element = null;
        Ref.ObjectRef streamsToClose3 = new Ref.ObjectRef();
        streamsToClose3.element = null;
        Ref.ObjectRef readerToClose2 = new Ref.ObjectRef();
        readerToClose2.element = null;
        Ref.ObjectRef writerToClose3 = new Ref.ObjectRef();
        writerToClose3.element = null;
        synchronized (this) {
            try {
                Ref.ObjectRef readerToClose3 = 0;
                readerToClose3 = null;
                readerToClose3 = null;
                if (this.failed) {
                    return false;
                }
                WebSocketWriter webSocketWriter2 = this.writer;
                final WebSocketWriter writer2 = webSocketWriter2;
                try {
                    ByteString pong2 = this.pongQueue.poll();
                    if (pong2 == null) {
                        try {
                            messageOrClose2.element = this.messageAndCloseQueue.poll();
                            if (messageOrClose2.element instanceof Close) {
                                try {
                                    receivedCloseCode2.element = this.receivedCloseCode;
                                    receivedCloseReason2.element = this.receivedCloseReason;
                                    if (receivedCloseCode2.element != -1) {
                                        try {
                                            streamsToClose3.element = this.streams;
                                            Streams streams2 = null;
                                            this.streams = null;
                                            readerToClose2.element = this.reader;
                                            WebSocketReader webSocketReader2 = null;
                                            this.reader = null;
                                            writerToClose3.element = this.writer;
                                            WebSocketWriter webSocketWriter3 = null;
                                            this.writer = null;
                                            this.taskQueue.shutdown();
                                            pong = pong2;
                                            writer = writer2;
                                            writerToClose = writerToClose3;
                                            readerToClose = readerToClose2;
                                            streamsToClose = streamsToClose3;
                                            receivedCloseReason = receivedCloseReason2;
                                            receivedCloseCode = receivedCloseCode2;
                                            messageOrClose = messageOrClose2;
                                            streamsToClose2 = webSocketWriter2;
                                            writerToClose2 = writer2;
                                        } catch (Throwable th) {
                                            th = th;
                                            throw th;
                                        }
                                    } else {
                                        Object obj = messageOrClose2.element;
                                        try {
                                            if (obj == null) {
                                                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close");
                                            }
                                            long cancelAfterCloseMillis = ((Close) obj).getCancelAfterCloseMillis();
                                            TaskQueue this_$iv = this.taskQueue;
                                            final String name$iv = this.name + " cancel";
                                            long delayNanos$iv = TimeUnit.MILLISECONDS.toNanos(cancelAfterCloseMillis);
                                            streamsToClose2 = 1;
                                            final RealWebSocket realWebSocket2 = this;
                                            pong = pong2;
                                            writer = writer2;
                                            final ByteString byteString = pong;
                                            writerToClose = writerToClose3;
                                            readerToClose = readerToClose2;
                                            streamsToClose = streamsToClose3;
                                            receivedCloseReason = receivedCloseReason2;
                                            receivedCloseCode = receivedCloseCode2;
                                            this_$iv.schedule(new Task(name$iv, true) { // from class: okhttp3.internal.ws.RealWebSocket$writeOneFrame$$inlined$synchronized$lambda$1
                                                @Override // okhttp3.internal.concurrent.Task
                                                public long runOnce() {
                                                    realWebSocket2.cancel();
                                                    return -1L;
                                                }
                                            }, delayNanos$iv);
                                            messageOrClose = messageOrClose2;
                                            readerToClose3 = realWebSocket2;
                                            writerToClose2 = byteString;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } else {
                                pong = pong2;
                                writer = writer2;
                                writerToClose = writerToClose3;
                                readerToClose = readerToClose2;
                                streamsToClose = streamsToClose3;
                                receivedCloseReason = receivedCloseReason2;
                                receivedCloseCode = receivedCloseCode2;
                                messageOrClose = messageOrClose2;
                                try {
                                    streamsToClose2 = webSocketWriter2;
                                    writerToClose2 = writer2;
                                    if (messageOrClose.element == null) {
                                        return false;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    throw th;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } else {
                        pong = pong2;
                        writer = writer2;
                        writerToClose = writerToClose3;
                        readerToClose = readerToClose2;
                        streamsToClose = streamsToClose3;
                        receivedCloseReason = receivedCloseReason2;
                        receivedCloseCode = receivedCloseCode2;
                        messageOrClose = messageOrClose2;
                        streamsToClose2 = webSocketWriter2;
                        writerToClose2 = writer2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
                try {
                    Unit unit = Unit.INSTANCE;
                    ByteString pong3 = pong;
                    try {
                        if (pong3 != null) {
                            try {
                                Intrinsics.checkNotNull(writer);
                                writer.writePong(pong3);
                                streamsToClose2 = streamsToClose;
                            } catch (Throwable th7) {
                                th = th7;
                                writerToClose2 = writerToClose;
                                readerToClose3 = readerToClose;
                                streamsToClose2 = streamsToClose;
                                streams = (Streams) streamsToClose2.element;
                                if (streams != null) {
                                    Util.closeQuietly(streams);
                                }
                                webSocketReader = (WebSocketReader) readerToClose3.element;
                                if (webSocketReader != null) {
                                    Util.closeQuietly(webSocketReader);
                                }
                                webSocketWriter = (WebSocketWriter) writerToClose2.element;
                                if (webSocketWriter != null) {
                                    Util.closeQuietly(webSocketWriter);
                                }
                                throw th;
                            }
                        } else {
                            WebSocketWriter writer3 = writer;
                            try {
                                if (messageOrClose.element instanceof Message) {
                                    Object obj2 = messageOrClose.element;
                                    if (obj2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Message");
                                    }
                                    Message message = (Message) obj2;
                                    Intrinsics.checkNotNull(writer3);
                                    writer3.writeMessageFrame(message.getFormatOpcode(), message.getData());
                                    synchronized (this) {
                                        this.queueSize -= message.getData().size();
                                        Unit unit2 = Unit.INSTANCE;
                                    }
                                    streamsToClose2 = streamsToClose;
                                } else {
                                    try {
                                        if (!(messageOrClose.element instanceof Close)) {
                                            throw new AssertionError();
                                        }
                                        Object obj3 = messageOrClose.element;
                                        if (obj3 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close");
                                        }
                                        Close close = (Close) obj3;
                                        Intrinsics.checkNotNull(writer3);
                                        writer3.writeClose(close.getCode(), close.getReason());
                                        streamsToClose2 = streamsToClose;
                                        try {
                                            if (((Streams) streamsToClose2.element) != null) {
                                                try {
                                                    webSocketListener = this.listener;
                                                    realWebSocket = this;
                                                    try {
                                                        i = receivedCloseCode.element;
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        writerToClose2 = writerToClose;
                                                        readerToClose3 = readerToClose;
                                                    }
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    writerToClose2 = writerToClose;
                                                    readerToClose3 = readerToClose;
                                                }
                                                try {
                                                    String str = (String) receivedCloseReason.element;
                                                    Intrinsics.checkNotNull(str);
                                                    webSocketListener.onClosed(realWebSocket, i, str);
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    writerToClose2 = writerToClose;
                                                    readerToClose3 = readerToClose;
                                                    streams = (Streams) streamsToClose2.element;
                                                    if (streams != null) {
                                                    }
                                                    webSocketReader = (WebSocketReader) readerToClose3.element;
                                                    if (webSocketReader != null) {
                                                    }
                                                    webSocketWriter = (WebSocketWriter) writerToClose2.element;
                                                    if (webSocketWriter != null) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                            writerToClose2 = writerToClose;
                                            readerToClose3 = readerToClose;
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                    }
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                writerToClose2 = writerToClose;
                                readerToClose3 = readerToClose;
                                streamsToClose2 = streamsToClose;
                            }
                        }
                        Streams streams3 = (Streams) streamsToClose2.element;
                        if (streams3 != null) {
                            Util.closeQuietly(streams3);
                        }
                        WebSocketReader webSocketReader3 = (WebSocketReader) readerToClose.element;
                        if (webSocketReader3 != null) {
                            Util.closeQuietly(webSocketReader3);
                        }
                        WebSocketWriter webSocketWriter4 = (WebSocketWriter) writerToClose.element;
                        if (webSocketWriter4 != null) {
                            Util.closeQuietly(webSocketWriter4);
                            return true;
                        }
                        return true;
                    } catch (Throwable th14) {
                        th = th14;
                        writerToClose2 = writerToClose;
                        readerToClose3 = readerToClose;
                        streamsToClose2 = streamsToClose;
                    }
                } catch (Throwable th15) {
                    th = th15;
                    throw th;
                }
            } catch (Throwable th16) {
                th = th16;
            }
        }
    }

    public final void writePingFrame$okhttp() {
        synchronized (this) {
            if (this.failed) {
                return;
            }
            WebSocketWriter writer = this.writer;
            if (writer != null) {
                int failedPing = this.awaitingPong ? this.sentPingCount : -1;
                this.sentPingCount++;
                this.awaitingPong = true;
                Unit unit = Unit.INSTANCE;
                if (failedPing != -1) {
                    failWebSocket(new SocketTimeoutException("sent ping but didn't receive pong within " + this.pingIntervalMillis + "ms (after " + (failedPing - 1) + " successful ping/pongs)"), null);
                    return;
                }
                try {
                    writer.writePing(ByteString.EMPTY);
                } catch (IOException e) {
                    failWebSocket(e, null);
                }
            }
        }
    }

    public final void failWebSocket(Exception e, Response response) {
        Intrinsics.checkNotNullParameter(e, "e");
        synchronized (this) {
            if (this.failed) {
                return;
            }
            this.failed = true;
            Streams streamsToClose = this.streams;
            Streams streams = null;
            this.streams = null;
            WebSocketReader readerToClose = this.reader;
            WebSocketReader webSocketReader = null;
            this.reader = null;
            WebSocketWriter writerToClose = this.writer;
            WebSocketWriter webSocketWriter = null;
            this.writer = null;
            this.taskQueue.shutdown();
            Unit unit = Unit.INSTANCE;
            try {
                this.listener.onFailure(this, e, response);
            } finally {
                if (streamsToClose != null) {
                    Util.closeQuietly(streamsToClose);
                }
                if (readerToClose != null) {
                    Util.closeQuietly(readerToClose);
                }
                if (writerToClose != null) {
                    Util.closeQuietly(writerToClose);
                }
            }
        }
    }

    /* compiled from: RealWebSocket.kt */
    @Metadata(m72bv = {1, 0, 3}, m71d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m70d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", "", "formatOpcode", "", "data", "Lokio/ByteString;", "(ILokio/ByteString;)V", "getData", "()Lokio/ByteString;", "getFormatOpcode", "()I", "okhttp"}, m69k = 1, m68mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.ws.RealWebSocket$Message */
    /* loaded from: classes.dex */
    public static final class Message {
        private final ByteString data;
        private final int formatOpcode;

        public Message(int formatOpcode, ByteString data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.formatOpcode = formatOpcode;
            this.data = data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }

        public final ByteString getData() {
            return this.data;
        }
    }

    /* compiled from: RealWebSocket.kt */
    @Metadata(m72bv = {1, 0, 3}, m71d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m70d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", "", "code", "", "reason", "Lokio/ByteString;", "cancelAfterCloseMillis", "", "(ILokio/ByteString;J)V", "getCancelAfterCloseMillis", "()J", "getCode", "()I", "getReason", "()Lokio/ByteString;", "okhttp"}, m69k = 1, m68mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.ws.RealWebSocket$Close */
    /* loaded from: classes.dex */
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        private final ByteString reason;

        public Close(int code, ByteString reason, long cancelAfterCloseMillis) {
            this.code = code;
            this.reason = reason;
            this.cancelAfterCloseMillis = cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        public final ByteString getReason() {
            return this.reason;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }
    }

    /* compiled from: RealWebSocket.kt */
    @Metadata(m72bv = {1, 0, 3}, m71d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m70d2 = {"Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/io/Closeable;", "client", "", "source", "Lokio/BufferedSource;", "sink", "Lokio/BufferedSink;", "(ZLokio/BufferedSource;Lokio/BufferedSink;)V", "getClient", "()Z", "getSink", "()Lokio/BufferedSink;", "getSource", "()Lokio/BufferedSource;", "okhttp"}, m69k = 1, m68mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.ws.RealWebSocket$Streams */
    /* loaded from: classes.dex */
    public static abstract class Streams implements Closeable {
        private final boolean client;
        private final BufferedSink sink;
        private final BufferedSource source;

        public Streams(boolean client, BufferedSource source, BufferedSink sink) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            this.client = client;
            this.source = source;
            this.sink = sink;
        }

        public final boolean getClient() {
            return this.client;
        }

        public final BufferedSource getSource() {
            return this.source;
        }

        public final BufferedSink getSink() {
            return this.sink;
        }
    }

    /* compiled from: RealWebSocket.kt */
    @Metadata(m72bv = {1, 0, 3}, m71d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m70d2 = {"Lokhttp3/internal/ws/RealWebSocket$WriterTask;", "Lokhttp3/internal/concurrent/Task;", "(Lokhttp3/internal/ws/RealWebSocket;)V", "runOnce", "", "okhttp"}, m69k = 1, m68mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.ws.RealWebSocket$WriterTask */
    /* loaded from: classes.dex */
    private final class WriterTask extends Task {
        public WriterTask() {
            super(RealWebSocket.this.name + " writer", false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            try {
                return RealWebSocket.this.writeOneFrame$okhttp() ? 0L : -1L;
            } catch (IOException e) {
                RealWebSocket.this.failWebSocket(e, null);
                return -1L;
            }
        }
    }

    /* compiled from: RealWebSocket.kt */
    @Metadata(m72bv = {1, 0, 3}, m71d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m70d2 = {"Lokhttp3/internal/ws/RealWebSocket$Companion;", "", "()V", "CANCEL_AFTER_CLOSE_MILLIS", "", "DEFAULT_MINIMUM_DEFLATE_SIZE", "MAX_QUEUE_SIZE", "ONLY_HTTP1", "", "Lokhttp3/Protocol;", "okhttp"}, m69k = 1, m68mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.ws.RealWebSocket$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}

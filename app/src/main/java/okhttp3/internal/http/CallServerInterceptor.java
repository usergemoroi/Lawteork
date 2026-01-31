package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okio.BufferedSink;
import okio.Okio;
/* compiled from: CallServerInterceptor.kt */
@Metadata(m72bv = {1, 0, 3}, m71d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m70d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "forWebSocket", "", "(Z)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "okhttp"}, m69k = 1, m68mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean forWebSocket) {
        this.forWebSocket = forWebSocket;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0165, code lost:
        if (kotlin.text.StringsKt.equals("close", okhttp3.Response.header$default(r10, "Connection", null, 2, null), true) != false) goto L50;
     */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Response build;
        Long l;
        Intrinsics.checkNotNullParameter(chain, "chain");
        RealInterceptorChain realChain = (RealInterceptorChain) chain;
        Exchange exchange = realChain.getExchange$okhttp();
        Intrinsics.checkNotNull(exchange);
        Request request = realChain.getRequest$okhttp();
        RequestBody requestBody = request.body();
        long sentRequestMillis = System.currentTimeMillis();
        exchange.writeRequestHeaders(request);
        boolean invokeStartEvent = true;
        Response.Builder responseBuilder = null;
        if (HttpMethod.permitsRequestBody(request.method()) && requestBody != null) {
            if (StringsKt.equals("100-continue", request.header("Expect"), true)) {
                exchange.flushRequest();
                responseBuilder = exchange.readResponseHeaders(true);
                exchange.responseHeadersStart();
                invokeStartEvent = false;
            }
            if (responseBuilder == null) {
                if (requestBody.isDuplex()) {
                    exchange.flushRequest();
                    requestBody.writeTo(Okio.buffer(exchange.createRequestBody(request, true)));
                } else {
                    BufferedSink bufferedRequestBody = Okio.buffer(exchange.createRequestBody(request, false));
                    requestBody.writeTo(bufferedRequestBody);
                    bufferedRequestBody.close();
                }
            } else {
                exchange.noRequestBody();
                if (!exchange.getConnection$okhttp().isMultiplexed$okhttp()) {
                    exchange.noNewExchangesOnConnection();
                }
            }
        } else {
            exchange.noRequestBody();
        }
        if (requestBody == null || !requestBody.isDuplex()) {
            exchange.finishRequest();
        }
        if (responseBuilder == null) {
            Response.Builder readResponseHeaders = exchange.readResponseHeaders(false);
            Intrinsics.checkNotNull(readResponseHeaders);
            responseBuilder = readResponseHeaders;
            if (invokeStartEvent) {
                exchange.responseHeadersStart();
                invokeStartEvent = false;
            }
        }
        Response response = responseBuilder.request(request).handshake(exchange.getConnection$okhttp().handshake()).sentRequestAtMillis(sentRequestMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        int code = response.code();
        if (code == 100) {
            Response.Builder responseBuilder2 = exchange.readResponseHeaders(false);
            Intrinsics.checkNotNull(responseBuilder2);
            if (invokeStartEvent) {
                exchange.responseHeadersStart();
            }
            response = responseBuilder2.request(request).handshake(exchange.getConnection$okhttp().handshake()).sentRequestAtMillis(sentRequestMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            code = response.code();
        }
        exchange.responseHeadersEnd(response);
        if (this.forWebSocket && code == 101) {
            build = response.newBuilder().body(Util.EMPTY_RESPONSE).build();
        } else {
            build = response.newBuilder().body(exchange.openResponseBody(response)).build();
        }
        Response response2 = build;
        if (StringsKt.equals("close", response2.request().header("Connection"), true)) {
            l = null;
        } else {
            l = null;
        }
        exchange.noNewExchangesOnConnection();
        if (code == 204 || code == 205) {
            ResponseBody body = response2.body();
            if ((body != null ? body.contentLength() : -1L) > 0) {
                StringBuilder append = new StringBuilder().append("HTTP ").append(code).append(" had non-zero Content-Length: ");
                ResponseBody body2 = response2.body();
                if (body2 != null) {
                    l = Long.valueOf(body2.contentLength());
                }
                throw new ProtocolException(append.append(l).toString());
            }
        }
        return response2;
    }
}

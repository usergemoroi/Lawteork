#pragma once

#include <string>
#include <vector>
#include <map>
#include <memory>

namespace Client {

    // HTTP methods
    enum class HttpMethod {
        GET,
        POST,
        PUT,
        DELETE,
        HEAD,
        PATCH
    };

    // HTTP request structure
    struct HttpRequest {
        std::string url;
        HttpMethod method;
        std::map<std::string, std::string> headers;
        std::string body;
        int32_t timeoutSeconds;
    };

    // HTTP response structure
    struct HttpResponse {
        int32_t statusCode;
        std::map<std::string, std::string> headers;
        std::string body;
        bool success;
        std::string errorMessage;
    };

    // Network client class
    class NetworkClient {
    public:
        NetworkClient();
        ~NetworkClient();

        HttpResponse SendRequest(const HttpRequest& request);
        HttpResponse Get(const std::string& url, const std::map<std::string, std::string>& headers = {});
        HttpResponse Post(const std::string& url, const std::string& body, const std::map<std::string, std::string>& headers = {});
        HttpResponse Put(const std::string& url, const std::string& body, const std::map<std::string, std::string>& headers = {});
        HttpResponse Delete(const std::string& url, const std::map<std::string, std::string>& headers = {});

        bool DownloadFile(const std::string& url, const std::string& destination);
        std::string DownloadString(const std::string& url);

        void SetUserAgent(const std::string& userAgent);
        void SetTimeout(int32_t timeoutSeconds);
        void SetFollowRedirects(bool follow);

        bool CheckInternetConnection();
        std::string GetLocalIPAddress();

    private:
        class Impl;
        std::unique_ptr<Impl> impl;
    };

    // WebSocket client class
    class WebSocketClient {
    public:
        WebSocketClient();
        ~WebSocketClient();

        bool Connect(const std::string& url);
        void Disconnect();
        bool IsConnected();

        bool SendMessage(const std::string& message);
        std::string ReceiveMessage();

        void SetCallback(void (*callback)(const std::string& message));

    private:
        class Impl;
        std::unique_ptr<Impl> impl;
    };

    // Network utilities
    class NetworkUtils {
    public:
        static std::string UrlEncode(const std::string& data);
        static std::string UrlDecode(const std::string& data);
        static std::string Base64Encode(const std::vector<uint8_t>& data);
        static std::vector<uint8_t> Base64Decode(const std::string& data);
        static std::string GenerateUserAgent();
        static bool IsValidUrl(const std::string& url);
    };

} // namespace Client

#pragma once

#include <string>
#include <vector>
#include <map>
#include <memory>

namespace Client {

    // API Server endpoints configuration
    struct ApiConfig {
        std::string baseUrl;
        std::string apiKey;
        std::string apiSecret;
        std::string version;
        int32_t timeoutSeconds;
        bool useSSL;
    };

    // API Server response structure
    struct ApiResponse {
        int32_t statusCode;
        std::string data;
        bool success;
        std::string errorMessage;
        std::map<std::string, std::string> metadata;
    };

    // API Server client class
    class ApiServer {
    public:
        ApiServer();
        ~ApiServer();

        // Initialization
        bool Initialize(const ApiConfig& config);
        void Shutdown();
        bool IsInitialized();

        // API endpoints
        std::string CheckServer();
        std::string GetEXP();
        std::string GetPw();
        std::string GetURLJSON();
        std::string GetActivity();
        std::string CheckSuspiciousApps();
        std::string GetFdjhvf();
        std::string GetGrup();
        std::string GetOwner();
        std::string GetTelegram();
        std::string GetMainURL();
        std::string GetSockAllVersion();
        std::string GetSockIndia();

        // Configuration endpoints
        std::string GetConfig(const std::string& key);
        bool SetConfig(const std::string& key, const std::string& value);

        // Authentication
        bool Authenticate(const std::string& username, const std::string& password);
        bool IsAuthenticated();
        void Logout();

        // Device registration
        bool RegisterDevice(const std::string& deviceId, const std::string& deviceInfo);
        bool UnregisterDevice(const std::string& deviceId);

        // Telemetry
        bool SendTelemetry(const std::string& event, const std::map<std::string, std::string>& data);

        // Error handling
        std::string GetLastError();
        void ClearError();

    private:
        class Impl;
        std::unique_ptr<Impl> impl;
    };

    // Singleton instance
    ApiServer* GetApiServerInstance();

} // namespace Client

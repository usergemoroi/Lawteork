#pragma once

#include <cstdint>
#include <string>
#include <vector>
#include <map>

namespace BlackBox {

    // Basic types
    using byte = uint8_t;
    using word = uint16_t;
    using dword = uint32_t;
    using qword = uint64_t;

    // String types
    using String = std::string;
    using StringVector = std::vector<std::string>;
    using StringMap = std::map<std::string, std::string>;

    // Binary data
    using ByteArray = std::vector<uint8_t>;
    using ByteVector = std::vector<uint8_t>;

    // Result codes
    enum class ResultCode : int32_t {
        SUCCESS = 0,
        FAILURE = -1,
        ERROR_INVALID_ARGUMENT = -2,
        ERROR_NOT_INITIALIZED = -3,
        ERROR_ALREADY_INITIALIZED = -4,
        ERROR_OUT_OF_MEMORY = -5,
        ERROR_FILE_NOT_FOUND = -6,
        ERROR_ACCESS_DENIED = -7,
        ERROR_SECURITY_VIOLATION = -8,
        ERROR_NETWORK = -9,
        ERROR_TIMEOUT = -10,
        ERROR_UNKNOWN = -100
    };

    // Security levels
    enum class SecurityLevel : int32_t {
        NONE = 0,
        LOW = 1,
        MEDIUM = 2,
        HIGH = 3,
        MAXIMUM = 4
    };

    // Device information structure
    struct DeviceInfo {
        std::string deviceId;
        std::string deviceModel;
        std::string deviceManufacturer;
        std::string androidVersion;
        std::string buildFingerprint;
        std::string serialNumber;
        bool isRooted;
        bool isEmulator;
        bool hasDebugger;
    };

    // File information structure
    struct FileInfo {
        std::string path;
        uint64_t size;
        uint64_t lastModified;
        bool isDirectory;
        bool isReadable;
        bool isWritable;
        bool exists;
    };

    // Network information structure
    struct NetworkInfo {
        bool isConnected;
        bool isWifi;
        bool isMobile;
        std::string localIpAddress;
        std::string macAddress;
        int32_t signalStrength;
    };

    // Configuration structure
    struct Config {
        std::string key;
        std::string value;
        std::string description;
        bool isSensitive;
    };

    // Security context structure (opaque pointer)
    struct SecurityContext;

    // Callback types
    using LogCallback = void(*)(const std::string& tag, const std::string& message);
    using ErrorCallback = void(*)(const std::string& tag, const std::string& message);
    using ProgressCallback = void(*)(int32_t progress, const std::string& message);

} // namespace BlackBox

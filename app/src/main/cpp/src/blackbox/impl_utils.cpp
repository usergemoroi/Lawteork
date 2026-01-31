#include "../../include/blackbox/blackbox.hpp"
#include "../../include/blackbox/types.hpp"
#include "../../include/blackbox/utils.hpp"
#include <jni.h>
#include <android/log.h>
#include <unistd.h>
#include <sys/system_properties.h>
#include <cstdio>
#include <cstdlib>
#include <memory>
#include <array>
#include <chrono>

#define LOG_TAG "BlackBoxUtils"
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)

namespace BlackBox {

    // SystemUtils implementation
    std::string SystemUtils::GetSystemProperty(const std::string& key) {
        char prop[PROP_VALUE_MAX];
        int len = __system_property_get(key.c_str(), prop);
        if (len > 0) {
            return std::string(prop, len);
        }
        return "";
    }

    std::string SystemUtils::ExecuteCommand(const std::string& command) {
        std::array<char, 128> buffer;
        std::string result;
        std::unique_ptr<FILE, decltype(&pclose)> pipe(popen(command.c_str(), "r"), pclose);
        if (!pipe) {
            return "";
        }
        while (fgets(buffer.data(), buffer.size(), pipe.get()) != nullptr) {
            result += buffer.data();
        }
        return result;
    }

    bool SystemUtils::ExecuteCommandWithResult(const std::string& command, std::string& output) {
        output = ExecuteCommand(command);
        return !output.empty();
    }

    uint64_t SystemUtils::GetCurrentTimeMillis() {
        auto now = std::chrono::system_clock::now();
        auto duration = now.time_since_epoch();
        return std::chrono::duration_cast<std::chrono::milliseconds>(duration).count();
    }

    uint64_t SystemUtils::GetCurrentTimeNanos() {
        auto now = std::chrono::system_clock::now();
        auto duration = now.time_since_epoch();
        return std::chrono::duration_cast<std::chrono::nanoseconds>(duration).count();
    }

    void SystemUtils::SleepMillis(uint64_t millis) {
        usleep(millis * 1000);
    }

    void SystemUtils::SleepNanos(uint64_t nanos) {
        usleep(nanos / 1000);
    }

    // LogUtils implementation
    void LogUtils::LogDebug(const std::string& tag, const std::string& message) {
        __android_log_print(ANDROID_LOG_DEBUG, tag.c_str(), "%s", message.c_str());
    }

    void LogUtils::LogInfo(const std::string& tag, const std::string& message) {
        __android_log_print(ANDROID_LOG_INFO, tag.c_str(), "%s", message.c_str());
    }

    void LogUtils::LogWarn(const std::string& tag, const std::string& message) {
        __android_log_print(ANDROID_LOG_WARN, tag.c_str(), "%s", message.c_str());
    }

    void LogUtils::LogError(const std::string& tag, const std::string& message) {
        __android_log_print(ANDROID_LOG_ERROR, tag.c_str(), "%s", message.c_str());
    }

    void LogUtils::LogFatal(const std::string& tag, const std::string& message) {
        __android_log_print(ANDROID_LOG_FATAL, tag.c_str(), "%s", message.c_str());
    }

} // namespace BlackBox

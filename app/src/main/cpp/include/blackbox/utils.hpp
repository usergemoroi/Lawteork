#pragma once

#include "types.hpp"
#include <jni.h>

namespace BlackBox {

    // String utilities
    class StringUtils {
    public:
        static std::string ToLower(const std::string& str);
        static std::string ToUpper(const std::string& str);
        static std::string Trim(const std::string& str);
        static std::vector<std::string> Split(const std::string& str, char delimiter);
        static std::string Join(const std::vector<std::string>& parts, const std::string& delimiter);
        static bool StartsWith(const std::string& str, const std::string& prefix);
        static bool EndsWith(const std::string& str, const std::string& suffix);
        static bool Contains(const std::string& str, const std::string& substring);
        static std::string Replace(const std::string& str, const std::string& from, const std::string& to);
    };

    // File utilities
    class FileUtils {
    public:
        static bool FileExists(const std::string& path);
        static bool DirectoryExists(const std::string& path);
        static bool CreateDirectory(const std::string& path);
        static bool DeleteFile(const std::string& path);
        static bool CopyFile(const std::string& src, const std::string& dest);
        static bool MoveFile(const std::string& src, const std::string& dest);
        static uint64_t GetFileSize(const std::string& path);
        static std::string ReadFileToString(const std::string& path);
        static bool WriteStringToFile(const std::string& path, const std::string& content);
        static std::vector<uint8_t> ReadFileToBytes(const std::string& path);
        static bool WriteBytesToFile(const std::string& path, const std::vector<uint8_t>& bytes);
    };

    // JNI utilities
    class JNIUtils {
    public:
        static jclass FindClass(JNIEnv* env, const char* className);
        static jmethodID GetMethodID(JNIEnv* env, jclass clazz, const char* name, const char* sig);
        static jfieldID GetFieldID(JNIEnv* env, jclass clazz, const char* name, const char* sig);
        static jstring NewStringUTF(JNIEnv* env, const char* bytes);
        static std::string GetStringUTF(JNIEnv* env, jstring str);
        static void ThrowException(JNIEnv* env, const char* className, const char* message);
        static void LogException(JNIEnv* env, const char* tag);
    };

    // Security utilities
    class SecurityUtils {
    public:
        static std::string GenerateUUID();
        static std::string GenerateRandomString(size_t length);
        static std::string HashString(const std::string& input, const std::string& algorithm = "SHA-256");
        static std::string Base64Encode(const std::vector<uint8_t>& data);
        static std::vector<uint8_t> Base64Decode(const std::string& data);
        static std::string URLEncode(const std::string& data);
        static std::string URLDecode(const std::string& data);
    };

    // System utilities
    class SystemUtils {
    public:
        static std::string GetSystemProperty(const std::string& key);
        static std::string ExecuteCommand(const std::string& command);
        static bool ExecuteCommandWithResult(const std::string& command, std::string& output);
        static uint64_t GetCurrentTimeMillis();
        static uint64_t GetCurrentTimeNanos();
        static void SleepMillis(uint64_t millis);
        static void SleepNanos(uint64_t nanos);
    };

    // Logging utilities
    class LogUtils {
    public:
        static void LogDebug(const std::string& tag, const std::string& message);
        static void LogInfo(const std::string& tag, const std::string& message);
        static void LogWarn(const std::string& tag, const std::string& message);
        static void LogError(const std::string& tag, const std::string& message);
        static void LogFatal(const std::string& tag, const std::string& message);
    };

} // namespace BlackBox

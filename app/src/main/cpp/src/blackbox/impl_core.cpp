#include "../../include/blackbox/blackbox.hpp"
#include "../../include/blackbox/types.hpp"
#include "../../include/blackbox/utils.hpp"
#include <jni.h>
#include <android/log.h>
#include <unistd.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <sys/system_properties.h>
#include <fstream>
#include <sstream>

#define LOG_TAG "BlackBoxCore"
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)

namespace BlackBox {

    // StringUtils implementation
    std::string StringUtils::ToLower(const std::string& str) {
        std::string result = str;
        for (char& c : result) {
            c = tolower(c);
        }
        return result;
    }

    std::string StringUtils::ToUpper(const std::string& str) {
        std::string result = str;
        for (char& c : result) {
            c = toupper(c);
        }
        return result;
    }

    std::string StringUtils::Trim(const std::string& str) {
        size_t start = str.find_first_not_of(" \t\n\r");
        if (start == std::string::npos) return "";
        size_t end = str.find_last_not_of(" \t\n\r");
        return str.substr(start, end - start + 1);
    }

    std::vector<std::string> StringUtils::Split(const std::string& str, char delimiter) {
        std::vector<std::string> result;
        std::stringstream ss(str);
        std::string item;
        while (std::getline(ss, item, delimiter)) {
            if (!item.empty()) {
                result.push_back(item);
            }
        }
        return result;
    }

    std::string StringUtils::Join(const std::vector<std::string>& parts, const std::string& delimiter) {
        std::string result;
        for (size_t i = 0; i < parts.size(); i++) {
            if (i != 0) {
                result += delimiter;
            }
            result += parts[i];
        }
        return result;
    }

    bool StringUtils::StartsWith(const std::string& str, const std::string& prefix) {
        return str.rfind(prefix, 0) == 0;
    }

    bool StringUtils::EndsWith(const std::string& str, const std::string& suffix) {
        if (str.length() < suffix.length()) return false;
        return str.compare(str.length() - suffix.length(), suffix.length(), suffix) == 0;
    }

    bool StringUtils::Contains(const std::string& str, const std::string& substring) {
        return str.find(substring) != std::string::npos;
    }

    std::string StringUtils::Replace(const std::string& str, const std::string& from, const std::string& to) {
        std::string result = str;
        size_t pos = 0;
        while ((pos = result.find(from, pos)) != std::string::npos) {
            result.replace(pos, from.length(), to);
            pos += to.length();
        }
        return result;
    }

    // FileUtils implementation
    bool FileUtils::FileExists(const std::string& path) {
        struct stat buffer;
        return stat(path.c_str(), &buffer) == 0;
    }

    bool FileUtils::DirectoryExists(const std::string& path) {
        struct stat buffer;
        if (stat(path.c_str(), &buffer) != 0) {
            return false;
        }
        return S_ISDIR(buffer.st_mode);
    }

    bool FileUtils::CreateDirectory(const std::string& path) {
        return mkdir(path.c_str(), 0755) == 0 || errno == EEXIST;
    }

    bool FileUtils::DeleteFile(const std::string& path) {
        return unlink(path.c_str()) == 0;
    }

    bool FileUtils::CopyFile(const std::string& src, const std::string& dest) {
        std::ifstream srcFile(src, std::ios::binary);
        std::ofstream destFile(dest, std::ios::binary);
        if (!srcFile || !destFile) {
            return false;
        }
        destFile << srcFile.rdbuf();
        return true;
    }

    bool FileUtils::MoveFile(const std::string& src, const std::string& dest) {
        return rename(src.c_str(), dest.c_str()) == 0;
    }

    uint64_t FileUtils::GetFileSize(const std::string& path) {
        struct stat buffer;
        if (stat(path.c_str(), &buffer) != 0) {
            return 0;
        }
        return buffer.st_size;
    }

    std::string FileUtils::ReadFileToString(const std::string& path) {
        std::ifstream file(path);
        if (!file) {
            return "";
        }
        std::stringstream buffer;
        buffer << file.rdbuf();
        return buffer.str();
    }

    bool FileUtils::WriteStringToFile(const std::string& path, const std::string& content) {
        std::ofstream file(path);
        if (!file) {
            return false;
        }
        file << content;
        return true;
    }

    std::vector<uint8_t> FileUtils::ReadFileToBytes(const std::string& path) {
        std::ifstream file(path, std::ios::binary | std::ios::ate);
        if (!file) {
            return {};
        }
        std::streamsize size = file.tellg();
        file.seekg(0, std::ios::beg);
        std::vector<uint8_t> buffer(size);
        if (file.read((char*)buffer.data(), size)) {
            return buffer;
        }
        return {};
    }

    bool FileUtils::WriteBytesToFile(const std::string& path, const std::vector<uint8_t>& bytes) {
        std::ofstream file(path, std::ios::binary);
        if (!file) {
            return false;
        }
        file.write((const char*)bytes.data(), bytes.size());
        return true;
    }

    // JNIUtils implementation
    jclass JNIUtils::FindClass(JNIEnv* env, const char* className) {
        jclass clazz = env->FindClass(className);
        if (env->ExceptionCheck()) {
            env->ExceptionClear();
            return nullptr;
        }
        return clazz;
    }

    jmethodID JNIUtils::GetMethodID(JNIEnv* env, jclass clazz, const char* name, const char* sig) {
        jmethodID method = env->GetMethodID(clazz, name, sig);
        if (env->ExceptionCheck()) {
            env->ExceptionClear();
            return nullptr;
        }
        return method;
    }

    jfieldID JNIUtils::GetFieldID(JNIEnv* env, jclass clazz, const char* name, const char* sig) {
        jfieldID field = env->GetFieldID(clazz, name, sig);
        if (env->ExceptionCheck()) {
            env->ExceptionClear();
            return nullptr;
        }
        return field;
    }

    jstring JNIUtils::NewStringUTF(JNIEnv* env, const char* bytes) {
        jstring str = env->NewStringUTF(bytes);
        if (env->ExceptionCheck()) {
            env->ExceptionClear();
            return nullptr;
        }
        return str;
    }

    std::string JNIUtils::GetStringUTF(JNIEnv* env, jstring str) {
        const char* bytes = env->GetStringUTFChars(str, nullptr);
        if (env->ExceptionCheck()) {
            env->ExceptionClear();
            return "";
        }
        std::string result(bytes);
        env->ReleaseStringUTFChars(str, bytes);
        return result;
    }

    void JNIUtils::ThrowException(JNIEnv* env, const char* className, const char* message) {
        jclass exceptionClass = env->FindClass(className);
        if (exceptionClass) {
            env->ThrowNew(exceptionClass, message);
        }
    }

    void JNIUtils::LogException(JNIEnv* env, const char* tag) {
        jthrowable exception = env->ExceptionOccurred();
        if (exception) {
            env->ExceptionDescribe();
            env->ExceptionClear();
        }
    }

} // namespace BlackBox

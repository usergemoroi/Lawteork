#include "../../include/blackbox/blackbox.hpp"
#include "../../include/blackbox/types.hpp"
#include "../../include/blackbox/utils.hpp"
#include "../../jni/jni_interface.hpp"
#include <jni.h>
#include <android/log.h>
#include <dlfcn.h>
#include <unistd.h>
#include <sys/system_properties.h>
#include <fstream>
#include <sstream>
#include <memory>
#include <mutex>

#define LOG_TAG "BlackBoxNative"
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)

namespace BlackBox {

    // Global state
    static bool g_initialized = false;
    static std::mutex g_mutex;
    static JavaVM* g_javaVM = nullptr;

    // Security context
    struct SecurityContext {
        bool signatureVerified;
        bool tamperingDetected;
        std::string deviceFingerprint;
        std::string licenseKey;
    };

    static SecurityContext g_securityContext;

    bool Initialize() {
        std::lock_guard<std::mutex> lock(g_mutex);
        
        if (g_initialized) {
            LOGE("BlackBox already initialized");
            return false;
        }
        
        LOGD("Initializing BlackBox...");
        
        // Initialize security context
        g_securityContext.signatureVerified = false;
        g_securityContext.tamperingDetected = false;
        g_securityContext.deviceFingerprint = "";
        g_securityContext.licenseKey = "@VDYYDV";
        
        g_initialized = true;
        LOGD("BlackBox initialized successfully");
        
        return true;
    }

    void Shutdown() {
        std::lock_guard<std::mutex> lock(g_mutex);
        
        if (!g_initialized) {
            LOGE("BlackBox not initialized");
            return;
        }
        
        LOGD("Shutting down BlackBox...");
        
        // Clean up resources
        g_securityContext.deviceFingerprint.clear();
        g_securityContext.licenseKey.clear();
        
        g_initialized = false;
        LOGD("BlackBox shut down successfully");
    }

    bool IsInitialized() {
        return g_initialized;
    }

    bool VerifySignature(const std::string& apkPath) {
        // Implementation would verify APK signature
        // For now, return true to indicate success
        LOGD("Verifying signature for: %s", apkPath.c_str());
        g_securityContext.signatureVerified = true;
        return true;
    }

    bool CheckTampering() {
        // Implementation would check for tampering
        LOGD("Checking for tampering");
        g_securityContext.tamperingDetected = false;
        return !g_securityContext.tamperingDetected;
    }

    std::string GetDeviceFingerprint() {
        if (g_securityContext.deviceFingerprint.empty()) {
            // Generate a device fingerprint
            g_securityContext.deviceFingerprint = SecurityUtils::GenerateUUID();
            LOGD("Generated device fingerprint: %s", g_securityContext.deviceFingerprint.c_str());
        }
        return g_securityContext.deviceFingerprint;
    }

    bool ValidateLicense(const std::string& licenseKey) {
        LOGD("Validating license: %s", licenseKey.c_str());
        // Simple validation - in real implementation, this would check with server
        g_securityContext.licenseKey = licenseKey;
        return !licenseKey.empty();
    }

    bool IsRootedDevice() {
        // Check for common root indicators
        bool rooted = FileUtils::FileExists("/su/bin/su") ||
                     FileUtils::FileExists("/system/bin/su") ||
                     FileUtils::FileExists("/system/xbin/su");
        
        LOGD("Root check: %s", rooted ? "true" : "false");
        return rooted;
    }

    bool IsEmulator() {
        // Check for emulator indicators
        std::string buildFingerprint = SystemUtils::GetSystemProperty("ro.build.fingerprint");
        bool emulator = buildFingerprint.find("generic") != std::string::npos ||
                       buildFingerprint.find("sdk") != std::string::npos;
        
        LOGD("Emulator check: %s", emulator ? "true" : "false");
        return emulator;
    }

    bool IsDebuggerAttached() {
        // Check if debugger is attached
        char debugStatus[10] = {0};
        FILE* fp = fopen("/proc/self/status", "r");
        if (fp) {
            while (fgets(debugStatus, sizeof(debugStatus), fp)) {
                if (strstr(debugStatus, "TracerPid:")) {
                    int tracerPid = atoi(debugStatus + strlen("TracerPid:"));
                    fclose(fp);
                    bool debugged = tracerPid != 0;
                    LOGD("Debugger check: %s", debugged ? "true" : "false");
                    return debugged;
                }
            }
            fclose(fp);
        }
        return false;
    }

    bool ExecuteShellCommand(const std::string& command) {
        LOGD("Executing shell command: %s", command.c_str());
        std::string output;
        return SystemUtils::ExecuteCommandWithResult(command, output);
    }

    std::string ExecuteShellCommandWithOutput(const std::string& command) {
        LOGD("Executing shell command with output: %s", command.c_str());
        return SystemUtils::ExecuteCommand(command);
    }

    bool FileExists(const std::string& path) {
        return FileUtils::FileExists(path);
    }

    bool CreateDirectory(const std::string& path) {
        return FileUtils::CreateDirectory(path);
    }

    bool DeleteFile(const std::string& path) {
        return FileUtils::DeleteFile(path);
    }

    bool CopyFile(const std::string& src, const std::string& dest) {
        return FileUtils::CopyFile(src, dest);
    }

    std::string EncryptData(const std::string& data, const std::string& key) {
        // Simple XOR "encryption" for demonstration
        std::string result = data;
        for (size_t i = 0; i < result.size(); i++) {
            result[i] ^= key[i % key.size()];
        }
        return SecurityUtils::Base64Encode(std::vector<uint8_t>(result.begin(), result.end()));
    }

    std::string DecryptData(const std::string& data, const std::string& key) {
        // Simple XOR "decryption" for demonstration
        std::vector<uint8_t> decoded = SecurityUtils::Base64Decode(data);
        std::string result(decoded.begin(), decoded.end());
        for (size_t i = 0; i < result.size(); i++) {
            result[i] ^= key[i % key.size()];
        }
        return result;
    }

    std::string GenerateAESKey() {
        return SecurityUtils::GenerateRandomString(32);
    }

    bool CheckInternetConnection() {
        return SystemUtils::ExecuteCommand("ping -c 1 8.8.8.8").find("1 packets transmitted") != std::string::npos;
    }

    std::string GetLocalIPAddress() {
        return SystemUtils::ExecuteCommand("ip route | grep src");
    }

    void LogMessage(const std::string& tag, const std::string& message) {
        LOGD("[%s] %s", tag.c_str(), message.c_str());
    }

    void LogError(const std::string& tag, const std::string& message) {
        LOGE("[%s] %s", tag.c_str(), message.c_str());
    }

    void SetConfigValue(const std::string& key, const std::string& value) {
        // In a real implementation, this would store to preferences or file
        LOGD("Setting config: %s = %s", key.c_str(), value.c_str());
    }

    std::string GetConfigValue(const std::string& key, const std::string& defaultValue) {
        // In a real implementation, this would retrieve from preferences or file
        LOGD("Getting config: %s (default: %s)", key.c_str(), defaultValue.c_str());
        return defaultValue;
    }

    void LockMutex() {
        g_mutex.lock();
    }

    void UnlockMutex() {
        g_mutex.unlock();
    }

    JavaVM* GetJavaVM() {
        return g_javaVM;
    }

    void SetJavaVM(JavaVM* vm) {
        g_javaVM = vm;
    }

    JNIEnv* GetJNIEnv() {
        JNIEnv* env = nullptr;
        if (g_javaVM) {
            g_javaVM->GetEnv((void**)&env, JNI_VERSION_1_6);
        }
        return env;
    }

} // namespace BlackBox

// JNI implementations for BlackBox
extern "C" {

    JNIEXPORT jboolean JNICALL Java_kentos_loader_Component_DownloadZip_verifySignature(JNIEnv* env, jobject thiz, jstring apkPath)
    {
        const char* path = env->GetStringUTFChars(apkPath, nullptr);
        bool result = BlackBox::VerifySignature(path);
        env->ReleaseStringUTFChars(apkPath, path);
        return result ? JNI_TRUE : JNI_FALSE;
    }

    JNIEXPORT jboolean JNICALL Java_kentos_loader_Component_DownloadZip_checkTampering(JNIEnv* env, jobject thiz)
    {
        return BlackBox::CheckTampering() ? JNI_TRUE : JNI_FALSE;
    }

    JNIEXPORT jstring JNICALL Java_kentos_loader_Component_DownloadZip_getDeviceFingerprint(JNIEnv* env, jobject thiz)
    {
        std::string fingerprint = BlackBox::GetDeviceFingerprint();
        return env->NewStringUTF(fingerprint.c_str());
    }

    JNIEXPORT jboolean JNICALL Java_kentos_loader_Component_DownloadZip_validateLicense(JNIEnv* env, jobject thiz, jstring licenseKey)
    {
        const char* key = env->GetStringUTFChars(licenseKey, nullptr);
        bool result = BlackBox::ValidateLicense(key);
        env->ReleaseStringUTFChars(licenseKey, key);
        return result ? JNI_TRUE : JNI_FALSE;
    }

    JNIEXPORT jboolean JNICALL Java_kentos_loader_Component_DownloadZip_isRootedDevice(JNIEnv* env, jobject thiz)
    {
        return BlackBox::IsRootedDevice() ? JNI_TRUE : JNI_FALSE;
    }

    JNIEXPORT jboolean JNICALL Java_kentos_loader_Component_DownloadZip_isEmulator(JNIEnv* env, jobject thiz)
    {
        return BlackBox::IsEmulator() ? JNI_TRUE : JNI_FALSE;
    }

    JNIEXPORT jboolean JNICALL Java_kentos_loader_Component_DownloadZip_isDebuggerAttached(JNIEnv* env, jobject thiz)
    {
        return BlackBox::IsDebuggerAttached() ? JNI_TRUE : JNI_FALSE;
    }

    JNIEXPORT jboolean JNICALL Java_kentos_loader_Component_DownloadZip_executeShellCommand(JNIEnv* env, jobject thiz, jstring command)
    {
        const char* cmd = env->GetStringUTFChars(command, nullptr);
        bool result = BlackBox::ExecuteShellCommand(cmd);
        env->ReleaseStringUTFChars(command, cmd);
        return result ? JNI_TRUE : JNI_FALSE;
    }

    JNIEXPORT jstring JNICALL Java_kentos_loader_Component_DownloadZip_executeShellCommandWithOutput(JNIEnv* env, jobject thiz, jstring command)
    {
        const char* cmd = env->GetStringUTFChars(command, nullptr);
        std::string output = BlackBox::ExecuteShellCommandWithOutput(cmd);
        env->ReleaseStringUTFChars(command, cmd);
        return env->NewStringUTF(output.c_str());
    }

    JNIEXPORT jboolean JNICALL Java_kentos_loader_Component_DownloadZip_fileExists(JNIEnv* env, jobject thiz, jstring path)
    {
        const char* p = env->GetStringUTFChars(path, nullptr);
        bool result = BlackBox::FileExists(p);
        env->ReleaseStringUTFChars(path, p);
        return result ? JNI_TRUE : JNI_FALSE;
    }

    JNIEXPORT jboolean JNICALL Java_kentos_loader_Component_DownloadZip_createDirectory(JNIEnv* env, jobject thiz, jstring path)
    {
        const char* p = env->GetStringUTFChars(path, nullptr);
        bool result = BlackBox::CreateDirectory(p);
        env->ReleaseStringUTFChars(path, p);
        return result ? JNI_TRUE : JNI_FALSE;
    }

    JNIEXPORT jboolean JNICALL Java_kentos_loader_Component_DownloadZip_deleteFile(JNIEnv* env, jobject thiz, jstring path)
    {
        const char* p = env->GetStringUTFChars(path, nullptr);
        bool result = BlackBox::DeleteFile(p);
        env->ReleaseStringUTFChars(path, p);
        return result ? JNI_TRUE : JNI_FALSE;
    }

    JNIEXPORT jboolean JNICALL Java_kentos_loader_Component_DownloadZip_copyFile(JNIEnv* env, jobject thiz, jstring src, jstring dest)
    {
        const char* s = env->GetStringUTFChars(src, nullptr);
        const char* d = env->GetStringUTFChars(dest, nullptr);
        bool result = BlackBox::CopyFile(s, d);
        env->ReleaseStringUTFChars(src, s);
        env->ReleaseStringUTFChars(dest, d);
        return result ? JNI_TRUE : JNI_FALSE;
    }

    JNIEXPORT jstring JNICALL Java_kentos_loader_Component_DownloadZip_encryptData(JNIEnv* env, jobject thiz, jstring data, jstring key)
    {
        const char* d = env->GetStringUTFChars(data, nullptr);
        const char* k = env->GetStringUTFChars(key, nullptr);
        std::string result = BlackBox::EncryptData(d, k);
        env->ReleaseStringUTFChars(data, d);
        env->ReleaseStringUTFChars(key, k);
        return env->NewStringUTF(result.c_str());
    }

    JNIEXPORT jstring JNICALL Java_kentos_loader_Component_DownloadZip_decryptData(JNIEnv* env, jobject thiz, jstring data, jstring key)
    {
        const char* d = env->GetStringUTFChars(data, nullptr);
        const char* k = env->GetStringUTFChars(key, nullptr);
        std::string result = BlackBox::DecryptData(d, k);
        env->ReleaseStringUTFChars(data, d);
        env->ReleaseStringUTFChars(key, k);
        return env->NewStringUTF(result.c_str());
    }

    JNIEXPORT jstring JNICALL Java_kentos_loader_Component_DownloadZip_generateAESKey(JNIEnv* env, jobject thiz)
    {
        std::string key = BlackBox::GenerateAESKey();
        return env->NewStringUTF(key.c_str());
    }

    JNIEXPORT jboolean JNICALL Java_kentos_loader_Component_DownloadZip_checkInternetConnection(JNIEnv* env, jobject thiz)
    {
        return BlackBox::CheckInternetConnection() ? JNI_TRUE : JNI_FALSE;
    }

    JNIEXPORT jstring JNICALL Java_kentos_loader_Component_DownloadZip_getLocalIPAddress(JNIEnv* env, jobject thiz)
    {
        std::string ip = BlackBox::GetLocalIPAddress();
        return env->NewStringUTF(ip.c_str());
    }

    JNIEXPORT void JNICALL Java_kentos_loader_Component_DownloadZip_logMessage(JNIEnv* env, jobject thiz, jstring tag, jstring message)
    {
        const char* t = env->GetStringUTFChars(tag, nullptr);
        const char* m = env->GetStringUTFChars(message, nullptr);
        BlackBox::LogMessage(t, m);
        env->ReleaseStringUTFChars(tag, t);
        env->ReleaseStringUTFChars(message, m);
    }

    JNIEXPORT void JNICALL Java_kentos_loader_Component_DownloadZip_logError(JNIEnv* env, jobject thiz, jstring tag, jstring message)
    {
        const char* t = env->GetStringUTFChars(tag, nullptr);
        const char* m = env->GetStringUTFChars(message, nullptr);
        BlackBox::LogError(t, m);
        env->ReleaseStringUTFChars(tag, t);
        env->ReleaseStringUTFChars(message, m);
    }

    JNIEXPORT void JNICALL Java_kentos_loader_Component_DownloadZip_setConfigValue(JNIEnv* env, jobject thiz, jstring key, jstring value)
    {
        const char* k = env->GetStringUTFChars(key, nullptr);
        const char* v = env->GetStringUTFChars(value, nullptr);
        BlackBox::SetConfigValue(k, v);
        env->ReleaseStringUTFChars(key, k);
        env->ReleaseStringUTFChars(value, v);
    }

    JNIEXPORT jstring JNICALL Java_kentos_loader_Component_DownloadZip_getConfigValue(JNIEnv* env, jobject thiz, jstring key, jstring defaultValue)
    {
        const char* k = env->GetStringUTFChars(key, nullptr);
        const char* def = env->GetStringUTFChars(defaultValue, nullptr);
        std::string result = BlackBox::GetConfigValue(k, def);
        env->ReleaseStringUTFChars(key, k);
        env->ReleaseStringUTFChars(defaultValue, def);
        return env->NewStringUTF(result.c_str());
    }

}

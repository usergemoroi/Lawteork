#pragma once

#include <jni.h>
#include <string>
#include <vector>
#include <memory>
#include <mutex>

// Forward declarations
extern "C" {
    struct BlackBoxContext;
    struct SecurityContext;
}

namespace BlackBox {

    // Core initialization and cleanup
    bool Initialize();
    void Shutdown();
    bool IsInitialized();

    // Security functions
    bool VerifySignature(const std::string& apkPath);
    bool CheckTampering();
    std::string GetDeviceFingerprint();
    bool ValidateLicense(const std::string& licenseKey);

    // Root detection
    bool IsRootedDevice();
    bool IsEmulator();
    bool IsDebuggerAttached();

    // Shell execution
    bool ExecuteShellCommand(const std::string& command);
    std::string ExecuteShellCommandWithOutput(const std::string& command);

    // File operations
    bool FileExists(const std::string& path);
    bool CreateDirectory(const std::string& path);
    bool DeleteFile(const std::string& path);
    bool CopyFile(const std::string& src, const std::string& dest);

    // Encryption/Decryption
    std::string EncryptData(const std::string& data, const std::string& key);
    std::string DecryptData(const std::string& data, const std::string& key);
    std::string GenerateAESKey();

    // Network utilities
    bool CheckInternetConnection();
    std::string GetLocalIPAddress();

    // Logging
    void LogMessage(const std::string& tag, const std::string& message);
    void LogError(const std::string& tag, const std::string& message);

    // Configuration
    void SetConfigValue(const std::string& key, const std::string& value);
    std::string GetConfigValue(const std::string& key, const std::string& defaultValue = "");

    // Thread safety
    void LockMutex();
    void UnlockMutex();

    // JNI interface
    JavaVM* GetJavaVM();
    void SetJavaVM(JavaVM* vm);
    JNIEnv* GetJNIEnv();

} // namespace BlackBox

// C interface for JNI
extern "C" {
    JNIEXPORT jboolean JNICALL Java_kentos_loader_Component_DownloadZip_verifySignature(JNIEnv* env, jobject thiz, jstring apkPath);
    JNIEXPORT jboolean JNICALL Java_kentos_loader_Component_DownloadZip_checkTampering(JNIEnv* env, jobject thiz);
    JNIEXPORT jstring JNICALL Java_kentos_loader_Component_DownloadZip_getDeviceFingerprint(JNIEnv* env, jobject thiz);
    JNIEXPORT jboolean JNICALL Java_kentos_loader_Component_DownloadZip_validateLicense(JNIEnv* env, jobject thiz, jstring licenseKey);
    JNIEXPORT jboolean JNICALL Java_kentos_loader_Component_DownloadZip_isRootedDevice(JNIEnv* env, jobject thiz);
    JNIEXPORT jboolean JNICALL Java_kentos_loader_Component_DownloadZip_isEmulator(JNIEnv* env, jobject thiz);
    JNIEXPORT jboolean JNICALL Java_kentos_loader_Component_DownloadZip_isDebuggerAttached(JNIEnv* env, jobject thiz);
    JNIEXPORT jboolean JNICALL Java_kentos_loader_Component_DownloadZip_executeShellCommand(JNIEnv* env, jobject thiz, jstring command);
    JNIEXPORT jstring JNICALL Java_kentos_loader_Component_DownloadZip_executeShellCommandWithOutput(JNIEnv* env, jobject thiz, jstring command);
    JNIEXPORT jboolean JNICALL Java_kentos_loader_Component_DownloadZip_fileExists(JNIEnv* env, jobject thiz, jstring path);
    JNIEXPORT jboolean JNICALL Java_kentos_loader_Component_DownloadZip_createDirectory(JNIEnv* env, jobject thiz, jstring path);
    JNIEXPORT jboolean JNICALL Java_kentos_loader_Component_DownloadZip_deleteFile(JNIEnv* env, jobject thiz, jstring path);
    JNIEXPORT jboolean JNICALL Java_kentos_loader_Component_DownloadZip_copyFile(JNIEnv* env, jobject thiz, jstring src, jstring dest);
    JNIEXPORT jstring JNICALL Java_kentos_loader_Component_DownloadZip_encryptData(JNIEnv* env, jobject thiz, jstring data, jstring key);
    JNIEXPORT jstring JNICALL Java_kentos_loader_Component_DownloadZip_decryptData(JNIEnv* env, jobject thiz, jstring data, jstring key);
    JNIEXPORT jstring JNICALL Java_kentos_loader_Component_DownloadZip_generateAESKey(JNIEnv* env, jobject thiz);
    JNIEXPORT jboolean JNICALL Java_kentos_loader_Component_DownloadZip_checkInternetConnection(JNIEnv* env, jobject thiz);
    JNIEXPORT jstring JNICALL Java_kentos_loader_Component_DownloadZip_getLocalIPAddress(JNIEnv* env, jobject thiz);
    JNIEXPORT void JNICALL Java_kentos_loader_Component_DownloadZip_logMessage(JNIEnv* env, jobject thiz, jstring tag, jstring message);
    JNIEXPORT void JNICALL Java_kentos_loader_Component_DownloadZip_logError(JNIEnv* env, jobject thiz, jstring tag, jstring message);
    JNIEXPORT void JNICALL Java_kentos_loader_Component_DownloadZip_setConfigValue(JNIEnv* env, jobject thiz, jstring key, jstring value);
    JNIEXPORT jstring JNICALL Java_kentos_loader_Component_DownloadZip_getConfigValue(JNIEnv* env, jobject thiz, jstring key, jstring defaultValue);
}

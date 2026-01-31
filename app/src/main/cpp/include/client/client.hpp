#pragma once

#include <jni.h>
#include <string>
#include <vector>
#include <memory>
#include "../blackbox/types.hpp"

// Forward declarations
extern "C" {
    struct ClientContext;
    struct ESPContext;
    struct OverlayContext;
    struct CheatContext;
}

namespace Client {

    // Core initialization and cleanup
    bool Initialize();
    void Shutdown();
    bool IsInitialized();

    // API Server functions
    std::string CheckServer();
    std::string EXP();
    std::string Pw();
    std::string URLJSON();
    std::string activity();
    std::string checkSuspiciousAppsNative();
    std::string fdjhvf();
    std::string getGrup();
    std::string getOwner();
    std::string getTelegram();
    std::string mainURL();
    std::string sockallversion();
    std::string sockindia();

    // Network operations
    bool DownloadFile(const std::string& url, const std::string& destination);
    std::string HttpGet(const std::string& url);
    std::string HttpPost(const std::string& url, const std::string& data);
    bool CheckInternetConnection();

    // ESP functionality
    bool InitializeESP();
    void ShutdownESP();
    void SetESPEnabled(bool enabled);
    bool IsESPEnabled();
    void SetESPColor(float r, float g, float b, float a);
    void GetESPColor(float& r, float& g, float& b, float& a);
    void SetESPBoxType(int type);
    int GetESPBoxType();
    void SetESPLineWidth(float width);
    float GetESPLineWidth();

    // Overlay functionality
    bool InitializeOverlay();
    void ShutdownOverlay();
    void SetOverlayVisible(bool visible);
    bool IsOverlayVisible();
    void SetOverlayPosition(float x, float y);
    void GetOverlayPosition(float& x, float& y);
    void SetOverlaySize(float width, float height);
    void GetOverlaySize(float& width, float& height);

    // Cheat functionality - Aimbot
    bool InitializeAimbot();
    void ShutdownAimbot();
    void SetAimbotEnabled(bool enabled);
    bool IsAimbotEnabled();
    void SetAimbotSensitivity(float sensitivity);
    float GetAimbotSensitivity();
    void SetAimbotSmoothness(float smoothness);
    float GetAimbotSmoothness();
    void SetAimbotFOV(float fov);
    float GetAimbotFOV();
    void SetAimbotBone(int bone);
    int GetAimbotBone();

    // Cheat functionality - Bullet
    bool InitializeBullet();
    void ShutdownBullet();
    void SetBulletEnabled(bool enabled);
    bool IsBulletEnabled();
    void SetBulletSpeed(float speed);
    float GetBulletSpeed();
    void SetBulletDamage(float damage);
    float GetBulletDamage();
    void SetBulletNoRecoil(bool enabled);
    bool IsBulletNoRecoilEnabled();

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

} // namespace Client

// C interface for JNI - ApiServer
extern "C" {
    JNIEXPORT jstring JNICALL Java_kentos_loader_server_ApiServer_CheckServer(JNIEnv* env, jclass clazz);
    JNIEXPORT jstring JNICALL Java_kentos_loader_server_ApiServer_EXP(JNIEnv* env, jclass clazz);
    JNIEXPORT jstring JNICALL Java_kentos_loader_server_ApiServer_Pw(JNIEnv* env, jclass clazz);
    JNIEXPORT jstring JNICALL Java_kentos_loader_server_ApiServer_URLJSON(JNIEnv* env, jclass clazz);
    JNIEXPORT jstring JNICALL Java_kentos_loader_server_ApiServer_activity(JNIEnv* env, jclass clazz);
    JNIEXPORT jstring JNICALL Java_kentos_loader_server_ApiServer_checkSuspiciousAppsNative(JNIEnv* env, jclass clazz);
    JNIEXPORT jstring JNICALL Java_kentos_loader_server_ApiServer_fdjhvf(JNIEnv* env, jclass clazz);
    JNIEXPORT jstring JNICALL Java_kentos_loader_server_ApiServer_getGrup(JNIEnv* env, jclass clazz);
    JNIEXPORT jstring JNICALL Java_kentos_loader_server_ApiServer_getOwner(JNIEnv* env, jclass clazz);
    JNIEXPORT jstring JNICALL Java_kentos_loader_server_ApiServer_getTelegram(JNIEnv* env, jclass clazz);
    JNIEXPORT jstring JNICALL Java_kentos_loader_server_ApiServer_mainURL(JNIEnv* env, jclass clazz);
    JNIEXPORT jstring JNICALL Java_kentos_loader_server_ApiServer_sockallversion(JNIEnv* env, jclass clazz);
    JNIEXPORT jstring JNICALL Java_kentos_loader_server_ApiServer_sockindia(JNIEnv* env, jclass clazz);
}

// C interface for JNI - Floating services
extern "C" {
    JNIEXPORT void JNICALL Java_kentos_loader_floating_ToggleAim_ToggleAim(JNIEnv* env, jobject thiz, jboolean enabled);
    JNIEXPORT void JNICALL Java_kentos_loader_floating_ToggleBullet_ToggleBullet(JNIEnv* env, jobject thiz, jboolean enabled);
}

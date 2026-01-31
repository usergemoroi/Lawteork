#include "cheat.hpp"
#include "../../include/blackbox/types.hpp"
#include <jni.h>
#include <android/log.h>
#include <mutex>

#define LOG_TAG "Cheat"
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)

namespace Cheat {

    // Global cheat state
    AimbotConfig g_aimbotConfig;
    BulletConfig g_bulletConfig;
    std::mutex g_mutex;

    bool Initialize() {
        std::lock_guard<std::mutex> lock(g_mutex);
        
        LOGD("Initializing cheat system");
        
        // Default aimbot configuration
        g_aimbotConfig.enabled = false;
        g_aimbotConfig.sensitivity = 0.5f;
        g_aimbotConfig.smoothness = 0.5f;
        g_aimbotConfig.fov = 90.0f;
        g_aimbotConfig.bone = 0; // Head
        g_aimbotConfig.autoShoot = false;
        g_aimbotConfig.visibleOnly = true;
        g_aimbotConfig.teamCheck = true;
        
        // Default bullet configuration
        g_bulletConfig.enabled = false;
        g_bulletConfig.speed = 1.0f;
        g_bulletConfig.damage = 1.0f;
        g_bulletConfig.noRecoil = false;
        g_bulletConfig.noSpread = false;
        g_bulletConfig.infiniteAmmo = false;
        
        LOGD("Cheat system initialized");
        return true;
    }

    void Shutdown() {
        std::lock_guard<std::mutex> lock(g_mutex);
        
        LOGD("Shutting down cheat system");
        g_aimbotConfig.enabled = false;
        g_bulletConfig.enabled = false;
    }

    // Aimbot functions
    void UpdateAimbotConfig(const AimbotConfig& config) {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_aimbotConfig = config;
    }

    AimbotConfig GetAimbotConfig() {
        std::lock_guard<std::mutex> lock(g_mutex);
        return g_aimbotConfig;
    }

    void SetAimbotEnabled(bool enabled) {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_aimbotConfig.enabled = enabled;
        LOGD("Aimbot enabled: %s", enabled ? "true" : "false");
    }

    bool IsAimbotEnabled() {
        std::lock_guard<std::mutex> lock(g_mutex);
        return g_aimbotConfig.enabled;
    }

    void SetAimbotSensitivity(float sensitivity) {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_aimbotConfig.sensitivity = sensitivity;
        LOGD("Aimbot sensitivity: %.2f", sensitivity);
    }

    float GetAimbotSensitivity() {
        std::lock_guard<std::mutex> lock(g_mutex);
        return g_aimbotConfig.sensitivity;
    }

    void SetAimbotSmoothness(float smoothness) {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_aimbotConfig.smoothness = smoothness;
        LOGD("Aimbot smoothness: %.2f", smoothness);
    }

    float GetAimbotSmoothness() {
        std::lock_guard<std::mutex> lock(g_mutex);
        return g_aimbotConfig.smoothness;
    }

    void SetAimbotFOV(float fov) {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_aimbotConfig.fov = fov;
        LOGD("Aimbot FOV: %.2f", fov);
    }

    float GetAimbotFOV() {
        std::lock_guard<std::mutex> lock(g_mutex);
        return g_aimbotConfig.fov;
    }

    void SetAimbotBone(int bone) {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_aimbotConfig.bone = bone;
        LOGD("Aimbot bone: %d", bone);
    }

    int GetAimbotBone() {
        std::lock_guard<std::mutex> lock(g_mutex);
        return g_aimbotConfig.bone;
    }

    void ToggleAim(bool enabled) {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_aimbotConfig.enabled = enabled;
        LOGD("Aimbot toggled: %s", enabled ? "ON" : "OFF");
    }

    // Bullet functions
    void UpdateBulletConfig(const BulletConfig& config) {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_bulletConfig = config;
    }

    BulletConfig GetBulletConfig() {
        std::lock_guard<std::mutex> lock(g_mutex);
        return g_bulletConfig;
    }

    void SetBulletEnabled(bool enabled) {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_bulletConfig.enabled = enabled;
        LOGD("Bullet enabled: %s", enabled ? "true" : "false");
    }

    bool IsBulletEnabled() {
        std::lock_guard<std::mutex> lock(g_mutex);
        return g_bulletConfig.enabled;
    }

    void SetBulletSpeed(float speed) {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_bulletConfig.speed = speed;
        LOGD("Bullet speed: %.2f", speed);
    }

    float GetBulletSpeed() {
        std::lock_guard<std::mutex> lock(g_mutex);
        return g_bulletConfig.speed;
    }

    void SetBulletDamage(float damage) {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_bulletConfig.damage = damage;
        LOGD("Bullet damage: %.2f", damage);
    }

    float GetBulletDamage() {
        std::lock_guard<std::mutex> lock(g_mutex);
        return g_bulletConfig.damage;
    }

    void SetBulletNoRecoil(bool enabled) {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_bulletConfig.noRecoil = enabled;
        LOGD("Bullet no recoil: %s", enabled ? "true" : "false");
    }

    bool IsBulletNoRecoilEnabled() {
        std::lock_guard<std::mutex> lock(g_mutex);
        return g_bulletConfig.noRecoil;
    }

    void ToggleBullet(bool enabled) {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_bulletConfig.enabled = enabled;
        LOGD("Bullet toggled: %s", enabled ? "ON" : "OFF");
    }

} // namespace Cheat

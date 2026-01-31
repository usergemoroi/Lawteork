#pragma once

#include <jni.h>
#include <string>
#include <vector>
#include <memory>

namespace Cheat {

    // Aimbot configuration structure
    struct AimbotConfig {
        bool enabled;
        float sensitivity;
        float smoothness;
        float fov;
        int bone;
        bool autoShoot;
        bool visibleOnly;
        bool teamCheck;
    };

    // Bullet configuration structure
    struct BulletConfig {
        bool enabled;
        float speed;
        float damage;
        bool noRecoil;
        bool noSpread;
        bool infiniteAmmo;
    };

    // Initialize cheat system
    bool Initialize();
    
    // Shutdown cheat system
    void Shutdown();
    
    // Aimbot functions
    void UpdateAimbotConfig(const AimbotConfig& config);
    AimbotConfig GetAimbotConfig();
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
    void ToggleAim(bool enabled);

    // Bullet functions
    void UpdateBulletConfig(const BulletConfig& config);
    BulletConfig GetBulletConfig();
    void SetBulletEnabled(bool enabled);
    bool IsBulletEnabled();
    void SetBulletSpeed(float speed);
    float GetBulletSpeed();
    void SetBulletDamage(float damage);
    float GetBulletDamage();
    void SetBulletNoRecoil(bool enabled);
    bool IsBulletNoRecoilEnabled();
    void ToggleBullet(bool enabled);

} // namespace Cheat

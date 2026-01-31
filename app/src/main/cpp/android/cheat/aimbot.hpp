#pragma once

#include <jni.h>
#include <string>
#include <vector>
#include <memory>

namespace Aimbot {

    // Bone IDs for targeting
    enum class TargetBone {
        HEAD = 0,
        NECK = 1,
        CHEST = 2,
        SPINE = 3,
        PELVIS = 4
    };

    // Aimbot mode
    enum class AimbotMode {
        DISABLED = 0,
        HOLD = 1,
        TOGGLE = 2,
        ALWAYS = 3
    };

    // Target information
    struct Target {
        int id;
        float x;
        float y;
        float z;
        float distance;
        float angle;
        bool visible;
        bool enemy;
        int health;
    };

    // Aimbot configuration
    struct Config {
        bool enabled;
        AimbotMode mode;
        TargetBone bone;
        float sensitivity;
        float smoothness;
        float fov;
        float maxDistance;
        bool autoShoot;
        bool visibleOnly;
        bool teamCheck;
        bool predictMovement;
        float predictionTime;
    };

    // Initialize aimbot
    bool Initialize();
    
    // Shutdown aimbot
    void Shutdown();
    
    // Update configuration
    void UpdateConfig(const Config& config);
    
    // Get current configuration
    Config GetConfig();
    
    // Enable/disable aimbot
    void SetEnabled(bool enabled);
    bool IsEnabled();
    
    // Set aimbot mode
    void SetMode(AimbotMode mode);
    AimbotMode GetMode();
    
    // Set target bone
    void SetTargetBone(TargetBone bone);
    TargetBone GetTargetBone();
    
    // Set sensitivity (0.0 - 10.0)
    void SetSensitivity(float sensitivity);
    float GetSensitivity();
    
    // Set smoothness (0.0 - 10.0)
    void SetSmoothness(float smoothness);
    float GetSmoothness();
    
    // Set FOV (0.0 - 360.0)
    void SetFOV(float fov);
    float GetFOV();
    
    // Set max distance
    void SetMaxDistance(float distance);
    float GetMaxDistance();
    
    // Find and aim at target
    bool FindTarget(Target& target);
    void AimAtTarget(const Target& target);
    
    // Update aimbot (call this every frame)
    void Update();
    
    // JNI toggle function
    void Toggle(bool enabled);

} // namespace Aimbot

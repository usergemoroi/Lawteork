#include "cheat.hpp"
#include "../../include/blackbox/types.hpp"
#include <jni.h>
#include <android/log.h>
#include <mutex>
#include <cmath>

#define LOG_TAG "Aimbot"
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)

namespace Cheat {

    // External references to global config
    extern AimbotConfig g_aimbotConfig;
    extern BulletConfig g_bulletConfig;
    extern std::mutex g_mutex;

    // Aimbot target structure
    struct AimbotTarget {
        int entityId;
        float x, y, z;
        float distance;
        float angle;
        bool visible;
        bool isEnemy;
    };

    // Global aimbot state
    static std::vector<AimbotTarget> g_targets;
    static std::mutex g_aimbotMutex;

    // Calculate distance between two points
    float CalculateDistance(float x1, float y1, float z1, float x2, float y2, float z2) {
        float dx = x2 - x1;
        float dy = y2 - y1;
        float dz = z2 - z1;
        return std::sqrt(dx * dx + dy * dy + dz * dz);
    }

    // Calculate angle between two points
    float CalculateAngle(float x1, float y1, float x2, float y2) {
        float dx = x2 - x1;
        float dy = y2 - y1;
        return std::atan2(dy, dx) * 180.0f / M_PI;
    }

    // Find best target for aimbot
    AimbotTarget FindBestTarget(float playerX, float playerY, float playerZ, float playerAngle) {
        AimbotTarget bestTarget;
        bestTarget.entityId = -1;
        bestTarget.distance = 99999.0f;
        
        for (const auto& target : g_targets) {
            // Check if target is valid
            if (!target.visible && g_aimbotConfig.visibleOnly) {
                continue;
            }
            
            if (!target.isEnemy && g_aimbotConfig.teamCheck) {
                continue;
            }
            
            // Calculate distance
            float distance = CalculateDistance(playerX, playerY, playerZ, target.x, target.y, target.z);
            
            // Check if within FOV
            float angleDiff = std::abs(target.angle - playerAngle);
            if (angleDiff > g_aimbotConfig.fov / 2.0f) {
                continue;
            }
            
            // Find closest target
            if (distance < bestTarget.distance) {
                bestTarget = target;
                bestTarget.distance = distance;
            }
        }
        
        return bestTarget;
    }

    // Calculate aimbot correction
    void CalculateAimbotCorrection(float playerX, float playerY, float playerZ, float playerAngle, 
                                   float& outX, float& outY, float& outSmoothness) {
        AimbotTarget target = FindBestTarget(playerX, playerY, playerZ, playerAngle);
        
        if (target.entityId == -1) {
            outX = 0.0f;
            outY = 0.0f;
            outSmoothness = 0.0f;
            return;
        }
        
        // Calculate direction to target
        float angleToTarget = CalculateAngle(playerX, playerY, target.x, target.y);
        float angleDiff = angleToTarget - playerAngle;
        
        // Apply sensitivity and smoothness
        float correctionX = angleDiff * g_aimbotConfig.sensitivity;
        float correctionY = 0.0f; // Would be calculated based on vertical angle
        
        // Apply smoothness
        outSmoothness = g_aimbotConfig.smoothness;
        
        outX = correctionX;
        outY = correctionY;
    }

    // Update aimbot with new targets
    void UpdateAimbotTargets(const std::vector<AimbotTarget>& targets) {
        std::lock_guard<std::mutex> lock(g_aimbotMutex);
        g_targets = targets;
    }

    // Get current aimbot targets
    std::vector<AimbotTarget> GetAimbotTargets() {
        std::lock_guard<std::mutex> lock(g_aimbotMutex);
        return g_targets;
    }

    // Clear aimbot targets
    void ClearAimbotTargets() {
        std::lock_guard<std::mutex> lock(g_aimbotMutex);
        g_targets.clear();
    }

} // namespace Cheat

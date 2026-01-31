#include "esp.hpp"
#include "../../include/blackbox/types.hpp"
#include <jni.h>
#include <android/log.h>
#include <mutex>

#define LOG_TAG "ESP"
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)

namespace ESP {

    // Global ESP state
    static ESPConfig g_config;
    static std::mutex g_mutex;

    bool Initialize() {
        std::lock_guard<std::mutex> lock(g_mutex);
        
        LOGD("Initializing ESP system");
        
        // Default configuration
        g_config.enabled = true;
        g_config.colorR = 1.0f;
        g_config.colorG = 0.0f;
        g_config.colorB = 0.0f;
        g_config.colorA = 1.0f;
        g_config.boxType = 0;
        g_config.lineWidth = 1.0f;
        g_config.showNames = true;
        g_config.showHealth = true;
        g_config.showDistance = true;
        g_config.maxDistance = 100.0f;
        
        LOGD("ESP system initialized");
        return true;
    }

    void Shutdown() {
        std::lock_guard<std::mutex> lock(g_mutex);
        
        LOGD("Shutting down ESP system");
        g_config.enabled = false;
    }

    void UpdateConfig(const ESPConfig& config) {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_config = config;
    }

    ESPConfig GetConfig() {
        std::lock_guard<std::mutex> lock(g_mutex);
        return g_config;
    }

    void RenderEntity(int entityId, float x, float y, float z, const std::string& name, float health) {
        if (!g_config.enabled) return;
        
        LOGD("Rendering entity %d at (%.2f, %.2f, %.2f) - %s, Health: %.2f", 
             entityId, x, y, z, name.c_str(), health);
        
        // In a real implementation, this would render the ESP overlay
        // For now, just log the information
    }

    void RenderAllEntities() {
        if (!g_config.enabled) return;
        
        LOGD("Rendering all entities");
        
        // In a real implementation, this would iterate through all entities
        // and render their ESP overlays
    }

    void SetVisible(bool visible) {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_config.enabled = visible;
        LOGD("ESP visibility set to: %s", visible ? "true" : "false");
    }

    bool IsVisible() {
        std::lock_guard<std::mutex> lock(g_mutex);
        return g_config.enabled;
    }

    void SetColor(float r, float g, float b, float a) {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_config.colorR = r;
        g_config.colorG = g;
        g_config.colorB = b;
        g_config.colorA = a;
        LOGD("ESP color set to: (%.2f, %.2f, %.2f, %.2f)", r, g, b, a);
    }

    void GetColor(float& r, float& g, float& b, float& a) {
        std::lock_guard<std::mutex> lock(g_mutex);
        r = g_config.colorR;
        g = g_config.colorG;
        b = g_config.colorB;
        a = g_config.colorA;
    }

    void SetBoxType(int type) {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_config.boxType = type;
        LOGD("ESP box type set to: %d", type);
    }

    int GetBoxType() {
        std::lock_guard<std::mutex> lock(g_mutex);
        return g_config.boxType;
    }

    void SetLineWidth(float width) {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_config.lineWidth = width;
        LOGD("ESP line width set to: %.2f", width);
    }

    float GetLineWidth() {
        std::lock_guard<std::mutex> lock(g_mutex);
        return g_config.lineWidth;
    }

    void SetMaxDistance(float distance) {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_config.maxDistance = distance;
        LOGD("ESP max distance set to: %.2f", distance);
    }

    float GetMaxDistance() {
        std::lock_guard<std::mutex> lock(g_mutex);
        return g_config.maxDistance;
    }

} // namespace ESP

#include "overlay.hpp"
#include "../../include/blackbox/types.hpp"
#include <jni.h>
#include <android/log.h>
#include <mutex>

#define LOG_TAG "Overlay"
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)

namespace Overlay {

    // Global overlay state
    static OverlayConfig g_config;
    static std::mutex g_mutex;

    bool Initialize() {
        std::lock_guard<std::mutex> lock(g_mutex);
        
        LOGD("Initializing overlay system");
        
        // Default configuration
        g_config.visible = true;
        g_config.x = 100.0f;
        g_config.y = 100.0f;
        g_config.width = 300.0f;
        g_config.height = 200.0f;
        g_config.clickThrough = true;
        g_config.draggable = true;
        g_config.opacity = 1.0f;
        
        LOGD("Overlay system initialized");
        return true;
    }

    void Shutdown() {
        std::lock_guard<std::mutex> lock(g_mutex);
        
        LOGD("Shutting down overlay system");
        g_config.visible = false;
    }

    void UpdateConfig(const OverlayConfig& config) {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_config = config;
    }

    OverlayConfig GetConfig() {
        std::lock_guard<std::mutex> lock(g_mutex);
        return g_config;
    }

    void Show() {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_config.visible = true;
        LOGD("Overlay shown");
    }

    void Hide() {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_config.visible = false;
        LOGD("Overlay hidden");
    }

    void Toggle() {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_config.visible = !g_config.visible;
        LOGD("Overlay toggled: %s", g_config.visible ? "shown" : "hidden");
    }

    void SetPosition(float x, float y) {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_config.x = x;
        g_config.y = y;
        LOGD("Overlay position set to: (%.2f, %.2f)", x, y);
    }

    void GetPosition(float& x, float& y) {
        std::lock_guard<std::mutex> lock(g_mutex);
        x = g_config.x;
        y = g_config.y;
    }

    void SetSize(float width, float height) {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_config.width = width;
        g_config.height = height;
        LOGD("Overlay size set to: (%.2f, %.2f)", width, height);
    }

    void GetSize(float& width, float& height) {
        std::lock_guard<std::mutex> lock(g_mutex);
        width = g_config.width;
        height = g_config.height;
    }

    void SetOpacity(float opacity) {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_config.opacity = opacity;
        LOGD("Overlay opacity set to: %.2f", opacity);
    }

    float GetOpacity() {
        std::lock_guard<std::mutex> lock(g_mutex);
        return g_config.opacity;
    }

    void SetClickThrough(bool enabled) {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_config.clickThrough = enabled;
        LOGD("Overlay click-through set to: %s", enabled ? "true" : "false");
    }

    bool IsClickThrough() {
        std::lock_guard<std::mutex> lock(g_mutex);
        return g_config.clickThrough;
    }

    void SetDraggable(bool enabled) {
        std::lock_guard<std::mutex> lock(g_mutex);
        g_config.draggable = enabled;
        LOGD("Overlay draggable set to: %s", enabled ? "true" : "false");
    }

    bool IsDraggable() {
        std::lock_guard<std::mutex> lock(g_mutex);
        return g_config.draggable;
    }

    void DrawText(const std::string& text, float x, float y, float size, float r, float g, float b, float a) {
        if (!g_config.visible) return;
        
        LOGD("Drawing text: %s at (%.2f, %.2f) size %.2f", text.c_str(), x, y, size);
        
        // In a real implementation, this would draw text on the overlay
        // For now, just log the information
    }

    void DrawRect(float x, float y, float width, float height, float r, float g, float b, float a) {
        if (!g_config.visible) return;
        
        LOGD("Drawing rect: (%.2f, %.2f, %.2f, %.2f)", x, y, width, height);
        
        // In a real implementation, this would draw a rectangle on the overlay
        // For now, just log the information
    }

    void DrawLine(float x1, float y1, float x2, float y2, float width, float r, float g, float b, float a) {
        if (!g_config.visible) return;
        
        LOGD("Drawing line: (%.2f, %.2f) to (%.2f, %.2f)", x1, y1, x2, y2);
        
        // In a real implementation, this would draw a line on the overlay
        // For now, just log the information
    }

    void Clear() {
        if (!g_config.visible) return;
        
        LOGD("Clearing overlay");
        
        // In a real implementation, this would clear the overlay
        // For now, just log the information
    }

    void Update() {
        if (!g_config.visible) return;
        
        // In a real implementation, this would update the overlay
        // For now, just log the information
        LOGD("Updating overlay");
    }

} // namespace Overlay

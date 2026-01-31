#pragma once

#include <jni.h>
#include <string>
#include <vector>
#include <memory>

namespace Overlay {

    // Overlay configuration structure
    struct OverlayConfig {
        bool visible;
        float x;
        float y;
        float width;
        float height;
        bool clickThrough;
        bool draggable;
        float opacity;
    };

    // Initialize overlay system
    bool Initialize();
    
    // Shutdown overlay system
    void Shutdown();
    
    // Update overlay configuration
    void UpdateConfig(const OverlayConfig& config);
    
    // Get current overlay configuration
    OverlayConfig GetConfig();
    
    // Show overlay
    void Show();
    
    // Hide overlay
    void Hide();
    
    // Toggle overlay visibility
    void Toggle();
    
    // Set overlay position
    void SetPosition(float x, float y);
    
    // Get overlay position
    void GetPosition(float& x, float& y);
    
    // Set overlay size
    void SetSize(float width, float height);
    
    // Get overlay size
    void GetSize(float& width, float& height);
    
    // Set overlay opacity
    void SetOpacity(float opacity);
    
    // Get overlay opacity
    float GetOpacity();
    
    // Set click-through mode
    void SetClickThrough(bool enabled);
    
    // Is click-through enabled
    bool IsClickThrough();
    
    // Set draggable mode
    void SetDraggable(bool enabled);
    
    // Is draggable enabled
    bool IsDraggable();
    
    // Draw text on overlay
    void DrawText(const std::string& text, float x, float y, float size, float r, float g, float b, float a);
    
    // Draw rectangle on overlay
    void DrawRect(float x, float y, float width, float height, float r, float g, float b, float a);
    
    // Draw line on overlay
    void DrawLine(float x1, float y1, float x2, float y2, float width, float r, float g, float b, float a);
    
    // Clear overlay
    void Clear();
    
    // Update overlay (call this every frame)
    void Update();

} // namespace Overlay

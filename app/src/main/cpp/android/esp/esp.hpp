#pragma once

#include <jni.h>
#include <string>
#include <vector>
#include <memory>

namespace ESP {

    // ESP configuration structure
    struct ESPConfig {
        bool enabled;
        float colorR;
        float colorG;
        float colorB;
        float colorA;
        int boxType;
        float lineWidth;
        bool showNames;
        bool showHealth;
        bool showDistance;
        float maxDistance;
    };

    // Initialize ESP system
    bool Initialize();
    
    // Shutdown ESP system
    void Shutdown();
    
    // Update ESP configuration
    void UpdateConfig(const ESPConfig& config);
    
    // Get current ESP configuration
    ESPConfig GetConfig();
    
    // Render ESP for a single entity
    void RenderEntity(int entityId, float x, float y, float z, const std::string& name, float health);
    
    // Render all entities
    void RenderAllEntities();
    
    // Set ESP visibility
    void SetVisible(bool visible);
    
    // Is ESP visible
    bool IsVisible();
    
    // Set ESP color
    void SetColor(float r, float g, float b, float a);
    
    // Get ESP color
    void GetColor(float& r, float& g, float& b, float& a);
    
    // Set box type (0 = 2D, 1 = 3D, 2 = Corner)
    void SetBoxType(int type);
    
    // Get box type
    int GetBoxType();
    
    // Set line width
    void SetLineWidth(float width);
    
    // Get line width
    float GetLineWidth();
    
    // Set maximum distance
    void SetMaxDistance(float distance);
    
    // Get maximum distance
    float GetMaxDistance();

} // namespace ESP

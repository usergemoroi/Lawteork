#pragma once

#include <cstdint>
#include <string>
#include <vector>

namespace Client {

    // Basic types
    using byte_t = uint8_t;
    using u8 = uint8_t;
    using u16 = uint16_t;
    using u32 = uint32_t;
    using u64 = uint64_t;
    using i8 = int8_t;
    using i16 = int16_t;
    using i32 = int32_t;
    using i64 = int64_t;
    using f32 = float;
    using f64 = double;

    // Vector types for 3D operations
    struct Vector2 {
        f32 x, y;
        Vector2() : x(0), y(0) {}
        Vector2(f32 x, f32 y) : x(x), y(y) {}
    };

    struct Vector3 {
        f32 x, y, z;
        Vector3() : x(0), y(0), z(0) {}
        Vector3(f32 x, f32 y, f32 z) : x(x), y(y), z(z) {}
    };

    struct Vector4 {
        f32 x, y, z, w;
        Vector4() : x(0), y(0), z(0), w(0) {}
        Vector4(f32 x, f32 y, f32 z, f32 w) : x(x), y(y), z(z), w(w) {}
    };

    // Color type
    struct Color {
        f32 r, g, b, a;
        Color() : r(1.0f), g(1.0f), b(1.0f), a(1.0f) {}
        Color(f32 r, f32 g, f32 b, f32 a = 1.0f) : r(r), g(g), b(b), a(a) {}
    };

    // Matrix type for transformations
    struct Matrix4x4 {
        f32 m[4][4];
        Matrix4x4();
        static Matrix4x4 Identity();
    };

    // ESP types
    enum class ESPBoxType {
        BOX_2D = 0,
        BOX_3D = 1,
        CORNERS = 2,
        FILLED = 3
    };

    enum class ESPBoneType {
        NONE = 0,
        SKELETON = 1,
        LINES = 2
    };

    struct ESPSettings {
        bool enabled;
        Color boxColor;
        Color lineColor;
        Color skeletonColor;
        Color nameColor;
        ESPBoxType boxType;
        ESPBoneType boneType;
        f32 lineWidth;
        f32 distance;
        bool showName;
        bool showHealth;
        bool showDistance;
        bool showWeapon;
    };

    // Aimbot types
    enum class AimbotBone {
        HEAD = 0,
        NECK = 1,
        CHEST = 2,
        PELVIS = 3
    };

    enum class AimbotMode {
        DISABLED = 0,
        HOLD = 1,
        TOGGLE = 2,
        ALWAYS = 3
    };

    struct AimbotSettings {
        bool enabled;
        AimbotMode mode;
        AimbotBone targetBone;
        f32 sensitivity;
        f32 smoothness;
        f32 fov;
        f32 maxDistance;
        bool ignoreTeam;
        bool visibleOnly;
        bool predictMovement;
    };

    // Bullet types
    struct BulletSettings {
        bool enabled;
        f32 speed;
        f32 damage;
        f32 range;
        bool noRecoil;
        bool noSpread;
        bool instantHit;
        bool penetration;
    };

    // Player data structure
    struct PlayerData {
        u64 address;
        Vector3 position;
        Vector3 headPosition;
        Vector3 rotation;
        f32 health;
        f32 maxHealth;
        i32 team;
        bool isAlive;
        bool isVisible;
        f32 distance;
        std::string name;
        std::string weapon;
    };

    // Overlay types
    enum class OverlayType {
        MENU = 0,
        HUD = 1,
        ESP = 2,
        CROSSHAIR = 3
    };

    struct OverlaySettings {
        bool visible;
        Vector2 position;
        Vector2 size;
        f32 opacity;
        OverlayType type;
    };

    // Game context
    struct GameContext {
        u64 moduleBase;
        u64 moduleSize;
        u64 playerBase;
        u64 entityListBase;
        i32 entityCount;
        Vector3 cameraPosition;
        Vector3 cameraRotation;
        Matrix4x4 viewMatrix;
        f32 fov;
        i32 screenWidth;
        i32 screenHeight;
    };

    // Configuration
    struct ClientConfig {
        ESPSettings esp;
        AimbotSettings aimbot;
        BulletSettings bullet;
        OverlaySettings overlay;
        bool antiAFK;
        bool speedHack;
        f32 speedMultiplier;
        bool unlimitedAmmo;
        bool rapidFire;
    };

} // namespace Client

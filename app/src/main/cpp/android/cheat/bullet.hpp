#pragma once

#include <jni.h>
#include <string>
#include <vector>
#include <memory>

namespace Bullet {

    // Bullet type
    enum class BulletType {
        NORMAL = 0,
        TRACER = 1,
        EXPLOSIVE = 2,
        PENETRATING = 3
    };

    // Weapon type
    enum class WeaponType {
        UNKNOWN = 0,
        PISTOL = 1,
        RIFLE = 2,
        SNIPER = 3,
        SHOTGUN = 4,
        SMG = 5,
        LMG = 6
    };

    // Bullet configuration
    struct Config {
        bool enabled;
        BulletType type;
        float speed;
        float damage;
        float range;
        bool noRecoil;
        bool noSpread;
        bool instantHit;
        bool penetration;
        bool instantKill;
        bool infiniteAmmo;
        bool rapidFire;
        float fireRate;
    };

    // Weapon configuration
    struct WeaponConfig {
        WeaponType type;
        std::string name;
        int ammo;
        int maxAmmo;
        float damage;
        float fireRate;
        float recoil;
        float spread;
    };

    // Initialize bullet system
    bool Initialize();
    
    // Shutdown bullet system
    void Shutdown();
    
    // Update configuration
    void UpdateConfig(const Config& config);
    
    // Get current configuration
    Config GetConfig();
    
    // Enable/disable bullet modifications
    void SetEnabled(bool enabled);
    bool IsEnabled();
    
    // Set bullet type
    void SetBulletType(BulletType type);
    BulletType GetBulletType();
    
    // Set bullet speed
    void SetSpeed(float speed);
    float GetSpeed();
    
    // Set bullet damage
    void SetDamage(float damage);
    float GetDamage();
    
    // Set bullet range
    void SetRange(float range);
    float GetRange();
    
    // No recoil
    void SetNoRecoil(bool enabled);
    bool IsNoRecoilEnabled();
    
    // No spread
    void SetNoSpread(bool enabled);
    bool IsNoSpreadEnabled();
    
    // Instant hit
    void SetInstantHit(bool enabled);
    bool IsInstantHitEnabled();
    
    // Penetration
    void SetPenetration(bool enabled);
    bool IsPenetrationEnabled();
    
    // Instant kill
    void SetInstantKill(bool enabled);
    bool IsInstantKillEnabled();
    
    // Infinite ammo
    void SetInfiniteAmmo(bool enabled);
    bool IsInfiniteAmmoEnabled();
    
    // Rapid fire
    void SetRapidFire(bool enabled);
    bool IsRapidFireEnabled();
    
    // Set fire rate
    void SetFireRate(float rate);
    float GetFireRate();
    
    // Weapon functions
    WeaponConfig GetCurrentWeapon();
    void SetWeaponAmmo(int ammo);
    int GetWeaponAmmo();
    
    // Update bullet system (call this every frame)
    void Update();
    
    // JNI toggle function
    void Toggle(bool enabled);

} // namespace Bullet

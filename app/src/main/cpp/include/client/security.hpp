#pragma once

#include <string>
#include <vector>
#include <cstdint>

namespace Client {

    // Security module for GameBlaster Pro
    namespace Security {

        // Signature verification
        bool VerifyAppSignature();
        bool CheckPackageIntegrity();
        std::string GetAppSignatureHash();

        // Anti-tamper
        bool CheckModification();
        bool IsRunningOnRootedDevice();
        bool IsXposedDetected();
        bool IsFridaDetected();
        bool IsDebuggerAttached();

        // Device fingerprinting
        std::string GetDeviceId();
        std::string GetHardwareId();
        std::string GetUniqueDeviceIdentifier();
        std::string GetDeviceFingerprint();

        // Obfuscation
        std::string ObfuscateString(const std::string& input);
        std::string DeobfuscateString(const std::string& input);
        std::vector<uint8_t> EncryptData(const std::vector<uint8_t>& data, const std::string& key);
        std::vector<uint8_t> DecryptData(const std::vector<uint8_t>& data, const std::string& key);

        // Cryptography
        std::string MD5Hash(const std::string& input);
        std::string SHA1Hash(const std::string& input);
        std::string SHA256Hash(const std::string& input);
        std::string HMACSHA256(const std::string& data, const std::string& key);

        // Memory protection
        bool ProtectMemoryRegion(void* address, size_t size);
        bool UnprotectMemoryRegion(void* address, size_t size);
        void SecureZeroMemory(void* ptr, size_t size);

        // Anti-debugging
        bool EnableAntiDebug();
        void DisableAntiDebug();
        bool IsAntiDebugEnabled();

        // Process hiding
        bool HideProcess();
        bool UnhideProcess();
        bool IsProcessHidden();

        // Environment checks
        bool IsEmulator();
        bool IsVirtualEnvironment();
        bool IsSafeEnvironment();
        std::vector<std::string> GetSuspiciousApps();

        // Certificate pinning
        bool ValidateCertificate(const std::string& host, const std::string& certificate);
        bool AddPinnedCertificate(const std::string& host, const std::string& certificate);

        // Initialization
        bool Initialize();
        void Shutdown();
        bool IsInitialized();

    } // namespace Security

} // namespace Client

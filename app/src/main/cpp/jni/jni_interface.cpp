#include "jni_interface.hpp"
#include "../include/blackbox/blackbox.hpp"
#include "../include/client/client.hpp"
#include "../android/esp/esp.hpp"
#include "../android/overlay/overlay.hpp"
#include "../android/cheat/cheat.hpp"
#include <jni.h>
#include <android/log.h>
#include <mutex>

#define LOG_TAG "JNIInterface"
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)

// Global JNI references
JavaVM* g_JavaVM = nullptr;
static std::mutex g_jniMutex;

namespace JNI {

    // Initialize JNI interface
    bool Initialize(JavaVM* vm) {
        std::lock_guard<std::mutex> lock(g_jniMutex);
        
        if (g_JavaVM) {
            LOGE("JNI interface already initialized");
            return false;
        }
        
        LOGD("Initializing JNI interface");
        g_JavaVM = vm;
        
        // Initialize native modules
        BlackBox::Initialize();
        Client::Initialize();
        ESP::Initialize();
        Overlay::Initialize();
        Cheat::Initialize();
        
        LOGD("JNI interface initialized");
        return true;
    }
    
    // Shutdown JNI interface
    void Shutdown() {
        std::lock_guard<std::mutex> lock(g_jniMutex);
        
        LOGD("Shutting down JNI interface");
        
        // Shutdown native modules
        Cheat::Shutdown();
        Overlay::Shutdown();
        ESP::Shutdown();
        Client::Shutdown();
        BlackBox::Shutdown();
        
        g_JavaVM = nullptr;
        LOGD("JNI interface shut down");
    }
    
    // Get JNI environment
    JNIEnv* GetEnv() {
        JNIEnv* env = nullptr;
        if (g_JavaVM) {
            g_JavaVM->GetEnv((void**)&env, JNI_VERSION_1_6);
        }
        return env;
    }
    
    // Helper functions
    jclass FindClass(JNIEnv* env, const char* className) {
        jclass clazz = env->FindClass(className);
        if (env->ExceptionCheck()) {
            env->ExceptionClear();
            return nullptr;
        }
        return clazz;
    }

    jmethodID GetMethodID(JNIEnv* env, jclass clazz, const char* name, const char* sig) {
        jmethodID method = env->GetMethodID(clazz, name, sig);
        if (env->ExceptionCheck()) {
            env->ExceptionClear();
            return nullptr;
        }
        return method;
    }

    jfieldID GetFieldID(JNIEnv* env, jclass clazz, const char* name, const char* sig) {
        jfieldID field = env->GetFieldID(clazz, name, sig);
        if (env->ExceptionCheck()) {
            env->ExceptionClear();
            return nullptr;
        }
        return field;
    }

    jstring NewStringUTF(JNIEnv* env, const char* bytes) {
        jstring str = env->NewStringUTF(bytes);
        if (env->ExceptionCheck()) {
            env->ExceptionClear();
            return nullptr;
        }
        return str;
    }

    std::string GetStringUTF(JNIEnv* env, jstring str) {
        const char* bytes = env->GetStringUTFChars(str, nullptr);
        if (env->ExceptionCheck()) {
            env->ExceptionClear();
            return "";
        }
        std::string result(bytes);
        env->ReleaseStringUTFChars(str, bytes);
        return result;
    }

    void ThrowException(JNIEnv* env, const char* className, const char* message) {
        jclass exceptionClass = env->FindClass(className);
        if (exceptionClass) {
            env->ThrowNew(exceptionClass, message);
        }
    }

    void LogException(JNIEnv* env, const char* tag) {
        jthrowable exception = env->ExceptionOccurred();
        if (exception) {
            env->ExceptionDescribe();
            env->ExceptionClear();
        }
    }

    // Register native methods
    bool RegisterNativeMethods(JNIEnv* env, const char* className, const JNINativeMethod* methods, int numMethods) {
        jclass clazz = env->FindClass(className);
        if (!clazz) {
            LOGE("Failed to find class: %s", className);
            return false;
        }
        
        if (env->RegisterNatives(clazz, methods, numMethods) < 0) {
            LOGE("Failed to register native methods for: %s", className);
            env->DeleteLocalRef(clazz);
            return false;
        }
        
        env->DeleteLocalRef(clazz);
        LOGD("Registered %d native methods for: %s", numMethods, className);
        return true;
    }

    // Register all native methods
    bool RegisterAllNativeMethods(JNIEnv* env) {
        LOGD("Registering all native methods");
        
        // Register BlackBox methods
        RegisterBlackBoxNativeMethods(env);
        
        // Register Client methods
        RegisterClientNativeMethods(env);
        
        // Register Floating service methods
        RegisterFloatingServiceNativeMethods(env);
        
        // Register ESP methods
        RegisterESPNativeMethods(env);
        
        // Register Overlay methods
        RegisterOverlayNativeMethods(env);
        
        // Register Cheat methods
        RegisterCheatNativeMethods(env);
        
        LOGD("All native methods registered");
        return true;
    }
    
    // Register BlackBox native methods
    void RegisterBlackBoxNativeMethods(JNIEnv* env) {
        // These are already implemented in blackbox.cpp
        LOGD("BlackBox native methods already registered via direct JNI");
    }
    
    // Register Client native methods
    void RegisterClientNativeMethods(JNIEnv* env) {
        // These are already implemented in client.cpp
        LOGD("Client native methods already registered via direct JNI");
    }
    
    // Register Floating service native methods
    void RegisterFloatingServiceNativeMethods(JNIEnv* env) {
        // These are already implemented in client.cpp
        LOGD("Floating service native methods already registered via direct JNI");
    }
    
    // Register ESP native methods
    void RegisterESPNativeMethods(JNIEnv* env) {
        // These would be registered if we had Java ESP classes
        LOGD("ESP native methods would be registered here");
    }
    
    // Register Overlay native methods
    void RegisterOverlayNativeMethods(JNIEnv* env) {
        // These would be registered if we had Java Overlay classes
        LOGD("Overlay native methods would be registered here");
    }
    
    // Register Cheat native methods
    void RegisterCheatNativeMethods(JNIEnv* env) {
        // These would be registered if we had Java Cheat classes
        LOGD("Cheat native methods would be registered here");
    }

} // namespace JNI

// JNI OnLoad function
extern "C" JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM* vm, void* reserved) {
    LOGD("JNI_OnLoad called");
    
    // Initialize JNI interface
    if (!JNI::Initialize(vm)) {
        LOGE("Failed to initialize JNI interface");
        return JNI_ERR;
    }
    
    // Get JNI environment
    JNIEnv* env = JNI::GetEnv();
    if (!env) {
        LOGE("Failed to get JNI environment");
        return JNI_ERR;
    }
    
    // Register all native methods
    if (!JNI::RegisterAllNativeMethods(env)) {
        LOGE("Failed to register native methods");
        return JNI_ERR;
    }
    
    LOGD("JNI_OnLoad completed successfully");
    return JNI_VERSION_1_6;
}

// JNI OnUnload function
extern "C" JNIEXPORT void JNICALL JNI_OnUnload(JavaVM* vm, void* reserved) {
    LOGD("JNI_OnUnload called");
    
    // Shutdown JNI interface
    JNI::Shutdown();
    
    LOGD("JNI_OnUnload completed");
}

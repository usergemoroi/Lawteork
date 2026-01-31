#pragma once

#include <jni.h>
#include <string>
#include <memory>
#include "../include/blackbox/blackbox.hpp"
#include "../include/client/client.hpp"

// Global JNI references
extern JavaVM* g_JavaVM;

namespace JNI {

    // Initialize JNI interface
    bool Initialize(JavaVM* vm);
    
    // Shutdown JNI interface
    void Shutdown();
    
    // Get JNI environment
    JNIEnv* GetEnv();
    
    // Cache class references
    void CacheClasses(JNIEnv* env);
    
    // Cache method IDs
    void CacheMethodIDs(JNIEnv* env);
    
    // Cache field IDs
    void CacheFieldIDs(JNIEnv* env);
    
    // Helper functions
    jclass FindClass(JNIEnv* env, const char* className);
    jmethodID GetMethodID(JNIEnv* env, jclass clazz, const char* name, const char* sig);
    jfieldID GetFieldID(JNIEnv* env, jclass clazz, const char* name, const char* sig);
    
    // String conversion
    jstring NewStringUTF(JNIEnv* env, const char* bytes);
    std::string GetStringUTF(JNIEnv* env, jstring str);
    
    // Exception handling
    void ThrowException(JNIEnv* env, const char* className, const char* message);
    void LogException(JNIEnv* env, const char* tag);
    
    // Call Java methods
    jobject CallStaticObjectMethod(JNIEnv* env, jclass clazz, jmethodID methodID, ...);
    jboolean CallStaticBooleanMethod(JNIEnv* env, jclass clazz, jmethodID methodID, ...);
    jint CallStaticIntMethod(JNIEnv* env, jclass clazz, jmethodID methodID, ...);
    jstring CallStaticStringMethod(JNIEnv* env, jclass clazz, jmethodID methodID, ...);
    
    // Register native methods
    bool RegisterNativeMethods(JNIEnv* env, const char* className, const JNINativeMethod* methods, int numMethods);
    
    // Register all native methods
    bool RegisterAllNativeMethods(JNIEnv* env);
    
    // BlackBox JNI methods
    void RegisterBlackBoxNativeMethods(JNIEnv* env);
    
    // Client JNI methods
    void RegisterClientNativeMethods(JNIEnv* env);
    
    // Floating service JNI methods
    void RegisterFloatingServiceNativeMethods(JNIEnv* env);
    
    // ESP JNI methods
    void RegisterESPNativeMethods(JNIEnv* env);
    
    // Overlay JNI methods
    void RegisterOverlayNativeMethods(JNIEnv* env);
    
    // Cheat JNI methods
    void RegisterCheatNativeMethods(JNIEnv* env);

} // namespace JNI

// JNI OnLoad function
extern "C" JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM* vm, void* reserved);

// JNI OnUnload function
extern "C" JNIEXPORT void JNICALL JNI_OnUnload(JavaVM* vm, void* reserved);

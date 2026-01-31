#include "../../include/client/client.hpp"
#include "../../include/blackbox/types.hpp"
#include "../../jni/jni_interface.hpp"
#include <jni.h>
#include <android/log.h>

#define LOG_TAG "ApiServer"
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)

// JNI implementations for ApiServer
extern "C" {

    JNIEXPORT jstring JNICALL Java_kentos_loader_server_ApiServer_CheckServer(JNIEnv* env, jclass clazz)
    {
        std::string result = Client::CheckServer();
        return env->NewStringUTF(result.c_str());
    }

    JNIEXPORT jstring JNICALL Java_kentos_loader_server_ApiServer_EXP(JNIEnv* env, jclass clazz)
    {
        std::string result = Client::EXP();
        return env->NewStringUTF(result.c_str());
    }

    JNIEXPORT jstring JNICALL Java_kentos_loader_server_ApiServer_Pw(JNIEnv* env, jclass clazz)
    {
        std::string result = Client::Pw();
        return env->NewStringUTF(result.c_str());
    }

    JNIEXPORT jstring JNICALL Java_kentos_loader_server_ApiServer_URLJSON(JNIEnv* env, jclass clazz)
    {
        std::string result = Client::URLJSON();
        return env->NewStringUTF(result.c_str());
    }

    JNIEXPORT jstring JNICALL Java_kentos_loader_server_ApiServer_activity(JNIEnv* env, jclass clazz)
    {
        std::string result = Client::activity();
        return env->NewStringUTF(result.c_str());
    }

    JNIEXPORT jstring JNICALL Java_kentos_loader_server_ApiServer_checkSuspiciousAppsNative(JNIEnv* env, jclass clazz)
    {
        std::string result = Client::checkSuspiciousAppsNative();
        return env->NewStringUTF(result.c_str());
    }

    JNIEXPORT jstring JNICALL Java_kentos_loader_server_ApiServer_fdjhvf(JNIEnv* env, jclass clazz)
    {
        std::string result = Client::fdjhvf();
        return env->NewStringUTF(result.c_str());
    }

    JNIEXPORT jstring JNICALL Java_kentos_loader_server_ApiServer_getGrup(JNIEnv* env, jclass clazz)
    {
        std::string result = Client::getGrup();
        return env->NewStringUTF(result.c_str());
    }

    JNIEXPORT jstring JNICALL Java_kentos_loader_server_ApiServer_getOwner(JNIEnv* env, jclass clazz)
    {
        std::string result = Client::getOwner();
        return env->NewStringUTF(result.c_str());
    }

    JNIEXPORT jstring JNICALL Java_kentos_loader_server_ApiServer_getTelegram(JNIEnv* env, jclass clazz)
    {
        std::string result = Client::getTelegram();
        return env->NewStringUTF(result.c_str());
    }

    JNIEXPORT jstring JNICALL Java_kentos_loader_server_ApiServer_mainURL(JNIEnv* env, jclass clazz)
    {
        std::string result = Client::mainURL();
        return env->NewStringUTF(result.c_str());
    }

    JNIEXPORT jstring JNICALL Java_kentos_loader_server_ApiServer_sockallversion(JNIEnv* env, jclass clazz)
    {
        std::string result = Client::sockallversion();
        return env->NewStringUTF(result.c_str());
    }

    JNIEXPORT jstring JNICALL Java_kentos_loader_server_ApiServer_sockindia(JNIEnv* env, jclass clazz)
    {
        std::string result = Client::sockindia();
        return env->NewStringUTF(result.c_str());
    }

}

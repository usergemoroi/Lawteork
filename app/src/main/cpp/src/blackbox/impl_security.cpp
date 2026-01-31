#include "../../include/blackbox/blackbox.hpp"
#include "../../include/blackbox/types.hpp"
#include "../../include/blackbox/utils.hpp"
#include <jni.h>
#include <android/log.h>
#include <random>
#include <sstream>
#include <iomanip>
#include <vector>
#include <algorithm>

#define LOG_TAG "BlackBoxSecurity"
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)

namespace BlackBox {

    // SecurityUtils implementation
    std::string SecurityUtils::GenerateUUID() {
        std::random_device rd;
        std::mt19937 gen(rd());
        std::uniform_int_distribution<> dis(0, 15);
        std::uniform_int_distribution<> dis2(8, 11);
        
        std::stringstream ss;
        ss << std::hex;
        for (int i = 0; i < 8; i++) {
            ss << dis(gen);
        }
        ss << "-";
        for (int i = 0; i < 4; i++) {
            ss << dis(gen);
        }
        ss << "-4"; // UUID version 4
        for (int i = 0; i < 3; i++) {
            ss << dis(gen);
        }
        ss << "-";
        ss << dis2(gen); // UUID variant
        for (int i = 0; i < 3; i++) {
            ss << dis(gen);
        }
        ss << "-";
        for (int i = 0; i < 12; i++) {
            ss << dis(gen);
        }
        
        return ss.str();
    }

    std::string SecurityUtils::GenerateRandomString(size_t length) {
        const std::string charset = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        std::random_device rd;
        std::mt19937 gen(rd());
        std::uniform_int_distribution<> dis(0, charset.size() - 1);
        
        std::string result;
        for (size_t i = 0; i < length; i++) {
            result += charset[dis(gen)];
        }
        return result;
    }

    std::string SecurityUtils::HashString(const std::string& input, const std::string& algorithm) {
        // Simple hash implementation for demonstration
        // In a real implementation, this would use proper cryptographic hashing
        uint32_t hash = 5381;
        for (char c : input) {
            hash = ((hash << 5) + hash) + c; // hash * 33 + c
        }
        
        std::stringstream ss;
        ss << std::hex << hash;
        return ss.str();
    }

    std::string SecurityUtils::Base64Encode(const std::vector<uint8_t>& data) {
        const std::string base64_chars = 
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            "abcdefghijklmnopqrstuvwxyz"
            "0123456789+/";
        
        std::string ret;
        int i = 0;
        int j = 0;
        uint8_t char_array_3[3];
        uint8_t char_array_4[4];
        
        for (size_t pos = 0; pos < data.size(); pos++) {
            char_array_3[i++] = data[pos];
            if (i == 3) {
                char_array_4[0] = (char_array_3[0] & 0xfc) >> 2;
                char_array_4[1] = ((char_array_3[0] & 0x03) << 4) + ((char_array_3[1] & 0xf0) >> 4);
                char_array_4[2] = ((char_array_3[1] & 0x0f) << 2) + ((char_array_3[2] & 0xc0) >> 6);
                char_array_4[3] = char_array_3[2] & 0x3f;
                
                for (i = 0; i < 4; i++) {
                    ret += base64_chars[char_array_4[i]];
                }
                i = 0;
            }
        }
        
        if (i) {
            for (j = i; j < 3; j++) {
                char_array_3[j] = '\0';
            }
            
            char_array_4[0] = (char_array_3[0] & 0xfc) >> 2;
            char_array_4[1] = ((char_array_3[0] & 0x03) << 4) + ((char_array_3[1] & 0xf0) >> 4);
            char_array_4[2] = ((char_array_3[1] & 0x0f) << 2) + ((char_array_3[2] & 0xc0) >> 6);
            
            for (j = 0; j < i + 1; j++) {
                ret += base64_chars[char_array_4[j]];
            }
            
            while (i++ < 3) {
                ret += '=';
            }
        }
        
        return ret;
    }

    std::vector<uint8_t> SecurityUtils::Base64Decode(const std::string& data) {
        const std::string base64_chars = 
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            "abcdefghijklmnopqrstuvwxyz"
            "0123456789+/";
        
        std::vector<uint8_t> ret;
        int i = 0;
        int j = 0;
        int in_ = 0;
        uint8_t char_array_4[4], char_array_3[3];
        
        for (size_t pos = 0; pos < data.size(); pos++) {
            size_t in_ = base64_chars.find(data[pos]);
            if (in_ == std::string::npos) continue;
            
            char_array_4[i++] = in_;
            if (i == 4) {
                char_array_3[0] = (char_array_4[0] << 2) + ((char_array_4[1] & 0x30) >> 4);
                char_array_3[1] = ((char_array_4[1] & 0xf) << 4) + ((char_array_4[2] & 0x3c) >> 2);
                char_array_3[2] = ((char_array_4[2] & 0x3) << 6) + char_array_4[3];
                
                for (i = 0; i < 3; i++) {
                    ret.push_back(char_array_3[i]);
                }
                i = 0;
            }
        }
        
        if (i) {
            for (j = i; j < 4; j++) {
                char_array_4[j] = 0;
            }
            
            char_array_3[0] = (char_array_4[0] << 2) + ((char_array_4[1] & 0x30) >> 4);
            char_array_3[1] = ((char_array_4[1] & 0xf) << 4) + ((char_array_4[2] & 0x3c) >> 2);
            char_array_3[2] = ((char_array_4[2] & 0x3) << 6) + char_array_4[3];
            
            for (j = 0; j < i - 1; j++) {
                ret.push_back(char_array_3[j]);
            }
        }
        
        return ret;
    }

    std::string SecurityUtils::URLEncode(const std::string& data) {
        std::string result;
        for (char c : data) {
            if (isalnum(c) || c == '-' || c == '_' || c == '.' || c == '~') {
                result += c;
            } else {
                char hex[3];
                snprintf(hex, sizeof(hex), "%%%02X", (unsigned char)c);
                result += hex;
            }
        }
        return result;
    }

    std::string SecurityUtils::URLDecode(const std::string& data) {
        std::string result;
        for (size_t i = 0; i < data.size(); i++) {
            if (data[i] == '%' && i + 2 < data.size()) {
                int hexValue;
                sscanf(data.substr(i + 1, 2).c_str(), "%x", &hexValue);
                result += static_cast<char>(hexValue);
                i += 2;
            } else if (data[i] == '+') {
                result += ' ';
            } else {
                result += data[i];
            }
        }
        return result;
    }

} // namespace BlackBox

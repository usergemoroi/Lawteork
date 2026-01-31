#include "../../include/client/network.hpp"
#include "../../include/blackbox/types.hpp"
#include <jni.h>
#include <android/log.h>
#include <curl/curl.h>
#include <string>
#include <map>
#include <memory>

#define LOG_TAG "ClientNetwork"
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)

namespace Client {

    // HTTP request callback for cURL
    static size_t WriteCallback(void* contents, size_t size, size_t nmemb, std::string* output) {
        size_t total_size = size * nmemb;
        output->append((char*)contents, total_size);
        return total_size;
    }

    // NetworkClient implementation
    class NetworkClient::Impl {
    public:
        Impl() {
            curl_global_init(CURL_GLOBAL_ALL);
            curl = curl_easy_init();
            if (curl) {
                curl_easy_setopt(curl, CURLOPT_WRITEFUNCTION, WriteCallback);
                curl_easy_setopt(curl, CURLOPT_FOLLOWLOCATION, 1L);
                curl_easy_setopt(curl, CURLOPT_TIMEOUT, 30L);
                curl_easy_setopt(curl, CURLOPT_USERAGENT, "GameBlasterPro/1.0");
            }
        }
        
        ~Impl() {
            if (curl) {
                curl_easy_cleanup(curl);
            }
            curl_global_cleanup();
        }
        
        HttpResponse SendRequest(const HttpRequest& request) {
            HttpResponse response;
            response.success = false;
            
            if (!curl) {
                response.errorMessage = "cURL not initialized";
                return response;
            }
            
            // Set URL
            curl_easy_setopt(curl, CURLOPT_URL, request.url.c_str());
            
            // Set HTTP method
            if (request.method == HttpMethod::POST) {
                curl_easy_setopt(curl, CURLOPT_POST, 1L);
                curl_easy_setopt(curl, CURLOPT_POSTFIELDS, request.body.c_str());
            } else if (request.method == HttpMethod::PUT) {
                curl_easy_setopt(curl, CURLOPT_CUSTOMREQUEST, "PUT");
                curl_easy_setopt(curl, CURLOPT_POSTFIELDS, request.body.c_str());
            } else if (request.method == HttpMethod::DELETE) {
                curl_easy_setopt(curl, CURLOPT_CUSTOMREQUEST, "DELETE");
            } else if (request.method == HttpMethod::HEAD) {
                curl_easy_setopt(curl, CURLOPT_CUSTOMREQUEST, "HEAD");
                curl_easy_setopt(curl, CURLOPT_NOBODY, 1L);
            } else if (request.method == HttpMethod::PATCH) {
                curl_easy_setopt(curl, CURLOPT_CUSTOMREQUEST, "PATCH");
                curl_easy_setopt(curl, CURLOPT_POSTFIELDS, request.body.c_str());
            } else {
                // GET by default
                curl_easy_setopt(curl, CURLOPT_HTTPGET, 1L);
            }
            
            // Set headers
            struct curl_slist* headers = nullptr;
            for (const auto& header : request.headers) {
                std::string headerStr = header.first + ": " + header.second;
                headers = curl_slist_append(headers, headerStr.c_str());
            }
            if (headers) {
                curl_easy_setopt(curl, CURLOPT_HTTPHEADER, headers);
            }
            
            // Set timeout
            if (request.timeoutSeconds > 0) {
                curl_easy_setopt(curl, CURLOPT_TIMEOUT, (long)request.timeoutSeconds);
            }
            
            // Prepare response
            std::string responseBody;
            curl_easy_setopt(curl, CURLOPT_WRITEDATA, &responseBody);
            
            // Execute request
            CURLcode res = curl_easy_perform(curl);
            
            // Get response code
            long responseCode = 0;
            curl_easy_getinfo(curl, CURLINFO_RESPONSE_CODE, &responseCode);
            response.statusCode = (int32_t)responseCode;
            
            // Clean up headers
            if (headers) {
                curl_slist_free_all(headers);
            }
            
            // Check result
            if (res == CURLE_OK) {
                response.success = true;
                response.body = responseBody;
            } else {
                response.errorMessage = curl_easy_strerror(res);
                LOGE("cURL error: %s", response.errorMessage.c_str());
            }
            
            return response;
        }
        
        HttpResponse Get(const std::string& url, const std::map<std::string, std::string>& headers) {
            HttpRequest request;
            request.url = url;
            request.method = HttpMethod::GET;
            request.headers = headers;
            return SendRequest(request);
        }
        
        HttpResponse Post(const std::string& url, const std::string& body, const std::map<std::string, std::string>& headers) {
            HttpRequest request;
            request.url = url;
            request.method = HttpMethod::POST;
            request.headers = headers;
            request.body = body;
            return SendRequest(request);
        }
        
        HttpResponse Put(const std::string& url, const std::string& body, const std::map<std::string, std::string>& headers) {
            HttpRequest request;
            request.url = url;
            request.method = HttpMethod::PUT;
            request.headers = headers;
            request.body = body;
            return SendRequest(request);
        }
        
        HttpResponse Delete(const std::string& url, const std::map<std::string, std::string>& headers) {
            HttpRequest request;
            request.url = url;
            request.method = HttpMethod::DELETE;
            request.headers = headers;
            return SendRequest(request);
        }
        
        bool DownloadFile(const std::string& url, const std::string& destination) {
            if (!curl) {
                return false;
            }
            
            FILE* fp = fopen(destination.c_str(), "wb");
            if (!fp) {
                return false;
            }
            
            curl_easy_setopt(curl, CURLOPT_URL, url.c_str());
            curl_easy_setopt(curl, CURLOPT_WRITEDATA, fp);
            curl_easy_setopt(curl, CURLOPT_WRITEFUNCTION, nullptr);
            
            CURLcode res = curl_easy_perform(curl);
            fclose(fp);
            
            return res == CURLE_OK;
        }
        
        std::string DownloadString(const std::string& url) {
            HttpResponse response = Get(url);
            return response.success ? response.body : "";
        }
        
        void SetUserAgent(const std::string& userAgent) {
            if (curl) {
                curl_easy_setopt(curl, CURLOPT_USERAGENT, userAgent.c_str());
            }
        }
        
        void SetTimeout(int32_t timeoutSeconds) {
            if (curl) {
                curl_easy_setopt(curl, CURLOPT_TIMEOUT, (long)timeoutSeconds);
            }
        }
        
        void SetFollowRedirects(bool follow) {
            if (curl) {
                curl_easy_setopt(curl, CURLOPT_FOLLOWLOCATION, follow ? 1L : 0L);
            }
        }
        
        bool CheckInternetConnection() {
            HttpResponse response = Get("https://www.google.com", {{ "Cache-Control", "no-cache" }});
            return response.success && response.statusCode == 200;
        }
        
        std::string GetLocalIPAddress() {
            // This would be implemented using network APIs
            return "127.0.0.1";
        }
        
    private:
        CURL* curl;
    };

    // NetworkClient constructor/destructor
    NetworkClient::NetworkClient() : impl(new Impl()) {}
    NetworkClient::~NetworkClient() = default;
    
    HttpResponse NetworkClient::SendRequest(const HttpRequest& request) {
        return impl->SendRequest(request);
    }
    
    HttpResponse NetworkClient::Get(const std::string& url, const std::map<std::string, std::string>& headers) {
        return impl->Get(url, headers);
    }
    
    HttpResponse NetworkClient::Post(const std::string& url, const std::string& body, const std::map<std::string, std::string>& headers) {
        return impl->Post(url, body, headers);
    }
    
    HttpResponse NetworkClient::Put(const std::string& url, const std::string& body, const std::map<std::string, std::string>& headers) {
        return impl->Put(url, body, headers);
    }
    
    HttpResponse NetworkClient::Delete(const std::string& url, const std::map<std::string, std::string>& headers) {
        return impl->Delete(url, headers);
    }
    
    bool NetworkClient::DownloadFile(const std::string& url, const std::string& destination) {
        return impl->DownloadFile(url, destination);
    }
    
    std::string NetworkClient::DownloadString(const std::string& url) {
        return impl->DownloadString(url);
    }
    
    void NetworkClient::SetUserAgent(const std::string& userAgent) {
        impl->SetUserAgent(userAgent);
    }
    
    void NetworkClient::SetTimeout(int32_t timeoutSeconds) {
        impl->SetTimeout(timeoutSeconds);
    }
    
    void NetworkClient::SetFollowRedirects(bool follow) {
        impl->SetFollowRedirects(follow);
    }
    
    bool NetworkClient::CheckInternetConnection() {
        return impl->CheckInternetConnection();
    }
    
    std::string NetworkClient::GetLocalIPAddress() {
        return impl->GetLocalIPAddress();
    }

    // NetworkUtils implementation
    std::string NetworkUtils::UrlEncode(const std::string& data) {
        CURL* curl = curl_easy_init();
        if (!curl) {
            return "";
        }
        
        char* output = curl_easy_escape(curl, data.c_str(), data.length());
        std::string result(output);
        curl_free(output);
        curl_easy_cleanup(curl);
        return result;
    }

    std::string NetworkUtils::UrlDecode(const std::string& data) {
        CURL* curl = curl_easy_init();
        if (!curl) {
            return "";
        }
        
        int outLength;
        char* output = curl_easy_unescape(curl, data.c_str(), data.length(), &outLength);
        std::string result(output, outLength);
        curl_free(output);
        curl_easy_cleanup(curl);
        return result;
    }

    std::string NetworkUtils::Base64Encode(const std::vector<uint8_t>& data) {
        // Simple base64 encoding
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

    std::vector<uint8_t> NetworkUtils::Base64Decode(const std::string& data) {
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

    std::string NetworkUtils::GenerateUserAgent() {
        return "GameBlasterPro/1.0 (Android)";
    }

    bool NetworkUtils::IsValidUrl(const std::string& url) {
        // Simple URL validation
        return url.find("http://") == 0 || url.find("https://") == 0;
    }

} // namespace Client

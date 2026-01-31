# GameBlaster Pro Native Libraries - Main CMake Configuration
# This file configures the build for all native libraries used in the application

cmake_minimum_required(VERSION 3.18.1)

# Set the project name
project("GameBlasterProNative")

# Set C++ standard to C++17
set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)
set(CMAKE_CXX_EXTENSIONS OFF)

# Include directories
include_directories(
    ${CMAKE_SOURCE_DIR}/include
    ${CMAKE_SOURCE_DIR}/include/blackbox
    ${CMAKE_SOURCE_DIR}/include/client
    ${CMAKE_SOURCE_DIR}/jni
)

# Add subdirectories for each library
add_subdirectory(src/blackbox)
add_subdirectory(src/client)

# Link all libraries together
# This will be done in the individual library CMakeLists.txt files

# Set output directory for built libraries
set(CMAKE_LIBRARY_OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR}/libs/${ANDROID_ABI})

# Enable position independent code
set(CMAKE_POSITION_INDEPENDENT_CODE ON)

# Android-specific settings
if(ANDROID)
    # Use the Android NDK toolchain
    set(CMAKE_ANDROID_NDK ${ANDROID_NDK})
    set(CMAKE_ANDROID_STL_TYPE c++_shared)
    
    # Set architecture-specific flags
    if(CMAKE_ANDROID_ARCH_ABI STREQUAL "arm64-v8a")
        set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -fPIC -O3 -funroll-loops -march=armv8-a")
        set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -fPIC -O3 -funroll-loops -march=armv8-a")
    endif()
endif()

# Add custom build targets for documentation
add_custom_target(native_docs
    COMMAND echo "Generating native code documentation..."
    COMMENT "Documentation generation for native libraries"
)

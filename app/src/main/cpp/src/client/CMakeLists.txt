# Client Native Library - CMake Configuration
# Client-side native operations for GameBlaster Pro

# Create the client library
add_library(client SHARED
    # Core client implementation
    ${CMAKE_CURRENT_SOURCE_DIR}/client.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/network.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/api_server.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/security.cpp
    
    # ESP functionality
    ${CMAKE_SOURCE_DIR}/android/esp/esp.cpp
    
    # Overlay functionality
    ${CMAKE_SOURCE_DIR}/android/overlay/overlay.cpp
    
    # Cheat functionality
    ${CMAKE_SOURCE_DIR}/android/cheat/cheat.cpp
    ${CMAKE_SOURCE_DIR}/android/cheat/aimbot.cpp
    ${CMAKE_SOURCE_DIR}/android/cheat/bullet.cpp
    
    # JNI bindings
    ${CMAKE_SOURCE_DIR}/jni/jni_interface.cpp
)

# Include directories for this library
include_directories(
    ${CMAKE_SOURCE_DIR}/include/client
    ${CMAKE_SOURCE_DIR}/include/blackbox
    ${CMAKE_SOURCE_DIR}/android/esp
    ${CMAKE_SOURCE_DIR}/android/overlay
    ${CMAKE_SOURCE_DIR}/android/cheat
    ${CMAKE_SOURCE_DIR}/jni
    ${JNI_INCLUDE_DIRS}
)

# Link required libraries
target_link_libraries(client
    log
    android
    ${JNI_LIBRARIES}
)

# Set library output name
set_target_properties(client PROPERTIES
    OUTPUT_NAME "client"
    LIBRARY_OUTPUT_DIRECTORY ${CMAKE_LIBRARY_OUTPUT_DIRECTORY}
)

# Add compile definitions
target_compile_definitions(client PRIVATE
    CLIENT_BUILD=1
    ANDROID=1
    NDEBUG=1
    ENABLE_ESP=1
    ENABLE_OVERLAY=1
    ENABLE_CHEATS=1
)

# Add compile options for optimization
target_compile_options(client PRIVATE
    -Wall
    -Wextra
    -O3
    -fPIC
    -funroll-loops
    -fomit-frame-pointer
)

# Install the library (for reference)
install(TARGETS client
    LIBRARY DESTINATION lib/${ANDROID_ABI}
)

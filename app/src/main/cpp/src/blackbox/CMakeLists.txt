# BlackBox Native Library - CMake Configuration
# Core native functionality for GameBlaster Pro

# Create the BlackBox library
add_library(BlackBox SHARED
    # Core BlackBox implementation
    ${CMAKE_CURRENT_SOURCE_DIR}/blackbox.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/impl_core.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/impl_security.cpp
    ${CMAKE_CURRENT_SOURCE_DIR}/impl_utils.cpp
    
    # JNI bindings
    ${CMAKE_SOURCE_DIR}/jni/jni_interface.cpp
)

# Include directories for this library
include_directories(
    ${CMAKE_SOURCE_DIR}/include/blackbox
    ${CMAKE_SOURCE_DIR}/jni
    ${JNI_INCLUDE_DIRS}
)

# Link required libraries
target_link_libraries(BlackBox
    log
    android
    ${JNI_LIBRARIES}
)

# Set library output name
set_target_properties(BlackBox PROPERTIES
    OUTPUT_NAME "BlackBox"
    LIBRARY_OUTPUT_DIRECTORY ${CMAKE_LIBRARY_OUTPUT_DIRECTORY}
)

# Add compile definitions
target_compile_definitions(BlackBox PRIVATE
    BLACKBOX_BUILD=1
    ANDROID=1
    NDEBUG=1
)

# Add compile options for optimization
target_compile_options(BlackBox PRIVATE
    -Wall
    -Wextra
    -O3
    -fPIC
    -funroll-loops
    -fomit-frame-pointer
)

# Install the library (for reference)
install(TARGETS BlackBox
    LIBRARY DESTINATION lib/${ANDROID_ABI}
)

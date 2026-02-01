package kentos.loader;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
    private static final String TAG = "GameBlasterPro";
    
    static {
        try {
            System.loadLibrary("BlackBox");
            System.loadLibrary("client");
            Log.d(TAG, "Native libraries loaded successfully");
        } catch (UnsatisfiedLinkError e) {
            Log.e(TAG, "Failed to load native libraries: " + e.getMessage());
        }
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "GameBlaster Pro 5.4 - Starting...");
        
        // Initialize native libraries
        initNative();
    }
    
    // Native method declarations
    private native void initNative();
    public native boolean isLicenseValid();
    public native void setLicenseKey(String key);
}

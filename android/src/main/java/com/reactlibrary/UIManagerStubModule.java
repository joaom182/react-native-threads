package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class UIManagerStubModule extends ReactContextBaseJavaModule {

    public UIManagerStubModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "UIManager";
    }
    
    @ReactMethod
    public void foo() {

    }
}

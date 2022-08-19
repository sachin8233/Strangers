package com.example.strangers;

import android.webkit.JavascriptInterface;

public class InterfaceJava {
    CallActivity callActivity;

    public InterfaceJava(CallActivity callActivity){
        this.callActivity=callActivity;
    }
    @JavascriptInterface
    public void onPeerConnected(){
    callActivity.onPeerConnected();
    }
}

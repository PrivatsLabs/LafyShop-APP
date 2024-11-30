package com.lafyshop.app;


import android.os.Bundle;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadUrl("https://lafyshop.com");  // Chargez l'URL de votre site ici
    }
}
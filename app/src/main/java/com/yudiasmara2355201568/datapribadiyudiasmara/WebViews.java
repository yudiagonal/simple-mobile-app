package com.yudiasmara2355201568.datapribadiyudiasmara;

import android.os.Bundle;
import android.webkit.WebViewClient;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class WebViews extends AppCompatActivity {
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        WebView webView = (WebView) findViewById(R.id.webview1);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://github.com/yudiagonal");
    }
}
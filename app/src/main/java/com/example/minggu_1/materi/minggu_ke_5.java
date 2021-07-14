package com.example.minggu_1.materi;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import com.example.minggu_1.R;

public class minggu_ke_5 extends AppCompatActivity {

    private WebView webview;
    private ProgressBar progressBar2;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.minggu_ke_5);
        initView();

        webview.setWebViewClient(new web());
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://unaja.ac.id/");
    }

    private void initView() {
        webview = findViewById(R.id.webview);
        progressBar2 = findViewById(R.id.progressBar2);
    }

//
    public class web extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return super.shouldOverrideUrlLoading(view, request);
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            progressBar2.setVisibility(View.GONE);
        }
//
//
    }
    void  data(){

    }
}
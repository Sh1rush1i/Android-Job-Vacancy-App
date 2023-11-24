package com.example.pepebeem

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class WebViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.webview)

        WindowCompat.setDecorFitsSystemWindows(
            window, false
        )

        // Get URL from the intent
        val url = intent.getStringExtra("url")

        // Initialize WebView
        val webView: WebView = findViewById(R.id.webView)

        // Load URL in WebView
        // Check if url is not null before loading it in WebView
        url?.let {
            // Load URL in WebView
            val webSettings: WebSettings = webView.settings
            webSettings.javaScriptEnabled = true

            webView.webViewClient = MyWebViewClient()
            webView.loadUrl(it)
        }
    }

    private class MyWebViewClient : WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
            // Handle custom URL schemes here
            // For example, check if the scheme is "mycustomscheme" and handle it accordingly
            if (url?.startsWith("mycustomscheme://") == true) {
                // Handle the custom scheme (e.g., open a new activity)
                // For demonstration, let's just return true to indicate that we've handled the URL
                return true
            }

            // If it's not a custom scheme, allow the WebView to load the URL
            return super.shouldOverrideUrlLoading(view, url)
        }
    }
}

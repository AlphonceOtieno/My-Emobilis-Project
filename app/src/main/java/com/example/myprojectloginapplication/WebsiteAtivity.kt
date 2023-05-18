package com.example.myprojectloginapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebsiteAtivity : AppCompatActivity() {
    lateinit var MyWebView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_website_ativity)

        setContentView(R.layout.activity_website_ativity)
        MyWebView =findViewById(R.id.webView)
        val webSettings = MyWebView.settings
        webSettings.javaScriptEnabled = true
        MyWebView.loadUrl("https://www.medicinenet.com")

    }
}
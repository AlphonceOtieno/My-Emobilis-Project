package com.example.myprojectloginapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class DocWebsiteActivity : AppCompatActivity() {
    lateinit var DocWeb: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doc_website)

        setContentView(R.layout.activity_website_ativity)
        DocWeb =findViewById(R.id.WebView)
        val webSettings = DocWeb.settings
        webSettings.javaScriptEnabled = true
        DocWeb.loadUrl("https://www.emobilis.ac.ke")


    }
}

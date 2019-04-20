package com.example.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayWifiDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_wifi_data)

        val textView = findViewById<TextView>(R.id.textView).apply {
            text = "WiFi will be here "
        }
    }
}

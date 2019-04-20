package com.example.myfirstapp

import android.content.Context
import android.net.wifi.WifiManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView


class DisplayWifiDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_wifi_data)

        val wifiManager = this.getSystemService(Context.WIFI_SERVICE) as WifiManager

        val success = wifiManager.startScan()
        if (!success) {
            scanFailure()
        }

        scanSuccess(wifiManager)
    }

    private fun scanSuccess(wifiManager: android.net.wifi.WifiManager) {
        val results = wifiManager.scanResults
        val textView = findViewById<TextView>(R.id.textView).apply {
            var message = ""
            for (result in results) {
                message += result.SSID + ",\t\t" + result.BSSID + ",\t\t" + result.level + "\n"
            }
            text = message
        }
    }

    private fun scanFailure() {
        Log.e("scanFailure", "")
    }
}

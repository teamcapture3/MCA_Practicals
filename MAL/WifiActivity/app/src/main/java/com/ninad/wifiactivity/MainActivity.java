package com.ninad.wifiactivity;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Button button_wifi;
    WifiManager wifiManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();

        button_wifi = findViewById(R.id.button_wifi);
        wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);

        if (wifiManager.isWifiEnabled()) {
            button_wifi.setText("Turn off WiFi");
        }
        else if (!wifiManager.isWifiEnabled()) {
            button_wifi.setText("Turn on Wifi");
        }

        button_wifi.setOnClickListener(view -> {
            if(wifiManager.isWifiEnabled()) {
                button_wifi.setText("Turn on Wifi");
                wifiManager.setWifiEnabled(false);
                Toast.makeText(MainActivity.this, "Successfully turn Wifi off", Toast.LENGTH_SHORT).show();
            }
            else if (!wifiManager.isWifiEnabled()) {
                button_wifi.setText("Turn off Wifi");
                wifiManager.setWifiEnabled(true);
                Toast.makeText(MainActivity.this, "Successfully turn Wifi on", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
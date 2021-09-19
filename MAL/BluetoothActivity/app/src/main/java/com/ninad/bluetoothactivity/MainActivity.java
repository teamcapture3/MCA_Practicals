package com.ninad.bluetoothactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    public static final int BLUETOOTH_REQ_CODE = 1;
    Button button_bluetooth;
    BluetoothAdapter bluetoothAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();

        button_bluetooth = findViewById(R.id.button_bluetooth);
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (bluetoothAdapter == null) {
            Toast.makeText(MainActivity.this, "This device doesn't support Bluetooth!!", Toast.LENGTH_LONG).show();
        }

        if (!bluetoothAdapter.isEnabled()) {
            button_bluetooth.setText("Turn on Bluetooth");
        }
        else {
            button_bluetooth.setText("Turn off Bluetooth");
        }

        button_bluetooth.setOnClickListener(view -> {
            if (!bluetoothAdapter.isEnabled()) {
                Intent bluetoothIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                startActivityForResult(bluetoothIntent, BLUETOOTH_REQ_CODE);
                Toast.makeText(MainActivity.this, "Successfully turn Bluetooth on", Toast.LENGTH_SHORT).show();
            }
            else {
                bluetoothAdapter.disable();
                button_bluetooth.setText("Turn on Bluetooth");
                Toast.makeText(MainActivity.this, "Successfully turn Bluetooth off", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
package com.ninad.jsonobject;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Button click;
    @SuppressLint("StaticFieldLeak")
    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();

        click = findViewById(R.id.button_fetch);
        data = findViewById(R.id.fetcheddata);

        click.setOnClickListener(view -> {
            fetchData process = new fetchData();
            process.execute();
        });

    }
}
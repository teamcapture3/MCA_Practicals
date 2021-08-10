package com.ninad.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Admin extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        getSupportActionBar().hide();
        Intent getIntent=getIntent();
        String Message ="Welcome "+getIntent.getStringExtra("Name");
        textView=findViewById(R.id.textView);
        textView.setText(Message);
    }
}
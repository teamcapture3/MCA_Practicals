package com.ninad.loginalert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

@SuppressWarnings("ALL")
public class WelcomeActivity extends AppCompatActivity {
    Button btn_logout;
    TextView text_username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_weclome);
        text_username = findViewById(R.id.textWelcome);
        btn_logout = findViewById(R.id.button_logout);
        String username = SharedPrefManager.getInstance(getApplicationContext()).getUserName();
        if( username == null){
            finish();
            startActivity(new Intent(this,MainActivity.class));
        }
        else {
            text_username.setText("Welcome, "+SharedPrefManager.getInstance(this).getUserName());
        }
        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPrefManager.getInstance(getApplicationContext()).logOut();
                startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
            }
        });
    }
}
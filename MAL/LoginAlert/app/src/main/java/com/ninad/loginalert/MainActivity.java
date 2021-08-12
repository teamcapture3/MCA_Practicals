package com.ninad.loginalert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText textUsername,textPassword;
    Button btn_login;
    CheckBox RememberCheck;
    String username="";
    String password="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        if(SharedPrefManager.getInstance(this).isLoggedIn()){
            finish();
            startActivity(new Intent(this,WelcomeActivity.class));
            return;
        }
        textUsername = findViewById(R.id.editTextUsername);
        textPassword = findViewById(R.id.editTextPassword);
        RememberCheck = findViewById(R.id.checkBox_remember);
        btn_login = findViewById(R.id.button_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(RememberCheck.isChecked()){
                    username = textUsername.getText().toString().trim();
                    password= textPassword.getText().toString().trim();
                    SharedPrefManager.getInstance(getApplicationContext()).userLogin(username,password);
                    Toast.makeText(getApplicationContext(),"Saved",Toast.LENGTH_SHORT).show();
                }
                startActivity(new Intent(MainActivity.this, WelcomeActivity.class));
            }
        });
    }
}
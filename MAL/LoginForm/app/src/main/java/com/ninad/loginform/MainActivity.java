package com.ninad.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Username,Password;
    Button Login;
    static int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        count=3;
        Username=findViewById(R.id.editTextTextLogin);
        Password=findViewById(R.id.editTextTextPassword);
        Login=findViewById(R.id.button_login);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Username.getText().toString().equals("") || Password.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this, "Please provide login details", Toast.LENGTH_SHORT).show();
                }
                else if(Username.getText().toString().equals("ninad") && Password.getText().toString().equals("1998"))
                {
                    Intent loginIntent=new Intent(MainActivity.this,Admin.class);
                    loginIntent.putExtra("Name","Ninad");
                    startActivity(loginIntent);
                }
                else
                {
                    count--;
                    if(count>0)
                    {
                        Toast.makeText(MainActivity.this, count+" Attempts Remaining", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Login.setEnabled(false);
                        Toast.makeText(MainActivity.this, "You have exceeded maximum number of invalid attempts. \nPlease try again later.", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
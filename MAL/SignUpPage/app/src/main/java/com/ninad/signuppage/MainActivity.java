package com.ninad.signuppage;

import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    EditText name, email, password;
    Button signup;
    String url = "http://127.0.0.1/logindetails/"; //Use your pc ipv4 check it in cmd by using ipconfig
    String x,y,z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        name = findViewById(R.id.editText1);
        email = findViewById(R.id.editText2);
        password = findViewById(R.id.editText3);
        x = name.getText().toString();
        y = email.getText().toString();
        z = password.getText().toString();
        signup = findViewById(R.id.buttonSignup);
        signup.setOnClickListener(view -> {
            if(name.getText().toString().equals("") || email.getText().toString().equals("") || password.getText().toString().equals(""))  {
                Toast.makeText(getApplicationContext(),"Fields cannot be blank",Toast.LENGTH_SHORT).show();
            }
            else if (!Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches()) {
                Toast.makeText(getApplicationContext(),"Email is invalid",Toast.LENGTH_SHORT).show();
            }
            else{process();
            }
        });
    }
    public void process() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();
        myapi api = retrofit.create(myapi.class);
        Call<model> call = api.adddata(name.getText().toString(), email.getText().toString(), password.getText().toString());
        call.enqueue(new Callback<model>() {
            @Override
            public void onResponse(@NonNull Call<model> call, @NonNull Response<model> response) {
                name.setText("");
                email.setText("");
                password.setText("");
                Toast.makeText(getApplicationContext(),response.toString(),Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onFailure(@NonNull Call<model> call, @NonNull Throwable t) {
                Toast.makeText(getApplicationContext(),t.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
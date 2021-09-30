package com.ninad.volleylib;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Button button_request;
    private RequestQueue mQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();

        button_request = findViewById(R.id.button_request);
        mQueue = Volley.newRequestQueue(this);
        button_request.setOnClickListener(view -> {
            String url = "https://mocki.io/v1/0d4acc9c-a097-4257-9d4a-880e99fb9bc4";
            JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, response -> {
                try {
                    Toast.makeText(getApplicationContext(), "Name: " + response.getString("name") + "\nE-Mail: " + response.getString("email"), Toast.LENGTH_LONG).show();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }, Throwable::printStackTrace);
            mQueue.add(request);
        });
    }
}
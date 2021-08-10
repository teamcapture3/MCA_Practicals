package com.ninad.personaldetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    TextView fetchName, fetchAge, fetchGender, fetchRating, fetchAgree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_display);

        fetchName = findViewById(R.id.details_name);
        fetchAge = findViewById(R.id.details_age);
        fetchGender = findViewById(R.id.details_gender);
        fetchRating = findViewById(R.id.details_ratings);
        fetchAgree = findViewById(R.id.details_agree);
        Intent getIntent = getIntent();
        Bundle getBundle = getIntent.getBundleExtra("bundle");
        fetchName.setText(getBundle.getString("name"));
        fetchAge.setText(getBundle.getString("age"));
        fetchGender.setText(getBundle.getString("gender"));
        fetchRating.setText(getBundle.getString("rateus"));
        fetchAgree.setText(getBundle.getString("agree").toUpperCase());
    }
}
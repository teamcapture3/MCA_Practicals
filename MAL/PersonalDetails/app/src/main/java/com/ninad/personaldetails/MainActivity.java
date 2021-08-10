package com.ninad.personaldetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name, age;
    RadioButton male, female;
    RatingBar rateus;
    CheckBox agree;
    Button submit;
    RadioGroup gendergroup;
    String gender, rating, agreement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.edittext_name);
        age = findViewById(R.id.edittext_age);
        gendergroup = findViewById(R.id.gender_group);
        male = findViewById(R.id.radio_male);
        female = findViewById(R.id.radio_female);
        rateus = findViewById(R.id.rating);
        agree = findViewById(R.id.checkBox_agree);
        submit = findViewById(R.id.button_submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean genderChecked = false;
                int checkedRadio = gendergroup.getCheckedRadioButtonId();
                if(checkedRadio == male.getId())
                {
                    gender = "Male";
                    genderChecked = true;
                }
                else if (checkedRadio == female.getId())
                {
                    gender = "Female";
                    genderChecked = true;
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please select gender", Toast.LENGTH_SHORT).show();
                }
                if(genderChecked)
                {
                    rating = "" + rateus.getRating();
                    agreement = "" + agree.isChecked();
                    Intent displayIntent = new Intent(MainActivity.this,DisplayActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("name", name.getText().toString());
                    bundle.putString("age", age.getText().toString());
                    bundle.putString("gender", gender);
                    bundle.putString("rateus", rating);
                    bundle.putString("agree", agreement);
                    displayIntent.putExtra("bundle",bundle);
                    startActivity(displayIntent);
                }
            }
        });
    }
}
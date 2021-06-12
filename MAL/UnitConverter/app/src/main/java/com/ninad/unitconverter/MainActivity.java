package com.ninad.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

@SuppressWarnings({"ConstantConditions", "Convert2Lambda"})
public class MainActivity extends AppCompatActivity {

    Spinner spinnerFrom,spinnerTo;
    EditText input_from;
    TextView text_result;
    Button btn_convert;
    String from,to;
    Double num1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        spinnerFrom = findViewById(R.id.spinner_from);
        spinnerTo = findViewById(R.id.spinner_to);
        input_from = findViewById(R.id.input_from);
        text_result = findViewById(R.id.text_result);
        btn_convert = findViewById(R.id.btn_convert);
        ArrayAdapter <CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.converter,android.R.layout.simple_spinner_item);
        spinnerFrom.setAdapter(adapter);
        spinnerTo.setAdapter(adapter);
        btn_convert.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                from = spinnerFrom.getSelectedItem().toString();
                to = spinnerTo.getSelectedItem().toString();
                if (to.equalsIgnoreCase(from)) {
                    Toast.makeText(getApplicationContext(), "Both units are same.", Toast.LENGTH_SHORT).show();
                } else {
                    num1 = Double.parseDouble(input_from.getText().toString());
                    switch (from) {
                        case "Centimeter":
                            if (to.equalsIgnoreCase("Meter"))
                            {
                                text_result.setText(num1 + " CM = " + (num1 / 100) + " M");
                            } else
                                Toast.makeText(getApplicationContext(), "Unable to convert to another unit.", Toast.LENGTH_SHORT).show();
                            break;
                        case "Meter":
                            if (to.equalsIgnoreCase("Centimeter"))
                            {
                                text_result.setText(num1 + " M = " + (num1 * 100) + " CM");
                            } else
                                Toast.makeText(getApplicationContext(), "Unable to convert to another unit", Toast.LENGTH_SHORT).show();
                            break;
                        case "Fahrenheit":
                            if (to.equalsIgnoreCase("Celsius"))
                            {
                                text_result.setText(num1 + " F = " + (num1 - 32) / 1.8 + " C");
                            } else
                                Toast.makeText(getApplicationContext(), "Unable to convert to another unit", Toast.LENGTH_SHORT).show();
                            break;
                        case "Celsius":
                            if (to.equalsIgnoreCase("Fahrenheit"))
                            {
                                text_result.setText(num1 + " C = " + (num1 * 1.8 + 32) + " F");
                            } else
                                Toast.makeText(getApplicationContext(), "Unable to convert to another unit.", Toast.LENGTH_SHORT).show();
                            break;
                        case "KiloGram":
                            if (to.equalsIgnoreCase("Gram"))
                            {
                                text_result.setText(num1 + " KG = " + (num1 * 1000) + " G");
                            } else
                                Toast.makeText(getApplicationContext(), "Unable to convert to another unit.", Toast.LENGTH_SHORT).show();
                            break;
                        case "Gram":
                            if (to.equalsIgnoreCase("KiloGram"))
                            {
                                text_result.setText(num1 + " G = " + (num1 / 1000) + " KG");
                            } else
                                Toast.makeText(getApplicationContext(), "Unable to convert to another unit.", Toast.LENGTH_SHORT).show();
                            break;
                        case "Rupee":
                            if (to.equalsIgnoreCase("Dollar"))
                            {
                                text_result.setText(num1 + " Rupee = " + (num1 / 70.36) + " Dollar");
                            } else
                                Toast.makeText(getApplicationContext(), "Unable to convert to another unit.", Toast.LENGTH_SHORT).show();
                            break;
                        case "Dollar":
                            if (to.equalsIgnoreCase("Rupee"))
                            {
                                text_result.setText(num1 + " Dollar = " + (num1 * 70.36) + " Rupee");
                            } else
                                Toast.makeText(getApplicationContext(), "Unable to convert to another unit.", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }
            }
        });
    }
}

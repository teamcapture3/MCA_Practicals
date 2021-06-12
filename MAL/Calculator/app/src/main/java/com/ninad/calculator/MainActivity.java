package com.ninad.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button zero,one,two,three,four,five,six,seven,eight,nine,div,mul,sub,add,clear,equal;
    EditText editText;
    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';
    private char CURRENT_ACTION;
    private double valueOne = Double.NaN;
    private double valueTwo = Double.NaN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.text_input);
        zero = findViewById(R.id.btn_0);
        one = findViewById(R.id.btn_1);
        two = findViewById(R.id.btn_2);
        three = findViewById(R.id.btn_3);
        four = findViewById(R.id.btn_4);
        five = findViewById(R.id.btn_5);
        six = findViewById(R.id.btn_6);
        seven = findViewById(R.id.btn_7);
        eight = findViewById(R.id.btn_8);
        nine = findViewById(R.id.btn_9);
        div = findViewById(R.id.btn_div);
        mul = findViewById(R.id.btn_mul);
        sub = findViewById(R.id.btn_sub);
        add = findViewById(R.id.btn_add);
        clear = findViewById(R.id.btn_clear);
        equal = findViewById(R.id.btn_result);
        zero.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        div.setOnClickListener(this);
        mul.setOnClickListener(this);
        sub.setOnClickListener(this);
        add.setOnClickListener(this);
        clear.setOnClickListener(this);
        equal.setOnClickListener(this);
    }
    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_0:
                editText.setText(editText.getText() + "0");
                break;
            case R.id.btn_1:
                editText.setText(editText.getText() + "1");
                break;
            case R.id.btn_2:
                editText.setText(editText.getText() + "2");
                break;
            case R.id.btn_3:
                editText.setText(editText.getText() + "3");
                break;
            case R.id.btn_4:
                editText.setText(editText.getText() + "4");
                break;
            case R.id.btn_5:
                editText.setText(editText.getText() + "5");
                break;
            case R.id.btn_6:
                editText.setText(editText.getText() + "6");
                break;
            case R.id.btn_7:
                editText.setText(editText.getText() + "7");
                break;
            case R.id.btn_8:
                editText.setText(editText.getText() + "8");
                break;
            case R.id.btn_9:
                editText.setText(editText.getText() + "9");
                break;
            case R.id.btn_add:
                computeCalculation();
                CURRENT_ACTION = ADDITION;
                editText.setText(null);
                break;
            case R.id.btn_sub:
                computeCalculation();
                CURRENT_ACTION = SUBTRACTION;
                editText.setText(null);
                break;
            case R.id.btn_mul:
                computeCalculation();
                CURRENT_ACTION = MULTIPLICATION;
                editText.setText(null);
                break;
            case R.id.btn_div:
                computeCalculation();
                CURRENT_ACTION = DIVISION;
                editText.setText(null);
                break;
            case R.id.btn_result:
                computeCalculation();
                if(Double.isNaN(valueOne)) {
                    editText.setText("");
                }
                else {
                    editText.setText(String.valueOf(valueOne));
                    valueOne = Double.NaN;
                    CURRENT_ACTION = '0';
                    break;
                }
            case R.id.btn_clear:
                valueOne = Double.NaN;
                valueTwo = Double.NaN;
                editText.setText("");
                break;
        }
    }
    private void computeCalculation() {
        if(!Double.isNaN(valueOne)) {
            valueTwo = Double.parseDouble(editText.getText().toString());
            editText.setText(null);
            if(CURRENT_ACTION == ADDITION)
                valueOne = this.valueOne + valueTwo;
            else if(CURRENT_ACTION == SUBTRACTION)
                valueOne = this.valueOne - valueTwo;
            else if(CURRENT_ACTION == MULTIPLICATION)
                valueOne = this.valueOne * valueTwo;
            else if(CURRENT_ACTION == DIVISION){
                if(valueTwo == 0) {
                    Toast.makeText(getApplicationContext(),"Cannot divide by zero.",Toast.LENGTH_SHORT).show();
                    valueOne = Double.NaN;
                }
                else
                    valueOne = this.valueOne / valueTwo;
            }
        }
        else
            {
                try
                {
                    valueOne = Double.parseDouble(editText.getText().toString());
                }
                catch (Exception ignored){}
            }
    }
}
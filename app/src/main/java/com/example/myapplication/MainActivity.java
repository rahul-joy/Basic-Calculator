package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonadd, buttonSub, buttonDiv,
            buttonMul, buttonPoint, buttonReset, buttonEqual;
    EditText eT;
    float ValueOne, ValueTwo, result;
    boolean Addition, Subtract, Multiplication, Division;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// Referencing
        button0 = findViewById(R.id.btnZero);
        button1 = findViewById(R.id.btnOne);
        button2 = findViewById(R.id.btnTwo);
        button3 = findViewById(R.id.btnThree);
        button4 = findViewById(R.id.btnFour);
        button5 = findViewById(R.id.btnFive);
        button6 = findViewById(R.id.btnSix);
        button7 = findViewById(R.id.btnSeven);
        button8 = findViewById(R.id.btnEight);
        button9 = findViewById(R.id.btnNine);
        buttonPoint = findViewById(R.id.btnPoint);
        buttonadd = findViewById(R.id.btnadd);
        buttonSub = findViewById(R.id.btnSub);
        buttonMul = findViewById(R.id.btnMul);
        buttonDiv = findViewById(R.id.btnDiv);
        buttonReset = findViewById(R.id.btnReset);
        buttonEqual = findViewById(R.id.btnEqual);
        eT = findViewById(R.id.eT);
// Event Listeners
        button1.setOnClickListener(v -> eT.setText(eT.getText() + "1"));
        button2.setOnClickListener(v -> eT.setText(eT.getText() + "2"));
        button3.setOnClickListener(v -> eT.setText(eT.getText() + "3"));

        button4.setOnClickListener(v -> eT.setText(eT.getText() + "4"));
        button5.setOnClickListener(v -> eT.setText(eT.getText() + "5"));
        button6.setOnClickListener(v -> eT.setText(eT.getText() + "6"));
        button7.setOnClickListener(v -> eT.setText(eT.getText() + "7"));
        button8.setOnClickListener(v -> eT.setText(eT.getText() + "8"));
        button9.setOnClickListener(v -> eT.setText(eT.getText() + "9"));
        button0.setOnClickListener(v -> eT.setText(eT.getText() + "0"));
        buttonReset.setOnClickListener(v -> eT.setText(""));
        buttonPoint.setOnClickListener(v -> eT.setText(eT.getText() + "."));
        buttonadd.setOnClickListener(v -> {
            ValueOne = Float.parseFloat(eT.getText().toString());
            Addition = true;
            eT.setText(null);
        });
        buttonSub.setOnClickListener(v -> {
            ValueOne = Float.parseFloat(eT.getText().toString());
            Subtract = true;
            eT.setText(null);
        });
        buttonMul.setOnClickListener(v -> {
            ValueOne = Float.parseFloat(eT.getText().toString());
            Multiplication = true;
            eT.setText(null);
        });
        buttonDiv.setOnClickListener(v -> {
            ValueOne = Float.parseFloat(eT.getText().toString());
            Division = true;
            eT.setText(null);
        });
        buttonEqual.setOnClickListener(v -> {
            ValueTwo = Float.parseFloat(eT.getText().toString());
            if (Addition) {
                result = ValueOne + ValueTwo;
                eT.setText(String.valueOf(result));
                Addition = false;
            }
            if (Subtract) {
                result = ValueOne - ValueTwo;
                eT.setText(String.valueOf(result));
                Subtract = false;
            }

            if (Multiplication) {
                result = ValueOne * ValueTwo;
                eT.setText(String.valueOf(result));
                Multiplication = false;
            }
            if (Division) {
                if (ValueTwo != 0) {
                    result = ValueOne / ValueTwo;
                    eT.setText(String.valueOf(result));
                } else {
                    eT.setText("Error"); // Handle division by zero
                }
                Division = false;
            }
        });
    }
}
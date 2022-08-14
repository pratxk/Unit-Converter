package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView output;
    EditText EnterNum;
    Button Centimetres;
    Button Kilograms;
    Button Kilometer1;
    Button Litres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.output);
        EnterNum = findViewById(R.id.editTextNumberDecimal);
        Centimetres = findViewById(R.id.meters);
        Kilograms = findViewById(R.id.Grams);
        Kilometer1 = findViewById(R.id.Miles);
        Litres = findViewById(R.id.Mililitres);

        Litres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                float ml = number*1000;
                output.setText("Value in Mililitres : " + ml+"ml");

            }
        });

        Kilograms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                float gms = (number*1000) ;
                output.setText("Value in Grams is: " + gms+"g");

            }
        });

        Centimetres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                double mts = (number*0.01) ;
                output.setText("Value in Kilometers : " + mts+"metres");

            }
        });

        Kilometer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                double ml = (number*0.621371);
                output.setText("Value in Miles : " + ml+"miles");

            }
        });

    }
}
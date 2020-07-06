package com.example.samplecalculatormobileapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    Button plus,min,mul,div;
    TextView reslt;
    EditText Numbr1,Numbr2;

    int num1,num2;
    float results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declare Variables
        plus=findViewById(R.id.btnplus);
        min=findViewById(R.id.btnmin);
        mul=findViewById(R.id.btnmul);
        div=findViewById(R.id.btndiv);

        reslt=findViewById(R.id.results);

        Numbr1=findViewById(R.id.Number1);
        Numbr2=findViewById(R.id.Number2);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1=Integer.parseInt(Numbr1.getText().toString());
                num2=Integer.parseInt(Numbr2.getText().toString());

                results=num1+num2;
                reslt.setText(String.valueOf(results));
            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(Numbr1.getText().toString());
                num2=Integer.parseInt(Numbr2.getText().toString());

                results=num1-num2;
                reslt.setText(String.valueOf(results));
           }
        });

    mul.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            num1=Integer.parseInt(Numbr1.getText().toString());
            num2=Integer.parseInt(Numbr2.getText().toString());

            results=num1*num2;
            reslt.setText(String.valueOf(results));
        }
    });

    div.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            num1=Integer.parseInt(Numbr1.getText().toString());
            num2=Integer.parseInt(Numbr2.getText().toString());

            results=num1/num2;
            reslt.setText(String.valueOf(results));
        }
    });


    }
}

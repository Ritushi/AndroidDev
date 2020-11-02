package com.ritushi.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    EditText e2;
    EditText e3;
    Button b1;
    Button b2;
    Button b3;
    Button b4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1= (EditText) findViewById(R.id.editTextNumber);
        e2= (EditText) findViewById(R.id.editTextNumber2);
        e3= (EditText) findViewById(R.id.editTextTextPersonName);
        b1= (Button) findViewById(R.id.button);
        b2= (Button) findViewById(R.id.button2);
        b3= (Button) findViewById(R.id.button3);
        b4= (Button) findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= e1.getText().toString();
                String s1= e2.getText().toString();
                int n= Integer.parseInt(s);
                int n1= Integer.parseInt(s1);
                e3.setText((n+n1)+"");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= e1.getText().toString();
                String s1= e2.getText().toString();
                int n= Integer.parseInt(s);
                int n1= Integer.parseInt(s1);
                e3.setText((n-n1)+"");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= e1.getText().toString();
                String s1= e2.getText().toString();
                long n= Integer.parseInt(s);
                long n1= Integer.parseInt(s1);
                long x= n*n1;
                e3.setText(x+"");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= e1.getText().toString();
                String s1= e2.getText().toString();
                int n= Integer.parseInt(s);
                int n1= Integer.parseInt(s1);
                float q= n/n1;
                e3.setText(q+"");
            }
        });
    }
}
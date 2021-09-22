package com.example.carloancalc;

import static java.lang.Math.pow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {
   private TextView loanOrLease;
   private TextView editStatement;
   private EditText editCarPrice;
   private EditText editPayment;
   private EditText editRate;
   private Button buttonCalculate;
   private ToggleButton toggleButton1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToggleButton1();

        editCarPrice = findViewById(R.id.editcarPrice);
        editPayment = findViewById(R.id.editPayment);
        editStatement = findViewById(R.id.editStatement);
        editRate = findViewById(R.id.editRate);
        toggleButton1 = findViewById(R.id.toggleButton1);
        toggleButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(toggleButton1.isChecked()){
                    double payment = Double.parseDouble(editPayment.getText().toString());
                    double mr = ( Double.parseDouble(editRate.getText().toString())/100 )/12; //get input from user
                    double price = Double.parseDouble((editCarPrice.getText().toString()))/3;
                    double L = price - payment;
                    int n = 36;
                    double p= mr*L/(1-Math.pow((1+mr), -n));
                    //double p2 = Math.round(( p * 100.0) /100 );
                    editStatement.setText("Your Total Monthly Payment: " + p);

                }
                else{
                    buttonCalculate.getText();



                }

            }
        });





        buttonCalculate = findViewById(R.id.buttonCalculate);
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                double mr = ( Double.parseDouble(editRate.getText().toString())/100 )/12; //get input from user
                double price= Double.parseDouble(editCarPrice.getText().toString());
                double payment = Double.parseDouble(editPayment.getText().toString());
                double L = price - payment;
                int n = 36;
                double p= mr*L/(1-Math.pow((1+mr), -n));
                //double p2 = Math.round(( p * 100.0) /100 );
                editStatement.setText("Your Total Monthly Payment: " + p);



            }
        });



    }

    private void initToggleButton1() {
        ToggleButton toggleButton1 = findViewById(R.id.toggleButton1);
        toggleButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });


        }


}
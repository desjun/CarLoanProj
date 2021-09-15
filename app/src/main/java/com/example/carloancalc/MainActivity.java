package com.example.carloancalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
   private TextView loanOrLease;
   private EditText editPrice;
   private EditText editPayment;
   private Button buttonCalculate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToggleButton1();
        setForEditing(false);


        buttonCalculate = findViewById(R.id.buttonCalculate);
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
// P = mr*L/(1-(1+mr)-n)
                int numberPayment;
                int loanSize;
                double interestRate;
                double monthlyPayment;


                numberPayment =monthlyPayment*loanSize
            }
        });

    }

    private void initToggleButton1() {
        ToggleButton toggleButton1 = findViewById(R.id.toggleButton1);
        toggleButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setForEditing(toggleButton1.isChecked());

            }
        });


        }

    private void setForEditing(boolean enabled) {
        EditText editPayment = findViewById(R.id.editPayment);
        EditText editPrice = findViewById(R.id.editPrice);

        editPayment.setEnabled(enabled);
        editPrice.setEnabled(enabled);



    }

}
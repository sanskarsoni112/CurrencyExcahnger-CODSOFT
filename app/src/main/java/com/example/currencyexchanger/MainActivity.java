package com.example.currencyexchanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertit(View view){

        Log.i("Info", "Button Pressed!");

        EditText editText = (EditText) findViewById(R.id.editTextAmountInRupees);

        String AmountInRupees = editText.getText().toString();

        double AmountInRupeesDouble = Double.parseDouble(AmountInRupees);

        double AmountInDollarDouble = AmountInRupeesDouble * 0.012;

        String AmountInDollar = String.format("%2f", AmountInDollarDouble);

        Toast.makeText(this, "$" + AmountInDollar, Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
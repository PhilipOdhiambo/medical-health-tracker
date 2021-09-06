package com.philipowino.medicalhealthtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class BmiResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_result);
        Intent intent = getIntent();
        String weight = intent.getStringExtra("weight");
        String height = intent.getStringExtra("height");
        Double bmi = Double.parseDouble(intent.getStringExtra("bmi"));
    }
}
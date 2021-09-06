package com.philipowino.medicalhealthtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.appBmi) TextView mBMI;
    @BindView(R.id.appEDD) TextView mEDD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
package com.philipowino.medicalhealthtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.appBmi) TextView mBMI;
    @BindView(R.id.appEDD) TextView mEDD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set listeners to views of interest on layout create time
        mBMI.setOnClickListener(this);
        mEDD.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}
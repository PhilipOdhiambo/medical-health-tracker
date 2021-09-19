package com.philipowino.medicalhealthtracker.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.philipowino.medicalhealthtracker.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.appBmi) TextView mBMI;
    @BindView(R.id.appEDD) TextView mEDD;
    @BindView(R.id.adverseEventTextView) TextView mAdverseEventTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set listeners to views of interest on layout create time
        ButterKnife.bind(this);
        mBMI.setOnClickListener(this);
        mEDD.setOnClickListener(this);
        mAdverseEventTextView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view == mBMI) {
            // Switch to BMI activity
            Intent intent = new Intent(MainActivity.this,BmiActivity.class);
            startActivity(intent);
        }

        if (view == mEDD) {
            // Switch to EDD activity
            Intent intent = new Intent(MainActivity.this,EddActivity.class);
            startActivity(intent);
        }

        if (view == mAdverseEventTextView) {
            Intent intent = new Intent(MainActivity.this, AdverseEventListActivity.class);
            startActivity(intent);
        }

    }
}
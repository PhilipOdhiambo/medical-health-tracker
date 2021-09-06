package com.philipowino.medicalhealthtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BmiActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.heightEditText) EditText height;
    @BindView(R.id.weightEditText) EditText weight;
    @BindView(R.id.calculateButton) Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        // Bind View
        ButterKnife.bind(this);
    }

    @Override
    public void onClick(View view) {

    }
}
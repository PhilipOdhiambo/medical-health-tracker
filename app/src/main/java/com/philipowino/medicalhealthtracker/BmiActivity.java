package com.philipowino.medicalhealthtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BmiActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String TAG = MainActivity.class.getSimpleName();
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
        if (view == calculate) {
            Double heightDouble = Double.parseDouble(height.getText().toString());
            Double weightDouble = Double.parseDouble(weight.getText().toString());
            Double bmi =  weightDouble/Math.pow(heightDouble,2);
            Log.d(TAG, "result");
            Log.d(TAG, bmi.toString());
        }

    }
}
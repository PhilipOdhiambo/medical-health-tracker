package com.philipowino.medicalhealthtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.AndroidException;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BmiActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.heightEditText) EditText height;
    @BindView(R.id.weightEditText) EditText weight;
    @BindView(R.id.calculateButton) Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        // Bind View
        ButterKnife.bind(this);

        // set onClick Listener
        calculateButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == calculateButton) {
            try {
                Double heightDouble = Double.parseDouble(height.getText().toString());
                Double weightDouble = Double.parseDouble(weight.getText().toString());
                Double bmi =  weightDouble/Math.pow(heightDouble,2);
                String message;
                if (bmi < 18.5 ) {
                    message = "BMI of " + bmi.toString() + " : Under Weight (see a doctor)";
                } else if (bmi >= 18.5 && bmi <= 24.9 ) {
                    message = "BMI of " + bmi.toString() + " : Healthy Weight (Maintain Your Lifestyle)";
                } else if (bmi >= 25 && bmi <= 29.9 ) {
                    message = "BMI of " + bmi.toString() + " : Overweight (Check Your Lifestyle)";
                } else if (bmi >= 30 && bmi <= 39.9 ) {
                    message = "BMI of " + bmi.toString() + " : Obese (See a doctor)";
                } else {
                    message = "BMI of " + bmi.toString() + "? : Confirm Your Measurements";
                }


            } catch (Exception exception) {
                Toast.makeText(BmiActivity.this,"Empty input!",Toast.LENGTH_LONG).show();
            }
        }

    }
}
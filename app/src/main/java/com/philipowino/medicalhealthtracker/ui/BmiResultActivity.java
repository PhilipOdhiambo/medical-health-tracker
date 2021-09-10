package com.philipowino.medicalhealthtracker.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.philipowino.medicalhealthtracker.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BmiResultActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.bmiTextView) TextView bmiTextView;
    @BindView(R.id.okButton) Button okButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_result);

        // Bind the view
        ButterKnife.bind(this);
        okButton.setOnClickListener(this);

        // Unpack intent extras
        Intent intent = getIntent();
        String weight = intent.getStringExtra("weight");
        String height = intent.getStringExtra("height");
        Double bmi = Double.parseDouble(intent.getStringExtra("bmi"));
        Log.d("log",weight);
        Log.d("log",height);
        Log.d("log",bmi.toString());

        // Create conditional messages
        String message;
        if (bmi < 18.5 && bmi >= 10.5 ) {
            message = "BMI of " + bmi.toString() + " - Under Weight (see a doctor)";
        } else if (bmi >= 18.5 && bmi <= 24.9 ) {
            message = "BMI of " + bmi.toString() + " - Healthy Weight (Maintain Your Lifestyle)";
        } else if (bmi >= 25 && bmi <= 29.9 ) {
            message = "BMI of " + bmi.toString() + " - Overweight (Check Your Lifestyle)";
        } else if (bmi >= 30 && bmi <= 39.9 ) {
            message = "BMI of " + bmi.toString() + " - Obese (See a doctor)";
        } else {
            message = "BMI of " + bmi.toString() + " ? \nConfirm Your Measurements";
        }

        // Send result to view
        String result = String.format("Weight %s kg, height %s m:\n%s",weight,height,message);
        bmiTextView.setText(result);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(BmiResultActivity.this, MainActivity.class);
        startActivity(intent);

    }
}
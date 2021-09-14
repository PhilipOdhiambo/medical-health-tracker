package com.philipowino.medicalhealthtracker.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.philipowino.medicalhealthtracker.R;
import com.philipowino.medicalhealthtracker.databinding.ActivityBmiBinding;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BmiActivity extends AppCompatActivity implements View.OnClickListener {

    // Implement view binding
   private ActivityBmiBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Bind View
        binding = ActivityBmiBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        // Add click listener
        binding.calculateButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (view == binding.calculateButton) {
            Log.d("receive", binding.heightTextInputEditText.getText().toString());
            try {
                Double heightDouble = Double.parseDouble(binding.heightTextInputEditText.getText().toString());
                Double weightDouble = Double.parseDouble(binding.weightEditText.getText().toString());
                Double bmi =  weightDouble/Math.pow(heightDouble,2);

                // Create intent
                Intent intent = new Intent(BmiActivity.this,BmiResultActivity.class);
                intent.putExtra("height", binding.heightTextInputEditText.getText().toString());
                intent.putExtra("weight", binding.weightEditText.getText().toString());
                intent.putExtra("bmi", String.format("%.2f",bmi));
                startActivity(intent);

            } catch (Exception exception) {
                Toast.makeText(BmiActivity.this,"Empty input!",Toast.LENGTH_LONG).show();
            }
        }

    }
}
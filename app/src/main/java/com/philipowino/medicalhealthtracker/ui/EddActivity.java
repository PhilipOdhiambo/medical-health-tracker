package com.philipowino.medicalhealthtracker.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import com.philipowino.medicalhealthtracker.Constants;
import com.philipowino.medicalhealthtracker.R;

public class EddActivity extends AppCompatActivity {
    TextView mtText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edd);
        SharedPreferences sharedPref = getSharedPreferences(Constants.PREFERENCES_LOCATION_KEY, Context.MODE_PRIVATE);
        String value = sharedPref.getString(Constants.PREFERENCES_LOCATION_KEY,"null");
        mtText = findViewById(R.id.resultTv);
        mtText.setText(value);
    }


}
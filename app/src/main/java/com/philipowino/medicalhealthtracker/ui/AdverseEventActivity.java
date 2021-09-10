package com.philipowino.medicalhealthtracker.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.philipowino.medicalhealthtracker.R;
import com.philipowino.medicalhealthtracker.models.DrugAdverseEvent;
import com.philipowino.medicalhealthtracker.models.Result;
import com.philipowino.medicalhealthtracker.network.AdverseEventApi;
import com.philipowino.medicalhealthtracker.network.AdverseEventClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AdverseEventActivity extends AppCompatActivity {
    private static final String TAG = "MyData";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adverse_event);

       // https://api.fda.gov/drug/event.json?search=receivedate:[20040101+TO+20081231]&limit=10
        String search = "receivedate:[20040101+TO+20081231]";
        String limit = "limit=10";

        // Making api request
        AdverseEventApi client = AdverseEventClient.getClient();
        Call<DrugAdverseEvent> call = client.getAdverseEvents(search,limit);
        call.enqueue(new Callback<DrugAdverseEvent>() {
            @Override
            public void onResponse(Call<DrugAdverseEvent> call, Response<DrugAdverseEvent> response) {
                Log.i(TAG, Integer.toString(response.code()));
                if (response.isSuccessful()) {
                   List<Result> results = response.body().getResults();

                }
            }

            @Override
            public void onFailure(Call<DrugAdverseEvent> call, Throwable t) {
                Log.d(TAG,"Error",t);

            }
        });
    }
}
package com.philipowino.medicalhealthtracker.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.philipowino.medicalhealthtracker.R;
import com.philipowino.medicalhealthtracker.models.DrugAdverseEvent;
import com.philipowino.medicalhealthtracker.models.Result;
import com.philipowino.medicalhealthtracker.network.AdverseEventApi;
import com.philipowino.medicalhealthtracker.network.AdverseEventClient;

import java.net.URLEncoder;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AdverseEventActivity extends AppCompatActivity {
    private static final String TAG = "MyData";
    @BindView(R.id.resultTextView) TextView mResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adverse_event);

        //Bind View
        ButterKnife.bind(this);

        // Making api request
        String limit = "5";
        String search = "occurcountry:ke";
        AdverseEventApi client = AdverseEventClient.getClient();
        Call<DrugAdverseEvent> call = client.getAdverseEvents(search,limit);
        call.enqueue(new Callback<DrugAdverseEvent>() {
            @Override
            public void onResponse(Call<DrugAdverseEvent> call, Response<DrugAdverseEvent> response) {
                Log.d("status",String.valueOf(response.code()));
                if (response.isSuccessful()) {
                   List<Result> results = response.body().getResults();
                    for (int i=0; i < results.size(); i ++) {
                        Result result = results.get(i);
                        String country = result.getOccurcountry();
                        mResultTextView.append(country);
                    }

                }
            }

            @Override
            public void onFailure(Call<DrugAdverseEvent> call, Throwable t) {
                Log.d(TAG,"Error",t);

            }
        });
    }
}
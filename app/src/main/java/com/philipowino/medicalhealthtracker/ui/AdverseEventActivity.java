package com.philipowino.medicalhealthtracker.ui;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.philipowino.medicalhealthtracker.R;
import com.philipowino.medicalhealthtracker.models.Drug;
import com.philipowino.medicalhealthtracker.models.DrugAdverseEvent;
import com.philipowino.medicalhealthtracker.models.Result;
import com.philipowino.medicalhealthtracker.network.AdverseEventApi;
import com.philipowino.medicalhealthtracker.network.AdverseEventClient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AdverseEventActivity extends AppCompatActivity {
    private ArrayList<ResultItem> mResultItems = new ArrayList();
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @BindView(R.id.resultTextView) TextView mResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adverse_event);

        //Bind View
        ButterKnife.bind(this);

        // Making api request
        String limit = "6";
        String endpoint ="event.json?search=receivedate:[2004-01-01+TO+2008-12-31]&limit=" + limit;
        AdverseEventApi client = AdverseEventClient.getClient();
        Call<DrugAdverseEvent> call = client.getAdverseEvents(endpoint);

        call.enqueue(new Callback<DrugAdverseEvent>() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onResponse(Call<DrugAdverseEvent> call, Response<DrugAdverseEvent> response) {
                if (response.isSuccessful()) {


                   List<Result> results = response.body().getResults();
                    HashMap<String, Integer> keyVal = new HashMap<>();

                    ArrayList<String> drugArrayList = new ArrayList<>();
                    for (Result result : response.body().getResults()) {
                        for(Drug drug : result.getPatient().getDrug()) {
                            drugArrayList.add(drug.getMedicinalproduct());
                        }
                    }
                    Log.d("work", drugArrayList.toString());

                    HashSet<String> hset = new HashSet<>(drugArrayList);
                    for (String s: hset) {
                        ResultItem resultItem = new ResultItem(s,Collections.frequency(drugArrayList,s),R.drawable.ic_baseline_sick_24);
                        mResultItems.add(resultItem);
                    }



                    //Displays the frequency of each element present in array
                    ArrayList<ResultItem> drugsFrequency = new ArrayList();

                    mResultTextView.append("\n---------------------\n");


                }

                // Initialize my Recycler View
                mRecyclerView = findViewById(R.id.resultRecycleView);
                mRecyclerView.setHasFixedSize(true);
                mLayoutManager = new LinearLayoutManager(AdverseEventActivity.this);
                mAdapter =  new ResultAdapter(mResultItems);

                mRecyclerView.setLayoutManager(mLayoutManager);
                mRecyclerView.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(Call<DrugAdverseEvent> call, Throwable t) {

            }
        });
    }

}
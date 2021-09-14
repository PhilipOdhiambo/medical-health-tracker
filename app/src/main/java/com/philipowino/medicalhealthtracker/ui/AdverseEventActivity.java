package com.philipowino.medicalhealthtracker.ui;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textview.MaterialTextView;
import com.philipowino.medicalhealthtracker.R;
import com.philipowino.medicalhealthtracker.databinding.ActivityAdverseEventBinding;
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


    private ActivityAdverseEventBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAdverseEventBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        // Hide recycleView while data is loading
        binding.resultRecycleView.setVisibility(View.GONE);

        // Making api request
        String limit = "500";
        String endpoint ="event.json?search=receivedate:[2021-04-01+TO+2021-09-13]&limit=" + limit;
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

                    HashSet<String> hset = new HashSet<>(drugArrayList);
                    for (String s: hset) {
                        ResultItem resultItem = new ResultItem(s,Collections.frequency(drugArrayList,s),R.drawable.ic_baseline_sick_24);
                        mResultItems.add(resultItem);
                    }



                    //Displays the frequency of each element present in array
                    ArrayList<ResultItem> drugsFrequency = new ArrayList();

                }

                // Initialize my Recycler View
                mRecyclerView = findViewById(R.id.resultRecycleView);
                mRecyclerView.setHasFixedSize(true);
                mLayoutManager = new LinearLayoutManager(AdverseEventActivity.this);
                mAdapter =  new ResultAdapter(mResultItems);
                mRecyclerView.setLayoutManager(mLayoutManager);

                // Set the recycleView visible and hide progress bar
                binding.resultRecycleView.setVisibility(View.VISIBLE);
                binding.progressBar.setVisibility(View.GONE);
                mRecyclerView.setAdapter(mAdapter);

            }

            @Override
            public void onFailure(Call<DrugAdverseEvent> call, Throwable t) {

            }
        });
    }

}
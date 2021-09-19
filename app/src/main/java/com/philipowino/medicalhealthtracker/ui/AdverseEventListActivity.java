package com.philipowino.medicalhealthtracker.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.philipowino.medicalhealthtracker.R;
import com.philipowino.medicalhealthtracker.databinding.ActivityAdverseEventListBinding;
import com.philipowino.medicalhealthtracker.models.DrugAdverseEvent;
import com.philipowino.medicalhealthtracker.models.count.AdverseCountResult;
import com.philipowino.medicalhealthtracker.models.count.Result;
import com.philipowino.medicalhealthtracker.network.AdverseEventApi;
import com.philipowino.medicalhealthtracker.network.AdverseEventClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AdverseEventListActivity extends AppCompatActivity {
    private List<Result> mResultItems = new ArrayList();
    AdverseCountResult mResult;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    private ActivityAdverseEventListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAdverseEventListBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        // Hide recycleView while data is loading
        binding.resultRecycleView.setVisibility(View.GONE);

        // Making api request
        String limit = "20";
        String endpoint ="event.json?search=receivedate:[2021-04-01+TO+2021-09-13]&count=patient.drug.openfda.generic_name.exact";
        AdverseEventApi client = AdverseEventClient.getClient();
        AdverseEventApi client1 = AdverseEventClient.getClient();
        Call<DrugAdverseEvent> call = client.getAdverseEvents(endpoint);
        Call<AdverseCountResult> call1 = client1.getAdverseCount(endpoint);

//        call.enqueue(new Callback<DrugAdverseEvent>() {
//            @RequiresApi(api = Build.VERSION_CODES.N)
//            @Override
//            public void onResponse(Call<DrugAdverseEvent> call, Response<DrugAdverseEvent> response) {
//                if (response.isSuccessful()) {
//
//                   List<Result> results = response.body().getResults();
//                    HashMap<String, Integer> keyVal = new HashMap<>();
//
//                    ArrayList<String> drugArrayList = new ArrayList<>();
//                    for (Result result : response.body().getResults()) {
//                        for(Drug drug : result.getPatient().getDrug()) {
//                            drugArrayList.add(drug.getMedicinalproduct());
//                        }
//                    }
//
//                    HashSet<String> hset = new HashSet<>(drugArrayList);
//                    for (String s: hset) {
//                        ResultItem resultItem = new ResultItem(s,Collections.frequency(drugArrayList,s),R.drawable.ic_baseline_sick_24);
//                        mResultItems.add(resultItem);
//                    }
//
//
//
//                    //Displays the frequency of each element present in array
//                    ArrayList<ResultItem> drugsFrequency = new ArrayList();
//
//                }
//
//                // Initialize my Recycler View
//                mRecyclerView = findViewById(R.id.resultRecycleView);
//                mRecyclerView.setHasFixedSize(true);
//                mLayoutManager = new LinearLayoutManager(AdverseEventListActivity.this);
//                mAdapter =  new ResultAdapter(mResultItems);
//                mRecyclerView.setLayoutManager(mLayoutManager);
//
//                // Set the recycleView visible and hide progress bar
//                binding.resultRecycleView.setVisibility(View.VISIBLE);
//                binding.progressBar.setVisibility(View.GONE);
//                mRecyclerView.setAdapter(mAdapter);
//
//            }
//
//            @Override
//            public void onFailure(Call<DrugAdverseEvent> call, Throwable t) {
//
//            }
//        });

        call1.enqueue(new Callback<AdverseCountResult>() {
            @Override
            public void onResponse(Call<AdverseCountResult> call, Response<AdverseCountResult> response) {
                if (response.isSuccessful()) {
                    Log.d("CountStatus", String.valueOf(response.code()));
                    mResultItems = response.body().getResults();

                // Initialize my Recycler View
                mRecyclerView = findViewById(R.id.resultRecycleView);
                mRecyclerView.setHasFixedSize(true);
                mLayoutManager = new LinearLayoutManager(AdverseEventListActivity.this);
                mAdapter =  new ResultAdapter(mResultItems);
                mRecyclerView.setLayoutManager(mLayoutManager);

                // Set the recycleView visible and hide progress bar
                binding.resultRecycleView.setVisibility(View.VISIBLE);
                binding.progressBar.setVisibility(View.GONE);
                mRecyclerView.setAdapter(mAdapter);
                }
            }

            @Override
            public void onFailure(Call<AdverseCountResult> call, Throwable t) {

            }
        });
    }

}
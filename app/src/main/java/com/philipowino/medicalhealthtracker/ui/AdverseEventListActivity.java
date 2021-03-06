package com.philipowino.medicalhealthtracker.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;
import com.philipowino.medicalhealthtracker.R;
import com.philipowino.medicalhealthtracker.databinding.ActivityAdverseEventListBinding;
import com.philipowino.medicalhealthtracker.models.DrugAdverseEvent;
import com.philipowino.medicalhealthtracker.models.count.AdverseCountResult;
import com.philipowino.medicalhealthtracker.models.count.Result;
import com.philipowino.medicalhealthtracker.network.AdverseEventApi;
import com.philipowino.medicalhealthtracker.network.AdverseEventClient;
import com.philipowino.medicalhealthtracker.ui.adapters.ResultAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AdverseEventListActivity extends AppCompatActivity {
    private List<Result> mResultItems = new ArrayList();
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

        //binding.resultRecycleView.setVisibility(View.GONE);

//        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(itemTouchHelperCallback);
//        itemTouchHelper.attachToRecyclerView(mRecyclerView);
//
//        new ItemTouchHelper(itemTouchHelperCallback).attachToRecyclerView(mRecyclerView);


        // Making api request
        String endpoint = "event.json?search=receivedate:[2021-04-01+TO+2021-09-13]&count=patient.drug.openfda.generic_name.exact&limit=20";
        AdverseEventApi client = AdverseEventClient.getClient();
        AdverseEventApi client1 = AdverseEventClient.getClient();
        Call<DrugAdverseEvent> call = client.getAdverseEvents(endpoint);
        Call<AdverseCountResult> call1 = client1.getAdverseCount(endpoint);


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
                    mRecyclerView.setLayoutManager(mLayoutManager);
                    mAdapter = new ResultAdapter(mResultItems, getApplicationContext());
                    // Set the recycleView visible and hide progress bar
                    binding.resultRecycleView.setVisibility(View.VISIBLE);
                    mRecyclerView.setAdapter(mAdapter);

                    new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.RIGHT) {
                        @Override
                        public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                            return false;
                        }

                        @Override
                        public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                            Result deletedResult = mResultItems.get(viewHolder.getAdapterPosition());
                            int position = viewHolder.getAdapterPosition();
                            mResultItems.remove(viewHolder.getAdapterPosition());
                            mAdapter.notifyItemRemoved(viewHolder.getAdapterPosition());
                            Snackbar.make(mRecyclerView,deletedResult.getDrugName(), Snackbar.LENGTH_LONG)
                                    .setAction("Undo", new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            mResultItems.add(position,deletedResult);
                                            mAdapter.notifyItemInserted(position);
                                        }
                                    }).show();

                        }
                    }).attachToRecyclerView(mRecyclerView);


                }
            }

            @Override
            public void onFailure(Call<AdverseCountResult> call, Throwable t) {

            }
        });
    }


}
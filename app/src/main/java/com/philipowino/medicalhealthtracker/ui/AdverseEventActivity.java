package com.philipowino.medicalhealthtracker.ui;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
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
import java.util.HashSet;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AdverseEventActivity extends AppCompatActivity {
    private ArrayList mDrugs = new ArrayList();
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
                    Log.d("Result", String.valueOf(response.code()));

                   List<Result> results = response.body().getResults();
                    for (int i=0; i < results.size(); i ++) {

                        // Get a single result
                        Result result = results.get(i);

                        // List of drugs per result
                        List<Drug> drugs = result.getPatient().getDrug();
                        for (int j = 0; j < drugs.size(); j ++) {
                            mDrugs.add(drugs.get(i).getMedicinalproduct());
                        }

                        String country = result.getOccurcountry();
                      //  mResultTextView.append(country);
                    }

                    Log.d("Drugs",mDrugs.toString());
                    HashSet<String> hset = new HashSet<>(mDrugs);
                    mResultTextView.append(hset.toString());

                    //Initialize array
                    //Array fr will store frequencies of element
                    int [] fr = new int [mDrugs.size()];
                    int visited = -1;
                    for(int i = 0; i < mDrugs.size(); i++){
                        int count = 1;
                        for(int j = i+1; j < mDrugs.size(); j++){
                            if(mDrugs.get(i) == mDrugs.get(j)){
                                count++;
                                //To avoid counting same element again
                                fr[j] = visited;
                            }
                        }
                        if(fr[i] != visited)
                            fr[i] = count;
                    }


                    //Displays the frequency of each element present in array
                    ArrayList<ResultItem> drugsFrequency = new ArrayList();
                    for(int i = 0; i < fr.length; i++){
                        if(fr[i] != visited) {
                            mResultTextView.append("\n" + mDrugs.get(i) + "    |    " + fr[i]);
                            ResultItem drugFreq = new ResultItem(mDrugs.get(i).toString(),fr[i], R.drawable.ic_baseline_sick_24);
                            drugsFrequency.add(drugFreq);
                            Collections.sort(drugsFrequency, new Comparator<ResultItem>() {
                                @Override
                                public int compare(ResultItem t, ResultItem t1) {
                                    return Integer.valueOf(t1.getCount()).compareTo(t.getCount());
                                }
                            });
                        }
                    }
                    mResultTextView.append("\n---------------------\n");
                    for (ResultItem drug:drugsFrequency) {
                        mResultTextView.append(drug.getName());
                        mResultTextView.append("   |   ");
                        mResultTextView.append(String.valueOf(drug.getCount()));
                        mResultTextView.append("\n");
                    }

                }

                // Initialize my Recycler View

            }

            @Override
            public void onFailure(Call<DrugAdverseEvent> call, Throwable t) {

            }
        });
    }

}
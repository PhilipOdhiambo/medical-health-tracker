package com.philipowino.medicalhealthtracker.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.philipowino.medicalhealthtracker.R;
import com.philipowino.medicalhealthtracker.databinding.ActivityAdverseEventListBinding;
import com.philipowino.medicalhealthtracker.databinding.FragmentMainBinding;
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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {
    private List<Result> mResultItems = new ArrayList();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    FragmentMainBinding binding;


    // TODO: Rename and change types of parameters


    public MainFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *

     * @return A new instance of fragment MainFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Binding
        binding = FragmentMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        initRecycleView(view);
        apiCall();
        return  view;
    }

    private void initRecycleView( View view) {
        RecyclerView recyclerView =  view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        ResultAdapter adapter = new ResultAdapter(getContext(),mResultItems);
        recyclerView.setAdapter(adapter);

        // Initialize my Recycler View

    }

    private void apiCall() {
        // Making api request
        String endpoint ="event.json?search=receivedate:[2021-04-01+TO+2021-09-13]&count=patient.drug.openfda.generic_name.exact";
        AdverseEventApi client = AdverseEventClient.getClient();
        Call<AdverseCountResult> call = client.getAdverseCount(endpoint);
        call.enqueue(new Callback<AdverseCountResult>() {
            @Override
            public void onResponse(Call<AdverseCountResult> call, Response<AdverseCountResult> response) {
                if (response.isSuccessful()) {
                    mResultItems = response.body().getResults();
                    // Set the recycleView visible and hide progress bar
                    binding.recyclerView.setVisibility(View.VISIBLE);
                    binding.progressBar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onFailure(Call<AdverseCountResult> call, Throwable t) {

            }
        });
    }

//    @Override
//    public void onItemClick(DataModel dataModel) {
//        Fragment fragment = DetailFragment.newInstance(dataModel.getTitle());
//        FragmentTransaction transaction =getActivity().getSupportFragmentManager().beginTransaction();
//        //transaction.replace(R.id.frame_container, fragment,"detail_fragment");
//        transaction.hide(getActivity().getSupportFragmentManager().findFragmentByTag("main_fragment"));
//        transaction.add(R.id.frame_container, fragment);
//        transaction.addToBackStack(null)
//                .commit();
//
//    }
//}
}
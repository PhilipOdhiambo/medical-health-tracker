package com.philipowino.medicalhealthtracker.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.philipowino.medicalhealthtracker.Constants;
import com.philipowino.medicalhealthtracker.R;
import com.philipowino.medicalhealthtracker.models.count.Result;
import com.philipowino.medicalhealthtracker.models.drug_label.DrugDetail;
import com.philipowino.medicalhealthtracker.models.drug_label.LabelResult;
import com.philipowino.medicalhealthtracker.models.firebase.FirebaseDrug;
import com.philipowino.medicalhealthtracker.network.AdverseEventApi;
import com.philipowino.medicalhealthtracker.network.AdverseEventClient;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ResultAdapter extends RecyclerView.Adapter<ResultAdapter.ResultViewHolder> {

    private List<Result> mResultList;
    private Context mContext;


    public ResultAdapter(Context context, List<Result> resultList) {
        // Constructor
        Collections.sort(resultList, new Comparator<Result>() {
            @Override
            public int compare(Result t2, Result t1) {
                return Integer.valueOf(t1.getCount()).compareTo(t2.getCount());
            }
        });
        mResultList = resultList;
        mContext = context;
    }


    @Override
    public int getItemCount() {
        return mResultList.size();
    }

    @NonNull
    @Override
    public ResultViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.result_item, parent,false);
        return  new ResultViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ResultViewHolder holder, int position) {
        Result currentItem = mResultList.get(position);
        holder.mDrugTextView.setText(currentItem.getDrugName());
        holder.mReactionNumbersTextView.setText(String.valueOf(currentItem.getCount()));
    }

     static class ResultViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        // Define viewHolder variables
        private ImageView mImageView;
        private TextView mDrugTextView;
        private TextView mReactionsTextView;
        private TextView mReactionNumbersTextView;
        private Button  mSaveBtn;
        SharedPreferences sp;
        SharedPreferences.Editor spEditor;

         // Constructor
        public ResultViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mDrugTextView = itemView.findViewById(R.id.drugTextView);
            mReactionsTextView = itemView.findViewById(R.id.txtDrugReactionsTextView);
            mReactionNumbersTextView = itemView.findViewById(R.id.numDrugReaactionsTextView);
            mSaveBtn = itemView.findViewById(R.id.saveBtn);
             sp = itemView.getContext().getSharedPreferences(Constants.PREFERENCES_LOCATION_KEY,Context.MODE_PRIVATE);

            itemView.setOnClickListener(this);
            mSaveBtn.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

            DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
            if (view == mSaveBtn) {
                Toast.makeText(view.getContext(), "Save to My Meds",Toast.LENGTH_SHORT).show();
                ref.child(Constants.FIREBASE_CHILD_REACTIONS).push().setValue(mDrugTextView.getText().toString());
                spEditor = sp.edit();
                spEditor.putString(Constants.PREFERENCES_LOCATION_KEY,mDrugTextView.getText().toString())
                        .commit();
                mSaveBtn.setText("Saved");
                mSaveBtn.setAlpha(.3f);
                mSaveBtn.setClickable(false);
                Intent intent = new Intent(view.getContext(),EddActivity.class);
                view.getContext().startActivity(intent);


                String endpoint = "https://api.fda.gov/drug/label.json?search=openfda.generic_name:" + mDrugTextView.getText().toString() + ".exact";
                AdverseEventApi client = AdverseEventClient.getClient();
                Call<DrugDetail> call = client.getDrugLabel(endpoint);
                call.enqueue(new Callback<DrugDetail>() {
                    @Override
                    public void onResponse(Call<DrugDetail> call, Response<DrugDetail> response) {
                        Log.d("Response",String.valueOf(response.code()));
                        if (response.isSuccessful()) {
                            assert response.body() != null;
                            LabelResult labelResult = response.body().getResults().get(0);
                            String labelName = labelResult.getOpenfda().getGenericName().toString();

                            // Get indications
                            List<String> indications = new ArrayList<>();
                            for (int i=0; i < labelResult.getIndicationsAndUsage().size();i++) {
                                indications.add(labelResult.getIndicationsAndUsage().get(i));
                            }

                            // Get warnings
                            List <String> warnings = new ArrayList<>();
                             for (int i=0; i < labelResult.getWarnings().size();i++) {
                                 warnings.add(labelResult.getWarnings().get(i));
                             }



                            FirebaseDrug drug = new FirebaseDrug(mDrugTextView.getText().toString(),
                                    indications.toString(),warnings.toString());

                            DatabaseReference ref  = FirebaseDatabase
                                    .getInstance()
                                    .getReference()
                                    .child(Constants.FIREBASE_CHILD_DRUGS);
                            ref.push().setValue(drug);
                        }
                    }

                    @Override
                    public void onFailure(Call<DrugDetail> call, Throwable t) {

                    }
                });
            }
        }

    }

}

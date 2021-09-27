package com.philipowino.medicalhealthtracker.ui.adapters;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.philipowino.medicalhealthtracker.Constants;
import com.philipowino.medicalhealthtracker.R;
import com.philipowino.medicalhealthtracker.models.count.Result;
import com.philipowino.medicalhealthtracker.models.drug_label.DrugDetail;
import com.philipowino.medicalhealthtracker.models.drug_label.LabelResult;
import com.philipowino.medicalhealthtracker.models.firebase.FirebaseDrug;
import com.philipowino.medicalhealthtracker.network.AdverseEventApi;
import com.philipowino.medicalhealthtracker.network.AdverseEventClient;
import com.philipowino.medicalhealthtracker.ui.DrugDetailActivity;
import com.philipowino.medicalhealthtracker.util.ItemTouchHelperAdapter;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ResultAdapter extends RecyclerView.Adapter<ResultAdapter.ResultViewHolder> implements ItemTouchHelperAdapter {

    private List<Result> mResultList;
    List<FirebaseDrug> drugs = new ArrayList<>();
    DatabaseReference ref;

    private Context mContext;
    ValueEventListener dataListener;



    public ResultAdapter( List<Result> resultList, Context context) {
        // Constructor
        Collections.sort(resultList, new Comparator<Result>() {
            @Override
            public int compare(Result t2, Result t1) {
                return Integer.valueOf(t1.getCount()).compareTo(t2.getCount());
            }
        });

        ref = FirebaseDatabase.getInstance().getReference().child(Constants.FIREBASE_CHILD_DRUGS);
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot data: snapshot.getChildren()) {
                    drugs.add(data.getValue(FirebaseDrug.class));
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

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
        ResultViewHolder viewHolder = new ResultViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ResultViewHolder holder, int position) {
        Result currentItem = mResultList.get(position);
        holder.mDrugTextView.setText(currentItem.getDrugName());
        holder.mReactionNumbersTextView.setText(String.valueOf(currentItem.getCount()));
    }


    public class ResultViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        // Define viewHolder variables
        private ImageView mImageView;
        private TextView mDrugTextView;
        private TextView mReactionsTextView;
        private TextView mReactionNumbersTextView;
        private Button  mSaveBtn;
        private Button mDetailPageButton;
        private Context mContext;

         // Constructor
        public ResultViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
            mContext = itemView.getContext();
            mImageView = itemView.findViewById(R.id.imageView);
            mDrugTextView = itemView.findViewById(R.id.drugTextView);
            mReactionsTextView = itemView.findViewById(R.id.txtDrugReactionsTextView);
            mReactionNumbersTextView = itemView.findViewById(R.id.numDrugReaactionsTextView);
            mSaveBtn = itemView.findViewById(R.id.saveBtn);
            mDetailPageButton = itemView.findViewById(R.id.button_detail_page);
            itemView.setOnClickListener(this);
            mSaveBtn.setOnClickListener(this);
            mDetailPageButton.setOnClickListener(this);

            dataListener = new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    for (DataSnapshot dataSnapshot: snapshot.getChildren()) {
                        drugs.add(dataSnapshot.getValue(FirebaseDrug.class));
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            };
        }

        @Override
        public void onClick(View view) {

            if (view == mSaveBtn) {
                Toast.makeText(view.getContext(), "Save to My Meds",Toast.LENGTH_SHORT).show();
                mSaveBtn.setText("Saved");
                mSaveBtn.setAlpha(.3f);
                mSaveBtn.setClickable(false);

                String endpoint = "https://api.fda.gov/drug/label.json?search=openfda.generic_name:" + mDrugTextView.getText().toString();
                AdverseEventApi client = AdverseEventClient.getClient();
                Call<DrugDetail> call = client.getDrugLabel(endpoint);
                call.enqueue(new Callback<DrugDetail>() {
                    @Override
                    public void onResponse(Call<DrugDetail> call, Response<DrugDetail> response) {
                        if (response.isSuccessful()) {

                            LabelResult labelResult = response.body().getResults().get(0);

                            String labelName = mDrugTextView.getText().toString();

                             String indication;
                             if (labelResult.getPurpose() == null) {
                                 indication = "";
                             } else {
                                 indication = labelResult.getPurpose().toString();
                             }

                             //List<String> warnings = labelResult.getWarnings();
                            String warnings;
                             if (labelResult.getWarnings() == null) {
                                 warnings = "";
                             } else {
                                 warnings = labelResult.getWarnings().toString();
                             }

                            FirebaseDrug drug = new FirebaseDrug(labelName,
                                    indication,warnings);

                            FirebaseDatabase db = FirebaseDatabase.getInstance();
                            DatabaseReference ref = db.getReference().child(Constants.FIREBASE_CHILD_DRUGS);
                            ref.push().setValue(drug);

                        }
                    }

                    @Override
                    public void onFailure(Call<DrugDetail> call, Throwable t) {
                        Toast.makeText(view.getContext(),"item do not exist",Toast.LENGTH_SHORT).show();
                    }
                });
            }

            if (view == mDetailPageButton) {
                int itemPosition = getAdapterPosition();
                Intent intent = new Intent(mContext, DrugDetailActivity.class);
                intent.putExtra("position",itemPosition);
                intent.putExtra(Constants.FIREBASE_CHILD_DRUGS, Parcels.wrap(drugs));
                mContext.startActivity(intent);


            }


        }

    }

    @Override
    public boolean onItemMove(int fromPosition, int toPosition) {
        notifyItemMoved(fromPosition, toPosition);
        return false;
    }

    @Override
    public void onItemDismiss(int position) {
       // getRef(position).removeValue();
    }

}

package com.philipowino.medicalhealthtracker.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.philipowino.medicalhealthtracker.Constants;
import com.philipowino.medicalhealthtracker.R;
import com.philipowino.medicalhealthtracker.models.count.Result;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ResultAdapter extends RecyclerView.Adapter<ResultAdapter.ResultViewHolder> {

    private List<Result> mResultList;
    private Context mContext;


    public ResultAdapter(Context context, List<Result> resultList) {
        Collections.sort(resultList, new Comparator<Result>() {
            @Override
            public int compare(Result t2, Result t1) {
                return Integer.valueOf(t1.getCount()).compareTo(t2.getCount());
            }
        });
        mResultList = resultList;
        mContext = context;

    }

    public static class ResultViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView mImageView;
        public TextView mDrugTextView;
        public TextView mReactionsTextView;
        public TextView mReactionNumbersTextView;
        public Button  mSaveBtn;
        SharedPreferences sp;
        SharedPreferences.Editor spEditor;


        public ResultViewHolder(@NonNull View itemView) {
            super(itemView);
            //ButterKnife.bind(itemView);
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
                Toast.makeText(view.getContext(), mDrugTextView.getText(),Toast.LENGTH_SHORT).show();
                ref.child(Constants.FIREBASE_CHILD_REACTIONS).push().setValue(mDrugTextView.getText().toString());
                SharedPreferences.Editor editor = sp.edit();
                spEditor = sp.edit();
                Boolean state =  spEditor.putString(Constants.PREFERENCES_LOCATION_KEY,mDrugTextView.getText().toString())
                        .commit();
                Toast.makeText(view.getContext(), state.toString(),Toast.LENGTH_SHORT).show();
                mSaveBtn.setText("Saved");
                mSaveBtn.setAlpha(.3f);
                mSaveBtn.setClickable(false);
            }


        }
    }


    @NonNull
    @Override
    public ResultViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.result_item, parent,false);
        ResultViewHolder rvh = new ResultViewHolder(v);

        return  rvh;
    }

    @Override
    public void onBindViewHolder(@NonNull ResultViewHolder holder, int position) {
       Result currentItem = mResultList.get(position);

        //holder.mImageView.setImageResource(currentItem.getImageSource());
        holder.mDrugTextView.setText(currentItem.getDrugName());
       holder.mReactionNumbersTextView.setText(String.valueOf(currentItem.getCount()));

       holder.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

           }
       });
    }

    @Override
    public int getItemCount() {
        return mResultList.size();
    }
}

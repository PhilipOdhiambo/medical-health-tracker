package com.philipowino.medicalhealthtracker.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.philipowino.medicalhealthtracker.R;
import com.philipowino.medicalhealthtracker.models.count.Result;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ResultAdapter extends RecyclerView.Adapter<ResultAdapter.ResultViewHolder> {

    private List<Result> mResultList;

    public static class ResultViewHolder extends RecyclerView.ViewHolder {

        public ImageView mImageView;
        public TextView mDrugTextView;
        public TextView mReactionsTextView;
        public TextView mReactionNumbersTextView;


        public ResultViewHolder(@NonNull View itemView) {
            super(itemView);
            //ButterKnife.bind(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mDrugTextView = itemView.findViewById(R.id.drugTextView);
            mReactionsTextView = itemView.findViewById(R.id.txtDrugReactionsTextView);
            mReactionNumbersTextView = itemView.findViewById(R.id.numDrugReaactionsTextView);
        }
    }

    public ResultAdapter(List<Result> resultList) {

        Collections.sort(resultList, new Comparator<Result>() {
            @Override
            public int compare(Result t2, Result t1) {
                return Integer.valueOf(t1.getCount()).compareTo(t2.getCount());
            }
        });
        mResultList = resultList;
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

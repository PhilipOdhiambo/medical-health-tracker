package com.philipowino.medicalhealthtracker.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.philipowino.medicalhealthtracker.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ResultAdapter extends RecyclerView.Adapter<ResultAdapter.ResultViewHolder> {

    private ArrayList<ResultItem> mResultList;

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

    public ResultAdapter(ArrayList<ResultItem> resultList) {

        Collections.sort(resultList, new Comparator<ResultItem>() {
            @Override
            public int compare(ResultItem t2, ResultItem t1) {
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
       ResultItem currentItem = mResultList.get(position);

        holder.mImageView.setImageResource(currentItem.getImageSource());
        holder.mDrugTextView.setText(currentItem.getName());
       holder.mReactionNumbersTextView.setText(String.valueOf(currentItem.getCount()));


    }

    @Override
    public int getItemCount() {
        return mResultList.size();
    }
}

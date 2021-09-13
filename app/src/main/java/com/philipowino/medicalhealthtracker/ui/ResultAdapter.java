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

import butterknife.BindView;
import butterknife.ButterKnife;

public class ResultAdapter extends RecyclerView.Adapter<ResultAdapter.ResultViewHolder> {

    private ArrayList<ResultItem> mResultList;

    public static class ResultViewHolder extends RecyclerView.ViewHolder {

        public ImageView mImageView;
        public TextView mDrugTextView;
        public TextView mTextDrugReactionsTextView;
        public TextView mNumDrugReactionsTextView;

        public ResultViewHolder(@NonNull View itemView) {
            super(itemView);
            //ButterKnife.bind(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mDrugTextView = itemView.findViewById(R.id.drugTextView);
            mTextDrugReactionsTextView = itemView.findViewById(R.id.txtDrugReactionsTextView);
            mNumDrugReactionsTextView = itemView.findViewById(R.id.numDrugReaactionsTextView);
        }
    }

    public ResultAdapter(ArrayList<ResultItem> resultList) {
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
//        holder.mImageView.setImageResource(currentItem.getImageSource());
//        holder.mDrugTextView.setText(currentItem.getName());
       holder.mDrugTextView.setText(String.valueOf(currentItem.getCount()));

        holder.mTextDrugReactionsTextView.setText(currentItem.getName());

    }

    @Override
    public int getItemCount() {
        return mResultList.size();
    }
}

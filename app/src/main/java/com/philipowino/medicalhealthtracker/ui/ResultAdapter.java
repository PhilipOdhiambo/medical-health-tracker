package com.philipowino.medicalhealthtracker.ui;

import android.content.Context;
import android.content.Intent;
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


        public ResultViewHolder(@NonNull View itemView) {
            super(itemView);
            //ButterKnife.bind(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mDrugTextView = itemView.findViewById(R.id.drugTextView);
            mReactionsTextView = itemView.findViewById(R.id.txtDrugReactionsTextView);
            mReactionNumbersTextView = itemView.findViewById(R.id.numDrugReaactionsTextView);
            mSaveBtn = itemView.findViewById(R.id.saveBtn);
            itemView.setOnClickListener(this);
            mSaveBtn.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Button btn = view.findViewById(R.id.saveBtn);
            if(view == btn) {
                Toast.makeText(btn.getContext(), "Saved",Toast.LENGTH_SHORT).show();
                btn.setText("Saved");
                btn.setAlpha(.5f);
                btn.setClickable(false);
            }
//
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

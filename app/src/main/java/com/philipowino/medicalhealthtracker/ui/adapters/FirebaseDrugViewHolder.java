package com.philipowino.medicalhealthtracker.ui.adapters;

import android.content.Context;
import android.view.View;



public class FirebaseDrugViewHolder implements View.OnClickListener {
    View mView;
    Context mContext;

    public FirebaseDrugViewHolder(View itemView) {
        super();
        mView = itemView;
        mContext = itemView.getContext();
        itemView.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

    }
}

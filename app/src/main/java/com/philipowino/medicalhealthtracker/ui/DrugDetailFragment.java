package com.philipowino.medicalhealthtracker.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.philipowino.medicalhealthtracker.R;
import com.philipowino.medicalhealthtracker.models.firebase.FirebaseDrug;

import org.parceler.Parcels;

import butterknife.BindView;
import butterknife.ButterKnife;


public class DrugDetailFragment extends Fragment {

    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    @BindView(R.id.drugNameTv) TextView mDrugNameTv;
    @BindView(R.id.resultTv) TextView mDrugIndicationTv;
    @BindView(R.id.warningTv) TextView mDrugWarningTv;

    private FirebaseDrug mFirebaseDrug;

    public DrugDetailFragment() {
        // Required empty public constructor
    }

    // New Fragment Instance
    public static DrugDetailFragment newInstance(FirebaseDrug firebaseDrug) {
        DrugDetailFragment fragment = new DrugDetailFragment();
        Bundle args = new Bundle();
        args.putParcelable("drug", Parcels.wrap(firebaseDrug));
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
           mFirebaseDrug = Parcels.unwrap(getArguments().getParcelable("drug"));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_drug_detail, container, false);
        ButterKnife.bind(this,view);
        mDrugNameTv.setText(mFirebaseDrug.getName());
        mDrugIndicationTv.setText(mFirebaseDrug.getUses());
        mDrugWarningTv.setText(mFirebaseDrug.getWarning());
        return view;
    }
}
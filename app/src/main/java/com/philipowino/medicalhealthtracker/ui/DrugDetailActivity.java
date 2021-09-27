package com.philipowino.medicalhealthtracker.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.philipowino.medicalhealthtracker.Constants;
import com.philipowino.medicalhealthtracker.R;
import com.philipowino.medicalhealthtracker.models.firebase.FirebaseDrug;
import com.philipowino.medicalhealthtracker.ui.adapters.DrugPagerAdapter;

import org.parceler.Parcels;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DrugDetailActivity extends AppCompatActivity {
    @BindView(R.id.viewPager) ViewPager mViewPager;
    private DrugPagerAdapter drugPagerAdapter;
    List<FirebaseDrug> mDrugs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drug_detail);
        ButterKnife.bind(this);

        mDrugs = Parcels.unwrap(getIntent().getParcelableExtra(Constants.FIREBASE_CHILD_DRUGS));
        int startingPosition = getIntent().getIntExtra("position",0);
        drugPagerAdapter = new DrugPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT,mDrugs);
        mViewPager.setAdapter(drugPagerAdapter);
        mViewPager.setCurrentItem(startingPosition);
    }


}
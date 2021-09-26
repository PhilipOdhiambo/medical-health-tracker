package com.philipowino.medicalhealthtracker.ui.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.philipowino.medicalhealthtracker.models.firebase.FirebaseDrug;
import com.philipowino.medicalhealthtracker.ui.DrugDetailFragment;

import java.util.List;

public class DrugPagerAdapter extends FragmentPagerAdapter {
    private List<FirebaseDrug> mDrugs;

    public DrugPagerAdapter(FragmentManager fm, int behavior, List<FirebaseDrug> drugs) {
        super(fm,behavior);
        mDrugs = drugs;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return DrugDetailFragment.newInstance(mDrugs.get(position));
    }

    @Override
    public int getCount() {
        return mDrugs.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mDrugs.get(position).getName();
    }
}

package com.yudiasmara2355201568.datapribadiyudiasmara;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    public PagerAdapter(@NonNull FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                return new BioFragment();
            case 1 :
                return new PendidikanFragment();
            case 2 :
                return new PengalamanFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position){
        String title = null;
        if(position == 0){
            title = "BIODATA";
        }else if(position == 1){
            title = "PENDIDIKAN";
        }else{
            title = "PENGALAMAN";
        }
        return title;
    }
}
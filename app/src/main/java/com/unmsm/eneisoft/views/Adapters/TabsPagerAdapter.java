package com.unmsm.eneisoft.views.Adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import com.unmsm.eneisoft.views.Fragments.ConferenciaFragment;
import com.unmsm.eneisoft.views.Fragments.GameJamFragment;
import com.unmsm.eneisoft.views.Fragments.NinjaBattleFragment;

/**
 * Created by manu on 10/10/14.
 */

public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        Log.d("getItem", "items" + index);
        switch (index) {
            case 0:
                return new ConferenciaFragment();
            case 1:
                return new GameJamFragment();
            case 2:
                return new NinjaBattleFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

}

package com.unmsm.eneisoft.views.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.unmsm.eneisoft.R;

/**
 * Created by manu on 10/10/14.
 */
public class GameJamFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle savedInstanceState){
        super.onCreateView(inflater,group,savedInstanceState);
        return inflater.inflate(R.layout.game_jam_fragment,group,false);
    }
}

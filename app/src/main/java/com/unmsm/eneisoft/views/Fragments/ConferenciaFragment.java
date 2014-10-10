package com.unmsm.eneisoft.views.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.unmsm.eneisoft.EneisoftApp;
import com.unmsm.eneisoft.R;
import com.unmsm.eneisoft.controllers.ControllerSpeaker;
import com.unmsm.eneisoft.models.Speaker;
import com.unmsm.eneisoft.views.Adapters.SpeakerAdapter;

import java.util.ArrayList;


/**
 * Created by manu on 10/10/14.
 */
public class ConferenciaFragment extends Fragment{

    private ControllerSpeaker controllerSpeaker = new ControllerSpeaker();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle savedInstanceState){
        super.onCreateView(inflater,group,savedInstanceState);
        return inflater.inflate(R.layout.conference_fragment,group,false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayList<Speaker> data = controllerSpeaker.getSpeakers();
        ListView lv_speakers = (ListView) view.findViewById(R.id.lv_speakers);
        SpeakerAdapter adapter = new SpeakerAdapter(EneisoftApp.getContext(), data);
        lv_speakers.setAdapter(adapter);
    }
}

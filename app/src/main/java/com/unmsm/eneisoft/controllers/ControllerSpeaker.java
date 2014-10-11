package com.unmsm.eneisoft.controllers;

import com.unmsm.eneisoft.R;
import com.unmsm.eneisoft.models.Speaker;

import java.util.ArrayList;

/**
 * Created by manu on 10/10/14.
 */
public class ControllerSpeaker {

    ArrayList<Speaker> data;

    public ControllerSpeaker() {
        this.data  = new ArrayList<Speaker>();
        this.data.add(new Speaker("Jesus Andrade", "Talento mundial AIESEC", R.drawable.speaker1));
        this.data.add(new Speaker("Eysenck Gomez", "Un workflow moderno para crear aplicaciones web modernas.", R.drawable.speaker2));
        this.data.add(new Speaker("Alvaro Pereyra", "¡Cómo ser un desarrollador en una StartUp y no morir en el intento!", R.drawable.speaker3));
        this.data.add(new Speaker("Alfred Kobayashi", "Las top 5 Cosas más importantes para crear un StartUp exitoso.", R.drawable.speaker4));
        this.data.add(new Speaker("Juan Sanchez", "App-ocalipsis: ¡El fin de las aplicaciones móviles!", R.drawable.speaker5));
        this.data.add(new Speaker("Moises Cachay", "Introduccion a la teoria musical con Python..", R.drawable.speaker6));

    }

    public ArrayList<Speaker> getSpeakers(){
        return data;
    }
}

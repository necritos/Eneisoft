package com.unmsm.eneisoft.models;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

import java.io.Serializable;

/**
 * Created by manu on 10/10/14.
 */
public class Speaker implements Serializable {
    private String name, description;

    public Speaker(String name, String description, int resource) {
        this.name = name;
        this.description = description;
        this.resource = resource;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int resource;

}

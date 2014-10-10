package com.unmsm.eneisoft;

import android.app.Application;
import android.content.Context;

/**
 * Created by manu on 10/10/14.
 */
public class EneisoftApp  extends Application {
    static Context context;
    public static Context getContext() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
}

package practice.tmdb.com.tmdb.trial;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "DieselEngine";

    @Inject
    public DieselEngine() {

    }

    @Override
    public void start() {
        Log.i(TAG, "start driving");
    }
}

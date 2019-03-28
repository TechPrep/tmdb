package practice.tmdb.com.tmdb;

import android.util.Log;

import javax.inject.Inject;

import practice.tmdb.com.tmdb.trial.Engine;

public class PetrolEngine implements Engine {
    private static final String TAG = "PetrolEngine";

    @Inject
    public PetrolEngine() {
    }

    @Override
    public void start() {
        Log.i(TAG, "start driving");
    }
}

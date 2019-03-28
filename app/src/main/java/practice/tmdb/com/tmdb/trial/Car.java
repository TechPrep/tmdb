package practice.tmdb.com.tmdb.trial;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    Engine mEngine;
    Wheel mWheel;

    @Inject
    public Car(Engine engine, Wheel wheel) {
        mEngine = engine;
        mWheel = wheel;
    }

    public void drive() {
        mEngine.start();
        Log.i(TAG, "Driving car");
    }
}

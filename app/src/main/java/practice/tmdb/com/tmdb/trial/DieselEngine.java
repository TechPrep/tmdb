package practice.tmdb.com.tmdb.trial;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "DieselEngine";
    int mHorsePower; // Dynamic variable injection

    public DieselEngine(final int horsePower) {
        mHorsePower = horsePower;
    }

    @Override
    public void start() {
        Log.i(TAG, "start driving with horsePower=" + mHorsePower);
    }
}

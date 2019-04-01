package practice.tmdb.com.tmdb.youtube;

import android.util.Log;

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

package practice.tmdb.com.tmdb.youtube;

import javax.inject.Inject;

import practice.tmdb.com.tmdb.youtube.module.Rims;
import practice.tmdb.com.tmdb.youtube.module.Tyres;

public class Wheel {

    Rims mRim;
    Tyres mTyre;

    @Inject
    public Wheel(Rims rim, Tyres tyre) {
        mTyre = tyre;
        mRim = rim;
    }
}

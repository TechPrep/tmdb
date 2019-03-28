package practice.tmdb.com.tmdb.trial;

import javax.inject.Inject;

import practice.tmdb.com.tmdb.trial.module.Rims;
import practice.tmdb.com.tmdb.trial.module.Tyres;

public class Wheel {

    Rims mRim;
    Tyres mTyre;

    @Inject
    public Wheel(Rims rim, Tyres tyre) {
        mTyre = tyre;
        mRim = rim;
    }
}

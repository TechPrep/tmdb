package practice.tmdb.com.tmdb.trial.module;

import dagger.Module;
import dagger.Provides;
import practice.tmdb.com.tmdb.trial.Wheel;

/**
 * If Wheels is outside our applications scope and it can not be updated then
 * use Module keyword of Dagger
 */
@Module
public class WheelModule {

    @Provides
    Rims provideRims() {
        return new Rims();
    }

    @Provides
    Tyres provideTyres() {
        Tyres tyres = new Tyres();
        /**
         * Use Provides keywords when we can not use constructor injection and when we want to inflate something after constructor
         * injection
         */
        tyres.inflate();
        return tyres;
    }

    @Provides
    Wheel provideWHeels(Rims rim, Tyres tyres) {
        return new Wheel(rim, tyres);
    }
}

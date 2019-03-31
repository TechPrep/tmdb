package practice.tmdb.com.tmdb.trial.module;

import dagger.Module;
import dagger.Provides;
import practice.tmdb.com.tmdb.trial.DieselEngine;
import practice.tmdb.com.tmdb.trial.Engine;

@Module
public class DieselEngineModule {
    int horsePower;

    public DieselEngineModule(final int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    Engine providesDieselEngine() {
        return new DieselEngine(horsePower);
    }
}

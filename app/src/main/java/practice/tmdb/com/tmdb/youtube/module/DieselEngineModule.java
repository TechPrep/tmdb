package practice.tmdb.com.tmdb.youtube.module;

import dagger.Module;
import dagger.Provides;
import practice.tmdb.com.tmdb.youtube.DieselEngine;
import practice.tmdb.com.tmdb.youtube.Engine;

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

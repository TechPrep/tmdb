package practice.tmdb.com.tmdb.trial.module;

import dagger.Module;
import dagger.Provides;
import practice.tmdb.com.tmdb.PetrolEngine;
import practice.tmdb.com.tmdb.trial.Engine;

@Module
public class PetrolEngineModule {
    @Provides
    Engine providesPetrolEngine(PetrolEngine engine) {
        return engine;
    }
}

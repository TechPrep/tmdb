package practice.tmdb.com.tmdb.youtube.module;

import dagger.Module;
import dagger.Provides;
import practice.tmdb.com.tmdb.youtube.PetrolEngine;
import practice.tmdb.com.tmdb.youtube.Engine;

@Module
public class PetrolEngineModule {
    @Provides
    Engine providesPetrolEngine(PetrolEngine engine) {
        return engine;
    }
}

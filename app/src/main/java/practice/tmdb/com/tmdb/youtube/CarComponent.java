package practice.tmdb.com.tmdb.youtube;

import dagger.Component;
import practice.tmdb.com.tmdb.ui.activity.LauncherActivity;
import practice.tmdb.com.tmdb.youtube.module.DieselEngineModule;
import practice.tmdb.com.tmdb.youtube.module.WheelModule;

@Component(modules = {WheelModule.class, DieselEngineModule.class})
public interface CarComponent {
    Car getCar();

    void injectVariables(LauncherActivity launcher);
}

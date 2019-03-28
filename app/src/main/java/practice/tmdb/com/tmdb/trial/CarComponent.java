package practice.tmdb.com.tmdb.trial;

import dagger.Component;
import practice.tmdb.com.tmdb.LauncherActivity;
import practice.tmdb.com.tmdb.trial.module.WheelModule;

@Component (modules = WheelModule.class)
public interface CarComponent {
    Car getCar();

    void injectVariables(LauncherActivity launcher);
}

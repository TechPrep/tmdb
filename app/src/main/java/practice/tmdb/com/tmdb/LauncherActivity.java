package practice.tmdb.com.tmdb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import practice.tmdb.com.tmdb.trial.Car;
import practice.tmdb.com.tmdb.trial.CarComponent;
import practice.tmdb.com.tmdb.trial.DaggerCarComponent;
import practice.tmdb.com.tmdb.trial.module.DieselEngineModule;

public class LauncherActivity extends AppCompatActivity {

    @Inject
    Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        // Instead of create, builder method is created as some of the module constructors require parameters and are not default.
        CarComponent carComp = DaggerCarComponent.builder().
                dieselEngineModule(new DieselEngineModule(100)).build();
        carComp.injectVariables(this);
        carComp.getCar().drive();
    }
}

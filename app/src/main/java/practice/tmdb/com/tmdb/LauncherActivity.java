package practice.tmdb.com.tmdb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import practice.tmdb.com.tmdb.trial.CarComponent;
import practice.tmdb.com.tmdb.trial.DaggerCarComponent;

public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        CarComponent carComp = DaggerCarComponent.create();
        carComp.getCar().drive();
    }
}

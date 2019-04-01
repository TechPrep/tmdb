package practice.tmdb.com.tmdb.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

import javax.inject.Inject;

import practice.tmdb.com.tmdb.R;
import practice.tmdb.com.tmdb.data.ContactData;
import practice.tmdb.com.tmdb.data.ContactsDataAdapter;
import practice.tmdb.com.tmdb.youtube.Car;
import practice.tmdb.com.tmdb.youtube.CarComponent;
import practice.tmdb.com.tmdb.youtube.DaggerCarComponent;
import practice.tmdb.com.tmdb.youtube.module.DieselEngineModule;

public class LauncherActivity extends AppCompatActivity {

    @Inject
    Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        RecyclerView listView = (RecyclerView) findViewById(R.id.recycle_list);
        listView.setAdapter(new ContactsDataAdapter(ContactData.createContactsList(20)));
        listView.setLayoutManager(new LinearLayoutManager(this));
    }

    void testDagger() {
        // Instead of create, builder method is created as some of the module constructors require parameters and are not default.
        CarComponent carComp = DaggerCarComponent.builder().
                dieselEngineModule(new DieselEngineModule(100)).build();
        carComp.injectVariables(this);
        carComp.getCar().drive();
    }
}

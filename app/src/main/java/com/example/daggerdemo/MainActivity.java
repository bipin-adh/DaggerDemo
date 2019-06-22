package com.example.daggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.daggerdemo.component.DaggerVehicleComponent;
import com.example.daggerdemo.component.VehicleComponent;
import com.example.daggerdemo.model.Vehicle;
import com.example.daggerdemo.module.VehicleModule;

public class MainActivity extends AppCompatActivity {

    Vehicle vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * --------------STEP 5 :(Using @Component Interface to Obtain Objects)-------------
         *
         * Now that you have every connection ready,
         * you have to obtain an instance of this interface and invoke its methods to obtain the object you need.
         *  I'm going to implement it in the onCreate method in the MainActivity as follows:
         */

        /**
         * When you try to create a new object of the interface with the @Component annotation,
         * you have to do it using the prefix Dagger<NameOfTheComponentInterface>,
         * in this case DaggerVehicleComponent
         */
        VehicleComponent component = DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();

        vehicle = component.provideVehicle();

        Toast.makeText(this, String.valueOf(vehicle.getSpeed()), Toast.LENGTH_SHORT).show();
    }
}
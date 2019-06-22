package com.example.daggerdemo.module;

import com.example.daggerdemo.model.Motor;
import com.example.daggerdemo.model.Vehicle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


/** ---------------------STEP 2------------------
 *
 * Creating a class with the @Module annotation...
 * This class is going to provide the objects you will need with its dependencies satisfied.
 */
@Module
public class VehicleModule {

    /**
     * As specified, Vehicle needs Motor class to work properly. Hence , we need to create 2 providers.
     * One for Motor(the independent model) and another one for Vehicle(indicating its dependency)
     *
     * Don;t forget that every provider(or method) must have the @Provides annotation and
     * the class must have the @Module annotation.
     *
     * The @Singleton annotation indicates that there will be only one instance o the object.
     */
    @Provides
    @Singleton
    Motor provideMotor() {
        return new Motor();
    }

    @Provides
    @Singleton
    Vehicle provideVehicle() {
        return new Vehicle(new Motor());
    }
}

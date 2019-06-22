package com.example.daggerdemo.component;

import com.example.daggerdemo.model.Vehicle;
import com.example.daggerdemo.module.VehicleModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * ------------STEP 4 (Connecting @Modules With @Inject)------------
 * <p>
 * The connection between the provider of dependencies, @Module,
 * and the classes requesting them through @Inject is made using @Component, which is an interface:
 */

/**
 * Next to the @Component annotation,
 * you have to specify which modules are going to be used—in this case I use VehicleModule,
 * which we created earlier.
 * If you need to use more modules, then just add them using a comma as a separator.
 */

@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {

    Vehicle provideVehicle();

    /**
     * Within the interface, add methods for every object you need and
     * it will automatically give you one with all its dependencies satisfied.
     * In this case, I only need a Vehicle object, which is why there is only one method.
     */
}

package com.example.daggerdemo.model;

import javax.inject.Inject;


/**
 * --------------STEP 1 (without @Inject)-------------
 * <p>
 * Dependent on Motor class
 */
public class Vehicle {

    private Motor motor;

    /**
     * ----------------STEP 3(add @Inject)----------------
     * <p>
     * REQUEST DEPENDENCIES IN DEPENDENT OBJECTS.
     * Now that you have the providers for your different models, you need yo request them.
     * Just as Vehicle needs Motor, you have to add the @Inject annotation in the Vehicle constructor as follows.
     */
    @Inject
    public Vehicle(Motor motor) {
        this.motor = motor;
    }

    public void increaseSpeed(int value) {
        motor.accelerate(value);
    }

    public void stop() {
        motor.brake();
    }

    public int getSpeed() {
        return motor.getRpm();
    }
    /**
     * You can use the @Inject annotation to request dependencies in the constructor, fields, or methods.
     * In this case, I'm keeping the injection in the constructor.
     */
}

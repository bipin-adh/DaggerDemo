package com.example.daggerdemo.model;

/**
 *
 * ----------------STEP 1----------------
 *
 * Independent class */
public class Motor {

    private int rpm;

    // constructor
    public Motor() {
        this.rpm = 0;
    }

    // get the current value of rpm
    public int getRpm() {
        return rpm;
    }

    // modify the value of rpm
    public void accelerate(int value) {
        rpm = rpm + value;
    }

    //modify the value of rpm
    public void brake() {
        rpm = 0;
    }
}

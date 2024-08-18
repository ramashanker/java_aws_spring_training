package com.rama.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Red", "Toyota Camry", 2020);

        // Using the object's methods
        myCar.startEngine();    // Outputs: Engine started!
        myCar.displayInfo();    // Outputs the car details
    }
}

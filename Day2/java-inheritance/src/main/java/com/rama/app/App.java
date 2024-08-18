package com.rama.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", 2020, "Camry");

        // Accessing methods from both the superclass and the subclass
        myCar.startEngine();      // Outputs: Car engine started!
        myCar.displayCarInfo();   // Outputs the brand, year, and model
    }
}

package com.rama.app;

// Subclass
public class Car extends Vehicle {
    // Additional field specific to Car
    String model;

    // Constructor
    public Car(String brand, int year, String model) {
        // Calling the constructor of the superclass (Vehicle)
        super(brand, year);
        this.model = model;
    }

    // Overriding a method from the superclass
    @Override
    public void startEngine() {
        System.out.println("Car engine started!");
    }

    // Additional method specific to Car
    public void displayCarInfo() {
        // Calling a method from the superclass
        super.displayInfo();
        System.out.println("Model: " + model);
    }
}


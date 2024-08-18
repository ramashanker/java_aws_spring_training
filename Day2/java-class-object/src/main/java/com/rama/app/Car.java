package com.rama.app;

public class Car {
    // Fields (Attributes)
    String color;
    String model;
    int year;

    // Constructor
    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // Method (Behavior)
    public void startEngine() {
        System.out.println("Engine started!");
    }

    public void displayInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Manufacture Year: " + year);
    }
}

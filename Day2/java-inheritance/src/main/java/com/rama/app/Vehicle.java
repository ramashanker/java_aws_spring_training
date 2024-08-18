package com.rama.app;

// Superclass
public class Vehicle {
    // Fields
    String brand;
    int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method
    public void startEngine() {
        System.out.println("Vehicle engine started!");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}


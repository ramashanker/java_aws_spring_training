package com.rama.app;

//In this example, ElectricCar inherits from Car, which in turn inherits from Vehicle.
public class ElectricCar extends Car {
    int batteryCapacity;

    public ElectricCar(String brand, int year, String model, int batteryCapacity) {
        super(brand, year, model);
        this.batteryCapacity = batteryCapacity;
    }

    public void chargeBattery() {
        System.out.println("Battery is charging...");
    }
}

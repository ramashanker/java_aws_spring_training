package com.rama.app;

public class ConstantsExample {
    // Class-level constant
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        // Local constant
        final int DAYS_IN_WEEK = 7;

        // Attempting to change a constant will cause a compile-time error
        // PI = 3.14; // Uncommenting this line will cause an error

        // Displaying the values
        System.out.println("PI: " + PI);
        System.out.println("Days in a week: " + DAYS_IN_WEEK);
    }
}

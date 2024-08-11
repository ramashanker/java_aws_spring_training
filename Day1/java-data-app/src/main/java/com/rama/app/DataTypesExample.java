package com.rama.app;

public class DataTypesExample {
    public static void main(String[] args) {
        // Integer data types
        byte b = 100;
        short s = 30000;
        int i = 123456;
        long l = 123456789L; // 'L' is optional but recommended

        // Floating-point data types
        float f = 3.14f; // 'f' is required for float literals
        double d = 3.141592653589793;

        // Character data type
        char c = 'A';

        // Boolean data type
        boolean isJavaFun = true;

        // Displaying the values
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + isJavaFun);
    }
}
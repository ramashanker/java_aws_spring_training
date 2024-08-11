package com.rama.app;

public class JavaOperators {
    public static void main( String[] args )
    {
        /*
        1. Arithmetic Operators
        These operators are used for performing basic mathematical operations.

        + (Addition): Adds two operands.
        - (Subtraction): Subtracts the second operand from the first.
        * (Multiplication): Multiplies two operands.
        / (Division): Divides the numerator by the denominator.
        % (Modulus): Returns the remainder from division.
         */

        int a = 10, b = 5;
        int sum = a + b;  // 15
        int difference = a - b;  // 5
        int product = a * b;  // 50
        int quotient = a / b;  // 2
        int remainder = a % b;  // 0
        System.out.println( "sum:"+sum );
        System.out.println( "difference:"+difference );
        System.out.println( "product:" +product);
        System.out.println( "quotient:"+quotient );
        System.out.println( "remainder:"+remainder );
    }
}

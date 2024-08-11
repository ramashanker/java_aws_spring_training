package com.rama.app;

public class AssignmentOperators {
    public static void main(String[] args) {
        /*
            Assignment Operators
                These operators are used to assign values to variables.

                = (Assignment): Assigns the right-hand operand to the left-hand operand.
                +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>= (Compound assignments): Performs the operation and assigns the result to the left operand.
         */
        int a = 10;
        a += 5;  // a = a + 5 -> a = 15
        a *= 2;  // a = a * 2 -> a = 30

        /*
        Ternary Operator
            The ternary operator is a shorthand for if-else statements. It takes three operands and is used to evaluate boolean expressions.

            ? : (Ternary): Returns one of two values depending on the condition.
         */
        int c = 10, d = 20;
        int min = (c < d) ? c : d;  // 10

        /*
        Instanceof Operator
            The instanceof operator is used to check if an object is an instance of a specific class or subclass.
         */
        String str = "Hello";
        boolean result = str instanceof String;  // true

        /*
        Type Cast Operators
            These operators are used to convert one data type into another.
         */

        int i = 10;
        double j = (double) i;  // 10.0

        /*
         Expressions in Java
            An expression in Java is a combination of variables, operators, and method calls that are evaluated to produce a result. The result can be a value, a boolean, or an object reference.
         */
        int x = 10 + 20;  // 10 + 20 is an arithmetic expression
        boolean y = (x > 10) && (x < 30);  // (x > 10) && (x < 30) is a logical expression
        String z = "Hello " + "World";  // "Hello " + "World" is a string concatenation expression
    }
}

package com.rama.app;

public class JavaLogicalOperators {
    public static void main(String[] args) {
        /*
         Logical Operators
            These operators are used to combine multiple boolean expressions.

            && (Logical AND): Returns true if both operands are true.
            || (Logical OR): Returns true if either operand is true.
            ! (Logical NOT): Inverts the boolean value
         */
        boolean a = true, b = false;
        boolean c = a && b;  // false
        boolean d = a || b;  // true
        boolean e = !a;  // false
    }
}

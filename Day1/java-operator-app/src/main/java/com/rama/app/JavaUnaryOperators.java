package com.rama.app;

public class JavaUnaryOperators {
    public static void main( String[] args )
    {
         /*
        2. Unary Operators
        These operators require only one operand and perform various operations like incrementing, decrementing, negating, etc.

        + (Unary plus): Indicates a positive value (often optional).
        - (Unary minus): Negates an expression.
        ++ (Increment): Increases the value of the operand by 1.
        -- (Decrement): Decreases the value of the operand by 1.
        ! (Logical complement): Inverts the value of a boolean expression.
         */

        int a = 10;
        int b = -a;  // -10
        int c = ++a;  // 11
        int d = a--;  // 11, then a becomes 10
        boolean e = !true;  // false
    }
}

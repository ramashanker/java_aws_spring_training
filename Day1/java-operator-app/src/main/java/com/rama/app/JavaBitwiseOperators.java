package com.rama.app;

public class JavaBitwiseOperators {
    public static void main(String[] args) {
        /*
        Bitwise Operators
            These operators perform bit-level operations on integer types.

            & (Bitwise AND)
            | (Bitwise OR)
            ^ (Bitwise XOR)
            ~ (Bitwise NOT)
            << (Left shift)
            >> (Right shift)
            >>> (Unsigned right shift)
         */
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary
        int c = a & b;  // 0001 in binary, 1 in decimal
        int d = a | b;  // 0111 in binary, 7 in decimal
        int e = a ^ b;  // 0110 in binary, 6 in decimal
        int f = ~a;  // 1010 in binary (in 32-bit: 11111111111111111111111111111010)
        int g = a << 1;  // 1010 in binary, 10 in decimal
        int h = a >> 1;  // 0010 in binary, 2 in decimal
    }
}

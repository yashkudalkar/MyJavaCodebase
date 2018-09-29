package com.company.java.operators;

public class PrimitiveDivision {

    public static void main(String[] args) {
        int i = 2;
        double d = 0;
        System.out.println("double division " + (d / 0));
        /*
        * In case of double/float division, the output is Infinity, the basic reason behind that it implements the floating point arithmetic algorithm which specifies a special values like “Not a number” OR “infinity” for “divided by zero cases” as per IEEE 754 standards.
        * (positive double/0) = Infinity
        * (negative double/0) = -Infinity
        * (0.0/0.0) = NaN
        *
        * In case of integer division, it throws ArithmeticException.
        * */
        System.out.println("int division : " + (i / 0));

    }
}

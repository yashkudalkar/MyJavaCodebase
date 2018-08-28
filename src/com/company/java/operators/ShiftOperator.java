package com.company.java.operators;

public class ShiftOperator {

    public static void main(String[] args) {
        System.out.println("hello...");

        int a=-8;
        int b=8;
        int c=2;
        /*
         *b = 8 binary 00001000
         *c = 2 binary 00000010
         *& operation  00000000 = 00
         *
         * */
        System.out.println("And operation a&c :"+(b&c)); //:10
        /*
         *b = 8 binary  00001000
         *c = 2 binary  00000010
         *or operation  00001010 = 10
         *
         * */
        System.out.println("OR operation a|c :"+(b|c));
        /*
         * right shift operator >>
         * is a signed shift
         * a=-8 111111000 >> 11110100
         *
         * */
        System.out.println("R shift operation a>>c :"+(a>>1));//-4
        /*
         * right shift operator zero fill >>>
         * is a unsigned operator
         *
         * a=-8 111111000 >>> 011111100
         *
         * */
        System.out.println("R shift (zero fill) operation a>>>c :"+(a>>>1)); //2147483644
        /*
         * there is no left shift zero fill
         * */
        System.out.println("L shift operation a>>c :"+(a<<1)); //-16

    }
}

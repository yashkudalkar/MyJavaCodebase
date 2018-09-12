package com.company.java.patterns;

public class Triangles {

    public static void rightAngleTriangle() {
        System.out.print("-- Right-Angle Triangle --\n");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
        System.out.print("---------------------\n");
    }

    public static void rightAngleTriangleWithOneZero() {
        System.out.print("-- Right-Angle Triangle WithOneZero --\n");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print(" 1");
                else
                    System.out.print(" 0");
            }
            System.out.println("");
        }
        System.out.print("---------------------\n");
    }


    public static void main(String[] args) {
        rightAngleTriangle();
        rightAngleTriangleWithOneZero();
    }
}

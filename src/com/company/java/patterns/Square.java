package com.company.java.patterns;

public class Square {
    public static void squareOfStars() {
        System.out.print("-- Square Of Stars --\n");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
        System.out.print("---------------------\n");
    }

    public static void boxOfStars() {
        System.out.print("-- Box Of Stars --\n");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 4) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.print("---------------------\n");
    }

    public static void boxOfNumber() {
        System.out.print("-- Box Of numbers --\n");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(" " + j);
            }
            System.out.println("");
        }
        System.out.print("---------------------\n");
    }

    public static void boxOfAscendingNumber() {
        System.out.print("-- Box Of Ascending numbers --\n");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(" " + i);
            }
            System.out.println("");
        }
        System.out.print("---------------------\n");
    }

    public static void squareOfShiftingNumber() {
        System.out.print("-- Square Of Shifting Number --\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 4; j++) {
                int k = i + j;
                if (k > 4) {
                    System.out.print(" " + (k - 4));
                } else {
                    System.out.print(" " + k);
                }
            }
            System.out.println("");
        }
        System.out.print("---------------------\n");
    }


    public static void main(String[] args) {
        squareOfStars();
        boxOfStars();
        boxOfNumber();
        boxOfAscendingNumber();
        squareOfShiftingNumber();
    }
}

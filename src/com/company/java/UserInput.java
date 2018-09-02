package com.company.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInput {

    public static void main(String[] args)throws Exception {

        int num1;
        double num2;

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter frist num");
        num1= Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter secound num");
        num2=Double.parseDouble(bufferedReader.readLine());

        System.out.print("Result ="+(num1+num2));
    }
}

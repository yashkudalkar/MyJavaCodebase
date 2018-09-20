package com.company.java;

public class Main {

    public static void main(String[] args) {
	// parent child constrictor example :- parent contructor is called every when child object is created but parent object
        //   is not created
        System.out.println("Hello world!!!");
        Parent parent=new Parent();
        Child child=new Child();
    }
}

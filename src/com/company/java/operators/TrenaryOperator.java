package com.company.java.operators;

public class TrenaryOperator {

    public static void main(String[] args) {

        char a='A';
        char e='F';//F
        char r;
        System.out.println((int)e+" - "+(int)a);

        r=e-a==5 ? (char) 82: 'r';

        Object obj1;
        Object obj2;

        if (e - a == 5) obj1 = new Integer(10);
        else obj1 = new Double(10);

        obj2=e-a==5?new Integer(10) :new Double(10);


        System.out.println(r);
        System.out.println(obj1);
        System.out.println(obj2);
}

}

package com.company.java.java8.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@FunctionalInterface
interface StringFormater {
    public String format(String s1, String s2);
}

public class main {

    public static void main(String[] args) {

        String s1="Lambda";
        String s2="expression";
        StringFormater stringFormater=(s3,s4)-> {return s3+" "+s4;};
        System.out.println(""+stringFormater.format(s1,s2));


        List<Employee> el=new ArrayList<>();
        el.add(new Employee(2,"adarsh"));
        el.add(new Employee(3,"shri"));
        el.add(new Employee(1,"yash"));

        System.out.println(el);
        Collections.sort(el,(e1,e2)->((e1.getId())<e2.getId())?-1:(e1.getId()>e1.getId())?1:0);
        System.out.println(el);
    }
}

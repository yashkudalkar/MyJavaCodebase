package com.company.java.java8.examples;

public class Employee {
    private Integer id;
    private String name;

    Employee(Integer id,String name){
        this.id=id;
        this.name=name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id+" : "+name;
    }
}

package com.java.homework_10.demo2;

public class Employee {
    public String name;
    public int age;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

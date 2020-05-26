package com.java.homework_10.demo2;
import java.util.Arrays;
import java.util.Comparator;
public class Client {
    public static void main(String[] args) {
        Employee[] e = new Employee[10];

        for (int i = 0; i < 10; i++) {
            e[i] = new Employee("雇员",10-i);
        }

        System.out.println("排序前");
        for (int i = 0; i < 10; i++) {
            System.out.println(e[i].toString());
        }

        Arrays.sort(e, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.age - o2.age;
            }
        });

        System.out.println("排序后");
        for (int i = 0; i < 10; i++) {
            System.out.println(e[i].toString());
        }
    }
}

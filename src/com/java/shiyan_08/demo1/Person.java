package com.java.shiyan_08.demo1;

public class Person {
    private String name;
    private boolean sexMale;
    private int age;

    public Person(){
        this.name = null;
        this.sexMale = false;
        this.age = -1;
    }
    public Person(String name, boolean sex, int age) {
        this.name = name;
        this.sexMale = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSexMale(boolean b) {
        return sexMale;
    }

    public void setSexMale(boolean sex) {
        this.sexMale = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sexMale +
                ", age=" + age +
                '}';
    }
}

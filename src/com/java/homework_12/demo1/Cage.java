package com.java.homework_12.demo1;

import java.util.HashSet;
public class Cage<T extends Animal> extends HashSet{
    public boolean addIN(T t) {
        return super.add(t);
    }
}

package com.java.shiyan_09.demo2;

public class TestMain {
    public static void main(String[] args) {

        Flying[] test = new Flying[]{new Airliner(),new Fighter(),new J20()};
        for (Flying f:test
             ) {
            TestMain.verify(f);
        }
    }

    public static void verify(Flying f){
        f.fly();
    }

}

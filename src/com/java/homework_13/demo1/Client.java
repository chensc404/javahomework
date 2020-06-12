package com.java.homework_13.demo1;
import java.io.IOException;

public class Client {
    public static void main(String[] args) throws Exception {
        methodB();
    }

    static void methodB() throws Exception {
        methodA();
    }

    static void methodA() throws Exception {
        throw new IOException();
    }
}

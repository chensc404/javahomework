package com.java.shiyan_13.demo3;

import java.io.*;
public class ObjOut {
    public static void main(String[] args) throws IOException {
        Dog d1 = new Dog("wangwang",8);
        Dog d2 = new Dog("zaizai",3);
        FileOutputStream fout = new FileOutputStream("Dog.cir");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fout);
        objectOutputStream.writeObject(d1);
        objectOutputStream.writeObject(d2);
        objectOutputStream.close();
        objectOutputStream = null;
    }
}

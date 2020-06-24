package com.java.shiyan_13.demo3;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class ObjIn {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fin = new FileInputStream("Dog.cir");
        ObjectInputStream objectInputStream = new ObjectInputStream(fin);
        Dog d1 = (Dog)objectInputStream.readObject();
        System.out.println(d1.toString());
        Dog d2 = (Dog)objectInputStream.readObject();
        System.out.println(d2.toString());
        objectInputStream.close();
        objectInputStream = null;
    }
}

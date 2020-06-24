package com.java.homework_14.demo1;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        try (
                DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data.dat")));

        ){
            for(int i=0;i<10;i++) {
                int x = (int)(Math.random()*(2000-1000))+1000;
                dos.writeInt(x);
                System.out.println(x);
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println("------down------");
        try(
                DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("data.dat")));
        ){
            while(dis.available()>0) {
                int x = dis.readInt();
                System.out.println(x);
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}

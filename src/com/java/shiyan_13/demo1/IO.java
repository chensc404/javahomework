package com.java.shiyan_13.demo1;
import java.io.IOException;
import java.util.Arrays;
public class IO {
    public static void main(String[] args) {
        try{
            int sum = 0;
            byte buf [ ] = new byte[255];
            System.out.println("请输入: ");
            System.in.read(buf, 0, 255);
            System.out.println("您的输入如下:");
            System.out.println(Arrays.toString(buf));
            for (int i = 0; buf[i] != 10 && buf[i] != 0; i++) {
                sum = sum*10;
                sum += buf[i]-48;
            }
            System.out.println(sum);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

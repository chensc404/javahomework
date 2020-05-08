package com.java.homework_08;
import java.util.Random;
public class Client {
    public static void main(String[] args) {
        Shape[] sh = new Shape[20];

        //随机产生Rectangle
        for (int i = 0; i < 10; i++) {
            sh[i] = new Rectangle(getName(),getDecimal(),getDecimal());
        }
        //随机产生Square
        for (int i = 10; i< sh.length; i++){
            sh[i] = new Square(getName(),getDecimal());
        }

        double areaSum = 0.0;
        double perimeterSum = 0.0;

        //遍历sh数组，计算总面积和周长
        for (Shape t:sh
             ) {
            areaSum += t.getArea();
            perimeterSum += t.getPerimeter();
            System.out.println(t.toString());
        }

        System.out.println("areaSum:  " + areaSum);
        System.out.println("perimeterSum:  " + perimeterSum);

    }


    //随机产生一个double类型的两位小数
    public static double getDecimal(){
        Random r = new Random();
        int t = (int)((r.nextInt(50) + 1 + r.nextDouble()) * 100);
        return t / 100.0;
    }

    //随机产生一个英文名字
    public static String getName(){
        String origin = "1234567890abcdefghijklmnopqrstuvwxyz";
        Random r = new Random();
        String name = "";
        for (int i = 0; i < 5; i++) {
            name += origin.charAt((r.nextInt(35) + 1));
        }
        return name;
    }
}

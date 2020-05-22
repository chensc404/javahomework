package com.java.shiyan_09.demo1;

public class Add {
    static class complx{
        int real;
        int unreal;

        public complx(int real, int unreal) {
            this.real = real;
            this.unreal = unreal;
        }
    }
    public static double add(double a,double b){
        return a + b;
    }

    public static int add(int a,int b){
        return a + b;
    }

    public static String add(String a,String b){
        return a + b;
    }

    public static String add(complx a,complx b){
        return (a.real + b.real) + "i" + ((a.unreal + b.unreal) > 0?("+" + (a.unreal + b.unreal)):(a.unreal + b.unreal));
    }

    public static void main(String[] args) {
        System.out.println(Add.add(10,22));
        System.out.println(Add.add(3.14,9.8));
        System.out.println(Add.add("I love"," java"));
        System.out.println(Add.add(new complx(3,9),new complx(-1,-10)));
    }
}

package com.java.shiyan_11.demo1;

public class Point<T> {
    private T x;
    private T y;

    public static void main(String[] args) {
        Point<Double> pd = new Point<>(1.1,2.2);
        Point<Integer> pi = new Point<>(3,5);
        System.out.println("before:");
        System.out.println(pd.toString());
        System.out.println(pi.toString());

        System.out.println("after:");
        pd.translate(9.2,23.3);
        pi.translate(9,10);
        System.out.println(pd.toString());
        System.out.println(pi.toString());
    }

    public void translate(T x, T y){
        this.x = x;
        this.y = y;
    }

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

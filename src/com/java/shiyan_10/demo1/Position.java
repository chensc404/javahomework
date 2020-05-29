package com.java.shiyan_10.demo1;

public class Position implements Comparable<Position>{
    private int x;
    private int y;

    @Override
    public int compareTo(Position o) {
        return (int) (Math.sqrt(this.x*this.x + this.y*this.y) - Math.sqrt(o.x*o.x + o.y*o.y));
    }
}

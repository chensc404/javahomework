package com.java.homework_09.demo2;

public class Main {
    public static void main(String[] args) {
        for (TrafficLight t:TrafficLight.values()
             ) {
            System.out.println(t.ordinal() + "___" + t.name());
        }

        System.out.println();
        for (TrafficLight t:TrafficLight.values()
             ) {
            switch (t){
                case RED:
                    System.out.println("红灯停，不许动");
                    break;
                case GREEN:
                    System.out.println("绿灯行，给我跑起来");
                    break;
                case YELLOW:
                    System.out.println("黄灯等，注意准备");
                    break;
                default:
                    throw new RuntimeException("出怪事情了");
            }
        }
    }
}

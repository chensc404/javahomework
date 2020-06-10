package com.java.homework_12.demo2;

import java.util.HashMap;
import java.util.Map;
public class Client {
    public static void main(String[] args) {
        String origin = "hello,how are you?hello,world.The world is beautiful.";
        String[] splitData = origin.split("[?, .]");
        System.out.println("origin data:\n" + origin + "\n");
        System.out.println("split data:");
        for (String t:splitData) {
            System.out.print(t + " | ");
        }
        System.out.println();
        System.out.println();


        //填入k-v
        Map<String,Integer> wordMap = new HashMap<>();
        for (String t:splitData) {
            if(wordMap.containsKey(t))
                wordMap.put(t, wordMap.get(t) + 1);
            else
                wordMap.put(t, 1);
        }

        //打印k-v
        int count = 0;
        for (String k:wordMap.keySet()
             ) {
            System.out.println(k + ":" + wordMap.get(k));
            count++;
        }
        System.out.println("There are "+ count +" words");
    }
}

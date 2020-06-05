package com.java.shiyan_11.demo2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Client {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1,2,3,4,5);

        System.out.println("正向遍历");
        for (Iterator<Integer> it = arr.iterator(); it.hasNext(); ){
            System.out.print(it.next() + " ");
        }

        System.out.println();
        System.out.println("反向遍历");
        for (ListIterator<Integer> lit = arr.listIterator(arr.size()); lit.hasPrevious();){
            System.out.print(lit.previous() + " ");
        }
    }
}

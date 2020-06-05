package com.java.shiyan_11.demo3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Client {
    public static void main(String[] args) {
        Map<String,String> addressList = new HashMap<String, String>();
        addressList.put("警察","110");
        addressList.put("消防","119");
        addressList.put("急救","120");
        addressList.put("消协","12315");
        addressList.put("移动","10086");
        for (Map.Entry<String, String> entry : addressList.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
        Scanner in = new Scanner(System.in);
        System.out.println("你要查询谁的电话号码？");
        String n = in.nextLine();
        System.out.println(n + "电话号码是：" + addressList.get(n));
    }
}

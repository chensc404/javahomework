package com.java.homework_06;
import java.util.Scanner;
public class Demo02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入密文：");
		String origin = in.nextLine();
		char[] str = origin.toCharArray();
		for (int i = 0; i < str.length; i++) {
			if (str[i] >= 'a' && str[i] <= 'z' || str[i] >= 'A' && str[i] <= 'Z'){
				if (str[i] == 'a'|| str[i] == 'A'){
					str[i] = (char)(str[i] - 1 + 26);
				}else {
					str[i] = (char)(str[i] - 1);
				}
			}
		}
		System.out.println("明文为：");
		System.out.println(String.valueOf(str));
	}
}


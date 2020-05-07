package com.java.shiyan_07;

public class Search {
	public static void main(String[] args) {
		String str = "ababaaabbbabcabc";
		int flag = str.indexOf("abc");
		while(flag != -1){
			System.out.println(flag);
			flag = str.indexOf("abc",flag + 1);
		}
	}
}

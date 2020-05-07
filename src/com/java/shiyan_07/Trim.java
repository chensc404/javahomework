package com.java.shiyan_07;

public class Trim {
	public static void main(String[] args) {
		String origin = "     da3123123     ";
		String after = origin.trim();
		System.out.println("原来的字符串 |" + origin + "|");
		System.out.println("去掉空格后 |" + after + "|");
	}
}

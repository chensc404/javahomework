package com.java.shiyan_07;

import java.util.Arrays;

public class Split {
	public static void main(String[] args) {
		String origin = "one,two,three,four";
		String[] after = origin.split(",");
		System.out.println("原来的字符串 " + origin);
		System.out.println("分割后的字符串数组：" + Arrays.toString(after));
	}
}

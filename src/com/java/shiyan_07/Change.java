package com.java.shiyan_07;

public class Change {
	public static void main(String[] args) {
		int inum = 100;
		double dnum = 3.14;
		//int\double---->String
		System.out.println("------使用\"\" + int------");
		String a = "" + inum;
		String b = "" + dnum;
		System.out.println("a = " + a + " 为String？ " + (a instanceof String));
		System.out.println("b = " + b + " 为String？ " + (b instanceof String));
		System.out.println();

		System.out.println("--使用String.valueOf()--");
		String c = String.valueOf(inum);
		String d = String.valueOf(dnum);
		System.out.println("c = " + c + " 为String？ " + (c instanceof String));
		System.out.println("d = " + d + " 为String？ " + (d instanceof String));
		System.out.println();

		System.out.println("--使用包装类.toString()--");
		String e = Integer.toString(inum);
		String f = Double.toString(dnum);
		System.out.println("e = " + e + " 为String？ " + (e instanceof String));
		System.out.println("f = " + f + " 为String？ " + (f instanceof String));

		//String---->int\double
		String istr = "100";
		String dstr = "3.14";
		int ia = Integer.parseInt(istr);
		double da = Double.parseDouble(dstr);
	}
}

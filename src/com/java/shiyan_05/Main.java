package com.java.shiyan_05;
public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(3.15);
		double c = circle.getR()*2*Circle.Pi;
		double s = Circle.Pi*circle.getR()*circle.getR();
		System.out.println("半径为" + circle.getR() + "的圆\n周长为：" + c + "\n面积为：" + s);
	}
}


//	public static void main(String[] args) {
//		/*调用默认无参构造方法创建r1对象*/
//		Rectangle r1 = new Rectangle();
//
//		/*调用自定义有参构造方法创建r2对象*/
//		Rectangle r2 = new Rectangle(11,22);
//
//		/*调用setter给r1属性赋值*/
//		r1.setLength(12);
//		r1.setWidith(44);
//
//		/*调用getter打印r2的属性*/
//		System.out.println("width:" + r2.getWidith() + " length:" + r2.getLength() +
//							" area:" + r2.getArea() + " Perimeter:" + r2.getPerimeter());
//		System.out.println();
//		/*利用toString方法打印r1和r2的信息*/
//		System.out.println(r1.toString());
//		System.out.println(r2.toString());
//	}
//	public static void main(String[] args) {
//		/*调用无参构造方法创建对象s1*/
//		Student s1 = new Student();
//
//		/*调用有参构造方法创建对象s2*/
//		Student s2 = new Student("Jack",true,10);
//
//		/*调用setter给s1属性赋值*/
//		s1.setName("Lily");
//		s1.setMan(false);
//		s1.setAge(11);
//
//		/*调用静态方法getFlag静态属性*/
//		System.out.println("Flag= " + Student.getFlag());
//
//		/*调用getter查看s2的属性*/
//		System.out.println("name=" + s2.getName() +
//							" stuNum=" + s2.getStuNum() +
//							" isMan=" + s2.isMan() +
//							" age=" + s2.getAge());
//
//		/*调用toString方法打印s1、s2的信息*/
//		System.out.println(s1.toString());
//		System.out.println(s2.toString());
//	}

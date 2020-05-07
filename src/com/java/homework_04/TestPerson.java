package com.java.homework_04;
public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge(45);
		p1.setName("张三");
		p1.speak();
		p1.setName("李四");
		System.out.println(p1.getName() + "今年：" + p1.getAge() + "岁");
	}
}

package com.java.homework_04;
public class Person {
	private String name;
	private int age;

	public  void speak() {
		System.out.println("Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}');
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

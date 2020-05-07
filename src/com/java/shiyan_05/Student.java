package com.java.shiyan_05;
public class Student {
	private static int count;  //方便递增生成学号
	private String name;
	private String stuNum;
	private boolean man;
	private int age;
	private static String Flag;

	/*初始化Flag*/
	static {
		count = 0;
		Flag = "少先队员";      //将static初始化为少先队员
	}

	@Override
	public  String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", stuNum=" + stuNum +
				", man=" + man +
				", age=" + age +
				", Flag=" + Flag +
				'}';
	}

	/*构造方法*/
	public Student(){
		this.stuNum = String.format("%06d",++count);
	}
	public Student(String name, boolean man, int age) {
		this.stuNum = String.format("%06d",++count);
		this.name = name;
		this.man = man;
		this.age = age;
	}

	/*setter、getter*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStuNum() {
		return stuNum;
	}

	public boolean isMan() {
		return man;
	}
	public void setMan(boolean man) {
		this.man = man;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static String getFlag() {
		return Flag;
	}
}

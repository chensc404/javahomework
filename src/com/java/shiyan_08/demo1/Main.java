package com.java.shiyan_08.demo1;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(10);
        p.setName("小明");
        p.setSexMale(true);
        System.out.println(p.toString());

        Person p1 = new Person("小王",true,14);
        System.out.println(p1.toString());



        Teacher t = new Teacher();
        t.setJobTitle("教授");
        t.setDept("教务处");
        t.setName("刘老师");
        t.setAge(30);
        t.setSexMale(false);
        System.out.println(t.toString());

        Teacher t1 = new Teacher("王老师",true,29,"副教授","学生处");
        System.out.println(t1.toString());



        Student s = new Student();
        s.setName("小红");
        s.setAge(13);
        s.setSexMale(false);
        s.setEnterYear(2019);
        s.setSchoolId(001);
        s.setProfession("计算机科学与技术");
        System.out.println(s.toString());

        Student s1 = new Student("小刚",true,22,002,2019,"化学师范");
        System.out.println(s1.toString());
    }
}

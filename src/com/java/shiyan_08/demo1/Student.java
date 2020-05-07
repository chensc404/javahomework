package com.java.shiyan_08.demo1;

public class Student extends Person{
    private int schoolId;
    private int enterYear;
    private String profession;

    public Student() {
        super();
        this.schoolId = -1;
        this.enterYear = -1;
        this.profession = null;
    }

    public Student(String name, boolean sexMale, int age, int schoolId, int enterYear, String profession) {
        super(name, sexMale, age);
        this.schoolId = schoolId;
        this.enterYear = enterYear;
        this.profession = profession;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public int getEnterYear() {
        return enterYear;
    }

    public void setEnterYear(int enterYear) {
        this.enterYear = enterYear;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                ", schoolId=" + schoolId +
                ", enterYear='" + enterYear + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}

package com.java.shiyan_08.demo1;

public class Teacher extends Person{
    private String jobTitle;
    private String dept;

    public Teacher() {
        super();
        this.jobTitle = null;
        this.dept = null;
    }

    public Teacher(String name, boolean sexMale, int age, String jobTitle, String dept) {
        super(name, sexMale, age);
        this.jobTitle = jobTitle;
        this.dept = dept;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                super.toString() +
                ", jobTitle='" + jobTitle + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}

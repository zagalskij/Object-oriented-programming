package ru.gb.api.homework3;

public class Student {
    private String name;
    private int studentId;
    private int age;
    private String major;
    private String email;
    private double gpa;
    private String address;

    public Student(String name, int studentId, int age, String major, String email, double gpa, String address) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
        this.major = major;
        this.email = email;
        this.gpa = gpa;
        this.address = address;
    }
}

package ru.gb.api.homework5.data;

public class Student extends User {
    private Integer id;

    public Student(String name, String lastName, String dateOfBirth, Integer id){
        super(name, lastName, dateOfBirth);
        this.id = id;
    }
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
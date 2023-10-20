package ru.gb.api.homework5.data;

public class Teacher extends User {
    private String discipline;

    public Teacher(String name, String lastName, String dateOfBirth, String discipline) {
        super(name, lastName, dateOfBirth);
        this.discipline = discipline;
    }
    public String toString() {
        return "Teacher{" +
                "discipline='" + discipline + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
    // геттеры и сеттеры для discipline
}
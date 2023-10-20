package ru.gb.api.homework5.data;

public abstract class User {
    protected String name;
    protected String lastName;
    protected String dateOfBirth;
    protected User(){}

    public User(String name, String lastName, String dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    // геттеры и сеттеры для полей
}

    // геттеры и сеттеры для id


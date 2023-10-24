package ru.gb.api.homeWork6;

class Student implements User {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
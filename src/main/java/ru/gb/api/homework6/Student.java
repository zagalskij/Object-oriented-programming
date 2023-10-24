package ru.gb.api.homework6;

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
package ru.gb.api.homeWork6;

import java.util.List;

// Класс, представляющий группу студентов
class StudentGroup<T extends User> {
    private String nameGroup;
    private List<T> group;

    public StudentGroup(String nameGroup, List<T> group) {
        this.nameGroup = nameGroup;
        this.group = group;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public List<T> getGroup() {
        return group;
    }

    public void addStudent(T user) {
        group.add(user);
    }

    public void removeStudent(T user) {
        group.remove(user);
    }
}
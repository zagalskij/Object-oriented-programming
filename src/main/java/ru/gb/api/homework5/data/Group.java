package ru.gb.api.homework5.data;

import java.util.List;

public class Group {
    private List<Student> studentsList;
    private Teacher teacher;
    private Integer id;

    public Group(List<Student> studentsList, Teacher teacher, Integer id) {
        this.studentsList = studentsList;
        this.teacher = teacher;
        this.id = id;
    }

    public void addStudent(Student student) {
        studentsList.add(student);
    }

    public Integer getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Group{" +
                "studentsList=" + studentsList +
                ", teacher=" + teacher +
                ", id=" + id +
                '}';
    }
    // Остальные геттеры и сеттеры, методы для работы с группой и студентами
}
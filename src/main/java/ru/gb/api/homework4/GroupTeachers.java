package ru.gb.api.homework4;

import java.util.ArrayList;
import java.util.List;

public class GroupTeachers {
    private List<Teacher> teachers = new ArrayList<>();
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
}

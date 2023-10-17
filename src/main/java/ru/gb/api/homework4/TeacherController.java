package ru.gb.api.homework4;

import java.util.List;

public class TeacherController {
    private TeacherService service;



    public void createTeacher(String name, String surname, String patronymic, int age, String object,GroupTeachers groupTeachers) {
        Teacher teacher = new Teacher(name,surname,patronymic,age,object);
        groupTeachers.addTeacher(teacher);
        TeacherView.setTeachersGroups(groupTeachers);
    }
    public void showTheListTeacher(GroupTeachers teachers){
      TeacherView.showTheListTeacher();
        }
    }



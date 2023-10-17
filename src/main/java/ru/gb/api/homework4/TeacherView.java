package ru.gb.api.homework4;

import java.util.List;
import java.util.Scanner;


public class TeacherView {
    static private GroupTeachers teachersGroups;




    public static void setTeachersGroups(GroupTeachers teachersGroups) {
        TeacherView.teachersGroups = teachersGroups;
    }


    public static void showTheListTeacher() {
        for (Teacher teacher: teachersGroups.getTeachers()
             ) {
            System.out.println(teacher);
        }
        }

    }


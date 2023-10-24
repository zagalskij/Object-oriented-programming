package ru.gb.api.homeWork6;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        ArrayList<User> list1 = new ArrayList<>();
        StudentGroup<User> group1 = new StudentGroup("Group1", list1);

        User student1 = new Student("George Washington");
        User student2 = new Student("James Bond");
        User student3 = new Student("John Dow");

        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);

        UserComparator<User> userComparator = new UserComparator<>();
        TreeSet<User> sortedGroup = new TreeSet<>(userComparator);
        sortedGroup.addAll(group1.getGroup());

        for (User user : sortedGroup) {
            System.out.println(user.getName());
        }

    }
}

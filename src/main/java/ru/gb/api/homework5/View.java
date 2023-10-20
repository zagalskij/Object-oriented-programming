package ru.gb.api.homework5;

import ru.gb.api.homework5.Controller;
import ru.gb.api.homework5.data.Group;

public class View {
    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void createGroup(Group group) {
        controller.addGroup(group);
    }

    public void createStudent(Integer groupId, String name, String lastName, String dateOfBirth, Integer id) {
        controller.addStudent(groupId, name, lastName, dateOfBirth, id);
    }

    public void printInfo() {
        System.out.println(controller);
    }
}
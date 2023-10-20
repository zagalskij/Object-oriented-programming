package ru.gb.api.homework5;

import ru.gb.api.homework5.data.Group;
import ru.gb.api.homework5.data.Student;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Group> groups = new ArrayList<>();

    public void addGroup(Group group) {
        groups.add(group);
    }

    public void addStudent(Integer groupId, String name, String lastName, String dateOfBirth, Integer id) {
        Group group = getGroupById(groupId);
        if (group != null) {
            Student student = new Student(name, lastName, dateOfBirth, id);
            group.addStudent(student);
        } else {
            System.out.println("Такой группы нет");
        }
    }

    public Group getGroupById(Integer id) {
        for (Group group : groups) {
            if (group.getId().equals(id)) {
                return group;
            }
        }
        return null;
    }

    public List<Group> getGroups() {
        return groups;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Controller:\n");
        for (Group group : groups) {
            result.append(group.toString()).append("\n");
        }
        return result.toString();
    }
    // Остальные методы для работы с группами и студентами
}






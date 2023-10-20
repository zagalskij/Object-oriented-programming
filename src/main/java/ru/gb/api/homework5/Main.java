package ru.gb.api.homework5;

import ru.gb.api.homework5.data.Group;
import ru.gb.api.homework5.data.Student;
import ru.gb.api.homework5.data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        View view = new View(controller);

        // Создаем студентов и преподавателя
        Student student1 = new Student("Артем", "Артемов", "08.10.2007", 1);
        Student student2 = new Student("Игорь", "Артемов", "08.10.2007", 2);
        Teacher teacher = new Teacher("Иван",  "Иванов", "08.10.1977", "Математика");

        // Создаем группу и добавляем студентов
        Group group = new Group(new ArrayList<>(List.of(student1, student2)), teacher, 10);

        // Добавляем группу через контроллер
        controller.addGroup(group);

        // Добавляем еще одного студента
        view.createStudent(10, "Василий", "Артемов", "08.10.2007", 3);

        // Выводим информацию через представление
        view.printInfo();
        // Создание объектов и работа с контроллером и представлением
    }}
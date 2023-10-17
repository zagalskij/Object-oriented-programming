package ru.gb.api.homework4;

public class Main {
    public static void main(String[] args) {
        TeacherController controller = new TeacherController();
        GroupTeachers group1 = new GroupTeachers();
        controller.createTeacher("!","Zagalskiy","Anatolievich",27,"Informatics",group1);
        controller.createTeacher("P","Zagalskiy","Anatolievich",27,"Informatics",group1);
        TeacherView.showTheListTeacher();
        TeacherService service = new TeacherService();
        System.out.println(service.isValidTeacher(group1.getTeachers().get(0)));


    }

}

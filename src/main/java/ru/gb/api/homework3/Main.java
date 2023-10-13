package ru.gb.api.homework3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Anatoliy", 1, 19, "information technology",
                "zaghalskij@mail.ru", 5, "123 Main Street\n" + "Cityville, State 12345\n" + "United States");
        Student student2 = new Student("Andrey", 2, 18, "information technology",
                "john.doe@example.com", 4, "456 Elm Avenue\n" + "Townsville, State 54321\n" + "United Kingdom");
        Student student3 = new Student("Vladimir", 3, 20, "Biology",
                "sportsfan123@example.com", 4, "Maple Avenue");
         Student student4 = new Student("Artem", 4, 20, "Сhemistry",
                "sportsfan123@example.com", 4, "Maple Avenue");
         Student student5 = new Student("Nikita", 5, 20, "Сhemistry",
                "sportsfan123@example.com", 4, "Maple Avenue");
        List<Student> listStudent1;
        listStudent1 = new ArrayList<>(){{add(student1);add(student2);}};
        List<Student> listStudent2=  new ArrayList<>();
        listStudent2.add(student3);
        List<Student> listStudent3;
        listStudent3 = new ArrayList<>(){{add(student4);add(student5);}};
        Group group1 = new Group(1488,"nformation technology",listStudent1);
        Group group2 = new Group(1489,"Biology",listStudent2);
        Group group3 = new Group(1490,"",listStudent3);
        List<Group> listStream1;
        listStream1 = new ArrayList<>(){{add(group1);add(group2);}};
        List<Group> listStream2 = new ArrayList<>();
        listStream2.add(group3);
        Stream stream1 = new Stream("first stream",listStream1);
        Stream stream2 = new Stream("second stream",listStream2);
        StreamIterator iterator = new StreamIterator(stream2);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }




    }
}

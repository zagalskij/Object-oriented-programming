package ru.gb.api.lesson5.task2;

import java.util.Map;
import java.util.Scanner;

public class ContactView {
    Scanner scanner = new Scanner(System.in);
    public  Integer getValue(String title) {
        System.out.printf("%s", title);
        return Integer.parseInt(scanner.nextLine());
}
public  String getString(String title) {
        System.out.printf("%s", title);
        return scanner.nextLine();
}

public void print(String data, String title){
    System.out.printf("%s %d", title, data);
}

}

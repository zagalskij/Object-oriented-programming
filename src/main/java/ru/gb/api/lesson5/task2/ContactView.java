package ru.gb.api.lesson5.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ContactView {
    Scanner scanner = new Scanner(System.in);

    public Integer getValue(String title) {
        System.out.printf("%s", title);
        return Integer.parseInt(scanner.nextLine());
    }

    public String getString(String title) {
        System.out.printf("%s", title);
        return scanner.nextLine();
    }

    public void print(String data, String title) {
        System.out.printf("%s %d", title, data);
    }



        public <K, V > void printHashMap (Map < K, V > map){
            for (Map.Entry<K, V> entry : map.entrySet()) {
                System.out.print("Key: " + entry.getKey() + ", Value: ");
                    String[] values = (String[]) entry.getValue();
                    for (String value : values) {
                        System.out.print(value + " ");
                    }
                    System.out.println(); // Переход на новую строку после вывода всех элементов массива
            }
        }
    }
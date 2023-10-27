package ru.gb.api.homework7;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public int getValue(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }

    // print(f'{title} = {data}')
    public void print(double data, String title) {
        System.out.printf("%s %f\n", title, data);
    }
}

package ru.gb.api.lesson3.task2;

import java.util.HashMap;
import java.util.Map;

public class ContactModel {
    int id=0;
    private Map<Integer, String[]> phoneBook = new HashMap<>();

    String name;
    String surname;
    String patronymic;
    String phoneNumber;

    public ContactModel(String name, String surname, String patronymic, String phoneNumber) {
        String[] contactInfo = {this.name = name, this.patronymic = patronymic, this.phoneNumber = phoneNumber};
        id++;
        phoneBook.put(id,contactInfo);
    }

    public ContactModel() {
    }


}

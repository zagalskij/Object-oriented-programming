package ru.gb.api.lesson5.task2;

import java.util.HashMap;
import java.util.Map;

public class ContactModel {
    int id=0;
    public Map<Integer, String[]> phoneBook = new HashMap<>();

    String name;
    String surname;
    String patronymic;
    String phoneNumber;
    private boolean f = true;

    public Map<Integer, String[]> getPhoneBook() {
        return phoneBook;
    }

    public ContactModel(String name, String surname, String patronymic, String phoneNumber) {
        String[] contactInfo = {this.name = name, this.patronymic = patronymic, this.phoneNumber = phoneNumber};
        id++;
        phoneBook.put(id,contactInfo);
    }

    public boolean isF() {
        return f;
    }
    public boolean offF(){
        return f=false;
    }
    public ContactModel() {
    }
    public void addContact(String name, String surname, String patronymic, String phoneNumber){
        String[] contactInfo = {this.name = name, this.surname =surname, this.patronymic = patronymic, this.phoneNumber = phoneNumber};
        id++;
        phoneBook.put(id,contactInfo);
    }
    public void removeContact(int id) {
        phoneBook.remove(id);
    }
    public  void updateContact(int id,String name, String surname, String patronymic, String phoneNumber){
        String[] contactInfo = {this.name = name, this.surname =surname, this.patronymic = patronymic, this.phoneNumber = phoneNumber};
        phoneBook.put(id,contactInfo);
    }
}

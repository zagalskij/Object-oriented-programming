package ru.gb.api.lesson5.task2;

public class Main {
    public static void main(String[] args) {
ContactPresenter p = new ContactPresenter(new ContactView(), new ContactModel("Vladimir","Ivanov","Anatolievich","+79995188910"));
p.buttinClick();
    }
}

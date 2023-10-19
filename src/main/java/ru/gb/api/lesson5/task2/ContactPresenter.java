package ru.gb.api.lesson5.task2;

public class ContactPresenter {
    ContactView view;
    ContactModel model;

    public ContactPresenter(ContactView view, ContactModel model) {
        this.view = view;
        this.model = model;
    }

    public void buttinClick() {

        switch (view.getValue("Select a task:'\n'" +
                "1 - View all contacts'\n'" +
                "2 - Add contact'\n'" +
                "3 - Delete contact'\n'" +
                "4 - Update contact'\n'" +
                "5 - Program shutdown")) {
            case 1: {

    }
}

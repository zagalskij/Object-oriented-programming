package ru.gb.api.lesson5.task2;

import java.util.Map;

public class ContactPresenter {
    ContactView view;
    ContactModel model;

    public ContactPresenter(ContactView view, ContactModel model) {
        this.view = view;
        this.model = model;
    }

    public void buttinClick() {
        while (model.isF()) {
            switch (view.getValue("""
                    Select a task:
                    1 - View all contacts
                    2 - Add contact
                    3 - Delete contact
                    4 - Update contact
                    5 - Program shutdown
                    """)) {
                case 1:
                    view.printHashMap(model.getPhoneBook());
                    break;
                case 2:
                    model.addContact(view.getString("Enter the name: "),
                            view.getString("Enter the surname: "),
                            view.getString("Enter the patronymic: "),
                            view.getString("Enter the phone number: "));
                break;
                case 3:
                    model.removeContact(view.getValue("Enter the id"));
                    break;
                case 4:
                    model.updateContact(view.getValue("Enter the id"),
                            view.getString("Enter the name: "),
                            view.getString("Enter the surname: "),
                            view.getString("Enter the patronymic: "),
                            view.getString("Enter the phone number: "));
                    break;
                case 5:  System.out.println("Shutting down the application");
                    model.offF();
                    break;
            }
        }
    }
}

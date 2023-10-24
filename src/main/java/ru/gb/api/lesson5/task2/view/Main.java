package ru.gb.api.lesson5.task2.view;


import ru.gb.api.lesson5.task2.controller.HotDrinksVendingMachine;
import ru.gb.api.lesson5.task2.model.Coffee;
import ru.gb.api.lesson5.task2.model.HotDrink;

public class Main {
    public static void main(String[] args) {
        HotDrink coffee1 = new Coffee("Cappuccino", 71, 250, 160);
        HotDrink coffee2 = new Coffee("Latte", 71, 250, 180);

        HotDrinksVendingMachine machine1 = new HotDrinksVendingMachine();
        HotDrinksVendingMachine machine2 = new HotDrinksVendingMachine();
        machine1.addHotDrink(coffee1);
        machine1.addHotDrink(coffee2);
        machine1.getInfo();

        HotDrink foundProduct = machine1.findProduct("Cappuccino", 250, 71);
        if (foundProduct != null) {
            System.out.println("Product found: " + foundProduct);
        } else {
            System.out.println("Product not found");
        }
    }
}
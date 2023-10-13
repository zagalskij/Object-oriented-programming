package ru.gb.api.homework1;

public class Main {
    public static void main(String[] args) {
        HotDrink coffee1 = new Coffee("Cappuccino",71,250,160);
        HotDrink coffee2 = new Coffee("Latte",71,250,180);
  
        HotDrinksVendingMachine machine1 = new HotDrinksVendingMachine();
        HotDrinksVendingMachine machine2 = new HotDrinksVendingMachine();
        machine1.addHotDrink(coffee1);
        machine1.addHotDrink(coffee2);
        machine1.getInfo();
        machine1.getProduct("Cappuccino",250,71);


    }

}

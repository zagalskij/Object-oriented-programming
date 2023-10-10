package ru.gb.api.homework2;

public class Main {
    public static void main(String[] args) {
        Human name = new Human();
        Human name2 = new Human();
        name.setName("Aleksandr");
        name2.setName("Aleksandr2");
        Market pyaterochka = new Market();
        pyaterochka.acceptToMarket(name);
        pyaterochka.takeInQueue(name);
        pyaterochka.acceptToMarket(name2);
        pyaterochka.takeInQueue(name2);
       pyaterochka.takeOrders();
       pyaterochka.giveOrders();
        System.out.println(pyaterochka);
    }
}

package ru.gb.api.homework5.controller;



import ru.gb.api.lesson5.task2.model.Coffee;
import ru.gb.api.lesson5.task2.model.HotDrink;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine {
    private List<HotDrink> hotDrinkList = new ArrayList<>();

    public void addHotDrink(HotDrink hotDrink) {
        hotDrinkList.add(hotDrink);
    }

    public void getInfo() {
        for (HotDrink element : hotDrinkList)
            System.out.println(element);
    }

    public HotDrink findProduct(String name, int volume, int temperature) {
        for (HotDrink drink : hotDrinkList) {
            if (drink instanceof Coffee) {
                Coffee coffee = (Coffee) drink;
                if (coffee.getName().equals(name) && drink.getVolume() == volume && coffee.getTemperature() == temperature) {
                    return coffee;
                }
            }
        }
        return null;
    }
}
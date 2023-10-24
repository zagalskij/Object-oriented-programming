package ru.gb.api.homework1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements  VendingMachine {
    private List<HotDrink> hotDrinkList = new ArrayList<>();
    public void addHotDrink(HotDrink hotDrink) {
        hotDrinkList.add(hotDrink);
    }
    public void getInfo(){
    for (HotDrink element : hotDrinkList)
        System.out.println(element);
    }
    @Override
    public void getProduct(String name, int volume, int temperature) {
        for (HotDrink drink : hotDrinkList) {
            if (drink instanceof Coffee) {
                Coffee coffee = (Coffee) drink;
                if (coffee.getName().equals(name) && drink.getVolume() == volume && coffee.getTemperature()== temperature){
                    System.out.println("Product found: "+drink);
                     return;
            }}
        }
        System.out.println("Product not found");
    }
}

package ru.gb.api.homework2;

public class Human extends Actor {
    @Override
    public void setMakeOrder() {
        isMakeOrder = true;

    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;

    }

    @Override
    public String toString() {
        return getName() + ": Заказ принят " + isMakeOrder + " Заказ выдан " + isTakeOrder + " ";
    }
}

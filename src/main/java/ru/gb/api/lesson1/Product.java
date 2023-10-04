package ru.gb.api.lesson1;

public abstract class Product {
    public String name;
    public int cost;

    public String getName() {
        return name;
    }
    //
//    public Product(String name, int cost) {
//        this.name = name;
//        this.cost = cost;
//    }
//
    public int getCost() {
        return cost;
    }

//    @Override
//    public String toString() {
//        return "Product {" + name +
//                " cost = " + cost +
//                '}';
//    }

}



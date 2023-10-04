package ru.gb.api.lesson1;

public class PieceOfColbasa extends Product{

    int mass;
    String type;

    public String getType() {
        return type;
    }

    public int getmass() {
        return mass;
    }

    public PieceOfColbasa(int mass, int cost, String type) {
        this.type = type;
        this.name = "pieceOfColbasa";
        this.cost = cost;
        this.mass = mass;
    }

//    public int getCost() {
//        return cost;
//    }

    @Override
    public String toString() {
        return "Product {" + name +
                " mass = " + mass +
                " cost = " + cost +
                " type: " + type +
                '}';
    }

}
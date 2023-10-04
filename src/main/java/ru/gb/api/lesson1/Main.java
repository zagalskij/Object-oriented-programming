package ru.gb.api.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PieceOfColbasa pieceOfColbasa = new PieceOfColbasa(1,20,"вареная");
        BottleOfCola bottleOfCola = new BottleOfCola(1,30);
        List<Product> prodList = new ArrayList<>(List.of(bottleOfCola, pieceOfColbasa)); //добавление нескольких объектов
//        prodList.add(cola);
//        prodList.add(colbasa);
//        prodList.add(smetana);




    }
}
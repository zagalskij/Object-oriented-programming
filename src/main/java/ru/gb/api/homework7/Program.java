package ru.gb.api.homework7;

import ru.gb.api.homework7.Data.DivisionModel;
import ru.gb.api.homework7.Data.MultiplicationModel;
import ru.gb.api.homework7.Data.SubstractionModel;
import ru.gb.api.homework7.Data.SumModel;

public class Program {
    public static void main(String[] args) {
        Presenter p = new Presenter(new View(),new SumModel(),new SubstractionModel(),new DivisionModel(),new MultiplicationModel());
        p.buttonClick();

    }
}

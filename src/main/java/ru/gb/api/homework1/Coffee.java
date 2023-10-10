package ru.gb.api.homework1;

public class Coffee extends HotDrink{
    private int temperature;
    private final String name;

    public Coffee(String name, int temperature,double volume, float price) {
       super(volume,price);
       this.name = name;
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getName() {
        return name;
    }

    @Override
    public void warmUp(int numberOfDegrees) {
        this.temperature=this.temperature+numberOfDegrees;

    }

    @Override
    public void warmDown(int numberOfDegrees) {
        this.temperature=this.temperature-numberOfDegrees;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "temperature=" + temperature +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                ", compound=" + compound +
                ", price=" + price +
                '}';
    }
}

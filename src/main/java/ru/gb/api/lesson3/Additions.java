package ru.gb.api.lesson3;

public class Additions {
    private double a;
    private double b;

    public Additions(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Additions() {
    }

    public double theAmount(double a, double b){
        this.a=a;
        this.b=b;
        return  a+b;
    }
    public double theAmount(){
       return a+b;
    }

    @Override
    public String toString() {
        double sum = a + b;
        return "The amount = " + sum;
    }
}

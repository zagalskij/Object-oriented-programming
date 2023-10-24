package ru.gb.api.homework1;

import java.util.HashMap;
import java.util.Map;

public abstract class HotDrink {
    protected double volume;

    public HotDrink(double volume, float price) {
        this.volume = volume;
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public Map<String, Map<Integer, String>> getCompound() {
        return compound;
    }

    public float getPrice() {
        return price;
    }

    protected Map<String, Map<Integer, String>> compound = new HashMap<>();

    protected float price;

    protected abstract void warmUp(int numberOfDegrees);

    protected abstract void warmDown(int numberOfDegrees);

    protected void addIngredient(String ingredient, Integer quantity, String units) {
        Map<Integer, String> ingredientInfo = new HashMap<>();
        ingredientInfo.put(quantity, units);
        compound.put(ingredient, ingredientInfo);

    }

    protected void deleteIngredient(String ingredient) {
        compound.remove(ingredient);

    }

    protected void changeVolume(double newVolume) {
        this.volume = newVolume;

    }



}

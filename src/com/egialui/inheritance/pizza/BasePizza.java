package com.egialui.inheritance.pizza;

/**
 * Created by egialui on 5/2/16.
 */
public abstract class BasePizza {
    String description = "Base";
    double cost = 3.0;
    Prices prices;

    public void add(Ingredient ingredient) {
        this.description += "," + ingredient.toString();
        this.cost += prices.getPrice(ingredient);
    }

    private String dress() {
        return this.description;
    }
    private double getCost() {
        return this.cost;
    }
    public String checkOut() { return dress() + " costa " + getCost() + " euro";}
}
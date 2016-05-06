package com.ericsson.egialui.inheritance.pizza;

/**
 * Created by egialui on 5/2/16.
 */
public abstract class BasePizza {
    String description = "Base";
    double cost = 3.0;
    PriceList priceList;

    public abstract void add(Ingredient ingredient);
    public abstract String make();
    public abstract double getCost();
}
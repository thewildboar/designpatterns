package com.egialui.decorator.pizza;

/**
 * Created by egialui on 5/2/16.
 */
public abstract class BasePizza {
    String description = "Base";
    public abstract String dress();
    public abstract double getCost();

    public String checkOut() {
        return "N/A";
    }
}

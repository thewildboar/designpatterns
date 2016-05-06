package com.ericsson.egialui.decorator.pizza;

/**
 * Created by egialui on 5/2/16.
 */
public class Pizza implements BasePizza {
    private String description;
    public Pizza() { description = "Pizza con Base";}
    @Override public String dress() {
        return description;
    }
    @Override public double getCost() {
        return 3.00;
    }
}

package com.ericsson.egialui.decorator.pizza;

/**
 * Created by egialui on 5/2/16.
 */
public class Calzone implements BasePizza {
    private String description;
    public Calzone() { description = "Calzone con Base"; }
    @Override public String dress() {
        return description;
    }
    @Override public double getCost() {
        return 4.00;
    }
}

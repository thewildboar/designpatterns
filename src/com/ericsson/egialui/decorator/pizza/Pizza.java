package com.ericsson.egialui.decorator.pizza;

/**
 * Created by egialui on 5/2/16.
 */
public class Pizza extends BasePizza {

    public Pizza() {
        description = "Pizza con " + super.description;
    }

    @Override public String dress() {
        return description;
    }

    @Override public double getCost() {
        return 3.00;
    }
}

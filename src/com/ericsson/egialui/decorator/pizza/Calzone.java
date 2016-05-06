package com.ericsson.egialui.decorator.pizza;

/**
 * Created by egialui on 5/2/16.
 */
public class Calzone extends BasePizza {

    public Calzone() {
        description = "Calzone con " + super.description;
    }

    @Override public String dress() {
        return description;
    }

    @Override public double getCost() {
        return 4.00;
    }
}

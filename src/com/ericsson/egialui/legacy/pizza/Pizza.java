package com.ericsson.egialui.legacy.pizza;

/**
 * Created by egialui on 5/2/16.
 */
public class Pizza {

    String description = "Base";
    double cost = 3.0;

    public void add(Ingredient ingredient) {
        switch (ingredient) {
            case Mozzarella:
                description+=",Mozzarella";
                cost+=1.0;
                break;
            case Pomodoro:
                description+=",Pomodoro";
                cost+=0.5;
                break;
            case Basilico:
                description+=",Basilico";
                cost+=0.2;
                break;
            case Origano:
                description+=",Origano";
                cost+=0.1;
                break;
        }
    }

    public String make() {
        return "Pizza con " + description;
    }

    public double getCost() {
        return cost;
    }
}

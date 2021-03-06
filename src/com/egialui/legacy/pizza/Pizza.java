package com.egialui.legacy.pizza;

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

    private String dress() {
        return "Pizza con " + description;
    }

    private double getCost() { return cost; }

    public String checkOut() {
        return dress() + " costa " + getCost() + " euro";
    }
}

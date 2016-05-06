package com.examples.egialui.decorator.pizza;

/**
 * Created by egialui on 5/2/16.
 */
public class Pomodoro extends IngredientDecorator {
    public Pomodoro(BasePizza pizza) { this.pizza = pizza; }
    @Override public String dress() { return pizza.dress() + ",Pomodoro";}
    @Override public double getCost() { return pizza.getCost() + 0.5;}
}

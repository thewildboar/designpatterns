package com.examples.egialui.decorator.pizza;

/**
 * Created by egialui on 5/2/16.
 */
public class Origano extends IngredientDecorator {
    public Origano(BasePizza pizza) {
        this.pizza = pizza;
    }
    @Override public String dress() {
        return pizza.dress() + ",Origano";
    }
    @Override public double getCost() {
        return pizza.getCost() + 0.1;
    }
}

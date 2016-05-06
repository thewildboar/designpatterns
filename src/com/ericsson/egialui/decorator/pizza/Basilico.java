package com.ericsson.egialui.decorator.pizza;

/**
 * Created by egialui on 5/2/16.
 */
public class Basilico extends IngredientDecorator {
    public Basilico(BasePizza pizza) {
        this.pizza = pizza;
    }
    @Override public String dress() {
        return pizza.dress() + ",Basilico";
    }
    @Override public double getCost() {
        return pizza.getCost() + 0.2;
    }
}

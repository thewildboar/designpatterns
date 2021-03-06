package com.egialui.decorator.pizza;

/**
 * Created by egialui on 5/2/16.
 */
public class Mozzarella extends IngredientDecorator {

    BasePizza pizza;

    public Mozzarella(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override public String dress() {
        return pizza.dress() + ",Mozzarella";
    }

    @Override public double getCost() {
        return pizza.getCost() + 1.0;
    }
}

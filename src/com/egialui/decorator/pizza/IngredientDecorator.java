package com.egialui.decorator.pizza;

/**
 * Created by egialui on 5/2/16.
 */
public abstract class IngredientDecorator extends BasePizza {

    @Override public abstract String dress();
    @Override public abstract double getCost();
}

package it.bakery.stores.decorator.kitchen;

import it.bakery.franchising.corporate_identity.Dressing;

/**
 * Created by egialui on 5/2/16.
 */
public class Pomodoro extends IngredientDecorator {
    public Pomodoro(BasePizza pizza) { this.pizza = pizza; }
    @Override public String good() { return pizza.good() + "," + Dressing.Pomodoro;}
    @Override public double price() { return pizza.price() + 0.5;}
}

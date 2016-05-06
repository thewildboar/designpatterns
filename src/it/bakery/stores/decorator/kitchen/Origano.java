package it.bakery.stores.decorator.kitchen;

import it.bakery.franchising.corporate_identity.Dressing;

/**
 * Created by egialui on 5/2/16.
 */
public class Origano extends IngredientDecorator {
    public Origano(BasePizza pizza) {
        this.pizza = pizza;
    }
    @Override public String good() {
        return pizza.good() + "," + Dressing.Origano;
    }
    @Override public double price() {
        return pizza.price() + 0.1;
    }
}

package it.bakery.stores.decorator.kitchen;

import it.bakery.franchising.corporate_identity.Dressing;

/**
 * Created by egialui on 5/2/16.
 */
public class Mozzarella extends IngredientDecorator {
    public Mozzarella(BasePizza pizza) {
        this.pizza = pizza;
    }
    @Override public String good() {
        return pizza.good() + "," + Dressing.Mozzarella;
    }
    @Override public double price() {
        return pizza.price() + 1.0;
    }
}

package com.examples.egialui.pizzafranchising.stores;

import com.examples.egialui.pizzafranchising.common.definitions.Pizzeria;
import com.examples.egialui.pizzafranchising.common.tools.Counter;
import com.examples.egialui.pizzafranchising.stores.legacy.BasePizza;
import com.examples.egialui.pizzafranchising.stores.legacy.Margherita;

/**
 * Created by egialui on 5/2/16.
 */
public class Inheritance extends Pizzeria {

    public Inheritance() {
        LOGO = "Pizzeria INHERITANCE \t->\t";
    }

    @Override public String makePizza() {

        BasePizza pizza = new Margherita();
        return printLogo() + Counter.checkOut(pizza);
    }

    @Override public String printLogo() {
        return LOGO;
    }
}

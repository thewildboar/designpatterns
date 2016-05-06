package com.ericsson.egialui.pizzeria;

import com.ericsson.egialui.inheritance.pizza.BasePizza;
import com.ericsson.egialui.inheritance.pizza.Margherita;

/**
 * Created by egialui on 5/2/16.
 */
public class Inheritance implements Pizzeria {

    static String LOGO = "Pizzeria INHERITANCE \t->\t";

    @Override public String makePizza() {

        BasePizza pizza = new Margherita();

        return printLogo() + pizza.make() + " costa " + pizza.getCost() + " euro";
    }

    @Override public String printLogo() {
        return LOGO;
    }
}

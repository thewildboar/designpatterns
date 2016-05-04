package com.egialui.pizzeria;

import com.egialui.inheritance.pizza.BasePizza;
import com.egialui.inheritance.pizza.Margherita;

/**
 * Created by egialui on 5/2/16.
 */
public class Inheritance implements Pizzeria {

    static String LOGO = "Pizzeria INHERITANCE \t->\t";

    @Override public String make() {

        BasePizza pizza = new Margherita();

        return LOGO + pizza.checkOut();
    }
}

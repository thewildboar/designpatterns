package com.examples.egialui.pizzeria;

import com.examples.egialui.common.tools.Counter;
import com.examples.egialui.inheritance.pizza.BasePizza;
import com.examples.egialui.inheritance.pizza.Margherita;

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

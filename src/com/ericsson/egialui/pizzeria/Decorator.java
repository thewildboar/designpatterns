package com.ericsson.egialui.pizzeria;

import com.ericsson.egialui.decorator.pizza.*;

/**
 * Created by egialui on 5/2/16.
 */
public class Decorator implements Pizzeria {

    static String LOGO = "Pizzeria DECORATOR \t\t->\t";

    @Override public String makePizza() {
        BasePizza pizza = new Pizza();

        pizza = new Mozzarella(pizza);
        pizza = new Pomodoro(pizza);

        return printLogo() + pizza.dress() + " costa " + pizza.getCost()+ " euro";
    }

    @Override public String printLogo() {
        return LOGO;
    }
}

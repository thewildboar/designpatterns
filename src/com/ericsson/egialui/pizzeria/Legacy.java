package com.ericsson.egialui.pizzeria;

import com.ericsson.egialui.legacy.pizza.Ingredient;
import com.ericsson.egialui.legacy.pizza.Pizza;

/**
 * Created by egialui on 5/2/16.
 */
public class Legacy implements Pizzeria {

    static String LOGO = "Pizzeria LEGACY \t\t->\t";

    @Override public String makePizza() {

        Pizza pizza = new Pizza();

        pizza.add(Ingredient.Mozzarella);
        pizza.add(Ingredient.Pomodoro);

        return printLogo() + pizza.make() + " costa " + pizza.getCost()+ " euro";
    }

    @Override public String printLogo() {
        return LOGO;
    }
}

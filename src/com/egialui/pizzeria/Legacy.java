package com.egialui.pizzeria;

import com.egialui.legacy.pizza.Ingredient;
import com.egialui.legacy.pizza.Pizza;

/**
 * Created by egialui on 5/2/16.
 */
public class Legacy implements Pizzeria {

    static String LOGO = "Pizzeria LEGACY \t\t->\t";

    @Override public String make() {

        Pizza pizza = new Pizza();

        pizza.add(Ingredient.Mozzarella);
        pizza.add(Ingredient.Pomodoro);

        return LOGO + pizza.checkOut();
    }
}

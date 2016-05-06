package com.examples.egialui.pizzeria;

import com.examples.egialui.common.tools.Counter;
import com.examples.egialui.legacy.pizza.Ingredient;
import com.examples.egialui.legacy.pizza.Pizza;

/**
 * Created by egialui on 5/2/16.
 */
public class Legacy extends Pizzeria {

    public Legacy() {
        this.LOGO = "Pizzeria LEGACY \t\t->\t";
    }

    @Override public String makePizza() {

        Pizza pizza = new Pizza();
        pizza.add(Ingredient.Mozzarella);
        pizza.add(Ingredient.Pomodoro);

        return printLogo() + Counter.checkOut(pizza);
    }

}

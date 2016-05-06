package com.examples.egialui.pizzafranchising.stores;

import com.examples.egialui.pizzafranchising.common.definitions.Pizzeria;
import com.examples.egialui.pizzafranchising.common.tools.Counter;
import com.examples.egialui.pizzafranchising.stores.legacy.Ingredient;
import com.examples.egialui.pizzafranchising.stores.legacy.Pizza;

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

package com.egialui.pizzeria;

import com.egialui.decorator.pizza.BasePizza;
import com.egialui.decorator.pizza.Mozzarella;
import com.egialui.decorator.pizza.Pizza;
import com.egialui.decorator.pizza.Pomodoro;

/**
 * Created by egialui on 5/2/16.
 */
public class Decorator implements Pizzeria {

    static String LOGO = "Pizzeria DECORATOR \t\t->\t";

    @Override public String make() {
        BasePizza pizza = new Pizza();
        pizza = new Mozzarella(pizza);
        pizza = new Pomodoro(pizza);
        return LOGO + pizza.checkOut();
    }
}

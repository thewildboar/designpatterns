package com.examples.egialui.pizzafranchising.stores;

import com.examples.egialui.pizzafranchising.common.definitions.Pizzeria;
import com.examples.egialui.pizzafranchising.common.tools.Counter;
import com.examples.egialui.pizzafranchising.stores.decorator.BasePizza;
import com.examples.egialui.pizzafranchising.stores.decorator.Mozzarella;
import com.examples.egialui.pizzafranchising.stores.decorator.Pizza;
import com.examples.egialui.pizzafranchising.stores.decorator.Pomodoro;

/**
 * Created by egialui on 5/2/16.
 */
public class Decorator extends Pizzeria {

    public Decorator() {
        LOGO = "Pizzeria DECORATOR \t\t->\t";
    }

    @Override public String makePizza() {
        BasePizza pizza = new Pizza();

        pizza = new Mozzarella(pizza);
        pizza = new Pomodoro(pizza);

        return printLogo() + Counter.checkOut(pizza);
    }

//    public BasePizza makeMargherita() {
//        return new Pomodoro(new Mozzarella(new Pizza()));
//    }
}

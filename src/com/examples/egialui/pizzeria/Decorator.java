package com.examples.egialui.pizzeria;

import com.examples.egialui.common.tools.Counter;
import com.examples.egialui.decorator.pizza.BasePizza;
import com.examples.egialui.decorator.pizza.Mozzarella;
import com.examples.egialui.decorator.pizza.Pizza;
import com.examples.egialui.decorator.pizza.Pomodoro;

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

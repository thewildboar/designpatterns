package com.ericsson.egialui.pizzeria;

import com.ericsson.egialui.common.tools.Counter;
import com.ericsson.egialui.decorator.pizza.*;

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

package com.examples.egialui.pizzafranchising.common.tools;

import com.examples.egialui.pizzafranchising.common.definitions.CommonPizza;

/**
 * Created by egialui on 5/6/16.
 */
public final class Counter {
    public static String checkOut(final CommonPizza pizza) {
        return pizza.dress() + " costa " + pizza.getCost()+ " euro";
    }
}

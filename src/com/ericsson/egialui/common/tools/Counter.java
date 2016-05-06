package com.ericsson.egialui.common.tools;

import com.ericsson.egialui.common.pizza.CommonPizza;

/**
 * Created by egialui on 5/6/16.
 */
public final class Counter {
    public static String checkOut(final CommonPizza pizza) {
        return pizza.dress() + " costa " + pizza.getCost()+ " euro";
    }
}

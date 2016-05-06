package com.ericsson.egialui.inheritance.pizza;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by egialui on 5/2/16.
 */
public class PriceList {

    Map<Ingredient,Double> cost = new HashMap<Ingredient,Double>();

    public PriceList() {
        cost.put(Ingredient.Mozzarella, 1.0);
        cost.put(Ingredient.Pomodoro, 0.5);
    }

    public double getPrice(Ingredient ingredient) {
        return cost.get(ingredient);
    }
}

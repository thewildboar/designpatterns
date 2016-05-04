package com.egialui.inheritance.pizza;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by egialui on 5/2/16.
 */
public class Prices {

    Map<Ingredient,Double> cost = new HashMap<>();

    public Prices() {
        cost.put(Ingredient.Mozzarella, 1.0);
        cost.put(Ingredient.Pomodoro, 0.5);
    }

    public double getPrice(Ingredient ingredient) {
        return cost.get(ingredient);
    }
}

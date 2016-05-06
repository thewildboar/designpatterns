package com.ericsson.egialui.inheritance.pizza;

import com.ericsson.egialui.common.pizza.CommonPizza;

/**
 * Created by egialui on 5/2/16.
 */
public abstract class BasePizza implements CommonPizza {
    String description = "Base";
    double cost = 3.0;
    PriceList priceList;

    public void add(Ingredient ingredient) {
        this.description += "," + ingredient.toString();
        this.cost += priceList.getPrice(ingredient);
    }

   @Override public String dress() { return this.description; }
   @Override public double getCost() { return this.cost; }
}
package com.ericsson.egialui.inheritance.pizza;

/**
 * Created by egialui on 5/2/16.
 */
public abstract class BasePizza {
    String description = "Base";
    double cost = 3.0;
    PriceList priceList;

    public void add(Ingredient ingredient) {
        this.description += "," + ingredient.toString();
        this.cost += priceList.getPrice(ingredient);
    }

   public String make() { return this.description; }
   public double getCost() { return this.cost; }
}
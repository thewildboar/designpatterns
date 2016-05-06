package com.ericsson.egialui.inheritance.pizza;

/**
 * Created by egialui on 5/2/16.
 */
public class Pizza extends BasePizza {

    public Pizza() {
        this.description = "Pizza con " + super.description;
        this.priceList = new PriceList();
    }

    @Override public void add(Ingredient ingredient) {
        this.description += "," + ingredient.toString();
        this.cost += priceList.getPrice(ingredient);
    }

    @Override public String make() {
        return this.description;
    }

    @Override public double getCost() {
        return this.cost;
    }
}

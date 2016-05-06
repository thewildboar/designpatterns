package com.examples.egialui.pizzafranchising.stores.inheritance;

import com.examples.egialui.pizzafranchising.stores.legacy.BasePizza;
import com.examples.egialui.pizzafranchising.stores.legacy.PriceList;

/**
 * Created by egialui on 5/2/16.
 */
public class Pizza extends BasePizza {
    public Pizza() {
        this.description = "Pizza con " + super.description;
        this.priceList = new PriceList();
    }
}

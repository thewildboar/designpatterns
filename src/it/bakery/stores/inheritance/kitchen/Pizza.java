package it.bakery.stores.inheritance.kitchen;

/**
 * Created by egialui on 5/2/16.
 */
public class Pizza extends BasePizza {
    public Pizza() {
        this.description = "Pizza con " + super.description;
        this.priceList = new PriceList();
    }
}

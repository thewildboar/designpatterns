package it.daluigi.stores.decorator.kitchen;

/**
 * Created by egialui on 5/2/16.
 */
public class Pizza implements BasePizza {
    protected String description;
    public Pizza() { description = "Pizza con Base";}
    @Override public String good() {
        return description;
    }
    @Override public double price() {
        return 3.00;
    }
}

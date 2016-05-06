package it.bakery.stores.decorator.kitchen;

/**
 * Created by egialui on 5/2/16.
 */
public class Calzone implements BasePizza {
    private String description;
    public Calzone() { description = "Calzone con Base"; }
    @Override public String good() {
        return description;
    }
    @Override public double price() {
        return 4.00;
    }
}

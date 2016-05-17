package it.daluigi.stores.inheritance.kitchen;

import it.daluigi.franchising.corporate_identity.Saleable;
import it.daluigi.franchising.corporate_identity.Dressing;

/**
 * Created by egialui on 5/2/16.
 */
public abstract class BasePizza implements Saleable {
    protected String description = "Base";
    protected double cost = 3.0;
    protected PriceList priceList;

    public void add(Dressing dressing) {
        this.description += "," + dressing;
        this.cost += priceList.getPrice(dressing);
    }

    @Override public String good() { return this.description; }
    @Override public double price() { return this.cost; }
}
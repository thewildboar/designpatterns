package it.bakery.stores.inheritance.kitchen;

import it.bakery.franchising.corporate_identity.Sellable;
import it.bakery.franchising.corporate_identity.Dressing;

/**
 * Created by egialui on 5/2/16.
 */
public abstract class BasePizza implements Sellable {
    String description = "Base";
    double cost = 3.0;
    PriceList priceList;

    public void add(Dressing dressing) {
        this.description += "," + dressing.toString();
        this.cost += priceList.getPrice(dressing);
    }

    @Override public String good() { return this.description; }
    @Override public double price() { return this.cost; }
}
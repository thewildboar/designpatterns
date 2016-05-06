package it.bakery.stores.legacy;

import it.bakery.franchising.corporate_identity.Sellable;
import it.bakery.franchising.corporate_identity.Store;
import it.bakery.franchising.corporate_identity.tools.Counter;
import it.bakery.stores.inheritance.kitchen.Margherita;

/**
 * Created by egialui on 5/2/16.
 */
public class Legacy extends Store {

    public Legacy() {
        LOGO = "Pizzeria INHERITANCE \t->\t";
    }

    @Override public String sell() {

        Sellable pizza = new Margherita();
        return showLogo() + Counter.checkOut(pizza);
    }

    @Override public String showLogo() {
        return LOGO;
    }
}

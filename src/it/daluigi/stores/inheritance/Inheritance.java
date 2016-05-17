package it.daluigi.stores.inheritance;

import it.daluigi.franchising.corporate_identity.Store;
import it.daluigi.franchising.corporate_identity.tools.Counter;
import it.daluigi.franchising.corporate_identity.Dressing;
import it.daluigi.stores.inheritance.kitchen.Margherita;
import it.daluigi.stores.inheritance.kitchen.Pizza;

/**
 * Created by egialui on 5/2/16.
 */
public class Inheritance extends Store {

    public Inheritance() {
        this.LOGO = "Pizzeria INHERITANCE \t->\t";
    }

    @Override public String sell() {

        Pizza pizza = new Margherita();

        return showLogo() + Counter.checkOut(pizza);
    }

}

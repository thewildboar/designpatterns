package it.bakery.stores.hardwired;

import it.bakery.franchising.corporate_identity.Store;

/**
 * Created by egialui on 5/2/16.
 */
public class Hardwired extends Store {

    public Hardwired() {
        LOGO = "Pizzeria HARDWIRED \t\t->\t";
    }

    @Override public String sell() {
        return showLogo() + "Pizza con Base,Mozzarella,Pomodoro costa 4.5 euro";
    }
}

package it.bakery.stores.inheritance.kitchen;

import it.bakery.franchising.corporate_identity.Dressing;

/**
 * Created by egialui on 5/2/16.
 */
public class Margherita extends Pizza {
    public Margherita() {
        add(Dressing.Mozzarella);
        add(Dressing.Pomodoro);
    }
}

package it.bakery.stores.inheritance;

import it.bakery.franchising.corporate_identity.Store;
import it.bakery.franchising.corporate_identity.tools.Counter;
import it.bakery.franchising.corporate_identity.Dressing;
import it.bakery.stores.legacy.kitchen.Pizza;

/**
 * Created by egialui on 5/2/16.
 */
public class Inheritance extends Store {

    public Inheritance() {
        this.LOGO = "Pizzeria LEGACY \t\t->\t";
    }

    @Override public String sell() {

        Pizza pizza = new Pizza();
        pizza.add(Dressing.Mozzarella);
        pizza.add(Dressing.Pomodoro);

        return showLogo() + Counter.checkOut(pizza);
    }

}

package it.daluigi.stores.legacy;

import it.daluigi.franchising.corporate_identity.Dressing;
import it.daluigi.franchising.corporate_identity.Store;
import it.daluigi.franchising.corporate_identity.tools.Counter;
import it.daluigi.stores.legacy.kitchen.Pizza;

/**
 * Created by egialui on 5/2/16.
 */
public class Legacy extends Store {

    public Legacy() {
        LOGO = "Pizzeria LEGACY \t\t->\t";
    }

    @Override public String sell() {

        Pizza pizza = new Pizza();
        pizza.add(Dressing.Mozzarella);
        pizza.add(Dressing.Pomodoro);
        return showLogo() + Counter.checkOut(pizza);
    }

    @Override public String showLogo() {
        return LOGO;
    }
}

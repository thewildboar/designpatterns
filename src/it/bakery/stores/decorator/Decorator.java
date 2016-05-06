package it.bakery.stores.decorator;

import it.bakery.franchising.corporate_identity.Store;
import it.bakery.franchising.corporate_identity.tools.Counter;
import it.bakery.stores.decorator.kitchen.*;

/**
 * Created by egialui on 5/2/16.
 */
public class Decorator extends Store {

    public Decorator() {
        LOGO = "Pizzeria DECORATOR \t\t->\t";
    }

    @Override public String sell() {
        BasePizza pizza = new Pizza();

        pizza = new Mozzarella(pizza);
        pizza = new Pomodoro(pizza);

        return showLogo() + Counter.checkOut(pizza);
    }

//    public BasePizza makeMargherita() {
//        return new Pomodoro(new Mozzarella(new Pizza()));
//    }
}

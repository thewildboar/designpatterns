package it.bakery.stores.legacy.kitchen;

import it.bakery.franchising.corporate_identity.Sellable;
import it.bakery.franchising.corporate_identity.Dressing;

/**
 * Created by egialui on 5/2/16.
 */
public class Pizza implements Sellable {

    String description = "Base";
    double cost = 3.0;

    public void add(Dressing dressing) {
        switch (dressing) {
            case Mozzarella:
                description+=",Mozzarella";
                cost+=1.0;
                break;
            case Pomodoro:
                description+=",Pomodoro";
                cost+=0.5;
                break;
            case Basilico:
                description+=",Basilico";
                cost+=0.2;
                break;
            case Origano:
                description+=",Origano";
                cost+=0.1;
                break;
            default:
                description+=",Unknown";
        }
    }

    @Override public String good() {
        return "Pizza con " + description;
    }

    @Override public double price() {
        return cost;
    }
}

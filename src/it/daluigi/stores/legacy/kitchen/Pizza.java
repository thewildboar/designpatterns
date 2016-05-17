package it.daluigi.stores.legacy.kitchen;

import it.daluigi.franchising.corporate_identity.Saleable;
import it.daluigi.franchising.corporate_identity.Dressing;

/**
 * Created by egialui on 5/2/16.
 */
public class Pizza implements Saleable {

    protected String description = "Base";
    protected double cost = 3.0;

    public void add(Dressing dressing) {
        switch (dressing) {
            case Mozzarella:
                cost+=1.0;
                break;
            case Pomodoro:
                cost+=0.5;
                break;
            case Basilico:
                cost+=0.2;
                break;
            case Origano:
                cost+=0.1;
                break;
            default:
        }

        description += ",";
        description += dressing;
    }

    @Override public String good() {
        return "Pizza con " + description;
    }

    @Override public double price() {
        return cost;
    }
}

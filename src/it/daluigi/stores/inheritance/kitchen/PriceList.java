package it.daluigi.stores.inheritance.kitchen;

import java.util.HashMap;
import java.util.Map;

import it.daluigi.franchising.corporate_identity.Dressing;

/**
 * Created by egialui on 5/2/16.
 */
public class PriceList {

    Map<Dressing,Double> cost = new HashMap<Dressing,Double>();

    public PriceList() {
        cost.put(Dressing.Mozzarella, 1.0);
        cost.put(Dressing.Pomodoro, 0.5);
    }

    public double getPrice(Dressing dressing) {
        return cost.get(dressing);
    }
}

package it.bakery.franchising.corporate_identity.tools;

import it.bakery.franchising.corporate_identity.Sellable;

/**
 * Created by egialui on 5/6/16.
 */
public final class Counter {
    public static String checkOut(final Sellable p) {
        return p.good() + " costa " + p.price()+ " euro";
    }
}
package it.bakery.franchising.administration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import it.bakery.franchising.corporate_identity.Store;
import it.bakery.stores.decorator.Decorator;
import it.bakery.stores.hardwired.Hardwired;
import it.bakery.stores.inheritance.Inheritance;
import it.bakery.stores.legacy.Legacy;

public class Main {

    public static void main(String[] args) throws IOException {

        AdministrationTools tools = new AdministrationTools();
        List<Store> pizzerieAffiliate = new ArrayList<Store>();

        //tools.insertStores(pizzerieAffiliate);
        pizzerieAffiliate.add(new Hardwired());
        pizzerieAffiliate.add(new Inheritance());
        pizzerieAffiliate.add(new Legacy());
        pizzerieAffiliate.add(new Decorator());

        System.out.println("");
        tools.printMenu(pizzerieAffiliate);
    }
}

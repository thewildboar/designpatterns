package it.daluigi.franchising.administration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import it.daluigi.franchising.corporate_identity.Store;
import it.daluigi.stores.decorator.Decorator;
import it.daluigi.stores.hardwired.Hardwired;
import it.daluigi.stores.inheritance.Inheritance;
import it.daluigi.stores.legacy.Legacy;

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

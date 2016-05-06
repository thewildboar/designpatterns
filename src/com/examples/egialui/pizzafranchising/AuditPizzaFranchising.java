package com.examples.egialui.pizzafranchising;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.examples.egialui.pizzafranchising.common.definitions.Pizzeria;
import com.examples.egialui.pizzafranchising.common.tools.CorporateIdentityTools;
import com.examples.egialui.pizzafranchising.stores.Decorator;
import com.examples.egialui.pizzafranchising.stores.Hardwired;
import com.examples.egialui.pizzafranchising.stores.Inheritance;
import com.examples.egialui.pizzafranchising.stores.Legacy;

public class AuditPizzaFranchising {

    public static void main(String[] args) throws IOException {

        CorporateIdentityTools tools = new CorporateIdentityTools();
        List<Pizzeria> pizzerieAffiliate = new ArrayList<Pizzeria>();

        pizzerieAffiliate.add(new Hardwired());
        pizzerieAffiliate.add(new Legacy());
        pizzerieAffiliate.add(new Inheritance());
        pizzerieAffiliate.add(new Decorator());

        System.out.println("");
        tools.printMenu(pizzerieAffiliate);
    }
}

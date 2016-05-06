package it.bakery.franchising.administration;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import it.bakery.franchising.corporate_identity.Store;

/**
 * Created by egialui on 5/3/16.
 */
public class AdministrationTools {

    public void insertStores(List<Store> stores) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        printTitle();
        do {
            System.out.print("~$ ");
            String choice = "";
            try {
                choice = reader.readLine();
                if (choice.equalsIgnoreCase("done"))
                    break;

                // REFLECTION!?!
                Object obj = Class.forName(choice).newInstance();
                if (obj instanceof Store) {
                    stores.add((Store) obj);
                }

            } catch (Exception e) {
                System.out.println("Please try again...[type 'done' to exit]");
            }
        } while (true);
    }

    private void printTitle() {
        System.out.print("INSERIRE ELENCO LOCALI AFFILIATI (full-qualified classname): ");
        System.out.println("");
    }

    public void printMenu(final List<Store> pizzerie) {
        for (Store pizzeria : pizzerie) {
            System.out.println(pizzeria.sell());
        }
    }
}

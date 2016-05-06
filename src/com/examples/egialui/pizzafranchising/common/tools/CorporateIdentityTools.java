package com.examples.egialui.pizzafranchising.common.tools;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import com.examples.egialui.pizzafranchising.common.definitions.Pizzeria;

/**
 * Created by egialui on 5/3/16.
 */
public class CorporateIdentityTools {

    public void ordinaPizza(List<Pizzeria> pizzerie) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        printQualePizzeria();
        do {
            System.out.print("~$ ");
            String choice = "";
            try {
                choice = reader.readLine();
                if (choice.equalsIgnoreCase("done"))
                    break;

                // REFLECTION!?!
                Object obj = Class.forName(choice).newInstance();
                if (obj instanceof Pizzeria) {
                    pizzerie.add((Pizzeria) obj);
                }

            } catch (Exception e) {
                System.out.println("Please try again...[type 'done' to exit]");
            }
        } while (true);

        printMenu(pizzerie);
    }

    private void printQualePizzeria () {
        System.out.print("SCELTA PIZZERIA (full-qualified classname): ");
        System.out.println("");
    }

    public void printMenu(final List<Pizzeria> pizzerie) {
        for (Pizzeria pizzeria : pizzerie) {
            System.out.println(pizzeria.makePizza());
        }
    }
}

package com.examples.egialui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import com.examples.egialui.pizzeria.Pizzeria;

/**
 * Created by egialui on 5/3/16.
 */
public class PizzaUtils {

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

        printOrders(pizzerie);
    }

    private void printQualePizzeria () {
        System.out.print("SCELTA PIZZERIA (full-qualified classname): ");
        System.out.println("");
    }

    public void printOrders(final List<Pizzeria> pizzerie) {
        for (Pizzeria pizzeria : pizzerie) {
            System.out.println(pizzeria.makePizza());
        }
    }
}

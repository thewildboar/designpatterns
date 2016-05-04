package com.egialui.pizzeria;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by egialui on 5/3/16.
 */
public class PizzeriaTools {

    public void fillOrders(List<Pizzeria> pizzerie) {
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

        dispatchOrders(pizzerie);
    }

    private void printQualePizzeria () {
        System.out.print("SCELTA PIZZERIA (full-qualified classname): ");
        System.out.println("");
    }

    public void dispatchOrders(final List<Pizzeria> pizzerie) {
        System.out.println("");
        for (Pizzeria pizzeria : pizzerie) {
            System.out.println(pizzeria.make());
        }
    }
}

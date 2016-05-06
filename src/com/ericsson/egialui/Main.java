package com.ericsson.egialui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.ericsson.egialui.pizzeria.*;

public class Main {

    public static void main(String[] args) throws IOException {

        PizzaUtils utils = new PizzaUtils();
        List<Pizzeria> pizzerieConosciute = new ArrayList<Pizzeria>();

        pizzerieConosciute.add(new Hardwired());
        pizzerieConosciute.add(new Legacy());
        pizzerieConosciute.add(new Inheritance());
        pizzerieConosciute.add(new Decorator());

        System.out.println("");
        utils.printOrders(pizzerieConosciute);
    }

}

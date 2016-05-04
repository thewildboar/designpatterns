package com.egialui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.egialui.pizzeria.*;

public class Main {

    public static void main(String[] args) throws IOException {

        PizzeriaTools tools = new PizzeriaTools();
        List<Pizzeria> pizzerieConosciute = new ArrayList<>();

        pizzerieConosciute.add(new Inheritance());
        pizzerieConosciute.add(new Hardwired());
        pizzerieConosciute.add(new Decorator());
        pizzerieConosciute.add(new Legacy());

        tools.dispatchOrders(pizzerieConosciute);
    }

}

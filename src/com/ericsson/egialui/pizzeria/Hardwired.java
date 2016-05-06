package com.ericsson.egialui.pizzeria;

/**
 * Created by egialui on 5/2/16.
 */
public class Hardwired implements Pizzeria {

    static String LOGO = "Pizzeria HARDWIRED \t\t->\t";

    @Override public String printLogo() {
        return LOGO;
    }

    @Override public String makePizza() {
        return printLogo() + "Pizza con Base,Mozzarella,Pomodoro costa 4.5 euro";
    }
}

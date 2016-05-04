package com.egialui.pizzeria;

/**
 * Created by egialui on 5/2/16.
 */
public class Hardwired implements Pizzeria {

    static String LOGO = "Pizzeria HARDWIRED \t\t->\t";

    @Override public String make() {
        return LOGO + "Pizza con Base,Mozzarella,Pomodoro costa 4.5 euro";
    }
}

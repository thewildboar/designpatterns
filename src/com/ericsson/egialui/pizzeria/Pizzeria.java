package com.ericsson.egialui.pizzeria;

/**
 * Created by egialui on 5/2/16.
 */
public abstract class Pizzeria {
    protected String LOGO = "NoLogo";
    public String printLogo() { return LOGO; };
    public String makePizza() { return "";};
}

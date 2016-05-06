package it.bakery.franchising.corporate_identity;

/**
 * Created by egialui on 5/2/16.
 */
public abstract class Store {
    protected String LOGO = "MissingLogo";
    public String showLogo() { return LOGO; }
    public String sell() { return "";}
}

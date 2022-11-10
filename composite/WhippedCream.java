package org.boulangerie.composite;

public class WhippedCream implements Cake {

    @Override
    public String getDescription() {
        return "Whipped Cream";
    }

    @Override
    public double getCost() {
        return 1.0;
    }
}

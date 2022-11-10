package org.boulangerie.composite;

public class Peanuts implements Cake {

    @Override
    public String getDescription() {
        return "Peanuts";
    }

    @Override
    public double getCost() {
        return 0.5;
    }
}

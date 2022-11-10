package org.boulangerie.composite;

public class Meringue implements Cake {

    @Override
    public String getDescription() {
        return "Meringue";
    }

    @Override
    public double getCost() {
        return 1.5;
    }
}

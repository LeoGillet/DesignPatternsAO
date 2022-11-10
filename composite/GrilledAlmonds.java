package org.boulangerie.composite;

public class GrilledAlmonds implements Cake {

    @Override
    public String getDescription() {
        return "Grilled Almonds";
    }

    @Override
    public double getCost() {
        return 0.5;
    }
}

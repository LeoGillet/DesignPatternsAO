package org.boulangerie.decorator;

public class ChocolatePuffs extends Puffs {
    @Override
    public String getDescription() {
        return "Chocolate Puffs";
    }

    @Override
    public double getCost() {
        return 3.0;
    }
}
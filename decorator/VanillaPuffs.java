package org.boulangerie.decorator;

public class VanillaPuffs extends Puffs {
    @Override
    public String getDescription() {
        return "Vanilla Puffs";
    }

    @Override
    public double getCost() {
        return 2.5;
    }
}

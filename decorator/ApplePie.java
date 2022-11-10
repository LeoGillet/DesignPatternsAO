package org.boulangerie.decorator;

public class ApplePie extends Pie {
    @Override
    public String getDescription() {
        return "Apple Pie";
    }

    @Override
    public double getCost() {
        return 6.0;
    }
}

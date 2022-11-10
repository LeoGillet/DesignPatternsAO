package org.boulangerie.decorator;

public class ApricotPie extends Pie {
    @Override
    public String getDescription() {
        return "Apricot Pie";
    }

    @Override
    public double getCost() {
        return 6.5;
    }
}

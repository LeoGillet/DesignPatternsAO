package org.boulangerie.decorator;

abstract class Pie implements Cake {
    @Override
    abstract public String getDescription();

    @Override
    abstract public double getCost();
}

package org.boulangerie.decorator;

abstract class Puffs implements Cake {
    @Override
    abstract public String getDescription();

    @Override
    abstract public double getCost();
}

package org.boulangerie.composite;

abstract class Puffs implements Cake {
    @Override
    abstract public String getDescription();

    @Override
    abstract public double getCost();
}

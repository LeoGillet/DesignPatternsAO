package org.boulangerie.observer;

abstract class IngredientDecorator implements Cake {
    protected Cake tempCake;

    public IngredientDecorator(Cake newCake) {
        tempCake = newCake;
    }

    public String getDescription() {
        return tempCake.getDescription();
    }

    public double getCost() {
        return tempCake.getCost();
    }
}

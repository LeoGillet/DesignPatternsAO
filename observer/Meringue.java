package org.boulangerie.observer;

public class Meringue extends IngredientDecorator {
    public Meringue(Cake newCake) {
        super(newCake);
        System.out.println("Adding some Meringue...");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Meringue";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
}

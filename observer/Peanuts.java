package org.boulangerie.observer;

public class Peanuts extends IngredientDecorator {
    public Peanuts(Cake newCake) {
        super(newCake);
        System.out.println("Adding some peanuts...");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + peanuts";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}

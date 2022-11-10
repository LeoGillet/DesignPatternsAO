package org.boulangerie.observer;

public class GrilledAlmonds extends IngredientDecorator {
    public GrilledAlmonds(Cake newCake) {
        super(newCake);
        System.out.println("Adding some grilled almonds...");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + grilled almonds";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}

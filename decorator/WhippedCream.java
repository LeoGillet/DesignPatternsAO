package org.boulangerie.decorator;

public class WhippedCream extends IngredientDecorator {
    public WhippedCream(Cake newCake) {
        super(newCake);
        System.out.println("Adding some whipped cream...");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + whipped cream";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.0;
    }
}

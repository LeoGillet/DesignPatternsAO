package org.boulangerie.decoratorbuilder;

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

    @Override
    public void setDescription(String desc) {

    }

    @Override
    public void appendDescription(String desc) {

    }

    @Override
    public void setCost(double newCost) {

    }

    @Override
    public void addCost(double childCost) {

    }
}

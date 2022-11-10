package org.boulangerie.decoratorbuilder;

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

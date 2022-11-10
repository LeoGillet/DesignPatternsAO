package org.boulangerie.decoratorbuilder;

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

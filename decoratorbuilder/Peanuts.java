package org.boulangerie.decoratorbuilder;

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

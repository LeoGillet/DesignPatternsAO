package org.boulangerie.decoratorbuilder;

abstract class IngredientDecorator implements Cake {
    protected Cake tempCake;
    private double cost;
    private String description;

    protected IngredientDecorator(Cake newCake) {
        tempCake = newCake;
    }

    public String getDescription() {
        return tempCake.getDescription();
    }

    public double getCost() {
        return tempCake.getCost();
    }

    public void appendDescription() { tempCake.appendDescription(this.description); }
    public void updateCost() { tempCake.addCost(this.cost); }
}

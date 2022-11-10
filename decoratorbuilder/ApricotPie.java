package org.boulangerie.decoratorbuilder;

public class ApricotPie implements Cake {
    private String description = "Apricot Pie";
    private double cost = 7.0;

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return this.cost;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void appendDescription(String description) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.description);
        stringBuilder.append(" + " + description);
        this.description = stringBuilder.toString();
    }

    @Override
    public void setCost(double newCost) {
        this.cost = newCost;
    }

    @Override
    public void addCost(double childCost) {
        this.cost += childCost;
    }
}

package org.boulangerie.decoratorbuilder;

public interface Cake {
    public String getDescription();
    public double getCost();
    public void setDescription(String desc);
    public void appendDescription(String desc);
    public void setCost(double newCost);
    public void addCost(double childCost);
}

package org.boulangerie.composite;

import java.util.ArrayList;

public class CakeComposite implements Cake {
    private ArrayList<Cake> ingredients = new ArrayList<>();

    @Override
    public String getDescription() {
        StringBuilder description = new StringBuilder();
        for (Cake ingredient : ingredients) {
            description.append(ingredient.getDescription());
            description.append(" ");
        }
        return description.toString();
    }

    @Override
    public double getCost() {
        double cost = 0.0;
        for (Cake ingredient : ingredients) {
           cost += ingredient.getCost();
        }
        return cost;
    }

    public void add(Cake ingredient) {
        ingredients.add(ingredient);
    }
}

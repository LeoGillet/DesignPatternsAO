package org.boulangerie.decoratorbuilder;

public class ChocolateNutsPuffsBuilder extends CakeBuilder {
    @Override
    public void prepareCake() {
        this.cake = new ChocolatePuffs();
    }

    @Override
    public void addIngredients() {
        new Peanuts(this.cake);
    }
}

package org.boulangerie.decoratorbuilder;

public class VanillaCreamPuffsBuilder extends CakeBuilder {
    @Override
    public void prepareCake() {
        this.cake = new VanillaPuffs();
    }

    @Override
    public void addIngredients() {
        new WhippedCream(new GrilledAlmonds(this.cake));
    }
}

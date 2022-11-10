package org.boulangerie.decoratorbuilder;

public class RoyalApplePieBuilder extends CakeBuilder {
    @Override
    public void prepareCake() {
        this.cake = new ApplePie();
    }

    @Override
    public void addIngredients() {
        new GrilledAlmonds(new Meringue(this.cake));
    }
}

package org.boulangerie.decoratorbuilder;

public class ApricotPieBuilder extends CakeBuilder {
    @Override
    public void prepareCake() {
        this.cake = new ApricotPie();
    }

    @Override
    public void addIngredients() { ; }
}

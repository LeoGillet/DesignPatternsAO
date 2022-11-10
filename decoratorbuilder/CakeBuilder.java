package org.boulangerie.decoratorbuilder;

abstract class CakeBuilder {
    protected Cake cake;

    public Cake getCake() {
        return this.cake;
    }

    public abstract void prepareCake();
    public abstract void addIngredients();
}

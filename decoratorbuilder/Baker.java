package org.boulangerie.decoratorbuilder;

public class Baker {
    private CakeBuilder cakeBuilder;

    public void setCakeBuilder(CakeBuilder cb) {
        this.cakeBuilder = cb;
    }

    public Cake getCake() {
        return this.cakeBuilder.getCake();
    }

    public void prepareCake() {
        cakeBuilder.prepareCake();
        cakeBuilder.addIngredients();
    }
}

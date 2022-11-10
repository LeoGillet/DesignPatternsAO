package org.boulangerie.observer;

public class ApricotPieFactory extends CakeFactory {
    private int cakesInStock = 0;

    @Override
    public Cake prepareCake() {
        this.cakesInStock++;
        return new GrilledAlmonds(new Meringue(new ApricotPie()));
    }

    public void sellCake() {
        this.cakesInStock--;
    }
}

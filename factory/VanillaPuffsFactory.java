package org.boulangerie.factory;

public class VanillaPuffsFactory extends CakeFactory {
    @Override
    public Cake prepareCake() {
        return new GrilledAlmonds(new WhippedCream(new VanillaPuffs()));
    }
}

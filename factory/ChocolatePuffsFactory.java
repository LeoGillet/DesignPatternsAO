package org.boulangerie.factory;

public class ChocolatePuffsFactory extends CakeFactory {
    @Override
    public Cake prepareCake() {
        return new Peanuts(new ChocolatePuffs());
    }
}

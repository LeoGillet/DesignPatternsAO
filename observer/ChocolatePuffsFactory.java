package org.boulangerie.observer;

public class ChocolatePuffsFactory extends CakeFactory {
    @Override
    public Cake prepareCake() {
        return new Peanuts(new ChocolatePuffs());
    }
}

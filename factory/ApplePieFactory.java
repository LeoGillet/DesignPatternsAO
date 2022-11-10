package org.boulangerie.factory;

public class ApplePieFactory extends CakeFactory {
    @Override
    public Cake prepareCake() {
        return new Peanuts(new Meringue(new ApplePie()));
    }
}

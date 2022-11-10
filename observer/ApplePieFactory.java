package org.boulangerie.observer;

public class ApplePieFactory extends CakeFactory {
    public ApplePieFactory() {
        super();
    }

    @Override
    public Cake prepareCake() {
        return new Peanuts(new Meringue(new ApplePie()));
    }
}

package org.boulangerie.factory;

public class ApricotPieFactory extends CakeFactory {
    @Override
    public Cake prepareCake() {
        return new GrilledAlmonds(new Meringue(new ApricotPie()));
    }
}

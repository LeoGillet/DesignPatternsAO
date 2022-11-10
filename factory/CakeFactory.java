package org.boulangerie.factory;

abstract class CakeFactory {
    public static CakeFactory prepareApplePie() {
        return new ApplePieFactory();
    }

    public static CakeFactory prepareApricotPie() {
        return new ApricotPieFactory();
    }

    public static CakeFactory prepareChocolatePuffs() {
        return new ChocolatePuffsFactory();
    }

    public static CakeFactory prepareVanillaPuffs() {
        return new VanillaPuffsFactory();
    }

    public abstract Cake prepareCake();
}

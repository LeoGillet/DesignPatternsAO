package org.boulangerie.observer;

import java.util.ArrayList;

abstract class CakeFactory {
    private final ArrayList<Seller> sellers;
    private final int minimumStock = 6;

    public CakeFactory() {
        sellers = new ArrayList<>();
    }

    public void addSeller(Seller seller) {
        sellers.add(seller);
    }

    public void removeSeller(Seller seller) {
        sellers.remove(seller);
    }

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

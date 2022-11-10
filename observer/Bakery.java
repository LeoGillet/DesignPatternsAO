package org.boulangerie.observer;

import java.util.ArrayList;

public class Bakery {
    private ArrayList<CakeFactory> cakeFactories = new ArrayList<>();

    public static void prepareACake(CakeFactory factory) {
        factory.prepareCake();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        CakeFactory factory = CakeFactory.prepareApricotPie();
        Cake cake = factory.prepareCake();
        System.out.println(cake.getDescription());
    }
}
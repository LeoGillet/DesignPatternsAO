package org.boulangerie.decoratorbuilder;

public class Bakery {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Baker baker = new Baker();
        CakeBuilder cncBuilder = new ChocolateNutsPuffsBuilder();
        CakeBuilder rappBuilder = new RoyalApplePieBuilder();
        CakeBuilder aprBuilder = new ApricotPieBuilder();
        CakeBuilder vccBuilder = new VanillaCreamPuffsBuilder();

        baker.setCakeBuilder(vccBuilder);
        baker.prepareCake();

        Cake cake = baker.getCake();
        System.out.println(cake.getDescription());
        System.out.println(cake.getCost());
    }
}
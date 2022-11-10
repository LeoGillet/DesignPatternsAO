package org.boulangerie.factory;

public class Bakery {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CakeFactory factory = CakeFactory.prepareApricotPie();
        Cake cake = factory.prepareCake();
        System.out.println(cake.getDescription());
    }
}
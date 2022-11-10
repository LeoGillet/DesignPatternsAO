package org.boulangerie.decorator;

public class Bakery {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cake simpleCake = new Peanuts(new GrilledAlmonds(new ChocolatePuffs()));
        System.out.println(simpleCake.getDescription());
        System.out.println(simpleCake.getCost());
    }
}
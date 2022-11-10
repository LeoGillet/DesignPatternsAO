package org.boulangerie.composite;

public class Bakery {
    public static void main(String[] args) {
        System.out.println("The bakery opens.");
        Baker baker = new Baker();
        baker.work();
    }
}
package org.boulangerie.composite;

public class Baker {
    Baker() { System.out.println("The Baker starts working."); }

    public void work() {
        Cake chocolateChoux = new ChocolatePuffs();
        Cake grilledAlmonds = new GrilledAlmonds();
        Cake peanuts = new Peanuts();

        CakeComposite cake = new CakeComposite();
        CakeComposite ingredients = new CakeComposite();

        cake.add(chocolateChoux);
        ingredients.add(grilledAlmonds);
        ingredients.add(peanuts);

        cake.add(ingredients);

        System.out.println(cake.getDescription());
    }
}

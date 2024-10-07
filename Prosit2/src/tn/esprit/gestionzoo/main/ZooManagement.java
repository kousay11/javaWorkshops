package tn.esprit.gestionzoo.main;

import java.util.Scanner;
import tn.esprit.gestionzoo.entities.*;
public class ZooManagement {
    private int nbrCages = 20;
    private String zooName = "my zoo";

    public ZooManagement() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("entrer le nombre des cages ");
        nbrCages = scanner.nextInt();

        scanner.nextLine();

        System.out.print("entrer le nom du tn.esprit.gestionzoo.entities.Zoo");
        zooName = scanner.nextLine();


    }

    public void displayMessage() {
        System.out.println(zooName + " comporte " + nbrCages + " cages ");

    }

    public static void main (String[] args) {

        ZooManagement zoo = new ZooManagement();
        zoo.displayMessage();


        Animal lion = new Animal();
        lion.name = "Simba";
        lion.setAge(8);
        lion.family = "Cats";
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.Setname( "Ariana Park");
        myZoo.city = "Ariana";
//        myZoo.nbrCages=25;
        myZoo.animals = new Animal[25];

        Zoo TheZoo = new Zoo();
        TheZoo.Setname( "Ghazela Park");
        TheZoo.city = "Ariana";
//        myZoo.nbrCages=25;
        TheZoo.animals = new Animal[25];

        Animal dog = new Animal("Caniche", "Snoopy", 2, true);
        Animal dog3 = new Animal("Caniche", "Snoopy", 2, true);
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(lion);
        System.out.println(lion.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));


        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        System.out.println(myZoo.searchAnimal(lion));
        Animal cat = new Animal("tigre", "sol", 2, true);
        System.out.println(myZoo.addAnimal(cat));
        System.out.println(myZoo.searchAnimal(cat));

        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();
        System.out.println(myZoo.isZooFull());

        System.out.println(TheZoo.addAnimal(dog3));
        Zoo zooAvecPlusAnimaux = Zoo.comparerZoo(TheZoo, myZoo);

        if (zooAvecPlusAnimaux == TheZoo) {
            System.out.println("Le tn.esprit.gestionzoo.entities.Zoo Thezoo a plus d'animaux ou le même nombre d'animaux.");
        } else {
            System.out.println("Le tn.esprit.gestionzoo.entities.Zoo myZoo a plus d'animaux.");
        }
        Aquatic aq = new Aquatic();
        aq.name = "Simba";
        aq.setAge(8);
        aq.family = "Cats";
        aq.isMammal = true;
        aq.habitat="zoo";
        Terrestrial tr = new Terrestrial();
        tr.name = "Simba";
        tr.setAge(8);
        tr.family = "Cats";
        tr.isMammal = true;
        tr.nbrLegs=10;
        Dolphin dl = new Dolphin();
        dl.name = "poisson";
        dl.setAge(5);
        dl.family = "fish";
        dl.isMammal = true;
        dl.habitat="sea";
        dl.swimmingSpeed=180.5f;
        Penguin pg = new Penguin();
        pg.name = "poisson";
        pg.setAge(5);
        pg.family = "fish";
        pg.isMammal = true;
        pg.habitat="sea";
        pg.swimmingDepth=1.8f;
        System.out.println(aq.toString());
        System.out.println(dl.toString());
        System.out.println(pg.toString());
        aq.swim();
        dl.swim();
        pg.swim();


    }

}
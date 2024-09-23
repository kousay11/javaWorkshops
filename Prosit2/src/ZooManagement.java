import java.util.Scanner;
public class ZooManagement {
    private int nbrCages = 20;
    private String zooName = "my zoo";

    public ZooManagement() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("entrer le nombre des cages ");
        nbrCages = scanner.nextInt();

        scanner.nextLine();

        System.out.print("entrer le nom du Zoo");
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
        lion.age = 8;
        lion.family = "Cats";
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "Ariana Park";
        myZoo.city = "Ariana";
//        myZoo.nbrCages=25;
        myZoo.animals = new Animal[25];

        Zoo TheZoo = new Zoo();
        TheZoo.name = "Ghazela Park";
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
            System.out.println("Le Zoo Thezoo a plus d'animaux ou le même nombre d'animaux.");
        } else {
            System.out.println("Le Zoo myZoo a plus d'animaux.");
        }


    }

}
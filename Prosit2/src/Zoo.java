public class Zoo
{
    public Animal[] animals;
    public String name;
    public String city;
    final int nbrCages = 25;
    int nbrAnimals;

    public Zoo() {
    }


    public Zoo(String name,String city, int nbrCages){

        this.name = name;
        this.city = city;
        this.animals = new Animal[25];
    }
    void displayZoo() {
        System.out.println("Nom: " + name + ", City: " + city + ", Nombres des cages: " + nbrCages);
    }
    boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (nbrAnimals == nbrCages)
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }
    int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.name == animals[i].name)
                return i;
        }
        return index;
    }
    public String toString() {
        return "Name: " + name + ", City: " + city + ", Nombres des cages: " +nbrCages;
    }
    boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            // Décaler les éléments suivants pour combler le trou
            for (int i = index; i < nbrAnimals - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[nbrAnimals - 1] = null; // Supprimer l'élément final qui est maintenant un doublon
            nbrAnimals--; // Décrémenter le compteur d'animaux
            return true; // Suppression réussie
        }
        return false; // L'animal n'a pas été trouvé
    }
    public boolean isZooFull() {

        int  animalCount= 0;
        for (Animal animal : animals) {
            if (animal != null) {
                animalCount++;
            }
        }
        return animalCount == nbrCages;
    }
    public  static Zoo comparerZoo(Zoo z1, Zoo z2) {
        int animalCountZ1 = 0;
        int animalCountZ2 = 0;

        for (Animal animal : z1.animals) {
            if (animal != null) {
                animalCountZ1++;
            }
        }

        for (Animal animal : z2.animals) {
            if (animal != null) {
                animalCountZ2++;
            }
        }

        if (animalCountZ1 > animalCountZ2) {
            return z1;
        } else if (animalCountZ2 > animalCountZ1) {
            return z2;
        } else {

            return z1;
        }
    }






}
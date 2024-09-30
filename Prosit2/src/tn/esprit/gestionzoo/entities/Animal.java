package tn.esprit.gestionzoo.entities;

public class Animal {
    public String family;
    public  String  name;
    private  int age;
    public boolean isMammal;
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public Animal(){

    }
    @Override // controler s'il y'a une erreur
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal Name: " + name + ", Family: " + family + ", Age: " + age + ", Is Mammal: " + isMammal;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age<0)
        {
            System.out.println("Invalid Age");
        }
        else
            this.age = age;
    }



}

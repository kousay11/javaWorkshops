public class Animal {
    public String family;
    public  String  name;
    public  int age;
    public boolean isMammal;
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public Animal(){

    }
    @Override
    public String toString() {
        return "Animal Name: " + name + ", Family: " + family + ", Age: " + age + ", Is Mammal: " + isMammal;
    }

}

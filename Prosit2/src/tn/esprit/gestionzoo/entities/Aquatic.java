package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal{
    public String habitat;
    Aquatic(String family, String name, int age, boolean isMammal,String habitat)
    {
        super(family,name,age,isMammal);
        this.habitat=habitat;
    }
    public Aquatic()
    {
        super();
    }

    public String toString()
    {
        return super.toString()+"habitat="+habitat;
    }
    public void swim()
    {
        System.out.println("Aquatic animal is swimming");
    }




}

package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    public float swimmingDepth;
    Penguin(String family, String name, int age, boolean isMammal,String habitat,float swimmingDepth)
    {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    public Penguin()
    {
        super();
    }
    public String toString()
    {
        return super.toString()+"swimmingDepth="+swimmingDepth;
    }
}

package exercise06charmgarciachristian;

/**
 *
 * @author Christian Brandon
 */
public class GrassType extends Monster {
    public GrassType(String n, int m, int base) {
        super(n, "grass", "water" , "fire", m, base);
    }
    
    @Override
    public void rest() {
        hp += maxHP * 0.5;
        if (hp > maxHP) hp = maxHP;
        System.out.println(name + " rested. It's health is now " + hp + ".");
    }
    
    @Override
    public void special() {
        hp += maxHP * 0.2;
        if (hp > maxHP) hp = maxHP;
        System.out.println(name + " used its special!");
        System.out.println("Health restored to " + hp + ".");
    }
}
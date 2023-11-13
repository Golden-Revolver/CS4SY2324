package exercise07charmgarciachristian;

/**
 *
 * @author Christian Brandon
 */
public class WaterType extends Monster {
    public WaterType(String n, int m, int base) {
        super(n, "water", "fire", "grass", m, base);
        atk = (int) (base * 0.7);
        def = (int) (base * 1.3);
    }
    
    @Override
    public void special() {
        defBoost += 2;
        hp -= maxHP * 0.1;
        System.out.println(name + " used its special!");
        System.out.println("Defense increased by 2. Health reduced to " + hp + ".");
    }
}
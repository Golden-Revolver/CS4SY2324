package exercise07charmgarciachristian;

/**
 *
 * @author Christian Brandon
 */
public class FireType extends Monster {    
    public FireType(String n, int m, int base) {
        super(n, "fire", "grass", "water", m, base);
        atk = (int) (base * 1.3);
        def = (int) (base * 0.7);
    }
    
    @Override
    public void special() {
        atkBoost += 2;
        hp -= maxHP * 0.1;
        System.out.println(name + " used its special!");
        System.out.println("Attack increased by 2. Health reduced to " + hp + ".");
    }
}
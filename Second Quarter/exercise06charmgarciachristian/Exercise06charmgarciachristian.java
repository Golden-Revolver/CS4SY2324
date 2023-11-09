package exercise06charmgarciachristian;

/**
 *
 * @author Christian Brandon
 */
public class Exercise06charmgarciachristian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FireType charmander = new FireType("Charmander", 39, 20);
        GrassType bulbasaur = new GrassType("Bulbasaur", 45, 20);
        WaterType squirtle = new WaterType("Squirtle", 44, 20);
        
        Monster.battle(charmander, bulbasaur);
        Monster.battle(charmander, squirtle);
        Monster.battle(bulbasaur, squirtle);
    }
}
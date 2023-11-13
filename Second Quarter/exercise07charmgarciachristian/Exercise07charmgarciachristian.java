package exercise07charmgarciachristian;

/**
 *
 * @author Christian Brandon
 */
public class Exercise07charmgarciachristian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trainer gold = new Trainer("Gold");
        Monster charmander = new FireType("Charmander", 39, 20);
        NPC red = new NPC("Red", "Would you like to battle?");
        Location lavenderTown = new Location("Lavender Town", "fried ghost");
        
        gold.inspect(charmander);
        gold.inspect(red);
        gold.inspect(lavenderTown);
    }    
}
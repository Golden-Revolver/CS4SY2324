package exercise07charmgarciachristian;

/**
 *
 * @author Christian Brandon
 */
public abstract class Character {
    protected String name;
    protected Location currentLocation;

    protected Character(String n){
        this.name = n;
        this.currentLocation = null;
    }
    protected Character(String n, Location l){
        this.name = n;
        this.currentLocation = l;
    }

    public String getName(){
        return name;
    }
    public Location getCurrentLocation(){
        return currentLocation;
    }
    public void travel(Location destination){
        currentLocation.removePerson(this);
        destination.addPerson(this);
        currentLocation = destination;
        System.out.println(this.getName() + " travelled to " + destination.getName() + ".");
    }
}


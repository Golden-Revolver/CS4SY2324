package cs4q1ec;
import java.util.*;
/**
 *
 * @author Christian Brandon
 */
public class Assignment {
    private String name;
    private double timeAlloted;
    
    public Assignment(String name, double timeAlloted) {
        this.name = name;
        this.timeAlloted = timeAlloted;
    }
    
    // getter methods
    public String getName() {
        return name;
    }
    
    public double getTimeAlloted() {
        return timeAlloted;
    }
    
    // setter methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setTimeAlloted(double timeAlloted) {
        this.timeAlloted = timeAlloted;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
